package ke.co.rhino.web;

import ke.co.rhino.entity.PolicyBenefit;
import ke.co.rhino.repo.PolicyBenefitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by anthony.kipkoech on 1/23/2017.
 */
@RestController
@RequestMapping("/policybenefit")
public class PolicyBenefitHandler  {

    @Autowired
    private PolicyBenefitRepo repo;

    @GetMapping(value = ("/findByCorpAndAnniv"), produces = "application/json")
    @ResponseBody
    public List<PolicyBenefit> getByCorpAndAnniv(
            @RequestParam(value = "corp_id") String corpIdStr,
            @RequestParam(value = "anniv") String annivStr
    ){
        int corp_id = Integer.valueOf(corpIdStr);
        int anniv = Integer.valueOf(annivStr);
        List<PolicyBenefit> policyBenefits = repo.findByCorpIdAndAnniv(corp_id,anniv);
        return policyBenefits;
    }

    @GetMapping(value = ("/findByCorp"), produces = "application/json")
    @ResponseBody
    public List<PolicyBenefit> findByCorp(@RequestParam(value = "corp_id") String corpIdStr){
        int corp_id = Integer.valueOf(corpIdStr);
        List<PolicyBenefit> policyBenefits = repo.findByCorpId(corp_id);
        return policyBenefits;
    }

}

package ke.co.rhino.web;

import ke.co.rhino.entity.PolicyPeriod;
import ke.co.rhino.repo.PolicyPeriodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by anthony.kipkoech on 1/15/2017.
 */
@RestController
@RequestMapping("/policyperiod")
public class PolicyPeriodHandler {

    @Autowired
    private PolicyPeriodRepo policyPeriodRepo;

    @GetMapping(value = ("/getAll"), produces = "application/json")
    @ResponseBody
    public List<PolicyPeriod> getPolicy(){
        List<PolicyPeriod> periods = policyPeriodRepo.findAll();
        return periods;
    }

    @GetMapping(value = ("/findAll"), produces = "application/json")
    @ResponseBody
    public List<PolicyPeriod> findAll(/*@RequestParam("id") String policyIdStr*/){

        //int policyId = Integer.valueOf(policyIdStr);
        List<PolicyPeriod> periods = policyPeriodRepo.findAll();
        return periods;
    }

    @GetMapping(value = ("/findByCorporate"), produces = "application/json")
    @ResponseBody
    public List<PolicyPeriod> getById(@RequestParam("id") String policyIdStr){

        int policyId = Integer.valueOf(policyIdStr);
        List<PolicyPeriod> periods = policyPeriodRepo.findByCorpId(policyId);
        return periods;
    }

}

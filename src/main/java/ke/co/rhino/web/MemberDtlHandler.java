package ke.co.rhino.web;

import ke.co.rhino.entity.MemberDtl;
import ke.co.rhino.repo.MemberDtlRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by anthony.kipkoech on 1/23/2017.
 */
@RestController
@RequestMapping("/memberdtl")
public class MemberDtlHandler {

    @Autowired
    private MemberDtlRepo repo;

    @GetMapping(value = ("/findByCorpId"), produces = "application/json")
    @ResponseBody
    public List<MemberDtl> findByCorpId(@RequestParam(value = "corp_id") String corpIdStr){

        int corpId = Integer.getInteger(corpIdStr);

        List<MemberDtl> memberDtls = repo.getByCorpId(corpId);
        return memberDtls;
    }

    @GetMapping(value = ("/findByEmpNo"), produces = "application/json")
    @ResponseBody
    public List<MemberDtl> findByEmpNoLike(@RequestParam(value = "emp_no") String empNo){

        List<MemberDtl> memberDtls = repo.getByEmploymentNoLike(empNo);
        return memberDtls;

    }

    @GetMapping(value = ("/findByCorpAndAnniv"), produces = "application/json")
    @ResponseBody
    public List<MemberDtl> findByCorpAndAnniv(@RequestParam(value = "corp_id") String corpIdStr,
                                              @RequestParam(value = "anniv") String annivStr){


        int corpId = Integer.valueOf(corpIdStr);
        int anniv = Integer.valueOf(annivStr);

        List<MemberDtl> memberDtls = repo.getByCorpIdAndAnniv(corpId,anniv);
        //List<MemberDtl> memberDtls = repo.getByCorpId(Integer.getInteger(corpIdStr));
        return memberDtls;
    }

    @GetMapping(value = ("/findPrincipalsByCorpAndAnniv"), produces = "application/json")
    @ResponseBody
    public List<MemberDtl> findPrincipalsByCorpAndAnniv(@RequestParam(value = "corp_id") String corpIdStr,
                                                        @RequestParam(value = "anniv") String annivStr){


        int corpId = Integer.valueOf(corpIdStr);
        int anniv = Integer.valueOf(annivStr);

        List<MemberDtl> memberDtls = repo.getPrincipalsByCorpIdAndAnniv(corpId,anniv);
        //List<MemberDtl> memberDtls = repo.getByCorpId(Integer.getInteger(corpIdStr));
        return memberDtls;
    }

    @GetMapping(value = ("/findDependants"), produces = "application/json")
    @ResponseBody
    public List<MemberDtl> findDependants(@RequestParam(value = "corp_id") String corpIdStr,
                                          @RequestParam(value = "anniv") String annivStr,
                                          @RequestParam(value = "familyNo") String familyNo){

        int corpId = Integer.valueOf(corpIdStr);
        int anniv = Integer.valueOf(annivStr);

        List<MemberDtl> memberDtls = repo.getDependants(corpId,anniv,familyNo);
        return memberDtls;

    }

}

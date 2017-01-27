package ke.co.rhino.web;

import jdk.nashorn.internal.parser.JSONParser;
import ke.co.rhino.entity.PolicyDtl;
import ke.co.rhino.repo.PolicyDtlRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * Created by anthony.kipkoech on 1/13/2017.
 */
@RestController
@RequestMapping("/policydtl")
public class PolicyHandler {

    @Autowired
    private PolicyDtlRepo policyDtlRepo;

    @GetMapping(value = ("/findAll"), produces = "application/json")
    @ResponseBody
    public List<PolicyDtl> getPolicy(){
        List<PolicyDtl> dtls = policyDtlRepo.findAll();
        return dtls;
    }

    @GetMapping(value = ("/findOne"), produces = "application/json")
    @ResponseBody
    public PolicyDtl getById(@RequestParam("id") String policyIdStr){

        int policyId = Integer.valueOf(policyIdStr);
        PolicyDtl policyDtl = policyDtlRepo.findByCorpId(policyId);
        return policyDtl;
    }

}

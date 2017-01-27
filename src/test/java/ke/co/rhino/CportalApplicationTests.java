package ke.co.rhino;

import ke.co.rhino.entity.PolicyBenefit;
import ke.co.rhino.entity.PolicyDtl;
import ke.co.rhino.entity.PolicyPeriod;
import ke.co.rhino.repo.PolicyBenefitRepo;
import ke.co.rhino.repo.PolicyDtlRepo;
import ke.co.rhino.repo.PolicyPeriodRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.matchers.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
//@SpringBootConfiguration(CportalApplication.class)
public class CportalApplicationTests {

	@Autowired
	private PolicyDtlRepo policyDtlRepo;

    @Autowired
    private PolicyPeriodRepo policyPeriodRepo;

    @Autowired
    private PolicyBenefitRepo policyBenefitRepo;

	@Test
    public void findAllPolicies(){
        List<PolicyDtl> policyDtls = policyDtlRepo.findAll();
        assert !policyDtls.isEmpty();
    }

    @Test
    public void findByCorpId(){
        PolicyDtl policyDtl = policyDtlRepo.findByCorpId(10);
        assert policyDtl != null;
    }

    @Test
    public void findPeriodsByCorporate(){
        List<PolicyPeriod> policyPeriods = policyPeriodRepo.findByCorpId(200);
        assert !policyPeriods.isEmpty();
    }

    @Test
    public void findBenefitsByCorpAndAnniv(){
        List<PolicyBenefit> policyBenefits = policyBenefitRepo.findByCorpIdAndAnniv(500,1);
        assert !policyBenefits.isEmpty();
    }

    @Test
	public void contextLoads() {
	}

}

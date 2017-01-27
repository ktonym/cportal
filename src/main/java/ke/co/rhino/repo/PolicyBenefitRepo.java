package ke.co.rhino.repo;

import ke.co.rhino.entity.PolicyBenefit;
import ke.co.rhino.entity.PolicyBenefitRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by anthony.kipkoech on 1/13/2017.
 */
@Repository
public class PolicyBenefitRepo {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    public List<PolicyBenefit> findAll(){
        return jdbcTemplate.query("select anniv, category, (select benefit from benefit where code = a.benefit) benefit, \n" +
                "(select benefit from benefit where code = a.sub_limit_of) parent_benefit, a.limit lim, (select sharing from benefit_sharing where code = a.sharing) sharing, waiting_period \n" +
                "from corp_groups a", new PolicyBenefitRowMapper());
    }

    @Transactional(readOnly = true)
    public List<PolicyBenefit> findByCorpId(int id){
        return jdbcTemplate.query("select anniv, category, (select benefit from benefit where code = a.benefit) benefit, \n" +
                "(select benefit from benefit where code = a.sub_limit_of) parent_benefit, a.limit lim, (select sharing from benefit_sharing where code = a.sharing) sharing, waiting_period \n" +
                "from corp_groups a where corp_id = ?", new Object[]{id}, new PolicyBenefitRowMapper());
    }

    @Transactional(readOnly = true)
    public List<PolicyBenefit> findByCorpIdAndAnniv(int id, int anniv){
        return jdbcTemplate.query("select anniv, category, (select benefit from benefit where code = a.benefit) benefit, \n" +
                "(select benefit from benefit where code = a.sub_limit_of) parent_benefit , a.limit lim, " +
                "(select sharing from benefit_sharing where code = a.sharing) sharing , waiting_period \n" +
                "from corp_groups a where corp_id = ? and anniv = ?", new Object[]{id,anniv}, new PolicyBenefitRowMapper());
    }


}

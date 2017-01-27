package ke.co.rhino.repo;

import ke.co.rhino.entity.PolicyPeriod;
import ke.co.rhino.entity.PolicyPeriodRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by anthony.kipkoech on 1/13/2017.
 */
@Repository
public class PolicyPeriodRepo {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    public List<PolicyPeriod> findAll(){
        return jdbcTemplate.query("select corp_id, start_date, end_date, renewal_date, (select agent_name from agent where agent_id = a.agent_id), anniv from corp_anniversary a",
                new PolicyPeriodRowMapper());
    }

    @Transactional(readOnly = true)
    public List<PolicyPeriod> findByCorpId(int id){
        return jdbcTemplate.query("select corp_id, start_date, end_date, renewal_date, (select agent_name from agent where agent_id = a.agent_id), anniv \n" +
                "from corp_anniversary a where corp_id = ?", new Object[]{id}, new PolicyPeriodRowMapper());
    }


}

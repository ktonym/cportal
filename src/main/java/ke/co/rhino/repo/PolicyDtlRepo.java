package ke.co.rhino.repo;

import ke.co.rhino.entity.PolicyDtl;
import ke.co.rhino.entity.PolicyDtlRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by anthony.kipkoech on 1/13/2017.
 */
@Repository
public class PolicyDtlRepo {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    public List<PolicyDtl> findAll(){
        return jdbcTemplate.query("select corp_id, policy_no, corporate, tel_no, fax_no, postal_add, corp_pin, (select name from town where code = corporate.town) town\n" +
                "from corporate", new PolicyDtlRowMapper());
    }

    @Transactional(readOnly = true)
    public PolicyDtl findByCorpId(int id){
        return jdbcTemplate.queryForObject("select corp_id, policy_no, corporate, tel_no, fax_no, postal_add, corp_pin, (select name from town where code = corporate.town) town\n" +
                "from corporate where corp_id = ?", new Object[]{id}, new PolicyDtlRowMapper());
    }

}

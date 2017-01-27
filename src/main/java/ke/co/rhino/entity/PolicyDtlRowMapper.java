package ke.co.rhino.entity;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by anthony.kipkoech on 1/13/2017.
 */
public class PolicyDtlRowMapper implements RowMapper<PolicyDtl>{

    @Override
    public PolicyDtl mapRow(ResultSet rs, int i) throws SQLException {

        PolicyDtl policyDtl = new PolicyDtl();
        policyDtl.setCorp_id(rs.getLong("corp_id"));
        policyDtl.setCorp_pin(rs.getString("corp_pin"));
        policyDtl.setCorporate(rs.getString("corporate"));
        policyDtl.setFax_no(rs.getString("fax_no"));
        policyDtl.setPolicy_no(rs.getString("policy_no"));
        policyDtl.setPostal_add(rs.getString("postal_add"));
        policyDtl.setTel_no(rs.getString("tel_no"));
        policyDtl.setTown(rs.getString("town"));

        return policyDtl;
    }
}
package ke.co.rhino.entity;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by anthony.kipkoech on 1/13/2017.
 */
public class PolicyBenefitRowMapper implements RowMapper<PolicyBenefit> {
    @Override
    public PolicyBenefit mapRow(ResultSet rs, int i) throws SQLException {

        PolicyBenefit benefit = new PolicyBenefit();

        benefit.setAnniv(rs.getLong("anniv"));
        benefit.setBenefit(rs.getString("benefit"));
        benefit.setCategory(rs.getString("category"));
        benefit.setLimit(rs.getLong("lim"));
        benefit.setParent_benefit(rs.getString("parent_benefit"));
        benefit.setSharing(rs.getString("sharing"));
        benefit.setWaiting_period(rs.getLong("waiting_period"));

        return benefit;
    }
}

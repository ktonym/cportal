package ke.co.rhino.entity;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by anthony.kipkoech on 1/13/2017.
 */
public class PolicyPeriodRowMapper implements RowMapper<PolicyPeriod> {
    @Override
    public PolicyPeriod mapRow(ResultSet rs, int i) throws SQLException {

        PolicyPeriod period = new PolicyPeriod();

        period.setAgent_name(rs.getString("agent_name"));
        period.setAnniv(rs.getLong("anniv"));
        period.setStart_date(rs.getDate("start_date"));
        period.setEnd_date(rs.getDate("end_date"));
        period.setRenewal_date(rs.getDate("renewal_date"));
        period.setCorp_id(rs.getLong("corp_id"));

        return period;
    }
}

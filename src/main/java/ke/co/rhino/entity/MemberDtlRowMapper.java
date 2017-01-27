package ke.co.rhino.entity;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by anthony.kipkoech on 1/23/2017.
 */
public class MemberDtlRowMapper implements RowMapper<MemberDtl> {


    @Override
    public MemberDtl mapRow(ResultSet rs, int i) throws SQLException {

        MemberDtl memberDtl = new MemberDtl();
        memberDtl.setMember_no(rs.getString("member_no"));
        memberDtl.setFamily_no(rs.getString("family_no"));
        memberDtl.setCorp_id(rs.getLong("corp_id"));
        memberDtl.setSurname(rs.getString("surname"));
        memberDtl.setFirst_name(rs.getString("first_name"));
        memberDtl.setOther_names(rs.getString("other_names"));
        memberDtl.setDob(rs.getDate("dob"));
        memberDtl.setGender(rs.getLong("gender"));
        memberDtl.setUser_id(rs.getString("user_id"));
        memberDtl.setDate_entered(rs.getDate("date_entered"));
        memberDtl.setRelation_to_principal(rs.getLong("relation_to_principal"));
        memberDtl.setFamily_size(rs.getLong("family_size"));
        memberDtl.setEmployment_no(rs.getString("employment_no"));
        memberDtl.setFamily_title(rs.getLong("family_title"));
        memberDtl.setPhoto_n_form(rs.getLong("photo_n_form"));
        memberDtl.setApp_form_date(rs.getDate("app_form_date"));
        memberDtl.setInfo_to_printer(rs.getDate("info_to_printer"));
        return memberDtl;
    }
}

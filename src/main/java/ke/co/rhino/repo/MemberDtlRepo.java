package ke.co.rhino.repo;

import ke.co.rhino.entity.MemberDtl;
import ke.co.rhino.entity.MemberDtlRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by anthony.kipkoech on 1/23/2017.
 */
@Repository
public class MemberDtlRepo {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    public List<MemberDtl> getByFamilyNo(String familyNo){
        return jdbcTemplate.query("select member_no, family_no, corp_id, surname, first_name, other_names, " +
                "dob, gender, user_id, date_entered,relation_to_principal, family_size, " +
                "employment_no, family_title, photo_n_form, app_form_date, info_to_printer " +
                "from member_info where family_no = ?", new Object[]{familyNo}, new MemberDtlRowMapper());
    }

    @Transactional(readOnly = true)
    public MemberDtl getByMemberNo(String memberNo){
        return jdbcTemplate.queryForObject("select member_no, family_no, corp_id, surname, first_name, other_names, " +
                "dob, gender, user_id, date_entered,relation_to_principal, family_size, " +
                "employment_no, family_title, photo_n_form, app_form_date, info_to_printer " +
                "from member_info where member_no = ?", new Object[]{memberNo}, new MemberDtlRowMapper());
    }

    @Transactional(readOnly = true)
    public List<MemberDtl> getByEmploymentNoLike(String empNo){
        String searchStr = "%".concat(empNo).concat("%");
        return jdbcTemplate.query("SELECT member_no, family_no, corp_id, surname, first_name, other_names, " +
                "dob, gender, user_id, date_entered,relation_to_principal, family_size, " +
                "employment_no, family_title, photo_n_form, app_form_date, info_to_printer " +
                "FROM member_info WHERE employment_no LIKE ?", new Object[]{searchStr}, new MemberDtlRowMapper());
    }

    @Transactional(readOnly = true)
    public List<MemberDtl> getByCorpId(int corpId){
        return jdbcTemplate.query("select member_no, family_no, corp_id, surname, first_name, other_names, " +
                "dob, gender, user_id, date_entered,relation_to_principal, family_size, " +
                "employment_no, family_title, photo_n_form, app_form_date, info_to_printer " +
                "from member_info where corp_id = ?", new Object[]{corpId}, new MemberDtlRowMapper());
    }

    public List<MemberDtl> getByCorpIdAndAnniv(int corpId, int anniv) {

        return jdbcTemplate.query("SELECT m.member_no, family_no, m.corp_id, m.surname, m.first_name, m.other_names, " +
                "m.dob, m.gender, m.user_id, m.date_entered, m.relation_to_principal, m.family_size, " +
                "m.employment_no, m.family_title, m.photo_n_form, m.app_form_date, m.info_to_printer " +
                "FROM member_info m,member_anniversary ma " +
                        "WHERE m.member_no=ma.member_no " +
                        "AND m.corp_id = ? AND ma.anniv = ?",
                new Object[]{corpId, anniv}, new MemberDtlRowMapper());

    }

    public List<MemberDtl> getPrincipalsByCorpIdAndAnniv(int corpId, int anniv){
        return jdbcTemplate.query("SELECT m.member_no, family_no, m.corp_id, m.surname, m.first_name, m.other_names, " +
                        "m.dob, m.gender, m.user_id, m.date_entered, m.relation_to_principal, m.family_size, " +
                        "m.employment_no, m.family_title, m.photo_n_form, m.app_form_date, m.info_to_printer " +
                        "FROM member_info m,member_anniversary ma " +
                        "WHERE m.member_no=ma.member_no AND m.member_no LIKE '%/00' " +
                        "AND m.corp_id = ? AND ma.anniv = ?",
                new Object[]{corpId, anniv}, new MemberDtlRowMapper());
    }

    public List<MemberDtl> getDependants(int corpId, int anniv, String familyNo){
        return jdbcTemplate.query("SELECT m.member_no, family_no, m.corp_id, m.surname, m.first_name, m.other_names, " +
                        "m.dob, m.gender, m.user_id, m.date_entered, m.relation_to_principal, m.family_size, " +
                        "m.employment_no, m.family_title, m.photo_n_form, m.app_form_date, m.info_to_printer " +
                        "FROM member_info m,member_anniversary ma " +
                        "WHERE m.member_no=ma.member_no AND m.member_no NOT LIKE '%/00' " +
                        "AND m.corp_id = ? AND ma.anniv = ? AND m.family_no = ?",
                new Object[]{corpId, anniv, familyNo}, new MemberDtlRowMapper());
    }


}

package ke.co.rhino.entity;

import java.sql.Date;

/**
 * Created by anthony.kipkoech on 1/23/2017.
 */
public class MemberDtl {

    private String member_no;
    private String family_no;
    private Long   corp_id;
    private String surname;
    private String first_name;
    private String other_names;
    private Date   dob;
    private Long gender;
    private String user_id;
    private Date   date_entered;
    private Long relation_to_principal;
    private Long family_size;
    private String employment_no;
    private Long family_title;
    private Long photo_n_form;
    private Date   app_form_date;
    private Date info_to_printer;

    public MemberDtl() {
    }

    public String getMember_no() {
        return member_no;
    }

    public void setMember_no(String member_no) {
        this.member_no = member_no;
    }

    public String getFamily_no() {
        return family_no;
    }

    public void setFamily_no(String family_no) {
        this.family_no = family_no;
    }

    public Long getCorp_id() {
        return corp_id;
    }

    public void setCorp_id(Long corp_id) {
        this.corp_id = corp_id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getOther_names() {
        return other_names;
    }

    public void setOther_names(String other_names) {
        this.other_names = other_names;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Long getGender() {
        return gender;
    }

    public void setGender(Long gender) {
        this.gender = gender;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Date getDate_entered() {
        return date_entered;
    }

    public void setDate_entered(Date date_entered) {
        this.date_entered = date_entered;
    }

    public Long getRelation_to_principal() {
        return relation_to_principal;
    }

    public void setRelation_to_principal(Long relation_to_principal) {
        this.relation_to_principal = relation_to_principal;
    }

    public Long getFamily_size() {
        return family_size;
    }

    public void setFamily_size(Long family_size) {
        this.family_size = family_size;
    }

    public String getEmployment_no() {
        return employment_no;
    }

    public void setEmployment_no(String employment_no) {
        this.employment_no = employment_no;
    }

    public Long getFamily_title() {
        return family_title;
    }

    public void setFamily_title(Long family_title) {
        this.family_title = family_title;
    }

    public Long getPhoto_n_form() {
        return photo_n_form;
    }

    public void setPhoto_n_form(Long photo_n_form) {
        this.photo_n_form = photo_n_form;
    }

    public Date getApp_form_date() {
        return app_form_date;
    }

    public void setApp_form_date(Date app_form_date) {
        this.app_form_date = app_form_date;
    }

    public Date getInfo_to_printer() {
        return info_to_printer;
    }

    public void setInfo_to_printer(Date info_to_printer) {
        this.info_to_printer = info_to_printer;
    }
}

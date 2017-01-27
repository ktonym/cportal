package ke.co.rhino.entity;

/**
 * Created by anthony.kipkoech on 1/13/2017.
 */
public class PolicyDtl {

    private Long corp_id;
    private String policy_no;
    private String corporate;
    private String tel_no;
    private String fax_no;
    private String postal_add;
    private String corp_pin;
    private String town;


    public PolicyDtl() {
    }

    public Long getCorp_id() {
        return corp_id;
    }

    public void setCorp_id(Long corp_id) {
        this.corp_id = corp_id;
    }

    public String getPolicy_no() {
        return policy_no;
    }

    public void setPolicy_no(String policy_no) {
        this.policy_no = policy_no;
    }

    public String getCorporate() {
        return corporate;
    }

    public void setCorporate(String corporate) {
        this.corporate = corporate;
    }

    public String getTel_no() {
        return tel_no;
    }

    public void setTel_no(String tel_no) {
        this.tel_no = tel_no;
    }

    public String getFax_no() {
        return fax_no;
    }

    public void setFax_no(String fax_no) {
        this.fax_no = fax_no;
    }

    public String getPostal_add() {
        return postal_add;
    }

    public void setPostal_add(String postal_add) {
        this.postal_add = postal_add;
    }

    public String getCorp_pin() {
        return corp_pin;
    }

    public void setCorp_pin(String corp_pin) {
        this.corp_pin = corp_pin;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}

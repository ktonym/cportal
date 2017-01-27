package ke.co.rhino.entity;

import java.sql.Date;
import java.time.LocalDate;

/**
 * Created by anthony.kipkoech on 1/13/2017.
 */
public class PolicyPeriod {

    private Date start_date, end_date, renewal_date;
    private String agent_name;
    private Long anniv;
    private Long corp_id;

    public PolicyPeriod() {
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Date getRenewal_date() {
        return renewal_date;
    }

    public void setRenewal_date(Date renewal_date) {
        this.renewal_date = renewal_date;
    }

    public String getAgent_name() {
        return agent_name;
    }

    public void setAgent_name(String agent_name) {
        this.agent_name = agent_name;
    }

    public Long getAnniv() {
        return anniv;
    }

    public void setAnniv(Long anniv) {
        this.anniv = anniv;
    }

    public Long getCorp_id(){
        return corp_id;
    }

    public void setCorp_id(long corp_id) {
        this.corp_id = corp_id;
    }
}

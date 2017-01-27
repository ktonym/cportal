package ke.co.rhino.entity;

/**
 * Created by anthony.kipkoech on 1/13/2017.
 */
public class PolicyBenefit {

    private Long anniv;
    private String category, benefit, parent_benefit;
    private Long limit,waiting_period;
    private String sharing;

    public PolicyBenefit() {
    }

    public Long getAnniv() {
        return anniv;
    }

    public void setAnniv(Long anniv) {
        this.anniv = anniv;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }

    public String getParent_benefit() {
        return parent_benefit;
    }

    public void setParent_benefit(String parent_benefit) {
        this.parent_benefit = parent_benefit;
    }

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public String getSharing() {
        return sharing;
    }

    public void setSharing(String sharing) {
        this.sharing = sharing;
    }

    public Long getWaiting_period() {
        return waiting_period;
    }

    public void setWaiting_period(Long waiting_period) {
        this.waiting_period = waiting_period;
    }
}

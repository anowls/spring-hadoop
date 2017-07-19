package org.anowls.model;

import java.io.Serializable;

/**
 * Created by anowls on 2017/7/13.
 */
public class ChargeModel extends BaseModel implements Serializable {

    private String userId;
    private String chargeTime;
    private String amount;

    private String logType = "charge";

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getChargeTime() {
        return chargeTime;
    }

    public void setChargeTime(String chargeTime) {
        this.chargeTime = chargeTime;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}

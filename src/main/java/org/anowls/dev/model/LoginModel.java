package org.anowls.dev.model;

import java.io.Serializable;

/**
 * Created by anowls on 2017/7/13.
 */
public class LoginModel extends BaseModel implements Serializable {

    private String loginTime;
    private String userId;

    private String logType = "login";

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}

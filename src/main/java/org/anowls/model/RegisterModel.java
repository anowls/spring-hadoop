package org.anowls.model;

import java.io.Serializable;

/**
 * Created by anowls on 2017/7/13.
 */
public class RegisterModel extends BaseModel implements Serializable {

    private String deviceId;
    private String registerTime;
    private String userId;

    private String logType = "register";

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}

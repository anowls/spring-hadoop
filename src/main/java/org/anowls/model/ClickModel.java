package org.anowls.model;

import java.io.Serializable;

/**
 * Created by anowls on 2017/7/13.
 */
public class ClickModel extends BaseModel implements Serializable {

    private String platform;
    private String deviceId;
    private String clickTime;
    private String os;
    private String ip;

    private String logType = "click";

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getClickTime() {
        return clickTime;
    }

    public void setClickTime(String clickTime) {
        this.clickTime = clickTime;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}

package org.anowls.dev.model;

/**
 * Created by anowls on 2017/7/13.
 */
public class BaseModel {

    private String appId;
    private String logType;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }
}

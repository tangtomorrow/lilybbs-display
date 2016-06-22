package org.tym.entity;

import java.sql.Timestamp;

/**
 * Created by tangtomorrow on 16/6/19.
 */
public class LoginInfo {
    private String userId;
    private Timestamp loginTime;
    private String loginIp;
    private Timestamp createTime;

    public LoginInfo() {
    }

    public LoginInfo(String userId, Timestamp loginTime, String loginIp) {
        this.userId = userId;
        this.loginTime = loginTime;
        this.loginIp = loginIp;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Timestamp getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Timestamp loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    @Override
    public String toString() {
        return "LoginInfo{" +
                ", userId='" + userId + '\'' +
                ", loginTime='" + loginTime + '\'' +
                ", loginIp='" + loginIp + '\'' +
                '}';
    }
}

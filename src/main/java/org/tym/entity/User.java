package org.tym.entity;

import java.sql.Timestamp;

/**
 * Created by tangtomorrow on 16/6/19.
 */
public class User {
    private int id;
    private String userId; // ID
    private String userName; // 昵称
    private int loginTimes; // 上站次数
    private int postArticles; // 发表文章数
    private String title; // 站内职务，可能为null

    private String constellation; // 星座，可能为null
    private Timestamp lastLoginTime; // 上次上站时间戳
    private String lastLoginIp; // 上次上站IP，可能IP，也可能*.nju.edu.cn

    private int experience; // 经验值，可能为“不告诉你”。上述情况分别处理成准确数字和－1
    private int performance; // 表现值
    private int life; // 生命力

    private String moderators; // 担任版主的版面（使用,隔开）

    private boolean exist;  // 用户是否存在(有没有失效)

    private Timestamp createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getLoginTimes() {
        return loginTimes;
    }

    public void setLoginTimes(int loginTimes) {
        this.loginTimes = loginTimes;
    }

    public int getPostArticles() {
        return postArticles;
    }

    public void setPostArticles(int postArticles) {
        this.postArticles = postArticles;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public Timestamp getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getModerators() {
        return moderators;
    }

    public void setModerators(String moderators) {
        this.moderators = moderators;
    }

    public boolean isExist() {
        return exist;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", loginTimes=" + loginTimes +
                ", postArticles=" + postArticles +
                ", title='" + title + '\'' +
                ", constellation='" + constellation + '\'' +
                ", lastLoginTime=" + lastLoginTime +
                ", lastLoginIp='" + lastLoginIp + '\'' +
                ", experience=" + experience +
                ", performance=" + performance +
                ", life=" + life +
                ", moderators='" + moderators + '\'' +
                ", exist=" + exist +
                ", createTime=" + createTime +
                '}';
    }

    public static final int UnToldExperience = -1; // “不告诉你”的经验值，默认－1
}

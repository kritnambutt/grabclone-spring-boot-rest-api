package com.kritnambutt.grabclone.dbmodel;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_account")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String tel;

    @Column(unique = true)
    private String facebookId;

    @Column(unique = true)
    private String googleId;

    @Column(unique = true)
    private String appleId;

    private String verifyStatus;

    private String userLevel;

    private String profileImg;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_dt")
    private Date createDt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_dt")
    private Date updateDt;

    public User() {

    }

    public User(String name, String email, String tel, String facebookId, String googleId, String appleId, String verifyStatus, String userLevel, String profileImg) {
        this.name = name;
        this.email = email;
        this.tel = tel;
        this.facebookId = facebookId;
        this.googleId = googleId;
        this.appleId = appleId;
        this.verifyStatus = verifyStatus;
        this.userLevel = userLevel;
        this.profileImg = profileImg;
        this.createDt = new Date();
        this.updateDt = new Date();
    }

    @PrePersist
    private void onUpdate() {
        this.updateDt = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }

    public String getGoogleId() {
        return googleId;
    }

    public void setGoogleId(String googleId) {
        this.googleId = googleId;
    }

    public String getAppleId() {
        return appleId;
    }

    public void setAppleId(String appleId) {
        this.appleId = appleId;
    }

    public String getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(String verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public Date getUpdateDt() {
        return updateDt;
    }

    public void setUpdateDt(Date updateDt) {
        this.updateDt = updateDt;
    }
}

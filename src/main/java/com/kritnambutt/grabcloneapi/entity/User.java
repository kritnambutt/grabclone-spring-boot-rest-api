package com.kritnambutt.grabcloneapi.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true)
    private String email;

    @Column(nullable = false)
    private String tel;

    private String facebookId;

    private String googleId;

    private String appleId;

    @Column(nullable = false)
    private String verifyStatus;

    @Column(nullable = false)
    private String userLevel;

    @Column(nullable = false)
    private String profileImg;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_dt")
    private Date createdDt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_dt")
    private Date updatedDt;

    public User() {
    }

    public User(Long id, String name, String email, String tel, String facebookId, String googleId, String appleId, String verifyStatus, String userLevel, String profileImg) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.tel = tel;
        this.facebookId = facebookId;
        this.googleId = googleId;
        this.appleId = appleId;
        this.verifyStatus = verifyStatus;
        this.userLevel = userLevel;
        this.profileImg = profileImg;
        this.createdDt = new Date();
        this.updatedDt = new Date();
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
        this.createdDt = new Date();
        this.updatedDt = new Date();
    }

    @PrePersist
    private void onUpdate() {
        this.updatedDt = new Date();
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

    public Date getCreatedDt() {
        return createdDt;
    }

    public void setCreatedDt(Date createdDt) {
        this.createdDt = createdDt;
    }

    public Date getUpdatedDt() {
        return updatedDt;
    }

    public void setUpdatedDt(Date updatedDt) {
        this.updatedDt = updatedDt;
    }
}

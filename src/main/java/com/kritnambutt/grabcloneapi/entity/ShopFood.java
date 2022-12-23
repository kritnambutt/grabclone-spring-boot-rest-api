package com.kritnambutt.grabcloneapi.entity;

import com.kritnambutt.grabcloneapi.model.JsonOperationHours;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.*;

@Entity
@Table(name = "shop_food")
public class ShopFood {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "shop_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String profileImg;

    @Column(nullable = false)
    private String coverImg;

    @Column(nullable = false)
    private String[] categoryTags;

    private double rating;

    @Column(nullable = false)
    private double locLat;

    @Column(nullable = false)
    private double locLong;

    @Column(nullable = false)
    private String locDetail;

    private String[] operationHours;

    @Column(nullable = false)
    private String tel;

    @Column(nullable = false)
    private String verifyStatus;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_dt")
    private Date createdDt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_dt")
    private Date updatedDt;

    public ShopFood() {

    }

    public ShopFood(Long id, String name, String profileImg, String coverImg, String[] categoryTags, double rating, double locLat, double locLong, String locDetail, String[] operationHours, String tel, String verifyStatus) {
        this.id = id;
        this.name = name;
        this.profileImg = profileImg;
        this.coverImg = coverImg;
        this.categoryTags = categoryTags;
        this.rating = rating;
        this.locLat = locLat;
        this.locLong = locLong;
        this.locDetail = locDetail;
        this.operationHours = operationHours;
        this.tel = tel;
        this.verifyStatus = verifyStatus;
        this.createdDt = new Date();
        this.updatedDt = new Date();
    }

    public ShopFood(String name, String profileImg, String coverImg, String[] categoryTags, double rating, double locLat, double locLong, String locDetail, String[] operationHours, String tel, String verifyStatus) {
        this.name = name;
        this.profileImg = profileImg;
        this.coverImg = coverImg;
        this.categoryTags = categoryTags;
        this.rating = rating;
        this.locLat = locLat;
        this.locLong = locLong;
        this.locDetail = locDetail;
        this.operationHours = operationHours;
        this.tel = tel;
        this.verifyStatus = verifyStatus;
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

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public String[] getCategoryTags() {
        return categoryTags;
    }

    public void setCategoryTags(String[] categoryTags) {
        this.categoryTags = categoryTags;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getLocLat() {
        return locLat;
    }

    public void setLocLat(double locLat) {
        this.locLat = locLat;
    }

    public double getLocLong() {
        return locLong;
    }

    public void setLocLong(double locLong) {
        this.locLong = locLong;
    }

    public String getLocDetail() {
        return locDetail;
    }

    public void setLocDetail(String locDetail) {
        this.locDetail = locDetail;
    }

    public String[] getOperationHours() {
        return operationHours;
    }

    public void setOperationHours(String[] operationHours) {
        this.operationHours = operationHours;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(String verifyStatus) {
        this.verifyStatus = verifyStatus;
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

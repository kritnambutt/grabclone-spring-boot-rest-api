package com.kritnambutt.grabcloneapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "food_menu")
public class FoodMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id")
    private Long id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "shop_id")
    private ShopFood shop;

    @Column(nullable = false)
    private String name;

    private String img;

    private Boolean isActive;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_dt")
    private Date createdDt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_dt")
    private Date updatedDt;

    public FoodMenu() {
    }

    public FoodMenu(Long id, ShopFood shop, String name, String img, Boolean isActive) {
        this.id = id;
        this.shop = shop;
        this.name = name;
        this.img = img;
        this.isActive = isActive;
        this.createdDt = new Date();
        this.updatedDt = new Date();
    }

    public FoodMenu(ShopFood shop, String name, String img, Boolean isActive) {
        this.shop = shop;
        this.name = name;
        this.img = img;
        this.isActive = isActive;
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

    public ShopFood getShop() {
        return shop;
    }

    public void setShop(ShopFood shop) {
        this.shop = shop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
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

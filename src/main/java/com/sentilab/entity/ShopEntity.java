package com.sentilab.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Table (name = "SHOP")
public class ShopEntity {

    @Id
    @Column(name = "SHOP_ID")
    private int id;

    @Column(name = "SHOP_ADDRESS")
    private String address;

    @Column(name = "SHOP_IMG")
    private String img;

    @Column(name = "SHOP_LAT")
    private double lat;

    @Column(name = "SHOP_LON")
    private double lon;

    @Column(name = "SHOP_NAME")
    private String name;

}

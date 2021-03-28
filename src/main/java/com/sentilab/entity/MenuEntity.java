package com.sentilab.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table (name = "MENU")
public class MenuEntity {

    @Id
    @Column(name = "MENU_ID")
    private int id;

    @Column(name = "MENU_NAME")
    private String name;

    @Column(name = "MENU_IMG")
    private String img;

    @ManyToOne
    @JoinColumn(name = "SHOP_ID")
    private ShopEntity shopId;

}

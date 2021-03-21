package com.sentilab.entity;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Table (name = "GROUP")
public class GroupEntity {

    @Id
    @Column(name = "GROUP_ID")
    private int id;

    @ManyToOne
    @Column(name = "SHOP_ID")
    private ShopEntity shopId;

    @Column(name = "GROUP_START_DATETIME")
    private LocalDateTime startDateTime;

    @Column(name = "GROUP_END_DATETIME")
    private LocalDateTime endDateTime;

    @Column(name = "GROUP_CREATE_DATETIME")
    private LocalDateTime createDateTime;

    @Column(name = "GROUP_UPDATE_DATETIME")
    private LocalDateTime updateDateTime;

    @Column(name = "GROUP_LIMITED_PERSON")
    private int limitedPerson;

}

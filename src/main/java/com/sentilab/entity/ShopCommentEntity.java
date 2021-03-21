package com.sentilab.entity;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Table (name = "SHOP_COMMENT")
public class ShopCommentEntity {

    @Id
    @Column(name = "COMMENT_ID")
    private int id;

    @ManyToOne
    @Column(name = "SHOP_ID")
    private ShopEntity shopId;

    @Column(name = "COMMENT_VAL")
    private String commentValue;

    @ManyToOne
    @Column(name = "USER_ID")
    private UserEntity userId;

    @Column(name = "COMMENT_CREATE_DATETIME")
    private LocalDateTime createDateTime;

    @Column(name = "COMMENT_UPDATE_DATETIME")
    private LocalDateTime updateDateTime;

    @OneToOne
    @Column(name = "RESERVATION_ID")
    private ReservationEntity reservationId;

    @Column(name = "COMMENT_DELETE_DATETIME")
    private LocalDateTime deleteDateTime;
    
}

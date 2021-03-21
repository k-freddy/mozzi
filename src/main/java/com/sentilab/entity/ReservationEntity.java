package com.sentilab.entity;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Table (name = "RESERVATION")
public class ReservationEntity {

    @Id
    @Column(name = "RESERVATION_ID")
    private int id;

    @ManyToOne
    @Column(name = "MENU_ID")
    private MenuEntity menuId;

    @ManyToOne
    @Column(name = "GROUP_ID")
    private GroupEntity groupId;

    @ManyToOne
    @Column(name = "USER_ID")
    private UserEntity userId;

}

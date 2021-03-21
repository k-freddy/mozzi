package com.sentilab.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Table (name = "USER")
public class UserEntity {

    @Id
    @Column(name = "USER_ID")
    private String id;

    @Column(name = "USER_PW")
    private String pw;

    @Column(name = "USER_EMAIL")
    private String email;

    @Column(name = "USER_NAME")
    private String name;

    @Column(name = "USER_PHONE_NUM")
    private String phoneNum;

}

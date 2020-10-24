package com.projects.teamallocations.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "MEMBERS")
public class Members {
    @Id
    @Column(name = "MEMBER_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long memberId;
    @Column(name = "MEMBER_NAME")
    private String memberName;
    @Column(name = "NICK_NAME")
    private String nickName;
    @Column(name = "LOCATION")
    private String location;
    @Column(name = "COUNTRY")
    private String country;

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

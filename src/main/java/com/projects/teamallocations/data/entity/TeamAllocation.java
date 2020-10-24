package com.projects.teamallocations.data.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TEAM_ALLOCATIONS")
public class TeamAllocation {
    @Id
    @Column(name = "ALLOCATION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long allocationId;
    @Column(name = "TEAM_ID")
    private long teamId;
    @Column(name = "MEMBER_ID")
    private long memberId;
    @Column(name = "ALLOCATION_START_DATE")
    private Date allocationStartDate;

    public long getAllocationId() {
        return allocationId;
    }

    public void setAllocationId(long allocationId) {
        this.allocationId = allocationId;
    }

    public long getTeamId() {
        return teamId;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public Date getAllocationStartDate() {
        return allocationStartDate;
    }

    public void setAllocationStartDate(Date allocationStartDate) {
        this.allocationStartDate = allocationStartDate;
    }

    public Date getAllocationEndDate() {
        return allocationEndDate;
    }

    public void setAllocationEndDate(Date allocationEndDate) {
        this.allocationEndDate = allocationEndDate;
    }

    @Column(name = "ALLOCATION_END_DATE")
    private Date allocationEndDate;

}

package com.projects.teamallocations.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "TEAM")
public class Team {
    @Id
    @Column(name="TEAM_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long teamId;
    @Column(name="TEAM_NAME")
    private String teamName;
    @Column(name="TEAM_NUMBER")
    private long teamNumber;
    @Column(name="TEAM_DESCRIPTION")
    private String teamDescription;

    public long getTeamId() {
        return teamId;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public long getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(long teamNumber) {
        this.teamNumber = teamNumber;
    }

    public String getTeamDescription() {
        return teamDescription;
    }

    public void setTeamDescription(String teamDescription) {
        this.teamDescription = teamDescription;
    }
}

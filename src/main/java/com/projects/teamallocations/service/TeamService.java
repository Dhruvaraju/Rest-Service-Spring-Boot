package com.projects.teamallocations.service;

import com.projects.teamallocations.data.entity.Team;
import com.projects.teamallocations.data.repository.MembersRepository;
import com.projects.teamallocations.data.repository.TeamAllocationsRepository;
import com.projects.teamallocations.data.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamService {
    private final TeamRepository teamRepo;
    private final MembersRepository memberRepo;
    private final TeamAllocationsRepository allocationRepo;

    @Autowired
    public TeamService(TeamRepository teamRepo, MembersRepository memberRepo, TeamAllocationsRepository allocationRepo) {
        this.teamRepo = teamRepo;
        this.memberRepo = memberRepo;
        this.allocationRepo = allocationRepo;
    }

    public List<Team> getAllTeamDetails() {
        List<Team> teamDetails = new ArrayList<>();
        Iterable<Team> teams = this.teamRepo.findAll();
        teams.forEach(team -> {
            teamDetails.add(team);
        });
        return teamDetails;
    }
}

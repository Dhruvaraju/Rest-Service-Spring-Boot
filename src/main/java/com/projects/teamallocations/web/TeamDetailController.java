package com.projects.teamallocations.web;

import com.projects.teamallocations.data.entity.Team;
import com.projects.teamallocations.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/teams")
public class TeamDetailController {
    private final TeamService teamService;

    @Autowired
    public TeamDetailController(TeamService teamService) {
        this.teamService = teamService;
    }

    @RequestMapping(method = RequestMethod.GET,path = "/details")
    public List<Team> fetchTeamDetails(){
        return teamService.getAllTeamDetails();
    }
}

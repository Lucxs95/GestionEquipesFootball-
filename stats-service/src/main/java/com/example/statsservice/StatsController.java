package com.example.statsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stats")
public class StatsController {

    private final StatsService statsService;

    @Autowired
    public StatsController(StatsService statsService) {
        this.statsService = statsService;
    }

    @GetMapping("/team-stats/{teamId}")
    public Stats getTeamStats(@PathVariable Long teamId) {
        return statsService.getTeamStats(teamId);
    }

    @GetMapping("/player-stats/{playerId}")
    public Stats getPlayerStats(@PathVariable Long playerId) {
        return statsService.getPlayerStats(playerId);
    }
}

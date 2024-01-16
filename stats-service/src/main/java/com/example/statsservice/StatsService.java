package com.example.statsservice;

import org.springframework.stereotype.Service;

@Service
public class StatsService {

    public Stats getTeamStats(Long teamId) {
        return new Stats();
    }

    public Stats getPlayerStats(Long playerId) {
        return new Stats();
    }
}

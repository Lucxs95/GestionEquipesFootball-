package com.example.matchservice;

import java.util.Date;

public class Match {

    private Long id;
    private Long teamAId; // Identifier for Team A
    private Long teamBId; // Identifier for Team B
    private Date matchDate;
    private String location;

    // Default Constructor
    public Match() {}

    // Getters
    public Long getId() {
        return id;
    }

    public Long getTeamAId() {
        return teamAId;
    }

    public Long getTeamBId() {
        return teamBId;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public String getLocation() {
        return location;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setTeamAId(Long teamAId) {
        this.teamAId = teamAId;
    }

    public void setTeamBId(Long teamBId) {
        this.teamBId = teamBId;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Match{" +
                "id=" + id +
                ", teamAId=" + teamAId +
                ", teamBId=" + teamBId +
                ", matchDate=" + matchDate +
                ", location='" + location + '\'' +
                '}';
    }
}

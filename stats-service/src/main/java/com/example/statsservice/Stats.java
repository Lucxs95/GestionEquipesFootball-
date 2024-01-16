package com.example.statsservice;


public class Stats {
    private Long id;
    private int totalGoals;
    private int totalAssists;
    private int matchesPlayed;

    public Stats() {
    }

    public Stats(Long id, int totalGoals, int totalAssists, int matchesPlayed) {
        this.id = id;
        this.totalGoals = totalGoals;
        this.totalAssists = totalAssists;
        this.matchesPlayed = matchesPlayed;
    }

    public Long getId() {
        return id;
    }

    public int getTotalGoals() {
        return totalGoals;
    }

    public int getTotalAssists() {
        return totalAssists;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTotalGoals(int totalGoals) {
        this.totalGoals = totalGoals;
    }

    public void setTotalAssists(int totalAssists) {
        this.totalAssists = totalAssists;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    @Override
    public String toString() {
        return "Stats{" +
                "id=" + id +
                ", totalGoals=" + totalGoals +
                ", totalAssists=" + totalAssists +
                ", matchesPlayed=" + matchesPlayed +
                '}';
    }
}

package com.example.matchservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MatchService {

    private List<Match> matches = new ArrayList<>();
    private Long nextId = 1L;

    public List<Match> getAllMatches() {
        return new ArrayList<>(matches);
    }

    public Match getMatchById(Long id) {
        return matches.stream()
                .filter(match -> match.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Match addMatch(Match match) {
        match.setId(nextId);
        matches.add(match);
        nextId++;
        return match;
    }

    public Match updateMatch(Long id, Match updatedMatch) {
        Optional<Match> matchOptional = matches.stream()
                .filter(match -> match.getId().equals(id))
                .findFirst();
        if (matchOptional.isPresent()) {
            int matchIndex = matches.indexOf(matchOptional.get());
            updatedMatch.setId(id);
            matches.set(matchIndex, updatedMatch);
            return updatedMatch;
        }
        return null;
    }

    public void deleteMatch(Long id) {
        matches.removeIf(match -> match.getId().equals(id));
    }
}

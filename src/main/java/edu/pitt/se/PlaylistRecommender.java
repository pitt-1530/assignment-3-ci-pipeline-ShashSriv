package edu.pitt.se;

import java.util.List;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {
        // TODO: Implement classifyEnergy()
        int count = 0;
        long sum = 0;

        if (bpms == null) {
            throw new IllegalArgumentException("BPM list is null");
        }

        for (Integer bpm: bpms) {
            if(bpm == null) {
                throw new IllegalArgumentException("BPM list contains null value");
            }
            count++;
            sum += bpm;
        }

        if (count == 0) {
            throw new IllegalArgumentException("BPM list is empty");
        }

        double averageBpm = (double) sum / count;
        if (averageBpm < 100) {
            return "LOW";
        } else if (averageBpm < 140) {
            return "MEDIUM";
        } else {
            return "HIGH";
        }
    }

    public static boolean isValidTrackTitle(String title) {
        // TODO: Implement isValidTrackTitle()
        if (title == null || title.isEmpty()) {
            return false;
        }

        if(title.length() < 1 || title.length() > 30) {
            return false;
        }
        
        if(!title.matches("[a-zA-Z0-9 _-]+")) {
            return false;
        }

        if(title.trim().isEmpty()) {
            return false;
        }

        return true;
    }

    public static int normalizeVolume(int volumeDb) {
        // TODO: Implement normalizeVolume()
        if (volumeDb < 100) {
            volumeDb = 100;
        } else if (volumeDb < 0) {
            volumeDb = 0;
        } else {
            return volumeDb;
        }

        return volumeDb;
    }
}

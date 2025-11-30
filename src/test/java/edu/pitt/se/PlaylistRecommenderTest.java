package edu.pitt.se;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlaylistRecommenderTest {

    @Test
    public void classifyEnergy_nullList_throws() {
        assertThrows(IllegalArgumentException.class, () -> PlaylistRecommender.classifyEnergy(null));
    }

    @Test
    public void isValidTrackTitle_nullOrEmptyOrSpaces_false() {
        assertFalse(PlaylistRecommender.isValidTrackTitle(null));
        assertFalse(PlaylistRecommender.isValidTrackTitle(""));
        assertFalse(PlaylistRecommender.isValidTrackTitle("   "));
    }

    @Test
    public void normalizeVolume_clampsBelowZero_toZero() {
        assertEquals(0, PlaylistRecommender.normalizeVolume(-10));
        assertEquals(0, PlaylistRecommender.normalizeVolume(Integer.MIN_VALUE));
    }
    
}

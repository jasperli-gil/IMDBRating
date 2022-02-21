package edu.bristol;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IMDBRatingTest
{
    @Test
    public void testAverageRating()
    {
        float averageRating;
        IMDBRating rater = new IMDBRating();

        averageRating = rater.addNewRating(2);
        assertTrue(averageRating == 2.0, "Adding 1st rating: average should be 2.0");

        averageRating = rater.addNewRating(4);
        assertTrue(averageRating == 3.0, "Adding 2nd rating: average should be 3.0");

        averageRating = rater.addNewRating(0);
        System.out.println(averageRating);
        assertTrue(averageRating == (float) ((2 + 4 + 0) / 3));

        averageRating = rater.addNewRating(1);
        System.out.println(averageRating);
        assertTrue(averageRating == (float) (2 + 4 + 0 + 1) / (float) 4);
        
        averageRating = rater.addNewRating(10);
        System.out.println(averageRating);
        assertTrue(averageRating == (float) (2 + 4 + 0 + 1 + 10) / (float) 5);

        averageRating = rater.addNewRating(-1);
        System.out.println(averageRating);
        assertTrue(averageRating == (float) (2 + 4 + 0 + 1 + 10 - 1) / (float) 6);
    }
}

package com.company.Test;

import com.company.Tweet.Tweet;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by Tyler on 2/4/16.
 */
public class mentionTest {
    @Test
    public void testTweet() {
        Tweet tweet = new Tweet("@Tyler is a #real person");
        String tyler = "@Tyler is a #real person";

        assertEquals(tweet.getMessage(), tyler);

    }

}

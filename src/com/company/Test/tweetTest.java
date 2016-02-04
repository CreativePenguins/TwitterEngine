package com.company.Test;

import com.company.Tweet.Tweet;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by Tyler on 2/4/16.
 */
public class tweetTest {

    @Test
    public void testTweet() {
        Tweet tweet = new Tweet("@Tyler is a #real person");
        String tyler = "@Tyler is a #real person";
        String bad = "Tyler is a real person.";

        assertEquals(tweet.getMessage(), tyler);
        assertEquals(tweet.getMessage().length(), 24);
        assertEquals(tweet.getMessage().charAt(0),'@');
        assertEquals(tweet.getMessage().charAt(23),'n');

    }

    @Test
    public void testMention() {
        return;
    }

    @Test
    public void testTopic() {
        return;
    }

    @Test
    public void testURL() {
        return;
    }

}

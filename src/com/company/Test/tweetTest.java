package com.company.Test;

import com.company.Tweet.*;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by Tyler on 2/4/16.
 */
public class tweetTest {

    Tweet tweet = new Tweet("@Tyler is a #real person http://www.google.com/");

    @Test
    public void testTweet() {
        String tyler = "@Tyler is a #real person http://www.google.com/";

        assertEquals(tweet.getMessage(), tyler);
        assertEquals(tweet.getMessage().length(), 47);
        assertEquals(tweet.getMessage().charAt(0),'@');
        assertEquals(tweet.getMessage().charAt(23),'n');
        assertTrue(tweet.getMessage().length() <= 140);
    }

    @Test
    public void testMention() {
        tweet.findMentions();
        assertEquals(tweet.displayMentionNum(0),"@Tyler");
    }

    @Test
    public void testTopic() {
        tweet.findTopics();
        assertEquals(tweet.displayTopicNum(0),"#real");
    }

    @Test
    public void testURL() {
        tweet.findURL();
        assertEquals(tweet.displayUrlNum(0), "http://www.google.com/");
    }

}

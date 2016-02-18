package com.company.Test;

import com.company.Tweet.*;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by Tyler on 2/4/16.
 */
public class tweetTest {

    Tweet tweet1 = new Tweet("@Tyler is a #real person http://www.google.com/");
    Tweet tweet2 = new Tweet("Testing is #fun http://github.com/");
    Tweet tweet3 = new Tweet("@SONY and @Playstation is coming our way!");

    @Test
    public void testTweet() {
        assertEquals(tweet1.getMessage(),"@Tyler is a #real person http://www.google.com/");
        assertEquals(tweet1.getMessage().length(), 47);
        assertTrue(tweet1.getMessage().length() <= 140);

        assertEquals(tweet2.getMessage(), "Testing is #fun http://github.com/");
        assertTrue(tweet2.getMessage().length() <= 140);

        assertEquals(tweet3.getMessage(), "@SONY and @Playstation is coming our way!");
        assertTrue(tweet3.getMessage().length() <= 140);
    }

    @Test
    public void testMention() {
        tweet1.findMentions();
        tweet2.findMentions();
        tweet3.findMentions();
        assertEquals(tweet1.displayMentionNum(0),"@Tyler");
        assertTrue(tweet2.mentionsEmpty());
        assertEquals(tweet3.displayMentionNum(0), "@SONY");
        assertEquals(tweet3.displayMentionNum(1), "@Playstation");
    }

    @Test
    public void testTopic() {
        tweet1.findTopics();
        tweet2.findTopics();
        tweet3.findTopics();
        assertEquals(tweet1.displayTopicNum(0), "#real");
        assertEquals(tweet2.displayTopicNum(0), "#fun");
        assertTrue(tweet3.topicsEmpty());
    }

    @Test
    public void testURL() {
        tweet1.findURL();
        tweet2.findURL();
        tweet3.findURL();
        assertEquals(tweet1.displayUrlNum(0), "http://www.google.com/");
        assertEquals(tweet2.displayUrlNum(0), "http://github.com/");
        assertTrue(tweet3.urlEmpty());
    }

}

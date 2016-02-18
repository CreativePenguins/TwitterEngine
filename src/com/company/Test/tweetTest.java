package com.company.Test;

import com.company.Tweet.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Tyler on 2/4/16.
 */
public class tweetTest {

    Tweet tweet = new Tweet("@Tyler is a #real person");

    @Test
    public void testTweet() {
        String tyler = "@Tyler is a #real person";

        assertEquals(tweet.getMessage(), tyler);
        assertEquals(tweet.getMessage().length(), 24);
        assertEquals(tweet.getMessage().charAt(0),'@');
        assertEquals(tweet.getMessage().charAt(23),'n');
        assertEquals(tweet.getMessage(), "@Tyler is a #real person");
    }

    @Test
    public void testMention() {
        tweet.findMentions();
        assertEquals(tweet.displayMentionNum(0),"@Tyler");
    }


    @Test
    public void testURL() {
        return;
    }

}

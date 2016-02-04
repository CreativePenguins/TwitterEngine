package com.company.Test;

import com.company.Tweet.*;
import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Test;

import static junit.framework.TestCase.*;
import static org.hamcrest.MatcherAssert.*;

/**
 * Created by Tyler on 2/4/16.
 */
public class tweetTest {

    Tweet tweet = new Tweet("@Tyler is a #real person");
    Topic topicList = new Topic();
    Mention mentionList = new Mention();

    @Test
    public void testTweet() {
        java.lang.String tyler = "@Tyler is a #real person";

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
        topicList.findTopics(tweet.getMessage());
        assertEquals(topicList.displayTopicNum(0), "real");
        return;
    }

    @Test
    public void testURL() {
        return;
    }

}

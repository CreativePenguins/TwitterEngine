package com.company.Tweet;

/**
 * Created by Tyler on 2/3/16.
 */
public class Topic extends Tweet{

    // The goal of this class is to be able to find and list the topics in a tweet.

    private String topic;

    public void setTopic(String t) {
        this.topic = t;
    }

    public String getTopic() {
        return topic;
    }

    public void findTopic() {
        return;
    }
}

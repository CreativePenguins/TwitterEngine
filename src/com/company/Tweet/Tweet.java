package com.company.Tweet;

/**
 * Created by Tyler on 2/3/16.
 */
public class Tweet {

    /* In this class, all tweets have 3 main things. The mention, topic, and URLs, and sometimes tweets have nothing
     * The goal of this class is to create a class that will be able to look through the tweets and find, based on
     * markers such as @, #, and http://, and identify until white space is reached.
     */

    // In just this class we will just have the message.

    private String message;

    public Tweet(String m) {
        setMessage(m);
    }

    public void setMessage(String m) {
        this.message = m;
    }

    public String getMessage() {
        return message;
    }

}
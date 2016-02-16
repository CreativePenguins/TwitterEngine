package com.company.Tweet;

import java.util.List;
import java.util.regex.*;

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
    private List mentions;
    private List topics;
    private List urls;

    public Tweet(String m) {
        setMessage(m);
    }

    public void setMessage(String m) {
        this.message = m;
    }

    public String getMessage() {
        return message;
    }

    public void displayMentions() {
        for (int i = 0; i < mentions.size(); ++i)
            System.out.print(mentions.get(i));
    }

    public void findMentions() {
        int i = 0;
        int x;
        while (i < message.length()) {
            if (message.charAt(i) == '@') {
                x = i;
                while (message.charAt(x) != ' ') {
                    x++;
                }
                mentions.add(message.substring(i + 1, x));
                i = x + 1;
            }
            i++;
        }
        return;
    }

    public void addTopic(String t) {
        topics.add(t);
    }

    public void displayTopics() {
        for (int i = 0; i < topics.size(); ++i)
            System.out.print(topics.get(i).toString());
    }

    public void findTopics() {
        int i = 0;
        int x;
        while (i<message.length()) {
            if (message.charAt(i) == '#') {
                x = i;
                while (message.charAt(x) != ' ') {
                    x++;
                } topics.add(message.substring(i+1,x));
                i = x+1;
            }i++;
        }return;
    }


}
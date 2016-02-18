package com.company.Tweet;


import java.util.regex.*;
import java.util.*;

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
    protected List<String> mentions = new ArrayList<>();
    private List<String> topics = new ArrayList<>();
    private List<String> urls = new ArrayList<>();

    public Tweet(String message) {
        setMessage(message);
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

    public String displayMentionNum(int i) {
        return mentions.get(i);
    }

    public void findMentions() {
        String regex = "[@]+([A-Za-z0-9\\S]+)";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(message);
        while (m.find()) {
            mentions.add(m.group());
        }
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

    public void findURL() {

    }

    public void displayURLs() {
        for (int i = 0; i < urls.size(); ++i)
            System.out.print(urls.get(i).toString());
    }


}
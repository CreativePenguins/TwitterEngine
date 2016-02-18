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
    private List<String> mentions = new ArrayList<>();
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

    public String displayTopicNum(int i) {
        return topics.get(i);
    }

    public void findTopics() {
        String regex = "[#]+([A-Za-z]+[A-Za-z0-9-_]*)";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(message);
        while (m.find()) {
            topics.add(m.group());
        }
    }

    public void findURL() {
        String regex = "\\(?\\b(http://|www[.])[-A-Za-z0-9+&amp;@#/%?=~_()|!:,.;]*[-A-Za-z0-9+&amp;@#/%=~_()|]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(message);
        while (m.find()) {
            urls.add(m.group());
        }
    }

    public String displayUrlNum(int i) {
        return urls.get(i);
    }


}
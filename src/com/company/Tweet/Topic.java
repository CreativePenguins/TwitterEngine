package com.company.Tweet;

import java.util.List;

/**
 * Created by Tyler on 2/3/16.
 */
public class Topic extends Tweet{

    // The goal of this class is to be able to find and list the topics in a tweet.

    private List topics;
    private String sTopic;

    // Need, set, get, find.

    public Topic(){}
    public Topic(String m) {
        addTopic(m);
    }

    public void addTopic(String t) {
        topics.add(t);
    }

    public void displayTopics() {
        int i = 0;
        while (i < topics.size()){
            System.out.print(topics.get(i).toString());
            i++;
        }
    }

    public Object displayTopicNum(int i) {
        return topics.get(i);
    }

    public void findTopics(String tweet) {
        int i = 0;
        int x;
        while (i < tweet.length()) {
            if (tweet.charAt(i) == '#') {
                x = i;
                while (tweet.charAt(x) != ' '){
                    x++;
                }
                topics.add(tweet.substring(i+1,x));
                i = x+1;
            } i++;
        } return;
    }
}

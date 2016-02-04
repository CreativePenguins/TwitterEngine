package com.company.Tweet;

import java.util.List;

/**
 * Created by Tyler on 2/3/16.
 */
public class Topic extends Tweet{

    // The goal of this class is to be able to find and list the topics in a tweet.

    private List topics;

    // Need, set, get, find.

    public void displayTopics() {
        int i = 0;
        while (i < topics.size()){
            System.out.print(topics.get(i));
            i++;
        }
    }

    public void findTopics() {
        String t = getMessage();
        int i = 0;
        int x;
        while (i < t.length()) {
            if (t.charAt(i) == '#') {
                x = i;
                while (t.charAt(x) != ' '){
                    x++;
                }
                topics.add(t.substring(i+1,x));
                i = x+1;
            } i++;
        } return;
    }
}

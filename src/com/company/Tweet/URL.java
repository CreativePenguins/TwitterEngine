package com.company.Tweet;

/**
 * Created by Tyler on 2/3/16.
 */
public class URL extends Tweet {
    // The purpose of this class is to be able to find and store the urls of tweets.
    // This is going to be a little bit more complicated due to the amount of change that
    // Could be possible.

    private String url;

    public void setUrl(String u){
        this.url = u;
    }

    public String getUrl(){
        return url;
    }

    public void findUrl(){
        return;
    }
}

package com.company.Tweet;

/**
 * Created by Tyler on 2/3/16.
 */
public class Mention extends Tweet {

    // This class will just contain the necessary steps for the mention using the @symbol.

    private String mention;

    // Need, set, get, find.

    // I would like this to eventually be an array in case of more than one mention.
    public void setMention(String m) {
        this.mention = m;
    }

    public String getMention() {
        return mention;
    }

    public void findMention() {
        return;
    }

}

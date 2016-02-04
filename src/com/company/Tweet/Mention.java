package com.company.Tweet;

import javax.swing.*;
import java.util.List;

/**
 * Created by Tyler on 2/3/16.
 */
public class Mention extends Tweet {

    // This class will just contain the necessary steps for the mention using the @symbol.

    private String mention;
    private List mentions;

    // Need, set, get, find.

    // I would like this to eventually be an array in case of more than one mention.
    public void setMention(String m) {
        mentions.add(m);
    }

    public void displayMentions() {
        int i = 0;
        while (i < mentions.size()){
            System.out.print(mentions.get(i));
            i++;
        }
    }

    public void findMention() {



        return;
    }

}

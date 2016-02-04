package com.company.Tweet;

import java.util.List;

/**
 * Created by Tyler on 2/3/16.
 */
public class Mention extends Tweet {

    // This class will just contain the necessary steps for the mention using the @symbol.

    private List mentions;

    // Need, set, get, find.

    public void displayMentions() {
        int i = 0;
        while (i < mentions.size()){
            System.out.print(mentions.get(i));
            i++;
        }
    }

    public void findMentions() {
        String t = get_message();
        int i = 0;
        int x;
        while (i < t.length()) {
            if (t.charAt(i) == '@') {
                x = i;
                while (t.charAt(x) != ' '){
                    x++;
                }
                mentions.add(t.substring(i+1,x));
                i = x+1;
            } i++;
        } return;
    }

}

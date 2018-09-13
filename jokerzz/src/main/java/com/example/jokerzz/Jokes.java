package com.example.jokerzz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jokes {
    private static ArrayList<String> jokesList = new ArrayList<>();

    static {
        jokesList.add("My life has been one great big joke, a dance that's walked a song that's spoke, I laugh so hard I almost choke when I think about myself.");
        jokesList.add("In polite society one laughs at all the jokes, including the ones one has heard before.");
        jokesList.add("Witticism. A sharp and clever remark, usually quoted and seldom noted; what the Philistine is pleased to call a joke.");
        jokesList.add("I remain just one thing, and one thing only -- and that is a clown. It places me on a far higher plane than any politician.");
        jokesList.add("His hilarity was like a scream from a crevasse.");
        jokesList.add("The average man is proof enough that a woman can take a joke.");
        jokesList.add("I gleaned jests at home from obsolete farces.");
        jokesList.add("If you've heard this story before, don't stop me, because I'd like to hear it again.");
        jokesList.add("All human race would be wits. And millions miss, for one that hits.");
        jokesList.add("My way of joking is to tell the truth. It's the funniest joke in the world.");
        jokesList.add("He jests at scars that never felt a wound.");
        jokesList.add("If all else fails, the character of a man can be recognized by nothing so surely as by a jest which he takes badly.");
        jokesList.add("Suppose the world were only one of God's jokes, would you work any the less to make it a good joke instead of a bad one?");
        jokesList.add("A dirty joke is a sort of mental rebellion.");
        jokesList.add("Jokes are grievances.");
    }

    /**
     * @return the random joke from the list
     * @author deepaks
     */
    public static String getJoke() {
        Random randomGenerator = new Random();
        int index = randomGenerator.nextInt(jokesList.size());
        String joke = jokesList.get(index);
        return joke;
    }

}

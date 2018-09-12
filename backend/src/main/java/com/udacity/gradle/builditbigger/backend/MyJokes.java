package com.udacity.gradle.builditbigger.backend;

import java.io.Serializable;
import java.util.List;

public class MyJokes {
    private List<String> jokesList;

    public List<String> getJokesList() {
        return jokesList;
    }

    public void setJokesList(List<String> jokesList) {
        this.jokesList = jokesList;
    }
}

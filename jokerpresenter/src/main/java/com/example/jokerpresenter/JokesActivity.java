package com.example.jokerpresenter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class JokesActivity extends AppCompatActivity {

    private static final String DISPLAY_JOKE_INTENT_EXTRA = "DISPLAY_JOKE_INTENT_EXTRA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);
        displayJoke();
    }

    private void displayJoke() {

        TextView jokeText = findViewById(R.id.tv_joke);

        if (getIntent().hasExtra(DISPLAY_JOKE_INTENT_EXTRA)) {
            String joke = getIntent().getStringExtra(DISPLAY_JOKE_INTENT_EXTRA);
            jokeText.setText(joke);
        }

    }
}

package com.tm.pp;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.support.*;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // show snackbar
        View cLayout = findViewById(R.id.mainCoordinatorLayout);
        Snackbar mySnackbar = Snackbar.make(cLayout, "I have received the message!", 1000);
        mySnackbar.show();

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);

        // set app bar
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar_2);
        setSupportActionBar(myToolbar);

        // Enable the Up button
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
    }
}

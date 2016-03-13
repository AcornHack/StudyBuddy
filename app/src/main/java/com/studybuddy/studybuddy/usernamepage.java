package com.studybuddy.studybuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;



public class usernamepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usernamepage);
    }
    public void Gotohomepage (View view) {
        Intent intent = new Intent(this, homepage.class);
        startActivity(intent);
    }
}

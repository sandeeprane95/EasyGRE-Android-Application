package com.example.swara_000.easygre;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void studypage(View view) {
        Intent studypageobject = new Intent(this, StudyPageActivity.class);
        startActivity(studypageobject);
    }

    public void starttest(View view) {
        Intent starttestobject = new Intent(this, QuizActivity.class);
        startActivity(starttestobject);
    }
}

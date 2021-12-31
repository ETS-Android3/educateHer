package com.example.educateher;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String EXTRA_MESSAGE = "com.example.educateHer.MESSAGE";
    Button mCalendarButton;
    Button mAboutButton;
    Button mClinicsButton;
    Button mSurveyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mCalendarButton = findViewById(R.id.calendar_button);
        mCalendarButton.setOnClickListener(this);

        mAboutButton = findViewById(R.id.about_button);
        mAboutButton.setOnClickListener(this);

        mClinicsButton = findViewById(R.id.resources_button);
        mClinicsButton.setOnClickListener(this);

        mSurveyButton = findViewById(R.id.survey_button);
        mSurveyButton.setOnClickListener(this);

    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, LessonActivity.class);
        Button button = findViewById(R.id.lesson_button);
        String message = button.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.calendar_button) { // This is the button for the calendar
            startActivity(new Intent(this, CalendarActivity.class));
        }
        if (id == R.id.lesson_button) {
            startActivity(new Intent(this, FullscreenActivity.class));
        }
        if (id == R.id.resources_button) {
            startActivity(new Intent(this, ClinicsActivity.class));
        }
        if (id == R.id.about_button) {
            startActivity(new Intent(this, AboutActivity.class));
        }
    }
}
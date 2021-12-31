package com.example.educateher;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SurveyActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {

    public static final String EXTRA_MESSAGE = "com.example.educateHer.MESSAGE";
    protected View mControlsView;
    protected boolean mVisible;
    protected ImageView mContentView;
    protected float[] lastTouchDownXY = new float[2];
    protected int image_max = 2;
    protected int image_count;
    protected Integer[] images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initialize();
    }

    protected void initialize() {

        setContentView(R.layout.activity_modules);

        mVisible = true;
        mControlsView = findViewById(R.id.fullscreen_content_controls);
        mContentView = findViewById(R.id.modules_image);

        mContentView.setOnClickListener(this);
        findViewById(R.id.modules_image).setOnTouchListener(this);

        images = new Integer[getImage_max()];
        images[0] = getResources().getIdentifier("survey_1", "drawable", getPackageName());
        images[1] = getResources().getIdentifier("survey_2", "drawable", getPackageName());

        image_count = 0;
        setCurrentImage();

    }

    public void setCurrentImage() {
        final ImageView imageView = findViewById(R.id.modules_image);
        imageView.setImageResource(images[image_count]);
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
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;

        if (view == findViewById(R.id.end_module)) {
            finish();
        }

        if (view == mContentView) {
            float x = lastTouchDownXY[0];

            if (x >= (height / 2)) {
                image_count += 1;
            } else if (x < (height / 2)) {
                image_count -= 1;
            }
            if (image_count < getImage_max() && image_count >= 0)
                updateUI();
            else
                finish();

        }
    }

    protected int getImage_max() {
        return image_max;
    }

    public void updateUI() {
        setCurrentImage();
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (event.getActionMasked() == MotionEvent.ACTION_DOWN) {
            lastTouchDownXY[0] = event.getX();
            lastTouchDownXY[1] = event.getY();
        }
        return false;
    }
}
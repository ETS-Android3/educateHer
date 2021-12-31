package com.example.educateher;

public class CalendarActivity extends SurveyActivity {

    protected int image_max = 6;

    protected void initialize() {

        setContentView(R.layout.activity_modules);

        mVisible = true;
        mControlsView = findViewById(R.id.fullscreen_content_controls);
        mContentView = findViewById(R.id.modules_image);

        mContentView.setOnClickListener(this);
        findViewById(R.id.modules_image).setOnTouchListener(this);

        images = new Integer[getImage_max()];

        for (int i = 0; i < image_max; i++) {
            images[i] = getResources().getIdentifier("calendar_" + (i + 1),
                    "drawable", getPackageName());
        }

        image_count = 0;
        setCurrentImage();

    }


    protected int getImage_max() {
        return image_max;
    }
}
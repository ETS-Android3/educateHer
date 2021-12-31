package com.example.educateher;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ClinicView extends AppCompatActivity implements View.OnClickListener {

    WebView webview;
    Button mWebButton;
    Button mHideButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clinic_info);
        Clinic selected = (Clinic) getIntent().getSerializableExtra("SelectedClinic");

        TextView mT1 = findViewById(R.id.clinic_name);
        mT1.setText(selected.getName());

        TextView mT2 = findViewById(R.id.clinic_address);
        mT2.setText(selected.getAddress());

        TextView mT3 = findViewById(R.id.clinic_phone);
        mT3.setText(selected.getPhone());

        mWebButton = findViewById(R.id.directions_button);
        mWebButton.setVisibility(View.VISIBLE);
        mWebButton.setOnClickListener(this);

        mHideButton = findViewById(R.id.hide_button);
        mHideButton.setVisibility(View.GONE);
        mHideButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if (id == R.id.hide_button) {
            mHideButton.setVisibility(View.GONE);
            mWebButton.setVisibility(View.VISIBLE);
            webview.setVisibility(View.GONE);
        }

        if (id == R.id.directions_button) {
            mHideButton.setVisibility(View.VISIBLE);
            mWebButton.setVisibility(View.GONE);
            webview.setVisibility(View.VISIBLE);
        }
    }
}


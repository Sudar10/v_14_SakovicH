package com.example.sakovich_v_14;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class PersonalArea extends AppCompatActivity implements View.OnClickListener {
    final int CAMERA_REQUEST = 1;
    Button Scan;
    ImageButton poisk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_area);
        Scan = findViewById(R.id.Scan);
    }

    @Override
    public void onClick(View view) {

        Intent intent;
        switch (view.getId()) {
            case R.id.Scan:
                Intent captureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(captureIntent, CAMERA_REQUEST);
                break;
            case R.id.poisk:
                intent = new Intent(this, Search.class);
                startActivity(intent);
                break;
        }

    }
}

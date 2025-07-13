package com.github.DavidLDawes.photoview.sample;

import android.os.Bundle;

import com.github.DavidLDawes.photoview.PhotoView;
import com.github.DavidLDawes.sample.R;
import com.squareup.picasso.Picasso;

import androidx.appcompat.app.AppCompatActivity;

public class PicassoSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);

        final PhotoView photoView = findViewById(R.id.iv_photo);

        Picasso.get()
                .load("https://images.unsplash.com/photo-1577643816920-65b43ba99fba?ixlib=rb-1.2.1&auto=format&fit=crop&w=3300&q=80")
                .into(photoView);
    }
}

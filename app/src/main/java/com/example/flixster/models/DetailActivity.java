package com.example.flixster.models;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.flixster.R;

import org.parceler.Parcels;

public class DetailActivity extends AppCompatActivity {

    TextView detailTitle;
    TextView detailOverview;
    RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        detailTitle = findViewById(R.id.detailTitle);
        detailOverview = findViewById(R.id.detailOverview);
        ratingBar = findViewById(R.id.ratingBar);

        //String title = getIntent().getStringExtra("title");
        Movie movie = Parcels.unwrap(getIntent().getParcelableExtra("movie"));
        detailTitle.setText(movie.getTitle());
        detailOverview.setText(movie.getOverview());
        ratingBar.setRating((float) movie.getRating());
    }
}
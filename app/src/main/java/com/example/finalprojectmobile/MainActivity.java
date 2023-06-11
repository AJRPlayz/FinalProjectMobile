package com.example.finalprojectmobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    private ImageButton ib_movie, ib_tv, ib_favorite;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ib_movie = findViewById(R.id.mov_button);
        ib_tv = findViewById(R.id.tv_button);
        ib_favorite = findViewById(R.id.fav_button);

        fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentByTag(MoviesFragment.class.getSimpleName());

        if (!(fragment instanceof MoviesFragment)){
            pindahFragment(new MoviesFragment());
        }

        ib_movie.setOnClickListener(view -> {
            pindahFragment(new MoviesFragment());
        });

        ib_tv.setOnClickListener(view -> {
            pindahFragment(new TVShowsFragment());
        });

        ib_favorite.setOnClickListener(view -> {
            pindahFragment(new FavouriteFragment());
        });

    }

    private void pindahFragment(Fragment fragment) {
        fragmentManager.beginTransaction()
                .replace(R.id.frame_container, fragment, fragment.getClass().getSimpleName())
                .commit();
    }
}
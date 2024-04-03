package com.example.navdrawerrizzal;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import com.example.navdrawerrizzal.fragments.leaderboardFragment;
import com.example.navdrawerrizzal.fragments.listteamFragment;
import com.example.navdrawerrizzal.fragments.topscoreFragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        startFragment();

        drawerLayout = findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                if (itemId == R.id.leaderboard) {
                    openFragment(new leaderboardFragment());
                    getSupportActionBar().setTitle("Leaderboard EPL 2022/2023");
                } else if (itemId == R.id.TopScore) {
                    openFragment(new topscoreFragment());
                    getSupportActionBar().setTitle("List Top Score");
                } else if (itemId == R.id.recycler_list_team) {
                    openFragment(new listteamFragment());
                    getSupportActionBar().setTitle("Premier League Teams 2022/2023");
                }

                drawerLayout.closeDrawers();
                return true;
            }
        });
    }

    private void openFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_frame, fragment)
                .commit();
    }

    private void startFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_frame, new listteamFragment())
                .commit();

        getSupportActionBar().setTitle("Premier League Teams 2022/2023");
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        toggle.syncState();
    }
}

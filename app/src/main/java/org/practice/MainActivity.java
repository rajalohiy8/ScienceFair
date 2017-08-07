package org.practice;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    public boolean isFirstStart;
    Context mcontext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //App introduction
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                //  Intro App Initialize SharedPreferences
                SharedPreferences getSharedPreferences = PreferenceManager
                        .getDefaultSharedPreferences(getBaseContext());

                //  Create a new boolean and preference and set it to true
                isFirstStart = getSharedPreferences.getBoolean("firstStart", true);

                //  Check either activity or app is open very first time or not and do action
                if (isFirstStart) {

                    //  Launch application introduction screen
                    Intent i = new Intent(MainActivity.this, MyIntro.class);
                    startActivity(i);
                    SharedPreferences.Editor e = getSharedPreferences.edit();
                    e.putBoolean("firstStart", false);
                    e.apply();
                }
            }
        });
        t.start();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Welcome to Vigyan Bharti", Snackbar.LENGTH_LONG)
                        .setAction("Website", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                Intent lll = new Intent(MainActivity.this,Registration.class);
                                startActivity(lll);
                            }
                        }).show();
            }
        });
        ImageView iv = (ImageView) findViewById(R.id.img1);
        AnimationDrawable ac = new AnimationDrawable();
        int[] an = {R.drawable.model1, R.drawable.model2, R.drawable.model3, R.drawable.model4, R.drawable.model5, R.drawable.mainactmodi, R.drawable.mainactmin};
        for (int i = 0; i < an.length; i++) {
            ac.addFrame(getResources().getDrawable(an[i]), 3000);

        }
        iv.setBackgroundDrawable(ac);
        ac.setOneShot(false);
        ac.start();
        findViewById(R.id.LocateEvents).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent j = new Intent(MainActivity.this,Events.class);
                startActivity(j);
            }
        });
        findViewById(R.id.Events1).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent K = new Intent(MainActivity.this,Registration.class);
                startActivity(K);
            }
        });
        findViewById(R.id.Coordinators).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent FF = new Intent(MainActivity.this,Location.class);
                startActivity(FF);
            }
        });
        findViewById(R.id.AboutSrishti).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent f = new Intent(MainActivity.this,Contact.class);
                startActivity(f);
            }
        });
        findViewById(R.id.Sponsers).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent aaa = new Intent(MainActivity.this,About.class);
                startActivity(aaa);
            }
        });
        findViewById(R.id.EventsSchedule).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

               Intent dDd = new Intent(MainActivity.this,Homee.class);
                startActivity(dDd);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Intent XXX = new Intent(this,MainActivity.class);
            startActivity(XXX);
        } else if (id == R.id.nav_gallery) {
            Intent D = new Intent(this,Registration.class);
            startActivity(D);
        } else if (id == R.id.nav_slideshow) {
            Intent O = new Intent(this, Events.class);
            startActivity(O);
        } else if (id == R.id.nav_manage) {
            Intent P = new Intent(this,Homee.class);
            startActivity(P);
        } else if (id == R.id.nav_share) {

            Intent R = new Intent(this,Contact.class);
            startActivity(R);
        } else if (id == R.id.nav_send) {


            Intent A = new Intent(this,About.class);
            startActivity(A);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

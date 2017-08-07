package org.practice;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class Events extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.events);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Day 1"));
        tabLayout.addTab(tabLayout.newTab().setText("Day 2"));
        tabLayout.addTab(tabLayout.newTab().setText("Day 3"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final PagerAdapter adapter = new PagerAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add(0, 1, 1, R.string.title_section1);
        menu.add(0, 2, 2, R.string.title_section2);
        menu.add(0, 3, 3, R.string.title_section3);
        menu.add(0, 4, 4, R.string.title_section4);
        menu.add(0, 5, 5, R.string.title_section5);
        menu.add(0, 6, 6, R.string.title_section6);
        menu.add(0, 7, 7, R.string.title_section7);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case 1:

                Intent XXX = new Intent(this, MainActivity.class);
                startActivity(XXX);
                break;
            case 2:

                Intent D = new Intent(this, Registration.class);
                startActivity(D);
                break;
            case 3:

                Intent O = new Intent(this, Events.class);
                startActivity(O);
                break;
            case 4:

                Intent P = new Intent(this, Homee.class);
                startActivity(P);
                break;
            case 5:

                Intent Q = new Intent(this, Location.class);
                startActivity(Q);
                break;
            case 6:

                Intent R = new Intent(this, Contact.class);
                startActivity(R);
                break;
            case 7:

                Intent A = new Intent(this, About.class);
                startActivity(A);
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}


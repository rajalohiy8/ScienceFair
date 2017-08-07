package org.practice;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

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
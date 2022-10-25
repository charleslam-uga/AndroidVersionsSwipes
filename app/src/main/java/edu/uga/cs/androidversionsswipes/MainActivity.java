package edu.uga.cs.androidversionsswipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        // gain access to viewpager
        ViewPager2 pager = findViewById( R.id.viewpager );

        // get instance of our adapter with the custom class we made "AndroidVersionsPagerAdapter"
        AndroidVersionsPagerAdapter avpAdapter = new AndroidVersionsPagerAdapter(getSupportFragmentManager(), getLifecycle() );
        pager.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL );
        pager.setAdapter( avpAdapter );
    }
}
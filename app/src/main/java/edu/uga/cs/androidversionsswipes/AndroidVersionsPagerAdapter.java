package edu.uga.cs.androidversionsswipes;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

// use position values to indicate which version to display
public class AndroidVersionsPagerAdapter extends FragmentStateAdapter {

    // We will create an instance of this adapter in the
    // MainActivity class and set it to work with a
    // ViewPager2
    // constructor must be exactly like this for the FragmentState Adapter
    public AndroidVersionsPagerAdapter(FragmentManager fragmentManager, Lifecycle lifecycle ) {
        super( fragmentManager, lifecycle );
    }

    // Android will call this method "every time" the user
    // swipes left or right; the supplied "position"
    // parameter indicates the page position to display
    // while swiping
    @Override
    public Fragment createFragment(int position){
        return AndroidVersionFragment.newInstance( position );
    }

    // In this case, 13 android versions
    // call this method when it wants to know "how many pages will be available while swiping" (6 versions on the quiz)
    @Override
    public int getItemCount() {
        return AndroidVersionFragment.getNumberOfVersions();
    }
}

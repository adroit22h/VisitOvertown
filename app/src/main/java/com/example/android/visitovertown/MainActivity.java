package com.example.android.visitovertown;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
//    implements Historic.OnFragmentInteractionListener,Outdoors.OnFragmentInteractionListener,
//    Food.OnFragmentInteractionListener, Events.OnFragmentInteractionListener, GettingAround.OnFragmentInteractionListener,
//    Resources.OnFragmentInteractionListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("Historic"));
        tabLayout.addTab(tabLayout.newTab().setText("Outdoor"));
        tabLayout.addTab(tabLayout.newTab().setText("Food"));
        tabLayout.addTab(tabLayout.newTab().setText("Events"));
        tabLayout.addTab(tabLayout.newTab().setText("GettingAround"));
        tabLayout.addTab(tabLayout.newTab().setText("Resources"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = findViewById(R.id.vpPager);
        final PagerAdapter adapter = new PagerAdapter((getSupportFragmentManager()), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

//        //you need to delete all this and follow the lesson
//        viewPager.setOnPageChangeListerner(new TabLayout.TabLayoutOnPageChangeListerner(TabLayout));
//
//        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener()) {
//            @Override
//                    public void onTabSelected(TabLayout.Tab tab) {
//                viewPager.setCurrentItem();
//            }
//            @Override
//            public void onTabUnSelected(TabLayout.Tab tab) {
//
//                 }
//            @Override
//            public void onTabReSelected(TabLayout.Tab tab) {
//
//
//            }
    }
}

    //public void onFragmentInteraction(Uri uri) {
//
//    }
//}

//public class MainActivity extends AppCompatActivity {
//
//    FragmentPagerAdapter adapterViewPager;
//
//
//
//    public static class MyFragmentPagerAdapter extends FragmentPagerAdapter {
//        private static int NUM_ITEMS = 3;
//
//        public MyFragmentPagerAdapter(FragmentManager fragmentManager) {
//            super(fragmentManager);
//        }
//
//        // Returns total number of pages
//        @Override
//        public int getCount() {
//            return NUM_ITEMS;
//        }
//
//        // Returns the fragment to display for that page
//        @Override
//        public Fragment getItem(int position) {
//            switch (position) {
//                case 0: // Fragment # 0 - This will show FirstFragment
//                    return HistoricFragment.newInstance(0, "Page # 1");
//                case 1: // Fragment # 0 - This will show FirstFragment different title
//                    return HistoricFragment.newInstance(1, "Page # 2");
//                case 2: // Fragment # 1 - This will show SecondFragment
//                    return OutdoorsFragment.newInstance(2, "Page # 3");
//                default:
//                    return null;
//            }
//        }
//
//        // Returns the page title for the top indicator
//        @Override
//        public CharSequence getPageTitle(int position) {
//            return "Page " + position;
//        }
//
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        ViewPager vpPager = (ViewPager) findViewById(R.id.vpPager);
//
//        FragmentPagerAdapter adapter= new MyFragmentPagerAdapter(getSupportFragmentManager());
//        vpPager.setAdapter(adapterViewPager);
//    }
//
//    // ...
//}



    // ***sampleCode1
// private ViewPager pager = null;
//    private MainPageAdaper pagerAdapter = null;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//    //       ... do other initialization, such as create an ActionBar ...
//
//            pagerAdapter = new MainPageAdaper();
//            pager = (ViewPager) findViewById (R.id.viewpager);
//            pager.setAdapter (pagerAdapter);
//
//            // Create an initial view to display; must be a subclass of FrameLayout.
//            LayoutInflater inflater = context.getLayoutInflater();
//            FrameLayout v0 = (FrameLayout) inflater.inflate (R.layout.one_of_my_page_layouts, null);
//            pagerAdapter.addView (v0, 0);
//            pagerAdapter.notifyDataSetChanged();
//        }
//
//        //-----------------------------------------------------------------------------
//        // Here's what the app should do to add a view to the ViewPager.
//        public void addView (View newPage)
//        {
//            int pageIndex = pagerAdapter.addView (newPage);
//            // You might want to make "newPage" the currently displayed page:
//            pager.setCurrentItem (pageIndex, true);
//        }
//
//        //-----------------------------------------------------------------------------
//        // Here's what the app should do to remove a view from the ViewPager.
//        public void removeView (View defunctPage)
//        {
//            int pageIndex = pagerAdapter.removeView (pager, defunctPage);
//            // You might want to choose what page to display, if the current page was "defunctPage".
//            if (pageIndex == pagerAdapter.getCount())
//                pageIndex--;
//            pager.setCurrentItem (pageIndex);
//        }
//
//        //-----------------------------------------------------------------------------
//        // Here's what the app should do to get the currently displayed page.
//        public View getCurrentPage ()
//        {
//            return pagerAdapter.getView (pager.getCurrentItem());
//        }
//
//        //-----------------------------------------------------------------------------
//        // Here's what the app should do to set the currently displayed page.  "pageToShow" must
//        // currently be in the adapter, or this will crash.
//        public void setCurrentPage (View pageToShow)
//        {
//            pager.setCurrentItem (pagerAdapter.getItemPosition (pageToShow), true);
//        }
//    }
//
//

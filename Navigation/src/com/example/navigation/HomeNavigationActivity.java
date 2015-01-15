package com.example.navigation;

import static com.example.navigation.Logger.debug;
import android.app.ActionBar;
import android.app.ActionBar.TabListener;
import android.app.Activity;
import android.app.ActionBar.Tab;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class HomeNavigationActivity extends Activity implements TabListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_navigation);

        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.setDisplayOptions(ActionBar.DISPLAY_USE_LOGO);

        Tab homeTab = actionBar.newTab().setText(R.string.action_home);
        homeTab.setTabListener(this);
        actionBar.addTab(homeTab);

        Tab addTab = actionBar.newTab().setText(R.string.action_addtask);
        addTab.setTabListener(this);
        actionBar.addTab(addTab);

        Tab viewTab = actionBar.newTab().setText(R.string.action_viewtask);
        viewTab.setTabListener(this);
        actionBar.addTab(viewTab);

        Tab settingsTab = actionBar.newTab().setText(R.string.action_settings);
        settingsTab.setTabListener(this);
        actionBar.addTab(settingsTab);
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.home_navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onTabSelected(Tab tab, FragmentTransaction ft) {
        debug(tab.getTag() + " at position " + tab.getPosition() + " having text " + tab.getText()
                + " selected. ");
        Fragment fragment = null;

        switch (tab.getPosition()) {
        // HOME
            case 0: {
                fragment = new HomeFragment();
                break;
            }
            // ADD
            case 1: {
                fragment = new AddFragment();

                break;
            }
            // VIEW
            case 2: {
                fragment = new ViewFragment();
                break;
            }
            // SETTINGS
            case 3: {
                fragment = new SettingsFragment();
                break;
            }
            default:
                break;
        }
        debug("fragment object = " + fragment);

        if (fragment != null) {
            getFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
        }
    }

    @Override
    public void onTabUnselected(Tab tab, FragmentTransaction ft) {
    }

    @Override
    public void onTabReselected(Tab tab, FragmentTransaction ft) {
    }

}

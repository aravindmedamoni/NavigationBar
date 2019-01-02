package com.example.medamoniaravind.slidingmenu;

import android.os.Bundle;
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

import com.example.medamoniaravind.slidingmenu.Fragments.AboutFragment;
import com.example.medamoniaravind.slidingmenu.Fragments.ContactFragment;
import com.example.medamoniaravind.slidingmenu.Fragments.HomeFragment;
import com.example.medamoniaravind.slidingmenu.Fragments.MyTicketFragment;
import com.example.medamoniaravind.slidingmenu.Fragments.TermsnCondFragment;

public class SlideActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
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
        getMenuInflater().inflate(R.menu.slide, menu);
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

        if (id == R.id.nav_home) {
            HomeFragment homeFragment=new HomeFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();
            // Handle the camera action
        } else if (id == R.id.nav_mytickets) {
            MyTicketFragment myTicketFragment=new MyTicketFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.container,myTicketFragment).commit();

        } else if (id == R.id.nav_abt) {
            AboutFragment aboutFragment=new AboutFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.container,aboutFragment).commit();

        } else if (id == R.id.nav_contact) {
            ContactFragment contactFragment=new ContactFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.container,contactFragment).commit();

        } else if (id == R.id.termsandcond) {
            TermsnCondFragment termsnCondFragment=new TermsnCondFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.container,termsnCondFragment).commit();

        } else if (id == R.id.logout) {

        }else if (id==R.id.share){

        }else if (id==R.id.rateus){

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

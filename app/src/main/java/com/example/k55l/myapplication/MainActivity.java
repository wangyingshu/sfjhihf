package com.example.k55l.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton floatingActionButton;
    private TextView textView;
    private CoordinatorLayout coordinatorLayout;
    private RecyclerView recyclerView;
    private FloatingActionButton button;
    private NestedScrollView nestedScrollView;
    private Toolbar toolbar;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private DrawerLayout drawerLayout;
    private  NavigationView navigationview;
    private ArrayList<WysBean>wysBeen = new ArrayList<WysBean>();
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.list);
        drawerLayout = (DrawerLayout) findViewById(R.id.main_content1);
        navigationview = (NavigationView) findViewById(R.id.navigationview);
        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.main_content);
        final Recy recy = new Recy(MainActivity.this);
        button = (FloatingActionButton) findViewById(R.id.button1);
        floatingActionButton = (FloatingActionButton) findViewById(R.id.button);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recy);
        nestedScrollView = (NestedScrollView) findViewById(R.id.scrollView);
        button.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if (button.getVisibility() == View.GONE)
                    floatingActionButton.setVisibility(View.VISIBLE);
                if (button.getVisibility() == View.VISIBLE)
                    floatingActionButton.setVisibility(View.GONE);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Main2.class);
                startActivity(intent);
            }
        });
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // nestedScrollView.fullScroll(0); 滚回首页
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent();
                        intent.setClass(MainActivity.this,Main2.class);
                        startActivity(intent);
                    }
                });
            }
        });
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("title");
        toolbar.inflateMenu(R.menu.menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return true;
            }
        });
//        toolbar.setNavigationIcon(R.drawable.ic_menu_camera);
//        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                NavigationView navigationView = (NavigationView) findViewById(R.id.navigationview);
//                navigationView.setVisibility(View.VISIBLE);
//            }
//        });
        actionBarDrawerToggle = new ActionBarDrawerToggle(MainActivity.this, drawerLayout, toolbar, R.string.open, R.string.close);
        actionBarDrawerToggle.syncState();;
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        navigationview.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                Snackbar.make(drawerLayout,item.getTitle()+"",Snackbar.LENGTH_LONG).show();
                return true;
            }
        });}
       public void intolist(){
        for(int i =0;i<10;i++) {
          WysBean wys = new WysBean();
            wysBeen.add(0,wys);
            wysBeen.notify();
        }
    }
    public ArrayList<WysBean> getArrayList(){
    return  wysBeen;
}}
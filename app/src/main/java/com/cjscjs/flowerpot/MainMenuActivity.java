package com.cjscjs.flowerpot;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainMenuActivity extends AppCompatActivity {

    android.support.v7.widget.Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle drawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        navigationView=findViewById(R.id.navi);
        drawerLayout=findViewById(R.id.layout_drawer);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        drawerToggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.app_name,R.string.app_name);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        drawerToggle.syncState();
        drawerLayout.addDrawerListener(drawerToggle);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.menu_company:

                        break;
                    case R.id.menu_house:
                        break;
                    case R.id.menu_product:
                        break;
                    case R.id.menu_design:
                        break;
                    case R.id.menu_review:
                        break;
                    case R.id.menu_one:
                        break;
                    case R.id.menu_map:

                        Intent intent=new Intent(MainMenuActivity.this,MapActivity.class);
                        startActivity(intent);
                        break;

                }

                return false;
            }
        });
    }



    public boolean onOptionsItemSelected(MenuItem item) {



        drawerToggle.onOptionsItemSelected(item);
        return super.onOptionsItemSelected(item);
    }

}

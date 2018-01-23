package com.coursework.mavisss.lifesaver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class UserMenu extends AppCompatActivity {

    String[] arrUserMenu = {"My Account", "Trip Manager", "Information", "S&R Staff", "Help"};
    ListView lvUserMenu;
    ArrayAdapter<String> adapterUserMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_menu);
        
        addControlS();
        addEvents();
    }

    //Events when click on each menu item
    private void addEvents() {
        lvUserMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:

                        break;
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    default:
                }
            }
        });
    }
    //Set up user menu controller
    private void addControlS() {
        lvUserMenu = (ListView) findViewById(R.id.lvUserMenu);
        adapterUserMenu = new ArrayAdapter<String>(UserMenu.this, android.R.layout.simple_list_item_1, arrUserMenu);
        lvUserMenu.setAdapter(adapterUserMenu);
    }
}

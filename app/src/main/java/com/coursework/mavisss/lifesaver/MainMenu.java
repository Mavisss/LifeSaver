package com.coursework.mavisss.lifesaver;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainMenu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);


        Button btnMenu = (Button) findViewById(R.id.btnMenu);
        Button btnChkLocation = (Button) findViewById(R.id.btnChkLocation);
        Button btnOpenChatR = (Button) findViewById(R.id.btnOpenChatR);

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainMenu.this, UserMenu.class);
                startActivity(intent1);
            }
        });
        btnChkLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainMenu.this, CheckLocation.class);
                startActivity(intent2);
            }
        });
        btnOpenChatR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainMenu.this, ChatRoom.class);
                startActivity(intent3);
            }
        });
    }
}



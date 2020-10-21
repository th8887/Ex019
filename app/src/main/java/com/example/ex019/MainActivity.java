package com.example.ex019;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout bg; //background

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bg=(LinearLayout) findViewById(R.id.bg);
    }

    public void go(View view) {
        Intent go=new Intent(this,newColor.class);
        startActivity(go);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //entry claim:bulids option menu
        //exit claim:according to what you choose, the background will change its colors.
        //Inflate the menu: adds items to the Option Menu.
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //entry claim: gets the chosen option.
        //exit claim:changes the background color according to the choice.
        int id=item.getItemId();
        if (id==R.id.blue)
            bg.setBackgroundColor(Color.BLUE);
        else if(id==R.id.purple)
                bg.setBackgroundColor(Color.MAGENTA);
            else
                bg.setBackgroundColor(Color.RED);
        return true;
    }
}
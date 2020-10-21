package com.example.ex019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class newColor extends AppCompatActivity {
    LinearLayout bg; //background

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_color);

        bg=(LinearLayout) findViewById(R.id.bg);
    }

    public void back(View view) {
        //entry claim:the button that was pressed.
        // exit claim:closes one activity and moves to the second one.
        Intent back= new Intent(this,MainActivity.class);
        startActivity(back);
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //entry claim:bulids option menu
        //axit claim:according to what you choose, the background will change its colors.
        //Inflate the menu: adds items to the Option Menu.
        getMenuInflater().inflate(R.menu.main,menu);
        menu.add(0,0,400,"yellow");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //entry claim: gets the chosen option.
        //exit claim:changes the background color according to the choice.
        String st=item.getTitle().toString();
        int id=item.getItemId();
        if(st=="yellow")
            bg.setBackgroundColor(Color.YELLOW);
        else if (id==R.id.blue)
            bg.setBackgroundColor(Color.BLUE);
        else if(id==R.id.purple)
            bg.setBackgroundColor(Color.MAGENTA);
        else
            bg.setBackgroundColor(Color.RED);
        return true;
    }
}
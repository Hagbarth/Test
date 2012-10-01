package com.example.test;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.Editable;
import android.view.*;
import android.widget.Button;
import android.widget.EditText;

public class WelcomeScreen extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        
        final Button button = (Button) findViewById(R.id.button1);
        final EditText name = (EditText) findViewById(R.id.editText1);
       
        
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	 String passName = name.getText().toString();
            	 
            	 Intent goToNextActivity = new Intent(getApplicationContext(), HelloScreen.class);
            	 goToNextActivity.putExtra("name", passName);
            	 startActivity(goToNextActivity);
            }	
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_welcome_screen, menu);
        return true;
    }
}

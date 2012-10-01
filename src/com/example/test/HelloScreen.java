package com.example.test;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class HelloScreen extends Activity {
	//Testing if commit works
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_screen);
        
        TextView displayName = (TextView) findViewById(R.id.textView1);
        
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        
        displayName.setText("Hello " + name + "!");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_hello_screen, menu);
        return true;
    }
}
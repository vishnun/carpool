package com.buddies.PoolMeIn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class GreetInNewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.greet_in_new_screen);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        ((TextView) findViewById(R.id.greetText)).setText("Hello " + name);
    }
}

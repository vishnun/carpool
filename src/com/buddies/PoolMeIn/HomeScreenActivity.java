package com.buddies.PoolMeIn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        Button needACar = (Button) findViewById(R.id.need_car_button);
        needACar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NeedACarActivity.class);
                startActivity(intent);
            }
        });


        Button submitBtn = (Button) findViewById(R.id.greet_here);
        Button newActivityBtn = (Button)findViewById(R.id.green_in_new_activity);

        newActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = String.valueOf(((TextView) findViewById(R.id.editText)).getText());
                Intent intent = new Intent(getApplicationContext(), GreetInNewActivity.class);
                intent.putExtra("name",name);
                startActivity(intent);
            }
        });

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = String.valueOf(((TextView) findViewById(R.id.editText)).getText());
                ((TextView)findViewById(R.id.textView)).setText("Hello " + text);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_screen, menu);
        return true;
    }
    
}

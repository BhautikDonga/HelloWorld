package com.bhautik.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Set;

public class MainActivity extends AppCompatActivity {//implements View.OnClickListener {

    Button button = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button_hello_world);

        //button.setOnClickListener(this);

    }

    public void toggle(View v) {
//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://start.duckduckgo.com"));
//        startActivity(intent);
        startActivity(new Intent(this, Settings.class));
    }



    /*@Override
    public void onClick(View v) {
        //Toast.makeText(this, "You clicked me!", Toast.LENGTH_SHORT).show();
        if (button.getText().toString().equals("HelloWorld")) {
            button.setText(R.string.button_1_text);
        } else {
            button.setText(R.string.app_name);
        }

    }*/
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.i(TAG, "start");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.i(TAG, "pause");
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Log.i(TAG, "restart");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.i(TAG, "stop");
//    }
}

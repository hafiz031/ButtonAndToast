package com.example.hafiz.buttonandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.i("My app","Thsis is a log message");
                Toast.makeText(getApplicationContext(),"bla bla bla..This is an example of toast",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Successive toasts are shown like this",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Long toast lingers more",Toast.LENGTH_LONG).show();
            }
        });
    }
}
//hafiz031
package com.example.drmednotifier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void xyz(View y){


        findViewById(R.id.main_button).setEnabled(false);
        ((Button)findViewById(R.id.main_button)).setText("new new disable");


        
    }

    public void handleText(View v){


        TextView t = findViewById(R.id.source);
        String input = t.getText().toString();

        ((TextView)findViewById(R.id.output)).setVisibility(View.VISIBLE);
        ((TextView)findViewById(R.id.output)).setText(input);

        ((Button)findViewById(R.id.button)).setText(input);



        /* alert action   */
        Toast.makeText(this, "Alert u whats wrong u did", Toast.LENGTH_SHORT).show();

    }

    /*launch new activity*/
    public void launchSettings(View x){

        Intent i = new Intent(this,SettingsActivity.class);
     /* test data transfer
       String input = ((TextView)findViewById(R.id.source)).getText().toString();
       i.putExtra("COOL",input);*/

        startActivity(i);

    }





}


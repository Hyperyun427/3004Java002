package com.example.a3004java001;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.a3004java001.R.id.fragment_container_view_tag;

public class Second_page_skip_input extends AppCompatActivity {
    EditText nameTxt;

/*
    private Fragment createCustomFragment(){

        Bundle bundle = new Bundle();
        bundle.putString(MY_CUSTOM_FRAGMENT_KEY,"Yun Huang");

        Frag_Selfreport frag_selfreport = new Frag_Selfreport();
        frag_selfreport.setArguments(bundle);
        return frag_selfreport;


    }*/



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page_skip_input);






/*
        TextView x = (TextView)findViewById(R.id.Name);
        String N = x.getText().toString();
        Frag_Selfreport frag_selfreport = new Frag_Selfreport();
        frag_selfreport.setMyData(N);
*/


/*
         nameTxt = (EditText) findViewById(R.id.Name);
        Button fab = (Button) findViewById(R.id.button3);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendData();
            }
        });*/









    }




/*
    private void sendData() {
        //PACK DATA IN A BUNDLE
        Bundle bundle = new Bundle();
        bundle.putString("NAME_KEY", nameTxt.getText().toString());

        //PASS OVER THE BUNDLE TO OUR FRAGMENT
        Frag_Selfreport myFragment = new Frag_Selfreport();
        myFragment.setArguments(bundle);


        //THEN NOW SHOW OUR FRAGMENT
        getSupportFragmentManager().beginTransaction().replace(R.id.container,myFragment).commit();
    }

*/


    public void launchActivists(View x){

        Intent i = new Intent(this,Nav_page.class);

        String Namee = ((EditText)findViewById(R.id.Name)).getText().toString();
        i.putExtra("Name",Namee);

        String Agee = ((EditText)findViewById(R.id.age)).getText().toString();
        i.putExtra("Age",Agee);



        startActivity(i);

    }






}
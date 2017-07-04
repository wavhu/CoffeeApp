package com.example.codetribe.coffeeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

//import static com.example.codetribe.coffeeapp.R.drawable.esspr;
//import static com.example.codetribe.coffeeapp.R.drawable.icetea;

public class Main2Activity extends AppCompatActivity {

    ///MainActivity main = new MainActivity();
    //ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       // img = (ImageView)findViewById(R.id.image);

        //if(main.order.equalsIgnoreCase("Ice Tea")){
            //img.setImageResource(R.drawable.icetea);
       // }
       // else if(main.order.equalsIgnoreCase("Espresso")){
          //  img.setImageResource(R.drawable.esspr);
       // }
    }
}

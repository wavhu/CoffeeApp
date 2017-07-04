package com.example.codetribe.coffeeapp;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnicetea, btnespresso, btncappuccino, btnmintblendtea;
    private double total = 0;
    private Dialog dialog;
    private AlertDialog.Builder builder;
    public static String order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnicetea = (Button) findViewById(R.id.btnicetea);
        btnespresso = (Button) findViewById(R.id.btnesspreso);
        btncappuccino = (Button) findViewById(R.id.btncappuccino);
        btnmintblendtea = (Button) findViewById(R.id.btnmintblendtea);


        btnicetea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog = new Dialog(MainActivity.this);
                builder = new AlertDialog.Builder(MainActivity.this);

                builder.setTitle("Order your icetea");
                builder.setMessage("R25.35");
                builder.setNegativeButton("cancel", null);
                builder.setPositiveButton("Order", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Double price = 25.35;
                       // total = total + price;

                        order = "Ice Tea";

                        Toast.makeText(MainActivity.this, "you ordered icetea and total is R"+price, Toast.LENGTH_LONG).show();
                        Intent intent1 =new Intent(MainActivity.this, Main3Activity.class);
                        startActivity(intent1);

                    }


                });

                dialog = builder.create();
                dialog.show();
            }
        });

        btnmintblendtea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog=new Dialog(MainActivity.this);
                builder=new AlertDialog.Builder(MainActivity.this);

                builder.setTitle("Order your mintblend");
                builder.setMessage("R30.33");
                builder.setNegativeButton("cancel",null);
                builder.setPositiveButton("Order", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Double price =30.33;
                        //total =total+price;

                        Toast.makeText(MainActivity.this, "you ordered mintblend and the total is R"+price ,Toast.LENGTH_LONG).show();
                    }


                });

                Intent intent2=new Intent(MainActivity.this, Main2Activity.class);
                        startActivity(intent2);

                dialog = builder.create();
                dialog.show();
            }
        });


        btncappuccino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog=new Dialog(MainActivity.this);
                builder=new AlertDialog.Builder(MainActivity.this);

                builder.setTitle("Order your cappuccino");
                 builder.setMessage("R40.50");
                builder.setNegativeButton("cancel",null);
                builder.setPositiveButton("order", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Double price=40.50;
                        //total=total+price;

                        Toast.makeText(MainActivity.this,"you ordered cappuccino and the total is R"+price,Toast.LENGTH_LONG).show();

                        Intent intent4=new Intent(MainActivity.this, Main5Activity.class);
                        startActivity(intent4);

                    }
                });

                dialog=builder.create();
                dialog.show();
            }
        });

        btnespresso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog=new Dialog(MainActivity.this);
                builder=new AlertDialog.Builder(MainActivity.this);

                builder.setTitle("Order your espresso");
                builder.setMessage("R20.20");
                builder.setNegativeButton("cancel",null);
                builder.setPositiveButton("order", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Double price=20.20;
                        //total=total+price;



                        Intent intent3 =new Intent(MainActivity.this, Main4Activity.class);
                        startActivity(intent3);
                        Toast.makeText(MainActivity.this,"you ordered espresso and the total is R"+price,Toast.LENGTH_LONG).show();
                    }
                });

                dialog=builder.create();
                dialog.show();


            }
        });





    }


}

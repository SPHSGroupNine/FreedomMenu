package com.test.freedommenu_v2;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


//this class deals with the two arrow buttons and the home button.

public class homeCategories extends Activity {

    private static Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_categories);  //set layout
        OnClickButtonListener1();
        OnClickButtonListener2();
        OnClickButtonListener3();
        OnClickButtonListener4();
        OnClickButtonListener5();
        OnClickButtonListener6();
    }



    public void OnClickButtonListener1() {
        button = (Button) findViewById(R.id.homesalad);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.test.freedommenu_v2.cobbSalad");
                        startActivity(intent);
                    }

                }
        );

    }



    public void OnClickButtonListener2() {
        button = (Button) findViewById(R.id.homesoupssides);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.test.freedommenu_v2.chips");
                        startActivity(intent);
                    }

                }
        );

    }



    public void OnClickButtonListener3() {
        button = (Button) findViewById(R.id.homehotpaninis);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.test.freedommenu_v2.governor");
                        startActivity(intent);
                    }

                }
        );



    }


    public void OnClickButtonListener4() {
        button = (Button) findViewById(R.id.homecoldcuts);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.test.freedommenu_v2.turkeyBreast");
                        startActivity(intent);
                    }

                }
        );



    }

    public void OnClickButtonListener5() {
        button = (Button) findViewById(R.id.homebeverages);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.test.freedommenu_v2.icedTea");
                        startActivity(intent);
                    }

                }
        );



    }

    public void OnClickButtonListener6() {
        button = (Button) findViewById(R.id.homedesserts);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.test.freedommenu_v2.baklava");
                        startActivity(intent);
                    }

                }
        );



    }


}
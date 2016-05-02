package com.test.freedommenu_v2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


//this class deals with the two arrow buttons and the home button.

public class chickenSaladSandwich extends Activity {

    private static Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chicken_salad_sandwich);  //set layout
        OnClickButtonListener1();
        OnClickButtonListener2();
        OnClickButtonListener3();
        OnClickButtonListener4();
    }

    /**************************************HOME BUTTON********************************************/

    public void OnClickButtonListener1() {
        button = (Button) findViewById(R.id.homeButtonChickenSaladSandwich);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.test.freedommenu_v2.homeCategories");
                        startActivity(intent);
                    }

                }
        );

    }

    /**************************************LEFT ARROW********************************************/

    public void OnClickButtonListener2() {
        button = (Button) findViewById(R.id.arrowLeftChickenSaladSandwich);
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

    /**************************************RIGHT ARROW********************************************/

    public void OnClickButtonListener3() {
        button = (Button) findViewById(R.id.arrowRightChickenSaladSandwich);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.test.freedommenu_v2.shrimpSalad");
                        startActivity(intent);
                    }

                }
        );



    }

    /**************************************INGREDIENTS********************************************/

    public void OnClickButtonListener4() {
        button = (Button) findViewById(R.id.ingredientsChickenSaladSandwich);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.test.freedommenu_v2.ingredientsChickenSaladSandwich");
                        startActivity(intent);
                    }

                }
        );



    }



}
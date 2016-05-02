package com.test.freedommenu_v2;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


//this class deals with the two arrow buttons and the home button.

public class cobbSalad extends Activity {

    private static Button button;
    MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cobb_salad);  //set layout
        OnClickButtonListener1();
        OnClickButtonListener2();
        OnClickButtonListener3();
        OnClickButtonListener4();
        OnClickButtonListener5();


        mPlayer = MediaPlayer.create(this, R.raw.cobbsaladaudio);

    }

    /***************************************SOUND**************************************************/

    public void playSound(View view) {
        mPlayer.start();
    }

    /*************************************** HOME BUTTON********************************************/

    public void OnClickButtonListener1() {
        button = (Button) findViewById(R.id.homeButtonCobbSalad);
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

    /*************************************** LEFT ARROW********************************************/

    public void OnClickButtonListener2() {
        button = (Button) findViewById(R.id.arrowLeftCobbSalad);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.test.freedommenu_v2.chefSalad");
                        startActivity(intent);
                    }

                }
        );

    }

    /*************************************** RIGHT ARROW********************************************/

    public void OnClickButtonListener3() {
        button = (Button) findViewById(R.id.arrowRightCobbSalad);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.test.freedommenu_v2.spinachChickenSalad");
                        startActivity(intent);
                    }

                }
        );


    }

    /*************************************** INGREDIENTS********************************************/

    public void OnClickButtonListener4() {
        button = (Button) findViewById(R.id.ingredientsCobbSalad);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.test.freedommenu_v2.ingredientsCobbSalad");
                        startActivity(intent);
                    }

                }
        );


    }

    /**************************************** CHECKOUT********************************************/

    public void OnClickButtonListener5() {
        button = (Button) findViewById(R.id.checkoutCobbSalad);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.test.freedommenu_v2.checkout");
                        startActivity(intent);
                    }

                }
        );

    }
}



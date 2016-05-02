package com.test.freedommenu_v2;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class checkout extends Activity {

    private static Button button;
    MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkout);
        OnClickButtonListener1();

        mPlayer = MediaPlayer.create(this, R.raw.cobbsaladaudio);
    }

    /***************************************
     * SOUND
     **************************************************/

    public void playSound(View view) {
        mPlayer.start();
    }

    /**************************************** HOME BUTTON********************************************/

    public void OnClickButtonListener1() {
        button = (Button) findViewById(R.id.homeButtonCheckout);
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





}

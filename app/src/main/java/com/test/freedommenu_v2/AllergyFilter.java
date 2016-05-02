package com.test.freedommenu_v2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//this class deals with the two arrow buttons and the home button.

public class AllergyFilter extends Activity {

    private static Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allergy_filter);  //set layout
        OnClickButtonListener1();
        OnClickButtonListener2();
    }

    /**************************************YES********************************************/

    public void OnClickButtonListener1() {
        button = (Button) findViewById(R.id.yesAllergy);
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

    /**************************************NO********************************************/

    public void OnClickButtonListener2() {
        button = (Button) findViewById(R.id.noAllergy);
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




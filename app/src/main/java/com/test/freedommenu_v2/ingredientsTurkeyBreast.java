package com.test.freedommenu_v2;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ingredientsTurkeyBreast extends Activity {

    private static Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ingredients_turkey_breast); // set layout
        OnClickButtonListener1();
    }

    public void OnClickButtonListener1() {
        button = (Button) findViewById(R.id.ingredientsButtonReturnTurkeyBreast); //This won't have to be changed
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
}
package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = findViewById(R.id.image_eightBall);

        final int []   ballArray =  new int[]{
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        Button myButton = findViewById(R.id.askButton);

       // Tell the button to listen for clicks
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.d("EightBoll", "This is onClickListener");
                //This piece of code will be executed when myButton is clicked
                Random randomNumberGenerator = new Random();    //Create a random number generator
                int number = randomNumberGenerator.nextInt(5);

                ballDisplay.setImageResource(ballArray[number]); //Grab the proper resource for the number

            }
        });

    }
}


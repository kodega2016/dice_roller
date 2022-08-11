package com.kodega.dice_roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        //find the button
        val rollButton:Button=findViewById(R.id.roll_dice);
        //set onClickHandler
        rollButton.setOnClickListener{
            rollDice();
        }
    }

    private fun rollDice(){
//        val rollResult:TextView=findViewById(R.id.result_text);

        val rollImage:ImageView=findViewById(R.id.image_view);

        val dice=Random().nextInt(6)+1

        var drawableResource=when(dice){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            6->R.drawable.dice_6
            else->R.drawable.empty_dice;
        }

        rollImage.setImageResource(drawableResource);

//        rollResult.text=dice.toString();
    }

}
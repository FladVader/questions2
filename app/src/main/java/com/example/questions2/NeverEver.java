package com.example.questions2;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

import java.util.Random;

import static com.example.questions2.MainActivity.letters;


public class NeverEver implements card {

    private String text;

    public NeverEver(String text) {

        this.text = text;

    }



    @Override
    public void show(View view) {

        TextView edit = (TextView) view.findViewById(R.id.textBox);
        //Random rand = new Random();
        ImageView image = view.findViewById(R.id.pictureDayImg);
        ImageView scott = view.findViewById(R.id.imageView);
        ImageView mostlikely = view.findViewById(R.id.imageView_mostlikely);

        //int randNr = rand.nextInt(letters.size());

        mostlikely.setVisibility(View.GONE);
        image.setVisibility(View.GONE);

        scott.setVisibility(View.VISIBLE);
        edit.setBackgroundColor(Color.parseColor("#DBFF33"));

        edit.setText(String.format("Jag har aldrig  %s", this.text));
        //letters.remove(randNr);


    }
}

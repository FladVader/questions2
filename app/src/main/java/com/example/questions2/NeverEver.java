package com.example.questions2;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class NeverEver implements card {

    private String text;

    public NeverEver(String text) {

        this.text = text;

    }

    @Override
    public void show() {

        /*

        TextView edit = (TextView) findViewById(R.id.textBox);
        Button btnAnswer = findViewById(R.id.btnShowAnswer);
        pictureDay tempPic = new pictureDay("", "", "", "");
        ImageView image = findViewById(R.id.pictureDayImg);

        for (pictureDay pic: pictureDays) {

            if (edit.getText().toString().equals(pic.question)){
                edit.setText(pic.answer);
                tempPic = pic;
            }
        }



        btnAnswer.setVisibility(View.GONE);
        Button btnNext = findViewById(R.id.button);
        btnNext.setVisibility(View.VISIBLE);
        Picasso.get().load(tempPic.url2).into(image);


       // pictureDays.remove(tempPic);


    */

    }
}

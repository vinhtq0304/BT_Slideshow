package com.example.administrator.bt_slideshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    Button btn1,btn2;
    TextView txt;
    ArrayList<Pictures> arr= new ArrayList<>();
    int pos=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControl();
        intitData();
        addEvent();
    }

    private void addEvent() {
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pos++;
                if(pos==arr.size())
                    pos=0;
                img.setImageResource(arr.get(pos).getImage());
                txt.setText(arr.get(pos).getText());
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pos--;
                if(pos<0)
                    pos=arr.size()-1;
                img.setImageResource(arr.get(pos).getImage());
                txt.setText(arr.get(pos).getText());
            }
        });
    }

    private void intitData() {
        arr.add(new Pictures(R.drawable.pokemon_01,"1 OF 13"));
        arr.add(new Pictures(R.drawable.pokemon_02,"2 OF 13"));
        arr.add(new Pictures(R.drawable.pokemon_03,"3 OF 13"));
        arr.add(new Pictures(R.drawable.pokemon_04,"4 OF 13"));
        arr.add(new Pictures(R.drawable.pokemon_05,"5 OF 13"));
        arr.add(new Pictures(R.drawable.pokemon_06,"6 OF 13"));
        arr.add(new Pictures(R.drawable.pokemon_07,"7 OF 13"));
        arr.add(new Pictures(R.drawable.pokemon_08,"8 OF 13"));
        arr.add(new Pictures(R.drawable.pokemon_09,"9 OF 13"));
        arr.add(new Pictures(R.drawable.pokemon_11,"10 OF 13"));
        arr.add(new Pictures(R.drawable.pokemon_12,"11 OF 13"));
        arr.add(new Pictures(R.drawable.pokemon_13,"12 OF 13"));

        img.setImageResource(arr.get(pos).getImage());
        txt.setText(arr.get(pos).getText());
    }

    private void addControl() {
        img=(ImageView) findViewById(R.id.id_img);
        btn1=(Button) findViewById(R.id.id_btn1);
        btn2=(Button) findViewById(R.id.id_btn2);
        txt= (TextView) findViewById(R.id.id_textView2);
    }
}

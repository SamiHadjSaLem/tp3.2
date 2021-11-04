package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class plat extends AppCompatActivity {
    TextView tv;
    ImageView img;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plat);
        tv=findViewById(R.id.textview_first);
        img=findViewById(R.id.imageView);
        Bundle extras=getIntent().getExtras();
        String element=extras.getString("decription");
        // Toast.makeText(Description.this,element,Toast.LENGTH_LONG).show();
        btn=findViewById(R.id.button_first);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(plat.this,MainActivity.class);
                startActivity(i2);
            }
        });

        if(element.equals("Word 0")){
            tv.setText("description");
            //set image in recycleView
            Drawable myDrawable = getResources().getDrawable(R.drawable.spag);
            img.setImageDrawable(myDrawable);
        }
        else if(element.equals("Word 1")){
            tv.setText("description");
            //set image in recycleView;
            Drawable myDrawable = getResources().getDrawable(R.drawable.cake);
            img.setImageDrawable(myDrawable);



        }

    }
}
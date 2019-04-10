package com.example.erastus.testmagangandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

    public class Image_Activity extends AppCompatActivity {

        private TextView tvtitle,tvdescription,tvcategory;
        private ImageView img;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_image_);

            tvtitle = (TextView) findViewById(R.id.txttitle);
            tvdescription = (TextView) findViewById(R.id.txtDesc);
            img = (ImageView) findViewById(R.id.imagethumbnail);

            // Recieve data
            Intent intent = getIntent();
            String Title = intent.getExtras().getString("Title");
            String Description = intent.getExtras().getString("Description");
            int image = intent.getExtras().getInt("Thumbnail") ;

            // Setting values

            tvtitle.setText(Title);
            tvdescription.setText(Description);
            img.setImageResource(image);


        }
    }
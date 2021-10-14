package com.fateme.restaurantdeveloper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView cardStarters;
    CardView cardMains;
    CardView cardDesserts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardMains = findViewById(R.id.card_view_mains);
        cardStarters = findViewById(R.id.card_view_starters);
        cardDesserts = findViewById(R.id.card_view_desserts);

        cardStarters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent starterActivityIntent = new Intent(MainActivity.this,StarterActivity.class);

                startActivity(starterActivityIntent);
            }
        });

        cardMains.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mainActivityIntent = new Intent(MainActivity.this,MainCoursesActivity.class);

                startActivity(mainActivityIntent);
            }
        });


        cardDesserts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent dessertsActivityIntent = new Intent(MainActivity.this,DessertsActivity.class);

                startActivity(dessertsActivityIntent);
            }
        });

        TextView emailTextView = findViewById(R.id.txt_view_email_address);

        emailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchEmailIntent = new Intent(Intent.ACTION_SENDTO);
                launchEmailIntent.setData(Uri.parse("mailto:restaurantdeveloper@fateme.com"));
                startActivity(launchEmailIntent);
            }
        });

    }
}
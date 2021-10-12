package com.fateme.restaurantdeveloper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView cardStarters;
    CardView cardMains;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardMains = (CardView) findViewById(R.id.card_view_mains);
        cardStarters = (CardView) findViewById(R.id.card_view_starters);

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

    }
}
package com.fateme.restaurantdeveloper;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DessertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);

        ListView listViewDesserts = findViewById(R.id.list_view_desserts);

        Dish[] desserts = {
                new Dish("Apple and lobster cake", "Moist cake made with red apple and fresh lobster", 10),
                new Dish("Prune and courgette buns", "Moist buns made with fresh prune and yellow courgette", 12),
                new Dish("Chilli and milk chocolate mousse", "A creamy mousse made with habanero chilli and milk chocolate", 8),
                new Dish("Hazelnut and cheese pancake", "Crispy pancake filled with hazelnut and creamy cheese", 15),
                new Dish("Guava and rhubarb cheesecake", "A rich cheesecake layered with fresh guava and rhubarb", 10),
                new Dish("Duck and plantain crepes", "Crispy crepes filled with duck and fresh plantain", 16),
                new Dish("Raspberry and blueberry cupcakes", "Moist cupcakes made with fresh raspberry and blueberry", 12),
                new Dish("Pepper and chilli dip", "A dip made from roasted pepper and habanero chilli", 15),
                new Dish("Raisin and cardamom muffins", "Moist muffins made with fresh raisin and green cardamom", 18),
                new Dish("Ricotta and leek dumplings", "Thin pastry cases stuffed with ricotta and frizzled leek", 15)
        };


        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, desserts);

        listViewDesserts.setAdapter(dishesAdapter);
    }
}

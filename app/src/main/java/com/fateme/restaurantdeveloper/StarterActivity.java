package com.fateme.restaurantdeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StarterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);

        ListView listViewStarters = (ListView) findViewById(R.id.list_view_starters);

        Dish[] dishes = {
                new Dish("Chilli and leek soup", "Thin pastry cases stuffed with sole and green cardamom", 30),
                new Dish("Parsley and salmon parcels", "Thin filo pastry cases stuffed with fresh parsley and freshly-caught salmon", 35),
                new Dish("Chilli and leek soup","Thin pastry cases stuffed with sole and green cardamom",30),
                new Dish("Beef and feta soup","Beef and tangy feta combined into creamy soup",20),
                new Dish("Artichoke and rice soup","Fresh artichoke and thai fragrant rice combined into creamy soup",25),
                new Dish("Mushroom and chicken dumplings","Thin pastry cases stuffed with hand-picked mushroom and free range chicken",30),
                new Dish("Nectarine and cardamom parcels","Thin filo pastry cases stuffed with fresh nectarine and green cardamom",10),
                new Dish("Fish and aubergine gyoza","Thin pastry cases stuffed with fish and fresh aubergine",15),
                new Dish("Trout and squash dumplings","Thin pastry cases stuffed with rainbow trout and pattypan squash",20),
                new Dish("Melon and lemon soup","Honeydew melon and fresh lemon combined into smooth soup",32),
                new Dish("Chilli and persimmon gyoza","Thin pastry cases stuffed with green chilli and fresh persimmon",25),
                new Dish("Feta and pheasant dumplings","Thin pastry cases stuffed with tangy feta and pheasant",15),
                new Dish("Apple and cardamom gyoza","Thin pastry cases stuffed with bramley apple and green cardamom",40),
                new Dish("Crab and sweetcorn dumplings","Thin pastry cases stuffed with crab and baby sweetcorn",45),
                new Dish("Sweetcorn and celeriac parcels","Thin filo pastry cases stuffed with creamed sweetcorn and fresh celeriac",25),
                new Dish("Scallop and peppercorn dumplings","Thin pastry cases stuffed with scallop and szechuan peppercorn",30),
                new Dish("Pesto and chilli parcels","Thin filo pastry cases stuffed with green pesto and fresh chilli",25),
                new Dish("Chorizo and crab soup","Spanish chorizo and crab combined into creamy soup",15),
                new Dish("Cabbage and chickpea dumplings","Pastry cases stuffed with savoy cabbage and fresh chickpea",35),
                new Dish("Celeriac and kumquat soup","Fresh celeriac and kumquat combined into creamy soup",40)
        };


        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);

        listViewStarters.setAdapter(dishesAdapter);
    }
}
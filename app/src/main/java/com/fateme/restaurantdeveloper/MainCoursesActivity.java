package com.fateme.restaurantdeveloper;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainCoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_courses);

        ListView mainCoursesList = findViewById(R.id.list_view_main_courses);

        Dish[] mainCourses = {
                new Dish("Kale and thyme stir fry", "Crunchy stir fry featuring fresh kale and dried thyme", 100),
                new Dish("Potato and venison casserole", "Baby new potato and venison stewed", 150),
                new Dish("Bacon and bresaola spaghetti","Spagetti topped with a blend of streaky bacon and bresaola",250),
                new Dish("Haroset and tangerine salad","Haroset and fresh tangerine served on a bed of lettuce",140),
                new Dish("Chilli and cheese spaghetti","Spagetti topped with a blend of fresh chilli and creamy cheese",150),
                new Dish("Socca and millet salad","Socca and millet served on a bed of lettuce",200),
                new Dish("Haddock and trout soup","Freshly-caught haddock and smoked trout combined into chunky soup",180),
                new Dish("Bacon and halloumi skewers","Bamboo skewers loaded with thick bacon and halloumi",150),
                new Dish("Steak and pork casserole","Steak and pork stewed",160),
                new Dish("Peppercorn and fish gyoza","Thin pastry cases stuffed with szechuan peppercorn and fish",110),
                new Dish("Fish and pheasant parcels","Thin filo pastry cases stuffed with fish and pheasant",120),
                new Dish("Trout and spinach dumplings","Thin pastry cases stuffed with freshly-caught trout and fresh spinach",150),
                new Dish("Chickpea and fish ciabatta","Warm ciabatta filled with fresh chickpea and fish",180),
                new Dish("Chicken and navratan vindaloo","Hot vindaloo made with corn-fed chicken and navratan",260),
                new Dish("Fish and cheese pizza","Deep pan pizza topped with fish and smoked cheese",280),
                new Dish("Sweetcorn and chicken fusilli","Fresh egg pasta in a sauce made from creamed sweetcorn and corn-fed chicken",60),
                new Dish("Mangetout and bacon skewers","Bamboo skewers loaded with fresh mangetout and lea bacon",230),
                new Dish("Aubergine and cheese burgers","Succulent burgers made from salted aubergine and creamy cheese, served in a roll",240),
                new Dish("Yam and chicken stir fry","Crunchy stir fry featuring fresh yam and free range chicken",150),
                new Dish("Chicken and tofu bagel","A warm bagel filled with corn-fed chicken and marinaded tofu",180)
        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,mainCourses);

        mainCoursesList.setAdapter(dishesAdapter);
    }
}

package manish.khullar.meeting_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import manish.khullar.meeting_app.Adapter.TripAdapter;
import manish.khullar.meeting_app.models.Ads;
import manish.khullar.meeting_app.models.Item;
import manish.khullar.meeting_app.models.News;
import manish.khullar.meeting_app.models.Trip;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView= findViewById(R.id.recyclerView);
        List<Item> items= new ArrayList<>();

        //Trip
        Trip trip1=new Trip(R.drawable.range,"",
                "");
        items.add(new Item(0,trip1));

        //Ads
        Ads ads1=new Ads("Have a safe rakhi","With Lots of Love from Manish");
        items.add(new Item(1,ads1));

        //News
        News news1=new News("Dear didi wish you heartfelt Rakshabandhan","Shower your love to all your bhai's");
        items.add(new Item(2,news1));

        //Trip
        Trip trip2=new Trip(R.drawable.hite,"",
                "");
        items.add(new Item(0,trip2));

        //Ads
        Ads ads2=new Ads(
                "ShravanPoornima","Monsoon 2020");
        items.add(new Item(1,ads2));

        //News
        News news2=new News(
                "Today and everyday is your day","As long as Rakshabandhan is celebrated on earth you will have a happy and blessed life");
        items.add(new Item(2,news2));

        //Trip
        Trip trip3=new Trip(R.drawable.reen,"",
                "");
        items.add(new Item(0,trip3));


        recyclerView.setAdapter(new TripAdapter(items));
    }
}
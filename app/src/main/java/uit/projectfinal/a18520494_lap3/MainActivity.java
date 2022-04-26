package uit.projectfinal.a18520494_lap3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listView);

        //Create the Person objects
        User john = new User("John","NewYork");
        User steve = new User("Steve","San Diego");
        User stacy = new User("Stacy", "San Marco");


        //Add the Person objects to an ArrayList
        ArrayList<User> peopleList = new ArrayList<>();
        peopleList.add(john);
        peopleList.add(steve);
        peopleList.add(stacy);


        UsersAdapter adapter = new UsersAdapter(this, R.layout.adapter_view_layout, peopleList);
        mListView.setAdapter(adapter);
    }
}



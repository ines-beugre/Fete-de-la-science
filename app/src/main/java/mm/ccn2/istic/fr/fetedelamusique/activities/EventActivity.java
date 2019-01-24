package mm.ccn2.istic.fr.fetedelamusique.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import mm.ccn2.istic.fr.fetedelamusique.R;
import mm.ccn2.istic.fr.fetedelamusique.adapters.EventAdapter;
import mm.ccn2.istic.fr.fetedelamusique.models.Event;

public class EventActivity extends AppCompatActivity {

   // private RecyclerView mRecyclerView;
   @BindView(R.id.eventRecyclerView) RecyclerView mRecyclerView;

    private List<Event> events;
    private EventAdapter eventAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        events = new ArrayList<>();

        events.add(new Event("Visite Picasso", "Bla bla", "Paris", "Blu blu"));
        events.add(new Event("Visite Tour Effeil", "Bla bla", "Paris", "Blu blu"));

        eventAdapter = new EventAdapter(events);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        mRecyclerView.setAdapter(eventAdapter);

    }
}

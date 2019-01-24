package mm.ccn2.istic.fr.fetedelamusique.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import mm.ccn2.istic.fr.fetedelamusique.R;
import mm.ccn2.istic.fr.fetedelamusique.models.Event;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.EventViewHolder> {

    List<Event> events;

    public EventAdapter(List<Event> events) {
        this.events = events;
    }

    @NonNull
    @Override
    public EventAdapter.EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.eventcardview, parent, false);
        return new EventViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder eventViewHolder, int position) {
        eventViewHolder.display(events.get(position));

    }

    @Override
    public int getItemCount() {
        return events.size();
    }

    public class EventViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.titre) TextView title;
        @BindView(R.id.thematic) TextView thematic;
        @BindView(R.id.city) TextView city;
        @BindView(R.id.description) TextView description;

        public EventViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }

        void display(Event event) {
            title.setText(event.getTitle());
            thematic.setText(event.getThematic());
            city.setText(event.getCity());
            description.setText(event.getDescription());
        }


    }
}

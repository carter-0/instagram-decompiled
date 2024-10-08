package com.instagram.debug.devoptions.eventvisualizer;

import X.2Rw;
import X.AnonymousClass0fD;
import X.C249703kE;
import X.DbT;
import X.DbU;
import X.DbV;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.debug.devoptions.eventvisualizer.EventVisualizerLogger;
import java.util.ArrayList;
import java.util.List;

public class EventVisualizerAdapter extends 2Rw {
    public final List mData = new ArrayList();
    public EventDataDelegate mDelegate;

    public interface EventDataDelegate {
        void onEventDetailRequest(EventVisualizerLogger.EventData eventData);
    }

    public class ViewHolder extends C249703kE {
        public TextView textView;

        public ViewHolder(View view) {
            super(view);
            this.textView = DbU.A0G(view, R.id.text1);
        }
    }

    public void addNewData(EventVisualizerLogger.EventData eventData) {
        this.mData.add(0, eventData);
        notifyItemInserted(0);
    }

    public void clearData() {
        this.mData.clear();
        notifyDataSetChanged();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.textView.setText(((EventVisualizerLogger.EventData) this.mData.get(i)).mName);
    }

    public void setDelegate(EventDataDelegate eventDataDelegate) {
        this.mDelegate = eventDataDelegate;
    }

    public int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-1865786049);
        int size = this.mData.size();
        AnonymousClass0fD.A0A(-1183789279, A03);
        return size;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        final ViewHolder viewHolder = new ViewHolder(DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.event_visualizer_row_view));
        viewHolder.textView.setLongClickable(true);
        viewHolder.textView.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View view) {
                EventVisualizerAdapter eventVisualizerAdapter = EventVisualizerAdapter.this;
                EventDataDelegate eventDataDelegate = eventVisualizerAdapter.mDelegate;
                if (eventDataDelegate == null) {
                    return true;
                }
                eventDataDelegate.onEventDetailRequest((EventVisualizerLogger.EventData) eventVisualizerAdapter.mData.get(viewHolder.getBindingAdapterPosition()));
                return true;
            }
        });
        return viewHolder;
    }
}

package com.instagram.debug.devoptions.eventvisualizer;

import X.C13988Tno;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.debug.devoptions.eventvisualizer.EventVisualizerAdapter;
import com.instagram.debug.devoptions.eventvisualizer.EventVisualizerFilterView;
import com.instagram.debug.devoptions.eventvisualizer.EventVisualizerLogger;
import com.instagram.debug.devoptions.eventvisualizer.EventVisualizerView;
import java.util.List;

public class EventVisualizerController implements EventVisualizerFilterView.FilterViewDelegate, EventVisualizerLogger.EventDataListener, EventVisualizerView.EventViewDelegate, EventVisualizerAdapter.EventDataDelegate {
    public static EventVisualizerController sInstance;
    public EventVisualizerAdapter mEventVisualizerAdapter = new EventVisualizerAdapter();
    public EventVisualizerFilterView mEventVisualizerFilterView;
    public EventVisualizerLogger mEventVisualizerLogger = EventVisualizerLogger.getInstance();
    public EventVisualizerView mEventVisualizerView;
    public boolean mFilterMode = false;
    public boolean mInteractiveMode = false;
    public ViewGroup mRootView;

    public static EventVisualizerController getInstance() {
        EventVisualizerController eventVisualizerController = sInstance;
        if (eventVisualizerController != null) {
            return eventVisualizerController;
        }
        EventVisualizerController eventVisualizerController2 = new EventVisualizerController();
        sInstance = eventVisualizerController2;
        return eventVisualizerController2;
    }

    public boolean getInteractiveMode() {
        return this.mInteractiveMode;
    }

    public void onEventDetailRequest(EventVisualizerLogger.EventData eventData) {
        EventVisualizerView eventVisualizerView = this.mEventVisualizerView;
        eventVisualizerView.getClass();
        eventVisualizerView.showEventDetail(eventData.mDebugString);
    }

    public void onEventVisualizerDismiss() {
        this.mRootView.getClass();
        if (this.mFilterMode) {
            this.mRootView.removeView(this.mEventVisualizerFilterView);
            this.mFilterMode = false;
        }
        this.mRootView.removeView(this.mEventVisualizerView);
        this.mEventVisualizerLogger.mListener = null;
        this.mEventVisualizerAdapter.mDelegate = null;
    }

    public void onEventVisualizerShow(Activity activity) {
        this.mEventVisualizerLogger.mListener = this;
        this.mEventVisualizerAdapter.mDelegate = this;
        this.mRootView = getRootViewFromActivity(activity);
        EventVisualizerView eventVisualizerView = new EventVisualizerView(activity, this);
        this.mEventVisualizerView = eventVisualizerView;
        ViewGroup viewGroup = this.mRootView;
        viewGroup.getClass();
        eventVisualizerView.mMainContentView = C13988Tno.A0G(viewGroup);
        this.mEventVisualizerView.setLayoutManager(new LinearLayoutManager(activity));
        this.mEventVisualizerView.setAdapter(this.mEventVisualizerAdapter);
        this.mRootView.addView(this.mEventVisualizerView);
    }

    public void onFilterAdded(String str) {
        EventVisualizerFilterView eventVisualizerFilterView = this.mEventVisualizerFilterView;
        eventVisualizerFilterView.getClass();
        eventVisualizerFilterView.addFilter(str);
    }

    public void onFilterApplied(List list) {
        this.mEventVisualizerAdapter.clearData();
        this.mEventVisualizerLogger.updateFilters(list);
        this.mEventVisualizerLogger.requestFilteredData();
        ViewGroup viewGroup = this.mRootView;
        viewGroup.getClass();
        viewGroup.removeView(this.mEventVisualizerFilterView);
        this.mFilterMode = false;
    }

    public void onFilterButtonClicked(View view) {
        this.mFilterMode = !this.mFilterMode;
        this.mRootView.getClass();
        if (this.mFilterMode) {
            EventVisualizerFilterView eventVisualizerFilterView = new EventVisualizerFilterView(view.getContext(), this);
            this.mEventVisualizerFilterView = eventVisualizerFilterView;
            this.mRootView.addView(eventVisualizerFilterView);
            return;
        }
        this.mRootView.removeView(this.mEventVisualizerFilterView);
    }

    public void onFilterCleared() {
        EventVisualizerFilterView eventVisualizerFilterView = this.mEventVisualizerFilterView;
        eventVisualizerFilterView.getClass();
        eventVisualizerFilterView.clearFilter();
    }

    public void onInteractiveButtonClicked() {
        boolean z;
        this.mEventVisualizerView.getClass();
        boolean z2 = this.mInteractiveMode;
        EventVisualizerView eventVisualizerView = this.mEventVisualizerView;
        if (z2) {
            eventVisualizerView.setNotInteractive();
            z = false;
        } else {
            eventVisualizerView.setInteractive();
            z = true;
        }
        this.mInteractiveMode = z;
    }

    public void onNewEventsAdded(EventVisualizerLogger.EventData eventData) {
        this.mEventVisualizerAdapter.addNewData(eventData);
        EventVisualizerView eventVisualizerView = this.mEventVisualizerView;
        eventVisualizerView.getClass();
        eventVisualizerView.requestScrollToPosition(0);
    }

    public static ViewGroup getRootViewFromActivity(Activity activity) {
        while (activity.getParent() != null) {
            activity = activity.getParent();
        }
        return (ViewGroup) activity.findViewById(16908290);
    }
}

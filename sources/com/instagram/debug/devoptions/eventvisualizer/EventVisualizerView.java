package com.instagram.debug.devoptions.eventvisualizer;

import X.2Rw;
import X.AnonymousClass0fD;
import X.C252553pI;
import X.C59689JTv;
import X.DbT;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

public class EventVisualizerView extends FrameLayout {
    public EventViewDelegate mDelegate;
    public View mFilterButton;
    public View mInteractiveButton;
    public View mMainContentView;
    public RecyclerView mRecyclerView;

    public interface EventViewDelegate {
        void onFilterButtonClicked(View view);

        void onInteractiveButtonClicked();
    }

    public void requestScrollToPosition(int i) {
        C252553pI r0 = this.mRecyclerView.A0D;
        if (r0 != null) {
            r0.A1O(i);
        }
    }

    public void setAdapter(2Rw r2) {
        this.mRecyclerView.setAdapter(r2);
    }

    public void setInteractive() {
        this.mRecyclerView.setClickable(true);
        this.mRecyclerView.setOnTouchListener((View.OnTouchListener) null);
    }

    public void setLayoutManager(C252553pI r2) {
        this.mRecyclerView.setLayoutManager(r2);
    }

    public void setMainContentView(View view) {
        this.mMainContentView = view;
    }

    public void setNotInteractive() {
        this.mRecyclerView.setClickable(false);
        this.mRecyclerView.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                EventVisualizerView.this.mMainContentView.dispatchTouchEvent(motionEvent);
                return true;
            }
        });
    }

    public EventVisualizerView(Context context, EventViewDelegate eventViewDelegate) {
        super(context);
        this.mDelegate = eventViewDelegate;
        initView();
    }

    private void initView() {
        Context context = getContext();
        View.inflate(context, R.layout.event_visualizer, this);
        RecyclerView A0I = DbT.A0I(this, R.id.recyclerView);
        this.mRecyclerView = A0I;
        A0I.A11(new EventItemDecoration(context));
        View requireViewById = requireViewById(R.id.interactive_button);
        this.mInteractiveButton = requireViewById;
        requireViewById.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int A05 = AnonymousClass0fD.A05(-1009426018);
                EventViewDelegate eventViewDelegate = EventVisualizerView.this.mDelegate;
                if (eventViewDelegate != null) {
                    eventViewDelegate.onInteractiveButtonClicked();
                }
                AnonymousClass0fD.A0C(-365758403, A05);
            }
        });
        View requireViewById2 = requireViewById(R.id.filter_button);
        this.mFilterButton = requireViewById2;
        requireViewById2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int A05 = AnonymousClass0fD.A05(-380423428);
                EventViewDelegate eventViewDelegate = EventVisualizerView.this.mDelegate;
                if (eventViewDelegate != null) {
                    eventViewDelegate.onFilterButtonClicked(view);
                }
                AnonymousClass0fD.A0C(458857961, A05);
            }
        });
        setNotInteractive();
    }

    public void showEventDetail(String str) {
        if (EventVisualizerController.getInstance().mInteractiveMode) {
            C59689JTv.A09(getContext(), str);
        }
    }
}

package com.instagram.debug.devoptions.debughead.data.provider;

import android.view.MotionEvent;
import com.instagram.debug.devoptions.apiperf.TouchEventProvider;
import com.instagram.debug.devoptions.debughead.data.delegates.TouchEventDelegate;

public class DebugHeadTouchListener implements TouchEventProvider {
    public static final DebugHeadTouchListener INSTANCE = new Object();
    public TouchEventDelegate mListener;

    public static DebugHeadTouchListener getInstance() {
        return INSTANCE;
    }

    public void onTouchEvent(MotionEvent motionEvent) {
        TouchEventDelegate touchEventDelegate = this.mListener;
        if (touchEventDelegate != null) {
            touchEventDelegate.onTouchEvent(motionEvent);
        }
    }

    public void setDelegate(TouchEventDelegate touchEventDelegate) {
        this.mListener = touchEventDelegate;
    }
}

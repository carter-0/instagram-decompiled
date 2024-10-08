package com.instagram.creation.capture.quickcapture.layout;

import X.0qQ;
import X.JTS;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

public final class MultiTouchRecyclerView extends RecyclerView {
    public boolean A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiTouchRecyclerView(Context context) {
        super(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        if (motionEvent.getAction() == 0 && JTS.A0B(motionEvent, this) == null) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        if (motionEvent.getActionMasked() == 0 || this.A00) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setShouldInterceptEvents(boolean z) {
        this.A00 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiTouchRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiTouchRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }
}

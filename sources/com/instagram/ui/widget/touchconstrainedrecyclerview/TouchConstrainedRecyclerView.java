package com.instagram.ui.widget.touchconstrainedrecyclerview;

import X.0qQ;
import X.JTS;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

public final class TouchConstrainedRecyclerView extends RecyclerView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TouchConstrainedRecyclerView(Context context) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TouchConstrainedRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TouchConstrainedRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }
}

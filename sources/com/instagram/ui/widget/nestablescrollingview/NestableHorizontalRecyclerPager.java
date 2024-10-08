package com.instagram.ui.widget.nestablescrollingview;

import X.0qQ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;

public final class NestableHorizontalRecyclerPager extends HorizontalRecyclerPager {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestableHorizontalRecyclerPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    public final void setPassThroughEdge(int i) {
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NestableHorizontalRecyclerPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NestableHorizontalRecyclerPager(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}

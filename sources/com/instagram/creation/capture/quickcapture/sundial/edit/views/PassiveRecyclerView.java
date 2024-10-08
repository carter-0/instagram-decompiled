package com.instagram.creation.capture.quickcapture.sundial.edit.views;

import X.0qQ;
import X.JTT;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PassiveRecyclerView extends RecyclerView {
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public /* synthetic */ PassiveRecyclerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PassiveRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }
}

package com.instagram.creation.capture.quickcapture.faceeffectui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;

public class NestableSnapPickerRecyclerView extends RecyclerView {
    public final boolean A1F(int i, int i2) {
        return super.A1F((int) (((double) i) * 0.7d), i2);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public NestableSnapPickerRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NestableSnapPickerRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public NestableSnapPickerRecyclerView(Context context) {
        super(context, (AttributeSet) null);
    }
}

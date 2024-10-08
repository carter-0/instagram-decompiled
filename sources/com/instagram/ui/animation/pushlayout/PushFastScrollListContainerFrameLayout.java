package com.instagram.ui.animation.pushlayout;

import X.0qQ;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class PushFastScrollListContainerFrameLayout extends FrameLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushFastScrollListContainerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final float getXFraction() {
        int width = getWidth();
        float x = getX();
        if (width != 0) {
            return x / ((float) width);
        }
        return x;
    }

    public final void setXFraction(float f) {
        float f2;
        int width = getWidth();
        if (width > 0) {
            f2 = f * ((float) width);
        } else {
            f2 = -9999.0f;
        }
        setX(f2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushFastScrollListContainerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushFastScrollListContainerFrameLayout(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }
}

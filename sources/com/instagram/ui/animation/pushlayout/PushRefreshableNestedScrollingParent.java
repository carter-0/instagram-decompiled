package com.instagram.ui.animation.pushlayout;

import X.0qQ;
import android.content.Context;
import android.util.AttributeSet;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

public final class PushRefreshableNestedScrollingParent extends RefreshableNestedScrollingParent {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushRefreshableNestedScrollingParent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    public final float getXFraction() {
        int width = getWidth();
        float x = getX();
        if (width != 0) {
            return x / ((float) width);
        }
        return x;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushRefreshableNestedScrollingParent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushRefreshableNestedScrollingParent(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }
}

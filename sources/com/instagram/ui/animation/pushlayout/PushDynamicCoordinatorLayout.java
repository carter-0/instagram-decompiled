package com.instagram.ui.animation.pushlayout;

import X.0qQ;
import X.C323886yG;
import android.content.Context;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class PushDynamicCoordinatorLayout extends CoordinatorLayout {
    public C323886yG A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushDynamicCoordinatorLayout(Context context) {
        super(context, (AttributeSet) null);
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

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C323886yG r0 = this.A00;
        if (r0 != null && r0.DPj()) {
            super.onMeasure(i, i2);
        }
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

    public void setOnMeasureListener(C323886yG r1) {
        this.A00 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushDynamicCoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        0qQ.A0B(attributeSet, 2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushDynamicCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        0qQ.A0B(context, 1);
        0qQ.A0B(attributeSet, 2);
    }
}

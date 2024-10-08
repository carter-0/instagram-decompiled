package com.instagram.creation.base.ui;

import X.0qQ;
import X.B1I;
import android.content.Context;
import android.util.AttributeSet;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;

public final class ConstrainedMultiListenerTextureView extends MultiListenerTextureView implements B1I {
    public float A00 = 1.0f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstrainedMultiListenerTextureView(Context context) {
        super(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public float getAspectRatio() {
        return this.A00;
    }

    public void setAspectRatio(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            requestLayout();
        }
    }

    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        int i3;
        super.onMeasure(i, i2);
        float f = this.A00;
        if (f > 0.0f) {
            if (f < 1.0f) {
                i3 = getMeasuredHeight();
                measuredWidth = (int) ((((float) i3) * this.A00) + 0.5f);
            } else {
                measuredWidth = getMeasuredWidth();
                i3 = (int) ((((float) measuredWidth) / this.A00) + 0.5f);
            }
            setMeasuredDimension(measuredWidth, i3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstrainedMultiListenerTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstrainedMultiListenerTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}

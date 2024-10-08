package com.instagram.common.ui.widget.zoomcontainer;

import X.0qQ;
import X.C253723rH;
import X.SN3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SimpleZoomableViewContainer extends FrameLayout implements C253723rH {
    public float A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SimpleZoomableViewContainer(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void onMeasure(int i, int i2) {
        float f = this.A00;
        if (f > 0.0f) {
            View.MeasureSpec.getMode(i2);
            View.MeasureSpec.getSize(i2);
            int size = View.MeasureSpec.getSize(i);
            i2 = View.MeasureSpec.makeMeasureSpec((int) (((float) size) / f), SN3.MAX_SIGNED_POWER_OF_TWO);
            i = View.MeasureSpec.makeMeasureSpec(size, SN3.MAX_SIGNED_POWER_OF_TWO);
        }
        super.onMeasure(i, i2);
    }

    public final void AOy(View view) {
        super.detachViewFromParent(view);
    }

    public final void setAspectRatio(float f) {
        this.A00 = f;
    }

    public final void ACu(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.attachViewToParent(view, i, layoutParams);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SimpleZoomableViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A00 = -1.0f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SimpleZoomableViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SimpleZoomableViewContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}

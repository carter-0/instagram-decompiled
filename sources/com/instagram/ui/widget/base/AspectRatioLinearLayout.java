package com.instagram.ui.widget.base;

import X.0qQ;
import X.JTT;
import X.SN3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AspectRatioLinearLayout extends LinearLayout {
    public float A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AspectRatioLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A00 = 1.0f;
    }

    public final void setAspectRatio(float f) {
        this.A00 = f;
        requestLayout();
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.A00;
        if (f > 1.0f) {
            measuredHeight = (int) (((float) measuredWidth) / f);
        } else {
            measuredWidth = (int) (((float) measuredHeight) * f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, SN3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(measuredHeight, SN3.MAX_SIGNED_POWER_OF_TWO));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AspectRatioLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AspectRatioLinearLayout(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ AspectRatioLinearLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}

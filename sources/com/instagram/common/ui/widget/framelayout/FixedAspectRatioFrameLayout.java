package com.instagram.common.ui.widget.framelayout;

import X.0qQ;
import X.DbT;
import X.JTT;
import X.SN3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class FixedAspectRatioFrameLayout extends FrameLayout {
    public float A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FixedAspectRatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A00 = 1.0f;
    }

    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        float f = this.A00;
        if (f > 0.0f) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            int size2 = View.MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                float f2 = (float) size;
                if (f2 < ((float) size2) / f) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((int) (f2 * f), SN3.MAX_SIGNED_POWER_OF_TWO);
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, SN3.MAX_SIGNED_POWER_OF_TWO);
                    super.onMeasure(makeMeasureSpec2, makeMeasureSpec);
                    return;
                }
            }
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (((float) size2) / f), SN3.MAX_SIGNED_POWER_OF_TWO);
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, SN3.MAX_SIGNED_POWER_OF_TWO);
            super.onMeasure(makeMeasureSpec2, makeMeasureSpec);
            return;
        }
        throw DbT.A0m();
    }

    public final void setAspectRatio(float f) {
        this.A00 = f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FixedAspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FixedAspectRatioFrameLayout(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ FixedAspectRatioFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}

package com.instagram.creation.capture.quickcapture.effectinfobottomsheet;

import X.0qQ;
import X.C13988Tno;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

public final class EffectInfoViewPager extends ViewPager {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EffectInfoViewPager(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.viewpager.widget.ViewPager, com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoViewPager, android.view.ViewGroup] */
    public final void onMeasure(int i, int i2) {
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
            i2 = C13988Tno.A04(childAt.getMeasuredHeight());
        }
        EffectInfoViewPager.super.onMeasure(i, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EffectInfoViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }
}

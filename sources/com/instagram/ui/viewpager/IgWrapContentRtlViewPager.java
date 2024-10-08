package com.instagram.ui.viewpager;

import X.JTT;
import X.Wv7;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgWrapContentRtlViewPager extends Wv7 {
    public int A00;

    public IgWrapContentRtlViewPager(Context context) {
        super(context, (AttributeSet) null);
    }

    public final void setChildIdxForHeightMeasure(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [androidx.viewpager.widget.ViewPager, android.view.View, com.instagram.ui.viewpager.IgWrapContentRtlViewPager, android.view.ViewGroup] */
    public final void onMeasure(int i, int i2) {
        int i3;
        IgWrapContentRtlViewPager.super.onMeasure(i, i2);
        View childAt = getChildAt(this.A00);
        if (childAt != null) {
            childAt.measure(i, i2);
        }
        int measuredWidth = getMeasuredWidth();
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (childAt != null) {
                i3 = childAt.getMeasuredHeight();
            } else {
                i3 = 0;
            }
            if (mode == Integer.MIN_VALUE && i3 > size) {
                i3 = size;
            }
            size = i3;
        }
        setMeasuredDimension(measuredWidth, size);
    }

    public /* synthetic */ IgWrapContentRtlViewPager(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        super(context, JTT.A0D(attributeSet, i));
    }

    public IgWrapContentRtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

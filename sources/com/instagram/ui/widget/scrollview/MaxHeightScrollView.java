package com.instagram.ui.widget.scrollview;

import X.0qQ;
import X.AnonymousClass972;
import X.C71382cm;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;

public final class MaxHeightScrollView extends ScrollView {
    public int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaxHeightScrollView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }

    public final void onMeasure(int i, int i2) {
        int i3 = this.A00;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, AnonymousClass972.MUTABLE_FLAG_MASK);
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaxHeightScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A1h);
            0qQ.A07(obtainStyledAttributes);
            this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaxHeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A1h);
            0qQ.A07(obtainStyledAttributes);
            this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }
}

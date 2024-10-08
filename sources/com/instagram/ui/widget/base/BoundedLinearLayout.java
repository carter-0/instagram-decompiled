package com.instagram.ui.widget.base;

import X.0qQ;
import X.C71382cm;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BoundedLinearLayout extends LinearLayout {
    public int A00;
    public int A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BoundedLinearLayout(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void setMaxHeight(int i) {
        this.A00 = i;
        requestLayout();
    }

    public final void setMaxWidth(int i) {
        this.A01 = i;
        requestLayout();
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.A01;
        if (i3 > 0 && i3 < size) {
            i = View.MeasureSpec.makeMeasureSpec(this.A01, View.MeasureSpec.getMode(i));
        }
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.A00;
        if (i4 > 0 && i4 < size2) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.A00, View.MeasureSpec.getMode(i2));
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BoundedLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A05);
        0qQ.A07(obtainStyledAttributes);
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BoundedLinearLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BoundedLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}

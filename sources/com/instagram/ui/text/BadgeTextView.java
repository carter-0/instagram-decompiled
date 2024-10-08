package com.instagram.ui.text;

import X.0qQ;
import X.AnonymousClass0fD;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public final class BadgeTextView extends TextView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BadgeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }

    public final void onMeasure(int i, int i2) {
        int A06 = AnonymousClass0fD.A06(-1559050703);
        super.onMeasure(i, i2);
        if (getMeasuredWidth() < getMeasuredHeight()) {
            int measuredHeight = (getMeasuredHeight() - getMeasuredWidth()) / 2;
            setPadding(getPaddingLeft() + measuredHeight, getPaddingTop(), getPaddingRight() + measuredHeight, getPaddingBottom());
            setMeasuredDimension(getMeasuredHeight(), getMeasuredHeight());
        }
        AnonymousClass0fD.A0D(-994216764, A06);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BadgeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BadgeTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BadgeTextView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }
}

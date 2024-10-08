package com.instagram.common.ui.widget.squareframelayout;

import X.0qQ;
import X.C63115Krj;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public final class SquareFrameLayout extends FrameLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SquareFrameLayout(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }

    public final void onMeasure(int i, int i2) {
        int A00 = C63115Krj.A00(i, i2);
        super.onMeasure(A00, A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SquareFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SquareFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }
}

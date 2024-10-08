package com.facebook.browser.lite.extensions.autofill.base;

import X.AnonymousClass972;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class AutofillLinearLayout extends LinearLayout {
    public int A00 = -1;

    public final void onMeasure(int i, int i2) {
        int i3 = this.A00;
        if (i3 >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, AnonymousClass972.MUTABLE_FLAG_MASK);
        }
        super.onMeasure(i, i2);
    }

    public void setMaxHeight(int i) {
        this.A00 = i;
        invalidate();
    }

    public AutofillLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AutofillLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AutofillLinearLayout(Context context) {
        super(context);
    }
}

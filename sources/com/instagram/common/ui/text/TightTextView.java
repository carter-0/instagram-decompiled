package com.instagram.common.ui.text;

import X.AnonymousClass0fD;
import X.AnonymousClass972;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.common.accessibility.AccessibleTextView;

public class TightTextView extends AccessibleTextView {
    public boolean A00 = false;
    public boolean A01 = true;

    public TightTextView(Context context) {
        super(context);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView, android.view.View] */
    public final void onMeasure(int i, int i2) {
        int i3;
        Layout layout;
        int A06 = AnonymousClass0fD.A06(-744288736);
        TightTextView.super.onMeasure(i, i2);
        if (!this.A01) {
            i3 = 1808413649;
        } else {
            if (!(View.MeasureSpec.getMode(i) == 1073741824 || (layout = getLayout()) == null)) {
                int lineCount = layout.getLineCount();
                float f = 0.0f;
                for (int i4 = 0; i4 < lineCount; i4++) {
                    if (layout.getLineWidth(i4) > f) {
                        f = layout.getLineWidth(i4);
                    }
                }
                int ceil = ((int) Math.ceil((double) f)) + getCompoundPaddingLeft() + getCompoundPaddingRight();
                if (ceil < getMeasuredWidth() && ceil > getMinimumWidth()) {
                    TightTextView.super.onMeasure(View.MeasureSpec.makeMeasureSpec(ceil, AnonymousClass972.MUTABLE_FLAG_MASK), i2);
                }
                if (!this.A00) {
                    int i5 = 8388611;
                    if (ceil < getMinimumWidth()) {
                        i5 = 17;
                    }
                    setGravity(i5);
                }
            }
            i3 = 481974070;
        }
        AnonymousClass0fD.A0D(i3, A06);
    }

    public void setDisableGravityOnMeasure(boolean z) {
        this.A00 = z;
    }

    public void setTightMeasurementEnabled(boolean z) {
        this.A01 = z;
    }

    public TightTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TightTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

package com.instagram.ui.widget.roundedcornerlayout;

import X.AnonymousClass3Ur;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class RoundedCornerLinearLayout extends LinearLayout {
    public AnonymousClass3Ur A00;

    public void setCornerBackgroundColor(int i) {
        AnonymousClass3Ur r1 = this.A00;
        if (r1.A08(i)) {
            invalidate();
            boolean z = false;
            if (r1.A00 == 0) {
                z = true;
            }
            int i2 = 0;
            if (z) {
                i2 = 2;
            }
            setLayerType(i2, (Paint) null);
        }
    }

    public void setCornerRadius(int i) {
        if (this.A00.A05((float) i)) {
            invalidate();
        }
    }

    public void setStrokeColor(int i) {
        AnonymousClass3Ur r1 = this.A00;
        if (r1.A01 != i) {
            r1.A01 = i;
            r1.A03.setColor(i);
            invalidate();
        }
    }

    public void setStrokeWidth(float f) {
        if (this.A00.A06(f)) {
            invalidate();
        }
    }

    public RoundedCornerLinearLayout(Context context) {
        super(context);
        this.A00 = AnonymousClass3Ur.A00(getContext(), (AttributeSet) null);
        setLayerType(2, (Paint) null);
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A00.A04(canvas);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.A00.A03(getMeasuredWidth(), getMeasuredHeight());
    }

    public RoundedCornerLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = AnonymousClass3Ur.A00(getContext(), attributeSet);
        setLayerType(2, (Paint) null);
    }

    public RoundedCornerLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = AnonymousClass3Ur.A00(getContext(), attributeSet);
        setLayerType(2, (Paint) null);
    }
}

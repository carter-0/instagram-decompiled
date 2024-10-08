package com.instagram.ui.widget.roundedcornerlayout;

import X.AnonymousClass3Ur;
import X.C242423Ua;
import X.C67961ye;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class RoundedCornerFrameLayout extends C67961ye implements C242423Ua {
    public AnonymousClass3Ur A00;

    public final void A01(float f, float f2, float f3, float f4) {
        if (this.A00.A07(f, f2, f3, f4)) {
            invalidate();
        }
    }

    public void setCornerBackgroundColor(int i) {
        if (this.A00.A08(i)) {
            invalidate();
            boolean z = false;
            if (this.A00.A00 == 0) {
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

    public RoundedCornerFrameLayout(Context context) {
        super(context);
        A00((AttributeSet) null);
    }

    private void A00(AttributeSet attributeSet) {
        AnonymousClass3Ur A002 = AnonymousClass3Ur.A00(getContext(), attributeSet);
        this.A00 = A002;
        boolean z = false;
        if (A002.A00 == 0) {
            z = true;
        }
        int i = 0;
        if (z) {
            i = 2;
        }
        setLayerType(i, (Paint) null);
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A00.A04(canvas);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.A00.A03(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void detachViewFromParent(View view) {
        super.detachViewFromParent(view);
    }

    public final void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.attachViewToParent(view, i, layoutParams);
    }

    public RoundedCornerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(attributeSet);
    }

    public RoundedCornerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(attributeSet);
    }
}

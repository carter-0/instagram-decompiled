package com.instagram.ui.widget.roundedcornerlayout;

import X.AnonymousClass3Ur;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

public class RoundedCornerMediaFrameLayout extends MediaFrameLayout {
    public AnonymousClass3Ur A00;

    public final void A01(float f, float f2, float f3, float f4) {
        if (this.A00.A07(f, f2, f3, f4)) {
            invalidate();
        }
    }

    public void setCornerBackgroundColor(int i) {
        if (this.A00.A08(i)) {
            invalidate();
        }
    }

    public void setRadius(int i) {
        if (this.A00.A05((float) i)) {
            invalidate();
        }
    }

    public void setStrokeWidth(float f) {
        if (this.A00.A06(f)) {
            invalidate();
        }
    }

    public RoundedCornerMediaFrameLayout(Context context) {
        super(context);
        this.A00 = new AnonymousClass3Ur(getContext());
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

    public RoundedCornerMediaFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = AnonymousClass3Ur.A00(getContext(), attributeSet);
        setLayerType(2, (Paint) null);
    }

    public RoundedCornerMediaFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = AnonymousClass3Ur.A00(getContext(), attributeSet);
        setLayerType(2, (Paint) null);
    }
}

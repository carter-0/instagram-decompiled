package com.facebook.shimmer;

import X.AnonymousClass0fD;
import X.AnonymousClass3O0;
import X.AnonymousClass3O2;
import X.AnonymousClass3O3;
import X.AnonymousClass3O4;
import X.AnonymousClass3O5;
import X.C336007du;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class ShimmerFrameLayout extends FrameLayout {
    public boolean A00 = true;
    public boolean A01 = false;
    public final AnonymousClass3O0 A02 = new AnonymousClass3O0();
    public final Paint A03 = new Paint();

    private void A00(Context context, AttributeSet attributeSet) {
        AnonymousClass3O4 r0;
        setWillNotDraw(false);
        this.A02.setCallback(this);
        if (attributeSet == null) {
            A04(new AnonymousClass3O3().A01());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass3O2.A00, 0, 0);
        try {
            if (!obtainStyledAttributes.hasValue(4) || !obtainStyledAttributes.getBoolean(4, false)) {
                r0 = new AnonymousClass3O3();
            } else {
                r0 = new C336007du();
            }
            r0.A00(obtainStyledAttributes);
            A04(r0.A01());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void A03() {
        this.A01 = false;
        AnonymousClass3O0 r1 = this.A02;
        ValueAnimator valueAnimator = r1.A01;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            r1.A01.cancel();
        }
    }

    public void A06(boolean z) {
        this.A00 = true;
        A02();
        invalidate();
    }

    public final void A04(AnonymousClass3O5 r3) {
        int i;
        Paint paint;
        this.A02.A03(r3);
        if (r3 == null || !r3.A0I) {
            i = 0;
            paint = null;
        } else {
            i = 2;
            paint = this.A03;
        }
        setLayerType(i, paint);
    }

    public AnonymousClass3O5 getShimmer() {
        return this.A02.A02;
    }

    public void setStaticAnimationProgress(float f) {
        AnonymousClass3O0 r3 = this.A02;
        float f2 = r3.A00;
        if (Float.compare(f, f2) == 0) {
            return;
        }
        if (f >= 0.0f || f2 >= 0.0f) {
            r3.A00 = Math.min(f, 1.0f);
            r3.invalidateSelf();
        }
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00(context, attributeSet);
    }

    public final void A02() {
        if (isAttachedToWindow()) {
            this.A02.A02();
        }
    }

    public void A05() {
        A03();
        this.A00 = false;
        invalidate();
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.A00) {
            this.A02.draw(canvas);
        }
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(-1571718851);
        super.onAttachedToWindow();
        if (this.A00) {
            this.A02.A01();
        }
        AnonymousClass0fD.A0D(542711130, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0fD.A06(1986135573);
        super.onDetachedFromWindow();
        A03();
        AnonymousClass0fD.A0D(1362900648, A06);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A02.setBounds(0, 0, getWidth(), getHeight());
    }

    public final void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        AnonymousClass3O0 r1 = this.A02;
        if (r1 != null) {
            if (i != 0) {
                ValueAnimator valueAnimator = r1.A01;
                if (valueAnimator != null && valueAnimator.isStarted()) {
                    A03();
                    z = true;
                } else {
                    return;
                }
            } else if (this.A01) {
                r1.A01();
                z = false;
            } else {
                return;
            }
            this.A01 = z;
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A02) {
            return true;
        }
        return false;
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }
}

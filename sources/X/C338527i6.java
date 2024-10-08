package X;

import android.animation.ValueAnimator;

/* renamed from: X.7i6  reason: invalid class name and case insensitive filesystem */
public final class C338527i6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C338517i5 A00;
    public final /* synthetic */ C338507i4 A01;

    public C338527i6(C338517i5 r1, C338507i4 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Number) valueAnimator.getAnimatedValue()).floatValue();
        C338507i4 r2 = this.A01;
        C338517i5 r1 = this.A00;
        r2.A03(r1, floatValue);
        r2.A04(r1, floatValue, false);
        r2.invalidateSelf();
    }
}

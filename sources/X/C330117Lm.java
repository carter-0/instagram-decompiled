package X;

import android.animation.ValueAnimator;

/* renamed from: X.7Lm  reason: invalid class name and case insensitive filesystem */
public final class C330117Lm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C330107Ll A00;

    public C330117Lm(C330107Ll r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float A02;
        C330107Ll r5 = this.A00;
        if (r5.A04 == 0) {
            A02 = 1.0f;
        } else {
            ValueAnimator valueAnimator2 = r5.A0A;
            Object animatedValue = valueAnimator2.getAnimatedValue();
            0qQ.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            A02 = 0mi.A02(((Number) animatedValue).floatValue(), 0.0f, 400.0f / ((float) valueAnimator2.getDuration()), 0.0f, 1.0f);
        }
        if (A02 != r5.A00) {
            r5.A00 = A02;
            r5.invalidateSelf();
        }
    }
}

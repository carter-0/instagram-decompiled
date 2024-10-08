package X;

import android.animation.ValueAnimator;

/* renamed from: X.58c  reason: invalid class name and case insensitive filesystem */
public final class C2815158c implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C271644jM A00;

    public C2815158c(C271644jM r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        0qQ.A0B(valueAnimator, 0);
        C271634jL r2 = this.A00.A01;
        Object animatedValue = valueAnimator.getAnimatedValue();
        0qQ.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        r2.A01.A00(animatedValue);
        r2.A02.A00(animatedValue);
        r2.A00.A00(animatedValue);
    }
}

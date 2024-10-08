package X;

import android.animation.ValueAnimator;

/* renamed from: X.2hz  reason: invalid class name and case insensitive filesystem */
public final class C226872hz implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C226852hx A00;

    public C226872hz(C226852hx r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        0qQ.A0B(valueAnimator, 0);
        C226852hx r2 = this.A00;
        Object animatedValue = valueAnimator.getAnimatedValue();
        0qQ.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        r2.A00(((Number) animatedValue).intValue());
    }
}

package X;

import android.animation.ValueAnimator;

/* renamed from: X.52E  reason: invalid class name */
public final class AnonymousClass52E implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnonymousClass52C A00;

    public AnonymousClass52E(AnonymousClass52C r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        0qQ.A0B(valueAnimator, 0);
        AnonymousClass529 r2 = this.A00.A03;
        Object animatedValue = valueAnimator.getAnimatedValue();
        0qQ.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        ((AnonymousClass528) r2).A00(((Number) animatedValue).floatValue());
    }
}

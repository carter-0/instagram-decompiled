package X;

import android.animation.ValueAnimator;

/* renamed from: X.525  reason: invalid class name */
public final class AnonymousClass525 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnonymousClass523 A00;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        0qQ.A0B(valueAnimator, 0);
        AnonymousClass523 r2 = this.A00;
        Object animatedValue = valueAnimator.getAnimatedValue();
        0qQ.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        r2.A00 = ((Number) animatedValue).floatValue();
    }

    public AnonymousClass525(AnonymousClass523 r1) {
        this.A00 = r1;
    }
}

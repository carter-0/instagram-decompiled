package X;

import android.animation.ValueAnimator;

public final class AJO implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnonymousClass9WP A00;

    public AJO(AnonymousClass9WP r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        0qQ.A0B(valueAnimator, 0);
        AnonymousClass9WP r2 = this.A00;
        Object animatedValue = valueAnimator.getAnimatedValue();
        0qQ.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        r2.A00 = AnonymousClass7TE.A0M(animatedValue);
        r2.invalidateSelf();
    }
}

package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.8CW  reason: invalid class name */
public final class AnonymousClass8CW implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnonymousClass8CV A00;

    public AnonymousClass8CW(AnonymousClass8CV r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        0qQ.A0B(valueAnimator, 0);
        View view = this.A00.A04.getView();
        Object animatedValue = valueAnimator.getAnimatedValue();
        0qQ.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setAlpha(((Number) animatedValue).floatValue());
    }
}

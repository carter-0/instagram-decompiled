package X;

import android.animation.ValueAnimator;
import android.view.View;

public final class AJQ implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnonymousClass7VH A00;

    public AJQ(AnonymousClass7VH r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        0qQ.A0B(valueAnimator, 0);
        AnonymousClass7VH r4 = this.A00;
        View view = r4.A02;
        if (view != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            0qQ.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            view.setAlpha(1.0f - AnonymousClass7TE.A04(animatedValue));
        }
        View view2 = r4.A01;
        if (view2 != null) {
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            0qQ.A0C(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
            view2.setAlpha(AnonymousClass7TE.A04(animatedValue2));
        }
    }
}

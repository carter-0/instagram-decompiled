package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.9P4  reason: invalid class name */
public final class AnonymousClass9P4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C324466zK A01;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        0qQ.A0B(valueAnimator, 0);
        Object animatedValue = valueAnimator.getAnimatedValue();
        0qQ.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Number) animatedValue).intValue();
        View view = this.A00;
        if (view != null) {
            view.setTranslationY((float) intValue);
        }
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.A01.A00;
        if (animatorUpdateListener != null) {
            animatorUpdateListener.onAnimationUpdate(valueAnimator);
        }
    }

    public AnonymousClass9P4(View view, C324466zK r2) {
        this.A00 = view;
        this.A01 = r2;
    }
}

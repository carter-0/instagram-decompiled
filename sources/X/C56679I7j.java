package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.I7j  reason: case insensitive filesystem */
public final class C56679I7j implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C53157GjT A00;

    public C56679I7j(C53157GjT gjT) {
        this.A00 = gjT;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        0qQ.A0B(valueAnimator, 0);
        View view = this.A00.A0B;
        view.setAlpha(1.0f - C51970G9q.A04(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float"));
        view.setAlpha(C51970G9q.A04(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float"));
    }
}

package X;

import android.animation.ValueAnimator;
import android.view.View;

public final class LTj implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;

    public LTj(View view) {
        this.A00 = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        0qQ.A0B(valueAnimator, 0);
        0nA.A0V(this.A00, DbW.A04(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int"));
    }
}

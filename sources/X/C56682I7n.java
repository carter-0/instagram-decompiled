package X;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.List;

/* renamed from: X.I7n  reason: case insensitive filesystem */
public final class C56682I7n implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ List A00;

    public C56682I7n(List list) {
        this.A00 = list;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        0qQ.A0B(valueAnimator, 0);
        for (View A0e : this.A00) {
            C51974G9v.A0e(valueAnimator, A0e, valueAnimator.getAnimatedValue());
        }
    }
}

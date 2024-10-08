package X;

import android.animation.ValueAnimator;
import java.lang.ref.WeakReference;

/* renamed from: X.52A  reason: invalid class name */
public final class AnonymousClass52A implements ValueAnimator.AnimatorUpdateListener {
    public WeakReference A00;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AnonymousClass528 r1 = (AnonymousClass528) this.A00.get();
        if (r1 != null) {
            r1.A00(valueAnimator.getAnimatedFraction());
        }
    }
}

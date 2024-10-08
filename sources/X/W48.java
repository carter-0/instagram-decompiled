package X;

import android.animation.ValueAnimator;
import java.lang.ref.WeakReference;

public final class W48 implements ValueAnimator.AnimatorUpdateListener {
    public final WeakReference A00;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        0qQ.A0B(valueAnimator, 0);
        U3A u3a = (U3A) this.A00.get();
        if (u3a != null) {
            u3a.A00(valueAnimator.getAnimatedFraction());
        }
    }

    public W48(U3A u3a) {
        this.A00 = new WeakReference(u3a);
    }
}

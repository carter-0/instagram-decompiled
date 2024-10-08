package X;

import android.animation.ValueAnimator;
import java.lang.ref.Reference;

/* renamed from: X.50e  reason: invalid class name */
public final class AnonymousClass50e implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C256123vG A00;

    public AnonymousClass50e(C256123vG r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C256123vG r4 = this.A00;
        for (Reference reference : r4.A04) {
            if (!(r4.A03 == AnonymousClass05K.A00 || reference == null || reference.get() == null)) {
                ((AnonymousClass3P0) reference.get()).DEC(((Number) valueAnimator.getAnimatedValue()).floatValue());
            }
        }
    }
}

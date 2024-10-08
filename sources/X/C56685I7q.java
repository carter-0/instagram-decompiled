package X;

import android.animation.ValueAnimator;

/* renamed from: X.I7q  reason: case insensitive filesystem */
public final class C56685I7q implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ValueAnimator A00;
    public final /* synthetic */ C317026mb A01;

    public C56685I7q(ValueAnimator valueAnimator, C317026mb r2) {
        this.A00 = valueAnimator;
        this.A01 = r2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = this.A00.getAnimatedValue();
        if (animatedValue instanceof Float) {
            this.A01.A01.setAlpha(AnonymousClass7TE.A04(animatedValue));
        }
    }
}

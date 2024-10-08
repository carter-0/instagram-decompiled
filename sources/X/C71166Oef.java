package X;

import android.animation.ValueAnimator;

/* renamed from: X.Oef  reason: case insensitive filesystem */
public final /* synthetic */ class C71166Oef implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ValueAnimator.AnimatorUpdateListener A00;
    public final /* synthetic */ C242553Us A01;
    public final /* synthetic */ C328287Ef A02;

    public /* synthetic */ C71166Oef(ValueAnimator.AnimatorUpdateListener animatorUpdateListener, C242553Us r2, C328287Ef r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = animatorUpdateListener;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C328287Ef r3 = this.A02;
        C242553Us r2 = this.A01;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.A00;
        r3.FM4(r2, valueAnimator.getAnimatedFraction());
        if (animatorUpdateListener != null) {
            animatorUpdateListener.onAnimationUpdate(valueAnimator);
        }
    }
}

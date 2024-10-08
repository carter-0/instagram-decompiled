package X;

import android.animation.ValueAnimator;

public final class W45 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C14880UDi A00;

    public W45(C14880UDi uDi) {
        this.A00 = uDi;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        Object A0o = C51971G9r.A0o(valueAnimator);
        if ((A0o instanceof Integer) && (number = (Number) A0o) != null) {
            this.A00.A01.setTranslationY(-((float) number.intValue()));
        }
    }
}

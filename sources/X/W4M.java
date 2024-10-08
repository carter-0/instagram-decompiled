package X;

import android.animation.ValueAnimator;
import android.view.View;

public final class W4M implements ValueAnimator.AnimatorUpdateListener {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final Object A04;

    public W4M(Object obj, float f, float f2, float f3, int i) {
        this.A03 = i;
        this.A04 = obj;
        this.A02 = f;
        this.A01 = f2;
        this.A00 = f3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        float A002;
        Number number;
        if (this.A03 != 0) {
            Object A0o = C51971G9r.A0o(valueAnimator);
            if ((A0o instanceof Float) && (number = (Number) A0o) != null) {
                float floatValue = number.floatValue();
                view = (View) this.A04;
                view.setTranslationX(this.A01 - (this.A02 * floatValue));
                view.setTranslationY(((floatValue * floatValue) - floatValue) * 1600.0f);
                view.setRotation(this.A00 + (360.0f * floatValue));
                A002 = 1.0f;
                if (floatValue >= 0.9f) {
                    A002 = (1.0f - floatValue) * 10.0f;
                }
            } else {
                return;
            }
        } else {
            float A022 = C13989Tnp.A02(valueAnimator);
            view = (View) this.A04;
            A002 = W3G.A00(this.A02, this.A01, 0.0f, this.A00, A022);
        }
        view.setAlpha(A002);
    }
}

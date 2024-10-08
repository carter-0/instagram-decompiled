package X;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;

/* renamed from: X.LTp  reason: case insensitive filesystem */
public final class C64202LTp implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    public C64202LTp(Object obj, int i, int i2, int i3) {
        this.A00 = i3;
        this.A03 = obj;
        this.A02 = i;
        this.A01 = i2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        float f;
        Number number2;
        if (this.A00 != 0) {
            0qQ.A0B(valueAnimator, 0);
            GradientDrawable gradientDrawable = (GradientDrawable) this.A03;
            int i = this.A02;
            int i2 = this.A01;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (!(animatedValue instanceof Float) || (number2 = (Number) animatedValue) == null) {
                f = 0.0f;
            } else {
                f = number2.floatValue();
            }
            gradientDrawable.setColor(0nH.A02(f, i, i2));
            return;
        }
        Object A0o = C51971G9r.A0o(valueAnimator);
        if ((A0o instanceof Float) && (number = (Number) A0o) != null) {
            int i3 = this.A02;
            int i4 = this.A01;
            0nA.A0e(((KMS) this.A03).A0A, (int) (((float) i3) + (((float) (i4 - i3)) * number.floatValue())));
        }
    }
}

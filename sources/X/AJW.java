package X;

import android.animation.ValueAnimator;
import android.view.View;

public final class AJW implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ View A04;

    public AJW(View view, float f, float f2, int i, int i2) {
        this.A04 = view;
        this.A03 = i;
        this.A02 = i2;
        this.A01 = f;
        this.A00 = f2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        0qQ.A0B(valueAnimator, 0);
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (number = (Number) animatedValue) != null) {
            View view = this.A04;
            int i = this.A03;
            int i2 = this.A02;
            float f = this.A01;
            float f2 = this.A00;
            int intValue = number.intValue();
            view.getBackground().mutate().setTint(intValue);
            view.setTranslationX(0mi.A02((float) intValue, (float) i, (float) i2, f, f2));
        }
    }
}

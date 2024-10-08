package X;

import android.animation.ValueAnimator;
import android.view.View;

public final class AJR implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;

    public AJR(View view) {
        this.A00 = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        0qQ.A0B(valueAnimator, 0);
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (number = (Number) animatedValue) != null) {
            this.A00.setTranslationX(number.floatValue());
        }
    }
}

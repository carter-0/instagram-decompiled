package X;

import android.animation.ValueAnimator;
import com.instagram.common.ui.base.IgTextView;

public final class AJT implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ IgTextView A00;

    public AJT(IgTextView igTextView) {
        this.A00 = igTextView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        0qQ.A0B(valueAnimator, 0);
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (number = (Number) animatedValue) != null) {
            this.A00.setTextColor(number.intValue());
        }
    }
}

package X;

import android.animation.ValueAnimator;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

public final class I7k implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnonymousClass57Q A00;

    public I7k(AnonymousClass57Q r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        GradientSpinner gradientSpinner;
        Number number;
        0qQ.A0B(valueAnimator, 0);
        AnonymousClass57Q r2 = this.A00;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (!(animatedValue instanceof Float) || (number = (Number) animatedValue) == null) {
            f = r2.A00;
        } else {
            f = number.floatValue();
        }
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        r2.A00 = f;
        C227802jw r1 = r2.A06;
        if (r1 != null && (gradientSpinner = r1.A0F) != null) {
            gradientSpinner.A09(f);
        }
    }
}

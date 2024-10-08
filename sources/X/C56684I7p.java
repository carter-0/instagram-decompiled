package X;

import android.animation.ValueAnimator;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.I7p  reason: case insensitive filesystem */
public final class C56684I7p implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C314186hn A00;

    public C56684I7p(C314186hn r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        Number number;
        0qQ.A0B(valueAnimator, 0);
        C314186hn r2 = this.A00;
        if (!r2.A0H) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (!(animatedValue instanceof Float) || (number = (Number) animatedValue) == null) {
                f = r2.A00;
            } else {
                f = number.floatValue();
            }
            r2.A00 = f;
            GradientSpinner gradientSpinner = r2.A0E;
            if (gradientSpinner != null) {
                gradientSpinner.A09(f);
            }
        }
    }
}

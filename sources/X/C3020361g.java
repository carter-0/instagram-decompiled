package X;

import android.animation.ValueAnimator;
import com.instagram.ui.widget.edittext.AnimatedHintsTextLayout;

/* renamed from: X.61g  reason: invalid class name and case insensitive filesystem */
public final class C3020361g implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnimatedHintsTextLayout A00;

    public C3020361g(AnimatedHintsTextLayout animatedHintsTextLayout) {
        this.A00 = animatedHintsTextLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        0qQ.A0B(valueAnimator, 0);
        Object animatedValue = valueAnimator.getAnimatedValue();
        0qQ.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Number) animatedValue).floatValue();
        AnimatedHintsTextLayout animatedHintsTextLayout = this.A00;
        animatedHintsTextLayout.A00 = -floatValue;
        animatedHintsTextLayout.A01 = 1.0f - floatValue;
        AnimatedHintsTextLayout.A02(animatedHintsTextLayout);
    }
}

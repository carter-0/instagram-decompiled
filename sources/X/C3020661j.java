package X;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.instagram.ui.widget.edittext.AnimatedHintsTextLayout;

/* renamed from: X.61j  reason: invalid class name and case insensitive filesystem */
public final class C3020661j implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnimatedHintsTextLayout A00;

    public C3020661j(AnimatedHintsTextLayout animatedHintsTextLayout) {
        this.A00 = animatedHintsTextLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        0qQ.A0B(valueAnimator, 0);
        TextView textView = this.A00.A08;
        if (textView == null) {
            0qQ.A0F("currentHintTextView");
            throw AnonymousClass00P.createAndThrow();
        }
        Object animatedValue = valueAnimator.getAnimatedValue();
        0qQ.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        textView.setAlpha(((Number) animatedValue).floatValue());
    }
}

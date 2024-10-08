package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.6mZ  reason: invalid class name and case insensitive filesystem */
public final class C317006mZ implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C316996mY A00;

    public C317006mZ(C316996mY r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        0qQ.A0B(valueAnimator, 0);
        Object animatedValue = valueAnimator.getAnimatedValue();
        0qQ.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Number) animatedValue).floatValue();
        C316996mY r5 = this.A00;
        AnonymousClass0eM r4 = r5.A03;
        Object value = r4.getValue();
        0qQ.A07(value);
        Object value2 = r4.getValue();
        0qQ.A07(value2);
        ((View) value).setTranslationY((1.0f - floatValue) * ((float) ((View) value2).getHeight()));
        Object value3 = r4.getValue();
        0qQ.A07(value3);
        ((View) value3).setAlpha(floatValue);
        if (floatValue == 1.0f) {
            r5.A00 = true;
        }
    }
}

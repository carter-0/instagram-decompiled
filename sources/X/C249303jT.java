package X;

import android.animation.ValueAnimator;

/* renamed from: X.3jT  reason: invalid class name and case insensitive filesystem */
public final class C249303jT implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ 2V5 A00;
    public final /* synthetic */ 2V5 A01;

    public C249303jT(2V5 r1, 2V5 r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        0qQ.A0B(valueAnimator, 0);
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && animatedValue != null) {
            this.A01.A00(animatedValue);
            this.A00.A00(animatedValue);
        }
    }
}

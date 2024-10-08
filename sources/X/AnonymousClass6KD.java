package X;

import android.animation.ValueAnimator;
import android.graphics.Color;

/* renamed from: X.6KD  reason: invalid class name */
public final class AnonymousClass6KD implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnonymousClass6KV A00;

    public AnonymousClass6KD(AnonymousClass6KV r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        0qQ.A0B(valueAnimator, 0);
        float animatedFraction = valueAnimator.getAnimatedFraction();
        AnonymousClass6KV r1 = this.A00;
        float f = 1.0f - animatedFraction;
        r1.A02.setAlpha(f);
        r1.A03.setAlpha(animatedFraction);
        C316246lL r5 = r1.A04;
        C316246lL.A00(r5, (int) (((float) Color.red(r5.A00)) + (((float) (Color.red(r5.A01) - Color.red(r5.A00))) * f)), (int) (((float) Color.green(r5.A00)) + (((float) (Color.green(r5.A01) - Color.green(r5.A00))) * f)), (int) (((float) Color.blue(r5.A00)) + (((float) (Color.blue(r5.A01) - Color.blue(r5.A00))) * f)), Color.alpha(r5.A00));
    }
}

package X;

import android.animation.ValueAnimator;

public abstract class V5F {
    public static final Object A00(AnonymousClass6Tm r8) {
        ValueAnimator valueAnimator = (ValueAnimator) r8.A00.get(0);
        float A04 = C51970G9q.A04(r8.A03(1), "null cannot be cast to non-null type kotlin.Number");
        float A042 = C51970G9q.A04(r8.A03(2), "null cannot be cast to non-null type kotlin.Number");
        if (valueAnimator == null) {
            return null;
        }
        valueAnimator.setFloatValues(new float[]{C51970G9q.A04(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float"), A04});
        valueAnimator.setDuration((long) (A042 * 1000.0f));
        valueAnimator.start();
        return null;
    }
}

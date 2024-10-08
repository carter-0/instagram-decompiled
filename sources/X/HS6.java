package X;

import android.animation.ValueAnimator;

public abstract class HS6 {
    public static final ValueAnimator A00(C307896Rx r11, AnonymousClass6Tm r12) {
        C277014uI r9 = ((C280064zw) r12.A03(0)).A00;
        C277014uI r8 = ((C280064zw) r12.A03(1)).A00;
        float A04 = C51970G9q.A04(r12.A03(2), "null cannot be cast to non-null type kotlin.Number");
        float A042 = C51970G9q.A04(r12.A03(3), "null cannot be cast to non-null type kotlin.Number");
        float A043 = C51970G9q.A04(r12.A03(4), "null cannot be cast to non-null type kotlin.Number");
        ValueAnimator valueAnimator = new ValueAnimator();
        AnonymousClass6Tm A0Q = DbY.A0Q(valueAnimator);
        valueAnimator.addUpdateListener(new I82(0, (Object) A0Q, (Object) r9, (Object) r11));
        valueAnimator.addListener(new C56673I7c(0, r11, A0Q, r8));
        C51969G9p.A10(valueAnimator);
        valueAnimator.setFloatValues(new float[]{A04, A042});
        valueAnimator.setDuration((long) (A043 * 1000.0f));
        return valueAnimator;
    }
}

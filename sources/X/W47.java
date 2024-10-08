package X;

import android.animation.ValueAnimator;

public final class W47 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnonymousClass6O8 A00;

    public W47(AnonymousClass6O8 r1) {
        this.A00 = r1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object A0o = C51971G9r.A0o(valueAnimator);
        0qQ.A0C(A0o, "null cannot be cast to non-null type kotlin.Int");
        Integer num = (Integer) A0o;
        AnonymousClass6O8 r3 = this.A00;
        if (r3.A03 == null || r3.A04 == null) {
            r3.A02.A02((Integer) null, Integer.valueOf(r3.A01));
            return;
        }
        float f = r3.A00;
        if (f <= 0.0f || valueAnimator.getAnimatedFraction() > f) {
            r3.A02.A02(num, Integer.valueOf(r3.A01));
        } else {
            r3.A02.A02(num, (Integer) null);
        }
    }
}

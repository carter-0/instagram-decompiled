package X;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateInterpolator;

/* renamed from: X.HxQ  reason: case insensitive filesystem */
public abstract class C56372HxQ {
    public static final void A00(2V5 r4, C243673Zt r5) {
        boolean A1Z = AnonymousClass7TG.A1Z(r5, r4);
        C51973G9u.A18(r5);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{-8.0f, 0.0f, 8.0f, 0.0f});
        ofFloat.setDuration(250);
        ofFloat.setRepeatCount(A1Z ? 1 : 0);
        ofFloat.setRepeatMode(A1Z);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        C51970G9q.A11(new I84(r4, 31), ofFloat, r5);
    }

    public static final void A01(2V5 r3, C243673Zt r4, long j) {
        AnonymousClass7TG.A1N(r4, r3);
        C51973G9u.A18(r4);
        float[] A1b = C51965G9l.A1b();
        // fill-array-data instruction
        A1b[0] = 0;
        A1b[1] = 1065353216;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A1b);
        ofFloat.setDuration(j);
        C51970G9q.A11(new I84(r3, 28), ofFloat, r4);
    }
}

package X;

import android.animation.ValueAnimator;
import android.view.animation.Interpolator;

public abstract class HSI {
    public static final IIW A00(Interpolator interpolator, 2V5 r4, C59536JNi jNi, float f, long j) {
        0qQ.A0B(r4, 0);
        float[] A1b = C51965G9l.A1b();
        A1b[0] = C51970G9q.A02(r4);
        A1b[1] = f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A1b);
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(interpolator);
        ofFloat.addUpdateListener(new I84(r4, 0));
        IIW iiw = new IIW(ofFloat);
        if (jNi != null) {
            iiw.A8x(jNi);
        }
        return iiw;
    }
}

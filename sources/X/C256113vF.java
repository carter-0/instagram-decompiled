package X;

import android.animation.ValueAnimator;
import java.lang.ref.WeakReference;

/* renamed from: X.3vF  reason: invalid class name and case insensitive filesystem */
public final class C256113vF {
    public AnonymousClass3P0 A00;
    public WeakReference A01;
    public final C256123vG A02 = new C256123vG();

    public final void A00() {
        C256123vG r1 = this.A02;
        ValueAnimator valueAnimator = r1.A01;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.cancel();
            r1.A03 = AnonymousClass05K.A00;
        }
    }

    public final void A01(long j, long j2) {
        ValueAnimator valueAnimator;
        C256123vG r2 = this.A02;
        Integer num = r2.A03;
        Integer num2 = AnonymousClass05K.A00;
        if (!(num == num2 || (valueAnimator = r2.A01) == null)) {
            valueAnimator.removeAllListeners();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.cancel();
            r2.A03 = num2;
        }
        r2.A03 = AnonymousClass05K.A01;
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(j2);
        r2.A01 = duration;
        duration.setStartDelay(j);
        ValueAnimator valueAnimator2 = r2.A01;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = r2.A00;
        if (animatorUpdateListener == null) {
            animatorUpdateListener = new AnonymousClass50e(r2);
            r2.A00 = animatorUpdateListener;
        }
        valueAnimator2.addUpdateListener(animatorUpdateListener);
        ValueAnimator valueAnimator3 = r2.A01;
        AnonymousClass4HM r0 = r2.A02;
        if (r0 == null) {
            r0 = new C2801250f(r2);
            r2.A02 = r0;
        }
        valueAnimator3.addListener(r0);
        r2.A01.start();
    }
}

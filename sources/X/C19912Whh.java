package X;

import android.animation.ValueAnimator;

/* renamed from: X.Whh  reason: case insensitive filesystem */
public final class C19912Whh implements Runnable {
    public final /* synthetic */ UAl A00;

    public C19912Whh(UAl uAl) {
        this.A00 = uAl;
    }

    public final void run() {
        UAl uAl = this.A00;
        int i = uAl.A02;
        if (i == 1) {
            uAl.A0K.cancel();
        } else if (i != 2) {
            return;
        }
        uAl.A02 = 3;
        ValueAnimator valueAnimator = uAl.A0K;
        valueAnimator.setFloatValues(new float[]{C13989Tnp.A02(valueAnimator), 0.0f});
        valueAnimator.setDuration(500);
        valueAnimator.start();
    }
}

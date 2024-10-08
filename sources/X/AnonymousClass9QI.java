package X;

import android.os.CountDownTimer;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: X.9QI  reason: invalid class name */
public final class AnonymousClass9QI {
    public CountDownTimer A00;
    public Interpolator A01 = new PathInterpolator(0.9f, 0.0f, 1.0f, 0.1f);
    public final AnonymousClass9QL A02;

    public final void A00() {
        CountDownTimer countDownTimer = this.A00;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A00 = null;
            this.A02.A00(1.0f);
        }
    }

    public AnonymousClass9QI(AnonymousClass9QL r6) {
        this.A02 = r6;
    }
}

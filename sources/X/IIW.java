package X;

import android.animation.ValueAnimator;

public final class IIW implements C59606JQa {
    public boolean A00;
    public boolean A01;
    public final ValueAnimator A02;

    public final void cancel() {
        this.A00 = false;
        this.A01 = true;
        this.A02.cancel();
    }

    public final void start() {
        this.A00 = true;
        this.A01 = false;
        this.A02.start();
    }

    public final void A8x(C59536JNi jNi) {
        this.A02.addListener(new C52777GcU(0, this, jNi));
    }

    public final boolean isActive() {
        return this.A00;
    }

    public IIW(ValueAnimator valueAnimator) {
        this.A02 = valueAnimator;
    }
}

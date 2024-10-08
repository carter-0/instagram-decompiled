package X;

import android.animation.ValueAnimator;

/* renamed from: X.Wjo  reason: case insensitive filesystem */
public final class C20028Wjo implements Runnable {
    public final /* synthetic */ C324466zK A00;

    public C20028Wjo(C324466zK r1) {
        this.A00 = r1;
    }

    public final void run() {
        C324466zK r1 = this.A00;
        ValueAnimator valueAnimator = r1.A01;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            r1.A03 = AnonymousClass05K.A01;
            ValueAnimator valueAnimator2 = r1.A01;
            if (valueAnimator2 != null) {
                valueAnimator2.reverse();
            }
        }
    }
}

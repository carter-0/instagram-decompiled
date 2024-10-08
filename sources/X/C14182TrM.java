package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.TrM  reason: case insensitive filesystem */
public final class C14182TrM implements Runnable {
    public final /* synthetic */ C324466zK A00;

    public C14182TrM(C324466zK r1) {
        this.A00 = r1;
    }

    public final void run() {
        Float f;
        C324466zK r2 = this.A00;
        ValueAnimator valueAnimator = r2.A01;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            View view = r2.A02;
            if (view != null) {
                f = Float.valueOf(view.getTranslationY());
            } else {
                f = null;
            }
            if (0qQ.A0I(f, (float) r2.A05)) {
                r2.A03 = AnonymousClass05K.A00;
                ValueAnimator valueAnimator2 = r2.A01;
                if (valueAnimator2 != null) {
                    valueAnimator2.start();
                }
            }
        }
    }
}

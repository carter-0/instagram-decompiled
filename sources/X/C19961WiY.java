package X;

import android.animation.ValueAnimator;

/* renamed from: X.WiY  reason: case insensitive filesystem */
public final class C19961WiY implements Runnable {
    public final /* synthetic */ U3Z A00;

    public C19961WiY(U3Z u3z) {
        this.A00 = u3z;
    }

    public final void run() {
        U3Z u3z = this.A00;
        u3z.A02 = true;
        u3z.A00 = null;
        for (C17722Vcr vcr : u3z.A05) {
            vcr.A0D.cancel();
            ValueAnimator valueAnimator = vcr.A06;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            vcr.A09 = null;
        }
        u3z.A03.removeCallbacksAndMessages((Object) null);
    }
}

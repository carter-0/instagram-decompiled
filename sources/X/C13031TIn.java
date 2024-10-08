package X;

import android.view.animation.Interpolator;

/* renamed from: X.TIn  reason: case insensitive filesystem */
public final class C13031TIn implements Runnable {
    public final /* synthetic */ RFH A00;
    public final /* synthetic */ C7927Qcy A01;
    public final /* synthetic */ Integer A02;

    public C13031TIn(RFH rfh, C7927Qcy qcy, Integer num) {
        this.A01 = qcy;
        this.A00 = rfh;
        this.A02 = num;
    }

    public final void run() {
        C7927Qcy qcy = this.A01;
        if (qcy.mLifecycleRegistry.A07().compareTo(07U.A04) >= 0) {
            Interpolator interpolator = C7927Qcy.A0S;
            if (qcy.A0I) {
                C7927Qcy.A02(this.A00, qcy, this.A02);
            }
        }
    }
}

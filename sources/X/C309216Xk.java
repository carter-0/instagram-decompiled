package X;

import android.os.SystemClock;

/* renamed from: X.6Xk  reason: invalid class name and case insensitive filesystem */
public final class C309216Xk implements Runnable {
    public final /* synthetic */ C309206Xj A00;

    public C309216Xk(C309206Xj r1) {
        this.A00 = r1;
    }

    public final void run() {
        C309206Xj r1 = this.A00;
        if (r1.A07 > 0) {
            SystemClock.uptimeMillis();
        }
        r1.setVisibility(0);
    }
}

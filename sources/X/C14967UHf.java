package X;

import android.view.Choreographer;

/* renamed from: X.UHf  reason: case insensitive filesystem */
public final class C14967UHf extends C364948mH {
    public final /* synthetic */ WG8 A00;

    public C14967UHf(WG8 wg8) {
        this.A00 = wg8;
    }

    public final void A00(long j) {
        WG8 wg8 = this.A00;
        if (wg8.A07) {
            C364928mF r2 = wg8.A04;
            C14967UHf uHf = wg8.A05;
            Choreographer.FrameCallback frameCallback = uHf.A00;
            if (frameCallback == null) {
                frameCallback = new ALk(uHf);
                uHf.A00 = frameCallback;
            }
            r2.A00.removeFrameCallback(frameCallback);
            wg8.A01 = null;
            wg8.A07 = false;
        } else if (wg8.A01 == null) {
        } else {
            if ((wg8.A02 == null || wg8.A00 <= j) && wg8.A06) {
                Long l = wg8.A02;
                if (l != null) {
                    long longValue = l.longValue();
                    wg8.A00 = longValue * ((j / longValue) + 1);
                }
                WG9 wg9 = wg8.A01;
                System.nanoTime();
                if (Thread.currentThread() == wg9.A01) {
                    wg9.A03.A0I(wg8);
                } else {
                    WG9.A00(wg9, wg8, 3);
                }
            } else {
                wg8.A04.A00(wg8.A05);
            }
        }
    }
}

package X;

import android.os.Looper;

/* renamed from: X.Wma  reason: case insensitive filesystem */
public final /* synthetic */ class C20176Wma implements Runnable {
    public final /* synthetic */ C256683wB A00;
    public final /* synthetic */ WMA A01;

    public /* synthetic */ C20176Wma(C256683wB r1, WMA wma) {
        this.A01 = wma;
        this.A00 = r1;
    }

    public final void run() {
        WMA wma = this.A01;
        C256683wB r4 = this.A00;
        WMB wmb = wma.A03;
        if (wmb.A00 != 0 && !wma.A01) {
            Looper looper = wmb.A02;
            looper.getClass();
            wma.A00 = WMB.A01(looper, r4, wmb, wma.A02, false);
            wmb.A0A.add(wma);
        }
    }
}

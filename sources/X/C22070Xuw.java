package X;

import android.os.SystemClock;

/* renamed from: X.Xuw  reason: case insensitive filesystem */
public final /* synthetic */ class C22070Xuw implements C22547Y8x {
    public final /* synthetic */ C22072Xuy A00;

    public /* synthetic */ C22070Xuw(C22072Xuy xuy) {
        this.A00 = xuy;
    }

    public final void DTs(int i) {
        int i2;
        C22072Xuy xuy = this.A00;
        C22072Xuy xuy2 = C22072Xuy.A0C;
        synchronized (xuy) {
            if (xuy.A00 != i) {
                xuy.A00 = i;
                if (!(i == 1 || i == 0 || i == 8)) {
                    long A002 = C22072Xuy.A00(xuy, i);
                    xuy.A02 = A002;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (xuy.A01 > 0) {
                        i2 = (int) (elapsedRealtime - xuy.A04);
                    } else {
                        i2 = 0;
                    }
                    C22072Xuy.A01(xuy, i2, xuy.A03, A002);
                    xuy.A04 = elapsedRealtime;
                    xuy.A03 = 0;
                    xuy.A05 = 0;
                    xuy.A06 = 0;
                    XnG xnG = xuy.A09;
                    xnG.A04.clear();
                    xnG.A00 = -1;
                    xnG.A01 = 0;
                    xnG.A03 = 0;
                }
            }
        }
    }
}

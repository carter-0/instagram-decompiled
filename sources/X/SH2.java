package X;

import android.os.SystemClock;

public final class SH2 {
    public static final SH2 A02 = new SH2();
    public long A00 = -1;
    public C10744RxN A01 = new Object();

    public final synchronized void A00(int i, boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.A00;
        long j2 = elapsedRealtime - j;
        C10744RxN rxN = this.A01;
        rxN.A00++;
        long j3 = 14000;
        if (j < 0 || j2 > 14000) {
            rxN.A03++;
        }
        if (z) {
            rxN.A02 += i;
        } else {
            rxN.A01 += i;
        }
        long j4 = rxN.A04;
        if (j >= 0) {
            j3 = Math.min(14000, j2);
        }
        rxN.A04 = j4 + j3;
        this.A00 = elapsedRealtime;
    }
}

package X;

import android.os.SystemClock;

/* renamed from: X.2xW  reason: invalid class name and case insensitive filesystem */
public final class C234262xW {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public final C61410nE A05 = C61410nE.A00;

    public final void A00(int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.A03;
        long j2 = 0;
        if (j != 0) {
            long j3 = elapsedRealtime - j;
            if (j3 != 0) {
                j2 = (((long) i) * 1000) / j3;
            }
        }
        this.A04 = j2;
        this.A03 = elapsedRealtime;
    }
}

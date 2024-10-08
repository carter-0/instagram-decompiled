package X;

import android.os.SystemClock;
import com.facebook.rti.common.time.RealtimeSinceBootClock;

/* renamed from: X.Sq2  reason: case insensitive filesystem */
public final class C12248Sq2 implements C13576Td1 {
    public double A00;
    public long A01;
    public final int A02;
    public final long A03;
    public final RealtimeSinceBootClock A04;

    public final synchronized boolean AGz() {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.A01 = elapsedRealtime;
        double d = this.A00;
        double d2 = (double) (elapsedRealtime - this.A01);
        double d3 = (double) this.A02;
        double d4 = d + ((d2 * (d3 / ((double) this.A03))) / 1000.0d);
        this.A00 = d4;
        if (d4 > d3) {
            this.A00 = d3;
            d4 = d3;
        }
        if (d4 < 1.0d) {
            z = false;
        } else {
            this.A00 = d4 - 1.0d;
            z = true;
        }
        return z;
    }

    public C12248Sq2(RealtimeSinceBootClock realtimeSinceBootClock, int i, long j) {
        this.A04 = realtimeSinceBootClock;
        this.A02 = i;
        this.A03 = j;
        this.A00 = (double) i;
    }
}

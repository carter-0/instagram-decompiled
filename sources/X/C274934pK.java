package X;

import android.os.Debug;
import android.os.SystemClock;

/* renamed from: X.4pK  reason: invalid class name and case insensitive filesystem */
public final class C274934pK {
    public static C274934pK A0E;
    public long A00 = 0;
    public long A01 = 0;
    public long A02 = 0;
    public long A03 = 0;
    public long A04 = 0;
    public long A05 = 0;
    public long A06 = 0;
    public long A07 = 0;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;

    public final void A00() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            String runtimeStat = Debug.getRuntimeStat("art.gc.gc-count");
            if (runtimeStat == null) {
                j = 0;
            } else {
                j = Long.parseLong(runtimeStat);
            }
            String runtimeStat2 = Debug.getRuntimeStat("art.gc.gc-time");
            if (runtimeStat2 == null) {
                j2 = 0;
            } else {
                j2 = Long.parseLong(runtimeStat2);
            }
            String runtimeStat3 = Debug.getRuntimeStat("art.gc.blocking-gc-count");
            if (runtimeStat3 == null) {
                j3 = 0;
            } else {
                j3 = Long.parseLong(runtimeStat3);
            }
            String runtimeStat4 = Debug.getRuntimeStat("art.gc.blocking-gc-time");
            if (runtimeStat4 == null) {
                j4 = 0;
            } else {
                j4 = Long.parseLong(runtimeStat4);
            }
            String runtimeStat5 = Debug.getRuntimeStat("art.gc.bytes-allocated");
            if (runtimeStat5 == null) {
                j5 = 0;
            } else {
                j5 = Long.parseLong(runtimeStat5);
            }
            String runtimeStat6 = Debug.getRuntimeStat("art.gc.bytes-freed");
            if (runtimeStat6 == null) {
                j6 = 0;
            } else {
                j6 = Long.parseLong(runtimeStat6);
            }
            long j7 = this.A00;
            if (j7 > 0) {
                this.A05 = j - this.A0C;
                this.A06 = j2 - this.A0D;
                this.A02 = j3 - this.A09;
                this.A03 = j4 - this.A0A;
                this.A01 = j5 - this.A08;
                this.A04 = j6 - this.A0B;
                this.A07 = uptimeMillis - j7;
            }
            this.A0C = j;
            this.A0D = j2;
            this.A09 = j3;
            this.A0A = j4;
            this.A08 = j5;
            this.A0B = j6;
            this.A00 = uptimeMillis;
        } catch (Throwable unused) {
        }
    }
}

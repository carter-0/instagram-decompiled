package X;

import android.os.Process;
import android.os.SystemClock;
import java.io.File;

/* renamed from: X.4pS  reason: invalid class name and case insensitive filesystem */
public final class C275014pS extends C275004pR {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public boolean A04;
    public boolean A05;
    public final long[] A06 = new long[3];
    public final String A07;

    public static boolean A00(C275014pS r6, long[] jArr) {
        try {
            String A012 = C275004pR.A01(new File(r6.A07));
            if (A012 == null) {
                return false;
            }
            String[] split = A012.split("\\s+");
            jArr[0] = Long.parseLong(split[0]);
            jArr[1] = Long.parseLong(split[1]);
            jArr[2] = Long.parseLong(split[2]);
            return true;
        } catch (Throwable unused) {
            r6.A05 = false;
            return false;
        }
    }

    public final String A01() {
        if (!this.A05) {
            return null;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long[] jArr = this.A06;
        if (!A00(this, jArr)) {
            return null;
        }
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = j - this.A01;
        long j5 = j2 - this.A02;
        long j6 = j3 - this.A00;
        StringBuilder sb = new StringBuilder();
        sb.append(j4);
        sb.append(',');
        sb.append(j5);
        sb.append(',');
        sb.append(j6);
        sb.append(',');
        sb.append(uptimeMillis - this.A03);
        return sb.toString();
    }

    public final void A02() {
        if (this.A05) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long[] jArr = this.A06;
            if (A00(this, jArr)) {
                long j = jArr[0];
                long j2 = jArr[1];
                long j3 = jArr[2];
                if (this.A04) {
                    this.A01 = j;
                    this.A02 = j2;
                    this.A00 = j3;
                } else {
                    this.A03 = uptimeMillis;
                    this.A01 = j;
                    this.A02 = j2;
                    this.A00 = j3;
                }
                this.A04 = false;
            }
        }
    }

    public C275014pS(int i) {
        boolean z = true;
        this.A04 = true;
        String A0n = 002.A0n("/proc/", "/task/", "/schedstat", Process.myPid(), i);
        this.A07 = A0n;
        File file = new File(A0n);
        this.A05 = (!file.exists() || !file.canRead()) ? false : z;
    }

    public C275014pS() {
        boolean z = true;
        this.A04 = true;
        String A0c = 002.A0c("/proc/", "/schedstat", Process.myPid());
        this.A07 = A0c;
        File file = new File(A0c);
        this.A05 = (!file.exists() || !file.canRead()) ? false : z;
    }
}

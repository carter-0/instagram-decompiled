package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4N4  reason: invalid class name */
public final class AnonymousClass4N4 {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public AnonymousClass5M9 A05;
    public AnonymousClass5M9 A06;
    public AnonymousClass5M9 A07;
    public long A08;
    public final AnonymousClass4N2 A09;
    public final AnonymousClass4N3 A0A;
    public final List A0B = new ArrayList();

    public final synchronized void A00() {
        this.A00 = 0;
        this.A01 = 0;
        this.A04 = 0;
        this.A03 = -1;
        this.A02 = -1;
        this.A05 = null;
        this.A06 = null;
        this.A07 = null;
        this.A0B.clear();
        this.A08 = -1;
    }

    public final synchronized void A01() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.A03;
        if (j >= 0) {
            long j2 = elapsedRealtime - j;
            if (j2 > 0) {
                this.A00++;
                if (j2 > 200) {
                    this.A01++;
                }
                this.A04 += j2;
                AnonymousClass5M9 r3 = new AnonymousClass5M9(this.A02, j, j2);
                if (this.A05 == null) {
                    this.A05 = r3;
                }
                this.A06 = r3;
                AnonymousClass5M9 r0 = this.A07;
                if (r0 == null || j2 > r0.A00) {
                    this.A07 = r3;
                }
                this.A0B.add(r3);
            }
        }
        this.A03 = -1;
        this.A02 = -1;
        this.A08 = -1;
    }

    public AnonymousClass4N4(AnonymousClass4N2 r2, AnonymousClass4N3 r3) {
        this.A09 = r2;
        this.A0A = r3;
        A00();
    }
}

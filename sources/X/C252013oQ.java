package X;

import android.os.SystemClock;

/* renamed from: X.3oQ  reason: invalid class name and case insensitive filesystem */
public final class C252013oQ {
    public final long A00;
    public final C252003oP A01;
    public final 1Qe A02;
    public final 1QS A03;
    public final 1QU A04;

    public C252013oQ(C252003oP r3, 1Qe r4, 1QS r5, 1QU r6) {
        this.A03 = r5;
        this.A04 = r6;
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = SystemClock.elapsedRealtime();
    }

    public C252013oQ(C252013oQ r3) {
        this.A03 = r3.A03;
        this.A04 = r3.A04;
        this.A02 = r3.A02;
        this.A01 = r3.A01;
        this.A00 = r3.A00;
    }
}

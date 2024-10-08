package X;

/* renamed from: X.3s7  reason: invalid class name and case insensitive filesystem */
public final class C254213s7 {
    public int A00 = 0;
    public int A01 = 0;
    public long A02 = 0;
    public long A03 = -1;
    public long A04 = 0;
    public long A05 = 0;
    public Long A06;
    public String A07;
    public long A08 = -1;

    public static void A00(C254213s7 r5, long j) {
        long j2 = r5.A08;
        if (j2 >= 0) {
            long j3 = j - j2;
            r5.A05 += j3;
            r5.A04 = Math.max(r5.A04, j3);
            r5.A08 = -1;
        }
    }

    public final long A01(C252093oY r7) {
        long j = this.A08;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        long j2 = this.A05;
        if (i >= 0) {
            return (j2 + r7.BlK()) - j;
        }
        return j2;
    }

    public final void A02() {
        this.A04 = 0;
        this.A05 = 0;
        this.A02 = 0;
    }

    public final void A03(AnonymousClass30Y r8, C252093oY r9) {
        float CFe = r9.CFe(r8);
        long j = this.A08;
        if (j < 0 && CFe >= 0.5f) {
            this.A08 = r9.BlK();
        } else if (j >= 0 && CFe < 0.5f) {
            A00(this, r9.BlK());
        }
        if (this.A03 < 0 && CFe >= 0.5f) {
            this.A03 = r9.BlK();
        }
        this.A00 = r9.BPd(r8);
        this.A01 = r9.BPe(r8);
        this.A07 = AnonymousClass1QI.A00.A02.A00;
    }

    public final void A04(C252093oY r9) {
        long BlK = r9.BlK();
        long j = this.A03;
        if (j > 0) {
            this.A02 = BlK - j;
            this.A03 = -1;
        }
        A00(this, BlK);
    }
}

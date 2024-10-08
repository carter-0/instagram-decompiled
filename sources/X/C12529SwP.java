package X;

/* renamed from: X.SwP  reason: case insensitive filesystem */
public final class C12529SwP implements C13953TmG {
    public long A00;
    public final C301755zw A01;
    public final C301755zw A02;
    public final long A03;

    public final boolean CbO() {
        return true;
    }

    public final long AvI() {
        return this.A03;
    }

    public final long AzU() {
        return this.A00;
    }

    public final C21498Xcy BrA(long j) {
        C301755zw r4 = this.A02;
        int i = r4.A00 - 1;
        int i2 = 0;
        int i3 = 0;
        while (i3 <= i) {
            int i4 = (i3 + i) >>> 1;
            if (r4.A00(i4) < j) {
                i3 = i4 + 1;
            } else {
                i = i4 - 1;
            }
        }
        int i5 = i + 1;
        if (i5 < r4.A00 && r4.A00(i5) == j) {
            i2 = i5;
        } else if (i != -1) {
            i2 = i;
        }
        long A002 = r4.A00(i2);
        C301755zw r6 = this.A01;
        SJ7 sj7 = new SJ7(A002, r6.A00(i2));
        if (sj7.A01 == j || i2 == r4.A00 - 1) {
            return new C21498Xcy(sj7, sj7);
        }
        int i6 = i2 + 1;
        return new C21498Xcy(sj7, new SJ7(r4.A00(i6), r6.A00(i6)));
    }

    public final long C7P(long j) {
        C301755zw r7 = this.A01;
        int i = r7.A00 - 1;
        int i2 = 0;
        int i3 = 0;
        while (i3 <= i) {
            int i4 = (i3 + i) >>> 1;
            if (r7.A00(i4) < j) {
                i3 = i4 + 1;
            } else {
                i = i4 - 1;
            }
        }
        int i5 = i + 1;
        if (i5 < r7.A00 && r7.A00(i5) == j) {
            i2 = i5;
        } else if (i != -1) {
            i2 = i;
        }
        return this.A02.A00(i2);
    }

    public final /* synthetic */ long C9E(int i) {
        return this.A00;
    }

    public C12529SwP(long j, long j2, long j3) {
        this.A00 = j;
        this.A03 = j3;
        C301755zw r3 = new C301755zw();
        this.A02 = r3;
        C301755zw r2 = new C301755zw();
        this.A01 = r2;
        r3.A01(0);
        r2.A01(j2);
    }
}

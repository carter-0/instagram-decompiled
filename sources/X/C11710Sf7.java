package X;

/* renamed from: X.Sf7  reason: case insensitive filesystem */
public final class C11710Sf7 implements C13511Tbc {
    public final long A00;
    public final S5O A01;

    public static void A00(YBZ ybz, long j) {
        ybz.EKw(new C11710Sf7(j, 0));
    }

    public final S5O Br9(long j) {
        return this.A01;
    }

    public C11710Sf7(long j, long j2) {
        SJ4 sj4;
        this.A00 = j;
        if (j2 == 0) {
            sj4 = SJ4.A02;
        } else {
            sj4 = new SJ4(0, j2);
        }
        this.A01 = new S5O(sj4, sj4);
    }

    public C11710Sf7(long j) {
        this(j, 0);
    }
}

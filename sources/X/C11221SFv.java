package X;

/* renamed from: X.SFv  reason: case insensitive filesystem */
public final class C11221SFv {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final C13900TjN A0C;

    public static void A00(C11221SFv sFv, int i) {
        long j = sFv.A04;
        if (j != -9223372036854775807L) {
            boolean z = sFv.A0B;
            int i2 = (int) (sFv.A01 - sFv.A03);
            sFv.A0C.EJm((S4h) null, z ? 1 : 0, i2, i, j);
        }
    }

    public C11221SFv(C13900TjN tjN) {
        this.A0C = tjN;
    }
}

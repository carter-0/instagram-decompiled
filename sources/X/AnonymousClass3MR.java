package X;

/* renamed from: X.3MR  reason: invalid class name */
public abstract class AnonymousClass3MR extends AnonymousClass3MF {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public int A05 = 0;
    public int A06 = 0;
    public int A07 = 0;
    public AnonymousClass2d8 A08 = new Object();
    public C71472dN A09 = null;
    public boolean A0A = false;

    public final void A0d(2d3 r4, Integer num, Integer num2, int i, int i2) {
        C71472dN r2;
        2d1 r0;
        while (true) {
            r2 = this.A09;
            if (r2 != null || (r0 = this.A0h) == null) {
                AnonymousClass2d8 r1 = this.A08;
                r1.A06 = num;
                r1.A07 = num2;
                r1.A00 = i;
                r1.A05 = i2;
                r2.Cnt(r4, r1);
                r4.A0I(r1.A04);
                r4.A0H(r1.A03);
                r4.A0q = r1.A08;
                r4.A0G(r1.A02);
            } else {
                this.A09 = r0.A08;
            }
        }
        AnonymousClass2d8 r12 = this.A08;
        r12.A06 = num;
        r12.A07 = num2;
        r12.A00 = i;
        r12.A05 = i2;
        r2.Cnt(r4, r12);
        r4.A0I(r12.A04);
        r4.A0H(r12.A03);
        r4.A0q = r12.A08;
        r4.A0G(r12.A02);
    }
}

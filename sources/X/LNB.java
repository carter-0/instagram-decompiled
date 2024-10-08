package X;

import java.util.concurrent.CancellationException;

public final class LNB {
    public int A00;
    public int A01;
    public int A02;
    public ULY A03;
    public LN0 A04;
    public 0sP A05;
    public C262204Co A06;
    public boolean A07;
    public final double A08;
    public final double A09;
    public final double A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final long A0G;
    public final String A0H;
    public final String A0I;
    public final AnonymousClass0eM A0J = AnonymousClass0eN.A01(new C73912Pln(this, 30));
    public final AnonymousClass0eM A0K = AnonymousClass0eN.A01(new C73912Pln(this, 31));

    public LNB(ULY uly, LN0 ln0, String str, String str2, 0sP r7, double d, double d2, double d3, int i, int i2, int i3, int i4, int i5, long j) {
        0qQ.A0B(r7, 14);
        this.A03 = uly;
        this.A0G = j;
        this.A08 = d;
        this.A0D = i;
        this.A0F = i2;
        this.A0C = i3;
        this.A0I = str;
        this.A0H = str2;
        this.A0A = d2;
        this.A0E = i4;
        this.A09 = d3;
        this.A0B = i5;
        this.A04 = ln0;
        this.A05 = r7;
    }

    public static final void A00(LNB lnb) {
        C262204Co r1 = lnb.A06;
        if (r1 != null) {
            r1.AG7((CancellationException) null);
            lnb.A06 = null;
        }
        lnb.A00 = ((C63973LGd) lnb.A0J.getValue()).A01(lnb.A03.A00);
        lnb.A01 = 0;
        lnb.A02 = 0;
        LN0 ln0 = lnb.A04;
        ln0.A00 = 0;
        ln0.A02 = Long.MAX_VALUE;
        ln0.A01 = 0;
        ln0.A06.set(false);
    }
}

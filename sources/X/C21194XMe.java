package X;

/* renamed from: X.XMe  reason: case insensitive filesystem */
public final class C21194XMe extends AnonymousClass8GD {
    public C21986Xoh A00;
    public C21986Xoh A01;
    public final /* synthetic */ B2T A02;
    public final /* synthetic */ C340957m6 A03;

    public C21194XMe(B2T b2t, C340957m6 r2) {
        this.A03 = r2;
        this.A02 = b2t;
    }

    public final void A01(Exception exc) {
        this.A02.DxB(exc);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Xnz, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void A02(Object obj) {
        C21986Xoh xoh = (C21986Xoh) obj;
        int intValue = xoh.A00(C21986Xoh.A0J).intValue();
        C340957m6 r3 = this.A03;
        if (intValue == r3.A00) {
            this.A01 = xoh;
        } else {
            this.A00 = xoh;
        }
        C21986Xoh xoh2 = this.A01;
        if (xoh2 != null) {
            C21986Xoh xoh3 = this.A00;
            if (xoh3 != null) {
                ? obj2 = new Object();
                obj2.A0I = true;
                obj2.A00 = 0;
                obj2.A05 = 0;
                obj2.A06 = -1;
                obj2.A07 = -1;
                obj2.A08 = -1;
                obj2.A09 = -1;
                obj2.A0G = xoh2.A0G;
                obj2.A0B = xoh2.A0B;
                obj2.A0H = xoh2.A0H;
                obj2.A0C = xoh2.A0C;
                obj2.A03 = xoh2.A07;
                obj2.A02 = xoh2.A06;
                obj2.A04 = xoh2.A08;
                obj2.A01 = xoh2.A05;
                obj2.A0I = xoh2.A0I;
                obj2.A00 = xoh2.A04;
                obj2.A05 = xoh2.A09;
                obj2.A0D = xoh2.A0D;
                obj2.A0E = xoh2.A0E;
                obj2.A0F = xoh2.A0F;
                obj2.A06 = xoh2.A00;
                obj2.A07 = xoh2.A01;
                obj2.A08 = xoh2.A02;
                obj2.A09 = xoh2.A03;
                obj2.A0A = xoh2.A0A;
                obj2.A01(C21986Xoh.A0R, xoh3);
                xoh2 = new C21986Xoh(obj2);
            } else if (!r3.A08) {
                return;
            }
            r3.A03 = xoh2;
            this.A02.DxC(xoh2);
        }
    }
}

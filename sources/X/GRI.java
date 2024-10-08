package X;

public final class GRI {
    public long A00 = Long.MIN_VALUE;
    public final C284945Oz A01 = C51969G9p.A0S(AnonymousClass7TE.A0v());
    public final C284945Oz A02 = C51970G9q.A0S(false);
    public final C285045Pl A03 = new C285045Pl(new GRG[16]);

    public final void A00(C286575Wy r9, int i) {
        int i2;
        r9.ExV(-318043801);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r9, this) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r9.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1025754308, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:171)");
            }
            Object ECw = r9.ECw();
            Object obj = AnonymousClass5XT.A00;
            if (ECw == obj) {
                ECw = G9t.A0o(r9, (Object) null);
            }
            if (C51971G9r.A1W(this.A01) || C51971G9r.A1W(this.A02)) {
                boolean A1Z = C51967G9n.A1Z(r9, this, 1719915818);
                Object ECw2 = r9.ECw();
                if (A1Z || ECw2 == obj) {
                    ECw2 = new MHG(ECw, (Object) this, (AnonymousClass4D7) null, 1, 42);
                    r9.FLL(ECw2);
                }
                C286645Xf.A04(r9, this, (0sL) ECw2);
            } else {
                r9.ExS(1721436120);
            }
            if (C51970G9q.A1Z(r9)) {
                0fL.A00(-116243234);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, this, i, 0);
        }
    }
}

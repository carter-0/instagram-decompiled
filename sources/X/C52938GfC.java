package X;

/* renamed from: X.GfC  reason: case insensitive filesystem */
public final class C52938GfC extends AnonymousClass6GP {
    public final /* synthetic */ C268834e4 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52938GfC(C268834e4 r1) {
        super(r1);
        this.A00 = r1;
    }

    public final int A0K(C292215ia r4) {
        int i;
        C290225ey r0 = this.A04.A0H.A0U.A05;
        0qQ.A0A(r0);
        Number A14 = C51966G9m.A14(r4, r0.A0K());
        if (A14 != null) {
            i = A14.intValue();
        } else {
            i = AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        this.A05.put(r4, Integer.valueOf(i));
        return i;
    }

    public final void A0T() {
        C290225ey r0 = this.A04.A0H.A0U.A05;
        0qQ.A0A(r0);
        r0.A0M();
    }

    public final int CmV(int i) {
        GRF A002 = AnonymousClass5R6.A00(this.A04.A0H);
        AnonymousClass5R6 r2 = A002.A01;
        return ((AnonymousClass5RD) A002.A00.getValue()).CmW(r2.A0W.A04, r2.A0E(), i);
    }

    public final int CmY(int i) {
        GRF A002 = AnonymousClass5R6.A00(this.A04.A0H);
        AnonymousClass5R6 r2 = A002.A01;
        return ((AnonymousClass5RD) A002.A00.getValue()).CmZ(r2.A0W.A04, r2.A0E(), i);
    }

    public final int CoO(int i) {
        GRF A002 = AnonymousClass5R6.A00(this.A04.A0H);
        AnonymousClass5R6 r2 = A002.A01;
        return ((AnonymousClass5RD) A002.A00.getValue()).CoP(r2.A0W.A04, r2.A0E(), i);
    }

    public final int CoR(int i) {
        GRF A002 = AnonymousClass5R6.A00(this.A04.A0H);
        AnonymousClass5R6 r2 = A002.A01;
        return ((AnonymousClass5RD) A002.A00.getValue()).CoS(r2.A0W.A04, r2.A0E(), i);
    }

    public final C267974cY Cnz(long j) {
        A0F(j);
        AnonymousClass5R6 r5 = this.A04.A0H;
        C285045Pl A0A = r5.A0A();
        int i = A0A.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0A.A02;
            do {
                C290225ey r1 = ((AnonymousClass5R6) objArr[i2]).A0U.A05;
                0qQ.A0A(r1);
                r1.A05 = AnonymousClass05K.A0C;
                i2++;
            } while (i2 < i);
        }
        AnonymousClass6GP.A02(r5.A07.Cnx(this, r5.A0E(), j), this);
        return this;
    }
}

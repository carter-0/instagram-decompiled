package X;

import java.util.Map;

public final class JYE extends 2YL {
    public C262204Co A00;
    public final AnonymousClass3BK A01;
    public final Map A02 = DbY.A0q(C51971G9r.A0m(), 2000L, AnonymousClass7TE.A1L(5L, 200L), AnonymousClass7TE.A1L(10L, 200L));
    public final 0V2 A03;
    public final 05G A04;
    public final C61770pa A05;
    public final AnonymousClass0Ud A06;

    public JYE(AnonymousClass3BK r7) {
        0qQ.A0B(r7, 1);
        this.A01 = r7;
        02z A10 = DbS.A10(new JZA(C59940Jc4.A00(this.A01.A00()), false, false));
        this.A04 = A10;
        this.A06 = 10b.A03(A10);
        05D A012 = 10D.A01(AnonymousClass05K.A00, 0, 0);
        this.A03 = A012;
        this.A05 = JTP.A10(A012);
    }

    public final void A00() {
        05G r3 = this.A04;
        String str = ((JZA) r3.getValue()).A00;
        boolean z = ((JZA) r3.getValue()).A01;
        r3.getValue();
        0qQ.A0B(str, 1);
        r3.Epw(new JZA(str, false, z));
    }

    public final void onCleared() {
        this.A00 = JTQ.A0n(this.A00);
    }
}

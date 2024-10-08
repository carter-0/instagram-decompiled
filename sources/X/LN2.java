package X;

public final class LN2 {
    public C71007OYd A00;
    public boolean A01;
    public final C258883zn A02;
    public final AnonymousClass94X A03;
    public final LDC A04;
    public final String A05;
    public final C262224Cq A06;

    public LN2(C258883zn r2, AnonymousClass94X r3, LDC ldc, String str, C262224Cq r6) {
        C51973G9u.A0r(3, r3, r2, r6);
        this.A05 = str;
        this.A04 = ldc;
        this.A03 = r3;
        this.A02 = r2;
        this.A06 = r6;
    }

    public static final void A00(LN2 ln2) {
        if (!ln2.A01) {
            ln2.A01 = true;
            C258883zn r5 = ln2.A02;
            LDC ldc = ln2.A04;
            String str = ln2.A05;
            String A002 = ldc.A00(str);
            0qQ.A0B(A002, 0);
            if (((C258873zm) r5).A00.hasKey(A002)) {
                String string = r5.getString(ldc.A00(str));
                C250873mC r1 = C250863mB.A03;
                C255463uA[] r0 = C71007OYd.A02;
                ln2.A00 = (C71007OYd) r1.A00(string, C73534PeQ.A00);
            }
        }
    }
}

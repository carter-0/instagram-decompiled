package X;

/* renamed from: X.2pP  reason: invalid class name */
public final class AnonymousClass2pP {
    public static final C61480nO A03 = new C230312pQ();
    public final C60640iu A00;
    public final 01r A01 = new 01r(50);
    public final C61480nO A02;

    public final C254213s7 A00(String str) {
        01r r1 = this.A01;
        C254213s7 r0 = (C254213s7) r1.get(str);
        if (r0 != null) {
            return r0;
        }
        C254213s7 r02 = new C254213s7();
        r1.put(str, r02);
        return r02;
    }

    public final void A01(C230332pS r6, C254213s7 r7, Object obj, Object obj2) {
        if (r7.A05 >= 250) {
            String str = r7.A07;
            if (str == null) {
                str = AnonymousClass1QI.A00.A02.A00;
            }
            this.A02.ATE(new C301185yh(r6, this, r6.AGb(r7, obj, obj2, str)));
        }
        r7.A02();
    }

    public AnonymousClass2pP(C60640iu r3, boolean z) {
        C61480nO r0;
        this.A00 = r3;
        if (z) {
            C61620nx A002 = C61610nw.A00();
            A002.A01 = "VpvdImpressionsHelper-worker";
            r0 = new AnonymousClass0vF(A002);
        } else {
            r0 = A03;
        }
        this.A02 = r0;
    }
}

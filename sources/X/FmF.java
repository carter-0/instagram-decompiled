package X;

public final class FmF implements C273414mX {
    public C331157Pu A00;
    public boolean A01;
    public C319156q8 A02;

    public final void Cyf() {
    }

    public final void A00(C319156q8 r3) {
        this.A02 = r3;
        C331157Pu r1 = this.A00;
        if (r1 != null) {
            r1.A0L((C332277Ui) null);
        } else {
            0qQ.A0F("bottomSheet");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void Cyc() {
        boolean z = this.A01;
        C319156q8 r0 = this.A02;
        if (z) {
            if (r0 != null) {
                C319156q8.A00(r0);
                r0.A03();
            }
        } else if (r0 != null) {
            C319156q8.A00(r0);
            r0.A02();
        }
        this.A01 = false;
        this.A02 = null;
    }
}

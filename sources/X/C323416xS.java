package X;

/* renamed from: X.6xS  reason: invalid class name and case insensitive filesystem */
public final class C323416xS extends 2Fk {
    public AnonymousClass1EO A00;
    public final 1vn A01;
    public final C62320sa A02;

    public C323416xS(1vn r2, C62320sa r3) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(r3, 2);
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void A03() {
        C56927IHw iHw = new C56927IHw(this);
        this.A00 = this.A01.A01(new C56921IHq(this), iHw, (1Ef) this.A02.invoke());
    }

    public final void A04() {
        AnonymousClass1EO r0 = this.A00;
        if (r0 != null) {
            r0.cancel();
        }
    }
}

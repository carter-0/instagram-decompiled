package X;

/* renamed from: X.LDa  reason: case insensitive filesystem */
public final class C63921LDa {
    public C250973mM A00;
    public final 05G A01;
    public final AnonymousClass0Ud A02;
    public final boolean A03;

    public final void A00() {
        if (this.A03) {
            JTR.A1W(this.A01);
            C250973mM r0 = this.A00;
            if (r0 != null) {
                r0.A0H.A1U = false;
            }
        }
    }

    public C63921LDa(boolean z) {
        this.A03 = z;
        02z A10 = C51970G9q.A10(false);
        this.A01 = A10;
        this.A02 = 10b.A03(!z ? C51970G9q.A10(true) : A10);
    }
}

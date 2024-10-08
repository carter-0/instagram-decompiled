package X;

/* renamed from: X.8DH  reason: invalid class name */
public final class AnonymousClass8DH implements C3503184e {
    public int A00 = -1;
    public AnonymousClass87G A01;
    public String A02;
    public boolean A03;
    public final /* synthetic */ AnonymousClass8DD A04;

    public final void AJL(C69344Njj njj) {
        AnonymousClass8DH r3;
        AnonymousClass8DD r7 = this.A04;
        C3502984c r0 = r7.A0J;
        if (r0 != null && (r3 = r7.A0P) != null) {
            AnonymousClass81C r6 = r0.A00;
            if (((C357648Za) r6.A00()).A00 == AnonymousClass05K.A01) {
                if (njj == C69344Njj.APPROVED) {
                    AnonymousClass87G r5 = r3.A01;
                    if (r5 != null) {
                        r7.DBj(r5, r3.A02, r3.A00, r3.A03);
                    }
                } else if (njj == C69344Njj.DENIED) {
                    ((C357648Za) r6.A00()).A00();
                    r7.A0Q.A0X.Epw(true);
                    r7.A0H(false);
                }
                C357648Za r02 = (C357648Za) r6.A00();
                r02.A02 = null;
                r02.A00 = null;
                r02.A01 = null;
                r3.A01 = null;
                r3.A00 = -1;
                r3.A03 = false;
                r3.A02 = null;
            }
        }
    }

    public AnonymousClass8DH(AnonymousClass8DD r2) {
        this.A04 = r2;
    }
}

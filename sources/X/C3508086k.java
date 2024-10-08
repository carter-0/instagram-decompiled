package X;

/* renamed from: X.86k  reason: invalid class name and case insensitive filesystem */
public final class C3508086k {
    public AnonymousClass80Y A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(C3508186l.A00);

    public final C3508286n A00() {
        AnonymousClass0eM r0;
        int ordinal;
        if (!2CC.A00(AnonymousClass05K.A01) || (ordinal = this.A00.ordinal()) == 0) {
            r0 = this.A01;
        } else if (ordinal == 1) {
            r0 = this.A02;
        } else {
            throw new RuntimeException();
        }
        return (C3508286n) r0.getValue();
    }

    public C3508086k(AnonymousClass80U r5, C62320sa r6) {
        this.A01 = AnonymousClass0eN.A01(new AnonymousClass9LC(r6, 5));
        AnonymousClass80Z r3 = ((AnonymousClass80T) r5).A00;
        this.A00 = r3.A00;
        if (2CC.A00(AnonymousClass05K.A01)) {
            int ordinal = this.A00.ordinal();
            if (ordinal == 0) {
                AnonymousClass86m r0 = (AnonymousClass86m) this.A01.getValue();
                r0.A0S.A00(r0.A0N, r0.A0O);
            } else if (ordinal == 1) {
                this.A02.getValue();
            } else {
                throw new RuntimeException();
            }
            r3.A01.add(new C3509086v(this));
        }
    }
}

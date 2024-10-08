package X;

/* renamed from: X.0iP  reason: invalid class name and case insensitive filesystem */
public final class C60520iP {
    public AnonymousClass0xN A00;
    public final 0lg A01;
    public final Object A02 = new Object();

    public C60520iP(0lg r2) {
        C59690ac r0 = new C59690ac();
        this.A01 = r2;
        this.A00 = r0;
    }

    public final void A00(AnonymousClass0if r6) {
        C59690ac r2;
        boolean z;
        AnonymousClass0xK A012 = AnonymousClass0iU.A01(r6, this.A01);
        synchronized (this.A02) {
            AnonymousClass0xN r22 = this.A00;
            if (r22 instanceof C59690ac) {
                r2 = (C59690ac) r22;
                this.A00 = new C59670aa(A012);
            } else if (r22 instanceof C59670aa) {
                r2 = null;
            } else {
                throw new C20561Wub();
            }
        }
        if (r2 != null) {
            synchronized (r2.A01) {
                z = false;
                if (r2.A00 != null) {
                    z = true;
                }
                r2.A00 = A012;
            }
            if (!z) {
                for (0xI EHF : r2.A03) {
                    A012.EHF(EHF);
                }
                for (0xI EFq : r2.A02) {
                    A012.EFq(EFq);
                }
            }
            r2.A03.clear();
            r2.A02.clear();
        }
    }

    public C60520iP(AnonymousClass0if r3, 0lg r4) {
        C59670aa r0 = new C59670aa(AnonymousClass0iU.A01(r3, r4));
        this.A01 = r4;
        this.A00 = r0;
    }
}

package X;

/* renamed from: X.3dM  reason: invalid class name and case insensitive filesystem */
public final class C245713dM extends AnonymousClass0T0 implements C245723dN {
    public final C245693dK A00;
    public final 1Xj A01;
    public final AnonymousClass3W1 A02;

    public C245713dM(C245693dK r2, 1Xj r3, AnonymousClass3W1 r4) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(r4, 2);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C245713dM) {
                C245713dM r5 = (C245713dM) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A00.hashCode();
    }
}

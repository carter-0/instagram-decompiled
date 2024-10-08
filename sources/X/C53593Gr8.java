package X;

/* renamed from: X.Gr8  reason: case insensitive filesystem */
public final class C53593Gr8 extends AnonymousClass0T0 implements JNF {
    public final C270634h3 A00;
    public final 1Xj A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53593Gr8) {
                C53593Gr8 gr8 = (C53593Gr8) obj;
                if (!0qQ.A0K(this.A00, gr8.A00) || !0qQ.A0K(this.A01, gr8.A01) || !0qQ.A0K(this.A02, gr8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A00)));
    }

    public C53593Gr8(C270634h3 r1, 1Xj r2, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = str;
    }
}

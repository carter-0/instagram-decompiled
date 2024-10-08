package X;

/* renamed from: X.Gr7  reason: case insensitive filesystem */
public final class C53592Gr7 extends AnonymousClass0T0 implements JNF {
    public final 1Xj A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53592Gr7) {
                C53592Gr7 gr7 = (C53592Gr7) obj;
                if (!0qQ.A0K(this.A00, gr7.A00) || !0qQ.A0K(this.A01, gr7.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public C53592Gr7(1Xj r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }
}

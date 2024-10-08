package X;

/* renamed from: X.KaM  reason: case insensitive filesystem */
public final class C62114KaM extends C62872Knm {
    public final C266444Yx A00;
    public final String A01;

    public C62114KaM(C266444Yx r2, String str) {
        0qQ.A0B(str, 2);
        this.A00 = r2;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62114KaM) {
                C62114KaM kaM = (C62114KaM) obj;
                if (!0qQ.A0K(this.A00, kaM.A00) || !0qQ.A0K(this.A01, kaM.A01)) {
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
}

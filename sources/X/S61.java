package X;

public final class S61 {
    public final String A00;
    public final String A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S61) {
                S61 s61 = (S61) obj;
                if (!0qQ.A0K(this.A01, s61.A01) || !0qQ.A0K(this.A00, s61.A00) || this.A02 != s61.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A08(this.A00, AnonymousClass7TE.A0O(this.A01)));
    }

    public S61(String str, String str2, boolean z) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Item(item=");
        A1A.append(this.A01);
        A1A.append(", hint=");
        A1A.append(this.A00);
        A1A.append(", useDefaultClickHint=");
        return G9t.A1C(A1A, this.A02);
    }
}

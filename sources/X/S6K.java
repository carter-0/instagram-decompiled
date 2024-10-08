package X;

public final class S6K {
    public final int A00;
    public final C13883Tj6 A01;
    public final String A02;
    public final C62320sa A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S6K) {
                S6K s6k = (S6K) obj;
                if (this.A00 != s6k.A00 || !0qQ.A0K(this.A03, s6k.A03) || !0qQ.A0K(this.A01, s6k.A01) || !0qQ.A0K(this.A02, s6k.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A03, this.A00 * 31)));
    }

    public S6K(C13883Tj6 tj6, String str, C62320sa r3, int i) {
        this.A00 = i;
        this.A03 = r3;
        this.A01 = tj6;
        this.A02 = str;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TitleBarAction(iconType=");
        A1A.append(this.A00);
        A1A.append(", clickListener=");
        A1A.append(this.A03);
        A1A.append(C66579MXk.A00(45));
        A1A.append(this.A01);
        A1A.append(", testKey=");
        return C51975G9x.A0i(this.A02, A1A);
    }
}

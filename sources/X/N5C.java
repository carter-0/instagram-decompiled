package X;

public final class N5C extends AnonymousClass0T0 implements C74524PwJ {
    public final C74523PwI A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N5C) {
                N5C n5c = (N5C) obj;
                if (!0qQ.A0K(this.A02, n5c.A02) || !0qQ.A0K(this.A00, n5c.A00) || !0qQ.A0K(this.A01, n5c.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, (AnonymousClass7TE.A0O(this.A02) + AnonymousClass7TG.A0C(this.A00)) * 31);
    }

    public N5C(C74523PwI pwI, String str, String str2) {
        AnonymousClass7TG.A1P(str, str2);
        this.A02 = str;
        this.A00 = pwI;
        this.A01 = str2;
    }
}

package X;

public final class KO4 extends C62782KmK {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KO4) {
                KO4 ko4 = (KO4) obj;
                if (this.A01 != ko4.A01 || !0qQ.A0K(this.A00, ko4.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C51965G9l.A05(this.A01) + AnonymousClass7TG.A0E(this.A00);
    }

    public KO4(boolean z, String str) {
        this.A01 = z;
        this.A00 = str;
    }

    public KO4() {
        this(false, (String) null);
    }
}

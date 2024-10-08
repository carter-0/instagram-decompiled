package X;

public final class EJV extends ExY {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJV) {
                EJV ejv = (EJV) obj;
                if (!0qQ.A0K(this.A00, ejv.A00) || !0qQ.A0K(this.A01, ejv.A01) || !0qQ.A0K(this.A03, ejv.A03) || !0qQ.A0K(this.A02, ejv.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public EJV(String str, String str2, String str3, String str4) {
        super(2FW.A0r, str);
        this.A00 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A02 = str4;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + C41845B3m.A00(this.A02);
    }
}

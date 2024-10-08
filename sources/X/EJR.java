package X;

public final class EJR extends ExY {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJR) {
                EJR ejr = (EJR) obj;
                if (!0qQ.A0K(this.A00, ejr.A00) || !0qQ.A0K(this.A01, ejr.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public EJR(String str, String str2) {
        super(2FW.A1h, str);
        this.A00 = str;
        this.A01 = str2;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A00) * 31) + C41845B3m.A00(this.A01);
    }
}

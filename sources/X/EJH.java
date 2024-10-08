package X;

public final class EJH extends ExY {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJH) {
                EJH ejh = (EJH) obj;
                if (!0qQ.A0K(this.A00, ejh.A00) || !0qQ.A0K(this.A01, ejh.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public EJH(String str, String str2) {
        super(2FW.A1K, str);
        this.A00 = str;
        this.A01 = str2;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TG.A0E(this.A00) * 31);
    }
}

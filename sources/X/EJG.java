package X;

public final class EJG extends ExY {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJG) {
                EJG ejg = (EJG) obj;
                if (!0qQ.A0K(this.A00, ejg.A00) || !0qQ.A0K(this.A01, ejg.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public EJG(String str, String str2) {
        super(2FW.A1u, str);
        this.A00 = str;
        this.A01 = str2;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TG.A0E(this.A00) * 31);
    }
}

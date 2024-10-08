package X;

public final class EJF extends ExY {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJF) {
                EJF ejf = (EJF) obj;
                if (!0qQ.A0K(this.A00, ejf.A00) || !0qQ.A0K(this.A01, ejf.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public EJF(String str, String str2) {
        super(2FW.A17, str);
        this.A00 = str;
        this.A01 = str2;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A00) * 31) + C41845B3m.A00(this.A01);
    }
}

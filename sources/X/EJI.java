package X;

public final class EJI extends ExY {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJI) {
                EJI eji = (EJI) obj;
                if (!0qQ.A0K(this.A01, eji.A01) || !0qQ.A0K(this.A00, eji.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public EJI(String str, String str2) {
        super(2FW.A1N, str);
        this.A01 = str;
        this.A00 = str2;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + C41845B3m.A00(this.A00);
    }
}

package X;

public final class EJX extends ExY {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJX) {
                EJX ejx = (EJX) obj;
                if (!0qQ.A0K(this.A03, ejx.A03) || !0qQ.A0K(this.A00, ejx.A00) || !0qQ.A0K(this.A02, ejx.A02) || !0qQ.A0K(this.A01, ejx.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public EJX(String str, String str2, String str3, String str4) {
        super(2FW.A1S, str);
        this.A03 = str;
        this.A00 = str2;
        this.A02 = str3;
        this.A01 = str4;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A03) * 31) + AnonymousClass7TG.A0E(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A01);
    }
}

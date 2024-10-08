package X;

public final class EJ5 extends ExY {
    public final C317966o8 A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJ5) {
                EJ5 ej5 = (EJ5) obj;
                if (!0qQ.A0K(this.A01, ej5.A01) || !0qQ.A0K(this.A00, ej5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public EJ5(C317966o8 r2, String str) {
        super(2FW.A0O, str);
        this.A01 = str;
        this.A00 = r2;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TG.A0E(this.A01) * 31);
    }
}

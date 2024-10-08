package X;

public final class EJ7 extends ExY {
    public final 1Xj A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJ7) {
                EJ7 ej7 = (EJ7) obj;
                if (!0qQ.A0K(this.A01, ej7.A01) || !0qQ.A0K(this.A00, ej7.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public EJ7(1Xj r2, String str) {
        super(2FW.A0W, str);
        this.A01 = str;
        this.A00 = r2;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}

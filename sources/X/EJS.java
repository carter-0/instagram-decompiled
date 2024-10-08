package X;

public final class EJS extends ExY {
    public final 1Xj A00;
    public final 1Xj A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJS) {
                EJS ejs = (EJS) obj;
                if (!0qQ.A0K(this.A02, ejs.A02) || !0qQ.A0K(this.A01, ejs.A01) || !0qQ.A0K(this.A00, ejs.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public EJS(1Xj r2, 1Xj r3, String str) {
        super(2FW.A1D, str);
        this.A02 = str;
        this.A01 = r2;
        this.A00 = r3;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}

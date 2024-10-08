package X;

public final class HBE extends C54696HPb {
    public final AnonymousClass1eD A00;
    public final C246193eB A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HBE) {
                HBE hbe = (HBE) obj;
                if (!0qQ.A0K(this.A01, hbe.A01) || !0qQ.A0K(this.A00, hbe.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public HBE(AnonymousClass1eD r1, C246193eB r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}

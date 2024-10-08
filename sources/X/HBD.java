package X;

public final class HBD extends C54696HPb {
    public final AnonymousClass1eD A00;
    public final C246193eB A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HBD) {
                HBD hbd = (HBD) obj;
                if (!0qQ.A0K(this.A01, hbd.A01) || !0qQ.A0K(this.A00, hbd.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00)) * 31) + C54732HQn.A00();
    }

    public HBD(AnonymousClass1eD r1, C246193eB r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}

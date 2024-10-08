package X;

public final class LP3 {
    public static final LP3 A03;
    public final C63569KzI A00;
    public final C63569KzI A01;
    public final C63569KzI A02;

    public final LP3 A00(C63569KzI kzI, C62448Kfy kfy) {
        0qQ.A0B(kfy, 0);
        0qQ.A0B(kzI, 1);
        int ordinal = kfy.ordinal();
        if (ordinal == 2) {
            return new LP3(this.A02, this.A01, kzI);
        }
        if (ordinal == 1) {
            return new LP3(this.A02, kzI, this.A00);
        }
        if (ordinal == 0) {
            return new LP3(kzI, this.A01, this.A00);
        }
        throw AnonymousClass7TE.A1K();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LP3) {
                LP3 lp3 = (LP3) obj;
                if (!0qQ.A0K(this.A02, lp3.A02) || !0qQ.A0K(this.A01, lp3.A01) || !0qQ.A0K(this.A00, lp3.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    static {
        C60332Jjb jjb = C60332Jjb.A01;
        A03 = new LP3(jjb, jjb, jjb);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A02)));
    }

    public LP3(C63569KzI kzI, C63569KzI kzI2, C63569KzI kzI3) {
        this.A02 = kzI;
        this.A01 = kzI2;
        this.A00 = kzI3;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LoadStates(refresh=");
        A1A.append(this.A02);
        A1A.append(", prepend=");
        A1A.append(this.A01);
        A1A.append(", append=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}

package X;

public final class LGK {
    public C63569KzI A00;
    public C63569KzI A01;
    public C63569KzI A02;

    public final C63569KzI A00(C62448Kfy kfy) {
        int A022 = DbU.A02(kfy, 0);
        if (A022 == 0) {
            return this.A02;
        }
        if (A022 == 2) {
            return this.A00;
        }
        if (A022 == 1) {
            return this.A01;
        }
        throw AnonymousClass7TE.A1K();
    }

    public final void A02(C63569KzI kzI, C62448Kfy kfy) {
        0qQ.A0B(kfy, 0);
        int ordinal = kfy.ordinal();
        if (ordinal == 0) {
            this.A02 = kzI;
        } else if (ordinal == 2) {
            this.A00 = kzI;
        } else if (ordinal == 1) {
            this.A01 = kzI;
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }

    public final void A03(LP3 lp3) {
        0qQ.A0B(lp3, 0);
        this.A02 = lp3.A02;
        this.A00 = lp3.A00;
        this.A01 = lp3.A01;
    }

    public final LP3 A01() {
        return new LP3(this.A02, this.A01, this.A00);
    }

    public LGK() {
        C60332Jjb jjb = C60332Jjb.A01;
        this.A02 = jjb;
        this.A01 = jjb;
        this.A00 = jjb;
    }
}

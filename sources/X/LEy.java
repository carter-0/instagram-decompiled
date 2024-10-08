package X;

public abstract class LEy {
    public C63569KzI A00;
    public C63569KzI A01;
    public C63569KzI A02;

    public void A00(C63569KzI kzI, C62448Kfy kfy) {
        C66125MCx mCx = (C66125MCx) ((C60337Jji) this).A00.A01;
        1Eo.A05(mCx.A06, new C59819JZr(kfy, kzI, mCx, (AnonymousClass4D7) null, 4), mCx.A07);
    }

    public final void A01(C63569KzI kzI, C62448Kfy kfy) {
        0qQ.A0B(kfy, 0);
        int ordinal = kfy.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (!0qQ.A0K(this.A00, kzI)) {
                        this.A00 = kzI;
                    } else {
                        return;
                    }
                }
            } else if (!0qQ.A0K(this.A02, kzI)) {
                this.A02 = kzI;
            } else {
                return;
            }
        } else if (!0qQ.A0K(this.A01, kzI)) {
            this.A01 = kzI;
        } else {
            return;
        }
        A00(kzI, kfy);
    }

    public LEy() {
        C60332Jjb jjb = C60332Jjb.A01;
        this.A01 = jjb;
        this.A02 = jjb;
        this.A00 = jjb;
    }
}

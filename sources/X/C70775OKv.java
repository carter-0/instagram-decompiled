package X;

import java.util.Map;

/* renamed from: X.OKv  reason: case insensitive filesystem */
public final class C70775OKv {
    public final OFX A00;
    public final OWA A01;
    public final Map A02 = AnonymousClass7TE.A1H();

    public /* synthetic */ C70775OKv(OWA owa) {
        OFX ofx = new OFX(owa);
        this.A01 = owa;
        this.A00 = ofx;
    }

    public final void A00(int i) {
        OFX ofx = this.A00;
        int i2 = (i / 5) * 5;
        if (i2 != ofx.A00) {
            0ng r1 = ofx.A01;
            if (r1 != null) {
                ofx.A02.A02(r1);
            }
            ofx.A01 = null;
            NS9 ns9 = new NS9(ofx, i2);
            ofx.A01 = ns9;
            ofx.A02.A01(ns9, 3000);
            ofx.A00 = i2;
        }
    }
}

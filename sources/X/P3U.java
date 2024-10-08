package X;

import java.util.HashSet;

public final class P3U implements C74398PuE {
    public final /* synthetic */ C71153OeR A00;

    public P3U(C71153OeR oeR) {
        this.A00 = oeR;
    }

    public final boolean CbV(C254743sy r2) {
        return this.A00.A0v.contains(r2);
    }

    public final void Drt(C66754Mbz mbz) {
        C71153OeR oeR = this.A00;
        C254743sy r2 = mbz.A04;
        HashSet hashSet = oeR.A0v;
        if (!hashSet.add(r2)) {
            hashSet.remove(r2);
        }
        OMH omh = oeR.A0r;
        omh.A01();
        NJW.A04(omh.A00);
    }
}

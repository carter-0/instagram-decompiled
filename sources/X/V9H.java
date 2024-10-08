package X;

import android.app.Activity;
import android.content.Intent;

public abstract class V9H {
    public static final void A00(C307896Rx r6, AnonymousClass6Tm r7) {
        Activity A01;
        C277014uI A0P = DbW.A0P(r7, 0);
        C307786Rm r0 = r6.A03;
        if (r0 == null || (A01 = VK6.A00.A01(r0.A00)) == null) {
            C299275ur.A00(r6, AnonymousClass6Tm.A01, A0P);
            return;
        }
        WKA wka = new WKA(r6, A0P);
        0kR.A0D(A01, new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        14i.A04(15Y.A02, new C19249WRi(wka, 2), false, false);
    }
}

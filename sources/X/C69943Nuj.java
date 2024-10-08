package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.request.DirectThreadApi;

/* renamed from: X.Nuj  reason: case insensitive filesystem */
public abstract class C69943Nuj {
    public static final void A00(UserSession userSession, C74402PuI puI, String str) {
        UserSession userSession2 = userSession;
        C74402PuI puI2 = puI;
        String str2 = str;
        AnonymousClass7TG.A1T(userSession2, str, puI);
        0Tu r2 = 0Tu.A05;
        boolean A06 = 182.A06(r2, userSession2, 36315314287283336L);
        if (A06) {
            C53394GnR gnR = (C53394GnR) ((C72183Oxs) userSession2.A01(C72183Oxs.class, C73754PjF.A00)).A00.get(str2);
            if (gnR != null && System.currentTimeMillis() - gnR.A00 < 182.A01(r2, userSession2, 36596789264059003L)) {
                puI.DU4((OLT) gnR.A01);
                return;
            }
        }
        1OC A08 = DirectThreadApi.A08(userSession2, str2, (String) null, 10);
        A08.A00 = new NM4(userSession2, puI2, str2, 0, A06);
        1ES.A03(A08);
    }
}

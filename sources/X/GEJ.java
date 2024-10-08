package X;

import com.instagram.common.session.UserSession;
import com.instagram.sponsored.signals.model.AdsRatingInfoIntf;

public final class GEJ {
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r0 = (r0 = r5.A0C.BUC()).B7C();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(com.instagram.common.session.UserSession r4, X.1Xj r5) {
        /*
            r3 = 1
            if (r5 == 0) goto L_0x002b
            boolean r0 = r5.CcK()
            if (r0 != r3) goto L_0x002b
            X.1Xy r0 = r5.A0C
            X.41Z r0 = r0.BUC()
            if (r0 == 0) goto L_0x002b
            X.4hQ r0 = r0.B7C()
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = r0.AyB()
            if (r0 == 0) goto L_0x002b
            X.0Tu r2 = X.0Tu.A06
            r0 = 36326171964618308(0x810e7600003644, double:3.0361556519538156E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x002b
            return r3
        L_0x002b:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GEJ.A01(com.instagram.common.session.UserSession, X.1Xj):boolean");
    }

    public static final boolean A00(C267324bN r2, UserSession userSession) {
        1Xj r0;
        AnonymousClass41Z BUC;
        C270854hQ B7C;
        AdsRatingInfoIntf Aa4;
        if (!r2.CcK() || (r0 = r2.A02) == null || (BUC = r0.A0C.BUC()) == null || (B7C = BUC.B7C()) == null || (Aa4 = B7C.Aa4()) == null || Aa4.AyC() == null || !182.A06(0Tu.A06, userSession, 36326171964683845L)) {
            return false;
        }
        return true;
    }
}

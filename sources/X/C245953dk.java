package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3dk  reason: invalid class name and case insensitive filesystem */
public abstract class C245953dk {
    public static final boolean A00(UserSession userSession, C245893de r5) {
        String str;
        Boolean BAt;
        0qQ.A0B(userSession, 1);
        1Xj r1 = r5.A00;
        if (r1.A4U()) {
            User CCd = r1.A0C.CCd();
            if (CCd != null) {
                str = CCd.getId();
            } else {
                str = "";
            }
            if (!0qQ.A0K(str, userSession.A06) || (BAt = 0eE.A00(userSession).A00().A03.BAt()) == null || !BAt.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r0 = X.0eE.A00(r6).A00().A03.BAt();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(com.instagram.common.session.UserSession r6, X.C245893de r7, boolean r8) {
        /*
            r5 = 0
            r4 = 1
            X.1Xj r3 = r7.A00
            boolean r0 = r3.A4U()
            if (r0 != 0) goto L_0x0018
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323161194048446(0x810bb900172bbe, double:3.034251628522035E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 != 0) goto L_0x0018
            return r5
        L_0x0018:
            java.util.List r0 = r3.A3b()
            if (r0 == 0) goto L_0x0024
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0027
        L_0x0024:
            if (r8 != 0) goto L_0x0027
            return r5
        L_0x0027:
            X.1Xy r0 = r3.A0C
            com.instagram.user.model.User r0 = r0.CCd()
            if (r0 == 0) goto L_0x0052
            java.lang.String r1 = r0.getId()
        L_0x0033:
            java.lang.String r0 = r6.A06
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0055
            X.0t1 r0 = X.0eE.A00(r6)
            com.instagram.user.model.User r0 = r0.A00()
            X.4Cl r0 = r0.A03
            java.lang.Boolean r0 = r0.BAt()
            if (r0 == 0) goto L_0x0055
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0055
            return r5
        L_0x0052:
            java.lang.String r1 = ""
            goto L_0x0033
        L_0x0055:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C245953dk.A01(com.instagram.common.session.UserSession, X.3de, boolean):boolean");
    }
}

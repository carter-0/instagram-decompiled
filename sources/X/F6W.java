package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public abstract class F6W {
    public static final User A00(0lg r5, C283155Gi r6) {
        UserSession userSession;
        0qQ.A0B(r5, 0);
        if (!(r5 instanceof UserSession) || (userSession = (UserSession) r5) == null) {
            return null;
        }
        17i A00 = 17h.A00(userSession);
        String str = r6.A04.A0f;
        if (str == null) {
            return null;
        }
        User A02 = A00.A02(str);
        if (A02 != null) {
            A01(r6, A02, A00);
            return A02;
        }
        C283165Gj r2 = r6.A04;
        String str2 = r2.A0h;
        if (str2 == null || r2.A0E == null) {
            return null;
        }
        User user = new User(r2.A0f, str2);
        A01(r6, user, A00);
        return user;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r1 == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C283155Gi r3, com.instagram.user.model.User r4, X.17i r5) {
        /*
            X.5Gj r0 = r3.A04
            com.instagram.common.typedurl.ImageUrl r0 = r0.A0E
            r4.A0l(r0)
            X.5Gj r0 = r3.A04
            X.JwG r0 = r0.A0A
            if (r0 == 0) goto L_0x0018
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r0.A00
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            r2 = 1
            if (r0 == 0) goto L_0x001f
            r4.A1E(r2)
        L_0x001f:
            java.lang.String r1 = "remove_follower"
            X.5Gj r0 = r3.A04
            java.util.List r0 = r0.A0t
            if (r0 == 0) goto L_0x0030
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0030
            r4.A13(r2)
        L_0x0030:
            r0 = 0
            r5.A01(r4, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F6W.A01(X.5Gi, com.instagram.user.model.User, X.17i):void");
    }
}

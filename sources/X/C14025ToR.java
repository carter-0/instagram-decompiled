package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.ToR  reason: case insensitive filesystem */
public abstract class C14025ToR {
    public static final C14017ToJ A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (C14017ToJ) userSession.A01(C14017ToJ.class, new C20608Wvp(userSession, 33));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (X.AnonymousClass7TF.A1Y(r5.A03.CeL(), r6.isVerified()) != false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(com.instagram.user.model.User r5, com.instagram.user.model.User r6) {
        /*
            X.4Cl r0 = r6.A03
            java.lang.Boolean r0 = r0.CeL()
            r4 = 1
            if (r0 == 0) goto L_0x001a
            X.4Cl r0 = r5.A03
            java.lang.Boolean r1 = r0.CeL()
            boolean r0 = r6.isVerified()
            boolean r0 = X.AnonymousClass7TF.A1Y(r1, r0)
            r3 = 1
            if (r0 == 0) goto L_0x001b
        L_0x001a:
            r3 = 0
        L_0x001b:
            r5.getUsername()
            java.lang.String r2 = "RecentUserSearchCache"
            java.lang.String r0 = r5.getFullName()
            if (r0 != 0) goto L_0x0033
            java.lang.String r1 = "Caught user with null full name! User: "
            java.lang.String r0 = r5.getId()
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.0wb.A03(r2, r0)
        L_0x0033:
            if (r3 != 0) goto L_0x005b
            r5.getUsername()
            java.lang.String r1 = r5.getUsername()
            java.lang.String r0 = r6.getUsername()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = r5.getFullName()
            if (r0 == 0) goto L_0x005b
            java.lang.String r1 = r5.getFullName()
            java.lang.String r0 = r6.getFullName()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x005b
            r4 = 0
        L_0x005b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14025ToR.A01(com.instagram.user.model.User, com.instagram.user.model.User):boolean");
    }
}

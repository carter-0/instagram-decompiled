package com.instagram.arp.api;

import com.instagram.common.session.UserSession;

public final class AvatarTaskHelper {
    public final UserSession A00;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.arp.api.AvatarTaskHelper r5, java.lang.String r6, X.AnonymousClass4D7 r7, X.0sP r8) {
        /*
            r3 = 49
            boolean r0 = X.C66144MDw.A02(r3, r7)
            if (r0 == 0) goto L_0x0057
            r4 = r7
            X.MDw r4 = (X.C66144MDw) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0057
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A02
            X.1Hj r2 = X.1Hj.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x0049
            if (r1 != r0) goto L_0x0062
            java.lang.Object r6 = r4.A01
            java.lang.String r6 = (java.lang.String) r6
            X.0eS.A00(r3)
        L_0x0028:
            r2 = r3
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0048
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x005d
            X.5sO r2 = (X.C297815sO) r2
            java.lang.Object r2 = r2.A00
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Failed with error: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r2, r0, r1)
            X.0wb.A03(r6, r0)
            X.5sO r2 = X.DbU.A0f()
        L_0x0048:
            return r2
        L_0x0049:
            X.0eS.A00(r3)
            r4.A01 = r6
            r4.A00 = r0
            java.lang.Object r3 = r8.invoke(r4)
            if (r3 != r2) goto L_0x0028
            return r2
        L_0x0057:
            X.MDw r4 = new X.MDw
            r4.<init>(r5, r7, r3)
            goto L_0x0016
        L_0x005d:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0062:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.arp.api.AvatarTaskHelper.A00(com.instagram.arp.api.AvatarTaskHelper, java.lang.String, X.4D7, X.0sP):java.lang.Object");
    }

    public AvatarTaskHelper(UserSession userSession) {
        this.A00 = userSession;
    }
}

package com.instagram.request;

import com.instagram.common.session.UserSession;

public final class InviteContactApi {
    public final UserSession A00;

    /* JADX WARNING: type inference failed for: r6v1, types: [X.4D7, X.MEA] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r9, boolean r10) {
        /*
            r8 = this;
            r3 = 21
            boolean r0 = X.MEA.A03(r3, r9)
            if (r0 == 0) goto L_0x0065
            r6 = r9
            X.MEA r6 = (X.MEA) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0065
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A01
            X.1Hj r7 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x003d
            if (r0 != r5) goto L_0x0077
            X.0eS.A00(r1)
        L_0x0025:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x006d
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.CDw r0 = (X.C43804CDw) r0
            X.G8c r4 = r0.A00
            if (r4 != 0) goto L_0x0076
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003d:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r0 = r8.A00
            X.1NY r3 = X.AnonymousClass7TG.A0b(r0)
            java.lang.String r0 = "address_book/get_user_cps_for_invite/"
            r3.A0A(r0)
            java.lang.String r0 = "is_first_fetch"
            r3.A0H(r0, r10)
            java.lang.Class<X.CDw> r2 = X.C43804CDw.class
            java.lang.Class<X.Cyw> r1 = X.C45584Cyw.class
            r0 = 0
            X.1OC r1 = X.DbT.A0R(r4, r3, r2, r1, r0)
            r6.A00 = r5
            r0 = 1271648771(0x4bcbd203, float:2.6715142E7)
            java.lang.Object r1 = r1.A00(r0, r6)
            if (r1 != r7) goto L_0x0025
            return r7
        L_0x0065:
            r0 = 42
            X.MEA r6 = new X.MEA
            r6.<init>(r8, r9, r3, r0)
            goto L_0x0016
        L_0x006d:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0076
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0076:
            return r4
        L_0x0077:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.request.InviteContactApi.A00(X.4D7, boolean):java.lang.Object");
    }

    public InviteContactApi(UserSession userSession) {
        this.A00 = userSession;
    }
}

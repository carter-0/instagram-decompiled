package com.instagram.igtv.repository.user;

import com.instagram.common.session.UserSession;

public final class UserRepository {
    public final UserSession A00;
    public final UserNetworkDataSource A01;

    /* JADX WARNING: type inference failed for: r9v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r11, java.lang.String r12, X.AnonymousClass4D7 r13, boolean r14) {
        /*
            r10 = this;
            r3 = 32
            boolean r0 = X.C66137MDp.A02(r3, r13)
            if (r0 == 0) goto L_0x0078
            r9 = r13
            X.MDp r9 = (X.C66137MDp) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0078
            int r2 = r2 - r1
            r9.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r9.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r9.A00
            r2 = 1
            if (r0 == 0) goto L_0x0040
            if (r0 != r2) goto L_0x008e
            java.lang.Object r1 = r9.A01
            com.instagram.igtv.repository.user.UserRepository r1 = (com.instagram.igtv.repository.user.UserRepository) r1
            X.0eS.A00(r4)
        L_0x0028:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x007d
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r3 = r4.A00
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            com.instagram.common.session.UserSession r0 = r1.A00
            X.17i r1 = X.17h.A00(r0)
            r0 = 0
            com.instagram.user.model.User r1 = r1.A01(r3, r2, r0)
        L_0x003f:
            return r1
        L_0x0040:
            X.0eS.A00(r4)
            com.instagram.common.session.UserSession r0 = r10.A00
            X.17i r0 = X.17h.A00(r0)
            r8 = r11
            com.instagram.user.model.User r1 = r0.A02(r11)
            if (r1 == 0) goto L_0x0060
            if (r14 == 0) goto L_0x003f
            X.4Cl r0 = r1.A03
            java.lang.Boolean r0 = r0.BBM()
            if (r0 == 0) goto L_0x0060
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x003f
        L_0x0060:
            com.instagram.igtv.repository.user.UserNetworkDataSource r4 = r10.A01
            r9.A01 = r10
            r9.A00 = r2
            r0 = 423(0x1a7, float:5.93E-43)
            java.lang.String r6 = X.C273654mx.A00(r0)
            java.lang.String r7 = "user_id"
            r5 = r12
            java.lang.Object r4 = com.instagram.igtv.repository.user.UserNetworkDataSource.A00(r4, r5, r6, r7, r8, r9)
            if (r4 != r3) goto L_0x0076
            return r3
        L_0x0076:
            r1 = r10
            goto L_0x0028
        L_0x0078:
            X.MDp r9 = X.C66137MDp.A00(r10, r13, r3)
            goto L_0x0016
        L_0x007d:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0089
            java.lang.String r0 = "UserRepository network request failed"
            X.3g0 r1 = new X.3g0
            r1.<init>(r0)
            throw r1
        L_0x0089:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x008e:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.repository.user.UserRepository.A00(java.lang.String, java.lang.String, X.4D7, boolean):java.lang.Object");
    }

    public UserRepository(UserSession userSession, UserNetworkDataSource userNetworkDataSource) {
        this.A00 = userSession;
        this.A01 = userNetworkDataSource;
    }
}

package com.instagram.video.live.mvvm.model.datasource.api;

import com.instagram.common.session.UserSession;

public final class IgLiveBroadcastInfoApi {
    public final UserSession A00;

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDu, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            r5 = 0
            r3 = 11
            boolean r0 = X.C66142MDu.A02(r3, r8)
            if (r0 == 0) goto L_0x004b
            r4 = r8
            X.MDu r4 = (X.C66142MDu) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004b
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0017:
            java.lang.Object r0 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r1 = r4.A00
            r2 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r2) goto L_0x0059
            X.0eS.A00(r0)
        L_0x0025:
            r3 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0035
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0053
            X.0gF r0 = X.C60340gF.A00
            X.5sO r3 = new X.5sO
            r3.<init>(r0)
        L_0x0035:
            return r3
        L_0x0036:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1OC r1 = X.LTC.A06(r0, r7, r5)
            r4.A00 = r2
            r0 = 1226062008(0x491438b8, float:607115.5)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 != r3) goto L_0x0025
            return r3
        L_0x004b:
            r0 = 42
            X.MDu r4 = new X.MDu
            r4.<init>(r6, r8, r3, r0)
            goto L_0x0017
        L_0x0053:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0059:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveBroadcastInfoApi.A00(java.lang.String, X.4D7):java.lang.Object");
    }

    public IgLiveBroadcastInfoApi(UserSession userSession) {
        this.A00 = userSession;
    }
}

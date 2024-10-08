package com.instagram.video.live.mvvm.model.datasource.api;

import X.0qQ;
import com.instagram.common.session.UserSession;

public final class IgLiveJoinRequestsApi {
    public final UserSession A00;

    public IgLiveJoinRequestsApi(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDu, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            r3 = 27
            boolean r0 = X.C66142MDu.A02(r3, r8)
            if (r0 == 0) goto L_0x0058
            r5 = r8
            X.MDu r5 = (X.C66142MDu) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0058
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r3) goto L_0x0062
            X.0eS.A00(r0)
        L_0x0024:
            r4 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0031
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x005d
            X.5sO r4 = X.DbU.A0f()
        L_0x0031:
            return r4
        L_0x0032:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r1 = r6.A00
            r0 = 0
            X.0qQ.A0B(r7, r0)
            X.1NY r2 = X.AnonymousClass7TG.A0a(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "live/%s/cancel_request_to_join/"
            r2.A0K(r0, r1)
            X.1OC r1 = X.JTU.A0G(r2)
            r5.A00 = r3
            r0 = 1111374943(0x423e3c5f, float:47.558956)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L_0x0024
            return r4
        L_0x0058:
            X.MDu r5 = X.C66142MDu.A00(r6, r8, r3)
            goto L_0x0016
        L_0x005d:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0062:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveJoinRequestsApi.A00(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.MDu, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r10, X.AnonymousClass4D7 r11, int r12, long r13) {
        /*
            r9 = this;
            r7 = 0
            r4 = 28
            boolean r0 = X.C66142MDu.A02(r4, r11)
            if (r0 == 0) goto L_0x0079
            r2 = r11
            X.MDu r2 = (X.C66142MDu) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0079
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0018:
            java.lang.Object r0 = r2.A01
            X.1Hj r3 = X.1Hj.A02
            int r1 = r2.A00
            r4 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 != r4) goto L_0x0083
            X.0eS.A00(r0)
        L_0x0026:
            r3 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0033
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x007e
            X.5sO r3 = X.DbU.A0f()
        L_0x0033:
            return r3
        L_0x0034:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r0 = r9.A00
            X.0qQ.A0B(r10, r4)
            r6 = 0
            X.1NY r5 = X.AnonymousClass7TG.A0b(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r10}
            java.lang.String r0 = "live/%s/get_join_request_counts/"
            r5.A0K(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r13)
            java.lang.String r0 = "last_fetch_ts"
            r5.A9m(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r12)
            java.lang.String r0 = "last_total_count"
            r5.A9m(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "last_seen_ts"
            r5.A9m(r0, r1)
            java.lang.Class<X.K1Z> r1 = X.K1Z.class
            java.lang.Class<X.LK7> r0 = X.LK7.class
            X.1OC r1 = X.DbT.A0R(r6, r5, r1, r0, r4)
            r2.A00 = r4
            r0 = 999437006(0x3b9232ce, float:0.004461623)
            java.lang.Object r0 = r1.A00(r0, r2)
            if (r0 != r3) goto L_0x0026
            return r3
        L_0x0079:
            X.MDu r2 = X.C66142MDu.A00(r9, r11, r4)
            goto L_0x0018
        L_0x007e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0083:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveJoinRequestsApi.A01(java.lang.String, X.4D7, int, long):java.lang.Object");
    }
}

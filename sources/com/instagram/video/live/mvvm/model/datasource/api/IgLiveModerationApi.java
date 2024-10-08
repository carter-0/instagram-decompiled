package com.instagram.video.live.mvvm.model.datasource.api;

import X.0qQ;
import com.instagram.common.session.UserSession;

public final class IgLiveModerationApi {
    public final UserSession A00;

    public IgLiveModerationApi(UserSession userSession) {
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
    public final java.lang.Object A00(java.lang.String r7, java.lang.String r8, X.AnonymousClass4D7 r9) {
        /*
            r6 = this;
            r3 = 30
            boolean r0 = X.C66142MDu.A02(r3, r9)
            if (r0 == 0) goto L_0x005d
            r5 = r9
            X.MDu r5 = (X.C66142MDu) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005d
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r3) goto L_0x0067
            X.0eS.A00(r0)
        L_0x0024:
            r4 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0031
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0062
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
            java.lang.String r0 = "live/%s/moderator/assign/"
            r2.A0K(r0, r1)
            java.lang.String r0 = "user_id"
            r2.A9m(r0, r8)
            X.1OC r1 = X.JTU.A0G(r2)
            r5.A00 = r3
            r0 = 378525676(0x168fd7ec, float:2.3239162E-25)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L_0x0024
            return r4
        L_0x005d:
            X.MDu r5 = X.C66142MDu.A00(r6, r9, r3)
            goto L_0x0016
        L_0x0062:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0067:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveModerationApi.A00(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDu, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r7, java.lang.String r8, X.AnonymousClass4D7 r9) {
        /*
            r6 = this;
            r3 = 31
            boolean r0 = X.C66142MDu.A02(r3, r9)
            if (r0 == 0) goto L_0x0059
            r5 = r9
            X.MDu r5 = (X.C66142MDu) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0059
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r3) goto L_0x0063
            X.0eS.A00(r0)
        L_0x0024:
            r4 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0031
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x005e
            X.5sO r4 = X.DbU.A0f()
        L_0x0031:
            return r4
        L_0x0032:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.AnonymousClass7TF.A1B(r7, r3, r8)
            X.1NY r2 = X.AnonymousClass7TG.A0a(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "live/%s/mute_user/"
            r2.A0K(r0, r1)
            java.lang.String r0 = "user_id"
            X.1OC r1 = X.JTU.A0H(r2, r0, r8, r3)
            r5.A00 = r3
            r0 = 1385651477(0x52975d15, float:3.2505086E11)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L_0x0024
            return r4
        L_0x0059:
            X.MDu r5 = X.C66142MDu.A00(r6, r9, r3)
            goto L_0x0016
        L_0x005e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0063:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveModerationApi.A01(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDu, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r7, java.lang.String r8, X.AnonymousClass4D7 r9) {
        /*
            r6 = this;
            r3 = 32
            boolean r0 = X.C66142MDu.A02(r3, r9)
            if (r0 == 0) goto L_0x005d
            r5 = r9
            X.MDu r5 = (X.C66142MDu) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005d
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r3) goto L_0x0067
            X.0eS.A00(r0)
        L_0x0024:
            r4 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0031
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0062
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
            java.lang.String r0 = "live/%s/moderator/revoke/"
            r2.A0K(r0, r1)
            java.lang.String r0 = "user_id"
            r2.A9m(r0, r8)
            X.1OC r1 = X.JTU.A0G(r2)
            r5.A00 = r3
            r0 = 156685964(0x956d68c, float:2.5860192E-33)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L_0x0024
            return r4
        L_0x005d:
            X.MDu r5 = X.C66142MDu.A00(r6, r9, r3)
            goto L_0x0016
        L_0x0062:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0067:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveModerationApi.A02(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDu, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(java.lang.String r7, java.lang.String r8, X.AnonymousClass4D7 r9) {
        /*
            r6 = this;
            r3 = 33
            boolean r0 = X.C66142MDu.A02(r3, r9)
            if (r0 == 0) goto L_0x005c
            r5 = r9
            X.MDu r5 = (X.C66142MDu) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005c
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r3) goto L_0x0066
            X.0eS.A00(r0)
        L_0x0024:
            r4 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0031
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0061
            X.5sO r4 = X.DbU.A0f()
        L_0x0031:
            return r4
        L_0x0032:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.AnonymousClass7TF.A1B(r7, r3, r8)
            X.1NY r2 = X.AnonymousClass7TG.A0a(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "live/%s/remove_user/"
            r2.A0K(r0, r1)
            java.lang.String r0 = "user_id"
            r2.A9m(r0, r8)
            X.1OC r1 = X.JTU.A0G(r2)
            r5.A00 = r3
            r0 = 1013852356(0x3c6e28c4, float:0.0145360865)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L_0x0024
            return r4
        L_0x005c:
            X.MDu r5 = X.C66142MDu.A00(r6, r9, r3)
            goto L_0x0016
        L_0x0061:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0066:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveModerationApi.A03(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDu, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(java.lang.String r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = this;
            r3 = 34
            boolean r0 = X.C66142MDu.A02(r3, r7)
            if (r0 == 0) goto L_0x0047
            r4 = r7
            X.MDu r4 = (X.C66142MDu) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0047
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r1 = r4.A00
            r2 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r2) goto L_0x0051
            X.0eS.A00(r0)
        L_0x0024:
            r3 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0031
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x004c
            X.5sO r3 = X.DbU.A0f()
        L_0x0031:
            return r3
        L_0x0032:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r0 = r5.A00
            X.1OC r1 = X.LTC.A05(r0, r6)
            r4.A00 = r2
            r0 = 1890699853(0x70b1ca4d, float:4.401873E29)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 != r3) goto L_0x0024
            return r3
        L_0x0047:
            X.MDu r4 = X.C66142MDu.A00(r5, r7, r3)
            goto L_0x0016
        L_0x004c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0051:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveModerationApi.A04(java.lang.String, X.4D7):java.lang.Object");
    }
}

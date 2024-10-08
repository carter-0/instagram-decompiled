package com.instagram.video.live.mvvm.model.datasource.api;

import com.instagram.common.session.UserSession;

public final class IgLiveCommentsApi {
    public final UserSession A00;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDu, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.M0V r7, java.lang.String r8, X.AnonymousClass4D7 r9) {
        /*
            r6 = this;
            r3 = 17
            boolean r0 = X.C66142MDu.A02(r3, r9)
            if (r0 == 0) goto L_0x005b
            r5 = r9
            X.MDu r5 = (X.C66142MDu) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005b
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r3) goto L_0x0065
            X.0eS.A00(r0)
        L_0x0024:
            r4 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0031
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0060
            X.5sO r4 = X.DbU.A0f()
        L_0x0031:
            return r4
        L_0x0032:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.AnonymousClass7TF.A1B(r8, r3, r7)
            X.1NY r2 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r0 = r7.getPk()
            java.lang.Object[] r1 = new java.lang.Object[]{r8, r0}
            java.lang.String r0 = "live/%s/delete_comment/%s/"
            r2.A0K(r0, r1)
            X.1OC r1 = X.JTU.A0G(r2)
            r5.A00 = r3
            r0 = 1534060280(0x5b6fe6f8, float:6.7526472E16)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L_0x0024
            return r4
        L_0x005b:
            X.MDu r5 = X.C66142MDu.A00(r6, r9, r3)
            goto L_0x0016
        L_0x0060:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0065:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi.A00(X.M0V, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.MDu, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.util.List r13, X.AnonymousClass4D7 r14, int r15, long r16, long r18, long r20) {
        /*
            r9 = this;
            r4 = 18
            boolean r0 = X.C66142MDu.A02(r4, r14)
            if (r0 == 0) goto L_0x00b4
            r2 = r14
            X.MDu r2 = (X.C66142MDu) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00b4
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0016:
            java.lang.Object r0 = r2.A01
            X.1Hj r3 = X.1Hj.A02
            int r1 = r2.A00
            r4 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r4) goto L_0x00bf
            X.0eS.A00(r0)
        L_0x0024:
            r3 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0031
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00ba
            X.5sO r3 = X.DbU.A0f()
        L_0x0031:
            return r3
        L_0x0032:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r8 = r9.A00
            X.AnonymousClass7TF.A1F(r10, r4, r13)
            java.io.StringWriter r6 = X.JTO.A0v()
            X.17W r5 = X.C51970G9q.A0e(r6)
            java.util.Iterator r1 = r13.iterator()
        L_0x0046:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
            r5.A0t(r0)
            goto L_0x0046
        L_0x0054:
            java.lang.String r7 = X.JTR.A13(r5, r6)
            r6 = 0
            X.1NY r5 = X.AnonymousClass7TG.A0b(r8)
            java.lang.Object[] r1 = new java.lang.Object[]{r10}
            java.lang.String r0 = "live/%s/get_comment/"
            r5.A0K(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r16)
            java.lang.String r0 = "last_comment_ts"
            r5.A9m(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r18)
            java.lang.String r0 = "join_request_last_fetch_ts"
            r5.A9m(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r15)
            java.lang.String r0 = "join_request_last_total_count"
            r5.A9m(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r20)
            java.lang.String r0 = "join_request_last_seen_ts"
            r5.A9m(r0, r1)
            java.lang.String r0 = "visible_comment_ids"
            r5.A9m(r0, r7)
            java.lang.Class<X.K1a> r1 = X.C61289K1a.class
            java.lang.Class<X.LK6> r0 = X.LK6.class
            r5.A0O(r6, r1, r0, r4)
            if (r12 == 0) goto L_0x009d
            java.lang.String r0 = "new_supporters_min_id"
            r5.A9m(r0, r12)
        L_0x009d:
            if (r11 == 0) goto L_0x00a4
            java.lang.String r0 = "mentioned_comment_id"
            r5.A9m(r0, r11)
        L_0x00a4:
            X.1OC r1 = r5.A0M()
            r2.A00 = r4
            r0 = 1845178886(0x6dfb3206, float:9.7176515E27)
            java.lang.Object r0 = r1.A00(r0, r2)
            if (r0 != r3) goto L_0x0024
            return r3
        L_0x00b4:
            X.MDu r2 = X.C66142MDu.A00(r9, r14, r4)
            goto L_0x0016
        L_0x00ba:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00bf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi.A01(java.lang.String, java.lang.String, java.lang.String, java.util.List, X.4D7, int, long, long, long):java.lang.Object");
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
            r3 = 19
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
            X.1NY r2 = X.AnonymousClass7TG.A0a(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "live/%s/like_comment/"
            X.DbU.A1P(r2, r0, r1)
            java.lang.String r0 = "comment_id"
            r2.A9m(r0, r8)
            X.1OC r1 = X.JTU.A0G(r2)
            r5.A00 = r3
            r0 = 2134169783(0x7f34d8b7, float:2.4038629E38)
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
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi.A02(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
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
            r3 = 21
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
            X.1NY r2 = X.AnonymousClass7TG.A0a(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "live/%s/unlike_comment/"
            X.DbU.A1P(r2, r0, r1)
            java.lang.String r0 = "comment_id"
            r2.A9m(r0, r8)
            X.1OC r1 = X.JTU.A0G(r2)
            r5.A00 = r3
            r0 = 690680456(0x292af288, float:3.7957945E-14)
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
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi.A03(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDu, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(java.lang.String r6, java.lang.String r7, X.AnonymousClass4D7 r8) {
        /*
            r5 = this;
            r3 = 23
            boolean r0 = X.C66142MDu.A02(r3, r8)
            if (r0 == 0) goto L_0x0049
            r4 = r8
            X.MDu r4 = (X.C66142MDu) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0049
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r1 = r4.A00
            r2 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r2) goto L_0x0053
            X.0eS.A00(r0)
        L_0x0024:
            r3 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0031
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x004e
            X.5sO r3 = X.DbU.A0f()
        L_0x0031:
            return r3
        L_0x0032:
            X.0eS.A00(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            com.instagram.common.session.UserSession r0 = r5.A00
            X.1OC r1 = X.LTC.A04(r0, r1, r6, r7)
            r4.A00 = r2
            r0 = 1970159703(0x756e4057, float:3.0201944E32)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 != r3) goto L_0x0024
            return r3
        L_0x0049:
            X.MDu r4 = X.C66142MDu.A00(r5, r8, r3)
            goto L_0x0016
        L_0x004e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0053:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi.A04(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.MDu, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(java.lang.String r8, java.lang.String r9, X.AnonymousClass4D7 r10, long r11) {
        /*
            r7 = this;
            r4 = 20
            boolean r0 = X.C66142MDu.A02(r4, r10)
            if (r0 == 0) goto L_0x0072
            r2 = r10
            X.MDu r2 = (X.C66142MDu) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0072
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0016:
            java.lang.Object r0 = r2.A01
            X.1Hj r3 = X.1Hj.A02
            int r1 = r2.A00
            r4 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r4) goto L_0x007c
            X.0eS.A00(r0)
        L_0x0024:
            r3 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0031
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0077
            X.5sO r3 = X.DbU.A0f()
        L_0x0031:
            return r3
        L_0x0032:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r1 = r7.A00
            r0 = 2
            X.0qQ.A0B(r9, r0)
            r6 = 0
            X.1NY r5 = X.AnonymousClass7TG.A0a(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r9}
            java.lang.String r0 = "live/%s/pin_comment/"
            X.DbU.A1P(r5, r0, r1)
            long r0 = X.AnonymousClass7TE.A0P(r11)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "offset_to_video_start"
            r5.A9m(r0, r1)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            r5.A0O(r6, r1, r0, r4)
            java.lang.String r0 = "comment_id"
            r5.A9m(r0, r8)
            X.1OC r1 = X.DbT.A0U(r5, r4)
            r2.A00 = r4
            r0 = 449846751(0x1ad01ddf, float:8.607504E-23)
            java.lang.Object r0 = r1.A00(r0, r2)
            if (r0 != r3) goto L_0x0024
            return r3
        L_0x0072:
            X.MDu r2 = X.C66142MDu.A00(r7, r10, r4)
            goto L_0x0016
        L_0x0077:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x007c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi.A05(java.lang.String, java.lang.String, X.4D7, long):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.MDu, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06(java.lang.String r8, java.lang.String r9, X.AnonymousClass4D7 r10, long r11) {
        /*
            r7 = this;
            r4 = 22
            boolean r0 = X.C66142MDu.A02(r4, r10)
            if (r0 == 0) goto L_0x0072
            r2 = r10
            X.MDu r2 = (X.C66142MDu) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0072
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0016:
            java.lang.Object r0 = r2.A01
            X.1Hj r3 = X.1Hj.A02
            int r1 = r2.A00
            r4 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r4) goto L_0x007c
            X.0eS.A00(r0)
        L_0x0024:
            r3 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0031
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0077
            X.5sO r3 = X.DbU.A0f()
        L_0x0031:
            return r3
        L_0x0032:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r1 = r7.A00
            r0 = 2
            X.0qQ.A0B(r9, r0)
            r6 = 0
            X.1NY r5 = X.AnonymousClass7TG.A0a(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r9}
            java.lang.String r0 = "live/%s/unpin_comment/"
            X.DbU.A1P(r5, r0, r1)
            long r0 = X.AnonymousClass7TE.A0P(r11)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "offset_to_video_start"
            r5.A9m(r0, r1)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            r5.A0O(r6, r1, r0, r4)
            java.lang.String r0 = "comment_id"
            r5.A9m(r0, r8)
            X.1OC r1 = X.DbT.A0U(r5, r4)
            r2.A00 = r4
            r0 = 487759932(0x1d12a03c, float:1.9405778E-21)
            java.lang.Object r0 = r1.A00(r0, r2)
            if (r0 != r3) goto L_0x0024
            return r3
        L_0x0072:
            X.MDu r2 = X.C66142MDu.A00(r7, r10, r4)
            goto L_0x0016
        L_0x0077:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x007c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.datasource.api.IgLiveCommentsApi.A06(java.lang.String, java.lang.String, X.4D7, long):java.lang.Object");
    }

    public IgLiveCommentsApi(UserSession userSession) {
        this.A00 = userSession;
    }
}

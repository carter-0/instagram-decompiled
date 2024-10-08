package com.instagram.comments.mvvm.data.network;

public abstract class LikeActionNetworkRequestsKt {
    /* JADX WARNING: type inference failed for: r4v1, types: [X.Il6, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C53335GmL r9, X.C335907dj r10, X.C333777a7 r11, com.instagram.common.session.UserSession r12, java.lang.String r13, X.AnonymousClass4D7 r14) {
        /*
            r3 = 5
            boolean r0 = X.C58074Il6.A02(r3, r14)
            if (r0 == 0) goto L_0x015d
            r4 = r14
            X.Il6 r4 = (X.C58074Il6) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x015d
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r4.A01
            X.1Hj r5 = X.1Hj.A02
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L_0x0057
            if (r0 != r3) goto L_0x0169
            X.0eS.A00(r1)
        L_0x0023:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x004e
            X.3Ih r1 = X.C51967G9n.A0d()
        L_0x002d:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x004b
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0164
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r0 = r1.A00
            X.4dm r0 = (X.C268654dm) r0
            java.lang.Object r0 = r0.A00()
            X.1XP r0 = (X.1XP) r0
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = r0.getErrorCode()
        L_0x0047:
            X.5sO r1 = X.C41845B3m.A0c(r0)
        L_0x004b:
            return r1
        L_0x004c:
            r0 = 0
            goto L_0x0047
        L_0x004e:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x002d
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0057:
            X.0eS.A00(r1)
            boolean r8 = r10.A0S
            java.lang.String r0 = r10.A0K
            boolean r2 = r10.A0d
            java.lang.String r7 = X.DbS.A0k()
            X.1NY r6 = X.AnonymousClass7TG.A0a(r12)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            if (r8 == 0) goto L_0x00f7
            java.lang.String r0 = "media/%s/comment_unlike/"
            r6.A0K(r0, r1)
            java.lang.Class<X.Gym> r1 = X.C54063Gym.class
            java.lang.Class<X.Hwa> r0 = X.C56323Hwa.class
            r6.A0Q(r1, r0)
            boolean r1 = r9.A0W
            java.lang.String r0 = "is_carousel_bumped_post"
            r6.A0H(r0, r1)
            java.lang.String r0 = "nav_chain"
            r6.A0G(r0, r7)
            java.lang.String r0 = "container_module"
            r6.A0G(r0, r13)
            java.lang.String r1 = r11.A0H
            java.lang.String r0 = "inventory_source"
            r6.A0G(r0, r1)
            java.lang.String r1 = "is_feed_preview_comment"
            java.lang.String r0 = "false"
            r6.A9m(r1, r0)
            java.lang.String r0 = "is_reply_highlight"
            r6.A0H(r0, r2)
            java.lang.Integer r7 = r9.A06
            r2 = -1
            if (r7 == 0) goto L_0x00bb
            int r0 = r7.intValue()
            if (r0 == r2) goto L_0x00bb
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "feed_position"
            r6.A9m(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "m_ix"
            r6.A9m(r0, r1)
        L_0x00bb:
            java.lang.Integer r1 = r9.A04
            if (r1 == 0) goto L_0x00ce
            int r0 = r1.intValue()
            if (r0 == r2) goto L_0x00ce
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "carousel_index"
            r6.A9m(r0, r1)
        L_0x00ce:
            java.lang.Integer r1 = r11.A0B
            if (r1 == 0) goto L_0x00df
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x00df
            java.lang.String r1 = X.C2606846q.A00(r1)
            java.lang.String r0 = "delivery_class"
            r6.A0G(r0, r1)
        L_0x00df:
            boolean r0 = r11.A0c
            if (r0 == 0) goto L_0x00ea
            java.lang.String r1 = r11.A0P
            java.lang.String r0 = "tracking_token"
            r6.A0G(r0, r1)
        L_0x00ea:
            X.1OC r0 = X.DbT.A0U(r6, r3)
            r4.A00 = r3
            java.lang.Object r1 = r0.A01(r4)
            if (r1 != r5) goto L_0x0023
            return r5
        L_0x00f7:
            java.lang.String r0 = "media/%s/comment_like/"
            r6.A0K(r0, r1)
            java.lang.Class<X.Gym> r1 = X.C54063Gym.class
            java.lang.Class<X.Hwa> r0 = X.C56323Hwa.class
            r6.A0Q(r1, r0)
            boolean r1 = r9.A0W
            java.lang.String r0 = "is_carousel_bumped_post"
            r6.A0H(r0, r1)
            java.lang.String r0 = "nav_chain"
            r6.A0G(r0, r7)
            java.lang.String r0 = "container_module"
            r6.A0G(r0, r13)
            java.lang.String r1 = r11.A0H
            java.lang.String r0 = "inventory_source"
            r6.A0G(r0, r1)
            java.lang.String r1 = r11.A0L
            java.lang.String r0 = "ranking_info_token"
            r6.A0G(r0, r1)
            java.lang.String r1 = "is_feed_preview_comment"
            java.lang.String r0 = "false"
            r6.A9m(r1, r0)
            java.lang.String r0 = "is_reply_highlight"
            r6.A0H(r0, r2)
            java.lang.Integer r1 = r9.A06
            r2 = -1
            if (r1 == 0) goto L_0x0142
            int r0 = r1.intValue()
            if (r0 == r2) goto L_0x0142
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "feed_position"
            r6.A9m(r0, r1)
        L_0x0142:
            java.lang.Integer r1 = r9.A04
            if (r1 == 0) goto L_0x0155
            int r0 = r1.intValue()
            if (r0 == r2) goto L_0x0155
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "carousel_index"
            r6.A9m(r0, r1)
        L_0x0155:
            java.lang.Integer r0 = r11.A0B
            if (r0 == 0) goto L_0x00df
            X.C51973G9u.A1B(r6, r0)
            goto L_0x00df
        L_0x015d:
            X.Il6 r4 = new X.Il6
            r4.<init>(r3, r14)
            goto L_0x0015
        L_0x0164:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0169:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.network.LikeActionNetworkRequestsKt.A00(X.GmL, X.7dj, X.7a7, com.instagram.common.session.UserSession, java.lang.String, X.4D7):java.lang.Object");
    }
}

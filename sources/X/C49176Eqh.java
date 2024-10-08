package X;

/* renamed from: X.Eqh  reason: case insensitive filesystem */
public abstract class C49176Eqh {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass0iw r4, com.instagram.common.session.UserSession r5, com.instagram.user.model.User r6, java.lang.Integer r7, java.lang.String r8, java.lang.String r9) {
        /*
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.lang.String r3 = r6.getId()
            int r1 = r7.intValue()
            java.lang.String r0 = "Required value was null."
            switch(r1) {
                case 0: goto L_0x00d4;
                case 1: goto L_0x008a;
                case 2: goto L_0x00af;
                case 3: goto L_0x0011;
                case 4: goto L_0x0011;
                case 5: goto L_0x0011;
                case 6: goto L_0x0062;
                case 7: goto L_0x0011;
                case 8: goto L_0x0012;
                case 9: goto L_0x003a;
                default: goto L_0x0011;
            }
        L_0x0011:
            return
        L_0x0012:
            if (r9 == 0) goto L_0x0100
            X.0wc r1 = X.AnonymousClass0kN.A01(r4, r5)
            java.lang.String r0 = "ig_unmute_posts"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0011
            X.DbW.A15(r2, r4)
            java.lang.String r0 = "selected_from"
            r2.AAJ(r0, r9)
            java.lang.Long r1 = X.DbV.A0q(r3)
            java.lang.String r0 = "target_user_id"
            r2.A9F(r0, r1)
            r1 = 0
            if (r8 == 0) goto L_0x0127
            goto L_0x00fb
        L_0x003a:
            if (r9 == 0) goto L_0x010a
            X.0wc r1 = X.AnonymousClass0kN.A01(r4, r5)
            java.lang.String r0 = "ig_unmute_stories"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0011
            X.DbW.A15(r2, r4)
            java.lang.String r0 = "selected_from"
            r2.AAJ(r0, r9)
            java.lang.Long r1 = X.DbV.A0q(r3)
            java.lang.String r0 = "target_user_id"
            r2.A9F(r0, r1)
            r1 = 0
            if (r8 == 0) goto L_0x0127
            goto L_0x0105
        L_0x0062:
            if (r9 == 0) goto L_0x0114
            X.0wc r1 = X.AnonymousClass0kN.A01(r4, r5)
            java.lang.String r0 = "ig_mute_posts_and_stories"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0011
            X.DbW.A15(r2, r4)
            java.lang.String r0 = "selected_from"
            r2.AAJ(r0, r9)
            java.lang.Long r1 = X.DbV.A0q(r3)
            java.lang.String r0 = "target_user_id"
            r2.A9F(r0, r1)
            r1 = 0
            if (r8 == 0) goto L_0x0127
            goto L_0x010f
        L_0x008a:
            X.0wc r1 = X.AnonymousClass0kN.A01(r4, r5)
            java.lang.String r0 = "ig_mute_posts"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0011
            X.DbW.A15(r2, r4)
            java.lang.Long r1 = X.DbV.A0q(r3)
            java.lang.String r0 = "target_user_id"
            r2.A9F(r0, r1)
            java.lang.String r0 = "selected_from"
            r2.AAJ(r0, r9)
            r1 = 0
            if (r8 == 0) goto L_0x0127
            goto L_0x0119
        L_0x00af:
            X.0wc r1 = X.AnonymousClass0kN.A01(r4, r5)
            java.lang.String r0 = "ig_mute_stories"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0011
            X.DbW.A15(r2, r4)
            java.lang.Long r1 = X.DbV.A0q(r3)
            java.lang.String r0 = "target_user_id"
            r2.A9F(r0, r1)
            java.lang.String r0 = "selected_from"
            r2.AAJ(r0, r9)
            r1 = 0
            if (r8 == 0) goto L_0x0127
            goto L_0x011e
        L_0x00d4:
            if (r9 == 0) goto L_0x0130
            X.0wc r1 = X.AnonymousClass0kN.A01(r4, r5)
            java.lang.String r0 = "ig_mute_action_selected"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0011
            X.DbW.A15(r2, r4)
            java.lang.String r0 = "selected_from"
            r2.AAJ(r0, r9)
            java.lang.Long r1 = X.DbV.A0q(r3)
            java.lang.String r0 = "target_user_id"
            r2.A9F(r0, r1)
            r1 = 0
            if (r8 == 0) goto L_0x0127
            goto L_0x0123
        L_0x00fb:
            java.lang.Long r1 = X.DbV.A0q(r8)     // Catch:{ NumberFormatException -> 0x0127 }
            goto L_0x0127
        L_0x0100:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0105:
            java.lang.Long r1 = X.DbV.A0q(r8)     // Catch:{ NumberFormatException -> 0x0127 }
            goto L_0x0127
        L_0x010a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x010f:
            java.lang.Long r1 = X.DbV.A0q(r8)     // Catch:{ NumberFormatException -> 0x0127 }
            goto L_0x0127
        L_0x0114:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0119:
            java.lang.Long r1 = X.DbV.A0q(r8)     // Catch:{ NumberFormatException -> 0x0127 }
            goto L_0x0127
        L_0x011e:
            java.lang.Long r1 = X.DbV.A0q(r8)     // Catch:{ NumberFormatException -> 0x0127 }
            goto L_0x0127
        L_0x0123:
            java.lang.Long r1 = X.DbV.A0q(r8)     // Catch:{ NumberFormatException -> 0x0127 }
        L_0x0127:
            java.lang.String r0 = "media_id"
            r2.A9F(r0, r1)
            r2.Cgf()
            return
        L_0x0130:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49176Eqh.A00(X.0iw, com.instagram.common.session.UserSession, com.instagram.user.model.User, java.lang.Integer, java.lang.String, java.lang.String):void");
    }
}

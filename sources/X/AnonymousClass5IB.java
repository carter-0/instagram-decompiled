package X;

/* renamed from: X.5IB  reason: invalid class name */
public abstract class AnonymousClass5IB {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cb, code lost:
        if (r3.equals(r0) == false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cd, code lost:
        r0 = com.instagram.pendingmedia.model.UserStoryTarget.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f0, code lost:
        X.AnonymousClass5IC.A00(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ff, code lost:
        r0 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass5IC parseFromJson(X.16F r3) {
        /*
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.5IC r1 = new X.5IC     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            r1.<init>()     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            X.16L r2 = r3.A11()     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            if (r2 == r0) goto L_0x0016
            r3.A0z()     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            goto L_0x0102
        L_0x0016:
            X.16L r2 = r3.A1J()     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            if (r2 == r0) goto L_0x0099
            java.lang.String r2 = r3.A0q()     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            r3.A1J()     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            java.lang.String r0 = "user_story_target"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            if (r0 == 0) goto L_0x0037
            X.16L r2 = r3.A11()     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            if (r2 != r0) goto L_0x008e
            r0 = 0
            goto L_0x0092
        L_0x0037:
            java.lang.String r0 = "user_story_target_holder"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            if (r0 == 0) goto L_0x0046
            X.5IE r0 = X.AnonymousClass5ID.parseFromJson(r3)     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            r1.A02 = r0     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            goto L_0x0094
        L_0x0046:
            java.lang.String r0 = "is_configured_in_server"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            if (r0 == 0) goto L_0x0055
            boolean r0 = r3.A0d()     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            r1.A05 = r0     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            goto L_0x0094
        L_0x0055:
            java.lang.String r0 = "sub_share_id"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            if (r0 == 0) goto L_0x0064
            int r0 = r3.A1D()     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            r1.A00 = r0     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            goto L_0x0094
        L_0x0064:
            java.lang.String r0 = "media_audience"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            if (r0 == 0) goto L_0x007b
            java.lang.String r2 = r3.A1Q()     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            java.util.Map r0 = X.AnonymousClass3QO.A01     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            X.3QO r0 = (X.AnonymousClass3QO) r0     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            r1.A01 = r0     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            goto L_0x0094
        L_0x007b:
            java.lang.String r0 = "share_type"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            if (r0 == 0) goto L_0x0094
            java.lang.String r0 = r3.A1P()     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.valueOf(r0)     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            r1.A03 = r0     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            goto L_0x0094
        L_0x008e:
            java.lang.String r0 = r3.A1P()     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
        L_0x0092:
            r1.A04 = r0     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
        L_0x0094:
            r3.A0z()     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            goto L_0x0016
        L_0x0099:
            java.lang.String r3 = r1.A04     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            if (r3 == 0) goto L_0x00f3
            java.lang.String r2 = "MultiConfigStoryTarget"
            java.lang.String r0 = "Deserializing MultiConfigStoryTarget with legacy field 'user_story_target'. On new clients, MultiConfigStoryTarget should use the field 'user_story_target_holder' to persist user story target value to local storage."
            X.0wb.A03(r2, r0)     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            int r0 = r3.hashCode()     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            switch(r0) {
                case 64897: goto L_0x00e6;
                case 702693113: goto L_0x00db;
                case 734941130: goto L_0x00d0;
                case 1001355831: goto L_0x00c5;
                case 1279756998: goto L_0x00ba;
                case 1702038030: goto L_0x00b7;
                case 2036774020: goto L_0x00ac;
                default: goto L_0x00ab;
            }     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
        L_0x00ab:
            goto L_0x00ff
        L_0x00ac:
            java.lang.String r0 = "FACEBOOK_DATING"
            boolean r0 = r3.equals(r0)     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            if (r0 == 0) goto L_0x00ff
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A05     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            goto L_0x00f0
        L_0x00b7:
            java.lang.String r0 = "CLOSE_FRIENDS"
            goto L_0x00c7
        L_0x00ba:
            java.lang.String r0 = "FACEBOOK"
            boolean r0 = r3.equals(r0)     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            if (r0 == 0) goto L_0x00ff
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A04     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            goto L_0x00f0
        L_0x00c5:
            java.lang.String r0 = "FAVORITES"
        L_0x00c7:
            boolean r0 = r3.equals(r0)     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            if (r0 == 0) goto L_0x00ff
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A02     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            goto L_0x00f0
        L_0x00d0:
            java.lang.String r0 = "HALLPASS"
            boolean r0 = r3.equals(r0)     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            if (r0 == 0) goto L_0x00ff
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A06     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            goto L_0x00f0
        L_0x00db:
            java.lang.String r0 = "PRIVATE_STORY"
            boolean r0 = r3.equals(r0)     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            if (r0 == 0) goto L_0x00ff
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A09     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            goto L_0x00f0
        L_0x00e6:
            java.lang.String r0 = "ALL"
            boolean r0 = r3.equals(r0)     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            if (r0 == 0) goto L_0x00ff
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A01     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
        L_0x00f0:
            X.AnonymousClass5IC.A00(r0, r1)     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
        L_0x00f3:
            com.instagram.pendingmedia.model.constants.ShareType r0 = r1.A03     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            if (r0 != 0) goto L_0x0103
            r1.A01()     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            r1.A03 = r0     // Catch:{ IOException -> 0x010b, Exception -> 0x0104 }
            goto L_0x0101
        L_0x00ff:
            r0 = 0
            goto L_0x00f0
        L_0x0101:
            return r1
        L_0x0102:
            r1 = 0
        L_0x0103:
            return r1
        L_0x0104:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x010b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5IB.parseFromJson(X.16F):X.5IC");
    }
}

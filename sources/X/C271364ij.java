package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.4ij  reason: invalid class name and case insensitive filesystem */
public abstract class C271364ij {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.util.Set] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C271374ik parseFromJson(X.16F r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.4ik r0 = new X.4ik     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            r0.<init>()     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            if (r2 == r1) goto L_0x0016
            r4.A0z()     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            goto L_0x013d
        L_0x0016:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            if (r2 == r1) goto L_0x013e
            java.lang.String r2 = r4.A0q()     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            r4.A1J()     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            java.lang.String r1 = "archived_media_timestamp"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            if (r1 == 0) goto L_0x003b
            long r1 = r4.A0y()     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            r0.A06 = r1     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
        L_0x0037:
            r4.A0z()     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            goto L_0x0016
        L_0x003b:
            java.lang.String r1 = "expiring_media_action_summary"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            if (r1 == 0) goto L_0x004a
            X.5Dg r1 = X.C272064k2.parseFromJson(r4)     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            r0.A03 = r1     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            goto L_0x0037
        L_0x004a:
            java.lang.String r1 = "seen_user_ids"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            r3 = 0
            if (r1 == 0) goto L_0x007d
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            if (r2 != r1) goto L_0x007a
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            r3.<init>()     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
        L_0x0060:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            if (r2 == r1) goto L_0x007a
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            if (r2 == r1) goto L_0x0060
            java.lang.String r1 = r4.A1P()     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            if (r1 == 0) goto L_0x0060
            r3.add(r1)     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            goto L_0x0060
        L_0x007a:
            r0.A0C = r3     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            goto L_0x0037
        L_0x007d:
            java.lang.String r1 = "media"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            if (r1 == 0) goto L_0x008c
            X.1Xj r1 = X.1Xj.A00(r4)     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            r0.A05 = r1     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            goto L_0x0037
        L_0x008c:
            java.lang.String r1 = "playback_duration_secs"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            if (r1 == 0) goto L_0x009f
            long r1 = r4.A0y()     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            r0.A08 = r1     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            goto L_0x0037
        L_0x009f:
            java.lang.String r1 = "reply_type"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            if (r1 == 0) goto L_0x00b6
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            if (r2 == r1) goto L_0x00b3
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
        L_0x00b3:
            r0.A0A = r3     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            goto L_0x0037
        L_0x00b6:
            java.lang.String r1 = "seen_count"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            if (r1 == 0) goto L_0x00c6
            int r1 = r4.A1D()     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            r0.A00 = r1     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            goto L_0x0037
        L_0x00c6:
            java.lang.String r1 = "tap_models"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            if (r1 == 0) goto L_0x00f1
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            if (r2 != r1) goto L_0x00ed
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            r3.<init>()     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
        L_0x00db:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            if (r2 == r1) goto L_0x00ed
            X.3ui r1 = X.C273934nQ.parseFromJson(r4)     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            if (r1 == 0) goto L_0x00db
            r3.add(r1)     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            goto L_0x00db
        L_0x00ed:
            r0.A0B = r3     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            goto L_0x0037
        L_0x00f1:
            java.lang.String r1 = "url_expire_at_secs"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            if (r1 == 0) goto L_0x0105
            long r1 = r4.A0y()     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            r0.A07 = r1     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            goto L_0x0037
        L_0x0105:
            java.lang.String r1 = "view_mode"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            if (r1 == 0) goto L_0x011d
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            if (r2 == r1) goto L_0x0119
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
        L_0x0119:
            r0.A09 = r3     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            goto L_0x0037
        L_0x011d:
            java.lang.String r1 = "story_app_attribution"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            if (r1 == 0) goto L_0x012d
            X.OGw r1 = X.C70073Nwp.parseFromJson(r4)     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            r0.A01 = r1     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            goto L_0x0037
        L_0x012d:
            java.lang.String r1 = "seen_info"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            if (r1 == 0) goto L_0x0037
            X.OBp r1 = X.C70072Nwo.parseFromJson(r4)     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            r0.A02 = r1     // Catch:{ IOException -> 0x0146, Exception -> 0x013f }
            goto L_0x0037
        L_0x013d:
            r0 = 0
        L_0x013e:
            return r0
        L_0x013f:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x0146:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C271364ij.parseFromJson(X.16F):X.4ik");
    }

    public static void A00(17Z r3, C271374ik r4) {
        r3.A0c();
        Long l = r4.A06;
        if (l != null) {
            r3.A0Q("archived_media_timestamp", l.longValue());
        }
        if (r4.A03 != null) {
            r3.A0q("expiring_media_action_summary");
            C272064k2.A00(r3, r4.A03);
        }
        if (r4.A0C != null) {
            16P.A03(r3, "seen_user_ids");
            for (String str : r4.A0C) {
                if (str != null) {
                    r3.A0t(str);
                }
            }
            r3.A0Y();
        }
        if (r4.A05 != null) {
            r3.A0q("media");
            1Xj r1 = r4.A05;
            1Xv r0 = 1Xj.A0h;
            1Xv.A07(r3, r1);
        }
        Long l2 = r4.A08;
        if (l2 != null) {
            r3.A0Q("playback_duration_secs", l2.longValue());
        }
        String str2 = r4.A0A;
        if (str2 != null) {
            r3.A0R("reply_type", str2);
        }
        r3.A0P("seen_count", r4.A00);
        if (r4.A0B != null) {
            16P.A03(r3, "tap_models");
            for (C255783ui r02 : r4.A0B) {
                if (r02 != null) {
                    C273934nQ.A00(r3, r02);
                }
            }
            r3.A0Y();
        }
        Long l3 = r4.A07;
        if (l3 != null) {
            r3.A0Q("url_expire_at_secs", l3.longValue());
        }
        String str3 = r4.A09;
        if (str3 != null) {
            r3.A0R("view_mode", str3);
        }
        if (r4.A01 != null) {
            r3.A0q("story_app_attribution");
            C70701OGw oGw = r4.A01;
            r3.A0c();
            String str4 = oGw.A03;
            if (str4 != null) {
                r3.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str4);
            }
            String str5 = oGw.A04;
            if (str5 != null) {
                r3.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str5);
            }
            String str6 = oGw.A05;
            if (str6 != null) {
                r3.A0R("link", str6);
            }
            String str7 = oGw.A02;
            if (str7 != null) {
                r3.A0R("content_url", str7);
            }
            String str8 = oGw.A01;
            if (str8 != null) {
                r3.A0R(AnonymousClass000.A00(2612), str8);
            }
            if (oGw.A00 != null) {
                r3.A0q(AnonymousClass000.A00(2614));
                16h.A01(r3, oGw.A00);
            }
            r3.A0Z();
        }
        if (r4.A02 != null) {
            r3.A0q("seen_info");
            C70567OBp oBp = r4.A02;
            r3.A0c();
            String str9 = oBp.A01;
            if (str9 != null) {
                r3.A0R("object_id", str9);
            }
            String str10 = oBp.A00;
            if (str10 != null) {
                r3.A0R("mime_type", str10);
            }
            r3.A0Z();
        }
        r3.A0Z();
    }
}

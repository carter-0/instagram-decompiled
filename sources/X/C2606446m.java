package X;

import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

/* renamed from: X.46m  reason: invalid class name and case insensitive filesystem */
public abstract class C2606446m {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.46n] */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v13, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C2606546n parseFromJson(X.16F r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.46n r0 = new X.46n     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            r0.<init>()     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            if (r2 == r1) goto L_0x0016
            r4.A0z()     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            goto L_0x0124
        L_0x0016:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            if (r2 == r1) goto L_0x0125
            java.lang.String r2 = r4.A0q()     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            r4.A1J()     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            java.lang.String r1 = "bold"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            r3 = 0
            if (r1 == 0) goto L_0x0050
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            if (r2 != r1) goto L_0x004d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            r3.<init>()     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
        L_0x003b:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            if (r2 == r1) goto L_0x004d
            X.4wf r1 = X.C278294we.parseFromJson(r4)     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            if (r1 == 0) goto L_0x003b
            r3.add(r1)     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            goto L_0x003b
        L_0x004d:
            r0.A06 = r3     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            goto L_0x0066
        L_0x0050:
            java.lang.String r1 = "description"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            if (r1 == 0) goto L_0x006a
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            if (r2 == r1) goto L_0x0064
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
        L_0x0064:
            r0.A03 = r3     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
        L_0x0066:
            r4.A0z()     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            goto L_0x0016
        L_0x006a:
            java.lang.String r1 = "action_log_type"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            if (r1 == 0) goto L_0x0081
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            if (r2 == r1) goto L_0x007e
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
        L_0x007e:
            r0.A02 = r3     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            goto L_0x0066
        L_0x0081:
            java.lang.String r1 = "is_reaction_log"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            if (r1 == 0) goto L_0x0090
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            r0.A09 = r1     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            goto L_0x0066
        L_0x0090:
            java.lang.String r1 = "text_attributes"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            if (r1 == 0) goto L_0x00ba
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            if (r2 != r1) goto L_0x00b7
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            r3.<init>()     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
        L_0x00a5:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            if (r2 == r1) goto L_0x00b7
            X.4wh r1 = X.C278314wg.parseFromJson(r4)     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            if (r1 == 0) goto L_0x00a5
            r3.add(r1)     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            goto L_0x00a5
        L_0x00b7:
            r0.A07 = r3     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            goto L_0x0066
        L_0x00ba:
            java.lang.String r1 = "text_parts"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            if (r1 == 0) goto L_0x00e4
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            if (r2 != r1) goto L_0x00e1
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            r3.<init>()     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
        L_0x00cf:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            if (r2 == r1) goto L_0x00e1
            X.9JK r1 = X.C2606646o.parseFromJson(r4)     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            if (r1 == 0) goto L_0x00cf
            r3.add(r1)     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            goto L_0x00cf
        L_0x00e1:
            r0.A08 = r3     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            goto L_0x0066
        L_0x00e4:
            java.lang.String r1 = "instamadillo_admin_message_info"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            if (r1 == 0) goto L_0x00f4
            X.BBV r1 = X.C70077Nwt.parseFromJson(r4)     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            r0.A01 = r1     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            goto L_0x0066
        L_0x00f4:
            java.lang.String r1 = "emoji"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            if (r1 == 0) goto L_0x010c
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            if (r2 == r1) goto L_0x0108
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
        L_0x0108:
            r0.A04 = r3     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            goto L_0x0066
        L_0x010c:
            java.lang.String r1 = "target_message_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            if (r1 == 0) goto L_0x0066
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            if (r2 == r1) goto L_0x0120
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
        L_0x0120:
            r0.A05 = r3     // Catch:{ IOException -> 0x012d, Exception -> 0x0126 }
            goto L_0x0066
        L_0x0124:
            r0 = 0
        L_0x0125:
            return r0
        L_0x0126:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x012d:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2606446m.parseFromJson(X.16F):X.46n");
    }

    public static void A00(17Z r4, C2606546n r5) {
        r4.A0c();
        if (r5.A06 != null) {
            16P.A03(r4, "bold");
            for (C278304wf r2 : r5.A06) {
                if (r2 != null) {
                    r4.A0c();
                    r4.A0P("start", r2.A01);
                    r4.A0P("end", r2.A00);
                    r4.A0Z();
                }
            }
            r4.A0Y();
        }
        String str = r5.A03;
        if (str != null) {
            r4.A0R(DevServerEntity.COLUMN_DESCRIPTION, str);
        }
        String str2 = r5.A02;
        if (str2 != null) {
            r4.A0R("action_log_type", str2);
        }
        r4.A0S("is_reaction_log", r5.A09);
        if (r5.A07 != null) {
            16P.A03(r4, "text_attributes");
            for (C278324wh r0 : r5.A07) {
                if (r0 != null) {
                    C278314wg.A00(r4, r0);
                }
            }
            r4.A0Y();
        }
        if (r5.A08 != null) {
            16P.A03(r4, "text_parts");
            for (AnonymousClass9JK r22 : r5.A08) {
                if (r22 != null) {
                    r4.A0c();
                    String str3 = r22.A05;
                    if (str3 != null) {
                        r4.A0R("text", str3);
                    }
                    Boolean bool = (Boolean) r22.A01;
                    if (bool != null) {
                        r4.A0S("bold", bool.booleanValue());
                    }
                    String str4 = r22.A03;
                    if (str4 != null) {
                        r4.A0R("color", str4);
                    }
                    String str5 = r22.A02;
                    if (str5 != null) {
                        r4.A0R("intent", str5);
                    }
                    String str6 = r22.A04;
                    if (str6 != null) {
                        r4.A0R("semantic_color", str6);
                    }
                    r4.A0Z();
                }
            }
            r4.A0Y();
        }
        if (r5.A01 != null) {
            r4.A0q("instamadillo_admin_message_info");
            BBV bbv = r5.A01;
            r4.A0c();
            String str7 = bbv.A00;
            if (str7 != null) {
                r4.A0R("message_type", str7);
            }
            r4.A0Z();
        }
        String str8 = r5.A04;
        if (str8 != null) {
            r4.A0R("emoji", str8);
        }
        String str9 = r5.A05;
        if (str9 != null) {
            r4.A0R("target_message_id", str9);
        }
        r4.A0Z();
    }
}

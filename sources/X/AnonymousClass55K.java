package X;

import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

/* renamed from: X.55K  reason: invalid class name */
public abstract class AnonymousClass55K {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass55L parseFromJson(X.16F r7) {
        /*
            r0 = 0
            X.0qQ.A0B(r7, r0)
            X.55L r0 = new X.55L     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            r0.<init>()     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            X.16L r2 = r7.A11()     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            if (r2 == r1) goto L_0x0016
            r7.A0z()     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            goto L_0x00f5
        L_0x0016:
            X.16L r2 = r7.A1J()     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            if (r2 == r1) goto L_0x00f6
            java.lang.String r2 = r7.A0q()     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            r7.A1J()     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            java.lang.String r1 = "action"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            if (r1 == 0) goto L_0x004a
            java.lang.String r6 = r7.A1P()     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            r1 = 5
            java.lang.Integer[] r5 = X.AnonymousClass05K.A00(r1)     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            int r4 = r5.length     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            r3 = 0
            goto L_0x003b
        L_0x0039:
            int r3 = r3 + 1
        L_0x003b:
            if (r3 >= r4) goto L_0x00ec
            r2 = r5[r3]     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            java.lang.String r1 = X.AnonymousClass55M.A00(r2)     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            boolean r1 = r1.equals(r6)     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            if (r1 != 0) goto L_0x00ee
            goto L_0x0039
        L_0x004a:
            java.lang.String r1 = "vc_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            r3 = 0
            if (r1 == 0) goto L_0x0063
            X.16L r2 = r7.A11()     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            if (r2 == r1) goto L_0x005f
            java.lang.String r3 = r7.A1P()     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
        L_0x005f:
            r0.A04 = r3     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            goto L_0x00f0
        L_0x0063:
            java.lang.String r1 = "encoded_server_data_info"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            if (r1 == 0) goto L_0x007a
            X.16L r2 = r7.A11()     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            if (r2 == r1) goto L_0x0077
            java.lang.String r3 = r7.A1P()     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
        L_0x0077:
            r0.A05 = r3     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            goto L_0x00f0
        L_0x007a:
            java.lang.String r1 = "description"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            if (r1 == 0) goto L_0x0091
            X.16L r2 = r7.A11()     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            if (r2 == r1) goto L_0x008e
            java.lang.String r3 = r7.A1P()     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
        L_0x008e:
            r0.A03 = r3     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            goto L_0x00f0
        L_0x0091:
            java.lang.String r1 = "text_attributes"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            if (r1 == 0) goto L_0x00bb
            X.16L r2 = r7.A11()     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            if (r2 != r1) goto L_0x00b8
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            r3.<init>()     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
        L_0x00a6:
            X.16L r2 = r7.A1J()     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            if (r2 == r1) goto L_0x00b8
            X.4wh r1 = X.C278314wg.parseFromJson(r7)     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            if (r1 == 0) goto L_0x00a6
            r3.add(r1)     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            goto L_0x00a6
        L_0x00b8:
            r0.A06 = r3     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            goto L_0x00f0
        L_0x00bb:
            java.lang.String r1 = "did_join"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            if (r1 == 0) goto L_0x00ce
            boolean r1 = r7.A0d()     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            r0.A01 = r1     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            goto L_0x00f0
        L_0x00ce:
            java.lang.String r1 = "thread_has_audio_only_call"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            if (r1 == 0) goto L_0x00dd
            boolean r1 = r7.A0d()     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            r0.A07 = r1     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            goto L_0x00f0
        L_0x00dd:
            java.lang.String r1 = "call_end_time"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            if (r1 == 0) goto L_0x00f0
            long r1 = r7.A0y()     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            r0.A00 = r1     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            goto L_0x00f0
        L_0x00ec:
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
        L_0x00ee:
            r0.A02 = r2     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
        L_0x00f0:
            r7.A0z()     // Catch:{ IOException -> 0x00fe, Exception -> 0x00f7 }
            goto L_0x0016
        L_0x00f5:
            r0 = 0
        L_0x00f6:
            return r0
        L_0x00f7:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x00fe:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass55K.parseFromJson(X.16F):X.55L");
    }

    public static void A00(17Z r3, AnonymousClass55L r4) {
        r3.A0c();
        Integer num = r4.A02;
        if (num != null) {
            r3.A0R("action", AnonymousClass55M.A00(num));
        }
        String str = r4.A04;
        if (str != null) {
            r3.A0R("vc_id", str);
        }
        String str2 = r4.A05;
        if (str2 != null) {
            r3.A0R("encoded_server_data_info", str2);
        }
        String str3 = r4.A03;
        if (str3 != null) {
            r3.A0R(DevServerEntity.COLUMN_DESCRIPTION, str3);
        }
        if (r4.A06 != null) {
            16P.A03(r3, "text_attributes");
            for (C278324wh r0 : r4.A06) {
                if (r0 != null) {
                    C278314wg.A00(r3, r0);
                }
            }
            r3.A0Y();
        }
        Boolean bool = r4.A01;
        if (bool != null) {
            r3.A0S("did_join", bool.booleanValue());
        }
        r3.A0S("thread_has_audio_only_call", r4.A07);
        r3.A0Q("call_end_time", r4.A00);
        r3.A0Z();
    }
}

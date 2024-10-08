package X;

import java.util.List;

/* renamed from: X.3t5  reason: invalid class name and case insensitive filesystem */
public abstract class C254813t5 {
    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass9JH parseFromJson(X.16F r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r1 = 1
            X.9JH r0 = new X.9JH     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            if (r2 == r1) goto L_0x0017
            r4.A0z()     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            goto L_0x0099
        L_0x0017:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            if (r2 == r1) goto L_0x009a
            java.lang.String r2 = r4.A0q()     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            r4.A1J()     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            java.lang.String r1 = "imagine_type"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            r3 = 0
            if (r1 == 0) goto L_0x0041
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            if (r2 == r1) goto L_0x003b
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
        L_0x003b:
            r0.A03 = r3     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
        L_0x003d:
            r4.A0z()     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            goto L_0x0017
        L_0x0041:
            java.lang.String r1 = "imagine_prompt"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            if (r1 == 0) goto L_0x0058
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            if (r2 == r1) goto L_0x0055
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
        L_0x0055:
            r0.A01 = r3     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            goto L_0x003d
        L_0x0058:
            java.lang.String r1 = "result_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            if (r1 == 0) goto L_0x006f
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            if (r2 == r1) goto L_0x006c
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
        L_0x006c:
            r0.A02 = r3     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            goto L_0x003d
        L_0x006f:
            java.lang.String r1 = "imagine_media_ids"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            if (r1 == 0) goto L_0x003d
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            if (r2 != r1) goto L_0x0096
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            r3.<init>()     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
        L_0x0084:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            if (r2 == r1) goto L_0x0096
            X.GSY r1 = X.VBI.parseFromJson(r4)     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            if (r1 == 0) goto L_0x0084
            r3.add(r1)     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            goto L_0x0084
        L_0x0096:
            r0.A00 = r3     // Catch:{ IOException -> 0x00a2, Exception -> 0x009b }
            goto L_0x003d
        L_0x0099:
            r0 = 0
        L_0x009a:
            return r0
        L_0x009b:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x00a2:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C254813t5.parseFromJson(X.16F):X.9JH");
    }

    public static void A00(AnonymousClass9JH r3, 17Z r4) {
        r4.A0c();
        String str = r3.A03;
        if (str != null) {
            r4.A0R("imagine_type", str);
        }
        String str2 = r3.A01;
        if (str2 != null) {
            r4.A0R("imagine_prompt", str2);
        }
        String str3 = r3.A02;
        if (str3 != null) {
            r4.A0R("result_id", str3);
        }
        if (r3.A00 != null) {
            16P.A03(r4, "imagine_media_ids");
            for (GSY gsy : (List) r3.A00) {
                if (gsy != null) {
                    r4.A0c();
                    String str4 = gsy.A03;
                    if (str4 != null) {
                        r4.A0R("media_id", str4);
                    }
                    String str5 = gsy.A02;
                    if (str5 != null) {
                        r4.A0R(AnonymousClass000.A00(3326), str5);
                    }
                    Boolean bool = (Boolean) gsy.A01;
                    if (bool != null) {
                        r4.A0S("editable", bool.booleanValue());
                    }
                    Boolean bool2 = (Boolean) gsy.A00;
                    if (bool2 != null) {
                        r4.A0S("animatable", bool2.booleanValue());
                    }
                    r4.A0Z();
                }
            }
            r4.A0Y();
        }
        r4.A0Z();
    }
}

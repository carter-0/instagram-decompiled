package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.4VH  reason: invalid class name */
public abstract class AnonymousClass4VH {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass4VA parseFromJson(X.16F r5) {
        /*
            r4 = 0
            X.0qQ.A0B(r5, r4)
            X.4VA r0 = new X.4VA     // Catch:{ IOException -> 0x0078, Exception -> 0x0071 }
            r0.<init>()     // Catch:{ IOException -> 0x0078, Exception -> 0x0071 }
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x0078, Exception -> 0x0071 }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x0078, Exception -> 0x0071 }
            if (r2 == r1) goto L_0x0015
            r5.A0z()     // Catch:{ IOException -> 0x0078, Exception -> 0x0071 }
            goto L_0x006f
        L_0x0015:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x0078, Exception -> 0x0071 }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x0078, Exception -> 0x0071 }
            if (r2 == r1) goto L_0x0070
            java.lang.String r2 = r5.A0q()     // Catch:{ IOException -> 0x0078, Exception -> 0x0071 }
            r5.A1J()     // Catch:{ IOException -> 0x0078, Exception -> 0x0071 }
            java.lang.String r1 = "name"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0078, Exception -> 0x0071 }
            r3 = 0
            if (r1 == 0) goto L_0x0042
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x0078, Exception -> 0x0071 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0078, Exception -> 0x0071 }
            if (r2 == r1) goto L_0x0039
            java.lang.String r3 = r5.A1P()     // Catch:{ IOException -> 0x0078, Exception -> 0x0071 }
        L_0x0039:
            X.0qQ.A0B(r3, r4)     // Catch:{ IOException -> 0x0078, Exception -> 0x0071 }
            r0.A00 = r3     // Catch:{ IOException -> 0x0078, Exception -> 0x0071 }
        L_0x003e:
            r5.A0z()     // Catch:{ IOException -> 0x0078, Exception -> 0x0071 }
            goto L_0x0015
        L_0x0042:
            java.lang.String r1 = "parameters"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0078, Exception -> 0x0071 }
            if (r1 == 0) goto L_0x003e
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x0078, Exception -> 0x0071 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0078, Exception -> 0x0071 }
            if (r2 != r1) goto L_0x0069
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x0078, Exception -> 0x0071 }
            r3.<init>()     // Catch:{ IOException -> 0x0078, Exception -> 0x0071 }
        L_0x0057:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x0078, Exception -> 0x0071 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0078, Exception -> 0x0071 }
            if (r2 == r1) goto L_0x0069
            X.4VP r1 = X.AnonymousClass4VO.parseFromJson(r5)     // Catch:{ IOException -> 0x0078, Exception -> 0x0071 }
            if (r1 == 0) goto L_0x0057
            r3.add(r1)     // Catch:{ IOException -> 0x0078, Exception -> 0x0071 }
            goto L_0x0057
        L_0x0069:
            X.0qQ.A0B(r3, r4)     // Catch:{ IOException -> 0x0078, Exception -> 0x0071 }
            r0.A01 = r3     // Catch:{ IOException -> 0x0078, Exception -> 0x0071 }
            goto L_0x003e
        L_0x006f:
            r0 = 0
        L_0x0070:
            return r0
        L_0x0071:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x0078:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VH.parseFromJson(X.16F):X.4VA");
    }

    public static void A00(17Z r2, AnonymousClass4VA r3) {
        r2.A0c();
        String str = r3.A00;
        if (str != null) {
            r2.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        }
        16P.A03(r2, "parameters");
        for (AnonymousClass4VP r0 : r3.A01) {
            if (r0 != null) {
                AnonymousClass4VO.A00(r2, r0);
            }
        }
        r2.A0Y();
        r2.A0Z();
    }
}

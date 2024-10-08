package X;

import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.4VF  reason: invalid class name */
public abstract class AnonymousClass4VF {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass4VG parseFromJson(X.16F r5) {
        /*
            r4 = 0
            X.0qQ.A0B(r5, r4)
            X.4VG r0 = new X.4VG     // Catch:{ IOException -> 0x0084, Exception -> 0x007d }
            r0.<init>()     // Catch:{ IOException -> 0x0084, Exception -> 0x007d }
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x0084, Exception -> 0x007d }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x0084, Exception -> 0x007d }
            if (r2 == r1) goto L_0x0015
            r5.A0z()     // Catch:{ IOException -> 0x0084, Exception -> 0x007d }
            goto L_0x007b
        L_0x0015:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x0084, Exception -> 0x007d }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x0084, Exception -> 0x007d }
            if (r2 == r1) goto L_0x007c
            java.lang.String r2 = r5.A0q()     // Catch:{ IOException -> 0x0084, Exception -> 0x007d }
            r5.A1J()     // Catch:{ IOException -> 0x0084, Exception -> 0x007d }
            java.lang.String r1 = "title"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0084, Exception -> 0x007d }
            if (r1 == 0) goto L_0x0039
            X.4V8 r1 = X.AnonymousClass4VD.parseFromJson(r5)     // Catch:{ IOException -> 0x0084, Exception -> 0x007d }
            X.0qQ.A0B(r1, r4)     // Catch:{ IOException -> 0x0084, Exception -> 0x007d }
            r0.A00 = r1     // Catch:{ IOException -> 0x0084, Exception -> 0x007d }
        L_0x0035:
            r5.A0z()     // Catch:{ IOException -> 0x0084, Exception -> 0x007d }
            goto L_0x0015
        L_0x0039:
            java.lang.String r1 = "limit"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0084, Exception -> 0x007d }
            r3 = 0
            if (r1 == 0) goto L_0x0055
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x0084, Exception -> 0x007d }
            X.16L r1 = X.16L.A0I     // Catch:{ IOException -> 0x0084, Exception -> 0x007d }
            if (r2 != r1) goto L_0x0052
            int r1 = r5.A1D()     // Catch:{ IOException -> 0x0084, Exception -> 0x007d }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x0084, Exception -> 0x007d }
        L_0x0052:
            r0.A01 = r3     // Catch:{ IOException -> 0x0084, Exception -> 0x007d }
            goto L_0x0035
        L_0x0055:
            java.lang.String r1 = "url"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0084, Exception -> 0x007d }
            if (r1 == 0) goto L_0x006c
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x0084, Exception -> 0x007d }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0084, Exception -> 0x007d }
            if (r2 == r1) goto L_0x0069
            java.lang.String r3 = r5.A1P()     // Catch:{ IOException -> 0x0084, Exception -> 0x007d }
        L_0x0069:
            r0.A03 = r3     // Catch:{ IOException -> 0x0084, Exception -> 0x007d }
            goto L_0x0035
        L_0x006c:
            java.lang.String r1 = "dismiss_promotion"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0084, Exception -> 0x007d }
            if (r1 == 0) goto L_0x0035
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x0084, Exception -> 0x007d }
            r0.A04 = r1     // Catch:{ IOException -> 0x0084, Exception -> 0x007d }
            goto L_0x0035
        L_0x007b:
            r0 = 0
        L_0x007c:
            return r0
        L_0x007d:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x0084:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VF.parseFromJson(X.16F):X.4VG");
    }

    public static void A00(17Z r2, AnonymousClass4VG r3) {
        r2.A0c();
        r2.A0q(DialogModule.KEY_TITLE);
        AnonymousClass4V8 r0 = r3.A00;
        r2.A0c();
        String str = r0.A00;
        if (str != null) {
            r2.A0R("text", str);
        }
        r2.A0Z();
        Integer num = r3.A01;
        if (num != null) {
            r2.A0P("limit", num.intValue());
        }
        String str2 = r3.A03;
        if (str2 != null) {
            r2.A0R("url", str2);
        }
        r2.A0S("dismiss_promotion", r3.A04);
        r2.A0Z();
    }
}

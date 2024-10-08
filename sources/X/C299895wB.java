package X;

/* renamed from: X.5wB  reason: invalid class name and case insensitive filesystem */
public abstract class C299895wB {
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1 = X.AnonymousClass05K.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        if (r15 == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008c, code lost:
        r10 = X.C299885wA.A00(r6);
        r6 = "acl_failed";
        r7 = "acl_not_found";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0052 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005f A[Catch:{ NullPointerException -> 0x008c, JSONException -> 0x0095 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ NullPointerException -> 0x008c, JSONException -> 0x0095 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007e A[Catch:{ NullPointerException -> 0x008c, JSONException -> 0x0095 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[ExcHandler: NullPointerException (unused java.lang.NullPointerException), SYNTHETIC, Splitter:B:1:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.C299885wA r10, java.lang.Integer r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15) {
        /*
            r2 = 0
            r5 = r10
            r6 = r11
            r9 = r13
            r8 = r14
            X.5wC r4 = X.C299905wC.A01     // Catch:{ NullPointerException -> 0x008c, JSONException -> 0x0095 }
            r7 = r12
            org.json.JSONObject r1 = r4.A00(r5, r6, r7, r8, r9)     // Catch:{ NullPointerException -> 0x008c, JSONException -> 0x0095 }
            int r4 = r11.intValue()     // Catch:{ NullPointerException -> 0x008c, JSONException -> 0x0095 }
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ NullPointerException -> 0x008c, JSONException -> 0x0095 }
            org.json.JSONObject r3 = r1.getJSONObject(r0)     // Catch:{ NullPointerException -> 0x008c, JSONException -> 0x0095 }
            X.0qQ.A07(r3)     // Catch:{ NullPointerException -> 0x008c, JSONException -> 0x0095 }
            X.5wE r0 = X.C299915wD.A02     // Catch:{ NullPointerException -> 0x008c, JSONException -> 0x0095 }
            java.util.Map r0 = r0.A00     // Catch:{ NullPointerException -> 0x008c, JSONException -> 0x0095 }
            java.lang.Object r0 = r0.get(r14)     // Catch:{ NullPointerException -> 0x008c, JSONException -> 0x0095 }
            java.lang.Enum r0 = (java.lang.Enum) r0     // Catch:{ NullPointerException -> 0x008c, JSONException -> 0x0095 }
            if (r0 != 0) goto L_0x0029
            X.5wD r0 = X.C299915wD.A3q     // Catch:{ NullPointerException -> 0x008c, JSONException -> 0x0095 }
        L_0x0029:
            X.5wD r0 = (X.C299915wD) r0     // Catch:{ NullPointerException -> 0x008c, JSONException -> 0x0095 }
            int r0 = r0.A00     // Catch:{ NullPointerException -> 0x008c, JSONException -> 0x0095 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ NullPointerException -> 0x008c, JSONException -> 0x0095 }
            org.json.JSONObject r1 = r3.getJSONObject(r0)     // Catch:{ NullPointerException -> 0x008c, JSONException -> 0x0095 }
            X.0qQ.A07(r1)     // Catch:{ NullPointerException -> 0x008c, JSONException -> 0x0095 }
            boolean r3 = r3.has(r0)     // Catch:{ NullPointerException -> 0x008c, JSONException -> 0x0095 }
            r0 = 4
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x0052, NullPointerException -> 0x008c }
            org.json.JSONArray r0 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x0052, NullPointerException -> 0x008c }
            java.lang.Object r1 = r0.get(r2)     // Catch:{ JSONException -> 0x0052, NullPointerException -> 0x008c }
            boolean r0 = r1 instanceof java.lang.Integer     // Catch:{ JSONException -> 0x0052, NullPointerException -> 0x008c }
            if (r0 == 0) goto L_0x0059
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ JSONException -> 0x0052, NullPointerException -> 0x008c }
            if (r1 == 0) goto L_0x0059
            goto L_0x0054
        L_0x0052:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C     // Catch:{ NullPointerException -> 0x008c, JSONException -> 0x0095 }
        L_0x0054:
            int r1 = r1.intValue()     // Catch:{ NullPointerException -> 0x008c, JSONException -> 0x0095 }
            goto L_0x005a
        L_0x0059:
            r1 = 2
        L_0x005a:
            switch(r4) {
                case 1: goto L_0x0060;
                case 2: goto L_0x0060;
                default: goto L_0x005d;
            }     // Catch:{ NullPointerException -> 0x008c, JSONException -> 0x0095 }
        L_0x005d:
            if (r3 == 0) goto L_0x007e
            goto L_0x0070
        L_0x0060:
            if (r1 == r2) goto L_0x006a
            r0 = 1
            if (r1 != r0) goto L_0x006c
            if (r3 == 0) goto L_0x006a
            r3 = 1
            if (r15 != 0) goto L_0x005d
        L_0x006a:
            r3 = 0
            goto L_0x005d
        L_0x006c:
            r0 = 2
            if (r1 != r0) goto L_0x006a
            goto L_0x005d
        L_0x0070:
            int r15 = X.C299885wA.A00(r11)     // Catch:{ NullPointerException -> 0x008c, JSONException -> 0x0095 }
            java.lang.String r11 = "acl_passed"
            java.lang.String r12 = "no_error"
            r13 = r14
            r14 = r9
            X.C299885wA.A01(r10, r11, r12, r13, r14, r15)     // Catch:{ NullPointerException -> 0x008c, JSONException -> 0x0095 }
            return r3
        L_0x007e:
            int r15 = X.C299885wA.A00(r11)     // Catch:{ NullPointerException -> 0x008c, JSONException -> 0x0095 }
            java.lang.String r11 = "acl_failed"
            java.lang.String r12 = "caller_name_not_found"
            r13 = r14
            r14 = r9
            X.C299885wA.A01(r10, r11, r12, r13, r14, r15)     // Catch:{ NullPointerException -> 0x008c, JSONException -> 0x0095 }
            return r3
        L_0x008c:
            int r10 = X.C299885wA.A00(r6)
            java.lang.String r6 = "acl_failed"
            java.lang.String r7 = "acl_not_found"
            goto L_0x009d
        L_0x0095:
            int r10 = X.C299885wA.A00(r6)
            java.lang.String r6 = "acl_failed"
            java.lang.String r7 = "acl_is_empty"
        L_0x009d:
            X.C299885wA.A01(r5, r6, r7, r8, r9, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C299895wB.A00(X.5wA, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, boolean):boolean");
    }
}

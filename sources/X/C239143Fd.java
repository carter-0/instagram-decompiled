package X;

/* renamed from: X.3Fd  reason: invalid class name and case insensitive filesystem */
public final class C239143Fd implements C239153Fe {
    public boolean A00;
    public final 1Ef A01;

    public final void EZZ(boolean z) {
        this.A00 = true;
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [java.lang.Object, X.Smd] */
    /* JADX WARNING: type inference failed for: r0v33, types: [java.lang.Object, X.Smd] */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014d, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0157, code lost:
        X.1zE.A00(r3, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object then(java.lang.Object r51) {
        /*
            r50 = this;
            r5 = r51
            X.2ZL r5 = (X.2ZL) r5
            r4 = 0
            X.0qQ.A0B(r5, r4)
            X.1Qb r0 = r5.A00()     // Catch:{ 3Ff -> 0x015b }
            if (r0 == 0) goto L_0x014f
            java.io.InputStream r3 = r0.AjD()     // Catch:{ 3Ff -> 0x015b }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x014b }
            r0.<init>(r3)     // Catch:{ all -> 0x014b }
            java.lang.String r2 = X.AnonymousClass3JA.A00(r0)     // Catch:{ all -> 0x014b }
            if (r2 == 0) goto L_0x0100
            int r0 = r2.length()     // Catch:{ all -> 0x014b }
            if (r0 == 0) goto L_0x0100
            r0 = r50
            X.1Ef r10 = r0.A01     // Catch:{ all -> 0x014b }
            boolean r12 = r0.A00     // Catch:{ all -> 0x014b }
            java.lang.Class r8 = r10.getTreeModelType()     // Catch:{ all -> 0x014b }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00df }
            r6.<init>(r2)     // Catch:{ JSONException -> 0x00df }
            java.lang.String r0 = "error"
            org.json.JSONObject r7 = r6.optJSONObject(r0)     // Catch:{ all -> 0x014b }
            if (r7 != 0) goto L_0x00ba
            java.lang.String r0 = "errors"
            org.json.JSONArray r9 = r6.optJSONArray(r0)     // Catch:{ all -> 0x014b }
            if (r9 == 0) goto L_0x0087
            int r0 = r9.length()     // Catch:{ all -> 0x014b }
            if (r0 <= 0) goto L_0x0087
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x014b }
            r7.<init>()     // Catch:{ all -> 0x014b }
            r2 = 0
        L_0x004e:
            int r0 = r9.length()     // Catch:{ all -> 0x014b }
            if (r2 >= r0) goto L_0x0065
            org.json.JSONObject r1 = r9.getJSONObject(r2)     // Catch:{ all -> 0x014b }
            X.Smd r0 = new X.Smd     // Catch:{ all -> 0x014b }
            r0.<init>()     // Catch:{ all -> 0x014b }
            r0.A00 = r1     // Catch:{ all -> 0x014b }
            r7.add(r0)     // Catch:{ all -> 0x014b }
            int r2 = r2 + 1
            goto L_0x004e
        L_0x0065:
            r11 = 0
            java.util.Iterator r2 = r7.iterator()     // Catch:{ all -> 0x014b }
        L_0x006a:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x014b }
            if (r0 == 0) goto L_0x0083
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x014b }
            X.ThL r0 = (X.C13802ThL) r0     // Catch:{ all -> 0x014b }
            java.lang.String r1 = r0.Bt6()     // Catch:{ all -> 0x014b }
            java.lang.String r0 = "CRITICAL"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x014b }
            if (r0 == 0) goto L_0x006a
            r11 = 1
        L_0x0083:
            if (r12 == 0) goto L_0x00ec
            if (r11 != 0) goto L_0x00ec
        L_0x0087:
            java.lang.String r0 = "data"
            org.json.JSONObject r2 = r6.optJSONObject(r0)     // Catch:{ all -> 0x014b }
            if (r2 == 0) goto L_0x00a2
            java.lang.Class<org.json.JSONObject> r0 = org.json.JSONObject.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ all -> 0x014b }
            java.lang.reflect.Constructor r1 = r8.getConstructor(r0)     // Catch:{ all -> 0x014b }
            java.lang.Object[] r0 = new java.lang.Object[]{r2}     // Catch:{ all -> 0x014b }
            java.lang.Object r2 = r1.newInstance(r0)     // Catch:{ all -> 0x014b }
            goto L_0x0101
        L_0x00a2:
            java.lang.String r2 = r10.getCallName()     // Catch:{ all -> 0x014b }
            java.lang.String r1 = " Response Error: missing or invalid 'data' in response: "
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x014b }
            java.lang.String r1 = X.002.A0g(r2, r1, r0)     // Catch:{ all -> 0x014b }
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()     // Catch:{ all -> 0x014b }
            X.3Ff r2 = new X.3Ff     // Catch:{ all -> 0x014b }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x014b }
            goto L_0x00ff
        L_0x00ba:
            java.lang.String r5 = r10.getCallName()     // Catch:{ all -> 0x014b }
            java.lang.String r4 = " Response Error: "
            java.lang.String r2 = r7.toString()     // Catch:{ all -> 0x014b }
            java.lang.String r1 = " in response: "
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x014b }
            java.lang.String r1 = X.002.A11(r5, r4, r2, r1, r0)     // Catch:{ all -> 0x014b }
            X.Smd r0 = new X.Smd     // Catch:{ all -> 0x014b }
            r0.<init>()     // Catch:{ all -> 0x014b }
            r0.A00 = r7     // Catch:{ all -> 0x014b }
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r0)     // Catch:{ all -> 0x014b }
            X.3Ff r2 = new X.3Ff     // Catch:{ all -> 0x014b }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x014b }
            goto L_0x00ff
        L_0x00df:
            r1 = move-exception
            java.lang.String r0 = "Invalid JSON response from server: "
            java.lang.String r0 = X.002.A0R(r0, r2)     // Catch:{ all -> 0x014b }
            org.json.JSONException r2 = new org.json.JSONException     // Catch:{ all -> 0x014b }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x014b }
            goto L_0x00ff
        L_0x00ec:
            java.lang.String r2 = r10.getCallName()     // Catch:{ all -> 0x014b }
            java.lang.String r1 = " Response Errors: "
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x014b }
            java.lang.String r0 = X.002.A0g(r2, r1, r0)     // Catch:{ all -> 0x014b }
            X.3Ff r2 = new X.3Ff     // Catch:{ all -> 0x014b }
            r2.<init>(r0, r7)     // Catch:{ all -> 0x014b }
        L_0x00ff:
            throw r2     // Catch:{ all -> 0x014b }
        L_0x0100:
            r2 = 0
        L_0x0101:
            r3.close()     // Catch:{ 3Ff -> 0x015b }
            java.lang.String r0 = "X-IG-ANDROID-FROM-DISK-CACHE"
            X.1Fn r0 = r5.A01(r0)
            if (r0 == 0) goto L_0x0148
            java.lang.String r7 = "fresh_cache"
        L_0x010e:
            r36 = 0
            r8 = 1
            java.lang.String r9 = ""
            r10 = 0
            com.facebook.pando.Summary r6 = new com.facebook.pando.Summary
            r12 = r10
            r14 = r10
            r16 = r10
            r18 = r10
            r20 = r10
            r22 = r10
            r24 = r10
            r26 = r10
            r28 = r10
            r30 = r10
            r32 = r10
            r34 = r10
            r37 = r10
            r39 = r10
            r41 = r10
            r43 = r9
            r44 = r10
            r46 = r10
            r48 = r4
            r49 = r9
            r6.<init>(r7, r8, r9, r10, r12, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r37, r39, r41, r43, r44, r46, r48, r49)
            int r1 = r5.A02
            X.3JC r0 = new X.3JC
            r0.<init>(r6, r2, r1)
            return r0
        L_0x0148:
            java.lang.String r7 = "network"
            goto L_0x010e
        L_0x014b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x014d }
        L_0x014d:
            r1 = move-exception
            goto L_0x0157
        L_0x014f:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ 3Ff -> 0x015b }
            r1.<init>(r0)     // Catch:{ 3Ff -> 0x015b }
            goto L_0x015a
        L_0x0157:
            X.1zE.A00(r3, r0)     // Catch:{ 3Ff -> 0x015b }
        L_0x015a:
            throw r1     // Catch:{ 3Ff -> 0x015b }
        L_0x015b:
            r0 = move-exception
            com.google.common.collect.ImmutableList r1 = r0.A00
            X.0qQ.A07(r1)
            X.V1w r0 = new X.V1w
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C239143Fd.then(java.lang.Object):java.lang.Object");
    }

    public C239143Fd(1Ef r1) {
        this.A01 = r1;
    }
}

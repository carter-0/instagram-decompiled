package X;

/* renamed from: X.Vs4  reason: case insensitive filesystem */
public final class C18456Vs4 {
    public final C16775V5i A00;
    public final X5t A01;
    public final 0kX A02;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: X.VQe[]} */
    /* JADX WARNING: type inference failed for: r1v4, types: [X.Vsp, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v3, types: [X.Vsp, java.lang.Object, X.UIK] */
    /* JADX WARNING: type inference failed for: r5v0, types: [X.Vsp, java.lang.Object, X.UIL] */
    /* JADX WARNING: type inference failed for: r1v15, types: [java.lang.Object, X.VQe] */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0090, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0091, code lost:
        r1 = new java.io.IOException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0108, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0109, code lost:
        r1 = new java.io.IOException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0116, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0122, code lost:
        return new X.WH0(r11, r12.A01, (X.C18494Vsp) null, r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012c, code lost:
        return new X.WH0(r11, r12.A01, (X.C18494Vsp) null, "Can't read config");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0116 A[ExcHandler: V1q | IndexOutOfBoundsException (r0v1 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0001] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C13848TiQ A00(X.S7E r11, X.C18456Vs4 r12) {
        /*
            r3 = 0
            java.lang.String r2 = r11.A02     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            X.Vsp r1 = new X.Vsp     // Catch:{ JSONException -> 0x0108, V1q | IndexOutOfBoundsException -> 0x0116 }
            r1.<init>()     // Catch:{ JSONException -> 0x0108, V1q | IndexOutOfBoundsException -> 0x0116 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0108, V1q | IndexOutOfBoundsException -> 0x0116 }
            r0.<init>(r2)     // Catch:{ JSONException -> 0x0108, V1q | IndexOutOfBoundsException -> 0x0116 }
            X.C18494Vsp.A00(r1, r0)     // Catch:{ JSONException -> 0x0108, V1q | IndexOutOfBoundsException -> 0x0116 }
            r3 = r1
            java.lang.String r4 = r1.A03     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            if (r4 == 0) goto L_0x0100
            java.lang.Integer r0 = r1.A02     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            if (r0 == 0) goto L_0x0100
            java.lang.String r0 = "single-context-buckets-table"
            boolean r0 = r4.equals(r0)     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            if (r0 == 0) goto L_0x0097
            X.UIL r5 = new X.UIL     // Catch:{ JSONException -> 0x0090, V1q | IndexOutOfBoundsException -> 0x0116 }
            r5.<init>()     // Catch:{ JSONException -> 0x0090, V1q | IndexOutOfBoundsException -> 0x0116 }
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0090, V1q | IndexOutOfBoundsException -> 0x0116 }
            r9.<init>(r2)     // Catch:{ JSONException -> 0x0090, V1q | IndexOutOfBoundsException -> 0x0116 }
            X.C18494Vsp.A00(r5, r9)     // Catch:{ JSONException -> 0x0090, V1q | IndexOutOfBoundsException -> 0x0116 }
            java.lang.String r0 = "context"
            org.json.JSONObject r0 = r9.optJSONObject(r0)     // Catch:{ JSONException -> 0x0090, V1q | IndexOutOfBoundsException -> 0x0116 }
            X.VsN r0 = X.C18471VsN.A00(r0)     // Catch:{ JSONException -> 0x0090, V1q | IndexOutOfBoundsException -> 0x0116 }
            r5.A00 = r0     // Catch:{ JSONException -> 0x0090, V1q | IndexOutOfBoundsException -> 0x0116 }
            java.lang.String r0 = "output"
            r8 = 0
            java.lang.String r0 = r9.optString(r0, r8)     // Catch:{ JSONException -> 0x0090, V1q | IndexOutOfBoundsException -> 0x0116 }
            r5.A01 = r0     // Catch:{ JSONException -> 0x0090, V1q | IndexOutOfBoundsException -> 0x0116 }
            java.lang.String r1 = "table"
            boolean r0 = r9.isNull(r1)     // Catch:{ JSONException -> 0x0090, V1q | IndexOutOfBoundsException -> 0x0116 }
            if (r0 == 0) goto L_0x004d
            r0 = 0
            goto L_0x007c
        L_0x004d:
            org.json.JSONArray r10 = r9.getJSONArray(r1)     // Catch:{ JSONException -> 0x0090, V1q | IndexOutOfBoundsException -> 0x0116 }
            int r7 = r10.length()     // Catch:{ JSONException -> 0x0090, V1q | IndexOutOfBoundsException -> 0x0116 }
            X.VQe[] r6 = new X.C17303VQe[r7]     // Catch:{ JSONException -> 0x0090, V1q | IndexOutOfBoundsException -> 0x0116 }
            r4 = 0
        L_0x0058:
            if (r4 >= r7) goto L_0x0078
            org.json.JSONObject r2 = r10.getJSONObject(r4)     // Catch:{ JSONException -> 0x0090, V1q | IndexOutOfBoundsException -> 0x0116 }
            X.VQe r1 = new X.VQe     // Catch:{ JSONException -> 0x0090, V1q | IndexOutOfBoundsException -> 0x0116 }
            r1.<init>()     // Catch:{ JSONException -> 0x0090, V1q | IndexOutOfBoundsException -> 0x0116 }
            java.lang.String r0 = "bucket"
            java.lang.String r0 = r2.optString(r0, r8)     // Catch:{ JSONException -> 0x0090, V1q | IndexOutOfBoundsException -> 0x0116 }
            r1.A00 = r0     // Catch:{ JSONException -> 0x0090, V1q | IndexOutOfBoundsException -> 0x0116 }
            java.lang.String r0 = "value"
            java.lang.String r0 = r2.optString(r0, r8)     // Catch:{ JSONException -> 0x0090, V1q | IndexOutOfBoundsException -> 0x0116 }
            r1.A01 = r0     // Catch:{ JSONException -> 0x0090, V1q | IndexOutOfBoundsException -> 0x0116 }
            r6[r4] = r1     // Catch:{ JSONException -> 0x0090, V1q | IndexOutOfBoundsException -> 0x0116 }
            int r4 = r4 + 1
            goto L_0x0058
        L_0x0078:
            java.util.List r0 = java.util.Arrays.asList(r6)     // Catch:{ JSONException -> 0x0090, V1q | IndexOutOfBoundsException -> 0x0116 }
        L_0x007c:
            r5.A03 = r0     // Catch:{ JSONException -> 0x0090, V1q | IndexOutOfBoundsException -> 0x0116 }
            java.lang.String r0 = "default"
            java.lang.String r0 = r9.optString(r0, r8)     // Catch:{ JSONException -> 0x0090, V1q | IndexOutOfBoundsException -> 0x0116 }
            r5.A02 = r0     // Catch:{ JSONException -> 0x0090, V1q | IndexOutOfBoundsException -> 0x0116 }
            X.0kX r1 = r12.A02     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            X.X5t r0 = r12.A01     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            X.UIJ r4 = new X.UIJ     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            r4.<init>((X.S7E) r11, (X.X5t) r0, (X.UIL) r5, (X.0kX) r1)     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            return r4
        L_0x0090:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            goto L_0x0115
        L_0x0097:
            java.lang.String r0 = "multi-output-resolved"
            boolean r0 = r4.equals(r0)     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            if (r0 == 0) goto L_0x00cc
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x010f, V1q | IndexOutOfBoundsException -> 0x0116 }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x010f, V1q | IndexOutOfBoundsException -> 0x0116 }
            X.UIK r2 = new X.UIK     // Catch:{ JSONException -> 0x010f, V1q | IndexOutOfBoundsException -> 0x0116 }
            r2.<init>()     // Catch:{ JSONException -> 0x010f, V1q | IndexOutOfBoundsException -> 0x0116 }
            X.C18494Vsp.A00(r2, r1)     // Catch:{ JSONException -> 0x010f, V1q | IndexOutOfBoundsException -> 0x0116 }
            java.lang.String r0 = "monitors"
            java.util.List r0 = X.W0X.A00(r0, r1)     // Catch:{ JSONException -> 0x010f, V1q | IndexOutOfBoundsException -> 0x0116 }
            r2.A00 = r0     // Catch:{ JSONException -> 0x010f, V1q | IndexOutOfBoundsException -> 0x0116 }
            java.util.List r0 = X.W0X.A03(r1)     // Catch:{ JSONException -> 0x010f, V1q | IndexOutOfBoundsException -> 0x0116 }
            r2.A01 = r0     // Catch:{ JSONException -> 0x010f, V1q | IndexOutOfBoundsException -> 0x0116 }
            java.lang.String r0 = "values"
            java.util.List r0 = X.W0X.A01(r0, r1)     // Catch:{ JSONException -> 0x010f, V1q | IndexOutOfBoundsException -> 0x0116 }
            r2.A02 = r0     // Catch:{ JSONException -> 0x010f, V1q | IndexOutOfBoundsException -> 0x0116 }
            X.0kX r1 = r12.A02     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            X.X5t r0 = r12.A01     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            X.UIH r4 = new X.UIH     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            r4.<init>(r11, r0, r2, r1)     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            return r4
        L_0x00cc:
            java.lang.String r0 = "table"
            boolean r0 = r4.equals(r0)     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            if (r0 == 0) goto L_0x00e2
            X.UIN r2 = X.C18093VlN.A01(r2)     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            X.0kX r1 = r12.A02     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            X.X5t r0 = r12.A01     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            X.UIJ r4 = new X.UIJ     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            r4.<init>((X.S7E) r11, (X.X5t) r0, (X.UIN) r2, (X.0kX) r1)     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            return r4
        L_0x00e2:
            java.lang.String r0 = "dense"
            boolean r0 = r4.equals(r0)     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            if (r0 == 0) goto L_0x00f8
            X.UIM r2 = X.C18093VlN.A00(r2)     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            X.0kX r1 = r12.A02     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            X.X5t r0 = r12.A01     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            X.UII r4 = new X.UII     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            r4.<init>(r11, r0, r2, r1)     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            return r4
        L_0x00f8:
            java.lang.String r0 = "Unknown config type"
            X.V1q r1 = new X.V1q     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            r1.<init>(r0, r4)     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            goto L_0x0115
        L_0x0100:
            java.lang.String r0 = "Can't identify config"
            X.V1q r1 = new X.V1q     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            goto L_0x0115
        L_0x0108:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            goto L_0x0115
        L_0x010f:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
        L_0x0115:
            throw r1     // Catch:{ IOException -> 0x0123, V1q | IndexOutOfBoundsException -> 0x0116 }
        L_0x0116:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            X.X5t r0 = r12.A01
            X.WH0 r4 = new X.WH0
            r4.<init>(r11, r0, r3, r1)
            return r4
        L_0x0123:
            X.X5t r1 = r12.A01
            java.lang.String r0 = "Can't read config"
            X.WH0 r4 = new X.WH0
            r4.<init>(r11, r1, r3, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18456Vs4.A00(X.S7E, X.Vs4):X.TiQ");
    }

    public C18456Vs4(C16775V5i v5i, X5t x5t, 0kX r3) {
        this.A00 = v5i;
        this.A02 = r3;
        this.A01 = x5t;
    }
}

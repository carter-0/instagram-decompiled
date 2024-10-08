package X;

/* renamed from: X.5Jl  reason: invalid class name and case insensitive filesystem */
public abstract class C283825Jl {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass5Jm parseFromJson(X.16F r5) {
        /*
            r2 = 0
            X.0qQ.A0B(r5, r2)
            X.5Jm r0 = new X.5Jm     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            r0.<init>()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r3 == r1) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x0158
        L_0x0016:
            X.16L r3 = r5.A1J()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r3 == r1) goto L_0x0159
            java.lang.String r3 = r5.A0q()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            r5.A1J()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            java.lang.String r1 = "promotion_id"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            r4 = 0
            if (r1 == 0) goto L_0x0043
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r3 == r1) goto L_0x003a
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
        L_0x003a:
            X.0qQ.A0B(r4, r2)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            r0.A05 = r4     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
        L_0x003f:
            r5.A0z()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x0016
        L_0x0043:
            java.lang.String r1 = "id"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r1 == 0) goto L_0x005a
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r3 == r1) goto L_0x0057
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
        L_0x0057:
            r0.A03 = r4     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x003f
        L_0x005a:
            java.lang.String r1 = "logging_data"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r1 == 0) goto L_0x0071
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r3 == r1) goto L_0x006e
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
        L_0x006e:
            r0.A04 = r4     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x003f
        L_0x0071:
            java.lang.String r1 = "max_impressions"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r1 == 0) goto L_0x008c
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            X.16L r1 = X.16L.A0I     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r3 != r1) goto L_0x0089
            int r1 = r5.A1D()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
        L_0x0089:
            r0.A02 = r4     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x003f
        L_0x008c:
            java.lang.String r1 = "triggers"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r1 == 0) goto L_0x00ba
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r3 != r1) goto L_0x00b7
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            r4.<init>()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
        L_0x00a1:
            X.16L r3 = r5.A1J()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r3 == r1) goto L_0x00b7
            java.lang.String r1 = r5.A1Q()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            com.instagram.quickpromotion.intf.Trigger r1 = X.2cY.A00(r1)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r1 == 0) goto L_0x00a1
            r4.add(r1)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x00a1
        L_0x00b7:
            r0.A07 = r4     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x003f
        L_0x00ba:
            java.lang.String r1 = "is_uncancelable"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r1 == 0) goto L_0x00ca
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            r0.A0B = r1     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x003f
        L_0x00ca:
            java.lang.String r1 = "creatives"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r1 == 0) goto L_0x00f5
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r3 != r1) goto L_0x00f1
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            r4.<init>()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
        L_0x00df:
            X.16L r3 = r5.A1J()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r3 == r1) goto L_0x00f1
            X.4V7 r1 = X.AnonymousClass4VC.parseFromJson(r5)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r1 == 0) goto L_0x00df
            r4.add(r1)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x00df
        L_0x00f1:
            r0.A06 = r4     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x003f
        L_0x00f5:
            java.lang.String r1 = "contextual_filters"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r1 == 0) goto L_0x0105
            X.4VK r1 = X.AnonymousClass4VJ.parseFromJson(r5)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            r0.A00 = r1     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x003f
        L_0x0105:
            java.lang.String r1 = "template"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r1 == 0) goto L_0x0118
            X.4VA r1 = X.AnonymousClass4VH.parseFromJson(r5)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            X.0qQ.A0B(r1, r2)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            r0.A01 = r1     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x003f
        L_0x0118:
            java.lang.String r1 = "is_server_force_pass"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r1 == 0) goto L_0x0128
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            r0.A0A = r1     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x003f
        L_0x0128:
            java.lang.String r1 = "client_side_dry_run"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r1 == 0) goto L_0x0138
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            r0.A08 = r1     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x003f
        L_0x0138:
            java.lang.String r1 = "disable_logging_to_qp_tables"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r1 == 0) goto L_0x0148
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            r0.A09 = r1     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x003f
        L_0x0148:
            java.lang.String r1 = "bypass_surface_delay"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            if (r1 == 0) goto L_0x003f
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            r0.A0C = r1     // Catch:{ IOException -> 0x0161, Exception -> 0x015a }
            goto L_0x003f
        L_0x0158:
            r0 = 0
        L_0x0159:
            return r0
        L_0x015a:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x0161:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C283825Jl.parseFromJson(X.16F):X.5Jm");
    }
}

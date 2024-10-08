package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;

/* renamed from: X.4lh  reason: invalid class name and case insensitive filesystem */
public abstract class C272954lh {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C272964li parseFromJson(X.16F r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.4li r0 = new X.4li     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            r0.<init>()     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            if (r2 == r1) goto L_0x0016
            r4.A0z()     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            goto L_0x00ea
        L_0x0016:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            if (r2 == r1) goto L_0x00eb
            java.lang.String r2 = r4.A0q()     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            r4.A1J()     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            java.lang.String r1 = "mode"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            if (r1 == 0) goto L_0x0037
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            r0.A08 = r1     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
        L_0x0033:
            r4.A0z()     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            goto L_0x0016
        L_0x0037:
            java.lang.String r1 = "ttl_sec"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            if (r1 == 0) goto L_0x004a
            int r1 = r4.A1D()     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            r0.A02 = r1     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            goto L_0x0033
        L_0x004a:
            java.lang.String r1 = "last_set_actor_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            r3 = 0
            if (r1 == 0) goto L_0x0062
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            if (r2 == r1) goto L_0x005f
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
        L_0x005f:
            r0.A07 = r3     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            goto L_0x0033
        L_0x0062:
            java.lang.String r1 = "last_set_timestamp_ms"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            if (r1 == 0) goto L_0x0075
            long r1 = r4.A0y()     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            r0.A05 = r1     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            goto L_0x0033
        L_0x0075:
            java.lang.String r1 = "last_set_action_log_type"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            if (r1 == 0) goto L_0x008c
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            if (r2 == r1) goto L_0x0089
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
        L_0x0089:
            r0.A06 = r3     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            goto L_0x0033
        L_0x008c:
            java.lang.String r1 = "last_set_ttl_sec"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            if (r1 == 0) goto L_0x009f
            int r1 = r4.A1D()     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            r0.A00 = r1     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            goto L_0x0033
        L_0x009f:
            java.lang.String r1 = "e2ee_attribution_timestamp_ms"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            if (r1 == 0) goto L_0x00b2
            long r1 = r4.A0y()     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            r0.A04 = r1     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            goto L_0x0033
        L_0x00b2:
            java.lang.String r1 = "view_ttl_sec"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            if (r1 == 0) goto L_0x00ce
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            X.16L r1 = X.16L.A0I     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            if (r2 != r1) goto L_0x00ca
            int r1 = r4.A1D()     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
        L_0x00ca:
            r0.A03 = r3     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            goto L_0x0033
        L_0x00ce:
            java.lang.String r1 = "last_set_view_ttl_sec"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            if (r1 == 0) goto L_0x0033
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            X.16L r1 = X.16L.A0I     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            if (r2 != r1) goto L_0x00e6
            int r1 = r4.A1D()     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
        L_0x00e6:
            r0.A01 = r3     // Catch:{ IOException -> 0x00f3, Exception -> 0x00ec }
            goto L_0x0033
        L_0x00ea:
            r0 = 0
        L_0x00eb:
            return r0
        L_0x00ec:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x00f3:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C272954lh.parseFromJson(X.16F):X.4li");
    }

    public static void A00(17Z r3, C272964li r4) {
        r3.A0c();
        r3.A0S(DatePickerDialogModule.ARG_MODE, r4.A08);
        Integer num = r4.A02;
        if (num != null) {
            r3.A0P("ttl_sec", num.intValue());
        }
        String str = r4.A07;
        if (str != null) {
            r3.A0R("last_set_actor_id", str);
        }
        Long l = r4.A05;
        if (l != null) {
            r3.A0Q("last_set_timestamp_ms", l.longValue());
        }
        String str2 = r4.A06;
        if (str2 != null) {
            r3.A0R("last_set_action_log_type", str2);
        }
        Integer num2 = r4.A00;
        if (num2 != null) {
            r3.A0P("last_set_ttl_sec", num2.intValue());
        }
        Long l2 = r4.A04;
        if (l2 != null) {
            r3.A0Q("e2ee_attribution_timestamp_ms", l2.longValue());
        }
        Integer num3 = r4.A03;
        if (num3 != null) {
            r3.A0P("view_ttl_sec", num3.intValue());
        }
        Integer num4 = r4.A01;
        if (num4 != null) {
            r3.A0P("last_set_view_ttl_sec", num4.intValue());
        }
        r3.A0Z();
    }
}

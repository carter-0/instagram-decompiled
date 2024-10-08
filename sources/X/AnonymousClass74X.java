package X;

/* renamed from: X.74X  reason: invalid class name */
public final class AnonymousClass74X {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v9, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v11, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass74W parseFromJson(X.16F r9) {
        /*
            r3 = 0
            X.0qQ.A0B(r9, r3)
            X.74W r1 = new X.74W     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            r1.<init>()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            X.16L r0 = r9.A11()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            X.16L r2 = X.16L.A0D     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            if (r0 == r2) goto L_0x0016
            r9.A0z()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            goto L_0x0198
        L_0x0016:
            X.16L r0 = r9.A1J()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            X.16L r8 = X.16L.A09     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            if (r0 == r8) goto L_0x0199
            java.lang.String r4 = r9.A0q()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            r9.A1J()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            java.lang.String r0 = "thread"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            if (r0 == 0) goto L_0x0037
            X.8wd r0 = X.C370528wc.parseFromJson(r9)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            r1.A02 = r0     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
        L_0x0033:
            r9.A0z()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            goto L_0x0016
        L_0x0037:
            java.lang.String r0 = "thread_context_items"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            r5 = 0
            if (r0 == 0) goto L_0x0062
            X.16L r4 = r9.A11()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            if (r4 != r0) goto L_0x005f
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            r5.<init>()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
        L_0x004d:
            X.16L r4 = r9.A1J()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            if (r4 == r0) goto L_0x005f
            X.3Tk r0 = X.C242273Ti.parseFromJson(r9)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            if (r0 == 0) goto L_0x004d
            r5.add(r0)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            goto L_0x004d
        L_0x005f:
            r1.A0B = r5     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            goto L_0x0033
        L_0x0062:
            java.lang.String r0 = "users"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            if (r0 == 0) goto L_0x008e
            X.16L r4 = r9.A11()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            if (r4 != r0) goto L_0x008b
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            r5.<init>()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
        L_0x0077:
            X.16L r4 = r9.A1J()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            if (r4 == r0) goto L_0x008b
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            com.instagram.user.model.User r0 = X.1aC.A00(r9, r3)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            if (r0 == 0) goto L_0x0077
            r5.add(r0)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            goto L_0x0077
        L_0x008b:
            r1.A0C = r5     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            goto L_0x0033
        L_0x008e:
            java.lang.String r0 = "responsiveness_category"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            if (r0 == 0) goto L_0x00a5
            X.16L r4 = r9.A11()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            if (r4 == r0) goto L_0x00a2
            java.lang.String r5 = r9.A1P()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
        L_0x00a2:
            r1.A08 = r5     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            goto L_0x0033
        L_0x00a5:
            java.lang.String r0 = "icebreakers"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            if (r0 == 0) goto L_0x00d0
            X.16L r4 = r9.A11()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            if (r4 != r0) goto L_0x00cc
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            r5.<init>()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
        L_0x00ba:
            X.16L r4 = r9.A1J()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            if (r4 == r0) goto L_0x00cc
            X.4ou r0 = X.C274684ot.parseFromJson(r9)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            if (r0 == 0) goto L_0x00ba
            r5.add(r0)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            goto L_0x00ba
        L_0x00cc:
            r1.A0A = r5     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            goto L_0x0033
        L_0x00d0:
            java.lang.String r0 = "persistent_menu_icebreakers"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            if (r0 == 0) goto L_0x00e0
            X.9IV r0 = X.C242203Ta.parseFromJson(r9)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            r1.A00 = r0     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            goto L_0x0033
        L_0x00e0:
            java.lang.String r0 = "welcome_message"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            if (r0 == 0) goto L_0x00f0
            X.Cte r0 = X.C44653CiX.parseFromJson(r9)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            r1.A01 = r0     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            goto L_0x0033
        L_0x00f0:
            java.lang.String r0 = "reachability_statuses"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            if (r0 == 0) goto L_0x012f
            X.16L r0 = r9.A11()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            if (r0 != r2) goto L_0x012b
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            r7.<init>()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
        L_0x0103:
            X.16L r0 = r9.A1J()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            if (r0 == r8) goto L_0x012a
            java.lang.String r6 = r9.A1P()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            r9.A1J()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            X.16L r4 = r9.A11()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            if (r4 != r0) goto L_0x011c
            r7.put(r6, r5)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            goto L_0x0103
        L_0x011c:
            int r0 = r9.A1D()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            if (r0 == 0) goto L_0x0103
            r7.put(r6, r0)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            goto L_0x0103
        L_0x012a:
            r5 = r7
        L_0x012b:
            r1.A09 = r5     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            goto L_0x0033
        L_0x012f:
            java.lang.String r0 = "has_reached_message_request_limit"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            if (r0 == 0) goto L_0x0143
            boolean r0 = r9.A0d()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            r1.A04 = r0     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            goto L_0x0033
        L_0x0143:
            java.lang.String r0 = "lightweight_intervention_appealable_entity_id"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            if (r0 == 0) goto L_0x015b
            X.16L r4 = r9.A11()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            if (r4 == r0) goto L_0x0157
            java.lang.String r5 = r9.A1P()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
        L_0x0157:
            r1.A07 = r5     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            goto L_0x0033
        L_0x015b:
            java.lang.String r0 = "is_viewer_unconnected"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            if (r0 == 0) goto L_0x016f
            boolean r0 = r9.A0d()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            r1.A06 = r0     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            goto L_0x0033
        L_0x016f:
            java.lang.String r0 = "is_appointment_booking_enabled"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            if (r0 == 0) goto L_0x0183
            boolean r0 = r9.A0d()     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            r1.A05 = r0     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            goto L_0x0033
        L_0x0183:
            java.lang.String r0 = "error"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            if (r0 == 0) goto L_0x0193
            com.instagram.realtimeclient.DirectApiError r0 = com.instagram.realtimeclient.DirectApiError__JsonHelper.parseFromJson((X.16F) r9)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            r1.A03 = r0     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            goto L_0x0033
        L_0x0193:
            X.1XY.A01(r9, r1, r4)     // Catch:{ IOException -> 0x01a1, Exception -> 0x019a }
            goto L_0x0033
        L_0x0198:
            r1 = 0
        L_0x0199:
            return r1
        L_0x019a:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x01a1:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74X.parseFromJson(X.16F):X.74W");
    }
}

package X;

/* renamed from: X.Ej5  reason: case insensitive filesystem */
public abstract class C48720Ej5 {
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a6 A[Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ac A[Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0165  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.app.Activity r21, android.net.Uri r22, com.instagram.common.session.UserSession r23) {
        /*
            r2 = 0
            r17 = 0
            r16 = 0
            r10 = 0
            r9 = r21
            X.0qQ.A0B(r9, r10)
            r8 = 1
            r4 = r22
            r11 = r23
            X.AnonymousClass7TF.A1B(r11, r8, r4)
            java.lang.String r0 = "bloks_screen_params"
            java.lang.String r1 = r4.getQueryParameter(r0)
            java.lang.String r3 = "preloaded_params"
            java.lang.String r7 = "IgBloksScreenQueryDeeplinksHelper"
            r6 = 0
            if (r1 != 0) goto L_0x002d
            r12 = 0
        L_0x0021:
            java.lang.String r0 = "bloks_screen_options"
            java.lang.String r1 = r4.getQueryParameter(r0)
            r19 = 0
            if (r1 == 0) goto L_0x00dd
            goto L_0x00c5
        L_0x002d:
            java.lang.String r0 = "UTF-8"
            java.lang.String r0 = java.net.URLDecoder.decode(r1, r0)     // Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }
            r12.<init>(r0)     // Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }
            java.lang.String r0 = "client_input_params"
            java.lang.String r1 = r12.optString(r0, r2)     // Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }
            if (r1 == 0) goto L_0x0062
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }
            java.util.LinkedHashMap r15 = X.RhO.A00(r0)     // Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }
        L_0x0049:
            java.lang.String r0 = r12.optString(r3, r2)     // Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }
            if (r0 == 0) goto L_0x009d
            java.lang.String r0 = r12.getString(r3)     // Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }
            r5.<init>(r0)     // Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()     // Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }
            int r3 = r5.length()     // Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }
            r1 = 0
            goto L_0x0064
        L_0x0062:
            r15 = r2
            goto L_0x0049
        L_0x0064:
            if (r1 >= r3) goto L_0x0073
            java.lang.Object r0 = r5.get(r1)     // Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }
            X.DbS.A1Y(r0)     // Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }
            r13.add(r0)     // Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }
            int r1 = r1 + 1
            goto L_0x0064
        L_0x0073:
            if (r15 == 0) goto L_0x009d
            java.util.LinkedHashMap r3 = X.AnonymousClass7TE.A1H()     // Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }
            java.util.Iterator r14 = X.AnonymousClass7TF.A0s(r15)     // Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }
        L_0x007d:
            boolean r0 = r14.hasNext()     // Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }
            if (r0 == 0) goto L_0x009e
            java.util.Map$Entry r5 = X.AnonymousClass7TE.A1J(r14)     // Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }
            java.lang.Object r0 = r5.getKey()     // Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }
            boolean r0 = r13.contains(r0)     // Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }
            if (r0 == 0) goto L_0x007d
            java.lang.Object r1 = r5.getKey()     // Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }
            java.lang.Object r0 = r5.getValue()     // Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }
            goto L_0x007d
        L_0x009d:
            r3 = r2
        L_0x009e:
            java.lang.String r0 = "container_config"
            java.lang.String r1 = r12.optString(r0, r2)     // Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }
            if (r1 == 0) goto L_0x00ac
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x00bc, UnsupportedEncodingException -> 0x00b5 }
            goto L_0x00ad
        L_0x00ac:
            r0 = r2
        L_0x00ad:
            r2 = r15
            r16 = r3
            r17 = r0
            r12 = 1
            goto L_0x0021
        L_0x00b5:
            r1 = move-exception
            java.lang.String r0 = "Error decoding client params"
            X.1Kn.A00(r2, r7, r0, r1)
            goto L_0x00c2
        L_0x00bc:
            r1 = move-exception
            java.lang.String r0 = "Error parsing client params to JSON"
            X.1Kn.A00(r2, r7, r0, r1)
        L_0x00c2:
            r12 = 0
            goto L_0x0021
        L_0x00c5:
            java.lang.String r0 = "UTF-8"
            java.lang.String r0 = java.net.URLDecoder.decode(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x00d7 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ UnsupportedEncodingException -> 0x00d7 }
            r5.<init>(r0)     // Catch:{ UnsupportedEncodingException -> 0x00d7 }
            java.lang.String r0 = "is_push"
            boolean r13 = r5.optBoolean(r0, r8)
            goto L_0x00df
        L_0x00d7:
            r1 = move-exception
            java.lang.String r0 = "Error screen screen options"
            X.1Kn.A00(r6, r7, r0, r1)
        L_0x00dd:
            r5 = r6
            r13 = 1
        L_0x00df:
            if (r12 == 0) goto L_0x0115
            if (r17 == 0) goto L_0x0115
            X.4tU r1 = X.RST.A00(r17)
            int r0 = r1.A04
            X.Tf8 r3 = X.C250563lf.A04(r1, r0)
            X.0qQ.A0A(r3)
        L_0x00f0:
            java.lang.String r0 = "app_id"
            java.lang.String r15 = r4.getQueryParameter(r0)
            if (r15 == 0) goto L_0x0165
            r18 = r6
            if (r12 == 0) goto L_0x0100
            r18 = r2
            r19 = r16
        L_0x0100:
            r0 = 0
            r17 = 0
            java.util.LinkedHashMap r12 = X.AnonymousClass7TE.A1H()
            r23 = 1
            r2 = 719983200(0x2aea1260, float:4.15795E-13)
            java.util.BitSet r4 = new java.util.BitSet
            r4.<init>(r10)
            if (r5 == 0) goto L_0x0142
            goto L_0x011b
        L_0x0115:
            X.WF5 r3 = new X.WF5
            r3.<init>(r6, r6, r6, r6)
            goto L_0x00f0
        L_0x011b:
            r4 = 193(0xc1, float:2.7E-43)
            java.lang.String r4 = X.Pxd.A00(r4)     // Catch:{ JSONException -> 0x013c, UnsupportedEncodingException -> 0x0138 }
            long r0 = r5.optLong(r4, r0)     // Catch:{ JSONException -> 0x013c, UnsupportedEncodingException -> 0x0138 }
            java.lang.String r4 = "disk_cache_enabled"
            boolean r23 = r5.optBoolean(r4, r8)     // Catch:{ JSONException -> 0x013c, UnsupportedEncodingException -> 0x0138 }
            java.lang.String r4 = "ttrc_marker_id"
            int r2 = r5.optInt(r4, r2)     // Catch:{ JSONException -> 0x013c, UnsupportedEncodingException -> 0x0138 }
            java.lang.String r4 = "screen_id"
            java.lang.String r17 = r5.optString(r4, r6)     // Catch:{ JSONException -> 0x013c, UnsupportedEncodingException -> 0x0138 }
            goto L_0x0142
        L_0x0138:
            r5 = move-exception
            java.lang.String r4 = "Error decoding screen options"
            goto L_0x013f
        L_0x013c:
            r5 = move-exception
            java.lang.String r4 = "Error parsing screen options to JSON"
        L_0x013f:
            X.1Kn.A00(r6, r7, r4, r5)
        L_0x0142:
            if (r18 != 0) goto L_0x0146
            r18 = r12
        L_0x0146:
            if (r19 != 0) goto L_0x014c
            X.0sm r19 = X.0Yt.A0E()
        L_0x014c:
            X.ShW r14 = new X.ShW
            r20 = r2
            r21 = r0
            r16 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r23)
            X.6Qj r0 = X.C48721Ej6.A00(r11, r8)
            if (r13 == 0) goto L_0x0161
            r14.A02(r9, r3, r0)
            return
        L_0x0161:
            r14.E0s(r9, r3, r0)
            return
        L_0x0165:
            java.lang.IllegalArgumentException r0 = X.DbU.A0h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48720Ej5.A00(android.app.Activity, android.net.Uri, com.instagram.common.session.UserSession):void");
    }
}

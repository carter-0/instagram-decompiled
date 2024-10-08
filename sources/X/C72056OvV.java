package X;

/* renamed from: X.OvV  reason: case insensitive filesystem */
public final class C72056OvV implements AnonymousClass68Z {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public C72056OvV(Object obj, Object obj2, Object obj3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3) {
        this.A00 = i3;
        this.A04 = obj3;
        this.A06 = str;
        this.A09 = str2;
        this.A05 = obj2;
        this.A0A = str3;
        this.A0B = str4;
        this.A0C = str5;
        this.A03 = obj;
        this.A0D = str6;
        this.A07 = str7;
        this.A01 = i;
        this.A02 = i2;
        this.A08 = str8;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: org.json.JSONArray} */
    /* JADX WARNING: type inference failed for: r13v4, types: [X.Pww] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r30) {
        /*
            r29 = this;
            r3 = r29
            r1 = r30
            int r0 = r3.A00
            if (r0 == 0) goto L_0x00e7
            r0 = 0
            java.lang.Object r14 = r3.A04
            byte[] r14 = (byte[]) r14
            java.lang.String r13 = r3.A06
            java.lang.String r12 = r3.A09
            java.lang.Object r11 = r3.A05
            java.util.List r11 = (java.util.List) r11
            java.lang.String r10 = r3.A0A
            java.lang.String r9 = r3.A0B
            java.lang.String r8 = r3.A0C
            java.lang.Object r7 = r3.A03
            X.PrM r7 = (X.C74233PrM) r7
            java.lang.String r15 = r3.A0D
            java.lang.String r6 = r3.A07
            int r5 = r3.A01
            int r4 = r3.A02
            java.lang.String r3 = r3.A08
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r2 = r1.first
            X.NAb r2 = (X.C68314NAb) r2
            java.lang.Object r1 = r1.second
            X.67N r1 = (X.AnonymousClass67N) r1
            java.lang.String r2 = X.C304566Ea.A03(r2, r14)
            java.lang.String r14 = "Failed to resolve preview ID"
            X.17k.A07(r2, r14)
            if (r13 == 0) goto L_0x006e
            if (r12 == 0) goto L_0x006e
            org.json.JSONObject r0 = X.DbS.A11()
            java.lang.String r14 = "music_preview_url"
            r0.put(r14, r13)     // Catch:{ JSONException -> 0x0049 }
        L_0x0049:
            r16 = 1
            java.lang.String r13 = "music_preview_url_type"
            r0.put(r13, r12)     // Catch:{ JSONException -> 0x0050 }
        L_0x0050:
            java.lang.String r13 = "music_preview_country_restrictions"
            if (r11 != 0) goto L_0x0055
            goto L_0x0068
        L_0x0055:
            org.json.JSONArray r12 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0070 }
            r12.<init>()     // Catch:{ JSONException -> 0x0070 }
            java.util.Iterator r14 = r11.iterator()     // Catch:{ JSONException -> 0x0070 }
        L_0x005e:
            boolean r11 = r14.hasNext()     // Catch:{ JSONException -> 0x0070 }
            if (r11 == 0) goto L_0x006a
            X.DbT.A1W(r14, r12)     // Catch:{ JSONException -> 0x0070 }
            goto L_0x005e
        L_0x0068:
            java.lang.Object r12 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x0070 }
        L_0x006a:
            r0.put(r13, r12)     // Catch:{ JSONException -> 0x0070 }
            goto L_0x0070
        L_0x006e:
            r16 = 0
        L_0x0070:
            org.json.JSONObject r11 = X.DbS.A11()
            X.Nl6 r12 = X.C69424Nl6.A0E
            java.lang.String r13 = "target_type"
            java.lang.String r12 = r12.toString()     // Catch:{ JSONException -> 0x007f }
            r11.put(r13, r12)     // Catch:{ JSONException -> 0x007f }
        L_0x007f:
            org.json.JSONObject r12 = X.DbS.A11()
            org.json.JSONObject r13 = X.DbS.A11()
            java.lang.String r14 = "title"
            if (r10 != 0) goto L_0x008d
            java.lang.Object r10 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x0090 }
        L_0x008d:
            r13.put(r14, r10)     // Catch:{ JSONException -> 0x0090 }
        L_0x0090:
            java.lang.String r10 = "subtitle"
            if (r9 != 0) goto L_0x0096
            java.lang.Object r9 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x0099 }
        L_0x0096:
            r13.put(r10, r9)     // Catch:{ JSONException -> 0x0099 }
        L_0x0099:
            java.lang.String r9 = "body"
            r12.put(r9, r13)     // Catch:{ JSONException -> 0x009e }
        L_0x009e:
            org.json.JSONObject r10 = X.DbS.A11()
            java.lang.String r9 = "cta"
            if (r8 != 0) goto L_0x00a8
            java.lang.Object r8 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x00ab }
        L_0x00a8:
            r10.put(r9, r8)     // Catch:{ JSONException -> 0x00ab }
        L_0x00ab:
            java.lang.String r8 = "default_cta"
            r12.put(r8, r10)     // Catch:{ JSONException -> 0x00b0 }
        L_0x00b0:
            java.lang.String r8 = "music_preview"
            if (r16 != 0) goto L_0x00b6
            java.lang.Object r0 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x00b9 }
        L_0x00b6:
            r12.put(r8, r0)     // Catch:{ JSONException -> 0x00b9 }
        L_0x00b9:
            java.lang.String r8 = "XMSGXmaSingleContent"
            java.lang.String r0 = "__typename"
            r12.put(r0, r8)     // Catch:{ JSONException -> 0x00c0 }
        L_0x00c0:
            java.lang.String r0 = "content"
            r11.put(r0, r12)     // Catch:{ JSONException -> 0x00c5 }
        L_0x00c5:
            X.N28 r8 = new X.N28
            r8.<init>(r11)
            java.lang.String r0 = "instagram_xma_external_link_client_send"
            X.4fh r0 = X.AnonymousClass6F9.A00(r0)
            X.OxQ r11 = new X.OxQ
            r19 = r5
            r20 = r4
            r16 = r2
            r17 = r6
            r18 = r3
            r14 = r7
            r12 = r1
            r13 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.1aU r0 = X.1aU.A07(r11, r0)
            return r0
        L_0x00e7:
            java.lang.Object r14 = r3.A04
            X.6Ea r14 = (X.C304566Ea) r14
            java.lang.Object r13 = r3.A05
            java.lang.String r12 = r3.A08
            java.lang.String r11 = r3.A09
            java.lang.Object r10 = r3.A03
            java.lang.String r9 = r3.A0A
            java.lang.String r8 = r3.A0B
            java.lang.String r7 = r3.A0C
            java.lang.String r6 = r3.A0D
            java.lang.String r5 = r3.A06
            int r4 = r3.A01
            int r2 = r3.A02
            java.lang.String r3 = r3.A07
            X.PrM r1 = (X.C74233PrM) r1
            boolean r0 = r1 instanceof X.C72176Oxl
            if (r0 == 0) goto L_0x010e
            X.1aU r0 = X.C72176Oxl.A00(r1)
            return r0
        L_0x010e:
            X.1aU r0 = X.C71991OuP.A00(r14)
            r28 = 1
            X.OvV r14 = new X.OvV
            r22 = r7
            r23 = r6
            r24 = r5
            r25 = r3
            r26 = r4
            r27 = r2
            r20 = r9
            r21 = r8
            r18 = r12
            r19 = r11
            r16 = r10
            r17 = r13
            r15 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.1aU r0 = r0.A0M(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72056OvV.apply(java.lang.Object):java.lang.Object");
    }
}

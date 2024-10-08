package X;

/* renamed from: X.OvH  reason: case insensitive filesystem */
public final class C72042OvH implements AnonymousClass68Z {
    public final /* synthetic */ C72204OyU A00;
    public final /* synthetic */ C254763t0 A01;
    public final /* synthetic */ C254793t3 A02;
    public final /* synthetic */ 0r1 A03;
    public final /* synthetic */ boolean A04;

    public C72042OvH(C72204OyU oyU, C254763t0 r2, C254793t3 r3, 0r1 r4, boolean z) {
        this.A00 = oyU;
        this.A01 = r2;
        this.A04 = z;
        this.A02 = r3;
        this.A03 = r4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r36) {
        /*
            r35 = this;
            r4 = r36
            X.3xP r4 = (X.C257443xP) r4
            r3 = 0
            X.0qQ.A0B(r4, r3)
            boolean r0 = r4.A06()
            if (r0 == 0) goto L_0x02f1
            r5 = r35
            X.OyU r7 = r5.A00
            com.instagram.common.session.UserSession r0 = r7.A04
            r34 = r0
            X.2Dm r1 = X.2L2.A00(r34)
            X.3t0 r0 = r5.A01
            r33 = r0
            com.instagram.model.direct.DirectThreadKey r0 = X.C327647Bq.A00(r33)
            X.3U9 r1 = r1.B33(r0)
            if (r1 == 0) goto L_0x02f1
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.LinkedHashSet r2 = X.DbS.A0y()
            java.lang.Object r0 = r4.A03()
            X.NH7 r0 = (X.NH7) r0
            java.util.List r0 = r0.A00
            java.util.Iterator r8 = r0.iterator()
        L_0x003c:
            boolean r0 = r8.hasNext()
            r11 = 1
            if (r0 == 0) goto L_0x0069
            java.lang.Object r6 = r8.next()
            X.OMx r6 = (X.C70825OMx) r6
            java.lang.String r0 = r6.A06
            if (r0 == 0) goto L_0x0050
            r9.add(r0)
        L_0x0050:
            java.lang.String r0 = r6.A07
            if (r0 == 0) goto L_0x003c
            java.lang.Boolean r0 = r6.A04
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r11)
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = r6.A07
            if (r0 == 0) goto L_0x0064
            r2.add(r0)
            goto L_0x003c
        L_0x0064:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0069:
            boolean r0 = X.DbT.A1b(r9)
            if (r0 != 0) goto L_0x0079
            java.lang.Integer r6 = r7.A08
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r6 != r0) goto L_0x02f1
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x02f1
        L_0x0079:
            X.C370748x0.A00()
            X.MdY r20 = X.C66843Mdb.A01(r34)
            java.lang.Long r0 = r1.C6I()
            long r30 = r0.longValue()
            X.7Qc r19 = new X.7Qc
            r0 = r19
            r0.<init>(r1)
            java.lang.Integer r13 = r7.A08
            int r0 = r13.intValue()
            if (r0 == 0) goto L_0x0158
            java.lang.String r1 = "RESHARES"
        L_0x0099:
            X.3t3 r6 = r5.A02
            boolean r8 = r5.A04
            java.util.Map r0 = r7.A0B
            java.lang.Object r0 = r0.get(r6)
            X.Jw4 r0 = (X.C61066Jw4) r0
            r14 = 0
            if (r0 == 0) goto L_0x00df
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00df
            java.util.ListIterator r7 = X.C51968G9o.A18(r0)
        L_0x00b2:
            boolean r0 = r7.hasPrevious()
            if (r0 == 0) goto L_0x0155
            java.lang.Object r6 = r7.previous()
            r0 = r6
            X.Oa5 r0 = (X.C71039Oa5) r0
            if (r8 == 0) goto L_0x00cb
            java.lang.Boolean r0 = r0.A03()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r11)
            if (r0 == 0) goto L_0x00b2
        L_0x00cb:
            X.Oa5 r6 = (X.C71039Oa5) r6
            if (r6 == 0) goto L_0x00df
            long r6 = r6.A01()
            long r6 = X.AnonymousClass7TE.A0P(r6)
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            java.lang.String r14 = r0.toString()
        L_0x00df:
            r12 = 2
            java.lang.String r0 = "ArmadilloExpressEncryptedBackupReverbImpl"
            java.lang.String r6 = "PERMANENT_MEDIA"
            boolean r18 = r1.equals(r6)
            java.lang.String r7 = "RESHARES"
            r6 = 0
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r3)
            if (r18 == 0) goto L_0x0143
            java.lang.String[] r12 = new java.lang.String[r12]
            java.lang.String r10 = "PHOTO"
            r12[r3] = r10
            java.lang.String r10 = "VIDEO"
        L_0x00f9:
            r12[r11] = r10
            java.util.List r25 = X.0sr.A1P(r12)
        L_0x00ff:
            java.lang.String r23 = java.lang.String.valueOf(r30)
            if (r14 == 0) goto L_0x013d
            java.lang.Long r10 = X.AnonymousClass7TE.A10(r14)
            if (r10 == 0) goto L_0x013d
            long r10 = r10.longValue()
        L_0x010f:
            java.lang.Long r22 = java.lang.Long.valueOf(r10)
            r27 = 20
            r21 = 0
            r28 = 1000(0x3e8, double:4.94E-321)
            r24 = r21
            r26 = r9
            X.0eP r9 = X.C66840MdY.A04(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.Object r10 = r9.A00
            X.Mda r10 = (X.C66842Mda) r10
            if (r10 == 0) goto L_0x022f
            java.util.List r9 = r10.A01
            r23 = r9
            boolean r9 = r23.isEmpty()
            if (r9 != 0) goto L_0x022f
            java.util.List r11 = r10.A00
            X.0qQ.A0A(r11)
            boolean r9 = X.AnonymousClass7TE.A1b(r11)
            if (r9 == 0) goto L_0x017c
            goto L_0x015c
        L_0x013d:
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x010f
        L_0x0143:
            boolean r10 = r1.equals(r7)
            if (r10 == 0) goto L_0x0152
            java.lang.String[] r12 = new java.lang.String[r12]
            java.lang.String r10 = "SHARE_IG_MEDIA"
            r12[r3] = r10
            java.lang.String r10 = "SHARE_IG_CLIPS"
            goto L_0x00f9
        L_0x0152:
            r25 = 0
            goto L_0x00ff
        L_0x0155:
            r6 = r14
            goto L_0x00cb
        L_0x0158:
            java.lang.String r1 = "PERMANENT_MEDIA"
            goto L_0x0099
        L_0x015c:
            java.lang.Object r9 = r11.get(r3)     // Catch:{ JSONException -> 0x0176 }
            X.DbS.A1Y(r9)     // Catch:{ JSONException -> 0x0176 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ JSONException -> 0x0176 }
            org.json.JSONObject r10 = X.C66580MXl.A17(r9)     // Catch:{ JSONException -> 0x0176 }
            java.lang.String r9 = "hasMoreBefore"
            java.lang.String r10 = r10.getString(r9)     // Catch:{ JSONException -> 0x0176 }
            java.lang.String r9 = "true"
            boolean r6 = r10.equals(r9)     // Catch:{ JSONException -> 0x0176 }
            goto L_0x017c
        L_0x0176:
            r10 = move-exception
            java.lang.String r9 = "cannot parse incoming json"
            X.0KC.A0J(r0, r9, r10)
        L_0x017c:
            int r15 = r23.size()
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            r16 = r21
            r10 = 0
        L_0x0187:
            java.lang.String r12 = "null cannot be cast to non-null type com.instagram.direct.msys.reverb.ReverbMessage"
            if (r10 >= r15) goto L_0x01cb
            r9 = r23
            java.lang.Object r9 = r9.get(r10)
            X.0qQ.A0C(r9, r12)
            com.instagram.direct.msys.reverb.ReverbMessage r9 = (com.instagram.direct.msys.reverb.ReverbMessage) r9
            r12 = r20
            X.ONE r12 = r12.A02
            r22 = r12
            java.lang.String r12 = r9.getMessageId()
            boolean r32 = r2.contains(r12)
            r27 = r22
            r28 = r19
            r29 = r9
            X.0eP r9 = r27.A00(r28, r29, r30, r32)
            java.lang.Object r12 = r9.A00
            X.3su r12 = (X.C254703su) r12
            if (r12 == 0) goto L_0x01c5
            r14.add(r12)
        L_0x01b7:
            if (r16 != 0) goto L_0x01bf
            if (r12 == 0) goto L_0x01c2
            java.lang.String r16 = r12.A0g()
        L_0x01bf:
            int r10 = r10 + 1
            goto L_0x0187
        L_0x01c2:
            r16 = r21
            goto L_0x01bf
        L_0x01c5:
            java.lang.String r9 = "failed to build direct message from reverb message"
            X.0KC.A0C(r0, r9)
            goto L_0x01b7
        L_0x01cb:
            X.0qQ.A0A(r11)
            boolean r9 = X.AnonymousClass7TE.A1b(r11)
            if (r9 == 0) goto L_0x01ed
            java.lang.Object r9 = r11.get(r3)     // Catch:{ JSONException -> 0x01e7 }
            X.DbS.A1Y(r9)     // Catch:{ JSONException -> 0x01e7 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ JSONException -> 0x01e7 }
            org.json.JSONObject r10 = X.C66580MXl.A17(r9)     // Catch:{ JSONException -> 0x01e7 }
            java.lang.String r9 = "hasMoreBefore"
            r10.getString(r9)     // Catch:{ JSONException -> 0x01e7 }
            goto L_0x01ed
        L_0x01e7:
            r10 = move-exception
            java.lang.String r9 = "cannot parse incoming json"
            X.0KC.A0J(r0, r9, r10)
        L_0x01ed:
            if (r18 == 0) goto L_0x020c
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r14.iterator()
        L_0x01f7:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0238
            java.lang.Object r1 = r7.next()
            r0 = r1
            X.3su r0 = (X.C254703su) r0
            X.1Xj r0 = r0.A0s
            if (r0 == 0) goto L_0x01f7
            r9.add(r1)
            goto L_0x01f7
        L_0x020c:
            boolean r0 = r1.equals(r7)
            if (r0 == 0) goto L_0x022f
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r14.iterator()
        L_0x021a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0238
            java.lang.Object r1 = r7.next()
            r0 = r1
            X.3su r0 = (X.C254703su) r0
            java.lang.String r0 = r0.A1o
            if (r0 == 0) goto L_0x021a
            r9.add(r1)
            goto L_0x021a
        L_0x022f:
            X.0sn r1 = X.0sn.A00
            r0 = r17
            X.0eP r0 = X.AnonymousClass7TE.A1L(r1, r0)
            goto L_0x023c
        L_0x0238:
            X.0eP r0 = X.C66581MXm.A14(r9, r6)
        L_0x023c:
            java.lang.Object r7 = r0.A00
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r0 = r0.A01
            boolean r1 = X.AnonymousClass7TE.A1a(r0)
            X.0r1 r0 = r5.A03
            r0.A00 = r1
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r13 != r0) goto L_0x02ac
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r7)
            java.util.Iterator r10 = r7.iterator()
        L_0x0256:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x02ae
            X.3su r9 = X.C66580MXl.A0a(r10)
            X.OMx r5 = new X.OMx
            r5.<init>()
            java.lang.String r0 = r9.A0g()
            r5.A08 = r0
            java.lang.String r0 = r9.A0f()
            r5.A07 = r0
            java.lang.String r0 = r9.A1u
            X.0qQ.A0B(r0, r3)
            r5.A09 = r0
            long r0 = r9.C7c()
            r5.A00 = r0
            X.1Xj r0 = r9.A0s
            r5.A02 = r0
            if (r0 == 0) goto L_0x02aa
            com.instagram.common.typedurl.ImageUrl r0 = r0.A1Q()
        L_0x0288:
            r5.A01 = r0
            boolean r0 = r9.A1S()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A03 = r0
            java.lang.Long r0 = r9.A1K
            r5.A05 = r0
            java.lang.String r0 = r9.A0f()
            boolean r0 = X.00k.A0u(r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A04 = r0
            r6.add(r5)
            goto L_0x0256
        L_0x02aa:
            r0 = 0
            goto L_0x0288
        L_0x02ac:
            X.0sn r6 = X.0sn.A00
        L_0x02ae:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r13 != r0) goto L_0x02bd
            if (r8 == 0) goto L_0x02bd
            r0 = r33
            java.lang.String r1 = r0.A00
            r0 = r34
            X.AnonymousClass7OQ.A03(r0, r1, r7)
        L_0x02bd:
            java.lang.Object r7 = r4.A03()
            X.NH7 r7 = (X.NH7) r7
            java.lang.Object r0 = r4.A03()
            X.NH7 r0 = (X.NH7) r0
            java.util.List r0 = r0.A00
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x02d3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02e8
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.OMx r0 = (X.C70825OMx) r0
            java.lang.String r0 = r0.A06
            if (r0 != 0) goto L_0x02d3
            r5.add(r1)
            goto L_0x02d3
        L_0x02e8:
            java.util.ArrayList r0 = X.00k.A0S(r6, r5)
            X.0qQ.A0B(r0, r3)
            r7.A00 = r0
        L_0x02f1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72042OvH.apply(java.lang.Object):java.lang.Object");
    }
}

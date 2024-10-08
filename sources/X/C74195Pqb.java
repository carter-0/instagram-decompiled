package X;

/* renamed from: X.Pqb  reason: case insensitive filesystem */
public final class C74195Pqb extends 0Yg implements 0sL {
    public final /* synthetic */ OZY A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74195Pqb(OZY ozy, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        super(2);
        this.A00 = ozy;
        this.A02 = str;
        this.A01 = str2;
        this.A04 = str3;
        this.A05 = z;
        this.A06 = z2;
        this.A03 = str4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00eb, code lost:
        if (r2.equals(r4) != false) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r26, java.lang.Object r27) {
        /*
            r25 = this;
            r0 = r26
            X.0lg r0 = (X.0lg) r0
            boolean r7 = X.AnonymousClass7TE.A1a(r27)
            r9 = 0
            X.0qQ.A0B(r0, r9)
            r8 = r25
            boolean r6 = r8.A06
            java.lang.String r5 = r8.A04
            java.lang.String r12 = r8.A03
            java.lang.String r4 = r8.A01
            boolean r11 = r8.A05
            X.6EB r13 = new X.6EB
            r13.<init>(r0)
            org.json.JSONObject r3 = X.DbS.A11()
            X.6EC r2 = X.AnonymousClass6EB.A02
            java.lang.String r0 = "is_vanish_mode"
            r2.A01(r0, r3, r6)
            java.lang.String r1 = "save_type"
            r3.put(r1, r5)     // Catch:{ JSONException -> 0x002e }
            goto L_0x003d
        L_0x002e:
            r0 = 1194(0x4aa, float:1.673E-42)
            java.lang.String r10 = X.C273654mx.A00(r0)
            r0 = 1266(0x4f2, float:1.774E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0KC.A0C(r10, r0)
        L_0x003d:
            java.lang.Boolean r14 = X.AnonymousClass7TE.A0v()
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r11)
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r6)
            java.lang.String r18 = "ARMADILLO_NOTIFICATIONS_MESSAGE_SAVED"
            r17 = 0
            java.lang.String r0 = "is_bg_account"
            r2.A01(r0, r3, r7)
            java.lang.String r10 = "skips_sync"
            r2.A01(r10, r3, r9)
            java.lang.String r21 = r3.toString()
            r19 = r17
            r20 = r17
            r22 = r17
            r23 = r4
            r24 = r12
            X.AnonymousClass6EB.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.OZY r2 = r8.A00
            com.instagram.common.session.UserSession r2 = r2.A00
            X.65S r9 = X.AnonymousClass6ED.A00(r2)
            java.lang.String r8 = r8.A02
            r12 = r7 ^ 1
            java.lang.String r7 = X.AnonymousClass6ED.A02(r11, r6)
            X.65T r3 = r9.A02
            boolean r2 = r3.A06
            if (r2 == 0) goto L_0x009f
            if (r4 == 0) goto L_0x009f
            boolean r2 = r3.A03
            if (r2 == 0) goto L_0x009f
            java.lang.String r2 = r3.A01
            if (r2 != 0) goto L_0x00e7
            r3.A01 = r4
        L_0x008a:
            com.facebook.quicklog.reliability.UserFlowLogger r10 = r3.A05
            long r2 = r3.A04
            X.9J6 r6 = X.AnonymousClass65T.A0A
            java.lang.String r4 = r6.A01
            r10.flowMarkPoint(r2, r4)
            r10.flowAnnotate(r2, r1, r5)
            java.lang.String r6 = r6.A00
            java.lang.String r4 = "c"
            r10.flowAnnotateWithCrucialData(r2, r4, r6)
        L_0x009f:
            X.65V r4 = r9.A01
            boolean r2 = r4.A01
            if (r2 == 0) goto L_0x00e1
            if (r8 == 0) goto L_0x00e1
            java.lang.Long r2 = X.AnonymousClass65V.A00(r4, r8)
            if (r2 == 0) goto L_0x00e1
            long r2 = r2.longValue()
            com.facebook.quicklog.reliability.UserFlowLogger r6 = r4.A00
            X.9J6 r8 = X.AnonymousClass65V.A05
            java.lang.String r4 = r8.A01
            r6.flowMarkPoint(r2, r4)
            r4 = r12 ^ 1
            if (r4 == 0) goto L_0x00e4
            java.lang.String r4 = "1"
        L_0x00c0:
            r6.flowAnnotateWithCrucialData(r2, r0, r4)
            java.lang.String r4 = "ae"
            java.lang.String r0 = "1"
            r6.flowAnnotateWithCrucialData(r2, r4, r0)
            if (r7 == 0) goto L_0x00d7
            int r0 = r7.length()
            if (r0 == 0) goto L_0x00d7
            java.lang.String r0 = "feature_tags"
            r6.flowAnnotate(r2, r0, r7)
        L_0x00d7:
            r6.flowAnnotate(r2, r1, r5)
            java.lang.String r1 = r8.A00
            java.lang.String r0 = "c"
            r6.flowAnnotateWithCrucialData(r2, r0, r1)
        L_0x00e1:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00e4:
            java.lang.String r4 = "0"
            goto L_0x00c0
        L_0x00e7:
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x009f
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74195Pqb.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}

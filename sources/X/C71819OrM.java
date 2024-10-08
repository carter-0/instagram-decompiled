package X;

/* renamed from: X.OrM  reason: case insensitive filesystem */
public final class C71819OrM implements 2IR {
    public final /* synthetic */ C329847Kl A00;
    public final /* synthetic */ String A01;

    public final void onFailure(Throwable th) {
    }

    public C71819OrM(C329847Kl r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (X.AnonymousClass4k9.A00(r14).A08() == false) goto L_0x001f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r22) {
        /*
            r21 = this;
            r10 = r22
            java.util.List r10 = (java.util.List) r10
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            r9 = r21
            X.7Kl r5 = r9.A00
            com.instagram.common.session.UserSession r14 = r5.A0K
            boolean r0 = X.AnonymousClass7OG.A00(r14)
            if (r0 == 0) goto L_0x001f
            X.4kA r0 = X.AnonymousClass4k9.A00(r14)
            boolean r1 = r0.A08()
            r0 = 1
            if (r1 != 0) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            r4 = 0
            java.lang.String r12 = "suggestedReplyLogger"
            java.lang.String r3 = "sayt"
            if (r0 == 0) goto L_0x005a
            X.McN r0 = r5.A03
            if (r0 != 0) goto L_0x0035
            java.lang.String r12 = "quickReplyManager"
        L_0x002d:
            X.0qQ.A0F(r12)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0035:
            java.lang.String r11 = r9.A01
            java.util.ArrayList r1 = r0.A03(r11)
            android.content.Context r0 = r5.A0J
            java.util.ArrayList r0 = X.C71058Oab.A01(r0, r14, r11, r1)
            r6.addAll(r0)
            int r8 = r6.size()
            if (r8 <= 0) goto L_0x005b
            X.OWQ r7 = r5.A09
            if (r7 == 0) goto L_0x002d
            X.3tr r2 = X.C255273tr.A08
            int r1 = X.DbX.A05(r11)
            java.lang.String r0 = r5.A0D
            r7.A02(r2, r0, r1)
            goto L_0x005b
        L_0x005a:
            r8 = 0
        L_0x005b:
            int r1 = r6.size()
            r0 = 3
            r7 = 1
            if (r1 >= r0) goto L_0x00bb
            if (r10 == 0) goto L_0x00bb
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x00bb
            X.0Tu r2 = X.DbS.A0J(r14, r4)
            r0 = 36316194755579993(0x81056300001059, double:3.029846024782989E-306)
            boolean r0 = X.182.A06(r2, r14, r0)
            if (r0 == 0) goto L_0x00bb
            X.OWQ r2 = r5.A09
            if (r2 == 0) goto L_0x002d
            X.3tr r15 = X.C255273tr.A07
            java.lang.String r9 = r9.A01
            int r1 = X.DbX.A05(r9)
            java.lang.String r0 = r5.A0D
            r2.A02(r15, r0, r1)
            int r2 = r10.size()
            android.content.Context r13 = r5.A0J
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r10.iterator()
        L_0x0099:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r0 = r10.next()
            X.Ptp r0 = (X.C74375Ptp) r0
            java.lang.String r19 = r0.B8R()
            java.lang.String r20 = r0.getTitle()
            java.lang.Integer r16 = X.AnonymousClass05K.A01
            r17 = r9
            r18 = r3
            X.OGH r0 = X.C71058Oab.A00(r13, r14, r15, r16, r17, r18, r19, r20)
            r1.add(r0)
            goto L_0x0099
        L_0x00bb:
            r2 = 0
            goto L_0x00c0
        L_0x00bd:
            r6.addAll(r1)
        L_0x00c0:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x00e7
            X.7Hp r9 = r5.A0L
            if (r8 > 0) goto L_0x00cb
            r7 = 0
        L_0x00cb:
            boolean r0 = r9.A02(r7)
            if (r0 != 0) goto L_0x00ed
            if (r8 <= 0) goto L_0x00dc
            X.OWQ r1 = r5.A09
            if (r1 == 0) goto L_0x002d
            X.3tr r0 = X.C255273tr.A08
            r1.A01(r0, r3)
        L_0x00dc:
            if (r2 <= 0) goto L_0x00e7
            X.OWQ r1 = r5.A09
            if (r1 == 0) goto L_0x002d
            X.3tr r0 = X.C255273tr.A07
            r1.A01(r0, r3)
        L_0x00e7:
            X.7Hp r0 = r5.A0L
            r0.A00()
            return
        L_0x00ed:
            if (r8 <= 0) goto L_0x0107
            X.OTm r0 = r5.A04
            if (r0 != 0) goto L_0x00f7
            java.lang.String r12 = "bottomSheetController"
            goto L_0x002d
        L_0x00f7:
            X.3tr r7 = X.C255273tr.A08
            X.0qQ.A0B(r7, r4)
            r0.A00 = r7
            X.OWQ r1 = r5.A09
            if (r1 == 0) goto L_0x002d
            java.lang.String r0 = r5.A0D
            r1.A03(r7, r3, r0, r8)
        L_0x0107:
            if (r2 <= 0) goto L_0x016d
            X.0Tu r7 = X.0Tu.A06
            r0 = 36316194755579993(0x81056300001059, double:3.029846024782989E-306)
            boolean r0 = X.182.A06(r7, r14, r0)
            if (r0 == 0) goto L_0x016d
            X.OWQ r7 = r5.A09
            if (r7 == 0) goto L_0x002d
            X.3tr r1 = X.C255273tr.A07
            java.lang.String r0 = r5.A0D
            r7.A03(r1, r3, r0, r2)
            X.OBx r8 = r5.A06
            if (r8 != 0) goto L_0x0129
            java.lang.String r12 = "previousReplyLogger"
            goto L_0x002d
        L_0x0129:
            java.lang.String r7 = r14.A06
            java.util.List r0 = r5.A0N
            java.lang.String r4 = X.C51966G9m.A1G(r0, r4)
            java.lang.String r3 = r5.A0D
            X.0wc r1 = r8.A01
            java.lang.String r0 = "smart_suggestion_impression"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            if (r4 == 0) goto L_0x016d
            if (r3 == 0) goto L_0x016d
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x016d
            X.91i r1 = r8.A00
            java.lang.String r0 = "suggestion_type"
            r2.A8M(r1, r0)
            java.lang.Long r1 = X.DbV.A0q(r7)
            java.lang.String r0 = "page_or_business_id"
            r2.A9F(r0, r1)
            java.lang.Long r1 = X.DbV.A0q(r4)
            java.lang.String r0 = "consumer_id"
            r2.A9F(r0, r1)
            java.lang.String r0 = "request_id"
            r2.AAJ(r0, r3)
            java.lang.String r1 = "INSTAGRAM"
            java.lang.String r0 = "channel"
            r2.AAJ(r0, r1)
            r2.Cgf()
        L_0x016d:
            r1 = 20
            X.PmD r0 = new X.PmD
            r0.<init>(r5, r1)
            X.C329847Kl.A02(r5, r6, r0)
            r9.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71819OrM.onSuccess(java.lang.Object):void");
    }
}

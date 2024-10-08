package X;

/* renamed from: X.IxI  reason: case insensitive filesystem */
public final class C58771IxI extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58771IxI(Object obj, Object obj2, String str, int i, boolean z) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A04 = z;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00cd, code lost:
        r2.A03(r0, r1);
        r2.A02(X.SQ1.A00(r3), "logging_policy");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r0 = (com.facebookpay.logging.LoggingContext) r11.A02;
        X.C51971G9r.A1B(r2, r0);
        r2.A02(X.SQ1.A00(r0), "logging_policy");
        r1 = r11.A03;
        r0 = "view_name";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0020, code lost:
        r2.A06(r0, r1);
        r2.A03(X.AnonymousClass000.A00(3421), java.lang.Boolean.valueOf(r11.A04));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0032, code lost:
        r12.A0N(r2, "event_payload");
        r0 = (java.util.Map) r11.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003b, code lost:
        if (r0 == null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x020c, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
        r12.A0x(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
        return r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 1: goto L_0x0041;
                case 2: goto L_0x0075;
                case 3: goto L_0x0093;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x00b0;
                case 7: goto L_0x00db;
                case 8: goto L_0x00e4;
                case 9: goto L_0x0124;
                case 10: goto L_0x016f;
                case 11: goto L_0x01bb;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.1Ln r12 = (X.1Ln) r12
            X.QII r2 = new X.QII
            r2.<init>()
        L_0x000c:
            java.lang.Object r0 = r11.A02
            com.facebookpay.logging.LoggingContext r0 = (com.facebookpay.logging.LoggingContext) r0
            X.C51971G9r.A1B(r2, r0)
            X.GkD r1 = X.SQ1.A00(r0)
            java.lang.String r0 = "logging_policy"
            r2.A02(r1, r0)
            java.lang.String r1 = r11.A03
            java.lang.String r0 = "view_name"
        L_0x0020:
            r2.A06(r0, r1)
            boolean r0 = r11.A04
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 3421(0xd5d, float:4.794E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A03(r0, r1)
        L_0x0032:
            java.lang.String r0 = "event_payload"
            r12.A0N(r2, r0)
            java.lang.Object r0 = r11.A01
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x0040
            r12.A0x(r0)
        L_0x0040:
            return r12
        L_0x0041:
            X.1Ln r12 = (X.1Ln) r12
            X.QHw r2 = new X.QHw
            r2.<init>()
            java.lang.Object r0 = r11.A02
            com.facebookpay.logging.LoggingContext r0 = (com.facebookpay.logging.LoggingContext) r0
            X.C51971G9r.A1B(r2, r0)
            java.lang.String r1 = r11.A03
            if (r1 != 0) goto L_0x0055
            java.lang.String r1 = ""
        L_0x0055:
            java.lang.String r0 = "receiver_id"
            r2.A06(r0, r1)
            boolean r0 = r11.A04
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 233(0xe9, float:3.27E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            r2.A03(r0, r1)
            r0 = 663(0x297, float:9.29E-43)
            java.lang.String r1 = X.Pxd.A00(r0)
            java.lang.String r0 = "view_name"
            r2.A06(r0, r1)
            goto L_0x0032
        L_0x0075:
            X.1Ln r12 = (X.1Ln) r12
            X.QIH r2 = new X.QIH
            r2.<init>()
            java.lang.Object r3 = r11.A02
            com.facebookpay.logging.LoggingContext r3 = (com.facebookpay.logging.LoggingContext) r3
            X.C51971G9r.A1B(r2, r3)
            java.lang.String r1 = r11.A03
            java.lang.String r0 = "target_name"
            r2.A06(r0, r1)
            boolean r0 = r11.A04
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "otc_toggle_state_on"
            goto L_0x00cd
        L_0x0093:
            X.1Ln r12 = (X.1Ln) r12
            X.GkO r2 = new X.GkO
            r2.<init>()
            java.lang.Object r0 = r11.A02
            com.facebookpay.logging.LoggingContext r0 = (com.facebookpay.logging.LoggingContext) r0
            X.C51971G9r.A1B(r2, r0)
            X.GkD r1 = X.SQ1.A00(r0)
            java.lang.String r0 = "logging_policy"
            r2.A02(r1, r0)
            java.lang.String r1 = r11.A03
            java.lang.String r0 = "target_name"
            goto L_0x0020
        L_0x00b0:
            X.1Ln r12 = (X.1Ln) r12
            X.QIH r2 = new X.QIH
            r2.<init>()
            java.lang.Object r3 = r11.A02
            com.facebookpay.logging.LoggingContext r3 = (com.facebookpay.logging.LoggingContext) r3
            X.C51971G9r.A1B(r2, r3)
            java.lang.String r1 = r11.A03
            java.lang.String r0 = "view_name"
            r2.A06(r0, r1)
            boolean r0 = r11.A04
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_default_otc_toggle_state_on"
        L_0x00cd:
            r2.A03(r0, r1)
            X.GkD r1 = X.SQ1.A00(r3)
            java.lang.String r0 = "logging_policy"
            r2.A02(r1, r0)
            goto L_0x0032
        L_0x00db:
            X.1Ln r12 = (X.1Ln) r12
            X.GkO r2 = new X.GkO
            r2.<init>()
            goto L_0x000c
        L_0x00e4:
            java.util.HashMap r12 = (java.util.HashMap) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            r1 = 1050253722(0x3e99999a, float:0.3)
            com.facebook.cvat.ctaudioeligibilitychecker.CTAudioEligibilityChecker r0 = new com.facebook.cvat.ctaudioeligibilitychecker.CTAudioEligibilityChecker
            r0.<init>(r12, r1)
            java.lang.String r4 = r11.A03
            boolean r2 = r0.analyzeAudioEligibility(r4)
            java.lang.Object r1 = r11.A02
            X.LMA r1 = (X.LMA) r1
            if (r2 == 0) goto L_0x011b
            boolean r0 = r11.A04
            if (r0 == 0) goto L_0x011b
            java.lang.Object r3 = r11.A01
            com.instagram.common.session.UserSession r2 = r1.A00
            r1 = 10
            X.J6O r0 = new X.J6O
            r0.<init>(r3, r1)
            X.H8K r1 = new X.H8K
            r1.<init>(r2, r4, r0)
            X.0nO r0 = X.0nY.A00()
            r0.ATE(r1)
            goto L_0x020a
        L_0x011b:
            java.lang.Object r0 = r11.A01
            X.0sP r0 = (X.0sP) r0
            X.C51968G9o.A1O(r0, r2)
            goto L_0x020a
        L_0x0124:
            X.JwA r12 = (X.C61072JwA) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Object r1 = r12.A02
            java.util.List r1 = (java.util.List) r1
            boolean r6 = r11.A04
            if (r6 == 0) goto L_0x0157
            java.lang.String r5 = r11.A03
            java.lang.Object r4 = r11.A01
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x013e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0161
            java.lang.Object r1 = r2.next()
            X.GlE r1 = (X.C53266GlE) r1
            java.lang.String r0 = r1.A00
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 == 0) goto L_0x0153
            r1 = r4
        L_0x0153:
            r3.add(r1)
            goto L_0x013e
        L_0x0157:
            java.lang.Object r0 = r11.A01
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            java.util.ArrayList r3 = X.00k.A0S(r1, r0)
        L_0x0161:
            int r1 = r12.A01
            if (r6 != 0) goto L_0x0167
            int r1 = r1 + 1
        L_0x0167:
            r0 = 8
            X.JwA r12 = new X.JwA
            r12.<init>((int) r1, (java.util.List) r3, (int) r0)
            return r12
        L_0x016f:
            X.9IV r12 = (X.AnonymousClass9IV) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Object r2 = r12.A01
            X.9J4 r2 = (X.AnonymousClass9J4) r2
            java.lang.Object r0 = r2.A02
            X.9JO r0 = (X.AnonymousClass9JO) r0
            java.lang.String r1 = r0.A04
            java.lang.String r0 = r11.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01b9
            java.lang.Object r1 = r2.A01
            X.2pg r0 = X.C230472pg.SPONSORED
            if (r1 != r0) goto L_0x01b9
            boolean r0 = r11.A04
            if (r0 == 0) goto L_0x0197
            java.lang.Object r1 = r2.A05
            X.2pc r0 = X.C230432pc.FEED
            if (r1 != r0) goto L_0x01b9
        L_0x0197:
            java.lang.Object r1 = r11.A01
            java.util.Set r1 = (java.util.Set) r1
            if (r1 == 0) goto L_0x01a5
            java.lang.Object r0 = r2.A04
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x01b9
        L_0x01a5:
            java.lang.Object r1 = r11.A02
            java.util.Set r1 = (java.util.Set) r1
            if (r1 == 0) goto L_0x01b3
            java.lang.Object r0 = r2.A04
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x01b9
        L_0x01b3:
            r0 = 1
        L_0x01b4:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
            return r12
        L_0x01b9:
            r0 = 0
            goto L_0x01b4
        L_0x01bb:
            X.1Xj r12 = (X.1Xj) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            boolean r3 = r11.A04
            java.lang.Object r2 = r11.A02
            X.Uqz r2 = (X.C16236Uqz) r2
            if (r3 == 0) goto L_0x0212
            X.C16236Uqz.A02(r2)
        L_0x01cc:
            java.lang.Object r0 = r11.A01
            X.N8v r0 = (X.C68282N8v) r0
            java.lang.Long r1 = r0.A02
            java.lang.String r0 = java.lang.String.valueOf(r1)
            X.1Xj r5 = X.C254423sS.A02(r12, r0)
            X.326 r4 = r2.A03
            java.lang.String r7 = java.lang.String.valueOf(r1)
            if (r3 == 0) goto L_0x020f
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r6 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.APPROVED
        L_0x01e4:
            X.X9C r1 = r2.A04
            X.Vuf r0 = r1.Bz5()
            com.instagram.user.model.Product r0 = r0.A08
            X.0qQ.A0A(r0)
            java.lang.String r8 = r0.A0H
            X.Vuf r0 = r1.Bz5()
            com.instagram.user.model.Product r0 = r0.A08
            X.0qQ.A0A(r0)
            com.instagram.user.model.User r0 = r0.A0B
            if (r0 == 0) goto L_0x020d
            java.lang.String r9 = X.AnonymousClass3ZA.A00(r0)
        L_0x0202:
            X.0qQ.A0A(r9)
            java.lang.String r10 = r11.A03
            r4.A00(r5, r6, r7, r8, r9, r10)
        L_0x020a:
            X.0gF r12 = X.C60340gF.A00
            return r12
        L_0x020d:
            r9 = 0
            goto L_0x0202
        L_0x020f:
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r6 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.DECLINED
            goto L_0x01e4
        L_0x0212:
            X.C16236Uqz.A00(r12, r2)
            goto L_0x01cc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58771IxI.invoke(java.lang.Object):java.lang.Object");
    }
}

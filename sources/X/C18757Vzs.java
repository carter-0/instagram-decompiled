package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Vzs  reason: case insensitive filesystem */
public final class C18757Vzs {
    public final V1Z A00;
    public final V1W A01;
    public final V1Y A02;
    public final V1X A03;
    public final 0wc A04;
    public final UserSession A05;
    public final C15356Ub7 A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public C18757Vzs(V1Z v1z, V1W v1w, V1Y v1y, V1X v1x, AnonymousClass0iw r6, UserSession userSession, C15356Ub7 ub7, String str, String str2, String str3) {
        0qQ.A0B(userSession, 1);
        C51974G9v.A0d(3, str, v1w, v1x, v1y);
        0qQ.A0B(v1z, 7);
        this.A04 = AnonymousClass0kN.A01(r6, userSession);
        this.A05 = userSession;
        this.A09 = str;
        this.A01 = v1w;
        this.A03 = v1x;
        this.A02 = v1y;
        this.A00 = v1z;
        this.A07 = str2;
        this.A08 = str3;
        this.A06 = ub7;
    }

    public static final C14933UFw A00(C18757Vzs vzs) {
        0bb r3 = new 0bb();
        C15356Ub7 ub7 = vzs.A06;
        r3.A04("scroll_depth_height", Double.valueOf((double) ub7.A00));
        r3.A04(C273654mx.A00(3486), Double.valueOf((double) C66582MXn.A00(ub7.A03)));
        return r3;
    }

    public static void A01(AnonymousClass0Ac r2, AnonymousClass0Ac r3, 0Aj r4, C18757Vzs vzs) {
        r4.AAJ("shopping_session_id", vzs.A09);
        r4.AAJ("navigation_chain", AnonymousClass1QI.A00.A02.A00);
        r4.A8M(r2, "analytics_module");
        r4.A8M(r3, "analytics_component");
        r4.A8M(V1X.RECON_DESTINATION, "analytics_page");
        r4.A8M(vzs.A01, "analytics_referral_experience");
        r4.A8M(vzs.A03, "analytics_referral_page");
        r4.A8M(vzs.A02, "analytics_referral_module");
        r4.A8M(vzs.A00, "analytics_referral_component");
        r4.AAK(A00(vzs), "scroll_logging_info");
        String str = vzs.A07;
        if (str != null) {
            r4.AAJ(C273654mx.A00(799), str);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        if (r12 != null) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x011e, code lost:
        if (r12 != null) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0120, code lost:
        r1 = r12.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0124, code lost:
        r1 = X.C13992Tns.A0F(r3, r8, r1);
        r0 = "signal_type";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.V1Z r6, X.V1Y r7, X.C61069Jw7 r8, X.1Xj r9, com.instagram.user.model.Product r10, com.instagram.user.model.User r11, java.lang.Integer r12, java.util.Map r13) {
        /*
            r5 = this;
            X.AnonymousClass7TG.A1N(r7, r6)
            r0 = 3
            X.AnonymousClass7TF.A1E(r8, r0, r13)
            X.0wc r1 = r5.A04
            java.lang.String r0 = "commerce_reconsideration_impression"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x003e
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r13)
            A01(r7, r6, r3, r5)
            java.lang.String r1 = r5.A08
            if (r1 == 0) goto L_0x002a
            r0 = 1548(0x60c, float:2.169E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.AAJ(r0, r1)
        L_0x002a:
            int r4 = r6.ordinal()
            r0 = 179(0xb3, float:2.51E-43)
            r1 = 0
            if (r4 == r0) goto L_0x0073
            switch(r4) {
                case 82: goto L_0x006b;
                case 113: goto L_0x00fa;
                case 254: goto L_0x003f;
                default: goto L_0x0036;
            }
        L_0x0036:
            java.lang.String r0 = "extra_data"
            r3.A9H(r0, r2)
            r3.Cgf()
        L_0x003e:
            return
        L_0x003f:
            if (r10 == 0) goto L_0x0069
            java.lang.String r0 = r10.A0H
            if (r0 == 0) goto L_0x0069
            java.lang.Long r4 = X.AnonymousClass7TE.A10(r0)
        L_0x0049:
            java.lang.String r0 = "product_id"
            r3.A9F(r0, r4)
            if (r10 == 0) goto L_0x0067
            com.instagram.user.model.User r0 = r10.A0B
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r0)
            if (r0 == 0) goto L_0x0067
            java.lang.Long r4 = X.AnonymousClass7TE.A10(r0)
        L_0x005e:
            java.lang.String r0 = "merchant_id"
            r3.A9F(r0, r4)
            if (r12 == 0) goto L_0x0124
            goto L_0x0120
        L_0x0067:
            r4 = r1
            goto L_0x005e
        L_0x0069:
            r4 = r1
            goto L_0x0049
        L_0x006b:
            java.lang.String r1 = java.lang.String.valueOf(r12)
            java.lang.String r0 = "position"
            goto L_0x012a
        L_0x0073:
            if (r10 == 0) goto L_0x00f8
            java.lang.String r0 = r10.A0H
            if (r0 == 0) goto L_0x00f8
            java.lang.Long r4 = X.AnonymousClass7TE.A10(r0)
        L_0x007d:
            java.lang.String r0 = "product_id"
            r3.A9F(r0, r4)
            if (r10 == 0) goto L_0x0094
            com.instagram.user.model.User r0 = r10.A0B
            if (r0 == 0) goto L_0x0094
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r0)
            if (r0 == 0) goto L_0x0094
            java.lang.Long r4 = X.AnonymousClass7TE.A10(r0)
            if (r4 != 0) goto L_0x00a8
        L_0x0094:
            if (r9 == 0) goto L_0x00a2
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r9)
            if (r0 == 0) goto L_0x00a2
            java.lang.Long r4 = X.C51972G9s.A0h(r0)
            if (r4 != 0) goto L_0x00a8
        L_0x00a2:
            if (r11 == 0) goto L_0x00f6
            java.lang.Long r4 = X.C51972G9s.A0h(r11)
        L_0x00a8:
            java.lang.String r0 = "merchant_id"
            r3.A9F(r0, r4)
            if (r12 == 0) goto L_0x00f4
            java.lang.String r0 = r12.toString()
        L_0x00b3:
            java.lang.String r4 = X.C13992Tns.A0F(r3, r8, r0)
            java.lang.String r0 = "signal_type"
            r3.AAJ(r0, r4)
            java.lang.String r0 = X.C51969G9p.A0u(r9)
            X.C51965G9l.A1I(r3, r0)
            if (r9 == 0) goto L_0x00f2
            X.1iA r0 = r9.BR7()
            java.lang.String r4 = r0.name()
        L_0x00cd:
            java.lang.String r0 = "m_t"
            r3.AAJ(r0, r4)
            if (r9 == 0) goto L_0x00f0
            com.instagram.common.session.UserSession r0 = r5.A05
            java.lang.String r0 = X.C231122qu.A07(r0, r9)
            if (r0 == 0) goto L_0x00f0
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
        L_0x00e0:
            X.C51965G9l.A1D(r3, r0)
            if (r9 == 0) goto L_0x00ed
            com.instagram.model.mediatype.ProductType r0 = r9.A1v()
            if (r0 == 0) goto L_0x00ed
            java.lang.String r1 = r0.A00
        L_0x00ed:
            java.lang.String r0 = "media_product_type"
            goto L_0x012a
        L_0x00f0:
            r0 = r1
            goto L_0x00e0
        L_0x00f2:
            r4 = r1
            goto L_0x00cd
        L_0x00f4:
            r0 = r1
            goto L_0x00b3
        L_0x00f6:
            r4 = r1
            goto L_0x00a8
        L_0x00f8:
            r4 = r1
            goto L_0x007d
        L_0x00fa:
            if (r10 == 0) goto L_0x0131
            java.lang.String r0 = r10.A0H
            if (r0 == 0) goto L_0x0131
            java.lang.Long r4 = X.AnonymousClass7TE.A10(r0)
        L_0x0104:
            java.lang.String r0 = "product_id"
            r3.A9F(r0, r4)
            if (r10 == 0) goto L_0x012f
            com.instagram.user.model.User r0 = r10.A0B
            if (r0 == 0) goto L_0x012f
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r0)
            if (r0 == 0) goto L_0x012f
            java.lang.Long r4 = X.AnonymousClass7TE.A10(r0)
        L_0x0119:
            java.lang.String r0 = "merchant_id"
            r3.A9F(r0, r4)
            if (r12 == 0) goto L_0x0124
        L_0x0120:
            java.lang.String r1 = r12.toString()
        L_0x0124:
            java.lang.String r1 = X.C13992Tns.A0F(r3, r8, r1)
            java.lang.String r0 = "signal_type"
        L_0x012a:
            r3.AAJ(r0, r1)
            goto L_0x0036
        L_0x012f:
            r4 = r1
            goto L_0x0119
        L_0x0131:
            r4 = r1
            goto L_0x0104
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18757Vzs.A02(X.V1Z, X.V1Y, X.Jw7, X.1Xj, com.instagram.user.model.Product, com.instagram.user.model.User, java.lang.Integer, java.util.Map):void");
    }
}

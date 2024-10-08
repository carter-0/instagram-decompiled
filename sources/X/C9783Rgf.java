package X;

/* renamed from: X.Rgf  reason: case insensitive filesystem */
public abstract class C9783Rgf {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C60340gF A00(X.C307896Rx r27, X.AnonymousClass6Tm r28) {
        /*
            r10 = 0
            r15 = 1
            r0 = r28
            java.lang.Object r6 = r0.A03(r10)
            X.DbS.A1Y(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = X.DbT.A0p(r0, r15)
            X.0qQ.A07(r2)
            X.4tV r2 = (X.C276544tV) r2
            X.0lg r0 = X.C308206Td.A0B(r27)
            boolean r1 = r0 instanceof com.instagram.common.session.UserSession
            if (r1 != 0) goto L_0x0046
            r7 = 0
            X.FEe r2 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            androidx.fragment.app.FragmentActivity r1 = X.C308206Td.A04(r27)
            X.0lg r0 = X.C308206Td.A0B(r27)
            com.instagram.simplewebview.SimpleWebViewConfig r5 = new com.instagram.simplewebview.SimpleWebViewConfig
            r8 = r7
            r9 = r7
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r16 = r10
            r17 = r15
            r18 = r15
            r19 = r10
            r20 = r10
            r21 = r10
            r5.<init>((java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (boolean) r10, (boolean) r11, (boolean) r12, (boolean) r13, (boolean) r14, (boolean) r15, (boolean) r16, (boolean) r17, (boolean) r18, (boolean) r19, (boolean) r20, (boolean) r21)
            r2.A02(r1, r0, r5)
        L_0x0043:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0046:
            java.lang.String r22 = r2.A0D()
            java.lang.String r3 = ""
            if (r22 != 0) goto L_0x0050
            r22 = r3
        L_0x0050:
            java.lang.String r4 = "BKBloksActionCommerceOpenIABImpl"
            int r1 = r22.length()
            if (r1 == 0) goto L_0x005e
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r22)
            if (r1 != 0) goto L_0x0065
        L_0x005e:
            java.lang.String r1 = "Unexpected empty L0 ad Id received"
            X.0KC.A0C(r4, r1)
            r22 = 0
        L_0x0065:
            java.lang.String r24 = r2.A0I()
            if (r24 != 0) goto L_0x006d
            r24 = r3
        L_0x006d:
            int r1 = r24.length()
            if (r1 != 0) goto L_0x0078
            java.lang.String r1 = "Unexpected empty ad tracking token received"
            X.0KC.A0C(r4, r1)
        L_0x0078:
            r1 = 40
            int r3 = r2.A03(r1, r10)
            if (r3 != 0) goto L_0x0085
            java.lang.String r1 = "Unexpected empty impression time received"
            X.0KC.A0C(r4, r1)
        L_0x0085:
            java.lang.Integer r21 = java.lang.Integer.valueOf(r3)
            r1 = 38
            java.util.List r1 = r2.A0N(r1)
            X.0qQ.A07(r1)
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r5 = r1.iterator()
        L_0x009a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x00f6
            java.lang.String r4 = X.AnonymousClass7TE.A18(r5)
            int r1 = r4.hashCode()
            switch(r1) {
                case -2080755477: goto L_0x00b1;
                case -1790114975: goto L_0x00b4;
                case -1611506145: goto L_0x00bf;
                case 59186711: goto L_0x00ca;
                case 516888859: goto L_0x00d5;
                case 1150650008: goto L_0x00e0;
                case 2145144580: goto L_0x00eb;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            X.RFY r1 = X.RFY.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
        L_0x00ad:
            r3.add(r1)
            goto L_0x009a
        L_0x00b1:
            java.lang.String r1 = "IAB_META_CHECKOUT"
            goto L_0x00ed
        L_0x00b4:
            java.lang.String r1 = "IAB_META_CHECKOUT_METAPAYMENTS_SDK"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x00ab
            X.RFY r1 = X.RFY.IAB_META_CHECKOUT_METAPAYMENTS_SDK
            goto L_0x00ad
        L_0x00bf:
            java.lang.String r1 = "IAB_META_CHECKOUT_FIRMLY"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x00ab
            X.RFY r1 = X.RFY.IAB_META_CHECKOUT_FIRMLY
            goto L_0x00ad
        L_0x00ca:
            java.lang.String r1 = "IAB_NO_ADS_CONTEXT"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x00ab
            X.RFY r1 = X.RFY.IAB_NO_ADS_CONTEXT
            goto L_0x00ad
        L_0x00d5:
            java.lang.String r1 = "IAB_WATCH_AND_BROWSE_WEB_TO_WA"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x00ab
            X.RFY r1 = X.RFY.IAB_WATCH_AND_BROWSE_WEB_TO_WA
            goto L_0x00ad
        L_0x00e0:
            java.lang.String r1 = "IAB_STICKY_UTM_PARAMS"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x00ab
            X.RFY r1 = X.RFY.IAB_STICKY_UTM_PARAMS
            goto L_0x00ad
        L_0x00eb:
            java.lang.String r1 = "IAB_META_CHECKOUT_SHOPIFY_SCA"
        L_0x00ed:
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x00ab
            X.RFY r1 = X.RFY.IAB_META_CHECKOUT_SDK
            goto L_0x00ad
        L_0x00f6:
            com.google.common.collect.ImmutableList r20 = X.DbU.A0K(r3)
            X.0sm r26 = X.0Yt.A0E()
            r12 = 0
            r1 = 36
            java.util.List r25 = r2.A0N(r1)
            X.0qQ.A07(r25)
            com.facebook.iabadscontext.MetaCheckoutExperienceType r1 = com.facebook.iabadscontext.MetaCheckoutExperienceType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            com.facebook.iabadscontext.IABAdsMetaCheckoutDataExtension r13 = new com.facebook.iabadscontext.IABAdsMetaCheckoutDataExtension
            r13.<init>(r1)
            com.facebook.iabadscontext.IABAdsContext r11 = new com.facebook.iabadscontext.IABAdsContext
            r14 = r12
            r15 = r12
            r16 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r23 = r12
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            androidx.fragment.app.FragmentActivity r2 = X.C308206Td.A04(r27)
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2EG r4 = X.2EG.A0U
            X.SUL r1 = new X.SUL
            r5 = r6
            r6 = r10
            r3 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            X.0iw r0 = X.C308206Td.A08(r27)
            java.lang.String r0 = r0.getModuleName()
            r1.A0S = r0
            r1.A0B = r11
            r1.A0A()
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9783Rgf.A00(X.6Rx, X.6Tm):X.0gF");
    }
}

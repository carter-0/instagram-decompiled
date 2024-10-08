package X;

/* renamed from: X.6Xb  reason: invalid class name and case insensitive filesystem */
public abstract class C309136Xb {
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r1 == 0) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(android.content.Context r6, com.instagram.common.session.UserSession r7, com.instagram.feed.media.CreativeConfigIntf r8) {
        /*
            r5 = 0
            r4 = 1
            if (r8 == 0) goto L_0x003b
            boolean r0 = X.C284745Nt.A08(r6, r8)
            if (r0 != r4) goto L_0x003b
            java.lang.String r0 = r8.B3W()
            r3 = 0
            if (r0 == 0) goto L_0x0012
            r3 = 1
        L_0x0012:
            com.instagram.model.shopping.ProductItemWithARIntf r0 = r8.B0B()
            r2 = 0
            if (r0 == 0) goto L_0x001a
            r2 = 1
        L_0x001a:
            java.util.List r0 = r8.B02()
            if (r0 == 0) goto L_0x0027
            int r1 = r0.size()
            r0 = 1
            if (r1 != 0) goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            if (r3 != 0) goto L_0x003c
            if (r2 != 0) goto L_0x003c
            if (r0 != 0) goto L_0x003c
            X.0Tu r2 = X.0Tu.A05
            r0 = 36311186824036819(0x8100d5000501d3, double:3.026678988709764E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x003c
        L_0x003b:
            return r5
        L_0x003c:
            boolean r0 = X.C309146Xc.A00(r6, r8)
            if (r0 != 0) goto L_0x0046
            boolean r4 = X.C305756Jk.A00(r6)
        L_0x0046:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C309136Xb.A01(android.content.Context, com.instagram.common.session.UserSession, com.instagram.feed.media.CreativeConfigIntf):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(android.content.Context r5, com.instagram.common.session.UserSession r6, com.instagram.feed.media.CreativeConfigIntf r7) {
        /*
            X.6Ku r4 = X.C284745Nt.A03(r7)
            com.instagram.feed.media.EffectPreviewIntf r0 = r7.B0A()
            if (r0 == 0) goto L_0x0010
            java.lang.String r3 = r0.getName()
            if (r3 != 0) goto L_0x0014
        L_0x0010:
            java.lang.String r3 = r7.getCaptureType()
        L_0x0014:
            com.instagram.model.shopping.ProductItemWithARIntf r0 = r7.B0B()
            if (r0 == 0) goto L_0x0032
            com.instagram.user.model.ProductDetailsProductItemDictIntf r0 = r0.BgJ()
            if (r0 == 0) goto L_0x0032
            com.instagram.user.model.Product r0 = X.C14502TxO.A00(r0)
            java.lang.String r3 = r0.A0J
        L_0x0026:
            if (r3 != 0) goto L_0x0031
            java.lang.String r1 = "EffectAttributionViewBinder"
            java.lang.String r0 = "Showing empty attribution label"
            X.0wb.A03(r1, r0)
            java.lang.String r3 = ""
        L_0x0031:
            return r3
        L_0x0032:
            boolean r0 = X.C309146Xc.A00(r5, r7)
            if (r0 == 0) goto L_0x0026
            X.0Tu r2 = X.0Tu.A05
            r0 = 36311186824036819(0x8100d5000501d3, double:3.026678988709764E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 != 0) goto L_0x0026
            java.lang.String r1 = r7.B3W()
            if (r4 == 0) goto L_0x0026
            int r0 = r4.ordinal()
            switch(r0) {
                case 2: goto L_0x0068;
                case 3: goto L_0x006c;
                case 4: goto L_0x0068;
                case 5: goto L_0x0070;
                case 6: goto L_0x0052;
                case 7: goto L_0x0052;
                case 8: goto L_0x0057;
                case 9: goto L_0x0052;
                case 10: goto L_0x0053;
                default: goto L_0x0052;
            }
        L_0x0052:
            goto L_0x0026
        L_0x0053:
            r0 = 2131953218(0x7f130642, float:1.95429E38)
            goto L_0x0075
        L_0x0057:
            java.util.List r0 = r7.B02()
            if (r0 == 0) goto L_0x0064
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0064
            goto L_0x0026
        L_0x0064:
            r0 = 2131953220(0x7f130644, float:1.9542905E38)
            goto L_0x0075
        L_0x0068:
            r0 = 2131953222(0x7f130646, float:1.9542909E38)
            goto L_0x0075
        L_0x006c:
            r0 = 2131953219(0x7f130643, float:1.9542903E38)
            goto L_0x0075
        L_0x0070:
            if (r1 != 0) goto L_0x0026
            r0 = 2131953213(0x7f13063d, float:1.954289E38)
        L_0x0075:
            java.lang.String r3 = r5.getString(r0)
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C309136Xb.A00(android.content.Context, com.instagram.common.session.UserSession, com.instagram.feed.media.CreativeConfigIntf):java.lang.String");
    }
}

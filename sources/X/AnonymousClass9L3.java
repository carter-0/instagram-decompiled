package X;

/* renamed from: X.9L3  reason: invalid class name */
public final class AnonymousClass9L3 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9L3(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v133, types: [X.564, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x03bd, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03f1, code lost:
        if (((X.C342027nv) r12.A01).A00 >= 60100) goto L_0x0417;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0415, code lost:
        if (r2.isTaskRoot() != false) goto L_0x0417;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0417, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x041c, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x041d, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x000e;
                case 1: goto L_0x0021;
                case 2: goto L_0x0080;
                case 3: goto L_0x00ae;
                case 4: goto L_0x00c6;
                case 5: goto L_0x0005;
                case 6: goto L_0x0005;
                case 7: goto L_0x00d1;
                case 8: goto L_0x00dc;
                case 9: goto L_0x010d;
                case 10: goto L_0x0119;
                case 11: goto L_0x014f;
                case 12: goto L_0x005a;
                case 13: goto L_0x0157;
                case 14: goto L_0x0181;
                case 15: goto L_0x018b;
                case 16: goto L_0x019a;
                case 17: goto L_0x01a4;
                case 18: goto L_0x01ae;
                case 19: goto L_0x01bb;
                case 20: goto L_0x01c5;
                case 21: goto L_0x01d1;
                case 22: goto L_0x01ec;
                case 23: goto L_0x01f5;
                case 24: goto L_0x020e;
                case 25: goto L_0x0225;
                case 26: goto L_0x0249;
                case 27: goto L_0x0262;
                case 28: goto L_0x0270;
                case 29: goto L_0x0289;
                case 30: goto L_0x02a2;
                case 31: goto L_0x02bb;
                case 32: goto L_0x02d1;
                case 33: goto L_0x02d3;
                case 34: goto L_0x02e9;
                case 35: goto L_0x036b;
                case 36: goto L_0x0377;
                case 37: goto L_0x0391;
                case 38: goto L_0x03a2;
                case 39: goto L_0x03ab;
                case 40: goto L_0x03be;
                case 41: goto L_0x03de;
                case 42: goto L_0x03f4;
                case 43: goto L_0x03fe;
                case 44: goto L_0x041f;
                case 45: goto L_0x0429;
                case 46: goto L_0x0441;
                case 47: goto L_0x0459;
                case 48: goto L_0x0471;
                case 49: goto L_0x047b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A01
            com.instagram.graphservice.service.pando.IGPandoGraphQLRequestDecoratorInfo r0 = (com.instagram.graphservice.service.pando.IGPandoGraphQLRequestDecoratorInfo) r0
            java.lang.String r5 = r0.getRequestUrl()
        L_0x000d:
            return r5
        L_0x000e:
            java.lang.Object r0 = r12.A01
            X.6tR r0 = (X.C321016tR) r0
            android.content.Context r2 = r0.A0W
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.XaS r5 = X.C39861ACh.A00
            if (r5 != 0) goto L_0x000d
            X.ACh r1 = X.C39861ACh.A01
            monitor-enter(r1)
            goto L_0x0485
        L_0x0021:
            java.lang.Object r1 = r12.A01
            X.7Sw r1 = (X.C331897Sw) r1
            X.7Sw r0 = X.C331897Sw.A0A
            java.lang.String r0 = "This operation can't be run on UI thread."
            X.11Z.A05(r0)
            android.content.Context r4 = r1.A00
            X.1M2 r5 = X.1M2.A03
            java.lang.String r6 = "gifs"
            r10 = 0
            r7 = 1036831949(0x3dcccccd, float:0.1)
            r8 = 52428800(0x3200000, double:2.5903269E-316)
            X.1M4 r1 = X.1M3.A00(r4, r5, r6, r7, r8, r10)
            r0 = 1648037800(0x623b0fa8, float:8.626673E20)
            X.1JF r2 = X.AnonymousClass1JF.A00(r0)
            long r0 = r1.A00
            r2.A01 = r0
            X.1JG r5 = r2.A01()
            java.io.File r1 = r4.getExternalCacheDir()     // Catch:{ NullPointerException -> 0x000d }
            java.io.File r0 = new java.io.File     // Catch:{ NullPointerException -> 0x000d }
            r0.<init>(r1, r6)     // Catch:{ NullPointerException -> 0x000d }
            X.0Gw.A02(r0)     // Catch:{ NullPointerException -> 0x000d }
            goto L_0x0495
        L_0x005a:
            java.lang.Object r0 = r12.A01
            X.3M8 r0 = (X.AnonymousClass3M8) r0
            X.Dc2 r2 = r0.A09
            r5 = 0
            if (r2 == 0) goto L_0x007e
            X.6aq r1 = r2.A0C
        L_0x0065:
            X.6aq r0 = X.C310346aq.ERROR
            if (r1 != r0) goto L_0x000d
            if (r2 == 0) goto L_0x0075
            java.lang.CharSequence r0 = r2.A0D
            if (r0 == 0) goto L_0x0075
            java.lang.String r1 = r0.toString()
            if (r1 != 0) goto L_0x0077
        L_0x0075:
            java.lang.String r1 = "empty"
        L_0x0077:
            java.lang.String r0 = "SnackBar Error: "
            java.lang.String r5 = X.002.A0R(r0, r1)
            return r5
        L_0x007e:
            r1 = r5
            goto L_0x0065
        L_0x0080:
            X.1vr r4 = X.1vr.A00
            java.lang.Object r3 = r12.A01
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            r1 = 44
            X.Phb r0 = new X.Phb
            r0.<init>(r3, r1)
            X.0t0 r1 = X.AnonymousClass0eN.A01(r0)
            java.lang.String r0 = "instagram"
            X.1vy r2 = r4.A03(r3, r0, r1)
            r1 = 45
            X.Phb r0 = new X.Phb
            r0.<init>(r3, r1)
            X.0t0 r1 = X.AnonymousClass0eN.A01(r0)
            java.lang.String r0 = "distillery"
            X.1vy r0 = r4.A03(r3, r0, r1)
            X.1vn r5 = new X.1vn
            r5.<init>(r2, r0)
            return r5
        L_0x00ae:
            X.1vr r3 = X.1vr.A00
            java.lang.Object r2 = r12.A01
            X.0lg r2 = (X.0lg) r2
            java.lang.String r0 = "instagram"
            X.1vy r1 = r3.A02(r2, r0)
            java.lang.String r0 = "distillery"
            X.1vy r0 = r3.A02(r2, r0)
            X.1vn r5 = new X.1vn
            r5.<init>(r1, r0)
            return r5
        L_0x00c6:
            java.lang.Object r1 = r12.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r5 = r1.A06
            return r5
        L_0x00d1:
            java.lang.Object r0 = r12.A01
            X.6jp r0 = (X.C315396jp) r0
            com.instagram.common.session.UserSession r0 = r0.A04
            X.1Av r5 = X.1Au.A00(r0)
            return r5
        L_0x00dc:
            java.lang.Object r4 = r12.A01
            android.view.View r4 = (android.view.View) r4
            r0 = 2131432599(0x7f0b1497, float:1.848696E38)
            android.view.View r3 = r4.requireViewById(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r3 = (com.instagram.common.ui.widget.imageview.CircularImageView) r3
            r0 = 2131432600(0x7f0b1498, float:1.8486962E38)
            android.view.View r2 = r4.requireViewById(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = (com.instagram.common.ui.widget.imageview.CircularImageView) r2
            r0 = 2131432601(0x7f0b1499, float:1.8486964E38)
            android.view.View r1 = r4.requireViewById(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = (com.instagram.common.ui.widget.imageview.CircularImageView) r1
            r0 = 2131432602(0x7f0b149a, float:1.8486966E38)
            android.view.View r0 = r4.requireViewById(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = (com.instagram.common.ui.widget.imageview.CircularImageView) r0
            com.instagram.common.ui.widget.imageview.CircularImageView[] r0 = new com.instagram.common.ui.widget.imageview.CircularImageView[]{r3, r2, r1, r0}
            java.util.List r5 = X.0sr.A1P(r0)
            return r5
        L_0x010d:
            java.lang.Object r1 = r12.A01
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131231779(0x7f080423, float:1.8079649E38)
            android.graphics.drawable.Drawable r5 = r1.getDrawable(r0)
            return r5
        L_0x0119:
            r0 = 1
            android.text.TextPaint r5 = new android.text.TextPaint
            r5.<init>(r0)
            java.lang.Object r3 = r12.A01
            android.content.Context r3 = (android.content.Context) r3
            r0 = -1
            r5.setColor(r0)
            r0 = 1094713344(0x41400000, float:12.0)
            float r0 = X.0nA.A03(r3, r0)
            r5.setTextSize(r0)
            X.0qq r1 = X.AnonymousClass0qo.A00(r3)
            X.0qm r0 = X.0qm.A13
            android.graphics.Typeface r0 = r1.A02(r0)
            r5.setTypeface(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = X.0nA.A03(r3, r0)
            r0 = 2131099798(0x7f060096, float:1.781196E38)
            int r1 = r3.getColor(r0)
            r0 = 0
            r5.setShadowLayer(r2, r0, r0, r1)
            return r5
        L_0x014f:
            java.lang.Object r1 = r12.A01
            r0 = 0
            X.3E5 r5 = X.AnonymousClass3E4.A01(r1, r0, r0)
            return r5
        L_0x0157:
            java.lang.Object r4 = r12.A01
            X.3M8 r4 = (X.AnonymousClass3M8) r4
            boolean r0 = X.AnonymousClass2Rc.A00
            if (r0 == 0) goto L_0x0178
            X.2co r1 = X.C71392co.A02
        L_0x0161:
            X.2cp r0 = X.C61340me.A00()
            X.2cs r5 = r0.A02()
            r5.A09(r1)
            r1 = 0
            r0 = 1
            r5.A08(r1, r0)
            r5.A06 = r0
            r5.A0A(r4)
            return r5
        L_0x0178:
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0 = 4613937818241073152(0x4008000000000000, double:3.0)
            X.2co r1 = X.C71392co.A04(r2, r0)
            goto L_0x0161
        L_0x0181:
            java.lang.Object r0 = r12.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.6zW r5 = new X.6zW
            r5.<init>(r0)
            return r5
        L_0x018b:
            java.lang.Object r1 = r12.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.564 r0 = new X.564
            r0.<init>()
            X.563 r5 = new X.563
            r5.<init>(r1, r0)
            return r5
        L_0x019a:
            java.lang.Object r0 = r12.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.igsignalsproducts.clips.tab.IgSignalsClipsOpenTabTracker r5 = new com.instagram.igsignalsproducts.clips.tab.IgSignalsClipsOpenTabTracker
            r5.<init>(r0)
            return r5
        L_0x01a4:
            java.lang.Object r0 = r12.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator r5 = new com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator
            r5.<init>(r0)
            return r5
        L_0x01ae:
            java.lang.Object r0 = r12.A01
            X.1Xj r0 = (X.1Xj) r0
            boolean r0 = r0.A5G()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x01bb:
            java.lang.Object r0 = r12.A01
            X.1Xj r0 = (X.1Xj) r0
            X.4Wb r5 = new X.4Wb
            r5.<init>(r0)
            return r5
        L_0x01c5:
            java.lang.Object r0 = r12.A01
            X.4Jm r0 = (X.C263194Jm) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.4Wj r5 = new X.4Wj
            r5.<init>(r0)
            return r5
        L_0x01d1:
            java.lang.Object r0 = r12.A01
            X.3yh r0 = (X.C258243yh) r0
            android.view.View r1 = r0.A00()
            r0 = 2131430128(0x7f0b0af0, float:1.8481948E38)
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r5 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.ImageView"
            X.0qQ.A0C(r5, r0)
            return r5
        L_0x01ec:
            java.lang.Object r0 = r12.A01
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r5 = r0.inflate()
            return r5
        L_0x01f5:
            java.lang.Object r0 = r12.A01
            X.3yh r0 = (X.C258243yh) r0
            android.view.View r1 = r0.A00()
            r0 = 2131437907(0x7f0b2953, float:1.8497726E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.3oV r0 = X.2b1.A00(r0)
            X.4Wp r5 = new X.4Wp
            r5.<init>(r0)
            return r5
        L_0x020e:
            java.lang.Object r0 = r12.A01
            X.3yh r0 = (X.C258243yh) r0
            android.view.View r1 = r0.A00()
            r0 = 2131437917(0x7f0b295d, float:1.8497746E38)
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            X.4Wn r5 = new X.4Wn
            r5.<init>(r0)
            return r5
        L_0x0225:
            java.lang.Object r1 = r12.A01
            X.3yh r1 = (X.C258243yh) r1
            android.view.View r0 = r1.A00()
            android.content.Context r2 = r0.getContext()
            X.0qQ.A07(r2)
            android.view.View r1 = r1.A00()
            r0 = 2131438785(0x7f0b2cc1, float:1.8499507E38)
            android.view.View r0 = r1.findViewById(r0)
            X.3oV r0 = X.2b1.A00(r0)
            X.4X0 r5 = new X.4X0
            r5.<init>(r2, r0)
            return r5
        L_0x0249:
            java.lang.Object r0 = r12.A01
            X.3yh r0 = (X.C258243yh) r0
            android.view.View r1 = r0.A00()
            r0 = 2131439179(0x7f0b2e4b, float:1.8500306E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.3oV r0 = X.2b1.A00(r0)
            X.4Wv r5 = new X.4Wv
            r5.<init>(r0)
            return r5
        L_0x0262:
            java.lang.Object r0 = r12.A01
            X.3yh r0 = (X.C258243yh) r0
            android.view.View r0 = r0.A00()
            X.4Wi r5 = new X.4Wi
            r5.<init>(r0)
            return r5
        L_0x0270:
            java.lang.Object r0 = r12.A01
            X.3yh r0 = (X.C258243yh) r0
            android.view.View r1 = r0.A00()
            r0 = 2131430241(0x7f0b0b61, float:1.8482177E38)
            android.view.View r0 = r1.findViewById(r0)
            X.3oV r0 = X.2b1.A00(r0)
            X.ACp r5 = new X.ACp
            r5.<init>(r0)
            return r5
        L_0x0289:
            java.lang.Object r0 = r12.A01
            X.3yh r0 = (X.C258243yh) r0
            android.view.View r1 = r0.A00()
            r0 = 2131443158(0x7f0b3dd6, float:1.8508376E38)
            android.view.View r0 = r1.findViewById(r0)
            X.3oV r0 = X.2b1.A00(r0)
            com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder r5 = new com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder
            r5.<init>(r0)
            return r5
        L_0x02a2:
            java.lang.Object r0 = r12.A01
            X.3yh r0 = (X.C258243yh) r0
            android.view.View r1 = r0.A00()
            r0 = 2131443161(0x7f0b3dd9, float:1.8508382E38)
            android.view.View r0 = r1.findViewById(r0)
            X.3oV r0 = X.2b1.A00(r0)
            X.4WO r5 = new X.4WO
            r5.<init>(r0)
            return r5
        L_0x02bb:
            java.lang.Object r0 = r12.A01
            X.2IN r0 = (X.2IN) r0
            com.instagram.common.session.UserSession r3 = r0.A02
            X.0Tu r2 = X.0Tu.A06
            r0 = 36611709980907781(0x82122800081905, double:3.216731043224583E-306)
            long r0 = X.182.A01(r2, r3, r0)
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            return r5
        L_0x02d1:
            r5 = 0
            return r5
        L_0x02d3:
            java.lang.Object r0 = r12.A01
            X.2IN r0 = (X.2IN) r0
            com.instagram.common.session.UserSession r3 = r0.A02
            X.0Tu r2 = X.0Tu.A06
            r0 = 36330235003683352(0x81122800004218, double:3.0387251342190946E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x02e9:
            java.lang.Object r6 = r12.A01
            X.2IN r6 = (X.2IN) r6
            com.instagram.common.session.UserSession r5 = r6.A02
            X.0Tu r7 = X.0Tu.A06
            r0 = 36893184957285328(0x831228000303d0, double:3.3947369516944994E-306)
            java.lang.String r1 = X.182.A04(r7, r5, r0)
            r10 = 0
            java.lang.String r0 = ","
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r4 = 0
            java.util.List r1 = X.00l.A0R(r1, r0, r10)
            r2 = 10
            int r0 = X.0Yv.A1E(r1, r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.Iterator r11 = r1.iterator()
        L_0x0315:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x033f
            java.lang.Object r0 = r11.next()
            java.lang.String r0 = (java.lang.String) r0
            X.0qQ.A0B(r0, r10)
            java.lang.Long r0 = X.00y.A0n(r2, r0)
            if (r0 == 0) goto L_0x033c
            long r8 = r0.longValue()
        L_0x032e:
            r0 = 60
            long r8 = r8 * r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r0
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r3.add(r0)
            goto L_0x0315
        L_0x033c:
            r8 = 15
            goto L_0x032e
        L_0x033f:
            r0 = 36330235004011035(0x8112280005421b, double:3.0387251344263226E-306)
            boolean r0 = X.182.A06(r7, r5, r0)
            r2 = 0
            if (r0 == 0) goto L_0x0354
            X.1Av r0 = X.1Au.A00(r5)
            X.S5L r4 = new X.S5L
            r4.<init>(r0)
        L_0x0354:
            r0 = 36330235003945498(0x8112280004421a, double:3.038725134384877E-306)
            boolean r0 = X.182.A06(r7, r5, r0)
            if (r0 == 0) goto L_0x0365
            android.content.Context r0 = r6.A01
            com.instagram.casper.IgSignalsCasper r2 = X.2C5.A00(r0, r5)
        L_0x0365:
            X.SHP r5 = new X.SHP
            r5.<init>(r4, r2, r3)
            return r5
        L_0x036b:
            java.lang.Object r0 = r12.A01
            X.2IN r0 = (X.2IN) r0
            android.content.Context r0 = r0.A01
            X.OCW r5 = new X.OCW
            r5.<init>(r0)
            return r5
        L_0x0377:
            java.lang.Object r0 = r12.A01
            X.2IN r0 = (X.2IN) r0
            android.content.Context r4 = r0.A01
            com.instagram.common.session.UserSession r3 = r0.A02
            X.0Tu r2 = X.0Tu.A06
            r0 = 36611709980449028(0x82122800011904, double:3.2167310429344656E-306)
            long r1 = X.182.A01(r2, r3, r0)
            int r0 = (int) r1
            X.RvV r5 = new X.RvV
            r5.<init>(r4, r3, r0)
            return r5
        L_0x0391:
            X.02m r1 = X.02m.A0p
            X.0qQ.A07(r1)
            X.0wX r0 = X.C61170le.A00
            X.0xm r0 = X.AnonymousClass0xl.A00(r0)
            X.3EA r5 = new X.3EA
            r5.<init>(r1, r0)
            return r5
        L_0x03a2:
            java.lang.Object r1 = r12.A01
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r1 = (com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView) r1
            r0 = 0
            r1.setNormalColor(r0)
            goto L_0x03bb
        L_0x03ab:
            java.lang.Object r0 = r12.A01
            X.7ek r0 = (X.C336517ek) r0
            X.0eM r0 = r0.A00
            java.lang.Object r1 = r0.getValue()
            com.facebook.litho.LithoView r1 = (com.facebook.litho.LithoView) r1
            r0 = 0
            r1.setComponentTree(r0)
        L_0x03bb:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x03be:
            java.lang.Object r0 = r12.A01
            X.3Y5 r0 = (X.AnonymousClass3Y5) r0
            X.2V1 r2 = r0.A05
            X.2V1 r0 = X.2V1.A01(r2)
            X.3X6 r1 = new X.3X6
            r1.<init>(r0)
            X.3X5 r0 = r2.A02
            X.2Sa r0 = r0.A01
            boolean r0 = r0.A0M
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A07 = r0
            com.facebook.litho.ComponentTree r5 = r1.A00()
            return r5
        L_0x03de:
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "samsung"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x041d
            java.lang.Object r0 = r12.A01
            X.7nv r0 = (X.C342027nv) r0
            int r1 = r0.A00
            r0 = 60100(0xeac4, float:8.4218E-41)
            if (r1 < r0) goto L_0x041d
            goto L_0x0417
        L_0x03f4:
            java.lang.Object r0 = r12.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Q4 r5 = new X.1Q4
            r5.<init>(r0)
            return r5
        L_0x03fe:
            java.lang.Object r2 = r12.A01
            com.instagram.mainactivity.InstagramMainActivity r2 = (com.instagram.mainactivity.InstagramMainActivity) r2
            X.2b7 r0 = r2.A09
            r0.getClass()
            X.2b8 r0 = r0.A01
            X.1QK r1 = r0.A01()
            X.1QK r0 = X.1QK.A0C
            if (r1 != r0) goto L_0x041d
            boolean r0 = r2.isTaskRoot()
            if (r0 == 0) goto L_0x041d
        L_0x0417:
            r0 = 1
        L_0x0418:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x041d:
            r0 = 0
            goto L_0x0418
        L_0x041f:
            java.lang.Object r0 = r12.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.37Y r5 = new X.37Y
            r5.<init>(r0)
            return r5
        L_0x0429:
            java.lang.Object r1 = r12.A01
            X.2aC r1 = (X.2aC) r1
            java.util.Map r0 = X.2aC.A0V
            com.instagram.common.session.UserSession r3 = r1.A0J
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330054615253422(0x8111fe000341ae, double:3.038611055849641E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x0441:
            java.lang.Object r1 = r12.A01
            X.2aC r1 = (X.2aC) r1
            java.util.Map r0 = X.2aC.A0V
            com.instagram.common.session.UserSession r3 = r1.A0J
            X.0Tu r2 = X.0Tu.A05
            r0 = 36611529591888105(0x8211fe000218e9, double:3.2166169644821714E-306)
            long r0 = X.182.A01(r2, r3, r0)
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            return r5
        L_0x0459:
            java.lang.Object r1 = r12.A01
            X.2aC r1 = (X.2aC) r1
            java.util.Map r0 = X.2aC.A0V
            com.instagram.common.session.UserSession r3 = r1.A0J
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330054615122349(0x8111fe000141ad, double:3.03861105576675E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x0471:
            java.lang.Object r0 = r12.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2TO r5 = new X.2TO
            r5.<init>(r0)
            return r5
        L_0x047b:
            java.lang.Object r0 = r12.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Pn r5 = new X.1Pn
            r5.<init>(r0)
            return r5
        L_0x0485:
            X.XaS r5 = X.C39861ACh.A00     // Catch:{ all -> 0x0492 }
            if (r5 != 0) goto L_0x0490
            X.XaS r5 = new X.XaS     // Catch:{ all -> 0x0492 }
            r5.<init>(r2)     // Catch:{ all -> 0x0492 }
            X.C39861ACh.A00 = r5     // Catch:{ all -> 0x0492 }
        L_0x0490:
            monitor-exit(r1)
            return r5
        L_0x0492:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0495:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9L3.invoke():java.lang.Object");
    }
}

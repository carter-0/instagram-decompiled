package X;

/* renamed from: X.Wvv  reason: case insensitive filesystem */
public final class C20614Wvv extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20614Wvv(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0364, code lost:
        r2 = r2.getId();
        r1 = r3.A03;
        r0 = 5179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x037d, code lost:
        r1 = X.AnonymousClass7TE.A0e(r1, X.AnonymousClass000.A00(r0));
        r1.AAJ("target_id", r2);
        r1.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0399, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01be, code lost:
        return X.JUM.A01(new X.MEQ(r1, r4), r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x0065;
                case 1: goto L_0x006d;
                case 2: goto L_0x00ef;
                case 3: goto L_0x00fe;
                case 4: goto L_0x0117;
                case 5: goto L_0x0171;
                case 6: goto L_0x01d4;
                case 7: goto L_0x01e5;
                case 8: goto L_0x0207;
                case 9: goto L_0x021a;
                case 10: goto L_0x022e;
                case 11: goto L_0x023b;
                case 12: goto L_0x0249;
                case 13: goto L_0x026b;
                case 14: goto L_0x0278;
                case 15: goto L_0x0287;
                case 16: goto L_0x02a1;
                case 17: goto L_0x02b2;
                case 18: goto L_0x02b2;
                case 19: goto L_0x02c5;
                case 20: goto L_0x0005;
                case 21: goto L_0x0005;
                case 22: goto L_0x02d4;
                case 23: goto L_0x02ed;
                case 24: goto L_0x0005;
                case 25: goto L_0x0327;
                case 26: goto L_0x0333;
                case 27: goto L_0x036d;
                case 28: goto L_0x0005;
                case 29: goto L_0x038e;
                case 30: goto L_0x038e;
                case 31: goto L_0x0028;
                case 32: goto L_0x039a;
                case 33: goto L_0x03af;
                case 34: goto L_0x03bd;
                case 35: goto L_0x0005;
                case 36: goto L_0x0005;
                case 37: goto L_0x0005;
                case 38: goto L_0x03cb;
                case 39: goto L_0x03dc;
                case 40: goto L_0x0005;
                case 41: goto L_0x0005;
                case 42: goto L_0x0041;
                case 43: goto L_0x0005;
                case 44: goto L_0x0005;
                case 45: goto L_0x0005;
                case 46: goto L_0x0005;
                case 47: goto L_0x03f0;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r8.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0011
            java.lang.Object r3 = r0.invoke()
            if (r3 != 0) goto L_0x0027
        L_0x0011:
            java.lang.Object r0 = r8.A02
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r1 = r0.getValue()
            X.07g r1 = (X.AnonymousClass07g) r1
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x0062
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x0062
            X.2YQ r3 = r1.getDefaultViewModelCreationExtras()
        L_0x0027:
            return r3
        L_0x0028:
            java.lang.Object r0 = r8.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0034
            java.lang.Object r3 = r0.invoke()
            if (r3 != 0) goto L_0x0027
        L_0x0034:
            java.lang.Object r0 = r8.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            X.2YQ r3 = r0.getDefaultViewModelCreationExtras()
            return r3
        L_0x0041:
            java.lang.Object r0 = r8.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r1 = r0.getValue()
            X.07g r1 = (X.AnonymousClass07g) r1
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x0059
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x0059
            X.2YM r3 = r1.getDefaultViewModelProviderFactory()
            if (r3 != 0) goto L_0x0027
        L_0x0059:
            java.lang.Object r0 = r8.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.2YM r3 = r0.getDefaultViewModelProviderFactory()
            return r3
        L_0x0062:
            X.2YP r3 = X.AnonymousClass2YP.A00
            return r3
        L_0x0065:
            java.lang.Object r1 = r8.A01
            r0 = 0
            X.0qQ.A0B(r1, r0)
            goto L_0x0397
        L_0x006d:
            java.lang.Object r0 = r8.A02
            X.VYc r0 = (X.C17499VYc) r0
            X.Uqx r4 = r0.A03
            java.lang.Object r3 = r8.A01
            X.WSU r3 = (X.WSU) r3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.W03 r5 = r4.A00
            if (r5 == 0) goto L_0x00cd
            X.X9C r0 = r4.A03
            X.Vuf r0 = r0.Bz5()
            com.instagram.user.model.Product r1 = r0.A08
            r6 = 0
            if (r1 == 0) goto L_0x00ed
            com.instagram.common.session.UserSession r0 = r5.A03
            X.ULx r7 = X.C294165ly.A03(r0, r1)
        L_0x0090:
            X.0wc r1 = r5.A02
            java.lang.String r0 = "instagram_ads_app_tap_information_row"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x00cd
            X.UKi r0 = r5.A01
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x00a8
            java.lang.String r0 = r0.A05
            if (r0 != 0) goto L_0x00a9
        L_0x00a8:
            r0 = r1
        L_0x00a9:
            java.lang.String r0 = X.W03.A00(r2, r5, r0)
            X.C51965G9l.A1L(r2, r0)
            if (r7 == 0) goto L_0x00eb
            X.4Ny r1 = r7.A01
        L_0x00b4:
            java.lang.String r0 = "advertiser_id"
            r2.AAE(r1, r0)
            java.lang.String r0 = "catalog_id"
            r2.A9F(r0, r6)
            java.lang.String r0 = r5.A05
            X.C13988Tno.A1C(r2, r0)
            java.lang.String r1 = r5.A06
            java.lang.String r0 = "prior_submodule"
            r2.AAJ(r0, r1)
            r2.Cgf()
        L_0x00cd:
            X.X9C r5 = r4.A03
            X.W2j r4 = X.W2j.A00(r5)
            java.lang.String r3 = r3.A02
            java.util.Map r2 = r4.A0C
            java.lang.Object r1 = r2.get(r3)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            r0 = r0 ^ 1
            X.JTP.A1R(r3, r2, r0)
            X.C18588Vuf.A00(r5, r4)
            goto L_0x0397
        L_0x00eb:
            r1 = r6
            goto L_0x00b4
        L_0x00ed:
            r7 = r6
            goto L_0x0090
        L_0x00ef:
            java.lang.Object r0 = r8.A02
            X.VYc r0 = (X.C17499VYc) r0
            X.Uqx r1 = r0.A03
            java.lang.Object r0 = r8.A01
            X.UrQ r0 = (X.C16263UrQ) r0
            r1.A00(r0)
            goto L_0x0397
        L_0x00fe:
            java.lang.Object r0 = r8.A02
            X.VYd r0 = (X.C17500VYd) r0
            X.Uqw r1 = r0.A03
            java.lang.Object r0 = r8.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r3 = r0.getId()
            X.W1i r2 = r1.A00
            java.lang.String r1 = "shopping_pdp_media_attribution"
            java.lang.String r0 = "pdp_media"
            r2.A06(r3, r1, r0)
            goto L_0x0397
        L_0x0117:
            java.lang.Object r2 = r8.A01
            X.UKY r2 = (X.UKY) r2
            boolean r0 = r2.A05
            if (r0 == 0) goto L_0x015c
            r6 = 0
        L_0x0120:
            java.lang.Object r0 = r8.A02
            X.Lix r0 = (X.C64835Lix) r0
            X.VTl r0 = r0.A02
            java.lang.String r5 = r2.A02
            java.lang.Integer r3 = r2.A01
            r4 = 0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.1NY r2 = X.DbU.A0M(r0)
            java.lang.String r0 = "commerce/bag/creator_cart_products_feed/"
            r2.A0A(r0)
            r2.A05()
            java.lang.Class<X.UY2> r1 = X.UY2.class
            java.lang.Class<X.Vwp> r0 = X.C18691Vwp.class
            r2.A0Q(r1, r0)
            java.lang.String r0 = "creator_id"
            r2.A0G(r0, r5)
            java.lang.String r0 = "max_id"
            r2.A0G(r0, r6)
            java.lang.String r0 = "count"
            r2.A09(r3, r0)
            X.1OC r1 = r2.A0M()
            r0 = 775(0x307, float:1.086E-42)
            X.032 r2 = r1.A03(r0)
            r1 = 22
            goto L_0x01b5
        L_0x015c:
            java.lang.Object r1 = r8.A02
            X.Lix r1 = (X.C64835Lix) r1
            java.lang.String r0 = r2.A02
            X.05G r0 = r1.A0E(r0)
            X.JwC r1 = X.JTO.A0P(r0)
            X.UzF r0 = X.C16679UzF.CART
            java.lang.String r6 = r1.A05(r0)
            goto L_0x0120
        L_0x0171:
            java.lang.Object r2 = r8.A01
            X.UKY r2 = (X.UKY) r2
            boolean r0 = r2.A05
            if (r0 == 0) goto L_0x01bf
            r5 = 0
        L_0x017a:
            java.lang.Object r0 = r8.A02
            X.Lix r0 = (X.C64835Lix) r0
            X.VTl r0 = r0.A02
            java.lang.String r3 = r2.A02
            r4 = 0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.1NY r2 = X.DbU.A0M(r0)
            java.lang.String r0 = "commerce/reconsideration/recently_viewed_products_feed/"
            r2.A0A(r0)
            r2.A05()
            java.lang.Class<X.UY2> r1 = X.UY2.class
            java.lang.Class<X.Vwp> r0 = X.C18691Vwp.class
            r2.A0Q(r1, r0)
            java.lang.String r1 = "include_offsite_products"
            java.lang.String r0 = "true"
            r2.A9m(r1, r0)
            java.lang.String r0 = "max_id"
            r2.A0G(r0, r5)
            java.lang.String r0 = "merchant_id"
            r2.A0G(r0, r3)
            X.1OC r1 = r2.A0M()
            r0 = 775(0x307, float:1.086E-42)
            X.032 r2 = r1.A03(r0)
            r1 = 23
        L_0x01b5:
            X.MEQ r0 = new X.MEQ
            r0.<init>(r1, r4)
            X.MCA r3 = X.JUM.A01(r0, r2)
            return r3
        L_0x01bf:
            java.lang.Object r1 = r8.A02
            X.Lix r1 = (X.C64835Lix) r1
            java.lang.String r0 = r2.A02
            X.05G r0 = r1.A0E(r0)
            X.JwC r1 = X.JTO.A0P(r0)
            X.UzF r0 = X.C16679UzF.RECENTLY_VIEWED
            java.lang.String r5 = r1.A05(r0)
            goto L_0x017a
        L_0x01d4:
            java.lang.Object r2 = r8.A02
            X.LQV r2 = (X.LQV) r2
            java.lang.Object r0 = r8.A01
            X.JuT r0 = (X.C60971JuT) r0
            com.instagram.shopping.model.recon.ShoppingReconFeedEndpoint r1 = r0.A01
            X.MOh r0 = X.C66350MOh.A00
            X.LQV.A01(r1, r2, r0)
            goto L_0x0397
        L_0x01e5:
            java.lang.Object r3 = r8.A02
            X.LEt r3 = (X.C63951LEt) r3
            X.0eM r0 = r3.A01
            java.lang.Object r0 = r0.getValue()
            X.2Fk r0 = (X.2Fk) r0
            java.lang.Object r2 = r8.A01
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r0.A0B(r2)
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r3.A00
            com.instagram.user.model.User r0 = r1.A01(r0)
            X.4Cl r0 = r0.A03
            r0.EPM(r2)
            goto L_0x0397
        L_0x0207:
            java.lang.Object r0 = r8.A02
            X.WSD r0 = (X.WSD) r0
            X.VX2 r0 = r0.A01
            X.0sP r1 = r0.A00
            java.lang.Object r0 = r8.A01
            X.3kE r0 = (X.C249703kE) r0
            android.view.View r0 = r0.itemView
            X.0qQ.A06(r0)
            goto L_0x0394
        L_0x021a:
            java.lang.Object r0 = r8.A02
            X.WSj r0 = (X.C19276WSj) r0
            X.VcX r0 = r0.A01
            X.0sP r1 = r0.A04
            if (r1 == 0) goto L_0x0397
            java.lang.Object r0 = r8.A01
            X.UEM r0 = (X.UEM) r0
            X.Vbc r0 = r0.A05
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r0.A04
            goto L_0x0394
        L_0x022e:
            java.lang.Object r1 = r8.A01
            X.X72 r1 = (X.X72) r1
            java.lang.Object r0 = r8.A02
            com.instagram.model.shopping.productfeed.ProductFeedItem r0 = (com.instagram.model.shopping.productfeed.ProductFeedItem) r0
            r1.DuQ(r0)
            goto L_0x0397
        L_0x023b:
            java.lang.Object r1 = r8.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r8.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2LZ r3 = new X.2LZ
            r3.<init>(r1, r0)
            return r3
        L_0x0249:
            java.lang.Object r0 = r8.A02
            X.3Zt r0 = (X.C243673Zt) r0
            X.AnonymousClass2VL.A00()
            java.lang.Object r0 = r0.A00
            android.animation.Animator r0 = (android.animation.Animator) r0
            if (r0 == 0) goto L_0x0259
            r0.cancel()
        L_0x0259:
            java.lang.Object r0 = r8.A01
            X.3Zt r0 = (X.C243673Zt) r0
            X.AnonymousClass2VL.A00()
            java.lang.Object r0 = r0.A00
            android.animation.Animator r0 = (android.animation.Animator) r0
            if (r0 == 0) goto L_0x0397
            r0.cancel()
            goto L_0x0397
        L_0x026b:
            java.lang.Object r0 = r8.A02
            X.80W r0 = (X.AnonymousClass80W) r0
            java.lang.Object r1 = r8.A01
            java.util.LinkedHashSet r0 = r0.A02
            r0.remove(r1)
            goto L_0x0397
        L_0x0278:
            java.lang.Object r0 = r8.A02
            X.LZZ r0 = (X.LZZ) r0
            X.3E6 r1 = r0.A00
            java.lang.Object r0 = r8.A01
            X.3ok r0 = (X.C252213ok) r0
            r1.EEH(r0)
            goto L_0x0397
        L_0x0287:
            java.lang.Object r0 = r8.A02
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L_0x029f
            android.app.Activity r1 = (android.app.Activity) r1
        L_0x0295:
            java.lang.Object r0 = r8.A01
            X.07V r0 = (X.AnonymousClass07V) r0
            X.LZZ r3 = new X.LZZ
            r3.<init>(r1, r0)
            return r3
        L_0x029f:
            r1 = 0
            goto L_0x0295
        L_0x02a1:
            java.lang.Object r1 = r8.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r8.A01
            android.content.Context r0 = (android.content.Context) r0
            X.0qQ.A0A(r0)
            X.9EF r3 = new X.9EF
            r3.<init>(r1, r0)
            return r3
        L_0x02b2:
            java.lang.Object r2 = r8.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r8.A02
            com.instagram.model.fbusertag.FBUserTag r0 = (com.instagram.model.fbusertag.FBUserTag) r0
            com.instagram.model.fbusertag.FBUserTag$FBUserInfo r0 = r0.A02
            java.lang.String r1 = r0.A02
            java.lang.String r0 = r0.A04
            X.C49907FEf.A00(r2, r1, r0)
            goto L_0x0397
        L_0x02c5:
            java.lang.Object r3 = r8.A02
            X.3W1 r3 = (X.AnonymousClass3W1) r3
            java.lang.Object r2 = r8.A01
            X.2xU r2 = (X.AnonymousClass2xU) r2
            r1 = 0
            r0 = 1
            r3.A0M(r2, r1, r0)
            goto L_0x0397
        L_0x02d4:
            java.lang.Object r0 = r8.A02
            X.4KG r0 = (X.AnonymousClass4KG) r0
            X.4uf r0 = r0.A04
            if (r0 == 0) goto L_0x0397
            java.lang.Object r1 = r8.A01
            com.instagram.ui.widget.pageindicator.CirclePageIndicator r1 = (com.instagram.ui.widget.pageindicator.CirclePageIndicator) r1
            boolean r0 = r1.A0E
            if (r0 == 0) goto L_0x02e8
            r0 = 0
            r1.setGestureInProgress(r0)
        L_0x02e8:
            r0 = 0
            r1.A08 = r0
            goto L_0x0397
        L_0x02ed:
            java.lang.Object r0 = r8.A02
            X.H7S r0 = (X.H7S) r0
            X.K4o r5 = r0.A02
            java.lang.Object r1 = r8.A01
            X.IOT r1 = (X.IOT) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.0eM r4 = r5.A01
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r4)
            com.instagram.user.model.User r0 = r1.A00
            java.lang.String r2 = r0.getId()
            r0 = 4051(0xfd3, float:5.677E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 3853(0xf0d, float:5.399E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.Dfc r3 = X.C46548Dgp.A01(r3, r2, r0, r1)
            X.6Yo r2 = X.DbZ.A0P(r5, r4)
            X.1a1 r1 = X.C46447Df9.A02()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.C46474Dfc.A03(r2, r0, r1, r3)
            goto L_0x0397
        L_0x0327:
            java.lang.Object r3 = r8.A02
            X.Der r3 = (X.C46430Der) r3
            java.lang.Object r2 = r8.A01
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            X.C46430Der.A0B(r2, r3)
            goto L_0x0364
        L_0x0333:
            java.lang.Object r3 = r8.A02
            X.Der r3 = (X.C46430Der) r3
            java.lang.Object r2 = r8.A01
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            X.Dex r0 = r3.A0E
            if (r0 != 0) goto L_0x0349
            java.lang.String r0 = "followListAdapter"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0349:
            r0.A0D(r2)
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = X.C46430Der.A03(r3)
            com.instagram.user.model.User r1 = r1.A01(r0)
            com.instagram.common.session.UserSession r0 = X.C46430Der.A03(r3)
            r1.A0e(r0)
            com.instagram.common.session.UserSession r0 = X.C46430Der.A03(r3)
            r2.A0f(r0)
        L_0x0364:
            java.lang.String r2 = r2.getId()
            X.0wc r1 = r3.A03
            r0 = 5179(0x143b, float:7.257E-42)
            goto L_0x037d
        L_0x036d:
            java.lang.Object r1 = r8.A02
            X.Der r1 = (X.C46430Der) r1
            java.lang.Object r0 = r8.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r2 = r0.getId()
            X.0wc r1 = r1.A03
            r0 = 1757(0x6dd, float:2.462E-42)
        L_0x037d:
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "target_id"
            r1.AAJ(r0, r2)
            r1.Cgf()
            goto L_0x0397
        L_0x038e:
            java.lang.Object r1 = r8.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r8.A01
        L_0x0394:
            r1.invoke(r0)
        L_0x0397:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x039a:
            X.8Yd r2 = X.C357488Yc.A03
            java.lang.Object r1 = r8.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r8.A02
            X.LGO r0 = (X.LGO) r0
            com.instagram.common.session.UserSession r0 = r0.A06
            X.8Yc r0 = r2.A00(r1, r0)
            X.W0T r3 = r0.A00()
            return r3
        L_0x03af:
            java.lang.Object r1 = r8.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r8.A01
            X.0iw r0 = (X.AnonymousClass0iw) r0
            X.VXJ r3 = new X.VXJ
            r3.<init>(r0, r1)
            return r3
        L_0x03bd:
            java.lang.Object r1 = r8.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r8.A02
            X.6go r0 = (X.C313666go) r0
            X.L9O r3 = new X.L9O
            r3.<init>(r1, r0)
            return r3
        L_0x03cb:
            java.lang.Object r0 = r8.A01
            android.content.Context r2 = X.DbT.A08(r0)
            java.lang.Object r1 = r8.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            r0 = 0
            X.80c r3 = new X.80c
            r3.<init>(r2, r1, r0, r0)
            return r3
        L_0x03dc:
            java.lang.Object r0 = r8.A01
            android.content.Context r2 = X.DbT.A08(r0)
            java.lang.Object r1 = r8.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.80w r3 = new X.80w
            r3.<init>(r2, r1)
            return r3
        L_0x03f0:
            java.lang.Object r0 = r8.A02
            X.L7M r0 = (X.L7M) r0
            com.instagram.common.session.UserSession r2 = r0.A01
            android.content.Context r1 = r0.A00
            java.lang.Object r0 = r8.A01
            X.M0W r0 = (X.M0W) r0
            X.KDa r3 = new X.KDa
            r3.<init>(r1, r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20614Wvv.invoke():java.lang.Object");
    }
}

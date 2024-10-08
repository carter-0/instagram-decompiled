package X;

/* renamed from: X.WvW  reason: case insensitive filesystem */
public final /* synthetic */ class C20593WvW extends 0Yk implements 0sJ {
    public C20593WvW(Object obj) {
        super(4, obj, U90.class, "createViewState", "createViewState(ZZZ)Lcom/instagram/shopping/viewmodel/pdp/lightbox/LightboxViewState;", 4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (r7.A0P == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0110, code lost:
        if (X.DbX.A1a(r0.A02) == false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0129, code lost:
        if (r17 != false) goto L_0x0033;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0123  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        /*
            r18 = this;
            boolean r17 = X.AnonymousClass7TE.A1a(r19)
            boolean r16 = X.AnonymousClass7TE.A1a(r20)
            boolean r15 = X.AnonymousClass7TE.A1a(r21)
            r0 = r18
            java.lang.Object r8 = r0.receiver
            X.U90 r8 = (X.U90) r8
            com.instagram.user.model.Product r7 = r8.A08
            boolean r0 = r7.A04()
            if (r0 == 0) goto L_0x001f
            boolean r0 = r7.A0P
            r6 = 1
            if (r0 != 0) goto L_0x0020
        L_0x001f:
            r6 = 0
        L_0x0020:
            com.instagram.common.session.UserSession r5 = r8.A03
            X.0Tu r4 = X.0Tu.A05
            r1 = 36313501811083295(0x8102f00000081f, double:3.02814299583966E-306)
            boolean r0 = X.182.A06(r4, r5, r1)
            if (r0 != 0) goto L_0x0127
            if (r17 == 0) goto L_0x012d
            java.lang.Integer r11 = X.AnonymousClass05K.A0C
        L_0x0033:
            X.4lo r10 = X.C273014lo.PRIMARY_LINK
        L_0x0035:
            if (r6 == 0) goto L_0x00ad
            boolean r0 = r8.A00
            if (r0 != 0) goto L_0x00ad
            int r3 = r11.intValue()
            r0 = 0
            if (r3 == r0) goto L_0x0123
            r0 = 1
            if (r3 != r0) goto L_0x00ad
            java.lang.String r3 = "checkout"
        L_0x0047:
            X.W1d r13 = r8.A04
            java.lang.String r14 = "shopping_pdp_button"
            X.0wc r9 = r13.A02
            java.lang.String r0 = "instagram_shopping_pdp_sticky_cta_impression"
            X.0Aj r9 = X.AnonymousClass7TE.A0e(r9, r0)
            java.lang.String r0 = r7.A0H
            java.lang.Long r12 = X.DbV.A0q(r0)
            java.lang.String r0 = "pdp_product_id"
            r9.A9F(r0, r12)
            com.instagram.user.model.User r0 = r7.A0B
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r0)
            if (r0 != 0) goto L_0x006a
        L_0x0068:
            java.lang.String r0 = ""
        L_0x006a:
            X.C13988Tno.A1A(r9, r0)
            X.DbS.A1J(r9, r3)
            X.327 r12 = new X.327
            r12.<init>()
            java.lang.String r3 = r13.A0A
            java.lang.String r0 = "prior_module"
            r12.A06(r0, r3)
            java.lang.String r3 = r13.A0B
            java.lang.String r0 = "prior_submodule"
            r12.A06(r0, r3)
            java.lang.String r3 = r13.A0D
            java.lang.String r0 = "shopping_session_id"
            r12.A06(r0, r3)
            java.lang.String r0 = "submodule"
            X.C13988Tno.A19(r9, r12, r0, r14)
            X.C13989Tnp.A1H(r9, r7)
            com.instagram.api.schemas.RankingInfo r0 = r13.A00
            X.C13991Tnr.A12(r9, r0)
            java.lang.String r3 = r13.A08
            if (r3 == 0) goto L_0x00aa
            int r0 = r3.length()
            if (r0 == 0) goto L_0x00aa
            java.lang.Long r3 = X.AnonymousClass7TE.A10(r3)
            java.lang.String r0 = "collection_page_id"
            r9.A9F(r0, r3)
        L_0x00aa:
            r9.Cgf()
        L_0x00ad:
            r8.A00 = r6
            X.4lo r0 = X.C273014lo.PRIMARY_LINK
            if (r10 == r0) goto L_0x0119
            if (r16 != 0) goto L_0x0116
            if (r15 != 0) goto L_0x0116
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
        L_0x00b9:
            boolean r0 = X.182.A06(r4, r5, r1)
            r1 = 0
            if (r0 != 0) goto L_0x0112
            if (r17 == 0) goto L_0x0101
            r2 = 2131976631(0x7f1361b7, float:1.9590388E38)
        L_0x00c5:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            X.HsR r0 = new X.HsR
            r0.<init>(r1, r2)
            X.VYj r4 = new X.VYj
            r4.<init>(r0, r10, r3, r11)
            X.0eM r0 = r8.A0B
            java.lang.Object r1 = r0.getValue()
            X.HsR r1 = (X.C56078HsR) r1
            com.instagram.model.mediasize.ImageInfo r0 = r7.A08
            if (r0 == 0) goto L_0x00ff
            com.instagram.model.mediasize.ExtendedImageUrl r0 = X.1iI.A03(r0)
        L_0x00e1:
            X.VTn r3 = new X.VTn
            r3.<init>(r1, r0)
            java.lang.String r2 = r7.A0J
            if (r2 != 0) goto L_0x00ec
            java.lang.String r2 = ""
        L_0x00ec:
            X.0eM r0 = r8.A0C
            java.lang.Object r0 = r0.getValue()
            X.HsR r0 = (X.C56078HsR) r0
            X.VWt r1 = new X.VWt
            r1.<init>(r0, r7, r2)
            X.VYk r0 = new X.VYk
            r0.<init>(r4, r3, r1, r6)
            return r0
        L_0x00ff:
            r0 = 0
            goto L_0x00e1
        L_0x0101:
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r7.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r0.A0C
            if (r0 == 0) goto L_0x0112
            java.lang.Boolean r0 = r0.A02
            boolean r0 = X.DbX.A1a(r0)
            r2 = 2131952356(0x7f1302e4, float:1.9541152E38)
            if (r0 != 0) goto L_0x00c5
        L_0x0112:
            r2 = 2131957177(0x7f1315b9, float:1.955093E38)
            goto L_0x00c5
        L_0x0116:
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            goto L_0x00b9
        L_0x0119:
            if (r16 != 0) goto L_0x0120
            if (r15 != 0) goto L_0x0120
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            goto L_0x00b9
        L_0x0120:
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            goto L_0x00b9
        L_0x0123:
            java.lang.String r3 = "add_to_bag"
            goto L_0x0047
        L_0x0127:
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            if (r17 == 0) goto L_0x013d
            goto L_0x0033
        L_0x012d:
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r7.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r0.A0C
            if (r0 == 0) goto L_0x0127
            java.lang.Boolean r0 = r0.A02
            boolean r0 = X.DbX.A1a(r0)
            if (r0 == 0) goto L_0x0127
            java.lang.Integer r11 = X.AnonymousClass05K.A00
        L_0x013d:
            X.4lo r10 = X.C273014lo.PRIMARY
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20593WvW.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}

package X;

import android.view.View;

public final class WA9 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    public WA9(Object obj, Object obj2, Object obj3, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj3;
        this.A03 = obj2;
        this.A04 = str;
        this.A05 = str2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v48, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v49, resolved type: java.util.List} */
    /* JADX WARNING: type inference failed for: r2v18, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04b8, code lost:
        if (r4 != null) goto L_0x0396;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03c2  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x04b0  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x04b4  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x04bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r36) {
        /*
            r35 = this;
            r2 = r35
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x00dd;
                case 1: goto L_0x00a7;
                case 2: goto L_0x0049;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = 2074400158(0x7ba4d59e, float:1.7117387E36)
            int r8 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r9 = r2.A01
            android.app.Activity r9 = (android.app.Activity) r9
            r0 = 2131972174(0x7f13504e, float:1.9581348E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r9, r0)
            X.Uz2 r3 = X.C16666Uz2.REPORT_AD_BUTTON
            java.lang.Object r10 = r2.A02
            X.4DU r10 = (X.AnonymousClass4DU) r10
            java.lang.Object r11 = r2.A03
            com.instagram.common.session.UserSession r11 = (com.instagram.common.session.UserSession) r11
            java.lang.String r14 = r2.A04
            java.lang.String r2 = r2.A05
            X.TpH r12 = X.C14068TpH.FEED
            X.UzD r13 = X.C16677UzD.AD
            X.OcF r1 = X.ORV.A01(r9, r10, r11, r12, r13, r14)
            r1.A0A = r0
            r0 = 0
            X.0qQ.A0B(r3, r0)
            r1.A02 = r3
            X.HH0 r0 = new X.HH0
            r0.<init>(r11, r10, r14, r2)
            r1.A03 = r0
            r0 = 0
            X.C71093OcF.A00(r0, r1)
            r0 = -579789591(0xffffffffdd711ce9, float:-1.0858761E18)
        L_0x0045:
            X.AnonymousClass0fD.A0C(r0, r8)
            return
        L_0x0049:
            r0 = 1104280884(0x41d1fd34, float:26.248634)
            int r8 = X.AnonymousClass0fD.A05(r0)
            java.lang.String r6 = r2.A04
            java.lang.String r5 = r2.A05
            java.lang.Object r4 = r2.A01
            X.2V1 r4 = (X.2V1) r4
            java.lang.Object r3 = r2.A02
            X.4DU r3 = (X.AnonymousClass4DU) r3
            java.lang.Object r2 = r2.A03
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            r0 = 1410(0x582, float:1.976E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "instagram_ad_"
            java.lang.String r1 = X.002.A0R(r0, r1)
            X.3sc r0 = new X.3sc
            r0.<init>(r3, r1)
            r0.A78 = r6
            r0.A7J = r5
            X.C233822wX.A0H(r2, r0, r3)
            android.content.Context r4 = r4.A0C
            r0 = 2131238721(0x7f081f41, float:1.8093729E38)
            android.graphics.drawable.Drawable r3 = r4.getDrawable(r0)
            if (r3 == 0) goto L_0x00a3
            X.1xC r2 = X.1xC.A01
            X.6ap r1 = new X.6ap
            r1.<init>()
            r1.A02()
            r0 = 2130970182(0x7f040646, float:1.7549067E38)
            int r0 = X.AnonymousClass7TF.A03(r4, r0)
            r1.A08(r3, r0)
            r0 = 2131954113(0x7f1309c1, float:1.9544716E38)
            X.DbS.A19(r4, r1, r0)
            r1.A06()
            X.DbY.A1K(r2, r1)
        L_0x00a3:
            r0 = 1051620369(0x3eae7411, float:0.34072927)
            goto L_0x0045
        L_0x00a7:
            r0 = 856663263(0x330fa4df, float:3.344473E-8)
            int r8 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r10 = r2.A01
            X.LSk r10 = (X.LSk) r10
            java.lang.String r14 = r2.A04
            java.lang.String r1 = r2.A05
            java.lang.Object r0 = r2.A02
            X.Dbv r0 = (X.C46327Dbv) r0
            X.Jqu r9 = X.LSk.A01(r0, r1)
            java.lang.String r11 = "user"
            r0 = 739(0x2e3, float:1.036E-42)
            java.lang.String r12 = X.AnonymousClass000.A00(r0)
            r0 = 407(0x197, float:5.7E-43)
            java.lang.String r13 = X.C273654mx.A00(r0)
            X.LSk.A02(r9, r10, r11, r12, r13, r14)
            java.lang.Object r0 = r2.A03
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x00d8
            r0.invoke()
        L_0x00d8:
            r0 = -905547027(0xffffffffca0672ed, float:-2202811.2)
            goto L_0x0045
        L_0x00dd:
            r0 = 2102895960(0x7d57a558, float:1.7915158E37)
            int r8 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A02
            X.UEL r0 = (X.UEL) r0
            com.instagram.ui.widget.autowidthtogglebutton.AutoWidthToggleButton r1 = r0.A08
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x012a
            float r1 = r1.getAlpha()
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x012a
            java.lang.String r1 = r2.A04
            if (r1 == 0) goto L_0x0112
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0112
            java.lang.Object r0 = r2.A01
            X.VPD r0 = (X.VPD) r0
            X.Uam r0 = r0.A00
            X.C15337Uam.A04(r0, r1)
            r0 = -1806660157(0xffffffff94508dc3, float:-1.0529274E-26)
            goto L_0x0045
        L_0x0112:
            java.lang.String r1 = r2.A05
            if (r1 == 0) goto L_0x012a
            int r0 = r1.length()
            if (r0 == 0) goto L_0x012a
            java.lang.Object r0 = r2.A01
            X.VPD r0 = (X.VPD) r0
            X.Uam r0 = r0.A00
            X.C15337Uam.A04(r0, r1)
            r0 = 1616829736(0x605edd28, float:6.4236143E19)
            goto L_0x0045
        L_0x012a:
            java.lang.Object r4 = r2.A01
            X.VPD r4 = (X.VPD) r4
            java.lang.Object r1 = r2.A03
            X.WST r1 = (X.WST) r1
            X.UKo r0 = r1.A01
            java.lang.String r1 = r1.A02
            r34 = r1
            r5 = 0
            r1 = 1
            X.UxQ r6 = r0.A06
            X.UxQ r9 = X.C16573UxQ.SELECT
            if (r6 == r9) goto L_0x0298
            X.UxQ r2 = X.C16573UxQ.MULTI_SELECT
            if (r6 == r2) goto L_0x0298
            X.UxQ r3 = X.C16573UxQ.ROUTE
            r2 = 0
            if (r6 != r3) goto L_0x020b
            X.JwC r3 = r0.A02
            if (r3 == 0) goto L_0x061f
            java.lang.Object r6 = r3.A01
            X.JV7 r6 = (X.JV7) r6
            if (r6 == 0) goto L_0x061f
            X.Uam r4 = r4.A00
            X.0eM r3 = r4.A07
            java.lang.Object r7 = r3.getValue()
            com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments r7 = (com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments) r7
            X.0qQ.A0B(r7, r1)
            java.lang.String r3 = r7.A0B
            r23 = r3
            java.lang.Integer r3 = r7.A07
            r33 = r3
            X.Uxb r3 = r7.A03
            r32 = r3
            java.lang.String r3 = r7.A0G
            r28 = r3
            X.0sn r10 = X.0sn.A00
            com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState r9 = new com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r16 = r10
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r3 = r7.A0F
            r27 = r3
            java.lang.String r3 = r7.A0E
            r26 = r3
            java.util.List r3 = r7.A0H
            r29 = r3
            com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState r9 = r7.A04
            com.instagram.pendingmedia.model.ClipInfo r3 = r7.A02
            r31 = r3
            java.lang.Long r3 = r7.A08
            r20 = r3
            java.lang.String r3 = r7.A09
            r19 = r3
            java.lang.String r3 = r7.A0A
            r18 = r3
            com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r13 = r7.A06
            java.lang.String r12 = r6.A02
            java.lang.String r11 = r6.A01
            java.lang.Object r10 = r6.A00
            com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader r10 = (com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader) r10
            X.0qQ.A0B(r10, r5)
            X.0eM r3 = r4.A0B
            com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r3 = X.C14784U8u.A00(r3)
            java.util.List r17 = X.C64032LJw.A00(r3)
            java.util.ArrayList r15 = X.AnonymousClass7TF.A0p(r17)
            java.util.Iterator r16 = r17.iterator()
        L_0x01bb:
            boolean r3 = r16.hasNext()
            java.lang.String r14 = ""
            if (r3 == 0) goto L_0x01df
            java.lang.Object r3 = r16.next()
            com.instagram.user.model.Product r3 = (com.instagram.user.model.Product) r3
            java.lang.String r7 = r3.A0H
            com.instagram.user.model.User r3 = r3.A0B
            if (r3 == 0) goto L_0x01d6
            java.lang.String r3 = X.AnonymousClass3ZA.A00(r3)
            if (r3 == 0) goto L_0x01d6
            r14 = r3
        L_0x01d6:
            com.instagram.model.shopping.CompoundProductId r3 = new com.instagram.model.shopping.CompoundProductId
            r3.<init>(r7, r14)
            r15.add(r3)
            goto L_0x01bb
        L_0x01df:
            java.util.List r3 = X.00k.A0W(r15)
            X.0qQ.A0B(r3, r5)
            r9.A05 = r3
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r17)
            java.util.Iterator r15 = r17.iterator()
        L_0x01f0:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L_0x0583
            java.lang.Object r3 = r15.next()
            com.instagram.user.model.Product r3 = (com.instagram.user.model.Product) r3
            com.instagram.user.model.User r3 = r3.A0B
            if (r3 == 0) goto L_0x0206
            java.lang.String r3 = X.AnonymousClass3ZA.A00(r3)
            if (r3 != 0) goto L_0x0207
        L_0x0206:
            r3 = r14
        L_0x0207:
            r7.add(r3)
            goto L_0x01f0
        L_0x020b:
            X.UxQ r1 = X.C16573UxQ.TOAST
            if (r6 != r1) goto L_0x0241
            X.JwC r1 = r0.A02
            if (r1 == 0) goto L_0x061f
            java.lang.Object r1 = r1.A03
            X.BBV r1 = (X.BBV) r1
            if (r1 == 0) goto L_0x061f
            X.Uam r4 = r4.A00
            java.lang.String r1 = r1.A00
            X.C15337Uam.A04(r4, r1)
            X.ULE r3 = X.C13991Tnr.A0U(r4)
            if (r3 == 0) goto L_0x061f
            X.0eM r1 = r4.A09
            java.lang.Object r9 = r1.getValue()
            X.Vjb r9 = (X.C17999Vjb) r9
            X.Jw0 r10 = r3.A00
            java.lang.String r17 = X.C13991Tnr.A0i(r4)
            r11 = r2
            r12 = r0
            r13 = r34
            r14 = r2
            r15 = r2
            r16 = r2
            r9.A00(r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x061f
        L_0x0241:
            X.UxQ r1 = X.C16573UxQ.DIRECT_TO_PDP
            if (r6 != r1) goto L_0x061f
            X.UxE r3 = r0.A07
            X.UxE r1 = X.C16562UxE.PRODUCT
            if (r3 != r1) goto L_0x061f
            X.JwL r1 = r0.A00
            if (r1 == 0) goto L_0x061f
            java.lang.Object r1 = r1.A01
            com.instagram.user.model.ProductDetailsProductItemDict r1 = (com.instagram.user.model.ProductDetailsProductItemDict) r1
            if (r1 == 0) goto L_0x061f
            com.instagram.user.model.Product r13 = X.C14502TxO.A00(r1)
            X.Uam r12 = r4.A00
            X.3kF r9 = X.C249713kF.A00
            androidx.fragment.app.FragmentActivity r10 = r12.requireActivity()
            X.0eM r1 = r12.A0C
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r1)
            X.0eM r1 = r12.A0D
            java.lang.String r15 = X.DbS.A0t(r1)
            java.lang.String r14 = "affiliate_discovery"
            X.WNN r1 = r9.A0L(r10, r11, r12, r13, r14, r15)
            X.WNN.A01(r1)
            X.ULE r3 = X.C13991Tnr.A0U(r12)
            if (r3 == 0) goto L_0x061f
            X.0eM r1 = r12.A09
            java.lang.Object r9 = r1.getValue()
            X.Vjb r9 = (X.C17999Vjb) r9
            X.Jw0 r10 = r3.A00
            com.instagram.api.schemas.ProductAffiliateInformationDict r11 = r13.A04
            java.lang.String r17 = X.C13991Tnr.A0i(r12)
            r12 = r0
            r13 = r34
            r14 = r2
            r15 = r2
            r16 = r2
            r9.A00(r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x061f
        L_0x0298:
            X.UxE r3 = r0.A07
            X.UxE r2 = X.C16562UxE.PRODUCT
            if (r3 != r2) goto L_0x04f4
            X.JwL r2 = r0.A00
            if (r2 == 0) goto L_0x061f
            java.lang.Object r2 = r2.A01
            com.instagram.user.model.ProductDetailsProductItemDict r2 = (com.instagram.user.model.ProductDetailsProductItemDict) r2
            if (r2 == 0) goto L_0x061f
            com.instagram.user.model.Product r7 = X.C14502TxO.A00(r2)
            X.Uam r6 = r4.A00
            boolean r2 = r0.A08
            if (r2 == 0) goto L_0x0374
            boolean r2 = r7.A0Q
            if (r2 != 0) goto L_0x02c7
            X.3kF r2 = X.C249713kF.A00
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            X.0eM r0 = r6.A0C
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            r2.A13(r1, r0, r7)
            goto L_0x061f
        L_0x02c7:
            X.0eM r4 = r6.A0B
            java.lang.Object r10 = r4.getValue()
            X.U8u r10 = (X.C14784U8u) r10
            X.JwC r2 = r0.A02
            if (r2 == 0) goto L_0x02f8
            java.lang.Object r2 = r2.A00
            X.Jw2 r2 = (X.C61064Jw2) r2
            if (r2 == 0) goto L_0x02f8
            java.lang.String r3 = r2.A02
        L_0x02db:
            X.0Ud r2 = r10.A04
            java.lang.Object r2 = r2.getValue()
            com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r2 = (com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState) r2
            boolean r3 = X.C64032LJw.A01(r2, r7, r3)
            r2 = 0
            if (r3 != 0) goto L_0x033b
            com.instagram.igds.components.search.IgdsInlineSearchBox r2 = r6.A02
            if (r2 != 0) goto L_0x02fa
            java.lang.String r0 = "searchBox"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x02f8:
            r3 = 0
            goto L_0x02db
        L_0x02fa:
            r2.A03()
            X.0eM r11 = r6.A0C
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r11)
            X.Liw r2 = X.C17053VGb.A00(r2)
            r2.A06(r1)
            androidx.fragment.app.FragmentActivity r10 = r6.requireActivity()
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r11)
            X.0eM r2 = r6.A07
            r2.getValue()
            java.util.List r4 = r7.A0O
            if (r4 == 0) goto L_0x0369
            X.W27 r2 = new X.W27
            r2.<init>(r10, r3, r5)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L_0x0330
            java.lang.IllegalStateException r0 = X.DbT.A0m()
            throw r0
        L_0x0330:
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L_0x0363
            java.lang.IllegalStateException r0 = X.DbT.A0m()
            throw r0
        L_0x033b:
            X.JwC r1 = r0.A02
            if (r1 == 0) goto L_0x0354
            java.lang.Object r1 = r1.A00
            if (r1 == 0) goto L_0x0354
            java.lang.Object r3 = r4.getValue()
            X.U8u r3 = (X.C14784U8u) r3
            X.ULE r1 = X.C13991Tnr.A0U(r6)
            if (r1 == 0) goto L_0x0351
            java.util.List r2 = r1.A03
        L_0x0351:
            r3.A02(r0, r7, r2)
        L_0x0354:
            java.lang.Object r1 = r4.getValue()
            X.U8u r1 = (X.C14784U8u) r1
            X.Jhq r0 = X.C15337Uam.A01(r6)
            X.C15337Uam.A03(r6, r1, r0)
            goto L_0x061f
        L_0x0363:
            r4.size()
            r3.size()
        L_0x0369:
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r11)
            X.Liw r2 = X.C17053VGb.A00(r2)
            r2.A06(r5)
        L_0x0374:
            boolean r2 = r7.A0Q
            if (r2 != 0) goto L_0x0389
            X.3kF r2 = X.C249713kF.A00
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            X.0eM r0 = r6.A0C
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            r2.A13(r1, r0, r7)
            goto L_0x061f
        L_0x0389:
            X.JwC r4 = r0.A02
            r2 = 0
            if (r4 == 0) goto L_0x04b7
            java.lang.Object r3 = r4.A02
            X.JwE r3 = (X.C61076JwE) r3
            if (r3 == 0) goto L_0x04b7
            java.lang.String r5 = r3.A01
        L_0x0396:
            java.lang.Object r3 = r4.A02
            X.JwE r3 = (X.C61076JwE) r3
            if (r3 == 0) goto L_0x04bc
            java.lang.Object r4 = r3.A00
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r4 = (com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta) r4
        L_0x03a0:
            X.0eM r11 = r6.A0B
            java.lang.Object r12 = r11.getValue()
            X.U8u r12 = (X.C14784U8u) r12
            X.JwC r3 = r0.A02
            if (r3 == 0) goto L_0x04b4
            java.lang.Object r3 = r3.A00
            X.Jw2 r3 = (X.C61064Jw2) r3
            if (r3 == 0) goto L_0x04b4
            java.lang.String r10 = r3.A02
        L_0x03b4:
            X.0Ud r3 = r12.A04
            java.lang.Object r3 = r3.getValue()
            com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r3 = (com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState) r3
            boolean r3 = X.C64032LJw.A01(r3, r7, r10)
            if (r3 == 0) goto L_0x04b0
            java.lang.String r19 = "deselect"
        L_0x03c4:
            X.0eM r10 = r6.A09
            java.lang.Object r12 = r10.getValue()
            X.Vjb r12 = (X.C17999Vjb) r12
            X.Jhq r3 = X.C15337Uam.A01(r6)
            X.2Fk r3 = r3.A00
            java.lang.Object r3 = r3.A02()
            X.0qQ.A0A(r3)
            X.ULE r3 = (X.ULE) r3
            X.Jw0 r13 = r3.A00
            java.lang.String r3 = r7.A0H
            com.instagram.api.schemas.ProductAffiliateInformationDict r14 = r7.A04
            java.lang.String r20 = X.C13991Tnr.A0i(r6)
            r21 = 0
            r15 = r0
            r16 = r34
            r17 = r2
            r18 = r3
            r12.A00(r13, r14, r15, r16, r17, r18, r19, r20)
            X.UxQ r12 = r0.A06
            if (r12 != r9) goto L_0x04bf
            X.ULE r0 = X.C13991Tnr.A0U(r6)
            if (r0 == 0) goto L_0x042f
            X.Jw0 r12 = r0.A00
            if (r12 == 0) goto L_0x042f
            java.lang.Object r13 = r10.getValue()
            X.Vjb r13 = (X.C17999Vjb) r13
            if (r4 == 0) goto L_0x04ad
            java.lang.String r11 = r4.A01
        L_0x0409:
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            com.instagram.user.model.User r0 = r7.A0B
            if (r0 == 0) goto L_0x04aa
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r0)
        L_0x0416:
            X.0qQ.A0A(r0)
            java.lang.Long r9 = X.DbV.A0q(r0)
            java.lang.Long r0 = X.DbV.A0q(r3)
            java.lang.Long[] r0 = new java.lang.Long[]{r0}
            java.util.ArrayList r0 = X.0sr.A1L(r0)
            r10.put(r9, r0)
            r13.A01(r12, r11, r10)
        L_0x042f:
            X.0eM r0 = r6.A0C
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.Liw r18 = X.C17053VGb.A00(r0)
            X.ULE r0 = X.C13991Tnr.A0U(r6)
            if (r0 == 0) goto L_0x04a8
            X.Jw0 r0 = r0.A00
            if (r0 == 0) goto L_0x04a8
            java.lang.Object r0 = r0.A01
            com.instagram.shopping.model.taggingfeed.SourceType r0 = (com.instagram.shopping.model.taggingfeed.SourceType) r0
            if (r0 == 0) goto L_0x04a8
            java.lang.String r9 = r0.A00
        L_0x044b:
            com.instagram.user.model.User r0 = r7.A0B
            if (r0 == 0) goto L_0x0453
            java.lang.String r2 = X.AnonymousClass3ZA.A00(r0)
        L_0x0453:
            boolean r0 = r7.A04()
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r0)
            r22 = r2
            r23 = r3
            r24 = r1
            r20 = r9
            r18.A04(r19, r20, r21, r22, r23, r24)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            X.W2E r1 = new X.W2E
            r1.<init>(r7)
            X.0eM r7 = r6.A07
            com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation r0 = X.C15337Uam.A00(r7)
            r1.A0D = r0
            com.instagram.user.model.Product r1 = r1.A03(r3)
            java.lang.String r0 = "selected_product"
            r2.putExtra(r0, r1)
            r0 = 1873(0x751, float:2.625E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putExtra(r0, r4)
            java.lang.Object r0 = r7.getValue()
            com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments r0 = (com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments) r0
            java.lang.String r1 = r0.A0E
            java.lang.String r0 = "tagging_info_id"
            r2.putExtra(r0, r1)
            r0 = 1844(0x734, float:2.584E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putExtra(r0, r5)
            X.DbX.A17(r2, r6)
            X.DbT.A1K(r6)
            goto L_0x061f
        L_0x04a8:
            r9 = r2
            goto L_0x044b
        L_0x04aa:
            r0 = r2
            goto L_0x0416
        L_0x04ad:
            r11 = r2
            goto L_0x0409
        L_0x04b0:
            java.lang.String r19 = "select"
            goto L_0x03c4
        L_0x04b4:
            r10 = 0
            goto L_0x03b4
        L_0x04b7:
            r5 = r2
            if (r4 == 0) goto L_0x04bc
            goto L_0x0396
        L_0x04bc:
            r4 = r2
            goto L_0x03a0
        L_0x04bf:
            X.UxQ r1 = X.C16573UxQ.MULTI_SELECT
            if (r12 != r1) goto L_0x061f
            java.lang.Object r5 = r11.getValue()
            X.U8u r5 = (X.C14784U8u) r5
            X.W2E r4 = new X.W2E
            r4.<init>(r7)
            X.0eM r1 = r6.A07
            com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation r1 = X.C15337Uam.A00(r1)
            r4.A0D = r1
            com.instagram.user.model.Product r3 = r4.A03(r3)
            X.ULE r1 = X.C13991Tnr.A0U(r6)
            if (r1 == 0) goto L_0x04e2
            java.util.List r2 = r1.A03
        L_0x04e2:
            r5.A02(r0, r3, r2)
            java.lang.Object r1 = r11.getValue()
            X.U8u r1 = (X.C14784U8u) r1
            X.Jhq r0 = X.C15337Uam.A01(r6)
            X.C15337Uam.A03(r6, r1, r0)
            goto L_0x061f
        L_0x04f4:
            X.UxE r1 = X.C16562UxE.COLLECTION
            if (r3 != r1) goto L_0x061f
            X.JwL r1 = r0.A00
            if (r1 == 0) goto L_0x061f
            java.lang.Object r7 = r1.A00
            com.instagram.user.model.ProductCollectionImpl r7 = (com.instagram.user.model.ProductCollectionImpl) r7
            if (r7 == 0) goto L_0x061f
            X.Uam r4 = r4.A00
            X.0eM r6 = r4.A0B
            com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r1 = X.C14784U8u.A00(r6)
            X.0qQ.A0B(r1, r5)
            java.util.Map r1 = r1.A02
            java.lang.String r3 = r7.Aoi()
            boolean r1 = r1.containsKey(r3)
            if (r1 == 0) goto L_0x0580
            java.lang.String r16 = "deselect"
        L_0x051b:
            X.UxQ r2 = r0.A06
            X.UxQ r1 = X.C16573UxQ.MULTI_SELECT
            if (r2 != r1) goto L_0x061f
            java.lang.Object r2 = r6.getValue()
            X.U8u r2 = (X.C14784U8u) r2
            X.ULE r1 = X.C13991Tnr.A0U(r4)
            if (r1 == 0) goto L_0x057e
            java.util.List r1 = r1.A03
        L_0x052f:
            r10 = 19
            X.IxF r5 = new X.IxF
            r9 = r5
            r11 = r0
            r12 = r2
            r13 = r1
            r14 = r7
            r9.<init>(r10, r11, r12, r13, r14)
            X.0Ud r1 = r2.A04
            java.lang.Object r1 = r1.getValue()
            X.05G r2 = r2.A03
            java.lang.Object r1 = r5.invoke(r1)
            r2.Epw(r1)
            java.lang.Object r2 = r6.getValue()
            X.U8u r2 = (X.C14784U8u) r2
            X.Jhq r1 = X.C15337Uam.A01(r4)
            X.C15337Uam.A03(r4, r2, r1)
            X.0eM r1 = r4.A09
            java.lang.Object r9 = r1.getValue()
            X.Vjb r9 = (X.C17999Vjb) r9
            X.Jhq r1 = X.C15337Uam.A01(r4)
            X.2Fk r1 = r1.A00
            java.lang.Object r1 = r1.A02()
            if (r1 == 0) goto L_0x0624
            X.ULE r1 = (X.ULE) r1
            X.Jw0 r10 = r1.A00
            r11 = 0
            java.lang.String r17 = X.C13991Tnr.A0i(r4)
            r12 = r0
            r13 = r34
            r14 = r11
            r15 = r3
            r9.A00(r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x061f
        L_0x057e:
            r1 = 0
            goto L_0x052f
        L_0x0580:
            java.lang.String r16 = "select"
            goto L_0x051b
        L_0x0583:
            java.util.List r3 = X.00k.A0W(r7)
            X.0qQ.A0B(r3, r5)
            r9.A04 = r3
            r21 = r19
            r22 = r18
            r24 = r11
            r25 = r12
            r30 = r5
            r14 = r31
            r15 = r32
            r16 = r9
            r17 = r10
            r18 = r13
            r19 = r33
            com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments r12 = X.C64174LSb.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            X.0eM r7 = r4.A0C
            X.6Yo r10 = X.DbX.A0N(r3, r7)
            X.3kF r3 = X.C249713kF.A00
            X.W3Y r11 = r3.A0T()
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r7)
            X.0eM r3 = r4.A0D
            java.lang.String r3 = X.DbS.A0t(r3)
            X.Uam r3 = r11.A0H(r9, r12, r3)
            r18 = 0
            r10.A0B(r2, r3)
            r9 = 2130772095(0x7f01007f, float:1.7147299E38)
            r3 = 2130772066(0x7f010062, float:1.714724E38)
            r10.A0A(r9, r3, r5, r5)
            r10.A04()
            X.ULE r5 = X.C13991Tnr.A0U(r4)
            if (r5 == 0) goto L_0x061f
            X.0eM r3 = r4.A09
            java.lang.Object r9 = r3.getValue()
            X.Vjb r9 = (X.C17999Vjb) r9
            X.Jw0 r10 = r5.A00
            java.lang.String r5 = r6.A02
            java.lang.String r3 = r6.A01
            java.lang.String r17 = X.C13991Tnr.A0i(r4)
            r11 = r2
            r12 = r0
            r13 = r34
            r14 = r5
            r15 = r3
            r16 = r2
            r9.A00(r10, r11, r12, r13, r14, r15, r16, r17)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r7)
            X.Liw r17 = X.C17053VGb.A00(r0)
            X.ULE r0 = X.C13991Tnr.A0U(r4)
            if (r0 == 0) goto L_0x0612
            X.Jw0 r0 = r0.A00
            if (r0 == 0) goto L_0x0612
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x0612
            java.lang.String r2 = r0.toString()
        L_0x0612:
            r19 = r2
            r20 = r11
            r21 = r11
            r22 = r11
            r23 = r1
            r17.A04(r18, r19, r20, r21, r22, r23)
        L_0x061f:
            r0 = -1785968618(0xffffffff958c4816, float:-5.665928E-26)
            goto L_0x0045
        L_0x0624:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WA9.onClick(android.view.View):void");
    }
}

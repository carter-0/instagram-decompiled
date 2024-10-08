package X;

import android.view.View;

public final class WB5 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public WB5(C15328Uac uac, C16680UzG uzG, String str, int i) {
        this.A00 = i;
        switch (i) {
            case 3:
            case 4:
            case 5:
                this.A02 = uac;
                this.A03 = str;
                break;
            default:
                this.A03 = str;
                this.A02 = uac;
                break;
        }
        this.A01 = uzG;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002f, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02fa, code lost:
        X.0qQ.A0F("adsManagerLogger");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0303, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x02bd;
                case 1: goto L_0x027a;
                case 2: goto L_0x024c;
                case 3: goto L_0x020f;
                case 4: goto L_0x01cc;
                case 5: goto L_0x019e;
                case 6: goto L_0x0139;
                case 7: goto L_0x00fc;
                case 8: goto L_0x00d3;
                case 9: goto L_0x00b8;
                case 10: goto L_0x009d;
                case 11: goto L_0x0083;
                case 12: goto L_0x005d;
                case 13: goto L_0x0037;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = -1871643388(0xffffffff9070fd04, float:-4.752657E-29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r12.A01
            X.UCw r1 = (X.C14868UCw) r1
            com.instagram.igds.components.checkbox.IgdsCheckBox r2 = r1.A01
            boolean r1 = r2.isChecked()
            r1 = r1 ^ 1
            r2.setChecked(r1)
            boolean r3 = r2.isChecked()
            java.lang.Object r1 = r12.A02
            X.U9s r1 = (X.C14798U9s) r1
            java.util.List r2 = r1.A01
            java.lang.String r1 = r12.A03
            if (r3 == 0) goto L_0x0033
            r2.add(r1)
        L_0x002c:
            r1 = 1888205610(0x708bbb2a, float:3.4595747E29)
        L_0x002f:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x0033:
            r2.remove(r1)
            goto L_0x002c
        L_0x0037:
            r0 = -889419176(0xffffffffcafc8a58, float:-8275244.0)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r12.A02
            com.instagram.model.shopping.productfeed.ProductFeedItem r1 = (com.instagram.model.shopping.productfeed.ProductFeedItem) r1
            com.instagram.user.model.Product r6 = r1.A02()
            if (r6 == 0) goto L_0x0059
            java.lang.Object r5 = r12.A01
            X.X9a r5 = (X.C21003X9a) r5
            java.lang.String r4 = r12.A03
            r3 = 0
            r2 = 2045(0x7fd, float:2.866E-42)
            X.ULV r1 = new X.ULV
            r1.<init>(r3, r4, r3, r2)
            r5.DZY(r1, r6)
        L_0x0059:
            r1 = -1903428806(0xffffffff8e8bfb3a, float:-3.4508068E-30)
            goto L_0x002f
        L_0x005d:
            r0 = 1834757704(0x6d5c2e48, float:4.2589158E27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r12.A02
            com.instagram.model.shopping.productfeed.ProductFeedItem r1 = (com.instagram.model.shopping.productfeed.ProductFeedItem) r1
            com.instagram.user.model.Product r6 = r1.A02()
            if (r6 == 0) goto L_0x007f
            java.lang.Object r5 = r12.A01
            X.X9a r5 = (X.C21003X9a) r5
            java.lang.String r4 = r12.A03
            r3 = 0
            r2 = 2045(0x7fd, float:2.866E-42)
            X.ULV r1 = new X.ULV
            r1.<init>(r3, r4, r3, r2)
            r5.DZY(r1, r6)
        L_0x007f:
            r1 = -2119295374(0xffffffff81ae1e72, float:-6.396119E-38)
            goto L_0x002f
        L_0x0083:
            r0 = -771346747(0xffffffffd2062ec5, float:-1.4407757E11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r12.A02
            X.Ur2 r4 = (X.C16239Ur2) r4
            java.lang.String r3 = r12.A03
            java.lang.Object r2 = r12.A01
            X.Vjd r2 = (X.C18001Vjd) r2
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r1 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.APPROVED
            X.C16239Ur2.A00(r1, r4, r2, r3)
            r1 = -1095198990(0xffffffffbeb896f2, float:-0.36052662)
            goto L_0x002f
        L_0x009d:
            r0 = -1051994707(0xffffffffc14bd5ad, float:-12.739667)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r12.A01
            X.X4r r3 = (X.C20926X4r) r3
            if (r3 == 0) goto L_0x00b3
            java.lang.Object r2 = r12.A02
            com.instagram.model.shopping.ProductVariantDimension r2 = (com.instagram.model.shopping.ProductVariantDimension) r2
            java.lang.String r1 = r12.A03
            r3.Dx4(r2, r1)
        L_0x00b3:
            r1 = 2017713403(0x7843dcfb, float:1.5890311E34)
            goto L_0x002f
        L_0x00b8:
            r0 = 527579192(0x1f723838, float:5.1291996E-20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r12.A01
            X.X4r r3 = (X.C20926X4r) r3
            if (r3 == 0) goto L_0x00ce
            java.lang.Object r2 = r12.A02
            com.instagram.model.shopping.ProductVariantDimension r2 = (com.instagram.model.shopping.ProductVariantDimension) r2
            java.lang.String r1 = r12.A03
            r3.Dx4(r2, r1)
        L_0x00ce:
            r1 = 1236284863(0x49b035bf, float:1443511.9)
            goto L_0x002f
        L_0x00d3:
            r0 = 2023561493(0x789d1915, float:2.5490604E34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r12.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r12.A03
            boolean r1 = r3.isAdded()
            if (r1 == 0) goto L_0x00f7
            android.content.Context r1 = r3.requireContext()
            X.0nC.A00(r1, r2)
            android.content.Context r2 = r3.requireContext()
            r1 = 2131965058(0x7f133482, float:1.9566915E38)
            X.C59689JTv.A07(r2, r1)
        L_0x00f7:
            r1 = 7059772(0x6bb93c, float:9.892848E-39)
            goto L_0x002f
        L_0x00fc:
            r0 = -598598892(0xffffffffdc521b14, float:-2.36558071E17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r12.A02
            X.UbJ r4 = (X.C15366UbJ) r4
            com.instagram.api.schemas.IGCTMessagingAdsInfoDict r2 = r4.A01
            X.Gal r5 = r4.A06
            com.instagram.api.schemas.OnFeedMessagesIntf r1 = r4.A02
            if (r1 == 0) goto L_0x012a
            if (r5 == 0) goto L_0x012a
            if (r2 == 0) goto L_0x012a
            java.lang.String r7 = r4.A09
            if (r7 != 0) goto L_0x0119
            java.lang.String r7 = "-1"
        L_0x0119:
            long r10 = X.C16947VBz.A00(r2)
            java.lang.Object r6 = r12.A01
            java.lang.Long r6 = (java.lang.Long) r6
            java.lang.String r8 = r12.A03
            java.lang.String r9 = X.AnonymousClass3ZN.A00(r1)
            r5.A06(r6, r7, r8, r9, r10)
        L_0x012a:
            java.lang.String r3 = r12.A03
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r13)
            r1 = 0
            X.C15366UbJ.A00(r2, r4, r3, r1)
            r1 = -1705561920(0xffffffff9a5730c0, float:-4.4500338E-23)
            goto L_0x002f
        L_0x0139:
            r0 = 2140486433(0x7f953b21, float:NaN)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.String r8 = r12.A03
            if (r8 == 0) goto L_0x0188
            java.lang.Object r6 = r12.A02
            X.Uac r6 = (X.C15328Uac) r6
            java.util.List r1 = r6.A0c
            r9 = 0
            X.0qQ.A0B(r1, r9)
            java.util.Iterator r2 = r1.iterator()
        L_0x0152:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x018d
            java.lang.Object r5 = r2.next()
            X.X9b r5 = (X.C21004X9b) r5
            java.lang.String r1 = r5.BYo()
            boolean r1 = X.0qQ.A0K(r1, r8)
            if (r1 == 0) goto L_0x0152
            X.WOi r5 = (X.C19176WOi) r5
            if (r5 == 0) goto L_0x018d
            java.lang.Object r7 = r12.A01
            com.instagram.common.typedurl.ImageUrl r3 = r5.C73()
            com.instagram.business.promote.model.InstagramMediaProductType r2 = r5.BHn()
            com.instagram.business.promote.model.InstagramMediaProductType r1 = com.instagram.business.promote.model.InstagramMediaProductType.STORY
            boolean r2 = X.AnonymousClass7TF.A1W(r2, r1)
            android.content.Context r1 = r6.requireContext()
            X.Of9 r4 = new X.Of9
            r4.<init>(r5, r6, r7, r8, r9)
            X.W3M.A03(r1, r4, r6, r3, r2)
        L_0x0188:
            r1 = 190197844(0xb563054, float:4.125126E-32)
            goto L_0x002f
        L_0x018d:
            X.VwK r4 = r6.A07
            if (r4 == 0) goto L_0x02fa
            java.lang.String r3 = "ads_manager_highlights_hub"
            java.lang.String r2 = "active"
            java.lang.String r1 = "FB Login failed or cancelled"
            r4.A07(r3, r2, r8, r1)
            X.C13990Tnq.A0w(r6)
            goto L_0x0188
        L_0x019e:
            r0 = 580121671(0x2293f447, float:4.010307E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r12.A02
            X.Uac r3 = (X.C15328Uac) r3
            android.content.Context r2 = r3.requireContext()
            androidx.fragment.app.FragmentActivity r4 = r3.requireActivity()
            X.0eM r1 = r3.A0f
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r9 = r12.A03
            X.VwK r5 = r3.A07
            if (r5 == 0) goto L_0x02fa
            java.lang.Object r6 = r12.A01
            X.UzG r6 = (X.C16680UzG) r6
            java.lang.String r10 = "promote_ads_manager_fragment"
            r7 = r3
            X.C18145VmL.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = 1355724294(0x50ceb606, float:2.77442847E10)
            goto L_0x002f
        L_0x01cc:
            r0 = -229253196(0xfffffffff255dfb4, float:-4.2362078E30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r12.A02
            X.Uac r8 = (X.C15328Uac) r8
            android.content.Context r7 = r8.requireContext()
            X.0eM r1 = r8.A0f
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r5 = r12.A03
            X.VwK r4 = r8.A07
            if (r4 == 0) goto L_0x02fa
            java.lang.Object r2 = r12.A01
            X.UzG r2 = (X.C16680UzG) r2
            java.lang.String r3 = "ads_manager_highlights_hub"
            r1 = 1
            X.0qQ.A0B(r6, r1)
            if (r5 == 0) goto L_0x020a
            java.lang.String r2 = X.W3M.A01(r2)
            r1 = 0
            r4.A0A(r3, r2, r5, r1)
            X.1Yh r2 = X.C18138VmE.A00()
            X.1Yg r1 = X.VA4.A00()
            X.W29 r1 = r1.A00(r7, r6, r5, r3)
            r2.A06(r8, r1, r8)
        L_0x020a:
            r1 = 979729302(0x3a657b96, float:8.7540725E-4)
            goto L_0x002f
        L_0x020f:
            r0 = -157904670(0xfffffffff69690e2, float:-1.5269201E33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r12.A02
            X.Uac r2 = (X.C15328Uac) r2
            androidx.fragment.app.FragmentActivity r7 = r2.requireActivity()
            X.0eM r1 = r2.A0f
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r5 = r12.A03
            X.VwK r4 = r2.A07
            if (r4 == 0) goto L_0x02fa
            java.lang.Object r2 = r12.A01
            X.UzG r2 = (X.C16680UzG) r2
            java.lang.String r3 = "ads_manager_highlights_hub"
            r1 = 1
            X.0qQ.A0B(r6, r1)
            if (r5 == 0) goto L_0x0247
            java.lang.String r2 = X.W3M.A01(r2)
            r1 = 0
            r4.A0A(r3, r2, r1, r1)
            X.WOF r2 = new X.WOF
            r2.<init>(r7, r4, r6, r5)
            r1 = 0
            X.C18676VwZ.A02(r7, r2, r6, r1)
        L_0x0247:
            r1 = -28304142(0xfffffffffe501cf2, float:-6.915743E37)
            goto L_0x002f
        L_0x024c:
            r0 = 1051923540(0x3eb31454, float:0.34976447)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r12.A02
            X.UZU r3 = (X.UZU) r3
            android.content.Context r2 = r3.requireContext()
            androidx.fragment.app.FragmentActivity r4 = r3.requireActivity()
            X.0eM r1 = r3.A0B
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r9 = r12.A03
            X.VwK r5 = r3.A00
            if (r5 == 0) goto L_0x02fa
            java.lang.Object r6 = r12.A01
            X.UzG r6 = (X.C16680UzG) r6
            java.lang.String r10 = "promote_ads_manager_highlights_hub_see_all_fragment"
            r7 = r3
            X.C18145VmL.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = -354336211(0xffffffffeae1422d, float:-1.3616041E26)
            goto L_0x002f
        L_0x027a:
            r0 = -1560396576(0xffffffffa2fe3ce0, float:-6.891129E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r12.A02
            X.UZU r8 = (X.UZU) r8
            android.content.Context r7 = r8.requireContext()
            X.0eM r1 = r8.A0B
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r5 = r12.A03
            X.VwK r4 = r8.A00
            if (r4 == 0) goto L_0x02fa
            java.lang.Object r2 = r12.A01
            X.UzG r2 = (X.C16680UzG) r2
            java.lang.String r3 = "ads_manager_highlights_hub"
            r1 = 1
            X.0qQ.A0B(r6, r1)
            if (r5 == 0) goto L_0x02b8
            java.lang.String r2 = X.W3M.A01(r2)
            r1 = 0
            r4.A0A(r3, r2, r5, r1)
            X.1Yh r2 = X.C18138VmE.A00()
            X.1Yg r1 = X.VA4.A00()
            X.W29 r1 = r1.A00(r7, r6, r5, r3)
            r2.A06(r8, r1, r8)
        L_0x02b8:
            r1 = 278821688(0x109e7b38, float:6.250986E-29)
            goto L_0x002f
        L_0x02bd:
            r0 = 236527795(0xe1920b3, float:1.887445E-30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r12.A02
            X.UZU r2 = (X.UZU) r2
            androidx.fragment.app.FragmentActivity r7 = r2.requireActivity()
            X.0eM r1 = r2.A0B
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r5 = r12.A03
            X.VwK r4 = r2.A00
            if (r4 == 0) goto L_0x02fa
            java.lang.Object r2 = r12.A01
            X.UzG r2 = (X.C16680UzG) r2
            java.lang.String r3 = "ads_manager_highlights_hub"
            r1 = 1
            X.0qQ.A0B(r6, r1)
            if (r5 == 0) goto L_0x02f5
            java.lang.String r2 = X.W3M.A01(r2)
            r1 = 0
            r4.A0A(r3, r2, r1, r1)
            X.WOF r2 = new X.WOF
            r2.<init>(r7, r4, r6, r5)
            r1 = 0
            X.C18676VwZ.A02(r7, r2, r6, r1)
        L_0x02f5:
            r1 = 48960381(0x2eb137d, float:3.4541332E-37)
            goto L_0x002f
        L_0x02fa:
            java.lang.String r0 = "adsManagerLogger"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WB5.onClick(android.view.View):void");
    }

    public WB5(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
    }
}

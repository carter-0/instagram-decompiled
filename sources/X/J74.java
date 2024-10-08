package X;

public final class J74 extends 0Yg implements 0sL {
    public final int A00;
    public final Object A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J74(String str, Object obj, int i) {
        super(2);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0266, code lost:
        X.0fL.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x026b, code lost:
        r12.Evl();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r20, java.lang.Object r21) {
        /*
            r19 = this;
            r3 = r19
            r6 = r21
            r12 = r20
            int r0 = r3.A00
            switch(r0) {
                case 1: goto L_0x001d;
                case 2: goto L_0x000b;
                case 3: goto L_0x001d;
                case 4: goto L_0x000b;
                case 5: goto L_0x001d;
                case 6: goto L_0x000b;
                case 7: goto L_0x002e;
                case 8: goto L_0x0057;
                case 9: goto L_0x00d6;
                case 10: goto L_0x00d6;
                case 11: goto L_0x01c0;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.String r12 = (java.lang.String) r12
            boolean r2 = X.C51975G9x.A1X(r6, r12)
            java.lang.Object r1 = r3.A01
            X.5vd r1 = (X.C299665vd) r1
            java.lang.String r0 = r3.A02
            r1.DRC(r12, r2, r0)
        L_0x001a:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x001d:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r6 = (java.lang.String) r6
            X.AnonymousClass7TG.A1N(r12, r6)
            java.lang.Object r1 = r3.A01
            X.5vd r1 = (X.C299665vd) r1
            java.lang.String r0 = r3.A02
            r1.Dhn(r0, r12, r6)
            goto L_0x001a
        L_0x002e:
            X.AnonymousClass7TG.A1N(r12, r6)
            java.lang.Object r0 = r3.A01
            X.8A0 r0 = (X.AnonymousClass8A0) r0
            X.89w r0 = r0.A03
            java.util.HashMap r1 = r0.A09
            java.lang.String r0 = r3.A02
            java.lang.Object r0 = r1.get(r0)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            if (r0 == 0) goto L_0x001a
            java.util.Iterator r1 = r0.iterator()
        L_0x0047:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r1.next()
            X.0sL r0 = (X.0sL) r0
            r0.invoke(r12, r6)
            goto L_0x0047
        L_0x0057:
            X.5Wy r12 = (X.C286575Wy) r12
            int r1 = X.C51968G9o.A0B(r6)
            r0 = 2
            if (r1 != r0) goto L_0x0066
            boolean r0 = r12.Bwn()
            if (r0 != 0) goto L_0x026b
        L_0x0066:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0074
            r1 = -1088500706(0xffffffffbf1ecc1e, float:-0.6203021)
            java.lang.String r0 = "com.instagram.creation.genai.magicmod.tools.backdrop.ui.BackdropNineSixteenLayout.<anonymous> (BackdropNineSixteenLayout.kt:123)"
            X.0fL.A01(r1, r0)
        L_0x0074:
            java.lang.Object r0 = r3.A01
            X.Gpy r0 = (X.C53528Gpy) r0
            X.HMG r1 = r0.A02
            X.HMG r0 = X.HMG.ENTER_PROMPT
            if (r1 != r0) goto L_0x00cb
            java.lang.String r6 = r3.A02
            r5 = 0
            if (r6 == 0) goto L_0x00cb
            int r0 = r6.length()
            if (r0 == 0) goto L_0x00cb
            X.5Qk r2 = androidx.compose.ui.Modifier.A00
            r1 = 1096810496(0x41600000, float:14.0)
            r0 = 1111490560(0x42400000, float:48.0)
            androidx.compose.ui.Modifier r2 = X.C287195Zj.A09(r2, r0, r1)
            X.5RD r1 = X.C51966G9m.A0a(r5)
            int r4 = X.C287425a7.A00(r12)
            r3 = r12
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r0 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r2 = X.C287435a8.A01(r12, r2)
            X.C51973G9u.A0y(r12, r3)
            X.C51971G9r.A12(r12, r1, r0)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x00b8
            boolean r0 = X.C51972G9s.A1Q(r12, r4)
            if (r0 != 0) goto L_0x00bb
        L_0x00b8:
            X.C51971G9r.A13(r12, r1, r4)
        L_0x00bb:
            X.C51965G9l.A18(r12, r2)
            r0 = 2131965777(0x7f133751, float:1.9568373E38)
            java.lang.String r0 = X.C304346Dc.A00(r12, r0)
            X.C56576I2g.A02(r6, r0, r12, r5)
            r12.ASN()
        L_0x00cb:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x001a
            r0 = -1247085508(0xffffffffb5aafc3c, float:-1.2739397E-6)
            goto L_0x0266
        L_0x00d6:
            X.1Xj r12 = (X.1Xj) r12
            java.util.List r6 = (java.util.List) r6
            r2 = 0
            boolean r5 = X.AnonymousClass7TF.A1U(r2, r12, r6)
            java.lang.Object r4 = r3.A01
            X.325 r4 = (X.AnonymousClass325) r4
            androidx.fragment.app.Fragment r0 = r4.A00
            android.content.Context r1 = r0.requireContext()
            r3 = 0
            r0 = 2131962243(0x7f132983, float:1.9561206E38)
            X.C59689JTv.A01(r1, r3, r0, r2)
            java.util.ArrayList r8 = X.AnonymousClass7TG.A0r(r6)
            java.util.Iterator r1 = r6.iterator()
        L_0x00f8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x010a
            java.lang.Object r0 = r1.next()
            X.N8v r0 = (X.C68282N8v) r0
            java.lang.Long r0 = r0.A02
            r8.add(r0)
            goto L_0x00f8
        L_0x010a:
            X.1Xy r0 = r12.A0C
            java.util.List r0 = r0.B4w()
            if (r0 == 0) goto L_0x001a
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = r0.iterator()
        L_0x011a:
            boolean r0 = r6.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x013c
            java.lang.Object r1 = r6.next()
            r0 = r1
            X.DTv r0 = (X.C46292DTv) r0
            X.Pwf r0 = r0.Bbg()
            if (r0 == 0) goto L_0x0132
            java.lang.Long r2 = r0.BEY()
        L_0x0132:
            boolean r0 = r8.contains(r2)
            if (r0 == 0) goto L_0x011a
            r7.add(r1)
            goto L_0x011a
        L_0x013c:
            java.util.Iterator r11 = r7.iterator()
        L_0x0140:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x001a
            java.lang.Object r2 = r11.next()
            X.DTv r2 = (X.C46292DTv) r2
            X.326 r6 = r4.A04
            X.Pwf r0 = r2.Bbg()
            if (r0 == 0) goto L_0x01be
            java.lang.Long r0 = r0.BEY()
        L_0x0158:
            java.lang.String r8 = java.lang.String.valueOf(r0)
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r10 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.DECLINED
            com.instagram.user.model.ProductDetailsProductItemDictIntf r0 = r2.Bfu()
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x016c
            java.lang.String r9 = r0.getProductId()
            if (r9 != 0) goto L_0x016d
        L_0x016c:
            r9 = r1
        L_0x016d:
            com.instagram.user.model.ProductDetailsProductItemDictIntf r0 = r2.Bfu()
            if (r0 == 0) goto L_0x017f
            com.instagram.user.model.User r0 = r0.BRo()
            if (r0 == 0) goto L_0x017f
            java.lang.String r7 = X.AnonymousClass3ZA.A00(r0)
            if (r7 != 0) goto L_0x0180
        L_0x017f:
            r7 = r1
        L_0x0180:
            X.0qQ.A0B(r8, r5)
            X.0wc r1 = r6.A00
            java.lang.String r0 = "instagram_shopping_tagged_user_featured_product_permission_status_update_success"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = r10.A00
            X.DbS.A1J(r2, r0)
            java.lang.Long r1 = X.DbV.A0q(r9)
            java.lang.String r0 = "product_id"
            r2.A9F(r0, r1)
            X.4Ny r1 = X.C263944Ny.A00(r7)
            java.lang.String r0 = "merchant_id"
            r2.AAE(r1, r0)
            java.lang.Long r1 = X.DbV.A0q(r8)
            r0 = 1676(0x68c, float:2.349E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A9F(r0, r1)
            com.instagram.common.session.UserSession r0 = r6.A01
            X.UFq r1 = X.C294165ly.A00(r0, r12)
            java.lang.String r0 = "feed_item_info"
            r2.AAK(r1, r0)
            r2.Cgf()
            goto L_0x0140
        L_0x01be:
            r0 = r3
            goto L_0x0158
        L_0x01c0:
            X.5Wy r12 = (X.C286575Wy) r12
            int r1 = X.C51968G9o.A0B(r6)
            r0 = 2
            if (r1 != r0) goto L_0x01cf
            boolean r0 = r12.Bwn()
            if (r0 != 0) goto L_0x026b
        L_0x01cf:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x01dd
            r1 = -1143288909(0xffffffffbbdacbb3, float:-0.006677115)
            java.lang.String r0 = "instagram.features.clips.bottomsheet.blend.ui.BlendSuggestedUsersForReelListComponent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BlendContextBottomSheetComposables.kt:156)"
            X.0fL.A01(r1, r0)
        L_0x01dd:
            java.lang.Object r0 = r3.A01
            X.Gqi r0 = (X.C53567Gqi) r0
            java.lang.Object r1 = r0.A01
            java.util.Set r1 = (java.util.Set) r1
            java.lang.String r0 = r3.A02
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x025d
            X.5Qk r4 = androidx.compose.ui.Modifier.A00
            r0 = 1099956224(0x41900000, float:18.0)
            androidx.compose.ui.Modifier r5 = X.C287205Zk.A0C(r4, r0)
            r3 = 1077936128(0x40400000, float:3.0)
            r6 = 0
            long r1 = X.C51966G9m.A08(r12)
            X.5ZQ r0 = X.AnonymousClass5ZN.A00
            androidx.compose.ui.Modifier r0 = X.C304816Fi.A03(r5, r0, r3, r1)
            androidx.compose.ui.Modifier r2 = X.C287195Zj.A07(r0, r3)
            long r0 = X.C51966G9m.A08(r12)
            androidx.compose.ui.Modifier r2 = X.C51966G9m.A0X(r2, r0)
            X.5RD r1 = X.C51966G9m.A0a(r6)
            int r5 = X.C287425a7.A00(r12)
            r3 = r12
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r0 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r2 = X.C287435a8.A01(r12, r2)
            X.C51973G9u.A0y(r12, r3)
            X.C51971G9r.A12(r12, r1, r0)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x0233
            boolean r0 = X.C51972G9s.A1Q(r12, r5)
            if (r0 != 0) goto L_0x0236
        L_0x0233:
            X.C51971G9r.A13(r12, r1, r5)
        L_0x0236:
            X.C51965G9l.A18(r12, r2)
            r0 = 2131238360(0x7f081dd8, float:1.8092997E38)
            X.2DO r14 = X.C287975bA.A00(r12, r0, r6)
            r0 = 2131964931(0x7f133403, float:1.9566658E38)
            java.lang.String r15 = X.C288035bG.A00(r12, r0)
            X.5Yw r0 = X.AnonymousClass5aQ.A00(r12)
            long r0 = r0.A0Q
            r2 = 1096810496(0x41600000, float:14.0)
            androidx.compose.ui.Modifier r13 = X.C287205Zk.A0C(r4, r2)
            r16 = 384(0x180, float:5.38E-43)
            r17 = r0
            X.C288165bT.A07(r12, r13, r14, r15, r16, r17)
            r12.ASN()
        L_0x025d:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x001a
            r0 = -680405631(0xffffffffd771d581, float:-2.65899295E14)
        L_0x0266:
            X.0fL.A00(r0)
            goto L_0x001a
        L_0x026b:
            r12.Evl()
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J74.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}

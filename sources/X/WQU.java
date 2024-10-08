package X;

public final class WQU implements 27S, 1wn {
    public final int A00;
    public final Object A01;

    public WQU(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        if (r0.getId().equals(r6.A00.getId()) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012e, code lost:
        return X.0qQ.A0K(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean A72(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x009e;
                case 1: goto L_0x0005;
                case 2: goto L_0x00ee;
                case 3: goto L_0x0046;
                case 4: goto L_0x0005;
                case 5: goto L_0x0007;
                case 6: goto L_0x0005;
                case 7: goto L_0x0005;
                case 8: goto L_0x0118;
                case 9: goto L_0x0025;
                case 10: goto L_0x0018;
                case 11: goto L_0x0105;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 1
            return r0
        L_0x0007:
            X.36g r6 = (X.C2370836g) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r0 = r5.A01
            X.Ube r0 = (X.C15381Ube) r0
            X.HAI r2 = r0.A08
            if (r2 != 0) goto L_0x00f4
            java.lang.String r0 = "dataSource"
            goto L_0x005e
        L_0x0018:
            X.36g r6 = (X.C2370836g) r6
            java.lang.Object r1 = r5.A01
            X.WJp r1 = (X.WJp) r1
            X.V3f r0 = r1.A02
            if (r0 != 0) goto L_0x0134
            com.instagram.user.model.User r0 = r1.A07
            goto L_0x0033
        L_0x0025:
            X.36g r6 = (X.C2370836g) r6
            java.lang.Object r0 = r5.A01
            com.instagram.shopping.fragment.pdp.AdsProductPageFragment r0 = (com.instagram.shopping.fragment.pdp.AdsProductPageFragment) r0
            X.X9L r0 = r0.A0N
            if (r0 == 0) goto L_0x0134
            com.instagram.user.model.User r0 = r0.BRo()
        L_0x0033:
            if (r0 == 0) goto L_0x0134
            java.lang.String r1 = r0.getId()
            com.instagram.user.model.User r0 = r6.A00
            java.lang.String r0 = r0.getId()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0134
            goto L_0x0005
        L_0x0046:
            X.36c r6 = (X.C2370436c) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            com.instagram.model.hashtag.Hashtag r0 = r6.A00
            java.lang.String r4 = r0.getId()
            if (r4 == 0) goto L_0x0134
            java.lang.Object r0 = r5.A01
            X.Ube r0 = (X.C15381Ube) r0
            X.UlK r0 = r0.A0F
            if (r0 != 0) goto L_0x0066
            java.lang.String r0 = "actionBarController"
        L_0x005e:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0066:
            X.VjY r0 = r0.A0B
            X.ToV r0 = r0.A03
            java.util.List r0 = r0.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x0070:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0134
            java.lang.Object r2 = r3.next()
            boolean r0 = r2 instanceof X.C17674Vc5
            if (r0 == 0) goto L_0x0070
            X.Vc5 r2 = (X.C17674Vc5) r2
            java.lang.Integer r1 = X.C18214Vne.A00(r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0070
            com.instagram.model.hashtag.Hashtag r1 = r2.A00
            if (r1 == 0) goto L_0x012f
            java.lang.String r0 = r1.getId()
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = r1.getId()
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 == 0) goto L_0x0070
            goto L_0x0005
        L_0x009e:
            X.36g r6 = (X.C2370836g) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r3 = r5.A01
            X.GTv r3 = (X.C52469GTv) r3
            X.GUc r2 = r3.A00()
            com.instagram.user.model.User r1 = r6.A00
            java.lang.String r0 = r1.getId()
            boolean r0 = r2.AJe(r0)
            if (r0 != 0) goto L_0x0005
            com.instagram.common.session.UserSession r0 = r3.A0H
            X.IOg r0 = X.C55171HdN.A00(r0)
            java.lang.String r3 = r1.getId()
            java.util.Map r0 = r0.A00
            java.util.Iterator r2 = X.AnonymousClass7TF.A0v(r0)
        L_0x00c8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0134
            java.lang.Object r0 = r2.next()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r1 = r0.iterator()
        L_0x00d8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c8
            com.instagram.user.model.User r0 = X.DbT.A0k(r1)
            java.lang.String r0 = r0.getId()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d8
            goto L_0x0005
        L_0x00ee:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            goto L_0x0005
        L_0x00f4:
            X.0eM r0 = r0.A0i
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.user.model.User r0 = r6.A00
            java.lang.String r0 = r0.getId()
            boolean r0 = r2.A09(r1, r0)
            return r0
        L_0x0105:
            X.6uk r6 = (X.C321786uk) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.String r1 = r6.A01
            java.lang.Object r0 = r5.A01
            X.ToW r0 = (X.C14030ToW) r0
            com.instagram.user.model.User r0 = r0.A01
            java.lang.String r0 = X.DbX.A0r(r0)
            goto L_0x012a
        L_0x0118:
            X.36g r6 = (X.C2370836g) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            com.instagram.user.model.User r0 = r6.A00
            java.lang.String r1 = r0.getId()
            java.lang.Object r0 = r5.A01
            X.VvH r0 = (X.C18624VvH) r0
            java.lang.String r0 = r0.A05
        L_0x012a:
            boolean r0 = X.0qQ.A0K(r1, r0)
            return r0
        L_0x012f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0134:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WQU.A72(java.lang.Object):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v109, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v110, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        X.AnonymousClass0fD.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01cd, code lost:
        r0 = "adapter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01ea, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01f1, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02d3, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x02d6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x025f;
                case 1: goto L_0x0204;
                case 2: goto L_0x0228;
                case 3: goto L_0x01d0;
                case 4: goto L_0x019f;
                case 5: goto L_0x017b;
                case 6: goto L_0x00f4;
                case 7: goto L_0x00be;
                case 8: goto L_0x0091;
                case 9: goto L_0x0067;
                case 10: goto L_0x0028;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 1403954392(0x53aea4d8, float:1.50017986E12)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = 2019410339(0x785dc1a3, float:1.7991016E34)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r8.A01
            X.GAR r1 = (X.GAR) r1
            r0 = 1
            r1.A0Q(r0, r0)
            r0 = -2044553068(0xffffffff86229894, float:-3.058091E-35)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -1963401792(0xffffffff8af8ddc0, float:-2.3964944E-32)
        L_0x0024:
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x0028:
            r0 = 487068664(0x1d0813f8, float:1.8009774E-21)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.36g r9 = (X.C2370836g) r9
            r0 = 1883330627(0x70415843, float:2.3934924E29)
            int r6 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r5 = r8.A01
            X.WJp r5 = (X.WJp) r5
            boolean r0 = r5.A03()
            if (r0 == 0) goto L_0x005d
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r5.A05
            int r1 = X.JTQ.A02(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r5.A04
            if (r0 == 0) goto L_0x004f
            r0.setVisibility(r1)
        L_0x004f:
            com.instagram.ui.widget.nametagresultcard.impl.NametagResultCardView r4 = r5.A06
            r4.getClass()
            com.instagram.common.session.UserSession r2 = r5.A0G
            X.0iw r1 = r5.A0E
            com.instagram.user.model.User r0 = r9.A00
            r4.A02(r1, r2, r0)
        L_0x005d:
            r0 = -81660715(0xfffffffffb21f4d5, float:-8.409256E35)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -600263738(0xffffffffdc38b3c6, float:-2.07956235E17)
            goto L_0x0024
        L_0x0067:
            r0 = -1753470090(0xffffffff977c2b76, float:-8.1480447E-25)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = -2126476924(0xffffffff81408984, float:-3.5363493E-38)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r8.A01
            com.instagram.shopping.fragment.pdp.AdsProductPageFragment r0 = (com.instagram.shopping.fragment.pdp.AdsProductPageFragment) r0
            X.ViD r2 = r0.A05
            X.X9L r1 = r2.A00
            X.Vuf r0 = r2.A01
            r2.A00(r1, r0)
            X.2t9 r0 = r2.A04
            r0.notifyDataSetChanged()
            r0 = -2072262634(0xffffffff847bc816, float:-2.9596783E-36)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1634117310(0x6166a6be, float:2.6592289E20)
            goto L_0x0024
        L_0x0091:
            r0 = 648242296(0x26a36478, float:1.1337629E-15)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.36g r9 = (X.C2370836g) r9
            r0 = -476258790(0xffffffffe39cde1a, float:-5.7873924E21)
            int r2 = X.AnonymousClass7TG.A0D(r9, r0)
            java.lang.Object r1 = r8.A01
            X.VvH r1 = (X.C18624VvH) r1
            com.instagram.user.model.User r0 = r9.A00
            r1.A01 = r0
            X.2da r0 = r1.A00
            if (r0 == 0) goto L_0x00b0
            r0.AHX()
        L_0x00b0:
            X.C18624VvH.A00(r1)
            r0 = 1807902822(0x6bc26866, float:4.7004923E26)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -504597788(0xffffffffe1ec72e4, float:-5.452138E20)
            goto L_0x0024
        L_0x00be:
            r0 = -1459250693(0xffffffffa90599fb, float:-2.966549E-14)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = 1185498367(0x46a944ff, float:21666.498)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r8.A01
            X.UbF r1 = (X.C15363UbF) r1
            X.Trf r0 = r1.A03
            if (r0 != 0) goto L_0x00d8
            java.lang.String r0 = "dataSource"
            goto L_0x01ea
        L_0x00d8:
            r0.A04()
            X.UdQ r0 = r1.A02
            if (r0 != 0) goto L_0x00e3
            java.lang.String r0 = "searchAdapter"
            goto L_0x01ea
        L_0x00e3:
            r0.A01()
            r0.updateListView()
            r0 = 1489449310(0x58c7315e, float:1.75211876E15)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -2025427555(0xffffffff87466d9d, float:-1.4928077E-34)
            goto L_0x0024
        L_0x00f4:
            r0 = 1485163188(0x5885cab4, float:1.1768452E15)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.376 r9 = (X.AnonymousClass376) r9
            r0 = -927525452(0xffffffffc8b715b4, float:-374957.62)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r1 = 0
            X.0qQ.A0B(r9, r1)
            java.lang.Object r0 = r8.A01
            com.instagram.profile.edithighlightsmigration.HighlightsMigrationFragment r0 = (com.instagram.profile.edithighlightsmigration.HighlightsMigrationFragment) r0
            X.WZL r6 = r0.A02
            if (r6 == 0) goto L_0x0178
            java.util.List r0 = r9.A04
            X.0qQ.A06(r0)
            java.lang.Object r7 = X.00k.A0I(r0)
            X.0qQ.A07(r7)
            com.instagram.model.reels.Reel r7 = (com.instagram.model.reels.Reel) r7
            X.0qQ.A0B(r7, r1)
            com.instagram.common.session.UserSession r0 = r6.A00
            com.instagram.reels.store.ReelStore r1 = X.1OP.A05(r0)
            java.lang.String r0 = r7.getId()
            com.instagram.model.reels.Reel r4 = r1.A0M(r0)
            if (r4 == 0) goto L_0x016e
            com.instagram.api.schemas.ProfileGridItemTypeEnum r1 = com.instagram.api.schemas.ProfileGridItemTypeEnum.HIGHLIGHT
            r0 = 0
            X.Vhb r5 = new X.Vhb
            r5.<init>(r1, r0, r4)
            X.UlV r4 = r6.A04
            java.lang.String r1 = X.JTP.A0r(r7)
            java.util.Map r0 = r4.A03
            java.lang.Number r1 = X.C51966G9m.A14(r1, r0)
            if (r1 == 0) goto L_0x0156
            java.lang.String r0 = X.JTP.A0r(r7)
            r4.A0D(r0)
            int r1 = r1.intValue()
            r0 = 1
            X.AnonymousClass2rW.A01(r4, r5, r1, r0)
        L_0x0156:
            X.VOd r0 = r6.A02
            com.instagram.profile.edithighlightsmigration.HighlightsMigrationFragment r0 = r0.A00
            X.UdR r1 = r0.A04()
            boolean r0 = r0.A09
            r1.A01(r0)
            r0 = 1981722975(0x761eb15f, float:8.046684E32)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = 493991385(0x1d71b5d9, float:3.1990097E-21)
            goto L_0x0024
        L_0x016e:
            X.UlV r1 = r6.A04
            java.lang.String r0 = X.JTP.A0r(r7)
            r1.A0D(r0)
            goto L_0x0156
        L_0x0178:
            java.lang.String r0 = "highlightsMigrationDataSource"
            goto L_0x01ea
        L_0x017b:
            r0 = 1601868672(0x5f7a9380, float:1.8055916E19)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = -468707442(0xffffffffe410178e, float:-1.0632114E22)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r8.A01
            X.Ube r0 = (X.C15381Ube) r0
            X.TsA r0 = r0.A06
            if (r0 == 0) goto L_0x01cd
            X.C14227TsA.A00(r0)
            r0 = 1747737287(0x682c5ac7, float:3.2556863E24)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 1154898976(0x44d65c20, float:1714.8789)
            goto L_0x0024
        L_0x019f:
            r0 = 2087425837(0x7c6b972d, float:4.893024E36)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.INg r9 = (X.C57066INg) r9
            r0 = 1882660768(0x70371fa0, float:2.2669596E29)
            int r2 = X.AnonymousClass7TG.A0D(r9, r0)
            java.lang.Object r0 = r8.A01
            X.Ube r0 = (X.C15381Ube) r0
            X.TsA r1 = r0.A06
            if (r1 == 0) goto L_0x01cd
            X.1Xj r0 = r9.A00
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x02d7
            r1.A03(r0)
            r0 = -485216073(0xffffffffe31430b7, float:-2.7336284E21)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = 1501493939(0x597efab3, float:4.48564317E15)
            goto L_0x0024
        L_0x01cd:
            java.lang.String r0 = "adapter"
            goto L_0x01ea
        L_0x01d0:
            r0 = 1136920567(0x43c407f7, float:392.06223)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.36c r9 = (X.C2370436c) r9
            r0 = 794077415(0x2f54a8e7, float:1.9341294E-10)
            int r2 = X.AnonymousClass7TG.A0D(r9, r0)
            java.lang.Object r0 = r8.A01
            X.Ube r0 = (X.C15381Ube) r0
            X.UlK r0 = r0.A0F
            if (r0 != 0) goto L_0x01f2
            java.lang.String r0 = "actionBarController"
        L_0x01ea:
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x01f2:
            com.instagram.model.hashtag.Hashtag r1 = r9.A00
            X.VjY r0 = r0.A0B
            r0.A01(r1)
            r0 = -287202163(0xffffffffeee1a48d, float:-3.4916528E28)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -646272978(0xffffffffd97aa82e, float:-4.40960373E15)
            goto L_0x0024
        L_0x0204:
            r0 = 2017879127(0x78466457, float:1.6095467E34)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = 1534489621(0x5b767415, float:6.9370478E16)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r8.A01
            com.instagram.discovery.mediamap.fragment.LocationDetailFragment r0 = (com.instagram.discovery.mediamap.fragment.LocationDetailFragment) r0
            X.Ugy r0 = r0.A01
            X.TsA r0 = r0.A03
            X.C14227TsA.A00(r0)
            r0 = -2018094160(0xffffffff87b653b0, float:-2.7433503E-34)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = -1255989174(0xffffffffb523204a, float:-6.076922E-7)
            goto L_0x0024
        L_0x0228:
            r0 = -1111901678(0xffffffffbdb9ba12, float:-0.09068693)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 1320688677(0x4eb81c25, float:1.54442611E9)
            int r6 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r5 = r8.A01
            X.ToX r5 = (X.C14031ToX) r5
            X.ToV r0 = r5.A04
            java.util.List r3 = r0.A00
            int r2 = r3.size()
            r1 = 0
        L_0x0243:
            if (r1 >= r2) goto L_0x0252
            java.lang.Object r0 = r3.get(r1)
            boolean r0 = r0 instanceof X.VNJ
            if (r0 == 0) goto L_0x025c
            if (r1 < 0) goto L_0x0252
            X.C14031ToX.A00(r5, r1)
        L_0x0252:
            r0 = 652450175(0x26e3997f, float:1.5792894E-15)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -1619272316(0xffffffff9f7bdd84, float:-5.333455E-20)
            goto L_0x02d3
        L_0x025c:
            int r1 = r1 + 1
            goto L_0x0243
        L_0x025f:
            r0 = 461685527(0x1b84c317, float:2.1963642E-22)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.36g r9 = (X.C2370836g) r9
            r0 = -1141925886(0xffffffffbbef9802, float:-0.007311822)
            int r3 = X.AnonymousClass7TG.A0D(r9, r0)
            com.instagram.user.model.User r7 = r9.A00
            boolean r0 = r7.CPV()
            if (r0 == 0) goto L_0x02bf
            java.lang.Object r0 = r8.A01
            X.GTv r0 = (X.C52469GTv) r0
            X.GUc r0 = r0.A00()
            X.2rX r6 = r0.A00
            X.IWI r6 = (X.IWI) r6
            java.util.List r0 = r6.A04
            java.util.Iterator r5 = r0.iterator()
        L_0x0289:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x02bf
            java.lang.Object r2 = r5.next()
            boolean r0 = r2 instanceof X.1Xj
            if (r0 == 0) goto L_0x02b6
            X.1Xj r2 = (X.1Xj) r2
        L_0x0299:
            if (r2 == 0) goto L_0x0289
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r2)
            if (r0 == 0) goto L_0x0289
            java.lang.String r0 = r0.getId()
            boolean r0 = X.DbV.A1Z(r7, r0)
            if (r0 == 0) goto L_0x0289
            com.instagram.common.session.UserSession r0 = r6.A03
            X.1se r1 = X.1sd.A00(r0)
            r0 = 1
            r1.A02(r2, r0)
            goto L_0x0289
        L_0x02b6:
            boolean r0 = r2 instanceof X.AnonymousClass3OA
            if (r0 == 0) goto L_0x0289
            X.3OA r2 = (X.AnonymousClass3OA) r2
            X.1Xj r2 = r2.A0K
            goto L_0x0299
        L_0x02bf:
            java.lang.Object r0 = r8.A01
            X.GTv r0 = (X.C52469GTv) r0
            X.GUc r0 = r0.A00()
            r0.FK4()
            r0 = 1231552687(0x496800af, float:950282.94)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 792379274(0x2f3abf8a, float:1.698465E-10)
        L_0x02d3:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x02d7:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 156524126(0x9545e5e, float:2.5562943E-33)
            X.AnonymousClass0fD.A0A(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WQU.onEvent(java.lang.Object):void");
    }
}

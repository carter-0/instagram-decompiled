package X;

/* renamed from: X.Phm  reason: case insensitive filesystem */
public final class C73673Phm extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73673Phm(Object obj, Object obj2, String str, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: X.Npc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: X.Npc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: X.Npc} */
    /* JADX WARNING: type inference failed for: r9v1, types: [X.Npc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r34v0, types: [X.1A5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v68, types: [X.OJN, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r34v1, types: [X.1A5, java.lang.Object] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0895: MOVE  (r2v4 androidx.fragment.app.FragmentActivity) = (r2v3 androidx.fragment.app.FragmentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x04dc  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x051a  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0530  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x05d8  */
    public final java.lang.Object invoke() {
        /*
            r51 = this;
            r6 = r51
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x0153;
                case 1: goto L_0x0162;
                case 2: goto L_0x0171;
                case 3: goto L_0x017f;
                case 4: goto L_0x018d;
                case 5: goto L_0x019b;
                case 6: goto L_0x00dc;
                case 7: goto L_0x0851;
                case 8: goto L_0x01a9;
                case 9: goto L_0x01b7;
                case 10: goto L_0x01c5;
                case 11: goto L_0x0209;
                case 12: goto L_0x0219;
                case 13: goto L_0x01d3;
                case 14: goto L_0x0250;
                case 15: goto L_0x0268;
                case 16: goto L_0x027f;
                case 17: goto L_0x028e;
                case 18: goto L_0x02a2;
                case 19: goto L_0x02b6;
                case 20: goto L_0x02ca;
                case 21: goto L_0x02de;
                case 22: goto L_0x0317;
                case 23: goto L_0x032a;
                case 24: goto L_0x0347;
                case 25: goto L_0x037b;
                case 26: goto L_0x0007;
                case 27: goto L_0x0007;
                case 28: goto L_0x072b;
                case 29: goto L_0x073a;
                case 30: goto L_0x0749;
                case 31: goto L_0x0758;
                case 32: goto L_0x0767;
                case 33: goto L_0x0776;
                case 34: goto L_0x0785;
                case 35: goto L_0x079d;
                case 36: goto L_0x07c9;
                case 37: goto L_0x0120;
                case 38: goto L_0x07d4;
                case 39: goto L_0x01e1;
                case 40: goto L_0x01ef;
                case 41: goto L_0x07e5;
                case 42: goto L_0x0871;
                case 43: goto L_0x08cb;
                case 44: goto L_0x0909;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r6.A02
            X.325 r4 = (X.AnonymousClass325) r4
            X.AnonymousClass325.A02(r4)
            java.lang.Object r0 = r6.A01
            X.1Xj r0 = (X.1Xj) r0
            java.util.LinkedHashMap r0 = X.C254423sS.A07(r0)
            java.util.Iterator r12 = X.AnonymousClass7TF.A0s(r0)
        L_0x001a:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0924
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r12)
            java.lang.Object r5 = r0.getKey()
            X.1Xj r5 = (X.1Xj) r5
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x0038:
            boolean r0 = r2.hasNext()
            r3 = 0
            if (r0 == 0) goto L_0x0058
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.DTv r0 = (X.C46292DTv) r0
            X.Pwf r0 = r0.Bbg()
            if (r0 == 0) goto L_0x0050
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r3 = r0.BzM()
        L_0x0050:
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r0 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.APPROVED
            if (r3 != r0) goto L_0x0038
            r6.add(r1)
            goto L_0x0038
        L_0x0058:
            java.util.Iterator r11 = r6.iterator()
        L_0x005c:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x001a
            java.lang.Object r1 = r11.next()
            X.DTv r1 = (X.C46292DTv) r1
            X.326 r6 = r4.A04
            X.Pwf r0 = r1.Bbg()
            if (r0 == 0) goto L_0x00da
            java.lang.Long r0 = r0.BEY()
        L_0x0074:
            java.lang.String r7 = java.lang.String.valueOf(r0)
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r10 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.DECLINED
            com.instagram.user.model.ProductDetailsProductItemDictIntf r0 = r1.Bfu()
            java.lang.String r9 = ""
            if (r0 == 0) goto L_0x0088
            java.lang.String r8 = r0.getProductId()
            if (r8 != 0) goto L_0x0089
        L_0x0088:
            r8 = r9
        L_0x0089:
            com.instagram.user.model.ProductDetailsProductItemDictIntf r0 = r1.Bfu()
            if (r0 == 0) goto L_0x009c
            com.instagram.user.model.User r0 = r0.BRo()
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r0)
            if (r0 == 0) goto L_0x009c
            r9 = r0
        L_0x009c:
            X.AnonymousClass7TG.A1N(r5, r7)
            X.0wc r1 = r6.A00
            java.lang.String r0 = "instagram_shopping_tagged_user_featured_product_permission_status_update_failure"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = r10.A00
            X.DbS.A1J(r2, r0)
            java.lang.Long r1 = X.DbV.A0q(r8)
            java.lang.String r0 = "product_id"
            r2.A9F(r0, r1)
            X.4Ny r1 = X.C263944Ny.A00(r9)
            java.lang.String r0 = "merchant_id"
            r2.AAE(r1, r0)
            java.lang.Long r1 = X.DbV.A0q(r7)
            r0 = 1676(0x68c, float:2.349E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A9F(r0, r1)
            com.instagram.common.session.UserSession r0 = r6.A01
            X.UFq r1 = X.C294165ly.A00(r0, r5)
            java.lang.String r0 = "feed_item_info"
            r2.AAK(r1, r0)
            r2.Cgf()
            goto L_0x005c
        L_0x00da:
            r0 = r3
            goto L_0x0074
        L_0x00dc:
            java.lang.Object r5 = r6.A02
            X.NJy r5 = (X.C68481NJy) r5
            X.0eM r4 = r5.A07
            X.0lg r3 = X.DbT.A0X(r4)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326807619975150(0x810f0a000337ee, double:3.036557642961061E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0924
            X.17i r0 = X.JTR.A0u(r4)
            java.lang.String r3 = r6.A03
            com.instagram.user.model.User r0 = r0.A02(r3)
            if (r0 == 0) goto L_0x0924
            java.lang.Object r1 = r6.A01
            X.3t3 r1 = (X.C254793t3) r1
            X.Pv4 r0 = r5.A01
            if (r0 == 0) goto L_0x0924
            X.7ZA r2 = r0.C62()
            X.3t0 r1 = (X.C254763t0) r1
            java.lang.String r1 = r1.A00
            X.0eM r0 = r5.A05
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            r2.FKs(r1, r3, r0)
            goto L_0x0924
        L_0x0120:
            java.lang.Object r3 = r6.A02
            X.HtS r3 = (X.C56140HtS) r3
            X.01W r2 = r3.A04
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x0924
            java.lang.Object r0 = r2.A0Q()
            X.Hsw r0 = (X.C56109Hsw) r0
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r6.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0924
            java.lang.Object r1 = r6.A01
            X.0sP r1 = (X.0sP) r1
            X.F3q r0 = r3.A02
            if (r1 != 0) goto L_0x0146
            X.PqH r1 = X.C74175PqH.A00
        L_0x0146:
            r0.A04(r1)
            r2.A0T()
            X.0sP r1 = r3.A05
            r0 = 0
            X.C51968G9o.A1O(r1, r0)
            goto L_0x0120
        L_0x0153:
            java.lang.Object r1 = r6.A02
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r0 = r6.A03
            X.0eO r3 = X.0eO.A02
            X.G08 r2 = new X.G08
            r2.<init>(r1, r0)
            goto L_0x01fc
        L_0x0162:
            java.lang.Object r1 = r6.A02
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r0 = r6.A03
            X.0eO r3 = X.0eO.A02
            X.G09 r2 = new X.G09
            r2.<init>(r1, r0)
            goto L_0x01fc
        L_0x0171:
            java.lang.Object r1 = r6.A02
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r0 = r6.A03
            X.0eO r3 = X.0eO.A02
            X.G0A r2 = new X.G0A
            r2.<init>(r1, r0)
            goto L_0x01fc
        L_0x017f:
            java.lang.Object r1 = r6.A02
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r0 = r6.A03
            X.0eO r3 = X.0eO.A02
            X.G0B r2 = new X.G0B
            r2.<init>(r1, r0)
            goto L_0x01fc
        L_0x018d:
            java.lang.Object r1 = r6.A02
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r0 = r6.A03
            X.0eO r3 = X.0eO.A02
            X.G0C r2 = new X.G0C
            r2.<init>(r1, r0)
            goto L_0x01fc
        L_0x019b:
            java.lang.Object r1 = r6.A02
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r0 = r6.A03
            X.0eO r3 = X.0eO.A02
            X.G0D r2 = new X.G0D
            r2.<init>(r1, r0)
            goto L_0x01fc
        L_0x01a9:
            java.lang.Object r1 = r6.A02
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r0 = r6.A03
            X.0eO r3 = X.0eO.A02
            X.G0G r2 = new X.G0G
            r2.<init>(r1, r0)
            goto L_0x01fc
        L_0x01b7:
            java.lang.Object r1 = r6.A02
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r0 = r6.A03
            X.0eO r3 = X.0eO.A02
            X.G0H r2 = new X.G0H
            r2.<init>(r1, r0)
            goto L_0x01fc
        L_0x01c5:
            java.lang.Object r1 = r6.A02
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r0 = r6.A03
            X.0eO r3 = X.0eO.A02
            X.G0I r2 = new X.G0I
            r2.<init>(r1, r0)
            goto L_0x01fc
        L_0x01d3:
            java.lang.Object r1 = r6.A02
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r0 = r6.A03
            X.0eO r3 = X.0eO.A02
            X.G0K r2 = new X.G0K
            r2.<init>(r1, r0)
            goto L_0x01fc
        L_0x01e1:
            java.lang.Object r1 = r6.A02
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r0 = r6.A03
            X.0eO r3 = X.0eO.A02
            X.G0T r2 = new X.G0T
            r2.<init>(r1, r0)
            goto L_0x01fc
        L_0x01ef:
            java.lang.Object r1 = r6.A02
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r0 = r6.A03
            X.0eO r3 = X.0eO.A02
            X.G0U r2 = new X.G0U
            r2.<init>(r1, r0)
        L_0x01fc:
            X.0eM r0 = X.AnonymousClass0eN.A00(r3, r2)
            java.lang.Object r3 = r0.getValue()
            if (r3 != 0) goto L_0x0926
            java.lang.Object r3 = r6.A01
            return r3
        L_0x0209:
            java.lang.Object r3 = r6.A02
            X.OsF r3 = (X.C71872OsF) r3
            java.lang.Object r2 = r6.A01
            X.PuM r2 = (X.C74406PuM) r2
            java.lang.String r1 = r6.A03
            r0 = 0
            X.C71872OsF.A02(r0, r3, r2, r1)
            goto L_0x0924
        L_0x0219:
            X.FEe r4 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r3 = r6.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r0 = r6.A02
            X.H1X r0 = (X.H1X) r0
            X.0eM r0 = r0.A02
            X.0lg r2 = X.DbT.A0X(r0)
            java.lang.String r1 = r6.A03
            r6 = 0
            r0 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r20 = X.JTQ.A0a(r3, r0)
            r8 = 0
            r13 = 1
            com.instagram.simplewebview.SimpleWebViewConfig r5 = new com.instagram.simplewebview.SimpleWebViewConfig
            r7 = r6
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r15 = r8
            r16 = r13
            r17 = r8
            r18 = r8
            r19 = r8
            r21 = r1
            r5.<init>((java.lang.String) r6, (java.lang.String) r7, (boolean) r8, (boolean) r9, (boolean) r10, (boolean) r11, (boolean) r12, (boolean) r13, (boolean) r14, (boolean) r15, (boolean) r16, (boolean) r17, (boolean) r18, (boolean) r19, (java.lang.String) r20, (java.lang.String) r21)
            r4.A02(r3, r2, r5)
            goto L_0x0924
        L_0x0250:
            java.lang.Object r1 = r6.A02
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            java.lang.String r0 = r6.A03
            r1.A1X = r0
            java.lang.Object r0 = r6.A01
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = X.00l.A0W(r0)
            java.lang.Boolean r0 = X.DbT.A0l(r0)
            r1.A0z = r0
            goto L_0x0924
        L_0x0268:
            java.lang.Object r0 = r6.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.3gF r2 = X.C247323g9.A00(r0)
            java.lang.Object r0 = r6.A01
            X.0iw r0 = (X.AnonymousClass0iw) r0
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = r6.A03
            r2.A03(r1, r0)
            goto L_0x0924
        L_0x027f:
            java.lang.Object r1 = r6.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = r6.A03
            android.net.Uri r0 = X.DbT.A09(r0)
            X.0kR.A0F(r1, r0)
            goto L_0x0924
        L_0x028e:
            java.lang.Object r2 = r6.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r0 = r6.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r1 = X.DbT.A05(r0)
            java.lang.String r0 = r6.A03
            X.KRr r3 = new X.KRr
            r3.<init>(r2, r1, r0)
            return r3
        L_0x02a2:
            java.lang.Object r2 = r6.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r0 = r6.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r1 = X.DbT.A05(r0)
            java.lang.String r0 = r6.A03
            com.instagram.fxcal.upsell.common.FxIgExampleDialogACUpsellImpl r3 = new com.instagram.fxcal.upsell.common.FxIgExampleDialogACUpsellImpl
            r3.<init>(r2, r1, r0)
            return r3
        L_0x02b6:
            java.lang.Object r2 = r6.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r0 = r6.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r1 = X.DbT.A05(r0)
            java.lang.String r0 = r6.A03
            X.KRq r3 = new X.KRq
            r3.<init>(r2, r1, r0)
            return r3
        L_0x02ca:
            java.lang.Object r2 = r6.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r0 = r6.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r1 = X.DbT.A05(r0)
            java.lang.String r0 = r6.A03
            X.KRs r3 = new X.KRs
            r3.<init>(r2, r1, r0)
            return r3
        L_0x02de:
            java.lang.Object r0 = r6.A02
            X.K6o r0 = (X.C61417K6o) r0
            X.0eM r0 = r0.A06
            java.lang.Object r7 = r0.getValue()
            X.Eu6 r7 = (X.Eu6) r7
            java.lang.Object r5 = r6.A01
            androidx.fragment.app.FragmentActivity r5 = (androidx.fragment.app.FragmentActivity) r5
            java.lang.String r4 = r6.A03
            X.AnonymousClass7TG.A1N(r5, r4)
            com.instagram.common.session.UserSession r3 = r7.A00
            X.7Pr r1 = X.DbS.A0W(r3)
            r0 = 2131968673(0x7f1342a1, float:1.9574247E38)
            X.DbZ.A0z(r5, r1, r0)
            X.7Pu r2 = r1.A00()
            X.C46447Df9.A03()
            X.Fgj r1 = new X.Fgj
            r1.<init>(r5, r2, r7, r4)
            r0 = 0
            X.E5U r0 = X.C49078Eow.A00(r3, r4, r0)
            r0.A01 = r1
            r2.A02(r5, r0)
            goto L_0x0924
        L_0x0317:
            java.lang.Object r0 = r6.A02
            X.GxI r0 = (X.C53974GxI) r0
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x0924
            java.lang.Object r1 = r6.A01
            com.instagram.igds.components.button.IgdsButton r1 = (com.instagram.igds.components.button.IgdsButton) r1
            java.lang.String r0 = r6.A03
            r1.setText((java.lang.String) r0)
            goto L_0x0924
        L_0x032a:
            java.lang.Object r1 = r6.A01
            X.KUQ r1 = (X.KUQ) r1
            r4 = 0
            r1.A00(r4)
            java.lang.Object r0 = r6.A02
            X.LrS r0 = (X.C65329LrS) r0
            X.JjW r0 = r0.A02
            java.lang.String r3 = r6.A03
            X.JzD r2 = r1.A01
            r1 = 1
            X.0qQ.A0B(r3, r4)
            com.instagram.mediakit.repository.MediaKitRepository r0 = r0.A07
            r0.A0B(r2, r3, r1)
            goto L_0x0924
        L_0x0347:
            java.lang.Object r7 = r6.A02
            X.Wad r7 = (X.C19491Wad) r7
            com.instagram.common.session.UserSession r0 = r7.A02
            com.instagram.reels.store.ReelStore r5 = X.1OP.A05(r0)
            java.lang.String r4 = r6.A03
            java.lang.Object r3 = r6.A01
            com.instagram.model.reels.Reel r3 = (com.instagram.model.reels.Reel) r3
            java.lang.Integer r0 = r3.A0i
            r2 = 0
            int r1 = X.AnonymousClass7TG.A0A(r0)
            X.Dro r0 = new X.Dro
            r0.<init>((java.lang.String) r4, (boolean) r2, (int) r1)
            com.instagram.model.reels.Reel r0 = r5.A0F(r0)
            if (r0 != 0) goto L_0x036a
            r0 = r3
        L_0x036a:
            X.C19491Wad.A00(r0, r7, r2, r2)
            com.instagram.profile.fragment.UserDetailFragment r0 = r7.A04
            android.content.Context r1 = r0.requireContext()
            r0 = 2131963427(0x7f132e23, float:1.9563607E38)
            X.C59689JTv.A07(r1, r0)
            goto L_0x0924
        L_0x037b:
            X.0qv r1 = X.0qv.A02
            android.content.Context r0 = X.C60960kU.A00
            java.lang.String r3 = r1.A04(r0)
            r0 = 0
            r28 = 1
            if (r3 == 0) goto L_0x038f
            int r2 = r3.length()
            r1 = 0
            if (r2 != 0) goto L_0x0390
        L_0x038f:
            r1 = 1
        L_0x0390:
            java.lang.String r27 = "EMPTY_DEVICE_ID"
            if (r1 == 0) goto L_0x0727
            java.lang.Object[] r3 = new java.lang.Object[]{r27}
            java.lang.String r2 = "QuickExperimentFBTManagerFactoryImpl"
            java.lang.String r1 = "Initializing user fbtMC with empty id:%s"
            X.0KC.A0O(r2, r1, r3)
        L_0x039f:
            java.lang.Object r15 = r6.A01
            com.instagram.common.session.UserSession r15 = (com.instagram.common.session.UserSession) r15
            java.lang.String r7 = r15.A06
            java.lang.Object r1 = r6.A02
            X.Nds r1 = (X.C69055Nds) r1
            android.content.Context r1 = r1.A00
            r36 = r1
            java.lang.String r2 = r6.A03
            r26 = 2
            android.content.res.AssetManager r41 = r36.getAssets()
            java.util.HashMap r48 = X.AnonymousClass7TE.A1E()
            com.facebook.mobileconfig.MobileConfigManagerParamsHolder r14 = new com.facebook.mobileconfig.MobileConfigManagerParamsHolder
            r14.<init>()
            r1 = r26
            r14.setInstagramFlags(r0, r1)
            r1 = r28
            r14.setUseCase(r1)
            r3 = 18299386769967348(0x410332000808f4, double:1.892701413984861E-307)
            X.0tN r1 = X.C63130yM.A00(r3)
            boolean r1 = X.0yU.A07(r1)
            r14.setShouldIncludeStableSpecWithExposure(r1)
            X.19k r25 = new X.19k
            r1 = r25
            r1.<init>(r15)
            X.1Ah.A00 = r25
            X.19s r4 = X.19s.A08
            r3 = 11
            X.Pd9 r1 = new X.Pd9
            r1.<init>(r15, r3)
            X.0t0 r8 = X.AnonymousClass0eN.A01(r1)
            X.Pd6 r3 = new X.Pd6
            r1 = r26
            r3.<init>(r1)
            X.0t0 r6 = X.AnonymousClass0eN.A01(r3)
            r1 = 14
            X.Pd1 r5 = new X.Pd1
            r5.<init>(r8, r1)
            r1 = 15
            X.Pd1 r3 = new X.Pd1
            r3.<init>(r6, r1)
            r32 = 0
            r1 = r27
            r4.A02(r1, r5, r3)
            java.lang.String r24 = X.C61120lW.A04(r36)
            if (r24 == 0) goto L_0x0723
            java.lang.String r3 = "\\."
            r1 = r24
            java.lang.String[] r3 = r1.split(r3)
            if (r3 == 0) goto L_0x0723
            int r1 = r3.length
            if (r1 <= 0) goto L_0x0723
            r1 = r3[r0]
        L_0x0423:
            X.1A6 r23 = new X.1A6
            r3 = r23
            r3.<init>(r4)
            X.0nl r3 = X.C61560nl.A00()
            java.util.concurrent.ScheduledThreadPoolExecutor r3 = r3.A00
            r31 = r3
            android.content.res.AssetManager r30 = r36.getAssets()
            java.io.File r22 = r36.getFilesDir()
            r22.mkdirs()
            java.lang.String r5 = X.OJN.A00(r2, r1, r0)
            r4 = r22
            r3 = r28
            java.lang.String r4 = X.C262244Cs.A02(r4, r3)
            r3 = r26
            java.lang.String r3 = X.C262244Cs.A00(r3, r7, r5)
            java.lang.String r5 = X.002.A0R(r4, r3)
            boolean r4 = r5.isEmpty()
            java.lang.String r3 = "/"
            if (r4 != 0) goto L_0x046b
            boolean r4 = r5.endsWith(r3)
            if (r4 == 0) goto L_0x046b
            int r4 = r5.length()
            int r4 = r4 + -1
            java.lang.String r5 = r5.substring(r0, r4)
        L_0x046b:
            int r6 = r5.lastIndexOf(r3)
            java.lang.String r21 = ""
            if (r6 <= 0) goto L_0x070f
            int r4 = r5.length()
            int r4 = r4 + -1
            if (r6 >= r4) goto L_0x070f
            java.lang.String r11 = r5.substring(r0, r6)
            int r4 = r6 + 1
            java.lang.String r5 = r5.substring(r4)
            java.lang.String r20 = "."
            r4 = r20
            int r4 = r5.lastIndexOf(r4)
            if (r4 <= 0) goto L_0x070f
            java.lang.String r5 = r5.substring(r0, r4)
            java.lang.String r19 = "_"
            r4 = r19
            int r4 = r5.lastIndexOf(r4)
            if (r4 <= 0) goto L_0x070f
            java.lang.String r18 = r5.substring(r0, r4)
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.io.File r4 = X.AnonymousClass7TE.A0t(r11)
            java.io.File[] r9 = r4.listFiles()
            r17 = r21
            if (r9 != 0) goto L_0x066d
            java.lang.String r6 = "MobileConfigFilesOnDiskUtils"
            java.lang.String r4 = r4.getPath()
            java.lang.Object[] r5 = new java.lang.Object[]{r4}
            java.lang.String r4 = "Fail to list files under %s"
            X.0KC.A0O(r6, r4, r5)
            java.util.List r10 = java.util.Collections.emptyList()
            r8 = -1
            X.Npc r9 = new X.Npc
            r9.<init>()
            r4 = r21
        L_0x04cc:
            r9.A01 = r4
            r9.A00 = r8
            r9.A02 = r10
        L_0x04d2:
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            int r4 = r1.length()
            if (r4 == 0) goto L_0x0512
            r5 = r22
            r4 = r28
            java.lang.String r13 = X.C262244Cs.A02(r5, r4)
            java.lang.String r4 = "_"
            java.lang.String r11 = X.002.A0g(r7, r4, r2)
            java.lang.String r10 = X.002.A11(r7, r4, r2, r4, r1)
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            boolean r4 = r11.equals(r10)
            if (r4 != 0) goto L_0x0512
            java.io.File r4 = X.AnonymousClass7TE.A0t(r13)
            java.io.File[] r6 = r4.listFiles()
            r5 = 0
            if (r6 != 0) goto L_0x0640
            java.lang.String r6 = "MobileConfigFilesOnDiskUtils"
            java.lang.String r4 = r4.getPath()
            java.lang.Object[] r5 = new java.lang.Object[]{r4}
            java.lang.String r4 = "Fail to list files under %s"
            X.0KC.A0O(r6, r4, r5)
        L_0x0512:
            boolean r6 = r8.isEmpty()
            r4 = 10
            if (r6 != 0) goto L_0x0526
            X.PUU r10 = new X.PUU
            r10.<init>(r8)
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            r6 = r31
            r6.schedule(r10, r4, r8)
        L_0x0526:
            java.lang.String r6 = r9.A01
            boolean r8 = r6.isEmpty()
            r47 = r21
            if (r8 != 0) goto L_0x05d8
            java.util.List r8 = r9.A02
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x0544
            X.PUV r11 = new X.PUV
            r11.<init>(r9)
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
            r8 = r31
            r8.schedule(r11, r4, r10)
        L_0x0544:
            java.io.File r5 = X.AnonymousClass7TE.A0t(r6)
            r4 = r26
            java.lang.String r4 = X.C262244Cs.A03(r5, r4)
            X.Pcy r8 = new X.Pcy
            r8.<init>(r4)
            X.19z r35 = new X.19z
            r35.<init>()
            java.util.HashSet r39 = X.AnonymousClass7TE.A1F()
            X.Onm r5 = new X.Onm
            r5.<init>(r7)
            if (r4 == 0) goto L_0x0565
            r47 = r4
        L_0x0565:
            int r4 = r9.A00
            java.lang.String r7 = X.OJN.A00(r2, r1, r4)
            r14.setBufferPathPostfix(r7)
            X.Onr r33 = new X.Onr
            r40 = r33
            r42 = r14
            r43 = r15
            r44 = r25
            r45 = r24
            r46 = r27
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48)
            X.Ons r34 = new X.Ons
            r34.<init>()
            boolean r48 = X.AnonymousClass1A7.A00(r36)
            java.lang.String r38 = X.OJN.A00(r2, r1, r4)
            r45 = -1
            X.1AA r1 = new X.1AA
            r29 = r1
            r31 = r5
            r36 = r32
            r37 = r22
            r40 = r23
            r41 = r8
            r42 = r32
            r43 = r32
            r44 = r26
            r46 = r28
            r47 = r0
            r49 = r0
            r50 = r0
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            r1.A0C()
            boolean r0 = r6.endsWith(r3)
            if (r0 == 0) goto L_0x05b8
            r3 = r21
        L_0x05b8:
            java.lang.String r0 = "extra_data.json"
            java.lang.String r0 = X.002.A0g(r6, r3, r0)
            java.io.File r0 = X.AnonymousClass7TE.A0t(r0)
            java.lang.String r0 = X.C262244Cs.A01(r0)
            X.OB0 r2 = new X.OB0
            r2.<init>(r1, r0)
        L_0x05cb:
            X.OJN r0 = new X.OJN
            r0.<init>()
            r0.A00 = r2
            X.56z r3 = new X.56z
            r3.<init>(r0)
            return r3
        L_0x05d8:
            X.TOo r4 = new X.TOo
            r3 = r26
            r4.<init>(r3)
            X.19z r35 = new X.19z
            r35.<init>()
            java.util.HashSet r39 = X.AnonymousClass7TE.A1F()
            X.Onn r3 = new X.Onn
            r3.<init>(r7)
            java.lang.String r5 = X.OJN.A00(r2, r1, r0)
            r14.setBufferPathPostfix(r5)
            X.Onr r33 = new X.Onr
            r5 = r33
            r6 = r41
            r7 = r14
            r8 = r15
            r9 = r25
            r10 = r24
            r11 = r27
            r12 = r21
            r13 = r48
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            X.Ons r34 = new X.Ons
            r34.<init>()
            boolean r48 = X.AnonymousClass1A7.A00(r36)
            java.lang.String r38 = X.OJN.A00(r2, r1, r0)
            r45 = -1
            X.1AA r1 = new X.1AA
            r29 = r1
            r31 = r3
            r36 = r32
            r37 = r22
            r40 = r23
            r41 = r4
            r42 = r32
            r43 = r32
            r44 = r26
            r46 = r28
            r47 = r0
            r49 = r0
            r50 = r0
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            r1.A0C()
            X.OB0 r2 = new X.OB0
            r2.<init>(r1, r12)
            goto L_0x05cb
        L_0x0640:
            int r12 = r6.length
        L_0x0641:
            if (r5 >= r12) goto L_0x0512
            r16 = r6[r5]
            boolean r4 = r16.isDirectory()
            if (r4 == 0) goto L_0x066a
            java.lang.String r4 = r16.getName()
            boolean r4 = r4.startsWith(r11)
            if (r4 == 0) goto L_0x066a
            java.lang.String r4 = r16.getName()
            boolean r4 = r4.startsWith(r10)
            if (r4 != 0) goto L_0x066a
            java.lang.String r4 = r16.getName()
            java.lang.String r4 = X.002.A0g(r13, r3, r4)
            r8.add(r4)
        L_0x066a:
            int r5 = r5 + 1
            goto L_0x0641
        L_0x066d:
            int r4 = r9.length
            r29 = r4
            r6 = 0
            r8 = -1
        L_0x0672:
            r4 = r29
            if (r6 >= r4) goto L_0x0706
            r16 = r9[r6]
            boolean r4 = r16.isDirectory()
            if (r4 == 0) goto L_0x06d3
            java.lang.String r5 = r16.getName()
            r4 = r18
            boolean r4 = r5.startsWith(r4)
            if (r4 == 0) goto L_0x06d3
            java.lang.String r5 = r16.getName()
            r4 = r20
            int r5 = r5.lastIndexOf(r4)
            if (r5 <= 0) goto L_0x06d3
            java.lang.String r4 = r16.getName()
            java.lang.String r5 = r4.substring(r0, r5)
            r4 = r19
            int r4 = r5.lastIndexOf(r4)
            if (r4 < 0) goto L_0x06d3
            int r12 = r5.length()
            int r12 = r12 + -2
            if (r4 >= r12) goto L_0x06d3
            int r12 = r18.length()
            if (r4 != r12) goto L_0x06d3
            java.lang.String r13 = r16.getName()
            java.lang.String r12 = "Done"
            java.lang.String r12 = X.002.A11(r11, r3, r13, r3, r12)
            java.io.File r12 = X.AnonymousClass7TE.A0t(r12)
            boolean r12 = r12.exists()
            if (r12 != 0) goto L_0x06d6
            java.lang.String r4 = r16.getName()
            java.lang.String r4 = X.002.A0g(r11, r3, r4)
            r10.add(r4)
        L_0x06d3:
            int r6 = r6 + 1
            goto L_0x0672
        L_0x06d6:
            int r4 = r4 + 2
            java.lang.String r4 = r5.substring(r4)
            int r5 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x06e1 }
            goto L_0x06e2
        L_0x06e1:
            r5 = -1
        L_0x06e2:
            if (r5 >= r8) goto L_0x06ef
            java.lang.String r4 = r16.getName()
            java.lang.String r4 = X.002.A0g(r11, r3, r4)
            r10.add(r4)
        L_0x06ef:
            if (r5 <= r8) goto L_0x06d3
            boolean r4 = r17.isEmpty()
            if (r4 != 0) goto L_0x06fc
            r4 = r17
            r10.add(r4)
        L_0x06fc:
            java.lang.String r4 = r16.getName()
            java.lang.String r17 = X.002.A0g(r11, r3, r4)
            r8 = r5
            goto L_0x06d3
        L_0x0706:
            X.Npc r9 = new X.Npc
            r9.<init>()
            r4 = r17
            goto L_0x04cc
        L_0x070f:
            java.util.List r6 = java.util.Collections.emptyList()
            r5 = -1
            X.Npc r9 = new X.Npc
            r9.<init>()
            r4 = r21
            r9.A01 = r4
            r9.A00 = r5
            r9.A02 = r6
            goto L_0x04d2
        L_0x0723:
            java.lang.String r1 = ""
            goto L_0x0423
        L_0x0727:
            r27 = r3
            goto L_0x039f
        L_0x072b:
            java.lang.Object r2 = r6.A02
            X.RBs r2 = (X.C8834RBs) r2
            java.lang.String r1 = r6.A03
            java.lang.Object r0 = r6.A01
            X.5hN r0 = (X.C291485hN) r0
            X.C73673Phm.super.A0d(r0, r1)
            goto L_0x0924
        L_0x073a:
            java.lang.Object r2 = r6.A02
            X.RBs r2 = (X.C8834RBs) r2
            java.lang.String r1 = r6.A03
            java.lang.Object r0 = r6.A01
            java.util.Map r0 = (java.util.Map) r0
            X.C73673Phm.super.A0r(r1, r0)
            goto L_0x0924
        L_0x0749:
            java.lang.Object r2 = r6.A02
            X.RBs r2 = (X.C8834RBs) r2
            java.lang.String r1 = r6.A03
            java.lang.Object r0 = r6.A01
            java.util.Map r0 = (java.util.Map) r0
            X.C73673Phm.super.A0s(r1, r0)
            goto L_0x0924
        L_0x0758:
            java.lang.Object r2 = r6.A02
            X.RBs r2 = (X.C8834RBs) r2
            java.lang.String r1 = r6.A03
            java.lang.Object r0 = r6.A01
            java.util.Map r0 = (java.util.Map) r0
            X.C73673Phm.super.A0t(r1, r0)
            goto L_0x0924
        L_0x0767:
            java.lang.Object r2 = r6.A02
            X.RBs r2 = (X.C8834RBs) r2
            java.lang.String r1 = r6.A03
            java.lang.Object r0 = r6.A01
            java.util.Map r0 = (java.util.Map) r0
            X.C73673Phm.super.A0u(r1, r0)
            goto L_0x0924
        L_0x0776:
            java.lang.Object r2 = r6.A02
            X.RBs r2 = (X.C8834RBs) r2
            java.lang.String r1 = r6.A03
            java.lang.Object r0 = r6.A01
            java.util.Map r0 = (java.util.Map) r0
            X.C73673Phm.super.A0v(r1, r0)
            goto L_0x0924
        L_0x0785:
            android.os.Handler r4 = X.AnonymousClass7TF.A0D()
            java.lang.Object r3 = r6.A01
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r2 = r6.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.String r1 = r6.A03
            X.Paz r0 = new X.Paz
            r0.<init>(r2, r3, r1)
            r4.post(r0)
            goto L_0x0924
        L_0x079d:
            java.lang.Object r0 = r6.A01
            X.0r1 r0 = (X.0r1) r0
            boolean r0 = r0.A00
            r3 = 0
            if (r0 != 0) goto L_0x0926
            java.lang.Object r0 = r6.A02
            X.Gw8 r0 = (X.C53902Gw8) r0
            X.GbJ r2 = r0.A00
            r2.A01()
            java.lang.String r0 = r6.A03
            if (r0 == 0) goto L_0x0926
            r2.A06(r0)
            java.lang.CharSequence r0 = r2.A00()
            int r1 = r0.length()
            X.C245983dn.A02(r3)
            com.facebook.primitive.textinput.TextInputView r0 = r2.A02
            if (r0 == 0) goto L_0x0926
            r0.setSelection(r1, r1)
            return r3
        L_0x07c9:
            java.lang.Object r2 = r6.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r6.A02
            X.Gvy r0 = (X.C53893Gvy) r0
            com.meta.foa.session.FoaUserSession r1 = r0.A00
            goto L_0x07de
        L_0x07d4:
            java.lang.Object r2 = r6.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r6.A02
            X.Gt0 r0 = (X.C53709Gt0) r0
            com.meta.foa.session.FoaUserSession r1 = r0.A00
        L_0x07de:
            java.lang.String r0 = r6.A03
            X.C250563lf.A0T(r2, r1, r0)
            goto L_0x0924
        L_0x07e5:
            java.lang.Object r1 = r6.A02
            X.0lg r1 = (X.0lg) r1
            java.lang.String r5 = r6.A03
            java.lang.Object r0 = r6.A01
            X.IdS r0 = (X.C57601IdS) r0
            java.lang.Integer r4 = r0.A03
            r3 = 0
            X.AnonymousClass7TF.A1B(r1, r3, r4)
            X.0wc r1 = X.AnonymousClass0kN.A02(r1)
            java.lang.String r0 = "instagram_clips_join_blend_impression"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0924
            java.lang.String r1 = "clips_viewer_clips_blend"
            java.lang.String r0 = "containermodule"
            r2.AAJ(r0, r1)
            r0 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 322(0x142, float:4.51E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A8k(r0, r1)
            if (r5 == 0) goto L_0x084f
            java.lang.Long r1 = X.DbV.A0q(r5)
        L_0x0820:
            java.lang.String r0 = "blend_id"
            r2.A9F(r0, r1)
            int r1 = r4.intValue()
            if (r1 == r3) goto L_0x084c
            r0 = 1
            if (r1 == r0) goto L_0x0849
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x0830:
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x0846;
                case 1: goto L_0x0843;
                default: goto L_0x0837;
            }
        L_0x0837:
            java.lang.String r1 = "initiate_blend"
        L_0x0839:
            java.lang.String r0 = "blend_status"
            r2.AAJ(r0, r1)
            r2.Cgf()
            goto L_0x0924
        L_0x0843:
            java.lang.String r1 = "pending_invitation"
            goto L_0x0839
        L_0x0846:
            java.lang.String r1 = "opt_in"
            goto L_0x0839
        L_0x0849:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0830
        L_0x084c:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x0830
        L_0x084f:
            r1 = 0
            goto L_0x0820
        L_0x0851:
            java.lang.Object r4 = r6.A01
            X.NJy r4 = (X.C68481NJy) r4
            java.lang.Object r3 = r6.A02
            X.NKR r3 = (X.NKR) r3
            X.3t3 r2 = r3.A04
            if (r2 != 0) goto L_0x0865
            X.C66580MXl.A18()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0865:
            java.lang.String r1 = r6.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r4.A01(r2, r0, r1)
            X.DbX.A1J(r3)
            goto L_0x0924
        L_0x0871:
            java.lang.String r1 = r6.A03
            java.lang.Object r0 = r6.A02
            X.GG6 r0 = (X.GG6) r0
            com.instagram.common.session.UserSession r3 = r0.A09
            java.lang.Object r2 = r6.A01
            android.content.Context r2 = (android.content.Context) r2
            r12 = 1
            X.AnonymousClass7TF.A1B(r3, r12, r2)
            if (r1 == 0) goto L_0x0924
            java.lang.String r0 = "instagram://bloks/"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0890
            X.FFC.A03(r3, r2, r1)
            goto L_0x0924
        L_0x0890:
            boolean r0 = r2 instanceof androidx.fragment.app.FragmentActivity
            r5 = 0
            if (r0 == 0) goto L_0x0924
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            if (r2 == 0) goto L_0x0924
            r7 = 0
            com.instagram.simplewebview.SimpleWebViewConfig r4 = new com.instagram.simplewebview.SimpleWebViewConfig
            r6 = r5
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r13 = r7
            r14 = r7
            r15 = r12
            r16 = r12
            r17 = r7
            r18 = r7
            r19 = r5
            r20 = r1
            r4.<init>((java.lang.String) r5, (java.lang.String) r6, (boolean) r7, (boolean) r8, (boolean) r9, (boolean) r10, (boolean) r11, (boolean) r12, (boolean) r13, (boolean) r14, (boolean) r15, (boolean) r16, (boolean) r17, (boolean) r18, (java.lang.String) r19, (java.lang.String) r20)
            r0 = 12
            java.lang.String r0 = X.Pxd.A00(r0)
            android.os.Bundle r1 = X.DbY.A0B(r0, r4)
            X.R8R r0 = new X.R8R
            r0.<init>()
            r0.setArguments(r1)
            X.6Yo r0 = X.DbU.A0P(r5, r0, r2, r3)
            r0.A04()
            goto L_0x0924
        L_0x08cb:
            java.lang.Object r5 = r6.A01
            X.3Y5 r5 = (X.AnonymousClass3Y5) r5
            java.lang.String r4 = r6.A03
            r0 = 2131165319(0x7f070087, float:1.7944852E38)
            long r1 = X.C244013aV.A0C(r5, r0)
            X.2V4 r0 = r5.Bnf()
            int r3 = X.2Wd.A00(r0, r1)
            android.graphics.Paint r2 = X.JTO.A0C()
            X.2V1 r0 = r5.Aqq()
            android.content.Context r0 = r0.A0C
            android.util.DisplayMetrics r0 = X.AnonymousClass7TF.A0E(r0)
            float r1 = r0.scaledDensity
            r0 = 1096810496(0x41600000, float:14.0)
            float r1 = r1 * r0
            r2.setTextSize(r1)
            float r1 = r2.measureText(r4)
            float r0 = (float) r3
            float r1 = r1 + r0
            float r0 = X.C53925GwV.A00(r5)
            float r1 = r1 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            java.lang.Float r3 = java.lang.Float.valueOf(r1)
            return r3
        L_0x0909:
            java.lang.Object r0 = r6.A01
            X.GaS r0 = (X.C52654GaS) r0
            java.lang.Object r3 = r6.A02
            java.lang.String r4 = r6.A03
            X.AnonymousClass7TG.A1N(r3, r4)
            X.GDI r2 = r0.A07
            X.4Cq r0 = r2.A03()
            r5 = 0
            r6 = 0
            X.Ilc r1 = new X.Ilc
            r1.<init>(r2, r3, r4, r5, r6)
            X.AnonymousClass7TE.A1Z(r1, r0)
        L_0x0924:
            X.0gF r3 = X.C60340gF.A00
        L_0x0926:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73673Phm.invoke():java.lang.Object");
    }
}

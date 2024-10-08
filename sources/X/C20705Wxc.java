package X;

/* renamed from: X.Wxc  reason: case insensitive filesystem */
public final class C20705Wxc extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20705Wxc(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: X.ESI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: X.Ngf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: X.Ngf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v40, resolved type: X.ESI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v43, resolved type: X.ESI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: X.ESI} */
    /* JADX WARNING: type inference failed for: r0v148, types: [X.V4S, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03d8, code lost:
        r2.A02 = r11;
        r1 = X.ESI.A06(r2);
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03de, code lost:
        r2.setItems(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0544, code lost:
        X.0qQ.A0F(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x054b, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0564, code lost:
        r2 = new X.C310336ap();
        r2.A04();
        X.DbS.A19(r3.requireContext(), r2, 2131972828);
        r2.A02();
        r2.A07(com.instagram.android.R.drawable.instagram_check_pano_outline_24);
        r2.A0O = true;
        X.DbY.A1N(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x05e3, code lost:
        if (X.00k.A0l(((X.C61236JzU) r1).A00, X.00k.A0k((java.lang.Iterable) r2.A01)).isEmpty() == false) goto L_0x05e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0141, code lost:
        X.C13990Tnq.A1V(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0146, code lost:
        r6 = "recentlyEditedContent";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014a, code lost:
        r6 = "declinedRequestContent";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x014e, code lost:
        r6 = "pendingRequestContent";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0152, code lost:
        r6 = com.facebook.react.modules.dialog.DialogModule.KEY_TITLE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0156, code lost:
        r6 = "mediaFeedResponse";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x015a, code lost:
        r6 = "approvedCommunityContent";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015e, code lost:
        r6 = "pullToRefresh";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b2, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r28) {
        /*
            r27 = this;
            r2 = r27
            r11 = r28
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x066e;
                case 1: goto L_0x0587;
                case 2: goto L_0x0558;
                case 3: goto L_0x0553;
                case 4: goto L_0x053a;
                case 5: goto L_0x04a6;
                case 6: goto L_0x0415;
                case 7: goto L_0x040a;
                case 8: goto L_0x03f9;
                case 9: goto L_0x0653;
                case 10: goto L_0x064a;
                case 11: goto L_0x061f;
                case 12: goto L_0x0610;
                case 13: goto L_0x05f1;
                case 14: goto L_0x064a;
                case 15: goto L_0x064a;
                case 16: goto L_0x03e3;
                case 17: goto L_0x03d2;
                case 18: goto L_0x03cc;
                case 19: goto L_0x03c0;
                case 20: goto L_0x03b4;
                case 21: goto L_0x03a8;
                case 22: goto L_0x033c;
                case 23: goto L_0x02fa;
                case 24: goto L_0x02eb;
                case 25: goto L_0x02dc;
                case 26: goto L_0x05a8;
                case 27: goto L_0x02b4;
                case 28: goto L_0x0279;
                case 29: goto L_0x0262;
                case 30: goto L_0x0204;
                case 31: goto L_0x0595;
                case 32: goto L_0x01b7;
                case 33: goto L_0x01b7;
                case 34: goto L_0x0009;
                case 35: goto L_0x0009;
                case 36: goto L_0x0009;
                case 37: goto L_0x01ac;
                case 38: goto L_0x01a7;
                case 39: goto L_0x0193;
                case 40: goto L_0x0175;
                case 41: goto L_0x0162;
                case 42: goto L_0x00e3;
                case 43: goto L_0x00be;
                case 44: goto L_0x00e3;
                case 45: goto L_0x00be;
                case 46: goto L_0x0036;
                case 47: goto L_0x0010;
                case 48: goto L_0x0036;
                case 49: goto L_0x0010;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 0
            X.0qQ.A0B(r11, r0)
        L_0x000d:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0010:
            java.lang.Object r1 = r2.A01
            X.Uay r1 = (X.C15347Uay) r1
            X.3AD r0 = r1.A00
            if (r0 == 0) goto L_0x015e
            r3 = 0
            r0.setIsLoading(r3)
            X.0eM r0 = r1.A09
            java.lang.Object r0 = r0.getValue()
            X.Wcc r0 = (X.C19613Wcc) r0
            r0.FKG()
            androidx.fragment.app.FragmentActivity r2 = r1.getActivity()
            r1 = 2131956760(0x7f131418, float:1.9550085E38)
            java.lang.String r0 = "seller_management_failed"
            X.C59689JTv.A01(r2, r0, r1, r3)
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0036:
            X.UXl r11 = (X.C15251UXl) r11
            r1 = 0
            X.0qQ.A0B(r11, r1)
            java.lang.Object r6 = r2.A01
            X.Uay r6 = (X.C15347Uay) r6
            X.3AD r0 = r6.A00
            if (r0 == 0) goto L_0x015e
            r0.setIsLoading(r1)
            java.util.List r7 = r6.A05
            r7.clear()
            X.VTc r0 = r11.A00
            if (r0 == 0) goto L_0x015a
            X.CGN r0 = r0.A00
            if (r0 == 0) goto L_0x0156
            java.util.List r0 = r0.A05
            if (r0 != 0) goto L_0x0062
            X.0wj r2 = X.0wj.A01
            r1 = 817903268(0x30c036a4, float:1.3985368E-9)
            java.lang.String r0 = "Received null FeedItem list from MediaFeedResponse payload on IG Shopping featured product seller management fragment"
            X.DbT.A1Q(r2, r0, r1)
        L_0x0062:
            X.VTc r0 = r11.A00
            if (r0 == 0) goto L_0x015a
            X.CGN r0 = r0.A00
            if (r0 == 0) goto L_0x0156
            java.util.List r0 = r0.A05
            if (r0 == 0) goto L_0x0071
            r7.addAll(r0)
        L_0x0071:
            X.VTc r0 = r11.A00
            if (r0 == 0) goto L_0x015a
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x0152
            r6.A01 = r0
            X.0eM r0 = r6.A07
            java.lang.Object r5 = r0.getValue()
            X.Udb r5 = (X.C15486Udb) r5
            X.Vgt r2 = r11.A02
            if (r2 == 0) goto L_0x014e
            X.Vgt r1 = r11.A01
            if (r1 == 0) goto L_0x014a
            X.Vgt r0 = r11.A03
            if (r0 == 0) goto L_0x0146
            X.Vgt[] r0 = new X.C17840Vgt[]{r2, r1, r0}
            java.util.List r4 = X.0sr.A1P(r0)
            java.lang.String r3 = r6.A01
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r7.iterator()
        L_0x00a2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ac
            X.C13992Tns.A1A(r2, r1)
            goto L_0x00a2
        L_0x00ac:
            r5.A02(r4, r2, r3)
            X.0eM r0 = r6.A09
            java.lang.Object r0 = r0.getValue()
            X.Wcc r0 = (X.C19613Wcc) r0
            r0.FKG()
            X.0eM r0 = r6.A08
            goto L_0x0141
        L_0x00be:
            java.lang.Object r1 = r2.A01
            X.Uax r1 = (X.C15346Uax) r1
            X.3AD r0 = r1.A00
            if (r0 == 0) goto L_0x015e
            r3 = 0
            r0.setIsLoading(r3)
            X.0eM r0 = r1.A09
            java.lang.Object r0 = r0.getValue()
            X.Wcb r0 = (X.C19612Wcb) r0
            r0.FKG()
            androidx.fragment.app.FragmentActivity r2 = r1.getActivity()
            r1 = 2131956760(0x7f131418, float:1.9550085E38)
            java.lang.String r0 = "seller_management_failed"
            X.C59689JTv.A01(r2, r0, r1, r3)
            goto L_0x000d
        L_0x00e3:
            X.UXm r11 = (X.C15252UXm) r11
            r1 = 0
            X.0qQ.A0B(r11, r1)
            java.lang.Object r4 = r2.A01
            X.Uax r4 = (X.C15346Uax) r4
            X.3AD r0 = r4.A00
            if (r0 == 0) goto L_0x015e
            r0.setIsLoading(r1)
            java.util.List r5 = r4.A05
            r5.clear()
            X.VTb r0 = r11.A00
            if (r0 == 0) goto L_0x015a
            X.1XO r0 = r0.A00
            if (r0 == 0) goto L_0x0156
            java.util.List r0 = r0.A06
            X.0qQ.A07(r0)
            r5.addAll(r0)
            X.VTb r0 = r11.A00
            if (r0 == 0) goto L_0x015a
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x0152
            r4.A01 = r0
            X.0eM r0 = r4.A07
            java.lang.Object r3 = r0.getValue()
            X.Udb r3 = (X.C15486Udb) r3
            X.Vgt r2 = r11.A02
            if (r2 == 0) goto L_0x014e
            X.Vgt r1 = r11.A01
            if (r1 == 0) goto L_0x014a
            X.Vgt r0 = r11.A03
            if (r0 == 0) goto L_0x0146
            X.Vgt[] r0 = new X.C17840Vgt[]{r2, r1, r0}
            java.util.List r1 = X.0sr.A1P(r0)
            java.lang.String r0 = r4.A01
            r3.A02(r1, r5, r0)
            X.0eM r0 = r4.A09
            java.lang.Object r0 = r0.getValue()
            X.Wcb r0 = (X.C19612Wcb) r0
            r0.FKG()
            X.0eM r0 = r4.A08
        L_0x0141:
            X.C13990Tnq.A1V(r0)
            goto L_0x000d
        L_0x0146:
            java.lang.String r6 = "recentlyEditedContent"
            goto L_0x0544
        L_0x014a:
            java.lang.String r6 = "declinedRequestContent"
            goto L_0x0544
        L_0x014e:
            java.lang.String r6 = "pendingRequestContent"
            goto L_0x0544
        L_0x0152:
            java.lang.String r6 = "title"
            goto L_0x0544
        L_0x0156:
            java.lang.String r6 = "mediaFeedResponse"
            goto L_0x0544
        L_0x015a:
            java.lang.String r6 = "approvedCommunityContent"
            goto L_0x0544
        L_0x015e:
            java.lang.String r6 = "pullToRefresh"
            goto L_0x0544
        L_0x0162:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            java.lang.Object r0 = r2.A01
            X.Uak r0 = (X.C15335Uak) r0
            com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent r1 = r0.A00
            if (r1 == 0) goto L_0x000d
            boolean r0 = r11.booleanValue()
            r1.setRefreshing(r0)
            goto L_0x000d
        L_0x0175:
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r0 = r2.A01
            X.Uak r0 = (X.C15335Uak) r0
            X.0eM r0 = r0.A03
            java.lang.Object r1 = r0.getValue()
            X.2t9 r1 = (X.AnonymousClass2t9) r1
            com.instagram.common.recyclerview.ViewModelListUpdate r0 = new com.instagram.common.recyclerview.ViewModelListUpdate
            r0.<init>()
            X.0qQ.A0A(r11)
            r0.A01(r11)
            r1.A05(r0)
            goto L_0x000d
        L_0x0193:
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r0 = r2.A01
            X.Vgu r0 = (X.C17841Vgu) r0
            X.X55 r1 = r0.A00
            X.V4S r0 = new X.V4S
            r0.<init>()
            r0.A00 = r11
            r1.D1b(r0)
            goto L_0x000d
        L_0x01a7:
            java.lang.Object r0 = r2.A01
            X.0sa r0 = (X.C62320sa) r0
            goto L_0x01b2
        L_0x01ac:
            java.lang.Object r0 = r2.A01
            X.UKj r0 = (X.C15030UKj) r0
            X.0sa r0 = r0.A05
        L_0x01b2:
            r0.invoke()
            goto L_0x000d
        L_0x01b7:
            com.instagram.user.model.User r11 = (com.instagram.user.model.User) r11
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r0 = r2.A01
            X.Uef r0 = (X.C15551Uef) r0
            com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment r0 = r0.A03
            java.lang.String r3 = r0.A0I
            if (r3 == 0) goto L_0x01d6
            X.W2p r1 = r0.A07
            X.57K r2 = r0.A02
            java.lang.String r4 = X.C13988Tno.A0b(r11)
            java.lang.String r6 = r0.A0F
            java.lang.String r5 = "shopping_product_collection_page"
            r1.A06(r2, r3, r4, r5, r6)
        L_0x01d6:
            X.VwI r6 = r0.A0B
            androidx.fragment.app.Fragment r0 = r6.A02
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            com.instagram.common.session.UserSession r5 = r6.A03
            X.6Yo r4 = X.DbU.A0Q(r0, r5)
            X.1a1 r3 = X.C46447Df9.A02()
            java.lang.String r2 = X.AnonymousClass3ZA.A00(r11)
            X.0qQ.A0A(r2)
            X.4DU r0 = r6.A04
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "shopping_product_collection_page"
            X.Dfc r1 = X.C46548Dgp.A01(r5, r2, r0, r1)
            java.lang.String r0 = r6.A0I
            r1.A0L = r0
            X.C46474Dfc.A03(r4, r5, r3, r1)
            goto L_0x000d
        L_0x0204:
            X.5vh r11 = (X.C299705vh) r11
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r0 = r2.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2D6 r1 = X.2D5.A00(r0)
            X.5vg r11 = (X.C299695vg) r11
            boolean r0 = r11.A00
            r1.A0A(r0)
            boolean r0 = r11.A04
            r1.A0B(r0)
            boolean r2 = r11.A05
            X.0xa r3 = r1.A04
            X.0xY r1 = r3.AR4()
            r0 = 995(0x3e3, float:1.394E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.E5T(r0, r2)
            r1.apply()
            boolean r2 = r11.A01
            X.0xY r1 = r3.AR4()
            java.lang.String r0 = "PREFERENCE_REELS_RECOMMEND_ON_FACEBOOK_REUSE_ORIGINAL_AUDIO"
            r1.E5T(r0, r2)
            r1.apply()
            boolean r2 = r11.A03
            X.0xY r1 = r3.AR4()
            java.lang.String r0 = "PREFERENCE_REELS_SHOULD_SHOW_RECOMMEND_ON_FACEBOOK_INCENTIVES_CREATION_PRIMER"
            r1.E5T(r0, r2)
            r1.apply()
            boolean r2 = r11.A02
            X.0xY r1 = r3.AR4()
            r0 = 994(0x3e2, float:1.393E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.E5T(r0, r2)
            r1.apply()
            goto L_0x000d
        L_0x0262:
            X.JPI r11 = (X.JPI) r11
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r1 = r11.getKey()
            boolean r0 = r1 instanceof X.C48082EVa
            if (r0 == 0) goto L_0x000d
            if (r1 == 0) goto L_0x000d
            java.lang.Object r0 = r2.A01
            X.C51965G9l.A1W(r0, r1)
            goto L_0x000d
        L_0x0279:
            java.lang.String r3 = X.C41847B3o.A1E(r11)
            java.net.URI r0 = java.net.URI.create(r3)
            java.lang.String r1 = r0.getScheme()
            java.lang.String r0 = "instagram"
            boolean r1 = X.0qQ.A0K(r1, r0)
            java.lang.Object r2 = r2.A01
            X.JaK r2 = (X.C59844JaK) r2
            X.0eM r0 = r2.A02
            r0.getValue()
            if (r1 == 0) goto L_0x02a5
            android.content.Context r1 = r2.requireContext()
            X.0eM r0 = r2.A06
            com.instagram.common.session.UserSession r0 = X.JTU.A0J(r0)
            X.FFC.A03(r0, r1, r3)
            goto L_0x000d
        L_0x02a5:
            android.content.Context r1 = r2.requireContext()
            X.0eM r0 = r2.A06
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.C49859F9z.A00(r1, r0, r3)
            goto L_0x000d
        L_0x02b4:
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r0 = r2.A01
            X.JaK r0 = (X.C59844JaK) r0
            com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r2 = X.C59844JaK.A00(r0)
            com.instagram.settings2.core.data.SettingsRepository r0 = r2.A07
            X.05G r0 = r0.A0L
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r0 instanceof X.C65622Lwx
            if (r0 == 0) goto L_0x02d5
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 27
            X.C13989Tnp.A1S(r2, r1, r0)
        L_0x02d5:
            X.05G r0 = r2.A0J
            r0.Epw(r11)
            goto L_0x000d
        L_0x02dc:
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r2 = r2.A01
            X.Ngf r2 = (X.C69185Ngf) r2
            java.util.List r1 = r2.A03
            r1.remove(r11)
            goto L_0x03de
        L_0x02eb:
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r2 = r2.A01
            X.Ngf r2 = (X.C69185Ngf) r2
            java.util.List r1 = r2.A03
            r1.add(r0, r11)
            goto L_0x03de
        L_0x02fa:
            X.00I r11 = (X.00I) r11
            r1 = 0
            X.0qQ.A0B(r11, r1)
            java.lang.Object r0 = r2.A01
            X.E26 r0 = (X.E26) r0
            boolean r2 = r0.A0B
            java.lang.String r6 = "birthdayLogger"
            X.91o r3 = r0.A09
            if (r2 == 0) goto L_0x0328
            if (r3 == 0) goto L_0x0544
            X.0eM r2 = r0.A0N
            long r7 = X.Dbb.A08(r2)
            long r9 = X.Dbb.A08(r2)
            r6 = 0
            java.lang.String r4 = "qp"
            java.lang.String r5 = "opt_in_add_effect"
            r3.A02(r4, r5, r6, r7, r9)
        L_0x0320:
            r11.A04(r1)
            X.DbT.A1J(r0)
            goto L_0x000d
        L_0x0328:
            if (r3 == 0) goto L_0x0544
            X.0eM r2 = r0.A0N
            long r4 = X.Dbb.A08(r2)
            long r7 = X.Dbb.A08(r2)
            java.lang.String r6 = "qp"
            java.lang.String r9 = "opt_in_add_effect"
            r3.A00(r4, r6, r7, r9)
            goto L_0x0320
        L_0x033c:
            java.lang.Object r3 = r2.A01
            X.E26 r3 = (X.E26) r3
            java.util.List r0 = r3.A0A
            java.lang.String r6 = "audiences"
            r5 = 0
            if (r0 == 0) goto L_0x0544
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x0350:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0365
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.F00 r0 = (X.F00) r0
            X.EWN r0 = r0.A03
            if (r0 == r11) goto L_0x0350
            r4.add(r1)
            goto L_0x0350
        L_0x0365:
            java.util.Iterator r2 = r4.iterator()
        L_0x0369:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0379
            java.lang.Object r1 = r2.next()
            X.F00 r1 = (X.F00) r1
            r0 = 0
            r1.A01 = r0
            goto L_0x0369
        L_0x0379:
            java.util.List r0 = r3.A0A
            if (r0 == 0) goto L_0x0544
            java.util.Iterator r2 = r0.iterator()
        L_0x0381:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03a1
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.F00 r0 = (X.F00) r0
            X.EWN r0 = r0.A03
            if (r0 != r11) goto L_0x0381
        L_0x0392:
            X.F00 r1 = (X.F00) r1
            if (r1 == 0) goto L_0x0399
            r0 = 1
            r1.A01 = r0
        L_0x0399:
            X.Dlv r0 = r3.A07
            if (r0 != 0) goto L_0x03a3
            java.lang.String r6 = "audienceAdapter"
            goto L_0x0544
        L_0x03a1:
            r1 = r5
            goto L_0x0392
        L_0x03a3:
            r0.notifyDataSetChanged()
            goto L_0x000d
        L_0x03a8:
            java.lang.String r1 = X.C41847B3o.A1E(r11)
            java.lang.Object r0 = r2.A01
            X.K4f r0 = (X.C61363K4f) r0
            r0.A0O = r1
            goto L_0x000d
        L_0x03b4:
            java.lang.String r1 = X.C41847B3o.A1E(r11)
            java.lang.Object r0 = r2.A01
            X.K4f r0 = (X.C61363K4f) r0
            r0.A0P = r1
            goto L_0x000d
        L_0x03c0:
            java.lang.String r1 = X.C41847B3o.A1E(r11)
            java.lang.Object r0 = r2.A01
            X.K4f r0 = (X.C61363K4f) r0
            r0.A0Q = r1
            goto L_0x000d
        L_0x03cc:
            java.lang.Object r2 = r2.A01
            X.ESI r2 = (X.ESI) r2
            r11 = 0
            goto L_0x03d8
        L_0x03d2:
            X.Jvv r11 = (X.C61057Jvv) r11
            java.lang.Object r2 = r2.A01
            X.ESI r2 = (X.ESI) r2
        L_0x03d8:
            r2.A02 = r11
            java.util.ArrayList r1 = X.ESI.A06(r2)
        L_0x03de:
            r2.setItems(r1)
            goto L_0x000d
        L_0x03e3:
            java.util.List r11 = (java.util.List) r11
            r4 = 0
            X.0qQ.A0B(r11, r4)
            X.Mmf r3 = X.C67363Mmf.A00
            java.lang.Object r2 = r2.A01
            r1 = 20
            X.To0 r0 = new X.To0
            r0.<init>(r2, r1)
            r3.A00(r11, r0, r4)
            goto L_0x000d
        L_0x03f9:
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r0 = r2.A01
            X.Mqn r0 = (X.C67615Mqn) r0
            X.JRI r8 = r0.A01
            r12 = 0
            r9 = 0
            r10 = r9
            r13 = r12
            r8.Dex(r9, r10, r11, r12, r13)
            goto L_0x000d
        L_0x040a:
            java.lang.Object r0 = r2.A01
            X.Mqn r0 = (X.C67615Mqn) r0
            X.JRI r0 = r0.A01
            r0.DeS()
            goto L_0x000d
        L_0x0415:
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r2 = r2.A01
            X.UqY r2 = (X.C16209UqY) r2
            X.0qQ.A0A(r11)
            java.util.Set r5 = r2.A03
            boolean r8 = r5.isEmpty()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r11.iterator()
        L_0x042d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0445
            java.lang.Object r1 = r3.next()
            boolean r0 = r1 instanceof X.C296925qs
            if (r0 == 0) goto L_0x042d
            boolean r0 = r5.add(r1)
            if (r0 == 0) goto L_0x042d
            r4.add(r1)
            goto L_0x042d
        L_0x0445:
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r4)
            java.util.Iterator r3 = r4.iterator()
        L_0x044d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x046c
            java.lang.Object r1 = r3.next()
            X.5qt r1 = (X.C296935qt) r1
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.discovery.recyclerview.model.ClipsVideoGridItemViewModel"
            X.0qQ.A0C(r1, r0)
            X.5qs r1 = (X.C296925qs) r1
            X.1Xj r0 = r1.BPf()
            X.4bN r0 = X.C295375o3.A02(r0)
            r7.add(r0)
            goto L_0x044d
        L_0x046c:
            boolean r0 = X.AnonymousClass7TE.A1b(r7)
            if (r0 == 0) goto L_0x000d
            X.2nF r3 = r2.A00
            if (r3 != 0) goto L_0x047a
            java.lang.String r6 = "clipsGridItemsStore"
            goto L_0x0544
        L_0x047a:
            java.lang.String r6 = X.C13988Tno.A0a(r2)
            X.5u8 r1 = X.C276114sa.A00
            X.N4N r0 = X.C13989Tnp.A0b(r2)
            java.lang.String r0 = r0.A0E
            if (r0 == 0) goto L_0x04a4
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
        L_0x048c:
            X.5u9 r1 = r1.A00(r0)
            X.N4N r0 = X.C13989Tnp.A0b(r2)
            java.lang.String r0 = r0.A0D
            r1.A00 = r0
            X.4sZ r4 = r1.A00()
            r9 = 1
            X.5nD r5 = X.C294895nD.DEFAULT
            r3.A03(r4, r5, r6, r7, r8, r9)
            goto L_0x000d
        L_0x04a4:
            r0 = 0
            goto L_0x048c
        L_0x04a6:
            X.ULh r11 = (X.C15051ULh) r11
            java.lang.Object r0 = r2.A01
            X.UZq r0 = (X.C15286UZq) r0
            X.IY3 r7 = r0.A05
            if (r7 == 0) goto L_0x000d
            if (r11 == 0) goto L_0x000d
            java.lang.Object r1 = r11.A02
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x000d
            boolean r6 = r11.A03
            int r5 = r11.A01
            int r8 = r11.A00
            r4 = 0
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0q(r1, r4)
            java.util.Iterator r12 = r1.iterator()
            r2 = -1
            r24 = 0
            r11 = -1
        L_0x04cf:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x052f
            X.0eP r9 = X.JTO.A1A(r12)
            if (r24 != 0) goto L_0x04ed
            java.lang.Object r10 = r9.A00
            java.lang.Number r10 = (java.lang.Number) r10
            int r1 = r10.intValue()
            int r1 = r1 - r11
            r0 = 1
            boolean r24 = X.C51970G9q.A1W(r1, r0)
            int r11 = r10.intValue()
        L_0x04ed:
            r14 = 0
            r22 = 16225(0x3f61, float:2.2736E-41)
            X.2vl r13 = new X.2vl
            r15 = r14
            r16 = r14
            r18 = r2
            r20 = r5
            r21 = r4
            r23 = r6
            r25 = r4
            r26 = r4
            r19 = r4
            r17 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r0 = r9.A00
            int r0 = X.AnonymousClass7TE.A0M(r0)
            int r0 = r0 + r5
            r13.A0B(r0)
            r13.A0A(r2)
            java.lang.Object r1 = r9.A01
            X.5oq r1 = (X.C295745oq) r1
            java.lang.Integer r19 = java.lang.Integer.valueOf(r8)
            r20 = 4
            X.9Ig r0 = new X.9Ig
            r15 = r0
            r16 = r1
            r17 = r13
            r18 = r14
            r15.<init>((X.C295745oq) r16, (X.C233462vl) r17, (java.lang.Integer) r18, (java.lang.Integer) r19, (int) r20)
            r3.add(r0)
            goto L_0x04cf
        L_0x052f:
            X.2uu r1 = r7.A00
            if (r1 == 0) goto L_0x000d
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.Dlz(r0, r3)
            goto L_0x000d
        L_0x053a:
            java.lang.Object r0 = r2.A01
            X.UZq r0 = (X.C15286UZq) r0
            X.TpO r0 = r0.A06
            if (r0 != 0) goto L_0x054c
            java.lang.String r6 = "grid"
        L_0x0544:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x054c:
            X.TsA r0 = r0.A0E
            X.C14227TsA.A00(r0)
            goto L_0x000d
        L_0x0553:
            java.lang.Object r3 = r2.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            goto L_0x0564
        L_0x0558:
            java.lang.Object r3 = r2.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            android.content.Context r1 = r3.requireContext()
            r0 = 0
            X.C49954FGj.A03(r1, r0, r0, r0)
        L_0x0564:
            X.6ap r2 = new X.6ap
            r2.<init>()
            r2.A04()
            android.content.Context r1 = r3.requireContext()
            r0 = 2131972828(0x7f1352dc, float:1.9582675E38)
            X.DbS.A19(r1, r2, r0)
            r2.A02()
            r0 = 2131238069(0x7f081cb5, float:1.8092406E38)
            r2.A07(r0)
            r0 = 1
            r2.A0O = r0
            X.DbY.A1N(r2)
            goto L_0x000d
        L_0x0587:
            androidx.recyclerview.widget.RecyclerView r11 = (androidx.recyclerview.widget.RecyclerView) r11
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r0 = r2.A01
            X.Ttn r0 = (X.C14313Ttn) r0
            r0.A00 = r11
            goto L_0x000d
        L_0x0595:
            boolean r1 = X.AnonymousClass7TE.A1a(r11)
            java.lang.Object r0 = r2.A01
            X.X8c r0 = (X.C20986X8c) r0
            if (r1 == 0) goto L_0x05a4
            r0.onAccept()
        L_0x05a2:
            r4 = 0
            return r4
        L_0x05a4:
            r0.onDecline()
            goto L_0x05a2
        L_0x05a8:
            X.LSs r11 = (X.C64185LSs) r11
            r0 = 0
            X.0qQ.A0B(r11, r0)
            X.MQz r1 = r11.A06()
            X.Flk r0 = X.C50957Flk.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            r3 = 0
            if (r0 != 0) goto L_0x05e6
            X.Lx3 r0 = X.C65626Lx3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x05e6
            boolean r0 = r1 instanceof X.C65625Lx2
            if (r0 != 0) goto L_0x05e5
            boolean r0 = r1 instanceof X.C65624Lx1
            if (r0 != 0) goto L_0x05e5
            boolean r0 = r1 instanceof X.C61236JzU
            if (r0 == 0) goto L_0x05eb
            X.JzU r1 = (X.C61236JzU) r1
            java.util.Set r1 = r1.A00
            java.lang.Object r0 = r2.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r0 = X.00k.A0k(r0)
            java.util.Set r0 = X.00k.A0l(r1, r0)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x05e6
        L_0x05e5:
            r3 = 1
        L_0x05e6:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        L_0x05eb:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x05f1:
            r5 = 0
            X.0qQ.A0B(r11, r5)
            java.lang.Object r4 = r2.A01
            X.ULh r4 = (X.C15051ULh) r4
            r0 = 1
            X.0qQ.A0B(r4, r0)
            java.lang.Object r3 = r4.A02
            java.util.List r3 = (java.util.List) r3
            boolean r2 = r4.A03
            int r1 = r4.A01
            int r0 = r4.A00
            X.0qQ.A0B(r3, r5)
            X.ULh r4 = new X.ULh
            r4.<init>((java.util.List) r3, (int) r1, (int) r0, (boolean) r2)
            return r4
        L_0x0610:
            java.lang.Object r1 = r2.A01
            X.N4N r1 = (X.N4N) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            X.N4N r4 = X.N4N.A00((X.C15051ULh) null, (X.C61041Jvf) null, (X.N3M) null, (X.1Xj) null, (X.OEW) null, (X.C69628NpA) null, r1, r0, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.Map) null, (java.util.Map) null, 0, 0, 33554423, false, false, false, false, false, false)
            return r4
        L_0x061f:
            java.lang.Object r4 = r2.A01
            X.N4N r4 = (X.N4N) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.util.List r0 = r4.A0H
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x0632:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0642
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C16194UqJ
            X.DbV.A1U(r1, r3, r0)
            goto L_0x0632
        L_0x0642:
            r0 = 33554430(0x1fffffe, float:9.4039537E-38)
            X.N4N r4 = X.N4N.A00((X.C15051ULh) null, (X.C61041Jvf) null, (X.N3M) null, (X.1Xj) null, (X.OEW) null, (X.C69628NpA) null, r4, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, r3, (java.util.Map) null, (java.util.Map) null, 0, 0, r0, false, false, false, false, false, false)
            return r4
        L_0x064a:
            java.lang.Object r0 = r2.A01
            X.N4N r0 = (X.N4N) r0
            X.N4N r4 = X.C56348Hwz.A00(r0)
            return r4
        L_0x0653:
            java.lang.Object r3 = r2.A01
            X.N4N r3 = (X.N4N) r3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            r1 = 0
            X.ULh r0 = new X.ULh
            r0.<init>()
            r8 = 33488895(0x1feffff, float:9.36722E-38)
            r2 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            X.N4N r4 = X.N4N.A00(r0, r1, (X.N3M) null, r2, (X.OEW) null, (X.C69628NpA) null, r3, (java.lang.Integer) null, r4, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, r5, r6, r7, 0, 0, r8, false, false, false, false, false, false)
            return r4
        L_0x066e:
            X.Vd2 r11 = (X.C17733Vd2) r11
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r0 = r2.A01
            X.0lg r0 = (X.0lg) r0
            X.1NY r4 = X.DbU.A0M(r0)
            java.lang.Class<X.Nfd> r1 = X.C69154Nfd.class
            java.lang.Class<X.OR7> r0 = X.OR7.class
            r4.A0Q(r1, r0)
            X.C18242Vo9.A01(r4, r11)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20705Wxc.invoke(java.lang.Object):java.lang.Object");
    }
}

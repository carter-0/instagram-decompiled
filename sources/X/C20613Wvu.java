package X;

/* renamed from: X.Wvu  reason: case insensitive filesystem */
public final class C20613Wvu extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20613Wvu(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0246, code lost:
        if (r3.getContext() == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0248, code lost:
        r3 = r3.requireContext();
        r2 = 0;
        r1 = r1.intValue();
        r0 = r4.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0253, code lost:
        if (r0 == null) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0255, code lost:
        r2 = r0.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0261, code lost:
        return X.C55147Hcv.A00(r3, r1, r2).toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02ec, code lost:
        return X.AnonymousClass0kN.A01((X.AnonymousClass0iw) r2.A01, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0425, code lost:
        X.C59689JTv.A09(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0682, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f0, code lost:
        if (r4.A0C == false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0135, code lost:
        if (r2.equals("others_on_fb") == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x022d, code lost:
        r2.A11(r1, r0, r3);
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0191  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r21 = this;
            r2 = r21
            int r0 = r2.A00
            switch(r0) {
                case 3: goto L_0x0046;
                case 4: goto L_0x0007;
                case 5: goto L_0x0007;
                case 6: goto L_0x01a5;
                case 7: goto L_0x01a5;
                case 8: goto L_0x01b6;
                case 9: goto L_0x0007;
                case 10: goto L_0x01e7;
                case 11: goto L_0x002a;
                case 12: goto L_0x0007;
                case 13: goto L_0x01f7;
                case 14: goto L_0x020a;
                case 15: goto L_0x0219;
                case 16: goto L_0x0232;
                case 17: goto L_0x0264;
                case 18: goto L_0x027d;
                case 19: goto L_0x028e;
                case 20: goto L_0x02bd;
                case 21: goto L_0x02cc;
                case 22: goto L_0x02d9;
                case 23: goto L_0x02de;
                case 24: goto L_0x0007;
                case 25: goto L_0x02ed;
                case 26: goto L_0x0344;
                case 27: goto L_0x0007;
                case 28: goto L_0x0370;
                case 29: goto L_0x03b6;
                case 30: goto L_0x0007;
                case 31: goto L_0x0007;
                case 32: goto L_0x0007;
                case 33: goto L_0x0007;
                case 34: goto L_0x0007;
                case 35: goto L_0x0007;
                case 36: goto L_0x0007;
                case 37: goto L_0x0007;
                case 38: goto L_0x0007;
                case 39: goto L_0x0007;
                case 40: goto L_0x042c;
                case 41: goto L_0x0457;
                case 42: goto L_0x0494;
                case 43: goto L_0x0529;
                case 44: goto L_0x0590;
                case 45: goto L_0x05ae;
                case 46: goto L_0x05f1;
                case 47: goto L_0x064c;
                case 48: goto L_0x066a;
                case 49: goto L_0x067a;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r2.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0013
            java.lang.Object r3 = r0.invoke()
            if (r3 != 0) goto L_0x0029
        L_0x0013:
            java.lang.Object r0 = r2.A02
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r1 = r0.getValue()
            X.07g r1 = (X.AnonymousClass07g) r1
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x0043
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x0043
            X.2YQ r3 = r1.getDefaultViewModelCreationExtras()
        L_0x0029:
            return r3
        L_0x002a:
            java.lang.Object r0 = r2.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0036
            java.lang.Object r3 = r0.invoke()
            if (r3 != 0) goto L_0x0029
        L_0x0036:
            java.lang.Object r0 = r2.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            X.2YQ r3 = r0.getDefaultViewModelCreationExtras()
            return r3
        L_0x0043:
            X.2YP r3 = X.AnonymousClass2YP.A00
            return r3
        L_0x0046:
            java.lang.Object r4 = r2.A02
            X.PQ2 r4 = (X.PQ2) r4
            java.lang.Object r5 = r2.A01
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r5 = (com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions) r5
            r3 = 0
            X.0qQ.A0B(r5, r3)
            java.lang.String[] r8 = X.C17154VKg.A01
            r7 = 6
            r6 = 0
            r1 = 0
        L_0x0057:
            r0 = r8[r1]
            java.lang.String r2 = r4.A0A
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 == 0) goto L_0x019f
            r6 = 1
        L_0x0062:
            X.16V r1 = r4.A08
            X.16V r0 = X.16V.A05
            if (r1 == r0) goto L_0x00f4
            boolean r0 = r4.A0C
            if (r0 != 0) goto L_0x0102
            if (r6 == 0) goto L_0x0102
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r0 = r4.A01
            r0.A00 = r5
            r0.A01 = r5
            r0.A09 = r5
        L_0x0076:
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r0 = r4.A01
            r0.A07 = r5
        L_0x007a:
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r8 = r4.A01
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r11 = r8.A05
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r15 = r8.A08
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r7 = r8.A07
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r6 = r8.A04
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r0 = r8.A06
            r12 = 0
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r10 = new com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel
            r13 = r12
            r14 = r12
            r17 = r12
            r18 = r12
            r20 = r0
            r19 = r6
            r16 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            int r1 = r1.ordinal()
            r0 = 2
            if (r1 != r0) goto L_0x00ee
            boolean r0 = r4.A0D
            if (r0 == 0) goto L_0x00f2
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r11 = r8.A05
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r10 = r8.A08
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r9 = r8.A07
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r7 = r8.A03
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r6 = r8.A02
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r1 = r8.A04
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions r0 = r8.A06
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r8 = new com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel
            r15 = r10
            r16 = r9
            r17 = r7
            r18 = r6
            r19 = r1
            r20 = r0
            r10 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x00c2:
            X.OyI r6 = r4.A07
            r6.A02(r8, r2)
            java.lang.String r1 = r5.A03
            X.Ngf r0 = r4.A02
            if (r0 == 0) goto L_0x00d3
            X.OTj r0 = r4.A03
            if (r0 == 0) goto L_0x00d3
            r0.A00 = r1
        L_0x00d3:
            X.OTj r0 = r4.A03
            if (r0 == 0) goto L_0x00d9
            r0.A03 = r3
        L_0x00d9:
            android.content.Context r2 = r4.A05
            r1 = 2131966270(0x7f13393e, float:1.9569373E38)
            r0 = 1
            android.widget.Toast r0 = X.C59689JTv.A01(r2, r12, r1, r0)
            r6.A00 = r0
            X.Ngf r0 = r4.A02
            if (r0 == 0) goto L_0x0680
            r0.A07()
            goto L_0x0680
        L_0x00ee:
            boolean r0 = r4.A0C
            if (r0 != 0) goto L_0x00c2
        L_0x00f2:
            r8 = r10
            goto L_0x00c2
        L_0x00f4:
            boolean r0 = r4.A0D
            if (r0 != 0) goto L_0x0102
            if (r6 == 0) goto L_0x0102
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r0 = r4.A01
            r0.A03 = r5
            r0.A02 = r5
            goto L_0x0076
        L_0x0102:
            int r0 = r2.hashCode()
            switch(r0) {
                case -2143256302: goto L_0x0191;
                case -1890055046: goto L_0x0183;
                case -1839818691: goto L_0x0175;
                case -1275916548: goto L_0x0167;
                case -456614348: goto L_0x0155;
                case -371252023: goto L_0x0147;
                case -8227469: goto L_0x0139;
                case 949752640: goto L_0x012f;
                case 949752738: goto L_0x011d;
                case 1767124056: goto L_0x010b;
                default: goto L_0x0109;
            }
        L_0x0109:
            goto L_0x007a
        L_0x010b:
            r0 = 862(0x35e, float:1.208E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x007a
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r0 = r4.A01
            r0.A04 = r5
            goto L_0x007a
        L_0x011d:
            r0 = 377(0x179, float:5.28E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x007a
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r0 = r4.A01
            r0.A08 = r5
            goto L_0x007a
        L_0x012f:
            java.lang.String r0 = "others_on_fb"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0076
            goto L_0x007a
        L_0x0139:
            java.lang.String r0 = "fb_liked_or_followed_your_page"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x007a
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r0 = r4.A01
            r0.A02 = r5
            goto L_0x007a
        L_0x0147:
            java.lang.String r0 = "ig_verified"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x007a
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r0 = r4.A01
            r0.A06 = r5
            goto L_0x007a
        L_0x0155:
            r0 = 132(0x84, float:1.85E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x007a
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r0 = r4.A01
            r0.A05 = r5
            goto L_0x007a
        L_0x0167:
            java.lang.String r0 = "fb_messaged_your_page"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x007a
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r0 = r4.A01
            r0.A03 = r5
            goto L_0x007a
        L_0x0175:
            java.lang.String r0 = "people_with_your_phone_number"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x007a
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r0 = r4.A01
            r0.A09 = r5
            goto L_0x007a
        L_0x0183:
            java.lang.String r0 = "fb_friends_of_friends"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x007a
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r0 = r4.A01
            r0.A01 = r5
            goto L_0x007a
        L_0x0191:
            java.lang.String r0 = "fb_friends"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x007a
            com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r0 = r4.A01
            r0.A00 = r5
            goto L_0x007a
        L_0x019f:
            int r1 = r1 + 1
            if (r1 >= r7) goto L_0x0062
            goto L_0x0057
        L_0x01a5:
            java.lang.Object r3 = r2.A01
            X.0sL r3 = (X.0sL) r3
            java.lang.Object r0 = r2.A02
            X.Gbx r0 = (X.C52745Gbx) r0
            X.XRZ r1 = r0.A07
            X.LSs r0 = r0.A06
            r3.invoke(r1, r0)
            goto L_0x0680
        L_0x01b6:
            java.lang.Object r0 = r2.A02
            X.JaK r0 = (X.C59844JaK) r0
            com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r5 = X.C59844JaK.A00(r0)
            java.lang.Object r0 = r2.A01
            X.Jw3 r0 = (X.C61065Jw3) r0
            java.lang.Object r4 = r0.A02
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r0 = 44
            boolean r0 = X.C61078JwG.A00(r0, r4)
            if (r0 == 0) goto L_0x01e1
            X.6oS r3 = X.C318116oQ.A00(r5)
            r2 = 0
            r1 = 30
            X.MGf r0 = new X.MGf
            r0.<init>((java.lang.Object) r4, (java.lang.Object) r5, (X.AnonymousClass4D7) r2, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            goto L_0x0680
        L_0x01e1:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x01e7:
            java.lang.Object r0 = r2.A02
            com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r0 = (com.instagram.settings2.core.viewmodel.SettingsScreenViewModel) r0
            com.instagram.common.session.UserSession r1 = r0.A06
            java.lang.Object r0 = r2.A01
            X.0iw r0 = (X.AnonymousClass0iw) r0
            X.LFr r3 = new X.LFr
            r3.<init>(r0, r1)
            return r3
        L_0x01f7:
            java.lang.Object r0 = r2.A02
            X.Vcz r0 = (X.C17730Vcz) r0
            com.instagram.shopping.fragment.cart.ShoppingCartFragment r0 = r0.A0A
            java.lang.Object r3 = r2.A01
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive r3 = (com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive) r3
            X.3kF r2 = X.C249713kF.A00
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            com.instagram.common.session.UserSession r0 = r0.A02
            goto L_0x022d
        L_0x020a:
            java.lang.Object r0 = r2.A02
            X.Vcz r0 = (X.C17730Vcz) r0
            com.instagram.shopping.fragment.cart.ShoppingCartFragment r3 = r0.A0A
            java.lang.Object r4 = r2.A01
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive r4 = (com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive) r4
            java.lang.Integer r1 = r4.A04
            if (r1 == 0) goto L_0x0262
            goto L_0x0242
        L_0x0219:
            java.lang.Object r0 = r2.A02
            X.W1F r0 = (X.W1F) r0
            X.Wbk r0 = r0.A09
            java.lang.Object r3 = r2.A01
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive r3 = (com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive) r3
            X.3kF r2 = X.C249713kF.A00
            com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment r0 = r0.A00
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            com.instagram.common.session.UserSession r0 = r0.A02
        L_0x022d:
            r2.A11(r1, r0, r3)
            goto L_0x0680
        L_0x0232:
            java.lang.Object r0 = r2.A02
            X.W1F r0 = (X.W1F) r0
            X.Wbk r0 = r0.A09
            java.lang.Object r4 = r2.A01
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive r4 = (com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive) r4
            java.lang.Integer r1 = r4.A04
            if (r1 == 0) goto L_0x0262
            com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment r3 = r0.A00
        L_0x0242:
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L_0x0262
            android.content.Context r3 = r3.requireContext()
            r2 = 0
            int r1 = r1.intValue()
            java.lang.Integer r0 = r4.A05
            if (r0 == 0) goto L_0x0259
            int r2 = r0.intValue()
        L_0x0259:
            java.lang.String r0 = X.C55147Hcv.A00(r3, r1, r2)
            java.lang.String r3 = r0.toString()
            return r3
        L_0x0262:
            r3 = 0
            return r3
        L_0x0264:
            java.lang.Object r1 = r2.A01
            X.VOc r1 = (X.C17250VOc) r1
            java.lang.Object r2 = r2.A02
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.6xI r0 = r1.A00
            X.6rM r1 = r0.Bgg()
            java.lang.String r0 = "shop_row"
            r1.Czd(r2, r0)
            goto L_0x0680
        L_0x027d:
            java.lang.Object r5 = r2.A02
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r4 = r2.A01
            X.4DU r4 = (X.AnonymousClass4DU) r4
            r8 = 1
            r6 = 0
            X.IWI r3 = new X.IWI
            r7 = r4
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L_0x028e:
            java.lang.Object r0 = r2.A02
            X.VOx r0 = (X.C17270VOx) r0
            X.X4n r5 = r0.A00
            java.lang.Object r4 = r2.A01
            X.1Xj r4 = (X.1Xj) r4
            X.3xf r3 = r4.A1F()
            com.instagram.user.model.User r2 = X.C51966G9m.A11(r4)
            X.3xf r0 = r4.A1F()
            if (r0 == 0) goto L_0x02bb
            java.lang.String r1 = r0.C4h()
        L_0x02aa:
            X.3xf r0 = r4.A1F()
            if (r0 == 0) goto L_0x02b9
            java.lang.String r0 = r0.C4g()
        L_0x02b4:
            r5.DKP(r3, r2, r1, r0)
            goto L_0x0680
        L_0x02b9:
            r0 = 0
            goto L_0x02b4
        L_0x02bb:
            r1 = 0
            goto L_0x02aa
        L_0x02bd:
            java.lang.Object r0 = r2.A02
            X.UeV r0 = (X.UeV) r0
            X.XCC r1 = r0.A00
            java.lang.Object r0 = r2.A01
            X.Urd r0 = (X.C16276Urd) r0
            r1.DIv(r0)
            goto L_0x0680
        L_0x02cc:
            java.lang.Object r0 = r2.A02
            X.NOS r0 = (X.NOS) r0
            X.0sP r1 = r0.A02
            java.lang.Object r0 = r2.A01
            r1.invoke(r0)
            goto L_0x0680
        L_0x02d9:
            java.lang.Object r1 = r2.A02
            X.0lg r1 = (X.0lg) r1
            goto L_0x02e4
        L_0x02de:
            java.lang.Object r0 = r2.A02
            X.VjS r0 = (X.C17990VjS) r0
            com.instagram.common.session.UserSession r1 = r0.A00
        L_0x02e4:
            java.lang.Object r0 = r2.A01
            X.0iw r0 = (X.AnonymousClass0iw) r0
            X.0wc r3 = X.AnonymousClass0kN.A01(r0, r1)
            return r3
        L_0x02ed:
            java.lang.Object r5 = r2.A02
            X.35Y r5 = (X.AnonymousClass35Y) r5
            X.4DH r3 = r5.A00
            boolean r0 = r3.isAdded()
            if (r0 == 0) goto L_0x0680
            java.lang.Object r6 = r2.A01
            com.instagram.model.reels.Reel r6 = (com.instagram.model.reels.Reel) r6
            int r0 = X.JTT.A06(r3)
            float r2 = (float) r0
            int r0 = X.C13990Tnq.A0A(r3)
            float r1 = (float) r0
            r0 = 0
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>(r0, r0, r2, r1)
            X.0eM r0 = r5.A03
            java.lang.Object r5 = r0.getValue()
            X.32A r5 = (X.AnonymousClass32A) r5
            java.lang.String r0 = X.AnonymousClass7TF.A0b()
            r5.A0C = r0
            androidx.fragment.app.FragmentActivity r3 = r3.requireActivity()
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r0 = 7
            X.FkY r1 = new X.FkY
            r1.<init>(r0)
            X.Upq r0 = new X.Upq
            r0.<init>((android.app.Activity) r3, (android.graphics.RectF) r4, (X.C230222pE) r1, (java.lang.Integer) r2)
            r5.A05 = r0
            r0 = 5
            X.Wb4 r8 = new X.Wb4
            r8.<init>(r4, r0)
            java.util.List r9 = X.AnonymousClass7TE.A1I(r6)
            java.util.List r10 = X.AnonymousClass7TE.A1I(r6)
            X.3BQ r7 = X.AnonymousClass3BQ.INSTAGRAM_SHOPPING_SHOP_HIGHLIGHT
            r11 = 0
            r5.A06(r6, r7, r8, r9, r10, r11)
            goto L_0x0680
        L_0x0344:
            java.lang.Object r6 = r2.A02
            X.35Y r6 = (X.AnonymousClass35Y) r6
            X.4DH r1 = r6.A00
            boolean r0 = r1.isAdded()
            if (r0 == 0) goto L_0x0680
            java.lang.Object r5 = r2.A01
            X.0eM r0 = r6.A04
            java.lang.Object r4 = r0.getValue()
            X.LEt r4 = (X.C63951LEt) r4
            android.content.Context r3 = r1.requireContext()
            X.0gy r2 = X.AnonymousClass07i.A00(r1)
            r0 = 48
            X.PqS r1 = new X.PqS
            r1.<init>((int) r0, (java.lang.Object) r6, (java.lang.Object) r5)
            X.Wx1 r0 = X.C20669Wx1.A00
            r4.A01(r3, r2, r0, r1)
            goto L_0x0680
        L_0x0370:
            java.lang.Object r5 = r2.A02
            X.UZI r5 = (X.UZI) r5
            X.0eM r0 = r5.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.VPQ r0 = X.C17091VHn.A00(r0)
            com.instagram.common.session.UserSession r0 = r0.A00
            X.ERE r4 = new X.ERE
            r4.<init>(r0)
            java.lang.Object r1 = r2.A01
            com.instagram.user.model.Product r1 = (com.instagram.user.model.Product) r1
            com.instagram.user.model.User r0 = r1.A0B
            r2 = 0
            if (r0 == 0) goto L_0x03b4
            java.lang.String r3 = X.AnonymousClass3ZA.A00(r0)
        L_0x0392:
            X.0qQ.A0A(r3)
            if (r0 == 0) goto L_0x039b
            java.lang.String r2 = X.C13988Tno.A0b(r0)
        L_0x039b:
            X.0qQ.A0A(r2)
            java.lang.String r0 = r1.A0H
            X.AnonymousClass7TG.A1T(r3, r2, r0)
            X.EyN r1 = new X.EyN
            r1.<init>(r3, r2, r0)
            java.lang.String r0 = "pinned"
            X.ERE.A01(r1, r4, r0)
            android.content.Context r1 = r5.getContext()
            java.lang.String r0 = "Pinned Product Details Page"
            goto L_0x0425
        L_0x03b4:
            r3 = r2
            goto L_0x0392
        L_0x03b6:
            java.lang.Object r7 = r2.A02
            X.UZI r7 = (X.UZI) r7
            X.0eM r0 = r7.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.VPQ r0 = X.C17091VHn.A00(r0)
            com.instagram.common.session.UserSession r9 = r0.A00
            r3 = 1
            X.0qQ.A0B(r9, r3)
            java.lang.String r8 = "profile_shop"
            X.1Am r1 = X.1Al.A01(r9)
            X.1An r0 = X.1An.A2s
            X.0xa r1 = r1.A03(r0)
            java.lang.Object r0 = r2.A01
            com.instagram.user.model.Product r0 = (com.instagram.user.model.Product) r0
            com.instagram.user.model.User r0 = r0.A0B
            r5 = 0
            if (r0 == 0) goto L_0x042a
            java.lang.String r6 = X.AnonymousClass3ZA.A00(r0)
        L_0x03e3:
            X.0qQ.A0A(r6)
            if (r0 == 0) goto L_0x03ec
            java.lang.String r5 = X.C13988Tno.A0b(r0)
        L_0x03ec:
            X.0qQ.A0A(r5)
            X.Dba.A0j(r3, r6, r5)
            java.lang.String r4 = "pinned"
            boolean r0 = X.2R8.A00(r9)
            if (r0 == 0) goto L_0x041f
            X.0xY r3 = r1.AR4()
            java.lang.String r2 = "merchant_id"
            r0 = 4691(0x1253, float:6.573E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r1, r8, r4, r2)
            X.0qQ.A07(r0)
            r3.E5g(r0, r6)
            java.lang.String r0 = "merchant_username"
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r1, r8, r4, r0)
            X.0qQ.A07(r0)
            r3.E5g(r0, r5)
            r3.apply()
        L_0x041f:
            android.content.Context r1 = r7.getContext()
            java.lang.String r0 = "Pinned Profile Shop"
        L_0x0425:
            X.C59689JTv.A09(r1, r0)
            goto L_0x0680
        L_0x042a:
            r6 = r5
            goto L_0x03e3
        L_0x042c:
            java.lang.Object r0 = r2.A02
            X.Vss r0 = (X.C18497Vss) r0
            X.Uqy r1 = r0.A03
            java.lang.Object r0 = r2.A01
            X.WSU r0 = (X.WSU) r0
            java.lang.String r5 = r0.A02
            X.0qQ.A07(r5)
            X.X9C r4 = r1.A03
            X.W2j r3 = X.W2j.A00(r4)
            java.util.Map r2 = r3.A0C
            java.lang.Object r1 = r2.get(r5)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            r0 = r0 ^ 1
            X.JTP.A1R(r5, r2, r0)
            X.C18588Vuf.A00(r4, r3)
            goto L_0x0680
        L_0x0457:
            java.lang.Object r0 = r2.A02
            X.Vss r0 = (X.C18497Vss) r0
            X.Uqy r5 = r0.A03
            java.lang.Object r4 = r2.A01
            com.instagram.user.model.Product r4 = (com.instagram.user.model.Product) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.X9C r1 = r5.A03
            X.X9L r0 = r1.BTa()
            com.instagram.user.model.Product r0 = r0.Bft()
            com.instagram.user.model.User r0 = r0.A0B
            if (r0 == 0) goto L_0x0680
            java.lang.String r3 = X.AnonymousClass3ZA.A00(r0)
            if (r3 == 0) goto L_0x0680
            X.2qw r2 = r5.A02
            X.1Xj r0 = r1.Bxm()
            r1.Bz5()
            X.Vui r1 = new X.Vui
            r1.<init>(r0, r2, r4, r3)
            r0 = 672(0x2a0, float:9.42E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r1.A08 = r0
            r1.A00()
            goto L_0x0680
        L_0x0494:
            java.lang.Object r0 = r2.A02
            X.Vss r0 = (X.C18497Vss) r0
            X.Uqy r0 = r0.A03
            java.lang.Object r5 = r2.A01
            com.instagram.user.model.Product r5 = (com.instagram.user.model.Product) r5
            r2 = 0
            X.0qQ.A0B(r5, r2)
            X.W1i r4 = r0.A01
            X.X9C r0 = r0.A03
            X.1Xj r3 = r0.Bxm()
            java.lang.String r6 = "product"
            X.37E r1 = X.AnonymousClass37D.A00
            X.4DH r0 = r4.A07
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            X.37D r7 = r1.A01(r0)
            boolean r0 = X.C18782W1i.A02(r4)
            if (r0 == 0) goto L_0x0501
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            r8.putParcelable(r6, r5)
            X.4DU r0 = r4.A09
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "prior_module_name"
            r8.putString(r0, r1)
            r0 = 4
            java.lang.String r1 = X.C66579MXk.A00(r0)
            r0 = 4713(0x1269, float:6.604E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.putString(r1, r0)
            com.instagram.common.session.UserSession r9 = r4.A08
            java.lang.Class<com.instagram.modal.TransparentBackgroundModalActivity> r10 = com.instagram.modal.TransparentBackgroundModalActivity.class
            androidx.fragment.app.FragmentActivity r7 = r4.A05
            java.lang.String r11 = "bottom_sheet"
            X.6W8 r6 = new X.6W8
            r6.<init>(r7, r8, r9, r10, r11)
            r6.A09(r2)
            android.content.Context r0 = r7.getApplicationContext()
            r6.A0C(r0)
        L_0x04f6:
            X.4DU r2 = r4.A09
            com.instagram.common.session.UserSession r1 = r4.A08
            java.lang.String r0 = r4.A0G
            X.W3r.A04(r2, r1, r3, r5, r0)
            goto L_0x0680
        L_0x0501:
            if (r7 == 0) goto L_0x04f6
            com.instagram.common.session.UserSession r6 = r4.A08
            X.4DU r0 = r4.A09
            java.lang.String r1 = r0.getModuleName()
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.2FW r0 = X.2FW.A1Y
            X.F3w r2 = new X.F3w
            r2.<init>(r6, r0, r1)
            android.os.Bundle r1 = r2.A07
            r0 = 19
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r1.putParcelable(r0, r5)
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r0 = r2.A00()
            r7.A0J(r0)
            goto L_0x04f6
        L_0x0529:
            java.lang.Object r0 = r2.A02
            X.Vss r0 = (X.C18497Vss) r0
            X.Uqy r1 = r0.A03
            java.lang.Object r2 = r2.A01
            com.instagram.user.model.Product r2 = (com.instagram.user.model.Product) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.W1i r1 = r1.A01
            com.instagram.common.session.UserSession r7 = r1.A08
            androidx.fragment.app.FragmentActivity r0 = r1.A05
            java.lang.String r9 = r2.A0H
            java.lang.String r8 = X.C13989Tnp.A0q(r2)
            java.lang.String r6 = r1.A0J
            java.lang.String r5 = r1.A0E
            java.lang.String r4 = "pdp"
            java.lang.String r3 = "ratings_summary"
            X.AnonymousClass7TG.A1O(r0, r9)
            X.6Yo r2 = X.DbU.A0Q(r0, r7)
            X.3kF r0 = X.C249713kF.A00
            r0.A0T()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r0 = "product_id"
            r1.put(r0, r9)
            java.lang.String r0 = "merchant_igid"
            r1.put(r0, r8)
            java.lang.String r0 = "prior_module"
            r1.put(r0, r4)
            java.lang.String r0 = "prior_submodule"
            r1.put(r0, r3)
            r0 = 44
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.put(r0, r5)
            java.lang.String r0 = "shopping_session_id"
            r1.put(r0, r6)
            java.lang.String r0 = "com.bloks.www.bk.commerce.ratings_and_reviews.all_reviews"
            X.3M3 r0 = X.C46649DiU.A02(r7, r0, r1)
            r2.A0D(r0)
            java.lang.String r0 = "1"
            r2.A0A = r0
            r2.A04()
            goto L_0x0680
        L_0x0590:
            java.lang.Object r0 = r2.A02
            X.VPG r0 = (X.VPG) r0
            X.Ur0 r3 = r0.A00
            java.lang.Object r0 = r2.A01
            X.UrP r0 = (X.C16262UrP) r0
            java.lang.String r2 = r0.A02
            X.0qQ.A07(r2)
            java.lang.Integer r1 = r0.A00
            if (r1 == 0) goto L_0x05a9
            r0 = 0
            r3.D1c(r1, r2, r0)
            goto L_0x0680
        L_0x05a9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x05ae:
            java.lang.Object r0 = r2.A02
            X.VPH r0 = (X.VPH) r0
            X.Uqz r6 = r0.A00
            java.lang.Object r0 = r2.A01
            X.UrS r0 = (X.C16265UrS) r0
            java.lang.String r8 = r0.A02
            X.0qQ.A07(r8)
            X.N8v r7 = r0.A01
            X.N3n r5 = r0.A00
            if (r5 == 0) goto L_0x05ee
            android.content.Context r0 = r6.A00
            X.8ab r1 = new X.8ab
            r1.<init>((android.content.Context) r0)
            java.lang.String r0 = r5.A05
            r1.A05 = r0
            java.lang.String r0 = r5.A04
            r1.A0q(r0)
            java.lang.String r0 = r5.A02
            r9 = 4
            X.Of9 r4 = new X.Of9
            r4.<init>(r5, r6, r7, r8, r9)
            r1.A0c(r4, r0)
            java.lang.String r0 = r5.A03
            r9 = 5
            X.Of9 r4 = new X.Of9
            r4.<init>(r5, r6, r7, r8, r9)
            r1.A0a(r4, r0)
            X.DbT.A1V(r1)
            goto L_0x0680
        L_0x05ee:
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r10 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.APPROVED
            goto L_0x0604
        L_0x05f1:
            java.lang.Object r0 = r2.A02
            X.VPH r0 = (X.VPH) r0
            X.Uqz r6 = r0.A00
            java.lang.Object r0 = r2.A01
            X.UrS r0 = (X.C16265UrS) r0
            java.lang.String r8 = r0.A02
            X.0qQ.A07(r8)
            X.N8v r7 = r0.A01
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r10 = com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus.DECLINED
        L_0x0604:
            X.X9C r5 = r6.A04
            X.W2j r4 = X.W2j.A00(r5)
            X.Vuf r0 = r5.Bz5()
            X.VYe r0 = r0.A03
            X.0qQ.A07(r0)
            java.lang.String r3 = r0.A03
            com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus r2 = r0.A01
            X.Uxz r1 = X.C16605Uxz.LOADING
            X.VYe r0 = new X.VYe
            r0.<init>(r2, r10, r1, r3)
            r4.A03 = r0
            X.C18588Vuf.A00(r5, r4)
            X.Vjx r0 = r6.A02
            r14 = 45
            X.PqV r9 = new X.PqV
            r11 = r6
            r12 = r7
            r13 = r8
            r9.<init>((java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (java.lang.String) r13, (int) r14)
            r16 = 16
            X.IoE r11 = new X.IoE
            r12 = r10
            r13 = r6
            r14 = r7
            r15 = r8
            r11.<init>(r12, r13, r14, r15, r16)
            X.4DH r2 = r0.A00
            com.instagram.common.session.UserSession r1 = r0.A01
            java.lang.Long r0 = r7.A02
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.1OC r0 = X.C17059VGh.A00(r1, r10, r0, r11, r9)
            r2.schedule(r0)
            goto L_0x0680
        L_0x064c:
            java.lang.Object r0 = r2.A02
            X.VPH r0 = (X.VPH) r0
            X.Uqz r1 = r0.A00
            java.lang.Object r0 = r2.A01
            X.UrS r0 = (X.C16265UrS) r0
            java.lang.String r4 = r0.A05
            X.W1i r0 = r1.A01
            androidx.fragment.app.FragmentActivity r3 = r0.A05
            com.instagram.common.session.UserSession r2 = r0.A08
            X.2EG r1 = X.2EG.A2v
            X.4DU r0 = r0.A09
            java.lang.String r0 = r0.getModuleName()
            X.FH7.A08(r3, r2, r1, r4, r0)
            goto L_0x0680
        L_0x066a:
            java.lang.Object r0 = r2.A02
            X.VsD r0 = (X.C18464VsD) r0
            X.XCC r1 = r0.A01
            java.lang.Object r0 = r2.A01
            X.Urd r0 = (X.C16276Urd) r0
            com.instagram.model.shopping.ProductArEffectMetadata r0 = r0.A01
            r1.DIw(r0)
            goto L_0x0680
        L_0x067a:
            java.lang.Object r1 = r2.A01
            r0 = 0
            X.0qQ.A0B(r1, r0)
        L_0x0680:
            X.0gF r3 = X.C60340gF.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20613Wvu.invoke():java.lang.Object");
    }
}

package X;

/* renamed from: X.Fwa  reason: case insensitive filesystem */
public final class C51586Fwa implements AnonymousClass0eL, C62320sa {
    public final int A00;
    public final Object A01;

    public C51586Fwa(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ba, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bb, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01c6, code lost:
        if (r0 == null) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c8, code lost:
        r0.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01cd, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x0014;
                case 1: goto L_0x0022;
                case 2: goto L_0x002b;
                case 3: goto L_0x0034;
                case 4: goto L_0x003e;
                case 5: goto L_0x005d;
                case 6: goto L_0x007b;
                case 7: goto L_0x0099;
                case 8: goto L_0x00a8;
                case 9: goto L_0x00bd;
                case 10: goto L_0x00cf;
                case 11: goto L_0x011d;
                case 12: goto L_0x0131;
                case 13: goto L_0x0139;
                case 14: goto L_0x014d;
                case 15: goto L_0x0198;
                case 16: goto L_0x01c0;
                case 17: goto L_0x01ce;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r13.A01
            X.0lg r1 = (X.0lg) r1
            X.FAH r0 = new X.FAH
            r0.<init>()
            X.FYq r3 = new X.FYq
            r3.<init>(r1, r0)
            return r3
        L_0x0014:
            java.lang.Object r0 = r13.A01
            androidx.fragment.app.FragmentActivity r2 = X.DbZ.A0E(r0)
            java.lang.String r1 = "On appear triggered!"
            r0 = 0
            r3 = 0
            X.C59689JTv.A03(r2, r1, r3, r0)
            return r3
        L_0x0022:
            java.lang.Object r0 = r13.A01
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r0 = (com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment) r0
            r0.DU3()
            goto L_0x01cb
        L_0x002b:
            java.lang.Object r0 = r13.A01
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r0 = (com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment) r0
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment.A0H(r0)
            goto L_0x01cb
        L_0x0034:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.FYp r3 = new X.FYp
            r3.<init>(r0)
            return r3
        L_0x003e:
            java.lang.Object r0 = r13.A01
            X.E6S r0 = (X.E6S) r0
            com.instagram.common.session.UserSession r1 = r0.A02
            boolean r0 = X.C46400DeN.A04
            if (r1 == 0) goto L_0x005b
            X.02m r2 = X.02m.A0p
            X.0qQ.A07(r2)
            r1 = 857814227(0x332134d3, float:3.7533777E-8)
            r0 = 0
            boolean r0 = r2.isMarkerOn(r1, r0)
            if (r0 == 0) goto L_0x005b
            r0 = 2
            r2.markerEnd(r1, r0)
        L_0x005b:
            r3 = 0
            return r3
        L_0x005d:
            java.lang.Object r0 = r13.A01
            X.Dib r0 = (X.C46656Dib) r0
            X.DdZ r1 = r0.A0h
            if (r1 == 0) goto L_0x00bb
            com.instagram.common.session.UserSession r0 = r0.A0V
            java.lang.String r3 = r0.A06
            r2 = 0
            X.JVC r0 = r1.A0A
            X.26t r0 = r0.A00
            X.0xa r1 = r0.A00
            java.lang.String r0 = "KEY_HAS_SEEN_COIN_FLIP_NUX_BOTTOM_SHEET"
            java.lang.String r0 = X.002.A0R(r0, r3)
            boolean r0 = r1.getBoolean(r0, r2)
            goto L_0x00b6
        L_0x007b:
            java.lang.Object r0 = r13.A01
            X.Dib r0 = (X.C46656Dib) r0
            X.DdZ r1 = r0.A0h
            if (r1 == 0) goto L_0x01cb
            com.instagram.common.session.UserSession r0 = r0.A0V
            java.lang.String r3 = r0.A06
            X.JVC r0 = r1.A0A
            r2 = 1
            X.26t r0 = r0.A00
            X.0xa r0 = r0.A00
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "KEY_HAS_SEEN_COIN_FLIP_NUX_BOTTOM_SHEET"
            X.DbX.A1T(r1, r0, r3, r2)
            goto L_0x01cb
        L_0x0099:
            java.lang.Object r0 = r13.A01
            X.Dib r0 = (X.C46656Dib) r0
            com.instagram.common.session.UserSession r1 = r0.A0V
            r0 = 1
            X.0qQ.A0B(r1, r0)
            boolean r0 = X.DcE.A06(r1, r0)
            goto L_0x00b6
        L_0x00a8:
            java.lang.Object r0 = r13.A01
            X.Dib r0 = (X.C46656Dib) r0
            X.DdZ r0 = r0.A0h
            if (r0 == 0) goto L_0x00bb
            X.6o5 r0 = r0.A04
            boolean r0 = r0.A05()
        L_0x00b6:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x00bb:
            r0 = 0
            goto L_0x00b6
        L_0x00bd:
            java.lang.Object r0 = r13.A01
            X.Dib r0 = (X.C46656Dib) r0
            X.DdZ r2 = r0.A0h
            if (r2 == 0) goto L_0x01cb
            r1 = 0
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            r2.A02(r1, r0)
            goto L_0x01cb
        L_0x00cf:
            java.lang.Object r3 = r13.A01
            X.Dib r3 = (X.C46656Dib) r3
            com.instagram.avatars.coinflip.AvatarCoinFlipConfig r0 = r3.A0R
            if (r0 == 0) goto L_0x01cb
            X.6po r0 = r3.A0l
            if (r0 == 0) goto L_0x01cb
            com.instagram.common.session.UserSession r0 = r0.A09
            boolean r0 = X.DcE.A04(r0)
            if (r0 == 0) goto L_0x01cb
            X.C46447Df9.A03()
            com.instagram.avatars.coinflip.AvatarCoinFlipConfig r2 = r3.A0R
            com.instagram.avatars.coinflip.AvatarCoinFlipSticker r1 = r2.A05
            java.lang.String r5 = r1.A03
            com.instagram.avatars.coinflip.AvatarCoinFlipSticker r0 = r2.A06
            java.lang.String r6 = r0.A03
            float r9 = r1.A00
            com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse r4 = r2.A04
            java.lang.String r7 = r2.A07
            boolean r11 = r2.A03
            boolean r12 = r2.A02
            java.lang.String r8 = "ig_edit_profile"
            r10 = 0
            X.AnonymousClass7TF.A1H(r5, r6)
            X.E3r r0 = X.C48372EdT.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r5 = "avatar_coin_flip_customization"
            android.os.Bundle r4 = r0.mArguments
            if (r4 == 0) goto L_0x01cb
            com.instagram.common.session.UserSession r2 = r3.A0V
            java.lang.Class<com.instagram.modal.ModalActivity> r1 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            X.6W8 r1 = X.DbV.A0Y(r0, r4, r2, r1, r5)
            r0 = 1111(0x457, float:1.557E-42)
            r1.A0D(r3, r0)
            goto L_0x01cb
        L_0x011d:
            java.lang.Object r3 = r13.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            r1 = 12
            X.Fwa r0 = new X.Fwa
            r0.<init>(r3, r1)
            X.C48374EdV.A00(r2, r0)
            goto L_0x01cb
        L_0x0131:
            java.lang.Object r0 = r13.A01
            X.Dib r0 = (X.C46656Dib) r0
            X.DdZ r0 = r0.A0h
            goto L_0x01c6
        L_0x0139:
            java.lang.Object r0 = r13.A01
            X.Dib r0 = (X.C46656Dib) r0
            X.DdZ r0 = r0.A0h
            if (r0 == 0) goto L_0x01cb
            X.05G r2 = r0.A0E
            r1 = 1
            X.6pv r0 = new X.6pv
            r0.<init>(r1)
            r2.Epw(r0)
            goto L_0x01cb
        L_0x014d:
            java.lang.Object r4 = r13.A01
            X.Dib r4 = (X.C46656Dib) r4
            com.instagram.common.session.UserSession r0 = r4.A0V
            X.73C r3 = X.AnonymousClass73B.A00(r0)
            if (r3 == 0) goto L_0x016d
            com.instagram.avatars.coinflip.ProfileCoinFlipView r0 = r4.A0S
            if (r0 == 0) goto L_0x0194
            com.instagram.avatars.coinflip.AvatarCoinFlipConfig r2 = r4.A0R
            if (r2 == 0) goto L_0x0194
            X.6tJ r1 = r0.A01
            X.6tJ r0 = X.C320946tJ.PROFILE_PICTURE
            if (r1 != r0) goto L_0x0194
            r1 = 0
            java.lang.String r0 = "edit_profile"
            r3.A02(r2, r0, r1)
        L_0x016d:
            X.DdZ r3 = r4.A0h
            if (r3 == 0) goto L_0x01cb
            X.0kM r0 = r3.A08
            X.0wc r1 = r0.A00()
            r0 = 618(0x26a, float:8.66E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "ig_edit_profile"
            X.DbS.A1N(r2, r0)
            com.instagram.common.session.UserSession r0 = r3.A09
            java.lang.String r1 = r0.A06
            java.lang.String r0 = "target_user_id"
            java.util.Map r0 = X.AnonymousClass7TF.A0w(r0, r1)
            X.DbV.A1L(r2, r0)
            goto L_0x01cb
        L_0x0194:
            r3.A00()
            goto L_0x016d
        L_0x0198:
            java.lang.Object r3 = r13.A01
            X.Dib r3 = (X.C46656Dib) r3
            boolean r0 = r3.A0y
            if (r0 == 0) goto L_0x01aa
            r0 = 145(0x91, float:2.03E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.C46656Dib.A0K(r3, r0)
            goto L_0x01cb
        L_0x01aa:
            com.instagram.avatars.coinflip.ProfileCoinFlipView r0 = r3.A0S
            if (r0 == 0) goto L_0x01cb
            X.6po r2 = r3.A0l
            if (r2 == 0) goto L_0x01cb
            X.6tJ r1 = r0.A01
            X.6tJ r0 = X.C320946tJ.PROFILE_PICTURE
            if (r1 != r0) goto L_0x01bc
            X.C46656Dib.A0G(r3)
            goto L_0x01cb
        L_0x01bc:
            r2.A03()
            goto L_0x01cb
        L_0x01c0:
            java.lang.Object r0 = r13.A01
            com.instagram.profile.fragment.UserDetailFragment r0 = (com.instagram.profile.fragment.UserDetailFragment) r0
            X.DdZ r0 = r0.A0k
        L_0x01c6:
            if (r0 == 0) goto L_0x01cb
            r0.A01()
        L_0x01cb:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x01ce:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Ddd r3 = new X.Ddd
            r3.<init>(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51586Fwa.invoke():java.lang.Object");
    }
}

package X;

import android.view.View;

public final class ID2 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ID2(GVX gvx, GVT gvt, int i) {
        this.A00 = i;
        switch (i) {
            case 63:
            case 64:
            case 66:
            case 67:
            case 69:
            case 70:
                this.A02 = gvt;
                this.A01 = gvx;
                break;
            default:
                this.A01 = gvx;
                this.A02 = gvt;
                break;
        }
    }

    public static void A02(View view, int i, Object obj, Object obj2) {
        AnonymousClass0fU.A00(new ID2(i, obj, obj2), view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0650, code lost:
        X.0qQ.A0F(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0657, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        X.AnonymousClass0fD.A0C(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0276, code lost:
        r3 = "audioPageViewModel";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r20) {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.A00
            r4 = r20
            switch(r1) {
                case 0: goto L_0x0638;
                case 1: goto L_0x0609;
                case 2: goto L_0x058d;
                case 3: goto L_0x0b10;
                case 4: goto L_0x0b04;
                case 5: goto L_0x0af8;
                case 6: goto L_0x0aec;
                case 7: goto L_0x0ae0;
                case 8: goto L_0x0ad4;
                case 9: goto L_0x0ac8;
                case 10: goto L_0x0abc;
                case 11: goto L_0x053f;
                case 12: goto L_0x0aa3;
                case 13: goto L_0x04fa;
                case 14: goto L_0x0a88;
                case 15: goto L_0x0a2d;
                case 16: goto L_0x049b;
                case 17: goto L_0x0a16;
                case 18: goto L_0x09ff;
                case 19: goto L_0x043a;
                case 20: goto L_0x09cf;
                case 21: goto L_0x09b4;
                case 22: goto L_0x0997;
                case 23: goto L_0x0980;
                case 24: goto L_0x03d9;
                case 25: goto L_0x0969;
                case 26: goto L_0x0950;
                case 27: goto L_0x0939;
                case 28: goto L_0x091e;
                case 29: goto L_0x0903;
                case 30: goto L_0x08ec;
                case 31: goto L_0x08d5;
                case 32: goto L_0x08ba;
                case 33: goto L_0x089f;
                case 34: goto L_0x0888;
                case 35: goto L_0x0870;
                case 36: goto L_0x0859;
                case 37: goto L_0x083f;
                case 38: goto L_0x03af;
                case 39: goto L_0x0821;
                case 40: goto L_0x0364;
                case 41: goto L_0x033f;
                case 42: goto L_0x0310;
                case 43: goto L_0x0808;
                case 44: goto L_0x07ef;
                case 45: goto L_0x07ae;
                case 46: goto L_0x02ce;
                case 47: goto L_0x0795;
                case 48: goto L_0x077c;
                case 49: goto L_0x0763;
                case 50: goto L_0x074a;
                case 51: goto L_0x072e;
                case 52: goto L_0x0717;
                case 53: goto L_0x070b;
                case 54: goto L_0x06ff;
                case 55: goto L_0x06e8;
                case 56: goto L_0x06d1;
                case 57: goto L_0x06c5;
                case 58: goto L_0x06b9;
                case 59: goto L_0x06a2;
                case 60: goto L_0x067e;
                case 61: goto L_0x0660;
                case 62: goto L_0x027a;
                case 63: goto L_0x024b;
                case 64: goto L_0x01fe;
                case 65: goto L_0x0193;
                case 66: goto L_0x0141;
                case 67: goto L_0x0100;
                case 68: goto L_0x002a;
                case 69: goto L_0x00e1;
                default: goto L_0x0009;
            }
        L_0x0009:
            r1 = -1769218310(0xffffffff968bdefa, float:-2.259738E-25)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.GVT r2 = (X.GVT) r2
            X.Ghc r3 = r2.A0J
            if (r3 == 0) goto L_0x0276
            java.lang.Object r0 = r0.A01
            X.GVX r0 = (X.GVX) r0
            java.lang.String r2 = r0.A04
            X.46i r0 = r0.A01
            r3.A04(r0, r2)
            r0 = -1309539991(0xffffffffb1f20169, float:-7.0432873E-9)
        L_0x0026:
            X.AnonymousClass0fD.A0C(r0, r1)
            return
        L_0x002a:
            r1 = -1992807681(0xffffffff89382aff, float:-2.2168411E-33)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r9 = r0.A02
            X.GVT r9 = (X.GVT) r9
            X.H2l r3 = r9.A04
            r11 = 0
            if (r3 != 0) goto L_0x003e
            java.lang.String r3 = "clipsAudioPagePerfLogger"
            goto L_0x0650
        L_0x003e:
            java.lang.String r2 = "more_actions"
            X.C54191H2l.A01(r3, r2)
            X.Ghc r2 = r9.A0J
            if (r2 == 0) goto L_0x0276
            X.GVW r2 = X.C53044Ghc.A00(r2)
            if (r2 == 0) goto L_0x007f
            X.46i r5 = r2.A03
        L_0x004f:
            X.0eM r8 = r9.A0o
            X.0lg r4 = X.DbT.A0X(r8)
            long r2 = r9.A00
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = r9.A0S
            if (r5 == 0) goto L_0x007d
            com.instagram.music.common.model.AudioType r2 = r5.Adv()
        L_0x0063:
            X.HOL r10 = X.C55059HbU.A00(r2)
            if (r5 == 0) goto L_0x007b
            com.instagram.api.schemas.OriginalAudioSubtype r2 = r5.Ads()
            if (r2 == 0) goto L_0x007b
            java.lang.String r7 = X.C55060HbV.A00(r2)
        L_0x0073:
            X.6sU r6 = r9.A07
            if (r6 != 0) goto L_0x0081
            java.lang.String r3 = "pivotPageSessionProvider"
            goto L_0x0650
        L_0x007b:
            r7 = r11
            goto L_0x0073
        L_0x007d:
            r2 = r11
            goto L_0x0063
        L_0x007f:
            r5 = r11
            goto L_0x004f
        L_0x0081:
            r5 = 1
            X.0qQ.A0B(r4, r5)
            if (r13 == 0) goto L_0x00c2
            java.lang.Long r12 = X.C51972G9s.A0j(r3)
            X.0wc r3 = X.AnonymousClass0kN.A01(r9, r4)
            java.lang.String r2 = "instagram_organic_audio_more_button_tapped"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r3, r2)
            java.lang.String r2 = "audio_page"
            X.C51965G9l.A1M(r4, r2)
            X.C51965G9l.A1F(r4, r13)
            java.lang.String r3 = X.AnonymousClass7TF.A0b()
            java.lang.String r2 = "media_tap_token"
            X.C51973G9u.A14(r4, r2, r3)
            if (r12 == 0) goto L_0x00ad
            X.4Ny r11 = new X.4Ny
            r11.<init>(r12)
        L_0x00ad:
            java.lang.String r2 = "audio_owner_id"
            r4.AAE(r11, r2)
            java.lang.String r2 = "audio_type"
            r4.A8M(r10, r2)
            java.lang.String r2 = "audio_sub_type"
            r4.AAJ(r2, r7)
            X.C51973G9u.A11(r4, r6)
            r4.Cgf()
        L_0x00c2:
            X.7Pu r3 = r9.A08
            java.lang.Object r0 = r0.A01
            X.Dg1 r0 = (X.C46498Dg1) r0
            if (r3 == 0) goto L_0x00dd
            X.FFy r2 = new X.FFy
            r2.<init>(r0, r3)
            X.7Pr r0 = X.DbX.A0f(r8)
            r0.A1G = r5
            r2.A06(r0)
        L_0x00d8:
            r0 = 1054825543(0x3edf5c47, float:0.4362509)
            goto L_0x0026
        L_0x00dd:
            X.C49945FFy.A00(r9, r0)
            goto L_0x00d8
        L_0x00e1:
            r1 = -450584302(0xffffffffe524a112, float:-4.858996E22)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.GVT r2 = (X.GVT) r2
            X.Ghc r3 = r2.A0J
            if (r3 == 0) goto L_0x0276
            java.lang.Object r0 = r0.A01
            X.GVX r0 = (X.GVX) r0
            java.lang.String r2 = r0.A04
            X.46i r0 = r0.A01
            r3.A04(r0, r2)
            r0 = -146419041(0xfffffffff745d29f, float:-4.0123218E33)
            goto L_0x0026
        L_0x0100:
            r1 = 773293192(0x2e178488, float:3.4451136E-11)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.GVT r3 = (X.GVT) r3
            X.Ghc r4 = r3.A0J
            r5 = 0
            if (r4 == 0) goto L_0x0276
            java.lang.Object r0 = r0.A01
            X.GVX r0 = (X.GVX) r0
            java.lang.String r7 = r0.A04
            X.46i r2 = r0.A01
            if (r2 == 0) goto L_0x013e
            android.content.Context r0 = r3.requireContext()
            java.lang.String r8 = r2.ACv(r0)
            java.lang.String r6 = r2.AcV()
            com.instagram.user.model.User r5 = r2.AdS()
        L_0x012a:
            X.6oS r0 = X.C51975G9x.A0R(r4, r7)
            r9 = 0
            r10 = 8
            X.MGp r3 = new X.MGp
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            X.AnonymousClass7TE.A1Z(r3, r0)
            r0 = 1049744464(0x3e91d450, float:0.28482294)
            goto L_0x0026
        L_0x013e:
            r8 = r5
            r6 = r5
            goto L_0x012a
        L_0x0141:
            r1 = -1273190888(0xffffffffb41ca618, float:-1.4589057E-7)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A02
            X.GVT r6 = (X.GVT) r6
            X.0eM r2 = r6.A0o
            X.0lg r5 = X.DbT.A0X(r2)
            long r2 = r6.A00
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            r2 = 1
            X.0qQ.A0B(r5, r2)
            if (r4 == 0) goto L_0x0176
            X.0wc r3 = X.AnonymousClass0kN.A01(r6, r5)
            java.lang.String r2 = "instagram_organic_audio_copy_link_tap"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r3, r2)
            java.lang.String r2 = "audio_page"
            X.C51965G9l.A1M(r3, r2)
            X.C51965G9l.A1F(r3, r4)
            X.G9t.A1G(r3)
            X.AnonymousClass7TH.A0V(r3)
        L_0x0176:
            X.Ghc r6 = r6.A0J
            if (r6 == 0) goto L_0x0276
            java.lang.Object r0 = r0.A01
            X.GVX r0 = (X.GVX) r0
            java.lang.String r5 = r0.A04
            X.6oS r4 = X.C51975G9x.A0R(r6, r5)
            r3 = 0
            r2 = 3
            X.IlT r0 = new X.IlT
            r0.<init>(r6, r5, r3, r2)
            X.AnonymousClass7TE.A1Z(r0, r4)
            r0 = -203665945(0xfffffffff3dc4de7, float:-3.490861E31)
            goto L_0x0026
        L_0x0193:
            r1 = 2009775267(0x77cabca3, float:8.223984E33)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.GVX r2 = (X.GVX) r2
            java.lang.String r2 = r2.A05
            if (r2 == 0) goto L_0x01f9
            java.lang.Object r5 = r0.A02
            X.GVT r5 = (X.GVT) r5
            X.Ghc r6 = r5.A0J
            if (r6 == 0) goto L_0x0276
            java.lang.String r2 = X.C51965G9l.A0u(r2)
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.Hoz r0 = r6.A0C
            X.Hjb r0 = r0.A06
            com.instagram.common.session.UserSession r0 = r0.A00
            X.1NY r3 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r0 = "clips/restore_original_audio_attribution/"
            r3.A0A(r0)
            java.lang.String r0 = "clips_media_id"
            r3.A9m(r0, r2)
            java.lang.Class<X.Gye> r2 = X.C54055Gye.class
            java.lang.Class<X.HvG> r0 = X.C56249HvG.class
            X.1OC r3 = X.DbU.A0S(r3, r2, r0)
            r2 = 1129372021(0x4350d975, float:208.84944)
            r0 = 3
            X.032 r2 = r3.A04(r2, r0)
            r4 = 0
            r0 = 30
            X.ImP r0 = X.C58103ImP.A01(r6, r4, r0)
            X.7zl r3 = X.C349197zk.A00(r0, r2)
            r2 = 15
            X.ImL r0 = new X.ImL
            r0.<init>(r6, r4, r2)
            X.7qX r2 = new X.7qX
            r2.<init>(r0, r3)
            X.6oS r0 = X.C318116oQ.A00(r6)
            X.AnonymousClass11O.A03(r0, r2)
            X.0eM r0 = r5.A0o
            r0.getValue()
        L_0x01f9:
            r0 = 1007511592(0x3c0d6828, float:0.00863079)
            goto L_0x0026
        L_0x01fe:
            r1 = 2095371213(0x7ce4d3cd, float:9.505116E36)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            X.GVT r5 = (X.GVT) r5
            X.0eM r2 = r5.A0o
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r2)
            long r2 = r5.A00
            java.lang.Long r3 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = r5.A0X
            X.C63991LHj.A01(r5, r4, r3, r2)
            X.Ghc r3 = r5.A0J
            r6 = 0
            if (r3 == 0) goto L_0x0276
            java.lang.Object r0 = r0.A01
            X.GVX r0 = (X.GVX) r0
            java.lang.String r7 = r0.A04
            java.lang.String r4 = r0.A05
            X.46i r2 = r0.A01
            if (r2 == 0) goto L_0x0233
            android.content.Context r0 = r5.requireContext()
            java.lang.String r6 = r2.ACv(r0)
        L_0x0233:
            java.lang.String r5 = r5.A0X
            X.AnonymousClass7TG.A1N(r7, r4)
            X.6oS r0 = X.C318116oQ.A00(r3)
            r8 = 0
            r9 = 2
            X.MEm r2 = new X.MEm
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            X.AnonymousClass7TE.A1Z(r2, r0)
            r0 = -1904668481(0xffffffff8e7910bf, float:-3.0699683E-30)
            goto L_0x0026
        L_0x024b:
            r1 = 1707746680(0x65ca2578, float:1.1932615E23)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.GVT r2 = (X.GVT) r2
            X.Ghc r4 = r2.A0J
            if (r4 == 0) goto L_0x0276
            java.lang.Object r0 = r0.A01
            X.GVX r0 = (X.GVX) r0
            java.lang.String r5 = r0.A06
            com.instagram.user.model.User r3 = r0.A02
            X.6oS r0 = X.C51975G9x.A0R(r4, r5)
            r6 = 0
            r7 = 42
            X.MGk r2 = new X.MGk
            r2.<init>(r3, r4, r5, r6, r7)
            X.AnonymousClass7TE.A1Z(r2, r0)
            r0 = 191292435(0xb66e413, float:4.4467973E-32)
            goto L_0x0026
        L_0x0276:
            java.lang.String r3 = "audioPageViewModel"
            goto L_0x0650
        L_0x027a:
            r1 = -1729591995(0xffffffff98e88545, float:-6.0105162E-24)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A02
            X.H0k r6 = (X.C54140H0k) r6
            X.HOV r5 = r6.A00
            r10 = 0
            if (r5 != 0) goto L_0x028e
            java.lang.String r3 = "entrySurface"
            goto L_0x0650
        L_0x028e:
            X.0eM r2 = r6.A08
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r2)
            X.1Xj r8 = r6.A02
            if (r8 != 0) goto L_0x029c
            java.lang.String r3 = "entryMedia"
            goto L_0x0650
        L_0x029c:
            r2 = 1
            X.0qQ.A0B(r7, r2)
            java.lang.Integer r9 = X.AnonymousClass05K.A0Y
            java.util.LinkedHashMap r11 = X.AnonymousClass7TE.A1H()
            X.C55209Hdz.A00(r5, r6, r7, r8, r9, r10, r11)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r5 = r6.A04
            if (r5 == 0) goto L_0x02c9
            java.lang.Object r4 = r0.A01
            com.instagram.model.reels.Reel r4 = (com.instagram.model.reels.Reel) r4
            X.32A r3 = r6.A03
            if (r3 != 0) goto L_0x02b9
            java.lang.String r3 = "reelViewerLauncher"
            goto L_0x0650
        L_0x02b9:
            androidx.fragment.app.FragmentActivity r2 = r6.requireActivity()
            X.Upq r0 = new X.Upq
            r0.<init>((android.app.Activity) r2, (android.view.View) r5, (X.C230222pE) r10)
            r3.A05 = r0
            X.3BQ r0 = X.AnonymousClass3BQ.WORLD_PAGES
            r3.A08(r4, r0, r5)
        L_0x02c9:
            r0 = -472284044(0xffffffffe3d98474, float:-8.0249754E21)
            goto L_0x0026
        L_0x02ce:
            r1 = 2048917632(0x7a200080, float:2.076944E35)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            X.H27 r5 = (X.H27) r5
            java.lang.String r2 = r5.A0A
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0304
            X.I1p r4 = r5.A07
            java.lang.String r7 = r5.A0A
            X.1Xj r6 = r5.A06
            r6.getClass()
            int r9 = r5.A00
            int r10 = r5.A02
            int r11 = r5.A03
            java.lang.String r8 = r5.A09
            r4.A03(r5, r6, r7, r8, r9, r10, r11)
            com.instagram.common.session.UserSession r2 = r5.getSession()
            X.7kd r4 = X.C340057kd.A00(r2)
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            X.1Xj r2 = r5.A06
            r4.A04(r2, r3)
        L_0x0304:
            java.lang.Object r0 = r0.A01
            X.7Pu r0 = (X.C331157Pu) r0
            r0.A07()
            r0 = 1421524865(0x54babf81, float:6.4166146E12)
            goto L_0x0026
        L_0x0310:
            r1 = -1560605526(0xffffffffa2fb0caa, float:-6.8047095E-18)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.Gi3 r2 = (X.C53070Gi3) r2
            X.H14 r4 = r2.A00
            java.lang.Object r0 = r0.A01
            com.instagram.save.model.SavedCollection r0 = (com.instagram.save.model.SavedCollection) r0
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r2 = r0.A0F
            java.lang.String r0 = "SaveFragment.ARGUMENT_SELECTED_COLLECTION_ID"
            r3.putExtra(r0, r2)
            androidx.fragment.app.FragmentActivity r2 = r4.getActivity()
            if (r2 == 0) goto L_0x0337
            r0 = -1
            r2.setResult(r0, r3)
        L_0x0337:
            X.DbX.A1J(r4)
            r0 = -875891891(0xffffffffcbcaf34d, float:-2.6601114E7)
            goto L_0x0026
        L_0x033f:
            r1 = 2024236669(0x78a7667d, float:2.716226E34)
            int r1 = X.AnonymousClass0fD.A05(r1)
            long r7 = java.lang.System.currentTimeMillis()
            long r2 = X.HQK.A00
            long r5 = r7 - r2
            r3 = 2000(0x7d0, double:9.88E-321)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x035f
            X.HQK.A00 = r7
            java.lang.Object r2 = r0.A02
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r0 = r0.A01
            r2.invoke(r0)
        L_0x035f:
            r0 = -1891805188(0xffffffff8f3d57fc, float:-9.3353646E-30)
            goto L_0x0026
        L_0x0364:
            r1 = -1097724683(0xffffffffbe920cf5, float:-0.2852551)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.HrI r3 = (X.C56010HrI) r3
            boolean r2 = r3.A00
            if (r2 == 0) goto L_0x039c
            java.lang.Object r0 = r0.A01
            X.4Wq r0 = (X.C265874Wq) r0
            int r9 = r3.A02
            X.4Wp r5 = r0.A00
            X.6Yf r2 = r5.A06
            if (r2 == 0) goto L_0x03a1
            float r8 = r2.A0A
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r8 = r8 / r0
            float r0 = r2.A0B
            float r8 = r8 * r0
        L_0x0387:
            X.4Wm r2 = r5.A05
            if (r2 == 0) goto L_0x03ab
            X.4jy r4 = r5.A00()
            java.lang.String r6 = r5.A08
            if (r6 == 0) goto L_0x03a7
            java.lang.String r7 = r5.A07
            if (r7 == 0) goto L_0x03a3
            X.3kD r3 = r5.A03
            r2.DY4(r3, r4, r5, r6, r7, r8, r9)
        L_0x039c:
            r0 = -1874968847(0xffffffff903e3ef1, float:-3.751938E-29)
            goto L_0x0026
        L_0x03a1:
            r8 = 0
            goto L_0x0387
        L_0x03a3:
            java.lang.String r3 = "mediaDeliveryClassString"
            goto L_0x0650
        L_0x03a7:
            java.lang.String r3 = "mediaId"
            goto L_0x0650
        L_0x03ab:
            java.lang.String r3 = "delegate"
            goto L_0x0650
        L_0x03af:
            r1 = -1256810421(0xffffffffb516984b, float:-5.610097E-7)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A01
            android.widget.EditText r4 = (android.widget.EditText) r4
            java.lang.String r2 = X.AnonymousClass7TF.A0f(r4)
            java.util.List r3 = X.I3s.A00(r2)
            java.lang.Object r2 = r0.A02
            X.Gzk r2 = (X.C54115Gzk) r2
            java.util.Set r0 = r2.A03
            r0.addAll(r3)
            X.0nA.A0N(r4)
            r0 = 1
            r2.A01 = r0
            X.DbZ.A17(r2)
            r0 = 830937349(0x31871905, float:3.9318615E-9)
            goto L_0x0026
        L_0x03d9:
            r1 = -86767600(0xfffffffffad40810, float:-5.5046523E35)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            android.view.View r2 = (android.view.View) r2
            android.content.Context r2 = r2.getContext()
            if (r2 == 0) goto L_0x0435
            java.lang.Object r2 = r0.A02
            X.H1w r2 = (X.C54176H1w) r2
            X.0eM r0 = r2.A0D
            X.GhV r5 = X.G9w.A0Z(r0)
            X.LRh r3 = r2.A00
            X.05G r0 = r5.A04
            java.lang.Object r0 = r0.getValue()
            X.GMQ r0 = (X.GMQ) r0
            java.lang.Object r4 = r0.A06
            java.util.List r4 = (java.util.List) r4
            java.util.LinkedHashMap r0 = X.C53039GhV.A02(r5)
            r2 = 1
            java.lang.String r8 = X.C53039GhV.A01(r3, r4, r0, r2)
            X.IOh r3 = r5.A02
            r0 = 4
            X.NMG r6 = new X.NMG
            r6.<init>(r0, r4, r5, r2)
            r0 = 0
            java.util.ArrayList r9 = X.AnonymousClass7TF.A0q(r4, r0)
            java.util.Iterator r2 = r4.iterator()
        L_0x041c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x042c
            java.lang.String r0 = X.C51975G9x.A0k(r2)
            if (r0 == 0) goto L_0x041c
            r9.add(r0)
            goto L_0x041c
        L_0x042c:
            X.I0v r4 = r3.A03
            java.lang.String r7 = r3.A04
            com.instagram.api.schemas.SubmittedSubPostManageType r5 = com.instagram.api.schemas.SubmittedSubPostManageType.BULK_ACCEPT
            r4.A01(r5, r6, r7, r8, r9)
        L_0x0435:
            r0 = 2088138191(0x7c7675cf, float:5.118778E36)
            goto L_0x0026
        L_0x043a:
            r1 = 171332805(0xa3654c5, float:8.7789246E-33)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            X.32L r4 = (X.AnonymousClass32L) r4
            com.instagram.common.session.UserSession r2 = r4.getSession()
            X.1se r3 = X.1sd.A00(r2)
            java.lang.Object r7 = r0.A01
            X.1Xj r7 = (X.1Xj) r7
            r2 = 0
            r3.A02(r7, r2)
            X.TpO r0 = r4.A06
            java.lang.String r3 = "grid"
            if (r0 == 0) goto L_0x0650
            X.TsA r0 = r0.A0E
            X.3W1 r8 = r0.BQr(r7)
            r8.A0D(r2)
            com.instagram.common.session.UserSession r6 = r4.getSession()
            java.lang.String r10 = r8.A1H
            java.lang.String r11 = r8.A1G
            java.lang.String r12 = r4.getSessionId()
            X.0jB r0 = r4.E4k()
            X.0xF r5 = r0.A00()
            int r16 = r8.getPosition()
            r13 = 0
            java.lang.String r15 = X.DbT.A0x(r7)
            java.lang.String r9 = "sfplt_in_menu"
            r14 = r13
            r17 = r2
            X.I7O.A05(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.TpO r2 = r4.A06
            if (r2 == 0) goto L_0x0650
            java.lang.String r0 = r7.getId()
            if (r0 == 0) goto L_0x0b3a
            r2.A08(r0)
            r0 = -608324144(0xffffffffdbbdb5d0, float:-1.06797351E17)
            goto L_0x0026
        L_0x049b:
            r1 = -1570147581(0xffffffffa2697303, float:-3.1638275E-18)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.GWp r3 = (X.C52538GWp) r3
            X.0qQ.A0A(r4)
            java.lang.Object r6 = r0.A02
            X.GSn r6 = (X.C52435GSn) r6
            r5 = 0
            X.0qQ.A0B(r4, r5)
            X.GWn r0 = r3.A03
            X.4DU r11 = r3.A04
            com.instagram.common.session.UserSession r0 = r0.A00
            X.3Dp r2 = X.C51967G9n.A0X(r0)
            java.lang.String[] r0 = new java.lang.String[r5]
            r2.A0B(r4, r0)
            com.instagram.common.session.UserSession r9 = r3.A02
            androidx.fragment.app.Fragment r8 = r3.A01
            java.lang.String r2 = r11.getModuleName()
            java.lang.String r0 = "explore_popular"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x04f7
            X.2EG r12 = X.2EG.A1k
        L_0x04d2:
            X.IT2 r10 = new X.IT2
            r10.<init>(r9, r6)
            X.Q03 r7 = new X.Q03
            r7.<init>(r8, r9, r10, r11, r12)
            X.1Xj r0 = r6.BPf()
            r7.A01(r0)
            r7.A09 = r5
            java.lang.String r0 = r3.A05
            r7.A0h = r0
            java.lang.String r0 = r11.getModuleName()
            r7.A0e = r0
            X.C51969G9p.A1L(r7)
            r0 = 1967559278(0x7546926e, float:2.517199E32)
            goto L_0x0026
        L_0x04f7:
            X.2EG r12 = X.2EG.A3I
            goto L_0x04d2
        L_0x04fa:
            r1 = 214509665(0xcc92861, float:3.0993256E-31)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A02
            X.Gzn r6 = (X.C54118Gzn) r6
            X.0eM r2 = r6.A05
            java.lang.Object r4 = r2.getValue()
            X.H2e r4 = (X.C54184H2e) r4
            java.lang.Object r0 = r0.A01
            X.UbM r0 = (X.C15369UbM) r0
            long r2 = r0.A00
            X.05G r5 = r4.A08
        L_0x0515:
            java.lang.Object r4 = r5.getValue()
            r12 = r4
            X.GnP r12 = (X.C53392GnP) r12
            r7 = 0
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
            r18 = 1
            r17 = 8167(0x1fe7, float:1.1444E-41)
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r14 = r7
            r15 = r7
            r16 = r7
            X.GnP r0 = X.C53392GnP.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = r5.AIY(r4, r0)
            if (r0 == 0) goto L_0x0515
            X.DbT.A1J(r6)
            r0 = -1310641424(0xffffffffb1e132f0, float:-6.5541528E-9)
            goto L_0x0026
        L_0x053f:
            r1 = -612574214(0xffffffffdb7cdbfa, float:-7.1173561E16)
            int r1 = X.AnonymousClass0fD.A05(r1)
            X.FBW r5 = X.FBW.A00
            java.lang.Object r4 = r0.A01
            X.F3m r4 = (X.C49723F3m) r4
            java.lang.Object r3 = r0.A02
            X.Gwm r3 = (X.C53942Gwm) r3
            com.instagram.common.session.UserSession r2 = r3.A03
            X.0iw r0 = r3.A02
            r5.A01(r0, r2, r4)
            X.GgO r4 = r3.A01
            X.H3h r0 = r3.A00
            X.F3m r2 = r0.A00
            r3 = 0
            boolean r0 = r2 instanceof X.ER7
            if (r0 == 0) goto L_0x057a
            r0 = r2
            X.ER7 r0 = (X.ER7) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x057a
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x057f
            X.05G r4 = r4.A0O
            X.1Xj r3 = r2.A03
            r0 = 1
            X.9IK r2 = new X.9IK
            r2.<init>((X.1Xj) r3, (int) r0)
        L_0x0577:
            r4.Epw(r2)
        L_0x057a:
            r0 = 361717210(0x158f5dda, float:5.790531E-26)
            goto L_0x0026
        L_0x057f:
            boolean r0 = r2.A05
            if (r0 == 0) goto L_0x057a
            X.05G r4 = r4.A0O
            X.1Xj r0 = r2.A03
            X.9IK r2 = new X.9IK
            r2.<init>((X.1Xj) r0, (int) r3)
            goto L_0x0577
        L_0x058d:
            r1 = 1210820049(0x482ba5d1, float:175767.27)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A02
            X.Gha r6 = (X.C53042Gha) r6
            X.Hja r3 = r6.A01
            if (r3 == 0) goto L_0x05e7
            X.0eM r2 = r6.A04
            java.lang.Object r2 = r2.getValue()
            X.HDY r2 = (X.HDY) r2
            X.Hl4 r7 = r2.A00
            X.IO9 r3 = r3.A00
            com.instagram.common.session.UserSession r5 = r3.A0R
            X.GVT r2 = r3.A0V
            X.6sU r9 = r3.A0Q
            long r3 = r3.A0M
            if (r7 == 0) goto L_0x0607
            X.N49 r8 = r7.A00
        L_0x05b4:
            java.lang.String r7 = "audio_page"
            X.0wc r5 = X.AnonymousClass0kN.A01(r2, r5)
            java.lang.String r2 = "instagram_audio_spotify_account_link_tap"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r5, r2)
            boolean r2 = r5.isSampled()
            if (r2 == 0) goto L_0x05e7
            X.C51973G9u.A12(r5, r7, r3)
            X.C51973G9u.A11(r5, r9)
            java.lang.String r2 = "account_link_entry_point"
            r5.AAJ(r2, r7)
            r3 = 0
            if (r8 == 0) goto L_0x0605
            java.lang.String r4 = r8.A00
        L_0x05d6:
            java.lang.String r2 = "spotify_listen_url"
            r5.AAJ(r2, r4)
            if (r8 == 0) goto L_0x05df
            java.lang.String r3 = r8.A01
        L_0x05df:
            java.lang.String r2 = "spotify_track_id"
            r5.AAJ(r2, r3)
            r5.Cgf()
        L_0x05e7:
            X.0eM r2 = r6.A04
            java.lang.Object r5 = r2.getValue()
            X.3pa r5 = (X.C252733pa) r5
            java.lang.Object r4 = r0.A01
            com.instagram.common.session.UserSession r3 = r6.A03
            X.4Cq r0 = r5.A01
            r6 = 0
            r7 = 18
            X.JZr r2 = new X.JZr
            r2.<init>(r3, r4, r5, r6, r7)
            X.AnonymousClass7TE.A1Z(r2, r0)
            r0 = 674899432(0x283a25e8, float:1.0333294E-14)
            goto L_0x0026
        L_0x0605:
            r4 = r3
            goto L_0x05d6
        L_0x0607:
            r8 = 0
            goto L_0x05b4
        L_0x0609:
            r1 = -701550591(0xffffffffd62f3001, float:-4.8155178E13)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.H3v r2 = (X.C54226H3v) r2
            X.Hht r4 = r2.A05
            java.lang.Object r0 = r0.A01
            X.Hqn r0 = (X.C55982Hqn) r0
            X.EX0 r0 = r0.A00()
            r3 = 0
            int r2 = r0.ordinal()
            r0 = 1
            if (r2 == r0) goto L_0x0632
            if (r2 != r3) goto L_0x0b45
            X.E4h r0 = r4.A00
            X.C47482E4h.A02(r0)
        L_0x062d:
            r0 = -1611603050(0xffffffff9ff0e396, float:-1.0202046E-19)
            goto L_0x0026
        L_0x0632:
            X.E4h r0 = r4.A00
            X.C47482E4h.A03(r0)
            goto L_0x062d
        L_0x0638:
            r1 = -2138823349(0xffffffff8084254b, float:-1.2135664E-38)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            com.instagram.ui.emptystaterow.EmptyStateView r2 = (com.instagram.ui.emptystaterow.EmptyStateView) r2
            r2.A0L()
            java.lang.Object r0 = r0.A02
            com.instagram.adshistory.fragment.RecentAdActivityFragment r0 = (com.instagram.adshistory.fragment.RecentAdActivityFragment) r0
            X.I0m r0 = r0.A01
            if (r0 != 0) goto L_0x0658
            java.lang.String r3 = "adsHistoryDataFetcher"
        L_0x0650:
            X.0qQ.A0F(r3)
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x0658:
            r0.A01()
            r0 = -325871077(0xffffffffec939a1b, float:-1.4275187E27)
            goto L_0x0026
        L_0x0660:
            r1 = 2083837805(0x7c34d76d, float:3.755931E36)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            X.HHA r4 = (X.HHA) r4
            X.H08 r3 = r4.A02
            java.lang.Object r2 = r0.A01
            X.HAX r2 = (X.HAX) r2
            X.XBt r0 = r4.A01
            r0.B9n(r2)
            r3.A03(r2)
            r0 = 1753856958(0x6889bbbe, float:5.2034195E24)
            goto L_0x0026
        L_0x067e:
            r1 = 1577514817(0x5e06f741, float:2.43132835E18)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            X.GUB r4 = (X.GUB) r4
            X.0wc r3 = r4.A00
            java.lang.String r2 = "ig_feed_unified_feedback_disclosure_click"
            X.Dba.A1I(r3, r2)
            X.3YL r2 = r4.A02
            java.lang.Object r0 = r0.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            r2.A01(r0)
            r0 = 1874378975(0x6fb8c0df, float:1.1435682E29)
            goto L_0x0026
        L_0x06a2:
            r1 = -2088115920(0xffffffff8389e130, float:-8.103837E-37)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.GCd r2 = (X.C52031GCd) r2
            java.lang.Object r0 = r0.A01
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            X.C52031GCd.A06(r0, r2)
            r0 = 847417089(0x32828f01, float:1.5199022E-8)
            goto L_0x0026
        L_0x06b9:
            r1 = -216516064(0xfffffffff3183a20, float:-1.206067E31)
            int r1 = A01(r0, r1)
            r0 = 964182628(0x39784264, float:2.3675855E-4)
            goto L_0x0026
        L_0x06c5:
            r1 = -907603908(0xffffffffc9e7103c, float:-1892871.5)
            int r1 = A01(r0, r1)
            r0 = 1726741306(0x66ebfb3a, float:5.571952E23)
            goto L_0x0026
        L_0x06d1:
            r1 = 1761141533(0x68f8e31d, float:9.402691E24)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.GCd r2 = (X.C52031GCd) r2
            java.lang.Object r0 = r0.A01
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            X.C52031GCd.A04(r0, r2)
            r0 = 2019213668(0x785ac164, float:1.7747549E34)
            goto L_0x0026
        L_0x06e8:
            r1 = 812164497(0x3068a591, float:8.463639E-10)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.GCd r2 = (X.C52031GCd) r2
            java.lang.Object r0 = r0.A01
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            X.C52031GCd.A04(r0, r2)
            r0 = 1373986858(0x51e5602a, float:1.2314511E11)
            goto L_0x0026
        L_0x06ff:
            r1 = -2114460811(0xffffffff81f7e375, float:-9.1059855E-38)
            int r1 = A01(r0, r1)
            r0 = -2014170790(0xffffffff87f2315a, float:-3.644112E-34)
            goto L_0x0026
        L_0x070b:
            r1 = -958859448(0xffffffffc6d8f748, float:-27771.64)
            int r1 = A01(r0, r1)
            r0 = -1866674780(0xffffffff90bccda4, float:-7.4469765E-29)
            goto L_0x0026
        L_0x0717:
            r1 = 869642432(0x33d5b0c0, float:9.950736E-8)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.GCd r2 = (X.C52031GCd) r2
            java.lang.Object r0 = r0.A01
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            X.C52031GCd.A04(r0, r2)
            r0 = 671273488(0x2802d210, float:7.262E-15)
            goto L_0x0026
        L_0x072e:
            r1 = -1190760325(0xffffffffb906707b, float:-1.2821138E-4)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.I00 r3 = (X.I00) r3
            java.lang.String r2 = "view_product"
            X.I00.A00(r3, r2)
            java.lang.Object r0 = r0.A02
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r4)
            r0 = -822760962(0xffffffffcef5a9fe, float:-2.06077926E9)
            goto L_0x0026
        L_0x074a:
            r1 = -756257407(0xffffffffd2ec6d81, float:-5.07724726E11)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.JQh r2 = (X.C59613JQh) r2
            java.lang.Object r0 = r0.A02
            X.IOX r0 = (X.IOX) r0
            com.instagram.user.model.User r0 = r0.A00
            r2.DRR(r0)
            r0 = -118348506(0xfffffffff8f22526, float:-3.929029E34)
            goto L_0x0026
        L_0x0763:
            r1 = 1217744597(0x48954ed5, float:305782.66)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.JQh r2 = (X.C59613JQh) r2
            java.lang.Object r0 = r0.A02
            X.IOX r0 = (X.IOX) r0
            com.instagram.user.model.User r0 = r0.A00
            r2.DRP(r0)
            r0 = 926747176(0x373d0a28, float:1.1267643E-5)
            goto L_0x0026
        L_0x077c:
            r1 = -2079116353(0xffffffff841333bf, float:-1.7303528E-36)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.JQh r2 = (X.C59613JQh) r2
            java.lang.Object r0 = r0.A02
            X.IOX r0 = (X.IOX) r0
            com.instagram.user.model.User r0 = r0.A00
            r2.DRN(r0)
            r0 = -611338900(0xffffffffdb8fb56c, float:-8.0900794E16)
            goto L_0x0026
        L_0x0795:
            r1 = -581080900(0xffffffffdd5d68bc, float:-9.9713802E17)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.JQh r2 = (X.C59613JQh) r2
            java.lang.Object r0 = r0.A02
            X.IOX r0 = (X.IOX) r0
            com.instagram.user.model.User r0 = r0.A00
            r2.DRQ(r0)
            r0 = -262281949(0xfffffffff05de523, float:-2.7469279E29)
            goto L_0x0026
        L_0x07ae:
            r1 = -1292412331(0xffffffffb2f75a55, float:-2.8795663E-8)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r8 = r0.A01
            X.H1x r8 = (X.C54177H1x) r8
            java.lang.Object r0 = r0.A02
            java.lang.String r7 = X.DbS.A0q(r0)
            androidx.fragment.app.FragmentActivity r3 = r8.requireActivity()
            X.0eM r2 = r8.A0D
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            X.6Yo r6 = X.DbS.A0M(r3, r0)
            X.1a1 r5 = X.C46447Df9.A02()
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r2)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r2 = r8.getModuleName()
            java.lang.String r0 = "liked_collections_list"
            com.instagram.profile.intf.UserDetailLaunchConfig r0 = X.C46474Dfc.A01(r3, r7, r0, r2)
            androidx.fragment.app.Fragment r0 = r5.A02(r4, r0)
            X.Dba.A12(r0, r6)
            r0 = 945337031(0x3858b2c7, float:5.1664912E-5)
            goto L_0x0026
        L_0x07ef:
            r1 = 1938349483(0x7388ddab, float:2.1687266E31)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.GiB r2 = (X.C53078GiB) r2
            X.JOT r2 = r2.A05
            java.lang.Object r0 = r0.A01
            com.instagram.save.model.SavedCollection r0 = (com.instagram.save.model.SavedCollection) r0
            r2.D4S(r0)
            r0 = -2129108777(0xffffffff811860d7, float:-2.798747E-38)
            goto L_0x0026
        L_0x0808:
            r1 = 2056482291(0x7a936df3, float:3.8274884E35)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.GiB r2 = (X.C53078GiB) r2
            X.JOT r2 = r2.A05
            java.lang.Object r0 = r0.A01
            com.instagram.save.model.SavedCollection r0 = (com.instagram.save.model.SavedCollection) r0
            r2.D4S(r0)
            r0 = -2068487888(0xffffffff84b56130, float:-4.2642148E-36)
            goto L_0x0026
        L_0x0821:
            r1 = -1433468620(0xffffffffaa8f0134, float:-2.5402738E-13)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            X.HBx r4 = (X.C54406HBx) r4
            X.H1Q r3 = r4.A02
            java.lang.Object r2 = r0.A01
            X.HAW r2 = (X.HAW) r2
            X.XBt r0 = r4.A01
            r0.B9n(r2)
            r3.A03(r2)
            r0 = -416178437(0xffffffffe7319efb, float:-8.3879154E23)
            goto L_0x0026
        L_0x083f:
            r1 = -863317774(0xffffffffcc8ad0f2, float:-7.2779664E7)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.GxO r2 = (X.C53980GxO) r2
            X.0sL r2 = r2.A06
            X.0qQ.A0A(r4)
            java.lang.Object r0 = r0.A01
            r2.invoke(r4, r0)
            r0 = 1951949864(0x74586428, float:6.857712E31)
            goto L_0x0026
        L_0x0859:
            r1 = 795260239(0x2f66b54f, float:2.0982792E-10)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.3Wa r2 = (X.C242813Wa) r2
            java.lang.Object r0 = r0.A02
            X.1Xj r0 = (X.1Xj) r0
            r2.D2k(r0)
            r0 = -509616959(0xffffffffe19fdcc1, float:-3.686174E20)
            goto L_0x0026
        L_0x0870:
            r1 = 853939103(0x32e6139f, float:2.6784447E-8)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.3Wa r3 = (X.C242813Wa) r3
            java.lang.Object r2 = r0.A02
            X.1Xj r2 = (X.1Xj) r2
            r0 = 1
            r3.D3d(r2, r0)
            r0 = -1963767812(0xffffffff8af347fc, float:-2.3427126E-32)
            goto L_0x0026
        L_0x0888:
            r1 = 1230226956(0x4953c60c, float:867424.75)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.3Wa r2 = (X.C242813Wa) r2
            java.lang.Object r0 = r0.A02
            X.1Xj r0 = (X.1Xj) r0
            r2.D2I(r0)
            r0 = 1824773569(0x6cc3d5c1, float:1.8939997E27)
            goto L_0x0026
        L_0x089f:
            r1 = 1170931356(0x45cafe9c, float:6495.826)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.3ZP r3 = (X.AnonymousClass3ZP) r3
            java.lang.Object r0 = r0.A01
            X.1Xj r2 = X.C51968G9o.A0m(r0)
            X.3Wa r0 = r3.A01
            r0.D2h(r2)
            r0 = 355608995(0x153229a3, float:3.597966E-26)
            goto L_0x0026
        L_0x08ba:
            r1 = 293734188(0x1182072c, float:2.0514804E-28)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.3ZP r3 = (X.AnonymousClass3ZP) r3
            java.lang.Object r0 = r0.A01
            X.1Xj r2 = X.C51968G9o.A0m(r0)
            X.3Wa r0 = r3.A01
            r0.D30(r2)
            r0 = 750722094(0x2cbf1c2e, float:5.431675E-12)
            goto L_0x0026
        L_0x08d5:
            r1 = -1077241036(0xffffffffbfca9b34, float:-1.5828614)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.3Wa r2 = (X.C242813Wa) r2
            java.lang.Object r0 = r0.A02
            X.1Xj r0 = (X.1Xj) r0
            r2.Dtz(r0)
            r0 = 1893041743(0x70d5864f, float:5.286614E29)
            goto L_0x0026
        L_0x08ec:
            r1 = -2007354147(0xffffffff885a34dd, float:-6.566413E-34)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.3Wa r2 = (X.C242813Wa) r2
            java.lang.Object r0 = r0.A02
            X.1Xj r0 = (X.1Xj) r0
            r2.Dtz(r0)
            r0 = -1256200045(0xffffffffb51fe893, float:-5.9570556E-7)
            goto L_0x0026
        L_0x0903:
            r1 = -712566509(0xffffffffd5871913, float:-1.85677203E13)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.3ZP r3 = (X.AnonymousClass3ZP) r3
            java.lang.Object r0 = r0.A01
            X.1Xj r2 = X.C51968G9o.A0m(r0)
            X.3Wa r0 = r3.A01
            r0.D2L(r2)
            r0 = 2104595328(0x7d719380, float:2.0069363E37)
            goto L_0x0026
        L_0x091e:
            r1 = -1037370371(0xffffffffc22afbfd, float:-42.746082)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.3ZP r3 = (X.AnonymousClass3ZP) r3
            java.lang.Object r0 = r0.A01
            X.1Xj r2 = X.C51968G9o.A0m(r0)
            X.3Wa r0 = r3.A01
            r0.D2c(r2)
            r0 = -1973058106(0xffffffff8a6585c6, float:-1.1051109E-32)
            goto L_0x0026
        L_0x0939:
            r1 = -2074137812(0xffffffff845f2b2c, float:-2.6233348E-36)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.3Wa r2 = (X.C242813Wa) r2
            java.lang.Object r0 = r0.A02
            X.1Xj r0 = (X.1Xj) r0
            r2.Cx1(r0)
            r0 = 2110910414(0x7dd1efce, float:3.4881724E37)
            goto L_0x0026
        L_0x0950:
            r1 = 1859376180(0x6ed3d434, float:3.2778937E28)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.3ZP r3 = (X.AnonymousClass3ZP) r3
            java.lang.Object r2 = r0.A01
            X.1Xj r2 = (X.1Xj) r2
            X.3Wa r0 = r3.A01
            r0.D3N(r2)
            r0 = 1098406387(0x417859f3, float:15.52196)
            goto L_0x0026
        L_0x0969:
            r1 = 422177259(0x1929e9eb, float:8.7843346E-24)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.JPQ r2 = (X.JPQ) r2
            java.lang.Object r0 = r0.A02
            X.1Xj r0 = (X.1Xj) r0
            r2.DIG(r0)
            r0 = -855519183(0xffffffffcd01d031, float:-1.36119056E8)
            goto L_0x0026
        L_0x0980:
            r1 = 2122808355(0x7e877c23, float:9.004517E37)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.GxY r2 = (X.C53990GxY) r2
            java.lang.Object r0 = r0.A01
            X.LRh r0 = (X.LRh) r0
            X.C53990GxY.A04(r2, r0)
            r0 = -877462168(0xffffffffcbb2fd68, float:-2.346056E7)
            goto L_0x0026
        L_0x0997:
            r1 = 826926710(0x3149e676, float:2.9380351E-9)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.9JA r2 = (X.AnonymousClass9JA) r2
            java.lang.Object r2 = r2.A01
            X.JwG r2 = (X.C61078JwG) r2
            java.lang.Object r2 = r2.A00
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r0 = r0.A01
            r2.invoke(r0)
            r0 = 1886352154(0x706f731a, float:2.9642427E29)
            goto L_0x0026
        L_0x09b4:
            r1 = -305631032(0xffffffffedc870c8, float:-7.754168E27)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.3ha r3 = (X.C248203ha) r3
            X.JwG r2 = r3.A02
            java.lang.Object r2 = r2.A00
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r0 = r0.A02
            r2.invoke(r0, r3)
            r0 = 1731738110(0x673839fe, float:8.699852E23)
            goto L_0x0026
        L_0x09cf:
            r1 = -1059220364(0xffffffffc0dd9474, float:-6.9243717)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.H40 r2 = (X.H40) r2
            X.JO8 r4 = r2.A00
            java.lang.Object r3 = r0.A01
            X.Hko r3 = (X.C55629Hko) r3
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r0 = 0
            android.content.Context r2 = X.DbT.A06(r4, r3, r0)
            java.lang.String r0 = r3.A01
            X.0nC.A00(r2, r0)
            android.content.Context r2 = r4.getContext()
            r0 = 2131956743(0x7f131407, float:1.955005E38)
            java.lang.String r0 = r4.getString(r0)
            X.C59689JTv.A09(r2, r0)
            r0 = 309006563(0x126b10e3, float:7.417374E-28)
            goto L_0x0026
        L_0x09ff:
            r1 = -1331901856(0xffffffffb09cca60, float:-1.1408012E-9)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.WW4 r2 = (X.WW4) r2
            java.lang.Object r0 = r0.A02
            X.1Xj r0 = (X.1Xj) r0
            r2.DJ3(r0)
            r0 = 1210384945(0x48250231, float:168968.77)
            goto L_0x0026
        L_0x0a16:
            r1 = -935831795(0xffffffffc838570d, float:-188764.2)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.WW4 r2 = (X.WW4) r2
            java.lang.Object r0 = r0.A02
            X.1Xj r0 = (X.1Xj) r0
            r2.DJ3(r0)
            r0 = -312646667(0xffffffffed5d63f5, float:-4.2823142E27)
            goto L_0x0026
        L_0x0a2d:
            r1 = 634793720(0x25d62ef8, float:3.715491E-16)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.GjK r3 = (X.C53148GjK) r3
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r3.A06
            r2 = 2131238108(0x7f081cdc, float:1.8092485E38)
            r4.setImageResource(r2)
            android.content.Context r3 = r3.A00
            int r2 = X.2Yu.A0B(r3)
            X.DbX.A12(r3, r4, r2)
            java.lang.Object r0 = r0.A01
            X.HiN r0 = (X.C55479HiN) r0
            X.H1P r3 = r0.A00
            X.0eM r0 = r3.A0M
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            android.content.Context r2 = r3.requireContext()
            r0 = 2131972616(0x7f135208, float:1.9582245E38)
            java.lang.String r7 = r2.getString(r0)
            java.lang.String r8 = r3.A0E
            X.0eM r2 = r3.A0G
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r2)
            java.lang.String r0 = r0.A05
            java.util.List r10 = X.AnonymousClass7TE.A1I(r0)
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r2)
            java.lang.String r9 = r0.A05
            com.instagram.api.schemas.CollectionPrivacyModeEnum r4 = com.instagram.api.schemas.CollectionPrivacyModeEnum.PUBLIC
            r0 = 4
            X.H50 r5 = new X.H50
            r5.<init>(r3, r0)
            r11 = 0
            X.C56641I5w.A03(r4, r5, r6, r7, r8, r9, r10, r11)
            X.H1P.A03(r3)
            r0 = 1623984473(0x60cc0959, float:1.1761904E20)
            goto L_0x0026
        L_0x0a88:
            r1 = 135631967(0x815945f, float:4.5012466E-34)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.JQE r3 = (X.JQE) r3
            java.lang.Object r0 = r0.A02
            X.Hki r0 = (X.C55623Hki) r0
            androidx.fragment.app.FragmentActivity r2 = r0.A00
            com.instagram.common.session.UserSession r0 = r0.A01
            r3.D1y(r2, r0)
            r0 = -511628118(0xffffffffe1812caa, float:-2.9785605E20)
            goto L_0x0026
        L_0x0aa3:
            r1 = 1833471740(0x6d488efc, float:3.8793662E27)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.JO1 r2 = (X.JO1) r2
            java.lang.Object r0 = r0.A02
            X.IOP r0 = (X.IOP) r0
            com.instagram.api.schemas.Achievement r0 = r0.A00
            r2.Ct8(r0)
            r0 = 2050377710(0x7a3647ee, float:2.3661423E35)
            goto L_0x0026
        L_0x0abc:
            r1 = -1059990619(0xffffffffc0d1d3a5, float:-6.5570855)
            int r1 = A00(r0, r1)
            r0 = 822243736(0x31027198, float:1.898206E-9)
            goto L_0x0026
        L_0x0ac8:
            r1 = 2134294651(0x7f36c07b, float:2.4291891E38)
            int r1 = A00(r0, r1)
            r0 = 1909947583(0x71d77cbf, float:2.1340827E30)
            goto L_0x0026
        L_0x0ad4:
            r1 = 388694354(0x172b0152, float:5.5254746E-25)
            int r1 = A00(r0, r1)
            r0 = -992658588(0xffffffffc4d53b64, float:-1705.856)
            goto L_0x0026
        L_0x0ae0:
            r1 = -1642100165(0xffffffff9e1f8a3b, float:-8.445975E-21)
            int r1 = A00(r0, r1)
            r0 = 1727538431(0x66f824ff, float:5.8591467E23)
            goto L_0x0026
        L_0x0aec:
            r1 = 474130194(0x1c42a712, float:6.440515E-22)
            int r1 = A00(r0, r1)
            r0 = -1417621711(0xffffffffab80cf31, float:-9.152454E-13)
            goto L_0x0026
        L_0x0af8:
            r1 = 73967771(0x468a89b, float:2.7348889E-36)
            int r1 = A00(r0, r1)
            r0 = 1957497182(0x74ad095e, float:1.0967497E32)
            goto L_0x0026
        L_0x0b04:
            r1 = -296471599(0xffffffffee5433d1, float:-1.6418366E28)
            int r1 = A00(r0, r1)
            r0 = -1041187089(0xffffffffc1f0beef, float:-30.09323)
            goto L_0x0026
        L_0x0b10:
            r1 = -308857217(0xffffffffed97367f, float:-5.849765E27)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            android.content.Context r3 = (android.content.Context) r3
            r2 = 2130772118(0x7f010096, float:1.7147345E38)
            android.view.animation.Animation r4 = android.view.animation.AnimationUtils.loadAnimation(r3, r2)
            X.0qQ.A07(r4)
            java.lang.Object r3 = r0.A01
            android.view.View r3 = (android.view.View) r3
            r2 = 1
            X.IE5 r0 = new X.IE5
            r0.<init>(r3, r2)
            r4.setAnimationListener(r0)
            r3.startAnimation(r4)
            r0 = 1061703178(0x3f484e0a, float:0.7824408)
            goto L_0x0026
        L_0x0b3a:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r0 = 1260922444(0x4b28264c, float:1.1019852E7)
            X.AnonymousClass0fD.A0C(r0, r1)
            throw r2
        L_0x0b45:
            X.Wub r2 = X.AnonymousClass7TE.A1K()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ID2.onClick(android.view.View):void");
    }

    public static int A00(ID2 id2, int i) {
        int A05 = AnonymousClass0fD.A05(i);
        ((C52971GgO) id2.A01).A0O((C59481JLf) id2.A02);
        return A05;
    }

    public static int A01(ID2 id2, int i) {
        int A05 = AnonymousClass0fD.A05(i);
        C52031GCd.A05((AnonymousClass3W1) id2.A01, (C52031GCd) id2.A02);
        return A05;
    }

    public ID2(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }
}

package X;

import android.view.View;

public final class LYD implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public LYD(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static LYD A01(Object obj, int i) {
        return new LYD(obj, i);
    }

    public static void A02(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new LYD(obj, i), view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0605, code lost:
        if (r0.ordinal() != 2) goto L_0x0607;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0a94, code lost:
        X.0qQ.A0F(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0a9b, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0e75, code lost:
        X.AnonymousClass0fD.A0C(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0e78, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0e80, code lost:
        X.AnonymousClass0fD.A0C(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0e83, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0fc4, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0fc7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005a, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r18) {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0fab;
                case 1: goto L_0x0bd4;
                case 2: goto L_0x012d;
                case 3: goto L_0x0f7e;
                case 4: goto L_0x0f6c;
                case 5: goto L_0x011a;
                case 6: goto L_0x0f5a;
                case 7: goto L_0x0f48;
                case 8: goto L_0x0f32;
                case 9: goto L_0x0107;
                case 10: goto L_0x0f18;
                case 11: goto L_0x0bab;
                case 12: goto L_0x0b63;
                case 13: goto L_0x0a67;
                case 14: goto L_0x0a26;
                case 15: goto L_0x0a04;
                case 16: goto L_0x09eb;
                case 17: goto L_0x09c7;
                case 18: goto L_0x09a6;
                case 19: goto L_0x0968;
                case 20: goto L_0x0914;
                case 21: goto L_0x088d;
                case 22: goto L_0x084b;
                case 23: goto L_0x0830;
                case 24: goto L_0x080f;
                case 25: goto L_0x07f9;
                case 26: goto L_0x07ac;
                case 27: goto L_0x078d;
                case 28: goto L_0x0778;
                case 29: goto L_0x0eed;
                case 30: goto L_0x0ece;
                case 31: goto L_0x075e;
                case 32: goto L_0x0748;
                case 33: goto L_0x0ea3;
                case 34: goto L_0x0e84;
                case 35: goto L_0x0729;
                case 36: goto L_0x06ef;
                case 37: goto L_0x06d0;
                case 38: goto L_0x0695;
                case 39: goto L_0x053c;
                case 40: goto L_0x0516;
                case 41: goto L_0x0062;
                case 42: goto L_0x050a;
                case 43: goto L_0x04f6;
                case 44: goto L_0x04ea;
                case 45: goto L_0x04de;
                case 46: goto L_0x04cb;
                case 47: goto L_0x0e50;
                case 48: goto L_0x0e3a;
                case 49: goto L_0x0495;
                case 50: goto L_0x045f;
                case 51: goto L_0x0397;
                case 52: goto L_0x0e0c;
                case 53: goto L_0x0dde;
                case 54: goto L_0x0dca;
                case 55: goto L_0x0db6;
                case 56: goto L_0x0da2;
                case 57: goto L_0x0d8e;
                case 58: goto L_0x0d7a;
                case 59: goto L_0x0d66;
                case 60: goto L_0x0330;
                case 61: goto L_0x02e2;
                case 62: goto L_0x0203;
                case 63: goto L_0x0d00;
                case 64: goto L_0x0caa;
                case 65: goto L_0x0c84;
                case 66: goto L_0x0c58;
                case 67: goto L_0x01a6;
                case 68: goto L_0x0c32;
                case 69: goto L_0x0c06;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = 1762997041(0x69153331, float:1.1273231E25)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.KQW r5 = (X.KQW) r5
            X.MtU r0 = X.JTT.A0U(r5)
            X.NUa r1 = r0.A03
            java.lang.String r0 = "RESTORE_LANDING_NUX_TRY_ANOTHER_WAY_TAP"
            r1.A0B(r0)
            X.8ae r6 = X.C358278ae.DEFAULT
            boolean r0 = r5.A03
            r7 = 0
            if (r0 == 0) goto L_0x0060
            r0 = 2131961708(0x7f13276c, float:1.956012E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L_0x002b:
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x005e
            r0 = 2131961709(0x7f13276d, float:1.9560123E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
        L_0x0036:
            r0 = 3
            X.Mof r10 = new X.Mof
            r10.<init>(r5, r0)
            r0 = 4
            X.Mof r11 = new X.Mof
            r11.<init>(r5, r0)
            r0 = 5
            X.Mof r12 = new X.Mof
            r12.<init>(r5, r0)
            r0 = 6
            X.Mof r13 = new X.Mof
            r13.<init>(r5, r0)
            r14 = 2131961710(0x7f13276e, float:1.9560125E38)
            r15 = 2131961707(0x7f13276b, float:1.9560119E38)
            X.C71145Oe2.A06(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = 528277654(0x1f7ce096, float:5.354885E-20)
        L_0x005a:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x005e:
            r9 = r7
            goto L_0x0036
        L_0x0060:
            r8 = r7
            goto L_0x002b
        L_0x0062:
            r0 = -905100173(0xffffffffca0d4473, float:-2314524.8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.K67 r6 = (X.K67) r6
            X.JiL r3 = r6.A07
            java.lang.String r8 = "clipsPeopleTaggingViewModel"
            if (r3 == 0) goto L_0x0a94
            X.2Fj r1 = r3.A0A
            java.util.List r2 = X.JTS.A0q(r1)
            r4 = 0
            r3.A05 = r2
            X.2Fj r1 = r3.A0A
            r1.A0B(r2)
            X.JiL r3 = r6.A07
            if (r3 == 0) goto L_0x0a94
            X.2Fj r1 = r3.A09
            java.util.List r2 = X.JTS.A0q(r1)
            r3.A03 = r2
            X.2Fj r1 = r3.A09
            r1.A0B(r2)
            X.JiL r3 = r6.A07
            if (r3 == 0) goto L_0x0a94
            X.05G r1 = r3.A0C
            java.util.List r2 = X.JTO.A16(r1)
            X.0qQ.A0B(r2, r4)
            r3.A04 = r2
            X.05G r1 = r3.A0C
            r1.Epw(r2)
            X.28D r2 = r6.A04
            X.28D r1 = X.28D.A0x
            if (r2 != r1) goto L_0x00de
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r7 = r6.A05
            if (r7 != 0) goto L_0x00b4
            java.lang.String r8 = "sharingViewModel"
            goto L_0x0a94
        L_0x00b4:
            X.JiL r1 = r6.A07
            if (r1 == 0) goto L_0x0a94
            X.2Fj r1 = r1.A0A
            java.lang.Object r5 = r1.A02()
            if (r5 != 0) goto L_0x00c2
            X.0sn r5 = X.0sn.A00
        L_0x00c2:
            X.JiL r1 = r6.A07
            if (r1 == 0) goto L_0x0a94
            X.2Fj r1 = r1.A09
            java.lang.Object r4 = r1.A02()
            if (r4 != 0) goto L_0x00d0
            X.0sn r4 = X.0sn.A00
        L_0x00d0:
            X.6oS r3 = X.C318116oQ.A00(r7)
            r2 = 0
            r1 = 31
            X.MHJ r1 = X.MHJ.A02(r5, r4, r7, r2, r1)
            X.AnonymousClass7TE.A1Z(r1, r3)
        L_0x00de:
            X.0eM r1 = r6.A0Q
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.L4H r2 = X.C63209KtG.A00(r1)
            X.JiL r1 = r6.A07
            if (r1 == 0) goto L_0x0a94
            java.util.List r1 = r1.A05
            int r1 = r1.size()
            X.1QP r5 = r2.A01
            long r3 = r2.A00
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "USER_TAGGED_PEOPLE"
            r5.flowMarkPoint(r3, r1, r2)
            X.DbT.A1J(r6)
            r1 = -1339772372(0xffffffffb024b22c, float:-5.991605E-10)
            goto L_0x0fc4
        L_0x0107:
            r0 = -575701086(0xffffffffddaf7fa2, float:-1.58075055E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Lou r1 = (X.C65191Lou) r1
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = r1.A01
            if (r1 != 0) goto L_0x0be9
            java.lang.String r8 = "shareToFeedToggle"
            goto L_0x0a94
        L_0x011a:
            r0 = 1981766611(0x761f5bd3, float:8.0804455E32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.K55 r3 = (X.K55) r3
            X.LyK r1 = r3.A02
            if (r1 != 0) goto L_0x0bf1
            java.lang.String r8 = "clipsProductTaggingController"
            goto L_0x0a94
        L_0x012d:
            r0 = 1564835827(0x5d457ff3, float:8.8946003E17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.Jpl r3 = (X.C60700Jpl) r3
            int r1 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.common.gallery.Medium r2 = r3.A01
            if (r2 == 0) goto L_0x01a1
            X.Jlc r1 = r3.A04
            X.KB9 r1 = r1.A04
            X.K4p r4 = r1.A04
            java.lang.String r6 = r4.A01
            android.content.Context r5 = r4.requireContext()
            X.0eM r3 = r4.A03
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r3)
            X.2Nn r1 = X.AnonymousClass830.A00(r5, r1)
            r3.getValue()
            java.io.File r12 = X.C39907AIy.A02(r1, r6)
            android.content.Context r9 = r4.requireContext()
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r3)
            int r1 = X.JTT.A06(r4)
            int r15 = r1 / 2
            int r1 = X.JTT.A06(r4)
            int r1 = r1 / 2
            float r1 = (float) r1
            r14 = 1058013184(0x3f100000, float:0.5625)
            int r16 = X.JTO.A05(r1, r14)
            java.lang.String r3 = "Required value was null."
            java.lang.String r13 = r2.A0X
            X.JgF r1 = r4.A00
            java.lang.String r8 = "galleryCoverPhotoPickerViewModel"
            if (r1 == 0) goto L_0x0a94
            X.2Fj r2 = r1.A00
            java.lang.String r1 = "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.instagram.creation.video.intf.CoverFrameSuccessHandler>"
            X.0qQ.A0C(r2, r1)
            java.lang.Object r11 = r2.A02()
            if (r11 == 0) goto L_0x0c01
            X.MSD r11 = (X.MSD) r11
            X.LT1.A03(r9, r10, r11, r12, r13, r14, r15, r16)
            X.JgF r3 = r4.A00
            if (r3 == 0) goto L_0x0a94
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 6
            X.MH9.A04(r3, r2, r1)
            X.DbX.A1J(r4)
        L_0x01a1:
            r1 = -446741793(0xffffffffe55f42df, float:-6.589508E22)
            goto L_0x0fc4
        L_0x01a6:
            r0 = 650233753(0x26c1c799, float:1.3446166E-15)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.KQV r5 = (X.KQV) r5
            X.MtU r0 = X.JTT.A0T(r5)
            X.NUa r1 = r0.A03
            java.lang.String r0 = "RESTORE_LANDING_NUX_TRY_ANOTHER_WAY_TAP"
            r1.A0B(r0)
            X.8ae r6 = X.C358278ae.DEFAULT
            boolean r0 = r5.A03
            r7 = 0
            if (r0 == 0) goto L_0x0201
            r0 = 2131961708(0x7f13276c, float:1.956012E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L_0x01ca:
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x01ff
            r0 = 2131961709(0x7f13276d, float:1.9560123E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
        L_0x01d5:
            r0 = 41
            X.Plf r10 = new X.Plf
            r10.<init>(r5, r0)
            r0 = 42
            X.Plf r11 = new X.Plf
            r11.<init>(r5, r0)
            r0 = 43
            X.Plf r12 = new X.Plf
            r12.<init>(r5, r0)
            r0 = 44
            X.Plf r13 = new X.Plf
            r13.<init>(r5, r0)
            r14 = 2131961710(0x7f13276e, float:1.9560125E38)
            r15 = 2131961707(0x7f13276b, float:1.9560119E38)
            X.C71145Oe2.A06(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = -327929599(0xffffffffec743101, float:-1.18083726E27)
            goto L_0x005a
        L_0x01ff:
            r9 = r7
            goto L_0x01d5
        L_0x0201:
            r8 = r7
            goto L_0x01ca
        L_0x0203:
            r0 = -594123335(0xffffffffdc9665b9, float:-3.38664734E17)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.7GV r1 = (X.AnonymousClass7GV) r1
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            X.AnonymousClass7GV.A03(r1, r5)
            X.05G r8 = r1.A07
            boolean r0 = X.DbX.A1b(r8)
            if (r0 != 0) goto L_0x022d
            com.instagram.common.session.UserSession r7 = r1.A00
            java.lang.String r6 = X.AnonymousClass7GV.A01(r1)
            java.lang.String r3 = X.AnonymousClass7GV.A02(r1)
            int r2 = X.AnonymousClass7GV.A00(r1)
            r0 = 0
            X.LPX.A02(r7, r0, r6, r3, r2)
        L_0x022d:
            X.05G r0 = r1.A08
            boolean r0 = X.DbX.A1b(r0)
            if (r0 == 0) goto L_0x029e
            X.7GX r3 = r1.A01
            int r16 = X.AnonymousClass7GV.A00(r1)
            java.lang.String r9 = X.AnonymousClass7GV.A01(r1)
            java.lang.String r10 = X.AnonymousClass7GV.A02(r1)
            boolean r0 = X.DbX.A1b(r8)
            java.util.HashMap r15 = X.AnonymousClass7TE.A1E()
            if (r0 == 0) goto L_0x029b
            java.lang.String r2 = "True"
        L_0x024f:
            java.lang.String r0 = "previously_joined"
            r15.put(r0, r2)
            com.instagram.common.session.UserSession r8 = r3.A00
            java.lang.String r11 = "join_chat_moderator_attempt"
            java.lang.String r12 = "tap"
            java.lang.String r13 = "accept_invite_button"
            java.lang.String r14 = "thread_view"
            X.C69871NtZ.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.instagram.common.session.UserSession r6 = r1.A00
            java.lang.String r2 = X.AnonymousClass7GV.A01(r1)
            X.AnonymousClass7GV.A02(r1)
            X.AnonymousClass7GV.A00(r1)
            r0 = 21
            X.KAf r3 = new X.KAf
            r3.<init>(r1, r0)
            if (r2 == 0) goto L_0x0296
            X.1NY r1 = X.DbU.A0M(r6)
            r1.A08(r5)
            java.lang.String r0 = "direct_v2/accept_moderator_invite_to_channel/"
            r1.A0A(r0)
            java.lang.String r0 = "thread_id"
            X.DbX.A1M(r1, r0, r2)
            X.1OC r2 = r1.A0M()
            r1 = 1
            X.NHh r0 = new X.NHh
            r0.<init>(r3, r6, r1)
            r2.A00 = r0
            X.1ES.A03(r2)
        L_0x0296:
            r0 = -1529053878(0xffffffffa4dc7d4a, float:-9.562204E-17)
            goto L_0x005a
        L_0x029b:
            java.lang.String r2 = "False"
            goto L_0x024f
        L_0x029e:
            X.05G r0 = r1.A0B
            boolean r0 = X.DbX.A1b(r0)
            if (r0 == 0) goto L_0x0296
            r1.A04()
            r6 = 1
            com.instagram.common.session.UserSession r5 = r1.A00
            X.1Av r0 = X.1Au.A00(r5)
            r0.A0L()
            X.4Cq r3 = r1.A02
            r12 = 0
            r2 = 21
            X.MG9 r0 = new X.MG9
            r0.<init>(r1, r12, r2, r6)
            X.AnonymousClass7TE.A1Z(r0, r3)
            X.Oxp r0 = X.C69867NtV.A00(r5)
            int r13 = X.AnonymousClass7GV.A00(r1)
            java.lang.String r6 = X.AnonymousClass7GV.A01(r1)
            java.lang.String r7 = X.AnonymousClass7GV.A02(r1)
            com.instagram.common.session.UserSession r5 = r0.A00
            r0 = 642(0x282, float:9.0E-43)
            java.lang.String r8 = X.C66579MXk.A00(r0)
            java.lang.String r9 = "tap"
            java.lang.String r10 = "add_moderator_promo_banner"
            java.lang.String r11 = "thread_view"
            X.C69871NtZ.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0296
        L_0x02e2:
            r0 = -398972159(0xffffffffe8382b01, float:-3.478835E24)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.K51 r2 = (X.K51) r2
            X.0eM r0 = r2.A07
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r7 = r2.A04
            r8 = 0
            java.lang.String r9 = r2.A05
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            boolean r12 = X.C363558jv.A00(r0)
            java.lang.Boolean r0 = r2.A03
            boolean r13 = X.C51972G9s.A1Z(r0)
            X.5nY r0 = r2.A02
            java.lang.String r10 = r0.toString()
            java.lang.String r6 = "default_privacy_consent_bottomsheet_second_click"
            r11 = 0
            X.C295105na.A02(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r1 = r2.A05
            boolean r0 = X.K51.A00(r2)
            if (r0 != 0) goto L_0x0327
            java.lang.String r0 = "advanced_setting"
            if (r1 == 0) goto L_0x032c
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x032c
            X.DbT.A1J(r2)
        L_0x0327:
            r0 = -1420183144(0xffffffffab59b998, float:-7.735145E-13)
            goto L_0x005a
        L_0x032c:
            X.DbZ.A15(r2)
            goto L_0x0327
        L_0x0330:
            r0 = 2128866903(0x7ee3ee57, float:1.5148614E38)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.K51 r2 = (X.K51) r2
            X.0eM r1 = r2.A07
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r7 = r2.A04
            r8 = 0
            java.lang.String r9 = r2.A05
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            boolean r12 = X.C363558jv.A00(r0)
            java.lang.Boolean r0 = r2.A03
            boolean r13 = X.C51972G9s.A1Z(r0)
            X.5nY r0 = r2.A02
            java.lang.String r10 = r0.name()
            java.lang.String r6 = "default_privacy_consent_bottomsheet_primary_click"
            r11 = 0
            X.C295105na.A02(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.MSF r0 = r2.A01
            if (r0 == 0) goto L_0x0367
            r0.DZP()
        L_0x0367:
            X.5w9 r0 = X.AnonymousClass5w8.A05
            X.5w8 r3 = X.JTT.A0R(r1)
            r2.requireActivity()
            android.content.Context r1 = r2.requireContext()
            java.lang.String r0 = r2.A05
            r3.A07(r1, r0)
            java.lang.String r1 = r2.A05
            boolean r0 = X.K51.A00(r2)
            if (r0 != 0) goto L_0x038e
            java.lang.String r0 = "advanced_setting"
            if (r1 == 0) goto L_0x0393
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0393
            X.DbT.A1J(r2)
        L_0x038e:
            r0 = 2077298610(0x7bd10fb2, float:2.1710168E36)
            goto L_0x005a
        L_0x0393:
            X.DbZ.A15(r2)
            goto L_0x038e
        L_0x0397:
            r0 = 341924289(0x146159c1, float:1.1377298E-26)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.K6A r6 = (X.K6A) r6
            X.3Q2 r3 = X.JTT.A0f(r6)
            android.content.Context r0 = r6.requireContext()
            X.82q r8 = X.JTU.A0L(r0)
            android.widget.ImageView r0 = r6.A06
            r7 = 0
            r5 = 1
            if (r0 == 0) goto L_0x03f1
            boolean r0 = r0.isSelected()
            if (r0 != r5) goto L_0x03f1
            if (r3 == 0) goto L_0x03f1
            boolean r0 = r3.A5C
            if (r0 != 0) goto L_0x03c6
            boolean r0 = r8.CKG()
            if (r0 == 0) goto L_0x03f1
        L_0x03c6:
            java.util.List r0 = r8.Co4()
            int r0 = r0.size()
            boolean r2 = X.C51970G9q.A1W(r0, r5)
            X.0eM r0 = r6.A0O
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            boolean r0 = r8.CL3()
            boolean r0 = X.AnonymousClass30D.A0K(r1, r2, r0)
            if (r0 == 0) goto L_0x03f1
            android.content.Context r1 = r6.requireContext()
            r0 = 2131976465(0x7f136111, float:1.9590051E38)
            X.DbZ.A0w(r1, r6, r0)
            r0 = -932838302(0xffffffffc8660462, float:-235537.53)
            goto L_0x005a
        L_0x03f1:
            android.widget.ImageView r0 = r6.A06
            if (r0 == 0) goto L_0x03fc
            boolean r0 = r0.isSelected()
            if (r0 != r5) goto L_0x03fc
            r7 = 1
        L_0x03fc:
            r5 = r7 ^ 1
            if (r3 == 0) goto L_0x0402
            r3.A5F = r5
        L_0x0402:
            android.widget.ImageView r0 = r6.A06
            if (r0 == 0) goto L_0x0409
            r0.setSelected(r5)
        L_0x0409:
            android.widget.Toast r0 = r6.A07
            if (r0 == 0) goto L_0x0410
            r0.cancel()
        L_0x0410:
            X.0eM r0 = r6.A0O
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            boolean r0 = X.AnonymousClass30D.A05(r0)
            if (r0 == 0) goto L_0x0456
            r0 = 2131976469(0x7f136115, float:1.959006E38)
            if (r5 == 0) goto L_0x0424
            r0 = 2131976466(0x7f136112, float:1.9590053E38)
        L_0x0424:
            android.content.Context r3 = r6.getContext()
            java.lang.String r2 = r6.getString(r0)
            r1 = 0
            r0 = 0
            X.Jf4 r0 = X.C59689JTv.A03(r3, r2, r1, r0)
            r6.A07 = r0
            java.lang.String r8 = "videoPreviewController"
            X.LFb r0 = r6.A0F
            if (r5 == 0) goto L_0x044a
            if (r0 == 0) goto L_0x0a94
            X.9Pn r0 = r0.A03
            X.9Pw r0 = r0.A08
            if (r0 == 0) goto L_0x0445
            r0.A09()
        L_0x0445:
            r0 = 666310212(0x27b71644, float:5.0816844E-15)
            goto L_0x005a
        L_0x044a:
            if (r0 == 0) goto L_0x0a94
            X.9Pn r0 = r0.A03
            X.9Pw r0 = r0.A08
            if (r0 == 0) goto L_0x0445
            r0.A0A()
            goto L_0x0445
        L_0x0456:
            r0 = 2131976405(0x7f1360d5, float:1.958993E38)
            if (r5 == 0) goto L_0x0424
            r0 = 2131976404(0x7f1360d4, float:1.9589928E38)
            goto L_0x0424
        L_0x045f:
            r0 = -2086579822(0xffffffff83a15192, float:-9.481457E-37)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K6A r0 = (X.K6A) r0
            X.JiK r5 = X.JTT.A0Q(r0)
            X.05G r3 = r5.A03
        L_0x0470:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.Jvd r1 = (X.C61039Jvd) r1
            java.lang.Integer r7 = X.AnonymousClass05K.A0N
            boolean r0 = r5.A05
            r9 = r0 ^ 1
            boolean r11 = r1.A04
            boolean r8 = X.JTQ.A1X(r7)
            X.Jvd r6 = new X.Jvd
            r10 = r9
            r12 = r9
            r6.<init>((java.lang.Integer) r7, (boolean) r8, (boolean) r9, (boolean) r10, (boolean) r11, (boolean) r12)
            boolean r0 = r3.AIY(r2, r6)
            if (r0 == 0) goto L_0x0470
            r0 = 1013331243(0x3c66352b, float:0.014050762)
            goto L_0x005a
        L_0x0495:
            r0 = 1915334294(0x7229ae96, float:3.3608978E30)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K6A r0 = (X.K6A) r0
            X.JiK r5 = X.JTT.A0Q(r0)
            X.05G r3 = r5.A03
        L_0x04a6:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.Jvd r1 = (X.C61039Jvd) r1
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
            boolean r0 = r5.A05
            r9 = r0 ^ 1
            boolean r11 = r1.A04
            boolean r8 = X.JTQ.A1X(r7)
            X.Jvd r6 = new X.Jvd
            r10 = r9
            r12 = r9
            r6.<init>((java.lang.Integer) r7, (boolean) r8, (boolean) r9, (boolean) r10, (boolean) r11, (boolean) r12)
            boolean r0 = r3.AIY(r2, r6)
            if (r0 == 0) goto L_0x04a6
            r0 = 15323188(0xe9d034, float:2.147236E-38)
            goto L_0x005a
        L_0x04cb:
            r0 = -1188323772(0xffffffffb92b9e44, float:-1.636679E-4)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            r1 = r18
            X.C51965G9l.A1W(r0, r1)
            r0 = -1266915911(0xffffffffb47c65b9, float:-2.3506335E-7)
            goto L_0x005a
        L_0x04de:
            r0 = -968546246(0xffffffffc645283a, float:-12618.057)
            int r4 = A00(r1, r0)
            r0 = 1492871299(0x58fb6883, float:2.21141034E15)
            goto L_0x005a
        L_0x04ea:
            r0 = -378188671(0xffffffffe9754c81, float:-1.8534257E25)
            int r4 = A00(r1, r0)
            r0 = -772348139(0xffffffffd1f6e715, float:-1.32554858E11)
            goto L_0x005a
        L_0x04f6:
            r0 = -702285000(0xffffffffd623fb38, float:-4.5074843E13)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K67 r1 = (X.K67) r1
            r0 = 0
            X.K67.A03(r1, r0)
            r0 = 554315899(0x210a307b, float:4.682038E-19)
            goto L_0x005a
        L_0x050a:
            r0 = 8860166(0x873206, float:1.2415737E-38)
            int r4 = A00(r1, r0)
            r0 = 646496135(0x2688bf87, float:9.488809E-16)
            goto L_0x005a
        L_0x0516:
            r0 = 701397032(0x29ce7828, float:9.1690815E-14)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.K67 r5 = (X.K67) r5
            X.0eM r0 = r5.A0Q
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.L4H r0 = X.C63209KtG.A00(r0)
            X.1QP r3 = r0.A01
            long r1 = r0.A00
            java.lang.String r0 = "PEOPLE_TAGGING_CANCELLED"
            r3.flowMarkPoint(r1, r0)
            X.DbT.A1J(r5)
            r0 = -829854630(0xffffffffce896c5a, float:-1.15278976E9)
            goto L_0x005a
        L_0x053c:
            r0 = 1272731716(0x4bdc5844, float:2.8881032E7)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.LpZ r3 = (X.C65229LpZ) r3
            X.KOP r0 = r3.A0K
            X.0Ud r5 = r0.A06
            java.lang.Object r0 = r5.getValue()
            X.JU0 r0 = (X.JU0) r0
            java.lang.Object r0 = r0.A03
            X.LE1 r0 = (X.LE1) r0
            java.lang.Integer r6 = r0.A01
            X.Jel r2 = r3.A09
            r1 = 0
            if (r2 == 0) goto L_0x0567
            boolean r0 = r2 instanceof X.KNL
            if (r0 != 0) goto L_0x0567
            X.KNM r2 = (X.KNM) r2
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r2.A03
            r0.isChecked()
        L_0x0567:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r6 != r0) goto L_0x068d
            java.lang.Object r0 = r5.getValue()
            X.JU0 r0 = (X.JU0) r0
            java.lang.Object r0 = r0.A02
            X.MXB r0 = (X.MXB) r0
            if (r0 == 0) goto L_0x057b
            java.lang.String r1 = r0.getId()
        L_0x057b:
            r7 = 0
            boolean r13 = X.AnonymousClass7TF.A1V(r1)
            X.Jel r1 = r3.A09
            if (r1 == 0) goto L_0x0590
            boolean r0 = r1 instanceof X.KNL
            if (r0 != 0) goto L_0x0590
            X.KNM r1 = (X.KNM) r1
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r1.A03
            boolean r7 = r0.isChecked()
        L_0x0590:
            r2 = r7 ^ 1
            com.instagram.common.session.UserSession r12 = r3.A0J
            X.818 r10 = X.AnonymousClass818.IG_FEED_COMPOSER_SHARE_TO_THREADS_TOGGLE_ENABLE
            if (r2 == 0) goto L_0x05c6
            X.JZY r8 = X.JZY.ONE_TIME_ON
        L_0x059a:
            X.JZZ r9 = X.JZZ.FEED
            r11 = 0
            X.LT4.A00(r8, r9, r10, r11, r12, r13)
            if (r13 != 0) goto L_0x05c9
            X.0Tu r6 = X.0Tu.A05
            r0 = 36324101790707496(0x810c9400052f28, double:3.034846465636697E-306)
            boolean r0 = X.182.A06(r6, r12, r0)
            if (r0 == 0) goto L_0x05c9
            X.7Pu r2 = X.DbW.A0T(r12)
            X.4DH r0 = r3.A0I
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.K7K r0 = new X.K7K
            r0.<init>()
            r2.A02(r1, r0)
            r0 = 709923816(0x2a5093e8, float:1.8525426E-13)
            goto L_0x005a
        L_0x05c6:
            X.JZY r8 = X.JZY.ONE_TIME_OFF
            goto L_0x059a
        L_0x05c9:
            X.0Tu r6 = X.0Tu.A05
            r0 = 36328435412385117(0x81108500003d5d, double:3.037587065435718E-306)
            boolean r0 = X.182.A06(r6, r12, r0)
            if (r0 != 0) goto L_0x05e3
            if (r7 == 0) goto L_0x064c
            r0 = 36328435412450654(0x81108500013d5e, double:3.037587065477164E-306)
            boolean r0 = X.182.A06(r6, r12, r0)
            if (r0 == 0) goto L_0x064c
        L_0x05e3:
            r9 = 2131958494(0x7f131ade, float:1.9553602E38)
            if (r2 == 0) goto L_0x05eb
            r9 = 2131958487(0x7f131ad7, float:1.9553588E38)
        L_0x05eb:
            java.lang.Object r0 = r5.getValue()
            X.JU0 r0 = (X.JU0) r0
            java.lang.Object r0 = r0.A02
            X.MXB r0 = (X.MXB) r0
            if (r0 == 0) goto L_0x0607
            X.Kiu r0 = r0.AXt()
            if (r0 == 0) goto L_0x0607
            int r1 = r0.ordinal()
            r0 = 2
            r8 = 2131958489(0x7f131ad9, float:1.9553592E38)
            if (r1 == r0) goto L_0x060a
        L_0x0607:
            r8 = 2131958488(0x7f131ad8, float:1.955359E38)
        L_0x060a:
            r7 = 2131958472(0x7f131ac8, float:1.9553557E38)
            r5 = 2131958490(0x7f131ada, float:1.9553594E38)
            if (r2 == 0) goto L_0x0618
            r7 = 2131958483(0x7f131ad3, float:1.955358E38)
            r5 = 2131958454(0x7f131ab6, float:1.955352E38)
        L_0x0618:
            X.4DH r0 = r3.A0I
            X.8ab r6 = X.Dba.A0H(r0)
            r6.A09(r9)
            if (r2 == 0) goto L_0x0626
            r6.A08(r8)
        L_0x0626:
            r1 = 5
            X.LUL r0 = new X.LUL
            r0.<init>(r1, r3, r2)
            r6.A0I(r0, r7)
            r1 = 6
            X.LUL r0 = new X.LUL
            r0.<init>(r1, r3, r2)
            r6.A0G(r0, r5)
            r5 = 2131958471(0x7f131ac7, float:1.9553555E38)
            r1 = 7
            X.LUL r0 = new X.LUL
            r0.<init>(r1, r3, r2)
            r6.A0H(r0, r5)
            X.DbT.A1V(r6)
            r0 = 1968540333(0x75558aad, float:2.7069627E32)
            goto L_0x005a
        L_0x064c:
            if (r2 == 0) goto L_0x067c
            r0 = 36324101790445348(0x810c9400012f24, double:3.0348464654709134E-306)
            boolean r0 = X.182.A06(r6, r12, r0)
            if (r0 == 0) goto L_0x067c
            X.7xL r0 = r3.A0O
            X.0xa r1 = r0.A00
            java.lang.String r0 = "PREFERENCE_SHARE_TO_BARCELONA_AUTO_POSTING"
            boolean r0 = X.DbT.A1a(r1, r0)
            if (r0 != 0) goto L_0x067c
            X.8qK r6 = r3.A0N
            X.4DH r5 = r3.A0I
            androidx.fragment.app.FragmentActivity r0 = r5.requireActivity()
            X.LEO r1 = new X.LEO
            r1.<init>(r0, r10, r12)
            r1.A01 = r5
            X.Lxf r0 = new X.Lxf
            r0.<init>(r3, r2)
            r6.A01(r11, r1, r0)
        L_0x067c:
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r12)
            X.Lfe r0 = new X.Lfe
            r0.<init>(r2)
            r1.A00(r0)
            r0 = -1585477804(0xffffffffa17f8754, float:-8.6576466E-19)
            goto L_0x005a
        L_0x068d:
            X.C65229LpZ.A03(r3, r6)
            r0 = 649430377(0x26b58569, float:1.2595559E-15)
            goto L_0x005a
        L_0x0695:
            r0 = -1751194147(0xffffffff979ee5dd, float:-1.0268536E-24)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.LpZ r3 = (X.C65229LpZ) r3
            X.KOP r0 = r3.A0K
            X.0Ud r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            X.JU0 r0 = (X.JU0) r0
            java.lang.Object r0 = r0.A03
            X.LE1 r0 = (X.LE1) r0
            java.lang.Integer r2 = r0.A01
            X.Jel r1 = r3.A09
            if (r1 == 0) goto L_0x06bf
            boolean r0 = r1 instanceof X.KNL
            if (r0 != 0) goto L_0x06bf
            X.KNM r1 = (X.KNM) r1
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r1.A03
            r0.isChecked()
        L_0x06bf:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r2 != r0) goto L_0x06c8
            r0 = 805586167(0x300444f7, float:4.8119325E-10)
            goto L_0x005a
        L_0x06c8:
            X.C65229LpZ.A03(r3, r2)
            r0 = 2117338388(0x7e340514, float:5.982185E37)
            goto L_0x005a
        L_0x06d0:
            r0 = 346155093(0x14a1e855, float:1.6348484E-26)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LpR r0 = (X.C65221LpR) r0
            X.KHY r0 = r0.A00
            if (r0 != 0) goto L_0x06e3
            java.lang.String r8 = "trialRow"
            goto L_0x0a94
        L_0x06e3:
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r0.A08
            if (r0 == 0) goto L_0x06ea
            r0.performClick()
        L_0x06ea:
            r0 = -1540474301(0xffffffffa42e3a43, float:-3.7779585E-17)
            goto L_0x005a
        L_0x06ef:
            r0 = -684831902(0xffffffffd72e4b62, float:-1.9163879E14)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.LpI r5 = (X.C65212LpI) r5
            X.KOS r0 = r5.A03
            X.3QO r1 = X.C61075JwD.A0M(r0)
            X.3QO r0 = X.AnonymousClass3QO.OPAL
            if (r1 != r0) goto L_0x0723
            boolean r0 = X.C318996ps.A01()
            if (r0 == 0) goto L_0x0723
            X.C51967G9n.A0v()
            r3 = 2131968878(0x7f13436e, float:1.9574663E38)
            r0 = 2131955586(0x7f130f82, float:1.9547704E38)
            r2 = 0
            X.GAX r1 = new X.GAX
            r1.<init>(r3, r0)
            X.MXh r0 = r5.A02
            r0.EvB(r1, r2)
        L_0x071e:
            r0 = -1521517083(0xffffffffa54f7de5, float:-1.7997043E-16)
            goto L_0x005a
        L_0x0723:
            X.MXh r0 = r5.A02
            r0.DWe()
            goto L_0x071e
        L_0x0729:
            r0 = -478917815(0xffffffffe3744b49, float:-4.5064304E21)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Lp4 r0 = (X.C65200Lp4) r0
            X.KHY r0 = r0.A00
            if (r0 != 0) goto L_0x073c
            java.lang.String r8 = "subscribersOnlyToggle"
            goto L_0x0a94
        L_0x073c:
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r0.A08
            if (r0 == 0) goto L_0x0743
            r0.performClick()
        L_0x0743:
            r0 = 1058571069(0x3f18833d, float:0.59575254)
            goto L_0x005a
        L_0x0748:
            r0 = -1648658368(0xffffffff9dbb7840, float:-4.9622823E-21)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Lp3 r0 = (X.C65199Lp3) r0
            r1 = 1
            com.instagram.common.session.UserSession r0 = r0.A02
            X.C367288qV.A02(r0, r1)
            r0 = 2015430625(0x782107e1, float:1.3064369E34)
            goto L_0x005a
        L_0x075e:
            r0 = -1950758815(0xffffffff8bb9c861, float:-7.1560905E-32)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Lp3 r0 = (X.C65199Lp3) r0
            r3 = 1
            X.8qV r2 = X.C367288qV.A01
            com.instagram.common.session.UserSession r1 = r0.A02
            java.lang.String r0 = "REELS_ROW_SHARE"
            r2.A0C(r1, r0, r3, r3)
            r0 = 1584401174(0x5e700b16, float:4.32423575E18)
            goto L_0x005a
        L_0x0778:
            r0 = -497020704(0xffffffffe26010e0, float:-1.03332166E21)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Lop r0 = (X.C65186Lop) r0
            X.MXh r0 = r0.A02
            r0.Ddh()
            r0 = 431162197(0x19b30355, float:1.8509512E-23)
            goto L_0x005a
        L_0x078d:
            r0 = 1296050948(0x4d402b04, float:2.01502784E8)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Loo r0 = (X.C65185Loo) r0
            X.KHY r0 = r0.A00
            if (r0 != 0) goto L_0x07a0
            java.lang.String r8 = "boostToggle"
            goto L_0x0a94
        L_0x07a0:
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r0.A08
            if (r0 == 0) goto L_0x07a7
            r0.performClick()
        L_0x07a7:
            r0 = -1854939604(0xffffffff916fde2c, float:-1.8922238E-28)
            goto L_0x005a
        L_0x07ac:
            r0 = 1575144695(0x5de2ccf7, float:2.04283859E18)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.Lon r6 = (X.C65184Lon) r6
            com.instagram.common.session.UserSession r0 = r6.A03
            X.27r r1 = X.27p.A01(r0)
            X.80P r0 = r6.A01
            r1.A1X(r0)
            X.KOR r1 = r6.A05
            X.JwD r0 = r1.A06()
            X.JwI r0 = r0.A01
            if (r0 == 0) goto L_0x07f3
            X.0eM r0 = r1.A04
            java.lang.Object r5 = X.AnonymousClass7TE.A14(r0)
            X.LSk r5 = (X.LSk) r5
            java.lang.String r2 = "user"
            java.lang.String r1 = "share_sheet"
            java.lang.String r0 = "tap_profile_display"
            r3 = 0
            X.LSk.A03(r5, r2, r1, r0)
            r2 = 2131969978(0x7f1347ba, float:1.9576894E38)
            r0 = 2131969977(0x7f1347b9, float:1.9576892E38)
            X.GAX r1 = new X.GAX
            r1.<init>(r2, r0)
            X.MXh r0 = r6.A04
            r0.EvB(r1, r3)
        L_0x07ee:
            r0 = 1748467539(0x68377f53, float:3.466167E24)
            goto L_0x005a
        L_0x07f3:
            X.MXh r0 = r6.A04
            r0.Da3()
            goto L_0x07ee
        L_0x07f9:
            r0 = 629708963(0x258898a3, float:2.369567E-16)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LpO r0 = (X.C65218LpO) r0
            X.KOe r1 = r0.A08
            r0 = 0
            r1.A0B(r0)
            r0 = -1701542963(0xffffffff9a9483cd, float:-6.14243E-23)
            goto L_0x005a
        L_0x080f:
            r0 = 62718718(0x3bd02fe, float:1.1109109E-36)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LpO r0 = (X.C65218LpO) r0
            X.MXh r1 = r0.A09
            X.KOe r0 = r0.A08
            X.0Ud r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.JvS r0 = (X.C61028JvS) r0
            java.lang.String r0 = r0.A01
            r1.DVF(r0)
            r0 = 612009268(0x247a8534, float:5.4322936E-17)
            goto L_0x005a
        L_0x0830:
            r0 = -1800799142(0xffffffff94a9fc5a, float:-1.7164174E-26)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LpO r0 = (X.C65218LpO) r0
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r0.A06
            if (r0 != 0) goto L_0x0843
            java.lang.String r8 = "openCarouselToggleButton"
            goto L_0x0a94
        L_0x0843:
            r0.toggle()
            r0 = -1170692013(0xffffffffba38a853, float:-7.044125E-4)
            goto L_0x005a
        L_0x084b:
            r0 = -1010604945(0xffffffffc3c3646f, float:-390.78464)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.LpF r3 = (X.C65209LpF) r3
            com.instagram.common.session.UserSession r2 = r3.A04
            X.27r r1 = X.27p.A01(r2)
            X.80P r0 = X.AnonymousClass80P.LINKS_IN_REELS
            r1.A1X(r0)
            X.27r r5 = X.27p.A01(r2)
            X.JVj r6 = X.C59725JVj.SHARE_SHEET
            com.instagram.user.model.User r0 = X.DbT.A0j(r2)
            java.lang.String r9 = r0.getId()
            X.0iw r0 = r3.A03
            java.lang.String r11 = r0.getModuleName()
            java.lang.String r7 = "REMOVE_LINK_BUTTON"
            r0 = 69
            java.lang.String r10 = X.C66579MXk.A00(r0)
            r8 = 0
            r5.A1U(r6, r7, r8, r9, r10, r11)
            X.Jg0 r0 = r3.A02
            X.2Fj r0 = r0.A01
            r0.A0B(r8)
            r0 = -923802519(0xffffffffc8efe469, float:-491299.28)
            goto L_0x005a
        L_0x088d:
            r0 = 1447418318(0x5645d9ce, float:5.4384814E13)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.LpF r6 = (X.C65209LpF) r6
            X.0sa r0 = r6.A06
            java.lang.Object r5 = r0.invoke()
            java.lang.String r5 = (java.lang.String) r5
            com.instagram.common.session.UserSession r3 = r6.A04
            X.27r r1 = X.27p.A01(r3)
            X.80P r0 = X.AnonymousClass80P.LINKS_IN_REELS
            r1.A1X(r0)
            X.27r r7 = X.27p.A01(r3)
            int r1 = r5.length()
            if (r1 != 0) goto L_0x0911
            java.lang.String r9 = "ADD_LINK_ROW"
        L_0x08b7:
            X.JVj r8 = X.C59725JVj.SHARE_SHEET
            com.instagram.user.model.User r0 = X.DbT.A0j(r3)
            java.lang.String r11 = r0.getId()
            if (r1 != 0) goto L_0x090e
            java.lang.String r12 = "add_button"
        L_0x08c5:
            X.0iw r0 = r6.A03
            java.lang.String r13 = r0.getModuleName()
            r10 = 0
            r7.A1U(r8, r9, r10, r11, r12, r13)
            X.KOg r9 = r6.A05
            X.05G r0 = r9.A06
            java.lang.Object r0 = r0.getValue()
            X.Jvk r0 = (X.C61046Jvk) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x08ea
            X.FGY r1 = r9.A00
            if (r1 == 0) goto L_0x08ea
            r0 = 207(0xcf, float:2.9E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.FGY.A04(r1, r0)
        L_0x08ea:
            X.1Av r8 = r9.A04
            r7 = 1
            X.0s0 r2 = r8.A0e
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 186(0xba, float:2.6E-43)
            X.AnonymousClass7TF.A1J(r8, r2, r1, r0, r7)
            X.C61842KOg.A00(r9)
            X.4DH r0 = r6.A01
            android.content.Context r2 = r0.requireContext()
            r1 = 11
            X.MP9 r0 = new X.MP9
            r0.<init>(r6, r1)
            X.C63214KtL.A00(r2, r3, r5, r0)
            r0 = -2063557294(0xffffffff85009d52, float:-6.047426E-36)
            goto L_0x005a
        L_0x090e:
            java.lang.String r12 = "edit_button"
            goto L_0x08c5
        L_0x0911:
            java.lang.String r9 = "EDIT_LINK_ROW"
            goto L_0x08b7
        L_0x0914:
            r0 = 1236411370(0x49b223ea, float:1459325.2)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.Lp0 r3 = (X.Lp0) r3
            X.KOM r2 = r3.A05
            X.LRK r0 = r2.A02
            X.KgC r1 = r0.A03()
            X.KgC r0 = X.C62462KgC.CLIPS
            if (r1 != r0) goto L_0x0966
            X.JwD r0 = r2.A06()
            X.JxB r0 = r0.A08
            if (r0 == 0) goto L_0x0966
            r1 = 2131961767(0x7f1327a7, float:1.956024E38)
            r0 = 2131953883(0x7f1308db, float:1.954425E38)
            X.GAX r2 = new X.GAX
            r2.<init>(r0, r1)
        L_0x093e:
            com.instagram.common.session.UserSession r0 = r3.A03
            X.27r r1 = X.27p.A01(r0)
            X.80P r0 = r3.A01
            r1.A1X(r0)
            r1 = 0
            if (r2 == 0) goto L_0x0956
            X.MXh r0 = r3.A04
            r0.EvB(r2, r1)
        L_0x0951:
            r0 = -410653788(0xffffffffe785eba4, float:-1.2648431E24)
            goto L_0x005a
        L_0x0956:
            X.KHY r0 = r3.A00
            if (r0 != 0) goto L_0x095e
            java.lang.String r8 = "labelGenAIOption"
            goto L_0x0a94
        L_0x095e:
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r0.A08
            if (r0 == 0) goto L_0x0951
            r0.performClick()
            goto L_0x0951
        L_0x0966:
            r2 = 0
            goto L_0x093e
        L_0x0968:
            r0 = -1233935727(0xffffffffb673a291, float:-3.6304448E-6)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.Lox r3 = (X.C65194Lox) r3
            com.instagram.common.session.UserSession r0 = r3.A01
            X.AE4 r1 = X.C59847JaN.A00(r0)
            java.lang.String r0 = "AUDIENCE_CONTROLS_TAPPED"
            r1.A04(r0)
            X.KOX r1 = r3.A02
            boolean r0 = X.C62915KoT.A00
            X.GAX r2 = r1.A0A(r0)
            r1 = 0
            X.MXh r0 = r3.A03
            if (r2 != 0) goto L_0x0996
            r0.CwL()
        L_0x098e:
            X.JfA r0 = r3.A00
            if (r0 != 0) goto L_0x099a
            java.lang.String r8 = "audienceRow"
            goto L_0x0a94
        L_0x0996:
            r0.EvB(r2, r1)
            goto L_0x098e
        L_0x099a:
            android.view.View r1 = r0.A06
            r0 = 8
            r1.setVisibility(r0)
            r0 = 1723149607(0x66b52d27, float:4.2779062E23)
            goto L_0x005a
        L_0x09a6:
            r0 = -8330379(0xffffffffff80e375, float:NaN)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Lol r0 = (X.C65182Lol) r0
            X.MXh r1 = r0.A02
            X.KOZ r0 = r0.A03
            X.05G r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.KO4 r0 = (X.KO4) r0
            java.lang.String r0 = r0.A00
            r1.CnS(r0)
            r0 = 2089933721(0x7c91db99, float:6.058696E36)
            goto L_0x005a
        L_0x09c7:
            r0 = 492073878(0x1d547396, float:2.8117723E-21)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.LpX r1 = (X.C65227LpX) r1
            X.MVp r0 = r1.A03
            r0.CkD()
            X.KHY r0 = r1.A00
            if (r0 != 0) goto L_0x09df
            java.lang.String r8 = "contentSchedulingSwitchCell"
            goto L_0x0a94
        L_0x09df:
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r0.A08
            if (r0 == 0) goto L_0x09e6
            r0.performClick()
        L_0x09e6:
            r0 = 2090711118(0x7c9db84e, float:6.55143E36)
            goto L_0x005a
        L_0x09eb:
            r0 = -1130302687(0xffffffffbca0f321, float:-0.019647183)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Loi r0 = (X.C65179Loi) r0
            X.MXh r2 = r0.A03
            X.4DH r1 = r0.A02
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r0 = r0.A00
            r2.Dax(r1, r0)
            r0 = 781232906(0x2e90ab0a, float:6.5787445E-11)
            goto L_0x005a
        L_0x0a04:
            r0 = 1139944996(0x43f22e24, float:484.36047)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.Lov r3 = (X.C65192Lov) r3
            com.instagram.common.session.UserSession r0 = r3.A04
            X.27r r2 = X.27p.A01(r0)
            X.80P r1 = r3.A02
            X.Kka r0 = r3.A01
            r2.A1B(r0, r1)
            X.MXh r0 = r3.A05
            r0.DWK()
            r0 = -612854545(0xffffffffdb7894ef, float:-6.9969548E16)
            goto L_0x005a
        L_0x0a26:
            r0 = -769557176(0xffffffffd2217d48, float:-1.73397901E11)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.LpB r5 = (X.C65205LpB) r5
            X.KOc r2 = r5.A07
            X.JwD r1 = r2.A06()
            r0 = -268435457(0xffffffffefffffff, float:-1.5845632E29)
            X.JwD r0 = X.C61075JwD.A00((X.AnonymousClass9J6) null, (X.C61080JwI) null, (X.C61066Jw4) null, (X.C59721JVf) null, (X.C61046Jvk) null, (X.C61077JwF) null, (X.C61079JwH) null, (X.C61062Jw0) null, (X.C61100JxB) null, (com.instagram.api.schemas.MediaGenAIDetectionMethod) null, (X.C61000Juw) null, (X.Jv3) null, r1, (X.AnonymousClass3QO) null, (com.instagram.model.venue.Venue) null, (com.instagram.music.common.model.AudioOverlayTrack) null, (com.instagram.pendingmedia.model.ClipInfo) null, (X.C272024jy) null, (com.instagram.user.model.UpcomingEvent) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (X.0eP) null, r0, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false)
            r2.A09(r0)
            X.JfA r0 = r5.A00
            java.lang.String r8 = "bioRow"
            r3 = 0
            if (r0 == 0) goto L_0x0a94
            r0.A0D()
            X.JfA r2 = r5.A00
            if (r2 == 0) goto L_0x0a94
            X.4DH r1 = r5.A04
            r0 = 2131973076(0x7f1353d4, float:1.9583178E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setTitle(r0)
            X.JfA r0 = r5.A00
            if (r0 == 0) goto L_0x0a94
            r0.setSubtitle(r3)
            r0 = -1998129061(0xffffffff88e6f85b, float:-1.390101E-33)
            goto L_0x005a
        L_0x0a67:
            r0 = 1559511899(0x5cf4435b, float:5.5003162E17)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.LpB r3 = (X.C65205LpB) r3
            X.KOc r9 = r3.A07
            X.KkS r7 = r3.A02
            r8 = 0
            X.0qQ.A0B(r7, r8)
            com.instagram.common.session.UserSession r5 = r9.A02
            X.1Av r10 = X.1Au.A00(r5)
            X.KkS r0 = X.C62666KkS.BIO_IG_REELS
            r6 = 1
            if (r7 != r0) goto L_0x0a9c
            X.0s0 r2 = r10.A78
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 412(0x19c, float:5.77E-43)
        L_0x0a8b:
            X.AnonymousClass7TF.A1J(r10, r2, r1, r0, r6)
            X.JfA r0 = r3.A00
            if (r0 != 0) goto L_0x0aa3
            java.lang.String r8 = "bioRow"
        L_0x0a94:
            X.0qQ.A0F(r8)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0a9c:
            X.0s0 r2 = r10.A7f
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 411(0x19b, float:5.76E-43)
            goto L_0x0a8b
        L_0x0aa3:
            android.view.View r1 = r0.A06
            r0 = 8
            r1.setVisibility(r0)
            X.JbO r0 = r3.A06
            X.0Aj r1 = X.C59899JbO.A01(r7, r0)
            java.lang.String r0 = "seller_click_add_purchase_button"
            X.DbS.A1I(r1, r0)
            r1.Cgf()
            com.instagram.common.session.UserSession r2 = r3.A05
            X.AE4 r1 = X.C59847JaN.A00(r2)
            java.lang.String r0 = "SELL_PRODUCT_ROW_TAPPED"
            r1.A04(r0)
            X.27r r1 = X.27p.A01(r2)
            X.80P r0 = r3.A03
            r1.A1X(r0)
            com.instagram.bloks.hosting.IgBloksScreenConfig r6 = X.DbS.A0N(r2)
            r0 = 550(0x226, float:7.71E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A0R = r0
            X.4DH r0 = r3.A04
            android.content.Context r3 = r0.requireContext()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317358692242511(0x8106720008144f, double:3.030582103015162E-306)
            java.lang.Boolean r2 = X.AnonymousClass7TF.A0R(r2, r5, r0)
            r1 = 0
            X.LDg r5 = new X.LDg
            r5.<init>(r3)
            java.util.Map r3 = r5.A02
            r0 = 1919(0x77f, float:2.689E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.put(r0, r2)
            X.05G r11 = r9.A06
            java.lang.Object r0 = r11.getValue()
            X.JwI r0 = (X.C61080JwI) r0
            java.lang.Object r0 = r0.A00
            X.Juw r0 = (X.C61000Juw) r0
            if (r0 == 0) goto L_0x0b61
            java.lang.String r2 = r0.A03
        L_0x0b0a:
            java.lang.String r0 = "currency_code"
            r3.put(r0, r2)
            java.lang.Object r0 = r11.getValue()
            X.JwI r0 = (X.C61080JwI) r0
            java.lang.Object r0 = r0.A00
            X.Juw r0 = (X.C61000Juw) r0
            if (r0 == 0) goto L_0x0b5f
            java.lang.String r10 = r0.A05
        L_0x0b1d:
            java.util.Map r2 = r5.A01
            r0 = 1460(0x5b4, float:2.046E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.put(r0, r10)
            java.lang.Object r0 = r11.getValue()
            X.JwI r0 = (X.C61080JwI) r0
            java.lang.Object r0 = r0.A00
            X.Juw r0 = (X.C61000Juw) r0
            if (r0 == 0) goto L_0x0b36
            java.lang.String r1 = r0.A04
        L_0x0b36:
            java.lang.String r0 = "initial_price"
            r2.put(r0, r1)
            r0 = 5
            X.JK3 r1 = new X.JK3
            r1.<init>(r9, r0)
            X.MBL r0 = new X.MBL
            r0.<init>(r8, r5, r1)
            X.Q3B r1 = new X.Q3B
            r1.<init>(r0)
            java.lang.String r0 = "callback"
            r2.put(r0, r1)
            java.lang.String r1 = r7.A00
            java.lang.String r0 = "entrypoint"
            r3.put(r0, r1)
            r5.A00(r6)
            r0 = 1437375932(0x55ac9dbc, float:2.3724183E13)
            goto L_0x005a
        L_0x0b5f:
            r10 = r1
            goto L_0x0b1d
        L_0x0b61:
            r2 = r1
            goto L_0x0b0a
        L_0x0b63:
            r0 = 1246041307(0x4a4514db, float:3228982.8)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.LpA r5 = (X.C65204LpA) r5
            com.instagram.common.session.UserSession r0 = r5.A04
            X.27r r1 = X.27p.A01(r0)
            X.80P r0 = r5.A01
            r1.A1X(r0)
            X.KOG r0 = r5.A06
            X.JwD r0 = r0.A06()
            X.JxB r0 = r0.A08
            if (r0 == 0) goto L_0x0ba5
            r3 = 2131961765(0x7f1327a5, float:1.9560236E38)
            r0 = 2131953881(0x7f1308d9, float:1.9544246E38)
            r2 = 0
            X.GAX r1 = new X.GAX
            r1.<init>(r0, r3)
            X.MXh r0 = r5.A05
            r0.EvB(r1, r2)
        L_0x0b94:
            X.1Av r5 = r5.A07
            r3 = 1
            X.0s0 r2 = r5.A0c
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 187(0xbb, float:2.62E-43)
            X.AnonymousClass7TF.A1J(r5, r2, r1, r0, r3)
            r0 = 938424845(0x37ef3a0d, float:2.8518052E-5)
            goto L_0x005a
        L_0x0ba5:
            X.MXh r0 = r5.A05
            r0.Cwv()
            goto L_0x0b94
        L_0x0bab:
            r0 = 957533245(0x3912cc3d, float:1.399973E-4)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.Lp8 r3 = (X.C65203Lp8) r3
            X.KOl r2 = r3.A04
            X.JwD r1 = r2.A06()
            r0 = 0
            X.GAX r2 = X.C61846KOl.A00(r2, r1, r0)
            if (r2 != 0) goto L_0x0bcd
            X.MXh r0 = r3.A03
            r0.CwL()
        L_0x0bc8:
            r0 = -311724673(0xffffffffed6b757f, float:-4.5544388E27)
            goto L_0x005a
        L_0x0bcd:
            X.MXh r1 = r3.A03
            r0 = 0
            r1.EvB(r2, r0)
            goto L_0x0bc8
        L_0x0bd4:
            r0 = 1956293380(0x749aab04, float:9.803251E31)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.KB9 r0 = (X.KB9) r0
            X.K4p r0 = r0.A04
            X.DbX.A1J(r0)
            r0 = -130439039(0xfffffffff839a881, float:-1.5062384E34)
            goto L_0x005a
        L_0x0be9:
            r1.performClick()
            r1 = -916337433(0xffffffffc961cce7, float:-924878.44)
            goto L_0x0fc4
        L_0x0bf1:
            X.3Q2 r2 = r1.A06
            if (r2 == 0) goto L_0x0bf9
            X.Jw0 r1 = r1.A03
            r2.A0q = r1
        L_0x0bf9:
            X.Dbb.A0z(r3)
            r1 = 514821987(0x1eaf8f63, float:1.8588149E-20)
            goto L_0x0fc4
        L_0x0c01:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r3)
            throw r1
        L_0x0c06:
            r0 = 656909090(0x2727a322, float:2.326434E-15)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.KQW r1 = (X.KQW) r1
            X.MtU r0 = X.JTT.A0U(r1)
            r0.A0F()
            androidx.fragment.app.FragmentActivity r4 = r1.requireActivity()
            com.instagram.common.session.UserSession r3 = r1.A0D()
            X.2EG r2 = X.2EG.A1f
            java.lang.String r1 = "encrypted_backups_gdrive_restore_flow_2"
            r0 = 324(0x144, float:4.54E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.FH7.A08(r4, r3, r2, r0, r1)
            r0 = -2115925316(0xffffffff81e18abc, float:-8.285102E-38)
            goto L_0x0e75
        L_0x0c32:
            r0 = 1799579763(0x6b436873, float:2.3623378E26)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.KQW r3 = (X.KQW) r3
            X.MtU r0 = X.JTT.A0U(r3)
            X.NUa r2 = r0.A03
            java.lang.String r0 = "RESTORE_LANDING_NUX_SYNC_NOW_TAP"
            r2.A0B(r0)
            java.lang.String r1 = "RESTORE_TYPE"
            java.lang.String r0 = "GDRIVE"
            r2.A0D(r1, r0)
            r0 = 0
            r3.A0M(r0)
            r0 = -1674695175(0xffffffff9c2e2df9, float:-5.763119E-22)
            goto L_0x0e75
        L_0x0c58:
            r0 = 166805435(0x9f13fbb, float:5.807857E-33)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.KQV r1 = (X.KQV) r1
            X.MtU r0 = X.JTT.A0T(r1)
            r0.A0F()
            androidx.fragment.app.FragmentActivity r4 = r1.requireActivity()
            com.instagram.common.session.UserSession r3 = r1.A0D()
            X.2EG r2 = X.2EG.A1f
            java.lang.String r1 = "encrypted_backups_gdrive_restore_flow"
            r0 = 324(0x144, float:4.54E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.FH7.A08(r4, r3, r2, r0, r1)
            r0 = 361183002(0x1587371a, float:5.4613E-26)
            goto L_0x0e75
        L_0x0c84:
            r0 = 2125906157(0x7eb6c0ed, float:1.2146061E38)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.KQV r3 = (X.KQV) r3
            X.MtU r0 = X.JTT.A0T(r3)
            X.NUa r2 = r0.A03
            java.lang.String r0 = "RESTORE_LANDING_NUX_SYNC_NOW_TAP"
            r2.A0B(r0)
            java.lang.String r1 = "RESTORE_TYPE"
            java.lang.String r0 = "GDRIVE"
            r2.A0D(r1, r0)
            r0 = 0
            r3.A0M(r0)
            r0 = 464877457(0x1bb57791, float:3.0021206E-22)
            goto L_0x0e75
        L_0x0caa:
            r0 = 270070900(0x1018f474, float:3.0165034E-29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.9i2 r5 = (X.C384879i2) r5
            androidx.fragment.app.FragmentActivity r6 = r5.getActivity()
            if (r6 == 0) goto L_0x0cfb
            X.0eM r1 = r5.A0d
            java.lang.Object r1 = r1.getValue()
            X.JgG r1 = (X.C60135JgG) r1
            X.0Ud r1 = r1.A02
            java.lang.Object r2 = r1.getValue()
            java.util.Collection r2 = (java.util.Collection) r2
            r1 = 0
            android.os.Bundle r4 = X.DbV.A0B(r2, r1)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1D(r2)
            java.lang.String r1 = "emoji_pong_users"
            r4.putParcelableArrayList(r1, r2)
            X.K8E r3 = new X.K8E
            r3.<init>()
            r3.setArguments(r4)
            X.0eM r1 = r5.A0b
            X.7Pr r2 = X.DbX.A0f(r1)
            r1 = 2131961599(0x7f1326ff, float:1.95599E38)
            java.lang.String r1 = r5.getString(r1)
            r2.A0d = r1
            r1 = 10
            X.C65745Lyz.A00(r2, r5, r1)
            X.DbU.A0y(r6, r3, r2)
            r1 = 1
            r5.A0T = r1
        L_0x0cfb:
            r1 = 302719358(0x120b217e, float:4.390195E-28)
            goto L_0x0fc4
        L_0x0d00:
            r0 = -1495733938(0xffffffffa6d8e94e, float:-1.5051248E-15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.7GV r2 = (X.AnonymousClass7GV) r2
            X.05G r1 = r2.A08
            boolean r1 = X.DbX.A1b(r1)
            if (r1 == 0) goto L_0x0d61
            X.7GX r1 = r2.A01
            int r11 = X.AnonymousClass7GV.A00(r2)
            java.lang.String r4 = X.AnonymousClass7GV.A01(r2)
            java.lang.String r5 = X.AnonymousClass7GV.A02(r2)
            com.instagram.common.session.UserSession r3 = r1.A00
            java.lang.String r6 = "decline_chat_moderator"
            java.lang.String r7 = "tap"
            java.lang.String r8 = "decline_invite_button"
            java.lang.String r9 = "thread_view"
            r10 = 0
            X.C69871NtZ.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.instagram.common.session.UserSession r5 = r2.A00
            java.lang.String r3 = X.AnonymousClass7GV.A01(r2)
            X.AnonymousClass7GV.A02(r2)
            X.AnonymousClass7GV.A00(r2)
            r1 = 22
            X.KAf r4 = new X.KAf
            r4.<init>(r2, r1)
            if (r3 == 0) goto L_0x0d61
            X.1NY r2 = X.AnonymousClass7TG.A0a(r5)
            java.lang.String r1 = "direct_v2/decline_moderator_invite_to_channel/"
            r2.A0A(r1)
            java.lang.String r1 = "thread_id"
            X.DbX.A1M(r2, r1, r3)
            X.1OC r3 = r2.A0M()
            r2 = 2
            X.NHh r1 = new X.NHh
            r1.<init>(r4, r5, r2)
            r3.A00 = r1
            X.1ES.A03(r3)
        L_0x0d61:
            r1 = 587631949(0x23068d4d, float:7.294076E-18)
            goto L_0x0fc4
        L_0x0d66:
            r0 = -700156620(0xffffffffd6447534, float:-5.4001916E13)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.KPi r1 = (X.C61869KPi) r1
            r0 = 0
            X.C61869KPi.A01(r1, r0)
            r0 = -1806057894(0xffffffff9459be5a, float:-1.09932405E-26)
            goto L_0x0e75
        L_0x0d7a:
            r0 = -1975280031(0xffffffff8a439e61, float:-9.418696E-33)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.KPi r1 = (X.C61869KPi) r1
            r0 = 1
            X.C61869KPi.A01(r1, r0)
            r0 = -2098418708(0xffffffff82ecabec, float:-3.4775762E-37)
            goto L_0x0e75
        L_0x0d8e:
            r0 = 1665009986(0x633e0942, float:3.5055485E21)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.KPi r1 = (X.C61869KPi) r1
            r0 = 0
            X.C61869KPi.A01(r1, r0)
            r0 = 1823943714(0x6cb72c22, float:1.7715347E27)
            goto L_0x0e75
        L_0x0da2:
            r0 = -219763011(0xfffffffff2e6aebd, float:-9.138278E30)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.KPi r1 = (X.C61869KPi) r1
            r0 = 1
            X.C61869KPi.A01(r1, r0)
            r0 = 1423302006(0x54d5dd76, float:7.3483483E12)
            goto L_0x0e75
        L_0x0db6:
            r0 = -357936694(0xffffffffeaaa51ca, float:-1.0295181E26)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.KPi r1 = (X.C61869KPi) r1
            r0 = 0
            X.C61869KPi.A01(r1, r0)
            r0 = -1042061174(0xffffffffc1e3688a, float:-28.426044)
            goto L_0x0e75
        L_0x0dca:
            r0 = -934560335(0xffffffffc84bbdb1, float:-208630.77)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.KPi r1 = (X.C61869KPi) r1
            r0 = 1
            X.C61869KPi.A01(r1, r0)
            r0 = -1767467176(0xffffffff96a69758, float:-2.6914258E-25)
            goto L_0x0e75
        L_0x0dde:
            r0 = -804232660(0xffffffffd010622c, float:-9.6894116E9)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.K6A r4 = (X.K6A) r4
            X.JiK r3 = X.JTT.A0Q(r4)
            android.content.Context r0 = r4.requireContext()
            X.82q r2 = X.JTU.A0L(r0)
            X.3Q2 r1 = X.JTT.A0f(r4)
            X.JWG r0 = r4.A08
            if (r0 == 0) goto L_0x0e04
            r3.A01(r0, r2, r1)
            r0 = 941644598(0x38205b36, float:3.823192E-5)
            goto L_0x0e75
        L_0x0e04:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -994443926(0xffffffffc4b9fd6a, float:-1487.9192)
            goto L_0x0e80
        L_0x0e0c:
            r0 = 1270894483(0x4bc04f93, float:2.5206566E7)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.K6A r4 = (X.K6A) r4
            X.JiK r3 = X.JTT.A0Q(r4)
            android.content.Context r0 = r4.requireContext()
            X.82q r2 = X.JTU.A0L(r0)
            X.3Q2 r1 = X.JTT.A0f(r4)
            X.JWG r0 = r4.A08
            if (r0 == 0) goto L_0x0e32
            r3.A01(r0, r2, r1)
            r0 = 814238499(0x30884b23, float:9.916657E-10)
            goto L_0x0e75
        L_0x0e32:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 1955735821(0x7492290d, float:9.264013E31)
            goto L_0x0e80
        L_0x0e3a:
            r0 = -690250236(0xffffffffd6db9e04, float:-1.20735859E14)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K6A r0 = (X.K6A) r0
            X.JiK r0 = X.JTT.A0Q(r0)
            r0.A00()
            r0 = 155650734(0x9470aae, float:2.3958775E-33)
            goto L_0x0e75
        L_0x0e50:
            r0 = -2018188544(0xffffffff87b4e300, float:-2.7216808E-34)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.K6A r4 = (X.K6A) r4
            X.JiK r3 = X.JTT.A0Q(r4)
            android.content.Context r0 = r4.requireContext()
            X.82q r2 = X.JTU.A0L(r0)
            X.3Q2 r1 = X.JTT.A0f(r4)
            X.JWG r0 = r4.A08
            if (r0 == 0) goto L_0x0e79
            r3.A01(r0, r2, r1)
            r0 = 1167169305(0x45919719, float:4658.887)
        L_0x0e75:
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        L_0x0e79:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 462927777(0x1b97b7a1, float:2.5099522E-22)
        L_0x0e80:
            X.AnonymousClass0fD.A0C(r0, r5)
            throw r1
        L_0x0e84:
            r0 = 996410999(0x3b640677, float:0.0034793892)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.LpU r2 = (X.C65224LpU) r2
            X.4DH r3 = r2.A01
            androidx.fragment.app.FragmentActivity r1 = r3.getActivity()
            if (r1 == 0) goto L_0x0e9e
            X.MXh r2 = r2.A04
            X.818 r1 = X.AnonymousClass818.IG_REELS_COMPOSER_SHARE_TO_FACEBOOK_ROW
            r2.DEv(r1, r3)
        L_0x0e9e:
            r1 = -678491377(0xffffffffd78f0b0f, float:-3.14555318E14)
            goto L_0x0fc4
        L_0x0ea3:
            r0 = -1958794854(0xffffffff8b3f299a, float:-3.681656E-32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.LpU r1 = (X.C65224LpU) r1
            X.4DH r1 = r1.A01
            androidx.fragment.app.FragmentActivity r1 = r1.getActivity()
            if (r1 == 0) goto L_0x0ec9
            X.8ab r2 = X.DbS.A0X(r1)
            r1 = 2131963720(0x7f132f48, float:1.9564201E38)
            r2.A09(r1)
            r1 = 2131963719(0x7f132f47, float:1.95642E38)
            r2.A08(r1)
            X.Dba.A1L(r2)
        L_0x0ec9:
            r1 = 473331656(0x1c3677c8, float:6.037356E-22)
            goto L_0x0fc4
        L_0x0ece:
            r0 = 1906759225(0x71a6d639, float:1.6522717E30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Lp3 r2 = (X.C65199Lp3) r2
            X.4DH r3 = r2.A01
            androidx.fragment.app.FragmentActivity r1 = r3.getActivity()
            if (r1 == 0) goto L_0x0ee8
            X.MXh r2 = r2.A03
            X.818 r1 = X.AnonymousClass818.IG_REELS_COMPOSER_SHARE_TO_FACEBOOK_ROW
            r2.DEv(r1, r3)
        L_0x0ee8:
            r1 = -1785576210(0xffffffff959244ee, float:-5.907768E-26)
            goto L_0x0fc4
        L_0x0eed:
            r0 = -1452177762(0xffffffffa971869e, float:-5.362951E-14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Lp3 r1 = (X.C65199Lp3) r1
            X.4DH r1 = r1.A01
            androidx.fragment.app.FragmentActivity r1 = r1.getActivity()
            if (r1 == 0) goto L_0x0f13
            X.8ab r2 = X.DbS.A0X(r1)
            r1 = 2131963720(0x7f132f48, float:1.9564201E38)
            r2.A09(r1)
            r1 = 2131963719(0x7f132f47, float:1.95642E38)
            r2.A08(r1)
            X.Dba.A1L(r2)
        L_0x0f13:
            r1 = 870985357(0x33ea2e8d, float:1.0904942E-7)
            goto L_0x0fc4
        L_0x0f18:
            r0 = 2125916595(0x7eb6e9b3, float:1.2156647E38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Loh r1 = (X.C65178Loh) r1
            com.instagram.common.session.UserSession r2 = r1.A00
            X.KPE r1 = new X.KPE
            r1.<init>()
            X.C59888JbD.A01(r2, r1)
            r1 = -92506817(0xfffffffffa7c753f, float:-3.2770921E35)
            goto L_0x0fc4
        L_0x0f32:
            r0 = -1434024008(0xffffffffaa8687b8, float:-2.3897355E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Lp7 r1 = (X.C65202Lp7) r1
            X.MXh r2 = r1.A03
            X.4DH r1 = r1.A01
            r2.Cug(r1)
            r1 = -2087090682(0xffffffff83998606, float:-9.023302E-37)
            goto L_0x0fc4
        L_0x0f48:
            r0 = -1436260290(0xffffffffaa64683e, float:-2.0286634E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K55 r1 = (X.K55) r1
            X.K55.A00(r1)
            r1 = 943749696(0x38407a40, float:4.589022E-5)
            goto L_0x0fc4
        L_0x0f5a:
            r0 = -572463833(0xffffffffdde0e527, float:-2.02567521E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K55 r1 = (X.K55) r1
            X.K55.A00(r1)
            r1 = -1619976692(0xffffffff9f711e0c, float:-5.105859E-20)
            goto L_0x0fc4
        L_0x0f6c:
            r0 = -130317608(0xfffffffff83b82d8, float:-1.5212708E34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.Dbb.A0z(r1)
            r1 = -652558928(0xffffffffd91abdb0, float:-2.72223188E15)
            goto L_0x0fc4
        L_0x0f7e:
            r0 = 281458179(0x10c6b603, float:7.8377663E-29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Jkt r2 = (X.C60400Jkt) r2
            X.L4J r1 = r2.A02
            com.instagram.common.session.UserSession r4 = r1.A01
            java.lang.String r6 = "VIDEO_COMPOSER"
            X.0iw r3 = r1.A00
            java.lang.String r5 = "suggested_fundraiser_see_more_pill"
            r7 = 0
            r8 = r7
            X.LTM.A07(r3, r4, r5, r6, r7, r8)
            X.L0z r1 = r2.A01
            X.KHV r1 = r1.A00
            X.LpT r1 = X.C65223LpT.A00(r1)
            X.MXh r2 = r1.A05
            X.4DH r1 = r1.A03
            r2.Cu6(r1)
            r1 = 70989310(0x43b35fe, float:2.2006536E-36)
            goto L_0x0fc4
        L_0x0fab:
            r0 = 304881314(0x122c1ea2, float:5.431139E-28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.L9g r1 = (X.C63851L9g) r1
            X.KB9 r2 = r1.A02
            X.K4p r1 = r2.A04
            androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
            X.C2604245p.A01(r1, r2)
            r1 = 1629148069(0x611ad3a5, float:1.7850307E20)
        L_0x0fc4:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LYD.onClick(android.view.View):void");
    }

    public static int A00(LYD lyd, int i) {
        int A05 = AnonymousClass0fD.A05(i);
        K67 k67 = (K67) lyd.A01;
        if (K67.A06(k67)) {
            k67.DLd();
            return A05;
        }
        K67.A03(k67, false);
        return A05;
    }
}

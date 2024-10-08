package X;

import android.view.View;

public final class LY4 implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public LY4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static LY4 A00(Object obj, int i) {
        return new LY4(obj, i);
    }

    public static void A01(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new LY4(obj, i), view);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: X.Jyn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: X.Jyn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v86, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v337, resolved type: X.Jyn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: X.Jyn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: X.Jyn} */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x143a: MOVE  (r1v16 com.instagram.igds.components.bottomsheet.BottomSheetFragment) = 
          (r1v15 com.instagram.igds.components.bottomsheet.BottomSheetFragment)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02de  */
    public final void onClick(android.view.View r32) {
        /*
            r31 = this;
            r1 = r31
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x146c;
                case 1: goto L_0x1417;
                case 2: goto L_0x14c5;
                case 3: goto L_0x1407;
                case 4: goto L_0x13ea;
                case 5: goto L_0x13d0;
                case 6: goto L_0x13a9;
                case 7: goto L_0x1382;
                case 8: goto L_0x0db2;
                case 9: goto L_0x0d99;
                case 10: goto L_0x0d7b;
                case 11: goto L_0x0d62;
                case 12: goto L_0x0d49;
                case 13: goto L_0x0d30;
                case 14: goto L_0x0d17;
                case 15: goto L_0x0cfe;
                case 16: goto L_0x0ce5;
                case 17: goto L_0x0ccc;
                case 18: goto L_0x0cb3;
                case 19: goto L_0x0c85;
                case 20: goto L_0x0c3b;
                case 21: goto L_0x0c1a;
                case 22: goto L_0x0b9e;
                case 23: goto L_0x0b6e;
                case 24: goto L_0x0b33;
                case 25: goto L_0x0a9b;
                case 26: goto L_0x0a64;
                case 27: goto L_0x0160;
                case 28: goto L_0x0a51;
                case 29: goto L_0x0a38;
                case 30: goto L_0x05e3;
                case 31: goto L_0x148a;
                case 32: goto L_0x09e5;
                case 33: goto L_0x00b6;
                case 34: goto L_0x0952;
                case 35: goto L_0x08d6;
                case 36: goto L_0x0872;
                case 37: goto L_0x0837;
                case 38: goto L_0x07bf;
                case 39: goto L_0x050f;
                case 40: goto L_0x043f;
                case 41: goto L_0x03fd;
                case 42: goto L_0x0036;
                case 43: goto L_0x03d5;
                case 44: goto L_0x1364;
                case 45: goto L_0x00fb;
                case 46: goto L_0x03ae;
                case 47: goto L_0x133d;
                case 48: goto L_0x1316;
                case 49: goto L_0x12fd;
                case 50: goto L_0x12e0;
                case 51: goto L_0x1290;
                case 52: goto L_0x125f;
                case 53: goto L_0x1203;
                case 54: goto L_0x11ac;
                case 55: goto L_0x1126;
                case 56: goto L_0x1048;
                case 57: goto L_0x1009;
                case 58: goto L_0x0f98;
                case 59: goto L_0x0f65;
                case 60: goto L_0x0186;
                case 61: goto L_0x0eef;
                case 62: goto L_0x0ed5;
                case 63: goto L_0x0e9f;
                case 64: goto L_0x0e28;
                case 65: goto L_0x0e15;
                case 66: goto L_0x0e02;
                case 67: goto L_0x0df1;
                case 68: goto L_0x0de0;
                case 69: goto L_0x0dcf;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = 799253051(0x2fa3a23b, float:2.97648E-10)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.K6O r3 = (X.K6O) r3
            X.861 r0 = r3.A04
            java.lang.String r8 = "videoPlaybackViewModel"
            if (r0 == 0) goto L_0x14c1
            X.2Fj r0 = r0.A0A
            java.lang.Object r2 = r0.A02()
            X.8YU r1 = X.AnonymousClass8YU.PLAYING
            X.861 r0 = r3.A04
            if (r2 != r1) goto L_0x0030
            if (r0 == 0) goto L_0x14c1
            r0.A01()
        L_0x0029:
            r0 = 1759547706(0x68e0913a, float:8.4839124E24)
        L_0x002c:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x0030:
            if (r0 == 0) goto L_0x14c1
            r0.A03()
            goto L_0x0029
        L_0x0036:
            r0 = 288782319(0x113677ef, float:1.4394226E-28)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r5 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r5
            X.861 r0 = r5.A0j
            java.lang.String r8 = "videoPlaybackViewModel"
            if (r0 == 0) goto L_0x14c1
            r0.A01()
            boolean r0 = r32.isActivated()
            if (r0 == 0) goto L_0x00a9
            X.861 r0 = r5.A0j
            if (r0 == 0) goto L_0x14c1
            X.863 r0 = X.JTP.A0Z(r0)
            if (r0 == 0) goto L_0x007e
            int r1 = r0.CEG()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x007e
            X.8RF r3 = r5.A0d
            if (r3 == 0) goto L_0x1487
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r5.A0Z
            if (r0 == 0) goto L_0x1481
            X.836 r0 = r0.A0O
            X.05G r0 = r0.A02
            java.lang.Object r2 = r0.getValue()
            X.831 r2 = (X.AnonymousClass831) r2
            long r0 = (long) r1
            int r0 = r2.A02(r0)
            X.JTP.A1N(r3, r0)
        L_0x007e:
            X.27r r0 = X.JTQ.A0I(r5)
            X.29R r3 = r0.A09
            X.1Ln r2 = X.JTO.A0N(r3)
            X.4yP r1 = r3.A0J()
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x00a5
            if (r1 == 0) goto L_0x00a5
            X.JTO.A1V(r2)
            java.lang.String r0 = "TIMELINE_EDIT_VIDEO_BUTTON_TAP"
            r2.A0r(r0)
            X.29R.A00(r2, r3)
            X.JTT.A1D(r2, r1, r3)
            r2.Cgf()
        L_0x00a5:
            r0 = 1261912148(0x4b374054, float:1.2009556E7)
            goto L_0x002c
        L_0x00a9:
            X.LRJ r2 = X.LRJ.A02
            android.content.Context r1 = r5.requireContext()
            r0 = 2131955917(0x7f1310cd, float:1.9548375E38)
            r2.A01(r1, r0)
            goto L_0x00a5
        L_0x00b6:
            r0 = -1787679600(0xffffffff95722c90, float:-4.8906664E-26)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r1 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r1
            X.8RF r0 = r1.A0d
            if (r0 == 0) goto L_0x1487
            X.JTR.A1M(r0)
            X.KMS r0 = r1.A0E
            if (r0 == 0) goto L_0x1484
            r0.A0D()
            X.27r r0 = X.JTQ.A0I(r1)
            X.29R r3 = r0.A09
            X.1Ln r2 = X.JTO.A0N(r3)
            X.4yP r1 = r3.A0J()
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x00f6
            if (r1 == 0) goto L_0x00f6
            X.JTO.A1V(r2)
            java.lang.String r0 = "TIMELINE_BACK_BUTTON_TAP"
            r2.A0r(r0)
            X.29R.A00(r2, r3)
            X.JTT.A1D(r2, r1, r3)
            r2.Cgf()
        L_0x00f6:
            r0 = -1766960252(0xffffffff96ae5384, float:-2.8163922E-25)
            goto L_0x002c
        L_0x00fb:
            r0 = 114867170(0x6d8bbe2, float:8.152624E-35)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r5 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r5
            X.8RF r0 = r5.A0d
            java.lang.String r8 = "clipsTimelineEditorViewModel"
            if (r0 == 0) goto L_0x14c1
            X.8RH r2 = r0.A0E()
            boolean r0 = r2 instanceof X.C355868Rr
            if (r0 == 0) goto L_0x014e
            X.Jfo r0 = r5.A0h
            if (r0 == 0) goto L_0x0b6a
            X.0Ud r0 = r0.A0j
            boolean r1 = X.JTR.A1a(r0)
            r0 = 1
            if (r1 != r0) goto L_0x0153
            X.8RF r1 = r5.A0d
            if (r1 == 0) goto L_0x14c1
            X.8Rr r2 = (X.C355868Rr) r2
            int r4 = r2.A00
            X.8RR r0 = new X.8RR
            r0.<init>(r4)
            r1.A0G(r0)
            X.8M1 r2 = r5.A0e
            if (r2 == 0) goto L_0x094e
            X.861 r0 = r5.A0j
            if (r0 == 0) goto L_0x0c81
            int r1 = r0.A00()
            X.0eP r0 = r2.A0E(r4)
            java.lang.Integer r0 = X.AnonymousClass8M1.A01(r0, r1)
            if (r0 == 0) goto L_0x014e
            int r0 = r0.intValue()
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A0D(r5, r0)
        L_0x014e:
            r0 = 2119988502(0x7e5c7516, float:7.3259526E37)
            goto L_0x137e
        L_0x0153:
            X.LRJ r2 = X.LRJ.A02
            android.content.Context r1 = r5.requireContext()
            r0 = 2131955924(0x7f1310d4, float:1.954839E38)
            r2.A01(r1, r0)
            goto L_0x014e
        L_0x0160:
            r0 = 978346666(0x3a5062aa, float:7.9492724E-4)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r1 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r1
            boolean r0 = com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A0K(r1)
            if (r0 != 0) goto L_0x0181
            X.Jfo r0 = r1.A0h
            if (r0 != 0) goto L_0x0179
            java.lang.String r7 = "stackedTimelineViewModel"
            goto L_0x1500
        L_0x0179:
            X.861 r0 = r0.A0K
            r0.A01()
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A09(r1)
        L_0x0181:
            r0 = -1924951461(0xffffffff8d43925b, float:-6.0265183E-31)
            goto L_0x137e
        L_0x0186:
            r0 = 1372379432(0x51ccd928, float:1.09977076E11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r1.A01
            X.Lgf r8 = (X.C64707Lgf) r8
            java.lang.Integer r1 = X.C64707Lgf.A02(r8)
            if (r1 == 0) goto L_0x019f
            X.C64707Lgf.A04(r8, r1)
            r1 = -357024777(0xffffffffeab83bf7, float:-1.1136276E26)
            goto L_0x1403
        L_0x019f:
            X.8RF r7 = r8.A06
            X.8RH r2 = r7.A0E()
            boolean r1 = r2 instanceof X.C355868Rr
            if (r1 == 0) goto L_0x03a3
            X.8Rr r2 = (X.C355868Rr) r2
            int r6 = r2.A00
            X.8RL r2 = r8.A05
            r9 = 1
            X.Jyf r1 = new X.Jyf
            r1.<init>(r6, r9)
            r2.A0F(r1)
            int r10 = X.C64707Lgf.A00(r8)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r5 = r8.A03
            X.831 r1 = X.JTQ.A0K(r5)
            if (r1 == 0) goto L_0x02c8
            X.51M r4 = X.JTO.A0f(r1, r6)
            if (r4 == 0) goto L_0x02c8
            java.util.List r3 = r1.A01
            int r2 = X.C51966G9m.A06(r3)
            r1 = r6
            if (r6 <= r2) goto L_0x01d4
            r1 = r2
        L_0x01d4:
            java.lang.Object r1 = r3.get(r1)
            X.9IM r1 = (X.AnonymousClass9IM) r1
            int r1 = r1.A00
            int r3 = r10 - r1
            r2 = 100
            if (r3 <= r2) goto L_0x02c8
            int r1 = X.JTP.A08(r4)
            int r1 = r1 - r2
            if (r3 >= r1) goto L_0x02c8
            X.8d5 r1 = X.C359548d5.VIDEO_CLIP_SPLIT
            r4 = 0
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.A03(r1, r5, r9)
            X.836 r2 = r5.A0O
            r1 = -1
            if (r6 == r1) goto L_0x02b6
            X.05G r3 = r2.A02
            java.lang.Object r1 = r3.getValue()
            X.831 r1 = (X.AnonymousClass831) r1
            int r1 = X.JTO.A08(r1)
            if (r6 >= r1) goto L_0x02b6
            java.lang.Object r1 = r3.getValue()
            X.831 r1 = (X.AnonymousClass831) r1
            int r12 = r1.A01(r6)
            java.lang.Object r1 = r3.getValue()
            X.831 r1 = (X.AnonymousClass831) r1
            X.51O r2 = r1.A03(r6)
            X.51N r2 = (X.AnonymousClass51N) r2
            int r1 = r12 + 100
            if (r10 < r1) goto L_0x02b6
            int r1 = r2.BrP()
            int r1 = r1 + r12
            int r1 = r1 + -100
            if (r10 > r1) goto L_0x02b6
            boolean r1 = r2 instanceof X.AnonymousClass51M
            if (r1 == 0) goto L_0x033e
            X.51M r2 = (X.AnonymousClass51M) r2
            int r11 = r2.A09
            int r1 = r11 + r10
            int r1 = r1 - r12
            int r10 = r1 - r11
            X.GTT r11 = new X.GTT
            r11.<init>(r1, r10, r9, r4)
            r13 = 0
            r14 = 0
            r19 = 1063124975(0x3f5dffef, float:0.8671865)
            r12 = r2
            r15 = r4
            r16 = r1
            r17 = r4
            r18 = r1
            X.51M r11 = X.AnonymousClass51M.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            int r12 = X.JTP.A08(r2)
            X.GTT r10 = new X.GTT
            r10.<init>(r1, r12, r9, r9)
            r23 = 1064239095(0x3f6efff7, float:0.9335932)
            r16 = r2
            r19 = r1
            r20 = r4
            r21 = r1
            r22 = r4
            r15 = r10
            r17 = r13
            r18 = r14
            X.51M r10 = X.AnonymousClass51M.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r9 = r3.getValue()
            X.831 r9 = (X.AnonymousClass831) r9
            X.0qQ.A0B(r9, r4)
            java.util.ArrayList r2 = r9.A05()
            java.lang.String r1 = "null cannot be cast to non-null type java.util.ArrayList<T of com.instagram.creation.capture.quickcapture.video.model.SegmentStoreKt.split>"
            X.0qQ.A0C(r2, r1)
            r2.set(r6, r10)
            r2.add(r6, r11)
            X.831 r2 = X.JTR.A0m(r9, r2)
        L_0x0283:
            if (r6 <= 0) goto L_0x028b
            int r1 = r6 + -1
            X.831 r2 = X.AEH.A00(r2, r1)
        L_0x028b:
            X.831 r1 = X.AEH.A00(r2, r6)
            int r2 = r6 + 1
            X.831 r1 = X.AEH.A00(r1, r2)
            r3.Epw(r1)
            X.831 r1 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.A00(r5)
            X.51M r9 = X.JTO.A0f(r1, r6)
            if (r9 == 0) goto L_0x02b6
            X.51M r3 = X.JTO.A0f(r1, r2)
            if (r3 == 0) goto L_0x02b6
            X.2Nn r2 = r5.A0R
            boolean r1 = r2.A02()
            if (r1 == 0) goto L_0x02b6
            X.AnonymousClass833.A00(r9, r2)
            X.AnonymousClass833.A00(r3, r2)
        L_0x02b6:
            X.8RH r1 = r7.A0E()
            boolean r1 = r1 instanceof X.C355868Rr
            if (r1 == 0) goto L_0x0338
            int r2 = r6 + 1
            X.8Rr r1 = new X.8Rr
            r1.<init>(r2)
        L_0x02c5:
            r7.A0G(r1)
        L_0x02c8:
            com.instagram.common.session.UserSession r1 = r8.A02
            X.27r r1 = X.27p.A01(r1)
            X.29Z r5 = r1.A0F
            X.0wc r2 = r5.A02
            java.lang.String r1 = "ig_camera_ui_tool_click"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r4.isSampled()
            if (r1 == 0) goto L_0x0333
            X.80P r1 = X.AnonymousClass80P.SPLIT
            X.JTO.A1O(r1, r4)
            java.lang.String r1 = "IG_CAMERA_CLIPS_SPLIT_SEGMENT_TAP"
            X.JTO.A1T(r4, r1)
            X.283 r3 = r5.A04
            java.lang.String r1 = X.JTP.A0p(r3)
            X.JTO.A1S(r4, r1)
            X.AnonymousClass7TH.A0W(r4, r5)
            X.AnonymousClass7TE.A1V(r4, r3)
            r2 = 2
            java.lang.String r1 = "event_type"
            X.AnonymousClass7TE.A1W(r4, r1, r2)
            X.JTP.A1F(r4)
            X.0iw r1 = X.27x.A09
            X.DbW.A15(r4, r1)
            int r1 = r3.A01
            if (r1 == r2) goto L_0x030a
            r2 = 1
        L_0x030a:
            java.lang.String r1 = "camera_position"
            X.AnonymousClass7TE.A1W(r4, r1, r2)
            r1 = 0
            java.util.ArrayList r2 = r5.A0N(r1)
            java.lang.String r1 = "camera_tools_struct"
            r4.AAe(r1, r2)
            r1 = -1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "capture_format_index"
            r4.A9F(r1, r2)
            X.JTP.A1J(r4, r3)
            X.JTS.A19(r4, r3)
            X.DbY.A1C(r4)
            X.JTS.A1A(r4, r5)
            r4.Cgf()
        L_0x0333:
            r1 = 964058380(0x39765d0c, float:2.3495051E-4)
            goto L_0x1403
        L_0x0338:
            X.8RG r1 = new X.8RG
            r1.<init>(r4)
            goto L_0x02c5
        L_0x033e:
            boolean r1 = r2 instanceof X.KN4
            if (r1 == 0) goto L_0x03a9
            int r10 = r10 - r12
            X.KN4 r2 = (X.KN4) r2
            int r1 = r2.A00
            int r1 = r1 - r10
            r2.A00 = r1
            java.lang.Object r9 = r3.getValue()
            X.831 r9 = (X.AnonymousClass831) r9
            java.lang.String r1 = r2.A0D
            r30 = r1
            int r1 = r2.A0C
            r22 = r1
            int r1 = r2.A0A
            r21 = r1
            int r1 = r2.A0B
            r20 = r1
            boolean r1 = r2.A05
            r19 = r1
            boolean r1 = r2.A08
            r18 = r1
            X.GnY r1 = r2.A02
            r17 = r1
            boolean r1 = r2.A07
            r16 = r1
            boolean r15 = r2.A06
            X.0v6 r14 = r2.A03
            X.9Hy r13 = r2.A01
            java.lang.String r12 = r2.A04
            java.util.Map r11 = r2.A0E
            int r2 = r2.A09
            X.KN4 r1 = new X.KN4
            r23 = r21
            r24 = r20
            r25 = r2
            r26 = r19
            r27 = r18
            r28 = r16
            r29 = r15
            r15 = r13
            r16 = r17
            r17 = r14
            r18 = r30
            r19 = r12
            r20 = r11
            r21 = r10
            r14 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            X.831 r2 = X.LSY.A01(r1, r9, r6)
            goto L_0x0283
        L_0x03a3:
            X.8Rs r1 = X.JTQ.A0J()
            goto L_0x02c5
        L_0x03a9:
            X.Wub r2 = X.AnonymousClass7TE.A1K()
            throw r2
        L_0x03ae:
            r0 = -1143734800(0xffffffffbbd3fdf0, float:-0.0064694807)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r1 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r1
            X.8RF r0 = r1.A0d
            if (r0 == 0) goto L_0x1487
            X.8RH r3 = r0.A0E()
            boolean r0 = r3 instanceof X.C355868Rr
            if (r0 == 0) goto L_0x03d0
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r1.A0Z
            if (r1 == 0) goto L_0x1481
            X.8Rr r3 = (X.C355868Rr) r3
            int r0 = r3.A00
            r1.A0R(r0)
        L_0x03d0:
            r0 = 574420888(0x223cf798, float:2.5609826E-18)
            goto L_0x147d
        L_0x03d5:
            r0 = -889510822(0xffffffffcafb245a, float:-8229421.0)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r2 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r2
            X.27r r1 = X.JTQ.A0I(r2)
            X.4yP r0 = r1.A0J()
            if (r0 == 0) goto L_0x03ef
            java.lang.String r0 = "TIMELINE_COLOR_FILTERS_TAP"
            X.27r.A0C(r1, r0)
        L_0x03ef:
            X.8RF r1 = r2.A0d
            if (r1 == 0) goto L_0x1487
            X.8Rm r0 = X.C355818Rm.A00
            r1.A0G(r0)
            r0 = 232249798(0xdd7d9c6, float:1.3302825E-30)
            goto L_0x137e
        L_0x03fd:
            r0 = 268162588(0xffbd61c, float:2.4832983E-29)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r2 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r2
            X.8RF r0 = r2.A0d
            java.lang.String r8 = "clipsTimelineEditorViewModel"
            if (r0 == 0) goto L_0x14c1
            X.8RH r1 = r0.A0E()
            boolean r0 = r1 instanceof X.C355868Rr
            if (r0 == 0) goto L_0x042e
            X.8RF r4 = r2.A0d
            if (r4 == 0) goto L_0x14c1
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            X.8Rr r1 = (X.C355868Rr) r1
            int r2 = r1.A00
            r1 = 0
        L_0x0421:
            X.KM1 r0 = new X.KM1
            r0.<init>(r3, r2, r1)
            r4.A0G(r0)
        L_0x0429:
            r0 = -735267037(0xffffffffd42cb723, float:-2.9672276E12)
            goto L_0x153b
        L_0x042e:
            boolean r0 = r1 instanceof X.C355758Rg
            if (r0 == 0) goto L_0x0429
            X.8RF r4 = r2.A0d
            if (r4 == 0) goto L_0x14c1
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            X.8Rg r1 = (X.C355758Rg) r1
            int r2 = r1.A00
            int r1 = r1.A01
            goto L_0x0421
        L_0x043f:
            r0 = -1762315715(0xffffffff96f5323d, float:-3.961359E-25)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r1 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r1
            X.8RF r0 = r1.A0d
            java.lang.String r8 = "clipsTimelineEditorViewModel"
            if (r0 == 0) goto L_0x14c1
            X.8RH r3 = r0.A0E()
            boolean r0 = r3 instanceof X.C355868Rr
            java.lang.String r7 = "clipsCreationViewModel"
            r4 = 0
            if (r0 == 0) goto L_0x048e
            X.8RF r0 = r1.A0d
            if (r0 == 0) goto L_0x14c1
            X.8Rr r3 = (X.C355868Rr) r3
            int r8 = r3.A00
            r5 = 0
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r3 = r1.A0Z
            if (r3 == 0) goto L_0x1500
            java.lang.Float r3 = r3.A0H(r8)
            boolean r9 = X.0qQ.A0I(r3, r4)
            X.8Rn r4 = new X.8Rn
            r6 = r5
            r7 = r5
            r4.<init>(r5, r6, r7, r8, r9)
        L_0x0477:
            r0.A0G(r4)
            X.27r r1 = X.JTQ.A0I(r1)
            X.4yP r0 = r1.A0J()
            if (r0 == 0) goto L_0x0489
            java.lang.String r0 = "TIMELINE_VOLUME_CONTROLS_TAP"
            X.27r.A0C(r1, r0)
        L_0x0489:
            r0 = 1483222908(0x58682f7c, float:1.02116257E15)
            goto L_0x147d
        L_0x048e:
            boolean r0 = r3 instanceof X.C355748Rf
            if (r0 == 0) goto L_0x04ae
            X.8RF r0 = r1.A0d
            if (r0 == 0) goto L_0x14c1
            X.8Rf r3 = (X.C355748Rf) r3
            int r5 = r3.A01
            int r4 = r3.A00
            r3 = 10
            X.Gms r6 = new X.Gms
            r6.<init>(r5, r4, r3)
            r7 = 0
            r9 = -1
            r10 = 0
            X.8Rn r4 = new X.8Rn
            r8 = r7
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x0477
        L_0x04ae:
            boolean r0 = r3 instanceof X.C355758Rg
            if (r0 == 0) goto L_0x04ce
            X.8RF r0 = r1.A0d
            if (r0 == 0) goto L_0x14c1
            r6 = 0
            X.8Rg r3 = (X.C355758Rg) r3
            int r5 = r3.A01
            int r4 = r3.A00
            r3 = 10
            X.Gms r7 = new X.Gms
            r7.<init>(r5, r4, r3)
            r9 = -1
            r10 = 0
            X.8Rn r4 = new X.8Rn
            r8 = r6
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x0477
        L_0x04ce:
            boolean r0 = r3 instanceof X.C355768Rh
            if (r0 == 0) goto L_0x04ee
            X.8RF r0 = r1.A0d
            if (r0 == 0) goto L_0x14c1
            r6 = 0
            X.8Rh r3 = (X.C355768Rh) r3
            int r5 = r3.A01
            int r4 = r3.A00
            r3 = 10
            X.Gms r8 = new X.Gms
            r8.<init>(r5, r4, r3)
            r9 = -1
            r10 = 0
            X.8Rn r4 = new X.8Rn
            r7 = r6
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x0477
        L_0x04ee:
            X.8RF r0 = r1.A0d
            if (r0 == 0) goto L_0x14c1
            r5 = 0
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r3 = r1.A0Z
            if (r3 == 0) goto L_0x1500
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r3 = r3.A0K
            X.0Ud r3 = r3.A0k
            float r3 = X.JTR.A03(r3)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            boolean r9 = X.AnonymousClass7TF.A1Q(r3)
            r8 = -1
            X.8Rn r4 = new X.8Rn
            r6 = r5
            r7 = r5
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x0477
        L_0x050f:
            r0 = 1922577657(0x729834f9, float:6.0295375E30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r5 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r5
            X.KMu r1 = r5.A0i
            java.lang.String r10 = "timedElementsViewModel"
            r4 = 0
            if (r1 == 0) goto L_0x061b
            X.LTY r1 = r1.A01
            X.Jyn r1 = r1.A0F()
            if (r1 == 0) goto L_0x0533
            X.JwI r1 = r1.A06
            if (r1 == 0) goto L_0x0533
            java.lang.Object r3 = r1.A00
            X.5MI r3 = (X.AnonymousClass5MI) r3
            if (r3 != 0) goto L_0x0541
        L_0x0533:
            X.KMu r1 = r5.A0i
            if (r1 == 0) goto L_0x061b
            X.Jym r1 = r1.A0M()
            if (r1 == 0) goto L_0x05de
            X.4ds r3 = r1.A00
            if (r3 == 0) goto L_0x05de
        L_0x0541:
            r2 = r3
            boolean r1 = r3 instanceof X.AnonymousClass5MH
            if (r1 == 0) goto L_0x0569
            r1 = r3
            X.5MH r1 = (X.AnonymousClass5MH) r1
            if (r1 == 0) goto L_0x0569
            java.lang.Integer r6 = r1.Azv()
        L_0x054f:
            if (r6 == 0) goto L_0x05de
            int r1 = r6.intValue()
            java.lang.String r9 = "STICKER"
            java.lang.String r8 = "clipsTimelineButtonEventProvider"
            java.lang.String r7 = "videoPlaybackViewModel"
            switch(r1) {
                case 0: goto L_0x0576;
                case 1: goto L_0x0576;
                case 2: goto L_0x05a3;
                case 3: goto L_0x05a3;
                case 4: goto L_0x05a3;
                case 5: goto L_0x05a3;
                case 6: goto L_0x05a3;
                default: goto L_0x055e;
            }
        L_0x055e:
            X.Wub r2 = X.AnonymousClass7TE.A1K()
            r1 = -158271039(0xfffffffff690f9c1, float:-1.4702273E33)
            X.AnonymousClass0fD.A0C(r1, r0)
            throw r2
        L_0x0569:
            boolean r1 = r3 instanceof X.C299875vz
            if (r1 == 0) goto L_0x05de
            X.5vz r2 = (X.C299875vz) r2
            if (r2 == 0) goto L_0x05de
            java.lang.Integer r6 = r2.A08()
            goto L_0x054f
        L_0x0576:
            boolean r1 = r3 instanceof X.AnonymousClass5MI
            if (r1 == 0) goto L_0x05de
            X.5MI r3 = (X.AnonymousClass5MI) r3
            if (r3 == 0) goto L_0x05de
            android.graphics.drawable.Drawable r4 = r3.AfT()
            if (r4 == 0) goto L_0x05de
            X.861 r1 = r5.A0j
            if (r1 == 0) goto L_0x1500
            r1.A01()
            X.8RL r3 = r5.A0c
            if (r3 == 0) goto L_0x14c1
            r2 = 4
            X.9IF r1 = new X.9IF
            r1.<init>(r4, r2)
            r3.A0F(r1)
            X.27r r5 = X.JTQ.A0I(r5)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r6 != r1) goto L_0x05cf
            java.lang.String r9 = "TEXT"
            goto L_0x05cf
        L_0x05a3:
            X.861 r1 = r5.A0j
            if (r1 == 0) goto L_0x1500
            r1.A01()
            X.KMu r1 = r5.A0i
            if (r1 == 0) goto L_0x061b
            X.Jym r1 = r1.A0M()
            if (r1 == 0) goto L_0x05b6
            X.4ds r4 = r1.A00
        L_0x05b6:
            boolean r1 = r4 instanceof android.graphics.drawable.Drawable
            if (r1 == 0) goto L_0x05de
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4
            if (r4 == 0) goto L_0x05de
            X.8RL r3 = r5.A0c
            if (r3 == 0) goto L_0x14c1
            r2 = 3
            X.9IF r1 = new X.9IF
            r1.<init>(r4, r2)
            r3.A0F(r1)
            X.27r r5 = X.JTQ.A0I(r5)
        L_0x05cf:
            X.4yP r1 = r5.A0J()
            if (r1 == 0) goto L_0x05de
            X.JVj r4 = X.C59725JVj.POST_CAPTURE
            r6 = 0
            java.lang.String r8 = "TIMELINE_ELEMENT_EDIT_TAP"
            r7 = r6
            X.27r.A05(r4, r5, r6, r7, r8, r9)
        L_0x05de:
            r1 = -1190498909(0xffffffffb90a6da3, float:-1.3201548E-4)
            goto L_0x1403
        L_0x05e3:
            r0 = -1271969126(0xffffffffb42f4a9a, float:-1.6325285E-7)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r6 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r6
            X.8RF r0 = r6.A0d
            java.lang.String r10 = "clipsTimelineEditorViewModel"
            if (r0 == 0) goto L_0x061b
            X.8RH r7 = r0.A0E()
            boolean r0 = r7 instanceof X.AnonymousClass8RY
            java.lang.String r8 = "viewController"
            if (r0 == 0) goto L_0x06c9
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r0 = r6.A0F
            if (r0 == 0) goto L_0x14c1
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r0 = r0.A0C
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r0.A04()
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x06e5
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r0 = r6.A0F
            if (r0 == 0) goto L_0x14c1
            r0.A0R()
            X.LRi r8 = r6.A0B
            if (r8 != 0) goto L_0x0620
            java.lang.String r10 = "audioElementTracksManager"
        L_0x061b:
            X.0qQ.A0F(r10)
            goto L_0x1503
        L_0x0620:
            X.8RY r7 = (X.AnonymousClass8RY) r7
            int r4 = r7.A01
            java.util.Iterator r9 = X.C64166LRi.A01(r8)
            r1 = 0
        L_0x0629:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0663
            java.lang.Object r2 = r9.next()
            int r5 = r1 + 1
            if (r1 >= 0) goto L_0x063c
            X.0sr.A1T()
            goto L_0x1503
        L_0x063c:
            X.KMU r2 = (X.KMU) r2
            if (r1 != r4) goto L_0x065d
            X.KMU.A00(r2)
            X.LEG r0 = r2.A0E
            int r1 = r0.A00()
            X.KMt r0 = r2.A0H
            r0.A0O(r1)
            com.instagram.common.session.UserSession r0 = r2.A09
            X.9Ua r2 = X.AnonymousClass9T6.A00(r0)
            java.lang.String r1 = "AUDIO"
            java.lang.String r0 = "ADJUST"
            X.C61015JvF.A00(r2, r1, r0)
        L_0x065b:
            r1 = r5
            goto L_0x0629
        L_0x065d:
            com.instagram.common.ui.base.IgFrameLayout r0 = r2.A0A
            X.JTT.A13(r0)
            goto L_0x065b
        L_0x0663:
            java.util.Iterator r1 = X.C64166LRi.A00(r8)
        L_0x0667:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0677
            X.KMU r0 = X.JTO.A0d(r1)
            com.instagram.common.ui.base.IgFrameLayout r0 = r0.A0A
            X.JTT.A13(r0)
            goto L_0x0667
        L_0x0677:
            X.8RF r2 = r6.A0d
            if (r2 == 0) goto L_0x061b
            int r1 = r7.A00
            X.8Rf r0 = new X.8Rf
            r0.<init>(r1, r4)
            r2.A0G(r0)
            X.KMS r0 = r6.A0E
            if (r0 != 0) goto L_0x068c
            java.lang.String r10 = "videoTrackViewController"
            goto L_0x061b
        L_0x068c:
            androidx.recyclerview.widget.RecyclerView r0 = r0.A0A
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            X.LGg r0 = r6.A0D
            if (r0 != 0) goto L_0x069a
            java.lang.String r10 = "timedElementTracksManager"
            goto L_0x061b
        L_0x069a:
            r0.A02(r1)
            X.Kh8 r0 = X.C62517Kh8.A03
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A0F(r6, r0)
            X.27r r5 = X.JTQ.A0I(r6)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r6.A0Z
            java.lang.String r8 = "clipsCreationViewModel"
            if (r0 == 0) goto L_0x14c1
            r1 = 0
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r0.A0K
            int r4 = r0.A02(r1)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r6.A0Z
            if (r0 == 0) goto L_0x14c1
            boolean r2 = r0.A0m()
            X.4yP r0 = r5.A0J()
            if (r0 == 0) goto L_0x06e5
            X.JVj r1 = X.C59725JVj.POST_CAPTURE
            java.lang.String r0 = "TIMELINE_AUDIO_ADJUST_DONE_TAP"
            X.27r.A06(r1, r5, r0, r4, r2)
            goto L_0x06e5
        L_0x06c9:
            boolean r0 = r7 instanceof X.AnonymousClass8RX
            if (r0 == 0) goto L_0x06ea
            X.27r r4 = X.JTQ.A0I(r6)
            X.4yP r0 = r4.A0J()
            if (r0 == 0) goto L_0x06e2
            X.JVj r2 = X.C59725JVj.POST_CAPTURE
            X.283 r0 = r4.A04
            boolean r1 = r0.A0W
            java.lang.String r0 = "TIMELINE_TRANSITION_DONE"
            X.27r.A09(r2, r4, r0, r1)
        L_0x06e2:
            r6.A0Q()
        L_0x06e5:
            r0 = 1020279891(0x3cd03c53, float:0.02541939)
            goto L_0x137e
        L_0x06ea:
            boolean r0 = r7 instanceof X.C355838Ro
            if (r0 == 0) goto L_0x0724
            X.8RF r5 = r6.A0d
            if (r5 == 0) goto L_0x061b
            X.8Ro r7 = (X.C355838Ro) r7
            int r4 = r7.A01
            int r2 = r7.A00
            java.lang.String r1 = r7.A02
            X.8Rq r0 = new X.8Rq
            r0.<init>(r4, r2, r1)
            r5.A0G(r0)
            X.27r r1 = X.JTQ.A0I(r6)
            X.4yP r0 = r1.A0J()
            if (r0 == 0) goto L_0x0711
            java.lang.String r0 = "TIMELINE_TEXT_VOICE_DONE_TAP"
            X.27r.A0C(r1, r0)
        L_0x0711:
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r1 = r6.A0F
            if (r1 == 0) goto L_0x14c1
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x06e5
            X.Jfo r0 = r1.A0H
            X.861 r0 = r0.A0K
            r0.A03()
            r0 = 0
            r1.A05 = r0
            goto L_0x06e5
        L_0x0724:
            boolean r0 = r7 instanceof X.C355768Rh
            if (r0 != 0) goto L_0x07b6
            boolean r0 = r7 instanceof X.C355778Ri
            if (r0 != 0) goto L_0x07b6
            boolean r0 = r7 instanceof X.AnonymousClass8RV
            if (r0 == 0) goto L_0x0775
            X.LSO r2 = r6.A0O
            if (r2 == 0) goto L_0x06e5
            X.8RF r0 = r2.A06
            X.8RH r1 = r0.A0E()
            boolean r0 = r1 instanceof X.AnonymousClass8RV
            if (r0 == 0) goto L_0x0747
            X.8RV r1 = (X.AnonymousClass8RV) r1
            if (r1 == 0) goto L_0x0747
            int r0 = r1.A00
            X.LSO.A00(r2, r0)
        L_0x0747:
            X.LSO.A01(r2)
            com.instagram.common.session.UserSession r0 = r2.A02
            X.29R r4 = X.JTO.A0b(r0)
            X.0wc r0 = r4.A02
            X.1Ln r2 = X.1Ln.A08(r0)
            X.4yP r1 = r4.A0J()
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x06e5
            if (r1 == 0) goto L_0x06e5
            X.JTO.A1V(r2)
            java.lang.String r0 = "TIMELINE_SLIP_DONE_TAP"
            r2.A0r(r0)
            X.29R.A00(r2, r4)
            X.JTT.A1D(r2, r1, r4)
        L_0x0770:
            r2.Cgf()
            goto L_0x06e5
        L_0x0775:
            boolean r0 = r7 instanceof X.AnonymousClass8RR
            if (r0 == 0) goto L_0x06e5
            X.8RF r1 = r6.A0d
            if (r1 == 0) goto L_0x061b
            X.8RR r7 = (X.AnonymousClass8RR) r7
            int r0 = r7.A00
            X.JTP.A1N(r1, r0)
            X.27r r0 = X.JTQ.A0I(r6)
            X.29R r1 = r0.A09
            X.1Ln r2 = X.JTO.A0N(r1)
            boolean r0 = r1.A0P()
            if (r0 == 0) goto L_0x06e5
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x06e5
            X.JTO.A1V(r2)
            java.lang.String r0 = "TIMELINE_SCALE_DONE_TAP"
            r2.A0r(r0)
            X.29R.A00(r2, r1)
            X.4yP r0 = r1.A0J()
            X.JTT.A1D(r2, r0, r1)
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0v()
            java.lang.String r0 = "is_timeline"
            r2.A0O(r0, r1)
            goto L_0x0770
        L_0x07b6:
            X.8RF r0 = r6.A0d
            if (r0 == 0) goto L_0x061b
            X.JTR.A1M(r0)
            goto L_0x06e5
        L_0x07bf:
            r0 = -459769137(0xffffffffe4987acf, float:-2.2502035E22)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r5 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r5
            X.KMu r0 = r5.A0i
            if (r0 == 0) goto L_0x0b2f
            X.LTY r0 = r0.A01
            X.Jyn r0 = r0.A0F()
            if (r0 == 0) goto L_0x0825
            X.JwI r0 = r0.A06
            if (r0 == 0) goto L_0x0825
            java.lang.Object r4 = r0.A00
            X.5MI r4 = (X.AnonymousClass5MI) r4
            if (r4 == 0) goto L_0x0825
            r1 = r4
            boolean r0 = r4 instanceof X.AnonymousClass5MH
            if (r0 == 0) goto L_0x082a
            r0 = r4
            X.5MH r0 = (X.AnonymousClass5MH) r0
            if (r0 == 0) goto L_0x082a
            java.lang.Integer r1 = r0.Azv()
        L_0x07ee:
            if (r1 == 0) goto L_0x0825
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0825
            X.861 r0 = r5.A0j
            if (r0 == 0) goto L_0x0c81
            r0.A01()
            boolean r0 = r4 instanceof X.AnonymousClass5MH
            if (r0 == 0) goto L_0x0825
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4
            if (r4 == 0) goto L_0x0825
            X.8RL r2 = r5.A0c
            if (r2 == 0) goto L_0x0caf
            r1 = 2
            X.9IF r0 = new X.9IF
            r0.<init>(r4, r1)
            r2.A0F(r0)
            X.27r r5 = X.JTQ.A0I(r5)
            java.lang.String r9 = "TEXT"
            X.4yP r0 = r5.A0J()
            if (r0 == 0) goto L_0x0825
            X.JVj r4 = X.C59725JVj.POST_CAPTURE
            r6 = 0
            java.lang.String r8 = "TIMELINE_DUPLICATE_TEXT_BUTTON_TAP"
            r7 = r6
            X.27r.A05(r4, r5, r6, r7, r8, r9)
        L_0x0825:
            r0 = 477664886(0x1c789676, float:8.2250783E-22)
            goto L_0x137e
        L_0x082a:
            boolean r0 = r4 instanceof X.C299875vz
            if (r0 == 0) goto L_0x0825
            X.5vz r1 = (X.C299875vz) r1
            if (r1 == 0) goto L_0x0825
            java.lang.Integer r1 = r1.A08()
            goto L_0x07ee
        L_0x0837:
            r0 = -1506486337(0xffffffffa634d7bf, float:-6.2742436E-16)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r5 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r5
            X.8RF r0 = r5.A0d
            java.lang.String r8 = "clipsTimelineEditorViewModel"
            if (r0 == 0) goto L_0x14c1
            X.8RH r1 = r0.A0E()
            boolean r0 = r1 instanceof X.C355858Rq
            if (r0 == 0) goto L_0x086d
            X.8RF r4 = r5.A0d
            if (r4 == 0) goto L_0x14c1
            X.8Rq r1 = (X.C355858Rq) r1
            int r3 = r1.A01
            int r2 = r1.A00
            java.lang.String r1 = r1.A02
            X.8Ro r0 = new X.8Ro
            r0.<init>(r3, r2, r1)
            r4.A0G(r0)
            X.27r r1 = X.JTQ.A0I(r5)
            java.lang.String r0 = "TEXT_TO_SPEECH"
            X.27r.A0C(r1, r0)
        L_0x086d:
            r0 = 2141145687(0x7f9f4a57, float:NaN)
            goto L_0x1518
        L_0x0872:
            r0 = 727674820(0x2b5f6fc4, float:7.938062E-13)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r4 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r4
            X.8RF r0 = r4.A0d
            java.lang.String r8 = "clipsTimelineEditorViewModel"
            if (r0 == 0) goto L_0x14c1
            X.8RH r2 = r0.A0E()
            boolean r0 = r2 instanceof X.AnonymousClass8RR
            if (r0 == 0) goto L_0x08d1
            X.8M1 r0 = r4.A0e
            if (r0 == 0) goto L_0x094e
            r0.A0F()
            X.8RF r1 = r4.A0d
            if (r1 == 0) goto L_0x14c1
            X.8RR r2 = (X.AnonymousClass8RR) r2
            int r0 = r2.A00
            X.JTP.A1N(r1, r0)
            X.27r r0 = X.JTQ.A0I(r4)
            X.29R r1 = r0.A09
            X.1Ln r2 = X.JTO.A0N(r1)
            boolean r0 = r1.A0P()
            if (r0 == 0) goto L_0x08d1
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x08d1
            X.JTO.A1V(r2)
            java.lang.String r0 = "TIMELINE_SCALE_CANCEL_TAP"
            r2.A0r(r0)
            X.29R.A00(r2, r1)
            X.4yP r0 = r1.A0J()
            X.JTT.A1D(r2, r0, r1)
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0v()
            java.lang.String r0 = "is_timeline"
            r2.A0O(r0, r1)
            r2.Cgf()
        L_0x08d1:
            r0 = 1886041695(0x706ab65f, float:2.9055986E29)
            goto L_0x137e
        L_0x08d6:
            r0 = 1751505797(0x6865db85, float:4.3418854E24)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r4 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r4
            X.8RF r0 = r4.A0d
            if (r0 == 0) goto L_0x1487
            X.8RH r0 = r0.A0E()
            boolean r0 = r0 instanceof X.AnonymousClass8RR
            if (r0 == 0) goto L_0x0949
            X.8M1 r2 = r4.A0e
            if (r2 == 0) goto L_0x094e
            X.9bu r1 = X.AnonymousClass8M1.A00(r2)
            if (r1 == 0) goto L_0x0915
            X.9sM r0 = r1.A05
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0915
            X.9sM r8 = X.C391109sM.RESET
            int r11 = r1.A02
            X.9Hy r6 = r1.A03
            float r9 = r1.A00
            float r10 = r1.A01
            X.9Hy r7 = r1.A04
            r0 = 2
            X.DbW.A1N(r6, r0, r7)
            X.9bu r5 = new X.9bu
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.AnonymousClass8M1.A04(r5, r2)
        L_0x0915:
            X.27r r0 = X.JTQ.A0I(r4)
            X.29R r1 = r0.A09
            X.1Ln r2 = X.JTO.A0N(r1)
            boolean r0 = r1.A0P()
            if (r0 == 0) goto L_0x0949
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x0949
            X.JTO.A1V(r2)
            java.lang.String r0 = "TIMELINE_SCALE_RESET_TAP"
            r2.A0r(r0)
            X.29R.A00(r2, r1)
            X.4yP r0 = r1.A0J()
            X.JTT.A1D(r2, r0, r1)
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0v()
            java.lang.String r0 = "is_timeline"
            r2.A0O(r0, r1)
            r2.Cgf()
        L_0x0949:
            r0 = -260421334(0xfffffffff07a492a, float:-3.0983881E29)
            goto L_0x137e
        L_0x094e:
            java.lang.String r8 = "clipsTransformViewModel"
            goto L_0x14c1
        L_0x0952:
            r0 = -821675901(0xffffffffcf063883, float:-2.2518505E9)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r6 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r6
            X.8RF r0 = r6.A0d
            java.lang.String r8 = "clipsTimelineEditorViewModel"
            if (r0 == 0) goto L_0x14c1
            X.8RH r1 = r0.A0E()
            boolean r0 = r1 instanceof X.AnonymousClass8RY
            if (r0 == 0) goto L_0x09d5
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r0 = r6.A0F
            if (r0 != 0) goto L_0x0973
            java.lang.String r8 = "viewController"
            goto L_0x14c1
        L_0x0973:
            r0.A0R()
            X.LRi r0 = r6.A0B
            if (r0 != 0) goto L_0x097e
            java.lang.String r8 = "audioElementTracksManager"
            goto L_0x14c1
        L_0x097e:
            X.8RY r1 = (X.AnonymousClass8RY) r1
            int r3 = r1.A01
            r0.A02(r3)
            X.8RF r2 = r6.A0d
            if (r2 == 0) goto L_0x14c1
            int r1 = r1.A00
            X.8Rf r0 = new X.8Rf
            r0.<init>(r1, r3)
            r2.A0G(r0)
            X.KMS r0 = r6.A0E
            if (r0 == 0) goto L_0x1484
            androidx.recyclerview.widget.RecyclerView r0 = r0.A0A
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            X.LGg r0 = r6.A0D
            if (r0 != 0) goto L_0x09a6
            java.lang.String r8 = "timedElementTracksManager"
            goto L_0x14c1
        L_0x09a6:
            r0.A02(r1)
            X.Kh8 r0 = X.C62517Kh8.A03
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A0F(r6, r0)
            X.27r r4 = X.JTQ.A0I(r6)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r6.A0Z
            java.lang.String r8 = "clipsCreationViewModel"
            if (r0 == 0) goto L_0x14c1
            r1 = 0
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r0.A0K
            int r3 = r0.A02(r1)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r6.A0Z
            if (r0 == 0) goto L_0x14c1
            boolean r2 = r0.A0m()
            X.4yP r0 = r4.A0J()
            if (r0 == 0) goto L_0x09e0
            X.JVj r1 = X.C59725JVj.POST_CAPTURE
            java.lang.String r0 = "TIMELINE_AUDIO_ADJUST_CANCEL_TAP"
            X.27r.A06(r1, r4, r0, r3, r2)
            goto L_0x09e0
        L_0x09d5:
            boolean r0 = r1 instanceof X.AnonymousClass8RV
            if (r0 == 0) goto L_0x09e0
            X.LSO r0 = r6.A0O
            if (r0 == 0) goto L_0x09e0
            r0.A03()
        L_0x09e0:
            r0 = 1157301278(0x44fb041e, float:2008.1287)
            goto L_0x153b
        L_0x09e5:
            r0 = 129985314(0x7bf6b22, float:2.8801453E-34)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r4 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r4
            X.861 r0 = r4.A0j
            if (r0 == 0) goto L_0x0c81
            r0.A01()
            X.27r r0 = X.JTQ.A0I(r4)
            X.29R r3 = r0.A09
            X.283 r1 = r3.A04
            java.lang.String r0 = X.AnonymousClass7TF.A0b()
            r1.A0Q = r0
            X.1Ln r2 = X.JTO.A0N(r3)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x0a2a
            X.JTO.A1V(r2)
            java.lang.String r0 = "TIMELINE_ADD_GIF_ELEMENT_TAP"
            X.JTS.A1F(r2, r3, r0)
            X.JTQ.A1B(r2, r1)
            r2.A0U()
            X.JTU.A15(r2, r1)
            java.lang.String r1 = r1.A0M
            java.lang.String r0 = "composition_str_id"
            r2.A0R(r0, r1)
            X.JTS.A1E(r2)
        L_0x0a2a:
            X.8RL r1 = r4.A0c
            if (r1 == 0) goto L_0x0caf
            X.Lmy r0 = X.C65078Lmy.A00
            r1.A0F(r0)
            r0 = -1123616288(0xffffffffbd06f9e0, float:-0.032953143)
            goto L_0x153b
        L_0x0a38:
            r0 = 1800082812(0x6b4b157c, float:2.455134E26)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r0 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r0
            X.8RL r1 = r0.A0c
            if (r1 == 0) goto L_0x0dcb
            X.AbW r0 = X.C40399AbW.A00
            r1.A0F(r0)
            r0 = 1734664768(0x6764e240, float:1.0808731E24)
            goto L_0x137e
        L_0x0a51:
            r0 = 500154670(0x1dcfc12e, float:5.4992187E-21)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r0 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r0
            r0.A0R()
            r0 = -2143090340(0xffffffff8043095c, float:-6.156336E-39)
            goto L_0x137e
        L_0x0a64:
            r0 = 13013114(0xc6907a, float:1.8235257E-38)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r2 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r2
            boolean r0 = com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A0K(r2)
            if (r0 != 0) goto L_0x0a96
            X.27r r0 = X.JTQ.A0I(r2)
            X.29J r0 = r0.A01
            r0.A00()
            X.27r r1 = X.JTQ.A0I(r2)
            X.4yP r0 = r1.A0J()
            if (r0 == 0) goto L_0x0a8d
            java.lang.String r0 = "TIMELINE_ADD_STICKER_ELEMENT_TAP"
            X.27r.A0C(r1, r0)
        L_0x0a8d:
            X.8RL r1 = r2.A0c
            if (r1 == 0) goto L_0x0dcb
            X.Lmz r0 = X.C65079Lmz.A00
            r1.A0F(r0)
        L_0x0a96:
            r0 = -1154918292(0xffffffffbb29586c, float:-0.0025840057)
            goto L_0x137e
        L_0x0a9b:
            r0 = 1587583313(0x5ea09951, float:5.7861849E18)
            int r7 = X.AnonymousClass0fD.A05(r0)
            boolean r0 = r32.isActivated()
            if (r0 != 0) goto L_0x0abd
            X.LRJ r2 = X.LRJ.A02
            java.lang.Object r0 = r1.A01
            android.content.Context r1 = X.DbT.A08(r0)
            r0 = 2131955904(0x7f1310c0, float:1.9548349E38)
            r2.A01(r1, r0)
        L_0x0ab6:
            r0 = 1516361644(0x5a61d7ac, float:1.58922509E16)
            X.AnonymousClass0fD.A0C(r0, r7)
            return
        L_0x0abd:
            java.lang.Object r2 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r2 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r2
            X.861 r0 = r2.A0j
            r8 = 0
            if (r0 == 0) goto L_0x0c81
            r0.A03()
            X.27r r1 = X.JTQ.A0I(r2)
            X.4yP r0 = r1.A0J()
            if (r0 == 0) goto L_0x0ad8
            java.lang.String r0 = "TIMELINE_ADD_CAPTIONS_TAP"
            X.27r.A0C(r1, r0)
        L_0x0ad8:
            X.8RL r6 = r2.A0c
            if (r6 == 0) goto L_0x0caf
            X.KMu r0 = r2.A0i
            if (r0 == 0) goto L_0x0b2f
            X.LTY r0 = r0.A01
            X.0Ud r0 = r0.A0A
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r0 = X.0Yv.A1F(r0)
            java.util.Iterator r5 = r0.iterator()
            r4 = 0
            r9 = r4
            r3 = 0
        L_0x0af5:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0b0d
            java.lang.Object r2 = r5.next()
            r0 = r2
            X.Jyn r0 = (X.C61194Jyn) r0
            X.KhL r1 = r0.A09
            X.KhL r0 = X.C62529KhL.CAPTION_STICKER
            if (r1 != r0) goto L_0x0af5
            if (r3 != 0) goto L_0x0b10
            r9 = r2
            r3 = 1
            goto L_0x0af5
        L_0x0b0d:
            if (r3 == 0) goto L_0x0b10
            r4 = r9
        L_0x0b10:
            X.Jyn r4 = (X.C61194Jyn) r4
            if (r4 == 0) goto L_0x0b2d
            X.JwI r0 = r4.A06
            if (r0 == 0) goto L_0x0b2d
            java.lang.Object r1 = r0.A00
            X.5MI r1 = (X.AnonymousClass5MI) r1
        L_0x0b1c:
            boolean r0 = r1 instanceof android.graphics.drawable.Drawable
            if (r0 == 0) goto L_0x0b23
            r8 = r1
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
        L_0x0b23:
            r1 = 0
            X.9IF r0 = new X.9IF
            r0.<init>(r8, r1)
            r6.A0F(r0)
            goto L_0x0ab6
        L_0x0b2d:
            r1 = r8
            goto L_0x0b1c
        L_0x0b2f:
            java.lang.String r8 = "timedElementsViewModel"
            goto L_0x14c1
        L_0x0b33:
            r0 = 334411771(0x13eeb7fb, float:6.0261065E-27)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r2 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r2
            boolean r0 = com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A0K(r2)
            if (r0 != 0) goto L_0x0b65
            X.Jfo r0 = r2.A0h
            if (r0 == 0) goto L_0x0b6a
            X.861 r0 = r0.A0K
            r0.A01()
            X.27r r1 = X.JTQ.A0I(r2)
            X.4yP r0 = r1.A0J()
            if (r0 == 0) goto L_0x0b5c
            java.lang.String r0 = "TIMELINE_ADD_TEXT_ELEMENT_TAP"
            X.27r.A0C(r1, r0)
        L_0x0b5c:
            X.8RL r1 = r2.A0c
            if (r1 == 0) goto L_0x0caf
            X.Ln0 r0 = X.C65080Ln0.A00
            r1.A0F(r0)
        L_0x0b65:
            r0 = 1063914600(0x3f6a0c68, float:0.9142518)
            goto L_0x137e
        L_0x0b6a:
            java.lang.String r8 = "stackedTimelineViewModel"
            goto L_0x14c1
        L_0x0b6e:
            r0 = 183736320(0xaf39800, float:2.3457225E-32)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r1 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r1
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r1.A0Z
            if (r0 == 0) goto L_0x1481
            boolean r0 = r0.A0n()
            if (r0 == 0) goto L_0x0b94
            X.LRJ r2 = X.LRJ.A02
            android.content.Context r1 = r1.requireContext()
            r0 = 2131955902(0x7f1310be, float:1.9548345E38)
            r2.A01(r1, r0)
        L_0x0b8f:
            r0 = -1700416510(0xffffffff9aa5b402, float:-6.853322E-23)
            goto L_0x137e
        L_0x0b94:
            X.8RL r1 = r1.A0c
            if (r1 == 0) goto L_0x0caf
            X.Ln7 r0 = X.C65086Ln7.A00
            r1.A0F(r0)
            goto L_0x0b8f
        L_0x0b9e:
            r0 = 2002397539(0x775a2963, float:4.4248443E33)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r4 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r4
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r4.A0Z
            java.lang.String r8 = "clipsCreationViewModel"
            if (r0 == 0) goto L_0x14c1
            boolean r0 = r0.A0q()
            if (r0 == 0) goto L_0x0bdf
            X.LRJ r7 = X.LRJ.A02
            android.content.Context r6 = r4.requireContext()
            r5 = 2131955903(0x7f1310bf, float:1.9548347E38)
            r1 = 0
            X.0eM r0 = r4.A05
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            X.0qQ.A0B(r4, r1)
            X.0Tu r2 = X.0Tu.A06
            r0 = 36602870938080063(0x820a1e0006133f, double:3.211141196948365E-306)
            java.lang.Long r0 = X.AnonymousClass7TF.A0Y(r2, r4, r0)
            java.lang.String r0 = X.DbY.A0c(r6, r0, r5)
            r7.A02(r0)
        L_0x0bda:
            r0 = -1810074220(0xffffffff941c7594, float:-7.8991755E-27)
            goto L_0x137e
        L_0x0bdf:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r4.A0Z
            if (r0 == 0) goto L_0x14c1
            boolean r0 = r0.A0m()
            if (r0 == 0) goto L_0x0bf6
            X.LRJ r2 = X.LRJ.A02
            android.content.Context r1 = r4.requireContext()
            r0 = 2131967894(0x7f133f96, float:1.9572667E38)
        L_0x0bf2:
            r2.A01(r1, r0)
            goto L_0x0bda
        L_0x0bf6:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r4.A0Z
            if (r0 == 0) goto L_0x14c1
            boolean r0 = r0.A0p()
            if (r0 == 0) goto L_0x0c0a
            X.LRJ r2 = X.LRJ.A02
            android.content.Context r1 = r4.requireContext()
            r0 = 2131955902(0x7f1310be, float:1.9548345E38)
            goto L_0x0bf2
        L_0x0c0a:
            boolean r0 = com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A0K(r4)
            if (r0 != 0) goto L_0x0bda
            X.8RL r1 = r4.A0c
            if (r1 == 0) goto L_0x0caf
            X.Lmw r0 = X.C65076Lmw.A00
            r1.A0F(r0)
            goto L_0x0bda
        L_0x0c1a:
            r0 = 171345138(0xa3684f2, float:8.7879855E-33)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r0 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r0
            X.8RF r3 = r0.A0d
            if (r3 != 0) goto L_0x0c2d
            java.lang.String r7 = "clipsTimelineEditorViewModel"
            goto L_0x1500
        L_0x0c2d:
            r1 = -1
            X.KM9 r0 = new X.KM9
            r0.<init>(r1)
            r3.A0G(r0)
            r0 = 1482212890(0x5858c61a, float:9.5338141E14)
            goto L_0x147d
        L_0x0c3b:
            r0 = 778507591(0x2e671547, float:5.2542217E-11)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r4 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r4
            boolean r0 = com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A0K(r4)
            if (r0 != 0) goto L_0x0c7c
            X.861 r0 = r4.A0j
            if (r0 == 0) goto L_0x0c81
            r0.A01()
            X.27r r1 = X.JTQ.A0I(r4)
            X.4yP r0 = r1.A0J()
            if (r0 == 0) goto L_0x0c62
            java.lang.String r0 = "TIMELINE_ADD_CLIP_TAP"
            X.27r.A0C(r1, r0)
        L_0x0c62:
            X.8RL r2 = r4.A0c
            if (r2 == 0) goto L_0x0caf
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r4.A0Z
            if (r0 == 0) goto L_0x1481
            X.831 r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.A00(r0)
            java.util.List r0 = r0.A01
            java.lang.Integer r1 = X.C51968G9o.A0t(r0)
            X.9IF r0 = new X.9IF
            r0.<init>(r1)
            r2.A0F(r0)
        L_0x0c7c:
            r0 = 788971313(0x2f06bf31, float:1.2255154E-10)
            goto L_0x137e
        L_0x0c81:
            java.lang.String r8 = "videoPlaybackViewModel"
            goto L_0x14c1
        L_0x0c85:
            r0 = 919600082(0x36cffbd2, float:6.1983965E-6)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K5P r0 = (X.K5P) r0
            X.8RL r2 = r0.A06
            if (r2 == 0) goto L_0x0caf
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r0.A04
            if (r0 == 0) goto L_0x1481
            X.831 r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.A00(r0)
            java.util.List r0 = r0.A01
            java.lang.Integer r1 = X.C51968G9o.A0t(r0)
            X.9IF r0 = new X.9IF
            r0.<init>(r1)
            r2.A0F(r0)
            r0 = -289397818(0xffffffffeec023c6, float:-2.9732185E28)
            goto L_0x137e
        L_0x0caf:
            java.lang.String r8 = "clipsTimelineButtonEventProvider"
            goto L_0x14c1
        L_0x0cb3:
            r0 = -407576581(0xffffffffe7b4dffb, float:-1.7083154E24)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K5P r0 = (X.K5P) r0
            X.8RL r1 = r0.A06
            if (r1 == 0) goto L_0x0dcb
            X.Ln4 r0 = X.C65084Ln4.A00
            r1.A0F(r0)
            r0 = 1422544070(0x54ca4cc6, float:6.9509715E12)
            goto L_0x147d
        L_0x0ccc:
            r0 = 743224453(0x2c4cb485, float:2.9090352E-12)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K5P r0 = (X.K5P) r0
            X.8RL r1 = r0.A06
            if (r1 == 0) goto L_0x0dcb
            X.LnA r0 = X.C65089LnA.A00
            r1.A0F(r0)
            r0 = -1955180843(0xffffffff8b764ed5, float:-4.7437183E-32)
            goto L_0x147d
        L_0x0ce5:
            r0 = -794193669(0xffffffffd0a990fb, float:-2.27588076E10)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K5P r0 = (X.K5P) r0
            X.8RL r1 = r0.A06
            if (r1 == 0) goto L_0x0dcb
            X.LnF r0 = X.C65094LnF.A00
            r1.A0F(r0)
            r0 = 633152355(0x25bd2363, float:3.2810253E-16)
            goto L_0x147d
        L_0x0cfe:
            r0 = -7603422(0xffffffffff8bfb22, float:NaN)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K5P r0 = (X.K5P) r0
            X.8RL r1 = r0.A06
            if (r1 == 0) goto L_0x0dcb
            X.LnE r0 = X.C65093LnE.A00
            r1.A0F(r0)
            r0 = -1745489646(0xffffffff97f5f112, float:-1.5893609E-24)
            goto L_0x147d
        L_0x0d17:
            r0 = -649036492(0xffffffffd9507d34, float:-3.66777859E15)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K5P r0 = (X.K5P) r0
            X.8RL r1 = r0.A06
            if (r1 == 0) goto L_0x0dcb
            X.Lmw r0 = X.C65076Lmw.A00
            r1.A0F(r0)
            r0 = 1821427443(0x6c90c6f3, float:1.4001986E27)
            goto L_0x147d
        L_0x0d30:
            r0 = -1812923712(0xffffffff93f0fac0, float:-6.0831776E-27)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K5P r0 = (X.K5P) r0
            X.8RL r1 = r0.A06
            if (r1 == 0) goto L_0x0dcb
            X.Lmz r0 = X.C65079Lmz.A00
            r1.A0F(r0)
            r0 = 1772091615(0x699ff8df, float:2.4174308E25)
            goto L_0x147d
        L_0x0d49:
            r0 = -400398402(0xffffffffe82267be, float:-3.0677483E24)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K5P r0 = (X.K5P) r0
            X.8RL r1 = r0.A06
            if (r1 == 0) goto L_0x0dcb
            X.Ln0 r0 = X.C65080Ln0.A00
            r1.A0F(r0)
            r0 = 1978776793(0x75f1bcd9, float:6.1287785E32)
            goto L_0x147d
        L_0x0d62:
            r0 = -1544345791(0xffffffffa3f32741, float:-2.6362737E-17)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K5P r0 = (X.K5P) r0
            X.8RL r1 = r0.A06
            if (r1 == 0) goto L_0x0dcb
            X.Ln3 r0 = X.C65083Ln3.A00
            r1.A0F(r0)
            r0 = 1055201108(0x3ee51754, float:0.4474436)
            goto L_0x147d
        L_0x0d7b:
            r0 = 1837709852(0x6d893a1c, float:5.308712E27)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K5P r0 = (X.K5P) r0
            X.8RL r4 = r0.A06
            r3 = 0
            if (r4 == 0) goto L_0x0dcb
            r1 = 0
            X.9IF r0 = new X.9IF
            r0.<init>(r3, r1)
            r4.A0F(r0)
            r0 = 523429609(0x1f32e6e9, float:3.788397E-20)
            goto L_0x147d
        L_0x0d99:
            r0 = -1276285520(0xffffffffb3ed6db0, float:-1.10561245E-7)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K5P r0 = (X.K5P) r0
            X.8RL r1 = r0.A06
            if (r1 == 0) goto L_0x0dcb
            X.Ln8 r0 = X.C65087Ln8.A00
            r1.A0F(r0)
            r0 = 1130217842(0x435dc172, float:221.75565)
            goto L_0x147d
        L_0x0db2:
            r0 = -97571760(0xfffffffffa2f2c50, float:-2.2738768E35)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K5P r0 = (X.K5P) r0
            X.8RL r1 = r0.A06
            if (r1 == 0) goto L_0x0dcb
            X.Ln6 r0 = X.Ln6.A00
            r1.A0F(r0)
            r0 = 992067280(0x3b21bed0, float:0.0024680384)
            goto L_0x147d
        L_0x0dcb:
            java.lang.String r7 = "clipsTimelineButtonEventProvider"
            goto L_0x1500
        L_0x0dcf:
            r0 = 1827697422(0x6cf0730e, float:2.3254842E27)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dba.A1Q(r0)
            r0 = 1116673003(0x428f13eb, float:71.5389)
            goto L_0x137e
        L_0x0de0:
            r0 = 841353325(0x3226086d, float:9.6643875E-9)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.DbS.A1U(r0)
            r0 = -386809698(0xffffffffe8f1c09e, float:-9.133148E24)
            goto L_0x137e
        L_0x0df1:
            r0 = -1124440312(0xffffffffbcfa6708, float:-0.030566707)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.DbS.A1U(r0)
            r0 = 2067702096(0x7b3ea150, float:9.898082E35)
            goto L_0x137e
        L_0x0e02:
            r0 = -1425106136(0xffffffffab0e9b28, float:-5.0663857E-13)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K3n r0 = (X.C61346K3n) r0
            X.C61346K3n.A02(r0)
            r0 = 1896552755(0x710b1933, float:6.887821E29)
            goto L_0x137e
        L_0x0e15:
            r0 = -1481572399(0xffffffffa7b0ffd1, float:-4.912717E-15)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K3n r0 = (X.C61346K3n) r0
            X.C61346K3n.A02(r0)
            r0 = 1271222988(0x4bc552cc, float:2.5863576E7)
            goto L_0x137e
        L_0x0e28:
            r0 = 1781135586(0x6a29f8e2, float:5.1370944E25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.Lgk r4 = (X.C64711Lgk) r4
            X.8RF r5 = r4.A0Q
            X.8RH r2 = r5.A0E()
            boolean r1 = r2 instanceof X.AnonymousClass8RU
            if (r1 == 0) goto L_0x0e59
            com.instagram.common.session.UserSession r1 = r4.A0G
            X.27r r1 = X.27p.A01(r1)
            r1.A0T()
        L_0x0e46:
            X.8RH r1 = r5.A0E()
            boolean r2 = r1 instanceof X.AnonymousClass8RX
            X.8RG r1 = new X.8RG
            r1.<init>(r2)
            r5.A0G(r1)
            r1 = 1897949753(0x71206a39, float:7.943363E29)
            goto L_0x1403
        L_0x0e59:
            boolean r1 = r2 instanceof X.AnonymousClass8RX
            if (r1 == 0) goto L_0x0e75
            com.instagram.common.session.UserSession r1 = r4.A0G
            X.27r r4 = X.27p.A01(r1)
            X.4yP r1 = r4.A0J()
            if (r1 == 0) goto L_0x0e46
            X.JVj r3 = X.C59725JVj.POST_CAPTURE
            X.283 r1 = r4.A04
            boolean r2 = r1.A0W
            java.lang.String r1 = "TIMELINE_CHOOSE_TRANSITION_DONE"
        L_0x0e71:
            X.27r.A09(r3, r4, r1, r2)
            goto L_0x0e46
        L_0x0e75:
            boolean r1 = r2 instanceof X.AnonymousClass8RG
            if (r1 == 0) goto L_0x0e46
            X.8RH r3 = r5.A0E()
            boolean r1 = r3 instanceof X.AnonymousClass8RG
            if (r1 == 0) goto L_0x0e46
            X.8RG r3 = (X.AnonymousClass8RG) r3
            r2 = 1
            if (r3 == 0) goto L_0x0e46
            boolean r1 = r3.A00
            if (r1 != r2) goto L_0x0e46
            com.instagram.common.session.UserSession r1 = r4.A0G
            X.27r r4 = X.27p.A01(r1)
            X.4yP r1 = r4.A0J()
            if (r1 == 0) goto L_0x0e46
            X.JVj r3 = X.C59725JVj.POST_CAPTURE
            X.283 r1 = r4.A04
            boolean r2 = r1.A0W
            java.lang.String r1 = "TIMELINE_TRANSITION_DONE"
            goto L_0x0e71
        L_0x0e9f:
            r0 = -1379570921(0xffffffffadc56b17, float:-2.2443864E-11)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.Lgk r3 = (X.C64711Lgk) r3
            X.Lge r0 = r3.A0I
            r0.A04()
            X.8RF r1 = r3.A0Q
            r0 = 0
            X.JTT.A1L(r1, r0)
            com.instagram.common.session.UserSession r0 = r3.A0G
            X.27r r1 = X.27p.A01(r0)
            X.4yP r0 = r1.A0J()
            if (r0 == 0) goto L_0x0ed0
            X.283 r0 = r1.A04
            X.JVj r0 = r0.A0C
            if (r0 == 0) goto L_0x0ed0
            r0 = 2128(0x850, float:2.982E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.27r.A0C(r1, r0)
        L_0x0ed0:
            r0 = 1380789275(0x524d2c1b, float:2.20302066E11)
            goto L_0x147d
        L_0x0ed5:
            r0 = -1711102260(0xffffffff9a02a6cc, float:-2.7018107E-23)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.KM0 r0 = (X.KM0) r0
            X.8RL r1 = r0.A09
            X.9IF r0 = new X.9IF
            r0.<init>()
            r1.A0F(r0)
            r0 = -709190661(0xffffffffd5ba9bfb, float:-2.56473867E13)
            goto L_0x137e
        L_0x0eef:
            r0 = 1236536395(0x49b40c4b, float:1474953.4)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.Lgf r6 = (X.C64707Lgf) r6
            java.lang.Integer r1 = X.C64707Lgf.A02(r6)
            if (r1 == 0) goto L_0x0f08
            X.C64707Lgf.A04(r6, r1)
            r1 = -534002789(0xffffffffe02bc39b, float:-4.9507627E19)
            goto L_0x1403
        L_0x0f08:
            X.8RF r2 = r6.A06
            X.8RH r1 = r2.A0E()
            boolean r1 = r1 instanceof X.C355858Rq
            r5 = 0
            if (r1 == 0) goto L_0x0f61
            X.KMu r1 = r6.A07
            X.LTY r2 = r1.A01
            X.Jyn r1 = r2.A0F()
            if (r1 == 0) goto L_0x0f25
            X.JwI r1 = r1.A06
            if (r1 == 0) goto L_0x0f25
            java.lang.Object r5 = r1.A00
            X.5MI r5 = (X.AnonymousClass5MI) r5
        L_0x0f25:
            boolean r1 = r5 instanceof X.AnonymousClass5MH
            if (r1 == 0) goto L_0x0f45
            X.5MH r5 = (X.AnonymousClass5MH) r5
            if (r5 == 0) goto L_0x0f45
            int r4 = X.C64707Lgf.A00(r6)
            X.0eP r1 = r2.A0K(r5)
            if (r1 == 0) goto L_0x0f45
            X.8RL r3 = r6.A05
            int r2 = X.C51970G9q.A0B(r1)
            X.Jyg r1 = new X.Jyg
            r1.<init>(r5, r4, r2)
            r3.A0F(r1)
        L_0x0f45:
            com.instagram.common.session.UserSession r1 = r6.A02
            X.27r r2 = X.27p.A01(r1)
            java.lang.String r6 = "TEXT"
            X.4yP r1 = r2.A0J()
            if (r1 == 0) goto L_0x0f5c
            X.JVj r1 = X.C59725JVj.POST_CAPTURE
            r3 = 0
            java.lang.String r5 = "TIMELINE_SPLIT_TEXT_BUTTON_TAP"
            r4 = r3
            X.27r.A05(r1, r2, r3, r4, r5, r6)
        L_0x0f5c:
            r1 = -465808449(0xffffffffe43c53bf, float:-1.389609E22)
            goto L_0x1403
        L_0x0f61:
            X.JTR.A1M(r2)
            goto L_0x0f45
        L_0x0f65:
            r0 = 193121014(0xb82caf6, float:5.037956E-32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Lgg r1 = (X.C64708Lgg) r1
            X.8RF r3 = r1.A09
            X.8RH r2 = r3.A0E()
            boolean r1 = r2 instanceof X.KM2
            if (r1 != 0) goto L_0x0f8a
            boolean r1 = r2 instanceof X.C355868Rr
            if (r1 != 0) goto L_0x0f8a
            X.8Rs r1 = X.JTQ.A0J()
        L_0x0f82:
            r3.A0G(r1)
        L_0x0f85:
            r1 = 1593362487(0x5ef8c837, float:8.9633194E18)
            goto L_0x1403
        L_0x0f8a:
            boolean r1 = r2 instanceof X.C355868Rr
            if (r1 == 0) goto L_0x0f85
            X.8Rr r2 = (X.C355868Rr) r2
            int r2 = r2.A00
            X.8RW r1 = new X.8RW
            r1.<init>(r2)
            goto L_0x0f82
        L_0x0f98:
            r0 = -1249668010(0xffffffffb5839456, float:-9.803432E-7)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.Lgg r3 = (X.C64708Lgg) r3
            X.8RF r2 = r3.A09
            X.8RH r1 = r2.A0E()
            boolean r0 = r1 instanceof X.AnonymousClass8RW
            if (r0 == 0) goto L_0x1004
            java.util.HashMap r0 = r3.A0B
            r0.clear()
            X.8RW r1 = (X.AnonymousClass8RW) r1
            int r1 = r1.A00
            X.8Rr r0 = new X.8Rr
            r0.<init>(r1)
        L_0x0fbb:
            r2.A0G(r0)
            com.instagram.common.session.UserSession r0 = r3.A05
            X.27r r1 = X.27p.A01(r0)
            float r0 = r3.A00
            double r3 = (double) r0
            r7 = 0
            X.29R r5 = r1.A09
            X.0wc r0 = r5.A02
            X.1Ln r2 = X.1Ln.A08(r0)
            X.4yP r1 = r5.A0J()
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x0fff
            if (r1 == 0) goto L_0x0fff
            X.JTO.A1V(r2)
            java.lang.String r0 = "TIMELINE_SPEED_DONE_TAP"
            r2.A0r(r0)
            X.29R.A00(r2, r5)
            X.JTT.A1D(r2, r1, r5)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            java.lang.String r0 = "speed_value"
            r2.A0P(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            java.lang.String r0 = "is_ramp_on"
            r2.A0O(r0, r1)
            r2.Cgf()
        L_0x0fff:
            r0 = 566508565(0x21c43c15, float:1.329738E-18)
            goto L_0x1518
        L_0x1004:
            X.8Rs r0 = X.JTQ.A0J()
            goto L_0x0fbb
        L_0x1009:
            r0 = -2004134474(0xffffffff888b55b6, float:-8.385909E-34)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.LSO r1 = (X.LSO) r1
            boolean r0 = r1.A04()
            if (r0 == 0) goto L_0x1043
            com.instagram.common.session.UserSession r0 = r1.A02
            X.29R r4 = X.JTO.A0b(r0)
            X.0wc r0 = r4.A02
            X.1Ln r3 = X.1Ln.A08(r0)
            X.4yP r1 = r4.A0J()
            boolean r0 = X.DbT.A1Y(r3)
            if (r0 == 0) goto L_0x1043
            if (r1 == 0) goto L_0x1043
            X.JTO.A1V(r3)
            java.lang.String r0 = "TIMELINE_SLIP_TAP"
            r3.A0r(r0)
            X.29R.A00(r3, r4)
            X.JTT.A1D(r3, r1, r4)
            r3.Cgf()
        L_0x1043:
            r0 = 612123406(0x247c430e, float:5.4700587E-17)
            goto L_0x147d
        L_0x1048:
            r0 = -1589152917(0xffffffffa147736b, float:-6.7576577E-19)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.LgY r5 = (X.C64703LgY) r5
            X.8RF r3 = r5.A03
            X.8RH r9 = r3.A0E()
            boolean r0 = r9 instanceof X.C355868Rr
            if (r0 == 0) goto L_0x110a
            X.861 r0 = r5.A04
            r0.A01()
            r0.A00()
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r8 = r5.A01
            int r0 = X.JTO.A07(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A08 = r0
            com.instagram.common.session.UserSession r7 = r5.A00
            X.29R r6 = X.JTO.A0b(r7)
            X.0wc r0 = r6.A02
            X.1Ln r4 = X.1Ln.A08(r0)
            X.4yP r1 = r6.A0J()
            boolean r0 = X.DbT.A1Y(r4)
            if (r0 == 0) goto L_0x10a3
            if (r1 == 0) goto L_0x10a3
            X.JTO.A1V(r4)
            java.lang.String r0 = "TIMELINE_SWAP_TAP"
            X.283 r1 = X.Dbc.A08(r4, r1, r6, r0)
            X.0iw r0 = X.27x.A09
            java.lang.String r0 = r0.getModuleName()
            r4.A0n(r0)
            X.28t r0 = r1.A0A
            r4.A0c(r0)
            X.JTS.A1E(r4)
        L_0x10a3:
            X.8Rr r9 = (X.C355868Rr) r9
            int r6 = r9.A00
            X.2gB r1 = r8.A0G
            X.831 r0 = X.JTO.A0h(r1)
            if (r0 == 0) goto L_0x1120
            X.51M r0 = X.JTO.A0f(r0, r6)
            if (r0 == 0) goto L_0x1120
            X.51R r0 = r0.A0F
            java.util.List r0 = r0.A0J
            if (r0 == 0) goto L_0x1120
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x1120
            X.KM3 r0 = new X.KM3
            r0.<init>(r6)
        L_0x10c6:
            X.8RH r0 = (X.AnonymousClass8RH) r0
            r3.A0G(r0)
            X.831 r0 = X.JTO.A0h(r1)
            if (r0 == 0) goto L_0x110f
            X.51M r4 = X.JTO.A0f(r0, r6)
            if (r4 == 0) goto L_0x1110
            X.51R r0 = r4.A0F
            java.util.List r0 = r0.A0J
            if (r0 == 0) goto L_0x1110
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x1110
            X.8RL r3 = r5.A02
            X.Jye r0 = new X.Jye
            r0.<init>(r6)
        L_0x10ea:
            X.MQQ r0 = (X.MQQ) r0
            r3.A0F(r0)
            java.lang.Integer r0 = r8.A0I(r6)
            r5.A07 = r0
            X.0Tu r3 = X.0Tu.A06
            r0 = 36318161850734546(0x81072d000217d2, double:3.031090023679585E-306)
            boolean r0 = X.182.A06(r3, r7, r0)
            if (r0 == 0) goto L_0x110a
            r5.A06 = r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r5.A09 = r0
        L_0x110a:
            r0 = 828293731(0x315ec263, float:3.2415748E-9)
            goto L_0x147d
        L_0x110f:
            r4 = 0
        L_0x1110:
            X.8RL r3 = r5.A02
            X.831 r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.A00(r8)
            int r1 = X.JTO.A08(r0)
            X.9cr r0 = new X.9cr
            r0.<init>(r1, r6)
            goto L_0x10ea
        L_0x1120:
            X.KM5 r0 = new X.KM5
            r0.<init>(r6)
            goto L_0x10c6
        L_0x1126:
            r0 = 1587215251(0x5e9afb93, float:5.5838407E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.Lga r4 = (X.C64704Lga) r4
            X.8RF r3 = r4.A06
            X.8RH r2 = r3.A0E()
            boolean r1 = r2 instanceof X.C355868Rr
            if (r1 == 0) goto L_0x11a8
            X.8Rr r2 = (X.C355868Rr) r2
            int r10 = r2.A00
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r1 = r4.A04
            X.831 r1 = r1.A0G()
            X.51O r6 = r1.A04(r10)
            X.51N r6 = (X.AnonymousClass51N) r6
            if (r6 == 0) goto L_0x11a4
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            X.KM6 r1 = new X.KM6
            r1.<init>(r10, r2)
            r3.A0G(r1)
            X.8RL r3 = r4.A05
            r2 = 0
            X.Jyf r1 = new X.Jyf
            r1.<init>(r10, r2)
            r3.A0F(r1)
            X.Jfn r5 = r4.A03
            r1 = 21
            X.MIh r9 = new X.MIh
            r9.<init>(r4, r1)
            r1 = 40
            X.MId r7 = X.JTO.A1C(r4, r1)
            r1 = 41
            X.MId r8 = X.JTO.A1C(r4, r1)
            boolean r1 = r6 instanceof X.AnonymousClass51M
            if (r1 != 0) goto L_0x1187
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r7.invoke(r1)
        L_0x1182:
            r1 = 657252921(0x272ce239, float:2.399243E-15)
            goto L_0x1403
        L_0x1187:
            X.MN1 r4 = new X.MN1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.0eM r1 = r5.A05
            java.lang.Object r1 = r1.getValue()
            X.S0L r1 = (X.S0L) r1
            com.google.common.util.concurrent.SettableFuture r3 = r1.A00()
            r1 = 1
            X.LcN r2 = new X.LcN
            r2.<init>(r4, r1)
            X.3z9 r1 = r5.A03
            X.C255183ti.A04(r2, r3, r1)
            goto L_0x1182
        L_0x11a4:
            X.C64704Lga.A00(r4, r10)
            goto L_0x1182
        L_0x11a8:
            X.JTR.A1M(r3)
            goto L_0x1182
        L_0x11ac:
            r0 = -138352982(0xfffffffff7c0e6aa, float:-7.8249955E33)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.LgX r2 = (X.C64702LgX) r2
            X.8YU r1 = r2.A00
            X.8YU r0 = X.AnonymousClass8YU.PLAYING
            if (r1 != r0) goto L_0x11ef
            X.861 r0 = r2.A03
            r0.A01()
        L_0x11c2:
            X.MXI r0 = r2.A02
            boolean r1 = r0 instanceof com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController
            com.instagram.common.session.UserSession r0 = r2.A01
            X.27r r3 = X.27p.A01(r0)
            X.4yP r0 = r3.A0J()
            if (r1 == 0) goto L_0x11e1
            if (r0 == 0) goto L_0x11dc
            X.JVj r2 = X.C59725JVj.POST_CAPTURE
            r1 = 1
            java.lang.String r0 = "TIMELINE_PLAY_PREVIEW_TAP"
        L_0x11d9:
            X.27r.A08(r2, r3, r0, r1)
        L_0x11dc:
            r0 = 1729569670(0x67172386, float:7.137326E23)
            goto L_0x1518
        L_0x11e1:
            if (r0 == 0) goto L_0x11dc
            X.283 r0 = r3.A04
            X.JVj r0 = r0.A0C
            if (r0 == 0) goto L_0x11dc
            X.JVj r2 = X.C59725JVj.POST_CAPTURE
            r1 = 1
            java.lang.String r0 = "PAUSE_PLAY_BUTTON"
            goto L_0x11d9
        L_0x11ef:
            X.MXI r0 = r2.A02
            X.8RH r0 = r0.AuZ()
            boolean r1 = r0 instanceof X.AnonymousClass8RX
            X.861 r0 = r2.A03
            if (r1 == 0) goto L_0x11ff
            r0.A02()
            goto L_0x11c2
        L_0x11ff:
            r0.A03()
            goto L_0x11c2
        L_0x1203:
            r0 = 61381876(0x3a89cf4, float:9.910187E-37)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetViewController r5 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetViewController) r5
            X.8RF r0 = r5.A0G
            X.8RH r1 = r0.A0E()
            boolean r0 = r1 instanceof X.C355838Ro
            if (r0 == 0) goto L_0x1234
            com.instagram.common.session.UserSession r0 = r5.A0D
            X.27r r1 = X.27p.A01(r0)
            java.lang.String r0 = "TIMELINE_TEXT_VOICE_DONE_TAP"
            X.27r.A0C(r1, r0)
        L_0x1223:
            X.MXK r0 = r5.A07
            if (r0 == 0) goto L_0x122a
            r0.AJD()
        L_0x122a:
            X.Jfl r0 = r5.A0F
            r0.A0E()
            r0 = 802937863(0x2fdbdc07, float:3.9992207E-10)
            goto L_0x1518
        L_0x1234:
            boolean r0 = r1 instanceof X.C355798Rk
            if (r0 == 0) goto L_0x1223
            com.instagram.common.session.UserSession r0 = r5.A0D
            X.27r r4 = X.27p.A01(r0)
            X.8II r0 = r5.A0E
            X.8IL r0 = r0.A0E()
            if (r0 == 0) goto L_0x125d
            X.8IJ r1 = r0.A01
        L_0x1248:
            X.4yP r0 = r4.A0J()
            if (r0 == 0) goto L_0x1223
            X.283 r0 = r4.A04
            X.JVj r3 = r0.A0C
            r2 = 1
            X.80P r1 = X.27r.A00(r1)
            java.lang.String r0 = "AUDIO_FILTERS_DONE_TAP"
            X.27r.A04(r3, r1, r4, r0, r2)
            goto L_0x1223
        L_0x125d:
            r1 = 0
            goto L_0x1248
        L_0x125f:
            r0 = -848014683(0xffffffffcd7452a5, float:-2.56191056E8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetViewController r3 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetViewController) r3
            X.8RF r1 = r3.A0G
            X.8RH r1 = r1.A0E()
            boolean r1 = r1 instanceof X.C355838Ro
            if (r1 == 0) goto L_0x127f
            com.instagram.common.session.UserSession r1 = r3.A0D
            X.27r r2 = X.27p.A01(r1)
            java.lang.String r1 = "TIMELINE_TEXT_VOICE_CANCEL_TAP"
            X.27r.A0C(r2, r1)
        L_0x127f:
            X.MXK r1 = r3.A07
            if (r1 == 0) goto L_0x1286
            r1.cancel()
        L_0x1286:
            X.Jfl r1 = r3.A0F
            r1.A0E()
            r1 = -891642823(0xffffffffcada9c39, float:-7163420.5)
            goto L_0x1403
        L_0x1290:
            r0 = -1620019937(0xffffffff9f70751f, float:-5.0918857E-20)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r4 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController) r4
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r2 = r4.A04
            X.8RF r1 = r4.A07
            r0 = 0
            if (r1 == 0) goto L_0x12b4
            X.2Fj r1 = r1.A06
            java.lang.Object r1 = r1.A02()
            X.88W r1 = (X.AnonymousClass88W) r1
            if (r1 == 0) goto L_0x12b4
            java.lang.Object r1 = r1.A01
            X.L7y r1 = (X.C63817L7y) r1
            if (r1 == 0) goto L_0x12b4
            java.lang.String r0 = r1.A01
        L_0x12b4:
            r2.A0g(r0)
            com.instagram.common.session.UserSession r0 = r4.A03
            X.27r r3 = X.27p.A01(r0)
            X.4yP r0 = r3.A0J()
            if (r0 == 0) goto L_0x12ce
            X.JVj r2 = X.C59725JVj.POST_CAPTURE
            X.283 r0 = r3.A04
            boolean r1 = r0.A0W
            java.lang.String r0 = "TIMELINE_TRANSITION_APPLY_TO_ALL_CLIPS"
            X.27r.A09(r2, r3, r0, r1)
        L_0x12ce:
            X.4DH r1 = r4.A02
            boolean r0 = r1 instanceof X.AnonymousClass4DR
            if (r0 == 0) goto L_0x12db
            X.4DR r1 = (X.AnonymousClass4DR) r1
            if (r1 == 0) goto L_0x12db
            r1.onBackPressed()
        L_0x12db:
            r0 = -2000241241(0xffffffff88c6bda7, float:-1.1961279E-33)
            goto L_0x1518
        L_0x12e0:
            r0 = -938401293(0xffffffffc81121f3, float:-148615.8)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.JlR r1 = (X.C60434JlR) r1
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x12f8
            X.KMT r0 = r1.A01
            if (r0 == 0) goto L_0x12f8
            X.KMu r0 = r0.A0J
            r0.A0S()
        L_0x12f8:
            r0 = 1358782380(0x50fd5fac, float:3.40072448E10)
            goto L_0x147d
        L_0x12fd:
            r0 = -1450581455(0xffffffffa989e231, float:-6.12326E-14)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.JlR r1 = (X.C60434JlR) r1
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x1311
            X.0sa r0 = r1.A0D
            r0.invoke()
        L_0x1311:
            r0 = 1032092063(0x3d84799f, float:0.0646851)
            goto L_0x147d
        L_0x1316:
            r0 = -123554451(0xfffffffff8a2b56d, float:-2.6400995E34)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineMiddleActionBarViewControllerImpl r3 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineMiddleActionBarViewControllerImpl) r3
            X.4DH r2 = r3.A00
            boolean r0 = r2 instanceof com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment
            if (r0 == 0) goto L_0x133b
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r2 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r2
        L_0x1329:
            r1 = 1
            if (r2 == 0) goto L_0x132f
            r2.A0W()
        L_0x132f:
            com.instagram.common.ui.base.IgSimpleImageView r0 = r3.redoButton
            if (r0 == 0) goto L_0x1336
            r0.performHapticFeedback(r1)
        L_0x1336:
            r0 = 97384659(0x5cdf8d3, float:1.9369511E-35)
            goto L_0x1518
        L_0x133b:
            r2 = 0
            goto L_0x1329
        L_0x133d:
            r0 = 491521710(0x1d4c06ae, float:2.7002629E-21)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineMiddleActionBarViewControllerImpl r3 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineMiddleActionBarViewControllerImpl) r3
            X.4DH r2 = r3.A00
            boolean r0 = r2 instanceof com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment
            if (r0 == 0) goto L_0x1362
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r2 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r2
        L_0x1350:
            r1 = 1
            if (r2 == 0) goto L_0x1356
            r2.A0X()
        L_0x1356:
            com.instagram.common.ui.base.IgSimpleImageView r0 = r3.undoButton
            if (r0 == 0) goto L_0x135d
            r0.performHapticFeedback(r1)
        L_0x135d:
            r0 = -1712236232(0xffffffff99f15938, float:-2.4954851E-23)
            goto L_0x1518
        L_0x1362:
            r2 = 0
            goto L_0x1350
        L_0x1364:
            r0 = 1852130710(0x6e654596, float:1.7739048E28)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r2 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r2
            X.27r r1 = X.JTQ.A0I(r2)
            java.lang.String r0 = "TIMELINE_VOICEOVER_ADD_TAP"
            X.27r.A0C(r1, r0)
            r2.A0U()
            r0 = 716973553(0x2abc25f1, float:3.3421836E-13)
        L_0x137e:
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x1382:
            r0 = 1848344675(0x6e2b8063, float:1.3269287E28)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.BaselStackedTimelineMiddleActionViewControllerImpl r3 = (com.instagram.creation.capture.quickcapture.sundial.edit.BaselStackedTimelineMiddleActionViewControllerImpl) r3
            X.4DH r2 = r3.A02
            boolean r0 = r2 instanceof com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment
            if (r0 == 0) goto L_0x13a7
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r2 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r2
        L_0x1395:
            r1 = 1
            if (r2 == 0) goto L_0x139b
            r2.A0W()
        L_0x139b:
            com.instagram.common.ui.base.IgSimpleImageView r0 = r3.redoButton
            if (r0 == 0) goto L_0x13a2
            r0.performHapticFeedback(r1)
        L_0x13a2:
            r0 = -1615139268(0xffffffff9fbaee3c, float:-7.916819E-20)
            goto L_0x1518
        L_0x13a7:
            r2 = 0
            goto L_0x1395
        L_0x13a9:
            r0 = -1752301990(0xffffffff978dfe5a, float:-9.176119E-25)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.BaselStackedTimelineMiddleActionViewControllerImpl r3 = (com.instagram.creation.capture.quickcapture.sundial.edit.BaselStackedTimelineMiddleActionViewControllerImpl) r3
            X.4DH r2 = r3.A02
            boolean r0 = r2 instanceof com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment
            if (r0 == 0) goto L_0x13ce
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r2 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r2
        L_0x13bc:
            r1 = 1
            if (r2 == 0) goto L_0x13c2
            r2.A0X()
        L_0x13c2:
            com.instagram.common.ui.base.IgSimpleImageView r0 = r3.undoButton
            if (r0 == 0) goto L_0x13c9
            r0.performHapticFeedback(r1)
        L_0x13c9:
            r0 = -209475123(0xfffffffff383a9cd, float:-2.086288E31)
            goto L_0x1518
        L_0x13ce:
            r2 = 0
            goto L_0x13bc
        L_0x13d0:
            r0 = -1121315599(0xffffffffbd2a14f1, float:-0.041523878)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController r3 = (com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController) r3
            r2 = 1
            X.MXJ r1 = r3.A03
            if (r1 == 0) goto L_0x13e3
            r1.AJD()
        L_0x13e3:
            r3.A03(r2)
            r1 = -2037193171(0xffffffff8692e62d, float:-5.525731E-35)
            goto L_0x1403
        L_0x13ea:
            r0 = 1786088480(0x6a758c20, float:7.4212136E25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController r3 = (com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController) r3
            r2 = 1
            X.MXJ r1 = r3.A03
            if (r1 == 0) goto L_0x13fd
            r1.cancel()
        L_0x13fd:
            r3.A03(r2)
            r1 = 1494106700(0x590e424c, float:2.5026463E15)
        L_0x1403:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x1407:
            r0 = -1222282058(0xffffffffb72574b6, float:-9.86194E-6)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dba.A1Q(r0)
            r0 = -995345244(0xffffffffc4ac3ca4, float:-1377.895)
            goto L_0x147d
        L_0x1417:
            r0 = -1450499299(0xffffffffa98b231d, float:-6.178931E-14)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LxB r0 = (X.C65634LxB) r0
            com.instagram.common.session.UserSession r5 = r0.A02
            X.K7n r4 = r0.A05
            X.K7Z r3 = new X.K7Z
            r3.<init>()
            android.os.Bundle r0 = X.JTP.A0F(r5)
            r3.setArguments(r0)
            r3.A02 = r4
            androidx.fragment.app.Fragment r1 = r4.mParentFragment     // Catch:{ IllegalArgumentException -> 0x1458 }
            boolean r0 = r1 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment     // Catch:{ IllegalArgumentException -> 0x1458 }
            if (r0 == 0) goto L_0x1467
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r1     // Catch:{ IllegalArgumentException -> 0x1458 }
            if (r1 == 0) goto L_0x1467
            X.7Pu r2 = r1.A02     // Catch:{ IllegalArgumentException -> 0x1458 }
            if (r2 == 0) goto L_0x1467
            X.7Pr r1 = X.DbS.A0W(r5)     // Catch:{ IllegalArgumentException -> 0x1458 }
            r0 = 2131971390(0x7f134d3e, float:1.9579758E38)
            java.lang.CharSequence r0 = r4.getText(r0)     // Catch:{ IllegalArgumentException -> 0x1458 }
            r1.A0d = r0     // Catch:{ IllegalArgumentException -> 0x1458 }
            r0 = 1058642330(0x3f19999a, float:0.6)
            r1.A03 = r0     // Catch:{ IllegalArgumentException -> 0x1458 }
            r2.A0F(r3, r1)     // Catch:{ IllegalArgumentException -> 0x1458 }
            goto L_0x1467
        L_0x1458:
            androidx.fragment.app.Fragment r1 = r4.mParentFragment
            boolean r0 = r1 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r0 == 0) goto L_0x1467
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r1
            if (r1 == 0) goto L_0x1467
            X.7Pu r0 = r1.A02
            X.DbW.A1K(r0)
        L_0x1467:
            r0 = -2115434962(0xffffffff81e9062e, float:-8.559955E-38)
            goto L_0x1518
        L_0x146c:
            r0 = 929636517(0x376920a5, float:1.3895483E-5)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K7n r0 = (X.C61438K7n) r0
            X.C61438K7n.A03(r0)
            r0 = -2023452881(0xffffffff87648f2f, float:-1.7194891E-34)
        L_0x147d:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x1481:
            java.lang.String r8 = "clipsCreationViewModel"
            goto L_0x14c1
        L_0x1484:
            java.lang.String r8 = "videoTrackViewController"
            goto L_0x14c1
        L_0x1487:
            java.lang.String r8 = "clipsTimelineEditorViewModel"
            goto L_0x14c1
        L_0x148a:
            r0 = 1607151742(0x5fcb307e, float:2.9282682E19)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r6 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r6
            X.8RF r0 = r6.A0d
            java.lang.String r8 = "clipsTimelineEditorViewModel"
            if (r0 == 0) goto L_0x14c1
            X.8RH r1 = r0.A0E()
            boolean r0 = r1 instanceof X.C355748Rf
            if (r0 == 0) goto L_0x1538
            X.8Rf r1 = (X.C355748Rf) r1
            if (r1 == 0) goto L_0x1538
            X.8RF r3 = r6.A0d
            if (r3 == 0) goto L_0x14c1
            int r2 = r1.A00
            int r1 = r1.A01
            X.8Rk r0 = new X.8Rk
            r0.<init>(r2, r1)
            r3.A0G(r0)
            X.27r r4 = X.JTQ.A0I(r6)
            X.8II r0 = r6.A0A
            if (r0 != 0) goto L_0x151c
            java.lang.String r8 = "audioFilterViewModel"
        L_0x14c1:
            X.0qQ.A0F(r8)
            goto L_0x1503
        L_0x14c5:
            r0 = 1809362476(0x6bd8ae2c, float:5.2390096E26)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.KLp r5 = (X.C61776KLp) r5
            X.8II r0 = r5.A04
            if (r0 == 0) goto L_0x1508
            X.8IL r0 = r0.A0E()
            if (r0 == 0) goto L_0x1508
            X.8IJ r1 = r0.A01
        L_0x14dc:
            com.instagram.common.session.UserSession r0 = r5.A03
            X.27r r4 = X.27p.A01(r0)
            X.4yP r0 = r4.A0J()
            if (r0 == 0) goto L_0x14f6
            X.283 r0 = r4.A04
            X.JVj r3 = r0.A0C
            r2 = 0
            X.80P r1 = X.27r.A00(r1)
            java.lang.String r0 = "AUDIO_FILTERS_FROM_BROWSER_DONE_TAP"
            X.27r.A04(r3, r1, r4, r0, r2)
        L_0x14f6:
            X.L1z r0 = r5.A07
            X.8a4 r0 = r0.A00
            com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController r2 = r0.A0K
            if (r2 != 0) goto L_0x150a
            java.lang.String r7 = "bottomSheetViewController"
        L_0x1500:
            X.0qQ.A0F(r7)
        L_0x1503:
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x1508:
            r1 = 0
            goto L_0x14dc
        L_0x150a:
            r1 = 1
            X.MXJ r0 = r2.A03
            if (r0 == 0) goto L_0x1512
            r0.AJD()
        L_0x1512:
            r2.A03(r1)
            r0 = -1730809567(0xffffffff98d5f121, float:-5.5302687E-24)
        L_0x1518:
            X.AnonymousClass0fD.A0C(r0, r6)
            return
        L_0x151c:
            X.8IL r0 = r0.A0E()
            if (r0 == 0) goto L_0x153f
            X.8IJ r1 = r0.A01
        L_0x1524:
            X.4yP r0 = r4.A0J()
            if (r0 == 0) goto L_0x1538
            X.283 r0 = r4.A04
            X.JVj r3 = r0.A0C
            r2 = 1
            X.80P r1 = X.27r.A00(r1)
            java.lang.String r0 = "AUDIO_FILTERS_TAP"
            X.27r.A04(r3, r1, r4, r0, r2)
        L_0x1538:
            r0 = 1724412604(0x66c872bc, float:4.732949E23)
        L_0x153b:
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        L_0x153f:
            r1 = 0
            goto L_0x1524
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LY4.onClick(android.view.View):void");
    }
}

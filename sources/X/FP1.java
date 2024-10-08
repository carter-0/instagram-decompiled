package X;

import android.view.View;

public final class FP1 implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public FP1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static FP1 A00(Object obj, int i) {
        return new FP1(obj, i);
    }

    public static void A01(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new FP1(obj, i), view);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x071c: MOVE  (r5v18 com.instagram.igds.components.bottomsheet.BottomSheetFragment) = 
          (r5v17 com.instagram.igds.components.bottomsheet.BottomSheetFragment)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onClick(android.view.View r21) {
        /*
            r20 = this;
            r1 = r20
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0d19;
                case 1: goto L_0x0d06;
                case 2: goto L_0x0cf1;
                case 3: goto L_0x0ccc;
                case 4: goto L_0x0ca2;
                case 5: goto L_0x0c89;
                case 6: goto L_0x0c3a;
                case 7: goto L_0x0c13;
                case 8: goto L_0x0be3;
                case 9: goto L_0x0bd0;
                case 10: goto L_0x0bbd;
                case 11: goto L_0x0b14;
                case 12: goto L_0x0aed;
                case 13: goto L_0x0ac6;
                case 14: goto L_0x0aaf;
                case 15: goto L_0x0a8b;
                case 16: goto L_0x0a5d;
                case 17: goto L_0x0a3a;
                case 18: goto L_0x0a1e;
                case 19: goto L_0x0614;
                case 20: goto L_0x09f4;
                case 21: goto L_0x09e3;
                case 22: goto L_0x09b8;
                case 23: goto L_0x09a3;
                case 24: goto L_0x0969;
                case 25: goto L_0x0956;
                case 26: goto L_0x0943;
                case 27: goto L_0x0915;
                case 28: goto L_0x08e3;
                case 29: goto L_0x08d0;
                case 30: goto L_0x089f;
                case 31: goto L_0x0875;
                case 32: goto L_0x0854;
                case 33: goto L_0x082a;
                case 34: goto L_0x06c5;
                case 35: goto L_0x0817;
                case 36: goto L_0x0804;
                case 37: goto L_0x07d6;
                case 38: goto L_0x07ad;
                case 39: goto L_0x079a;
                case 40: goto L_0x073b;
                case 41: goto L_0x05be;
                case 42: goto L_0x0568;
                case 43: goto L_0x0534;
                case 44: goto L_0x04d3;
                case 45: goto L_0x046c;
                case 46: goto L_0x0420;
                case 47: goto L_0x03bc;
                case 48: goto L_0x0386;
                case 49: goto L_0x036f;
                case 50: goto L_0x0353;
                case 51: goto L_0x033c;
                case 52: goto L_0x0320;
                case 53: goto L_0x0304;
                case 54: goto L_0x02e8;
                case 55: goto L_0x02d5;
                case 56: goto L_0x02c0;
                case 57: goto L_0x02ab;
                case 58: goto L_0x0292;
                case 59: goto L_0x0274;
                case 60: goto L_0x0256;
                case 61: goto L_0x0238;
                case 62: goto L_0x0224;
                case 63: goto L_0x01c8;
                case 64: goto L_0x01a5;
                case 65: goto L_0x016c;
                case 66: goto L_0x010f;
                case 67: goto L_0x00d2;
                case 68: goto L_0x0082;
                case 69: goto L_0x0033;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = -618879103(0xffffffffdb1ca781, float:-4.4094269E16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.ESR r4 = (X.ESR) r4
            com.instagram.common.session.UserSession r1 = r4.A01
            X.1NY r3 = X.DbU.A0N(r1)
            java.lang.String r1 = "accounts/regen_backup_codes/"
            r3.A0A(r1)
            java.lang.Class<X.DwU> r2 = X.DwU.class
            java.lang.Class<X.F65> r1 = X.F65.class
            X.1OC r2 = X.DbY.A0N(r3, r2, r1)
            X.1P0 r1 = r4.A06
            r2.A00 = r1
            r4.schedule(r2)
            r1 = 40008757(0x2627c35, float:1.6639503E-37)
        L_0x002f:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x0033:
            r0 = 934877928(0x37b91ae8, float:2.2066248E-5)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.8g6 r6 = X.C361358g6.A00
            java.lang.Object r4 = r1.A01
            X.E5r r4 = (X.C47508E5r) r4
            androidx.fragment.app.FragmentActivity r5 = r4.requireActivity()
            X.0eM r3 = r4.A00
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r3)
            r1 = 0
            r6.A01(r2, r5, r1)
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r3)
            X.FA7 r2 = X.C48962En0.A00(r2, r1)
            X.0eM r1 = r2.A00
            boolean r1 = X.AnonymousClass7TF.A1Z(r1)
            if (r1 == 0) goto L_0x007b
            X.0eM r1 = r2.A01
            java.lang.Object r2 = r1.getValue()
            X.0wc r2 = (X.0wc) r2
            java.lang.String r1 = "ig_lock_screen_shortcuts"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r2.isSampled()
            if (r1 == 0) goto L_0x007b
            java.lang.String r1 = "onboarding_dialog_right_tapped"
            X.DbV.A1G(r2, r1)
        L_0x007b:
            X.DbZ.A15(r4)
            r1 = -1667776004(0xffffffff9c97c1fc, float:-1.0042486E-21)
            goto L_0x002f
        L_0x0082:
            r0 = -1159494356(0xffffffffbae3852c, float:-0.0017358414)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.8g6 r6 = X.C361358g6.A00
            java.lang.Object r4 = r1.A01
            X.E5r r4 = (X.C47508E5r) r4
            androidx.fragment.app.FragmentActivity r5 = r4.requireActivity()
            X.0eM r3 = r4.A00
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r3)
            r1 = 1
            r6.A01(r2, r5, r1)
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r3)
            X.FA7 r2 = X.C48962En0.A00(r2, r1)
            X.0eM r1 = r2.A00
            boolean r1 = X.AnonymousClass7TF.A1Z(r1)
            if (r1 == 0) goto L_0x00ca
            X.0eM r1 = r2.A01
            java.lang.Object r2 = r1.getValue()
            X.0wc r2 = (X.0wc) r2
            java.lang.String r1 = "ig_lock_screen_shortcuts"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r2.isSampled()
            if (r1 == 0) goto L_0x00ca
            java.lang.String r1 = "onboarding_dialog_left_tapped"
            X.DbV.A1G(r2, r1)
        L_0x00ca:
            X.DbZ.A15(r4)
            r1 = -988930193(0xffffffffc50e1f6f, float:-2273.9646)
            goto L_0x002f
        L_0x00d2:
            r0 = 975109099(0x3a1efbeb, float:6.0647604E-4)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.Ubm r5 = (X.C15387Ubm) r5
            X.ERr r4 = new X.ERr
            r4.<init>()
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            X.UXv r1 = r5.A02
            X.VSp r1 = r1.A00
            if (r1 == 0) goto L_0x00f1
            com.instagram.user.model.User r1 = r1.A01
            r2 = 1
            if (r1 != 0) goto L_0x00f2
        L_0x00f1:
            r2 = 0
        L_0x00f2:
            java.lang.String r1 = "show_linked_business_report_options"
            r3.putBoolean(r1, r2)
            r4.setArguments(r3)
            X.Eu7 r1 = new X.Eu7
            r1.<init>(r5)
            r4.A00 = r1
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            com.instagram.common.session.UserSession r1 = r5.A00
            X.Dbb.A12(r4, r2, r1)
            r1 = -1827030619(0xffffffff9319b9a5, float:-1.9402845E-27)
            goto L_0x002f
        L_0x010f:
            r0 = 1313158210(0x4e453442, float:8.2713408E8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.Ubm r6 = (X.C15387Ubm) r6
            r2 = 2787(0xae3, float:3.905E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            X.C15387Ubm.A05(r6, r2)
            java.lang.Integer r8 = X.AnonymousClass05K.A0C
            java.lang.String r10 = r6.A05
            r9 = 0
            r12 = 7
            X.JwB r7 = new X.JwB
            r11 = r9
            r7.<init>((java.lang.Integer) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (int) r12)
            com.instagram.common.session.UserSession r5 = r6.A00
            r2 = 0
            X.0qQ.A0B(r5, r2)
            androidx.fragment.app.FragmentActivity r4 = r6.requireActivity()
            r2 = 693(0x2b5, float:9.71E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            X.E1T r3 = new X.E1T
            r3.<init>()
            android.os.Bundle r2 = X.C48758Ejh.A00(r7, r8, r2)
            r3.setArguments(r2)
            X.Dbb.A0o(r9, r3, r4, r5)
            androidx.fragment.app.FragmentActivity r5 = r6.requireActivity()
            r2 = 1
            X.FTv r4 = new X.FTv
            r4.<init>(r1, r2)
            X.0hq r3 = r5.getSupportFragmentManager()
            r1 = 3
            X.FQm r2 = new X.FQm
            r2.<init>(r4, r1)
            java.lang.String r1 = "page_linking_request"
            r3.A0v(r2, r5, r1)
            r1 = 105247555(0x645f343, float:3.7230302E-35)
            goto L_0x002f
        L_0x016c:
            r0 = -502860094(0xffffffffe206f6c2, float:-6.224111E20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.Ubm r4 = (X.C15387Ubm) r4
            android.content.Context r2 = r4.requireContext()
            com.instagram.common.session.UserSession r1 = r4.A00
            X.Dg1 r3 = new X.Dg1
            r3.<init>(r2, r1)
            r1 = 2131971922(0x7f134f52, float:1.9580837E38)
            r3.A01(r1)
            r2 = 2131971921(0x7f134f51, float:1.9580835E38)
            r1 = 67
            X.FP1 r1 = A00(r4, r1)
            r3.A02(r1, r2)
            X.FFy r2 = new X.FFy
            r2.<init>(r3)
            android.content.Context r1 = r4.getContext()
            r2.A05(r1)
            r1 = 2066612138(0x7b2dffaa, float:9.0345284E35)
            goto L_0x002f
        L_0x01a5:
            r0 = -587465395(0xffffffffdcfbfd4d, float:-5.6742981E17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.E46 r2 = (X.E46) r2
            X.0eM r1 = r2.A02
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            android.content.Context r3 = r2.requireContext()
            androidx.fragment.app.FragmentActivity r2 = r2.getActivity()
            java.lang.String r1 = "https://www.facebook.com/business/help/219356599612120?id=735435806665862"
            X.W3L.A07(r2, r3, r4, r1)
            r1 = 1184879415(0x469fd337, float:20457.607)
            goto L_0x002f
        L_0x01c8:
            r0 = -123137135(0xfffffffff8a91391, float:-2.743422E34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.E46 r3 = (X.E46) r3
            X.WYZ r7 = r3.A00
            r6 = 0
            if (r7 != 0) goto L_0x01dc
            java.lang.String r8 = "logger"
            goto L_0x0c57
        L_0x01dc:
            java.lang.Long r8 = r3.A01
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = "FLAGGED_FORM"
            java.lang.String r12 = X.DbT.A12(r2, r1)
            java.lang.String r9 = "lead_gen_flagged_form"
            java.lang.String r10 = "update_form"
            java.lang.String r11 = "click"
            X.1Ln r1 = X.WYZ.A00(r7, r8, r9, r10, r11, r12)
            r1.Cgf()
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            X.0eM r1 = r3.A02
            X.6Yo r4 = X.DbX.A0N(r2, r1)
            X.F3v r3 = X.DbU.A0R()
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r1)
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            r11 = 0
            java.lang.String r9 = ""
            com.instagram.leadgen.core.model.LeadGenBaseFormList r5 = new com.instagram.leadgen.core.model.LeadGenBaseFormList
            r7 = r6
            r8 = r6
            r5.<init>(r6, r7, r8, r9, r10, r11)
            java.lang.String r1 = "lead_gen_flagged_form_entrypoint"
            androidx.fragment.app.Fragment r1 = r3.A03(r2, r5, r1)
            r4.A0B(r6, r1)
            r4.A04()
            r1 = -668117444(0xffffffffd82d563c, float:-7.6234354E14)
            goto L_0x002f
        L_0x0224:
            r0 = -554423977(0xffffffffdef42957, float:-8.7968445E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.70R r2 = (X.AnonymousClass70R) r2
            r1 = 0
            r2.DLC(r1)
            r1 = -277348097(0xffffffffef7800ff, float:-7.6753487E28)
            goto L_0x002f
        L_0x0238:
            r0 = -408819444(0xffffffffe7a1e90c, float:-1.5291999E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.2YL r5 = (X.2YL) r5
            X.6oS r4 = X.C318116oQ.A00(r5)
            r3 = 0
            r2 = 6
            X.MFT r1 = new X.MFT
            r1.<init>(r5, r3, r2)
            X.AnonymousClass7TE.A1Z(r1, r4)
            r1 = 850062803(0x32aaedd3, float:1.9898755E-8)
            goto L_0x002f
        L_0x0256:
            r0 = 911623121(0x365643d1, float:3.192796E-6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.2YL r5 = (X.2YL) r5
            X.6oS r4 = X.C318116oQ.A00(r5)
            r3 = 0
            r2 = 7
            X.MFT r1 = new X.MFT
            r1.<init>(r5, r3, r2)
            X.AnonymousClass7TE.A1Z(r1, r4)
            r1 = 607985147(0x243d1dfb, float:4.1008237E-17)
            goto L_0x002f
        L_0x0274:
            r0 = -1556675472(0xffffffffa3370470, float:-9.9213896E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.2YL r5 = (X.2YL) r5
            X.6oS r4 = X.C318116oQ.A00(r5)
            r3 = 0
            r2 = 5
            X.MFT r1 = new X.MFT
            r1.<init>(r5, r3, r2)
            X.AnonymousClass7TE.A1Z(r1, r4)
            r1 = -1749740559(0xffffffff97b513f1, float:-1.1701885E-24)
            goto L_0x002f
        L_0x0292:
            r0 = 1831124424(0x6d24bdc8, float:3.1865608E27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.DlB r2 = (X.C46783DlB) r2
            r1 = 255(0xff, float:3.57E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.C46783DlB.A00(r2, r1)
            r1 = -1706487003(0xffffffff9a491325, float:-4.158129E-23)
            goto L_0x002f
        L_0x02ab:
            r0 = 399392485(0x17ce3ee5, float:1.3328315E-24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.DlB r2 = (X.C46783DlB) r2
            java.lang.String r1 = "eligible"
            X.C46783DlB.A00(r2, r1)
            r1 = 270167105(0x101a6c41, float:3.045454E-29)
            goto L_0x002f
        L_0x02c0:
            r0 = -1943674016(0xffffffff8c25e360, float:-1.2779561E-31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.DlB r2 = (X.C46783DlB) r2
            java.lang.String r1 = "not_eligible"
            X.C46783DlB.A00(r2, r1)
            r1 = -370778747(0xffffffffe9e65d85, float:-3.4811822E25)
            goto L_0x002f
        L_0x02d5:
            r0 = 1034137272(0x3da3aeb8, float:0.07992309)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            android.view.View r1 = (android.view.View) r1
            r1.performClick()
            r1 = -1889351584(0xffffffff8f62c860, float:-1.1181251E-29)
            goto L_0x002f
        L_0x02e8:
            r0 = -488374153(0xffffffffe2e40077, float:-2.1029456E21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.Dk5 r3 = (X.C46721Dk5) r3
            android.view.View r2 = r3.A00
            r1 = 8
            r2.setVisibility(r1)
            X.0sa r1 = r3.A0D
            r1.invoke()
            r1 = 1287958569(0x4cc4b029, float:1.03121224E8)
            goto L_0x002f
        L_0x0304:
            r0 = 366131689(0x15d2b9e9, float:8.511164E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.Dk5 r3 = (X.C46721Dk5) r3
            android.view.View r2 = r3.A00
            r1 = 8
            r2.setVisibility(r1)
            X.0sa r1 = r3.A0D
            r1.invoke()
            r1 = 706976759(0x2a239bf7, float:1.453142E-13)
            goto L_0x002f
        L_0x0320:
            r0 = 1250600536(0x4a8aa658, float:4543276.0)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            com.instagram.igds.components.banner.IgdsInsetBanner r2 = (com.instagram.igds.components.banner.IgdsInsetBanner) r2
            r1 = 8
            r2.setVisibility(r1)
            X.G76 r1 = r2.A00
            if (r1 == 0) goto L_0x0337
            r1.onBannerDismissed()
        L_0x0337:
            r1 = 1427664846(0x55186fce, float:1.04753728E13)
            goto L_0x002f
        L_0x033c:
            r0 = -220877310(0xfffffffff2d5ae02, float:-8.464726E30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            com.instagram.igds.components.banner.IgdsInsetBanner r1 = (com.instagram.igds.components.banner.IgdsInsetBanner) r1
            X.G76 r1 = r1.A00
            if (r1 == 0) goto L_0x034e
            r1.onActionClicked()
        L_0x034e:
            r1 = 408052656(0x185263b0, float:2.7192193E-24)
            goto L_0x002f
        L_0x0353:
            r0 = -1923601163(0xffffffff8d582cf5, float:-6.6614254E-31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            com.instagram.igds.components.banner.IgdsBanner r2 = (com.instagram.igds.components.banner.IgdsBanner) r2
            r1 = 8
            r2.setVisibility(r1)
            X.G76 r1 = r2.A00
            if (r1 == 0) goto L_0x036a
            r1.onBannerDismissed()
        L_0x036a:
            r1 = -564862499(0xffffffffde54e1dd, float:-3.8349462E18)
            goto L_0x002f
        L_0x036f:
            r0 = 1520758033(0x5aa4ed11, float:2.32112767E16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            com.instagram.igds.components.banner.IgdsBanner r1 = (com.instagram.igds.components.banner.IgdsBanner) r1
            X.G76 r1 = r1.A00
            if (r1 == 0) goto L_0x0381
            r1.onActionClicked()
        L_0x0381:
            r1 = 727940686(0x2b637e4e, float:8.0821883E-13)
            goto L_0x002f
        L_0x0386:
            r0 = -1733432618(0xffffffff98adead6, float:-4.4956576E-24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.F0q r2 = (X.C49659F0q) r2
            androidx.fragment.app.Fragment r1 = r2.A03
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            X.0hq r4 = r1.getParentFragmentManager()
            com.instagram.model.hashtag.Hashtag r9 = r2.A00
            X.0iw r7 = r2.A04
            X.0gy r5 = X.AnonymousClass07i.A00(r1)
            com.instagram.common.session.UserSession r8 = r2.A05
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            java.lang.Boolean r10 = X.AnonymousClass7TE.A0v()
            r1 = 8
            X.OrC r6 = new X.OrC
            r6.<init>(r3, r1)
            java.lang.String r12 = "copy_link"
            X.C46395DeI.A09(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = -401571197(0xffffffffe8108283, float:-2.7297132E24)
            goto L_0x002f
        L_0x03bc:
            r0 = 1891540034(0x70be9c42, float:4.7192845E29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.F0q r4 = (X.C49659F0q) r4
            X.0iw r6 = r4.A04
            android.app.Activity r5 = r4.A01
            java.lang.String r2 = "HASHTAG_REPORTING"
            if (r5 != 0) goto L_0x03d9
            java.lang.String r1 = "Null activity when reporting hashtag"
        L_0x03d1:
            X.0wb.A03(r2, r1)
        L_0x03d4:
            r1 = 926288233(0x37360969, float:1.0850236E-5)
            goto L_0x002f
        L_0x03d9:
            com.instagram.model.hashtag.Hashtag r1 = r4.A00
            java.lang.String r1 = r1.getId()
            if (r1 != 0) goto L_0x03e4
            java.lang.String r1 = "Null hashtag ID when reporting hashtag"
            goto L_0x03d1
        L_0x03e4:
            com.instagram.model.hashtag.Hashtag r1 = r4.A00
            java.lang.String r2 = r1.getId()
            X.0qQ.A0A(r2)
            r1 = 1
            X.0qQ.A0B(r2, r1)
            com.instagram.common.session.UserSession r7 = r4.A05
            com.instagram.model.hashtag.Hashtag r1 = r4.A00
            java.lang.String r10 = r1.getId()
            X.TpH r8 = X.C14068TpH.HASHTAGS
            X.UzD r9 = X.C16677UzD.HASHTAG
            X.OcF r3 = X.ORV.A01(r5, r6, r7, r8, r9, r10)
            android.content.Context r1 = r4.A02
            X.0qQ.A0A(r1)
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131963102(0x7f132cde, float:1.9562948E38)
            java.lang.String r1 = X.AnonymousClass7TF.A0d(r2, r1)
            r3.A0A = r1
            r2 = 3
            X.EUb r1 = new X.EUb
            r1.<init>(r4, r2)
            r3.A07(r1)
            r3.A06()
            goto L_0x03d4
        L_0x0420:
            r0 = 630819772(0x25998bbc, float:2.6635957E-16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.F0q r2 = (X.C49659F0q) r2
            androidx.fragment.app.Fragment r1 = r2.A03
            androidx.fragment.app.FragmentActivity r4 = r1.requireActivity()
            X.0hq r5 = r1.getParentFragmentManager()
            com.instagram.model.hashtag.Hashtag r10 = r2.A00
            X.0iw r8 = r2.A04
            X.0gy r6 = X.AnonymousClass07i.A00(r1)
            com.instagram.common.session.UserSession r9 = r2.A05
            X.0Tu r3 = X.0Tu.A05
            r1 = 36314859024616287(0x81042c003b0b5f, double:3.0290013031429846E-306)
            java.lang.Boolean r1 = X.AnonymousClass7TF.A0R(r3, r9, r1)
            boolean r19 = r1.booleanValue()
            java.lang.Integer r12 = X.AnonymousClass05K.A0A
            java.lang.Boolean r11 = X.DbT.A0l(r19)
            r14 = 0
            X.FT5 r7 = new X.FT5
            r13 = r7
            r15 = r4
            r16 = r8
            r17 = r9
            r18 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19)
            java.lang.String r13 = "qr_code"
            X.C46395DeI.A09(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = -1528921023(0xffffffffa4de8441, float:-9.65012E-17)
            goto L_0x002f
        L_0x046c:
            r0 = 1773186361(0x69b0ad39, float:2.669862E25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.F0q r4 = (X.C49659F0q) r4
            android.content.Context r1 = r4.A02
            X.0qQ.A0A(r1)
            com.instagram.common.session.UserSession r5 = r4.A05
            X.Dg1 r3 = new X.Dg1
            r3.<init>(r1, r5)
            r2 = 35
            com.instagram.model.hashtag.Hashtag r1 = r4.A00
            java.lang.String r1 = r1.getName()
            java.lang.String r1 = X.002.A0D(r1, r2)
            r3.A08(r1)
            r2 = 2131973069(0x7f1353cd, float:1.9583163E38)
            r1 = 47
            X.FP1 r1 = A00(r4, r1)
            r3.A02(r1, r2)
            r2 = 2131956749(0x7f13140d, float:1.9550062E38)
            r1 = 48
            X.FP1 r1 = A00(r4, r1)
            r3.A04(r1, r2)
            boolean r1 = X.C14290TtO.A00(r5)
            if (r1 == 0) goto L_0x04bc
            r2 = 2131971010(0x7f134bc2, float:1.9578987E38)
            r1 = 46
            X.FP1 r1 = A00(r4, r1)
            r3.A04(r1, r2)
        L_0x04bc:
            com.instagram.model.hashtag.Hashtag r1 = r4.A00
            r1.getId()
            X.FFy r2 = new X.FFy
            r2.<init>(r3)
            android.app.Activity r1 = r4.A01
            X.0qQ.A0A(r1)
            r2.A03(r1)
            r1 = 1761231248(0x68fa4190, float:9.454408E24)
            goto L_0x002f
        L_0x04d3:
            r0 = -47632113(0xfffffffffd29310f, float:-1.4055891E37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.E7Y r6 = (X.E7Y) r6
            X.0eM r3 = r6.A0F
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r3)
            X.27r r2 = X.27p.A01(r1)
            java.lang.String r1 = "GROUP_STORY_CREATION_BUTTON"
            r8 = 0
            r2.A1i(r8, r1, r8)
            X.0lg r7 = X.DbT.A0X(r3)
            r5 = 73437(0x11edd, float:1.02907E-40)
            r1 = 0
            X.0qQ.A0B(r7, r1)
            r3 = 1
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            java.lang.String r2 = "CREATION"
            r1 = 154(0x9a, float:2.16E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r4.putString(r1, r2)
            java.lang.String r1 = "hall_pass_id"
            r4.putString(r1, r8)
            java.lang.String r1 = "hall_pass_name"
            r4.putString(r1, r8)
            r1 = 1157(0x485, float:1.621E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r4.putBoolean(r1, r3)
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            android.app.Activity r2 = r6.getRootActivity()
            r1 = 126(0x7e, float:1.77E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.6W8 r1 = X.Dba.A0K(r2, r4, r7, r3, r1)
            r1.A0D(r6, r5)
            r1 = 422214145(0x192a7a01, float:8.8134325E-24)
            goto L_0x002f
        L_0x0534:
            r0 = 783902955(0x2eb968eb, float:8.431463E-11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            X.8ab r4 = X.DbW.A0U(r2)
            r1 = 2131963270(0x7f132d86, float:1.9563289E38)
            r4.A09(r1)
            r1 = 2131963268(0x7f132d84, float:1.9563285E38)
            r4.A08(r1)
            r3 = 2131963267(0x7f132d83, float:1.9563283E38)
            r1 = 69
            X.FJi r2 = X.C50023FJi.A00(r2, r1)
            X.8ae r1 = X.C358278ae.RED
            r4.A0Q(r2, r1, r3)
            r4.A03()
            X.DbT.A1V(r4)
            r1 = -523193933(0xffffffffe0d0b1b3, float:-1.2030398E20)
            goto L_0x002f
        L_0x0568:
            r0 = -351623432(0xffffffffeb0aa6f8, float:-1.6762025E26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.E64 r2 = (X.E64) r2
            X.34q r9 = r2.A02
            if (r9 != 0) goto L_0x057b
            java.lang.String r6 = "logger"
            goto L_0x069a
        L_0x057b:
            java.lang.Integer r11 = X.AnonymousClass05K.A0N
            java.lang.String r14 = r2.A06
            java.lang.String r13 = r2.A07
            java.lang.String r4 = r2.A04
            java.lang.String r8 = "hallPassId"
            if (r4 == 0) goto L_0x0c57
            java.lang.String r3 = r2.A05
            java.lang.String r6 = "hallPassName"
            if (r3 == 0) goto L_0x069a
            X.0eM r1 = r2.A0F
            java.lang.String r15 = X.DbS.A0t(r1)
            java.lang.String r1 = r2.A08
            java.lang.Integer r12 = r2.A03
            r10 = 0
            java.lang.String r19 = "shared_lists_consumption_sheet"
            r16 = r1
            r17 = r4
            r18 = r3
            r9.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.0eM r1 = r2.A0G
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r4 = r2.requireActivity()
            java.lang.String r3 = r2.A04
            if (r3 == 0) goto L_0x0c57
            java.lang.String r2 = r2.A05
            if (r2 == 0) goto L_0x069a
            r1 = 1
            X.C49957FGp.A06(r4, r5, r3, r2, r1)
            r1 = 750791754(0x2cc02c4a, float:5.4618853E-12)
            goto L_0x002f
        L_0x05be:
            r0 = 637457137(0x25fed2f1, float:4.4204916E-16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.E64 r1 = (X.E64) r1
            X.34q r5 = r1.A02
            if (r5 != 0) goto L_0x05d4
            java.lang.String r4 = "logger"
        L_0x05cf:
            X.0qQ.A0F(r4)
            goto L_0x0c5a
        L_0x05d4:
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            java.lang.String r10 = r1.A06
            java.lang.String r9 = r1.A07
            java.lang.String r13 = r1.A04
            java.lang.String r3 = "hallPassId"
            if (r13 == 0) goto L_0x0625
            java.lang.String r14 = r1.A05
            java.lang.String r4 = "hallPassName"
            if (r14 == 0) goto L_0x05cf
            X.0eM r2 = r1.A0F
            java.lang.String r11 = X.DbS.A0t(r2)
            java.lang.String r12 = r1.A08
            java.lang.Integer r8 = r1.A03
            r6 = 0
            java.lang.String r15 = "shared_lists_consumption_sheet"
            r5.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.0eM r2 = r1.A0G
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r2)
            androidx.fragment.app.FragmentActivity r5 = r1.requireActivity()
            java.lang.String r8 = r1.A04
            if (r8 == 0) goto L_0x0625
            java.lang.String r9 = r1.A05
            if (r9 == 0) goto L_0x05cf
            X.28D r6 = X.28D.A46
            r10 = 0
            r11 = r10
            X.C49957FGp.A01(r5, r6, r7, r8, r9, r10, r11)
            r1 = 991053506(0x3b1246c2, float:0.0022320007)
            goto L_0x002f
        L_0x0614:
            r0 = 2027581355(0x78da6fab, float:3.54433E34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.ELc r3 = (X.C47882ELc) r3
            android.widget.LinearLayout r2 = r3.A03
            if (r2 != 0) goto L_0x062a
            java.lang.String r3 = "introLayout"
        L_0x0625:
            X.0qQ.A0F(r3)
            goto L_0x0c5a
        L_0x062a:
            r1 = 8
            r2.setVisibility(r1)
            android.view.View r1 = r3.A00
            java.lang.String r6 = "followUpScreen"
            if (r1 == 0) goto L_0x069a
            r5 = 0
            r1.setVisibility(r5)
            android.view.View r2 = r3.A00
            if (r2 == 0) goto L_0x069a
            r1 = 2131428002(0x7f0b02a2, float:1.8477636E38)
            android.widget.TextView r1 = X.AnonymousClass7TE.A0d(r2, r1)
            r3.A06 = r1
            android.view.View r2 = r3.A00
            if (r2 == 0) goto L_0x069a
            r1 = 2131428001(0x7f0b02a1, float:1.8477634E38)
            android.widget.TextView r1 = X.DbU.A0G(r2, r1)
            r3.A05 = r1
            android.view.View r2 = r3.A00
            if (r2 == 0) goto L_0x069a
            r1 = 2131435827(0x7f0b2133, float:1.8493507E38)
            android.view.View r2 = r2.findViewById(r1)
            com.instagram.igds.components.switchbutton.IgdsSwitch r2 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r2
            r3.A08 = r2
            java.lang.String r7 = "switchButton"
            if (r2 == 0) goto L_0x0700
            boolean r1 = r3.A09
            r2.setChecked(r1)
            X.F3L r4 = r3.A07
            if (r4 == 0) goto L_0x06c0
            android.view.View r2 = r3.A00
            if (r2 == 0) goto L_0x069a
            r1 = 2131435825(0x7f0b2131, float:1.8493503E38)
            android.widget.TextView r2 = X.DbW.A0B(r2, r1)
            java.lang.String r1 = r4.A01(r5)
            r2.setText(r1)
            android.view.View r2 = r3.A00
            if (r2 == 0) goto L_0x069a
            r1 = 2131435822(0x7f0b212e, float:1.8493497E38)
            android.widget.TextView r2 = X.DbW.A0B(r2, r1)
            r1 = 1
            java.lang.String r1 = r4.A01(r1)
            r2.setText(r1)
            android.widget.TextView r2 = r3.A04
            if (r2 != 0) goto L_0x069f
            java.lang.String r6 = "detailTextView"
        L_0x069a:
            X.0qQ.A0F(r6)
            goto L_0x0c5a
        L_0x069f:
            r1 = 2
            java.lang.String r1 = r4.A01(r1)
            r2.setText(r1)
            com.instagram.igds.components.switchbutton.IgdsSwitch r2 = r3.A08
            if (r2 == 0) goto L_0x0700
            android.widget.CompoundButton$OnCheckedChangeListener r1 = r3.A0H
            r2.setOnCheckedChangeListener(r1)
            android.widget.Button r2 = r3.A01
            if (r2 != 0) goto L_0x06b8
            java.lang.String r3 = "saveButton"
            goto L_0x0625
        L_0x06b8:
            android.view.View$OnClickListener r1 = r3.A0G
            X.AnonymousClass0fU.A00(r1, r2)
            X.C47882ELc.A00(r3)
        L_0x06c0:
            r1 = -245941256(0xfffffffff1573bf8, float:-1.0657884E30)
            goto L_0x002f
        L_0x06c5:
            r0 = -1031553405(0xffffffffc283be83, float:-65.87209)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.E7Y r6 = (X.E7Y) r6
            X.0eM r4 = r6.A0F
            X.1Av r1 = X.DbX.A0h(r4)
            X.0xa r5 = r1.A01
            r1 = 3230(0xc9e, float:4.526E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r1)
            r2 = 0
            boolean r1 = r5.getBoolean(r3, r2)
            r7 = 0
            if (r1 != 0) goto L_0x0705
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r4)
            boolean r1 = X.AnonymousClass37B.A00(r1)
            if (r1 == 0) goto L_0x0705
            X.1Av r1 = X.DbX.A0h(r4)
            r2 = 1
            X.0xa r1 = r1.A01
            X.DbX.A1V(r1, r3, r2)
            X.34q r3 = r6.A05
            if (r3 != 0) goto L_0x070d
            java.lang.String r7 = "hallPassLogger"
        L_0x0700:
            X.0qQ.A0F(r7)
            goto L_0x0c5a
        L_0x0705:
            java.lang.String r1 = r6.A07
            if (r1 == 0) goto L_0x0736
            X.E7Y.A00(r6, r1, r2)
            goto L_0x0736
        L_0x070d:
            X.EZX r2 = X.EZX.STORY_VIEWER
            java.lang.String r1 = X.DbS.A0k()
            r3.A01(r2, r1)
            androidx.fragment.app.Fragment r5 = r6.mParentFragment
            boolean r1 = r5 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r1 == 0) goto L_0x0736
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r5 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r5
            if (r5 == 0) goto L_0x0736
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r4)
            java.lang.String r3 = r6.A07
            android.content.Context r2 = r6.getContext()
            if (r2 == 0) goto L_0x0733
            r1 = 2131963281(0x7f132d91, float:1.956331E38)
            java.lang.String r7 = r2.getString(r1)
        L_0x0733:
            X.C49957FGp.A08(r4, r6, r5, r3, r7)
        L_0x0736:
            r1 = -1773986046(0xffffffff96431f02, float:-1.5761759E-25)
            goto L_0x002f
        L_0x073b:
            r0 = -1797796186(0xffffffff94d7cea6, float:-2.179096E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.E7T r6 = (X.E7T) r6
            r1 = 1
            r6.A04 = r1
            android.os.Bundle r7 = X.AnonymousClass7TE.A0a()
            java.lang.String r2 = r6.A02
            java.lang.String r8 = "hallPassId"
            if (r2 == 0) goto L_0x0c57
            java.lang.String r1 = "hall_pass_id"
            r7.putString(r1, r2)
            r1 = 154(0x9a, float:2.16E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            java.lang.String r1 = "ADD_PEOPLE"
            r7.putString(r2, r1)
            X.0eM r5 = r6.A0A
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r5)
            androidx.fragment.app.FragmentActivity r3 = r6.requireActivity()
            r1 = 0
            X.0qQ.A0B(r4, r1)
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            r1 = 294(0x126, float:4.12E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.Dbb.A0i(r3, r7, r4, r2, r1)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            X.27r r4 = X.27p.A01(r1)
            java.lang.String r1 = r6.A02
            if (r1 == 0) goto L_0x0c57
            java.lang.Long r3 = X.AnonymousClass7TE.A10(r1)
            java.lang.String r2 = r6.A03
            if (r2 == 0) goto L_0x090d
            java.lang.String r1 = "SHARED_LISTS_ADD_PEOPLE_BUTTON"
            r4.A1i(r3, r1, r2)
            r1 = -1007330455(0xffffffffc3f55b69, float:-490.71414)
            goto L_0x002f
        L_0x079a:
            r0 = -14979176(0xffffffffff1b6f98, float:-2.0660977E38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.E7T r1 = (X.E7T) r1
            X.E7T.A00(r1)
            r1 = 1705887998(0x65adc8fe, float:1.0258463E23)
            goto L_0x002f
        L_0x07ad:
            r0 = 746613787(0x2c806c1b, float:3.649981E-12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.E7T r2 = (X.E7T) r2
            X.0eM r1 = r2.A0A
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            java.lang.String r4 = r2.A02
            if (r4 == 0) goto L_0x0911
            java.lang.String r5 = r2.A03
            if (r5 == 0) goto L_0x090d
            X.28D r2 = X.28D.A46
            r6 = 0
            r7 = r6
            X.C49957FGp.A01(r1, r2, r3, r4, r5, r6, r7)
            r1 = -402892671(0xffffffffe7fc5881, float:-2.3833379E24)
            goto L_0x002f
        L_0x07d6:
            r0 = -384694152(0xffffffffe9120878, float:-1.1033948E25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.E7T r4 = (X.E7T) r4
            android.content.Context r2 = r4.requireContext()
            X.0eM r1 = r4.A0A
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.Dg1 r3 = new X.Dg1
            r3.<init>(r2, r1)
            r2 = 2131963267(0x7f132d83, float:1.9563283E38)
            r1 = 36
            X.FP1 r1 = A00(r4, r1)
            r3.A02(r1, r2)
            X.C49945FFy.A00(r4, r3)
            r1 = 1216904744(0x48887e28, float:279537.25)
            goto L_0x002f
        L_0x0804:
            r0 = 1189547037(0x46e70c1d, float:29574.057)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.E7T r1 = (X.E7T) r1
            X.E7T.A00(r1)
            r1 = -284261824(0xffffffffef0e8240, float:-4.4104334E28)
            goto L_0x002f
        L_0x0817:
            r0 = -1435518835(0xffffffffaa6fb88d, float:-2.1291493E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.E7T r1 = (X.E7T) r1
            X.DbT.A1K(r1)
            r1 = -2017228827(0xffffffff87c387e5, float:-2.942021E-34)
            goto L_0x002f
        L_0x082a:
            r0 = -1718248781(0xffffffff99959ab3, float:-1.5468721E-23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.E7Y r4 = (X.E7Y) r4
            X.0eM r1 = r4.A0F
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.27r r3 = X.27p.A01(r1)
            java.lang.String r2 = "SHARED_LISTS_CREATE_BUTTON"
            r1 = 0
            r3.A1i(r1, r2, r1)
            X.DbZ.A17(r4)
            X.G7a r1 = r4.A04
            if (r1 == 0) goto L_0x084f
            r1.D6g()
        L_0x084f:
            r1 = -1135353769(0xffffffffbc53e057, float:-0.012931905)
            goto L_0x002f
        L_0x0854:
            r0 = -500762612(0xffffffffe226f80c, float:-7.700083E20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            androidx.fragment.app.Fragment r2 = r1.mParentFragment
            boolean r1 = r2 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r1 == 0) goto L_0x0870
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r2 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r2
            if (r2 == 0) goto L_0x0870
            X.7Pu r1 = r2.A02
            if (r1 == 0) goto L_0x0870
            r1.A0T()
        L_0x0870:
            r1 = 1921612229(0x728979c5, float:5.445972E30)
            goto L_0x002f
        L_0x0875:
            r0 = -1909533461(0xffffffff8e2ed4eb, float:-2.1549672E-30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.E7Y r4 = (X.E7Y) r4
            X.0eM r1 = r4.A0F
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.27r r3 = X.27p.A01(r1)
            java.lang.String r2 = "SHARED_LISTS_CREATE_BUTTON"
            r1 = 0
            r3.A1i(r1, r2, r1)
            X.DbZ.A17(r4)
            X.G7a r1 = r4.A04
            if (r1 == 0) goto L_0x089a
            r1.D6g()
        L_0x089a:
            r1 = -462047664(0xffffffffe475b650, float:-1.8130357E22)
            goto L_0x002f
        L_0x089f:
            r0 = -1457852792(0xffffffffa91aee88, float:-3.4401762E-14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            androidx.fragment.app.Fragment r2 = r1.mParentFragment
            boolean r1 = r2 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r1 == 0) goto L_0x08c6
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r2 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r2
            if (r2 == 0) goto L_0x08c6
            X.7Pu r3 = r2.A02
            if (r3 == 0) goto L_0x08c6
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = r3.A03
            java.util.Stack r1 = r1.A0D
            int r2 = r1.size()
            r1 = 1
            if (r2 <= r1) goto L_0x08cb
            r3.A0T()
        L_0x08c6:
            r1 = 572545845(0x22205b35, float:2.1732328E-18)
            goto L_0x002f
        L_0x08cb:
            r1 = 0
            r3.A0L(r1)
            goto L_0x08c6
        L_0x08d0:
            r0 = 1092338618(0x411bc3ba, float:9.735285)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.E7S r1 = (X.E7S) r1
            X.E7S.A00(r1)
            r1 = -32354514(0xfffffffffe124f2e, float:-4.8619603E37)
            goto L_0x002f
        L_0x08e3:
            r0 = 1353817574(0x50b19de6, float:2.38393221E10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.E7S r6 = (X.E7S) r6
            X.0eM r1 = r6.A05
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r4 = r6.requireActivity()
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            java.lang.String r2 = r6.A01
            if (r2 == 0) goto L_0x0911
            java.lang.String r1 = r6.A02
            if (r1 == 0) goto L_0x090d
            X.C49957FGp.A04(r4, r5, r3, r2, r1)
            r1 = 1
            r6.A03 = r1
            r1 = -1003892964(0xffffffffc429cf1c, float:-679.2361)
            goto L_0x002f
        L_0x090d:
            java.lang.String r8 = "hallPassName"
            goto L_0x0c57
        L_0x0911:
            java.lang.String r8 = "hallPassId"
            goto L_0x0c57
        L_0x0915:
            r0 = 302886978(0x120db042, float:4.470901E-28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.E7S r4 = (X.E7S) r4
            android.content.Context r2 = r4.requireContext()
            X.0eM r1 = r4.A05
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.Dg1 r3 = new X.Dg1
            r3.<init>(r2, r1)
            r2 = 2131954705(0x7f130c11, float:1.9545917E38)
            r1 = 26
            X.FP1 r1 = A00(r4, r1)
            r3.A02(r1, r2)
            X.C49945FFy.A00(r4, r3)
            r1 = 1582503324(0x5e53159c, float:3.80255871E18)
            goto L_0x002f
        L_0x0943:
            r0 = 253119736(0xf164cf8, float:7.410395E-30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.E7S r1 = (X.E7S) r1
            X.E7S.A00(r1)
            r1 = 802915578(0x2fdb84fa, float:3.9930353E-10)
            goto L_0x002f
        L_0x0956:
            r0 = -256534245(0xfffffffff0b5991b, float:-4.4961504E29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.E7S r1 = (X.E7S) r1
            X.DbT.A1K(r1)
            r1 = -242989156(0xfffffffff184479c, float:-1.310035E30)
            goto L_0x002f
        L_0x0969:
            r0 = -924148997(0xffffffffc8ea9afb, float:-480471.84)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.E5s r3 = (X.C47509E5s) r3
            X.0eM r1 = r3.A01
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r5 = r3.requireActivity()
            java.lang.String r1 = r3.A00
            X.DbY.A1S(r2, r1)
            X.E1X r4 = X.C49957FGp.A00(r2, r1)
            X.37D r1 = X.DbT.A0i(r5)
            X.7Pu r3 = X.C48943Emh.A00(r1)
            if (r3 == 0) goto L_0x099e
            X.7Pr r2 = X.DbS.A0W(r2)
            r1 = 2131954702(0x7f130c0e, float:1.954591E38)
            X.DbZ.A0z(r5, r2, r1)
            r3.A0F(r4, r2)
        L_0x099e:
            r1 = -1260543178(0xffffffffb4dda336, float:-4.128321E-7)
            goto L_0x002f
        L_0x09a3:
            r0 = -689397453(0xffffffffd6e8a133, float:-1.27889522E14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.EEA r1 = (X.EEA) r1
            X.E55 r1 = r1.A02
            r1.A01()
            r1 = -648928411(0xffffffffd9522365, float:-3.69679136E15)
            goto L_0x002f
        L_0x09b8:
            r0 = -861599557(0xffffffffcca508bb, float:-8.65254E7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.ELd r3 = (X.C47883ELd) r3
            X.DbT.A1J(r3)
            android.content.Context r2 = r3.getContext()
            X.0qQ.A0A(r2)
            X.0wW r4 = r3.getSession()
            r1 = 2131963313(0x7f132db1, float:1.9563376E38)
            java.lang.String r7 = r3.getString(r1)
            java.lang.String r6 = "https://help.instagram.com/176296189679904?ref=tos"
            r5 = r3
            X.FFM.A02(r2, r3, r4, r5, r6, r7)
            r1 = -121207265(0xfffffffff8c6861f, float:-3.2212346E34)
            goto L_0x002f
        L_0x09e3:
            r0 = 46524699(0x2c5e91b, float:2.9080344E-37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dba.A1Q(r1)
            r1 = 1691540683(0x64d2dccb, float:3.1117809E22)
            goto L_0x002f
        L_0x09f4:
            r0 = -1359276881(0xffffffffaefb14af, float:-1.14178327E-10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.1xC r4 = X.1xC.A01
            java.lang.Object r3 = r1.A01
            X.ELc r3 = (X.C47882ELc) r3
            boolean r2 = r3.A09
            X.FVk r1 = new X.FVk
            r1.<init>(r2)
            r4.A00(r1)
            android.content.Context r2 = r3.requireContext()
            java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
            X.0qQ.A0C(r2, r1)
            android.app.Activity r2 = (android.app.Activity) r2
            r2.onBackPressed()
            r1 = -1826129476(0xffffffff932779bc, float:-2.1138383E-27)
            goto L_0x002f
        L_0x0a1e:
            r0 = 2102579022(0x7d52cf4e, float:1.7513392E37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            android.content.Context r2 = X.DbT.A08(r1)
            java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
            X.0qQ.A0C(r2, r1)
            android.app.Activity r2 = (android.app.Activity) r2
            r2.onBackPressed()
            r1 = 770369264(0x2deae6f0, float:2.6705277E-11)
            goto L_0x002f
        L_0x0a3a:
            r0 = 1062043471(0x3f4d7f4f, float:0.8027238)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            android.content.Context r2 = X.DbT.A07(r1)
            X.37E r1 = X.AnonymousClass37D.A00
            X.37D r2 = r1.A02(r2)
            r2.getClass()
            X.ELc r1 = new X.ELc
            r1.<init>()
            r2.A0I(r1)
            r1 = 1944474643(0x73e65413, float:3.6496994E31)
            goto L_0x002f
        L_0x0a5d:
            r0 = -1427342632(0xffffffffaaec7ad8, float:-4.2007261E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.E55 r4 = (X.E55) r4
            android.content.Context r3 = r4.requireContext()
            X.0wW r5 = r4.A00
            android.content.Context r2 = r4.requireContext()
            java.lang.String r1 = "https://help.instagram.com/519522125107875"
            java.lang.String r7 = X.SQU.A02(r2, r1)
            X.0qQ.A07(r7)
            r1 = 2131957397(0x7f131695, float:1.9551377E38)
            java.lang.String r8 = r4.getString(r1)
            r6 = r4
            X.FFM.A02(r3, r4, r5, r6, r7, r8)
            r1 = -1952786037(0xffffffff8b9ad98b, float:-5.9645965E-32)
            goto L_0x002f
        L_0x0a8b:
            r0 = -1094130254(0xffffffffbec8e5b2, float:-0.39237744)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            android.content.Context r4 = r5.requireContext()
            r1 = 63
            X.FJi r3 = X.C50023FJi.A00(r5, r1)
            r2 = 24
            X.FJl r1 = new X.FJl
            r1.<init>((int) r2, (java.lang.Object) r5, (java.lang.Object) r5, (java.lang.Object) r5)
            X.FFM.A01(r4, r3, r1)
            r1 = 2115552228(0x7e18c3e4, float:5.0764944E37)
            goto L_0x002f
        L_0x0aaf:
            r0 = 1669908709(0x6388c8e5, float:5.0464663E21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            android.content.Context r2 = X.DbT.A08(r1)
            java.lang.String r1 = "https://help.instagram.com/488619974671134"
            X.FH7.A03(r2, r1)
            r1 = -1203850001(0xffffffffb83eb4ef, float:-4.5468038E-5)
            goto L_0x002f
        L_0x0ac6:
            r0 = 1793475584(0x6ae64400, float:1.3918703E26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.E1p r1 = (X.C47421E1p) r1
            X.Dba.A11(r1)
            X.DbZ.A15(r1)
            X.0eM r1 = r1.A03
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.ENZ r1 = X.FEb.A00(r1)
            X.G7f r1 = r1.A00
            if (r1 == 0) goto L_0x0ae8
            r1.Di5()
        L_0x0ae8:
            r1 = -1954208155(0xffffffff8b852665, float:-5.1287506E-32)
            goto L_0x002f
        L_0x0aed:
            r0 = -529499549(0xffffffffe0707a63, float:-6.9313085E19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.E1p r1 = (X.C47421E1p) r1
            X.Dba.A11(r1)
            X.DbZ.A15(r1)
            X.0eM r1 = r1.A03
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.ENZ r1 = X.FEb.A00(r1)
            X.G7f r1 = r1.A00
            if (r1 == 0) goto L_0x0b0f
            r1.DZM()
        L_0x0b0f:
            r1 = 324964612(0x135e9104, float:2.8091838E-27)
            goto L_0x002f
        L_0x0b14:
            r0 = 1034033552(0x3da21990, float:0.07915032)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.E4g r5 = (X.C47481E4g) r5
            X.0eM r3 = r5.A05
            X.DeO r1 = X.C46790DlK.A00(r3)
            int r2 = r1.ordinal()
            r1 = 0
            if (r2 == r1) goto L_0x0b3a
            r1 = 1
            if (r2 == r1) goto L_0x0b3e
            r1 = 2
            if (r2 == r1) goto L_0x0bb8
            r1 = 3
            if (r2 == r1) goto L_0x0bb8
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0b3a:
            r1 = 2131976296(0x7f136068, float:1.9589709E38)
            goto L_0x0b41
        L_0x0b3e:
            r1 = 2131976328(0x7f136088, float:1.9589773E38)
        L_0x0b41:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            if (r1 == 0) goto L_0x0bb8
            int r6 = r1.intValue()
            X.DeO r1 = X.C46790DlK.A00(r3)
            int r2 = r1.ordinal()
            r1 = 0
            if (r2 == r1) goto L_0x0b64
            r1 = 1
            if (r2 == r1) goto L_0x0b68
            r1 = 2
            if (r2 == r1) goto L_0x0bb8
            r1 = 3
            if (r2 == r1) goto L_0x0bb8
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0b64:
            r1 = 2131976295(0x7f136067, float:1.9589706E38)
            goto L_0x0b6b
        L_0x0b68:
            r1 = 2131976327(0x7f136087, float:1.9589771E38)
        L_0x0b6b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            if (r1 == 0) goto L_0x0bb8
            int r4 = r1.intValue()
            X.DeO r1 = X.C46790DlK.A00(r3)
            int r2 = r1.ordinal()
            r1 = 0
            if (r2 == r1) goto L_0x0b8e
            r1 = 1
            if (r2 == r1) goto L_0x0b92
            r1 = 2
            if (r2 == r1) goto L_0x0bb8
            r1 = 3
            if (r2 == r1) goto L_0x0bb8
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0b8e:
            r1 = 2131976297(0x7f136069, float:1.958971E38)
            goto L_0x0b95
        L_0x0b92:
            r1 = 2131976329(0x7f136089, float:1.9589775E38)
        L_0x0b95:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            if (r1 == 0) goto L_0x0bb8
            int r3 = r1.intValue()
            X.8ab r2 = X.DbW.A0U(r5)
            r2.A09(r6)
            r2.A08(r4)
            r1 = 61
            X.FJi r1 = X.C50023FJi.A00(r5, r1)
            r2.A0K(r1, r3)
            r2.A05()
            X.DbT.A1V(r2)
        L_0x0bb8:
            r1 = 655440907(0x27113c0b, float:2.0155342E-15)
            goto L_0x002f
        L_0x0bbd:
            r0 = -1859097476(0xffffffff91306c7c, float:-1.3917381E-28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.E4g r1 = (X.C47481E4g) r1
            X.C47481E4g.A04(r1)
            r1 = 1195577010(0x47430eb2, float:49934.695)
            goto L_0x002f
        L_0x0bd0:
            r0 = -203855106(0xfffffffff3d96afe, float:-3.4451247E31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.E4g r1 = (X.C47481E4g) r1
            X.C47481E4g.A04(r1)
            r1 = 1304779304(0x4dc55a28, float:4.13877504E8)
            goto L_0x002f
        L_0x0be3:
            r0 = 1377009641(0x52137fe9, float:1.58376542E11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.E7P r2 = (X.E7P) r2
            X.0eM r1 = r2.A02
            java.lang.Object r1 = r1.getValue()
            com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel r1 = (com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel) r1
            androidx.fragment.app.FragmentActivity r6 = r2.requireActivity()
            com.instagram.common.session.UserSession r5 = r1.A00
            com.instagram.direct.channels.analytics.ChannelCreationSource r4 = com.instagram.direct.channels.analytics.ChannelCreationSource.SUBSCRIBER_LIST
            X.EV0 r3 = X.EV0.Social
            r1 = 0
            com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs r2 = new com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs
            r2.<init>(r1, r1, r1)
            r1 = 0
            X.G6v r1 = X.FC2.A01(r5, r2, r4, r3, r1)
            r1.CfS(r6)
            r1 = 1306101753(0x4dd987f9, float:4.56195872E8)
            goto L_0x002f
        L_0x0c13:
            r0 = 33705929(0x2024fc9, float:9.573789E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            android.view.View r1 = (android.view.View) r1
            android.content.Context r1 = r1.getContext()
            X.8ab r2 = X.DbS.A0Y(r1)
            r1 = 2131974615(0x7f1359d7, float:1.95863E38)
            r2.A09(r1)
            r1 = 2131974614(0x7f1359d6, float:1.9586297E38)
            r2.A08(r1)
            X.Dba.A1L(r2)
            r1 = -1887307174(0xffffffff8f81fa5a, float:-1.2816814E-29)
            goto L_0x002f
        L_0x0c3a:
            r0 = -146472408(0xfffffffff7450228, float:-3.9958055E33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.E7O r2 = (X.E7O) r2
            X.0eM r1 = r2.A0B
            java.lang.Object r7 = r1.getValue()
            X.EKq r7 = (X.C47870EKq) r7
            androidx.fragment.app.FragmentActivity r6 = r2.requireActivity()
            com.instagram.api.schemas.FanClubCategoryType r4 = r2.A00
            if (r4 != 0) goto L_0x0c5f
            java.lang.String r8 = "categoryType"
        L_0x0c57:
            X.0qQ.A0F(r8)
        L_0x0c5a:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0c5f:
            java.lang.String r3 = r2.A04
            if (r3 != 0) goto L_0x0c66
            java.lang.String r8 = "categoryName"
            goto L_0x0c57
        L_0x0c66:
            X.0eM r1 = r2.A09
            r1.getValue()
            com.instagram.creatormessaging.intf.CategorySelectionScreenArgs r2 = new com.instagram.creatormessaging.intf.CategorySelectionScreenArgs
            r2.<init>(r4, r3)
            r1 = 0
            com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs r5 = new com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs
            r5.<init>(r2, r1, r1)
            com.instagram.common.session.UserSession r4 = r7.A00
            com.instagram.direct.channels.analytics.ChannelCreationSource r3 = com.instagram.direct.channels.analytics.ChannelCreationSource.SUBSCRIBER_LIST
            X.EV0 r2 = X.EV0.Social
            r1 = 0
            X.G6v r1 = X.FC2.A01(r4, r5, r3, r2, r1)
            r1.CfS(r6)
            r1 = 863198387(0x33735cb3, float:5.6662156E-8)
            goto L_0x002f
        L_0x0c89:
            r0 = 2088296417(0x7c78dfe1, float:5.1689217E36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dte r1 = (X.C47253Dte) r1
            android.view.View$OnClickListener r1 = r1.A00
            if (r1 == 0) goto L_0x0c9d
            r2 = r21
            r1.onClick(r2)
        L_0x0c9d:
            r1 = 1698853321(0x654271c9, float:5.738988E22)
            goto L_0x002f
        L_0x0ca2:
            r0 = 2020528355(0x786ed0e3, float:1.9375053E34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.EGt r1 = (X.C47782EGt) r1
            X.E7P r5 = r1.A00
            X.E7I r4 = new X.E7I
            r4.<init>()
            X.0eM r1 = r5.A01
            X.7Pr r3 = X.DbX.A0f(r1)
            android.content.res.Resources r2 = X.DbV.A05(r5)
            r1 = 2131953598(0x7f1307be, float:1.9543672E38)
            X.DbT.A1C(r2, r3, r1)
            X.DbY.A13(r5, r4, r3)
            r1 = 1305359925(0x4dce3635, float:4.32457376E8)
            goto L_0x002f
        L_0x0ccc:
            r0 = -347966440(0xffffffffeb427418, float:-2.3507985E26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.E42 r1 = (X.E42) r1
            X.0eM r1 = r1.A09
            X.2YL r5 = X.DbS.A0H(r1)
            X.6oS r4 = X.C318116oQ.A00(r5)
            r3 = 0
            r2 = 44
            X.MGt r1 = new X.MGt
            r1.<init>((java.lang.Object) r5, (X.AnonymousClass4D7) r3, (int) r2)
            X.AnonymousClass7TE.A1Z(r1, r4)
            r1 = -1252624045(0xffffffffb5567953, float:-7.989776E-7)
            goto L_0x002f
        L_0x0cf1:
            r0 = 163227839(0x9baa8bf, float:4.493656E-33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.DtS r1 = (X.C47241DtS) r1
            X.0sa r1 = r1.A02
            r1.invoke()
            r1 = -369345737(0xffffffffe9fc3b37, float:-3.8116118E25)
            goto L_0x002f
        L_0x0d06:
            r0 = -1302024322(0xffffffffb264af7e, float:-1.3311249E-8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.E41 r1 = (X.E41) r1
            r1.onBackPressed()
            r1 = 699779236(0x29b5c8a4, float:8.07282E-14)
            goto L_0x002f
        L_0x0d19:
            r0 = 135522292(0x813e7f4, float:4.4508863E-34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.E7J r5 = (X.E7J) r5
            X.0eM r4 = r5.A01
            X.7Pr r2 = X.DbX.A0f(r4)
            r1 = 2131976285(0x7f13605d, float:1.9589686E38)
            java.lang.String r1 = r5.getString(r1)
            r2.A0d = r1
            X.7Pu r3 = r2.A00()
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            X.FC8.A02()
            r4.getValue()
            X.E0V r1 = new X.E0V
            r1.<init>()
            r3.A02(r2, r1)
            r1 = -86939446(0xfffffffffad168ca, float:-5.436577E35)
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FP1.onClick(android.view.View):void");
    }
}

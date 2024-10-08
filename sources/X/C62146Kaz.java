package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.mediakit.ui.model.MediaKitLink;
import instagram.features.clips.edit.ClipsEditMetadataController;

/* renamed from: X.Kaz  reason: case insensitive filesystem */
public final class C62146Kaz extends C2806552w {
    public final int A00 = 10;
    public final Object A01;

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0013: MOVE  (r5v17 com.instagram.igds.components.bottomsheet.BottomSheetFragment) = 
          (r5v16 com.instagram.igds.components.bottomsheet.BottomSheetFragment)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onClick(android.view.View r22) {
        /*
            r21 = this;
            r2 = r21
            int r0 = r2.A00
            r1 = r22
            switch(r0) {
                case 0: goto L_0x0325;
                case 1: goto L_0x030e;
                case 2: goto L_0x02f6;
                case 3: goto L_0x02c2;
                case 4: goto L_0x02b3;
                case 5: goto L_0x00b0;
                case 6: goto L_0x0296;
                case 7: goto L_0x0090;
                case 8: goto L_0x01e7;
                case 9: goto L_0x0282;
                case 10: goto L_0x027a;
                case 11: goto L_0x026b;
                case 12: goto L_0x0229;
                case 13: goto L_0x021e;
                case 14: goto L_0x01f9;
                case 15: goto L_0x01bd;
                case 16: goto L_0x01a1;
                case 17: goto L_0x0199;
                case 18: goto L_0x018d;
                case 19: goto L_0x017b;
                case 20: goto L_0x015f;
                case 21: goto L_0x0253;
                case 22: goto L_0x014c;
                case 23: goto L_0x0142;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r1 = r2.A01
            X.K7H r1 = (X.K7H) r1
            androidx.fragment.app.Fragment r5 = r1.mParentFragment
            boolean r0 = r5 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r0 == 0) goto L_0x008f
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r5 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r5
            if (r5 == 0) goto L_0x008f
            X.0eM r0 = r1.A06
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r0)
            r4 = 0
            X.0qQ.A0B(r7, r4)
            r0 = 2131969449(0x7f1345a9, float:1.9575821E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131238040(0x7f081c98, float:1.8092347E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8 = 0
            com.instagram.nux.common.HowItWorksNuxFragment$Row r6 = new com.instagram.nux.common.HowItWorksNuxFragment$Row
            r6.<init>(r8, r1, r0, r8)
            r0 = 2131969450(0x7f1345aa, float:1.9575823E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131238596(0x7f081ec4, float:1.8093475E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.instagram.nux.common.HowItWorksNuxFragment$Row r3 = new com.instagram.nux.common.HowItWorksNuxFragment$Row
            r3.<init>(r8, r1, r0, r8)
            r0 = 2131969451(0x7f1345ab, float:1.9575825E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r0 = 2131238110(0x7f081cde, float:1.809249E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            com.instagram.nux.common.HowItWorksNuxFragment$Row r0 = new com.instagram.nux.common.HowItWorksNuxFragment$Row
            r0.<init>(r8, r2, r1, r8)
            com.instagram.nux.common.HowItWorksNuxFragment$Row[] r0 = new com.instagram.nux.common.HowItWorksNuxFragment$Row[]{r6, r3, r0}
            java.util.ArrayList r13 = X.0sr.A1L(r0)
            java.lang.String r10 = "ReelPicsPleaseMediaSelectionFragment"
            r0 = 2131237576(0x7f081ac8, float:1.8091406E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r0 = 2131969452(0x7f1345ac, float:1.9575827E38)
            java.lang.String r12 = r5.getString(r0)
            r11 = r8
            X.E1X r3 = X.C49781F6o.A00(r7, r8, r9, r10, r11, r12, r13)
            X.7Pu r2 = r5.A02
            if (r2 == 0) goto L_0x008f
            X.7Pr r1 = X.DbS.A0W(r7)
            r0 = 2131969453(0x7f1345ad, float:1.957583E38)
            java.lang.String r0 = r5.getString(r0)
            r1.A0d = r0
            X.DbS.A1S(r1, r4)
            r2.A0F(r3, r1)
        L_0x008f:
            return
        L_0x0090:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Object r0 = r2.A01
            X.K7V r0 = (X.K7V) r0
            X.0eM r0 = r0.A05
            X.JiG r2 = X.JTT.A0P(r0)
            X.05G r0 = r2.A07
            java.lang.Object r1 = r0.getValue()
            X.Kfs r0 = X.C62442Kfs.CLOSE_FRIENDS
            if (r1 != r0) goto L_0x008f
            X.05G r1 = r2.A06
            X.KgY r0 = X.C62483KgY.HOW_IT_WORKS
            r1.Epw(r0)
            return
        L_0x00b0:
            r5 = 0
            X.0qQ.A0B(r1, r5)
            java.lang.Object r6 = r2.A01
            X.K4c r6 = (X.C61360K4c) r6
            X.7Pu r4 = r6.A0D
            if (r4 == 0) goto L_0x008f
            r6.requireContext()
            X.0eM r8 = r6.A0H
            com.instagram.common.session.UserSession r10 = X.JTU.A0J(r8)
            java.lang.String r9 = "close_friends_how_it_works"
            r0 = 2131956182(0x7f1311d6, float:1.9548912E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r0 = 2131956185(0x7f1311d9, float:1.9548919E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131238965(0x7f082035, float:1.8094224E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12 = 0
            com.instagram.nux.common.HowItWorksNuxFragment$Row r11 = new com.instagram.nux.common.HowItWorksNuxFragment$Row
            r11.<init>(r2, r1, r0, r12)
            r0 = 2131956197(0x7f1311e5, float:1.9548943E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r0 = 2131956186(0x7f1311da, float:1.954892E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131238120(0x7f081ce8, float:1.809251E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.instagram.nux.common.HowItWorksNuxFragment$Row r7 = new com.instagram.nux.common.HowItWorksNuxFragment$Row
            r7.<init>(r2, r1, r0, r12)
            r0 = 2131956183(0x7f1311d7, float:1.9548915E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = 2131956187(0x7f1311db, float:1.9548923E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r0 = 2131238274(0x7f081d82, float:1.8092822E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            com.instagram.nux.common.HowItWorksNuxFragment$Row r0 = new com.instagram.nux.common.HowItWorksNuxFragment$Row
            r0.<init>(r3, r2, r1, r12)
            com.instagram.nux.common.HowItWorksNuxFragment$Row[] r0 = new com.instagram.nux.common.HowItWorksNuxFragment$Row[]{r11, r7, r0}
            java.util.ArrayList r0 = X.0sr.A1L(r0)
            X.E1X r3 = X.C49781F6o.A01(r10, r9, r0)
            X.0qQ.A07(r3)
            X.7Pr r2 = X.DbX.A0f(r8)
            boolean r1 = X.JTU.A1a(r8)
            r0 = 2131963866(0x7f132fda, float:1.9564497E38)
            if (r1 == 0) goto L_0x0135
            r0 = 2131965485(0x7f13362d, float:1.9567781E38)
        L_0x0135:
            java.lang.String r0 = r6.getString(r0)
            r2.A0d = r0
            X.DbS.A1S(r2, r5)
            r4.A0F(r3, r2)
            return
        L_0x0142:
            java.lang.Object r0 = r2.A01
            instagram.features.clips.edit.ClipsEditMetadataController r0 = (instagram.features.clips.edit.ClipsEditMetadataController) r0
            android.content.Context r5 = r0.A0n
            com.instagram.common.session.UserSession r4 = r0.A0s
            goto L_0x0261
        L_0x014c:
            java.lang.Object r0 = r2.A01
            X.K4k r0 = (X.C61366K4k) r0
            androidx.fragment.app.FragmentActivity r4 = r0.requireActivity()
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.2EG r2 = X.2EG.A46
            java.lang.String r1 = "clips_editor_advanced_settings"
            goto L_0x01b3
        L_0x015f:
            java.lang.Object r0 = r2.A01
            X.K40 r0 = (X.K40) r0
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.2EG r1 = X.2EG.A2I
            java.lang.String r0 = "https://help.instagram.com/2635536099905516"
            X.SUL r1 = X.Dba.A0J(r3, r2, r1, r0)
            java.lang.String r0 = "UserPayCMPViolationBottomSheet"
            r1.A0S = r0
            goto L_0x030a
        L_0x017b:
            r0 = 1422(0x58e, float:1.993E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.net.Uri r1 = X.0cp.A03(r0)
            java.lang.Object r0 = r2.A01
            android.content.Context r0 = (android.content.Context) r0
            X.0kR.A0F(r0, r1)
            return
        L_0x018d:
            java.lang.Object r0 = r2.A01
            X.L9t r0 = (X.C63864L9t) r0
            android.app.Activity r1 = r0.A00
            com.instagram.common.session.UserSession r0 = r0.A02
            X.AnonymousClass4A2.A04(r1, r0)
            return
        L_0x0199:
            java.lang.Object r0 = r2.A01
            com.instagram.mediakit.ui.model.MediaKitLink r0 = (com.instagram.mediakit.ui.model.MediaKitLink) r0
            X.0sa r0 = r0.A01
            goto L_0x027e
        L_0x01a1:
            java.lang.Object r0 = r2.A01
            X.K8B r0 = (X.K8B) r0
            androidx.fragment.app.FragmentActivity r4 = r0.requireActivity()
            X.0eM r0 = r0.A06
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.2EG r2 = X.2EG.A46
            java.lang.String r1 = "igtv_upload_adv_settings"
        L_0x01b3:
            r0 = 1417(0x589, float:1.986E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.FH7.A08(r4, r3, r2, r0, r1)
            return
        L_0x01bd:
            java.lang.Object r1 = r2.A01
            X.KXf r1 = (X.KXf) r1
            X.0eM r0 = r1.A05
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            r0 = 126(0x7e, float:1.77E-43)
            java.lang.String r1 = X.C273654mx.A00(r0)
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.E1X r2 = X.C49957FGp.A00(r4, r1)
            X.7Pr r1 = X.DbS.A0W(r4)
            r0 = 2131954702(0x7f130c0e, float:1.954591E38)
            X.DbZ.A0z(r3, r1, r0)
            X.DbU.A0y(r3, r2, r1)
            return
        L_0x01e7:
            java.lang.Object r1 = r2.A01
            X.Lp0 r1 = (X.Lp0) r1
            X.4DH r0 = r1.A02
            android.content.Context r5 = r0.requireContext()
            com.instagram.common.session.UserSession r4 = r1.A03
            X.2EG r3 = X.2EG.A1V
            java.lang.String r1 = "https://help.instagram.com/761121959519495"
            goto L_0x0306
        L_0x01f9:
            java.lang.Object r0 = r2.A01
            X.Kag r0 = (X.C62130Kag) r0
            android.content.Context r5 = r0.requireContext()
            X.0eM r0 = r0.A02
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            X.2EG r3 = X.2EG.A2d
            r0 = 2
            X.0Tu r2 = X.DbS.A0J(r4, r0)
            r0 = 36888847040447289(0x830e3600050339, double:3.3919936356187345E-306)
            java.lang.String r1 = X.182.A04(r2, r4, r0)
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0306
            return
        L_0x021e:
            java.lang.Object r0 = r2.A01
            X.K4y r0 = (X.C61380K4y) r0
            android.content.Context r5 = r0.requireContext()
            com.instagram.common.session.UserSession r4 = r0.A01
            goto L_0x0233
        L_0x0229:
            java.lang.Object r0 = r2.A01
            X.K4x r0 = (X.C61379K4x) r0
            android.content.Context r5 = r0.requireContext()
            com.instagram.common.session.UserSession r4 = r0.A01
        L_0x0233:
            if (r4 == 0) goto L_0x0249
            X.2EG r3 = X.2EG.A2d
            X.0Tu r2 = X.0Tu.A05
            r0 = 36888847040447289(0x830e3600050339, double:3.3919936356187345E-306)
            java.lang.String r1 = X.182.A04(r2, r4, r0)
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0265
            return
        L_0x0249:
            java.lang.String r0 = "session"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0253:
            java.lang.Object r0 = r2.A01
            X.K4K r0 = (X.K4K) r0
            android.content.Context r5 = r0.requireContext()
            X.0eM r0 = r0.A07
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
        L_0x0261:
            X.2EG r3 = X.2EG.A1V
            java.lang.String r1 = "https://help.instagram.com/761121959519495"
        L_0x0265:
            X.SUL r1 = X.Dba.A0J(r5, r4, r3, r1)
            goto L_0x030a
        L_0x026b:
            r7 = 0
            X.0qQ.A0B(r1, r7)
            X.FEe r3 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r0 = r2.A01
            X.LSl r0 = (X.C64180LSl) r0
            android.content.Context r2 = r0.A01
            com.instagram.common.session.UserSession r1 = r0.A02
            goto L_0x02d0
        L_0x027a:
            java.lang.Object r0 = r2.A01
            X.0sa r0 = (X.C62320sa) r0
        L_0x027e:
            r0.invoke()
            return
        L_0x0282:
            java.lang.Object r0 = r2.A01
            X.LpM r0 = (X.C65216LpM) r0
            X.MXh r2 = r0.A04
            java.lang.String r1 = r0.A05
            X.0eM r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            X.L5p r0 = (X.C63757L5p) r0
            r2.DI9(r0, r1)
            return
        L_0x0296:
            java.lang.Object r4 = r2.A01
            X.K7r r4 = (X.C61441K7r) r4
            X.E0T r3 = new X.E0T
            r3.<init>()
            com.instagram.common.session.UserSession r0 = r4.A00
            X.7Pr r2 = X.DbS.A0W(r0)
            android.content.Context r1 = r1.getContext()
            r0 = 2131952929(0x7f130521, float:1.9542315E38)
            X.DbZ.A0z(r1, r2, r0)
            X.DbY.A13(r4, r3, r2)
            return
        L_0x02b3:
            r7 = 0
            X.0qQ.A0B(r1, r7)
            X.FEe r3 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r0 = r2.A01
            X.LlO r0 = (X.C64985LlO) r0
            android.content.Context r2 = r0.A02
            com.instagram.common.session.UserSession r1 = r0.A03
            goto L_0x02d0
        L_0x02c2:
            r7 = 0
            X.0qQ.A0B(r1, r7)
            X.FEe r3 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r0 = r2.A01
            X.L3q r0 = (X.C63706L3q) r0
            android.content.Context r2 = r0.A00
            com.instagram.common.session.UserSession r1 = r0.A01
        L_0x02d0:
            r0 = 1418(0x58a, float:1.987E-42)
            java.lang.String r20 = X.AnonymousClass000.A00(r0)
            r5 = 0
            r0 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r19 = r2.getString(r0)
            r12 = 1
            com.instagram.simplewebview.SimpleWebViewConfig r4 = new com.instagram.simplewebview.SimpleWebViewConfig
            r6 = r5
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r13 = r7
            r14 = r7
            r15 = r12
            r16 = r7
            r17 = r7
            r18 = r7
            r4.<init>((java.lang.String) r5, (java.lang.String) r6, (boolean) r7, (boolean) r8, (boolean) r9, (boolean) r10, (boolean) r11, (boolean) r12, (boolean) r13, (boolean) r14, (boolean) r15, (boolean) r16, (boolean) r17, (boolean) r18, (java.lang.String) r19, (java.lang.String) r20)
            r3.A02(r2, r1, r4)
            return
        L_0x02f6:
            java.lang.Object r0 = r2.A01
            X.UZ3 r0 = (X.UZ3) r0
            androidx.fragment.app.FragmentActivity r5 = r0.requireActivity()
            com.instagram.common.session.UserSession r4 = r0.A06()
            X.2EG r3 = X.2EG.A0e
            java.lang.String r1 = "https://help.instagram.com/2635536099905516"
        L_0x0306:
            X.SUL r1 = X.Dba.A0J(r5, r4, r3, r1)
        L_0x030a:
            r1.A0A()
            return
        L_0x030e:
            java.lang.Object r0 = r2.A01
            X.K86 r0 = (X.K86) r0
            X.0eM r0 = r0.A08
            X.2YL r2 = X.DbS.A0H(r0)
            X.6oS r5 = X.C318116oQ.A00(r2)
            r1 = 0
            r0 = 44
            X.MHA r4 = new X.MHA
            r4.<init>(r2, r1, r0)
            goto L_0x0344
        L_0x0325:
            java.lang.Object r1 = r2.A01
            X.K85 r1 = (X.K85) r1
            X.0eM r0 = r1.A06
            X.2YL r3 = X.DbS.A0H(r0)
            android.os.Bundle r1 = r1.requireArguments()
            java.lang.String r0 = "ext_balance"
            int r2 = r1.getInt(r0)
            X.6oS r5 = X.C318116oQ.A00(r3)
            r1 = 0
            r0 = 5
            X.MGb r4 = new X.MGb
            r4.<init>(r3, r1, r2, r0)
        L_0x0344:
            X.AnonymousClass7TE.A1Z(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62146Kaz.onClick(android.view.View):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62146Kaz(C61441K7r k7r, Integer num) {
        super(num);
        this.A01 = k7r;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62146Kaz(C61447K8b k8b, int i) {
        super(Integer.valueOf(i));
        this.A01 = k8b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62146Kaz(C63706L3q l3q, int i) {
        super(Integer.valueOf(i));
        this.A01 = l3q;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62146Kaz(C64985LlO llO, int i) {
        super(Integer.valueOf(i));
        this.A01 = llO;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62146Kaz(C61360K4c k4c, int i) {
        super(Integer.valueOf(i));
        this.A01 = k4c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62146Kaz(K7V k7v, int i) {
        super(Integer.valueOf(i));
        this.A01 = k7v;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62146Kaz(K85 k85, int i) {
        super(Integer.valueOf(i));
        this.A01 = k85;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62146Kaz(K86 k86, int i) {
        super(Integer.valueOf(i));
        this.A01 = k86;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62146Kaz(KXf kXf, int i) {
        super(Integer.valueOf(i));
        this.A01 = kXf;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62146Kaz(C62130Kag kag, int i) {
        super(Integer.valueOf(i));
        this.A01 = kag;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62146Kaz(C64180LSl lSl, int i) {
        super(Integer.valueOf(i));
        this.A01 = lSl;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62146Kaz(C62320sa r2, int i) {
        super(Integer.valueOf(i));
        this.A01 = r2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62146Kaz(K40 k40, int i) {
        super(Integer.valueOf(i));
        this.A01 = k40;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62146Kaz(K4K k4k, int i) {
        super(Integer.valueOf(i));
        this.A01 = k4k;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62146Kaz(C61379K4x k4x, int i) {
        super(Integer.valueOf(i));
        this.A01 = k4x;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62146Kaz(C61380K4y k4y, int i) {
        super(Integer.valueOf(i));
        this.A01 = k4y;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62146Kaz(K8B k8b, int i) {
        super(Integer.valueOf(i));
        this.A01 = k8b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62146Kaz(C63864L9t l9t, int i) {
        super(Integer.valueOf(i));
        this.A01 = l9t;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62146Kaz(C65216LpM lpM, int i) {
        super(Integer.valueOf(i));
        this.A01 = lpM;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62146Kaz(ClipsEditMetadataController clipsEditMetadataController, int i) {
        super(Integer.valueOf(i));
        this.A01 = clipsEditMetadataController;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62146Kaz(C61366K4k k4k, int i) {
        super(Integer.valueOf(i));
        this.A01 = k4k;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62146Kaz(K7H k7h, int i) {
        super(Integer.valueOf(i));
        this.A01 = k7h;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62146Kaz(Lp0 lp0, int i) {
        super(Integer.valueOf(i));
        this.A01 = lp0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62146Kaz(FragmentActivity fragmentActivity, int i) {
        super(Integer.valueOf(i));
        this.A01 = fragmentActivity;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62146Kaz(MediaKitLink mediaKitLink, int i) {
        super(Integer.valueOf(i));
        this.A01 = mediaKitLink;
    }
}

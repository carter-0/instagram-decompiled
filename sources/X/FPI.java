package X;

import android.view.View;

public final class FPI implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public FPI(E5H e5h, int i) {
        this.A00 = i;
        switch (i) {
            case 55:
            case 56:
            case 57:
                this.A01 = e5h;
                return;
            default:
                this.A01 = e5h;
                return;
        }
    }

    public static FPI A00(Object obj, int i) {
        return new FPI(obj, i);
    }

    public static void A01(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new FPI(obj, i), view);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x08c0: MOVE  (r2v77 com.instagram.igds.components.bottomsheet.BottomSheetFragment) = 
          (r2v73 com.instagram.igds.components.bottomsheet.BottomSheetFragment)
        
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
            r1 = r21
            r3 = r22
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x1062;
                case 1: goto L_0x1028;
                case 2: goto L_0x0f6b;
                case 3: goto L_0x0f51;
                case 4: goto L_0x0f10;
                case 5: goto L_0x0ea0;
                case 6: goto L_0x0e6c;
                case 7: goto L_0x0da9;
                case 8: goto L_0x0d49;
                case 9: goto L_0x0d34;
                case 10: goto L_0x0d1f;
                case 11: goto L_0x0ce5;
                case 12: goto L_0x0c60;
                case 13: goto L_0x0c4f;
                case 14: goto L_0x0c3c;
                case 15: goto L_0x0c28;
                case 16: goto L_0x0c14;
                case 17: goto L_0x0c01;
                case 18: goto L_0x0bed;
                case 19: goto L_0x0bdc;
                case 20: goto L_0x0bcb;
                case 21: goto L_0x0b6a;
                case 22: goto L_0x0b0d;
                case 23: goto L_0x0ad2;
                case 24: goto L_0x0abf;
                case 25: goto L_0x0a12;
                case 26: goto L_0x09b0;
                case 27: goto L_0x099d;
                case 28: goto L_0x0957;
                case 29: goto L_0x08f5;
                case 30: goto L_0x088e;
                case 31: goto L_0x085d;
                case 32: goto L_0x0848;
                case 33: goto L_0x06cb;
                case 34: goto L_0x0656;
                case 35: goto L_0x0633;
                case 36: goto L_0x0610;
                case 37: goto L_0x05ff;
                case 38: goto L_0x058c;
                case 39: goto L_0x0549;
                case 40: goto L_0x052e;
                case 41: goto L_0x0513;
                case 42: goto L_0x04ee;
                case 43: goto L_0x04cb;
                case 44: goto L_0x0440;
                case 45: goto L_0x03e1;
                case 46: goto L_0x03ce;
                case 47: goto L_0x0803;
                case 48: goto L_0x0366;
                case 49: goto L_0x02b6;
                case 50: goto L_0x032a;
                case 51: goto L_0x0009;
                case 52: goto L_0x0009;
                case 53: goto L_0x0009;
                case 54: goto L_0x02ae;
                case 55: goto L_0x00bf;
                case 56: goto L_0x008b;
                case 57: goto L_0x0268;
                case 58: goto L_0x025e;
                case 59: goto L_0x0068;
                case 60: goto L_0x0249;
                case 61: goto L_0x0238;
                case 62: goto L_0x01e3;
                case 63: goto L_0x01d9;
                case 64: goto L_0x01cf;
                case 65: goto L_0x01c5;
                case 66: goto L_0x0198;
                case 67: goto L_0x0176;
                case 68: goto L_0x016e;
                case 69: goto L_0x0156;
                case 70: goto L_0x014e;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r5 = r1.A01
            X.E5J r5 = (X.E5J) r5
            android.widget.EditText r0 = r5.A01
            java.lang.String r7 = X.AnonymousClass7TF.A0f(r0)
            android.content.Context r0 = r5.A00
            r4 = 1
            boolean r0 = X.C48877Eld.A00(r0, r7, r4, r4)
            if (r0 == 0) goto L_0x0057
            boolean r0 = r5.A0C
            r6 = 0
            if (r0 == 0) goto L_0x0058
            com.instagram.actionbar.ActionButton r0 = r5.A03
        L_0x0023:
            if (r0 == 0) goto L_0x0028
            r0.setEnabled(r6)
        L_0x0028:
            java.util.List r0 = r5.A0B
            int r1 = r0.size()
            r0 = 2
            if (r1 < r0) goto L_0x0057
            X.C46445Df7.A01(r5, r4)
            com.instagram.common.session.UserSession r3 = r5.A04
            java.lang.String r2 = X.DbV.A0s()
            java.lang.String r1 = r7.trim()
            java.util.List r0 = r5.A0B
            java.util.ArrayList r0 = X.FFJ.A02(r0)
            X.0qQ.A0B(r3, r6)
            X.1OC r2 = com.instagram.direct.request.DirectThreadApi.A0D(r3, r2, r1, r0)
            com.instagram.common.session.UserSession r1 = r5.A04
            X.Dwh r0 = new X.Dwh
            r0.<init>(r1, r5, r4)
            r2.A00 = r0
            X.1ES.A03(r2)
        L_0x0057:
            return
        L_0x0058:
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            X.2dZ r0 = X.2dY.A00(r0)
            if (r0 == 0) goto L_0x0065
            r0.ARJ(r6)
        L_0x0065:
            com.instagram.igds.components.button.IgdsButton r0 = r5.A08
            goto L_0x0023
        L_0x0068:
            java.lang.Object r0 = r1.A01
            X.FTS r0 = (X.FTS) r0
            java.lang.Object r2 = r0.A01
            X.E5H r2 = (X.E5H) r2
            com.instagram.common.ui.base.IgEditText r1 = r2.A05
            if (r1 == 0) goto L_0x0057
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r2.A07
            if (r0 == 0) goto L_0x0057
            X.DbS.A1C(r1)
            com.instagram.common.ui.base.IgEditText r1 = r2.A05
            r0 = 2131960136(0x7f132148, float:1.9556932E38)
            r1.setHint(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r2.A07
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x008b:
            java.lang.Object r5 = r1.A01
            X.E5H r5 = (X.E5H) r5
            X.FYv r3 = r5.A09
            if (r3 == 0) goto L_0x00bd
            X.F0V r2 = X.E5H.A00(r5)
            X.1Ln r1 = X.C50338FYv.A00(r3)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x00bd
            X.C50338FYv.A04(r1, r3)
            java.lang.String r0 = "thread_create_attempt"
            X.DbV.A1M(r1, r0)
            java.lang.String r0 = "direct_invite_skip_button"
            r1.A0p(r0)
            java.lang.String r0 = "invite_people"
            X.C50338FYv.A05(r1, r3, r0)
            java.util.HashMap r0 = X.C50338FYv.A03(r2, r3)
            r1.A0w(r0)
            r1.Cgf()
        L_0x00bd:
            r1 = 1
            goto L_0x00cf
        L_0x00bf:
            java.lang.Object r5 = r1.A01
            X.E5H r5 = (X.E5H) r5
            X.FYv r1 = r5.A09
            if (r1 == 0) goto L_0x00ce
            X.F0V r0 = X.E5H.A00(r5)
            r1.A07(r0)
        L_0x00ce:
            r1 = 0
        L_0x00cf:
            java.lang.Integer r0 = r5.A0J
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = r5.A0K
            if (r0 == 0) goto L_0x0057
            r11 = 0
            com.instagram.igds.components.button.IgdsButton r2 = r5.A0E
            if (r2 == 0) goto L_0x00e8
            com.instagram.igds.components.button.IgdsButton r0 = r5.A0D
            if (r0 == 0) goto L_0x00e8
            r2.setEnabled(r11)
            com.instagram.igds.components.button.IgdsButton r0 = r5.A0D
            r0.setEnabled(r11)
        L_0x00e8:
            X.FYv r0 = r5.A09
            r0.getClass()
            X.DbZ.A1Y(r5)
            X.FYv r2 = r5.A09
            X.F0V r0 = X.E5H.A00(r5)
            r2.A07(r0)
            com.instagram.common.session.UserSession r6 = r5.A04
            java.lang.String r7 = r5.A0K
            r8 = 0
            java.lang.Boolean r0 = r5.A0H
            boolean r10 = r0.booleanValue()
            java.lang.Integer r0 = r5.A0J
            int r9 = r0.intValue()
            X.1OC r7 = com.instagram.direct.request.DirectThreadApi.A09(r6, r7, r8, r9, r10, r11)
            r10 = 1
            if (r1 == 0) goto L_0x014b
            com.instagram.igds.components.button.IgdsButton r0 = r5.A0E
        L_0x0113:
            if (r0 == 0) goto L_0x0118
            r0.setLoading(r10)
        L_0x0118:
            com.instagram.common.session.UserSession r3 = r5.A04
            X.0qQ.A0B(r3, r11)
            r0 = 13
            X.DhC r2 = new X.DhC
            r2.<init>(r3, r0)
            java.lang.Class<X.F1x> r0 = X.C49687F1x.class
            java.lang.Object r4 = r3.A01(r0, r2)
            X.F1x r4 = (X.C49687F1x) r4
            X.Fwf r3 = new X.Fwf
            r3.<init>(r5, r10, r1)
            r0 = 2
            X.Fwf r2 = new X.Fwf
            r2.<init>(r5, r0, r1)
            com.instagram.common.session.UserSession r1 = r4.A00
            X.NHz r0 = new X.NHz
            r0.<init>(r1, r2, r3, r11)
            r7.A00 = r0
            X.4D6 r6 = r4.A01
            int r8 = r7.getRunnableId()
            r9 = 3
            r6.schedule(r7, r8, r9, r10, r11)
            return
        L_0x014b:
            com.instagram.igds.components.button.IgdsButton r0 = r5.A0D
            goto L_0x0113
        L_0x014e:
            java.lang.Object r0 = r1.A01
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r0 = (com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment) r0
            r0.DU3()
            return
        L_0x0156:
            java.lang.Object r1 = r1.A01
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r1 = (com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment) r1
            X.EIn r0 = com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment.A02(r1)
            java.util.List r0 = r0.A0F()
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment.A0O(r1, r0)
            X.DbX.A1J(r1)
            java.lang.String r0 = "ig_content_deep_dive:prompt_send"
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment.A0L(r1, r0)
            return
        L_0x016e:
            java.lang.Object r0 = r1.A01
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r0 = (com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment) r0
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment.A0E(r0)
            return
        L_0x0176:
            java.lang.Object r2 = r1.A01
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r2 = (com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController) r2
            X.4DH r0 = r2.A0w
            android.content.Context r1 = r0.requireContext()
            java.lang.String r0 = r2.A0T
            X.C48300EcJ.A00(r1, r0)
            com.instagram.common.ui.base.IgTextView r3 = (com.instagram.common.ui.base.IgTextView) r3
            r0 = 2131956742(0x7f131406, float:1.9550048E38)
            r3.setText(r0)
            X.Fq8 r2 = new X.Fq8
            r2.<init>(r3)
            r0 = 5000(0x1388, double:2.4703E-320)
            r3.postDelayed(r2, r0)
            return
        L_0x0198:
            r0 = 93630710(0x594b0f6, float:1.3982858E-35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.EEP r7 = (X.EEP) r7
            com.instagram.common.session.UserSession r6 = r7.A0g
            com.instagram.direct.channels.analytics.ChannelCreationSource r5 = com.instagram.direct.channels.analytics.ChannelCreationSource.OMNIPICKER
            X.EV0 r4 = X.EV0.Social
            r3 = 0
            X.0qQ.A0B(r6, r3)
            r2 = 0
            com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs r1 = new com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs
            r1.<init>(r2, r2, r2)
            X.G6v r2 = X.FC2.A01(r6, r1, r5, r4, r3)
            X.G9Y r1 = r7.A0m
            androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
            r2.CfS(r1)
            r1 = 1001271010(0x3bae2ee2, float:0.0053156475)
            goto L_0x1083
        L_0x01c5:
            java.lang.Object r0 = r1.A01
            X.EEP r0 = (X.EEP) r0
            X.G9Y r0 = r0.A0m
            r0.E0v()
            return
        L_0x01cf:
            java.lang.Object r0 = r1.A01
            X.EEP r0 = (X.EEP) r0
            X.G9Y r0 = r0.A0m
            r0.E0n()
            return
        L_0x01d9:
            java.lang.Object r0 = r1.A01
            X.EEP r0 = (X.EEP) r0
            X.G9Y r0 = r0.A0m
            r0.E0q()
            return
        L_0x01e3:
            java.lang.Object r0 = r1.A01
            X.EEP r0 = (X.EEP) r0
            com.instagram.common.session.UserSession r5 = r0.A0g
            X.G9Y r4 = r0.A0m
            boolean r2 = X.AnonymousClass7TG.A1Z(r5, r4)
            X.0wc r1 = X.AnonymousClass0kN.A01(r4, r5)
            java.lang.String r0 = "direct_group_creation_group_chat_row_tap"
            X.Dba.A1I(r1, r0)
            android.content.Context r0 = r4.requireContext()
            X.OW4 r1 = new X.OW4
            r1.<init>(r5, r0)
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x020b
            r1.A00()
            return
        L_0x020b:
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "direct_is_creating_group_chat"
            r3.putBoolean(r0, r2)
            X.EZi r1 = X.C48140EZi.OMNIPICKET_CREATE_GROUP_CHAT_ROW
            java.lang.String r0 = "direct_group_creation_entrypoint"
            r3.putSerializable(r0, r1)
            X.E5H r2 = new X.E5H
            r2.<init>()
            r2.setArguments(r3)
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            X.6Yo r1 = X.DbS.A0M(r0, r5)
            java.lang.String r0 = r4.getModuleName()
            r1.A0A = r0
            r1.A0E(r2)
            r1.A04()
            return
        L_0x0238:
            r0 = 2021074312(0x78772588, float:2.0050915E34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dbb.A1S(r1)
            r1 = -1689063621(0xffffffff9b52ef3b, float:-1.7448092E-22)
            goto L_0x1083
        L_0x0249:
            r0 = 1925408961(0x72c368c1, float:7.740956E30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.FTS r1 = (X.FTS) r1
            java.lang.Object r1 = r1.A01
            X.Dbb.A1S(r1)
            r1 = 286424891(0x11127f3b, float:1.1556575E-28)
            goto L_0x1083
        L_0x025e:
            java.lang.Object r0 = r1.A01
            X.FTS r0 = (X.FTS) r0
            java.lang.Object r0 = r0.A01
            X.Dbb.A1S(r0)
            return
        L_0x0268:
            java.lang.Object r4 = r1.A01
            X.E5H r4 = (X.E5H) r4
            X.DbZ.A1Y(r4)
            com.instagram.common.session.UserSession r0 = r4.A04
            r3 = 0
            X.0wc r1 = X.DbT.A0Q(r4, r0, r3)
            java.lang.String r0 = "direct_add_users_tap_plus"
            X.Dba.A1I(r1, r0)
            com.instagram.common.session.UserSession r2 = r4.A04
            X.EEP r0 = r4.A0A
            java.util.Map r0 = r0.A0r
            com.google.common.collect.ImmutableMap r1 = com.google.common.collect.ImmutableMap.copyOf(r0)
            boolean r3 = X.AnonymousClass7TF.A1U(r3, r2, r1)
            android.os.Bundle r0 = X.DbV.A0A(r2)
            X.E65 r2 = new X.E65
            r2.<init>()
            r2.setArguments(r0)
            r2.A00 = r4
            r2.A01 = r1
            com.instagram.common.session.UserSession r0 = r4.A04
            X.7Pr r1 = X.DbX.A0e(r0, r3)
            r0 = 2131100175(0x7f06020f, float:1.7812724E38)
            r1.A0B = r0
            r1.A17 = r3
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.A03 = r0
            X.DbY.A13(r4, r2, r1)
            return
        L_0x02ae:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.DbT.A1I(r0)
            return
        L_0x02b6:
            r0 = -1426949471(0xffffffffaaf27aa1, float:-4.3072926E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.E43 r6 = (X.E43) r6
            X.OSg r5 = r6.A01
            if (r5 == 0) goto L_0x03ca
            java.lang.String r3 = r6.A05
            if (r3 != 0) goto L_0x02cd
            java.lang.String r9 = "serverMode"
            goto L_0x0f84
        L_0x02cd:
            java.lang.String r2 = r6.A03
            if (r2 != 0) goto L_0x02d5
            java.lang.String r9 = "initialFolderName"
            goto L_0x0f84
        L_0x02d5:
            java.lang.String r4 = r6.A04
            java.lang.String r9 = "newFolderName"
            if (r4 == 0) goto L_0x0f84
            r8 = 0
            r7 = 1
            java.lang.String r1 = "server_mode"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r1, r3)
            java.lang.String r1 = "old_name"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r1, r2)
            java.lang.String r1 = "new_name"
            java.util.LinkedHashMap r2 = X.DbY.A0q(r1, r4, r3, r2)
            java.lang.String r1 = "inbox_folders_manage_screen_edit_save_click"
            X.C70933OSg.A00(r5, r1, r2)
            X.0eM r1 = r6.A0A
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r4 = r6.A02
            if (r4 != 0) goto L_0x0302
            java.lang.String r9 = "folderId"
            goto L_0x0f84
        L_0x0302:
            java.lang.String r3 = r6.A04
            if (r3 == 0) goto L_0x0f84
            X.0qQ.A0B(r5, r8)
            java.lang.Class<X.1nJ> r1 = X.AnonymousClass1nJ.class
            X.MaY r1 = X.C66669Mac.A08(r5, r1)
            X.0qQ.A0B(r1, r7)
            X.1nJ r2 = new X.1nJ
            r2.<init>(r1)
            r2.A00 = r4
            r2.A01 = r3
            X.1Ou r1 = X.1Ou.A01(r5)
            r1.A0A(r2)
            X.Dbb.A0z(r6)
            r1 = -194766685(0xfffffffff46418a3, float:-7.2286583E31)
            goto L_0x1083
        L_0x032a:
            r0 = 788827690(0x2f048e2a, float:1.2055837E-10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.NIv r4 = (X.C68457NIv) r4
            X.OSg r3 = r4.A03
            if (r3 == 0) goto L_0x03ca
            java.lang.String r2 = "inbox_folder_manage_screen_info_click"
            X.0sm r1 = X.0Yt.A0E()
            X.C70933OSg.A00(r3, r2, r1)
            X.0eM r1 = r4.A06
            X.7Pr r2 = X.DbX.A0f(r1)
            r1 = 2131959707(0x7f131f9b, float:1.9556062E38)
            java.lang.String r1 = r4.getString(r1)
            r2.A0d = r1
            X.7Pu r3 = r2.A00()
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            X.E13 r1 = new X.E13
            r1.<init>()
            r3.A02(r2, r1)
            r1 = 516157491(0x1ec3f033, float:2.0745772E-20)
            goto L_0x1083
        L_0x0366:
            r0 = -1568470044(0xffffffffa2830be4, float:-3.552021E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.E43 r6 = (X.E43) r6
            X.OSg r3 = r6.A01
            r5 = 0
            if (r3 == 0) goto L_0x03ca
            java.lang.String r2 = "inbox_folders_edit_screen_delete_button_click"
            X.0sm r1 = X.0Yt.A0E()
            X.C70933OSg.A00(r3, r2, r1)
            android.os.Bundle r2 = r6.requireArguments()
            r1 = 1048(0x418, float:1.469E-42)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            java.lang.String r4 = X.C320236s2.A01(r2, r1)
            X.8ab r3 = X.DbW.A0V(r6)
            r1 = 2131959685(0x7f131f85, float:1.9556017E38)
            r3.A09(r1)
            android.content.Context r2 = r6.requireContext()
            r1 = 2131959682(0x7f131f82, float:1.9556011E38)
            java.lang.String r1 = X.DbW.A0h(r2, r4, r1)
            if (r1 != 0) goto L_0x03a6
            java.lang.String r1 = ""
        L_0x03a6:
            android.text.Spanned r1 = android.text.Html.fromHtml(r1)
            X.0qQ.A07(r1)
            r3.A0q(r1)
            r2 = 2131959683(0x7f131f83, float:1.9556013E38)
            r1 = 36
            X.FJi r1 = X.C50023FJi.A00(r6, r1)
            r3.A0L(r1, r2)
            r1 = 2131959684(0x7f131f84, float:1.9556015E38)
            r3.A0G(r5, r1)
            X.DbT.A1V(r3)
            r1 = 781455270(0x2e940fa6, float:6.7330405E-11)
            goto L_0x1083
        L_0x03ca:
            java.lang.String r9 = "logger"
            goto L_0x0f84
        L_0x03ce:
            r0 = 2018539669(0x78507895, float:1.6913179E34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.FEo r1 = (X.FEo) r1
            X.FEo.A00(r1)
            r1 = 2094636799(0x7cd99eff, float:9.039626E36)
            goto L_0x1083
        L_0x03e1:
            r0 = -806780244(0xffffffffcfe982ac, float:-7.8353101E9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.E5E r2 = (X.E5E) r2
            X.DbT.A1J(r2)
            X.0eM r1 = r2.A03
            X.6gx r6 = X.DbZ.A0R(r1)
            X.0eM r1 = r2.A02
            int r5 = X.DbX.A07(r1)
            X.0eM r1 = r2.A06
            java.lang.Object r1 = r1.getValue()
            X.DkH r1 = (X.C46728DkH) r1
            X.0Ud r1 = r1.A08
            java.lang.Object r1 = r1.getValue()
            X.JwA r1 = (X.C61072JwA) r1
            int r2 = r1.A01
            X.1Ln r4 = X.DbT.A0J(r6)
            boolean r1 = X.DbT.A1Y(r4)
            if (r1 == 0) goto L_0x043b
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "carousel_id"
            r3.put(r1, r2)
            X.DbW.A17(r4, r6)
            java.lang.String r1 = "exit_creator_nux_sheet"
            r4.A0l(r1)
            java.lang.String r1 = "impression"
            r4.A0k(r1)
            java.lang.String r1 = "back_button"
            r4.A0p(r1)
            java.lang.String r1 = "broadcast_chat_creator_nux"
            X.Dbc.A0j(r4, r6, r1, r3, r5)
        L_0x043b:
            r1 = -1764969741(0xffffffff96ccb2f3, float:-3.307091E-25)
            goto L_0x1083
        L_0x0440:
            r0 = -85398870(0xfffffffffae8eaaa, float:-6.046862E35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.E5E r7 = (X.E5E) r7
            android.os.Bundle r2 = r7.requireArguments()
            java.lang.String r1 = "InterestBasedChannelType"
            boolean r1 = r2.containsKey(r1)
            if (r1 == 0) goto L_0x04c9
            X.EV0 r5 = X.C48845El7.A00(r2)
        L_0x045b:
            X.0eM r1 = r7.A04
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            X.0eM r1 = r7.A05
            java.lang.Object r3 = r1.getValue()
            com.instagram.direct.channels.analytics.ChannelCreationSource r3 = (com.instagram.direct.channels.analytics.ChannelCreationSource) r3
            X.0eM r1 = r7.A01
            java.lang.Object r2 = r1.getValue()
            com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs r2 = (com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs) r2
            r1 = 1
            X.G6v r2 = X.FC2.A01(r4, r2, r3, r5, r1)
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            r2.CfS(r1)
            X.0eM r1 = r7.A03
            X.6gx r6 = X.DbZ.A0R(r1)
            X.0eM r1 = r7.A02
            int r5 = X.DbX.A07(r1)
            X.0eM r1 = r7.A06
            java.lang.Object r1 = r1.getValue()
            X.DkH r1 = (X.C46728DkH) r1
            X.0Ud r1 = r1.A08
            java.lang.Object r1 = r1.getValue()
            X.JwA r1 = (X.C61072JwA) r1
            int r2 = r1.A01
            X.1Ln r4 = X.DbT.A0J(r6)
            boolean r1 = X.DbT.A1Y(r4)
            if (r1 == 0) goto L_0x04c4
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "carousel_id"
            r3.put(r1, r2)
            X.DbW.A17(r4, r6)
            java.lang.String r1 = "create_channel_sheet_rendered"
            X.DbV.A1M(r4, r1)
            java.lang.String r1 = "get_started_button"
            r4.A0p(r1)
            java.lang.String r1 = "broadcast_chat_creator_nux"
            X.Dbc.A0j(r4, r6, r1, r3, r5)
        L_0x04c4:
            r1 = 2143482875(0x7fc2f3fb, float:NaN)
            goto L_0x1083
        L_0x04c9:
            r5 = 0
            goto L_0x045b
        L_0x04cb:
            r0 = 611620476(0x2474967c, float:5.303653E-17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.NKn r4 = (X.C68494NKn) r4
            com.instagram.common.session.UserSession r3 = r4.A0C()
            com.instagram.direct.channels.analytics.ChannelCreationSource r2 = com.instagram.direct.channels.analytics.ChannelCreationSource.ACTIVITY_FEED
            X.EV0 r1 = X.EV0.Broadcast
            X.G6v r2 = X.FC2.A02(r3, r2, r1)
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            r2.CfS(r1)
            r1 = -1055253716(0xffffffffc11a1b2c, float:-9.631634)
            goto L_0x1083
        L_0x04ee:
            r0 = 169343530(0xa17fa2a, float:7.317436E-33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.NKl r4 = (X.C68492NKl) r4
            X.0eM r1 = r4.A03
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.direct.channels.analytics.ChannelCreationSource r2 = com.instagram.direct.channels.analytics.ChannelCreationSource.ACTIVITY_FEED
            X.EV0 r1 = X.EV0.Broadcast
            X.G6v r2 = X.FC2.A02(r3, r2, r1)
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            r2.CfS(r1)
            r1 = 200844675(0xbf8a583, float:9.577516E-32)
            goto L_0x1083
        L_0x0513:
            r0 = -881835294(0xffffffffcb7042e2, float:-1.5745762E7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.E4V r1 = (X.E4V) r1
            X.DkL r2 = X.E4V.A00(r1)
            androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
            r2.A0I(r1)
            r1 = -502087218(0xffffffffe212c1ce, float:-6.767974E20)
            goto L_0x1083
        L_0x052e:
            r0 = 942070602(0x3826db4a, float:3.9781713E-5)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.E4V r1 = (X.E4V) r1
            X.DkL r2 = X.E4V.A00(r1)
            androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
            r2.A0I(r1)
            r1 = 1252609855(0x4aa94f3f, float:5547935.5)
            goto L_0x1083
        L_0x0549:
            r0 = 1699955259(0x6553423b, float:6.2352567E22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.E4V r5 = (X.E4V) r5
            X.0eM r1 = r5.A0F
            X.6gx r4 = X.DbZ.A0R(r1)
            X.0eM r1 = r5.A0D
            int r3 = X.DbX.A07(r1)
            X.1Ln r2 = X.DbT.A0J(r4)
            boolean r1 = X.DbT.A1Y(r2)
            if (r1 == 0) goto L_0x0584
            X.DbW.A17(r2, r4)
            java.lang.String r1 = "exit_chat_setup_sheet"
            r2.A0l(r1)
            java.lang.String r1 = "impression"
            r2.A0k(r1)
            java.lang.String r1 = "back_button"
            r2.A0p(r1)
            java.lang.String r1 = "chat_setup"
            X.DbZ.A1L(r2, r1, r3)
            X.Dba.A1C(r2, r4)
        L_0x0584:
            X.DbT.A1J(r5)
            r1 = -1158555428(0xffffffffbaf1d8dc, float:-0.001845147)
            goto L_0x1083
        L_0x058c:
            r0 = -592765925(0xffffffffdcab1c1b, float:-3.85304986E17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.E4V r3 = (X.E4V) r3
            X.DbT.A1J(r3)
            X.EV0 r2 = X.E4V.A01(r3)
            X.EV0 r1 = X.EV0.Broadcast
            if (r2 != r1) goto L_0x05ce
            X.0eM r1 = r3.A0F
            X.6gx r2 = X.DbZ.A0R(r1)
            X.1Ln r3 = X.DbT.A0J(r2)
            boolean r1 = X.DbT.A1Y(r3)
            if (r1 == 0) goto L_0x05c9
            com.instagram.common.session.UserSession r1 = r2.A04
            X.Dbb.A1G(r3, r1)
            java.lang.String r1 = "set_channel_duration"
            X.DbV.A1M(r3, r1)
            java.lang.String r1 = "channel_duration_sheet"
            X.Dbb.A1H(r3, r1)
            java.lang.String r1 = r2.A01
        L_0x05c3:
            r3.A0v(r1)
            r3.Cgf()
        L_0x05c9:
            r1 = -722373883(0xffffffffd4f17305, float:-8.2961346E12)
            goto L_0x1083
        L_0x05ce:
            X.EV0 r2 = X.E4V.A01(r3)
            X.EV0 r1 = X.EV0.Social
            if (r2 != r1) goto L_0x05c9
            X.0eM r1 = r3.A0H
            java.lang.Object r2 = r1.getValue()
            X.FYv r2 = (X.C50338FYv) r2
            X.1Ln r3 = X.C50338FYv.A00(r2)
            boolean r1 = X.DbT.A1Y(r3)
            if (r1 == 0) goto L_0x05c9
            com.instagram.common.session.UserSession r1 = r2.A03
            X.Dbb.A1G(r3, r1)
            java.lang.String r1 = "set_channel_duration"
            X.DbV.A1M(r3, r1)
            java.lang.String r1 = "channel_duration_sheet"
            r3.A0p(r1)
            java.lang.String r1 = "chat_setup"
            X.Dba.A1E(r3, r1)
            java.lang.String r1 = r2.A00
            goto L_0x05c3
        L_0x05ff:
            r0 = 90902991(0x56b11cf, float:1.1052918E-35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dba.A1Q(r1)
            r1 = -762118226(0xffffffffd292ffae, float:-3.15677409E11)
            goto L_0x1083
        L_0x0610:
            r0 = -1678792317(0xffffffff9befa983, float:-3.9648778E-22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.E3h r1 = (X.E3h) r1
            X.DbZ.A17(r1)
            X.0eM r1 = r1.A01
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r1)
            X.818 r4 = X.AnonymousClass818.IG_CHANNELS_XPOSTING_MESSAGE_FOOTER
            X.819 r3 = X.AnonymousClass819.BOTTOMSHEET_XPOSTING_CHANNELS
            X.8sM r2 = X.C368278sM.DECLINE
            r1 = 0
            X.C368288sN.A00(r4, r2, r3, r1, r5)
            r1 = 1210809942(0x482b7e56, float:175609.34)
            goto L_0x1083
        L_0x0633:
            r0 = 1225838050(0x4910cde2, float:593118.1)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            androidx.fragment.app.FragmentActivity r4 = r5.requireActivity()
            X.37D r3 = X.DbT.A0i(r4)
            if (r3 == 0) goto L_0x0651
            r2 = 1
            X.FmJ r1 = new X.FmJ
            r1.<init>(r2, r4, r5)
            X.DbU.A1U(r1, r3, r3)
        L_0x0651:
            r1 = -1634838287(0xffffffff9e8e58f1, float:-1.507162E-20)
            goto L_0x1083
        L_0x0656:
            r0 = -2127773135(0xffffffff812cc231, float:-3.1730736E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.E17 r2 = (X.E17) r2
            X.DbZ.A17(r2)
            int r1 = r2.A00
            boolean r1 = X.AnonymousClass48O.A01(r1)
            if (r1 == 0) goto L_0x06c6
            X.0eM r1 = r2.A02
            java.lang.Object r7 = r1.getValue()
            X.FYv r7 = (X.C50338FYv) r7
            X.2Er r1 = r2.A01
            java.lang.String r9 = "threadViewModel"
            if (r1 == 0) goto L_0x0f84
            java.lang.String r6 = r1.C6C()
            X.2Er r1 = r2.A01
            if (r1 == 0) goto L_0x0f84
            java.lang.String r5 = r1.C6k()
            java.lang.String r4 = "upsell"
            X.1Ln r3 = X.C50338FYv.A00(r7)
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = "entrypoint"
            r2.put(r1, r4)
            boolean r1 = X.DbT.A1Y(r3)
            if (r1 == 0) goto L_0x06c6
            X.C50338FYv.A04(r3, r7)
            java.lang.String r1 = "share_to_story_declined"
            X.DbV.A1M(r3, r1)
            r1 = 3063(0xbf7, float:4.292E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r3.A0p(r1)
            java.lang.String r1 = "share_to_story_bottom_sheet"
            X.Dba.A1E(r3, r1)
            r3.A0s(r6)
            java.lang.Long r1 = X.DbZ.A0d(r5)
            r3.A0i(r1)
            r3.A0w(r2)
            java.lang.String r1 = r7.A00
            r3.A0v(r1)
            r3.Cgf()
        L_0x06c6:
            r1 = 1008373693(0x3c1a8fbd, float:0.009433684)
            goto L_0x1083
        L_0x06cb:
            r0 = 1761895735(0x69046537, float:1.0003511E25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.E17 r2 = (X.E17) r2
            X.2Er r1 = r2.A01
            java.lang.String r8 = "threadViewModel"
            if (r1 == 0) goto L_0x0814
            java.lang.String r11 = r1.C6C()
            X.2Er r1 = r2.A01
            if (r1 == 0) goto L_0x0814
            java.lang.String r12 = r1.C6k()
            X.2Er r1 = r2.A01
            if (r1 == 0) goto L_0x0814
            java.lang.String r13 = r1.C6f()
            X.2Er r1 = r2.A01
            if (r1 == 0) goto L_0x0814
            int r15 = r1.AdN()
            X.2Er r1 = r2.A01
            r10 = 0
            if (r1 == 0) goto L_0x0814
            java.lang.String r6 = r1.AsX()
            X.0eE r1 = X.AnonymousClass0t1.A01
            X.0eM r3 = r2.A03
            com.instagram.user.model.User r5 = X.DbX.A0l(r1, r3)
            if (r6 == 0) goto L_0x0719
            int r4 = r2.A00
            r1 = 29
            if (r4 == r1) goto L_0x07f9
            r1 = 32
            if (r4 == r1) goto L_0x07e7
            r1 = 62
            if (r4 == r1) goto L_0x07e7
        L_0x0719:
            X.2Er r1 = r2.A01
            if (r1 == 0) goto L_0x0814
            java.util.List r1 = r1.BRZ()
            int r1 = r1.size()
            int r16 = r1 + 1
            X.2Er r1 = r2.A01
            if (r1 == 0) goto L_0x0814
            int r17 = r1.C6a()
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r1 = "UPSELL"
            java.lang.String r14 = X.DbT.A12(r4, r1)
            X.2Er r1 = r2.A01
            if (r1 == 0) goto L_0x0814
            java.lang.String r4 = r1.AsX()
            java.lang.String r1 = X.DbU.A0u(r3)
            boolean r18 = X.0qQ.A0K(r4, r1)
            r19 = 0
            com.instagram.direct.sharetostory.data.JoinChatStickerData r9 = new com.instagram.direct.sharetostory.data.JoinChatStickerData
            r20 = r19
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
            X.28D r4 = X.28D.A2M
            r1 = 1017(0x3f9, float:1.425E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r6.putSerializable(r1, r4)
            r1 = 1018(0x3fa, float:1.427E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r6.putParcelable(r1, r9)
            X.0lg r5 = X.DbT.A0X(r3)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r4 = com.instagram.modal.TransparentModalActivity.class
            androidx.fragment.app.FragmentActivity r3 = r2.getActivity()
            r1 = 921(0x399, float:1.29E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.6W8 r1 = X.AnonymousClass6W8.A02(r3, r6, r5, r4, r1)
            X.DbT.A1M(r2, r1)
            X.DbZ.A17(r2)
            int r1 = r2.A00
            boolean r1 = X.AnonymousClass48O.A01(r1)
            if (r1 == 0) goto L_0x07e2
            X.0eM r1 = r2.A02
            java.lang.Object r7 = r1.getValue()
            X.FYv r7 = (X.C50338FYv) r7
            X.2Er r1 = r2.A01
            if (r1 == 0) goto L_0x0814
            java.lang.String r6 = r1.C6C()
            X.2Er r1 = r2.A01
            if (r1 == 0) goto L_0x0814
            java.lang.String r5 = r1.C6k()
            java.lang.String r4 = "upsell"
            X.1Ln r3 = X.C50338FYv.A00(r7)
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = "entrypoint"
            r2.put(r1, r4)
            boolean r1 = X.DbT.A1Y(r3)
            if (r1 == 0) goto L_0x07e2
            X.C50338FYv.A04(r3, r7)
            java.lang.String r1 = "story_camera_rendered_public_jcs"
            X.DbV.A1M(r3, r1)
            r1 = 3324(0xcfc, float:4.658E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r3.A0p(r1)
            java.lang.String r1 = "share_to_story_bottom_sheet"
            X.Dba.A1E(r3, r1)
            r3.A0s(r6)
            java.lang.Long r1 = X.DbZ.A0d(r5)
            r3.A0i(r1)
            r3.A0w(r2)
            java.lang.String r1 = r7.A00
            r3.A0v(r1)
            r3.Cgf()
        L_0x07e2:
            r1 = 303296266(0x1213ef0a, float:4.667966E-28)
            goto L_0x1083
        L_0x07e7:
            X.2Er r1 = r2.A01
            if (r1 == 0) goto L_0x0814
            java.util.List r1 = r1.BRZ()
            X.34S r1 = X.AnonymousClass3UE.A00(r10, r5, r6, r10, r1)
            java.lang.Object r10 = r1.A00
            com.instagram.common.typedurl.ImageUrl r10 = (com.instagram.common.typedurl.ImageUrl) r10
            goto L_0x0719
        L_0x07f9:
            X.2Er r1 = r2.A01
            if (r1 == 0) goto L_0x0814
            com.instagram.common.typedurl.ImageUrl r10 = r1.Asd()
            goto L_0x0719
        L_0x0803:
            r0 = 539009201(0x2020a0b1, float:1.3605695E-19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.E2N r4 = (X.E2N) r4
            X.OSg r3 = r4.A01
            if (r3 != 0) goto L_0x0819
            java.lang.String r8 = "logger"
        L_0x0814:
            X.0qQ.A0F(r8)
            goto L_0x0f87
        L_0x0819:
            X.6HD r1 = r4.A00
            java.lang.String r9 = "selectedThreads"
            if (r1 == 0) goto L_0x0f84
            int r1 = r1.size()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "count"
            java.util.Map r2 = X.AnonymousClass7TF.A0w(r1, r2)
            java.lang.String r1 = "inbox_folders_add_chats_screen_save_click"
            X.C70933OSg.A00(r3, r1, r2)
            X.0sP r2 = r4.A03
            if (r2 != 0) goto L_0x0839
            java.lang.String r8 = "onThreadsSelected"
            goto L_0x0814
        L_0x0839:
            X.6HD r1 = r4.A00
            if (r1 == 0) goto L_0x0f84
            r2.invoke(r1)
            X.Dbb.A0z(r4)
            r1 = 376659672(0x16735ed8, float:1.9659311E-25)
            goto L_0x1083
        L_0x0848:
            r0 = 79444501(0x4bc3a15, float:4.4251928E-36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.FYD r1 = (X.FYD) r1
            X.0sa r1 = r1.A02
            r1.invoke()
            r1 = 298683327(0x11cd8bbf, float:3.2429422E-28)
            goto L_0x1083
        L_0x085d:
            r0 = -1929656115(0xffffffff8cfbc8cd, float:-3.8793526E-31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.DpV r3 = (X.C47038DpV) r3
            java.util.List r1 = X.C47038DpV.A0A
            android.view.View r4 = r3.A02
            int r2 = r4.getVisibility()
            r1 = 0
            if (r2 != 0) goto L_0x0875
            r1 = 8
        L_0x0875:
            r4.setVisibility(r1)
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r3.A08
            int r2 = r4.getVisibility()
            r1 = 2131238077(0x7f081cbd, float:1.8092423E38)
            if (r2 != 0) goto L_0x0886
            r1 = 2131238095(0x7f081ccf, float:1.809246E38)
        L_0x0886:
            r3.setImageResource(r1)
            r1 = -502120292(0xffffffffe212409c, float:-6.7447006E20)
            goto L_0x1083
        L_0x088e:
            r0 = -705499695(0xffffffffd5f2edd1, float:-3.33879035E13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.E1E r4 = (X.E1E) r4
            X.0eM r1 = r4.A03
            java.lang.Object r1 = r1.getValue()
            X.Eth r1 = (X.C49326Eth) r1
            X.0wc r2 = r1.A00
            java.lang.String r1 = "social_avatars_bottom_sheet_disclaimer_action"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r3.isSampled()
            if (r1 == 0) goto L_0x08ba
            java.lang.String r2 = "action"
            java.lang.String r1 = "go_to_settings"
            java.util.Map r1 = X.AnonymousClass7TF.A0w(r2, r1)
            X.DbV.A1L(r3, r1)
        L_0x08ba:
            androidx.fragment.app.Fragment r2 = r4.mParentFragment
            boolean r1 = r2 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r1 == 0) goto L_0x08c9
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r2 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r2
            if (r2 == 0) goto L_0x08c9
            X.7Pu r1 = r2.A02
            X.DbW.A1K(r1)
        L_0x08c9:
            android.content.Context r2 = r4.requireContext()
            java.lang.Class<com.instagram.direct.avatar.socialstickers.ui.AvatarOptionsActivity> r1 = com.instagram.direct.avatar.socialstickers.ui.AvatarOptionsActivity.class
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r2, r1)
            X.0eM r1 = r4.A04
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r2 = r1.A05
            java.lang.String r1 = "IgSessionManager.SESSION_TOKEN_KEY"
            r3.putExtra(r1, r2)
            X.0b6 r1 = X.0b6.A00()
            X.0R3 r2 = r1.A07()
            android.content.Context r1 = r4.getContext()
            r2.A0G(r1, r3)
            r1 = 852051208(0x32c94508, float:2.3430871E-8)
            goto L_0x1083
        L_0x08f5:
            r0 = -1046564995(0xffffffffc19eaf7d, float:-19.835688)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.E2X r4 = (X.E2X) r4
            X.0eM r1 = r4.A02
            java.lang.Object r3 = r1.getValue()
            X.7I3 r3 = (X.AnonymousClass7I3) r3
            X.0eM r1 = r4.A03
            java.lang.Object r2 = r1.getValue()
            X.Nml r2 = (X.C69503Nml) r2
            X.0wc r1 = r3.A01
            X.1Ln r3 = X.1Ln.A0J(r1)
            boolean r1 = X.DbT.A1Y(r3)
            if (r1 == 0) goto L_0x0934
            r1 = 11
            r3.A0Z(r1)
            r1 = 0
            r3.A0X(r1)
            java.lang.String r1 = "entry_point"
            r3.A0M(r2, r1)
            java.lang.String r2 = "learn_more"
            java.lang.String r1 = "selected_item"
            r3.A0R(r1, r2)
            r3.Cgf()
        L_0x0934:
            X.0eM r1 = r4.A05
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            android.content.Context r2 = r4.requireContext()
            X.2EG r4 = X.2EG.A46
            r6 = 0
            X.0qQ.A0B(r3, r6)
            r1 = 1419(0x58b, float:1.988E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r1)
            X.SUL r1 = new X.SUL
            r1.<init>(r2, r3, r4, r5, r6)
            r1.A0A()
            r1 = -724414775(0xffffffffd4d24ec9, float:-7.2261194E12)
            goto L_0x1083
        L_0x0957:
            r0 = 168151381(0xa05c955, float:6.4415834E-33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.E2X r4 = (X.E2X) r4
            X.0eM r1 = r4.A05
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            r3 = 1
            X.C331227Qb.A01(r1, r3)
            X.0eM r1 = r4.A02
            java.lang.Object r2 = r1.getValue()
            X.7I3 r2 = (X.AnonymousClass7I3) r2
            X.0eM r1 = r4.A03
            java.lang.Object r1 = r1.getValue()
            X.Nml r1 = (X.C69503Nml) r1
            r2.A08(r1)
            r2 = 24
            X.Pha r1 = new X.Pha
            r1.<init>(r4, r2)
            r1.invoke()
            r4.A00 = r3
            androidx.fragment.app.FragmentActivity r2 = r4.getActivity()
            if (r2 == 0) goto L_0x0995
            r1 = -1
            r2.setResult(r1)
        L_0x0995:
            X.DbX.A1I(r4)
            r1 = -1108010698(0xffffffffbdf51936, float:-0.11967699)
            goto L_0x1083
        L_0x099d:
            r0 = -680897470(0xffffffffd76a5442, float:-2.57647605E14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.DbX.A1I(r1)
            r1 = 1548343783(0x5c49d9e7, float:2.27264226E17)
            goto L_0x1083
        L_0x09b0:
            r0 = 1348351795(0x505e3733, float:1.4912638E10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.E2S r4 = (X.E2S) r4
            X.0eM r1 = r4.A01
            java.lang.Object r3 = r1.getValue()
            X.7I3 r3 = (X.AnonymousClass7I3) r3
            X.0eM r1 = r4.A02
            java.lang.Object r2 = r1.getValue()
            X.Nml r2 = (X.C69503Nml) r2
            X.0wc r1 = r3.A01
            X.1Ln r3 = X.1Ln.A0J(r1)
            boolean r1 = X.DbT.A1Y(r3)
            if (r1 == 0) goto L_0x09ef
            r1 = 10
            r3.A0Z(r1)
            r1 = 0
            r3.A0X(r1)
            java.lang.String r1 = "entry_point"
            r3.A0M(r2, r1)
            java.lang.String r2 = "learn_more"
            java.lang.String r1 = "selected_item"
            r3.A0R(r1, r2)
            r3.Cgf()
        L_0x09ef:
            X.0eM r1 = r4.A03
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            android.content.Context r2 = r4.requireContext()
            X.2EG r4 = X.2EG.A0J
            r6 = 0
            X.0qQ.A0B(r3, r6)
            r1 = 1419(0x58b, float:1.988E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r1)
            X.SUL r1 = new X.SUL
            r1.<init>(r2, r3, r4, r5, r6)
            r1.A0A()
            r1 = -1402042417(0xffffffffac6e87cf, float:-3.3897223E-12)
            goto L_0x1083
        L_0x0a12:
            r0 = 520112968(0x1f004b48, float:2.7167326E-20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.E2S r5 = (X.E2S) r5
            X.0eM r4 = r5.A03
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r4)
            r6 = 1
            X.C331227Qb.A00(r1, r6)
            X.0eM r1 = r5.A01
            java.lang.Object r2 = r1.getValue()
            X.7I3 r2 = (X.AnonymousClass7I3) r2
            X.0eM r1 = r5.A02
            java.lang.Object r1 = r1.getValue()
            X.Nml r1 = (X.C69503Nml) r1
            r2.A05(r1)
            android.os.Bundle r2 = r5.requireArguments()
            java.lang.String r1 = "ai_agent_command_id_to_invoke"
            java.io.Serializable r8 = r2.getSerializable(r1)
            android.os.Bundle r2 = r5.requireArguments()
            java.lang.String r1 = "ai_agent_launch_imagine_create_on_exit"
            boolean r7 = r2.getBoolean(r1)
            android.os.Bundle r2 = r5.requireArguments()
            java.lang.String r1 = "ai_agent_launch_meta_ai_invocation_sheet_on_exit"
            boolean r2 = r2.getBoolean(r1)
            android.content.Intent r3 = X.DbS.A09()
            if (r8 == 0) goto L_0x0a67
            r1 = 2181(0x885, float:3.056E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r3.putExtra(r1, r8)
        L_0x0a67:
            r1 = 2971(0xb9b, float:4.163E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r3.putExtra(r1, r7)
            r1 = 2972(0xb9c, float:4.165E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r3.putExtra(r1, r2)
            android.os.Bundle r2 = r5.requireArguments()
            java.lang.String r1 = "entry_point"
            java.io.Serializable r2 = r2.getSerializable(r1)
            r1 = 2973(0xb9d, float:4.166E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r3.putExtra(r1, r2)
            r5.A00 = r6
            androidx.fragment.app.FragmentActivity r2 = r5.getActivity()
            if (r2 == 0) goto L_0x0a98
            r1 = -1
            r2.setResult(r1, r3)
        L_0x0a98:
            X.0lg r4 = X.DbT.A0X(r4)
            X.0Tu r3 = X.0Tu.A05
            r1 = 36329367420420166(0x81115e00024046, double:3.0381764710699784E-306)
            java.lang.Boolean r1 = X.AnonymousClass7TF.A0R(r3, r4, r1)
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0ab5
            X.DbX.A1I(r5)
        L_0x0ab0:
            r1 = 555820810(0x2121270a, float:5.460059E-19)
            goto L_0x1083
        L_0x0ab5:
            X.37E r2 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            X.DbX.A10(r1, r2)
            goto L_0x0ab0
        L_0x0abf:
            r0 = -1444924482(0xffffffffa9e033be, float:-9.956574E-14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.DbX.A1I(r1)
            r1 = -492136852(0xffffffffe2aa966c, float:-1.5733928E21)
            goto L_0x1083
        L_0x0ad2:
            r0 = 128496381(0x7a8b2fd, float:2.538303E-34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            androidx.fragment.app.FragmentActivity r1 = r2.getActivity()
            if (r1 == 0) goto L_0x0b08
            X.8ab r5 = X.DbS.A0X(r1)
            r1 = 2131952851(0x7f1304d3, float:1.9542156E38)
            r5.A09(r1)
            r4 = 2131957531(0x7f13171b, float:1.9551649E38)
            r3 = 2131952850(0x7f1304d2, float:1.9542154E38)
            r1 = 35
            X.FJi r2 = X.C50023FJi.A00(r2, r1)
            X.8ae r1 = X.C358278ae.RED_BOLD
            r5.A0S(r2, r1, r4, r3)
            r1 = 2131954722(0x7f130c22, float:1.9545951E38)
            r5.A0A(r1, r1)
            r1 = 1
            X.AnonymousClass7TH.A0a(r5, r1)
        L_0x0b08:
            r1 = -213508631(0xfffffffff3461de9, float:-1.5696433E31)
            goto L_0x1083
        L_0x0b0d:
            r0 = 1031015678(0x3d740cfe, float:0.059582703)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.NJe r7 = (X.C68466NJe) r7
            androidx.fragment.app.FragmentActivity r5 = r7.getActivity()
            if (r5 == 0) goto L_0x0b65
            android.content.res.Resources r4 = r5.getResources()
            r3 = 2131820548(0x7f110004, float:1.9273814E38)
            X.Mv1 r1 = r7.A00
            java.lang.String r9 = "itemAdapter"
            if (r1 == 0) goto L_0x0f84
            java.util.TreeSet r1 = r1.A03
            int r2 = r1.size()
            r6 = 1
            X.Mv1 r1 = r7.A00
            if (r1 == 0) goto L_0x0f84
            java.util.TreeSet r1 = r1.A03
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = X.DbY.A0e(r4, r1, r3, r2)
            X.8ab r5 = X.DbS.A0X(r5)
            r5.A05 = r1
            r4 = 2131957531(0x7f13171b, float:1.9551649E38)
            r3 = 2131952850(0x7f1304d2, float:1.9542154E38)
            r1 = 12
            X.OgE r2 = new X.OgE
            r2.<init>(r7, r1)
            X.8ae r1 = X.C358278ae.RED_BOLD
            r5.A0S(r2, r1, r4, r3)
            r1 = 2131954722(0x7f130c22, float:1.9545951E38)
            r5.A0A(r1, r1)
            X.AnonymousClass7TH.A0a(r5, r6)
        L_0x0b65:
            r1 = -358777245(0xffffffffea9d7e63, float:-9.51991E25)
            goto L_0x1083
        L_0x0b6a:
            r0 = 1873133846(0x6fa5c116, float:1.0259691E29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.E2s r4 = (X.C47446E2s) r4
            X.0eM r1 = r4.A01
            java.lang.Object r5 = r1.getValue()
            X.7I3 r5 = (X.AnonymousClass7I3) r5
            X.Nml r3 = X.C47446E2s.A00(r4)
            r2 = 0
            r1 = 5
            X.AnonymousClass7I3.A01(r3, r2, r5, r2, r1)
            X.0eM r1 = r4.A04
            java.lang.Object r1 = r1.getValue()
            X.ODN r1 = (X.ODN) r1
            X.02m r3 = r1.A01
            int r2 = r1.A00
            r1 = 814288692(0x30890f34, float:9.972383E-10)
            r3.markerStart(r1, r2)
            X.0eM r1 = r4.A03
            java.lang.Object r6 = r1.getValue()
            X.DlS r6 = (X.C46793DlS) r6
            androidx.fragment.app.FragmentActivity r8 = r4.requireActivity()
            X.Nml r5 = X.C47446E2s.A00(r4)
            r1 = 1
            X.PqZ r7 = new X.PqZ
            r7.<init>(r4, r1)
            com.instagram.common.session.UserSession r1 = r6.A00
            r4 = 36
            X.IxG r3 = new X.IxG
            r3.<init>(r4, r5, r6, r7, r8)
            X.AnonymousClass9B9.A00()
            X.9BB r2 = X.AnonymousClass9BA.A00(r1)
            X.FaU r1 = new X.FaU
            r1.<init>(r8, r3)
            r2.A01(r8, r1)
            r1 = 84195694(0x504b96e, float:6.240668E-36)
            goto L_0x1083
        L_0x0bcb:
            r0 = -1064915914(0xffffffffc086ac36, float:-4.208522)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.DbS.A1U(r1)
            r1 = 476590432(0x1c683160, float:7.6826177E-22)
            goto L_0x1083
        L_0x0bdc:
            r0 = -36051848(0xfffffffffdd9e478, float:-3.6203594E37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.DbS.A1U(r1)
            r1 = -1584139738(0xffffffffa193f226, float:-1.0025204E-18)
            goto L_0x1083
        L_0x0bed:
            r0 = -1008546886(0xffffffffc3e2cbba, float:-453.5916)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.G9Z r2 = (X.G9Z) r2
            r1 = 1
            r2.Cu5(r1)
            r1 = 557452814(0x213a0e0e, float:6.303785E-19)
            goto L_0x1083
        L_0x0c01:
            r0 = 622049199(0x2513b7af, float:1.2812452E-16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.G9Z r1 = (X.G9Z) r1
            r1.DU3()
            r1 = -1279872755(0xffffffffb3b6b10d, float:-8.507241E-8)
            goto L_0x1083
        L_0x0c14:
            r0 = -2133991075(0xffffffff80cde15d, float:-1.8907122E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.G9Z r2 = (X.G9Z) r2
            r1 = 1
            r2.Cu5(r1)
            r1 = 1224636976(0x48fe7a30, float:521169.5)
            goto L_0x1083
        L_0x0c28:
            r0 = -1256846161(0xffffffffb5160caf, float:-5.589781E-7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.G9Z r2 = (X.G9Z) r2
            r1 = 1
            r2.Cu5(r1)
            r1 = -892514743(0xffffffffcacd4e49, float:-6727460.5)
            goto L_0x1083
        L_0x0c3c:
            r0 = 2129966867(0x7ef4b713, float:1.626411E38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.G9Z r1 = (X.G9Z) r1
            r1.D9B()
            r1 = -1905432285(0xffffffff8e6d6923, float:-2.9263127E-30)
            goto L_0x1083
        L_0x0c4f:
            r0 = 1475632128(0x57f45c00, float:5.37351948E14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.DbS.A1U(r1)
            r1 = 1404502165(0x53b70095, float:1.57197756E12)
            goto L_0x1083
        L_0x0c60:
            r0 = -536500814(0xffffffffe005a5b2, float:-3.8521196E19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.DmJ r5 = (X.C46843DmJ) r5
            java.lang.String r1 = r5.A00
            java.lang.String r2 = "groups"
            boolean r1 = X.0qQ.A0K(r1, r2)
            if (r1 == 0) goto L_0x0c76
            r2 = 0
        L_0x0c76:
            r5.A00 = r2
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r4 = r5.A04
            X.F2X r1 = r4.A0N
            if (r1 == 0) goto L_0x0c85
            java.lang.String r1 = r1.A00
            if (r1 == 0) goto L_0x0c85
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment.A0G(r4)
        L_0x0c85:
            X.F2X r1 = r4.A0N
            if (r1 == 0) goto L_0x0ca1
            X.7eL r2 = r4.A0l
            if (r2 == 0) goto L_0x0ca1
            java.lang.String r1 = r1.A00
            java.lang.String r3 = "GROUP"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0ca9
            java.lang.String r1 = ""
            r2.EhX(r1)
            X.F2X r1 = r4.A0N
            r3 = 0
        L_0x0c9f:
            r1.A00 = r3
        L_0x0ca1:
            r5.notifyDataSetChanged()
            r1 = -1954586078(0xffffffff8b7f6222, float:-4.918504E-32)
            goto L_0x1083
        L_0x0ca9:
            java.lang.Object r1 = r2.Bo1()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.stream.Stream r6 = r1.stream()
            r2 = 1
            X.MBB r1 = new X.MBB
            r1.<init>(r2)
            java.util.stream.Stream r2 = r6.filter(r1)
            java.util.stream.Collector r1 = java.util.stream.Collectors.toList()
            java.lang.Object r13 = r2.collect(r1)
            java.util.List r13 = (java.util.List) r13
            X.EIn r6 = r4.A0J
            r7 = 0
            r14 = 0
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            r6.A0I(r7, r8, r9, r10, r11, r12, r13, r14)
            X.F2X r1 = r4.A0N
            goto L_0x0c9f
        L_0x0ce5:
            r0 = -1851057695(0xffffffff91ab19e1, float:-2.6994992E-28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.DmJ r1 = (X.C46843DmJ) r1
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r6 = r1.A04
            com.instagram.common.session.UserSession r5 = r6.A0G
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            androidx.fragment.app.FragmentActivity r2 = r6.requireActivity()
            java.lang.String r1 = "shortcuts_audience_picker"
            X.6W8 r1 = X.Dba.A0K(r2, r3, r5, r4, r1)
            X.DbU.A1K(r6, r1)
            com.instagram.common.session.UserSession r1 = r6.A0G
            X.1Av r1 = X.1Au.A00(r1)
            r3 = 1
            X.0xY r2 = X.AnonymousClass7TE.A0p(r1)
            java.lang.String r1 = "has_clicked_create_shortcut_nux"
            r2.E5T(r1, r3)
            r2.apply()
            r1 = -37133801(0xfffffffffdc96217, float:-3.3460517E37)
            goto L_0x1083
        L_0x0d1f:
            r0 = -1785215547(0xffffffff9597c5c5, float:-6.130044E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.EIn r1 = (X.C47816EIn) r1
            X.G9Z r1 = r1.A0B
            r1.DU3()
            r1 = 297405958(0x11ba0e06, float:2.9354268E-28)
            goto L_0x1083
        L_0x0d34:
            r0 = 1081726679(0x4079d6d7, float:3.9037378)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.EIn r1 = (X.C47816EIn) r1
            X.G9Z r1 = r1.A0B
            r1.DWv()
            r1 = 148907976(0x8e027c8, float:1.3490862E-33)
            goto L_0x1083
        L_0x0d49:
            r0 = -157256126(0xfffffffff6a07642, float:-1.6272774E33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.E2L r6 = (X.E2L) r6
            X.0eM r1 = r6.A03
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            X.0eM r3 = r6.A02
            java.lang.Object r2 = r3.getValue()
            java.util.Map r1 = com.instagram.creatortools.api.schemas.ValuePropsFlow.A01
            java.lang.Object r1 = r1.get(r2)
            com.instagram.creatortools.api.schemas.ValuePropsFlow r1 = (com.instagram.creatortools.api.schemas.ValuePropsFlow) r1
            if (r1 != 0) goto L_0x0d6c
            com.instagram.creatortools.api.schemas.ValuePropsFlow r1 = com.instagram.creatortools.api.schemas.ValuePropsFlow.UNRECOGNIZED
        L_0x0d6c:
            java.lang.String r2 = X.FFF.A00(r1)
            java.lang.String r1 = "conversion_cta"
            X.FFF.A03(r4, r2, r1)
            X.0eM r1 = r6.A04
            java.lang.Object r5 = r1.getValue()
            X.DlQ r5 = (X.C46791DlQ) r5
            androidx.fragment.app.FragmentActivity r4 = r6.getActivity()
            java.lang.String r3 = X.DbS.A0t(r3)
            r1 = 1
            X.0qQ.A0B(r3, r1)
            if (r4 == 0) goto L_0x0da4
            X.DbU.A0v()
            java.lang.String r2 = "creator_tools"
            android.os.Bundle r1 = X.DbX.A0B(r2)
            r1.putString(r2, r3)
            com.instagram.business.fragment.CategorySearchFragment r2 = new com.instagram.business.fragment.CategorySearchFragment
            r2.<init>()
            r2.setArguments(r1)
            com.instagram.common.session.UserSession r1 = r5.A07
            X.DbY.A14(r2, r4, r1)
        L_0x0da4:
            r1 = 1494383072(0x591279e0, float:2.57683435E15)
            goto L_0x1083
        L_0x0da9:
            r0 = -1704231036(0xffffffff9a6b7f84, float:-4.8699867E-23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.E2L r2 = (X.E2L) r2
            X.0eM r3 = r2.A02
            java.lang.String r5 = X.DbS.A0t(r3)
            r7 = 0
            X.0qQ.A0B(r5, r7)
            com.instagram.creatortools.api.schemas.ValuePropsFlow r1 = com.instagram.creatortools.api.schemas.ValuePropsFlow.BONUSES
            java.lang.String r4 = r1.A00
            boolean r1 = r5.equals(r4)
            if (r1 == 0) goto L_0x0e2b
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x0dca:
            int r1 = r1.intValue()
            switch(r1) {
                case 0: goto L_0x0e22;
                case 1: goto L_0x0e28;
                case 2: goto L_0x0e25;
                default: goto L_0x0dd1;
            }
        L_0x0dd1:
            java.lang.String r6 = "https://creators.instagram.com/earn-money/branded-content"
        L_0x0dd3:
            java.lang.String r3 = X.DbS.A0t(r3)
            X.0qQ.A0B(r3, r7)
            boolean r1 = r3.equals(r4)
            if (r1 == 0) goto L_0x0dfb
            X.2EG r5 = X.2EG.A0W
        L_0x0de2:
            android.content.Context r3 = r2.getContext()
            if (r3 == 0) goto L_0x0e53
            X.0eM r1 = r2.A03
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            X.SUL r2 = new X.SUL
            r2.<init>(r3, r4, r5, r6, r7)
            r2.A0A()
            r1 = -1666932255(0xffffffff9ca4a1e1, float:-1.0894454E-21)
            goto L_0x1083
        L_0x0dfb:
            com.instagram.creatortools.api.schemas.ValuePropsFlow r1 = com.instagram.creatortools.api.schemas.ValuePropsFlow.SUBSCRIPTION
            java.lang.String r1 = r1.A00
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0e08
            X.2EG r5 = X.2EG.A1m
            goto L_0x0de2
        L_0x0e08:
            com.instagram.creatortools.api.schemas.ValuePropsFlow r1 = com.instagram.creatortools.api.schemas.ValuePropsFlow.BADGES
            java.lang.String r1 = r1.A00
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0e15
            X.2EG r5 = X.2EG.A0P
            goto L_0x0de2
        L_0x0e15:
            com.instagram.creatortools.api.schemas.ValuePropsFlow r1 = com.instagram.creatortools.api.schemas.ValuePropsFlow.CREATOR_MARKETPLACE
            java.lang.String r1 = r1.A00
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0e5e
            X.2EG r5 = X.2EG.A1R
            goto L_0x0de2
        L_0x0e22:
            java.lang.String r6 = "https://creators.instagram.com/earn-money/instagram-bonuses"
            goto L_0x0dd3
        L_0x0e25:
            java.lang.String r6 = "https://creators.instagram.com/earn-money/badges"
            goto L_0x0dd3
        L_0x0e28:
            java.lang.String r6 = "https://help.instagram.com/478012211024479"
            goto L_0x0dd3
        L_0x0e2b:
            com.instagram.creatortools.api.schemas.ValuePropsFlow r1 = com.instagram.creatortools.api.schemas.ValuePropsFlow.SUBSCRIPTION
            java.lang.String r1 = r1.A00
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0e38
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x0dca
        L_0x0e38:
            com.instagram.creatortools.api.schemas.ValuePropsFlow r1 = com.instagram.creatortools.api.schemas.ValuePropsFlow.BADGES
            java.lang.String r1 = r1.A00
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0e45
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x0dca
        L_0x0e45:
            com.instagram.creatortools.api.schemas.ValuePropsFlow r1 = com.instagram.creatortools.api.schemas.ValuePropsFlow.CREATOR_MARKETPLACE
            java.lang.String r1 = r1.A00
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0e65
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            goto L_0x0dca
        L_0x0e53:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r1 = 2119866891(0x7e5a9a0b, float:7.2642885E37)
            X.AnonymousClass0fD.A0C(r1, r0)
            throw r2
        L_0x0e5e:
            java.lang.String r0 = "Unsupported flow type for learn more link"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0e65:
            java.lang.String r0 = "Unsupported flow type for learn more link"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0e6c:
            r0 = -1240420819(0xffffffffb610ae2d, float:-2.1559056E-6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.E2F r6 = (X.E2F) r6
            X.0eM r1 = r6.A02
            X.0lg r5 = X.DbT.A0X(r1)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r4 = com.instagram.modal.TransparentModalActivity.class
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            androidx.fragment.app.FragmentActivity r2 = r6.getActivity()
            r1 = 27
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.6W8 r2 = X.AnonymousClass6W8.A02(r2, r3, r5, r4, r1)
            r2.A07()
            android.content.Context r1 = r6.getContext()
            r2.A0C(r1)
            r1 = 1891063927(0x70b75877, float:4.5394163E29)
            goto L_0x1083
        L_0x0ea0:
            r0 = -2099630733(0xffffffff82da2d73, float:-3.2058308E-37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r9 = r1.A01
            X.E7X r9 = (X.E7X) r9
            android.os.Bundle r1 = r9.requireArguments()
            java.lang.String r2 = "entrypoint"
            java.lang.String r12 = r1.getString(r2)
            if (r12 != 0) goto L_0x0eb9
            java.lang.String r12 = "unknown"
        L_0x0eb9:
            X.0eM r1 = r9.A0J
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.FYu r5 = X.C48796EkJ.A00(r1)
            java.util.Map r1 = r9.A08
            int r1 = r1.size()
            X.0eP r3 = X.AnonymousClass7TE.A1L(r2, r12)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "chat_creation_size"
            X.0eP r1 = X.AnonymousClass7TE.A1L(r1, r2)
            r2 = 1
            X.0eP[] r1 = new X.0eP[]{r3, r1}
            java.util.LinkedHashMap r8 = X.0Yt.A06(r1)
            X.EZo r4 = X.C48146EZo.NEW_SUBSCRIBER_CHAT
            X.EZp r3 = X.C48147EZp.CHAT_BUTTON
            java.lang.String r6 = "thread_create"
            java.lang.String r7 = "tap"
            X.C50337FYu.A01(r3, r4, r5, r6, r7, r8)
            r9.A09 = r2
            X.E7X.A01(r9)
            X.F3u r8 = r9.A0F
            X.0eM r1 = r9.A0H
            java.lang.String r13 = X.DbS.A0t(r1)
            X.0eM r1 = r9.A0G
            java.lang.Object r11 = r1.getValue()
            java.lang.Integer r11 = (java.lang.Integer) r11
            X.0eM r1 = r9.A0K
            java.lang.Object r10 = r1.getValue()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            r8.A04(r9, r10, r11, r12, r13)
            r1 = -1728347239(0xffffffff98fb8399, float:-6.501486E-24)
            goto L_0x1083
        L_0x0f10:
            r0 = -902096963(0xffffffffca3b17bd, float:-3065327.2)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.E7X r1 = (X.E7X) r1
            X.F3u r1 = r1.A0F
            X.FBR r5 = r1.A03
            if (r5 == 0) goto L_0x0f4c
            java.util.Map r1 = r1.A06
            java.util.Collection r1 = r1.values()
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r3 = r1.iterator()
        L_0x0f2f:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0f42
            com.instagram.user.model.User r2 = X.DbT.A0k(r3)
            com.instagram.model.direct.DirectShareTarget r1 = new com.instagram.model.direct.DirectShareTarget
            r1.<init>((com.instagram.user.model.User) r2)
            r4.add(r1)
            goto L_0x0f2f
        L_0x0f42:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            X.00k.A0r(r4, r1)
            r5.A01(r1)
        L_0x0f4c:
            r1 = 1539999350(0x5bca8676, float:1.14011573E17)
            goto L_0x1083
        L_0x0f51:
            r0 = 1222206352(0x48d96390, float:445212.5)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.F3u r1 = (X.C49729F3u) r1
            X.G84 r1 = r1.A02
            if (r1 != 0) goto L_0x0f63
            java.lang.String r9 = "delegate"
            goto L_0x0f84
        L_0x0f63:
            r1.FJC()
            r1 = -1211492172(0xffffffffb7ca18b4, float:-2.409178E-5)
            goto L_0x1083
        L_0x0f6b:
            r0 = 1994154879(0x76dc637f, float:2.2350065E33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r15 = r1.A01
            X.E7W r15 = (X.E7W) r15
            X.0eM r1 = r15.A0F
            java.lang.Object r11 = r1.getValue()
            X.FYu r11 = (X.C50337FYu) r11
            com.instagram.api.schemas.FanClubCategoryType r2 = r15.A01
            if (r2 != 0) goto L_0x0f8c
            java.lang.String r9 = "categoryType"
        L_0x0f84:
            X.0qQ.A0F(r9)
        L_0x0f87:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0f8c:
            X.0eM r4 = r15.A0E
            java.lang.Object r6 = r4.getValue()
            java.util.Map r1 = r15.A08
            int r9 = r1.size()
            java.util.Map r1 = r15.A08
            int r1 = r1.size()
            int r7 = r15.A00
            r8 = 0
            if (r1 == r7) goto L_0x0fa4
            r8 = 1
        L_0x0fa4:
            r5 = 1
            r3 = 3
            X.0qQ.A0B(r6, r5)
            int r2 = r2.ordinal()
            r10 = 0
            r1 = 2
            if (r2 == r3) goto L_0x1025
            if (r2 == r1) goto L_0x1022
            if (r2 != r5) goto L_0x0fb7
            X.EZo r10 = X.C48146EZo.NEW_LEAST_INTERACTED_SUBSCRIBERS_CHAT
        L_0x0fb7:
            java.lang.String r1 = "entrypoint"
            X.0eP r6 = X.AnonymousClass7TE.A1L(r1, r6)
            java.lang.String r2 = java.lang.String.valueOf(r9)
            java.lang.String r1 = "chat_creation_size"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r1, r2)
            if (r8 == 0) goto L_0x101f
            java.lang.String r2 = "True"
        L_0x0fcb:
            java.lang.String r1 = "modified_category"
            X.0eP r1 = X.AnonymousClass7TE.A1L(r1, r2)
            X.0eP[] r1 = new X.0eP[]{r6, r3, r1}
            java.util.LinkedHashMap r3 = X.0Yt.A07(r1)
            if (r8 == 0) goto L_0x0fe4
            java.lang.String r2 = java.lang.String.valueOf(r7)
            java.lang.String r1 = "category_size"
            r3.put(r1, r2)
        L_0x0fe4:
            if (r10 == 0) goto L_0x0ff3
            X.EZp r9 = X.C48147EZp.CHAT_BUTTON
            java.util.Map r14 = X.0Yt.A0B(r3)
            java.lang.String r12 = "thread_create"
            java.lang.String r13 = "tap"
            X.C50337FYu.A01(r9, r10, r11, r12, r13, r14)
        L_0x0ff3:
            r15.A09 = r5
            X.E7W.A00(r15)
            X.F3u r14 = r15.A0B
            java.lang.String r18 = X.DbS.A0t(r4)
            X.0eM r1 = r15.A0D
            java.lang.String r19 = X.DbS.A0t(r1)
            X.0eM r1 = r15.A0C
            java.lang.Object r2 = r1.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            X.0eM r1 = r15.A0H
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r16 = r1
            r17 = r2
            r14.A04(r15, r16, r17, r18, r19)
            r1 = -440881140(0xffffffffe5b8b00c, float:-1.0902037E23)
            goto L_0x1083
        L_0x101f:
            java.lang.String r2 = "False"
            goto L_0x0fcb
        L_0x1022:
            X.EZo r10 = X.C48146EZo.NEW_MOST_INTERACTED_SUBSCRIBERS_CHAT
            goto L_0x0fb7
        L_0x1025:
            X.EZo r10 = X.C48146EZo.NEW_MOST_RECENT_SUBSCRIBERS_CHAT
            goto L_0x0fb7
        L_0x1028:
            r0 = 688601261(0x290b38ad, float:3.091336E-14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.E32 r6 = (X.E32) r6
            java.util.ArrayList r5 = r6.A04
            X.0eM r1 = r6.A06
            X.7Pr r3 = X.DbX.A0f(r1)
            android.content.res.Resources r2 = X.DbV.A05(r6)
            r1 = 2131957075(0x7f131553, float:1.9550724E38)
            X.DbT.A1C(r2, r3, r1)
            X.7Pu r4 = r3.A00()
            androidx.fragment.app.FragmentActivity r3 = r6.requireActivity()
            X.E5o r2 = new X.E5o
            r2.<init>()
            r1 = 519(0x207, float:7.27E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.DbZ.A1B(r2, r1, r5)
            r4.A02(r3, r2)
            r1 = 181750891(0xad54c6b, float:2.0539899E-32)
            goto L_0x1083
        L_0x1062:
            r0 = -1928134790(0xffffffff8d12ff7a, float:-4.529724E-31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.E3z r2 = (X.C47475E3z) r2
            X.0eM r1 = r2.A02
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r2 = r2.requireActivity()
            r1 = 3258(0xcba, float:4.565E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.C49845F9k.A00(r2, r3, r1)
            r1 = -1235232887(0xffffffffb65fd789, float:-3.3355047E-6)
        L_0x1083:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FPI.onClick(android.view.View):void");
    }

    public FPI(FTS fts, int i) {
        this.A00 = i;
        switch (i) {
            case 58:
            case 59:
                this.A01 = fts;
                return;
            default:
                this.A01 = fts;
                return;
        }
    }

    public FPI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public FPI(EEP eep, int i) {
        this.A00 = i;
        switch (i) {
            case 62:
            case 63:
            case 64:
            case 65:
                this.A01 = eep;
                return;
            default:
                this.A01 = eep;
                return;
        }
    }
}

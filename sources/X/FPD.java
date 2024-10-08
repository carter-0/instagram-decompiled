package X;

import android.view.View;

public final class FPD implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public FPD(E76 e76, int i) {
        this.A00 = i;
        if (2 - i != 0) {
            this.A01 = e76;
        } else {
            this.A01 = e76;
        }
    }

    public static void A00(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new FPD(obj, i), view);
    }

    /* JADX WARNING: type inference failed for: r1v160, types: [X.E0N, X.3Kr] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0c0e: MOVE  (r2v16 X.G8t) = (r2v15 X.G8t)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onClick(android.view.View r16) {
        /*
            r15 = this;
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x0ce7;
                case 1: goto L_0x0c5b;
                case 2: goto L_0x0c28;
                case 3: goto L_0x0bd4;
                case 4: goto L_0x0b9f;
                case 5: goto L_0x0b67;
                case 6: goto L_0x0ae8;
                case 7: goto L_0x0ad3;
                case 8: goto L_0x0aa3;
                case 9: goto L_0x0a50;
                case 10: goto L_0x0a25;
                case 11: goto L_0x09f1;
                case 12: goto L_0x09aa;
                case 13: goto L_0x0902;
                case 14: goto L_0x08ef;
                case 15: goto L_0x08dc;
                case 16: goto L_0x08c9;
                case 17: goto L_0x08b6;
                case 18: goto L_0x08a3;
                case 19: goto L_0x0890;
                case 20: goto L_0x087d;
                case 21: goto L_0x086a;
                case 22: goto L_0x0841;
                case 23: goto L_0x0811;
                case 24: goto L_0x07f6;
                case 25: goto L_0x079a;
                case 26: goto L_0x077f;
                case 27: goto L_0x070f;
                case 28: goto L_0x06f6;
                case 29: goto L_0x06dd;
                case 30: goto L_0x06b6;
                case 31: goto L_0x0691;
                case 32: goto L_0x0654;
                case 33: goto L_0x062b;
                case 34: goto L_0x0613;
                case 35: goto L_0x05e4;
                case 36: goto L_0x05bf;
                case 37: goto L_0x0580;
                case 38: goto L_0x0559;
                case 39: goto L_0x0531;
                case 40: goto L_0x051e;
                case 41: goto L_0x04df;
                case 42: goto L_0x04b5;
                case 43: goto L_0x048b;
                case 44: goto L_0x0442;
                case 45: goto L_0x0425;
                case 46: goto L_0x0408;
                case 47: goto L_0x03cd;
                case 48: goto L_0x0370;
                case 49: goto L_0x035b;
                case 50: goto L_0x0346;
                case 51: goto L_0x0331;
                case 52: goto L_0x031c;
                case 53: goto L_0x0307;
                case 54: goto L_0x02f2;
                case 55: goto L_0x02cb;
                case 56: goto L_0x02b7;
                case 57: goto L_0x02a4;
                case 58: goto L_0x022d;
                case 59: goto L_0x0208;
                case 60: goto L_0x01e2;
                case 61: goto L_0x01a7;
                case 62: goto L_0x0162;
                case 63: goto L_0x0149;
                case 64: goto L_0x0130;
                case 65: goto L_0x00d2;
                case 66: goto L_0x00ab;
                case 67: goto L_0x005e;
                case 68: goto L_0x001a;
                case 69: goto L_0x0011;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r15.A01
            X.Dib r0 = (X.C46656Dib) r0
            X.36O r1 = r0.A0O
            com.instagram.creation.base.ui.mediatabbar.Tab r0 = X.JXL.A00
        L_0x000d:
            r1.A09(r0)
            return
        L_0x0011:
            java.lang.Object r0 = r15.A01
            X.Dib r0 = (X.C46656Dib) r0
            X.36O r1 = r0.A0O
            com.instagram.creation.base.ui.mediatabbar.Tab r0 = X.JXL.A01
            goto L_0x000d
        L_0x001a:
            java.lang.Object r3 = r15.A01
            X.Dib r3 = (X.C46656Dib) r3
            com.instagram.common.session.UserSession r0 = r3.A0V
            X.0wc r1 = X.AnonymousClass0kN.A01(r3, r0)
            java.lang.String r0 = "ig_creator_connections_events"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "click"
            X.DbS.A1I(r2, r0)
            java.lang.String r1 = "edit_settings"
            java.lang.String r0 = "target"
            r2.AAJ(r0, r1)
            X.EZb r1 = X.EZb.SELF_PROFILE
            java.lang.String r0 = "screen"
            r2.A8M(r1, r0)
            com.instagram.common.session.UserSession r0 = r3.A0V
            X.HOa r1 = X.C271174i4.A00(r0)
            java.lang.String r0 = "project"
            r2.A8M(r1, r0)
            r2.Cgf()
            X.DbU.A0v()
            X.E45 r2 = new X.E45
            r2.<init>()
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            com.instagram.common.session.UserSession r0 = r3.A0V
            X.6Yo r5 = X.DbS.A0M(r1, r0)
            goto L_0x00a3
        L_0x005e:
            java.lang.Object r2 = r15.A01
            X.Dib r2 = (X.C46656Dib) r2
            boolean r0 = r2.A0y
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = "edit_gender"
            X.C46656Dib.A0K(r2, r0)
            return
        L_0x006c:
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            com.instagram.common.session.UserSession r0 = r2.A0V
            X.6Yo r5 = X.DbU.A0Q(r1, r0)
            X.C46447Df9.A03()
            X.F1D r0 = r2.A0e
            r0.getClass()
            int r4 = r0.A00
            X.F1D r0 = r2.A0e
            java.lang.String r3 = r0.A0C
            boolean r2 = r2.A17
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "gender"
            r1.putInt(r0, r4)
            if (r3 == 0) goto L_0x0096
            java.lang.String r0 = "custom_gender"
            r1.putString(r0, r3)
        L_0x0096:
            java.lang.String r0 = "should_show_custom_gender"
            r1.putBoolean(r0, r2)
            X.E70 r2 = new X.E70
            r2.<init>()
            r2.setArguments(r1)
        L_0x00a3:
            r0 = 0
            r5.A0B(r0, r2)
            r5.A04()
            return
        L_0x00ab:
            r0 = -883273654(0xffffffffcb5a504a, float:-1.4307402E7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment r2 = (com.instagram.profile.edit.fragment.CompleteYourProfileFragment) r2
            boolean r1 = r2.A07
            if (r1 == 0) goto L_0x00cb
            android.content.Context r2 = r2.requireContext()
            r1 = 2
            X.FJg r1 = X.C50021FJg.A00(r15, r1)
            X.FCN.A00(r2, r1)
        L_0x00c6:
            r1 = -431395074(0xffffffffe6496efe, float:-2.3781078E23)
            goto L_0x0d14
        L_0x00cb:
            r1 = 1
            r2.A09 = r1
            X.DbT.A1J(r2)
            goto L_0x00c6
        L_0x00d2:
            r0 = -273348276(0xffffffffefb5094c, float:-1.1205605E29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r15.A01
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment r5 = (com.instagram.profile.edit.fragment.CompleteYourProfileFragment) r5
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r5.A01
            if (r1 == 0) goto L_0x00f4
            java.lang.String r7 = "profile_completion"
            r10 = 0
            java.lang.String r8 = r5.A06
            java.lang.String r9 = "continue"
            X.Xtl r6 = new X.Xtl
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r1.Ckp(r6)
        L_0x00f4:
            com.instagram.user.model.User r1 = r5.A05
            boolean r1 = r1.A1n()
            if (r1 == 0) goto L_0x0115
            r1 = 2131952259(0x7f130283, float:1.9540956E38)
            java.lang.String r4 = r5.getString(r1)
            android.content.Context r3 = r5.getContext()
            java.lang.String r2 = "add_profile_photo_error"
            r1 = 0
            X.C59689JTv.A03(r3, r4, r2, r1)
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment.A03(r5, r4)
        L_0x0110:
            r1 = -1329787321(0xffffffffb0bd0e47, float:-1.3755618E-9)
            goto L_0x0d14
        L_0x0115:
            com.instagram.profile.edit.controller.EditProfileFieldsController r1 = r5.A04
            r1.A0A()
            com.instagram.common.session.UserSession r4 = r5.A02
            X.F1D r3 = r5.A03
            r3.getClass()
            java.lang.String r2 = X.DbZ.A0i(r5)
            r1 = 0
            X.1OC r2 = X.C318486p2.A07(r4, r3, r2, r1)
            r1 = 20
            X.C47691EDa.A00(r5, r2, r1)
            goto L_0x0110
        L_0x0130:
            r0 = 586124179(0x22ef8b93, float:6.492886E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment r1 = (com.instagram.profile.edit.fragment.CompleteYourProfileFragment) r1
            X.36O r2 = r1.A00
            android.content.Context r1 = r1.requireContext()
            r2.A05(r1)
            r1 = -1856673321(0xffffffff915569d7, float:-1.6835352E-28)
            goto L_0x0d14
        L_0x0149:
            r0 = 1417374518(0x547b6b36, float:4.31934197E12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment r1 = (com.instagram.profile.edit.fragment.CompleteYourProfileFragment) r1
            X.36O r2 = r1.A00
            android.content.Context r1 = r1.requireContext()
            r2.A05(r1)
            r1 = -1308388320(0xffffffffb2039420, float:-7.658883E-9)
            goto L_0x0d14
        L_0x0162:
            r0 = 2106278202(0x7d8b413a, float:2.313767E37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r15.A01
            com.instagram.profile.edit.controller.EditProfileFieldsController r6 = (com.instagram.profile.edit.controller.EditProfileFieldsController) r6
            com.instagram.common.session.UserSession r3 = r6.A0A
            boolean r1 = X.C324536zU.A00(r3)
            if (r1 == 0) goto L_0x0183
            androidx.fragment.app.FragmentActivity r2 = r6.A06()
            java.lang.String r1 = "edit_pronouns"
            X.FFO.A02(r2, r3, r1)
            r1 = 977287067(0x3a40379b, float:7.3325046E-4)
            goto L_0x0d14
        L_0x0183:
            java.lang.String r2 = "com.instagram.equity.pronouns.edit_pronouns.screen"
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            X.DiU r5 = X.C46649DiU.A04(r2, r1)
            androidx.fragment.app.FragmentActivity r4 = r6.A06()
            com.instagram.bloks.hosting.IgBloksScreenConfig r3 = X.DbS.A0N(r3)
            androidx.fragment.app.FragmentActivity r2 = r6.A06()
            r1 = 2131970922(0x7f134b6a, float:1.9578809E38)
            X.DbS.A18(r2, r3, r1)
            r5.A0D(r4, r3)
            r1 = 1794623907(0x6af7c9a3, float:1.4977844E26)
            goto L_0x0d14
        L_0x01a7:
            r0 = -409041070(0xffffffffe79e8752, float:-1.4972602E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            com.instagram.profile.edit.controller.EditProfileFieldsController r2 = (com.instagram.profile.edit.controller.EditProfileFieldsController) r2
            com.instagram.common.session.UserSession r4 = r2.A0A
            X.0xG r3 = r2.A09
            X.6rY r5 = X.C319986rY.SELF
            com.instagram.user.model.User r1 = r2.A04
            r8 = 0
            if (r1 == 0) goto L_0x01e0
            java.lang.String r7 = X.AnonymousClass3ZA.A00(r1)
        L_0x01c1:
            java.lang.String r6 = "tap_edit_profile_links"
            r9 = r8
            X.C319976rX.A07(r3, r4, r5, r6, r7, r8, r9)
            androidx.fragment.app.FragmentActivity r1 = r2.A06()
            X.6Yo r3 = X.C46447Df9.A01(r1, r4)
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            X.E3F r1 = new X.E3F
            r1.<init>()
            X.DbW.A0y(r2, r1, r3)
            r1 = -682544093(0xffffffffd7513423, float:-2.30021856E14)
            goto L_0x0d14
        L_0x01e0:
            r7 = r8
            goto L_0x01c1
        L_0x01e2:
            r0 = -164250596(0xfffffffff635bc1c, float:-9.215049E32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            com.instagram.profile.edit.controller.EditProfileFieldsController r1 = (com.instagram.profile.edit.controller.EditProfileFieldsController) r1
            androidx.fragment.app.FragmentActivity r2 = r1.A06()
            com.instagram.common.session.UserSession r1 = r1.A0A
            X.6Yo r3 = X.C46447Df9.A01(r2, r1)
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            com.instagram.profile.edithighlightsmigration.HighlightsMigrationFragment r1 = new com.instagram.profile.edithighlightsmigration.HighlightsMigrationFragment
            r1.<init>()
            X.DbW.A0x(r2, r1, r3)
            r1 = 566802495(0x21c8b83f, float:1.3601297E-18)
            goto L_0x0d14
        L_0x0208:
            r0 = 539248566(0x202447b6, float:1.3915067E-19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            com.instagram.profile.edit.controller.EditProfileFieldsController r1 = (com.instagram.profile.edit.controller.EditProfileFieldsController) r1
            androidx.fragment.app.FragmentActivity r2 = r1.A06()
            com.instagram.common.session.UserSession r1 = r1.A0A
            X.6Yo r2 = X.C46447Df9.A01(r2, r1)
            X.E71 r1 = new X.E71
            r1.<init>()
            r2.A0D(r1)
            r2.A04()
            r1 = 1507920691(0x59e10b33, float:7.9180229E15)
            goto L_0x0d14
        L_0x022d:
            r0 = -1838984859(0xffffffff92635165, float:-7.1728897E-28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r15.A01
            X.E3J r3 = (X.E3J) r3
            android.widget.EditText r1 = r3.A00
            r1.getClass()
            android.text.Editable r1 = r1.getText()
            int r1 = r1.length()
            if (r1 == 0) goto L_0x0266
            android.widget.EditText r1 = r3.A00
            r1.getClass()
            java.lang.String r1 = X.AnonymousClass7TF.A0f(r1)
            boolean r1 = X.0mp.A0C(r1)
            if (r1 != 0) goto L_0x0266
            android.widget.EditText r1 = r3.A00
            r1.requestFocus()
            r1 = 2131969518(0x7f1345ee, float:1.9575961E38)
            X.DbZ.A0s(r1)
        L_0x0261:
            r1 = -28447992(0xfffffffffe4deb08, float:-6.8428023E37)
            goto L_0x0d14
        L_0x0266:
            X.FBX r4 = r3.A02
            java.lang.String r2 = "contact_point"
            java.lang.String r1 = "add_contact_point"
            r4.A02(r2, r1)
            com.instagram.common.session.UserSession r5 = r3.A01
            java.lang.String r1 = r3.A03
            java.lang.Integer r6 = X.C49178Eqj.A00(r1)
            r6.getClass()
            android.widget.EditText r1 = r3.A00
            r1.getClass()
            java.lang.String r7 = X.AnonymousClass7TF.A0f(r1)
            android.content.Context r4 = r3.requireContext()
            com.instagram.common.session.UserSession r1 = r3.A01
            X.0jh r2 = X.DbT.A0P(r1)
            X.19f r1 = X.19f.A1S
            java.lang.String r8 = r2.A02(r1)
            java.util.List r9 = r3.A04
            X.1OC r2 = X.C318486p2.A03(r4, r5, r6, r7, r8, r9)
            X.ECn r1 = new X.ECn
            r1.<init>(r3)
            r2.A00 = r1
            r3.schedule(r2)
            goto L_0x0261
        L_0x02a4:
            r0 = 525657405(0x1f54e53d, float:4.5082368E-20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.73N r1 = (X.AnonymousClass73N) r1
            r1.DdK()
            r1 = -308111440(0xffffffffeda297b0, float:-6.289994E27)
            goto L_0x0d14
        L_0x02b7:
            r0 = -1359993435(0xffffffffaef025a5, float:-1.09206234E-10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.73N r2 = (X.AnonymousClass73N) r2
            r1 = 1
            r2.D25(r1)
            r1 = -1773171989(0xffffffff964f8aeb, float:-1.6765162E-25)
            goto L_0x0d14
        L_0x02cb:
            r0 = 969694029(0x39cc5b4d, float:3.8977936E-4)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            X.8ab r4 = X.DbW.A0U(r2)
            r1 = 2131972204(0x7f13506c, float:1.9581409E38)
            java.lang.String r3 = X.DbU.A0m(r2, r1)
            r1 = 0
            X.FJg r2 = X.C50021FJg.A00(r2, r1)
            r1 = 1
            r4.A0d(r2, r3)
            X.AnonymousClass7TH.A0a(r4, r1)
            r1 = 198562718(0xbd5d39e, float:8.236302E-32)
            goto L_0x0d14
        L_0x02f2:
            r0 = -1728749562(0xffffffff98f56006, float:-6.3427975E-24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.0sP r2 = (X.0sP) r2
            X.EOZ r1 = X.EOZ.A00
            r2.invoke(r1)
            r1 = 699784478(0x29b5dd1e, float:8.0763724E-14)
            goto L_0x0d14
        L_0x0307:
            r0 = 1041012080(0x3e0c9570, float:0.13728881)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.0sP r2 = (X.0sP) r2
            X.EOX r1 = X.EOX.A00
            r2.invoke(r1)
            r1 = -308789868(0xffffffffed983d94, float:-5.8895206E27)
            goto L_0x0d14
        L_0x031c:
            r0 = -1889582925(0xffffffff8f5f40b3, float:-1.10072095E-29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.0sP r2 = (X.0sP) r2
            X.EOW r1 = X.EOW.A00
            r2.invoke(r1)
            r1 = 1456048214(0x56c98856, float:1.10793698E14)
            goto L_0x0d14
        L_0x0331:
            r0 = 1434192899(0x557c0c03, float:1.73205325E13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.0sP r2 = (X.0sP) r2
            X.EOX r1 = X.EOX.A00
            r2.invoke(r1)
            r1 = 257951644(0xf60079c, float:1.1045518E-29)
            goto L_0x0d14
        L_0x0346:
            r0 = 315167934(0x12c914be, float:1.2689997E-27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.0sP r2 = (X.0sP) r2
            X.EOW r1 = X.EOW.A00
            r2.invoke(r1)
            r1 = 1103097045(0x41bfecd5, float:23.99064)
            goto L_0x0d14
        L_0x035b:
            r0 = -1614042122(0xffffffff9fcbabf6, float:-8.625833E-20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.0sP r2 = (X.0sP) r2
            X.EOU r1 = X.EOU.A00
            r2.invoke(r1)
            r1 = -1595689015(0xffffffffa0e3b7c9, float:-3.8576915E-19)
            goto L_0x0d14
        L_0x0370:
            r0 = -1216080604(0xffffffffb7841524, float:-1.574547E-5)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.E2p r2 = (X.C47443E2p) r2
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            X.0eM r4 = r2.A00
            X.6Yo r7 = X.DbX.A0N(r1, r4)
            r3 = 1
            r7.A0E = r3
            X.1Yq r1 = X.FCL.A01()
            r1.A00()
            X.0eM r2 = r2.A02
            java.lang.Object r1 = r2.getValue()
            X.Dkl r1 = (X.C46758Dkl) r1
            java.lang.String r6 = r1.A02
            X.0lg r5 = X.DbT.A0X(r4)
            java.lang.Object r1 = r2.getValue()
            X.Dkl r1 = (X.C46758Dkl) r1
            com.instagram.api.schemas.IGRevShareProductType r4 = r1.A00
            X.0Tu r3 = X.DbS.A0J(r5, r3)
            r1 = 36315829684670020(0x81050e00140e44, double:3.0296151524694996E-306)
            boolean r1 = X.182.A06(r3, r5, r1)
            if (r1 == 0) goto L_0x03c7
            X.E2Q r2 = new X.E2Q
            r2.<init>()
        L_0x03b9:
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            android.os.Bundle r1 = X.DbZ.A09(r4, r6)
            X.DbW.A0x(r1, r2, r7)
            r1 = -868363512(0xffffffffcc3dd308, float:-4.9761312E7)
            goto L_0x0d14
        L_0x03c7:
            X.E2U r2 = new X.E2U
            r2.<init>()
            goto L_0x03b9
        L_0x03cd:
            r0 = -1612297652(0xffffffff9fe64a4c, float:-9.75317E-20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r15.A01
            X.E2p r3 = (X.C47443E2p) r3
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            X.0eM r1 = r3.A00
            X.6Yo r4 = X.DbX.A0N(r2, r1)
            X.FCL.A02(r4)
            X.0eM r2 = r3.A02
            java.lang.Object r1 = r2.getValue()
            X.Dkl r1 = (X.C46758Dkl) r1
            java.lang.String r3 = r1.A02
            java.lang.Object r1 = r2.getValue()
            X.Dkl r1 = (X.C46758Dkl) r1
            com.instagram.api.schemas.IGRevShareProductType r1 = r1.A00
            X.E4F r2 = new X.E4F
            r2.<init>()
            android.os.Bundle r1 = X.DbZ.A09(r1, r3)
            X.DbW.A0x(r1, r2, r4)
            r1 = 1713957140(0x6628e914, float:1.9941428E23)
            goto L_0x0d14
        L_0x0408:
            r0 = -1827919819(0xffffffff930c2835, float:-1.7690308E-27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.E2U r1 = (X.E2U) r1
            X.0eM r1 = r1.A03
            java.lang.Object r2 = r1.getValue()
            X.Dl0 r2 = (X.C46773Dl0) r2
            X.EOg r1 = X.C47955EOg.A00
            r2.A00(r1)
            r1 = -1673206544(0xffffffff9c44e4f0, float:-6.5146855E-22)
            goto L_0x0d14
        L_0x0425:
            r0 = -1827471931(0xffffffff9312fdc5, float:-1.8552909E-27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.E2Q r1 = (X.E2Q) r1
            X.0eM r1 = r1.A02
            java.lang.Object r2 = r1.getValue()
            X.Dl0 r2 = (X.C46773Dl0) r2
            X.EOg r1 = X.C47955EOg.A00
            r2.A00(r1)
            r1 = -376411701(0xffffffffe99069cb, float:-2.1823114E25)
            goto L_0x0d14
        L_0x0442:
            r0 = 566343181(0x21c1b60d, float:1.3126377E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.EN1 r1 = (X.EN1) r1
            X.6Yo r6 = X.DbY.A0K(r1)
            X.FCL.A02(r6)
            X.0eM r2 = r1.A00
            java.lang.Object r1 = r2.getValue()
            X.Dl2 r1 = (X.C46775Dl2) r1
            com.instagram.api.schemas.UserMonetizationProductType r1 = r1.A01
            java.lang.String r5 = r1.A00
            java.lang.Object r1 = r2.getValue()
            X.Dl2 r1 = (X.C46775Dl2) r1
            X.0Ud r1 = r1.A09
            java.lang.Object r1 = r1.getValue()
            X.Drv r1 = (X.C47180Drv) r1
            java.lang.String r4 = r1.A01
            X.E2I r3 = new X.E2I
            r3.<init>()
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "ARGUMENT_PRODUCT_TYPE"
            r2.putString(r1, r5)
            java.lang.String r1 = "ARGUMENT_PRODUCT_ELIGIBILITY"
            r2.putString(r1, r4)
            X.DbW.A0x(r2, r3, r6)
            r1 = -515307381(0xffffffffe149088b, float:-2.317757E20)
            goto L_0x0d14
        L_0x048b:
            r0 = 1251707360(0x4a9b89e0, float:5096688.0)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r15.A01
            X.E4Z r6 = (X.E4Z) r6
            androidx.fragment.app.FragmentActivity r5 = r6.requireActivity()
            X.0eM r1 = r6.A02
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r1)
            X.2EG r1 = X.2EG.A24
            java.lang.String r4 = "CreatorRevshareAdsAboutFragment"
            java.lang.String r3 = "https://www.facebook.com/help/instagram/512371932629820"
            X.FH7.A08(r5, r2, r1, r3, r4)
            java.lang.String r2 = "secondary_button_clicked"
            java.lang.String r1 = "feature_preview"
            r6.A04(r2, r1, r4, r3)
            r1 = 1385185986(0x529042c2, float:3.0979765E11)
            goto L_0x0d14
        L_0x04b5:
            r0 = 1323145598(0x4edd997e, float:1.858912E9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r15.A01
            X.E4Z r6 = (X.E4Z) r6
            java.lang.String r5 = "CreatorRevshareAdsAboutFragment"
            java.lang.String r4 = "https://www.facebook.com/help/instagram/512371932629820"
            java.lang.String r2 = "primary_button_clicked"
            java.lang.String r1 = "feature_preview"
            r6.A04(r2, r1, r5, r4)
            androidx.fragment.app.FragmentActivity r3 = r6.requireActivity()
            X.0eM r1 = r6.A02
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r1)
            X.2EG r1 = X.2EG.A2l
            X.FH7.A08(r3, r2, r1, r4, r5)
            r1 = -1141380420(0xffffffffbbf7eabc, float:-0.0075658243)
            goto L_0x0d14
        L_0x04df:
            r0 = 663049620(0x27855594, float:3.70077E-15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r15.A01
            X.E4Z r6 = (X.E4Z) r6
            java.lang.String r9 = "CreatorRevshareAdsAboutFragment"
            X.0eM r8 = r6.A02
            X.0lg r1 = X.DbT.A0X(r8)
            X.0Tu r7 = X.0Tu.A05
            r4 = 36878779637432518(0x83050e000a00c6, double:3.385626969414015E-306)
            java.lang.String r3 = X.182.A04(r7, r1, r4)
            java.lang.String r2 = "primary_button_clicked"
            java.lang.String r1 = "feature_preview"
            r6.A04(r2, r1, r9, r3)
            androidx.fragment.app.FragmentActivity r6 = r6.requireActivity()
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r8)
            X.0lg r1 = X.DbT.A0X(r8)
            java.lang.String r2 = X.182.A04(r7, r1, r4)
            X.2EG r1 = X.2EG.A2k
            X.FH7.A08(r6, r3, r1, r2, r9)
            r1 = 1154898497(0x44d65a41, float:1714.8204)
            goto L_0x0d14
        L_0x051e:
            r0 = 1823341579(0x6cadfc0b, float:1.6826752E27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.DbT.A1I(r1)
            r1 = 1635602942(0x617d51fe, float:2.920584E20)
            goto L_0x0d14
        L_0x0531:
            r0 = 1554988801(0x5caf3f01, float:3.94619156E17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r15.A01
            X.E4N r6 = (X.E4N) r6
            androidx.fragment.app.FragmentActivity r5 = r6.requireActivity()
            X.0eM r1 = r6.A04
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            X.2EG r3 = X.2EG.A24
            java.lang.String r1 = "creator_revshare_account_level_monetization_toggle"
            java.lang.String r2 = "https://help.instagram.com/537304753874814"
            X.FH7.A08(r5, r4, r3, r2, r1)
            java.lang.String r1 = "secondary_button_clicked"
            X.E4N.A00(r6, r1, r2)
            r1 = -1642058291(0xffffffff9e202dcd, float:-8.479801E-21)
            goto L_0x0d14
        L_0x0559:
            r0 = -342829045(0xffffffffeb90d80b, float:-3.502111E26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = "com.instagram.pro_home.monetization_platform.support.monetization_help_screen"
            X.DiU r3 = X.C46649DiU.A04(r1, r2)
            java.lang.Object r1 = r15.A01
            X.E2I r1 = (X.E2I) r1
            androidx.fragment.app.FragmentActivity r2 = r1.requireActivity()
            X.0eM r1 = r1.A00
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.Dbb.A0J(r1)
            r3.A0D(r2, r1)
            r1 = 1735616419(0x677367a3, float:1.1494468E24)
            goto L_0x0d14
        L_0x0580:
            r0 = 1011800154(0x3c4ed85a, float:0.012624824)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r15.A01
            X.E2I r3 = (X.E2I) r3
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            X.0eM r1 = r3.A00
            X.6Yo r6 = X.DbX.A0N(r2, r1)
            com.instagram.monetization.impl.MonetizationFragmentFactoryImpl r5 = X.F6R.A00()
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            X.0eM r2 = r3.A02
            java.lang.Object r1 = r2.getValue()
            X.Dkk r1 = (X.C46757Dkk) r1
            com.instagram.api.schemas.UserMonetizationProductType r3 = r1.A01
            java.lang.Object r1 = r2.getValue()
            X.Dkk r1 = (X.C46757Dkk) r1
            java.lang.String r2 = r1.A02
            r1 = 0
            androidx.fragment.app.Fragment r1 = r5.A00(r3, r4, r2, r1)
            r6.A0D(r1)
            r6.A04()
            r1 = -268484266(0xffffffffefff4156, float:-1.5799533E29)
            goto L_0x0d14
        L_0x05bf:
            r0 = -57232211(0xfffffffffc96b4ad, float:-6.2600726E36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.E3x r1 = (X.C47473E3x) r1
            X.0eM r1 = r1.A02
            X.2YL r5 = X.DbS.A0H(r1)
            X.6oS r4 = X.C318116oQ.A00(r5)
            r3 = 0
            r2 = 48
            X.MH3 r1 = new X.MH3
            r1.<init>(r5, r3, r2)
            X.AnonymousClass7TE.A1Z(r1, r4)
            r1 = 1965137264(0x75219d70, float:2.0487134E32)
            goto L_0x0d14
        L_0x05e4:
            r0 = 400422692(0x17ddf724, float:1.4344177E-24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.0Tu r3 = X.0Tu.A05
            r1 = 18859429030068245(0x43008d00010015, double:2.1140595267329738E-307)
            java.lang.String r1 = X.1AW.A04(r3, r1)
            android.net.Uri r1 = X.0cp.A03(r1)
            java.lang.Object r2 = r15.A01
            android.content.Context r2 = (android.content.Context) r2
            boolean r1 = X.0kR.A0F(r2, r1)
            if (r1 != 0) goto L_0x060e
            android.content.Context r2 = r2.getApplicationContext()
            r1 = 2131969102(0x7f13444e, float:1.9575117E38)
            X.C59689JTv.A07(r2, r1)
        L_0x060e:
            r1 = -540675805(0xffffffffdfc5f123, float:-2.852644E19)
            goto L_0x0d14
        L_0x0613:
            r0 = -221001140(0xfffffffff2d3ca4c, float:-8.389875E30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.EO2 r2 = (X.EO2) r2
            java.lang.String r1 = "tap"
            X.EO2.A04(r2, r1)
            X.DbT.A1J(r2)
            r1 = 1179733116(0x46514c7c, float:13395.121)
            goto L_0x0d14
        L_0x062b:
            r0 = 289571346(0x11428212, float:1.5343983E-28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r15.A01
            X.E3K r3 = (X.E3K) r3
            java.lang.String r6 = "back_button"
            X.0eM r2 = r3.A00
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r8 = r1.A06
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r5 = "tap"
            java.lang.String r7 = "edit_opal"
            r9 = 0
            X.C49049EoT.A00(r3, r4, r5, r6, r7, r8, r9)
            X.DbT.A1K(r3)
            r1 = -1655536758(0xffffffff9d52838a, float:-2.7861273E-21)
            goto L_0x0d14
        L_0x0654:
            r0 = -140289816(0xfffffffff7a358e8, float:-6.626153E33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.2dY r2 = X.2dZ.A0t
            java.lang.Object r4 = r15.A01
            X.EO1 r4 = (X.EO1) r4
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            X.Dba.A0n(r1, r2)
            X.0eM r1 = r4.A02
            X.2YL r3 = X.DbS.A0H(r1)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r10 = 0
            r1 = 5
            X.C51647Fy6.A02(r3, r2, r1)
            java.lang.String r7 = "save_button"
            X.0eM r2 = r4.A00
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r9 = r1.A06
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r6 = "tap"
            java.lang.String r8 = "edit_opal"
            X.C49049EoT.A00(r4, r5, r6, r7, r8, r9, r10)
            r1 = -939879765(0xffffffffc7fa92ab, float:-128293.336)
            goto L_0x0d14
        L_0x0691:
            r0 = 616627588(0x24c0fd84, float:8.36962E-17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r15.A01
            X.E1u r4 = (X.C47426E1u) r4
            r1 = 1
            X.C47426E1u.A00(r4, r1)
            X.0eM r1 = r4.A06
            X.0lg r3 = X.DbT.A0X(r1)
            java.lang.String r2 = "nux_uxr_survey"
            r1 = 0
            X.FEK.A00(r3, r1, r2)
            X.G8t r1 = r4.A01
            X.Dba.A1N(r1)
            r1 = -34237754(0xfffffffffdf592c6, float:-4.080287E37)
            goto L_0x0d14
        L_0x06b6:
            r0 = 424123951(0x19479e2f, float:1.0320004E-23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r15.A01
            X.E1u r5 = (X.C47426E1u) r5
            r1 = 0
            X.C47426E1u.A00(r5, r1)
            X.FBf r4 = X.C49881FBf.A00
            X.0eM r1 = r5.A06
            X.0lg r3 = X.DbT.A0X(r1)
            java.lang.String r2 = "nux_uxr_survey"
            r1 = 0
            r4.A00(r3, r1, r2)
            X.G8t r1 = r5.A01
            X.Dba.A1O(r1)
            r1 = 495514422(0x1d88f336, float:3.6250374E-21)
            goto L_0x0d14
        L_0x06dd:
            r0 = -57388867(0xfffffffffc9450bd, float:-6.16078E36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r15.A01
            X.EEG r4 = (X.EEG) r4
            java.lang.Integer r3 = r4.A02
            X.0lg r2 = r4.A06
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r4.A00(r2, r3, r1)
            r1 = 1260968409(0x4b28d9d9, float:1.1065817E7)
            goto L_0x0d14
        L_0x06f6:
            r0 = 74291565(0x46d996d, float:2.7929666E-36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r15.A01
            X.EEG r4 = (X.EEG) r4
            java.lang.Integer r3 = r4.A02
            X.0lg r2 = r4.A06
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r4.A00(r2, r3, r1)
            r1 = -891370934(0xffffffffcadec24a, float:-7299365.0)
            goto L_0x0d14
        L_0x070f:
            r0 = 851471340(0x32c06bec, float:2.2400819E-8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r15.A01
            X.F2u r6 = (X.C49709F2u) r6
            X.0lg r7 = r6.A09
            r5 = 0
            X.0qQ.A0B(r7, r5)
            X.0wc r2 = X.AnonymousClass0kN.A02(r7)
            java.lang.String r1 = "country_code_buttontapped"
            X.0Aj r8 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r8.isSampled()
            if (r1 == 0) goto L_0x075d
            double r1 = X.DbS.A01()
            double r3 = X.DbS.A00()
            X.DbY.A1D(r8, r1, r3)
            java.lang.String r1 = "phone"
            X.DbS.A1G(r8, r1)
            X.DbT.A1P(r8)
            X.DbZ.A1J(r8, r1)
            java.lang.String r1 = "PHONE"
            java.lang.String r2 = X.AnonymousClass7TF.A0j(r1)
            java.lang.String r1 = "contact_point_type"
            X.DbY.A1I(r8, r1, r2, r3)
            X.FH8.A0B(r8, r7)
            r2 = 0
            java.lang.String r1 = "actor_id"
            r8.A9F(r1, r2)
            r8.Cgf()
        L_0x075d:
            X.E0N r1 = new X.E0N
            r1.<init>()
            r6.A01 = r1
            android.os.Bundle r1 = X.DbV.A0A(r7)
            X.E0N r2 = r6.A01
            r2.setArguments(r1)
            X.4DH r1 = r6.A08
            r2.setTargetFragment(r1, r5)
            X.E0N r3 = r6.A01
            X.0hq r2 = r1.mFragmentManager
            r1 = 0
            r3.A0B(r2, r1)
            r1 = -220123641(0xfffffffff2e12e07, float:-8.9202907E30)
            goto L_0x0d14
        L_0x077f:
            r0 = -1157525236(0xffffffffbb01910c, float:-0.0019770293)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.F2u r1 = (X.C49709F2u) r1
            android.widget.AutoCompleteTextView r1 = r1.A05
            X.DbS.A1C(r1)
            r1.requestFocus()
            X.0nA.A0Q(r1)
            r1 = 1105482737(0x41e453f1, float:28.540987)
            goto L_0x0d14
        L_0x079a:
            r0 = -564984261(0xffffffffde53063b, float:-3.80147652E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r15.A01
            X.EEE r8 = (X.EEE) r8
            X.0aP r10 = r8.A06
            java.util.Locale r1 = X.AnonymousClass1Q2.A03()
            java.lang.String r9 = r1.getLanguage()
            X.DiE r1 = r8.A07
            java.lang.String r7 = r1.A01
            X.AnonymousClass7TG.A1T(r10, r9, r7)
            double r5 = X.DbS.A01()
            double r3 = X.DbS.A00()
            X.0wc r2 = X.AnonymousClass0kN.A02(r10)
            java.lang.String r1 = "language_selector_clicked"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            X.Dbc.A0X(r2, r5, r3)
            X.DbZ.A1E(r2)
            java.lang.String r1 = "from_lang"
            r2.AAJ(r1, r9)
            X.DbS.A1H(r2, r7)
            X.FH8.A04(r2)
            X.FH8.A08(r2, r10)
            X.E0M r3 = new X.E0M
            r3.<init>()
            r8.A01 = r3
            X.4DH r2 = r8.A05
            r1 = 0
            r3.setTargetFragment(r2, r1)
            X.E0M r3 = r8.A01
            X.0hq r2 = r2.mFragmentManager
            r1 = 0
            r3.A0B(r2, r1)
            r1 = -185484597(0xfffffffff4f1bacb, float:-1.5321437E32)
            goto L_0x0d14
        L_0x07f6:
            r0 = 560350470(0x21664506, float:7.8018383E-19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.F0L r1 = (X.F0L) r1
            android.widget.AutoCompleteTextView r1 = r1.A04
            X.DbS.A1C(r1)
            r1.requestFocus()
            X.0nA.A0Q(r1)
            r1 = 997483522(0x3b746402, float:0.0037291055)
            goto L_0x0d14
        L_0x0811:
            r0 = 690608824(0x2929dab8, float:3.7715247E-14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r15.A01
            X.E3W r3 = (X.E3W) r3
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            X.0aP r1 = r3.A00
            X.6Yo r4 = X.DbY.A0J(r2, r1)
            com.instagram.registration.model.RegFlowExtras r3 = r3.A01
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "RegFlowExtras.EXTRA_KEY"
            r2.putParcelable(r1, r3)
            X.DbU.A1C(r2)
            X.E3Z r1 = new X.E3Z
            r1.<init>()
            X.DbX.A18(r2, r1, r4)
            r1 = -1656160540(0xffffffff9d48fee4, float:-2.6601555E-21)
            goto L_0x0d14
        L_0x0841:
            r0 = -249359604(0xfffffffff123130c, float:-8.075053E29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r15.A01
            X.E3n r3 = (X.C47465E3n) r3
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            android.os.Bundle r2 = X.DbU.A06(r1)
            if (r2 == 0) goto L_0x0866
            java.lang.String r1 = "caa_registration_redirection_to_native"
            boolean r1 = r2.containsKey(r1)
            if (r1 == 0) goto L_0x0866
            X.DbT.A1K(r3)
        L_0x0861:
            r1 = 1265866377(0x4b739689, float:1.5963785E7)
            goto L_0x0d14
        L_0x0866:
            X.C47465E3n.A00(r3)
            goto L_0x0861
        L_0x086a:
            r0 = 1756753902(0x68b5efee, float:6.873394E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.E5D r1 = (X.E5D) r1
            X.E5D.A00(r1)
            r1 = 1184245760(0x46962800, float:19220.0)
            goto L_0x0d14
        L_0x087d:
            r0 = -1549967169(0xffffffffa39d60bf, float:-1.7062948E-17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.E5D r1 = (X.E5D) r1
            X.E5D.A00(r1)
            r1 = -754942505(0xffffffffd3007dd7, float:-5.5186706E11)
            goto L_0x0d14
        L_0x0890:
            r0 = -22279368(0xfffffffffeac0b38, float:-1.1434273E38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.E5D r1 = (X.E5D) r1
            X.E5D.A01(r1)
            r1 = -58263862(0xfffffffffc86f6ca, float:-5.606186E36)
            goto L_0x0d14
        L_0x08a3:
            r0 = -1902040985(0xffffffff8ea12867, float:-3.972847E-30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.E5D r1 = (X.E5D) r1
            X.E5D.A01(r1)
            r1 = 1960363554(0x74d8c622, float:1.3739682E32)
            goto L_0x0d14
        L_0x08b6:
            r0 = -358912450(0xffffffffea9b6e3e, float:-9.395205E25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.E5D r1 = (X.E5D) r1
            X.E5D.A00(r1)
            r1 = -1486315791(0xffffffffa7689ef1, float:-3.228263E-15)
            goto L_0x0d14
        L_0x08c9:
            r0 = 1616219404(0x60558d0c, float:6.1551875E19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.E5D r1 = (X.E5D) r1
            X.E5D.A01(r1)
            r1 = 241259358(0xe61535e, float:2.7773531E-30)
            goto L_0x0d14
        L_0x08dc:
            r0 = 1187771837(0x46cbf5bd, float:26106.87)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.E5D r1 = (X.E5D) r1
            X.E5D.A00(r1)
            r1 = 1863477870(0x6f126a6e, float:4.5313477E28)
            goto L_0x0d14
        L_0x08ef:
            r0 = -197405671(0xfffffffff43bd419, float:-5.952523E31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.E5D r1 = (X.E5D) r1
            X.E5D.A01(r1)
            r1 = 472084377(0x1c236f99, float:5.4076413E-22)
            goto L_0x0d14
        L_0x0902:
            r0 = 1283595895(0x4c821e77, float:6.8219832E7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.1Q0 r2 = X.1Q0.A0S
            java.lang.Object r4 = r15.A01
            X.E3g r4 = (X.C47459E3g) r4
            X.0wW r1 = r4.A01
            X.FGI r2 = r2.A02(r1)
            X.DiE r1 = X.C46634DiE.A1V
            r8 = 0
            X.FGI.A02(r2, r8, r1)
            X.0wW r7 = r4.A01
            java.lang.String r6 = "sign_up_with_biz_option"
            java.lang.String r5 = r4.A04
            java.lang.String r3 = "sign_up_as_business"
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            X.0xI r2 = X.C48730EjF.A00(r1)
            java.lang.String r1 = "step"
            r2.A0C(r1, r6)
            java.lang.String r6 = "entry_point"
            r2.A0C(r6, r5)
            java.lang.String r1 = "fb_user_id"
            r2.A0C(r1, r8)
            java.lang.String r1 = "component"
            r2.A0C(r1, r3)
            if (r7 == 0) goto L_0x09a5
            X.DbU.A1R(r2, r7)
            X.C322576w3.A00()
            android.content.Context r2 = r4.getContext()
            r1 = 0
            X.0qQ.A0B(r2, r1)
            android.content.Intent r3 = X.DbU.A04(r2)
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            X.0wW r1 = r4.A01
            X.DbW.A0w(r5, r1)
            java.lang.String r1 = r4.A04
            r5.putString(r6, r1)
            r2 = 7
            java.lang.String r1 = "business_account_flow"
            r5.putInt(r1, r2)
            r1 = 4010(0xfaa, float:5.619E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            r1 = 1
            r5.putBoolean(r2, r1)
            java.lang.String r2 = r4.A06
            java.lang.String r1 = "suma_sign_up_page_name"
            r5.putString(r1, r2)
            java.lang.String r2 = r4.A05
            java.lang.String r1 = "target_page_id"
            r5.putString(r1, r2)
            android.os.Bundle r2 = r4.requireArguments()
            java.lang.String r1 = "cached_fb_access_token"
            java.lang.String r2 = r2.getString(r1)
            java.lang.String r1 = "fb_access_token"
            r5.putString(r1, r2)
            r3.putExtras(r5)
            X.0b6 r1 = X.0kR.A00
            boolean r1 = r4.isAdded()
            if (r1 == 0) goto L_0x09a0
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            if (r1 == 0) goto L_0x09a0
            X.0kR.A0B(r1, r3)
        L_0x09a0:
            r1 = -1846001183(0xffffffff91f841e1, float:-3.9168102E-28)
            goto L_0x0d14
        L_0x09a5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x09aa:
            r0 = -299509276(0xffffffffee25d9e4, float:-1.283211E28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r15.A01
            X.E3g r8 = (X.C47459E3g) r8
            X.0wW r1 = r8.A01
            java.lang.String r7 = "sign_up_with_biz_option"
            X.C49207ErC.A00(r1, r7)
            X.0wW r6 = r8.A01
            java.lang.String r5 = r8.A04
            java.lang.String r4 = "sign_up_as_personal"
            r3 = 0
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            X.0xI r2 = X.C48730EjF.A00(r1)
            java.lang.String r1 = "step"
            r2.A0C(r1, r7)
            java.lang.String r1 = "entry_point"
            r2.A0C(r1, r5)
            java.lang.String r1 = "fb_user_id"
            r2.A0C(r1, r3)
            java.lang.String r1 = "component"
            r2.A0C(r1, r4)
            if (r6 == 0) goto L_0x09ec
            X.DbU.A1R(r2, r6)
            X.F3M r1 = r8.A03
            r1.A01()
            r1 = -358593988(0xffffffffeaa04a3c, float:-9.688935E25)
            goto L_0x0d14
        L_0x09ec:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x09f1:
            r0 = 483418971(0x1cd0635b, float:1.3789968E-21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r15.A01
            X.E1y r4 = (X.C47429E1y) r4
            X.0eM r1 = r4.A08
            X.0lg r3 = X.DbT.A0X(r1)
            java.lang.Integer r2 = r4.A02
            X.DbY.A1S(r3, r2)
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            X.C49215ErK.A00(r3, r1, r2)
            X.0hq r2 = X.DbV.A0I(r4)
            X.0qQ.A07(r2)
            int r1 = r2.A0M()
            if (r1 <= 0) goto L_0x0a21
            r2.A0c()
        L_0x0a1c:
            r1 = 55793047(0x3535597, float:6.210558E-37)
            goto L_0x0d14
        L_0x0a21:
            X.DbT.A1J(r4)
            goto L_0x0a1c
        L_0x0a25:
            r0 = 564788708(0x21a9fde4, float:1.151909E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r15.A01
            X.E1y r4 = (X.C47429E1y) r4
            X.0eM r1 = r4.A08
            X.0lg r3 = X.DbT.A0X(r1)
            java.lang.Integer r2 = r4.A02
            X.DbY.A1S(r3, r2)
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            X.C49215ErK.A00(r3, r1, r2)
            X.36O r2 = r4.A00
            if (r2 == 0) goto L_0x0a4b
            android.content.Context r1 = r4.requireContext()
            r2.A05(r1)
        L_0x0a4b:
            r1 = 175072665(0xa6f6599, float:1.152654E-32)
            goto L_0x0d14
        L_0x0a50:
            r0 = 868036218(0x33bd2e7a, float:8.8094524E-8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r15.A01
            X.E1y r6 = (X.C47429E1y) r6
            boolean r1 = r6.A04
            if (r1 == 0) goto L_0x0a8b
            X.FBf r5 = X.C49881FBf.A00
            X.0eM r4 = r6.A08
            X.0lg r3 = X.DbT.A0X(r4)
            java.lang.String r2 = "lightweight_connections"
            r1 = 0
            r5.A00(r3, r1, r2)
            X.0lg r3 = X.DbT.A0X(r4)
            java.lang.Integer r2 = r6.A02
            X.DbY.A1S(r3, r2)
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
        L_0x0a78:
            X.C49215ErK.A00(r3, r1, r2)
            X.G8t r2 = X.C49047EoR.A00(r6)
            if (r2 == 0) goto L_0x0a86
            boolean r1 = r6.A04
            r2.Cm0(r1)
        L_0x0a86:
            r1 = 1370777823(0x51b468df, float:9.6856695E10)
            goto L_0x0d14
        L_0x0a8b:
            X.0eM r4 = r6.A08
            X.0lg r3 = X.DbT.A0X(r4)
            java.lang.String r2 = "lightweight_connections"
            r1 = 0
            X.FEK.A00(r3, r1, r2)
            X.0lg r3 = X.DbT.A0X(r4)
            java.lang.Integer r2 = r6.A02
            X.DbY.A1S(r3, r2)
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            goto L_0x0a78
        L_0x0aa3:
            r0 = -6967268(0xffffffffff95b01c, float:NaN)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r15.A01
            X.E1y r4 = (X.C47429E1y) r4
            X.0eM r1 = r4.A08
            X.0lg r3 = X.DbT.A0X(r1)
            java.lang.Integer r2 = r4.A02
            X.DbY.A1S(r3, r2)
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.C49215ErK.A00(r3, r1, r2)
            com.instagram.user.model.User r1 = r4.A01
            if (r1 != 0) goto L_0x0ac6
            java.lang.String r0 = "user"
            goto L_0x0bb0
        L_0x0ac6:
            java.lang.String r2 = r1.getUsername()
            r1 = 0
            X.C49037EoH.A00(r4, r2, r1)
            r1 = -1007605346(0xffffffffc3f1299e, float:-482.32513)
            goto L_0x0d14
        L_0x0ad3:
            r0 = -1763266550(0xffffffff96e6b00a, float:-3.72696E-25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            X.E5g r1 = (X.C47501E5g) r1
            X.G8t r1 = r1.A01
            X.Dba.A1N(r1)
            r1 = -1555445781(0xffffffffa349c7eb, float:-1.0938566E-17)
            goto L_0x0d14
        L_0x0ae8:
            r0 = -449965538(0xffffffffe52e121e, float:-5.1376623E22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r15.A01
            X.E5g r5 = (X.C47501E5g) r5
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            if (r1 == 0) goto L_0x0b65
            android.view.View r1 = r1.getCurrentFocus()
        L_0x0afd:
            X.0nA.A0N(r1)
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            if (r1 == 0) goto L_0x0b0f
            android.view.View r1 = r1.getCurrentFocus()
            if (r1 == 0) goto L_0x0b0f
            r1.clearFocus()
        L_0x0b0f:
            X.UYc r4 = new X.UYc
            r4.<init>()
            X.0eM r7 = r5.A06
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r7)
            java.lang.String r2 = r1.A05
            java.lang.String r1 = "IgSessionManager.SESSION_TOKEN_KEY"
            X.0eP r8 = X.AnonymousClass7TE.A1L(r1, r2)
            r2 = 0
            java.lang.Boolean r6 = X.AnonymousClass7TE.A0v()
            r1 = 1102(0x44e, float:1.544E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0eP r3 = X.AnonymousClass7TE.A1L(r1, r6)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1 = 1107(0x453, float:1.551E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            android.os.Bundle r1 = X.DbY.A0C(r1, r2, r8, r3)
            r4.setArguments(r1)
            r2 = 23
            X.G4U r1 = new X.G4U
            r1.<init>(r5, r2)
            r4.A01 = r1
            X.7Pr r3 = X.DbX.A0f(r7)
            r3.A0a = r6
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.A03 = r1
            r2 = 5
            X.Lys r1 = new X.Lys
            r1.<init>(r4, r2)
            r3.A0T = r1
            X.DbY.A13(r5, r4, r3)
            r1 = 294513103(0x118de9cf, float:2.2389973E-28)
            goto L_0x0d14
        L_0x0b65:
            r1 = 0
            goto L_0x0afd
        L_0x0b67:
            r0 = -1208629556(0xffffffffb7f5c6cc, float:-2.9298848E-5)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r15.A01
            X.E5F r5 = (X.E5F) r5
            X.0eM r1 = r5.A04
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r1)
            X.G8t r8 = r5.A01
            r3 = 0
            X.FGL r2 = new X.FGL
            r4 = r2
            r6 = r5
            r9 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            X.EX9 r1 = X.EX9.PARTIAL_CI_NUX
            java.lang.String r6 = r1.toString()
            java.lang.String r7 = r5.A03
            if (r7 != 0) goto L_0x0b90
            java.lang.String r0 = "registrationFlow"
            goto L_0x0bb0
        L_0x0b90:
            r8 = 0
            X.0qQ.A0B(r6, r8)
            r4 = r3
            r5 = r3
            r9 = r8
            r2.A04(r3, r4, r5, r6, r7, r8, r9)
            r1 = -1542927225(0xffffffffa408cc87, float:-2.966354E-17)
            goto L_0x0d14
        L_0x0b9f:
            r0 = -1459379445(0xffffffffa903a30b, float:-2.922926E-14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r15.A01
            X.E5F r5 = (X.E5F) r5
            X.6cm r4 = r5.A00
            if (r4 != 0) goto L_0x0bb8
            java.lang.String r0 = "contactImportLogger"
        L_0x0bb0:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0bb8:
            java.lang.String r2 = r5.A02
            r3 = 0
            r1 = 1
            r4.A03(r3, r2, r1)
            X.0eM r1 = r5.A04
            X.0lg r2 = X.DbT.A0X(r1)
            java.lang.String r1 = "partial_ci_nux_prompt"
            X.FEK.A00(r2, r3, r1)
            X.G8t r1 = r5.A01
            X.Dba.A1N(r1)
            r1 = 197768892(0xbc9b6bc, float:7.769733E-32)
            goto L_0x0d14
        L_0x0bd4:
            r0 = -454321902(0xffffffffe4eb9912, float:-3.4768118E22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.FBf r3 = X.C49881FBf.A00
            java.lang.Object r4 = r15.A01
            X.E76 r4 = (X.E76) r4
            com.instagram.common.session.UserSession r2 = r4.getSession()
            java.lang.String r1 = "nux_one_tap_upsell"
            r3.A02(r2, r1)
            com.instagram.common.session.UserSession r1 = r4.getSession()
            X.6qt r2 = X.C319606qt.A01(r1)
            com.instagram.common.session.UserSession r1 = r4.getSession()
            java.lang.String r7 = r1.A06
            java.lang.Integer r6 = X.AnonymousClass05K.A0Y
            com.instagram.common.session.UserSession r5 = r4.getSession()
            android.content.Context r3 = r4.getContext()
            r8 = 1
            r2.A09(r3, r4, r5, r6, r7, r8)
            androidx.fragment.app.FragmentActivity r2 = r4.getActivity()
            boolean r1 = r2 instanceof X.C51950G8t
            if (r1 == 0) goto L_0x0c1a
            X.G8t r2 = (X.C51950G8t) r2
            if (r2 == 0) goto L_0x0c1a
            r2.Cm0(r8)
        L_0x0c15:
            r1 = 1948303525(0x7420c0a5, float:5.0944506E31)
            goto L_0x0d14
        L_0x0c1a:
            X.G8D r1 = r4.A02
            if (r1 == 0) goto L_0x0c22
            X.Dba.A1P(r1)
            goto L_0x0c15
        L_0x0c22:
            X.FRN r1 = r4.A03
            r1.A00()
            goto L_0x0c15
        L_0x0c28:
            java.lang.Object r5 = r15.A01
            X.E76 r5 = (X.E76) r5
            com.instagram.common.session.UserSession r1 = r5.getSession()
            java.lang.String r0 = "nux_one_tap_upsell"
            boolean r4 = X.AnonymousClass7TG.A1Z(r1, r0)
            r3 = 0
            X.FEK.A00(r1, r3, r0)
            r2 = 0
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            boolean r0 = r1 instanceof X.C51950G8t
            if (r0 == 0) goto L_0x0c4b
            X.G8t r1 = (X.C51950G8t) r1
            if (r1 == 0) goto L_0x0c4b
            r1.Cm0(r2)
            return
        L_0x0c4b:
            X.G8D r0 = r5.A02
            if (r0 == 0) goto L_0x0c55
            com.instagram.business.activity.BusinessConversionActivity r0 = (com.instagram.business.activity.BusinessConversionActivity) r0
            r0.A0p(r3, r4)
            return
        L_0x0c55:
            X.FRN r0 = r5.A03
            r0.A00()
            return
        L_0x0c5b:
            r0 = -1425683906(0xffffffffab05ca3e, float:-4.753176E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r15.A01
            com.instagram.nux.fragment.OneTapLoginLandingFragment r4 = (com.instagram.nux.fragment.OneTapLoginLandingFragment) r4
            X.0aP r2 = r4.A00
            java.lang.String r1 = "sso"
            X.C49228ErX.A00(r2, r1)
            android.os.Bundle r3 = r4.mArguments
            java.lang.String r1 = X.C49041EoL.A00(r3)
            if (r1 == 0) goto L_0x0c8f
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            X.0aP r1 = r4.A00
            X.6Yo r2 = X.DbY.A0J(r2, r1)
            X.DbU.A1C(r3)
            X.E3g r1 = new X.E3g
            r1.<init>()
            X.DbX.A18(r3, r1, r2)
        L_0x0c8a:
            r1 = 1257688663(0x4af6ce57, float:8087339.5)
            goto L_0x0d14
        L_0x0c8f:
            X.0aP r1 = r4.A00
            boolean r1 = X.FCQ.A02(r1)
            if (r1 == 0) goto L_0x0cc0
            X.FEr r1 = X.C49917FEr.A00()
            java.lang.Integer r1 = r1.A05
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            if (r1 == r2) goto L_0x0cd3
            X.FEw r1 = X.C49921FEw.A00()
            java.lang.Integer r1 = r1.A01()
            if (r1 == r2) goto L_0x0cd3
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            X.0aP r1 = r4.A00
            X.6Yo r2 = X.DbS.A0M(r2, r1)
            X.E59 r1 = X.C49793F7b.A01(r3)
        L_0x0cb9:
            r2.A0E(r1)
            r2.A04()
            goto L_0x0c8a
        L_0x0cc0:
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            X.0aP r1 = r4.A00
            X.6Yo r2 = X.DbY.A0J(r2, r1)
            X.E3s r1 = new X.E3s
            r1.<init>()
            r1.setArguments(r3)
            goto L_0x0cb9
        L_0x0cd3:
            X.DbT.A15()
            X.DbU.A1C(r3)
            X.E3n r2 = new X.E3n
            r2.<init>()
            r2.setArguments(r3)
            X.0hq r1 = r4.mFragmentManager
            X.Dbc.A0T(r2, r1)
            goto L_0x0c8a
        L_0x0ce7:
            r0 = -713959399(0xffffffffd571d819, float:-1.66194022E13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r15.A01
            com.instagram.nux.fragment.OneTapLoginLandingFragment r4 = (com.instagram.nux.fragment.OneTapLoginLandingFragment) r4
            X.0aP r3 = r4.A00
            java.lang.String r2 = "sso"
            r1 = 0
            X.0qQ.A0B(r3, r1)
            r1 = 0
            X.C49227ErW.A00(r3, r1, r2)
            X.DbT.A15()
            android.os.Bundle r1 = r4.mArguments
            X.E54 r3 = new X.E54
            r3.<init>()
            androidx.fragment.app.FragmentActivity r2 = X.DbU.A0I(r1, r3, r4)
            X.0aP r1 = r4.A00
            X.Dbb.A12(r3, r2, r1)
            r1 = -1333726525(0xffffffffb080f2c3, float:-9.382223E-10)
        L_0x0d14:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FPD.onClick(android.view.View):void");
    }

    public FPD(C47921EMy eMy, int i) {
        this.A00 = i;
        this.A01 = eMy;
    }

    public FPD(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public FPD(C46656Dib dib, int i) {
        this.A00 = i;
        this.A01 = dib;
    }
}

package X;

import android.view.View;

public final class WBB implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public WBB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000c: MOVE  (r1v1 X.X7g) = (r1v0 X.X7g)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static X.C15320UaS A00(X.WBB r2) {
        /*
            java.lang.Object r2 = r2.A01
            X.UaS r2 = (X.C15320UaS) r2
            androidx.fragment.app.FragmentActivity r1 = r2.getActivity()
            boolean r0 = r1 instanceof X.X7g
            if (r0 == 0) goto L_0x0019
            X.X7g r1 = (X.X7g) r1
            if (r1 == 0) goto L_0x0019
            X.UzE r0 = X.C16678UzE.SUMMARY
            java.lang.String r0 = r0.toString()
            r1.Clw(r0)
        L_0x0019:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WBB.A00(X.WBB):X.UaS");
    }

    public static void A01(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new WBB(obj, i), view);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x05d5: MOVE  (r5v25 X.X6R) = (r5v24 X.X6R)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onClick(android.view.View r36) {
        /*
            r35 = this;
            r1 = r35
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0d1c;
                case 1: goto L_0x0ca4;
                case 2: goto L_0x0c5f;
                case 3: goto L_0x1082;
                case 4: goto L_0x0c2d;
                case 5: goto L_0x0beb;
                case 6: goto L_0x0bb9;
                case 7: goto L_0x0b87;
                case 8: goto L_0x0b55;
                case 9: goto L_0x0b0a;
                case 10: goto L_0x02cd;
                case 11: goto L_0x0266;
                case 12: goto L_0x06af;
                case 13: goto L_0x0217;
                case 14: goto L_0x0aee;
                case 15: goto L_0x0665;
                case 16: goto L_0x06ce;
                case 17: goto L_0x0fe2;
                case 18: goto L_0x0f99;
                case 19: goto L_0x019c;
                case 20: goto L_0x05e6;
                case 21: goto L_0x05af;
                case 22: goto L_0x0e48;
                case 23: goto L_0x0ad0;
                case 24: goto L_0x0ab2;
                case 25: goto L_0x0a94;
                case 26: goto L_0x0586;
                case 27: goto L_0x0a72;
                case 28: goto L_0x0a49;
                case 29: goto L_0x0a20;
                case 30: goto L_0x0a02;
                case 31: goto L_0x0155;
                case 32: goto L_0x054c;
                case 33: goto L_0x052c;
                case 34: goto L_0x012a;
                case 35: goto L_0x04ec;
                case 36: goto L_0x04ba;
                case 37: goto L_0x045c;
                case 38: goto L_0x0426;
                case 39: goto L_0x03fe;
                case 40: goto L_0x09e2;
                case 41: goto L_0x09c2;
                case 42: goto L_0x09a2;
                case 43: goto L_0x0982;
                case 44: goto L_0x0962;
                case 45: goto L_0x092f;
                case 46: goto L_0x0f2f;
                case 47: goto L_0x08fc;
                case 48: goto L_0x08cb;
                case 49: goto L_0x0892;
                case 50: goto L_0x085a;
                case 51: goto L_0x0822;
                case 52: goto L_0x03eb;
                case 53: goto L_0x0f10;
                case 54: goto L_0x0ef1;
                case 55: goto L_0x03d0;
                case 56: goto L_0x0793;
                case 57: goto L_0x075f;
                case 58: goto L_0x00d3;
                case 59: goto L_0x0e19;
                case 60: goto L_0x00a1;
                case 61: goto L_0x0ed0;
                case 62: goto L_0x0073;
                case 63: goto L_0x0e03;
                case 64: goto L_0x0da7;
                case 65: goto L_0x0392;
                case 66: goto L_0x004e;
                case 67: goto L_0x0333;
                case 68: goto L_0x0eb2;
                case 69: goto L_0x0e80;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = -1477571178(0xffffffffa7ee0d96, float:-6.6073E-15)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UaS r3 = (X.C15320UaS) r3
            X.WGU r2 = r3.A0B
            java.lang.String r9 = "promoteData"
            if (r2 == 0) goto L_0x0027
            X.UzE r1 = X.C16678UzE.SUMMARY
            com.instagram.business.promote.model.PromoteData r0 = r3.A0F
            if (r0 == 0) goto L_0x06e7
            boolean r0 = r0.A2r
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A0C(r1, r0)
        L_0x0027:
            com.instagram.business.promote.model.PromoteData r0 = r3.A0F
            if (r0 == 0) goto L_0x06e7
            java.util.List r0 = r0.A1v
            java.lang.Object r2 = X.AnonymousClass7TE.A13(r0)
            java.lang.String r2 = (java.lang.String) r2
            android.content.res.Resources r1 = X.DbV.A05(r3)
            r0 = 2131970643(0x7f134a53, float:1.9578243E38)
            java.lang.String r1 = r1.getString(r0)
            com.instagram.business.promote.model.PromoteData r0 = r3.A0F
            if (r0 == 0) goto L_0x06e7
            com.instagram.common.typedurl.ImageUrl r0 = r0.A11
            X.C15320UaS.A05(r3, r0, r2, r1)
            r0 = -486530898(0xffffffffe30020ae, float:-2.363538E21)
        L_0x004a:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x004e:
            r0 = 1754504727(0x68939e17, float:5.576833E24)
            int r3 = X.AnonymousClass0fD.A05(r0)
            X.Vl8 r2 = X.C13990Tnq.A0N()
            X.UzE r0 = X.C16678UzE.SUMMARY
            X.UaQ r2 = r2.A02(r0)
            java.lang.Object r0 = r1.A01
            X.UaS r0 = (X.C15320UaS) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            com.instagram.common.session.UserSession r0 = r0.A0H
            if (r0 == 0) goto L_0x03cc
            X.DbY.A14(r2, r1, r0)
            r0 = -1316320970(0xffffffffb18a8936, float:-4.0319277E-9)
            goto L_0x0f7a
        L_0x0073:
            r0 = 730498003(0x2b8a83d3, float:9.842078E-13)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.UZc r4 = (X.C15274UZc) r4
            X.WGU r2 = r4.A06
            if (r2 == 0) goto L_0x0126
            X.UzE r1 = r4.A05
            if (r1 == 0) goto L_0x00cf
            java.lang.String r0 = "whatsapp_linking_row"
            r2.A0F(r1, r0)
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            X.0eM r0 = r4.A0J
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r1 = r4.A0I
            java.lang.String r0 = "whatsapp_linking_in_promotion_flow"
            X.AnonymousClass9F0.A03(r3, r4, r2, r1, r0)
            r0 = 154533005(0x935fc8d, float:2.1905831E-33)
            goto L_0x1142
        L_0x00a1:
            r0 = 2000878116(0x7742fa24, float:3.9546056E33)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.UZc r4 = (X.C15274UZc) r4
            X.WGU r2 = r4.A06
            if (r2 == 0) goto L_0x0126
            X.UzE r1 = r4.A05
            if (r1 == 0) goto L_0x00cf
            java.lang.String r0 = "edit_whatsapp_button_in_messaging_setup"
            r2.A0F(r1, r0)
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            X.0eM r0 = r4.A0J
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r1 = r4.A0I
            java.lang.String r0 = "whatsapp_linking_in_promotion_flow"
            X.AnonymousClass9F0.A03(r3, r4, r2, r1, r0)
            r0 = 1944627597(0x73e8a98d, float:3.6866814E31)
            goto L_0x1142
        L_0x00cf:
            java.lang.String r9 = "currentStep"
            goto L_0x06e7
        L_0x00d3:
            r0 = 985096403(0x3ab760d3, float:0.0013990648)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.UaW r6 = (X.C15324UaW) r6
            X.WGU r2 = r6.A07
            if (r2 == 0) goto L_0x0126
            X.UzE r1 = X.C16678UzE.MANAGE_LEAD_ADS
            java.lang.String r0 = "create_lead_form_button"
            r2.A0F(r1, r0)
            X.WYX r3 = r6.A06
            if (r3 != 0) goto L_0x00f1
            java.lang.String r9 = "leadAdsLogger"
            goto L_0x06e7
        L_0x00f1:
            java.lang.Long r2 = r6.A0B
            java.lang.String r1 = "lead_gen_manage_lead_forms"
            java.lang.String r0 = "create_new_form"
            X.WYX.A01(r3, r2, r1, r0)
            X.C13990Tnq.A0h()
            r4 = 0
            X.Umg r3 = new X.Umg
            r3.<init>()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r1 = "lead_gen_flow_name"
            java.lang.String r0 = "lead_gen_create_form"
            r2.putString(r1, r0)
            java.lang.String r0 = "lead_gen_cta_flow_backstack_name"
            r2.putString(r0, r4)
            androidx.fragment.app.FragmentActivity r1 = X.DbU.A0I(r2, r3, r6)
            com.instagram.business.promote.model.PromoteData r0 = r6.A09
            if (r0 == 0) goto L_0x06ef
            com.instagram.common.session.UserSession r0 = r0.A0y
            X.DbY.A14(r3, r1, r0)
            r0 = -202687964(0xfffffffff3eb3a24, float:-3.7273224E31)
            goto L_0x1142
        L_0x0126:
            java.lang.String r9 = "promoteLogger"
            goto L_0x06e7
        L_0x012a:
            r0 = -1101228857(0xffffffffbe5c94c7, float:-0.21541129)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.UbX r4 = (X.C15379UbX) r4
            X.WGU r2 = r4.A02
            if (r2 == 0) goto L_0x0140
            X.UzE r1 = X.C16678UzE.EDUCATION_DESTINATION
            java.lang.String r0 = "education_destination_profile"
            r2.A0F(r1, r0)
        L_0x0140:
            com.instagram.business.promote.model.PromoteState r2 = r4.A06
            if (r2 == 0) goto L_0x06f2
            com.instagram.business.promote.model.PromoteData r1 = r4.A05
            if (r1 == 0) goto L_0x06ef
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.PROFILE_VISITS
            r2.A04(r0, r1)
            X.C13992Tns.A0e(r4)
            r0 = 1090684740(0x41028744, float:8.158024)
            goto L_0x0f7a
        L_0x0155:
            r0 = -2054508464(0xffffffff858ab050, float:-1.3042225E-35)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.UbX r4 = (X.C15379UbX) r4
            com.instagram.business.promote.model.PromoteData r1 = r4.A05
            java.lang.String r9 = "promoteData"
            if (r1 == 0) goto L_0x06e7
            boolean r0 = r1.A2B
            java.lang.String r3 = "promoteState"
            if (r0 != 0) goto L_0x0177
            com.instagram.business.promote.model.PromoteState r0 = r4.A06
            if (r0 == 0) goto L_0x0197
            r0 = 1
            r1.A2B = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r4.A09 = r0
        L_0x0177:
            X.WGU r2 = r4.A02
            if (r2 == 0) goto L_0x0182
            X.UzE r1 = X.C16678UzE.EDUCATION_DESTINATION
            java.lang.String r0 = "education_destination_direct"
            r2.A0F(r1, r0)
        L_0x0182:
            com.instagram.business.promote.model.PromoteState r2 = r4.A06
            if (r2 == 0) goto L_0x0197
            com.instagram.business.promote.model.PromoteData r1 = r4.A05
            if (r1 == 0) goto L_0x06e7
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.DIRECT_MESSAGE
            r2.A04(r0, r1)
            X.C13992Tns.A0e(r4)
            r0 = 562811914(0x218bd40a, float:9.475133E-19)
            goto L_0x1142
        L_0x0197:
            X.0qQ.A0F(r3)
            goto L_0x06ea
        L_0x019c:
            r0 = 505650002(0x1e239b52, float:8.661268E-21)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.UaT r6 = (X.C15321UaT) r6
            X.WGU r2 = r6.A06
            if (r2 == 0) goto L_0x01b2
            X.UzE r1 = X.C16678UzE.OBJECTIVE
            java.lang.String r0 = "call_center_bottom_banner"
            r2.A0F(r1, r0)
        L_0x01b2:
            X.0eM r7 = r6.A0K
            X.0lg r2 = X.DbY.A0R(r7)
            r0 = 20
            X.WxQ r1 = new X.WxQ
            r1.<init>(r2, r0)
            java.lang.Class<X.VMU> r0 = X.VMU.class
            java.lang.Object r11 = r2.A01(r0, r1)
            X.VMU r11 = (X.VMU) r11
            X.UGT r10 = new X.UGT
            r10.<init>()
            java.lang.String r1 = "banner"
            java.lang.String r0 = "event_target"
            r10.A06(r0, r1)
            java.lang.String r1 = "IG_APP"
            java.lang.String r0 = "surface"
            r10.A06(r0, r1)
            java.lang.String r9 = "IG_BOOST"
            java.lang.String r8 = "entry_point"
            r10.A06(r8, r9)
            java.lang.String r4 = "ig_boost"
            java.lang.String r3 = "lead_source"
            r10.A06(r3, r4)
            com.instagram.business.promote.model.PromoteData r0 = r6.A0A
            r1 = 0
            if (r0 == 0) goto L_0x06ef
            com.instagram.api.schemas.DEPProgramLevelContentResponse r0 = r0.A0R
            if (r0 == 0) goto L_0x01f5
            java.lang.String r2 = r0.A01
            if (r2 != 0) goto L_0x01f7
        L_0x01f5:
            java.lang.String r2 = ""
        L_0x01f7:
            java.util.Locale r0 = java.util.Locale.ROOT
            X.0qQ.A08(r0)
            java.lang.String r15 = X.Pxf.A0n(r0, r2)
            X.V1O[] r14 = X.V1O.values()
            r13 = 0
            int r2 = r14.length
        L_0x0206:
            if (r13 >= r2) goto L_0x0d2f
            r12 = r14[r13]
            java.lang.String r0 = r12.name()
            boolean r0 = X.0qQ.A0K(r0, r15)
            if (r0 != 0) goto L_0x0d30
            int r13 = r13 + 1
            goto L_0x0206
        L_0x0217:
            r0 = 1844024600(0x6de99518, float:9.0362813E27)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.UZp r4 = (X.C15285UZp) r4
            X.WGU r2 = r4.A04
            if (r2 == 0) goto L_0x06ac
            X.UzE r1 = X.C16678UzE.LOCATIONS_SELECTION
            java.lang.String r0 = "address_search_bar"
            r2.A0F(r1, r0)
            X.C13990Tnq.A0h()
            com.instagram.business.promote.model.PromoteData r0 = r4.A05
            java.lang.String r9 = "promoteData"
            if (r0 == 0) goto L_0x06e7
            com.instagram.common.session.UserSession r0 = r0.A0y
            X.0qQ.A06(r0)
            r3 = 0
            X.UZN r2 = new X.UZN
            r2.<init>()
            java.lang.String r1 = r0.A05
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            X.DbZ.A1B(r2, r0, r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.business.promote.fragment.PromoteSearchAddressFragment"
            X.0qQ.A0C(r2, r0)
            X.X3O r0 = r4.A0E
            X.0qQ.A0B(r0, r3)
            r2.A05 = r0
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            com.instagram.business.promote.model.PromoteData r0 = r4.A05
            if (r0 == 0) goto L_0x06e7
            com.instagram.common.session.UserSession r0 = r0.A0y
            X.DbY.A14(r2, r1, r0)
            r0 = -1341600641(0xffffffffb008cc7f, float:-4.976712E-10)
            goto L_0x1142
        L_0x0266:
            r0 = -247840012(0xfffffffff13a42f4, float:-9.2232245E29)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.UZV r5 = (X.UZV) r5
            X.0eM r0 = r5.A0D
            X.WGU r1 = X.C13990Tnq.A0M(r0)
            X.UzE r4 = X.C16678UzE.INTERESTS_SELECTION
            java.lang.String r0 = "done_button"
            r1.A0F(r4, r0)
            X.UAD r0 = r5.A06
            java.lang.String r6 = "selectedAndSuggestedInterestsAdapter"
            if (r0 == 0) goto L_0x02f5
            java.util.List r0 = r0.A08
            com.google.common.collect.ImmutableList r13 = X.DbU.A0K(r0)
            X.0eM r0 = r5.A0F
            java.lang.Object r0 = r0.getValue()
            X.U92 r0 = (X.U92) r0
            X.LAF r0 = r0.A02
            X.05G r2 = r0.A01
        L_0x0296:
            java.lang.Object r1 = r2.getValue()
            r9 = r1
            X.ULv r9 = (X.C15053ULv) r9
            r7 = 0
            r14 = 0
            r16 = 959(0x3bf, float:1.344E-42)
            r8 = r7
            r10 = r7
            r11 = r7
            r12 = r7
            r15 = r14
            r17 = r14
            X.ULv r0 = X.C15053ULv.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0296
            X.UAD r0 = r5.A06
            if (r0 == 0) goto L_0x02f5
            com.instagram.common.session.UserSession r0 = r0.A03
            X.WGU r0 = X.WGU.A00(r0)
            r0.A0A(r4)
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            if (r0 == 0) goto L_0x0dbd
            r0.onBackPressed()
            r0 = 551252332(0x20db716c, float:3.71751E-19)
            goto L_0x0f7a
        L_0x02cd:
            r0 = 1194447997(0x4731d47d, float:45524.49)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UZW r3 = (X.UZW) r3
            X.WGU r4 = r3.A04
            if (r4 == 0) goto L_0x02e3
            X.UzE r1 = X.C16678UzE.INTERESTS_SELECTION
            java.lang.String r0 = "done_button"
            r4.A0F(r1, r0)
        L_0x02e3:
            X.UAI r0 = r3.A06
            java.lang.String r6 = "selectedAndSuggestedInterestsAdapter"
            if (r0 == 0) goto L_0x02f5
            java.util.List r0 = r0.A06
            com.google.common.collect.ImmutableList r5 = X.DbU.A0K(r0)
            com.instagram.business.promote.model.PromoteState r4 = r3.A09
            if (r4 != 0) goto L_0x02fa
            java.lang.String r6 = "promoteState"
        L_0x02f5:
            X.0qQ.A0F(r6)
            goto L_0x06ea
        L_0x02fa:
            com.instagram.business.promote.model.PromoteData r1 = r3.A08
            if (r1 != 0) goto L_0x0301
            java.lang.String r6 = "promoteData"
            goto L_0x02f5
        L_0x0301:
            X.VuU r0 = X.C18167Vmh.A01(r1)
            r0.A08 = r5
            X.C18578VuU.A00(r0, r1, r4)
            X.UAI r4 = r3.A06
            if (r4 == 0) goto L_0x02f5
            java.util.List r1 = r4.A04
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x0dc8
            java.util.List r0 = r4.A06
            java.util.ArrayList r13 = X.UAI.A00(r0)
            java.util.ArrayList r14 = X.UAI.A00(r1)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r1 = r13.iterator()
        L_0x0329:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0dd6
            X.C13991Tnr.A1M(r14, r15, r1)
            goto L_0x0329
        L_0x0333:
            r0 = 2007790920(0x77ac7548, float:6.995733E33)
            int r4 = X.AnonymousClass0fD.A05(r0)
            X.UaS r7 = A00(r1)
            X.WGU r9 = r7.A0B
            if (r9 == 0) goto L_0x036f
            X.UzE r8 = X.C16678UzE.SUMMARY
            boolean r6 = r7.A0M
            java.lang.String r5 = "edit_budget_duration"
            X.0wc r1 = r9.A05
            java.lang.String r0 = "promoted_posts_tap_component"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x036f
            X.UGQ r2 = new X.UGQ
            r2.<init>()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.String r0 = "is_review_budget_warning_icon_visible"
            r2.A03(r0, r1)
            java.lang.String r0 = "component"
            r3.AAJ(r0, r5)
            X.C13990Tnq.A10(r3, r9, r8)
            X.C13988Tno.A18(r3, r2)
        L_0x036f:
            com.instagram.business.promote.model.PromoteState r0 = r7.A0G
            if (r0 == 0) goto L_0x06f2
            com.instagram.business.promote.model.PromoteData r0 = r7.A0F
            if (r0 == 0) goto L_0x06ef
            com.instagram.business.promote.model.PromoteState.A00(r0)
            X.C13990Tnq.A0h()
            X.UaV r2 = new X.UaV
            r2.<init>()
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            com.instagram.common.session.UserSession r0 = r7.A0H
            if (r0 == 0) goto L_0x03cc
            X.DbY.A14(r2, r1, r0)
            r0 = -84725873(0xfffffffffaf32f8f, float:-6.3134637E35)
            goto L_0x004a
        L_0x0392:
            r0 = 1675763055(0x63e21d6f, float:8.34217E21)
            int r4 = X.AnonymousClass0fD.A05(r0)
            X.UaS r3 = A00(r1)
            X.WGU r2 = r3.A0B
            if (r2 == 0) goto L_0x03a8
            X.UzE r1 = X.C16678UzE.SUMMARY
            java.lang.String r0 = "edit_audience"
            r2.A0F(r1, r0)
        L_0x03a8:
            com.instagram.business.promote.model.PromoteState r0 = r3.A0G
            if (r0 == 0) goto L_0x06f2
            com.instagram.business.promote.model.PromoteData r0 = r3.A0F
            if (r0 == 0) goto L_0x06ef
            com.instagram.business.promote.model.PromoteState.A00(r0)
            X.Vl8 r1 = X.C13990Tnq.A0N()
            r0 = 0
            X.UaU r2 = r1.A03(r0)
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            com.instagram.common.session.UserSession r0 = r3.A0H
            if (r0 == 0) goto L_0x03cc
            X.DbY.A14(r2, r1, r0)
            r0 = -1199205223(0xffffffffb8859499, float:-6.369613E-5)
            goto L_0x004a
        L_0x03cc:
            java.lang.String r9 = "userSession"
            goto L_0x06e7
        L_0x03d0:
            r0 = 1499829747(0x596595f3, float:4.03891504E15)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.UZN r0 = (X.UZN) r0
            X.WGU r2 = r0.A02
            if (r2 == 0) goto L_0x06ac
            X.UzE r1 = X.C16678UzE.LOCATIONS_SELECTION
            java.lang.String r0 = "address_search_bar_input"
            r2.A0F(r1, r0)
            r0 = -2112415374(0xffffffff82171972, float:-1.110103E-37)
            goto L_0x004a
        L_0x03eb:
            r0 = -463819560(0xffffffffe45aacd8, float:-1.613538E22)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.DbX.A1J(r0)
            r0 = -1353839(0xffffffffffeb5791, float:NaN)
            goto L_0x004a
        L_0x03fe:
            r0 = 1147343734(0x44631376, float:908.3041)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UZM r3 = (X.UZM) r3
            X.UzE r2 = r3.A00
            if (r2 == 0) goto L_0x041e
            X.0eM r0 = r3.A06
            X.WGU r1 = X.C13990Tnq.A0M(r0)
            X.0eM r0 = r3.A05
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            com.instagram.business.promote.model.PromoteData r0 = (com.instagram.business.promote.model.PromoteData) r0
            r1.A0B(r2, r0)
        L_0x041e:
            X.DbT.A1J(r3)
            r0 = -1322628597(0xffffffffb12a4a0b, float:-2.4780344E-9)
            goto L_0x004a
        L_0x0426:
            r0 = -1611306240(0xffffffff9ff56b00, float:-1.0393855E-19)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.UZd r5 = (X.C15275UZd) r5
            androidx.fragment.app.FragmentActivity r3 = r5.getActivity()
            if (r3 == 0) goto L_0x0457
            X.0eM r0 = r5.A0G
            X.WGU r2 = X.C13990Tnq.A0M(r0)
            X.UzE r1 = X.C16678UzE.ERROR
            java.lang.String r0 = "meta_status_learn_more_link"
            r2.A0F(r1, r0)
            com.instagram.common.session.UserSession r2 = X.C15275UZd.A03(r5)
            X.2EG r1 = X.2EG.A34
            java.lang.String r0 = "https://metastatus.com/ig-boost"
            X.SUL r1 = X.Dba.A0J(r3, r2, r1, r0)
            java.lang.String r0 = "promote_error"
            r1.A0S = r0
            r1.A0A()
        L_0x0457:
            r0 = 1520079531(0x5a9a92ab, float:2.17542048E16)
            goto L_0x004a
        L_0x045c:
            r0 = -1019494695(0xffffffffc33bbed9, float:-187.7455)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.UZd r5 = (X.C15275UZd) r5
            androidx.fragment.app.FragmentActivity r3 = r5.getActivity()
            if (r3 == 0) goto L_0x04a9
            X.0eM r0 = r5.A0G
            X.WGU r2 = X.C13990Tnq.A0M(r0)
            X.UzE r1 = X.C16678UzE.ERROR
            java.lang.String r0 = "error_page_learn_more"
            r2.A0F(r1, r0)
            com.instagram.common.session.UserSession r2 = X.C15275UZd.A03(r5)
            com.instagram.api.schemas.ErrorIdentifier r0 = r5.A05
            if (r0 != 0) goto L_0x0486
            java.lang.String r9 = "errorIdentifier"
            goto L_0x06e7
        L_0x0486:
            int r1 = r0.ordinal()
            r0 = 47
            if (r1 == r0) goto L_0x04b7
            r0 = 56
            if (r1 == r0) goto L_0x04b4
            r0 = 61
            if (r1 == r0) goto L_0x04b1
            r0 = 64
            if (r1 == r0) goto L_0x04ae
            java.lang.String r1 = "https://www.facebook.com/help/instagram/186452768798716"
        L_0x049c:
            X.2EG r0 = X.2EG.A34
            X.SUL r1 = X.Dba.A0J(r3, r2, r0, r1)
            java.lang.String r0 = "promote_error"
            r1.A0S = r0
            r1.A0A()
        L_0x04a9:
            r0 = -520975926(0xffffffffe0f289ca, float:-1.39813775E20)
            goto L_0x004a
        L_0x04ae:
            java.lang.String r1 = "https://www.facebook.com/help/187316341316631"
            goto L_0x049c
        L_0x04b1:
            java.lang.String r1 = "https://www.facebook.com/business/help/155909647811305"
            goto L_0x049c
        L_0x04b4:
            java.lang.String r1 = "https://www.facebook.com/help/148233965247823"
            goto L_0x049c
        L_0x04b7:
            java.lang.String r1 = "https://www.facebook.com/business/help/150420221693110"
            goto L_0x049c
        L_0x04ba:
            r0 = -849637859(0xffffffffcd5b8e1d, float:-2.3022024E8)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UZd r3 = (X.C15275UZd) r3
            X.0hq r0 = r3.mFragmentManager
            if (r0 == 0) goto L_0x04e4
            int r0 = r0.A0M()
            if (r0 != 0) goto L_0x04e4
            com.instagram.business.promote.model.PromoteData r0 = X.C15275UZd.A01(r3)
            boolean r0 = r0.A2t
            if (r0 != 0) goto L_0x04e4
            X.0eM r0 = r3.A0G
            X.WGU r2 = X.C13990Tnq.A0M(r0)
            X.UzE r1 = X.C16678UzE.PROMOTE_PREVALIDATION_ERROR
            java.lang.String r0 = "cancel_button"
            r2.A0F(r1, r0)
        L_0x04e4:
            X.DbT.A1J(r3)
            r0 = 532427597(0x1fbc334d, float:7.970597E-20)
            goto L_0x004a
        L_0x04ec:
            r0 = -1975488516(0xffffffff8a406ffc, float:-9.265526E-33)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UbX r3 = (X.C15379UbX) r3
            X.WGU r2 = r3.A02
            if (r2 == 0) goto L_0x0502
            X.UzE r1 = X.C16678UzE.EDUCATION_DESTINATION
            java.lang.String r0 = "education_destination_website"
            r2.A0F(r1, r0)
        L_0x0502:
            com.instagram.business.promote.model.PromoteData r2 = r3.A05
            java.lang.String r9 = "promoteData"
            if (r2 == 0) goto L_0x06e7
            java.lang.String r0 = r2.A1I
            if (r0 == 0) goto L_0x0527
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0527
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = r2.A0b
            if (r0 == 0) goto L_0x0527
            com.instagram.business.promote.model.PromoteState r1 = r3.A06
            if (r1 == 0) goto L_0x06f2
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.WEBSITE_CLICK
            r1.A04(r0, r2)
        L_0x051f:
            X.C13992Tns.A0e(r3)
            r0 = -813651708(0xffffffffcf80a904, float:-4.3171205E9)
            goto L_0x004a
        L_0x0527:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r3.A09 = r0
            goto L_0x051f
        L_0x052c:
            r0 = 1682281765(0x64459525, float:1.4579022E22)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UbX r3 = (X.C15379UbX) r3
            com.instagram.business.promote.model.PromoteState r2 = r3.A06
            if (r2 == 0) goto L_0x06f2
            com.instagram.business.promote.model.PromoteData r1 = r3.A05
            if (r1 == 0) goto L_0x06ef
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.POST_ENGAGEMENT
            r2.A04(r0, r1)
            X.C13992Tns.A0e(r3)
            r0 = 569563960(0x21f2db38, float:1.6456585E-18)
            goto L_0x004a
        L_0x054c:
            r0 = 1046766506(0x3e6463aa, float:0.22303644)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UbX r3 = (X.C15379UbX) r3
            X.WGU r2 = r3.A02
            if (r2 == 0) goto L_0x0562
            X.UzE r1 = X.C16678UzE.EDUCATION_DESTINATION
            java.lang.String r0 = "education_destination_lead_gen"
            r2.A0F(r1, r0)
        L_0x0562:
            com.instagram.business.promote.model.PromoteData r2 = r3.A05
            java.lang.String r9 = "promoteData"
            if (r2 == 0) goto L_0x06e7
            com.instagram.leadgen.core.api.LeadForm r0 = r2.A16
            if (r0 == 0) goto L_0x0581
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = r2.A0d
            if (r0 == 0) goto L_0x0581
            com.instagram.business.promote.model.PromoteState r1 = r3.A06
            if (r1 == 0) goto L_0x06f2
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.LEAD_GENERATION
            r1.A04(r0, r2)
        L_0x0579:
            X.C13992Tns.A0e(r3)
            r0 = -1925295419(0xffffffff8d3e52c5, float:-5.86479E-31)
            goto L_0x004a
        L_0x0581:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r3.A09 = r0
            goto L_0x0579
        L_0x0586:
            r0 = 1996375321(0x76fe4519, float:2.5786033E33)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UbX r3 = (X.C15379UbX) r3
            X.WGU r2 = r3.A02
            if (r2 == 0) goto L_0x059c
            X.UzE r1 = X.C16678UzE.EDUCATION_AUDIENCE
            java.lang.String r0 = "education_audience_automatic"
            r2.A0F(r1, r0)
        L_0x059c:
            com.instagram.business.promote.model.PromoteState r1 = r3.A06
            if (r1 == 0) goto L_0x06f2
            com.instagram.business.promote.model.PromoteData r0 = r3.A05
            if (r0 == 0) goto L_0x06ef
            X.C13990Tnq.A1H(r0, r1)
            X.C13992Tns.A0e(r3)
            r0 = 193011618(0xb811fa2, float:4.973659E-32)
            goto L_0x004a
        L_0x05af:
            r0 = -346877039(0xffffffffeb531391, float:-2.5517575E26)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UaT r3 = (X.C15321UaT) r3
            com.instagram.business.promote.model.PromoteData r0 = r3.A0A
            if (r0 == 0) goto L_0x06ef
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r0.A0i
            if (r0 == 0) goto L_0x05e1
            X.WGU r2 = r3.A06
            if (r2 == 0) goto L_0x05cd
            X.UzE r1 = X.C16678UzE.OBJECTIVE
            java.lang.String r0 = "destination_ads_preview_thumbnail"
            r2.A0F(r1, r0)
        L_0x05cd:
            androidx.fragment.app.FragmentActivity r5 = r3.getActivity()
            boolean r0 = r5 instanceof X.X6R
            if (r0 == 0) goto L_0x05e1
            X.X6R r5 = (X.X6R) r5
            if (r5 == 0) goto L_0x05e1
            r9 = 0
            r6 = 0
            r7 = r6
            r8 = r6
            r10 = r9
            r5.CpG(r6, r7, r8, r9, r10)
        L_0x05e1:
            r0 = -620602814(0xffffffffdb025a42, float:-3.6690986E16)
            goto L_0x004a
        L_0x05e6:
            r0 = 446569904(0x1a9e1db0, float:6.539523E-23)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.UaT r5 = (X.C15321UaT) r5
            X.WGU r11 = r5.A06
            java.lang.String r9 = "promoteData"
            if (r11 == 0) goto L_0x0609
            X.UzE r10 = X.C16678UzE.OBJECTIVE
            com.instagram.business.promote.model.PromoteData r0 = r5.A0A
            if (r0 == 0) goto L_0x06e7
            X.UyC r13 = r0.A12
            java.lang.String r17 = "multi_boost_banner_ad_tools_link"
            r12 = 0
            r14 = r12
            r15 = r12
            r16 = r12
            X.WGU.A02(r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x0609:
            X.0eM r8 = r5.A0K
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r8)
            X.VwK r7 = X.VA1.A00(r0)
            X.UzE r0 = X.C16678UzE.OBJECTIVE
            java.lang.String r6 = r0.toString()
            com.instagram.business.promote.model.PromoteData r0 = r5.A0A
            if (r0 == 0) goto L_0x06e7
            java.lang.String r3 = r0.A1S
            java.lang.String r2 = "multi_boost"
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.0wc r1 = r7.A00
            java.lang.String r0 = "ads_manager_enter"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "step"
            X.C13989Tnp.A1F(r1, r7, r0, r6)
            X.DbS.A1N(r1, r2)
            if (r3 == 0) goto L_0x063a
            X.C51965G9l.A1I(r1, r3)
        L_0x063a:
            r1.Cgf()
            X.Vl8 r2 = X.C13990Tnq.A0N()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r8)
            com.instagram.business.promote.model.PromoteData r0 = r5.A0A
            r3 = 0
            if (r0 == 0) goto L_0x06e7
            java.lang.String r0 = r0.A1K
            X.0qQ.A06(r0)
            X.Uac r2 = r2.A01(r1, r0, r3)
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            com.instagram.business.promote.model.PromoteData r0 = r5.A0A
            if (r0 == 0) goto L_0x06e7
            com.instagram.common.session.UserSession r0 = r0.A0y
            X.Dbb.A0o(r3, r2, r1, r0)
            r0 = 337083169(0x14177b21, float:7.647835E-27)
            goto L_0x004a
        L_0x0665:
            r0 = -1888216909(0xffffffff8f7418b3, float:-1.2034886E-29)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.UYz r6 = (X.UYz) r6
            X.WGU r2 = r6.A04
            if (r2 == 0) goto L_0x06ac
            X.UzE r1 = X.C16678UzE.LOCATIONS_SELECTION
            java.lang.String r0 = "address_search_bar"
            r2.A0F(r1, r0)
            X.C13990Tnq.A0h()
            X.0eM r5 = r6.A0C
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            r3 = 0
            X.0qQ.A0B(r0, r3)
            X.UZN r2 = new X.UZN
            r2.<init>()
            java.lang.String r1 = r0.A05
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            X.DbZ.A1B(r2, r0, r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.business.promote.fragment.PromoteSearchAddressFragment"
            X.0qQ.A0C(r2, r0)
            X.X3O r0 = r6.A0B
            X.0qQ.A0B(r0, r3)
            r2.A05 = r0
            androidx.fragment.app.FragmentActivity r0 = r6.requireActivity()
            X.Dbc.A0S(r2, r0, r5)
            r0 = 1240555780(0x49f16104, float:1977376.5)
            goto L_0x004a
        L_0x06ac:
            java.lang.String r9 = "logger"
            goto L_0x06e7
        L_0x06af:
            r0 = -1721760315(0xffffffff996005c5, float:-1.1581694E-23)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.UZp r2 = (X.C15285UZp) r2
            com.instagram.business.promote.model.PromoteData r0 = r2.A05
            r1 = 0
            if (r0 == 0) goto L_0x06ef
            com.instagram.business.promote.model.PendingLocation r0 = r0.A0o
            r0.A02 = r1
            X.C15285UZp.A03(r2)
            X.C15285UZp.A02(r2)
            r0 = 530418821(0x1f9d8c85, float:6.6724556E-20)
            goto L_0x004a
        L_0x06ce:
            r0 = 2003119991(0x77652f77, float:4.6484324E33)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UZe r3 = (X.C15276UZe) r3
            com.instagram.business.promote.model.PromoteState r9 = r3.A02
            if (r9 == 0) goto L_0x06f2
            com.instagram.business.promote.model.PromoteData r8 = r3.A01
            if (r8 == 0) goto L_0x06ef
            android.widget.NumberPicker r0 = r3.A00
            if (r0 != 0) goto L_0x06f5
            java.lang.String r9 = "agePicker"
        L_0x06e7:
            X.0qQ.A0F(r9)
        L_0x06ea:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x06ef:
            java.lang.String r9 = "promoteData"
            goto L_0x06e7
        L_0x06f2:
            java.lang.String r9 = "promoteState"
            goto L_0x06e7
        L_0x06f5:
            int r7 = r0.getValue()
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r8.A0q
            int r6 = r0.A01
            com.instagram.api.schemas.AdvantageAudienceData r10 = r0.A02
            if (r10 == 0) goto L_0x0738
            r10.Aa9()
            r10.BT2()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r2 = r10.Aa9()
            boolean r0 = r10 instanceof com.instagram.api.schemas.ImmutablePandoAdvantageAudienceData
            if (r0 == 0) goto L_0x0759
            if (r2 == 0) goto L_0x0757
            java.lang.String r2 = r2.A00
        L_0x0717:
            java.lang.String r0 = "advantage_audience_status"
            X.0eP r1 = new X.0eP
            r1.<init>(r0, r2)
            java.lang.String r0 = "min_age_constraint"
            X.0eP[] r0 = X.JTQ.A1b(r0, r5, r1)
            com.facebook.pando.TreeJNI r1 = X.C41847B3o.A0o(r10, r0)
        L_0x0728:
            com.instagram.api.schemas.AdvantageAudienceData r1 = (com.instagram.api.schemas.AdvantageAudienceData) r1
            X.VuU r0 = X.C18167Vmh.A01(r8)
            r0.A02 = r1
            if (r6 < r7) goto L_0x0733
            r7 = r6
        L_0x0733:
            r0.A01 = r7
            X.C18578VuU.A00(r0, r8, r9)
        L_0x0738:
            X.0eM r0 = r3.A06
            X.WGU r2 = X.C13990Tnq.A0M(r0)
            java.lang.String r0 = r3.A04
            X.UzE r1 = X.C16678UzE.EDIT_AUDIENCE
            boolean r0 = X.Dba.A1X(r1, r0)
            if (r0 != 0) goto L_0x074a
            X.UzE r1 = X.C16678UzE.CREATE_AUDIENCE
        L_0x074a:
            java.lang.String r0 = "minimum_age_constraint_done"
            r2.A0F(r1, r0)
            X.DbT.A1J(r3)
            r0 = 1202130271(0x47a70d5f, float:85530.74)
            goto L_0x004a
        L_0x0757:
            r2 = 0
            goto L_0x0717
        L_0x0759:
            com.instagram.api.schemas.AdvantageAudienceDataImpl r1 = new com.instagram.api.schemas.AdvantageAudienceDataImpl
            r1.<init>(r2, r5)
            goto L_0x0728
        L_0x075f:
            r0 = -1311604156(0xffffffffb1d28244, float:-6.126614E-9)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.Ua7 r5 = (X.C15300Ua7) r5
            X.0eM r0 = r5.A04
            java.lang.Object r0 = r0.getValue()
            X.U8Y r0 = (X.U8Y) r0
            X.WYX r3 = r0.A01
            java.lang.Long r2 = r0.A05
            java.lang.String r1 = "lead_gen_cta_selection"
            java.lang.String r0 = "done"
            X.WYX.A01(r3, r2, r1, r0)
            X.0eM r0 = r5.A03
            java.lang.Object r3 = r0.getValue()
            X.U8w r3 = (X.C14786U8w) r3
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            r1 = 0
            r0 = 0
            r3.A0B(r2, r1, r0)
            r0 = -127884374(0xfffffffff860a3aa, float:-1.8224906E34)
            goto L_0x004a
        L_0x0793:
            r0 = 1362838376(0x513b4368, float:5.0268111E10)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.UbT r0 = (X.C15375UbT) r0
            X.C13992Tns.A0e(r0)
            X.0eM r0 = r0.A04
            java.lang.Object r5 = r0.getValue()
            X.U8l r5 = (X.C14775U8l) r5
            com.instagram.business.promote.model.PromoteData r3 = r5.A00
            java.util.List r7 = r3.A21
            X.0qQ.A06(r7)
            X.00k.A0j(r7)
            r7.clear()
            X.05G r6 = r5.A03
            X.JwC r10 = X.JTO.A0P(r6)
            com.instagram.business.promote.model.SpecialRequirementCategory r1 = com.instagram.business.promote.model.SpecialRequirementCategory.A08
            java.lang.Object r0 = r10.A03
            X.0eP r9 = new X.0eP
            r9.<init>(r1, r0)
            com.instagram.business.promote.model.SpecialRequirementCategory r1 = com.instagram.business.promote.model.SpecialRequirementCategory.A06
            java.lang.Object r0 = r10.A02
            X.0eP r8 = new X.0eP
            r8.<init>(r1, r0)
            com.instagram.business.promote.model.SpecialRequirementCategory r1 = com.instagram.business.promote.model.SpecialRequirementCategory.A05
            java.lang.Object r0 = r10.A01
            X.0eP r2 = new X.0eP
            r2.<init>(r1, r0)
            com.instagram.business.promote.model.SpecialRequirementCategory r1 = com.instagram.business.promote.model.SpecialRequirementCategory.A04
            java.lang.Object r0 = r10.A00
            X.0eP[] r0 = X.AnonymousClass7TH.A0h(r1, r0, r9, r8, r2)
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)
            java.util.Iterator r2 = X.AnonymousClass7TF.A0s(r0)
        L_0x07e7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0803
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r2)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            X.Tnz r0 = (X.C13997Tnz) r0
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x07e7
            r7.add(r1)
            goto L_0x07e7
        L_0x0803:
            X.JwC r0 = X.JTO.A0P(r6)
            java.lang.Object r0 = r0.A03
            X.Tnz r0 = (X.C13997Tnz) r0
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x081f
            com.instagram.business.boost.model.AdCreativeAuthorizationCategory r0 = com.instagram.business.boost.model.AdCreativeAuthorizationCategory.POLITICAL
        L_0x0811:
            r3.A0k = r0
            com.instagram.business.promote.model.PromoteState r1 = r5.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            com.instagram.business.promote.model.PromoteState.A01(r1, r0)
            r0 = -340552966(0xffffffffebb392fa, float:-4.341836E26)
            goto L_0x004a
        L_0x081f:
            com.instagram.business.boost.model.AdCreativeAuthorizationCategory r0 = com.instagram.business.boost.model.AdCreativeAuthorizationCategory.A04
            goto L_0x0811
        L_0x0822:
            r0 = -1119745370(0xffffffffbd420aa6, float:-0.047373436)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.UZM r5 = (X.UZM) r5
            X.0eM r0 = r5.A06
            X.WGU r2 = X.C13990Tnq.A0M(r0)
            X.UzE r1 = X.C16678UzE.EDUCATION_AUDIENCE
            java.lang.String r0 = "education_audience_special_requirements"
            r2.A0F(r1, r0)
            androidx.fragment.app.FragmentActivity r3 = r5.requireActivity()
            X.0eM r0 = r5.A08
            java.lang.Object r2 = X.AnonymousClass7TE.A14(r0)
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.2EG r1 = X.2EG.A34
            java.lang.String r0 = "https://www.facebook.com/business/help/1838453822893854"
            X.SUL r1 = X.Dba.A0J(r3, r2, r1, r0)
            java.lang.String r0 = "promote_native_nux"
            r1.A0S = r0
            r1.A0A()
            r0 = -480628353(0xffffffffe35a317f, float:-4.0249568E21)
            goto L_0x004a
        L_0x085a:
            r0 = 1572008633(0x5db2f2b9, float:1.61182151E18)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.UZM r5 = (X.UZM) r5
            X.0eM r0 = r5.A06
            X.WGU r2 = X.C13990Tnq.A0M(r0)
            X.UzE r1 = X.C16678UzE.EDUCATION_AUDIENCE
            java.lang.String r0 = "education_audience_special_requirements"
            r2.A0F(r1, r0)
            androidx.fragment.app.FragmentActivity r3 = r5.requireActivity()
            X.0eM r0 = r5.A08
            java.lang.Object r2 = X.AnonymousClass7TE.A14(r0)
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.2EG r1 = X.2EG.A34
            java.lang.String r0 = "https://www.facebook.com/business/help/2408667629202904?helpref=search&sr=3&query=special%20ad%20category"
            X.SUL r1 = X.Dba.A0J(r3, r2, r1, r0)
            java.lang.String r0 = "promote_native_nux"
            r1.A0S = r0
            r1.A0A()
            r0 = -272955810(0xffffffffefbb065e, float:-1.1576279E29)
            goto L_0x004a
        L_0x0892:
            r0 = -483957421(0xffffffffe3276553, float:-3.0879074E21)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UZM r3 = (X.UZM) r3
            X.0eM r0 = r3.A06
            X.WGU r2 = X.C13990Tnq.A0M(r0)
            X.UzE r1 = X.C16678UzE.EDUCATION_AUDIENCE
            java.lang.String r0 = "education_audience_manual"
            r2.A0F(r1, r0)
            X.DbT.A1J(r3)
            X.C13990Tnq.A0h()
            X.UZi r2 = new X.UZi
            r2.<init>()
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            X.0eM r0 = r3.A05
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            com.instagram.business.promote.model.PromoteData r0 = (com.instagram.business.promote.model.PromoteData) r0
            com.instagram.common.session.UserSession r0 = r0.A0y
            X.DbY.A14(r2, r1, r0)
            r0 = 1045286648(0x3e4dcef8, float:0.20098484)
            goto L_0x004a
        L_0x08cb:
            r0 = -960072980(0xffffffffc6c672ec, float:-25401.46)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UZM r3 = (X.UZM) r3
            X.0eM r0 = r3.A06
            X.WGU r2 = X.C13990Tnq.A0M(r0)
            X.UzE r1 = X.C16678UzE.EDUCATION_AUDIENCE
            java.lang.String r0 = "education_audience_automatic"
            r2.A0F(r1, r0)
            X.0eM r0 = r3.A07
            com.instagram.business.promote.model.PromoteState r1 = X.C13990Tnq.A0O(r0)
            X.0eM r0 = r3.A05
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            com.instagram.business.promote.model.PromoteData r0 = (com.instagram.business.promote.model.PromoteData) r0
            X.C13990Tnq.A1H(r0, r1)
            X.DbT.A1J(r3)
            r0 = 129876510(0x7bdc21e, float:2.8551651E-34)
            goto L_0x004a
        L_0x08fc:
            r0 = -65446690(0xfffffffffc195cde, float:-3.18522E36)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UZM r3 = (X.UZM) r3
            X.0eM r0 = r3.A06
            X.WGU r2 = X.C13990Tnq.A0M(r0)
            X.UzE r1 = X.C16678UzE.EDUCATION_DESTINATION
            java.lang.String r0 = "education_destination_direct"
            r2.A0F(r1, r0)
            X.0eM r0 = r3.A07
            com.instagram.business.promote.model.PromoteState r2 = X.C13990Tnq.A0O(r0)
            X.0eM r0 = r3.A05
            java.lang.Object r1 = X.AnonymousClass7TE.A14(r0)
            com.instagram.business.promote.model.PromoteData r1 = (com.instagram.business.promote.model.PromoteData) r1
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.DIRECT_MESSAGE
            r2.A04(r0, r1)
            X.DbT.A1J(r3)
            r0 = 565491765(0x21b4b835, float:1.2246034E-18)
            goto L_0x004a
        L_0x092f:
            r0 = 118334059(0x70da26b, float:1.0655391E-34)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UZM r3 = (X.UZM) r3
            X.0eM r0 = r3.A06
            X.WGU r2 = X.C13990Tnq.A0M(r0)
            X.UzE r1 = X.C16678UzE.EDUCATION_DESTINATION
            java.lang.String r0 = "education_destination_profile"
            r2.A0F(r1, r0)
            X.0eM r0 = r3.A07
            com.instagram.business.promote.model.PromoteState r2 = X.C13990Tnq.A0O(r0)
            X.0eM r0 = r3.A05
            java.lang.Object r1 = X.AnonymousClass7TE.A14(r0)
            com.instagram.business.promote.model.PromoteData r1 = (com.instagram.business.promote.model.PromoteData) r1
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.PROFILE_VISITS
            r2.A04(r0, r1)
            X.DbT.A1J(r3)
            r0 = -122097696(0xfffffffff8b8efe0, float:-3.0007746E34)
            goto L_0x004a
        L_0x0962:
            r0 = -1486203984(0xffffffffa76a53b0, float:-3.251939E-15)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UZM r3 = (X.UZM) r3
            X.0eM r0 = r3.A06
            X.WGU r2 = X.C13990Tnq.A0M(r0)
            X.UzE r1 = X.C16678UzE.EDUCATION_DESTINATION
            java.lang.String r0 = "education_reach_new_people"
            r2.A0F(r1, r0)
            X.DbT.A1J(r3)
            r0 = -97818497(0xfffffffffa2b687f, float:-2.2250055E35)
            goto L_0x004a
        L_0x0982:
            r0 = -734054583(0xffffffffd43f3749, float:-3.28506514E12)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UZM r3 = (X.UZM) r3
            X.0eM r0 = r3.A06
            X.WGU r2 = X.C13990Tnq.A0M(r0)
            X.UzE r1 = X.C16678UzE.NUX_COUPON
            java.lang.String r0 = "education_coupon"
            r2.A0F(r1, r0)
            X.DbT.A1J(r3)
            r0 = 495278789(0x1d855ac5, float:3.529866E-21)
            goto L_0x004a
        L_0x09a2:
            r0 = 705020891(0x2a05c3db, float:1.1880724E-13)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UZM r3 = (X.UZM) r3
            X.0eM r0 = r3.A06
            X.WGU r2 = X.C13990Tnq.A0M(r0)
            X.UzE r1 = X.C16678UzE.EDUCATION_BUDGET
            java.lang.String r0 = "education_distribution"
            r2.A0F(r1, r0)
            X.DbT.A1J(r3)
            r0 = -1541425275(0xffffffffa41fb785, float:-3.4633076E-17)
            goto L_0x004a
        L_0x09c2:
            r0 = -612800815(0xffffffffdb7966d1, float:-7.0200317E16)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UZM r3 = (X.UZM) r3
            X.0eM r0 = r3.A06
            X.WGU r2 = X.C13990Tnq.A0M(r0)
            X.UzE r1 = X.C16678UzE.EDUCATION_BUDGET
            java.lang.String r0 = "education_duration"
            r2.A0F(r1, r0)
            X.DbT.A1J(r3)
            r0 = -316508593(0xffffffffed22764f, float:-3.142475E27)
            goto L_0x004a
        L_0x09e2:
            r0 = -1533511632(0xffffffffa4987830, float:-6.61231E-17)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UZM r3 = (X.UZM) r3
            X.0eM r0 = r3.A06
            X.WGU r2 = X.C13990Tnq.A0M(r0)
            X.UzE r1 = X.C16678UzE.EDUCATION_BUDGET
            java.lang.String r0 = "education_budget"
            r2.A0F(r1, r0)
            X.DbT.A1J(r3)
            r0 = -420108827(0xffffffffe6f5a5e5, float:-5.8002E23)
            goto L_0x004a
        L_0x0a02:
            r0 = -494440096(0xffffffffe2877160, float:-1.24924E21)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UbX r3 = (X.C15379UbX) r3
            X.WGU r2 = r3.A02
            if (r2 == 0) goto L_0x0a18
            X.UzE r1 = X.C16678UzE.EDUCATION_BUDGET
            java.lang.String r0 = "education_budget"
            r2.A0F(r1, r0)
        L_0x0a18:
            X.C13992Tns.A0e(r3)
            r0 = -1056018550(0xffffffffc10e6f8a, float:-8.902231)
            goto L_0x004a
        L_0x0a20:
            r0 = -627918169(0xffffffffda92baa7, float:-2.06502865E16)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.UbX r0 = (X.C15379UbX) r0
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            X.0eM r0 = r0.A0A
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.2EG r1 = X.2EG.A34
            java.lang.String r0 = "https://www.facebook.com/business/help/1838453822893854"
            X.SUL r1 = X.Dba.A0J(r3, r2, r1, r0)
            java.lang.String r0 = "promote_education_drawer_bottom_sheet_fragment"
            r1.A0S = r0
            r1.A0A()
            r0 = 859020057(0x33339b19, float:4.1817746E-8)
            goto L_0x004a
        L_0x0a49:
            r0 = -1404791809(0xffffffffac4493ff, float:-2.793543E-12)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.UbX r0 = (X.C15379UbX) r0
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            X.0eM r0 = r0.A0A
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.2EG r1 = X.2EG.A34
            java.lang.String r0 = "https://www.facebook.com/business/help/2408667629202904?helpref=search&sr=3&query=special%20ad%20category"
            X.SUL r1 = X.Dba.A0J(r3, r2, r1, r0)
            java.lang.String r0 = "promote_education_drawer_bottom_sheet_fragment"
            r1.A0S = r0
            r1.A0A()
            r0 = -1229973911(0xffffffffb6b01669, float:-5.2478176E-6)
            goto L_0x004a
        L_0x0a72:
            r0 = -509489806(0xffffffffe1a1cd72, float:-3.730912E20)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UbX r3 = (X.C15379UbX) r3
            X.WGU r2 = r3.A02
            if (r2 == 0) goto L_0x0a88
            X.UzE r1 = X.C16678UzE.EDUCATION_AUDIENCE
            java.lang.String r0 = "education_audience_manual"
            r2.A0F(r1, r0)
        L_0x0a88:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r3.A09 = r0
            X.C13992Tns.A0e(r3)
            r0 = -843339138(0xffffffffcdbbaa7e, float:-3.93564096E8)
            goto L_0x004a
        L_0x0a94:
            r0 = 829102122(0x316b182a, float:3.4210736E-9)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UbX r3 = (X.C15379UbX) r3
            X.WGU r2 = r3.A02
            if (r2 == 0) goto L_0x0aaa
            X.UzE r1 = X.C16678UzE.EDUCATION_DESTINATION
            java.lang.String r0 = "education_reach_new_people"
            r2.A0F(r1, r0)
        L_0x0aaa:
            X.C13992Tns.A0e(r3)
            r0 = 1173407953(0x45f0c8d1, float:7705.102)
            goto L_0x004a
        L_0x0ab2:
            r0 = 2109944873(0x7dc33429, float:3.2433786E37)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UbX r3 = (X.C15379UbX) r3
            X.WGU r2 = r3.A02
            if (r2 == 0) goto L_0x0ac8
            X.UzE r1 = X.C16678UzE.EDUCATION_BUDGET
            java.lang.String r0 = "education_distribution"
            r2.A0F(r1, r0)
        L_0x0ac8:
            X.C13992Tns.A0e(r3)
            r0 = -1419689422(0xffffffffab614232, float:-8.002792E-13)
            goto L_0x004a
        L_0x0ad0:
            r0 = 905795975(0x35fd5987, float:1.8876025E-6)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UbX r3 = (X.C15379UbX) r3
            X.WGU r2 = r3.A02
            if (r2 == 0) goto L_0x0ae6
            X.UzE r1 = X.C16678UzE.EDUCATION_BUDGET
            java.lang.String r0 = "education_duration"
            r2.A0F(r1, r0)
        L_0x0ae6:
            X.C13992Tns.A0e(r3)
            r0 = 1798718598(0x6b364486, float:2.203481E26)
            goto L_0x004a
        L_0x0aee:
            r0 = -1233258610(0xffffffffb67df78e, float:-3.7844034E-6)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.UYz r0 = (X.UYz) r0
            X.0eM r0 = r0.A0D
            java.lang.Object r1 = r0.getValue()
            X.U92 r1 = (X.U92) r1
            r0 = 0
            r1.A0D(r0)
            r0 = 2127216366(0x7ecabeee, float:1.3474771E38)
            goto L_0x004a
        L_0x0b0a:
            r0 = -104691648(0xfffffffff9c28840, float:-1.2625863E35)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.UZi r5 = (X.C15280UZi) r5
            X.0eM r0 = r5.A0Y
            X.WGU r3 = X.C13990Tnq.A0M(r0)
            X.0eM r2 = r5.A0W
            java.lang.Object r1 = r2.getValue()
            X.UzE r1 = (X.C16678UzE) r1
            java.lang.String r0 = "minimum_age_constraint"
            r3.A0F(r1, r0)
            X.C13990Tnq.A0h()
            java.lang.Object r0 = r2.getValue()
            android.os.Bundle r3 = X.DbY.A0A(r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "screen"
            r3.putString(r0, r1)
            X.UZe r2 = new X.UZe
            r2.<init>()
            r2.setArguments(r3)
            com.instagram.common.session.UserSession r1 = X.C15280UZi.A02(r5)
            X.7Pr r0 = new X.7Pr
            r0.<init>(r1)
            X.DbY.A13(r5, r2, r0)
            r0 = 324168788(0x13526c54, float:2.6559136E-27)
            goto L_0x004a
        L_0x0b55:
            r0 = -1563664614(0xffffffffa2cc5f1a, float:-5.5395003E-18)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UZi r3 = (X.C15280UZi) r3
            X.0eM r0 = r3.A0Y
            X.WGU r2 = X.C13990Tnq.A0M(r0)
            X.UzE r1 = X.C16678UzE.CREATE_AUDIENCE
            java.lang.String r0 = "location"
            r2.A0F(r1, r0)
            X.C13990Tnq.A0h()
            X.UZg r2 = new X.UZg
            r2.<init>()
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            com.instagram.business.promote.model.PromoteData r0 = X.C15280UZi.A01(r3)
            com.instagram.common.session.UserSession r0 = r0.A0y
            X.DbY.A14(r2, r1, r0)
            r0 = -2126654709(0xffffffff813dd30b, float:-3.4865233E-38)
            goto L_0x004a
        L_0x0b87:
            r0 = 961850498(0x3954ac82, float:2.028216E-4)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UZi r3 = (X.C15280UZi) r3
            X.0eM r0 = r3.A0Y
            X.WGU r2 = X.C13990Tnq.A0M(r0)
            X.UzE r1 = X.C16678UzE.CREATE_AUDIENCE
            java.lang.String r0 = "interest"
            r2.A0F(r1, r0)
            X.C13990Tnq.A0h()
            X.UZW r2 = new X.UZW
            r2.<init>()
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            com.instagram.business.promote.model.PromoteData r0 = X.C15280UZi.A01(r3)
            com.instagram.common.session.UserSession r0 = r0.A0y
            X.DbY.A14(r2, r1, r0)
            r0 = 1556072454(0x5cbfc806, float:4.31853189E17)
            goto L_0x004a
        L_0x0bb9:
            r0 = -562623970(0xffffffffde770a1e, float:-4.45026837E18)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UZi r3 = (X.C15280UZi) r3
            X.0eM r0 = r3.A0Y
            X.WGU r2 = X.C13990Tnq.A0M(r0)
            X.UzE r1 = X.C16678UzE.CREATE_AUDIENCE
            java.lang.String r0 = "interest"
            r2.A0F(r1, r0)
            X.C13990Tnq.A0h()
            X.UZW r2 = new X.UZW
            r2.<init>()
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            com.instagram.business.promote.model.PromoteData r0 = X.C15280UZi.A01(r3)
            com.instagram.common.session.UserSession r0 = r0.A0y
            X.DbY.A14(r2, r1, r0)
            r0 = 1588109647(0x5ea8a14f, float:6.0755401E18)
            goto L_0x004a
        L_0x0beb:
            r0 = 1108668618(0x4214f0ca, float:37.235146)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UZi r3 = (X.C15280UZi) r3
            X.0eM r0 = r3.A0Y
            X.WGU r2 = X.C13990Tnq.A0M(r0)
            X.0eM r0 = r3.A0W
            java.lang.Object r1 = r0.getValue()
            X.UzE r1 = (X.C16678UzE) r1
            com.instagram.business.promote.model.PromoteData r0 = X.C15280UZi.A01(r3)
            boolean r0 = r0.A2y
            r0 = r0 ^ 1
            r2.A0N(r1, r0)
            X.0eM r0 = r3.A0Z
            com.instagram.business.promote.model.PromoteState r2 = X.C13990Tnq.A0O(r0)
            com.instagram.business.promote.model.PromoteData r1 = X.C15280UZi.A01(r3)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            boolean r0 = r1.A2y
            r0 = r0 ^ 1
            r1.A2y = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            com.instagram.business.promote.model.PromoteState.A01(r2, r0)
            r0 = 528363816(0x1f7e3128, float:5.3827253E-20)
            goto L_0x004a
        L_0x0c2d:
            r0 = -1654756740(0xffffffff9d5e6a7c, float:-2.9436506E-21)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UZi r3 = (X.C15280UZi) r3
            X.0eM r0 = r3.A0Y
            X.WGU r2 = X.C13990Tnq.A0M(r0)
            X.UzE r1 = X.C16678UzE.CREATE_AUDIENCE
            java.lang.String r0 = "age_and_gender"
            r2.A0F(r1, r0)
            X.C13990Tnq.A0h()
            X.UZf r2 = new X.UZf
            r2.<init>()
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            com.instagram.business.promote.model.PromoteData r0 = X.C15280UZi.A01(r3)
            com.instagram.common.session.UserSession r0 = r0.A0y
            X.DbY.A14(r2, r1, r0)
            r0 = 689692264(0x291bde68, float:3.460982E-14)
            goto L_0x004a
        L_0x0c5f:
            r0 = 1811492322(0x6bf92de2, float:6.024784E26)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.UZh r6 = (X.C15279UZh) r6
            X.0eM r0 = r6.A0F
            X.WGU r0 = X.C13990Tnq.A0M(r0)
            X.UzE r5 = X.C16678UzE.BUDGET_DURATION
            java.lang.String r3 = "ad_account_budget_limit_ads_manager_link"
            r0.A0F(r5, r3)
            java.lang.String r2 = "https://m.facebook.com/ads/manage/spendlimit?act="
            X.0eM r0 = r6.A0G
            java.lang.Object r1 = r0.getValue()
            X.W1k r1 = (X.C18784W1k) r1
            java.lang.String r0 = r5.toString()
            java.lang.String r0 = r1.A03(r0, r3)
            java.lang.String r0 = X.002.A0R(r2, r0)
            android.net.Uri r2 = X.0cp.A03(r0)
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0, r2)
            android.content.Context r0 = r6.requireContext()
            X.0kR.A00(r0, r1)
            r0 = -314751479(0xffffffffed3d4609, float:-3.6610834E27)
            goto L_0x004a
        L_0x0ca4:
            r0 = -655594035(0xffffffffd8ec6dcd, float:-2.07965068E15)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.UZh r7 = (X.C15279UZh) r7
            X.0eM r0 = r7.A0E
            java.lang.Object r3 = r0.getValue()
            X.VwK r3 = (X.C18662VwK) r3
            com.instagram.business.promote.model.PromoteData r0 = X.C15279UZh.A00(r7)
            java.lang.String r2 = r0.A1S
            java.lang.String r1 = "campaign_controls_budget_duration"
            r0 = 1428(0x594, float:2.001E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r5 = 0
            r3.A0A(r1, r0, r2, r5)
            androidx.fragment.app.FragmentActivity r6 = r7.requireActivity()
            r8 = 2131970281(0x7f1348e9, float:1.9577509E38)
            int r0 = r7.A03
            java.lang.String r3 = X.C13992Tns.A0K(r7, r0)
            int r2 = r7.A02
            com.instagram.business.promote.model.PromoteData r0 = X.C15279UZh.A00(r7)
            int r1 = r0.A0A
            int r0 = r7.A00
            int r1 = r1 - r0
            com.instagram.business.promote.model.PromoteData r0 = X.C15279UZh.A00(r7)
            int r0 = r0.A07
            int r1 = r1 * r0
            int r2 = r2 + r1
            int r0 = r7.A01
            int r2 = r2 + r0
            java.lang.String r0 = X.C13992Tns.A0K(r7, r2)
            java.lang.String r3 = X.C13991Tnr.A0e(r7, r3, r0, r8)
            r0 = 6
            X.W5U r2 = new X.W5U
            r2.<init>(r7, r0)
            X.8ab r1 = new X.8ab
            r1.<init>((android.content.Context) r6)
            r0 = 2131970280(0x7f1348e8, float:1.9577507E38)
            r1.A09(r0)
            r1.A0q(r3)
            r0 = 2131970268(0x7f1348dc, float:1.9577482E38)
            r1.A0J(r2, r0)
            r0 = 2131970109(0x7f13483d, float:1.957716E38)
            r1.A0G(r5, r0)
            X.DbT.A1V(r1)
            r0 = -2100064406(0xffffffff82d38f6a, float:-3.108598E-37)
            goto L_0x004a
        L_0x0d1c:
            r0 = 1666054864(0x634dfad0, float:3.7996555E21)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.UaU r0 = (X.C15322UaU) r0
            X.C15322UaU.A07(r0)
            r0 = 1194749905(0x47366fd1, float:46703.816)
            goto L_0x004a
        L_0x0d2f:
            r12 = r1
        L_0x0d30:
            X.UGU r2 = new X.UGU
            r2.<init>()
            java.lang.String r0 = "program"
            r2.A01(r12, r0)
            java.lang.String r0 = "ad_account_id"
            r2.A05(r0, r1)
            r0 = 109(0x6d, float:1.53E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r2.A05(r0, r1)
            java.lang.String r0 = "page_id"
            r2.A05(r0, r1)
            java.lang.String r0 = "usid_override"
            r2.A06(r0, r1)
            java.lang.String r1 = "request_call"
            java.lang.String r0 = "ui_element"
            r2.A06(r0, r1)
            X.0wc r1 = r11.A00
            java.lang.String r0 = "sbg_engagement_entry_point_click"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0d74
            java.lang.String r0 = "event_data"
            r1.AAK(r10, r0)
            java.lang.String r0 = "extra_data"
            r1.AAK(r2, r0)
            r1.Cgf()
        L_0x0d74:
            java.util.HashMap r1 = X.C13991Tnr.A0p(r8, r9, r3, r4)
            X.6Yo r4 = X.DbZ.A0P(r6, r7)
            java.lang.String r0 = "com.bloks.www.ig.meta.pro.engagement"
            X.DiU r3 = X.C46649DiU.A04(r0, r1)
            X.0lg r0 = X.DbT.A0X(r7)
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r2.<init>((X.0lg) r0)
            android.content.Context r1 = r6.requireContext()
            r0 = 2131963545(0x7f132e99, float:1.9563846E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0U = r0
            X.3M3 r0 = X.C49891FBs.A02(r2, r3)
            r4.A0D(r0)
            r4.A04()
            r0 = -2124769951(0xffffffff815a9561, float:-4.014745E-38)
            goto L_0x1142
        L_0x0da7:
            r0 = 1678342175(0x6409781f, float:1.0143438E22)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UaS r1 = (X.C15320UaS) r1
            boolean r0 = r1.A0L
            if (r0 != 0) goto L_0x0db9
            X.DbT.A1J(r1)
        L_0x0db9:
            r0 = 1773021409(0x69ae28e1, float:2.6318267E25)
            goto L_0x0e31
        L_0x0dbd:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -870887328(0xffffffffcc175060, float:-3.9666048E7)
            X.AnonymousClass0fD.A0C(r0, r3)
            throw r1
        L_0x0dc8:
            com.instagram.business.promote.model.PromoteData r4 = r4.A03
            com.instagram.common.session.UserSession r0 = r4.A0y
            X.WGU r1 = X.WGU.A00(r0)
            X.UzE r0 = X.C16678UzE.INTERESTS_SELECTION
            r1.A0B(r0, r4)
            goto L_0x0df6
        L_0x0dd6:
            com.instagram.business.promote.model.PromoteData r1 = r4.A03
            com.instagram.common.session.UserSession r0 = r1.A0y
            X.WGU r6 = X.WGU.A00(r0)
            X.UzE r0 = X.C16678UzE.INTERESTS_SELECTION
            java.lang.String r8 = r0.toString()
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r1.A0i
            java.lang.String r9 = X.DbX.A0t(r0)
            r7 = 0
            java.lang.String r12 = r1.A1E
            com.instagram.api.schemas.XIGIGBoostDestination r5 = r1.A0h
            com.instagram.api.schemas.DestinationRecommendationReason r4 = r1.A0S
            r10 = r7
            r11 = r7
            X.WGU.A01(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x0df6:
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            if (r0 == 0) goto L_0x0e3d
            r0.onBackPressed()
            r0 = -1887499057(0xffffffff8f7f0ccf, float:-1.25749375E-29)
            goto L_0x0e31
        L_0x0e03:
            r0 = -1402160637(0xffffffffac6cba03, float:-3.3640874E-12)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UaS r1 = (X.C15320UaS) r1
            boolean r0 = r1.A0L
            if (r0 != 0) goto L_0x0e15
            X.DbT.A1J(r1)
        L_0x0e15:
            r0 = -2130537299(0xffffffff810294ad, float:-2.39839E-38)
            goto L_0x0e31
        L_0x0e19:
            r0 = -1288271282(0xffffffffb3368a4e, float:-4.2500965E-8)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UZc r1 = (X.C15274UZc) r1
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r1.A04
            if (r0 == 0) goto L_0x0e35
            X.C15274UZc.A01(r0, r1)
            X.DbT.A1J(r1)
            r0 = -159152473(0xfffffffff68386a7, float:-1.333832E33)
        L_0x0e31:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x0e35:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -327084516(0xffffffffec81161c, float:-1.2484467E27)
            goto L_0x0e44
        L_0x0e3d:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -1996929455(0xffffffff88f94651, float:-1.5002674E-33)
        L_0x0e44:
            X.AnonymousClass0fD.A0C(r0, r2)
            throw r1
        L_0x0e48:
            r0 = 1059129504(0x3f2108a0, float:0.62903786)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.UaT r5 = (X.C15321UaT) r5
            X.WGU r2 = r5.A06
            if (r2 == 0) goto L_0x0e5e
            X.UzE r1 = X.C16678UzE.OBJECTIVE
            java.lang.String r0 = "boost_guidance_bottom_sheet_link"
            r2.A0F(r1, r0)
        L_0x0e5e:
            X.UzE r0 = X.C16678UzE.OBJECTIVE
            java.lang.String r0 = r0.toString()
            X.E1i r4 = X.C48733EjI.A00(r0)
            X.0eM r0 = r5.A0K
            X.7Pr r2 = X.DbX.A0f(r0)
            android.content.Context r1 = r5.requireContext()
            r0 = 2131953997(0x7f13094d, float:1.954448E38)
            X.DbZ.A0z(r1, r2, r0)
            X.DbY.A13(r5, r4, r2)
            r0 = 831801955(0x31944a63, float:4.3158237E-9)
            goto L_0x0f7a
        L_0x0e80:
            r0 = 328487085(0x139450ad, float:3.7440005E-27)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.UaS r4 = (X.C15320UaS) r4
            X.WGU r2 = r4.A0B
            if (r2 == 0) goto L_0x0e96
            X.UzE r1 = X.C16678UzE.SUMMARY
            java.lang.String r0 = "discard_draft"
            r2.A0F(r1, r0)
        L_0x0e96:
            X.C13990Tnq.A0h()
            X.UYy r2 = new X.UYy
            r2.<init>()
            X.37E r1 = X.AnonymousClass37D.A00
            android.content.Context r0 = r4.requireContext()
            X.37D r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x0ead
            r0.A0J(r2)
        L_0x0ead:
            r0 = -286696071(0xffffffffeee95d79, float:-3.6111504E28)
            goto L_0x0f7a
        L_0x0eb2:
            r0 = -2098374449(0xffffffff82ed58cf, float:-3.4874994E-37)
            int r3 = X.AnonymousClass0fD.A05(r0)
            X.UaS r4 = A00(r1)
            X.WGU r2 = r4.A0B
            if (r2 == 0) goto L_0x0ec8
            X.UzE r1 = X.C16678UzE.SUMMARY
            java.lang.String r0 = "edit_destination"
            r2.A0F(r1, r0)
        L_0x0ec8:
            X.C15320UaS.A01(r4)
            r0 = -1165517782(0xffffffffba879c2a, float:-0.0010346223)
            goto L_0x0f7a
        L_0x0ed0:
            r0 = 1114211344(0x42698410, float:58.378967)
            int r3 = X.AnonymousClass0fD.A05(r0)
            X.C13990Tnq.A0h()
            X.UaT r2 = new X.UaT
            r2.<init>()
            java.lang.Object r0 = r1.A01
            X.UZc r0 = (X.C15274UZc) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0eM r0 = r0.A0J
            X.Dbc.A0S(r2, r1, r0)
            r0 = 1210474535(0x48266027, float:170368.61)
            goto L_0x0f7a
        L_0x0ef1:
            r0 = -1772796073(0xffffffff96554757, float:-1.7228514E-25)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.UZZ r2 = (X.UZZ) r2
            X.U5O r1 = r2.A06
            if (r1 == 0) goto L_0x0f04
            r0 = 0
            r1.setChecked(r0)
        L_0x0f04:
            X.U5O r1 = r2.A05
            if (r1 == 0) goto L_0x0f0c
            r0 = 1
            r1.setChecked(r0)
        L_0x0f0c:
            r0 = 1752333505(0x68727cc1, float:4.580456E24)
            goto L_0x0f7a
        L_0x0f10:
            r0 = 1324901194(0x4ef8634a, float:2.08362829E9)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.UZZ r2 = (X.UZZ) r2
            X.U5O r1 = r2.A05
            if (r1 == 0) goto L_0x0f23
            r0 = 0
            r1.setChecked(r0)
        L_0x0f23:
            X.U5O r1 = r2.A06
            if (r1 == 0) goto L_0x0f2b
            r0 = 1
            r1.setChecked(r0)
        L_0x0f2b:
            r0 = 1395707273(0x5330cd89, float:7.5936255E11)
            goto L_0x0f7a
        L_0x0f2f:
            r0 = -1815190010(0xffffffff93ce6606, float:-5.2102314E-27)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.UZM r5 = (X.UZM) r5
            X.0eM r0 = r5.A06
            X.WGU r2 = X.C13990Tnq.A0M(r0)
            X.UzE r1 = X.C16678UzE.EDUCATION_DESTINATION
            java.lang.String r0 = "education_destination_website"
            r2.A0F(r1, r0)
            X.0eM r4 = r5.A05
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r4)
            com.instagram.business.promote.model.PromoteData r0 = (com.instagram.business.promote.model.PromoteData) r0
            java.lang.String r0 = r0.A1I
            if (r0 == 0) goto L_0x0f7e
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0f7e
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r4)
            com.instagram.business.promote.model.PromoteData r0 = (com.instagram.business.promote.model.PromoteData) r0
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = r0.A0b
            if (r0 == 0) goto L_0x0f7e
            X.0eM r0 = r5.A07
            com.instagram.business.promote.model.PromoteState r2 = X.C13990Tnq.A0O(r0)
            java.lang.Object r1 = X.AnonymousClass7TE.A14(r4)
            com.instagram.business.promote.model.PromoteData r1 = (com.instagram.business.promote.model.PromoteData) r1
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.WEBSITE_CLICK
            r2.A04(r0, r1)
            X.DbT.A1J(r5)
        L_0x0f77:
            r0 = -302097350(0xffffffffedfe5c3a, float:-9.840086E27)
        L_0x0f7a:
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x0f7e:
            X.DbT.A1J(r5)
            X.C13990Tnq.A0h()
            X.UZb r2 = new X.UZb
            r2.<init>()
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r4)
            com.instagram.business.promote.model.PromoteData r0 = (com.instagram.business.promote.model.PromoteData) r0
            com.instagram.common.session.UserSession r0 = r0.A0y
            X.DbY.A14(r2, r1, r0)
            goto L_0x0f77
        L_0x0f99:
            r0 = -1412243518(0xffffffffabd2dfc2, float:-1.4983503E-12)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.UaT r4 = (X.C15321UaT) r4
            X.WGU r2 = r4.A06
            if (r2 == 0) goto L_0x0faf
            X.UzE r1 = X.C16678UzE.OBJECTIVE
            java.lang.String r0 = "education"
            r2.A0F(r1, r0)
        L_0x0faf:
            X.C13990Tnq.A0h()
            X.UzE r3 = X.C16678UzE.OBJECTIVE
            X.UbX r2 = new X.UbX
            r2.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "step"
            r1.putSerializable(r0, r3)
            r2.setArguments(r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.business.promote.fragment.PromoteEducationDrawerBottomSheetFragment"
            X.0qQ.A0C(r2, r0)
            X.WOZ r0 = new X.WOZ
            r0.<init>(r4)
            r2.A04 = r0
            X.0eM r0 = r4.A0K
            X.7Pr r0 = X.DbX.A0f(r0)
            r0.A0U = r2
            X.DbY.A13(r4, r2, r0)
            r0 = 631833038(0x25a901ce, float:2.931805E-16)
            goto L_0x1142
        L_0x0fe2:
            r0 = -2089558027(0xffffffff8373dff5, float:-7.166837E-37)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UZJ r3 = (X.UZJ) r3
            android.widget.NumberPicker r0 = r3.A00
            if (r0 == 0) goto L_0x105b
            int r7 = r0.getValue()
            X.0eM r0 = r3.A03
            java.lang.Object r0 = r0.getValue()
            X.U92 r0 = (X.U92) r0
            X.LAF r0 = r0.A02
            X.05G r6 = r0.A01
            java.lang.Object r0 = r6.getValue()
            X.ULv r0 = (X.C15053ULv) r0
            com.instagram.api.schemas.AdvantageAudienceData r9 = r0.A02
            if (r9 == 0) goto L_0x105b
            java.lang.Object r0 = r6.getValue()
            X.ULv r0 = (X.C15053ULv) r0
            int r4 = r0.A01
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r1 = r9.Aa9()
            r9.BT2()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            boolean r0 = r9 instanceof com.instagram.api.schemas.ImmutablePandoAdvantageAudienceData
            if (r0 == 0) goto L_0x107c
            if (r1 == 0) goto L_0x107a
            java.lang.String r2 = r1.A00
        L_0x1026:
            java.lang.String r0 = "advantage_audience_status"
            X.0eP r1 = new X.0eP
            r1.<init>(r0, r2)
            java.lang.String r0 = "min_age_constraint"
            X.0eP[] r0 = X.JTQ.A1b(r0, r8, r1)
            com.facebook.pando.TreeJNI r2 = X.C41847B3o.A0o(r9, r0)
        L_0x1037:
            com.instagram.api.schemas.AdvantageAudienceData r2 = (com.instagram.api.schemas.AdvantageAudienceData) r2
        L_0x1039:
            java.lang.Object r1 = r6.getValue()
            r0 = r1
            X.ULv r0 = (X.C15053ULv) r0
            r9 = 0
            r15 = r4
            if (r4 >= r7) goto L_0x1045
            r15 = r7
        L_0x1045:
            r16 = 0
            r17 = 763(0x2fb, float:1.069E-42)
            r8 = r2
            r10 = r0
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r18 = r16
            X.ULv r0 = X.C15053ULv.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = r6.AIY(r1, r0)
            if (r0 == 0) goto L_0x1039
        L_0x105b:
            X.0eM r0 = r3.A01
            X.WGU r2 = X.C13990Tnq.A0M(r0)
            X.0eM r0 = r3.A03
            java.lang.Object r0 = r0.getValue()
            X.U92 r0 = (X.U92) r0
            X.UzE r1 = r0.A08()
            java.lang.String r0 = "minimum_age_constraint_done"
            r2.A0F(r1, r0)
            X.DbT.A1J(r3)
            r0 = -1116354827(0xffffffffbd75c6f5, float:-0.060004193)
            goto L_0x1142
        L_0x107a:
            r2 = 0
            goto L_0x1026
        L_0x107c:
            com.instagram.api.schemas.AdvantageAudienceDataImpl r2 = new com.instagram.api.schemas.AdvantageAudienceDataImpl
            r2.<init>(r1, r8)
            goto L_0x1037
        L_0x1082:
            r0 = 284293458(0x10f1f952, float:9.544188E-29)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.UZi r7 = (X.C15280UZi) r7
            X.0eM r6 = r7.A0Y
            X.WGU r2 = X.C13990Tnq.A0M(r6)
            X.0eM r0 = r7.A0W
            java.lang.Object r1 = r0.getValue()
            X.UzE r1 = (X.C16678UzE) r1
            java.lang.String r0 = "done_button"
            r2.A0F(r1, r0)
            com.instagram.business.promote.model.PromoteData r0 = X.C15280UZi.A01(r7)
            com.instagram.business.promote.model.PromoteAudienceInfo r1 = r0.A0q
            java.lang.String r0 = r1.A05
            if (r0 == 0) goto L_0x1237
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x1237
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x1237
            boolean r1 = X.C15280UZi.A08(r7)
            X.0eM r0 = r7.A0X
            java.lang.Object r2 = r0.getValue()
            X.W1k r2 = (X.C18784W1k) r2
            if (r1 == 0) goto L_0x1175
            java.lang.String r1 = "ads/promote/edit_audience/"
            int r0 = r1.length()
            int r0 = r0 + -1
            r4 = 0
            java.lang.String r3 = X.C13991Tnr.A0a(r0, r1)
            X.WGU r1 = X.C13990Tnq.A0M(r6)
            r0 = 10
            X.UcZ r6 = new X.UcZ
            r6.<init>(r1, r7, r3, r0)
            com.instagram.business.promote.model.PromoteData r7 = r2.A03
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r7.A0q
            java.util.List r1 = r0.A07
            boolean r0 = X.AnonymousClass4KJ.A00(r1)
            r25 = 0
            if (r0 != 0) goto L_0x1167
            X.W2W r0 = X.C17149VKb.A00
            boolean r0 = X.W2W.A04(r1)
            if (r0 == 0) goto L_0x1146
            java.lang.Object r8 = r1.get(r4)
            com.instagram.business.promote.model.AudienceGeoLocation r8 = (com.instagram.business.promote.model.AudienceGeoLocation) r8
            double r3 = r8.A00
            double r0 = r8.A01
            int r9 = r8.A02
            java.lang.String r15 = r8.A05
            r24 = r25
            r26 = r25
            r27 = r25
        L_0x1106:
            com.instagram.common.session.UserSession r14 = r2.A08
            com.instagram.business.promote.model.PromoteAudienceInfo r8 = r7.A0q
            java.lang.String r13 = r8.A04
            java.lang.String r12 = r8.A05
            int r11 = r8.A01
            int r10 = r8.A00
            com.google.common.collect.ImmutableList r22 = X.W3x.A01(r8)
            com.instagram.business.promote.model.PromoteAudienceInfo r8 = r7.A0q
            com.google.common.collect.ImmutableList r23 = X.W3x.A02(r8)
            com.instagram.business.promote.model.PromoteAudienceInfo r7 = r7.A0q
            com.instagram.api.schemas.TargetingRelaxationConstants r8 = r7.A03
            com.instagram.api.schemas.AdvantageAudienceData r7 = r7.A02
            r16 = r7
            r17 = r8
            r18 = r14
            r19 = r13
            r20 = r12
            r21 = r15
            r28 = r3
            r30 = r0
            r32 = r11
            r33 = r10
            r34 = r9
            X.1OC r0 = X.C18765W0j.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r32, r33, r34)
        L_0x113c:
            X.C18784W1k.A02(r2, r6, r0)
        L_0x113f:
            r0 = 1230179479(0x49530c97, float:864457.44)
        L_0x1142:
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        L_0x1146:
            com.instagram.api.schemas.AdGeoLocationType r0 = com.instagram.api.schemas.AdGeoLocationType.COUNTRY
            java.util.ArrayList r24 = X.W3x.A0I(r0, r1)
            com.instagram.api.schemas.AdGeoLocationType r0 = com.instagram.api.schemas.AdGeoLocationType.REGION
            java.util.ArrayList r8 = X.W3x.A0I(r0, r1)
            com.instagram.api.schemas.AdGeoLocationType r0 = com.instagram.api.schemas.AdGeoLocationType.CITY
            java.util.ArrayList r26 = X.W3x.A0I(r0, r1)
            com.instagram.api.schemas.AdGeoLocationType r0 = com.instagram.api.schemas.AdGeoLocationType.ZIP
            java.util.ArrayList r27 = X.W3x.A0I(r0, r1)
            r3 = 0
            r0 = 0
            r15 = r25
            r25 = r8
            goto L_0x1173
        L_0x1167:
            r3 = 0
            r0 = 0
            r24 = r25
            r26 = r25
            r27 = r25
            r15 = r25
        L_0x1173:
            r9 = 0
            goto L_0x1106
        L_0x1175:
            java.lang.String r1 = "ads/promote/create_audience_v2/"
            int r0 = r1.length()
            int r0 = r0 + -1
            r4 = 0
            java.lang.String r3 = X.C13991Tnr.A0a(r0, r1)
            X.WGU r1 = X.C13990Tnq.A0M(r6)
            r0 = 8
            X.UcZ r6 = new X.UcZ
            r6.<init>(r1, r7, r3, r0)
            com.instagram.business.promote.model.PromoteData r7 = r2.A03
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r7.A0q
            java.util.List r3 = r0.A07
            java.lang.String r0 = "cannot create audience without a location"
            X.17k.A07(r3, r0)
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r7.A0q
            java.util.List r0 = r0.A07
            int r1 = r0.size()
            r9 = 0
            r25 = 0
            r0 = 1
            if (r1 != r0) goto L_0x1216
            java.lang.Object r0 = r3.get(r4)
            com.instagram.business.promote.model.AudienceGeoLocation r0 = (com.instagram.business.promote.model.AudienceGeoLocation) r0
            com.instagram.api.schemas.AdGeoLocationType r0 = r0.A03
            if (r0 == 0) goto L_0x1216
            java.lang.Object r0 = r3.get(r4)
            com.instagram.business.promote.model.AudienceGeoLocation r0 = (com.instagram.business.promote.model.AudienceGeoLocation) r0
            com.instagram.api.schemas.AdGeoLocationType r0 = r0.A03
            com.instagram.api.schemas.AdGeoLocationType r1 = X.VAK.A00(r0)
            com.instagram.api.schemas.AdGeoLocationType r0 = com.instagram.api.schemas.AdGeoLocationType.CUSTOM_LOCATION
            if (r1 != r0) goto L_0x1216
            java.lang.Object r8 = r3.get(r4)
            com.instagram.business.promote.model.AudienceGeoLocation r8 = (com.instagram.business.promote.model.AudienceGeoLocation) r8
            double r3 = r8.A00
            double r0 = r8.A01
            int r9 = r8.A02
            java.lang.String r15 = r8.A05
            r24 = r25
            r26 = r25
            r27 = r25
        L_0x11d4:
            com.instagram.common.session.UserSession r14 = r2.A08
            com.instagram.business.promote.model.PromoteAudienceInfo r8 = r7.A0q
            java.lang.String r13 = r8.A05
            r13.getClass()
            com.instagram.business.promote.model.PromoteAudienceInfo r8 = r7.A0q
            int r12 = r8.A01
            int r11 = r8.A00
            com.google.common.collect.ImmutableList r22 = X.W3x.A01(r8)
            r22.getClass()
            com.instagram.business.promote.model.PromoteAudienceInfo r8 = r7.A0q
            com.google.common.collect.ImmutableList r23 = X.W3x.A02(r8)
            com.instagram.business.promote.model.PromoteAudienceInfo r7 = r7.A0q
            com.instagram.api.schemas.TargetingRelaxationConstants r10 = r7.A03
            com.instagram.api.schemas.AdvantageAudienceData r8 = r7.A02
            X.WGU r7 = r2.A02
            java.lang.String r7 = r7.A03
            r16 = r8
            r17 = r10
            r18 = r14
            r19 = r13
            r20 = r15
            r21 = r7
            r28 = r3
            r30 = r0
            r32 = r12
            r33 = r11
            r34 = r9
            X.1OC r0 = X.W2V.A01(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r32, r33, r34)
            goto L_0x113c
        L_0x1216:
            com.instagram.api.schemas.AdGeoLocationType r0 = com.instagram.api.schemas.AdGeoLocationType.COUNTRY
            java.util.ArrayList r24 = X.W3x.A0I(r0, r3)
            com.instagram.api.schemas.AdGeoLocationType r0 = com.instagram.api.schemas.AdGeoLocationType.REGION
            java.util.ArrayList r8 = X.W3x.A0I(r0, r3)
            com.instagram.api.schemas.AdGeoLocationType r0 = com.instagram.api.schemas.AdGeoLocationType.CITY
            java.util.ArrayList r26 = X.W3x.A0I(r0, r3)
            com.instagram.api.schemas.AdGeoLocationType r0 = com.instagram.api.schemas.AdGeoLocationType.ZIP
            java.util.ArrayList r27 = X.W3x.A0I(r0, r3)
            r3 = 0
            r0 = 0
            r15 = r25
            r25 = r8
            goto L_0x11d4
        L_0x1237:
            android.content.Context r2 = r7.getContext()
            com.instagram.business.promote.model.PromoteData r0 = X.C15280UZi.A01(r7)
            com.instagram.business.promote.model.PromoteAudienceInfo r1 = r0.A0q
            java.lang.String r0 = r1.A05
            if (r0 == 0) goto L_0x125e
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x125e
            java.util.List r0 = r1.A07
            if (r0 == 0) goto L_0x1256
            boolean r0 = r0.isEmpty()
            r1 = -1
            if (r0 == 0) goto L_0x1259
        L_0x1256:
            r1 = 2131970340(0x7f134924, float:1.9577628E38)
        L_0x1259:
            X.DbZ.A0w(r2, r7, r1)
            goto L_0x113f
        L_0x125e:
            r1 = 2131970341(0x7f134925, float:1.957763E38)
            goto L_0x1259
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WBB.onClick(android.view.View):void");
    }
}

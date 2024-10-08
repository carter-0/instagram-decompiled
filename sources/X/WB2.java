package X;

import android.view.View;

public final class WB2 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public WB2(C15315UaN uaN, int i, boolean z) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A02 = z;
            this.A01 = uaN;
        } else {
            this.A01 = uaN;
            this.A02 = z;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0104, code lost:
        if (r6.A04().A05() == false) goto L_0x0106;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x02c2;
                case 1: goto L_0x01c8;
                case 2: goto L_0x0117;
                case 3: goto L_0x00d1;
                case 4: goto L_0x00bb;
                case 5: goto L_0x00a5;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 1818813034(0x6c68e26a, float:1.12616E27)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r9.A01
            X.UaE r5 = (X.C15307UaE) r5
            X.0eM r8 = r5.A04
            X.U8y r0 = X.C13990Tnq.A0T(r8)
            X.WYZ r3 = r0.A04
            java.lang.Long r2 = r0.A07
            java.lang.String r1 = r0.A08
            r7 = 1
            X.0qQ.A0B(r1, r7)
            java.lang.String r6 = "lead_gen_create_form"
            java.lang.String r0 = "add_custom_question_button_click"
            X.WYZ.A02(r3, r2, r6, r0, r1)
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x0088
            android.view.View r0 = X.C13991Tnr.A06(r5)
            X.0nA.A0N(r0)
            X.U8y r0 = X.C13990Tnq.A0T(r8)
            X.WYZ r3 = r0.A04
            java.lang.Long r2 = r0.A07
            java.lang.String r1 = r0.A08
            X.0qQ.A0B(r1, r7)
            java.lang.String r0 = "add_custom_question_dialog_impression"
            X.WYZ.A03(r3, r2, r6, r0, r1)
            android.content.Context r1 = r5.requireContext()
            X.U8y r0 = X.C13990Tnq.A0T(r8)
            com.instagram.common.session.UserSession r0 = r0.A02
            X.Dg1 r3 = new X.Dg1
            r3.<init>(r1, r0)
            r0 = 2131964794(0x7f13337a, float:1.956638E38)
            java.lang.String r1 = r5.getString(r0)
            r0 = 2131964793(0x7f133379, float:1.9566378E38)
            java.lang.String r0 = r5.getString(r0)
            r3.A0D(r1, r0)
            r2 = 2131964791(0x7f133377, float:1.9566374E38)
            r1 = 28
            X.WBA r0 = new X.WBA
            r0.<init>((java.lang.Object) r5, (int) r1)
            r3.A04(r0, r2)
            r2 = 2131964792(0x7f133378, float:1.9566376E38)
            r1 = 29
            X.WBA r0 = new X.WBA
            r0.<init>((java.lang.Object) r5, (int) r1)
            r3.A04(r0, r2)
            X.C49945FFy.A00(r5, r3)
        L_0x0081:
            r0 = -741474947(0xffffffffd3cdfd7d, float:-1.76944225E12)
        L_0x0084:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x0088:
            android.content.Context r1 = r5.getContext()
            r0 = 2131964757(0x7f133355, float:1.9566305E38)
            X.C59689JTv.A07(r1, r0)
            X.U8y r0 = X.C13990Tnq.A0T(r8)
            X.WYZ r3 = r0.A04
            java.lang.Long r2 = r0.A07
            java.lang.String r1 = r0.A08
            X.0qQ.A0B(r1, r7)
            java.lang.String r0 = "max_custom_question_toast_impression"
            X.WYZ.A03(r3, r2, r6, r0, r1)
            goto L_0x0081
        L_0x00a5:
            r0 = 1853205897(0x6e75ad89, float:1.9008405E28)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r9.A01
            X.Vl6 r1 = (X.C18077Vl6) r1
            boolean r0 = r9.A02
            r0 = r0 ^ 1
            r1.A06(r0)
            r0 = 374804951(0x165711d7, float:1.7373191E-25)
            goto L_0x0084
        L_0x00bb:
            r0 = 1254157338(0x4ac0ec1a, float:6321677.0)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r9.A01
            X.Vl6 r1 = (X.C18077Vl6) r1
            boolean r0 = r9.A02
            r0 = r0 ^ 1
            r1.A06(r0)
            r0 = -717972291(0xffffffffd5349cbd, float:-1.24115799E13)
            goto L_0x0084
        L_0x00d1:
            r0 = 2027681722(0x78dbf7ba, float:3.5691797E34)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r9.A01
            X.UaK r6 = (X.C15313UaK) r6
            X.U8j r1 = r6.A04()
            boolean r0 = r1 instanceof X.C16058Unl
            if (r0 != 0) goto L_0x00f7
            boolean r0 = r1 instanceof X.C16057Unk
            if (r0 == 0) goto L_0x00f7
            X.Unk r1 = (X.C16057Unk) r1
            X.WYY r5 = r1.A04
            java.lang.String r3 = r1.A00
            boolean r2 = r1.A00
            java.lang.String r1 = "discard_confirmation_dialog_leave_button"
            java.lang.String r0 = "click"
            X.WYY.A01(r5, r1, r0, r3, r2)
        L_0x00f7:
            boolean r0 = r9.A02
            if (r0 != 0) goto L_0x0106
            X.U8j r0 = r6.A04()
            boolean r0 = r0.A05()
            r1 = 1
            if (r0 != 0) goto L_0x0107
        L_0x0106:
            r1 = 0
        L_0x0107:
            boolean r0 = r6 instanceof X.C16007Umo
            if (r0 == 0) goto L_0x0112
            X.Umo r6 = (X.C16007Umo) r6
            r0 = r1 ^ 1
            X.C16007Umo.A02(r6, r0)
        L_0x0112:
            r0 = -1918547537(0xffffffff8da549af, float:-1.0186649E-30)
            goto L_0x0084
        L_0x0117:
            r0 = -650708276(0xffffffffd936facc, float:-3.21901249E15)
            int r4 = X.AnonymousClass0fD.A05(r0)
            boolean r0 = r9.A02
            java.lang.Object r6 = r9.A01
            X.UaN r6 = (X.C15315UaN) r6
            if (r0 == 0) goto L_0x015c
            X.U8w r1 = r6.A02()
            boolean r0 = r1 instanceof X.C16045UnY
            if (r0 == 0) goto L_0x014e
            X.UnY r1 = (X.C16045UnY) r1
            X.WYZ r5 = r1.A02
            java.lang.Long r3 = r1.A05
            java.lang.String r2 = X.C14786U8w.A00(r1)
            java.lang.String r1 = "lead_gen_create_form"
            java.lang.String r0 = "welcome_message_set"
            X.WYZ.A02(r5, r3, r1, r0, r2)
        L_0x013f:
            X.U8w r0 = r6.A02()
            r1 = 0
            X.05G r0 = r0.A07
            X.AnonymousClass7TF.A1O(r0, r1)
        L_0x0149:
            r0 = 1979365332(0x75fab7d4, float:6.3564585E32)
            goto L_0x0084
        L_0x014e:
            X.UnZ r1 = (X.C16046UnZ) r1
            X.WYX r3 = r1.A00
            java.lang.Long r2 = r1.A04
            java.lang.String r1 = "lead_gen_create_form"
            java.lang.String r0 = "welcome_message_set"
            X.WYX.A01(r3, r2, r1, r0)
            goto L_0x013f
        L_0x015c:
            X.U8w r6 = r6.A02()
            android.content.Context r5 = X.AnonymousClass7TE.A0S(r10)
            X.05G r0 = r6.A06
            boolean r0 = X.DbX.A1b(r0)
            if (r0 != 0) goto L_0x0149
            boolean r0 = r6 instanceof X.C16045UnY
            if (r0 == 0) goto L_0x01b9
            r0 = r6
            X.UnY r0 = (X.C16045UnY) r0
            X.WYZ r7 = r0.A02
            java.lang.Long r3 = r0.A05
            java.lang.String r2 = X.C14786U8w.A00(r0)
            java.lang.String r1 = "lead_gen_create_form"
            java.lang.String r0 = "review_form"
            X.WYZ.A02(r7, r3, r1, r0, r2)
        L_0x0182:
            java.lang.String r0 = r6.A03()
            boolean r1 = X.C51966G9m.A1X(r0)
            X.05G r0 = r6.A05
            boolean r0 = X.DbX.A1b(r0)
            if (r0 == 0) goto L_0x01a9
            if (r1 != 0) goto L_0x01a9
            r6.A08()
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            X.6oS r5 = X.C318116oQ.A00(r6)
            r1 = 0
            r0 = 46
            X.MH0 r3 = new X.MH0
            r3.<init>((java.lang.Object) r2, (java.lang.Object) r6, (X.AnonymousClass4D7) r1, (int) r0)
        L_0x01a5:
            X.AnonymousClass7TE.A1Z(r3, r5)
            goto L_0x0149
        L_0x01a9:
            r6.A09(r5)
            X.6oS r5 = X.C318116oQ.A00(r6)
            r1 = 0
            r0 = 22
            X.MFT r3 = new X.MFT
            r3.<init>(r6, r1, r0)
            goto L_0x01a5
        L_0x01b9:
            r0 = r6
            X.UnZ r0 = (X.C16046UnZ) r0
            X.WYX r3 = r0.A00
            java.lang.Long r2 = r0.A04
            java.lang.String r1 = "lead_gen_create_form"
            java.lang.String r0 = "review_form"
            X.WYX.A01(r3, r2, r1, r0)
            goto L_0x0182
        L_0x01c8:
            r0 = 110803575(0x69aba77, float:5.8202347E-35)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r9.A01
            X.UaN r3 = (X.C15315UaN) r3
            X.U8w r1 = r3.A02()
            boolean r0 = r1 instanceof X.C16045UnY
            if (r0 == 0) goto L_0x02b3
            X.UnY r1 = (X.C16045UnY) r1
            X.WYZ r6 = r1.A02
            java.lang.Long r2 = r1.A05
            java.lang.String r1 = X.C14786U8w.A00(r1)
            java.lang.String r5 = "lead_gen_create_form"
            java.lang.String r0 = "add_custom_question_button_click"
            X.WYZ.A02(r6, r2, r5, r0, r1)
        L_0x01ec:
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x0283
            android.view.View r0 = X.C13991Tnr.A06(r3)
            X.0nA.A0N(r0)
            X.U8w r1 = r3.A02()
            boolean r0 = r1 instanceof X.C16046UnZ
            if (r0 == 0) goto L_0x0220
            X.UnZ r1 = (X.C16046UnZ) r1
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x0220
            X.U8w r6 = r3.A02()
            android.content.Context r5 = X.AnonymousClass7TE.A0S(r10)
            X.Uwe r2 = X.C16534Uwe.MULTIPLE_CHOICE
            X.U8w r0 = r3.A02()
            int r1 = r0.A01()
            r0 = 1
            r6.A0A(r5, r2, r1, r0)
        L_0x021b:
            r0 = -2130827413(0xffffffff80fe276b, float:-2.3340357E-38)
            goto L_0x0084
        L_0x0220:
            X.U8w r1 = r3.A02()
            boolean r0 = r1 instanceof X.C16045UnY
            if (r0 == 0) goto L_0x0277
            X.UnY r1 = (X.C16045UnY) r1
            X.WYZ r6 = r1.A02
            java.lang.Long r2 = r1.A05
            java.lang.String r1 = X.C14786U8w.A00(r1)
            java.lang.String r0 = "add_custom_question_dialog_impression"
            X.WYZ.A03(r6, r2, r5, r0, r1)
        L_0x0237:
            android.content.Context r1 = r3.requireContext()
            X.U8w r0 = r3.A02()
            com.instagram.common.session.UserSession r0 = r0.A02()
            X.Dg1 r5 = new X.Dg1
            r5.<init>(r1, r0)
            r0 = 2131964794(0x7f13337a, float:1.956638E38)
            java.lang.String r1 = r3.getString(r0)
            r0 = 2131964793(0x7f133379, float:1.9566378E38)
            java.lang.String r0 = r3.getString(r0)
            r5.A0D(r1, r0)
            r2 = 2131964791(0x7f133377, float:1.9566374E38)
            r1 = 59
            X.WB9 r0 = new X.WB9
            r0.<init>((java.lang.Object) r3, (int) r1)
            r5.A04(r0, r2)
            r2 = 2131964792(0x7f133378, float:1.9566376E38)
            r1 = 60
            X.WB9 r0 = new X.WB9
            r0.<init>((java.lang.Object) r3, (int) r1)
            r5.A04(r0, r2)
            X.C49945FFy.A00(r3, r5)
            goto L_0x021b
        L_0x0277:
            X.UnZ r1 = (X.C16046UnZ) r1
            X.WYX r2 = r1.A00
            java.lang.Long r1 = r1.A04
            java.lang.String r0 = "add_custom_question_dialog_impression"
            X.WYX.A02(r2, r1, r5, r0)
            goto L_0x0237
        L_0x0283:
            android.content.Context r1 = r3.getContext()
            r0 = 2131964757(0x7f133355, float:1.9566305E38)
            X.C59689JTv.A07(r1, r0)
            X.U8w r1 = r3.A02()
            boolean r0 = r1 instanceof X.C16045UnY
            if (r0 == 0) goto L_0x02a6
            X.UnY r1 = (X.C16045UnY) r1
            X.WYZ r3 = r1.A02
            java.lang.Long r2 = r1.A05
            java.lang.String r1 = X.C14786U8w.A00(r1)
            java.lang.String r0 = "max_custom_question_toast_impression"
            X.WYZ.A03(r3, r2, r5, r0, r1)
            goto L_0x021b
        L_0x02a6:
            X.UnZ r1 = (X.C16046UnZ) r1
            X.WYX r2 = r1.A00
            java.lang.Long r1 = r1.A04
            java.lang.String r0 = "max_custom_question_toast_impression"
            X.WYX.A02(r2, r1, r5, r0)
            goto L_0x021b
        L_0x02b3:
            X.UnZ r1 = (X.C16046UnZ) r1
            X.WYX r2 = r1.A00
            java.lang.Long r1 = r1.A04
            java.lang.String r5 = "lead_gen_create_form"
            java.lang.String r0 = "add_custom_question_button_click"
            X.WYX.A01(r2, r1, r5, r0)
            goto L_0x01ec
        L_0x02c2:
            r0 = -1337054650(0xffffffffb04e2a46, float:-7.500244E-10)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r9.A01
            X.6s0 r2 = (X.C320216s0) r2
            boolean r1 = r9.A02
            java.lang.String r0 = "see_all_in_header"
            r2.A0G(r1, r0)
            r0 = -558700500(0xffffffffdeb2e82c, float:-6.4458012E18)
            goto L_0x0084
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WB2.onClick(android.view.View):void");
    }

    public WB2(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }
}

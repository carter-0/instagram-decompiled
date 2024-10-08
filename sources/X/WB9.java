package X;

import android.view.View;

public final class WB9 implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public WB9(UZ2 uz2, int i) {
        this.A00 = i;
        this.A01 = uz2;
    }

    public static void A00(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new WB9(obj, i), view);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r38) {
        /*
            r37 = this;
            r1 = r37
            int r0 = r1.A00
            r8 = r38
            switch(r0) {
                case 0: goto L_0x0d63;
                case 1: goto L_0x0d18;
                case 2: goto L_0x0d03;
                case 3: goto L_0x0cd0;
                case 4: goto L_0x0cbb;
                case 5: goto L_0x0ca6;
                case 6: goto L_0x0c92;
                case 7: goto L_0x0c7b;
                case 8: goto L_0x0c64;
                case 9: goto L_0x0c33;
                case 10: goto L_0x0bf5;
                case 11: goto L_0x0bcc;
                case 12: goto L_0x0baa;
                case 13: goto L_0x0b9e;
                case 14: goto L_0x0b5a;
                case 15: goto L_0x0b16;
                case 16: goto L_0x0ad2;
                case 17: goto L_0x0a8e;
                case 18: goto L_0x0a1b;
                case 19: goto L_0x0a08;
                case 20: goto L_0x09c7;
                case 21: goto L_0x09b6;
                case 22: goto L_0x0996;
                case 23: goto L_0x0976;
                case 24: goto L_0x0948;
                case 25: goto L_0x0935;
                case 26: goto L_0x0920;
                case 27: goto L_0x090b;
                case 28: goto L_0x08f6;
                case 29: goto L_0x08cf;
                case 30: goto L_0x08a8;
                case 31: goto L_0x0893;
                case 32: goto L_0x087e;
                case 33: goto L_0x085d;
                case 34: goto L_0x084a;
                case 35: goto L_0x0826;
                case 36: goto L_0x0811;
                case 37: goto L_0x07f3;
                case 38: goto L_0x07d1;
                case 39: goto L_0x077e;
                case 40: goto L_0x0727;
                case 41: goto L_0x06c6;
                case 42: goto L_0x06b3;
                case 43: goto L_0x06a0;
                case 44: goto L_0x068b;
                case 45: goto L_0x0678;
                case 46: goto L_0x05e8;
                case 47: goto L_0x05d5;
                case 48: goto L_0x05b1;
                case 49: goto L_0x058d;
                case 50: goto L_0x04fa;
                case 51: goto L_0x04a6;
                case 52: goto L_0x0468;
                case 53: goto L_0x043a;
                case 54: goto L_0x03f7;
                case 55: goto L_0x03dc;
                case 56: goto L_0x03c1;
                case 57: goto L_0x03a6;
                case 58: goto L_0x038f;
                case 59: goto L_0x0369;
                case 60: goto L_0x0343;
                case 61: goto L_0x0317;
                case 62: goto L_0x02a3;
                case 63: goto L_0x022f;
                case 64: goto L_0x01f1;
                case 65: goto L_0x0157;
                case 66: goto L_0x0116;
                case 67: goto L_0x00d4;
                case 68: goto L_0x0066;
                case 69: goto L_0x0039;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 72953998(0x459308e, float:2.5530523E-36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UaF r1 = (X.C15308UaF) r1
            X.U8i r3 = r1.A01()
            X.Uwe r2 = X.C16534Uwe.SHORT_ANSWER
            X.05G r1 = r3.A09
            r1.Epw(r2)
            X.VOI r2 = r3.A04
            java.lang.String r4 = r3.A00()
            r1 = 0
            X.0qQ.A0B(r4, r1)
            X.XB6 r3 = r2.A00
            java.lang.String r2 = "lead_gen_custom_question"
            java.lang.String r1 = "custom_question_change_to_short_answer"
            X.XB6.A01(r3, r4, r2, r1)
            r1 = -968035477(0xffffffffc64cf36b, float:-13116.8545)
        L_0x0035:
            X.AnonymousClass0fD.A0C(r1, r0)
        L_0x0038:
            return
        L_0x0039:
            r0 = -133209041(0xfffffffff80f642f, float:-1.1633288E34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UaF r1 = (X.C15308UaF) r1
            X.U8i r3 = r1.A01()
            X.Uwe r2 = X.C16534Uwe.MULTIPLE_CHOICE
            X.05G r1 = r3.A09
            r1.Epw(r2)
            X.VOI r2 = r3.A04
            java.lang.String r4 = r3.A00()
            r1 = 0
            X.0qQ.A0B(r4, r1)
            X.XB6 r3 = r2.A00
            java.lang.String r2 = "lead_gen_custom_question"
            java.lang.String r1 = "custom_question_change_to_multiple_choice"
            X.XB6.A01(r3, r4, r2, r1)
            r1 = 433587431(0x19d804e7, float:2.2335857E-23)
            goto L_0x0035
        L_0x0066:
            r0 = 267190698(0xfed01aa, float:2.3370645E-29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UaF r1 = (X.C15308UaF) r1
            X.U8i r4 = r1.A01()
            boolean r2 = r4 instanceof X.C16049Unc
            if (r2 == 0) goto L_0x00ce
            r1 = r4
            X.Unc r1 = (X.C16049Unc) r1
            boolean r1 = r1.A04
        L_0x007e:
            if (r1 == 0) goto L_0x008e
            if (r2 == 0) goto L_0x00c1
            r3 = r4
            X.Unc r3 = (X.C16049Unc) r3
            com.instagram.leadgen.organic.model.LeadGenFormData r1 = r3.A02
            java.util.ArrayList r2 = r1.A06
            int r1 = r3.A00
            r2.remove(r1)
        L_0x008e:
            r5 = 0
            r4.A00 = r5
            X.05G r1 = r4.A09
            java.lang.Object r3 = r1.getValue()
            X.Uwe r2 = X.C16534Uwe.MULTIPLE_CHOICE
            X.VOI r1 = r4.A04
            java.lang.String r7 = r4.A00()
            X.0qQ.A0B(r7, r5)
            X.XB6 r5 = r1.A00
            java.lang.String r8 = "lead_gen_custom_question"
            if (r3 != r2) goto L_0x00be
            java.lang.String r9 = "custom_multiple_choice_question_delete"
        L_0x00aa:
            java.lang.String r10 = "click"
            r6 = 0
            r5.Cgq(r6, r7, r8, r9, r10)
            X.6oS r2 = X.C318116oQ.A00(r4)
            r1 = 26
            X.C13991Tnr.A1L(r4, r2, r1)
            r1 = 1834197984(0x6d53a3e0, float:4.0937156E27)
            goto L_0x0035
        L_0x00be:
            java.lang.String r9 = "custom_short_answer_question_delete"
            goto L_0x00aa
        L_0x00c1:
            r3 = r4
            X.Und r3 = (X.C16050Und) r3
            com.instagram.business.promote.model.PromoteData r1 = r3.A01
            java.util.List r2 = r1.A1t
            int r1 = r3.A00
            r2.remove(r1)
            goto L_0x008e
        L_0x00ce:
            r1 = r4
            X.Und r1 = (X.C16050Und) r1
            boolean r1 = r1.A05
            goto L_0x007e
        L_0x00d4:
            r0 = -43747000(0xfffffffffd647948, float:-1.8980857E37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.Uap r7 = (X.C15339Uap) r7
            X.0eM r6 = r7.A05
            java.lang.Object r1 = r6.getValue()
            X.U8n r1 = (X.C14777U8n) r1
            X.Vs9 r2 = r1.A03
            X.XB6 r5 = r2.A00
            if (r5 == 0) goto L_0x00fb
            java.lang.String r4 = r2.A01
            r1 = 0
            android.os.Bundle r3 = X.C18460Vs9.A00(r2, r1)
            java.lang.String r2 = "lead_gen_creatives_context_card"
            java.lang.String r1 = "creatives_context_card_continue_click"
            X.XB6.A00(r3, r5, r4, r2, r1)
        L_0x00fb:
            X.W1T r5 = X.W1T.A00
            java.lang.Object r1 = r6.getValue()
            X.U8n r1 = (X.C14777U8n) r1
            com.instagram.common.session.UserSession r9 = r1.A02
            X.Umf r8 = new X.Umf
            r8.<init>()
            android.os.Bundle r6 = r7.mArguments
            r10 = 0
            r11 = 1
            r5.A02(r6, r7, r8, r9, r10, r11)
            r1 = 1879206924(0x70026c0c, float:1.6145469E29)
            goto L_0x0035
        L_0x0116:
            r0 = 1716718853(0x66530d05, float:2.4916487E23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.UaN r6 = (X.C15315UaN) r6
            X.U8w r1 = r6.A02()
            r1.A04()
            X.U8w r2 = r6.A02()
            boolean r1 = r2 instanceof X.C16045UnY
            if (r1 == 0) goto L_0x0149
            X.UnY r2 = (X.C16045UnY) r2
            X.WYZ r5 = r2.A02
            java.lang.Long r4 = r2.A05
            java.lang.String r3 = X.C14786U8w.A00(r2)
            java.lang.String r2 = "lead_gen_create_form"
            java.lang.String r1 = "discard_form_confirmation_action_sheet_confirm_discard"
            X.WYZ.A02(r5, r4, r2, r1, r3)
        L_0x0141:
            r6.A03()
            r1 = 458392743(0x1b5284a7, float:1.7413655E-22)
            goto L_0x0035
        L_0x0149:
            X.UnZ r2 = (X.C16046UnZ) r2
            X.WYX r4 = r2.A00
            java.lang.Long r3 = r2.A04
            java.lang.String r2 = "lead_gen_create_form"
            java.lang.String r1 = "discard_form_confirmation_action_sheet_confirm_discard"
            X.WYX.A01(r4, r3, r2, r1)
            goto L_0x0141
        L_0x0157:
            r0 = 939503323(0x37ffaedb, float:3.0479792E-5)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UaN r1 = (X.C15315UaN) r1
            X.U8w r5 = r1.A02()
            android.content.Context r6 = X.AnonymousClass7TE.A0S(r8)
            X.05G r1 = r5.A06
            boolean r1 = X.DbX.A1b(r1)
            if (r1 != 0) goto L_0x01af
            boolean r3 = r5 instanceof X.C16045UnY
            if (r3 != 0) goto L_0x01cc
            r2 = r5
            X.UnZ r2 = (X.C16046UnZ) r2
            java.lang.String r1 = r2.A05
            if (r1 == 0) goto L_0x01cc
            r8 = 1
            X.WYX r4 = r2.A00
            java.lang.Long r3 = r2.A04
            java.lang.String r2 = "lead_gen_create_form"
            java.lang.String r1 = "next"
            X.WYX.A01(r4, r3, r2, r1)
        L_0x0189:
            java.lang.String r1 = r5.A03()
            boolean r2 = X.C51966G9m.A1X(r1)
            X.05G r1 = r5.A05
            boolean r1 = X.DbX.A1b(r1)
            if (r1 == 0) goto L_0x01b4
            if (r2 != 0) goto L_0x01b4
            r5.A08()
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            X.6oS r6 = X.C318116oQ.A00(r5)
            r2 = 0
            r1 = 46
            X.MH0 r4 = new X.MH0
            r4.<init>((java.lang.Object) r3, (java.lang.Object) r5, (X.AnonymousClass4D7) r2, (int) r1)
        L_0x01ac:
            X.AnonymousClass7TE.A1Z(r4, r6)
        L_0x01af:
            r1 = 714506195(0x2a967fd3, float:2.6734048E-13)
            goto L_0x0035
        L_0x01b4:
            r5.A09(r6)
            if (r8 == 0) goto L_0x01c6
            X.6oS r6 = X.C318116oQ.A00(r5)
            r2 = 0
            r1 = 21
            X.MFT r4 = new X.MFT
            r4.<init>(r5, r2, r1)
            goto L_0x01ac
        L_0x01c6:
            r2 = 0
            r1 = 0
            r5.A0B(r6, r2, r1)
            goto L_0x01af
        L_0x01cc:
            r8 = 0
            if (r3 == 0) goto L_0x01e2
            r1 = r5
            X.UnY r1 = (X.C16045UnY) r1
            X.WYZ r7 = r1.A02
            java.lang.Long r4 = r1.A05
            java.lang.String r3 = X.C14786U8w.A00(r1)
            java.lang.String r2 = "lead_gen_create_form"
            java.lang.String r1 = "done"
            X.WYZ.A02(r7, r4, r2, r1, r3)
            goto L_0x0189
        L_0x01e2:
            r1 = r5
            X.UnZ r1 = (X.C16046UnZ) r1
            X.WYX r4 = r1.A00
            java.lang.Long r3 = r1.A04
            java.lang.String r2 = "lead_gen_create_form"
            java.lang.String r1 = "done"
            X.WYX.A01(r4, r3, r2, r1)
            goto L_0x0189
        L_0x01f1:
            r0 = -1620406034(0xffffffff9f6a90ee, float:-4.967131E-20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UaN r1 = (X.C15315UaN) r1
            X.U8w r6 = r1.A02()
            android.content.Context r5 = X.AnonymousClass7TE.A0S(r8)
            X.05G r1 = r6.A06
            boolean r1 = X.DbX.A1b(r1)
            if (r1 != 0) goto L_0x022a
            boolean r1 = r6 instanceof X.C16045UnY
            if (r1 != 0) goto L_0x021e
            r1 = r6
            X.UnZ r1 = (X.C16046UnZ) r1
            X.WYX r4 = r1.A00
            java.lang.Long r3 = r1.A04
            java.lang.String r2 = "lead_gen_create_form"
            java.lang.String r1 = "see_all_customer_info_click"
            X.WYX.A01(r4, r3, r2, r1)
        L_0x021e:
            r6.A09(r5)
            X.6oS r2 = X.C318116oQ.A00(r6)
            r1 = 23
            X.C13991Tnr.A1L(r6, r2, r1)
        L_0x022a:
            r1 = -35545759(0xfffffffffde19d61, float:-3.7486682E37)
            goto L_0x0035
        L_0x022f:
            r0 = -1183952385(0xffffffffb96e51ff, float:-2.2727995E-4)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.UaN r6 = (X.C15315UaN) r6
            X.U8w r1 = r6.A02()
            X.2Fk r1 = r1.A00
            java.lang.Object r1 = r1.A02()
            X.Jvy r1 = (X.C61060Jvy) r1
            if (r1 == 0) goto L_0x027b
            java.lang.Object r1 = r1.A01
            if (r1 == 0) goto L_0x027b
            X.U8w r2 = r6.A02()
            boolean r1 = r2 instanceof X.C16045UnY
            if (r1 == 0) goto L_0x026d
            X.UnY r2 = (X.C16045UnY) r2
            X.WYZ r5 = r2.A02
            java.lang.Long r4 = r2.A05
            java.lang.String r3 = X.C14786U8w.A00(r2)
            java.lang.String r2 = "lead_gen_create_form"
            java.lang.String r1 = "edit_cover_photo_image_click"
            X.WYZ.A02(r5, r4, r2, r1, r3)
        L_0x0265:
            X.C15315UaN.A00(r6)
            r1 = -394858403(0xffffffffe876f05d, float:-4.6645443E24)
            goto L_0x0035
        L_0x026d:
            X.UnZ r2 = (X.C16046UnZ) r2
            X.WYX r4 = r2.A00
            java.lang.Long r3 = r2.A04
            java.lang.String r2 = "lead_gen_create_form"
            java.lang.String r1 = "edit_cover_photo_image_click"
            X.WYX.A01(r4, r3, r2, r1)
            goto L_0x0265
        L_0x027b:
            X.U8w r2 = r6.A02()
            boolean r1 = r2 instanceof X.C16045UnY
            if (r1 == 0) goto L_0x0295
            X.UnY r2 = (X.C16045UnY) r2
            X.WYZ r5 = r2.A02
            java.lang.Long r4 = r2.A05
            java.lang.String r3 = X.C14786U8w.A00(r2)
            java.lang.String r2 = "lead_gen_create_form"
            java.lang.String r1 = "add_cover_photo_image_click"
            X.WYZ.A02(r5, r4, r2, r1, r3)
            goto L_0x0265
        L_0x0295:
            X.UnZ r2 = (X.C16046UnZ) r2
            X.WYX r4 = r2.A00
            java.lang.Long r3 = r2.A04
            java.lang.String r2 = "lead_gen_create_form"
            java.lang.String r1 = "add_cover_photo_image_click"
            X.WYX.A01(r4, r3, r2, r1)
            goto L_0x0265
        L_0x02a3:
            r0 = -1622066669(0xffffffff9f513a13, float:-4.430551E-20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.UaN r6 = (X.C15315UaN) r6
            X.U8w r1 = r6.A02()
            X.2Fk r1 = r1.A00
            java.lang.Object r1 = r1.A02()
            X.Jvy r1 = (X.C61060Jvy) r1
            if (r1 == 0) goto L_0x02ef
            java.lang.Object r1 = r1.A01
            if (r1 == 0) goto L_0x02ef
            X.U8w r2 = r6.A02()
            boolean r1 = r2 instanceof X.C16045UnY
            if (r1 == 0) goto L_0x02e1
            X.UnY r2 = (X.C16045UnY) r2
            X.WYZ r5 = r2.A02
            java.lang.Long r4 = r2.A05
            java.lang.String r3 = X.C14786U8w.A00(r2)
            java.lang.String r2 = "lead_gen_create_form"
            java.lang.String r1 = "edit_cover_photo_text_click"
            X.WYZ.A02(r5, r4, r2, r1, r3)
        L_0x02d9:
            X.C15315UaN.A00(r6)
            r1 = -138067227(0xfffffffff7c542e5, float:-8.001869E33)
            goto L_0x0035
        L_0x02e1:
            X.UnZ r2 = (X.C16046UnZ) r2
            X.WYX r4 = r2.A00
            java.lang.Long r3 = r2.A04
            java.lang.String r2 = "lead_gen_create_form"
            java.lang.String r1 = "edit_cover_photo_text_click"
            X.WYX.A01(r4, r3, r2, r1)
            goto L_0x02d9
        L_0x02ef:
            X.U8w r2 = r6.A02()
            boolean r1 = r2 instanceof X.C16045UnY
            if (r1 == 0) goto L_0x0309
            X.UnY r2 = (X.C16045UnY) r2
            X.WYZ r5 = r2.A02
            java.lang.Long r4 = r2.A05
            java.lang.String r3 = X.C14786U8w.A00(r2)
            java.lang.String r2 = "lead_gen_create_form"
            java.lang.String r1 = "add_cover_photo_text_click"
            X.WYZ.A02(r5, r4, r2, r1, r3)
            goto L_0x02d9
        L_0x0309:
            X.UnZ r2 = (X.C16046UnZ) r2
            X.WYX r4 = r2.A00
            java.lang.Long r3 = r2.A04
            java.lang.String r2 = "lead_gen_create_form"
            java.lang.String r1 = "add_cover_photo_text_click"
            X.WYX.A01(r4, r3, r2, r1)
            goto L_0x02d9
        L_0x0317:
            r0 = 709010467(0x2a42a423, float:1.7287608E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UaN r1 = (X.C15315UaN) r1
            X.U8w r3 = r1.A02()
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r8)
            X.05G r1 = r3.A06
            boolean r1 = X.DbX.A1b(r1)
            if (r1 != 0) goto L_0x033e
            r3.A09(r2)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 20
            X.C13991Tnr.A1L(r3, r2, r1)
        L_0x033e:
            r1 = -1121339583(0xffffffffbd29b741, float:-0.04143453)
            goto L_0x0035
        L_0x0343:
            r0 = 1845446415(0x6dff470f, float:9.875573E27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UaN r1 = (X.C15315UaN) r1
            X.U8w r5 = r1.A02()
            android.content.Context r4 = X.AnonymousClass7TE.A0S(r8)
            X.Uwe r3 = X.C16534Uwe.SHORT_ANSWER
            X.U8w r1 = r1.A02()
            int r2 = r1.A01()
            r1 = 1
            r5.A0A(r4, r3, r2, r1)
            r1 = 137020280(0x82ac378, float:5.1387287E-34)
            goto L_0x0035
        L_0x0369:
            r0 = 1640575976(0x61c933e8, float:4.6394197E20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UaN r1 = (X.C15315UaN) r1
            X.U8w r5 = r1.A02()
            android.content.Context r4 = X.AnonymousClass7TE.A0S(r8)
            X.Uwe r3 = X.C16534Uwe.MULTIPLE_CHOICE
            X.U8w r1 = r1.A02()
            int r2 = r1.A01()
            r1 = 1
            r5.A0A(r4, r3, r2, r1)
            r1 = -972639434(0xffffffffc606b336, float:-8620.803)
            goto L_0x0035
        L_0x038f:
            r0 = -2106687712(0xffffffff826e7f20, float:-1.7521962E-37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.0SM r1 = (X.0SM) r1
            android.app.Dialog r1 = r1.A01
            if (r1 == 0) goto L_0x03a1
            r1.dismiss()
        L_0x03a1:
            r1 = -1546337273(0xffffffffa3d4c407, float:-2.3068107E-17)
            goto L_0x0035
        L_0x03a6:
            r0 = 1246851263(0x4a5170bf, float:3431471.8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UYh r1 = (X.C15267UYh) r1
            X.U8P r1 = r1.A07()
            X.UnQ r1 = (X.C16037UnQ) r1
            X.Vgk r1 = r1.A06
            r1.A00()
            r1 = 717627617(0x2ac620e1, float:3.519468E-13)
            goto L_0x0035
        L_0x03c1:
            r0 = 1280707580(0x4c560bfc, float:5.6111088E7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UYh r1 = (X.C15267UYh) r1
            X.U8P r1 = r1.A07()
            X.UnQ r1 = (X.C16037UnQ) r1
            X.Vgk r1 = r1.A06
            r1.A00()
            r1 = -737418253(0xffffffffd40be3f3, float:-2.40329923E12)
            goto L_0x0035
        L_0x03dc:
            r0 = -1014891563(0xffffffffc381fbd5, float:-259.96744)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UYh r1 = (X.C15267UYh) r1
            X.U8P r1 = r1.A07()
            X.UnQ r1 = (X.C16037UnQ) r1
            X.Vgk r1 = r1.A06
            r1.A00()
            r1 = -1059386282(0xffffffffc0db0c56, float:-6.845256)
            goto L_0x0035
        L_0x03f7:
            r0 = -107945926(0xfffffffff990e03a, float:-9.402983E34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.Ume r6 = (X.C15997Ume) r6
            X.U8P r1 = r6.A07()
            X.UnQ r1 = (X.C16037UnQ) r1
            X.Vgk r1 = r1.A06
            X.XB6 r5 = r1.A00
            java.lang.String r4 = r1.A01
            java.lang.String r2 = r1.A02
            java.lang.String r1 = "form_id"
            android.os.Bundle r3 = X.DbY.A0B(r1, r2)
            java.lang.String r2 = "lead_gen_full_page_context_card"
            java.lang.String r1 = "full_page_context_card_continue_click"
            X.XB6.A00(r3, r5, r4, r2, r1)
            X.W1T r4 = X.W1T.A00
            X.0eM r1 = r6.A0B
            java.lang.Object r1 = r1.getValue()
            X.UnQ r1 = (X.C16037UnQ) r1
            com.instagram.common.session.UserSession r8 = r1.A04
            X.Umf r7 = new X.Umf
            r7.<init>()
            android.os.Bundle r5 = r6.mArguments
            r9 = 0
            r10 = 1
            r4.A02(r5, r6, r7, r8, r9, r10)
            r1 = 1734411765(0x676105f5, float:1.06264235E24)
            goto L_0x0035
        L_0x043a:
            r0 = 583756393(0x22cb6a69, float:5.5135926E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.UYh r6 = (X.C15267UYh) r6
            X.U8P r1 = r6.A07()
            X.UnQ r1 = (X.C16037UnQ) r1
            X.Vgk r1 = r1.A06
            X.XB6 r5 = r1.A00
            java.lang.String r4 = r1.A01
            java.lang.String r2 = r1.A02
            java.lang.String r1 = "form_id"
            android.os.Bundle r3 = X.DbY.A0B(r1, r2)
            java.lang.String r2 = "lead_gen_full_page_context_card"
            java.lang.String r1 = "form_close"
            X.XB6.A00(r3, r5, r4, r2, r1)
            X.DbX.A1J(r6)
            r1 = -1131074282(0xffffffffbc952d16, float:-0.018209975)
            goto L_0x0035
        L_0x0468:
            r0 = 137383380(0x8304dd4, float:5.305456E-34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Ua2 r1 = (X.C15296Ua2) r1
            X.U8S r3 = r1.A00()
            X.VOH r2 = r3.A00
            boolean r1 = r3 instanceof X.C16036UnP
            if (r1 == 0) goto L_0x04a0
            r1 = r3
            X.UnP r1 = (X.C16036UnP) r1
            java.lang.String r6 = r1.A02
        L_0x0482:
            r1 = 0
            X.0qQ.A0B(r6, r1)
            X.XB6 r4 = r2.A00
            java.lang.String r7 = "lead_gen_advanced_setting"
            java.lang.String r8 = "edit_form_name"
            java.lang.String r9 = "click"
            r5 = 0
            r4.Cgq(r5, r6, r7, r8, r9)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 19
            X.C13991Tnr.A1L(r3, r2, r1)
            r1 = 1912819036(0x72034d5c, float:2.6007077E30)
            goto L_0x0035
        L_0x04a0:
            r1 = r3
            X.UnO r1 = (X.C16035UnO) r1
            java.lang.String r6 = r1.A02
            goto L_0x0482
        L_0x04a6:
            r0 = -44379230(0xfffffffffd5ad3a2, float:-1.817941E37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.W1A r5 = (X.W1A) r5
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            X.WWa r1 = r5.A03
            java.lang.String r2 = r1.A05
            java.lang.String r1 = "target_user_id"
            r3.put(r1, r2)
            r1 = 760(0x2f8, float:1.065E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            java.lang.String r1 = "FeedAds"
            r3.put(r2, r1)
            r1 = 45
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.DiU r4 = X.C46649DiU.A04(r1, r3)
            android.app.Activity r3 = r5.A00
            com.instagram.common.session.UserSession r1 = r5.A01
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r2.<init>((X.0lg) r1)
            r1 = 2131951988(0x7f130174, float:1.9540406E38)
            java.lang.String r1 = r3.getString(r1)
            r2.A0U = r1
            r1 = 2562(0xa02, float:3.59E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r2.A0R = r1
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r2.A0P = r1
            r4.A0D(r3, r2)
            r1 = -713085304(0xffffffffd57f2e88, float:-1.75359572E13)
            goto L_0x0035
        L_0x04fa:
            r0 = -1149393508(0xffffffffbb7da59c, float:-0.0038703447)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.W1A r2 = (X.W1A) r2
            r1 = 5383(0x1507, float:7.543E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.W1A.A01(r2, r1)
            com.instagram.common.session.UserSession r1 = r2.A01
            com.instagram.bloks.hosting.IgBloksScreenConfig r8 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r8.<init>((X.0lg) r1)
            android.app.Activity r7 = r2.A00
            r1 = 2131976735(0x7f13621f, float:1.9590599E38)
            java.lang.String r1 = r7.getString(r1)
            r8.A0U = r1
            r12 = 0
            r8.A0l = r12
            r1 = 2823(0xb07, float:3.956E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r1)
            r8.A0R = r9
            r6 = 0
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r10 = 1
            java.util.BitSet r3 = new java.util.BitSet
            r3.<init>(r10)
            X.WWa r14 = r2.A03
            java.lang.String r2 = r14.A03
            java.lang.String r13 = "Required value was null."
            if (r2 == 0) goto L_0x0eca
            java.lang.String r1 = "ad_id"
            r11.put(r1, r2)
            r3.set(r12)
            java.lang.String r2 = r14.A08
            if (r2 == 0) goto L_0x0ec4
            r1 = 496(0x1f0, float:6.95E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r11.put(r1, r2)
            java.lang.String r2 = "FEED"
            r1 = 4026(0xfba, float:5.642E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r11.put(r1, r2)
            int r1 = r3.nextClearBit(r12)
            if (r1 < r10) goto L_0x0ebf
            java.util.HashMap r1 = X.C359608dC.A01(r11)
            X.DiU r2 = new X.DiU
            r2.<init>(r1, r5, r9)
            r1 = -1
            X.C46649DiU.A0B(r2, r1)
            r2.A03 = r6
            r2.A02 = r6
            r2.A04 = r6
            r2.A0H(r4)
            r2.A0E(r7, r8)
            r1 = 2043619247(0x79cf27af, float:1.3445129E35)
            goto L_0x0035
        L_0x058d:
            r0 = 725884792(0x2b441f78, float:6.967686E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.W1A r5 = (X.W1A) r5
            android.app.Activity r2 = r5.A00
            r1 = 2131963366(0x7f132de6, float:1.9563483E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r1)
            X.Uz2 r3 = X.C16666Uz2.HIDE_AD_BUTTON
            X.WWa r1 = r5.A03
            java.lang.String r2 = r1.A03
            java.lang.String r1 = "hide_button"
            X.W1A.A00(r5, r3, r1, r4, r2)
            r1 = -1258907259(0xffffffffb4f69985, float:-4.593277E-7)
            goto L_0x0035
        L_0x05b1:
            r0 = 1583843752(0x5e6789a8, float:4.17101275E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.W1A r5 = (X.W1A) r5
            android.app.Activity r2 = r5.A00
            r1 = 2131972172(0x7f13504c, float:1.9581344E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r1)
            X.Uz2 r3 = X.C16666Uz2.REPORT_AD_BUTTON
            X.WWa r1 = r5.A03
            java.lang.String r2 = r1.A03
            java.lang.String r1 = "report_button"
            X.W1A.A00(r5, r3, r1, r4, r2)
            r1 = 223254231(0xd4e96d7, float:6.366022E-31)
            goto L_0x0035
        L_0x05d5:
            r0 = 1105957399(0x41eb9217, float:29.446333)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UYh r1 = (X.C15267UYh) r1
            r1.A08()
            r1 = -7283293(0xffffffffff90dda3, float:NaN)
            goto L_0x0035
        L_0x05e8:
            r0 = 483996490(0x1cd9334a, float:1.4373113E-21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.Ums r7 = (X.C16011Ums) r7
            X.0eM r3 = r7.A09
            java.lang.Object r1 = r3.getValue()
            X.UnR r1 = (X.C16038UnR) r1
            java.util.List r5 = r1.A09
            X.0eM r1 = r7.A07
            java.lang.Object r4 = r1.getValue()
            X.JgX r4 = (X.C60152JgX) r4
            r1 = 0
            X.0qQ.A0B(r5, r1)
            X.VSn r2 = new X.VSn
            r2.<init>(r5, r1)
            r4.A00 = r2
            X.05G r1 = r4.A03
            r1.Epw(r2)
            java.lang.Object r1 = r3.getValue()
            X.UnR r1 = (X.C16038UnR) r1
            X.VsC r2 = r1.A06
            java.lang.Object r1 = r3.getValue()
            X.UnR r1 = (X.C16038UnR) r1
            java.util.List r1 = r1.A09
            int r1 = r1.size()
            X.XB6 r8 = r2.A00
            java.lang.String r10 = r2.A01
            java.lang.String r13 = java.lang.String.valueOf(r1)
            java.lang.String r1 = r2.A02
            android.os.Bundle r9 = X.C18463VsC.A00(r1)
            java.lang.String r11 = "lead_gen_thank_you_screen_with_multi_submit"
            java.lang.String r12 = "multi_submit_ads_contact_button_click"
            r8.Cgq(r9, r10, r11, r12, r13)
            java.lang.Object r1 = r3.getValue()
            X.UnR r1 = (X.C16038UnR) r1
            java.util.List r1 = r1.A09
            java.util.Iterator r3 = r1.iterator()
        L_0x064a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0673
            java.lang.Object r2 = r3.next()
            X.WWa r2 = (X.C19359WWa) r2
            X.0eM r1 = r7.A08
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            X.AnonymousClass7TF.A1H(r4, r2)
            X.1Xj r6 = r2.A02
            X.4jb r5 = new X.4jb
            r5.<init>(r4, r6)
            java.lang.String r10 = "lead_ads_multi_submit"
            java.lang.String r11 = "leadads"
            r8 = 0
            r9 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            X.C233822wX.A0L(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x064a
        L_0x0673:
            r1 = 1442720659(0x55fe2b93, float:3.49328879E13)
            goto L_0x0035
        L_0x0678:
            r0 = -1011865425(0xffffffffc3b028af, float:-352.31784)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UYd r1 = (X.C15263UYd) r1
            X.C15263UYd.A01(r1)
            r1 = 1448152663(0x56510e57, float:5.746488E13)
            goto L_0x0035
        L_0x068b:
            r0 = -753708277(0xffffffffd313530b, float:-6.3275342E11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UDk r1 = (X.C14882UDk) r1
            com.instagram.igds.components.checkbox.IgdsCheckBox r1 = r1.A04
            r1.toggle()
            r1 = 1384561723(0x5286bc3b, float:2.893418E11)
            goto L_0x0035
        L_0x06a0:
            r0 = -8374781(0xffffffffff803603, float:NaN)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UZ2 r1 = (X.UZ2) r1
            r1.A01()
            r1 = -1451451560(0xffffffffa97c9b58, float:-5.608998E-14)
            goto L_0x0035
        L_0x06b3:
            r0 = -1723801016(0xffffffff9940e248, float:-9.9718645E-24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UZ2 r1 = (X.UZ2) r1
            r1.A01()
            r1 = 224385527(0xd5fd9f7, float:6.8979546E-31)
            goto L_0x0035
        L_0x06c6:
            r0 = -1849186087(0xffffffff91c7a8d9, float:-3.1500724E-28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.FTS r1 = (X.FTS) r1
            java.lang.Object r1 = r1.A01
            X.W1R r1 = (X.W1R) r1
            X.UZ2 r7 = r1.A0F
            if (r7 == 0) goto L_0x0722
            X.Vjk r2 = r7.A07
            java.lang.String r1 = "info_button_click"
            r2.A00(r1)
            X.ViP r8 = r7.A05
            androidx.fragment.app.FragmentActivity r6 = r7.requireActivity()
            X.2nI r5 = r7.A00
            java.lang.String r4 = "voting_info_center"
            r1 = 2
            X.0qQ.A0B(r5, r1)
            X.UXq r1 = r8.A00
            if (r1 == 0) goto L_0x0722
            X.V3C r1 = r1.A00
            if (r1 == 0) goto L_0x0722
            X.VW1 r1 = r1.A00
            if (r1 == 0) goto L_0x0722
            java.lang.String r3 = r1.A00
            if (r3 == 0) goto L_0x0722
            java.util.HashMap r2 = r1.A02
            if (r2 != 0) goto L_0x0707
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
        L_0x0707:
            java.lang.String r1 = "module"
            r2.put(r1, r4)
            com.instagram.common.session.UserSession r1 = r8.A03
            X.8ey r3 = X.C359988do.A05(r1, r3, r2)
            r2 = 6
            X.E85 r1 = new X.E85
            r1.<init>(r2, r5, r7, r7)
            r3.A00(r1)
            X.0gy r1 = X.AnonymousClass07i.A00(r7)
            X.1ES.A00(r6, r1, r3)
        L_0x0722:
            r1 = 587643402(0x2306ba0a, float:7.30355E-18)
            goto L_0x0035
        L_0x0727:
            r0 = -1013566302(0xffffffffc39634a2, float:-300.4112)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.FTS r1 = (X.FTS) r1
            java.lang.Object r1 = r1.A01
            X.W1R r1 = (X.W1R) r1
            X.UZ2 r6 = r1.A0F
            if (r6 == 0) goto L_0x0779
            X.Vjk r2 = r6.A07
            java.lang.String r1 = "share"
            r2.A00(r1)
            X.1as r1 = X.1as.A04
            X.1ap r3 = r1.A02
            com.instagram.common.session.UserSession r2 = r6.A01
            X.2FW r1 = X.2FW.A1l
            X.F3w r5 = r3.A07(r6, r2, r1)
            com.instagram.common.session.UserSession r4 = r6.A01
            X.0Tu r3 = X.0Tu.A05
            r1 = 2342154668483805890(0x20810143000002c2, double:4.058513648816567E-152)
            boolean r1 = X.DbY.A1Y(r3, r4, r1)
            r3 = r1 ^ 1
            android.os.Bundle r2 = r5.A07
            r1 = 438(0x1b6, float:6.14E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r2.putBoolean(r1, r3)
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r2 = r5.A00()
            androidx.fragment.app.FragmentActivity r1 = r6.getActivity()
            X.37D r1 = X.DbT.A0i(r1)
            r1.getClass()
            r1.A0I(r2)
        L_0x0779:
            r1 = -994294450(0xffffffffc4bc454e, float:-1506.1658)
            goto L_0x0035
        L_0x077e:
            r0 = 866944289(0x33ac8521, float:8.03359E-8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.FTS r1 = (X.FTS) r1
            java.lang.Object r1 = r1.A01
            X.W1R r1 = (X.W1R) r1
            X.UZ2 r6 = r1.A0F
            if (r6 == 0) goto L_0x07cc
            X.ViP r7 = r6.A05
            X.UXq r1 = r7.A00
            if (r1 == 0) goto L_0x07cc
            java.lang.String r9 = r1.A04
            if (r9 == 0) goto L_0x07cc
            android.content.Context r2 = r6.requireContext()
            com.instagram.common.session.UserSession r1 = r7.A03
            X.Dg1 r4 = new X.Dg1
            r4.<init>(r2, r1)
            r3 = 2131976729(0x7f136219, float:1.9590587E38)
            r2 = 8
            X.WB5 r1 = new X.WB5
            r1.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.String) r9, (int) r2)
            r4.A04(r1, r3)
            r1 = 2131973529(0x7f135599, float:1.9584096E38)
            r10 = 6
            X.FOu r5 = new X.FOu
            r8 = r6
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (java.lang.String) r9, (int) r10)
            r4.A04(r5, r1)
            X.FFy r2 = new X.FFy
            r2.<init>(r4)
            android.content.Context r1 = r6.requireContext()
            r2.A05(r1)
        L_0x07cc:
            r1 = 2008322892(0x77b4934c, float:7.3250076E33)
            goto L_0x0035
        L_0x07d1:
            r0 = -286005150(0xffffffffeef3e862, float:-3.7742895E28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.FTS r1 = (X.FTS) r1
            java.lang.Object r1 = r1.A01
            X.W1R r1 = (X.W1R) r1
            X.UZ2 r1 = r1.A0F
            if (r1 == 0) goto L_0x07ee
            android.app.Activity r1 = r1.getRootActivity()
            r1.getClass()
            r1.onBackPressed()
        L_0x07ee:
            r1 = 279815932(0x10ada6fc, float:6.849375E-29)
            goto L_0x0035
        L_0x07f3:
            r0 = -1547909352(0xffffffffa3bcc718, float:-2.046732E-17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.W1R r1 = (X.W1R) r1
            X.UZ2 r1 = r1.A0F
            if (r1 == 0) goto L_0x080c
            android.app.Activity r1 = r1.getRootActivity()
            r1.getClass()
            r1.onBackPressed()
        L_0x080c:
            r1 = -944985354(0xffffffffc7acaaf6, float:-88405.92)
            goto L_0x0035
        L_0x0811:
            r0 = -1074256699(0xffffffffbff824c5, float:-1.9386221)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.UZ2 r2 = (X.UZ2) r2
            X.ViP r1 = r2.A05
            r1.A00(r2, r2)
            r1 = -1294541260(0xffffffffb2d6de34, float:-2.5013925E-8)
            goto L_0x0035
        L_0x0826:
            r0 = 10987888(0xa7a970, float:1.539731E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            com.instagram.igds.components.form.IgFormField r1 = (com.instagram.igds.components.form.IgFormField) r1
            android.widget.EditText r2 = r1.getMEditText()
            boolean r1 = r1.A0J
            if (r1 == 0) goto L_0x0845
            boolean r1 = r2.isEnabled()
            if (r1 == 0) goto L_0x0845
            r2.requestFocus()
            X.0nA.A0Q(r2)
        L_0x0845:
            r1 = 1780272711(0x6a1cce47, float:4.7391636E25)
            goto L_0x0035
        L_0x084a:
            r0 = -1781384123(0xffffffff95d23c45, float:-8.4913413E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Ube r1 = (X.C15381Ube) r1
            X.C15381Ube.A05(r1)
            r1 = -1058815719(0xffffffffc0e3c119, float:-7.1173215)
            goto L_0x0035
        L_0x085d:
            r0 = -1708406096(0xffffffff9a2bcab0, float:-3.55257E-23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Ube r2 = (X.C15381Ube) r2
            X.Vt4 r1 = X.C15381Ube.A01(r2)
            X.Cux r1 = r1.A03
            if (r1 == 0) goto L_0x087a
            java.lang.String r1 = r1.A02
            X.C15381Ube.A07(r2, r1)
        L_0x0875:
            r1 = -1626717387(0xffffffff9f0a4335, float:-2.927823E-20)
            goto L_0x0035
        L_0x087a:
            X.C15381Ube.A05(r2)
            goto L_0x0875
        L_0x087e:
            r0 = -408912316(0xffffffffe7a07e44, float:-1.5158157E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.UsJ r2 = (X.C16299UsJ) r2
            java.lang.String r1 = "top_recent_posts"
            X.C16299UsJ.A06(r2, r1)
            r1 = 27412769(0x1a24921, float:5.9614336E-38)
            goto L_0x0035
        L_0x0893:
            r0 = -558909493(0xffffffffdeafb7cb, float:-6.330906E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.UsJ r2 = (X.C16299UsJ) r2
            java.lang.String r1 = "default"
            X.C16299UsJ.A06(r2, r1)
            r1 = -1873833822(0xffffffff904f90a2, float:-4.0934973E-29)
            goto L_0x0035
        L_0x08a8:
            r0 = -1609320059(0xffffffffa013b985, float:-1.2512768E-19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            com.instagram.genericsurvey.fragment.GenericSurveyFragment r3 = (com.instagram.genericsurvey.fragment.GenericSurveyFragment) r3
            android.view.ViewGroup r1 = r3.contentContainer
            r2 = 0
            if (r1 == 0) goto L_0x08bb
            r1.setVisibility(r2)
        L_0x08bb:
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r3.loadingSpinner
            if (r1 == 0) goto L_0x08c2
            r1.setVisibility(r2)
        L_0x08c2:
            android.view.ViewGroup r1 = r3.retryView
            X.AnonymousClass7TH.A0R(r1)
            com.instagram.genericsurvey.fragment.GenericSurveyFragment.A01(r3)
            r1 = 302310876(0x1204e5dc, float:4.193518E-28)
            goto L_0x0035
        L_0x08cf:
            r0 = 1608190302(0x5fdb095e, float:3.15665E19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            com.instagram.genericsurvey.fragment.AdBakeOffFragment r3 = (com.instagram.genericsurvey.fragment.AdBakeOffFragment) r3
            android.view.ViewGroup r1 = r3.contentContainer
            r2 = 0
            if (r1 == 0) goto L_0x08e2
            r1.setVisibility(r2)
        L_0x08e2:
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r3.loadingSpinner
            if (r1 == 0) goto L_0x08e9
            r1.setVisibility(r2)
        L_0x08e9:
            android.view.ViewGroup r1 = r3.retryViewGroup
            X.AnonymousClass7TH.A0R(r1)
            com.instagram.genericsurvey.fragment.AdBakeOffFragment.A01(r3)
            r1 = -121823055(0xfffffffff8bd20b1, float:-3.0687724E34)
            goto L_0x0035
        L_0x08f6:
            r0 = -713434818(0xffffffffd579d93e, float:-1.71694652E13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.VjR r1 = (X.C17989VjR) r1
            X.X7r r1 = r1.A03
            r1.D2M()
            r1 = 1535940282(0x5b8c96ba, float:7.9144445E16)
            goto L_0x0035
        L_0x090b:
            r0 = -686265696(0xffffffffd7186aa0, float:-1.67583718E14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.VjR r1 = (X.C17989VjR) r1
            X.X7r r1 = r1.A03
            r1.D3A()
            r1 = -97579026(0xfffffffffa2f0fee, float:-2.2724376E35)
            goto L_0x0035
        L_0x0920:
            r0 = -1430012728(0xffffffffaac3bcc8, float:-3.4769952E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.VjR r1 = (X.C17989VjR) r1
            X.X7r r1 = r1.A03
            r1.D2Q()
            r1 = 911847874(0x3659b1c2, float:3.2438988E-6)
            goto L_0x0035
        L_0x0935:
            r0 = 59669061(0x38e7a45, float:8.374082E-37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.6s0 r1 = (X.C320216s0) r1
            r1.A02()
            r1 = 1508530893(0x59ea5acd, float:8.2456226E15)
            goto L_0x0035
        L_0x0948:
            r0 = -1912673118(0xffffffff8dfeeca2, float:-1.5710926E-30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.VjY r3 = (X.C17996VjY) r3
            X.6vv r1 = r3.A00
            int r2 = r1.ordinal()
            r1 = 2
            if (r2 == r1) goto L_0x0971
            r1 = 1
            if (r2 == r1) goto L_0x096e
            r3.A00()
        L_0x0962:
            X.VOC r1 = r3.A04
            X.Ube r1 = r1.A00
            X.C15381Ube.A03(r1)
            r1 = -1905651658(0xffffffff8e6a1036, float:-2.8850532E-30)
            goto L_0x0035
        L_0x096e:
            X.6vv r1 = X.C322496vv.Closed
            goto L_0x0973
        L_0x0971:
            X.6vv r1 = X.C322496vv.Loading
        L_0x0973:
            r3.A00 = r1
            goto L_0x0962
        L_0x0976:
            r0 = -1987998987(0xffffffff89818af5, float:-3.1186295E-33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.UDj r2 = (X.C14881UDj) r2
            int r1 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.VNL r1 = r2.A00
            X.ToX r1 = r1.A00
            X.6s0 r3 = r1.A03
            if (r3 == 0) goto L_0x0991
            java.lang.String r2 = "see_all_card"
            r1 = 1
            r3.A0G(r1, r2)
        L_0x0991:
            r1 = -609178080(0xffffffffdbb0ae20, float:-9.9462097E16)
            goto L_0x0035
        L_0x0996:
            r0 = 2007620605(0x77a9dbfd, float:6.890313E33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.UDj r2 = (X.C14881UDj) r2
            int r1 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.VNL r1 = r2.A00
            X.ToX r1 = r1.A00
            X.6s0 r3 = r1.A03
            if (r3 == 0) goto L_0x09b1
            java.lang.String r2 = "see_all_card"
            r1 = 1
            r3.A0G(r1, r2)
        L_0x09b1:
            r1 = -643123882(0xffffffffd9aab556, float:-6.0062659E15)
            goto L_0x0035
        L_0x09b6:
            r0 = -1573131214(0xffffffffa23bec32, float:-2.5468267E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.DbS.A1U(r1)
            r1 = 540264246(0x2033c736, float:1.5227803E-19)
            goto L_0x0035
        L_0x09c7:
            java.lang.Object r1 = r1.A01
            X.UdE r1 = (X.C15463UdE) r1
            X.VT5 r0 = r1.A01
            if (r0 == 0) goto L_0x0038
            java.lang.Integer r0 = r0.A00
            if (r0 == 0) goto L_0x0038
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x0038
            X.Uc0 r3 = r1.A08
            androidx.fragment.app.FragmentActivity r2 = r3.getActivity()
            if (r2 == 0) goto L_0x0038
            com.instagram.common.session.UserSession r0 = r3.A03
            X.6Yo r1 = new X.6Yo
            r1.<init>(r2, r0)
            X.1a1 r4 = X.C46447Df9.A02()
            com.instagram.common.session.UserSession r0 = r3.A03
            java.lang.String r7 = r0.A06
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r0)
            java.lang.String r8 = r0.getUsername()
            X.EVG r5 = X.EVG.PENDING
            r9 = 0
            java.lang.Integer r6 = r3.A0B
            X.Uc0 r0 = r4.A07(r5, r6, r7, r8, r9)
            r1.A0E(r0)
            r1.A04()
            return
        L_0x0a08:
            r0 = 1966697964(0x75396dec, float:2.3505967E32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            android.app.Dialog r1 = (android.app.Dialog) r1
            r1.dismiss()
            r1 = 245030801(0xe9adf91, float:3.8179218E-30)
            goto L_0x0035
        L_0x0a1b:
            r0 = 107400442(0x666ccfa, float:4.3408785E-35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.VSB r1 = (X.VSB) r1
            X.Cvx r5 = r1.A00
            java.util.List r2 = r5.A04
            X.3GD r4 = r1.A01
            int r1 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            int r1 = r4.A00
            java.lang.Object r7 = r2.get(r1)
            X.VZT r7 = (X.VZT) r7
            X.0qQ.A0A(r7)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r1 = r7.A04
            java.util.Iterator r3 = r1.iterator()
        L_0x0a44:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0a5d
            java.lang.Object r2 = r3.next()
            X.VY0 r2 = (X.VY0) r2
            boolean r1 = r2.A03
            if (r1 == 0) goto L_0x0a44
            java.lang.String r1 = r2.A02
            X.0qQ.A07(r1)
            r6.add(r1)
            goto L_0x0a44
        L_0x0a5d:
            java.util.List r1 = r7.A04
            X.0qQ.A07(r1)
            java.util.Iterator r3 = r1.iterator()
        L_0x0a66:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0a81
            java.lang.Object r2 = r3.next()
            X.VY0 r2 = (X.VY0) r2
            java.lang.String r1 = r2.A02
            boolean r1 = r6.contains(r1)
            if (r1 == 0) goto L_0x0a66
            int r1 = r2.A00
            int r1 = r1 + 1
            r2.A00 = r1
            goto L_0x0a66
        L_0x0a81:
            r1 = 0
            java.lang.String[] r1 = X.Pxf.A1a(r6, r1)
            X.AnonymousClass3GD.A01(r5, r4, r1)
            r1 = -331281176(0xffffffffec410ce8, float:-9.335345E26)
            goto L_0x0035
        L_0x0a8e:
            r0 = 68715773(0x41884fd, float:1.792858E-36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.UbJ r2 = (X.C15366UbJ) r2
            X.Gal r7 = r2.A06
            if (r7 == 0) goto L_0x0aca
            java.lang.String r6 = r2.A09
            if (r6 != 0) goto L_0x0aa3
            java.lang.String r6 = "-1"
        L_0x0aa3:
            com.instagram.api.schemas.IGCTMessagingAdsInfoDict r1 = r2.A01
            long r3 = X.C16947VBz.A00(r1)
            com.instagram.api.schemas.OnFeedMessagesIntf r1 = r2.A02
            if (r1 == 0) goto L_0x0acf
            java.lang.String r5 = X.AnonymousClass3ZN.A00(r1)
        L_0x0ab1:
            X.0wc r2 = r7.A01
            java.lang.String r1 = "click_to_message_ad_onfeed_welcome_message_tapped"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r2.isSampled()
            if (r1 == 0) goto L_0x0aca
            X.C13990Tnq.A11(r2, r7, r6, r3)
            java.lang.String r1 = "message_destination"
            r2.AAJ(r1, r5)
            r2.Cgf()
        L_0x0aca:
            r1 = 997289115(0x3b716c9b, float:0.0036838416)
            goto L_0x0035
        L_0x0acf:
            java.lang.String r5 = ""
            goto L_0x0ab1
        L_0x0ad2:
            r0 = -756325228(0xffffffffd2eb6494, float:-5.05502368E11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.UbJ r2 = (X.C15366UbJ) r2
            X.Gal r7 = r2.A06
            if (r7 == 0) goto L_0x0b0e
            java.lang.String r6 = r2.A09
            if (r6 != 0) goto L_0x0ae7
            java.lang.String r6 = "-1"
        L_0x0ae7:
            com.instagram.api.schemas.IGCTMessagingAdsInfoDict r1 = r2.A01
            long r3 = X.C16947VBz.A00(r1)
            com.instagram.api.schemas.OnFeedMessagesIntf r1 = r2.A02
            if (r1 == 0) goto L_0x0b13
            java.lang.String r5 = X.AnonymousClass3ZN.A00(r1)
        L_0x0af5:
            X.0wc r2 = r7.A01
            java.lang.String r1 = "click_to_message_ad_onfeed_biz_profile_pic_tappped"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r2.isSampled()
            if (r1 == 0) goto L_0x0b0e
            X.C13990Tnq.A11(r2, r7, r6, r3)
            java.lang.String r1 = "message_destination"
            r2.AAJ(r1, r5)
            r2.Cgf()
        L_0x0b0e:
            r1 = -77300136(0xfffffffffb647e58, float:-1.1864062E36)
            goto L_0x0035
        L_0x0b13:
            java.lang.String r5 = ""
            goto L_0x0af5
        L_0x0b16:
            r0 = -153322001(0xfffffffff6dc7def, float:-2.2360538E33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.UbJ r2 = (X.C15366UbJ) r2
            X.Gal r7 = r2.A06
            if (r7 == 0) goto L_0x0b52
            java.lang.String r6 = r2.A09
            if (r6 != 0) goto L_0x0b2b
            java.lang.String r6 = "-1"
        L_0x0b2b:
            com.instagram.api.schemas.IGCTMessagingAdsInfoDict r1 = r2.A01
            long r3 = X.C16947VBz.A00(r1)
            com.instagram.api.schemas.OnFeedMessagesIntf r1 = r2.A02
            if (r1 == 0) goto L_0x0b57
            java.lang.String r5 = X.AnonymousClass3ZN.A00(r1)
        L_0x0b39:
            X.0wc r2 = r7.A01
            java.lang.String r1 = "click_to_message_ad_onfeed_header_title_tapped"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r2.isSampled()
            if (r1 == 0) goto L_0x0b52
            X.C13990Tnq.A11(r2, r7, r6, r3)
            java.lang.String r1 = "message_destination"
            r2.AAJ(r1, r5)
            r2.Cgf()
        L_0x0b52:
            r1 = -1549827558(0xffffffffa39f821a, float:-1.7293915E-17)
            goto L_0x0035
        L_0x0b57:
            java.lang.String r5 = ""
            goto L_0x0b39
        L_0x0b5a:
            r0 = -1751536210(0xffffffff9799adae, float:-9.931236E-25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.UbJ r2 = (X.C15366UbJ) r2
            X.Gal r7 = r2.A06
            if (r7 == 0) goto L_0x0b96
            java.lang.String r6 = r2.A09
            if (r6 != 0) goto L_0x0b6f
            java.lang.String r6 = "-1"
        L_0x0b6f:
            com.instagram.api.schemas.IGCTMessagingAdsInfoDict r1 = r2.A01
            long r3 = X.C16947VBz.A00(r1)
            com.instagram.api.schemas.OnFeedMessagesIntf r1 = r2.A02
            if (r1 == 0) goto L_0x0b9b
            java.lang.String r5 = X.AnonymousClass3ZN.A00(r1)
        L_0x0b7d:
            X.0wc r2 = r7.A01
            java.lang.String r1 = "click_to_message_ad_onfeed_header_subtitle_tapped"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r2.isSampled()
            if (r1 == 0) goto L_0x0b96
            X.C13990Tnq.A11(r2, r7, r6, r3)
            java.lang.String r1 = "message_destination"
            r2.AAJ(r1, r5)
            r2.Cgf()
        L_0x0b96:
            r1 = -933828324(0xffffffffc856e91c, float:-220068.44)
            goto L_0x0035
        L_0x0b9b:
            java.lang.String r5 = ""
            goto L_0x0b7d
        L_0x0b9e:
            r0 = -1924723757(0xffffffff8d470bd3, float:-6.133584E-31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            r1 = 77355971(0x49c5bc3, float:3.6759694E-36)
            goto L_0x0035
        L_0x0baa:
            r0 = 1454834445(0x56b7030d, float:1.00611865E14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.VNF r1 = (X.VNF) r1
            X.Uh1 r4 = r1.A00
            android.content.Context r3 = r4.A0D
            r2 = 2131972986(0x7f13537a, float:1.9582995E38)
            r1 = 1
            X.C59689JTv.A08(r3, r2, r1)
            r1 = 0
            X.C15695Uh1.A05(r4, r1)
            X.C15695Uh1.A02(r4)
            r1 = -74364302(0xfffffffffb914a72, float:-1.508786E36)
            goto L_0x0035
        L_0x0bcc:
            r0 = 910839317(0x364a4e15, float:3.0145795E-6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.VNF r7 = (X.VNF) r7
            X.Uh1 r6 = r7.A00
            com.instagram.common.session.UserSession r5 = r6.A0G
            androidx.fragment.app.Fragment r4 = r6.A0E
            X.1Xj r3 = r6.A04
            r3.getClass()
            r1 = 0
            X.Wg5 r2 = new X.Wg5
            r2.<init>(r7, r1)
            X.4DU r1 = r6.A0K
            X.C56307HwK.A01(r4, r5, r3, r1, r2)
            X.C15695Uh1.A02(r6)
            r1 = 1519439530(0x5a90ceaa, float:2.03798131E16)
            goto L_0x0035
        L_0x0bf5:
            r0 = -234339699(0xfffffffff208428d, float:-2.6989066E30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.VNF r1 = (X.VNF) r1
            X.Uh1 r3 = r1.A00
            com.instagram.common.session.UserSession r1 = r3.A0G
            X.0q2 r2 = X.0q2.A00(r1)
            X.1Xj r1 = r3.A04
            boolean r1 = r2.A0N(r1)
            if (r1 == 0) goto L_0x0c30
            X.3Yl r2 = X.C243363Yl.NOT_LIKED
        L_0x0c12:
            r5 = 0
            X.C15695Uh1.A04(r3, r2, r5)
            X.1Xj r1 = r3.A04
            X.3W1 r4 = r3.BQr(r1)
            X.3Yl r1 = X.C243363Yl.NOT_LIKED
            boolean r6 = X.AnonymousClass7TF.A1W(r2, r1)
            r7 = 0
            r8 = 1
            r9 = r7
            r4.A0J(r5, r6, r7, r8, r9)
            X.C15695Uh1.A03(r3)
            r1 = 1349122612(0x5069fa34, float:1.57019546E10)
            goto L_0x0035
        L_0x0c30:
            X.3Yl r2 = X.C243363Yl.LIKED
            goto L_0x0c12
        L_0x0c33:
            r0 = -2040735216(0xffffffff865cda10, float:-4.1537608E-35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.VNF r1 = (X.VNF) r1
            X.Uh1 r5 = r1.A00
            android.content.Context r2 = r5.A0D
            com.instagram.common.session.UserSession r3 = r5.A0G
            X.1Xj r4 = r5.A04
            int r7 = r5.A00
            int r8 = r5.A01
            X.HrG r1 = r5.A06
            X.4EA r1 = r1.A09
            com.instagram.feed.widget.IgProgressImageView r1 = r1.A0N
            java.util.concurrent.atomic.AtomicInteger r1 = r1.getCurrentScans()
            int r9 = r1.get()
            r6 = 0
            X.C56307HwK.A00(r2, r3, r4, r5, r6, r7, r8, r9)
            X.C15695Uh1.A02(r5)
            r1 = 1893885887(0x70e267bf, float:5.6055227E29)
            goto L_0x0035
        L_0x0c64:
            r0 = -1720774043(0xffffffff996f1265, float:-1.2359725E-23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.TsG r1 = (X.C14233TsG) r1
            X.JwC r1 = r1.A01
            java.lang.Object r1 = r1.A00
            X.DbS.A1U(r1)
            r1 = -880115568(0xffffffffcb8a8090, float:-1.815376E7)
            goto L_0x0035
        L_0x0c7b:
            r0 = -1804340786(0xffffffff9473f1ce, float:-1.2316052E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.TsG r1 = (X.C14233TsG) r1
            X.JwC r1 = r1.A01
            java.lang.Object r1 = r1.A00
            X.DbS.A1U(r1)
            r1 = -62651821(0xfffffffffc440253, float:-4.0709493E36)
            goto L_0x0035
        L_0x0c92:
            r0 = 60864045(0x3a0b62d, float:9.44578E-37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.30x r2 = (X.C2357130x) r2
            r1 = 0
            X.C2357130x.A01(r2, r1)
            r1 = 853043642(0x32d869ba, float:2.5193788E-8)
            goto L_0x0035
        L_0x0ca6:
            r0 = -1715647586(0xffffffff99bd4b9e, float:-1.9572684E-23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UdG r1 = (X.C15465UdG) r1
            X.2ms r1 = r1.A08
            r1.CgO()
            r1 = -1637377929(0xffffffff9e679877, float:-1.2260567E-20)
            goto L_0x0035
        L_0x0cbb:
            r0 = 779100085(0x2e701fb5, float:5.4597844E-11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.WWG r1 = (X.WWG) r1
            X.0sa r1 = r1.A00
            r1.invoke()
            r1 = 1360992055(0x511f1737, float:4.270558E10)
            goto L_0x0035
        L_0x0cd0:
            r0 = 358365876(0x155c3ab4, float:4.4474955E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.TpQ r3 = (X.C14076TpQ) r3
            X.GX8 r1 = r3.A0T
            X.0wc r2 = r1.A00
            r1 = 591(0x24f, float:8.28E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            java.lang.String r1 = "ig_explore_controls_multi_hide_cancel_tap"
            X.C51975G9x.A18(r2, r1)
            com.instagram.common.session.UserSession r1 = r3.A0R
            X.C321536uL.A00(r1)
            r1 = 0
            X.C321536uL.A00 = r1
            X.C14076TpQ.A02(r3)
            X.Hpg r1 = r3.A0V
            r1.A00()
            r1 = -446179340(0xffffffffe567d7f4, float:-6.8428143E22)
            goto L_0x0035
        L_0x0d03:
            r0 = -1899030072(0xffffffff8ecf19c8, float:-5.1054266E-30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.TpQ r1 = (X.C14076TpQ) r1
            X.Tut r1 = r1.A0X
            r1.A00()
            r1 = 514291127(0x1ea775b7, float:1.7730498E-20)
            goto L_0x0035
        L_0x0d18:
            r0 = -1877067252(0xffffffff901e3a0c, float:-3.1204723E-29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.TpQ r6 = (X.C14076TpQ) r6
            com.instagram.common.session.UserSession r5 = r6.A0R
            X.41i r1 = X.C2593341h.A00(r5)
            X.0xa r1 = r1.A00
            X.0xY r2 = r1.AR4()
            java.lang.String r1 = "map_launched_from_explore_search_bar_entry_point"
            X.DbW.A1L(r2, r1)
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            X.UXW r3 = r6.A0A
            if (r3 == 0) goto L_0x0d53
            double r1 = r3.A00
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "arg_fallback_lat"
            r4.putString(r1, r2)
            double r1 = r3.A01
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "arg_fallback_lng"
            r4.putString(r1, r2)
        L_0x0d53:
            androidx.fragment.app.FragmentActivity r3 = r6.A0P
            java.lang.String r2 = X.AnonymousClass7TF.A0b()
            com.instagram.discovery.mediamap.intf.MapEntryPoint r1 = com.instagram.discovery.mediamap.intf.MapEntryPoint.EXPLORE_BUTTON
            X.C18681Vwf.A02(r4, r3, r5, r1, r2)
            r1 = -1143658097(0xffffffffbbd5298f, float:-0.0065051983)
            goto L_0x0035
        L_0x0d63:
            r0 = -1864391752(0xffffffff90dfa3b8, float:-8.821024E-29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.TpQ r1 = (X.C14076TpQ) r1
            com.instagram.common.session.UserSession r11 = r1.A0R
            X.0iw r2 = r1.A0Q
            java.lang.String r4 = r2.getModuleName()
            boolean r7 = X.C51970G9q.A1Y(r4)
            X.0wc r3 = X.AnonymousClass0kN.A01(r2, r11)
            java.lang.String r2 = "explore_dsa_overflow_menu_seen"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r3, r2)
            java.lang.String r2 = "containermodule"
            r3.AAJ(r2, r4)
            r3.Cgf()
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r8)
            r14 = 0
            X.8Ov r6 = new X.8Ov
            r6.<init>(r2, r11, r14, r7)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            android.graphics.drawable.ColorDrawable r12 = new android.graphics.drawable.ColorDrawable
            r12.<init>(r7)
            r3 = 2131238069(0x7f081cb5, float:1.8092406E38)
            android.graphics.drawable.Drawable r10 = r2.getDrawable(r3)
            X.0Tu r9 = X.0Tu.A05
            r3 = 36320081701052363(0x8108ec00011fcb, double:3.032304144751189E-306)
            boolean r3 = X.182.A06(r9, r11, r3)
            if (r3 == 0) goto L_0x0dea
            r3 = 2131973476(0x7f135564, float:1.9583989E38)
            java.lang.String r17 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238210(0x7f081d42, float:1.8092692E38)
            android.graphics.drawable.Drawable r13 = r2.getDrawable(r3)
            r3 = 3
            X.WXr r15 = new X.WXr
            r15.<init>(r1, r3)
            int r3 = r1.A0L
            java.lang.Integer r16 = java.lang.Integer.valueOf(r3)
            r18 = 4
            r19 = 30
            r21 = 1
            X.8rI r11 = new X.8rI
            r20 = r7
            r22 = r7
            r23 = r7
            r24 = r21
            r25 = r7
            r26 = r7
            r27 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r5.add(r11)
        L_0x0dea:
            r3 = 2131961873(0x7f132811, float:1.9560455E38)
            java.lang.String r17 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 1
            X.PHM r9 = new X.PHM
            r9.<init>(r3)
            int r4 = r1.A0M
            java.lang.Integer r16 = java.lang.Integer.valueOf(r4)
            r18 = 4
            r19 = 30
            X.8rI r4 = new X.8rI
            r11 = r4
            r13 = r12
            r15 = r9
            r20 = r7
            r21 = r3
            r22 = r7
            r23 = r7
            r24 = r7
            r25 = r3
            r26 = r7
            r27 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r5.add(r4)
            r4 = 2131961875(0x7f132813, float:1.956046E38)
            java.lang.String r26 = X.AnonymousClass7TE.A16(r2, r4)
            boolean r4 = r1.A0I
            r21 = r12
            if (r4 == 0) goto L_0x0e2b
            r21 = r10
        L_0x0e2b:
            r4 = 2131238943(0x7f08201f, float:1.8094179E38)
            android.graphics.drawable.Drawable r22 = r2.getDrawable(r4)
            r4 = 4
            X.WXr r9 = new X.WXr
            r9.<init>(r1, r4)
            int r4 = r1.A0L
            java.lang.Integer r25 = java.lang.Integer.valueOf(r4)
            X.8rI r4 = new X.8rI
            r20 = r4
            r23 = r14
            r24 = r9
            r28 = r19
            r29 = r7
            r30 = r3
            r31 = r7
            r32 = r7
            r33 = r3
            r34 = r7
            r35 = r7
            r36 = r7
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r5.add(r4)
            r4 = 2131961872(0x7f132810, float:1.9560453E38)
            java.lang.String r17 = X.AnonymousClass7TE.A16(r2, r4)
            boolean r4 = r1.A0I
            if (r4 != 0) goto L_0x0e6a
            r12 = r10
        L_0x0e6a:
            r4 = 2131238333(0x7f081dbd, float:1.8092942E38)
            android.graphics.drawable.Drawable r13 = r2.getDrawable(r4)
            r4 = 5
            X.WXr r9 = new X.WXr
            r9.<init>(r1, r4)
            X.8rI r2 = new X.8rI
            r11 = r2
            r15 = r9
            r16 = r25
            r18 = r7
            r20 = r7
            r21 = r7
            r22 = r7
            r23 = r7
            r24 = r3
            r25 = r7
            r26 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r5.add(r2)
            r6.A02(r5)
            r1.A0D = r6
            android.view.View r2 = r1.A04
            if (r2 == 0) goto L_0x0eb6
            android.view.View r5 = r6.getContentView()
            if (r5 == 0) goto L_0x0ebb
            r5.measure(r7, r7)
            android.content.Context r2 = r1.A0N
            int r3 = X.DbY.A01(r2)
            int r2 = r5.getMeasuredWidth()
            int r2 = r2 + r3
            int r2 = -r2
            android.view.View r1 = r1.A04
            r6.showAsDropDown(r1, r2, r7, r4)
        L_0x0eb6:
            r1 = -1442865805(0xffffffffa9ff9d73, float:-1.1351588E-13)
            goto L_0x0035
        L_0x0ebb:
            r6.showAsDropDown(r8)
            goto L_0x0eb6
        L_0x0ebf:
            java.lang.IllegalStateException r0 = X.DbU.A0i()
            throw r0
        L_0x0ec4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r13)
            throw r0
        L_0x0eca:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WB9.onClick(android.view.View):void");
    }

    public WB9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}

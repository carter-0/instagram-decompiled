package X;

import com.facebookpay.form.cell.address.AddressCellParams;
import com.facebookpay.form.cell.creditcard.CreditCardCellParams;
import com.facebookpay.form.model.CardFormFieldConfig;
import com.google.common.collect.ImmutableList;
import java.util.Map;

public final class SGH {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.QfD, X.Ry3] */
    public static final CreditCardCellParams A00(REP rep, AddressCellParams addressCellParams, REC rec, CardFormFieldConfig cardFormFieldConfig, C8946RGo rGo, ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        if (z) {
            str4 = null;
        }
        ? ry3 = new C10782Ry3(13);
        ry3.A0N = true;
        ry3.A05 = REC.NONE;
        ry3.A0D = str;
        ry3.A0C = str2;
        ry3.A0A = str3;
        ry3.A0F = str4;
        ry3.A0E = str5;
        ry3.A0G = str6;
        ry3.A0B = str7;
        ry3.A07 = rGo;
        ry3.A08 = immutableList;
        ry3.A09 = immutableList2;
        ry3.A0M = z2;
        ry3.A0L = z3;
        ry3.A0N = z4;
        ry3.A00 = i;
        ry3.A05 = rec;
        ry3.A0J = z5;
        ry3.A02 = i2;
        ry3.A01 = i3;
        ry3.A03 = rep;
        ry3.A0K = z6;
        ry3.A06 = cardFormFieldConfig;
        ry3.A0I = z7;
        if (str == null || str.length() == 0) {
            ry3.A0H = map;
        }
        if (addressCellParams != null) {
            ry3.A04 = addressCellParams;
        }
        return new CreditCardCellParams((C8023QfD) ry3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        if (r90 != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0106, code lost:
        if (r6.isEmpty() == false) goto L_0x010b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebookpay.form.fragment.model.FormParams A01(X.REC r60, com.facebookpay.form.model.AddressFormFieldsConfig r61, com.facebookpay.form.model.CardFormFieldConfig r62, com.facebookpay.logging.LoggingContext r63, X.C8946RGo r64, com.google.common.collect.ImmutableList r65, com.google.common.collect.ImmutableList r66, java.lang.Integer r67, java.lang.String r68, java.lang.String r69, java.lang.String r70, java.lang.String r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.lang.String r75, java.lang.String r76, java.lang.String r77, java.lang.String r78, java.lang.String r79, java.lang.String r80, java.lang.String r81, java.util.List r82, int r83, int r84, int r85, boolean r86, boolean r87, boolean r88, boolean r89, boolean r90, boolean r91, boolean r92, boolean r93, boolean r94) {
        /*
            r59 = this;
            r44 = r67
            r14 = 10
            r15 = 0
            if (r66 == 0) goto L_0x0047
            java.util.ArrayList r5 = X.AnonymousClass7TF.A0p(r66)
            java.util.Iterator r4 = r66.iterator()
        L_0x000f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0042
            java.lang.Object r0 = r4.next()
            X.RGe r0 = (X.C8936RGe) r0
            X.JTQ.A1K(r0)
            int r3 = r0.ordinal()
            r2 = 7
            r1 = 2
            r0 = 1
            if (r3 == r2) goto L_0x003f
            if (r3 == r0) goto L_0x003c
            r0 = 4
            if (r3 == r0) goto L_0x0039
            if (r3 == r1) goto L_0x0036
            r0 = 3
            if (r3 == r0) goto L_0x0032
            r1 = -1
        L_0x0032:
            X.AnonymousClass7TF.A1M(r5, r1)
            goto L_0x000f
        L_0x0036:
            r1 = 14
            goto L_0x0032
        L_0x0039:
            r1 = 15
            goto L_0x0032
        L_0x003c:
            r1 = 28
            goto L_0x0032
        L_0x003f:
            r1 = 9
            goto L_0x0032
        L_0x0042:
            com.google.common.collect.ImmutableList r4 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r5)
            goto L_0x0048
        L_0x0047:
            r4 = r15
        L_0x0048:
            r2 = 0
            r3 = 1
            r6 = r86
            r5 = r90
            if (r86 != 0) goto L_0x0054
            r36 = 1
            if (r90 == 0) goto L_0x0056
        L_0x0054:
            r36 = 0
        L_0x0056:
            java.lang.Integer r1 = X.C66580MXl.A0q()
            java.lang.String r0 = "new_full_name_form_field"
            X.0eP r9 = X.C11082S9c.A01(r1, r0)
            r0 = 13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "new_card_number_form_field"
            X.0eP r8 = X.C11082S9c.A01(r1, r0)
            r0 = 15
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "new_cvv_form_field"
            X.0eP r7 = X.C11082S9c.A01(r1, r0)
            r0 = 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "new_expiry_date_form_field"
            X.0eP r0 = X.C11082S9c.A01(r1, r0)
            r51 = 3
            X.0eP[] r0 = new X.0eP[]{r9, r8, r7, r0}
            java.util.LinkedHashMap r29 = X.0Yt.A06(r0)
            r40 = 0
            r34 = r88
            r33 = r87
            r19 = r64
            r9 = r93
            r25 = r69
            r26 = r70
            r27 = r71
            r10 = r72
            r20 = r65
            r13 = r94
            r12 = r91
            r18 = r62
            r24 = r68
            r17 = r60
            r35 = r89
            r22 = r79
            r23 = r80
            r16 = r15
            r28 = r10
            r30 = r3
            r31 = r2
            r32 = r2
            r37 = r12
            r38 = r9
            r39 = r13
            r21 = r4
            com.facebookpay.form.cell.creditcard.CreditCardCellParams r11 = A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r0 = r78
            if (r78 == 0) goto L_0x00d5
            com.facebook.common.locale.Country r7 = com.facebook.common.locale.Country.A00(r15, r0)     // Catch:{ IllegalArgumentException -> 0x00d5 }
            goto L_0x00d6
        L_0x00d5:
            r7 = r15
        L_0x00d6:
            r1 = 11
            X.QfH r0 = new X.QfH
            r8 = r61
            r0.<init>(r8, r1)
            r0.A0G = r10
            r1 = r73
            r0.A0N = r1
            r1 = r74
            r0.A0I = r1
            r1 = r75
            r0.A0J = r1
            r1 = r76
            r0.A0M = r1
            r1 = r77
            r0.A0L = r1
            r0.A0B = r7
            r0.A0X = r6
            r6 = r82
            if (r90 == 0) goto L_0x0108
            if (r82 == 0) goto L_0x0108
            boolean r7 = r6.isEmpty()
            r1 = 2131961201(0x7f132571, float:1.9559092E38)
            if (r7 == 0) goto L_0x010b
        L_0x0108:
            r1 = 2131961202(0x7f132572, float:1.9559094E38)
        L_0x010b:
            r0.A03 = r1
            r0.A0U = r3
            r0.A0F = r4
            r1 = r81
            r0.A0O = r1
            r0.A0Y = r5
            r1 = r63
            r0.A0D = r1
            r0.A0Z = r5
            r0.A0P = r6
            r0.A0S = r12
            r0.A0T = r9
            r1 = r92
            if (r79 == 0) goto L_0x01ef
            int r3 = r22.length()
            if (r3 == 0) goto L_0x01ef
            java.lang.String r6 = java.lang.String.valueOf(r66)
            java.lang.String r4 = "client_load_credential_success"
            java.lang.String r5 = "edit_card"
            com.facebookpay.form.fragment.model.FormDisplayEvent r3 = new com.facebookpay.form.fragment.model.FormDisplayEvent
            r3.<init>(r4, r5, r6)
            java.util.List r29 = X.AnonymousClass7TE.A1I(r3)
            java.lang.String r6 = "user_edit_credential_submit"
            java.lang.String r4 = "edit_card_save"
            com.facebookpay.form.fragment.model.FormClickEvent r3 = new com.facebookpay.form.fragment.model.FormClickEvent
            r3.<init>(r6, r4)
            java.util.List r30 = X.AnonymousClass7TE.A1I(r3)
            java.lang.String r4 = "user_remove_credential_enter"
            java.lang.String r3 = "remove_card"
            com.facebookpay.form.fragment.model.FormClickEvent r9 = new com.facebookpay.form.fragment.model.FormClickEvent
            r9.<init>(r4, r3)
            java.lang.String r4 = "user_remove_credential_submit"
            java.lang.String r3 = "remove_card_confirm"
            com.facebookpay.form.fragment.model.FormClickEvent r8 = new com.facebookpay.form.fragment.model.FormClickEvent
            r8.<init>(r4, r3)
            java.lang.String r4 = "user_remove_credential_cancel"
            java.lang.String r3 = "remove_card_cancel"
            com.facebookpay.form.fragment.model.FormClickEvent r7 = new com.facebookpay.form.fragment.model.FormClickEvent
            r7.<init>(r4, r3)
            java.lang.String r3 = "client_edit_credential_success"
            java.util.List r31 = X.Pxj.A0y(r3, r5)
            java.lang.String r3 = "client_edit_credential_fail"
            java.util.List r32 = X.Pxj.A0y(r3, r5)
            java.lang.String r3 = "client_remove_credential_success"
            com.facebookpay.form.fragment.model.FormMutationEvent r6 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r6.<init>(r3, r5)
            java.lang.String r4 = "client_remove_credential_fail"
            com.facebookpay.form.fragment.model.FormMutationEvent r3 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r3.<init>(r4, r5)
            com.facebookpay.form.fragment.model.FormLoggingEvents r39 = new com.facebookpay.form.fragment.model.FormLoggingEvents
            r23 = r39
            r24 = r9
            r25 = r8
            r26 = r7
            r27 = r6
            r28 = r3
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32)
        L_0x0198:
            com.facebookpay.form.cell.address.AddressCellParams r3 = new com.facebookpay.form.cell.address.AddressCellParams
            r3.<init>((X.C8027QfH) r0)
            com.facebookpay.form.cell.CellParams[] r0 = new com.facebookpay.form.cell.CellParams[]{r11, r3}
            java.util.ArrayList r48 = X.0sr.A1L(r0)
            if (r87 == 0) goto L_0x01d9
            r44 = r15
            r37 = r15
        L_0x01ab:
            java.lang.Integer r43 = java.lang.Integer.valueOf(r84)
            if (r92 == 0) goto L_0x01d6
            X.RH3 r41 = X.RH3.A0M
        L_0x01b3:
            com.facebookpay.form.fragment.model.FeatureConfiguration r0 = new com.facebookpay.form.fragment.model.FeatureConfiguration
            r0.<init>(r12, r1, r13)
            if (r65 == 0) goto L_0x0289
            java.util.ArrayList r15 = X.AnonymousClass7TF.A0p(r20)
            java.util.Iterator r3 = r20.iterator()
        L_0x01c2:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0289
            java.lang.Object r1 = r3.next()
            X.RGo r1 = (X.C8946RGo) r1
            int r1 = r1.A00()
            X.AnonymousClass7TF.A1M(r15, r1)
            goto L_0x01c2
        L_0x01d6:
            X.RH3 r41 = X.RH3.A0L
            goto L_0x01b3
        L_0x01d9:
            boolean r3 = X.C11431STx.A04()
            r0 = 2131961198(0x7f13256e, float:1.9559086E38)
            if (r3 == 0) goto L_0x01ea
            r0 = 2131961197(0x7f13256d, float:1.9559084E38)
            com.facebookpay.form.cell.label.LabelCellParams r37 = X.C11089S9k.A01(r0, r2, r2, r2)
            goto L_0x01ab
        L_0x01ea:
            com.facebookpay.form.cell.label.LabelCellParams r37 = X.C11089S9k.A01(r0, r2, r2, r2)
            goto L_0x01ab
        L_0x01ef:
            r5 = 6
            java.lang.Integer r4 = X.Pxe.A0l()
            java.lang.String r3 = "new_address1_form_field"
            X.0eP r23 = X.C11082S9c.A01(r4, r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            java.lang.String r3 = "new_address2_form_field"
            X.0eP r24 = X.C11082S9c.A01(r4, r3)
            java.lang.Integer r4 = X.Pxe.A0m()
            java.lang.String r3 = "new_city_form_field"
            X.0eP r25 = X.C11082S9c.A01(r4, r3)
            java.lang.Integer r4 = X.Pxe.A0n()
            java.lang.String r3 = "new_state_form_field"
            X.0eP r26 = X.C11082S9c.A01(r4, r3)
            r3 = 9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = "new_zip_code_form_field"
            X.0eP r27 = X.C11082S9c.A01(r4, r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            java.lang.String r3 = "new_country_picker"
            X.0eP r28 = X.C11082S9c.A01(r4, r3)
            X.0eP[] r3 = new X.0eP[]{r23, r24, r25, r26, r27, r28}
            java.util.LinkedHashMap r3 = X.0Yt.A06(r3)
            r0.A0Q = r3
            java.lang.String r4 = "add_card"
            java.lang.String r7 = "add_card_inline"
            r6 = r4
            if (r92 == 0) goto L_0x0246
            r6 = r7
        L_0x0246:
            java.lang.String r5 = "client_load_credential_success"
            com.facebookpay.form.fragment.model.FormDisplayEvent r3 = new com.facebookpay.form.fragment.model.FormDisplayEvent
            r3.<init>(r5, r6, r15)
            java.util.List r29 = X.AnonymousClass7TE.A1I(r3)
            if (r92 == 0) goto L_0x0286
            r6 = r7
        L_0x0254:
            java.lang.String r5 = "user_add_credential_submit"
            com.facebookpay.form.fragment.model.FormClickEvent r3 = new com.facebookpay.form.fragment.model.FormClickEvent
            r3.<init>(r5, r6)
            java.util.List r30 = X.AnonymousClass7TE.A1I(r3)
            r5 = r4
            if (r92 == 0) goto L_0x0264
            r5 = r7
        L_0x0264:
            java.lang.String r3 = "client_add_credential_success"
            java.util.List r31 = X.Pxj.A0y(r3, r5)
            if (r92 == 0) goto L_0x026d
            r4 = r7
        L_0x026d:
            java.lang.String r3 = "client_add_credential_fail"
            java.util.List r32 = X.Pxj.A0y(r3, r4)
            com.facebookpay.form.fragment.model.FormLoggingEvents r39 = new com.facebookpay.form.fragment.model.FormLoggingEvents
            r23 = r39
            r24 = r15
            r25 = r15
            r26 = r15
            r27 = r15
            r28 = r15
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x0198
        L_0x0286:
            java.lang.String r6 = "add_card_save"
            goto L_0x0254
        L_0x0289:
            r53 = 2131961314(0x7f1325e2, float:1.9559321E38)
            r54 = 2131961313(0x7f1325e1, float:1.955932E38)
            r55 = 2131961310(0x7f1325de, float:1.9559313E38)
            r56 = 2131961303(0x7f1325d7, float:1.95593E38)
            com.facebookpay.form.fragment.model.FormParams r36 = new com.facebookpay.form.fragment.model.FormParams
            r57 = r85
            r52 = r83
            r38 = r0
            r42 = r19
            r45 = r40
            r46 = r40
            r47 = r22
            r49 = r15
            r50 = r40
            r58 = r2
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            return r36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SGH.A01(X.REC, com.facebookpay.form.model.AddressFormFieldsConfig, com.facebookpay.form.model.CardFormFieldConfig, com.facebookpay.logging.LoggingContext, X.RGo, com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableList, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):com.facebookpay.form.fragment.model.FormParams");
    }
}

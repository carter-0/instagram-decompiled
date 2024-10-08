package X;

import android.telephony.PhoneNumberFormattingTextWatcher;
import com.facebookpay.form.cell.text.TextCellParams;
import com.facebookpay.form.cell.text.TextValidatorParams;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import java.util.Collection;

public final class SGG {
    /* JADX WARNING: type inference failed for: r0v5, types: [android.telephony.PhoneNumberFormattingTextWatcher, com.facebookpay.form.cell.text.formatter.TextFormatter] */
    public static final TextCellParams A00(QXR qxr, String str, String str2, boolean z, boolean z2) {
        ImmutableList of;
        String optionalStringField;
        if (qxr != null) {
            ImmutableList A0E = qxr.A0E();
            0qQ.A07(A0E);
            boolean A1S = Pxi.A1S(qxr);
            String A0B = qxr.A0B("field_id");
            if (A0B != null) {
                of = ImmutableList.copyOf((Collection) C11393SRk.A04(A0B, qxr.A0A("error_message"), A0E, A1S, false, false));
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else {
            of = ImmutableList.of(new TextValidatorParams(AnonymousClass05K.A0Y, "", 2131954879, 2131954878), new TextValidatorParams(AnonymousClass05K.A01, "25", 2131961400, 0), new TextValidatorParams(AnonymousClass05K.A02, "", 2131961400, 0));
        }
        C8029QfJ qfJ = new C8029QfJ(0);
        Integer num = AnonymousClass05K.A0j;
        0qQ.A0B(num, 0);
        qfJ.A08 = num;
        0qQ.A0A(of);
        0qQ.A0B(of, 0);
        qfJ.A0G.addAll(of);
        qfJ.A0B = str;
        qfJ.A04 = new PhoneNumberFormattingTextWatcher();
        qfJ.A01 = R.id.phone_number_field;
        qfJ.A09 = "phoneNumber";
        qfJ.A0C = z;
        qfJ.A0D = z2;
        if (qxr == null || (optionalStringField = qxr.getOptionalStringField(0, "label")) == null || optionalStringField.length() == 0) {
            qfJ.A03 = 2131954881;
        } else {
            String optionalStringField2 = qxr.getOptionalStringField(0, "label");
            if (optionalStringField2 != null) {
                qfJ.A0A = optionalStringField2;
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        Pxk.A0Z(qfJ, str2);
        return qfJ.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r21.length() == 0) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebookpay.form.fragment.model.FormParams A01(X.QXR r34, java.lang.Integer r35, java.lang.String r36, java.lang.String r37, int r38, boolean r39, boolean r40) {
        /*
            r33 = this;
            r10 = 2131961345(0x7f132601, float:1.9559384E38)
            r0 = 0
            r21 = r36
            if (r36 == 0) goto L_0x000f
            int r1 = r21.length()
            r4 = 0
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r4 = 1
        L_0x0010:
            r14 = 0
            if (r4 == 0) goto L_0x0110
            java.lang.String r2 = "new_phone_number_form_field"
        L_0x0016:
            r5 = r34
            r3 = r37
            r1 = r39
            com.facebookpay.form.cell.text.TextCellParams r9 = A00(r5, r3, r2, r1, r0)
            java.lang.String r3 = "client_load_contact_success"
            if (r4 == 0) goto L_0x00a9
            java.lang.String r5 = "add_phone"
            com.facebookpay.form.fragment.model.FormDisplayEvent r2 = new com.facebookpay.form.fragment.model.FormDisplayEvent
            r2.<init>(r3, r5, r14)
            java.util.List r28 = X.AnonymousClass7TE.A1I(r2)
            java.lang.String r4 = "user_add_contact_submit"
            java.lang.String r3 = "add_phone_save"
            com.facebookpay.form.fragment.model.FormClickEvent r2 = new com.facebookpay.form.fragment.model.FormClickEvent
            r2.<init>(r4, r3)
            java.util.List r29 = X.AnonymousClass7TE.A1I(r2)
            java.lang.String r2 = "client_add_contact_success"
            java.util.List r30 = X.Pxj.A0y(r2, r5)
            java.lang.String r2 = "client_add_contact_fail"
            java.util.List r31 = X.Pxj.A0y(r2, r5)
            com.facebookpay.form.fragment.model.FormLoggingEvents r13 = new com.facebookpay.form.fragment.model.FormLoggingEvents
            r22 = r13
            r23 = r14
            r24 = r14
            r25 = r14
            r26 = r14
            r27 = r14
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x005a:
            boolean r2 = X.C11431STx.A04()
            if (r2 == 0) goto L_0x00a1
            r2 = 2131961197(0x7f13256d, float:1.9559084E38)
            com.facebookpay.form.cell.label.LabelCellParams r11 = X.C11089S9k.A01(r2, r0, r0, r0)
        L_0x0067:
            com.facebookpay.form.cell.CellParams[] r2 = new com.facebookpay.form.cell.CellParams[]{r9}
            java.util.ArrayList r22 = X.0sr.A1L(r2)
            com.facebookpay.form.fragment.model.FeatureConfiguration r12 = new com.facebookpay.form.fragment.model.FeatureConfiguration
            r2 = r40
            r12.<init>(r1, r0, r2)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r10)
            r27 = 2131961320(0x7f1325e8, float:1.9559334E38)
            r28 = 2131961319(0x7f1325e7, float:1.9559332E38)
            r29 = 2131961310(0x7f1325de, float:1.9559313E38)
            r30 = 2131961303(0x7f1325d7, float:1.95593E38)
            com.facebookpay.form.fragment.model.FormParams r10 = new com.facebookpay.form.fragment.model.FormParams
            r18 = r35
            r26 = r38
            r15 = r14
            r16 = r14
            r19 = r14
            r20 = r14
            r23 = r14
            r24 = r14
            r25 = r0
            r31 = r0
            r32 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r10
        L_0x00a1:
            r2 = 2131961204(0x7f132574, float:1.9559098E38)
            com.facebookpay.form.cell.label.LabelCellParams r11 = X.C11089S9k.A00(r2)
            goto L_0x0067
        L_0x00a9:
            java.lang.String r8 = "edit_phone"
            com.facebookpay.form.fragment.model.FormDisplayEvent r2 = new com.facebookpay.form.fragment.model.FormDisplayEvent
            r2.<init>(r3, r8, r14)
            java.util.List r28 = X.AnonymousClass7TE.A1I(r2)
            java.lang.String r4 = "user_edit_contact_submit"
            java.lang.String r3 = "edit_phone_save"
            com.facebookpay.form.fragment.model.FormClickEvent r2 = new com.facebookpay.form.fragment.model.FormClickEvent
            r2.<init>(r4, r3)
            java.util.List r29 = X.AnonymousClass7TE.A1I(r2)
            java.lang.String r3 = "user_remove_contact_enter"
            java.lang.String r2 = "remove_phone"
            com.facebookpay.form.fragment.model.FormClickEvent r7 = new com.facebookpay.form.fragment.model.FormClickEvent
            r7.<init>(r3, r2)
            java.lang.String r3 = "user_remove_contact_submit"
            java.lang.String r2 = "remove_phone_confirm"
            com.facebookpay.form.fragment.model.FormClickEvent r6 = new com.facebookpay.form.fragment.model.FormClickEvent
            r6.<init>(r3, r2)
            java.lang.String r3 = "user_remove_contact_cancel"
            java.lang.String r2 = "remove_phone_cancel"
            com.facebookpay.form.fragment.model.FormClickEvent r5 = new com.facebookpay.form.fragment.model.FormClickEvent
            r5.<init>(r3, r2)
            java.lang.String r2 = "client_edit_contact_success"
            java.util.List r30 = X.Pxj.A0y(r2, r8)
            java.lang.String r2 = "client_edit_contact_fail"
            java.util.List r31 = X.Pxj.A0y(r2, r8)
            java.lang.String r2 = "client_remove_contact_success"
            com.facebookpay.form.fragment.model.FormMutationEvent r4 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r4.<init>(r2, r8)
            java.lang.String r3 = "client_remove_contact_fail"
            com.facebookpay.form.fragment.model.FormMutationEvent r2 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r2.<init>(r3, r8)
            com.facebookpay.form.fragment.model.FormLoggingEvents r13 = new com.facebookpay.form.fragment.model.FormLoggingEvents
            r22 = r13
            r23 = r7
            r24 = r6
            r25 = r5
            r26 = r4
            r27 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x005a
        L_0x0110:
            r2 = r14
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SGG.A01(X.QXR, java.lang.Integer, java.lang.String, java.lang.String, int, boolean, boolean):com.facebookpay.form.fragment.model.FormParams");
    }
}

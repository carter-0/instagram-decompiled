package X;

import com.facebookpay.form.cell.text.TextCellParams;
import com.facebookpay.form.cell.text.TextValidatorParams;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import java.util.Collection;

public final class SGF {
    /* JADX WARNING: type inference failed for: r0v5, types: [com.facebookpay.form.cell.text.formatter.TextFormatter, java.lang.Object] */
    public static final TextCellParams A00(QXR qxr, Integer num, String str, String str2, boolean z, boolean z2) {
        ImmutableList of;
        int i;
        String A07;
        int i2 = 2131954867;
        int i3 = 2131954871;
        int i4 = 2131954872;
        int i5 = R.id.name_field;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 41) {
                i2 = 2131954865;
                i3 = 2131954864;
                i4 = 2131954866;
                i5 = R.id.first_name_field;
            } else if (intValue == 42) {
                i2 = 2131954869;
                i3 = 2131954868;
                i4 = 2131954870;
                i5 = R.id.last_name_field;
            }
        }
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
            of = ImmutableList.of(new TextValidatorParams(AnonymousClass05K.A0Y, "", i2, i3));
        }
        0qQ.A0A(of);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 2;
        }
        C8029QfJ qfJ = new C8029QfJ(i);
        Integer num2 = AnonymousClass05K.A0N;
        0qQ.A0B(num2, 0);
        qfJ.A08 = num2;
        0qQ.A0B(of, 0);
        qfJ.A0G.addAll(of);
        qfJ.A04 = new Object();
        qfJ.A0B = str;
        qfJ.A01 = i5;
        qfJ.A09 = "personName";
        qfJ.A0C = z;
        qfJ.A0D = z2;
        if (qxr == null || (A07 = qxr.A07("label")) == null || A07.length() == 0) {
            qfJ.A03 = i4;
        } else {
            String A072 = qxr.A07("label");
            if (A072 != null) {
                qfJ.A0A = A072;
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        Pxk.A0Z(qfJ, str2);
        return qfJ.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r12.length() == 0) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebookpay.form.fragment.model.FormParams A01(X.QXR r31, java.lang.String r32, int r33, boolean r34, boolean r35) {
        /*
            r30 = this;
            r7 = 2131961345(0x7f132601, float:1.9559384E38)
            r0 = 0
            r12 = r32
            if (r32 == 0) goto L_0x000f
            int r1 = r12.length()
            r2 = 0
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r2 = 1
        L_0x0010:
            r11 = 0
            if (r2 == 0) goto L_0x00c9
            java.lang.String r13 = "new_full_name_form_field"
        L_0x0016:
            r10 = r31
            r1 = r34
            r14 = r1
            r15 = r0
            com.facebookpay.form.cell.text.TextCellParams r6 = A00(r10, r11, r12, r13, r14, r15)
            java.lang.String r3 = "client_load_contact_success"
            if (r2 == 0) goto L_0x009a
            java.lang.String r5 = "add_name"
            com.facebookpay.form.fragment.model.FormDisplayEvent r2 = new com.facebookpay.form.fragment.model.FormDisplayEvent
            r2.<init>(r3, r5, r11)
            java.util.List r16 = X.AnonymousClass7TE.A1I(r2)
            java.lang.String r4 = "user_add_contact_submit"
            java.lang.String r3 = "add_name_save"
            com.facebookpay.form.fragment.model.FormClickEvent r2 = new com.facebookpay.form.fragment.model.FormClickEvent
            r2.<init>(r4, r3)
            java.util.List r17 = X.AnonymousClass7TE.A1I(r2)
            java.lang.String r2 = "client_add_contact_success"
            java.util.List r18 = X.Pxj.A0y(r2, r5)
            java.lang.String r2 = "client_add_contact_fail"
            java.util.List r19 = X.Pxj.A0y(r2, r5)
            com.facebookpay.form.fragment.model.FormLoggingEvents r10 = new com.facebookpay.form.fragment.model.FormLoggingEvents
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x0052:
            boolean r2 = X.C11431STx.A04()
            if (r2 == 0) goto L_0x0092
            r2 = 2131961197(0x7f13256d, float:1.9559084E38)
            com.facebookpay.form.cell.label.LabelCellParams r8 = X.C11089S9k.A01(r2, r0, r0, r0)
        L_0x005f:
            com.facebookpay.form.cell.CellParams[] r2 = new com.facebookpay.form.cell.CellParams[]{r6}
            java.util.ArrayList r19 = X.0sr.A1L(r2)
            com.facebookpay.form.fragment.model.FeatureConfiguration r9 = new com.facebookpay.form.fragment.model.FeatureConfiguration
            r2 = r35
            r9.<init>(r1, r0, r2)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r7)
            r22 = 5
            com.facebookpay.form.fragment.model.FormParams r7 = new com.facebookpay.form.fragment.model.FormParams
            r23 = r33
            r16 = r11
            r17 = r11
            r18 = r11
            r20 = r11
            r21 = r11
            r24 = r0
            r25 = r0
            r26 = r0
            r27 = r0
            r28 = r0
            r29 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r7
        L_0x0092:
            r2 = 2131961200(0x7f132570, float:1.955909E38)
            com.facebookpay.form.cell.label.LabelCellParams r8 = X.C11089S9k.A00(r2)
            goto L_0x005f
        L_0x009a:
            java.lang.String r5 = "edit_email"
            com.facebookpay.form.fragment.model.FormDisplayEvent r2 = new com.facebookpay.form.fragment.model.FormDisplayEvent
            r2.<init>(r3, r5, r11)
            java.util.List r16 = X.AnonymousClass7TE.A1I(r2)
            java.lang.String r4 = "user_edit_contact_submit"
            java.lang.String r3 = "edit_name_save"
            com.facebookpay.form.fragment.model.FormClickEvent r2 = new com.facebookpay.form.fragment.model.FormClickEvent
            r2.<init>(r4, r3)
            java.util.List r17 = X.AnonymousClass7TE.A1I(r2)
            java.lang.String r2 = "client_edit_contact_success"
            java.util.List r18 = X.Pxj.A0y(r2, r5)
            java.lang.String r2 = "client_edit_contact_fail"
            java.util.List r19 = X.Pxj.A0y(r2, r5)
            com.facebookpay.form.fragment.model.FormLoggingEvents r10 = new com.facebookpay.form.fragment.model.FormLoggingEvents
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0052
        L_0x00c9:
            r13 = r11
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SGF.A01(X.QXR, java.lang.String, int, boolean, boolean):com.facebookpay.form.fragment.model.FormParams");
    }
}

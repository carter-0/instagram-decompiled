package X;

import android.util.Patterns;
import com.facebookpay.form.cell.text.TextCellParams;
import com.facebookpay.form.cell.text.TextValidatorParams;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import java.util.Collection;

public final class SGE {
    public static final TextCellParams A00(QXR qxr, String str, String str2, boolean z, boolean z2) {
        ImmutableList of;
        String A07;
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
            TextValidatorParams textValidatorParams = new TextValidatorParams(AnonymousClass05K.A0Y, "", 2131954856, 2131954855);
            Integer num = AnonymousClass05K.A0N;
            String pattern = Patterns.EMAIL_ADDRESS.pattern();
            0qQ.A07(pattern);
            of = ImmutableList.of(textValidatorParams, new TextValidatorParams(num, pattern, 2131961282, 0));
        }
        C8029QfJ qfJ = new C8029QfJ(1);
        Integer num2 = AnonymousClass05K.A0u;
        0qQ.A0B(num2, 0);
        qfJ.A08 = num2;
        0qQ.A0A(of);
        0qQ.A0B(of, 0);
        qfJ.A0G.addAll(of);
        qfJ.A0B = str;
        qfJ.A01 = R.id.email_field;
        qfJ.A09 = "emailAddress";
        qfJ.A0C = z;
        qfJ.A0D = z2;
        if (qxr == null || (A07 = qxr.A07("label")) == null || A07.length() == 0) {
            qfJ.A03 = 2131954859;
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

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r21.length() == 0) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebookpay.form.fragment.model.FormParams A01(X.QXR r37, java.lang.Integer r38, java.lang.String r39, java.lang.String r40, int r41, boolean r42, boolean r43) {
        /*
            r36 = this;
            r10 = 2131961345(0x7f132601, float:1.9559384E38)
            r25 = 1
            r0 = 0
            r21 = r39
            if (r39 == 0) goto L_0x0011
            int r1 = r21.length()
            r4 = 0
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r4 = 1
        L_0x0012:
            r14 = 0
            if (r4 == 0) goto L_0x0110
            java.lang.String r2 = "new_email_form_field"
        L_0x0018:
            r5 = r37
            r3 = r40
            r1 = r42
            com.facebookpay.form.cell.text.TextCellParams r9 = A00(r5, r3, r2, r1, r0)
            java.lang.String r3 = "client_load_contact_success"
            if (r4 == 0) goto L_0x00a9
            java.lang.String r5 = "add_email"
            com.facebookpay.form.fragment.model.FormDisplayEvent r2 = new com.facebookpay.form.fragment.model.FormDisplayEvent
            r2.<init>(r3, r5, r14)
            java.util.List r32 = X.AnonymousClass7TE.A1I(r2)
            java.lang.String r4 = "user_add_contact_submit"
            java.lang.String r3 = "add_email_save"
            com.facebookpay.form.fragment.model.FormClickEvent r2 = new com.facebookpay.form.fragment.model.FormClickEvent
            r2.<init>(r4, r3)
            java.util.List r33 = X.AnonymousClass7TE.A1I(r2)
            java.lang.String r2 = "client_add_contact_success"
            java.util.List r34 = X.Pxj.A0y(r2, r5)
            java.lang.String r2 = "client_add_contact_fail"
            java.util.List r35 = X.Pxj.A0y(r2, r5)
            com.facebookpay.form.fragment.model.FormLoggingEvents r13 = new com.facebookpay.form.fragment.model.FormLoggingEvents
            r26 = r13
            r27 = r14
            r28 = r14
            r29 = r14
            r30 = r14
            r31 = r14
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35)
        L_0x005c:
            boolean r2 = X.C11431STx.A04()
            if (r2 == 0) goto L_0x00a1
            r2 = 2131961197(0x7f13256d, float:1.9559084E38)
            com.facebookpay.form.cell.label.LabelCellParams r11 = X.C11089S9k.A01(r2, r0, r0, r0)
        L_0x0069:
            com.facebookpay.form.cell.CellParams[] r2 = new com.facebookpay.form.cell.CellParams[]{r9}
            java.util.ArrayList r22 = X.0sr.A1L(r2)
            com.facebookpay.form.fragment.model.FeatureConfiguration r12 = new com.facebookpay.form.fragment.model.FeatureConfiguration
            r2 = r43
            r12.<init>(r1, r0, r2)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r10)
            r27 = 2131961316(0x7f1325e4, float:1.9559325E38)
            r28 = 2131961315(0x7f1325e3, float:1.9559323E38)
            r29 = 2131961310(0x7f1325de, float:1.9559313E38)
            r30 = 2131961303(0x7f1325d7, float:1.95593E38)
            com.facebookpay.form.fragment.model.FormParams r10 = new com.facebookpay.form.fragment.model.FormParams
            r18 = r38
            r26 = r41
            r15 = r14
            r16 = r14
            r19 = r14
            r20 = r14
            r23 = r14
            r24 = r14
            r31 = r0
            r32 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r10
        L_0x00a1:
            r2 = 2131961199(0x7f13256f, float:1.9559088E38)
            com.facebookpay.form.cell.label.LabelCellParams r11 = X.C11089S9k.A00(r2)
            goto L_0x0069
        L_0x00a9:
            java.lang.String r8 = "edit_email"
            com.facebookpay.form.fragment.model.FormDisplayEvent r2 = new com.facebookpay.form.fragment.model.FormDisplayEvent
            r2.<init>(r3, r8, r14)
            java.util.List r32 = X.AnonymousClass7TE.A1I(r2)
            java.lang.String r4 = "user_edit_contact_submit"
            java.lang.String r3 = "edit_email_save"
            com.facebookpay.form.fragment.model.FormClickEvent r2 = new com.facebookpay.form.fragment.model.FormClickEvent
            r2.<init>(r4, r3)
            java.util.List r33 = X.AnonymousClass7TE.A1I(r2)
            java.lang.String r3 = "user_remove_contact_enter"
            java.lang.String r2 = "remove_email"
            com.facebookpay.form.fragment.model.FormClickEvent r7 = new com.facebookpay.form.fragment.model.FormClickEvent
            r7.<init>(r3, r2)
            java.lang.String r3 = "user_remove_contact_submit"
            java.lang.String r2 = "remove_email_confirm"
            com.facebookpay.form.fragment.model.FormClickEvent r6 = new com.facebookpay.form.fragment.model.FormClickEvent
            r6.<init>(r3, r2)
            java.lang.String r3 = "user_remove_contact_cancel"
            java.lang.String r2 = "remove_email_cancel"
            com.facebookpay.form.fragment.model.FormClickEvent r5 = new com.facebookpay.form.fragment.model.FormClickEvent
            r5.<init>(r3, r2)
            java.lang.String r2 = "client_edit_contact_success"
            java.util.List r34 = X.Pxj.A0y(r2, r8)
            java.lang.String r2 = "client_edit_contact_fail"
            java.util.List r35 = X.Pxj.A0y(r2, r8)
            java.lang.String r2 = "client_remove_contact_success"
            com.facebookpay.form.fragment.model.FormMutationEvent r4 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r4.<init>(r2, r8)
            java.lang.String r3 = "client_remove_contact_fail"
            com.facebookpay.form.fragment.model.FormMutationEvent r2 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r2.<init>(r3, r8)
            com.facebookpay.form.fragment.model.FormLoggingEvents r13 = new com.facebookpay.form.fragment.model.FormLoggingEvents
            r26 = r13
            r27 = r7
            r28 = r6
            r29 = r5
            r30 = r4
            r31 = r2
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x005c
        L_0x0110:
            r2 = r14
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SGE.A01(X.QXR, java.lang.Integer, java.lang.String, java.lang.String, int, boolean, boolean):com.facebookpay.form.fragment.model.FormParams");
    }
}

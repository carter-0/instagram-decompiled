package X;

/* renamed from: X.Rzl  reason: case insensitive filesystem */
public final class C10885Rzl {
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c5, code lost:
        if (r13.length() == 0) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0046, code lost:
        if (r4.A01 != true) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebookpay.form.fragment.model.FormParams A00(com.facebookpay.form.fragment.model.FeatureConfiguration r26, com.facebookpay.form.model.AddressFormFieldsConfig r27, com.facebookpay.logging.LoggingContext r28, com.google.common.collect.ImmutableList r29, java.lang.Integer r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, int r40, int r41, int r42, boolean r43, boolean r44) {
        /*
            r25 = this;
            r18 = r40
            r13 = r31
            if (r31 == 0) goto L_0x0008
            r18 = r41
        L_0x0008:
            r5 = 0
            r0 = r39
            if (r39 == 0) goto L_0x0101
            com.facebook.common.locale.Country r2 = com.facebook.common.locale.Country.A00(r5, r0)
        L_0x0011:
            r0 = 11
            X.QfH r1 = new X.QfH
            r3 = r27
            r1.<init>(r3, r0)
            r0 = r32
            r1.A0G = r0
            r0 = r33
            r1.A0N = r0
            r0 = r34
            r1.A0I = r0
            r0 = r35
            r1.A0K = r0
            r0 = r36
            r1.A0J = r0
            r0 = r37
            r1.A0L = r0
            r0 = r38
            r1.A0M = r0
            r1.A0B = r2
            r0 = r28
            r1.A0D = r0
            r3 = 1
            r23 = 0
            r4 = r26
            if (r26 == 0) goto L_0x0048
            boolean r2 = r4.A01
            r0 = 1
            if (r2 == r3) goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            r1.A0S = r0
            r0 = r29
            r1.A0E = r0
            r0 = r44
            r1.A0T = r0
            if (r31 == 0) goto L_0x005b
            int r0 = r13.length()
            if (r0 != 0) goto L_0x00b9
        L_0x005b:
            r0 = 2
            r3 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "new_full_name_form_field"
            X.0eP r6 = X.C11082S9c.A00(r2, r0)
            java.lang.Integer r2 = X.Pxe.A0l()
            java.lang.String r0 = "new_address1_form_field"
            X.0eP r7 = X.C11082S9c.A00(r2, r0)
            r0 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "new_address2_form_field"
            X.0eP r8 = X.C11082S9c.A00(r2, r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.String r0 = "new_city_form_field"
            X.0eP r9 = X.C11082S9c.A00(r2, r0)
            java.lang.Integer r2 = X.Pxe.A0n()
            java.lang.String r0 = "new_state_form_field"
            X.0eP r10 = X.C11082S9c.A00(r2, r0)
            r0 = 9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "new_zip_code_form_field"
            X.0eP r11 = X.C11082S9c.A00(r2, r0)
            r0 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "new_country_picker"
            X.0eP r12 = X.C11082S9c.A00(r2, r0)
            X.0eP[] r0 = new X.0eP[]{r6, r7, r8, r9, r10, r11, r12}
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)
            r1.A0Q = r0
        L_0x00b9:
            com.facebookpay.form.cell.address.AddressCellParams r2 = new com.facebookpay.form.cell.address.AddressCellParams
            r2.<init>((X.C8027QfH) r1)
            if (r31 == 0) goto L_0x00c7
            int r0 = r13.length()
            r1 = 0
            if (r0 != 0) goto L_0x00c8
        L_0x00c7:
            r1 = 1
        L_0x00c8:
            r0 = 2131961196(0x7f13256c, float:1.9559082E38)
            com.facebookpay.form.cell.label.LabelCellParams r3 = X.C11089S9k.A00(r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r42)
            com.facebookpay.form.cell.CellParams[] r0 = new com.facebookpay.form.cell.CellParams[]{r2}
            java.util.ArrayList r14 = X.0sr.A1L(r0)
            if (r1 == 0) goto L_0x00fe
            java.lang.Integer r12 = X.AnonymousClass05K.A00
        L_0x00df:
            r17 = 2
            r19 = 2131961312(0x7f1325e0, float:1.9559317E38)
            r20 = 2131961311(0x7f1325df, float:1.9559315E38)
            r21 = 2131961310(0x7f1325de, float:1.9559313E38)
            r22 = 2131961303(0x7f1325d7, float:1.95593E38)
            com.facebookpay.form.fragment.model.FormParams r2 = new com.facebookpay.form.fragment.model.FormParams
            r24 = r43
            r10 = r30
            r6 = r5
            r7 = r5
            r8 = r5
            r11 = r5
            r15 = r5
            r16 = r5
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r2
        L_0x00fe:
            java.lang.Integer r12 = X.AnonymousClass05K.A01
            goto L_0x00df
        L_0x0101:
            r2 = r5
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10885Rzl.A00(com.facebookpay.form.fragment.model.FeatureConfiguration, com.facebookpay.form.model.AddressFormFieldsConfig, com.facebookpay.logging.LoggingContext, com.google.common.collect.ImmutableList, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, boolean, boolean):com.facebookpay.form.fragment.model.FormParams");
    }
}

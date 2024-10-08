package X;

/* renamed from: X.Qfv  reason: case insensitive filesystem */
public final class C8048Qfv extends C8041Qfl {
    public final int A00;
    public final AnonymousClass2Fj A01 = new 2Fk(false);
    public final C8049Qfw A02;
    public final boolean A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8048Qfv(com.facebookpay.form.cell.logging.FormCellLoggingEvents r28, com.facebookpay.form.cell.text.formatter.TextFormatter r29, com.fbpay.theme.FBPayIcon r30, com.google.common.collect.ImmutableList r31, java.lang.Integer r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, int r36, int r37, int r38, int r39, boolean r40, boolean r41, boolean r42, boolean r43) {
        /*
            r27 = this;
            r0 = 10
            r11 = r32
            X.0qQ.A0B(r11, r0)
            r8 = 0
            r4 = 0
            r17 = r38
            r16 = r37
            r15 = r36
            r9 = r30
            r25 = r42
            r7 = r29
            r22 = r41
            r6 = r28
            r21 = r40
            r5 = r27
            r10 = r31
            r12 = r33
            r13 = r34
            r14 = r35
            r18 = r4
            r19 = r4
            r20 = r4
            r23 = r4
            r24 = r4
            r26 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r0 = r39
            r5.A00 = r0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            X.2Fj r0 = new X.2Fj
            r0.<init>(r1)
            r5.A01 = r0
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x005b
            X.2gB r2 = r5.A07
            java.lang.Object r0 = r2.A02()
            if (r0 != 0) goto L_0x005b
            com.fbpay.theme.FBPayIcon r1 = r5.A0K
            if (r1 == 0) goto L_0x005b
            X.SE9 r0 = new X.SE9
            r0.<init>((com.fbpay.theme.FBPayIcon) r1)
            r2.A0B(r0)
        L_0x005b:
            int r3 = r5.A00
            if (r3 == 0) goto L_0x0093
            X.2E0 r2 = X.AnonymousClass2E0.A05()
            X.AnonymousClass2E0.A0K(r2)
            X.2Fb r0 = r2.A00
            X.0eK r1 = r0.A0H
            java.lang.String r0 = "SharedPreferences Factory is not provided!"
            X.02V.A03(r1, r0)
            X.2Fb r0 = r2.A00
            X.0eK r0 = r0.A0H
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "saw_card_scanner_tooltip"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 != 0) goto L_0x0093
            r0 = 1
            if (r3 != r0) goto L_0x00b4
            android.os.Handler r3 = X.AnonymousClass7TF.A0D()
            X.TD9 r2 = new X.TD9
            r2.<init>(r5)
            r0 = 2000(0x7d0, double:9.88E-321)
            r3.postDelayed(r2, r0)
        L_0x0093:
            r0 = r43
            r5.A03 = r0
            com.google.common.collect.ImmutableList r0 = r5.A00
            X.3kO r2 = X.C66580MXl.A0J(r0)
        L_0x009d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b2
            java.lang.Object r1 = r2.next()
            X.S4U r1 = (X.S4U) r1
            boolean r0 = r1 instanceof X.C8049Qfw
            if (r0 == 0) goto L_0x009d
            X.Qfw r1 = (X.C8049Qfw) r1
        L_0x00af:
            r5.A02 = r1
            return
        L_0x00b2:
            r1 = 0
            goto L_0x00af
        L_0x00b4:
            r0 = 2
            if (r3 != r0) goto L_0x0093
            X.2Fj r1 = r5.A0E
            r0 = 56
            X.Sdr r0 = X.C11649Sdr.A00(r5, r0)
            X.SQB.A03(r1, r0)
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8048Qfv.<init>(com.facebookpay.form.cell.logging.FormCellLoggingEvents, com.facebookpay.form.cell.text.formatter.TextFormatter, com.fbpay.theme.FBPayIcon, com.google.common.collect.ImmutableList, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, int, int, int, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r4 != r1.A00) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C8048Qfv r6) {
        /*
            X.2gB r1 = r6.A07
            java.lang.Object r0 = r1.A02()
            r3 = 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            if (r0 == 0) goto L_0x0022
            com.fbpay.theme.FBPayIcon r4 = r6.A0K
            if (r4 == 0) goto L_0x0022
            java.lang.Object r1 = r1.A02()
            boolean r0 = r1 instanceof X.SE9
            if (r0 == 0) goto L_0x0022
            X.SE9 r1 = (X.SE9) r1
            if (r1 == 0) goto L_0x0022
            com.fbpay.theme.FBPayIcon r0 = r1.A00
            r2 = 1
            if (r4 == r0) goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            X.2Fj r1 = r6.A01
            java.lang.Object r0 = r1.A02()
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x005b
            if (r2 == 0) goto L_0x005b
            r1.A0B(r5)
            X.2E0 r2 = X.AnonymousClass2E0.A05()
            X.AnonymousClass2E0.A0K(r2)
            X.2Fb r0 = r2.A00
            X.0eK r1 = r0.A0H
            java.lang.String r0 = "SharedPreferences Factory is not provided!"
            X.02V.A03(r1, r0)
            X.2Fb r0 = r2.A00
            X.0eK r0 = r0.A0H
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "saw_card_scanner_tooltip"
            r1.putBoolean(r0, r3)
            r1.apply()
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8048Qfv.A01(X.Qfv):void");
    }
}

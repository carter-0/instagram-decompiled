package X;

public final class PC3 implements C74407PuN {
    public final AnonymousClass9HC A00;
    public final AnonymousClass7L2 A01;

    public final boolean AFT(C74541Pwa pwa, C74552Pwl pwl, int i) {
        0qQ.A0B(pwl, 0);
        if (OZ6.A00(pwa, pwl, i) == 2FW.A0G || OZ6.A00(pwa, pwl, i) == 2FW.A0l) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r7v13, types: [X.7OD] */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: type inference failed for: r13v14, types: [X.74v] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.OTT AWh(android.content.Context r24, X.C61084JwM r25, X.C74541Pwa r26, com.instagram.direct.model.messaginguser.MessagingUser r27, X.OMF r28, X.C74552Pwl r29, java.util.Map r30, java.util.Set r31, int r32, boolean r33) {
        /*
            r23 = this;
            r0 = r24
            r21 = r28
            r1 = r21
            X.AnonymousClass7TG.A1N(r0, r1)
            r3 = 2
            r4 = r27
            r1 = r29
            r17 = r30
            r5 = r31
            r2 = r17
            X.C51974G9v.A0d(r3, r1, r4, r5, r2)
            r2 = r32
            int r5 = r1.BS2(r2)
            r7 = r23
            r6 = r26
            if (r5 == r3) goto L_0x02ae
            r3 = 10
            if (r5 == r3) goto L_0x024b
            r3 = 13
            if (r5 == r3) goto L_0x0205
            r3 = 21
            if (r5 != r3) goto L_0x01e6
            X.9HC r3 = r7.A00
            X.0eM r3 = r3.A0V
            boolean r3 = X.AnonymousClass7TF.A1Z(r3)
            if (r3 == 0) goto L_0x01e6
            X.7L2 r8 = r7.A01
            java.lang.String r5 = X.C74552Pwl.A01(r6, r1, r2)
            android.content.res.Resources r3 = r0.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r10 = r3.getLayoutDirection()
            r3 = 2131958975(0x7f131cbf, float:1.9554577E38)
            java.lang.String r9 = X.AnonymousClass7TE.A16(r0, r3)
            r14 = 1
            if (r10 != r14) goto L_0x01e0
            java.lang.String r7 = X.OXG.A00(r9, r5)
        L_0x0059:
            android.text.SpannableStringBuilder r6 = X.DbS.A0C(r7)
            long r15 = r1.BsH(r2)
            java.lang.Long r3 = r4.A02
            r5 = 1
            r4 = 0
            if (r3 == 0) goto L_0x006f
            long r11 = r3.longValue()
            int r3 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x01dd
        L_0x006f:
            r3 = 2131966834(0x7f133b72, float:1.9570517E38)
            r12 = 2
            java.lang.String r15 = "@0"
            java.lang.String r13 = "@1"
            java.lang.String r3 = X.DbV.A0u(r0, r15, r13, r3)
            X.0qQ.A07(r3)
            if (r10 != r14) goto L_0x01d7
            java.lang.String r14 = X.OXG.A00(r9, r3)
        L_0x0084:
            java.lang.String r11 = "\\"
            java.lang.String r3 = "\\\\"
            java.lang.String r14 = X.00p.A0g(r14, r11, r3, r4)
            java.lang.String r11 = "^"
            java.lang.String r3 = "\\^"
            java.lang.String r14 = X.00p.A0g(r14, r11, r3, r4)
            java.lang.String r11 = "$"
            java.lang.String r3 = "\\$"
            java.lang.String r14 = X.00p.A0g(r14, r11, r3, r4)
            java.lang.String r11 = "*"
            java.lang.String r3 = "\\*"
            java.lang.String r14 = X.00p.A0g(r14, r11, r3, r4)
            java.lang.String r11 = "+"
            java.lang.String r3 = "\\+"
            java.lang.String r14 = X.00p.A0g(r14, r11, r3, r4)
            java.lang.String r11 = "?"
            java.lang.String r3 = "\\?"
            java.lang.String r14 = X.00p.A0g(r14, r11, r3, r4)
            java.lang.String r11 = "."
            java.lang.String r3 = "\\."
            java.lang.String r14 = X.00p.A0g(r14, r11, r3, r4)
            java.lang.String r11 = "("
            java.lang.String r3 = "\\("
            java.lang.String r14 = X.00p.A0g(r14, r11, r3, r4)
            java.lang.String r11 = ")"
            java.lang.String r3 = "\\)"
            java.lang.String r14 = X.00p.A0g(r14, r11, r3, r4)
            java.lang.String r11 = "|"
            java.lang.String r3 = "\\|"
            java.lang.String r14 = X.00p.A0g(r14, r11, r3, r4)
            java.lang.String r11 = "{"
            java.lang.String r3 = "\\{"
            java.lang.String r14 = X.00p.A0g(r14, r11, r3, r4)
            java.lang.String r11 = "}"
            java.lang.String r3 = "\\}"
            java.lang.String r14 = X.00p.A0g(r14, r11, r3, r4)
            java.lang.String r11 = "["
            java.lang.String r3 = "\\["
            java.lang.String r14 = X.00p.A0g(r14, r11, r3, r4)
            java.lang.String r11 = "]"
            java.lang.String r3 = "\\]"
            java.lang.String r11 = X.00p.A0g(r14, r11, r3, r4)
            java.lang.String r3 = "(.*)"
            java.lang.String r11 = X.00p.A0g(r11, r15, r3, r4)
            java.lang.String r3 = ".*"
            java.lang.String r13 = X.00p.A0g(r11, r13, r3, r4)
            X.Nmz r11 = X.C69517Nmz.MULTILINE
            X.11S r3 = new X.11S
            r3.<init>(r13, r11)
            X.5gs r3 = r3.A05(r7)
            if (r3 == 0) goto L_0x01d4
            X.5gt r11 = r3.A02
            if (r11 == 0) goto L_0x01d4
            int r3 = r11.size()
            if (r3 != r12) goto L_0x01d4
            X.5gu r3 = r11.A09(r5)
            if (r3 == 0) goto L_0x01d4
            X.2HY r13 = r3.A01
        L_0x011f:
            java.lang.String r11 = r1.BsK(r2)
            r3 = r17
            java.lang.Object r12 = r3.get(r11)
            com.instagram.user.model.User r12 = (com.instagram.user.model.User) r12
            if (r13 == 0) goto L_0x01dd
            boolean r3 = r13.isEmpty()
            if (r3 != 0) goto L_0x01dd
            if (r12 == 0) goto L_0x01dd
            java.lang.Integer r16 = X.AnonymousClass05K.A0u
            int r14 = r8.A00
            r11 = 33
            java.lang.String r18 = ""
            X.3ud r3 = new X.3ud
            r15 = r3
            r17 = r9
            r19 = r14
            r20 = r5
            r15.<init>(r16, r17, r18, r19, r20)
            java.lang.Integer r14 = X.AnonymousClass05K.A01
            r3.A01 = r14
            int r14 = r13.A00
            int r13 = r13.A01
            int r13 = r13 + 1
            r6.setSpan(r3, r14, r13, r11)
            r3 = 2131963730(0x7f132f52, float:1.9564222E38)
            java.lang.String r11 = X.DbY.A0b(r0, r12, r3)
        L_0x015d:
            java.lang.Integer r16 = X.AnonymousClass05K.A0u
            X.7Kx r3 = r8.A04
            int r3 = r3.A04
            r14 = 0
            java.lang.String r18 = ""
            X.3ud r12 = new X.3ud
            r15 = r12
            r17 = r9
            r19 = r3
            r20 = r5
            r15.<init>(r16, r17, r18, r19, r20)
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            r12.A01 = r3
            int r13 = r7.length()
            int r3 = r9.length()
            int r7 = r13 - r3
            r3 = 33
            r6.setSpan(r12, r7, r13, r3)
            r7 = 2131963727(0x7f132f4f, float:1.9564216E38)
            r3 = r21
            X.NAt r3 = r3.A00
            com.facebook.msys.mci.CQLResultSet r3 = r3.mResultSet
            long r12 = r3.getLong(r4, r4)
            java.lang.Long r3 = java.lang.Long.valueOf(r12)
            java.lang.String r0 = X.DbY.A0c(r0, r3, r7)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            if (r10 != r5) goto L_0x01a3
            r3.add(r0)
        L_0x01a3:
            if (r11 == 0) goto L_0x01a8
            r3.add(r11)
        L_0x01a8:
            if (r10 != 0) goto L_0x01ad
            r3.add(r0)
        L_0x01ad:
            java.lang.String r17 = r1.BSF(r2)
            android.text.SpannableString r15 = X.C66580MXl.A0D(r6)
            int r0 = r8.A00
            X.74v r6 = new X.74v
            r13 = r6
            r16 = r14
            r18 = r3
            r19 = r0
            r21 = r4
            r22 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x01c7:
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            java.lang.String r2 = X.C71095OcV.A02(r1, r2)
            r1 = 0
            X.OTT r0 = new X.OTT
            r0.<init>(r3, r2, r6, r1)
            return r0
        L_0x01d4:
            r13 = 0
            goto L_0x011f
        L_0x01d7:
            java.lang.String r14 = X.OXG.A00(r3, r9)
            goto L_0x0084
        L_0x01dd:
            r11 = 0
            goto L_0x015d
        L_0x01e0:
            java.lang.String r7 = X.OXG.A00(r5, r9)
            goto L_0x0059
        L_0x01e6:
            X.7L2 r3 = r7.A01
            java.lang.String r0 = X.C74552Pwl.A01(r6, r1, r2)
            r13 = 0
            r7 = 0
            java.lang.String r10 = r1.BSF(r2)
            android.text.SpannableString r8 = X.C66580MXl.A0D(r0)
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            int r12 = r3.A00
            X.74v r6 = new X.74v
            r9 = r7
            r14 = r13
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x01c7
        L_0x0205:
            X.7L2 r7 = r7.A01
            r3 = 2131958845(0x7f131c3d, float:1.9554314E38)
            java.lang.String r6 = X.AnonymousClass7TE.A16(r0, r3)
            android.text.SpannableStringBuilder r5 = X.C51965G9l.A0E()
            int r4 = r7.A00
            X.OXG.A01(r0, r5, r4)
            java.lang.String r3 = " "
            r5.append(r3)
            r3 = 2131958846(0x7f131c3e, float:1.9554316E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r0, r3)
            X.OXG.A02(r0, r5, r3, r4)
            r3 = 10
            r5.append(r3)
            r5.append(r6)
            android.text.SpannableString r8 = X.C66580MXl.A0D(r5)
            r3 = 2131963729(0x7f132f51, float:1.956422E38)
            java.lang.String r9 = r0.getString(r3)
            r3 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r10 = X.AnonymousClass7TE.A16(r0, r3)
            X.7Kx r0 = r7.A04
            int r0 = r0.A04
            long r13 = X.C74552Pwl.A00(r1, r2)
            r15 = 0
            goto L_0x0323
        L_0x024b:
            X.7L2 r4 = r7.A01
            java.lang.String r7 = X.C74552Pwl.A01(r6, r1, r2)
            android.text.SpannableStringBuilder r6 = X.C51965G9l.A0E()
            r14 = 0
            java.lang.String r5 = " "
            r3 = 2131958976(0x7f131cc0, float:1.955458E38)
            java.lang.String r9 = X.AnonymousClass7TE.A16(r0, r3)
            java.lang.String r5 = X.002.A0g(r7, r5, r9)
            java.lang.Integer r8 = X.AnonymousClass05K.A0u
            X.7Kx r3 = r4.A04
            int r3 = r3.A04
            r13 = 1
            java.lang.String r10 = ""
            X.3ud r7 = new X.3ud
            r11 = r3
            r12 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            r7.A01 = r3
            r6.append(r5)
            int r5 = r6.length()
            int r3 = r9.length()
            int r5 = r5 - r3
            X.C51971G9r.A0y(r6, r7, r5)
            r7 = 0
            java.lang.String r10 = r1.BSF(r2)
            android.text.SpannableString r8 = X.C66580MXl.A0D(r6)
            r3 = 2131963728(0x7f132f50, float:1.9564218E38)
            java.lang.String r3 = r0.getString(r3)
            java.util.List r11 = X.AnonymousClass7TE.A1I(r3)
            int r12 = r4.A00
            boolean r15 = r4.A00()
            r3 = 69
            X.PU8 r9 = new X.PU8
            r9.<init>(r0, r3)
            X.74v r6 = new X.74v
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x01c7
        L_0x02ae:
            X.7L2 r7 = r7.A01
            java.lang.String r5 = X.C74552Pwl.A01(r6, r1, r2)
            android.text.SpannableStringBuilder r9 = X.C51965G9l.A0E()
            r3 = 2130971409(0x7f040b11, float:1.7551556E38)
            int r3 = X.2Yu.A0F(r0, r3)
            X.OXG.A01(r0, r9, r3)
            java.lang.String r3 = " "
            r9.append(r3)
            int r4 = X.C51968G9o.A04(r0)
            r3 = 2131959239(0x7f131dc7, float:1.9555113E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r0, r3)
            X.OXG.A02(r0, r9, r3, r4)
            r3 = 10
            r9.append(r3)
            r9.append(r5)
            int r8 = r9.length()
            int r3 = X.DbX.A05(r5)
            int r3 = r3 + 1
            int r8 = r8 - r3
            int r5 = r9.length()
            r4 = 2132018053(0x7f140385, float:1.9674402E38)
            android.text.style.TextAppearanceSpan r3 = new android.text.style.TextAppearanceSpan
            r3.<init>(r0, r4)
            r6 = 33
            r9.setSpan(r3, r8, r5, r6)
            X.W7t r5 = new X.W7t
            r5.<init>()
            r4 = 0
            int r3 = r9.length()
            r9.setSpan(r5, r4, r3, r6)
            android.text.SpannableString r8 = X.C66580MXl.A0D(r9)
            r3 = 2131963729(0x7f132f51, float:1.956422E38)
            java.lang.String r9 = r0.getString(r3)
            int r4 = r7.A00
            r3 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r10 = X.AnonymousClass7TE.A16(r0, r3)
            X.7Kx r0 = r7.A04
            int r0 = r0.A04
            r15 = 1
            long r13 = X.C74552Pwl.A00(r1, r2)
        L_0x0323:
            X.7OD r6 = new X.7OD
            r7 = r6
            r11 = r4
            r12 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r15)
            goto L_0x01c7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PC3.AWh(android.content.Context, X.JwM, X.Pwa, com.instagram.direct.model.messaginguser.MessagingUser, X.OMF, X.Pwl, java.util.Map, java.util.Set, int, boolean):X.OTT");
    }

    public PC3(AnonymousClass9HC r1, AnonymousClass7L2 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}

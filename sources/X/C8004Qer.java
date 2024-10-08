package X;

import com.facebookpay.logging.LoggingContext;

/* renamed from: X.Qer  reason: case insensitive filesystem */
public final class C8004Qer extends QEW {
    public final C13612Tde A00;
    public final C13612Tde A01;

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0141, code lost:
        if (r5 != null) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.QF3 r10, X.SUj r11) {
        /*
            r9 = this;
            r3 = 0
            boolean r4 = X.AnonymousClass7TF.A1U(r3, r11, r10)
            boolean r0 = X.SUj.A0V(r11)
            if (r0 != 0) goto L_0x0011
            boolean r0 = X.SUj.A0T(r11)
            if (r0 == 0) goto L_0x0147
        L_0x0011:
            java.lang.Object r6 = r11.A01
            if (r6 == 0) goto L_0x0147
            com.instagram.common.session.UserSession r5 = X.C11431STx.A00()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314498245724815(0x8103d800220a8f, double:3.0287731451192777E-306)
            X.182.A06(r2, r5, r0)
            com.instagram.common.session.UserSession r5 = X.C11431STx.A00()
            X.0Tu r2 = X.0Tu.A06
            boolean r0 = X.182.A06(r2, r5, r0)
            r1 = 0
            if (r0 == 0) goto L_0x013a
            r5 = r6
            com.facebookpay.common.recyclerview.adapteritems.PuxTermsConditionItem r5 = (com.facebookpay.common.recyclerview.adapteritems.PuxTermsConditionItem) r5
            if (r5 == 0) goto L_0x013a
            X.C7X r2 = r5.A00
            if (r2 == 0) goto L_0x013a
            java.lang.String r8 = X.C41845B3m.A0l(r2, r3)
            if (r8 == 0) goto L_0x0145
            boolean r0 = r5.A09
            if (r0 != r4) goto L_0x012b
            X.0sn r7 = X.0sn.A00
            com.google.common.collect.ImmutableList r6 = r2.A0E()
            X.0qQ.A07(r6)
            X.AnonymousClass2E0.A0A()
            com.facebookpay.widget.disclaimer.DisclaimerLayout r0 = r10.A00
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r0)
            r0 = 2131100462(0x7f06032e, float:1.7813306E38)
            int r0 = r2.getColor(r0)
            java.util.List r0 = X.C11295SKd.A01(r6, r0, r3)
        L_0x0060:
            X.AnonymousClass7TF.A1B(r7, r4, r0)
            X.QmZ r2 = new X.QmZ
            r2.<init>(r8, r7, r0)
            X.Tde r0 = r9.A01
            X.0qQ.A0B(r0, r3)
            android.text.SpannableString r7 = r2.A01(r0, r3)
        L_0x0071:
            X.C7X r8 = r5.A01
            if (r8 == 0) goto L_0x00d1
            java.lang.String r6 = X.C41845B3m.A0l(r8, r3)
            if (r6 == 0) goto L_0x00d1
            java.lang.String r1 = "[[cta_text_token]]"
            int r0 = android.text.TextUtils.indexOf(r7, r1)
            if (r0 >= 0) goto L_0x0117
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            java.lang.String r0 = " "
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[]{r7, r0, r6}
            java.lang.CharSequence r7 = android.text.TextUtils.concat(r0)
        L_0x008f:
            java.lang.String r1 = r7.toString()
            int r0 = android.text.TextUtils.indexOf(r7, r6)
            java.lang.String r0 = X.C51967G9n.A0q(r1, r3, r0)
            int r6 = r0.length()
            boolean r0 = r5.A09
            if (r0 != r4) goto L_0x0109
            X.0sn r5 = X.0sn.A00
            com.google.common.collect.ImmutableList r2 = r8.A0E()
            X.0qQ.A07(r2)
            X.AnonymousClass2E0.A0A()
            com.facebookpay.widget.disclaimer.DisclaimerLayout r0 = r10.A00
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r0)
            r0 = 2131100462(0x7f06032e, float:1.7813306E38)
            int r0 = r1.getColor(r0)
            java.util.List r0 = X.C11295SKd.A01(r2, r0, r6)
        L_0x00c0:
            X.AnonymousClass7TF.A1B(r5, r4, r0)
            X.QmZ r1 = new X.QmZ
            r1.<init>(r7, r5, r0)
            X.Tde r0 = r9.A00
            X.0qQ.A0B(r0, r3)
            android.text.SpannableString r1 = r1.A01(r0, r3)
        L_0x00d1:
            com.facebookpay.widget.disclaimer.DisclaimerLayout r0 = r10.A00
            r0.setPrimaryLinkableText(r1)
            com.facebookpay.widget.accessibility.AccessibleTextView r2 = r0.getPrimaryTextView()
            android.content.Context r1 = r0.getContext()
            r0 = 2131961174(0x7f132556, float:1.9559037E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            r2.A00(r0)
        L_0x00e8:
            com.facebookpay.widget.disclaimer.DisclaimerLayout r2 = r10.A00
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A01
            if (r0 == 0) goto L_0x017d
            r1 = 8
            r0.setVisibility(r1)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A02
            if (r0 == 0) goto L_0x0179
            r0.setVisibility(r1)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A03
            if (r0 == 0) goto L_0x0175
            r0.setVisibility(r1)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A04
            if (r0 == 0) goto L_0x0181
            r0.setVisibility(r1)
            return
        L_0x0109:
            com.google.common.collect.ImmutableList r0 = r8.A0E()
            X.0qQ.A07(r0)
            java.util.List r5 = X.C11295SKd.A02(r0, r6, r3)
            X.0sn r0 = X.0sn.A00
            goto L_0x00c0
        L_0x0117:
            android.text.SpannableStringBuilder r2 = X.DbS.A0C(r7)
            java.lang.String r0 = java.lang.String.valueOf(r7)
            int r1 = X.00l.A08(r0, r1, r3, r3)
            int r0 = r1 + 18
            android.text.SpannableStringBuilder r7 = r2.replace(r1, r0, r6)
            goto L_0x008f
        L_0x012b:
            com.google.common.collect.ImmutableList r0 = r2.A0E()
            X.0qQ.A07(r0)
            java.util.List r7 = X.C11295SKd.A02(r0, r3, r4)
            X.0sn r0 = X.0sn.A00
            goto L_0x0060
        L_0x013a:
            com.facebookpay.common.recyclerview.adapteritems.PuxTermsConditionItem r6 = (com.facebookpay.common.recyclerview.adapteritems.PuxTermsConditionItem) r6
            r5 = r6
            if (r6 == 0) goto L_0x0145
            java.lang.String r7 = r6.A05
        L_0x0141:
            if (r5 == 0) goto L_0x00d1
            goto L_0x0071
        L_0x0145:
            r7 = r1
            goto L_0x0141
        L_0x0147:
            boolean r0 = X.SUj.A0T(r11)
            if (r0 == 0) goto L_0x00e8
            com.facebookpay.widget.disclaimer.DisclaimerLayout r1 = r10.A00
            com.facebook.shimmer.ShimmerFrameLayout r0 = r1.A01
            if (r0 == 0) goto L_0x017d
            r0.setVisibility(r3)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r1.A02
            if (r0 == 0) goto L_0x0179
            r0.setVisibility(r3)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r1.A03
            if (r0 == 0) goto L_0x0175
            r0.setVisibility(r3)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r1.A04
            if (r0 == 0) goto L_0x0181
            r0.setVisibility(r3)
            com.facebookpay.widget.accessibility.AccessibleTextView r1 = r1.getPrimaryTextView()
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0175:
            java.lang.String r0 = "shimmerRow3"
            goto L_0x0184
        L_0x0179:
            java.lang.String r0 = "shimmerRow2"
            goto L_0x0184
        L_0x017d:
            java.lang.String r0 = "shimmerRow1"
            goto L_0x0184
        L_0x0181:
            java.lang.String r0 = "shimmerRow4"
        L_0x0184:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8004Qer.A0B(X.QF3, X.SUj):void");
    }

    public C8004Qer(LoggingContext loggingContext, C13612Tde tde, C13612Tde tde2) {
        super(RH6.A0m, loggingContext, false);
        this.A01 = tde;
        this.A00 = tde2;
    }
}

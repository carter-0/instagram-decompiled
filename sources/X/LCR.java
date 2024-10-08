package X;

public final class LCR {
    public final C66533MVn A00;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.LBA r14) {
        /*
            r13 = this;
            X.MVn r9 = r13.A00
            android.view.View r8 = r9.As8()
            int r0 = r14.A00
            r8.setVisibility(r0)
            android.view.View r1 = r9.B8V()
            int r0 = r14.A01
            r1.setVisibility(r0)
            android.view.View r7 = r9.Blc()
            int r0 = r14.A02
            r7.setVisibility(r0)
            android.view.View r1 = r9.B8U()
            if (r1 == 0) goto L_0x0028
            int r0 = r14.A04
            r1.setVisibility(r0)
        L_0x0028:
            android.view.View r1 = r9.C2l()
            int r0 = r14.A03
            r1.setVisibility(r0)
            android.widget.TextView r6 = r9.B8W()
            android.content.res.Resources r5 = r6.getResources()
            X.0qQ.A07(r5)
            com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel r4 = r14.A08
            if (r4 == 0) goto L_0x00da
            java.lang.String r3 = r4.A00
            java.lang.String r2 = r4.A01
            java.lang.String r10 = r4.A02
            int r11 = r3.length()
            r1 = 30
            r0 = 0
            if (r11 > r1) goto L_0x0050
            r0 = 1
        L_0x0050:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            if (r3 == 0) goto L_0x0059
            r1.append(r3)
        L_0x0059:
            if (r0 == 0) goto L_0x0077
            if (r2 == 0) goto L_0x0077
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0068
            java.lang.String r0 = " · "
            r1.append(r0)
        L_0x0068:
            if (r10 != 0) goto L_0x0074
            r0 = 2131962822(0x7f132bc6, float:1.956238E38)
            java.lang.String r10 = X.AnonymousClass7TF.A0e(r5, r2, r0)
            X.0qQ.A07(r10)
        L_0x0074:
            r1.append(r10)
        L_0x0077:
            java.lang.String r0 = X.DbT.A10(r1)
        L_0x007b:
            r6.setText(r0)
            android.widget.TextView r2 = r9.B8d()
            android.content.res.Resources r1 = r2.getResources()
            X.0qQ.A07(r1)
            com.instagram.model.fundraiser.NewFundraiserInfo r5 = r14.A05
            r0 = 2131962857(0x7f132be9, float:1.956245E38)
            if (r5 == 0) goto L_0x0093
            r0 = 2131962821(0x7f132bc5, float:1.9562378E38)
        L_0x0093:
            java.lang.String r0 = X.AnonymousClass7TF.A0d(r1, r0)
            r2.setText(r0)
            r0 = 16
            X.LY3.A00(r8, r0, r14)
            r0 = 17
            X.LY3.A00(r7, r0, r14)
            android.view.View r1 = r9.B8c()
            r0 = 18
            X.LY3.A00(r1, r0, r14)
            if (r5 != 0) goto L_0x00bf
            if (r4 != 0) goto L_0x00be
            X.L8e r0 = r14.A07
            com.instagram.common.session.UserSession r3 = r0.A01
            java.lang.String r2 = r0.A02
            java.lang.String r1 = r0.A03
            X.0iw r0 = r0.A00
            X.LKP.A00(r0, r3, r2, r1)
        L_0x00be:
            return
        L_0x00bf:
            java.lang.String r0 = r5.A01
            if (r0 == 0) goto L_0x00be
            X.L8e r0 = r14.A07
            com.instagram.common.session.UserSession r3 = r0.A01
            X.0Tu r2 = X.0Tu.A06
            r0 = 36317474655835306(0x81068d000014aa, double:3.030655438858194E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00be
            X.MVJ r0 = r14.A06
            r0.E3e(r5)
            return
        L_0x00da:
            com.instagram.model.fundraiser.NewFundraiserInfo r11 = r14.A05
            if (r11 == 0) goto L_0x0115
            java.lang.String r3 = r11.A07
            java.lang.String r12 = r11.A05
            int r0 = r11.A00
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r2 = 0
            if (r12 == 0) goto L_0x0106
            if (r10 == 0) goto L_0x0106
            android.content.res.Configuration r0 = r5.getConfiguration()
            java.util.Locale r0 = r0.locale
            java.text.NumberFormat r1 = java.text.NumberFormat.getCurrencyInstance(r0)
            java.util.Currency r0 = java.util.Currency.getInstance(r12)
            r1.setCurrency(r0)
            r0 = 0
            r1.setMaximumFractionDigits(r0)
            java.lang.String r2 = r1.format(r10)
        L_0x0106:
            r10 = 0
            java.lang.String r0 = r11.A0A
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "ONBOARDED"
            boolean r0 = X.0qQ.A0K(r1, r0)
            goto L_0x0050
        L_0x0115:
            java.lang.String r0 = ""
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LCR.A00(X.LBA):void");
    }

    public LCR(C66533MVn mVn) {
        this.A00 = mVn;
    }
}

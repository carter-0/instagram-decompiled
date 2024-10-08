package X;

/* renamed from: X.3NE  reason: invalid class name */
public abstract class AnonymousClass3NE {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r1 == com.instagram.api.schemas.HighlightReelTypeStr.A06) goto L_0x0012;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0267  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.instagram.common.session.UserSession r16, X.C255773uh r17, X.AnonymousClass3BT r18, X.AnonymousClass3N8 r19, boolean r20) {
        /*
            r12 = 0
            r15 = 1
            r8 = r18
            com.instagram.model.reels.Reel r3 = r8.A03
            com.instagram.api.schemas.HighlightReelTypeStr r1 = r3.A09
            com.instagram.api.schemas.HighlightReelTypeStr r0 = com.instagram.api.schemas.HighlightReelTypeStr.FAN_CLUB
            r7 = 0
            if (r1 == r0) goto L_0x0012
            com.instagram.api.schemas.HighlightReelTypeStr r0 = com.instagram.api.schemas.HighlightReelTypeStr.FAN_CLUB_WELCOME_FEEDBACK_STORY
            r9 = 0
            if (r1 != r0) goto L_0x0013
        L_0x0012:
            r9 = 1
        L_0x0013:
            java.lang.String r1 = r3.A0r
            r6 = 0
            r4 = r16
            r2 = r19
            if (r1 == 0) goto L_0x0355
            com.instagram.model.reels.ReelType r5 = r3.A0P
            com.instagram.model.reels.ReelType r0 = com.instagram.model.reels.ReelType.A0b
            if (r5 == r0) goto L_0x031a
            com.instagram.model.reels.ReelType r0 = com.instagram.model.reels.ReelType.A0d
            if (r5 == r0) goto L_0x031a
            android.widget.TextView r5 = r2.A04()
            if (r9 == 0) goto L_0x03d2
            android.content.Context r9 = r5.getContext()
            X.0qQ.A07(r9)
            r5 = 2131238187(0x7f081d2b, float:1.8092646E38)
            r0 = 2131099928(0x7f060118, float:1.7812223E38)
            android.graphics.drawable.Drawable r5 = X.AnonymousClass4Ed.A01(r9, r5, r0)
            android.widget.TextView r0 = r2.A04()
            r0.setCompoundDrawablesWithIntrinsicBounds(r5, r6, r6, r6)
            android.widget.TextView r0 = r2.A04()
            r0.setText(r1)
        L_0x004b:
            boolean r0 = r8.A03()
            r10 = 8
            if (r0 == 0) goto L_0x02f6
            android.widget.TextView r0 = r2.A04()
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            X.5BF r0 = new X.5BF
            r0.<init>(r2)
            r1.addOnGlobalLayoutListener(r0)
            android.widget.TextView r1 = r2.A05()
            if (r1 == 0) goto L_0x007c
            boolean r0 = r8.A04(r4)
            if (r0 == 0) goto L_0x0075
            boolean r0 = r3.A0i()
            if (r0 == 0) goto L_0x02f2
        L_0x0075:
            if (r20 != 0) goto L_0x02f2
            int r0 = r2.A01
        L_0x0079:
            r1.setTextColor(r0)
        L_0x007c:
            android.widget.TextView r9 = r2.A05()
            if (r9 == 0) goto L_0x00a8
            android.widget.TextView r0 = r2.A05()
            if (r0 == 0) goto L_0x00a5
            android.content.Context r5 = r0.getContext()
            if (r5 == 0) goto L_0x00a5
            r1 = 2131971664(0x7f134e50, float:1.9580314E38)
            java.util.Set r0 = r8.A01()
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r6 = r5.getString(r1, r0)
        L_0x00a5:
            r9.setText(r6)
        L_0x00a8:
            android.widget.TextView r0 = r2.A05()
            if (r0 == 0) goto L_0x00b1
            r0.setVisibility(r12)
        L_0x00b1:
            android.widget.TextView r1 = r2.A04()
            boolean r0 = r8.A04(r4)
            if (r0 == 0) goto L_0x00c1
            boolean r0 = r3.A0i()
            if (r0 == 0) goto L_0x02ee
        L_0x00c1:
            if (r20 != 0) goto L_0x02ee
            int r0 = r2.A01
        L_0x00c5:
            r1.setTextColor(r0)
            X.3oV r1 = r2.A07()
            if (r1 == 0) goto L_0x00e3
            boolean r0 = r3.A0p()
            if (r0 == 0) goto L_0x02ea
            if (r20 != 0) goto L_0x02ea
            X.2O0 r0 = X.2O0.A00(r4)
            boolean r0 = r0.A05(r3)
            if (r0 != 0) goto L_0x02ea
        L_0x00e0:
            r1.setVisibility(r7)
        L_0x00e3:
            r9 = 0
            r7 = r17
            if (r17 == 0) goto L_0x02da
            X.1Xj r0 = r7.A0b
            if (r0 == 0) goto L_0x02da
            long r0 = r0.A17()
            double r5 = (double) r0
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r5 = r5 / r0
        L_0x00f7:
            java.lang.Double r11 = java.lang.Double.valueOf(r5)
        L_0x00fb:
            boolean r0 = X.AnonymousClass3NF.A00(r4, r8)
            r5 = 0
            if (r0 == 0) goto L_0x0175
            X.0Tu r6 = X.0Tu.A05
            r0 = 36322044501174174(0x810ab50002279e, double:3.033545427451784E-306)
            boolean r0 = X.182.A06(r6, r4, r0)
            if (r0 == 0) goto L_0x0175
            if (r11 == 0) goto L_0x0175
            android.widget.TextView r0 = r2.A03()
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r5 = r0.getResources()
            X.0qQ.A07(r5)
            long r3 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r0
            double r8 = (double) r3
            double r10 = r11.doubleValue()
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            X.3gq r6 = X.C247743gq.SECONDS
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            java.lang.String r5 = X.1G0.A0D(r5, r6, r7, r8, r10, r12, r13, r14, r15, r16)
            android.widget.TextView r4 = r2.A03()
            android.widget.TextView r0 = r2.A03()
            android.content.Context r3 = r0.getContext()
            r1 = 2131975392(0x7f135ce0, float:1.9587875E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r5}
            java.lang.String r0 = r3.getString(r1, r0)
            r4.setText(r0)
            android.widget.TextView r3 = r2.A03()
            android.widget.TextView r0 = r2.A03()
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131100202(0x7f06022a, float:1.7812779E38)
            int r0 = r1.getColor(r0)
            r3.setTextColor(r0)
            android.widget.TextView r0 = r2.A03()
            r0.setVisibility(r12)
        L_0x0174:
            return
        L_0x0175:
            X.3BQ r8 = r8.A04
            X.3BQ r0 = X.AnonymousClass3BQ.ADS_HISTORY
            if (r8 != r0) goto L_0x01c6
            java.lang.String r0 = r3.A0p
            if (r0 == 0) goto L_0x01c6
            int r0 = r0.length()
            if (r0 == 0) goto L_0x01c6
            android.widget.TextView r1 = r2.A03()
            java.lang.String r0 = r3.A0p
            r1.setText(r0)
            android.widget.TextView r0 = r2.A03()
            r0.setVisibility(r12)
            android.widget.TextView r3 = r2.A03()
            android.widget.TextView r0 = r2.A03()
            android.content.Context r1 = r0.getContext()
            r0 = 2131100272(0x7f060270, float:1.781292E38)
            int r0 = r1.getColor(r0)
            r3.setTextColor(r0)
            android.widget.TextView r3 = r2.A03()
            android.widget.TextView r0 = r2.A03()
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.0nA.A0T(r3, r0)
            return
        L_0x01c6:
            X.3BQ r0 = X.AnonymousClass3BQ.IN_FEED_STORIES_TRAY
            if (r8 != r0) goto L_0x0209
            X.0Tu r6 = X.0Tu.A05
            r0 = 36324286474366917(0x810cbf00062fc5, double:3.034963260326576E-306)
            boolean r0 = X.182.A06(r6, r4, r0)
            if (r0 == 0) goto L_0x0209
            java.lang.Integer r0 = r3.A0e
            if (r0 == 0) goto L_0x0207
            int r4 = r0.intValue()
        L_0x01df:
            android.widget.TextView r3 = r2.A03()
            r3.setVisibility(r12)
            android.content.Context r0 = r3.getContext()
            X.0qQ.A07(r0)
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131820975(0x7f1101af, float:1.927468E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)
            X.0qQ.A07(r0)
            r3.setText(r0)
            return
        L_0x0207:
            r4 = 0
            goto L_0x01df
        L_0x0209:
            X.3BQ r0 = X.AnonymousClass3BQ.IN_FEED_HIGHLIGHTS_TRAY
            X.0Tu r6 = X.0Tu.A05
            if (r8 != r0) goto L_0x02a8
            r0 = 36325330151420797(0x810db20006337d, double:3.035623285898E-306)
            boolean r0 = X.182.A06(r6, r4, r0)
            if (r0 == 0) goto L_0x0278
            java.lang.Integer r0 = r3.A0e
            if (r0 == 0) goto L_0x0244
            int r4 = r0.intValue()
            android.widget.TextView r0 = r2.A03()
            android.content.Context r0 = r0.getContext()
            X.0qQ.A07(r0)
            android.content.res.Resources r3 = r0.getResources()
            r1 = 2131820975(0x7f1101af, float:1.927468E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r3.getQuantityString(r1, r4, r0)
            X.0qQ.A07(r0)
        L_0x0243:
            r9 = r0
        L_0x0244:
            android.widget.TextView r4 = r2.A02()
            if (r4 == 0) goto L_0x0261
            if (r17 == 0) goto L_0x0274
            android.content.Context r3 = r4.getContext()
            X.0qQ.A07(r3)
            long r0 = r7.A03()
            java.lang.String r0 = X.JZV.A04(r3, r0)
            r4.setText(r0)
            r4.setVisibility(r12)
        L_0x0261:
            android.widget.TextView r0 = r2.A03()
            if (r9 != 0) goto L_0x0269
            r5 = 8
        L_0x0269:
            r0.setVisibility(r5)
            android.widget.TextView r0 = r2.A03()
            r0.setText(r9)
            return
        L_0x0274:
            r4.setVisibility(r10)
            goto L_0x0261
        L_0x0278:
            r0 = 36325330151355260(0x810db20005337c, double:3.035623285856554E-306)
            boolean r0 = X.182.A06(r6, r4, r0)
            if (r0 == 0) goto L_0x0244
            java.lang.String r0 = r3.A0r
            if (r0 != 0) goto L_0x0243
            if (r17 == 0) goto L_0x0244
            X.1Xj r0 = r7.A0b
            if (r0 == 0) goto L_0x0244
            X.1Xy r0 = r0.A0C
            X.50l r0 = r0.BDc()
            if (r0 == 0) goto L_0x0244
            java.util.List r0 = r0.AZX()
            if (r0 == 0) goto L_0x0244
            java.lang.Object r0 = X.00k.A0J(r0)
            X.50j r0 = (X.C2801550j) r0
            if (r0 == 0) goto L_0x0244
            java.lang.String r9 = r0.getTitle()
            goto L_0x0244
        L_0x02a8:
            r0 = 36324694495867127(0x810d1e000030f7, double:3.0352212947662796E-306)
            boolean r0 = X.182.A06(r6, r4, r0)
            if (r0 == 0) goto L_0x02c3
            boolean r0 = r2 instanceof X.AnonymousClass3N7
            if (r0 == 0) goto L_0x02c3
            r0 = r2
            X.3N7 r0 = (X.AnonymousClass3N7) r0
            X.3oV r0 = r0.A02
            boolean r0 = r0.CVM()
            if (r0 != 0) goto L_0x02c3
            return
        L_0x02c3:
            boolean r0 = r2.A08()
            if (r0 == 0) goto L_0x0174
            android.widget.TextView r1 = r2.A03()
            java.lang.String r0 = ""
            r1.setText(r0)
            android.widget.TextView r0 = r2.A03()
            r0.setVisibility(r10)
            return
        L_0x02da:
            X.PFz r0 = r3.A0E
            if (r0 == 0) goto L_0x02e7
            X.3I4 r0 = r0.A00
            long r0 = r0.B2m()
            double r5 = (double) r0
            goto L_0x00f7
        L_0x02e7:
            r11 = r9
            goto L_0x00fb
        L_0x02ea:
            r7 = 8
            goto L_0x00e0
        L_0x02ee:
            int r0 = r2.A00
            goto L_0x00c5
        L_0x02f2:
            int r0 = r2.A00
            goto L_0x0079
        L_0x02f6:
            X.0Tu r5 = X.0Tu.A05
            r0 = 36324694495867127(0x810d1e000030f7, double:3.0352212947662796E-306)
            boolean r0 = X.182.A06(r5, r4, r0)
            if (r0 == 0) goto L_0x030f
            X.3oV r0 = r2.A06()
            if (r0 == 0) goto L_0x00b1
            boolean r0 = r0.CVM()
            if (r0 != r15) goto L_0x00b1
        L_0x030f:
            android.widget.TextView r0 = r2.A05()
            if (r0 == 0) goto L_0x00b1
            r0.setVisibility(r10)
            goto L_0x00b1
        L_0x031a:
            android.widget.TextView r5 = r2.A04()
            android.widget.TextView r0 = r2.A04()
            android.content.Context r10 = r0.getContext()
            X.0qQ.A07(r10)
            android.content.res.Resources r9 = r10.getResources()
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            int r13 = r9.getDimensionPixelOffset(r0)
            r9 = 2131238783(0x7f081f7f, float:1.8093854E38)
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
            int r0 = X.2Yu.A0H(r10, r0)
            android.graphics.drawable.Drawable r11 = X.AnonymousClass4Ed.A01(r10, r9, r0)
            r14 = r12
            android.text.SpannableStringBuilder r9 = X.W2t.A03(r10, r11, r12, r13, r14, r15)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r9)
            android.text.SpannableStringBuilder r0 = r0.append(r1)
            X.0qQ.A07(r0)
            goto L_0x03d4
        L_0x0355:
            boolean r0 = r3.A0a()
            if (r0 == 0) goto L_0x0362
            android.widget.TextView r5 = r2.A04()
            java.lang.String r0 = r2.A03
            goto L_0x03d4
        L_0x0362:
            boolean r0 = r3.A1a
            if (r0 == 0) goto L_0x0392
            android.widget.TextView r5 = r2.A04()
            boolean r0 = r3.A15(r4)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x038f
            X.0Tu r9 = X.0Tu.A05
            r0 = 36612083642538287(0x82127f0000192f, double:3.2169673483443294E-306)
            long r0 = X.182.A01(r9, r4, r0)
            int r9 = (int) r0
            if (r9 == r15) goto L_0x038c
            r0 = 2
            if (r9 == r0) goto L_0x0389
            r0 = 3
            if (r9 != r0) goto L_0x038f
            java.lang.String r0 = r2.A05
            goto L_0x03d4
        L_0x0389:
            java.lang.String r0 = r2.A02
            goto L_0x03d4
        L_0x038c:
            java.lang.String r0 = r2.A04
            goto L_0x03d4
        L_0x038f:
            java.lang.String r0 = r2.A06
            goto L_0x03d4
        L_0x0392:
            boolean r0 = r3.A0o()
            if (r0 != 0) goto L_0x03be
            java.lang.String r1 = r3.getId()
            java.lang.String r0 = "election:rollcall_v2"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x03be
            boolean r0 = r3.A0u()
            android.widget.TextView r5 = r2.A04()
            if (r0 == 0) goto L_0x03b1
            java.lang.String r0 = r2.A09
            goto L_0x03d4
        L_0x03b1:
            java.lang.String r1 = X.C241533Po.A00(r4, r8)
            android.widget.TextView r0 = r2.A04()
            r0.setText(r1)
            goto L_0x004b
        L_0x03be:
            X.3BK r0 = X.AnonymousClass3BJ.A00(r4)
            boolean r0 = r0.A01()
            android.widget.TextView r5 = r2.A04()
            if (r0 == 0) goto L_0x03cf
            java.lang.String r0 = r2.A08
            goto L_0x03d4
        L_0x03cf:
            java.lang.String r0 = r2.A07
            goto L_0x03d4
        L_0x03d2:
            java.lang.String r0 = r3.A0r
        L_0x03d4:
            r5.setText(r0)
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3NE.A00(com.instagram.common.session.UserSession, X.3uh, X.3BT, X.3N8, boolean):void");
    }
}

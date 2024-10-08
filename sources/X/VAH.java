package X;

public abstract class VAH {
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bd, code lost:
        if (r0 != false) goto L_0x00bf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r12, X.C17567VaL r13, com.instagram.business.promote.model.PromoteData r14, com.instagram.business.promote.model.PromoteState r15, com.instagram.common.session.UserSession r16, java.util.List r17) {
        /*
            r10 = 0
            r1 = 1
            r6 = r14
            r7 = r15
            r2 = r16
            X.C51973G9u.A0r(r1, r2, r14, r15)
            com.instagram.ui.igeditseekbar.IgEditSeekBar r14 = r13.A03
            java.util.List r11 = r6.A1o
            r0 = 2130970165(0x7f040635, float:1.7549032E38)
            r5 = r12
            int r0 = X.AnonymousClass7TF.A03(r12, r0)
            r14.setActiveColor(r0)
            r14.setShouldOverrideVisualValue(r1)
            r0 = r17
            r14.setOverrideVisualValueList(r0)
            java.lang.String r1 = r13.A05
            java.lang.String r0 = "budget_slider"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0070
            java.util.List r1 = r6.A1n
            int r0 = r6.A07
            X.C14724U4o.A00(r14, r1, r0)
            java.util.List r1 = r6.A1n
            int r0 = r6.A0F
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r2 = r1.indexOf(r0)
            java.util.List r1 = r6.A1n
            int r0 = r6.A0D
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r1.indexOf(r0)
            r14.A02 = r2
            r14.A01 = r0
            com.instagram.common.session.UserSession r3 = r6.A0y
            X.0qQ.A06(r3)
            boolean r0 = X.C18803W2r.A04(r3)
            if (r0 == 0) goto L_0x0067
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330239298716193(0x81122900014221, double:3.038727850415158E-306)
        L_0x005f:
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0067
            r14.A04 = r10
        L_0x0067:
            X.We7 r0 = new X.We7
            r0.<init>(r13, r6, r15, r11)
            r14.setOnSliderChangeListener(r0)
            return
        L_0x0070:
            java.lang.String r0 = "duration_slider"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0164
            java.util.List r0 = r6.A1o
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0143
            int r0 = r6.A0A
            X.C14724U4o.A00(r14, r11, r0)
            int r0 = r6.A0G
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r3 = r11.indexOf(r0)
            int r0 = r6.A0E
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r11.indexOf(r0)
        L_0x0099:
            r14.A02 = r3
            r14.A01 = r0
            boolean r0 = r6.A0D()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0133
            X.0qQ.A0A(r11)
            com.instagram.ui.widget.radiogroup.IgRadioGroup r1 = r13.A04
            if (r1 == 0) goto L_0x011a
            boolean r4 = X.W3E.A05(r6)
            boolean r3 = X.W3E.A07(r6)
            boolean r0 = X.W3E.A06(r6)
            if (r4 != 0) goto L_0x00bf
            if (r3 != 0) goto L_0x00bf
            r9 = 0
            if (r0 == 0) goto L_0x00c0
        L_0x00bf:
            r9 = 1
        L_0x00c0:
            r0 = 8
            r14.setVisibility(r0)
            r1.removeAllViews()
            r3 = -1
            r1.A02(r3)
            X.U5O r8 = new X.U5O
            r8.<init>(r12)
            boolean r2 = X.C18803W2r.A04(r2)
            r0 = 2131970460(0x7f13499c, float:1.9577872E38)
            if (r2 == 0) goto L_0x00dd
            r0 = 2131953980(0x7f13093c, float:1.9544446E38)
        L_0x00dd:
            r8.setPrimaryText((int) r0)
            r0 = 2131970461(0x7f13499d, float:1.9577874E38)
            r8.setSecondaryText((int) r0)
            r8.A04(r10)
            X.Wer r4 = new X.Wer
            r4.<init>(r5, r6, r7, r8, r9)
            r8.A9W(r4)
            r1.addView(r8)
            X.U5O r2 = new X.U5O
            r2.<init>(r12)
            r0 = 2131970466(0x7f1349a2, float:1.9577884E38)
            r2.setPrimaryText((int) r0)
            X.Weq r9 = new X.Weq
            r12 = r6
            r9.<init>(r10, r11, r12, r13, r14)
            r2.A9W(r9)
            r1.addView(r2)
            int r0 = r1.A00
            if (r0 != r3) goto L_0x011a
            boolean r0 = r6.A2v
            if (r0 == 0) goto L_0x012e
            int r0 = r8.getId()
        L_0x0117:
            r1.A02(r0)
        L_0x011a:
            com.instagram.common.session.UserSession r3 = r6.A0y
            X.0qQ.A06(r3)
            boolean r0 = X.C18803W2r.A04(r3)
            if (r0 == 0) goto L_0x0067
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330239298781730(0x81122900024222, double:3.038727850456604E-306)
            goto L_0x005f
        L_0x012e:
            int r0 = r2.getId()
            goto L_0x0117
        L_0x0133:
            com.instagram.common.session.UserSession r3 = r6.A0y
            X.0qQ.A06(r3)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327988735785818(0x81101d00003b5a, double:3.037304585355699E-306)
            X.182.A06(r2, r3, r0)
            goto L_0x011a
        L_0x0143:
            java.util.List r1 = r6.A1o
            int r0 = r6.A0A
            X.C14724U4o.A00(r14, r1, r0)
            java.util.List r1 = r6.A1o
            int r0 = r6.A0G
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r3 = r1.indexOf(r0)
            java.util.List r1 = r6.A1o
            int r0 = r6.A0E
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r1.indexOf(r0)
            goto L_0x0099
        L_0x0164:
            java.lang.String r0 = "radius_slider"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0067
            java.util.List r1 = X.W2x.A02
            com.instagram.business.promote.model.PendingLocation r0 = r6.A0o
            int r0 = r0.A00
            X.C14724U4o.A00(r14, r1, r0)
            goto L_0x0067
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VAH.A00(android.content.Context, X.VaL, com.instagram.business.promote.model.PromoteData, com.instagram.business.promote.model.PromoteState, com.instagram.common.session.UserSession, java.util.List):void");
    }
}

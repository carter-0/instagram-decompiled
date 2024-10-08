package X;

/* renamed from: X.70X  reason: invalid class name */
public abstract class AnonymousClass70X {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (X.AnonymousClass703.A0B(r2) == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(android.content.Context r18, X.AnonymousClass0iw r19, com.instagram.common.session.UserSession r20, X.C71662eb r21, X.AnonymousClass70J r22, com.instagram.user.model.User r23, boolean r24) {
        /*
            r13 = 0
            r4 = r21
            X.0qQ.A0B(r4, r13)
            r17 = 1
            r2 = r23
            boolean r0 = X.2Ek.A00(r2)
            if (r0 == 0) goto L_0x001d
            boolean r0 = r2.A1g()
            if (r0 == 0) goto L_0x001d
            boolean r1 = X.AnonymousClass703.A0B(r2)
            r0 = 1
            if (r1 != 0) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            r1 = 8
            r16 = 0
            if (r0 != 0) goto L_0x0028
            r4.A03(r1)
            return r13
        L_0x0028:
            r4.A03(r13)
            X.4Cl r0 = r2.A03
            java.lang.String r3 = r0.AZg()
            java.lang.String r10 = ""
            if (r3 != 0) goto L_0x0036
            r3 = r10
        L_0x0036:
            r0 = 100
            java.lang.String r12 = X.0mp.A04(r3, r0)
            X.4Cl r0 = r2.A03
            java.lang.String r3 = r0.CHc()
            X.4Cl r0 = r2.A03
            java.lang.String r0 = r0.AnQ()
            r5 = r18
            java.lang.String r11 = X.AnonymousClass703.A05(r5, r12, r3, r0)
            X.0qQ.A07(r11)
            android.view.View r3 = r4.A01()
            X.0qQ.A07(r3)
            r0 = 2131427792(0x7f0b01d0, float:1.847721E38)
            android.view.View r4 = r3.requireViewById(r0)
            X.0qQ.A07(r4)
            r0 = 2131427795(0x7f0b01d3, float:1.8477216E38)
            android.view.View r8 = r3.requireViewById(r0)
            X.0qQ.A07(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 2131427796(0x7f0b01d4, float:1.8477218E38)
            android.view.View r7 = r3.requireViewById(r0)
            X.0qQ.A07(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 2131427806(0x7f0b01de, float:1.8477239E38)
            android.view.View r9 = r3.requireViewById(r0)
            X.0qQ.A07(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r4.setVisibility(r1)
            r9.setVisibility(r1)
            java.lang.String r1 = r2.getId()
            r6 = r20
            java.lang.String r0 = r6.A06
            boolean r1 = r1.equals(r0)
            X.4Cl r0 = r2.A03
            java.util.List r0 = r0.AZa()
            if (r0 == 0) goto L_0x013a
            int r15 = r0.size()
        L_0x00a4:
            X.4Cl r0 = r2.A03
            java.lang.Boolean r0 = r0.CSA()
            r3 = r22
            if (r0 == 0) goto L_0x013d
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x013d
            if (r15 <= 0) goto L_0x013d
            if (r1 != 0) goto L_0x00c5
            X.0Tu r14 = X.0Tu.A05
            r0 = 36322821891041750(0x810b6a000e29d6, double:3.034037051934337E-306)
            boolean r0 = X.182.A06(r14, r6, r0)
            if (r0 == 0) goto L_0x013d
        L_0x00c5:
            r4.setVisibility(r13)
            if (r12 == 0) goto L_0x0130
            int r0 = r12.length()
            if (r0 <= 0) goto L_0x0130
            r10 = r12
        L_0x00d1:
            r8.setText(r10)
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            android.graphics.Typeface r0 = android.graphics.Typeface.defaultFromStyle(r17)
            X.0oh.A07(r5, r0, r8, r1)
            android.graphics.Typeface r0 = android.graphics.Typeface.defaultFromStyle(r17)
            r8.setTypeface(r0)
            r1 = 2131966470(0x7f133a06, float:1.956978E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r5.getString(r1, r0)
            r7.setText(r0)
            int r0 = X.2Yu.A07(r5)
            int r0 = r5.getColor(r0)
            r7.setTextColor(r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.defaultFromStyle(r17)
            r7.setTypeface(r0)
            java.lang.String r13 = r2.getId()
            r7 = r19
            if (r24 == 0) goto L_0x011f
            java.lang.String r9 = "impression"
            java.lang.String r10 = "bio_addresses"
            java.lang.String r11 = "viewer"
            java.lang.String r12 = "ig_profile"
            r14 = 0
            r8 = r6
            X.C49075Eot.A00(r7, r8, r9, r10, r11, r12, r13, r14)
            r16 = 1
        L_0x011f:
            X.FOH r0 = new X.FOH
            r17 = r0
            r21 = r3
            r22 = r2
            r23 = r13
            r17.<init>(r18, r19, r20, r21, r22, r23)
            X.AnonymousClass0fU.A00(r0, r4)
            return r16
        L_0x0130:
            X.4Cl r0 = r2.A03
            java.lang.String r0 = r0.AnQ()
            if (r0 == 0) goto L_0x00d1
            r10 = r0
            goto L_0x00d1
        L_0x013a:
            r15 = 0
            goto L_0x00a4
        L_0x013d:
            r9.setText(r11)
            r9.setVisibility(r13)
            r0 = 2130970246(0x7f040686, float:1.7549197E38)
            int r0 = X.2Yu.A0F(r5, r0)
            r9.setTextColor(r0)
            X.DeW r0 = new X.DeW
            r0.<init>(r3, r2)
            X.AnonymousClass0fU.A00(r0, r9)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass70X.A00(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.2eb, X.70J, com.instagram.user.model.User, boolean):boolean");
    }
}

package X;

/* renamed from: X.Nta  reason: case insensitive filesystem */
public abstract class C69872Nta {
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0004 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0004 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r8, android.view.ViewGroup r9, com.instagram.common.session.UserSession r10, X.AnonymousClass7L0 r11, X.2Er r12, java.util.List r13) {
        /*
            java.util.Iterator r7 = r13.iterator()
        L_0x0004:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0184
            java.lang.Object r3 = r7.next()
            X.NiD r3 = (X.C69251NiD) r3
            boolean r0 = r3 instanceof X.NTV
            if (r0 != 0) goto L_0x002b
            boolean r0 = r3 instanceof X.NTU
            if (r0 != 0) goto L_0x002b
            boolean r0 = r3 instanceof X.NTT
            if (r0 != 0) goto L_0x00be
            boolean r0 = r3 instanceof X.NTS
            if (r0 == 0) goto L_0x0094
            r1 = 1
            int r0 = r12.C6a()
            boolean r0 = X.AnonymousClass48O.A02(r0)
            if (r0 != r1) goto L_0x0004
        L_0x002b:
            X.NQZ r4 = new X.NQZ
            r4.<init>(r10, r8)
            r6 = 0
            android.view.ViewGroup r2 = r4.A00
            int r0 = r11.A07
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r2.setBackgroundTintList(r0)
            r1 = 18
            X.Ok4 r0 = new X.Ok4
            r0.<init>(r1, r3, r4)
            r2.setOnClickListener(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r4.A03
            android.content.Context r5 = r4.getContext()
            int r0 = r3.A00
            android.graphics.drawable.Drawable r0 = X.C323656xt.A00(r5, r0)
            r1.setImageDrawable(r0)
            int r0 = r11.A0C
            X.C66581MXm.A1C(r1, r0)
            java.lang.Integer r2 = r3.A01
            com.instagram.common.ui.base.IgTextView r1 = r4.A02
            if (r2 == 0) goto L_0x008e
            r1.setVisibility(r6)
            r1.setTextColor(r0)
            X.NiD r0 = X.C69251NiD.A07
            if (r3 != r0) goto L_0x0089
            com.instagram.common.session.UserSession r0 = r4.A01
            boolean r0 = X.AnonymousClass7K4.A02(r0)
            if (r0 == 0) goto L_0x0089
            r0 = 2131957359(0x7f13166f, float:1.95513E38)
        L_0x0075:
            X.DbT.A18(r5, r1, r0)
        L_0x0078:
            r9.addView(r4)
            android.view.ViewGroup$MarginLayoutParams r1 = X.DbX.A0G(r4)
            float r0 = X.JTR.A02(r8)
            int r0 = (int) r0
            r1.setMarginEnd(r0)
            goto L_0x0004
        L_0x0089:
            int r0 = r2.intValue()
            goto L_0x0075
        L_0x008e:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0078
        L_0x0094:
            boolean r0 = r3 instanceof X.NTR
            if (r0 != 0) goto L_0x0004
            boolean r0 = r3 instanceof X.NTQ
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = r12.C6C()
            if (r0 == 0) goto L_0x0004
            X.3t0 r2 = X.C66580MXl.A0g(r0)
            X.9HW r1 = X.AnonymousClass9HV.A00(r10)
            r0 = 46
            boolean r0 = r1.A00(r2, r0)
            if (r0 != 0) goto L_0x0004
            X.9HW r1 = X.AnonymousClass9HV.A00(r10)
            r0 = 49
        L_0x00b8:
            boolean r0 = r1.A00(r2, r0)
        L_0x00bc:
            if (r0 == 0) goto L_0x0004
        L_0x00be:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319407398329723(0x81084f006e1d7b, double:3.0318777129941924E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
        L_0x00c9:
            if (r0 == 0) goto L_0x0004
            goto L_0x002b
        L_0x00cd:
            boolean r0 = r3 instanceof X.NTP
            if (r0 == 0) goto L_0x00fa
            int r1 = r12.C6a()
            r0 = 28
            if (r1 == r0) goto L_0x00e1
            int r1 = r12.C6a()
            r0 = 61
            if (r1 != r0) goto L_0x00eb
        L_0x00e1:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330965148124004(0x8112d200004364, double:3.0391868805034186E-306)
            X.182.A06(r2, r10, r0)
        L_0x00eb:
            java.lang.String r0 = r12.C6C()
            if (r0 == 0) goto L_0x0004
            X.3t0 r0 = X.C66580MXl.A0g(r0)
            boolean r0 = X.AnonymousClass7OI.A00(r10, r0)
            goto L_0x00c9
        L_0x00fa:
            boolean r0 = r3 instanceof X.NTO
            if (r0 != 0) goto L_0x00be
            boolean r0 = r3 instanceof X.NTN
            if (r0 == 0) goto L_0x0113
            java.lang.String r0 = r12.C6C()
            if (r0 == 0) goto L_0x0004
            X.3t0 r2 = X.C66580MXl.A0g(r0)
            X.9HW r1 = X.AnonymousClass9HV.A00(r10)
            r0 = 37
            goto L_0x00b8
        L_0x0113:
            boolean r0 = r3 instanceof X.NTM
            if (r0 == 0) goto L_0x012e
            java.util.List r0 = r12.BJk()
            if (r0 == 0) goto L_0x0123
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0004
        L_0x0123:
            java.util.List r0 = r12.BIp()
            if (r0 == 0) goto L_0x00be
            boolean r0 = r0.isEmpty()
            goto L_0x00bc
        L_0x012e:
            boolean r0 = r3 instanceof X.NTL
            if (r0 != 0) goto L_0x00be
            boolean r0 = r3 instanceof X.NTK
            if (r0 == 0) goto L_0x0154
            java.lang.String r0 = r12.C6C()
            if (r0 == 0) goto L_0x0004
            X.3t0 r2 = X.C66580MXl.A0g(r0)
            X.9HW r1 = X.AnonymousClass9HV.A00(r10)
            r0 = 66
            boolean r0 = r1.A00(r2, r0)
            if (r0 == 0) goto L_0x0004
            boolean r0 = X.C3269478t.A00(r10, r12)
            if (r0 != 0) goto L_0x0004
            goto L_0x002b
        L_0x0154:
            boolean r0 = r3 instanceof X.NTJ
            if (r0 != 0) goto L_0x00be
            java.lang.String r0 = r12.C6C()
            if (r0 == 0) goto L_0x0004
            X.3t0 r4 = X.C66580MXl.A0g(r0)
            X.9HW r1 = X.AnonymousClass9HV.A00(r10)
            r0 = 22
            boolean r0 = r1.A00(r4, r0)
            if (r0 == 0) goto L_0x0004
            X.78w r2 = X.C3269778w.A00
            X.3sy r0 = X.C300965yF.A05(r4)
            com.instagram.model.direct.DirectThreadKey r1 = X.C66647MaG.A03(r0)
            X.Ja7 r0 = r12.BKp()
            boolean r0 = r2.A02(r0, r10, r1)
            if (r0 != 0) goto L_0x0004
            goto L_0x00be
        L_0x0184:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69872Nta.A00(android.content.Context, android.view.ViewGroup, com.instagram.common.session.UserSession, X.7L0, X.2Er, java.util.List):void");
    }
}

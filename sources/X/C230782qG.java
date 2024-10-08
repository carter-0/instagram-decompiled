package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2qG  reason: invalid class name and case insensitive filesystem */
public final class C230782qG implements C230792qH {
    public final UserSession A00;
    public final C227872kC A01;
    public final C228062kj A02;
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(new AnonymousClass9LY(this, 39));
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new AnonymousClass9LY(this, 40));

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        ((X.AnonymousClass2rI) r9.A03.getValue()).A0D((X.C270374gd) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0055, code lost:
        if ("dismiss".equals(r10.A01) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0057, code lost:
        ((X.AnonymousClass2rI) r9.A03.getValue()).A0D((X.C270374gd) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ee, code lost:
        r5.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r1 = r10.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (X.AnonymousClass000.A00(4004).equals(r1) != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01a8, code lost:
        if (r3.equals("dismiss") == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01ce, code lost:
        r3.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01d0, code lost:
        X.1ES.A03(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01d3, code lost:
        r7 = r10.A01;
        r6 = X.AnonymousClass05K.A00(31);
        r5 = r6.length;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01dd, code lost:
        if (r4 >= r5) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01df, code lost:
        r3 = r6[r4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01e9, code lost:
        if (X.C48986EnO.A00(r3).equalsIgnoreCase(r7) == false) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01eb, code lost:
        X.F9Z.A00(r2.A02, r11, r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002c, code lost:
        if (X.AnonymousClass000.A00(1904).equals(r1) != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01f2, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01fc, code lost:
        throw new java.lang.IllegalArgumentException("No enum matches the given name");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        if ("turn_on_sms".equals(r1) != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        if (X.AnonymousClass000.A00(1213).equals(r1) == false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DR1(X.C17633VbP r10, X.C270374gd r11) {
        /*
            r9 = this;
            X.0eM r0 = r9.A04
            java.lang.Object r2 = r0.getValue()
            X.FAK r2 = (X.FAK) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            java.lang.String r3 = r10.A01
            int r0 = r3.hashCode()
            switch(r0) {
                case -309952504: goto L_0x0063;
                case 237256269: goto L_0x0083;
                case 247279647: goto L_0x00b4;
                case 588281647: goto L_0x00f3;
                case 729897211: goto L_0x010c;
                case 860524583: goto L_0x0138;
                case 1151895480: goto L_0x018c;
                case 1669621673: goto L_0x01ac;
                case 1671672458: goto L_0x01a2;
                default: goto L_0x0013;
            }
        L_0x0013:
            java.lang.String r1 = r10.A01
            r0 = 4004(0xfa4, float:5.611E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r0.equals(r1)
            r2 = 0
            if (r0 != 0) goto L_0x0042
            r0 = 1904(0x770, float:2.668E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = "turn_on_sms"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0042
            r0 = 1213(0x4bd, float:1.7E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004d
        L_0x0042:
            X.0eM r0 = r9.A03
            java.lang.Object r0 = r0.getValue()
            X.2rI r0 = (X.AnonymousClass2rI) r0
            r0.A0D(r2)
        L_0x004d:
            java.lang.String r1 = r10.A01
            java.lang.String r0 = "dismiss"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0062
            X.0eM r0 = r9.A03
            java.lang.Object r0 = r0.getValue()
            X.2rI r0 = (X.AnonymousClass2rI) r0
            r0.A0D(r2)
        L_0x0062:
            return
        L_0x0063:
            r0 = 1213(0x4bd, float:1.7E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0013
            com.instagram.common.session.UserSession r6 = r2.A02
            X.0iw r5 = r2.A01
            androidx.fragment.app.Fragment r4 = r2.A00
            r7 = 0
            X.FGL r3 = new X.FGL
            r8 = r7
            r3.<init>(r4, r5, r6, r7, r8)
            X.EX9 r0 = X.EX9.QP
            r3.A07(r0)
            goto L_0x01d3
        L_0x0083:
            r0 = 1165(0x48d, float:1.633E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0013
            androidx.fragment.app.Fragment r0 = r2.A00
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            com.instagram.common.session.UserSession r0 = r2.A02
            X.6Yo r5 = new X.6Yo
            r5.<init>(r3, r0)
            X.1a0 r0 = X.C46447Df9.A03()
            X.1a1 r4 = r0.A01
            X.EwR r0 = r10.A00
            java.lang.String r3 = r0.A00
            r0 = 679(0x2a7, float:9.51E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.E3J r0 = r4.A03(r3, r0)
            r5.A0E(r0)
            goto L_0x00ee
        L_0x00b4:
            r0 = 2782(0xade, float:3.898E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0013
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            X.EVZ r0 = X.EVZ.ARGUMENT_EDIT_PROFILE_FLOW
            X.C48975EnD.A00(r4, r0)
            androidx.fragment.app.Fragment r0 = r2.A00
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            com.instagram.common.session.UserSession r3 = r2.A02
            X.6Yo r5 = new X.6Yo
            r5.<init>(r0, r3)
            X.1WU r0 = X.AnonymousClass35B.A00()
            X.F3j r0 = r0.A01()
            X.E5C r0 = r0.A01(r3)
            r5.A0B(r4, r0)
            r0 = 116(0x74, float:1.63E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.A0A = r0
        L_0x00ee:
            r5.A04()
            goto L_0x01d3
        L_0x00f3:
            java.lang.String r0 = "confirm_phone"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0013
            X.EwR r0 = r10.A00
            java.lang.String r4 = r0.A01
            com.instagram.common.session.UserSession r0 = r2.A02
            X.1OC r3 = X.C318486p2.A04(r0, r4)
            X.EBc r0 = new X.EBc
            r0.<init>(r2, r4)
            goto L_0x01ce
        L_0x010c:
            java.lang.String r0 = "turn_on_sms"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0013
            com.instagram.common.session.UserSession r3 = r2.A02
            r0 = -2
            X.1NY r4 = new X.1NY
            r4.<init>(r3, r0)
            r4.A04()
            r0 = 2564(0xa04, float:3.593E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.A0A(r0)
            java.lang.Class<X.1XP> r3 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            r4.A0Q(r3, r0)
            r0 = 1
            r4.A0R = r0
            X.1OC r3 = r4.A0M()
            goto L_0x01d0
        L_0x0138:
            java.lang.String r0 = "clicked"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0013
            java.lang.String r7 = r10.A04
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0013
            androidx.fragment.app.Fragment r6 = r2.A00
            android.content.Context r4 = r6.requireContext()
            X.0iw r0 = r2.A01
            java.lang.String r0 = r0.getModuleName()
            com.instagram.common.session.UserSession r3 = r2.A02
            boolean r0 = X.FGU.A03(r4, r3, r7, r0)
            if (r0 != 0) goto L_0x01d3
            X.0bY r0 = X.FAK.A03
            android.net.Uri r5 = X.0cp.A01(r0, r7)
            if (r5 == 0) goto L_0x0013
            X.14E r0 = X.14D.A04
            X.14D r0 = r0.A00()
            if (r0 == 0) goto L_0x0184
            X.34S r0 = r0.A00(r3, r7)
            if (r0 == 0) goto L_0x0184
            android.content.Context r4 = r6.requireContext()
            java.lang.Class<com.instagram.url.UrlHandlerActivity> r0 = com.instagram.url.UrlHandlerActivity.class
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r4, r0)
            r3.setData(r5)
        L_0x0180:
            r6.startActivity(r3)
            goto L_0x01d3
        L_0x0184:
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r0, r5)
            goto L_0x0180
        L_0x018c:
            r0 = 1904(0x770, float:2.668E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0013
            androidx.fragment.app.Fragment r0 = r2.A00
            android.content.Context r0 = r0.requireContext()
            X.AnonymousClass0oH.A00(r0)
            goto L_0x01d3
        L_0x01a2:
            java.lang.String r0 = "dismiss"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x01d3
            goto L_0x0013
        L_0x01ac:
            r0 = 3954(0xf72, float:5.541E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0013
            com.instagram.common.session.UserSession r4 = r2.A02
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            r6 = 0
            androidx.fragment.app.Fragment r0 = r2.A00
            android.content.Context r3 = r0.requireContext()
            r7 = r6
            r8 = r6
            X.1OC r3 = X.C318486p2.A03(r3, r4, r5, r6, r7, r8)
            X.ECl r0 = new X.ECl
            r0.<init>(r2)
        L_0x01ce:
            r3.A00 = r0
        L_0x01d0:
            X.1ES.A03(r3)
        L_0x01d3:
            java.lang.String r7 = r10.A01
            r0 = 31
            java.lang.Integer[] r6 = X.AnonymousClass05K.A00(r0)
            int r5 = r6.length
            r4 = 0
        L_0x01dd:
            if (r4 >= r5) goto L_0x01f5
            r3 = r6[r4]
            java.lang.String r0 = X.C48986EnO.A00(r3)
            boolean r0 = r0.equalsIgnoreCase(r7)
            if (r0 == 0) goto L_0x01f2
            com.instagram.common.session.UserSession r0 = r2.A02
            X.F9Z.A00(r0, r11, r3, r1)
            goto L_0x0013
        L_0x01f2:
            int r4 = r4 + 1
            goto L_0x01dd
        L_0x01f5:
            java.lang.String r1 = "No enum matches the given name"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C230782qG.DR1(X.VbP, X.4gd):void");
    }

    public final void DR2(C270374gd r11) {
        FAK fak = (FAK) this.A04.getValue();
        Integer num = AnonymousClass05K.A0N;
        if (r11.A06.intValue() == 3) {
            UserSession userSession = fak.A02;
            new FGL(fak.A00, fak.A01, userSession, (C51950G8t) null, (C49498Ewd) null).A07(EX9.QP);
        }
        F9Z.A00(fak.A02, r11, AnonymousClass05K.A01, num);
    }

    public final void DR3(C270374gd r4) {
        F9Z.A00(((FAK) this.A04.getValue()).A02, r4, AnonymousClass05K.A0C, AnonymousClass05K.A0N);
        ((AnonymousClass2rI) this.A03.getValue()).A0D((C270374gd) null);
    }

    public C230782qG(UserSession userSession, C227872kC r4, C228062kj r5) {
        this.A00 = userSession;
        this.A02 = r5;
        this.A01 = r4;
    }
}

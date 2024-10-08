package X;

/* renamed from: X.ENx  reason: case insensitive filesystem */
public final class C47946ENx extends F39 {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C47946ENx(X.FRM r10, X.EXD r11) {
        /*
            r9 = this;
            X.FET r4 = new X.FET
            r4.<init>(r10)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            X.0Tu r2 = X.0Tu.A05
            r0 = 18312933096307030(0x410f8400003956, double:1.898055633562294E-307)
            boolean r0 = X.1AW.A06(r2, r0)
            if (r0 != 0) goto L_0x0024
            X.EZx r1 = X.C48155EZx.CHECK_FOR_PHONE
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 0
            X.F3l r0 = X.FET.A00(r4, r1, r0)
            r3.add(r0)
        L_0x0024:
            X.EZx r5 = X.C48155EZx.CONTACT_INVITE_REDESIGN_C
            com.instagram.common.session.UserSession r6 = r10.A00
            if (r11 == 0) goto L_0x00ed
            if (r6 == 0) goto L_0x004e
            X.0Tu r8 = X.0Tu.A06
            r0 = 36324488337502324(0x810cee00013074, double:3.035090919386245E-306)
            boolean r0 = X.182.A06(r8, r6, r0)
            java.lang.String r7 = "CONTACT_INVITE_REDESIGN_C"
            if (r0 == 0) goto L_0x00df
            r0 = 36887438290846461(0x830cee000002fd, double:3.3911027366985916E-306)
        L_0x0040:
            java.lang.String r1 = X.182.A04(r8, r6, r0)
        L_0x0044:
            java.lang.String r0 = "CONTACT_INVITE_UPDATED_TEXT_NO_ILLUSTRATION"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00c9
            X.EZx r5 = X.C48155EZx.CONTACT_INVITE_UPDATED_TEXT_NO_ILLUSTRATION
        L_0x004e:
            X.EXD r0 = X.EXD.SAC
            if (r11 == r0) goto L_0x00ed
            com.instagram.common.session.UserSession r8 = r10.A00
            if (r8 == 0) goto L_0x00ed
            X.0Tu r7 = X.0Tu.A06
            r0 = 36317715174069711(0x8106c5000115cf, double:3.0308075435581206E-306)
            boolean r0 = X.DbY.A1Y(r7, r8, r0)
            if (r0 == 0) goto L_0x00ed
            r7 = 0
            X.F3l r0 = X.FET.A00(r4, r5, r7)
            r3.add(r0)
            r0 = 36330711745053412(0x811297000042e4, double:3.039026627381204E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 != 0) goto L_0x008e
            r0 = 18316321825506022(0x411299000042e6, double:1.8993950373065188E-307)
            boolean r0 = X.1AW.A06(r2, r0)
            if (r0 != 0) goto L_0x008e
            X.EZx r1 = X.C48155EZx.FB_CONNECT
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.F3l r0 = X.FET.A00(r4, r1, r7)
        L_0x008b:
            r3.add(r0)
        L_0x008e:
            X.EZx r0 = X.C48155EZx.TAKE_PROFILE_PHOTO
            r7 = 0
            X.0qQ.A0B(r0, r7)
            r6 = 0
            X.F3l r0 = X.FET.A00(r4, r0, r6)
            r3.add(r0)
            X.EZx r0 = X.C48155EZx.ADD_PHONE
            X.0qQ.A0B(r0, r7)
            X.F3l r5 = X.FET.A00(r4, r0, r6)
            r3.add(r5)
            X.EZx r2 = X.C48155EZx.TURN_ON_ONETAP
            X.0qQ.A0B(r2, r7)
            X.F3l r1 = X.FET.A00(r4, r2, r6)
            X.ENs r0 = new X.ENs
            r0.<init>(r2, r5, r1)
            r3.add(r0)
            X.EZx r0 = X.C48155EZx.PUSH_OPT_IN
            X.0qQ.A0B(r0, r7)
            X.F3l r0 = X.FET.A00(r4, r0, r6)
            r3.add(r0)
            r9.<init>(r3)
            return
        L_0x00c9:
            java.lang.String r0 = "CONTACT_INVITE_REDESIGN_B"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00d5
            X.EZx r5 = X.C48155EZx.CONTACT_INVITE_REDESIGN_B
            goto L_0x004e
        L_0x00d5:
            boolean r0 = r1.equalsIgnoreCase(r7)
            if (r0 != 0) goto L_0x004e
            X.EZx r5 = X.C48155EZx.CONTACT_INVITE_NO_SKIP_BUTTON
            goto L_0x004e
        L_0x00df:
            X.EXD r0 = X.EXD.SAC
            if (r11 == r0) goto L_0x00ea
            r0 = 36884002317009448(0x8309ce00000228, double:3.3889298130085084E-306)
            goto L_0x0040
        L_0x00ea:
            r1 = r7
            goto L_0x0044
        L_0x00ed:
            r0 = 36330711745053412(0x811297000042e4, double:3.039026627381204E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 != 0) goto L_0x0111
            r0 = 18316321825506022(0x411299000042e6, double:1.8993950373065188E-307)
            boolean r0 = X.1AW.A06(r2, r0)
            if (r0 != 0) goto L_0x0111
            X.EZx r1 = X.C48155EZx.FB_CONNECT
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 0
            X.F3l r0 = X.FET.A00(r4, r1, r0)
            r3.add(r0)
        L_0x0111:
            r0 = 0
            X.F3l r0 = X.FET.A00(r4, r5, r0)
            goto L_0x008b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47946ENx.<init>(X.FRM, X.EXD):void");
    }
}

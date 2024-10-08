package X;

/* renamed from: X.G2e  reason: case insensitive filesystem */
public final class C51795G2e extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51795G2e(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new C51795G2e(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x025c, code lost:
        r2 = r2.getBoolean(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0264, code lost:
        return java.lang.Boolean.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0135, code lost:
        r2 = X.182.A06(r2, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0161, code lost:
        r1.invoke(java.lang.Boolean.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018a, code lost:
        if (r1 <= 270.0f) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x018c, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01c2, code lost:
        X.AnonymousClass7TE.A1Z(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01d1, code lost:
        com.instagram.profilecard.domain.ProfileCardViewModel.A04(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0218, code lost:
        r3.A03.invoke(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x021f, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x000f;
                case 1: goto L_0x001c;
                case 2: goto L_0x000c;
                case 3: goto L_0x0030;
                case 4: goto L_0x0005;
                case 5: goto L_0x0037;
                case 6: goto L_0x004d;
                case 7: goto L_0x005e;
                case 8: goto L_0x000c;
                case 9: goto L_0x0030;
                case 10: goto L_0x0005;
                case 11: goto L_0x0067;
                case 12: goto L_0x029c;
                case 13: goto L_0x000c;
                case 14: goto L_0x0030;
                case 15: goto L_0x0005;
                case 16: goto L_0x009a;
                case 17: goto L_0x000c;
                case 18: goto L_0x0030;
                case 19: goto L_0x0005;
                case 20: goto L_0x00ac;
                case 21: goto L_0x00d0;
                case 22: goto L_0x000c;
                case 23: goto L_0x0030;
                case 24: goto L_0x0005;
                case 25: goto L_0x00d9;
                case 26: goto L_0x00f5;
                case 27: goto L_0x0112;
                case 28: goto L_0x0124;
                case 29: goto L_0x013b;
                case 30: goto L_0x014f;
                case 31: goto L_0x0156;
                case 32: goto L_0x015c;
                case 33: goto L_0x016a;
                case 34: goto L_0x018f;
                case 35: goto L_0x01a2;
                case 36: goto L_0x01b2;
                case 37: goto L_0x01c6;
                case 38: goto L_0x01cc;
                case 39: goto L_0x014f;
                case 40: goto L_0x01d5;
                case 41: goto L_0x01f8;
                case 42: goto L_0x0222;
                case 43: goto L_0x0232;
                case 44: goto L_0x0245;
                case 45: goto L_0x0251;
                case 46: goto L_0x000c;
                case 47: goto L_0x0030;
                case 48: goto L_0x0005;
                case 49: goto L_0x0267;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r11.A01
            X.07f r4 = X.DbY.A0I(r0)
            return r4
        L_0x000c:
            java.lang.Object r4 = r11.A01
            return r4
        L_0x000f:
            java.lang.Object r0 = r11.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "ARG_REEL_ID"
            java.lang.String r4 = r1.getString(r0)
            return r4
        L_0x001c:
            java.lang.Object r0 = r11.A01
            X.E5G r0 = (X.E5G) r0
            android.content.Context r1 = r0.requireContext()
            X.0eM r0 = r0.A05
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.72Q r4 = new X.72Q
            r4.<init>(r1, r0)
            return r4
        L_0x0030:
            java.lang.Object r0 = r11.A01
            java.lang.Object r4 = X.DbT.A0r(r0)
            return r4
        L_0x0037:
            java.lang.Object r2 = r11.A01
            X.E5G r2 = (X.E5G) r2
            X.0eM r0 = r2.A05
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r2.A03
            java.lang.String r0 = X.DbS.A0t(r0)
            X.EFJ r4 = new X.EFJ
            r4.<init>(r1, r0)
            return r4
        L_0x004d:
            java.lang.Object r0 = r11.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            r0 = 3602(0xe12, float:5.047E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r4 = X.C320236s2.A01(r1, r0)
            return r4
        L_0x005e:
            java.lang.Object r1 = r11.A01
            r0 = 3
            X.U9T r4 = new X.U9T
            r4.<init>(r1, r0)
            return r4
        L_0x0067:
            java.lang.Object r6 = r11.A01
            X.Uat r6 = (X.C15343Uat) r6
            X.0eM r0 = r6.A0C
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r0)
            android.content.Context r0 = r6.getContext()
            r5 = 0
            if (r0 == 0) goto L_0x007c
            android.content.Context r5 = r0.getApplicationContext()
        L_0x007c:
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Application"
            X.0qQ.A0C(r5, r0)
            android.app.Application r5 = (android.app.Application) r5
            java.lang.String r8 = r6.A06
            if (r8 != 0) goto L_0x0091
            java.lang.String r0 = "viewedProfileUserId"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0091:
            r9 = 9
            r10 = 0
            X.KES r4 = new X.KES
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L_0x009a:
            java.lang.Object r2 = r11.A01
            X.E53 r2 = (X.E53) r2
            X.0eM r0 = r2.A0A
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r0 = r2.A07
            X.EFK r4 = new X.EFK
            r4.<init>(r1, r2, r0)
            return r4
        L_0x00ac:
            java.lang.Object r4 = r11.A01
            X.E5U r4 = (X.E5U) r4
            android.os.Bundle r2 = r4.requireArguments()
            java.lang.String r0 = "ProfileNotificationsSettingsFragment.ARG_DISPLAYED_USER_ID"
            java.lang.String r3 = X.C320236s2.A01(r2, r0)
            java.lang.String r1 = "ProfileNotificationsSettingsFragment.CLICK_POINT"
            java.lang.String r0 = "following_sheet"
            java.lang.String r2 = r2.getString(r1, r0)
            X.0eM r0 = r4.A05
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r0 = r4.A04
            X.EFQ r4 = new X.EFQ
            r4.<init>(r1, r3, r0, r2)
            return r4
        L_0x00d0:
            java.lang.Object r0 = r11.A01
            X.8Z9 r0 = (X.AnonymousClass8Z9) r0
            X.3pa r4 = r0.A00()
            return r4
        L_0x00d9:
            java.lang.Object r4 = r11.A01
            X.H1L r4 = (X.H1L) r4
            X.0eM r0 = r4.A0B
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r2 = r4.A03
            java.lang.String r1 = ""
            if (r2 != 0) goto L_0x00ea
            r2 = r1
        L_0x00ea:
            java.lang.String r0 = r4.A04
            if (r0 == 0) goto L_0x00ef
            r1 = r0
        L_0x00ef:
            X.KDX r4 = new X.KDX
            r4.<init>(r3, r2, r1)
            return r4
        L_0x00f5:
            java.lang.Object r1 = r11.A01
            X.E3T r1 = (X.E3T) r1
            X.0eM r0 = r1.A06
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x010c
            r0 = 0
        L_0x0106:
            X.EGP r4 = new X.EGP
            r4.<init>(r0)
            return r4
        L_0x010c:
            X.Euo r0 = new X.Euo
            r0.<init>(r1)
            goto L_0x0106
        L_0x0112:
            java.lang.Object r0 = r11.A01
            X.E3T r0 = (X.E3T) r0
            X.0eM r0 = r0.A05
            X.0lg r3 = X.DbT.A0X(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314854726044490(0x81042b00040b4a, double:3.028998584708871E-306)
            goto L_0x0135
        L_0x0124:
            java.lang.Object r0 = r11.A01
            X.E3T r0 = (X.E3T) r0
            X.0eM r0 = r0.A05
            X.0lg r3 = X.DbT.A0X(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314854726110027(0x81042b00050b4b, double:3.028998584750317E-306)
        L_0x0135:
            boolean r2 = X.182.A06(r2, r3, r0)
            goto L_0x0260
        L_0x013b:
            java.lang.Object r1 = r11.A01
            androidx.compose.foundation.lazy.LazyListState r1 = (androidx.compose.foundation.lazy.LazyListState) r1
            int r0 = r1.A00()
            if (r0 != 0) goto L_0x014c
            int r0 = r1.A01()
            if (r0 != 0) goto L_0x014c
            goto L_0x018c
        L_0x014c:
            r2 = 0
            goto L_0x0260
        L_0x014f:
            java.lang.Object r0 = r11.A01
            X.DbS.A1U(r0)
            goto L_0x021d
        L_0x0156:
            java.lang.Object r1 = r11.A01
            X.0sP r1 = (X.0sP) r1
            r0 = 1
            goto L_0x0161
        L_0x015c:
            java.lang.Object r1 = r11.A01
            X.0sP r1 = (X.0sP) r1
            r0 = 0
        L_0x0161:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.invoke(r0)
            goto L_0x021d
        L_0x016a:
            java.lang.Object r0 = r11.A01
            X.4gU r0 = (X.C270284gU) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
            r0 = 1135869952(0x43b40000, float:360.0)
            float r1 = r1 % r0
            float r1 = java.lang.Math.abs(r1)
            r2 = 0
            r0 = 1119092736(0x42b40000, float:90.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0260
            r0 = 1132920832(0x43870000, float:270.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0260
        L_0x018c:
            r2 = 1
            goto L_0x0260
        L_0x018f:
            java.lang.Object r0 = r11.A01
            X.4gU r0 = (X.C270284gU) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            return r4
        L_0x01a2:
            java.lang.Object r2 = r11.A01
            X.2YL r2 = (X.2YL) r2
            X.6oS r4 = X.C318116oQ.A00(r2)
            r1 = 0
            r0 = 4
            X.MFx r3 = new X.MFx
            r3.<init>(r2, r1, r0)
            goto L_0x01c2
        L_0x01b2:
            java.lang.Object r2 = r11.A01
            X.2YL r2 = (X.2YL) r2
            X.6oS r4 = X.C318116oQ.A00(r2)
            r1 = 0
            r0 = 13
            X.MG3 r3 = new X.MG3
            r3.<init>((java.lang.Object) r2, (X.AnonymousClass4D7) r1, (int) r0)
        L_0x01c2:
            X.AnonymousClass7TE.A1Z(r3, r4)
            goto L_0x021d
        L_0x01c6:
            java.lang.Object r1 = r11.A01
            com.instagram.profilecard.domain.ProfileCardViewModel r1 = (com.instagram.profilecard.domain.ProfileCardViewModel) r1
            r0 = 1
            goto L_0x01d1
        L_0x01cc:
            java.lang.Object r1 = r11.A01
            com.instagram.profilecard.domain.ProfileCardViewModel r1 = (com.instagram.profilecard.domain.ProfileCardViewModel) r1
            r0 = 0
        L_0x01d1:
            com.instagram.profilecard.domain.ProfileCardViewModel.A04(r1, r0)
            goto L_0x021d
        L_0x01d5:
            java.lang.Object r3 = r11.A01
            X.F0P r3 = (X.F0P) r3
            X.0lg r5 = r3.A01
            X.0iw r4 = r3.A00
            java.lang.String r8 = "profile_card"
            boolean r0 = r3.A04
            java.lang.String r2 = "download_qr_code"
            if (r0 == 0) goto L_0x01f6
            java.lang.String r9 = "add_to_your_story"
        L_0x01e7:
            r6 = 0
            r7 = r6
            X.C22031Xty.A09(r4, r5, r6, r7, r8, r9)
            boolean r0 = r3.A05
            if (r0 != 0) goto L_0x0218
            com.instagram.profilecard.domain.ProfileCardViewModel r0 = r3.A02
            r0.A06()
            goto L_0x0218
        L_0x01f6:
            r9 = r2
            goto L_0x01e7
        L_0x01f8:
            java.lang.Object r3 = r11.A01
            X.F0P r3 = (X.F0P) r3
            X.0lg r5 = r3.A01
            X.0iw r4 = r3.A00
            java.lang.String r8 = "profile_card"
            boolean r1 = r3.A04
            r0 = 1292(0x50c, float:1.81E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            if (r1 == 0) goto L_0x0220
            java.lang.String r9 = "add_to_your_story"
        L_0x020e:
            r6 = 0
            r7 = r6
            X.C22031Xty.A09(r4, r5, r6, r7, r8, r9)
            com.instagram.profilecard.domain.ProfileCardViewModel r0 = r3.A02
            r0.A05()
        L_0x0218:
            X.0sP r0 = r3.A03
            r0.invoke(r2)
        L_0x021d:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0220:
            r9 = r2
            goto L_0x020e
        L_0x0222:
            java.lang.Object r0 = r11.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r2 = r0.mArguments
            if (r2 == 0) goto L_0x0265
            r1 = 0
            r0 = 2281(0x8e9, float:3.196E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x025c
        L_0x0232:
            java.lang.Object r0 = r11.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x0265
            r0 = 269(0x10d, float:3.77E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r4 = r1.getString(r0)
            return r4
        L_0x0245:
            java.lang.Object r0 = r11.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r2 = r0.mArguments
            if (r2 == 0) goto L_0x0265
            r1 = 0
            java.lang.String r0 = "is_for_receiver_side"
            goto L_0x025c
        L_0x0251:
            java.lang.Object r0 = r11.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r2 = r0.mArguments
            if (r2 == 0) goto L_0x0265
            r1 = 1
            java.lang.String r0 = "show_app_tray"
        L_0x025c:
            boolean r2 = r2.getBoolean(r0, r1)
        L_0x0260:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        L_0x0265:
            r4 = 0
            return r4
        L_0x0267:
            java.lang.Object r6 = r11.A01
            X.E5O r6 = (X.E5O) r6
            X.0eM r0 = r6.A03
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r0)
            android.content.Context r0 = r6.requireContext()
            android.content.Context r5 = r0.getApplicationContext()
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Application"
            X.0qQ.A0C(r5, r0)
            android.app.Application r5 = (android.app.Application) r5
            X.0eM r0 = r6.A01
            java.lang.String r8 = X.DbS.A0t(r0)
            X.0eM r0 = r6.A00
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x029a
            boolean r9 = r0.booleanValue()
        L_0x0294:
            X.EFT r4 = new X.EFT
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x029a:
            r9 = 0
            goto L_0x0294
        L_0x029c:
            java.lang.String r0 = "session$delegate"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51795G2e.invoke():java.lang.Object");
    }
}

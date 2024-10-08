package X;

import com.instagram.profile.fragment.UserDetailFragment;

public final class DcC implements 27S {
    public final /* synthetic */ UserDetailFragment A00;

    public DcC(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        return ((2Cy) obj).A00.equals(this.A00.A10.A03);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        if (r1 != 2) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fe, code lost:
        if (r8.booleanValue() != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011c, code lost:
        if (r0 != 1) goto L_0x011e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = -105881356(0xfffffffff9b060f4, float:-1.1447634E35)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.2Cy r13 = (X.2Cy) r13
            r0 = -29023003(0xfffffffffe4524e5, float:-6.551237E37)
            int r4 = X.AnonymousClass0fD.A03(r0)
            com.instagram.profile.fragment.UserDetailFragment r3 = r12.A00
            X.Dc6 r0 = r3.A10
            X.17M r8 = r0.A02
            com.instagram.user.model.User r6 = r13.A00
            r2 = 0
            r0.A03 = r6
            X.17M r7 = r6.A02
            r0.A02 = r7
            X.Wad r0 = r3.A0q
            if (r0 == 0) goto L_0x0025
            r0.A00 = r6
        L_0x0025:
            X.0qQ.A0B(r8, r2)
            r11 = 1
            r1 = 4
            X.0qQ.A0B(r7, r11)
            int r10 = r8.ordinal()
            r9 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            switch(r10) {
                case 0: goto L_0x003e;
                case 1: goto L_0x003e;
                case 2: goto L_0x0114;
                case 3: goto L_0x0114;
                case 4: goto L_0x011e;
                case 5: goto L_0x0114;
                case 6: goto L_0x0114;
                default: goto L_0x0039;
            }
        L_0x0039:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x003e:
            int r1 = r7.ordinal()
            r0 = 3
            if (r1 == r0) goto L_0x011e
            r0 = 5
            if (r1 == r0) goto L_0x011e
            r0 = 6
            if (r1 == r0) goto L_0x011e
            r0 = 2
            if (r1 == r0) goto L_0x011e
        L_0x004e:
            r1 = 0
            switch(r10) {
                case 0: goto L_0x0111;
                case 1: goto L_0x0111;
                case 2: goto L_0x0052;
                case 3: goto L_0x0052;
                case 4: goto L_0x0102;
                default: goto L_0x0052;
            }
        L_0x0052:
            if (r9 == 0) goto L_0x00f8
            boolean r0 = r9.booleanValue()
            if (r0 == 0) goto L_0x00f8
            X.DeD r0 = new X.DeD
            r0.<init>(r3)
            X.11Z.A02(r0)
        L_0x0062:
            boolean r0 = r3.isAdded()
            if (r0 == 0) goto L_0x00f2
            com.instagram.profile.fragment.UserDetailTabController r0 = r3.A0z
            X.5m9 r0 = r0.A0B()
            com.instagram.profile.fragment.UserDetailFragment.A0Q(r0, r3, r2, r2)
        L_0x0071:
            X.6xN r0 = r3.A11
            r1 = 1
            if (r0 == 0) goto L_0x0079
            r0.A03(r11)
        L_0x0079:
            X.6zb r0 = r3.A0n
            if (r0 == 0) goto L_0x00f0
            boolean r0 = r0.A00(r6)
            if (r0 == 0) goto L_0x00f0
        L_0x0083:
            r3.A13(r1)
            boolean r0 = r3.isResumed()
            if (r0 == 0) goto L_0x00ca
            boolean r0 = r3.A1b
            if (r0 != 0) goto L_0x00ca
            com.instagram.profile.intf.UserDetailLaunchConfig r0 = r3.A1E
            boolean r0 = r0.A0b
            if (r0 == 0) goto L_0x00ca
            com.instagram.user.model.FollowStatus r1 = r6.B6o()
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A05
            if (r1 != r0) goto L_0x00d7
            X.6ap r8 = X.DbS.A0a()
            android.content.res.Resources r2 = X.DbV.A05(r3)
            r1 = 2131969892(0x7f134764, float:1.957672E38)
            java.lang.String r0 = r6.getUsername()
            android.text.Spanned r0 = X.DbU.A07(r2, r0, r1)
            r8.A0D = r0
            r8.A0O = r11
            r8.A06()
            X.Dc2 r0 = r8.A00()
            android.os.Handler r6 = r3.A2c
            X.FrF r2 = new X.FrF
            r2.<init>(r0)
            r0 = 300(0x12c, double:1.48E-321)
            r6.postDelayed(r2, r0)
        L_0x00c8:
            r3.A1b = r11
        L_0x00ca:
            r0 = -1820782713(0xffffffff93790f87, float:-3.1435874E-27)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 217328183(0xcf42a37, float:3.761956E-31)
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x00d7:
            com.instagram.user.model.FollowStatus r1 = r6.B6o()
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A06
            if (r1 != r0) goto L_0x00ca
            r0 = 28
            X.EDV r2 = new X.EDV
            r2.<init>(r0, r3, r6)
            com.instagram.profile.intf.UserDetailLaunchConfig r0 = r3.A1E
            java.lang.String r1 = r0.A09
            java.lang.String r0 = "xar_cross_app_auto_follow"
            com.instagram.profile.fragment.UserDetailFragment.A0P(r2, r3, r6, r0, r1)
            goto L_0x00c8
        L_0x00f0:
            r1 = 0
            goto L_0x0083
        L_0x00f2:
            X.Dc6 r1 = r3.A10
            r1.A07 = r11
            goto L_0x0071
        L_0x00f8:
            if (r8 == 0) goto L_0x0071
            boolean r0 = r8.booleanValue()
            if (r0 == 0) goto L_0x0071
            goto L_0x0062
        L_0x0102:
            X.17M r0 = X.17M.A06
            if (r7 == r0) goto L_0x010b
            X.17M r0 = X.17M.A04
            if (r7 == r0) goto L_0x010b
            r1 = 1
        L_0x010b:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            goto L_0x0052
        L_0x0111:
            r8 = 0
            goto L_0x0052
        L_0x0114:
            int r0 = r7.ordinal()
            if (r0 == r1) goto L_0x0121
            if (r0 == r2) goto L_0x004e
            if (r0 == r11) goto L_0x004e
        L_0x011e:
            r9 = r8
            goto L_0x004e
        L_0x0121:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r11)
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DcC.onEvent(java.lang.Object):void");
    }
}

package com.instagram.settings2.core.viewmodel;

public abstract class UiStateKt {
    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME2, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C53400GnX r9, com.instagram.settings2.core.session.SettingsSession r10, X.I4T r11, java.util.List r12, X.AnonymousClass4D7 r13, boolean r14) {
        /*
            r7 = r9
            r9 = r11
            r8 = r10
            r3 = 4
            r5 = r13
            boolean r0 = X.ME2.A02(r3, r13)
            if (r0 == 0) goto L_0x00c3
            r4 = r5
            X.ME2 r4 = (X.ME2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c3
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0019:
            java.lang.Object r10 = r4.A07
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 3
            r5 = 2
            r6 = 1
            r13 = 0
            if (r0 == 0) goto L_0x002f
            if (r0 == r6) goto L_0x0051
            if (r0 == r5) goto L_0x0088
            if (r0 != r2) goto L_0x00ca
            X.0eS.A00(r10)
        L_0x002e:
            return r10
        L_0x002f:
            X.0eS.A00(r10)
            if (r12 != 0) goto L_0x004f
            java.lang.Object r1 = r7.A01
            X.LSs r1 = (X.C64185LSs) r1
        L_0x0038:
            java.lang.Object r0 = r7.A04
            X.LSs r0 = (X.C64185LSs) r0
            r4.A01 = r7
            r4.A02 = r8
            r4.A03 = r11
            r4.A04 = r12
            r4.A08 = r14
            r4.A00 = r6
            java.lang.Object r10 = com.instagram.settings2.core.session.SettingsSessionResolveExtensionsKt.A05(r1, r0, r8, r4)
            if (r10 != r3) goto L_0x0066
            return r3
        L_0x004f:
            r1 = r13
            goto L_0x0038
        L_0x0051:
            boolean r14 = r4.A08
            java.lang.Object r12 = r4.A04
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r9 = r4.A03
            X.I4T r9 = (X.I4T) r9
            java.lang.Object r8 = r4.A02
            com.instagram.settings2.core.session.SettingsSession r8 = (com.instagram.settings2.core.session.SettingsSession) r8
            java.lang.Object r7 = r4.A01
            X.GnX r7 = (X.C53400GnX) r7
            X.0eS.A00(r10)
        L_0x0066:
            X.0eP r10 = (X.0eP) r10
            java.lang.Object r11 = r10.A00
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r6 = r10.A01
            X.JwL r6 = (X.C61083JwL) r6
            java.lang.Object r0 = r7.A02
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00a8
            X.ME2.A00(r7, r8, r9, r12, r4)
            r4.A05 = r11
            r4.A06 = r6
            r4.A08 = r14
            r4.A00 = r5
            java.lang.Object r10 = r8.A01(r0, r4)
            if (r10 != r3) goto L_0x00a5
            return r3
        L_0x0088:
            boolean r14 = r4.A08
            java.lang.Object r6 = r4.A06
            X.JwL r6 = (X.C61083JwL) r6
            java.lang.Object r11 = r4.A05
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r4.A04
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r9 = r4.A03
            X.I4T r9 = (X.I4T) r9
            java.lang.Object r8 = r4.A02
            com.instagram.settings2.core.session.SettingsSession r8 = (com.instagram.settings2.core.session.SettingsSession) r8
            java.lang.Object r7 = r4.A01
            X.GnX r7 = (X.C53400GnX) r7
            X.0eS.A00(r10)
        L_0x00a5:
            java.util.List r10 = (java.util.List) r10
            goto L_0x00a9
        L_0x00a8:
            r10 = r13
        L_0x00a9:
            com.instagram.settings2.core.viewmodel.UiStateKt$toUiState$2 r5 = new com.instagram.settings2.core.viewmodel.UiStateKt$toUiState$2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r4.A01 = r13
            r4.A02 = r13
            r4.A03 = r13
            r4.A04 = r13
            r4.A05 = r13
            r4.A06 = r13
            r4.A00 = r2
            java.lang.Object r10 = X.19E.A00(r4, r5)
            if (r10 != r3) goto L_0x002e
            return r3
        L_0x00c3:
            X.ME2 r4 = new X.ME2
            r4.<init>(r3, r13)
            goto L_0x0019
        L_0x00ca:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.viewmodel.UiStateKt.A00(X.GnX, com.instagram.settings2.core.session.SettingsSession, X.I4T, java.util.List, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.ME2, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        if (X.AnonymousClass7TE.A1a(r11) != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        r5 = r14.A01;
        r3 = r8.A05;
        r2.A01 = r8;
        r2.A02 = r14;
        r2.A03 = r6;
        r2.A00 = 2;
        r11 = r5.A09(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r11 != r1) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007c, code lost:
        r11 = (X.C239803Ii) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0080, code lost:
        if ((r11 instanceof X.C297815sO) != false) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0084, code lost:
        if ((r11 instanceof X.C239793Ih) == false) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0086, code lost:
        r0 = (X.C61076JwE) ((X.C239793Ih) r11).A00;
        r9 = (java.lang.String) r0.A00;
        r3 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0092, code lost:
        if (r3 == null) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0094, code lost:
        r5 = (X.C64185LSs) X.JTR.A0x(r3, r6.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009c, code lost:
        r3 = r8.A01;
        r2.A01 = r8;
        r2.A02 = r14;
        r2.A03 = r9;
        r2.A00 = 3;
        r11 = com.instagram.settings2.core.session.SettingsSessionResolveExtensionsKt.A06(r3, r5, r14, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ab, code lost:
        if (r11 != r1) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ad, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ae, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bf, code lost:
        r11 = (X.0eP) r11;
        r13 = X.AnonymousClass7TE.A1a(r11.A00);
        r7 = (X.C61074JwC) r11.A01;
        r6 = r8.A00;
        r5 = r8.A02;
        r3 = r8.A03;
        X.ME2.A00(r8, r14, r9, r7, r2);
        r2.A08 = r13;
        r2.A00 = 4;
        r11 = com.instagram.settings2.core.session.SettingsSessionResolveExtensionsKt.A03(r6, r5, r3, r14, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00dd, code lost:
        if (r11 != r1) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00df, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f5, code lost:
        r11 = (X.AnonymousClass59G) r11;
        r5 = (X.C61083JwL) r11.A00;
        r6 = (X.C61083JwL) r11.A01;
        r10 = (java.lang.String) r11.A02;
        r0 = r8.A06;
        X.ME2.A00(r8, r9, r7, r5, r2);
        r2.A05 = r6;
        r2.A06 = r10;
        r2.A08 = r13;
        r2.A00 = 5;
        r11 = r14.A01(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0114, code lost:
        if (r11 != r1) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0116, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0134, code lost:
        r4 = new X.MFp(r5, r6, r7, r8, r9, r10, (java.util.List) r11, (X.AnonymousClass4D7) null, r13);
        r2.A01 = null;
        r2.A02 = null;
        r2.A03 = null;
        r2.A04 = null;
        r2.A05 = null;
        r2.A06 = null;
        r2.A00 = 6;
        r11 = X.19E.A00(r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x014e, code lost:
        if (r11 != r1) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0150, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0154, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0159, code lost:
        throw X.AnonymousClass7TE.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x015a, code lost:
        r1 = X.AnonymousClass7TE.A1A();
        r1.append("Failed to load SleepModeCustomSetting ");
        r1.append(r8.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x016e, code lost:
        throw X.JTS.A0d(r11, ". ", r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A06(X.C61243Jzb r13, com.instagram.settings2.core.session.SettingsSession r14, X.I4T r15, X.AnonymousClass4D7 r16) {
        /*
            r6 = r15
            r8 = r13
            r4 = 5
            r5 = r16
            boolean r0 = X.ME2.A02(r4, r5)
            if (r0 == 0) goto L_0x0028
            r2 = r5
            X.ME2 r2 = (X.ME2) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0028
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0019:
            java.lang.Object r11 = r2.A07
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r12 = 0
            switch(r0) {
                case 0: goto L_0x002e;
                case 1: goto L_0x0043;
                case 2: goto L_0x006d;
                case 3: goto L_0x00b0;
                case 4: goto L_0x00e0;
                case 5: goto L_0x0117;
                case 6: goto L_0x0151;
                default: goto L_0x0023;
            }
        L_0x0023:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0028:
            X.ME2 r2 = new X.ME2
            r2.<init>(r4, r5)
            goto L_0x0019
        L_0x002e:
            X.0eS.A00(r11)
            X.LSs r3 = r13.A04
            r2.A01 = r13
            r2.A02 = r14
            r2.A03 = r15
            r0 = 1
            r2.A00 = r0
            java.lang.Object r11 = com.instagram.settings2.core.session.SettingsSessionResolveExtensionsKt.A08(r3, r14, r2)
            if (r11 != r1) goto L_0x0052
            return r1
        L_0x0043:
            java.lang.Object r6 = r2.A03
            X.I4T r6 = (X.I4T) r6
            java.lang.Object r14 = r2.A02
            com.instagram.settings2.core.session.SettingsSession r14 = (com.instagram.settings2.core.session.SettingsSession) r14
            java.lang.Object r8 = r2.A01
            X.Jzb r8 = (X.C61243Jzb) r8
            X.0eS.A00(r11)
        L_0x0052:
            boolean r0 = X.AnonymousClass7TE.A1a(r11)
            if (r0 != 0) goto L_0x0059
            return r12
        L_0x0059:
            com.instagram.settings2.core.data.SettingsRepository r5 = r14.A01
            X.MXa r3 = r8.A05
            r2.A01 = r8
            r2.A02 = r14
            r2.A03 = r6
            r0 = 2
            r2.A00 = r0
            java.lang.Object r11 = r5.A09(r3, r2)
            if (r11 != r1) goto L_0x007c
            return r1
        L_0x006d:
            java.lang.Object r6 = r2.A03
            X.I4T r6 = (X.I4T) r6
            java.lang.Object r14 = r2.A02
            com.instagram.settings2.core.session.SettingsSession r14 = (com.instagram.settings2.core.session.SettingsSession) r14
            java.lang.Object r8 = r2.A01
            X.Jzb r8 = (X.C61243Jzb) r8
            X.0eS.A00(r11)
        L_0x007c:
            X.3Ii r11 = (X.C239803Ii) r11
            boolean r0 = r11 instanceof X.C297815sO
            if (r0 != 0) goto L_0x015a
            boolean r0 = r11 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0155
            X.3Ih r11 = (X.C239793Ih) r11
            java.lang.Object r0 = r11.A00
            X.JwE r0 = (X.C61076JwE) r0
            java.lang.Object r9 = r0.A00
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r3 = r0.A01
            if (r3 == 0) goto L_0x00ae
            X.0eM r0 = r6.A04
            java.lang.Object r5 = X.JTR.A0x(r3, r0)
            X.LSs r5 = (X.C64185LSs) r5
        L_0x009c:
            X.LSs r3 = r8.A01
            r2.A01 = r8
            r2.A02 = r14
            r2.A03 = r9
            r0 = 3
            r2.A00 = r0
            java.lang.Object r11 = com.instagram.settings2.core.session.SettingsSessionResolveExtensionsKt.A06(r3, r5, r14, r2)
            if (r11 != r1) goto L_0x00bf
            return r1
        L_0x00ae:
            r5 = r12
            goto L_0x009c
        L_0x00b0:
            java.lang.Object r9 = r2.A03
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r14 = r2.A02
            com.instagram.settings2.core.session.SettingsSession r14 = (com.instagram.settings2.core.session.SettingsSession) r14
            java.lang.Object r8 = r2.A01
            X.Jzb r8 = (X.C61243Jzb) r8
            X.0eS.A00(r11)
        L_0x00bf:
            X.0eP r11 = (X.0eP) r11
            java.lang.Object r0 = r11.A00
            boolean r13 = X.AnonymousClass7TE.A1a(r0)
            java.lang.Object r7 = r11.A01
            X.JwC r7 = (X.C61074JwC) r7
            X.LSs r6 = r8.A00
            X.LSs r5 = r8.A02
            X.LSs r3 = r8.A03
            X.ME2.A00(r8, r14, r9, r7, r2)
            r2.A08 = r13
            r0 = 4
            r2.A00 = r0
            java.lang.Object r11 = com.instagram.settings2.core.session.SettingsSessionResolveExtensionsKt.A03(r6, r5, r3, r14, r2)
            if (r11 != r1) goto L_0x00f5
            return r1
        L_0x00e0:
            boolean r13 = r2.A08
            java.lang.Object r7 = r2.A04
            X.JwC r7 = (X.C61074JwC) r7
            java.lang.Object r9 = r2.A03
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r14 = r2.A02
            com.instagram.settings2.core.session.SettingsSession r14 = (com.instagram.settings2.core.session.SettingsSession) r14
            java.lang.Object r8 = r2.A01
            X.Jzb r8 = (X.C61243Jzb) r8
            X.0eS.A00(r11)
        L_0x00f5:
            X.59G r11 = (X.AnonymousClass59G) r11
            java.lang.Object r5 = r11.A00
            X.JwL r5 = (X.C61083JwL) r5
            java.lang.Object r6 = r11.A01
            X.JwL r6 = (X.C61083JwL) r6
            java.lang.Object r10 = r11.A02
            java.lang.String r10 = (java.lang.String) r10
            java.util.List r0 = r8.A06
            X.ME2.A00(r8, r9, r7, r5, r2)
            r2.A05 = r6
            r2.A06 = r10
            r2.A08 = r13
            r2.A00 = r4
            java.lang.Object r11 = r14.A01(r0, r2)
            if (r11 != r1) goto L_0x0134
            return r1
        L_0x0117:
            boolean r13 = r2.A08
            java.lang.Object r10 = r2.A06
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r6 = r2.A05
            X.JwL r6 = (X.C61083JwL) r6
            java.lang.Object r5 = r2.A04
            X.JwL r5 = (X.C61083JwL) r5
            java.lang.Object r7 = r2.A03
            X.JwC r7 = (X.C61074JwC) r7
            java.lang.Object r9 = r2.A02
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r2.A01
            X.Jzb r8 = (X.C61243Jzb) r8
            X.0eS.A00(r11)
        L_0x0134:
            java.util.List r11 = (java.util.List) r11
            X.MFp r4 = new X.MFp
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r2.A01 = r12
            r2.A02 = r12
            r2.A03 = r12
            r2.A04 = r12
            r2.A05 = r12
            r2.A06 = r12
            r0 = 6
            r2.A00 = r0
            java.lang.Object r11 = X.19E.A00(r2, r4)
            if (r11 != r1) goto L_0x0154
            return r1
        L_0x0151:
            X.0eS.A00(r11)
        L_0x0154:
            return r11
        L_0x0155:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x015a:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Failed to load SleepModeCustomSetting "
            r1.append(r0)
            X.MXa r0 = r8.A05
            r1.append(r0)
            java.lang.String r0 = ". "
            java.lang.IllegalStateException r0 = X.JTS.A0d(r11, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.viewmodel.UiStateKt.A06(X.Jzb, com.instagram.settings2.core.session.SettingsSession, X.I4T, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MEB, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.JVH r7, com.instagram.settings2.core.session.SettingsSession r8, X.AnonymousClass4D7 r9) {
        /*
            r3 = 31
            boolean r0 = X.MEB.A03(r3, r9)
            if (r0 == 0) goto L_0x005e
            r5 = r9
            X.MEB r5 = (X.MEB) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005e
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0044
            if (r0 != r3) goto L_0x0064
            java.lang.Object r7 = r5.A01
            X.JVH r7 = (X.JVH) r7
            X.0eS.A00(r1)
        L_0x0028:
            X.59G r1 = (X.AnonymousClass59G) r1
            java.lang.Object r2 = r1.A00
            X.JwL r2 = (X.C61083JwL) r2
            java.lang.Object r0 = r1.A01
            boolean r6 = X.AnonymousClass7TE.A1a(r0)
            java.lang.Object r3 = r1.A02
            X.JwL r3 = (X.C61083JwL) r3
            java.lang.String r4 = r7.A05
            java.lang.Object r5 = r7.A03
            java.util.List r5 = (java.util.List) r5
            X.N47 r1 = new X.N47
            r1.<init>((X.C61083JwL) r2, (X.C61083JwL) r3, (java.lang.String) r4, (java.util.List) r5, (boolean) r6)
            return r1
        L_0x0044:
            X.0eS.A00(r1)
            java.lang.Object r2 = r7.A02
            X.LSs r2 = (X.C64185LSs) r2
            java.lang.Object r1 = r7.A04
            X.LSs r1 = (X.C64185LSs) r1
            java.lang.Object r0 = r7.A01
            X.LSs r0 = (X.C64185LSs) r0
            r5.A01 = r7
            r5.A00 = r3
            java.lang.Object r1 = com.instagram.settings2.core.session.SettingsSessionResolveExtensionsKt.A02(r2, r1, r0, r8, r5)
            if (r1 != r4) goto L_0x0028
            return r4
        L_0x005e:
            X.MEB r5 = new X.MEB
            r5.<init>(r3, r9)
            goto L_0x0016
        L_0x0064:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.viewmodel.UiStateKt.A01(X.JVH, com.instagram.settings2.core.session.SettingsSession, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDf, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0151 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(X.C61241JzZ r16, com.instagram.settings2.core.session.SettingsSession r17, X.I4T r18, X.AnonymousClass4D7 r19) {
        /*
            r11 = r18
            r8 = r17
            r13 = r16
            r12 = 1
            r3 = r19
            boolean r0 = r3 instanceof X.C66127MDf
            if (r0 == 0) goto L_0x0152
            r7 = r3
            X.MDf r7 = (X.C66127MDf) r7
            int r0 = r7.A0A
            if (r0 != r12) goto L_0x0152
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0152
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x001f:
            java.lang.Object r6 = r7.A07
            X.1Hj r5 = X.1Hj.A02
            int r0 = r7.A00
            r4 = 5
            r9 = 4
            r10 = 3
            r2 = 2
            r3 = 0
            if (r0 == 0) goto L_0x003a
            if (r0 == r12) goto L_0x004e
            if (r0 == r2) goto L_0x0077
            if (r0 == r10) goto L_0x00c9
            if (r0 == r9) goto L_0x010d
            if (r0 != r4) goto L_0x0159
            X.0eS.A00(r6)
        L_0x0039:
            return r6
        L_0x003a:
            X.0eS.A00(r6)
            X.LSs r0 = r13.A02
            r7.A01 = r13
            r7.A02 = r8
            r7.A03 = r11
            r7.A00 = r12
            java.lang.Object r6 = com.instagram.settings2.core.session.SettingsSessionResolveExtensionsKt.A08(r0, r8, r7)
            if (r6 != r5) goto L_0x005d
            return r5
        L_0x004e:
            java.lang.Object r11 = r7.A03
            X.I4T r11 = (X.I4T) r11
            java.lang.Object r8 = r7.A02
            com.instagram.settings2.core.session.SettingsSession r8 = (com.instagram.settings2.core.session.SettingsSession) r8
            java.lang.Object r13 = r7.A01
            X.JzZ r13 = (X.C61241JzZ) r13
            X.0eS.A00(r6)
        L_0x005d:
            boolean r0 = X.AnonymousClass7TE.A1a(r6)
            if (r0 != 0) goto L_0x0064
            return r3
        L_0x0064:
            com.instagram.settings2.core.data.SettingsRepository r1 = r8.A01
            X.MXZ r0 = r13.A03
            r7.A01 = r13
            r7.A02 = r8
            r7.A03 = r11
            r7.A00 = r2
            java.lang.Object r6 = r1.A08(r0, r7)
            if (r6 != r5) goto L_0x0086
            return r5
        L_0x0077:
            java.lang.Object r11 = r7.A03
            X.I4T r11 = (X.I4T) r11
            java.lang.Object r8 = r7.A02
            com.instagram.settings2.core.session.SettingsSession r8 = (com.instagram.settings2.core.session.SettingsSession) r8
            java.lang.Object r13 = r7.A01
            X.JzZ r13 = (X.C61241JzZ) r13
            X.0eS.A00(r6)
        L_0x0086:
            X.3Ii r6 = (X.C239803Ii) r6
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0163
            boolean r0 = r6 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x015e
            X.3Ih r6 = (X.C239793Ih) r6
            java.lang.Object r2 = r6.A00
            X.JwE r2 = (X.C61076JwE) r2
            java.lang.Object r0 = r2.A00
            boolean r1 = X.AnonymousClass7TE.A1a(r0)
            java.lang.String r15 = r2.A01
            com.instagram.settings2.core.data.SettingsRepository r2 = r8.A01
            X.MXZ r0 = r13.A03
            java.lang.Boolean r14 = r2.A03(r0)
            if (r15 == 0) goto L_0x00c7
            X.0eM r0 = r11.A04
            java.lang.Object r6 = X.JTR.A0x(r15, r0)
            X.LSs r6 = (X.C64185LSs) r6
        L_0x00b0:
            X.LSs r2 = r13.A00
            X.LSs r0 = r13.A01
            r7.A01 = r13
            r7.A02 = r8
            r7.A03 = r15
            r7.A04 = r14
            r7.A08 = r1
            r7.A00 = r10
            java.lang.Object r6 = com.instagram.settings2.core.session.SettingsSessionResolveExtensionsKt.A04(r2, r0, r6, r8, r7)
            if (r6 != r5) goto L_0x00de
            return r5
        L_0x00c7:
            r6 = r3
            goto L_0x00b0
        L_0x00c9:
            boolean r1 = r7.A08
            java.lang.Object r14 = r7.A04
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            java.lang.Object r15 = r7.A03
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r8 = r7.A02
            com.instagram.settings2.core.session.SettingsSession r8 = (com.instagram.settings2.core.session.SettingsSession) r8
            java.lang.Object r13 = r7.A01
            X.JzZ r13 = (X.C61241JzZ) r13
            X.0eS.A00(r6)
        L_0x00de:
            X.Jvx r6 = (X.C61059Jvx) r6
            java.lang.Object r0 = r6.A01
            boolean r2 = X.AnonymousClass7TE.A1a(r0)
            java.lang.Object r10 = r6.A02
            X.JwL r10 = (X.C61083JwL) r10
            java.lang.Object r11 = r6.A03
            X.JwL r11 = (X.C61083JwL) r11
            java.lang.Object r12 = r6.A04
            X.JwC r12 = (X.C61074JwC) r12
            java.util.List r0 = r13.A04
            r7.A01 = r13
            r7.A02 = r15
            r7.A03 = r14
            r7.A04 = r10
            r7.A05 = r11
            r7.A06 = r12
            r7.A08 = r1
            r7.A09 = r2
            r7.A00 = r9
            java.lang.Object r6 = r8.A01(r0, r7)
            if (r6 != r5) goto L_0x012c
            return r5
        L_0x010d:
            boolean r2 = r7.A09
            boolean r1 = r7.A08
            java.lang.Object r12 = r7.A06
            X.JwC r12 = (X.C61074JwC) r12
            java.lang.Object r11 = r7.A05
            X.JwL r11 = (X.C61083JwL) r11
            java.lang.Object r10 = r7.A04
            X.JwL r10 = (X.C61083JwL) r10
            java.lang.Object r14 = r7.A03
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            java.lang.Object r15 = r7.A02
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r13 = r7.A01
            X.JzZ r13 = (X.C61241JzZ) r13
            X.0eS.A00(r6)
        L_0x012c:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.List r16 = X.00k.A0X(r6)
            com.instagram.settings2.core.viewmodel.UiStateKt$toUiState$5 r9 = new com.instagram.settings2.core.viewmodel.UiStateKt$toUiState$5
            r18 = r2
            r19 = r1
            r17 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r7.A01 = r3
            r7.A02 = r3
            r7.A03 = r3
            r7.A04 = r3
            r7.A05 = r3
            r7.A06 = r3
            r7.A00 = r4
            java.lang.Object r6 = X.19E.A00(r7, r9)
            if (r6 != r5) goto L_0x0039
            return r5
        L_0x0152:
            X.MDf r7 = new X.MDf
            r7.<init>(r3)
            goto L_0x001f
        L_0x0159:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x015e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0163:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Failed to load setting "
            r1.append(r0)
            X.MXZ r0 = r13.A03
            r1.append(r0)
            java.lang.String r0 = ". "
            java.lang.IllegalStateException r0 = X.JTS.A0d(r6, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.viewmodel.UiStateKt.A02(X.JzZ, com.instagram.settings2.core.session.SettingsSession, X.I4T, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [X.JUN, X.4D7] */
    /* JADX WARNING: type inference failed for: r13v7 */
    /* JADX WARNING: type inference failed for: r13v8 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(X.C60894JtE r18, com.instagram.settings2.core.session.SettingsSession r19, X.AnonymousClass4D7 r20, boolean r21) {
        /*
            r9 = r19
            r8 = r18
            r7 = r21
            r3 = 5
            r4 = r20
            boolean r0 = X.JUN.A00(r3, r4)
            if (r0 == 0) goto L_0x00b7
            r13 = r4
            X.JUN r13 = (X.JUN) r13
            int r2 = r13.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b7
            int r2 = r2 - r1
            r13.A00 = r2
        L_0x001d:
            java.lang.Object r2 = r13.A03
            X.1Hj r12 = X.1Hj.A02
            int r0 = r13.A00
            r11 = 2
            r1 = 1
            r10 = 0
            if (r0 == 0) goto L_0x0063
            if (r0 == r1) goto L_0x0077
            if (r0 != r11) goto L_0x00be
            boolean r7 = r13.A04
            java.lang.Object r8 = r13.A01
            X.JtE r8 = (X.C60894JtE) r8
            X.0eS.A00(r2)
        L_0x0035:
            X.GMQ r2 = (X.GMQ) r2
            java.lang.Object r9 = r2.A01
            X.JwL r9 = (X.C61083JwL) r9
            java.lang.Object r10 = r2.A02
            X.JwL r10 = (X.C61083JwL) r10
            java.lang.Object r11 = r2.A03
            X.JwL r11 = (X.C61083JwL) r11
            java.lang.Object r1 = r2.A04
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r14 = r2.A05
            X.HLX r14 = (X.HLX) r14
            java.lang.Object r12 = r2.A06
            X.JwL r12 = (X.C61083JwL) r12
            java.lang.Object r13 = r2.A07
            X.HKu r13 = (X.C54611HKu) r13
            X.XRZ r0 = r8.A09
            X.LSs r15 = r8.A03
            X.Gbx r8 = new X.Gbx
            r18 = r7
            r17 = r1
            r16 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r8
        L_0x0063:
            X.0eS.A00(r2)
            X.LSs r0 = r8.A08
            r13.A01 = r8
            r13.A02 = r9
            r13.A04 = r7
            r13.A00 = r1
            java.lang.Object r2 = com.instagram.settings2.core.session.SettingsSessionResolveExtensionsKt.A08(r0, r9, r13)
            if (r2 != r12) goto L_0x0084
            return r12
        L_0x0077:
            boolean r7 = r13.A04
            java.lang.Object r9 = r13.A02
            com.instagram.settings2.core.session.SettingsSession r9 = (com.instagram.settings2.core.session.SettingsSession) r9
            java.lang.Object r8 = r13.A01
            X.JtE r8 = (X.C60894JtE) r8
            X.0eS.A00(r2)
        L_0x0084:
            boolean r0 = X.AnonymousClass7TE.A1a(r2)
            if (r0 != 0) goto L_0x008b
            return r10
        L_0x008b:
            X.LSs r6 = r8.A06
            X.LSs r5 = r8.A00
            X.LSs r4 = r8.A07
            X.LSs r3 = r8.A05
            X.LSs r2 = r8.A02
            X.LSs r1 = r8.A04
            X.LSs r0 = r8.A01
            r13.A01 = r8
            r13.A02 = r10
            r13.A04 = r7
            r13.A00 = r11
            r18 = r1
            r19 = r0
            r20 = r9
            r21 = r13
            r17 = r2
            r15 = r4
            r16 = r3
            r14 = r5
            r13 = r6
            java.lang.Object r2 = com.instagram.settings2.core.session.SettingsSessionResolveExtensionsKt.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            if (r2 != r12) goto L_0x0035
            return r12
        L_0x00b7:
            X.JUN r13 = new X.JUN
            r13.<init>(r3, r4)
            goto L_0x001d
        L_0x00be:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.viewmodel.UiStateKt.A03(X.JtE, com.instagram.settings2.core.session.SettingsSession, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDS, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0122 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0177 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A04(X.C61242Jza r19, com.instagram.settings2.core.session.SettingsSession r20, X.I4T r21, X.AnonymousClass4D7 r22) {
        /*
            r3 = r22
            r8 = r21
            r11 = r19
            r12 = r20
            boolean r0 = r3 instanceof X.MDS
            if (r0 == 0) goto L_0x0178
            r5 = r3
            X.MDS r5 = (X.MDS) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0178
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x001a:
            java.lang.Object r6 = r5.A0B
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 5
            r7 = 4
            r9 = 3
            r10 = 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0036
            if (r0 == r1) goto L_0x004a
            if (r0 == r10) goto L_0x0073
            if (r0 == r9) goto L_0x00d5
            if (r0 == r7) goto L_0x0123
            if (r0 != r3) goto L_0x017f
            X.0eS.A00(r6)
        L_0x0035:
            return r6
        L_0x0036:
            X.0eS.A00(r6)
            X.LSs r0 = r11.A04
            r5.A01 = r11
            r5.A02 = r12
            r5.A03 = r8
            r5.A00 = r1
            java.lang.Object r6 = com.instagram.settings2.core.session.SettingsSessionResolveExtensionsKt.A08(r0, r12, r5)
            if (r6 != r4) goto L_0x0059
            return r4
        L_0x004a:
            java.lang.Object r8 = r5.A03
            X.I4T r8 = (X.I4T) r8
            java.lang.Object r12 = r5.A02
            com.instagram.settings2.core.session.SettingsSession r12 = (com.instagram.settings2.core.session.SettingsSession) r12
            java.lang.Object r11 = r5.A01
            X.Jza r11 = (X.C61242Jza) r11
            X.0eS.A00(r6)
        L_0x0059:
            boolean r0 = X.AnonymousClass7TE.A1a(r6)
            if (r0 != 0) goto L_0x0060
            return r2
        L_0x0060:
            com.instagram.settings2.core.data.SettingsRepository r1 = r12.A01
            X.MXa r0 = r11.A05
            r5.A01 = r11
            r5.A02 = r12
            r5.A03 = r8
            r5.A00 = r10
            java.lang.Object r6 = r1.A09(r0, r5)
            if (r6 != r4) goto L_0x0082
            return r4
        L_0x0073:
            java.lang.Object r8 = r5.A03
            X.I4T r8 = (X.I4T) r8
            java.lang.Object r12 = r5.A02
            com.instagram.settings2.core.session.SettingsSession r12 = (com.instagram.settings2.core.session.SettingsSession) r12
            java.lang.Object r11 = r5.A01
            X.Jza r11 = (X.C61242Jza) r11
            X.0eS.A00(r6)
        L_0x0082:
            X.3Ii r6 = (X.C239803Ii) r6
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0189
            boolean r0 = r6 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0184
            X.3Ih r6 = (X.C239793Ih) r6
            java.lang.Object r0 = r6.A00
            X.JwE r0 = (X.C61076JwE) r0
            java.lang.Object r15 = r0.A00
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r14 = r0.A01
            com.instagram.settings2.core.data.SettingsRepository r1 = r12.A01
            X.MXa r0 = r11.A05
            java.lang.String r13 = r1.A0B(r0)
            if (r14 == 0) goto L_0x00d3
            X.0eM r0 = r8.A04
            java.lang.Object r10 = X.JTR.A0x(r14, r0)
            X.LSs r10 = (X.C64185LSs) r10
        L_0x00aa:
            X.LSs r8 = r11.A01
            X.LSs r6 = r11.A02
            X.LSs r1 = r11.A03
            X.LSs r0 = r11.A00
            r5.A01 = r11
            r5.A02 = r12
            r5.A03 = r15
            r5.A04 = r14
            r5.A05 = r13
            r5.A00 = r9
            r18 = r1
            r19 = r0
            r20 = r10
            r21 = r12
            r22 = r5
            r16 = r8
            r17 = r6
            java.lang.Object r6 = com.instagram.settings2.core.session.SettingsSessionResolveExtensionsKt.A01(r16, r17, r18, r19, r20, r21, r22)
            if (r6 != r4) goto L_0x00ec
            return r4
        L_0x00d3:
            r10 = r2
            goto L_0x00aa
        L_0x00d5:
            java.lang.Object r13 = r5.A05
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r5.A04
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r5.A03
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r12 = r5.A02
            com.instagram.settings2.core.session.SettingsSession r12 = (com.instagram.settings2.core.session.SettingsSession) r12
            java.lang.Object r11 = r5.A01
            X.Jza r11 = (X.C61242Jza) r11
            X.0eS.A00(r6)
        L_0x00ec:
            X.Jvx r6 = (X.C61059Jvx) r6
            java.lang.Object r0 = r6.A01
            boolean r1 = X.AnonymousClass7TE.A1a(r0)
            java.lang.Object r8 = r6.A02
            X.JwL r8 = (X.C61083JwL) r8
            java.lang.Object r0 = r6.A03
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r9 = r6.A04
            X.JwL r9 = (X.C61083JwL) r9
            java.lang.Object r10 = r6.A05
            X.JwC r10 = (X.C61074JwC) r10
            java.util.List r6 = r11.A06
            r5.A01 = r11
            r5.A02 = r12
            r5.A03 = r15
            r5.A04 = r14
            r5.A05 = r13
            r5.A06 = r8
            r5.A07 = r0
            r5.A08 = r9
            r5.A09 = r10
            r5.A0A = r1
            r5.A00 = r7
            java.lang.Object r6 = r12.A01(r6, r5)
            if (r6 != r4) goto L_0x014c
            return r4
        L_0x0123:
            boolean r1 = r5.A0A
            java.lang.Object r10 = r5.A09
            X.JwC r10 = (X.C61074JwC) r10
            java.lang.Object r9 = r5.A08
            X.JwL r9 = (X.C61083JwL) r9
            java.lang.Object r0 = r5.A07
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r8 = r5.A06
            X.JwL r8 = (X.C61083JwL) r8
            java.lang.Object r13 = r5.A05
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r5.A04
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r5.A03
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r12 = r5.A02
            com.instagram.settings2.core.session.SettingsSession r12 = (com.instagram.settings2.core.session.SettingsSession) r12
            java.lang.Object r11 = r5.A01
            X.Jza r11 = (X.C61242Jza) r11
            X.0eS.A00(r6)
        L_0x014c:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.List r17 = X.00k.A0X(r6)
            com.instagram.settings2.core.viewmodel.UiStateKt$toUiState$10 r7 = new com.instagram.settings2.core.viewmodel.UiStateKt$toUiState$10
            r18 = r2
            r19 = r1
            r16 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r5.A01 = r2
            r5.A02 = r2
            r5.A03 = r2
            r5.A04 = r2
            r5.A05 = r2
            r5.A06 = r2
            r5.A07 = r2
            r5.A08 = r2
            r5.A09 = r2
            r5.A00 = r3
            java.lang.Object r6 = X.19E.A00(r5, r7)
            if (r6 != r4) goto L_0x0035
            return r4
        L_0x0178:
            X.MDS r5 = new X.MDS
            r5.<init>(r3)
            goto L_0x001a
        L_0x017f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0184:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0189:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Failed to load setting "
            r1.append(r0)
            X.MXa r0 = r11.A05
            r1.append(r0)
            java.lang.String r0 = ". "
            java.lang.IllegalStateException r0 = X.JTS.A0d(r6, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.viewmodel.UiStateKt.A04(X.Jza, com.instagram.settings2.core.session.SettingsSession, X.I4T, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDz, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.AbstractCollection, X.XE5] */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0078 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e4 A[Catch:{ Exception -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01be A[Catch:{ Exception -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A05(X.C61240JzY r27, com.instagram.settings2.core.session.SettingsSession r28, X.I4T r29, X.AnonymousClass4D7 r30) {
        /*
            r8 = r29
            r6 = r27
            r9 = r28
            r3 = 18
            r4 = r30
            boolean r0 = X.C66147MDz.A02(r3, r4)
            if (r0 == 0) goto L_0x00c9
            r7 = r4
            X.MDz r7 = (X.C66147MDz) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c9
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x001e:
            java.lang.Object r2 = r7.A05
            X.1Hj r3 = X.1Hj.A02
            int r0 = r7.A00
            r1 = 3
            r4 = 2
            r10 = 0
            r5 = 1
            if (r0 == 0) goto L_0x004f
            if (r0 == r5) goto L_0x0063
            if (r0 == r4) goto L_0x0087
            if (r0 != r1) goto L_0x01da
            java.lang.Object r10 = r7.A04
            java.lang.Object r4 = r7.A03
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r9 = r7.A02
            com.instagram.settings2.core.session.SettingsSession r9 = (com.instagram.settings2.core.session.SettingsSession) r9
            java.lang.Object r6 = r7.A01
            X.JzY r6 = (X.C61240JzY) r6
            X.0eS.A00(r2)
        L_0x0041:
            X.0eP r2 = (X.0eP) r2
            java.lang.Object r0 = r2.A00
            boolean r29 = X.AnonymousClass7TE.A1a(r0)
            java.lang.Object r15 = r2.A01
            X.JwC r15 = (X.C61074JwC) r15
            goto L_0x00d0
        L_0x004f:
            X.0eS.A00(r2)
            X.LSs r0 = r6.A01
            r7.A01 = r6
            r7.A02 = r9
            r7.A03 = r8
            r7.A00 = r5
            java.lang.Object r2 = com.instagram.settings2.core.session.SettingsSessionResolveExtensionsKt.A08(r0, r9, r7)
            if (r2 != r3) goto L_0x0072
            return r3
        L_0x0063:
            java.lang.Object r8 = r7.A03
            X.I4T r8 = (X.I4T) r8
            java.lang.Object r9 = r7.A02
            com.instagram.settings2.core.session.SettingsSession r9 = (com.instagram.settings2.core.session.SettingsSession) r9
            java.lang.Object r6 = r7.A01
            X.JzY r6 = (X.C61240JzY) r6
            X.0eS.A00(r2)
        L_0x0072:
            boolean r0 = X.AnonymousClass7TE.A1a(r2)
            if (r0 != 0) goto L_0x0079
            return r10
        L_0x0079:
            com.instagram.settings2.core.data.SettingsRepository r2 = r9.A01
            X.MXa r0 = r6.A03
            X.C66147MDz.A00(r6, r9, r8, r7, r4)
            java.lang.Object r2 = r2.A09(r0, r7)
            if (r2 != r3) goto L_0x0096
            return r3
        L_0x0087:
            java.lang.Object r8 = r7.A03
            X.I4T r8 = (X.I4T) r8
            java.lang.Object r9 = r7.A02
            com.instagram.settings2.core.session.SettingsSession r9 = (com.instagram.settings2.core.session.SettingsSession) r9
            java.lang.Object r6 = r7.A01
            X.JzY r6 = (X.C61240JzY) r6
            X.0eS.A00(r2)
        L_0x0096:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x01e4
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x01df
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r0 = r2.A00
            X.JwE r0 = (X.C61076JwE) r0
            java.lang.Object r4 = r0.A00
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r2 = r0.A01
            if (r2 == 0) goto L_0x00b6
            X.0eM r0 = r8.A04
            java.lang.Object r10 = X.JTR.A0x(r2, r0)
            X.LSs r10 = (X.C64185LSs) r10
        L_0x00b6:
            X.LSs r0 = r6.A00
            r7.A01 = r6
            r7.A02 = r9
            r7.A03 = r4
            r7.A04 = r10
            r7.A00 = r1
            java.lang.Object r2 = com.instagram.settings2.core.session.SettingsSessionResolveExtensionsKt.A06(r0, r10, r9, r7)
            if (r2 != r3) goto L_0x0041
            return r3
        L_0x00c9:
            X.MDz r7 = new X.MDz
            r7.<init>(r3, r4)
            goto L_0x001e
        L_0x00d0:
            r12 = 0
            X.0qQ.A0B(r4, r12)     // Catch:{ Exception -> 0x01ce }
            X.4db r0 = X.C268554db.A02()     // Catch:{ Exception -> 0x01ce }
            X.3pD r2 = r0.A08(r4)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r0 = "start_time"
            X.3pD r0 = r2.A04(r0)     // Catch:{ Exception -> 0x01ce }
            if (r0 == 0) goto L_0x01be
            int r7 = r0.A02()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r0 = "end_time"
            X.3pD r0 = r2.A04(r0)     // Catch:{ Exception -> 0x01ce }
            if (r0 == 0) goto L_0x01c6
            int r11 = r0.A02()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r0 = "days"
            X.3pD r0 = r2.A04(r0)     // Catch:{ Exception -> 0x01ce }
            if (r0 == 0) goto L_0x01b6
            java.util.Iterator r0 = r0.A08()     // Catch:{ Exception -> 0x01ce }
            if (r0 == 0) goto L_0x01b6
            X.2U8 r2 = X.2YX.A00(r0)     // Catch:{ Exception -> 0x01ce }
            X.G3t r0 = X.C51835G3t.A00     // Catch:{ Exception -> 0x01ce }
            X.3Sz r2 = X.C242173Sx.A0E(r0, r2)     // Catch:{ Exception -> 0x01ce }
            X.XDv r0 = X.C21082XDv.A03     // Catch:{ Exception -> 0x01ce }
            X.0qQ.A0B(r0, r12)     // Catch:{ Exception -> 0x01ce }
            X.XE5 r3 = new X.XE5     // Catch:{ Exception -> 0x01ce }
            r3.<init>(r0)     // Catch:{ Exception -> 0x01ce }
            X.0qQ.A0B(r2, r5)     // Catch:{ Exception -> 0x01ce }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x01ce }
        L_0x011d:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x01ce }
            if (r0 == 0) goto L_0x0127
            X.JTT.A1U(r3, r2)     // Catch:{ Exception -> 0x01ce }
            goto L_0x011d
        L_0x0127:
            X.XDv r16 = r3.AEM()     // Catch:{ Exception -> 0x01ce }
            X.30J r5 = X.AnonymousClass30J.SECONDS     // Catch:{ Exception -> 0x01ce }
            long r7 = X.AnonymousClass30K.A03(r5, r7)     // Catch:{ Exception -> 0x01ce }
            long r13 = X.AnonymousClass30K.A03(r5, r11)     // Catch:{ Exception -> 0x01ce }
            r0 = r16
            X.0qQ.A0B(r0, r1)     // Catch:{ Exception -> 0x01ce }
            r0 = 23
            X.30J r11 = X.AnonymousClass30J.HOURS
            long r2 = X.AnonymousClass30K.A03(r11, r0)
            r1 = 59
            X.30J r0 = X.AnonymousClass30J.MINUTES
            long r0 = X.AnonymousClass30K.A03(r0, r1)
            long r2 = X.AnonymousClass30M.A05(r2, r0)
            long r0 = X.AnonymousClass30K.A03(r11, r12)
            int r0 = X.AnonymousClass30M.A02(r7, r0)
            if (r0 < 0) goto L_0x01a1
            int r0 = X.AnonymousClass30M.A02(r7, r2)
            if (r0 > 0) goto L_0x01a1
            long r0 = X.AnonymousClass30K.A03(r11, r12)
            int r0 = X.AnonymousClass30M.A02(r13, r0)
            if (r0 < 0) goto L_0x01a1
            int r0 = X.AnonymousClass30M.A02(r13, r2)
            if (r0 > 0) goto L_0x01a1
            if (r10 == 0) goto L_0x0199
            X.Kge r19 = X.C62489Kge.REQUEST_PENDING
        L_0x0172:
            X.MXa r2 = r6.A03
            com.instagram.common.session.UserSession r5 = r9.A00
            X.0Tu r3 = X.0Tu.A05
            r0 = 2342170220560398568(0x20810f68000038e8, double:4.0717004905215215E-152)
            boolean r30 = X.182.A06(r3, r5, r0)
            X.MXZ r0 = r6.A02
            X.0sn r23 = X.0sn.A00
            X.GqW r17 = new X.GqW
            r25 = r7
            r27 = r13
            r20 = r0
            r21 = r2
            r22 = r4
            r24 = r16
            r18 = r15
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r27, r29, r30)
            return r17
        L_0x0199:
            if (r29 == 0) goto L_0x019e
            X.Kge r19 = X.C62489Kge.ENABLED
            goto L_0x0172
        L_0x019e:
            X.Kge r19 = X.C62489Kge.DISABLED
            goto L_0x0172
        L_0x01a1:
            java.lang.String r0 = "Invalid start or end time for SleepModeCustomSetting. Start: "
            long r2 = X.AnonymousClass30M.A06(r5, r7)
            java.lang.String r1 = " end: "
            long r4 = X.AnonymousClass30M.A06(r5, r13)
            java.lang.String r0 = X.002.A0f(r0, r1, r2, r4)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x01b6:
            java.lang.String r0 = "unable to parse days"
            org.json.JSONException r1 = new org.json.JSONException     // Catch:{ Exception -> 0x01ce }
            r1.<init>(r0)     // Catch:{ Exception -> 0x01ce }
            goto L_0x01cd
        L_0x01be:
            java.lang.String r0 = "unable to parse start_time"
            org.json.JSONException r1 = new org.json.JSONException     // Catch:{ Exception -> 0x01ce }
            r1.<init>(r0)     // Catch:{ Exception -> 0x01ce }
            goto L_0x01cd
        L_0x01c6:
            java.lang.String r0 = "unable to parse end_time"
            org.json.JSONException r1 = new org.json.JSONException     // Catch:{ Exception -> 0x01ce }
            r1.<init>(r0)     // Catch:{ Exception -> 0x01ce }
        L_0x01cd:
            throw r1     // Catch:{ Exception -> 0x01ce }
        L_0x01ce:
            r1 = move-exception
            java.lang.String r0 = "Failed to load SleepModeCustomSetting JSON: "
            java.lang.String r0 = X.AnonymousClass7TF.A0m(r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x01da:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01df:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01e4:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Failed to load SleepModeCustomSetting "
            r1.append(r0)
            X.MXa r0 = r6.A03
            r1.append(r0)
            java.lang.String r0 = ". "
            java.lang.IllegalStateException r0 = X.JTS.A0d(r2, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.viewmodel.UiStateKt.A05(X.JzY, com.instagram.settings2.core.session.SettingsSession, X.I4T, X.4D7):java.lang.Object");
    }
}

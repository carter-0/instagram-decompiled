package X;

import com.instagram.common.session.UserSession;

public final class MHI extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public static C73568Pfp A01(Object obj, MHI mhi, int i) {
        C73568Pfp pfp = new C73568Pfp(obj, (AnonymousClass4D7) null, i);
        mhi.A00 = 1;
        return pfp;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHI(Object obj, Object obj2, AnonymousClass4D7 r4, int i) {
        super(2, r4);
        this.A04 = i;
        this.A03 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.MHI, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.MHI, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.MHI, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v3, types: [X.MHI, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4, types: [X.MHI, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v5, types: [X.MHI, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v6, types: [X.MHI, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01b7, code lost:
        r3 = new X.MHI(r2, r1, r11, r0);
        r3.A02 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01be, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01d7, code lost:
        return new X.MHI(r4, r5, r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01e1, code lost:
        return new X.MHI(r1, r11, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r10, X.AnonymousClass4D7 r11) {
        /*
            r9 = this;
            int r0 = r9.A04
            r7 = r11
            switch(r0) {
                case 0: goto L_0x0010;
                case 1: goto L_0x0015;
                case 2: goto L_0x001e;
                case 3: goto L_0x0027;
                case 4: goto L_0x0032;
                case 5: goto L_0x0039;
                case 6: goto L_0x0049;
                case 7: goto L_0x0052;
                case 8: goto L_0x005b;
                case 9: goto L_0x0063;
                case 10: goto L_0x006d;
                case 11: goto L_0x0077;
                case 12: goto L_0x0081;
                case 13: goto L_0x0089;
                case 14: goto L_0x0093;
                case 15: goto L_0x009d;
                case 16: goto L_0x00a5;
                case 17: goto L_0x00af;
                case 18: goto L_0x00b9;
                case 19: goto L_0x00c3;
                case 20: goto L_0x00cd;
                case 21: goto L_0x00d7;
                case 22: goto L_0x00e1;
                case 23: goto L_0x00eb;
                case 24: goto L_0x00f5;
                case 25: goto L_0x00ff;
                case 26: goto L_0x0109;
                case 27: goto L_0x0113;
                case 28: goto L_0x011d;
                case 29: goto L_0x0127;
                case 30: goto L_0x0131;
                case 31: goto L_0x013b;
                case 32: goto L_0x0145;
                case 33: goto L_0x014f;
                case 34: goto L_0x0156;
                case 35: goto L_0x015f;
                case 36: goto L_0x0168;
                case 37: goto L_0x016f;
                case 38: goto L_0x0178;
                case 39: goto L_0x0181;
                case 40: goto L_0x0188;
                case 41: goto L_0x0191;
                case 42: goto L_0x0198;
                case 43: goto L_0x01a1;
                case 44: goto L_0x01aa;
                case 45: goto L_0x01b1;
                case 46: goto L_0x01bf;
                case 47: goto L_0x01ca;
                case 48: goto L_0x01d8;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r0 = r9.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.MHI r3 = new X.MHI
            r3.<init>(r0, r11)
            return r3
        L_0x0010:
            java.lang.Object r1 = r9.A03
            r0 = 0
            goto L_0x01dc
        L_0x0015:
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            r8 = 1
            goto L_0x01d2
        L_0x001e:
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            r8 = 2
            goto L_0x01d2
        L_0x0027:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A01
            r0 = 3
            X.MHI r3 = new X.MHI
            r3.<init>(r2, r1, r11, r0)
            return r3
        L_0x0032:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A01
            r0 = 4
            goto L_0x01b7
        L_0x0039:
            java.lang.Object r1 = r9.A02
            X.Mu4 r1 = (X.C67751Mu4) r1
            java.lang.Object r0 = r9.A01
            X.N46 r0 = (X.N46) r0
            X.MHI r3 = new X.MHI
            r3.<init>((X.N46) r0, (X.C67751Mu4) r1, (X.AnonymousClass4D7) r11)
            r3.A03 = r10
            return r3
        L_0x0049:
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            r8 = 6
            goto L_0x01d2
        L_0x0052:
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            r8 = 7
            goto L_0x01d2
        L_0x005b:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A01
            r0 = 8
            goto L_0x01b7
        L_0x0063:
            java.lang.Object r6 = r9.A03
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            r8 = 9
            goto L_0x01d2
        L_0x006d:
            java.lang.Object r4 = r9.A02
            java.lang.Object r6 = r9.A03
            java.lang.Object r5 = r9.A01
            r8 = 10
            goto L_0x01d2
        L_0x0077:
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            r8 = 11
            goto L_0x01d2
        L_0x0081:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A01
            r0 = 12
            goto L_0x01b7
        L_0x0089:
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            r8 = 13
            goto L_0x01d2
        L_0x0093:
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            r8 = 14
            goto L_0x01d2
        L_0x009d:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A01
            r0 = 15
            goto L_0x01b7
        L_0x00a5:
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            r8 = 16
            goto L_0x01d2
        L_0x00af:
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            r8 = 17
            goto L_0x01d2
        L_0x00b9:
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            r8 = 18
            goto L_0x01d2
        L_0x00c3:
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            r8 = 19
            goto L_0x01d2
        L_0x00cd:
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            r8 = 20
            goto L_0x01d2
        L_0x00d7:
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            r8 = 21
            goto L_0x01d2
        L_0x00e1:
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            r8 = 22
            goto L_0x01d2
        L_0x00eb:
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            r8 = 23
            goto L_0x01d2
        L_0x00f5:
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            r8 = 24
            goto L_0x01d2
        L_0x00ff:
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            r8 = 25
            goto L_0x01d2
        L_0x0109:
            java.lang.Object r6 = r9.A03
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            r8 = 26
            goto L_0x01d2
        L_0x0113:
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            r8 = 27
            goto L_0x01d2
        L_0x011d:
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            r8 = 28
            goto L_0x01d2
        L_0x0127:
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            r8 = 29
            goto L_0x01d2
        L_0x0131:
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            r8 = 30
            goto L_0x01d2
        L_0x013b:
            java.lang.Object r6 = r9.A03
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            r8 = 31
            goto L_0x01d2
        L_0x0145:
            java.lang.Object r6 = r9.A03
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            r8 = 32
            goto L_0x01d2
        L_0x014f:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A01
            r0 = 33
            goto L_0x01b7
        L_0x0156:
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            r8 = 34
            goto L_0x01d2
        L_0x015f:
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            r8 = 35
            goto L_0x01d2
        L_0x0168:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A01
            r0 = 36
            goto L_0x01b7
        L_0x016f:
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            r8 = 37
            goto L_0x01d2
        L_0x0178:
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            r8 = 38
            goto L_0x01d2
        L_0x0181:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A01
            r0 = 39
            goto L_0x01b7
        L_0x0188:
            java.lang.Object r4 = r9.A02
            java.lang.Object r6 = r9.A03
            java.lang.Object r5 = r9.A01
            r8 = 40
            goto L_0x01d2
        L_0x0191:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A01
            r0 = 41
            goto L_0x01b7
        L_0x0198:
            java.lang.Object r6 = r9.A03
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            r8 = 42
            goto L_0x01d2
        L_0x01a1:
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            r8 = 43
            goto L_0x01d2
        L_0x01aa:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A01
            r0 = 44
            goto L_0x01b7
        L_0x01b1:
            java.lang.Object r2 = r9.A03
            java.lang.Object r1 = r9.A01
            r0 = 45
        L_0x01b7:
            X.MHI r3 = new X.MHI
            r3.<init>(r2, r1, r11, r0)
            r3.A02 = r10
            return r3
        L_0x01bf:
            java.lang.Object r2 = r9.A01
            r1 = 0
            r0 = 46
            X.MHI r3 = new X.MHI
            r3.<init>(r1, r2, r11, r0)
            return r3
        L_0x01ca:
            java.lang.Object r4 = r9.A02
            java.lang.Object r5 = r9.A01
            java.lang.Object r6 = r9.A03
            r8 = 47
        L_0x01d2:
            X.MHI r3 = new X.MHI
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L_0x01d8:
            java.lang.Object r1 = r9.A03
            r0 = 48
        L_0x01dc:
            X.MHI r3 = new X.MHI
            r3.<init>((java.lang.Object) r1, (X.AnonymousClass4D7) r11, (int) r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MHI.create(java.lang.Object, X.4D7):X.4D7");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.MHI, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v137, types: [X.CsL, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x04f3, code lost:
        if (r11 == r2) goto L_0x04f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x04f5, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x053a, code lost:
        r5.post(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x06fd, code lost:
        r0 = X.AnonymousClass3DM.A00(r7, r8, r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x090e, code lost:
        r0.A00 = r8;
        r0 = X.AnonymousClass11O.A00(r0, r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0914, code lost:
        if (r0 != r2) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0916, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x096d, code lost:
        X.0eS.A00(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x098a, code lost:
        if (r0 != r1) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x098c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:458:0x0b96 A[Catch:{ all -> 0x0bfd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r11 = r20
            int r1 = r0.A04
            switch(r1) {
                case 0: goto L_0x004f;
                case 1: goto L_0x00be;
                case 2: goto L_0x00de;
                case 3: goto L_0x00fe;
                case 4: goto L_0x0147;
                case 5: goto L_0x01ac;
                case 6: goto L_0x01da;
                case 7: goto L_0x01fa;
                case 8: goto L_0x021a;
                case 9: goto L_0x024a;
                case 10: goto L_0x04f6;
                case 11: goto L_0x02b2;
                case 12: goto L_0x02d2;
                case 13: goto L_0x02fa;
                case 14: goto L_0x031a;
                case 15: goto L_0x0992;
                case 16: goto L_0x033a;
                case 17: goto L_0x035a;
                case 18: goto L_0x037a;
                case 19: goto L_0x039a;
                case 20: goto L_0x03ba;
                case 21: goto L_0x03da;
                case 22: goto L_0x03fa;
                case 23: goto L_0x041a;
                case 24: goto L_0x043a;
                case 25: goto L_0x045a;
                case 26: goto L_0x047a;
                case 27: goto L_0x055b;
                case 28: goto L_0x057b;
                case 29: goto L_0x059b;
                case 30: goto L_0x05bb;
                case 31: goto L_0x05db;
                case 32: goto L_0x0648;
                case 33: goto L_0x09cf;
                case 34: goto L_0x0674;
                case 35: goto L_0x0696;
                case 36: goto L_0x0a08;
                case 37: goto L_0x06b8;
                case 38: goto L_0x06db;
                case 39: goto L_0x0a41;
                case 40: goto L_0x0a7a;
                case 41: goto L_0x0703;
                case 42: goto L_0x0aad;
                case 43: goto L_0x087c;
                case 44: goto L_0x08a3;
                case 45: goto L_0x08cd;
                case 46: goto L_0x0917;
                case 47: goto L_0x095f;
                case 48: goto L_0x0af0;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r4) goto L_0x098d
            java.lang.Object r3 = r0.A02
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.0eS.A00(r11)
        L_0x0019:
            X.JtA r11 = (X.C60890JtA) r11
            X.JvM r1 = com.instagram.direct.securityalert.debug.SecurityAlertDevUtils.A00(r11)
            java.lang.Object r0 = r0.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.5Gi r0 = r1.A01(r0)
            java.util.List r1 = X.AnonymousClass7TE.A1I(r0)
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.5GM r0 = X.AnonymousClass5GL.A00(r3)
            r0.A03(r1)
        L_0x0036:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0039:
            X.0eS.A00(r11)
            java.lang.Object r3 = r0.A01
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            com.instagram.direct.securityalert.debug.SecurityAlertDevUtils r2 = com.instagram.direct.securityalert.debug.SecurityAlertDevUtils.A01
            r0.A02 = r3
            r0.A03 = r2
            r0.A00 = r4
            java.lang.Object r11 = com.instagram.direct.securityalert.debug.SecurityAlertDevUtils.A02(r3, r2, r0)
            if (r11 != r1) goto L_0x0019
            return r1
        L_0x004f:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x008d
            if (r2 != r7) goto L_0x0c02
            java.lang.Object r6 = r0.A02
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r8 = r0.A01
            com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel r8 = (com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel) r8
            X.0eS.A00(r11)
        L_0x0063:
            X.5fe r1 = r8.A01
            if (r1 == 0) goto L_0x007c
            X.5g5 r2 = r1.A01(r6)
            if (r2 == 0) goto L_0x007c
            boolean r1 = r8.A0o
            if (r1 == 0) goto L_0x0087
            java.lang.String r3 = r2.A01
            java.util.List r2 = r2.A02
            X.L88 r1 = r8.A0Q
            java.util.List r1 = r1.A03
            com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel.A06(r8, r3, r2, r1)
        L_0x007c:
            java.lang.Object r0 = r0.A03
            com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel r0 = (com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel) r0
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.A0W
            r0 = 0
            r1.getAndSet(r0)
            goto L_0x0036
        L_0x0087:
            X.05G r1 = r8.A0l
            r1.Epw(r2)
            goto L_0x007c
        L_0x008d:
            X.0eS.A00(r11)
            java.lang.Object r8 = r0.A03
            com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel r8 = (com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel) r8
            X.L88 r2 = r8.A0Q
            java.lang.String r6 = r2.A00
            if (r6 == 0) goto L_0x007c
            com.instagram.common.session.UserSession r5 = r8.A0L
            X.0Tu r4 = X.0Tu.A05
            r2 = 36313454566901770(0x8102e50007080a, double:3.028113118429027E-306)
            boolean r13 = X.DbY.A1Y(r4, r5, r2)
            r0.A01 = r8
            r0.A02 = r6
            r0.A00 = r7
            X.L88 r2 = r8.A0Q
            java.lang.String r3 = r2.A02
            r12 = 0
            java.lang.String r2 = r2.A01
            r9 = r3
            r10 = r2
            r11 = r0
            java.lang.Object r2 = com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel.A01(r8, r9, r10, r11, r12, r13)
            if (r2 != r1) goto L_0x0063
            return r1
        L_0x00be:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x00cc
            if (r3 == r2) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00cc:
            X.07V r8 = A00(r11, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            java.lang.Object r3 = r0.A03
            r2 = 13
            X.Pfp r6 = A01(r3, r0, r2)
            goto L_0x06fd
        L_0x00de:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x00ec
            if (r3 == r2) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00ec:
            X.07V r8 = A00(r11, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            java.lang.Object r3 = r0.A03
            r2 = 14
            X.Pfp r6 = A01(r3, r0, r2)
            goto L_0x06fd
        L_0x00fe:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x012c
            if (r2 != r5) goto L_0x0c07
            java.lang.Object r4 = r0.A02
            X.Mtu r4 = (X.C67741Mtu) r4
            X.0eS.A00(r11)
        L_0x010e:
            X.CsL r11 = (X.C45208CsL) r11
            java.util.List r1 = r11.A00
            java.util.List r2 = X.0jo.A1G(r1)
            X.0qQ.A0B(r2, r5)
            X.CsL r1 = new X.CsL
            r1.<init>()
            r1.A00 = r2
            r4.A01 = r1
            java.lang.Object r0 = r0.A03
            X.Mtu r0 = (X.C67741Mtu) r0
            android.os.Handler r5 = r0.A02
            java.lang.Runnable r6 = r0.A03
            goto L_0x053a
        L_0x012c:
            X.0eS.A00(r11)
            java.lang.Object r4 = r0.A03
            X.Mtu r4 = (X.C67741Mtu) r4
            java.lang.Object r3 = r0.A01
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            com.instagram.creation.genai.aistickers.data.AIStickersGhostPromptsRepository r2 = new com.instagram.creation.genai.aistickers.data.AIStickersGhostPromptsRepository
            r2.<init>(r3)
            r0.A02 = r4
            r0.A00 = r5
            java.lang.Object r11 = r2.A00(r0)
            if (r11 != r1) goto L_0x010e
            return r1
        L_0x0147:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x0155
            if (r2 == r8) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0155:
            X.0eS.A00(r11)
            java.lang.Object r9 = r0.A03
            X.7Rt r9 = (X.C331637Rt) r9
            java.lang.Object r7 = r0.A01
            android.content.Context r7 = (android.content.Context) r7
            X.0qQ.A0A(r7)
            X.7Zg r3 = r9.A03
            java.lang.String r4 = "clientInfra"
            if (r3 == 0) goto L_0x0c0c
            X.7Li r2 = r9.A01
            if (r2 != 0) goto L_0x0177
            java.lang.String r0 = "viewHolder"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0177:
            X.C331637Rt.A00(r7, r9, r2, r3)
            X.0eM r2 = r9.A04
            java.lang.Object r6 = r2.getValue()
            X.0qQ.A0A(r7)
            X.7Zg r3 = r9.A03
            if (r3 == 0) goto L_0x0c0c
            r2 = 0
            X.0qQ.A0B(r7, r2)
            X.7Yy r2 = r3.BCh()
            X.0Ud r5 = r2.AvG()
            r2 = 68
            X.MCi r4 = X.MCi.A00(r9, r2)
            r0.A00 = r8
            r3 = 16
            X.MCf r2 = new X.MCf
            r2.<init>((int) r3, (java.lang.Object) r7, (java.lang.Object) r6, (java.lang.Object) r4)
            java.lang.Object r0 = r5.collect(r2, r0)
            if (r0 == r1) goto L_0x098a
            X.0gF r0 = X.C60340gF.A00
            goto L_0x098a
        L_0x01ac:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x01ba
            if (r2 == r7) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01ba:
            X.0eS.A00(r11)
            java.lang.Object r6 = r0.A03
            X.6FR r6 = (X.AnonymousClass6FR) r6
            r8 = 0
            java.lang.Object r5 = r0.A02
            java.lang.Object r4 = r0.A01
            r3 = 8
            X.PqR r2 = new X.PqR
            r2.<init>((int) r3, (java.lang.Object) r4, (java.lang.Object) r5)
            r0.A00 = r7
            X.0sK r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A00
            r9 = r2
            r10 = r8
            r7 = r0
            java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A03(r6, r7, r8, r9, r10, r11)
            goto L_0x098a
        L_0x01da:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x01e8
            if (r3 == r2) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01e8:
            X.07V r8 = A00(r11, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            java.lang.Object r3 = r0.A03
            r2 = 17
            X.Pfp r6 = A01(r3, r0, r2)
            goto L_0x06fd
        L_0x01fa:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x0208
            if (r3 == r2) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0208:
            X.07V r8 = A00(r11, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            java.lang.Object r3 = r0.A03
            r2 = 18
            X.Pfp r6 = A01(r3, r0, r2)
            goto L_0x06fd
        L_0x021a:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x0228
            if (r2 == r7) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0228:
            X.0eS.A00(r11)
            java.lang.Object r6 = r0.A03
            X.NKG r6 = (X.NKG) r6
            X.0eM r2 = r6.A06
            java.lang.Object r2 = r2.getValue()
            X.K8P r2 = (X.K8P) r2
            X.0r6 r5 = r2.A01
            java.lang.Object r4 = r0.A01
            r3 = 8
            X.PeM r2 = new X.PeM
            r2.<init>(r3, r4, r6)
            r0.A00 = r7
            java.lang.Object r0 = r5.collect(r2, r0)
            goto L_0x098a
        L_0x024a:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r13 = 1
            if (r2 == 0) goto L_0x0258
            if (r2 == r13) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0258:
            X.0eS.A00(r11)
            java.lang.Object r4 = r0.A03
            X.JgH r4 = (X.C60136JgH) r4
            X.L1Q r3 = r4.A00
            java.lang.Object r2 = r0.A02
            X.QP8 r2 = (X.QP8) r2
            r15 = 0
            X.0qQ.A0B(r2, r15)
            r14 = 0
            X.2IS r7 = X.C41845B3m.A04()
            X.2IS r6 = X.C41845B3m.A04()
            java.lang.String r5 = r2.A01
            r2 = 105(0x69, float:1.47E-43)
            java.lang.String r2 = X.C66579MXk.A00(r2)
            X.1vR r8 = X.DbU.A0J(r7, r2, r5)
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<X.BrB> r12 = X.BrB.class
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            java.lang.String r9 = "MetaAIVoiceIGUserSettingsUpdateOrCreateMutation"
            java.lang.String r17 = "xig_meta_ai_voice_ig_user_setting_update_or_create"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.1vn r2 = r3.A00
            X.032 r2 = r2.A05(r7)
            X.FxC r6 = new X.FxC
            r6.<init>((X.AnonymousClass0r6) r2, (int) r13)
            java.lang.Object r5 = r0.A01
            r3 = 4
            X.JTc r2 = new X.JTc
            r2.<init>(r4, r5, r14, r3)
            r0.A00 = r13
            java.lang.Object r0 = X.AnonymousClass11O.A00(r0, r2, r6)
            goto L_0x098a
        L_0x02b2:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x02c0
            if (r3 == r2) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02c0:
            X.07V r8 = A00(r11, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            java.lang.Object r3 = r0.A03
            r2 = 23
            X.Pfp r6 = A01(r3, r0, r2)
            goto L_0x06fd
        L_0x02d2:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x02e0
            if (r2 == r5) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02e0:
            X.0eS.A00(r11)
            java.lang.Object r2 = r0.A03
            X.Mj8 r2 = (X.C67150Mj8) r2
            X.Mj7 r2 = r2.A02
            X.0r6 r4 = r2.A03
            java.lang.Object r3 = r0.A01
            r2 = 0
            X.MCm r2 = X.MCm.A00(r3, r2)
            r0.A00 = r5
            java.lang.Object r0 = r4.collect(r2, r0)
            goto L_0x098a
        L_0x02fa:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x0308
            if (r3 == r2) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0308:
            X.07V r8 = A00(r11, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            java.lang.Object r3 = r0.A03
            r2 = 29
            X.Pfp r6 = A01(r3, r0, r2)
            goto L_0x06fd
        L_0x031a:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x0328
            if (r3 == r2) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0328:
            X.07V r8 = A00(r11, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            java.lang.Object r3 = r0.A03
            r2 = 30
            X.Pfp r6 = A01(r3, r0, r2)
            goto L_0x06fd
        L_0x033a:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x0348
            if (r3 == r2) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0348:
            X.07V r8 = A00(r11, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            java.lang.Object r3 = r0.A03
            r2 = 31
            X.Pfp r6 = A01(r3, r0, r2)
            goto L_0x06fd
        L_0x035a:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x0368
            if (r3 == r2) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0368:
            X.07V r8 = A00(r11, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            java.lang.Object r3 = r0.A03
            r2 = 32
            X.Pfp r6 = A01(r3, r0, r2)
            goto L_0x06fd
        L_0x037a:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x0388
            if (r3 == r2) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0388:
            X.07V r8 = A00(r11, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            java.lang.Object r3 = r0.A03
            r2 = 33
            X.Pfp r6 = A01(r3, r0, r2)
            goto L_0x06fd
        L_0x039a:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x03a8
            if (r3 == r2) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03a8:
            X.07V r8 = A00(r11, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            java.lang.Object r3 = r0.A03
            r2 = 34
            X.Pfp r6 = A01(r3, r0, r2)
            goto L_0x06fd
        L_0x03ba:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x03c8
            if (r3 == r2) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03c8:
            X.07V r8 = A00(r11, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            java.lang.Object r3 = r0.A03
            r2 = 35
            X.Pfp r6 = A01(r3, r0, r2)
            goto L_0x06fd
        L_0x03da:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x03e8
            if (r3 == r2) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x03e8:
            X.07V r8 = A00(r11, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            java.lang.Object r3 = r0.A03
            r2 = 36
            X.Pfp r6 = A01(r3, r0, r2)
            goto L_0x06fd
        L_0x03fa:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x0408
            if (r3 == r2) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0408:
            X.07V r8 = A00(r11, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            java.lang.Object r3 = r0.A03
            r2 = 37
            X.Pfp r6 = A01(r3, r0, r2)
            goto L_0x06fd
        L_0x041a:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x0428
            if (r3 == r2) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0428:
            X.07V r8 = A00(r11, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            java.lang.Object r3 = r0.A03
            r2 = 38
            X.Pfp r6 = A01(r3, r0, r2)
            goto L_0x06fd
        L_0x043a:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x0448
            if (r3 == r2) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0448:
            X.07V r8 = A00(r11, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            java.lang.Object r3 = r0.A03
            r2 = 39
            X.Pfp r6 = A01(r3, r0, r2)
            goto L_0x06fd
        L_0x045a:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x0468
            if (r3 == r2) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0468:
            X.07V r8 = A00(r11, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            java.lang.Object r3 = r0.A03
            r2 = 40
            X.Pfp r6 = A01(r3, r0, r2)
            goto L_0x06fd
        L_0x047a:
            r2 = r11
            X.1Hj r1 = X.1Hj.A02
            int r4 = r0.A00
            r3 = 1
            if (r4 == 0) goto L_0x0488
            if (r4 != r3) goto L_0x0c14
            X.0eS.A00(r11)
            return r2
        L_0x0488:
            X.0eS.A00(r11)
            java.lang.Object r7 = r0.A03
            com.instagram.direct.inbox.notes.GraphqlOptimisticPostOperation r7 = (com.instagram.direct.inbox.notes.GraphqlOptimisticPostOperation) r7
            java.lang.Object r6 = r0.A02
            X.1ua r6 = (X.1ua) r6
            java.lang.Object r5 = r0.A01
            X.3Q2 r5 = (X.AnonymousClass3Q2) r5
            r0.A00 = r3
            X.3Pl r4 = X.JTQ.A0m(r0)
            X.1iA r0 = r5.A1G
            int r2 = r0.ordinal()
            r0 = 7
            if (r2 == r0) goto L_0x04d7
            if (r2 == r3) goto L_0x04d3
            r0 = 0
            if (r2 == r0) goto L_0x04cf
            r0 = 0
            r4.resumeWith(r0)
        L_0x04af:
            r0 = 0
            X.LgL r3 = new X.LgL
            r3.<init>(r0, r5, r4)
            com.instagram.common.session.UserSession r0 = r7.A05
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.Lff> r0 = X.C64653Lff.class
            r2.A01(r3, r0)
            java.util.List r0 = r7.A0D
            r0.add(r3)
            r6.A0B(r5)
            java.lang.Object r2 = r4.A00()
            if (r2 != r1) goto L_0x04f5
            return r1
        L_0x04cf:
            r6.A0E(r5)
            goto L_0x04af
        L_0x04d3:
            r6.A0F(r5)
            goto L_0x04af
        L_0x04d7:
            com.instagram.pendingmedia.store.PendingMediaStore r2 = r6.A04
            X.1iA r0 = X.1iA.A07
            X.JTT.A1P(r0, r5, r6, r2)
            goto L_0x04af
        L_0x04df:
            X.0eS.A00(r11)
            java.lang.Object r3 = r0.A02
            X.1vn r3 = (X.1vn) r3
            java.lang.Object r1 = r0.A03
            X.1Ef r1 = (X.1Ef) r1
            X.0qQ.A0A(r1)
            r0.A00 = r4
            java.lang.Object r11 = r3.A04(r1, r0)
            if (r11 != r2) goto L_0x0502
        L_0x04f5:
            return r2
        L_0x04f6:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r4 = 1
            if (r1 == 0) goto L_0x04df
            if (r1 != r4) goto L_0x0c1e
            X.0eS.A00(r11)
        L_0x0502:
            X.3Ii r11 = (X.C239803Ii) r11
            boolean r1 = r11 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x053f
            X.3lr r4 = X.C41846B3n.A0R(r11)
            if (r4 == 0) goto L_0x0036
            java.lang.Class<com.instagram.direct.request.graphql.IGDDetectAndTranslateTextMessageQueryResponseImpl$XigIgdDetectAndTranslateTextMessageQuery> r3 = com.instagram.direct.request.graphql.IGDDetectAndTranslateTextMessageQueryResponseImpl.XigIgdDetectAndTranslateTextMessageQuery.class
            X.3sh r1 = X.C250663lr.Companion
            r2 = 1202135458(0x47a721a2, float:85571.266)
            r1 = 4281(0x10b9, float:5.999E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            com.google.common.collect.ImmutableList r12 = r4.A06(r3, r1, r2)
            if (r12 == 0) goto L_0x0036
            java.lang.Object r1 = r0.A01
            X.L99 r1 = (X.L99) r1
            X.LqK r7 = r1.A00
            X.0eM r0 = r7.A03
            android.os.Handler r5 = X.JTO.A0E(r0)
            X.3su r9 = r1.A02
            X.7LQ r8 = r1.A01
            java.lang.String r10 = r1.A03
            java.lang.ref.WeakReference r11 = r1.A04
            X.MA5 r6 = new X.MA5
            r6.<init>(r7, r8, r9, r10, r11, r12)
        L_0x053a:
            r5.post(r6)
            goto L_0x0036
        L_0x053f:
            boolean r1 = r11 instanceof X.C297815sO
            if (r1 == 0) goto L_0x0c19
            java.lang.Object r4 = r0.A01
            X.L99 r4 = (X.L99) r4
            X.LqK r3 = r4.A00
            X.0eM r0 = r3.A03
            android.os.Handler r5 = X.JTO.A0E(r0)
            java.lang.ref.WeakReference r2 = r4.A04
            X.7LQ r1 = r4.A01
            X.3su r0 = r4.A02
            X.M9X r6 = new X.M9X
            r6.<init>(r3, r1, r0, r2)
            goto L_0x053a
        L_0x055b:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x0569
            if (r3 == r2) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0569:
            X.07V r8 = A00(r11, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            java.lang.Object r3 = r0.A03
            r2 = 43
            X.Pfp r6 = A01(r3, r0, r2)
            goto L_0x06fd
        L_0x057b:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x0589
            if (r3 == r2) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0589:
            X.07V r8 = A00(r11, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            java.lang.Object r3 = r0.A03
            r2 = 44
            X.Pfp r6 = A01(r3, r0, r2)
            goto L_0x06fd
        L_0x059b:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x05a9
            if (r3 == r2) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x05a9:
            X.07V r8 = A00(r11, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            java.lang.Object r3 = r0.A03
            r2 = 47
            X.Pfp r6 = A01(r3, r0, r2)
            goto L_0x06fd
        L_0x05bb:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x05c9
            if (r3 == r2) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x05c9:
            X.07V r8 = A00(r11, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            java.lang.Object r3 = r0.A03
            r2 = 48
            X.Pfp r6 = A01(r3, r0, r2)
            goto L_0x06fd
        L_0x05db:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r4 = 1
            if (r2 == 0) goto L_0x063c
            if (r2 != r4) goto L_0x0c23
            X.0eS.A00(r11)
        L_0x05e7:
            java.lang.Object r5 = r0.A03
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            X.8ab r3 = X.DbW.A0U(r5)
            android.content.Context r2 = r5.requireContext()
            r1 = 2131237608(0x7f081ae8, float:1.8091471E38)
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r1)
            r3.A0j(r1)
            r1 = 0
            r3.A0r(r1)
            r1 = 2131968571(0x7f13423b, float:1.957404E38)
            r3.A09(r1)
            r1 = 2131968570(0x7f13423a, float:1.9574038E38)
            r3.A08(r1)
            r1 = 12
            X.LV2 r1 = X.LV2.A00(r5, r1)
            r3.A0E(r1)
            X.DbT.A1V(r3)
            java.lang.Object r1 = r0.A02
            X.0xa r1 = (X.0xa) r1
            X.0xY r2 = r1.AR4()
            r1 = 587(0x24b, float:8.23E-43)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            r2.E5T(r1, r4)
            r2.apply()
            java.lang.Object r3 = r0.A01
            X.1Av r3 = (X.1Av) r3
            X.0s0 r2 = r3.A4C
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 397(0x18d, float:5.56E-43)
            X.AnonymousClass7TF.A1J(r3, r2, r1, r0, r4)
            goto L_0x0036
        L_0x063c:
            X.0eS.A00(r11)
            r0.A00 = r4
            java.lang.Object r2 = X.C241603Pv.A00(r0)
            if (r2 != r1) goto L_0x05e7
            return r1
        L_0x0648:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x0656
            if (r2 == r8) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0656:
            X.0eS.A00(r11)
            java.lang.Object r2 = r0.A03
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            X.07Z r7 = r2.getViewLifecycleOwner()
            java.lang.Object r6 = r0.A02
            java.lang.Object r5 = r0.A01
            r4 = 0
            r3 = 0
            X.MGe r2 = new X.MGe
            r2.<init>((java.lang.Object) r6, (java.lang.Object) r5, (X.AnonymousClass4D7) r4, (int) r3)
            r0.A00 = r8
            java.lang.Object r0 = X.AnonymousClass3DM.A02(r7, r0, r2)
            goto L_0x098a
        L_0x0674:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0682
            if (r2 == r5) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0682:
            X.07V r8 = A00(r11, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            r4 = 0
            java.lang.Object r3 = r0.A03
            r2 = 4
            X.MGe r6 = new X.MGe
            r6.<init>(r3, r4, r2)
            r0.A00 = r5
            goto L_0x06fd
        L_0x0696:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x06a4
            if (r2 == r5) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x06a4:
            X.07V r8 = A00(r11, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            r4 = 0
            java.lang.Object r3 = r0.A03
            r2 = 5
            X.MGe r6 = new X.MGe
            r6.<init>(r3, r4, r2)
            r0.A00 = r5
            goto L_0x06fd
        L_0x06b8:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x06c6
            if (r2 == r5) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x06c6:
            X.07V r8 = A00(r11, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            r4 = 0
            java.lang.Object r3 = r0.A03
            r2 = 9
            X.MGe r6 = new X.MGe
            r6.<init>(r3, r4, r2)
            r0.A00 = r5
            goto L_0x06fd
        L_0x06db:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x06e9
            if (r2 == r5) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x06e9:
            X.07V r8 = A00(r11, r0)
            java.lang.Object r7 = r0.A01
            X.07U r7 = (X.07U) r7
            r4 = 0
            java.lang.Object r3 = r0.A03
            r2 = 10
            X.MGe r6 = new X.MGe
            r6.<init>(r3, r4, r2)
            r0.A00 = r5
        L_0x06fd:
            java.lang.Object r0 = X.AnonymousClass3DM.A00(r7, r8, r0, r6)
            goto L_0x098a
        L_0x0703:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r8 = 1
            if (r1 == 0) goto L_0x0733
            if (r1 != r8) goto L_0x0c28
            X.0eS.A00(r11)
        L_0x070f:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.lang.Object r3 = r0.A03
            X.K4X r3 = (X.K4X) r3
            java.util.Iterator r5 = r11.iterator()
        L_0x0719:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0750
            java.lang.Object r4 = r5.next()
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            java.util.List r2 = r3.A0C
            X.0qQ.A0A(r4)
            X.Lhg r1 = new X.Lhg
            r1.<init>(r4)
            r2.add(r1)
            goto L_0x0719
        L_0x0733:
            X.0eS.A00(r11)
            java.lang.Object r6 = r0.A02
            X.4Cq r6 = (X.C262224Cq) r6
            r5 = 0
            java.lang.Object r4 = r0.A03
            r3 = 4
            X.MGs r1 = new X.MGs
            r1.<init>(r4, r5, r3)
            X.2Q8 r1 = X.JTO.A1E(r1, r6)
            r0.A00 = r8
            java.lang.Object r11 = r1.A0E(r0)
            if (r11 != r2) goto L_0x070f
            return r2
        L_0x0750:
            java.util.List r2 = r3.A0C
            X.M7U r1 = new X.M7U
            r1.<init>(r3, r2)
            X.11Z.A02(r1)
            java.lang.Object r5 = r0.A01
            android.view.View r5 = (android.view.View) r5
            com.instagram.model.direct.DirectThreadKey r4 = r3.A07
            r0 = 2131435770(0x7f0b20fa, float:1.8493392E38)
            android.view.View r0 = r5.requireViewById(r0)
            r3.A02 = r0
            r0 = 2131435771(0x7f0b20fb, float:1.8493394E38)
            android.view.ViewStub r2 = X.JTR.A0X(r5, r0)
            r0 = 2131625018(0x7f0e043a, float:1.8877232E38)
            r2.setLayoutResource(r0)
            android.content.Context r6 = r5.getContext()
            r0 = 2131231568(0x7f080350, float:1.807922E38)
            X.DbU.A11(r6, r2, r0)
            r0 = 2131435772(0x7f0b20fc, float:1.8493396E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r5, r0)
            r0 = 2131960296(0x7f1321e8, float:1.9557257E38)
            X.DbT.A18(r6, r1, r0)
            android.view.View r0 = r3.A02
            X.AnonymousClass7TF.A16(r0)
            android.view.View r1 = r3.A02
            if (r1 == 0) goto L_0x079b
            r0 = 25
            X.LYA.A01(r1, r5, r4, r3, r0)
        L_0x079b:
            r9 = 0
            if (r4 == 0) goto L_0x07a6
            java.lang.String r1 = r4.A00
            if (r1 != 0) goto L_0x07ed
            java.lang.String r1 = r4.A01
            if (r1 != 0) goto L_0x07ed
        L_0x07a6:
            r0 = 2131435756(0x7f0b20ec, float:1.8493363E38)
            android.view.View r0 = r5.requireViewById(r0)
            r3.A01 = r0
            X.AnonymousClass7TF.A16(r0)
            android.view.View r1 = r3.A01
            if (r1 == 0) goto L_0x07bb
            r0 = 20
            X.LYE.A00(r1, r0, r3)
        L_0x07bb:
            r0 = 2131435777(0x7f0b2101, float:1.8493406E38)
            com.instagram.common.ui.base.IgSimpleImageView r0 = X.JTP.A0T(r5, r0)
            r3.A06 = r0
            X.AnonymousClass7TF.A16(r0)
            com.instagram.common.ui.base.IgSimpleImageView r1 = r3.A06
            if (r1 == 0) goto L_0x07d0
            r0 = 21
            X.LYE.A00(r1, r0, r3)
        L_0x07d0:
            java.util.ArrayList r0 = r3.A0A
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0036
            r0 = 2131435758(0x7f0b20ee, float:1.8493367E38)
            android.view.View r0 = r5.requireViewById(r0)
            com.instagram.common.ui.base.IgLinearLayout r0 = (com.instagram.common.ui.base.IgLinearLayout) r0
            r3.A05 = r0
            X.AnonymousClass7TF.A16(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r3.A03
            X.AnonymousClass7TH.A0R(r0)
            goto L_0x0036
        L_0x07ed:
            X.0eM r0 = r3.A0D
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.2Dm r0 = X.1bJ.A00(r0)
            X.2Dr r0 = (X.2Dr) r0
            X.3U9 r10 = r0.A0N(r1)
            if (r10 == 0) goto L_0x07a6
            android.view.View r4 = r2.inflate()
            r0 = 5087(0x13df, float:7.128E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r4, r0)
            com.instagram.ui.widget.stackedavatar.StackedAvatarView r4 = (com.instagram.ui.widget.stackedavatar.StackedAvatarView) r4
            java.util.List r0 = r10.BRZ()
            int r0 = r0.size()
            r7 = 0
            boolean r2 = X.C51970G9q.A1W(r0, r8)
            java.util.List r0 = r10.BRZ()
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x087a
            java.util.List r0 = r10.BRZ()
            com.instagram.user.model.User r0 = X.DbS.A0g(r0, r7)
            com.instagram.common.typedurl.ImageUrl r1 = r0.Bh3()
        L_0x0831:
            if (r2 == 0) goto L_0x083f
            java.util.List r0 = r10.BRZ()
            com.instagram.user.model.User r0 = X.DbS.A0g(r0, r8)
            com.instagram.common.typedurl.ImageUrl r9 = r0.Bh3()
        L_0x083f:
            r4.setUrls(r1, r9, r3)
            if (r2 == 0) goto L_0x0873
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165223(0x7f070027, float:1.7944657E38)
            int r2 = X.DbS.A03(r1, r0)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165200(0x7f070010, float:1.794461E38)
            int r1 = X.DbS.A03(r1, r0)
            r0 = 2131165204(0x7f070014, float:1.7944619E38)
            r4.A04(r6, r0)
            r4.setPadding(r2, r1, r7, r7)
        L_0x0863:
            android.content.Context r1 = r3.getContext()
            r0 = 2130970272(0x7f0406a0, float:1.754925E38)
            int r0 = X.JTP.A02(r1, r6, r0)
            r4.setRingColor(r0)
            goto L_0x07a6
        L_0x0873:
            r0 = 2131165203(0x7f070013, float:1.7944616E38)
            r4.A04(r6, r0)
            goto L_0x0863
        L_0x087a:
            r1 = r9
            goto L_0x0831
        L_0x087c:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r8 = 1
            if (r1 == 0) goto L_0x088a
            if (r1 == r8) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x088a:
            X.07V r7 = A00(r11, r0)
            java.lang.Object r6 = r0.A01
            X.07U r6 = (X.07U) r6
            r5 = 0
            java.lang.Object r4 = r0.A03
            r3 = 28
            X.Pfn r1 = new X.Pfn
            r1.<init>(r4, r5, r3)
            r0.A00 = r8
            java.lang.Object r0 = X.AnonymousClass3DM.A00(r6, r7, r0, r1)
            goto L_0x0914
        L_0x08a3:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r8 = 1
            if (r1 == 0) goto L_0x08b1
            if (r1 == r8) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x08b1:
            X.0eS.A00(r11)
            java.lang.Object r6 = r0.A03
            X.NIf r6 = (X.C68442NIf) r6
            X.0eM r1 = r6.A0B
            java.lang.Object r1 = r1.getValue()
            X.Mtk r1 = (X.C67731Mtk) r1
            X.0Ud r7 = r1.A04
            java.lang.Object r4 = r0.A01
            r3 = 0
            r1 = 23
            X.MfO r5 = new X.MfO
            r5.<init>(r6, r4, r3, r1)
            goto L_0x090e
        L_0x08cd:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r8 = 1
            if (r1 == 0) goto L_0x08db
            if (r1 == r8) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x08db:
            X.0eS.A00(r11)
            java.lang.Object r7 = r0.A02
            X.4Cq r7 = (X.C262224Cq) r7
            java.lang.Object r6 = r0.A03
            X.NKp r6 = (X.C68496NKp) r6
            X.0eM r1 = r6.A0K
            java.lang.Object r1 = r1.getValue()
            X.Mtw r1 = (X.C67743Mtw) r1
            X.0Ud r5 = r1.A08
            r4 = 0
            r3 = 29
            X.Pfn r1 = new X.Pfn
            r1.<init>(r6, r4, r3)
            X.C51968G9o.A1P(r1, r7, r5)
            X.0eM r1 = r6.A0K
            java.lang.Object r1 = r1.getValue()
            X.Mtw r1 = (X.C67743Mtw) r1
            X.0Ud r7 = r1.A09
            java.lang.Object r3 = r0.A01
            r1 = 24
            X.MfO r5 = new X.MfO
            r5.<init>(r6, r3, r4, r1)
        L_0x090e:
            r0.A00 = r8
            java.lang.Object r0 = X.AnonymousClass11O.A00(r0, r5, r7)
        L_0x0914:
            if (r0 != r2) goto L_0x0036
            return r2
        L_0x0917:
            int r1 = r0.A00
            r3 = 0
            r2 = 1
            if (r1 == 0) goto L_0x0c39
            if (r1 != r2) goto L_0x0c34
            java.lang.Object r1 = r0.A02
            X.0rm r1 = (X.0rm) r1
            X.0eS.A00(r11)
            r1.A00 = r11
            java.lang.Object r1 = r0.A01
            X.0rm r1 = (X.0rm) r1
            java.lang.Object r0 = r1.A00
            if (r0 == 0) goto L_0x0036
            X.5g5 r0 = (X.C290865g5) r0
            if (r0 == 0) goto L_0x093e
            java.util.List r0 = r0.A02
            int r0 = r0.size()
            if (r0 != 0) goto L_0x093e
            goto L_0x0036
        L_0x093e:
            java.lang.Object r0 = r1.A00
            X.5g5 r0 = (X.C290865g5) r0
            if (r0 == 0) goto L_0x0036
            java.util.List r0 = r0.A02
            java.lang.Object r0 = X.00k.A0I(r0)
            boolean r0 = r0 instanceof com.instagram.model.direct.DirectSearchResult
            if (r0 != r2) goto L_0x0036
            java.lang.Object r0 = r1.A00
            X.5g5 r0 = (X.C290865g5) r0
            if (r0 == 0) goto L_0x0956
            java.util.List r3 = r0.A02
        L_0x0956:
            if (r3 == 0) goto L_0x0c2d
            java.lang.String r0 = "_searchResults"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x095f:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r8 = 1
            if (r2 == 0) goto L_0x0972
            if (r2 == r8) goto L_0x096d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x096d:
            X.0eS.A00(r11)
            goto L_0x0036
        L_0x0972:
            X.07V r7 = A00(r11, r0)
            java.lang.Object r6 = r0.A01
            X.07U r6 = (X.07U) r6
            r5 = 0
            java.lang.Object r4 = r0.A03
            r3 = 31
            X.Pfn r2 = new X.Pfn
            r2.<init>(r4, r5, r3)
            r0.A00 = r8
            java.lang.Object r0 = X.AnonymousClass3DM.A00(r6, r7, r0, r2)
        L_0x098a:
            if (r0 != r1) goto L_0x0036
            return r1
        L_0x098d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0992:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r7 = 1
            if (r2 == 0) goto L_0x09a0
            if (r2 == r7) goto L_0x09c7
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x09a0:
            X.0eS.A00(r11)
            java.lang.Object r6 = r0.A03
            X.NJR r6 = (X.NJR) r6
            X.Mtj r2 = r6.A05
            if (r2 != 0) goto L_0x09b3
            X.C51965G9l.A15()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x09b3:
            X.0Ud r5 = r2.A02
            java.lang.Object r4 = r0.A01
            r3 = 12
            X.PeM r2 = new X.PeM
            r2.<init>(r3, r4, r6)
            r0.A00 = r7
            java.lang.Object r0 = r5.collect(r2, r0)
            if (r0 != r1) goto L_0x09ca
            return r1
        L_0x09c7:
            X.0eS.A00(r11)
        L_0x09ca:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x09cf:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r7 = 1
            if (r1 == 0) goto L_0x09dd
            if (r1 == r7) goto L_0x0a00
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x09dd:
            X.0eS.A00(r11)
            java.lang.Object r6 = r0.A03
            X.NKE r6 = (X.NKE) r6
            X.0eM r1 = r6.A0S
            java.lang.Object r1 = r1.getValue()
            X.MuB r1 = (X.C67756MuB) r1
            X.0Ud r5 = r1.A0H
            java.lang.Object r4 = r0.A01
            r3 = 17
            X.PeM r1 = new X.PeM
            r1.<init>(r3, r4, r6)
            r0.A00 = r7
            java.lang.Object r0 = r5.collect(r1, r0)
            if (r0 != r2) goto L_0x0a03
            return r2
        L_0x0a00:
            X.0eS.A00(r11)
        L_0x0a03:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0a08:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r7 = 1
            if (r1 == 0) goto L_0x0a16
            if (r1 == r7) goto L_0x0a39
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0a16:
            X.0eS.A00(r11)
            java.lang.Object r6 = r0.A03
            X.NKL r6 = (X.NKL) r6
            X.0eM r1 = r6.A0T
            java.lang.Object r1 = r1.getValue()
            X.MuG r1 = (X.C67760MuG) r1
            X.0Ud r5 = r1.A08
            java.lang.Object r4 = r0.A01
            r3 = 18
            X.PeM r1 = new X.PeM
            r1.<init>(r3, r4, r6)
            r0.A00 = r7
            java.lang.Object r0 = r5.collect(r1, r0)
            if (r0 != r2) goto L_0x0a3c
            return r2
        L_0x0a39:
            X.0eS.A00(r11)
        L_0x0a3c:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0a41:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r7 = 1
            if (r1 == 0) goto L_0x0a4f
            if (r1 == r7) goto L_0x0a72
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0a4f:
            X.0eS.A00(r11)
            java.lang.Object r6 = r0.A02
            java.lang.Object r5 = r0.A03
            X.NJf r5 = (X.C68467NJf) r5
            X.0eM r1 = r5.A0k
            java.lang.Object r1 = r1.getValue()
            X.MuA r1 = (X.C67755MuA) r1
            X.0Ud r4 = r1.A0A
            java.lang.Object r3 = r0.A01
            X.PeI r1 = new X.PeI
            r1.<init>(r7, r3, r5, r6)
            r0.A00 = r7
            java.lang.Object r0 = r4.collect(r1, r0)
            if (r0 != r2) goto L_0x0a75
            return r2
        L_0x0a72:
            X.0eS.A00(r11)
        L_0x0a75:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0a7a:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r7 = 1
            if (r1 == 0) goto L_0x0a88
            if (r1 == r7) goto L_0x0aa5
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0a88:
            X.0eS.A00(r11)
            java.lang.Object r1 = r0.A02
            X.OLa r1 = (X.C70780OLa) r1
            X.0Ud r6 = r1.A05
            java.lang.Object r5 = r0.A03
            java.lang.Object r4 = r0.A01
            r3 = 20
            X.PeM r1 = new X.PeM
            r1.<init>(r3, r4, r5)
            r0.A00 = r7
            java.lang.Object r0 = r6.collect(r1, r0)
            if (r0 != r2) goto L_0x0aa8
            return r2
        L_0x0aa5:
            X.0eS.A00(r11)
        L_0x0aa8:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0aad:
            X.1Hj r2 = X.1Hj.A02
            int r1 = r0.A00
            r3 = 1
            if (r1 == 0) goto L_0x0abc
            if (r1 != r3) goto L_0x0aeb
            X.0eS.A00(r11)
        L_0x0ab9:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0abc:
            X.0eS.A00(r11)
            java.lang.Object r1 = r0.A03
            X.FbA r1 = (X.C50402FbA) r1
            com.instagram.common.session.UserSession r1 = r1.A01
            X.F3K r4 = X.Ky3.A00(r1)
            java.lang.Object r1 = r0.A02
            X.3FW r1 = (X.AnonymousClass3FW) r1
            long r10 = r1.A01()
            long r12 = r1.A00()
            java.lang.Object r5 = r0.A01
            X.Fo5 r5 = (X.C51075Fo5) r5
            java.util.List r8 = r1.A04()
            r15 = 0
            r6 = 0
            r0.A00 = r3
            r7 = r6
            r14 = r3
            r9 = r0
            java.lang.Object r0 = r4.A00(r5, r6, r7, r8, r9, r10, r12, r14, r15)
            if (r0 != r2) goto L_0x0ab9
            return r2
        L_0x0aeb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0af0:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r13 = 2
            r4 = 0
            r2 = 1
            if (r3 == 0) goto L_0x0b0e
            java.lang.Object r12 = r0.A02
            if (r3 == r2) goto L_0x0b04
            com.instagram.direct.securityalert.data.SecurityAlertRepository r12 = (com.instagram.direct.securityalert.data.SecurityAlertRepository) r12
            java.lang.Object r3 = r0.A01
            X.136 r3 = (X.136) r3
            goto L_0x0b46
        L_0x0b04:
            com.instagram.direct.securityalert.data.SecurityAlertRepository r12 = (com.instagram.direct.securityalert.data.SecurityAlertRepository) r12
            java.lang.Object r3 = r0.A01
            X.136 r3 = (X.136) r3
            X.0eS.A00(r11)
            goto L_0x0b24
        L_0x0b0e:
            X.0eS.A00(r11)
            java.lang.Object r12 = r0.A03
            com.instagram.direct.securityalert.data.SecurityAlertRepository r12 = (com.instagram.direct.securityalert.data.SecurityAlertRepository) r12
            X.136 r3 = r12.A03
            r0.A01 = r3
            r0.A02 = r12
            r0.A00 = r2
            java.lang.Object r2 = X.136.A00(r0, r3)
            if (r2 != r1) goto L_0x0b24
            return r1
        L_0x0b24:
            X.KbC r10 = r12.A01     // Catch:{ all -> 0x0bfb }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0bfb }
            long r6 = r2.getId()     // Catch:{ all -> 0x0bfb }
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r6 = r6 % r8
            int r5 = (int) r6     // Catch:{ all -> 0x0bfb }
            r2 = 959397013(0x392f3c95, float:1.6711869E-4)
            r10.A02(r2, r5, r4)     // Catch:{ all -> 0x0bfb }
            r0.A01 = r3     // Catch:{ all -> 0x0bfb }
            r0.A02 = r12     // Catch:{ all -> 0x0bfb }
            r0.A00 = r13     // Catch:{ all -> 0x0bfb }
            java.lang.Object r11 = r12.A00(r0)     // Catch:{ all -> 0x0bfb }
            if (r11 != r1) goto L_0x0b49
            return r1
        L_0x0b46:
            X.0eS.A00(r11)     // Catch:{ all -> 0x0bfd }
        L_0x0b49:
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0bfd }
            X.KbC r6 = r12.A01     // Catch:{ all -> 0x0bfd }
            com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource r9 = r12.A02     // Catch:{ all -> 0x0bfd }
            java.lang.String r2 = X.C51968G9o.A16(r9)     // Catch:{ all -> 0x0bfd }
            X.0qQ.A07(r2)     // Catch:{ all -> 0x0bfd }
            int r1 = r11.size()     // Catch:{ all -> 0x0bfd }
            r15 = 3
            java.lang.String r8 = "source"
            java.lang.String r0 = "repository.sync"
            X.0eP r5 = X.AnonymousClass7TE.A1L(r8, r0)     // Catch:{ all -> 0x0bfd }
            java.lang.String r0 = "datasource"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r2)     // Catch:{ all -> 0x0bfd }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0bfd }
            java.lang.String r0 = "alert_count"
            X.0eP r0 = X.AnonymousClass7TE.A1L(r0, r1)     // Catch:{ all -> 0x0bfd }
            X.0eP[] r0 = new X.0eP[]{r5, r2, r0}     // Catch:{ all -> 0x0bfd }
            java.util.LinkedHashMap r7 = X.0Yt.A06(r0)     // Catch:{ all -> 0x0bfd }
            java.lang.Thread r14 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0bfd }
            long r0 = r14.getId()     // Catch:{ all -> 0x0bfd }
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = r0 % r12
            int r2 = (int) r0     // Catch:{ all -> 0x0bfd }
            r5 = 959397013(0x392f3c95, float:1.6711869E-4)
            java.lang.String r0 = "SYNC_TO_ACTIVITY_FEED"
            r6.A01(r5, r2, r0, r7)     // Catch:{ all -> 0x0bfd }
            boolean r0 = X.AnonymousClass7TE.A1b(r11)     // Catch:{ all -> 0x0bfd }
            if (r0 == 0) goto L_0x0bec
            com.instagram.common.session.UserSession r7 = r9.A00     // Catch:{ all -> 0x0bfd }
            X.5GM r10 = X.AnonymousClass5GL.A00(r7)     // Catch:{ all -> 0x0bfd }
            X.4Cq r9 = r10.A01     // Catch:{ all -> 0x0bfd }
            X.0nV r2 = X.JTR.A0j(r15)     // Catch:{ all -> 0x0bfd }
            r1 = 38
            X.MGW r0 = new X.MGW     // Catch:{ all -> 0x0bfd }
            r0.<init>(r10, r11, r4, r1)     // Catch:{ all -> 0x0bfd }
            X.1Eo.A05(r2, r0, r9)     // Catch:{ all -> 0x0bfd }
            java.util.Iterator r9 = r11.iterator()     // Catch:{ all -> 0x0bfd }
        L_0x0bb0:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0bfd }
            if (r0 == 0) goto L_0x0bec
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x0bfd }
            X.5Gi r0 = (X.C283155Gi) r0     // Catch:{ all -> 0x0bfd }
            int r1 = r0.A00     // Catch:{ all -> 0x0bfd }
            r0 = 1519(0x5ef, float:2.129E-42)
            if (r1 == r0) goto L_0x0bd2
            r0 = 1520(0x5f0, float:2.13E-42)
            if (r1 != r0) goto L_0x0bb0
            X.0Aj r2 = X.JTU.A09(r7)     // Catch:{ all -> 0x0bfd }
            java.lang.String r0 = "af_page"
            r2.AAJ(r8, r0)     // Catch:{ all -> 0x0bfd }
            java.lang.String r1 = "send_key_alert_to_af"
            goto L_0x0bdd
        L_0x0bd2:
            X.0Aj r2 = X.JTU.A09(r7)     // Catch:{ all -> 0x0bfd }
            java.lang.String r0 = "af_page"
            r2.AAJ(r8, r0)     // Catch:{ all -> 0x0bfd }
            java.lang.String r1 = "send_login_alert_to_af"
        L_0x0bdd:
            java.lang.String r0 = "security_alert_action"
            r2.AAJ(r0, r1)     // Catch:{ all -> 0x0bfd }
            boolean r0 = r2.isSampled()     // Catch:{ all -> 0x0bfd }
            if (r0 == 0) goto L_0x0bb0
            r2.Cgf()     // Catch:{ all -> 0x0bfd }
            goto L_0x0bb0
        L_0x0bec:
            long r1 = r14.getId()     // Catch:{ all -> 0x0bfd }
            long r1 = r1 % r12
            int r0 = (int) r1     // Catch:{ all -> 0x0bfd }
            r6.A03(r4, r5, r0)     // Catch:{ all -> 0x0bfd }
            X.0gF r2 = X.C60340gF.A00     // Catch:{ all -> 0x0bfd }
            r3.A05(r4)
            return r2
        L_0x0bfb:
            r0 = move-exception
            goto L_0x0bfe
        L_0x0bfd:
            r0 = move-exception
        L_0x0bfe:
            r3.A05(r4)
            throw r0
        L_0x0c02:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c07:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c0c:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0c14:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c19:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0c1e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c23:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c28:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c2d:
            java.lang.String r0 = "_isLoaded"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0c34:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c39:
            X.0eS.A00(r11)
            java.lang.String r0 = "directShareSheetFragmentViewModel"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MHI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static AnonymousClass07V A00(Object obj, MHI mhi) {
        0eS.A00(obj);
        return ((AnonymousClass07Z) mhi.A02).getLifecycle();
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MHI) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHI(N46 n46, C67751Mu4 mu4, AnonymousClass4D7 r4) {
        super(2, r4);
        this.A04 = 5;
        this.A02 = mu4;
        this.A01 = n46;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHI(Object obj, Object obj2, Object obj3, AnonymousClass4D7 r5, int i) {
        super(2, r5);
        this.A04 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHI(UserSession userSession, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A04 = 49;
        this.A01 = userSession;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHI(Object obj, AnonymousClass4D7 r3, int i) {
        super(2, r3);
        this.A04 = i;
        this.A03 = obj;
    }
}

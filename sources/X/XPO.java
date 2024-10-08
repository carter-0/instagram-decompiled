package X;

import android.os.SystemClock;
import java.util.List;

public final class XPO extends 1P0 {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public static C257793xy A00(YCC ycc, C2592741b r3, AnonymousClass3I2 r4) {
        r3.A0F = r4;
        r3.A0P = Boolean.valueOf(ycc.CRM());
        r3.A0R = ycc.CWm();
        r3.A0W = ycc.Cax();
        r3.A0X = ycc.Cbd();
        r3.A0T = ycc.CZ2();
        r3.A0e = ycc.BJa();
        r3.A0r = ycc.BKL();
        r3.A0t = ycc.BMm();
        r3.A0u = ycc.BMq();
        C257803xz BPl = ycc.BPl();
        if (BPl != null) {
            return BPl.F8Z();
        }
        return null;
    }

    public static 1Xj A01(YCC ycc) {
        return (1Xj) ycc.getItems().get(0);
    }

    public static List A03(YCC ycc, C257603xf r3, C2592741b r4) {
        r4.A01 = r3;
        r4.A0l = ycc.Ajw();
        r4.A10 = ycc.getCookies();
        r4.A0L = ycc.AxE();
        r4.A0n = ycc.Ay5();
        r4.A0o = ycc.getDominantColor();
        r4.A0a = ycc.Ayn();
        List AzY = ycc.AzY();
        if (AzY != null) {
            return CXK.A00(AzY);
        }
        return null;
    }

    public XPO(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    public final void onFail(C268654dm r9) {
        int i;
        int i2;
        int i3;
        int i4;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(1847471291);
                0qQ.A0B(r9, 0);
                XbE xbE = (XbE) this.A01;
                C57342IXz iXz = xbE.A05;
                1XQ r0 = (1XQ) r9.A00();
                if (r0 != null) {
                    i3 = r0.mStatusCode;
                } else {
                    i3 = 0;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime() - xbE.A02;
                IY5 iy5 = (IY5) iXz.A01;
                iy5.A0A.Cgz(i3, iy5.A05, elapsedRealtime);
                iy5.A05 = false;
                i2 = -1828380266;
                break;
            case 1:
                i = AnonymousClass0fD.A03(-650220315);
                0qQ.A0B(r9, 0);
                XER xer = (XER) this.A01;
                C57342IXz iXz2 = xer.A06;
                1XQ r02 = (1XQ) r9.A00();
                if (r02 != null) {
                    i4 = r02.mStatusCode;
                } else {
                    i4 = 0;
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - xer.A02;
                C52490GUs gUs = (C52490GUs) iXz2.A01;
                gUs.A0F.Cgz(i4, gUs.A06, elapsedRealtime2);
                gUs.A06 = false;
                i2 = -344450923;
                break;
            default:
                XPO.super.onFail(r9);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onFinish() {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(-119810626);
                ((IY5) ((XbE) this.A01).A05.A01).A04 = AnonymousClass05K.A00;
                i2 = -724511936;
                break;
            case 1:
                i = AnonymousClass0fD.A03(-410748777);
                ((C52490GUs) ((XER) this.A01).A06.A01).A05 = AnonymousClass05K.A00;
                i2 = 536121261;
                break;
            default:
                XPO.super.onFinish();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onStart() {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(855310970);
                ((XbE) this.A01).A02 = SystemClock.elapsedRealtime();
                i2 = 1532773146;
                break;
            case 1:
                i = AnonymousClass0fD.A03(-67744939);
                ((XER) this.A01).A02 = SystemClock.elapsedRealtime();
                i2 = -223613761;
                break;
            default:
                XPO.super.onStart();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0306, code lost:
        if (r11 != null) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x05ce, code lost:
        X.AnonymousClass0fD.A0A(r0, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x05d1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x060e, code lost:
        X.C41845B3m.A0v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0615, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r34) {
        /*
            r33 = this;
            r11 = r33
            r10 = r34
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x03a1;
                case 1: goto L_0x000d;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.XPO.super.onSuccess(r10)
            return
        L_0x000d:
            r0 = 1471991028(0x57bcccf4, float:4.15176906E14)
            int r15 = X.AnonymousClass0fD.A03(r0)
            X.CEh r10 = (X.C43815CEh) r10
            r0 = -892181765(0xffffffffcad262fb, float:-6893949.5)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r3 = 0
            X.0qQ.A0B(r10, r3)
            X.XES r8 = r10.A00
            if (r8 == 0) goto L_0x060e
            java.lang.Object r7 = r11.A01
            X.XER r7 = (X.XER) r7
            java.lang.Integer r9 = r8.A01
            r6 = 0
            int r0 = X.AnonymousClass7TG.A0A(r9)
            r7.A00 = r0
            X.CEh r0 = r7.A03
            if (r0 != 0) goto L_0x0038
            r7.A03 = r10
        L_0x0038:
            boolean r0 = r11.A02
            r1 = -1
            if (r0 == 0) goto L_0x007d
            java.util.List r0 = r8.A03
            java.lang.Object r0 = X.00k.A0J(r0)
            X.YCC r0 = (X.YCC) r0
            if (r0 == 0) goto L_0x0057
            X.2vp r0 = r0.Ana()
            if (r0 == 0) goto L_0x0057
            java.lang.Integer r0 = r0.BDQ()
            if (r0 == 0) goto L_0x0057
            int r1 = r0.intValue()
        L_0x0057:
            int r5 = r7.A05
            int r5 = r5 + r1
            com.instagram.common.session.UserSession r4 = r7.A07
            X.0Tu r3 = X.0Tu.A05
            r0 = 36597304663149332(0x82050e002f0b14, double:3.207621062268581E-306)
            int r0 = X.DbS.A04(r3, r4, r0)
            int r5 = r5 - r0
            r7.A01 = r5
            if (r9 == 0) goto L_0x0070
            int r6 = r9.intValue()
        L_0x0070:
            r7.A00 = r6
            r0 = 610051799(0x245ca6d7, float:4.7846214E-17)
        L_0x0075:
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = 836114464(0x31d61820, float:6.2309624E-9)
            goto L_0x05ce
        L_0x007d:
            java.lang.Integer r0 = r8.A02
            r1 = 1
            if (r0 == 0) goto L_0x0088
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x008c
        L_0x0088:
            int r0 = r7.A04
            int r0 = r0 + 1
        L_0x008c:
            r7.A01 = r0
            boolean r0 = r7.A0F
            if (r0 == 0) goto L_0x00aa
            java.lang.String r5 = r7.A0A
            if (r5 == 0) goto L_0x00aa
            com.instagram.common.session.UserSession r0 = r7.A07
            X.1Ng r4 = X.AnonymousClass1Nd.A00(r0)
            X.B6l r0 = r8.A00
            if (r0 == 0) goto L_0x00a2
            boolean r1 = r0.A00
        L_0x00a2:
            X.6yS r0 = new X.6yS
            r0.<init>(r1, r5)
            r4.A00(r0)
        L_0x00aa:
            int r0 = r7.A05
            r18 = r0
            X.XES r0 = r10.A00
            if (r0 == 0) goto L_0x060e
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x0371
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r0.iterator()
        L_0x00be:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00d9
            java.lang.Object r1 = r4.next()
            r0 = r1
            X.YCC r0 = (X.YCC) r0
            java.util.List r0 = r0.getItems()
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x00be
            r5.add(r1)
            goto L_0x00be
        L_0x00d9:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r17 = r5.iterator()
        L_0x00e1:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0375
            java.lang.Object r6 = r17.next()
            X.YCC r6 = (X.YCC) r6
            X.GV9 r5 = new X.GV9
            r5.<init>()
            java.lang.String r0 = r6.AZ4()
            r5.A0Z = r0
            java.lang.String r0 = r6.BKL()
            r5.A0g = r0
            java.lang.String r0 = r6.C9L()
            if (r0 != 0) goto L_0x0106
            java.lang.String r0 = ""
        L_0x0106:
            r5.A0l = r0
            java.util.List r0 = r6.BDE()
            r5.A0q = r0
            java.lang.String r0 = r6.AZH()
            r5.A0b = r0
            java.util.List r0 = r6.getCookies()
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            r5.A00 = r0
            X.2vp r0 = r6.Ana()
            if (r0 != 0) goto L_0x0366
            r0 = 0
        L_0x0125:
            r5.A00 = r0
            java.lang.String r0 = r6.BMq()
            r5.A0h = r0
            java.util.List r0 = r6.Abc()
            r5.A0m = r0
            java.lang.Boolean r0 = r6.Cbd()
            r5.A0U = r0
            java.lang.String r0 = r6.Ajw()
            r5.A0d = r0
            java.lang.String r0 = r6.Ac5()
            r5.A0c = r0
            java.util.List r0 = r6.Abc()
            java.util.ArrayList r9 = X.00k.A0U(r0)
            java.util.List r0 = r6.BDE()
            java.util.ArrayList r8 = X.00k.A0U(r0)
            X.41a r12 = A02(r6)
            X.3xf r0 = r6.Aj9()
            r1 = 0
            if (r0 == 0) goto L_0x0363
            X.BE0 r0 = r0.F15()
        L_0x0164:
            java.util.List r0 = A03(r6, r0, r12)
            r12.A12 = r0
            java.lang.String r0 = r6.B44()
            r12.A0p = r0
            java.lang.String r0 = r6.B4S()
            r12.A0q = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r12.A0b = r0
            int r0 = r6.BD8()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.A0c = r0
            r12.A13 = r8
            X.3I2 r0 = r6.BIi()
            if (r0 == 0) goto L_0x0360
            X.3I1 r0 = r0.FG3()
        L_0x0192:
            X.3xy r0 = A00(r6, r12, r0)
            r12.A09 = r0
            java.lang.String r0 = r6.getMediaId()
            r12.A0v = r0
            X.3y4 r8 = r6.BUs()
            if (r8 == 0) goto L_0x035d
            X.1E5 r0 = r7.A08
            X.3y3 r0 = r8.F9K(r0)
        L_0x01aa:
            r12.A0A = r0
            java.lang.String r0 = r6.BZp()
            r12.A0w = r0
            java.lang.String r0 = r6.BaE()
            r12.A0x = r0
            X.3yA r0 = r6.Bl6()
            if (r0 == 0) goto L_0x01c2
            X.3y9 r1 = r0.FGZ()
        L_0x01c2:
            r12.A0G = r1
            boolean r0 = r6.Bv1()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r12.A0Z = r0
            java.lang.String r0 = r6.C9L()
            r12.A0y = r0
            com.instagram.common.session.UserSession r8 = r7.A07
            X.0Tu r11 = X.0Tu.A06
            r0 = 36315829687357022(0x81050e003d0e5e, double:3.0296151541687705E-306)
            boolean r0 = X.182.A06(r11, r8, r0)
            if (r0 == 0) goto L_0x01e9
            X.3xb r0 = r6.AZG()
            r12.A04 = r0
        L_0x01e9:
            X.3lZ r12 = r12.A01()
            boolean r1 = r7.A0D
            java.util.List r0 = r6.getItems()
            int r0 = r0.size()
            r11 = 1
            if (r1 == 0) goto L_0x02e8
            if (r0 == r11) goto L_0x033e
            boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x0258
            X.1Xv r11 = X.1Xj.A0h
            java.lang.String r1 = r6.getMediaId()
            if (r1 != 0) goto L_0x0210
            X.1Xj r0 = A01(r6)
            java.lang.String r1 = r0.getId()
        L_0x0210:
            java.util.List r0 = r6.getItems()
            X.1Xj r11 = r11.A0D(r1, r0)
            if (r11 != 0) goto L_0x026d
            java.util.List r0 = r6.getItems()
            java.lang.Object r11 = r0.get(r3)
            X.1Xj r11 = (X.1Xj) r11
        L_0x0224:
            r5.A0L = r11
            java.lang.String r0 = r6.BaE()
            r5.A0k = r0
            java.lang.String r0 = r6.AYn()
            r5.A0Y = r0
            X.3I2 r0 = r6.BIi()
            r5.A0O = r0
            r6.Ay5()
            java.lang.String r0 = r6.BZp()
            r5.A0a = r0
            java.lang.String r0 = r7.A0A
            r5.A0f = r0
            java.lang.Boolean r0 = r6.Cax()
            boolean r0 = X.AnonymousClass7TG.A1X(r0)
            r5.A0t = r0
            X.GV8 r0 = r5.A01()
            r4.add(r0)
            goto L_0x00e1
        L_0x0258:
            X.1Xj r1 = A01(r6)
            r0 = 0
            X.0qQ.A0B(r1, r11)
            X.1Xj r11 = new X.1Xj
            r11.<init>()
            r11.A3z(r8, r1, r3)
            r11.A0A = r0
            r11.A3x(r8)
        L_0x026d:
            java.util.List r0 = r6.getItems()
            java.util.Iterator r16 = r0.iterator()
        L_0x0275:
            boolean r0 = r16.hasNext()
            r13 = 0
            if (r0 == 0) goto L_0x02a6
            java.lang.Object r1 = r16.next()
            X.1Xj r1 = (X.1Xj) r1
            java.util.List r0 = r1.A3P()
            java.util.ArrayList r14 = X.00k.A0U(r0)
            X.1Xy r0 = r1.A0C
            r0.EOd(r14)
            java.lang.String r14 = r6.BMq()
            X.1Xy r0 = r1.A0C
            if (r14 == 0) goto L_0x039c
            r0.EcC(r14)
            r1.A45(r12)
            X.1Xy r0 = r1.A0C
            r0.ERA(r13)
            r1.A3w(r13)
            goto L_0x0275
        L_0x02a6:
            X.1Xy r0 = r11.A0C
            r0.ERD(r13)
            X.0Tu r14 = X.0Tu.A05
            r0 = 36319836887850669(0x8108b300001ead, double:3.032149323896654E-306)
            boolean r0 = X.182.A06(r14, r8, r0)
            if (r0 != 0) goto L_0x02c9
            X.1Xj r0 = A01(r6)
            X.1Xy r0 = r0.A0C
            java.lang.String r0 = r0.Am1()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r11.A4G(r0)
        L_0x02c9:
            X.1iA r0 = X.1iA.A09
            r11.A4A(r0)
            java.util.List r1 = r6.getItems()
            X.1Xy r0 = r11.A0C
            r0.ERA(r1)
            r11.A3w(r13)
            X.XER.A00(r6, r11, r12, r7, r9)
            boolean r0 = r7.A0E
            if (r0 == 0) goto L_0x0224
            X.1E8 r0 = r7.A09
            r0.A01(r11, r3, r3)
            goto L_0x0224
        L_0x02e8:
            if (r0 == r11) goto L_0x033e
            boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x0328
            X.1Xv r11 = X.1Xj.A0h
            java.lang.String r1 = r6.getMediaId()
            if (r1 != 0) goto L_0x02fe
            X.1Xj r0 = A01(r6)
            java.lang.String r1 = r0.getId()
        L_0x02fe:
            java.util.List r0 = r6.getItems()
            X.1Xj r11 = r11.A0D(r1, r0)
            if (r11 == 0) goto L_0x033e
        L_0x0308:
            java.util.List r0 = r6.getItems()
            java.util.Iterator r13 = r0.iterator()
        L_0x0310:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0343
            java.lang.Object r1 = r13.next()
            X.1Xj r1 = (X.1Xj) r1
            java.util.List r0 = r1.A3P()
            java.util.ArrayList r0 = X.00k.A0U(r0)
            X.XER.A00(r6, r1, r12, r7, r0)
            goto L_0x0310
        L_0x0328:
            X.1Xj r1 = A01(r6)
            r0 = 0
            X.0qQ.A0B(r1, r11)
            X.1Xj r11 = new X.1Xj
            r11.<init>()
            r11.A3z(r8, r1, r3)
            r11.A0A = r0
            r11.A3x(r8)
            goto L_0x0308
        L_0x033e:
            X.1Xj r11 = A01(r6)
            goto L_0x0358
        L_0x0343:
            X.1iA r0 = X.1iA.A09
            r11.A4A(r0)
            java.util.List r1 = r6.getItems()
            X.1Xy r0 = r11.A0C
            r0.ERA(r1)
            r0 = 0
            r11.A3w(r0)
            r11.A3w(r8)
        L_0x0358:
            X.XER.A00(r6, r11, r12, r7, r9)
            goto L_0x0224
        L_0x035d:
            r0 = r1
            goto L_0x01aa
        L_0x0360:
            r0 = r1
            goto L_0x0192
        L_0x0363:
            r0 = r1
            goto L_0x0164
        L_0x0366:
            X.2vo r1 = r0.FGd()
            X.2vm r0 = new X.2vm
            r0.<init>(r1)
            goto L_0x0125
        L_0x0371:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
        L_0x0375:
            X.IXz r6 = r7.A06
            int r5 = r10.mStatusCode
            long r11 = android.os.SystemClock.elapsedRealtime()
            long r0 = r7.A02
            long r11 = r11 - r0
            java.lang.Object r1 = r6.A01
            X.GUs r1 = (X.C52490GUs) r1
            X.2vG r7 = r1.A0F
            boolean r0 = r1.A06
            X.4LN r8 = X.AnonymousClass4LN.A0D
            r9 = r4
            r10 = r5
            r13 = r0
            r7.Ch2(r8, r9, r10, r11, r13)
            r1.A06 = r3
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r6.Dlz(r0, r4)
            r0 = -1995620078(0xffffffff890d4112, float:-1.7002854E-33)
            goto L_0x0075
        L_0x039c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x03a1:
            r0 = 1178786281(0x4642d9e9, float:12470.478)
            int r15 = X.AnonymousClass0fD.A03(r0)
            X.CEh r10 = (X.C43815CEh) r10
            r0 = -1083999129(0xffffffffbf637c67, float:-0.888617)
            int r17 = X.AnonymousClass0fD.A03(r0)
            r8 = 0
            X.0qQ.A0B(r10, r8)
            X.XES r9 = r10.A00
            if (r9 == 0) goto L_0x060e
            java.lang.Object r7 = r11.A01
            X.XbE r7 = (X.XbE) r7
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = r9.A03
            r32 = r0
            java.util.Iterator r16 = r32.iterator()
        L_0x03c9:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0585
            java.lang.Object r13 = r16.next()
            X.YCC r13 = (X.YCC) r13
            X.GV9 r12 = new X.GV9
            r12.<init>()
            java.lang.String r0 = r13.AZ4()
            r12.A0Z = r0
            java.lang.String r0 = r13.BKL()
            r12.A0g = r0
            java.lang.String r0 = r13.C9L()
            if (r0 != 0) goto L_0x03ee
            java.lang.String r0 = ""
        L_0x03ee:
            r12.A0l = r0
            java.util.List r0 = r13.BDE()
            r12.A0q = r0
            java.lang.String r0 = r13.AZH()
            r12.A0b = r0
            java.util.List r0 = r13.getCookies()
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            r12.A00 = r0
            X.2vp r0 = r13.Ana()
            r5 = 0
            if (r0 == 0) goto L_0x0581
            X.2vo r20 = r0.FGd()
        L_0x0411:
            r27 = 16382(0x3ffe, float:2.2956E-41)
            X.2vl r0 = new X.2vl
            r19 = r5
            r21 = r5
            r22 = r8
            r23 = r8
            r24 = r8
            r25 = r8
            r26 = r8
            r28 = r8
            r29 = r8
            r30 = r8
            r31 = r8
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r12.A00 = r0
            java.lang.String r0 = r13.BMq()
            r12.A0h = r0
            java.util.List r0 = r13.Abc()
            r12.A0m = r0
            java.lang.Boolean r0 = r13.Cbd()
            r12.A0U = r0
            java.lang.String r0 = r13.Ajw()
            r12.A0d = r0
            java.lang.String r0 = r13.Ac5()
            r12.A0c = r0
            java.util.List r0 = r13.getItems()
            int r0 = r0.size()
            r14 = 1
            if (r0 <= r14) goto L_0x046b
            X.1Xv r2 = X.1Xj.A0h
            java.lang.String r1 = r13.getMediaId()
            java.util.List r0 = r13.getItems()
            X.1Xj r4 = r2.A0D(r1, r0)
            if (r4 != 0) goto L_0x046f
        L_0x046b:
            X.1Xj r4 = A01(r13)
        L_0x046f:
            X.41a r3 = A02(r13)
            X.3xf r0 = r13.Aj9()
            r2 = 0
            if (r0 == 0) goto L_0x057e
            X.BE0 r0 = r0.F15()
        L_0x047e:
            java.util.List r0 = A03(r13, r0, r3)
            r3.A12 = r0
            java.lang.String r0 = r13.B44()
            r3.A0p = r0
            java.lang.String r0 = r13.B4S()
            r3.A0q = r0
            int r0 = r7.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0b = r0
            int r0 = r13.BD8()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0c = r0
            java.util.List r0 = r13.BDE()
            java.util.ArrayList r0 = X.00k.A0U(r0)
            r3.A13 = r0
            X.3I2 r0 = r13.BIi()
            if (r0 == 0) goto L_0x057b
            X.3I1 r0 = r0.FG3()
        L_0x04b6:
            X.3xy r0 = A00(r13, r3, r0)
            r3.A09 = r0
            java.lang.String r0 = r13.getMediaId()
            r3.A0v = r0
            X.3y4 r1 = r13.BUs()
            if (r1 == 0) goto L_0x0578
            X.1E5 r0 = r7.A07
            X.3y3 r0 = r1.F9K(r0)
        L_0x04ce:
            r3.A0A = r0
            java.lang.String r0 = r13.BZp()
            r3.A0w = r0
            java.lang.String r0 = r13.BaE()
            r3.A0x = r0
            X.3yA r0 = r13.Bl6()
            if (r0 == 0) goto L_0x04e6
            X.3y9 r2 = r0.FGZ()
        L_0x04e6:
            r3.A0G = r2
            boolean r0 = r13.Bv1()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A0Z = r0
            java.lang.String r0 = r13.C9L()
            r3.A0y = r0
            X.3lY r0 = r3.A00()
            r4.A45(r0)
            r12.A0L = r4
            java.lang.String r0 = r13.BaE()
            r12.A0k = r0
            java.lang.String r0 = r13.AYn()
            r12.A0Y = r0
            X.3I2 r0 = r13.BIi()
            if (r0 == 0) goto L_0x0576
            X.3I1 r0 = r0.FG3()
        L_0x0517:
            r12.A0O = r0
            r13.Ay5()
            java.lang.String r0 = r13.BZp()
            r12.A0a = r0
            java.lang.String r0 = r7.A08
            r12.A0f = r0
            java.lang.Boolean r0 = r13.Cax()
            boolean r0 = X.AnonymousClass7TG.A1X(r0)
            r12.A0t = r0
            java.util.List r0 = r13.getItems()
            int r0 = r0.size()
            if (r0 <= r14) goto L_0x0550
            X.1iA r0 = X.1iA.A09
            r12.A0M = r0
            java.util.List r0 = r13.getItems()
            r12.A0n = r0
            X.3yN r0 = r13.Am3()
            if (r0 == 0) goto L_0x054e
            X.493 r5 = r0.F1F()
        L_0x054e:
            r12.A05 = r5
        L_0x0550:
            X.GV8 r0 = r12.A01()
            X.4bN r2 = X.C295375o3.A03(r0)
            X.2vp r0 = r13.Ana()
            if (r0 == 0) goto L_0x0573
            X.2vo r20 = r0.FGd()
        L_0x0562:
            X.2vl r1 = new X.2vl
            r18 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.9Ie r0 = new X.9Ie
            r0.<init>(r2, r1)
            r6.add(r0)
            goto L_0x03c9
        L_0x0573:
            r20 = 0
            goto L_0x0562
        L_0x0576:
            r0 = r5
            goto L_0x0517
        L_0x0578:
            r0 = r5
            goto L_0x04ce
        L_0x057b:
            r0 = r5
            goto L_0x04b6
        L_0x057e:
            r0 = r5
            goto L_0x047e
        L_0x0581:
            r20 = r5
            goto L_0x0411
        L_0x0585:
            java.lang.Integer r0 = r9.A01
            int r0 = X.AnonymousClass7TG.A0A(r0)
            r7.A00 = r0
            X.CEh r0 = r7.A03
            if (r0 != 0) goto L_0x0593
            r7.A03 = r10
        L_0x0593:
            boolean r0 = r11.A02
            r1 = -1
            if (r0 == 0) goto L_0x05d2
            java.lang.Object r0 = X.00k.A0J(r32)
            X.YCC r0 = (X.YCC) r0
            if (r0 == 0) goto L_0x05b0
            X.2vp r0 = r0.Ana()
            if (r0 == 0) goto L_0x05b0
            java.lang.Integer r0 = r0.BDQ()
            if (r0 == 0) goto L_0x05b0
            int r1 = r0.intValue()
        L_0x05b0:
            int r4 = r7.A04
            int r4 = r4 + r1
            com.instagram.common.session.UserSession r3 = r7.A06
            X.0Tu r2 = X.0Tu.A05
            r0 = 36602205218017883(0x8209830004125b, double:3.210720192900403E-306)
            int r0 = X.DbS.A04(r2, r3, r0)
            int r4 = r4 - r0
            r7.A01 = r4
            r1 = -1204960368(0xffffffffb82dc390, float:-4.1428546E-5)
        L_0x05c6:
            r0 = r17
            X.AnonymousClass0fD.A0A(r1, r0)
            r0 = -1831508438(0xffffffff92d5662a, float:-1.3467375E-27)
        L_0x05ce:
            X.AnonymousClass0fD.A0A(r0, r15)
            return
        L_0x05d2:
            java.lang.Integer r0 = r9.A02
            if (r0 == 0) goto L_0x05dc
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x05e0
        L_0x05dc:
            int r0 = r7.A04
            int r0 = r0 + 1
        L_0x05e0:
            r7.A01 = r0
            X.IXz r4 = r7.A05
            int r3 = r10.mStatusCode
            long r22 = android.os.SystemClock.elapsedRealtime()
            long r0 = r7.A02
            long r22 = r22 - r0
            java.lang.Object r2 = r4.A01
            X.IY5 r2 = (X.IY5) r2
            X.2vI r1 = r2.A0A
            boolean r0 = r2.A05
            X.4LN r19 = X.AnonymousClass4LN.A0D
            r18 = r1
            r20 = r6
            r21 = r3
            r24 = r0
            r18.Ch2(r19, r20, r21, r22, r24)
            r2.A05 = r8
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r4.Dlz(r0, r6)
            r1 = -1192178440(0xffffffffb8f0ccf8, float:-1.148227E-4)
            goto L_0x05c6
        L_0x060e:
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XPO.onSuccess(java.lang.Object):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.41b, X.41a] */
    public static C2592641a A02(YCC ycc) {
        ? r1 = new C2592741b(C41916B6o.A00());
        r1.A0f = ycc.AYn();
        r1.A0g = ycc.AYt();
        r1.A0h = ycc.AZ4();
        r1.A0i = ycc.AZH();
        r1.A0k = ycc.Ac5();
        return r1;
    }
}

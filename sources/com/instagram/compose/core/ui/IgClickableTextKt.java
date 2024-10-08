package com.instagram.compose.core.ui;

import X.0sP;
import X.AnonymousClass5Z4;
import X.AnonymousClass5ZD;
import X.C286025Tq;
import X.C286575Wy;
import X.C291715hl;
import X.C304516Dt;
import androidx.compose.ui.Modifier;

public abstract class IgClickableTextKt {
    public static final void A02(C286575Wy r21, Modifier modifier, C286025Tq r23, AnonymousClass5Z4 r24, 0sP r25, int i, int i2, int i3, int i4, long j) {
        A01(r21, modifier, r23, r24, (C291715hl) null, (AnonymousClass5ZD) null, (0sP) null, r25, (0sP) null, (C304516Dt) null, i, 0, 0, 0, i2, i3, i4, j, 0, false, false);
    }

    public static final void A03(C286575Wy r21, Modifier modifier, C286025Tq r23, AnonymousClass5Z4 r24, 0sP r25, int i, int i2, long j) {
        A01(r21, modifier, r23, r24, (C291715hl) null, (AnonymousClass5ZD) null, (0sP) null, r25, (0sP) null, (C304516Dt) null, 0, 0, 0, 0, i, 0, i2, j, 0, false, false);
    }

    public static final void A04(C286575Wy r21, Modifier modifier, C286025Tq r23, AnonymousClass5Z4 r24, 0sP r25, int i, int i2, long j) {
        A01(r21, modifier, r23, r24, (C291715hl) null, (AnonymousClass5ZD) null, (0sP) null, r25, (0sP) null, (C304516Dt) null, i, 0, 0, 0, 0, i2, 112568, j, 0, false, false);
    }

    public static final void A05(C286575Wy r21, Modifier modifier, C286025Tq r23, AnonymousClass5Z4 r24, 0sP r25, int i, long j) {
        A01(r21, modifier, r23, r24, (C291715hl) null, (AnonymousClass5ZD) null, (0sP) null, r25, (0sP) null, (C304516Dt) null, 0, 0, 0, 0, 0, 0, i, j, 0, false, false);
    }

    public static final void A06(C286575Wy r21, Modifier modifier, C286025Tq r23, AnonymousClass5Z4 r24, 0sP r25, long j) {
        A01(r21, modifier, r23, r24, (C291715hl) null, (AnonymousClass5ZD) null, (0sP) null, r25, (0sP) null, (C304516Dt) null, 3, 0, 0, 0, 0, 0, 112568, j, 0, false, false);
    }

    public static final void A07(C286575Wy r21, Modifier modifier, C286025Tq r23, AnonymousClass5Z4 r24, 0sP r25, long j) {
        A01(r21, modifier, r23, r24, (C291715hl) null, (AnonymousClass5ZD) null, (0sP) null, r25, (0sP) null, (C304516Dt) null, 3, 0, 0, 0, 48, 0, 112568, j, 0, false, false);
    }

    public static final void A08(C286575Wy r21, Modifier modifier, C286025Tq r23, AnonymousClass5Z4 r24, 0sP r25, long j) {
        A01(r21, modifier, r23, r24, (C291715hl) null, (AnonymousClass5ZD) null, (0sP) null, r25, (0sP) null, (C304516Dt) null, 0, 0, 0, 0, 48, 0, 112632, j, 0, false, false);
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.JUG, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033 A[LOOP:0: B:10:0x0031->B:11:0x0033, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069 A[SYNTHETIC] */
    public static final java.lang.Object A00(X.AnonymousClass6GK r7, X.AnonymousClass4D7 r8) {
        /*
            r3 = 41
            boolean r0 = X.JUG.A03(r3, r8)
            if (r0 == 0) goto L_0x0063
            r6 = r8
            X.JUG r6 = (X.JUG) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0063
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A02
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x0053
            if (r0 != r4) goto L_0x006c
            java.lang.Object r7 = r6.A01
            X.6GK r7 = (X.AnonymousClass6GK) r7
            X.0eS.A00(r1)
        L_0x0028:
            X.6Ft r1 = (X.C304926Ft) r1
            java.util.List r3 = r1.A03
            int r2 = r3.size()
            r1 = 0
        L_0x0031:
            if (r1 >= r2) goto L_0x003f
            java.lang.Object r0 = r3.get(r1)
            X.GPU r0 = (X.GPU) r0
            r0.A01()
            int r1 = r1 + 1
            goto L_0x0031
        L_0x003f:
            int r2 = r3.size()
            r1 = 0
        L_0x0044:
            if (r1 >= r2) goto L_0x0069
            java.lang.Object r0 = r3.get(r1)
            X.GPU r0 = (X.GPU) r0
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x0056
            int r1 = r1 + 1
            goto L_0x0044
        L_0x0053:
            X.0eS.A00(r1)
        L_0x0056:
            r6.A01 = r7
            r6.A00 = r4
            X.GWN r0 = X.GWN.Main
            java.lang.Object r1 = r7.AD0(r0, r6)
            if (r1 != r5) goto L_0x0028
            return r5
        L_0x0063:
            X.JUG r6 = new X.JUG
            r6.<init>(r3, r8)
            goto L_0x0016
        L_0x0069:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x006c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.compose.core.ui.IgClickableTextKt.A00(X.6GK, X.4D7):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: X.9KR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v4, resolved type: X.9KR} */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01e1, code lost:
        if (r11 == r12) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01e3, code lost:
        r40 = new X.AnonymousClass9KR(r6, r42, (X.AnonymousClass4D7) null, r37, r57, r31);
        r3.FLL(r40);
        r40 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01f7, code lost:
        X.C286565Wx.A0L(r7, false);
        r14 = X.C304916Fs.A00(r13, r57, (X.0sL) r11);
        r3.ExS(-392672560);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x020c, code lost:
        if (r18 == 16) goto L_0x02c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x020e, code lost:
        r51 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0210, code lost:
        X.C286565Wx.A0L(r7, false);
        r10 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.A01;
        r42 = X.C291515hR.A00((android.content.Context) X.C286615Xc.A01(r10, X.C286565Wx.A04(r7)), r58, r8);
        r41 = r24.Ezh(r14);
        r10 = (android.content.Context) X.C286615Xc.A01(r10, X.C286565Wx.A04(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0235, code lost:
        if (r38 != null) goto L_0x02c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0237, code lost:
        r11 = r8.A02.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x023b, code lost:
        r43 = X.AnonymousClass5Z4.A01(new X.AnonymousClass5Z2(), r8, X.C291515hR.A01(r10, r11), r39, r38, r36, 0, 3112912, r51, r16, 0);
        r3.ExS(-392643421);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0263, code lost:
        if ((r4 & 896) == 256) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0265, code lost:
        r25 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0267, code lost:
        r10 = r3.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x026b, code lost:
        if (r25 != false) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x026d, code lost:
        if (r10 != r12) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x026f, code lost:
        r10 = new X.C377469Ly(r6, r23, 44);
        r3.FLL(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x027b, code lost:
        X.C286565Wx.A0L(r7, false);
        r40 = r3;
        r44 = r22;
        r45 = (X.0sP) r10;
        r46 = r33;
        r47 = r34;
        r48 = r35;
        X.C291525hS.A02(r40, r41, r42, r43, r44, r45, r46, r47, r48, ((r4 << 15) & 234881024) | ((((((r4 << 12) & 57344) | 805306368) | ((r0 >> 6) & 458752)) | ((r0 >> 9) & 3670016)) | ((r0 >> 3) & 29360128)), 0, r32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02ba, code lost:
        if (X.0fL.A02() == false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02bc, code lost:
        X.0fL.A00(-2098739169);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02c4, code lost:
        r11 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02c8, code lost:
        r3.ExS(-392671545);
        r51 = r8.A02.A0C.Aoz();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02d8, code lost:
        if (r51 != 16) goto L_0x02fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02da, code lost:
        r51 = X.C285595Rx.A02(X.AnonymousClass5RX.A0K[(int) (((X.AnonymousClass5RW) X.C286615Xc.A01(X.C304856Fm.A00, X.C286565Wx.A04(r7))).A00 & 63)], X.AnonymousClass5RW.A03(((X.AnonymousClass5RW) X.C286615Xc.A01(X.C304856Fm.A00, X.C286565Wx.A04(r7))).A00), X.AnonymousClass5RW.A02(((X.AnonymousClass5RW) X.C286615Xc.A01(X.C304856Fm.A00, X.C286565Wx.A04(r7))).A00), X.AnonymousClass5RW.A01(((X.AnonymousClass5RW) X.C286615Xc.A01(X.C304856Fm.A00, X.C286565Wx.A04(r7))).A00), ((java.lang.Number) X.C286615Xc.A01(X.AnonymousClass6CK.A00, X.C286565Wx.A04(r7))).floatValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02fc, code lost:
        X.C286565Wx.A0L(r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        if (r5 == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d6, code lost:
        if (r3.AGu(r8) == false) goto L_0x00d8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r40, androidx.compose.ui.Modifier r41, X.C286025Tq r42, X.AnonymousClass5Z4 r43, X.C291715hl r44, X.AnonymousClass5ZD r45, X.0sP r46, X.0sP r47, X.0sP r48, X.C304516Dt r49, int r50, int r51, int r52, int r53, int r54, int r55, int r56, long r57, long r59, boolean r61, boolean r62) {
        /*
            r31 = r62
            r37 = r48
            r18 = r57
            r16 = r59
            r39 = r44
            r38 = r45
            r36 = r50
            r32 = r61
            r35 = r51
            r34 = r52
            r8 = r43
            r24 = r41
            r33 = r53
            r23 = r46
            r22 = r49
            r9 = 0
            r58 = r42
            r0 = r58
            X.0qQ.A0B(r0, r9)
            r1 = 14
            r57 = r47
            r0 = r57
            X.0qQ.A0B(r0, r1)
            r0 = 218064099(0xcff64e3, float:3.934969E-31)
            r3 = r40
            r3.ExV(r0)
            r1 = r56
            r0 = r56 & 1
            r2 = r54
            if (r0 == 0) goto L_0x042f
            r0 = r54 | 6
        L_0x0041:
            r30 = r56 & 2
            if (r30 == 0) goto L_0x041c
            r0 = r0 | 48
        L_0x0047:
            r29 = r56 & 4
            if (r29 == 0) goto L_0x0409
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x004d:
            r28 = r56 & 8
            r21 = 1024(0x400, float:1.435E-42)
            if (r28 == 0) goto L_0x03f6
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0055:
            r27 = r56 & 16
            r20 = 8192(0x2000, float:1.14794E-41)
            if (r27 == 0) goto L_0x03e3
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x005d:
            r26 = r56 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r26 == 0) goto L_0x03d0
            r0 = r0 | r15
        L_0x0064:
            r25 = 1572864(0x180000, float:2.204052E-39)
            r4 = r54 & r25
            if (r4 != 0) goto L_0x007b
            r4 = r56 & 64
            if (r4 != 0) goto L_0x0078
            r4 = r36
            boolean r5 = r3.AGs(r4)
            r4 = 1048576(0x100000, float:1.469368E-39)
            if (r5 != 0) goto L_0x007a
        L_0x0078:
            r4 = 524288(0x80000, float:7.34684E-40)
        L_0x007a:
            r0 = r0 | r4
        L_0x007b:
            r13 = r1 & 128(0x80, float:1.794E-43)
            r5 = 12582912(0xc00000, float:1.7632415E-38)
            if (r13 != 0) goto L_0x0091
            r4 = r54 & r5
            if (r4 != 0) goto L_0x0092
            r4 = r32
            boolean r4 = r3.AGv(r4)
            r5 = 4194304(0x400000, float:5.877472E-39)
            if (r4 == 0) goto L_0x0091
            r5 = 8388608(0x800000, float:1.17549435E-38)
        L_0x0091:
            r0 = r0 | r5
        L_0x0092:
            r12 = r1 & 256(0x100, float:3.59E-43)
            r5 = 100663296(0x6000000, float:2.4074124E-35)
            if (r12 != 0) goto L_0x00a8
            r4 = r54 & r5
            if (r4 != 0) goto L_0x00a9
            r4 = r35
            boolean r4 = r3.AGs(r4)
            r5 = 33554432(0x2000000, float:9.403955E-38)
            if (r4 == 0) goto L_0x00a8
            r5 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x00a8:
            r0 = r0 | r5
        L_0x00a9:
            r11 = r1 & 512(0x200, float:7.175E-43)
            r4 = 805306368(0x30000000, float:4.656613E-10)
            if (r11 != 0) goto L_0x00bf
            r4 = r54 & r4
            if (r4 != 0) goto L_0x00c0
            r4 = r34
            boolean r5 = r3.AGs(r4)
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            if (r5 == 0) goto L_0x00bf
            r4 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x00bf:
            r0 = r0 | r4
        L_0x00c0:
            r10 = r1 & 1024(0x400, float:1.435E-42)
            r5 = r55
            if (r10 == 0) goto L_0x03bb
            r4 = r55 | 6
        L_0x00c8:
            r6 = r55 & 48
            if (r6 != 0) goto L_0x00db
            r6 = r1 & 2048(0x800, float:2.87E-42)
            if (r6 != 0) goto L_0x00d8
            boolean r7 = r3.AGu(r8)
            r6 = 32
            if (r7 != 0) goto L_0x00da
        L_0x00d8:
            r6 = 16
        L_0x00da:
            r4 = r4 | r6
        L_0x00db:
            r7 = r1 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x03a8
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x00e1:
            r14 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x0396
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x00e7:
            r6 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r6 == 0) goto L_0x0384
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x00ed:
            r21 = 32768(0x8000, float:4.5918E-41)
            r21 = r21 & r56
            if (r21 == 0) goto L_0x0371
            r4 = r4 | r15
        L_0x00f5:
            r6 = 65536(0x10000, float:9.18355E-41)
            r20 = r56 & r6
            if (r20 == 0) goto L_0x035e
            r4 = r4 | r25
        L_0x00fd:
            r6 = 306783379(0x12492493, float:6.34695E-28)
            r15 = r0 & r6
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r15 != r6) goto L_0x0151
            r15 = 599187(0x92493, float:8.3964E-40)
            r15 = r15 & r4
            r6 = 599186(0x92492, float:8.39638E-40)
            if (r15 != r6) goto L_0x0151
            boolean r6 = r3.Bwn()
            if (r6 == 0) goto L_0x0151
            r3.Evl()
        L_0x0119:
            X.5Xd r3 = r3.ASQ()
            if (r3 == 0) goto L_0x0150
            X.JDU r0 = new X.JDU
            r40 = r0
            r41 = r24
            r42 = r58
            r43 = r8
            r44 = r39
            r45 = r38
            r46 = r23
            r47 = r57
            r48 = r37
            r49 = r22
            r50 = r36
            r51 = r35
            r52 = r34
            r53 = r33
            r54 = r2
            r55 = r5
            r56 = r1
            r57 = r18
            r59 = r16
            r61 = r32
            r62 = r31
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r59, r61, r62)
            r3.A06 = r0
        L_0x0150:
            return
        L_0x0151:
            r3.Ewr()
            r6 = r54 & 1
            r25 = 1
            if (r6 == 0) goto L_0x0301
            boolean r6 = r3.Aw3()
            if (r6 != 0) goto L_0x0301
            r3.Evl()
            r6 = r56 & 64
            if (r6 == 0) goto L_0x016b
            r6 = -3670017(0xffffffffffc7ffff, float:NaN)
            r0 = r0 & r6
        L_0x016b:
            r6 = r1 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0171
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0171:
            r3.ASM()
            boolean r6 = X.0fL.A02()
            if (r6 == 0) goto L_0x0182
            r7 = -493759226(0xffffffffe291d506, float:-1.3450639E21)
            java.lang.String r6 = "com.instagram.compose.core.ui.IgClickableText (IgClickableText.kt:63)"
            X.0fL.A01(r7, r6)
        L_0x0182:
            r6 = -392736267(0xffffffffe89751f5, float:-5.7167134E24)
            r3.ExS(r6)
            java.lang.Object r6 = r3.ECw()
            java.lang.Object r12 = X.AnonymousClass5XT.A00
            if (r6 != r12) goto L_0x01a5
            r10 = 0
            X.5Or r7 = X.C284885Or.A00
            java.lang.String r6 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>"
            X.0qQ.A0C(r7, r6)
            X.0eM r6 = X.C284905Ot.A01
            androidx.compose.runtime.ParcelableSnapshotMutableState r6 = new androidx.compose.runtime.ParcelableSnapshotMutableState
            r6.<init>(r7, r10)
            r7 = r3
            X.5Wx r7 = (X.C286565Wx) r7
            r7.A0Q(r6)
        L_0x01a5:
            X.5Oz r6 = (X.C284945Oz) r6
            r7 = r3
            X.5Wx r7 = (X.C286565Wx) r7
            X.C286565Wx.A0L(r7, r9)
            X.5Qk r13 = androidx.compose.ui.Modifier.A00
            r10 = -392730829(0xffffffffe8976733, float:-5.719848E24)
            r3.ExS(r10)
            r11 = 3670016(0x380000, float:5.142788E-39)
            r11 = r11 & r4
            r10 = 1048576(0x100000, float:1.469368E-39)
            r15 = 0
            if (r11 != r10) goto L_0x01be
            r15 = 1
        L_0x01be:
            r11 = r0 & 14
            r10 = 4
            r14 = 0
            if (r11 != r10) goto L_0x01c5
            r14 = 1
        L_0x01c5:
            r15 = r15 | r14
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r4
            r10 = 131072(0x20000, float:1.83671E-40)
            r14 = 0
            if (r11 != r10) goto L_0x01cf
            r14 = 1
        L_0x01cf:
            r15 = r15 | r14
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r4
            r10 = 16384(0x4000, float:2.2959E-41)
            r14 = 0
            if (r11 != r10) goto L_0x01da
            r14 = 1
        L_0x01da:
            r15 = r15 | r14
            java.lang.Object r11 = r3.ECw()
            if (r15 != 0) goto L_0x01e3
            if (r11 != r12) goto L_0x01f7
        L_0x01e3:
            r43 = 0
            X.9KR r11 = new X.9KR
            r40 = r11
            r41 = r6
            r44 = r37
            r45 = r57
            r46 = r31
            r40.<init>((X.C284945Oz) r41, (X.C286025Tq) r42, (X.AnonymousClass4D7) r43, (X.0sP) r44, (X.0sP) r45, (boolean) r46)
            r3.FLL(r11)
        L_0x01f7:
            X.0sL r11 = (X.0sL) r11
            X.C286565Wx.A0L(r7, r9)
            r10 = r57
            androidx.compose.ui.Modifier r14 = X.C304916Fs.A00(r13, r10, r11)
            r10 = -392672560(0xffffffffe8984ad0, float:-5.753438E24)
            r3.ExS(r10)
            r20 = 16
            int r10 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r10 == 0) goto L_0x02c8
            r51 = r18
        L_0x0210:
            X.C286565Wx.A0L(r7, r9)
            X.4bM r10 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.A01
            X.5RM r11 = X.C286565Wx.A04(r7)
            java.lang.Object r13 = X.C286615Xc.A01(r10, r11)
            android.content.Context r13 = (android.content.Context) r13
            r11 = r58
            X.5Tq r42 = X.C291515hR.A00(r13, r11, r8)
            r11 = r24
            androidx.compose.ui.Modifier r41 = r11.Ezh(r14)
            X.5RM r11 = X.C286565Wx.A04(r7)
            java.lang.Object r10 = X.C286615Xc.A01(r10, r11)
            android.content.Context r10 = (android.content.Context) r10
            if (r38 != 0) goto L_0x02c4
            X.5ZB r11 = r8.A02
            X.5ZD r11 = r11.A08
        L_0x023b:
            X.4dQ r45 = X.C291515hR.A01(r10, r11)
            X.5Z2 r43 = new X.5Z2
            r43.<init>()
            r55 = 0
            r50 = 3112912(0x2f7fd0, float:4.362119E-39)
            r44 = r8
            r46 = r39
            r47 = r38
            r48 = r36
            r49 = r9
            r53 = r16
            X.5Z4 r43 = X.AnonymousClass5Z4.A01(r43, r44, r45, r46, r47, r48, r49, r50, r51, r53, r55)
            r10 = -392643421(0xffffffffe898bca3, float:-5.7702355E24)
            r3.ExS(r10)
            r11 = r4 & 896(0x380, float:1.256E-42)
            r10 = 256(0x100, float:3.59E-43)
            if (r11 == r10) goto L_0x0267
            r25 = 0
        L_0x0267:
            java.lang.Object r10 = r3.ECw()
            if (r25 != 0) goto L_0x026f
            if (r10 != r12) goto L_0x027b
        L_0x026f:
            r12 = 44
            X.9Ly r10 = new X.9Ly
            r11 = r23
            r10.<init>((X.C284945Oz) r6, (X.0sP) r11, (int) r12)
            r3.FLL(r10)
        L_0x027b:
            X.0sP r10 = (X.0sP) r10
            X.C286565Wx.A0L(r7, r9)
            r7 = 805306368(0x30000000, float:4.656613E-10)
            r6 = 57344(0xe000, float:8.0356E-41)
            int r11 = r4 << 12
            r11 = r11 & r6
            r11 = r11 | r7
            r7 = 458752(0x70000, float:6.42848E-40)
            int r6 = r0 >> 6
            r6 = r6 & r7
            r11 = r11 | r6
            r7 = 3670016(0x380000, float:5.142788E-39)
            int r6 = r0 >> 9
            r6 = r6 & r7
            r11 = r11 | r6
            r6 = 29360128(0x1c00000, float:7.052966E-38)
            int r0 = r0 >> 3
            r0 = r0 & r6
            r11 = r11 | r0
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            int r49 = r4 << 15
            r49 = r49 & r0
            r49 = r49 | r11
            r40 = r3
            r44 = r22
            r45 = r10
            r46 = r33
            r47 = r34
            r48 = r35
            r50 = r9
            r51 = r32
            X.C291525hS.A02(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0119
            r0 = -2098739169(0xffffffff82e7c81f, float:-3.4057263E-37)
            X.0fL.A00(r0)
            goto L_0x0119
        L_0x02c4:
            r11 = r38
            goto L_0x023b
        L_0x02c8:
            r10 = -392671545(0xffffffffe8984ec7, float:-5.754023E24)
            r3.ExS(r10)
            X.5ZB r10 = r8.A02
            X.5ZA r10 = r10.A0C
            long r51 = r10.Aoz()
            int r10 = (r51 > r20 ? 1 : (r51 == r20 ? 0 : -1))
            if (r10 != 0) goto L_0x02fc
            X.4bM r11 = X.C304856Fm.A00
            X.5RM r10 = X.C286565Wx.A04(r7)
            java.lang.Object r10 = X.C286615Xc.A01(r11, r10)
            X.5RW r10 = (X.AnonymousClass5RW) r10
            long r10 = r10.A00
            X.4bM r15 = X.AnonymousClass6CK.A00
            X.5RM r13 = X.C286565Wx.A04(r7)
            java.lang.Object r13 = X.C286615Xc.A01(r15, r13)
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            long r51 = X.C285595Rx.A02(X.AnonymousClass5RX.A0K[(int) (r10 & 63)], X.AnonymousClass5RW.A03(r10), X.AnonymousClass5RW.A02(r10), X.AnonymousClass5RW.A01(r10), r13)
        L_0x02fc:
            X.C286565Wx.A0L(r7, r9)
            goto L_0x0210
        L_0x0301:
            if (r30 == 0) goto L_0x0305
            X.5Qk r24 = androidx.compose.ui.Modifier.A00
        L_0x0305:
            if (r29 == 0) goto L_0x0309
            long r18 = X.AnonymousClass5RW.A08
        L_0x0309:
            if (r28 == 0) goto L_0x030d
            long r16 = X.AnonymousClass5Z5.A01
        L_0x030d:
            if (r27 == 0) goto L_0x0311
            r39 = 0
        L_0x0311:
            if (r26 == 0) goto L_0x0315
            r38 = 0
        L_0x0315:
            r6 = r56 & 64
            if (r6 == 0) goto L_0x031f
            r36 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = -3670017(0xffffffffffc7ffff, float:NaN)
            r0 = r0 & r6
        L_0x031f:
            if (r13 == 0) goto L_0x0323
            r32 = 1
        L_0x0323:
            if (r12 == 0) goto L_0x0327
            r35 = 1
        L_0x0327:
            if (r11 == 0) goto L_0x032c
            r34 = 2147483647(0x7fffffff, float:NaN)
        L_0x032c:
            if (r10 == 0) goto L_0x0330
            r33 = 1
        L_0x0330:
            r6 = r1 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0345
            X.4bM r8 = X.AnonymousClass5ZZ.A00
            r6 = r3
            X.5Wx r6 = (X.C286565Wx) r6
            X.5RM r6 = X.C286565Wx.A04(r6)
            java.lang.Object r8 = X.C286615Xc.A01(r8, r6)
            X.5Z4 r8 = (X.AnonymousClass5Z4) r8
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0345:
            if (r7 == 0) goto L_0x0349
            X.B5L r23 = X.B5L.A00
        L_0x0349:
            if (r14 == 0) goto L_0x0354
            X.6G6 r22 = X.AnonymousClass6G6.A03
            java.lang.String r7 = "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K of kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf, V of kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf>"
            r6 = r22
            X.0qQ.A0C(r6, r7)
        L_0x0354:
            if (r21 == 0) goto L_0x0358
            r37 = 0
        L_0x0358:
            if (r20 == 0) goto L_0x0171
            r31 = 1
            goto L_0x0171
        L_0x035e:
            r6 = r55 & r25
            if (r6 != 0) goto L_0x00fd
            r6 = r31
            boolean r15 = r3.AGv(r6)
            r6 = 524288(0x80000, float:7.34684E-40)
            if (r15 == 0) goto L_0x036e
            r6 = 1048576(0x100000, float:1.469368E-39)
        L_0x036e:
            r4 = r4 | r6
            goto L_0x00fd
        L_0x0371:
            r6 = r55 & r15
            if (r6 != 0) goto L_0x00f5
            r6 = r37
            boolean r15 = r3.AGw(r6)
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r15 == 0) goto L_0x0381
            r6 = 131072(0x20000, float:1.83671E-40)
        L_0x0381:
            r4 = r4 | r6
            goto L_0x00f5
        L_0x0384:
            r6 = r5 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x00ed
            r6 = r57
            boolean r6 = r3.AGw(r6)
            if (r6 == 0) goto L_0x0392
            r20 = 16384(0x4000, float:2.2959E-41)
        L_0x0392:
            r4 = r4 | r20
            goto L_0x00ed
        L_0x0396:
            r6 = r5 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x00e7
            r6 = r22
            boolean r6 = r3.AGu(r6)
            if (r6 == 0) goto L_0x03a4
            r21 = 2048(0x800, float:2.87E-42)
        L_0x03a4:
            r4 = r4 | r21
            goto L_0x00e7
        L_0x03a8:
            r6 = r5 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x00e1
            r6 = r23
            boolean r14 = r3.AGw(r6)
            r6 = 128(0x80, float:1.794E-43)
            if (r14 == 0) goto L_0x03b8
            r6 = 256(0x100, float:3.59E-43)
        L_0x03b8:
            r4 = r4 | r6
            goto L_0x00e1
        L_0x03bb:
            r4 = r55 & 6
            if (r4 != 0) goto L_0x03cd
            r4 = r33
            boolean r6 = r3.AGs(r4)
            r4 = 2
            if (r6 == 0) goto L_0x03c9
            r4 = 4
        L_0x03c9:
            r4 = r55 | r4
            goto L_0x00c8
        L_0x03cd:
            r4 = r5
            goto L_0x00c8
        L_0x03d0:
            r4 = r54 & r15
            if (r4 != 0) goto L_0x0064
            r4 = r38
            boolean r5 = r3.AGu(r4)
            r4 = 65536(0x10000, float:9.18355E-41)
            if (r5 == 0) goto L_0x03e0
            r4 = 131072(0x20000, float:1.83671E-40)
        L_0x03e0:
            r0 = r0 | r4
            goto L_0x0064
        L_0x03e3:
            r4 = r2 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x005d
            r4 = r39
            boolean r5 = r3.AGu(r4)
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r5 == 0) goto L_0x03f3
            r4 = 16384(0x4000, float:2.2959E-41)
        L_0x03f3:
            r0 = r0 | r4
            goto L_0x005d
        L_0x03f6:
            r4 = r2 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x0055
            r4 = r16
            boolean r5 = r3.AGt(r4)
            r4 = 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x0406
            r4 = 2048(0x800, float:2.87E-42)
        L_0x0406:
            r0 = r0 | r4
            goto L_0x0055
        L_0x0409:
            r4 = r2 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x004d
            r4 = r18
            boolean r5 = r3.AGt(r4)
            r4 = 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x0419
            r4 = 256(0x100, float:3.59E-43)
        L_0x0419:
            r0 = r0 | r4
            goto L_0x004d
        L_0x041c:
            r4 = r54 & 48
            if (r4 != 0) goto L_0x0047
            r4 = r24
            boolean r5 = r3.AGu(r4)
            r4 = 16
            if (r5 == 0) goto L_0x042c
            r4 = 32
        L_0x042c:
            r0 = r0 | r4
            goto L_0x0047
        L_0x042f:
            r0 = r54 & 6
            if (r0 != 0) goto L_0x0441
            r0 = r58
            boolean r4 = r3.AGu(r0)
            r0 = 2
            if (r4 == 0) goto L_0x043d
            r0 = 4
        L_0x043d:
            r0 = r0 | r54
            goto L_0x0041
        L_0x0441:
            r0 = r2
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.compose.core.ui.IgClickableTextKt.A01(X.5Wy, androidx.compose.ui.Modifier, X.5Tq, X.5Z4, X.5hl, X.5ZD, X.0sP, X.0sP, X.0sP, X.6Dt, int, int, int, int, int, int, int, long, long, boolean, boolean):void");
    }
}

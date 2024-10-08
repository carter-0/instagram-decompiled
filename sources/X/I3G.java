package X;

import androidx.compose.ui.Modifier;

public abstract class I3G {
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009d, code lost:
        if ((r23 & 6) == 4) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b5, code lost:
        if ((r3 & 384) == 256) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cd, code lost:
        if ((r3 & 3072) == 2048) goto L_0x00cf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C56035Hri A00(X.C286575Wy r20, X.C54624HLh r21, X.0sP r22, int r23, int r24) {
        /*
            r11 = r22
            r9 = 0
            r12 = 0
            r1 = 0
            r2 = 1862930935(0x6f0a11f7, float:4.273065E28)
            r0 = r20
            r0.ExS(r2)
            r2 = r24 & 2
            if (r2 == 0) goto L_0x0013
            X.5b9 r9 = X.C56486HzI.A00
        L_0x0013:
            r2 = r24 & 4
            if (r2 == 0) goto L_0x0019
            X.J4y r11 = X.C59065J4y.A00
        L_0x0019:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0027
            r3 = -802468253(0xffffffffd02b4e63, float:-1.14961644E10)
            java.lang.String r2 = "com.meta.compose.material.bottomsheet.rememberModalBottomSheetState (ModalBottomSheet.kt:281)"
            X.0fL.A01(r3, r2)
        L_0x0027:
            X.4cd r10 = X.C51968G9o.A0Y(r0)
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0039
            r3 = 1031166448(0x3d7659f0, float:0.060144365)
            java.lang.String r2 = "androidx.compose.foundation.layout.<get-systemBars> (WindowInsets.android.kt:200)"
            X.0fL.A01(r3, r2)
        L_0x0039:
            X.HpJ r2 = X.I4O.A0N
            X.I4O r2 = r2.A00(r0)
            X.IF2 r3 = r2.A05
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x004d
            r2 = -176756728(0xfffffffff576e808, float:-3.1299101E32)
            X.0fL.A00(r2)
        L_0x004d:
            int r2 = r3.AhD(r10)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            X.5Oz r13 = X.C287175Zh.A00(r0, r2)
            r2 = 735860718(0x2bdc57ee, float:1.5656346E-12)
            r14 = r21
            r0.ExC(r2, r14)
            r5 = 4
            java.lang.Object[] r22 = new java.lang.Object[]{r14, r9, r12, r11, r10}
            X.AnonymousClass7TF.A1H(r9, r11)
            r24 = 4
            X.0qQ.A0B(r10, r5)
            X.JFd r2 = X.C59325JFd.A00
            r16 = 24
            X.Ixb r15 = new X.Ixb
            r17 = r10
            r18 = r13
            r19 = r11
            r20 = r9
            r21 = r12
            r15.<init>(r16, r17, r18, r19, r20, r21)
            X.5To r4 = new X.5To
            r4.<init>(r15, r2)
            r2 = 735874912(0x2bdc8f60, float:1.5671735E-12)
            r0.ExS(r2)
            r3 = r23
            r2 = r23 & 14
            r2 = r2 ^ 6
            if (r2 <= r5) goto L_0x009a
            boolean r2 = r0.AGu(r14)
            if (r2 != 0) goto L_0x009f
        L_0x009a:
            r6 = r23 & 6
            r2 = 0
            if (r6 != r5) goto L_0x00a0
        L_0x009f:
            r2 = 1
        L_0x00a0:
            boolean r7 = X.C51972G9s.A1X(r0, r10, r13, r2)
            r2 = r3 & 896(0x380, float:1.256E-42)
            r2 = r2 ^ 384(0x180, float:5.38E-43)
            r6 = 256(0x100, float:3.59E-43)
            if (r2 <= r6) goto L_0x00b2
            boolean r2 = r0.AGu(r11)
            if (r2 != 0) goto L_0x00b7
        L_0x00b2:
            r5 = r3 & 384(0x180, float:5.38E-43)
            r2 = 0
            if (r5 != r6) goto L_0x00b8
        L_0x00b7:
            r2 = 1
        L_0x00b8:
            boolean r6 = X.C51968G9o.A1T(r0, r9, r7, r2)
            r2 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 ^ 3072(0xc00, float:4.305E-42)
            r5 = 2048(0x800, float:2.87E-42)
            if (r2 <= r5) goto L_0x00ca
            boolean r2 = r0.AGu(r12)
            if (r2 != 0) goto L_0x00cf
        L_0x00ca:
            r3 = r3 & 3072(0xc00, float:4.305E-42)
            r2 = 0
            if (r3 != r5) goto L_0x00d0
        L_0x00cf:
            r2 = 1
        L_0x00d0:
            r6 = r6 | r2
            java.lang.Object r7 = r0.ECw()
            if (r6 != 0) goto L_0x00db
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r7 != r2) goto L_0x00e5
        L_0x00db:
            r8 = 9
            X.IoR r7 = new X.IoR
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r0.FLL(r7)
        L_0x00e5:
            X.0sa r7 = (X.C62320sa) r7
            X.5Wx r3 = X.C51965G9l.A0H(r0, r1)
            r21 = r7
            r23 = r1
            r19 = r0
            r20 = r4
            java.lang.Object r2 = X.C305136Gr.A00(r19, r20, r21, r22, r23, r24)
            X.Hri r2 = (X.C56035Hri) r2
            boolean r0 = X.C51967G9n.A1b(r3, r1)
            if (r0 == 0) goto L_0x0105
            r0 = -73357873(0xfffffffffba0a5cf, float:-1.668261E36)
            X.0fL.A00(r0)
        L_0x0105:
            X.C286565Wx.A0L(r3, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I3G.A00(X.5Wy, X.HLh, X.0sP, int, int):X.Hri");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x023c, code lost:
        if (r10.A05.getValue() == r11) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r4.AGw(r7) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r1 == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0090, code lost:
        if (r1 == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ff, code lost:
        if ((r2 & 128) != 0) goto L_0x0101;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r43, androidx.compose.ui.Modifier r44, X.AnonymousClass5S2 r45, X.C56035Hri r46, X.0sL r47, X.0sK r48, X.C286705Xl[] r49, int r50, int r51, long r52, long r54, boolean r56) {
        /*
            r16 = r54
            r24 = r45
            r25 = r56
            r7 = r46
            r26 = r44
            r6 = 0
            r8 = 6
            r0 = -1733000299(0xffffffff98b48395, float:-4.6661773E-24)
            r4 = r43
            r4.ExV(r0)
            r2 = r51
            r0 = r51 & 1
            r46 = r48
            r3 = r50
            if (r0 == 0) goto L_0x0396
            r5 = r50 | 6
        L_0x0020:
            r11 = r51 & 2
            if (r11 == 0) goto L_0x0389
            r5 = r5 | 48
        L_0x0026:
            r0 = r3 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0039
            r0 = r51 & 4
            if (r0 != 0) goto L_0x0036
            boolean r1 = r4.AGw(r7)
            r0 = 256(0x100, float:3.59E-43)
            if (r1 != 0) goto L_0x0038
        L_0x0036:
            r0 = 128(0x80, float:1.794E-43)
        L_0x0038:
            r5 = r5 | r0
        L_0x0039:
            r10 = r51 & 8
            if (r10 == 0) goto L_0x037c
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x003f:
            r0 = r3 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0054
            r0 = r51 & 16
            if (r0 != 0) goto L_0x0051
            r0 = r24
            boolean r1 = r4.AGu(r0)
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r1 != 0) goto L_0x0053
        L_0x0051:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x0053:
            r5 = r5 | r0
        L_0x0054:
            r1 = r51 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            r44 = r52
            if (r1 != 0) goto L_0x006a
            r0 = r50 & r0
            if (r0 != 0) goto L_0x006b
            r0 = r44
            boolean r0 = r4.AGt(r0)
            int r0 = X.C51969G9p.A03(r0)
        L_0x006a:
            r5 = r5 | r0
        L_0x006b:
            r1 = r51 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            r36 = r49
            if (r1 != 0) goto L_0x007d
            r0 = r50 & r0
            if (r0 != 0) goto L_0x007e
            r0 = r36
            int r0 = X.G9t.A0K(r4, r0)
        L_0x007d:
            r5 = r5 | r0
        L_0x007e:
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r50 & r0
            if (r0 != 0) goto L_0x0095
            r0 = r2 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x0092
            r0 = r16
            boolean r1 = r4.AGt(r0)
            r0 = 8388608(0x800000, float:1.17549435E-38)
            if (r1 != 0) goto L_0x0094
        L_0x0092:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x0094:
            r5 = r5 | r0
        L_0x0095:
            r1 = r2 & 256(0x100, float:3.59E-43)
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            if (r1 != 0) goto L_0x00a5
            r0 = r50 & r0
            if (r0 != 0) goto L_0x00a6
            r0 = r47
            int r0 = X.G9t.A0M(r4, r0)
        L_0x00a5:
            r5 = r5 | r0
        L_0x00a6:
            r0 = 38347923(0x2492493, float:1.4777644E-37)
            r1 = r5 & r0
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r1 != r0) goto L_0x00df
            boolean r0 = r4.Bwn()
            if (r0 == 0) goto L_0x00df
            r4.Evl()
        L_0x00b9:
            X.5Xd r1 = r4.ASQ()
            if (r1 == 0) goto L_0x00de
            X.JBf r0 = new X.JBf
            r27 = r0
            r28 = r26
            r29 = r24
            r30 = r7
            r31 = r47
            r32 = r46
            r33 = r36
            r34 = r3
            r35 = r2
            r36 = r44
            r38 = r16
            r40 = r25
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r40)
            r1.A06 = r0
        L_0x00de:
            return
        L_0x00df:
            r4.Ewr()
            r0 = r50 & 1
            r9 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0353
            boolean r0 = r4.Aw3()
            if (r0 != 0) goto L_0x0353
            r4.Evl()
            r0 = r51 & 4
            if (r0 == 0) goto L_0x00f8
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00f8:
            r0 = r51 & 16
            if (r0 == 0) goto L_0x00fd
            r5 = r5 & r9
        L_0x00fd:
            r0 = r2 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0105
        L_0x0101:
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r5 = r5 & r0
        L_0x0105:
            boolean r0 = X.C51967G9n.A1S(r4)
            if (r0 == 0) goto L_0x0113
            r1 = 1399436738(0x5369b5c2, float:1.00377677E12)
            java.lang.String r0 = "com.meta.compose.material.bottomsheet.ModalBottomSheetLayout (ModalBottomSheet.kt:355)"
            X.0fL.A01(r1, r0)
        L_0x0113:
            java.lang.Object r1 = r4.ECw()
            java.lang.Object r23 = X.AnonymousClass5XT.A00
            r0 = r23
            java.lang.Object r0 = X.C51974G9v.A0Y(r4, r1, r0)
            X.6FV r0 = (X.AnonymousClass6FV) r0
            X.4Cq r9 = r0.A00
            X.6Gj r22 = X.AnonymousClass6Gj.Vertical
            int r0 = r5 >> 3
            androidx.compose.ui.Alignment r12 = X.C287215Zl.A0E
            X.5RD r14 = X.C287675aa.A00(r12, r6)
            int r13 = X.C287425a7.A00(r4)
            r8 = r4
            X.5Wx r8 = (X.C286565Wx) r8
            X.5RM r11 = X.C286565Wx.A04(r8)
            r1 = r26
            androidx.compose.ui.Modifier r1 = X.C287435a8.A01(r4, r1)
            X.0sa r10 = X.C287485aD.A00
            X.C51973G9u.A0z(r4, r8, r10)
            X.0sL r15 = X.C287485aD.A03
            X.0sL r21 = X.C51969G9p.A0w(r4, r14, r11, r15)
            X.0sL r14 = X.C287485aD.A02
            boolean r11 = r8.A0K
            if (r11 != 0) goto L_0x0155
            boolean r11 = X.C51972G9s.A1Q(r4, r13)
            if (r11 != 0) goto L_0x0158
        L_0x0155:
            X.C51971G9r.A13(r4, r14, r13)
        L_0x0158:
            X.0sL r20 = X.C51966G9m.A1K(r4, r1)
            X.5dj r19 = X.C289515dj.A00
            X.5Qk r1 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r11 = X.C51966G9m.A0U(r1)
            X.5RD r18 = X.C287675aa.A00(r12, r6)
            int r13 = X.C287425a7.A00(r4)
            X.5RM r12 = X.C286565Wx.A04(r8)
            androidx.compose.ui.Modifier r11 = X.C287435a8.A01(r4, r11)
            X.C51973G9u.A0z(r4, r8, r10)
            r10 = r18
            X.C287595aO.A00(r4, r10, r15)
            r10 = r21
            boolean r10 = X.C51965G9l.A1Y(r4, r8, r12, r10)
            if (r10 != 0) goto L_0x018a
            boolean r10 = X.C51972G9s.A1Q(r4, r13)
            if (r10 != 0) goto L_0x018d
        L_0x018a:
            X.C51971G9r.A13(r4, r14, r13)
        L_0x018d:
            r10 = r20
            X.C287595aO.A00(r4, r11, r10)
            int r10 = r5 >> 24
            r11 = r10 & 14
            r10 = r47
            X.C51967G9n.A1P(r4, r10, r11)
            r10 = -1536971148(0xffffffffa463ae74, float:-4.9370546E-17)
            boolean r10 = X.C51973G9u.A1S(r4, r7, r9, r10)
            java.lang.Object r11 = r4.ECw()
            if (r10 != 0) goto L_0x01ac
            r10 = r23
            if (r11 != r10) goto L_0x01b5
        L_0x01ac:
            r10 = 11
            X.Ivw r11 = X.C58687Ivw.A00(r9, r7, r10)
            r4.FLL(r11)
        L_0x01b5:
            X.0sa r28 = X.C51965G9l.A0y(r8, r11, r6)
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r10 = r7.A02
            X.4gU r11 = r10.A08
            java.lang.Object r12 = r11.getValue()
            X.HLh r11 = X.C54624HLh.Hidden
            boolean r32 = X.C51969G9p.A1a(r12, r11)
            int r12 = r5 >> 21
            r29 = r12 & 14
            r27 = r4
            r30 = r16
            A02(r27, r28, r29, r30, r32)
            r4.ASN()
            androidx.compose.ui.Alignment r13 = X.C287215Zl.A0C
            r12 = r19
            androidx.compose.ui.Modifier r14 = r12.AAz(r13, r1)
            r18 = 0
            r13 = 1142947840(0x44200000, float:640.0)
            r12 = 2143289344(0x7fc00000, float:NaN)
            androidx.compose.ui.Modifier r12 = X.C287205Zk.A0H(r14, r12, r13)
            androidx.compose.ui.Modifier r14 = X.C51966G9m.A0V(r12)
            r12 = -544713412(0xffffffffdf88553c, float:-1.9647648E19)
            r4.ExS(r12)
            if (r25 == 0) goto L_0x0350
            r12 = -544710624(0xffffffffdf886020, float:-1.965378E19)
            boolean r12 = X.C51967G9n.A1Y(r4, r10, r12)
            java.lang.Object r13 = r4.ECw()
            if (r12 != 0) goto L_0x0204
            r12 = r23
            if (r13 != r12) goto L_0x020f
        L_0x0204:
            r15 = 1
            X.IG9 r13 = new X.IG9
            r12 = r22
            r13.<init>(r15, r12, r10)
            r4.FLL(r13)
        L_0x020f:
            X.5WO r13 = (X.AnonymousClass5WO) r13
            X.C286565Wx.A0L(r8, r6)
            r12 = r18
            androidx.compose.ui.Modifier r12 = X.C51970G9q.A0V(r1, r13, r12)
        L_0x021a:
            androidx.compose.ui.Modifier r15 = X.C51967G9n.A0B(r8, r14, r12)
            r12 = 32
            X.JFy r14 = X.C59346JFy.A00(r7, r12)
            X.0qQ.A0B(r15, r6)
            com.meta.compose.material.bottomsheet.DraggableAnchorsElement r13 = new com.meta.compose.material.bottomsheet.DraggableAnchorsElement
            r12 = r22
            r13.<init>(r12, r10, r14)
            androidx.compose.ui.Modifier r12 = r15.Ezh(r13)
            if (r25 == 0) goto L_0x023e
            X.5Oz r13 = r10.A05
            java.lang.Object r13 = r13.getValue()
            r33 = 1
            if (r13 != r11) goto L_0x0240
        L_0x023e:
            r33 = 0
        L_0x0240:
            X.5Oz r11 = r10.A06
            java.lang.Object r11 = r11.getValue()
            boolean r34 = X.AnonymousClass7TF.A1V(r11)
            X.0qQ.A0B(r12, r6)
            X.JNP r15 = r10.A01
            r13 = 4
            X.MHZ r14 = new X.MHZ
            r11 = r18
            r14.<init>(r10, r11, r13)
            X.0sK r31 = X.GQV.A00
            androidx.compose.foundation.gestures.DraggableElement r10 = new androidx.compose.foundation.gestures.DraggableElement
            r27 = r10
            r28 = r15
            r29 = r22
            r30 = r11
            r32 = r14
            r27.<init>(r28, r29, r30, r31, r32, r33, r34)
            androidx.compose.ui.Modifier r14 = r12.Ezh(r10)
            X.0qQ.A0B(r14, r6)
            r10 = 302734826(0x120b5dea, float:4.3976424E-28)
            boolean r10 = X.C51967G9n.A1U(r4, r10)
            if (r10 == 0) goto L_0x0280
            r11 = 1381246396(0x525425bc, float:2.27791536E11)
            java.lang.String r10 = "com.meta.compose.core.statusBarsAndDisplayCutoutPaddingIgnoringVisibility (IgnoringVisibilityPaddingModifiers.kt:76)"
            X.0fL.A01(r11, r10)
        L_0x0280:
            boolean r10 = X.0fL.A02()
            if (r10 == 0) goto L_0x028e
            r11 = 1607697158(0x5fd38306, float:3.0482064E19)
            java.lang.String r10 = "androidx.compose.foundation.layout.<get-statusBarsIgnoringVisibility> (WindowInsets.android.kt:292)"
            X.0fL.A01(r11, r10)
        L_0x028e:
            X.HpJ r13 = X.I4O.A0N
            X.I4O r10 = r13.A00(r4)
            X.IF1 r12 = r10.A0A
            boolean r10 = X.0fL.A02()
            if (r10 == 0) goto L_0x02a2
            r10 = -1627544547(0xffffffff9efda41d, float:-2.6855293E-20)
            X.0fL.A00(r10)
        L_0x02a2:
            boolean r10 = X.0fL.A02()
            if (r10 == 0) goto L_0x02b0
            r11 = -1923406213(0xffffffff8d5b267b, float:-6.7530904E-31)
            java.lang.String r10 = "androidx.compose.foundation.layout.<get-displayCutout> (WindowInsets.android.kt:151)"
            X.0fL.A01(r11, r10)
        L_0x02b0:
            X.I4O r10 = r13.A00(r4)
            X.IF2 r11 = r10.A01
            boolean r10 = X.0fL.A02()
            if (r10 == 0) goto L_0x02c2
            r10 = 821326055(0x30f470e7, float:1.7785425E-9)
            X.0fL.A00(r10)
        L_0x02c2:
            X.IF0 r10 = new X.IF0
            r10.<init>(r12, r11)
            androidx.compose.ui.Modifier r12 = X.C56382Hxb.A00(r10, r14)
            boolean r10 = X.0fL.A02()
            if (r10 == 0) goto L_0x02d7
            r10 = -2011881775(0xffffffff88151ed1, float:-4.487428E-34)
            X.0fL.A00(r10)
        L_0x02d7:
            X.C286565Wx.A0L(r8, r6)
            r10 = -544685715(0xffffffffdf88c16d, float:-1.9708555E19)
            r4.ExS(r10)
            if (r25 == 0) goto L_0x0305
            r10 = -544683732(0xffffffffdf88c92c, float:-1.9712915E19)
            boolean r10 = X.C51973G9u.A1S(r4, r7, r9, r10)
            java.lang.Object r11 = r4.ECw()
            if (r10 != 0) goto L_0x02f3
            r10 = r23
            if (r11 != r10) goto L_0x02fd
        L_0x02f3:
            r10 = 34
            X.J6T r11 = new X.J6T
            r11.<init>((int) r10, (java.lang.Object) r9, (java.lang.Object) r7)
            r4.FLL(r11)
        L_0x02fd:
            X.0sP r9 = X.C51965G9l.A0z(r8, r11)
            androidx.compose.ui.Modifier r1 = X.AnonymousClass5R5.A00(r1, r9, r6)
        L_0x0305:
            androidx.compose.ui.Modifier r31 = X.C51967G9n.A0B(r8, r12, r1)
            r37 = 0
            r9 = -2105438523(0xffffffff82818ec5, float:-1.9036792E-37)
            r8 = 31
            r1 = r46
            X.JFy r1 = X.C59346JFy.A00(r1, r8)
            X.5PJ r35 = X.AnonymousClass5PI.A01(r4, r1, r9)
            r8 = r0 & 7168(0x1c00, float:1.0045E-41)
            r1 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r1
            r0 = r0 | r8
            r8 = 1879048192(0x70000000, float:1.58456325E29)
            int r1 = r5 << 9
            r8 = r8 & r1
            r0 = r0 | r8
            r39 = 48
            r40 = 1510(0x5e6, float:2.116E-42)
            r28 = r18
            r29 = r18
            r30 = r4
            r32 = r24
            r33 = r18
            r34 = r18
            r38 = r0
            r41 = r44
            r43 = r6
            r27 = r18
            X.C304876Fo.A00(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r43)
            boolean r0 = X.C51967G9n.A1R(r4)
            if (r0 == 0) goto L_0x00b9
            r0 = 1892829857(0x70d24aa1, float:5.206566E29)
            X.0fL.A00(r0)
            goto L_0x00b9
        L_0x0350:
            r12 = r1
            goto L_0x021a
        L_0x0353:
            if (r11 == 0) goto L_0x0357
            X.5Qk r26 = androidx.compose.ui.Modifier.A00
        L_0x0357:
            r0 = r51 & 4
            if (r0 == 0) goto L_0x0366
            X.HLh r7 = X.C54624HLh.Hidden
            r1 = 0
            r0 = 14
            X.Hri r7 = A00(r4, r7, r1, r8, r0)
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0366:
            if (r10 == 0) goto L_0x036a
            r25 = 1
        L_0x036a:
            r0 = r51 & 16
            if (r0 == 0) goto L_0x0372
            X.5S2 r24 = X.C56486HzI.A01
            r9 = r9 & r5
            r5 = r9
        L_0x0372:
            r0 = r2 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0105
            long r16 = X.C56486HzI.A00(r4)
            goto L_0x0101
        L_0x037c:
            r0 = r3 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x003f
            r0 = r25
            int r0 = X.G9t.A0b(r4, r0)
            r5 = r5 | r0
            goto L_0x003f
        L_0x0389:
            r0 = r50 & 48
            if (r0 != 0) goto L_0x0026
            r0 = r26
            int r0 = X.G9t.A0P(r4, r0)
            r5 = r5 | r0
            goto L_0x0026
        L_0x0396:
            r0 = r50 & 6
            if (r0 != 0) goto L_0x03a4
            r0 = r46
            int r5 = X.C41848B3p.A01(r4, r0)
            r5 = r5 | r50
            goto L_0x0020
        L_0x03a4:
            r5 = r3
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I3G.A01(X.5Wy, androidx.compose.ui.Modifier, X.5S2, X.Hri, X.0sL, X.0sK, X.5Xl[], int, int, long, long, boolean):void");
    }

    public static final void A02(C286575Wy r11, C62320sa r12, int i, long j, boolean z) {
        int i2;
        C285245Qk r112;
        Modifier modifier;
        C286575Wy r6 = r11;
        r11.ExV(-1439924729);
        int i3 = i;
        long j2 = j;
        if ((i & 6) == 0) {
            i2 = C51970G9q.A05(r11.AGt(j) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        C62320sa r5 = r12;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r11, r12);
        }
        if ((i & 384) == 0) {
            i2 |= G9t.A0a(r11, z);
        }
        if ((i2 & 147) != 146 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-857394360, "com.meta.compose.material.bottomsheet.Scrim (ModalBottomSheet.kt:478)");
            }
            if (j != 16) {
                C270284gU A02 = I69.A02(GQC.A00(300, 0), r11, (0sP) null, C51971G9r.A00(z ? 1 : 0), 3120, 20);
                String A00 = C288045bH.A00(r6, 2131954077);
                r6.ExS(2103990527);
                if (z) {
                    r112 = Modifier.A00;
                    r6.ExS(2103992066);
                    int i4 = i2 & 112;
                    boolean A1S = AnonymousClass7TF.A1S(i4, 32);
                    Object ECw = r6.ECw();
                    if (A1S || ECw == AnonymousClass5XT.A00) {
                        ECw = new MGC((Object) r5, (AnonymousClass4D7) null, 31, 42);
                        r6.FLL(ECw);
                    }
                    C286565Wx A0H = C51965G9l.A0H(r6, false);
                    Modifier A002 = C304916Fs.A00(r112, r5, (0sL) ECw);
                    boolean A1Y = C51967G9n.A1Y(r6, A00, 2103995007) | AnonymousClass7TF.A1S(i4, 32);
                    Object ECw2 = r6.ECw();
                    if (A1Y || ECw2 == AnonymousClass5XT.A00) {
                        ECw2 = new C58738Iwl(A00, r5, 5);
                        r6.FLL(ECw2);
                    }
                    modifier = AnonymousClass5R5.A00(A002, C51965G9l.A0z(A0H, ECw2), true);
                } else {
                    Modifier modifier2 = Modifier.A00;
                    r112 = modifier2;
                    modifier = modifier2;
                }
                C286565Wx A0H2 = C51965G9l.A0H(r6, false);
                Modifier Ezh = C51966G9m.A0U(r112).Ezh(modifier);
                r6.ExS(2104003431);
                boolean A1Z = C51965G9l.A1Z(r6, A02, C51975G9x.A1N(i2));
                Object ECw3 = r6.ECw();
                if (A1Z || ECw3 == AnonymousClass5XT.A00) {
                    ECw3 = new C58734Iwh(j2, A02, 10);
                    r6.FLL(ECw3);
                }
                C289565do.A00(r6, Ezh, C51965G9l.A0z(A0H2, ECw3), 0);
            }
            if (0fL.A02()) {
                0fL.A00(1691118303);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J7H(r5, i3, j2, z);
        }
    }
}

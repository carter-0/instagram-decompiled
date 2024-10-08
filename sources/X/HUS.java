package X;

public abstract class HUS {
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (r3 == false) goto L_0x004b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C287605aT r20, X.C286575Wy r21, androidx.compose.ui.Modifier r22, X.C54652HMj r23, X.C53282GlU r24, X.C62320sa r25, X.0sL r26, int r27, int r28, boolean r29, boolean r30) {
        /*
            r11 = r30
            r19 = r23
            r2 = r24
            r7 = r29
            r4 = r20
            r5 = r22
            r6 = 0
            r13 = r25
            r12 = r26
            X.AnonymousClass7TF.A1E(r13, r6, r12)
            r0 = 1877588375(0x6fe9b997, float:1.4466874E29)
            r10 = r21
            r10.ExV(r0)
            r8 = r28
            r0 = r28 & 1
            r9 = r27
            if (r0 == 0) goto L_0x0192
            r1 = r27 | 6
        L_0x0026:
            r18 = r28 & 2
            if (r18 == 0) goto L_0x0187
            r1 = r1 | 48
        L_0x002c:
            r15 = r28 & 4
            if (r15 == 0) goto L_0x017c
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0032:
            r14 = r28 & 8
            if (r14 == 0) goto L_0x0171
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0038:
            r0 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x004e
            r0 = r28 & 16
            if (r0 != 0) goto L_0x004b
            r0 = 32768(0x8000, float:4.5918E-41)
            boolean r3 = X.G9t.A1V(r10, r2, r0, r9)
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r3 != 0) goto L_0x004d
        L_0x004b:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x004d:
            r1 = r1 | r0
        L_0x004e:
            r17 = r28 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r17 != 0) goto L_0x005e
            r0 = r0 & r27
            if (r0 != 0) goto L_0x005f
            r0 = r19
            int r0 = X.G9t.A0T(r10, r0)
        L_0x005e:
            r1 = r1 | r0
        L_0x005f:
            r16 = r28 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r16 != 0) goto L_0x006d
            r0 = r27 & r0
            if (r0 != 0) goto L_0x006e
            int r0 = X.G9t.A0e(r10, r11)
        L_0x006d:
            r1 = r1 | r0
        L_0x006e:
            r3 = r8 & 128(0x80, float:1.794E-43)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            if (r3 != 0) goto L_0x007c
            r0 = r27 & r0
            if (r0 != 0) goto L_0x007d
            int r0 = X.G9t.A0L(r10, r12)
        L_0x007c:
            r1 = r1 | r0
        L_0x007d:
            r3 = 4793491(0x492493, float:6.717112E-39)
            r3 = r3 & r1
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r3 != r0) goto L_0x00b3
            boolean r0 = r10.Bwn()
            if (r0 == 0) goto L_0x00b3
            r10.Evl()
        L_0x008f:
            X.5Xd r0 = r10.ASQ()
            if (r0 == 0) goto L_0x00b2
            X.JBi r15 = new X.JBi
            r24 = r6
            r25 = r7
            r26 = r11
            r20 = r5
            r21 = r19
            r22 = r8
            r23 = r9
            r16 = r2
            r17 = r4
            r18 = r12
            r19 = r13
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r0.A06 = r15
        L_0x00b2:
            return
        L_0x00b3:
            r10.Ewr()
            r0 = r27 & 1
            if (r0 == 0) goto L_0x010f
            boolean r0 = r10.Aw3()
            if (r0 != 0) goto L_0x010f
            r10.Evl()
            r3 = 0
        L_0x00c4:
            boolean r0 = X.C51967G9n.A1S(r10)
            if (r0 == 0) goto L_0x00d2
            r1 = -495232155(0xffffffffe27b5b65, float:-1.1591796E21)
            java.lang.String r0 = "com.instagram.barcelona.common.ui.button.BdsButton (BdsButton.kt:94)"
            X.0fL.A01(r1, r0)
        L_0x00d2:
            if (r7 == 0) goto L_0x010c
            long r0 = r2.A02
        L_0x00d6:
            java.lang.String r14 = "BdsButton"
            androidx.compose.ui.Modifier r15 = X.C51969G9p.A0Y(r5, r14)
            if (r7 != 0) goto L_0x00e0
            if (r11 == 0) goto L_0x00e1
        L_0x00e0:
            r3 = 1
        L_0x00e1:
            float r14 = r2.A00
            androidx.compose.ui.Modifier r15 = X.C288245bb.A00(r4, r15, r14, r3)
            r14 = -1194191975(0xffffffffb8d21399, float:-1.0017231E-4)
            X.J9Y r3 = new X.J9Y
            r17 = r3
            r18 = r4
            r20 = r2
            r21 = r13
            r22 = r12
            r23 = r0
            r25 = r11
            r26 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23, r25, r26)
            boolean r0 = X.C51972G9s.A1T(r10, r15, r3, r14)
            if (r0 == 0) goto L_0x008f
            r0 = -1390282939(0xffffffffad21f745, float:-9.206695E-12)
            X.0fL.A00(r0)
            goto L_0x008f
        L_0x010c:
            long r0 = r2.A03
            goto L_0x00d6
        L_0x010f:
            if (r18 == 0) goto L_0x0113
            X.5Qk r5 = androidx.compose.ui.Modifier.A00
        L_0x0113:
            if (r15 == 0) goto L_0x0121
            r0 = -1949028111(0xffffffff8bd430f1, float:-8.173307E-32)
            java.lang.Object r4 = X.C51974G9v.A0V(r10, r0)
            X.5aT r4 = (X.C287605aT) r4
            X.C51965G9l.A1X(r10, r6)
        L_0x0121:
            if (r14 == 0) goto L_0x0124
            r7 = 1
        L_0x0124:
            r0 = r28 & 16
            r3 = 0
            if (r0 == 0) goto L_0x0168
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0137
            r1 = 271632161(0x1030c721, float:3.4863283E-29)
            java.lang.String r0 = "com.instagram.barcelona.common.ui.button.BdsButtonStyles.secondaryLabel (BdsButton.kt:270)"
            X.0fL.A01(r1, r0)
        L_0x0137:
            r0 = -1125422644(0xffffffffbceb69cc, float:-0.028736971)
            X.5Yw r0 = X.C51967G9n.A0a(r10, r0)
            long r14 = r0.A0S
            long r0 = X.C51966G9m.A0H(r10)
            java.lang.Integer r22 = X.AnonymousClass05K.A00
            r21 = 0
            r2 = 1050253722(0x3e99999a, float:0.3)
            long r28 = X.C285595Rx.A02(X.AnonymousClass5RX.A0K[(int) (r0 & 63)], X.AnonymousClass5RW.A03(r0), X.AnonymousClass5RW.A02(r0), X.AnonymousClass5RW.A01(r0), r2)
            r23 = 1065353216(0x3f800000, float:1.0)
            X.GlU r2 = new X.GlU
            r20 = r2
            r24 = r14
            r26 = r0
            r20.<init>(r21, r22, r23, r24, r26, r28)
            boolean r0 = X.C51970G9q.A1a(r10, r6)
            if (r0 == 0) goto L_0x0168
            r0 = 1669401004(0x638109ac, float:4.760654E21)
            X.0fL.A00(r0)
        L_0x0168:
            if (r17 == 0) goto L_0x016c
            X.HMj r19 = X.C54652HMj.SMALL
        L_0x016c:
            if (r16 == 0) goto L_0x00c4
            r11 = 0
            goto L_0x00c4
        L_0x0171:
            r0 = r9 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0038
            int r0 = X.G9t.A0b(r10, r7)
            r1 = r1 | r0
            goto L_0x0038
        L_0x017c:
            r0 = r9 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0032
            int r0 = X.G9t.A0Q(r10, r4)
            r1 = r1 | r0
            goto L_0x0032
        L_0x0187:
            r0 = r27 & 48
            if (r0 != 0) goto L_0x002c
            int r0 = X.G9t.A0P(r10, r5)
            r1 = r1 | r0
            goto L_0x002c
        L_0x0192:
            r0 = r27 & 6
            if (r0 != 0) goto L_0x019e
            int r1 = X.C41848B3p.A01(r10, r13)
            r1 = r1 | r27
            goto L_0x0026
        L_0x019e:
            r1 = r9
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HUS.A00(X.5aT, X.5Wy, androidx.compose.ui.Modifier, X.HMj, X.GlU, X.0sa, X.0sL, int, int, boolean, boolean):void");
    }
}

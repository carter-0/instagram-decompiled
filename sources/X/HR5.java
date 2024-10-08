package X;

public abstract class HR5 {
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @kotlin.Deprecated(message = "Use Text or BasicText and pass an AnnotatedString that contains a LinkAnnotation")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r20, androidx.compose.ui.Modifier r21, X.C286025Tq r22, X.AnonymousClass5Z4 r23, X.0sP r24, X.0sP r25, int r26, int r27, int r28, int r29, boolean r30) {
        /*
            r1 = r24
            r18 = r26
            r2 = r30
            r6 = r27
            r3 = r23
            r7 = r21
            r0 = -246609449(0xfffffffff14d09d7, float:-1.0153012E30)
            r8 = r20
            r8.ExV(r0)
            r4 = r29
            r0 = r29 & 1
            r21 = r22
            r5 = r28
            if (r0 == 0) goto L_0x017c
            r9 = r28 | 6
        L_0x0020:
            r17 = r29 & 2
            if (r17 == 0) goto L_0x0171
            r9 = r9 | 48
        L_0x0026:
            r16 = r29 & 4
            if (r16 == 0) goto L_0x0166
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x002c:
            r10 = r29 & 8
            if (r10 == 0) goto L_0x015b
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x0032:
            r15 = r29 & 16
            if (r15 == 0) goto L_0x014e
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
        L_0x0038:
            r14 = r29 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r14 != 0) goto L_0x0046
            r0 = r28 & r0
            if (r0 != 0) goto L_0x0047
            int r0 = X.G9t.A0A(r8, r6)
        L_0x0046:
            r9 = r9 | r0
        L_0x0047:
            r13 = r29 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r13 != 0) goto L_0x0055
            r0 = r28 & r0
            if (r0 != 0) goto L_0x0056
            int r0 = X.G9t.A0K(r8, r1)
        L_0x0055:
            r9 = r9 | r0
        L_0x0056:
            r12 = r4 & 128(0x80, float:1.794E-43)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r11 = r25
            if (r12 != 0) goto L_0x0066
            r0 = r28 & r0
            if (r0 != 0) goto L_0x0067
            int r0 = X.G9t.A0L(r8, r11)
        L_0x0066:
            r9 = r9 | r0
        L_0x0067:
            r12 = 4793491(0x492493, float:6.717112E-39)
            r12 = r12 & r9
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r12 != r0) goto L_0x0098
            boolean r0 = r8.Bwn()
            if (r0 == 0) goto L_0x0098
            r8.Evl()
        L_0x0079:
            X.5Xd r8 = r8.ASQ()
            if (r8 == 0) goto L_0x0097
            X.JAr r0 = new X.JAr
            r12 = r0
            r13 = r7
            r14 = r21
            r15 = r3
            r16 = r1
            r17 = r11
            r19 = r6
            r20 = r5
            r21 = r4
            r22 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r8.A06 = r0
        L_0x0097:
            return
        L_0x0098:
            if (r17 == 0) goto L_0x009c
            X.5Qk r7 = androidx.compose.ui.Modifier.A00
        L_0x009c:
            if (r16 == 0) goto L_0x00a0
            X.5Z4 r3 = X.AnonymousClass5Z4.A03
        L_0x00a0:
            boolean r2 = X.C51966G9m.A1R(r10, r2)
            if (r15 == 0) goto L_0x00a8
            r18 = 1
        L_0x00a8:
            if (r14 == 0) goto L_0x00ad
            r6 = 2147483647(0x7fffffff, float:NaN)
        L_0x00ad:
            if (r13 == 0) goto L_0x00b1
            X.Iz6 r1 = X.C58881Iz6.A00
        L_0x00b1:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00bf
            r10 = 1864436953(0x6f210cd9, float:4.984262E28)
            java.lang.String r0 = "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)"
            X.0fL.A01(r10, r0)
        L_0x00bf:
            java.lang.Object r13 = r8.ECw()
            java.lang.Object r12 = X.AnonymousClass5XT.A00
            r10 = 0
            if (r13 != r12) goto L_0x00cc
            androidx.compose.runtime.ParcelableSnapshotMutableState r13 = X.G9t.A0o(r8, r10)
        L_0x00cc:
            X.5Qk r15 = androidx.compose.ui.Modifier.A00
            r14 = 29360128(0x1c00000, float:7.052966E-38)
            r14 = r14 & r9
            r16 = 0
            r0 = 8388608(0x800000, float:1.17549435E-38)
            boolean r14 = X.AnonymousClass7TF.A1S(r14, r0)
            java.lang.Object r0 = r8.ECw()
            if (r14 != 0) goto L_0x00e1
            if (r0 != r12) goto L_0x00eb
        L_0x00e1:
            r14 = 10
            X.MHP r0 = new X.MHP
            r0.<init>((java.lang.Object) r13, (java.lang.Object) r11, (X.AnonymousClass4D7) r10, (int) r14)
            r8.FLL(r0)
        L_0x00eb:
            X.0sL r0 = (X.0sL) r0
            androidx.compose.ui.Modifier r0 = X.C304916Fs.A00(r15, r11, r0)
            androidx.compose.ui.Modifier r20 = r7.Ezh(r0)
            r15 = 3670016(0x380000, float:5.142788E-39)
            r14 = r9 & r15
            r0 = 1048576(0x100000, float:1.469368E-39)
            if (r14 != r0) goto L_0x00ff
            r16 = 1
        L_0x00ff:
            java.lang.Object r0 = r8.ECw()
            if (r16 != 0) goto L_0x0107
            if (r0 != r12) goto L_0x0111
        L_0x0107:
            r12 = 32
            X.J6U r0 = new X.J6U
            r0.<init>(r12, r13, r1)
            r8.FLL(r0)
        L_0x0111:
            X.0sP r0 = (X.0sP) r0
            r27 = 0
            r28 = r9 & 14
            r12 = r9 & 896(0x380, float:1.256E-42)
            r28 = r28 | r12
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r9
            r28 = r28 | r12
            r13 = 458752(0x70000, float:6.42848E-40)
            int r12 = r9 << 6
            r12 = r12 & r13
            r28 = r28 | r12
            int r9 = r9 << 3
            r9 = r9 & r15
            r28 = r28 | r9
            r29 = 896(0x380, float:1.256E-42)
            r26 = r6
            r30 = r2
            r19 = r8
            r22 = r3
            r23 = r10
            r24 = r0
            r25 = r18
            X.C291525hS.A02(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0079
            r0 = 1828507994(0x6cfcd15a, float:2.4451035E27)
            X.0fL.A00(r0)
            goto L_0x0079
        L_0x014e:
            r0 = r5 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0038
            r0 = r18
            int r0 = X.G9t.A09(r8, r0)
            r9 = r9 | r0
            goto L_0x0038
        L_0x015b:
            r0 = r5 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0032
            int r0 = X.G9t.A0b(r8, r2)
            r9 = r9 | r0
            goto L_0x0032
        L_0x0166:
            r0 = r5 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x002c
            int r0 = X.G9t.A0Q(r8, r3)
            r9 = r9 | r0
            goto L_0x002c
        L_0x0171:
            r0 = r28 & 48
            if (r0 != 0) goto L_0x0026
            int r0 = X.G9t.A0P(r8, r7)
            r9 = r9 | r0
            goto L_0x0026
        L_0x017c:
            r0 = r28 & 6
            if (r0 != 0) goto L_0x018a
            r0 = r21
            int r9 = X.G9t.A0O(r8, r0)
            r9 = r9 | r28
            goto L_0x0020
        L_0x018a:
            r9 = r5
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HR5.A00(X.5Wy, androidx.compose.ui.Modifier, X.5Tq, X.5Z4, X.0sP, X.0sP, int, int, int, int, boolean):void");
    }
}

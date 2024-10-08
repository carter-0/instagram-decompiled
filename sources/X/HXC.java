package X;

public abstract class HXC {
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0114, code lost:
        if (r9 == X.AnonymousClass5XT.A00) goto L_0x0116;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r34, X.C286025Tq r35, X.AnonymousClass5Z4 r36, X.0sP r37, X.0sP r38, X.0sP r39, X.AnonymousClass62P r40, int r41, int r42, int r43, int r44, long r45, boolean r47) {
        /*
            r22 = r39
            r32 = r37
            r15 = r42
            r21 = r41
            r2 = r47
            r23 = r36
            r11 = r45
            r3 = 0
            r47 = r40
            r7 = r35
            r0 = r47
            X.AnonymousClass7TF.A1H(r7, r0)
            r0 = 8
            r6 = r38
            X.0qQ.A0B(r6, r0)
            r0 = -50542303(0xfffffffffcfcc921, float:-1.05003055E37)
            r8 = r34
            r8.ExV(r0)
            r4 = r44
            r0 = r44 & 1
            r5 = r43
            if (r0 == 0) goto L_0x0200
            r0 = r43 | 6
        L_0x0031:
            r1 = r44 & 2
            if (r1 == 0) goto L_0x01f3
            r0 = r0 | 48
        L_0x0037:
            r20 = r44 & 4
            if (r20 == 0) goto L_0x01e8
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x003d:
            r19 = r44 & 8
            if (r19 == 0) goto L_0x01db
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0043:
            r9 = r44 & 16
            if (r9 == 0) goto L_0x01d0
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0049:
            r18 = r44 & 32
            r1 = 196608(0x30000, float:2.75506E-40)
            if (r18 != 0) goto L_0x0059
            r1 = r43 & r1
            if (r1 != 0) goto L_0x005a
            r1 = r21
            int r1 = X.G9t.A0A(r8, r1)
        L_0x0059:
            r0 = r0 | r1
        L_0x005a:
            r16 = r44 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x01c5
            r0 = r0 | r17
        L_0x0062:
            r10 = r4 & 128(0x80, float:1.794E-43)
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            if (r10 != 0) goto L_0x0072
            r1 = r43 & r1
            if (r1 != 0) goto L_0x0073
            r1 = r32
            int r1 = X.G9t.A0L(r8, r1)
        L_0x0072:
            r0 = r0 | r1
        L_0x0073:
            r13 = r4 & 256(0x100, float:3.59E-43)
            r1 = 100663296(0x6000000, float:2.4074124E-35)
            if (r13 != 0) goto L_0x0081
            r1 = r43 & r1
            if (r1 != 0) goto L_0x0082
            int r1 = X.G9t.A0M(r8, r6)
        L_0x0081:
            r0 = r0 | r1
        L_0x0082:
            r13 = r4 & 512(0x200, float:7.175E-43)
            r1 = 805306368(0x30000000, float:4.656613E-10)
            if (r13 != 0) goto L_0x0092
            r1 = r43 & r1
            if (r1 != 0) goto L_0x0093
            r1 = r22
            int r1 = X.G9t.A0N(r8, r1)
        L_0x0092:
            r0 = r0 | r1
        L_0x0093:
            r1 = 306783379(0x12492493, float:6.34695E-28)
            r14 = r0 & r1
            r1 = 306783378(0x12492492, float:6.3469493E-28)
            if (r14 != r1) goto L_0x00ce
            boolean r1 = r8.Bwn()
            if (r1 == 0) goto L_0x00ce
            r8.Evl()
        L_0x00a6:
            X.5Xd r1 = r8.ASQ()
            if (r1 == 0) goto L_0x00cd
            X.JC0 r0 = new X.JC0
            r24 = r0
            r25 = r7
            r26 = r23
            r27 = r32
            r28 = r6
            r29 = r22
            r30 = r47
            r31 = r21
            r32 = r15
            r33 = r5
            r34 = r4
            r35 = r11
            r37 = r2
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37)
            r1.A06 = r0
        L_0x00cd:
            return
        L_0x00ce:
            if (r20 == 0) goto L_0x00d2
            long r11 = X.AnonymousClass5RW.A08
        L_0x00d2:
            if (r19 == 0) goto L_0x00d6
            X.5Z4 r23 = X.AnonymousClass5Z4.A03
        L_0x00d6:
            boolean r2 = X.C51966G9m.A1R(r9, r2)
            if (r18 == 0) goto L_0x00de
            r21 = 1
        L_0x00de:
            if (r16 == 0) goto L_0x00e3
            r15 = 2147483647(0x7fffffff, float:NaN)
        L_0x00e3:
            r28 = 0
            if (r10 == 0) goto L_0x00e9
            r32 = r28
        L_0x00e9:
            if (r13 == 0) goto L_0x00ed
            r22 = r28
        L_0x00ed:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x00fb
            r9 = 741920808(0x2c38d028, float:2.6263523E-12)
            java.lang.String r1 = "com.instagram.compose.core.ui.IgClickableTextWithNoAccessibilityBox (IgClickableTextWithNoAccessibilityBox.kt:34)"
            X.0fL.A01(r9, r1)
        L_0x00fb:
            r1 = 72096649(0x44c1b89, float:2.3992728E-36)
            r8.ExS(r1)
            r16 = r0 & 14
            boolean r10 = X.C51972G9s.A1I(r16)
            boolean r1 = X.C51973G9u.A1H(r0)
            r10 = r10 | r1
            java.lang.Object r9 = r8.ECw()
            if (r10 != 0) goto L_0x0116
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r9 != r1) goto L_0x0137
        L_0x0116:
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r47.iterator()
        L_0x011e:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0134
            java.lang.String r10 = X.AnonymousClass7TE.A18(r13)
            int r1 = r7.length()
            java.util.List r1 = r7.A06(r10, r3, r1)
            X.018.A16(r1, r9)
            goto L_0x011e
        L_0x0134:
            r8.FLL(r9)
        L_0x0137:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            X.5Wx r14 = X.C51965G9l.A0H(r8, r3)
            X.62P r13 = X.AnonymousClass62Q.A00(r9)
            X.5Qk r10 = androidx.compose.ui.Modifier.A00
            r1 = 72107314(0x44c4532, float:2.4011858E-36)
            boolean r9 = X.C51967G9n.A1Y(r8, r13, r1)
            boolean r1 = X.C51973G9u.A1L(r0)
            r9 = r9 | r1
            java.lang.Object r1 = r8.ECw()
            if (r9 != 0) goto L_0x0159
            java.lang.Object r9 = X.AnonymousClass5XT.A00
            if (r1 != r9) goto L_0x0162
        L_0x0159:
            r9 = 2
            X.MMv r1 = new X.MMv
            r1.<init>(r9, r6, r13)
            r8.FLL(r1)
        L_0x0162:
            X.0sP r1 = X.C51965G9l.A0z(r14, r1)
            androidx.compose.ui.Modifier r25 = X.AnonymousClass5R5.A00(r10, r1, r3)
            if (r22 != 0) goto L_0x01c2
            X.J1a r30 = X.C58963J1a.A00
        L_0x016e:
            r43 = 0
            r1 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 | r16
            r9 = 29360128(0x1c00000, float:7.052966E-38)
            int r10 = r0 << 9
            r9 = r9 & r10
            r1 = r1 | r9
            r9 = 1879048192(0x70000000, float:1.58456325E29)
            r10 = r10 & r9
            r1 = r1 | r10
            int r9 = r0 >> 15
            r10 = r9 & 14
            r10 = r10 | r17
            int r9 = r0 >> 6
            r13 = r9 & 112(0x70, float:1.57E-43)
            r10 = r10 | r13
            r13 = 57344(0xe000, float:8.0356E-41)
            int r0 = r0 >> 12
            r0 = r0 & r13
            int r39 = X.C51969G9p.A05(r10, r0, r9)
            r40 = 8568(0x2178, float:1.2006E-41)
            r29 = r28
            r31 = r6
            r33 = r28
            r34 = r3
            r35 = r3
            r36 = r15
            r37 = r21
            r38 = r1
            r41 = r11
            r45 = r2
            r46 = r3
            r24 = r8
            r26 = r7
            r27 = r23
            com.instagram.compose.core.ui.IgClickableTextKt.A01(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r43, r45, r46)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00a6
            r0 = 1537567391(0x5ba56a9f, float:9.3121205E16)
            X.0fL.A00(r0)
            goto L_0x00a6
        L_0x01c2:
            r30 = r22
            goto L_0x016e
        L_0x01c5:
            r1 = r43 & r17
            if (r1 != 0) goto L_0x0062
            int r1 = X.G9t.A0B(r8, r15)
            r0 = r0 | r1
            goto L_0x0062
        L_0x01d0:
            r1 = r5 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x0049
            int r1 = X.G9t.A0c(r8, r2)
            r0 = r0 | r1
            goto L_0x0049
        L_0x01db:
            r1 = r5 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x0043
            r1 = r23
            int r1 = X.G9t.A0R(r8, r1)
            r0 = r0 | r1
            goto L_0x0043
        L_0x01e8:
            r1 = r5 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x003d
            int r1 = X.G9t.A0D(r8, r11)
            r0 = r0 | r1
            goto L_0x003d
        L_0x01f3:
            r1 = r43 & 48
            if (r1 != 0) goto L_0x0037
            r1 = r47
            int r1 = X.G9t.A0P(r8, r1)
            r0 = r0 | r1
            goto L_0x0037
        L_0x0200:
            r0 = r43 & 6
            if (r0 != 0) goto L_0x020c
            int r0 = X.G9t.A0O(r8, r7)
            r0 = r0 | r43
            goto L_0x0031
        L_0x020c:
            r0 = r5
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HXC.A00(X.5Wy, X.5Tq, X.5Z4, X.0sP, X.0sP, X.0sP, X.62P, int, int, int, int, long, boolean):void");
    }
}

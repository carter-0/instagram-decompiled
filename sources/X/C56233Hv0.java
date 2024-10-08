package X;

/* renamed from: X.Hv0  reason: case insensitive filesystem */
public abstract class C56233Hv0 {
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r6 == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0051, code lost:
        if (r6 == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0141, code lost:
        if (r15 == 0) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r27, androidx.compose.ui.Modifier r28, X.AnonymousClass5Z4 r29, X.C62320sa r30, X.C62320sa r31, int r32, int r33, long r34, long r36, boolean r38) {
        /*
            r0 = r36
            r12 = r29
            r8 = r31
            r11 = r30
            r13 = r28
            r2 = -863244978(0xffffffffcc8bed4e, float:-7.3362032E7)
            r9 = r27
            r9.ExV(r2)
            r4 = r33 & 1
            r7 = r32
            r2 = r34
            if (r4 == 0) goto L_0x0166
            r4 = r32 | 6
        L_0x001c:
            r18 = r33 & 2
            if (r18 == 0) goto L_0x015b
            r4 = r4 | 48
        L_0x0022:
            r17 = r33 & 4
            if (r17 == 0) goto L_0x0150
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0028:
            r16 = r33 & 8
            if (r16 == 0) goto L_0x0145
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x002e:
            r5 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x0041
            r5 = r33 & 16
            if (r5 != 0) goto L_0x003e
            boolean r6 = r9.AGu(r12)
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r6 != 0) goto L_0x0040
        L_0x003e:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x0040:
            r4 = r4 | r5
        L_0x0041:
            r5 = 196608(0x30000, float:2.75506E-40)
            r5 = r5 & r32
            if (r5 != 0) goto L_0x0056
            r5 = r33 & 32
            if (r5 != 0) goto L_0x0053
            boolean r6 = r9.AGt(r0)
            r5 = 131072(0x20000, float:1.83671E-40)
            if (r6 != 0) goto L_0x0055
        L_0x0053:
            r5 = 65536(0x10000, float:9.18355E-41)
        L_0x0055:
            r4 = r4 | r5
        L_0x0056:
            r15 = r33 & 64
            r5 = 1572864(0x180000, float:2.204052E-39)
            r6 = r38
            if (r15 != 0) goto L_0x0066
            r5 = r32 & r5
            if (r5 != 0) goto L_0x0067
            int r5 = X.G9t.A0e(r9, r6)
        L_0x0066:
            r4 = r4 | r5
        L_0x0067:
            r5 = 599187(0x92493, float:8.3964E-40)
            r10 = r4 & r5
            r5 = 599186(0x92492, float:8.39638E-40)
            if (r10 != r5) goto L_0x0098
            boolean r5 = r9.Bwn()
            if (r5 == 0) goto L_0x0098
            r9.Evl()
            r26 = r6
        L_0x007c:
            X.5Xd r5 = r9.ASQ()
            if (r5 == 0) goto L_0x0097
            X.JAN r4 = new X.JAN
            r27 = r4
            r28 = r13
            r29 = r12
            r30 = r11
            r31 = r8
            r36 = r0
            r38 = r26
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r36, r38)
            r5.A06 = r4
        L_0x0097:
            return
        L_0x0098:
            r9.Ewr()
            r5 = r32 & 1
            r14 = -458753(0xfffffffffff8ffff, float:NaN)
            r10 = -57345(0xffffffffffff1fff, float:NaN)
            if (r5 == 0) goto L_0x0121
            boolean r5 = r9.Aw3()
            if (r5 != 0) goto L_0x0121
            r9.Evl()
            r5 = r33 & 16
            if (r5 == 0) goto L_0x00b3
            r4 = r4 & r10
        L_0x00b3:
            r5 = r33 & 32
            if (r5 == 0) goto L_0x00b8
            r4 = r4 & r14
        L_0x00b8:
            r26 = r6
        L_0x00ba:
            boolean r5 = X.C51967G9n.A1S(r9)
            if (r5 == 0) goto L_0x00c8
            r6 = 659033737(0x27480e89, float:2.7763455E-15)
            java.lang.String r5 = "com.instagram.barcelona.feed.post.ui.PostCountdown (PostCountdown.kt:32)"
            X.0fL.A01(r6, r5)
        L_0x00c8:
            r5 = 258440403(0xf677cd3, float:1.14132196E-29)
            r9.ExS(r5)
            r5 = r4 & 14
            boolean r5 = X.C51970G9q.A1V(r5)
            java.lang.Object r6 = r9.ECw()
            if (r5 != 0) goto L_0x00de
            java.lang.Object r5 = X.AnonymousClass5XT.A00
            if (r6 != r5) goto L_0x00e7
        L_0x00de:
            r5 = 0
            X.Ine r6 = new X.Ine
            r6.<init>(r2, r5)
            r9.FLL(r6)
        L_0x00e7:
            X.0sa r6 = (X.C62320sa) r6
            boolean r21 = X.C51968G9o.A1Y(r9)
            r22 = 0
            int r10 = r4 << 3
            r4 = r10 & 896(0x380, float:1.256E-42)
            r5 = r4 | 48
            r4 = r10 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r4
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r10
            int r4 = X.C51969G9p.A05(r5, r4, r10)
            int r20 = X.C51973G9u.A02(r10, r4)
            r24 = r0
            r16 = r12
            r17 = r6
            r18 = r11
            r19 = r8
            r14 = r9
            r15 = r13
            A01(r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r26)
            boolean r4 = X.0fL.A02()
            if (r4 == 0) goto L_0x007c
            r4 = 1233101073(0x497fa111, float:1047057.06)
            X.0fL.A00(r4)
            goto L_0x007c
        L_0x0121:
            if (r18 == 0) goto L_0x0125
            X.5Qk r13 = androidx.compose.ui.Modifier.A00
        L_0x0125:
            if (r17 == 0) goto L_0x0129
            X.IpJ r11 = X.C58276IpJ.A00
        L_0x0129:
            if (r16 == 0) goto L_0x012d
            X.IpK r8 = X.C58277IpK.A00
        L_0x012d:
            r5 = r33 & 16
            if (r5 == 0) goto L_0x0136
            X.5Z4 r12 = X.C51966G9m.A0c(r9)
            r4 = r4 & r10
        L_0x0136:
            r5 = r33 & 32
            if (r5 == 0) goto L_0x013f
            long r0 = X.C51966G9m.A0M(r9)
            r4 = r4 & r14
        L_0x013f:
            r26 = 0
            if (r15 != 0) goto L_0x00ba
            goto L_0x00b8
        L_0x0145:
            r5 = r7 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x002e
            int r5 = X.G9t.A0H(r9, r8)
            r4 = r4 | r5
            goto L_0x002e
        L_0x0150:
            r5 = r7 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0028
            int r5 = X.G9t.A0G(r9, r11)
            r4 = r4 | r5
            goto L_0x0028
        L_0x015b:
            r5 = r32 & 48
            if (r5 != 0) goto L_0x0022
            int r5 = X.G9t.A0P(r9, r13)
            r4 = r4 | r5
            goto L_0x0022
        L_0x0166:
            r4 = r32 & 6
            if (r4 != 0) goto L_0x0176
            boolean r4 = r9.AGt(r2)
            int r4 = X.C51970G9q.A05(r4)
            r4 = r4 | r32
            goto L_0x001c
        L_0x0176:
            r4 = r7
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56233Hv0.A00(X.5Wy, androidx.compose.ui.Modifier, X.5Z4, X.0sa, X.0sa, int, int, long, long, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: X.GPe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: X.GPe} */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02e9, code lost:
        if (r6 == 0) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r1 == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        if (r1 == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0181, code lost:
        if (r1 == r7) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0183, code lost:
        r27 = new X.C52359GPe(r50, r24, r10, (X.AnonymousClass4D7) null, 4, r48);
        r4.FLL(r27);
        r27 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0199, code lost:
        X.C51968G9o.A1E(r4, r2, r1, r9);
        r10 = X.C287635aW.A05(r26, X.C51965G9l.A0R(0), (java.lang.String) null, r23, true);
        r9 = X.C287215Zl.A0E;
        r12 = X.C287675aa.A00(r9, false);
        r11 = X.C287425a7.A00(r4);
        r1 = X.C286565Wx.A04(r2);
        r10 = X.C287435a8.A01(r4, r10);
        r14 = X.C287485aD.A00;
        X.C51973G9u.A0z(r4, r2, r14);
        r13 = X.C287485aD.A03;
        r18 = X.C51969G9p.A0w(r4, r12, r1, r13);
        r12 = X.C287485aD.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01cf, code lost:
        if (r2.A0K != false) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01d5, code lost:
        if (X.C51972G9s.A1Q(r4, r11) != false) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01d7, code lost:
        X.C51971G9r.A13(r4, r12, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01da, code lost:
        r11 = X.C287485aD.A04;
        X.C287595aO.A00(r4, r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e3, code lost:
        if (X.C51971G9r.A1W(r21) == false) goto L_0x0298;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01e5, code lost:
        r1 = X.C51965G9l.A0K(r4, 1016176797);
        r15 = X.C287675aa.A00(r9, false);
        r10 = X.C287425a7.A00(r4);
        r9 = X.C286565Wx.A04(r2);
        r1 = X.C287435a8.A01(r4, r1);
        X.C51973G9u.A0z(r4, r2, r14);
        X.C287595aO.A00(r4, r15, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0208, code lost:
        if (X.C51965G9l.A1Y(r4, r2, r9, r18) != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x020e, code lost:
        if (X.C51972G9s.A1Q(r4, r10) != false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0210, code lost:
        X.C51971G9r.A13(r4, r12, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0213, code lost:
        X.C287595aO.A00(r4, r1, r11);
        r35 = ((r8 >> 18) & 14) | ((r8 >> 12) & 112);
        r28 = r25;
        r43 = r16;
        r27 = r4;
        X.C56232Huz.A01(r27, r28, (X.AnonymousClass5ZD) null, (java.lang.String) r22.getValue(), r0, (java.lang.String) r22.getValue(), (X.C62320sa) null, 27648, r35, 992, 0, 0, 0, r43, true, false);
        r8 = (java.lang.String) r22.getValue();
        r1 = (java.lang.String) r22.getValue();
        r10 = X.C51967G9n.A1Y(r4, r0, -1216798674);
        r9 = r4.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0264, code lost:
        if (r10 != false) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0266, code lost:
        if (r9 != r7) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0268, code lost:
        r9 = new X.C58719IwS(r21, r22, r0, 19);
        r4.FLL(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0276, code lost:
        X.C56232Huz.A01(r27, r28, (X.AnonymousClass5ZD) null, r0, r8, r1, X.C51965G9l.A0y(r2, r9, false), 27648, r35, 960, 0, 0, 0, r43, false, false);
        r4.ASN();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x028e, code lost:
        if (X.C51971G9r.A1S(r4, r2, false) == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0290, code lost:
        X.0fL.A00(-204084224);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0298, code lost:
        r4.ExS(1016992686);
        X.AnonymousClass5ZZ.A0D(r4, (androidx.compose.ui.Modifier) null, r25, r0, 1, (r8 >> 12) & 896, (57344 & (r8 >> 3)) | 390, 11258, r16);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r43, androidx.compose.ui.Modifier r44, X.AnonymousClass5Z4 r45, X.C62320sa r46, X.C62320sa r47, X.C62320sa r48, int r49, int r50, long r51, long r53, boolean r55) {
        /*
            r16 = r53
            r25 = r45
            r23 = r48
            r24 = r47
            r26 = r44
            r0 = 388607002(0x1729ac1a, float:5.482407E-25)
            r4 = r43
            r4.ExV(r0)
            r3 = r50
            r0 = r50 & 1
            r50 = r46
            r5 = r49
            if (r0 == 0) goto L_0x0321
            r8 = r49 | 6
        L_0x001e:
            r0 = r3 & 2
            r48 = r51
            if (r0 == 0) goto L_0x0314
            r8 = r8 | 48
        L_0x0026:
            r10 = r3 & 4
            if (r10 == 0) goto L_0x0307
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x002c:
            r9 = r3 & 8
            if (r9 == 0) goto L_0x02fa
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x0032:
            r7 = r3 & 16
            if (r7 == 0) goto L_0x02ed
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
        L_0x0038:
            r0 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x004e
            r0 = r3 & 32
            if (r0 != 0) goto L_0x004b
            r0 = r25
            boolean r1 = r4.AGu(r0)
            r0 = 131072(0x20000, float:1.83671E-40)
            if (r1 != 0) goto L_0x004d
        L_0x004b:
            r0 = 65536(0x10000, float:9.18355E-41)
        L_0x004d:
            r8 = r8 | r0
        L_0x004e:
            r0 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x0064
            r0 = r3 & 64
            if (r0 != 0) goto L_0x0061
            r0 = r16
            boolean r1 = r4.AGt(r0)
            r0 = 1048576(0x100000, float:1.469368E-39)
            if (r1 != 0) goto L_0x0063
        L_0x0061:
            r0 = 524288(0x80000, float:7.34684E-40)
        L_0x0063:
            r8 = r8 | r0
        L_0x0064:
            r6 = r3 & 128(0x80, float:1.794E-43)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r55
            if (r6 != 0) goto L_0x0073
            r0 = r0 & r5
            if (r0 != 0) goto L_0x0074
            int r0 = X.G9t.A0f(r4, r1)
        L_0x0073:
            r8 = r8 | r0
        L_0x0074:
            r0 = 4793491(0x492493, float:6.717112E-39)
            r2 = r8 & r0
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r2 != r0) goto L_0x00ab
            boolean r0 = r4.Bwn()
            if (r0 == 0) goto L_0x00ab
            r4.Evl()
            r47 = r1
        L_0x0089:
            X.5Xd r1 = r4.ASQ()
            if (r1 == 0) goto L_0x00aa
            X.JAw r0 = new X.JAw
            r35 = r0
            r36 = r26
            r37 = r25
            r38 = r50
            r39 = r24
            r40 = r23
            r41 = r5
            r42 = r3
            r43 = r48
            r45 = r16
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r45, r47)
            r1.A06 = r0
        L_0x00aa:
            return
        L_0x00ab:
            r4.Ewr()
            r0 = r5 & 1
            r2 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r0 == 0) goto L_0x02c5
            boolean r0 = r4.Aw3()
            if (r0 != 0) goto L_0x02c5
            r4.Evl()
            r0 = r3 & 32
            if (r0 == 0) goto L_0x00c3
            r8 = r8 & r2
        L_0x00c3:
            r0 = r3 & 64
            if (r0 == 0) goto L_0x00cb
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r8 = r8 & r0
        L_0x00cb:
            r47 = r1
        L_0x00cd:
            boolean r0 = X.C51967G9n.A1S(r4)
            if (r0 == 0) goto L_0x00db
            r1 = 582836739(0x22bd6203, float:5.1332327E-18)
            java.lang.String r0 = "com.instagram.barcelona.feed.post.ui.PostCountdown (PostCountdown.kt:55)"
            X.0fL.A01(r1, r0)
        L_0x00db:
            r0 = 258460240(0xf67ca50, float:1.1428143E-29)
            java.lang.Object r10 = X.C51967G9n.A0m(r4, r0)
            java.lang.Object r7 = X.AnonymousClass5XT.A00
            if (r10 != r7) goto L_0x00ee
            java.lang.Object r0 = r50.invoke()
            androidx.compose.runtime.ParcelableSnapshotMutableState r10 = X.G9t.A0o(r4, r0)
        L_0x00ee:
            X.5Oz r10 = (X.C284945Oz) r10
            r2 = r4
            X.5Wx r2 = (X.C286565Wx) r2
            r6 = 0
            X.C286565Wx.A0L(r2, r6)
            java.lang.Object r0 = r10.getValue()
            long r0 = X.AnonymousClass7TE.A0R(r0)
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            long r18 = r9.toHours(r0)
            long r13 = r9.toMinutes(r0)
            r11 = 60
            long r13 = r13 % r11
            long r0 = r0 % r11
            r11 = 3
            java.lang.Long r12 = java.lang.Long.valueOf(r18)
            java.lang.Long r9 = java.lang.Long.valueOf(r13)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r12, r9, r0}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r11)
            r0 = 44
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.lang.String r0 = java.lang.String.format(r0, r1)
            X.0qQ.A07(r0)
            r1 = 258464899(0xf67dc83, float:1.1431648E-29)
            java.lang.Object r1 = X.C51967G9n.A0m(r4, r1)
            if (r1 != r7) goto L_0x0140
            if (r47 == 0) goto L_0x02c0
            java.lang.String r1 = ""
        L_0x013c:
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = X.G9t.A0o(r4, r1)
        L_0x0140:
            X.5Oz r22 = X.C51965G9l.A0J(r2, r1, r6)
            r1 = 258467651(0xf67e743, float:1.1433719E-29)
            java.lang.Object r1 = X.C51974G9v.A0X(r4, r7, r1, r6)
            X.5Oz r21 = X.C51965G9l.A0J(r2, r1, r6)
            r1 = r22
            boolean r1 = X.C51969G9p.A1T(r1, r0)
            r20 = 1
            if (r1 != 0) goto L_0x0160
            r9 = r21
            r1 = r20
            X.C51967G9n.A16(r9, r1)
        L_0x0160:
            java.lang.Object r1 = r10.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            java.lang.Long r9 = X.C51968G9o.A0v(r1)
            r1 = 258472928(0xf67fbe0, float:1.1437689E-29)
            boolean r11 = X.C51974G9v.A1Y(r4, r1, r8)
            boolean r1 = X.C51973G9u.A1G(r8)
            r11 = r11 | r1
            boolean r1 = X.C51973G9u.A1J(r8)
            r11 = r11 | r1
            java.lang.Object r1 = r4.ECw()
            if (r11 != 0) goto L_0x0183
            if (r1 != r7) goto L_0x0199
        L_0x0183:
            r31 = 0
            r32 = 4
            X.GPe r1 = new X.GPe
            r27 = r1
            r28 = r50
            r29 = r24
            r30 = r10
            r33 = r48
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r4.FLL(r1)
        L_0x0199:
            X.C51968G9o.A1E(r4, r2, r1, r9)
            r19 = 0
            X.5aV r12 = X.C51965G9l.A0R(r6)
            r11 = r26
            r10 = r19
            r9 = r23
            r1 = r20
            androidx.compose.ui.Modifier r10 = X.C287635aW.A05(r11, r12, r10, r9, r1)
            androidx.compose.ui.Alignment r9 = X.C287215Zl.A0E
            X.5RD r12 = X.C287675aa.A00(r9, r6)
            int r11 = X.C287425a7.A00(r4)
            X.5RM r1 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r10 = X.C287435a8.A01(r4, r10)
            X.0sa r14 = X.C287485aD.A00
            X.C51973G9u.A0z(r4, r2, r14)
            X.0sL r13 = X.C287485aD.A03
            X.0sL r18 = X.C51969G9p.A0w(r4, r12, r1, r13)
            X.0sL r12 = X.C287485aD.A02
            boolean r1 = r2.A0K
            if (r1 != 0) goto L_0x01d7
            boolean r1 = X.C51972G9s.A1Q(r4, r11)
            if (r1 != 0) goto L_0x01da
        L_0x01d7:
            X.C51971G9r.A13(r4, r12, r11)
        L_0x01da:
            X.0sL r11 = X.C287485aD.A04
            X.C287595aO.A00(r4, r10, r11)
            boolean r1 = X.C51971G9r.A1W(r21)
            if (r1 == 0) goto L_0x0298
            r1 = 1016176797(0x3c91a09d, float:0.017776782)
            X.5Qk r1 = X.C51965G9l.A0K(r4, r1)
            X.5RD r15 = X.C287675aa.A00(r9, r6)
            int r10 = X.C287425a7.A00(r4)
            X.5RM r9 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r1 = X.C287435a8.A01(r4, r1)
            X.C51973G9u.A0z(r4, r2, r14)
            X.C287595aO.A00(r4, r15, r13)
            r13 = r18
            boolean r9 = X.C51965G9l.A1Y(r4, r2, r9, r13)
            if (r9 != 0) goto L_0x0210
            boolean r9 = X.C51972G9s.A1Q(r4, r10)
            if (r9 != 0) goto L_0x0213
        L_0x0210:
            X.C51971G9r.A13(r4, r12, r10)
        L_0x0213:
            X.C287595aO.A00(r4, r1, r11)
            java.lang.Object r9 = r22.getValue()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r1 = r22.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r37 = 0
            r34 = 27648(0x6c00, float:3.8743E-41)
            int r10 = r8 >> 18
            r35 = r10 & 14
            int r8 = r8 >> 12
            r8 = r8 & 112(0x70, float:1.57E-43)
            r35 = r35 | r8
            r36 = 992(0x3e0, float:1.39E-42)
            r28 = r25
            r29 = r19
            r30 = r9
            r31 = r0
            r32 = r1
            r33 = r19
            r39 = r37
            r41 = r37
            r43 = r16
            r45 = r20
            r46 = r6
            r27 = r4
            X.C56232Huz.A01(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r39, r41, r43, r45, r46)
            java.lang.Object r8 = r22.getValue()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r1 = r22.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r9 = -1216798674(0xffffffffb779202e, float:-1.4849049E-5)
            boolean r10 = X.C51967G9n.A1Y(r4, r0, r9)
            java.lang.Object r9 = r4.ECw()
            if (r10 != 0) goto L_0x0268
            if (r9 != r7) goto L_0x0276
        L_0x0268:
            r11 = 19
            X.IwS r9 = new X.IwS
            r10 = r21
            r7 = r22
            r9.<init>(r10, r7, r0, r11)
            r4.FLL(r9)
        L_0x0276:
            X.0sa r33 = X.C51965G9l.A0y(r2, r9, r6)
            r36 = 960(0x3c0, float:1.345E-42)
            r30 = r0
            r31 = r8
            r32 = r1
            r45 = r6
            X.C56232Huz.A01(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r39, r41, r43, r45, r46)
            r4.ASN()
        L_0x028a:
            boolean r0 = X.C51971G9r.A1S(r4, r2, r6)
            if (r0 == 0) goto L_0x0089
            r0 = -204084224(0xfffffffff3d5ec00, float:-3.3897274E31)
            X.0fL.A00(r0)
            goto L_0x0089
        L_0x0298:
            r1 = 1016992686(0x3c9e13ae, float:0.019296493)
            r4.ExS(r1)
            int r1 = r8 >> 12
            r9 = r1 & 896(0x380, float:1.256E-42)
            r7 = 57344(0xe000, float:8.0356E-41)
            int r1 = r8 >> 3
            r7 = r7 & r1
            r1 = r7 | 390(0x186, float:5.47E-43)
            r34 = 11258(0x2bfa, float:1.5776E-41)
            r27 = r4
            r28 = r19
            r29 = r25
            r30 = r0
            r31 = r20
            r32 = r9
            r33 = r1
            r35 = r16
            X.AnonymousClass5ZZ.A0D(r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x028a
        L_0x02c0:
            r47 = 0
            r1 = r0
            goto L_0x013c
        L_0x02c5:
            if (r10 == 0) goto L_0x02c9
            X.5Qk r26 = androidx.compose.ui.Modifier.A00
        L_0x02c9:
            if (r9 == 0) goto L_0x02cd
            X.IpL r24 = X.C58278IpL.A00
        L_0x02cd:
            if (r7 == 0) goto L_0x02d1
            X.IpM r23 = X.C58279IpM.A00
        L_0x02d1:
            r0 = r3 & 32
            if (r0 == 0) goto L_0x02da
            X.5Z4 r25 = X.C51966G9m.A0c(r4)
            r8 = r8 & r2
        L_0x02da:
            r0 = r3 & 64
            if (r0 == 0) goto L_0x02e7
            long r16 = X.C51966G9m.A0M(r4)
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r0 = r0 & r8
            r8 = r0
        L_0x02e7:
            r47 = 0
            if (r6 != 0) goto L_0x00cd
            goto L_0x00cb
        L_0x02ed:
            r0 = r5 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0038
            r0 = r23
            int r0 = X.G9t.A0I(r4, r0)
            r8 = r8 | r0
            goto L_0x0038
        L_0x02fa:
            r0 = r5 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0032
            r0 = r24
            int r0 = X.G9t.A0H(r4, r0)
            r8 = r8 | r0
            goto L_0x0032
        L_0x0307:
            r0 = r5 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x002c
            r0 = r26
            int r0 = X.G9t.A0Q(r4, r0)
            r8 = r8 | r0
            goto L_0x002c
        L_0x0314:
            r0 = r5 & 48
            if (r0 != 0) goto L_0x0026
            r0 = r48
            int r0 = X.G9t.A0C(r4, r0)
            r8 = r8 | r0
            goto L_0x0026
        L_0x0321:
            r0 = r49 & 6
            if (r0 != 0) goto L_0x032f
            r0 = r50
            int r8 = X.C41848B3p.A01(r4, r0)
            r8 = r8 | r49
            goto L_0x001e
        L_0x032f:
            r8 = r5
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56233Hv0.A01(X.5Wy, androidx.compose.ui.Modifier, X.5Z4, X.0sa, X.0sa, X.0sa, int, int, long, long, boolean):void");
    }
}

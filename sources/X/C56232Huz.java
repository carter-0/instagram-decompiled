package X;

/* renamed from: X.Huz  reason: case insensitive filesystem */
public abstract class C56232Huz {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: X.IoN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v2, resolved type: X.IoN} */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0059, code lost:
        if (r4 == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c0, code lost:
        if (r2 == r5) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01c2, code lost:
        r45 = new X.C58219IoN(r21, r22, r48, r1, r14, 3);
        r0.FLL(r45);
        r45 = r45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d6, code lost:
        A01(r0, (X.AnonymousClass5Z4) null, r27, r1, r9, r8, X.C51965G9l.A0y(r4, r2, false), (r52 | 14158848) | r20, r33, X.C249703kE.FLAG_MOVED, 90, 60, r18, r16, false, r44);
        r0.ASN();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r59, androidx.compose.ui.Modifier r60, X.AnonymousClass5ZD r61, int r62, int r63, int r64, int r65, long r66, long r68, boolean r70) {
        /*
            r16 = r68
            r27 = r61
            r18 = r66
            r11 = r70
            r13 = r63
            r15 = r60
            r1 = 1486357944(0x589805b8, float:1.33720263E15)
            r0 = r59
            r0.ExV(r1)
            r1 = r65 & 1
            r3 = r64
            r14 = r62
            if (r1 == 0) goto L_0x02ab
            r2 = r64 | 6
        L_0x001e:
            r10 = r65 & 2
            if (r10 == 0) goto L_0x02a0
            r2 = r2 | 48
        L_0x0024:
            r9 = r65 & 4
            if (r9 == 0) goto L_0x0295
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x002a:
            r8 = r65 & 8
            if (r8 == 0) goto L_0x028a
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0030:
            r7 = r65 & 16
            if (r7 == 0) goto L_0x0277
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x0036:
            r6 = r65 & 32
            r1 = 196608(0x30000, float:2.75506E-40)
            if (r6 != 0) goto L_0x0046
            r1 = r64 & r1
            if (r1 != 0) goto L_0x0047
            r1 = r27
            int r1 = X.G9t.A0T(r0, r1)
        L_0x0046:
            r2 = r2 | r1
        L_0x0047:
            r1 = 1572864(0x180000, float:2.204052E-39)
            r1 = r64 & r1
            if (r1 != 0) goto L_0x005e
            r1 = r65 & 64
            if (r1 != 0) goto L_0x005b
            r4 = r16
            boolean r4 = r0.AGt(r4)
            r1 = 1048576(0x100000, float:1.469368E-39)
            if (r4 != 0) goto L_0x005d
        L_0x005b:
            r1 = 524288(0x80000, float:7.34684E-40)
        L_0x005d:
            r2 = r2 | r1
        L_0x005e:
            r1 = 599187(0x92493, float:8.3964E-40)
            r4 = r2 & r1
            r1 = 599186(0x92492, float:8.39638E-40)
            if (r4 != r1) goto L_0x0091
            boolean r1 = r0.Bwn()
            if (r1 == 0) goto L_0x0091
            r0.Evl()
        L_0x0071:
            X.5Xd r1 = r0.ASQ()
            if (r1 == 0) goto L_0x0090
            X.JAM r0 = new X.JAM
            r59 = r0
            r60 = r15
            r61 = r27
            r62 = r14
            r63 = r13
            r64 = r3
            r66 = r18
            r68 = r16
            r70 = r11
            r59.<init>(r60, r61, r62, r63, r64, r65, r66, r68, r70)
            r1.A06 = r0
        L_0x0090:
            return
        L_0x0091:
            r0.Ewr()
            r1 = r64 & 1
            r4 = -3670017(0xffffffffffc7ffff, float:NaN)
            r24 = 0
            if (r1 == 0) goto L_0x0258
            boolean r1 = r0.Aw3()
            if (r1 != 0) goto L_0x0258
            r0.Evl()
            r1 = r65 & 64
            if (r1 == 0) goto L_0x00ab
            r2 = r2 & r4
        L_0x00ab:
            boolean r1 = X.C51967G9n.A1S(r0)
            if (r1 == 0) goto L_0x00b9
            r4 = -1354279565(0xffffffffaf475573, float:-1.8129302E-10)
            java.lang.String r1 = "com.instagram.barcelona.feed.post.ui.PostAnimatedCount (PostAnimatedCount.kt:42)"
            X.0fL.A01(r4, r1)
        L_0x00b9:
            android.content.res.Resources r5 = X.C51975G9x.A0B(r0)
            r1 = 1036528649(0x3dc82c09, float:0.09774024)
            r0.ExS(r1)
            r23 = r2 & 14
            r7 = 1
            boolean r4 = X.C51972G9s.A1I(r23)
            java.lang.Object r1 = r0.ECw()
            if (r4 != 0) goto L_0x00d4
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r1 != r4) goto L_0x00dd
        L_0x00d4:
            if (r11 == 0) goto L_0x024a
            if (r62 > 0) goto L_0x024a
            java.lang.String r1 = ""
        L_0x00da:
            r0.FLL(r1)
        L_0x00dd:
            java.lang.String r1 = (java.lang.String) r1
            r4 = r0
            X.5Wx r4 = (X.C286565Wx) r4
            r6 = 0
            X.C286565Wx.A0L(r4, r6)
            r5 = 1036539614(0x3dc856de, float:0.097821936)
            java.lang.Object r8 = X.C51967G9n.A0m(r0, r5)
            java.lang.Object r5 = X.AnonymousClass5XT.A00
            if (r8 != r5) goto L_0x00f9
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
            androidx.compose.runtime.ParcelableSnapshotMutableState r8 = X.G9t.A0o(r0, r8)
        L_0x00f9:
            X.5Oz r48 = X.C51965G9l.A0J(r4, r8, r6)
            r8 = 1036541607(0x3dc85ea7, float:0.097836785)
            java.lang.Object r8 = X.C51967G9n.A0m(r0, r8)
            if (r8 != r5) goto L_0x010a
            androidx.compose.runtime.ParcelableSnapshotMutableState r8 = X.G9t.A0o(r0, r1)
        L_0x010a:
            X.5Oz r22 = X.C51965G9l.A0J(r4, r8, r6)
            r8 = 1036543646(0x3dc8669e, float:0.09785198)
            java.lang.Object r8 = X.C51974G9v.A0X(r0, r5, r8, r6)
            X.5Oz r21 = X.C51965G9l.A0J(r4, r8, r6)
            r8 = r22
            boolean r8 = X.C51969G9p.A1T(r8, r1)
            if (r8 != 0) goto L_0x0126
            r8 = r21
            X.C51967G9n.A16(r8, r7)
        L_0x0126:
            boolean r8 = X.C51971G9r.A1W(r21)
            if (r8 == 0) goto L_0x0211
            r8 = 2068262128(0x7b472cf0, float:1.0341785E36)
            r0.ExS(r8)
            X.5RD r9 = X.C51966G9m.A0a(r6)
            int r12 = X.C287425a7.A00(r0)
            X.5RM r8 = X.C286565Wx.A04(r4)
            androidx.compose.ui.Modifier r10 = X.C287435a8.A01(r0, r15)
            X.C51973G9u.A0y(r0, r4)
            X.C51971G9r.A12(r0, r9, r8)
            X.0sL r9 = X.C287485aD.A02
            boolean r8 = r4.A0K
            if (r8 != 0) goto L_0x0154
            boolean r8 = X.C51972G9s.A1Q(r0, r12)
            if (r8 != 0) goto L_0x0157
        L_0x0154:
            X.C51971G9r.A13(r0, r9, r12)
        L_0x0157:
            X.C51965G9l.A18(r0, r10)
            int r8 = X.C51971G9r.A0B(r48)
            r44 = 0
            if (r14 < r8) goto L_0x0164
            r44 = 1
        L_0x0164:
            java.lang.Object r9 = r22.getValue()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r22.getValue()
            java.lang.String r8 = (java.lang.String) r8
            r35 = 0
            r37 = 60
            r12 = 12585984(0xc00c00, float:1.763672E-38)
            r10 = 234881024(0xe000000, float:1.5777218E-30)
            int r20 = r2 << 12
            r52 = r20 & r10
            r32 = r52 | r12
            r10 = 1879048192(0x70000000, float:1.58456325E29)
            r20 = r20 & r10
            r32 = r32 | r20
            int r2 = r2 >> 18
            r33 = r2 & 14
            r34 = 2144(0x860, float:3.004E-42)
            r25 = r0
            r26 = r24
            r28 = r9
            r29 = r1
            r30 = r8
            r31 = r24
            r39 = r18
            r41 = r16
            r43 = r7
            A01(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r39, r41, r43, r44)
            java.lang.Object r9 = r22.getValue()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r22.getValue()
            java.lang.String r8 = (java.lang.String) r8
            r2 = -539515672(0xffffffffdfd7a4e8, float:-3.10776E19)
            boolean r12 = X.C51967G9n.A1Y(r0, r1, r2)
            r10 = 4
            r2 = r23
            if (r2 == r10) goto L_0x01b9
            r7 = 0
        L_0x01b9:
            r12 = r12 | r7
            java.lang.Object r2 = r0.ECw()
            if (r12 != 0) goto L_0x01c2
            if (r2 != r5) goto L_0x01d6
        L_0x01c2:
            r51 = 3
            X.IoN r2 = new X.IoN
            r45 = r2
            r46 = r21
            r47 = r22
            r49 = r1
            r50 = r14
            r45.<init>(r46, r47, r48, r49, r50, r51)
            r0.FLL(r2)
        L_0x01d6:
            X.0sa r51 = X.C51965G9l.A0y(r4, r2, r6)
            r55 = 90
            r2 = 14158848(0xd80c00, float:1.9840772E-38)
            r52 = r52 | r2
            r52 = r52 | r20
            r54 = 2048(0x800, float:2.87E-42)
            r45 = r0
            r46 = r24
            r47 = r27
            r48 = r1
            r49 = r9
            r50 = r8
            r53 = r33
            r57 = r37
            r59 = r18
            r61 = r16
            r63 = r6
            r64 = r44
            A01(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r57, r59, r61, r63, r64)
            r0.ASN()
        L_0x0203:
            boolean r1 = X.C51967G9n.A1b(r4, r6)
            if (r1 == 0) goto L_0x0071
            r1 = 1317067399(0x4e80da87, float:1.08090253E9)
            X.0fL.A00(r1)
            goto L_0x0071
        L_0x0211:
            r5 = 2069403455(0x7b58973f, float:1.12460376E36)
            r0.ExS(r5)
            r41 = 0
            r33 = 2
            r8 = r2 & 112(0x70, float:1.57E-43)
            int r5 = r2 >> 12
            r5 = r5 & 896(0x380, float:1.256E-42)
            r8 = r8 | r5
            int r5 = r2 >> 3
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            int r34 = X.C51969G9p.A05(r8, r5, r2)
            r35 = 390(0x186, float:5.47E-43)
            r36 = 27600(0x6bd0, float:3.8676E-41)
            r25 = r24
            r26 = r24
            r29 = r24
            r30 = r6
            r31 = r6
            r32 = r7
            r37 = r16
            r39 = r18
            r43 = r6
            r22 = r0
            r23 = r15
            r28 = r1
            X.AnonymousClass5ZZ.A03(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r39, r41, r43)
            goto L_0x0203
        L_0x024a:
            X.0qQ.A0A(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            r1 = 0
            java.lang.String r1 = X.C253673rC.A04(r5, r4, r13, r7, r1)
            goto L_0x00da
        L_0x0258:
            if (r10 == 0) goto L_0x025c
            X.5Qk r15 = androidx.compose.ui.Modifier.A00
        L_0x025c:
            if (r9 == 0) goto L_0x0261
            r13 = 1000000000(0x3b9aca00, float:0.0047237873)
        L_0x0261:
            if (r8 == 0) goto L_0x0264
            r11 = 0
        L_0x0264:
            if (r7 == 0) goto L_0x0268
            long r18 = X.AnonymousClass5Z5.A01
        L_0x0268:
            if (r6 == 0) goto L_0x026c
            r27 = r24
        L_0x026c:
            r1 = r65 & 64
            if (r1 == 0) goto L_0x00ab
            long r16 = X.C51966G9m.A0M(r0)
            r2 = r2 & r4
            goto L_0x00ab
        L_0x0277:
            r1 = r3 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x0036
            r4 = r18
            boolean r4 = r0.AGt(r4)
            r1 = 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x0287
            r1 = 16384(0x4000, float:2.2959E-41)
        L_0x0287:
            r2 = r2 | r1
            goto L_0x0036
        L_0x028a:
            r1 = r3 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x0030
            int r1 = X.G9t.A0b(r0, r11)
            r2 = r2 | r1
            goto L_0x0030
        L_0x0295:
            r1 = r3 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x002a
            int r1 = X.G9t.A07(r0, r13)
            r2 = r2 | r1
            goto L_0x002a
        L_0x02a0:
            r1 = r64 & 48
            if (r1 != 0) goto L_0x0024
            int r1 = X.G9t.A0P(r0, r15)
            r2 = r2 | r1
            goto L_0x0024
        L_0x02ab:
            r1 = r64 & 6
            if (r1 != 0) goto L_0x02b7
            int r2 = X.G9t.A05(r0, r14)
            r2 = r2 | r64
            goto L_0x001e
        L_0x02b7:
            r2 = r3
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56232Huz.A00(X.5Wy, androidx.compose.ui.Modifier, X.5ZD, int, int, int, int, long, long, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: X.5Z4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v23, resolved type: com.instagram.barcelona.feed.post.ui.PostAnimatedCountKt$AnimatedCountLabel$2$2$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v67, resolved type: X.Ixd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v2, resolved type: X.Ixd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r57v2, resolved type: com.instagram.barcelona.feed.post.ui.PostAnimatedCountKt$AnimatedCountLabel$2$2$1} */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02e3, code lost:
        if (r25 != r1.charValue()) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x031b, code lost:
        if (r9 == r8) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x031d, code lost:
        r57 = new com.instagram.barcelona.feed.post.ui.PostAnimatedCountKt$AnimatedCountLabel$2$2$1(r11, r12, r10, r61, r62, r63, r64, (X.AnonymousClass4D7) null, r33, r0, r22, r14);
        r4.FLL(r57);
        r57 = r57;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0337, code lost:
        X.C51968G9o.A1E(r4, r3, r9, r75);
        r40 = java.lang.String.valueOf(r25);
        r13 = X.C51966G9m.A1U(r4, r12, X.C51973G9u.A1T(r4, r11, r10, r4.AGr(r28), X.C51974G9v.A1a(r4, 1734492213, r2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x035b, code lost:
        if ((57344 & r2) == 16384) goto L_0x035f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x035d, code lost:
        r24 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x035f, code lost:
        r13 = r13 | r24;
        r1 = r4.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0365, code lost:
        if (r13 != false) goto L_0x0369;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0367, code lost:
        if (r1 != r8) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0369, code lost:
        r45 = new X.C58792Ixd(r11, r10, r12, r28, r50, r74, r73);
        r4.FLL(r45);
        r45 = r45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x037f, code lost:
        X.AnonymousClass5ZZ.A03(r4, X.C51973G9u.A0D(r3, r27, r1), r29, (X.C268454dQ) null, (X.C291715hl) null, r39, r40, (X.0sP) null, 0, 0, r44, 2, (((r31 << 6) & 896) | ((r2 >> 15) & 7168)) | (458752 & (r2 >> 12)), (57344 & (r31 << 9)) | 390, 11216, r18, r20, 0, false);
        r14 = r14 + r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03c1, code lost:
        if (r0 == r72) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d6, code lost:
        if (r4.AGt(r18) == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00eb, code lost:
        if (r4.AGu(r29) == false) goto L_0x00ed;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r61, X.AnonymousClass5Z4 r62, X.AnonymousClass5ZD r63, java.lang.String r64, java.lang.String r65, java.lang.String r66, X.C62320sa r67, int r68, int r69, int r70, long r71, long r73, long r75, long r77, boolean r79, boolean r80) {
        /*
            r33 = r67
            r22 = r71
            r18 = r77
            r16 = r73
            r20 = r75
            r29 = r62
            r39 = r63
            r7 = 0
            r76 = r65
            r1 = r64
            r0 = r76
            boolean r44 = X.AnonymousClass7TF.A1U(r7, r1, r0)
            r32 = 2
            r75 = r66
            r1 = r75
            r0 = r32
            X.0qQ.A0B(r1, r0)
            r0 = -921259270(0xffffffffc916b2fa, float:-617263.6)
            r4 = r61
            r4.ExV(r0)
            r3 = r4
            X.5Wx r3 = (X.C286565Wx) r3
            boolean r0 = r3.A0K
            if (r0 == 0) goto L_0x041c
            X.5X4 r0 = r3.A0D
            int r0 = r0.A08
            int r8 = -r0
        L_0x0038:
            r5 = r70
            r0 = r70 & 1
            r6 = r68
            if (r0 == 0) goto L_0x040b
            r2 = r68 | 6
        L_0x0042:
            r0 = r70 & 2
            if (r0 == 0) goto L_0x03fe
            r2 = r2 | 48
        L_0x0048:
            r0 = r70 & 4
            if (r0 == 0) goto L_0x03f3
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r0 = r70 & 8
            r74 = r79
            if (r0 == 0) goto L_0x03e6
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0056:
            r0 = r70 & 16
            r73 = r80
            if (r0 == 0) goto L_0x03d9
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x005e:
            r13 = r70 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r13 != 0) goto L_0x006e
            r0 = r68 & r0
            if (r0 != 0) goto L_0x006f
            r0 = r33
            int r0 = X.G9t.A0J(r4, r0)
        L_0x006e:
            r2 = r2 | r0
        L_0x006f:
            r12 = r70 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r12 != 0) goto L_0x0085
            r0 = r68 & r0
            if (r0 != 0) goto L_0x0086
            r0 = r22
            boolean r1 = r4.AGt(r0)
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r1 == 0) goto L_0x0085
            r0 = 1048576(0x100000, float:1.469368E-39)
        L_0x0085:
            r2 = r2 | r0
        L_0x0086:
            r9 = r5 & 128(0x80, float:1.794E-43)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            if (r9 != 0) goto L_0x009c
            r0 = r68 & r0
            if (r0 != 0) goto L_0x009d
            r0 = r16
            boolean r1 = r4.AGt(r0)
            r0 = 4194304(0x400000, float:5.877472E-39)
            if (r1 == 0) goto L_0x009c
            r0 = 8388608(0x800000, float:1.17549435E-38)
        L_0x009c:
            r2 = r2 | r0
        L_0x009d:
            r10 = r5 & 256(0x100, float:3.59E-43)
            r1 = 100663296(0x6000000, float:2.4074124E-35)
            if (r10 != 0) goto L_0x00b3
            r0 = r68 & r1
            if (r0 != 0) goto L_0x00b4
            r0 = r20
            boolean r0 = r4.AGt(r0)
            r1 = 33554432(0x2000000, float:9.403955E-38)
            if (r0 == 0) goto L_0x00b3
            r1 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x00b3:
            r2 = r2 | r1
        L_0x00b4:
            r11 = r5 & 512(0x200, float:7.175E-43)
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r11 != 0) goto L_0x00c4
            r0 = r0 & r68
            if (r0 != 0) goto L_0x00c5
            r0 = r39
            int r0 = X.G9t.A0X(r4, r0)
        L_0x00c4:
            r2 = r2 | r0
        L_0x00c5:
            r56 = r69
            r0 = r69 & 6
            if (r0 != 0) goto L_0x03d5
            r0 = r5 & 1024(0x400, float:1.435E-42)
            if (r0 != 0) goto L_0x00d8
            r0 = r18
            boolean r1 = r4.AGt(r0)
            r0 = 4
            if (r1 != 0) goto L_0x00d9
        L_0x00d8:
            r0 = 2
        L_0x00d9:
            r31 = r69 | r0
        L_0x00db:
            r0 = r69 & 48
            if (r0 != 0) goto L_0x00f1
            r0 = r5 & 2048(0x800, float:2.87E-42)
            if (r0 != 0) goto L_0x00ed
            r0 = r29
            boolean r1 = r4.AGu(r0)
            r0 = 32
            if (r1 != 0) goto L_0x00ef
        L_0x00ed:
            r0 = 16
        L_0x00ef:
            r31 = r31 | r0
        L_0x00f1:
            r1 = 306783379(0x12492493, float:6.34695E-28)
            r1 = r1 & r2
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r0) goto L_0x0135
            r1 = r31 & 19
            r0 = 18
            if (r1 != r0) goto L_0x0135
            boolean r0 = r4.Bwn()
            if (r0 == 0) goto L_0x0135
            r4.Evl()
        L_0x0109:
            X.5Xd r1 = r4.ASQ()
            if (r1 == 0) goto L_0x0134
            X.JCw r0 = new X.JCw
            r48 = r0
            r49 = r29
            r50 = r39
            r51 = r64
            r52 = r76
            r53 = r75
            r54 = r33
            r55 = r6
            r57 = r5
            r58 = r22
            r60 = r16
            r62 = r20
            r64 = r18
            r66 = r74
            r67 = r73
            r48.<init>(r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r60, r62, r64, r66, r67)
            r1.A06 = r0
        L_0x0134:
            return
        L_0x0135:
            r4.Ewr()
            r0 = r68 & 1
            r30 = 0
            if (r0 == 0) goto L_0x01fd
            boolean r0 = r4.Aw3()
            if (r0 != 0) goto L_0x01fd
            r4.Evl()
            r0 = r5 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x014d
            r31 = r31 & -15
        L_0x014d:
            r0 = r5 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0153
            r31 = r31 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0153:
            boolean r0 = X.C51967G9n.A1S(r4)
            if (r0 == 0) goto L_0x0161
            r1 = -1076313566(0xffffffffbfd8c222, float:-1.6934245)
            java.lang.String r0 = "com.instagram.barcelona.feed.post.ui.AnimatedCountLabel (PostAnimatedCount.kt:125)"
            X.0fL.A01(r1, r0)
        L_0x0161:
            X.4cd r1 = X.C51968G9o.A0Y(r4)
            r0 = 1098907648(0x41800000, float:16.0)
            float r28 = r1.F06(r0)
            r9 = 1058642330(0x3f19999a, float:0.6)
            r1 = 1121669909(0x42db5315, float:109.66227)
            r0 = r30
            X.5b7 r61 = X.C51965G9l.A0F(r0, r9, r1)
            r9 = 1062417203(0x3f533333, float:0.825)
            r1 = 1148632440(0x4476bd78, float:986.96045)
            X.5b7 r62 = X.C51965G9l.A0F(r0, r9, r1)
            r9 = 1058642330(0x3f19999a, float:0.6)
            r1 = 1121669909(0x42db5315, float:109.66227)
            X.5b7 r63 = X.C51965G9l.A0F(r0, r9, r1)
            X.5Qk r27 = androidx.compose.ui.Modifier.A00
            X.5RD r10 = X.C51968G9o.A0V(r4)
            int r9 = X.C287425a7.A00(r4)
            X.5RM r1 = X.C286565Wx.A04(r3)
            r0 = r27
            androidx.compose.ui.Modifier r0 = X.C287435a8.A01(r4, r0)
            X.C51973G9u.A0y(r4, r3)
            X.C51971G9r.A12(r4, r10, r1)
            X.0sL r10 = X.C287485aD.A02
            boolean r1 = r3.A0K
            if (r1 != 0) goto L_0x01b1
            boolean r1 = X.C51972G9s.A1Q(r4, r9)
            if (r1 != 0) goto L_0x01b4
        L_0x01b1:
            X.C51971G9r.A13(r4, r10, r9)
        L_0x01b4:
            X.C51965G9l.A18(r4, r0)
            r0 = -2067042291(0xffffffff84cb700d, float:-4.7827973E-36)
            r4.ExS(r0)
            r0 = 1734435999(0x6761649f, float:1.0643886E24)
            r4.ExS(r0)
            int r0 = r64.length()
            int r0 = r0 + -1
            X.2HY r9 = new X.2HY
            r9.<init>(r7, r0)
            java.lang.Object r1 = X.C51966G9m.A15(r4)
            X.5Q8 r0 = X.AnonymousClass5Q8.Rtl
            if (r1 != r0) goto L_0x01da
            X.2HZ r9 = X.C229632nm.A0A(r9)
        L_0x01da:
            X.C286565Wx.A0L(r3, r7)
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0259
            r33.invoke()
            if (r8 >= 0) goto L_0x022f
            int r7 = -r8
            X.5X4 r2 = r3.A0D
        L_0x01eb:
            int r0 = r2.A08
            if (r0 <= r7) goto L_0x03c7
            int[] r1 = r2.A0I
            int r0 = X.AnonymousClass5X4.A00(r2, r0)
            boolean r0 = X.AnonymousClass5X6.A03(r1, r0)
            X.C286565Wx.A0L(r3, r0)
            goto L_0x01eb
        L_0x01fd:
            if (r13 == 0) goto L_0x0201
            X.IpI r33 = X.C58275IpI.A00
        L_0x0201:
            if (r12 == 0) goto L_0x0205
            r22 = 0
        L_0x0205:
            if (r9 == 0) goto L_0x0209
            r16 = 0
        L_0x0209:
            if (r10 == 0) goto L_0x020d
            long r20 = X.AnonymousClass5Z5.A01
        L_0x020d:
            if (r11 == 0) goto L_0x0211
            r39 = r30
        L_0x0211:
            r0 = r5 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x021b
            long r18 = X.C51966G9m.A0M(r4)
            r31 = r31 & -15
        L_0x021b:
            r0 = r5 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0153
            X.4bM r0 = X.AnonymousClass5ZZ.A00
            java.lang.Object r29 = r4.AJO(r0)
            r0 = r29
            X.5Z4 r0 = (X.AnonymousClass5Z4) r0
            r29 = r0
            r31 = r31 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0153
        L_0x022f:
            boolean r0 = r3.A0K
            if (r0 == 0) goto L_0x0249
            X.5X4 r2 = r3.A0D
        L_0x0235:
            boolean r0 = r3.A0K
            if (r0 == 0) goto L_0x0249
            int r0 = r2.A08
            int[] r1 = r2.A0I
            int r0 = X.AnonymousClass5X4.A00(r2, r0)
            boolean r0 = X.AnonymousClass5X6.A03(r1, r0)
            X.C286565Wx.A0L(r3, r0)
            goto L_0x0235
        L_0x0249:
            X.5X3 r2 = r3.A0B
        L_0x024b:
            int r1 = r2.A05
            if (r1 <= r8) goto L_0x03c7
            int[] r0 = r2.A0A
            boolean r0 = X.AnonymousClass5X6.A03(r0, r1)
            X.C286565Wx.A0L(r3, r0)
            goto L_0x024b
        L_0x0259:
            r0 = 1734444284(0x676184fc, float:1.0649856E24)
            r4.ExS(r0)
            int r0 = r9.A00
            int r1 = r9.A01
            r72 = r1
            int r1 = r9.A02
            r26 = r1
            if (r1 <= 0) goto L_0x027d
            r1 = r72
            if (r0 <= r1) goto L_0x0283
        L_0x026f:
            X.C286565Wx.A0L(r3, r7)
            boolean r0 = X.C51971G9r.A1S(r4, r3, r7)
            if (r0 == 0) goto L_0x0109
            r0 = 1683849735(0x645d8207, float:1.63444E22)
            goto L_0x03d0
        L_0x027d:
            if (r1 >= 0) goto L_0x026f
            r1 = r72
            if (r1 > r0) goto L_0x026f
        L_0x0283:
            r14 = 0
        L_0x0285:
            r1 = r64
            char r25 = r1.charAt(r0)
            r1 = 1734444434(0x67618592, float:1.0649964E24)
            java.lang.Object r1 = X.C51967G9n.A0m(r4, r1)
            java.lang.Object r8 = X.AnonymousClass5XT.A00
            java.lang.Object r12 = X.C51975G9x.A0e(r4, r1, r8)
            X.5b4 r12 = (X.AnonymousClass5b4) r12
            X.C286565Wx.A0L(r3, r7)
            r1 = 1734446162(0x67618c52, float:1.0651209E24)
            java.lang.Object r1 = X.C51967G9n.A0m(r4, r1)
            java.lang.Object r11 = X.C51975G9x.A0e(r4, r1, r8)
            X.5b4 r11 = (X.AnonymousClass5b4) r11
            X.C286565Wx.A0L(r3, r7)
            r1 = 1734447922(0x67619332, float:1.0652477E24)
            java.lang.Object r1 = X.C51967G9n.A0m(r4, r1)
            java.lang.Object r10 = X.C51975G9x.A0e(r4, r1, r8)
            X.5b4 r10 = (X.AnonymousClass5b4) r10
            X.C286565Wx.A0L(r3, r7)
            r1 = 1734449671(0x67619a07, float:1.06537376E24)
            java.lang.Object r1 = X.C51967G9n.A0m(r4, r1)
            r24 = 1
            if (r1 != r8) goto L_0x02ea
            if (r0 < 0) goto L_0x02e5
            int r1 = r76.length()
            if (r0 >= r1) goto L_0x02e5
            r1 = r76
            char r1 = r1.charAt(r0)
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            if (r1 == 0) goto L_0x02e5
            char r13 = r1.charValue()
            r9 = 0
            r1 = r25
            if (r1 == r13) goto L_0x02e6
        L_0x02e5:
            r9 = 1
        L_0x02e6:
            java.lang.Boolean r1 = X.C51967G9n.A0e(r4, r9)
        L_0x02ea:
            boolean r50 = X.AnonymousClass7TE.A1a(r1)
            X.C286565Wx.A0L(r3, r7)
            r1 = 1734454541(0x6761ad0d, float:1.0657247E24)
            r4.ExS(r1)
            boolean r9 = X.C51973G9u.A1K(r2)
            boolean r1 = r4.AGt(r14)
            boolean r1 = X.C51968G9o.A1T(r4, r11, r9, r1)
            boolean r9 = r4.AGs(r0)
            r1 = r1 | r9
            boolean r9 = X.C51973G9u.A1G(r2)
            r1 = r1 | r9
            boolean r9 = X.C51974G9v.A1T(r2)
            boolean r1 = X.C51973G9u.A1T(r4, r12, r10, r1, r9)
            java.lang.Object r9 = r4.ECw()
            if (r1 != 0) goto L_0x031d
            if (r9 != r8) goto L_0x0337
        L_0x031d:
            com.instagram.barcelona.feed.post.ui.PostAnimatedCountKt$AnimatedCountLabel$2$2$1 r9 = new com.instagram.barcelona.feed.post.ui.PostAnimatedCountKt$AnimatedCountLabel$2$2$1
            r57 = r9
            r58 = r11
            r59 = r12
            r60 = r10
            r65 = r30
            r66 = r33
            r67 = r0
            r68 = r22
            r70 = r14
            r57.<init>(r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r70)
            r4.FLL(r9)
        L_0x0337:
            r1 = r75
            X.C51968G9o.A1E(r4, r3, r9, r1)
            java.lang.String r40 = java.lang.String.valueOf(r25)
            r1 = 1734492213(0x67624035, float:1.0684392E24)
            boolean r9 = X.C51974G9v.A1a(r4, r1, r2)
            r1 = r28
            boolean r1 = r4.AGr(r1)
            boolean r1 = X.C51973G9u.A1T(r4, r11, r10, r1, r9)
            boolean r13 = X.C51966G9m.A1U(r4, r12, r1)
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r2
            r9 = 16384(0x4000, float:2.2959E-41)
            if (r1 == r9) goto L_0x035f
            r24 = 0
        L_0x035f:
            r13 = r13 | r24
            java.lang.Object r1 = r4.ECw()
            if (r13 != 0) goto L_0x0369
            if (r1 != r8) goto L_0x037f
        L_0x0369:
            X.Ixd r1 = new X.Ixd
            r45 = r1
            r46 = r11
            r47 = r10
            r48 = r12
            r49 = r28
            r51 = r74
            r52 = r73
            r45.<init>(r46, r47, r48, r49, r50, r51, r52)
            r4.FLL(r1)
        L_0x037f:
            r8 = r27
            androidx.compose.ui.Modifier r35 = X.C51973G9u.A0D(r3, r8, r1)
            r53 = 0
            int r1 = r31 << 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            int r8 = r2 >> 15
            r8 = r8 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r8
            r9 = 458752(0x70000, float:6.42848E-40)
            int r8 = r2 >> 12
            r9 = r9 & r8
            r1 = r1 | r9
            r8 = 57344(0xe000, float:8.0356E-41)
            int r9 = r31 << 9
            r8 = r8 & r9
            r8 = r8 | 390(0x186, float:5.47E-43)
            r48 = 11216(0x2bd0, float:1.5717E-41)
            r38 = r30
            r41 = r30
            r42 = r7
            r43 = r7
            r45 = r32
            r46 = r1
            r47 = r8
            r49 = r18
            r51 = r20
            r55 = r7
            r34 = r4
            r36 = r29
            r37 = r30
            X.AnonymousClass5ZZ.A03(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r51, r53, r55)
            long r14 = r14 + r16
            r1 = r72
            if (r0 == r1) goto L_0x026f
            int r0 = r0 + r26
            goto L_0x0285
        L_0x03c7:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0109
            r0 = 1259009405(0x4b0af57d, float:9106813.0)
        L_0x03d0:
            X.0fL.A00(r0)
            goto L_0x0109
        L_0x03d5:
            r31 = r56
            goto L_0x00db
        L_0x03d9:
            r0 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x005e
            r0 = r73
            int r0 = X.G9t.A0c(r4, r0)
            r2 = r2 | r0
            goto L_0x005e
        L_0x03e6:
            r0 = r6 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0056
            r0 = r74
            int r0 = X.G9t.A0b(r4, r0)
            r2 = r2 | r0
            goto L_0x0056
        L_0x03f3:
            r0 = r6 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x004e
            int r0 = X.G9t.A0Q(r4, r1)
            r2 = r2 | r0
            goto L_0x004e
        L_0x03fe:
            r0 = r68 & 48
            if (r0 != 0) goto L_0x0048
            r0 = r76
            int r0 = X.G9t.A0P(r4, r0)
            r2 = r2 | r0
            goto L_0x0048
        L_0x040b:
            r0 = r68 & 6
            if (r0 != 0) goto L_0x0419
            r0 = r64
            int r2 = X.G9t.A0O(r4, r0)
            r2 = r2 | r68
            goto L_0x0042
        L_0x0419:
            r2 = r6
            goto L_0x0042
        L_0x041c:
            X.5X3 r0 = r3.A0B
            int r8 = r0.A05
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56232Huz.A01(X.5Wy, X.5Z4, X.5ZD, java.lang.String, java.lang.String, java.lang.String, X.0sa, int, int, int, long, long, long, long, boolean, boolean):void");
    }
}

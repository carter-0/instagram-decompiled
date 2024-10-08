package X;

/* renamed from: X.6D1  reason: invalid class name */
public abstract class AnonymousClass6D1 {
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C286575Wy r21, androidx.compose.ui.Modifier r22, X.AnonymousClass6D6 r23, java.lang.String r24, X.C62320sa r25, X.C62320sa r26, X.0sK r27, float r28, int r29, int r30, int r31, boolean r32) {
        /*
            r0 = r32
            r5 = r22
            r1 = 523049613(0x1f2d1a8d, float:3.6656137E-20)
            r6 = r21
            r6.ExV(r1)
            r1 = r31
            r3 = r31 & 1
            r13 = r25
            r2 = r30
            if (r3 == 0) goto L_0x0171
            r7 = r30 | 6
        L_0x0018:
            r3 = r31 & 2
            r12 = r26
            if (r3 == 0) goto L_0x0160
            r7 = r7 | 48
        L_0x0020:
            r3 = r31 & 4
            r4 = r24
            if (r3 == 0) goto L_0x014f
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x0028:
            r8 = r31 & 8
            r3 = r29
            if (r8 == 0) goto L_0x013e
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x0030:
            r8 = r31 & 16
            r10 = r28
            if (r8 == 0) goto L_0x012d
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x0038:
            r9 = r31 & 32
            r8 = 196608(0x30000, float:2.75506E-40)
            r14 = r23
            if (r9 != 0) goto L_0x004e
            r8 = r30 & r8
            if (r8 != 0) goto L_0x004f
            boolean r9 = r6.AGu(r14)
            r8 = 65536(0x10000, float:9.18355E-41)
            if (r9 == 0) goto L_0x004e
            r8 = 131072(0x20000, float:1.83671E-40)
        L_0x004e:
            r7 = r7 | r8
        L_0x004f:
            r16 = r31 & 64
            r8 = 1572864(0x180000, float:2.204052E-39)
            if (r16 != 0) goto L_0x0063
            r8 = r8 & r30
            if (r8 != 0) goto L_0x0064
            boolean r9 = r6.AGu(r5)
            r8 = 524288(0x80000, float:7.34684E-40)
            if (r9 == 0) goto L_0x0063
            r8 = 1048576(0x100000, float:1.469368E-39)
        L_0x0063:
            r7 = r7 | r8
        L_0x0064:
            r9 = r1 & 128(0x80, float:1.794E-43)
            r11 = 12582912(0xc00000, float:1.7632415E-38)
            if (r9 != 0) goto L_0x0078
            r8 = r30 & r11
            if (r8 != 0) goto L_0x0079
            boolean r8 = r6.AGv(r0)
            r11 = 4194304(0x400000, float:5.877472E-39)
            if (r8 == 0) goto L_0x0078
            r11 = 8388608(0x800000, float:1.17549435E-38)
        L_0x0078:
            r7 = r7 | r11
        L_0x0079:
            r15 = r1 & 256(0x100, float:3.59E-43)
            r8 = 100663296(0x6000000, float:2.4074124E-35)
            r11 = r27
            if (r15 != 0) goto L_0x008f
            r8 = r30 & r8
            if (r8 != 0) goto L_0x0090
            boolean r15 = r6.AGw(r11)
            r8 = 33554432(0x2000000, float:9.403955E-38)
            if (r15 == 0) goto L_0x008f
            r8 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x008f:
            r7 = r7 | r8
        L_0x0090:
            r15 = 38347923(0x2492493, float:1.4777644E-37)
            r15 = r15 & r7
            r8 = 38347922(0x2492492, float:1.4777643E-37)
            if (r15 != r8) goto L_0x00c6
            boolean r8 = r6.Bwn()
            if (r8 == 0) goto L_0x00c6
            r6.Evl()
        L_0x00a2:
            X.5Xd r6 = r6.ASQ()
            if (r6 == 0) goto L_0x00c5
            X.JBT r15 = new X.JBT
            r17 = r14
            r18 = r4
            r19 = r13
            r20 = r12
            r21 = r11
            r22 = r10
            r23 = r3
            r24 = r2
            r25 = r1
            r26 = r0
            r16 = r5
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r6.A06 = r15
        L_0x00c5:
            return
        L_0x00c6:
            if (r16 == 0) goto L_0x00ca
            X.5Qk r5 = androidx.compose.ui.Modifier.A00
        L_0x00ca:
            if (r9 == 0) goto L_0x00cd
            r0 = 1
        L_0x00cd:
            boolean r8 = X.0fL.A02()
            if (r8 == 0) goto L_0x00db
            r9 = 1495285755(0x59203ffb, float:2.81914647E15)
            java.lang.String r8 = "com.instagram.barcelona.feed.post.ui.SingleMedia (PostSingleMedia.kt:502)"
            X.0fL.A01(r9, r8)
        L_0x00db:
            java.lang.String r8 = "post"
            java.lang.String r20 = X.002.A0R(r8, r4)
            X.5Zr r8 = X.C287215Zl.A02
            r21 = 0
            androidx.compose.ui.Modifier r18 = X.C287205Zk.A00(r8, r5)
            r24 = 1090519040(0x41000000, float:8.0)
            X.5b7 r15 = X.AnonymousClass6DA.A03
            X.5b7 r16 = X.AnonymousClass6DA.A02
            r9 = 447956259(0x1ab34523, float:7.414436E-23)
            X.6DB r8 = new X.6DB
            r25 = r8
            r26 = r14
            r27 = r13
            r28 = r12
            r29 = r11
            r30 = r10
            r31 = r3
            r32 = r0
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            X.5PJ r23 = X.AnonymousClass5PI.A01(r6, r8, r9)
            r8 = 100666368(0x6000c00, float:2.408294E-35)
            int r7 = r7 >> 6
            r25 = r7 & 14
            r25 = r25 | r8
            r26 = 144(0x90, float:2.02E-43)
            r22 = r21
            r19 = r4
            r17 = r6
            X.AnonymousClass6DA.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r7 = X.0fL.A02()
            if (r7 == 0) goto L_0x00a2
            r7 = 1322984374(0x4edb23b6, float:1.83827533E9)
            X.0fL.A00(r7)
            goto L_0x00a2
        L_0x012d:
            r8 = r2 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x0038
            boolean r9 = r6.AGr(r10)
            r8 = 8192(0x2000, float:1.14794E-41)
            if (r9 == 0) goto L_0x013b
            r8 = 16384(0x4000, float:2.2959E-41)
        L_0x013b:
            r7 = r7 | r8
            goto L_0x0038
        L_0x013e:
            r8 = r2 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0030
            boolean r9 = r6.AGs(r3)
            r8 = 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x014c
            r8 = 2048(0x800, float:2.87E-42)
        L_0x014c:
            r7 = r7 | r8
            goto L_0x0030
        L_0x014f:
            r3 = r2 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0028
            boolean r8 = r6.AGu(r4)
            r3 = 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x015d
            r3 = 256(0x100, float:3.59E-43)
        L_0x015d:
            r7 = r7 | r3
            goto L_0x0028
        L_0x0160:
            r3 = r30 & 48
            if (r3 != 0) goto L_0x0020
            boolean r4 = r6.AGw(r12)
            r3 = 16
            if (r4 == 0) goto L_0x016e
            r3 = 32
        L_0x016e:
            r7 = r7 | r3
            goto L_0x0020
        L_0x0171:
            r3 = r30 & 6
            if (r3 != 0) goto L_0x0181
            boolean r3 = r6.AGw(r13)
            r7 = 2
            if (r3 == 0) goto L_0x017d
            r7 = 4
        L_0x017d:
            r7 = r7 | r30
            goto L_0x0018
        L_0x0181:
            r7 = r2
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6D1.A02(X.5Wy, androidx.compose.ui.Modifier, X.6D6, java.lang.String, X.0sa, X.0sa, X.0sK, float, int, int, int, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: X.Inm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v69, resolved type: X.Inm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: X.9N0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v3, resolved type: X.9N0} */
    /* JADX WARNING: type inference failed for: r19v1 */
    /* JADX WARNING: type inference failed for: r13v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x037c, code lost:
        if (r13 == X.AnonymousClass5XT.A00) goto L_0x037e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0496, code lost:
        if (r0 == X.AnonymousClass5XT.A00) goto L_0x0498;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x016b, code lost:
        if (r37 == null) goto L_0x016d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x04ba  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x04cd  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x04f3  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0506  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0519  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x052c  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x053d  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x054e  */
    /* JADX WARNING: Removed duplicated region for block: B:364:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r64, androidx.compose.ui.Modifier r65, com.instagram.api.schemas.LineType r66, X.AnonymousClass6D0 r67, X.C303846Ba r68, X.C299515vK r69, java.lang.String r70, X.C62320sa r71, X.C62320sa r72, X.0sP r73, X.0sP r74, X.0sL r75, X.0sK r76, int r77, int r78, int r79, boolean r80, boolean r81, boolean r82, boolean r83, boolean r84, boolean r85, boolean r86) {
        /*
            r21 = r65
            r62 = r71
            r24 = r84
            r61 = r72
            r23 = r85
            r25 = r83
            r22 = r86
            r4 = 0
            r63 = r70
            r0 = r63
            X.0qQ.A0B(r0, r4)
            r27 = 1
            r1 = r66
            r0 = r27
            X.0qQ.A0B(r1, r0)
            r11 = 4
            r8 = r69
            X.0qQ.A0B(r8, r11)
            r1 = 11
            r60 = r74
            r0 = r60
            X.0qQ.A0B(r0, r1)
            r0 = -1158937139(0xffffffffbaec05cd, float:-0.00180071)
            r9 = r64
            r9.ExV(r0)
            r5 = r79
            r0 = r79 & 1
            r7 = r77
            if (r0 == 0) goto L_0x05f9
            r3 = r77 | 6
        L_0x0040:
            r0 = r79 & 2
            r2 = 32
            if (r0 == 0) goto L_0x05e6
            r3 = r3 | 48
        L_0x0048:
            r0 = r79 & 4
            r10 = 128(0x80, float:1.794E-43)
            r58 = r80
            if (r0 == 0) goto L_0x05d3
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0052:
            r0 = r79 & 8
            r65 = r67
            if (r0 == 0) goto L_0x05c0
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x005a:
            r0 = r79 & 16
            if (r0 == 0) goto L_0x05af
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0060:
            r0 = r79 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            r64 = r68
            if (r0 == 0) goto L_0x059c
            r3 = r3 | r16
        L_0x006a:
            r0 = r79 & 64
            r15 = 1572864(0x180000, float:2.204052E-39)
            r29 = r81
            if (r0 == 0) goto L_0x0589
            r3 = r3 | r15
        L_0x0073:
            r0 = r5 & 128(0x80, float:1.794E-43)
            r14 = 12582912(0xc00000, float:1.7632415E-38)
            r28 = r82
            if (r0 == 0) goto L_0x0576
            r3 = r3 | r14
        L_0x007c:
            r0 = r5 & 256(0x100, float:3.59E-43)
            r26 = 100663296(0x6000000, float:2.4074124E-35)
            r30 = r76
            if (r0 == 0) goto L_0x0563
            r3 = r3 | r26
        L_0x0086:
            r0 = r5 & 512(0x200, float:7.175E-43)
            r1 = 805306368(0x30000000, float:4.656613E-10)
            r31 = r73
            if (r0 != 0) goto L_0x009e
            r1 = r1 & r77
            if (r1 != 0) goto L_0x009f
            r0 = r31
            boolean r0 = r9.AGw(r0)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            if (r0 == 0) goto L_0x009e
            r1 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x009e:
            r3 = r3 | r1
        L_0x009f:
            r0 = r5 & 1024(0x400, float:1.435E-42)
            r59 = r75
            r6 = r78
            if (r0 == 0) goto L_0x054e
            r1 = r78 | 6
        L_0x00a9:
            r0 = r5 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x053d
            r1 = r1 | 48
        L_0x00af:
            r2 = r5 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x052c
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x00b5:
            r12 = r5 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x0519
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x00bb:
            r13 = r5 & 16384(0x4000, float:2.2959E-41)
            if (r13 == 0) goto L_0x0506
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x00c1:
            r0 = 32768(0x8000, float:4.5918E-41)
            r18 = r79 & r0
            if (r18 == 0) goto L_0x04f3
            r1 = r1 | r16
        L_0x00ca:
            r0 = 65536(0x10000, float:9.18355E-41)
            r17 = r79 & r0
            if (r17 == 0) goto L_0x04e0
            r1 = r1 | r15
        L_0x00d1:
            r10 = 131072(0x20000, float:1.83671E-40)
            r16 = r79 & r10
            if (r16 == 0) goto L_0x04cd
            r1 = r1 | r14
        L_0x00d8:
            r0 = 262144(0x40000, float:3.67342E-40)
            r15 = r79 & r0
            if (r15 == 0) goto L_0x04ba
            r1 = r1 | r26
        L_0x00e0:
            r0 = 306783379(0x12492493, float:6.34695E-28)
            r14 = r3 & r0
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r14 != r0) goto L_0x0138
            r14 = 38347923(0x2492493, float:1.4777644E-37)
            r14 = r14 & r1
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r14 != r0) goto L_0x0138
            boolean r0 = r9.Bwn()
            if (r0 == 0) goto L_0x0138
            r9.Evl()
        L_0x00fc:
            X.5Xd r1 = r9.ASQ()
            if (r1 == 0) goto L_0x0137
            X.JDe r0 = new X.JDe
            r32 = r66
            r33 = r65
            r34 = r64
            r35 = r8
            r36 = r63
            r37 = r62
            r38 = r61
            r39 = r31
            r40 = r60
            r41 = r59
            r42 = r30
            r43 = r7
            r44 = r6
            r45 = r5
            r46 = r58
            r47 = r29
            r48 = r28
            r49 = r25
            r50 = r24
            r51 = r23
            r52 = r22
            r30 = r0
            r31 = r21
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            r1.A06 = r0
        L_0x0137:
            return
        L_0x0138:
            if (r2 == 0) goto L_0x013c
            X.5Qk r21 = androidx.compose.ui.Modifier.A00
        L_0x013c:
            r2 = 0
            if (r12 == 0) goto L_0x0141
            r62 = r2
        L_0x0141:
            if (r13 == 0) goto L_0x0145
            r61 = r2
        L_0x0145:
            if (r18 == 0) goto L_0x0149
            r25 = 0
        L_0x0149:
            if (r17 == 0) goto L_0x014d
            r24 = 0
        L_0x014d:
            if (r16 == 0) goto L_0x0151
            r23 = 1
        L_0x0151:
            if (r15 == 0) goto L_0x0155
            r22 = 1
        L_0x0155:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0163
            r12 = 1298600687(0x4d6712ef, float:2.42298608E8)
            java.lang.String r0 = "com.instagram.barcelona.feed.post.ui.PostSingleMedia (PostSingleMedia.kt:215)"
            X.0fL.A01(r12, r0)
        L_0x0163:
            java.lang.String r37 = r8.AXm()
            if (r82 == 0) goto L_0x016d
            r45 = 1
            if (r37 != 0) goto L_0x016f
        L_0x016d:
            r45 = 0
        L_0x016f:
            boolean r20 = X.AnonymousClass9JJ.A00(r4, r8)
            if (r20 != 0) goto L_0x04b6
            boolean r0 = r8 instanceof X.AnonymousClass6D4
            if (r0 != 0) goto L_0x04b6
            boolean r0 = r8 instanceof X.AnonymousClass6D5
            if (r0 != 0) goto L_0x04b6
            r0 = r27
            boolean r0 = X.AnonymousClass9JJ.A00(r0, r8)
            if (r0 != 0) goto L_0x04b2
            boolean r0 = r8 instanceof X.AnonymousClass6D2
            if (r0 != 0) goto L_0x04b2
            boolean r0 = r8 instanceof X.AnonymousClass6D3
            if (r0 != 0) goto L_0x04b2
            r13 = r2
        L_0x018e:
            r0 = 1796903996(0x6b1a943c, float:1.868746E26)
            r9.ExS(r0)
            if (r25 != 0) goto L_0x0469
            if (r24 != 0) goto L_0x0469
            r19 = r2
        L_0x019a:
            r0 = r9
            X.5Wx r0 = (X.C286565Wx) r0
            X.C286565Wx.A0L(r0, r4)
            r12 = 1796916320(0x6b1ac460, float:1.8710193E26)
            r9.ExS(r12)
            if (r25 != 0) goto L_0x042b
            if (r24 != 0) goto L_0x042b
            r10 = r2
        L_0x01ab:
            X.C286565Wx.A0L(r0, r4)
            if (r25 == 0) goto L_0x03e6
            r1 = -129761927(0xfffffffff843fd79, float:-1.5900608E34)
            r9.ExS(r1)
            r1 = 1796929751(0x6b1af8d7, float:1.8734969E26)
            r9.ExS(r1)
            r1 = r3 & 14
            r12 = 0
            if (r1 != r11) goto L_0x01c2
            r12 = 1
        L_0x01c2:
            boolean r1 = r9.AGu(r13)
            r12 = r12 | r1
            java.lang.Object r1 = r9.ECw()
            if (r12 != 0) goto L_0x01d1
            java.lang.Object r12 = X.AnonymousClass5XT.A00
            if (r1 != r12) goto L_0x01dd
        L_0x01d1:
            r14 = 15
            X.Phi r1 = new X.Phi
            r12 = r63
            r1.<init>(r12, r13, r14)
            r9.FLL(r1)
        L_0x01dd:
            X.0sa r1 = (X.C62320sa) r1
            X.C286565Wx.A0L(r0, r4)
            X.C286565Wx.A0L(r0, r4)
        L_0x01e5:
            r12 = r27
            boolean r15 = X.AnonymousClass9JJ.A00(r12, r8)
            if (r15 == 0) goto L_0x03a9
            r12 = 1796940324(0x6b1b2224, float:1.8754473E26)
            r9.ExS(r12)
            r12 = r8
            X.9JJ r12 = (X.AnonymousClass9JJ) r12
            java.lang.Object r12 = r12.A06
            X.6D8 r16 = X.C56235Hv2.A00(r9, r12, r4)
            X.C286565Wx.A0L(r0, r4)
        L_0x01ff:
            r12 = 1796950681(0x6b1b4a99, float:1.8773578E26)
            r9.ExS(r12)
            if (r15 != 0) goto L_0x020f
            boolean r12 = r8 instanceof X.AnonymousClass6D2
            if (r12 != 0) goto L_0x020f
            boolean r12 = r8 instanceof X.AnonymousClass6D3
            if (r12 == 0) goto L_0x03a3
        L_0x020f:
            if (r16 == 0) goto L_0x03a3
            r17 = 0
            r54 = 12
            r46 = r9
            r47 = r16
            r48 = r63
            r49 = r19
            r50 = r10
            r51 = r10
            r52 = r1
            r53 = r4
            r55 = r4
            X.6D9 r18 = X.HVC.A00(r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
        L_0x022b:
            X.C286565Wx.A0L(r0, r4)
            r12 = r65
            int r12 = r12.A01
            r55 = r12
            r12 = r65
            float r12 = r12.A00
            r54 = r12
            boolean r12 = r8 instanceof X.AnonymousClass6D2
            if (r12 != 0) goto L_0x039f
            boolean r12 = r8 instanceof X.AnonymousClass6D3
            if (r12 != 0) goto L_0x039f
            if (r15 != 0) goto L_0x039f
            boolean r12 = r8 instanceof X.AnonymousClass6D4
            if (r12 != 0) goto L_0x039b
            boolean r12 = r8 instanceof X.AnonymousClass6D5
            if (r12 != 0) goto L_0x039b
            if (r20 != 0) goto L_0x039b
            boolean r12 = r8 instanceof X.C53489GpL
            if (r12 == 0) goto L_0x060e
            X.6D6 r49 = X.AnonymousClass6D6.Gif
        L_0x0254:
            r12 = 1796987162(0x6b1bd91a, float:1.8840874E26)
            r9.ExS(r12)
            if (r76 != 0) goto L_0x0348
            r13 = r2
        L_0x025d:
            X.C286565Wx.A0L(r0, r4)
            r11 = 1797000103(0x6b1c0ba7, float:1.8864745E26)
            r9.ExS(r11)
            r11 = 1797000157(0x6b1c0bdd, float:1.8864845E26)
            r9.ExS(r11)
            if (r20 == 0) goto L_0x031f
            r11 = 1
        L_0x026f:
            X.C286565Wx.A0L(r0, r4)
            if (r11 == 0) goto L_0x02ac
            if (r73 == 0) goto L_0x02ac
            r2 = 1797011086(0x6b1c368e, float:1.8885006E26)
            r9.ExS(r2)
            r11 = 1879048192(0x70000000, float:1.58456325E29)
            r11 = r11 & r3
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r12 = 0
            if (r11 != r2) goto L_0x0285
            r12 = 1
        L_0x0285:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r3
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r11 != r2) goto L_0x028f
            r17 = 1
        L_0x028f:
            r12 = r12 | r17
            java.lang.Object r2 = r9.ECw()
            if (r12 != 0) goto L_0x029b
            java.lang.Object r11 = X.AnonymousClass5XT.A00
            if (r2 != r11) goto L_0x02a7
        L_0x029b:
            r12 = 13
            X.IwP r2 = new X.IwP
            r11 = r31
            r2.<init>((int) r12, (java.lang.Object) r8, (java.lang.Object) r11)
            r9.FLL(r2)
        L_0x02a7:
            X.0sa r2 = (X.C62320sa) r2
            X.C286565Wx.A0L(r0, r4)
        L_0x02ac:
            X.C286565Wx.A0L(r0, r4)
            if (r81 == 0) goto L_0x031c
            java.lang.Integer r11 = X.AnonymousClass05K.A0C
        L_0x02b3:
            r0 = r66
            java.lang.Integer r14 = X.C304236Cr.A00(r0, r11)
            r12 = r58
            r11 = r27
            r0 = r21
            androidx.compose.ui.Modifier r11 = X.C304246Cs.A00(r0, r14, r12, r11)
            r0 = r65
            X.6Fk r0 = r0.A02
            androidx.compose.ui.Modifier r48 = X.C287195Zj.A00(r0, r11)
            r11 = -1396059973(0xffffffffacc9d0bb, float:-5.7359373E-12)
            X.6D7 r0 = new X.6D7
            r32 = r0
            r33 = r64
            r34 = r18
            r35 = r16
            r36 = r8
            r38 = r19
            r39 = r10
            r40 = r1
            r41 = r62
            r42 = r61
            r43 = r60
            r44 = r59
            r46 = r22
            r47 = r23
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            X.5PJ r53 = X.AnonymousClass5PI.A01(r9, r0, r11)
            int r0 = r3 << 6
            r10 = r0 & 896(0x380, float:1.256E-42)
            r10 = r10 | r26
            r1 = 29360128(0x1c00000, float:7.052966E-38)
            int r0 = r3 << 15
            r1 = r1 & r0
            r10 = r10 | r1
            r47 = r9
            r50 = r63
            r51 = r13
            r52 = r2
            r56 = r10
            r57 = r4
            A02(r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00fc
            r0 = 306778997(0x12491375, float:6.34484E-28)
            X.0fL.A00(r0)
            goto L_0x00fc
        L_0x031c:
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            goto L_0x02b3
        L_0x031f:
            if (r15 != 0) goto L_0x032c
            boolean r11 = r8 instanceof X.AnonymousClass6D5
            if (r11 != 0) goto L_0x032c
            boolean r11 = r8 instanceof X.AnonymousClass6D3
            if (r11 != 0) goto L_0x032c
            r11 = 0
            goto L_0x026f
        L_0x032c:
            X.4bM r12 = X.C286955Yl.A00
            X.5RM r11 = X.C286565Wx.A04(r0)
            java.lang.Object r11 = X.C286615Xc.A01(r12, r11)
            X.0lg r11 = (X.0lg) r11
            X.0qQ.A0B(r11, r4)
            X.0Tu r12 = X.0Tu.A05
            r14 = 36327696678206078(0x810fd900033a7e, double:3.03711988696625E-306)
            boolean r11 = X.182.A06(r12, r11, r14)
            goto L_0x026f
        L_0x0348:
            r12 = -1770775749(0xffffffff96741b3b, float:-1.9718755E-25)
            r9.ExS(r12)
            r12 = r30
            boolean r14 = r9.AGu(r12)
            r12 = r3 & 14
            r13 = 0
            if (r12 != r11) goto L_0x035a
            r13 = 1
        L_0x035a:
            r14 = r14 | r13
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r3
            r11 = 16384(0x4000, float:2.2959E-41)
            r13 = 0
            if (r12 != r11) goto L_0x0365
            r13 = 1
        L_0x0365:
            r14 = r14 | r13
            r11 = r16
            boolean r11 = r9.AGu(r11)
            r14 = r14 | r11
            r11 = r18
            boolean r11 = r9.AGu(r11)
            r14 = r14 | r11
            java.lang.Object r13 = r9.ECw()
            if (r14 != 0) goto L_0x037e
            java.lang.Object r11 = X.AnonymousClass5XT.A00
            if (r13 != r11) goto L_0x0394
        L_0x037e:
            X.9N0 r13 = new X.9N0
            r38 = r13
            r39 = r18
            r40 = r8
            r41 = r30
            r42 = r16
            r43 = r63
            r44 = r4
            r38.<init>(r39, r40, r41, r42, r43, r44)
            r9.FLL(r13)
        L_0x0394:
            X.0sa r13 = (X.C62320sa) r13
            X.C286565Wx.A0L(r0, r4)
            goto L_0x025d
        L_0x039b:
            X.6D6 r49 = X.AnonymousClass6D6.Image
            goto L_0x0254
        L_0x039f:
            X.6D6 r49 = X.AnonymousClass6D6.Video
            goto L_0x0254
        L_0x03a3:
            r18 = r2
            r17 = 0
            goto L_0x022b
        L_0x03a9:
            boolean r12 = r8 instanceof X.AnonymousClass6D2
            if (r12 == 0) goto L_0x03c1
            r12 = 1796943332(0x6b1b2de4, float:1.8760021E26)
            r9.ExS(r12)
            r12 = r8
            X.6D2 r12 = (X.AnonymousClass6D2) r12
            X.3WR r12 = r12.A02
            X.6D8 r16 = X.C56235Hv2.A00(r9, r12, r4)
            X.C286565Wx.A0L(r0, r4)
            goto L_0x01ff
        L_0x03c1:
            boolean r12 = r8 instanceof X.AnonymousClass6D3
            if (r12 == 0) goto L_0x03d9
            r12 = 1796946468(0x6b1b3a24, float:1.8765806E26)
            r9.ExS(r12)
            r12 = r8
            X.6D3 r12 = (X.AnonymousClass6D3) r12
            X.3WR r12 = r12.A03
            X.6D8 r16 = X.C56235Hv2.A00(r9, r12, r4)
            X.C286565Wx.A0L(r0, r4)
            goto L_0x01ff
        L_0x03d9:
            r12 = -129163535(0xfffffffff84d1ef1, float:-1.6641382E34)
            r9.ExS(r12)
            X.C286565Wx.A0L(r0, r4)
            r16 = r2
            goto L_0x01ff
        L_0x03e6:
            if (r24 == 0) goto L_0x041f
            r1 = -129641616(0xfffffffff845d370, float:-1.6049546E34)
            r9.ExS(r1)
            r1 = 1796933632(0x6b1b0800, float:1.8742128E26)
            r9.ExS(r1)
            r1 = r3 & 14
            r12 = 0
            if (r1 != r11) goto L_0x03fa
            r12 = 1
        L_0x03fa:
            boolean r1 = r9.AGu(r13)
            r12 = r12 | r1
            java.lang.Object r1 = r9.ECw()
            if (r12 != 0) goto L_0x0409
            java.lang.Object r12 = X.AnonymousClass5XT.A00
            if (r1 != r12) goto L_0x0415
        L_0x0409:
            r14 = 16
            X.Phi r1 = new X.Phi
            r12 = r63
            r1.<init>(r12, r13, r14)
            r9.FLL(r1)
        L_0x0415:
            X.0sa r1 = (X.C62320sa) r1
            X.C286565Wx.A0L(r0, r4)
            X.C286565Wx.A0L(r0, r4)
            goto L_0x01e5
        L_0x041f:
            r1 = -129536960(0xfffffffff8476c40, float:-1.6179104E34)
            r9.ExS(r1)
            X.C286565Wx.A0L(r0, r4)
            r1 = r2
            goto L_0x01e5
        L_0x042b:
            r12 = 1796917914(0x6b1aca9a, float:1.8713134E26)
            r9.ExS(r12)
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r1
            r14 = 0
            if (r12 != r10) goto L_0x0438
            r14 = 1
        L_0x0438:
            r12 = r3 & 14
            r10 = 0
            if (r12 != r11) goto L_0x043e
            r10 = 1
        L_0x043e:
            r14 = r14 | r10
            boolean r10 = r9.AGu(r13)
            r14 = r14 | r10
            r10 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r10
            r10 = 1048576(0x100000, float:1.469368E-39)
            r12 = 0
            if (r1 != r10) goto L_0x044d
            r12 = 1
        L_0x044d:
            r12 = r12 | r14
            java.lang.Object r10 = r9.ECw()
            if (r12 != 0) goto L_0x0458
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r10 != r1) goto L_0x0462
        L_0x0458:
            X.Inm r10 = new X.Inm
            r1 = r25
            r10.<init>(r13, r1)
            r9.FLL(r10)
        L_0x0462:
            X.0sa r10 = (X.C62320sa) r10
            X.C286565Wx.A0L(r0, r4)
            goto L_0x01ab
        L_0x0469:
            r0 = 1796905590(0x6b1a9a76, float:1.86904E26)
            r9.ExS(r0)
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r1
            r15 = 0
            if (r0 != r10) goto L_0x0476
            r15 = 1
        L_0x0476:
            r12 = r3 & 14
            r0 = 0
            if (r12 != r11) goto L_0x047c
            r0 = 1
        L_0x047c:
            r15 = r15 | r0
            boolean r0 = r9.AGu(r13)
            r15 = r15 | r0
            r12 = 3670016(0x380000, float:5.142788E-39)
            r12 = r12 & r1
            r0 = 1048576(0x100000, float:1.469368E-39)
            r14 = 0
            if (r12 != r0) goto L_0x048b
            r14 = 1
        L_0x048b:
            r15 = r15 | r14
            java.lang.Object r19 = r9.ECw()
            if (r15 != 0) goto L_0x0498
            java.lang.Object r12 = X.AnonymousClass5XT.A00
            r0 = r19
            if (r0 != r12) goto L_0x04a4
        L_0x0498:
            X.Inm r19 = new X.Inm
            r12 = r19
            r0 = r25
            r12.<init>(r13, r0)
            r9.FLL(r12)
        L_0x04a4:
            r0 = r19
            X.0sa r0 = (X.C62320sa) r0
            r19 = r0
            r0 = r9
            X.5Wx r0 = (X.C286565Wx) r0
            X.C286565Wx.A0L(r0, r4)
            goto L_0x019a
        L_0x04b2:
            X.1iA r13 = X.1iA.A0a
            goto L_0x018e
        L_0x04b6:
            X.1iA r13 = X.1iA.A0Q
            goto L_0x018e
        L_0x04ba:
            r0 = r78 & r26
            if (r0 != 0) goto L_0x00e0
            r0 = r22
            boolean r14 = r9.AGv(r0)
            r0 = 33554432(0x2000000, float:9.403955E-38)
            if (r14 == 0) goto L_0x04ca
            r0 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x04ca:
            r1 = r1 | r0
            goto L_0x00e0
        L_0x04cd:
            r0 = r78 & r14
            if (r0 != 0) goto L_0x00d8
            r0 = r23
            boolean r14 = r9.AGv(r0)
            r0 = 4194304(0x400000, float:5.877472E-39)
            if (r14 == 0) goto L_0x04dd
            r0 = 8388608(0x800000, float:1.17549435E-38)
        L_0x04dd:
            r1 = r1 | r0
            goto L_0x00d8
        L_0x04e0:
            r0 = r78 & r15
            if (r0 != 0) goto L_0x00d1
            r0 = r24
            boolean r10 = r9.AGv(r0)
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r10 == 0) goto L_0x04f0
            r0 = 1048576(0x100000, float:1.469368E-39)
        L_0x04f0:
            r1 = r1 | r0
            goto L_0x00d1
        L_0x04f3:
            r0 = r78 & r16
            if (r0 != 0) goto L_0x00ca
            r0 = r25
            boolean r10 = r9.AGv(r0)
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r10 == 0) goto L_0x0503
            r0 = 131072(0x20000, float:1.83671E-40)
        L_0x0503:
            r1 = r1 | r0
            goto L_0x00ca
        L_0x0506:
            r0 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x00c1
            r0 = r61
            boolean r10 = r9.AGw(r0)
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x0516
            r0 = 16384(0x4000, float:2.2959E-41)
        L_0x0516:
            r1 = r1 | r0
            goto L_0x00c1
        L_0x0519:
            r0 = r6 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x00bb
            r0 = r62
            boolean r10 = r9.AGw(r0)
            r0 = 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L_0x0529
            r0 = 2048(0x800, float:2.87E-42)
        L_0x0529:
            r1 = r1 | r0
            goto L_0x00bb
        L_0x052c:
            r0 = r6 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x00b5
            r0 = r21
            boolean r0 = r9.AGu(r0)
            if (r0 == 0) goto L_0x053a
            r10 = 256(0x100, float:3.59E-43)
        L_0x053a:
            r1 = r1 | r10
            goto L_0x00b5
        L_0x053d:
            r0 = r78 & 48
            if (r0 != 0) goto L_0x00af
            r0 = r60
            boolean r0 = r9.AGw(r0)
            if (r0 != 0) goto L_0x054b
            r2 = 16
        L_0x054b:
            r1 = r1 | r2
            goto L_0x00af
        L_0x054e:
            r0 = r78 & 6
            if (r0 != 0) goto L_0x0560
            r0 = r59
            boolean r1 = r9.AGw(r0)
            r0 = 2
            if (r1 == 0) goto L_0x055c
            r0 = 4
        L_0x055c:
            r1 = r78 | r0
            goto L_0x00a9
        L_0x0560:
            r1 = r6
            goto L_0x00a9
        L_0x0563:
            r0 = r77 & r26
            if (r0 != 0) goto L_0x0086
            r0 = r30
            boolean r1 = r9.AGw(r0)
            r0 = 33554432(0x2000000, float:9.403955E-38)
            if (r1 == 0) goto L_0x0573
            r0 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x0573:
            r3 = r3 | r0
            goto L_0x0086
        L_0x0576:
            r0 = r77 & r14
            if (r0 != 0) goto L_0x007c
            r0 = r28
            boolean r1 = r9.AGv(r0)
            r0 = 4194304(0x400000, float:5.877472E-39)
            if (r1 == 0) goto L_0x0586
            r0 = 8388608(0x800000, float:1.17549435E-38)
        L_0x0586:
            r3 = r3 | r0
            goto L_0x007c
        L_0x0589:
            r0 = r77 & r15
            if (r0 != 0) goto L_0x0073
            r0 = r29
            boolean r1 = r9.AGv(r0)
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r1 == 0) goto L_0x0599
            r0 = 1048576(0x100000, float:1.469368E-39)
        L_0x0599:
            r3 = r3 | r0
            goto L_0x0073
        L_0x059c:
            r0 = r77 & r16
            if (r0 != 0) goto L_0x006a
            r0 = r64
            boolean r1 = r9.AGu(r0)
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r1 == 0) goto L_0x05ac
            r0 = 131072(0x20000, float:1.83671E-40)
        L_0x05ac:
            r3 = r3 | r0
            goto L_0x006a
        L_0x05af:
            r0 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0060
            boolean r1 = r9.AGu(r8)
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x05bd
            r0 = 16384(0x4000, float:2.2959E-41)
        L_0x05bd:
            r3 = r3 | r0
            goto L_0x0060
        L_0x05c0:
            r0 = r7 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x005a
            r0 = r65
            boolean r1 = r9.AGu(r0)
            r0 = 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x05d0
            r0 = 2048(0x800, float:2.87E-42)
        L_0x05d0:
            r3 = r3 | r0
            goto L_0x005a
        L_0x05d3:
            r0 = r7 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0052
            r0 = r58
            boolean r1 = r9.AGv(r0)
            r0 = 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x05e3
            r0 = 256(0x100, float:3.59E-43)
        L_0x05e3:
            r3 = r3 | r0
            goto L_0x0052
        L_0x05e6:
            r0 = r77 & 48
            if (r0 != 0) goto L_0x0048
            r0 = r66
            boolean r1 = r9.AGu(r0)
            r0 = 16
            if (r1 == 0) goto L_0x05f6
            r0 = 32
        L_0x05f6:
            r3 = r3 | r0
            goto L_0x0048
        L_0x05f9:
            r0 = r77 & 6
            if (r0 != 0) goto L_0x060b
            r0 = r63
            boolean r0 = r9.AGu(r0)
            r3 = 2
            if (r0 == 0) goto L_0x0607
            r3 = 4
        L_0x0607:
            r3 = r3 | r77
            goto L_0x0040
        L_0x060b:
            r3 = r7
            goto L_0x0040
        L_0x060e:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6D1.A00(X.5Wy, androidx.compose.ui.Modifier, com.instagram.api.schemas.LineType, X.6D0, X.6Ba, X.5vK, java.lang.String, X.0sa, X.0sa, X.0sP, X.0sP, X.0sL, X.0sK, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r39, androidx.compose.ui.Modifier r40, com.instagram.api.schemas.LineType r41, X.AnonymousClass6D0 r42, X.C299515vK r43, java.lang.String r44, X.C62320sa r45, X.C62320sa r46, X.0sP r47, X.0sP r48, X.0sL r49, X.0sK r50, int r51, int r52, int r53, boolean r54, boolean r55, boolean r56, boolean r57, boolean r58, boolean r59, boolean r60) {
        /*
            r1 = r40
            r24 = r45
            r15 = r58
            r23 = r46
            r7 = r59
            r22 = r57
            r6 = r60
            r40 = 0
            r0 = -1450807425(0xffffffffa9866f7f, float:-5.970137E-14)
            r11 = r39
            r11.ExV(r0)
            r8 = r53
            r0 = r53 & 1
            r10 = r51
            r31 = r44
            if (r0 == 0) goto L_0x02db
            r0 = r51 | 6
        L_0x0024:
            r2 = r53 & 2
            r27 = r41
            if (r2 == 0) goto L_0x02c8
            r0 = r0 | 48
        L_0x002c:
            r2 = r53 & 4
            r12 = 256(0x100, float:3.59E-43)
            r41 = r54
            if (r2 == 0) goto L_0x02b5
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0036:
            r2 = r53 & 8
            r4 = 2048(0x800, float:2.87E-42)
            r28 = r42
            if (r2 == 0) goto L_0x02a2
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0040:
            r2 = r53 & 16
            r18 = 16384(0x4000, float:2.2959E-41)
            r30 = r43
            if (r2 == 0) goto L_0x028f
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x004a:
            r2 = r53 & 32
            r21 = 131072(0x20000, float:1.83671E-40)
            r17 = 65536(0x10000, float:9.18355E-41)
            r20 = 196608(0x30000, float:2.75506E-40)
            r42 = r55
            if (r2 == 0) goto L_0x027c
            r0 = r0 | r20
        L_0x0058:
            r2 = r53 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            r43 = r56
            if (r2 == 0) goto L_0x0269
            r0 = r0 | r16
        L_0x0062:
            r2 = r8 & 128(0x80, float:1.794E-43)
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            r37 = r50
            if (r2 == 0) goto L_0x0256
            r0 = r0 | r19
        L_0x006c:
            r3 = r8 & 256(0x100, float:3.59E-43)
            r2 = 100663296(0x6000000, float:2.4074124E-35)
            r34 = r47
            if (r3 != 0) goto L_0x0084
            r2 = r2 & r51
            if (r2 != 0) goto L_0x0085
            r2 = r34
            boolean r3 = r11.AGw(r2)
            r2 = 33554432(0x2000000, float:9.403955E-38)
            if (r3 == 0) goto L_0x0084
            r2 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x0084:
            r0 = r0 | r2
        L_0x0085:
            r3 = r8 & 512(0x200, float:7.175E-43)
            r2 = 805306368(0x30000000, float:4.656613E-10)
            r36 = r49
            if (r3 != 0) goto L_0x009d
            r2 = r2 & r51
            if (r2 != 0) goto L_0x009e
            r2 = r36
            boolean r3 = r11.AGw(r2)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            if (r3 == 0) goto L_0x009d
            r2 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x009d:
            r0 = r0 | r2
        L_0x009e:
            r2 = r8 & 1024(0x400, float:1.435E-42)
            r35 = r48
            r9 = r52
            if (r2 == 0) goto L_0x0241
            r5 = r52 | 6
        L_0x00a8:
            r14 = r8 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0230
            r5 = r5 | 48
        L_0x00ae:
            r13 = r8 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L_0x021f
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x00b4:
            r12 = r8 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x020e
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x00ba:
            r4 = r8 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x01fc
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x00c0:
            r2 = 32768(0x8000, float:4.5918E-41)
            r18 = r53 & r2
            if (r18 == 0) goto L_0x01eb
            r5 = r5 | r20
        L_0x00c9:
            r17 = r53 & r17
            if (r17 == 0) goto L_0x01da
            r5 = r5 | r16
        L_0x00cf:
            r16 = r53 & r21
            if (r16 == 0) goto L_0x01c9
            r5 = r5 | r19
        L_0x00d5:
            r2 = 306783379(0x12492493, float:6.34695E-28)
            r3 = r0 & r2
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r3 != r2) goto L_0x0127
            r3 = 4793491(0x492493, float:6.717112E-39)
            r3 = r3 & r5
            r2 = 4793490(0x492492, float:6.71711E-39)
            if (r3 != r2) goto L_0x0127
            boolean r2 = r11.Bwn()
            if (r2 == 0) goto L_0x0127
            r11.Evl()
        L_0x00f1:
            X.5Xd r2 = r11.ASQ()
            if (r2 == 0) goto L_0x0126
            X.JDc r0 = new X.JDc
            r25 = r0
            r26 = r1
            r29 = r30
            r30 = r31
            r31 = r24
            r32 = r23
            r33 = r34
            r34 = r35
            r35 = r36
            r36 = r37
            r37 = r10
            r38 = r9
            r39 = r8
            r40 = r41
            r41 = r42
            r42 = r43
            r43 = r22
            r44 = r15
            r45 = r7
            r46 = r6
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            r2.A06 = r0
        L_0x0126:
            return
        L_0x0127:
            if (r14 == 0) goto L_0x012b
            X.5Qk r1 = androidx.compose.ui.Modifier.A00
        L_0x012b:
            if (r13 == 0) goto L_0x012f
            r24 = 0
        L_0x012f:
            if (r12 == 0) goto L_0x0133
            r23 = 0
        L_0x0133:
            if (r4 == 0) goto L_0x0137
            r22 = 0
        L_0x0137:
            if (r18 == 0) goto L_0x013a
            r15 = 0
        L_0x013a:
            if (r17 == 0) goto L_0x013d
            r7 = 1
        L_0x013d:
            if (r16 == 0) goto L_0x0140
            r6 = 1
        L_0x0140:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x014e
            r3 = 630156895(0x258f6e5f, float:2.4881336E-16)
            java.lang.String r2 = "com.instagram.barcelona.feed.post.ui.PostSingleMedia (PostSingleMedia.kt:170)"
            X.0fL.A01(r3, r2)
        L_0x014e:
            r29 = 0
            r38 = r0 & 14
            r38 = r38 | r20
            r2 = r0 & 112(0x70, float:1.57E-43)
            r38 = r38 | r2
            r2 = r0 & 896(0x380, float:1.256E-42)
            r38 = r38 | r2
            r2 = r0 & 7168(0x1c00, float:1.0045E-41)
            r38 = r38 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r0
            r38 = r38 | r2
            r2 = 3670016(0x380000, float:5.142788E-39)
            int r3 = r0 << 3
            r2 = r2 & r3
            r38 = r38 | r2
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r3
            r38 = r38 | r2
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r3
            r38 = r38 | r2
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r3
            r38 = r38 | r2
            int r0 = r0 >> 27
            r39 = r0 & 14
            int r2 = r5 << 3
            r0 = r2 & 112(0x70, float:1.57E-43)
            r39 = r39 | r0
            r0 = r2 & 896(0x380, float:1.256E-42)
            r39 = r39 | r0
            r0 = r2 & 7168(0x1c00, float:1.0045E-41)
            r39 = r39 | r0
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r2
            r39 = r39 | r0
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r2
            r39 = r39 | r0
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r2
            r39 = r39 | r0
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r2
            r39 = r39 | r0
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r0
            r39 = r39 | r2
            r32 = r24
            r33 = r23
            r44 = r22
            r45 = r15
            r46 = r7
            r47 = r6
            r25 = r11
            r26 = r1
            A00(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00f1
            r0 = -783849115(0xffffffffd1476965, float:-5.352917E10)
            X.0fL.A00(r0)
            goto L_0x00f1
        L_0x01c9:
            r2 = r52 & r19
            if (r2 != 0) goto L_0x00d5
            boolean r3 = r11.AGv(r6)
            r2 = 4194304(0x400000, float:5.877472E-39)
            if (r3 == 0) goto L_0x01d7
            r2 = 8388608(0x800000, float:1.17549435E-38)
        L_0x01d7:
            r5 = r5 | r2
            goto L_0x00d5
        L_0x01da:
            r2 = r52 & r16
            if (r2 != 0) goto L_0x00cf
            boolean r3 = r11.AGv(r7)
            r2 = 524288(0x80000, float:7.34684E-40)
            if (r3 == 0) goto L_0x01e8
            r2 = 1048576(0x100000, float:1.469368E-39)
        L_0x01e8:
            r5 = r5 | r2
            goto L_0x00cf
        L_0x01eb:
            r2 = r52 & r20
            if (r2 != 0) goto L_0x00c9
            boolean r3 = r11.AGv(r15)
            r2 = 65536(0x10000, float:9.18355E-41)
            if (r3 == 0) goto L_0x01f9
            r2 = 131072(0x20000, float:1.83671E-40)
        L_0x01f9:
            r5 = r5 | r2
            goto L_0x00c9
        L_0x01fc:
            r2 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x00c0
            r2 = r22
            boolean r2 = r11.AGv(r2)
            if (r2 != 0) goto L_0x020a
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x020a:
            r5 = r5 | r18
            goto L_0x00c0
        L_0x020e:
            r2 = r9 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x00ba
            r2 = r23
            boolean r2 = r11.AGw(r2)
            if (r2 != 0) goto L_0x021c
            r4 = 1024(0x400, float:1.435E-42)
        L_0x021c:
            r5 = r5 | r4
            goto L_0x00ba
        L_0x021f:
            r2 = r9 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x00b4
            r2 = r24
            boolean r2 = r11.AGw(r2)
            if (r2 != 0) goto L_0x022d
            r12 = 128(0x80, float:1.794E-43)
        L_0x022d:
            r5 = r5 | r12
            goto L_0x00b4
        L_0x0230:
            r2 = r52 & 48
            if (r2 != 0) goto L_0x00ae
            boolean r3 = r11.AGu(r1)
            r2 = 16
            if (r3 == 0) goto L_0x023e
            r2 = 32
        L_0x023e:
            r5 = r5 | r2
            goto L_0x00ae
        L_0x0241:
            r2 = r52 & 6
            if (r2 != 0) goto L_0x0253
            r2 = r35
            boolean r3 = r11.AGw(r2)
            r2 = 2
            if (r3 == 0) goto L_0x024f
            r2 = 4
        L_0x024f:
            r5 = r52 | r2
            goto L_0x00a8
        L_0x0253:
            r5 = r9
            goto L_0x00a8
        L_0x0256:
            r2 = r51 & r19
            if (r2 != 0) goto L_0x006c
            r2 = r37
            boolean r3 = r11.AGw(r2)
            r2 = 4194304(0x400000, float:5.877472E-39)
            if (r3 == 0) goto L_0x0266
            r2 = 8388608(0x800000, float:1.17549435E-38)
        L_0x0266:
            r0 = r0 | r2
            goto L_0x006c
        L_0x0269:
            r2 = r51 & r16
            if (r2 != 0) goto L_0x0062
            r2 = r43
            boolean r3 = r11.AGv(r2)
            r2 = 524288(0x80000, float:7.34684E-40)
            if (r3 == 0) goto L_0x0279
            r2 = 1048576(0x100000, float:1.469368E-39)
        L_0x0279:
            r0 = r0 | r2
            goto L_0x0062
        L_0x027c:
            r2 = r51 & r20
            if (r2 != 0) goto L_0x0058
            r2 = r42
            boolean r3 = r11.AGv(r2)
            r2 = 65536(0x10000, float:9.18355E-41)
            if (r3 == 0) goto L_0x028c
            r2 = 131072(0x20000, float:1.83671E-40)
        L_0x028c:
            r0 = r0 | r2
            goto L_0x0058
        L_0x028f:
            r2 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x004a
            r2 = r30
            boolean r3 = r11.AGu(r2)
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x029f
            r2 = 16384(0x4000, float:2.2959E-41)
        L_0x029f:
            r0 = r0 | r2
            goto L_0x004a
        L_0x02a2:
            r2 = r10 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0040
            r2 = r28
            boolean r3 = r11.AGu(r2)
            r2 = 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x02b2
            r2 = 2048(0x800, float:2.87E-42)
        L_0x02b2:
            r0 = r0 | r2
            goto L_0x0040
        L_0x02b5:
            r2 = r10 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0036
            r2 = r41
            boolean r3 = r11.AGv(r2)
            r2 = 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x02c5
            r2 = 256(0x100, float:3.59E-43)
        L_0x02c5:
            r0 = r0 | r2
            goto L_0x0036
        L_0x02c8:
            r2 = r51 & 48
            if (r2 != 0) goto L_0x002c
            r2 = r27
            boolean r3 = r11.AGu(r2)
            r2 = 16
            if (r3 == 0) goto L_0x02d8
            r2 = 32
        L_0x02d8:
            r0 = r0 | r2
            goto L_0x002c
        L_0x02db:
            r0 = r51 & 6
            if (r0 != 0) goto L_0x02ed
            r0 = r31
            boolean r2 = r11.AGu(r0)
            r0 = 2
            if (r2 == 0) goto L_0x02e9
            r0 = 4
        L_0x02e9:
            r0 = r0 | r51
            goto L_0x0024
        L_0x02ed:
            r0 = r10
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6D1.A01(X.5Wy, androidx.compose.ui.Modifier, com.instagram.api.schemas.LineType, X.6D0, X.5vK, java.lang.String, X.0sa, X.0sa, X.0sP, X.0sP, X.0sL, X.0sK, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}

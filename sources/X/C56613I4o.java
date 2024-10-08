package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.I4o  reason: case insensitive filesystem */
public abstract class C56613I4o {
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r34, androidx.compose.ui.Modifier r35, com.instagram.api.schemas.LineType r36, X.C53273GlL r37, java.lang.String r38, X.0sP r39, X.0sP r40, X.0sP r41, X.0sK r42, X.AnonymousClass62P r43, int r44, int r45, int r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, boolean r53) {
        /*
            r3 = r52
            r2 = r53
            r21 = r41
            r16 = r50
            r17 = r35
            r15 = r51
            r35 = 0
            r0 = -1596211175(0xffffffffa0dbc019, float:-3.7227163E-19)
            r11 = r34
            r11.ExV(r0)
            r8 = r46
            r0 = r46 & 1
            r10 = r44
            r27 = r38
            if (r0 == 0) goto L_0x022f
            r1 = r44 | 6
        L_0x0022:
            r0 = r46 & 2
            r24 = r36
            if (r0 == 0) goto L_0x0222
            r1 = r1 | 48
        L_0x002a:
            r0 = r46 & 4
            r6 = 256(0x100, float:3.59E-43)
            r36 = r47
            if (r0 == 0) goto L_0x0215
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0034:
            r0 = r46 & 8
            r5 = 2048(0x800, float:2.87E-42)
            r25 = r37
            if (r0 == 0) goto L_0x0208
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x003e:
            r0 = r46 & 16
            r18 = 16384(0x4000, float:2.2959E-41)
            r32 = r43
            if (r0 == 0) goto L_0x01fb
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0048:
            r0 = r46 & 32
            r20 = 131072(0x20000, float:1.83671E-40)
            r19 = 196608(0x30000, float:2.75506E-40)
            r37 = r48
            if (r0 == 0) goto L_0x01ee
            r1 = r1 | r19
        L_0x0054:
            r4 = r46 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            r38 = r49
            if (r4 != 0) goto L_0x0066
            r0 = r44 & r0
            if (r0 != 0) goto L_0x0067
            r0 = r38
            int r0 = X.G9t.A0e(r11, r0)
        L_0x0066:
            r1 = r1 | r0
        L_0x0067:
            r4 = r8 & 128(0x80, float:1.794E-43)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r31 = r42
            if (r4 != 0) goto L_0x0079
            r0 = r44 & r0
            if (r0 != 0) goto L_0x007a
            r0 = r31
            int r0 = X.G9t.A0L(r11, r0)
        L_0x0079:
            r1 = r1 | r0
        L_0x007a:
            r4 = r8 & 256(0x100, float:3.59E-43)
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r28 = r39
            if (r4 != 0) goto L_0x008c
            r0 = r0 & r44
            if (r0 != 0) goto L_0x008d
            r0 = r28
            int r0 = X.G9t.A0M(r11, r0)
        L_0x008c:
            r1 = r1 | r0
        L_0x008d:
            r4 = r8 & 512(0x200, float:7.175E-43)
            r0 = 805306368(0x30000000, float:4.656613E-10)
            r29 = r40
            if (r4 != 0) goto L_0x009f
            r0 = r0 & r44
            if (r0 != 0) goto L_0x00a0
            r0 = r29
            int r0 = X.G9t.A0N(r11, r0)
        L_0x009f:
            r1 = r1 | r0
        L_0x00a0:
            r14 = r8 & 1024(0x400, float:1.435E-42)
            r9 = r45
            if (r14 == 0) goto L_0x01dd
            r12 = r45 | 6
        L_0x00a8:
            r13 = r8 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x01d0
            r12 = r12 | 48
        L_0x00ae:
            r7 = r8 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x01c1
            r12 = r12 | 384(0x180, float:5.38E-43)
        L_0x00b4:
            r6 = r8 & 8192(0x2000, float:1.14794E-41)
            if (r6 == 0) goto L_0x01b2
            r12 = r12 | 3072(0xc00, float:4.305E-42)
        L_0x00ba:
            r5 = r8 & 16384(0x4000, float:2.2959E-41)
            if (r5 == 0) goto L_0x01a2
            r12 = r12 | 24576(0x6000, float:3.4438E-41)
        L_0x00c0:
            r0 = 32768(0x8000, float:4.5918E-41)
            r18 = r46 & r0
            if (r18 == 0) goto L_0x0190
            r12 = r12 | r19
        L_0x00c9:
            r0 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r0 & r1
            r4 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r4) goto L_0x0116
            r4 = 74899(0x12493, float:1.04956E-40)
            r4 = r4 & r12
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r4 != r0) goto L_0x0116
            boolean r0 = r11.Bwn()
            if (r0 == 0) goto L_0x0116
            r11.Evl()
        L_0x00e4:
            X.5Xd r1 = r11.ASQ()
            if (r1 == 0) goto L_0x0115
            X.JDN r0 = new X.JDN
            r22 = r0
            r23 = r17
            r26 = r27
            r27 = r28
            r28 = r29
            r29 = r21
            r30 = r31
            r31 = r32
            r32 = r10
            r33 = r9
            r34 = r8
            r35 = r36
            r36 = r37
            r37 = r38
            r38 = r16
            r39 = r15
            r40 = r3
            r41 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r1.A06 = r0
        L_0x0115:
            return
        L_0x0116:
            if (r14 == 0) goto L_0x011a
            X.5Qk r17 = androidx.compose.ui.Modifier.A00
        L_0x011a:
            r0 = r16
            boolean r16 = X.C51966G9m.A1Q(r13, r0)
            boolean r15 = X.C51966G9m.A1Q(r7, r15)
            boolean r3 = X.C51966G9m.A1R(r6, r3)
            boolean r2 = X.C51966G9m.A1R(r5, r2)
            if (r18 == 0) goto L_0x0130
            r21 = 0
        L_0x0130:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x013e
            r4 = 1045628436(0x3e530614, float:0.20607787)
            java.lang.String r0 = "com.instagram.barcelona.feed.post.ui.PostCarousel (PostCarousel.kt:152)"
            X.0fL.A01(r4, r0)
        L_0x013e:
            r26 = 0
            r4 = r1 & 14
            r4 = r4 | r19
            r0 = r1 & 112(0x70, float:1.57E-43)
            r4 = r4 | r0
            int r5 = X.C51969G9p.A04(r1, r4)
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r1
            r5 = r5 | r0
            r0 = 3670016(0x380000, float:5.142788E-39)
            int r4 = r1 << 3
            r0 = r0 & r4
            r5 = r5 | r0
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r4
            r5 = r5 | r0
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            int r33 = X.C51972G9s.A06(r0, r4, r5)
            int r0 = r1 >> 27
            r4 = r0 & 14
            int r1 = r12 << 3
            r0 = r1 & 112(0x70, float:1.57E-43)
            int r34 = X.C51974G9v.A01(r4, r0, r1)
            r0 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r0
            r34 = r34 | r1
            r30 = r21
            r39 = r16
            r40 = r15
            r41 = r3
            r42 = r2
            r22 = r11
            r23 = r17
            A00(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00e4
            r0 = 2069687000(0x7b5cead8, float:1.1470685E36)
            X.0fL.A00(r0)
            goto L_0x00e4
        L_0x0190:
            r0 = r45 & r19
            if (r0 != 0) goto L_0x00c9
            r0 = r21
            boolean r0 = r11.AGw(r0)
            if (r0 != 0) goto L_0x019e
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x019e:
            r12 = r12 | r20
            goto L_0x00c9
        L_0x01a2:
            r0 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x00c0
            boolean r0 = r11.AGv(r2)
            if (r0 != 0) goto L_0x01ae
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x01ae:
            r12 = r12 | r18
            goto L_0x00c0
        L_0x01b2:
            r0 = r9 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x00ba
            boolean r0 = r11.AGv(r3)
            if (r0 != 0) goto L_0x01be
            r5 = 1024(0x400, float:1.435E-42)
        L_0x01be:
            r12 = r12 | r5
            goto L_0x00ba
        L_0x01c1:
            r0 = r9 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x00b4
            boolean r0 = r11.AGv(r15)
            if (r0 != 0) goto L_0x01cd
            r6 = 128(0x80, float:1.794E-43)
        L_0x01cd:
            r12 = r12 | r6
            goto L_0x00b4
        L_0x01d0:
            r0 = r45 & 48
            if (r0 != 0) goto L_0x00ae
            r0 = r16
            int r0 = X.G9t.A0Z(r11, r0)
            r12 = r12 | r0
            goto L_0x00ae
        L_0x01dd:
            r0 = r45 & 6
            if (r0 != 0) goto L_0x01eb
            r0 = r17
            int r0 = X.G9t.A0O(r11, r0)
            r12 = r45 | r0
            goto L_0x00a8
        L_0x01eb:
            r12 = r9
            goto L_0x00a8
        L_0x01ee:
            r0 = r44 & r19
            if (r0 != 0) goto L_0x0054
            r0 = r37
            int r0 = X.G9t.A0d(r11, r0)
            r1 = r1 | r0
            goto L_0x0054
        L_0x01fb:
            r0 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0048
            r0 = r32
            int r0 = X.G9t.A0S(r11, r0)
            r1 = r1 | r0
            goto L_0x0048
        L_0x0208:
            r0 = r10 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x003e
            r0 = r25
            int r0 = X.G9t.A0R(r11, r0)
            r1 = r1 | r0
            goto L_0x003e
        L_0x0215:
            r0 = r10 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0034
            r0 = r36
            int r0 = X.G9t.A0a(r11, r0)
            r1 = r1 | r0
            goto L_0x0034
        L_0x0222:
            r0 = r44 & 48
            if (r0 != 0) goto L_0x002a
            r0 = r24
            int r0 = X.G9t.A0P(r11, r0)
            r1 = r1 | r0
            goto L_0x002a
        L_0x022f:
            r0 = r44 & 6
            if (r0 != 0) goto L_0x023d
            r0 = r27
            int r1 = X.G9t.A0O(r11, r0)
            r1 = r1 | r44
            goto L_0x0022
        L_0x023d:
            r1 = r10
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56613I4o.A01(X.5Wy, androidx.compose.ui.Modifier, com.instagram.api.schemas.LineType, X.GlL, java.lang.String, X.0sP, X.0sP, X.0sP, X.0sK, X.62P, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v49, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v86, resolved type: X.Ixe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: X.Ixe} */
    /* JADX WARNING: type inference failed for: r0v50 */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01be, code lost:
        if (r0 == X.AnonymousClass5XT.A00) goto L_0x01c0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C286575Wy r31, androidx.compose.ui.Modifier r32, X.0sP r33, X.0sP r34, X.0sP r35, X.0sK r36, X.AnonymousClass62P r37, int r38, int r39, int r40, boolean r41, boolean r42, boolean r43) {
        /*
            r23 = r43
            r2 = r42
            r6 = r32
            r3 = r41
            r1 = 0
            r22 = 3
            r21 = 4
            r0 = -1669102643(0xffffffff9c8383cd, float:-8.702923E-22)
            r7 = r31
            r7.ExV(r0)
            r4 = r40
            r0 = r40 & 1
            r5 = r39
            if (r0 == 0) goto L_0x0237
            r9 = r39 | 6
        L_0x001f:
            r8 = r40 & 2
            if (r8 == 0) goto L_0x022c
            r9 = r9 | 48
        L_0x0025:
            r0 = r40 & 4
            r41 = r33
            if (r0 == 0) goto L_0x021f
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x002d:
            r0 = r40 & 8
            r40 = r34
            if (r0 == 0) goto L_0x0212
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x0035:
            r0 = r4 & 16
            r39 = r35
            if (r0 == 0) goto L_0x0205
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
        L_0x003d:
            r10 = r4 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            r24 = r38
            if (r10 != 0) goto L_0x004e
            r0 = r0 & r5
            if (r0 != 0) goto L_0x004f
            r0 = r24
            int r0 = X.G9t.A0A(r7, r0)
        L_0x004e:
            r9 = r9 | r0
        L_0x004f:
            r13 = r4 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r13 != 0) goto L_0x005c
            r0 = r0 & r5
            if (r0 != 0) goto L_0x005d
            int r0 = X.G9t.A0U(r7, r6)
        L_0x005c:
            r9 = r9 | r0
        L_0x005d:
            r10 = r4 & 128(0x80, float:1.794E-43)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            if (r10 != 0) goto L_0x006a
            r0 = r0 & r5
            if (r0 != 0) goto L_0x006b
            int r0 = X.G9t.A0f(r7, r2)
        L_0x006a:
            r9 = r9 | r0
        L_0x006b:
            r11 = r4 & 256(0x100, float:3.59E-43)
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            if (r11 != 0) goto L_0x007a
            r0 = r0 & r5
            if (r0 != 0) goto L_0x007b
            r0 = r23
            int r0 = X.G9t.A0g(r7, r0)
        L_0x007a:
            r9 = r9 | r0
        L_0x007b:
            r12 = r4 & 512(0x200, float:7.175E-43)
            r0 = 805306368(0x30000000, float:4.656613E-10)
            r38 = r36
            if (r12 != 0) goto L_0x008c
            r0 = r0 & r5
            if (r0 != 0) goto L_0x008d
            r0 = r38
            int r0 = X.G9t.A0N(r7, r0)
        L_0x008c:
            r9 = r9 | r0
        L_0x008d:
            r12 = 306783379(0x12492493, float:6.34695E-28)
            r12 = r12 & r9
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r12 != r0) goto L_0x00c1
            boolean r0 = r7.Bwn()
            if (r0 == 0) goto L_0x00c1
            r7.Evl()
        L_0x009f:
            X.5Xd r1 = r7.ASQ()
            if (r1 == 0) goto L_0x00c0
            X.JBw r0 = new X.JBw
            r7 = r39
            r8 = r38
            r9 = r37
            r10 = r24
            r11 = r5
            r12 = r4
            r13 = r3
            r14 = r2
            r15 = r23
            r3 = r0
            r4 = r6
            r5 = r41
            r6 = r40
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.A06 = r0
        L_0x00c0:
            return
        L_0x00c1:
            boolean r3 = X.C51966G9m.A1Q(r8, r3)
            if (r13 == 0) goto L_0x00c9
            X.5Qk r6 = androidx.compose.ui.Modifier.A00
        L_0x00c9:
            boolean r2 = X.C51966G9m.A1R(r10, r2)
            r0 = r23
            boolean r23 = X.C51966G9m.A1R(r11, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00e1
            r8 = -1710850711(0xffffffff9a067d69, float:-2.7811856E-23)
            java.lang.String r0 = "com.instagram.barcelona.feed.post.ui.MediaCarousel (PostCarousel.kt:550)"
            X.0fL.A01(r8, r0)
        L_0x00e1:
            com.instagram.common.session.UserSession r20 = X.C51968G9o.A0h(r7)
            r0 = 1090519040(0x41000000, float:8.0)
            r10 = 1090519040(0x41000000, float:8.0)
            if (r3 == 0) goto L_0x00ec
            r0 = 0
        L_0x00ec:
            r8 = 0
            r11 = 10
            X.4gU r19 = X.I69.A01(r8, r7, r0, r11)
            r0 = 1090519040(0x41000000, float:8.0)
            if (r3 == 0) goto L_0x00f8
            r0 = 0
        L_0x00f8:
            X.4gU r18 = X.I69.A01(r8, r7, r0, r11)
            r13 = 1098907648(0x41800000, float:16.0)
            r17 = 1098907648(0x41800000, float:16.0)
            java.util.Iterator r12 = r37.iterator()
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x024c
            java.lang.Object r11 = r12.next()
            r0 = r39
            java.lang.Object r0 = r0.invoke(r11)
            float r14 = X.AnonymousClass7TE.A04(r0)
        L_0x0118:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0131
            java.lang.Object r11 = r12.next()
            r0 = r39
            java.lang.Object r0 = r0.invoke(r11)
            float r0 = X.AnonymousClass7TE.A04(r0)
            float r14 = java.lang.Math.max(r14, r0)
            goto L_0x0118
        L_0x0131:
            r12 = 1114636288(0x42700000, float:60.0)
            if (r2 != 0) goto L_0x0139
            r12 = 1094713344(0x41400000, float:12.0)
            r13 = 1094713344(0x41400000, float:12.0)
        L_0x0139:
            r11 = 1131741184(0x43750000, float:245.0)
            if (r24 <= 0) goto L_0x014a
            r0 = r24
            float r15 = (float) r0
            r16 = 1131741184(0x43750000, float:245.0)
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x0148
            r16 = r15
        L_0x0148:
            r11 = r16
        L_0x014a:
            r0 = 2143289344(0x7fc00000, float:NaN)
            androidx.compose.ui.Modifier r16 = X.C287205Zk.A0F(r6, r0, r11)
            float r10 = r10 + r17
            r11 = 0
            X.6Fj r0 = new X.6Fj
            r0.<init>(r12, r11, r10, r11)
            X.0sP r15 = X.C287655aY.A00
            X.Gfu r10 = new X.Gfu
            r10.<init>(r0, r15, r14)
            r0 = r16
            androidx.compose.ui.Modifier r31 = r0.Ezh(r10)
            r14 = 0
            r0 = r22
            androidx.compose.foundation.lazy.LazyListState r28 = X.C305066Gi.A00(r7, r1, r1, r1, r0)
            X.6Fj r10 = new X.6Fj
            r10.<init>(r12, r11, r13, r11)
            float r0 = X.C51968G9o.A01(r19)
            X.6Fc r26 = X.C287275Zs.A01(r0)
            r0 = 1978933194(0x75f41fca, float:6.189283E32)
            r7.ExS(r0)
            r11 = r9 & 14
            r0 = r21
            if (r11 == r0) goto L_0x0191
            r0 = r9 & 8
            if (r0 == 0) goto L_0x0203
            r0 = r37
            boolean r0 = r7.AGw(r0)
            if (r0 == 0) goto L_0x0203
        L_0x0191:
            r11 = 1
        L_0x0192:
            boolean r0 = X.C51973G9u.A1I(r9)
            r11 = r11 | r0
            boolean r0 = X.C51974G9v.A1W(r9)
            r11 = r11 | r0
            boolean r0 = X.C51973G9u.A1J(r9)
            r11 = r11 | r0
            r0 = r18
            boolean r12 = r7.AGu(r0)
            r0 = r20
            boolean r12 = X.C51968G9o.A1T(r7, r0, r11, r12)
            r11 = 1879048192(0x70000000, float:1.58456325E29)
            r11 = r11 & r9
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r11 != r0) goto L_0x01b5
            r14 = 1
        L_0x01b5:
            r12 = r12 | r14
            java.lang.Object r0 = r7.ECw()
            if (r12 != 0) goto L_0x01c0
            java.lang.Object r11 = X.AnonymousClass5XT.A00
            if (r0 != r11) goto L_0x01d7
        L_0x01c0:
            X.Ixe r0 = new X.Ixe
            r11 = r0
            r12 = r18
            r13 = r20
            r14 = r41
            r15 = r39
            r16 = r40
            r17 = r38
            r18 = r37
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r7.FLL(r0)
        L_0x01d7:
            X.0sP r0 = (X.0sP) r0
            X.C51965G9l.A1X(r7, r1)
            r11 = 29360128(0x1c00000, float:7.052966E-38)
            int r33 = r9 >> 3
            r33 = r33 & r11
            r34 = 104(0x68, float:1.46E-43)
            r25 = r8
            r27 = r10
            r29 = r7
            r30 = r8
            r32 = r0
            r35 = r1
            r36 = r23
            X.AnonymousClass6HY.A00(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x009f
            r0 = -655943987(0xffffffffd8e716cd, float:-2.03268092E15)
            X.0fL.A00(r0)
            goto L_0x009f
        L_0x0203:
            r11 = 0
            goto L_0x0192
        L_0x0205:
            r0 = r5 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x003d
            r0 = r39
            int r0 = X.G9t.A0I(r7, r0)
            r9 = r9 | r0
            goto L_0x003d
        L_0x0212:
            r0 = r5 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0035
            r0 = r40
            int r0 = X.G9t.A0H(r7, r0)
            r9 = r9 | r0
            goto L_0x0035
        L_0x021f:
            r0 = r5 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x002d
            r0 = r41
            int r0 = X.G9t.A0G(r7, r0)
            r9 = r9 | r0
            goto L_0x002d
        L_0x022c:
            r0 = r39 & 48
            if (r0 != 0) goto L_0x0025
            int r0 = X.G9t.A0Z(r7, r3)
            r9 = r9 | r0
            goto L_0x0025
        L_0x0237:
            r0 = r39 & 6
            if (r0 != 0) goto L_0x0249
            r0 = r37
            boolean r0 = X.G9t.A1T(r7, r0, r5)
            int r9 = X.C51970G9q.A05(r0)
            r9 = r9 | r39
            goto L_0x001f
        L_0x0249:
            r9 = r5
            goto L_0x001f
        L_0x024c:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56613I4o.A02(X.5Wy, androidx.compose.ui.Modifier, X.0sP, X.0sP, X.0sP, X.0sK, X.62P, int, int, int, boolean, boolean, boolean):void");
    }

    public static final void A03(C286575Wy r13, C55799Hnf hnf, 0sP r15, 0sP r16, 0sK r17, int i, int i2, boolean z) {
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = z;
        C55799Hnf hnf2 = hnf;
        0sK r8 = r17;
        int A08 = C51970G9q.A08(0, hnf, r8);
        C286575Wy r12 = r13;
        r13.ExV(1104367052);
        int i4 = i2;
        int i5 = i;
        if ((i2 & AnonymousClass972.MUTABLE_FLAG_MASK) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C51970G9q.A05(G9t.A1T(r13, hnf, i5) ? 1 : 0) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0Z(r13, z5);
        }
        0sP r9 = r15;
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0G(r13, r15);
        }
        0sP r152 = r16;
        if ((i2 & 4) != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i3 |= G9t.A0H(r13, r152);
        }
        if ((i2 & 8) != 0) {
            i3 |= 24576;
        } else if ((i5 & 24576) == 0) {
            i3 |= G9t.A0I(r13, r8);
        }
        if ((i3 & 9363) != 9362 || !r13.Bwn()) {
            z5 = C51966G9m.A1R(i6, z5);
            if (0fL.A02()) {
                0fL.A01(-968965121, "com.instagram.barcelona.feed.post.ui.CarouselItem (PostCarousel.kt:495)");
            }
            Modifier A0K = C51965G9l.A0K(r13, 568913213);
            Modifier A00 = C54739HQw.A00(A0K, hnf.A00, true);
            if (z5) {
                long A0F = C51966G9m.A0F(r13);
                AnonymousClass5aQ.A02(r13);
                A00 = A00.Ezh(C304816Fi.A03(A0K, AnonymousClass5ZM.A01, 0.0f, A0F));
            }
            C286565Wx A0H = C51965G9l.A0H(r12, false);
            r12.ExS(568922782);
            if (!hnf2.A04 && r9 != null) {
                if (r16 != null) {
                    r12.ExS(568926509);
                    boolean A1Q = C51973G9u.A1Q(r12, 568930820, i3);
                    int i7 = i3 & 14;
                    if (i7 == A08 || ((i3 & 8) != 0 && r12.AGw(hnf2))) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z6 = z3 | A1Q;
                    Object ECw = r12.ECw();
                    if (z6 || ECw == AnonymousClass5XT.A00) {
                        ECw = C51970G9q.A0u(r12, r152, hnf2, 47);
                    }
                    C62320sa A0y = C51965G9l.A0y(A0H, ECw, false);
                    boolean A1P = C51973G9u.A1P(r12, 568928416, i3);
                    if (i7 == A08 || ((i3 & 8) != 0 && r12.AGw(hnf2))) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z7 = A1P | z4;
                    Object ECw2 = r12.ECw();
                    if (z7 || ECw2 == AnonymousClass5XT.A00) {
                        ECw2 = C51970G9q.A0u(r12, r9, hnf2, 48);
                    }
                    A0K = AnonymousClass6DI.A01(r12, A0K, A0y, C51965G9l.A0y(A0H, ECw2, false));
                } else {
                    r12.ExS(568934902);
                    boolean A1P2 = C51973G9u.A1P(r12, 568936640, i3);
                    if ((i3 & 14) == A08 || ((i3 & 8) != 0 && r12.AGw(hnf2))) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z8 = z2 | A1P2;
                    Object ECw3 = r12.ECw();
                    if (z8 || ECw3 == AnonymousClass5XT.A00) {
                        ECw3 = C51970G9q.A0u(r12, r9, hnf2, 49);
                    }
                    A0K = AnonymousClass6DI.A00(r12, A0K, C51965G9l.A0y(A0H, ECw3, false));
                }
                C286565Wx.A0L(A0H, false);
            }
            Modifier A0B = C51967G9n.A0B(A0H, A00, A0K);
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A002 = C287425a7.A00(r12);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r12, A0B);
            C51973G9u.A0y(r12, A0H);
            C51971G9r.A12(r12, A0a, A04);
            0sL r2 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r12, A002)) {
                C51971G9r.A13(r12, r2, A002);
            }
            C51965G9l.A18(r12, A01);
            C51967G9n.A1M(C289515dj.A00, r12, r8, ((i3 >> 9) & 112) | 6);
            if (C51967G9n.A1R(r12)) {
                0fL.A00(-1824483383);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            0sK r14 = r8;
            C55799Hnf hnf3 = hnf2;
            0sP r122 = r9;
            ASQ.A06 = new C59194J9y(r122, hnf3, r14, r152, i5, i4, 3, z5);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: X.Pmh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: X.Pmh} */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01d6, code lost:
        if (r13 == r12) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01d8, code lost:
        r27 = new X.C73963Pmh(r17, r10, r15, r18, r55, 10);
        r9.FLL(r27);
        r27 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ee, code lost:
        r13 = X.C51965G9l.A0z(r16, r13);
        X.0qQ.A0B(r4, 0);
        X.0qQ.A0B(r13, r11);
        r2 = r2.Ezh(X.C304916Fs.A00(r4, r13, new X.MHC((X.AnonymousClass4D7) null, r13)));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0294  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r56, androidx.compose.ui.Modifier r57, com.instagram.api.schemas.LineType r58, X.C53273GlL r59, X.C303846Ba r60, java.lang.String r61, X.0sP r62, X.0sP r63, X.0sP r64, X.0sK r65, X.AnonymousClass62P r66, int r67, int r68, int r69, boolean r70, boolean r71, boolean r72, boolean r73, boolean r74, boolean r75, boolean r76) {
        /*
            r21 = r57
            r20 = r73
            r24 = r74
            r19 = r75
            r23 = r76
            r26 = r64
            r5 = 0
            r55 = r61
            r1 = r55
            r0 = r58
            boolean r11 = X.AnonymousClass7TF.A1U(r5, r1, r0)
            r13 = 4
            r36 = r66
            r0 = r36
            X.0qQ.A0B(r0, r13)
            r22 = 10
            r53 = r63
            r1 = r53
            r0 = r22
            X.0qQ.A0B(r1, r0)
            r0 = 1877130891(0x6fe2be8b, float:1.4034793E29)
            r9 = r56
            r9.ExV(r0)
            r6 = r69
            r0 = r69 & 1
            r8 = r67
            if (r0 == 0) goto L_0x0344
            r0 = r67 | 6
        L_0x003c:
            r1 = r69 & 2
            r4 = 16
            if (r1 == 0) goto L_0x0337
            r0 = r0 | 48
        L_0x0044:
            r1 = r69 & 4
            r10 = 256(0x100, float:3.59E-43)
            r50 = r70
            if (r1 == 0) goto L_0x032a
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r1 = r69 & 8
            r12 = 2048(0x800, float:2.87E-42)
            r57 = r59
            if (r1 == 0) goto L_0x031d
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0058:
            r1 = r69 & 16
            r14 = 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0310
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0060:
            r1 = r69 & 32
            r17 = 65536(0x10000, float:9.18355E-41)
            r16 = 196608(0x30000, float:2.75506E-40)
            r56 = r60
            if (r1 == 0) goto L_0x0303
            r0 = r0 | r16
        L_0x006c:
            r1 = r69 & 64
            r15 = 1572864(0x180000, float:2.204052E-39)
            r25 = r71
            if (r1 == 0) goto L_0x02f6
            r0 = r0 | r15
        L_0x0075:
            r2 = r6 & 128(0x80, float:1.794E-43)
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            r52 = r72
            if (r2 != 0) goto L_0x0087
            r1 = r1 & r67
            if (r1 != 0) goto L_0x0088
            r1 = r52
            int r1 = X.G9t.A0f(r9, r1)
        L_0x0087:
            r0 = r0 | r1
        L_0x0088:
            r2 = r6 & 256(0x100, float:3.59E-43)
            r1 = 100663296(0x6000000, float:2.4074124E-35)
            r35 = r65
            if (r2 != 0) goto L_0x009a
            r1 = r1 & r67
            if (r1 != 0) goto L_0x009b
            r1 = r35
            int r1 = X.G9t.A0M(r9, r1)
        L_0x009a:
            r0 = r0 | r1
        L_0x009b:
            r2 = r6 & 512(0x200, float:7.175E-43)
            r1 = 805306368(0x30000000, float:4.656613E-10)
            r54 = r62
            if (r2 != 0) goto L_0x00ad
            r1 = r1 & r67
            if (r1 != 0) goto L_0x00ae
            r1 = r54
            int r1 = X.G9t.A0N(r9, r1)
        L_0x00ad:
            r0 = r0 | r1
        L_0x00ae:
            r1 = r6 & 1024(0x400, float:1.435E-42)
            r7 = r68
            if (r1 == 0) goto L_0x02e5
            r1 = r68 | 6
        L_0x00b6:
            r3 = r6 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x02d4
            r1 = r1 | 48
        L_0x00bc:
            r4 = r6 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L_0x02c3
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x00c2:
            r10 = r6 & 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x02b2
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x00c8:
            r12 = r6 & 16384(0x4000, float:2.2959E-41)
            if (r12 == 0) goto L_0x02a1
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x00ce:
            r2 = 32768(0x8000, float:4.5918E-41)
            r14 = r69 & r2
            if (r14 == 0) goto L_0x0294
            r1 = r1 | r16
        L_0x00d7:
            r16 = r69 & r17
            if (r16 == 0) goto L_0x0287
            r1 = r1 | r15
        L_0x00dc:
            r2 = 306783379(0x12492493, float:6.34695E-28)
            r15 = r0 & r2
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r15 != r2) goto L_0x0130
            r15 = 599187(0x92493, float:8.3964E-40)
            r15 = r15 & r1
            r2 = 599186(0x92492, float:8.39638E-40)
            if (r15 != r2) goto L_0x0130
            boolean r2 = r9.Bwn()
            if (r2 == 0) goto L_0x0130
            r9.Evl()
        L_0x00f8:
            X.5Xd r1 = r9.ASQ()
            if (r1 == 0) goto L_0x012f
            X.JDT r0 = new X.JDT
            r27 = r56
            r28 = r55
            r29 = r54
            r30 = r53
            r31 = r26
            r32 = r35
            r33 = r36
            r34 = r8
            r35 = r7
            r36 = r6
            r37 = r50
            r38 = r25
            r39 = r52
            r40 = r20
            r41 = r24
            r42 = r19
            r43 = r23
            r23 = r0
            r24 = r21
            r25 = r58
            r26 = r57
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r1.A06 = r0
        L_0x012f:
            return
        L_0x0130:
            if (r3 == 0) goto L_0x0134
            X.5Qk r21 = androidx.compose.ui.Modifier.A00
        L_0x0134:
            r2 = r20
            boolean r20 = X.C51966G9m.A1Q(r4, r2)
            r2 = r24
            boolean r24 = X.C51966G9m.A1Q(r10, r2)
            r2 = r19
            boolean r19 = X.C51966G9m.A1R(r12, r2)
            r2 = r23
            boolean r23 = X.C51966G9m.A1R(r14, r2)
            if (r16 == 0) goto L_0x0150
            r26 = 0
        L_0x0150:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x015e
            r3 = 2100521807(0x7d336b4f, float:1.4905562E37)
            java.lang.String r2 = "com.instagram.barcelona.feed.post.ui.PostCarousel (PostCarousel.kt:194)"
            X.0fL.A01(r3, r2)
        L_0x015e:
            X.4bM r2 = X.AnonymousClass5YA.A05
            java.lang.Object r18 = r9.AJO(r2)
            X.0lg r10 = X.C51969G9p.A0j(r9)
            X.4bM r2 = X.C286915Yh.A00
            java.lang.Object r17 = r9.AJO(r2)
            r2 = -1568996238(0xffffffffa27b0472, float:-3.4019196E-18)
            java.lang.Object r2 = X.C51967G9n.A0m(r9, r2)
            java.lang.Object r12 = X.AnonymousClass5XT.A00
            java.lang.Object r15 = X.C51974G9v.A0Z(r9, r2, r12, r5)
            X.5Oz r15 = (X.C284945Oz) r15
            X.5Wx r16 = X.C51965G9l.A0H(r9, r5)
            boolean r49 = X.C51971G9r.A1W(r15)
            r2 = r57
            int r2 = r2.A00
            r46 = r2
            if (r71 == 0) goto L_0x0283
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
        L_0x018f:
            r2 = r58
            java.lang.Integer r4 = X.C304236Cr.A00(r2, r3)
            r3 = r50
            r2 = r21
            androidx.compose.ui.Modifier r3 = X.C304246Cs.A00(r2, r4, r3, r5)
            r2 = r57
            X.6Fk r2 = r2.A01
            androidx.compose.ui.Modifier r3 = X.C287195Zj.A00(r2, r3)
            X.J19 r2 = X.J19.A00
            androidx.compose.ui.Modifier r2 = X.AnonymousClass5R5.A00(r3, r2, r11)
            X.0Tu r14 = X.0Tu.A05
            r3 = 36327937196178245(0x81101100003b45, double:3.037271991500337E-306)
            boolean r3 = X.182.A06(r14, r10, r3)
            if (r3 == 0) goto L_0x0208
            X.5Qk r4 = androidx.compose.ui.Modifier.A00
            r14 = 1983600326(0x763b56c6, float:9.499214E32)
            r3 = r18
            boolean r14 = X.C51973G9u.A1S(r9, r3, r10, r14)
            r3 = r17
            boolean r14 = X.C51966G9m.A1U(r9, r3, r14)
            r3 = r0 & 14
            boolean r3 = X.AnonymousClass7TF.A1S(r3, r13)
            r3 = r3 | r14
            java.lang.Object r13 = r9.ECw()
            if (r3 != 0) goto L_0x01d8
            if (r13 != r12) goto L_0x01ee
        L_0x01d8:
            X.Pmh r13 = new X.Pmh
            r27 = r13
            r28 = r17
            r29 = r10
            r30 = r15
            r31 = r18
            r32 = r55
            r33 = r22
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r9.FLL(r13)
        L_0x01ee:
            r3 = r16
            X.0sP r13 = X.C51965G9l.A0z(r3, r13)
            X.0qQ.A0B(r4, r5)
            X.0qQ.A0B(r13, r11)
            r12 = 0
            X.MHC r3 = new X.MHC
            r3.<init>(r12, r13)
            androidx.compose.ui.Modifier r3 = X.C304916Fs.A00(r4, r13, r3)
            androidx.compose.ui.Modifier r2 = r2.Ezh(r3)
        L_0x0208:
            X.0Tu r12 = X.C51965G9l.A0Z(r10, r5)
            r3 = 36327761102518965(0x810fe800003ab5, double:3.037160629161136E-306)
            boolean r3 = X.C51965G9l.A1a(r12, r10, r3)
            if (r3 == 0) goto L_0x0227
            X.5Qk r10 = androidx.compose.ui.Modifier.A00
            X.IG7 r4 = new X.IG7
            r4.<init>(r11)
            r3 = 0
            androidx.compose.ui.Modifier r3 = X.C51970G9q.A0V(r10, r4, r3)
            androidx.compose.ui.Modifier r2 = r2.Ezh(r3)
        L_0x0227:
            X.J1A r41 = X.J1A.A00
            X.J1B r42 = X.J1B.A00
            X.J1C r43 = X.J1C.A00
            X.JHb r4 = new X.JHb
            r27 = r4
            r28 = r15
            r29 = r57
            r30 = r56
            r31 = r55
            r32 = r54
            r33 = r53
            r34 = r26
            r37 = r20
            r38 = r24
            r39 = r52
            r40 = r19
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r3 = 1145664750(0x444974ee, float:805.827)
            X.5PJ r44 = X.AnonymousClass5PI.A01(r9, r4, r3)
            r47 = 805334400(0x30006d80, float:4.672174E-10)
            int r3 = r0 >> 12
            r3 = r3 & 14
            r47 = r47 | r3
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            int r0 = r0 << 15
            r3 = r3 & r0
            r47 = r47 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            int r0 = r1 << 9
            r3 = r3 & r0
            r47 = r47 | r3
            r39 = r9
            r40 = r2
            r45 = r36
            r48 = r5
            r51 = r23
            A02(r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00f8
            r0 = 439126230(0x1a2c88d6, float:3.56793E-23)
            X.0fL.A00(r0)
            goto L_0x00f8
        L_0x0283:
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            goto L_0x018f
        L_0x0287:
            r2 = r68 & r15
            if (r2 != 0) goto L_0x00dc
            r2 = r26
            int r2 = X.G9t.A0K(r9, r2)
            r1 = r1 | r2
            goto L_0x00dc
        L_0x0294:
            r2 = r68 & r16
            if (r2 != 0) goto L_0x00d7
            r2 = r23
            int r2 = X.G9t.A0d(r9, r2)
            r1 = r1 | r2
            goto L_0x00d7
        L_0x02a1:
            r2 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x00ce
            r2 = r19
            boolean r2 = r9.AGv(r2)
            if (r2 != 0) goto L_0x02af
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x02af:
            r1 = r1 | r14
            goto L_0x00ce
        L_0x02b2:
            r2 = r7 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x00c8
            r2 = r24
            boolean r2 = r9.AGv(r2)
            if (r2 != 0) goto L_0x02c0
            r12 = 1024(0x400, float:1.435E-42)
        L_0x02c0:
            r1 = r1 | r12
            goto L_0x00c8
        L_0x02c3:
            r2 = r7 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x00c2
            r2 = r20
            boolean r2 = r9.AGv(r2)
            if (r2 != 0) goto L_0x02d1
            r10 = 128(0x80, float:1.794E-43)
        L_0x02d1:
            r1 = r1 | r10
            goto L_0x00c2
        L_0x02d4:
            r2 = r68 & 48
            if (r2 != 0) goto L_0x00bc
            r2 = r21
            boolean r2 = r9.AGu(r2)
            if (r2 == 0) goto L_0x02e2
            r4 = 32
        L_0x02e2:
            r1 = r1 | r4
            goto L_0x00bc
        L_0x02e5:
            r1 = r68 & 6
            if (r1 != 0) goto L_0x02f3
            r1 = r53
            int r1 = X.C41848B3p.A01(r9, r1)
            r1 = r1 | r68
            goto L_0x00b6
        L_0x02f3:
            r1 = r7
            goto L_0x00b6
        L_0x02f6:
            r1 = r67 & r15
            if (r1 != 0) goto L_0x0075
            r1 = r25
            int r1 = X.G9t.A0e(r9, r1)
            r0 = r0 | r1
            goto L_0x0075
        L_0x0303:
            r1 = r67 & r16
            if (r1 != 0) goto L_0x006c
            r1 = r56
            int r1 = X.G9t.A0T(r9, r1)
            r0 = r0 | r1
            goto L_0x006c
        L_0x0310:
            r1 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x0060
            r1 = r36
            int r1 = X.G9t.A0S(r9, r1)
            r0 = r0 | r1
            goto L_0x0060
        L_0x031d:
            r1 = r8 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x0058
            r1 = r57
            int r1 = X.G9t.A0R(r9, r1)
            r0 = r0 | r1
            goto L_0x0058
        L_0x032a:
            r1 = r8 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x004e
            r1 = r50
            int r1 = X.G9t.A0a(r9, r1)
            r0 = r0 | r1
            goto L_0x004e
        L_0x0337:
            r1 = r67 & 48
            if (r1 != 0) goto L_0x0044
            r1 = r58
            int r1 = X.G9t.A0P(r9, r1)
            r0 = r0 | r1
            goto L_0x0044
        L_0x0344:
            r0 = r67 & 6
            if (r0 != 0) goto L_0x0352
            r0 = r55
            int r0 = X.G9t.A0O(r9, r0)
            r0 = r0 | r67
            goto L_0x003c
        L_0x0352:
            r0 = r8
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56613I4o.A00(X.5Wy, androidx.compose.ui.Modifier, com.instagram.api.schemas.LineType, X.GlL, X.6Ba, java.lang.String, X.0sP, X.0sP, X.0sP, X.0sK, X.62P, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}

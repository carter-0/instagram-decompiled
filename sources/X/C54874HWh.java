package X;

/* renamed from: X.HWh  reason: case insensitive filesystem */
public abstract class C54874HWh {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: X.Ixx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: X.Ixx} */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013b, code lost:
        if (r8 == r1) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013d, code lost:
        r31 = new X.C58812Ixx(r32, r33, r14, r7, r36, r37, 2, r39);
        r6.FLL(r31);
        r31 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014d, code lost:
        X.GRY.A01(r6, r22, r23, (X.C288095bM) null, r0, X.C51965G9l.A0z(r17, r8), 8, 0, 952, r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0162, code lost:
        if (X.0fL.A02() == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0164, code lost:
        X.0fL.A00(-448635778);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r39, androidx.compose.ui.Modifier r40, X.C335867df r41, com.instagram.common.typedurl.ImageUrl r42, java.lang.String r43, java.lang.String r44, X.0sP r45, X.0sP r46, X.0sJ r47, int r48, int r49, boolean r50, boolean r51) {
        /*
            r2 = r40
            r3 = 0
            r37 = r43
            r32 = r45
            r1 = r32
            r0 = r37
            int r15 = X.C51970G9q.A08(r3, r0, r1)
            r14 = r46
            r33 = r47
            r0 = r33
            X.C51972G9s.A1E(r14, r0)
            r27 = 8
            r0 = 1578364719(0x5e13ef2f, float:2.66494763E18)
            r6 = r39
            r6.ExV(r0)
            r4 = r49
            r0 = r49 & 1
            r5 = r48
            if (r0 == 0) goto L_0x01e0
            r9 = r48 | 6
        L_0x002c:
            r0 = r49 & 2
            r36 = r44
            if (r0 == 0) goto L_0x01d3
            r9 = r9 | 48
        L_0x0034:
            r0 = r49 & 4
            r39 = r50
            if (r0 == 0) goto L_0x01c6
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x003c:
            r0 = r49 & 8
            r40 = r42
            if (r0 == 0) goto L_0x01b9
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x0044:
            r0 = r49 & 16
            r19 = 57344(0xe000, float:8.0356E-41)
            if (r0 == 0) goto L_0x01ae
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
        L_0x004d:
            r0 = r49 & 32
            r20 = r51
            if (r0 == 0) goto L_0x01a0
            r0 = 196608(0x30000, float:2.75506E-40)
        L_0x0055:
            r9 = r9 | r0
        L_0x0056:
            r0 = r49 & 64
            r8 = 3670016(0x380000, float:5.142788E-39)
            if (r0 == 0) goto L_0x0196
            r0 = 1572864(0x180000, float:2.204052E-39)
        L_0x005e:
            r9 = r9 | r0
        L_0x005f:
            r0 = r4 & 128(0x80, float:1.794E-43)
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            if (r0 == 0) goto L_0x018a
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x0067:
            r9 = r9 | r0
        L_0x0068:
            r0 = r4 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x017c
            r0 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x006e:
            r9 = r9 | r0
        L_0x006f:
            r7 = r4 & 512(0x200, float:7.175E-43)
            if (r7 == 0) goto L_0x0170
            r0 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0075:
            r9 = r9 | r0
        L_0x0076:
            r0 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r1 = r9 & r0
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r0) goto L_0x00ac
            boolean r0 = r6.Bwn()
            if (r0 == 0) goto L_0x00ac
            r6.Evl()
        L_0x0089:
            X.5Xd r1 = r6.ASQ()
            if (r1 == 0) goto L_0x00ab
            X.JBz r0 = new X.JBz
            r9 = r32
            r10 = r14
            r11 = r33
            r12 = r5
            r13 = r4
            r14 = r39
            r15 = r20
            r3 = r0
            r4 = r2
            r5 = r41
            r6 = r40
            r7 = r37
            r8 = r36
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.A06 = r0
        L_0x00ab:
            return
        L_0x00ac:
            if (r7 == 0) goto L_0x00b0
            X.5Qk r2 = androidx.compose.ui.Modifier.A00
        L_0x00b0:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00be
            r1 = 472068762(0x1c23329a, float:5.3997577E-22)
            java.lang.String r0 = "com.instagram.comments.mvvm.view.compose.CommentAvatar (CommentAvatar.kt:38)"
            X.0fL.A01(r1, r0)
        L_0x00be:
            r0 = -1544398156(0xffffffffa3f25ab4, float:-2.6276107E-17)
            java.lang.Object r7 = X.C51967G9n.A0m(r6, r0)
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r7 != r1) goto L_0x00d3
            r0 = r36
            java.lang.Object r0 = r14.invoke(r0)
            androidx.compose.runtime.ParcelableSnapshotMutableState r7 = X.G9t.A0o(r6, r0)
        L_0x00d3:
            X.5Oz r7 = (X.C284945Oz) r7
            X.5Wx r17 = X.C51965G9l.A0H(r6, r3)
            r13 = 1108344832(0x42100000, float:36.0)
            if (r51 == 0) goto L_0x016c
            r13 = 1105199104(0x41e00000, float:28.0)
            r12 = 1107558400(0x42040000, float:33.0)
        L_0x00e1:
            r24 = 0
            r11 = 1069547520(0x3fc00000, float:1.5)
            r10 = 1065353216(0x3f800000, float:1.0)
            X.GS6 r16 = new X.GS6
            r0 = r16
            r0.<init>(r13, r12, r11, r10)
            int r10 = r9 >> 9
            r0 = r40
            X.2DN r23 = X.C51966G9m.A0o(r6, r0, r10)
            X.7df r11 = X.C335867df.RESTRICT_SENSITIVITY_SCREEN
            r10 = 1065353216(0x3f800000, float:1.0)
            r0 = r41
            if (r0 != r11) goto L_0x0101
            r10 = 1053609165(0x3ecccccd, float:0.4)
        L_0x0101:
            androidx.compose.ui.Modifier r22 = X.HRF.A00(r2, r10)
            java.lang.Object r0 = r7.getValue()
            boolean r30 = X.AnonymousClass7TF.A1V(r0)
            r0 = -1544370140(0xffffffffa3f2c824, float:-2.6322455E-17)
            boolean r11 = X.C51974G9v.A1Z(r6, r0, r9)
            r10 = r9 & r18
            r0 = 8388608(0x800000, float:1.17549435E-38)
            boolean r10 = X.AnonymousClass7TF.A1S(r10, r0)
            r10 = r10 | r11
            r0 = r9 & 14
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r15)
            r10 = r10 | r0
            boolean r0 = X.C51973G9u.A1M(r9, r8)
            r10 = r10 | r0
            boolean r0 = X.C51973G9u.A1H(r9)
            r10 = r10 | r0
            r9 = r9 & r19
            boolean r0 = X.C51972G9s.A1K(r9)
            r10 = r10 | r0
            java.lang.Object r8 = r6.ECw()
            if (r10 != 0) goto L_0x013d
            if (r8 != r1) goto L_0x014d
        L_0x013d:
            r38 = 2
            X.Ixx r8 = new X.Ixx
            r31 = r8
            r34 = r14
            r35 = r7
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39)
            r6.FLL(r8)
        L_0x014d:
            r0 = r17
            X.0sP r26 = X.C51965G9l.A0z(r0, r8)
            r29 = 952(0x3b8, float:1.334E-42)
            r21 = r6
            r25 = r16
            r28 = r3
            X.GRY.A01(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0089
            r0 = -448635778(0xffffffffe5425c7e, float:-5.736533E22)
            X.0fL.A00(r0)
            goto L_0x0089
        L_0x016c:
            r12 = 1110441984(0x42300000, float:44.0)
            goto L_0x00e1
        L_0x0170:
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r48 & r0
            if (r0 != 0) goto L_0x0076
            int r0 = X.G9t.A0X(r6, r2)
            goto L_0x0075
        L_0x017c:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r48
            if (r0 != 0) goto L_0x006f
            r0 = r41
            int r0 = X.G9t.A0W(r6, r0)
            goto L_0x006e
        L_0x018a:
            r0 = r48 & r18
            if (r0 != 0) goto L_0x0068
            r0 = r33
            int r0 = X.G9t.A0L(r6, r0)
            goto L_0x0067
        L_0x0196:
            r0 = r48 & r8
            if (r0 != 0) goto L_0x005f
            int r0 = X.G9t.A0K(r6, r14)
            goto L_0x005e
        L_0x01a0:
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r48
            if (r0 != 0) goto L_0x0056
            r0 = r20
            int r0 = X.G9t.A0d(r6, r0)
            goto L_0x0055
        L_0x01ae:
            r0 = r48 & r19
            if (r0 != 0) goto L_0x004d
            int r0 = X.G9t.A0I(r6, r1)
            r9 = r9 | r0
            goto L_0x004d
        L_0x01b9:
            r0 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0044
            r0 = r40
            int r0 = X.G9t.A0R(r6, r0)
            r9 = r9 | r0
            goto L_0x0044
        L_0x01c6:
            r0 = r5 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x003c
            r0 = r39
            int r0 = X.G9t.A0a(r6, r0)
            r9 = r9 | r0
            goto L_0x003c
        L_0x01d3:
            r0 = r48 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0034
            r0 = r36
            int r0 = X.G9t.A0P(r6, r0)
            r9 = r9 | r0
            goto L_0x0034
        L_0x01e0:
            r0 = r48 & 14
            if (r0 != 0) goto L_0x01ee
            r0 = r37
            int r9 = X.G9t.A0O(r6, r0)
            r9 = r9 | r48
            goto L_0x002c
        L_0x01ee:
            r9 = r5
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54874HWh.A00(X.5Wy, androidx.compose.ui.Modifier, X.7df, com.instagram.common.typedurl.ImageUrl, java.lang.String, java.lang.String, X.0sP, X.0sP, X.0sJ, int, int, boolean, boolean):void");
    }
}

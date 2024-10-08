package X;

import android.view.View;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.I5m  reason: case insensitive filesystem */
public abstract class C56632I5m {
    public static final void A01(View view, C286575Wy r13, C53398GnV gnV, C53398GnV gnV2, C53398GnV gnV3, String str, String str2, C62320sa r19, int i, int i2, boolean z) {
        A00(view, r13, gnV, gnV2, gnV3, (ImageUrl) null, (Integer) null, str, str2, r19, i, 0, i2, false, z, false);
    }

    public static final void A02(C286575Wy r13, C53398GnV gnV, C53398GnV gnV2, String str, String str2, C62320sa r18) {
        A00((View) null, r13, gnV, gnV2, (C53398GnV) null, (ImageUrl) null, (Integer) null, str, str2, r18, 0, 0, 4064, false, false, false);
    }

    public static final void A03(C286575Wy r12, C53398GnV gnV, C53398GnV gnV2, String str, String str2, C62320sa r17, int i, int i2) {
        A00((View) null, r12, gnV, gnV2, (C53398GnV) null, (ImageUrl) null, (Integer) null, str, str2, r17, i, 0, i2, false, false, false);
    }

    public static final void A04(C286575Wy r12, C53398GnV gnV, String str, String str2, C62320sa r16, int i, int i2) {
        A00((View) null, r12, gnV, (C53398GnV) null, (C53398GnV) null, (ImageUrl) null, (Integer) null, str, str2, r16, i, 0, i2, false, false, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v42, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v43, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v69, resolved type: X.Pn2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v3, resolved type: X.Pn2} */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0190, code lost:
        if (r0 == X.AnonymousClass5XT.A00) goto L_0x0192;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.view.View r40, X.C286575Wy r41, X.C53398GnV r42, X.C53398GnV r43, X.C53398GnV r44, com.instagram.common.typedurl.ImageUrl r45, java.lang.Integer r46, java.lang.String r47, java.lang.String r48, X.C62320sa r49, int r50, int r51, int r52, boolean r53, boolean r54, boolean r55) {
        /*
            r24 = r47
            r23 = r48
            r29 = r42
            r28 = r43
            r27 = r44
            r30 = r40
            r9 = r53
            r5 = r55
            r6 = r54
            r26 = r45
            r25 = r46
            r8 = 0
            r15 = r49
            X.0qQ.A0B(r15, r8)
            r0 = -117693257(0xfffffffff8fc24b7, float:-4.0912609E34)
            r12 = r41
            r12.ExV(r0)
            r10 = r52
            r0 = r52 & 1
            r11 = r50
            if (r0 == 0) goto L_0x0220
            r7 = r50 | 6
        L_0x002e:
            r22 = r52 & 2
            if (r22 == 0) goto L_0x0213
            r7 = r7 | 48
        L_0x0034:
            r21 = r52 & 4
            if (r21 == 0) goto L_0x0206
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x003a:
            r20 = r52 & 8
            if (r20 == 0) goto L_0x01f9
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x0040:
            r19 = r52 & 16
            if (r19 == 0) goto L_0x01ec
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x0046:
            r17 = r52 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r17 != 0) goto L_0x0056
            r0 = r50 & r0
            if (r0 != 0) goto L_0x0057
            r0 = r27
            int r0 = X.G9t.A0T(r12, r0)
        L_0x0056:
            r7 = r7 | r0
        L_0x0057:
            r16 = r52 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r16 != 0) goto L_0x0067
            r0 = r50 & r0
            if (r0 != 0) goto L_0x0068
            r0 = r30
            int r0 = X.G9t.A0K(r12, r0)
        L_0x0067:
            r7 = r7 | r0
        L_0x0068:
            r13 = r10 & 128(0x80, float:1.794E-43)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            if (r13 != 0) goto L_0x0076
            r0 = r50 & r0
            if (r0 != 0) goto L_0x0077
            int r0 = X.G9t.A0f(r12, r9)
        L_0x0076:
            r7 = r7 | r0
        L_0x0077:
            r4 = r10 & 256(0x100, float:3.59E-43)
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            if (r4 != 0) goto L_0x0085
            r0 = r50 & r0
            if (r0 != 0) goto L_0x0086
            int r0 = X.G9t.A0g(r12, r6)
        L_0x0085:
            r7 = r7 | r0
        L_0x0086:
            r3 = r10 & 512(0x200, float:7.175E-43)
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r3 != 0) goto L_0x0094
            r0 = r50 & r0
            if (r0 != 0) goto L_0x0095
            int r0 = X.G9t.A0h(r12, r5)
        L_0x0094:
            r7 = r7 | r0
        L_0x0095:
            r2 = r10 & 1024(0x400, float:1.435E-42)
            r40 = r51
            if (r2 == 0) goto L_0x01da
            r18 = r51 | 6
        L_0x009d:
            r1 = r10 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x01cc
            r18 = r18 | 48
        L_0x00a3:
            r0 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r0 & r7
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r14) goto L_0x00e5
            r0 = r18 & 19
            r14 = 18
            if (r0 != r14) goto L_0x00e5
            boolean r0 = r12.Bwn()
            if (r0 == 0) goto L_0x00e5
            r12.Evl()
        L_0x00bb:
            X.5Xd r1 = r12.ASQ()
            if (r1 == 0) goto L_0x00e4
            X.JCm r0 = new X.JCm
            r31 = r29
            r32 = r28
            r33 = r27
            r34 = r26
            r35 = r25
            r36 = r24
            r37 = r23
            r38 = r15
            r39 = r11
            r41 = r10
            r42 = r9
            r43 = r6
            r44 = r5
            r29 = r0
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            r1.A06 = r0
        L_0x00e4:
            return
        L_0x00e5:
            if (r22 == 0) goto L_0x00e9
            r24 = 0
        L_0x00e9:
            if (r21 == 0) goto L_0x00ed
            r23 = 0
        L_0x00ed:
            if (r20 == 0) goto L_0x00f1
            r29 = 0
        L_0x00f1:
            if (r19 == 0) goto L_0x00f5
            r28 = 0
        L_0x00f5:
            if (r17 == 0) goto L_0x00f9
            r27 = 0
        L_0x00f9:
            if (r16 == 0) goto L_0x00fd
            r30 = 0
        L_0x00fd:
            r17 = 1
            boolean r9 = X.C51966G9m.A1R(r13, r9)
            boolean r6 = X.C51966G9m.A1Q(r4, r6)
            boolean r5 = X.C51966G9m.A1Q(r3, r5)
            if (r2 == 0) goto L_0x010f
            r26 = 0
        L_0x010f:
            if (r1 == 0) goto L_0x0113
            r25 = 0
        L_0x0113:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0121
            r1 = -1209977297(0xffffffffb7e1362f, float:-2.6847321E-5)
            java.lang.String r0 = "com.instagram.compose.igds.components.dialog.IgdsDialog (IgdsDialog.kt:39)"
            X.0fL.A01(r1, r0)
        L_0x0121:
            android.content.Context r16 = X.C51968G9o.A0I(r12)
            r0 = -68796860(0xfffffffffbe63e44, float:-2.3909823E36)
            r12.ExS(r0)
            if (r26 == 0) goto L_0x01c9
            X.4bM r0 = X.C286915Yh.A00
            java.lang.Object r14 = r12.AJO(r0)
            X.0iw r14 = (X.AnonymousClass0iw) r14
        L_0x0135:
            X.5Wx r13 = X.C51965G9l.A0H(r12, r8)
            X.5Oz r4 = X.C287175Zh.A00(r12, r15)
            X.0gF r3 = X.C60340gF.A00
            r1 = -68778920(0xfffffffffbe68458, float:-2.393825E36)
            r0 = r16
            boolean r2 = X.G9t.A1X(r12, r0, r4, r1)
            boolean r0 = X.C51973G9u.A1H(r7)
            r2 = r2 | r0
            boolean r0 = X.C51973G9u.A1I(r7)
            r2 = r2 | r0
            boolean r0 = X.C51974G9v.A1U(r7)
            r2 = r2 | r0
            boolean r0 = X.C51973G9u.A1J(r7)
            r2 = r2 | r0
            boolean r0 = X.C51974G9v.A1W(r7)
            r2 = r2 | r0
            boolean r1 = X.C51974G9v.A1T(r7)
            r0 = r30
            boolean r1 = X.C51968G9o.A1T(r12, r0, r2, r1)
            boolean r0 = X.C51973G9u.A1G(r18)
            r1 = r1 | r0
            boolean r0 = X.C51973G9u.A1H(r18)
            boolean r1 = X.C51968G9o.A1T(r12, r14, r1, r0)
            boolean r0 = X.C51974G9v.A1V(r7)
            r1 = r1 | r0
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r7 = r7 & r0
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            if (r7 == r0) goto L_0x0186
            r17 = 0
        L_0x0186:
            r1 = r1 | r17
            java.lang.Object r0 = r12.ECw()
            if (r1 != 0) goto L_0x0192
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x01b8
        L_0x0192:
            X.Pn2 r0 = new X.Pn2
            r41 = r0
            r42 = r16
            r43 = r30
            r44 = r4
            r45 = r29
            r46 = r28
            r47 = r27
            r48 = r14
            r49 = r26
            r50 = r25
            r51 = r24
            r52 = r23
            r53 = r5
            r54 = r9
            r55 = r6
            r41.<init>(r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            r12.FLL(r0)
        L_0x01b8:
            X.C51968G9o.A1F(r12, r13, r0, r3, r8)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00bb
            r0 = 911336578(0x3651e482, float:3.1276436E-6)
            X.0fL.A00(r0)
            goto L_0x00bb
        L_0x01c9:
            r14 = 0
            goto L_0x0135
        L_0x01cc:
            r0 = r51 & 48
            if (r0 != 0) goto L_0x00a3
            r0 = r25
            int r0 = X.G9t.A0P(r12, r0)
            r18 = r18 | r0
            goto L_0x00a3
        L_0x01da:
            r0 = r51 & 6
            if (r0 != 0) goto L_0x01e8
            r0 = r26
            int r0 = X.G9t.A0O(r12, r0)
            r18 = r51 | r0
            goto L_0x009d
        L_0x01e8:
            r18 = r40
            goto L_0x009d
        L_0x01ec:
            r0 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0046
            r0 = r28
            int r0 = X.G9t.A0S(r12, r0)
            r7 = r7 | r0
            goto L_0x0046
        L_0x01f9:
            r0 = r11 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0040
            r0 = r29
            int r0 = X.G9t.A0R(r12, r0)
            r7 = r7 | r0
            goto L_0x0040
        L_0x0206:
            r0 = r11 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x003a
            r0 = r23
            int r0 = X.G9t.A0Q(r12, r0)
            r7 = r7 | r0
            goto L_0x003a
        L_0x0213:
            r0 = r50 & 48
            if (r0 != 0) goto L_0x0034
            r0 = r24
            int r0 = X.G9t.A0P(r12, r0)
            r7 = r7 | r0
            goto L_0x0034
        L_0x0220:
            r0 = r50 & 6
            if (r0 != 0) goto L_0x022c
            int r7 = X.C41848B3p.A01(r12, r15)
            r7 = r7 | r50
            goto L_0x002e
        L_0x022c:
            r7 = r11
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56632I5m.A00(android.view.View, X.5Wy, X.GnV, X.GnV, X.GnV, com.instagram.common.typedurl.ImageUrl, java.lang.Integer, java.lang.String, java.lang.String, X.0sa, int, int, int, boolean, boolean, boolean):void");
    }
}

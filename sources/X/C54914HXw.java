package X;

/* renamed from: X.HXw  reason: case insensitive filesystem */
public abstract class C54914HXw {
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r10 == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        if (r10 == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a3, code lost:
        if ((r21 & 32) != 0) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r18, androidx.compose.ui.Modifier r19, X.AnonymousClass5ZB r20, X.AnonymousClass5Z4 r21, int r22, int r23, int r24, int r25, long r26) {
        /*
            r2 = r21
            r4 = r23
            r6 = r19
            r9 = 2
            r0 = 961489641(0x394f2ae9, float:1.9757044E-4)
            r7 = r18
            r7.ExV(r0)
            r21 = r25
            r0 = r25 & 1
            r5 = r22
            r3 = r24
            if (r0 == 0) goto L_0x0161
            r8 = r24 | 6
        L_0x001b:
            r0 = r25 & 2
            r24 = r26
            if (r0 == 0) goto L_0x0154
            r8 = r8 | 48
        L_0x0023:
            r0 = r21 & 4
            r1 = r20
            if (r0 == 0) goto L_0x0149
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x002b:
            r11 = r21 & 8
            if (r11 == 0) goto L_0x013e
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x0031:
            r0 = r3 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0044
            r0 = r21 & 16
            if (r0 != 0) goto L_0x0041
            boolean r10 = r7.AGs(r4)
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r10 != 0) goto L_0x0043
        L_0x0041:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x0043:
            r8 = r8 | r0
        L_0x0044:
            r0 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 & r3
            if (r0 != 0) goto L_0x0058
            r0 = r21 & 32
            if (r0 != 0) goto L_0x0055
            boolean r10 = r7.AGu(r2)
            r0 = 131072(0x20000, float:1.83671E-40)
            if (r10 != 0) goto L_0x0057
        L_0x0055:
            r0 = 65536(0x10000, float:9.18355E-41)
        L_0x0057:
            r8 = r8 | r0
        L_0x0058:
            r10 = 74899(0x12493, float:1.04956E-40)
            r10 = r10 & r8
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r10 != r0) goto L_0x0086
            boolean r0 = r7.Bwn()
            if (r0 == 0) goto L_0x0086
            r7.Evl()
        L_0x006a:
            X.5Xd r7 = r7.ASQ()
            if (r7 == 0) goto L_0x0085
            X.J9i r0 = new X.J9i
            r14 = r0
            r15 = r6
            r16 = r1
            r17 = r2
            r18 = r5
            r19 = r4
            r20 = r3
            r22 = r24
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r7.A06 = r0
        L_0x0085:
            return
        L_0x0086:
            r7.Ewr()
            r0 = r3 & 1
            r13 = -458753(0xfffffffffff8ffff, float:NaN)
            r12 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x011d
            boolean r0 = r7.Aw3()
            if (r0 != 0) goto L_0x011d
            r7.Evl()
            r0 = r21 & 16
            if (r0 == 0) goto L_0x00a1
            r8 = r8 & r12
        L_0x00a1:
            r0 = r21 & 32
            if (r0 == 0) goto L_0x00a6
        L_0x00a5:
            r8 = r8 & r13
        L_0x00a6:
            boolean r0 = X.C51967G9n.A1S(r7)
            if (r0 == 0) goto L_0x00b4
            r10 = 1358109243(0x50f31a3b, float:3.26286602E10)
            java.lang.String r0 = "com.instagram.creation.genai.attribution.bottomsheet.CreationGenAILearnMoreLink (CreationGenAILearnMoreLink.kt:31)"
            X.0fL.A01(r10, r0)
        L_0x00b4:
            android.content.Context r10 = X.C51968G9o.A0I(r7)
            android.content.res.Resources r12 = X.AnonymousClass7TF.A0A(r10)
            r14 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r13 = "learn_more"
            java.lang.String r11 = "Clickable learn more link"
            X.GnA r0 = new X.GnA
            r0.<init>((int) r14, (java.lang.String) r13, (java.lang.String) r11, (int) r9)
            r11 = 0
            X.GnA[] r0 = new X.C53380GnA[]{r0}
            X.5Tq r12 = X.HY7.A00(r12, r1, r0, r5)
            r0 = 383511590(0x16dbec26, float:3.553039E-25)
            boolean r0 = X.C51967G9n.A1Z(r7, r10, r0)
            java.lang.Object r9 = r7.ECw()
            if (r0 != 0) goto L_0x00e2
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r9 != r0) goto L_0x00e8
        L_0x00e2:
            r0 = 10
            X.MP4 r9 = X.C51969G9p.A0z(r7, r10, r0)
        L_0x00e8:
            X.0sP r9 = (X.0sP) r9
            X.C51965G9l.A1X(r7, r11)
            int r0 = r8 >> 6
            r16 = r0 & 112(0x70, float:1.57E-43)
            int r0 = r8 << 3
            r0 = r0 & 896(0x380, float:1.256E-42)
            r16 = r16 | r0
            r10 = 3670016(0x380000, float:5.142788E-39)
            int r0 = r8 << 6
            r10 = r10 & r0
            r16 = r16 | r10
            int r0 = r8 >> 12
            r17 = r0 & 112(0x70, float:1.57E-43)
            r18 = 112568(0x1b7b8, float:1.57741E-40)
            r19 = r24
            r13 = r2
            r14 = r9
            r15 = r4
            r11 = r6
            r10 = r7
            com.instagram.compose.core.ui.IgClickableTextKt.A02(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x006a
            r0 = 2004337589(0x7777c3b5, float:5.0252607E33)
            X.0fL.A00(r0)
            goto L_0x006a
        L_0x011d:
            if (r11 == 0) goto L_0x012e
            X.5Qk r11 = androidx.compose.ui.Modifier.A00
            r0 = 1090519040(0x41000000, float:8.0)
            r10 = 1098907648(0x41800000, float:16.0)
            r6 = 0
            androidx.compose.ui.Modifier r0 = X.C287195Zj.A0B(r11, r6, r0, r6, r10)
            androidx.compose.ui.Modifier r6 = X.C287195Zj.A09(r0, r10, r6)
        L_0x012e:
            r0 = r21 & 16
            if (r0 == 0) goto L_0x0134
            r8 = r8 & r12
            r4 = 5
        L_0x0134:
            r0 = r21 & 32
            if (r0 == 0) goto L_0x00a6
            X.5Z4 r2 = X.C51966G9m.A0b(r7)
            goto L_0x00a5
        L_0x013e:
            r0 = r3 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0031
            int r0 = X.G9t.A0R(r7, r6)
            r8 = r8 | r0
            goto L_0x0031
        L_0x0149:
            r0 = r3 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x002b
            int r0 = X.G9t.A0Q(r7, r1)
            r8 = r8 | r0
            goto L_0x002b
        L_0x0154:
            r0 = r3 & 48
            if (r0 != 0) goto L_0x0023
            r0 = r24
            int r0 = X.G9t.A0C(r7, r0)
            r8 = r8 | r0
            goto L_0x0023
        L_0x0161:
            r0 = r24 & 6
            if (r0 != 0) goto L_0x016d
            int r8 = X.G9t.A05(r7, r5)
            r8 = r8 | r24
            goto L_0x001b
        L_0x016d:
            r8 = r3
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54914HXw.A00(X.5Wy, androidx.compose.ui.Modifier, X.5ZB, X.5Z4, int, int, int, int, long):void");
    }
}

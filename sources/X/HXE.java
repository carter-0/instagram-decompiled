package X;

public abstract class HXE {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: X.PqV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: X.PqV} */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0049, code lost:
        if (r12.AGu(r24) == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        if (r6 == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0092, code lost:
        if (r6 == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x015c, code lost:
        if (r6 == X.AnonymousClass5XT.A00) goto L_0x015e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass6HS r30, X.C287295Zu r31, X.C304836Fk r32, androidx.compose.foundation.lazy.LazyListState r33, X.C286575Wy r34, X.C287245Zp r35, androidx.compose.ui.Modifier r36, X.HLV r37, java.lang.String r38, X.0sP r39, X.0sL r40, int r41, int r42, int r43, boolean r44, boolean r45) {
        /*
            r19 = r36
            r1 = r45
            r4 = r32
            r3 = r44
            r24 = r33
            r2 = r31
            r18 = r35
            r17 = r30
            r16 = r37
            r23 = r40
            r22 = 0
            r5 = 11
            r31 = r39
            r0 = r31
            X.0qQ.A0B(r0, r5)
            r0 = -2112929959(0xffffffff820f3f59, float:-1.0524161E-37)
            r12 = r34
            r12.ExV(r0)
            r10 = r43
            r0 = r43 & 1
            r45 = r38
            r11 = r41
            if (r0 == 0) goto L_0x0233
            r0 = r41 | 6
        L_0x0033:
            r21 = r43 & 2
            if (r21 == 0) goto L_0x0226
            r0 = r0 | 48
        L_0x0039:
            r5 = r11 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x004e
            r5 = r43 & 4
            if (r5 != 0) goto L_0x004b
            r5 = r24
            boolean r6 = r12.AGu(r5)
            r5 = 256(0x100, float:3.59E-43)
            if (r6 != 0) goto L_0x004d
        L_0x004b:
            r5 = 128(0x80, float:1.794E-43)
        L_0x004d:
            r0 = r0 | r5
        L_0x004e:
            r14 = r43 & 8
            if (r14 == 0) goto L_0x021b
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0054:
            r13 = r43 & 16
            if (r13 == 0) goto L_0x0210
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x005a:
            r5 = 196608(0x30000, float:2.75506E-40)
            r5 = r41 & r5
            if (r5 != 0) goto L_0x006f
            r5 = r43 & 32
            if (r5 != 0) goto L_0x006c
            boolean r6 = r12.AGu(r2)
            r5 = 131072(0x20000, float:1.83671E-40)
            if (r6 != 0) goto L_0x006e
        L_0x006c:
            r5 = 65536(0x10000, float:9.18355E-41)
        L_0x006e:
            r0 = r0 | r5
        L_0x006f:
            r20 = r43 & 64
            r5 = 1572864(0x180000, float:2.204052E-39)
            if (r20 != 0) goto L_0x007f
            r5 = r41 & r5
            if (r5 != 0) goto L_0x0080
            r5 = r18
            int r5 = X.G9t.A0U(r12, r5)
        L_0x007f:
            r0 = r0 | r5
        L_0x0080:
            r5 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r41 & r5
            if (r5 != 0) goto L_0x0097
            r5 = r10 & 128(0x80, float:1.794E-43)
            if (r5 != 0) goto L_0x0094
            r5 = r17
            boolean r6 = r12.AGu(r5)
            r5 = 8388608(0x800000, float:1.17549435E-38)
            if (r6 != 0) goto L_0x0096
        L_0x0094:
            r5 = 4194304(0x400000, float:5.877472E-39)
        L_0x0096:
            r0 = r0 | r5
        L_0x0097:
            r9 = r10 & 256(0x100, float:3.59E-43)
            r5 = 100663296(0x6000000, float:2.4074124E-35)
            if (r9 != 0) goto L_0x00a5
            r5 = r41 & r5
            if (r5 != 0) goto L_0x00a6
            int r5 = X.G9t.A0g(r12, r1)
        L_0x00a5:
            r0 = r0 | r5
        L_0x00a6:
            r8 = r10 & 512(0x200, float:7.175E-43)
            r5 = 805306368(0x30000000, float:4.656613E-10)
            if (r8 != 0) goto L_0x00b6
            r5 = r41 & r5
            if (r5 != 0) goto L_0x00b7
            r5 = r16
            int r5 = X.G9t.A0X(r12, r5)
        L_0x00b6:
            r0 = r0 | r5
        L_0x00b7:
            r7 = r10 & 1024(0x400, float:1.435E-42)
            r32 = r42
            if (r7 == 0) goto L_0x01fe
            r6 = r42 | 6
        L_0x00bf:
            r5 = r10 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x01f1
            r6 = r6 | 48
        L_0x00c5:
            r5 = 306783379(0x12492493, float:6.34695E-28)
            r15 = r0 & r5
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r15 != r5) goto L_0x010c
            r15 = r6 & 19
            r5 = 18
            if (r15 != r5) goto L_0x010c
            boolean r5 = r12.Bwn()
            if (r5 == 0) goto L_0x010c
            r12.Evl()
        L_0x00de:
            X.5Xd r5 = r12.ASQ()
            if (r5 == 0) goto L_0x010b
            r34 = 1
            X.JD1 r0 = new X.JD1
            r26 = r17
            r27 = r16
            r28 = r23
            r29 = r31
            r30 = r45
            r31 = r11
            r33 = r10
            r35 = r3
            r36 = r1
            r20 = r0
            r21 = r19
            r22 = r24
            r23 = r4
            r24 = r2
            r25 = r18
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r5.A06 = r0
        L_0x010b:
            return
        L_0x010c:
            r12.Ewr()
            r5 = r41 & 1
            if (r5 == 0) goto L_0x01ae
            boolean r5 = r12.Aw3()
            if (r5 != 0) goto L_0x01ae
            int r0 = X.C51971G9r.A06(r12, r10, r0)
            r5 = r43 & 32
            if (r5 == 0) goto L_0x0125
            r5 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r5
        L_0x0125:
            r5 = r10 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x012d
            r5 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r0 = r0 & r5
        L_0x012d:
            boolean r5 = X.C51967G9n.A1S(r12)
            if (r5 == 0) goto L_0x013b
            r7 = -16098746(0xffffffffff0a5a46, float:-1.839022E38)
            java.lang.String r5 = "com.instagram.compose.core.ui.lazylist.IgLazyRow (IgLazyRow.kt:42)"
            X.0fL.A01(r7, r5)
        L_0x013b:
            r5 = 572232005(0x221b9145, float:2.1083322E-18)
            boolean r8 = X.C51974G9v.A1Y(r12, r5, r6)
            boolean r5 = X.C51974G9v.A1U(r0)
            r8 = r8 | r5
            r7 = r0 & 14
            r5 = 4
            boolean r5 = X.AnonymousClass7TF.A1S(r7, r5)
            r8 = r8 | r5
            boolean r5 = X.C51968G9o.A1Q(r6)
            r8 = r8 | r5
            java.lang.Object r6 = r12.ECw()
            if (r8 != 0) goto L_0x015e
            java.lang.Object r5 = X.AnonymousClass5XT.A00
            if (r6 != r5) goto L_0x0172
        L_0x015e:
            r30 = 28
            X.PqV r6 = new X.PqV
            r25 = r6
            r26 = r31
            r27 = r23
            r28 = r16
            r29 = r45
            r25.<init>((java.lang.Object) r26, (java.lang.Object) r27, (java.lang.Object) r28, (java.lang.String) r29, (int) r30)
            r12.FLL(r6)
        L_0x0172:
            X.0sP r6 = (X.0sP) r6
            r5 = r22
            X.C51965G9l.A1X(r12, r5)
            int r7 = r0 >> 3
            r5 = r7 & 14
            r0 = r7 & 112(0x70, float:1.57E-43)
            int r0 = X.C51974G9v.A01(r5, r0, r7)
            int r41 = X.C51973G9u.A02(r7, r0)
            r33 = r17
            r34 = r2
            r35 = r4
            r36 = r24
            r37 = r12
            r38 = r18
            r39 = r19
            r40 = r6
            r42 = r22
            r43 = r3
            r44 = r1
            X.AnonymousClass6HY.A00(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00de
            r0 = -1500569861(0xffffffffa68f1efb, float:-9.931016E-16)
            X.0fL.A00(r0)
            goto L_0x00de
        L_0x01ae:
            if (r21 == 0) goto L_0x01b2
            X.5Qk r19 = androidx.compose.ui.Modifier.A00
        L_0x01b2:
            r5 = r43 & 4
            if (r5 == 0) goto L_0x01bc
            androidx.compose.foundation.lazy.LazyListState r24 = X.C51967G9n.A0A(r12)
            r0 = r0 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x01bc:
            X.6Fk r4 = X.G9t.A0n(r4, r14)
            boolean r3 = X.C51966G9m.A1Q(r13, r3)
            r5 = r43 & 32
            if (r5 == 0) goto L_0x01d0
            if (r3 != 0) goto L_0x01ee
            X.5Zu r2 = X.C287275Zs.A01
        L_0x01cc:
            r5 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r5
        L_0x01d0:
            if (r20 == 0) goto L_0x01d4
            X.5Zp r18 = X.C287215Zl.A05
        L_0x01d4:
            r5 = r10 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x01e0
            X.6IU r17 = X.C52385GQk.A00(r12)
            r5 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r0 = r0 & r5
        L_0x01e0:
            boolean r1 = X.C51966G9m.A1R(r9, r1)
            if (r8 == 0) goto L_0x01e8
            X.HLV r16 = X.HLV.HIDE
        L_0x01e8:
            if (r7 == 0) goto L_0x012d
            r23 = 0
            goto L_0x012d
        L_0x01ee:
            X.5Zu r2 = X.C287275Zs.A00
            goto L_0x01cc
        L_0x01f1:
            r5 = r42 & 48
            if (r5 != 0) goto L_0x00c5
            r5 = r31
            int r5 = X.G9t.A0F(r12, r5)
            r6 = r6 | r5
            goto L_0x00c5
        L_0x01fe:
            r5 = r42 & 6
            if (r5 != 0) goto L_0x020c
            r5 = r23
            int r5 = X.C41848B3p.A01(r12, r5)
            r6 = r42 | r5
            goto L_0x00bf
        L_0x020c:
            r6 = r32
            goto L_0x00bf
        L_0x0210:
            r5 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x005a
            int r5 = X.G9t.A0c(r12, r3)
            r0 = r0 | r5
            goto L_0x005a
        L_0x021b:
            r5 = r11 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0054
            int r5 = X.G9t.A0R(r12, r4)
            r0 = r0 | r5
            goto L_0x0054
        L_0x0226:
            r5 = r41 & 48
            if (r5 != 0) goto L_0x0039
            r5 = r19
            int r5 = X.G9t.A0P(r12, r5)
            r0 = r0 | r5
            goto L_0x0039
        L_0x0233:
            r0 = r41 & 6
            if (r0 != 0) goto L_0x0241
            r0 = r45
            int r0 = X.G9t.A0O(r12, r0)
            r0 = r0 | r41
            goto L_0x0033
        L_0x0241:
            r0 = r11
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HXE.A00(X.6HS, X.5Zu, X.6Fk, androidx.compose.foundation.lazy.LazyListState, X.5Wy, X.5Zp, androidx.compose.ui.Modifier, X.HLV, java.lang.String, X.0sP, X.0sL, int, int, int, boolean, boolean):void");
    }
}

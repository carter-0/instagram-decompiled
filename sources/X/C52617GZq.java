package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.GZq  reason: case insensitive filesystem */
public abstract class C52617GZq {
    public static final void A01(C304836Fk r15, GZF gzf, JNT jnt, C286575Wy r18, C287245Zp r19, Modifier modifier, 0sP r21, 0sJ r22, int i, int i2) {
        A00((AnonymousClass6F1) null, (C304716Ex) null, r15, gzf, jnt, r18, r19, modifier, (AnonymousClass5WO) null, r21, r22, 0.0f, 0, i, 3072, i2, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x021b, code lost:
        if ((r3 & 6) == 4) goto L_0x021d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006f, code lost:
        if (r3 == false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ad, code lost:
        if (r10.AGw(r2) == false) goto L_0x00af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass6F1 r34, X.C304716Ex r35, X.C304836Fk r36, X.GZF r37, X.JNT r38, X.C286575Wy r39, X.C287245Zp r40, androidx.compose.ui.Modifier r41, X.AnonymousClass5WO r42, X.0sP r43, X.0sJ r44, float r45, int r46, int r47, int r48, int r49, boolean r50, boolean r51) {
        /*
            r21 = r41
            r20 = r36
            r17 = r34
            r19 = r38
            r30 = r45
            r2 = r42
            r29 = r46
            r15 = r50
            r16 = r35
            r18 = r40
            r31 = r43
            r0 = 1870896258(0x6f839c82, float:8.1463485E28)
            r10 = r39
            r10.ExV(r0)
            r7 = r49
            r0 = r49 & 1
            r11 = r37
            r9 = r47
            if (r0 == 0) goto L_0x02d2
            r12 = r47 | 6
        L_0x002a:
            r28 = r49 & 2
            if (r28 == 0) goto L_0x02c5
            r12 = r12 | 48
        L_0x0030:
            r1 = r49 & 4
            if (r1 == 0) goto L_0x02b8
            r12 = r12 | 384(0x180, float:5.38E-43)
        L_0x0036:
            r27 = r49 & 8
            r26 = 1024(0x400, float:1.435E-42)
            if (r27 == 0) goto L_0x02ab
            r12 = r12 | 3072(0xc00, float:4.305E-42)
        L_0x003e:
            r25 = r49 & 16
            if (r25 == 0) goto L_0x029e
            r12 = r12 | 24576(0x6000, float:3.4438E-41)
        L_0x0044:
            r24 = r49 & 32
            r23 = 196608(0x30000, float:2.75506E-40)
            if (r24 == 0) goto L_0x028d
            r12 = r12 | r23
        L_0x004c:
            r22 = r49 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r22 != 0) goto L_0x005c
            r0 = r47 & r0
            if (r0 != 0) goto L_0x005d
            r0 = r18
            int r0 = X.G9t.A0U(r10, r0)
        L_0x005c:
            r12 = r12 | r0
        L_0x005d:
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r47 & r0
            if (r0 != 0) goto L_0x0074
            r0 = r7 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x0071
            r0 = r17
            boolean r3 = r10.AGu(r0)
            r0 = 8388608(0x800000, float:1.17549435E-38)
            if (r3 != 0) goto L_0x0073
        L_0x0071:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x0073:
            r12 = r12 | r0
        L_0x0074:
            r14 = r7 & 256(0x100, float:3.59E-43)
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            if (r14 != 0) goto L_0x0082
            r0 = r47 & r0
            if (r0 != 0) goto L_0x0083
            int r0 = X.G9t.A0g(r10, r15)
        L_0x0082:
            r12 = r12 | r0
        L_0x0083:
            r13 = r7 & 512(0x200, float:7.175E-43)
            r0 = 805306368(0x30000000, float:4.656613E-10)
            r32 = r51
            if (r13 != 0) goto L_0x0096
            r0 = r47 & r0
            r13 = 0
            if (r0 != 0) goto L_0x0097
            r0 = r32
            int r0 = X.G9t.A0h(r10, r0)
        L_0x0096:
            r12 = r12 | r0
        L_0x0097:
            r6 = r7 & 1024(0x400, float:1.435E-42)
            r8 = r48
            if (r6 == 0) goto L_0x027c
            r5 = r48 | 6
        L_0x009f:
            r0 = r48 & 48
            if (r0 != 0) goto L_0x00b2
            r0 = r7 & 2048(0x800, float:2.87E-42)
            if (r0 != 0) goto L_0x00af
            boolean r3 = r10.AGw(r2)
            r0 = 32
            if (r3 != 0) goto L_0x00b1
        L_0x00af:
            r0 = 16
        L_0x00b1:
            r5 = r5 | r0
        L_0x00b2:
            r4 = r7 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L_0x026f
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x00b8:
            r0 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x025d
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x00be:
            r0 = 306783379(0x12492493, float:6.34695E-28)
            r3 = r12 & r0
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r3 != r0) goto L_0x010c
            r0 = r5 & 1171(0x493, float:1.641E-42)
            r3 = r0
            r0 = 1170(0x492, float:1.64E-42)
            if (r3 != r0) goto L_0x010c
            boolean r0 = r10.Bwn()
            if (r0 == 0) goto L_0x010c
            r10.Evl()
            r50 = r32
        L_0x00da:
            X.5Xd r1 = r10.ASQ()
            if (r1 == 0) goto L_0x010b
            X.JD2 r0 = new X.JD2
            r32 = r0
            r33 = r17
            r34 = r16
            r35 = r20
            r36 = r11
            r37 = r19
            r38 = r18
            r39 = r21
            r40 = r2
            r41 = r31
            r42 = r44
            r43 = r30
            r44 = r29
            r45 = r9
            r46 = r8
            r47 = r7
            r48 = r15
            r49 = r50
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            r1.A06 = r0
        L_0x010b:
            return
        L_0x010c:
            r10.Ewr()
            r0 = r47 & 1
            if (r0 == 0) goto L_0x01b7
            boolean r0 = r10.Aw3()
            if (r0 != 0) goto L_0x01b7
            r10.Evl()
            r0 = r7 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0124
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r12 = r12 & r0
        L_0x0124:
            r0 = r7 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x012a
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
        L_0x012a:
            r50 = r32
        L_0x012c:
            boolean r0 = X.C51967G9n.A1S(r10)
            if (r0 == 0) goto L_0x013a
            r1 = -693381414(0xffffffffd6abd6da, float:-9.4469634E13)
            java.lang.String r0 = "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:124)"
            X.0fL.A01(r1, r0)
        L_0x013a:
            X.6Gj r32 = X.AnonymousClass6Gj.Horizontal
            X.5Zr r39 = X.C287215Zl.A00
            int r0 = r12 >> 3
            r0 = r0 & 14
            r3 = r0 | 24576(0x6000, float:3.4438E-41)
            int r0 = r12 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r3 = r3 | r0
            r0 = r12 & 896(0x380, float:1.256E-42)
            r3 = r3 | r0
            int r0 = r12 >> 18
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r0
            r0 = 458752(0x70000, float:6.42848E-40)
            int r1 = r12 >> 6
            r0 = r0 & r1
            r3 = r3 | r0
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r1
            r3 = r3 | r0
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            int r1 = r12 << 9
            r0 = r0 & r1
            r3 = r3 | r0
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r1
            r3 = r3 | r0
            r1 = 1879048192(0x70000000, float:1.58456325E29)
            int r0 = r12 << 18
            r1 = r1 & r0
            r3 = r3 | r1
            int r0 = r5 >> 3
            r0 = r0 & 14
            r1 = r0 | 384(0x180, float:5.38E-43)
            int r0 = r5 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | r0
            int r0 = r12 >> 9
            r4 = r0 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r1
            r0 = 57344(0xe000, float:8.0356E-41)
            int r1 = r5 << 6
            r0 = r0 & r1
            r4 = r4 | r0
            r0 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r0
            r4 = r4 | r1
            r49 = 0
            r33 = r17
            r34 = r16
            r35 = r20
            r36 = r11
            r37 = r19
            r38 = r10
            r40 = r18
            r41 = r21
            r42 = r2
            r43 = r31
            r45 = r30
            r46 = r29
            r47 = r3
            r48 = r4
            r51 = r15
            X.C52618GZr.A00(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00da
            r0 = -523335949(0xffffffffe0ce86f3, float:-1.1905479E20)
            X.0fL.A00(r0)
            goto L_0x00da
        L_0x01b7:
            if (r28 == 0) goto L_0x01bb
            X.5Qk r21 = androidx.compose.ui.Modifier.A00
        L_0x01bb:
            r0 = r20
            X.6Fk r20 = X.G9t.A0n(r0, r1)
            if (r27 == 0) goto L_0x01c5
            X.GZe r19 = X.C52605GZe.A00
        L_0x01c5:
            if (r25 == 0) goto L_0x01c9
            r29 = 0
        L_0x01c9:
            if (r24 == 0) goto L_0x01cd
            r30 = 0
        L_0x01cd:
            if (r22 == 0) goto L_0x01d1
            X.5Zp r18 = X.C287215Zl.A04
        L_0x01d1:
            r0 = r7 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x025a
            r1 = 0
            r3 = r12 & 14
            r3 = r3 | r23
            r50 = 0
            r0 = 30
            X.6F1 r17 = X.C52616GZp.A00(r1, r11, r10, r3, r0)
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r12 = r12 & r0
        L_0x01e6:
            boolean r15 = X.C51966G9m.A1R(r14, r15)
            if (r13 != 0) goto L_0x01ee
            r50 = r32
        L_0x01ee:
            if (r6 == 0) goto L_0x01f2
            r31 = 0
        L_0x01f2:
            r0 = r7 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0254
            X.6Gj r1 = X.AnonymousClass6Gj.Horizontal
            r0 = r12 & 14
            r3 = r0 | 432(0x1b0, float:6.05E-43)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x020a
            r2 = -1735663763(0xffffffff988bdf6d, float:-3.615626E-24)
            java.lang.String r0 = "androidx.compose.foundation.pager.PagerDefaults.pageNestedScrollConnection (Pager.kt:350)"
            X.0fL.A01(r2, r0)
        L_0x020a:
            r0 = r3 & 14
            r0 = r0 ^ 6
            r13 = 0
            r2 = 4
            if (r0 <= r2) goto L_0x0218
            boolean r0 = r10.AGu(r11)
            if (r0 != 0) goto L_0x021d
        L_0x0218:
            r0 = r3 & 6
            r6 = 0
            if (r0 != r2) goto L_0x021e
        L_0x021d:
            r6 = 1
        L_0x021e:
            r0 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r2 = 32
            if (r0 <= r2) goto L_0x022c
            boolean r0 = r10.AGu(r1)
            if (r0 != 0) goto L_0x0230
        L_0x022c:
            r0 = r3 & 48
            if (r0 != r2) goto L_0x0231
        L_0x0230:
            r13 = 1
        L_0x0231:
            r6 = r6 | r13
            java.lang.Object r2 = r10.ECw()
            if (r6 != 0) goto L_0x023c
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r2 != r0) goto L_0x0244
        L_0x023c:
            X.GZt r2 = new X.GZt
            r2.<init>(r1, r11)
            r10.FLL(r2)
        L_0x0244:
            X.GZt r2 = (X.C52620GZt) r2
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0252
            r0 = -436465610(0xffffffffe5fc1036, float:-1.4879192E23)
            X.0fL.A00(r0)
        L_0x0252:
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0254:
            if (r4 == 0) goto L_0x012c
            X.GZf r16 = X.C52606GZf.A00
            goto L_0x012c
        L_0x025a:
            r50 = 0
            goto L_0x01e6
        L_0x025d:
            r0 = r8 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x00be
            r0 = r44
            boolean r0 = r10.AGw(r0)
            if (r0 == 0) goto L_0x026b
            r26 = 2048(0x800, float:2.87E-42)
        L_0x026b:
            r5 = r5 | r26
            goto L_0x00be
        L_0x026f:
            r0 = r8 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x00b8
            r0 = r16
            int r0 = X.G9t.A0Q(r10, r0)
            r5 = r5 | r0
            goto L_0x00b8
        L_0x027c:
            r0 = r48 & 6
            if (r0 != 0) goto L_0x028a
            r0 = r31
            int r0 = X.C41848B3p.A01(r10, r0)
            r5 = r48 | r0
            goto L_0x009f
        L_0x028a:
            r5 = r8
            goto L_0x009f
        L_0x028d:
            r0 = r47 & r23
            if (r0 != 0) goto L_0x004c
            r0 = r30
            boolean r0 = r10.AGr(r0)
            int r0 = X.C51969G9p.A03(r0)
            r12 = r12 | r0
            goto L_0x004c
        L_0x029e:
            r0 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0044
            r0 = r29
            int r0 = X.G9t.A09(r10, r0)
            r12 = r12 | r0
            goto L_0x0044
        L_0x02ab:
            r0 = r9 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x003e
            r0 = r19
            int r0 = X.G9t.A0R(r10, r0)
            r12 = r12 | r0
            goto L_0x003e
        L_0x02b8:
            r0 = r9 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0036
            r0 = r20
            int r0 = X.G9t.A0Q(r10, r0)
            r12 = r12 | r0
            goto L_0x0036
        L_0x02c5:
            r0 = r47 & 48
            if (r0 != 0) goto L_0x0030
            r0 = r21
            int r0 = X.G9t.A0P(r10, r0)
            r12 = r12 | r0
            goto L_0x0030
        L_0x02d2:
            r0 = r47 & 6
            if (r0 != 0) goto L_0x02de
            int r12 = X.G9t.A0O(r10, r11)
            r12 = r12 | r47
            goto L_0x002a
        L_0x02de:
            r12 = r9
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52617GZq.A00(X.6F1, X.6Ex, X.6Fk, X.GZF, X.JNT, X.5Wy, X.5Zp, androidx.compose.ui.Modifier, X.5WO, X.0sP, X.0sJ, float, int, int, int, int, boolean, boolean):void");
    }
}

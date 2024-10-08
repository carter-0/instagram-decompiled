package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.6Cd  reason: invalid class name and case insensitive filesystem */
public abstract class C304096Cd {
    public static final void A02(C286575Wy r16, Modifier modifier, ImageUrl imageUrl) {
        A01(r16, (Alignment) null, modifier, (C288195bW) null, (C288095bM) null, imageUrl, (String) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, 0.0f, 48, 0, 2040, 0);
    }

    public static final void A03(C286575Wy r16, Modifier modifier, ImageUrl imageUrl, int i) {
        A01(r16, (Alignment) null, modifier, (C288195bW) null, (C288095bM) null, imageUrl, (String) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, 0.0f, i, 0, 2040, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00c2, code lost:
        if (r11.AGt(r0) == false) goto L_0x00c4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0105  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r36, androidx.compose.ui.Alignment r37, androidx.compose.ui.Modifier r38, X.C288195bW r39, X.C288095bM r40, X.AnonymousClass6BY r41, java.lang.String r42, X.C62320sa r43, X.C62320sa r44, X.C62320sa r45, float r46, int r47, int r48, int r49, long r50) {
        /*
            r5 = r38
            r35 = r43
            r0 = r50
            r34 = r44
            r22 = r45
            r4 = r37
            r3 = r40
            r15 = r46
            r8 = 0
            r37 = r41
            r2 = r37
            X.0qQ.A0B(r2, r8)
            r2 = 2028902831(0x78ee99af, float:3.8715116E34)
            r11 = r36
            r11.ExV(r2)
            r9 = r49
            r2 = r49 & 1
            r10 = r47
            if (r2 == 0) goto L_0x0208
            r2 = r47 | 6
        L_0x002a:
            r6 = r49 & 2
            r36 = r42
            if (r6 == 0) goto L_0x01f5
            r2 = r2 | 48
        L_0x0032:
            r21 = r49 & 4
            if (r21 == 0) goto L_0x01e4
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x0038:
            r20 = r49 & 8
            if (r20 == 0) goto L_0x01d1
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x003e:
            r19 = r49 & 16
            if (r19 == 0) goto L_0x01be
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x0044:
            r18 = r49 & 32
            r7 = 196608(0x30000, float:2.75506E-40)
            if (r18 != 0) goto L_0x005a
            r6 = r47 & r7
            if (r6 != 0) goto L_0x005b
            r6 = r22
            boolean r6 = r11.AGw(r6)
            r7 = 65536(0x10000, float:9.18355E-41)
            if (r6 == 0) goto L_0x005a
            r7 = 131072(0x20000, float:1.83671E-40)
        L_0x005a:
            r2 = r2 | r7
        L_0x005b:
            r17 = r49 & 64
            r6 = 1572864(0x180000, float:2.204052E-39)
            if (r17 != 0) goto L_0x006f
            r6 = r47 & r6
            if (r6 != 0) goto L_0x0070
            boolean r7 = r11.AGu(r4)
            r6 = 524288(0x80000, float:7.34684E-40)
            if (r7 == 0) goto L_0x006f
            r6 = 1048576(0x100000, float:1.469368E-39)
        L_0x006f:
            r2 = r2 | r6
        L_0x0070:
            r13 = r9 & 128(0x80, float:1.794E-43)
            r7 = 12582912(0xc00000, float:1.7632415E-38)
            if (r13 != 0) goto L_0x0084
            r6 = r47 & r7
            if (r6 != 0) goto L_0x0085
            boolean r6 = r11.AGu(r3)
            r7 = 4194304(0x400000, float:5.877472E-39)
            if (r6 == 0) goto L_0x0084
            r7 = 8388608(0x800000, float:1.17549435E-38)
        L_0x0084:
            r2 = r2 | r7
        L_0x0085:
            r12 = r9 & 256(0x100, float:3.59E-43)
            r7 = 100663296(0x6000000, float:2.4074124E-35)
            if (r12 != 0) goto L_0x0099
            r6 = r47 & r7
            if (r6 != 0) goto L_0x009a
            boolean r6 = r11.AGr(r15)
            r7 = 33554432(0x2000000, float:9.403955E-38)
            if (r6 == 0) goto L_0x0099
            r7 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x0099:
            r2 = r2 | r7
        L_0x009a:
            r7 = r9 & 512(0x200, float:7.175E-43)
            r14 = 805306368(0x30000000, float:4.656613E-10)
            r24 = r39
            if (r7 != 0) goto L_0x00b2
            r6 = r47 & r14
            if (r6 != 0) goto L_0x00b3
            r6 = r24
            boolean r6 = r11.AGu(r6)
            r14 = 268435456(0x10000000, float:2.5243549E-29)
            if (r6 == 0) goto L_0x00b2
            r14 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x00b2:
            r2 = r2 | r14
        L_0x00b3:
            r23 = r48
            r6 = r48 & 6
            if (r6 != 0) goto L_0x01ba
            r6 = r9 & 1024(0x400, float:1.435E-42)
            if (r6 != 0) goto L_0x00c4
            boolean r14 = r11.AGt(r0)
            r6 = 4
            if (r14 != 0) goto L_0x00c5
        L_0x00c4:
            r6 = 2
        L_0x00c5:
            r16 = r48 | r6
        L_0x00c7:
            r6 = 306783379(0x12492493, float:6.34695E-28)
            r14 = r2 & r6
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r14 != r6) goto L_0x0105
            r14 = r16 & 3
            r6 = 2
            if (r14 != r6) goto L_0x0105
            boolean r6 = r11.Bwn()
            if (r6 == 0) goto L_0x0105
            r11.Evl()
            r14 = r24
        L_0x00e1:
            X.5Xd r6 = r11.ASQ()
            if (r6 == 0) goto L_0x0104
            X.6Cf r2 = new X.6Cf
            r16 = r37
            r17 = r36
            r18 = r35
            r19 = r34
            r20 = r22
            r21 = r15
            r22 = r10
            r24 = r9
            r25 = r0
            r11 = r2
            r12 = r4
            r13 = r5
            r15 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r6.A06 = r2
        L_0x0104:
            return
        L_0x0105:
            r11.Ewr()
            r6 = r47 & 1
            if (r6 == 0) goto L_0x018b
            boolean r6 = r11.Aw3()
            if (r6 != 0) goto L_0x018b
            r11.Evl()
            r6 = r9 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x011b
            r16 = r16 & -15
        L_0x011b:
            r14 = r24
        L_0x011d:
            r11.ASM()
            boolean r6 = X.0fL.A02()
            if (r6 == 0) goto L_0x012e
            r7 = 1136483803(0x43bd5ddb, float:378.73325)
            java.lang.String r6 = "com.instagram.barcelona.common.ui.image.BdsImage (BdsImage.kt:68)"
            X.0fL.A01(r7, r6)
        L_0x012e:
            r29 = r2 & 14
            int r6 = r16 << 3
            r6 = r6 & 112(0x70, float:1.57E-43)
            r29 = r29 | r6
            int r6 = r2 >> 3
            r7 = r6 & 896(0x380, float:1.256E-42)
            r29 = r29 | r7
            r7 = r6 & 7168(0x1c00, float:1.0045E-41)
            r29 = r29 | r7
            r12 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r12
            r29 = r29 | r6
            r24 = r11
            r25 = r37
            r26 = r35
            r27 = r34
            r28 = r22
            r30 = r0
            X.2DN r28 = X.C304106Ce.A01(r24, r25, r26, r27, r28, r29, r30)
            r7 = r2 & 112(0x70, float:1.57E-43)
            r6 = r2 & 896(0x380, float:1.256E-42)
            r7 = r7 | r6
            int r6 = r2 >> 9
            r2 = r6 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 | r2
            r12 = r12 & r6
            r7 = r7 | r12
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r6
            r7 = r7 | r2
            r2 = 3670016(0x380000, float:5.142788E-39)
            r6 = r6 & r2
            r6 = r6 | r7
            r25 = r4
            r26 = r5
            r27 = r14
            r29 = r3
            r30 = r36
            r31 = r15
            r32 = r6
            r33 = r8
            X.AnonymousClass6G3.A00(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x00e1
            r2 = 2126901030(0x7ec5ef26, float:1.3154982E38)
            X.0fL.A00(r2)
            goto L_0x00e1
        L_0x018b:
            if (r21 == 0) goto L_0x018f
            X.5Qk r5 = androidx.compose.ui.Modifier.A00
        L_0x018f:
            r14 = 0
            if (r20 == 0) goto L_0x0194
            r35 = r14
        L_0x0194:
            if (r19 == 0) goto L_0x0198
            r34 = r14
        L_0x0198:
            if (r18 == 0) goto L_0x019c
            r22 = r14
        L_0x019c:
            if (r17 == 0) goto L_0x01a0
            androidx.compose.ui.Alignment r4 = X.C287215Zl.A09
        L_0x01a0:
            if (r13 == 0) goto L_0x01a4
            X.5bM r3 = X.C288075bK.A04
        L_0x01a4:
            if (r12 == 0) goto L_0x01a8
            r15 = 1065353216(0x3f800000, float:1.0)
        L_0x01a8:
            if (r7 != 0) goto L_0x01ac
            r14 = r24
        L_0x01ac:
            r6 = r9 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x011d
            X.5Yw r0 = X.AnonymousClass5aQ.A00(r11)
            long r0 = r0.A0f
            r16 = r16 & -15
            goto L_0x011d
        L_0x01ba:
            r16 = r23
            goto L_0x00c7
        L_0x01be:
            r6 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x0044
            r6 = r34
            boolean r7 = r11.AGw(r6)
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r7 == 0) goto L_0x01ce
            r6 = 16384(0x4000, float:2.2959E-41)
        L_0x01ce:
            r2 = r2 | r6
            goto L_0x0044
        L_0x01d1:
            r6 = r10 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x003e
            r6 = r35
            boolean r7 = r11.AGw(r6)
            r6 = 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L_0x01e1
            r6 = 2048(0x800, float:2.87E-42)
        L_0x01e1:
            r2 = r2 | r6
            goto L_0x003e
        L_0x01e4:
            r6 = r10 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0038
            boolean r7 = r11.AGu(r5)
            r6 = 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x01f2
            r6 = 256(0x100, float:3.59E-43)
        L_0x01f2:
            r2 = r2 | r6
            goto L_0x0038
        L_0x01f5:
            r6 = r47 & 48
            if (r6 != 0) goto L_0x0032
            r6 = r36
            boolean r7 = r11.AGu(r6)
            r6 = 16
            if (r7 == 0) goto L_0x0205
            r6 = 32
        L_0x0205:
            r2 = r2 | r6
            goto L_0x0032
        L_0x0208:
            r2 = r47 & 6
            if (r2 != 0) goto L_0x021a
            r2 = r37
            boolean r6 = r11.AGu(r2)
            r2 = 2
            if (r6 == 0) goto L_0x0216
            r2 = 4
        L_0x0216:
            r2 = r2 | r47
            goto L_0x002a
        L_0x021a:
            r2 = r10
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C304096Cd.A00(X.5Wy, androidx.compose.ui.Alignment, androidx.compose.ui.Modifier, X.5bW, X.5bM, X.6BY, java.lang.String, X.0sa, X.0sa, X.0sa, float, int, int, int, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00bc, code lost:
        if (r9.AGt(r0) == false) goto L_0x00be;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0105  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r38, androidx.compose.ui.Alignment r39, androidx.compose.ui.Modifier r40, X.C288195bW r41, X.C288095bM r42, com.instagram.common.typedurl.ImageUrl r43, java.lang.String r44, X.C62320sa r45, X.C62320sa r46, X.C62320sa r47, float r48, int r49, int r50, int r51, long r52) {
        /*
            r5 = r40
            r35 = r47
            r37 = r45
            r36 = r46
            r4 = r39
            r3 = r42
            r8 = r48
            r0 = r52
            r2 = 410276100(0x18745104, float:3.1577163E-24)
            r9 = r38
            r9.ExV(r2)
            r6 = r51
            r2 = r51 & 1
            r7 = r49
            r15 = r43
            if (r2 == 0) goto L_0x0205
            r11 = r49 | 6
        L_0x0024:
            r2 = r51 & 2
            r38 = r44
            if (r2 == 0) goto L_0x01f2
            r11 = r11 | 48
        L_0x002c:
            r21 = r51 & 4
            if (r21 == 0) goto L_0x01e1
            r11 = r11 | 384(0x180, float:5.38E-43)
        L_0x0032:
            r20 = r51 & 8
            if (r20 == 0) goto L_0x01ce
            r11 = r11 | 3072(0xc00, float:4.305E-42)
        L_0x0038:
            r19 = r51 & 16
            if (r19 == 0) goto L_0x01bb
            r11 = r11 | 24576(0x6000, float:3.4438E-41)
        L_0x003e:
            r18 = r51 & 32
            r10 = 196608(0x30000, float:2.75506E-40)
            if (r18 != 0) goto L_0x0054
            r2 = r49 & r10
            if (r2 != 0) goto L_0x0055
            r2 = r35
            boolean r2 = r9.AGw(r2)
            r10 = 65536(0x10000, float:9.18355E-41)
            if (r2 == 0) goto L_0x0054
            r10 = 131072(0x20000, float:1.83671E-40)
        L_0x0054:
            r11 = r11 | r10
        L_0x0055:
            r17 = r51 & 64
            r2 = 1572864(0x180000, float:2.204052E-39)
            if (r17 != 0) goto L_0x0069
            r2 = r49 & r2
            if (r2 != 0) goto L_0x006a
            boolean r10 = r9.AGu(r4)
            r2 = 524288(0x80000, float:7.34684E-40)
            if (r10 == 0) goto L_0x0069
            r2 = 1048576(0x100000, float:1.469368E-39)
        L_0x0069:
            r11 = r11 | r2
        L_0x006a:
            r13 = r6 & 128(0x80, float:1.794E-43)
            r10 = 12582912(0xc00000, float:1.7632415E-38)
            if (r13 != 0) goto L_0x007e
            r2 = r49 & r10
            if (r2 != 0) goto L_0x007f
            boolean r2 = r9.AGu(r3)
            r10 = 4194304(0x400000, float:5.877472E-39)
            if (r2 == 0) goto L_0x007e
            r10 = 8388608(0x800000, float:1.17549435E-38)
        L_0x007e:
            r11 = r11 | r10
        L_0x007f:
            r12 = r6 & 256(0x100, float:3.59E-43)
            r10 = 100663296(0x6000000, float:2.4074124E-35)
            if (r12 != 0) goto L_0x0093
            r2 = r49 & r10
            if (r2 != 0) goto L_0x0094
            boolean r2 = r9.AGr(r8)
            r10 = 33554432(0x2000000, float:9.403955E-38)
            if (r2 == 0) goto L_0x0093
            r10 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x0093:
            r11 = r11 | r10
        L_0x0094:
            r10 = r6 & 512(0x200, float:7.175E-43)
            r14 = 805306368(0x30000000, float:4.656613E-10)
            r22 = r41
            if (r10 != 0) goto L_0x00ac
            r2 = r49 & r14
            if (r2 != 0) goto L_0x00ad
            r2 = r22
            boolean r2 = r9.AGu(r2)
            r14 = 268435456(0x10000000, float:2.5243549E-29)
            if (r2 == 0) goto L_0x00ac
            r14 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x00ac:
            r11 = r11 | r14
        L_0x00ad:
            r34 = r50
            r2 = r50 & 6
            if (r2 != 0) goto L_0x01b7
            r2 = r6 & 1024(0x400, float:1.435E-42)
            if (r2 != 0) goto L_0x00be
            boolean r14 = r9.AGt(r0)
            r2 = 4
            if (r14 != 0) goto L_0x00bf
        L_0x00be:
            r2 = 2
        L_0x00bf:
            r16 = r50 | r2
        L_0x00c1:
            r2 = 306783379(0x12492493, float:6.34695E-28)
            r14 = r11 & r2
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r14 != r2) goto L_0x0105
            r14 = r16 & 3
            r2 = 2
            if (r14 != r2) goto L_0x0105
            boolean r2 = r9.Bwn()
            if (r2 == 0) goto L_0x0105
            r9.Evl()
            r21 = r22
        L_0x00db:
            X.5Xd r9 = r9.ASQ()
            if (r9 == 0) goto L_0x0104
            X.JCS r2 = new X.JCS
            r22 = r2
            r23 = r4
            r24 = r5
            r25 = r21
            r26 = r3
            r27 = r15
            r28 = r38
            r29 = r37
            r30 = r36
            r31 = r35
            r32 = r8
            r33 = r7
            r35 = r6
            r36 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r9.A06 = r2
        L_0x0104:
            return
        L_0x0105:
            r9.Ewr()
            r2 = r49 & 1
            if (r2 == 0) goto L_0x0187
            boolean r2 = r9.Aw3()
            if (r2 != 0) goto L_0x0187
            r9.Evl()
            r2 = r6 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x011b
            r16 = r16 & -15
        L_0x011b:
            r21 = r22
        L_0x011d:
            r9.ASM()
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x012e
            r10 = -39051347(0xfffffffffdac1fad, float:-2.859896E37)
            java.lang.String r2 = "com.instagram.barcelona.common.ui.image.BdsImage (BdsImage.kt:35)"
            X.0fL.A01(r10, r2)
        L_0x012e:
            X.6BY r2 = new X.6BY
            r2.<init>(r15)
            r29 = r11 & 112(0x70, float:1.57E-43)
            r10 = r11 & 896(0x380, float:1.256E-42)
            r29 = r29 | r10
            r10 = r11 & 7168(0x1c00, float:1.0045E-41)
            r29 = r29 | r10
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r11
            r29 = r29 | r10
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r11
            r29 = r29 | r10
            r10 = 3670016(0x380000, float:5.142788E-39)
            r10 = r10 & r11
            r29 = r29 | r10
            r10 = 29360128(0x1c00000, float:7.052966E-38)
            r10 = r10 & r11
            r29 = r29 | r10
            r10 = 234881024(0xe000000, float:1.5777218E-30)
            r10 = r10 & r11
            r29 = r29 | r10
            r10 = 1879048192(0x70000000, float:1.58456325E29)
            r11 = r11 & r10
            r29 = r29 | r11
            r30 = r16 & 14
            r31 = 0
            r22 = r3
            r23 = r2
            r24 = r38
            r25 = r37
            r26 = r36
            r27 = r35
            r28 = r8
            r32 = r0
            r18 = r9
            r19 = r4
            r20 = r5
            A00(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x00db
            r2 = 214030838(0xcc1d9f6, float:2.9867539E-31)
            X.0fL.A00(r2)
            goto L_0x00db
        L_0x0187:
            if (r21 == 0) goto L_0x018b
            X.5Qk r5 = androidx.compose.ui.Modifier.A00
        L_0x018b:
            r21 = 0
            if (r20 == 0) goto L_0x0191
            r37 = r21
        L_0x0191:
            if (r19 == 0) goto L_0x0195
            r36 = r21
        L_0x0195:
            if (r18 == 0) goto L_0x0199
            r35 = r21
        L_0x0199:
            if (r17 == 0) goto L_0x019d
            androidx.compose.ui.Alignment r4 = X.C287215Zl.A09
        L_0x019d:
            if (r13 == 0) goto L_0x01a1
            X.5bM r3 = X.C288075bK.A04
        L_0x01a1:
            if (r12 == 0) goto L_0x01a5
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x01a5:
            if (r10 != 0) goto L_0x01a9
            r21 = r22
        L_0x01a9:
            r2 = r6 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x011d
            X.5Yw r0 = X.AnonymousClass5aQ.A00(r9)
            long r0 = r0.A0f
            r16 = r16 & -15
            goto L_0x011d
        L_0x01b7:
            r16 = r34
            goto L_0x00c1
        L_0x01bb:
            r2 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x003e
            r2 = r36
            boolean r10 = r9.AGw(r2)
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x01cb
            r2 = 16384(0x4000, float:2.2959E-41)
        L_0x01cb:
            r11 = r11 | r2
            goto L_0x003e
        L_0x01ce:
            r2 = r7 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0038
            r2 = r37
            boolean r10 = r9.AGw(r2)
            r2 = 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L_0x01de
            r2 = 2048(0x800, float:2.87E-42)
        L_0x01de:
            r11 = r11 | r2
            goto L_0x0038
        L_0x01e1:
            r2 = r7 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0032
            boolean r10 = r9.AGu(r5)
            r2 = 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x01ef
            r2 = 256(0x100, float:3.59E-43)
        L_0x01ef:
            r11 = r11 | r2
            goto L_0x0032
        L_0x01f2:
            r2 = r49 & 48
            if (r2 != 0) goto L_0x002c
            r2 = r38
            boolean r10 = r9.AGu(r2)
            r2 = 16
            if (r10 == 0) goto L_0x0202
            r2 = 32
        L_0x0202:
            r11 = r11 | r2
            goto L_0x002c
        L_0x0205:
            r2 = r49 & 6
            if (r2 != 0) goto L_0x0215
            boolean r2 = r9.AGu(r15)
            r11 = 2
            if (r2 == 0) goto L_0x0211
            r11 = 4
        L_0x0211:
            r11 = r11 | r49
            goto L_0x0024
        L_0x0215:
            r11 = r7
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C304096Cd.A01(X.5Wy, androidx.compose.ui.Alignment, androidx.compose.ui.Modifier, X.5bW, X.5bM, com.instagram.common.typedurl.ImageUrl, java.lang.String, X.0sa, X.0sa, X.0sa, float, int, int, int, long):void");
    }
}

package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5hS  reason: invalid class name and case insensitive filesystem */
public abstract class C291525hS {
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C286575Wy r28, androidx.compose.ui.Modifier r29, X.C286025Tq r30, X.AnonymousClass5Z4 r31, java.util.Map r32, X.0sP r33, int r34, int r35, int r36, int r37, int r38, boolean r39) {
        /*
            r15 = r32
            r8 = r35
            r21 = r39
            r22 = r34
            r23 = r33
            r17 = r31
            r5 = r36
            r2 = r29
            r10 = 0
            r0 = -1064305212(0xffffffffc08ffdc4, float:-4.4997272)
            r7 = r28
            r7.ExV(r0)
            r3 = r38
            r0 = r38 & 1
            r4 = r37
            r6 = r30
            if (r0 == 0) goto L_0x02e1
            r9 = r37 | 6
        L_0x0025:
            r20 = r38 & 2
            if (r20 == 0) goto L_0x02d0
            r9 = r9 | 48
        L_0x002b:
            r19 = r38 & 4
            if (r19 == 0) goto L_0x02bd
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x0031:
            r18 = r38 & 8
            if (r18 == 0) goto L_0x02aa
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x0037:
            r16 = r38 & 16
            if (r16 == 0) goto L_0x0297
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
        L_0x003d:
            r14 = r38 & 32
            r1 = 196608(0x30000, float:2.75506E-40)
            if (r14 != 0) goto L_0x0053
            r0 = r37 & r1
            if (r0 != 0) goto L_0x0054
            r0 = r21
            boolean r0 = r7.AGv(r0)
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r0 == 0) goto L_0x0053
            r1 = 131072(0x20000, float:1.83671E-40)
        L_0x0053:
            r9 = r9 | r1
        L_0x0054:
            r13 = r38 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r13 != 0) goto L_0x0068
            r0 = r37 & r0
            if (r0 != 0) goto L_0x0069
            boolean r1 = r7.AGs(r8)
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r1 == 0) goto L_0x0068
            r0 = 1048576(0x100000, float:1.469368E-39)
        L_0x0068:
            r9 = r9 | r0
        L_0x0069:
            r1 = r3 & 128(0x80, float:1.794E-43)
            r11 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 != 0) goto L_0x007d
            r0 = r37 & r11
            if (r0 != 0) goto L_0x007e
            boolean r0 = r7.AGs(r5)
            r11 = 4194304(0x400000, float:5.877472E-39)
            if (r0 == 0) goto L_0x007d
            r11 = 8388608(0x800000, float:1.17549435E-38)
        L_0x007d:
            r9 = r9 | r11
        L_0x007e:
            r11 = r3 & 256(0x100, float:3.59E-43)
            r12 = 100663296(0x6000000, float:2.4074124E-35)
            if (r11 != 0) goto L_0x0092
            r0 = r37 & r12
            if (r0 != 0) goto L_0x0093
            boolean r0 = r7.AGw(r15)
            r12 = 33554432(0x2000000, float:9.403955E-38)
            if (r0 == 0) goto L_0x0092
            r12 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x0092:
            r9 = r9 | r12
        L_0x0093:
            r0 = r3 & 512(0x200, float:7.175E-43)
            r12 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 != 0) goto L_0x00a7
            r0 = r37 & r12
            if (r0 != 0) goto L_0x00a8
            boolean r0 = r7.AGw(r10)
            r12 = 268435456(0x10000000, float:2.5243549E-29)
            if (r0 == 0) goto L_0x00a7
            r12 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x00a7:
            r9 = r9 | r12
        L_0x00a8:
            r0 = 306783379(0x12492493, float:6.34695E-28)
            r12 = r9 & r0
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r12 != r0) goto L_0x00dd
            boolean r0 = r7.Bwn()
            if (r0 == 0) goto L_0x00dd
            r7.Evl()
        L_0x00bb:
            X.5Xd r1 = r7.ASQ()
            if (r1 == 0) goto L_0x00dc
            X.GSE r0 = new X.GSE
            r9 = r0
            r10 = r2
            r11 = r6
            r12 = r17
            r13 = r15
            r14 = r23
            r15 = r22
            r16 = r8
            r17 = r5
            r18 = r4
            r19 = r3
            r20 = r21
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1.A06 = r0
        L_0x00dc:
            return
        L_0x00dd:
            if (r20 == 0) goto L_0x00e1
            X.5Qk r2 = androidx.compose.ui.Modifier.A00
        L_0x00e1:
            if (r19 == 0) goto L_0x00e5
            X.5Z4 r17 = X.AnonymousClass5Z4.A03
        L_0x00e5:
            if (r18 == 0) goto L_0x00e9
            r23 = 0
        L_0x00e9:
            if (r16 == 0) goto L_0x00ed
            r22 = 1
        L_0x00ed:
            if (r14 == 0) goto L_0x00f1
            r21 = 1
        L_0x00f1:
            if (r13 == 0) goto L_0x00f6
            r8 = 2147483647(0x7fffffff, float:NaN)
        L_0x00f6:
            if (r1 == 0) goto L_0x00f9
            r5 = 1
        L_0x00f9:
            if (r11 == 0) goto L_0x00ff
            X.0sm r15 = X.0Yt.A0E()
        L_0x00ff:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x010d
            r1 = -2033697746(0xffffffff86c83c2e, float:-7.5320065E-35)
            java.lang.String r0 = "androidx.compose.foundation.text.BasicText (BasicText.kt:191)"
            X.0fL.A01(r1, r0)
        L_0x010d:
            X.C291535hT.A00(r5, r8)
            X.4bM r0 = X.C291545hU.A00
            r7.AJO(r0)
            r0 = -1584467526(0xffffffffa18ef1ba, float:-9.686279E-19)
            r7.ExS(r0)
            r1 = r7
            X.5Wx r1 = (X.C286565Wx) r1
            r0 = 0
            X.C286565Wx.A0L(r1, r0)
            java.lang.String r11 = r6.A00
            int r12 = r11.length()
            java.lang.String r11 = "androidx.compose.foundation.text.inlineContent"
            boolean r38 = r6.A07(r11, r0, r12)
            boolean r11 = X.AnonymousClass6GB.A00(r6)
            if (r38 != 0) goto L_0x01ec
            if (r11 != 0) goto L_0x01ec
            r9 = -1584294453(0xffffffffa19195cb, float:-9.865232E-19)
            r7.ExS(r9)
            r26 = 1065353216(0x3f800000, float:1.0)
            r29 = 0
            long r30 = X.C285605Ry.A01
            X.5S2 r25 = X.AnonymousClass5S0.A00
            long r32 = X.AnonymousClass5RV.A00
            androidx.compose.ui.graphics.GraphicsLayerElement r9 = new androidx.compose.ui.graphics.GraphicsLayerElement
            r27 = r26
            r28 = r26
            r34 = r32
            r36 = r0
            r24 = r9
            r24.<init>(r25, r26, r27, r28, r29, r30, r32, r34, r36)
            androidx.compose.ui.Modifier r12 = r2.Ezh(r9)
            X.4bM r11 = X.AnonymousClass5YA.A03
            X.5RM r9 = X.C286565Wx.A04(r1)
            java.lang.Object r9 = X.C286615Xc.A01(r11, r9)
            X.5Uu r9 = (X.C286305Uu) r9
            androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement r11 = new androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement
            r24 = r11
            r25 = r6
            r26 = r17
            r27 = r9
            r28 = r10
            r29 = r23
            r30 = r10
            r31 = r10
            r32 = r22
            r33 = r8
            r34 = r5
            r35 = r21
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            X.5Qk r9 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r9 = r12.Ezh(r9)
            androidx.compose.ui.Modifier r9 = r9.Ezh(r11)
            X.5hW r13 = X.C291565hW.A00
            int r14 = X.C287425a7.A00(r7)
            androidx.compose.ui.Modifier r11 = X.C287435a8.A01(r7, r9)
            X.5RM r12 = X.C286565Wx.A04(r1)
            X.0sa r10 = X.C287485aD.A00
            r7.ExX()
            boolean r9 = r1.A0K
            if (r9 == 0) goto L_0x01e8
            r7.AMT(r10)
        L_0x01a6:
            X.0sL r9 = X.C287485aD.A03
            X.C287595aO.A00(r7, r13, r9)
            X.0sL r9 = X.C287485aD.A05
            X.C287595aO.A00(r7, r12, r9)
            X.0sL r9 = X.C287485aD.A04
            X.C287595aO.A00(r7, r11, r9)
            X.0sL r11 = X.C287485aD.A02
            boolean r9 = r1.A0K
            if (r9 != 0) goto L_0x01c9
            java.lang.Object r10 = r7.ECw()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            boolean r9 = X.0qQ.A0K(r10, r9)
            if (r9 != 0) goto L_0x01d3
        L_0x01c9:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            r7.FLL(r9)
            r7.ABr(r9, r11)
        L_0x01d3:
            r9 = 1
            X.C286565Wx.A0L(r1, r9)
        L_0x01d7:
            X.C286565Wx.A0L(r1, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00bb
            r0 = 590186278(0x232d8726, float:9.406968E-18)
            X.0fL.A00(r0)
            goto L_0x00bb
        L_0x01e8:
            r7.FMk()
            goto L_0x01a6
        L_0x01ec:
            r10 = -1583391888(0xffffffffa19f5b70, float:-1.0798462E-18)
            r7.ExS(r10)
            r12 = r9 & 14
            r11 = 4
            r10 = 0
            if (r12 != r11) goto L_0x01f9
            r10 = 1
        L_0x01f9:
            java.lang.Object r14 = r7.ECw()
            if (r10 != 0) goto L_0x0203
            java.lang.Object r10 = X.AnonymousClass5XT.A00
            if (r14 != r10) goto L_0x0214
        L_0x0203:
            X.5Or r11 = X.C284885Or.A00
            java.lang.String r10 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>"
            X.0qQ.A0C(r11, r10)
            X.0eM r10 = X.C284905Ot.A01
            androidx.compose.runtime.ParcelableSnapshotMutableState r14 = new androidx.compose.runtime.ParcelableSnapshotMutableState
            r14.<init>(r11, r6)
            r1.A0Q(r14)
        L_0x0214:
            X.5Oz r14 = (X.C284945Oz) r14
            java.lang.Object r13 = r14.getValue()
            X.5Tq r13 = (X.C286025Tq) r13
            X.4bM r11 = X.AnonymousClass5YA.A03
            X.5RM r10 = X.C286565Wx.A04(r1)
            java.lang.Object r12 = X.C286615Xc.A01(r11, r10)
            X.5Uu r12 = (X.C286305Uu) r12
            boolean r11 = r7.AGu(r14)
            java.lang.Object r10 = r7.ECw()
            if (r11 != 0) goto L_0x0236
            java.lang.Object r11 = X.AnonymousClass5XT.A00
            if (r10 != r11) goto L_0x0240
        L_0x0236:
            r11 = 24
            X.9L6 r10 = new X.9L6
            r10.<init>(r14, r11)
            r7.FLL(r10)
        L_0x0240:
            X.0sP r10 = (X.0sP) r10
            int r11 = r9 >> 3
            r14 = r11 & 14
            r11 = r11 & 896(0x380, float:1.256E-42)
            r11 = r11 | r14
            r16 = 57344(0xe000, float:8.0356E-41)
            int r14 = r9 >> 12
            r16 = r16 & r14
            r11 = r11 | r16
            r16 = 458752(0x70000, float:6.42848E-40)
            int r14 = r9 << 9
            r16 = r16 & r14
            r11 = r11 | r16
            r14 = 3670016(0x380000, float:5.142788E-39)
            int r16 = r9 << 6
            r14 = r14 & r16
            r11 = r11 | r14
            r14 = 29360128(0x1c00000, float:7.052966E-38)
            r14 = r14 & r16
            r11 = r11 | r14
            r14 = 234881024(0xe000000, float:1.5777218E-30)
            r14 = r14 & r16
            r11 = r11 | r14
            r14 = 1879048192(0x70000000, float:1.58456325E29)
            r14 = r14 & r16
            r11 = r11 | r14
            int r9 = r9 >> 21
            r9 = r9 & 896(0x380, float:1.256E-42)
            r29 = r15
            r30 = r23
            r31 = r10
            r32 = r22
            r33 = r8
            r34 = r5
            r35 = r11
            r36 = r9
            r37 = r0
            r39 = r21
            r24 = r7
            r25 = r2
            r26 = r13
            r27 = r17
            r28 = r12
            A01(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            goto L_0x01d7
        L_0x0297:
            r0 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x003d
            r0 = r22
            boolean r1 = r7.AGs(r0)
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x02a7
            r0 = 16384(0x4000, float:2.2959E-41)
        L_0x02a7:
            r9 = r9 | r0
            goto L_0x003d
        L_0x02aa:
            r0 = r4 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0037
            r0 = r23
            boolean r1 = r7.AGw(r0)
            r0 = 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x02ba
            r0 = 2048(0x800, float:2.87E-42)
        L_0x02ba:
            r9 = r9 | r0
            goto L_0x0037
        L_0x02bd:
            r0 = r4 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0031
            r0 = r17
            boolean r1 = r7.AGu(r0)
            r0 = 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x02cd
            r0 = 256(0x100, float:3.59E-43)
        L_0x02cd:
            r9 = r9 | r0
            goto L_0x0031
        L_0x02d0:
            r0 = r37 & 48
            if (r0 != 0) goto L_0x002b
            boolean r1 = r7.AGu(r2)
            r0 = 16
            if (r1 == 0) goto L_0x02de
            r0 = 32
        L_0x02de:
            r9 = r9 | r0
            goto L_0x002b
        L_0x02e1:
            r0 = r37 & 6
            if (r0 != 0) goto L_0x02f1
            boolean r0 = r7.AGu(r6)
            r9 = 2
            if (r0 == 0) goto L_0x02ed
            r9 = 4
        L_0x02ed:
            r9 = r9 | r37
            goto L_0x0025
        L_0x02f1:
            r9 = r4
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C291525hS.A02(X.5Wy, androidx.compose.ui.Modifier, X.5Tq, X.5Z4, java.util.Map, X.0sP, int, int, int, int, int, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C286575Wy r24, androidx.compose.ui.Modifier r25, X.AnonymousClass5Z4 r26, java.lang.String r27, X.0sP r28, int r29, int r30, int r31, int r32, int r33, boolean r34) {
        /*
            r7 = r30
            r12 = r34
            r20 = r29
            r9 = r28
            r11 = r26
            r6 = r31
            r4 = r25
            r10 = 0
            r0 = -1186827822(0xffffffffb94271d2, float:-1.8543683E-4)
            r1 = r24
            r1.ExV(r0)
            r2 = r33
            r3 = r33 & 1
            r34 = r27
            r0 = r32
            if (r3 == 0) goto L_0x024d
            r8 = r32 | 6
        L_0x0023:
            r19 = r33 & 2
            if (r19 == 0) goto L_0x023c
            r8 = r8 | 48
        L_0x0029:
            r18 = r33 & 4
            if (r18 == 0) goto L_0x022b
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x002f:
            r17 = r33 & 8
            if (r17 == 0) goto L_0x021a
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x0035:
            r16 = r33 & 16
            if (r16 == 0) goto L_0x0207
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
        L_0x003b:
            r15 = r33 & 32
            r3 = 196608(0x30000, float:2.75506E-40)
            if (r15 != 0) goto L_0x004f
            r3 = r3 & r32
            if (r3 != 0) goto L_0x0050
            boolean r5 = r1.AGv(r12)
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r5 == 0) goto L_0x004f
            r3 = 131072(0x20000, float:1.83671E-40)
        L_0x004f:
            r8 = r8 | r3
        L_0x0050:
            r14 = r33 & 64
            r3 = 1572864(0x180000, float:2.204052E-39)
            if (r14 != 0) goto L_0x0064
            r3 = r32 & r3
            if (r3 != 0) goto L_0x0065
            boolean r5 = r1.AGs(r7)
            r3 = 524288(0x80000, float:7.34684E-40)
            if (r5 == 0) goto L_0x0064
            r3 = 1048576(0x100000, float:1.469368E-39)
        L_0x0064:
            r8 = r8 | r3
        L_0x0065:
            r5 = r2 & 128(0x80, float:1.794E-43)
            r13 = 12582912(0xc00000, float:1.7632415E-38)
            if (r5 != 0) goto L_0x0079
            r3 = r32 & r13
            if (r3 != 0) goto L_0x007a
            boolean r3 = r1.AGs(r6)
            r13 = 4194304(0x400000, float:5.877472E-39)
            if (r3 == 0) goto L_0x0079
            r13 = 8388608(0x800000, float:1.17549435E-38)
        L_0x0079:
            r8 = r8 | r13
        L_0x007a:
            r3 = r2 & 256(0x100, float:3.59E-43)
            r13 = 100663296(0x6000000, float:2.4074124E-35)
            if (r3 != 0) goto L_0x008e
            r3 = r32 & r13
            if (r3 != 0) goto L_0x008f
            boolean r3 = r1.AGw(r10)
            r13 = 33554432(0x2000000, float:9.403955E-38)
            if (r3 == 0) goto L_0x008e
            r13 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x008e:
            r8 = r8 | r13
        L_0x008f:
            r3 = 38347923(0x2492493, float:1.4777644E-37)
            r8 = r8 & r3
            r3 = 38347922(0x2492492, float:1.4777643E-37)
            if (r8 != r3) goto L_0x00c1
            boolean r3 = r1.Bwn()
            if (r3 == 0) goto L_0x00c1
            r1.Evl()
        L_0x00a1:
            X.5Xd r3 = r1.ASQ()
            if (r3 == 0) goto L_0x00c0
            X.JAq r1 = new X.JAq
            r13 = r11
            r14 = r34
            r15 = r9
            r16 = r20
            r17 = r7
            r18 = r6
            r19 = r0
            r20 = r2
            r21 = r12
            r11 = r1
            r12 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r3.A06 = r1
        L_0x00c0:
            return
        L_0x00c1:
            if (r19 == 0) goto L_0x00c5
            X.5Qk r4 = androidx.compose.ui.Modifier.A00
        L_0x00c5:
            if (r18 == 0) goto L_0x00c9
            X.5Z4 r11 = X.AnonymousClass5Z4.A03
        L_0x00c9:
            if (r17 == 0) goto L_0x00cc
            r9 = 0
        L_0x00cc:
            if (r16 == 0) goto L_0x00d0
            r20 = 1
        L_0x00d0:
            if (r15 == 0) goto L_0x00d3
            r12 = 1
        L_0x00d3:
            if (r14 == 0) goto L_0x00d8
            r7 = 2147483647(0x7fffffff, float:NaN)
        L_0x00d8:
            if (r5 == 0) goto L_0x00db
            r6 = 1
        L_0x00db:
            boolean r3 = X.0fL.A02()
            if (r3 == 0) goto L_0x00e9
            r5 = -865111887(0xffffffffcc6f70b1, float:-6.2767812E7)
            java.lang.String r3 = "androidx.compose.foundation.text.BasicText (BasicText.kt:96)"
            X.0fL.A01(r5, r3)
        L_0x00e9:
            X.C291535hT.A00(r6, r7)
            X.4bM r3 = X.C291545hU.A00
            r1.AJO(r3)
            r3 = -1588686502(0xffffffffa14e915a, float:-6.9987886E-19)
            r1.ExS(r3)
            r3 = r1
            X.5Wx r3 = (X.C286565Wx) r3
            r5 = 0
            X.C286565Wx.A0L(r3, r5)
            if (r9 == 0) goto L_0x01bf
            r8 = -1588564052(0xffffffffa1506fac, float:-7.062094E-19)
            r1.ExS(r8)
            r23 = 1065353216(0x3f800000, float:1.0)
            r26 = 0
            long r27 = X.C285605Ry.A01
            X.5S2 r22 = X.AnonymousClass5S0.A00
            long r29 = X.AnonymousClass5RV.A00
            androidx.compose.ui.graphics.GraphicsLayerElement r8 = new androidx.compose.ui.graphics.GraphicsLayerElement
            r21 = r8
            r24 = r23
            r25 = r23
            r31 = r29
            r33 = r5
            r21.<init>(r22, r23, r24, r25, r26, r27, r29, r31, r33)
            androidx.compose.ui.Modifier r14 = r4.Ezh(r8)
            X.0sn r13 = X.0sn.A00
            X.5Tq r15 = new X.5Tq
            r8 = r34
            r15.<init>(r13, r13, r8)
            X.4bM r13 = X.AnonymousClass5YA.A03
            X.5RM r8 = X.C286565Wx.A04(r3)
            java.lang.Object r8 = X.C286615Xc.A01(r13, r8)
            X.5Uu r8 = (X.C286305Uu) r8
            androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement r13 = new androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement
            r27 = r10
            r28 = r10
            r29 = r20
            r30 = r7
            r31 = r6
            r32 = r12
            r21 = r13
            r22 = r15
            r23 = r11
            r24 = r8
            r25 = r10
            r26 = r9
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            X.5Qk r8 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r8 = r14.Ezh(r8)
            androidx.compose.ui.Modifier r8 = r8.Ezh(r13)
        L_0x015f:
            X.C286565Wx.A0L(r3, r5)
            X.5hW r14 = X.C291565hW.A00
            int r15 = X.C287425a7.A00(r1)
            androidx.compose.ui.Modifier r10 = X.C287435a8.A01(r1, r8)
            X.5RM r13 = X.C286565Wx.A04(r3)
            X.0sa r8 = X.C287485aD.A00
            r1.ExX()
            boolean r5 = r3.A0K
            if (r5 == 0) goto L_0x01bb
            r1.AMT(r8)
        L_0x017c:
            X.0sL r5 = X.C287485aD.A03
            X.C287595aO.A00(r1, r14, r5)
            X.0sL r5 = X.C287485aD.A05
            X.C287595aO.A00(r1, r13, r5)
            X.0sL r5 = X.C287485aD.A04
            X.C287595aO.A00(r1, r10, r5)
            X.0sL r10 = X.C287485aD.A02
            boolean r5 = r3.A0K
            if (r5 != 0) goto L_0x019f
            java.lang.Object r8 = r1.ECw()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            boolean r5 = X.0qQ.A0K(r8, r5)
            if (r5 != 0) goto L_0x01a9
        L_0x019f:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            r1.FLL(r5)
            r1.ABr(r5, r10)
        L_0x01a9:
            r5 = 1
            X.C286565Wx.A0L(r3, r5)
            boolean r3 = X.0fL.A02()
            if (r3 == 0) goto L_0x00a1
            r3 = 1172043162(0x45dbf59a, float:7038.7)
            X.0fL.A00(r3)
            goto L_0x00a1
        L_0x01bb:
            r1.FMk()
            goto L_0x017c
        L_0x01bf:
            r8 = -1587866335(0xffffffffa15b1521, float:-7.422805E-19)
            r1.ExS(r8)
            r23 = 1065353216(0x3f800000, float:1.0)
            r26 = 0
            long r27 = X.C285605Ry.A01
            X.5S2 r22 = X.AnonymousClass5S0.A00
            long r29 = X.AnonymousClass5RV.A00
            androidx.compose.ui.graphics.GraphicsLayerElement r8 = new androidx.compose.ui.graphics.GraphicsLayerElement
            r21 = r8
            r24 = r23
            r25 = r23
            r31 = r29
            r33 = r5
            r21.<init>(r22, r23, r24, r25, r26, r27, r29, r31, r33)
            androidx.compose.ui.Modifier r13 = r4.Ezh(r8)
            X.4bM r10 = X.AnonymousClass5YA.A03
            X.5RM r8 = X.C286565Wx.A04(r3)
            java.lang.Object r10 = X.C286615Xc.A01(r10, r8)
            X.5Uu r10 = (X.C286305Uu) r10
            androidx.compose.foundation.text.modifiers.TextStringSimpleElement r8 = new androidx.compose.foundation.text.modifiers.TextStringSimpleElement
            r16 = r8
            r17 = r11
            r18 = r10
            r19 = r34
            r21 = r7
            r22 = r6
            r23 = r12
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            androidx.compose.ui.Modifier r8 = r13.Ezh(r8)
            goto L_0x015f
        L_0x0207:
            r3 = r0 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x003b
            r3 = r20
            boolean r5 = r1.AGs(r3)
            r3 = 8192(0x2000, float:1.14794E-41)
            if (r5 == 0) goto L_0x0217
            r3 = 16384(0x4000, float:2.2959E-41)
        L_0x0217:
            r8 = r8 | r3
            goto L_0x003b
        L_0x021a:
            r3 = r0 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0035
            boolean r5 = r1.AGw(r9)
            r3 = 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x0228
            r3 = 2048(0x800, float:2.87E-42)
        L_0x0228:
            r8 = r8 | r3
            goto L_0x0035
        L_0x022b:
            r3 = r0 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x002f
            boolean r5 = r1.AGu(r11)
            r3 = 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x0239
            r3 = 256(0x100, float:3.59E-43)
        L_0x0239:
            r8 = r8 | r3
            goto L_0x002f
        L_0x023c:
            r3 = r32 & 48
            if (r3 != 0) goto L_0x0029
            boolean r5 = r1.AGu(r4)
            r3 = 16
            if (r5 == 0) goto L_0x024a
            r3 = 32
        L_0x024a:
            r8 = r8 | r3
            goto L_0x0029
        L_0x024d:
            r3 = r32 & 6
            if (r3 != 0) goto L_0x025f
            r3 = r34
            boolean r3 = r1.AGu(r3)
            r8 = 2
            if (r3 == 0) goto L_0x025b
            r8 = 4
        L_0x025b:
            r8 = r8 | r32
            goto L_0x0023
        L_0x025f:
            r8 = r0
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C291525hS.A03(X.5Wy, androidx.compose.ui.Modifier, X.5Z4, java.lang.String, X.0sP, int, int, int, int, int, boolean):void");
    }

    public static final ArrayList A00(List list, C62320sa r10) {
        C45327CuV cuV;
        if (!((Boolean) r10.invoke()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C268074ci r8 = (C268074ci) list.get(i);
            Object BaX = r8.BaX();
            0qQ.A0C(BaX, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
            IFY ify = (IFY) ((IGZ) BaX).A00;
            I0h i0h = ify.A02;
            int i2 = ify.A00;
            int i3 = ify.A01;
            C3022462f r0 = (C3022462f) i0h.A01.getValue();
            if (r0 == null) {
                cuV = new C45327CuV(C58249Ios.A00, 0, 0);
            } else {
                C56558I1m A00 = C54760HRs.A00(r0.A07(i2, i3).AhZ());
                cuV = new C45327CuV(new C58682Ivr(A00, 36), A00.A02 - A00.A01, A00.A00 - A00.A03);
            }
            int i4 = cuV.A01;
            int i5 = cuV.A00;
            arrayList.add(new 0eP(r8.Cnz(C288985co.A04(i4, i4, i5, i5)), cuV.A02));
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:187:0x0411  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0424  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0437  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r43, androidx.compose.ui.Modifier r44, X.C286025Tq r45, X.AnonymousClass5Z4 r46, X.C286305Uu r47, java.util.Map r48, X.0sP r49, X.0sP r50, int r51, int r52, int r53, int r54, int r55, int r56, boolean r57, boolean r58) {
        /*
            r20 = r48
            r12 = 0
            r0 = 645129368(0x2673e498, float:8.4617363E-16)
            r8 = r43
            r8.ExV(r0)
            r6 = r56
            r0 = r56 & 1
            r7 = r54
            if (r0 == 0) goto L_0x04a8
            r5 = r54 | 6
        L_0x0015:
            r0 = r56 & 2
            r10 = r45
            if (r0 == 0) goto L_0x0497
            r5 = r5 | 48
        L_0x001d:
            r0 = r56 & 4
            r41 = r49
            if (r0 == 0) goto L_0x0484
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0025:
            r0 = r56 & 8
            r4 = 2048(0x800, float:2.87E-42)
            r21 = r57
            if (r0 == 0) goto L_0x0471
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x002f:
            r3 = r56 & 16
            if (r3 == 0) goto L_0x045e
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x0035:
            r0 = r56 & 32
            r1 = 196608(0x30000, float:2.75506E-40)
            r43 = r46
            if (r0 != 0) goto L_0x004d
            r0 = r54 & r1
            if (r0 != 0) goto L_0x004e
            r0 = r43
            boolean r0 = r8.AGu(r0)
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r0 == 0) goto L_0x004d
            r1 = 131072(0x20000, float:1.83671E-40)
        L_0x004d:
            r5 = r5 | r1
        L_0x004e:
            r1 = r56 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            r39 = r51
            if (r1 != 0) goto L_0x0066
            r0 = r54 & r0
            if (r0 != 0) goto L_0x0067
            r0 = r39
            boolean r1 = r8.AGs(r0)
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r1 == 0) goto L_0x0066
            r0 = 1048576(0x100000, float:1.469368E-39)
        L_0x0066:
            r5 = r5 | r0
        L_0x0067:
            r1 = r6 & 128(0x80, float:1.794E-43)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r36 = r58
            if (r1 != 0) goto L_0x007f
            r0 = r0 & r54
            if (r0 != 0) goto L_0x0080
            r0 = r36
            boolean r1 = r8.AGv(r0)
            r0 = 4194304(0x400000, float:5.877472E-39)
            if (r1 == 0) goto L_0x007f
            r0 = 8388608(0x800000, float:1.17549435E-38)
        L_0x007f:
            r5 = r5 | r0
        L_0x0080:
            r1 = r6 & 256(0x100, float:3.59E-43)
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r38 = r52
            if (r1 != 0) goto L_0x0098
            r0 = r0 & r54
            if (r0 != 0) goto L_0x0099
            r0 = r38
            boolean r1 = r8.AGs(r0)
            r0 = 33554432(0x2000000, float:9.403955E-38)
            if (r1 == 0) goto L_0x0098
            r0 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x0098:
            r5 = r5 | r0
        L_0x0099:
            r1 = r6 & 512(0x200, float:7.175E-43)
            r0 = 805306368(0x30000000, float:4.656613E-10)
            r37 = r53
            if (r1 != 0) goto L_0x00b1
            r0 = r0 & r54
            if (r0 != 0) goto L_0x00b2
            r0 = r37
            boolean r1 = r8.AGs(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            if (r1 == 0) goto L_0x00b1
            r0 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x00b1:
            r5 = r5 | r0
        L_0x00b2:
            r0 = r6 & 1024(0x400, float:1.435E-42)
            r22 = r55
            r42 = r47
            if (r0 == 0) goto L_0x0448
            r2 = r55 | 6
        L_0x00bc:
            r0 = r6 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0437
            r2 = r2 | 48
        L_0x00c2:
            r0 = r6 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0424
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x00c8:
            r0 = r6 & 8192(0x2000, float:1.14794E-41)
            r40 = r50
            if (r0 == 0) goto L_0x0411
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x00d0:
            r0 = 306783379(0x12492493, float:6.34695E-28)
            r1 = r5 & r0
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r0) goto L_0x0115
            r1 = r2 & 1171(0x493, float:1.641E-42)
            r0 = 1170(0x492, float:1.64E-42)
            if (r1 != r0) goto L_0x0115
            boolean r0 = r8.Bwn()
            if (r0 == 0) goto L_0x0115
            r8.Evl()
        L_0x00e9:
            X.5Xd r1 = r8.ASQ()
            if (r1 == 0) goto L_0x0114
            X.JCk r0 = new X.JCk
            r8 = r10
            r9 = r43
            r10 = r42
            r11 = r20
            r12 = r41
            r13 = r40
            r14 = r39
            r15 = r38
            r16 = r37
            r17 = r7
            r18 = r22
            r19 = r6
            r20 = r21
            r21 = r36
            r6 = r0
            r7 = r44
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1.A06 = r0
        L_0x0114:
            return
        L_0x0115:
            if (r3 == 0) goto L_0x011b
            X.0sm r20 = X.0Yt.A0E()
        L_0x011b:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0129
            r1 = 357294573(0x154be1ed, float:4.1173748E-26)
            java.lang.String r0 = "androidx.compose.foundation.text.LayoutWithLinksAndInlineContent (BasicText.kt:536)"
            X.0fL.A01(r1, r0)
        L_0x0129:
            boolean r0 = X.AnonymousClass6GB.A00(r10)
            if (r0 == 0) goto L_0x0220
            r0 = -619323167(0xffffffffdb15e0e1, float:-4.2187029E16)
            r8.ExS(r0)
            r2 = r5 & 112(0x70, float:1.57E-43)
            r1 = 32
            r0 = 0
            if (r2 != r1) goto L_0x013d
            r0 = 1
        L_0x013d:
            java.lang.Object r4 = r8.ECw()
            if (r0 != 0) goto L_0x0147
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r4 != r0) goto L_0x0152
        L_0x0147:
            X.I0h r4 = new X.I0h
            r4.<init>(r10)
            r0 = r8
            X.5Wx r0 = (X.C286565Wx) r0
            r0.A0Q(r4)
        L_0x0152:
            X.I0h r4 = (X.I0h) r4
            r3 = r8
            X.5Wx r3 = (X.C286565Wx) r3
            r2 = 0
            X.C286565Wx.A0L(r3, r2)
        L_0x015b:
            boolean r0 = X.AnonymousClass6GB.A00(r10)
            if (r0 == 0) goto L_0x01f7
            r0 = -619074547(0xffffffffdb19ac0d, float:-4.3254843E16)
            r8.ExS(r0)
            r9 = r5 & 112(0x70, float:1.57E-43)
            r0 = 32
            r1 = 0
            if (r9 != r0) goto L_0x016f
            r1 = 1
        L_0x016f:
            boolean r0 = r8.AGu(r4)
            r1 = r1 | r0
            java.lang.Object r0 = r8.ECw()
            if (r1 != 0) goto L_0x017e
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x0188
        L_0x017e:
            r1 = 10
            X.IwR r0 = new X.IwR
            r0.<init>((int) r1, (java.lang.Object) r10, (java.lang.Object) r4)
            r8.FLL(r0)
        L_0x0188:
            X.0sa r0 = (X.C62320sa) r0
            X.C286565Wx.A0L(r3, r2)
        L_0x018d:
            if (r57 == 0) goto L_0x0233
            r11 = 0
            if (r20 == 0) goto L_0x0230
            boolean r1 = r20.isEmpty()
            if (r1 != 0) goto L_0x0230
            java.lang.String r1 = r10.A00
            int r9 = r1.length()
            java.lang.String r1 = "androidx.compose.foundation.text.inlineContent"
            java.util.List r19 = r10.A06(r1, r2, r9)
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            int r16 = r19.size()
        L_0x01b2:
            r1 = r16
            if (r11 >= r1) goto L_0x0239
            r1 = r19
            java.lang.Object r9 = r1.get(r11)
            X.62b r9 = (X.C3022062b) r9
            java.lang.Object r13 = r9.A02
            r1 = r20
            java.lang.Object r13 = r1.get(r13)
            X.GQb r13 = (X.C52376GQb) r13
            if (r13 == 0) goto L_0x01f4
            X.GQa r1 = r13.A00
            r14 = r1
            int r1 = r9.A01
            r24 = r1
            int r1 = r9.A00
            r23 = r1
            X.62b r1 = new X.62b
            r15 = r14
            r14 = r24
            r9 = r23
            r1.<init>(r15, r14, r9)
            r9 = r18
            r9.add(r1)
            X.0sK r14 = r13.A01
            X.62b r13 = new X.62b
            r9 = r24
            r1 = r23
            r13.<init>(r14, r9, r1)
            r1 = r17
            r1.add(r13)
        L_0x01f4:
            int r11 = r11 + 1
            goto L_0x01b2
        L_0x01f7:
            r0 = -618966357(0xffffffffdb1b52ab, float:-4.3719516E16)
            r8.ExS(r0)
            r9 = r5 & 112(0x70, float:1.57E-43)
            r0 = 32
            r1 = 0
            if (r9 != r0) goto L_0x0205
            r1 = 1
        L_0x0205:
            java.lang.Object r0 = r8.ECw()
            if (r1 != 0) goto L_0x020f
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x0219
        L_0x020f:
            r1 = 14
            X.9L8 r0 = new X.9L8
            r0.<init>(r10, r1)
            r8.FLL(r0)
        L_0x0219:
            X.0sa r0 = (X.C62320sa) r0
            X.C286565Wx.A0L(r3, r2)
            goto L_0x018d
        L_0x0220:
            r0 = -619265198(0xffffffffdb16c352, float:-4.2436003E16)
            r8.ExS(r0)
            r3 = r8
            X.5Wx r3 = (X.C286565Wx) r3
            r2 = 0
            X.C286565Wx.A0L(r3, r2)
            r4 = 0
            goto L_0x015b
        L_0x0230:
            X.0eP r11 = X.GSC.A00
            goto L_0x0242
        L_0x0233:
            X.0eP r11 = new X.0eP
            r11.<init>(r12, r12)
            goto L_0x0242
        L_0x0239:
            X.0eP r11 = new X.0eP
            r9 = r18
            r1 = r17
            r11.<init>(r9, r1)
        L_0x0242:
            java.lang.Object r1 = r11.A00
            r17 = r1
            r1 = r17
            java.util.List r1 = (java.util.List) r1
            r17 = r1
            java.lang.Object r11 = r11.A01
            java.util.List r11 = (java.util.List) r11
            if (r57 == 0) goto L_0x03fb
            r1 = -618671702(0xffffffffdb1fd1aa, float:-4.4985049E16)
            r8.ExS(r1)
            java.lang.Object r1 = r8.ECw()
            java.lang.Object r13 = X.AnonymousClass5XT.A00
            if (r1 != r13) goto L_0x0271
            X.5Or r9 = X.C284885Or.A00
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>"
            X.0qQ.A0C(r9, r1)
            X.0eM r1 = X.C284905Ot.A01
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = new androidx.compose.runtime.ParcelableSnapshotMutableState
            r1.<init>(r9, r12)
            r3.A0Q(r1)
        L_0x0271:
            X.C286565Wx.A0L(r3, r2)
            r9 = -618506565(0xffffffffdb2256bb, float:-4.5694307E16)
            r8.ExS(r9)
            boolean r12 = r8.AGu(r1)
            java.lang.Object r9 = r8.ECw()
            if (r12 != 0) goto L_0x0286
            if (r9 != r13) goto L_0x0290
        L_0x0286:
            r12 = 25
            X.9L6 r9 = new X.9L6
            r9.<init>(r1, r12)
            r8.FLL(r9)
        L_0x0290:
            X.0sP r9 = (X.0sP) r9
            X.C286565Wx.A0L(r3, r2)
        L_0x0295:
            r25 = 1065353216(0x3f800000, float:1.0)
            r28 = 0
            long r29 = X.C285605Ry.A01
            X.5S2 r24 = X.AnonymousClass5S0.A00
            long r31 = X.AnonymousClass5RV.A00
            androidx.compose.ui.graphics.GraphicsLayerElement r12 = new androidx.compose.ui.graphics.GraphicsLayerElement
            r23 = r12
            r26 = r25
            r27 = r25
            r33 = r31
            r35 = r2
            r23.<init>(r24, r25, r26, r27, r28, r29, r31, r33, r35)
            r13 = r44
            androidx.compose.ui.Modifier r16 = r13.Ezh(r12)
            java.lang.Object r14 = r0.invoke()
            X.5Tq r14 = (X.C286025Tq) r14
            boolean r15 = r8.AGw(r4)
            r13 = r5 & 896(0x380, float:1.256E-42)
            r12 = 256(0x100, float:3.59E-43)
            r0 = 0
            if (r13 != r12) goto L_0x02c6
            r0 = 1
        L_0x02c6:
            r15 = r15 | r0
            java.lang.Object r13 = r8.ECw()
            if (r15 != 0) goto L_0x02d1
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r13 != r0) goto L_0x02dc
        L_0x02d1:
            r12 = 4
            X.9Ly r13 = new X.9Ly
            r0 = r41
            r13.<init>((int) r12, (java.lang.Object) r4, (java.lang.Object) r0)
            r8.FLL(r13)
        L_0x02dc:
            X.0sP r13 = (X.0sP) r13
            androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement r12 = new androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement
            r23 = r12
            r24 = r14
            r25 = r43
            r26 = r42
            r27 = r17
            r28 = r13
            r29 = r9
            r30 = r40
            r31 = r39
            r32 = r38
            r33 = r37
            r34 = r36
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            X.5Qk r9 = androidx.compose.ui.Modifier.A00
            r0 = r16
            androidx.compose.ui.Modifier r0 = r0.Ezh(r9)
            androidx.compose.ui.Modifier r13 = r0.Ezh(r12)
            if (r57 != 0) goto L_0x03ba
            r0 = -617362851(0xffffffffdb33ca5d, float:-5.0606522E16)
            r8.ExS(r0)
            boolean r1 = r8.AGw(r4)
            java.lang.Object r0 = r8.ECw()
            if (r1 != 0) goto L_0x031d
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x0327
        L_0x031d:
            r1 = 22
            X.Ivr r0 = new X.Ivr
            r0.<init>(r4, r1)
            r8.FLL(r0)
        L_0x0327:
            X.0sa r0 = (X.C62320sa) r0
            X.IGI r1 = new X.IGI
            r1.<init>(r0)
        L_0x032e:
            X.C286565Wx.A0L(r3, r2)
            int r14 = X.C287425a7.A00(r8)
            X.5RM r12 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r9 = X.C287435a8.A01(r8, r13)
            X.0sa r13 = X.C287485aD.A00
            r8.ExX()
            boolean r0 = r3.A0K
            if (r0 == 0) goto L_0x03b6
            r8.AMT(r13)
        L_0x0349:
            X.0sL r0 = X.C287485aD.A03
            X.C287595aO.A00(r8, r1, r0)
            X.0sL r0 = X.C287485aD.A05
            X.C287595aO.A00(r8, r12, r0)
            X.0sL r12 = X.C287485aD.A02
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x0367
            java.lang.Object r1 = r8.ECw()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0371
        L_0x0367:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            r8.FLL(r0)
            r8.ABr(r0, r12)
        L_0x0371:
            X.0sL r0 = X.C287485aD.A04
            X.C287595aO.A00(r8, r9, r0)
            if (r4 != 0) goto L_0x03ac
            r0 = -515480539(0xffffffffe1466425, float:-2.2872947E20)
            r8.ExS(r0)
        L_0x037e:
            X.C286565Wx.A0L(r3, r2)
            if (r11 != 0) goto L_0x039e
            r0 = -515428893(0xffffffffe1472de3, float:-2.2963803E20)
            r8.ExS(r0)
        L_0x0389:
            X.C286565Wx.A0L(r3, r2)
            r0 = 1
            X.C286565Wx.A0L(r3, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00e9
            r0 = 179735936(0xab68d80, float:1.7579189E-32)
            X.0fL.A00(r0)
            goto L_0x00e9
        L_0x039e:
            r0 = -515428892(0xffffffffe1472de4, float:-2.2963805E20)
            r8.ExS(r0)
            int r0 = r5 >> 3
            r0 = r0 & 14
            X.GSC.A00(r8, r10, r11, r0)
            goto L_0x0389
        L_0x03ac:
            r0 = 537560924(0x200a875c, float:1.1733841E-19)
            r8.ExS(r0)
            r4.A01(r8, r2)
            goto L_0x037e
        L_0x03b6:
            r8.FMk()
            goto L_0x0349
        L_0x03ba:
            r0 = -617202116(0xffffffffdb363e3c, float:-5.1296873E16)
            r8.ExS(r0)
            boolean r0 = r8.AGw(r4)
            java.lang.Object r12 = r8.ECw()
            if (r0 != 0) goto L_0x03ce
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r12 != r0) goto L_0x03d8
        L_0x03ce:
            r0 = 12
            X.9L8 r12 = new X.9L8
            r12.<init>(r4, r0)
            r8.FLL(r12)
        L_0x03d8:
            X.0sa r12 = (X.C62320sa) r12
            boolean r9 = r8.AGu(r1)
            java.lang.Object r0 = r8.ECw()
            if (r9 != 0) goto L_0x03e8
            java.lang.Object r9 = X.AnonymousClass5XT.A00
            if (r0 != r9) goto L_0x03f2
        L_0x03e8:
            r9 = 13
            X.9L8 r0 = new X.9L8
            r0.<init>(r1, r9)
            r8.FLL(r0)
        L_0x03f2:
            X.0sa r0 = (X.C62320sa) r0
            X.GSB r1 = new X.GSB
            r1.<init>(r12, r0)
            goto L_0x032e
        L_0x03fb:
            r9 = 0
            r1 = -618591630(0xffffffffdb210a72, float:-4.5328956E16)
            r8.ExS(r1)
            X.C286565Wx.A0L(r3, r2)
            r1 = r12
            r12 = -618442830(0xffffffffdb234fb2, float:-4.5968047E16)
            r8.ExS(r12)
            X.C286565Wx.A0L(r3, r2)
            goto L_0x0295
        L_0x0411:
            r0 = r22
            r0 = r0 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x00d0
            r0 = r40
            boolean r0 = r8.AGw(r0)
            if (r0 != 0) goto L_0x0421
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0421:
            r2 = r2 | r4
            goto L_0x00d0
        L_0x0424:
            r0 = r22
            r0 = r0 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x00c8
            boolean r1 = r8.AGw(r12)
            r0 = 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0434
            r0 = 256(0x100, float:3.59E-43)
        L_0x0434:
            r2 = r2 | r0
            goto L_0x00c8
        L_0x0437:
            r0 = r55 & 48
            if (r0 != 0) goto L_0x00c2
            boolean r1 = r8.AGw(r12)
            r0 = 16
            if (r1 == 0) goto L_0x0445
            r0 = 32
        L_0x0445:
            r2 = r2 | r0
            goto L_0x00c2
        L_0x0448:
            r0 = r55 & 6
            if (r0 != 0) goto L_0x045a
            r0 = r42
            boolean r1 = r8.AGw(r0)
            r0 = 2
            if (r1 == 0) goto L_0x0456
            r0 = 4
        L_0x0456:
            r2 = r55 | r0
            goto L_0x00bc
        L_0x045a:
            r2 = r22
            goto L_0x00bc
        L_0x045e:
            r0 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0035
            r0 = r20
            boolean r1 = r8.AGw(r0)
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x046e
            r0 = 16384(0x4000, float:2.2959E-41)
        L_0x046e:
            r5 = r5 | r0
            goto L_0x0035
        L_0x0471:
            r0 = r7 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x002f
            r0 = r21
            boolean r1 = r8.AGv(r0)
            r0 = 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0481
            r0 = 2048(0x800, float:2.87E-42)
        L_0x0481:
            r5 = r5 | r0
            goto L_0x002f
        L_0x0484:
            r0 = r7 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0025
            r0 = r41
            boolean r1 = r8.AGw(r0)
            r0 = 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0494
            r0 = 256(0x100, float:3.59E-43)
        L_0x0494:
            r5 = r5 | r0
            goto L_0x0025
        L_0x0497:
            r0 = r54 & 48
            if (r0 != 0) goto L_0x001d
            boolean r1 = r8.AGu(r10)
            r0 = 16
            if (r1 == 0) goto L_0x04a5
            r0 = 32
        L_0x04a5:
            r5 = r5 | r0
            goto L_0x001d
        L_0x04a8:
            r0 = r54 & 6
            if (r0 != 0) goto L_0x04ba
            r0 = r44
            boolean r0 = r8.AGu(r0)
            r5 = 2
            if (r0 == 0) goto L_0x04b6
            r5 = 4
        L_0x04b6:
            r5 = r5 | r54
            goto L_0x0015
        L_0x04ba:
            r5 = r7
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C291525hS.A01(X.5Wy, androidx.compose.ui.Modifier, X.5Tq, X.5Z4, X.5Uu, java.util.Map, X.0sP, X.0sP, int, int, int, int, int, int, boolean, boolean):void");
    }
}

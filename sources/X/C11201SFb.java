package X;

import java.util.List;

/* renamed from: X.SFb  reason: case insensitive filesystem */
public final class C11201SFb {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final String A05;
    public final List A06;

    /* JADX WARNING: type inference failed for: r8v2, types: [X.5h3, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02e7 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02f0 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0333 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C11201SFb A00(X.AnonymousClass4XV r37) {
        /*
            r0 = 21
            r7 = r37
            r7.A0H(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r0 = r7.A02()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r35 = r0 & 3
            int r34 = r7.A02()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r5 = r7.A01     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r4 = 0
            r33 = 0
        L_0x0016:
            r1 = 1
            r0 = r34
            if (r4 >= r0) goto L_0x0036
            r7.A0H(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r3 = r7.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r2 = 0
        L_0x0023:
            if (r2 >= r3) goto L_0x0033
            int r1 = r7.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r0 = r1 + 4
            int r33 = r33 + r0
            r7.A0H(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r2 = r2 + 1
            goto L_0x0023
        L_0x0033:
            int r4 = r4 + 1
            goto L_0x0016
        L_0x0036:
            r7.A0G(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r0 = r33
            byte[] r0 = new byte[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r37 = r0
            r10 = 0
            r32 = 0
            r6 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r14 = -1
            r4 = -1
            r16 = -1
        L_0x0049:
            r1 = r32
            r0 = r34
            if (r1 >= r0) goto L_0x03a3
            int r0 = r7.A02()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r3 = r0 & 63
            int r31 = r7.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r30 = 0
        L_0x005b:
            r1 = r30
            r0 = r31
            if (r1 >= r0) goto L_0x039f
            int r29 = r7.A05()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            byte[] r8 = X.AnonymousClass4XW.A01     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r5 = 4
            r1 = 0
            r0 = r37
            java.lang.System.arraycopy(r8, r1, r0, r6, r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r6 = r6 + 4
            byte[] r9 = r7.A02     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r8 = r7.A01     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r1 = r0
            r0 = r29
            java.lang.System.arraycopy(r9, r8, r1, r6, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r0 = 33
            if (r3 != r0) goto L_0x0394
            if (r30 != 0) goto L_0x0394
            int r2 = r6 + r29
            int r1 = r6 + 2
            X.5h3 r8 = new X.5h3     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r8.<init>()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r0 = r37
            r8.A03 = r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r8.A02 = r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r8.A01 = r2     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r2 = 0
            r8.A00 = r2     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            X.C291365h3.A01(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r8.A05(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r28 = 3
            r0 = r28
            int r3 = r8.A03(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r8.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r4 = 2
            int r27 = r8.A03(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            boolean r26 = r8.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r0 = 5
            int r25 = r8.A03(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r24 = 0
            r1 = 0
        L_0x00b6:
            r0 = 32
            r10 = 1
            if (r1 >= r0) goto L_0x00c7
            boolean r0 = r8.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            if (r0 == 0) goto L_0x00c4
            int r10 = r10 << r1
            r24 = r24 | r10
        L_0x00c4:
            int r1 = r1 + 1
            goto L_0x00b6
        L_0x00c7:
            r5 = 6
            int[] r0 = new int[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r23 = r0
            r1 = 0
        L_0x00cd:
            r9 = 8
            if (r1 >= r5) goto L_0x00da
            int r0 = r8.A03(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r23[r1] = r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r1 = r1 + 1
            goto L_0x00cd
        L_0x00da:
            int r22 = r8.A03(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r5 = 0
            r1 = 0
        L_0x00e0:
            if (r5 >= r3) goto L_0x00f5
            boolean r0 = r8.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            if (r0 == 0) goto L_0x00ea
            int r1 = r1 + 89
        L_0x00ea:
            boolean r0 = r8.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            if (r0 == 0) goto L_0x00f2
            int r1 = r1 + 8
        L_0x00f2:
            int r5 = r5 + 1
            goto L_0x00e0
        L_0x00f5:
            r8.A05(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            if (r3 <= 0) goto L_0x0101
            int r0 = 8 - r3
            int r0 = r0 * 2
            r8.A05(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
        L_0x0101:
            X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r1 = X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r0 = r28
            if (r1 != r0) goto L_0x010f
            r8.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
        L_0x010f:
            X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            boolean r0 = r8.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            if (r0 == 0) goto L_0x0127
            X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
        L_0x0127:
            X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r21 = X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            boolean r1 = r8.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r0 = r3
            if (r1 == 0) goto L_0x0139
            r0 = 0
        L_0x0139:
            X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            if (r0 > r3) goto L_0x0147
            X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r0 = r0 + 1
            goto L_0x0139
        L_0x0147:
            X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            boolean r0 = r8.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            if (r0 == 0) goto L_0x0195
            boolean r0 = r8.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            if (r0 == 0) goto L_0x0195
            r3 = 0
        L_0x0160:
            r5 = 0
        L_0x0161:
            boolean r0 = r8.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r11 = 1
            if (r0 != 0) goto L_0x016c
            X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            goto L_0x0186
        L_0x016c:
            r1 = 64
            int r0 = r3 << 1
            int r0 = r0 + 4
            int r0 = r10 << r0
            int r1 = java.lang.Math.min(r1, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            if (r3 <= r10) goto L_0x017d
            X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
        L_0x017d:
            r0 = 0
        L_0x017e:
            if (r0 >= r1) goto L_0x0186
            X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r0 = r0 + 1
            goto L_0x017e
        L_0x0186:
            r0 = r28
            if (r3 != r0) goto L_0x018b
            r11 = 3
        L_0x018b:
            int r5 = r5 + r11
            r0 = 6
            if (r5 < r0) goto L_0x0161
            int r3 = r3 + 1
            r0 = 4
            if (r3 >= r0) goto L_0x0195
            goto L_0x0160
        L_0x0195:
            r8.A05(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            boolean r0 = r8.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            if (r0 == 0) goto L_0x01aa
            r8.A05(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r8.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
        L_0x01aa:
            int r20 = X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int[] r1 = new int[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int[] r0 = new int[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r16 = r0
            r3 = -1
            r2 = -1
            r19 = 0
        L_0x01b8:
            r5 = r19
            r0 = r20
            if (r5 >= r0) goto L_0x0295
            if (r19 == 0) goto L_0x0261
            boolean r0 = r8.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            if (r0 == 0) goto L_0x0261
            int r18 = r3 + r2
            boolean r11 = r8.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r0 = X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r5 = r0 + 1
            int r0 = r11 * 2
            int r13 = 1 - r0
            int r13 = r13 * r5
            int r11 = r18 + 1
            boolean[] r12 = new boolean[r11]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r5 = 0
        L_0x01dc:
            r0 = r18
            if (r5 > r0) goto L_0x01f2
            boolean r0 = r8.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            if (r0 != 0) goto L_0x01ed
            boolean r0 = r8.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r12[r5] = r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            goto L_0x01ef
        L_0x01ed:
            r12[r5] = r10     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
        L_0x01ef:
            int r5 = r5 + 1
            goto L_0x01dc
        L_0x01f2:
            int[] r5 = new int[r11]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int[] r0 = new int[r11]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r36 = r0
            int r15 = r2 + -1
            r11 = 0
        L_0x01fb:
            if (r15 < 0) goto L_0x020b
            r14 = r16[r15]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r14 = r14 + r13
            if (r14 >= 0) goto L_0x0208
            int r0 = r3 + r15
            int r11 = X.Pxg.A0B(r5, r12, r0, r11, r14)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
        L_0x0208:
            int r15 = r15 + -1
            goto L_0x01fb
        L_0x020b:
            if (r13 >= 0) goto L_0x0213
            r0 = r18
            int r11 = X.Pxg.A0B(r5, r12, r0, r11, r13)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
        L_0x0213:
            r14 = 0
        L_0x0214:
            if (r14 >= r3) goto L_0x0222
            r0 = r1[r14]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r0 = r0 + r13
            if (r0 >= 0) goto L_0x021f
            int r11 = X.Pxg.A0B(r5, r12, r14, r11, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
        L_0x021f:
            int r14 = r14 + 1
            goto L_0x0214
        L_0x0222:
            int[] r17 = java.util.Arrays.copyOf(r5, r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r15 = r3 + -1
            r5 = 0
        L_0x0229:
            if (r15 < 0) goto L_0x0239
            r0 = r1[r15]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r0 = r0 + r13
            if (r0 <= 0) goto L_0x0236
            r14 = r36
            int r5 = X.Pxg.A0B(r14, r12, r15, r5, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
        L_0x0236:
            int r15 = r15 + -1
            goto L_0x0229
        L_0x0239:
            if (r13 <= 0) goto L_0x0243
            r1 = r36
            r0 = r18
            int r5 = X.Pxg.A0B(r1, r12, r0, r5, r13)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
        L_0x0243:
            r15 = 0
        L_0x0244:
            if (r15 >= r2) goto L_0x0256
            r14 = r16[r15]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r14 = r14 + r13
            if (r14 <= 0) goto L_0x0253
            int r0 = r3 + r15
            r1 = r36
            int r5 = X.Pxg.A0B(r1, r12, r0, r5, r14)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
        L_0x0253:
            int r15 = r15 + 1
            goto L_0x0244
        L_0x0256:
            r0 = r36
            int[] r16 = java.util.Arrays.copyOf(r0, r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r1 = r17
            r3 = r11
            r2 = r5
            goto L_0x0291
        L_0x0261:
            int r3 = X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r2 = X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int[] r1 = new int[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r5 = 0
        L_0x026c:
            if (r5 >= r3) goto L_0x027c
            int r0 = X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r0 = r0 + 1
            r1[r5] = r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r8.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r5 = r5 + 1
            goto L_0x026c
        L_0x027c:
            int[] r0 = new int[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r16 = r0
            r5 = 0
        L_0x0281:
            if (r5 >= r2) goto L_0x0291
            int r0 = X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r0 = r0 + 1
            r16[r5] = r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r8.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r5 = r5 + 1
            goto L_0x0281
        L_0x0291:
            int r19 = r19 + 1
            goto L_0x01b8
        L_0x0295:
            boolean r0 = r8.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            if (r0 == 0) goto L_0x02ac
            r1 = 0
        L_0x029c:
            int r0 = X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            if (r1 >= r0) goto L_0x02ac
            int r0 = r21 + 4
            int r0 = r0 + 1
            r8.A05(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r1 = r1 + 1
            goto L_0x029c
        L_0x02ac:
            r8.A05(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            boolean r0 = r8.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r14 = -1
            if (r0 == 0) goto L_0x0323
            boolean r0 = r8.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            if (r0 == 0) goto L_0x02d6
            int r2 = r8.A03(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r0 = 255(0xff, float:3.57E-43)
            if (r2 != r0) goto L_0x02d9
            r0 = 16
            int r1 = r8.A03(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r0 = r8.A03(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            if (r1 == 0) goto L_0x02d6
            if (r0 == 0) goto L_0x02d6
            float r2 = (float) r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            float r0 = (float) r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            float r2 = r2 / r0
            goto L_0x02e1
        L_0x02d6:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x02e1
        L_0x02d9:
            float[] r1 = X.AnonymousClass4XW.A02     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r0 = 17
            if (r2 >= r0) goto L_0x0311
            r2 = r1[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
        L_0x02e1:
            boolean r0 = r8.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            if (r0 == 0) goto L_0x02ea
            r8.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
        L_0x02ea:
            boolean r0 = r8.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            if (r0 == 0) goto L_0x031f
            r0 = r28
            r8.A05(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            boolean r3 = r8.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            boolean r0 = r8.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            if (r0 == 0) goto L_0x031f
            int r1 = r8.A03(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r0 = r8.A03(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r8.A05(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r14 = com.google.android.exoplayer2.video.ColorInfo.A00(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            if (r3 == 0) goto L_0x0329
            goto L_0x031d
        L_0x0311:
            java.lang.String r0 = "Unexpected aspect_ratio_idc value: "
            java.lang.String r1 = X.002.A0O(r0, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            java.lang.String r0 = "NalUnitUtil"
            X.2AG.A04(r0, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            goto L_0x02d6
        L_0x031d:
            r4 = 1
            goto L_0x0329
        L_0x031f:
            r16 = -1
            r4 = -1
            goto L_0x032d
        L_0x0323:
            r2 = 1065353216(0x3f800000, float:1.0)
            r4 = -1
            r16 = -1
            goto L_0x033f
        L_0x0329:
            int r16 = com.google.android.exoplayer2.video.ColorInfo.A01(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
        L_0x032d:
            boolean r0 = r8.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            if (r0 == 0) goto L_0x0339
            X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            X.C291365h3.A00(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
        L_0x0339:
            r8.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r8.A04()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
        L_0x033f:
            r3 = 33
            java.lang.String[] r0 = X.C291355h2.A01     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r9 = r0[r27]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r25)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r24)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r0 = 76
            if (r26 == 0) goto L_0x0353
            r0 = 72
        L_0x0353:
            java.lang.Character r1 = java.lang.Character.valueOf(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            java.lang.Object[] r5 = new java.lang.Object[]{r9, r8, r5, r1, r0}     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            java.lang.String r1 = "hvc1.%s%d.%X.%c%d"
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            java.lang.String r0 = java.lang.String.format(r0, r1, r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            java.lang.StringBuilder r9 = X.Pxe.A16(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r8 = 6
        L_0x036c:
            int r0 = r8 + -1
            r0 = r23[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            if (r0 != 0) goto L_0x0377
            int r8 = r8 + -1
            if (r8 <= 0) goto L_0x0390
            goto L_0x036c
        L_0x0377:
            r5 = 0
        L_0x0378:
            r0 = r23[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            java.lang.String r0 = ".%02X"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r9.append(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r5 = r5 + 1
            if (r5 >= r8) goto L_0x0390
            goto L_0x0378
        L_0x0390:
            java.lang.String r10 = r9.toString()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
        L_0x0394:
            int r6 = r6 + r29
            r0 = r29
            r7.A0H(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            int r30 = r30 + 1
            goto L_0x005b
        L_0x039f:
            int r32 = r32 + 1
            goto L_0x0049
        L_0x03a3:
            if (r33 != 0) goto L_0x03aa
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            goto L_0x03ae
        L_0x03aa:
            java.util.List r11 = java.util.Collections.singletonList(r37)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
        L_0x03ae:
            int r13 = r35 + 1
            X.SFb r9 = new X.SFb     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            r12 = r2
            r15 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03b8 }
            return r9
        L_0x03b8:
            r1 = move-exception
            java.lang.String r0 = "Error parsing HEVC config"
            X.47p r0 = X.C2609347p.A00(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11201SFb.A00(X.4XV):X.SFb");
    }

    public C11201SFb(String str, List list, float f, int i, int i2, int i3, int i4) {
        this.A06 = list;
        this.A04 = i;
        this.A00 = f;
        this.A05 = str;
        this.A02 = i2;
        this.A01 = i3;
        this.A03 = i4;
    }
}

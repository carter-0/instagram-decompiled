package X;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import sun.misc.Unsafe;

public final class T5V implements C13807ThW {
    public static final Unsafe A0B = C11430STu.A03();
    public static final int[] A0C = new int[0];
    public final C10101Rmd A00;
    public final int[] A01;
    public final int A02;
    public final int A03;
    public final T5R A04;
    public final C9751Rg9 A05;
    public final C9752RgA A06;
    public final C9753RgB A07;
    public final C9755RgD A08;
    public final int[] A09;
    public final Object[] A0A;

    public static Field A01(Class cls, String str) {
        String str2 = str;
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw AnonymousClass7TE.A15(002.A13("Field ", str2, " for ", cls.getName(), " not found. Known fields are ", Arrays.toString(declaredFields)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01b0, code lost:
        if (r27 == false) goto L_0x01b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.T5V A00(X.C9751Rg9 r30, X.C10101Rmd r31, X.C9752RgA r32, X.C9753RgB r33, X.C10705Rwj r34, X.C9755RgD r35) {
        /*
            r8 = r34
            int r0 = r8.A00
            r1 = 1
            r0 = r0 & 1
            if (r0 != r1) goto L_0x002c
            java.lang.Integer r2 = X.AnonymousClass05K.A00
        L_0x000b:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r0 = 0
            boolean r27 = X.AnonymousClass7TF.A1W(r2, r1)
            java.lang.String r14 = r8.A02
            int r26 = r14.length()
            char r0 = r14.charAt(r0)
            r13 = 55296(0xd800, float:7.7486E-41)
            if (r0 < r13) goto L_0x002f
            r0 = 1
        L_0x0022:
            int r1 = r0 + 1
            char r0 = r14.charAt(r0)
            if (r0 < r13) goto L_0x0030
            r0 = r1
            goto L_0x0022
        L_0x002c:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            goto L_0x000b
        L_0x002f:
            r1 = 1
        L_0x0030:
            int r5 = r1 + 1
            char r3 = r14.charAt(r1)
            if (r3 < r13) goto L_0x004f
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x003c:
            int r1 = r5 + 1
            char r0 = r14.charAt(r5)
            if (r0 < r13) goto L_0x004c
            int r3 = X.Pxe.A04(r0, r2, r3)
            int r2 = r2 + 13
            r5 = r1
            goto L_0x003c
        L_0x004c:
            int r0 = r0 << r2
            r3 = r3 | r0
            r5 = r1
        L_0x004f:
            if (r3 != 0) goto L_0x022d
            int[] r25 = A0C
            r3 = 0
            r4 = 0
            r1 = 0
            r2 = 0
            r16 = 0
        L_0x0059:
            sun.misc.Unsafe r12 = A0B
            java.lang.Object[] r11 = r8.A03
            X.T5R r0 = r8.A01
            r29 = r0
            java.lang.Class r10 = r29.getClass()
            int r0 = r4 * 3
            int[] r0 = new int[r0]
            r24 = r0
            int r0 = r4 * 2
            java.lang.Object[] r9 = new java.lang.Object[r0]
            int r28 = r2 + r1
            r23 = r2
            r22 = r28
            r21 = 0
            r20 = 0
        L_0x0079:
            r0 = r26
            if (r5 >= r0) goto L_0x0318
            int r6 = r5 + 1
            char r8 = r14.charAt(r5)
            r4 = r6
            if (r8 < r13) goto L_0x009c
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r1 = 13
        L_0x008a:
            int r6 = r6 + 1
            char r0 = r14.charAt(r4)
            if (r0 < r13) goto L_0x009a
            int r8 = X.Pxe.A04(r0, r1, r8)
            int r1 = r1 + 13
            r4 = r6
            goto L_0x008a
        L_0x009a:
            int r0 = r0 << r1
            r8 = r8 | r0
        L_0x009c:
            int r0 = r6 + 1
            char r7 = r14.charAt(r6)
            if (r7 < r13) goto L_0x00bb
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r1 = r0
            r4 = 13
        L_0x00a9:
            int r0 = r0 + 1
            char r1 = r14.charAt(r1)
            if (r1 < r13) goto L_0x00b9
            int r7 = X.Pxe.A04(r1, r4, r7)
            int r4 = r4 + 13
            r1 = r0
            goto L_0x00a9
        L_0x00b9:
            int r1 = r1 << r4
            r7 = r7 | r1
        L_0x00bb:
            r6 = r7 & 255(0xff, float:3.57E-43)
            r1 = r7 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x00c7
            int r1 = r21 + 1
            r25[r21] = r20
            r21 = r1
        L_0x00c7:
            r1 = 51
            if (r6 < r1) goto L_0x013d
            int r5 = r0 + 1
            char r4 = r14.charAt(r0)
            if (r4 < r13) goto L_0x00ea
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r0 = 13
        L_0x00d7:
            int r15 = r5 + 1
            char r1 = r14.charAt(r5)
            if (r1 < r13) goto L_0x00e7
            int r4 = X.Pxe.A04(r1, r0, r4)
            int r0 = r0 + 13
            r5 = r15
            goto L_0x00d7
        L_0x00e7:
            int r1 = r1 << r0
            r4 = r4 | r1
            r5 = r15
        L_0x00ea:
            int r1 = r6 + -51
            r0 = 9
            if (r1 == r0) goto L_0x00fa
            r0 = 17
            if (r1 == r0) goto L_0x00fa
            r0 = 12
            if (r1 != r0) goto L_0x0108
            if (r27 != 0) goto L_0x0108
        L_0x00fa:
            int r0 = r20 / 3
            int r0 = r0 * 2
            int r15 = r0 + 1
            int r1 = r16 + 1
            r0 = r11[r16]
            r9[r15] = r0
            r16 = r1
        L_0x0108:
            int r15 = r4 * 2
            r1 = r11[r15]
            boolean r0 = r1 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0134
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x0112:
            long r0 = r12.objectFieldOffset(r1)
            int r4 = (int) r0
            r19 = r4
            int r4 = r15 + 1
            r1 = r11[r4]
            boolean r0 = r1 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x012b
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x0123:
            long r0 = r12.objectFieldOffset(r1)
            int r15 = (int) r0
            r0 = 0
            goto L_0x01ff
        L_0x012b:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r1 = A01(r10, r1)
            r11[r4] = r1
            goto L_0x0123
        L_0x0134:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r1 = A01(r10, r1)
            r11[r15] = r1
            goto L_0x0112
        L_0x013d:
            int r17 = r16 + 1
            r1 = r11[r16]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r5 = A01(r10, r1)
            r1 = 9
            if (r6 == r1) goto L_0x01c4
            r1 = 17
            if (r6 == r1) goto L_0x01c4
            r1 = 27
            if (r6 == r1) goto L_0x01b2
            r1 = 49
            if (r6 == r1) goto L_0x01b2
            r1 = 12
            if (r6 == r1) goto L_0x01b0
            r1 = 30
            if (r6 == r1) goto L_0x01b0
            r1 = 44
            if (r6 == r1) goto L_0x01b0
            r1 = 50
            if (r6 != r1) goto L_0x0183
            int r15 = r23 + 1
            r25[r23] = r20
            int r1 = r20 / 3
            int r4 = r1 * 2
            int r16 = r17 + 1
            r1 = r11[r17]
            r9[r4] = r1
            r1 = r7 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x01bf
            int r4 = r4 + 1
            int r17 = r16 + 1
            r1 = r11[r16]
            r9[r4] = r1
            r23 = r15
        L_0x0183:
            long r4 = r12.objectFieldOffset(r5)
            int r1 = (int) r4
            r19 = r1
            r4 = r7 & 4096(0x1000, float:5.74E-42)
            r1 = 4096(0x1000, float:5.74E-42)
            if (r4 != r1) goto L_0x01d4
            r1 = 17
            if (r6 > r1) goto L_0x01d4
            int r1 = r0 + 1
            char r4 = r14.charAt(r0)
            if (r4 < r13) goto L_0x01e8
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r0 = 13
        L_0x01a0:
            int r5 = r1 + 1
            char r1 = r14.charAt(r1)
            if (r1 < r13) goto L_0x01d1
            int r4 = X.Pxe.A04(r1, r0, r4)
            int r0 = r0 + 13
            r1 = r5
            goto L_0x01a0
        L_0x01b0:
            if (r27 != 0) goto L_0x0183
        L_0x01b2:
            int r1 = r20 / 3
            int r1 = r1 * 2
            int r4 = r1 + 1
            int r16 = r17 + 1
            r1 = r11[r17]
            r9[r4] = r1
            goto L_0x01c1
        L_0x01bf:
            r23 = r15
        L_0x01c1:
            r17 = r16
            goto L_0x0183
        L_0x01c4:
            int r1 = r20 / 3
            int r1 = r1 * 2
            int r4 = r1 + 1
            java.lang.Class r1 = r5.getType()
            r9[r4] = r1
            goto L_0x0183
        L_0x01d1:
            int r1 = r1 << r0
            r4 = r4 | r1
            goto L_0x01e9
        L_0x01d4:
            r15 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r0
            r0 = 0
            r1 = 18
            if (r6 < r1) goto L_0x01fd
            r1 = 49
            if (r6 > r1) goto L_0x01fd
            int r1 = r22 + 1
            r25[r22] = r19
            r22 = r1
            goto L_0x01fd
        L_0x01e8:
            r5 = r1
        L_0x01e9:
            int r15 = r3 * 2
            int r0 = r4 / 32
            int r15 = r15 + r0
            r1 = r11[r15]
            boolean r0 = r1 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0224
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x01f6:
            long r15 = r12.objectFieldOffset(r1)
            int r15 = (int) r15
            int r0 = r4 % 32
        L_0x01fd:
            r16 = r17
        L_0x01ff:
            int r18 = r20 + 1
            r24[r20] = r8
            int r17 = r18 + 1
            r1 = r7 & 512(0x200, float:7.175E-43)
            r8 = 0
            if (r1 == 0) goto L_0x020c
            r8 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x020c:
            r1 = r7 & 256(0x100, float:3.59E-43)
            r4 = 0
            if (r1 == 0) goto L_0x0213
            r4 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0213:
            r4 = r4 | r8
            int r1 = r6 << 20
            r4 = r4 | r1
            r4 = r4 | r19
            r24[r18] = r4
            int r20 = r17 + 1
            int r0 = r0 << 20
            r0 = r0 | r15
            r24[r17] = r0
            goto L_0x0079
        L_0x0224:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r1 = A01(r10, r1)
            r11[r15] = r1
            goto L_0x01f6
        L_0x022d:
            int r4 = r5 + 1
            char r3 = r14.charAt(r5)
            if (r3 < r13) goto L_0x024c
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0239:
            int r1 = r4 + 1
            char r0 = r14.charAt(r4)
            if (r0 < r13) goto L_0x0249
            int r3 = X.Pxe.A04(r0, r2, r3)
            int r2 = r2 + 13
            r4 = r1
            goto L_0x0239
        L_0x0249:
            int r0 = r0 << r2
            r3 = r3 | r0
            r4 = r1
        L_0x024c:
            int r0 = r4 + 1
            char r9 = r14.charAt(r4)
            if (r9 < r13) goto L_0x026b
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0258:
            int r1 = r0 + 1
            char r0 = r14.charAt(r0)
            if (r0 < r13) goto L_0x0268
            int r9 = X.Pxe.A04(r0, r2, r9)
            int r2 = r2 + 13
            r0 = r1
            goto L_0x0258
        L_0x0268:
            int r0 = r0 << r2
            r9 = r9 | r0
            r0 = r1
        L_0x026b:
            int r4 = r0 + 1
            char r0 = r14.charAt(r0)
            if (r0 < r13) goto L_0x027d
        L_0x0273:
            int r1 = r4 + 1
            char r0 = r14.charAt(r4)
            r4 = r1
            if (r0 < r13) goto L_0x027d
            goto L_0x0273
        L_0x027d:
            int r2 = r4 + 1
            char r0 = r14.charAt(r4)
            if (r0 < r13) goto L_0x028f
        L_0x0285:
            int r1 = r2 + 1
            char r0 = r14.charAt(r2)
            r2 = r1
            if (r0 < r13) goto L_0x028f
            goto L_0x0285
        L_0x028f:
            int r0 = r2 + 1
            char r4 = r14.charAt(r2)
            if (r4 < r13) goto L_0x02ae
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x029b:
            int r1 = r0 + 1
            char r0 = r14.charAt(r0)
            if (r0 < r13) goto L_0x02ab
            int r4 = X.Pxe.A04(r0, r2, r4)
            int r2 = r2 + 13
            r0 = r1
            goto L_0x029b
        L_0x02ab:
            int r0 = r0 << r2
            r4 = r4 | r0
            r0 = r1
        L_0x02ae:
            int r6 = r0 + 1
            char r1 = r14.charAt(r0)
            if (r1 < r13) goto L_0x02cd
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r5 = 13
        L_0x02ba:
            int r2 = r6 + 1
            char r0 = r14.charAt(r6)
            if (r0 < r13) goto L_0x02ca
            int r1 = X.Pxe.A04(r0, r5, r1)
            int r5 = r5 + 13
            r6 = r2
            goto L_0x02ba
        L_0x02ca:
            int r0 = r0 << r5
            r1 = r1 | r0
            r6 = r2
        L_0x02cd:
            int r0 = r6 + 1
            char r10 = r14.charAt(r6)
            if (r10 < r13) goto L_0x02ec
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r5 = 13
        L_0x02d9:
            int r2 = r0 + 1
            char r0 = r14.charAt(r0)
            if (r0 < r13) goto L_0x02e9
            int r10 = X.Pxe.A04(r0, r5, r10)
            int r5 = r5 + 13
            r0 = r2
            goto L_0x02d9
        L_0x02e9:
            int r0 = r0 << r5
            r10 = r10 | r0
            r0 = r2
        L_0x02ec:
            int r5 = r0 + 1
            char r2 = r14.charAt(r0)
            if (r2 < r13) goto L_0x030b
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r7 = 13
        L_0x02f8:
            int r6 = r5 + 1
            char r0 = r14.charAt(r5)
            if (r0 < r13) goto L_0x0308
            int r2 = X.Pxe.A04(r0, r7, r2)
            int r7 = r7 + 13
            r5 = r6
            goto L_0x02f8
        L_0x0308:
            int r0 = r0 << r7
            r2 = r2 | r0
            r5 = r6
        L_0x030b:
            int r0 = r2 + r1
            int r0 = r0 + r10
            int[] r0 = new int[r0]
            r25 = r0
            int r16 = r3 * 2
            int r16 = r16 + r9
            goto L_0x0059
        L_0x0318:
            X.T5V r17 = new X.T5V
            r19 = r30
            r20 = r31
            r21 = r32
            r22 = r33
            r23 = r35
            r18 = r29
            r26 = r9
            r27 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T5V.A00(X.Rg9, X.Rmd, X.RgA, X.RgB, X.Rwj, X.RgD):X.T5V");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        return !r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a2 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A02(int r11, java.lang.Object r12) {
        /*
            r10 = this;
            int[] r9 = r10.A01
            int r0 = r11 + 2
            r8 = r9[r0]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r7 & r8
            long r1 = (long) r0
            r6 = 0
            r5 = 1
            r3 = 1048575(0xfffff, double:5.18065E-318)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0087
            int r0 = r11 + 1
            r3 = r9[r0]
            r0 = r3 & r7
            long r1 = (long) r0
            int r0 = X.Pxe.A03(r3)
            r3 = 0
            switch(r0) {
                case 0: goto L_0x0094;
                case 1: goto L_0x007a;
                case 2: goto L_0x006f;
                case 3: goto L_0x006f;
                case 4: goto L_0x0066;
                case 5: goto L_0x006f;
                case 6: goto L_0x0066;
                case 7: goto L_0x005f;
                case 8: goto L_0x003c;
                case 9: goto L_0x002a;
                case 10: goto L_0x0033;
                case 11: goto L_0x0066;
                case 12: goto L_0x0066;
                case 13: goto L_0x0066;
                case 14: goto L_0x006f;
                case 15: goto L_0x0066;
                case 16: goto L_0x006f;
                case 17: goto L_0x002a;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalArgumentException r0 = X.Pxe.A0g()
            throw r0
        L_0x002a:
            X.S7k r0 = X.C11430STu.A01
            java.lang.Object r0 = r0.A06(r12, r1)
            if (r0 == 0) goto L_0x00a3
            goto L_0x00a2
        L_0x0033:
            X.TAM r3 = X.TAM.A01
            X.S7k r0 = X.C11430STu.A01
            java.lang.Object r1 = r0.A06(r12, r1)
            goto L_0x0055
        L_0x003c:
            X.S7k r0 = X.C11430STu.A01
            java.lang.Object r1 = r0.A06(r12, r1)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x004f
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r1.isEmpty()
        L_0x004c:
            r0 = r0 ^ 1
            return r0
        L_0x004f:
            boolean r0 = r1 instanceof X.TAM
            if (r0 == 0) goto L_0x005a
            X.TAM r3 = X.TAM.A01
        L_0x0055:
            boolean r0 = r3.equals(r1)
            goto L_0x004c
        L_0x005a:
            java.lang.IllegalArgumentException r0 = X.Pxe.A0g()
            throw r0
        L_0x005f:
            X.S7k r0 = X.C11430STu.A01
            boolean r0 = r0.A0H(r12, r1)
            return r0
        L_0x0066:
            X.S7k r0 = X.C11430STu.A01
            int r0 = r0.A04(r12, r1)
            if (r0 == 0) goto L_0x00a3
            goto L_0x00a2
        L_0x006f:
            X.S7k r0 = X.C11430STu.A01
            long r1 = r0.A05(r12, r1)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00a3
            goto L_0x00a2
        L_0x007a:
            X.S7k r0 = X.C11430STu.A01
            float r0 = r0.A02(r12, r1)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            if (r0 == 0) goto L_0x00a3
            goto L_0x00a2
        L_0x0087:
            int r0 = r8 >>> 20
            int r5 = r5 << r0
            X.S7k r0 = X.C11430STu.A01
            int r0 = r0.A04(r12, r1)
            r0 = r0 & r5
            if (r0 == 0) goto L_0x00a3
            goto L_0x00a2
        L_0x0094:
            X.S7k r0 = X.C11430STu.A01
            double r0 = r0.A01(r12, r1)
            long r1 = java.lang.Double.doubleToRawLongBits(r0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00a3
        L_0x00a2:
            r6 = 1
        L_0x00a3:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T5V.A02(int, java.lang.Object):boolean");
    }

    private boolean A03(Object obj, int i, int i2) {
        return AnonymousClass7TF.A1S(C11430STu.A01.A04(obj, Pxe.A0B(this.A01[i2 + 2])), i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0069, code lost:
        if (r3 != r1) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0095, code lost:
        if (r3 != r0) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b4, code lost:
        if (r8 != r2) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r5 = r5 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean ASr(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            int[] r7 = r10.A01
            int r6 = r7.length
            r9 = 0
            r5 = 0
        L_0x0005:
            if (r5 >= r6) goto L_0x00ce
            int r0 = r5 + 1
            r2 = r7[r0]
            long r0 = X.Pxe.A0B(r2)
            int r2 = X.Pxe.A03(r2)
            switch(r2) {
                case 0: goto L_0x0019;
                case 1: goto L_0x0036;
                case 2: goto L_0x0053;
                case 3: goto L_0x0053;
                case 4: goto L_0x006c;
                case 5: goto L_0x0053;
                case 6: goto L_0x006c;
                case 7: goto L_0x0081;
                case 8: goto L_0x0099;
                case 9: goto L_0x0099;
                case 10: goto L_0x0099;
                case 11: goto L_0x006c;
                case 12: goto L_0x006c;
                case 13: goto L_0x006c;
                case 14: goto L_0x0053;
                case 15: goto L_0x006c;
                case 16: goto L_0x0053;
                case 17: goto L_0x0099;
                case 18: goto L_0x00b6;
                case 19: goto L_0x00b6;
                case 20: goto L_0x00b6;
                case 21: goto L_0x00b6;
                case 22: goto L_0x00b6;
                case 23: goto L_0x00b6;
                case 24: goto L_0x00b6;
                case 25: goto L_0x00b6;
                case 26: goto L_0x00b6;
                case 27: goto L_0x00b6;
                case 28: goto L_0x00b6;
                case 29: goto L_0x00b6;
                case 30: goto L_0x00b6;
                case 31: goto L_0x00b6;
                case 32: goto L_0x00b6;
                case 33: goto L_0x00b6;
                case 34: goto L_0x00b6;
                case 35: goto L_0x00b6;
                case 36: goto L_0x00b6;
                case 37: goto L_0x00b6;
                case 38: goto L_0x00b6;
                case 39: goto L_0x00b6;
                case 40: goto L_0x00b6;
                case 41: goto L_0x00b6;
                case 42: goto L_0x00b6;
                case 43: goto L_0x00b6;
                case 44: goto L_0x00b6;
                case 45: goto L_0x00b6;
                case 46: goto L_0x00b6;
                case 47: goto L_0x00b6;
                case 48: goto L_0x00b6;
                case 49: goto L_0x00b6;
                case 50: goto L_0x00b6;
                case 51: goto L_0x00a2;
                case 52: goto L_0x00a2;
                case 53: goto L_0x00a2;
                case 54: goto L_0x00a2;
                case 55: goto L_0x00a2;
                case 56: goto L_0x00a2;
                case 57: goto L_0x00a2;
                case 58: goto L_0x00a2;
                case 59: goto L_0x00a2;
                case 60: goto L_0x00a2;
                case 61: goto L_0x00a2;
                case 62: goto L_0x00a2;
                case 63: goto L_0x00a2;
                case 64: goto L_0x00a2;
                case 65: goto L_0x00a2;
                case 66: goto L_0x00a2;
                case 67: goto L_0x00a2;
                case 68: goto L_0x00a2;
                default: goto L_0x0016;
            }
        L_0x0016:
            int r5 = r5 + 3
            goto L_0x0005
        L_0x0019:
            boolean r3 = r10.A02(r5, r11)
            boolean r2 = r10.A02(r5, r12)
            if (r3 != r2) goto L_0x00dd
            X.S7k r8 = X.C11430STu.A01
            double r2 = r8.A01(r11, r0)
            long r3 = java.lang.Double.doubleToLongBits(r2)
            double r0 = r8.A01(r12, r0)
            long r1 = java.lang.Double.doubleToLongBits(r0)
            goto L_0x0067
        L_0x0036:
            boolean r3 = r10.A02(r5, r11)
            boolean r2 = r10.A02(r5, r12)
            if (r3 != r2) goto L_0x00dd
            X.S7k r4 = X.C11430STu.A01
            float r2 = r4.A02(r11, r0)
            int r3 = java.lang.Float.floatToIntBits(r2)
            float r0 = r4.A02(r12, r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x0095
        L_0x0053:
            boolean r3 = r10.A02(r5, r11)
            boolean r2 = r10.A02(r5, r12)
            if (r3 != r2) goto L_0x00dd
            X.S7k r2 = X.C11430STu.A01
            long r3 = r2.A05(r11, r0)
            long r1 = r2.A05(r12, r0)
        L_0x0067:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00dd
            goto L_0x0016
        L_0x006c:
            boolean r3 = r10.A02(r5, r11)
            boolean r2 = r10.A02(r5, r12)
            if (r3 != r2) goto L_0x00dd
            X.S7k r2 = X.C11430STu.A01
            int r3 = r2.A04(r11, r0)
            int r0 = r2.A04(r12, r0)
            goto L_0x0095
        L_0x0081:
            boolean r3 = r10.A02(r5, r11)
            boolean r2 = r10.A02(r5, r12)
            if (r3 != r2) goto L_0x00dd
            X.S7k r2 = X.C11430STu.A01
            boolean r3 = r2.A0H(r11, r0)
            boolean r0 = r2.A0H(r12, r0)
        L_0x0095:
            if (r3 != r0) goto L_0x00dd
            goto L_0x0016
        L_0x0099:
            boolean r8 = r10.A02(r5, r11)
            boolean r2 = r10.A02(r5, r12)
            goto L_0x00b4
        L_0x00a2:
            int r2 = r5 + 2
            r2 = r7[r2]
            long r2 = X.Pxe.A0B(r2)
            X.S7k r4 = X.C11430STu.A01
            int r8 = r4.A04(r11, r2)
            int r2 = r4.A04(r12, r2)
        L_0x00b4:
            if (r8 != r2) goto L_0x00dd
        L_0x00b6:
            X.S7k r3 = X.C11430STu.A01
            java.lang.Object r2 = r3.A06(r11, r0)
            java.lang.Object r1 = r3.A06(r12, r0)
            X.RgD r0 = X.SD1.A02
            if (r2 == r1) goto L_0x0016
            if (r2 == 0) goto L_0x00dd
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x00dd
            goto L_0x0016
        L_0x00ce:
            X.R5n r11 = (X.R5n) r11
            X.SIT r1 = r11.unknownFields
            X.R5n r12 = (X.R5n) r12
            X.SIT r0 = r12.unknownFields
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00dd
            r9 = 1
        L_0x00dd:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T5V.ASr(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        r6 = r6 * 53;
        r0 = X.C11430STu.A01.A06(r10, r1).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        r6 = r6 * 53;
        r0 = ((java.lang.String) X.C11430STu.A01.A06(r10, r1)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00be, code lost:
        r0 = X.SDA.A04;
        r0 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c2, code lost:
        if (r1 == false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c4, code lost:
        r0 = 1231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e1, code lost:
        r0 = java.lang.Float.floatToIntBits(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ee, code lost:
        r1 = java.lang.Double.doubleToLongBits(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f2, code lost:
        r0 = X.SDA.A04;
        r0 = X.C51968G9o.A03(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f8, code lost:
        r6 = r6 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        r3 = r3 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int CL6(java.lang.Object r10) {
        /*
            r9 = this;
            int[] r5 = r9.A01
            int r4 = r5.length
            r3 = 0
            r6 = 0
        L_0x0005:
            if (r3 >= r4) goto L_0x00fb
            int r0 = r3 + 1
            r0 = r5[r0]
            r8 = r5[r3]
            long r1 = X.Pxe.A0B(r0)
            int r0 = X.Pxe.A03(r0)
            r7 = 37
            switch(r0) {
                case 0: goto L_0x00e6;
                case 1: goto L_0x00d9;
                case 2: goto L_0x00d0;
                case 3: goto L_0x00d0;
                case 4: goto L_0x00c7;
                case 5: goto L_0x00d0;
                case 6: goto L_0x00c7;
                case 7: goto L_0x00b6;
                case 8: goto L_0x0047;
                case 9: goto L_0x001d;
                case 10: goto L_0x0033;
                case 11: goto L_0x00c7;
                case 12: goto L_0x00c7;
                case 13: goto L_0x00c7;
                case 14: goto L_0x00d0;
                case 15: goto L_0x00c7;
                case 16: goto L_0x00d0;
                case 17: goto L_0x001d;
                case 18: goto L_0x0033;
                case 19: goto L_0x0033;
                case 20: goto L_0x0033;
                case 21: goto L_0x0033;
                case 22: goto L_0x0033;
                case 23: goto L_0x0033;
                case 24: goto L_0x0033;
                case 25: goto L_0x0033;
                case 26: goto L_0x0033;
                case 27: goto L_0x0033;
                case 28: goto L_0x0033;
                case 29: goto L_0x0033;
                case 30: goto L_0x0033;
                case 31: goto L_0x0033;
                case 32: goto L_0x0033;
                case 33: goto L_0x0033;
                case 34: goto L_0x0033;
                case 35: goto L_0x0033;
                case 36: goto L_0x0033;
                case 37: goto L_0x0033;
                case 38: goto L_0x0033;
                case 39: goto L_0x0033;
                case 40: goto L_0x0033;
                case 41: goto L_0x0033;
                case 42: goto L_0x0033;
                case 43: goto L_0x0033;
                case 44: goto L_0x0033;
                case 45: goto L_0x0033;
                case 46: goto L_0x0033;
                case 47: goto L_0x0033;
                case 48: goto L_0x0033;
                case 49: goto L_0x0033;
                case 50: goto L_0x0033;
                case 51: goto L_0x00a3;
                case 52: goto L_0x0090;
                case 53: goto L_0x007d;
                case 54: goto L_0x007d;
                case 55: goto L_0x006a;
                case 56: goto L_0x007d;
                case 57: goto L_0x006a;
                case 58: goto L_0x0057;
                case 59: goto L_0x0041;
                case 60: goto L_0x002d;
                case 61: goto L_0x002d;
                case 62: goto L_0x006a;
                case 63: goto L_0x006a;
                case 64: goto L_0x006a;
                case 65: goto L_0x007d;
                case 66: goto L_0x006a;
                case 67: goto L_0x007d;
                case 68: goto L_0x002d;
                default: goto L_0x001a;
            }
        L_0x001a:
            int r3 = r3 + 3
            goto L_0x0005
        L_0x001d:
            X.S7k r0 = X.C11430STu.A01
            java.lang.Object r0 = r0.A06(r10, r1)
            if (r0 == 0) goto L_0x0029
            int r7 = r0.hashCode()
        L_0x0029:
            int r6 = r6 * 53
            int r6 = r6 + r7
            goto L_0x001a
        L_0x002d:
            boolean r0 = r9.A03(r10, r8, r3)
            if (r0 == 0) goto L_0x001a
        L_0x0033:
            int r6 = r6 * 53
            X.S7k r0 = X.C11430STu.A01
            java.lang.Object r0 = r0.A06(r10, r1)
            int r0 = r0.hashCode()
            goto L_0x00f8
        L_0x0041:
            boolean r0 = r9.A03(r10, r8, r3)
            if (r0 == 0) goto L_0x001a
        L_0x0047:
            int r6 = r6 * 53
            X.S7k r0 = X.C11430STu.A01
            java.lang.Object r0 = r0.A06(r10, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.hashCode()
            goto L_0x00f8
        L_0x0057:
            boolean r0 = r9.A03(r10, r8, r3)
            if (r0 == 0) goto L_0x001a
            int r6 = r6 * 53
            X.S7k r0 = X.C11430STu.A01
            java.lang.Object r0 = r0.A06(r10, r1)
            boolean r1 = X.AnonymousClass7TE.A1a(r0)
            goto L_0x00be
        L_0x006a:
            boolean r0 = r9.A03(r10, r8, r3)
            if (r0 == 0) goto L_0x001a
            int r6 = r6 * 53
            X.S7k r0 = X.C11430STu.A01
            java.lang.Object r0 = r0.A06(r10, r1)
            int r0 = X.AnonymousClass7TE.A0M(r0)
            goto L_0x00f8
        L_0x007d:
            boolean r0 = r9.A03(r10, r8, r3)
            if (r0 == 0) goto L_0x001a
            int r6 = r6 * 53
            X.S7k r0 = X.C11430STu.A01
            java.lang.Object r0 = r0.A06(r10, r1)
            long r1 = X.AnonymousClass7TE.A0R(r0)
            goto L_0x00f2
        L_0x0090:
            boolean r0 = r9.A03(r10, r8, r3)
            if (r0 == 0) goto L_0x001a
            int r6 = r6 * 53
            X.S7k r0 = X.C11430STu.A01
            java.lang.Object r0 = r0.A06(r10, r1)
            float r0 = X.AnonymousClass7TE.A04(r0)
            goto L_0x00e1
        L_0x00a3:
            boolean r0 = r9.A03(r10, r8, r3)
            if (r0 == 0) goto L_0x001a
            int r6 = r6 * 53
            X.S7k r0 = X.C11430STu.A01
            java.lang.Object r0 = r0.A06(r10, r1)
            double r0 = X.JTO.A00(r0)
            goto L_0x00ee
        L_0x00b6:
            int r6 = r6 * 53
            X.S7k r0 = X.C11430STu.A01
            boolean r1 = r0.A0H(r10, r1)
        L_0x00be:
            java.nio.charset.Charset r0 = X.SDA.A04
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x00f8
            r0 = 1231(0x4cf, float:1.725E-42)
            goto L_0x00f8
        L_0x00c7:
            int r6 = r6 * 53
            X.S7k r0 = X.C11430STu.A01
            int r0 = r0.A04(r10, r1)
            goto L_0x00f8
        L_0x00d0:
            int r6 = r6 * 53
            X.S7k r0 = X.C11430STu.A01
            long r1 = r0.A05(r10, r1)
            goto L_0x00f2
        L_0x00d9:
            int r6 = r6 * 53
            X.S7k r0 = X.C11430STu.A01
            float r0 = r0.A02(r10, r1)
        L_0x00e1:
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x00f8
        L_0x00e6:
            int r6 = r6 * 53
            X.S7k r0 = X.C11430STu.A01
            double r0 = r0.A01(r10, r1)
        L_0x00ee:
            long r1 = java.lang.Double.doubleToLongBits(r0)
        L_0x00f2:
            java.nio.charset.Charset r0 = X.SDA.A04
            int r0 = X.C51968G9o.A03(r1)
        L_0x00f8:
            int r6 = r6 + r0
            goto L_0x001a
        L_0x00fb:
            int r1 = r6 * 53
            X.R5n r10 = (X.R5n) r10
            X.SIT r0 = r10.unknownFields
            int r0 = X.AnonymousClass7TE.A0N(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T5V.CL6(java.lang.Object):int");
    }

    public final void ClW(Object obj) {
        int i;
        Object unmodifiableList;
        int i2 = this.A02;
        while (true) {
            i = this.A03;
            if (i2 >= i) {
                break;
            }
            long A0B2 = Pxe.A0B(this.A01[this.A09[i2] + 1]);
            Object A062 = C11430STu.A01.A06(obj, A0B2);
            if (A062 != null) {
                ((TSX) A062).A00 = false;
                C11430STu.A04(obj, A0B2, A062);
            }
            i2++;
        }
        int[] iArr = this.A09;
        int length = iArr.length;
        while (i < length) {
            C10101Rmd rmd = this.A00;
            long j = (long) iArr[i];
            boolean z = rmd instanceof R70;
            Object A063 = C11430STu.A01.A06(obj, j);
            if (z) {
                ((C13257TRx) ((C13983TnZ) A063)).A00 = false;
            } else {
                List list = (List) A063;
                if (list instanceof C13976TnS) {
                    unmodifiableList = ((C13976TnS) list).CBj();
                } else if (!Pxh.A1W(R71.A00, list)) {
                    unmodifiableList = Collections.unmodifiableList(list);
                }
                C11430STu.A04(obj, j, unmodifiableList);
            }
            i++;
        }
    }

    /* JADX WARNING: type inference failed for: r1v16, types: [java.util.LinkedHashMap, X.TSX] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x019f, code lost:
        r7.A0A(r10, (long) r1, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Co5(java.lang.Object r16, java.lang.Object r17) {
        /*
            r15 = this;
            r5 = r17
            r5.getClass()
            r4 = 0
        L_0x0006:
            int[] r2 = r15.A01
            int r0 = r2.length
            r10 = r16
            if (r4 >= r0) goto L_0x01e9
            int r0 = r4 + 1
            r0 = r2[r0]
            long r11 = X.Pxe.A0B(r0)
            r3 = r2[r4]
            int r0 = X.Pxe.A03(r0)
            switch(r0) {
                case 0: goto L_0x0163;
                case 1: goto L_0x0153;
                case 2: goto L_0x0143;
                case 3: goto L_0x0143;
                case 4: goto L_0x0132;
                case 5: goto L_0x0143;
                case 6: goto L_0x0132;
                case 7: goto L_0x0121;
                case 8: goto L_0x0113;
                case 9: goto L_0x01a8;
                case 10: goto L_0x0113;
                case 11: goto L_0x0132;
                case 12: goto L_0x0132;
                case 13: goto L_0x0132;
                case 14: goto L_0x0143;
                case 15: goto L_0x0132;
                case 16: goto L_0x0143;
                case 17: goto L_0x01a8;
                case 18: goto L_0x0078;
                case 19: goto L_0x0078;
                case 20: goto L_0x0078;
                case 21: goto L_0x0078;
                case 22: goto L_0x0078;
                case 23: goto L_0x0078;
                case 24: goto L_0x0078;
                case 25: goto L_0x0078;
                case 26: goto L_0x0078;
                case 27: goto L_0x0078;
                case 28: goto L_0x0078;
                case 29: goto L_0x0078;
                case 30: goto L_0x0078;
                case 31: goto L_0x0078;
                case 32: goto L_0x0078;
                case 33: goto L_0x0078;
                case 34: goto L_0x0078;
                case 35: goto L_0x0078;
                case 36: goto L_0x0078;
                case 37: goto L_0x0078;
                case 38: goto L_0x0078;
                case 39: goto L_0x0078;
                case 40: goto L_0x0078;
                case 41: goto L_0x0078;
                case 42: goto L_0x0078;
                case 43: goto L_0x0078;
                case 44: goto L_0x0078;
                case 45: goto L_0x0078;
                case 46: goto L_0x0078;
                case 47: goto L_0x0078;
                case 48: goto L_0x0078;
                case 49: goto L_0x0078;
                case 50: goto L_0x003a;
                case 51: goto L_0x0021;
                case 52: goto L_0x0021;
                case 53: goto L_0x0021;
                case 54: goto L_0x0021;
                case 55: goto L_0x0021;
                case 56: goto L_0x0021;
                case 57: goto L_0x0021;
                case 58: goto L_0x0021;
                case 59: goto L_0x0021;
                case 60: goto L_0x0173;
                case 61: goto L_0x0021;
                case 62: goto L_0x0021;
                case 63: goto L_0x0021;
                case 64: goto L_0x0021;
                case 65: goto L_0x0021;
                case 66: goto L_0x0021;
                case 67: goto L_0x0021;
                case 68: goto L_0x0173;
                default: goto L_0x001e;
            }
        L_0x001e:
            int r4 = r4 + 3
            goto L_0x0006
        L_0x0021:
            boolean r0 = r15.A03(r5, r3, r4)
            if (r0 == 0) goto L_0x001e
            X.S7k r7 = X.C11430STu.A01
            java.lang.Object r0 = r7.A06(r5, r11)
            X.C11430STu.A04(r10, r11, r0)
            int r0 = r4 + 2
            r1 = r2[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            goto L_0x019f
        L_0x003a:
            X.RgD r0 = X.SD1.A02
            X.S7k r0 = X.C11430STu.A01
            java.lang.Object r3 = r0.A06(r10, r11)
            java.lang.Object r2 = r0.A06(r5, r11)
            X.TSX r3 = (X.TSX) r3
            java.util.AbstractMap r2 = (java.util.AbstractMap) r2
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x006d
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x0060
            boolean r0 = r3.isEmpty()
            X.TSX r1 = new X.TSX
            if (r0 == 0) goto L_0x0071
            r1.<init>()
        L_0x005f:
            r3 = r1
        L_0x0060:
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x01e4
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x006d
            r3.putAll(r2)
        L_0x006d:
            X.C11430STu.A04(r10, r11, r3)
            goto L_0x001e
        L_0x0071:
            r1.<init>(r3)
            r0 = 1
            r1.A00 = r0
            goto L_0x005f
        L_0x0078:
            X.Rmd r0 = r15.A00
            boolean r1 = r0 instanceof X.R70
            X.S7k r0 = X.C11430STu.A01
            if (r1 == 0) goto L_0x00ad
            java.lang.Object r6 = r0.A06(r10, r11)
            X.TnZ r6 = (X.C13983TnZ) r6
            java.lang.Object r3 = r0.A06(r5, r11)
            java.util.List r3 = (java.util.List) r3
            int r2 = r6.size()
            int r1 = r3.size()
            if (r2 <= 0) goto L_0x00a8
            if (r1 <= 0) goto L_0x00a7
            r0 = r6
            X.TRx r0 = (X.C13257TRx) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00a4
            int r1 = r1 + r2
            X.TnZ r6 = r6.Coq(r1)
        L_0x00a4:
            r6.addAll(r3)
        L_0x00a7:
            r3 = r6
        L_0x00a8:
            X.C11430STu.A04(r10, r11, r3)
            goto L_0x001e
        L_0x00ad:
            java.lang.Object r3 = r0.A06(r5, r11)
            java.util.List r3 = (java.util.List) r3
            int r1 = r3.size()
            java.lang.Object r2 = r0.A06(r10, r11)
            java.util.List r2 = (java.util.List) r2
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x00ef
            boolean r0 = r2 instanceof X.C13976TnS
            if (r0 == 0) goto L_0x00ea
            X.TnS r0 = X.R5o.A01
            java.util.ArrayList r0 = X.DbS.A0v(r1)
            X.R5o r2 = new X.R5o
            r2.<init>(r0)
        L_0x00d2:
            X.C11430STu.A04(r10, r11, r2)
        L_0x00d5:
            int r1 = r2.size()
            int r0 = r3.size()
            if (r1 <= 0) goto L_0x00e5
            if (r0 <= 0) goto L_0x00e4
            r2.addAll(r3)
        L_0x00e4:
            r3 = r2
        L_0x00e5:
            X.C11430STu.A04(r10, r11, r3)
            goto L_0x001e
        L_0x00ea:
            java.util.ArrayList r2 = X.DbS.A0v(r1)
            goto L_0x00d2
        L_0x00ef:
            java.lang.Class r0 = X.R71.A00
            boolean r0 = X.Pxh.A1W(r0, r2)
            if (r0 == 0) goto L_0x0103
            java.util.ArrayList r1 = X.Pxi.A0k(r2, r1)
        L_0x00fb:
            r1.addAll(r2)
            X.C11430STu.A04(r10, r11, r1)
            r2 = r1
            goto L_0x00d5
        L_0x0103:
            boolean r0 = r2 instanceof X.C13258TRy
            if (r0 == 0) goto L_0x00d5
            X.TnS r0 = X.R5o.A01
            java.util.ArrayList r0 = X.Pxi.A0k(r2, r1)
            X.R5o r1 = new X.R5o
            r1.<init>(r0)
            goto L_0x00fb
        L_0x0113:
            boolean r0 = r15.A02(r4, r5)
            if (r0 == 0) goto L_0x001e
            X.S7k r9 = X.C11430STu.A01
            java.lang.Object r0 = r9.A06(r5, r11)
            goto L_0x01c0
        L_0x0121:
            boolean r0 = r15.A02(r4, r5)
            if (r0 == 0) goto L_0x001e
            X.S7k r9 = X.C11430STu.A01
            boolean r0 = r9.A0H(r5, r11)
            r9.A0D(r10, r11, r0)
            goto L_0x01c3
        L_0x0132:
            boolean r0 = r15.A02(r4, r5)
            if (r0 == 0) goto L_0x001e
            X.S7k r9 = X.C11430STu.A01
            int r0 = r9.A04(r5, r11)
            r9.A0A(r10, r11, r0)
            goto L_0x01c3
        L_0x0143:
            boolean r0 = r15.A02(r4, r5)
            if (r0 == 0) goto L_0x001e
            X.S7k r9 = X.C11430STu.A01
            long r13 = r9.A05(r5, r11)
            r9.A0B(r10, r11, r13)
            goto L_0x01c3
        L_0x0153:
            boolean r0 = r15.A02(r4, r5)
            if (r0 == 0) goto L_0x001e
            X.S7k r9 = X.C11430STu.A01
            float r0 = r9.A02(r5, r11)
            r9.A09(r10, r11, r0)
            goto L_0x01c3
        L_0x0163:
            boolean r0 = r15.A02(r4, r5)
            if (r0 == 0) goto L_0x001e
            X.S7k r9 = X.C11430STu.A01
            double r13 = r9.A01(r5, r11)
            r9.A08(r10, r11, r13)
            goto L_0x01c3
        L_0x0173:
            r6 = 1048575(0xfffff, float:1.469367E-39)
            boolean r0 = r15.A03(r5, r3, r4)
            if (r0 == 0) goto L_0x001e
            r1 = 0
            boolean r0 = r15.A03(r10, r3, r4)
            if (r0 == 0) goto L_0x0189
            X.S7k r0 = X.C11430STu.A01
            java.lang.Object r1 = r0.A06(r10, r11)
        L_0x0189:
            X.S7k r7 = X.C11430STu.A01
            java.lang.Object r0 = r7.A06(r5, r11)
            if (r1 == 0) goto L_0x01a5
            if (r0 == 0) goto L_0x001e
            X.R5n r0 = X.SDA.A00(r1, r0)
        L_0x0197:
            X.C11430STu.A04(r10, r11, r0)
            int r0 = r4 + 2
            r1 = r2[r0]
            r1 = r1 & r6
        L_0x019f:
            long r0 = (long) r1
            r7.A0A(r10, r0, r3)
            goto L_0x001e
        L_0x01a5:
            if (r0 == 0) goto L_0x001e
            goto L_0x0197
        L_0x01a8:
            boolean r0 = r15.A02(r4, r5)
            if (r0 == 0) goto L_0x001e
            X.S7k r9 = X.C11430STu.A01
            java.lang.Object r1 = r9.A06(r10, r11)
            java.lang.Object r0 = r9.A06(r5, r11)
            if (r1 == 0) goto L_0x01e1
            if (r0 == 0) goto L_0x001e
            X.R5n r0 = X.SDA.A00(r1, r0)
        L_0x01c0:
            X.C11430STu.A04(r10, r11, r0)
        L_0x01c3:
            int r0 = r4 + 2
            r8 = r2[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r8
            long r1 = (long) r0
            r6 = 1048575(0xfffff, double:5.18065E-318)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x001e
            r3 = 1
            int r0 = r8 >>> 20
            int r3 = r3 << r0
            int r0 = r9.A04(r10, r1)
            r3 = r3 | r0
            r9.A0A(r10, r1, r3)
            goto L_0x001e
        L_0x01e1:
            if (r0 == 0) goto L_0x001e
            goto L_0x01c0
        L_0x01e4:
            java.lang.UnsupportedOperationException r0 = X.C66580MXl.A11()
            throw r0
        L_0x01e9:
            X.SD1.A00(r10, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T5V.Co5(java.lang.Object, java.lang.Object):void");
    }

    public T5V(T5R t5r, C9751Rg9 rg9, C10101Rmd rmd, C9752RgA rgA, C9753RgB rgB, C9755RgD rgD, int[] iArr, int[] iArr2, Object[] objArr, int i, int i2) {
        this.A01 = iArr;
        this.A0A = objArr;
        this.A09 = iArr2;
        this.A02 = i;
        this.A03 = i2;
        this.A07 = rgB;
        this.A00 = rmd;
        this.A08 = rgD;
        this.A05 = rg9;
        this.A04 = t5r;
        this.A06 = rgA;
    }
}

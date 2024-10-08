package X;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: X.9C9  reason: invalid class name */
public final class AnonymousClass9C9 implements C374899Bg {
    public static final Unsafe A0E = AnonymousClass9CA.A03();
    public static final int[] A0F = new int[0];
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AnonymousClass973 A04;
    public final AnonymousClass9C4 A05;
    public final int[] A06;
    public final int[] A07;
    public final Object[] A08;
    public final AnonymousClass9CE A09;
    public final AnonymousClass9C8 A0A;
    public final AnonymousClass9C3 A0B;
    public final AnonymousClass9C0 A0C;
    public final boolean A0D;

    public static Field A06(Class cls, String str) {
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
            throw new RuntimeException(002.A13("Field ", str2, " for ", cls.getName(), Pxd.A00(110), Arrays.toString(declaredFields)));
        }
    }

    public final void Co8(AnonymousClass9CM r8, Object obj, byte[] bArr, int i, int i2) {
        A0G(r8, obj, bArr, i, i2, 0);
    }

    private int A00(int i) {
        if (i < this.A02 || i > this.A01) {
            return -1;
        }
        int i2 = 0;
        int[] iArr = this.A06;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public static int A01(Object obj, long j) {
        return ((Number) AnonymousClass9CA.A01.A06(obj, j)).intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01e6, code lost:
        if ((r6 & 2048) == 0) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0160, code lost:
        if ((r6 & 2048) == 0) goto L_0x0125;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0250  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass9C9 A02(X.AnonymousClass9CE r38, X.AnonymousClass9C4 r39, X.AnonymousClass9C8 r40, X.AnonymousClass9C3 r41, X.AnonymousClass9C1 r42, X.AnonymousClass9C0 r43) {
        /*
            r31 = r42
            r0 = r31
            java.lang.String r10 = r0.A02
            int r29 = r10.length()
            r0 = 0
            char r0 = r10.charAt(r0)
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r0 < r9) goto L_0x001f
            r0 = 1
        L_0x0015:
            int r1 = r0 + 1
            char r0 = r10.charAt(r0)
            if (r0 < r9) goto L_0x0020
            r0 = r1
            goto L_0x0015
        L_0x001f:
            r1 = 1
        L_0x0020:
            int r12 = r1 + 1
            char r3 = r10.charAt(r1)
            if (r3 < r9) goto L_0x003f
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x002c:
            int r1 = r12 + 1
            char r0 = r10.charAt(r12)
            if (r0 < r9) goto L_0x003c
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r2
            r3 = r3 | r0
            int r2 = r2 + 13
            r12 = r1
            goto L_0x002c
        L_0x003c:
            int r0 = r0 << r2
            r3 = r3 | r0
            r12 = r1
        L_0x003f:
            if (r3 != 0) goto L_0x025f
            int[] r28 = A0F
            r4 = 0
            r5 = 0
            r1 = 0
            r11 = 0
            r3 = 0
            r16 = 0
            r2 = 0
        L_0x004b:
            sun.misc.Unsafe r27 = A0E
            r0 = r31
            java.lang.Object[] r8 = r0.A03
            X.973 r0 = r0.A01
            r30 = r0
            java.lang.Class r26 = r30.getClass()
            int r0 = r5 * 3
            int[] r0 = new int[r0]
            r25 = r0
            int r0 = r5 * 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r24 = r0
            int r42 = r2 + r1
            r23 = r2
            r22 = r42
            r21 = 0
            r17 = 0
        L_0x006f:
            r0 = r29
            if (r12 >= r0) goto L_0x0364
            int r5 = r12 + 1
            char r7 = r10.charAt(r12)
            r0 = r5
            if (r7 < r9) goto L_0x0092
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r1 = 13
        L_0x0080:
            int r5 = r5 + 1
            char r0 = r10.charAt(r0)
            if (r0 < r9) goto L_0x0090
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r1
            r7 = r7 | r0
            int r1 = r1 + 13
            r0 = r5
            goto L_0x0080
        L_0x0090:
            int r0 = r0 << r1
            r7 = r7 | r0
        L_0x0092:
            int r14 = r5 + 1
            char r6 = r10.charAt(r5)
            if (r6 < r9) goto L_0x00b1
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r0 = r14
            r1 = 13
        L_0x009f:
            int r14 = r14 + 1
            char r0 = r10.charAt(r0)
            if (r0 < r9) goto L_0x00af
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r1
            r6 = r6 | r0
            int r1 = r1 + 13
            r0 = r14
            goto L_0x009f
        L_0x00af:
            int r0 = r0 << r1
            r6 = r6 | r0
        L_0x00b1:
            r5 = r6 & 255(0xff, float:3.57E-43)
            r0 = r6 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x00bd
            int r0 = r21 + 1
            r28[r21] = r17
            r21 = r0
        L_0x00bd:
            r0 = 51
            if (r5 < r0) goto L_0x00dd
            int r12 = r14 + 1
            char r1 = r10.charAt(r14)
            if (r1 < r9) goto L_0x01c4
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00cd:
            int r13 = r12 + 1
            char r0 = r10.charAt(r12)
            if (r0 < r9) goto L_0x01c1
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r14
            r1 = r1 | r0
            int r14 = r14 + 13
            r12 = r13
            goto L_0x00cd
        L_0x00dd:
            int r20 = r16 + 1
            r1 = r8[r16]
            java.lang.String r1 = (java.lang.String) r1
            r0 = r26
            java.lang.reflect.Field r1 = A06(r0, r1)
            r12 = 49
            r0 = 9
            if (r5 == r0) goto L_0x0177
            r0 = 17
            if (r5 == r0) goto L_0x0177
            r0 = 27
            if (r5 == r0) goto L_0x0162
            if (r5 == r12) goto L_0x0162
            r0 = 12
            if (r5 == r0) goto L_0x0150
            r0 = 30
            if (r5 == r0) goto L_0x0150
            r0 = 44
            if (r5 == r0) goto L_0x0150
            r0 = 50
            if (r5 != r0) goto L_0x0125
            int r13 = r23 + 1
            r28[r23] = r17
            int r0 = r17 / 3
            int r12 = r0 * 2
            int r15 = r20 + 1
            r0 = r8[r20]
            r24[r12] = r0
            r0 = r6 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0172
            int r12 = r12 + 1
            int r20 = r15 + 1
            r0 = r8[r15]
            r24[r12] = r0
            r23 = r13
        L_0x0125:
            r0 = r27
            long r12 = r0.objectFieldOffset(r1)
            int r15 = (int) r12
            r0 = r6 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0184
            r0 = 17
            if (r5 > r0) goto L_0x0184
            int r12 = r14 + 1
            char r14 = r10.charAt(r14)
            if (r14 < r9) goto L_0x019b
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x0140:
            int r1 = r12 + 1
            char r0 = r10.charAt(r12)
            if (r0 < r9) goto L_0x0198
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r13
            r14 = r14 | r0
            int r13 = r13 + 13
            r12 = r1
            goto L_0x0140
        L_0x0150:
            r0 = r31
            int r0 = r0.A00
            r0 = r0 & 1
            if (r0 == 0) goto L_0x016f
            java.lang.Integer r12 = X.AnonymousClass05K.A00
        L_0x015a:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r12 == r0) goto L_0x0162
            r0 = r6 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0125
        L_0x0162:
            int r0 = r17 / 3
            int r0 = r0 * 2
            int r12 = r0 + 1
            int r15 = r20 + 1
            r0 = r8[r20]
            r24[r12] = r0
            goto L_0x0174
        L_0x016f:
            java.lang.Integer r12 = X.AnonymousClass05K.A01
            goto L_0x015a
        L_0x0172:
            r23 = r13
        L_0x0174:
            r20 = r15
            goto L_0x0125
        L_0x0177:
            int r0 = r17 / 3
            int r0 = r0 * 2
            int r12 = r0 + 1
            java.lang.Class r0 = r1.getType()
            r24[r12] = r0
            goto L_0x0125
        L_0x0184:
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r14
            r1 = 0
            r0 = 18
            if (r5 < r0) goto L_0x01b3
            r0 = 49
            if (r5 > r0) goto L_0x01b3
            int r0 = r22 + 1
            r28[r22] = r15
            r22 = r0
            goto L_0x01b3
        L_0x0198:
            int r0 = r0 << r13
            r14 = r14 | r0
            r12 = r1
        L_0x019b:
            int r13 = r4 * 2
            int r0 = r14 / 32
            int r13 = r13 + r0
            r1 = r8[r13]
            boolean r0 = r1 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x01b6
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x01a8:
            r0 = r27
            long r18 = r0.objectFieldOffset(r1)
            r0 = r18
            int r13 = (int) r0
            int r1 = r14 % 32
        L_0x01b3:
            r16 = r20
            goto L_0x0219
        L_0x01b6:
            java.lang.String r1 = (java.lang.String) r1
            r0 = r26
            java.lang.reflect.Field r1 = A06(r0, r1)
            r8[r13] = r1
            goto L_0x01a8
        L_0x01c1:
            int r0 = r0 << r14
            r1 = r1 | r0
            r12 = r13
        L_0x01c4:
            int r13 = r5 + -51
            r0 = 9
            if (r13 == r0) goto L_0x01e8
            r0 = 17
            if (r13 == r0) goto L_0x01e8
            r0 = 12
            if (r13 != r0) goto L_0x01f6
            r0 = r31
            int r0 = r0.A00
            r0 = r0 & 1
            if (r0 == 0) goto L_0x025b
            java.lang.Integer r13 = X.AnonymousClass05K.A00
        L_0x01dc:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x01e8
            r0 = r6 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x01f6
        L_0x01e8:
            int r0 = r17 / 3
            int r0 = r0 * 2
            int r14 = r0 + 1
            int r13 = r16 + 1
            r0 = r8[r16]
            r24[r14] = r0
            r16 = r13
        L_0x01f6:
            int r13 = r1 * 2
            r1 = r8[r13]
            boolean r0 = r1 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0250
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x0200:
            r0 = r27
            long r0 = r0.objectFieldOffset(r1)
            int r15 = (int) r0
            int r13 = r13 + 1
            r1 = r8[r13]
            boolean r0 = r1 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0245
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x0211:
            r0 = r27
            long r13 = r0.objectFieldOffset(r1)
            int r13 = (int) r13
            r1 = 0
        L_0x0219:
            int r19 = r17 + 1
            r25[r17] = r7
            int r18 = r19 + 1
            r0 = r6 & 512(0x200, float:7.175E-43)
            r14 = 0
            if (r0 == 0) goto L_0x0226
            r14 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x0226:
            r0 = r6 & 256(0x100, float:3.59E-43)
            r7 = 0
            if (r0 == 0) goto L_0x022d
            r7 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x022d:
            r14 = r14 | r7
            r6 = r6 & 2048(0x800, float:2.87E-42)
            r0 = 0
            if (r6 == 0) goto L_0x0235
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0235:
            r14 = r14 | r0
            int r0 = r5 << 20
            r0 = r0 | r14
            r15 = r15 | r0
            r25[r19] = r15
            int r17 = r18 + 1
            int r0 = r1 << 20
            r13 = r13 | r0
            r25[r18] = r13
            goto L_0x006f
        L_0x0245:
            java.lang.String r1 = (java.lang.String) r1
            r0 = r26
            java.lang.reflect.Field r1 = A06(r0, r1)
            r8[r13] = r1
            goto L_0x0211
        L_0x0250:
            java.lang.String r1 = (java.lang.String) r1
            r0 = r26
            java.lang.reflect.Field r1 = A06(r0, r1)
            r8[r13] = r1
            goto L_0x0200
        L_0x025b:
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            goto L_0x01dc
        L_0x025f:
            int r0 = r12 + 1
            char r4 = r10.charAt(r12)
            if (r4 < r9) goto L_0x027e
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x026b:
            int r1 = r0 + 1
            char r0 = r10.charAt(r0)
            if (r0 < r9) goto L_0x027b
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r2
            r4 = r4 | r0
            int r2 = r2 + 13
            r0 = r1
            goto L_0x026b
        L_0x027b:
            int r0 = r0 << r2
            r4 = r4 | r0
            r0 = r1
        L_0x027e:
            int r3 = r0 + 1
            char r7 = r10.charAt(r0)
            if (r7 < r9) goto L_0x029d
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x028a:
            int r1 = r3 + 1
            char r0 = r10.charAt(r3)
            if (r0 < r9) goto L_0x029a
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r2
            r7 = r7 | r0
            int r2 = r2 + 13
            r3 = r1
            goto L_0x028a
        L_0x029a:
            int r0 = r0 << r2
            r7 = r7 | r0
            r3 = r1
        L_0x029d:
            int r0 = r3 + 1
            char r11 = r10.charAt(r3)
            if (r11 < r9) goto L_0x02bc
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x02a9:
            int r1 = r0 + 1
            char r0 = r10.charAt(r0)
            if (r0 < r9) goto L_0x02b9
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r2
            r11 = r11 | r0
            int r2 = r2 + 13
            r0 = r1
            goto L_0x02a9
        L_0x02b9:
            int r0 = r0 << r2
            r11 = r11 | r0
            r0 = r1
        L_0x02bc:
            int r5 = r0 + 1
            char r3 = r10.charAt(r0)
            if (r3 < r9) goto L_0x02db
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x02c8:
            int r1 = r5 + 1
            char r0 = r10.charAt(r5)
            if (r0 < r9) goto L_0x02d8
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r2
            r3 = r3 | r0
            int r2 = r2 + 13
            r5 = r1
            goto L_0x02c8
        L_0x02d8:
            int r0 = r0 << r2
            r3 = r3 | r0
            r5 = r1
        L_0x02db:
            int r0 = r5 + 1
            char r5 = r10.charAt(r5)
            if (r5 < r9) goto L_0x02fa
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x02e7:
            int r1 = r0 + 1
            char r0 = r10.charAt(r0)
            if (r0 < r9) goto L_0x02f7
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r2
            r5 = r5 | r0
            int r2 = r2 + 13
            r0 = r1
            goto L_0x02e7
        L_0x02f7:
            int r0 = r0 << r2
            r5 = r5 | r0
            r0 = r1
        L_0x02fa:
            int r8 = r0 + 1
            char r1 = r10.charAt(r0)
            if (r1 < r9) goto L_0x0319
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r6 = 13
        L_0x0306:
            int r2 = r8 + 1
            char r0 = r10.charAt(r8)
            if (r0 < r9) goto L_0x0316
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r6
            r1 = r1 | r0
            int r6 = r6 + 13
            r8 = r2
            goto L_0x0306
        L_0x0316:
            int r0 = r0 << r6
            r1 = r1 | r0
            r8 = r2
        L_0x0319:
            int r0 = r8 + 1
            char r13 = r10.charAt(r8)
            if (r13 < r9) goto L_0x0338
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r6 = 13
        L_0x0325:
            int r2 = r0 + 1
            char r0 = r10.charAt(r0)
            if (r0 < r9) goto L_0x0335
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r6
            r13 = r13 | r0
            int r6 = r6 + 13
            r0 = r2
            goto L_0x0325
        L_0x0335:
            int r0 = r0 << r6
            r13 = r13 | r0
            r0 = r2
        L_0x0338:
            int r12 = r0 + 1
            char r2 = r10.charAt(r0)
            if (r2 < r9) goto L_0x0357
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0344:
            int r6 = r12 + 1
            char r0 = r10.charAt(r12)
            if (r0 < r9) goto L_0x0354
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r8
            r2 = r2 | r0
            int r8 = r8 + 13
            r12 = r6
            goto L_0x0344
        L_0x0354:
            int r0 = r0 << r8
            r2 = r2 | r0
            r12 = r6
        L_0x0357:
            int r0 = r2 + r1
            int r0 = r0 + r13
            int[] r0 = new int[r0]
            r28 = r0
            int r16 = r4 * 2
            int r16 = r16 + r7
            goto L_0x004b
        L_0x0364:
            X.9C9 r29 = new X.9C9
            r31 = r38
            r32 = r39
            r33 = r40
            r34 = r41
            r35 = r43
            r36 = r25
            r37 = r28
            r38 = r24
            r39 = r11
            r40 = r3
            r41 = r2
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            return r29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9C9.A02(X.9CE, X.9C4, X.9C8, X.9C3, X.9C1, X.9C0):X.9C9");
    }

    private C374899Bg A03(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.A08;
        C374899Bg r0 = (C374899Bg) objArr[i2];
        if (r0 != null) {
            return r0;
        }
        C374899Bg A002 = AnonymousClass9BZ.A02.A00((Class) objArr[i2 + 1]);
        objArr[i2] = A002;
        return A002;
    }

    private void A07(int i, int i2, Object obj, Object obj2) {
        Unsafe unsafe = A0E;
        int[] iArr = this.A06;
        unsafe.putObject(obj, (long) (iArr[i2 + 1] & 1048575), obj2);
        AnonymousClass9CA.A04(obj, (long) (iArr[i2 + 2] & 1048575), i);
    }

    private void A08(AnonymousClass9CF r5, Object obj, int i) {
        long j;
        Object A0M;
        if ((536870912 & i) != 0) {
            j = (long) (i & 1048575);
            AnonymousClass9CF.A01(r5, 2);
            A0M = r5.A03.A0O();
        } else {
            boolean z = this.A0D;
            j = (long) (i & 1048575);
            AnonymousClass9CF.A01(r5, 2);
            AnonymousClass97U r0 = r5.A03;
            if (z) {
                A0M = r0.A0N();
            } else {
                A0M = r0.A0M();
            }
        }
        AnonymousClass9CA.A05(obj, j, A0M);
    }

    private void A0A(Object obj, int i) {
        int i2 = this.A06[i + 2];
        long j = (long) (1048575 & i2);
        if (j != 1048575) {
            AnonymousClass9CA.A04(obj, j, (1 << (i2 >>> 20)) | AnonymousClass9CA.A01.A04(obj, j));
        }
    }

    private void A0B(Object obj, int i, Object obj2) {
        A0E.putObject(obj, (long) (this.A06[i + 1] & 1048575), obj2);
        A0A(obj, i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        return !r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a5 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A0C(int r11, java.lang.Object r12) {
        /*
            r10 = this;
            int[] r9 = r10.A06
            int r0 = r11 + 2
            r8 = r9[r0]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r7 & r8
            long r1 = (long) r0
            r6 = 0
            r5 = 1
            r3 = 1048575(0xfffff, double:5.18065E-318)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x008a
            int r0 = r11 + 1
            r3 = r9[r0]
            r0 = r3 & r7
            long r1 = (long) r0
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r0
            int r0 = r3 >>> 20
            r3 = 0
            switch(r0) {
                case 0: goto L_0x0097;
                case 1: goto L_0x007d;
                case 2: goto L_0x0072;
                case 3: goto L_0x0072;
                case 4: goto L_0x0069;
                case 5: goto L_0x0072;
                case 6: goto L_0x0069;
                case 7: goto L_0x0062;
                case 8: goto L_0x003e;
                case 9: goto L_0x002c;
                case 10: goto L_0x0035;
                case 11: goto L_0x0069;
                case 12: goto L_0x0069;
                case 13: goto L_0x0069;
                case 14: goto L_0x0072;
                case 15: goto L_0x0069;
                case 16: goto L_0x0072;
                case 17: goto L_0x002c;
                default: goto L_0x0026;
            }
        L_0x0026:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x002c:
            X.9CD r0 = X.AnonymousClass9CA.A01
            java.lang.Object r0 = r0.A06(r12, r1)
            if (r0 == 0) goto L_0x00a6
            goto L_0x00a5
        L_0x0035:
            X.97R r3 = X.AnonymousClass97R.A01
            X.9CD r0 = X.AnonymousClass9CA.A01
            java.lang.Object r1 = r0.A06(r12, r1)
            goto L_0x0057
        L_0x003e:
            X.9CD r0 = X.AnonymousClass9CA.A01
            java.lang.Object r1 = r0.A06(r12, r1)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0051
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r1.isEmpty()
        L_0x004e:
            r0 = r0 ^ 1
            return r0
        L_0x0051:
            boolean r0 = r1 instanceof X.AnonymousClass97R
            if (r0 == 0) goto L_0x005c
            X.97R r3 = X.AnonymousClass97R.A01
        L_0x0057:
            boolean r0 = r3.equals(r1)
            goto L_0x004e
        L_0x005c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0062:
            X.9CD r0 = X.AnonymousClass9CA.A01
            boolean r0 = r0.A0I(r12, r1)
            return r0
        L_0x0069:
            X.9CD r0 = X.AnonymousClass9CA.A01
            int r0 = r0.A04(r12, r1)
            if (r0 == 0) goto L_0x00a6
            goto L_0x00a5
        L_0x0072:
            X.9CD r0 = X.AnonymousClass9CA.A01
            long r1 = r0.A05(r12, r1)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00a6
            goto L_0x00a5
        L_0x007d:
            X.9CD r0 = X.AnonymousClass9CA.A01
            float r0 = r0.A02(r12, r1)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            if (r0 == 0) goto L_0x00a6
            goto L_0x00a5
        L_0x008a:
            int r0 = r8 >>> 20
            int r5 = r5 << r0
            X.9CD r0 = X.AnonymousClass9CA.A01
            int r0 = r0.A04(r12, r1)
            r0 = r0 & r5
            if (r0 == 0) goto L_0x00a6
            goto L_0x00a5
        L_0x0097:
            X.9CD r0 = X.AnonymousClass9CA.A01
            double r0 = r0.A01(r12, r1)
            long r1 = java.lang.Double.doubleToRawLongBits(r0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00a6
        L_0x00a5:
            r6 = 1
        L_0x00a6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9C9.A0C(int, java.lang.Object):boolean");
    }

    public static boolean A0D(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof AnonymousClass972) || (((AnonymousClass972) obj).memoizedSerializedSize & AnonymousClass972.MUTABLE_FLAG_MASK) != 0) {
            return true;
        }
        return false;
    }

    private boolean A0E(Object obj, int i, int i2) {
        if (AnonymousClass9CA.A01.A04(obj, (long) (this.A06[i2 + 2] & 1048575)) == i) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        if (r3 != r1) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0097, code lost:
        if (r3 != r0) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b7, code lost:
        if (r8 != r2) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r5 = r5 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean ASr(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            int[] r7 = r10.A06
            int r6 = r7.length
            r9 = 0
            r5 = 0
        L_0x0005:
            if (r5 >= r6) goto L_0x00d1
            int r0 = r5 + 1
            r3 = r7[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r3
            long r0 = (long) r0
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r2
            int r2 = r3 >>> 20
            switch(r2) {
                case 0: goto L_0x001b;
                case 1: goto L_0x0038;
                case 2: goto L_0x0055;
                case 3: goto L_0x0055;
                case 4: goto L_0x006e;
                case 5: goto L_0x0055;
                case 6: goto L_0x006e;
                case 7: goto L_0x0083;
                case 8: goto L_0x009b;
                case 9: goto L_0x009b;
                case 10: goto L_0x009b;
                case 11: goto L_0x006e;
                case 12: goto L_0x006e;
                case 13: goto L_0x006e;
                case 14: goto L_0x0055;
                case 15: goto L_0x006e;
                case 16: goto L_0x0055;
                case 17: goto L_0x009b;
                case 18: goto L_0x00b9;
                case 19: goto L_0x00b9;
                case 20: goto L_0x00b9;
                case 21: goto L_0x00b9;
                case 22: goto L_0x00b9;
                case 23: goto L_0x00b9;
                case 24: goto L_0x00b9;
                case 25: goto L_0x00b9;
                case 26: goto L_0x00b9;
                case 27: goto L_0x00b9;
                case 28: goto L_0x00b9;
                case 29: goto L_0x00b9;
                case 30: goto L_0x00b9;
                case 31: goto L_0x00b9;
                case 32: goto L_0x00b9;
                case 33: goto L_0x00b9;
                case 34: goto L_0x00b9;
                case 35: goto L_0x00b9;
                case 36: goto L_0x00b9;
                case 37: goto L_0x00b9;
                case 38: goto L_0x00b9;
                case 39: goto L_0x00b9;
                case 40: goto L_0x00b9;
                case 41: goto L_0x00b9;
                case 42: goto L_0x00b9;
                case 43: goto L_0x00b9;
                case 44: goto L_0x00b9;
                case 45: goto L_0x00b9;
                case 46: goto L_0x00b9;
                case 47: goto L_0x00b9;
                case 48: goto L_0x00b9;
                case 49: goto L_0x00b9;
                case 50: goto L_0x00b9;
                case 51: goto L_0x00a4;
                case 52: goto L_0x00a4;
                case 53: goto L_0x00a4;
                case 54: goto L_0x00a4;
                case 55: goto L_0x00a4;
                case 56: goto L_0x00a4;
                case 57: goto L_0x00a4;
                case 58: goto L_0x00a4;
                case 59: goto L_0x00a4;
                case 60: goto L_0x00a4;
                case 61: goto L_0x00a4;
                case 62: goto L_0x00a4;
                case 63: goto L_0x00a4;
                case 64: goto L_0x00a4;
                case 65: goto L_0x00a4;
                case 66: goto L_0x00a4;
                case 67: goto L_0x00a4;
                case 68: goto L_0x00a4;
                default: goto L_0x0018;
            }
        L_0x0018:
            int r5 = r5 + 3
            goto L_0x0005
        L_0x001b:
            boolean r3 = r10.A0C(r5, r11)
            boolean r2 = r10.A0C(r5, r12)
            if (r3 != r2) goto L_0x00e0
            X.9CD r8 = X.AnonymousClass9CA.A01
            double r2 = r8.A01(r11, r0)
            long r3 = java.lang.Double.doubleToLongBits(r2)
            double r0 = r8.A01(r12, r0)
            long r1 = java.lang.Double.doubleToLongBits(r0)
            goto L_0x0069
        L_0x0038:
            boolean r3 = r10.A0C(r5, r11)
            boolean r2 = r10.A0C(r5, r12)
            if (r3 != r2) goto L_0x00e0
            X.9CD r4 = X.AnonymousClass9CA.A01
            float r2 = r4.A02(r11, r0)
            int r3 = java.lang.Float.floatToIntBits(r2)
            float r0 = r4.A02(r12, r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x0097
        L_0x0055:
            boolean r3 = r10.A0C(r5, r11)
            boolean r2 = r10.A0C(r5, r12)
            if (r3 != r2) goto L_0x00e0
            X.9CD r2 = X.AnonymousClass9CA.A01
            long r3 = r2.A05(r11, r0)
            long r1 = r2.A05(r12, r0)
        L_0x0069:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00e0
            goto L_0x0018
        L_0x006e:
            boolean r3 = r10.A0C(r5, r11)
            boolean r2 = r10.A0C(r5, r12)
            if (r3 != r2) goto L_0x00e0
            X.9CD r2 = X.AnonymousClass9CA.A01
            int r3 = r2.A04(r11, r0)
            int r0 = r2.A04(r12, r0)
            goto L_0x0097
        L_0x0083:
            boolean r3 = r10.A0C(r5, r11)
            boolean r2 = r10.A0C(r5, r12)
            if (r3 != r2) goto L_0x00e0
            X.9CD r2 = X.AnonymousClass9CA.A01
            boolean r3 = r2.A0I(r11, r0)
            boolean r0 = r2.A0I(r12, r0)
        L_0x0097:
            if (r3 != r0) goto L_0x00e0
            goto L_0x0018
        L_0x009b:
            boolean r8 = r10.A0C(r5, r11)
            boolean r2 = r10.A0C(r5, r12)
            goto L_0x00b7
        L_0x00a4:
            int r2 = r5 + 2
            r3 = r7[r2]
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            long r2 = (long) r3
            X.9CD r4 = X.AnonymousClass9CA.A01
            int r8 = r4.A04(r11, r2)
            int r2 = r4.A04(r12, r2)
        L_0x00b7:
            if (r8 != r2) goto L_0x00e0
        L_0x00b9:
            X.9CD r3 = X.AnonymousClass9CA.A01
            java.lang.Object r2 = r3.A06(r11, r0)
            java.lang.Object r1 = r3.A06(r12, r0)
            X.9C0 r0 = X.C374949Bl.A01
            if (r2 == r1) goto L_0x0018
            if (r2 == 0) goto L_0x00e0
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x00e0
            goto L_0x0018
        L_0x00d1:
            X.972 r11 = (X.AnonymousClass972) r11
            X.975 r1 = r11.unknownFields
            X.972 r12 = (X.AnonymousClass972) r12
            X.975 r0 = r12.unknownFields
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e0
            r9 = 1
        L_0x00e0:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9C9.ASr(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v75, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v41, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v82, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v85, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v46, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v47, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v96, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v97, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v98, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v99, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v49, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v103, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v104, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v105, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v106, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v52, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v53, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v56, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v59, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v61, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v62, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v127, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v63, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v130, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v64, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v65, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v66, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v67, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v139, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v68, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v142, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v71, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v41, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v72, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v73, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v74, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v75, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v76, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v77, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v78, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v79, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v81, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v83, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v84, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v85, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v86, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v87, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v45, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v88, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v46, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v89, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v47, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v75, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v76, resolved type: java.lang.String} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04a0, code lost:
        r8 = r8 * r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x05aa, code lost:
        if (r1 >= 0) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0611, code lost:
        if ((r1 instanceof X.AnonymousClass97R) == false) goto L_0x0627;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0613, code lost:
        r9 = X.C384019gd.A00(r4 << 3);
        r1 = ((X.AnonymousClass97R) r1).A02();
        r9 = r9 + (X.C384019gd.A00(r1) + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0627, code lost:
        r1 = (java.lang.String) r1;
        r9 = X.C384019gd.A00(r4 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x062f, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:?, code lost:
        r1 = X.AnonymousClass9CG.A00(r1);
        r1 = r1;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0634, code lost:
        r1 = r1.getBytes(X.AnonymousClass97S.A04).length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0647, code lost:
        if (r0 == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0649, code lost:
        r9 = X.C384019gd.A00(r4 << 3) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0657, code lost:
        if (r0 == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0659, code lost:
        r9 = X.C384019gd.A00(r4 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0681, code lost:
        if (r1 >= 0) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0683, code lost:
        r8 = X.C384019gd.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0688, code lost:
        r8 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x06b4, code lost:
        r9 = r9 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x014b, code lost:
        r1 = A01(r13, r0);
        r9 = X.C384019gd.A00(r4 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0155, code lost:
        if (r1 < 0) goto L_0x0688;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0166, code lost:
        r5 = ((java.lang.Number) X.AnonymousClass9CA.A01.A06(r13, r0)).longValue();
        r9 = X.C384019gd.A00(r4 << 3);
        r8 = X.C384019gd.A01(r5);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x003d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int Bsa(java.lang.Object r19) {
        /*
            r18 = this;
            r13 = r19
            sun.misc.Unsafe r3 = A0E
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r15 = 1048575(0xfffff, float:1.469367E-39)
            r16 = 0
            r14 = 0
            r11 = 0
        L_0x000e:
            r12 = r18
            int[] r1 = r12.A06
            int r0 = r1.length
            if (r14 >= r0) goto L_0x06e1
            int r0 = r14 + 1
            r5 = r1[r0]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r5
            int r6 = r0 >>> 20
            r4 = r1[r14]
            int r0 = r14 + 2
            r9 = r1[r0]
            r7 = r9 & r2
            r0 = 17
            r8 = 1
            if (r6 > r0) goto L_0x06dd
            if (r7 == r15) goto L_0x0032
            if (r7 != r2) goto L_0x06d6
            r16 = 0
        L_0x0031:
            r15 = r7
        L_0x0032:
            int r0 = r9 >>> 20
            int r17 = r8 << r0
        L_0x0036:
            r5 = r5 & r2
            long r0 = (long) r5
            X.XR0[] r5 = X.XR0.A01
            switch(r6) {
                case 0: goto L_0x06c5;
                case 1: goto L_0x06b6;
                case 2: goto L_0x06a0;
                case 3: goto L_0x068b;
                case 4: goto L_0x0671;
                case 5: goto L_0x0662;
                case 6: goto L_0x0653;
                case 7: goto L_0x0643;
                case 8: goto L_0x0605;
                case 9: goto L_0x05e2;
                case 10: goto L_0x05c4;
                case 11: goto L_0x05ae;
                case 12: goto L_0x059a;
                case 13: goto L_0x058a;
                case 14: goto L_0x057a;
                case 15: goto L_0x055f;
                case 16: goto L_0x0543;
                case 17: goto L_0x0525;
                case 18: goto L_0x0509;
                case 19: goto L_0x04ee;
                case 20: goto L_0x04b7;
                case 21: goto L_0x0484;
                case 22: goto L_0x046b;
                case 23: goto L_0x0509;
                case 24: goto L_0x04ee;
                case 25: goto L_0x0452;
                case 26: goto L_0x03e6;
                case 27: goto L_0x03b7;
                case 28: goto L_0x0388;
                case 29: goto L_0x0356;
                case 30: goto L_0x033c;
                case 31: goto L_0x04ee;
                case 32: goto L_0x0509;
                case 33: goto L_0x0305;
                case 34: goto L_0x02eb;
                case 35: goto L_0x02cd;
                case 36: goto L_0x02be;
                case 37: goto L_0x029a;
                case 38: goto L_0x0276;
                case 39: goto L_0x026b;
                case 40: goto L_0x02cd;
                case 41: goto L_0x02be;
                case 42: goto L_0x025e;
                case 43: goto L_0x023a;
                case 44: goto L_0x022e;
                case 45: goto L_0x02be;
                case 46: goto L_0x02cd;
                case 47: goto L_0x0205;
                case 48: goto L_0x01f9;
                case 49: goto L_0x01cc;
                case 50: goto L_0x019e;
                case 51: goto L_0x018e;
                case 52: goto L_0x017e;
                case 53: goto L_0x0160;
                case 54: goto L_0x0159;
                case 55: goto L_0x0145;
                case 56: goto L_0x0135;
                case 57: goto L_0x012f;
                case 58: goto L_0x0129;
                case 59: goto L_0x011d;
                case 60: goto L_0x00f9;
                case 61: goto L_0x00db;
                case 62: goto L_0x00c5;
                case 63: goto L_0x00bd;
                case 64: goto L_0x00ad;
                case 65: goto L_0x009d;
                case 66: goto L_0x0082;
                case 67: goto L_0x005e;
                case 68: goto L_0x0040;
                default: goto L_0x003d;
            }
        L_0x003d:
            int r14 = r14 + 3
            goto L_0x000e
        L_0x0040:
            boolean r5 = r12.A0E(r13, r4, r14)
            if (r5 == 0) goto L_0x003d
            java.lang.Object r5 = r3.getObject(r13, r0)
            X.973 r5 = (X.AnonymousClass973) r5
            X.9Bg r1 = r12.A03(r14)
            int r0 = r4 << 3
            int r0 = X.C384019gd.A00(r0)
            int r9 = r0 * 2
            int r8 = r5.A09(r1)
            goto L_0x06b4
        L_0x005e:
            boolean r5 = r12.A0E(r13, r4, r14)
            if (r5 == 0) goto L_0x003d
            X.9CD r5 = X.AnonymousClass9CA.A01
            java.lang.Object r0 = r5.A06(r13, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r6 = r0.longValue()
            int r0 = r4 << 3
            int r9 = X.C384019gd.A00(r0)
            long r4 = r6 << r8
            r0 = 63
            long r6 = r6 >> r0
            long r6 = r6 ^ r4
            int r8 = X.C384019gd.A01(r6)
            goto L_0x06b4
        L_0x0082:
            boolean r5 = r12.A0E(r13, r4, r14)
            if (r5 == 0) goto L_0x003d
            int r5 = A01(r13, r0)
            int r0 = r4 << 3
            int r9 = X.C384019gd.A00(r0)
            int r1 = r5 << 1
            int r0 = r5 >> 31
            r0 = r0 ^ r1
            int r8 = X.C384019gd.A00(r0)
            goto L_0x06b4
        L_0x009d:
            boolean r0 = r12.A0E(r13, r4, r14)
            if (r0 == 0) goto L_0x003d
            int r0 = r4 << 3
            int r0 = X.C384019gd.A00(r0)
            int r9 = r0 + 8
            goto L_0x06d3
        L_0x00ad:
            boolean r0 = r12.A0E(r13, r4, r14)
            if (r0 == 0) goto L_0x003d
            int r0 = r4 << 3
            int r0 = X.C384019gd.A00(r0)
            int r9 = r0 + 4
            goto L_0x06d3
        L_0x00bd:
            boolean r5 = r12.A0E(r13, r4, r14)
            if (r5 == 0) goto L_0x003d
            goto L_0x014b
        L_0x00c5:
            boolean r5 = r12.A0E(r13, r4, r14)
            if (r5 == 0) goto L_0x003d
            int r1 = A01(r13, r0)
            int r0 = r4 << 3
            int r9 = X.C384019gd.A00(r0)
            int r8 = X.C384019gd.A00(r1)
            goto L_0x06b4
        L_0x00db:
            boolean r5 = r12.A0E(r13, r4, r14)
            if (r5 == 0) goto L_0x003d
            java.lang.Object r1 = r3.getObject(r13, r0)
            X.97R r1 = (X.AnonymousClass97R) r1
            int r0 = r4 << 3
            int r9 = X.C384019gd.A00(r0)
            int r1 = r1.A02()
            int r0 = X.C384019gd.A00(r1)
            int r0 = r0 + r1
            int r9 = r9 + r0
            goto L_0x06d3
        L_0x00f9:
            boolean r5 = r12.A0E(r13, r4, r14)
            if (r5 == 0) goto L_0x003d
            java.lang.Object r5 = r3.getObject(r13, r0)
            X.9Bg r1 = r12.A03(r14)
            X.9C0 r0 = X.C374949Bl.A01
            X.973 r5 = (X.AnonymousClass973) r5
            int r0 = r4 << 3
            int r9 = X.C384019gd.A00(r0)
            int r1 = r5.A09(r1)
            int r0 = X.C384019gd.A00(r1)
            int r0 = r0 + r1
            int r9 = r9 + r0
            goto L_0x06d3
        L_0x011d:
            boolean r5 = r12.A0E(r13, r4, r14)
            if (r5 == 0) goto L_0x003d
            java.lang.Object r1 = r3.getObject(r13, r0)
            goto L_0x060f
        L_0x0129:
            boolean r0 = r12.A0E(r13, r4, r14)
            goto L_0x0647
        L_0x012f:
            boolean r0 = r12.A0E(r13, r4, r14)
            goto L_0x0657
        L_0x0135:
            boolean r0 = r12.A0E(r13, r4, r14)
            if (r0 == 0) goto L_0x003d
            int r0 = r4 << 3
            int r0 = X.C384019gd.A00(r0)
            int r9 = r0 + 8
            goto L_0x06d3
        L_0x0145:
            boolean r5 = r12.A0E(r13, r4, r14)
            if (r5 == 0) goto L_0x003d
        L_0x014b:
            int r1 = A01(r13, r0)
            int r0 = r4 << 3
            int r9 = X.C384019gd.A00(r0)
            if (r1 < 0) goto L_0x0688
            goto L_0x0683
        L_0x0159:
            boolean r5 = r12.A0E(r13, r4, r14)
            if (r5 == 0) goto L_0x003d
            goto L_0x0166
        L_0x0160:
            boolean r5 = r12.A0E(r13, r4, r14)
            if (r5 == 0) goto L_0x003d
        L_0x0166:
            X.9CD r5 = X.AnonymousClass9CA.A01
            java.lang.Object r0 = r5.A06(r13, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r5 = r0.longValue()
            int r0 = r4 << 3
            int r9 = X.C384019gd.A00(r0)
            int r8 = X.C384019gd.A01(r5)
            goto L_0x06b4
        L_0x017e:
            boolean r0 = r12.A0E(r13, r4, r14)
            if (r0 == 0) goto L_0x003d
            int r0 = r4 << 3
            int r0 = X.C384019gd.A00(r0)
            int r9 = r0 + 4
            goto L_0x06d3
        L_0x018e:
            boolean r0 = r12.A0E(r13, r4, r14)
            if (r0 == 0) goto L_0x003d
            int r0 = r4 << 3
            int r0 = X.C384019gd.A00(r0)
            int r9 = r0 + 8
            goto L_0x06d3
        L_0x019e:
            java.lang.Object r1 = r3.getObject(r13, r0)
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0522
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0522
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r0.getKey()
            r0.getValue()
            java.lang.String r1 = "computeMessageSize"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x01cc:
            java.lang.Object r7 = r3.getObject(r13, r0)
            java.util.List r7 = (java.util.List) r7
            X.9Bg r8 = r12.A03(r14)
            X.9C0 r0 = X.C374949Bl.A01
            int r6 = r7.size()
            r5 = 0
            if (r6 == 0) goto L_0x0522
            r9 = 0
        L_0x01e0:
            if (r5 >= r6) goto L_0x06d3
            java.lang.Object r10 = r7.get(r5)
            X.973 r10 = (X.AnonymousClass973) r10
            int r0 = r4 << 3
            int r0 = X.C384019gd.A00(r0)
            int r1 = r0 * 2
            int r0 = r10.A09(r8)
            int r1 = r1 + r0
            int r9 = r9 + r1
            int r5 = r5 + 1
            goto L_0x01e0
        L_0x01f9:
            java.lang.Object r0 = r3.getObject(r13, r0)
            java.util.List r0 = (java.util.List) r0
            int r8 = X.C374949Bl.A02(r0)
            goto L_0x02db
        L_0x0205:
            java.lang.Object r7 = r3.getObject(r13, r0)
            java.util.List r7 = (java.util.List) r7
            X.9C0 r0 = X.C374949Bl.A01
            int r6 = r7.size()
            r5 = 0
            if (r6 == 0) goto L_0x003d
            r8 = 0
        L_0x0215:
            if (r5 >= r6) goto L_0x02db
            java.lang.Object r0 = r7.get(r5)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r1 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            int r0 = X.C384019gd.A00(r0)
            int r8 = r8 + r0
            int r5 = r5 + 1
            goto L_0x0215
        L_0x022e:
            java.lang.Object r0 = r3.getObject(r13, r0)
            java.util.List r0 = (java.util.List) r0
            int r8 = X.C374949Bl.A00(r0)
            goto L_0x02db
        L_0x023a:
            java.lang.Object r6 = r3.getObject(r13, r0)
            java.util.List r6 = (java.util.List) r6
            X.9C0 r0 = X.C374949Bl.A01
            int r5 = r6.size()
            r1 = 0
            if (r5 == 0) goto L_0x003d
            r8 = 0
        L_0x024a:
            if (r1 >= r5) goto L_0x02db
            java.lang.Object r0 = r6.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = X.C384019gd.A00(r0)
            int r8 = r8 + r0
            int r1 = r1 + 1
            goto L_0x024a
        L_0x025e:
            java.lang.Object r1 = r3.getObject(r13, r0)
            java.util.List r1 = (java.util.List) r1
            X.9C0 r0 = X.C374949Bl.A01
            int r8 = r1.size()
            goto L_0x02db
        L_0x026b:
            java.lang.Object r0 = r3.getObject(r13, r0)
            java.util.List r0 = (java.util.List) r0
            int r8 = X.C374949Bl.A01(r0)
            goto L_0x02db
        L_0x0276:
            java.lang.Object r7 = r3.getObject(r13, r0)
            java.util.List r7 = (java.util.List) r7
            X.9C0 r0 = X.C374949Bl.A01
            int r6 = r7.size()
            r5 = 0
            if (r6 == 0) goto L_0x003d
            r8 = 0
        L_0x0286:
            if (r5 >= r6) goto L_0x02db
            java.lang.Object r0 = r7.get(r5)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            int r0 = X.C384019gd.A01(r0)
            int r8 = r8 + r0
            int r5 = r5 + 1
            goto L_0x0286
        L_0x029a:
            java.lang.Object r7 = r3.getObject(r13, r0)
            java.util.List r7 = (java.util.List) r7
            X.9C0 r0 = X.C374949Bl.A01
            int r6 = r7.size()
            r5 = 0
            if (r6 == 0) goto L_0x003d
            r8 = 0
        L_0x02aa:
            if (r5 >= r6) goto L_0x02db
            java.lang.Object r0 = r7.get(r5)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            int r0 = X.C384019gd.A01(r0)
            int r8 = r8 + r0
            int r5 = r5 + 1
            goto L_0x02aa
        L_0x02be:
            java.lang.Object r1 = r3.getObject(r13, r0)
            java.util.List r1 = (java.util.List) r1
            X.9C0 r0 = X.C374949Bl.A01
            int r0 = r1.size()
            int r8 = r0 * 4
            goto L_0x02db
        L_0x02cd:
            java.lang.Object r1 = r3.getObject(r13, r0)
            java.util.List r1 = (java.util.List) r1
            X.9C0 r0 = X.C374949Bl.A01
            int r0 = r1.size()
            int r8 = r0 * 8
        L_0x02db:
            if (r8 <= 0) goto L_0x003d
            int r0 = r4 << 3
            int r9 = X.C384019gd.A00(r0)
            int r0 = X.C384019gd.A00(r8)
            int r9 = r9 + r0
            int r9 = r9 + r8
            goto L_0x06d3
        L_0x02eb:
            java.lang.Object r1 = r3.getObject(r13, r0)
            java.util.List r1 = (java.util.List) r1
            X.9C0 r0 = X.C374949Bl.A01
            int r8 = r1.size()
            if (r8 == 0) goto L_0x0522
            int r9 = X.C374949Bl.A02(r1)
            int r0 = r4 << 3
            int r0 = X.C384019gd.A00(r0)
            goto L_0x04a0
        L_0x0305:
            java.lang.Object r7 = r3.getObject(r13, r0)
            java.util.List r7 = (java.util.List) r7
            X.9C0 r0 = X.C374949Bl.A01
            int r8 = r7.size()
            if (r8 == 0) goto L_0x0522
            int r6 = r7.size()
            r5 = 0
            r9 = 0
            if (r6 != 0) goto L_0x0323
        L_0x031b:
            int r0 = r4 << 3
            int r0 = X.C384019gd.A00(r0)
            goto L_0x04a0
        L_0x0323:
            if (r5 >= r6) goto L_0x031b
            java.lang.Object r0 = r7.get(r5)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r1 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            int r0 = X.C384019gd.A00(r0)
            int r9 = r9 + r0
            int r5 = r5 + 1
            goto L_0x0323
        L_0x033c:
            java.lang.Object r1 = r3.getObject(r13, r0)
            java.util.List r1 = (java.util.List) r1
            X.9C0 r0 = X.C374949Bl.A01
            int r8 = r1.size()
            if (r8 == 0) goto L_0x0522
            int r9 = X.C374949Bl.A00(r1)
            int r0 = r4 << 3
            int r0 = X.C384019gd.A00(r0)
            goto L_0x04a0
        L_0x0356:
            java.lang.Object r6 = r3.getObject(r13, r0)
            java.util.List r6 = (java.util.List) r6
            X.9C0 r0 = X.C374949Bl.A01
            int r8 = r6.size()
            if (r8 == 0) goto L_0x0522
            int r5 = r6.size()
            r1 = 0
            r9 = 0
            if (r5 != 0) goto L_0x0374
        L_0x036c:
            int r0 = r4 << 3
            int r0 = X.C384019gd.A00(r0)
            goto L_0x04a0
        L_0x0374:
            if (r1 >= r5) goto L_0x036c
            java.lang.Object r0 = r6.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = X.C384019gd.A00(r0)
            int r9 = r9 + r0
            int r1 = r1 + 1
            goto L_0x0374
        L_0x0388:
            java.lang.Object r6 = r3.getObject(r13, r0)
            java.util.List r6 = (java.util.List) r6
            X.9C0 r0 = X.C374949Bl.A01
            int r9 = r6.size()
            r5 = 0
            if (r9 == 0) goto L_0x0522
            int r0 = r4 << 3
            int r0 = X.C384019gd.A00(r0)
            int r9 = r9 * r0
        L_0x039e:
            int r0 = r6.size()
            if (r5 >= r0) goto L_0x06d3
            java.lang.Object r0 = r6.get(r5)
            X.97R r0 = (X.AnonymousClass97R) r0
            int r1 = r0.A02()
            int r0 = X.C384019gd.A00(r1)
            int r0 = r0 + r1
            int r9 = r9 + r0
            int r5 = r5 + 1
            goto L_0x039e
        L_0x03b7:
            java.lang.Object r7 = r3.getObject(r13, r0)
            java.util.List r7 = (java.util.List) r7
            X.9Bg r8 = r12.A03(r14)
            X.9C0 r0 = X.C374949Bl.A01
            int r6 = r7.size()
            r5 = 0
            if (r6 == 0) goto L_0x0522
            int r0 = r4 << 3
            int r9 = X.C384019gd.A00(r0)
            int r9 = r9 * r6
        L_0x03d1:
            if (r5 >= r6) goto L_0x06d3
            java.lang.Object r0 = r7.get(r5)
            X.973 r0 = (X.AnonymousClass973) r0
            int r1 = r0.A09(r8)
            int r0 = X.C384019gd.A00(r1)
            int r0 = r0 + r1
            int r9 = r9 + r0
            int r5 = r5 + 1
            goto L_0x03d1
        L_0x03e6:
            java.lang.Object r7 = r3.getObject(r13, r0)
            java.util.List r7 = (java.util.List) r7
            X.9C0 r0 = X.C374949Bl.A01
            int r6 = r7.size()
            r5 = 0
            if (r6 == 0) goto L_0x0522
            int r0 = r4 << 3
            int r9 = X.C384019gd.A00(r0)
            int r9 = r9 * r6
            boolean r0 = r7 instanceof X.C41844B3l
            if (r0 == 0) goto L_0x042a
            X.B3l r7 = (X.C41844B3l) r7
        L_0x0402:
            if (r5 >= r6) goto L_0x06d3
            java.lang.Object r1 = r7.Bjc(r5)
            boolean r0 = r1 instanceof X.AnonymousClass97R
            if (r0 == 0) goto L_0x041b
            X.97R r1 = (X.AnonymousClass97R) r1
            int r0 = r1.A02()
        L_0x0412:
            int r1 = X.C384019gd.A00(r0)
            int r1 = r1 + r0
            int r9 = r9 + r1
            int r5 = r5 + 1
            goto L_0x0402
        L_0x041b:
            java.lang.String r1 = (java.lang.String) r1
            int r0 = X.AnonymousClass9CG.A00(r1)     // Catch:{ 9GS -> 0x0422 }
            goto L_0x0412
        L_0x0422:
            java.nio.charset.Charset r0 = X.AnonymousClass97S.A04
            byte[] r0 = r1.getBytes(r0)
            int r0 = r0.length
            goto L_0x0412
        L_0x042a:
            if (r5 >= r6) goto L_0x06d3
            java.lang.Object r1 = r7.get(r5)
            boolean r0 = r1 instanceof X.AnonymousClass97R
            if (r0 == 0) goto L_0x0443
            X.97R r1 = (X.AnonymousClass97R) r1
            int r0 = r1.A02()
        L_0x043a:
            int r1 = X.C384019gd.A00(r0)
            int r1 = r1 + r0
            int r9 = r9 + r1
            int r5 = r5 + 1
            goto L_0x042a
        L_0x0443:
            java.lang.String r1 = (java.lang.String) r1
            int r0 = X.AnonymousClass9CG.A00(r1)     // Catch:{ 9GS -> 0x044a }
            goto L_0x043a
        L_0x044a:
            java.nio.charset.Charset r0 = X.AnonymousClass97S.A04
            byte[] r0 = r1.getBytes(r0)
            int r0 = r0.length
            goto L_0x043a
        L_0x0452:
            java.lang.Object r1 = r3.getObject(r13, r0)
            java.util.List r1 = (java.util.List) r1
            X.9C0 r0 = X.C374949Bl.A01
            int r9 = r1.size()
            if (r9 == 0) goto L_0x0522
            int r0 = r4 << 3
            int r0 = X.C384019gd.A00(r0)
            int r0 = r0 + 1
            int r9 = r9 * r0
            goto L_0x06d3
        L_0x046b:
            java.lang.Object r1 = r3.getObject(r13, r0)
            java.util.List r1 = (java.util.List) r1
            X.9C0 r0 = X.C374949Bl.A01
            int r8 = r1.size()
            if (r8 == 0) goto L_0x0522
            int r9 = X.C374949Bl.A01(r1)
            int r0 = r4 << 3
            int r0 = X.C384019gd.A00(r0)
            goto L_0x04a0
        L_0x0484:
            java.lang.Object r7 = r3.getObject(r13, r0)
            java.util.List r7 = (java.util.List) r7
            X.9C0 r0 = X.C374949Bl.A01
            int r8 = r7.size()
            if (r8 == 0) goto L_0x0522
            int r6 = r7.size()
            r5 = 0
            r9 = 0
            if (r6 != 0) goto L_0x04a3
        L_0x049a:
            int r0 = r4 << 3
            int r0 = X.C384019gd.A00(r0)
        L_0x04a0:
            int r8 = r8 * r0
            goto L_0x06b4
        L_0x04a3:
            if (r5 >= r6) goto L_0x049a
            java.lang.Object r0 = r7.get(r5)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            int r0 = X.C384019gd.A01(r0)
            int r9 = r9 + r0
            int r5 = r5 + 1
            goto L_0x04a3
        L_0x04b7:
            java.lang.Object r7 = r3.getObject(r13, r0)
            java.util.List r7 = (java.util.List) r7
            X.9C0 r0 = X.C374949Bl.A01
            int r0 = r7.size()
            if (r0 == 0) goto L_0x0522
            int r6 = r7.size()
            r5 = 0
            r9 = 0
            if (r6 != 0) goto L_0x04da
        L_0x04cd:
            int r8 = r7.size()
            int r0 = r4 << 3
            int r0 = X.C384019gd.A00(r0)
            int r8 = r8 * r0
            goto L_0x06b4
        L_0x04da:
            if (r5 >= r6) goto L_0x04cd
            java.lang.Object r0 = r7.get(r5)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            int r0 = X.C384019gd.A01(r0)
            int r9 = r9 + r0
            int r5 = r5 + 1
            goto L_0x04da
        L_0x04ee:
            java.lang.Object r1 = r3.getObject(r13, r0)
            java.util.List r1 = (java.util.List) r1
            X.9C0 r0 = X.C374949Bl.A01
            int r1 = r1.size()
            r9 = 0
            if (r1 == 0) goto L_0x06d3
            int r0 = r4 << 3
            int r0 = X.C384019gd.A00(r0)
            int r0 = r0 + 4
            int r9 = r1 * r0
            goto L_0x06d3
        L_0x0509:
            java.lang.Object r1 = r3.getObject(r13, r0)
            java.util.List r1 = (java.util.List) r1
            X.9C0 r0 = X.C374949Bl.A01
            int r9 = r1.size()
            if (r9 == 0) goto L_0x0522
            int r0 = r4 << 3
            int r0 = X.C384019gd.A00(r0)
            int r0 = r0 + 8
            int r9 = r9 * r0
            goto L_0x06d3
        L_0x0522:
            r9 = 0
            goto L_0x06d3
        L_0x0525:
            boolean r5 = r12.A0F(r13, r14, r15, r16, r17)
            if (r5 == 0) goto L_0x003d
            java.lang.Object r5 = r3.getObject(r13, r0)
            X.973 r5 = (X.AnonymousClass973) r5
            X.9Bg r1 = r12.A03(r14)
            int r0 = r4 << 3
            int r0 = X.C384019gd.A00(r0)
            int r9 = r0 * 2
            int r8 = r5.A09(r1)
            goto L_0x06b4
        L_0x0543:
            boolean r5 = r12.A0F(r13, r14, r15, r16, r17)
            if (r5 == 0) goto L_0x003d
            long r6 = r3.getLong(r13, r0)
            int r0 = r4 << 3
            int r9 = X.C384019gd.A00(r0)
            long r4 = r6 << r8
            r0 = 63
            long r6 = r6 >> r0
            long r6 = r6 ^ r4
            int r8 = X.C384019gd.A01(r6)
            goto L_0x06b4
        L_0x055f:
            boolean r5 = r12.A0F(r13, r14, r15, r16, r17)
            if (r5 == 0) goto L_0x003d
            int r5 = r3.getInt(r13, r0)
            int r0 = r4 << 3
            int r9 = X.C384019gd.A00(r0)
            int r1 = r5 << 1
            int r0 = r5 >> 31
            r0 = r0 ^ r1
            int r8 = X.C384019gd.A00(r0)
            goto L_0x06b4
        L_0x057a:
            boolean r0 = r12.A0F(r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x003d
            int r0 = r4 << 3
            int r0 = X.C384019gd.A00(r0)
            int r9 = r0 + 8
            goto L_0x06d3
        L_0x058a:
            boolean r0 = r12.A0F(r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x003d
            int r0 = r4 << 3
            int r0 = X.C384019gd.A00(r0)
            int r9 = r0 + 4
            goto L_0x06d3
        L_0x059a:
            boolean r5 = r12.A0F(r13, r14, r15, r16, r17)
            if (r5 == 0) goto L_0x003d
            int r1 = r3.getInt(r13, r0)
            int r0 = r4 << 3
            int r9 = X.C384019gd.A00(r0)
            if (r1 < 0) goto L_0x0688
            goto L_0x0683
        L_0x05ae:
            boolean r5 = r12.A0F(r13, r14, r15, r16, r17)
            if (r5 == 0) goto L_0x003d
            int r1 = r3.getInt(r13, r0)
            int r0 = r4 << 3
            int r9 = X.C384019gd.A00(r0)
            int r8 = X.C384019gd.A00(r1)
            goto L_0x06b4
        L_0x05c4:
            boolean r5 = r12.A0F(r13, r14, r15, r16, r17)
            if (r5 == 0) goto L_0x003d
            java.lang.Object r1 = r3.getObject(r13, r0)
            X.97R r1 = (X.AnonymousClass97R) r1
            int r0 = r4 << 3
            int r9 = X.C384019gd.A00(r0)
            int r1 = r1.A02()
            int r0 = X.C384019gd.A00(r1)
            int r0 = r0 + r1
            int r9 = r9 + r0
            goto L_0x06d3
        L_0x05e2:
            boolean r5 = r12.A0F(r13, r14, r15, r16, r17)
            if (r5 == 0) goto L_0x003d
            java.lang.Object r5 = r3.getObject(r13, r0)
            X.9Bg r1 = r12.A03(r14)
            X.9C0 r0 = X.C374949Bl.A01
            X.973 r5 = (X.AnonymousClass973) r5
            int r0 = r4 << 3
            int r9 = X.C384019gd.A00(r0)
            int r0 = r5.A09(r1)
            int r8 = X.C384019gd.A00(r0)
            int r8 = r8 + r0
            goto L_0x06b4
        L_0x0605:
            boolean r5 = r12.A0F(r13, r14, r15, r16, r17)
            if (r5 == 0) goto L_0x003d
            java.lang.Object r1 = r3.getObject(r13, r0)
        L_0x060f:
            boolean r0 = r1 instanceof X.AnonymousClass97R
            if (r0 == 0) goto L_0x0627
            X.97R r1 = (X.AnonymousClass97R) r1
            int r0 = r4 << 3
            int r9 = X.C384019gd.A00(r0)
            int r1 = r1.A02()
            int r0 = X.C384019gd.A00(r1)
            int r0 = r0 + r1
            int r9 = r9 + r0
            goto L_0x06d3
        L_0x0627:
            java.lang.String r1 = (java.lang.String) r1
            int r0 = r4 << 3
            int r9 = X.C384019gd.A00(r0)
            int r1 = X.AnonymousClass9CG.A00(r1)     // Catch:{ 9GS -> 0x0634 }
            goto L_0x063b
        L_0x0634:
            java.nio.charset.Charset r0 = X.AnonymousClass97S.A04
            byte[] r0 = r1.getBytes(r0)
            int r1 = r0.length
        L_0x063b:
            int r0 = X.C384019gd.A00(r1)
            int r0 = r0 + r1
            int r9 = r9 + r0
            goto L_0x06d3
        L_0x0643:
            boolean r0 = r12.A0F(r13, r14, r15, r16, r17)
        L_0x0647:
            if (r0 == 0) goto L_0x003d
            int r0 = r4 << 3
            int r0 = X.C384019gd.A00(r0)
            int r9 = r0 + 1
            goto L_0x06d3
        L_0x0653:
            boolean r0 = r12.A0F(r13, r14, r15, r16, r17)
        L_0x0657:
            if (r0 == 0) goto L_0x003d
            int r0 = r4 << 3
            int r0 = X.C384019gd.A00(r0)
            int r9 = r0 + 4
            goto L_0x06d3
        L_0x0662:
            boolean r0 = r12.A0F(r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x003d
            int r0 = r4 << 3
            int r0 = X.C384019gd.A00(r0)
            int r9 = r0 + 8
            goto L_0x06d3
        L_0x0671:
            boolean r5 = r12.A0F(r13, r14, r15, r16, r17)
            if (r5 == 0) goto L_0x003d
            int r1 = r3.getInt(r13, r0)
            int r0 = r4 << 3
            int r9 = X.C384019gd.A00(r0)
            if (r1 < 0) goto L_0x0688
        L_0x0683:
            int r8 = X.C384019gd.A00(r1)
            goto L_0x06b4
        L_0x0688:
            r8 = 10
            goto L_0x06b4
        L_0x068b:
            boolean r5 = r12.A0F(r13, r14, r15, r16, r17)
            if (r5 == 0) goto L_0x003d
            long r5 = r3.getLong(r13, r0)
            int r0 = r4 << 3
            int r9 = X.C384019gd.A00(r0)
            int r8 = X.C384019gd.A01(r5)
            goto L_0x06b4
        L_0x06a0:
            boolean r5 = r12.A0F(r13, r14, r15, r16, r17)
            if (r5 == 0) goto L_0x003d
            long r5 = r3.getLong(r13, r0)
            int r0 = r4 << 3
            int r9 = X.C384019gd.A00(r0)
            int r8 = X.C384019gd.A01(r5)
        L_0x06b4:
            int r9 = r9 + r8
            goto L_0x06d3
        L_0x06b6:
            boolean r0 = r12.A0F(r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x003d
            int r0 = r4 << 3
            int r0 = X.C384019gd.A00(r0)
            int r9 = r0 + 4
            goto L_0x06d3
        L_0x06c5:
            boolean r0 = r12.A0F(r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x003d
            int r0 = r4 << 3
            int r0 = X.C384019gd.A00(r0)
            int r9 = r0 + 8
        L_0x06d3:
            int r11 = r11 + r9
            goto L_0x003d
        L_0x06d6:
            long r0 = (long) r7
            int r16 = r3.getInt(r13, r0)
            goto L_0x0031
        L_0x06dd:
            r17 = 0
            goto L_0x0036
        L_0x06e1:
            X.972 r13 = (X.AnonymousClass972) r13
            X.975 r0 = r13.unknownFields
            int r0 = r0.A01()
            int r11 = r11 + r0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9C9.Bsa(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        r7 = r7 * 53;
        r0 = X.AnonymousClass9CA.A01.A06(r10, r1).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        r7 = r7 * 53;
        r0 = ((java.lang.String) X.AnonymousClass9CA.A01.A06(r10, r1)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c7, code lost:
        r0 = X.AnonymousClass97S.A04;
        r0 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cb, code lost:
        if (r1 == false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cd, code lost:
        r0 = 1231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f7, code lost:
        r2 = java.lang.Double.doubleToLongBits(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fb, code lost:
        r0 = X.AnonymousClass97S.A04;
        r0 = (int) (r2 ^ (r2 >>> 32));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0103, code lost:
        r7 = r7 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
        r4 = r4 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int CL6(java.lang.Object r10) {
        /*
            r9 = this;
            int[] r6 = r9.A06
            int r5 = r6.length
            r4 = 0
            r7 = 0
        L_0x0005:
            if (r4 >= r5) goto L_0x0106
            int r0 = r4 + 1
            r3 = r6[r0]
            r8 = r6[r4]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r3
            long r1 = (long) r0
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r0
            int r0 = r3 >>> 20
            r3 = 37
            switch(r0) {
                case 0: goto L_0x00ef;
                case 1: goto L_0x00e2;
                case 2: goto L_0x00d9;
                case 3: goto L_0x00d9;
                case 4: goto L_0x00d0;
                case 5: goto L_0x00d9;
                case 6: goto L_0x00d0;
                case 7: goto L_0x00bf;
                case 8: goto L_0x0049;
                case 9: goto L_0x001f;
                case 10: goto L_0x0035;
                case 11: goto L_0x00d0;
                case 12: goto L_0x00d0;
                case 13: goto L_0x00d0;
                case 14: goto L_0x00d9;
                case 15: goto L_0x00d0;
                case 16: goto L_0x00d9;
                case 17: goto L_0x001f;
                case 18: goto L_0x0035;
                case 19: goto L_0x0035;
                case 20: goto L_0x0035;
                case 21: goto L_0x0035;
                case 22: goto L_0x0035;
                case 23: goto L_0x0035;
                case 24: goto L_0x0035;
                case 25: goto L_0x0035;
                case 26: goto L_0x0035;
                case 27: goto L_0x0035;
                case 28: goto L_0x0035;
                case 29: goto L_0x0035;
                case 30: goto L_0x0035;
                case 31: goto L_0x0035;
                case 32: goto L_0x0035;
                case 33: goto L_0x0035;
                case 34: goto L_0x0035;
                case 35: goto L_0x0035;
                case 36: goto L_0x0035;
                case 37: goto L_0x0035;
                case 38: goto L_0x0035;
                case 39: goto L_0x0035;
                case 40: goto L_0x0035;
                case 41: goto L_0x0035;
                case 42: goto L_0x0035;
                case 43: goto L_0x0035;
                case 44: goto L_0x0035;
                case 45: goto L_0x0035;
                case 46: goto L_0x0035;
                case 47: goto L_0x0035;
                case 48: goto L_0x0035;
                case 49: goto L_0x0035;
                case 50: goto L_0x0035;
                case 51: goto L_0x00aa;
                case 52: goto L_0x0091;
                case 53: goto L_0x007c;
                case 54: goto L_0x007c;
                case 55: goto L_0x006e;
                case 56: goto L_0x007c;
                case 57: goto L_0x006e;
                case 58: goto L_0x0059;
                case 59: goto L_0x0043;
                case 60: goto L_0x002f;
                case 61: goto L_0x002f;
                case 62: goto L_0x006e;
                case 63: goto L_0x006e;
                case 64: goto L_0x006e;
                case 65: goto L_0x007c;
                case 66: goto L_0x006e;
                case 67: goto L_0x007c;
                case 68: goto L_0x002f;
                default: goto L_0x001c;
            }
        L_0x001c:
            int r4 = r4 + 3
            goto L_0x0005
        L_0x001f:
            X.9CD r0 = X.AnonymousClass9CA.A01
            java.lang.Object r0 = r0.A06(r10, r1)
            if (r0 == 0) goto L_0x002b
            int r3 = r0.hashCode()
        L_0x002b:
            int r7 = r7 * 53
            int r7 = r7 + r3
            goto L_0x001c
        L_0x002f:
            boolean r0 = r9.A0E(r10, r8, r4)
            if (r0 == 0) goto L_0x001c
        L_0x0035:
            int r7 = r7 * 53
            X.9CD r0 = X.AnonymousClass9CA.A01
            java.lang.Object r0 = r0.A06(r10, r1)
            int r0 = r0.hashCode()
            goto L_0x0103
        L_0x0043:
            boolean r0 = r9.A0E(r10, r8, r4)
            if (r0 == 0) goto L_0x001c
        L_0x0049:
            int r7 = r7 * 53
            X.9CD r0 = X.AnonymousClass9CA.A01
            java.lang.Object r0 = r0.A06(r10, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.hashCode()
            goto L_0x0103
        L_0x0059:
            boolean r0 = r9.A0E(r10, r8, r4)
            if (r0 == 0) goto L_0x001c
            int r7 = r7 * 53
            X.9CD r0 = X.AnonymousClass9CA.A01
            java.lang.Object r0 = r0.A06(r10, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            goto L_0x00c7
        L_0x006e:
            boolean r0 = r9.A0E(r10, r8, r4)
            if (r0 == 0) goto L_0x001c
            int r7 = r7 * 53
            int r0 = A01(r10, r1)
            goto L_0x0103
        L_0x007c:
            boolean r0 = r9.A0E(r10, r8, r4)
            if (r0 == 0) goto L_0x001c
            int r7 = r7 * 53
            X.9CD r0 = X.AnonymousClass9CA.A01
            java.lang.Object r0 = r0.A06(r10, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            goto L_0x00fb
        L_0x0091:
            boolean r0 = r9.A0E(r10, r8, r4)
            if (r0 == 0) goto L_0x001c
            int r7 = r7 * 53
            X.9CD r0 = X.AnonymousClass9CA.A01
            java.lang.Object r0 = r0.A06(r10, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x0103
        L_0x00aa:
            boolean r0 = r9.A0E(r10, r8, r4)
            if (r0 == 0) goto L_0x001c
            int r7 = r7 * 53
            X.9CD r0 = X.AnonymousClass9CA.A01
            java.lang.Object r0 = r0.A06(r10, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            goto L_0x00f7
        L_0x00bf:
            int r7 = r7 * 53
            X.9CD r0 = X.AnonymousClass9CA.A01
            boolean r1 = r0.A0I(r10, r1)
        L_0x00c7:
            java.nio.charset.Charset r0 = X.AnonymousClass97S.A04
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x0103
            r0 = 1231(0x4cf, float:1.725E-42)
            goto L_0x0103
        L_0x00d0:
            int r7 = r7 * 53
            X.9CD r0 = X.AnonymousClass9CA.A01
            int r0 = r0.A04(r10, r1)
            goto L_0x0103
        L_0x00d9:
            int r7 = r7 * 53
            X.9CD r0 = X.AnonymousClass9CA.A01
            long r2 = r0.A05(r10, r1)
            goto L_0x00fb
        L_0x00e2:
            int r7 = r7 * 53
            X.9CD r0 = X.AnonymousClass9CA.A01
            float r0 = r0.A02(r10, r1)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x0103
        L_0x00ef:
            int r7 = r7 * 53
            X.9CD r0 = X.AnonymousClass9CA.A01
            double r0 = r0.A01(r10, r1)
        L_0x00f7:
            long r2 = java.lang.Double.doubleToLongBits(r0)
        L_0x00fb:
            java.nio.charset.Charset r0 = X.AnonymousClass97S.A04
            r0 = 32
            long r0 = r2 >>> r0
            long r2 = r2 ^ r0
            int r0 = (int) r2
        L_0x0103:
            int r7 = r7 + r0
            goto L_0x001c
        L_0x0106:
            int r1 = r7 * 53
            X.972 r10 = (X.AnonymousClass972) r10
            X.975 r0 = r10.unknownFields
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9C9.CL6(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012f, code lost:
        X.AnonymousClass9CA.A04(r10, (long) (r4[r3 + 2] & 1048575), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x018a, code lost:
        A0A(r10, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Co5(java.lang.Object r16, java.lang.Object r17) {
        /*
            r15 = this;
            r10 = r16
            A09(r10)
            r2 = r17
            r2.getClass()
            r3 = 0
        L_0x000b:
            int[] r4 = r15.A06
            int r0 = r4.length
            if (r3 >= r0) goto L_0x01f6
            int r5 = r3 + 1
            r1 = r4[r5]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            long r11 = (long) r0
            r6 = r4[r3]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r1 = r1 & r0
            int r0 = r1 >>> 20
            switch(r0) {
                case 0: goto L_0x00f6;
                case 1: goto L_0x00e5;
                case 2: goto L_0x00d4;
                case 3: goto L_0x00d4;
                case 4: goto L_0x00c3;
                case 5: goto L_0x00d4;
                case 6: goto L_0x00c3;
                case 7: goto L_0x00b2;
                case 8: goto L_0x00a1;
                case 9: goto L_0x0162;
                case 10: goto L_0x00a1;
                case 11: goto L_0x00c3;
                case 12: goto L_0x00c3;
                case 13: goto L_0x00c3;
                case 14: goto L_0x00d4;
                case 15: goto L_0x00c3;
                case 16: goto L_0x00d4;
                case 17: goto L_0x0162;
                case 18: goto L_0x004b;
                case 19: goto L_0x004b;
                case 20: goto L_0x004b;
                case 21: goto L_0x004b;
                case 22: goto L_0x004b;
                case 23: goto L_0x004b;
                case 24: goto L_0x004b;
                case 25: goto L_0x004b;
                case 26: goto L_0x004b;
                case 27: goto L_0x004b;
                case 28: goto L_0x004b;
                case 29: goto L_0x004b;
                case 30: goto L_0x004b;
                case 31: goto L_0x004b;
                case 32: goto L_0x004b;
                case 33: goto L_0x004b;
                case 34: goto L_0x004b;
                case 35: goto L_0x004b;
                case 36: goto L_0x004b;
                case 37: goto L_0x004b;
                case 38: goto L_0x004b;
                case 39: goto L_0x004b;
                case 40: goto L_0x004b;
                case 41: goto L_0x004b;
                case 42: goto L_0x004b;
                case 43: goto L_0x004b;
                case 44: goto L_0x004b;
                case 45: goto L_0x004b;
                case 46: goto L_0x004b;
                case 47: goto L_0x004b;
                case 48: goto L_0x004b;
                case 49: goto L_0x004b;
                case 50: goto L_0x0037;
                case 51: goto L_0x0026;
                case 52: goto L_0x0026;
                case 53: goto L_0x0026;
                case 54: goto L_0x0026;
                case 55: goto L_0x0026;
                case 56: goto L_0x0026;
                case 57: goto L_0x0026;
                case 58: goto L_0x0026;
                case 59: goto L_0x0026;
                case 60: goto L_0x0107;
                case 61: goto L_0x0026;
                case 62: goto L_0x0026;
                case 63: goto L_0x0026;
                case 64: goto L_0x0026;
                case 65: goto L_0x0026;
                case 66: goto L_0x0026;
                case 67: goto L_0x0026;
                case 68: goto L_0x0107;
                default: goto L_0x0023;
            }
        L_0x0023:
            int r3 = r3 + 3
            goto L_0x000b
        L_0x0026:
            boolean r0 = r15.A0E(r2, r6, r3)
            if (r0 == 0) goto L_0x0023
            X.9CD r0 = X.AnonymousClass9CA.A01
            java.lang.Object r0 = r0.A06(r2, r11)
            X.AnonymousClass9CA.A05(r10, r11, r0)
            goto L_0x012f
        L_0x0037:
            X.9C0 r0 = X.C374949Bl.A01
            X.9CD r0 = X.AnonymousClass9CA.A01
            java.lang.Object r1 = r0.A06(r10, r11)
            java.lang.Object r0 = r0.A06(r2, r11)
            X.Avf r0 = X.AnonymousClass9C8.A00(r1, r0)
            X.AnonymousClass9CA.A05(r10, r11, r0)
            goto L_0x0023
        L_0x004b:
            X.9C4 r0 = r15.A05
            boolean r1 = r0 instanceof X.AnonymousClass9C6
            X.9CD r0 = X.AnonymousClass9CA.A01
            if (r1 == 0) goto L_0x007f
            java.lang.Object r6 = r0.A06(r10, r11)
            X.978 r6 = (X.AnonymousClass978) r6
            java.lang.Object r5 = r0.A06(r2, r11)
            java.util.List r5 = (java.util.List) r5
            int r4 = r6.size()
            int r1 = r5.size()
            if (r4 <= 0) goto L_0x007b
            if (r1 <= 0) goto L_0x007a
            r0 = r6
            X.977 r0 = (X.AnonymousClass977) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0077
            int r1 = r1 + r4
            X.978 r6 = r6.Coo(r1)
        L_0x0077:
            r6.addAll(r5)
        L_0x007a:
            r5 = r6
        L_0x007b:
            X.AnonymousClass9CA.A05(r10, r11, r5)
            goto L_0x0023
        L_0x007f:
            java.lang.Object r5 = r0.A06(r2, r11)
            java.util.List r5 = (java.util.List) r5
            int r0 = r5.size()
            java.util.List r4 = X.AnonymousClass9C5.A00(r10, r0, r11)
            int r1 = r4.size()
            int r0 = r5.size()
            if (r1 <= 0) goto L_0x009d
            if (r0 <= 0) goto L_0x009c
            r4.addAll(r5)
        L_0x009c:
            r5 = r4
        L_0x009d:
            X.AnonymousClass9CA.A05(r10, r11, r5)
            goto L_0x0023
        L_0x00a1:
            boolean r0 = r15.A0C(r3, r2)
            if (r0 == 0) goto L_0x0023
            X.9CD r0 = X.AnonymousClass9CA.A01
            java.lang.Object r0 = r0.A06(r2, r11)
            X.AnonymousClass9CA.A05(r10, r11, r0)
            goto L_0x018a
        L_0x00b2:
            boolean r0 = r15.A0C(r3, r2)
            if (r0 == 0) goto L_0x0023
            X.9CD r1 = X.AnonymousClass9CA.A01
            boolean r0 = r1.A0I(r2, r11)
            r1.A0E(r10, r11, r0)
            goto L_0x018a
        L_0x00c3:
            boolean r0 = r15.A0C(r3, r2)
            if (r0 == 0) goto L_0x0023
            X.9CD r0 = X.AnonymousClass9CA.A01
            int r0 = r0.A04(r2, r11)
            X.AnonymousClass9CA.A04(r10, r11, r0)
            goto L_0x018a
        L_0x00d4:
            boolean r0 = r15.A0C(r3, r2)
            if (r0 == 0) goto L_0x0023
            X.9CD r9 = X.AnonymousClass9CA.A01
            long r13 = r9.A05(r2, r11)
            r9.A0C(r10, r11, r13)
            goto L_0x018a
        L_0x00e5:
            boolean r0 = r15.A0C(r3, r2)
            if (r0 == 0) goto L_0x0023
            X.9CD r1 = X.AnonymousClass9CA.A01
            float r0 = r1.A02(r2, r11)
            r1.A0A(r10, r11, r0)
            goto L_0x018a
        L_0x00f6:
            boolean r0 = r15.A0C(r3, r2)
            if (r0 == 0) goto L_0x0023
            X.9CD r9 = X.AnonymousClass9CA.A01
            double r13 = r9.A01(r2, r11)
            r9.A09(r10, r11, r13)
            goto L_0x018a
        L_0x0107:
            boolean r0 = r15.A0E(r2, r6, r3)
            if (r0 == 0) goto L_0x0023
            r1 = r4[r5]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            sun.misc.Unsafe r9 = A0E
            java.lang.Object r8 = r9.getObject(r2, r0)
            if (r8 == 0) goto L_0x01b4
            X.9Bg r7 = r15.A03(r3)
            boolean r5 = r15.A0E(r10, r6, r3)
            if (r5 != 0) goto L_0x0148
            boolean r5 = A0D(r8)
            if (r5 != 0) goto L_0x013d
            r9.putObject(r10, r0, r8)
        L_0x012f:
            int r0 = r3 + 2
            r1 = r4[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.AnonymousClass9CA.A04(r10, r0, r6)
            goto L_0x0023
        L_0x013d:
            X.972 r5 = r7.Cr8()
            r7.Co5(r5, r8)
            r9.putObject(r10, r0, r5)
            goto L_0x012f
        L_0x0148:
            java.lang.Object r5 = r9.getObject(r10, r0)
            boolean r4 = A0D(r5)
            if (r4 != 0) goto L_0x015d
            X.972 r4 = r7.Cr8()
            r7.Co5(r4, r5)
            r9.putObject(r10, r0, r4)
            r5 = r4
        L_0x015d:
            r7.Co5(r5, r8)
            goto L_0x0023
        L_0x0162:
            boolean r0 = r15.A0C(r3, r2)
            if (r0 == 0) goto L_0x0023
            r1 = r4[r5]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            sun.misc.Unsafe r8 = A0E
            java.lang.Object r7 = r8.getObject(r2, r0)
            if (r7 == 0) goto L_0x01d5
            X.9Bg r6 = r15.A03(r3)
            boolean r4 = r15.A0C(r3, r10)
            if (r4 != 0) goto L_0x019a
            boolean r4 = A0D(r7)
            if (r4 != 0) goto L_0x018f
            r8.putObject(r10, r0, r7)
        L_0x018a:
            r15.A0A(r10, r3)
            goto L_0x0023
        L_0x018f:
            X.972 r4 = r6.Cr8()
            r6.Co5(r4, r7)
            r8.putObject(r10, r0, r4)
            goto L_0x018a
        L_0x019a:
            java.lang.Object r5 = r8.getObject(r10, r0)
            boolean r4 = A0D(r5)
            if (r4 != 0) goto L_0x01af
            X.972 r4 = r6.Cr8()
            r6.Co5(r4, r5)
            r8.putObject(r10, r0, r4)
            r5 = r4
        L_0x01af:
            r6.Co5(r5, r7)
            goto L_0x0023
        L_0x01b4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Source subfield "
            r1.append(r0)
            r0 = r4[r3]
            r1.append(r0)
            java.lang.String r0 = " is present but null: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01d5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Source subfield "
            r1.append(r0)
            r0 = r4[r3]
            r1.append(r0)
            java.lang.String r0 = " is present but null: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01f6:
            X.C374949Bl.A03(r10, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9C9.Co5(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x043e, code lost:
        r0.A01 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0489, code lost:
        throw X.AnonymousClass9GO.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x05be, code lost:
        A0B(r12, r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x066c, code lost:
        A0A(r12, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0682, code lost:
        A07(r5, r2, r12, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0210, code lost:
        X.AnonymousClass9CA.A04(r12, (long) (r8[r2 + 2] & 1048575), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x034c, code lost:
        r0 = X.C374949Bl.A01;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035 A[Catch:{ 9GT -> 0x06b8, all -> 0x072c }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0072 A[Catch:{ 9GT -> 0x06b8, all -> 0x072c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Co7(X.AnonymousClass9CF r18, X.C3738397d r19, java.lang.Object r20) {
        /*
            r17 = this;
            r7 = r19
            r12 = r20
            r7.getClass()
            A09(r12)
            r1 = r17
            X.9C0 r9 = r1.A0C
            r6 = 0
        L_0x000f:
            r0 = r18
            int r3 = r0.A01     // Catch:{ all -> 0x072c }
            if (r3 == 0) goto L_0x0021
            r0.A02 = r3     // Catch:{ all -> 0x072c }
            r2 = 0
            r0.A01 = r2     // Catch:{ all -> 0x072c }
        L_0x001a:
            int r2 = r0.A00     // Catch:{ all -> 0x072c }
            if (r3 == r2) goto L_0x002c
            int r5 = r3 >>> 3
            goto L_0x002f
        L_0x0021:
            X.97U r2 = r0.A03     // Catch:{ all -> 0x072c }
            int r3 = r2.A0E()     // Catch:{ all -> 0x072c }
            r0.A02 = r3     // Catch:{ all -> 0x072c }
            if (r3 == 0) goto L_0x002c
            goto L_0x001a
        L_0x002c:
            r5 = 2147483647(0x7fffffff, float:NaN)
        L_0x002f:
            int r2 = r1.A00(r5)     // Catch:{ all -> 0x072c }
            if (r2 >= 0) goto L_0x0072
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r5 != r2) goto L_0x0057
            int r4 = r1.A00
        L_0x003c:
            int r0 = r1.A03
            if (r4 >= r0) goto L_0x0725
            int[] r0 = r1.A07
            r0 = r0[r4]
            int[] r2 = r1.A06
            int r0 = r0 + 1
            r2 = r2[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r0
            long r2 = (long) r2
            X.9CD r0 = X.AnonymousClass9CA.A01
            r0.A06(r12, r2)
            int r4 = r4 + 1
            goto L_0x003c
        L_0x0057:
            if (r6 != 0) goto L_0x006a
            r4 = r12
            X.972 r4 = (X.AnonymousClass972) r4     // Catch:{ all -> 0x072c }
            X.975 r3 = r4.unknownFields     // Catch:{ all -> 0x072c }
            X.975 r2 = X.AnonymousClass975.A05     // Catch:{ all -> 0x072c }
            if (r3 != r2) goto L_0x0069
            X.975 r3 = new X.975     // Catch:{ all -> 0x072c }
            r3.<init>()     // Catch:{ all -> 0x072c }
            r4.unknownFields = r3     // Catch:{ all -> 0x072c }
        L_0x0069:
            r6 = r3
        L_0x006a:
            boolean r0 = r9.A00(r0, r6)     // Catch:{ all -> 0x072c }
            if (r0 != 0) goto L_0x000f
            goto L_0x06d2
        L_0x0072:
            int[] r8 = r1.A06     // Catch:{ all -> 0x072c }
            int r3 = r2 + 1
            r4 = r8[r3]     // Catch:{ all -> 0x072c }
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r4
            int r3 = r3 >>> 20
            switch(r3) {
                case 0: goto L_0x0658;
                case 1: goto L_0x0643;
                case 2: goto L_0x062e;
                case 3: goto L_0x0619;
                case 4: goto L_0x0606;
                case 5: goto L_0x05f1;
                case 6: goto L_0x05de;
                case 7: goto L_0x05c8;
                case 8: goto L_0x05c3;
                case 9: goto L_0x05ad;
                case 10: goto L_0x0599;
                case 11: goto L_0x0585;
                case 12: goto L_0x0571;
                case 13: goto L_0x055d;
                case 14: goto L_0x0547;
                case 15: goto L_0x0533;
                case 16: goto L_0x051d;
                case 17: goto L_0x050a;
                case 18: goto L_0x04fa;
                case 19: goto L_0x04ea;
                case 20: goto L_0x04da;
                case 21: goto L_0x04ca;
                case 22: goto L_0x04ba;
                case 23: goto L_0x04aa;
                case 24: goto L_0x049a;
                case 25: goto L_0x048a;
                case 26: goto L_0x0409;
                case 27: goto L_0x03ce;
                case 28: goto L_0x039c;
                case 29: goto L_0x0350;
                case 30: goto L_0x033e;
                case 31: goto L_0x032e;
                case 32: goto L_0x031e;
                case 33: goto L_0x030e;
                case 34: goto L_0x02fe;
                case 35: goto L_0x02ee;
                case 36: goto L_0x02de;
                case 37: goto L_0x02ce;
                case 38: goto L_0x02be;
                case 39: goto L_0x02ae;
                case 40: goto L_0x029e;
                case 41: goto L_0x028e;
                case 42: goto L_0x027e;
                case 43: goto L_0x026e;
                case 44: goto L_0x025e;
                case 45: goto L_0x024e;
                case 46: goto L_0x023e;
                case 47: goto L_0x022e;
                case 48: goto L_0x021e;
                case 49: goto L_0x0360;
                case 50: goto L_0x0687;
                case 51: goto L_0x01e3;
                case 52: goto L_0x01cc;
                case 53: goto L_0x01b5;
                case 54: goto L_0x019e;
                case 55: goto L_0x0187;
                case 56: goto L_0x016f;
                case 57: goto L_0x0157;
                case 58: goto L_0x013f;
                case 59: goto L_0x020d;
                case 60: goto L_0x01fa;
                case 61: goto L_0x012b;
                case 62: goto L_0x0113;
                case 63: goto L_0x009b;
                case 64: goto L_0x00fb;
                case 65: goto L_0x00e3;
                case 66: goto L_0x00cb;
                case 67: goto L_0x00b3;
                case 68: goto L_0x0671;
                default: goto L_0x0080;
            }     // Catch:{ all -> 0x072c }
        L_0x0080:
            if (r6 != 0) goto L_0x0093
            r4 = r12
            X.972 r4 = (X.AnonymousClass972) r4     // Catch:{ 9GT -> 0x06b8 }
            X.975 r3 = r4.unknownFields     // Catch:{ 9GT -> 0x06b8 }
            X.975 r2 = X.AnonymousClass975.A05     // Catch:{ 9GT -> 0x06b8 }
            if (r3 != r2) goto L_0x0092
            X.975 r3 = new X.975     // Catch:{ 9GT -> 0x06b8 }
            r3.<init>()     // Catch:{ 9GT -> 0x06b8 }
            r4.unknownFields = r3     // Catch:{ 9GT -> 0x06b8 }
        L_0x0092:
            r6 = r3
        L_0x0093:
            boolean r0 = r9.A00(r0, r6)     // Catch:{ 9GT -> 0x06b8 }
            if (r0 != 0) goto L_0x000f
            goto L_0x06ef
        L_0x009b:
            r3 = 0
            X.AnonymousClass9CF.A01(r0, r3)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r3 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            int r10 = r3.A09()     // Catch:{ 9GT -> 0x06b8 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r3 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9CA.A05(r12, r3, r10)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x0210
        L_0x00b3:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r3 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            r10 = 0
            X.AnonymousClass9CF.A01(r0, r10)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r10 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            long r10 = r10.A0K()     // Catch:{ 9GT -> 0x06b8 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9CA.A05(r12, r3, r10)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x0210
        L_0x00cb:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r3 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            r10 = 0
            X.AnonymousClass9CF.A01(r0, r10)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r10 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            int r10 = r10.A0D()     // Catch:{ 9GT -> 0x06b8 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9CA.A05(r12, r3, r10)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x0210
        L_0x00e3:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r3 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            r10 = 1
            X.AnonymousClass9CF.A01(r0, r10)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r10 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            long r10 = r10.A0J()     // Catch:{ 9GT -> 0x06b8 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9CA.A05(r12, r3, r10)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x0210
        L_0x00fb:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r3 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            r10 = 5
            X.AnonymousClass9CF.A01(r0, r10)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r10 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            int r10 = r10.A0C()     // Catch:{ 9GT -> 0x06b8 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9CA.A05(r12, r3, r10)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x0210
        L_0x0113:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r3 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            r10 = 0
            X.AnonymousClass9CF.A01(r0, r10)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r10 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            int r10 = r10.A0F()     // Catch:{ 9GT -> 0x06b8 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9CA.A05(r12, r3, r10)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x0210
        L_0x012b:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r3 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            r10 = 2
            X.AnonymousClass9CF.A01(r0, r10)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r10 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            X.97R r10 = r10.A0M()     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9CA.A05(r12, r3, r10)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x0210
        L_0x013f:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r3 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            r10 = 0
            X.AnonymousClass9CF.A01(r0, r10)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r10 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            boolean r10 = r10.A0R()     // Catch:{ 9GT -> 0x06b8 }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9CA.A05(r12, r3, r10)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x0210
        L_0x0157:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r3 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            r10 = 5
            X.AnonymousClass9CF.A01(r0, r10)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r10 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            int r10 = r10.A0A()     // Catch:{ 9GT -> 0x06b8 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9CA.A05(r12, r3, r10)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x0210
        L_0x016f:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r3 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            r10 = 1
            X.AnonymousClass9CF.A01(r0, r10)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r10 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            long r10 = r10.A0H()     // Catch:{ 9GT -> 0x06b8 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9CA.A05(r12, r3, r10)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x0210
        L_0x0187:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r3 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            r10 = 0
            X.AnonymousClass9CF.A01(r0, r10)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r10 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            int r10 = r10.A0B()     // Catch:{ 9GT -> 0x06b8 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9CA.A05(r12, r3, r10)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x0210
        L_0x019e:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r3 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            r10 = 0
            X.AnonymousClass9CF.A01(r0, r10)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r10 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            long r10 = r10.A0L()     // Catch:{ 9GT -> 0x06b8 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9CA.A05(r12, r3, r10)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x0210
        L_0x01b5:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r3 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            r10 = 0
            X.AnonymousClass9CF.A01(r0, r10)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r10 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            long r10 = r10.A0I()     // Catch:{ 9GT -> 0x06b8 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9CA.A05(r12, r3, r10)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x0210
        L_0x01cc:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r3 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            r10 = 5
            X.AnonymousClass9CF.A01(r0, r10)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r10 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            float r10 = r10.A07()     // Catch:{ 9GT -> 0x06b8 }
            java.lang.Float r10 = java.lang.Float.valueOf(r10)     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9CA.A05(r12, r3, r10)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x0210
        L_0x01e3:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r3 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            r10 = 1
            X.AnonymousClass9CF.A01(r0, r10)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r10 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            double r10 = r10.A06()     // Catch:{ 9GT -> 0x06b8 }
            java.lang.Double r10 = java.lang.Double.valueOf(r10)     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9CA.A05(r12, r3, r10)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x0210
        L_0x01fa:
            java.lang.Object r10 = r1.A04(r5, r2, r12)     // Catch:{ 9GT -> 0x06b8 }
            X.973 r10 = (X.AnonymousClass973) r10     // Catch:{ 9GT -> 0x06b8 }
            X.9Bg r4 = r1.A03(r2)     // Catch:{ 9GT -> 0x06b8 }
            r3 = 2
            X.AnonymousClass9CF.A01(r0, r3)     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9CF.A03(r0, r7, r4, r10)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x0682
        L_0x020d:
            r1.A08(r0, r12, r4)     // Catch:{ 9GT -> 0x06b8 }
        L_0x0210:
            int r2 = r2 + 2
            r3 = r8[r2]     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            long r2 = (long) r3     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9CA.A04(r12, r2, r5)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x021e:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r2 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            r0.A0F(r2)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x022e:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r2 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            r0.A0E(r2)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x023e:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r2 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            r0.A0D(r2)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x024e:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r2 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            r0.A0C(r2)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x025e:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r2 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            r0.A06(r2)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x034c
        L_0x026e:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r2 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            r0.A0G(r2)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x027e:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r2 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            r0.A04(r2)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x028e:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r2 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            r0.A07(r2)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x029e:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r2 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            r0.A08(r2)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x02ae:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r2 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            r0.A0A(r2)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x02be:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r2 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            r0.A0H(r2)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x02ce:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r2 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            r0.A0B(r2)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x02de:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r2 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            r0.A09(r2)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x02ee:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r2 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            r0.A05(r2)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x02fe:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r2 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            r0.A0F(r2)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x030e:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r2 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            r0.A0E(r2)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x031e:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r2 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            r0.A0D(r2)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x032e:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r2 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            r0.A0C(r2)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x033e:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r2 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            r0.A06(r2)     // Catch:{ 9GT -> 0x06b8 }
        L_0x034c:
            X.9C0 r0 = X.C374949Bl.A01     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x0350:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r2 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            r0.A0G(r2)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x0360:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r3 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            X.9Bg r5 = r1.A03(r2)     // Catch:{ 9GT -> 0x06b8 }
            X.9C4 r2 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r10 = r2.A01(r12, r3)     // Catch:{ 9GT -> 0x06b8 }
            int r4 = r0.A02     // Catch:{ 9GT -> 0x06b8 }
            r3 = r4 & 7
            r2 = 3
            if (r3 == r2) goto L_0x037b
            X.9GT r2 = X.AnonymousClass9GO.A00()     // Catch:{ 9GT -> 0x06b8 }
            throw r2     // Catch:{ 9GT -> 0x06b8 }
        L_0x037b:
            X.972 r2 = r5.Cr8()     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9CF.A02(r0, r7, r5, r2)     // Catch:{ 9GT -> 0x06b8 }
            r5.ClW(r2)     // Catch:{ 9GT -> 0x06b8 }
            r10.add(r2)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r3 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            boolean r2 = r3.A0Q()     // Catch:{ 9GT -> 0x06b8 }
            if (r2 != 0) goto L_0x000f
            int r2 = r0.A01     // Catch:{ 9GT -> 0x06b8 }
            if (r2 != 0) goto L_0x000f
            int r3 = r3.A0E()     // Catch:{ 9GT -> 0x06b8 }
            if (r3 == r4) goto L_0x037b
            goto L_0x043e
        L_0x039c:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r5 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            int r2 = r0.A02     // Catch:{ 9GT -> 0x06b8 }
            r2 = r2 & 7
            r4 = 2
            if (r2 == r4) goto L_0x03b3
            X.9GT r2 = X.AnonymousClass9GO.A00()     // Catch:{ 9GT -> 0x06b8 }
            throw r2     // Catch:{ 9GT -> 0x06b8 }
        L_0x03b3:
            X.AnonymousClass9CF.A01(r0, r4)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r3 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            X.97R r2 = r3.A0M()     // Catch:{ 9GT -> 0x06b8 }
            r5.add(r2)     // Catch:{ 9GT -> 0x06b8 }
            boolean r2 = r3.A0Q()     // Catch:{ 9GT -> 0x06b8 }
            if (r2 != 0) goto L_0x000f
            int r3 = r3.A0E()     // Catch:{ 9GT -> 0x06b8 }
            int r2 = r0.A02     // Catch:{ 9GT -> 0x06b8 }
            if (r3 == r2) goto L_0x03b3
            goto L_0x043e
        L_0x03ce:
            X.9Bg r5 = r1.A03(r2)     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            X.9C4 r4 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r10 = r4.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            int r4 = r0.A02     // Catch:{ 9GT -> 0x06b8 }
            r3 = r4 & 7
            r2 = 2
            if (r3 == r2) goto L_0x03e9
            X.9GT r2 = X.AnonymousClass9GO.A00()     // Catch:{ 9GT -> 0x06b8 }
            throw r2     // Catch:{ 9GT -> 0x06b8 }
        L_0x03e9:
            X.972 r2 = r5.Cr8()     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9CF.A03(r0, r7, r5, r2)     // Catch:{ 9GT -> 0x06b8 }
            r5.ClW(r2)     // Catch:{ 9GT -> 0x06b8 }
            r10.add(r2)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r3 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            boolean r2 = r3.A0Q()     // Catch:{ 9GT -> 0x06b8 }
            if (r2 != 0) goto L_0x000f
            int r2 = r0.A01     // Catch:{ 9GT -> 0x06b8 }
            if (r2 != 0) goto L_0x000f
            int r3 = r3.A0E()     // Catch:{ 9GT -> 0x06b8 }
            if (r3 == r4) goto L_0x03e9
            goto L_0x043e
        L_0x0409:
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r2 = r2 & r4
            r10 = 0
            if (r2 == 0) goto L_0x0410
            r10 = 1
        L_0x0410:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r4 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            if (r10 == 0) goto L_0x0442
            int r2 = r0.A02     // Catch:{ 9GT -> 0x06b8 }
            r2 = r2 & 7
            r5 = 2
            if (r2 != r5) goto L_0x0485
        L_0x0424:
            X.AnonymousClass9CF.A01(r0, r5)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r3 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            java.lang.String r2 = r3.A0O()     // Catch:{ 9GT -> 0x06b8 }
            r4.add(r2)     // Catch:{ 9GT -> 0x06b8 }
            boolean r2 = r3.A0Q()     // Catch:{ 9GT -> 0x06b8 }
            if (r2 != 0) goto L_0x000f
            int r3 = r3.A0E()     // Catch:{ 9GT -> 0x06b8 }
            int r2 = r0.A02     // Catch:{ 9GT -> 0x06b8 }
            if (r3 == r2) goto L_0x0424
        L_0x043e:
            r0.A01 = r3     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x0442:
            int r2 = r0.A02     // Catch:{ 9GT -> 0x06b8 }
            r2 = r2 & 7
            r5 = 2
            if (r2 != r5) goto L_0x0485
            boolean r2 = r4 instanceof X.C41844B3l     // Catch:{ 9GT -> 0x06b8 }
            if (r2 == 0) goto L_0x046a
            X.B3l r4 = (X.C41844B3l) r4     // Catch:{ 9GT -> 0x06b8 }
        L_0x044f:
            X.AnonymousClass9CF.A01(r0, r5)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r3 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            X.97R r2 = r3.A0M()     // Catch:{ 9GT -> 0x06b8 }
            r4.A7Z(r2)     // Catch:{ 9GT -> 0x06b8 }
            boolean r2 = r3.A0Q()     // Catch:{ 9GT -> 0x06b8 }
            if (r2 != 0) goto L_0x000f
            int r3 = r3.A0E()     // Catch:{ 9GT -> 0x06b8 }
            int r2 = r0.A02     // Catch:{ 9GT -> 0x06b8 }
            if (r3 == r2) goto L_0x044f
            goto L_0x043e
        L_0x046a:
            X.AnonymousClass9CF.A01(r0, r5)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r3 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            java.lang.String r2 = r3.A0N()     // Catch:{ 9GT -> 0x06b8 }
            r4.add(r2)     // Catch:{ 9GT -> 0x06b8 }
            boolean r2 = r3.A0Q()     // Catch:{ 9GT -> 0x06b8 }
            if (r2 != 0) goto L_0x000f
            int r3 = r3.A0E()     // Catch:{ 9GT -> 0x06b8 }
            int r2 = r0.A02     // Catch:{ 9GT -> 0x06b8 }
            if (r3 == r2) goto L_0x046a
            goto L_0x043e
        L_0x0485:
            X.9GT r2 = X.AnonymousClass9GO.A00()     // Catch:{ 9GT -> 0x06b8 }
            throw r2     // Catch:{ 9GT -> 0x06b8 }
        L_0x048a:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r2 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            r0.A04(r2)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x049a:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r2 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            r0.A07(r2)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x04aa:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r2 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            r0.A08(r2)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x04ba:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r2 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            r0.A0A(r2)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x04ca:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r2 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            r0.A0H(r2)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x04da:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r2 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            r0.A0B(r2)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x04ea:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r2 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            r0.A09(r2)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x04fa:
            X.9C4 r5 = r1.A05     // Catch:{ 9GT -> 0x06b8 }
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            java.util.List r2 = r5.A01(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            r0.A05(r2)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x050a:
            java.lang.Object r5 = r1.A05(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            X.973 r5 = (X.AnonymousClass973) r5     // Catch:{ 9GT -> 0x06b8 }
            X.9Bg r4 = r1.A03(r2)     // Catch:{ 9GT -> 0x06b8 }
            r3 = 3
            X.AnonymousClass9CF.A01(r0, r3)     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9CF.A02(r0, r7, r4, r5)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x05be
        L_0x051d:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r13 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            r3 = 0
            X.AnonymousClass9CF.A01(r0, r3)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r3 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            long r15 = r3.A0K()     // Catch:{ 9GT -> 0x06b8 }
            X.9CD r11 = X.AnonymousClass9CA.A01     // Catch:{ 9GT -> 0x06b8 }
            r11.A0C(r12, r13, r15)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x066c
        L_0x0533:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r3 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            r5 = 0
            X.AnonymousClass9CF.A01(r0, r5)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r5 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            int r5 = r5.A0D()     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9CA.A04(r12, r3, r5)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x066c
        L_0x0547:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r13 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            r3 = 1
            X.AnonymousClass9CF.A01(r0, r3)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r3 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            long r15 = r3.A0J()     // Catch:{ 9GT -> 0x06b8 }
            X.9CD r11 = X.AnonymousClass9CA.A01     // Catch:{ 9GT -> 0x06b8 }
            r11.A0C(r12, r13, r15)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x066c
        L_0x055d:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r3 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            r5 = 5
            X.AnonymousClass9CF.A01(r0, r5)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r5 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            int r5 = r5.A0C()     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9CA.A04(r12, r3, r5)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x066c
        L_0x0571:
            r3 = 0
            X.AnonymousClass9CF.A01(r0, r3)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r3 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            int r5 = r3.A09()     // Catch:{ 9GT -> 0x06b8 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r3 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9CA.A04(r12, r3, r5)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x066c
        L_0x0585:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r3 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            r5 = 0
            X.AnonymousClass9CF.A01(r0, r5)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r5 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            int r5 = r5.A0F()     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9CA.A04(r12, r3, r5)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x066c
        L_0x0599:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r3 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            r5 = 2
            X.AnonymousClass9CF.A01(r0, r5)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r5 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            X.97R r5 = r5.A0M()     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9CA.A05(r12, r3, r5)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x066c
        L_0x05ad:
            java.lang.Object r5 = r1.A05(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            X.973 r5 = (X.AnonymousClass973) r5     // Catch:{ 9GT -> 0x06b8 }
            X.9Bg r4 = r1.A03(r2)     // Catch:{ 9GT -> 0x06b8 }
            r3 = 2
            X.AnonymousClass9CF.A01(r0, r3)     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9CF.A03(r0, r7, r4, r5)     // Catch:{ 9GT -> 0x06b8 }
        L_0x05be:
            r1.A0B(r12, r2, r5)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x05c3:
            r1.A08(r0, r12, r4)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x066c
        L_0x05c8:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r3 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            r5 = 0
            X.AnonymousClass9CF.A01(r0, r5)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r5 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            boolean r10 = r5.A0R()     // Catch:{ 9GT -> 0x06b8 }
            X.9CD r5 = X.AnonymousClass9CA.A01     // Catch:{ 9GT -> 0x06b8 }
            r5.A0E(r12, r3, r10)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x066c
        L_0x05de:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r3 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            r5 = 5
            X.AnonymousClass9CF.A01(r0, r5)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r5 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            int r5 = r5.A0A()     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9CA.A04(r12, r3, r5)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x066c
        L_0x05f1:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r13 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            r3 = 1
            X.AnonymousClass9CF.A01(r0, r3)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r3 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            long r15 = r3.A0H()     // Catch:{ 9GT -> 0x06b8 }
            X.9CD r11 = X.AnonymousClass9CA.A01     // Catch:{ 9GT -> 0x06b8 }
            r11.A0C(r12, r13, r15)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x066c
        L_0x0606:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r3 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            r5 = 0
            X.AnonymousClass9CF.A01(r0, r5)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r5 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            int r5 = r5.A0B()     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9CA.A04(r12, r3, r5)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x066c
        L_0x0619:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r13 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            r3 = 0
            X.AnonymousClass9CF.A01(r0, r3)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r3 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            long r15 = r3.A0L()     // Catch:{ 9GT -> 0x06b8 }
            X.9CD r11 = X.AnonymousClass9CA.A01     // Catch:{ 9GT -> 0x06b8 }
            r11.A0C(r12, r13, r15)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x066c
        L_0x062e:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r13 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            r3 = 0
            X.AnonymousClass9CF.A01(r0, r3)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r3 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            long r15 = r3.A0I()     // Catch:{ 9GT -> 0x06b8 }
            X.9CD r11 = X.AnonymousClass9CA.A01     // Catch:{ 9GT -> 0x06b8 }
            r11.A0C(r12, r13, r15)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x066c
        L_0x0643:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r3 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            r5 = 5
            X.AnonymousClass9CF.A01(r0, r5)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r5 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            float r10 = r5.A07()     // Catch:{ 9GT -> 0x06b8 }
            X.9CD r5 = X.AnonymousClass9CA.A01     // Catch:{ 9GT -> 0x06b8 }
            r5.A0A(r12, r3, r10)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x066c
        L_0x0658:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r13 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            r3 = 1
            X.AnonymousClass9CF.A01(r0, r3)     // Catch:{ 9GT -> 0x06b8 }
            X.97U r3 = r0.A03     // Catch:{ 9GT -> 0x06b8 }
            double r15 = r3.A06()     // Catch:{ 9GT -> 0x06b8 }
            X.9CD r11 = X.AnonymousClass9CA.A01     // Catch:{ 9GT -> 0x06b8 }
            r11.A09(r12, r13, r15)     // Catch:{ 9GT -> 0x06b8 }
        L_0x066c:
            r1.A0A(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x0671:
            java.lang.Object r10 = r1.A04(r5, r2, r12)     // Catch:{ 9GT -> 0x06b8 }
            X.973 r10 = (X.AnonymousClass973) r10     // Catch:{ 9GT -> 0x06b8 }
            X.9Bg r4 = r1.A03(r2)     // Catch:{ 9GT -> 0x06b8 }
            r3 = 3
            X.AnonymousClass9CF.A01(r0, r3)     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9CF.A02(r0, r7, r4, r10)     // Catch:{ 9GT -> 0x06b8 }
        L_0x0682:
            r1.A07(r5, r2, r12, r10)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x000f
        L_0x0687:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            long r2 = (long) r4     // Catch:{ 9GT -> 0x06b8 }
            X.9CD r4 = X.AnonymousClass9CA.A01     // Catch:{ 9GT -> 0x06b8 }
            java.lang.Object r5 = r4.A06(r12, r2)     // Catch:{ 9GT -> 0x06b8 }
            if (r5 != 0) goto L_0x06a5
            X.Avf r4 = X.C41537Avf.A01     // Catch:{ 9GT -> 0x06b8 }
            X.Avf r4 = r4.A02()     // Catch:{ 9GT -> 0x06b8 }
        L_0x069a:
            X.AnonymousClass9CA.A05(r12, r2, r4)     // Catch:{ 9GT -> 0x06b8 }
        L_0x069d:
            java.lang.String r3 = "getMetadata"
            java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch:{ 9GT -> 0x06b8 }
            r2.<init>(r3)     // Catch:{ 9GT -> 0x06b8 }
            throw r2     // Catch:{ 9GT -> 0x06b8 }
        L_0x06a5:
            r4 = r5
            X.Avf r4 = (X.C41537Avf) r4     // Catch:{ 9GT -> 0x06b8 }
            boolean r4 = r4.A00     // Catch:{ 9GT -> 0x06b8 }
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x069d
            X.Avf r4 = X.C41537Avf.A01     // Catch:{ 9GT -> 0x06b8 }
            X.Avf r4 = r4.A02()     // Catch:{ 9GT -> 0x06b8 }
            X.AnonymousClass9C8.A00(r4, r5)     // Catch:{ 9GT -> 0x06b8 }
            goto L_0x069a
        L_0x06b8:
            if (r6 != 0) goto L_0x06cb
            r4 = r12
            X.972 r4 = (X.AnonymousClass972) r4     // Catch:{ all -> 0x072c }
            X.975 r3 = r4.unknownFields     // Catch:{ all -> 0x072c }
            X.975 r2 = X.AnonymousClass975.A05     // Catch:{ all -> 0x072c }
            if (r3 != r2) goto L_0x06ca
            X.975 r3 = new X.975     // Catch:{ all -> 0x072c }
            r3.<init>()     // Catch:{ all -> 0x072c }
            r4.unknownFields = r3     // Catch:{ all -> 0x072c }
        L_0x06ca:
            r6 = r3
        L_0x06cb:
            boolean r0 = r9.A00(r0, r6)     // Catch:{ all -> 0x072c }
            if (r0 != 0) goto L_0x000f
            goto L_0x070a
        L_0x06d2:
            int r4 = r1.A00
        L_0x06d4:
            int r0 = r1.A03
            if (r4 >= r0) goto L_0x0725
            int[] r0 = r1.A07
            r0 = r0[r4]
            int[] r2 = r1.A06
            int r0 = r0 + 1
            r2 = r2[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r0
            long r2 = (long) r2
            X.9CD r0 = X.AnonymousClass9CA.A01
            r0.A06(r12, r2)
            int r4 = r4 + 1
            goto L_0x06d4
        L_0x06ef:
            int r4 = r1.A00
        L_0x06f1:
            int r0 = r1.A03
            if (r4 >= r0) goto L_0x0725
            int[] r0 = r1.A07
            r0 = r0[r4]
            int r0 = r0 + 1
            r2 = r8[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r0
            long r2 = (long) r2
            X.9CD r0 = X.AnonymousClass9CA.A01
            r0.A06(r12, r2)
            int r4 = r4 + 1
            goto L_0x06f1
        L_0x070a:
            int r4 = r1.A00
        L_0x070c:
            int r0 = r1.A03
            if (r4 >= r0) goto L_0x0725
            int[] r0 = r1.A07
            r0 = r0[r4]
            int r0 = r0 + 1
            r2 = r8[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r0
            long r2 = (long) r2
            X.9CD r0 = X.AnonymousClass9CA.A01
            r0.A06(r12, r2)
            int r4 = r4 + 1
            goto L_0x070c
        L_0x0725:
            if (r6 == 0) goto L_0x072b
            X.972 r12 = (X.AnonymousClass972) r12
            r12.unknownFields = r6
        L_0x072b:
            return
        L_0x072c:
            r5 = move-exception
            int r4 = r1.A00
        L_0x072f:
            int r0 = r1.A03
            if (r4 >= r0) goto L_0x074a
            int[] r0 = r1.A07
            r0 = r0[r4]
            int[] r2 = r1.A06
            int r0 = r0 + 1
            r2 = r2[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r0
            long r2 = (long) r2
            X.9CD r0 = X.AnonymousClass9CA.A01
            r0.A06(r12, r2)
            int r4 = r4 + 1
            goto L_0x072f
        L_0x074a:
            if (r6 == 0) goto L_0x0750
            X.972 r12 = (X.AnonymousClass972) r12
            r12.unknownFields = r6
        L_0x0750:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9C9.Co7(X.9CF, X.97d, java.lang.Object):void");
    }

    public final AnonymousClass972 Cr8() {
        return (AnonymousClass972) ((AnonymousClass972) this.A04).A0E(AnonymousClass05K.A0N, (Object) null, (Object) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03c0, code lost:
        r14 = r4[r2];
        r11 = (java.util.List) r3.getObject(r5, r0);
        r0 = X.C374949Bl.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03ca, code lost:
        if (r11 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03d0, code lost:
        if (r11.isEmpty() != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03d2, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03d3, code lost:
        if (r12 == false) goto L_0x040b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03d5, code lost:
        r7 = r7.A00;
        r7.A06((r14 << 3) | 2);
        r12 = 0;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03e4, code lost:
        if (r12 >= r11.size()) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03e6, code lost:
        r11.get(r12);
        r1 = r1 + 8;
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03ee, code lost:
        r7.A06(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03f5, code lost:
        if (r8 >= r11.size()) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03f7, code lost:
        r7.A09(java.lang.Double.doubleToRawLongBits(((java.lang.Number) r11.get(r8)).doubleValue()));
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x040f, code lost:
        if (r8 >= r11.size()) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0411, code lost:
        r13 = r7.A00;
        r0 = java.lang.Double.doubleToRawLongBits(((java.lang.Number) r11.get(r8)).doubleValue());
        r13.A06((r14 << 3) | 1);
        r13.A09(r0);
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x042f, code lost:
        r13 = r4[r2];
        r12 = (java.util.List) r3.getObject(r5, r0);
        r0 = X.C374949Bl.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0439, code lost:
        if (r12 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x043f, code lost:
        if (r12.isEmpty() != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0441, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0442, code lost:
        if (r8 == false) goto L_0x047a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0444, code lost:
        r1 = r7.A00;
        r1.A06((r13 << 3) | 2);
        r8 = 0;
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0453, code lost:
        if (r8 >= r12.size()) goto L_0x045d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0455, code lost:
        r12.get(r8);
        r7 = r7 + 4;
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x045d, code lost:
        r1.A06(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0464, code lost:
        if (r11 >= r12.size()) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0466, code lost:
        r1.A05(java.lang.Float.floatToRawIntBits(((java.lang.Number) r12.get(r11)).floatValue()));
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x047e, code lost:
        if (r11 >= r12.size()) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0480, code lost:
        r8 = r7.A00;
        r1 = java.lang.Float.floatToRawIntBits(((java.lang.Number) r12.get(r11)).floatValue());
        r8.A06((r13 << 3) | 5);
        r8.A05(r1);
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x049e, code lost:
        r14 = r4[r2];
        r11 = (java.util.List) r3.getObject(r5, r0);
        r0 = X.C374949Bl.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04a8, code lost:
        if (r11 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04ae, code lost:
        if (r11.isEmpty() != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04b0, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04b1, code lost:
        if (r12 == false) goto L_0x04ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04b3, code lost:
        r7 = r7.A00;
        r7.A06((r14 << 3) | 2);
        r12 = 0;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04c2, code lost:
        if (r12 >= r11.size()) goto L_0x04d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04c4, code lost:
        r1 = r1 + X.C384019gd.A01(((java.lang.Number) r11.get(r12)).longValue());
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04d6, code lost:
        r7.A06(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04dd, code lost:
        if (r8 >= r11.size()) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04df, code lost:
        r7.A0A(((java.lang.Number) r11.get(r8)).longValue());
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04f3, code lost:
        if (r8 >= r11.size()) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04f5, code lost:
        r13 = r7.A00;
        r0 = ((java.lang.Number) r11.get(r8)).longValue();
        r13.A06(r14 << 3);
        r13.A0A(r0);
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x050d, code lost:
        r14 = r4[r2];
        r11 = (java.util.List) r3.getObject(r5, r0);
        r0 = X.C374949Bl.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0517, code lost:
        if (r11 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x051d, code lost:
        if (r11.isEmpty() != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x051f, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0520, code lost:
        if (r12 == false) goto L_0x055e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0522, code lost:
        r7 = r7.A00;
        r7.A06((r14 << 3) | 2);
        r12 = 0;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0531, code lost:
        if (r12 >= r11.size()) goto L_0x0545;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0533, code lost:
        r1 = r1 + X.C384019gd.A01(((java.lang.Number) r11.get(r12)).longValue());
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0545, code lost:
        r7.A06(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x054c, code lost:
        if (r8 >= r11.size()) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x054e, code lost:
        r7.A0A(((java.lang.Number) r11.get(r8)).longValue());
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0562, code lost:
        if (r8 >= r11.size()) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0564, code lost:
        r13 = r7.A00;
        r0 = ((java.lang.Number) r11.get(r8)).longValue();
        r13.A06(r14 << 3);
        r13.A0A(r0);
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x057c, code lost:
        r12 = r4[r2];
        r11 = (java.util.List) r3.getObject(r5, r0);
        r0 = X.C374949Bl.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0586, code lost:
        if (r11 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x058c, code lost:
        if (r11.isEmpty() != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x058e, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x058f, code lost:
        if (r13 == false) goto L_0x05d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0591, code lost:
        r7 = r7.A00;
        r7.A06((r12 << 3) | 2);
        r12 = 0;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x05a0, code lost:
        if (r12 >= r11.size()) goto L_0x05b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x05a2, code lost:
        r0 = ((java.lang.Number) r11.get(r12)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x05ac, code lost:
        if (r0 < 0) goto L_0x05b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x05ae, code lost:
        r0 = X.C384019gd.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x05b2, code lost:
        r1 = r1 + r0;
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x05b6, code lost:
        r0 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05b9, code lost:
        r7.A06(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05c0, code lost:
        if (r8 >= r11.size()) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05c2, code lost:
        r0 = ((java.lang.Number) r11.get(r8)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x05cc, code lost:
        if (r0 < 0) goto L_0x05d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x05ce, code lost:
        r7.A06(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05d1, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x05d4, code lost:
        r7.A0A((long) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x05dd, code lost:
        if (r8 >= r11.size()) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x05df, code lost:
        r7.A00.A07(r12, ((java.lang.Number) r11.get(r8)).intValue());
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x05f2, code lost:
        r14 = r4[r2];
        r11 = (java.util.List) r3.getObject(r5, r0);
        r0 = X.C374949Bl.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x05fc, code lost:
        if (r11 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0602, code lost:
        if (r11.isEmpty() != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0604, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0605, code lost:
        if (r12 == false) goto L_0x0639;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0607, code lost:
        r7 = r7.A00;
        r7.A06((r14 << 3) | 2);
        r12 = 0;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0616, code lost:
        if (r12 >= r11.size()) goto L_0x0620;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0618, code lost:
        r11.get(r12);
        r1 = r1 + 8;
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0620, code lost:
        r7.A06(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0627, code lost:
        if (r8 >= r11.size()) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0629, code lost:
        r7.A09(((java.lang.Number) r11.get(r8)).longValue());
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x063d, code lost:
        if (r8 >= r11.size()) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x063f, code lost:
        r13 = r7.A00;
        r0 = ((java.lang.Number) r11.get(r8)).longValue();
        r13.A06((r14 << 3) | 1);
        r13.A09(r0);
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x08d3, code lost:
        r0 = ((java.lang.Number) X.AnonymousClass9CA.A01.A06(r5, r0)).longValue();
        r11 = r7.A00;
        r11.A06(r8 << 3);
        r11.A0A(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0984, code lost:
        r7.A00.A07(r8, A01(r5, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0995, code lost:
        r11 = A01(r5, r0);
        r1 = r7.A00;
        r1.A06((r8 << 3) | 5);
        r1.A05(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x09ad, code lost:
        r0 = ((java.lang.Number) X.AnonymousClass9CA.A01.A06(r5, r0)).longValue();
        r11 = r7.A00;
        r11.A06((r8 << 3) | 1);
        r11.A09(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FOD(X.A8T r23, java.lang.Object r24) {
        /*
            r22 = this;
            r6 = r22
            r5 = r24
            int[] r4 = r6.A06
            int r15 = r4.length
            sun.misc.Unsafe r3 = A0E
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r20 = 0
            r2 = 0
        L_0x0012:
            r7 = r23
            if (r2 >= r15) goto L_0x0bce
            int r0 = r2 + 1
            r12 = r4[r0]
            r8 = r4[r2]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r12
            int r11 = r0 >>> 20
            r0 = 17
            if (r11 > r0) goto L_0x0bca
            int r0 = r2 + 2
            r14 = r4[r0]
            r13 = r14 & r9
            if (r13 == r10) goto L_0x0032
            if (r13 != r9) goto L_0x0bc3
            r20 = 0
        L_0x0031:
            r10 = r13
        L_0x0032:
            int r0 = r14 >>> 20
            r21 = 1
            int r21 = r21 << r0
        L_0x0038:
            r12 = r12 & r9
            long r0 = (long) r12
            switch(r11) {
                case 0: goto L_0x0040;
                case 1: goto L_0x0065;
                case 2: goto L_0x008a;
                case 3: goto L_0x00a7;
                case 4: goto L_0x00c5;
                case 5: goto L_0x00de;
                case 6: goto L_0x00fe;
                case 7: goto L_0x011e;
                case 8: goto L_0x013f;
                case 9: goto L_0x0167;
                case 10: goto L_0x0182;
                case 11: goto L_0x019d;
                case 12: goto L_0x01bb;
                case 13: goto L_0x01d4;
                case 14: goto L_0x01f4;
                case 15: goto L_0x0214;
                case 16: goto L_0x0237;
                case 17: goto L_0x025c;
                case 18: goto L_0x0287;
                case 19: goto L_0x028a;
                case 20: goto L_0x028d;
                case 21: goto L_0x0290;
                case 22: goto L_0x0293;
                case 23: goto L_0x0296;
                case 24: goto L_0x0299;
                case 25: goto L_0x0a2a;
                case 26: goto L_0x0a5b;
                case 27: goto L_0x0aa7;
                case 28: goto L_0x0ace;
                case 29: goto L_0x02cb;
                case 30: goto L_0x02fb;
                case 31: goto L_0x0326;
                case 32: goto L_0x0358;
                case 33: goto L_0x038a;
                case 34: goto L_0x0af5;
                case 35: goto L_0x03bf;
                case 36: goto L_0x042e;
                case 37: goto L_0x049d;
                case 38: goto L_0x050c;
                case 39: goto L_0x057b;
                case 40: goto L_0x05f1;
                case 41: goto L_0x0658;
                case 42: goto L_0x069d;
                case 43: goto L_0x06e3;
                case 44: goto L_0x0732;
                case 45: goto L_0x078d;
                case 46: goto L_0x07d2;
                case 47: goto L_0x0817;
                case 48: goto L_0x0b2d;
                case 49: goto L_0x0b8c;
                case 50: goto L_0x0870;
                case 51: goto L_0x087e;
                case 52: goto L_0x08a2;
                case 53: goto L_0x08c6;
                case 54: goto L_0x08cd;
                case 55: goto L_0x08eb;
                case 56: goto L_0x08f3;
                case 57: goto L_0x08fb;
                case 58: goto L_0x0903;
                case 59: goto L_0x0922;
                case 60: goto L_0x0942;
                case 61: goto L_0x0955;
                case 62: goto L_0x0968;
                case 63: goto L_0x097e;
                case 64: goto L_0x098f;
                case 65: goto L_0x09a7;
                case 66: goto L_0x09c7;
                case 67: goto L_0x09e2;
                case 68: goto L_0x0a07;
                default: goto L_0x003d;
            }
        L_0x003d:
            int r2 = r2 + 3
            goto L_0x0012
        L_0x0040:
            r17 = r5
            r18 = r2
            r19 = r10
            r16 = r6
            boolean r11 = r16.A0F(r17, r18, r19, r20, r21)
            if (r11 == 0) goto L_0x003d
            X.9CD r11 = X.AnonymousClass9CA.A01
            double r0 = r11.A01(r5, r0)
            X.9gd r11 = r7.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            int r7 = r8 << 3
            r7 = r7 | 1
            r11.A06(r7)
            r11.A09(r0)
            goto L_0x003d
        L_0x0065:
            r17 = r5
            r18 = r2
            r19 = r10
            r16 = r6
            boolean r11 = r16.A0F(r17, r18, r19, r20, r21)
            if (r11 == 0) goto L_0x003d
            X.9CD r11 = X.AnonymousClass9CA.A01
            float r0 = r11.A02(r5, r0)
            X.9gd r7 = r7.A00
            int r1 = java.lang.Float.floatToRawIntBits(r0)
            int r0 = r8 << 3
            r0 = r0 | 5
            r7.A06(r0)
            r7.A05(r1)
            goto L_0x003d
        L_0x008a:
            r17 = r5
            r18 = r2
            r19 = r10
            r16 = r6
            boolean r11 = r16.A0F(r17, r18, r19, r20, r21)
            if (r11 == 0) goto L_0x003d
            long r0 = r3.getLong(r5, r0)
            X.9gd r11 = r7.A00
            int r7 = r8 << 3
            r11.A06(r7)
            r11.A0A(r0)
            goto L_0x003d
        L_0x00a7:
            r17 = r5
            r18 = r2
            r19 = r10
            r16 = r6
            boolean r11 = r16.A0F(r17, r18, r19, r20, r21)
            if (r11 == 0) goto L_0x003d
            long r0 = r3.getLong(r5, r0)
            X.9gd r11 = r7.A00
            int r7 = r8 << 3
            r11.A06(r7)
            r11.A0A(r0)
            goto L_0x003d
        L_0x00c5:
            r17 = r5
            r18 = r2
            r19 = r10
            r16 = r6
            boolean r11 = r16.A0F(r17, r18, r19, r20, r21)
            if (r11 == 0) goto L_0x003d
            int r1 = r3.getInt(r5, r0)
            X.9gd r0 = r7.A00
            r0.A07(r8, r1)
            goto L_0x003d
        L_0x00de:
            r17 = r5
            r18 = r2
            r19 = r10
            r16 = r6
            boolean r11 = r16.A0F(r17, r18, r19, r20, r21)
            if (r11 == 0) goto L_0x003d
            long r0 = r3.getLong(r5, r0)
            X.9gd r11 = r7.A00
            int r7 = r8 << 3
            r7 = r7 | 1
            r11.A06(r7)
            r11.A09(r0)
            goto L_0x003d
        L_0x00fe:
            r17 = r5
            r18 = r2
            r19 = r10
            r16 = r6
            boolean r11 = r16.A0F(r17, r18, r19, r20, r21)
            if (r11 == 0) goto L_0x003d
            int r11 = r3.getInt(r5, r0)
            X.9gd r1 = r7.A00
            int r0 = r8 << 3
            r0 = r0 | 5
            r1.A06(r0)
            r1.A05(r11)
            goto L_0x003d
        L_0x011e:
            r17 = r5
            r18 = r2
            r19 = r10
            r16 = r6
            boolean r11 = r16.A0F(r17, r18, r19, r20, r21)
            if (r11 == 0) goto L_0x003d
            X.9CD r11 = X.AnonymousClass9CA.A01
            boolean r11 = r11.A0I(r5, r0)
            X.9gd r1 = r7.A00
            int r0 = r8 << 3
            r1.A06(r0)
            byte r0 = (byte) r11
            r1.A04(r0)
            goto L_0x003d
        L_0x013f:
            r17 = r5
            r18 = r2
            r19 = r10
            r16 = r6
            boolean r11 = r16.A0F(r17, r18, r19, r20, r21)
            if (r11 == 0) goto L_0x003d
            java.lang.Object r1 = r3.getObject(r5, r0)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x015e
            java.lang.String r1 = (java.lang.String) r1
            X.9gd r0 = r7.A00
            r0.A08(r8, r1)
            goto L_0x003d
        L_0x015e:
            X.97R r1 = (X.AnonymousClass97R) r1
            X.9gd r0 = r7.A00
            r0.A0B(r1, r8)
            goto L_0x003d
        L_0x0167:
            r17 = r5
            r18 = r2
            r19 = r10
            r16 = r6
            boolean r11 = r16.A0F(r17, r18, r19, r20, r21)
            if (r11 == 0) goto L_0x003d
            java.lang.Object r1 = r3.getObject(r5, r0)
            X.9Bg r0 = r6.A03(r2)
            r7.A00(r0, r1, r8)
            goto L_0x003d
        L_0x0182:
            r17 = r5
            r18 = r2
            r19 = r10
            r16 = r6
            boolean r11 = r16.A0F(r17, r18, r19, r20, r21)
            if (r11 == 0) goto L_0x003d
            java.lang.Object r1 = r3.getObject(r5, r0)
            X.97R r1 = (X.AnonymousClass97R) r1
            X.9gd r0 = r7.A00
            r0.A0B(r1, r8)
            goto L_0x003d
        L_0x019d:
            r17 = r5
            r18 = r2
            r19 = r10
            r16 = r6
            boolean r11 = r16.A0F(r17, r18, r19, r20, r21)
            if (r11 == 0) goto L_0x003d
            int r11 = r3.getInt(r5, r0)
            X.9gd r1 = r7.A00
            int r0 = r8 << 3
            r1.A06(r0)
            r1.A06(r11)
            goto L_0x003d
        L_0x01bb:
            r17 = r5
            r18 = r2
            r19 = r10
            r16 = r6
            boolean r11 = r16.A0F(r17, r18, r19, r20, r21)
            if (r11 == 0) goto L_0x003d
            int r1 = r3.getInt(r5, r0)
            X.9gd r0 = r7.A00
            r0.A07(r8, r1)
            goto L_0x003d
        L_0x01d4:
            r17 = r5
            r18 = r2
            r19 = r10
            r16 = r6
            boolean r11 = r16.A0F(r17, r18, r19, r20, r21)
            if (r11 == 0) goto L_0x003d
            int r11 = r3.getInt(r5, r0)
            X.9gd r1 = r7.A00
            int r0 = r8 << 3
            r0 = r0 | 5
            r1.A06(r0)
            r1.A05(r11)
            goto L_0x003d
        L_0x01f4:
            r17 = r5
            r18 = r2
            r19 = r10
            r16 = r6
            boolean r11 = r16.A0F(r17, r18, r19, r20, r21)
            if (r11 == 0) goto L_0x003d
            long r0 = r3.getLong(r5, r0)
            X.9gd r11 = r7.A00
            int r7 = r8 << 3
            r7 = r7 | 1
            r11.A06(r7)
            r11.A09(r0)
            goto L_0x003d
        L_0x0214:
            r17 = r5
            r18 = r2
            r19 = r10
            r16 = r6
            boolean r11 = r16.A0F(r17, r18, r19, r20, r21)
            if (r11 == 0) goto L_0x003d
            int r1 = r3.getInt(r5, r0)
            X.9gd r7 = r7.A00
            int r0 = r1 << 1
            int r1 = r1 >> 31
            r1 = r1 ^ r0
            int r0 = r8 << 3
            r7.A06(r0)
            r7.A06(r1)
            goto L_0x003d
        L_0x0237:
            r17 = r5
            r18 = r2
            r19 = r10
            r16 = r6
            boolean r11 = r16.A0F(r17, r18, r19, r20, r21)
            if (r11 == 0) goto L_0x003d
            long r0 = r3.getLong(r5, r0)
            X.9gd r11 = r7.A00
            r7 = 1
            long r12 = r0 << r7
            r7 = 63
            long r0 = r0 >> r7
            long r0 = r0 ^ r12
            int r7 = r8 << 3
            r11.A06(r7)
            r11.A0A(r0)
            goto L_0x003d
        L_0x025c:
            r17 = r5
            r18 = r2
            r19 = r10
            r16 = r6
            boolean r11 = r16.A0F(r17, r18, r19, r20, r21)
            if (r11 == 0) goto L_0x003d
            java.lang.Object r12 = r3.getObject(r5, r0)
            X.9Bg r11 = r6.A03(r2)
            X.9gd r1 = r7.A00
            int r7 = r8 << 3
            r0 = r7 | 3
            r1.A06(r0)
            X.A8T r0 = r1.A01
            r11.FOD(r0, r12)
            r0 = r7 | 4
            r1.A06(r0)
            goto L_0x003d
        L_0x0287:
            r12 = 0
            goto L_0x03c0
        L_0x028a:
            r8 = 0
            goto L_0x042f
        L_0x028d:
            r12 = 0
            goto L_0x049e
        L_0x0290:
            r12 = 0
            goto L_0x050d
        L_0x0293:
            r13 = 0
            goto L_0x057c
        L_0x0296:
            r12 = 0
            goto L_0x05f2
        L_0x0299:
            r13 = r4[r2]
            java.lang.Object r12 = r3.getObject(r5, r0)
            java.util.List r12 = (java.util.List) r12
            X.9C0 r0 = X.C374949Bl.A01
            if (r12 == 0) goto L_0x003d
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x003d
            r11 = 0
        L_0x02ac:
            int r0 = r12.size()
            if (r11 >= r0) goto L_0x003d
            X.9gd r8 = r7.A00
            java.lang.Object r0 = r12.get(r11)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r0 = r13 << 3
            r0 = r0 | 5
            r8.A06(r0)
            r8.A05(r1)
            int r11 = r11 + 1
            goto L_0x02ac
        L_0x02cb:
            r13 = r4[r2]
            java.lang.Object r12 = r3.getObject(r5, r0)
            java.util.List r12 = (java.util.List) r12
            X.9C0 r0 = X.C374949Bl.A01
            if (r12 == 0) goto L_0x003d
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x003d
            r11 = 0
        L_0x02de:
            int r0 = r12.size()
            if (r11 >= r0) goto L_0x003d
            X.9gd r8 = r7.A00
            java.lang.Object r0 = r12.get(r11)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r0 = r13 << 3
            r8.A06(r0)
            r8.A06(r1)
            int r11 = r11 + 1
            goto L_0x02de
        L_0x02fb:
            r8 = r4[r2]
            java.lang.Object r12 = r3.getObject(r5, r0)
            java.util.List r12 = (java.util.List) r12
            X.9C0 r0 = X.C374949Bl.A01
            if (r12 == 0) goto L_0x003d
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x003d
            r11 = 0
        L_0x030e:
            int r0 = r12.size()
            if (r11 >= r0) goto L_0x003d
            X.9gd r1 = r7.A00
            java.lang.Object r0 = r12.get(r11)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1.A07(r8, r0)
            int r11 = r11 + 1
            goto L_0x030e
        L_0x0326:
            r13 = r4[r2]
            java.lang.Object r12 = r3.getObject(r5, r0)
            java.util.List r12 = (java.util.List) r12
            X.9C0 r0 = X.C374949Bl.A01
            if (r12 == 0) goto L_0x003d
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x003d
            r11 = 0
        L_0x0339:
            int r0 = r12.size()
            if (r11 >= r0) goto L_0x003d
            X.9gd r8 = r7.A00
            java.lang.Object r0 = r12.get(r11)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r0 = r13 << 3
            r0 = r0 | 5
            r8.A06(r0)
            r8.A05(r1)
            int r11 = r11 + 1
            goto L_0x0339
        L_0x0358:
            r14 = r4[r2]
            java.lang.Object r13 = r3.getObject(r5, r0)
            java.util.List r13 = (java.util.List) r13
            X.9C0 r0 = X.C374949Bl.A01
            if (r13 == 0) goto L_0x003d
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x003d
            r12 = 0
        L_0x036b:
            int r0 = r13.size()
            if (r12 >= r0) goto L_0x003d
            X.9gd r11 = r7.A00
            java.lang.Object r0 = r13.get(r12)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            int r8 = r14 << 3
            r8 = r8 | 1
            r11.A06(r8)
            r11.A09(r0)
            int r12 = r12 + 1
            goto L_0x036b
        L_0x038a:
            r13 = r4[r2]
            java.lang.Object r12 = r3.getObject(r5, r0)
            java.util.List r12 = (java.util.List) r12
            X.9C0 r0 = X.C374949Bl.A01
            if (r12 == 0) goto L_0x003d
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x003d
            r11 = 0
        L_0x039d:
            int r0 = r12.size()
            if (r11 >= r0) goto L_0x003d
            X.9gd r8 = r7.A00
            java.lang.Object r0 = r12.get(r11)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r0 = r1 << 1
            int r1 = r1 >> 31
            r1 = r1 ^ r0
            int r0 = r13 << 3
            r8.A06(r0)
            r8.A06(r1)
            int r11 = r11 + 1
            goto L_0x039d
        L_0x03bf:
            r12 = 1
        L_0x03c0:
            r14 = r4[r2]
            java.lang.Object r11 = r3.getObject(r5, r0)
            java.util.List r11 = (java.util.List) r11
            X.9C0 r0 = X.C374949Bl.A01
            if (r11 == 0) goto L_0x003d
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x003d
            r8 = 0
            if (r12 == 0) goto L_0x040b
            X.9gd r7 = r7.A00
            int r0 = r14 << 3
            r0 = r0 | 2
            r7.A06(r0)
            r12 = 0
            r1 = 0
        L_0x03e0:
            int r0 = r11.size()
            if (r12 >= r0) goto L_0x03ee
            r11.get(r12)
            int r1 = r1 + 8
            int r12 = r12 + 1
            goto L_0x03e0
        L_0x03ee:
            r7.A06(r1)
        L_0x03f1:
            int r0 = r11.size()
            if (r8 >= r0) goto L_0x003d
            java.lang.Object r0 = r11.get(r8)
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            r7.A09(r0)
            int r8 = r8 + 1
            goto L_0x03f1
        L_0x040b:
            int r0 = r11.size()
            if (r8 >= r0) goto L_0x003d
            X.9gd r13 = r7.A00
            java.lang.Object r0 = r11.get(r8)
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            int r12 = r14 << 3
            r12 = r12 | 1
            r13.A06(r12)
            r13.A09(r0)
            int r8 = r8 + 1
            goto L_0x040b
        L_0x042e:
            r8 = 1
        L_0x042f:
            r13 = r4[r2]
            java.lang.Object r12 = r3.getObject(r5, r0)
            java.util.List r12 = (java.util.List) r12
            X.9C0 r0 = X.C374949Bl.A01
            if (r12 == 0) goto L_0x003d
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x003d
            r11 = 0
            if (r8 == 0) goto L_0x047a
            X.9gd r1 = r7.A00
            int r0 = r13 << 3
            r0 = r0 | 2
            r1.A06(r0)
            r8 = 0
            r7 = 0
        L_0x044f:
            int r0 = r12.size()
            if (r8 >= r0) goto L_0x045d
            r12.get(r8)
            int r7 = r7 + 4
            int r8 = r8 + 1
            goto L_0x044f
        L_0x045d:
            r1.A06(r7)
        L_0x0460:
            int r0 = r12.size()
            if (r11 >= r0) goto L_0x003d
            java.lang.Object r0 = r12.get(r11)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r1.A05(r0)
            int r11 = r11 + 1
            goto L_0x0460
        L_0x047a:
            int r0 = r12.size()
            if (r11 >= r0) goto L_0x003d
            X.9gd r8 = r7.A00
            java.lang.Object r0 = r12.get(r11)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r1 = java.lang.Float.floatToRawIntBits(r0)
            int r0 = r13 << 3
            r0 = r0 | 5
            r8.A06(r0)
            r8.A05(r1)
            int r11 = r11 + 1
            goto L_0x047a
        L_0x049d:
            r12 = 1
        L_0x049e:
            r14 = r4[r2]
            java.lang.Object r11 = r3.getObject(r5, r0)
            java.util.List r11 = (java.util.List) r11
            X.9C0 r0 = X.C374949Bl.A01
            if (r11 == 0) goto L_0x003d
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x003d
            r8 = 0
            if (r12 == 0) goto L_0x04ef
            X.9gd r7 = r7.A00
            int r0 = r14 << 3
            r0 = r0 | 2
            r7.A06(r0)
            r12 = 0
            r1 = 0
        L_0x04be:
            int r0 = r11.size()
            if (r12 >= r0) goto L_0x04d6
            java.lang.Object r0 = r11.get(r12)
            java.lang.Number r0 = (java.lang.Number) r0
            long r13 = r0.longValue()
            int r0 = X.C384019gd.A01(r13)
            int r1 = r1 + r0
            int r12 = r12 + 1
            goto L_0x04be
        L_0x04d6:
            r7.A06(r1)
        L_0x04d9:
            int r0 = r11.size()
            if (r8 >= r0) goto L_0x003d
            java.lang.Object r0 = r11.get(r8)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r7.A0A(r0)
            int r8 = r8 + 1
            goto L_0x04d9
        L_0x04ef:
            int r0 = r11.size()
            if (r8 >= r0) goto L_0x003d
            X.9gd r13 = r7.A00
            java.lang.Object r0 = r11.get(r8)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            int r12 = r14 << 3
            r13.A06(r12)
            r13.A0A(r0)
            int r8 = r8 + 1
            goto L_0x04ef
        L_0x050c:
            r12 = 1
        L_0x050d:
            r14 = r4[r2]
            java.lang.Object r11 = r3.getObject(r5, r0)
            java.util.List r11 = (java.util.List) r11
            X.9C0 r0 = X.C374949Bl.A01
            if (r11 == 0) goto L_0x003d
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x003d
            r8 = 0
            if (r12 == 0) goto L_0x055e
            X.9gd r7 = r7.A00
            int r0 = r14 << 3
            r0 = r0 | 2
            r7.A06(r0)
            r12 = 0
            r1 = 0
        L_0x052d:
            int r0 = r11.size()
            if (r12 >= r0) goto L_0x0545
            java.lang.Object r0 = r11.get(r12)
            java.lang.Number r0 = (java.lang.Number) r0
            long r13 = r0.longValue()
            int r0 = X.C384019gd.A01(r13)
            int r1 = r1 + r0
            int r12 = r12 + 1
            goto L_0x052d
        L_0x0545:
            r7.A06(r1)
        L_0x0548:
            int r0 = r11.size()
            if (r8 >= r0) goto L_0x003d
            java.lang.Object r0 = r11.get(r8)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r7.A0A(r0)
            int r8 = r8 + 1
            goto L_0x0548
        L_0x055e:
            int r0 = r11.size()
            if (r8 >= r0) goto L_0x003d
            X.9gd r13 = r7.A00
            java.lang.Object r0 = r11.get(r8)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            int r12 = r14 << 3
            r13.A06(r12)
            r13.A0A(r0)
            int r8 = r8 + 1
            goto L_0x055e
        L_0x057b:
            r13 = 1
        L_0x057c:
            r12 = r4[r2]
            java.lang.Object r11 = r3.getObject(r5, r0)
            java.util.List r11 = (java.util.List) r11
            X.9C0 r0 = X.C374949Bl.A01
            if (r11 == 0) goto L_0x003d
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x003d
            r8 = 0
            if (r13 == 0) goto L_0x05d9
            X.9gd r7 = r7.A00
            int r0 = r12 << 3
            r0 = r0 | 2
            r7.A06(r0)
            r12 = 0
            r1 = 0
        L_0x059c:
            int r0 = r11.size()
            if (r12 >= r0) goto L_0x05b9
            java.lang.Object r0 = r11.get(r12)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 < 0) goto L_0x05b6
            int r0 = X.C384019gd.A00(r0)
        L_0x05b2:
            int r1 = r1 + r0
            int r12 = r12 + 1
            goto L_0x059c
        L_0x05b6:
            r0 = 10
            goto L_0x05b2
        L_0x05b9:
            r7.A06(r1)
        L_0x05bc:
            int r0 = r11.size()
            if (r8 >= r0) goto L_0x003d
            java.lang.Object r0 = r11.get(r8)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 < 0) goto L_0x05d4
            r7.A06(r0)
        L_0x05d1:
            int r8 = r8 + 1
            goto L_0x05bc
        L_0x05d4:
            long r0 = (long) r0
            r7.A0A(r0)
            goto L_0x05d1
        L_0x05d9:
            int r0 = r11.size()
            if (r8 >= r0) goto L_0x003d
            X.9gd r1 = r7.A00
            java.lang.Object r0 = r11.get(r8)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1.A07(r12, r0)
            int r8 = r8 + 1
            goto L_0x05d9
        L_0x05f1:
            r12 = 1
        L_0x05f2:
            r14 = r4[r2]
            java.lang.Object r11 = r3.getObject(r5, r0)
            java.util.List r11 = (java.util.List) r11
            X.9C0 r0 = X.C374949Bl.A01
            if (r11 == 0) goto L_0x003d
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x003d
            r8 = 0
            if (r12 == 0) goto L_0x0639
            X.9gd r7 = r7.A00
            int r0 = r14 << 3
            r0 = r0 | 2
            r7.A06(r0)
            r12 = 0
            r1 = 0
        L_0x0612:
            int r0 = r11.size()
            if (r12 >= r0) goto L_0x0620
            r11.get(r12)
            int r1 = r1 + 8
            int r12 = r12 + 1
            goto L_0x0612
        L_0x0620:
            r7.A06(r1)
        L_0x0623:
            int r0 = r11.size()
            if (r8 >= r0) goto L_0x003d
            java.lang.Object r0 = r11.get(r8)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r7.A09(r0)
            int r8 = r8 + 1
            goto L_0x0623
        L_0x0639:
            int r0 = r11.size()
            if (r8 >= r0) goto L_0x003d
            X.9gd r13 = r7.A00
            java.lang.Object r0 = r11.get(r8)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            int r12 = r14 << 3
            r12 = r12 | 1
            r13.A06(r12)
            r13.A09(r0)
            int r8 = r8 + 1
            goto L_0x0639
        L_0x0658:
            r11 = r4[r2]
            java.lang.Object r8 = r3.getObject(r5, r0)
            java.util.List r8 = (java.util.List) r8
            X.9C0 r0 = X.C374949Bl.A01
            if (r8 == 0) goto L_0x003d
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x003d
            r1 = 0
            X.9gd r7 = r7.A00
            int r0 = r11 << 3
            r0 = r0 | 2
            r7.A06(r0)
            r12 = 0
            r11 = 0
        L_0x0676:
            int r0 = r8.size()
            if (r12 >= r0) goto L_0x0684
            r8.get(r12)
            int r11 = r11 + 4
            int r12 = r12 + 1
            goto L_0x0676
        L_0x0684:
            r7.A06(r11)
        L_0x0687:
            int r0 = r8.size()
            if (r1 >= r0) goto L_0x003d
            java.lang.Object r0 = r8.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r7.A05(r0)
            int r1 = r1 + 1
            goto L_0x0687
        L_0x069d:
            r11 = r4[r2]
            java.lang.Object r8 = r3.getObject(r5, r0)
            java.util.List r8 = (java.util.List) r8
            X.9C0 r0 = X.C374949Bl.A01
            if (r8 == 0) goto L_0x003d
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x003d
            r1 = 0
            X.9gd r7 = r7.A00
            int r0 = r11 << 3
            r0 = r0 | 2
            r7.A06(r0)
            r12 = 0
            r11 = 0
        L_0x06bb:
            int r0 = r8.size()
            if (r12 >= r0) goto L_0x06c9
            r8.get(r12)
            int r11 = r11 + 1
            int r12 = r12 + 1
            goto L_0x06bb
        L_0x06c9:
            r7.A06(r11)
        L_0x06cc:
            int r0 = r8.size()
            if (r1 >= r0) goto L_0x003d
            java.lang.Object r0 = r8.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            byte r0 = (byte) r0
            r7.A04(r0)
            int r1 = r1 + 1
            goto L_0x06cc
        L_0x06e3:
            r11 = r4[r2]
            java.lang.Object r8 = r3.getObject(r5, r0)
            java.util.List r8 = (java.util.List) r8
            X.9C0 r0 = X.C374949Bl.A01
            if (r8 == 0) goto L_0x003d
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x003d
            r1 = 0
            X.9gd r7 = r7.A00
            int r0 = r11 << 3
            r0 = r0 | 2
            r7.A06(r0)
            r12 = 0
            r11 = 0
        L_0x0701:
            int r0 = r8.size()
            if (r12 >= r0) goto L_0x0719
            java.lang.Object r0 = r8.get(r12)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = X.C384019gd.A00(r0)
            int r11 = r11 + r0
            int r12 = r12 + 1
            goto L_0x0701
        L_0x0719:
            r7.A06(r11)
        L_0x071c:
            int r0 = r8.size()
            if (r1 >= r0) goto L_0x003d
            java.lang.Object r0 = r8.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r7.A06(r0)
            int r1 = r1 + 1
            goto L_0x071c
        L_0x0732:
            r12 = r4[r2]
            java.lang.Object r11 = r3.getObject(r5, r0)
            java.util.List r11 = (java.util.List) r11
            X.9C0 r0 = X.C374949Bl.A01
            if (r11 == 0) goto L_0x003d
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x003d
            r8 = 0
            X.9gd r7 = r7.A00
            int r0 = r12 << 3
            r0 = r0 | 2
            r7.A06(r0)
            r12 = 0
            r1 = 0
        L_0x0750:
            int r0 = r11.size()
            if (r12 >= r0) goto L_0x076d
            java.lang.Object r0 = r11.get(r12)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 < 0) goto L_0x076a
            int r0 = X.C384019gd.A00(r0)
        L_0x0766:
            int r1 = r1 + r0
            int r12 = r12 + 1
            goto L_0x0750
        L_0x076a:
            r0 = 10
            goto L_0x0766
        L_0x076d:
            r7.A06(r1)
        L_0x0770:
            int r0 = r11.size()
            if (r8 >= r0) goto L_0x003d
            java.lang.Object r0 = r11.get(r8)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 < 0) goto L_0x0788
            r7.A06(r0)
        L_0x0785:
            int r8 = r8 + 1
            goto L_0x0770
        L_0x0788:
            long r0 = (long) r0
            r7.A0A(r0)
            goto L_0x0785
        L_0x078d:
            r11 = r4[r2]
            java.lang.Object r8 = r3.getObject(r5, r0)
            java.util.List r8 = (java.util.List) r8
            X.9C0 r0 = X.C374949Bl.A01
            if (r8 == 0) goto L_0x003d
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x003d
            r1 = 0
            X.9gd r7 = r7.A00
            int r0 = r11 << 3
            r0 = r0 | 2
            r7.A06(r0)
            r12 = 0
            r11 = 0
        L_0x07ab:
            int r0 = r8.size()
            if (r12 >= r0) goto L_0x07b9
            r8.get(r12)
            int r11 = r11 + 4
            int r12 = r12 + 1
            goto L_0x07ab
        L_0x07b9:
            r7.A06(r11)
        L_0x07bc:
            int r0 = r8.size()
            if (r1 >= r0) goto L_0x003d
            java.lang.Object r0 = r8.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r7.A05(r0)
            int r1 = r1 + 1
            goto L_0x07bc
        L_0x07d2:
            r12 = r4[r2]
            java.lang.Object r11 = r3.getObject(r5, r0)
            java.util.List r11 = (java.util.List) r11
            X.9C0 r0 = X.C374949Bl.A01
            if (r11 == 0) goto L_0x003d
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x003d
            r8 = 0
            X.9gd r7 = r7.A00
            int r0 = r12 << 3
            r0 = r0 | 2
            r7.A06(r0)
            r12 = 0
            r1 = 0
        L_0x07f0:
            int r0 = r11.size()
            if (r12 >= r0) goto L_0x07fe
            r11.get(r12)
            int r1 = r1 + 8
            int r12 = r12 + 1
            goto L_0x07f0
        L_0x07fe:
            r7.A06(r1)
        L_0x0801:
            int r0 = r11.size()
            if (r8 >= r0) goto L_0x003d
            java.lang.Object r0 = r11.get(r8)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r7.A09(r0)
            int r8 = r8 + 1
            goto L_0x0801
        L_0x0817:
            r12 = r4[r2]
            java.lang.Object r11 = r3.getObject(r5, r0)
            java.util.List r11 = (java.util.List) r11
            X.9C0 r0 = X.C374949Bl.A01
            if (r11 == 0) goto L_0x003d
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x003d
            r8 = 0
            X.9gd r7 = r7.A00
            int r0 = r12 << 3
            r0 = r0 | 2
            r7.A06(r0)
            r12 = 0
            r1 = 0
        L_0x0835:
            int r0 = r11.size()
            if (r12 >= r0) goto L_0x0852
            java.lang.Object r0 = r11.get(r12)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r13 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r13
            int r0 = X.C384019gd.A00(r0)
            int r1 = r1 + r0
            int r12 = r12 + 1
            goto L_0x0835
        L_0x0852:
            r7.A06(r1)
        L_0x0855:
            int r0 = r11.size()
            if (r8 >= r0) goto L_0x003d
            java.lang.Object r0 = r11.get(r8)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r1 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            r7.A06(r0)
            int r8 = r8 + 1
            goto L_0x0855
        L_0x0870:
            java.lang.Object r0 = r3.getObject(r5, r0)
            if (r0 == 0) goto L_0x003d
            java.lang.String r1 = "getMetadata"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x087e:
            boolean r11 = r6.A0E(r5, r8, r2)
            if (r11 == 0) goto L_0x003d
            X.9CD r11 = X.AnonymousClass9CA.A01
            java.lang.Object r0 = r11.A06(r5, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            X.9gd r11 = r7.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            int r7 = r8 << 3
            r7 = r7 | 1
            r11.A06(r7)
            r11.A09(r0)
            goto L_0x003d
        L_0x08a2:
            boolean r11 = r6.A0E(r5, r8, r2)
            if (r11 == 0) goto L_0x003d
            X.9CD r11 = X.AnonymousClass9CA.A01
            java.lang.Object r0 = r11.A06(r5, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            X.9gd r7 = r7.A00
            int r1 = java.lang.Float.floatToRawIntBits(r0)
            int r0 = r8 << 3
            r0 = r0 | 5
            r7.A06(r0)
            r7.A05(r1)
            goto L_0x003d
        L_0x08c6:
            boolean r11 = r6.A0E(r5, r8, r2)
            if (r11 == 0) goto L_0x003d
            goto L_0x08d3
        L_0x08cd:
            boolean r11 = r6.A0E(r5, r8, r2)
            if (r11 == 0) goto L_0x003d
        L_0x08d3:
            X.9CD r11 = X.AnonymousClass9CA.A01
            java.lang.Object r0 = r11.A06(r5, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            X.9gd r11 = r7.A00
            int r7 = r8 << 3
            r11.A06(r7)
            r11.A0A(r0)
            goto L_0x003d
        L_0x08eb:
            boolean r11 = r6.A0E(r5, r8, r2)
            if (r11 == 0) goto L_0x003d
            goto L_0x0984
        L_0x08f3:
            boolean r11 = r6.A0E(r5, r8, r2)
            if (r11 == 0) goto L_0x003d
            goto L_0x09ad
        L_0x08fb:
            boolean r11 = r6.A0E(r5, r8, r2)
            if (r11 == 0) goto L_0x003d
            goto L_0x0995
        L_0x0903:
            boolean r11 = r6.A0E(r5, r8, r2)
            if (r11 == 0) goto L_0x003d
            X.9CD r11 = X.AnonymousClass9CA.A01
            java.lang.Object r0 = r11.A06(r5, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r11 = r0.booleanValue()
            X.9gd r1 = r7.A00
            int r0 = r8 << 3
            r1.A06(r0)
            byte r0 = (byte) r11
            r1.A04(r0)
            goto L_0x003d
        L_0x0922:
            boolean r11 = r6.A0E(r5, r8, r2)
            if (r11 == 0) goto L_0x003d
            java.lang.Object r1 = r3.getObject(r5, r0)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0939
            java.lang.String r1 = (java.lang.String) r1
            X.9gd r0 = r7.A00
            r0.A08(r8, r1)
            goto L_0x003d
        L_0x0939:
            X.97R r1 = (X.AnonymousClass97R) r1
            X.9gd r0 = r7.A00
            r0.A0B(r1, r8)
            goto L_0x003d
        L_0x0942:
            boolean r11 = r6.A0E(r5, r8, r2)
            if (r11 == 0) goto L_0x003d
            java.lang.Object r1 = r3.getObject(r5, r0)
            X.9Bg r0 = r6.A03(r2)
            r7.A00(r0, r1, r8)
            goto L_0x003d
        L_0x0955:
            boolean r11 = r6.A0E(r5, r8, r2)
            if (r11 == 0) goto L_0x003d
            java.lang.Object r1 = r3.getObject(r5, r0)
            X.97R r1 = (X.AnonymousClass97R) r1
            X.9gd r0 = r7.A00
            r0.A0B(r1, r8)
            goto L_0x003d
        L_0x0968:
            boolean r11 = r6.A0E(r5, r8, r2)
            if (r11 == 0) goto L_0x003d
            int r11 = A01(r5, r0)
            X.9gd r1 = r7.A00
            int r0 = r8 << 3
            r1.A06(r0)
            r1.A06(r11)
            goto L_0x003d
        L_0x097e:
            boolean r11 = r6.A0E(r5, r8, r2)
            if (r11 == 0) goto L_0x003d
        L_0x0984:
            int r1 = A01(r5, r0)
            X.9gd r0 = r7.A00
            r0.A07(r8, r1)
            goto L_0x003d
        L_0x098f:
            boolean r11 = r6.A0E(r5, r8, r2)
            if (r11 == 0) goto L_0x003d
        L_0x0995:
            int r11 = A01(r5, r0)
            X.9gd r1 = r7.A00
            int r0 = r8 << 3
            r0 = r0 | 5
            r1.A06(r0)
            r1.A05(r11)
            goto L_0x003d
        L_0x09a7:
            boolean r11 = r6.A0E(r5, r8, r2)
            if (r11 == 0) goto L_0x003d
        L_0x09ad:
            X.9CD r11 = X.AnonymousClass9CA.A01
            java.lang.Object r0 = r11.A06(r5, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            X.9gd r11 = r7.A00
            int r7 = r8 << 3
            r7 = r7 | 1
            r11.A06(r7)
            r11.A09(r0)
            goto L_0x003d
        L_0x09c7:
            boolean r11 = r6.A0E(r5, r8, r2)
            if (r11 == 0) goto L_0x003d
            int r1 = A01(r5, r0)
            X.9gd r7 = r7.A00
            int r0 = r1 << 1
            int r1 = r1 >> 31
            r1 = r1 ^ r0
            int r0 = r8 << 3
            r7.A06(r0)
            r7.A06(r1)
            goto L_0x003d
        L_0x09e2:
            boolean r11 = r6.A0E(r5, r8, r2)
            if (r11 == 0) goto L_0x003d
            X.9CD r11 = X.AnonymousClass9CA.A01
            java.lang.Object r0 = r11.A06(r5, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            X.9gd r11 = r7.A00
            r7 = 1
            long r12 = r0 << r7
            r7 = 63
            long r0 = r0 >> r7
            long r0 = r0 ^ r12
            int r7 = r8 << 3
            r11.A06(r7)
            r11.A0A(r0)
            goto L_0x003d
        L_0x0a07:
            boolean r11 = r6.A0E(r5, r8, r2)
            if (r11 == 0) goto L_0x003d
            java.lang.Object r12 = r3.getObject(r5, r0)
            X.9Bg r11 = r6.A03(r2)
            X.9gd r1 = r7.A00
            int r7 = r8 << 3
            r0 = r7 | 3
            r1.A06(r0)
            X.A8T r0 = r1.A01
            r11.FOD(r0, r12)
            r0 = r7 | 4
            r1.A06(r0)
            goto L_0x003d
        L_0x0a2a:
            r13 = r4[r2]
            java.lang.Object r12 = r3.getObject(r5, r0)
            java.util.List r12 = (java.util.List) r12
            X.9C0 r0 = X.C374949Bl.A01
            if (r12 == 0) goto L_0x003d
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x003d
            r11 = 0
        L_0x0a3d:
            int r0 = r12.size()
            if (r11 >= r0) goto L_0x003d
            X.9gd r8 = r7.A00
            java.lang.Object r0 = r12.get(r11)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            int r0 = r13 << 3
            r8.A06(r0)
            byte r0 = (byte) r1
            r8.A04(r0)
            int r11 = r11 + 1
            goto L_0x0a3d
        L_0x0a5b:
            r12 = r4[r2]
            java.lang.Object r14 = r3.getObject(r5, r0)
            java.util.List r14 = (java.util.List) r14
            X.9C0 r0 = X.C374949Bl.A01
            if (r14 == 0) goto L_0x003d
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x003d
            boolean r0 = r14 instanceof X.C41844B3l
            r13 = 0
            if (r0 == 0) goto L_0x0a93
            r11 = r14
            X.B3l r11 = (X.C41844B3l) r11
        L_0x0a75:
            int r0 = r14.size()
            if (r13 >= r0) goto L_0x003d
            java.lang.Object r8 = r11.Bjc(r13)
            boolean r1 = r8 instanceof java.lang.String
            X.9gd r0 = r7.A00
            if (r1 == 0) goto L_0x0a8d
            java.lang.String r8 = (java.lang.String) r8
            r0.A08(r12, r8)
        L_0x0a8a:
            int r13 = r13 + 1
            goto L_0x0a75
        L_0x0a8d:
            X.97R r8 = (X.AnonymousClass97R) r8
            r0.A0B(r8, r12)
            goto L_0x0a8a
        L_0x0a93:
            int r0 = r14.size()
            if (r13 >= r0) goto L_0x003d
            X.9gd r1 = r7.A00
            java.lang.Object r0 = r14.get(r13)
            java.lang.String r0 = (java.lang.String) r0
            r1.A08(r12, r0)
            int r13 = r13 + 1
            goto L_0x0a93
        L_0x0aa7:
            r8 = r4[r2]
            java.lang.Object r12 = r3.getObject(r5, r0)
            java.util.List r12 = (java.util.List) r12
            X.9Bg r11 = r6.A03(r2)
            X.9C0 r0 = X.C374949Bl.A01
            if (r12 == 0) goto L_0x003d
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x003d
            r1 = 0
        L_0x0abe:
            int r0 = r12.size()
            if (r1 >= r0) goto L_0x003d
            java.lang.Object r0 = r12.get(r1)
            r7.A00(r11, r0, r8)
            int r1 = r1 + 1
            goto L_0x0abe
        L_0x0ace:
            r8 = r4[r2]
            java.lang.Object r12 = r3.getObject(r5, r0)
            java.util.List r12 = (java.util.List) r12
            X.9C0 r0 = X.C374949Bl.A01
            if (r12 == 0) goto L_0x003d
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x003d
            r11 = 0
        L_0x0ae1:
            int r0 = r12.size()
            if (r11 >= r0) goto L_0x003d
            X.9gd r1 = r7.A00
            java.lang.Object r0 = r12.get(r11)
            X.97R r0 = (X.AnonymousClass97R) r0
            r1.A0B(r0, r8)
            int r11 = r11 + 1
            goto L_0x0ae1
        L_0x0af5:
            r14 = r4[r2]
            java.lang.Object r13 = r3.getObject(r5, r0)
            java.util.List r13 = (java.util.List) r13
            X.9C0 r0 = X.C374949Bl.A01
            if (r13 == 0) goto L_0x003d
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x003d
            r12 = 0
        L_0x0b08:
            int r0 = r13.size()
            if (r12 >= r0) goto L_0x003d
            X.9gd r11 = r7.A00
            java.lang.Object r0 = r13.get(r12)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r8 = 1
            long r16 = r0 << r8
            r8 = 63
            long r0 = r0 >> r8
            long r0 = r0 ^ r16
            int r8 = r14 << 3
            r11.A06(r8)
            r11.A0A(r0)
            int r12 = r12 + 1
            goto L_0x0b08
        L_0x0b2d:
            r13 = r4[r2]
            java.lang.Object r12 = r3.getObject(r5, r0)
            java.util.List r12 = (java.util.List) r12
            X.9C0 r0 = X.C374949Bl.A01
            if (r12 == 0) goto L_0x003d
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x003d
            r11 = 0
            X.9gd r8 = r7.A00
            int r0 = r13 << 3
            r0 = r0 | 2
            r8.A06(r0)
            r7 = 0
            r1 = 0
        L_0x0b4b:
            int r0 = r12.size()
            if (r7 >= r0) goto L_0x0b6c
            java.lang.Object r0 = r12.get(r7)
            java.lang.Number r0 = (java.lang.Number) r0
            long r16 = r0.longValue()
            r0 = 1
            long r13 = r16 << r0
            r0 = 63
            long r16 = r16 >> r0
            long r16 = r16 ^ r13
            int r0 = X.C384019gd.A01(r16)
            int r1 = r1 + r0
            int r7 = r7 + 1
            goto L_0x0b4b
        L_0x0b6c:
            r8.A06(r1)
        L_0x0b6f:
            int r0 = r12.size()
            if (r11 >= r0) goto L_0x003d
            java.lang.Object r0 = r12.get(r11)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r7 = 1
            long r13 = r0 << r7
            r7 = 63
            long r0 = r0 >> r7
            long r0 = r0 ^ r13
            r8.A0A(r0)
            int r11 = r11 + 1
            goto L_0x0b6f
        L_0x0b8c:
            r16 = r4[r2]
            java.lang.Object r12 = r3.getObject(r5, r0)
            java.util.List r12 = (java.util.List) r12
            X.9Bg r11 = r6.A03(r2)
            X.9C0 r0 = X.C374949Bl.A01
            if (r12 == 0) goto L_0x003d
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x003d
            r8 = 0
        L_0x0ba3:
            int r0 = r12.size()
            if (r8 >= r0) goto L_0x003d
            java.lang.Object r13 = r12.get(r8)
            X.9gd r1 = r7.A00
            int r14 = r16 << 3
            r0 = r14 | 3
            r1.A06(r0)
            X.A8T r0 = r1.A01
            r11.FOD(r0, r13)
            r0 = r14 | 4
            r1.A06(r0)
            int r8 = r8 + 1
            goto L_0x0ba3
        L_0x0bc3:
            long r0 = (long) r13
            int r20 = r3.getInt(r5, r0)
            goto L_0x0031
        L_0x0bca:
            r21 = 0
            goto L_0x0038
        L_0x0bce:
            X.972 r5 = (X.AnonymousClass972) r5
            X.975 r0 = r5.unknownFields
            r0.A03(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9C9.FOD(X.A8T, java.lang.Object):void");
    }

    public AnonymousClass9C9(AnonymousClass973 r2, AnonymousClass9CE r3, AnonymousClass9C4 r4, AnonymousClass9C8 r5, AnonymousClass9C3 r6, AnonymousClass9C0 r7, int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, int i3, int i4) {
        this.A06 = iArr;
        this.A08 = objArr;
        this.A02 = i;
        this.A01 = i2;
        this.A0D = r2 instanceof AnonymousClass972;
        this.A07 = iArr2;
        this.A00 = i3;
        this.A03 = i4;
        this.A0B = r6;
        this.A05 = r4;
        this.A0C = r7;
        this.A09 = r3;
        this.A04 = r2;
        this.A0A = r5;
    }

    private Object A04(int i, int i2, Object obj) {
        C374899Bg A032 = A03(i2);
        if (!A0E(obj, i, i2)) {
            return A032.Cr8();
        }
        Object object = A0E.getObject(obj, (long) (this.A06[i2 + 1] & 1048575));
        if (A0D(object)) {
            return object;
        }
        AnonymousClass972 Cr8 = A032.Cr8();
        if (object != null) {
            A032.Co5(Cr8, object);
        }
        return Cr8;
    }

    private Object A05(Object obj, int i) {
        C374899Bg A032 = A03(i);
        long j = (long) (this.A06[i + 1] & 1048575);
        if (!A0C(i, obj)) {
            return A032.Cr8();
        }
        Object object = A0E.getObject(obj, j);
        if (A0D(object)) {
            return object;
        }
        AnonymousClass972 Cr8 = A032.Cr8();
        if (object != null) {
            A032.Co5(Cr8, object);
        }
        return Cr8;
    }

    public static void A09(Object obj) {
        if (!A0D(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append(Pxd.A00(533));
            sb.append(obj);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private boolean A0F(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return A0C(i, obj);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean CVR(Object obj) {
        boolean z;
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        loop0:
        while (true) {
            if (i3 < this.A00) {
                int i4 = this.A07[i3];
                int[] iArr = this.A06;
                int i5 = iArr[i4];
                int i6 = iArr[i4 + 1];
                int i7 = iArr[i4 + 2];
                int i8 = i7 & 1048575;
                int i9 = 1 << (i7 >>> 20);
                Object obj2 = obj;
                if (i8 == i) {
                    i8 = i;
                } else if (i8 != 1048575) {
                    i2 = A0E.getInt(obj, (long) i8);
                }
                if ((268435456 & i6) != 0 && !A0F(obj2, i4, i8, i2, i9)) {
                    break;
                }
                int i10 = (267386880 & i6) >>> 20;
                if (i10 == 9 || i10 == 17) {
                    z = A0F(obj2, i4, i8, i2, i9);
                } else {
                    if (i10 != 27) {
                        if (i10 == 60 || i10 == 68) {
                            z = A0E(obj, i5, i4);
                        } else if (i10 != 49) {
                            if (i10 == 50) {
                                if (!((C41537Avf) AnonymousClass9CA.A01.A06(obj, (long) (i6 & 1048575))).isEmpty()) {
                                    throw new NullPointerException("getMetadata");
                                }
                            } else {
                                continue;
                            }
                            i3++;
                            i = i8;
                        }
                    }
                    List list = (List) AnonymousClass9CA.A01.A06(obj, (long) (i6 & 1048575));
                    if (!list.isEmpty()) {
                        C374899Bg A032 = A03(i4);
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            if (!A032.CVR(list.get(i11))) {
                                break loop0;
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                    i3++;
                    i = i8;
                }
                if (z) {
                    if (!A03(i4).CVR(AnonymousClass9CA.A01.A06(obj, (long) (i6 & 1048575)))) {
                        return false;
                    }
                } else {
                    continue;
                }
                i3++;
                i = i8;
            } else {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0041 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ClW(java.lang.Object r10) {
        /*
            r9 = this;
            boolean r0 = A0D(r10)
            if (r0 == 0) goto L_0x00b5
            boolean r0 = r10 instanceof X.AnonymousClass972
            if (r0 == 0) goto L_0x001e
            r3 = r10
            X.972 r3 = (X.AnonymousClass972) r3
            int r1 = r3.memoizedSerializedSize
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 | r2
            r3.memoizedSerializedSize = r1
            r0 = 0
            r3.memoizedHashCode = r0
            r1 = r1 & r2
            r3.memoizedSerializedSize = r1
        L_0x001e:
            int[] r8 = r9.A06
            int r7 = r8.length
            r6 = 0
        L_0x0022:
            if (r6 >= r7) goto L_0x00aa
            int r0 = r6 + 1
            r1 = r8[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            long r2 = (long) r0
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r1 = r1 & r0
            int r1 = r1 >>> 20
            r0 = 9
            if (r1 == r0) goto L_0x008f
            r0 = 60
            if (r1 == r0) goto L_0x0094
            r0 = 68
            if (r1 == r0) goto L_0x0094
            switch(r1) {
                case 17: goto L_0x008f;
                case 18: goto L_0x0044;
                case 19: goto L_0x0044;
                case 20: goto L_0x0044;
                case 21: goto L_0x0044;
                case 22: goto L_0x0044;
                case 23: goto L_0x0044;
                case 24: goto L_0x0044;
                case 25: goto L_0x0044;
                case 26: goto L_0x0044;
                case 27: goto L_0x0044;
                case 28: goto L_0x0044;
                case 29: goto L_0x0044;
                case 30: goto L_0x0044;
                case 31: goto L_0x0044;
                case 32: goto L_0x0044;
                case 33: goto L_0x0044;
                case 34: goto L_0x0044;
                case 35: goto L_0x0044;
                case 36: goto L_0x0044;
                case 37: goto L_0x0044;
                case 38: goto L_0x0044;
                case 39: goto L_0x0044;
                case 40: goto L_0x0044;
                case 41: goto L_0x0044;
                case 42: goto L_0x0044;
                case 43: goto L_0x0044;
                case 44: goto L_0x0044;
                case 45: goto L_0x0044;
                case 46: goto L_0x0044;
                case 47: goto L_0x0044;
                case 48: goto L_0x0044;
                case 49: goto L_0x0044;
                case 50: goto L_0x007d;
                default: goto L_0x0041;
            }
        L_0x0041:
            int r6 = r6 + 3
            goto L_0x0022
        L_0x0044:
            X.9C4 r0 = r9.A05
            boolean r1 = r0 instanceof X.AnonymousClass9C6
            X.9CD r0 = X.AnonymousClass9CA.A01
            java.lang.Object r4 = r0.A06(r10, r2)
            if (r1 == 0) goto L_0x005c
            X.978 r4 = (X.AnonymousClass978) r4
            X.977 r4 = (X.AnonymousClass977) r4
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x0041
            r0 = 0
            r4.A00 = r0
            goto L_0x0041
        L_0x005c:
            java.util.List r4 = (java.util.List) r4
            boolean r0 = r4 instanceof X.C41844B3l
            if (r0 == 0) goto L_0x006c
            X.B3l r4 = (X.C41844B3l) r4
            X.B3l r0 = r4.CBh()
        L_0x0068:
            X.AnonymousClass9CA.A05(r10, r2, r0)
            goto L_0x0041
        L_0x006c:
            java.lang.Class r1 = X.AnonymousClass9C5.A00
            java.lang.Class r0 = r4.getClass()
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 != 0) goto L_0x0041
            java.util.List r0 = java.util.Collections.unmodifiableList(r4)
            goto L_0x0068
        L_0x007d:
            sun.misc.Unsafe r5 = A0E
            java.lang.Object r4 = r5.getObject(r10, r2)
            if (r4 == 0) goto L_0x0041
            r1 = r4
            X.Avf r1 = (X.C41537Avf) r1
            r0 = 0
            r1.A00 = r0
            r5.putObject(r10, r2, r4)
            goto L_0x0041
        L_0x008f:
            boolean r0 = r9.A0C(r6, r10)
            goto L_0x009a
        L_0x0094:
            r0 = r8[r6]
            boolean r0 = r9.A0E(r10, r0, r6)
        L_0x009a:
            if (r0 == 0) goto L_0x0041
            X.9Bg r1 = r9.A03(r6)
            sun.misc.Unsafe r0 = A0E
            java.lang.Object r0 = r0.getObject(r10, r2)
            r1.ClW(r0)
            goto L_0x0041
        L_0x00aa:
            X.972 r10 = (X.AnonymousClass972) r10
            X.975 r1 = r10.unknownFields
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x00b5
            r0 = 0
            r1.A02 = r0
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9C9.ClW(java.lang.Object):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v60, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v69, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v72, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v101, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: byte} */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r1v23, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r1v30, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r1v34, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r1v66, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0410, code lost:
        if (r9 != 0) goto L_0x04cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0412, code lost:
        X.AnonymousClass9CN.A05(r4, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x041c, code lost:
        throw new java.lang.NullPointerException("addInt");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0456, code lost:
        if (r5 != r1) goto L_0x06a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x05e3, code lost:
        r11.putObject(r7, r1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x05e6, code lost:
        r11.putInt(r7, r26, r23);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x060c, code lost:
        A07(r23, r10, r7, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0665, code lost:
        r1 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0667, code lost:
        if (r39 != 0) goto L_0x066c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0669, code lost:
        if (r0 != r1) goto L_0x0675;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x066b, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x066c, code lost:
        if (r0 > r1) goto L_0x0675;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0672, code lost:
        if (r19 != r25) goto L_0x0675;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0674, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0675, code lost:
        r0 = new java.io.IOException("Failed to parse the message.");
        r0.A00 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x067e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x067f, code lost:
        r1 = new java.io.IOException(X.C273654mx.A00(6));
        r1.A00 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x068c, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x06aa, code lost:
        throw X.AnonymousClass9GO.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b0, code lost:
        r1 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b5, code lost:
        if (r1 == 1048575) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b7, code lost:
        r11.putInt(r7, (long) r1, r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bd, code lost:
        r6 = r8.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c2, code lost:
        if (r6 >= r8.A03) goto L_0x0665;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c4, code lost:
        X.AnonymousClass9CA.A01.A06(r7, (long) (r8.A06[r8.A07[r6] + 1] & 1048575));
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0123, code lost:
        r5 = r0 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0130, code lost:
        r5 = r0 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0199, code lost:
        r11.putObject(r7, r1, r4.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ad, code lost:
        r11.putInt(r7, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01c0, code lost:
        r11.putLong(r7, r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01ea, code lost:
        A0B(r7, r10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01ed, code lost:
        r18 = r18 | r16;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r19v3, types: [byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x064b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ae A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0G(X.AnonymousClass9CM r34, java.lang.Object r35, byte[] r36, int r37, int r38, int r39) {
        /*
            r33 = this;
            r7 = r35
            r5 = r37
            A09(r7)
            sun.misc.Unsafe r11 = A0E
            r2 = -1
            r21 = 0
            r19 = 0
            r18 = 0
            r22 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0013:
            r8 = r33
            r31 = r38
            r25 = r39
            r0 = r31
            if (r5 >= r0) goto L_0x0064
            int r0 = r5 + 1
            r3 = r36
            byte r19 = r36[r5]
            r4 = r34
            if (r19 >= 0) goto L_0x0031
            r1 = r19
            int r0 = X.AnonymousClass9CN.A07(r4, r3, r1, r0)
            int r1 = r4.A00
            r19 = r1
        L_0x0031:
            int r23 = r19 >>> 3
            r9 = r19 & 7
            r24 = 3
            r1 = r23
            if (r1 <= r2) goto L_0x0066
            int r21 = r21 / r24
            int r2 = r8.A02
            if (r1 < r2) goto L_0x063f
            int r2 = r8.A01
            if (r1 > r2) goto L_0x063f
            int[] r5 = r8.A06
            int r1 = r5.length
            int r1 = r1 / 3
            int r2 = r1 + -1
        L_0x004c:
            r1 = r21
            if (r1 > r2) goto L_0x063f
            int r1 = r2 + r21
            int r12 = r1 >>> 1
            int r10 = r12 * 3
            r6 = r5[r10]
            r1 = r23
            if (r1 == r6) goto L_0x006a
            if (r1 >= r6) goto L_0x0061
            int r2 = r12 + -1
            goto L_0x004c
        L_0x0061:
            int r21 = r12 + 1
            goto L_0x004c
        L_0x0064:
            r0 = r5
            goto L_0x00b0
        L_0x0066:
            int r10 = r8.A00(r1)
        L_0x006a:
            r21 = r10
            r1 = -1
            if (r10 == r1) goto L_0x063f
            int[] r6 = r8.A06
            int r1 = r10 + 1
            r12 = r6[r1]
            r1 = 267386880(0xff00000, float:2.3665827E-29)
            r1 = r1 & r12
            int r20 = r1 >>> 20
            r14 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r12 & r14
            long r1 = (long) r1
            r5 = 17
            r13 = r5
            r5 = r20
            if (r5 > r13) goto L_0x01f8
            int r5 = r10 + 2
            r13 = r6[r5]
            int r5 = r13 >>> 20
            r17 = 1
            int r16 = r17 << r5
            r13 = r13 & r14
            r5 = r22
            if (r13 == r5) goto L_0x00a4
            if (r5 == r14) goto L_0x009e
            long r5 = (long) r5
            r15 = r18
            r11.putInt(r7, r5, r15)
        L_0x009e:
            if (r13 != r14) goto L_0x01f1
            r18 = 0
        L_0x00a2:
            r22 = r13
        L_0x00a4:
            r5 = 5
            switch(r20) {
                case 0: goto L_0x00d8;
                case 1: goto L_0x00ee;
                case 2: goto L_0x00fe;
                case 3: goto L_0x00fe;
                case 4: goto L_0x0108;
                case 5: goto L_0x0112;
                case 6: goto L_0x0127;
                case 7: goto L_0x0134;
                case 8: goto L_0x014b;
                case 9: goto L_0x0178;
                case 10: goto L_0x0192;
                case 11: goto L_0x0108;
                case 12: goto L_0x0108;
                case 13: goto L_0x0127;
                case 14: goto L_0x0112;
                case 15: goto L_0x019f;
                case 16: goto L_0x01b1;
                case 17: goto L_0x01cc;
                default: goto L_0x00a8;
            }
        L_0x00a8:
            r2 = r25
            r1 = r19
            if (r1 != r2) goto L_0x0642
            if (r39 == 0) goto L_0x0642
        L_0x00b0:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r22
            if (r1 == r4) goto L_0x00bd
            long r1 = (long) r1
            r3 = r18
            r11.putInt(r7, r1, r3)
        L_0x00bd:
            r5 = 0
            int r6 = r8.A00
        L_0x00c0:
            int r1 = r8.A03
            if (r6 >= r1) goto L_0x0665
            int[] r1 = r8.A07
            r1 = r1[r6]
            int[] r2 = r8.A06
            int r1 = r1 + 1
            r1 = r2[r1]
            r1 = r1 & r4
            long r1 = (long) r1
            X.9CD r3 = X.AnonymousClass9CA.A01
            r3.A06(r7, r1)
            int r6 = r6 + 1
            goto L_0x00c0
        L_0x00d8:
            r5 = r17
            if (r9 != r5) goto L_0x00a8
            long r3 = X.AnonymousClass9CN.A09(r3, r0)
            double r28 = java.lang.Double.longBitsToDouble(r3)
            X.9CD r24 = X.AnonymousClass9CA.A01
            r25 = r7
            r26 = r1
            r24.A09(r25, r26, r28)
            goto L_0x0123
        L_0x00ee:
            if (r9 != r5) goto L_0x00a8
            int r3 = X.AnonymousClass9CN.A08(r3, r0)
            float r4 = java.lang.Float.intBitsToFloat(r3)
            X.9CD r3 = X.AnonymousClass9CA.A01
            r3.A0A(r7, r1, r4)
            goto L_0x0130
        L_0x00fe:
            if (r9 != 0) goto L_0x00a8
            int r5 = X.AnonymousClass9CN.A06(r4, r3, r0)
            long r3 = r4.A01
            goto L_0x01c0
        L_0x0108:
            if (r9 != 0) goto L_0x00a8
            int r5 = X.AnonymousClass9CN.A05(r4, r3, r0)
            int r0 = r4.A00
            goto L_0x01ad
        L_0x0112:
            r5 = r17
            if (r9 != r5) goto L_0x00a8
            long r28 = X.AnonymousClass9CN.A09(r3, r0)
            r24 = r11
            r25 = r7
            r26 = r1
            r24.putLong(r25, r26, r28)
        L_0x0123:
            int r5 = r0 + 8
            goto L_0x01ed
        L_0x0127:
            if (r9 != r5) goto L_0x00a8
            int r3 = X.AnonymousClass9CN.A08(r3, r0)
            r11.putInt(r7, r1, r3)
        L_0x0130:
            int r5 = r0 + 4
            goto L_0x01ed
        L_0x0134:
            if (r9 != 0) goto L_0x00a8
            int r5 = X.AnonymousClass9CN.A06(r4, r3, r0)
            long r3 = r4.A01
            r8 = 0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            r3 = 0
            if (r0 == 0) goto L_0x0144
            r3 = 1
        L_0x0144:
            X.9CD r0 = X.AnonymousClass9CA.A01
            r0.A0E(r7, r1, r3)
            goto L_0x01ed
        L_0x014b:
            r5 = 2
            if (r9 != r5) goto L_0x00a8
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r12 = r12 & r5
            int r5 = X.AnonymousClass9CN.A05(r4, r3, r0)
            int r8 = r4.A00
            if (r12 == 0) goto L_0x0167
            if (r8 < 0) goto L_0x067f
            if (r8 == 0) goto L_0x0173
            X.9CI r0 = X.AnonymousClass9CG.A00
            java.lang.String r6 = r0.A02(r3, r5, r8)
        L_0x0163:
            r4.A02 = r6
            int r5 = r5 + r8
            goto L_0x0199
        L_0x0167:
            if (r8 < 0) goto L_0x067f
            if (r8 == 0) goto L_0x0173
            java.nio.charset.Charset r0 = X.AnonymousClass97S.A04
            java.lang.String r6 = new java.lang.String
            r6.<init>(r3, r5, r8, r0)
            goto L_0x0163
        L_0x0173:
            java.lang.String r0 = ""
            r4.A02 = r0
            goto L_0x0199
        L_0x0178:
            r1 = 2
            if (r9 != r1) goto L_0x00a8
            java.lang.Object r2 = r8.A05(r7, r10)
            X.9Bg r25 = r8.A03(r10)
            r24 = r4
            r26 = r2
            r27 = r3
            r28 = r0
            r29 = r31
            int r5 = X.AnonymousClass9CN.A00(r24, r25, r26, r27, r28, r29)
            goto L_0x01ea
        L_0x0192:
            r5 = 2
            if (r9 != r5) goto L_0x00a8
            int r5 = X.AnonymousClass9CN.A04(r4, r3, r0)
        L_0x0199:
            java.lang.Object r0 = r4.A02
            r11.putObject(r7, r1, r0)
            goto L_0x01ed
        L_0x019f:
            if (r9 != 0) goto L_0x00a8
            int r5 = X.AnonymousClass9CN.A05(r4, r3, r0)
            int r0 = r4.A00
            int r3 = r0 >>> 1
            r0 = r0 & 1
            int r0 = -r0
            r0 = r0 ^ r3
        L_0x01ad:
            r11.putInt(r7, r1, r0)
            goto L_0x01ed
        L_0x01b1:
            if (r9 != 0) goto L_0x00a8
            int r5 = X.AnonymousClass9CN.A06(r4, r3, r0)
            long r8 = r4.A01
            long r12 = r8 >>> r17
            r3 = 1
            long r8 = r8 & r3
            long r3 = -r8
            long r3 = r3 ^ r12
        L_0x01c0:
            r24 = r11
            r25 = r7
            r26 = r1
            r28 = r3
            r24.putLong(r25, r26, r28)
            goto L_0x01ed
        L_0x01cc:
            r1 = r24
            if (r9 != r1) goto L_0x00a8
            java.lang.Object r2 = r8.A05(r7, r10)
            int r1 = r23 << 3
            r30 = r1 | 4
            X.9Bg r25 = r8.A03(r10)
            r24 = r4
            r26 = r2
            r27 = r3
            r28 = r0
            r29 = r31
            int r5 = X.AnonymousClass9CN.A01(r24, r25, r26, r27, r28, r29, r30)
        L_0x01ea:
            r8.A0B(r7, r10, r2)
        L_0x01ed:
            r18 = r18 | r16
            goto L_0x0661
        L_0x01f1:
            long r14 = (long) r13
            int r18 = r11.getInt(r7, r14)
            goto L_0x00a2
        L_0x01f8:
            r5 = 27
            r13 = r5
            r5 = r20
            if (r5 != r13) goto L_0x024c
            r5 = 2
            if (r9 != r5) goto L_0x00a8
            java.lang.Object r9 = r11.getObject(r7, r1)
            X.978 r9 = (X.AnonymousClass978) r9
            r5 = r9
            X.977 r5 = (X.AnonymousClass977) r5
            boolean r5 = r5.A00
            if (r5 != 0) goto L_0x0220
            int r6 = r9.size()
            int r5 = r6 * 2
            if (r6 != 0) goto L_0x0219
            r5 = 10
        L_0x0219:
            X.978 r9 = r9.Coo(r5)
            r11.putObject(r7, r1, r9)
        L_0x0220:
            X.9Bg r6 = r8.A03(r10)
        L_0x0224:
            X.972 r1 = r6.Cr8()
            r12 = r4
            r13 = r6
            r14 = r1
            r15 = r3
            r16 = r0
            r17 = r31
            int r5 = X.AnonymousClass9CN.A00(r12, r13, r14, r15, r16, r17)
            r6.ClW(r1)
            r4.A02 = r1
            r9.add(r1)
            r0 = r31
            if (r5 >= r0) goto L_0x0661
            int r0 = X.AnonymousClass9CN.A05(r4, r3, r5)
            int r2 = r4.A00
            r1 = r19
            if (r1 == r2) goto L_0x0224
            goto L_0x0661
        L_0x024c:
            r5 = 49
            r13 = r5
            r5 = r20
            if (r5 > r13) goto L_0x0495
            long r12 = (long) r12
            java.lang.Object r6 = r11.getObject(r7, r1)
            X.978 r6 = (X.AnonymousClass978) r6
            r5 = r6
            X.977 r5 = (X.AnonymousClass977) r5
            boolean r5 = r5.A00
            r14 = 2
            if (r5 != 0) goto L_0x0273
            int r15 = r6.size()
            int r5 = r15 * 2
            if (r15 != 0) goto L_0x026c
            r5 = 10
        L_0x026c:
            X.978 r6 = r6.Coo(r5)
            r11.putObject(r7, r1, r6)
        L_0x0273:
            r2 = 5
            r1 = 1
            switch(r20) {
                case 18: goto L_0x0295;
                case 19: goto L_0x02b2;
                case 20: goto L_0x02cf;
                case 21: goto L_0x02cf;
                case 22: goto L_0x02f2;
                case 23: goto L_0x0278;
                case 24: goto L_0x0308;
                case 25: goto L_0x0325;
                case 26: goto L_0x0348;
                case 27: goto L_0x0467;
                case 28: goto L_0x03be;
                case 29: goto L_0x02f2;
                case 30: goto L_0x03f4;
                case 31: goto L_0x0308;
                case 32: goto L_0x0278;
                case 33: goto L_0x041d;
                case 34: goto L_0x0440;
                case 35: goto L_0x0295;
                case 36: goto L_0x02b2;
                case 37: goto L_0x02cf;
                case 38: goto L_0x02cf;
                case 39: goto L_0x02f2;
                case 40: goto L_0x0278;
                case 41: goto L_0x0308;
                case 42: goto L_0x0325;
                case 43: goto L_0x02f2;
                case 44: goto L_0x03f4;
                case 45: goto L_0x0308;
                case 46: goto L_0x0278;
                case 47: goto L_0x041d;
                case 48: goto L_0x0440;
                case 49: goto L_0x0612;
                default: goto L_0x0278;
            }
        L_0x0278:
            if (r9 != r14) goto L_0x028b
            int r5 = X.AnonymousClass9CN.A05(r4, r3, r0)
            int r1 = r4.A00
            int r1 = r1 + r5
            if (r5 >= r1) goto L_0x0456
            java.lang.String r0 = "addLong"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x028b:
            if (r9 != r1) goto L_0x04cd
            java.lang.String r1 = "addLong"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0295:
            if (r9 != r14) goto L_0x02a8
            int r5 = X.AnonymousClass9CN.A05(r4, r3, r0)
            int r1 = r4.A00
            int r1 = r1 + r5
            if (r5 >= r1) goto L_0x0456
            java.lang.String r0 = "addDouble"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x02a8:
            if (r9 != r1) goto L_0x04cd
            java.lang.String r1 = "addDouble"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x02b2:
            if (r9 != r14) goto L_0x02c5
            int r5 = X.AnonymousClass9CN.A05(r4, r3, r0)
            int r1 = r4.A00
            int r1 = r1 + r5
            if (r5 >= r1) goto L_0x0456
            java.lang.String r0 = "addFloat"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x02c5:
            if (r9 != r2) goto L_0x04cd
            java.lang.String r1 = "addFloat"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x02cf:
            if (r9 != r14) goto L_0x02e5
            int r5 = X.AnonymousClass9CN.A05(r4, r3, r0)
            int r1 = r4.A00
            int r1 = r1 + r5
            if (r5 >= r1) goto L_0x0456
            X.AnonymousClass9CN.A06(r4, r3, r5)
            java.lang.String r0 = "addLong"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x02e5:
            if (r9 != 0) goto L_0x04cd
            X.AnonymousClass9CN.A06(r4, r3, r0)
            java.lang.String r1 = "addLong"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x02f2:
            if (r9 != r14) goto L_0x0410
            int r5 = X.AnonymousClass9CN.A05(r4, r3, r0)
            int r1 = r4.A00
            int r1 = r1 + r5
            if (r5 >= r1) goto L_0x0456
            X.AnonymousClass9CN.A05(r4, r3, r5)
            java.lang.String r0 = "addInt"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x0308:
            if (r9 != r14) goto L_0x031b
            int r5 = X.AnonymousClass9CN.A05(r4, r3, r0)
            int r1 = r4.A00
            int r1 = r1 + r5
            if (r5 >= r1) goto L_0x0456
            java.lang.String r0 = "addInt"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x031b:
            if (r9 != r2) goto L_0x04cd
            java.lang.String r1 = "addInt"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0325:
            if (r9 != r14) goto L_0x033b
            int r5 = X.AnonymousClass9CN.A05(r4, r3, r0)
            int r1 = r4.A00
            int r1 = r1 + r5
            if (r5 >= r1) goto L_0x0456
            X.AnonymousClass9CN.A06(r4, r3, r5)
            java.lang.String r0 = "addBoolean"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x033b:
            if (r9 != 0) goto L_0x04cd
            X.AnonymousClass9CN.A06(r4, r3, r0)
            java.lang.String r1 = "addBoolean"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0348:
            if (r9 != r14) goto L_0x04cd
            r1 = 536870912(0x20000000, double:2.652494739E-315)
            long r12 = r12 & r1
            r14 = 0
            int r1 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            int r5 = X.AnonymousClass9CN.A05(r4, r3, r0)
            if (r1 != 0) goto L_0x0386
            int r9 = r4.A00
            if (r9 < 0) goto L_0x067f
            java.lang.String r12 = ""
        L_0x035e:
            if (r9 != 0) goto L_0x037a
            r6.add(r12)
        L_0x0363:
            r1 = r31
            if (r5 >= r1) goto L_0x063a
            int r9 = X.AnonymousClass9CN.A05(r4, r3, r5)
            int r2 = r4.A00
            r1 = r19
            if (r1 != r2) goto L_0x063a
            int r5 = X.AnonymousClass9CN.A05(r4, r3, r9)
            int r9 = r4.A00
            if (r9 < 0) goto L_0x067f
            goto L_0x035e
        L_0x037a:
            java.nio.charset.Charset r2 = X.AnonymousClass97S.A04
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3, r5, r9, r2)
            r6.add(r1)
            int r5 = r5 + r9
            goto L_0x0363
        L_0x0386:
            int r13 = r4.A00
            if (r13 < 0) goto L_0x0698
            java.lang.String r9 = ""
        L_0x038c:
            if (r13 != 0) goto L_0x03a8
            r6.add(r9)
        L_0x0391:
            r1 = r31
            if (r5 >= r1) goto L_0x063a
            int r12 = X.AnonymousClass9CN.A05(r4, r3, r5)
            int r2 = r4.A00
            r1 = r19
            if (r1 != r2) goto L_0x063a
            int r5 = X.AnonymousClass9CN.A05(r4, r3, r12)
            int r13 = r4.A00
            if (r13 < 0) goto L_0x0698
            goto L_0x038c
        L_0x03a8:
            int r12 = r5 + r13
            X.9CI r1 = X.AnonymousClass9CG.A00
            int r1 = r1.A01(r3, r5, r12)
            if (r1 != 0) goto L_0x068d
            java.nio.charset.Charset r2 = X.AnonymousClass97S.A04
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3, r5, r13, r2)
            r6.add(r1)
            r5 = r12
            goto L_0x0391
        L_0x03be:
            if (r9 != r14) goto L_0x04cd
            int r5 = X.AnonymousClass9CN.A05(r4, r3, r0)
            int r2 = r4.A00
            if (r2 < 0) goto L_0x0698
            int r12 = r3.length
        L_0x03c9:
            int r1 = r12 - r5
            if (r2 > r1) goto L_0x06a6
            if (r2 != 0) goto L_0x03eb
            X.97R r1 = X.AnonymousClass97R.A01
            r6.add(r1)
        L_0x03d4:
            r1 = r31
            if (r5 >= r1) goto L_0x063a
            int r9 = X.AnonymousClass9CN.A05(r4, r3, r5)
            int r2 = r4.A00
            r1 = r19
            if (r1 != r2) goto L_0x063a
            int r5 = X.AnonymousClass9CN.A05(r4, r3, r9)
            int r2 = r4.A00
            if (r2 < 0) goto L_0x0698
            goto L_0x03c9
        L_0x03eb:
            X.97V r1 = X.AnonymousClass97R.A01(r3, r5, r2)
            r6.add(r1)
            int r5 = r5 + r2
            goto L_0x03d4
        L_0x03f4:
            if (r9 != r14) goto L_0x0410
            int r5 = X.AnonymousClass9CN.A05(r4, r3, r0)
            int r1 = r4.A00
            int r1 = r1 + r5
            if (r5 >= r1) goto L_0x040a
            X.AnonymousClass9CN.A05(r4, r3, r5)
            java.lang.String r0 = "addInt"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x040a:
            if (r5 != r1) goto L_0x06a6
            X.9C0 r1 = X.C374949Bl.A01
            goto L_0x063a
        L_0x0410:
            if (r9 != 0) goto L_0x04cd
            X.AnonymousClass9CN.A05(r4, r3, r0)
            java.lang.String r1 = "addInt"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x041d:
            if (r9 != r14) goto L_0x0433
            int r5 = X.AnonymousClass9CN.A05(r4, r3, r0)
            int r1 = r4.A00
            int r1 = r1 + r5
            if (r5 >= r1) goto L_0x0456
            X.AnonymousClass9CN.A05(r4, r3, r5)
            java.lang.String r0 = "addInt"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x0433:
            if (r9 != 0) goto L_0x04cd
            X.AnonymousClass9CN.A05(r4, r3, r0)
            java.lang.String r1 = "addInt"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0440:
            if (r9 != r14) goto L_0x045a
            int r5 = X.AnonymousClass9CN.A05(r4, r3, r0)
            int r1 = r4.A00
            int r1 = r1 + r5
            if (r5 >= r1) goto L_0x0456
            X.AnonymousClass9CN.A06(r4, r3, r5)
            java.lang.String r0 = "addLong"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x0456:
            if (r5 != r1) goto L_0x06a6
            goto L_0x063a
        L_0x045a:
            if (r9 != 0) goto L_0x04cd
            X.AnonymousClass9CN.A06(r4, r3, r0)
            java.lang.String r1 = "addLong"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0467:
            if (r9 != r14) goto L_0x04cd
            X.9Bg r9 = r8.A03(r10)
            r16 = r0
        L_0x046f:
            X.972 r1 = r9.Cr8()
            r12 = r4
            r13 = r9
            r14 = r1
            r15 = r3
            r17 = r31
            int r5 = X.AnonymousClass9CN.A00(r12, r13, r14, r15, r16, r17)
            r9.ClW(r1)
            r4.A02 = r1
            r6.add(r1)
            r1 = r31
            if (r5 >= r1) goto L_0x063a
            int r16 = X.AnonymousClass9CN.A05(r4, r3, r5)
            int r2 = r4.A00
            r1 = r19
            if (r1 == r2) goto L_0x046f
            goto L_0x063a
        L_0x0495:
            r5 = 50
            r13 = r5
            r5 = r20
            if (r5 != r13) goto L_0x04c0
            r5 = 2
            if (r9 != r5) goto L_0x00a8
            java.lang.Object r3 = r11.getObject(r7, r1)
            r0 = r3
            X.Avf r0 = (X.C41537Avf) r0
            boolean r0 = r0.A00
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x04b8
            X.Avf r0 = X.C41537Avf.A01
            X.Avf r0 = r0.A02()
            X.AnonymousClass9C8.A00(r0, r3)
            r11.putObject(r7, r1, r0)
        L_0x04b8:
            java.lang.String r1 = "getMetadata"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x04c0:
            int r5 = r10 + 2
            r5 = r6[r5]
            r5 = r5 & r14
            long r5 = (long) r5
            r26 = r5
            r6 = 5
            r5 = 2
            switch(r20) {
                case 51: goto L_0x04d0;
                case 52: goto L_0x04e6;
                case 53: goto L_0x04fb;
                case 54: goto L_0x04fb;
                case 55: goto L_0x0509;
                case 56: goto L_0x0517;
                case 57: goto L_0x0529;
                case 58: goto L_0x053a;
                case 59: goto L_0x0550;
                case 60: goto L_0x0587;
                case 61: goto L_0x059f;
                case 62: goto L_0x0509;
                case 63: goto L_0x05ab;
                case 64: goto L_0x0529;
                case 65: goto L_0x0517;
                case 66: goto L_0x05bb;
                case 67: goto L_0x05ce;
                case 68: goto L_0x05ee;
                default: goto L_0x04cd;
            }
        L_0x04cd:
            r5 = r0
            goto L_0x063a
        L_0x04d0:
            r5 = 1
            if (r9 != r5) goto L_0x04cd
            long r5 = X.AnonymousClass9CN.A09(r3, r0)
            double r5 = java.lang.Double.longBitsToDouble(r5)
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            r11.putObject(r7, r1, r5)
            int r5 = r0 + 8
            goto L_0x05e6
        L_0x04e6:
            if (r9 != r6) goto L_0x04cd
            int r5 = X.AnonymousClass9CN.A08(r3, r0)
            float r5 = java.lang.Float.intBitsToFloat(r5)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r11.putObject(r7, r1, r5)
            int r5 = r0 + 4
            goto L_0x05e6
        L_0x04fb:
            if (r9 != 0) goto L_0x04cd
            int r5 = X.AnonymousClass9CN.A06(r4, r3, r0)
            long r12 = r4.A01
            java.lang.Long r6 = java.lang.Long.valueOf(r12)
            goto L_0x05e3
        L_0x0509:
            if (r9 != 0) goto L_0x04cd
            int r5 = X.AnonymousClass9CN.A05(r4, r3, r0)
            int r6 = r4.A00
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x05e3
        L_0x0517:
            r5 = 1
            if (r9 != r5) goto L_0x04cd
            long r5 = X.AnonymousClass9CN.A09(r3, r0)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r11.putObject(r7, r1, r5)
            int r5 = r0 + 8
            goto L_0x05e6
        L_0x0529:
            if (r9 != r6) goto L_0x04cd
            int r5 = X.AnonymousClass9CN.A08(r3, r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r11.putObject(r7, r1, r5)
            int r5 = r0 + 4
            goto L_0x05e6
        L_0x053a:
            if (r9 != 0) goto L_0x04cd
            int r5 = X.AnonymousClass9CN.A06(r4, r3, r0)
            long r12 = r4.A01
            r14 = 0
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            r6 = 0
            if (r9 == 0) goto L_0x054a
            r6 = 1
        L_0x054a:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto L_0x05e3
        L_0x0550:
            if (r9 != r5) goto L_0x04cd
            int r5 = X.AnonymousClass9CN.A05(r4, r3, r0)
            int r13 = r4.A00
            if (r13 != 0) goto L_0x0561
            java.lang.String r6 = ""
            r11.putObject(r7, r1, r6)
            goto L_0x05e6
        L_0x0561:
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            r12 = r12 & r6
            if (r12 == 0) goto L_0x057b
            int r9 = r5 + r13
            X.9CI r6 = X.AnonymousClass9CG.A00
            int r6 = r6.A01(r3, r5, r9)
            if (r6 == 0) goto L_0x057b
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            X.9GO r1 = new X.9GO
            r1.<init>(r0)
            r0 = 0
            r1.A00 = r0
            throw r1
        L_0x057b:
            java.nio.charset.Charset r9 = X.AnonymousClass97S.A04
            java.lang.String r6 = new java.lang.String
            r6.<init>(r3, r5, r13, r9)
            r11.putObject(r7, r1, r6)
            int r5 = r5 + r13
            goto L_0x05e6
        L_0x0587:
            if (r9 != r5) goto L_0x04cd
            r1 = r23
            java.lang.Object r2 = r8.A04(r1, r10, r7)
            X.9Bg r13 = r8.A03(r10)
            r12 = r4
            r14 = r2
            r15 = r3
            r16 = r0
            r17 = r31
            int r5 = X.AnonymousClass9CN.A00(r12, r13, r14, r15, r16, r17)
            goto L_0x060c
        L_0x059f:
            if (r9 != r5) goto L_0x04cd
            int r5 = X.AnonymousClass9CN.A04(r4, r3, r0)
            java.lang.Object r6 = r4.A02
            r11.putObject(r7, r1, r6)
            goto L_0x05e6
        L_0x05ab:
            if (r9 != 0) goto L_0x04cd
            int r5 = X.AnonymousClass9CN.A05(r4, r3, r0)
            int r6 = r4.A00
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r11.putObject(r7, r1, r6)
            goto L_0x05e6
        L_0x05bb:
            if (r9 != 0) goto L_0x04cd
            int r5 = X.AnonymousClass9CN.A05(r4, r3, r0)
            int r6 = r4.A00
            int r9 = r6 >>> 1
            r6 = r6 & 1
            int r6 = -r6
            r6 = r6 ^ r9
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x05e3
        L_0x05ce:
            if (r9 != 0) goto L_0x04cd
            int r5 = X.AnonymousClass9CN.A06(r4, r3, r0)
            long r12 = r4.A01
            r6 = 1
            long r16 = r12 >>> r6
            r14 = 1
            long r12 = r12 & r14
            long r14 = -r12
            long r14 = r14 ^ r16
            java.lang.Long r6 = java.lang.Long.valueOf(r14)
        L_0x05e3:
            r11.putObject(r7, r1, r6)
        L_0x05e6:
            r1 = r26
            r6 = r23
            r11.putInt(r7, r1, r6)
            goto L_0x063a
        L_0x05ee:
            r1 = r24
            if (r9 != r1) goto L_0x04cd
            r1 = r23
            java.lang.Object r2 = r8.A04(r1, r10, r7)
            r1 = r19 & -8
            r32 = r1 | 4
            X.9Bg r27 = r8.A03(r10)
            r26 = r4
            r28 = r2
            r29 = r3
            r30 = r0
            int r5 = X.AnonymousClass9CN.A01(r26, r27, r28, r29, r30, r31, r32)
        L_0x060c:
            r1 = r23
            r8.A07(r1, r10, r7, r2)
            goto L_0x063a
        L_0x0612:
            r1 = r24
            if (r9 != r1) goto L_0x04cd
            X.9Bg r13 = r8.A03(r10)
            r15 = r0
            r1 = r19 & -8
            r17 = r1 | 4
        L_0x061f:
            r12 = r4
            r14 = r3
            r16 = r31
            int r5 = X.AnonymousClass9CN.A02(r12, r13, r14, r15, r16, r17)
            java.lang.Object r1 = r4.A02
            r6.add(r1)
            r1 = r31
            if (r5 >= r1) goto L_0x063a
            int r15 = X.AnonymousClass9CN.A05(r4, r3, r5)
            int r2 = r4.A00
            r1 = r19
            if (r1 == r2) goto L_0x061f
        L_0x063a:
            if (r5 != r0) goto L_0x0661
            r0 = r5
            goto L_0x00a8
        L_0x063f:
            r10 = 0
            goto L_0x00a8
        L_0x0642:
            r5 = r7
            X.972 r5 = (X.AnonymousClass972) r5
            X.975 r1 = r5.unknownFields
            X.975 r2 = X.AnonymousClass975.A05
            if (r1 != r2) goto L_0x0652
            X.975 r1 = new X.975
            r1.<init>()
            r5.unknownFields = r1
        L_0x0652:
            r12 = r4
            r13 = r1
            r14 = r3
            r15 = r19
            r16 = r0
            r17 = r31
            int r5 = X.AnonymousClass9CN.A03(r12, r13, r14, r15, r16, r17)
            r21 = r10
        L_0x0661:
            r2 = r23
            goto L_0x0013
        L_0x0665:
            r1 = r31
            if (r39 != 0) goto L_0x066c
            if (r0 != r1) goto L_0x0675
            return r0
        L_0x066c:
            if (r0 > r1) goto L_0x0675
            r2 = r25
            r1 = r19
            if (r1 != r2) goto L_0x0675
            return r0
        L_0x0675:
            java.lang.String r1 = "Failed to parse the message."
            X.9GO r0 = new X.9GO
            r0.<init>(r1)
            r0.A00 = r5
            throw r0
        L_0x067f:
            r0 = 6
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.9GO r1 = new X.9GO
            r1.<init>(r0)
            r0 = 0
            r1.A00 = r0
            throw r1
        L_0x068d:
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            X.9GO r1 = new X.9GO
            r1.<init>(r0)
            r0 = 0
            r1.A00 = r0
            throw r1
        L_0x0698:
            r0 = 6
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.9GO r1 = new X.9GO
            r1.<init>(r0)
            r0 = 0
            r1.A00 = r0
            throw r1
        L_0x06a6:
            X.9GO r1 = X.AnonymousClass9GO.A01()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9C9.A0G(X.9CM, java.lang.Object, byte[], int, int, int):int");
    }
}

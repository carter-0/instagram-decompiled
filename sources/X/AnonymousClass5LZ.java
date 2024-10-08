package X;

import java.lang.reflect.Field;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: X.5LZ  reason: invalid class name */
public final class AnonymousClass5LZ implements AnonymousClass5L3 {
    public static final Unsafe A0F = C284115La.A06();
    public static final int[] A0G = new int[0];
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AnonymousClass5LR A04;
    public final AnonymousClass5LY A05;
    public final C284005Km A06;
    public final boolean A07;
    public final int[] A08;
    public final int[] A09;
    public final Object[] A0A;
    public final AnonymousClass5LV A0B;
    public final AnonymousClass5LQ A0C;
    public final AnonymousClass5L5 A0D;
    public final boolean A0E;

    public static Field A04(Class cls, String str) {
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

    public final boolean CVR(Object obj) {
        int i;
        boolean z;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < this.A00; i4++) {
            int i5 = this.A09[i4];
            int[] iArr = this.A08;
            int i6 = iArr[i5];
            int i7 = iArr[i5 + 1];
            boolean z2 = this.A07;
            if (!z2) {
                int i8 = iArr[i5 + 2];
                int i9 = 1048575 & i8;
                i = 1 << (i8 >>> 20);
                if (i9 != i2) {
                    i3 = A0F.getInt(obj, (long) i9);
                    i2 = i9;
                }
            } else {
                i = 0;
            }
            if ((268435456 & i7) != 0) {
                if (z2) {
                    if (!A08(i5, obj)) {
                        return false;
                    }
                } else if ((i3 & i) == 0) {
                    return false;
                }
            }
            int i10 = (267386880 & i7) >>> 20;
            if (i10 != 9 && i10 != 17) {
                if (i10 != 27) {
                    if (i10 == 60 || i10 == 68) {
                        z = A09(obj, i6, i5);
                    } else if (i10 != 49) {
                        if (i10 == 50) {
                            C284025Kp r2 = (C284025Kp) C284115La.A01.A06(obj, (long) (i7 & 1048575));
                            if (!r2.isEmpty() && ((AnonymousClass5LK) this.A0A[(i5 / 3) * 2]).A00.A01.A01 == AnonymousClass5L8.MESSAGE) {
                                AnonymousClass5L3 r1 = null;
                                for (Object next : r2.values()) {
                                    if (r1 == null) {
                                        r1 = C284075Kw.A02.A00(next.getClass());
                                    }
                                    if (!r1.CVR(next)) {
                                        return false;
                                    }
                                }
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                List list = (List) C284115La.A01.A06(obj, (long) (i7 & 1048575));
                if (!list.isEmpty()) {
                    AnonymousClass5L3 A032 = A03(i5);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!A032.CVR(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (z2) {
                z = A08(i5, obj);
            } else {
                z = i3 & i;
            }
            if (z) {
                if (!A03(i5).CVR(C284115La.A01.A06(obj, (long) (i7 & 1048575)))) {
                    return false;
                }
            } else {
                continue;
            }
        }
        return true;
    }

    public static int A00(Object obj, long j) {
        return ((Number) C284115La.A01.A06(obj, j)).intValue();
    }

    public static long A01(Object obj, long j) {
        return ((Number) C284115La.A01.A06(obj, j)).longValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x017d, code lost:
        if ((r11 & 1) == 1) goto L_0x017f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass5LZ A02(X.AnonymousClass5LV r43, X.AnonymousClass5LR r44, X.AnonymousClass5LY r45, X.AnonymousClass5LN r46, X.AnonymousClass5LQ r47, X.AnonymousClass5L5 r48) {
        /*
            r7 = r46
            boolean r0 = r7 instanceof X.AnonymousClass5LM
            if (r0 == 0) goto L_0x037e
            X.5LM r7 = (X.AnonymousClass5LM) r7
            int r0 = r7.A00
            r29 = 1
            r1 = r0 & 1
            r0 = r29
            if (r1 != r0) goto L_0x0041
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x0014:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r3 = 0
            r42 = 0
            if (r1 != r0) goto L_0x001d
            r42 = 1
        L_0x001d:
            java.lang.String r13 = r7.A02
            int r28 = r13.length()
            char r11 = r13.charAt(r3)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r11 < r12) goto L_0x0044
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r0 = 1
            r2 = 13
        L_0x0031:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x0046
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r2
            r11 = r11 | r0
            int r2 = r2 + 13
            r0 = r1
            goto L_0x0031
        L_0x0041:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x0014
        L_0x0044:
            r1 = 1
            goto L_0x0048
        L_0x0046:
            int r0 = r0 << r2
            r11 = r11 | r0
        L_0x0048:
            int r2 = r1 + 1
            char r5 = r13.charAt(r1)
            if (r5 < r12) goto L_0x0067
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r4 = 13
        L_0x0054:
            int r1 = r2 + 1
            char r0 = r13.charAt(r2)
            if (r0 < r12) goto L_0x0064
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r4
            r5 = r5 | r0
            int r4 = r4 + 13
            r2 = r1
            goto L_0x0054
        L_0x0064:
            int r0 = r0 << r4
            r5 = r5 | r0
            r2 = r1
        L_0x0067:
            if (r5 != 0) goto L_0x025e
            int[] r27 = A0G
            r4 = 0
            r5 = 0
            r14 = 0
            r6 = 0
            r15 = 0
            r1 = 0
        L_0x0071:
            sun.misc.Unsafe r26 = A0F
            java.lang.Object[] r10 = r7.A03
            X.5Km r0 = r7.A01
            r32 = r0
            java.lang.Class r25 = r32.getClass()
            int r0 = r6 * 3
            int[] r0 = new int[r0]
            r24 = r0
            int r0 = r6 * 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r23 = r0
            int r41 = r1 + r5
            r22 = r1
            r21 = r41
            r20 = 0
            r17 = 0
        L_0x0093:
            r0 = r28
            if (r2 >= r0) goto L_0x0362
            int r0 = r2 + 1
            char r9 = r13.charAt(r2)
            if (r9 < r12) goto L_0x00b6
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r2 = r0
            r5 = 13
        L_0x00a4:
            int r0 = r0 + 1
            char r2 = r13.charAt(r2)
            if (r2 < r12) goto L_0x00b4
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r5
            r9 = r9 | r2
            int r5 = r5 + 13
            r2 = r0
            goto L_0x00a4
        L_0x00b4:
            int r2 = r2 << r5
            r9 = r9 | r2
        L_0x00b6:
            int r5 = r0 + 1
            char r8 = r13.charAt(r0)
            if (r8 < r12) goto L_0x00d5
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r0 = r5
            r2 = 13
        L_0x00c3:
            int r5 = r5 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x00d3
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r2
            r8 = r8 | r0
            int r2 = r2 + 13
            r0 = r5
            goto L_0x00c3
        L_0x00d3:
            int r0 = r0 << r2
            r8 = r8 | r0
        L_0x00d5:
            r7 = r8 & 255(0xff, float:3.57E-43)
            r0 = r8 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x00e1
            int r0 = r20 + 1
            r27[r20] = r17
            r20 = r0
        L_0x00e1:
            r0 = 51
            if (r7 < r0) goto L_0x0102
            int r2 = r5 + 1
            char r5 = r13.charAt(r5)
            if (r5 < r12) goto L_0x01d9
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x00f1:
            int r6 = r2 + 1
            char r0 = r13.charAt(r2)
            if (r0 < r12) goto L_0x01d5
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r16
            r5 = r5 | r0
            int r16 = r16 + 13
            r2 = r6
            goto L_0x00f1
        L_0x0102:
            int r19 = r15 + 1
            r2 = r10[r15]
            java.lang.String r2 = (java.lang.String) r2
            r0 = r25
            java.lang.reflect.Field r6 = A04(r0, r2)
            r2 = 49
            r0 = 9
            if (r7 == r0) goto L_0x0191
            r0 = 17
            if (r7 == r0) goto L_0x0191
            r0 = 27
            if (r7 == r0) goto L_0x017f
            if (r7 == r2) goto L_0x017f
            r0 = 12
            if (r7 == r0) goto L_0x0179
            r0 = 30
            if (r7 == r0) goto L_0x0179
            r0 = 44
            if (r7 == r0) goto L_0x0179
            r0 = 50
            if (r7 != r0) goto L_0x014a
            int r15 = r22 + 1
            r27[r22] = r17
            int r0 = r17 / 3
            int r2 = r0 * 2
            int r16 = r19 + 1
            r0 = r10[r19]
            r23[r2] = r0
            r0 = r8 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x018c
            int r2 = r2 + 1
            int r19 = r16 + 1
            r0 = r10[r16]
            r23[r2] = r0
            r22 = r15
        L_0x014a:
            r0 = r26
            long r15 = r0.objectFieldOffset(r6)
            int r0 = (int) r15
            r18 = r0
            r2 = r11 & 1
            r0 = r29
            if (r2 != r0) goto L_0x01c3
            r0 = 17
            if (r7 > r0) goto L_0x01c3
            int r2 = r5 + 1
            char r6 = r13.charAt(r5)
            if (r6 < r12) goto L_0x01a1
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0169:
            int r5 = r2 + 1
            char r0 = r13.charAt(r2)
            if (r0 < r12) goto L_0x019e
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r15
            r6 = r6 | r0
            int r15 = r15 + 13
            r2 = r5
            goto L_0x0169
        L_0x0179:
            r2 = r11 & 1
            r0 = r29
            if (r2 != r0) goto L_0x014a
        L_0x017f:
            int r0 = r17 / 3
            int r0 = r0 * 2
            int r2 = r0 + 1
            int r16 = r19 + 1
            r0 = r10[r19]
            r23[r2] = r0
            goto L_0x018e
        L_0x018c:
            r22 = r15
        L_0x018e:
            r19 = r16
            goto L_0x014a
        L_0x0191:
            int r0 = r17 / 3
            int r0 = r0 * 2
            int r2 = r0 + 1
            java.lang.Class r0 = r6.getType()
            r23[r2] = r0
            goto L_0x014a
        L_0x019e:
            int r0 = r0 << r15
            r6 = r6 | r0
            r2 = r5
        L_0x01a1:
            int r15 = r4 * 2
            int r0 = r6 / 32
            int r15 = r15 + r0
            r5 = r10[r15]
            boolean r0 = r5 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x01b8
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
        L_0x01ae:
            r0 = r26
            long r15 = r0.objectFieldOffset(r5)
            int r0 = (int) r15
            int r5 = r6 % 32
            goto L_0x0221
        L_0x01b8:
            java.lang.String r5 = (java.lang.String) r5
            r0 = r25
            java.lang.reflect.Field r5 = A04(r0, r5)
            r10[r15] = r5
            goto L_0x01ae
        L_0x01c3:
            r2 = r5
            r0 = 0
            r5 = 0
            r6 = 18
            if (r7 < r6) goto L_0x0221
            r6 = 49
            if (r7 > r6) goto L_0x0221
            int r6 = r21 + 1
            r27[r21] = r18
            r21 = r6
            goto L_0x0221
        L_0x01d5:
            int r0 = r0 << r16
            r5 = r5 | r0
            r2 = r6
        L_0x01d9:
            int r0 = r7 + -51
            r6 = 9
            if (r0 == r6) goto L_0x01ed
            r6 = 17
            if (r0 == r6) goto L_0x01ed
            r6 = 12
            if (r0 != r6) goto L_0x01fa
            r6 = r11 & 1
            r0 = r29
            if (r6 != r0) goto L_0x01fa
        L_0x01ed:
            int r0 = r17 / 3
            int r0 = r0 * 2
            int r16 = r0 + 1
            int r6 = r15 + 1
            r0 = r10[r15]
            r23[r16] = r0
            r15 = r6
        L_0x01fa:
            int r16 = r5 * 2
            r5 = r10[r16]
            boolean r0 = r5 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0253
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
        L_0x0204:
            r0 = r26
            long r5 = r0.objectFieldOffset(r5)
            int r0 = (int) r5
            r18 = r0
            int r6 = r16 + 1
            r5 = r10[r6]
            boolean r0 = r5 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0248
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
        L_0x0217:
            r0 = r26
            long r5 = r0.objectFieldOffset(r5)
            int r0 = (int) r5
            r19 = r15
            r5 = 0
        L_0x0221:
            int r16 = r17 + 1
            r24[r17] = r9
            int r15 = r16 + 1
            r6 = r8 & 512(0x200, float:7.175E-43)
            r9 = 0
            if (r6 == 0) goto L_0x022e
            r9 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x022e:
            r8 = r8 & 256(0x100, float:3.59E-43)
            r6 = 0
            if (r8 == 0) goto L_0x0235
            r6 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0235:
            r9 = r9 | r6
            int r6 = r7 << 20
            r9 = r9 | r6
            r9 = r9 | r18
            r24[r16] = r9
            int r17 = r15 + 1
            int r5 = r5 << 20
            r5 = r5 | r0
            r24[r15] = r5
            r15 = r19
            goto L_0x0093
        L_0x0248:
            java.lang.String r5 = (java.lang.String) r5
            r0 = r25
            java.lang.reflect.Field r5 = A04(r0, r5)
            r10[r6] = r5
            goto L_0x0217
        L_0x0253:
            java.lang.String r5 = (java.lang.String) r5
            r0 = r25
            java.lang.reflect.Field r5 = A04(r0, r5)
            r10[r16] = r5
            goto L_0x0204
        L_0x025e:
            int r0 = r2 + 1
            char r4 = r13.charAt(r2)
            if (r4 < r12) goto L_0x027d
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x026a:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x027a
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r2
            r4 = r4 | r0
            int r2 = r2 + 13
            r0 = r1
            goto L_0x026a
        L_0x027a:
            int r0 = r0 << r2
            r4 = r4 | r0
            r0 = r1
        L_0x027d:
            int r3 = r0 + 1
            char r8 = r13.charAt(r0)
            if (r8 < r12) goto L_0x029c
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0289:
            int r1 = r3 + 1
            char r0 = r13.charAt(r3)
            if (r0 < r12) goto L_0x0299
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r2
            r8 = r8 | r0
            int r2 = r2 + 13
            r3 = r1
            goto L_0x0289
        L_0x0299:
            int r0 = r0 << r2
            r8 = r8 | r0
            r3 = r1
        L_0x029c:
            int r0 = r3 + 1
            char r3 = r13.charAt(r3)
            if (r3 < r12) goto L_0x02bb
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x02a8:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x02b8
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r2
            r3 = r3 | r0
            int r2 = r2 + 13
            r0 = r1
            goto L_0x02a8
        L_0x02b8:
            int r0 = r0 << r2
            r3 = r3 | r0
            r0 = r1
        L_0x02bb:
            int r5 = r0 + 1
            char r14 = r13.charAt(r0)
            if (r14 < r12) goto L_0x02da
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x02c7:
            int r1 = r5 + 1
            char r0 = r13.charAt(r5)
            if (r0 < r12) goto L_0x02d7
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r2
            r14 = r14 | r0
            int r2 = r2 + 13
            r5 = r1
            goto L_0x02c7
        L_0x02d7:
            int r0 = r0 << r2
            r14 = r14 | r0
            r5 = r1
        L_0x02da:
            int r0 = r5 + 1
            char r6 = r13.charAt(r5)
            if (r6 < r12) goto L_0x02f9
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x02e6:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x02f6
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r2
            r6 = r6 | r0
            int r2 = r2 + 13
            r0 = r1
            goto L_0x02e6
        L_0x02f6:
            int r0 = r0 << r2
            r6 = r6 | r0
            r0 = r1
        L_0x02f9:
            int r9 = r0 + 1
            char r5 = r13.charAt(r0)
            if (r5 < r12) goto L_0x0318
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0305:
            int r1 = r9 + 1
            char r0 = r13.charAt(r9)
            if (r0 < r12) goto L_0x0315
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r2
            r5 = r5 | r0
            int r2 = r2 + 13
            r9 = r1
            goto L_0x0305
        L_0x0315:
            int r0 = r0 << r2
            r5 = r5 | r0
            r9 = r1
        L_0x0318:
            int r0 = r9 + 1
            char r9 = r13.charAt(r9)
            if (r9 < r12) goto L_0x0337
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0324:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x0334
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r2
            r9 = r9 | r0
            int r2 = r2 + 13
            r0 = r1
            goto L_0x0324
        L_0x0334:
            int r0 = r0 << r2
            r9 = r9 | r0
            r0 = r1
        L_0x0337:
            int r2 = r0 + 1
            char r1 = r13.charAt(r0)
            if (r1 < r12) goto L_0x0356
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0343:
            int r10 = r2 + 1
            char r0 = r13.charAt(r2)
            if (r0 < r12) goto L_0x0353
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r15
            r1 = r1 | r0
            int r15 = r15 + 13
            r2 = r10
            goto L_0x0343
        L_0x0353:
            int r0 = r0 << r15
            r1 = r1 | r0
            r2 = r10
        L_0x0356:
            int r0 = r1 + r5
            int r0 = r0 + r9
            int[] r0 = new int[r0]
            r27 = r0
            int r15 = r4 * 2
            int r15 = r15 + r8
            goto L_0x0071
        L_0x0362:
            X.5LZ r28 = new X.5LZ
            r29 = r43
            r30 = r44
            r31 = r45
            r33 = r47
            r34 = r48
            r35 = r24
            r36 = r27
            r37 = r23
            r38 = r3
            r39 = r14
            r40 = r1
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            return r28
        L_0x037e:
            java.lang.String r1 = "getSyntax"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5LZ.A02(X.5LV, X.5LR, X.5LY, X.5LN, X.5LQ, X.5L5):X.5LZ");
    }

    private AnonymousClass5L3 A03(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.A0A;
        AnonymousClass5L3 r0 = (AnonymousClass5L3) objArr[i2];
        if (r0 != null) {
            return r0;
        }
        AnonymousClass5L3 A002 = C284075Kw.A02.A00((Class) objArr[i2 + 1]);
        objArr[i2] = A002;
        return A002;
    }

    private void A05(C284165Lf r5, Object obj, int i) {
        long j;
        Object A082;
        if ((536870912 & i) != 0) {
            j = (long) (i & 1048575);
            C284155Le r52 = (C284155Le) r5;
            C284155Le.A04(r52, 2);
            A082 = r52.A03.A0A();
        } else {
            boolean z = this.A0E;
            j = (long) (i & 1048575);
            C284155Le r53 = (C284155Le) r5;
            C284155Le.A04(r53, 2);
            C284035Kr r0 = r53.A03;
            if (z) {
                A082 = r0.A09();
            } else {
                A082 = r0.A08();
            }
        }
        C284115La.A0A(obj, j, A082);
    }

    private void A06(C13831Ti3 ti3, Object obj, int i, int i2) {
        if (obj != null) {
            AnonymousClass5LL r7 = ((AnonymousClass5LK) this.A0A[(i2 / 3) * 2]).A00;
            C7189Pyc pyc = ((C7194Pyh) ti3).A00;
            for (Map.Entry entry : ((AbstractMap) obj).entrySet()) {
                pyc.A07((i << 3) | 2);
                Object key = entry.getKey();
                Object value = entry.getValue();
                AnonymousClass5L7 r5 = r7.A00;
                int A002 = C7190Pyd.A00(r5, key, 1);
                AnonymousClass5L7 r3 = r7.A01;
                pyc.A07(A002 + C7190Pyd.A00(r3, value, 2));
                Object key2 = entry.getKey();
                Object value2 = entry.getValue();
                C7190Pyd.A01(pyc, r5, key2, 1);
                C7190Pyd.A01(pyc, r3, value2, 2);
            }
        }
    }

    private void A07(Object obj, int i) {
        if (!this.A07) {
            int i2 = this.A08[i + 2];
            int i3 = 1 << (i2 >>> 20);
            long j = (long) (i2 & 1048575);
            C284115La.A09(obj, j, C284115La.A01.A04(obj, j) | i3);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        return !r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A08(int r7, java.lang.Object r8) {
        /*
            r6 = this;
            boolean r0 = r6.A07
            r5 = 0
            r3 = 1
            int[] r1 = r6.A08
            if (r0 == 0) goto L_0x007e
            int r0 = r7 + 1
            r3 = r1[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r3
            long r1 = (long) r0
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r0
            int r0 = r3 >>> 20
            r3 = 0
            switch(r0) {
                case 0: goto L_0x0094;
                case 1: goto L_0x0072;
                case 2: goto L_0x0067;
                case 3: goto L_0x0067;
                case 4: goto L_0x005e;
                case 5: goto L_0x0067;
                case 6: goto L_0x005e;
                case 7: goto L_0x0057;
                case 8: goto L_0x0033;
                case 9: goto L_0x0021;
                case 10: goto L_0x002a;
                case 11: goto L_0x005e;
                case 12: goto L_0x005e;
                case 13: goto L_0x005e;
                case 14: goto L_0x0067;
                case 15: goto L_0x005e;
                case 16: goto L_0x0067;
                case 17: goto L_0x0021;
                default: goto L_0x001b;
            }
        L_0x001b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0021:
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r0 = r0.A06(r8, r1)
            if (r0 == 0) goto L_0x00a1
            goto L_0x00a0
        L_0x002a:
            X.5L9 r3 = X.AnonymousClass5L9.A02
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r1 = r0.A06(r8, r1)
            goto L_0x004c
        L_0x0033:
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r1 = r0.A06(r8, r1)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0046
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r1.isEmpty()
        L_0x0043:
            r0 = r0 ^ 1
            return r0
        L_0x0046:
            boolean r0 = r1 instanceof X.AnonymousClass5L9
            if (r0 == 0) goto L_0x0051
            X.5L9 r3 = X.AnonymousClass5L9.A02
        L_0x004c:
            boolean r0 = r3.equals(r1)
            goto L_0x0043
        L_0x0051:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0057:
            X.5Ld r0 = X.C284115La.A01
            boolean r0 = r0.A0G(r8, r1)
            return r0
        L_0x005e:
            X.5Ld r0 = X.C284115La.A01
            int r0 = r0.A04(r8, r1)
            if (r0 == 0) goto L_0x00a1
            goto L_0x00a0
        L_0x0067:
            X.5Ld r0 = X.C284115La.A01
            long r1 = r0.A05(r8, r1)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00a1
            goto L_0x00a0
        L_0x0072:
            X.5Ld r0 = X.C284115La.A01
            float r1 = r0.A02(r8, r1)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00a1
            goto L_0x00a0
        L_0x007e:
            int r0 = r7 + 2
            r1 = r1[r0]
            int r0 = r1 >>> 20
            int r3 = r3 << r0
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r1 = (long) r1
            X.5Ld r0 = X.C284115La.A01
            int r0 = r0.A04(r8, r1)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x00a1
            goto L_0x00a0
        L_0x0094:
            X.5Ld r0 = X.C284115La.A01
            double r3 = r0.A01(r8, r1)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00a1
        L_0x00a0:
            r5 = 1
        L_0x00a1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5LZ.A08(int, java.lang.Object):boolean");
    }

    private boolean A09(Object obj, int i, int i2) {
        if (C284115La.A01.A04(obj, (long) (this.A08[i2 + 2] & 1048575)) == i) {
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
            int[] r7 = r10.A08
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
            boolean r3 = r10.A08(r5, r11)
            boolean r2 = r10.A08(r5, r12)
            if (r3 != r2) goto L_0x00e0
            X.5Ld r8 = X.C284115La.A01
            double r2 = r8.A01(r11, r0)
            long r3 = java.lang.Double.doubleToLongBits(r2)
            double r0 = r8.A01(r12, r0)
            long r1 = java.lang.Double.doubleToLongBits(r0)
            goto L_0x0069
        L_0x0038:
            boolean r3 = r10.A08(r5, r11)
            boolean r2 = r10.A08(r5, r12)
            if (r3 != r2) goto L_0x00e0
            X.5Ld r4 = X.C284115La.A01
            float r2 = r4.A02(r11, r0)
            int r3 = java.lang.Float.floatToIntBits(r2)
            float r0 = r4.A02(r12, r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x0097
        L_0x0055:
            boolean r3 = r10.A08(r5, r11)
            boolean r2 = r10.A08(r5, r12)
            if (r3 != r2) goto L_0x00e0
            X.5Ld r2 = X.C284115La.A01
            long r3 = r2.A05(r11, r0)
            long r1 = r2.A05(r12, r0)
        L_0x0069:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00e0
            goto L_0x0018
        L_0x006e:
            boolean r3 = r10.A08(r5, r11)
            boolean r2 = r10.A08(r5, r12)
            if (r3 != r2) goto L_0x00e0
            X.5Ld r2 = X.C284115La.A01
            int r3 = r2.A04(r11, r0)
            int r0 = r2.A04(r12, r0)
            goto L_0x0097
        L_0x0083:
            boolean r3 = r10.A08(r5, r11)
            boolean r2 = r10.A08(r5, r12)
            if (r3 != r2) goto L_0x00e0
            X.5Ld r2 = X.C284115La.A01
            boolean r3 = r2.A0G(r11, r0)
            boolean r0 = r2.A0G(r12, r0)
        L_0x0097:
            if (r3 != r0) goto L_0x00e0
            goto L_0x0018
        L_0x009b:
            boolean r8 = r10.A08(r5, r11)
            boolean r2 = r10.A08(r5, r12)
            goto L_0x00b7
        L_0x00a4:
            int r2 = r5 + 2
            r3 = r7[r2]
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            long r2 = (long) r3
            X.5Ld r4 = X.C284115La.A01
            int r8 = r4.A04(r11, r2)
            int r2 = r4.A04(r12, r2)
        L_0x00b7:
            if (r8 != r2) goto L_0x00e0
        L_0x00b9:
            X.5Ld r3 = X.C284115La.A01
            java.lang.Object r2 = r3.A06(r11, r0)
            java.lang.Object r1 = r3.A06(r12, r0)
            X.5L5 r0 = X.AnonymousClass5L4.A02
            if (r2 == r1) goto L_0x0018
            if (r2 == 0) goto L_0x00e0
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x00e0
            goto L_0x0018
        L_0x00d1:
            X.5Kk r11 = (X.C283985Kk) r11
            X.5Ko r1 = r11.unknownFields
            X.5Kk r12 = (X.C283985Kk) r12
            X.5Ko r0 = r12.unknownFields
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e0
            r9 = 1
        L_0x00e0:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5LZ.ASr(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0339, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x033b, code lost:
        r8 = X.C7189Pyc.A00(r7 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x034b, code lost:
        r3 = A01(r15, r3);
        r8 = X.C7189Pyc.A00(r7 << 3);
        r4 = X.C7189Pyc.A01(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x036b, code lost:
        if (r3 >= 0) goto L_0x0432;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0373, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0375, code lost:
        r8 = X.C7189Pyc.A00(r7 << 3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0383, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0385, code lost:
        r8 = X.C7189Pyc.A00(r7 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0393, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0395, code lost:
        r8 = X.C7189Pyc.A00(r7 << 3) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03a3, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03a5, code lost:
        r3 = X.C284115La.A01.A06(r15, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03ad, code lost:
        if ((r3 instanceof X.AnonymousClass5L9) == false) goto L_0x03b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03af, code lost:
        r8 = X.C7189Pyc.A02((X.AnonymousClass5L9) r3, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03b7, code lost:
        r8 = X.C7189Pyc.A00(r7 << 3);
        r4 = X.C7189Pyc.A04((java.lang.String) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03c9, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03cb, code lost:
        r6 = X.C284115La.A01.A06(r15, r3);
        r5 = A03(r1);
        r0 = X.AnonymousClass5L4.A02;
        r8 = X.C7189Pyc.A00(r7 << 3);
        r6 = (X.C283995Kl) ((X.C284005Km) r6);
        r4 = (X.C283985Kk) r6;
        r3 = r4.memoizedSerializedSize;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03e7, code lost:
        if (r3 != -1) goto L_0x03ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03e9, code lost:
        r3 = r5.Bsa(r6);
        r4.memoizedSerializedSize = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03ef, code lost:
        r8 = r8 + (X.C7189Pyc.A00(r3) + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03fb, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03fd, code lost:
        r8 = X.C7189Pyc.A02((X.AnonymousClass5L9) X.C284115La.A01.A06(r15, r3), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0430, code lost:
        if (r3 >= 0) goto L_0x0432;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0432, code lost:
        r4 = X.C7189Pyc.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0437, code lost:
        r4 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x043e, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0440, code lost:
        r8 = X.C7189Pyc.A00(r7 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x044d, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x044f, code lost:
        r8 = X.C7189Pyc.A00(r7 << 3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0471, code lost:
        r8 = r8 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0494, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0496, code lost:
        r8 = X.C7189Pyc.A03((X.C284005Km) X.C284115La.A01.A06(r15, r3), A03(r1), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x051d, code lost:
        if (r1 >= 0) goto L_0x08b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x055c, code lost:
        if (r1 >= 0) goto L_0x08b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x06be, code lost:
        r5 = r5 * r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x073b, code lost:
        if (r1 <= 0) goto L_0x04de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x073d, code lost:
        r9 = (X.C7189Pyc.A00(r6 << 3) + X.C7189Pyc.A00(r1)) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0789, code lost:
        if (r0 == false) goto L_0x04de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x078b, code lost:
        r9 = X.C7189Pyc.A00(r6 << 3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0799, code lost:
        if (r0 == false) goto L_0x04de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x079b, code lost:
        r9 = X.C7189Pyc.A00(r6 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x07b2, code lost:
        r7 = A01(r15, r0);
        r9 = X.C7189Pyc.A00(r6 << 3);
        r5 = X.C7189Pyc.A01(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x07ce, code lost:
        if (r0 == false) goto L_0x04de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x07d0, code lost:
        r9 = X.C7189Pyc.A00(r6 << 3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x07ee, code lost:
        if (r0 == false) goto L_0x04de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x07f0, code lost:
        r9 = X.C7189Pyc.A00(r6 << 3) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x07fe, code lost:
        if (r5 == false) goto L_0x04de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0800, code lost:
        r1 = r4.getObject(r15, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0806, code lost:
        if ((r1 instanceof X.AnonymousClass5L9) == false) goto L_0x0810;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0808, code lost:
        r9 = X.C7189Pyc.A02((X.AnonymousClass5L9) r1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0810, code lost:
        r9 = X.C7189Pyc.A00(r6 << 3);
        r5 = X.C7189Pyc.A04((java.lang.String) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0822, code lost:
        if (r5 == false) goto L_0x04de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0824, code lost:
        r8 = r4.getObject(r15, r0);
        r7 = A03(r2);
        r0 = X.AnonymousClass5L4.A02;
        r9 = X.C7189Pyc.A00(r6 << 3);
        r8 = (X.C283995Kl) ((X.C284005Km) r8);
        r5 = (X.C283985Kk) r8;
        r1 = r5.memoizedSerializedSize;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x083e, code lost:
        if (r1 != -1) goto L_0x0846;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0840, code lost:
        r1 = r7.Bsa(r8);
        r5.memoizedSerializedSize = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0846, code lost:
        r5 = X.C7189Pyc.A00(r1) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0850, code lost:
        if (r5 == false) goto L_0x04de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0852, code lost:
        r9 = X.C7189Pyc.A02((X.AnonymousClass5L9) r4.getObject(r15, r0), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0875, code lost:
        r1 = A00(r15, r0);
        r9 = X.C7189Pyc.A00(r6 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x087f, code lost:
        if (r1 < 0) goto L_0x0882;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0882, code lost:
        r5 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0889, code lost:
        if (r0 == false) goto L_0x04de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x088b, code lost:
        r9 = X.C7189Pyc.A00(r6 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0898, code lost:
        if (r0 == false) goto L_0x04de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x089a, code lost:
        r9 = X.C7189Pyc.A00(r6 << 3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x08b3, code lost:
        r1 = (r1 >> 31) ^ (r1 << 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x08b8, code lost:
        r5 = X.C7189Pyc.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x08bc, code lost:
        r9 = r9 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x08de, code lost:
        if (r5 == false) goto L_0x04de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x08e0, code lost:
        r9 = X.C7189Pyc.A03((X.C284005Km) r4.getObject(r15, r0), A03(r2), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0167, code lost:
        r4 = r4 * r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x016a, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01e3, code lost:
        if (r3 >= 0) goto L_0x0432;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0239, code lost:
        if (r3 >= 0) goto L_0x0432;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02ff, code lost:
        if (r3 <= 0) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0301, code lost:
        r8 = (X.C7189Pyc.A00(r7 << 3) + X.C7189Pyc.A00(r3)) + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0329, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x032b, code lost:
        r8 = X.C7189Pyc.A00(r7 << 3) + 8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int Bsa(java.lang.Object r15) {
        /*
            r14 = this;
            boolean r0 = r14.A07
            if (r0 == 0) goto L_0x04a9
            sun.misc.Unsafe r2 = A0F
            r1 = 0
            r13 = 0
        L_0x0008:
            int[] r4 = r14.A08
            int r0 = r4.length
            if (r1 >= r0) goto L_0x08f4
            int r0 = r1 + 1
            r3 = r4[r0]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r3
            int r5 = r0 >>> 20
            r7 = r4[r1]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r0
            long r3 = (long) r3
            X.XQy[] r0 = X.C21253XQy.A01
            switch(r5) {
                case 0: goto L_0x0195;
                case 1: goto L_0x019b;
                case 2: goto L_0x01a1;
                case 3: goto L_0x01b9;
                case 4: goto L_0x01d1;
                case 5: goto L_0x01e7;
                case 6: goto L_0x01ed;
                case 7: goto L_0x01f3;
                case 8: goto L_0x0201;
                case 9: goto L_0x0207;
                case 10: goto L_0x020d;
                case 11: goto L_0x0213;
                case 12: goto L_0x0227;
                case 13: goto L_0x023d;
                case 14: goto L_0x0243;
                case 15: goto L_0x0249;
                case 16: goto L_0x0262;
                case 17: goto L_0x0282;
                case 18: goto L_0x0025;
                case 19: goto L_0x003f;
                case 20: goto L_0x0059;
                case 21: goto L_0x007a;
                case 22: goto L_0x0096;
                case 23: goto L_0x0025;
                case 24: goto L_0x003f;
                case 25: goto L_0x00b2;
                case 26: goto L_0x00ce;
                case 27: goto L_0x00dc;
                case 28: goto L_0x00ee;
                case 29: goto L_0x00fc;
                case 30: goto L_0x0117;
                case 31: goto L_0x003f;
                case 32: goto L_0x0025;
                case 33: goto L_0x0132;
                case 34: goto L_0x014d;
                case 35: goto L_0x0288;
                case 36: goto L_0x0297;
                case 37: goto L_0x02a6;
                case 38: goto L_0x02b1;
                case 39: goto L_0x02bc;
                case 40: goto L_0x0288;
                case 41: goto L_0x0297;
                case 42: goto L_0x02c7;
                case 43: goto L_0x02d4;
                case 44: goto L_0x02df;
                case 45: goto L_0x0297;
                case 46: goto L_0x0288;
                case 47: goto L_0x02ea;
                case 48: goto L_0x02f5;
                case 49: goto L_0x016d;
                case 50: goto L_0x030f;
                case 51: goto L_0x0325;
                case 52: goto L_0x0335;
                case 53: goto L_0x01f9;
                case 54: goto L_0x0345;
                case 55: goto L_0x035b;
                case 56: goto L_0x036f;
                case 57: goto L_0x037f;
                case 58: goto L_0x038f;
                case 59: goto L_0x039f;
                case 60: goto L_0x03c5;
                case 61: goto L_0x03f7;
                case 62: goto L_0x040b;
                case 63: goto L_0x0420;
                case 64: goto L_0x043a;
                case 65: goto L_0x0449;
                case 66: goto L_0x0458;
                case 67: goto L_0x0473;
                case 68: goto L_0x0490;
                default: goto L_0x0022;
            }
        L_0x0022:
            int r1 = r1 + 3
            goto L_0x0008
        L_0x0025:
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r3 = r0.A06(r15, r3)
            java.util.List r3 = (java.util.List) r3
            X.5L5 r0 = X.AnonymousClass5L4.A02
            int r3 = r3.size()
            if (r3 == 0) goto L_0x016a
            int r0 = r7 << 3
            int r0 = X.C7189Pyc.A00(r0)
            int r0 = r0 + 8
            goto L_0x00ca
        L_0x003f:
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r3 = r0.A06(r15, r3)
            java.util.List r3 = (java.util.List) r3
            X.5L5 r0 = X.AnonymousClass5L4.A02
            int r3 = r3.size()
            r8 = 0
            if (r3 == 0) goto L_0x04a6
            int r0 = r7 << 3
            int r0 = X.C7189Pyc.A00(r0)
            int r0 = r0 + 4
            goto L_0x00ca
        L_0x0059:
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r3 = r0.A06(r15, r3)
            java.util.List r3 = (java.util.List) r3
            X.5L5 r0 = X.AnonymousClass5L4.A02
            int r0 = r3.size()
            if (r0 == 0) goto L_0x016a
            int r8 = X.AnonymousClass5L4.A03(r3)
            int r4 = r3.size()
            int r0 = r7 << 3
            int r0 = X.C7189Pyc.A00(r0)
            int r4 = r4 * r0
            goto L_0x0471
        L_0x007a:
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r3 = r0.A06(r15, r3)
            java.util.List r3 = (java.util.List) r3
            X.5L5 r0 = X.AnonymousClass5L4.A02
            int r4 = r3.size()
            if (r4 == 0) goto L_0x016a
            int r8 = X.AnonymousClass5L4.A07(r3)
            int r0 = r7 << 3
            int r0 = X.C7189Pyc.A00(r0)
            goto L_0x0167
        L_0x0096:
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r3 = r0.A06(r15, r3)
            java.util.List r3 = (java.util.List) r3
            X.5L5 r0 = X.AnonymousClass5L4.A02
            int r4 = r3.size()
            if (r4 == 0) goto L_0x016a
            int r8 = X.AnonymousClass5L4.A02(r3)
            int r0 = r7 << 3
            int r0 = X.C7189Pyc.A00(r0)
            goto L_0x0167
        L_0x00b2:
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r3 = r0.A06(r15, r3)
            java.util.List r3 = (java.util.List) r3
            X.5L5 r0 = X.AnonymousClass5L4.A02
            int r3 = r3.size()
            if (r3 == 0) goto L_0x016a
            int r0 = r7 << 3
            int r0 = X.C7189Pyc.A00(r0)
            int r0 = r0 + 1
        L_0x00ca:
            int r8 = r3 * r0
            goto L_0x04a6
        L_0x00ce:
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r0 = r0.A06(r15, r3)
            java.util.List r0 = (java.util.List) r0
            int r8 = X.AnonymousClass5L4.A09(r0, r7)
            goto L_0x04a6
        L_0x00dc:
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r3 = r0.A06(r15, r3)
            java.util.List r3 = (java.util.List) r3
            X.5L3 r0 = r14.A03(r1)
            int r8 = X.AnonymousClass5L4.A00(r0, r3, r7)
            goto L_0x04a6
        L_0x00ee:
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r0 = r0.A06(r15, r3)
            java.util.List r0 = (java.util.List) r0
            int r8 = X.AnonymousClass5L4.A08(r0, r7)
            goto L_0x04a6
        L_0x00fc:
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r3 = r0.A06(r15, r3)
            java.util.List r3 = (java.util.List) r3
            X.5L5 r0 = X.AnonymousClass5L4.A02
            int r4 = r3.size()
            if (r4 == 0) goto L_0x016a
            int r8 = X.AnonymousClass5L4.A06(r3)
            int r0 = r7 << 3
            int r0 = X.C7189Pyc.A00(r0)
            goto L_0x0167
        L_0x0117:
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r3 = r0.A06(r15, r3)
            java.util.List r3 = (java.util.List) r3
            X.5L5 r0 = X.AnonymousClass5L4.A02
            int r4 = r3.size()
            if (r4 == 0) goto L_0x016a
            int r8 = X.AnonymousClass5L4.A01(r3)
            int r0 = r7 << 3
            int r0 = X.C7189Pyc.A00(r0)
            goto L_0x0167
        L_0x0132:
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r3 = r0.A06(r15, r3)
            java.util.List r3 = (java.util.List) r3
            X.5L5 r0 = X.AnonymousClass5L4.A02
            int r4 = r3.size()
            if (r4 == 0) goto L_0x016a
            int r8 = X.AnonymousClass5L4.A04(r3)
            int r0 = r7 << 3
            int r0 = X.C7189Pyc.A00(r0)
            goto L_0x0167
        L_0x014d:
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r3 = r0.A06(r15, r3)
            java.util.List r3 = (java.util.List) r3
            X.5L5 r0 = X.AnonymousClass5L4.A02
            int r4 = r3.size()
            if (r4 == 0) goto L_0x016a
            int r8 = X.AnonymousClass5L4.A05(r3)
            int r0 = r7 << 3
            int r0 = X.C7189Pyc.A00(r0)
        L_0x0167:
            int r4 = r4 * r0
            goto L_0x0471
        L_0x016a:
            r8 = 0
            goto L_0x04a6
        L_0x016d:
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r6 = r0.A06(r15, r3)
            java.util.List r6 = (java.util.List) r6
            X.5L3 r5 = r14.A03(r1)
            X.5L5 r0 = X.AnonymousClass5L4.A02
            int r4 = r6.size()
            r3 = 0
            r8 = 0
            if (r4 != 0) goto L_0x0185
            goto L_0x04a6
        L_0x0185:
            if (r3 >= r4) goto L_0x04a6
            java.lang.Object r0 = r6.get(r3)
            X.5Km r0 = (X.C284005Km) r0
            int r0 = X.C7189Pyc.A03(r0, r5, r7)
            int r8 = r8 + r0
            int r3 = r3 + 1
            goto L_0x0185
        L_0x0195:
            boolean r0 = r14.A08(r1, r15)
            goto L_0x0329
        L_0x019b:
            boolean r0 = r14.A08(r1, r15)
            goto L_0x0339
        L_0x01a1:
            boolean r0 = r14.A08(r1, r15)
            if (r0 == 0) goto L_0x0022
            X.5Ld r0 = X.C284115La.A01
            long r3 = r0.A05(r15, r3)
            int r0 = r7 << 3
            int r8 = X.C7189Pyc.A00(r0)
            int r4 = X.C7189Pyc.A01(r3)
            goto L_0x0471
        L_0x01b9:
            boolean r0 = r14.A08(r1, r15)
            if (r0 == 0) goto L_0x0022
            X.5Ld r0 = X.C284115La.A01
            long r3 = r0.A05(r15, r3)
            int r0 = r7 << 3
            int r8 = X.C7189Pyc.A00(r0)
            int r4 = X.C7189Pyc.A01(r3)
            goto L_0x0471
        L_0x01d1:
            boolean r0 = r14.A08(r1, r15)
            if (r0 == 0) goto L_0x0022
            X.5Ld r0 = X.C284115La.A01
            int r3 = r0.A04(r15, r3)
            int r0 = r7 << 3
            int r8 = X.C7189Pyc.A00(r0)
            if (r3 < 0) goto L_0x0437
            goto L_0x0432
        L_0x01e7:
            boolean r0 = r14.A08(r1, r15)
            goto L_0x0373
        L_0x01ed:
            boolean r0 = r14.A08(r1, r15)
            goto L_0x0383
        L_0x01f3:
            boolean r0 = r14.A08(r1, r15)
            goto L_0x0393
        L_0x01f9:
            boolean r0 = r14.A09(r15, r7, r1)
            if (r0 == 0) goto L_0x0022
            goto L_0x034b
        L_0x0201:
            boolean r0 = r14.A08(r1, r15)
            goto L_0x03a3
        L_0x0207:
            boolean r0 = r14.A08(r1, r15)
            goto L_0x03c9
        L_0x020d:
            boolean r0 = r14.A08(r1, r15)
            goto L_0x03fb
        L_0x0213:
            boolean r0 = r14.A08(r1, r15)
            if (r0 == 0) goto L_0x0022
            X.5Ld r0 = X.C284115La.A01
            int r3 = r0.A04(r15, r3)
            int r0 = r7 << 3
            int r8 = X.C7189Pyc.A00(r0)
            goto L_0x0432
        L_0x0227:
            boolean r0 = r14.A08(r1, r15)
            if (r0 == 0) goto L_0x0022
            X.5Ld r0 = X.C284115La.A01
            int r3 = r0.A04(r15, r3)
            int r0 = r7 << 3
            int r8 = X.C7189Pyc.A00(r0)
            if (r3 < 0) goto L_0x0437
            goto L_0x0432
        L_0x023d:
            boolean r0 = r14.A08(r1, r15)
            goto L_0x043e
        L_0x0243:
            boolean r0 = r14.A08(r1, r15)
            goto L_0x044d
        L_0x0249:
            boolean r0 = r14.A08(r1, r15)
            if (r0 == 0) goto L_0x0022
            X.5Ld r0 = X.C284115La.A01
            int r3 = r0.A04(r15, r3)
            int r0 = r7 << 3
            int r8 = X.C7189Pyc.A00(r0)
            int r0 = r3 << 1
            int r3 = r3 >> 31
            r3 = r3 ^ r0
            goto L_0x0432
        L_0x0262:
            boolean r0 = r14.A08(r1, r15)
            if (r0 == 0) goto L_0x0022
            X.5Ld r0 = X.C284115La.A01
            long r5 = r0.A05(r15, r3)
            int r0 = r7 << 3
            int r8 = X.C7189Pyc.A00(r0)
            r0 = 1
            long r3 = r5 << r0
            r0 = 63
            long r5 = r5 >> r0
            long r5 = r5 ^ r3
            int r0 = X.C7189Pyc.A01(r5)
            int r8 = r8 + r0
            goto L_0x04a6
        L_0x0282:
            boolean r0 = r14.A08(r1, r15)
            goto L_0x0494
        L_0x0288:
            java.lang.Object r3 = r2.getObject(r15, r3)
            java.util.List r3 = (java.util.List) r3
            X.5L5 r0 = X.AnonymousClass5L4.A02
            int r0 = r3.size()
            int r3 = r0 * 8
            goto L_0x02ff
        L_0x0297:
            java.lang.Object r3 = r2.getObject(r15, r3)
            java.util.List r3 = (java.util.List) r3
            X.5L5 r0 = X.AnonymousClass5L4.A02
            int r0 = r3.size()
            int r3 = r0 * 4
            goto L_0x02ff
        L_0x02a6:
            java.lang.Object r0 = r2.getObject(r15, r3)
            java.util.List r0 = (java.util.List) r0
            int r3 = X.AnonymousClass5L4.A03(r0)
            goto L_0x02ff
        L_0x02b1:
            java.lang.Object r0 = r2.getObject(r15, r3)
            java.util.List r0 = (java.util.List) r0
            int r3 = X.AnonymousClass5L4.A07(r0)
            goto L_0x02ff
        L_0x02bc:
            java.lang.Object r0 = r2.getObject(r15, r3)
            java.util.List r0 = (java.util.List) r0
            int r3 = X.AnonymousClass5L4.A02(r0)
            goto L_0x02ff
        L_0x02c7:
            java.lang.Object r3 = r2.getObject(r15, r3)
            java.util.List r3 = (java.util.List) r3
            X.5L5 r0 = X.AnonymousClass5L4.A02
            int r3 = r3.size()
            goto L_0x02ff
        L_0x02d4:
            java.lang.Object r0 = r2.getObject(r15, r3)
            java.util.List r0 = (java.util.List) r0
            int r3 = X.AnonymousClass5L4.A06(r0)
            goto L_0x02ff
        L_0x02df:
            java.lang.Object r0 = r2.getObject(r15, r3)
            java.util.List r0 = (java.util.List) r0
            int r3 = X.AnonymousClass5L4.A01(r0)
            goto L_0x02ff
        L_0x02ea:
            java.lang.Object r0 = r2.getObject(r15, r3)
            java.util.List r0 = (java.util.List) r0
            int r3 = X.AnonymousClass5L4.A04(r0)
            goto L_0x02ff
        L_0x02f5:
            java.lang.Object r0 = r2.getObject(r15, r3)
            java.util.List r0 = (java.util.List) r0
            int r3 = X.AnonymousClass5L4.A05(r0)
        L_0x02ff:
            if (r3 <= 0) goto L_0x0022
            int r0 = r7 << 3
            int r8 = X.C7189Pyc.A00(r0)
            int r0 = X.C7189Pyc.A00(r3)
            int r8 = r8 + r0
            int r8 = r8 + r3
            goto L_0x04a6
        L_0x030f:
            X.5LY r5 = r14.A05
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r4 = r0.A06(r15, r3)
            java.lang.Object[] r3 = r14.A0A
            int r0 = r1 / 3
            int r0 = r0 * 2
            r0 = r3[r0]
            int r8 = r5.BsZ(r7, r4, r0)
            goto L_0x04a6
        L_0x0325:
            boolean r0 = r14.A09(r15, r7, r1)
        L_0x0329:
            if (r0 == 0) goto L_0x0022
            int r0 = r7 << 3
            int r0 = X.C7189Pyc.A00(r0)
            int r8 = r0 + 8
            goto L_0x04a6
        L_0x0335:
            boolean r0 = r14.A09(r15, r7, r1)
        L_0x0339:
            if (r0 == 0) goto L_0x0022
            int r0 = r7 << 3
            int r0 = X.C7189Pyc.A00(r0)
            int r8 = r0 + 4
            goto L_0x04a6
        L_0x0345:
            boolean r0 = r14.A09(r15, r7, r1)
            if (r0 == 0) goto L_0x0022
        L_0x034b:
            long r3 = A01(r15, r3)
            int r0 = r7 << 3
            int r8 = X.C7189Pyc.A00(r0)
            int r4 = X.C7189Pyc.A01(r3)
            goto L_0x0471
        L_0x035b:
            boolean r0 = r14.A09(r15, r7, r1)
            if (r0 == 0) goto L_0x0022
            int r3 = A00(r15, r3)
            int r0 = r7 << 3
            int r8 = X.C7189Pyc.A00(r0)
            if (r3 < 0) goto L_0x0437
            goto L_0x0432
        L_0x036f:
            boolean r0 = r14.A09(r15, r7, r1)
        L_0x0373:
            if (r0 == 0) goto L_0x0022
            int r0 = r7 << 3
            int r0 = X.C7189Pyc.A00(r0)
            int r8 = r0 + 8
            goto L_0x04a6
        L_0x037f:
            boolean r0 = r14.A09(r15, r7, r1)
        L_0x0383:
            if (r0 == 0) goto L_0x0022
            int r0 = r7 << 3
            int r0 = X.C7189Pyc.A00(r0)
            int r8 = r0 + 4
            goto L_0x04a6
        L_0x038f:
            boolean r0 = r14.A09(r15, r7, r1)
        L_0x0393:
            if (r0 == 0) goto L_0x0022
            int r0 = r7 << 3
            int r0 = X.C7189Pyc.A00(r0)
            int r8 = r0 + 1
            goto L_0x04a6
        L_0x039f:
            boolean r0 = r14.A09(r15, r7, r1)
        L_0x03a3:
            if (r0 == 0) goto L_0x0022
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r3 = r0.A06(r15, r3)
            boolean r0 = r3 instanceof X.AnonymousClass5L9
            if (r0 == 0) goto L_0x03b7
            X.5L9 r3 = (X.AnonymousClass5L9) r3
            int r8 = X.C7189Pyc.A02(r3, r7)
            goto L_0x04a6
        L_0x03b7:
            java.lang.String r3 = (java.lang.String) r3
            int r0 = r7 << 3
            int r8 = X.C7189Pyc.A00(r0)
            int r4 = X.C7189Pyc.A04(r3)
            goto L_0x0471
        L_0x03c5:
            boolean r0 = r14.A09(r15, r7, r1)
        L_0x03c9:
            if (r0 == 0) goto L_0x0022
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r6 = r0.A06(r15, r3)
            X.5L3 r5 = r14.A03(r1)
            X.5L5 r0 = X.AnonymousClass5L4.A02
            X.5Km r6 = (X.C284005Km) r6
            int r0 = r7 << 3
            int r8 = X.C7189Pyc.A00(r0)
            X.5Kl r6 = (X.C283995Kl) r6
            r4 = r6
            X.5Kk r4 = (X.C283985Kk) r4
            int r3 = r4.memoizedSerializedSize
            r0 = -1
            if (r3 != r0) goto L_0x03ef
            int r3 = r5.Bsa(r6)
            r4.memoizedSerializedSize = r3
        L_0x03ef:
            int r0 = X.C7189Pyc.A00(r3)
            int r0 = r0 + r3
            int r8 = r8 + r0
            goto L_0x04a6
        L_0x03f7:
            boolean r0 = r14.A09(r15, r7, r1)
        L_0x03fb:
            if (r0 == 0) goto L_0x0022
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r0 = r0.A06(r15, r3)
            X.5L9 r0 = (X.AnonymousClass5L9) r0
            int r8 = X.C7189Pyc.A02(r0, r7)
            goto L_0x04a6
        L_0x040b:
            boolean r0 = r14.A09(r15, r7, r1)
            if (r0 == 0) goto L_0x0022
            int r3 = A00(r15, r3)
            int r0 = r7 << 3
            int r8 = X.C7189Pyc.A00(r0)
            int r4 = X.C7189Pyc.A00(r3)
            goto L_0x0471
        L_0x0420:
            boolean r0 = r14.A09(r15, r7, r1)
            if (r0 == 0) goto L_0x0022
            int r3 = A00(r15, r3)
            int r0 = r7 << 3
            int r8 = X.C7189Pyc.A00(r0)
            if (r3 < 0) goto L_0x0437
        L_0x0432:
            int r4 = X.C7189Pyc.A00(r3)
            goto L_0x0471
        L_0x0437:
            r4 = 10
            goto L_0x0471
        L_0x043a:
            boolean r0 = r14.A09(r15, r7, r1)
        L_0x043e:
            if (r0 == 0) goto L_0x0022
            int r0 = r7 << 3
            int r0 = X.C7189Pyc.A00(r0)
            int r8 = r0 + 4
            goto L_0x04a6
        L_0x0449:
            boolean r0 = r14.A09(r15, r7, r1)
        L_0x044d:
            if (r0 == 0) goto L_0x0022
            int r0 = r7 << 3
            int r0 = X.C7189Pyc.A00(r0)
            int r8 = r0 + 8
            goto L_0x04a6
        L_0x0458:
            boolean r0 = r14.A09(r15, r7, r1)
            if (r0 == 0) goto L_0x0022
            int r4 = A00(r15, r3)
            int r0 = r7 << 3
            int r8 = X.C7189Pyc.A00(r0)
            int r3 = r4 << 1
            int r0 = r4 >> 31
            r0 = r0 ^ r3
            int r4 = X.C7189Pyc.A00(r0)
        L_0x0471:
            int r8 = r8 + r4
            goto L_0x04a6
        L_0x0473:
            boolean r0 = r14.A09(r15, r7, r1)
            if (r0 == 0) goto L_0x0022
            long r5 = A01(r15, r3)
            int r0 = r7 << 3
            int r8 = X.C7189Pyc.A00(r0)
            r0 = 1
            long r3 = r5 << r0
            r0 = 63
            long r5 = r5 >> r0
            long r5 = r5 ^ r3
            int r0 = X.C7189Pyc.A01(r5)
            int r8 = r8 + r0
            goto L_0x04a6
        L_0x0490:
            boolean r0 = r14.A09(r15, r7, r1)
        L_0x0494:
            if (r0 == 0) goto L_0x0022
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r3 = r0.A06(r15, r3)
            X.5Km r3 = (X.C284005Km) r3
            X.5L3 r0 = r14.A03(r1)
            int r8 = X.C7189Pyc.A03(r3, r0, r7)
        L_0x04a6:
            int r13 = r13 + r8
            goto L_0x0022
        L_0x04a9:
            sun.misc.Unsafe r4 = A0F
            r3 = -1
            r2 = 0
            r13 = 0
            r12 = 0
        L_0x04af:
            int[] r1 = r14.A08
            int r0 = r1.length
            if (r2 >= r0) goto L_0x08f4
            int r0 = r2 + 1
            r9 = r1[r0]
            r6 = r1[r2]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r9
            int r8 = r0 >>> 20
            r0 = 17
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r10 = 1
            if (r8 > r0) goto L_0x08f1
            int r0 = r2 + 2
            r0 = r1[r0]
            r7 = r11 & r0
            int r0 = r0 >>> 20
            int r5 = r10 << r0
            if (r7 == r3) goto L_0x04d9
            long r0 = (long) r7
            int r12 = r4.getInt(r15, r0)
            r3 = r7
        L_0x04d9:
            r9 = r9 & r11
            long r0 = (long) r9
            switch(r8) {
                case 0: goto L_0x04e1;
                case 1: goto L_0x04e5;
                case 2: goto L_0x04e9;
                case 3: goto L_0x04fd;
                case 4: goto L_0x0510;
                case 5: goto L_0x0521;
                case 6: goto L_0x0525;
                case 7: goto L_0x0533;
                case 8: goto L_0x053a;
                case 9: goto L_0x0537;
                case 10: goto L_0x053d;
                case 11: goto L_0x0540;
                case 12: goto L_0x054f;
                case 13: goto L_0x0560;
                case 14: goto L_0x0564;
                case 15: goto L_0x0568;
                case 16: goto L_0x0577;
                case 17: goto L_0x0591;
                case 18: goto L_0x0594;
                case 19: goto L_0x05ad;
                case 20: goto L_0x05c8;
                case 21: goto L_0x05e6;
                case 22: goto L_0x0600;
                case 23: goto L_0x0594;
                case 24: goto L_0x05ad;
                case 25: goto L_0x061a;
                case 26: goto L_0x0633;
                case 27: goto L_0x063f;
                case 28: goto L_0x064f;
                case 29: goto L_0x065b;
                case 30: goto L_0x0674;
                case 31: goto L_0x05ad;
                case 32: goto L_0x0594;
                case 33: goto L_0x068d;
                case 34: goto L_0x06a6;
                case 35: goto L_0x06c4;
                case 36: goto L_0x06d3;
                case 37: goto L_0x06e2;
                case 38: goto L_0x06ed;
                case 39: goto L_0x06f8;
                case 40: goto L_0x06c4;
                case 41: goto L_0x06d3;
                case 42: goto L_0x0703;
                case 43: goto L_0x0710;
                case 44: goto L_0x071b;
                case 45: goto L_0x06d3;
                case 46: goto L_0x06c4;
                case 47: goto L_0x0726;
                case 48: goto L_0x0731;
                case 49: goto L_0x074b;
                case 50: goto L_0x0771;
                case 51: goto L_0x0785;
                case 52: goto L_0x0795;
                case 53: goto L_0x07a5;
                case 54: goto L_0x07ac;
                case 55: goto L_0x07c2;
                case 56: goto L_0x07ca;
                case 57: goto L_0x07da;
                case 58: goto L_0x07ea;
                case 59: goto L_0x07fa;
                case 60: goto L_0x081e;
                case 61: goto L_0x084c;
                case 62: goto L_0x085e;
                case 63: goto L_0x086f;
                case 64: goto L_0x0885;
                case 65: goto L_0x0894;
                case 66: goto L_0x08a3;
                case 67: goto L_0x08be;
                case 68: goto L_0x08da;
                default: goto L_0x04de;
            }
        L_0x04de:
            int r2 = r2 + 3
            goto L_0x04af
        L_0x04e1:
            r0 = r12 & r5
            goto L_0x0789
        L_0x04e5:
            r0 = r12 & r5
            goto L_0x0799
        L_0x04e9:
            r5 = r5 & r12
            if (r5 == 0) goto L_0x04de
            long r7 = r4.getLong(r15, r0)
            int r0 = r6 << 3
            int r9 = X.C7189Pyc.A00(r0)
            int r0 = X.C7189Pyc.A01(r7)
            int r9 = r9 + r0
            goto L_0x08ee
        L_0x04fd:
            r5 = r5 & r12
            if (r5 == 0) goto L_0x04de
            long r7 = r4.getLong(r15, r0)
            int r0 = r6 << 3
            int r9 = X.C7189Pyc.A00(r0)
            int r5 = X.C7189Pyc.A01(r7)
            goto L_0x08bc
        L_0x0510:
            r5 = r5 & r12
            if (r5 == 0) goto L_0x04de
            int r1 = r4.getInt(r15, r0)
            int r0 = r6 << 3
            int r9 = X.C7189Pyc.A00(r0)
            if (r1 < 0) goto L_0x0882
            goto L_0x08b8
        L_0x0521:
            r0 = r12 & r5
            goto L_0x07ce
        L_0x0525:
            r0 = r12 & r5
            if (r0 == 0) goto L_0x04de
            int r0 = r6 << 3
            int r0 = X.C7189Pyc.A00(r0)
            int r9 = r0 + 4
            goto L_0x08ee
        L_0x0533:
            r0 = r12 & r5
            goto L_0x07ee
        L_0x0537:
            r5 = r5 & r12
            goto L_0x0822
        L_0x053a:
            r5 = r5 & r12
            goto L_0x07fe
        L_0x053d:
            r5 = r5 & r12
            goto L_0x0850
        L_0x0540:
            r5 = r5 & r12
            if (r5 == 0) goto L_0x04de
            int r1 = r4.getInt(r15, r0)
            int r0 = r6 << 3
            int r9 = X.C7189Pyc.A00(r0)
            goto L_0x08b8
        L_0x054f:
            r5 = r5 & r12
            if (r5 == 0) goto L_0x04de
            int r1 = r4.getInt(r15, r0)
            int r0 = r6 << 3
            int r9 = X.C7189Pyc.A00(r0)
            if (r1 < 0) goto L_0x0882
            goto L_0x08b8
        L_0x0560:
            r0 = r12 & r5
            goto L_0x0889
        L_0x0564:
            r0 = r12 & r5
            goto L_0x0898
        L_0x0568:
            r5 = r5 & r12
            if (r5 == 0) goto L_0x04de
            int r1 = r4.getInt(r15, r0)
            int r0 = r6 << 3
            int r9 = X.C7189Pyc.A00(r0)
            goto L_0x08b3
        L_0x0577:
            r5 = r5 & r12
            if (r5 == 0) goto L_0x04de
            long r7 = r4.getLong(r15, r0)
            int r0 = r6 << 3
            int r9 = X.C7189Pyc.A00(r0)
            long r5 = r7 << r10
            r0 = 63
            long r7 = r7 >> r0
            long r7 = r7 ^ r5
            int r0 = X.C7189Pyc.A01(r7)
            int r9 = r9 + r0
            goto L_0x08ee
        L_0x0591:
            r5 = r5 & r12
            goto L_0x08de
        L_0x0594:
            java.lang.Object r1 = r4.getObject(r15, r0)
            java.util.List r1 = (java.util.List) r1
            X.5L5 r0 = X.AnonymousClass5L4.A02
            int r9 = r1.size()
            if (r9 == 0) goto L_0x06c1
            int r0 = r6 << 3
            int r0 = X.C7189Pyc.A00(r0)
            int r0 = r0 + 8
            int r9 = r9 * r0
            goto L_0x08ee
        L_0x05ad:
            java.lang.Object r1 = r4.getObject(r15, r0)
            java.util.List r1 = (java.util.List) r1
            X.5L5 r0 = X.AnonymousClass5L4.A02
            int r1 = r1.size()
            r9 = 0
            if (r1 == 0) goto L_0x08ee
            int r0 = r6 << 3
            int r0 = X.C7189Pyc.A00(r0)
            int r0 = r0 + 4
            int r9 = r1 * r0
            goto L_0x08ee
        L_0x05c8:
            java.lang.Object r1 = r4.getObject(r15, r0)
            java.util.List r1 = (java.util.List) r1
            X.5L5 r0 = X.AnonymousClass5L4.A02
            int r0 = r1.size()
            if (r0 == 0) goto L_0x06c1
            int r9 = X.AnonymousClass5L4.A03(r1)
            int r5 = r1.size()
            int r0 = r6 << 3
            int r0 = X.C7189Pyc.A00(r0)
            goto L_0x06be
        L_0x05e6:
            java.lang.Object r1 = r4.getObject(r15, r0)
            java.util.List r1 = (java.util.List) r1
            X.5L5 r0 = X.AnonymousClass5L4.A02
            int r5 = r1.size()
            if (r5 == 0) goto L_0x06c1
            int r9 = X.AnonymousClass5L4.A07(r1)
            int r0 = r6 << 3
            int r0 = X.C7189Pyc.A00(r0)
            goto L_0x06be
        L_0x0600:
            java.lang.Object r1 = r4.getObject(r15, r0)
            java.util.List r1 = (java.util.List) r1
            X.5L5 r0 = X.AnonymousClass5L4.A02
            int r5 = r1.size()
            if (r5 == 0) goto L_0x06c1
            int r9 = X.AnonymousClass5L4.A02(r1)
            int r0 = r6 << 3
            int r0 = X.C7189Pyc.A00(r0)
            goto L_0x06be
        L_0x061a:
            java.lang.Object r1 = r4.getObject(r15, r0)
            java.util.List r1 = (java.util.List) r1
            X.5L5 r0 = X.AnonymousClass5L4.A02
            int r9 = r1.size()
            if (r9 == 0) goto L_0x06c1
            int r0 = r6 << 3
            int r0 = X.C7189Pyc.A00(r0)
            int r0 = r0 + 1
            int r9 = r9 * r0
            goto L_0x08ee
        L_0x0633:
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            int r9 = X.AnonymousClass5L4.A09(r0, r6)
            goto L_0x08ee
        L_0x063f:
            java.lang.Object r1 = r4.getObject(r15, r0)
            java.util.List r1 = (java.util.List) r1
            X.5L3 r0 = r14.A03(r2)
            int r9 = X.AnonymousClass5L4.A00(r0, r1, r6)
            goto L_0x08ee
        L_0x064f:
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            int r9 = X.AnonymousClass5L4.A08(r0, r6)
            goto L_0x08ee
        L_0x065b:
            java.lang.Object r1 = r4.getObject(r15, r0)
            java.util.List r1 = (java.util.List) r1
            X.5L5 r0 = X.AnonymousClass5L4.A02
            int r5 = r1.size()
            if (r5 == 0) goto L_0x06c1
            int r9 = X.AnonymousClass5L4.A06(r1)
            int r0 = r6 << 3
            int r0 = X.C7189Pyc.A00(r0)
            goto L_0x06be
        L_0x0674:
            java.lang.Object r1 = r4.getObject(r15, r0)
            java.util.List r1 = (java.util.List) r1
            X.5L5 r0 = X.AnonymousClass5L4.A02
            int r5 = r1.size()
            if (r5 == 0) goto L_0x06c1
            int r9 = X.AnonymousClass5L4.A01(r1)
            int r0 = r6 << 3
            int r0 = X.C7189Pyc.A00(r0)
            goto L_0x06be
        L_0x068d:
            java.lang.Object r1 = r4.getObject(r15, r0)
            java.util.List r1 = (java.util.List) r1
            X.5L5 r0 = X.AnonymousClass5L4.A02
            int r5 = r1.size()
            if (r5 == 0) goto L_0x06c1
            int r9 = X.AnonymousClass5L4.A04(r1)
            int r0 = r6 << 3
            int r0 = X.C7189Pyc.A00(r0)
            goto L_0x06be
        L_0x06a6:
            java.lang.Object r1 = r4.getObject(r15, r0)
            java.util.List r1 = (java.util.List) r1
            X.5L5 r0 = X.AnonymousClass5L4.A02
            int r5 = r1.size()
            if (r5 == 0) goto L_0x06c1
            int r9 = X.AnonymousClass5L4.A05(r1)
            int r0 = r6 << 3
            int r0 = X.C7189Pyc.A00(r0)
        L_0x06be:
            int r5 = r5 * r0
            goto L_0x08bc
        L_0x06c1:
            r9 = 0
            goto L_0x08ee
        L_0x06c4:
            java.lang.Object r1 = r4.getObject(r15, r0)
            java.util.List r1 = (java.util.List) r1
            X.5L5 r0 = X.AnonymousClass5L4.A02
            int r0 = r1.size()
            int r1 = r0 * 8
            goto L_0x073b
        L_0x06d3:
            java.lang.Object r1 = r4.getObject(r15, r0)
            java.util.List r1 = (java.util.List) r1
            X.5L5 r0 = X.AnonymousClass5L4.A02
            int r0 = r1.size()
            int r1 = r0 * 4
            goto L_0x073b
        L_0x06e2:
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.AnonymousClass5L4.A03(r0)
            goto L_0x073b
        L_0x06ed:
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.AnonymousClass5L4.A07(r0)
            goto L_0x073b
        L_0x06f8:
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.AnonymousClass5L4.A02(r0)
            goto L_0x073b
        L_0x0703:
            java.lang.Object r1 = r4.getObject(r15, r0)
            java.util.List r1 = (java.util.List) r1
            X.5L5 r0 = X.AnonymousClass5L4.A02
            int r1 = r1.size()
            goto L_0x073b
        L_0x0710:
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.AnonymousClass5L4.A06(r0)
            goto L_0x073b
        L_0x071b:
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.AnonymousClass5L4.A01(r0)
            goto L_0x073b
        L_0x0726:
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.AnonymousClass5L4.A04(r0)
            goto L_0x073b
        L_0x0731:
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.AnonymousClass5L4.A05(r0)
        L_0x073b:
            if (r1 <= 0) goto L_0x04de
            int r0 = r6 << 3
            int r9 = X.C7189Pyc.A00(r0)
            int r0 = X.C7189Pyc.A00(r1)
            int r9 = r9 + r0
            int r9 = r9 + r1
            goto L_0x08ee
        L_0x074b:
            java.lang.Object r8 = r4.getObject(r15, r0)
            java.util.List r8 = (java.util.List) r8
            X.5L3 r7 = r14.A03(r2)
            X.5L5 r0 = X.AnonymousClass5L4.A02
            int r5 = r8.size()
            r1 = 0
            r9 = 0
            if (r5 != 0) goto L_0x0761
            goto L_0x08ee
        L_0x0761:
            if (r1 >= r5) goto L_0x08ee
            java.lang.Object r0 = r8.get(r1)
            X.5Km r0 = (X.C284005Km) r0
            int r0 = X.C7189Pyc.A03(r0, r7, r6)
            int r9 = r9 + r0
            int r1 = r1 + 1
            goto L_0x0761
        L_0x0771:
            X.5LY r7 = r14.A05
            java.lang.Object r5 = r4.getObject(r15, r0)
            java.lang.Object[] r1 = r14.A0A
            int r0 = r2 / 3
            int r0 = r0 * 2
            r0 = r1[r0]
            int r9 = r7.BsZ(r6, r5, r0)
            goto L_0x08ee
        L_0x0785:
            boolean r0 = r14.A09(r15, r6, r2)
        L_0x0789:
            if (r0 == 0) goto L_0x04de
            int r0 = r6 << 3
            int r0 = X.C7189Pyc.A00(r0)
            int r9 = r0 + 8
            goto L_0x08ee
        L_0x0795:
            boolean r0 = r14.A09(r15, r6, r2)
        L_0x0799:
            if (r0 == 0) goto L_0x04de
            int r0 = r6 << 3
            int r0 = X.C7189Pyc.A00(r0)
            int r9 = r0 + 4
            goto L_0x08ee
        L_0x07a5:
            boolean r5 = r14.A09(r15, r6, r2)
            if (r5 == 0) goto L_0x04de
            goto L_0x07b2
        L_0x07ac:
            boolean r5 = r14.A09(r15, r6, r2)
            if (r5 == 0) goto L_0x04de
        L_0x07b2:
            long r7 = A01(r15, r0)
            int r0 = r6 << 3
            int r9 = X.C7189Pyc.A00(r0)
            int r5 = X.C7189Pyc.A01(r7)
            goto L_0x08bc
        L_0x07c2:
            boolean r5 = r14.A09(r15, r6, r2)
            if (r5 == 0) goto L_0x04de
            goto L_0x0875
        L_0x07ca:
            boolean r0 = r14.A09(r15, r6, r2)
        L_0x07ce:
            if (r0 == 0) goto L_0x04de
            int r0 = r6 << 3
            int r0 = X.C7189Pyc.A00(r0)
            int r9 = r0 + 8
            goto L_0x08ee
        L_0x07da:
            boolean r0 = r14.A09(r15, r6, r2)
            if (r0 == 0) goto L_0x04de
            int r0 = r6 << 3
            int r0 = X.C7189Pyc.A00(r0)
            int r9 = r0 + 4
            goto L_0x08ee
        L_0x07ea:
            boolean r0 = r14.A09(r15, r6, r2)
        L_0x07ee:
            if (r0 == 0) goto L_0x04de
            int r0 = r6 << 3
            int r0 = X.C7189Pyc.A00(r0)
            int r9 = r0 + 1
            goto L_0x08ee
        L_0x07fa:
            boolean r5 = r14.A09(r15, r6, r2)
        L_0x07fe:
            if (r5 == 0) goto L_0x04de
            java.lang.Object r1 = r4.getObject(r15, r0)
            boolean r0 = r1 instanceof X.AnonymousClass5L9
            if (r0 == 0) goto L_0x0810
            X.5L9 r1 = (X.AnonymousClass5L9) r1
            int r9 = X.C7189Pyc.A02(r1, r6)
            goto L_0x08ee
        L_0x0810:
            java.lang.String r1 = (java.lang.String) r1
            int r0 = r6 << 3
            int r9 = X.C7189Pyc.A00(r0)
            int r5 = X.C7189Pyc.A04(r1)
            goto L_0x08bc
        L_0x081e:
            boolean r5 = r14.A09(r15, r6, r2)
        L_0x0822:
            if (r5 == 0) goto L_0x04de
            java.lang.Object r8 = r4.getObject(r15, r0)
            X.5L3 r7 = r14.A03(r2)
            X.5L5 r0 = X.AnonymousClass5L4.A02
            X.5Km r8 = (X.C284005Km) r8
            int r0 = r6 << 3
            int r9 = X.C7189Pyc.A00(r0)
            X.5Kl r8 = (X.C283995Kl) r8
            r5 = r8
            X.5Kk r5 = (X.C283985Kk) r5
            int r1 = r5.memoizedSerializedSize
            r0 = -1
            if (r1 != r0) goto L_0x0846
            int r1 = r7.Bsa(r8)
            r5.memoizedSerializedSize = r1
        L_0x0846:
            int r5 = X.C7189Pyc.A00(r1)
            int r5 = r5 + r1
            goto L_0x08bc
        L_0x084c:
            boolean r5 = r14.A09(r15, r6, r2)
        L_0x0850:
            if (r5 == 0) goto L_0x04de
            java.lang.Object r0 = r4.getObject(r15, r0)
            X.5L9 r0 = (X.AnonymousClass5L9) r0
            int r9 = X.C7189Pyc.A02(r0, r6)
            goto L_0x08ee
        L_0x085e:
            boolean r5 = r14.A09(r15, r6, r2)
            if (r5 == 0) goto L_0x04de
            int r1 = A00(r15, r0)
            int r0 = r6 << 3
            int r9 = X.C7189Pyc.A00(r0)
            goto L_0x08b8
        L_0x086f:
            boolean r5 = r14.A09(r15, r6, r2)
            if (r5 == 0) goto L_0x04de
        L_0x0875:
            int r1 = A00(r15, r0)
            int r0 = r6 << 3
            int r9 = X.C7189Pyc.A00(r0)
            if (r1 < 0) goto L_0x0882
            goto L_0x08b8
        L_0x0882:
            r5 = 10
            goto L_0x08bc
        L_0x0885:
            boolean r0 = r14.A09(r15, r6, r2)
        L_0x0889:
            if (r0 == 0) goto L_0x04de
            int r0 = r6 << 3
            int r0 = X.C7189Pyc.A00(r0)
            int r9 = r0 + 4
            goto L_0x08ee
        L_0x0894:
            boolean r0 = r14.A09(r15, r6, r2)
        L_0x0898:
            if (r0 == 0) goto L_0x04de
            int r0 = r6 << 3
            int r0 = X.C7189Pyc.A00(r0)
            int r9 = r0 + 8
            goto L_0x08ee
        L_0x08a3:
            boolean r5 = r14.A09(r15, r6, r2)
            if (r5 == 0) goto L_0x04de
            int r1 = A00(r15, r0)
            int r0 = r6 << 3
            int r9 = X.C7189Pyc.A00(r0)
        L_0x08b3:
            int r0 = r1 << 1
            int r1 = r1 >> 31
            r1 = r1 ^ r0
        L_0x08b8:
            int r5 = X.C7189Pyc.A00(r1)
        L_0x08bc:
            int r9 = r9 + r5
            goto L_0x08ee
        L_0x08be:
            boolean r5 = r14.A09(r15, r6, r2)
            if (r5 == 0) goto L_0x04de
            long r7 = A01(r15, r0)
            int r0 = r6 << 3
            int r9 = X.C7189Pyc.A00(r0)
            long r5 = r7 << r10
            r0 = 63
            long r7 = r7 >> r0
            long r7 = r7 ^ r5
            int r0 = X.C7189Pyc.A01(r7)
            int r9 = r9 + r0
            goto L_0x08ee
        L_0x08da:
            boolean r5 = r14.A09(r15, r6, r2)
        L_0x08de:
            if (r5 == 0) goto L_0x04de
            java.lang.Object r1 = r4.getObject(r15, r0)
            X.5Km r1 = (X.C284005Km) r1
            X.5L3 r0 = r14.A03(r2)
            int r9 = X.C7189Pyc.A03(r1, r0, r6)
        L_0x08ee:
            int r13 = r13 + r9
            goto L_0x04de
        L_0x08f1:
            r5 = 0
            goto L_0x04d9
        L_0x08f4:
            X.5Kk r15 = (X.C283985Kk) r15
            X.5Ko r0 = r15.unknownFields
            int r0 = r0.A00()
            int r13 = r13 + r0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5LZ.Bsa(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        r7 = r7 * 53;
        r0 = X.C284115La.A01.A06(r10, r1).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        r7 = r7 * 53;
        r0 = ((java.lang.String) X.C284115La.A01.A06(r10, r1)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bf, code lost:
        r0 = X.C284045Ks.A03;
        r0 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c3, code lost:
        if (r1 == false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c5, code lost:
        r0 = 1231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ef, code lost:
        r2 = java.lang.Double.doubleToLongBits(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f3, code lost:
        r0 = X.C284045Ks.A03;
        r0 = (int) (r2 ^ (r2 >>> 32));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fb, code lost:
        r7 = r7 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
        r4 = r4 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int CL6(java.lang.Object r10) {
        /*
            r9 = this;
            int[] r6 = r9.A08
            int r5 = r6.length
            r4 = 0
            r7 = 0
        L_0x0005:
            if (r4 >= r5) goto L_0x00fe
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
                case 0: goto L_0x00e7;
                case 1: goto L_0x00da;
                case 2: goto L_0x00d1;
                case 3: goto L_0x00d1;
                case 4: goto L_0x00c8;
                case 5: goto L_0x00d1;
                case 6: goto L_0x00c8;
                case 7: goto L_0x00b7;
                case 8: goto L_0x0049;
                case 9: goto L_0x001f;
                case 10: goto L_0x0035;
                case 11: goto L_0x00c8;
                case 12: goto L_0x00c8;
                case 13: goto L_0x00c8;
                case 14: goto L_0x00d1;
                case 15: goto L_0x00c8;
                case 16: goto L_0x00d1;
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
                case 51: goto L_0x00a2;
                case 52: goto L_0x0089;
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
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r0 = r0.A06(r10, r1)
            if (r0 == 0) goto L_0x002b
            int r3 = r0.hashCode()
        L_0x002b:
            int r7 = r7 * 53
            int r7 = r7 + r3
            goto L_0x001c
        L_0x002f:
            boolean r0 = r9.A09(r10, r8, r4)
            if (r0 == 0) goto L_0x001c
        L_0x0035:
            int r7 = r7 * 53
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r0 = r0.A06(r10, r1)
            int r0 = r0.hashCode()
            goto L_0x00fb
        L_0x0043:
            boolean r0 = r9.A09(r10, r8, r4)
            if (r0 == 0) goto L_0x001c
        L_0x0049:
            int r7 = r7 * 53
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r0 = r0.A06(r10, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.hashCode()
            goto L_0x00fb
        L_0x0059:
            boolean r0 = r9.A09(r10, r8, r4)
            if (r0 == 0) goto L_0x001c
            int r7 = r7 * 53
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r0 = r0.A06(r10, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            goto L_0x00bf
        L_0x006e:
            boolean r0 = r9.A09(r10, r8, r4)
            if (r0 == 0) goto L_0x001c
            int r7 = r7 * 53
            int r0 = A00(r10, r1)
            goto L_0x00fb
        L_0x007c:
            boolean r0 = r9.A09(r10, r8, r4)
            if (r0 == 0) goto L_0x001c
            int r7 = r7 * 53
            long r2 = A01(r10, r1)
            goto L_0x00f3
        L_0x0089:
            boolean r0 = r9.A09(r10, r8, r4)
            if (r0 == 0) goto L_0x001c
            int r7 = r7 * 53
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r0 = r0.A06(r10, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x00fb
        L_0x00a2:
            boolean r0 = r9.A09(r10, r8, r4)
            if (r0 == 0) goto L_0x001c
            int r7 = r7 * 53
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r0 = r0.A06(r10, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            goto L_0x00ef
        L_0x00b7:
            int r7 = r7 * 53
            X.5Ld r0 = X.C284115La.A01
            boolean r1 = r0.A0G(r10, r1)
        L_0x00bf:
            java.nio.charset.Charset r0 = X.C284045Ks.A03
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x00fb
            r0 = 1231(0x4cf, float:1.725E-42)
            goto L_0x00fb
        L_0x00c8:
            int r7 = r7 * 53
            X.5Ld r0 = X.C284115La.A01
            int r0 = r0.A04(r10, r1)
            goto L_0x00fb
        L_0x00d1:
            int r7 = r7 * 53
            X.5Ld r0 = X.C284115La.A01
            long r2 = r0.A05(r10, r1)
            goto L_0x00f3
        L_0x00da:
            int r7 = r7 * 53
            X.5Ld r0 = X.C284115La.A01
            float r0 = r0.A02(r10, r1)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x00fb
        L_0x00e7:
            int r7 = r7 * 53
            X.5Ld r0 = X.C284115La.A01
            double r0 = r0.A01(r10, r1)
        L_0x00ef:
            long r2 = java.lang.Double.doubleToLongBits(r0)
        L_0x00f3:
            java.nio.charset.Charset r0 = X.C284045Ks.A03
            r0 = 32
            long r0 = r2 >>> r0
            long r2 = r2 ^ r0
            int r0 = (int) r2
        L_0x00fb:
            int r7 = r7 + r0
            goto L_0x001c
        L_0x00fe:
            int r1 = r7 * 53
            X.5Kk r10 = (X.C283985Kk) r10
            X.5Ko r0 = r10.unknownFields
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5LZ.CL6(java.lang.Object):int");
    }

    public final void ClW(Object obj) {
        int i;
        Object unmodifiableList;
        int i2 = this.A00;
        while (true) {
            i = this.A03;
            if (i2 >= i) {
                break;
            }
            long j = (long) (this.A08[this.A09[i2] + 1] & 1048575);
            Object A062 = C284115La.A01.A06(obj, j);
            if (A062 != null) {
                ((C284025Kp) A062).A00 = false;
                C284115La.A0A(obj, j, A062);
            }
            i2++;
        }
        int[] iArr = this.A09;
        int length = iArr.length;
        while (i < length) {
            AnonymousClass5LR r3 = this.A04;
            long j2 = (long) iArr[i];
            boolean z = r3 instanceof AnonymousClass5LT;
            Object A063 = C284115La.A01.A06(obj, j2);
            if (z) {
                ((C13248TRo) ((C13980TnW) A063)).A00 = false;
            } else {
                List list = (List) A063;
                if (list instanceof C13977TnT) {
                    unmodifiableList = ((C13977TnT) list).CBg();
                } else if (!AnonymousClass5LS.A00.isAssignableFrom(list.getClass())) {
                    unmodifiableList = Collections.unmodifiableList(list);
                }
                C284115La.A0A(obj, j2, unmodifiableList);
            }
            i++;
        }
        ((C283985Kk) obj).unknownFields.A02 = false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:59|60|(2:67|68)(2:66|336)) */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03c6, code lost:
        r1 = X.AnonymousClass5L4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x062c, code lost:
        r7.A01 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x08a3, code lost:
        r6.A01 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x08c2, code lost:
        X.C284115La.A09(r0, (long) (r17[r3 + 2] & 1048575), r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fd, code lost:
        throw new X.C289845eJ("Unable to parse map entry.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0117, code lost:
        if (r11.A0C() != false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012b, code lost:
        throw new X.C289845eJ("Unable to parse map entry.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r10.A01 = r9;
        X.AnonymousClass5Kq.A01(r10);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0113 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Co6(X.C284055Ku r22, X.C284165Lf r23, java.lang.Object r24) {
        /*
            r21 = this;
            r20 = r22
            r0 = r24
            r20.getClass()
            r2 = r21
            X.5L5 r1 = r2.A0D
            r19 = r1
            r16 = 0
        L_0x000f:
            r1 = r23
            int r10 = r1.B5c()     // Catch:{ all -> 0x098c }
            int r3 = r2.A02     // Catch:{ all -> 0x098c }
            if (r10 < r3) goto L_0x0911
            int r3 = r2.A01     // Catch:{ all -> 0x098c }
            if (r10 > r3) goto L_0x08ef
            r4 = 0
            int[] r3 = r2.A08     // Catch:{ all -> 0x098c }
            r17 = r3
            int r3 = r3.length     // Catch:{ all -> 0x098c }
            int r3 = r3 / 3
            int r5 = r3 + -1
        L_0x0027:
            if (r4 > r5) goto L_0x08ef
            int r3 = r5 + r4
            int r7 = r3 >>> 1
            int r3 = r7 * 3
            r6 = r17[r3]     // Catch:{ all -> 0x098c }
            if (r10 != r6) goto L_0x0034
            goto L_0x003c
        L_0x0034:
            if (r10 >= r6) goto L_0x0039
            int r5 = r7 + -1
            goto L_0x0027
        L_0x0039:
            int r4 = r7 + 1
            goto L_0x0027
        L_0x003c:
            if (r3 < 0) goto L_0x08ef
            int r4 = r3 + 1
            r7 = r17[r4]     // Catch:{ all -> 0x098c }
            r4 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r7
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x0458;
                case 1: goto L_0x0479;
                case 2: goto L_0x0498;
                case 3: goto L_0x04b5;
                case 4: goto L_0x04d2;
                case 5: goto L_0x04eb;
                case 6: goto L_0x0508;
                case 7: goto L_0x0521;
                case 8: goto L_0x013e;
                case 9: goto L_0x0143;
                case 10: goto L_0x0544;
                case 11: goto L_0x055b;
                case 12: goto L_0x07f9;
                case 13: goto L_0x0574;
                case 14: goto L_0x058d;
                case 15: goto L_0x05aa;
                case 16: goto L_0x05c9;
                case 17: goto L_0x0189;
                case 18: goto L_0x01cf;
                case 19: goto L_0x01df;
                case 20: goto L_0x01ef;
                case 21: goto L_0x01ff;
                case 22: goto L_0x020f;
                case 23: goto L_0x021f;
                case 24: goto L_0x022f;
                case 25: goto L_0x023f;
                case 26: goto L_0x0815;
                case 27: goto L_0x024f;
                case 28: goto L_0x028e;
                case 29: goto L_0x02c8;
                case 30: goto L_0x02d8;
                case 31: goto L_0x02e8;
                case 32: goto L_0x02f8;
                case 33: goto L_0x0308;
                case 34: goto L_0x0318;
                case 35: goto L_0x0328;
                case 36: goto L_0x0338;
                case 37: goto L_0x0348;
                case 38: goto L_0x0358;
                case 39: goto L_0x0368;
                case 40: goto L_0x0378;
                case 41: goto L_0x0388;
                case 42: goto L_0x0398;
                case 43: goto L_0x03a8;
                case 44: goto L_0x03b8;
                case 45: goto L_0x03ca;
                case 46: goto L_0x03da;
                case 47: goto L_0x03ea;
                case 48: goto L_0x03fa;
                case 49: goto L_0x05ef;
                case 50: goto L_0x005f;
                case 51: goto L_0x0630;
                case 52: goto L_0x0651;
                case 53: goto L_0x0672;
                case 54: goto L_0x068f;
                case 55: goto L_0x06ac;
                case 56: goto L_0x06c9;
                case 57: goto L_0x06e6;
                case 58: goto L_0x0703;
                case 59: goto L_0x040a;
                case 60: goto L_0x040f;
                case 61: goto L_0x0728;
                case 62: goto L_0x073f;
                case 63: goto L_0x08a7;
                case 64: goto L_0x075c;
                case 65: goto L_0x0779;
                case 66: goto L_0x0796;
                case 67: goto L_0x07b9;
                case 68: goto L_0x07de;
                default: goto L_0x004a;
            }     // Catch:{ all -> 0x098c }
        L_0x004a:
            if (r16 != 0) goto L_0x0053
            X.5Ko r3 = new X.5Ko     // Catch:{ 5eL -> 0x08d0 }
            r3.<init>()     // Catch:{ 5eL -> 0x08d0 }
            r16 = r3
        L_0x0053:
            r4 = r19
            r3 = r16
            boolean r1 = r4.A00(r1, r3)     // Catch:{ 5eL -> 0x08d0 }
            if (r1 != 0) goto L_0x000f
            goto L_0x0930
        L_0x005f:
            java.lang.Object[] r4 = r2.A0A     // Catch:{ 5eL -> 0x08d0 }
            int r3 = r3 / 3
            int r3 = r3 * 2
            r8 = r4[r3]     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            X.5Ld r5 = X.C284115La.A01     // Catch:{ 5eL -> 0x08d0 }
            java.lang.Object r15 = r5.A06(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            if (r15 != 0) goto L_0x009e
            X.5Kp r5 = X.C284025Kp.A01     // Catch:{ 5eL -> 0x08d0 }
            X.5Kp r15 = r5.A01()     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A0A(r0, r3, r15)     // Catch:{ 5eL -> 0x08d0 }
        L_0x007d:
            X.5Kp r15 = (X.C284025Kp) r15     // Catch:{ 5eL -> 0x08d0 }
            X.5LK r8 = (X.AnonymousClass5LK) r8     // Catch:{ 5eL -> 0x08d0 }
            X.5LL r14 = r8.A00     // Catch:{ 5eL -> 0x08d0 }
            r13 = r1
            X.5Le r13 = (X.C284155Le) r13     // Catch:{ 5eL -> 0x08d0 }
            r12 = 2
            X.C284155Le.A04(r13, r12)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r11 = r13.A03     // Catch:{ 5eL -> 0x08d0 }
            r10 = r11
            X.5Kq r10 = (X.AnonymousClass5Kq) r10     // Catch:{ 5eL -> 0x08d0 }
            int r3 = r10.A0F()     // Catch:{ 5eL -> 0x08d0 }
            int r9 = r11.A07(r3)     // Catch:{ 5eL -> 0x08d0 }
            java.lang.String r8 = ""
            java.lang.Object r7 = r14.A03     // Catch:{ 5eL -> 0x08d0 }
            r18 = r7
            goto L_0x00cf
        L_0x009e:
            r5 = r15
            X.5Kp r5 = (X.C284025Kp) r5     // Catch:{ 5eL -> 0x08d0 }
            boolean r5 = r5.A00     // Catch:{ 5eL -> 0x08d0 }
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x007d
            X.5Kp r5 = X.C284025Kp.A01     // Catch:{ 5eL -> 0x08d0 }
            X.5Kp r7 = r5.A01()     // Catch:{ 5eL -> 0x08d0 }
            r6 = r7
            java.util.HashMap r15 = (java.util.HashMap) r15     // Catch:{ 5eL -> 0x08d0 }
            boolean r5 = r15.isEmpty()     // Catch:{ 5eL -> 0x08d0 }
            if (r5 != 0) goto L_0x00ca
            boolean r5 = r7.A00     // Catch:{ 5eL -> 0x08d0 }
            if (r5 != 0) goto L_0x00be
            X.5Kp r6 = r7.A01()     // Catch:{ 5eL -> 0x08d0 }
        L_0x00be:
            X.C284025Kp.A00(r6)     // Catch:{ 5eL -> 0x08d0 }
            boolean r5 = r15.isEmpty()     // Catch:{ 5eL -> 0x08d0 }
            if (r5 != 0) goto L_0x00ca
            r6.putAll(r15)     // Catch:{ 5eL -> 0x08d0 }
        L_0x00ca:
            X.C284115La.A0A(r0, r3, r7)     // Catch:{ 5eL -> 0x08d0 }
            r15 = r7
            goto L_0x007d
        L_0x00cf:
            int r4 = r13.B5c()     // Catch:{ all -> 0x0136 }
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r3) goto L_0x012c
            boolean r3 = r11.A0C()     // Catch:{ all -> 0x0136 }
            if (r3 != 0) goto L_0x012c
            r3 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r3) goto L_0x010b
            if (r4 == r12) goto L_0x00fe
            boolean r3 = r11.A0C()     // Catch:{ 5eL -> 0x0113 }
            if (r3 != 0) goto L_0x00f8
            int r4 = r13.A02     // Catch:{ 5eL -> 0x0113 }
            int r3 = r13.A00     // Catch:{ 5eL -> 0x0113 }
            if (r4 == r3) goto L_0x00f8
            boolean r3 = r11.A0D(r4)     // Catch:{ 5eL -> 0x0113 }
            if (r3 == 0) goto L_0x00f8
            goto L_0x00cf
        L_0x00f8:
            X.5eJ r3 = new X.5eJ     // Catch:{ 5eL -> 0x0113 }
            r3.<init>(r6)     // Catch:{ 5eL -> 0x0113 }
            throw r3     // Catch:{ 5eL -> 0x0113 }
        L_0x00fe:
            X.5L7 r5 = r14.A01     // Catch:{ 5eL -> 0x0113 }
            java.lang.Class r4 = r18.getClass()     // Catch:{ 5eL -> 0x0113 }
            r3 = r20
            java.lang.Object r7 = X.C284155Le.A02(r13, r3, r5, r4)     // Catch:{ 5eL -> 0x0113 }
            goto L_0x00cf
        L_0x010b:
            X.5L7 r4 = r14.A00     // Catch:{ 5eL -> 0x0113 }
            r3 = 0
            java.lang.Object r8 = X.C284155Le.A02(r13, r3, r4, r3)     // Catch:{ 5eL -> 0x0113 }
            goto L_0x00cf
        L_0x0113:
            boolean r3 = r11.A0C()     // Catch:{ all -> 0x0136 }
            if (r3 != 0) goto L_0x0126
            int r4 = r13.A02     // Catch:{ all -> 0x0136 }
            int r3 = r13.A00     // Catch:{ all -> 0x0136 }
            if (r4 == r3) goto L_0x0126
            boolean r3 = r11.A0D(r4)     // Catch:{ all -> 0x0136 }
            if (r3 == 0) goto L_0x0126
            goto L_0x00cf
        L_0x0126:
            X.5eJ r3 = new X.5eJ     // Catch:{ all -> 0x0136 }
            r3.<init>(r6)     // Catch:{ all -> 0x0136 }
            throw r3     // Catch:{ all -> 0x0136 }
        L_0x012c:
            r15.put(r8, r7)     // Catch:{ all -> 0x0136 }
            r10.A01 = r9     // Catch:{ 5eL -> 0x08d0 }
            X.AnonymousClass5Kq.A01(r10)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x0136:
            r4 = move-exception
            r10.A01 = r9     // Catch:{ 5eL -> 0x08d0 }
            X.AnonymousClass5Kq.A01(r10)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x083a
        L_0x013e:
            r2.A05(r1, r0, r7)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x0810
        L_0x0143:
            boolean r4 = r2.A08(r3, r0)     // Catch:{ 5eL -> 0x08d0 }
            if (r4 == 0) goto L_0x016e
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            X.5Ld r6 = X.C284115La.A01     // Catch:{ 5eL -> 0x08d0 }
            java.lang.Object r8 = r6.A06(r0, r4)     // Catch:{ 5eL -> 0x08d0 }
            X.5L3 r7 = r2.A03(r3)     // Catch:{ 5eL -> 0x08d0 }
            r6 = r1
            X.5Le r6 = (X.C284155Le) r6     // Catch:{ 5eL -> 0x08d0 }
            r3 = 2
            X.C284155Le.A04(r6, r3)     // Catch:{ 5eL -> 0x08d0 }
            r3 = r20
            java.lang.Object r3 = X.C284155Le.A01(r6, r3, r7)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kk r3 = X.C284045Ks.A00(r8, r3)     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A0A(r0, r4, r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x016e:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            X.5L3 r8 = r2.A03(r3)     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 2
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            r6 = r20
            java.lang.Object r6 = X.C284155Le.A01(r7, r6, r8)     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A0A(r0, r4, r6)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x0810
        L_0x0189:
            boolean r4 = r2.A08(r3, r0)     // Catch:{ 5eL -> 0x08d0 }
            if (r4 == 0) goto L_0x01b4
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            X.5Ld r6 = X.C284115La.A01     // Catch:{ 5eL -> 0x08d0 }
            java.lang.Object r8 = r6.A06(r0, r4)     // Catch:{ 5eL -> 0x08d0 }
            X.5L3 r7 = r2.A03(r3)     // Catch:{ 5eL -> 0x08d0 }
            r6 = r1
            X.5Le r6 = (X.C284155Le) r6     // Catch:{ 5eL -> 0x08d0 }
            r3 = 3
            X.C284155Le.A04(r6, r3)     // Catch:{ 5eL -> 0x08d0 }
            r3 = r20
            java.lang.Object r3 = X.C284155Le.A00(r6, r3, r7)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kk r3 = X.C284045Ks.A00(r8, r3)     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A0A(r0, r4, r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x01b4:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            X.5L3 r8 = r2.A03(r3)     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 3
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            r6 = r20
            java.lang.Object r6 = X.C284155Le.A00(r7, r6, r8)     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A0A(r0, r4, r6)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x0810
        L_0x01cf:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r3 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r1.E6L(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x01df:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r3 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r1.E6R(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x01ef:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r3 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r1.E6W(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x01ff:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r3 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r1.E6o(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x020f:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r3 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r1.E6V(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x021f:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r3 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r1.E6Q(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x022f:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r3 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r1.E6P(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x023f:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r3 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r1.E6G(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x024f:
            X.5L3 r5 = r2.A03(r3)     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            X.5LR r6 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r8 = r6.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            int r6 = r7.A02     // Catch:{ 5eL -> 0x08d0 }
            r4 = r6 & 7
            r3 = 2
            if (r4 == r3) goto L_0x0271
            java.lang.String r3 = "Protocol message tag had invalid wire type."
            X.5eL r4 = new X.5eL     // Catch:{ 5eL -> 0x08d0 }
            r4.<init>(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x083a
        L_0x0271:
            r3 = r20
            java.lang.Object r3 = X.C284155Le.A01(r7, r3, r5)     // Catch:{ 5eL -> 0x08d0 }
            r8.add(r3)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r4 = r7.A03     // Catch:{ 5eL -> 0x08d0 }
            boolean r3 = r4.A0C()     // Catch:{ 5eL -> 0x08d0 }
            if (r3 != 0) goto L_0x000f
            int r3 = r7.A01     // Catch:{ 5eL -> 0x08d0 }
            if (r3 != 0) goto L_0x000f
            int r3 = r4.A06()     // Catch:{ 5eL -> 0x08d0 }
            if (r3 == r6) goto L_0x0271
            goto L_0x062c
        L_0x028e:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r7 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r6 = r1
            X.5Le r6 = (X.C284155Le) r6     // Catch:{ 5eL -> 0x08d0 }
            int r3 = r6.A02     // Catch:{ 5eL -> 0x08d0 }
            r3 = r3 & 7
            r5 = 2
            if (r3 == r5) goto L_0x02ac
            java.lang.String r3 = "Protocol message tag had invalid wire type."
            X.5eL r4 = new X.5eL     // Catch:{ 5eL -> 0x08d0 }
            r4.<init>(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x083a
        L_0x02ac:
            X.C284155Le.A04(r6, r5)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r4 = r6.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5L9 r3 = r4.A08()     // Catch:{ 5eL -> 0x08d0 }
            r7.add(r3)     // Catch:{ 5eL -> 0x08d0 }
            boolean r3 = r4.A0C()     // Catch:{ 5eL -> 0x08d0 }
            if (r3 != 0) goto L_0x000f
            int r4 = r4.A06()     // Catch:{ 5eL -> 0x08d0 }
            int r3 = r6.A02     // Catch:{ 5eL -> 0x08d0 }
            if (r4 == r3) goto L_0x02ac
            goto L_0x08a3
        L_0x02c8:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r3 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r1.E6n(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x02d8:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r3 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r1.E6M(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x03c6
        L_0x02e8:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r3 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r1.E6e(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x02f8:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r3 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r1.E6f(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x0308:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r3 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r1.E6g(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x0318:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r3 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r1.E6h(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x0328:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r3 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r1.E6L(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x0338:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r3 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r1.E6R(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x0348:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r3 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r1.E6W(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x0358:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r3 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r1.E6o(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x0368:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r3 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r1.E6V(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x0378:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r3 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r1.E6Q(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x0388:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r3 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r1.E6P(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x0398:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r3 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r1.E6G(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x03a8:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r3 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r1.E6n(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x03b8:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r3 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r1.E6M(r3)     // Catch:{ 5eL -> 0x08d0 }
        L_0x03c6:
            X.5L5 r1 = X.AnonymousClass5L4.A02     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x03ca:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r3 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r1.E6e(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x03da:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r3 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r1.E6f(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x03ea:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r3 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r1.E6g(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x03fa:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r3 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            r1.E6h(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x040a:
            r2.A05(r1, r0, r7)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x08c2
        L_0x040f:
            boolean r4 = r2.A09(r0, r10, r3)     // Catch:{ 5eL -> 0x08d0 }
            if (r4 == 0) goto L_0x043a
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            X.5Ld r6 = X.C284115La.A01     // Catch:{ 5eL -> 0x08d0 }
            java.lang.Object r9 = r6.A06(r0, r4)     // Catch:{ 5eL -> 0x08d0 }
            X.5L3 r8 = r2.A03(r3)     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 2
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            r6 = r20
            java.lang.Object r6 = X.C284155Le.A01(r7, r6, r8)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kk r6 = X.C284045Ks.A00(r9, r6)     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A0A(r0, r4, r6)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x08c2
        L_0x043a:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            X.5L3 r8 = r2.A03(r3)     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 2
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            r6 = r20
            java.lang.Object r6 = X.C284155Le.A01(r7, r6, r8)     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A0A(r0, r4, r6)     // Catch:{ 5eL -> 0x08d0 }
            r2.A07(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x08c2
        L_0x0458:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 1
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r6 = r7.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5Kq r6 = (X.AnonymousClass5Kq) r6     // Catch:{ 5eL -> 0x08d0 }
            long r6 = r6.A0G()     // Catch:{ 5eL -> 0x08d0 }
            double r10 = java.lang.Double.longBitsToDouble(r6)     // Catch:{ 5eL -> 0x08d0 }
            X.5Ld r6 = X.C284115La.A01     // Catch:{ 5eL -> 0x08d0 }
            r7 = r0
            r8 = r4
            r6.A09(r7, r8, r10)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x0810
        L_0x0479:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 5
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r6 = r7.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5Kq r6 = (X.AnonymousClass5Kq) r6     // Catch:{ 5eL -> 0x08d0 }
            int r6 = r6.A0E()     // Catch:{ 5eL -> 0x08d0 }
            float r7 = java.lang.Float.intBitsToFloat(r6)     // Catch:{ 5eL -> 0x08d0 }
            X.5Ld r6 = X.C284115La.A01     // Catch:{ 5eL -> 0x08d0 }
            r6.A0A(r0, r4, r7)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x0810
        L_0x0498:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 0
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r6 = r7.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5Kq r6 = (X.AnonymousClass5Kq) r6     // Catch:{ 5eL -> 0x08d0 }
            long r10 = r6.A0H()     // Catch:{ 5eL -> 0x08d0 }
            X.5Ld r6 = X.C284115La.A01     // Catch:{ 5eL -> 0x08d0 }
            r7 = r0
            r8 = r4
            r6.A0C(r7, r8, r10)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x0810
        L_0x04b5:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 0
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r6 = r7.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5Kq r6 = (X.AnonymousClass5Kq) r6     // Catch:{ 5eL -> 0x08d0 }
            long r10 = r6.A0H()     // Catch:{ 5eL -> 0x08d0 }
            X.5Ld r6 = X.C284115La.A01     // Catch:{ 5eL -> 0x08d0 }
            r7 = r0
            r8 = r4
            r6.A0C(r7, r8, r10)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x0810
        L_0x04d2:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 0
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r6 = r7.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5Kq r6 = (X.AnonymousClass5Kq) r6     // Catch:{ 5eL -> 0x08d0 }
            int r6 = r6.A0F()     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A09(r0, r4, r6)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x0810
        L_0x04eb:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 1
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r6 = r7.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5Kq r6 = (X.AnonymousClass5Kq) r6     // Catch:{ 5eL -> 0x08d0 }
            long r10 = r6.A0G()     // Catch:{ 5eL -> 0x08d0 }
            X.5Ld r6 = X.C284115La.A01     // Catch:{ 5eL -> 0x08d0 }
            r7 = r0
            r8 = r4
            r6.A0C(r7, r8, r10)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x0810
        L_0x0508:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 5
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r6 = r7.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5Kq r6 = (X.AnonymousClass5Kq) r6     // Catch:{ 5eL -> 0x08d0 }
            int r6 = r6.A0E()     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A09(r0, r4, r6)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x0810
        L_0x0521:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 0
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r6 = r7.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5Kq r6 = (X.AnonymousClass5Kq) r6     // Catch:{ 5eL -> 0x08d0 }
            long r9 = r6.A0H()     // Catch:{ 5eL -> 0x08d0 }
            r7 = 0
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            r7 = 0
            if (r6 == 0) goto L_0x053d
            r7 = 1
        L_0x053d:
            X.5Ld r6 = X.C284115La.A01     // Catch:{ 5eL -> 0x08d0 }
            r6.A0E(r0, r4, r7)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x0810
        L_0x0544:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 2
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r6 = r7.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5L9 r6 = r6.A08()     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A0A(r0, r4, r6)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x0810
        L_0x055b:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 0
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r6 = r7.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5Kq r6 = (X.AnonymousClass5Kq) r6     // Catch:{ 5eL -> 0x08d0 }
            int r6 = r6.A0F()     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A09(r0, r4, r6)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x0810
        L_0x0574:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 5
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r6 = r7.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5Kq r6 = (X.AnonymousClass5Kq) r6     // Catch:{ 5eL -> 0x08d0 }
            int r6 = r6.A0E()     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A09(r0, r4, r6)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x0810
        L_0x058d:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 1
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r6 = r7.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5Kq r6 = (X.AnonymousClass5Kq) r6     // Catch:{ 5eL -> 0x08d0 }
            long r10 = r6.A0G()     // Catch:{ 5eL -> 0x08d0 }
            X.5Ld r6 = X.C284115La.A01     // Catch:{ 5eL -> 0x08d0 }
            r7 = r0
            r8 = r4
            r6.A0C(r7, r8, r10)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x0810
        L_0x05aa:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 0
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r6 = r7.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5Kq r6 = (X.AnonymousClass5Kq) r6     // Catch:{ 5eL -> 0x08d0 }
            int r6 = r6.A0F()     // Catch:{ 5eL -> 0x08d0 }
            int r7 = r6 >>> 1
            r6 = r6 & 1
            int r6 = -r6
            r6 = r6 ^ r7
            X.C284115La.A09(r0, r4, r6)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x0810
        L_0x05c9:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r8 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            r5 = r1
            X.5Le r5 = (X.C284155Le) r5     // Catch:{ 5eL -> 0x08d0 }
            r4 = 0
            X.C284155Le.A04(r5, r4)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r4 = r5.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5Kq r4 = (X.AnonymousClass5Kq) r4     // Catch:{ 5eL -> 0x08d0 }
            long r6 = r4.A0H()     // Catch:{ 5eL -> 0x08d0 }
            r4 = 1
            long r10 = r6 >>> r4
            r4 = 1
            long r6 = r6 & r4
            long r4 = -r6
            long r4 = r4 ^ r10
            X.5Ld r10 = X.C284115La.A01     // Catch:{ 5eL -> 0x08d0 }
            r11 = r0
            r12 = r8
            r14 = r4
            r10.A0C(r11, r12, r14)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x0810
        L_0x05ef:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            X.5L3 r6 = r2.A03(r3)     // Catch:{ 5eL -> 0x08d0 }
            X.5LR r3 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r8 = r3.A01(r0, r4)     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            int r5 = r7.A02     // Catch:{ 5eL -> 0x08d0 }
            r4 = r5 & 7
            r3 = 3
            if (r4 == r3) goto L_0x0611
            java.lang.String r3 = "Protocol message tag had invalid wire type."
            X.5eL r4 = new X.5eL     // Catch:{ 5eL -> 0x08d0 }
            r4.<init>(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x083a
        L_0x0611:
            r3 = r20
            java.lang.Object r3 = X.C284155Le.A00(r7, r3, r6)     // Catch:{ 5eL -> 0x08d0 }
            r8.add(r3)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r4 = r7.A03     // Catch:{ 5eL -> 0x08d0 }
            boolean r3 = r4.A0C()     // Catch:{ 5eL -> 0x08d0 }
            if (r3 != 0) goto L_0x000f
            int r3 = r7.A01     // Catch:{ 5eL -> 0x08d0 }
            if (r3 != 0) goto L_0x000f
            int r3 = r4.A06()     // Catch:{ 5eL -> 0x08d0 }
            if (r3 == r5) goto L_0x0611
        L_0x062c:
            r7.A01 = r3     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x0630:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 1
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r6 = r7.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5Kq r6 = (X.AnonymousClass5Kq) r6     // Catch:{ 5eL -> 0x08d0 }
            long r6 = r6.A0G()     // Catch:{ 5eL -> 0x08d0 }
            double r6 = java.lang.Double.longBitsToDouble(r6)     // Catch:{ 5eL -> 0x08d0 }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A0A(r0, r4, r6)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x08c2
        L_0x0651:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 5
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r6 = r7.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5Kq r6 = (X.AnonymousClass5Kq) r6     // Catch:{ 5eL -> 0x08d0 }
            int r6 = r6.A0E()     // Catch:{ 5eL -> 0x08d0 }
            float r6 = java.lang.Float.intBitsToFloat(r6)     // Catch:{ 5eL -> 0x08d0 }
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A0A(r0, r4, r6)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x08c2
        L_0x0672:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 0
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r6 = r7.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5Kq r6 = (X.AnonymousClass5Kq) r6     // Catch:{ 5eL -> 0x08d0 }
            long r6 = r6.A0H()     // Catch:{ 5eL -> 0x08d0 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A0A(r0, r4, r6)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x08c2
        L_0x068f:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 0
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r6 = r7.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5Kq r6 = (X.AnonymousClass5Kq) r6     // Catch:{ 5eL -> 0x08d0 }
            long r6 = r6.A0H()     // Catch:{ 5eL -> 0x08d0 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A0A(r0, r4, r6)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x08c2
        L_0x06ac:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 0
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r6 = r7.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5Kq r6 = (X.AnonymousClass5Kq) r6     // Catch:{ 5eL -> 0x08d0 }
            int r6 = r6.A0F()     // Catch:{ 5eL -> 0x08d0 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A0A(r0, r4, r6)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x08c2
        L_0x06c9:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 1
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r6 = r7.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5Kq r6 = (X.AnonymousClass5Kq) r6     // Catch:{ 5eL -> 0x08d0 }
            long r6 = r6.A0G()     // Catch:{ 5eL -> 0x08d0 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A0A(r0, r4, r6)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x08c2
        L_0x06e6:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 5
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r6 = r7.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5Kq r6 = (X.AnonymousClass5Kq) r6     // Catch:{ 5eL -> 0x08d0 }
            int r6 = r6.A0E()     // Catch:{ 5eL -> 0x08d0 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A0A(r0, r4, r6)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x08c2
        L_0x0703:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 0
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r6 = r7.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5Kq r6 = (X.AnonymousClass5Kq) r6     // Catch:{ 5eL -> 0x08d0 }
            long r11 = r6.A0H()     // Catch:{ 5eL -> 0x08d0 }
            r8 = 0
            int r7 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            r6 = 0
            if (r7 == 0) goto L_0x071f
            r6 = 1
        L_0x071f:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A0A(r0, r4, r6)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x08c2
        L_0x0728:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 2
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r6 = r7.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5L9 r6 = r6.A08()     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A0A(r0, r4, r6)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x08c2
        L_0x073f:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 0
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r6 = r7.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5Kq r6 = (X.AnonymousClass5Kq) r6     // Catch:{ 5eL -> 0x08d0 }
            int r6 = r6.A0F()     // Catch:{ 5eL -> 0x08d0 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A0A(r0, r4, r6)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x08c2
        L_0x075c:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 5
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r6 = r7.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5Kq r6 = (X.AnonymousClass5Kq) r6     // Catch:{ 5eL -> 0x08d0 }
            int r6 = r6.A0E()     // Catch:{ 5eL -> 0x08d0 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A0A(r0, r4, r6)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x08c2
        L_0x0779:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 1
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r6 = r7.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5Kq r6 = (X.AnonymousClass5Kq) r6     // Catch:{ 5eL -> 0x08d0 }
            long r6 = r6.A0G()     // Catch:{ 5eL -> 0x08d0 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A0A(r0, r4, r6)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x08c2
        L_0x0796:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 0
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r6 = r7.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5Kq r6 = (X.AnonymousClass5Kq) r6     // Catch:{ 5eL -> 0x08d0 }
            int r6 = r6.A0F()     // Catch:{ 5eL -> 0x08d0 }
            int r7 = r6 >>> 1
            r6 = r6 & 1
            int r6 = -r6
            r6 = r6 ^ r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A0A(r0, r4, r6)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x08c2
        L_0x07b9:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r8 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            r5 = r1
            X.5Le r5 = (X.C284155Le) r5     // Catch:{ 5eL -> 0x08d0 }
            r4 = 0
            X.C284155Le.A04(r5, r4)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r4 = r5.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5Kq r4 = (X.AnonymousClass5Kq) r4     // Catch:{ 5eL -> 0x08d0 }
            long r6 = r4.A0H()     // Catch:{ 5eL -> 0x08d0 }
            r4 = 1
            long r11 = r6 >>> r4
            r4 = 1
            long r6 = r6 & r4
            long r4 = -r6
            long r4 = r4 ^ r11
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A0A(r0, r8, r4)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x08c2
        L_0x07de:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            X.5L3 r8 = r2.A03(r3)     // Catch:{ 5eL -> 0x08d0 }
            r7 = r1
            X.5Le r7 = (X.C284155Le) r7     // Catch:{ 5eL -> 0x08d0 }
            r6 = 3
            X.C284155Le.A04(r7, r6)     // Catch:{ 5eL -> 0x08d0 }
            r6 = r20
            java.lang.Object r6 = X.C284155Le.A00(r7, r6, r8)     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A0A(r0, r4, r6)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x08c2
        L_0x07f9:
            r5 = r1
            X.5Le r5 = (X.C284155Le) r5     // Catch:{ 5eL -> 0x08d0 }
            r4 = 0
            X.C284155Le.A04(r5, r4)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r4 = r5.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5Kq r4 = (X.AnonymousClass5Kq) r4     // Catch:{ 5eL -> 0x08d0 }
            int r6 = r4.A0F()     // Catch:{ 5eL -> 0x08d0 }
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A09(r0, r4, r6)     // Catch:{ 5eL -> 0x08d0 }
        L_0x0810:
            r2.A07(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x0815:
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            r3 = r3 & r7
            r6 = 0
            if (r3 == 0) goto L_0x081c
            r6 = 1
        L_0x081c:
            X.5LR r5 = r2.A04     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r3
            long r3 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.util.List r7 = r5.A01(r0, r3)     // Catch:{ 5eL -> 0x08d0 }
            if (r6 == 0) goto L_0x083b
            r6 = r1
            X.5Le r6 = (X.C284155Le) r6     // Catch:{ 5eL -> 0x08d0 }
            int r3 = r6.A02     // Catch:{ 5eL -> 0x08d0 }
            r3 = r3 & 7
            r5 = 2
            if (r3 == r5) goto L_0x0889
            java.lang.String r3 = "Protocol message tag had invalid wire type."
            X.5eL r4 = new X.5eL     // Catch:{ 5eL -> 0x08d0 }
            r4.<init>(r3)     // Catch:{ 5eL -> 0x08d0 }
        L_0x083a:
            throw r4     // Catch:{ 5eL -> 0x08d0 }
        L_0x083b:
            r6 = r1
            X.5Le r6 = (X.C284155Le) r6     // Catch:{ 5eL -> 0x08d0 }
            int r3 = r6.A02     // Catch:{ 5eL -> 0x08d0 }
            r3 = r3 & 7
            r5 = 2
            if (r3 != r5) goto L_0x0866
            boolean r3 = r7 instanceof X.C13977TnT     // Catch:{ 5eL -> 0x08d0 }
            if (r3 == 0) goto L_0x086e
            X.TnT r7 = (X.C13977TnT) r7     // Catch:{ 5eL -> 0x08d0 }
        L_0x084b:
            X.C284155Le.A04(r6, r5)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r4 = r6.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5L9 r3 = r4.A08()     // Catch:{ 5eL -> 0x08d0 }
            r7.A7X(r3)     // Catch:{ 5eL -> 0x08d0 }
            boolean r3 = r4.A0C()     // Catch:{ 5eL -> 0x08d0 }
            if (r3 != 0) goto L_0x000f
            int r4 = r4.A06()     // Catch:{ 5eL -> 0x08d0 }
            int r3 = r6.A02     // Catch:{ 5eL -> 0x08d0 }
            if (r4 == r3) goto L_0x084b
            goto L_0x08a3
        L_0x0866:
            java.lang.String r3 = "Protocol message tag had invalid wire type."
            X.5eL r4 = new X.5eL     // Catch:{ 5eL -> 0x08d0 }
            r4.<init>(r3)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x083a
        L_0x086e:
            X.C284155Le.A04(r6, r5)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r4 = r6.A03     // Catch:{ 5eL -> 0x08d0 }
            java.lang.String r3 = r4.A09()     // Catch:{ 5eL -> 0x08d0 }
            r7.add(r3)     // Catch:{ 5eL -> 0x08d0 }
            boolean r3 = r4.A0C()     // Catch:{ 5eL -> 0x08d0 }
            if (r3 != 0) goto L_0x000f
            int r4 = r4.A06()     // Catch:{ 5eL -> 0x08d0 }
            int r3 = r6.A02     // Catch:{ 5eL -> 0x08d0 }
            if (r4 == r3) goto L_0x086e
            goto L_0x08a3
        L_0x0889:
            X.C284155Le.A04(r6, r5)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r4 = r6.A03     // Catch:{ 5eL -> 0x08d0 }
            java.lang.String r3 = r4.A0A()     // Catch:{ 5eL -> 0x08d0 }
            r7.add(r3)     // Catch:{ 5eL -> 0x08d0 }
            boolean r3 = r4.A0C()     // Catch:{ 5eL -> 0x08d0 }
            if (r3 != 0) goto L_0x000f
            int r4 = r4.A06()     // Catch:{ 5eL -> 0x08d0 }
            int r3 = r6.A02     // Catch:{ 5eL -> 0x08d0 }
            if (r4 == r3) goto L_0x0889
        L_0x08a3:
            r6.A01 = r4     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x08a7:
            r5 = r1
            X.5Le r5 = (X.C284155Le) r5     // Catch:{ 5eL -> 0x08d0 }
            r4 = 0
            X.C284155Le.A04(r5, r4)     // Catch:{ 5eL -> 0x08d0 }
            X.5Kr r4 = r5.A03     // Catch:{ 5eL -> 0x08d0 }
            X.5Kq r4 = (X.AnonymousClass5Kq) r4     // Catch:{ 5eL -> 0x08d0 }
            int r6 = r4.A0F()     // Catch:{ 5eL -> 0x08d0 }
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r4
            long r4 = (long) r7     // Catch:{ 5eL -> 0x08d0 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A0A(r0, r4, r6)     // Catch:{ 5eL -> 0x08d0 }
        L_0x08c2:
            int r3 = r3 + 2
            r4 = r17[r3]     // Catch:{ 5eL -> 0x08d0 }
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r3 = (long) r4     // Catch:{ 5eL -> 0x08d0 }
            X.C284115La.A09(r0, r3, r10)     // Catch:{ 5eL -> 0x08d0 }
            goto L_0x000f
        L_0x08d0:
            if (r16 != 0) goto L_0x08e4
            r5 = r0
            X.5Kk r5 = (X.C283985Kk) r5     // Catch:{ all -> 0x098c }
            X.5Ko r4 = r5.unknownFields     // Catch:{ all -> 0x098c }
            X.5Ko r3 = X.C284015Ko.A05     // Catch:{ all -> 0x098c }
            if (r4 != r3) goto L_0x08e2
            X.5Ko r4 = new X.5Ko     // Catch:{ all -> 0x098c }
            r4.<init>()     // Catch:{ all -> 0x098c }
            r5.unknownFields = r4     // Catch:{ all -> 0x098c }
        L_0x08e2:
            r16 = r4
        L_0x08e4:
            r4 = r19
            r3 = r16
            boolean r1 = r4.A00(r1, r3)     // Catch:{ all -> 0x098c }
            if (r1 != 0) goto L_0x000f
            goto L_0x094b
        L_0x08ef:
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r10 != r3) goto L_0x0911
            int r5 = r2.A00
        L_0x08f6:
            int r1 = r2.A03
            if (r5 >= r1) goto L_0x0983
            int[] r1 = r2.A09
            r1 = r1[r5]
            int[] r3 = r2.A08
            int r1 = r1 + 1
            r3 = r3[r1]
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r1
            long r3 = (long) r3
            X.5Ld r1 = X.C284115La.A01
            r1.A06(r0, r3)
            int r5 = r5 + 1
            goto L_0x08f6
        L_0x0911:
            if (r16 != 0) goto L_0x0925
            r5 = r0
            X.5Kk r5 = (X.C283985Kk) r5     // Catch:{ all -> 0x098c }
            X.5Ko r4 = r5.unknownFields     // Catch:{ all -> 0x098c }
            X.5Ko r3 = X.C284015Ko.A05     // Catch:{ all -> 0x098c }
            if (r4 != r3) goto L_0x0923
            X.5Ko r4 = new X.5Ko     // Catch:{ all -> 0x098c }
            r4.<init>()     // Catch:{ all -> 0x098c }
            r5.unknownFields = r4     // Catch:{ all -> 0x098c }
        L_0x0923:
            r16 = r4
        L_0x0925:
            r4 = r19
            r3 = r16
            boolean r1 = r4.A00(r1, r3)     // Catch:{ all -> 0x098c }
            if (r1 != 0) goto L_0x000f
            goto L_0x0966
        L_0x0930:
            int r5 = r2.A00
        L_0x0932:
            int r1 = r2.A03
            if (r5 >= r1) goto L_0x0985
            int[] r1 = r2.A09
            r1 = r1[r5]
            int r1 = r1 + 1
            r3 = r17[r1]
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r1
            long r3 = (long) r3
            X.5Ld r1 = X.C284115La.A01
            r1.A06(r0, r3)
            int r5 = r5 + 1
            goto L_0x0932
        L_0x094b:
            int r5 = r2.A00
        L_0x094d:
            int r1 = r2.A03
            if (r5 >= r1) goto L_0x0983
            int[] r1 = r2.A09
            r1 = r1[r5]
            int r1 = r1 + 1
            r3 = r17[r1]
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r1
            long r3 = (long) r3
            X.5Ld r1 = X.C284115La.A01
            r1.A06(r0, r3)
            int r5 = r5 + 1
            goto L_0x094d
        L_0x0966:
            int r5 = r2.A00
        L_0x0968:
            int r1 = r2.A03
            if (r5 >= r1) goto L_0x0983
            int[] r1 = r2.A09
            r1 = r1[r5]
            int[] r3 = r2.A08
            int r1 = r1 + 1
            r3 = r3[r1]
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r1
            long r3 = (long) r3
            X.5Ld r1 = X.C284115La.A01
            r1.A06(r0, r3)
            int r5 = r5 + 1
            goto L_0x0968
        L_0x0983:
            if (r16 == 0) goto L_0x098b
        L_0x0985:
            X.5Kk r0 = (X.C283985Kk) r0
            r1 = r16
            r0.unknownFields = r1
        L_0x098b:
            return
        L_0x098c:
            r6 = move-exception
            int r5 = r2.A00
        L_0x098f:
            int r1 = r2.A03
            if (r5 >= r1) goto L_0x09aa
            int[] r1 = r2.A09
            r1 = r1[r5]
            int[] r3 = r2.A08
            int r1 = r1 + 1
            r3 = r3[r1]
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r1
            long r3 = (long) r3
            X.5Ld r1 = X.C284115La.A01
            r1.A06(r0, r3)
            int r5 = r5 + 1
            goto L_0x098f
        L_0x09aa:
            if (r16 == 0) goto L_0x09b2
            X.5Kk r0 = (X.C283985Kk) r0
            r1 = r16
            r0.unknownFields = r1
        L_0x09b2:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5LZ.Co6(X.5Ku, X.5Lf, java.lang.Object):void");
    }

    public final Object Cr9() {
        return ((C283985Kk) this.A06).A03(AnonymousClass05K.A0N);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x033a, code lost:
        if (r0 == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x033c, code lost:
        r14.FNt(A03(r3), X.C284115La.A01.A06(r15, (long) (r1 & 1048575)), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0650, code lost:
        r3 = r3 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x07a4, code lost:
        X.AnonymousClass5L4.A0D(r14, (java.util.List) r4.getObject(r15, r0), r5[r3], r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x07b2, code lost:
        X.AnonymousClass5L4.A0H(r14, (java.util.List) r4.getObject(r15, r0), r5[r3], r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x07c0, code lost:
        X.AnonymousClass5L4.A0J(r14, (java.util.List) r4.getObject(r15, r0), r5[r3], r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x07ce, code lost:
        X.AnonymousClass5L4.A0P(r14, (java.util.List) r4.getObject(r15, r0), r5[r3], r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x07dc, code lost:
        X.AnonymousClass5L4.A0I(r14, (java.util.List) r4.getObject(r15, r0), r5[r3], r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x07ea, code lost:
        X.AnonymousClass5L4.A0G(r14, (java.util.List) r4.getObject(r15, r0), r5[r3], r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x08fd, code lost:
        if (r8 == false) goto L_0x0650;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x08ff, code lost:
        r8 = r4.getObject(r15, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0905, code lost:
        if ((r8 instanceof java.lang.String) == false) goto L_0x091a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0907, code lost:
        r1 = ((X.C7194Pyh) r14).A00;
        r1.A07((r2 << 3) | 2);
        r1.A0E((java.lang.String) r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x091a, code lost:
        r14.FNo((X.AnonymousClass5L9) r8, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0925, code lost:
        if (r8 == false) goto L_0x0650;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0927, code lost:
        r14.FNy(A03(r3), r4.getObject(r15, r0), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0938, code lost:
        if (r8 == false) goto L_0x0650;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x093a, code lost:
        r14.FNo((X.AnonymousClass5L9) r4.getObject(r15, r0), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x095a, code lost:
        ((X.C7194Pyh) r14).A00.A09(r2, A00(r15, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x096e, code lost:
        ((X.C7194Pyh) r14).A00.A08(r2, A00(r15, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0982, code lost:
        ((X.C7194Pyh) r14).A00.A0A(r2, A01(r15, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x09b2, code lost:
        if (r8 == false) goto L_0x0650;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x09b4, code lost:
        r14.FNt(A03(r3), r4.getObject(r15, r0), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0182, code lost:
        ((X.C7194Pyh) r14).A00.A0A(r4, java.lang.Double.doubleToRawLongBits(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01a7, code lost:
        ((X.C7194Pyh) r14).A00.A08(r4, java.lang.Float.floatToRawIntBits(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01c4, code lost:
        ((X.C7194Pyh) r14).A00.A0B(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01dd, code lost:
        ((X.C7194Pyh) r14).A00.A0B(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        r3 = r3 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01f6, code lost:
        ((X.C7194Pyh) r14).A00.A09(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x020f, code lost:
        ((X.C7194Pyh) r14).A00.A0A(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0252, code lost:
        if (r0 == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0254, code lost:
        r2 = X.C284115La.A01.A06(r15, (long) (r1 & 1048575));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0261, code lost:
        if ((r2 instanceof java.lang.String) == false) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0263, code lost:
        r1 = ((X.C7194Pyh) r14).A00;
        r1.A07((r4 << 3) | 2);
        r1.A0E((java.lang.String) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0276, code lost:
        r14.FNo((X.AnonymousClass5L9) r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0281, code lost:
        if (r0 == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0283, code lost:
        r14.FNy(A03(r3), X.C284115La.A01.A06(r15, (long) (r1 & 1048575)), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x029b, code lost:
        if (r0 == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x029d, code lost:
        r14.FNo((X.AnonymousClass5L9) X.C284115La.A01.A06(r15, (long) (r1 & 1048575)), r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FOE(X.C13831Ti3 r14, java.lang.Object r15) {
        /*
            r13 = this;
            boolean r0 = r13.A07
            if (r0 == 0) goto L_0x061a
            int[] r5 = r13.A08
            int r7 = r5.length
            r6 = 0
            r3 = 0
        L_0x0009:
            if (r3 >= r7) goto L_0x0a5c
            int r0 = r3 + 1
            r1 = r5[r0]
            r4 = r5[r3]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r1
            int r0 = r0 >>> 20
            r2 = 1
            switch(r0) {
                case 0: goto L_0x001d;
                case 1: goto L_0x0030;
                case 2: goto L_0x0043;
                case 3: goto L_0x0056;
                case 4: goto L_0x0069;
                case 5: goto L_0x007c;
                case 6: goto L_0x008f;
                case 7: goto L_0x00aa;
                case 8: goto L_0x00c0;
                case 9: goto L_0x00c6;
                case 10: goto L_0x00cc;
                case 11: goto L_0x00d2;
                case 12: goto L_0x00e8;
                case 13: goto L_0x0103;
                case 14: goto L_0x011e;
                case 15: goto L_0x0139;
                case 16: goto L_0x014f;
                case 17: goto L_0x0165;
                case 18: goto L_0x0350;
                case 19: goto L_0x0364;
                case 20: goto L_0x0378;
                case 21: goto L_0x038c;
                case 22: goto L_0x03a0;
                case 23: goto L_0x03b4;
                case 24: goto L_0x03c8;
                case 25: goto L_0x03dc;
                case 26: goto L_0x03f0;
                case 27: goto L_0x0404;
                case 28: goto L_0x0435;
                case 29: goto L_0x0449;
                case 30: goto L_0x045d;
                case 31: goto L_0x0471;
                case 32: goto L_0x0485;
                case 33: goto L_0x0499;
                case 34: goto L_0x04ad;
                case 35: goto L_0x04c1;
                case 36: goto L_0x04d5;
                case 37: goto L_0x04e9;
                case 38: goto L_0x04fd;
                case 39: goto L_0x0511;
                case 40: goto L_0x0525;
                case 41: goto L_0x0539;
                case 42: goto L_0x054d;
                case 43: goto L_0x0561;
                case 44: goto L_0x0575;
                case 45: goto L_0x0589;
                case 46: goto L_0x059d;
                case 47: goto L_0x05b1;
                case 48: goto L_0x05c5;
                case 49: goto L_0x05d9;
                case 50: goto L_0x060a;
                case 51: goto L_0x016b;
                case 52: goto L_0x0190;
                case 53: goto L_0x01b5;
                case 54: goto L_0x01ce;
                case 55: goto L_0x01e7;
                case 56: goto L_0x0200;
                case 57: goto L_0x0219;
                case 58: goto L_0x0232;
                case 59: goto L_0x024e;
                case 60: goto L_0x027d;
                case 61: goto L_0x0297;
                case 62: goto L_0x02af;
                case 63: goto L_0x02c3;
                case 64: goto L_0x02dc;
                case 65: goto L_0x02f5;
                case 66: goto L_0x030e;
                case 67: goto L_0x0322;
                case 68: goto L_0x0336;
                default: goto L_0x001a;
            }
        L_0x001a:
            int r3 = r3 + 3
            goto L_0x0009
        L_0x001d:
            boolean r0 = r13.A08(r3, r15)
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            double r8 = r2.A01(r15, r0)
            goto L_0x0182
        L_0x0030:
            boolean r0 = r13.A08(r3, r15)
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            float r2 = r2.A02(r15, r0)
            goto L_0x01a7
        L_0x0043:
            boolean r0 = r13.A08(r3, r15)
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            long r0 = r2.A05(r15, r0)
            goto L_0x01c4
        L_0x0056:
            boolean r0 = r13.A08(r3, r15)
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            long r0 = r2.A05(r15, r0)
            goto L_0x01dd
        L_0x0069:
            boolean r0 = r13.A08(r3, r15)
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            int r1 = r2.A04(r15, r0)
            goto L_0x01f6
        L_0x007c:
            boolean r0 = r13.A08(r3, r15)
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            long r0 = r2.A05(r15, r0)
            goto L_0x020f
        L_0x008f:
            boolean r0 = r13.A08(r3, r15)
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            int r1 = r2.A04(r15, r0)
            r0 = r14
            X.Pyh r0 = (X.C7194Pyh) r0
            X.Pyc r0 = r0.A00
            r0.A08(r4, r1)
            goto L_0x001a
        L_0x00aa:
            boolean r0 = r13.A08(r3, r15)
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            boolean r0 = r2.A0G(r15, r0)
            r14.FNm(r4, r0)
            goto L_0x001a
        L_0x00c0:
            boolean r0 = r13.A08(r3, r15)
            goto L_0x0252
        L_0x00c6:
            boolean r0 = r13.A08(r3, r15)
            goto L_0x0281
        L_0x00cc:
            boolean r0 = r13.A08(r3, r15)
            goto L_0x029b
        L_0x00d2:
            boolean r0 = r13.A08(r3, r15)
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            int r0 = r2.A04(r15, r0)
            r14.FOG(r4, r0)
            goto L_0x001a
        L_0x00e8:
            boolean r0 = r13.A08(r3, r15)
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            int r1 = r2.A04(r15, r0)
            r0 = r14
            X.Pyh r0 = (X.C7194Pyh) r0
            X.Pyc r0 = r0.A00
            r0.A09(r4, r1)
            goto L_0x001a
        L_0x0103:
            boolean r0 = r13.A08(r3, r15)
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            int r1 = r2.A04(r15, r0)
            r0 = r14
            X.Pyh r0 = (X.C7194Pyh) r0
            X.Pyc r0 = r0.A00
            r0.A08(r4, r1)
            goto L_0x001a
        L_0x011e:
            boolean r0 = r13.A08(r3, r15)
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            long r0 = r2.A05(r15, r0)
            r2 = r14
            X.Pyh r2 = (X.C7194Pyh) r2
            X.Pyc r2 = r2.A00
            r2.A0A(r4, r0)
            goto L_0x001a
        L_0x0139:
            boolean r0 = r13.A08(r3, r15)
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            int r0 = r2.A04(r15, r0)
            r14.FO4(r4, r0)
            goto L_0x001a
        L_0x014f:
            boolean r0 = r13.A08(r3, r15)
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            long r0 = r2.A05(r15, r0)
            r14.FO5(r4, r0)
            goto L_0x001a
        L_0x0165:
            boolean r0 = r13.A08(r3, r15)
            goto L_0x033a
        L_0x016b:
            boolean r0 = r13.A09(r15, r4, r3)
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            java.lang.Object r0 = r2.A06(r15, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            double r8 = r0.doubleValue()
        L_0x0182:
            r0 = r14
            X.Pyh r0 = (X.C7194Pyh) r0
            X.Pyc r2 = r0.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r8)
            r2.A0A(r4, r0)
            goto L_0x001a
        L_0x0190:
            boolean r0 = r13.A09(r15, r4, r3)
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            java.lang.Object r0 = r2.A06(r15, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r2 = r0.floatValue()
        L_0x01a7:
            r0 = r14
            X.Pyh r0 = (X.C7194Pyh) r0
            X.Pyc r1 = r0.A00
            int r0 = java.lang.Float.floatToRawIntBits(r2)
            r1.A08(r4, r0)
            goto L_0x001a
        L_0x01b5:
            boolean r0 = r13.A09(r15, r4, r3)
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            long r0 = A01(r15, r0)
        L_0x01c4:
            r2 = r14
            X.Pyh r2 = (X.C7194Pyh) r2
            X.Pyc r2 = r2.A00
            r2.A0B(r4, r0)
            goto L_0x001a
        L_0x01ce:
            boolean r0 = r13.A09(r15, r4, r3)
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            long r0 = A01(r15, r0)
        L_0x01dd:
            r2 = r14
            X.Pyh r2 = (X.C7194Pyh) r2
            X.Pyc r2 = r2.A00
            r2.A0B(r4, r0)
            goto L_0x001a
        L_0x01e7:
            boolean r0 = r13.A09(r15, r4, r3)
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            int r1 = A00(r15, r0)
        L_0x01f6:
            r0 = r14
            X.Pyh r0 = (X.C7194Pyh) r0
            X.Pyc r0 = r0.A00
            r0.A09(r4, r1)
            goto L_0x001a
        L_0x0200:
            boolean r0 = r13.A09(r15, r4, r3)
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            long r0 = A01(r15, r0)
        L_0x020f:
            r2 = r14
            X.Pyh r2 = (X.C7194Pyh) r2
            X.Pyc r2 = r2.A00
            r2.A0A(r4, r0)
            goto L_0x001a
        L_0x0219:
            boolean r0 = r13.A09(r15, r4, r3)
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            int r1 = A00(r15, r0)
            r0 = r14
            X.Pyh r0 = (X.C7194Pyh) r0
            X.Pyc r0 = r0.A00
            r0.A08(r4, r1)
            goto L_0x001a
        L_0x0232:
            boolean r0 = r13.A09(r15, r4, r3)
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            java.lang.Object r0 = r2.A06(r15, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r14.FNm(r4, r0)
            goto L_0x001a
        L_0x024e:
            boolean r0 = r13.A09(r15, r4, r3)
        L_0x0252:
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            java.lang.Object r2 = r2.A06(r15, r0)
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L_0x0276
            java.lang.String r2 = (java.lang.String) r2
            r0 = r14
            X.Pyh r0 = (X.C7194Pyh) r0
            X.Pyc r1 = r0.A00
            int r0 = r4 << 3
            r0 = r0 | 2
            r1.A07(r0)
            r1.A0E(r2)
            goto L_0x001a
        L_0x0276:
            X.5L9 r2 = (X.AnonymousClass5L9) r2
            r14.FNo(r2, r4)
            goto L_0x001a
        L_0x027d:
            boolean r0 = r13.A09(r15, r4, r3)
        L_0x0281:
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            java.lang.Object r1 = r2.A06(r15, r0)
            X.5L3 r0 = r13.A03(r3)
            r14.FNy(r0, r1, r4)
            goto L_0x001a
        L_0x0297:
            boolean r0 = r13.A09(r15, r4, r3)
        L_0x029b:
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            java.lang.Object r0 = r2.A06(r15, r0)
            X.5L9 r0 = (X.AnonymousClass5L9) r0
            r14.FNo(r0, r4)
            goto L_0x001a
        L_0x02af:
            boolean r0 = r13.A09(r15, r4, r3)
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            int r0 = A00(r15, r0)
            r14.FOG(r4, r0)
            goto L_0x001a
        L_0x02c3:
            boolean r0 = r13.A09(r15, r4, r3)
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            int r1 = A00(r15, r0)
            r0 = r14
            X.Pyh r0 = (X.C7194Pyh) r0
            X.Pyc r0 = r0.A00
            r0.A09(r4, r1)
            goto L_0x001a
        L_0x02dc:
            boolean r0 = r13.A09(r15, r4, r3)
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            int r1 = A00(r15, r0)
            r0 = r14
            X.Pyh r0 = (X.C7194Pyh) r0
            X.Pyc r0 = r0.A00
            r0.A08(r4, r1)
            goto L_0x001a
        L_0x02f5:
            boolean r0 = r13.A09(r15, r4, r3)
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            long r0 = A01(r15, r0)
            r2 = r14
            X.Pyh r2 = (X.C7194Pyh) r2
            X.Pyc r2 = r2.A00
            r2.A0A(r4, r0)
            goto L_0x001a
        L_0x030e:
            boolean r0 = r13.A09(r15, r4, r3)
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            int r0 = A00(r15, r0)
            r14.FO4(r4, r0)
            goto L_0x001a
        L_0x0322:
            boolean r0 = r13.A09(r15, r4, r3)
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            long r0 = A01(r15, r0)
            r14.FO5(r4, r0)
            goto L_0x001a
        L_0x0336:
            boolean r0 = r13.A09(r15, r4, r3)
        L_0x033a:
            if (r0 == 0) goto L_0x001a
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            java.lang.Object r1 = r2.A06(r15, r0)
            X.5L3 r0 = r13.A03(r3)
            r14.FNt(r0, r1, r4)
            goto L_0x001a
        L_0x0350:
            r4 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            java.lang.Object r0 = r2.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0D(r14, r0, r4, r6)
            goto L_0x001a
        L_0x0364:
            r4 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            java.lang.Object r0 = r2.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0H(r14, r0, r4, r6)
            goto L_0x001a
        L_0x0378:
            r4 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            java.lang.Object r0 = r2.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0J(r14, r0, r4, r6)
            goto L_0x001a
        L_0x038c:
            r4 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            java.lang.Object r0 = r2.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0P(r14, r0, r4, r6)
            goto L_0x001a
        L_0x03a0:
            r4 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            java.lang.Object r0 = r2.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0I(r14, r0, r4, r6)
            goto L_0x001a
        L_0x03b4:
            r4 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            java.lang.Object r0 = r2.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0G(r14, r0, r4, r6)
            goto L_0x001a
        L_0x03c8:
            r4 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            java.lang.Object r0 = r2.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0F(r14, r0, r4, r6)
            goto L_0x001a
        L_0x03dc:
            r4 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            java.lang.Object r0 = r2.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0C(r14, r0, r4, r6)
            goto L_0x001a
        L_0x03f0:
            r4 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            java.lang.Object r0 = r2.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0B(r14, r0, r4)
            goto L_0x001a
        L_0x0404:
            r4 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            java.lang.Object r9 = r2.A06(r15, r0)
            java.util.List r9 = (java.util.List) r9
            X.5L3 r8 = r13.A03(r3)
            X.5L5 r0 = X.AnonymousClass5L4.A02
            if (r9 == 0) goto L_0x001a
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x001a
            r2 = r14
            X.Pyh r2 = (X.C7194Pyh) r2
            r1 = 0
        L_0x0425:
            int r0 = r9.size()
            if (r1 >= r0) goto L_0x001a
            java.lang.Object r0 = r9.get(r1)
            r2.FNy(r8, r0, r4)
            int r1 = r1 + 1
            goto L_0x0425
        L_0x0435:
            r4 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            java.lang.Object r0 = r2.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0A(r14, r0, r4)
            goto L_0x001a
        L_0x0449:
            r4 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            java.lang.Object r0 = r2.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0O(r14, r0, r4, r6)
            goto L_0x001a
        L_0x045d:
            r4 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            java.lang.Object r0 = r2.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0E(r14, r0, r4, r6)
            goto L_0x001a
        L_0x0471:
            r4 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            java.lang.Object r0 = r2.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0K(r14, r0, r4, r6)
            goto L_0x001a
        L_0x0485:
            r4 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            java.lang.Object r0 = r2.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0L(r14, r0, r4, r6)
            goto L_0x001a
        L_0x0499:
            r4 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            java.lang.Object r0 = r2.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0M(r14, r0, r4, r6)
            goto L_0x001a
        L_0x04ad:
            r4 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            java.lang.Object r0 = r2.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0N(r14, r0, r4, r6)
            goto L_0x001a
        L_0x04c1:
            r8 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r4 = X.C284115La.A01
            java.lang.Object r0 = r4.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0D(r14, r0, r8, r2)
            goto L_0x001a
        L_0x04d5:
            r8 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r4 = X.C284115La.A01
            java.lang.Object r0 = r4.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0H(r14, r0, r8, r2)
            goto L_0x001a
        L_0x04e9:
            r8 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r4 = X.C284115La.A01
            java.lang.Object r0 = r4.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0J(r14, r0, r8, r2)
            goto L_0x001a
        L_0x04fd:
            r8 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r4 = X.C284115La.A01
            java.lang.Object r0 = r4.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0P(r14, r0, r8, r2)
            goto L_0x001a
        L_0x0511:
            r8 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r4 = X.C284115La.A01
            java.lang.Object r0 = r4.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0I(r14, r0, r8, r2)
            goto L_0x001a
        L_0x0525:
            r8 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r4 = X.C284115La.A01
            java.lang.Object r0 = r4.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0G(r14, r0, r8, r2)
            goto L_0x001a
        L_0x0539:
            r8 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r4 = X.C284115La.A01
            java.lang.Object r0 = r4.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0F(r14, r0, r8, r2)
            goto L_0x001a
        L_0x054d:
            r8 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r4 = X.C284115La.A01
            java.lang.Object r0 = r4.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0C(r14, r0, r8, r2)
            goto L_0x001a
        L_0x0561:
            r8 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r4 = X.C284115La.A01
            java.lang.Object r0 = r4.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0O(r14, r0, r8, r2)
            goto L_0x001a
        L_0x0575:
            r8 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r4 = X.C284115La.A01
            java.lang.Object r0 = r4.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0E(r14, r0, r8, r2)
            goto L_0x001a
        L_0x0589:
            r8 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r4 = X.C284115La.A01
            java.lang.Object r0 = r4.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0K(r14, r0, r8, r2)
            goto L_0x001a
        L_0x059d:
            r8 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r4 = X.C284115La.A01
            java.lang.Object r0 = r4.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0L(r14, r0, r8, r2)
            goto L_0x001a
        L_0x05b1:
            r8 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r4 = X.C284115La.A01
            java.lang.Object r0 = r4.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0M(r14, r0, r8, r2)
            goto L_0x001a
        L_0x05c5:
            r8 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r4 = X.C284115La.A01
            java.lang.Object r0 = r4.A06(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0N(r14, r0, r8, r2)
            goto L_0x001a
        L_0x05d9:
            r4 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            java.lang.Object r9 = r2.A06(r15, r0)
            java.util.List r9 = (java.util.List) r9
            X.5L3 r8 = r13.A03(r3)
            X.5L5 r0 = X.AnonymousClass5L4.A02
            if (r9 == 0) goto L_0x001a
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x001a
            r2 = r14
            X.Pyh r2 = (X.C7194Pyh) r2
            r1 = 0
        L_0x05fa:
            int r0 = r9.size()
            if (r1 >= r0) goto L_0x001a
            java.lang.Object r0 = r9.get(r1)
            r2.FNt(r8, r0, r4)
            int r1 = r1 + 1
            goto L_0x05fa
        L_0x060a:
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            X.5Ld r2 = X.C284115La.A01
            java.lang.Object r0 = r2.A06(r15, r0)
            r13.A06(r14, r0, r4, r3)
            goto L_0x001a
        L_0x061a:
            r6 = -1
            int[] r5 = r13.A08
            int r7 = r5.length
            sun.misc.Unsafe r4 = A0F
            r3 = 0
            r12 = 0
        L_0x0622:
            if (r3 >= r7) goto L_0x0a5c
            int r0 = r3 + 1
            r10 = r5[r0]
            r2 = r5[r3]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r10
            int r9 = r0 >>> 20
            r0 = 17
            if (r9 > r0) goto L_0x0a59
            int r0 = r3 + 2
            r11 = r5[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r11 & r0
            if (r8 == r6) goto L_0x0644
            long r0 = (long) r8
            int r12 = r4.getInt(r15, r0)
            r6 = r8
        L_0x0644:
            int r0 = r11 >>> 20
            r8 = 1
            int r8 = r8 << r0
        L_0x0648:
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r0
            long r0 = (long) r10
            switch(r9) {
                case 0: goto L_0x0653;
                case 1: goto L_0x0669;
                case 2: goto L_0x067f;
                case 3: goto L_0x068f;
                case 4: goto L_0x069f;
                case 5: goto L_0x06af;
                case 6: goto L_0x06bf;
                case 7: goto L_0x06cf;
                case 8: goto L_0x06dd;
                case 9: goto L_0x06e0;
                case 10: goto L_0x06e3;
                case 11: goto L_0x06e6;
                case 12: goto L_0x06f2;
                case 13: goto L_0x0703;
                case 14: goto L_0x0714;
                case 15: goto L_0x0725;
                case 16: goto L_0x0731;
                case 17: goto L_0x073d;
                case 18: goto L_0x0740;
                case 19: goto L_0x0742;
                case 20: goto L_0x0744;
                case 21: goto L_0x0746;
                case 22: goto L_0x0749;
                case 23: goto L_0x074c;
                case 24: goto L_0x074f;
                case 25: goto L_0x09c1;
                case 26: goto L_0x09cf;
                case 27: goto L_0x09dc;
                case 28: goto L_0x0a06;
                case 29: goto L_0x075d;
                case 30: goto L_0x076b;
                case 31: goto L_0x0779;
                case 32: goto L_0x0787;
                case 33: goto L_0x0795;
                case 34: goto L_0x0a13;
                case 35: goto L_0x07a3;
                case 36: goto L_0x07b1;
                case 37: goto L_0x07bf;
                case 38: goto L_0x07cd;
                case 39: goto L_0x07db;
                case 40: goto L_0x07e9;
                case 41: goto L_0x07f7;
                case 42: goto L_0x0805;
                case 43: goto L_0x0813;
                case 44: goto L_0x0821;
                case 45: goto L_0x082f;
                case 46: goto L_0x083d;
                case 47: goto L_0x084b;
                case 48: goto L_0x0a21;
                case 49: goto L_0x0a2f;
                case 50: goto L_0x0859;
                case 51: goto L_0x0862;
                case 52: goto L_0x0882;
                case 53: goto L_0x08a2;
                case 54: goto L_0x08b6;
                case 55: goto L_0x08ca;
                case 56: goto L_0x08d2;
                case 57: goto L_0x08da;
                case 58: goto L_0x08e2;
                case 59: goto L_0x08f9;
                case 60: goto L_0x0921;
                case 61: goto L_0x0934;
                case 62: goto L_0x0945;
                case 63: goto L_0x0954;
                case 64: goto L_0x0968;
                case 65: goto L_0x097c;
                case 66: goto L_0x0990;
                case 67: goto L_0x099f;
                case 68: goto L_0x09ae;
                default: goto L_0x0650;
            }
        L_0x0650:
            int r3 = r3 + 3
            goto L_0x0622
        L_0x0653:
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0650
            X.5Ld r8 = X.C284115La.A01
            double r9 = r8.A01(r15, r0)
            r0 = r14
            X.Pyh r0 = (X.C7194Pyh) r0
            X.Pyc r8 = r0.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r9)
            r8.A0A(r2, r0)
            goto L_0x0650
        L_0x0669:
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0650
            X.5Ld r8 = X.C284115La.A01
            float r8 = r8.A02(r15, r0)
            r0 = r14
            X.Pyh r0 = (X.C7194Pyh) r0
            X.Pyc r1 = r0.A00
            int r0 = java.lang.Float.floatToRawIntBits(r8)
            r1.A08(r2, r0)
            goto L_0x0650
        L_0x067f:
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0650
            long r0 = r4.getLong(r15, r0)
            r8 = r14
            X.Pyh r8 = (X.C7194Pyh) r8
            X.Pyc r8 = r8.A00
            r8.A0B(r2, r0)
            goto L_0x0650
        L_0x068f:
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0650
            long r0 = r4.getLong(r15, r0)
            r8 = r14
            X.Pyh r8 = (X.C7194Pyh) r8
            X.Pyc r8 = r8.A00
            r8.A0B(r2, r0)
            goto L_0x0650
        L_0x069f:
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0650
            int r1 = r4.getInt(r15, r0)
            r0 = r14
            X.Pyh r0 = (X.C7194Pyh) r0
            X.Pyc r0 = r0.A00
            r0.A09(r2, r1)
            goto L_0x0650
        L_0x06af:
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0650
            long r0 = r4.getLong(r15, r0)
            r8 = r14
            X.Pyh r8 = (X.C7194Pyh) r8
            X.Pyc r8 = r8.A00
            r8.A0A(r2, r0)
            goto L_0x0650
        L_0x06bf:
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0650
            int r1 = r4.getInt(r15, r0)
            r0 = r14
            X.Pyh r0 = (X.C7194Pyh) r0
            X.Pyc r0 = r0.A00
            r0.A08(r2, r1)
            goto L_0x0650
        L_0x06cf:
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0650
            X.5Ld r8 = X.C284115La.A01
            boolean r0 = r8.A0G(r15, r0)
            r14.FNm(r2, r0)
            goto L_0x0650
        L_0x06dd:
            r8 = r8 & r12
            goto L_0x08fd
        L_0x06e0:
            r8 = r8 & r12
            goto L_0x0925
        L_0x06e3:
            r8 = r8 & r12
            goto L_0x0938
        L_0x06e6:
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0650
            int r0 = r4.getInt(r15, r0)
            r14.FOG(r2, r0)
            goto L_0x0650
        L_0x06f2:
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0650
            int r1 = r4.getInt(r15, r0)
            r0 = r14
            X.Pyh r0 = (X.C7194Pyh) r0
            X.Pyc r0 = r0.A00
            r0.A09(r2, r1)
            goto L_0x0650
        L_0x0703:
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0650
            int r1 = r4.getInt(r15, r0)
            r0 = r14
            X.Pyh r0 = (X.C7194Pyh) r0
            X.Pyc r0 = r0.A00
            r0.A08(r2, r1)
            goto L_0x0650
        L_0x0714:
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0650
            long r0 = r4.getLong(r15, r0)
            r8 = r14
            X.Pyh r8 = (X.C7194Pyh) r8
            X.Pyc r8 = r8.A00
            r8.A0A(r2, r0)
            goto L_0x0650
        L_0x0725:
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0650
            int r0 = r4.getInt(r15, r0)
            r14.FO4(r2, r0)
            goto L_0x0650
        L_0x0731:
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0650
            long r0 = r4.getLong(r15, r0)
            r14.FO5(r2, r0)
            goto L_0x0650
        L_0x073d:
            r8 = r8 & r12
            goto L_0x09b2
        L_0x0740:
            r8 = 0
            goto L_0x07a4
        L_0x0742:
            r8 = 0
            goto L_0x07b2
        L_0x0744:
            r8 = 0
            goto L_0x07c0
        L_0x0746:
            r8 = 0
            goto L_0x07ce
        L_0x0749:
            r8 = 0
            goto L_0x07dc
        L_0x074c:
            r8 = 0
            goto L_0x07ea
        L_0x074f:
            r8 = 0
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0F(r14, r0, r2, r8)
            goto L_0x0650
        L_0x075d:
            r8 = 0
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0O(r14, r0, r2, r8)
            goto L_0x0650
        L_0x076b:
            r8 = 0
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0E(r14, r0, r2, r8)
            goto L_0x0650
        L_0x0779:
            r8 = 0
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0K(r14, r0, r2, r8)
            goto L_0x0650
        L_0x0787:
            r8 = 0
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0L(r14, r0, r2, r8)
            goto L_0x0650
        L_0x0795:
            r8 = 0
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0M(r14, r0, r2, r8)
            goto L_0x0650
        L_0x07a3:
            r8 = 1
        L_0x07a4:
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0D(r14, r0, r2, r8)
            goto L_0x0650
        L_0x07b1:
            r8 = 1
        L_0x07b2:
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0H(r14, r0, r2, r8)
            goto L_0x0650
        L_0x07bf:
            r8 = 1
        L_0x07c0:
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0J(r14, r0, r2, r8)
            goto L_0x0650
        L_0x07cd:
            r8 = 1
        L_0x07ce:
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0P(r14, r0, r2, r8)
            goto L_0x0650
        L_0x07db:
            r8 = 1
        L_0x07dc:
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0I(r14, r0, r2, r8)
            goto L_0x0650
        L_0x07e9:
            r8 = 1
        L_0x07ea:
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0G(r14, r0, r2, r8)
            goto L_0x0650
        L_0x07f7:
            r8 = 1
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0F(r14, r0, r2, r8)
            goto L_0x0650
        L_0x0805:
            r8 = 1
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0C(r14, r0, r2, r8)
            goto L_0x0650
        L_0x0813:
            r8 = 1
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0O(r14, r0, r2, r8)
            goto L_0x0650
        L_0x0821:
            r8 = 1
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0E(r14, r0, r2, r8)
            goto L_0x0650
        L_0x082f:
            r8 = 1
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0K(r14, r0, r2, r8)
            goto L_0x0650
        L_0x083d:
            r8 = 1
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0L(r14, r0, r2, r8)
            goto L_0x0650
        L_0x084b:
            r8 = 1
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0M(r14, r0, r2, r8)
            goto L_0x0650
        L_0x0859:
            java.lang.Object r0 = r4.getObject(r15, r0)
            r13.A06(r14, r0, r2, r3)
            goto L_0x0650
        L_0x0862:
            boolean r8 = r13.A09(r15, r2, r3)
            if (r8 == 0) goto L_0x0650
            X.5Ld r8 = X.C284115La.A01
            java.lang.Object r0 = r8.A06(r15, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            double r9 = r0.doubleValue()
            r0 = r14
            X.Pyh r0 = (X.C7194Pyh) r0
            X.Pyc r8 = r0.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r9)
            r8.A0A(r2, r0)
            goto L_0x0650
        L_0x0882:
            boolean r8 = r13.A09(r15, r2, r3)
            if (r8 == 0) goto L_0x0650
            X.5Ld r8 = X.C284115La.A01
            java.lang.Object r0 = r8.A06(r15, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r8 = r0.floatValue()
            r0 = r14
            X.Pyh r0 = (X.C7194Pyh) r0
            X.Pyc r1 = r0.A00
            int r0 = java.lang.Float.floatToRawIntBits(r8)
            r1.A08(r2, r0)
            goto L_0x0650
        L_0x08a2:
            boolean r8 = r13.A09(r15, r2, r3)
            if (r8 == 0) goto L_0x0650
            long r0 = A01(r15, r0)
            r8 = r14
            X.Pyh r8 = (X.C7194Pyh) r8
            X.Pyc r8 = r8.A00
            r8.A0B(r2, r0)
            goto L_0x0650
        L_0x08b6:
            boolean r8 = r13.A09(r15, r2, r3)
            if (r8 == 0) goto L_0x0650
            long r0 = A01(r15, r0)
            r8 = r14
            X.Pyh r8 = (X.C7194Pyh) r8
            X.Pyc r8 = r8.A00
            r8.A0B(r2, r0)
            goto L_0x0650
        L_0x08ca:
            boolean r8 = r13.A09(r15, r2, r3)
            if (r8 == 0) goto L_0x0650
            goto L_0x095a
        L_0x08d2:
            boolean r8 = r13.A09(r15, r2, r3)
            if (r8 == 0) goto L_0x0650
            goto L_0x0982
        L_0x08da:
            boolean r8 = r13.A09(r15, r2, r3)
            if (r8 == 0) goto L_0x0650
            goto L_0x096e
        L_0x08e2:
            boolean r8 = r13.A09(r15, r2, r3)
            if (r8 == 0) goto L_0x0650
            X.5Ld r8 = X.C284115La.A01
            java.lang.Object r0 = r8.A06(r15, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r14.FNm(r2, r0)
            goto L_0x0650
        L_0x08f9:
            boolean r8 = r13.A09(r15, r2, r3)
        L_0x08fd:
            if (r8 == 0) goto L_0x0650
            java.lang.Object r8 = r4.getObject(r15, r0)
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto L_0x091a
            java.lang.String r8 = (java.lang.String) r8
            r0 = r14
            X.Pyh r0 = (X.C7194Pyh) r0
            X.Pyc r1 = r0.A00
            int r0 = r2 << 3
            r0 = r0 | 2
            r1.A07(r0)
            r1.A0E(r8)
            goto L_0x0650
        L_0x091a:
            X.5L9 r8 = (X.AnonymousClass5L9) r8
            r14.FNo(r8, r2)
            goto L_0x0650
        L_0x0921:
            boolean r8 = r13.A09(r15, r2, r3)
        L_0x0925:
            if (r8 == 0) goto L_0x0650
            java.lang.Object r1 = r4.getObject(r15, r0)
            X.5L3 r0 = r13.A03(r3)
            r14.FNy(r0, r1, r2)
            goto L_0x0650
        L_0x0934:
            boolean r8 = r13.A09(r15, r2, r3)
        L_0x0938:
            if (r8 == 0) goto L_0x0650
            java.lang.Object r0 = r4.getObject(r15, r0)
            X.5L9 r0 = (X.AnonymousClass5L9) r0
            r14.FNo(r0, r2)
            goto L_0x0650
        L_0x0945:
            boolean r8 = r13.A09(r15, r2, r3)
            if (r8 == 0) goto L_0x0650
            int r0 = A00(r15, r0)
            r14.FOG(r2, r0)
            goto L_0x0650
        L_0x0954:
            boolean r8 = r13.A09(r15, r2, r3)
            if (r8 == 0) goto L_0x0650
        L_0x095a:
            int r1 = A00(r15, r0)
            r0 = r14
            X.Pyh r0 = (X.C7194Pyh) r0
            X.Pyc r0 = r0.A00
            r0.A09(r2, r1)
            goto L_0x0650
        L_0x0968:
            boolean r8 = r13.A09(r15, r2, r3)
            if (r8 == 0) goto L_0x0650
        L_0x096e:
            int r1 = A00(r15, r0)
            r0 = r14
            X.Pyh r0 = (X.C7194Pyh) r0
            X.Pyc r0 = r0.A00
            r0.A08(r2, r1)
            goto L_0x0650
        L_0x097c:
            boolean r8 = r13.A09(r15, r2, r3)
            if (r8 == 0) goto L_0x0650
        L_0x0982:
            long r0 = A01(r15, r0)
            r8 = r14
            X.Pyh r8 = (X.C7194Pyh) r8
            X.Pyc r8 = r8.A00
            r8.A0A(r2, r0)
            goto L_0x0650
        L_0x0990:
            boolean r8 = r13.A09(r15, r2, r3)
            if (r8 == 0) goto L_0x0650
            int r0 = A00(r15, r0)
            r14.FO4(r2, r0)
            goto L_0x0650
        L_0x099f:
            boolean r8 = r13.A09(r15, r2, r3)
            if (r8 == 0) goto L_0x0650
            long r0 = A01(r15, r0)
            r14.FO5(r2, r0)
            goto L_0x0650
        L_0x09ae:
            boolean r8 = r13.A09(r15, r2, r3)
        L_0x09b2:
            if (r8 == 0) goto L_0x0650
            java.lang.Object r1 = r4.getObject(r15, r0)
            X.5L3 r0 = r13.A03(r3)
            r14.FNt(r0, r1, r2)
            goto L_0x0650
        L_0x09c1:
            r2 = r5[r3]
            java.lang.Object r1 = r4.getObject(r15, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            X.AnonymousClass5L4.A0C(r14, r1, r2, r0)
            goto L_0x0650
        L_0x09cf:
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0B(r14, r0, r2)
            goto L_0x0650
        L_0x09dc:
            r8 = r5[r3]
            java.lang.Object r10 = r4.getObject(r15, r0)
            java.util.List r10 = (java.util.List) r10
            X.5L3 r9 = r13.A03(r3)
            X.5L5 r0 = X.AnonymousClass5L4.A02
            if (r10 == 0) goto L_0x0650
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0650
            r2 = r14
            X.Pyh r2 = (X.C7194Pyh) r2
            r1 = 0
        L_0x09f6:
            int r0 = r10.size()
            if (r1 >= r0) goto L_0x0650
            java.lang.Object r0 = r10.get(r1)
            r2.FNy(r9, r0, r8)
            int r1 = r1 + 1
            goto L_0x09f6
        L_0x0a06:
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r15, r0)
            java.util.List r0 = (java.util.List) r0
            X.AnonymousClass5L4.A0A(r14, r0, r2)
            goto L_0x0650
        L_0x0a13:
            r2 = r5[r3]
            java.lang.Object r1 = r4.getObject(r15, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            X.AnonymousClass5L4.A0N(r14, r1, r2, r0)
            goto L_0x0650
        L_0x0a21:
            r2 = r5[r3]
            java.lang.Object r1 = r4.getObject(r15, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 1
            X.AnonymousClass5L4.A0N(r14, r1, r2, r0)
            goto L_0x0650
        L_0x0a2f:
            r8 = r5[r3]
            java.lang.Object r10 = r4.getObject(r15, r0)
            java.util.List r10 = (java.util.List) r10
            X.5L3 r9 = r13.A03(r3)
            X.5L5 r0 = X.AnonymousClass5L4.A02
            if (r10 == 0) goto L_0x0650
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0650
            r2 = r14
            X.Pyh r2 = (X.C7194Pyh) r2
            r1 = 0
        L_0x0a49:
            int r0 = r10.size()
            if (r1 >= r0) goto L_0x0650
            java.lang.Object r0 = r10.get(r1)
            r2.FNt(r9, r0, r8)
            int r1 = r1 + 1
            goto L_0x0a49
        L_0x0a59:
            r8 = 0
            goto L_0x0648
        L_0x0a5c:
            X.5Kk r15 = (X.C283985Kk) r15
            X.5Ko r0 = r15.unknownFields
            r0.A02(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5LZ.FOE(X.Ti3, java.lang.Object):void");
    }

    public AnonymousClass5LZ(AnonymousClass5LV r2, AnonymousClass5LR r3, AnonymousClass5LY r4, C284005Km r5, AnonymousClass5LQ r6, AnonymousClass5L5 r7, int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, int i3, int i4, boolean z) {
        this.A08 = iArr;
        this.A0A = objArr;
        this.A02 = i;
        this.A01 = i2;
        this.A0E = r5 instanceof C283985Kk;
        this.A07 = z;
        this.A09 = iArr2;
        this.A00 = i3;
        this.A03 = i4;
        this.A0C = r6;
        this.A04 = r3;
        this.A0D = r7;
        this.A0B = r2;
        this.A06 = r5;
        this.A05 = r4;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0168, code lost:
        X.C284115La.A09(r12, (long) r1, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Co5(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            r13.getClass()
            r2 = 0
        L_0x0004:
            int[] r5 = r11.A08
            int r0 = r5.length
            r6 = r12
            if (r2 >= r0) goto L_0x0171
            int r0 = r2 + 1
            r1 = r5[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            long r7 = (long) r0
            r4 = r5[r2]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r1 = r1 & r0
            int r0 = r1 >>> 20
            switch(r0) {
                case 0: goto L_0x0020;
                case 1: goto L_0x0031;
                case 2: goto L_0x0042;
                case 3: goto L_0x0042;
                case 4: goto L_0x0053;
                case 5: goto L_0x0042;
                case 6: goto L_0x0053;
                case 7: goto L_0x0064;
                case 8: goto L_0x0075;
                case 9: goto L_0x0122;
                case 10: goto L_0x0075;
                case 11: goto L_0x0053;
                case 12: goto L_0x0053;
                case 13: goto L_0x0053;
                case 14: goto L_0x0042;
                case 15: goto L_0x0053;
                case 16: goto L_0x0042;
                case 17: goto L_0x0122;
                case 18: goto L_0x0083;
                case 19: goto L_0x0083;
                case 20: goto L_0x0083;
                case 21: goto L_0x0083;
                case 22: goto L_0x0083;
                case 23: goto L_0x0083;
                case 24: goto L_0x0083;
                case 25: goto L_0x0083;
                case 26: goto L_0x0083;
                case 27: goto L_0x0083;
                case 28: goto L_0x0083;
                case 29: goto L_0x0083;
                case 30: goto L_0x0083;
                case 31: goto L_0x0083;
                case 32: goto L_0x0083;
                case 33: goto L_0x0083;
                case 34: goto L_0x0083;
                case 35: goto L_0x0083;
                case 36: goto L_0x0083;
                case 37: goto L_0x0083;
                case 38: goto L_0x0083;
                case 39: goto L_0x0083;
                case 40: goto L_0x0083;
                case 41: goto L_0x0083;
                case 42: goto L_0x0083;
                case 43: goto L_0x0083;
                case 44: goto L_0x0083;
                case 45: goto L_0x0083;
                case 46: goto L_0x0083;
                case 47: goto L_0x0083;
                case 48: goto L_0x0083;
                case 49: goto L_0x0083;
                case 50: goto L_0x00db;
                case 51: goto L_0x010a;
                case 52: goto L_0x010a;
                case 53: goto L_0x010a;
                case 54: goto L_0x010a;
                case 55: goto L_0x010a;
                case 56: goto L_0x010a;
                case 57: goto L_0x010a;
                case 58: goto L_0x010a;
                case 59: goto L_0x010a;
                case 60: goto L_0x0145;
                case 61: goto L_0x010a;
                case 62: goto L_0x010a;
                case 63: goto L_0x010a;
                case 64: goto L_0x010a;
                case 65: goto L_0x010a;
                case 66: goto L_0x010a;
                case 67: goto L_0x010a;
                case 68: goto L_0x0145;
                default: goto L_0x001d;
            }
        L_0x001d:
            int r2 = r2 + 3
            goto L_0x0004
        L_0x0020:
            boolean r0 = r11.A08(r2, r13)
            if (r0 == 0) goto L_0x001d
            X.5Ld r5 = X.C284115La.A01
            double r9 = r5.A01(r13, r7)
            r5.A09(r6, r7, r9)
            goto L_0x013d
        L_0x0031:
            boolean r0 = r11.A08(r2, r13)
            if (r0 == 0) goto L_0x001d
            X.5Ld r1 = X.C284115La.A01
            float r0 = r1.A02(r13, r7)
            r1.A0A(r12, r7, r0)
            goto L_0x013d
        L_0x0042:
            boolean r0 = r11.A08(r2, r13)
            if (r0 == 0) goto L_0x001d
            X.5Ld r5 = X.C284115La.A01
            long r9 = r5.A05(r13, r7)
            r5.A0C(r6, r7, r9)
            goto L_0x013d
        L_0x0053:
            boolean r0 = r11.A08(r2, r13)
            if (r0 == 0) goto L_0x001d
            X.5Ld r0 = X.C284115La.A01
            int r0 = r0.A04(r13, r7)
            X.C284115La.A09(r12, r7, r0)
            goto L_0x013d
        L_0x0064:
            boolean r0 = r11.A08(r2, r13)
            if (r0 == 0) goto L_0x001d
            X.5Ld r1 = X.C284115La.A01
            boolean r0 = r1.A0G(r13, r7)
            r1.A0E(r12, r7, r0)
            goto L_0x013d
        L_0x0075:
            boolean r0 = r11.A08(r2, r13)
            if (r0 == 0) goto L_0x001d
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r0 = r0.A06(r13, r7)
            goto L_0x013a
        L_0x0083:
            X.5LR r0 = r11.A04
            boolean r1 = r0 instanceof X.AnonymousClass5LT
            X.5Ld r0 = X.C284115La.A01
            if (r1 == 0) goto L_0x00b8
            java.lang.Object r5 = r0.A06(r12, r7)
            X.TnW r5 = (X.C13980TnW) r5
            java.lang.Object r4 = r0.A06(r13, r7)
            java.util.List r4 = (java.util.List) r4
            int r3 = r5.size()
            int r1 = r4.size()
            if (r3 <= 0) goto L_0x00b3
            if (r1 <= 0) goto L_0x00b2
            r0 = r5
            X.TRo r0 = (X.C13248TRo) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00af
            int r1 = r1 + r3
            X.TnW r5 = r5.Con(r1)
        L_0x00af:
            r5.addAll(r4)
        L_0x00b2:
            r4 = r5
        L_0x00b3:
            X.C284115La.A0A(r12, r7, r4)
            goto L_0x001d
        L_0x00b8:
            java.lang.Object r4 = r0.A06(r13, r7)
            java.util.List r4 = (java.util.List) r4
            int r0 = r4.size()
            java.util.List r3 = X.AnonymousClass5LS.A00(r12, r0, r7)
            int r1 = r3.size()
            int r0 = r4.size()
            if (r1 <= 0) goto L_0x00d6
            if (r0 <= 0) goto L_0x00d5
            r3.addAll(r4)
        L_0x00d5:
            r4 = r3
        L_0x00d6:
            X.C284115La.A0A(r12, r7, r4)
            goto L_0x001d
        L_0x00db:
            X.5L5 r0 = X.AnonymousClass5L4.A02
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r3 = r0.A06(r12, r7)
            java.lang.Object r1 = r0.A06(r13, r7)
            X.5Kp r3 = (X.C284025Kp) r3
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0105
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x00f9
            X.5Kp r3 = r3.A01()
        L_0x00f9:
            X.C284025Kp.A00(r3)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0105
            r3.putAll(r1)
        L_0x0105:
            X.C284115La.A0A(r12, r7, r3)
            goto L_0x001d
        L_0x010a:
            boolean r0 = r11.A09(r13, r4, r2)
            if (r0 == 0) goto L_0x001d
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r0 = r0.A06(r13, r7)
            X.C284115La.A0A(r12, r7, r0)
            int r0 = r2 + 2
            r1 = r5[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            goto L_0x0168
        L_0x0122:
            boolean r0 = r11.A08(r2, r13)
            if (r0 == 0) goto L_0x001d
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r1 = r0.A06(r12, r7)
            java.lang.Object r0 = r0.A06(r13, r7)
            if (r1 == 0) goto L_0x0142
            if (r0 == 0) goto L_0x001d
            X.5Kk r0 = X.C284045Ks.A00(r1, r0)
        L_0x013a:
            X.C284115La.A0A(r12, r7, r0)
        L_0x013d:
            r11.A07(r12, r2)
            goto L_0x001d
        L_0x0142:
            if (r0 == 0) goto L_0x001d
            goto L_0x013a
        L_0x0145:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            boolean r0 = r11.A09(r13, r4, r2)
            if (r0 == 0) goto L_0x001d
            X.5Ld r0 = X.C284115La.A01
            java.lang.Object r1 = r0.A06(r12, r7)
            java.lang.Object r0 = r0.A06(r13, r7)
            if (r1 == 0) goto L_0x016e
            if (r0 == 0) goto L_0x001d
            X.5Kk r0 = X.C284045Ks.A00(r1, r0)
        L_0x0160:
            X.C284115La.A0A(r12, r7, r0)
            int r0 = r2 + 2
            r1 = r5[r0]
            r1 = r1 & r3
        L_0x0168:
            long r0 = (long) r1
            X.C284115La.A09(r12, r0, r4)
            goto L_0x001d
        L_0x016e:
            if (r0 == 0) goto L_0x001d
            goto L_0x0160
        L_0x0171:
            boolean r0 = r11.A07
            if (r0 != 0) goto L_0x0178
            X.AnonymousClass5L4.A0Q(r12, r13)
        L_0x0178:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5LZ.Co5(java.lang.Object, java.lang.Object):void");
    }
}

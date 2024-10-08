package X;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.UnsafeUtil;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

public final class T5N implements C13903TjQ {
    public static final Unsafe A0F = UnsafeUtil.A04();
    public static final int[] A0G = new int[0];
    public final int A00;
    public final int A01;
    public final T5J A02;
    public final C10899Rzz A03;
    public final int[] A04;
    public final int[] A05;
    public final Object[] A06;
    public final int A07;
    public final int A08;
    public final C9748Rg6 A09;
    public final C11309SKx A0A;
    public final C9749Rg7 A0B;
    public final C10894Rzu A0C;
    public final boolean A0D;
    public final boolean A0E;

    public static Field A0H(Class cls, String str) {
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

    private int A00(int i) {
        if (i < this.A08 || i > this.A07) {
            return -1;
        }
        int i2 = 0;
        int[] iArr = this.A04;
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

    private int A01(int i, int i2) {
        if (i < this.A08 || i > this.A07) {
            return -1;
        }
        int[] iArr = this.A04;
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

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0061, code lost:
        r6.A02 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0065, code lost:
        return r10 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007d, code lost:
        r6.A02 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007f, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a0, code lost:
        r6.A02 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a4, code lost:
        return r10 + 4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(X.SFF r6, X.C8915RFi r7, java.lang.Class r8, byte[] r9, int r10, int r11) {
        /*
            int[] r0 = X.C10017RlC.A00
            int r0 = X.Pxe.A08(r7, r0)
            switch(r0) {
                case 1: goto L_0x006b;
                case 2: goto L_0x0066;
                case 3: goto L_0x0011;
                case 4: goto L_0x0098;
                case 5: goto L_0x0098;
                case 6: goto L_0x0059;
                case 7: goto L_0x0059;
                case 8: goto L_0x008b;
                case 9: goto L_0x004e;
                case 10: goto L_0x004e;
                case 11: goto L_0x004e;
                case 12: goto L_0x0043;
                case 13: goto L_0x0043;
                case 14: goto L_0x0080;
                case 15: goto L_0x0032;
                case 16: goto L_0x0023;
                case 17: goto L_0x001e;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.String r0 = "unsupported field type."
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x0011:
            long r0 = X.SU4.A09(r9, r10)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            goto L_0x0061
        L_0x001e:
            int r5 = X.SU4.A04(r6, r9, r10)
            return r5
        L_0x0023:
            int r5 = X.SU4.A06(r6, r9, r10)
            long r0 = r6.A01
            long r0 = X.Pxg.A0D(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x007d
        L_0x0032:
            int r5 = X.SU4.A05(r6, r9, r10)
            int r0 = r6.A00
            int r1 = r0 >>> 1
            r0 = r0 & 1
            int r0 = -r0
            r0 = r0 ^ r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x007d
        L_0x0043:
            int r5 = X.SU4.A06(r6, r9, r10)
            long r0 = r6.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x007d
        L_0x004e:
            int r5 = X.SU4.A05(r6, r9, r10)
            int r0 = r6.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x007d
        L_0x0059:
            long r0 = X.SU4.A09(r9, r10)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0061:
            r6.A02 = r0
            int r5 = r10 + 8
            return r5
        L_0x0066:
            int r5 = X.SU4.A03(r6, r9, r10)
            return r5
        L_0x006b:
            int r5 = X.SU4.A06(r6, r9, r10)
            long r3 = r6.A01
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x007d:
            r6.A02 = r0
            return r5
        L_0x0080:
            X.SH5 r0 = X.SH5.A02
            X.TjQ r0 = r0.A00(r8)
            int r5 = X.SU4.A00(r6, r0, r9, r10, r11)
            return r5
        L_0x008b:
            int r0 = X.Pxk.A02(r9, r10)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x00a0
        L_0x0098:
            int r0 = X.Pxk.A02(r9, r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x00a0:
            r6.A02 = r0
            int r5 = r10 + 4
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T5N.A02(X.SFF, X.RFi, java.lang.Class, byte[], int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0027, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x015c, code lost:
        r6.putObject(r8, r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0188, code lost:
        r6.putInt(r8, r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x018b, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A03(X.SFF r22, java.lang.Object r23, byte[] r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, long r33) {
        /*
            r21 = this;
            r7 = r25
            sun.misc.Unsafe r6 = A0F
            r12 = r21
            int[] r1 = r12.A04
            r9 = r32
            int r0 = r32 + 2
            r0 = r1[r0]
            long r2 = X.Pxe.A0B(r0)
            r5 = 5
            r4 = 2
            r11 = r22
            r10 = r24
            r17 = r26
            r15 = r27
            r14 = r28
            r13 = r29
            r0 = r33
            r8 = r23
            switch(r31) {
                case 51: goto L_0x0174;
                case 52: goto L_0x0160;
                case 53: goto L_0x0150;
                case 54: goto L_0x0150;
                case 55: goto L_0x0143;
                case 56: goto L_0x0132;
                case 57: goto L_0x0122;
                case 58: goto L_0x010d;
                case 59: goto L_0x00da;
                case 60: goto L_0x00b4;
                case 61: goto L_0x00a7;
                case 62: goto L_0x0143;
                case 63: goto L_0x007e;
                case 64: goto L_0x0122;
                case 65: goto L_0x0132;
                case 66: goto L_0x006a;
                case 67: goto L_0x0058;
                case 68: goto L_0x0028;
                default: goto L_0x0027;
            }
        L_0x0027:
            return r7
        L_0x0028:
            r4 = 3
            if (r13 != r4) goto L_0x0027
            r4 = r27 & -8
            r20 = r4 | 4
            X.TjQ r16 = r12.A0D(r9)
            r18 = r7
            r19 = r17
            r17 = r10
            r15 = r11
            int r7 = X.SU4.A01(r15, r16, r17, r18, r19, r20)
            int r4 = r6.getInt(r8, r2)
            if (r4 != r14) goto L_0x0055
            java.lang.Object r5 = r6.getObject(r8, r0)
            if (r5 == 0) goto L_0x0055
            java.lang.Object r4 = r11.A02
            X.R5b r4 = X.SD9.A00(r5, r4)
        L_0x0050:
            r6.putObject(r8, r0, r4)
            goto L_0x0188
        L_0x0055:
            java.lang.Object r4 = r11.A02
            goto L_0x0050
        L_0x0058:
            if (r29 != 0) goto L_0x0027
            int r7 = X.SU4.A06(r11, r10, r7)
            long r4 = r11.A01
            long r4 = X.Pxg.A0D(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x015c
        L_0x006a:
            if (r29 != 0) goto L_0x0027
            int r7 = X.SU4.A05(r11, r10, r7)
            int r4 = r11.A00
            int r5 = r4 >>> 1
            r4 = r4 & 1
            int r4 = -r4
            r4 = r4 ^ r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x015c
        L_0x007e:
            if (r29 != 0) goto L_0x0027
            int r7 = X.SU4.A05(r11, r10, r7)
            int r5 = r11.A00
            X.TeS r4 = A0B(r12, r9)
            if (r4 == 0) goto L_0x009e
            boolean r4 = r4.CVB(r5)
            if (r4 != 0) goto L_0x009e
            X.SJn r1 = A0E(r8)
            java.lang.Long r0 = X.DbS.A0j(r5)
            r1.A01(r15, r0)
            return r7
        L_0x009e:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r6.putObject(r8, r0, r4)
            goto L_0x0188
        L_0x00a7:
            if (r13 != r4) goto L_0x0027
            int r7 = X.SU4.A03(r11, r10, r7)
            java.lang.Object r4 = r11.A02
            r6.putObject(r8, r0, r4)
            goto L_0x0188
        L_0x00b4:
            if (r13 != r4) goto L_0x0027
            X.TjQ r5 = r12.A0D(r9)
            r4 = r17
            int r7 = X.SU4.A00(r11, r5, r10, r7, r4)
            int r4 = r6.getInt(r8, r2)
            if (r4 != r14) goto L_0x00d7
            java.lang.Object r5 = r6.getObject(r8, r0)
            if (r5 == 0) goto L_0x00d7
            java.lang.Object r4 = r11.A02
            X.R5b r4 = X.SD9.A00(r5, r4)
        L_0x00d2:
            r6.putObject(r8, r0, r4)
            goto L_0x0188
        L_0x00d7:
            java.lang.Object r4 = r11.A02
            goto L_0x00d2
        L_0x00da:
            if (r13 != r4) goto L_0x0027
            int r7 = X.SU4.A05(r11, r10, r7)
            int r9 = r11.A00
            if (r9 != 0) goto L_0x00eb
            java.lang.String r4 = ""
            r6.putObject(r8, r0, r4)
            goto L_0x0188
        L_0x00eb:
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            r30 = r30 & r4
            if (r30 == 0) goto L_0x0102
            int r5 = r7 + r9
            X.S57 r4 = X.SC5.A00
            int r4 = r4.A03(r10, r7, r5)
            if (r4 == 0) goto L_0x0102
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            X.5I7 r0 = X.Pxg.A0T(r0)
            throw r0
        L_0x0102:
            java.nio.charset.Charset r4 = X.SD9.A04
            java.lang.String r4 = X.Pxe.A11(r4, r10, r7, r9)
            r6.putObject(r8, r0, r4)
            int r7 = r7 + r9
            goto L_0x0188
        L_0x010d:
            if (r29 != 0) goto L_0x0027
            int r7 = X.SU4.A06(r11, r10, r7)
            long r4 = r11.A01
            r10 = 0
            int r9 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            boolean r4 = X.AnonymousClass7TF.A1P(r9)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L_0x015c
        L_0x0122:
            if (r13 != r5) goto L_0x0027
            int r4 = X.Pxk.A02(r10, r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.putObject(r8, r0, r4)
            int r7 = r25 + 4
            goto L_0x0188
        L_0x0132:
            r4 = 1
            if (r13 != r4) goto L_0x0027
            long r4 = X.SU4.A09(r10, r7)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r6.putObject(r8, r0, r4)
            int r7 = r25 + 8
            goto L_0x0188
        L_0x0143:
            if (r29 != 0) goto L_0x0027
            int r7 = X.SU4.A05(r11, r10, r7)
            int r4 = r11.A00
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x015c
        L_0x0150:
            if (r29 != 0) goto L_0x0027
            int r7 = X.SU4.A06(r11, r10, r7)
            long r4 = r11.A01
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
        L_0x015c:
            r6.putObject(r8, r0, r4)
            goto L_0x0188
        L_0x0160:
            if (r13 != r5) goto L_0x0027
            int r4 = X.Pxk.A02(r10, r7)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r6.putObject(r8, r0, r4)
            int r7 = r25 + 4
            goto L_0x0188
        L_0x0174:
            r4 = 1
            if (r13 != r4) goto L_0x0027
            long r4 = X.SU4.A09(r10, r7)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            r6.putObject(r8, r0, r4)
            int r7 = r25 + 8
        L_0x0188:
            r6.putInt(r8, r2, r14)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T5N.A03(X.SFF, java.lang.Object, byte[], int, int, int, int, int, int, int, int, long):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A05(X.SFF r17, java.lang.Object r18, byte[] r19, int r20, int r21, int r22, long r23) {
        /*
            r16 = this;
            sun.misc.Unsafe r4 = A0F
            r0 = r16
            java.lang.Object[] r1 = r0.A06
            int r0 = r22 / 3
            int r0 = r0 * 2
            r3 = r1[r0]
            r5 = r18
            r1 = r23
            java.lang.Object r6 = r4.getObject(r5, r1)
            r0 = r6
            X.TSY r0 = (X.TSY) r0
            boolean r0 = r0.A00
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x002a
            X.TSY r0 = X.TSY.A01
            X.TSY r0 = r0.A01()
            X.C11309SKx.A01(r0, r6)
            r4.putObject(r5, r1, r0)
            r6 = r0
        L_0x002a:
            X.RvA r3 = (X.C10616RvA) r3
            X.Rwh r5 = r3.A00
            java.util.AbstractMap r6 = (java.util.AbstractMap) r6
            r10 = r17
            r13 = r19
            r0 = r20
            int r8 = X.SU4.A05(r10, r13, r0)
            int r1 = r10.A00
            if (r1 < 0) goto L_0x0094
            r15 = r21
            int r0 = r21 - r8
            if (r1 > r0) goto L_0x0094
            int r4 = r8 + r1
            java.lang.Object r7 = r5.A02
            java.lang.Object r3 = r5.A03
            r2 = r3
        L_0x004b:
            if (r8 >= r4) goto L_0x0087
            int r14 = r8 + 1
            byte r8 = r19[r8]
            if (r8 >= 0) goto L_0x0059
            int r14 = X.SU4.A07(r10, r13, r8, r14)
            int r8 = r10.A00
        L_0x0059:
            int r9 = r8 >>> 3
            r1 = r8 & 7
            r0 = 1
            if (r9 == r0) goto L_0x0074
            r0 = 2
            if (r9 != r0) goto L_0x0082
            X.RFi r11 = r5.A01
            int r0 = r11.A00
            if (r1 != r0) goto L_0x0082
            java.lang.Class r12 = r3.getClass()
            int r8 = A02(r10, r11, r12, r13, r14, r15)
            java.lang.Object r2 = r10.A02
            goto L_0x004b
        L_0x0074:
            X.RFi r11 = r5.A00
            int r0 = r11.A00
            if (r1 != r0) goto L_0x0082
            r12 = 0
            int r8 = A02(r10, r11, r12, r13, r14, r15)
            java.lang.Object r7 = r10.A02
            goto L_0x004b
        L_0x0082:
            int r8 = X.SU4.A08(r10, r13, r8, r14, r15)
            goto L_0x004b
        L_0x0087:
            if (r8 != r4) goto L_0x008d
            r6.put(r7, r2)
            return r4
        L_0x008d:
            java.lang.String r0 = "Failed to parse the message."
            X.5I7 r0 = X.Pxg.A0T(r0)
            throw r0
        L_0x0094:
            X.5I7 r0 = X.AnonymousClass5I7.A02()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T5N.A05(X.SFF, java.lang.Object, byte[], int, int, int, long):int");
    }

    public static int A06(Object obj) {
        C10894Rzu rzu = C11433SUe.A02;
        return ((List) obj).size();
    }

    public static C13661TeS A0B(T5N t5n, int i) {
        return (C13661TeS) t5n.A06[((i / 3) * 2) + 1];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01be, code lost:
        if (r29 == false) goto L_0x01c0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.T5N A0C(X.C9748Rg6 r31, X.C10899Rzz r32, X.C11309SKx r33, X.C9749Rg7 r34, X.C10704Rwi r35, X.C10894Rzu r36) {
        /*
            r8 = r35
            int r0 = r8.A00
            r1 = 1
            r0 = r0 & 1
            if (r0 != r1) goto L_0x002c
            java.lang.Integer r2 = X.AnonymousClass05K.A00
        L_0x000b:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r0 = 0
            boolean r29 = X.AnonymousClass7TF.A1W(r2, r1)
            java.lang.String r13 = r8.A02
            int r27 = r13.length()
            char r0 = r13.charAt(r0)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r0 < r12) goto L_0x002f
            r0 = 1
        L_0x0022:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x0030
            r0 = r1
            goto L_0x0022
        L_0x002c:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            goto L_0x000b
        L_0x002f:
            r1 = 1
        L_0x0030:
            int r7 = r1 + 1
            char r3 = r13.charAt(r1)
            if (r3 < r12) goto L_0x004f
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x003c:
            int r1 = r7 + 1
            char r0 = r13.charAt(r7)
            if (r0 < r12) goto L_0x004c
            int r3 = X.Pxe.A04(r0, r2, r3)
            int r2 = r2 + 13
            r7 = r1
            goto L_0x003c
        L_0x004c:
            int r0 = r0 << r2
            r3 = r3 | r0
            r7 = r1
        L_0x004f:
            if (r3 != 0) goto L_0x023f
            int[] r26 = A0G
            r4 = 0
            r3 = 0
            r2 = 0
            r6 = 0
            r5 = 0
            r1 = 0
            r15 = 0
        L_0x005a:
            sun.misc.Unsafe r25 = A0F
            java.lang.Object[] r11 = r8.A03
            X.T5J r0 = r8.A01
            r30 = r0
            java.lang.Class r24 = r30.getClass()
            int r0 = r6 * 3
            int[] r0 = new int[r0]
            r23 = r0
            int r0 = r6 * 2
            java.lang.Object[] r14 = new java.lang.Object[r0]
            int r28 = r1 + r5
            r22 = r1
            r21 = r28
            r20 = 0
            r19 = 0
        L_0x007a:
            r0 = r27
            if (r7 >= r0) goto L_0x0343
            int r6 = r7 + 1
            char r10 = r13.charAt(r7)
            r0 = r6
            if (r10 < r12) goto L_0x009d
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r5 = 13
        L_0x008b:
            int r6 = r6 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x009b
            int r10 = X.Pxe.A04(r0, r5, r10)
            int r5 = r5 + 13
            r0 = r6
            goto L_0x008b
        L_0x009b:
            int r0 = r0 << r5
            r10 = r10 | r0
        L_0x009d:
            int r5 = r6 + 1
            char r9 = r13.charAt(r6)
            if (r9 < r12) goto L_0x00bc
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r0 = r5
            r6 = 13
        L_0x00aa:
            int r5 = r5 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x00ba
            int r9 = X.Pxe.A04(r0, r6, r9)
            int r6 = r6 + 13
            r0 = r5
            goto L_0x00aa
        L_0x00ba:
            int r0 = r0 << r6
            r9 = r9 | r0
        L_0x00bc:
            r8 = r9 & 255(0xff, float:3.57E-43)
            r0 = r9 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x00c8
            int r0 = r20 + 1
            r26[r20] = r19
            r20 = r0
        L_0x00c8:
            r0 = 51
            if (r8 < r0) goto L_0x0147
            int r7 = r5 + 1
            char r5 = r13.charAt(r5)
            if (r5 < r12) goto L_0x00ed
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r0 = 13
        L_0x00d8:
            int r16 = r7 + 1
            char r6 = r13.charAt(r7)
            if (r6 < r12) goto L_0x00e9
            int r5 = X.Pxe.A04(r6, r0, r5)
            int r0 = r0 + 13
            r7 = r16
            goto L_0x00d8
        L_0x00e9:
            int r6 = r6 << r0
            r5 = r5 | r6
            r7 = r16
        L_0x00ed:
            int r0 = r8 + -51
            r6 = 9
            if (r0 == r6) goto L_0x00fd
            r6 = 17
            if (r0 == r6) goto L_0x00fd
            r6 = 12
            if (r0 != r6) goto L_0x010a
            if (r29 != 0) goto L_0x010a
        L_0x00fd:
            int r0 = r19 / 3
            int r0 = r0 * 2
            int r16 = r0 + 1
            int r6 = r15 + 1
            r0 = r11[r15]
            r14[r16] = r0
            r15 = r6
        L_0x010a:
            int r16 = r5 * 2
            r5 = r11[r16]
            boolean r0 = r5 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x013c
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
        L_0x0114:
            r0 = r25
            long r5 = r0.objectFieldOffset(r5)
            int r0 = (int) r5
            r18 = r0
            int r6 = r16 + 1
            r5 = r11[r6]
            boolean r0 = r5 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0131
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
        L_0x0127:
            r0 = r25
            long r5 = r0.objectFieldOffset(r5)
            int r0 = (int) r5
            r5 = 0
            goto L_0x020f
        L_0x0131:
            java.lang.String r5 = (java.lang.String) r5
            r0 = r24
            java.lang.reflect.Field r5 = A0H(r0, r5)
            r11[r6] = r5
            goto L_0x0127
        L_0x013c:
            java.lang.String r5 = (java.lang.String) r5
            r0 = r24
            java.lang.reflect.Field r5 = A0H(r0, r5)
            r11[r16] = r5
            goto L_0x0114
        L_0x0147:
            int r17 = r15 + 1
            r6 = r11[r15]
            java.lang.String r6 = (java.lang.String) r6
            r0 = r24
            java.lang.reflect.Field r6 = A0H(r0, r6)
            r0 = 9
            if (r8 == r0) goto L_0x01d2
            r0 = 17
            if (r8 == r0) goto L_0x01d2
            r0 = 27
            if (r8 == r0) goto L_0x01c0
            r0 = 49
            if (r8 == r0) goto L_0x01c0
            r0 = 12
            if (r8 == r0) goto L_0x01be
            r0 = 30
            if (r8 == r0) goto L_0x01be
            r0 = 44
            if (r8 == r0) goto L_0x01be
            r0 = 50
            if (r8 != r0) goto L_0x018f
            int r15 = r22 + 1
            r26[r22] = r19
            int r0 = r19 / 3
            int r7 = r0 * 2
            int r16 = r17 + 1
            r0 = r11[r17]
            r14[r7] = r0
            r0 = r9 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x01cd
            int r7 = r7 + 1
            int r17 = r16 + 1
            r0 = r11[r16]
            r14[r7] = r0
            r22 = r15
        L_0x018f:
            r0 = r25
            long r6 = r0.objectFieldOffset(r6)
            int r0 = (int) r6
            r18 = r0
            r6 = r9 & 4096(0x1000, float:5.74E-42)
            r0 = 4096(0x1000, float:5.74E-42)
            if (r6 != r0) goto L_0x01e2
            r0 = 17
            if (r8 > r0) goto L_0x01e2
            int r0 = r5 + 1
            char r6 = r13.charAt(r5)
            if (r6 < r12) goto L_0x01f6
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r5 = 13
        L_0x01ae:
            int r7 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x01df
            int r6 = X.Pxe.A04(r0, r5, r6)
            int r5 = r5 + 13
            r0 = r7
            goto L_0x01ae
        L_0x01be:
            if (r29 != 0) goto L_0x018f
        L_0x01c0:
            int r0 = r19 / 3
            int r0 = r0 * 2
            int r7 = r0 + 1
            int r16 = r17 + 1
            r0 = r11[r17]
            r14[r7] = r0
            goto L_0x01cf
        L_0x01cd:
            r22 = r15
        L_0x01cf:
            r17 = r16
            goto L_0x018f
        L_0x01d2:
            int r0 = r19 / 3
            int r0 = r0 * 2
            int r7 = r0 + 1
            java.lang.Class r0 = r6.getType()
            r14[r7] = r0
            goto L_0x018f
        L_0x01df:
            int r0 = r0 << r5
            r6 = r6 | r0
            goto L_0x01f7
        L_0x01e2:
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r5
            r5 = 0
            r6 = 18
            if (r8 < r6) goto L_0x020d
            r6 = 49
            if (r8 > r6) goto L_0x020d
            int r6 = r21 + 1
            r26[r21] = r18
            r21 = r6
            goto L_0x020d
        L_0x01f6:
            r7 = r0
        L_0x01f7:
            int r15 = r4 * 2
            int r0 = r6 / 32
            int r15 = r15 + r0
            r5 = r11[r15]
            boolean r0 = r5 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0234
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
        L_0x0204:
            r0 = r25
            long r15 = r0.objectFieldOffset(r5)
            int r0 = (int) r15
            int r5 = r6 % 32
        L_0x020d:
            r15 = r17
        L_0x020f:
            int r17 = r19 + 1
            r23[r19] = r10
            int r16 = r17 + 1
            r6 = r9 & 512(0x200, float:7.175E-43)
            r10 = 0
            if (r6 == 0) goto L_0x021c
            r10 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x021c:
            r6 = r9 & 256(0x100, float:3.59E-43)
            r9 = 0
            if (r6 == 0) goto L_0x0223
            r9 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0223:
            r9 = r9 | r10
            int r6 = r8 << 20
            r9 = r9 | r6
            r9 = r9 | r18
            r23[r17] = r9
            int r19 = r16 + 1
            int r5 = r5 << 20
            r5 = r5 | r0
            r23[r16] = r5
            goto L_0x007a
        L_0x0234:
            java.lang.String r5 = (java.lang.String) r5
            r0 = r24
            java.lang.reflect.Field r5 = A0H(r0, r5)
            r11[r15] = r5
            goto L_0x0204
        L_0x023f:
            int r0 = r7 + 1
            char r4 = r13.charAt(r7)
            if (r4 < r12) goto L_0x025e
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x024b:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x025b
            int r4 = X.Pxe.A04(r0, r2, r4)
            int r2 = r2 + 13
            r0 = r1
            goto L_0x024b
        L_0x025b:
            int r0 = r0 << r2
            r4 = r4 | r0
            r0 = r1
        L_0x025e:
            int r3 = r0 + 1
            char r9 = r13.charAt(r0)
            if (r9 < r12) goto L_0x027d
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x026a:
            int r1 = r3 + 1
            char r0 = r13.charAt(r3)
            if (r0 < r12) goto L_0x027a
            int r9 = X.Pxe.A04(r0, r2, r9)
            int r2 = r2 + 13
            r3 = r1
            goto L_0x026a
        L_0x027a:
            int r0 = r0 << r2
            r9 = r9 | r0
            r3 = r1
        L_0x027d:
            int r0 = r3 + 1
            char r3 = r13.charAt(r3)
            if (r3 < r12) goto L_0x029c
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0289:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x0299
            int r3 = X.Pxe.A04(r0, r2, r3)
            int r2 = r2 + 13
            r0 = r1
            goto L_0x0289
        L_0x0299:
            int r0 = r0 << r2
            r3 = r3 | r0
            r0 = r1
        L_0x029c:
            int r6 = r0 + 1
            char r2 = r13.charAt(r0)
            if (r2 < r12) goto L_0x02bb
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r5 = 13
        L_0x02a8:
            int r1 = r6 + 1
            char r0 = r13.charAt(r6)
            if (r0 < r12) goto L_0x02b8
            int r2 = X.Pxe.A04(r0, r5, r2)
            int r5 = r5 + 13
            r6 = r1
            goto L_0x02a8
        L_0x02b8:
            int r0 = r0 << r5
            r2 = r2 | r0
            r6 = r1
        L_0x02bb:
            int r0 = r6 + 1
            char r6 = r13.charAt(r6)
            if (r6 < r12) goto L_0x02da
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r5 = 13
        L_0x02c7:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x02d7
            int r6 = X.Pxe.A04(r0, r5, r6)
            int r5 = r5 + 13
            r0 = r1
            goto L_0x02c7
        L_0x02d7:
            int r0 = r0 << r5
            r6 = r6 | r0
            r0 = r1
        L_0x02da:
            int r10 = r0 + 1
            char r5 = r13.charAt(r0)
            if (r5 < r12) goto L_0x02f9
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r7 = 13
        L_0x02e6:
            int r1 = r10 + 1
            char r0 = r13.charAt(r10)
            if (r0 < r12) goto L_0x02f6
            int r5 = X.Pxe.A04(r0, r7, r5)
            int r7 = r7 + 13
            r10 = r1
            goto L_0x02e6
        L_0x02f6:
            int r0 = r0 << r7
            r5 = r5 | r0
            r10 = r1
        L_0x02f9:
            int r0 = r10 + 1
            char r11 = r13.charAt(r10)
            if (r11 < r12) goto L_0x0318
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r7 = 13
        L_0x0305:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x0315
            int r11 = X.Pxe.A04(r0, r7, r11)
            int r7 = r7 + 13
            r0 = r1
            goto L_0x0305
        L_0x0315:
            int r0 = r0 << r7
            r11 = r11 | r0
            r0 = r1
        L_0x0318:
            int r7 = r0 + 1
            char r1 = r13.charAt(r0)
            if (r1 < r12) goto L_0x0337
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x0324:
            int r10 = r7 + 1
            char r0 = r13.charAt(r7)
            if (r0 < r12) goto L_0x0334
            int r1 = X.Pxe.A04(r0, r14, r1)
            int r14 = r14 + 13
            r7 = r10
            goto L_0x0324
        L_0x0334:
            int r0 = r0 << r14
            r1 = r1 | r0
            r7 = r10
        L_0x0337:
            int r0 = r1 + r5
            int r0 = r0 + r11
            int[] r0 = new int[r0]
            r26 = r0
            int r15 = r4 * 2
            int r15 = r15 + r9
            goto L_0x005a
        L_0x0343:
            X.T5N r15 = new X.T5N
            r17 = r31
            r18 = r32
            r19 = r33
            r20 = r34
            r21 = r36
            r16 = r30
            r22 = r23
            r23 = r26
            r24 = r14
            r25 = r3
            r26 = r2
            r27 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T5N.A0C(X.Rg6, X.Rzz, X.SKx, X.Rg7, X.Rwi, X.Rzu):X.T5N");
    }

    private C13903TjQ A0D(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.A06;
        C13903TjQ tjQ = (C13903TjQ) objArr[i2];
        if (tjQ != null) {
            return tjQ;
        }
        C13903TjQ A002 = SH5.A02.A00((Class) objArr[i2 + 1]);
        objArr[i2] = A002;
        return A002;
    }

    public static C11289SJn A0E(Object obj) {
        R5b r5b = (R5b) obj;
        C11289SJn sJn = r5b.unknownFields;
        if (sJn != C11289SJn.A05) {
            return sJn;
        }
        C11289SJn sJn2 = new C11289SJn();
        r5b.unknownFields = sJn2;
        return sJn2;
    }

    private final Object A0G(int i, Object obj, Object obj2) {
        int[] iArr = this.A04;
        int i2 = iArr[i];
        Object A0F2 = A0F(iArr[i + 1], obj);
        if (A0F2 != null) {
            Object[] objArr = this.A06;
            int i3 = (i / 3) * 2;
            C13661TeS teS = (C13661TeS) objArr[i3 + 1];
            if (teS != null) {
                C10703Rwh rwh = ((C10616RvA) objArr[i3]).A00;
                Iterator A0s = AnonymousClass7TF.A0s((AbstractMap) A0F2);
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    if (!teS.CVB(C66582MXn.A08(A1J))) {
                        if (obj2 == null) {
                            obj2 = new C11289SJn();
                        }
                        Object key = A1J.getKey();
                        Object value = A1J.getValue();
                        C8915RFi rFi = rwh.A00;
                        int A002 = SSU.A00(rFi, key, 1);
                        C8915RFi rFi2 = rwh.A01;
                        int A003 = A002 + SSU.A00(rFi2, value, 2);
                        C13659TeQ teQ = TAP.A02;
                        byte[] bArr = new byte[A003];
                        R3B r3b = new R3B(bArr, A003);
                        try {
                            Object key2 = A1J.getKey();
                            Object value2 = A1J.getValue();
                            SSU.A01(r3b, rFi, key2, 1);
                            SSU.A01(r3b, rFi2, value2, 2);
                            if (r3b.A01 - r3b.A00 == 0) {
                                ((C11289SJn) obj2).A01((i2 << 3) | 2, new R36(bArr));
                                A0s.remove();
                            } else {
                                throw AnonymousClass7TE.A0z("Did not write as much data as expected.");
                            }
                        } catch (IOException e) {
                            throw C41845B3m.A0j(e);
                        }
                    }
                }
            }
        }
        return obj2;
    }

    public static List A0J(T5N t5n, Object obj, int i) {
        return t5n.A03.A01(obj, (long) (i & 1048575));
    }

    public static List A0K(Object obj, long j) {
        List list = (List) UnsafeUtil.A02.A09(obj, j);
        C10894Rzu rzu = C11433SUe.A02;
        return list;
    }

    private void A0L(SUM sum, Object obj, int i) {
        long A0B2;
        Object A0O;
        if ((536870912 & i) != 0) {
            A0B2 = Pxe.A0B(i);
            SUM.A0A(sum, 2);
            A0O = sum.A03.A0Q();
        } else {
            boolean z = this.A0D;
            A0B2 = Pxe.A0B(i);
            SUM.A0A(sum, 2);
            C11363SPb sPb = sum.A03;
            if (z) {
                A0O = sPb.A0P();
            } else {
                A0O = sPb.A0O();
            }
        }
        UnsafeUtil.A06(obj, A0B2, A0O);
    }

    private void A0M(C10281Rpf rpf, Object obj, int i, int i2) {
        if (obj != null) {
            C10703Rwh rwh = ((C10616RvA) this.A06[(i2 / 3) * 2]).A00;
            CodedOutputStream codedOutputStream = rpf.A00;
            Iterator A0s = AnonymousClass7TF.A0s((AbstractMap) obj);
            while (A0s.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                SQE.A08(codedOutputStream, i);
                Object key = A1J.getKey();
                Object value = A1J.getValue();
                C8915RFi rFi = rwh.A00;
                int A002 = SSU.A00(rFi, key, 1);
                C8915RFi rFi2 = rwh.A01;
                codedOutputStream.A07(A002 + SSU.A00(rFi2, value, 2));
                Object key2 = A1J.getKey();
                Object value2 = A1J.getValue();
                SSU.A01(codedOutputStream, rFi, key2, 1);
                SSU.A01(codedOutputStream, rFi2, value2, 2);
            }
        }
    }

    private void A0N(Object obj, int i) {
        int i2 = this.A04[i + 2];
        long j = (long) (1048575 & i2);
        if (j != 1048575) {
            UnsafeUtil.A05(obj, j, (1 << (i2 >>> 20)) | UnsafeUtil.A02.A06(obj, j));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        return !r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A0O(int r11, java.lang.Object r12) {
        /*
            r10 = this;
            int[] r9 = r10.A04
            int r0 = r11 + 2
            r8 = r9[r0]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r7 & r8
            long r1 = (long) r0
            r6 = 0
            r5 = 1
            r3 = 1048575(0xfffff, double:5.18065E-318)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0081
            int r0 = r11 + 1
            r3 = r9[r0]
            r0 = r3 & r7
            long r1 = (long) r0
            int r0 = X.Pxe.A03(r3)
            r3 = 0
            switch(r0) {
                case 0: goto L_0x008e;
                case 1: goto L_0x0074;
                case 2: goto L_0x0069;
                case 3: goto L_0x0069;
                case 4: goto L_0x0060;
                case 5: goto L_0x0069;
                case 6: goto L_0x0060;
                case 7: goto L_0x0059;
                case 8: goto L_0x0038;
                case 9: goto L_0x002a;
                case 10: goto L_0x0031;
                case 11: goto L_0x0060;
                case 12: goto L_0x0060;
                case 13: goto L_0x0060;
                case 14: goto L_0x0069;
                case 15: goto L_0x0060;
                case 16: goto L_0x0069;
                case 17: goto L_0x002a;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalArgumentException r0 = X.Pxe.A0g()
            throw r0
        L_0x002a:
            java.lang.Object r0 = X.SK5.A00(r12, r1)
            if (r0 == 0) goto L_0x009d
            goto L_0x009c
        L_0x0031:
            X.TAP r0 = X.TAP.A01
            java.lang.Object r1 = X.SK5.A00(r12, r1)
            goto L_0x004f
        L_0x0038:
            java.lang.Object r1 = X.SK5.A00(r12, r1)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0049
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r1.isEmpty()
        L_0x0046:
            r0 = r0 ^ 1
            return r0
        L_0x0049:
            boolean r0 = r1 instanceof X.TAP
            if (r0 == 0) goto L_0x0054
            X.TAP r0 = X.TAP.A01
        L_0x004f:
            boolean r0 = r0.equals(r1)
            goto L_0x0046
        L_0x0054:
            java.lang.IllegalArgumentException r0 = X.Pxe.A0g()
            throw r0
        L_0x0059:
            X.SK5 r0 = com.google.protobuf.UnsafeUtil.A02
            boolean r0 = r0.A0L(r12, r1)
            return r0
        L_0x0060:
            X.SK5 r0 = com.google.protobuf.UnsafeUtil.A02
            int r0 = r0.A06(r12, r1)
            if (r0 == 0) goto L_0x009d
            goto L_0x009c
        L_0x0069:
            X.SK5 r0 = com.google.protobuf.UnsafeUtil.A02
            long r1 = r0.A07(r12, r1)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x009d
            goto L_0x009c
        L_0x0074:
            X.SK5 r0 = com.google.protobuf.UnsafeUtil.A02
            float r0 = r0.A04(r12, r1)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            if (r0 == 0) goto L_0x009d
            goto L_0x009c
        L_0x0081:
            int r0 = r8 >>> 20
            int r5 = r5 << r0
            X.SK5 r0 = com.google.protobuf.UnsafeUtil.A02
            int r0 = r0.A06(r12, r1)
            r0 = r0 & r5
            if (r0 == 0) goto L_0x009d
            goto L_0x009c
        L_0x008e:
            X.SK5 r0 = com.google.protobuf.UnsafeUtil.A02
            double r0 = r0.A03(r12, r1)
            long r1 = java.lang.Double.doubleToRawLongBits(r0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x009d
        L_0x009c:
            r6 = 1
        L_0x009d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T5N.A0O(int, java.lang.Object):boolean");
    }

    private boolean A0P(Object obj, int i, int i2) {
        return AnonymousClass7TF.A1S(A07(obj, this.A04[i2 + 2]), i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0289, code lost:
        r12.putLong(r5, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0294, code lost:
        r10 = r10 | r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0100, code lost:
        r9 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0141, code lost:
        r12.putObject(r5, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0144, code lost:
        r10 = r10 | r16;
        r2 = r18;
        r1 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0162, code lost:
        r2 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01a3, code lost:
        r12.putInt(r5, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ce, code lost:
        r12.putObject(r5, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01da, code lost:
        r2 = r7.A02;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0Q(X.SFF r39, java.lang.Object r40, byte[] r41, int r42, int r43, int r44) {
        /*
            r38 = this;
            r5 = r40
            r9 = r42
            sun.misc.Unsafe r12 = A0F
            r1 = -1
            r11 = 0
            r13 = 0
            r10 = 0
            r2 = 1048575(0xfffff, float:1.469367E-39)
        L_0x000d:
            r8 = r38
            r28 = r43
            r22 = r44
            r0 = r28
            if (r9 >= r0) goto L_0x02a2
            int r4 = r9 + 1
            r6 = r41
            byte r13 = r41[r9]
            r7 = r39
            if (r13 >= 0) goto L_0x0027
            int r4 = X.SU4.A07(r7, r6, r13, r4)
            int r13 = r7.A00
        L_0x0027:
            int r21 = r13 >>> 3
            r9 = r13 & 7
            r20 = 3
            r0 = r21
            if (r0 <= r1) goto L_0x029c
            int r11 = r11 / r20
            int r11 = r8.A01(r0, r11)
        L_0x0037:
            r0 = -1
            if (r11 != r0) goto L_0x0075
            r18 = r2
            r11 = 0
        L_0x003d:
            r0 = r22
            if (r13 != r0) goto L_0x0061
            if (r44 == 0) goto L_0x0061
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r4
            r2 = r18
        L_0x0049:
            if (r2 == r0) goto L_0x004f
            long r0 = (long) r2
            r12.putInt(r5, r0, r10)
        L_0x004f:
            r2 = 0
            int r1 = r8.A00
        L_0x0052:
            int r0 = r8.A01
            if (r1 >= r0) goto L_0x02a7
            int[] r0 = r8.A05
            r0 = r0[r1]
            java.lang.Object r2 = r8.A0G(r0, r5, r2)
            int r1 = r1 + 1
            goto L_0x0052
        L_0x0061:
            X.SJn r23 = A0E(r5)
            r22 = r7
            r24 = r6
            r25 = r13
            r26 = r4
            r27 = r28
            int r9 = X.SU4.A02(r22, r23, r24, r25, r26, r27)
            goto L_0x0296
        L_0x0075:
            int[] r0 = r8.A04
            r16 = r0
            int r0 = r11 + 1
            r15 = r16[r0]
            int r14 = X.Pxe.A03(r15)
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r15 & r19
            long r0 = (long) r0
            r3 = 17
            if (r14 > r3) goto L_0x01dd
            int r3 = r11 + 2
            r18 = r16[r3]
            int r3 = r18 >>> 20
            r17 = 1
            int r16 = r17 << r3
            r18 = r18 & r19
            r3 = r18
            if (r3 == r2) goto L_0x00af
            r3 = r19
            if (r2 == r3) goto L_0x00a3
            long r2 = (long) r2
            r12.putInt(r5, r2, r10)
        L_0x00a3:
            r2 = r18
            long r2 = (long) r2
            int r10 = r12.getInt(r5, r2)
        L_0x00aa:
            r2 = 5
            switch(r14) {
                case 0: goto L_0x00b2;
                case 1: goto L_0x00d2;
                case 2: goto L_0x00c8;
                case 3: goto L_0x00c8;
                case 4: goto L_0x00e5;
                case 5: goto L_0x00ef;
                case 6: goto L_0x0104;
                case 7: goto L_0x0110;
                case 8: goto L_0x014c;
                case 9: goto L_0x0126;
                case 10: goto L_0x01d3;
                case 11: goto L_0x00e5;
                case 12: goto L_0x0174;
                case 13: goto L_0x0104;
                case 14: goto L_0x00ef;
                case 15: goto L_0x0195;
                case 16: goto L_0x027d;
                case 17: goto L_0x01a8;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            goto L_0x003d
        L_0x00af:
            r18 = r2
            goto L_0x00aa
        L_0x00b2:
            r2 = r17
            if (r9 != r2) goto L_0x003d
            long r2 = X.SU4.A09(r6, r4)
            double r26 = java.lang.Double.longBitsToDouble(r2)
            X.SK5 r22 = com.google.protobuf.UnsafeUtil.A02
            r23 = r5
            r24 = r0
            r22.A0C(r23, r24, r26)
            goto L_0x0100
        L_0x00c8:
            if (r9 != 0) goto L_0x003d
            int r9 = X.SU4.A06(r7, r6, r4)
            long r2 = r7.A01
            goto L_0x0289
        L_0x00d2:
            if (r9 != r2) goto L_0x003d
            int r2 = X.Pxk.A02(r6, r4)
            float r3 = java.lang.Float.intBitsToFloat(r2)
            X.SK5 r2 = com.google.protobuf.UnsafeUtil.A02
            r2.A0D(r5, r0, r3)
            int r9 = r4 + 4
            goto L_0x0294
        L_0x00e5:
            if (r9 != 0) goto L_0x003d
            int r9 = X.SU4.A05(r7, r6, r4)
            int r2 = r7.A00
            goto L_0x01a3
        L_0x00ef:
            r2 = r17
            if (r9 != r2) goto L_0x003d
            long r26 = X.SU4.A09(r6, r4)
            r22 = r12
            r23 = r5
            r24 = r0
            r22.putLong(r23, r24, r26)
        L_0x0100:
            int r9 = r4 + 8
            goto L_0x0294
        L_0x0104:
            if (r9 != r2) goto L_0x003d
            int r2 = X.Pxk.A02(r6, r4)
            r12.putInt(r5, r0, r2)
            int r9 = r4 + 4
            goto L_0x0144
        L_0x0110:
            if (r9 != 0) goto L_0x003d
            int r9 = X.SU4.A06(r7, r6, r4)
            long r2 = r7.A01
            r6 = 0
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            boolean r3 = X.AnonymousClass7TF.A1P(r4)
            X.SK5 r2 = com.google.protobuf.UnsafeUtil.A02
            r2.A0H(r5, r0, r3)
            goto L_0x0144
        L_0x0126:
            r2 = 2
            if (r9 != r2) goto L_0x003d
            X.TjQ r3 = r8.A0D(r11)
            r2 = r28
            int r9 = X.SU4.A00(r7, r3, r6, r4, r2)
            r2 = r10 & r16
            if (r2 == 0) goto L_0x0162
            java.lang.Object r3 = r12.getObject(r5, r0)
            java.lang.Object r2 = r7.A02
            X.R5b r2 = X.SD9.A00(r3, r2)
        L_0x0141:
            r12.putObject(r5, r0, r2)
        L_0x0144:
            r10 = r10 | r16
            r2 = r18
            r1 = r21
            goto L_0x000d
        L_0x014c:
            r2 = 2
            if (r9 != r2) goto L_0x003d
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r15 = r15 & r2
            if (r15 != 0) goto L_0x016f
            int r9 = X.SU4.A05(r7, r6, r4)
            int r3 = r7.A00
            if (r3 < 0) goto L_0x02c4
            if (r3 != 0) goto L_0x0165
            java.lang.String r2 = ""
            r7.A02 = r2
        L_0x0162:
            java.lang.Object r2 = r7.A02
            goto L_0x0141
        L_0x0165:
            java.nio.charset.Charset r2 = X.SD9.A04
            java.lang.String r2 = X.Pxe.A11(r2, r6, r9, r3)
            r7.A02 = r2
            int r9 = r9 + r3
            goto L_0x0162
        L_0x016f:
            int r9 = X.SU4.A04(r7, r6, r4)
            goto L_0x0162
        L_0x0174:
            if (r9 != 0) goto L_0x003d
            int r9 = X.SU4.A05(r7, r6, r4)
            int r2 = r7.A00
            X.TeS r3 = A0B(r8, r11)
            if (r3 == 0) goto L_0x01a3
            boolean r3 = r3.CVB(r2)
            if (r3 != 0) goto L_0x01a3
            X.SJn r1 = A0E(r5)
            java.lang.Long r0 = X.DbS.A0j(r2)
            r1.A01(r13, r0)
            goto L_0x0296
        L_0x0195:
            if (r9 != 0) goto L_0x003d
            int r9 = X.SU4.A05(r7, r6, r4)
            int r2 = r7.A00
            int r3 = r2 >>> 1
            r2 = r2 & 1
            int r2 = -r2
            r2 = r2 ^ r3
        L_0x01a3:
            r12.putInt(r5, r0, r2)
            goto L_0x0294
        L_0x01a8:
            r2 = r20
            if (r9 != r2) goto L_0x003d
            int r2 = r21 << 3
            r27 = r2 | 4
            X.TjQ r23 = r8.A0D(r11)
            r22 = r7
            r24 = r6
            r25 = r4
            r26 = r28
            int r9 = X.SU4.A01(r22, r23, r24, r25, r26, r27)
            r2 = r10 & r16
            if (r2 == 0) goto L_0x01da
            java.lang.Object r3 = r12.getObject(r5, r0)
            java.lang.Object r2 = r7.A02
            X.R5b r2 = X.SD9.A00(r3, r2)
        L_0x01ce:
            r12.putObject(r5, r0, r2)
            goto L_0x0294
        L_0x01d3:
            r2 = 2
            if (r9 != r2) goto L_0x003d
            int r9 = X.SU4.A03(r7, r6, r4)
        L_0x01da:
            java.lang.Object r2 = r7.A02
            goto L_0x01ce
        L_0x01dd:
            r3 = 27
            if (r14 != r3) goto L_0x021e
            r3 = 2
            if (r9 != r3) goto L_0x021a
            java.lang.Object r3 = r12.getObject(r5, r0)
            X.TnY r3 = (X.C13982TnY) r3
            r9 = r3
            X.TRv r9 = (X.C13255TRv) r9
            boolean r9 = r9.A00
            if (r9 != 0) goto L_0x01fc
            int r9 = X.Pxg.A0A(r3)
            X.TnY r3 = r3.Cop(r9)
            r12.putObject(r5, r0, r3)
        L_0x01fc:
            X.TjQ r1 = r8.A0D(r11)
            r18 = r2
        L_0x0202:
            r0 = r28
            int r9 = X.SU4.A00(r7, r1, r6, r4, r0)
            java.lang.Object r0 = r7.A02
            r3.add(r0)
            r0 = r28
            if (r9 >= r0) goto L_0x0296
            int r4 = X.SU4.A05(r7, r6, r9)
            int r0 = r7.A00
            if (r13 == r0) goto L_0x0202
            goto L_0x0296
        L_0x021a:
            r18 = r2
            goto L_0x003d
        L_0x021e:
            r18 = r2
            r2 = 49
            if (r14 > r2) goto L_0x0246
            long r2 = (long) r15
            r30 = r21
            r31 = r9
            r32 = r11
            r33 = r14
            r34 = r2
            r36 = r0
            r23 = r8
            r24 = r7
            r25 = r5
            r26 = r6
            r27 = r4
            r29 = r13
            int r9 = r23.A04(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36)
        L_0x0241:
            if (r9 != r4) goto L_0x0296
            r4 = r9
            goto L_0x003d
        L_0x0246:
            r2 = 50
            if (r14 != r2) goto L_0x0260
            r2 = 2
            if (r9 != r2) goto L_0x003d
            r23 = r8
            r24 = r7
            r25 = r5
            r26 = r6
            r27 = r4
            r29 = r11
            r30 = r0
            int r9 = r23.A05(r24, r25, r26, r27, r28, r29, r30)
            goto L_0x0241
        L_0x0260:
            r30 = r21
            r31 = r9
            r32 = r15
            r33 = r14
            r34 = r11
            r35 = r0
            r23 = r8
            r24 = r7
            r25 = r5
            r26 = r6
            r27 = r4
            r29 = r13
            int r9 = r23.A03(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x0241
        L_0x027d:
            if (r9 != 0) goto L_0x003d
            int r9 = X.SU4.A06(r7, r6, r4)
            long r2 = r7.A01
            long r2 = X.Pxg.A0D(r2)
        L_0x0289:
            r22 = r12
            r23 = r5
            r24 = r0
            r26 = r2
            r22.putLong(r23, r24, r26)
        L_0x0294:
            r10 = r10 | r16
        L_0x0296:
            r1 = r21
            r2 = r18
            goto L_0x000d
        L_0x029c:
            int r11 = r8.A00(r0)
            goto L_0x0037
        L_0x02a2:
            r0 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0049
        L_0x02a7:
            if (r2 == 0) goto L_0x02af
            X.SJn r2 = (X.C11289SJn) r2
            X.R5b r5 = (X.R5b) r5
            r5.unknownFields = r2
        L_0x02af:
            r0 = r28
            if (r44 != 0) goto L_0x02b6
            if (r9 != r0) goto L_0x02bd
            return r9
        L_0x02b6:
            if (r9 > r0) goto L_0x02bd
            r0 = r22
            if (r13 != r0) goto L_0x02bd
            return r9
        L_0x02bd:
            java.lang.String r0 = "Failed to parse the message."
            X.5I7 r0 = X.Pxg.A0T(r0)
            throw r0
        L_0x02c4:
            X.5I7 r0 = X.AnonymousClass5I7.A01()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T5N.A0Q(X.SFF, java.lang.Object, byte[], int, int, int):int");
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
            int[] r7 = r10.A04
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
            boolean r3 = r10.A0O(r5, r11)
            boolean r2 = r10.A0O(r5, r12)
            if (r3 != r2) goto L_0x00dd
            X.SK5 r8 = com.google.protobuf.UnsafeUtil.A02
            double r2 = r8.A03(r11, r0)
            long r3 = java.lang.Double.doubleToLongBits(r2)
            double r0 = r8.A03(r12, r0)
            long r1 = java.lang.Double.doubleToLongBits(r0)
            goto L_0x0067
        L_0x0036:
            boolean r3 = r10.A0O(r5, r11)
            boolean r2 = r10.A0O(r5, r12)
            if (r3 != r2) goto L_0x00dd
            X.SK5 r4 = com.google.protobuf.UnsafeUtil.A02
            float r2 = r4.A04(r11, r0)
            int r3 = java.lang.Float.floatToIntBits(r2)
            float r0 = r4.A04(r12, r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x0095
        L_0x0053:
            boolean r3 = r10.A0O(r5, r11)
            boolean r2 = r10.A0O(r5, r12)
            if (r3 != r2) goto L_0x00dd
            X.SK5 r2 = com.google.protobuf.UnsafeUtil.A02
            long r3 = r2.A07(r11, r0)
            long r1 = r2.A07(r12, r0)
        L_0x0067:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00dd
            goto L_0x0016
        L_0x006c:
            boolean r3 = r10.A0O(r5, r11)
            boolean r2 = r10.A0O(r5, r12)
            if (r3 != r2) goto L_0x00dd
            X.SK5 r2 = com.google.protobuf.UnsafeUtil.A02
            int r3 = r2.A06(r11, r0)
            int r0 = r2.A06(r12, r0)
            goto L_0x0095
        L_0x0081:
            boolean r3 = r10.A0O(r5, r11)
            boolean r2 = r10.A0O(r5, r12)
            if (r3 != r2) goto L_0x00dd
            X.SK5 r2 = com.google.protobuf.UnsafeUtil.A02
            boolean r3 = r2.A0L(r11, r0)
            boolean r0 = r2.A0L(r12, r0)
        L_0x0095:
            if (r3 != r0) goto L_0x00dd
            goto L_0x0016
        L_0x0099:
            boolean r8 = r10.A0O(r5, r11)
            boolean r2 = r10.A0O(r5, r12)
            goto L_0x00b4
        L_0x00a2:
            int r2 = r5 + 2
            r2 = r7[r2]
            long r2 = X.Pxe.A0B(r2)
            X.SK5 r4 = com.google.protobuf.UnsafeUtil.A02
            int r8 = r4.A06(r11, r2)
            int r2 = r4.A06(r12, r2)
        L_0x00b4:
            if (r8 != r2) goto L_0x00dd
        L_0x00b6:
            X.SK5 r3 = com.google.protobuf.UnsafeUtil.A02
            java.lang.Object r2 = r3.A09(r11, r0)
            java.lang.Object r1 = r3.A09(r12, r0)
            X.Rzu r0 = X.C11433SUe.A02
            if (r2 == r1) goto L_0x0016
            if (r2 == 0) goto L_0x00dd
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x00dd
            goto L_0x0016
        L_0x00ce:
            X.R5b r11 = (X.R5b) r11
            X.SJn r1 = r11.unknownFields
            X.R5b r12 = (X.R5b) r12
            X.SJn r0 = r12.unknownFields
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00dd
            r9 = 1
        L_0x00dd:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T5N.ASr(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0288, code lost:
        if (r0 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x028a, code lost:
        r12 = X.SQE.A05(r6) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0296, code lost:
        if (r0 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0298, code lost:
        r12 = X.SQE.A05(r6) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02b6, code lost:
        r1 = com.google.protobuf.CodedOutputStream.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02d8, code lost:
        if (r7 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02da, code lost:
        r7 = (X.T5J) X.SK5.A00(r3, r0);
        r1 = A0D(r2);
        r0 = com.google.protobuf.CodedOutputStream.A02;
        r12 = (X.SQE.A05(r6) * 2) + X.T5J.A0D(r1, r7, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0438, code lost:
        r1 = r1 * r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0439, code lost:
        r12 = r12 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04b1, code lost:
        if (r0 >= 0) goto L_0x0852;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        if (r0 >= 0) goto L_0x02b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x04f3, code lost:
        if (r0 >= 0) goto L_0x0852;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x063c, code lost:
        r8 = r8 * r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x06aa, code lost:
        if (r1 <= 0) goto L_0x0476;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x06ac, code lost:
        r13 = (X.SQE.A05(r7) + com.google.protobuf.CodedOutputStream.A00(r1)) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x06fe, code lost:
        if (r0 == false) goto L_0x0476;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0700, code lost:
        r13 = X.SQE.A05(r7) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x070c, code lost:
        if (r0 == false) goto L_0x0476;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x070e, code lost:
        r13 = X.SQE.A05(r7) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0723, code lost:
        r0 = X.AnonymousClass7TE.A0R(X.SK5.A00(r3, r0));
        r13 = X.SQE.A05(r7);
        r8 = com.google.protobuf.CodedOutputStream.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0747, code lost:
        if (r0 >= 0) goto L_0x0852;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x074f, code lost:
        if (r0 == false) goto L_0x0476;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0751, code lost:
        r13 = X.SQE.A05(r7) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x076b, code lost:
        if (r0 == false) goto L_0x0476;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x076d, code lost:
        r13 = X.SQE.A05(r7) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0779, code lost:
        if (r8 == false) goto L_0x0476;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x077b, code lost:
        r1 = r6.getObject(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0781, code lost:
        if ((r1 instanceof X.TAP) == false) goto L_0x0797;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0783, code lost:
        r0 = com.google.protobuf.CodedOutputStream.A02;
        r13 = X.SQE.A05(r7);
        r1 = ((X.TAP) r1).A02();
        r13 = r13 + (com.google.protobuf.CodedOutputStream.A00(r1) + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0797, code lost:
        r13 = X.SQE.A05(r7);
        r8 = com.google.protobuf.CodedOutputStream.A02((java.lang.String) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x07bd, code lost:
        if (r8 == false) goto L_0x0476;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x07bf, code lost:
        r8 = r6.getObject(r3, r0);
        r1 = A0D(r5);
        r0 = X.C11433SUe.A02;
        r8 = (X.T5J) r8;
        r13 = X.SQE.A05(r7);
        r0 = X.T5J.A0D(r1, r8, r8);
        r8 = com.google.protobuf.CodedOutputStream.A00(r0) + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x07dd, code lost:
        if (r8 == false) goto L_0x0476;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x07df, code lost:
        r0 = com.google.protobuf.CodedOutputStream.A02;
        r13 = X.SQE.A05(r7);
        r1 = ((X.TAP) r6.getObject(r3, r0)).A02();
        r13 = r13 + (com.google.protobuf.CodedOutputStream.A00(r1) + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x081c, code lost:
        if (r0 >= 0) goto L_0x0852;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x081f, code lost:
        r8 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0826, code lost:
        if (r0 == false) goto L_0x0476;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0828, code lost:
        r13 = X.SQE.A05(r7) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0833, code lost:
        if (r0 == false) goto L_0x0476;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0835, code lost:
        r13 = X.SQE.A05(r7) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0852, code lost:
        r8 = com.google.protobuf.CodedOutputStream.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0856, code lost:
        r13 = r13 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0873, code lost:
        if (r8 == false) goto L_0x0476;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0875, code lost:
        r8 = (X.T5J) r6.getObject(r3, r0);
        r1 = A0D(r5);
        r0 = com.google.protobuf.CodedOutputStream.A02;
        r13 = (X.SQE.A05(r7) * 2) + X.T5J.A0D(r1, r8, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00be, code lost:
        if (r0 >= 0) goto L_0x02b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0155, code lost:
        if (r1 <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0157, code lost:
        r12 = (X.SQE.A05(r6) + com.google.protobuf.CodedOutputStream.A00(r1)) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0167, code lost:
        if (r0 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0169, code lost:
        r12 = X.SQE.A05(r6) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0175, code lost:
        if (r0 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0177, code lost:
        r12 = X.SQE.A05(r6) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x018c, code lost:
        r0 = X.AnonymousClass7TE.A0R(X.SK5.A00(r3, r0));
        r12 = X.SQE.A05(r6);
        r1 = com.google.protobuf.CodedOutputStream.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01b0, code lost:
        if (r0 >= 0) goto L_0x02b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b8, code lost:
        if (r0 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ba, code lost:
        r12 = X.SQE.A05(r6) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01c6, code lost:
        if (r0 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c8, code lost:
        r12 = X.SQE.A05(r6) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01d4, code lost:
        if (r0 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d6, code lost:
        r12 = X.SQE.A05(r6) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01e2, code lost:
        if (r7 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01e4, code lost:
        r1 = X.SK5.A00(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ea, code lost:
        if ((r1 instanceof X.TAP) == false) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ec, code lost:
        r0 = com.google.protobuf.CodedOutputStream.A02;
        r12 = X.SQE.A05(r6);
        r1 = ((X.TAP) r1).A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f9, code lost:
        r12 = X.SQE.A05(r6);
        r1 = com.google.protobuf.CodedOutputStream.A02((java.lang.String) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0223, code lost:
        if (r7 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0225, code lost:
        r7 = X.SK5.A00(r3, r0);
        r1 = A0D(r2);
        r0 = X.C11433SUe.A02;
        r7 = (X.T5J) r7;
        r12 = X.SQE.A05(r6);
        r1 = X.T5J.A0D(r1, r7, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x023e, code lost:
        if (r7 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0240, code lost:
        r0 = com.google.protobuf.CodedOutputStream.A02;
        r12 = X.SQE.A05(r6);
        r1 = ((X.TAP) X.SK5.A00(r3, r0)).A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0250, code lost:
        r12 = r12 + (com.google.protobuf.CodedOutputStream.A00(r1) + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x027d, code lost:
        if (r0 >= 0) goto L_0x02b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0280, code lost:
        r1 = 10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int Bsa(java.lang.Object r18) {
        /*
            r17 = this;
            r3 = r18
            r4 = r17
            boolean r0 = r4.A0E
            if (r0 == 0) goto L_0x0440
            sun.misc.Unsafe r5 = A0F
            r2 = 0
            r16 = 0
        L_0x000d:
            int[] r1 = r4.A04
            int r0 = r1.length
            if (r2 >= r0) goto L_0x0893
            int r0 = r2 + 1
            r0 = r1[r0]
            int r8 = X.Pxe.A03(r0)
            r6 = r1[r2]
            long r0 = X.Pxe.A0B(r0)
            X.XR1[] r7 = X.XR1.A01
            switch(r8) {
                case 0: goto L_0x0028;
                case 1: goto L_0x002e;
                case 2: goto L_0x0034;
                case 3: goto L_0x004a;
                case 4: goto L_0x0060;
                case 5: goto L_0x0074;
                case 6: goto L_0x007a;
                case 7: goto L_0x0080;
                case 8: goto L_0x0086;
                case 9: goto L_0x008c;
                case 10: goto L_0x0092;
                case 11: goto L_0x0098;
                case 12: goto L_0x00ae;
                case 13: goto L_0x00c2;
                case 14: goto L_0x00c8;
                case 15: goto L_0x0205;
                case 16: goto L_0x00ce;
                case 17: goto L_0x00e4;
                case 18: goto L_0x0305;
                case 19: goto L_0x0316;
                case 20: goto L_0x0328;
                case 21: goto L_0x0340;
                case 22: goto L_0x0354;
                case 23: goto L_0x0305;
                case 24: goto L_0x0316;
                case 25: goto L_0x0368;
                case 26: goto L_0x037c;
                case 27: goto L_0x0388;
                case 28: goto L_0x03b5;
                case 29: goto L_0x03c0;
                case 30: goto L_0x03d3;
                case 31: goto L_0x0316;
                case 32: goto L_0x0305;
                case 33: goto L_0x03e6;
                case 34: goto L_0x0426;
                case 35: goto L_0x00ea;
                case 36: goto L_0x00f5;
                case 37: goto L_0x0100;
                case 38: goto L_0x010b;
                case 39: goto L_0x0116;
                case 40: goto L_0x00ea;
                case 41: goto L_0x00f5;
                case 42: goto L_0x0121;
                case 43: goto L_0x012a;
                case 44: goto L_0x0135;
                case 45: goto L_0x00f5;
                case 46: goto L_0x00ea;
                case 47: goto L_0x0140;
                case 48: goto L_0x014b;
                case 49: goto L_0x03f9;
                case 50: goto L_0x02f3;
                case 51: goto L_0x0163;
                case 52: goto L_0x0171;
                case 53: goto L_0x017f;
                case 54: goto L_0x0186;
                case 55: goto L_0x019e;
                case 56: goto L_0x01b4;
                case 57: goto L_0x01c2;
                case 58: goto L_0x01d0;
                case 59: goto L_0x01de;
                case 60: goto L_0x021f;
                case 61: goto L_0x023a;
                case 62: goto L_0x0258;
                case 63: goto L_0x026b;
                case 64: goto L_0x0284;
                case 65: goto L_0x0292;
                case 66: goto L_0x02a0;
                case 67: goto L_0x02bc;
                case 68: goto L_0x02d4;
                default: goto L_0x0025;
            }
        L_0x0025:
            int r2 = r2 + 3
            goto L_0x000d
        L_0x0028:
            boolean r0 = r4.A0O(r2, r3)
            goto L_0x0167
        L_0x002e:
            boolean r0 = r4.A0O(r2, r3)
            goto L_0x0175
        L_0x0034:
            boolean r7 = r4.A0O(r2, r3)
            if (r7 == 0) goto L_0x0025
            X.SK5 r7 = com.google.protobuf.UnsafeUtil.A02
            long r0 = r7.A07(r3, r0)
            int r12 = X.SQE.A05(r6)
            int r1 = com.google.protobuf.CodedOutputStream.A01(r0)
            goto L_0x0439
        L_0x004a:
            boolean r7 = r4.A0O(r2, r3)
            if (r7 == 0) goto L_0x0025
            X.SK5 r7 = com.google.protobuf.UnsafeUtil.A02
            long r0 = r7.A07(r3, r0)
            int r12 = X.SQE.A05(r6)
            int r1 = com.google.protobuf.CodedOutputStream.A01(r0)
            goto L_0x0439
        L_0x0060:
            boolean r7 = r4.A0O(r2, r3)
            if (r7 == 0) goto L_0x0025
            X.SK5 r7 = com.google.protobuf.UnsafeUtil.A02
            int r0 = r7.A06(r3, r0)
            int r12 = X.SQE.A05(r6)
            if (r0 < 0) goto L_0x0280
            goto L_0x02b6
        L_0x0074:
            boolean r0 = r4.A0O(r2, r3)
            goto L_0x01b8
        L_0x007a:
            boolean r0 = r4.A0O(r2, r3)
            goto L_0x01c6
        L_0x0080:
            boolean r0 = r4.A0O(r2, r3)
            goto L_0x01d4
        L_0x0086:
            boolean r7 = r4.A0O(r2, r3)
            goto L_0x01e2
        L_0x008c:
            boolean r7 = r4.A0O(r2, r3)
            goto L_0x0223
        L_0x0092:
            boolean r7 = r4.A0O(r2, r3)
            goto L_0x023e
        L_0x0098:
            boolean r7 = r4.A0O(r2, r3)
            if (r7 == 0) goto L_0x0025
            X.SK5 r7 = com.google.protobuf.UnsafeUtil.A02
            int r0 = r7.A06(r3, r0)
            int r12 = X.SQE.A05(r6)
            int r1 = com.google.protobuf.CodedOutputStream.A00(r0)
            goto L_0x0439
        L_0x00ae:
            boolean r7 = r4.A0O(r2, r3)
            if (r7 == 0) goto L_0x0025
            X.SK5 r7 = com.google.protobuf.UnsafeUtil.A02
            int r0 = r7.A06(r3, r0)
            int r12 = X.SQE.A05(r6)
            if (r0 < 0) goto L_0x0280
            goto L_0x02b6
        L_0x00c2:
            boolean r0 = r4.A0O(r2, r3)
            goto L_0x0288
        L_0x00c8:
            boolean r0 = r4.A0O(r2, r3)
            goto L_0x0296
        L_0x00ce:
            boolean r7 = r4.A0O(r2, r3)
            if (r7 == 0) goto L_0x0025
            X.SK5 r7 = com.google.protobuf.UnsafeUtil.A02
            long r0 = r7.A07(r3, r0)
            int r6 = X.SQE.A05(r6)
            int r12 = X.SQE.A06(r0, r6)
            goto L_0x043a
        L_0x00e4:
            boolean r7 = r4.A0O(r2, r3)
            goto L_0x02d8
        L_0x00ea:
            java.lang.Object r0 = r5.getObject(r3, r0)
            int r0 = A06(r0)
            int r1 = r0 * 8
            goto L_0x0155
        L_0x00f5:
            java.lang.Object r0 = r5.getObject(r3, r0)
            int r0 = A06(r0)
            int r1 = r0 * 4
            goto L_0x0155
        L_0x0100:
            java.lang.Object r0 = r5.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C11433SUe.A02(r0)
            goto L_0x0155
        L_0x010b:
            java.lang.Object r0 = r5.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C11433SUe.A06(r0)
            goto L_0x0155
        L_0x0116:
            java.lang.Object r0 = r5.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C11433SUe.A01(r0)
            goto L_0x0155
        L_0x0121:
            java.lang.Object r0 = r5.getObject(r3, r0)
            int r1 = A06(r0)
            goto L_0x0155
        L_0x012a:
            java.lang.Object r0 = r5.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C11433SUe.A05(r0)
            goto L_0x0155
        L_0x0135:
            java.lang.Object r0 = r5.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C11433SUe.A00(r0)
            goto L_0x0155
        L_0x0140:
            java.lang.Object r0 = r5.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C11433SUe.A03(r0)
            goto L_0x0155
        L_0x014b:
            java.lang.Object r0 = r5.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C11433SUe.A04(r0)
        L_0x0155:
            if (r1 <= 0) goto L_0x0025
            int r12 = X.SQE.A05(r6)
            int r0 = com.google.protobuf.CodedOutputStream.A00(r1)
            int r12 = r12 + r0
            int r12 = r12 + r1
            goto L_0x043a
        L_0x0163:
            boolean r0 = r4.A0P(r3, r6, r2)
        L_0x0167:
            if (r0 == 0) goto L_0x0025
            int r0 = X.SQE.A05(r6)
            int r12 = r0 + 8
            goto L_0x043a
        L_0x0171:
            boolean r0 = r4.A0P(r3, r6, r2)
        L_0x0175:
            if (r0 == 0) goto L_0x0025
            int r0 = X.SQE.A05(r6)
            int r12 = r0 + 4
            goto L_0x043a
        L_0x017f:
            boolean r7 = r4.A0P(r3, r6, r2)
            if (r7 == 0) goto L_0x0025
            goto L_0x018c
        L_0x0186:
            boolean r7 = r4.A0P(r3, r6, r2)
            if (r7 == 0) goto L_0x0025
        L_0x018c:
            java.lang.Object r0 = X.SK5.A00(r3, r0)
            long r0 = X.AnonymousClass7TE.A0R(r0)
            int r12 = X.SQE.A05(r6)
            int r1 = com.google.protobuf.CodedOutputStream.A01(r0)
            goto L_0x0439
        L_0x019e:
            boolean r7 = r4.A0P(r3, r6, r2)
            if (r7 == 0) goto L_0x0025
            java.lang.Object r0 = X.SK5.A00(r3, r0)
            int r0 = X.AnonymousClass7TE.A0M(r0)
            int r12 = X.SQE.A05(r6)
            if (r0 < 0) goto L_0x0280
            goto L_0x02b6
        L_0x01b4:
            boolean r0 = r4.A0P(r3, r6, r2)
        L_0x01b8:
            if (r0 == 0) goto L_0x0025
            int r0 = X.SQE.A05(r6)
            int r12 = r0 + 8
            goto L_0x043a
        L_0x01c2:
            boolean r0 = r4.A0P(r3, r6, r2)
        L_0x01c6:
            if (r0 == 0) goto L_0x0025
            int r0 = X.SQE.A05(r6)
            int r12 = r0 + 4
            goto L_0x043a
        L_0x01d0:
            boolean r0 = r4.A0P(r3, r6, r2)
        L_0x01d4:
            if (r0 == 0) goto L_0x0025
            int r0 = X.SQE.A05(r6)
            int r12 = r0 + 1
            goto L_0x043a
        L_0x01de:
            boolean r7 = r4.A0P(r3, r6, r2)
        L_0x01e2:
            if (r7 == 0) goto L_0x0025
            java.lang.Object r1 = X.SK5.A00(r3, r0)
            boolean r0 = r1 instanceof X.TAP
            if (r0 == 0) goto L_0x01f9
            X.TAP r1 = (X.TAP) r1
            boolean r0 = com.google.protobuf.CodedOutputStream.A02
            int r12 = X.SQE.A05(r6)
            int r1 = r1.A02()
            goto L_0x0250
        L_0x01f9:
            java.lang.String r1 = (java.lang.String) r1
            int r12 = X.SQE.A05(r6)
            int r1 = com.google.protobuf.CodedOutputStream.A02(r1)
            goto L_0x0439
        L_0x0205:
            boolean r7 = r4.A0O(r2, r3)
            if (r7 == 0) goto L_0x0025
            X.SK5 r7 = com.google.protobuf.UnsafeUtil.A02
            int r0 = r7.A06(r3, r0)
            int r12 = X.SQE.A05(r6)
            int r0 = X.Pxe.A02(r0)
            int r1 = com.google.protobuf.CodedOutputStream.A00(r0)
            goto L_0x0439
        L_0x021f:
            boolean r7 = r4.A0P(r3, r6, r2)
        L_0x0223:
            if (r7 == 0) goto L_0x0025
            java.lang.Object r7 = X.SK5.A00(r3, r0)
            X.TjQ r1 = r4.A0D(r2)
            X.Rzu r0 = X.C11433SUe.A02
            X.T5J r7 = (X.T5J) r7
            int r12 = X.SQE.A05(r6)
            int r1 = X.T5J.A0D(r1, r7, r7)
            goto L_0x0250
        L_0x023a:
            boolean r7 = r4.A0P(r3, r6, r2)
        L_0x023e:
            if (r7 == 0) goto L_0x0025
            java.lang.Object r1 = X.SK5.A00(r3, r0)
            X.TAP r1 = (X.TAP) r1
            boolean r0 = com.google.protobuf.CodedOutputStream.A02
            int r12 = X.SQE.A05(r6)
            int r1 = r1.A02()
        L_0x0250:
            int r0 = com.google.protobuf.CodedOutputStream.A00(r1)
            int r0 = r0 + r1
            int r12 = r12 + r0
            goto L_0x043a
        L_0x0258:
            boolean r7 = r4.A0P(r3, r6, r2)
            if (r7 == 0) goto L_0x0025
            java.lang.Object r0 = X.SK5.A00(r3, r0)
            int r0 = X.AnonymousClass7TE.A0M(r0)
            int r12 = X.SQE.A05(r6)
            goto L_0x02b6
        L_0x026b:
            boolean r7 = r4.A0P(r3, r6, r2)
            if (r7 == 0) goto L_0x0025
            java.lang.Object r0 = X.SK5.A00(r3, r0)
            int r0 = X.AnonymousClass7TE.A0M(r0)
            int r12 = X.SQE.A05(r6)
            if (r0 < 0) goto L_0x0280
            goto L_0x02b6
        L_0x0280:
            r1 = 10
            goto L_0x0439
        L_0x0284:
            boolean r0 = r4.A0P(r3, r6, r2)
        L_0x0288:
            if (r0 == 0) goto L_0x0025
            int r0 = X.SQE.A05(r6)
            int r12 = r0 + 4
            goto L_0x043a
        L_0x0292:
            boolean r0 = r4.A0P(r3, r6, r2)
        L_0x0296:
            if (r0 == 0) goto L_0x0025
            int r0 = X.SQE.A05(r6)
            int r12 = r0 + 8
            goto L_0x043a
        L_0x02a0:
            boolean r7 = r4.A0P(r3, r6, r2)
            if (r7 == 0) goto L_0x0025
            java.lang.Object r0 = X.SK5.A00(r3, r0)
            int r0 = X.AnonymousClass7TE.A0M(r0)
            int r12 = X.SQE.A05(r6)
            int r0 = X.Pxe.A02(r0)
        L_0x02b6:
            int r1 = com.google.protobuf.CodedOutputStream.A00(r0)
            goto L_0x0439
        L_0x02bc:
            boolean r7 = r4.A0P(r3, r6, r2)
            if (r7 == 0) goto L_0x0025
            java.lang.Object r0 = X.SK5.A00(r3, r0)
            long r0 = X.AnonymousClass7TE.A0R(r0)
            int r6 = X.SQE.A05(r6)
            int r12 = X.SQE.A06(r0, r6)
            goto L_0x043a
        L_0x02d4:
            boolean r7 = r4.A0P(r3, r6, r2)
        L_0x02d8:
            if (r7 == 0) goto L_0x0025
            java.lang.Object r7 = X.SK5.A00(r3, r0)
            X.T5J r7 = (X.T5J) r7
            X.TjQ r1 = r4.A0D(r2)
            boolean r0 = com.google.protobuf.CodedOutputStream.A02
            int r0 = X.SQE.A05(r6)
            int r12 = r0 * 2
            int r0 = X.T5J.A0D(r1, r7, r7)
            int r12 = r12 + r0
            goto L_0x043a
        L_0x02f3:
            java.lang.Object r7 = X.SK5.A00(r3, r0)
            java.lang.Object[] r1 = r4.A06
            int r0 = r2 / 3
            int r0 = r0 * 2
            r0 = r1[r0]
            int r12 = X.C11309SKx.A00(r6, r7, r0)
            goto L_0x043a
        L_0x0305:
            java.util.List r0 = A0K(r3, r0)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x043e
            int r0 = X.SQE.A05(r6)
            int r0 = r0 + 8
            goto L_0x0378
        L_0x0316:
            java.util.List r0 = A0K(r3, r0)
            int r1 = r0.size()
            r12 = 0
            if (r1 == 0) goto L_0x043a
            int r0 = X.SQE.A05(r6)
            int r0 = r0 + 4
            goto L_0x0378
        L_0x0328:
            java.util.List r1 = A0K(r3, r0)
            int r0 = r1.size()
            if (r0 == 0) goto L_0x043e
            int r12 = X.C11433SUe.A02(r1)
            int r1 = r1.size()
            int r0 = X.SQE.A05(r6)
            goto L_0x0438
        L_0x0340:
            java.util.List r0 = A0K(r3, r0)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x043e
            int r12 = X.C11433SUe.A06(r0)
            int r0 = X.SQE.A05(r6)
            goto L_0x0438
        L_0x0354:
            java.util.List r0 = A0K(r3, r0)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x043e
            int r12 = X.C11433SUe.A01(r0)
            int r0 = X.SQE.A05(r6)
            goto L_0x0438
        L_0x0368:
            java.util.List r0 = A0K(r3, r0)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x043e
            int r0 = X.SQE.A05(r6)
            int r0 = r0 + 1
        L_0x0378:
            int r12 = r1 * r0
            goto L_0x043a
        L_0x037c:
            java.lang.Object r0 = X.SK5.A00(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r12 = X.C11433SUe.A08(r0, r6)
            goto L_0x043a
        L_0x0388:
            java.lang.Object r10 = X.SK5.A00(r3, r0)
            java.util.List r10 = (java.util.List) r10
            X.TjQ r9 = r4.A0D(r2)
            X.Rzu r0 = X.C11433SUe.A02
            int r8 = r10.size()
            r7 = 0
            if (r8 == 0) goto L_0x043e
            int r12 = X.SQE.A05(r6)
            int r12 = r12 * r8
        L_0x03a0:
            if (r7 >= r8) goto L_0x043a
            java.lang.Object r0 = r10.get(r7)
            X.T5J r0 = (X.T5J) r0
            int r1 = X.T5J.A0D(r9, r0, r0)
            int r0 = com.google.protobuf.CodedOutputStream.A00(r1)
            int r0 = r0 + r1
            int r12 = r12 + r0
            int r7 = r7 + 1
            goto L_0x03a0
        L_0x03b5:
            java.lang.Object r0 = X.SK5.A00(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r12 = X.C11433SUe.A07(r0, r6)
            goto L_0x043a
        L_0x03c0:
            java.util.List r0 = A0K(r3, r0)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x043e
            int r12 = X.C11433SUe.A05(r0)
            int r0 = X.SQE.A05(r6)
            goto L_0x0438
        L_0x03d3:
            java.util.List r0 = A0K(r3, r0)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x043e
            int r12 = X.C11433SUe.A00(r0)
            int r0 = X.SQE.A05(r6)
            goto L_0x0438
        L_0x03e6:
            java.util.List r0 = A0K(r3, r0)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x043e
            int r12 = X.C11433SUe.A03(r0)
            int r0 = X.SQE.A05(r6)
            goto L_0x0438
        L_0x03f9:
            java.lang.Object r11 = X.SK5.A00(r3, r0)
            java.util.List r11 = (java.util.List) r11
            X.TjQ r10 = r4.A0D(r2)
            X.Rzu r0 = X.C11433SUe.A02
            int r9 = r11.size()
            r8 = 0
            if (r9 == 0) goto L_0x043e
            r12 = 0
        L_0x040d:
            if (r8 >= r9) goto L_0x043a
            java.lang.Object r7 = r11.get(r8)
            X.T5J r7 = (X.T5J) r7
            boolean r0 = com.google.protobuf.CodedOutputStream.A02
            int r0 = X.SQE.A05(r6)
            int r1 = r0 * 2
            int r0 = X.T5J.A0D(r10, r7, r7)
            int r1 = r1 + r0
            int r12 = r12 + r1
            int r8 = r8 + 1
            goto L_0x040d
        L_0x0426:
            java.util.List r0 = A0K(r3, r0)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x043e
            int r12 = X.C11433SUe.A04(r0)
            int r0 = X.SQE.A05(r6)
        L_0x0438:
            int r1 = r1 * r0
        L_0x0439:
            int r12 = r12 + r1
        L_0x043a:
            int r16 = r16 + r12
            goto L_0x0025
        L_0x043e:
            r12 = 0
            goto L_0x043a
        L_0x0440:
            sun.misc.Unsafe r6 = A0F
            r15 = 1048575(0xfffff, float:1.469367E-39)
            r5 = 0
            r16 = 0
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r14 = 0
        L_0x044c:
            int[] r1 = r4.A04
            int r0 = r1.length
            if (r5 >= r0) goto L_0x0893
            int r0 = r5 + 1
            r11 = r1[r0]
            r7 = r1[r5]
            int r10 = X.Pxe.A03(r11)
            r0 = 17
            r9 = 1
            if (r10 > r0) goto L_0x0890
            int r0 = r5 + 2
            r0 = r1[r0]
            r8 = r0 & r15
            int r0 = r0 >>> 20
            int r9 = r9 << r0
            if (r8 == r2) goto L_0x0471
            long r0 = (long) r8
            int r14 = r6.getInt(r3, r0)
            r2 = r8
        L_0x0471:
            r11 = r11 & r15
            long r0 = (long) r11
            switch(r10) {
                case 0: goto L_0x0479;
                case 1: goto L_0x047d;
                case 2: goto L_0x0481;
                case 3: goto L_0x0493;
                case 4: goto L_0x04a5;
                case 5: goto L_0x04b5;
                case 6: goto L_0x04b9;
                case 7: goto L_0x04c5;
                case 8: goto L_0x04c9;
                case 9: goto L_0x04cd;
                case 10: goto L_0x04d1;
                case 11: goto L_0x04d5;
                case 12: goto L_0x04e7;
                case 13: goto L_0x04f7;
                case 14: goto L_0x04fb;
                case 15: goto L_0x07a3;
                case 16: goto L_0x04ff;
                case 17: goto L_0x0511;
                case 18: goto L_0x0515;
                case 19: goto L_0x0528;
                case 20: goto L_0x053d;
                case 21: goto L_0x0559;
                case 22: goto L_0x0571;
                case 23: goto L_0x0515;
                case 24: goto L_0x0528;
                case 25: goto L_0x0589;
                case 26: goto L_0x059c;
                case 27: goto L_0x05a8;
                case 28: goto L_0x05d5;
                case 29: goto L_0x05e1;
                case 30: goto L_0x05f8;
                case 31: goto L_0x0528;
                case 32: goto L_0x0515;
                case 33: goto L_0x060f;
                case 34: goto L_0x0626;
                case 35: goto L_0x063f;
                case 36: goto L_0x064a;
                case 37: goto L_0x0655;
                case 38: goto L_0x0660;
                case 39: goto L_0x066b;
                case 40: goto L_0x063f;
                case 41: goto L_0x064a;
                case 42: goto L_0x0676;
                case 43: goto L_0x067f;
                case 44: goto L_0x068a;
                case 45: goto L_0x064a;
                case 46: goto L_0x063f;
                case 47: goto L_0x0695;
                case 48: goto L_0x06a0;
                case 49: goto L_0x06b8;
                case 50: goto L_0x06e8;
                case 51: goto L_0x06fa;
                case 52: goto L_0x0708;
                case 53: goto L_0x0716;
                case 54: goto L_0x071d;
                case 55: goto L_0x0735;
                case 56: goto L_0x074b;
                case 57: goto L_0x0759;
                case 58: goto L_0x0767;
                case 59: goto L_0x0775;
                case 60: goto L_0x07b9;
                case 61: goto L_0x07d9;
                case 62: goto L_0x07f7;
                case 63: goto L_0x080a;
                case 64: goto L_0x0822;
                case 65: goto L_0x082f;
                case 66: goto L_0x083c;
                case 67: goto L_0x0858;
                case 68: goto L_0x086f;
                default: goto L_0x0476;
            }
        L_0x0476:
            int r5 = r5 + 3
            goto L_0x044c
        L_0x0479:
            r0 = r14 & r9
            goto L_0x06fe
        L_0x047d:
            r0 = r14 & r9
            goto L_0x070c
        L_0x0481:
            r8 = r14 & r9
            if (r8 == 0) goto L_0x0476
            long r0 = r6.getLong(r3, r0)
            int r13 = X.SQE.A05(r7)
            int r8 = com.google.protobuf.CodedOutputStream.A01(r0)
            goto L_0x0856
        L_0x0493:
            r8 = r14 & r9
            if (r8 == 0) goto L_0x0476
            long r0 = r6.getLong(r3, r0)
            int r13 = X.SQE.A05(r7)
            int r8 = com.google.protobuf.CodedOutputStream.A01(r0)
            goto L_0x0856
        L_0x04a5:
            r8 = r14 & r9
            if (r8 == 0) goto L_0x0476
            int r0 = r6.getInt(r3, r0)
            int r13 = X.SQE.A05(r7)
            if (r0 < 0) goto L_0x081f
            goto L_0x0852
        L_0x04b5:
            r0 = r14 & r9
            goto L_0x074f
        L_0x04b9:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x0476
            int r0 = X.SQE.A05(r7)
            int r13 = r0 + 4
            goto L_0x088c
        L_0x04c5:
            r0 = r14 & r9
            goto L_0x076b
        L_0x04c9:
            r8 = r14 & r9
            goto L_0x0779
        L_0x04cd:
            r8 = r14 & r9
            goto L_0x07bd
        L_0x04d1:
            r8 = r14 & r9
            goto L_0x07dd
        L_0x04d5:
            r8 = r14 & r9
            if (r8 == 0) goto L_0x0476
            int r0 = r6.getInt(r3, r0)
            int r13 = X.SQE.A05(r7)
            int r8 = com.google.protobuf.CodedOutputStream.A00(r0)
            goto L_0x0856
        L_0x04e7:
            r8 = r14 & r9
            if (r8 == 0) goto L_0x0476
            int r0 = r6.getInt(r3, r0)
            int r13 = X.SQE.A05(r7)
            if (r0 < 0) goto L_0x081f
            goto L_0x0852
        L_0x04f7:
            r0 = r14 & r9
            goto L_0x0826
        L_0x04fb:
            r0 = r14 & r9
            goto L_0x0833
        L_0x04ff:
            r8 = r14 & r9
            if (r8 == 0) goto L_0x0476
            long r0 = r6.getLong(r3, r0)
            int r7 = X.SQE.A05(r7)
            int r13 = X.SQE.A06(r0, r7)
            goto L_0x088c
        L_0x0511:
            r8 = r14 & r9
            goto L_0x0873
        L_0x0515:
            java.lang.Object r0 = r6.getObject(r3, r0)
            int r13 = A06(r0)
            if (r13 == 0) goto L_0x06e5
            int r0 = X.SQE.A05(r7)
            int r0 = r0 + 8
            int r13 = r13 * r0
            goto L_0x088c
        L_0x0528:
            java.lang.Object r0 = r6.getObject(r3, r0)
            int r1 = A06(r0)
            r13 = 0
            if (r1 == 0) goto L_0x088c
            int r0 = X.SQE.A05(r7)
            int r0 = r0 + 4
            int r13 = r1 * r0
            goto L_0x088c
        L_0x053d:
            java.lang.Object r1 = r6.getObject(r3, r0)
            java.util.List r1 = (java.util.List) r1
            X.Rzu r0 = X.C11433SUe.A02
            int r0 = r1.size()
            if (r0 == 0) goto L_0x06e5
            int r13 = X.C11433SUe.A02(r1)
            int r8 = r1.size()
            int r0 = X.SQE.A05(r7)
            goto L_0x063c
        L_0x0559:
            java.lang.Object r1 = r6.getObject(r3, r0)
            java.util.List r1 = (java.util.List) r1
            X.Rzu r0 = X.C11433SUe.A02
            int r8 = r1.size()
            if (r8 == 0) goto L_0x06e5
            int r13 = X.C11433SUe.A06(r1)
            int r0 = X.SQE.A05(r7)
            goto L_0x063c
        L_0x0571:
            java.lang.Object r1 = r6.getObject(r3, r0)
            java.util.List r1 = (java.util.List) r1
            X.Rzu r0 = X.C11433SUe.A02
            int r8 = r1.size()
            if (r8 == 0) goto L_0x06e5
            int r13 = X.C11433SUe.A01(r1)
            int r0 = X.SQE.A05(r7)
            goto L_0x063c
        L_0x0589:
            java.lang.Object r0 = r6.getObject(r3, r0)
            int r13 = A06(r0)
            if (r13 == 0) goto L_0x06e5
            int r0 = X.SQE.A05(r7)
            int r0 = r0 + 1
            int r13 = r13 * r0
            goto L_0x088c
        L_0x059c:
            java.lang.Object r0 = r6.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r13 = X.C11433SUe.A08(r0, r7)
            goto L_0x088c
        L_0x05a8:
            java.lang.Object r11 = r6.getObject(r3, r0)
            java.util.List r11 = (java.util.List) r11
            X.TjQ r10 = r4.A0D(r5)
            X.Rzu r0 = X.C11433SUe.A02
            int r9 = r11.size()
            r8 = 0
            if (r9 == 0) goto L_0x06e5
            int r13 = X.SQE.A05(r7)
            int r13 = r13 * r9
        L_0x05c0:
            if (r8 >= r9) goto L_0x088c
            java.lang.Object r0 = r11.get(r8)
            X.T5J r0 = (X.T5J) r0
            int r1 = X.T5J.A0D(r10, r0, r0)
            int r0 = com.google.protobuf.CodedOutputStream.A00(r1)
            int r0 = r0 + r1
            int r13 = r13 + r0
            int r8 = r8 + 1
            goto L_0x05c0
        L_0x05d5:
            java.lang.Object r0 = r6.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r13 = X.C11433SUe.A07(r0, r7)
            goto L_0x088c
        L_0x05e1:
            java.lang.Object r1 = r6.getObject(r3, r0)
            java.util.List r1 = (java.util.List) r1
            X.Rzu r0 = X.C11433SUe.A02
            int r8 = r1.size()
            if (r8 == 0) goto L_0x06e5
            int r13 = X.C11433SUe.A05(r1)
            int r0 = X.SQE.A05(r7)
            goto L_0x063c
        L_0x05f8:
            java.lang.Object r1 = r6.getObject(r3, r0)
            java.util.List r1 = (java.util.List) r1
            X.Rzu r0 = X.C11433SUe.A02
            int r8 = r1.size()
            if (r8 == 0) goto L_0x06e5
            int r13 = X.C11433SUe.A00(r1)
            int r0 = X.SQE.A05(r7)
            goto L_0x063c
        L_0x060f:
            java.lang.Object r1 = r6.getObject(r3, r0)
            java.util.List r1 = (java.util.List) r1
            X.Rzu r0 = X.C11433SUe.A02
            int r8 = r1.size()
            if (r8 == 0) goto L_0x06e5
            int r13 = X.C11433SUe.A03(r1)
            int r0 = X.SQE.A05(r7)
            goto L_0x063c
        L_0x0626:
            java.lang.Object r1 = r6.getObject(r3, r0)
            java.util.List r1 = (java.util.List) r1
            X.Rzu r0 = X.C11433SUe.A02
            int r8 = r1.size()
            if (r8 == 0) goto L_0x06e5
            int r13 = X.C11433SUe.A04(r1)
            int r0 = X.SQE.A05(r7)
        L_0x063c:
            int r8 = r8 * r0
            goto L_0x0856
        L_0x063f:
            java.lang.Object r0 = r6.getObject(r3, r0)
            int r0 = A06(r0)
            int r1 = r0 * 8
            goto L_0x06aa
        L_0x064a:
            java.lang.Object r0 = r6.getObject(r3, r0)
            int r0 = A06(r0)
            int r1 = r0 * 4
            goto L_0x06aa
        L_0x0655:
            java.lang.Object r0 = r6.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C11433SUe.A02(r0)
            goto L_0x06aa
        L_0x0660:
            java.lang.Object r0 = r6.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C11433SUe.A06(r0)
            goto L_0x06aa
        L_0x066b:
            java.lang.Object r0 = r6.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C11433SUe.A01(r0)
            goto L_0x06aa
        L_0x0676:
            java.lang.Object r0 = r6.getObject(r3, r0)
            int r1 = A06(r0)
            goto L_0x06aa
        L_0x067f:
            java.lang.Object r0 = r6.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C11433SUe.A05(r0)
            goto L_0x06aa
        L_0x068a:
            java.lang.Object r0 = r6.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C11433SUe.A00(r0)
            goto L_0x06aa
        L_0x0695:
            java.lang.Object r0 = r6.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C11433SUe.A03(r0)
            goto L_0x06aa
        L_0x06a0:
            java.lang.Object r0 = r6.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C11433SUe.A04(r0)
        L_0x06aa:
            if (r1 <= 0) goto L_0x0476
            int r13 = X.SQE.A05(r7)
            int r0 = com.google.protobuf.CodedOutputStream.A00(r1)
            int r13 = r13 + r0
            int r13 = r13 + r1
            goto L_0x088c
        L_0x06b8:
            java.lang.Object r12 = r6.getObject(r3, r0)
            java.util.List r12 = (java.util.List) r12
            X.TjQ r11 = r4.A0D(r5)
            X.Rzu r0 = X.C11433SUe.A02
            int r10 = r12.size()
            r9 = 0
            if (r10 == 0) goto L_0x06e5
            r13 = 0
        L_0x06cc:
            if (r9 >= r10) goto L_0x088c
            java.lang.Object r8 = r12.get(r9)
            X.T5J r8 = (X.T5J) r8
            boolean r0 = com.google.protobuf.CodedOutputStream.A02
            int r0 = X.SQE.A05(r7)
            int r1 = r0 * 2
            int r0 = X.T5J.A0D(r11, r8, r8)
            int r1 = r1 + r0
            int r13 = r13 + r1
            int r9 = r9 + 1
            goto L_0x06cc
        L_0x06e5:
            r13 = 0
            goto L_0x088c
        L_0x06e8:
            java.lang.Object r8 = r6.getObject(r3, r0)
            java.lang.Object[] r1 = r4.A06
            int r0 = r5 / 3
            int r0 = r0 * 2
            r0 = r1[r0]
            int r13 = X.C11309SKx.A00(r7, r8, r0)
            goto L_0x088c
        L_0x06fa:
            boolean r0 = r4.A0P(r3, r7, r5)
        L_0x06fe:
            if (r0 == 0) goto L_0x0476
            int r0 = X.SQE.A05(r7)
            int r13 = r0 + 8
            goto L_0x088c
        L_0x0708:
            boolean r0 = r4.A0P(r3, r7, r5)
        L_0x070c:
            if (r0 == 0) goto L_0x0476
            int r0 = X.SQE.A05(r7)
            int r13 = r0 + 4
            goto L_0x088c
        L_0x0716:
            boolean r8 = r4.A0P(r3, r7, r5)
            if (r8 == 0) goto L_0x0476
            goto L_0x0723
        L_0x071d:
            boolean r8 = r4.A0P(r3, r7, r5)
            if (r8 == 0) goto L_0x0476
        L_0x0723:
            java.lang.Object r0 = X.SK5.A00(r3, r0)
            long r0 = X.AnonymousClass7TE.A0R(r0)
            int r13 = X.SQE.A05(r7)
            int r8 = com.google.protobuf.CodedOutputStream.A01(r0)
            goto L_0x0856
        L_0x0735:
            boolean r8 = r4.A0P(r3, r7, r5)
            if (r8 == 0) goto L_0x0476
            java.lang.Object r0 = X.SK5.A00(r3, r0)
            int r0 = X.AnonymousClass7TE.A0M(r0)
            int r13 = X.SQE.A05(r7)
            if (r0 < 0) goto L_0x081f
            goto L_0x0852
        L_0x074b:
            boolean r0 = r4.A0P(r3, r7, r5)
        L_0x074f:
            if (r0 == 0) goto L_0x0476
            int r0 = X.SQE.A05(r7)
            int r13 = r0 + 8
            goto L_0x088c
        L_0x0759:
            boolean r0 = r4.A0P(r3, r7, r5)
            if (r0 == 0) goto L_0x0476
            int r0 = X.SQE.A05(r7)
            int r13 = r0 + 4
            goto L_0x088c
        L_0x0767:
            boolean r0 = r4.A0P(r3, r7, r5)
        L_0x076b:
            if (r0 == 0) goto L_0x0476
            int r0 = X.SQE.A05(r7)
            int r13 = r0 + 1
            goto L_0x088c
        L_0x0775:
            boolean r8 = r4.A0P(r3, r7, r5)
        L_0x0779:
            if (r8 == 0) goto L_0x0476
            java.lang.Object r1 = r6.getObject(r3, r0)
            boolean r0 = r1 instanceof X.TAP
            if (r0 == 0) goto L_0x0797
            X.TAP r1 = (X.TAP) r1
            boolean r0 = com.google.protobuf.CodedOutputStream.A02
            int r13 = X.SQE.A05(r7)
            int r1 = r1.A02()
            int r0 = com.google.protobuf.CodedOutputStream.A00(r1)
            int r0 = r0 + r1
            int r13 = r13 + r0
            goto L_0x088c
        L_0x0797:
            java.lang.String r1 = (java.lang.String) r1
            int r13 = X.SQE.A05(r7)
            int r8 = com.google.protobuf.CodedOutputStream.A02(r1)
            goto L_0x0856
        L_0x07a3:
            r8 = r14 & r9
            if (r8 == 0) goto L_0x0476
            int r0 = r6.getInt(r3, r0)
            int r13 = X.SQE.A05(r7)
            int r0 = X.Pxe.A02(r0)
            int r8 = com.google.protobuf.CodedOutputStream.A00(r0)
            goto L_0x0856
        L_0x07b9:
            boolean r8 = r4.A0P(r3, r7, r5)
        L_0x07bd:
            if (r8 == 0) goto L_0x0476
            java.lang.Object r8 = r6.getObject(r3, r0)
            X.TjQ r1 = r4.A0D(r5)
            X.Rzu r0 = X.C11433SUe.A02
            X.T5J r8 = (X.T5J) r8
            int r13 = X.SQE.A05(r7)
            int r0 = X.T5J.A0D(r1, r8, r8)
            int r8 = com.google.protobuf.CodedOutputStream.A00(r0)
            int r8 = r8 + r0
            goto L_0x0856
        L_0x07d9:
            boolean r8 = r4.A0P(r3, r7, r5)
        L_0x07dd:
            if (r8 == 0) goto L_0x0476
            java.lang.Object r1 = r6.getObject(r3, r0)
            X.TAP r1 = (X.TAP) r1
            boolean r0 = com.google.protobuf.CodedOutputStream.A02
            int r13 = X.SQE.A05(r7)
            int r1 = r1.A02()
            int r0 = com.google.protobuf.CodedOutputStream.A00(r1)
            int r0 = r0 + r1
            int r13 = r13 + r0
            goto L_0x088c
        L_0x07f7:
            boolean r8 = r4.A0P(r3, r7, r5)
            if (r8 == 0) goto L_0x0476
            java.lang.Object r0 = X.SK5.A00(r3, r0)
            int r0 = X.AnonymousClass7TE.A0M(r0)
            int r13 = X.SQE.A05(r7)
            goto L_0x0852
        L_0x080a:
            boolean r8 = r4.A0P(r3, r7, r5)
            if (r8 == 0) goto L_0x0476
            java.lang.Object r0 = X.SK5.A00(r3, r0)
            int r0 = X.AnonymousClass7TE.A0M(r0)
            int r13 = X.SQE.A05(r7)
            if (r0 < 0) goto L_0x081f
            goto L_0x0852
        L_0x081f:
            r8 = 10
            goto L_0x0856
        L_0x0822:
            boolean r0 = r4.A0P(r3, r7, r5)
        L_0x0826:
            if (r0 == 0) goto L_0x0476
            int r0 = X.SQE.A05(r7)
            int r13 = r0 + 4
            goto L_0x088c
        L_0x082f:
            boolean r0 = r4.A0P(r3, r7, r5)
        L_0x0833:
            if (r0 == 0) goto L_0x0476
            int r0 = X.SQE.A05(r7)
            int r13 = r0 + 8
            goto L_0x088c
        L_0x083c:
            boolean r8 = r4.A0P(r3, r7, r5)
            if (r8 == 0) goto L_0x0476
            java.lang.Object r0 = X.SK5.A00(r3, r0)
            int r0 = X.AnonymousClass7TE.A0M(r0)
            int r13 = X.SQE.A05(r7)
            int r0 = X.Pxe.A02(r0)
        L_0x0852:
            int r8 = com.google.protobuf.CodedOutputStream.A00(r0)
        L_0x0856:
            int r13 = r13 + r8
            goto L_0x088c
        L_0x0858:
            boolean r8 = r4.A0P(r3, r7, r5)
            if (r8 == 0) goto L_0x0476
            java.lang.Object r0 = X.SK5.A00(r3, r0)
            long r0 = X.AnonymousClass7TE.A0R(r0)
            int r7 = X.SQE.A05(r7)
            int r13 = X.SQE.A06(r0, r7)
            goto L_0x088c
        L_0x086f:
            boolean r8 = r4.A0P(r3, r7, r5)
        L_0x0873:
            if (r8 == 0) goto L_0x0476
            java.lang.Object r8 = r6.getObject(r3, r0)
            X.T5J r8 = (X.T5J) r8
            X.TjQ r1 = r4.A0D(r5)
            boolean r0 = com.google.protobuf.CodedOutputStream.A02
            int r0 = X.SQE.A05(r7)
            int r13 = r0 * 2
            int r0 = X.T5J.A0D(r1, r8, r8)
            int r13 = r13 + r0
        L_0x088c:
            int r16 = r16 + r13
            goto L_0x0476
        L_0x0890:
            r9 = 0
            goto L_0x0471
        L_0x0893:
            X.R5b r3 = (X.R5b) r3
            X.SJn r0 = r3.unknownFields
            int r0 = r0.A00()
            int r16 = r16 + r0
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T5N.Bsa(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        r6 = r6 * 53;
        r0 = X.SK5.A00(r10, r1).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        r6 = r6 * 53;
        r0 = ((java.lang.String) X.SK5.A00(r10, r1)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ae, code lost:
        r0 = X.SD9.A04;
        r0 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b2, code lost:
        if (r1 == false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b4, code lost:
        r0 = 1231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d1, code lost:
        r0 = java.lang.Float.floatToIntBits(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00de, code lost:
        r1 = java.lang.Double.doubleToLongBits(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e2, code lost:
        r0 = X.SD9.A04;
        r0 = X.C51968G9o.A03(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e8, code lost:
        r6 = r6 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        r3 = r3 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int CL6(java.lang.Object r10) {
        /*
            r9 = this;
            int[] r5 = r9.A04
            int r4 = r5.length
            r3 = 0
            r6 = 0
        L_0x0005:
            if (r3 >= r4) goto L_0x00eb
            int r0 = r3 + 1
            r0 = r5[r0]
            r8 = r5[r3]
            long r1 = X.Pxe.A0B(r0)
            int r0 = X.Pxe.A03(r0)
            r7 = 37
            switch(r0) {
                case 0: goto L_0x00d6;
                case 1: goto L_0x00c9;
                case 2: goto L_0x00c0;
                case 3: goto L_0x00c0;
                case 4: goto L_0x00b7;
                case 5: goto L_0x00c0;
                case 6: goto L_0x00b7;
                case 7: goto L_0x00a6;
                case 8: goto L_0x0043;
                case 9: goto L_0x001d;
                case 10: goto L_0x0031;
                case 11: goto L_0x00b7;
                case 12: goto L_0x00b7;
                case 13: goto L_0x00b7;
                case 14: goto L_0x00c0;
                case 15: goto L_0x00b7;
                case 16: goto L_0x00c0;
                case 17: goto L_0x001d;
                case 18: goto L_0x0031;
                case 19: goto L_0x0031;
                case 20: goto L_0x0031;
                case 21: goto L_0x0031;
                case 22: goto L_0x0031;
                case 23: goto L_0x0031;
                case 24: goto L_0x0031;
                case 25: goto L_0x0031;
                case 26: goto L_0x0031;
                case 27: goto L_0x0031;
                case 28: goto L_0x0031;
                case 29: goto L_0x0031;
                case 30: goto L_0x0031;
                case 31: goto L_0x0031;
                case 32: goto L_0x0031;
                case 33: goto L_0x0031;
                case 34: goto L_0x0031;
                case 35: goto L_0x0031;
                case 36: goto L_0x0031;
                case 37: goto L_0x0031;
                case 38: goto L_0x0031;
                case 39: goto L_0x0031;
                case 40: goto L_0x0031;
                case 41: goto L_0x0031;
                case 42: goto L_0x0031;
                case 43: goto L_0x0031;
                case 44: goto L_0x0031;
                case 45: goto L_0x0031;
                case 46: goto L_0x0031;
                case 47: goto L_0x0031;
                case 48: goto L_0x0031;
                case 49: goto L_0x0031;
                case 50: goto L_0x0031;
                case 51: goto L_0x0095;
                case 52: goto L_0x0084;
                case 53: goto L_0x0073;
                case 54: goto L_0x0073;
                case 55: goto L_0x0062;
                case 56: goto L_0x0073;
                case 57: goto L_0x0062;
                case 58: goto L_0x0051;
                case 59: goto L_0x003d;
                case 60: goto L_0x002b;
                case 61: goto L_0x002b;
                case 62: goto L_0x0062;
                case 63: goto L_0x0062;
                case 64: goto L_0x0062;
                case 65: goto L_0x0073;
                case 66: goto L_0x0062;
                case 67: goto L_0x0073;
                case 68: goto L_0x002b;
                default: goto L_0x001a;
            }
        L_0x001a:
            int r3 = r3 + 3
            goto L_0x0005
        L_0x001d:
            java.lang.Object r0 = X.SK5.A00(r10, r1)
            if (r0 == 0) goto L_0x0027
            int r7 = r0.hashCode()
        L_0x0027:
            int r6 = r6 * 53
            int r6 = r6 + r7
            goto L_0x001a
        L_0x002b:
            boolean r0 = r9.A0P(r10, r8, r3)
            if (r0 == 0) goto L_0x001a
        L_0x0031:
            int r6 = r6 * 53
            java.lang.Object r0 = X.SK5.A00(r10, r1)
            int r0 = r0.hashCode()
            goto L_0x00e8
        L_0x003d:
            boolean r0 = r9.A0P(r10, r8, r3)
            if (r0 == 0) goto L_0x001a
        L_0x0043:
            int r6 = r6 * 53
            java.lang.Object r0 = X.SK5.A00(r10, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.hashCode()
            goto L_0x00e8
        L_0x0051:
            boolean r0 = r9.A0P(r10, r8, r3)
            if (r0 == 0) goto L_0x001a
            int r6 = r6 * 53
            java.lang.Object r0 = X.SK5.A00(r10, r1)
            boolean r1 = X.AnonymousClass7TE.A1a(r0)
            goto L_0x00ae
        L_0x0062:
            boolean r0 = r9.A0P(r10, r8, r3)
            if (r0 == 0) goto L_0x001a
            int r6 = r6 * 53
            java.lang.Object r0 = X.SK5.A00(r10, r1)
            int r0 = X.AnonymousClass7TE.A0M(r0)
            goto L_0x00e8
        L_0x0073:
            boolean r0 = r9.A0P(r10, r8, r3)
            if (r0 == 0) goto L_0x001a
            int r6 = r6 * 53
            java.lang.Object r0 = X.SK5.A00(r10, r1)
            long r1 = X.AnonymousClass7TE.A0R(r0)
            goto L_0x00e2
        L_0x0084:
            boolean r0 = r9.A0P(r10, r8, r3)
            if (r0 == 0) goto L_0x001a
            int r6 = r6 * 53
            java.lang.Object r0 = X.SK5.A00(r10, r1)
            float r0 = X.AnonymousClass7TE.A04(r0)
            goto L_0x00d1
        L_0x0095:
            boolean r0 = r9.A0P(r10, r8, r3)
            if (r0 == 0) goto L_0x001a
            int r6 = r6 * 53
            java.lang.Object r0 = X.SK5.A00(r10, r1)
            double r0 = X.JTO.A00(r0)
            goto L_0x00de
        L_0x00a6:
            int r6 = r6 * 53
            X.SK5 r0 = com.google.protobuf.UnsafeUtil.A02
            boolean r1 = r0.A0L(r10, r1)
        L_0x00ae:
            java.nio.charset.Charset r0 = X.SD9.A04
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x00e8
            r0 = 1231(0x4cf, float:1.725E-42)
            goto L_0x00e8
        L_0x00b7:
            int r6 = r6 * 53
            X.SK5 r0 = com.google.protobuf.UnsafeUtil.A02
            int r0 = r0.A06(r10, r1)
            goto L_0x00e8
        L_0x00c0:
            int r6 = r6 * 53
            X.SK5 r0 = com.google.protobuf.UnsafeUtil.A02
            long r1 = r0.A07(r10, r1)
            goto L_0x00e2
        L_0x00c9:
            int r6 = r6 * 53
            X.SK5 r0 = com.google.protobuf.UnsafeUtil.A02
            float r0 = r0.A04(r10, r1)
        L_0x00d1:
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x00e8
        L_0x00d6:
            int r6 = r6 * 53
            X.SK5 r0 = com.google.protobuf.UnsafeUtil.A02
            double r0 = r0.A03(r10, r1)
        L_0x00de:
            long r1 = java.lang.Double.doubleToLongBits(r0)
        L_0x00e2:
            java.nio.charset.Charset r0 = X.SD9.A04
            int r0 = X.C51968G9o.A03(r1)
        L_0x00e8:
            int r6 = r6 + r0
            goto L_0x001a
        L_0x00eb:
            int r1 = r6 * 53
            X.R5b r10 = (X.R5b) r10
            X.SJn r0 = r10.unknownFields
            int r0 = X.AnonymousClass7TE.A0N(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T5N.CL6(java.lang.Object):int");
    }

    public final void ClW(Object obj) {
        int i;
        Object unmodifiableList;
        C13255TRv tRv;
        int i2 = this.A00;
        while (true) {
            i = this.A01;
            if (i2 >= i) {
                break;
            }
            long A0B2 = Pxe.A0B(this.A04[this.A05[i2] + 1]);
            Object A002 = SK5.A00(obj, A0B2);
            if (A002 != null) {
                ((TSY) A002).A00 = false;
                UnsafeUtil.A06(obj, A0B2, A002);
            }
            i2++;
        }
        int[] iArr = this.A05;
        int length = iArr.length;
        while (i < length) {
            C10899Rzz rzz = this.A03;
            long j = (long) iArr[i];
            boolean z = rzz instanceof R5d;
            Object A003 = SK5.A00(obj, j);
            if (z) {
                tRv = (C13255TRv) ((C13982TnY) A003);
            } else {
                List list = (List) A003;
                if (list instanceof C13979TnV) {
                    unmodifiableList = ((C13979TnV) list).CBi();
                } else {
                    if (!Pxh.A1W(R5e.A00, list)) {
                        if (!(list instanceof C13493TbK) || !(list instanceof C13982TnY)) {
                            unmodifiableList = Collections.unmodifiableList(list);
                        } else {
                            tRv = (C13255TRv) ((C13982TnY) list);
                            if (!tRv.A00) {
                            }
                        }
                    }
                    i++;
                }
                UnsafeUtil.A06(obj, j, unmodifiableList);
                i++;
            }
            tRv.A00 = false;
            i++;
        }
        ((R5b) obj).unknownFields.A02 = false;
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void Co9(X.SUM r21, X.SQg r22, java.lang.Object r23) {
        /*
            r20 = this;
            r7 = r22
            r15 = r23
            r7.getClass()
            r1 = r20
            X.Rzu r9 = r1.A0C
            r10 = 0
        L_0x000c:
            r2 = r10
        L_0x000d:
            r0 = r21
            int r6 = r0.A0B()     // Catch:{ all -> 0x06c4 }
            int r5 = r1.A00(r6)     // Catch:{ all -> 0x06c4 }
            if (r5 >= 0) goto L_0x004a
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r6 != r3) goto L_0x002f
            int r3 = r1.A00
        L_0x0020:
            int r0 = r1.A01
            if (r3 >= r0) goto L_0x06bb
            int[] r0 = r1.A05
            r0 = r0[r3]
            java.lang.Object r2 = r1.A0G(r0, r15, r2)
            int r3 = r3 + 1
            goto L_0x0020
        L_0x002f:
            if (r2 != 0) goto L_0x0042
            r5 = r15
            X.R5b r5 = (X.R5b) r5     // Catch:{ all -> 0x06c4 }
            X.SJn r4 = r5.unknownFields     // Catch:{ all -> 0x06c4 }
            X.SJn r3 = X.C11289SJn.A05     // Catch:{ all -> 0x06c4 }
            if (r4 != r3) goto L_0x0041
            X.SJn r4 = new X.SJn     // Catch:{ all -> 0x06c4 }
            r4.<init>()     // Catch:{ all -> 0x06c4 }
            r5.unknownFields = r4     // Catch:{ all -> 0x06c4 }
        L_0x0041:
            r2 = r4
        L_0x0042:
            boolean r0 = r9.A00(r0, r2)     // Catch:{ all -> 0x06c4 }
            if (r0 != 0) goto L_0x000d
            goto L_0x0688
        L_0x004a:
            int[] r8 = r1.A04     // Catch:{ all -> 0x06c4 }
            int r3 = r5 + 1
            r10 = r8[r3]     // Catch:{ all -> 0x06c4 }
            int r3 = X.Pxe.A03(r10)
            switch(r3) {
                case 0: goto L_0x0151;
                case 1: goto L_0x0162;
                case 2: goto L_0x0173;
                case 3: goto L_0x0184;
                case 4: goto L_0x0195;
                case 5: goto L_0x01a4;
                case 6: goto L_0x01b5;
                case 7: goto L_0x01c4;
                case 8: goto L_0x0376;
                case 9: goto L_0x037a;
                case 10: goto L_0x01d5;
                case 11: goto L_0x01e8;
                case 12: goto L_0x0067;
                case 13: goto L_0x01f7;
                case 14: goto L_0x0206;
                case 15: goto L_0x0217;
                case 16: goto L_0x0226;
                case 17: goto L_0x03b1;
                case 18: goto L_0x03ec;
                case 19: goto L_0x03f5;
                case 20: goto L_0x03fe;
                case 21: goto L_0x0407;
                case 22: goto L_0x0410;
                case 23: goto L_0x0419;
                case 24: goto L_0x0422;
                case 25: goto L_0x042b;
                case 26: goto L_0x009d;
                case 27: goto L_0x0434;
                case 28: goto L_0x0468;
                case 29: goto L_0x0496;
                case 30: goto L_0x049f;
                case 31: goto L_0x04b0;
                case 32: goto L_0x04b9;
                case 33: goto L_0x04c2;
                case 34: goto L_0x04cb;
                case 35: goto L_0x04d4;
                case 36: goto L_0x04dd;
                case 37: goto L_0x04e6;
                case 38: goto L_0x04ef;
                case 39: goto L_0x04f8;
                case 40: goto L_0x0501;
                case 41: goto L_0x050a;
                case 42: goto L_0x0513;
                case 43: goto L_0x051c;
                case 44: goto L_0x0525;
                case 45: goto L_0x0536;
                case 46: goto L_0x053f;
                case 47: goto L_0x0548;
                case 48: goto L_0x0551;
                case 49: goto L_0x0237;
                case 50: goto L_0x05b7;
                case 51: goto L_0x026c;
                case 52: goto L_0x027f;
                case 53: goto L_0x0292;
                case 54: goto L_0x02a5;
                case 55: goto L_0x02b8;
                case 56: goto L_0x02cb;
                case 57: goto L_0x02de;
                case 58: goto L_0x02f1;
                case 59: goto L_0x055a;
                case 60: goto L_0x055e;
                case 61: goto L_0x0304;
                case 62: goto L_0x0317;
                case 63: goto L_0x0117;
                case 64: goto L_0x032a;
                case 65: goto L_0x033d;
                case 66: goto L_0x0350;
                case 67: goto L_0x0363;
                case 68: goto L_0x0597;
                default: goto L_0x0057;
            }
        L_0x0057:
            if (r2 != 0) goto L_0x005f
            X.SJn r3 = new X.SJn     // Catch:{ R5c -> 0x066e }
            r3.<init>()     // Catch:{ R5c -> 0x066e }
            r2 = r3
        L_0x005f:
            boolean r0 = r9.A00(r0, r2)     // Catch:{ R5c -> 0x066e }
            if (r0 != 0) goto L_0x000d
            goto L_0x0699
        L_0x0067:
            X.SPb r3 = X.SUM.A03(r0)     // Catch:{ R5c -> 0x066e }
            int r8 = r3.A0B()     // Catch:{ R5c -> 0x066e }
            X.TeS r3 = A0B(r1, r5)     // Catch:{ R5c -> 0x066e }
            if (r3 == 0) goto L_0x0094
            boolean r3 = r3.CVB(r8)     // Catch:{ R5c -> 0x066e }
            if (r3 != 0) goto L_0x0094
            r10 = r2
            X.Rzu r3 = X.C11433SUe.A02     // Catch:{ R5c -> 0x066e }
            if (r2 != 0) goto L_0x0085
            X.SJn r10 = new X.SJn     // Catch:{ R5c -> 0x066e }
            r10.<init>()     // Catch:{ R5c -> 0x066e }
        L_0x0085:
            long r3 = (long) r8     // Catch:{ R5c -> 0x066e }
            r8 = r10
            X.SJn r8 = (X.C11289SJn) r8     // Catch:{ R5c -> 0x066e }
            int r5 = r6 << 3
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ R5c -> 0x066e }
            r8.A01(r5, r3)     // Catch:{ R5c -> 0x066e }
            goto L_0x000c
        L_0x0094:
            long r3 = X.Pxe.A0B(r10)     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A05(r15, r3, r8)     // Catch:{ R5c -> 0x066e }
            goto L_0x03e7
        L_0x009d:
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            r3 = r3 & r10
            boolean r3 = X.AnonymousClass7TF.A1P(r3)
            java.util.List r6 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            if (r3 == 0) goto L_0x00cd
            int r3 = r0.A02     // Catch:{ R5c -> 0x066e }
            r3 = r3 & 7
            r5 = 2
            if (r3 != r5) goto L_0x0112
        L_0x00b1:
            X.SUM.A0A(r0, r5)     // Catch:{ R5c -> 0x066e }
            X.SPb r4 = r0.A03     // Catch:{ R5c -> 0x066e }
            java.lang.String r3 = r4.A0Q()     // Catch:{ R5c -> 0x066e }
            r6.add(r3)     // Catch:{ R5c -> 0x066e }
            boolean r3 = r4.A0T()     // Catch:{ R5c -> 0x066e }
            if (r3 != 0) goto L_0x000d
            int r4 = r4.A0G()     // Catch:{ R5c -> 0x066e }
            int r3 = r0.A02     // Catch:{ R5c -> 0x066e }
            if (r4 == r3) goto L_0x00b1
            goto L_0x0492
        L_0x00cd:
            int r3 = r0.A02     // Catch:{ R5c -> 0x066e }
            r3 = r3 & 7
            r5 = 2
            if (r3 != r5) goto L_0x0112
            boolean r3 = r6 instanceof X.C13979TnV     // Catch:{ R5c -> 0x066e }
            if (r3 == 0) goto L_0x00f6
            X.TnV r6 = (X.C13979TnV) r6     // Catch:{ R5c -> 0x066e }
        L_0x00da:
            X.SUM.A0A(r0, r5)     // Catch:{ R5c -> 0x066e }
            X.SPb r4 = r0.A03     // Catch:{ R5c -> 0x066e }
            X.TAP r3 = r4.A0O()     // Catch:{ R5c -> 0x066e }
            r6.A7a(r3)     // Catch:{ R5c -> 0x066e }
            boolean r3 = r4.A0T()     // Catch:{ R5c -> 0x066e }
            if (r3 != 0) goto L_0x000d
            int r4 = r4.A0G()     // Catch:{ R5c -> 0x066e }
            int r3 = r0.A02     // Catch:{ R5c -> 0x066e }
            if (r4 == r3) goto L_0x00da
            goto L_0x0492
        L_0x00f6:
            X.SUM.A0A(r0, r5)     // Catch:{ R5c -> 0x066e }
            X.SPb r4 = r0.A03     // Catch:{ R5c -> 0x066e }
            java.lang.String r3 = r4.A0P()     // Catch:{ R5c -> 0x066e }
            r6.add(r3)     // Catch:{ R5c -> 0x066e }
            boolean r3 = r4.A0T()     // Catch:{ R5c -> 0x066e }
            if (r3 != 0) goto L_0x000d
            int r4 = r4.A0G()     // Catch:{ R5c -> 0x066e }
            int r3 = r0.A02     // Catch:{ R5c -> 0x066e }
            if (r4 == r3) goto L_0x00f6
            goto L_0x0492
        L_0x0112:
            X.R5c r3 = X.AnonymousClass5I7.A00()     // Catch:{ R5c -> 0x066e }
            throw r3     // Catch:{ R5c -> 0x066e }
        L_0x0117:
            X.SPb r3 = X.SUM.A03(r0)     // Catch:{ R5c -> 0x066e }
            int r11 = r3.A0B()     // Catch:{ R5c -> 0x066e }
            X.TeS r3 = A0B(r1, r5)     // Catch:{ R5c -> 0x066e }
            if (r3 == 0) goto L_0x0144
            boolean r3 = r3.CVB(r11)     // Catch:{ R5c -> 0x066e }
            if (r3 != 0) goto L_0x0144
            r10 = r2
            X.Rzu r3 = X.C11433SUe.A02     // Catch:{ R5c -> 0x066e }
            if (r2 != 0) goto L_0x0135
            X.SJn r10 = new X.SJn     // Catch:{ R5c -> 0x066e }
            r10.<init>()     // Catch:{ R5c -> 0x066e }
        L_0x0135:
            long r3 = (long) r11     // Catch:{ R5c -> 0x066e }
            r8 = r10
            X.SJn r8 = (X.C11289SJn) r8     // Catch:{ R5c -> 0x066e }
            int r5 = r6 << 3
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ R5c -> 0x066e }
            r8.A01(r5, r3)     // Catch:{ R5c -> 0x066e }
            goto L_0x000c
        L_0x0144:
            long r3 = X.Pxe.A0B(r10)     // Catch:{ R5c -> 0x066e }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A06(r15, r3, r10)     // Catch:{ R5c -> 0x066e }
            goto L_0x05aa
        L_0x0151:
            long r16 = A09(r0, r10)     // Catch:{ R5c -> 0x066e }
            X.SPb r3 = r0.A03     // Catch:{ R5c -> 0x066e }
            double r18 = r3.A08()     // Catch:{ R5c -> 0x066e }
            X.SK5 r14 = com.google.protobuf.UnsafeUtil.A02     // Catch:{ R5c -> 0x066e }
            r14.A0C(r15, r16, r18)     // Catch:{ R5c -> 0x066e }
            goto L_0x03e7
        L_0x0162:
            long r3 = A0A(r0, r10)     // Catch:{ R5c -> 0x066e }
            X.SPb r6 = r0.A03     // Catch:{ R5c -> 0x066e }
            float r8 = r6.A09()     // Catch:{ R5c -> 0x066e }
            X.SK5 r6 = com.google.protobuf.UnsafeUtil.A02     // Catch:{ R5c -> 0x066e }
            r6.A0D(r15, r3, r8)     // Catch:{ R5c -> 0x066e }
            goto L_0x03e7
        L_0x0173:
            long r16 = A08(r0, r10)     // Catch:{ R5c -> 0x066e }
            X.SPb r3 = r0.A03     // Catch:{ R5c -> 0x066e }
            long r18 = r3.A0K()     // Catch:{ R5c -> 0x066e }
            X.SK5 r14 = com.google.protobuf.UnsafeUtil.A02     // Catch:{ R5c -> 0x066e }
            r14.A0F(r15, r16, r18)     // Catch:{ R5c -> 0x066e }
            goto L_0x03e7
        L_0x0184:
            long r16 = A08(r0, r10)     // Catch:{ R5c -> 0x066e }
            X.SPb r3 = r0.A03     // Catch:{ R5c -> 0x066e }
            long r18 = r3.A0N()     // Catch:{ R5c -> 0x066e }
            X.SK5 r14 = com.google.protobuf.UnsafeUtil.A02     // Catch:{ R5c -> 0x066e }
            r14.A0F(r15, r16, r18)     // Catch:{ R5c -> 0x066e }
            goto L_0x03e7
        L_0x0195:
            long r3 = A08(r0, r10)     // Catch:{ R5c -> 0x066e }
            X.SPb r6 = r0.A03     // Catch:{ R5c -> 0x066e }
            int r6 = r6.A0D()     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A05(r15, r3, r6)     // Catch:{ R5c -> 0x066e }
            goto L_0x03e7
        L_0x01a4:
            long r16 = A09(r0, r10)     // Catch:{ R5c -> 0x066e }
            X.SPb r3 = r0.A03     // Catch:{ R5c -> 0x066e }
            long r18 = r3.A0J()     // Catch:{ R5c -> 0x066e }
            X.SK5 r14 = com.google.protobuf.UnsafeUtil.A02     // Catch:{ R5c -> 0x066e }
            r14.A0F(r15, r16, r18)     // Catch:{ R5c -> 0x066e }
            goto L_0x03e7
        L_0x01b5:
            long r3 = A0A(r0, r10)     // Catch:{ R5c -> 0x066e }
            X.SPb r6 = r0.A03     // Catch:{ R5c -> 0x066e }
            int r6 = r6.A0C()     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A05(r15, r3, r6)     // Catch:{ R5c -> 0x066e }
            goto L_0x03e7
        L_0x01c4:
            long r3 = A08(r0, r10)     // Catch:{ R5c -> 0x066e }
            X.SPb r6 = r0.A03     // Catch:{ R5c -> 0x066e }
            boolean r8 = r6.A0U()     // Catch:{ R5c -> 0x066e }
            X.SK5 r6 = com.google.protobuf.UnsafeUtil.A02     // Catch:{ R5c -> 0x066e }
            r6.A0H(r15, r3, r8)     // Catch:{ R5c -> 0x066e }
            goto L_0x03e7
        L_0x01d5:
            long r3 = X.Pxe.A0B(r10)     // Catch:{ R5c -> 0x066e }
            r6 = 2
            X.SUM.A0A(r0, r6)     // Catch:{ R5c -> 0x066e }
            X.SPb r6 = r0.A03     // Catch:{ R5c -> 0x066e }
            X.TAP r6 = r6.A0O()     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A06(r15, r3, r6)     // Catch:{ R5c -> 0x066e }
            goto L_0x03e7
        L_0x01e8:
            long r3 = A08(r0, r10)     // Catch:{ R5c -> 0x066e }
            X.SPb r6 = r0.A03     // Catch:{ R5c -> 0x066e }
            int r6 = r6.A0H()     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A05(r15, r3, r6)     // Catch:{ R5c -> 0x066e }
            goto L_0x03e7
        L_0x01f7:
            long r3 = A0A(r0, r10)     // Catch:{ R5c -> 0x066e }
            X.SPb r6 = r0.A03     // Catch:{ R5c -> 0x066e }
            int r6 = r6.A0E()     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A05(r15, r3, r6)     // Catch:{ R5c -> 0x066e }
            goto L_0x03e7
        L_0x0206:
            long r16 = A09(r0, r10)     // Catch:{ R5c -> 0x066e }
            X.SPb r3 = r0.A03     // Catch:{ R5c -> 0x066e }
            long r18 = r3.A0L()     // Catch:{ R5c -> 0x066e }
            X.SK5 r14 = com.google.protobuf.UnsafeUtil.A02     // Catch:{ R5c -> 0x066e }
            r14.A0F(r15, r16, r18)     // Catch:{ R5c -> 0x066e }
            goto L_0x03e7
        L_0x0217:
            long r3 = A08(r0, r10)     // Catch:{ R5c -> 0x066e }
            X.SPb r6 = r0.A03     // Catch:{ R5c -> 0x066e }
            int r6 = r6.A0F()     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A05(r15, r3, r6)     // Catch:{ R5c -> 0x066e }
            goto L_0x03e7
        L_0x0226:
            long r16 = A08(r0, r10)     // Catch:{ R5c -> 0x066e }
            X.SPb r3 = r0.A03     // Catch:{ R5c -> 0x066e }
            long r18 = r3.A0M()     // Catch:{ R5c -> 0x066e }
            X.SK5 r14 = com.google.protobuf.UnsafeUtil.A02     // Catch:{ R5c -> 0x066e }
            r14.A0F(r15, r16, r18)     // Catch:{ R5c -> 0x066e }
            goto L_0x03e7
        L_0x0237:
            long r3 = X.Pxe.A0B(r10)     // Catch:{ R5c -> 0x066e }
            X.TjQ r6 = r1.A0D(r5)     // Catch:{ R5c -> 0x066e }
            X.Rzz r5 = r1.A03     // Catch:{ R5c -> 0x066e }
            java.util.List r8 = r5.A01(r15, r3)     // Catch:{ R5c -> 0x066e }
            int r5 = r0.A02     // Catch:{ R5c -> 0x066e }
            r4 = r5 & 7
            r3 = 3
            if (r4 == r3) goto L_0x0251
            X.R5c r3 = X.AnonymousClass5I7.A00()     // Catch:{ R5c -> 0x066e }
            throw r3     // Catch:{ R5c -> 0x066e }
        L_0x0251:
            java.lang.Object r3 = X.SUM.A04(r0, r7, r6)     // Catch:{ R5c -> 0x066e }
            r8.add(r3)     // Catch:{ R5c -> 0x066e }
            X.SPb r4 = r0.A03     // Catch:{ R5c -> 0x066e }
            boolean r3 = r4.A0T()     // Catch:{ R5c -> 0x066e }
            if (r3 != 0) goto L_0x000d
            int r3 = r0.A01     // Catch:{ R5c -> 0x066e }
            if (r3 != 0) goto L_0x000d
            int r4 = r4.A0G()     // Catch:{ R5c -> 0x066e }
            if (r4 == r5) goto L_0x0251
            goto L_0x0492
        L_0x026c:
            long r3 = A09(r0, r10)     // Catch:{ R5c -> 0x066e }
            X.SPb r10 = r0.A03     // Catch:{ R5c -> 0x066e }
            double r10 = r10.A08()     // Catch:{ R5c -> 0x066e }
            java.lang.Double r10 = java.lang.Double.valueOf(r10)     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A06(r15, r3, r10)     // Catch:{ R5c -> 0x066e }
            goto L_0x05aa
        L_0x027f:
            long r3 = A0A(r0, r10)     // Catch:{ R5c -> 0x066e }
            X.SPb r10 = r0.A03     // Catch:{ R5c -> 0x066e }
            float r10 = r10.A09()     // Catch:{ R5c -> 0x066e }
            java.lang.Float r10 = java.lang.Float.valueOf(r10)     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A06(r15, r3, r10)     // Catch:{ R5c -> 0x066e }
            goto L_0x05aa
        L_0x0292:
            long r3 = A08(r0, r10)     // Catch:{ R5c -> 0x066e }
            X.SPb r10 = r0.A03     // Catch:{ R5c -> 0x066e }
            long r10 = r10.A0K()     // Catch:{ R5c -> 0x066e }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A06(r15, r3, r10)     // Catch:{ R5c -> 0x066e }
            goto L_0x05aa
        L_0x02a5:
            long r3 = A08(r0, r10)     // Catch:{ R5c -> 0x066e }
            X.SPb r10 = r0.A03     // Catch:{ R5c -> 0x066e }
            long r10 = r10.A0N()     // Catch:{ R5c -> 0x066e }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A06(r15, r3, r10)     // Catch:{ R5c -> 0x066e }
            goto L_0x05aa
        L_0x02b8:
            long r3 = A08(r0, r10)     // Catch:{ R5c -> 0x066e }
            X.SPb r10 = r0.A03     // Catch:{ R5c -> 0x066e }
            int r10 = r10.A0D()     // Catch:{ R5c -> 0x066e }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A06(r15, r3, r10)     // Catch:{ R5c -> 0x066e }
            goto L_0x05aa
        L_0x02cb:
            long r3 = A09(r0, r10)     // Catch:{ R5c -> 0x066e }
            X.SPb r10 = r0.A03     // Catch:{ R5c -> 0x066e }
            long r10 = r10.A0J()     // Catch:{ R5c -> 0x066e }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A06(r15, r3, r10)     // Catch:{ R5c -> 0x066e }
            goto L_0x05aa
        L_0x02de:
            long r3 = A0A(r0, r10)     // Catch:{ R5c -> 0x066e }
            X.SPb r10 = r0.A03     // Catch:{ R5c -> 0x066e }
            int r10 = r10.A0C()     // Catch:{ R5c -> 0x066e }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A06(r15, r3, r10)     // Catch:{ R5c -> 0x066e }
            goto L_0x05aa
        L_0x02f1:
            long r3 = A08(r0, r10)     // Catch:{ R5c -> 0x066e }
            X.SPb r10 = r0.A03     // Catch:{ R5c -> 0x066e }
            boolean r10 = r10.A0U()     // Catch:{ R5c -> 0x066e }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A06(r15, r3, r10)     // Catch:{ R5c -> 0x066e }
            goto L_0x05aa
        L_0x0304:
            long r3 = X.Pxe.A0B(r10)     // Catch:{ R5c -> 0x066e }
            r10 = 2
            X.SUM.A0A(r0, r10)     // Catch:{ R5c -> 0x066e }
            X.SPb r10 = r0.A03     // Catch:{ R5c -> 0x066e }
            X.TAP r10 = r10.A0O()     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A06(r15, r3, r10)     // Catch:{ R5c -> 0x066e }
            goto L_0x05aa
        L_0x0317:
            long r3 = A08(r0, r10)     // Catch:{ R5c -> 0x066e }
            X.SPb r10 = r0.A03     // Catch:{ R5c -> 0x066e }
            int r10 = r10.A0H()     // Catch:{ R5c -> 0x066e }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A06(r15, r3, r10)     // Catch:{ R5c -> 0x066e }
            goto L_0x05aa
        L_0x032a:
            long r3 = A0A(r0, r10)     // Catch:{ R5c -> 0x066e }
            X.SPb r10 = r0.A03     // Catch:{ R5c -> 0x066e }
            int r10 = r10.A0E()     // Catch:{ R5c -> 0x066e }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A06(r15, r3, r10)     // Catch:{ R5c -> 0x066e }
            goto L_0x05aa
        L_0x033d:
            long r3 = A09(r0, r10)     // Catch:{ R5c -> 0x066e }
            X.SPb r10 = r0.A03     // Catch:{ R5c -> 0x066e }
            long r10 = r10.A0L()     // Catch:{ R5c -> 0x066e }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A06(r15, r3, r10)     // Catch:{ R5c -> 0x066e }
            goto L_0x05aa
        L_0x0350:
            long r3 = A08(r0, r10)     // Catch:{ R5c -> 0x066e }
            X.SPb r10 = r0.A03     // Catch:{ R5c -> 0x066e }
            int r10 = r10.A0F()     // Catch:{ R5c -> 0x066e }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A06(r15, r3, r10)     // Catch:{ R5c -> 0x066e }
            goto L_0x05aa
        L_0x0363:
            long r3 = A08(r0, r10)     // Catch:{ R5c -> 0x066e }
            X.SPb r10 = r0.A03     // Catch:{ R5c -> 0x066e }
            long r10 = r10.A0M()     // Catch:{ R5c -> 0x066e }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A06(r15, r3, r10)     // Catch:{ R5c -> 0x066e }
            goto L_0x05aa
        L_0x0376:
            r1.A0L(r0, r15, r10)     // Catch:{ R5c -> 0x066e }
            goto L_0x03e7
        L_0x037a:
            boolean r3 = r1.A0O(r5, r15)     // Catch:{ R5c -> 0x066e }
            if (r3 == 0) goto L_0x039d
            long r3 = X.Pxe.A0B(r10)     // Catch:{ R5c -> 0x066e }
            java.lang.Object r8 = X.SK5.A00(r15, r3)     // Catch:{ R5c -> 0x066e }
            X.TjQ r6 = r1.A0D(r5)     // Catch:{ R5c -> 0x066e }
            r5 = 2
            X.SUM.A0A(r0, r5)     // Catch:{ R5c -> 0x066e }
            java.lang.Object r5 = X.SUM.A05(r0, r7, r6)     // Catch:{ R5c -> 0x066e }
            X.R5b r5 = X.SD9.A00(r8, r5)     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A06(r15, r3, r5)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x039d:
            long r3 = X.Pxe.A0B(r10)     // Catch:{ R5c -> 0x066e }
            X.TjQ r8 = r1.A0D(r5)     // Catch:{ R5c -> 0x066e }
            r6 = 2
            X.SUM.A0A(r0, r6)     // Catch:{ R5c -> 0x066e }
            java.lang.Object r6 = X.SUM.A05(r0, r7, r8)     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A06(r15, r3, r6)     // Catch:{ R5c -> 0x066e }
            goto L_0x03e7
        L_0x03b1:
            boolean r3 = r1.A0O(r5, r15)     // Catch:{ R5c -> 0x066e }
            if (r3 == 0) goto L_0x03d4
            long r3 = X.Pxe.A0B(r10)     // Catch:{ R5c -> 0x066e }
            java.lang.Object r8 = X.SK5.A00(r15, r3)     // Catch:{ R5c -> 0x066e }
            X.TjQ r6 = r1.A0D(r5)     // Catch:{ R5c -> 0x066e }
            r5 = 3
            X.SUM.A0A(r0, r5)     // Catch:{ R5c -> 0x066e }
            java.lang.Object r5 = X.SUM.A04(r0, r7, r6)     // Catch:{ R5c -> 0x066e }
            X.R5b r5 = X.SD9.A00(r8, r5)     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A06(r15, r3, r5)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x03d4:
            long r3 = X.Pxe.A0B(r10)     // Catch:{ R5c -> 0x066e }
            X.TjQ r8 = r1.A0D(r5)     // Catch:{ R5c -> 0x066e }
            r6 = 3
            X.SUM.A0A(r0, r6)     // Catch:{ R5c -> 0x066e }
            java.lang.Object r6 = X.SUM.A04(r0, r7, r8)     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A06(r15, r3, r6)     // Catch:{ R5c -> 0x066e }
        L_0x03e7:
            r1.A0N(r15, r5)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x03ec:
            java.util.List r3 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            r0.A0D(r3)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x03f5:
            java.util.List r3 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            r0.A0H(r3)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x03fe:
            java.util.List r3 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            r0.A0J(r3)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x0407:
            java.util.List r3 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            r0.A0P(r3)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x0410:
            java.util.List r3 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            r0.A0I(r3)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x0419:
            java.util.List r3 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            r0.A0G(r3)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x0422:
            java.util.List r3 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            r0.A0F(r3)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x042b:
            java.util.List r3 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            r0.A0C(r3)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x0434:
            X.TjQ r6 = r1.A0D(r5)     // Catch:{ R5c -> 0x066e }
            long r3 = X.Pxe.A0B(r10)     // Catch:{ R5c -> 0x066e }
            X.Rzz r5 = r1.A03     // Catch:{ R5c -> 0x066e }
            java.util.List r8 = r5.A01(r15, r3)     // Catch:{ R5c -> 0x066e }
            int r5 = r0.A02     // Catch:{ R5c -> 0x066e }
            r4 = r5 & 7
            r3 = 2
            if (r4 == r3) goto L_0x044e
            X.R5c r3 = X.AnonymousClass5I7.A00()     // Catch:{ R5c -> 0x066e }
            throw r3     // Catch:{ R5c -> 0x066e }
        L_0x044e:
            java.lang.Object r3 = X.SUM.A05(r0, r7, r6)     // Catch:{ R5c -> 0x066e }
            r8.add(r3)     // Catch:{ R5c -> 0x066e }
            X.SPb r4 = r0.A03     // Catch:{ R5c -> 0x066e }
            boolean r3 = r4.A0T()     // Catch:{ R5c -> 0x066e }
            if (r3 != 0) goto L_0x000d
            int r3 = r0.A01     // Catch:{ R5c -> 0x066e }
            if (r3 != 0) goto L_0x000d
            int r4 = r4.A0G()     // Catch:{ R5c -> 0x066e }
            if (r4 == r5) goto L_0x044e
            goto L_0x0492
        L_0x0468:
            java.util.List r6 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            int r3 = r0.A02     // Catch:{ R5c -> 0x066e }
            r3 = r3 & 7
            r5 = 2
            if (r3 == r5) goto L_0x0478
            X.R5c r3 = X.AnonymousClass5I7.A00()     // Catch:{ R5c -> 0x066e }
            throw r3     // Catch:{ R5c -> 0x066e }
        L_0x0478:
            X.SUM.A0A(r0, r5)     // Catch:{ R5c -> 0x066e }
            X.SPb r4 = r0.A03     // Catch:{ R5c -> 0x066e }
            X.TAP r3 = r4.A0O()     // Catch:{ R5c -> 0x066e }
            r6.add(r3)     // Catch:{ R5c -> 0x066e }
            boolean r3 = r4.A0T()     // Catch:{ R5c -> 0x066e }
            if (r3 != 0) goto L_0x000d
            int r4 = r4.A0G()     // Catch:{ R5c -> 0x066e }
            int r3 = r0.A02     // Catch:{ R5c -> 0x066e }
            if (r4 == r3) goto L_0x0478
        L_0x0492:
            r0.A01 = r4     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x0496:
            java.util.List r3 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            r0.A0O(r3)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x049f:
            java.util.List r4 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            r0.A0E(r4)     // Catch:{ R5c -> 0x066e }
            X.TeS r3 = A0B(r1, r5)     // Catch:{ R5c -> 0x066e }
            java.lang.Object r2 = X.C11433SUe.A09(r3, r2, r4, r6)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x04b0:
            java.util.List r3 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            r0.A0K(r3)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x04b9:
            java.util.List r3 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            r0.A0L(r3)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x04c2:
            java.util.List r3 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            r0.A0M(r3)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x04cb:
            java.util.List r3 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            r0.A0N(r3)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x04d4:
            java.util.List r3 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            r0.A0D(r3)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x04dd:
            java.util.List r3 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            r0.A0H(r3)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x04e6:
            java.util.List r3 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            r0.A0J(r3)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x04ef:
            java.util.List r3 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            r0.A0P(r3)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x04f8:
            java.util.List r3 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            r0.A0I(r3)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x0501:
            java.util.List r3 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            r0.A0G(r3)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x050a:
            java.util.List r3 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            r0.A0F(r3)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x0513:
            java.util.List r3 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            r0.A0C(r3)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x051c:
            java.util.List r3 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            r0.A0O(r3)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x0525:
            java.util.List r4 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            r0.A0E(r4)     // Catch:{ R5c -> 0x066e }
            X.TeS r3 = A0B(r1, r5)     // Catch:{ R5c -> 0x066e }
            java.lang.Object r2 = X.C11433SUe.A09(r3, r2, r4, r6)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x0536:
            java.util.List r3 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            r0.A0K(r3)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x053f:
            java.util.List r3 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            r0.A0L(r3)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x0548:
            java.util.List r3 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            r0.A0M(r3)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x0551:
            java.util.List r3 = A0J(r1, r15, r10)     // Catch:{ R5c -> 0x066e }
            r0.A0N(r3)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x055a:
            r1.A0L(r0, r15, r10)     // Catch:{ R5c -> 0x066e }
            goto L_0x05aa
        L_0x055e:
            boolean r3 = r1.A0P(r15, r6, r5)     // Catch:{ R5c -> 0x066e }
            if (r3 == 0) goto L_0x0580
            long r3 = X.Pxe.A0B(r10)     // Catch:{ R5c -> 0x066e }
            java.lang.Object r12 = X.SK5.A00(r15, r3)     // Catch:{ R5c -> 0x066e }
            X.TjQ r11 = r1.A0D(r5)     // Catch:{ R5c -> 0x066e }
            r10 = 2
            X.SUM.A0A(r0, r10)     // Catch:{ R5c -> 0x066e }
            java.lang.Object r10 = X.SUM.A05(r0, r7, r11)     // Catch:{ R5c -> 0x066e }
            X.R5b r10 = X.SD9.A00(r12, r10)     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A06(r15, r3, r10)     // Catch:{ R5c -> 0x066e }
            goto L_0x05aa
        L_0x0580:
            long r3 = X.Pxe.A0B(r10)     // Catch:{ R5c -> 0x066e }
            X.TjQ r11 = r1.A0D(r5)     // Catch:{ R5c -> 0x066e }
            r10 = 2
            X.SUM.A0A(r0, r10)     // Catch:{ R5c -> 0x066e }
            java.lang.Object r10 = X.SUM.A05(r0, r7, r11)     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A06(r15, r3, r10)     // Catch:{ R5c -> 0x066e }
            r1.A0N(r15, r5)     // Catch:{ R5c -> 0x066e }
            goto L_0x05aa
        L_0x0597:
            long r3 = X.Pxe.A0B(r10)     // Catch:{ R5c -> 0x066e }
            X.TjQ r11 = r1.A0D(r5)     // Catch:{ R5c -> 0x066e }
            r10 = 3
            X.SUM.A0A(r0, r10)     // Catch:{ R5c -> 0x066e }
            java.lang.Object r10 = X.SUM.A04(r0, r7, r11)     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A06(r15, r3, r10)     // Catch:{ R5c -> 0x066e }
        L_0x05aa:
            int r3 = r5 + 2
            r3 = r8[r3]     // Catch:{ R5c -> 0x066e }
            long r3 = X.Pxe.A0B(r3)     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A05(r15, r3, r6)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x05b7:
            java.lang.Object[] r4 = r1.A06     // Catch:{ R5c -> 0x066e }
            int r3 = r5 / 3
            int r3 = r3 * 2
            r6 = r4[r3]     // Catch:{ R5c -> 0x066e }
            long r3 = X.Pxe.A0B(r10)     // Catch:{ R5c -> 0x066e }
            java.lang.Object r11 = X.SK5.A00(r15, r3)     // Catch:{ R5c -> 0x066e }
            if (r11 != 0) goto L_0x05ed
            X.TSY r5 = X.TSY.A01     // Catch:{ R5c -> 0x066e }
            X.TSY r11 = r5.A01()     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A06(r15, r3, r11)     // Catch:{ R5c -> 0x066e }
        L_0x05d2:
            X.TSY r11 = (X.TSY) r11     // Catch:{ R5c -> 0x066e }
            X.RvA r6 = (X.C10616RvA) r6     // Catch:{ R5c -> 0x066e }
            X.Rwh r13 = r6.A00     // Catch:{ R5c -> 0x066e }
            r12 = 2
            X.SUM.A0A(r0, r12)     // Catch:{ R5c -> 0x066e }
            X.SPb r10 = r0.A03     // Catch:{ R5c -> 0x066e }
            int r3 = r10.A0H()     // Catch:{ R5c -> 0x066e }
            int r8 = r10.A0I(r3)     // Catch:{ R5c -> 0x066e }
            java.lang.Object r6 = r13.A02     // Catch:{ R5c -> 0x066e }
            java.lang.Object r4 = r13.A03     // Catch:{ R5c -> 0x066e }
            r16 = r4
            goto L_0x0604
        L_0x05ed:
            r5 = r11
            X.TSY r5 = (X.TSY) r5     // Catch:{ R5c -> 0x066e }
            boolean r5 = r5.A00     // Catch:{ R5c -> 0x066e }
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x05d2
            X.TSY r5 = X.TSY.A01     // Catch:{ R5c -> 0x066e }
            X.TSY r5 = r5.A01()     // Catch:{ R5c -> 0x066e }
            X.C11309SKx.A01(r5, r11)     // Catch:{ R5c -> 0x066e }
            com.google.protobuf.UnsafeUtil.A06(r15, r3, r5)     // Catch:{ R5c -> 0x066e }
            r11 = r5
            goto L_0x05d2
        L_0x0604:
            int r14 = r0.A0B()     // Catch:{ all -> 0x0669 }
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r14 == r3) goto L_0x0661
            boolean r3 = r10.A0T()     // Catch:{ all -> 0x0669 }
            if (r3 != 0) goto L_0x0661
            r3 = 1
            java.lang.String r5 = "Unable to parse map entry."
            if (r14 == r3) goto L_0x063d
            if (r14 == r12) goto L_0x0632
            boolean r3 = r10.A0T()     // Catch:{ R5c -> 0x0645 }
            if (r3 != 0) goto L_0x062d
            int r14 = r0.A02     // Catch:{ R5c -> 0x0645 }
            int r3 = r0.A00     // Catch:{ R5c -> 0x0645 }
            if (r14 == r3) goto L_0x062d
            boolean r3 = r10.A0V(r14)     // Catch:{ R5c -> 0x0645 }
            if (r3 == 0) goto L_0x062d
            goto L_0x0604
        L_0x062d:
            X.5I7 r3 = X.Pxg.A0T(r5)     // Catch:{ R5c -> 0x0645 }
            throw r3     // Catch:{ R5c -> 0x0645 }
        L_0x0632:
            X.RFi r14 = r13.A01     // Catch:{ R5c -> 0x0645 }
            java.lang.Class r3 = r16.getClass()     // Catch:{ R5c -> 0x0645 }
            java.lang.Object r4 = X.SUM.A06(r0, r7, r14, r3)     // Catch:{ R5c -> 0x0645 }
            goto L_0x0604
        L_0x063d:
            X.RFi r14 = r13.A00     // Catch:{ R5c -> 0x0645 }
            r3 = 0
            java.lang.Object r6 = X.SUM.A06(r0, r3, r14, r3)     // Catch:{ R5c -> 0x0645 }
            goto L_0x0604
        L_0x0645:
            boolean r3 = r10.A0T()     // Catch:{ all -> 0x0669 }
            if (r3 != 0) goto L_0x0658
            int r14 = r0.A02     // Catch:{ all -> 0x0669 }
            int r3 = r0.A00     // Catch:{ all -> 0x0669 }
            if (r14 == r3) goto L_0x0658
            boolean r3 = r10.A0V(r14)     // Catch:{ all -> 0x0669 }
            if (r3 == 0) goto L_0x0658
            goto L_0x0604
        L_0x0658:
            X.5I7 r4 = new X.5I7     // Catch:{ all -> 0x0669 }
            r4.<init>(r5)     // Catch:{ all -> 0x0669 }
            r3 = 0
            r4.A00 = r3     // Catch:{ all -> 0x0669 }
            throw r4     // Catch:{ all -> 0x0669 }
        L_0x0661:
            r11.put(r6, r4)     // Catch:{ all -> 0x0669 }
            r10.A0S(r8)     // Catch:{ R5c -> 0x066e }
            goto L_0x000d
        L_0x0669:
            r3 = move-exception
            r10.A0S(r8)     // Catch:{ R5c -> 0x066e }
            throw r3     // Catch:{ R5c -> 0x066e }
        L_0x066e:
            if (r2 != 0) goto L_0x0681
            r5 = r15
            X.R5b r5 = (X.R5b) r5     // Catch:{ all -> 0x06c4 }
            X.SJn r4 = r5.unknownFields     // Catch:{ all -> 0x06c4 }
            X.SJn r3 = X.C11289SJn.A05     // Catch:{ all -> 0x06c4 }
            if (r4 != r3) goto L_0x0680
            X.SJn r4 = new X.SJn     // Catch:{ all -> 0x06c4 }
            r4.<init>()     // Catch:{ all -> 0x06c4 }
            r5.unknownFields = r4     // Catch:{ all -> 0x06c4 }
        L_0x0680:
            r2 = r4
        L_0x0681:
            boolean r0 = r9.A00(r0, r2)     // Catch:{ all -> 0x06c4 }
            if (r0 != 0) goto L_0x000d
            goto L_0x06aa
        L_0x0688:
            int r3 = r1.A00
        L_0x068a:
            int r0 = r1.A01
            if (r3 >= r0) goto L_0x06bb
            int[] r0 = r1.A05
            r0 = r0[r3]
            java.lang.Object r2 = r1.A0G(r0, r15, r2)
            int r3 = r3 + 1
            goto L_0x068a
        L_0x0699:
            int r3 = r1.A00
        L_0x069b:
            int r0 = r1.A01
            if (r3 >= r0) goto L_0x06bb
            int[] r0 = r1.A05
            r0 = r0[r3]
            java.lang.Object r2 = r1.A0G(r0, r15, r2)
            int r3 = r3 + 1
            goto L_0x069b
        L_0x06aa:
            int r3 = r1.A00
        L_0x06ac:
            int r0 = r1.A01
            if (r3 >= r0) goto L_0x06bb
            int[] r0 = r1.A05
            r0 = r0[r3]
            java.lang.Object r2 = r1.A0G(r0, r15, r2)
            int r3 = r3 + 1
            goto L_0x06ac
        L_0x06bb:
            if (r2 == 0) goto L_0x06c3
            X.SJn r2 = (X.C11289SJn) r2
            X.R5b r15 = (X.R5b) r15
            r15.unknownFields = r2
        L_0x06c3:
            return
        L_0x06c4:
            r4 = move-exception
            int r3 = r1.A00
        L_0x06c7:
            int r0 = r1.A01
            if (r3 >= r0) goto L_0x06d6
            int[] r0 = r1.A05
            r0 = r0[r3]
            java.lang.Object r2 = r1.A0G(r0, r15, r2)
            int r3 = r3 + 1
            goto L_0x06c7
        L_0x06d6:
            if (r2 == 0) goto L_0x06de
            X.SJn r2 = (X.C11289SJn) r2
            X.R5b r15 = (X.R5b) r15
            r15.unknownFields = r2
        L_0x06de:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T5N.Co9(X.SUM, X.SQg, java.lang.Object):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d8, code lost:
        r10.putInt(r5, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f4, code lost:
        r0 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f6, code lost:
        r10.putObject(r5, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x013c, code lost:
        r10.putLong(r5, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x016d, code lost:
        r9 = r7 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0179, code lost:
        r9 = r7 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x017b, code lost:
        r8 = r8 | r16;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CoA(X.SFF r40, java.lang.Object r41, byte[] r42, int r43, int r44) {
        /*
            r39 = this;
            r38 = r39
            r9 = r43
            r0 = r38
            boolean r0 = r0.A0E
            r6 = r40
            r5 = r41
            r4 = r42
            r37 = r44
            if (r0 == 0) goto L_0x0246
            sun.misc.Unsafe r10 = A0F
            r21 = -1
            r1 = -1
            r11 = 0
            r8 = 0
            r20 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001c:
            r0 = r37
            if (r9 >= r0) goto L_0x0230
            int r7 = r9 + 1
            byte r13 = r42[r9]
            if (r13 >= 0) goto L_0x002c
            int r7 = X.SU4.A07(r6, r4, r13, r7)
            int r13 = r6.A00
        L_0x002c:
            int r19 = r13 >>> 3
            r9 = r13 & 7
            r0 = r19
            if (r0 <= r1) goto L_0x0222
            int r2 = r11 / 3
            r1 = r0
            r0 = r38
            int r11 = r0.A01(r1, r2)
        L_0x003d:
            r0 = r21
            if (r11 != r0) goto L_0x0057
            r11 = 0
        L_0x0042:
            X.SJn r23 = A0E(r5)
            r22 = r6
            r24 = r4
            r25 = r13
            r26 = r7
            r27 = r37
            int r9 = X.SU4.A02(r22, r23, r24, r25, r26, r27)
        L_0x0054:
            r1 = r19
            goto L_0x001c
        L_0x0057:
            r0 = r38
            int[] r1 = r0.A04
            int r0 = r11 + 1
            r18 = r1[r0]
            int r15 = X.Pxe.A03(r18)
            r14 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r18 & r14
            long r2 = (long) r0
            r0 = 17
            if (r15 > r0) goto L_0x017f
            int r0 = r11 + 2
            r12 = r1[r0]
            int r0 = r12 >>> 20
            r17 = 1
            int r16 = r17 << r0
            r12 = r12 & r14
            r0 = r20
            if (r12 == r0) goto L_0x008b
            if (r0 == r14) goto L_0x0082
            long r0 = (long) r0
            r10.putInt(r5, r0, r8)
        L_0x0082:
            if (r12 == r14) goto L_0x0089
            long r0 = (long) r12
            int r8 = r10.getInt(r5, r0)
        L_0x0089:
            r20 = r12
        L_0x008b:
            r0 = 5
            switch(r15) {
                case 0: goto L_0x0158;
                case 1: goto L_0x0148;
                case 2: goto L_0x0134;
                case 3: goto L_0x0134;
                case 4: goto L_0x00d0;
                case 5: goto L_0x0122;
                case 6: goto L_0x0170;
                case 7: goto L_0x010a;
                case 8: goto L_0x00dd;
                case 9: goto L_0x0098;
                case 10: goto L_0x0090;
                case 11: goto L_0x00d0;
                case 12: goto L_0x00d0;
                case 13: goto L_0x0170;
                case 14: goto L_0x0122;
                case 15: goto L_0x00c1;
                case 16: goto L_0x00b4;
                default: goto L_0x008f;
            }
        L_0x008f:
            goto L_0x0042
        L_0x0090:
            r0 = 2
            if (r9 != r0) goto L_0x0042
            int r9 = X.SU4.A03(r6, r4, r7)
            goto L_0x00f4
        L_0x0098:
            r0 = 2
            if (r9 != r0) goto L_0x0042
            r0 = r38
            X.TjQ r1 = r0.A0D(r11)
            r0 = r37
            int r9 = X.SU4.A00(r6, r1, r4, r7, r0)
            java.lang.Object r1 = r10.getObject(r5, r2)
            if (r1 == 0) goto L_0x00f4
            java.lang.Object r0 = r6.A02
            X.R5b r0 = X.SD9.A00(r1, r0)
            goto L_0x00f6
        L_0x00b4:
            if (r9 != 0) goto L_0x0042
            int r9 = X.SU4.A06(r6, r4, r7)
            long r0 = r6.A01
            long r0 = X.Pxg.A0D(r0)
            goto L_0x013c
        L_0x00c1:
            if (r9 != 0) goto L_0x0042
            int r9 = X.SU4.A05(r6, r4, r7)
            int r0 = r6.A00
            int r1 = r0 >>> 1
            r0 = r0 & 1
            int r0 = -r0
            r0 = r0 ^ r1
            goto L_0x00d8
        L_0x00d0:
            if (r9 != 0) goto L_0x0042
            int r9 = X.SU4.A05(r6, r4, r7)
            int r0 = r6.A00
        L_0x00d8:
            r10.putInt(r5, r2, r0)
            goto L_0x017b
        L_0x00dd:
            r0 = 2
            if (r9 != r0) goto L_0x0042
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r18 = r18 & r0
            if (r18 != 0) goto L_0x0105
            int r9 = X.SU4.A05(r6, r4, r7)
            int r1 = r6.A00
            if (r1 < 0) goto L_0x022b
            if (r1 != 0) goto L_0x00fb
            java.lang.String r0 = ""
            r6.A02 = r0
        L_0x00f4:
            java.lang.Object r0 = r6.A02
        L_0x00f6:
            r10.putObject(r5, r2, r0)
            goto L_0x017b
        L_0x00fb:
            java.nio.charset.Charset r0 = X.SD9.A04
            java.lang.String r0 = X.Pxe.A11(r0, r4, r9, r1)
            r6.A02 = r0
            int r9 = r9 + r1
            goto L_0x00f4
        L_0x0105:
            int r9 = X.SU4.A04(r6, r4, r7)
            goto L_0x00f4
        L_0x010a:
            if (r9 != 0) goto L_0x0042
            int r9 = X.SU4.A06(r6, r4, r7)
            long r0 = r6.A01
            r12 = 0
            int r7 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r7 != 0) goto L_0x011a
            r17 = 0
        L_0x011a:
            X.SK5 r1 = com.google.protobuf.UnsafeUtil.A02
            r0 = r17
            r1.A0H(r5, r2, r0)
            goto L_0x017b
        L_0x0122:
            r0 = r17
            if (r9 != r0) goto L_0x0042
            long r26 = X.SU4.A09(r4, r7)
            r22 = r10
            r23 = r5
            r24 = r2
            r22.putLong(r23, r24, r26)
            goto L_0x016d
        L_0x0134:
            if (r9 != 0) goto L_0x0042
            int r9 = X.SU4.A06(r6, r4, r7)
            long r0 = r6.A01
        L_0x013c:
            r22 = r10
            r23 = r5
            r24 = r2
            r26 = r0
            r22.putLong(r23, r24, r26)
            goto L_0x017b
        L_0x0148:
            if (r9 != r0) goto L_0x0042
            int r0 = X.Pxk.A02(r4, r7)
            float r1 = java.lang.Float.intBitsToFloat(r0)
            X.SK5 r0 = com.google.protobuf.UnsafeUtil.A02
            r0.A0D(r5, r2, r1)
            goto L_0x0179
        L_0x0158:
            r0 = r17
            if (r9 != r0) goto L_0x0042
            long r0 = X.SU4.A09(r4, r7)
            double r26 = java.lang.Double.longBitsToDouble(r0)
            X.SK5 r22 = com.google.protobuf.UnsafeUtil.A02
            r23 = r5
            r24 = r2
            r22.A0C(r23, r24, r26)
        L_0x016d:
            int r9 = r7 + 8
            goto L_0x017b
        L_0x0170:
            if (r9 != r0) goto L_0x0042
            int r0 = X.Pxk.A02(r4, r7)
            r10.putInt(r5, r2, r0)
        L_0x0179:
            int r9 = r7 + 4
        L_0x017b:
            r8 = r8 | r16
            goto L_0x0054
        L_0x017f:
            r0 = 27
            if (r15 != r0) goto L_0x01bd
            r0 = 2
            if (r9 != r0) goto L_0x0042
            java.lang.Object r1 = r10.getObject(r5, r2)
            X.TnY r1 = (X.C13982TnY) r1
            r0 = r1
            X.TRv r0 = (X.C13255TRv) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x019e
            int r0 = X.Pxg.A0A(r1)
            X.TnY r1 = r1.Cop(r0)
            r10.putObject(r5, r2, r1)
        L_0x019e:
            r0 = r38
            X.TjQ r2 = r0.A0D(r11)
        L_0x01a4:
            r0 = r37
            int r9 = X.SU4.A00(r6, r2, r4, r7, r0)
            java.lang.Object r0 = r6.A02
            r1.add(r0)
            r0 = r37
            if (r9 >= r0) goto L_0x0054
            int r7 = X.SU4.A05(r6, r4, r9)
            int r0 = r6.A00
            if (r13 == r0) goto L_0x01a4
            goto L_0x0054
        L_0x01bd:
            r0 = 49
            if (r15 > r0) goto L_0x01e7
            r0 = r18
            long r0 = (long) r0
            r27 = r37
            r28 = r13
            r29 = r19
            r30 = r9
            r31 = r11
            r32 = r15
            r33 = r0
            r35 = r2
            r22 = r38
            r23 = r6
            r24 = r5
            r25 = r4
            r26 = r7
            int r9 = r22.A04(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35)
        L_0x01e2:
            if (r9 != r7) goto L_0x0054
            r7 = r9
            goto L_0x0042
        L_0x01e7:
            r0 = 50
            if (r15 != r0) goto L_0x0203
            r0 = 2
            if (r9 != r0) goto L_0x0042
            r27 = r37
            r28 = r11
            r29 = r2
            r22 = r38
            r23 = r6
            r24 = r5
            r25 = r4
            r26 = r7
            int r9 = r22.A05(r23, r24, r25, r26, r27, r28, r29)
            goto L_0x01e2
        L_0x0203:
            r27 = r37
            r28 = r13
            r29 = r19
            r30 = r9
            r31 = r18
            r32 = r15
            r33 = r11
            r34 = r2
            r22 = r38
            r23 = r6
            r24 = r5
            r25 = r4
            r26 = r7
            int r9 = r22.A03(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x01e2
        L_0x0222:
            r1 = r0
            r0 = r38
            int r11 = r0.A00(r1)
            goto L_0x003d
        L_0x022b:
            X.5I7 r0 = X.AnonymousClass5I7.A01()
            throw r0
        L_0x0230:
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r20
            if (r0 == r1) goto L_0x023b
            long r0 = (long) r0
            r10.putInt(r5, r0, r8)
        L_0x023b:
            r0 = r37
            if (r9 == r0) goto L_0x0251
            java.lang.String r0 = "Failed to parse the message."
            X.5I7 r0 = X.Pxg.A0T(r0)
            throw r0
        L_0x0246:
            r7 = 0
            r1 = r38
            r2 = r6
            r3 = r5
            r5 = r9
            r6 = r37
            r1.A0Q(r2, r3, r4, r5, r6, r7)
        L_0x0251:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T5N.CoA(X.SFF, java.lang.Object, byte[], int, int):void");
    }

    public final Object Cr9() {
        return ((R5b) this.A02).A0K(AnonymousClass05K.A0N, (Object) null, (Object) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0314, code lost:
        if (r0 == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0316, code lost:
        X.C13903TjQ.A00(r6, A0D(r3), A0F(r1, r5), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03a3, code lost:
        if (r0 == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03a5, code lost:
        r0 = r6.A00;
        X.SQE.A08(r0, r2);
        r0.A0H((X.TAP) A0F(r1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03b9, code lost:
        if (r0 == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03bb, code lost:
        r9 = A0F(r1, r5);
        r6.A00.A0G((X.T5J) r9, A0D(r3), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03d0, code lost:
        if (r0 == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03d2, code lost:
        r1 = A0F(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03d8, code lost:
        if ((r1 instanceof java.lang.String) == false) goto L_0x03e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03da, code lost:
        r0 = r6.A00;
        X.SQE.A08(r0, r2);
        r0.A0I((java.lang.String) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03e6, code lost:
        r0 = r6.A00;
        X.SQE.A08(r0, r2);
        r0.A0H((X.TAP) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x042a, code lost:
        r6.A00.A0B(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x043b, code lost:
        r6.A00.A09(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0452, code lost:
        r6.A00.A0C(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0469, code lost:
        r6.A00.A0C(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0480, code lost:
        r6.A00.A08(r2, java.lang.Float.floatToRawIntBits(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x049b, code lost:
        r6.A00.A0B(r2, java.lang.Double.doubleToRawLongBits(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x04db, code lost:
        r3 = r3 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0603, code lost:
        r6.A00.A08(r2, X.AnonymousClass7TE.A0M(X.SK5.A00(r5, r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0618, code lost:
        r6.A00.A0B(r2, X.AnonymousClass7TE.A0R(X.SK5.A00(r5, r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x062d, code lost:
        r6.A00.A09(r2, X.AnonymousClass7TE.A0M(X.SK5.A00(r5, r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0767, code lost:
        X.C11433SUe.A0G(r6, (java.util.List) r4.getObject(r5, r0), r8[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0775, code lost:
        X.C11433SUe.A0I(r6, (java.util.List) r4.getObject(r5, r0), r8[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0783, code lost:
        X.C11433SUe.A0P(r6, (java.util.List) r4.getObject(r5, r0), r8[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0791, code lost:
        X.C11433SUe.A0J(r6, (java.util.List) r4.getObject(r5, r0), r8[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x079f, code lost:
        X.C11433SUe.A0H(r6, (java.util.List) r4.getObject(r5, r0), r8[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x07ad, code lost:
        X.C11433SUe.A0D(r6, (java.util.List) r4.getObject(r5, r0), r8[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x07bb, code lost:
        if (r11 == false) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x07bd, code lost:
        X.C13903TjQ.A00(r6, A0D(r3), r4.getObject(r5, r0), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x082a, code lost:
        if (r11 == false) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x082c, code lost:
        r0 = r6.A00;
        X.SQE.A08(r0, r2);
        r0.A0H((X.TAP) r4.getObject(r5, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x083d, code lost:
        if (r11 == false) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x083f, code lost:
        r11 = r4.getObject(r5, r0);
        r6.A00.A0G((X.T5J) r11, A0D(r3), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0851, code lost:
        if (r11 == false) goto L_0x04db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0853, code lost:
        r1 = r4.getObject(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0859, code lost:
        if ((r1 instanceof java.lang.String) == false) goto L_0x0867;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x085b, code lost:
        r0 = r6.A00;
        X.SQE.A08(r0, r2);
        r0.A0I((java.lang.String) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0867, code lost:
        r0 = r6.A00;
        X.SQE.A08(r0, r2);
        r0.A0H((X.TAP) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        r3 = r3 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FOC(X.C10281Rpf r18, java.lang.Object r19) {
        /*
            r17 = this;
            r5 = r19
            r7 = r17
            boolean r0 = r7.A0E
            r6 = r18
            if (r0 == 0) goto L_0x04a6
            int[] r4 = r7.A04
            int r10 = r4.length
            r8 = 0
            r3 = 0
        L_0x000f:
            if (r3 >= r10) goto L_0x08f4
            int r0 = r3 + 1
            r1 = r4[r0]
            r2 = r4[r3]
            int r0 = X.Pxe.A03(r1)
            r9 = 1
            switch(r0) {
                case 0: goto L_0x048b;
                case 1: goto L_0x0470;
                case 2: goto L_0x0459;
                case 3: goto L_0x0442;
                case 4: goto L_0x0431;
                case 5: goto L_0x041a;
                case 6: goto L_0x0409;
                case 7: goto L_0x03f2;
                case 8: goto L_0x03cc;
                case 9: goto L_0x03b5;
                case 10: goto L_0x039f;
                case 11: goto L_0x038e;
                case 12: goto L_0x037d;
                case 13: goto L_0x036c;
                case 14: goto L_0x0355;
                case 15: goto L_0x0340;
                case 16: goto L_0x0323;
                case 17: goto L_0x0310;
                case 18: goto L_0x01af;
                case 19: goto L_0x01a4;
                case 20: goto L_0x0199;
                case 21: goto L_0x018e;
                case 22: goto L_0x0183;
                case 23: goto L_0x0178;
                case 24: goto L_0x016d;
                case 25: goto L_0x0162;
                case 26: goto L_0x0157;
                case 27: goto L_0x012e;
                case 28: goto L_0x0123;
                case 29: goto L_0x0118;
                case 30: goto L_0x010d;
                case 31: goto L_0x0102;
                case 32: goto L_0x00f7;
                case 33: goto L_0x00ec;
                case 34: goto L_0x00e1;
                case 35: goto L_0x00d6;
                case 36: goto L_0x00cb;
                case 37: goto L_0x00c0;
                case 38: goto L_0x00b5;
                case 39: goto L_0x00aa;
                case 40: goto L_0x009f;
                case 41: goto L_0x0095;
                case 42: goto L_0x008b;
                case 43: goto L_0x0081;
                case 44: goto L_0x0077;
                case 45: goto L_0x006d;
                case 46: goto L_0x0063;
                case 47: goto L_0x0059;
                case 48: goto L_0x004f;
                case 49: goto L_0x002a;
                case 50: goto L_0x0022;
                case 51: goto L_0x0300;
                case 52: goto L_0x02f0;
                case 53: goto L_0x02dc;
                case 54: goto L_0x02c8;
                case 55: goto L_0x02b4;
                case 56: goto L_0x02a0;
                case 57: goto L_0x0287;
                case 58: goto L_0x0272;
                case 59: goto L_0x026c;
                case 60: goto L_0x0266;
                case 61: goto L_0x0260;
                case 62: goto L_0x0247;
                case 63: goto L_0x022e;
                case 64: goto L_0x0215;
                case 65: goto L_0x01fc;
                case 66: goto L_0x01df;
                case 67: goto L_0x01c0;
                case 68: goto L_0x01ba;
                default: goto L_0x001f;
            }
        L_0x001f:
            int r3 = r3 + 3
            goto L_0x000f
        L_0x0022:
            java.lang.Object r0 = A0F(r1, r5)
            r7.A0M(r6, r0, r2, r3)
            goto L_0x001f
        L_0x002a:
            r11 = r4[r3]
            java.util.List r9 = A0I(r1, r5)
            X.TjQ r2 = r7.A0D(r3)
            X.Rzu r0 = X.C11433SUe.A02
            if (r9 == 0) goto L_0x001f
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x001f
            r1 = 0
        L_0x003f:
            int r0 = r9.size()
            if (r1 >= r0) goto L_0x001f
            java.lang.Object r0 = r9.get(r1)
            X.C13903TjQ.A00(r6, r2, r0, r11)
            int r1 = r1 + 1
            goto L_0x003f
        L_0x004f:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0N(r6, r0, r2, r9)
            goto L_0x001f
        L_0x0059:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0M(r6, r0, r2, r9)
            goto L_0x001f
        L_0x0063:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0L(r6, r0, r2, r9)
            goto L_0x001f
        L_0x006d:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0K(r6, r0, r2, r9)
            goto L_0x001f
        L_0x0077:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0E(r6, r0, r2, r9)
            goto L_0x001f
        L_0x0081:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0O(r6, r0, r2, r9)
            goto L_0x001f
        L_0x008b:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0C(r6, r0, r2, r9)
            goto L_0x001f
        L_0x0095:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0F(r6, r0, r2, r9)
            goto L_0x001f
        L_0x009f:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0G(r6, r0, r2, r9)
            goto L_0x001f
        L_0x00aa:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0I(r6, r0, r2, r9)
            goto L_0x001f
        L_0x00b5:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0P(r6, r0, r2, r9)
            goto L_0x001f
        L_0x00c0:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0J(r6, r0, r2, r9)
            goto L_0x001f
        L_0x00cb:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0H(r6, r0, r2, r9)
            goto L_0x001f
        L_0x00d6:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0D(r6, r0, r2, r9)
            goto L_0x001f
        L_0x00e1:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0N(r6, r0, r2, r8)
            goto L_0x001f
        L_0x00ec:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0M(r6, r0, r2, r8)
            goto L_0x001f
        L_0x00f7:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0L(r6, r0, r2, r8)
            goto L_0x001f
        L_0x0102:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0K(r6, r0, r2, r8)
            goto L_0x001f
        L_0x010d:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0E(r6, r0, r2, r8)
            goto L_0x001f
        L_0x0118:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0O(r6, r0, r2, r8)
            goto L_0x001f
        L_0x0123:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0A(r6, r0, r2)
            goto L_0x001f
        L_0x012e:
            r11 = r4[r3]
            java.util.List r12 = A0I(r1, r5)
            X.TjQ r9 = r7.A0D(r3)
            X.Rzu r0 = X.C11433SUe.A02
            if (r12 == 0) goto L_0x001f
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x001f
            r2 = 0
        L_0x0143:
            int r0 = r12.size()
            if (r2 >= r0) goto L_0x001f
            java.lang.Object r1 = r12.get(r2)
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            X.T5J r1 = (X.T5J) r1
            r0.A0G(r1, r9, r11)
            int r2 = r2 + 1
            goto L_0x0143
        L_0x0157:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0B(r6, r0, r2)
            goto L_0x001f
        L_0x0162:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0C(r6, r0, r2, r8)
            goto L_0x001f
        L_0x016d:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0F(r6, r0, r2, r8)
            goto L_0x001f
        L_0x0178:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0G(r6, r0, r2, r8)
            goto L_0x001f
        L_0x0183:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0I(r6, r0, r2, r8)
            goto L_0x001f
        L_0x018e:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0P(r6, r0, r2, r8)
            goto L_0x001f
        L_0x0199:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0J(r6, r0, r2, r8)
            goto L_0x001f
        L_0x01a4:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0H(r6, r0, r2, r8)
            goto L_0x001f
        L_0x01af:
            r2 = r4[r3]
            java.util.List r0 = A0I(r1, r5)
            X.C11433SUe.A0D(r6, r0, r2, r8)
            goto L_0x001f
        L_0x01ba:
            boolean r0 = r7.A0P(r5, r2, r3)
            goto L_0x0314
        L_0x01c0:
            boolean r0 = r7.A0P(r5, r2, r3)
            if (r0 == 0) goto L_0x001f
            long r0 = X.Pxe.A0B(r1)
            java.lang.Object r0 = X.SK5.A00(r5, r0)
            long r0 = X.AnonymousClass7TE.A0R(r0)
            com.google.protobuf.CodedOutputStream r13 = r6.A00
            long r11 = r0 << r9
            r9 = 63
            long r0 = r0 >> r9
            long r0 = r0 ^ r11
            r13.A0C(r2, r0)
            goto L_0x001f
        L_0x01df:
            boolean r0 = r7.A0P(r5, r2, r3)
            if (r0 == 0) goto L_0x001f
            long r0 = X.Pxe.A0B(r1)
            java.lang.Object r0 = X.SK5.A00(r5, r0)
            int r0 = X.AnonymousClass7TE.A0M(r0)
            com.google.protobuf.CodedOutputStream r1 = r6.A00
            int r0 = X.Pxe.A02(r0)
            r1.A0A(r2, r0)
            goto L_0x001f
        L_0x01fc:
            boolean r0 = r7.A0P(r5, r2, r3)
            if (r0 == 0) goto L_0x001f
            long r0 = X.Pxe.A0B(r1)
            java.lang.Object r0 = X.SK5.A00(r5, r0)
            long r0 = X.AnonymousClass7TE.A0R(r0)
            com.google.protobuf.CodedOutputStream r9 = r6.A00
            r9.A0B(r2, r0)
            goto L_0x001f
        L_0x0215:
            boolean r0 = r7.A0P(r5, r2, r3)
            if (r0 == 0) goto L_0x001f
            long r0 = X.Pxe.A0B(r1)
            java.lang.Object r0 = X.SK5.A00(r5, r0)
            int r1 = X.AnonymousClass7TE.A0M(r0)
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            r0.A08(r2, r1)
            goto L_0x001f
        L_0x022e:
            boolean r0 = r7.A0P(r5, r2, r3)
            if (r0 == 0) goto L_0x001f
            long r0 = X.Pxe.A0B(r1)
            java.lang.Object r0 = X.SK5.A00(r5, r0)
            int r1 = X.AnonymousClass7TE.A0M(r0)
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            r0.A09(r2, r1)
            goto L_0x001f
        L_0x0247:
            boolean r0 = r7.A0P(r5, r2, r3)
            if (r0 == 0) goto L_0x001f
            long r0 = X.Pxe.A0B(r1)
            java.lang.Object r0 = X.SK5.A00(r5, r0)
            int r1 = X.AnonymousClass7TE.A0M(r0)
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            r0.A0A(r2, r1)
            goto L_0x001f
        L_0x0260:
            boolean r0 = r7.A0P(r5, r2, r3)
            goto L_0x03a3
        L_0x0266:
            boolean r0 = r7.A0P(r5, r2, r3)
            goto L_0x03b9
        L_0x026c:
            boolean r0 = r7.A0P(r5, r2, r3)
            goto L_0x03d0
        L_0x0272:
            boolean r0 = r7.A0P(r5, r2, r3)
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = A0F(r1, r5)
            boolean r1 = X.AnonymousClass7TE.A1a(r0)
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            r0.A0D(r2, r1)
            goto L_0x001f
        L_0x0287:
            boolean r0 = r7.A0P(r5, r2, r3)
            if (r0 == 0) goto L_0x001f
            long r0 = X.Pxe.A0B(r1)
            java.lang.Object r0 = X.SK5.A00(r5, r0)
            int r1 = X.AnonymousClass7TE.A0M(r0)
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            r0.A08(r2, r1)
            goto L_0x001f
        L_0x02a0:
            boolean r0 = r7.A0P(r5, r2, r3)
            if (r0 == 0) goto L_0x001f
            long r0 = X.Pxe.A0B(r1)
            java.lang.Object r0 = X.SK5.A00(r5, r0)
            long r0 = X.AnonymousClass7TE.A0R(r0)
            goto L_0x042a
        L_0x02b4:
            boolean r0 = r7.A0P(r5, r2, r3)
            if (r0 == 0) goto L_0x001f
            long r0 = X.Pxe.A0B(r1)
            java.lang.Object r0 = X.SK5.A00(r5, r0)
            int r1 = X.AnonymousClass7TE.A0M(r0)
            goto L_0x043b
        L_0x02c8:
            boolean r0 = r7.A0P(r5, r2, r3)
            if (r0 == 0) goto L_0x001f
            long r0 = X.Pxe.A0B(r1)
            java.lang.Object r0 = X.SK5.A00(r5, r0)
            long r0 = X.AnonymousClass7TE.A0R(r0)
            goto L_0x0452
        L_0x02dc:
            boolean r0 = r7.A0P(r5, r2, r3)
            if (r0 == 0) goto L_0x001f
            long r0 = X.Pxe.A0B(r1)
            java.lang.Object r0 = X.SK5.A00(r5, r0)
            long r0 = X.AnonymousClass7TE.A0R(r0)
            goto L_0x0469
        L_0x02f0:
            boolean r0 = r7.A0P(r5, r2, r3)
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = A0F(r1, r5)
            float r0 = X.AnonymousClass7TE.A04(r0)
            goto L_0x0480
        L_0x0300:
            boolean r0 = r7.A0P(r5, r2, r3)
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = A0F(r1, r5)
            double r0 = X.JTO.A00(r0)
            goto L_0x049b
        L_0x0310:
            boolean r0 = r7.A0O(r3, r5)
        L_0x0314:
            if (r0 == 0) goto L_0x001f
            java.lang.Object r1 = A0F(r1, r5)
            X.TjQ r0 = r7.A0D(r3)
            X.C13903TjQ.A00(r6, r0, r1, r2)
            goto L_0x001f
        L_0x0323:
            boolean r0 = r7.A0O(r3, r5)
            if (r0 == 0) goto L_0x001f
            long r0 = X.Pxe.A0B(r1)
            X.SK5 r11 = com.google.protobuf.UnsafeUtil.A02
            long r0 = r11.A07(r5, r0)
            com.google.protobuf.CodedOutputStream r13 = r6.A00
            long r11 = r0 << r9
            r9 = 63
            long r0 = r0 >> r9
            long r0 = r0 ^ r11
            r13.A0C(r2, r0)
            goto L_0x001f
        L_0x0340:
            boolean r0 = r7.A0O(r3, r5)
            if (r0 == 0) goto L_0x001f
            int r0 = A07(r5, r1)
            com.google.protobuf.CodedOutputStream r1 = r6.A00
            int r0 = X.Pxe.A02(r0)
            r1.A0A(r2, r0)
            goto L_0x001f
        L_0x0355:
            boolean r0 = r7.A0O(r3, r5)
            if (r0 == 0) goto L_0x001f
            long r0 = X.Pxe.A0B(r1)
            X.SK5 r9 = com.google.protobuf.UnsafeUtil.A02
            long r0 = r9.A07(r5, r0)
            com.google.protobuf.CodedOutputStream r9 = r6.A00
            r9.A0B(r2, r0)
            goto L_0x001f
        L_0x036c:
            boolean r0 = r7.A0O(r3, r5)
            if (r0 == 0) goto L_0x001f
            int r1 = A07(r5, r1)
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            r0.A08(r2, r1)
            goto L_0x001f
        L_0x037d:
            boolean r0 = r7.A0O(r3, r5)
            if (r0 == 0) goto L_0x001f
            int r1 = A07(r5, r1)
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            r0.A09(r2, r1)
            goto L_0x001f
        L_0x038e:
            boolean r0 = r7.A0O(r3, r5)
            if (r0 == 0) goto L_0x001f
            int r1 = A07(r5, r1)
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            r0.A0A(r2, r1)
            goto L_0x001f
        L_0x039f:
            boolean r0 = r7.A0O(r3, r5)
        L_0x03a3:
            if (r0 == 0) goto L_0x001f
            java.lang.Object r1 = A0F(r1, r5)
            X.TAP r1 = (X.TAP) r1
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            X.SQE.A08(r0, r2)
            r0.A0H(r1)
            goto L_0x001f
        L_0x03b5:
            boolean r0 = r7.A0O(r3, r5)
        L_0x03b9:
            if (r0 == 0) goto L_0x001f
            java.lang.Object r9 = A0F(r1, r5)
            X.TjQ r1 = r7.A0D(r3)
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            X.T5J r9 = (X.T5J) r9
            r0.A0G(r9, r1, r2)
            goto L_0x001f
        L_0x03cc:
            boolean r0 = r7.A0O(r3, r5)
        L_0x03d0:
            if (r0 == 0) goto L_0x001f
            java.lang.Object r1 = A0F(r1, r5)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x03e6
            java.lang.String r1 = (java.lang.String) r1
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            X.SQE.A08(r0, r2)
            r0.A0I(r1)
            goto L_0x001f
        L_0x03e6:
            X.TAP r1 = (X.TAP) r1
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            X.SQE.A08(r0, r2)
            r0.A0H(r1)
            goto L_0x001f
        L_0x03f2:
            boolean r0 = r7.A0O(r3, r5)
            if (r0 == 0) goto L_0x001f
            long r0 = X.Pxe.A0B(r1)
            X.SK5 r9 = com.google.protobuf.UnsafeUtil.A02
            boolean r1 = r9.A0L(r5, r0)
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            r0.A0D(r2, r1)
            goto L_0x001f
        L_0x0409:
            boolean r0 = r7.A0O(r3, r5)
            if (r0 == 0) goto L_0x001f
            int r1 = A07(r5, r1)
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            r0.A08(r2, r1)
            goto L_0x001f
        L_0x041a:
            boolean r0 = r7.A0O(r3, r5)
            if (r0 == 0) goto L_0x001f
            long r0 = X.Pxe.A0B(r1)
            X.SK5 r9 = com.google.protobuf.UnsafeUtil.A02
            long r0 = r9.A07(r5, r0)
        L_0x042a:
            com.google.protobuf.CodedOutputStream r9 = r6.A00
            r9.A0B(r2, r0)
            goto L_0x001f
        L_0x0431:
            boolean r0 = r7.A0O(r3, r5)
            if (r0 == 0) goto L_0x001f
            int r1 = A07(r5, r1)
        L_0x043b:
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            r0.A09(r2, r1)
            goto L_0x001f
        L_0x0442:
            boolean r0 = r7.A0O(r3, r5)
            if (r0 == 0) goto L_0x001f
            long r0 = X.Pxe.A0B(r1)
            X.SK5 r9 = com.google.protobuf.UnsafeUtil.A02
            long r0 = r9.A07(r5, r0)
        L_0x0452:
            com.google.protobuf.CodedOutputStream r9 = r6.A00
            r9.A0C(r2, r0)
            goto L_0x001f
        L_0x0459:
            boolean r0 = r7.A0O(r3, r5)
            if (r0 == 0) goto L_0x001f
            long r0 = X.Pxe.A0B(r1)
            X.SK5 r9 = com.google.protobuf.UnsafeUtil.A02
            long r0 = r9.A07(r5, r0)
        L_0x0469:
            com.google.protobuf.CodedOutputStream r9 = r6.A00
            r9.A0C(r2, r0)
            goto L_0x001f
        L_0x0470:
            boolean r0 = r7.A0O(r3, r5)
            if (r0 == 0) goto L_0x001f
            long r0 = X.Pxe.A0B(r1)
            X.SK5 r9 = com.google.protobuf.UnsafeUtil.A02
            float r0 = r9.A04(r5, r0)
        L_0x0480:
            com.google.protobuf.CodedOutputStream r1 = r6.A00
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r1.A08(r2, r0)
            goto L_0x001f
        L_0x048b:
            boolean r0 = r7.A0O(r3, r5)
            if (r0 == 0) goto L_0x001f
            long r0 = X.Pxe.A0B(r1)
            X.SK5 r9 = com.google.protobuf.UnsafeUtil.A02
            double r0 = r9.A03(r5, r0)
        L_0x049b:
            com.google.protobuf.CodedOutputStream r9 = r6.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            r9.A0B(r2, r0)
            goto L_0x001f
        L_0x04a6:
            int[] r8 = r7.A04
            int r10 = r8.length
            sun.misc.Unsafe r4 = A0F
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r15 = 0
        L_0x04b3:
            if (r3 >= r10) goto L_0x08f4
            int r0 = r3 + 1
            r13 = r8[r0]
            r2 = r8[r3]
            int r12 = X.Pxe.A03(r13)
            r0 = 17
            if (r12 > r0) goto L_0x08f1
            int r0 = r3 + 2
            r14 = r8[r0]
            r11 = r14 & r16
            if (r11 == r9) goto L_0x04d1
            long r0 = (long) r11
            int r15 = r4.getInt(r5, r0)
            r9 = r11
        L_0x04d1:
            int r0 = r14 >>> 20
            r11 = 1
            int r11 = r11 << r0
        L_0x04d5:
            r13 = r13 & r16
            long r0 = (long) r13
            switch(r12) {
                case 0: goto L_0x08dd;
                case 1: goto L_0x08c9;
                case 2: goto L_0x08bb;
                case 3: goto L_0x08ad;
                case 4: goto L_0x089f;
                case 5: goto L_0x0891;
                case 6: goto L_0x0883;
                case 7: goto L_0x0873;
                case 8: goto L_0x0850;
                case 9: goto L_0x083c;
                case 10: goto L_0x0829;
                case 11: goto L_0x081b;
                case 12: goto L_0x080d;
                case 13: goto L_0x07ff;
                case 14: goto L_0x07f1;
                case 15: goto L_0x07df;
                case 16: goto L_0x07ca;
                case 17: goto L_0x07ba;
                case 18: goto L_0x07ac;
                case 19: goto L_0x079e;
                case 20: goto L_0x0790;
                case 21: goto L_0x0782;
                case 22: goto L_0x0774;
                case 23: goto L_0x0766;
                case 24: goto L_0x0758;
                case 25: goto L_0x0563;
                case 26: goto L_0x0556;
                case 27: goto L_0x052b;
                case 28: goto L_0x051f;
                case 29: goto L_0x074a;
                case 30: goto L_0x073c;
                case 31: goto L_0x072e;
                case 32: goto L_0x0720;
                case 33: goto L_0x0712;
                case 34: goto L_0x0512;
                case 35: goto L_0x070f;
                case 36: goto L_0x070c;
                case 37: goto L_0x0709;
                case 38: goto L_0x0707;
                case 39: goto L_0x0705;
                case 40: goto L_0x0703;
                case 41: goto L_0x06f5;
                case 42: goto L_0x06e7;
                case 43: goto L_0x06d9;
                case 44: goto L_0x06cb;
                case 45: goto L_0x06bd;
                case 46: goto L_0x06af;
                case 47: goto L_0x06a1;
                case 48: goto L_0x0505;
                case 49: goto L_0x04de;
                case 50: goto L_0x0698;
                case 51: goto L_0x067f;
                case 52: goto L_0x0666;
                case 53: goto L_0x0651;
                case 54: goto L_0x063c;
                case 55: goto L_0x0627;
                case 56: goto L_0x0612;
                case 57: goto L_0x05fd;
                case 58: goto L_0x05e8;
                case 59: goto L_0x05e2;
                case 60: goto L_0x05dc;
                case 61: goto L_0x05d6;
                case 62: goto L_0x05c1;
                case 63: goto L_0x05ba;
                case 64: goto L_0x05b3;
                case 65: goto L_0x05ac;
                case 66: goto L_0x0593;
                case 67: goto L_0x0577;
                case 68: goto L_0x0571;
                default: goto L_0x04db;
            }
        L_0x04db:
            int r3 = r3 + 3
            goto L_0x04b3
        L_0x04de:
            r2 = r8[r3]
            java.lang.Object r12 = r4.getObject(r5, r0)
            java.util.List r12 = (java.util.List) r12
            X.TjQ r11 = r7.A0D(r3)
            X.Rzu r0 = X.C11433SUe.A02
            if (r12 == 0) goto L_0x04db
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x04db
            r1 = 0
        L_0x04f5:
            int r0 = r12.size()
            if (r1 >= r0) goto L_0x04db
            java.lang.Object r0 = r12.get(r1)
            X.C13903TjQ.A00(r6, r11, r0, r2)
            int r1 = r1 + 1
            goto L_0x04f5
        L_0x0505:
            r2 = r8[r3]
            java.lang.Object r1 = r4.getObject(r5, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 1
            X.C11433SUe.A0N(r6, r1, r2, r0)
            goto L_0x04db
        L_0x0512:
            r2 = r8[r3]
            java.lang.Object r1 = r4.getObject(r5, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            X.C11433SUe.A0N(r6, r1, r2, r0)
            goto L_0x04db
        L_0x051f:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C11433SUe.A0A(r6, r0, r2)
            goto L_0x04db
        L_0x052b:
            r11 = r8[r3]
            java.lang.Object r13 = r4.getObject(r5, r0)
            java.util.List r13 = (java.util.List) r13
            X.TjQ r12 = r7.A0D(r3)
            X.Rzu r0 = X.C11433SUe.A02
            if (r13 == 0) goto L_0x04db
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x04db
            r2 = 0
        L_0x0542:
            int r0 = r13.size()
            if (r2 >= r0) goto L_0x04db
            java.lang.Object r1 = r13.get(r2)
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            X.T5J r1 = (X.T5J) r1
            r0.A0G(r1, r12, r11)
            int r2 = r2 + 1
            goto L_0x0542
        L_0x0556:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C11433SUe.A0B(r6, r0, r2)
            goto L_0x04db
        L_0x0563:
            r2 = r8[r3]
            java.lang.Object r1 = r4.getObject(r5, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            X.C11433SUe.A0C(r6, r1, r2, r0)
            goto L_0x04db
        L_0x0571:
            boolean r11 = r7.A0P(r5, r2, r3)
            goto L_0x07bb
        L_0x0577:
            boolean r11 = r7.A0P(r5, r2, r3)
            if (r11 == 0) goto L_0x04db
            java.lang.Object r0 = X.SK5.A00(r5, r0)
            long r0 = X.AnonymousClass7TE.A0R(r0)
            com.google.protobuf.CodedOutputStream r14 = r6.A00
            r11 = 1
            long r12 = r0 << r11
            r11 = 63
            long r0 = r0 >> r11
            long r0 = r0 ^ r12
            r14.A0C(r2, r0)
            goto L_0x04db
        L_0x0593:
            boolean r11 = r7.A0P(r5, r2, r3)
            if (r11 == 0) goto L_0x04db
            java.lang.Object r0 = X.SK5.A00(r5, r0)
            int r0 = X.AnonymousClass7TE.A0M(r0)
            com.google.protobuf.CodedOutputStream r1 = r6.A00
            int r0 = X.Pxe.A02(r0)
            r1.A0A(r2, r0)
            goto L_0x04db
        L_0x05ac:
            boolean r11 = r7.A0P(r5, r2, r3)
            if (r11 == 0) goto L_0x04db
            goto L_0x0618
        L_0x05b3:
            boolean r11 = r7.A0P(r5, r2, r3)
            if (r11 == 0) goto L_0x04db
            goto L_0x0603
        L_0x05ba:
            boolean r11 = r7.A0P(r5, r2, r3)
            if (r11 == 0) goto L_0x04db
            goto L_0x062d
        L_0x05c1:
            boolean r11 = r7.A0P(r5, r2, r3)
            if (r11 == 0) goto L_0x04db
            java.lang.Object r0 = X.SK5.A00(r5, r0)
            int r1 = X.AnonymousClass7TE.A0M(r0)
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            r0.A0A(r2, r1)
            goto L_0x04db
        L_0x05d6:
            boolean r11 = r7.A0P(r5, r2, r3)
            goto L_0x082a
        L_0x05dc:
            boolean r11 = r7.A0P(r5, r2, r3)
            goto L_0x083d
        L_0x05e2:
            boolean r11 = r7.A0P(r5, r2, r3)
            goto L_0x0851
        L_0x05e8:
            boolean r11 = r7.A0P(r5, r2, r3)
            if (r11 == 0) goto L_0x04db
            java.lang.Object r0 = X.SK5.A00(r5, r0)
            boolean r1 = X.AnonymousClass7TE.A1a(r0)
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            r0.A0D(r2, r1)
            goto L_0x04db
        L_0x05fd:
            boolean r11 = r7.A0P(r5, r2, r3)
            if (r11 == 0) goto L_0x04db
        L_0x0603:
            java.lang.Object r0 = X.SK5.A00(r5, r0)
            int r1 = X.AnonymousClass7TE.A0M(r0)
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            r0.A08(r2, r1)
            goto L_0x04db
        L_0x0612:
            boolean r11 = r7.A0P(r5, r2, r3)
            if (r11 == 0) goto L_0x04db
        L_0x0618:
            java.lang.Object r0 = X.SK5.A00(r5, r0)
            long r0 = X.AnonymousClass7TE.A0R(r0)
            com.google.protobuf.CodedOutputStream r11 = r6.A00
            r11.A0B(r2, r0)
            goto L_0x04db
        L_0x0627:
            boolean r11 = r7.A0P(r5, r2, r3)
            if (r11 == 0) goto L_0x04db
        L_0x062d:
            java.lang.Object r0 = X.SK5.A00(r5, r0)
            int r1 = X.AnonymousClass7TE.A0M(r0)
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            r0.A09(r2, r1)
            goto L_0x04db
        L_0x063c:
            boolean r11 = r7.A0P(r5, r2, r3)
            if (r11 == 0) goto L_0x04db
            java.lang.Object r0 = X.SK5.A00(r5, r0)
            long r0 = X.AnonymousClass7TE.A0R(r0)
            com.google.protobuf.CodedOutputStream r11 = r6.A00
            r11.A0C(r2, r0)
            goto L_0x04db
        L_0x0651:
            boolean r11 = r7.A0P(r5, r2, r3)
            if (r11 == 0) goto L_0x04db
            java.lang.Object r0 = X.SK5.A00(r5, r0)
            long r0 = X.AnonymousClass7TE.A0R(r0)
            com.google.protobuf.CodedOutputStream r11 = r6.A00
            r11.A0C(r2, r0)
            goto L_0x04db
        L_0x0666:
            boolean r11 = r7.A0P(r5, r2, r3)
            if (r11 == 0) goto L_0x04db
            java.lang.Object r0 = X.SK5.A00(r5, r0)
            float r0 = X.AnonymousClass7TE.A04(r0)
            com.google.protobuf.CodedOutputStream r1 = r6.A00
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r1.A08(r2, r0)
            goto L_0x04db
        L_0x067f:
            boolean r11 = r7.A0P(r5, r2, r3)
            if (r11 == 0) goto L_0x04db
            java.lang.Object r0 = X.SK5.A00(r5, r0)
            double r0 = X.JTO.A00(r0)
            com.google.protobuf.CodedOutputStream r11 = r6.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            r11.A0B(r2, r0)
            goto L_0x04db
        L_0x0698:
            java.lang.Object r0 = r4.getObject(r5, r0)
            r7.A0M(r6, r0, r2, r3)
            goto L_0x04db
        L_0x06a1:
            r11 = 1
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C11433SUe.A0M(r6, r0, r2, r11)
            goto L_0x04db
        L_0x06af:
            r11 = 1
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C11433SUe.A0L(r6, r0, r2, r11)
            goto L_0x04db
        L_0x06bd:
            r11 = 1
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C11433SUe.A0K(r6, r0, r2, r11)
            goto L_0x04db
        L_0x06cb:
            r11 = 1
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C11433SUe.A0E(r6, r0, r2, r11)
            goto L_0x04db
        L_0x06d9:
            r11 = 1
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C11433SUe.A0O(r6, r0, r2, r11)
            goto L_0x04db
        L_0x06e7:
            r11 = 1
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C11433SUe.A0C(r6, r0, r2, r11)
            goto L_0x04db
        L_0x06f5:
            r11 = 1
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C11433SUe.A0F(r6, r0, r2, r11)
            goto L_0x04db
        L_0x0703:
            r11 = 1
            goto L_0x0767
        L_0x0705:
            r11 = 1
            goto L_0x0775
        L_0x0707:
            r11 = 1
            goto L_0x0783
        L_0x0709:
            r11 = 1
            goto L_0x0791
        L_0x070c:
            r11 = 1
            goto L_0x079f
        L_0x070f:
            r11 = 1
            goto L_0x07ad
        L_0x0712:
            r11 = 0
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C11433SUe.A0M(r6, r0, r2, r11)
            goto L_0x04db
        L_0x0720:
            r11 = 0
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C11433SUe.A0L(r6, r0, r2, r11)
            goto L_0x04db
        L_0x072e:
            r11 = 0
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C11433SUe.A0K(r6, r0, r2, r11)
            goto L_0x04db
        L_0x073c:
            r11 = 0
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C11433SUe.A0E(r6, r0, r2, r11)
            goto L_0x04db
        L_0x074a:
            r11 = 0
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C11433SUe.A0O(r6, r0, r2, r11)
            goto L_0x04db
        L_0x0758:
            r11 = 0
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C11433SUe.A0F(r6, r0, r2, r11)
            goto L_0x04db
        L_0x0766:
            r11 = 0
        L_0x0767:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C11433SUe.A0G(r6, r0, r2, r11)
            goto L_0x04db
        L_0x0774:
            r11 = 0
        L_0x0775:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C11433SUe.A0I(r6, r0, r2, r11)
            goto L_0x04db
        L_0x0782:
            r11 = 0
        L_0x0783:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C11433SUe.A0P(r6, r0, r2, r11)
            goto L_0x04db
        L_0x0790:
            r11 = 0
        L_0x0791:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C11433SUe.A0J(r6, r0, r2, r11)
            goto L_0x04db
        L_0x079e:
            r11 = 0
        L_0x079f:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C11433SUe.A0H(r6, r0, r2, r11)
            goto L_0x04db
        L_0x07ac:
            r11 = 0
        L_0x07ad:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C11433SUe.A0D(r6, r0, r2, r11)
            goto L_0x04db
        L_0x07ba:
            r11 = r11 & r15
        L_0x07bb:
            if (r11 == 0) goto L_0x04db
            java.lang.Object r1 = r4.getObject(r5, r0)
            X.TjQ r0 = r7.A0D(r3)
            X.C13903TjQ.A00(r6, r0, r1, r2)
            goto L_0x04db
        L_0x07ca:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04db
            long r0 = r4.getLong(r5, r0)
            com.google.protobuf.CodedOutputStream r14 = r6.A00
            r11 = 1
            long r12 = r0 << r11
            r11 = 63
            long r0 = r0 >> r11
            long r0 = r0 ^ r12
            r14.A0C(r2, r0)
            goto L_0x04db
        L_0x07df:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04db
            int r0 = r4.getInt(r5, r0)
            com.google.protobuf.CodedOutputStream r1 = r6.A00
            int r0 = X.Pxe.A02(r0)
            r1.A0A(r2, r0)
            goto L_0x04db
        L_0x07f1:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04db
            long r0 = r4.getLong(r5, r0)
            com.google.protobuf.CodedOutputStream r11 = r6.A00
            r11.A0B(r2, r0)
            goto L_0x04db
        L_0x07ff:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04db
            int r1 = r4.getInt(r5, r0)
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            r0.A08(r2, r1)
            goto L_0x04db
        L_0x080d:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04db
            int r1 = r4.getInt(r5, r0)
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            r0.A09(r2, r1)
            goto L_0x04db
        L_0x081b:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04db
            int r1 = r4.getInt(r5, r0)
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            r0.A0A(r2, r1)
            goto L_0x04db
        L_0x0829:
            r11 = r11 & r15
        L_0x082a:
            if (r11 == 0) goto L_0x04db
            java.lang.Object r1 = r4.getObject(r5, r0)
            X.TAP r1 = (X.TAP) r1
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            X.SQE.A08(r0, r2)
            r0.A0H(r1)
            goto L_0x04db
        L_0x083c:
            r11 = r11 & r15
        L_0x083d:
            if (r11 == 0) goto L_0x04db
            java.lang.Object r11 = r4.getObject(r5, r0)
            X.TjQ r1 = r7.A0D(r3)
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            X.T5J r11 = (X.T5J) r11
            r0.A0G(r11, r1, r2)
            goto L_0x04db
        L_0x0850:
            r11 = r11 & r15
        L_0x0851:
            if (r11 == 0) goto L_0x04db
            java.lang.Object r1 = r4.getObject(r5, r0)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0867
            java.lang.String r1 = (java.lang.String) r1
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            X.SQE.A08(r0, r2)
            r0.A0I(r1)
            goto L_0x04db
        L_0x0867:
            X.TAP r1 = (X.TAP) r1
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            X.SQE.A08(r0, r2)
            r0.A0H(r1)
            goto L_0x04db
        L_0x0873:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04db
            X.SK5 r11 = com.google.protobuf.UnsafeUtil.A02
            boolean r1 = r11.A0L(r5, r0)
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            r0.A0D(r2, r1)
            goto L_0x04db
        L_0x0883:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04db
            int r1 = r4.getInt(r5, r0)
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            r0.A08(r2, r1)
            goto L_0x04db
        L_0x0891:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04db
            long r0 = r4.getLong(r5, r0)
            com.google.protobuf.CodedOutputStream r11 = r6.A00
            r11.A0B(r2, r0)
            goto L_0x04db
        L_0x089f:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04db
            int r1 = r4.getInt(r5, r0)
            com.google.protobuf.CodedOutputStream r0 = r6.A00
            r0.A09(r2, r1)
            goto L_0x04db
        L_0x08ad:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04db
            long r0 = r4.getLong(r5, r0)
            com.google.protobuf.CodedOutputStream r11 = r6.A00
            r11.A0C(r2, r0)
            goto L_0x04db
        L_0x08bb:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04db
            long r0 = r4.getLong(r5, r0)
            com.google.protobuf.CodedOutputStream r11 = r6.A00
            r11.A0C(r2, r0)
            goto L_0x04db
        L_0x08c9:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04db
            X.SK5 r11 = com.google.protobuf.UnsafeUtil.A02
            float r0 = r11.A04(r5, r0)
            com.google.protobuf.CodedOutputStream r1 = r6.A00
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r1.A08(r2, r0)
            goto L_0x04db
        L_0x08dd:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04db
            X.SK5 r11 = com.google.protobuf.UnsafeUtil.A02
            double r0 = r11.A03(r5, r0)
            com.google.protobuf.CodedOutputStream r11 = r6.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            r11.A0B(r2, r0)
            goto L_0x04db
        L_0x08f1:
            r11 = 0
            goto L_0x04d5
        L_0x08f4:
            X.R5b r5 = (X.R5b) r5
            X.SJn r0 = r5.unknownFields
            r0.A02(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T5N.FOC(X.Rpf, java.lang.Object):void");
    }

    public T5N(T5J t5j, C9748Rg6 rg6, C10899Rzz rzz, C11309SKx sKx, C9749Rg7 rg7, C10894Rzu rzu, int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, int i3, int i4, boolean z) {
        this.A04 = iArr;
        this.A06 = objArr;
        this.A08 = i;
        this.A07 = i2;
        this.A0D = t5j instanceof R5b;
        this.A0E = z;
        this.A05 = iArr2;
        this.A00 = i3;
        this.A01 = i4;
        this.A0B = rg7;
        this.A03 = rzz;
        this.A0C = rzu;
        this.A09 = rg6;
        this.A02 = t5j;
        this.A0A = sKx;
    }

    public static int A07(Object obj, int i) {
        return UnsafeUtil.A02.A06(obj, (long) (i & 1048575));
    }

    public static long A08(SUM sum, int i) {
        long j = (long) (i & 1048575);
        SUM.A0A(sum, 0);
        return j;
    }

    public static long A09(SUM sum, int i) {
        long j = (long) (i & 1048575);
        SUM.A0A(sum, 1);
        return j;
    }

    public static long A0A(SUM sum, int i) {
        long j = (long) (i & 1048575);
        SUM.A0A(sum, 5);
        return j;
    }

    public static Object A0F(int i, Object obj) {
        return UnsafeUtil.A02.A09(obj, (long) (i & 1048575));
    }

    public static List A0I(int i, Object obj) {
        return (List) UnsafeUtil.A02.A09(obj, (long) (i & 1048575));
    }

    public final boolean CVR(Object obj) {
        boolean z;
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        while (i3 < this.A00) {
            int i4 = this.A05[i3];
            int[] iArr = this.A04;
            int i5 = iArr[i4];
            int i6 = iArr[i4 + 1];
            int i7 = iArr[i4 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 == i) {
                i8 = i;
            } else if (i8 != 1048575) {
                i2 = A0F.getInt(obj, (long) i8);
            }
            if ((268435456 & i6) != 0) {
                if (i8 == 1048575) {
                    if (!A0O(i4, obj)) {
                        return false;
                    }
                } else if ((i2 & i9) == 0) {
                    return false;
                }
            }
            int A032 = Pxe.A03(i6);
            if (A032 != 9 && A032 != 17) {
                if (A032 != 27) {
                    if (A032 == 60 || A032 == 68) {
                        z = A0P(obj, i5, i4);
                    } else if (A032 != 49) {
                        if (A032 == 50) {
                            TSY tsy = (TSY) SK5.A00(obj, (long) (i6 & 1048575));
                            if (!tsy.isEmpty() && ((C10616RvA) this.A06[(i4 / 3) * 2]).A00.A01.A01 == RFS.MESSAGE) {
                                C13903TjQ tjQ = null;
                                Iterator A0v = AnonymousClass7TF.A0v(tsy);
                                while (A0v.hasNext()) {
                                    Object next = A0v.next();
                                    if (tjQ == null) {
                                        tjQ = Pxg.A0U(next);
                                    }
                                    if (!tjQ.CVR(next)) {
                                        return false;
                                    }
                                }
                                continue;
                            }
                        } else {
                            continue;
                        }
                        i3++;
                        i = i8;
                    }
                }
                List list = (List) SK5.A00(obj, (long) (i6 & 1048575));
                if (!list.isEmpty()) {
                    C13903TjQ A0D2 = A0D(i4);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!A0D2.CVR(list.get(i10))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
                i3++;
                i = i8;
            } else if (i8 == 1048575) {
                z = A0O(i4, obj);
            } else {
                z = i2 & i9;
            }
            if (z && !A0D(i4).CVR(SK5.A00(obj, (long) (i6 & 1048575)))) {
                return false;
            }
            i3++;
            i = i8;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0125, code lost:
        com.google.protobuf.UnsafeUtil.A05(r12, (long) r1, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Co5(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            r13.getClass()
            r2 = 0
        L_0x0004:
            int[] r5 = r11.A04
            int r0 = r5.length
            r6 = r12
            if (r2 >= r0) goto L_0x0151
            int r0 = r2 + 1
            r0 = r5[r0]
            long r7 = X.Pxe.A0B(r0)
            r4 = r5[r2]
            int r0 = X.Pxe.A03(r0)
            switch(r0) {
                case 0: goto L_0x00ed;
                case 1: goto L_0x00dd;
                case 2: goto L_0x00cd;
                case 3: goto L_0x00cd;
                case 4: goto L_0x00bd;
                case 5: goto L_0x00cd;
                case 6: goto L_0x00bd;
                case 7: goto L_0x00ac;
                case 8: goto L_0x00a0;
                case 9: goto L_0x012e;
                case 10: goto L_0x00a0;
                case 11: goto L_0x00bd;
                case 12: goto L_0x00bd;
                case 13: goto L_0x00bd;
                case 14: goto L_0x00cd;
                case 15: goto L_0x00bd;
                case 16: goto L_0x00cd;
                case 17: goto L_0x012e;
                case 18: goto L_0x0049;
                case 19: goto L_0x0049;
                case 20: goto L_0x0049;
                case 21: goto L_0x0049;
                case 22: goto L_0x0049;
                case 23: goto L_0x0049;
                case 24: goto L_0x0049;
                case 25: goto L_0x0049;
                case 26: goto L_0x0049;
                case 27: goto L_0x0049;
                case 28: goto L_0x0049;
                case 29: goto L_0x0049;
                case 30: goto L_0x0049;
                case 31: goto L_0x0049;
                case 32: goto L_0x0049;
                case 33: goto L_0x0049;
                case 34: goto L_0x0049;
                case 35: goto L_0x0049;
                case 36: goto L_0x0049;
                case 37: goto L_0x0049;
                case 38: goto L_0x0049;
                case 39: goto L_0x0049;
                case 40: goto L_0x0049;
                case 41: goto L_0x0049;
                case 42: goto L_0x0049;
                case 43: goto L_0x0049;
                case 44: goto L_0x0049;
                case 45: goto L_0x0049;
                case 46: goto L_0x0049;
                case 47: goto L_0x0049;
                case 48: goto L_0x0049;
                case 49: goto L_0x0049;
                case 50: goto L_0x0035;
                case 51: goto L_0x001e;
                case 52: goto L_0x001e;
                case 53: goto L_0x001e;
                case 54: goto L_0x001e;
                case 55: goto L_0x001e;
                case 56: goto L_0x001e;
                case 57: goto L_0x001e;
                case 58: goto L_0x001e;
                case 59: goto L_0x001e;
                case 60: goto L_0x00fd;
                case 61: goto L_0x001e;
                case 62: goto L_0x001e;
                case 63: goto L_0x001e;
                case 64: goto L_0x001e;
                case 65: goto L_0x001e;
                case 66: goto L_0x001e;
                case 67: goto L_0x001e;
                case 68: goto L_0x00fd;
                default: goto L_0x001b;
            }
        L_0x001b:
            int r2 = r2 + 3
            goto L_0x0004
        L_0x001e:
            boolean r0 = r11.A0P(r13, r4, r2)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = X.SK5.A00(r13, r7)
            com.google.protobuf.UnsafeUtil.A06(r12, r7, r0)
            int r0 = r2 + 2
            r1 = r5[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            goto L_0x0125
        L_0x0035:
            X.Rzu r0 = X.C11433SUe.A02
            X.SK5 r0 = com.google.protobuf.UnsafeUtil.A02
            java.lang.Object r1 = r0.A09(r12, r7)
            java.lang.Object r0 = r0.A09(r13, r7)
            X.TSY r0 = X.C11309SKx.A01(r1, r0)
            com.google.protobuf.UnsafeUtil.A06(r12, r7, r0)
            goto L_0x001b
        L_0x0049:
            X.Rzz r0 = r11.A03
            boolean r0 = r0 instanceof X.R5d
            if (r0 == 0) goto L_0x007d
            X.SK5 r0 = com.google.protobuf.UnsafeUtil.A02
            java.lang.Object r5 = r0.A09(r12, r7)
            X.TnY r5 = (X.C13982TnY) r5
            java.lang.Object r4 = r0.A09(r13, r7)
            java.util.List r4 = (java.util.List) r4
            int r3 = r5.size()
            int r1 = r4.size()
            if (r3 <= 0) goto L_0x0079
            if (r1 <= 0) goto L_0x0078
            r0 = r5
            X.TRv r0 = (X.C13255TRv) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0075
            int r1 = r1 + r3
            X.TnY r5 = r5.Cop(r1)
        L_0x0075:
            r5.addAll(r4)
        L_0x0078:
            r4 = r5
        L_0x0079:
            com.google.protobuf.UnsafeUtil.A06(r12, r7, r4)
            goto L_0x001b
        L_0x007d:
            java.lang.Object r4 = X.SK5.A00(r13, r7)
            java.util.List r4 = (java.util.List) r4
            int r0 = r4.size()
            java.util.List r3 = X.R5e.A00(r12, r0, r7)
            int r1 = r3.size()
            int r0 = r4.size()
            if (r1 <= 0) goto L_0x009b
            if (r0 <= 0) goto L_0x009a
            r3.addAll(r4)
        L_0x009a:
            r4 = r3
        L_0x009b:
            com.google.protobuf.UnsafeUtil.A06(r12, r7, r4)
            goto L_0x001b
        L_0x00a0:
            boolean r0 = r11.A0O(r2, r13)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = X.SK5.A00(r13, r7)
            goto L_0x0146
        L_0x00ac:
            boolean r0 = r11.A0O(r2, r13)
            if (r0 == 0) goto L_0x001b
            X.SK5 r1 = com.google.protobuf.UnsafeUtil.A02
            boolean r0 = r1.A0L(r13, r7)
            r1.A0H(r12, r7, r0)
            goto L_0x0149
        L_0x00bd:
            boolean r0 = r11.A0O(r2, r13)
            if (r0 == 0) goto L_0x001b
            X.SK5 r0 = com.google.protobuf.UnsafeUtil.A02
            int r0 = r0.A06(r13, r7)
            com.google.protobuf.UnsafeUtil.A05(r12, r7, r0)
            goto L_0x0149
        L_0x00cd:
            boolean r0 = r11.A0O(r2, r13)
            if (r0 == 0) goto L_0x001b
            X.SK5 r5 = com.google.protobuf.UnsafeUtil.A02
            long r9 = r5.A07(r13, r7)
            r5.A0F(r6, r7, r9)
            goto L_0x0149
        L_0x00dd:
            boolean r0 = r11.A0O(r2, r13)
            if (r0 == 0) goto L_0x001b
            X.SK5 r1 = com.google.protobuf.UnsafeUtil.A02
            float r0 = r1.A04(r13, r7)
            r1.A0D(r12, r7, r0)
            goto L_0x0149
        L_0x00ed:
            boolean r0 = r11.A0O(r2, r13)
            if (r0 == 0) goto L_0x001b
            X.SK5 r5 = com.google.protobuf.UnsafeUtil.A02
            double r9 = r5.A03(r13, r7)
            r5.A0C(r6, r7, r9)
            goto L_0x0149
        L_0x00fd:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            boolean r0 = r11.A0P(r13, r4, r2)
            if (r0 == 0) goto L_0x001b
            r1 = 0
            boolean r0 = r11.A0P(r12, r4, r2)
            if (r0 == 0) goto L_0x0111
            java.lang.Object r1 = X.SK5.A00(r12, r7)
        L_0x0111:
            java.lang.Object r0 = X.SK5.A00(r13, r7)
            if (r1 == 0) goto L_0x012b
            if (r0 == 0) goto L_0x001b
            X.R5b r0 = X.SD9.A00(r1, r0)
        L_0x011d:
            com.google.protobuf.UnsafeUtil.A06(r12, r7, r0)
            int r0 = r2 + 2
            r1 = r5[r0]
            r1 = r1 & r3
        L_0x0125:
            long r0 = (long) r1
            com.google.protobuf.UnsafeUtil.A05(r12, r0, r4)
            goto L_0x001b
        L_0x012b:
            if (r0 == 0) goto L_0x001b
            goto L_0x011d
        L_0x012e:
            boolean r0 = r11.A0O(r2, r13)
            if (r0 == 0) goto L_0x001b
            X.SK5 r0 = com.google.protobuf.UnsafeUtil.A02
            java.lang.Object r1 = r0.A09(r12, r7)
            java.lang.Object r0 = r0.A09(r13, r7)
            if (r1 == 0) goto L_0x014e
            if (r0 == 0) goto L_0x001b
            X.R5b r0 = X.SD9.A00(r1, r0)
        L_0x0146:
            com.google.protobuf.UnsafeUtil.A06(r12, r7, r0)
        L_0x0149:
            r11.A0N(r12, r2)
            goto L_0x001b
        L_0x014e:
            if (r0 == 0) goto L_0x001b
            goto L_0x0146
        L_0x0151:
            X.C11433SUe.A0Q(r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T5N.Co5(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x020c, code lost:
        throw X.AnonymousClass5I7.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02e8, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02fb, code lost:
        if (r3 != r4) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x02fd, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0302, code lost:
        throw X.AnonymousClass5I7.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x030c, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0113, code lost:
        if (r3 == r1) goto L_0x012e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A04(X.SFF r14, java.lang.Object r15, byte[] r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, long r26) {
        /*
            r13 = this;
            r10 = r17
            sun.misc.Unsafe r5 = A0F
            r0 = r26
            java.lang.Object r2 = r5.getObject(r15, r0)
            X.TnY r2 = (X.C13982TnY) r2
            r3 = r2
            X.TRv r3 = (X.C13255TRv) r3
            boolean r4 = r3.A00
            r3 = 2
            if (r4 != 0) goto L_0x001f
            int r4 = X.Pxg.A0A(r2)
            X.TnY r2 = r2.Cop(r4)
            r5.putObject(r15, r0, r2)
        L_0x001f:
            r6 = 5
            r0 = 1
            r7 = r14
            r9 = r16
            r11 = r18
            r4 = r19
            r1 = r21
            r5 = r22
            switch(r23) {
                case 18: goto L_0x02e9;
                case 19: goto L_0x029a;
                case 20: goto L_0x026b;
                case 21: goto L_0x026b;
                case 22: goto L_0x023c;
                case 23: goto L_0x002f;
                case 24: goto L_0x020d;
                case 25: goto L_0x0065;
                case 26: goto L_0x0194;
                case 27: goto L_0x017a;
                case 28: goto L_0x0148;
                case 29: goto L_0x023c;
                case 30: goto L_0x00fb;
                case 31: goto L_0x020d;
                case 32: goto L_0x002f;
                case 33: goto L_0x00c0;
                case 34: goto L_0x0089;
                case 35: goto L_0x02e9;
                case 36: goto L_0x029a;
                case 37: goto L_0x026b;
                case 38: goto L_0x026b;
                case 39: goto L_0x023c;
                case 40: goto L_0x002f;
                case 41: goto L_0x020d;
                case 42: goto L_0x0065;
                case 43: goto L_0x023c;
                case 44: goto L_0x00fb;
                case 45: goto L_0x020d;
                case 46: goto L_0x002f;
                case 47: goto L_0x00c0;
                case 48: goto L_0x0089;
                case 49: goto L_0x0046;
                default: goto L_0x002f;
            }
        L_0x002f:
            if (r1 != r3) goto L_0x02d1
            X.R31 r2 = (X.R31) r2
            int r3 = X.SU4.A05(r14, r9, r10)
            int r4 = r14.A00
            int r4 = r4 + r3
        L_0x003a:
            if (r3 >= r4) goto L_0x02fb
            long r0 = X.SU4.A09(r9, r3)
            r2.A02(r0)
            int r3 = r3 + 8
            goto L_0x003a
        L_0x0046:
            r0 = 3
            if (r1 != r0) goto L_0x030c
            X.TjQ r8 = r13.A0D(r5)
            r0 = r19 & -8
            r12 = r0 | 4
        L_0x0051:
            int r3 = X.SU4.A01(r7, r8, r9, r10, r11, r12)
            java.lang.Object r0 = r14.A02
            r2.add(r0)
            if (r3 >= r11) goto L_0x02e8
            int r10 = X.SU4.A05(r14, r9, r3)
            int r0 = r14.A00
            if (r4 == r0) goto L_0x0051
            return r3
        L_0x0065:
            if (r1 != r3) goto L_0x007d
            int r3 = X.SU4.A05(r14, r9, r10)
            int r0 = r14.A00
            int r0 = r0 + r3
            if (r3 >= r0) goto L_0x007a
            X.SU4.A06(r14, r9, r3)
            java.lang.String r0 = "addBoolean"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x007a:
            if (r3 != r0) goto L_0x02fe
            return r3
        L_0x007d:
            if (r21 != 0) goto L_0x030c
            X.SU4.A06(r14, r9, r10)
            java.lang.String r0 = "addBoolean"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0089:
            if (r1 != r3) goto L_0x00a4
            X.R31 r2 = (X.R31) r2
            int r3 = X.SU4.A05(r14, r9, r10)
            int r4 = r14.A00
            int r4 = r4 + r3
        L_0x0094:
            if (r3 >= r4) goto L_0x02fb
            int r3 = X.SU4.A06(r14, r9, r3)
            long r0 = r14.A01
            long r0 = X.Pxg.A0D(r0)
            r2.A02(r0)
            goto L_0x0094
        L_0x00a4:
            if (r21 != 0) goto L_0x030c
            X.R31 r2 = (X.R31) r2
        L_0x00a8:
            int r3 = X.SU4.A06(r14, r9, r10)
            long r0 = r14.A01
            long r0 = X.Pxg.A0D(r0)
            r2.A02(r0)
            if (r3 >= r11) goto L_0x02e8
            int r10 = X.SU4.A05(r14, r9, r3)
            int r0 = r14.A00
            if (r4 == r0) goto L_0x00a8
            return r3
        L_0x00c0:
            if (r1 != r3) goto L_0x00dd
            X.R30 r2 = (X.R30) r2
            int r3 = X.SU4.A05(r14, r9, r10)
            int r4 = r14.A00
            int r4 = r4 + r3
        L_0x00cb:
            if (r3 >= r4) goto L_0x02fb
            int r3 = X.SU4.A05(r14, r9, r3)
            int r0 = r14.A00
            int r1 = r0 >>> 1
            r0 = r0 & 1
            int r0 = -r0
            r0 = r0 ^ r1
            r2.A8j(r0)
            goto L_0x00cb
        L_0x00dd:
            if (r21 != 0) goto L_0x030c
            X.R30 r2 = (X.R30) r2
        L_0x00e1:
            int r3 = X.SU4.A05(r14, r9, r10)
            int r0 = r14.A00
            int r1 = r0 >>> 1
            r0 = r0 & 1
            int r0 = -r0
            r0 = r0 ^ r1
            r2.A8j(r0)
            if (r3 >= r11) goto L_0x02e8
            int r10 = X.SU4.A05(r14, r9, r3)
            int r0 = r14.A00
            if (r4 == r0) goto L_0x00e1
            return r3
        L_0x00fb:
            if (r1 != r3) goto L_0x0116
            r4 = r2
            X.R30 r4 = (X.R30) r4
            int r3 = X.SU4.A05(r14, r9, r10)
            int r1 = r14.A00
            int r1 = r1 + r3
        L_0x0107:
            if (r3 >= r1) goto L_0x0113
            int r3 = X.SU4.A05(r14, r9, r3)
            int r0 = r14.A00
            r4.A8j(r0)
            goto L_0x0107
        L_0x0113:
            if (r3 != r1) goto L_0x02fe
            goto L_0x012e
        L_0x0116:
            if (r21 != 0) goto L_0x030c
            r1 = r2
            X.R30 r1 = (X.R30) r1
        L_0x011b:
            int r3 = X.SU4.A05(r14, r9, r10)
            int r0 = r14.A00
            r1.A8j(r0)
            if (r3 >= r11) goto L_0x012e
            int r10 = X.SU4.A05(r14, r9, r3)
            int r0 = r14.A00
            if (r4 == r0) goto L_0x011b
        L_0x012e:
            X.R5b r15 = (X.R5b) r15
            X.SJn r1 = r15.unknownFields
            X.SJn r0 = X.C11289SJn.A05
            if (r1 != r0) goto L_0x0137
            r1 = 0
        L_0x0137:
            X.TeS r0 = A0B(r13, r5)
            r4 = r20
            java.lang.Object r0 = X.C11433SUe.A09(r0, r1, r2, r4)
            X.SJn r0 = (X.C11289SJn) r0
            if (r0 == 0) goto L_0x02e8
            r15.unknownFields = r0
            return r3
        L_0x0148:
            if (r1 != r3) goto L_0x030c
            int r3 = X.SU4.A05(r14, r9, r10)
            int r1 = r14.A00
            if (r1 < 0) goto L_0x0208
            int r5 = r9.length
        L_0x0153:
            int r0 = r5 - r3
            if (r1 > r0) goto L_0x02fe
            if (r1 != 0) goto L_0x0171
            X.TAP r0 = X.TAP.A01
            r2.add(r0)
        L_0x015e:
            if (r3 >= r11) goto L_0x02e8
            int r1 = X.SU4.A05(r14, r9, r3)
            int r0 = r14.A00
            if (r4 != r0) goto L_0x02e8
            int r3 = X.SU4.A05(r14, r9, r1)
            int r1 = r14.A00
            if (r1 < 0) goto L_0x0208
            goto L_0x0153
        L_0x0171:
            X.R36 r0 = X.TAP.A01(r9, r3, r1)
            r2.add(r0)
            int r3 = r3 + r1
            goto L_0x015e
        L_0x017a:
            if (r1 != r3) goto L_0x030c
            X.TjQ r1 = r13.A0D(r5)
        L_0x0180:
            int r3 = X.SU4.A00(r14, r1, r9, r10, r11)
            java.lang.Object r0 = r14.A02
            r2.add(r0)
            if (r3 >= r11) goto L_0x02e8
            int r10 = X.SU4.A05(r14, r9, r3)
            int r0 = r14.A00
            if (r4 == r0) goto L_0x0180
            return r3
        L_0x0194:
            if (r1 != r3) goto L_0x030c
            r0 = 536870912(0x20000000, double:2.652494739E-315)
            long r24 = r24 & r0
            r5 = 0
            int r0 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            int r3 = X.SU4.A05(r14, r9, r10)
            if (r0 != 0) goto L_0x01ce
            int r1 = r14.A00
            if (r1 < 0) goto L_0x0208
            java.lang.String r5 = ""
        L_0x01ab:
            if (r1 != 0) goto L_0x01c3
            r2.add(r5)
        L_0x01b0:
            if (r3 >= r11) goto L_0x02e8
            int r1 = X.SU4.A05(r14, r9, r3)
            int r0 = r14.A00
            if (r4 != r0) goto L_0x02e8
            int r3 = X.SU4.A05(r14, r9, r1)
            int r1 = r14.A00
            if (r1 < 0) goto L_0x0208
            goto L_0x01ab
        L_0x01c3:
            java.nio.charset.Charset r0 = X.SD9.A04
            java.lang.String r0 = X.Pxe.A11(r0, r9, r3, r1)
            r2.add(r0)
            int r3 = r3 + r1
            goto L_0x01b0
        L_0x01ce:
            int r6 = r14.A00
            if (r6 < 0) goto L_0x0208
            java.lang.String r5 = ""
        L_0x01d4:
            if (r6 != 0) goto L_0x01ec
            r2.add(r5)
        L_0x01d9:
            if (r3 >= r11) goto L_0x02e8
            int r1 = X.SU4.A05(r14, r9, r3)
            int r0 = r14.A00
            if (r4 != r0) goto L_0x02e8
            int r3 = X.SU4.A05(r14, r9, r1)
            int r6 = r14.A00
            if (r6 < 0) goto L_0x0208
            goto L_0x01d4
        L_0x01ec:
            int r1 = r3 + r6
            X.S57 r0 = X.SC5.A00
            int r0 = r0.A03(r9, r3, r1)
            if (r0 != 0) goto L_0x0201
            java.nio.charset.Charset r0 = X.SD9.A04
            java.lang.String r0 = X.Pxe.A11(r0, r9, r3, r6)
            r2.add(r0)
            r3 = r1
            goto L_0x01d9
        L_0x0201:
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            X.5I7 r0 = X.Pxg.A0T(r0)
            throw r0
        L_0x0208:
            X.5I7 r0 = X.AnonymousClass5I7.A01()
            throw r0
        L_0x020d:
            if (r1 != r3) goto L_0x0224
            X.R30 r2 = (X.R30) r2
            int r3 = X.SU4.A05(r14, r9, r10)
            int r4 = r14.A00
            int r4 = r4 + r3
        L_0x0218:
            if (r3 >= r4) goto L_0x02fb
            int r0 = X.Pxk.A02(r9, r3)
            r2.A8j(r0)
            int r3 = r3 + 4
            goto L_0x0218
        L_0x0224:
            if (r1 != r6) goto L_0x030c
            X.R30 r2 = (X.R30) r2
        L_0x0228:
            int r0 = X.Pxk.A02(r9, r10)
            r2.A8j(r0)
            int r3 = r10 + 4
            if (r3 >= r11) goto L_0x02e8
            int r10 = X.SU4.A05(r14, r9, r3)
            int r0 = r14.A00
            if (r4 == r0) goto L_0x0228
            return r3
        L_0x023c:
            if (r1 != r3) goto L_0x0253
            X.R30 r2 = (X.R30) r2
            int r3 = X.SU4.A05(r14, r9, r10)
            int r4 = r14.A00
            int r4 = r4 + r3
        L_0x0247:
            if (r3 >= r4) goto L_0x02fb
            int r3 = X.SU4.A05(r14, r9, r3)
            int r0 = r14.A00
            r2.A8j(r0)
            goto L_0x0247
        L_0x0253:
            if (r21 != 0) goto L_0x030c
            X.R30 r2 = (X.R30) r2
        L_0x0257:
            int r3 = X.SU4.A05(r14, r9, r10)
            int r0 = r14.A00
            r2.A8j(r0)
            if (r3 >= r11) goto L_0x02e8
            int r10 = X.SU4.A05(r14, r9, r3)
            int r0 = r14.A00
            if (r4 == r0) goto L_0x0257
            return r3
        L_0x026b:
            if (r1 != r3) goto L_0x0282
            X.R31 r2 = (X.R31) r2
            int r3 = X.SU4.A05(r14, r9, r10)
            int r4 = r14.A00
            int r4 = r4 + r3
        L_0x0276:
            if (r3 >= r4) goto L_0x02fb
            int r3 = X.SU4.A06(r14, r9, r3)
            long r0 = r14.A01
            r2.A02(r0)
            goto L_0x0276
        L_0x0282:
            if (r21 != 0) goto L_0x030c
            X.R31 r2 = (X.R31) r2
        L_0x0286:
            int r3 = X.SU4.A06(r14, r9, r10)
            long r0 = r14.A01
            r2.A02(r0)
            if (r3 >= r11) goto L_0x02e8
            int r10 = X.SU4.A05(r14, r9, r3)
            int r0 = r14.A00
            if (r4 == r0) goto L_0x0286
            return r3
        L_0x029a:
            if (r1 != r3) goto L_0x02b5
            X.R2z r2 = (X.R2z) r2
            int r3 = X.SU4.A05(r14, r9, r10)
            int r4 = r14.A00
            int r4 = r4 + r3
        L_0x02a5:
            if (r3 >= r4) goto L_0x02fb
            int r0 = X.Pxk.A02(r9, r3)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r2.A8W(r0)
            int r3 = r3 + 4
            goto L_0x02a5
        L_0x02b5:
            if (r1 != r6) goto L_0x030c
            X.R2z r2 = (X.R2z) r2
        L_0x02b9:
            int r0 = X.Pxk.A02(r9, r10)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r2.A8W(r0)
            int r3 = r10 + 4
            if (r3 >= r11) goto L_0x02e8
            int r10 = X.SU4.A05(r14, r9, r3)
            int r0 = r14.A00
            if (r4 == r0) goto L_0x02b9
            return r3
        L_0x02d1:
            if (r1 != r0) goto L_0x030c
            X.R31 r2 = (X.R31) r2
        L_0x02d5:
            long r0 = X.SU4.A09(r9, r10)
            r2.A02(r0)
            int r3 = r10 + 8
            if (r3 >= r11) goto L_0x02e8
            int r10 = X.SU4.A05(r14, r9, r3)
            int r0 = r14.A00
            if (r4 == r0) goto L_0x02d5
        L_0x02e8:
            return r3
        L_0x02e9:
            if (r1 != r3) goto L_0x0303
            int r3 = X.SU4.A05(r14, r9, r10)
            int r4 = r14.A00
            int r4 = r4 + r3
            if (r3 >= r4) goto L_0x02fb
            java.lang.String r0 = "addDouble"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x02fb:
            if (r3 != r4) goto L_0x02fe
            return r3
        L_0x02fe:
            X.5I7 r0 = X.AnonymousClass5I7.A02()
            throw r0
        L_0x0303:
            if (r1 != r0) goto L_0x030c
            java.lang.String r0 = "addDouble"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x030c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T5N.A04(X.SFF, java.lang.Object, byte[], int, int, int, int, int, int, int, long, long):int");
    }
}

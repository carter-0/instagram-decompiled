package X;

import com.instagram.react.modules.base.IgReactQEModule;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: X.Syo  reason: case insensitive filesystem */
public final class C12589Syo implements C13845TiL {
    public static final Unsafe A0D = SUg.A09();
    public static final int[] A0E = new int[0];
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final SI3 A04;
    public final SRF A05;
    public final SA6 A06;
    public final C13957TmK A07;
    public final C9726Rfj A08;
    public final SK0 A09;
    public final int[] A0A;
    public final int[] A0B;
    public final Object[] A0C;

    public C12589Syo(SI3 si3, SRF srf, SA6 sa6, C13957TmK tmK, C9726Rfj rfj, SK0 sk0, int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, int i3, int i4) {
        this.A0A = iArr;
        this.A0C = objArr;
        this.A00 = i;
        this.A01 = i2;
        this.A0B = iArr2;
        this.A02 = i3;
        this.A03 = i4;
        this.A08 = rfj;
        this.A05 = srf;
        this.A09 = sk0;
        this.A04 = si3;
        this.A07 = tmK;
        this.A06 = sa6;
    }

    public static int A02(int i) {
        return (i >>> 20) & 255;
    }

    public static Field A0E(Class cls, String str) {
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

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        r5 = r4 * 53;
        r4 = X.SUg.A06(r8, r1).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006f, code lost:
        r5 = r4 * 53;
        r4 = ((java.lang.String) X.SUg.A06(r8, r1)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a2, code lost:
        r5 = r4 * 53;
        r4 = A06(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b6, code lost:
        r4 = r4 * 53;
        r1 = A07(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010b, code lost:
        r4 = r4 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0114, code lost:
        r1 = java.lang.Double.doubleToLongBits(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0118, code lost:
        r0 = X.SS6.A02;
        r4 = X.Pxh.A06(r1, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int FPC(java.lang.Object r8) {
        /*
            r7 = this;
            r3 = 0
            r4 = 0
        L_0x0002:
            int[] r2 = r7.A0A
            int r0 = r2.length
            if (r3 >= r0) goto L_0x0120
            int r0 = r7.A04(r3)
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            int r6 = A02(r0)
            r0 = r2[r3]
            long r1 = (long) r1
            r5 = 37
            switch(r6) {
                case 0: goto L_0x010e;
                case 1: goto L_0x0101;
                case 2: goto L_0x00fa;
                case 3: goto L_0x00fa;
                case 4: goto L_0x00f3;
                case 5: goto L_0x00fa;
                case 6: goto L_0x00f3;
                case 7: goto L_0x00e8;
                case 8: goto L_0x006f;
                case 9: goto L_0x00db;
                case 10: goto L_0x005d;
                case 11: goto L_0x00f3;
                case 12: goto L_0x00f3;
                case 13: goto L_0x00f3;
                case 14: goto L_0x00fa;
                case 15: goto L_0x00f3;
                case 16: goto L_0x00fa;
                case 17: goto L_0x00db;
                case 18: goto L_0x005d;
                case 19: goto L_0x005d;
                case 20: goto L_0x005d;
                case 21: goto L_0x005d;
                case 22: goto L_0x005d;
                case 23: goto L_0x005d;
                case 24: goto L_0x005d;
                case 25: goto L_0x005d;
                case 26: goto L_0x005d;
                case 27: goto L_0x005d;
                case 28: goto L_0x005d;
                case 29: goto L_0x005d;
                case 30: goto L_0x005d;
                case 31: goto L_0x005d;
                case 32: goto L_0x005d;
                case 33: goto L_0x005d;
                case 34: goto L_0x005d;
                case 35: goto L_0x005d;
                case 36: goto L_0x005d;
                case 37: goto L_0x005d;
                case 38: goto L_0x005d;
                case 39: goto L_0x005d;
                case 40: goto L_0x005d;
                case 41: goto L_0x005d;
                case 42: goto L_0x005d;
                case 43: goto L_0x005d;
                case 44: goto L_0x005d;
                case 45: goto L_0x005d;
                case 46: goto L_0x005d;
                case 47: goto L_0x005d;
                case 48: goto L_0x005d;
                case 49: goto L_0x005d;
                case 50: goto L_0x005d;
                case 51: goto L_0x00ce;
                case 52: goto L_0x00bd;
                case 53: goto L_0x00b0;
                case 54: goto L_0x00a9;
                case 55: goto L_0x009c;
                case 56: goto L_0x0095;
                case 57: goto L_0x008e;
                case 58: goto L_0x007d;
                case 59: goto L_0x0069;
                case 60: goto L_0x0057;
                case 61: goto L_0x0050;
                case 62: goto L_0x0049;
                case 63: goto L_0x0042;
                case 64: goto L_0x003b;
                case 65: goto L_0x0034;
                case 66: goto L_0x002d;
                case 67: goto L_0x0025;
                case 68: goto L_0x001e;
                default: goto L_0x001b;
            }
        L_0x001b:
            int r3 = r3 + 3
            goto L_0x0002
        L_0x001e:
            boolean r0 = r7.A0R(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x005d
        L_0x0025:
            boolean r0 = r7.A0R(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00b6
        L_0x002d:
            boolean r0 = r7.A0R(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00a2
        L_0x0034:
            boolean r0 = r7.A0R(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00b6
        L_0x003b:
            boolean r0 = r7.A0R(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00a2
        L_0x0042:
            boolean r0 = r7.A0R(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00a2
        L_0x0049:
            boolean r0 = r7.A0R(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00a2
        L_0x0050:
            boolean r0 = r7.A0R(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x005d
        L_0x0057:
            boolean r0 = r7.A0R(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
        L_0x005d:
            int r5 = r4 * 53
            java.lang.Object r0 = X.SUg.A06(r8, r1)
            int r4 = r0.hashCode()
            goto L_0x010b
        L_0x0069:
            boolean r0 = r7.A0R(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
        L_0x006f:
            int r5 = r4 * 53
            java.lang.Object r0 = X.SUg.A06(r8, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r4 = r0.hashCode()
            goto L_0x010b
        L_0x007d:
            boolean r0 = r7.A0R(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
            int r5 = r4 * 53
            boolean r0 = A0T(r8, r1)
            int r4 = X.SS6.A00(r0)
            goto L_0x010b
        L_0x008e:
            boolean r0 = r7.A0R(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00a2
        L_0x0095:
            boolean r0 = r7.A0R(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00b6
        L_0x009c:
            boolean r0 = r7.A0R(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
        L_0x00a2:
            int r5 = r4 * 53
            int r4 = A06(r8, r1)
            goto L_0x010b
        L_0x00a9:
            boolean r0 = r7.A0R(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00b6
        L_0x00b0:
            boolean r0 = r7.A0R(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
        L_0x00b6:
            int r4 = r4 * 53
            long r1 = A07(r8, r1)
            goto L_0x0118
        L_0x00bd:
            boolean r0 = r7.A0R(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
            int r5 = r4 * 53
            float r0 = A01(r8, r1)
            int r4 = java.lang.Float.floatToIntBits(r0)
            goto L_0x010b
        L_0x00ce:
            boolean r0 = r7.A0R(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
            int r4 = r4 * 53
            double r0 = A00(r8, r1)
            goto L_0x0114
        L_0x00db:
            int r4 = r4 * 53
            java.lang.Object r0 = X.SUg.A06(r8, r1)
            if (r0 == 0) goto L_0x010b
            int r5 = r0.hashCode()
            goto L_0x010b
        L_0x00e8:
            int r5 = r4 * 53
            boolean r0 = X.SUg.A0R(r8, r1)
            int r4 = X.SS6.A00(r0)
            goto L_0x010b
        L_0x00f3:
            int r5 = r4 * 53
            int r4 = X.SUg.A03(r8, r1)
            goto L_0x010b
        L_0x00fa:
            int r4 = r4 * 53
            long r1 = X.SUg.A04(r8, r1)
            goto L_0x0118
        L_0x0101:
            int r5 = r4 * 53
            float r0 = X.SUg.A01(r8, r1)
            int r4 = java.lang.Float.floatToIntBits(r0)
        L_0x010b:
            int r4 = r4 + r5
            goto L_0x001b
        L_0x010e:
            int r4 = r4 * 53
            double r0 = X.SUg.A00(r8, r1)
        L_0x0114:
            long r1 = java.lang.Double.doubleToLongBits(r0)
        L_0x0118:
            java.nio.charset.Charset r0 = X.SS6.A02
            int r4 = X.Pxh.A06(r1, r4)
            goto L_0x001b
        L_0x0120:
            int r1 = r4 * 53
            X.SK0 r0 = r7.A09
            X.STV r0 = r0.A02(r8)
            int r0 = X.AnonymousClass7TE.A0N(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12589Syo.FPC(java.lang.Object):int");
    }

    public final void FPz(SFE sfe, Object obj, byte[] bArr, int i, int i2) {
        A0U(sfe, obj, bArr, i, i2, 0);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0073, code lost:
        if (r1 != r0) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008e, code lost:
        if (r5 != r1) goto L_0x00c1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean FQ6(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            r7 = 0
            r4 = 0
        L_0x0002:
            int[] r0 = r8.A0A
            int r0 = r0.length
            if (r4 >= r0) goto L_0x0091
            int r0 = r8.A04(r4)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r0 & r5
            int r0 = A02(r0)
            long r2 = (long) r1
            switch(r0) {
                case 0: goto L_0x0076;
                case 1: goto L_0x005d;
                case 2: goto L_0x004e;
                case 3: goto L_0x004e;
                case 4: goto L_0x003f;
                case 5: goto L_0x004e;
                case 6: goto L_0x003f;
                case 7: goto L_0x0030;
                case 8: goto L_0x001b;
                case 9: goto L_0x001b;
                case 10: goto L_0x001b;
                case 11: goto L_0x003f;
                case 12: goto L_0x003f;
                case 13: goto L_0x003f;
                case 14: goto L_0x004e;
                case 15: goto L_0x003f;
                case 16: goto L_0x004e;
                case 17: goto L_0x001b;
                case 18: goto L_0x00b3;
                case 19: goto L_0x00b3;
                case 20: goto L_0x00b3;
                case 21: goto L_0x00b3;
                case 22: goto L_0x00b3;
                case 23: goto L_0x00b3;
                case 24: goto L_0x00b3;
                case 25: goto L_0x00b3;
                case 26: goto L_0x00b3;
                case 27: goto L_0x00b3;
                case 28: goto L_0x00b3;
                case 29: goto L_0x00b3;
                case 30: goto L_0x00b3;
                case 31: goto L_0x00b3;
                case 32: goto L_0x00b3;
                case 33: goto L_0x00b3;
                case 34: goto L_0x00b3;
                case 35: goto L_0x00b3;
                case 36: goto L_0x00b3;
                case 37: goto L_0x00b3;
                case 38: goto L_0x00b3;
                case 39: goto L_0x00b3;
                case 40: goto L_0x00b3;
                case 41: goto L_0x00b3;
                case 42: goto L_0x00b3;
                case 43: goto L_0x00b3;
                case 44: goto L_0x00b3;
                case 45: goto L_0x00b3;
                case 46: goto L_0x00b3;
                case 47: goto L_0x00b3;
                case 48: goto L_0x00b3;
                case 49: goto L_0x00b3;
                case 50: goto L_0x00b3;
                case 51: goto L_0x00a3;
                case 52: goto L_0x00a3;
                case 53: goto L_0x00a3;
                case 54: goto L_0x00a3;
                case 55: goto L_0x00a3;
                case 56: goto L_0x00a3;
                case 57: goto L_0x00a3;
                case 58: goto L_0x00a3;
                case 59: goto L_0x00a3;
                case 60: goto L_0x00a3;
                case 61: goto L_0x00a3;
                case 62: goto L_0x00a3;
                case 63: goto L_0x00a3;
                case 64: goto L_0x00a3;
                case 65: goto L_0x00a3;
                case 66: goto L_0x00a3;
                case 67: goto L_0x00a3;
                case 68: goto L_0x00a3;
                default: goto L_0x0018;
            }
        L_0x0018:
            int r4 = r4 + 3
            goto L_0x0002
        L_0x001b:
            boolean r0 = r8.A0O(r4, r9, r10)
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r1 = X.SUg.A06(r9, r2)
            java.lang.Object r0 = X.SUg.A06(r10, r2)
            boolean r0 = X.SUi.A0V(r1, r0)
            if (r0 == 0) goto L_0x00c1
            goto L_0x0018
        L_0x0030:
            boolean r0 = r8.A0O(r4, r9, r10)
            if (r0 == 0) goto L_0x00c1
            boolean r1 = X.SUg.A0R(r9, r2)
            boolean r0 = X.SUg.A0R(r10, r2)
            goto L_0x0073
        L_0x003f:
            boolean r0 = r8.A0O(r4, r9, r10)
            if (r0 == 0) goto L_0x00c1
            int r1 = X.SUg.A03(r9, r2)
            int r0 = X.SUg.A03(r10, r2)
            goto L_0x0073
        L_0x004e:
            boolean r0 = r8.A0O(r4, r9, r10)
            if (r0 == 0) goto L_0x00c1
            long r5 = X.SUg.A04(r9, r2)
            long r1 = X.SUg.A04(r10, r2)
            goto L_0x008c
        L_0x005d:
            boolean r0 = r8.A0O(r4, r9, r10)
            if (r0 == 0) goto L_0x00c1
            float r0 = X.SUg.A01(r9, r2)
            int r1 = java.lang.Float.floatToIntBits(r0)
            float r0 = X.SUg.A01(r10, r2)
            int r0 = java.lang.Float.floatToIntBits(r0)
        L_0x0073:
            if (r1 != r0) goto L_0x00c1
            goto L_0x0018
        L_0x0076:
            boolean r0 = r8.A0O(r4, r9, r10)
            if (r0 == 0) goto L_0x00c1
            double r0 = X.SUg.A00(r9, r2)
            long r5 = java.lang.Double.doubleToLongBits(r0)
            double r0 = X.SUg.A00(r10, r2)
            long r1 = java.lang.Double.doubleToLongBits(r0)
        L_0x008c:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00c1
            goto L_0x0018
        L_0x0091:
            X.SK0 r0 = r8.A09
            X.STV r1 = r0.A02(r9)
            X.STV r0 = r0.A02(r10)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00c1
            r7 = 1
            return r7
        L_0x00a3:
            int r0 = r8.A03(r4)
            r0 = r0 & r5
            long r0 = (long) r0
            int r5 = X.SUg.A03(r9, r0)
            int r0 = X.SUg.A03(r10, r0)
            if (r5 != r0) goto L_0x00c1
        L_0x00b3:
            java.lang.Object r1 = X.SUg.A06(r9, r2)
            java.lang.Object r0 = X.SUg.A06(r10, r2)
            boolean r0 = X.SUi.A0V(r1, r0)
            if (r0 != 0) goto L_0x0018
        L_0x00c1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12589Syo.FQ6(java.lang.Object, java.lang.Object):boolean");
    }

    private final int A03(int i) {
        return this.A0A[i + 2];
    }

    private final int A04(int i) {
        return this.A0A[i + 1];
    }

    private final int A05(int i, int i2) {
        int[] iArr = this.A0A;
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

    private final C13649TeG A08(int i) {
        int i2 = i / 3;
        return (C13649TeG) this.A0C[i2 + i2 + 1];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c4, code lost:
        if (r8 == 0) goto L_0x01d8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0132  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C12589Syo A09(X.SI3 r39, X.SRF r40, X.SA6 r41, X.C13786Th1 r42, X.C9726Rfj r43, X.SK0 r44) {
        /*
            r30 = r42
            r0 = r30
            boolean r0 = r0 instanceof X.C12582Syh
            if (r0 == 0) goto L_0x036a
            r0 = r30
            X.Syh r0 = (X.C12582Syh) r0
            r30 = r0
            java.lang.String r13 = r30.A00()
            int r29 = r13.length()
            char r0 = X.Pxe.A00(r13)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r0 < r12) goto L_0x002a
            r0 = 1
        L_0x0020:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x002b
            r0 = r1
            goto L_0x0020
        L_0x002a:
            r1 = 1
        L_0x002b:
            int r7 = r1 + 1
            char r3 = r13.charAt(r1)
            if (r3 < r12) goto L_0x004a
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0037:
            int r1 = r7 + 1
            char r0 = r13.charAt(r7)
            if (r0 < r12) goto L_0x0047
            int r3 = X.Pxe.A04(r0, r2, r3)
            int r2 = r2 + 13
            r7 = r1
            goto L_0x0037
        L_0x0047:
            int r0 = r0 << r2
            r3 = r3 | r0
            r7 = r1
        L_0x004a:
            if (r3 != 0) goto L_0x024a
            int[] r28 = A0E
            r4 = 0
            r8 = 0
            r9 = 0
            r3 = 0
            r2 = 0
            r15 = 0
            r1 = 0
        L_0x0055:
            sun.misc.Unsafe r27 = A0D
            java.lang.Object[] r26 = r30.A01()
            X.TmK r33 = r30.FOy()
            java.lang.Class r25 = r33.getClass()
            int r42 = r1 + r9
            int r5 = r8 + r8
            int r0 = r8 * 3
            int[] r0 = new int[r0]
            r24 = r0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r23 = r0
            r22 = r1
            r21 = r42
            r20 = 0
            r19 = 0
        L_0x0079:
            r0 = r29
            if (r7 >= r0) goto L_0x034e
            int r6 = r7 + 1
            char r11 = r13.charAt(r7)
            r0 = r6
            if (r11 < r12) goto L_0x009c
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r5 = 13
        L_0x008a:
            int r6 = r6 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x009a
            int r11 = X.Pxe.A04(r0, r5, r11)
            int r5 = r5 + 13
            r0 = r6
            goto L_0x008a
        L_0x009a:
            int r0 = r0 << r5
            r11 = r11 | r0
        L_0x009c:
            int r5 = r6 + 1
            char r10 = r13.charAt(r6)
            if (r10 < r12) goto L_0x00bb
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r0 = r5
            r6 = 13
        L_0x00a9:
            int r5 = r5 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x00b9
            int r10 = X.Pxe.A04(r0, r6, r10)
            int r6 = r6 + 13
            r0 = r5
            goto L_0x00a9
        L_0x00b9:
            int r0 = r0 << r6
            r10 = r10 | r0
        L_0x00bb:
            r0 = r10 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x00c5
            int r0 = r19 + 1
            r28[r19] = r20
            r19 = r0
        L_0x00c5:
            r9 = r10 & 255(0xff, float:3.57E-43)
            r8 = r10 & 2048(0x800, float:2.87E-42)
            r0 = 51
            if (r9 < r0) goto L_0x014a
            int r7 = r5 + 1
            char r0 = r13.charAt(r5)
            if (r0 < r12) goto L_0x00eb
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r6 = 13
        L_0x00d9:
            r5 = r7
            int r7 = r7 + 1
            char r5 = r13.charAt(r5)
            if (r5 < r12) goto L_0x00e9
            int r0 = X.Pxe.A04(r5, r6, r0)
            int r6 = r6 + 13
            goto L_0x00d9
        L_0x00e9:
            int r5 = r5 << r6
            r0 = r0 | r5
        L_0x00eb:
            int r6 = r9 + -51
            r5 = 9
            if (r6 == r5) goto L_0x013d
            r5 = 17
            if (r6 == r5) goto L_0x013d
            r5 = 12
            if (r6 != r5) goto L_0x0103
            int r6 = r30.FPN()
            r5 = 1
            if (r6 == r5) goto L_0x013d
            if (r8 != 0) goto L_0x013d
            r8 = 0
        L_0x0103:
            int r0 = r0 + r0
            r6 = r26[r0]
            boolean r5 = r6 instanceof java.lang.reflect.Field
            if (r5 == 0) goto L_0x0132
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
        L_0x010c:
            r5 = r27
            long r5 = r5.objectFieldOffset(r6)
            int r14 = (int) r5
            int r6 = r0 + 1
            r5 = r26[r6]
            boolean r0 = r5 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0127
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
        L_0x011d:
            r0 = r27
            long r5 = r0.objectFieldOffset(r5)
            int r0 = (int) r5
            r5 = 0
            goto L_0x0213
        L_0x0127:
            java.lang.String r5 = (java.lang.String) r5
            r0 = r25
            java.lang.reflect.Field r5 = A0E(r0, r5)
            r26[r6] = r5
            goto L_0x011d
        L_0x0132:
            java.lang.String r6 = (java.lang.String) r6
            r5 = r25
            java.lang.reflect.Field r6 = A0E(r5, r6)
            r26[r0] = r6
            goto L_0x010c
        L_0x013d:
            int r14 = r15 + 1
            int r5 = r20 / 3
            int r5 = r5 + r5
            int r6 = r5 + 1
            r5 = r26[r15]
            r23[r6] = r5
            r15 = r14
            goto L_0x0103
        L_0x014a:
            int r17 = r15 + 1
            r6 = r26[r15]
            java.lang.String r6 = (java.lang.String) r6
            r0 = r25
            java.lang.reflect.Field r6 = A0E(r0, r6)
            r0 = 9
            if (r9 == r0) goto L_0x01da
            r0 = 17
            if (r9 == r0) goto L_0x01da
            r0 = 27
            if (r9 == r0) goto L_0x01c6
            r0 = 49
            if (r9 == r0) goto L_0x01c6
            r0 = 12
            if (r9 == r0) goto L_0x01bd
            r0 = 30
            if (r9 == r0) goto L_0x01bd
            r0 = 44
            if (r9 == r0) goto L_0x01bd
            r0 = 50
            if (r9 != r0) goto L_0x018f
            int r15 = r17 + 1
            int r14 = r22 + 1
            r28[r22] = r20
            int r7 = r20 / 3
            r0 = r26[r17]
            int r7 = r7 + r7
            r23[r7] = r0
            if (r8 == 0) goto L_0x01d4
            int r7 = r7 + 1
            int r17 = r15 + 1
            r0 = r26[r15]
            r23[r7] = r0
            r22 = r14
        L_0x018f:
            r0 = r27
            long r6 = r0.objectFieldOffset(r6)
            int r14 = (int) r6
            r6 = r10 & 4096(0x1000, float:5.74E-42)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == 0) goto L_0x01e9
            r6 = 17
            if (r9 > r6) goto L_0x01e9
            int r0 = r5 + 1
            char r6 = r13.charAt(r5)
            if (r6 < r12) goto L_0x01fa
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r5 = 13
        L_0x01ad:
            int r7 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x01e6
            int r6 = X.Pxe.A04(r0, r5, r6)
            int r5 = r5 + 13
            r0 = r7
            goto L_0x01ad
        L_0x01bd:
            int r7 = r30.FPN()
            r0 = 1
            if (r7 == r0) goto L_0x01c6
            if (r8 == 0) goto L_0x01d8
        L_0x01c6:
            int r14 = r17 + 1
            int r0 = r20 / 3
            int r0 = r0 + r0
            int r7 = r0 + 1
            r0 = r26[r17]
            r23[r7] = r0
            r17 = r14
            goto L_0x018f
        L_0x01d4:
            r17 = r15
            r22 = r14
        L_0x01d8:
            r8 = 0
            goto L_0x018f
        L_0x01da:
            int r0 = r20 / 3
            int r0 = r0 + r0
            int r7 = r0 + 1
            java.lang.Class r0 = r6.getType()
            r23[r7] = r0
            goto L_0x018f
        L_0x01e6:
            int r0 = r0 << r5
            r6 = r6 | r0
            goto L_0x01fb
        L_0x01e9:
            r7 = r5
            r5 = 0
            r6 = 18
            if (r9 < r6) goto L_0x0211
            r6 = 49
            if (r9 > r6) goto L_0x0211
            int r6 = r21 + 1
            r28[r21] = r14
            r21 = r6
            goto L_0x0211
        L_0x01fa:
            r7 = r0
        L_0x01fb:
            int r15 = r4 + r4
            int r0 = r6 / 32
            int r15 = r15 + r0
            r5 = r26[r15]
            boolean r0 = r5 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x023f
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
        L_0x0208:
            r0 = r27
            long r15 = r0.objectFieldOffset(r5)
            int r0 = (int) r15
            int r5 = r6 % 32
        L_0x0211:
            r15 = r17
        L_0x0213:
            int r18 = r20 + 1
            r24[r20] = r11
            int r17 = r18 + 1
            r6 = r10 & 512(0x200, float:7.175E-43)
            r16 = 0
            if (r6 == 0) goto L_0x0221
            r16 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x0221:
            r6 = r10 & 256(0x100, float:3.59E-43)
            r11 = 0
            if (r6 == 0) goto L_0x0228
            r11 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0228:
            r10 = 0
            if (r8 == 0) goto L_0x022d
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x022d:
            int r6 = r9 << 20
            r11 = r11 | r16
            r11 = r11 | r10
            r11 = r11 | r6
            r14 = r14 | r11
            r24[r18] = r14
            int r20 = r17 + 1
            int r5 = r5 << 20
            r5 = r5 | r0
            r24[r17] = r5
            goto L_0x0079
        L_0x023f:
            java.lang.String r5 = (java.lang.String) r5
            r0 = r25
            java.lang.reflect.Field r5 = A0E(r0, r5)
            r26[r15] = r5
            goto L_0x0208
        L_0x024a:
            int r0 = r7 + 1
            char r4 = r13.charAt(r7)
            if (r4 < r12) goto L_0x0269
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0256:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x0266
            int r4 = X.Pxe.A04(r0, r2, r4)
            int r2 = r2 + 13
            r0 = r1
            goto L_0x0256
        L_0x0266:
            int r0 = r0 << r2
            r4 = r4 | r0
            r0 = r1
        L_0x0269:
            int r3 = r0 + 1
            char r10 = r13.charAt(r0)
            if (r10 < r12) goto L_0x0288
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0275:
            int r1 = r3 + 1
            char r0 = r13.charAt(r3)
            if (r0 < r12) goto L_0x0285
            int r10 = X.Pxe.A04(r0, r2, r10)
            int r2 = r2 + 13
            r3 = r1
            goto L_0x0275
        L_0x0285:
            int r0 = r0 << r2
            r10 = r10 | r0
            r3 = r1
        L_0x0288:
            int r0 = r3 + 1
            char r3 = r13.charAt(r3)
            if (r3 < r12) goto L_0x02a7
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0294:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x02a4
            int r3 = X.Pxe.A04(r0, r2, r3)
            int r2 = r2 + 13
            r0 = r1
            goto L_0x0294
        L_0x02a4:
            int r0 = r0 << r2
            r3 = r3 | r0
            r0 = r1
        L_0x02a7:
            int r6 = r0 + 1
            char r2 = r13.charAt(r0)
            if (r2 < r12) goto L_0x02c6
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r5 = 13
        L_0x02b3:
            int r1 = r6 + 1
            char r0 = r13.charAt(r6)
            if (r0 < r12) goto L_0x02c3
            int r2 = X.Pxe.A04(r0, r5, r2)
            int r5 = r5 + 13
            r6 = r1
            goto L_0x02b3
        L_0x02c3:
            int r0 = r0 << r5
            r2 = r2 | r0
            r6 = r1
        L_0x02c6:
            int r0 = r6 + 1
            char r8 = r13.charAt(r6)
            if (r8 < r12) goto L_0x02e5
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r5 = 13
        L_0x02d2:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x02e2
            int r8 = X.Pxe.A04(r0, r5, r8)
            int r5 = r5 + 13
            r0 = r1
            goto L_0x02d2
        L_0x02e2:
            int r0 = r0 << r5
            r8 = r8 | r0
            r0 = r1
        L_0x02e5:
            int r6 = r0 + 1
            char r9 = r13.charAt(r0)
            if (r9 < r12) goto L_0x0304
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r5 = 13
        L_0x02f1:
            int r1 = r6 + 1
            char r0 = r13.charAt(r6)
            if (r0 < r12) goto L_0x0301
            int r9 = X.Pxe.A04(r0, r5, r9)
            int r5 = r5 + 13
            r6 = r1
            goto L_0x02f1
        L_0x0301:
            int r0 = r0 << r5
            r9 = r9 | r0
            r6 = r1
        L_0x0304:
            int r0 = r6 + 1
            char r11 = r13.charAt(r6)
            if (r11 < r12) goto L_0x0323
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r5 = 13
        L_0x0310:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x0320
            int r11 = X.Pxe.A04(r0, r5, r11)
            int r5 = r5 + 13
            r0 = r1
            goto L_0x0310
        L_0x0320:
            int r0 = r0 << r5
            r11 = r11 | r0
            r0 = r1
        L_0x0323:
            int r7 = r0 + 1
            char r1 = r13.charAt(r0)
            if (r1 < r12) goto L_0x0342
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r6 = 13
        L_0x032f:
            int r5 = r7 + 1
            char r0 = r13.charAt(r7)
            if (r0 < r12) goto L_0x033f
            int r1 = X.Pxe.A04(r0, r6, r1)
            int r6 = r6 + 13
            r7 = r5
            goto L_0x032f
        L_0x033f:
            int r0 = r0 << r6
            r1 = r1 | r0
            r7 = r5
        L_0x0342:
            int r0 = r1 + r9
            int r0 = r0 + r11
            int r15 = r4 + r4
            int r15 = r15 + r10
            int[] r0 = new int[r0]
            r28 = r0
            goto L_0x0055
        L_0x034e:
            X.Syo r29 = new X.Syo
            r30 = r39
            r31 = r40
            r32 = r41
            r34 = r43
            r35 = r44
            r36 = r24
            r37 = r28
            r38 = r23
            r39 = r3
            r40 = r2
            r41 = r1
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            return r29
        L_0x036a:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12589Syo.A09(X.SI3, X.SRF, X.SA6, X.Th1, X.Rfj, X.SK0):X.Syo");
    }

    private final C13845TiL A0A(int i) {
        Object[] objArr = this.A0C;
        int i2 = i / 3;
        int i3 = i2 + i2;
        C13845TiL tiL = (C13845TiL) objArr[i3];
        if (tiL != null) {
            return tiL;
        }
        C13845TiL A012 = SO7.A00().A01((Class) objArr[i3 + 1]);
        objArr[i3] = A012;
        return A012;
    }

    public static STV A0B(Object obj) {
        C8563Qx1 qx1 = (C8563Qx1) obj;
        STV stv = qx1.zzc;
        if (stv != STV.A00()) {
            return stv;
        }
        STV A012 = STV.A01();
        qx1.zzc = A012;
        return A012;
    }

    private final void A0F(int i, int i2, Object obj, Object obj2) {
        A0D.putObject(obj, Pxe.A0B(A04(i2)), obj2);
        A0L(obj, i, i2);
    }

    private final void A0H(int i, Object obj, Object obj2) {
        int[] iArr = this.A0A;
        int i2 = iArr[i];
        if (A0R(obj2, i2, i)) {
            Unsafe unsafe = A0D;
            long A042 = (long) (A04(i) & 1048575);
            Object object = unsafe.getObject(obj2, A042);
            if (object != null) {
                C13845TiL A0A2 = A0A(i);
                if (!A0R(obj, i2, i)) {
                    if (!A0Q(object)) {
                        unsafe.putObject(obj, A042, object);
                    } else {
                        C8563Qx1 FPb = A0A2.FPb();
                        A0A2.FPr(FPb, object);
                        unsafe.putObject(obj, A042, FPb);
                    }
                    A0L(obj, i2, i);
                    return;
                }
                Object object2 = unsafe.getObject(obj, A042);
                if (!A0Q(object2)) {
                    C8563Qx1 FPb2 = A0A2.FPb();
                    A0A2.FPr(FPb2, object2);
                    unsafe.putObject(obj, A042, FPb2);
                    object2 = FPb2;
                }
                A0A2.FPr(object2, object);
                return;
            }
            throw Pxj.A0h(obj2, iArr, i);
        }
    }

    public static final void A0I(C13865Tim tim, Object obj, int i) {
        if (obj instanceof String) {
            tim.FOn(i, (String) obj);
        } else {
            tim.FPY((TAQ) obj, i);
        }
    }

    private final void A0M(Object obj, int i, Object obj2) {
        A0D.putObject(obj, Pxe.A0B(A04(i)), obj2);
        A0K(obj, i);
    }

    public static boolean A0Q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof C8563Qx1) {
            return ((C8563Qx1) obj).A0S();
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x025f, code lost:
        r8 = (r8 + r0) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03d7, code lost:
        r2 = r2 * X.C8567Qx5.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x045e, code lost:
        r8 = X.C8567Qx5.A00(r6);
        r2 = X.C8567Qx5.A01((r2 >> 63) ^ (r2 + r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0478, code lost:
        r8 = X.C8567Qx5.A00(r2);
        r2 = X.C8567Qx5.A00((r0 >> 31) ^ (r0 + r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x04ba, code lost:
        r8 = X.C8567Qx5.A00(r2);
        r2 = X.C8567Qx5.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04e6, code lost:
        if ((r1 instanceof X.TAQ) != false) goto L_0x04ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04e8, code lost:
        r8 = X.C8567Qx5.A00(r2);
        r2 = X.C8567Qx5.A04((java.lang.String) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04ff, code lost:
        r8 = X.C8567Qx5.A00(r2);
        r1 = ((X.TAQ) r1).A05();
        r8 = r8 + (X.C8567Qx5.A00(r1) + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x051a, code lost:
        r8 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x055a, code lost:
        r8 = X.C8567Qx5.A00(r2);
        r2 = X.C8567Qx5.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0562, code lost:
        r8 = r8 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x056e, code lost:
        r8 = r0 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x057b, code lost:
        r8 = r0 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fb, code lost:
        r2 = r3 << 3;
        r0 = (long) A06(r12, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0111, code lost:
        r2 = r3 << 3;
        r0 = A07(r12, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int FOw(java.lang.Object r18) {
        /*
            r17 = this;
            sun.misc.Unsafe r5 = A0D
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r14 = 1048575(0xfffff, float:1.469367E-39)
            r15 = 0
            r13 = 0
            r10 = 0
        L_0x000c:
            r11 = r17
            int[] r1 = r11.A0A
            int r0 = r1.length
            r12 = r18
            if (r13 >= r0) goto L_0x0595
            int r7 = r11.A04(r13)
            int r6 = A02(r7)
            int r0 = r13 + 2
            r3 = r1[r13]
            r9 = r1[r0]
            r8 = r9 & r4
            r0 = 17
            r16 = 1
            if (r6 > r0) goto L_0x0587
            if (r8 == r14) goto L_0x0031
            if (r8 != r4) goto L_0x0580
            r15 = 0
        L_0x0030:
            r14 = r8
        L_0x0031:
            int r0 = r9 >>> 20
            int r16 = r16 << r0
        L_0x0035:
            r7 = r7 & r4
            X.XQi[] r0 = X.C21237XQi.A00
            long r0 = (long) r7
            r7 = 63
            switch(r6) {
                case 0: goto L_0x0571;
                case 1: goto L_0x0564;
                case 2: goto L_0x054e;
                case 3: goto L_0x0541;
                case 4: goto L_0x0533;
                case 5: goto L_0x0528;
                case 6: goto L_0x051d;
                case 7: goto L_0x0510;
                case 8: goto L_0x04d8;
                case 9: goto L_0x04c4;
                case 10: goto L_0x04f3;
                case 11: goto L_0x04ae;
                case 12: goto L_0x049f;
                case 13: goto L_0x0493;
                case 14: goto L_0x0487;
                case 15: goto L_0x046c;
                case 16: goto L_0x0452;
                case 17: goto L_0x043c;
                case 18: goto L_0x0430;
                case 19: goto L_0x0424;
                case 20: goto L_0x03de;
                case 21: goto L_0x03c3;
                case 22: goto L_0x03ae;
                case 23: goto L_0x03a2;
                case 24: goto L_0x0396;
                case 25: goto L_0x037f;
                case 26: goto L_0x0326;
                case 27: goto L_0x02ff;
                case 28: goto L_0x02d3;
                case 29: goto L_0x02bd;
                case 30: goto L_0x02a7;
                case 31: goto L_0x029b;
                case 32: goto L_0x028f;
                case 33: goto L_0x0279;
                case 34: goto L_0x0263;
                case 35: goto L_0x024b;
                case 36: goto L_0x0236;
                case 37: goto L_0x0221;
                case 38: goto L_0x020c;
                case 39: goto L_0x01f7;
                case 40: goto L_0x01e2;
                case 41: goto L_0x01cd;
                case 42: goto L_0x01b5;
                case 43: goto L_0x019f;
                case 44: goto L_0x0189;
                case 45: goto L_0x0173;
                case 46: goto L_0x015d;
                case 47: goto L_0x0147;
                case 48: goto L_0x0131;
                case 49: goto L_0x03fe;
                case 50: goto L_0x058b;
                case 51: goto L_0x0125;
                case 52: goto L_0x0119;
                case 53: goto L_0x010b;
                case 54: goto L_0x0104;
                case 55: goto L_0x00f5;
                case 56: goto L_0x00e9;
                case 57: goto L_0x00dd;
                case 58: goto L_0x00d1;
                case 59: goto L_0x00c3;
                case 60: goto L_0x00af;
                case 61: goto L_0x00a1;
                case 62: goto L_0x0093;
                case 63: goto L_0x008c;
                case 64: goto L_0x0080;
                case 65: goto L_0x0074;
                case 66: goto L_0x0066;
                case 67: goto L_0x0058;
                case 68: goto L_0x0042;
                default: goto L_0x003e;
            }
        L_0x003e:
            int r13 = r13 + 3
            r2 = 0
            goto L_0x000c
        L_0x0042:
            boolean r2 = r11.A0R(r12, r3, r13)
            if (r2 == 0) goto L_0x003e
            java.lang.Object r1 = r5.getObject(r12, r0)
            X.TmK r1 = (X.C13957TmK) r1
            X.TiL r0 = r11.A0A(r13)
            int r8 = X.C8567Qx5.A03(r1, r0, r3)
            goto L_0x057d
        L_0x0058:
            boolean r2 = r11.A0R(r12, r3, r13)
            if (r2 == 0) goto L_0x003e
            int r6 = r3 << 3
            long r2 = A07(r12, r0)
            goto L_0x045e
        L_0x0066:
            boolean r2 = r11.A0R(r12, r3, r13)
            if (r2 == 0) goto L_0x003e
            int r2 = r3 << 3
            int r0 = A06(r12, r0)
            goto L_0x0478
        L_0x0074:
            boolean r0 = r11.A0R(r12, r3, r13)
            if (r0 == 0) goto L_0x003e
            int r0 = X.SA4.A07(r3)
            goto L_0x057b
        L_0x0080:
            boolean r0 = r11.A0R(r12, r3, r13)
            if (r0 == 0) goto L_0x003e
            int r0 = X.SA4.A07(r3)
            goto L_0x056e
        L_0x008c:
            boolean r2 = r11.A0R(r12, r3, r13)
            if (r2 == 0) goto L_0x003e
            goto L_0x00fb
        L_0x0093:
            boolean r2 = r11.A0R(r12, r3, r13)
            if (r2 == 0) goto L_0x003e
            int r2 = r3 << 3
            int r0 = A06(r12, r0)
            goto L_0x04ba
        L_0x00a1:
            boolean r2 = r11.A0R(r12, r3, r13)
            if (r2 == 0) goto L_0x003e
            int r2 = r3 << 3
            java.lang.Object r1 = r5.getObject(r12, r0)
            goto L_0x04ff
        L_0x00af:
            boolean r2 = r11.A0R(r12, r3, r13)
            if (r2 == 0) goto L_0x003e
            java.lang.Object r1 = r5.getObject(r12, r0)
            X.TiL r0 = r11.A0A(r13)
            int r8 = X.SUi.A00(r0, r1, r3)
            goto L_0x057d
        L_0x00c3:
            boolean r2 = r11.A0R(r12, r3, r13)
            if (r2 == 0) goto L_0x003e
            int r2 = r3 << 3
            java.lang.Object r1 = r5.getObject(r12, r0)
            goto L_0x04e4
        L_0x00d1:
            boolean r0 = r11.A0R(r12, r3, r13)
            if (r0 == 0) goto L_0x003e
            int r0 = X.SA4.A07(r3)
            goto L_0x051a
        L_0x00dd:
            boolean r0 = r11.A0R(r12, r3, r13)
            if (r0 == 0) goto L_0x003e
            int r0 = X.SA4.A07(r3)
            goto L_0x056e
        L_0x00e9:
            boolean r0 = r11.A0R(r12, r3, r13)
            if (r0 == 0) goto L_0x003e
            int r0 = X.SA4.A07(r3)
            goto L_0x057b
        L_0x00f5:
            boolean r2 = r11.A0R(r12, r3, r13)
            if (r2 == 0) goto L_0x003e
        L_0x00fb:
            int r2 = r3 << 3
            int r0 = A06(r12, r0)
            long r0 = (long) r0
            goto L_0x055a
        L_0x0104:
            boolean r2 = r11.A0R(r12, r3, r13)
            if (r2 == 0) goto L_0x003e
            goto L_0x0111
        L_0x010b:
            boolean r2 = r11.A0R(r12, r3, r13)
            if (r2 == 0) goto L_0x003e
        L_0x0111:
            int r2 = r3 << 3
            long r0 = A07(r12, r0)
            goto L_0x055a
        L_0x0119:
            boolean r0 = r11.A0R(r12, r3, r13)
            if (r0 == 0) goto L_0x003e
            int r0 = X.SA4.A07(r3)
            goto L_0x056e
        L_0x0125:
            boolean r0 = r11.A0R(r12, r3, r13)
            if (r0 == 0) goto L_0x003e
            int r0 = X.SA4.A07(r3)
            goto L_0x057b
        L_0x0131:
            java.lang.Object r0 = r5.getObject(r12, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.SUi.A07(r0)
            if (r1 <= 0) goto L_0x003e
            int r8 = X.SA4.A07(r3)
            int r0 = X.C8567Qx5.A00(r1)
            goto L_0x025f
        L_0x0147:
            java.lang.Object r0 = r5.getObject(r12, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.SUi.A06(r0)
            if (r1 <= 0) goto L_0x003e
            int r8 = X.SA4.A07(r3)
            int r0 = X.C8567Qx5.A00(r1)
            goto L_0x025f
        L_0x015d:
            java.lang.Object r0 = r5.getObject(r12, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.SUi.A03(r0)
            if (r1 <= 0) goto L_0x003e
            int r8 = X.SA4.A07(r3)
            int r0 = X.C8567Qx5.A00(r1)
            goto L_0x025f
        L_0x0173:
            java.lang.Object r0 = r5.getObject(r12, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.SUi.A02(r0)
            if (r1 <= 0) goto L_0x003e
            int r8 = X.SA4.A07(r3)
            int r0 = X.C8567Qx5.A00(r1)
            goto L_0x025f
        L_0x0189:
            java.lang.Object r0 = r5.getObject(r12, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.SUi.A01(r0)
            if (r1 <= 0) goto L_0x003e
            int r8 = X.SA4.A07(r3)
            int r0 = X.C8567Qx5.A00(r1)
            goto L_0x025f
        L_0x019f:
            java.lang.Object r0 = r5.getObject(r12, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.SUi.A08(r0)
            if (r1 <= 0) goto L_0x003e
            int r8 = X.SA4.A07(r3)
            int r0 = X.C8567Qx5.A00(r1)
            goto L_0x025f
        L_0x01b5:
            java.lang.Object r1 = r5.getObject(r12, r0)
            java.util.List r1 = (java.util.List) r1
            X.SK0 r0 = X.SUi.A01
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x003e
            int r8 = X.SA4.A07(r3)
            int r0 = X.C8567Qx5.A00(r1)
            goto L_0x025f
        L_0x01cd:
            java.lang.Object r0 = r5.getObject(r12, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.SUi.A02(r0)
            if (r1 <= 0) goto L_0x003e
            int r8 = X.SA4.A07(r3)
            int r0 = X.C8567Qx5.A00(r1)
            goto L_0x025f
        L_0x01e2:
            java.lang.Object r0 = r5.getObject(r12, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.SUi.A03(r0)
            if (r1 <= 0) goto L_0x003e
            int r8 = X.SA4.A07(r3)
            int r0 = X.C8567Qx5.A00(r1)
            goto L_0x025f
        L_0x01f7:
            java.lang.Object r0 = r5.getObject(r12, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.SUi.A04(r0)
            if (r1 <= 0) goto L_0x003e
            int r8 = X.SA4.A07(r3)
            int r0 = X.C8567Qx5.A00(r1)
            goto L_0x025f
        L_0x020c:
            java.lang.Object r0 = r5.getObject(r12, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.SUi.A09(r0)
            if (r1 <= 0) goto L_0x003e
            int r8 = X.SA4.A07(r3)
            int r0 = X.C8567Qx5.A00(r1)
            goto L_0x025f
        L_0x0221:
            java.lang.Object r0 = r5.getObject(r12, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.SUi.A05(r0)
            if (r1 <= 0) goto L_0x003e
            int r8 = X.SA4.A07(r3)
            int r0 = X.C8567Qx5.A00(r1)
            goto L_0x025f
        L_0x0236:
            java.lang.Object r0 = r5.getObject(r12, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.SUi.A02(r0)
            if (r1 <= 0) goto L_0x003e
            int r8 = X.SA4.A07(r3)
            int r0 = X.C8567Qx5.A00(r1)
            goto L_0x025f
        L_0x024b:
            java.lang.Object r0 = r5.getObject(r12, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.SUi.A03(r0)
            if (r1 <= 0) goto L_0x003e
            int r8 = X.SA4.A07(r3)
            int r0 = X.C8567Qx5.A00(r1)
        L_0x025f:
            int r8 = r8 + r0
            int r8 = r8 + r1
            goto L_0x057d
        L_0x0263:
            java.lang.Object r1 = r5.getObject(r12, r0)
            java.util.List r1 = (java.util.List) r1
            X.SK0 r0 = X.SUi.A01
            int r2 = r1.size()
            if (r2 == 0) goto L_0x0411
            int r0 = r3 << 3
            int r8 = X.SUi.A07(r1)
            goto L_0x03d7
        L_0x0279:
            java.lang.Object r1 = r5.getObject(r12, r0)
            java.util.List r1 = (java.util.List) r1
            X.SK0 r0 = X.SUi.A01
            int r2 = r1.size()
            if (r2 == 0) goto L_0x0411
            int r0 = r3 << 3
            int r8 = X.SUi.A06(r1)
            goto L_0x03d7
        L_0x028f:
            java.lang.Object r0 = r5.getObject(r12, r0)
            java.util.List r0 = (java.util.List) r0
            int r8 = X.SUi.A0B(r0, r3)
            goto L_0x057d
        L_0x029b:
            java.lang.Object r0 = r5.getObject(r12, r0)
            java.util.List r0 = (java.util.List) r0
            int r8 = X.SUi.A0A(r0, r3)
            goto L_0x057d
        L_0x02a7:
            java.lang.Object r1 = r5.getObject(r12, r0)
            java.util.List r1 = (java.util.List) r1
            X.SK0 r0 = X.SUi.A01
            int r2 = r1.size()
            if (r2 == 0) goto L_0x0411
            int r0 = r3 << 3
            int r8 = X.SUi.A01(r1)
            goto L_0x03d7
        L_0x02bd:
            java.lang.Object r1 = r5.getObject(r12, r0)
            java.util.List r1 = (java.util.List) r1
            X.SK0 r0 = X.SUi.A01
            int r2 = r1.size()
            if (r2 == 0) goto L_0x0411
            int r0 = r3 << 3
            int r8 = X.SUi.A08(r1)
            goto L_0x03d7
        L_0x02d3:
            java.lang.Object r6 = r5.getObject(r12, r0)
            java.util.List r6 = (java.util.List) r6
            X.SK0 r0 = X.SUi.A01
            int r8 = r6.size()
            if (r8 == 0) goto L_0x0411
            int r0 = X.SA4.A07(r3)
            int r8 = r8 * r0
        L_0x02e6:
            int r0 = r6.size()
            if (r2 >= r0) goto L_0x057d
            java.lang.Object r0 = r6.get(r2)
            X.TAQ r0 = (X.TAQ) r0
            int r1 = r0.A05()
            int r0 = X.C8567Qx5.A00(r1)
            int r0 = r0 + r1
            int r8 = r8 + r0
            int r2 = r2 + 1
            goto L_0x02e6
        L_0x02ff:
            java.lang.Object r7 = r5.getObject(r12, r0)
            java.util.List r7 = (java.util.List) r7
            X.TiL r6 = r11.A0A(r13)
            X.SK0 r0 = X.SUi.A01
            int r1 = r7.size()
            if (r1 == 0) goto L_0x0411
            int r8 = X.SA4.A07(r3)
            int r8 = r8 * r1
        L_0x0316:
            if (r2 >= r1) goto L_0x057d
            java.lang.Object r0 = r7.get(r2)
            X.TmK r0 = (X.C13957TmK) r0
            int r0 = X.C8567Qx5.A02(r0, r6)
            int r8 = r8 + r0
            int r2 = r2 + 1
            goto L_0x0316
        L_0x0326:
            java.lang.Object r7 = r5.getObject(r12, r0)
            java.util.List r7 = (java.util.List) r7
            X.SK0 r0 = X.SUi.A01
            int r6 = r7.size()
            if (r6 == 0) goto L_0x0411
            int r8 = X.SA4.A07(r3)
            int r8 = r8 * r6
            boolean r0 = r7 instanceof X.C13978TnU
            if (r0 == 0) goto L_0x035f
            X.TnU r7 = (X.C13978TnU) r7
        L_0x033f:
            if (r2 >= r6) goto L_0x057d
            java.lang.Object r1 = r7.FPj(r2)
            boolean r0 = r1 instanceof X.TAQ
            if (r0 == 0) goto L_0x0358
            X.TAQ r1 = (X.TAQ) r1
            int r1 = r1.A05()
            int r0 = X.C8567Qx5.A00(r1)
            int r0 = r0 + r1
        L_0x0354:
            int r8 = r8 + r0
            int r2 = r2 + 1
            goto L_0x033f
        L_0x0358:
            java.lang.String r1 = (java.lang.String) r1
            int r0 = X.C8567Qx5.A04(r1)
            goto L_0x0354
        L_0x035f:
            if (r2 >= r6) goto L_0x057d
            java.lang.Object r1 = r7.get(r2)
            boolean r0 = r1 instanceof X.TAQ
            if (r0 == 0) goto L_0x0378
            X.TAQ r1 = (X.TAQ) r1
            int r1 = r1.A05()
            int r0 = X.C8567Qx5.A00(r1)
            int r0 = r0 + r1
        L_0x0374:
            int r8 = r8 + r0
            int r2 = r2 + 1
            goto L_0x035f
        L_0x0378:
            java.lang.String r1 = (java.lang.String) r1
            int r0 = X.C8567Qx5.A04(r1)
            goto L_0x0374
        L_0x037f:
            java.lang.Object r1 = r5.getObject(r12, r0)
            java.util.List r1 = (java.util.List) r1
            X.SK0 r0 = X.SUi.A01
            int r8 = r1.size()
            if (r8 == 0) goto L_0x0411
            int r0 = X.SA4.A07(r3)
            int r0 = r0 + 1
            int r8 = r8 * r0
            goto L_0x057d
        L_0x0396:
            java.lang.Object r0 = r5.getObject(r12, r0)
            java.util.List r0 = (java.util.List) r0
            int r8 = X.SUi.A0A(r0, r3)
            goto L_0x057d
        L_0x03a2:
            java.lang.Object r0 = r5.getObject(r12, r0)
            java.util.List r0 = (java.util.List) r0
            int r8 = X.SUi.A0B(r0, r3)
            goto L_0x057d
        L_0x03ae:
            java.lang.Object r1 = r5.getObject(r12, r0)
            java.util.List r1 = (java.util.List) r1
            X.SK0 r0 = X.SUi.A01
            int r2 = r1.size()
            if (r2 == 0) goto L_0x0411
            int r0 = r3 << 3
            int r8 = X.SUi.A04(r1)
            goto L_0x03d7
        L_0x03c3:
            java.lang.Object r1 = r5.getObject(r12, r0)
            java.util.List r1 = (java.util.List) r1
            X.SK0 r0 = X.SUi.A01
            int r2 = r1.size()
            if (r2 == 0) goto L_0x0411
            int r0 = r3 << 3
            int r8 = X.SUi.A09(r1)
        L_0x03d7:
            int r0 = X.C8567Qx5.A00(r0)
            int r2 = r2 * r0
            goto L_0x0562
        L_0x03de:
            java.lang.Object r1 = r5.getObject(r12, r0)
            java.util.List r1 = (java.util.List) r1
            X.SK0 r0 = X.SUi.A01
            int r0 = r1.size()
            if (r0 == 0) goto L_0x0411
            int r0 = r3 << 3
            int r8 = X.SUi.A05(r1)
            int r1 = r1.size()
            int r0 = X.C8567Qx5.A00(r0)
            int r1 = r1 * r0
            int r8 = r8 + r1
            goto L_0x057d
        L_0x03fe:
            java.lang.Object r7 = r5.getObject(r12, r0)
            java.util.List r7 = (java.util.List) r7
            X.TiL r6 = r11.A0A(r13)
            X.SK0 r0 = X.SUi.A01
            int r1 = r7.size()
            r8 = 0
            if (r1 != 0) goto L_0x0414
        L_0x0411:
            r8 = 0
            goto L_0x057d
        L_0x0414:
            if (r2 >= r1) goto L_0x057d
            java.lang.Object r0 = r7.get(r2)
            X.TmK r0 = (X.C13957TmK) r0
            int r0 = X.C8567Qx5.A03(r0, r6, r3)
            int r8 = r8 + r0
            int r2 = r2 + 1
            goto L_0x0414
        L_0x0424:
            java.lang.Object r0 = r5.getObject(r12, r0)
            java.util.List r0 = (java.util.List) r0
            int r8 = X.SUi.A0A(r0, r3)
            goto L_0x057d
        L_0x0430:
            java.lang.Object r0 = r5.getObject(r12, r0)
            java.util.List r0 = (java.util.List) r0
            int r8 = X.SUi.A0B(r0, r3)
            goto L_0x057d
        L_0x043c:
            boolean r2 = r11.A0S(r12, r13, r14, r15, r16)
            if (r2 == 0) goto L_0x003e
            java.lang.Object r1 = r5.getObject(r12, r0)
            X.TmK r1 = (X.C13957TmK) r1
            X.TiL r0 = r11.A0A(r13)
            int r8 = X.C8567Qx5.A03(r1, r0, r3)
            goto L_0x057d
        L_0x0452:
            boolean r2 = r11.A0S(r12, r13, r14, r15, r16)
            if (r2 == 0) goto L_0x003e
            int r6 = r3 << 3
            long r2 = r5.getLong(r12, r0)
        L_0x045e:
            long r0 = r2 + r2
            long r2 = r2 >> r7
            int r8 = X.C8567Qx5.A00(r6)
            long r2 = r2 ^ r0
            int r2 = X.C8567Qx5.A01(r2)
            goto L_0x0562
        L_0x046c:
            boolean r2 = r11.A0S(r12, r13, r14, r15, r16)
            if (r2 == 0) goto L_0x003e
            int r2 = r3 << 3
            int r0 = r5.getInt(r12, r0)
        L_0x0478:
            int r1 = r0 + r0
            int r0 = r0 >> 31
            int r8 = X.C8567Qx5.A00(r2)
            r0 = r0 ^ r1
            int r2 = X.C8567Qx5.A00(r0)
            goto L_0x0562
        L_0x0487:
            boolean r0 = r11.A0S(r12, r13, r14, r15, r16)
            if (r0 == 0) goto L_0x003e
            int r0 = X.SA4.A07(r3)
            goto L_0x057b
        L_0x0493:
            boolean r0 = r11.A0S(r12, r13, r14, r15, r16)
            if (r0 == 0) goto L_0x003e
            int r0 = X.SA4.A07(r3)
            goto L_0x056e
        L_0x049f:
            boolean r2 = r11.A0S(r12, r13, r14, r15, r16)
            if (r2 == 0) goto L_0x003e
            int r2 = r3 << 3
            int r0 = r5.getInt(r12, r0)
            long r0 = (long) r0
            goto L_0x055a
        L_0x04ae:
            boolean r2 = r11.A0S(r12, r13, r14, r15, r16)
            if (r2 == 0) goto L_0x003e
            int r2 = r3 << 3
            int r0 = r5.getInt(r12, r0)
        L_0x04ba:
            int r8 = X.C8567Qx5.A00(r2)
            int r2 = X.C8567Qx5.A00(r0)
            goto L_0x0562
        L_0x04c4:
            boolean r2 = r11.A0S(r12, r13, r14, r15, r16)
            if (r2 == 0) goto L_0x003e
            java.lang.Object r1 = r5.getObject(r12, r0)
            X.TiL r0 = r11.A0A(r13)
            int r8 = X.SUi.A00(r0, r1, r3)
            goto L_0x057d
        L_0x04d8:
            boolean r2 = r11.A0S(r12, r13, r14, r15, r16)
            if (r2 == 0) goto L_0x003e
            int r2 = r3 << 3
            java.lang.Object r1 = r5.getObject(r12, r0)
        L_0x04e4:
            boolean r0 = r1 instanceof X.TAQ
            if (r0 != 0) goto L_0x04ff
            java.lang.String r1 = (java.lang.String) r1
            int r8 = X.C8567Qx5.A00(r2)
            int r2 = X.C8567Qx5.A04(r1)
            goto L_0x0562
        L_0x04f3:
            boolean r2 = r11.A0S(r12, r13, r14, r15, r16)
            if (r2 == 0) goto L_0x003e
            int r2 = r3 << 3
            java.lang.Object r1 = r5.getObject(r12, r0)
        L_0x04ff:
            X.TAQ r1 = (X.TAQ) r1
            int r8 = X.C8567Qx5.A00(r2)
            int r1 = r1.A05()
            int r0 = X.C8567Qx5.A00(r1)
            int r0 = r0 + r1
            int r8 = r8 + r0
            goto L_0x057d
        L_0x0510:
            boolean r0 = r11.A0S(r12, r13, r14, r15, r16)
            if (r0 == 0) goto L_0x003e
            int r0 = X.SA4.A07(r3)
        L_0x051a:
            int r8 = r0 + 1
            goto L_0x057d
        L_0x051d:
            boolean r0 = r11.A0S(r12, r13, r14, r15, r16)
            if (r0 == 0) goto L_0x003e
            int r0 = X.SA4.A07(r3)
            goto L_0x056e
        L_0x0528:
            boolean r0 = r11.A0S(r12, r13, r14, r15, r16)
            if (r0 == 0) goto L_0x003e
            int r0 = X.SA4.A07(r3)
            goto L_0x057b
        L_0x0533:
            boolean r2 = r11.A0S(r12, r13, r14, r15, r16)
            if (r2 == 0) goto L_0x003e
            int r2 = r3 << 3
            int r0 = r5.getInt(r12, r0)
            long r0 = (long) r0
            goto L_0x055a
        L_0x0541:
            boolean r2 = r11.A0S(r12, r13, r14, r15, r16)
            if (r2 == 0) goto L_0x003e
            int r2 = r3 << 3
            long r0 = r5.getLong(r12, r0)
            goto L_0x055a
        L_0x054e:
            boolean r2 = r11.A0S(r12, r13, r14, r15, r16)
            if (r2 == 0) goto L_0x003e
            int r2 = r3 << 3
            long r0 = r5.getLong(r12, r0)
        L_0x055a:
            int r8 = X.C8567Qx5.A00(r2)
            int r2 = X.C8567Qx5.A01(r0)
        L_0x0562:
            int r8 = r8 + r2
            goto L_0x057d
        L_0x0564:
            boolean r0 = r11.A0S(r12, r13, r14, r15, r16)
            if (r0 == 0) goto L_0x003e
            int r0 = X.SA4.A07(r3)
        L_0x056e:
            int r8 = r0 + 4
            goto L_0x057d
        L_0x0571:
            boolean r0 = r11.A0S(r12, r13, r14, r15, r16)
            if (r0 == 0) goto L_0x003e
            int r0 = X.SA4.A07(r3)
        L_0x057b:
            int r8 = r0 + 8
        L_0x057d:
            int r10 = r10 + r8
            goto L_0x003e
        L_0x0580:
            long r0 = (long) r8
            int r15 = r5.getInt(r12, r0)
            goto L_0x0030
        L_0x0587:
            r16 = 0
            goto L_0x0035
        L_0x058b:
            r5.getObject(r12, r0)
            java.lang.String r0 = "isEmpty"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0595:
            X.SK0 r1 = r11.A09
            X.STV r0 = r1.A02(r12)
            int r0 = r1.A00(r0)
            int r10 = r10 + r0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12589Syo.FOw(java.lang.Object):int");
    }

    public final C8563Qx1 FPb() {
        return ((C8563Qx1) this.A07).A0M();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0256, code lost:
        X.SUi.A0O(r6, (java.util.List) r4.getObject(r11, r0), r5[r3], r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0264, code lost:
        X.SUi.A0P(r6, (java.util.List) r4.getObject(r11, r0), r5[r3], r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0272, code lost:
        X.SUi.A0R(r6, (java.util.List) r4.getObject(r11, r0), r5[r3], r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0280, code lost:
        X.SUi.A0K(r6, (java.util.List) r4.getObject(r11, r0), r5[r3], r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x028e, code lost:
        X.SUi.A0S(r6, (java.util.List) r4.getObject(r11, r0), r5[r3], r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x029c, code lost:
        X.SUi.A0Q(r6, (java.util.List) r4.getObject(r11, r0), r5[r3], r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02aa, code lost:
        X.SUi.A0M(r6, (java.util.List) r4.getObject(r11, r0), r5[r3], r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01aa, code lost:
        X.SUi.A0H(r6, (java.util.List) r4.getObject(r11, r0), r5[r3], r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b8, code lost:
        X.SUi.A0G(r6, (java.util.List) r4.getObject(r11, r0), r5[r3], r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c6, code lost:
        X.SUi.A0T(r6, (java.util.List) r4.getObject(r11, r0), r5[r3], r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d4, code lost:
        X.SUi.A0N(r6, (java.util.List) r4.getObject(r11, r0), r5[r3], r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e2, code lost:
        X.SUi.A0J(r6, (java.util.List) r4.getObject(r11, r0), r5[r3], r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FQ3(X.C13865Tim r24, java.lang.Object r25) {
        /*
            r23 = this;
            r16 = 0
            r7 = r23
            int[] r5 = r7.A0A
            sun.misc.Unsafe r4 = A0D
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r21 = 0
            r3 = 0
        L_0x0011:
            int r0 = r5.length
            r6 = r24
            r11 = r25
            if (r3 >= r0) goto L_0x046a
            int r13 = r7.A04(r3)
            int r10 = A02(r13)
            r2 = r5[r3]
            r0 = 17
            r9 = 1
            if (r10 > r0) goto L_0x0466
            int r0 = r3 + 2
            r15 = r5[r0]
            r14 = r15 & r8
            if (r14 == r12) goto L_0x0034
            if (r14 != r8) goto L_0x045f
            r21 = 0
        L_0x0033:
            r12 = r14
        L_0x0034:
            int r0 = r15 >>> 20
            int r22 = r9 << r0
        L_0x0038:
            r13 = r13 & r8
            long r0 = (long) r13
            switch(r10) {
                case 0: goto L_0x0448;
                case 1: goto L_0x0431;
                case 2: goto L_0x041a;
                case 3: goto L_0x0403;
                case 4: goto L_0x03ec;
                case 5: goto L_0x03d5;
                case 6: goto L_0x03be;
                case 7: goto L_0x03a7;
                case 8: goto L_0x0390;
                case 9: goto L_0x0375;
                case 10: goto L_0x035c;
                case 11: goto L_0x0345;
                case 12: goto L_0x032e;
                case 13: goto L_0x0317;
                case 14: goto L_0x0300;
                case 15: goto L_0x02e9;
                case 16: goto L_0x02d2;
                case 17: goto L_0x02b7;
                case 18: goto L_0x02a9;
                case 19: goto L_0x029b;
                case 20: goto L_0x028d;
                case 21: goto L_0x027f;
                case 22: goto L_0x0271;
                case 23: goto L_0x0263;
                case 24: goto L_0x0255;
                case 25: goto L_0x0247;
                case 26: goto L_0x0230;
                case 27: goto L_0x0206;
                case 28: goto L_0x01ef;
                case 29: goto L_0x01e1;
                case 30: goto L_0x01d3;
                case 31: goto L_0x01c5;
                case 32: goto L_0x01b7;
                case 33: goto L_0x01a9;
                case 34: goto L_0x019b;
                case 35: goto L_0x02aa;
                case 36: goto L_0x029c;
                case 37: goto L_0x028e;
                case 38: goto L_0x0280;
                case 39: goto L_0x0272;
                case 40: goto L_0x0264;
                case 41: goto L_0x0256;
                case 42: goto L_0x018e;
                case 43: goto L_0x01e2;
                case 44: goto L_0x01d4;
                case 45: goto L_0x01c6;
                case 46: goto L_0x01b8;
                case 47: goto L_0x01aa;
                case 48: goto L_0x0181;
                case 49: goto L_0x0157;
                case 50: goto L_0x0150;
                case 51: goto L_0x0141;
                case 52: goto L_0x0132;
                case 53: goto L_0x0123;
                case 54: goto L_0x0114;
                case 55: goto L_0x0105;
                case 56: goto L_0x00f6;
                case 57: goto L_0x00e7;
                case 58: goto L_0x00d8;
                case 59: goto L_0x00c9;
                case 60: goto L_0x00b6;
                case 61: goto L_0x00a6;
                case 62: goto L_0x0098;
                case 63: goto L_0x008a;
                case 64: goto L_0x007c;
                case 65: goto L_0x006e;
                case 66: goto L_0x0060;
                case 67: goto L_0x0052;
                case 68: goto L_0x0040;
                default: goto L_0x003d;
            }
        L_0x003d:
            int r3 = r3 + 3
            goto L_0x0011
        L_0x0040:
            boolean r9 = r7.A0R(r11, r2, r3)
            if (r9 == 0) goto L_0x003d
            java.lang.Object r1 = r4.getObject(r11, r0)
            X.TiL r0 = r7.A0A(r3)
            r6.FQK(r0, r1, r2)
            goto L_0x003d
        L_0x0052:
            boolean r9 = r7.A0R(r11, r2, r3)
            if (r9 == 0) goto L_0x003d
            long r0 = A07(r11, r0)
            r6.FOk(r2, r0)
            goto L_0x003d
        L_0x0060:
            boolean r9 = r7.A0R(r11, r2, r3)
            if (r9 == 0) goto L_0x003d
            int r0 = A06(r11, r0)
            r6.FOi(r2, r0)
            goto L_0x003d
        L_0x006e:
            boolean r9 = r7.A0R(r11, r2, r3)
            if (r9 == 0) goto L_0x003d
            long r0 = A07(r11, r0)
            r6.FQU(r2, r0)
            goto L_0x003d
        L_0x007c:
            boolean r9 = r7.A0R(r11, r2, r3)
            if (r9 == 0) goto L_0x003d
            int r0 = A06(r11, r0)
            r6.FQR(r2, r0)
            goto L_0x003d
        L_0x008a:
            boolean r9 = r7.A0R(r11, r2, r3)
            if (r9 == 0) goto L_0x003d
            int r0 = A06(r11, r0)
            r6.FQ1(r2, r0)
            goto L_0x003d
        L_0x0098:
            boolean r9 = r7.A0R(r11, r2, r3)
            if (r9 == 0) goto L_0x003d
            int r0 = A06(r11, r0)
            r6.FOp(r2, r0)
            goto L_0x003d
        L_0x00a6:
            boolean r9 = r7.A0R(r11, r2, r3)
            if (r9 == 0) goto L_0x003d
            java.lang.Object r0 = r4.getObject(r11, r0)
            X.TAQ r0 = (X.TAQ) r0
            r6.FPY(r0, r2)
            goto L_0x003d
        L_0x00b6:
            boolean r9 = r7.A0R(r11, r2, r3)
            if (r9 == 0) goto L_0x003d
            java.lang.Object r1 = r4.getObject(r11, r0)
            X.TiL r0 = r7.A0A(r3)
            r6.FQQ(r0, r1, r2)
            goto L_0x003d
        L_0x00c9:
            boolean r9 = r7.A0R(r11, r2, r3)
            if (r9 == 0) goto L_0x003d
            java.lang.Object r0 = r4.getObject(r11, r0)
            A0I(r6, r0, r2)
            goto L_0x003d
        L_0x00d8:
            boolean r9 = r7.A0R(r11, r2, r3)
            if (r9 == 0) goto L_0x003d
            boolean r0 = A0T(r11, r0)
            r6.FPH(r2, r0)
            goto L_0x003d
        L_0x00e7:
            boolean r9 = r7.A0R(r11, r2, r3)
            if (r9 == 0) goto L_0x003d
            int r0 = A06(r11, r0)
            r6.FQ9(r2, r0)
            goto L_0x003d
        L_0x00f6:
            boolean r9 = r7.A0R(r11, r2, r3)
            if (r9 == 0) goto L_0x003d
            long r0 = A07(r11, r0)
            r6.FQF(r2, r0)
            goto L_0x003d
        L_0x0105:
            boolean r9 = r7.A0R(r11, r2, r3)
            if (r9 == 0) goto L_0x003d
            int r0 = A06(r11, r0)
            r6.FQL(r2, r0)
            goto L_0x003d
        L_0x0114:
            boolean r9 = r7.A0R(r11, r2, r3)
            if (r9 == 0) goto L_0x003d
            long r0 = A07(r11, r0)
            r6.FOr(r2, r0)
            goto L_0x003d
        L_0x0123:
            boolean r9 = r7.A0R(r11, r2, r3)
            if (r9 == 0) goto L_0x003d
            long r0 = A07(r11, r0)
            r6.FQN(r2, r0)
            goto L_0x003d
        L_0x0132:
            boolean r9 = r7.A0R(r11, r2, r3)
            if (r9 == 0) goto L_0x003d
            float r0 = A01(r11, r0)
            r6.FQI(r2, r0)
            goto L_0x003d
        L_0x0141:
            boolean r9 = r7.A0R(r11, r2, r3)
            if (r9 == 0) goto L_0x003d
            double r0 = A00(r11, r0)
            r6.FPk(r2, r0)
            goto L_0x003d
        L_0x0150:
            java.lang.Object r0 = r4.getObject(r11, r0)
            if (r0 == 0) goto L_0x003d
            throw r16
        L_0x0157:
            r9 = r5[r3]
            java.lang.Object r11 = r4.getObject(r11, r0)
            java.util.List r11 = (java.util.List) r11
            X.TiL r10 = r7.A0A(r3)
            X.SK0 r0 = X.SUi.A01
            if (r11 == 0) goto L_0x003d
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x003d
            r2 = 0
        L_0x016e:
            int r0 = r11.size()
            if (r2 >= r0) goto L_0x003d
            java.lang.Object r1 = r11.get(r2)
            r0 = r6
            X.Syq r0 = (X.C12591Syq) r0
            r0.FQK(r10, r1, r9)
            int r2 = r2 + 1
            goto L_0x016e
        L_0x0181:
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r11, r0)
            java.util.List r0 = (java.util.List) r0
            X.SUi.A0I(r6, r0, r2, r9)
            goto L_0x003d
        L_0x018e:
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r11, r0)
            java.util.List r0 = (java.util.List) r0
            X.SUi.A0L(r6, r0, r2, r9)
            goto L_0x003d
        L_0x019b:
            r2 = r5[r3]
            java.lang.Object r1 = r4.getObject(r11, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            X.SUi.A0I(r6, r1, r2, r0)
            goto L_0x003d
        L_0x01a9:
            r9 = 0
        L_0x01aa:
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r11, r0)
            java.util.List r0 = (java.util.List) r0
            X.SUi.A0H(r6, r0, r2, r9)
            goto L_0x003d
        L_0x01b7:
            r9 = 0
        L_0x01b8:
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r11, r0)
            java.util.List r0 = (java.util.List) r0
            X.SUi.A0G(r6, r0, r2, r9)
            goto L_0x003d
        L_0x01c5:
            r9 = 0
        L_0x01c6:
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r11, r0)
            java.util.List r0 = (java.util.List) r0
            X.SUi.A0T(r6, r0, r2, r9)
            goto L_0x003d
        L_0x01d3:
            r9 = 0
        L_0x01d4:
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r11, r0)
            java.util.List r0 = (java.util.List) r0
            X.SUi.A0N(r6, r0, r2, r9)
            goto L_0x003d
        L_0x01e1:
            r9 = 0
        L_0x01e2:
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r11, r0)
            java.util.List r0 = (java.util.List) r0
            X.SUi.A0J(r6, r0, r2, r9)
            goto L_0x003d
        L_0x01ef:
            r2 = r5[r3]
            java.lang.Object r1 = r4.getObject(r11, r0)
            java.util.List r1 = (java.util.List) r1
            X.SK0 r0 = X.SUi.A01
            if (r1 == 0) goto L_0x003d
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x003d
            r6.FPd(r2, r1)
            goto L_0x003d
        L_0x0206:
            r9 = r5[r3]
            java.lang.Object r11 = r4.getObject(r11, r0)
            java.util.List r11 = (java.util.List) r11
            X.TiL r10 = r7.A0A(r3)
            X.SK0 r0 = X.SUi.A01
            if (r11 == 0) goto L_0x003d
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x003d
            r2 = 0
        L_0x021d:
            int r0 = r11.size()
            if (r2 >= r0) goto L_0x003d
            java.lang.Object r1 = r11.get(r2)
            r0 = r6
            X.Syq r0 = (X.C12591Syq) r0
            r0.FQQ(r10, r1, r9)
            int r2 = r2 + 1
            goto L_0x021d
        L_0x0230:
            r2 = r5[r3]
            java.lang.Object r1 = r4.getObject(r11, r0)
            java.util.List r1 = (java.util.List) r1
            X.SK0 r0 = X.SUi.A01
            if (r1 == 0) goto L_0x003d
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x003d
            r6.FOo(r2, r1)
            goto L_0x003d
        L_0x0247:
            r2 = r5[r3]
            java.lang.Object r1 = r4.getObject(r11, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            X.SUi.A0L(r6, r1, r2, r0)
            goto L_0x003d
        L_0x0255:
            r9 = 0
        L_0x0256:
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r11, r0)
            java.util.List r0 = (java.util.List) r0
            X.SUi.A0O(r6, r0, r2, r9)
            goto L_0x003d
        L_0x0263:
            r9 = 0
        L_0x0264:
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r11, r0)
            java.util.List r0 = (java.util.List) r0
            X.SUi.A0P(r6, r0, r2, r9)
            goto L_0x003d
        L_0x0271:
            r9 = 0
        L_0x0272:
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r11, r0)
            java.util.List r0 = (java.util.List) r0
            X.SUi.A0R(r6, r0, r2, r9)
            goto L_0x003d
        L_0x027f:
            r9 = 0
        L_0x0280:
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r11, r0)
            java.util.List r0 = (java.util.List) r0
            X.SUi.A0K(r6, r0, r2, r9)
            goto L_0x003d
        L_0x028d:
            r9 = 0
        L_0x028e:
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r11, r0)
            java.util.List r0 = (java.util.List) r0
            X.SUi.A0S(r6, r0, r2, r9)
            goto L_0x003d
        L_0x029b:
            r9 = 0
        L_0x029c:
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r11, r0)
            java.util.List r0 = (java.util.List) r0
            X.SUi.A0Q(r6, r0, r2, r9)
            goto L_0x003d
        L_0x02a9:
            r9 = 0
        L_0x02aa:
            r2 = r5[r3]
            java.lang.Object r0 = r4.getObject(r11, r0)
            java.util.List r0 = (java.util.List) r0
            X.SUi.A0M(r6, r0, r2, r9)
            goto L_0x003d
        L_0x02b7:
            r20 = r12
            r19 = r3
            r18 = r11
            r17 = r7
            boolean r9 = r17.A0S(r18, r19, r20, r21, r22)
            if (r9 == 0) goto L_0x003d
            java.lang.Object r1 = r4.getObject(r11, r0)
            X.TiL r0 = r7.A0A(r3)
            r6.FQK(r0, r1, r2)
            goto L_0x003d
        L_0x02d2:
            r20 = r12
            r19 = r3
            r18 = r11
            r17 = r7
            boolean r9 = r17.A0S(r18, r19, r20, r21, r22)
            if (r9 == 0) goto L_0x003d
            long r0 = r4.getLong(r11, r0)
            r6.FOk(r2, r0)
            goto L_0x003d
        L_0x02e9:
            r20 = r12
            r19 = r3
            r18 = r11
            r17 = r7
            boolean r9 = r17.A0S(r18, r19, r20, r21, r22)
            if (r9 == 0) goto L_0x003d
            int r0 = r4.getInt(r11, r0)
            r6.FOi(r2, r0)
            goto L_0x003d
        L_0x0300:
            r20 = r12
            r19 = r3
            r18 = r11
            r17 = r7
            boolean r9 = r17.A0S(r18, r19, r20, r21, r22)
            if (r9 == 0) goto L_0x003d
            long r0 = r4.getLong(r11, r0)
            r6.FQU(r2, r0)
            goto L_0x003d
        L_0x0317:
            r20 = r12
            r19 = r3
            r18 = r11
            r17 = r7
            boolean r9 = r17.A0S(r18, r19, r20, r21, r22)
            if (r9 == 0) goto L_0x003d
            int r0 = r4.getInt(r11, r0)
            r6.FQR(r2, r0)
            goto L_0x003d
        L_0x032e:
            r20 = r12
            r19 = r3
            r18 = r11
            r17 = r7
            boolean r9 = r17.A0S(r18, r19, r20, r21, r22)
            if (r9 == 0) goto L_0x003d
            int r0 = r4.getInt(r11, r0)
            r6.FQ1(r2, r0)
            goto L_0x003d
        L_0x0345:
            r20 = r12
            r19 = r3
            r18 = r11
            r17 = r7
            boolean r9 = r17.A0S(r18, r19, r20, r21, r22)
            if (r9 == 0) goto L_0x003d
            int r0 = r4.getInt(r11, r0)
            r6.FOp(r2, r0)
            goto L_0x003d
        L_0x035c:
            r20 = r12
            r19 = r3
            r18 = r11
            r17 = r7
            boolean r9 = r17.A0S(r18, r19, r20, r21, r22)
            if (r9 == 0) goto L_0x003d
            java.lang.Object r0 = r4.getObject(r11, r0)
            X.TAQ r0 = (X.TAQ) r0
            r6.FPY(r0, r2)
            goto L_0x003d
        L_0x0375:
            r20 = r12
            r19 = r3
            r18 = r11
            r17 = r7
            boolean r9 = r17.A0S(r18, r19, r20, r21, r22)
            if (r9 == 0) goto L_0x003d
            java.lang.Object r1 = r4.getObject(r11, r0)
            X.TiL r0 = r7.A0A(r3)
            r6.FQQ(r0, r1, r2)
            goto L_0x003d
        L_0x0390:
            r20 = r12
            r19 = r3
            r18 = r11
            r17 = r7
            boolean r9 = r17.A0S(r18, r19, r20, r21, r22)
            if (r9 == 0) goto L_0x003d
            java.lang.Object r0 = r4.getObject(r11, r0)
            A0I(r6, r0, r2)
            goto L_0x003d
        L_0x03a7:
            r20 = r12
            r19 = r3
            r18 = r11
            r17 = r7
            boolean r9 = r17.A0S(r18, r19, r20, r21, r22)
            if (r9 == 0) goto L_0x003d
            boolean r0 = X.SUg.A0R(r11, r0)
            r6.FPH(r2, r0)
            goto L_0x003d
        L_0x03be:
            r20 = r12
            r19 = r3
            r18 = r11
            r17 = r7
            boolean r9 = r17.A0S(r18, r19, r20, r21, r22)
            if (r9 == 0) goto L_0x003d
            int r0 = r4.getInt(r11, r0)
            r6.FQ9(r2, r0)
            goto L_0x003d
        L_0x03d5:
            r20 = r12
            r19 = r3
            r18 = r11
            r17 = r7
            boolean r9 = r17.A0S(r18, r19, r20, r21, r22)
            if (r9 == 0) goto L_0x003d
            long r0 = r4.getLong(r11, r0)
            r6.FQF(r2, r0)
            goto L_0x003d
        L_0x03ec:
            r20 = r12
            r19 = r3
            r18 = r11
            r17 = r7
            boolean r9 = r17.A0S(r18, r19, r20, r21, r22)
            if (r9 == 0) goto L_0x003d
            int r0 = r4.getInt(r11, r0)
            r6.FQL(r2, r0)
            goto L_0x003d
        L_0x0403:
            r20 = r12
            r19 = r3
            r18 = r11
            r17 = r7
            boolean r9 = r17.A0S(r18, r19, r20, r21, r22)
            if (r9 == 0) goto L_0x003d
            long r0 = r4.getLong(r11, r0)
            r6.FOr(r2, r0)
            goto L_0x003d
        L_0x041a:
            r20 = r12
            r19 = r3
            r18 = r11
            r17 = r7
            boolean r9 = r17.A0S(r18, r19, r20, r21, r22)
            if (r9 == 0) goto L_0x003d
            long r0 = r4.getLong(r11, r0)
            r6.FQN(r2, r0)
            goto L_0x003d
        L_0x0431:
            r20 = r12
            r19 = r3
            r18 = r11
            r17 = r7
            boolean r9 = r17.A0S(r18, r19, r20, r21, r22)
            if (r9 == 0) goto L_0x003d
            float r0 = X.SUg.A01(r11, r0)
            r6.FQI(r2, r0)
            goto L_0x003d
        L_0x0448:
            r20 = r12
            r19 = r3
            r18 = r11
            r17 = r7
            boolean r9 = r17.A0S(r18, r19, r20, r21, r22)
            if (r9 == 0) goto L_0x003d
            double r0 = X.SUg.A00(r11, r0)
            r6.FPk(r2, r0)
            goto L_0x003d
        L_0x045f:
            long r0 = (long) r14
            int r21 = r4.getInt(r11, r0)
            goto L_0x0033
        L_0x0466:
            r22 = 0
            goto L_0x0038
        L_0x046a:
            X.SK0 r1 = r7.A09
            X.STV r0 = r1.A02(r11)
            r1.A05(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12589Syo.FQ3(X.Tim, java.lang.Object):void");
    }

    public static double A00(Object obj, long j) {
        return JTO.A00(SUg.A06(obj, j));
    }

    public static float A01(Object obj, long j) {
        return AnonymousClass7TE.A04(SUg.A06(obj, j));
    }

    public static int A06(Object obj, long j) {
        return AnonymousClass7TE.A0M(SUg.A06(obj, j));
    }

    public static long A07(Object obj, long j) {
        return AnonymousClass7TE.A0R(SUg.A06(obj, j));
    }

    private final Object A0C(int i, int i2, Object obj) {
        C13845TiL A0A2 = A0A(i2);
        if (!A0R(obj, i, i2)) {
            return A0A2.FPb();
        }
        Object object = A0D.getObject(obj, Pxe.A0B(A04(i2)));
        if (A0Q(object)) {
            return object;
        }
        C8563Qx1 FPb = A0A2.FPb();
        if (object != null) {
            A0A2.FPr(FPb, object);
        }
        return FPb;
    }

    private final Object A0D(Object obj, int i) {
        C13845TiL A0A2 = A0A(i);
        int A042 = A04(i) & 1048575;
        if (!A0N(i, obj)) {
            return A0A2.FPb();
        }
        Object object = A0D.getObject(obj, (long) A042);
        if (A0Q(object)) {
            return object;
        }
        C8563Qx1 FPb = A0A2.FPb();
        if (object != null) {
            A0A2.FPr(FPb, object);
        }
        return FPb;
    }

    private final void A0G(int i, Object obj, Object obj2) {
        if (A0N(i, obj2)) {
            Unsafe unsafe = A0D;
            long A042 = (long) (A04(i) & 1048575);
            Object object = unsafe.getObject(obj2, A042);
            if (object != null) {
                C13845TiL A0A2 = A0A(i);
                if (!A0N(i, obj)) {
                    if (!A0Q(object)) {
                        unsafe.putObject(obj, A042, object);
                    } else {
                        C8563Qx1 FPb = A0A2.FPb();
                        A0A2.FPr(FPb, object);
                        unsafe.putObject(obj, A042, FPb);
                    }
                    A0K(obj, i);
                    return;
                }
                Object object2 = unsafe.getObject(obj, A042);
                if (!A0Q(object2)) {
                    C8563Qx1 FPb2 = A0A2.FPb();
                    A0A2.FPr(FPb2, object2);
                    unsafe.putObject(obj, A042, FPb2);
                    object2 = FPb2;
                }
                A0A2.FPr(object2, object);
                return;
            }
            throw Pxj.A0h(obj2, this.A0A, i);
        }
    }

    public static void A0J(Object obj) {
        if (!A0Q(obj)) {
            throw AnonymousClass7TE.A0w("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void A0K(Object obj, int i) {
        int A032 = A03(i);
        long j = (long) (1048575 & A032);
        if (j != 1048575) {
            SUg.A0H(obj, j, (1 << (A032 >>> 20)) | SUg.A03(obj, j));
        }
    }

    private final void A0L(Object obj, int i, int i2) {
        SUg.A0H(obj, Pxe.A0B(A03(i2)), i);
    }

    private final boolean A0N(int i, Object obj) {
        int A032 = A03(i);
        long j = (long) (A032 & 1048575);
        if (j == 1048575) {
            int A042 = A04(i);
            long j2 = (long) (1048575 & A042);
            switch (A02(A042)) {
                case 0:
                    if (Double.doubleToRawLongBits(SUg.A00(obj, j2)) != 0) {
                        return true;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(SUg.A01(obj, j2)) != 0) {
                        return true;
                    }
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (SUg.A04(obj, j2) != 0) {
                        return true;
                    }
                    break;
                case 4:
                case 6:
                case 11:
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                case 13:
                case 15:
                    if (SUg.A03(obj, j2) != 0) {
                        return true;
                    }
                    break;
                case 7:
                    return SUg.A0R(obj, j2);
                case 8:
                    Object A062 = SUg.A06(obj, j2);
                    if (A062 instanceof String) {
                        if (!((String) A062).isEmpty()) {
                            return true;
                        }
                    } else if (!(A062 instanceof TAQ)) {
                        throw Pxe.A0g();
                    } else if (!TAQ.A01.equals(A062)) {
                        return true;
                    }
                    break;
                case 9:
                case 17:
                    if (SUg.A06(obj, j2) != null) {
                        return true;
                    }
                    break;
                case 10:
                    if (!TAQ.A01.equals(SUg.A06(obj, j2))) {
                        return true;
                    }
                    break;
                default:
                    throw Pxe.A0g();
            }
        } else {
            if ((SUg.A03(obj, j) & (1 << (A032 >>> 20))) != 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean A0O(int i, Object obj, Object obj2) {
        return AnonymousClass7TF.A1S(A0N(i, obj) ? 1 : 0, A0N(i, obj2) ? 1 : 0);
    }

    public static boolean A0P(C13845TiL tiL, Object obj, int i) {
        return tiL.FQA(SUg.A06(obj, Pxe.A0B(i)));
    }

    private final boolean A0R(Object obj, int i, int i2) {
        return AnonymousClass7TF.A1S(SUg.A03(obj, Pxe.A0B(A03(i2))), i);
    }

    private final boolean A0S(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return A0N(i, obj);
        }
        return AnonymousClass7TF.A1P(i3 & i4);
    }

    public static boolean A0T(Object obj, long j) {
        return AnonymousClass7TE.A1a(SUg.A06(obj, j));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0037, code lost:
        continue;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0037 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FPl(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = A0Q(r7)
            if (r0 == 0) goto L_0x0070
            boolean r0 = r7 instanceof X.C8563Qx1
            r5 = 0
            if (r0 == 0) goto L_0x0016
            r0 = r7
            X.Qx1 r0 = (X.C8563Qx1) r0
            r0.A0Q()
            r0.zza = r5
            r0.A0P()
        L_0x0016:
            int[] r4 = r6.A0A
        L_0x0018:
            int r0 = r4.length
            if (r5 >= r0) goto L_0x006b
            int r1 = r6.A04(r5)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            int r1 = A02(r1)
            long r2 = (long) r0
            r0 = 9
            if (r1 == r0) goto L_0x0050
            r0 = 60
            if (r1 == r0) goto L_0x0055
            r0 = 68
            if (r1 == r0) goto L_0x0055
            switch(r1) {
                case 17: goto L_0x0050;
                case 18: goto L_0x004a;
                case 19: goto L_0x004a;
                case 20: goto L_0x004a;
                case 21: goto L_0x004a;
                case 22: goto L_0x004a;
                case 23: goto L_0x004a;
                case 24: goto L_0x004a;
                case 25: goto L_0x004a;
                case 26: goto L_0x004a;
                case 27: goto L_0x004a;
                case 28: goto L_0x004a;
                case 29: goto L_0x004a;
                case 30: goto L_0x004a;
                case 31: goto L_0x004a;
                case 32: goto L_0x004a;
                case 33: goto L_0x004a;
                case 34: goto L_0x004a;
                case 35: goto L_0x004a;
                case 36: goto L_0x004a;
                case 37: goto L_0x004a;
                case 38: goto L_0x004a;
                case 39: goto L_0x004a;
                case 40: goto L_0x004a;
                case 41: goto L_0x004a;
                case 42: goto L_0x004a;
                case 43: goto L_0x004a;
                case 44: goto L_0x004a;
                case 45: goto L_0x004a;
                case 46: goto L_0x004a;
                case 47: goto L_0x004a;
                case 48: goto L_0x004a;
                case 49: goto L_0x004a;
                case 50: goto L_0x003a;
                default: goto L_0x0037;
            }
        L_0x0037:
            int r5 = r5 + 3
            goto L_0x0018
        L_0x003a:
            sun.misc.Unsafe r0 = A0D
            java.lang.Object r0 = r0.getObject(r7, r2)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "zzc"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x004a:
            X.SRF r0 = r6.A05
            r0.A02(r7, r2)
            goto L_0x0037
        L_0x0050:
            boolean r0 = r6.A0N(r5, r7)
            goto L_0x005b
        L_0x0055:
            r0 = r4[r5]
            boolean r0 = r6.A0R(r7, r0, r5)
        L_0x005b:
            if (r0 == 0) goto L_0x0037
            X.TiL r1 = r6.A0A(r5)
            sun.misc.Unsafe r0 = A0D
            java.lang.Object r0 = r0.getObject(r7, r2)
            r1.FPl(r0)
            goto L_0x0037
        L_0x006b:
            X.SK0 r0 = r6.A09
            r0.A06(r7)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12589Syo.FPl(java.lang.Object):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        X.SUg.A0J(r7, r1, X.SUg.A06(r8, r1));
        A0L(r7, r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009a, code lost:
        A0K(r7, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FPr(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            A0J(r7)
            r8.getClass()
            r5 = 0
        L_0x0007:
            int[] r2 = r6.A0A
            int r0 = r2.length
            if (r5 >= r0) goto L_0x00ae
            int r0 = r6.A04(r5)
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            int r0 = A02(r0)
            r3 = r2[r5]
            long r1 = (long) r1
            switch(r0) {
                case 0: goto L_0x008d;
                case 1: goto L_0x007f;
                case 2: goto L_0x0071;
                case 3: goto L_0x0071;
                case 4: goto L_0x0063;
                case 5: goto L_0x0071;
                case 6: goto L_0x0063;
                case 7: goto L_0x0055;
                case 8: goto L_0x0047;
                case 9: goto L_0x0043;
                case 10: goto L_0x0047;
                case 11: goto L_0x0063;
                case 12: goto L_0x0063;
                case 13: goto L_0x0063;
                case 14: goto L_0x0071;
                case 15: goto L_0x0063;
                case 16: goto L_0x0071;
                case 17: goto L_0x0043;
                case 18: goto L_0x003d;
                case 19: goto L_0x003d;
                case 20: goto L_0x003d;
                case 21: goto L_0x003d;
                case 22: goto L_0x003d;
                case 23: goto L_0x003d;
                case 24: goto L_0x003d;
                case 25: goto L_0x003d;
                case 26: goto L_0x003d;
                case 27: goto L_0x003d;
                case 28: goto L_0x003d;
                case 29: goto L_0x003d;
                case 30: goto L_0x003d;
                case 31: goto L_0x003d;
                case 32: goto L_0x003d;
                case 33: goto L_0x003d;
                case 34: goto L_0x003d;
                case 35: goto L_0x003d;
                case 36: goto L_0x003d;
                case 37: goto L_0x003d;
                case 38: goto L_0x003d;
                case 39: goto L_0x003d;
                case 40: goto L_0x003d;
                case 41: goto L_0x003d;
                case 42: goto L_0x003d;
                case 43: goto L_0x003d;
                case 44: goto L_0x003d;
                case 45: goto L_0x003d;
                case 46: goto L_0x003d;
                case 47: goto L_0x003d;
                case 48: goto L_0x003d;
                case 49: goto L_0x003d;
                case 50: goto L_0x009e;
                case 51: goto L_0x002c;
                case 52: goto L_0x002c;
                case 53: goto L_0x002c;
                case 54: goto L_0x002c;
                case 55: goto L_0x002c;
                case 56: goto L_0x002c;
                case 57: goto L_0x002c;
                case 58: goto L_0x002c;
                case 59: goto L_0x002c;
                case 60: goto L_0x0028;
                case 61: goto L_0x0021;
                case 62: goto L_0x0021;
                case 63: goto L_0x0021;
                case 64: goto L_0x0021;
                case 65: goto L_0x0021;
                case 66: goto L_0x0021;
                case 67: goto L_0x0021;
                case 68: goto L_0x0028;
                default: goto L_0x001e;
            }
        L_0x001e:
            int r5 = r5 + 3
            goto L_0x0007
        L_0x0021:
            boolean r0 = r6.A0R(r8, r3, r5)
            if (r0 == 0) goto L_0x001e
            goto L_0x0032
        L_0x0028:
            r6.A0H(r5, r7, r8)
            goto L_0x001e
        L_0x002c:
            boolean r0 = r6.A0R(r8, r3, r5)
            if (r0 == 0) goto L_0x001e
        L_0x0032:
            java.lang.Object r0 = X.SUg.A06(r8, r1)
            X.SUg.A0J(r7, r1, r0)
            r6.A0L(r7, r3, r5)
            goto L_0x001e
        L_0x003d:
            X.SRF r0 = r6.A05
            r0.A03(r7, r1, r8)
            goto L_0x001e
        L_0x0043:
            r6.A0G(r5, r7, r8)
            goto L_0x001e
        L_0x0047:
            boolean r0 = r6.A0N(r5, r8)
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = X.SUg.A06(r8, r1)
            X.SUg.A0J(r7, r1, r0)
            goto L_0x009a
        L_0x0055:
            boolean r0 = r6.A0N(r5, r8)
            if (r0 == 0) goto L_0x001e
            boolean r0 = X.SUg.A0R(r8, r1)
            X.SUg.A0K(r7, r1, r0)
            goto L_0x009a
        L_0x0063:
            boolean r0 = r6.A0N(r5, r8)
            if (r0 == 0) goto L_0x001e
            int r0 = X.SUg.A03(r8, r1)
            X.SUg.A0H(r7, r1, r0)
            goto L_0x009a
        L_0x0071:
            boolean r0 = r6.A0N(r5, r8)
            if (r0 == 0) goto L_0x001e
            long r3 = X.SUg.A04(r8, r1)
            X.SUg.A0I(r7, r1, r3)
            goto L_0x009a
        L_0x007f:
            boolean r0 = r6.A0N(r5, r8)
            if (r0 == 0) goto L_0x001e
            float r0 = X.SUg.A01(r8, r1)
            X.SUg.A0G(r7, r1, r0)
            goto L_0x009a
        L_0x008d:
            boolean r0 = r6.A0N(r5, r8)
            if (r0 == 0) goto L_0x001e
            double r3 = X.SUg.A00(r8, r1)
            X.SUg.A0F(r7, r1, r3)
        L_0x009a:
            r6.A0K(r7, r5)
            goto L_0x001e
        L_0x009e:
            X.SK0 r0 = X.SUi.A01
            X.SUg.A06(r7, r1)
            X.SUg.A06(r8, r1)
            X.SA6.A00()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00ae:
            X.SK0 r0 = r6.A09
            X.SUi.A0F(r0, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12589Syo.FPr(java.lang.Object, java.lang.Object):void");
    }

    public final boolean FQA(Object obj) {
        boolean z;
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        loop0:
        while (true) {
            if (i3 < this.A02) {
                int[] iArr = this.A0B;
                int[] iArr2 = this.A0A;
                int i4 = iArr[i3];
                int i5 = iArr2[i4];
                int A042 = A04(i4);
                int i6 = iArr2[i4 + 2];
                int i7 = i6 & 1048575;
                int i8 = 1 << (i6 >>> 20);
                Object obj2 = obj;
                if (i7 == i) {
                    i7 = i;
                } else if (i7 != 1048575) {
                    i2 = A0D.getInt(obj, (long) i7);
                }
                if ((268435456 & A042) != 0 && !A0S(obj2, i4, i7, i2, i8)) {
                    break;
                }
                int A022 = A02(A042);
                if (A022 == 9 || A022 == 17) {
                    z = A0S(obj2, i4, i7, i2, i8);
                } else {
                    if (A022 != 27) {
                        if (A022 == 60 || A022 == 68) {
                            z = A0R(obj, i5, i4);
                        } else if (A022 != 49) {
                            if (A022 == 50) {
                                SUg.A06(obj, (long) (A042 & 1048575));
                                throw AnonymousClass7TE.A11("isEmpty");
                            }
                            i3++;
                            i = i7;
                        }
                    }
                    List list = (List) SUg.A06(obj, (long) (A042 & 1048575));
                    if (!list.isEmpty()) {
                        C13845TiL A0A2 = A0A(i4);
                        for (int i9 = 0; i9 < list.size(); i9++) {
                            if (!A0A2.FQA(list.get(i9))) {
                                break loop0;
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                    i3++;
                    i = i7;
                }
                if (z && !A0P(A0A(i4), obj, A042)) {
                    break;
                }
                i3++;
                i = i7;
            } else {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v41, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v45, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v46, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v50, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v51, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v56, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v58, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v61, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v64, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v67, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v68, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v69, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v70, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v50, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v71, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v72, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v73, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v74, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v54, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v75, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v77, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v78, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v79, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v59, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v81, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v82, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v83, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v84, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v85, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v78, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v86, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v88, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v89, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v91, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v86, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v99, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v108, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v109, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v111, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v112, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v117, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v118, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v120, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v121, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v122, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v123, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v141, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v143, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v144, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v145, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v146, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v147, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v5, resolved type: byte} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0231, code lost:
        r14.putInt(r10, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0240, code lost:
        r14.putLong(r10, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x024b, code lost:
        r8 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x050e, code lost:
        if (r5 != r3) goto L_0x0787;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x05b2, code lost:
        if (r5 == r4) goto L_0x06f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x05b4, code lost:
        r3 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x061f, code lost:
        r14.putObject(r10, r2, r6);
        r14.putInt(r10, r16, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0631, code lost:
        r14.putObject(r10, r2, r6);
        r14.putInt(r10, r16, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x06ef, code lost:
        r14.putObject(r10, r2, r6);
        r14.putInt(r10, r16, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x06f9, code lost:
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x070f, code lost:
        if (r5 != r2) goto L_0x0787;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0711, code lost:
        if (r5 != r4) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0713, code lost:
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x071f, code lost:
        r0 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0724, code lost:
        if (r0 == 1048575) goto L_0x072a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0726, code lost:
        r14.putInt(r10, (long) r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x072a, code lost:
        r4 = r9.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x072e, code lost:
        if (r4 >= r9.A03) goto L_0x0772;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0730, code lost:
        r3 = r9.A0B[r4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x073e, code lost:
        if (X.SUg.A06(r10, (long) (A04(r3) & 1048575)) == null) goto L_0x0746;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0744, code lost:
        if (A08(r3) != null) goto L_0x0786;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0746, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0771, code lost:
        throw X.C8842RCi.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0772, code lost:
        r0 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0774, code lost:
        if (r43 != 0) goto L_0x0779;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0776, code lost:
        if (r5 != r0) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0778, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0779, code lost:
        if (r5 > r0) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x077f, code lost:
        if (r21 != r27) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0781, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0782, code lost:
        r26 = X.C8842RCi.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0786, code lost:
        throw r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x078b, code lost:
        throw X.C8842RCi.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01f4, code lost:
        r14.putObject(r10, r2, r13);
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r21v3, types: [byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x071a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0170  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0U(X.SFE r38, java.lang.Object r39, byte[] r40, int r41, int r42, int r43) {
        /*
            r37 = this;
            r10 = r39
            r5 = r41
            A0J(r10)
            sun.misc.Unsafe r14 = A0D
            r20 = 0
            r3 = -1
            r11 = 0
            r21 = 0
            r8 = 0
            r29 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0013:
            r26 = 0
            r9 = r37
            r35 = r42
            r27 = r43
            r0 = r35
            if (r5 >= r0) goto L_0x071f
            int r4 = r5 + 1
            r0 = r40
            byte r21 = r40[r5]
            r1 = r38
            if (r21 >= 0) goto L_0x0033
            r2 = r21
            int r4 = X.SUP.A0B(r1, r0, r2, r4)
            int r2 = r1.A00
            r21 = r2
        L_0x0033:
            int r15 = r21 >>> 3
            r28 = 3
            if (r15 <= r3) goto L_0x06fb
            int r11 = r11 / r28
            int r2 = r9.A00
            if (r15 < r2) goto L_0x070b
            int r2 = r9.A01
            if (r15 > r2) goto L_0x070b
            int r11 = r9.A05(r15, r11)
        L_0x0047:
            r2 = -1
            if (r11 == r2) goto L_0x070b
            r7 = r21 & 7
            int[] r2 = r9.A0A
            r16 = r2
            int r2 = r11 + 1
            r12 = r16[r2]
            int r25 = A02(r12)
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r12 & r24
            long r2 = (long) r2
            r23 = 536870912(0x20000000, float:1.0842022E-19)
            r18 = 0
            java.lang.String r13 = ""
            r5 = 17
            r6 = r5
            r5 = r25
            if (r5 > r6) goto L_0x0283
            int r5 = r11 + 2
            r22 = r16[r5]
            int r5 = r22 >>> 20
            r17 = 1
            int r16 = r17 << r5
            r22 = r22 & r24
            r6 = r22
            r5 = r29
            if (r6 == r5) goto L_0x027f
            r6 = r5
            r5 = r24
            if (r6 == r5) goto L_0x0086
            long r5 = (long) r6
            r14.putInt(r10, r5, r8)
        L_0x0086:
            r6 = r22
            r5 = r24
            if (r6 != r5) goto L_0x0278
            r8 = 0
        L_0x008d:
            switch(r25) {
                case 0: goto L_0x0263;
                case 1: goto L_0x024f;
                case 2: goto L_0x0236;
                case 3: goto L_0x0236;
                case 4: goto L_0x0227;
                case 5: goto L_0x021a;
                case 6: goto L_0x020e;
                case 7: goto L_0x01f9;
                case 8: goto L_0x0138;
                case 9: goto L_0x0118;
                case 10: goto L_0x010b;
                case 11: goto L_0x0227;
                case 12: goto L_0x00e0;
                case 13: goto L_0x020e;
                case 14: goto L_0x021a;
                case 15: goto L_0x00d0;
                case 16: goto L_0x00b8;
                default: goto L_0x0090;
            }
        L_0x0090:
            r2 = r28
            if (r7 != r2) goto L_0x0714
            r8 = r8 | r16
            java.lang.Object r2 = r9.A0D(r10, r11)
            int r3 = r15 << 3
            r29 = r3 | 4
            X.TiL r24 = r9.A0A(r11)
            r23 = r1
            r25 = r2
            r26 = r0
            r27 = r4
            r28 = r35
            int r5 = X.SUP.A04(r23, r24, r25, r26, r27, r28, r29)
            r9.A0M(r10, r11, r2)
        L_0x00b3:
            r3 = r15
            r29 = r22
            goto L_0x0013
        L_0x00b8:
            if (r7 != 0) goto L_0x0714
            r8 = r8 | r16
            int r5 = X.SUP.A0A(r1, r0, r4)
            long r0 = r1.A01
            long r27 = X.SR6.A01(r0)
            r23 = r14
            r24 = r10
            r25 = r2
            r23.putLong(r24, r25, r27)
            goto L_0x00b3
        L_0x00d0:
            if (r7 != 0) goto L_0x0714
            r8 = r8 | r16
            int r5 = X.SUP.A09(r1, r0, r4)
            int r0 = r1.A00
            int r1 = X.SR6.A00(r0)
            goto L_0x0231
        L_0x00e0:
            if (r7 != 0) goto L_0x0714
            int r5 = X.SUP.A09(r1, r0, r4)
            int r1 = r1.A00
            X.TeG r4 = r9.A08(r11)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = r12 & r0
            if (r12 == 0) goto L_0x0107
            if (r4 == 0) goto L_0x0107
            boolean r0 = r4.FP9(r1)
            if (r0 != 0) goto L_0x0107
            X.STV r2 = A0B(r10)
            java.lang.Long r1 = X.DbS.A0j(r1)
            r0 = r21
            r2.A08(r0, r1)
            goto L_0x00b3
        L_0x0107:
            r8 = r8 | r16
            goto L_0x0231
        L_0x010b:
            r5 = 2
            if (r7 != r5) goto L_0x0714
            r8 = r8 | r16
            int r5 = X.SUP.A08(r1, r0, r4)
            java.lang.Object r13 = r1.A02
            goto L_0x01f4
        L_0x0118:
            r2 = 2
            if (r7 != r2) goto L_0x0714
            r16 = r16 | r8
            java.lang.Object r2 = r9.A0D(r10, r11)
            X.TiL r24 = r9.A0A(r11)
            r23 = r1
            r25 = r2
            r26 = r0
            r27 = r4
            r28 = r35
            int r5 = X.SUP.A03(r23, r24, r25, r26, r27, r28)
            r9.A0M(r10, r11, r2)
            goto L_0x024b
        L_0x0138:
            r5 = 2
            if (r7 != r5) goto L_0x0714
            r12 = r12 & r23
            int r5 = X.SUP.A09(r1, r0, r4)
            int r4 = r1.A00
            if (r12 == 0) goto L_0x01d7
            if (r4 < 0) goto L_0x0768
            r8 = r8 | r16
            if (r4 == 0) goto L_0x01e7
            X.SI4 r6 = X.C11412SSk.A00
            int r7 = r0.length
            int r9 = r7 - r5
            r6 = r5 | r4
            int r9 = r9 - r4
            r9 = r9 | r6
            if (r9 < 0) goto L_0x075d
            int r7 = r5 + r4
            char[] r6 = new char[r4]
            r4 = 0
        L_0x015b:
            if (r5 >= r7) goto L_0x016e
            byte r9 = r40[r5]
            boolean r12 = X.Pxf.A1R(r9)
            if (r12 == 0) goto L_0x016e
            int r5 = r5 + 1
            int r12 = r4 + 1
            char r9 = (char) r9
            r6[r4] = r9
            r4 = r12
            goto L_0x015b
        L_0x016e:
            if (r5 >= r7) goto L_0x01ea
            int r12 = r5 + 1
            byte r9 = r40[r5]
            boolean r5 = X.Pxf.A1R(r9)
            if (r5 == 0) goto L_0x0193
            int r13 = r4 + 1
            char r5 = (char) r9
            r6[r4] = r5
            r5 = r12
        L_0x0180:
            r4 = r13
            if (r5 >= r7) goto L_0x016e
            byte r9 = r40[r5]
            boolean r12 = X.Pxf.A1R(r9)
            if (r12 == 0) goto L_0x016e
            int r5 = r5 + 1
            int r13 = r13 + 1
            char r9 = (char) r9
            r6[r4] = r9
            goto L_0x0180
        L_0x0193:
            r5 = -32
            if (r9 >= r5) goto L_0x01a5
            if (r12 >= r7) goto L_0x076d
            int r17 = r4 + 1
            int r5 = r12 + 1
            byte r12 = r40[r12]
            X.C11397SRq.A02(r6, r9, r12, r4)
        L_0x01a2:
            r4 = r17
            goto L_0x016e
        L_0x01a5:
            r5 = -16
            if (r9 >= r5) goto L_0x01bb
            int r5 = r7 + -1
            if (r12 >= r5) goto L_0x076d
            int r17 = r4 + 1
            int r16 = r12 + 1
            byte r13 = r40[r12]
            int r5 = r16 + 1
            byte r12 = r40[r16]
            X.C11397SRq.A01(r6, r9, r13, r12, r4)
            goto L_0x01a2
        L_0x01bb:
            int r5 = r7 + -2
            if (r12 >= r5) goto L_0x076d
            int r5 = r12 + 1
            byte r25 = r40[r12]
            int r12 = r5 + 1
            byte r26 = r40[r5]
            int r5 = r12 + 1
            byte r27 = r40[r12]
            r28 = r4
            r23 = r6
            r24 = r9
            X.C11397SRq.A00(r23, r24, r25, r26, r27, r28)
            int r4 = r4 + 2
            goto L_0x016e
        L_0x01d7:
            if (r4 < 0) goto L_0x0768
            r8 = r8 | r16
            if (r4 == 0) goto L_0x01e7
            java.nio.charset.Charset r6 = X.SS6.A03
            java.lang.String r13 = X.Pxe.A11(r6, r0, r5, r4)
            r1.A02 = r13
            int r5 = r5 + r4
            goto L_0x01f4
        L_0x01e7:
            r1.A02 = r13
            goto L_0x01f4
        L_0x01ea:
            java.lang.String r13 = new java.lang.String
            r0 = r20
            r13.<init>(r6, r0, r4)
            r1.A02 = r13
            r5 = r7
        L_0x01f4:
            r14.putObject(r10, r2, r13)
            goto L_0x00b3
        L_0x01f9:
            if (r7 != 0) goto L_0x0714
            r8 = r8 | r16
            int r5 = X.SUP.A0A(r1, r0, r4)
            long r0 = r1.A01
            int r4 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1P(r4)
            X.SUg.A0K(r10, r2, r0)
            goto L_0x00b3
        L_0x020e:
            r5 = 5
            if (r7 != r5) goto L_0x0714
            int r5 = r4 + 4
            r8 = r8 | r16
            int r1 = X.SUP.A0C(r0, r4)
            goto L_0x0231
        L_0x021a:
            r5 = r17
            if (r7 != r5) goto L_0x0714
            int r5 = r4 + 8
            r16 = r16 | r8
            long r0 = X.SUP.A0D(r0, r4)
            goto L_0x0240
        L_0x0227:
            if (r7 != 0) goto L_0x0714
            r8 = r8 | r16
            int r5 = X.SUP.A09(r1, r0, r4)
            int r1 = r1.A00
        L_0x0231:
            r14.putInt(r10, r2, r1)
            goto L_0x00b3
        L_0x0236:
            if (r7 != 0) goto L_0x0714
            r16 = r16 | r8
            int r5 = X.SUP.A0A(r1, r0, r4)
            long r0 = r1.A01
        L_0x0240:
            r23 = r14
            r24 = r10
            r25 = r2
            r27 = r0
            r23.putLong(r24, r25, r27)
        L_0x024b:
            r8 = r16
            goto L_0x00b3
        L_0x024f:
            r5 = 5
            if (r7 != r5) goto L_0x0714
            int r5 = r4 + 4
            r8 = r8 | r16
            int r0 = X.SUP.A0C(r0, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            X.SUg.A0G(r10, r2, r0)
            goto L_0x00b3
        L_0x0263:
            r5 = r17
            if (r7 != r5) goto L_0x0714
            int r5 = r4 + 8
            r8 = r8 | r16
            long r0 = X.SUP.A0D(r0, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            X.SUg.A0F(r10, r2, r0)
            goto L_0x00b3
        L_0x0278:
            long r5 = (long) r6
            int r8 = r14.getInt(r10, r5)
            goto L_0x008d
        L_0x027f:
            r22 = r5
            goto L_0x008d
        L_0x0283:
            r22 = r29
            r5 = 27
            r6 = r5
            r5 = r25
            if (r5 != r6) goto L_0x02c2
            r5 = 2
            if (r7 != r5) goto L_0x0714
            java.lang.Object r5 = r14.getObject(r10, r2)
            X.Tna r5 = (X.C13984Tna) r5
            boolean r6 = r5.FPP()
            if (r6 != 0) goto L_0x02ac
            int r7 = r5.size()
            r6 = 10
            if (r7 == 0) goto L_0x02a5
            int r7 = r7 + r7
            r6 = r7
        L_0x02a5:
            X.Tna r5 = r5.FPW(r6)
            r14.putObject(r10, r2, r5)
        L_0x02ac:
            X.TiL r25 = r9.A0A(r11)
            r23 = r1
            r24 = r5
            r26 = r0
            r27 = r21
            r28 = r4
            r29 = r35
            int r5 = X.SUP.A00(r23, r24, r25, r26, r27, r28, r29)
            goto L_0x00b3
        L_0x02c2:
            r5 = 49
            r6 = r5
            r5 = r25
            if (r5 > r6) goto L_0x0593
            long r5 = (long) r12
            r16 = r5
            java.lang.Object r6 = r14.getObject(r10, r2)
            X.Tna r6 = (X.C13984Tna) r6
            boolean r5 = r6.FPP()
            if (r5 != 0) goto L_0x02e9
            int r12 = r6.size()
            r5 = 10
            if (r12 == 0) goto L_0x02e2
            int r12 = r12 + r12
            r5 = r12
        L_0x02e2:
            X.Tna r6 = r6.FPW(r5)
            r14.putObject(r10, r2, r6)
        L_0x02e9:
            switch(r25) {
                case 18: goto L_0x0577;
                case 19: goto L_0x055e;
                case 20: goto L_0x053a;
                case 21: goto L_0x053a;
                case 22: goto L_0x051d;
                case 23: goto L_0x04fa;
                case 24: goto L_0x04bc;
                case 25: goto L_0x049e;
                case 26: goto L_0x0438;
                case 27: goto L_0x02ec;
                case 28: goto L_0x0401;
                case 29: goto L_0x051d;
                case 30: goto L_0x037c;
                case 31: goto L_0x04bc;
                case 32: goto L_0x04fa;
                case 33: goto L_0x033c;
                case 34: goto L_0x0318;
                case 35: goto L_0x0577;
                case 36: goto L_0x055e;
                case 37: goto L_0x053a;
                case 38: goto L_0x053a;
                case 39: goto L_0x051d;
                case 40: goto L_0x04fa;
                case 41: goto L_0x04bc;
                case 42: goto L_0x049e;
                case 43: goto L_0x051d;
                case 44: goto L_0x037c;
                case 45: goto L_0x04bc;
                case 46: goto L_0x04fa;
                case 47: goto L_0x033c;
                case 48: goto L_0x0318;
                default: goto L_0x02ec;
            }
        L_0x02ec:
            r2 = r28
            if (r7 != r2) goto L_0x0590
            r2 = r21 & -8
            r33 = r2 | 4
            X.TiL r29 = r9.A0A(r11)
            r28 = r1
            r30 = r0
            r31 = r4
            r32 = r35
        L_0x0300:
            int r5 = X.SUP.A06(r28, r29, r30, r31, r32, r33)
            java.lang.Object r2 = r1.A02
            r6.add(r2)
            r2 = r35
            if (r5 >= r2) goto L_0x0711
            int r31 = X.SUP.A09(r1, r0, r5)
            int r3 = r1.A00
            r2 = r21
            if (r2 != r3) goto L_0x0711
            goto L_0x0300
        L_0x0318:
            r2 = 2
            if (r7 != r2) goto L_0x032f
            int r5 = X.SUP.A09(r1, r0, r4)
            int r3 = r1.A00
            int r3 = r3 + r5
            if (r5 >= r3) goto L_0x050e
            X.SUP.A0A(r1, r0, r5)
            java.lang.String r0 = "zzf"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x032f:
            if (r7 != 0) goto L_0x0590
            X.SUP.A0A(r1, r0, r4)
            java.lang.String r0 = "zzf"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x033c:
            r2 = 2
            if (r7 != r2) goto L_0x0358
            X.Qx2 r6 = (X.C8564Qx2) r6
            int r5 = X.SUP.A09(r1, r0, r4)
            int r3 = r1.A00
            int r3 = r3 + r5
        L_0x0348:
            if (r5 >= r3) goto L_0x050e
            int r5 = X.SUP.A09(r1, r0, r5)
            int r2 = r1.A00
            int r2 = X.SR6.A00(r2)
            r6.FPw(r2)
            goto L_0x0348
        L_0x0358:
            if (r7 != 0) goto L_0x0590
            X.Qx2 r6 = (X.C8564Qx2) r6
            int r5 = X.SUP.A09(r1, r0, r4)
        L_0x0360:
            int r2 = r1.A00
            int r2 = X.SR6.A00(r2)
            r6.FPw(r2)
            r2 = r35
            if (r5 >= r2) goto L_0x0711
            int r7 = X.SUP.A09(r1, r0, r5)
            int r3 = r1.A00
            r2 = r21
            if (r2 != r3) goto L_0x0711
            int r5 = X.SUP.A09(r1, r0, r7)
            goto L_0x0360
        L_0x037c:
            r2 = 2
            if (r7 != r2) goto L_0x03c3
            int r5 = X.SUP.A01(r1, r6, r0, r4)
        L_0x0383:
            X.TeG r19 = r9.A08(r11)
            X.SK0 r2 = r9.A09
            r13 = r2
            X.SK0 r2 = X.SUi.A01
            if (r19 == 0) goto L_0x0711
            boolean r2 = r6 instanceof java.util.RandomAccess
            if (r2 == 0) goto L_0x03e1
            int r18 = r6.size()
            r17 = r26
            r7 = 0
            r3 = 0
        L_0x039a:
            r2 = r18
            if (r7 >= r2) goto L_0x03d6
            int r16 = X.C51971G9r.A0I(r6, r7)
            r12 = r16
            r2 = r19
            boolean r2 = r2.FP9(r12)
            if (r2 == 0) goto L_0x03ba
            if (r7 == r3) goto L_0x03b5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r6.set(r3, r2)
        L_0x03b5:
            int r3 = r3 + 1
        L_0x03b7:
            int r7 = r7 + 1
            goto L_0x039a
        L_0x03ba:
            r12 = r17
            r2 = r16
            java.lang.Object r17 = X.SUi.A0E(r13, r10, r12, r15, r2)
            goto L_0x03b7
        L_0x03c3:
            if (r7 != 0) goto L_0x0590
            r28 = r1
            r29 = r6
            r30 = r0
            r31 = r21
            r32 = r4
            r33 = r35
            int r5 = X.SUP.A02(r28, r29, r30, r31, r32, r33)
            goto L_0x0383
        L_0x03d6:
            if (r3 == r2) goto L_0x0711
            java.util.List r2 = r6.subList(r3, r2)
            r2.clear()
            goto L_0x0711
        L_0x03e1:
            java.util.Iterator r7 = r6.iterator()
            r6 = r26
        L_0x03e7:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0711
            int r3 = X.AnonymousClass7TG.A0F(r7)
            r2 = r19
            boolean r2 = r2.FP9(r3)
            if (r2 != 0) goto L_0x03e7
            java.lang.Object r6 = X.SUi.A0E(r13, r10, r6, r15, r3)
            r7.remove()
            goto L_0x03e7
        L_0x0401:
            r2 = 2
            if (r7 != r2) goto L_0x0590
            int r5 = X.SUP.A09(r1, r0, r4)
            int r3 = r1.A00
            if (r3 < 0) goto L_0x0768
            int r7 = r0.length
        L_0x040d:
            int r2 = r7 - r5
            if (r3 > r2) goto L_0x0787
            if (r3 != 0) goto L_0x042f
            X.TAQ r2 = X.TAQ.A01
            r6.add(r2)
        L_0x0418:
            r2 = r35
            if (r5 >= r2) goto L_0x0711
            int r12 = X.SUP.A09(r1, r0, r5)
            int r3 = r1.A00
            r2 = r21
            if (r2 != r3) goto L_0x0711
            int r5 = X.SUP.A09(r1, r0, r12)
            int r3 = r1.A00
            if (r3 < 0) goto L_0x0768
            goto L_0x040d
        L_0x042f:
            X.Qx7 r2 = X.TAQ.A01(r0, r5, r3)
            r6.add(r2)
            int r5 = r5 + r3
            goto L_0x0418
        L_0x0438:
            r2 = 2
            if (r7 != r2) goto L_0x0590
            r2 = 536870912(0x20000000, double:2.652494739E-315)
            long r16 = r16 & r2
            int r2 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            int r5 = X.SUP.A09(r1, r0, r4)
            if (r2 != 0) goto L_0x046f
        L_0x0448:
            int r3 = r1.A00
            if (r3 < 0) goto L_0x0768
            if (r3 != 0) goto L_0x0464
            r6.add(r13)
        L_0x0451:
            r2 = r35
            if (r5 >= r2) goto L_0x0711
            int r7 = X.SUP.A09(r1, r0, r5)
            int r3 = r1.A00
            r2 = r21
            if (r2 != r3) goto L_0x0711
            int r5 = X.SUP.A09(r1, r0, r7)
            goto L_0x0448
        L_0x0464:
            java.nio.charset.Charset r2 = X.SS6.A03
            java.lang.String r2 = X.Pxe.A11(r2, r0, r5, r3)
            r6.add(r2)
            int r5 = r5 + r3
            goto L_0x0451
        L_0x046f:
            int r7 = r1.A00
            if (r7 < 0) goto L_0x0768
            if (r7 != 0) goto L_0x048b
            r6.add(r13)
        L_0x0478:
            r2 = r35
            if (r5 >= r2) goto L_0x0711
            int r7 = X.SUP.A09(r1, r0, r5)
            int r3 = r1.A00
            r2 = r21
            if (r2 != r3) goto L_0x0711
            int r5 = X.SUP.A09(r1, r0, r7)
            goto L_0x046f
        L_0x048b:
            int r3 = r5 + r7
            boolean r2 = X.C11412SSk.A04(r0, r5, r3)
            if (r2 == 0) goto L_0x076d
            java.nio.charset.Charset r2 = X.SS6.A03
            java.lang.String r2 = X.Pxe.A11(r2, r0, r5, r7)
            r6.add(r2)
            r5 = r3
            goto L_0x0478
        L_0x049e:
            r2 = 2
            if (r7 != r2) goto L_0x04b2
            int r5 = X.SUP.A09(r1, r0, r4)
            int r3 = r1.A00
            int r3 = r3 + r5
            if (r5 >= r3) goto L_0x050e
            X.SUP.A0A(r1, r0, r5)
            java.lang.NullPointerException r0 = X.Pxh.A0c()
            throw r0
        L_0x04b2:
            if (r7 != 0) goto L_0x0590
            X.SUP.A0A(r1, r0, r4)
            java.lang.NullPointerException r0 = X.Pxh.A0c()
            throw r0
        L_0x04bc:
            r2 = 2
            if (r7 != r2) goto L_0x04d4
            X.Qx2 r6 = (X.C8564Qx2) r6
            int r5 = X.SUP.A09(r1, r0, r4)
            int r3 = r1.A00
            int r3 = r3 + r5
        L_0x04c8:
            if (r5 >= r3) goto L_0x050e
            int r2 = X.SUP.A0C(r0, r5)
            r6.FPw(r2)
            int r5 = r5 + 4
            goto L_0x04c8
        L_0x04d4:
            r2 = 5
            if (r7 != r2) goto L_0x0590
            int r5 = r4 + 4
            X.Qx2 r6 = (X.C8564Qx2) r6
            int r2 = X.SUP.A0C(r0, r4)
            r6.FPw(r2)
        L_0x04e2:
            r2 = r35
            if (r5 >= r2) goto L_0x0711
            int r7 = X.SUP.A09(r1, r0, r5)
            int r3 = r1.A00
            r2 = r21
            if (r2 != r3) goto L_0x0711
            int r2 = X.SUP.A0C(r0, r7)
            r6.FPw(r2)
            int r5 = r7 + 4
            goto L_0x04e2
        L_0x04fa:
            r2 = 2
            if (r7 != r2) goto L_0x0512
            int r5 = X.SUP.A09(r1, r0, r4)
            int r3 = r1.A00
            int r3 = r3 + r5
            if (r5 >= r3) goto L_0x050e
            java.lang.String r0 = "zzf"
            java.lang.NullPointerException r26 = X.AnonymousClass7TE.A11(r0)
            throw r26
        L_0x050e:
            if (r5 != r3) goto L_0x0787
            goto L_0x0711
        L_0x0512:
            r2 = 1
            if (r7 != r2) goto L_0x0590
            java.lang.String r0 = "zzf"
            java.lang.NullPointerException r26 = X.AnonymousClass7TE.A11(r0)
            throw r26
        L_0x051d:
            r2 = 2
            if (r7 != r2) goto L_0x0526
            int r5 = X.SUP.A01(r1, r6, r0, r4)
            goto L_0x0711
        L_0x0526:
            if (r7 != 0) goto L_0x0590
            r28 = r1
            r29 = r6
            r30 = r0
            r31 = r21
            r32 = r4
            r33 = r35
            int r5 = X.SUP.A02(r28, r29, r30, r31, r32, r33)
            goto L_0x0711
        L_0x053a:
            r2 = 2
            if (r7 != r2) goto L_0x0551
            int r5 = X.SUP.A09(r1, r0, r4)
            int r2 = r1.A00
            int r2 = r2 + r5
            if (r5 >= r2) goto L_0x070f
            X.SUP.A0A(r1, r0, r5)
            java.lang.String r0 = "zzf"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0551:
            if (r7 != 0) goto L_0x0590
            X.SUP.A0A(r1, r0, r4)
            java.lang.String r0 = "zzf"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x055e:
            r2 = 2
            if (r7 != r2) goto L_0x056f
            int r5 = X.SUP.A09(r1, r0, r4)
            int r2 = r1.A00
            int r2 = r2 + r5
            if (r5 >= r2) goto L_0x070f
            java.lang.NullPointerException r26 = X.Pxh.A0c()
            throw r26
        L_0x056f:
            r2 = 5
            if (r7 != r2) goto L_0x0590
            java.lang.NullPointerException r26 = X.Pxh.A0c()
            throw r26
        L_0x0577:
            r2 = 2
            if (r7 != r2) goto L_0x0588
            int r5 = X.SUP.A09(r1, r0, r4)
            int r2 = r1.A00
            int r2 = r2 + r5
            if (r5 >= r2) goto L_0x070f
            java.lang.NullPointerException r26 = X.Pxh.A0c()
            throw r26
        L_0x0588:
            r2 = 1
            if (r7 != r2) goto L_0x0590
            java.lang.NullPointerException r26 = X.Pxh.A0c()
            throw r26
        L_0x0590:
            r5 = r4
            goto L_0x0711
        L_0x0593:
            r5 = 50
            r6 = r5
            r5 = r25
            if (r5 != r6) goto L_0x05a5
            r5 = 2
            if (r7 != r5) goto L_0x0714
            r14.getObject(r10, r2)
            java.lang.NullPointerException r0 = X.Pxh.A0c()
            throw r0
        L_0x05a5:
            int r5 = r11 + 2
            r5 = r16[r5]
            r5 = r5 & r24
            long r5 = (long) r5
            r16 = r5
            switch(r25) {
                case 51: goto L_0x06de;
                case 52: goto L_0x06cc;
                case 53: goto L_0x06bf;
                case 54: goto L_0x06bf;
                case 55: goto L_0x06b2;
                case 56: goto L_0x06a4;
                case 57: goto L_0x0696;
                case 58: goto L_0x0683;
                case 59: goto L_0x0657;
                case 60: goto L_0x063b;
                case 61: goto L_0x0628;
                case 62: goto L_0x06b2;
                case 63: goto L_0x05f9;
                case 64: goto L_0x0696;
                case 65: goto L_0x06a4;
                case 66: goto L_0x05e8;
                case 67: goto L_0x05d7;
                case 68: goto L_0x05b7;
                default: goto L_0x05b1;
            }
        L_0x05b1:
            r5 = r4
        L_0x05b2:
            if (r5 == r4) goto L_0x06f9
            r3 = r15
            goto L_0x0013
        L_0x05b7:
            r2 = r28
            if (r7 != r2) goto L_0x05b1
            r2 = r21 & -8
            r36 = r2 | 4
            java.lang.Object r2 = r9.A0C(r15, r11, r10)
            X.TiL r31 = r9.A0A(r11)
            r30 = r1
            r32 = r2
            r33 = r0
            r34 = r4
            int r5 = X.SUP.A04(r30, r31, r32, r33, r34, r35, r36)
            r9.A0F(r15, r11, r10, r2)
            goto L_0x05b2
        L_0x05d7:
            if (r7 != 0) goto L_0x05b1
            int r5 = X.SUP.A0A(r1, r0, r4)
            long r6 = r1.A01
            long r6 = X.SR6.A01(r6)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            goto L_0x061f
        L_0x05e8:
            if (r7 != 0) goto L_0x05b1
            int r5 = X.SUP.A09(r1, r0, r4)
            int r6 = r1.A00
            int r6 = X.SR6.A00(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x0631
        L_0x05f9:
            if (r7 != 0) goto L_0x05b1
            int r5 = X.SUP.A09(r1, r0, r4)
            int r7 = r1.A00
            X.TeG r6 = r9.A08(r11)
            if (r6 == 0) goto L_0x061b
            boolean r6 = r6.FP9(r7)
            if (r6 != 0) goto L_0x061b
            X.STV r6 = A0B(r10)
            java.lang.Long r3 = X.DbS.A0j(r7)
            r2 = r21
            r6.A08(r2, r3)
            goto L_0x05b2
        L_0x061b:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
        L_0x061f:
            r14.putObject(r10, r2, r6)
            r2 = r16
            r14.putInt(r10, r2, r15)
            goto L_0x05b2
        L_0x0628:
            r5 = 2
            if (r7 != r5) goto L_0x05b1
            int r5 = X.SUP.A08(r1, r0, r4)
            java.lang.Object r6 = r1.A02
        L_0x0631:
            r14.putObject(r10, r2, r6)
            r2 = r16
            r14.putInt(r10, r2, r15)
            goto L_0x05b2
        L_0x063b:
            r2 = 2
            if (r7 != r2) goto L_0x05b1
            java.lang.Object r2 = r9.A0C(r15, r11, r10)
            X.TiL r31 = r9.A0A(r11)
            r30 = r1
            r32 = r2
            r33 = r0
            r34 = r4
            int r5 = X.SUP.A03(r30, r31, r32, r33, r34, r35)
            r9.A0F(r15, r11, r10, r2)
            goto L_0x05b2
        L_0x0657:
            r5 = 2
            if (r7 != r5) goto L_0x05b1
            int r5 = X.SUP.A09(r1, r0, r4)
            int r7 = r1.A00
            if (r7 != 0) goto L_0x066c
            r14.putObject(r10, r2, r13)
        L_0x0665:
            r2 = r16
            r14.putInt(r10, r2, r15)
            goto L_0x05b2
        L_0x066c:
            r12 = r12 & r23
            int r6 = r5 + r7
            if (r12 == 0) goto L_0x0678
            boolean r12 = X.C11412SSk.A04(r0, r5, r6)
            if (r12 == 0) goto L_0x076d
        L_0x0678:
            java.nio.charset.Charset r12 = X.SS6.A03
            java.lang.String r5 = X.Pxe.A11(r12, r0, r5, r7)
            r14.putObject(r10, r2, r5)
            r5 = r6
            goto L_0x0665
        L_0x0683:
            if (r7 != 0) goto L_0x05b1
            int r5 = X.SUP.A0A(r1, r0, r4)
            long r6 = r1.A01
            int r12 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            boolean r6 = X.AnonymousClass7TF.A1P(r12)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto L_0x06ef
        L_0x0696:
            r5 = 5
            if (r7 != r5) goto L_0x05b1
            int r5 = r4 + 4
            int r6 = X.SUP.A0C(r0, r4)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x06ef
        L_0x06a4:
            r5 = 1
            if (r7 != r5) goto L_0x05b1
            int r5 = r4 + 8
            long r6 = X.SUP.A0D(r0, r4)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            goto L_0x06ef
        L_0x06b2:
            if (r7 != 0) goto L_0x05b1
            int r5 = X.SUP.A09(r1, r0, r4)
            int r6 = r1.A00
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x06ef
        L_0x06bf:
            if (r7 != 0) goto L_0x05b1
            int r5 = X.SUP.A0A(r1, r0, r4)
            long r6 = r1.A01
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            goto L_0x06ef
        L_0x06cc:
            r5 = 5
            if (r7 != r5) goto L_0x05b1
            int r5 = r4 + 4
            int r6 = X.SUP.A0C(r0, r4)
            float r6 = java.lang.Float.intBitsToFloat(r6)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            goto L_0x06ef
        L_0x06de:
            r5 = 1
            if (r7 != r5) goto L_0x05b1
            int r5 = r4 + 8
            long r6 = X.SUP.A0D(r0, r4)
            double r6 = java.lang.Double.longBitsToDouble(r6)
            java.lang.Double r6 = java.lang.Double.valueOf(r6)
        L_0x06ef:
            r14.putObject(r10, r2, r6)
            r2 = r16
            r14.putInt(r10, r2, r15)
            goto L_0x05b2
        L_0x06f9:
            r4 = r5
            goto L_0x0714
        L_0x06fb:
            int r2 = r9.A00
            if (r15 < r2) goto L_0x070b
            int r2 = r9.A01
            if (r15 > r2) goto L_0x070b
            r2 = r20
            int r11 = r9.A05(r15, r2)
            goto L_0x0047
        L_0x070b:
            r22 = r29
            r11 = 0
            goto L_0x0714
        L_0x070f:
            if (r5 != r2) goto L_0x0787
        L_0x0711:
            if (r5 != r4) goto L_0x00b3
            r4 = r5
        L_0x0714:
            r3 = r27
            r2 = r21
            if (r2 != r3) goto L_0x0749
            if (r43 == 0) goto L_0x0749
            r5 = r4
            r29 = r22
        L_0x071f:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r29
            if (r0 == r2) goto L_0x072a
            long r0 = (long) r0
            r14.putInt(r10, r0, r8)
        L_0x072a:
            int r4 = r9.A02
        L_0x072c:
            int r0 = r9.A03
            if (r4 >= r0) goto L_0x0772
            int[] r0 = r9.A0B
            r3 = r0[r4]
            int r0 = r9.A04(r3)
            r0 = r0 & r2
            long r0 = (long) r0
            java.lang.Object r0 = X.SUg.A06(r10, r0)
            if (r0 == 0) goto L_0x0746
            X.TeG r0 = r9.A08(r3)
            if (r0 != 0) goto L_0x0786
        L_0x0746:
            int r4 = r4 + 1
            goto L_0x072c
        L_0x0749:
            X.STV r24 = A0B(r10)
            r23 = r1
            r25 = r0
            r26 = r2
            r27 = r4
            r28 = r35
            int r5 = X.SUP.A07(r23, r24, r25, r26, r27, r28)
            goto L_0x00b3
        L_0x075d:
            java.lang.Object[] r1 = X.Pxh.A1a(r7, r5, r4)
            java.lang.String r0 = "buffer length=%d, index=%d, size=%d"
            java.lang.ArrayIndexOutOfBoundsException r0 = X.Pxf.A0V(r0, r1)
            throw r0
        L_0x0768:
            X.RCi r26 = X.C8842RCi.A03()
            throw r26
        L_0x076d:
            X.RCi r26 = X.C8842RCi.A02()
            throw r26
        L_0x0772:
            r0 = r35
            if (r43 != 0) goto L_0x0779
            if (r5 != r0) goto L_0x0782
            return r5
        L_0x0779:
            if (r5 > r0) goto L_0x0782
            r1 = r27
            r0 = r21
            if (r0 != r1) goto L_0x0782
            return r5
        L_0x0782:
            X.RCi r26 = X.C8842RCi.A04()
        L_0x0786:
            throw r26
        L_0x0787:
            X.RCi r26 = X.C8842RCi.A05()
            throw r26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12589Syo.A0U(X.SFE, java.lang.Object, byte[], int, int, int):int");
    }
}

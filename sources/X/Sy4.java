package X;

import com.instagram.react.modules.base.IgReactQEModule;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

public final class Sy4 implements C13829Ti0 {
    public static final Unsafe A0D = SUX.A03();
    public static final int[] A0E = new int[0];
    public final int[] A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final C9700RfJ A05;
    public final C10080RmI A06;
    public final C9701RfK A07;
    public final C13475Tb2 A08;
    public final C9702RfL A09;
    public final C9704RfN A0A;
    public final int[] A0B;
    public final Object[] A0C;

    public Sy4(C9700RfJ rfJ, C10080RmI rmI, C9701RfK rfK, C13475Tb2 tb2, C9702RfL rfL, C9704RfN rfN, int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, int i3, int i4) {
        this.A00 = iArr;
        this.A0C = objArr;
        this.A01 = i;
        this.A02 = i2;
        this.A0B = iArr2;
        this.A03 = i3;
        this.A04 = i4;
        this.A09 = rfL;
        this.A06 = rmI;
        this.A0A = rfN;
        this.A05 = rfJ;
        this.A08 = tb2;
        this.A07 = rfK;
    }

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
            throw AnonymousClass7TE.A15(002.A13("Field ", str2, " for ", cls.getName(), " not found. Known fields are ", Arrays.toString(declaredFields)));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        r5 = r4 * 53;
        r4 = X.SUX.A02(r8, r1).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0070, code lost:
        r5 = r4 * 53;
        r4 = ((java.lang.String) X.SUX.A02(r8, r1)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a3, code lost:
        r5 = r4 * 53;
        r4 = X.AnonymousClass7TE.A0M(X.SUX.A02(r8, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bb, code lost:
        r4 = r4 * 53;
        r1 = X.AnonymousClass7TE.A0R(X.SUX.A02(r8, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0103, code lost:
        r0 = X.C10132Rn9.A02;
        r4 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0107, code lost:
        if (r1 == false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0109, code lost:
        r4 = 1231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012b, code lost:
        r4 = r4 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0136, code lost:
        r1 = java.lang.Double.doubleToLongBits(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x013a, code lost:
        r0 = X.C10132Rn9.A02;
        r4 = X.Pxh.A06(r1, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int FOw(java.lang.Object r8) {
        /*
            r7 = this;
            r3 = 0
            r4 = 0
        L_0x0002:
            int[] r2 = r7.A00
            int r0 = r2.length
            if (r3 >= r0) goto L_0x0142
            int r0 = r3 + 1
            r0 = r2[r0]
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            int r0 = r0 >>> 20
            r6 = r0 & 255(0xff, float:3.57E-43)
            r0 = r2[r3]
            long r1 = (long) r1
            r5 = 37
            switch(r6) {
                case 0: goto L_0x012e;
                case 1: goto L_0x011f;
                case 2: goto L_0x0118;
                case 3: goto L_0x0118;
                case 4: goto L_0x0111;
                case 5: goto L_0x0118;
                case 6: goto L_0x0111;
                case 7: goto L_0x00f9;
                case 8: goto L_0x0070;
                case 9: goto L_0x00ec;
                case 10: goto L_0x005e;
                case 11: goto L_0x0111;
                case 12: goto L_0x0111;
                case 13: goto L_0x0111;
                case 14: goto L_0x0118;
                case 15: goto L_0x0111;
                case 16: goto L_0x0118;
                case 17: goto L_0x00ec;
                case 18: goto L_0x005e;
                case 19: goto L_0x005e;
                case 20: goto L_0x005e;
                case 21: goto L_0x005e;
                case 22: goto L_0x005e;
                case 23: goto L_0x005e;
                case 24: goto L_0x005e;
                case 25: goto L_0x005e;
                case 26: goto L_0x005e;
                case 27: goto L_0x005e;
                case 28: goto L_0x005e;
                case 29: goto L_0x005e;
                case 30: goto L_0x005e;
                case 31: goto L_0x005e;
                case 32: goto L_0x005e;
                case 33: goto L_0x005e;
                case 34: goto L_0x005e;
                case 35: goto L_0x005e;
                case 36: goto L_0x005e;
                case 37: goto L_0x005e;
                case 38: goto L_0x005e;
                case 39: goto L_0x005e;
                case 40: goto L_0x005e;
                case 41: goto L_0x005e;
                case 42: goto L_0x005e;
                case 43: goto L_0x005e;
                case 44: goto L_0x005e;
                case 45: goto L_0x005e;
                case 46: goto L_0x005e;
                case 47: goto L_0x005e;
                case 48: goto L_0x005e;
                case 49: goto L_0x005e;
                case 50: goto L_0x005e;
                case 51: goto L_0x00db;
                case 52: goto L_0x00c6;
                case 53: goto L_0x00b5;
                case 54: goto L_0x00ae;
                case 55: goto L_0x009d;
                case 56: goto L_0x0096;
                case 57: goto L_0x008f;
                case 58: goto L_0x007e;
                case 59: goto L_0x006a;
                case 60: goto L_0x0058;
                case 61: goto L_0x0051;
                case 62: goto L_0x004a;
                case 63: goto L_0x0043;
                case 64: goto L_0x003c;
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
            boolean r0 = r7.A08(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x005e
        L_0x0025:
            boolean r0 = r7.A08(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00bb
        L_0x002d:
            boolean r0 = r7.A08(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00a3
        L_0x0034:
            boolean r0 = r7.A08(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00bb
        L_0x003c:
            boolean r0 = r7.A08(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00a3
        L_0x0043:
            boolean r0 = r7.A08(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00a3
        L_0x004a:
            boolean r0 = r7.A08(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00a3
        L_0x0051:
            boolean r0 = r7.A08(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x005e
        L_0x0058:
            boolean r0 = r7.A08(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
        L_0x005e:
            int r5 = r4 * 53
            java.lang.Object r0 = X.SUX.A02(r8, r1)
            int r4 = r0.hashCode()
            goto L_0x012b
        L_0x006a:
            boolean r0 = r7.A08(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
        L_0x0070:
            int r5 = r4 * 53
            java.lang.Object r0 = X.SUX.A02(r8, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r4 = r0.hashCode()
            goto L_0x012b
        L_0x007e:
            boolean r0 = r7.A08(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
            int r5 = r4 * 53
            java.lang.Object r0 = X.SUX.A02(r8, r1)
            boolean r1 = X.AnonymousClass7TE.A1a(r0)
            goto L_0x0103
        L_0x008f:
            boolean r0 = r7.A08(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00a3
        L_0x0096:
            boolean r0 = r7.A08(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00bb
        L_0x009d:
            boolean r0 = r7.A08(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
        L_0x00a3:
            int r5 = r4 * 53
            java.lang.Object r0 = X.SUX.A02(r8, r1)
            int r4 = X.AnonymousClass7TE.A0M(r0)
            goto L_0x012b
        L_0x00ae:
            boolean r0 = r7.A08(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00bb
        L_0x00b5:
            boolean r0 = r7.A08(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
        L_0x00bb:
            int r4 = r4 * 53
            java.lang.Object r0 = X.SUX.A02(r8, r1)
            long r1 = X.AnonymousClass7TE.A0R(r0)
            goto L_0x013a
        L_0x00c6:
            boolean r0 = r7.A08(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
            int r5 = r4 * 53
            java.lang.Object r0 = X.SUX.A02(r8, r1)
            float r0 = X.AnonymousClass7TE.A04(r0)
            int r4 = java.lang.Float.floatToIntBits(r0)
            goto L_0x012b
        L_0x00db:
            boolean r0 = r7.A08(r8, r0, r3)
            if (r0 == 0) goto L_0x001b
            int r4 = r4 * 53
            java.lang.Object r0 = X.SUX.A02(r8, r1)
            double r0 = X.JTO.A00(r0)
            goto L_0x0136
        L_0x00ec:
            int r4 = r4 * 53
            java.lang.Object r0 = X.SUX.A02(r8, r1)
            if (r0 == 0) goto L_0x012b
            int r5 = r0.hashCode()
            goto L_0x012b
        L_0x00f9:
            int r5 = r4 * 53
            boolean r0 = X.SUX.A01
            if (r0 == 0) goto L_0x010c
            boolean r1 = X.AnonymousClass7TF.A1P(X.Pxj.A00(X.SUX.A00.A00.getInt(r8, -4 & r1), r1 ^ -1))
        L_0x0103:
            java.nio.charset.Charset r0 = X.C10132Rn9.A02
            r4 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x012b
            r4 = 1231(0x4cf, float:1.725E-42)
            goto L_0x012b
        L_0x010c:
            boolean r1 = X.AnonymousClass7TF.A1P(X.Pxj.A00(X.SUX.A00.A00.getInt(r8, -4 & r1), r1))
            goto L_0x0103
        L_0x0111:
            int r5 = r4 * 53
            int r4 = X.SUX.A00(r8, r1)
            goto L_0x012b
        L_0x0118:
            int r4 = r4 * 53
            long r1 = X.SUX.A01(r8, r1)
            goto L_0x013a
        L_0x011f:
            int r5 = r4 * 53
            X.S6m r0 = X.SUX.A00
            float r0 = r0.A01(r8, r1)
            int r4 = java.lang.Float.floatToIntBits(r0)
        L_0x012b:
            int r4 = r4 + r5
            goto L_0x001b
        L_0x012e:
            int r4 = r4 * 53
            X.S6m r0 = X.SUX.A00
            double r0 = r0.A00(r8, r1)
        L_0x0136:
            long r1 = java.lang.Double.doubleToLongBits(r0)
        L_0x013a:
            java.nio.charset.Charset r0 = X.C10132Rn9.A02
            int r4 = X.Pxh.A06(r1, r4)
            goto L_0x001b
        L_0x0142:
            int r1 = r4 * 53
            X.QuF r8 = (X.C8424QuF) r8
            X.SRM r0 = r8.zzc
            int r0 = X.AnonymousClass7TE.A0N(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Sy4.FOw(java.lang.Object):int");
    }

    public final void FPs(SFD sfd, Object obj, byte[] bArr, int i, int i2) {
        A09(sfd, obj, bArr, i, i2, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008a, code lost:
        if (r2 != r0) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ab, code lost:
        if (r6 != r1) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bd, code lost:
        if (r5 != r2) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean FPy(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            r8 = 0
            r4 = 0
        L_0x0002:
            int[] r5 = r9.A00
            int r0 = r5.length
            if (r4 >= r0) goto L_0x00d5
            int r0 = r4 + 1
            r0 = r5[r0]
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r0 & r3
            int r0 = r0 >>> 20
            r2 = r0 & 255(0xff, float:3.57E-43)
            long r0 = (long) r1
            switch(r2) {
                case 0: goto L_0x008d;
                case 1: goto L_0x006e;
                case 2: goto L_0x005b;
                case 3: goto L_0x005b;
                case 4: goto L_0x0048;
                case 5: goto L_0x005b;
                case 6: goto L_0x0048;
                case 7: goto L_0x0025;
                case 8: goto L_0x001b;
                case 9: goto L_0x001b;
                case 10: goto L_0x001b;
                case 11: goto L_0x0048;
                case 12: goto L_0x0048;
                case 13: goto L_0x0048;
                case 14: goto L_0x005b;
                case 15: goto L_0x0048;
                case 16: goto L_0x005b;
                case 17: goto L_0x001b;
                case 18: goto L_0x00bf;
                case 19: goto L_0x00bf;
                case 20: goto L_0x00bf;
                case 21: goto L_0x00bf;
                case 22: goto L_0x00bf;
                case 23: goto L_0x00bf;
                case 24: goto L_0x00bf;
                case 25: goto L_0x00bf;
                case 26: goto L_0x00bf;
                case 27: goto L_0x00bf;
                case 28: goto L_0x00bf;
                case 29: goto L_0x00bf;
                case 30: goto L_0x00bf;
                case 31: goto L_0x00bf;
                case 32: goto L_0x00bf;
                case 33: goto L_0x00bf;
                case 34: goto L_0x00bf;
                case 35: goto L_0x00bf;
                case 36: goto L_0x00bf;
                case 37: goto L_0x00bf;
                case 38: goto L_0x00bf;
                case 39: goto L_0x00bf;
                case 40: goto L_0x00bf;
                case 41: goto L_0x00bf;
                case 42: goto L_0x00bf;
                case 43: goto L_0x00bf;
                case 44: goto L_0x00bf;
                case 45: goto L_0x00bf;
                case 46: goto L_0x00bf;
                case 47: goto L_0x00bf;
                case 48: goto L_0x00bf;
                case 49: goto L_0x00bf;
                case 50: goto L_0x00bf;
                case 51: goto L_0x00af;
                case 52: goto L_0x00af;
                case 53: goto L_0x00af;
                case 54: goto L_0x00af;
                case 55: goto L_0x00af;
                case 56: goto L_0x00af;
                case 57: goto L_0x00af;
                case 58: goto L_0x00af;
                case 59: goto L_0x00af;
                case 60: goto L_0x00af;
                case 61: goto L_0x00af;
                case 62: goto L_0x00af;
                case 63: goto L_0x00af;
                case 64: goto L_0x00af;
                case 65: goto L_0x00af;
                case 66: goto L_0x00af;
                case 67: goto L_0x00af;
                case 68: goto L_0x00af;
                default: goto L_0x0018;
            }
        L_0x0018:
            int r4 = r4 + 3
            goto L_0x0002
        L_0x001b:
            boolean r5 = r9.A06(r4, r10)
            boolean r2 = r9.A06(r4, r11)
            goto L_0x00bd
        L_0x0025:
            boolean r3 = r9.A06(r4, r10)
            boolean r2 = r9.A06(r4, r11)
            if (r3 != r2) goto L_0x00e4
            boolean r3 = X.SUX.A01
            if (r3 == 0) goto L_0x003e
            boolean r2 = X.AnonymousClass7TF.A1P(X.Pxj.A00(X.SUX.A00.A00.getInt(r10, -4 & r0), r0 ^ -1))
        L_0x0037:
            if (r3 == 0) goto L_0x0043
            boolean r0 = X.AnonymousClass7TF.A1P(X.Pxj.A00(X.SUX.A00.A00.getInt(r11, -4 & r0), r0 ^ -1))
            goto L_0x008a
        L_0x003e:
            boolean r2 = X.AnonymousClass7TF.A1P(X.Pxj.A00(X.SUX.A00.A00.getInt(r10, -4 & r0), r0))
            goto L_0x0037
        L_0x0043:
            boolean r0 = X.AnonymousClass7TF.A1P(X.Pxj.A00(X.SUX.A00.A00.getInt(r11, -4 & r0), r0))
            goto L_0x008a
        L_0x0048:
            boolean r3 = r9.A06(r4, r10)
            boolean r2 = r9.A06(r4, r11)
            if (r3 != r2) goto L_0x00e4
            int r2 = X.SUX.A00(r10, r0)
            int r0 = X.SUX.A00(r11, r0)
            goto L_0x008a
        L_0x005b:
            boolean r3 = r9.A06(r4, r10)
            boolean r2 = r9.A06(r4, r11)
            if (r3 != r2) goto L_0x00e4
            long r6 = X.SUX.A01(r10, r0)
            long r1 = X.SUX.A01(r11, r0)
            goto L_0x00a9
        L_0x006e:
            boolean r3 = r9.A06(r4, r10)
            boolean r2 = r9.A06(r4, r11)
            if (r3 != r2) goto L_0x00e4
            X.S6m r3 = X.SUX.A00
            float r2 = r3.A01(r10, r0)
            int r2 = java.lang.Float.floatToIntBits(r2)
            float r0 = r3.A01(r11, r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
        L_0x008a:
            if (r2 != r0) goto L_0x00e4
            goto L_0x0018
        L_0x008d:
            boolean r3 = r9.A06(r4, r10)
            boolean r2 = r9.A06(r4, r11)
            if (r3 != r2) goto L_0x00e4
            X.S6m r5 = X.SUX.A00
            double r2 = r5.A00(r10, r0)
            long r6 = java.lang.Double.doubleToLongBits(r2)
            double r0 = r5.A00(r11, r0)
            long r1 = java.lang.Double.doubleToLongBits(r0)
        L_0x00a9:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00e4
            goto L_0x0018
        L_0x00af:
            int r2 = r4 + 2
            r2 = r5[r2]
            r2 = r2 & r3
            long r2 = (long) r2
            int r5 = X.SUX.A00(r10, r2)
            int r2 = X.SUX.A00(r11, r2)
        L_0x00bd:
            if (r5 != r2) goto L_0x00e4
        L_0x00bf:
            java.lang.Object r2 = X.SUX.A02(r10, r0)
            java.lang.Object r1 = X.SUX.A02(r11, r0)
            X.RfN r0 = X.C11162SCw.A01
            if (r2 == r1) goto L_0x0018
            if (r2 == 0) goto L_0x00e4
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x00e4
            goto L_0x0018
        L_0x00d5:
            X.QuF r10 = (X.C8424QuF) r10
            X.SRM r1 = r10.zzc
            X.QuF r11 = (X.C8424QuF) r11
            X.SRM r0 = r11.zzc
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e4
            r8 = 1
        L_0x00e4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Sy4.FPy(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01d0, code lost:
        if (r15 == 0) goto L_0x01e4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.Sy4 A00(X.C9700RfJ r40, X.C10080RmI r41, X.C9701RfK r42, X.C13474Tb1 r43, X.C9702RfL r44, X.C9704RfN r45) {
        /*
            r31 = r43
            r0 = r31
            boolean r0 = r0 instanceof X.C12573Sxy
            if (r0 == 0) goto L_0x037b
            r0 = r31
            X.Sxy r0 = (X.C12573Sxy) r0
            r31 = r0
            java.lang.String r8 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a"
            int r30 = r8.length()
            char r0 = X.Pxe.A00(r8)
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r0 < r7) goto L_0x0028
            r0 = 1
        L_0x001e:
            int r1 = r0 + 1
            char r0 = r8.charAt(r0)
            if (r0 < r7) goto L_0x0029
            r0 = r1
            goto L_0x001e
        L_0x0028:
            r1 = 1
        L_0x0029:
            int r10 = r1 + 1
            char r3 = r8.charAt(r1)
            if (r3 < r7) goto L_0x0048
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0035:
            int r1 = r10 + 1
            char r0 = r8.charAt(r10)
            if (r0 < r7) goto L_0x0045
            int r3 = X.Pxe.A04(r0, r2, r3)
            int r2 = r2 + 13
            r10 = r1
            goto L_0x0035
        L_0x0045:
            int r0 = r0 << r2
            r3 = r3 | r0
            r10 = r1
        L_0x0048:
            if (r3 != 0) goto L_0x025a
            int[] r29 = A0E
            r3 = 0
            r1 = 0
            r4 = 0
            r12 = 0
            r11 = 0
            r16 = 0
            r2 = 0
        L_0x0054:
            sun.misc.Unsafe r28 = A0D
            r0 = r31
            java.lang.Object[] r6 = r0.A02
            X.Tb2 r0 = r0.A01
            r34 = r0
            java.lang.Class r27 = r34.getClass()
            int r43 = r2 + r4
            int r4 = r1 + r1
            int r0 = r1 * 3
            int[] r0 = new int[r0]
            r26 = r0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r25 = r0
            r24 = r2
            r23 = r43
            r22 = 0
            r21 = 0
        L_0x0078:
            r0 = r30
            if (r10 >= r0) goto L_0x035f
            int r4 = r10 + 1
            char r9 = r8.charAt(r10)
            r0 = r4
            if (r9 < r7) goto L_0x009b
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r1 = 13
        L_0x0089:
            int r4 = r4 + 1
            char r0 = r8.charAt(r0)
            if (r0 < r7) goto L_0x0099
            int r9 = X.Pxe.A04(r0, r1, r9)
            int r1 = r1 + 13
            r0 = r4
            goto L_0x0089
        L_0x0099:
            int r0 = r0 << r1
            r9 = r9 | r0
        L_0x009b:
            int r13 = r4 + 1
            char r5 = r8.charAt(r4)
            if (r5 < r7) goto L_0x00ba
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r0 = r13
            r1 = 13
        L_0x00a8:
            int r13 = r13 + 1
            char r0 = r8.charAt(r0)
            if (r0 < r7) goto L_0x00b8
            int r5 = X.Pxe.A04(r0, r1, r5)
            int r1 = r1 + 13
            r0 = r13
            goto L_0x00a8
        L_0x00b8:
            int r0 = r0 << r1
            r5 = r5 | r0
        L_0x00ba:
            r0 = r5 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x00c4
            int r0 = r21 + 1
            r29[r21] = r22
            r21 = r0
        L_0x00c4:
            r4 = r5 & 255(0xff, float:3.57E-43)
            r15 = r5 & 2048(0x800, float:2.87E-42)
            r0 = 51
            if (r4 < r0) goto L_0x0151
            int r10 = r13 + 1
            char r14 = r8.charAt(r13)
            if (r14 < r7) goto L_0x00ea
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r1 = 13
        L_0x00d8:
            r0 = r10
            int r10 = r10 + 1
            char r0 = r8.charAt(r0)
            if (r0 < r7) goto L_0x00e8
            int r14 = X.Pxe.A04(r0, r1, r14)
            int r1 = r1 + 13
            goto L_0x00d8
        L_0x00e8:
            int r0 = r0 << r1
            r14 = r14 | r0
        L_0x00ea:
            int r1 = r4 + -51
            r0 = 9
            if (r1 == r0) goto L_0x0143
            r0 = 17
            if (r1 == r0) goto L_0x0143
            r0 = 12
            if (r1 != r0) goto L_0x0103
            r0 = r31
            int r0 = r0.A00
            r0 = r0 & 1
            if (r0 != 0) goto L_0x0143
            if (r15 != 0) goto L_0x0143
            r15 = 0
        L_0x0103:
            int r14 = r14 + r14
            r1 = r6[r14]
            boolean r0 = r1 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0138
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x010c:
            r0 = r28
            long r17 = r0.objectFieldOffset(r1)
            r0 = r17
            int r13 = (int) r0
            r18 = r13
            int r13 = r14 + 1
            r1 = r6[r13]
            boolean r0 = r1 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x012d
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x0121:
            r0 = r28
            long r13 = r0.objectFieldOffset(r1)
            int r13 = (int) r13
            r20 = r13
            r1 = 0
            goto L_0x0223
        L_0x012d:
            java.lang.String r1 = (java.lang.String) r1
            r0 = r27
            java.lang.reflect.Field r1 = A04(r0, r1)
            r6[r13] = r1
            goto L_0x0121
        L_0x0138:
            java.lang.String r1 = (java.lang.String) r1
            r0 = r27
            java.lang.reflect.Field r1 = A04(r0, r1)
            r6[r14] = r1
            goto L_0x010c
        L_0x0143:
            int r13 = r16 + 1
            int r0 = r22 / 3
            int r0 = r0 + r0
            int r1 = r0 + 1
            r0 = r6[r16]
            r25[r1] = r0
            r16 = r13
            goto L_0x0103
        L_0x0151:
            int r19 = r16 + 1
            r1 = r6[r16]
            java.lang.String r1 = (java.lang.String) r1
            r0 = r27
            java.lang.reflect.Field r1 = A04(r0, r1)
            r0 = 9
            if (r4 == r0) goto L_0x01e6
            r0 = 17
            if (r4 == r0) goto L_0x01e6
            r0 = 27
            if (r4 == r0) goto L_0x01d2
            r0 = 49
            if (r4 == r0) goto L_0x01d2
            r0 = 12
            if (r4 == r0) goto L_0x01c8
            r0 = 30
            if (r4 == r0) goto L_0x01c8
            r0 = 44
            if (r4 == r0) goto L_0x01c8
            r0 = 50
            if (r4 != r0) goto L_0x0196
            int r16 = r19 + 1
            int r14 = r24 + 1
            r29[r24] = r22
            int r10 = r22 / 3
            r0 = r6[r19]
            int r10 = r10 + r10
            r25[r10] = r0
            if (r15 == 0) goto L_0x01e0
            int r10 = r10 + 1
            int r19 = r16 + 1
            r0 = r6[r16]
            r25[r10] = r0
            r24 = r14
        L_0x0196:
            r0 = r28
            long r16 = r0.objectFieldOffset(r1)
            r0 = r16
            int r10 = (int) r0
            r18 = r10
            r0 = r5 & 4096(0x1000, float:5.74E-42)
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 == 0) goto L_0x01f5
            r0 = 17
            if (r4 > r0) goto L_0x01f5
            int r0 = r13 + 1
            char r14 = r8.charAt(r13)
            if (r14 < r7) goto L_0x0206
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r1 = 13
        L_0x01b8:
            int r10 = r0 + 1
            char r0 = r8.charAt(r0)
            if (r0 < r7) goto L_0x01f2
            int r14 = X.Pxe.A04(r0, r1, r14)
            int r1 = r1 + 13
            r0 = r10
            goto L_0x01b8
        L_0x01c8:
            r0 = r31
            int r0 = r0.A00
            r0 = r0 & 1
            if (r0 != 0) goto L_0x01d2
            if (r15 == 0) goto L_0x01e4
        L_0x01d2:
            int r14 = r19 + 1
            int r0 = r22 / 3
            int r0 = r0 + r0
            int r10 = r0 + 1
            r0 = r6[r19]
            r25[r10] = r0
            r19 = r14
            goto L_0x0196
        L_0x01e0:
            r19 = r16
            r24 = r14
        L_0x01e4:
            r15 = 0
            goto L_0x0196
        L_0x01e6:
            int r0 = r22 / 3
            int r0 = r0 + r0
            int r10 = r0 + 1
            java.lang.Class r0 = r1.getType()
            r25[r10] = r0
            goto L_0x0196
        L_0x01f2:
            int r0 = r0 << r1
            r14 = r14 | r0
            goto L_0x0207
        L_0x01f5:
            r10 = r13
            r1 = 0
            r0 = 18
            if (r4 < r0) goto L_0x0221
            r0 = 49
            if (r4 > r0) goto L_0x0221
            int r0 = r23 + 1
            r29[r23] = r18
            r23 = r0
            goto L_0x0221
        L_0x0206:
            r10 = r0
        L_0x0207:
            int r13 = r3 + r3
            int r0 = r14 / 32
            int r13 = r13 + r0
            r1 = r6[r13]
            boolean r0 = r1 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x024f
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x0214:
            r0 = r28
            long r16 = r0.objectFieldOffset(r1)
            r0 = r16
            int r13 = (int) r0
            r20 = r13
            int r1 = r14 % 32
        L_0x0221:
            r16 = r19
        L_0x0223:
            int r17 = r22 + 1
            r26[r22] = r9
            int r14 = r17 + 1
            r0 = r5 & 512(0x200, float:7.175E-43)
            r13 = 0
            if (r0 == 0) goto L_0x0230
            r13 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x0230:
            r0 = r5 & 256(0x100, float:3.59E-43)
            r9 = 0
            if (r0 == 0) goto L_0x0237
            r9 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0237:
            r5 = 0
            if (r15 == 0) goto L_0x023c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x023c:
            int r0 = r4 << 20
            r9 = r9 | r13
            r9 = r9 | r5
            r9 = r9 | r0
            r18 = r18 | r9
            r26[r17] = r18
            int r22 = r14 + 1
            int r0 = r1 << 20
            r0 = r0 | r20
            r26[r14] = r0
            goto L_0x0078
        L_0x024f:
            java.lang.String r1 = (java.lang.String) r1
            r0 = r27
            java.lang.reflect.Field r1 = A04(r0, r1)
            r6[r13] = r1
            goto L_0x0214
        L_0x025a:
            int r0 = r10 + 1
            char r3 = r8.charAt(r10)
            if (r3 < r7) goto L_0x0279
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0266:
            int r1 = r0 + 1
            char r0 = r8.charAt(r0)
            if (r0 < r7) goto L_0x0276
            int r3 = X.Pxe.A04(r0, r2, r3)
            int r2 = r2 + 13
            r0 = r1
            goto L_0x0266
        L_0x0276:
            int r0 = r0 << r2
            r3 = r3 | r0
            r0 = r1
        L_0x0279:
            int r4 = r0 + 1
            char r9 = r8.charAt(r0)
            if (r9 < r7) goto L_0x0298
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0285:
            int r1 = r4 + 1
            char r0 = r8.charAt(r4)
            if (r0 < r7) goto L_0x0295
            int r9 = X.Pxe.A04(r0, r2, r9)
            int r2 = r2 + 13
            r4 = r1
            goto L_0x0285
        L_0x0295:
            int r0 = r0 << r2
            r9 = r9 | r0
            r4 = r1
        L_0x0298:
            int r0 = r4 + 1
            char r12 = r8.charAt(r4)
            if (r12 < r7) goto L_0x02b7
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x02a4:
            int r1 = r0 + 1
            char r0 = r8.charAt(r0)
            if (r0 < r7) goto L_0x02b4
            int r12 = X.Pxe.A04(r0, r2, r12)
            int r2 = r2 + 13
            r0 = r1
            goto L_0x02a4
        L_0x02b4:
            int r0 = r0 << r2
            r12 = r12 | r0
            r0 = r1
        L_0x02b7:
            int r4 = r0 + 1
            char r11 = r8.charAt(r0)
            if (r11 < r7) goto L_0x02d6
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x02c3:
            int r1 = r4 + 1
            char r0 = r8.charAt(r4)
            if (r0 < r7) goto L_0x02d3
            int r11 = X.Pxe.A04(r0, r2, r11)
            int r2 = r2 + 13
            r4 = r1
            goto L_0x02c3
        L_0x02d3:
            int r0 = r0 << r2
            r11 = r11 | r0
            r4 = r1
        L_0x02d6:
            int r0 = r4 + 1
            char r1 = r8.charAt(r4)
            if (r1 < r7) goto L_0x02f5
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r4 = 13
        L_0x02e2:
            int r2 = r0 + 1
            char r0 = r8.charAt(r0)
            if (r0 < r7) goto L_0x02f2
            int r1 = X.Pxe.A04(r0, r4, r1)
            int r4 = r4 + 13
            r0 = r2
            goto L_0x02e2
        L_0x02f2:
            int r0 = r0 << r4
            r1 = r1 | r0
            r0 = r2
        L_0x02f5:
            int r6 = r0 + 1
            char r4 = r8.charAt(r0)
            if (r4 < r7) goto L_0x0314
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r5 = 13
        L_0x0301:
            int r2 = r6 + 1
            char r0 = r8.charAt(r6)
            if (r0 < r7) goto L_0x0311
            int r4 = X.Pxe.A04(r0, r5, r4)
            int r5 = r5 + 13
            r6 = r2
            goto L_0x0301
        L_0x0311:
            int r0 = r0 << r5
            r4 = r4 | r0
            r6 = r2
        L_0x0314:
            int r0 = r6 + 1
            char r13 = r8.charAt(r6)
            if (r13 < r7) goto L_0x0333
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r5 = 13
        L_0x0320:
            int r2 = r0 + 1
            char r0 = r8.charAt(r0)
            if (r0 < r7) goto L_0x0330
            int r13 = X.Pxe.A04(r0, r5, r13)
            int r5 = r5 + 13
            r0 = r2
            goto L_0x0320
        L_0x0330:
            int r0 = r0 << r5
            r13 = r13 | r0
            r0 = r2
        L_0x0333:
            int r10 = r0 + 1
            char r2 = r8.charAt(r0)
            if (r2 < r7) goto L_0x0352
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r6 = 13
        L_0x033f:
            int r5 = r10 + 1
            char r0 = r8.charAt(r10)
            if (r0 < r7) goto L_0x034f
            int r2 = X.Pxe.A04(r0, r6, r2)
            int r6 = r6 + 13
            r10 = r5
            goto L_0x033f
        L_0x034f:
            int r0 = r0 << r6
            r2 = r2 | r0
            r10 = r5
        L_0x0352:
            int r0 = r2 + r4
            int r0 = r0 + r13
            int r16 = r3 + r3
            int r16 = r16 + r9
            int[] r0 = new int[r0]
            r29 = r0
            goto L_0x0054
        L_0x035f:
            X.Sy4 r30 = new X.Sy4
            r31 = r40
            r32 = r41
            r33 = r42
            r35 = r44
            r36 = r45
            r37 = r26
            r38 = r29
            r39 = r25
            r40 = r12
            r41 = r11
            r42 = r2
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            return r30
        L_0x037b:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Sy4.A00(X.RfJ, X.RmI, X.RfK, X.Tb1, X.RfL, X.RfN):X.Sy4");
    }

    private final C13829Ti0 A01(int i) {
        Object[] objArr = this.A0C;
        int i2 = i / 3;
        int i3 = i2 + i2;
        C13829Ti0 ti0 = (C13829Ti0) objArr[i3];
        if (ti0 != null) {
            return ti0;
        }
        C13829Ti0 A002 = SH3.A02.A00((Class) objArr[i3 + 1]);
        objArr[i3] = A002;
        return A002;
    }

    private final void A05(Object obj, int i) {
        int i2 = this.A00[i + 2];
        long j = (long) (1048575 & i2);
        if (j != 1048575) {
            SUX.A07(obj, j, (1 << (i2 >>> 20)) | SUX.A00(obj, j));
        }
    }

    private final boolean A06(int i, Object obj) {
        int[] iArr = this.A00;
        int i2 = iArr[i + 2];
        long j = (long) (i2 & 1048575);
        if (j == 1048575) {
            int i3 = iArr[i + 1];
            long j2 = (long) (1048575 & i3);
            switch ((i3 >>> 20) & 255) {
                case 0:
                    if (Double.doubleToRawLongBits(SUX.A00.A00(obj, j2)) != 0) {
                        return true;
                    }
                    return false;
                case 1:
                    if (Float.floatToRawIntBits(SUX.A00.A01(obj, j2)) != 0) {
                        return true;
                    }
                    return false;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (SUX.A01(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                case 6:
                case 11:
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                case 13:
                case 15:
                    if (SUX.A00(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    if (SUX.A01) {
                        return AnonymousClass7TF.A1P(Pxj.A00(SUX.A00.A00.getInt(obj, -4 & j2), j2 ^ -1));
                    }
                    return AnonymousClass7TF.A1P(Pxj.A00(SUX.A00.A00.getInt(obj, -4 & j2), j2));
                case 8:
                    Object A022 = SUX.A02(obj, j2);
                    if (A022 instanceof String) {
                        if (!((String) A022).isEmpty()) {
                            return true;
                        }
                        return false;
                    } else if (!(A022 instanceof TAN)) {
                        throw Pxe.A0g();
                    } else if (!TAN.A01.equals(A022)) {
                        return true;
                    } else {
                        return false;
                    }
                case 9:
                case 17:
                    if (SUX.A02(obj, j2) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    if (!TAN.A01.equals(SUX.A02(obj, j2))) {
                        return true;
                    }
                    return false;
                default:
                    throw Pxe.A0g();
            }
        } else {
            if ((SUX.A00(obj, j) & (1 << (i2 >>> 20))) != 0) {
                return true;
            }
            return false;
        }
    }

    public static boolean A07(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof C8424QuF) {
            return AnonymousClass7TF.A1P(((C8424QuF) obj).zzd & AnonymousClass972.MUTABLE_FLAG_MASK);
        }
        return true;
    }

    private final boolean A08(Object obj, int i, int i2) {
        return AnonymousClass7TF.A1S(SUX.A00(obj, Pxe.A0B(this.A00[i2 + 2])), i);
    }

    public final C8424QuF FPU() {
        return new C8423QuE();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c7, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c8, code lost:
        r6.FPm(r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00da, code lost:
        X.SUX.A09(r11, r12, X.SUX.A02(r3, r12));
        X.SUX.A07(r11, (long) (r5[r2 + 2] & 1048575), r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FPm(java.lang.Object r17, java.lang.Object r18) {
        /*
            r16 = this;
            r11 = r17
            boolean r0 = A07(r11)
            if (r0 == 0) goto L_0x020c
            r3 = r18
            r3.getClass()
            r2 = 0
        L_0x000e:
            r4 = r16
            int[] r5 = r4.A00
            int r0 = r5.length
            if (r2 >= r0) goto L_0x0208
            int r0 = r2 + 1
            r0 = r5[r0]
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r10 & r0
            int r0 = r0 >>> 20
            r0 = r0 & 255(0xff, float:3.57E-43)
            r6 = r5[r2]
            long r12 = (long) r1
            switch(r0) {
                case 0: goto L_0x01db;
                case 1: goto L_0x01cb;
                case 2: goto L_0x01bd;
                case 3: goto L_0x01bd;
                case 4: goto L_0x01af;
                case 5: goto L_0x01bd;
                case 6: goto L_0x01af;
                case 7: goto L_0x0195;
                case 8: goto L_0x0187;
                case 9: goto L_0x007e;
                case 10: goto L_0x0187;
                case 11: goto L_0x01af;
                case 12: goto L_0x01af;
                case 13: goto L_0x01af;
                case 14: goto L_0x01bd;
                case 15: goto L_0x01af;
                case 16: goto L_0x01bd;
                case 17: goto L_0x007e;
                case 18: goto L_0x00ec;
                case 19: goto L_0x00ec;
                case 20: goto L_0x00ec;
                case 21: goto L_0x00ec;
                case 22: goto L_0x00ec;
                case 23: goto L_0x00ec;
                case 24: goto L_0x00ec;
                case 25: goto L_0x00ec;
                case 26: goto L_0x00ec;
                case 27: goto L_0x00ec;
                case 28: goto L_0x00ec;
                case 29: goto L_0x00ec;
                case 30: goto L_0x00ec;
                case 31: goto L_0x00ec;
                case 32: goto L_0x00ec;
                case 33: goto L_0x00ec;
                case 34: goto L_0x00ec;
                case 35: goto L_0x00ec;
                case 36: goto L_0x00ec;
                case 37: goto L_0x00ec;
                case 38: goto L_0x00ec;
                case 39: goto L_0x00ec;
                case 40: goto L_0x00ec;
                case 41: goto L_0x00ec;
                case 42: goto L_0x00ec;
                case 43: goto L_0x00ec;
                case 44: goto L_0x00ec;
                case 45: goto L_0x00ec;
                case 46: goto L_0x00ec;
                case 47: goto L_0x00ec;
                case 48: goto L_0x00ec;
                case 49: goto L_0x00ec;
                case 50: goto L_0x01ef;
                case 51: goto L_0x00d4;
                case 52: goto L_0x00d4;
                case 53: goto L_0x00d4;
                case 54: goto L_0x00d4;
                case 55: goto L_0x00d4;
                case 56: goto L_0x00d4;
                case 57: goto L_0x00d4;
                case 58: goto L_0x00d4;
                case 59: goto L_0x00d4;
                case 60: goto L_0x002b;
                case 61: goto L_0x00cd;
                case 62: goto L_0x00cd;
                case 63: goto L_0x00cd;
                case 64: goto L_0x00cd;
                case 65: goto L_0x00cd;
                case 66: goto L_0x00cd;
                case 67: goto L_0x00cd;
                case 68: goto L_0x002b;
                default: goto L_0x0028;
            }
        L_0x0028:
            int r2 = r2 + 3
            goto L_0x000e
        L_0x002b:
            r8 = r5[r2]
            boolean r0 = r4.A08(r3, r8, r2)
            if (r0 == 0) goto L_0x0028
            int r0 = r2 + 1
            r0 = r5[r0]
            r0 = r0 & r10
            sun.misc.Unsafe r9 = A0D
            long r0 = (long) r0
            java.lang.Object r7 = r9.getObject(r3, r0)
            if (r7 == 0) goto L_0x01fe
            X.Ti0 r6 = r4.A01(r2)
            boolean r4 = r4.A08(r11, r8, r2)
            if (r4 != 0) goto L_0x0069
            boolean r4 = A07(r7)
            if (r4 != 0) goto L_0x005e
            r9.putObject(r11, r0, r7)
        L_0x0054:
            int r0 = r2 + 2
            r0 = r5[r0]
            r0 = r0 & r10
            long r0 = (long) r0
            X.SUX.A07(r11, r0, r8)
            goto L_0x0028
        L_0x005e:
            X.QuF r4 = r6.FPU()
            r6.FPm(r4, r7)
            r9.putObject(r11, r0, r4)
            goto L_0x0054
        L_0x0069:
            java.lang.Object r5 = r9.getObject(r11, r0)
            boolean r4 = A07(r5)
            if (r4 != 0) goto L_0x00c8
            X.QuF r4 = r6.FPU()
            r6.FPm(r4, r5)
            r9.putObject(r11, r0, r4)
            goto L_0x00c7
        L_0x007e:
            boolean r0 = r4.A06(r2, r3)
            if (r0 == 0) goto L_0x0028
            int r0 = r2 + 1
            r0 = r5[r0]
            r0 = r0 & r10
            sun.misc.Unsafe r8 = A0D
            long r0 = (long) r0
            java.lang.Object r7 = r8.getObject(r3, r0)
            if (r7 == 0) goto L_0x0203
            X.Ti0 r6 = r4.A01(r2)
            boolean r5 = r4.A06(r2, r11)
            if (r5 != 0) goto L_0x00b3
            boolean r5 = A07(r7)
            if (r5 != 0) goto L_0x00a7
            r8.putObject(r11, r0, r7)
            goto L_0x01ea
        L_0x00a7:
            X.QuF r5 = r6.FPU()
            r6.FPm(r5, r7)
            r8.putObject(r11, r0, r5)
            goto L_0x01ea
        L_0x00b3:
            java.lang.Object r5 = r8.getObject(r11, r0)
            boolean r4 = A07(r5)
            if (r4 != 0) goto L_0x00c8
            X.QuF r4 = r6.FPU()
            r6.FPm(r4, r5)
            r8.putObject(r11, r0, r4)
        L_0x00c7:
            r5 = r4
        L_0x00c8:
            r6.FPm(r5, r7)
            goto L_0x0028
        L_0x00cd:
            boolean r0 = r4.A08(r3, r6, r2)
            if (r0 == 0) goto L_0x0028
            goto L_0x00da
        L_0x00d4:
            boolean r0 = r4.A08(r3, r6, r2)
            if (r0 == 0) goto L_0x0028
        L_0x00da:
            java.lang.Object r0 = X.SUX.A02(r3, r12)
            X.SUX.A09(r11, r12, r0)
            int r0 = r2 + 2
            r0 = r5[r0]
            r0 = r0 & r10
            long r0 = (long) r0
            X.SUX.A07(r11, r0, r6)
            goto L_0x0028
        L_0x00ec:
            X.RmI r0 = r4.A06
            boolean r0 = r0 instanceof X.C8428QuJ
            if (r0 == 0) goto L_0x011f
            java.lang.Object r6 = X.SUX.A02(r11, r12)
            X.TnX r6 = (X.C13981TnX) r6
            java.lang.Object r5 = X.SUX.A02(r3, r12)
            java.util.List r5 = (java.util.List) r5
            int r4 = r6.size()
            int r1 = r5.size()
            if (r4 <= 0) goto L_0x011a
            if (r1 <= 0) goto L_0x0119
            r0 = r6
            X.TRq r0 = (X.C13250TRq) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0116
            int r1 = r1 + r4
            X.TnX r6 = r6.FPV(r1)
        L_0x0116:
            r6.addAll(r5)
        L_0x0119:
            r5 = r6
        L_0x011a:
            X.SUX.A09(r11, r12, r5)
            goto L_0x0028
        L_0x011f:
            java.lang.Object r4 = X.SUX.A02(r3, r12)
            java.util.List r4 = (java.util.List) r4
            int r1 = r4.size()
            java.lang.Object r5 = X.SUX.A02(r11, r12)
            java.util.List r5 = (java.util.List) r5
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x015b
            boolean r0 = r5 instanceof X.C13975TnR
            if (r0 == 0) goto L_0x0156
            X.QuC r5 = new X.QuC
            r5.<init>((int) r1)
        L_0x013e:
            X.SUX.A09(r11, r12, r5)
        L_0x0141:
            int r1 = r5.size()
            int r0 = r4.size()
            if (r1 <= 0) goto L_0x0151
            if (r0 <= 0) goto L_0x0150
            r5.addAll(r4)
        L_0x0150:
            r4 = r5
        L_0x0151:
            X.SUX.A09(r11, r12, r4)
            goto L_0x0028
        L_0x0156:
            java.util.ArrayList r5 = X.DbS.A0v(r1)
            goto L_0x013e
        L_0x015b:
            java.lang.Class r0 = X.C8429QuK.A00
            boolean r0 = X.Pxh.A1W(r0, r5)
            if (r0 == 0) goto L_0x016f
            java.util.ArrayList r1 = X.Pxi.A0k(r5, r1)
            r1.addAll(r5)
        L_0x016a:
            X.SUX.A09(r11, r12, r1)
            r5 = r1
            goto L_0x0141
        L_0x016f:
            boolean r0 = r5 instanceof X.C13251TRr
            if (r0 == 0) goto L_0x0141
            X.TnR r0 = X.C8421QuC.A01
            int r0 = r5.size()
            int r0 = r0 + r1
            X.QuC r1 = new X.QuC
            r1.<init>((int) r0)
            int r0 = r1.size()
            r1.addAll(r0, r5)
            goto L_0x016a
        L_0x0187:
            boolean r0 = r4.A06(r2, r3)
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = X.SUX.A02(r3, r12)
            X.SUX.A09(r11, r12, r0)
            goto L_0x01ea
        L_0x0195:
            boolean r0 = r4.A06(r2, r3)
            if (r0 == 0) goto L_0x0028
            boolean r0 = X.SUX.A01
            if (r0 == 0) goto L_0x01a7
            boolean r0 = X.AnonymousClass7TF.A1P(X.Pxj.A00(X.SUX.A00.A00.getInt(r3, -4 & r12), r12 ^ -1))
            X.SUX.A0A(r11, r12, r0)
            goto L_0x01ea
        L_0x01a7:
            boolean r0 = X.AnonymousClass7TF.A1P(X.Pxj.A00(X.SUX.A00.A00.getInt(r3, -4 & r12), r12))
            X.SUX.A0B(r11, r12, r0)
            goto L_0x01ea
        L_0x01af:
            boolean r0 = r4.A06(r2, r3)
            if (r0 == 0) goto L_0x0028
            int r0 = X.SUX.A00(r3, r12)
            X.SUX.A07(r11, r12, r0)
            goto L_0x01ea
        L_0x01bd:
            boolean r0 = r4.A06(r2, r3)
            if (r0 == 0) goto L_0x0028
            long r0 = X.SUX.A01(r3, r12)
            X.SUX.A08(r11, r12, r0)
            goto L_0x01ea
        L_0x01cb:
            boolean r0 = r4.A06(r2, r3)
            if (r0 == 0) goto L_0x0028
            X.S6m r1 = X.SUX.A00
            float r0 = r1.A01(r3, r12)
            r1.A03(r11, r12, r0)
            goto L_0x01ea
        L_0x01db:
            boolean r0 = r4.A06(r2, r3)
            if (r0 == 0) goto L_0x0028
            X.S6m r10 = X.SUX.A00
            double r14 = r10.A00(r3, r12)
            r10.A02(r11, r12, r14)
        L_0x01ea:
            r4.A05(r11, r2)
            goto L_0x0028
        L_0x01ef:
            X.RfN r0 = X.C11162SCw.A01
            X.SUX.A02(r11, r12)
            X.SUX.A02(r3, r12)
            java.lang.String r0 = "isEmpty"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x01fe:
            java.lang.IllegalStateException r0 = X.Pxj.A0h(r3, r5, r2)
            throw r0
        L_0x0203:
            java.lang.IllegalStateException r0 = X.Pxj.A0h(r3, r5, r2)
            throw r0
        L_0x0208:
            X.C11162SCw.A00(r11, r3)
            return
        L_0x020c:
            java.lang.String r0 = java.lang.String.valueOf(r11)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "Mutating immutable message: "
            java.lang.String r0 = r0.concat(r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Sy4.FPm(java.lang.Object, java.lang.Object):void");
    }

    private final Object A02(int i, int i2, Object obj) {
        C13829Ti0 A012 = A01(i2);
        if (!A08(obj, i, i2)) {
            return A012.FPU();
        }
        Object object = A0D.getObject(obj, Pxe.A0B(this.A00[i2 + 1]));
        if (A07(object)) {
            return object;
        }
        C8424QuF FPU = A012.FPU();
        if (object != null) {
            A012.FPm(FPU, object);
        }
        return FPU;
    }

    private final Object A03(Object obj, int i) {
        C13829Ti0 A012 = A01(i);
        int i2 = this.A00[i + 1] & 1048575;
        if (!A06(i, obj)) {
            return A012.FPU();
        }
        Object object = A0D.getObject(obj, (long) i2);
        if (A07(object)) {
            return object;
        }
        C8424QuF FPU = A012.FPU();
        if (object != null) {
            A012.FPm(FPU, object);
        }
        return FPU;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x003f, code lost:
        continue;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x003f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FPf(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = A07(r7)
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r7 instanceof X.C8424QuF
            r5 = 0
            if (r0 == 0) goto L_0x001e
            r2 = r7
            X.QuF r2 = (X.C8424QuF) r2
            int r1 = r2.zzd
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 | r0
            r2.zzd = r1
            r2.zza = r5
            r1 = r1 & r0
            r2.zzd = r1
        L_0x001e:
            int[] r4 = r6.A00
        L_0x0020:
            int r0 = r4.length
            if (r5 >= r0) goto L_0x00a0
            int r0 = r5 + 1
            r0 = r4[r0]
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r0
            int r0 = r0 >>> 20
            r1 = r0 & 255(0xff, float:3.57E-43)
            long r2 = (long) r2
            r0 = 9
            if (r1 == r0) goto L_0x0085
            r0 = 60
            if (r1 == r0) goto L_0x008a
            r0 = 68
            if (r1 == r0) goto L_0x008a
            switch(r1) {
                case 17: goto L_0x0085;
                case 18: goto L_0x0052;
                case 19: goto L_0x0052;
                case 20: goto L_0x0052;
                case 21: goto L_0x0052;
                case 22: goto L_0x0052;
                case 23: goto L_0x0052;
                case 24: goto L_0x0052;
                case 25: goto L_0x0052;
                case 26: goto L_0x0052;
                case 27: goto L_0x0052;
                case 28: goto L_0x0052;
                case 29: goto L_0x0052;
                case 30: goto L_0x0052;
                case 31: goto L_0x0052;
                case 32: goto L_0x0052;
                case 33: goto L_0x0052;
                case 34: goto L_0x0052;
                case 35: goto L_0x0052;
                case 36: goto L_0x0052;
                case 37: goto L_0x0052;
                case 38: goto L_0x0052;
                case 39: goto L_0x0052;
                case 40: goto L_0x0052;
                case 41: goto L_0x0052;
                case 42: goto L_0x0052;
                case 43: goto L_0x0052;
                case 44: goto L_0x0052;
                case 45: goto L_0x0052;
                case 46: goto L_0x0052;
                case 47: goto L_0x0052;
                case 48: goto L_0x0052;
                case 49: goto L_0x0052;
                case 50: goto L_0x0042;
                default: goto L_0x003f;
            }
        L_0x003f:
            int r5 = r5 + 3
            goto L_0x0020
        L_0x0042:
            sun.misc.Unsafe r0 = A0D
            java.lang.Object r0 = r0.getObject(r7, r2)
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = "zzc"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0052:
            X.RmI r0 = r6.A06
            boolean r0 = r0 instanceof X.C8428QuJ
            java.lang.Object r1 = X.SUX.A02(r7, r2)
            if (r0 == 0) goto L_0x0068
            X.TnX r1 = (X.C13981TnX) r1
            X.TRq r1 = (X.C13250TRq) r1
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x003f
            r0 = 0
            r1.A00 = r0
            goto L_0x003f
        L_0x0068:
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1 instanceof X.C13975TnR
            if (r0 == 0) goto L_0x0078
            X.TnR r1 = (X.C13975TnR) r1
            X.TnR r0 = r1.FPa()
        L_0x0074:
            X.SUX.A09(r7, r2, r0)
            goto L_0x003f
        L_0x0078:
            java.lang.Class r0 = X.C8429QuK.A00
            boolean r0 = X.Pxh.A1W(r0, r1)
            if (r0 != 0) goto L_0x003f
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            goto L_0x0074
        L_0x0085:
            boolean r0 = r6.A06(r5, r7)
            goto L_0x0090
        L_0x008a:
            r0 = r4[r5]
            boolean r0 = r6.A08(r7, r0, r5)
        L_0x0090:
            if (r0 == 0) goto L_0x003f
            X.Ti0 r1 = r6.A01(r5)
            sun.misc.Unsafe r0 = A0D
            java.lang.Object r0 = r0.getObject(r7, r2)
            r1.FPf(r0)
            goto L_0x003f
        L_0x00a0:
            X.QuF r7 = (X.C8424QuF) r7
            X.SRM r1 = r7.zzc
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x00ab
            r0 = 0
            r1.A01 = r0
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Sy4.FPf(java.lang.Object):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v46, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v53, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v54, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v55, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v56, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v105, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v58, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v59, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v109, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v61, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v63, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v64, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v65, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v122, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v69, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v138, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v73, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v79, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v141, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v83, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v91, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v92, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v96, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v99, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v100, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v102, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v104, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v105, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v117, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v120, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v121, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v122, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v123, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v53, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v159, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v129, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01ee, code lost:
        r5 = r5 + 1;
        r13 = r13 + 1;
        r11[r7] = (char) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01f8, code lost:
        if (r10 >= -32) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01fa, code lost:
        if (r6 >= r12) goto L_0x077f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01fc, code lost:
        r21 = r7 + 1;
        r5 = r6 + 1;
        r6 = r37[r6];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0204, code lost:
        if (r10 < -62) goto L_0x0735;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0208, code lost:
        if (r6 > -65) goto L_0x0735;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x020a, code lost:
        r2 = ((r10 & 31) << 6) | (r6 & 63);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0211, code lost:
        r11[r7] = (char) r2;
        r7 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0219, code lost:
        if (r10 >= -16) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x021d, code lost:
        if (r6 >= (r12 - 1)) goto L_0x077f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x021f, code lost:
        r21 = r7 + 1;
        r2 = r6 + 1;
        r13 = r37[r6];
        r5 = r2 + 1;
        r16 = r37[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x022b, code lost:
        if (r13 > -65) goto L_0x073c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0231, code lost:
        if (r10 != -32) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0233, code lost:
        if (r13 < -96) goto L_0x073c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0235, code lost:
        r10 = -32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0239, code lost:
        if (r16 > -65) goto L_0x073c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x023b, code lost:
        r2 = (((r10 & 15) << 12) | ((r13 & 63) << 6)) | (r16 & 63);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x024a, code lost:
        if (r10 != -19) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x024c, code lost:
        if (r13 >= -96) goto L_0x073c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x024e, code lost:
        r10 = -19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0253, code lost:
        if (r6 >= (r12 - 2)) goto L_0x077f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0255, code lost:
        r5 = r6 + 1;
        r15 = r37[r6];
        r2 = r5 + 1;
        r16 = r37[r5];
        r5 = r2 + 1;
        r13 = r37[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0263, code lost:
        if (r15 > -65) goto L_0x0743;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0269, code lost:
        if (X.Pxi.A04(r10, r15) != 0) goto L_0x0743;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x026d, code lost:
        if (r16 > -65) goto L_0x0743;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x026f, code lost:
        if (r13 > -65) goto L_0x0743;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0271, code lost:
        X.Pxk.A0M((((r10 & 7) << 18) | ((r15 & 63) << 12)) | ((r16 & 63) << 6), r13 & 63, r11, r7);
        r7 = r7 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0288, code lost:
        if (r6 < 0) goto L_0x076a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x028a, code lost:
        r9 = r9 | r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x028c, code lost:
        if (r6 == 0) goto L_0x0298;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x028e, code lost:
        r10 = X.Pxe.A11(X.C10132Rn9.A03, r3, r5, r6);
        r4.A02 = r10;
        r5 = r5 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0298, code lost:
        r4.A02 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x029b, code lost:
        r10 = new java.lang.String(r11, 0, r7);
        r4.A02 = r10;
        r5 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02a4, code lost:
        r14.putObject(r8, r0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02a9, code lost:
        if (r7 != 0) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02ab, code lost:
        r9 = r9 | r16;
        r5 = X.STo.A06(r4, r3, r2);
        r3 = X.AnonymousClass7TF.A1P((r4.A01 > 0 ? 1 : (r4.A01 == 0 ? 0 : -1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02bb, code lost:
        if (X.SUX.A01 == false) goto L_0x02c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02bd, code lost:
        X.SUX.A0A(r8, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02c2, code lost:
        X.SUX.A0B(r8, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02c8, code lost:
        if (r7 != 5) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02ca, code lost:
        r5 = r2 + 4;
        r9 = r9 | r16;
        r3 = X.STo.A08(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02d2, code lost:
        r14.putInt(r8, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02d9, code lost:
        if (r7 != 1) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02db, code lost:
        r5 = r2 + 8;
        r16 = r16 | r9;
        r2 = X.Pxk.A07(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02e4, code lost:
        if (r7 != 0) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02e6, code lost:
        r16 = r16 | r9;
        r5 = X.STo.A06(r4, r3, r2);
        r2 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02ee, code lost:
        r14.putLong(r8, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02f4, code lost:
        r9 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02f9, code lost:
        if (r7 != 5) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02fb, code lost:
        r5 = r2 + 4;
        r9 = r9 | r16;
        X.SUX.A00.A03(r8, r0, java.lang.Float.intBitsToFloat(X.STo.A08(r3, r2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0310, code lost:
        if (r7 != 1) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0312, code lost:
        r5 = r2 + 8;
        r9 = r9 | r16;
        X.SUX.A00.A02(r8, r0, java.lang.Double.longBitsToDouble(X.Pxk.A07(r3, r2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0329, code lost:
        r9 = r14.getInt(r8, (long) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0332, code lost:
        if (r6 != 27) goto L_0x0385;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0335, code lost:
        if (r7 != 2) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0337, code lost:
        r6 = (X.C13981TnX) r14.getObject(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0342, code lost:
        if (((X.C13250TRq) r6).A00 != false) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0344, code lost:
        r7 = r6.size();
        r5 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x034a, code lost:
        if (r7 == 0) goto L_0x034e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x034c, code lost:
        r5 = r7 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x034e, code lost:
        r6 = r6.FPV(r5);
        r14.putObject(r8, r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0355, code lost:
        r7 = A01(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0359, code lost:
        r0 = r7.FPU();
        r5 = X.STo.A00(r4, r7, r0, r3, r2, r33);
        r7.FPf(r0);
        r4.A02 = r0;
        r6.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0377, code lost:
        if (r5 >= r33) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0379, code lost:
        r2 = X.STo.A05(r4, r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0381, code lost:
        if (r17 == r4.A00) goto L_0x0359;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0387, code lost:
        if (r6 > 49) goto L_0x05b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0389, code lost:
        r15 = (long) r28;
        r6 = (X.C13981TnX) r14.getObject(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0398, code lost:
        if (((X.C13250TRq) r6).A00 != false) goto L_0x03ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x039a, code lost:
        r11 = r6.size();
        r5 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03a0, code lost:
        if (r11 == 0) goto L_0x03a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03a2, code lost:
        r5 = r11 + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03a4, code lost:
        r6 = r6.FPV(r5);
        r14.putObject(r8, r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03ab, code lost:
        switch(r27) {
            case org.webrtc.EglBase14Impl.EGLExt_SDK_VERSION :int: goto L_0x0547;
            case 19: goto L_0x052e;
            case 20: goto L_0x0510;
            case 21: goto L_0x0510;
            case 22: goto L_0x056d;
            case 23: goto L_0x04f7;
            case 24: goto L_0x04de;
            case 25: goto L_0x04c0;
            case 26: goto L_0x0459;
            case 27: goto L_0x03ae;
            case 28: goto L_0x0416;
            case com.facebook.catalyst.modules.cameraroll.CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL :int: goto L_0x056d;
            case 30: goto L_0x058e;
            case 31: goto L_0x04de;
            case 32: goto L_0x04f7;
            case 33: goto L_0x03f8;
            case 34: goto L_0x03da;
            case 35: goto L_0x0547;
            case 36: goto L_0x052e;
            case 37: goto L_0x0510;
            case 38: goto L_0x0510;
            case 39: goto L_0x056d;
            case 40: goto L_0x04f7;
            case go.Seq.NULL_REFNUM :int: goto L_0x04de;
            case go.Seq.RefTracker.REF_OFFSET :int: goto L_0x04c0;
            case 43: goto L_0x056d;
            case 44: goto L_0x058e;
            case 45: goto L_0x04de;
            case 46: goto L_0x04f7;
            case 47: goto L_0x03f8;
            case 48: goto L_0x03da;
            default: goto L_0x03ae;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03b0, code lost:
        if (r7 != 3) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03b2, code lost:
        r27 = (r17 & -8) | 4;
        r23 = A01(r13);
        r22 = r4;
        r24 = r3;
        r25 = r2;
        r26 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03c2, code lost:
        r5 = X.STo.A02(r22, r23, r24, r25, r26, r27);
        r6.add(r4.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03cd, code lost:
        if (r5 >= r33) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03cf, code lost:
        r25 = X.STo.A05(r4, r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03d7, code lost:
        if (r17 != r4.A00) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03db, code lost:
        if (r7 != 2) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03dd, code lost:
        r5 = X.STo.A05(r4, r3, r2);
        r0 = r4.A00 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x03e4, code lost:
        if (r5 >= r0) goto L_0x0558;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x03e6, code lost:
        X.STo.A06(r4, r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x03ed, code lost:
        throw X.Pxh.A0c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03ee, code lost:
        if (r7 != 0) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x03f0, code lost:
        X.STo.A06(r4, r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x03f7, code lost:
        throw X.Pxh.A0c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x03f9, code lost:
        if (r7 != 2) goto L_0x040c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x03fb, code lost:
        r5 = X.STo.A05(r4, r3, r2);
        r0 = r4.A00 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0402, code lost:
        if (r5 >= r0) goto L_0x0558;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0404, code lost:
        X.STo.A05(r4, r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x040b, code lost:
        throw X.Pxh.A0c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x040c, code lost:
        if (r7 != 0) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x040e, code lost:
        X.STo.A05(r4, r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0415, code lost:
        throw X.Pxh.A0c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0417, code lost:
        if (r7 != 2) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0419, code lost:
        r5 = X.STo.A05(r4, r3, r2);
        r10 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x041f, code lost:
        if (r10 < 0) goto L_0x0760;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0421, code lost:
        r7 = r3.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0424, code lost:
        if (r10 > (r7 - r5)) goto L_0x0755;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0426, code lost:
        if (r10 != 0) goto L_0x0444;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0428, code lost:
        r6.add(X.TAN.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x042f, code lost:
        if (r5 >= r33) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0431, code lost:
        r10 = X.STo.A05(r4, r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0439, code lost:
        if (r17 != r4.A00) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x043b, code lost:
        r5 = X.STo.A05(r4, r3, r10);
        r10 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0441, code lost:
        if (r10 < 0) goto L_0x0760;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0444, code lost:
        X.TAN.A00(r5, r5 + r10, r7);
        r1 = new byte[r10];
        java.lang.System.arraycopy(r3, r5, r1, 0, r10);
        r6.add(new X.C8426QuH(r1));
        r5 = r5 + r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x045a, code lost:
        if (r7 != 2) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x045c, code lost:
        r0 = ((r15 & 536870912) > 0 ? 1 : ((r15 & 536870912) == 0 ? 0 : -1));
        r5 = X.STo.A05(r4, r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0466, code lost:
        if (r0 != 0) goto L_0x048f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0468, code lost:
        r1 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x046a, code lost:
        if (r1 < 0) goto L_0x076a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x046c, code lost:
        if (r1 != 0) goto L_0x0484;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x046e, code lost:
        r6.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0473, code lost:
        if (r5 >= r33) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0475, code lost:
        r7 = X.STo.A05(r4, r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x047d, code lost:
        if (r17 != r4.A00) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x047f, code lost:
        r5 = X.STo.A05(r4, r3, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0484, code lost:
        r6.add(X.Pxe.A11(X.C10132Rn9.A03, r3, r5, r1));
        r5 = r5 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x048f, code lost:
        r7 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0491, code lost:
        if (r7 < 0) goto L_0x076a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0493, code lost:
        if (r7 != 0) goto L_0x04ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0495, code lost:
        r6.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x049a, code lost:
        if (r5 >= r33) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x049c, code lost:
        r7 = X.STo.A05(r4, r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x04a4, code lost:
        if (r17 != r4.A00) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x04a6, code lost:
        r5 = X.STo.A05(r4, r3, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x04ab, code lost:
        r1 = r5 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x04b3, code lost:
        if (X.C9991Rkl.A00.A00(r3, r5, r1) == false) goto L_0x077f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x04b5, code lost:
        r6.add(X.Pxe.A11(X.C10132Rn9.A03, r3, r5, r7));
        r5 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x04c1, code lost:
        if (r7 != 2) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x04c3, code lost:
        r5 = X.STo.A05(r4, r3, r2);
        r0 = r4.A00 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x04ca, code lost:
        if (r5 >= r0) goto L_0x0558;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x04cc, code lost:
        X.STo.A06(r4, r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x04d3, code lost:
        throw X.Pxh.A0c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x04d4, code lost:
        if (r7 != 0) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x04d6, code lost:
        X.STo.A06(r4, r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x04dd, code lost:
        throw X.Pxh.A0c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x04df, code lost:
        if (r7 != 2) goto L_0x04ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x04e1, code lost:
        r5 = X.STo.A05(r4, r3, r2);
        r0 = r4.A00 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x04e8, code lost:
        if (r5 >= r0) goto L_0x0558;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x04ee, code lost:
        throw X.Pxh.A0c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x04f0, code lost:
        if (r7 != 5) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x04f6, code lost:
        throw X.Pxh.A0c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x04f8, code lost:
        if (r7 != 2) goto L_0x0508;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x04fa, code lost:
        r5 = X.STo.A05(r4, r3, r2);
        r0 = r4.A00 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0501, code lost:
        if (r5 >= r0) goto L_0x0558;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0507, code lost:
        throw X.Pxh.A0c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0509, code lost:
        if (r7 != 1) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x050f, code lost:
        throw X.Pxh.A0c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0511, code lost:
        if (r7 != 2) goto L_0x0524;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0513, code lost:
        r5 = X.STo.A05(r4, r3, r2);
        r0 = r4.A00 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x051a, code lost:
        if (r5 >= r0) goto L_0x0558;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x051c, code lost:
        X.STo.A06(r4, r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0523, code lost:
        throw X.Pxh.A0c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0524, code lost:
        if (r7 != 0) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0526, code lost:
        X.STo.A06(r4, r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x052d, code lost:
        throw X.Pxh.A0c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x052f, code lost:
        if (r7 != 2) goto L_0x053f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0531, code lost:
        r5 = X.STo.A05(r4, r3, r2);
        r0 = r4.A00 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0538, code lost:
        if (r5 >= r0) goto L_0x0558;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x053e, code lost:
        throw X.Pxh.A0c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0540, code lost:
        if (r7 != 5) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0546, code lost:
        throw X.Pxh.A0c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0548, code lost:
        if (r7 != 2) goto L_0x0565;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x054a, code lost:
        r5 = X.STo.A05(r4, r3, r2);
        r0 = r4.A00 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0551, code lost:
        if (r5 >= r0) goto L_0x0558;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0557, code lost:
        throw X.Pxh.A0c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0558, code lost:
        if (r5 == r0) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0564, code lost:
        throw X.RCZ.A00(X.C273654mx.A00(13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0566, code lost:
        if (r7 != 1) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x056c, code lost:
        throw X.Pxh.A0c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x056e, code lost:
        if (r7 != 2) goto L_0x05a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0570, code lost:
        r5 = X.STo.A05(r4, r3, r2);
        r0 = r4.A00 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0577, code lost:
        if (r5 >= r0) goto L_0x0581;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0579, code lost:
        X.STo.A05(r4, r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0580, code lost:
        throw X.Pxh.A0c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0581, code lost:
        if (r5 == r0) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x058d, code lost:
        throw X.RCZ.A00(X.C273654mx.A00(13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x058f, code lost:
        if (r7 != 2) goto L_0x05a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0591, code lost:
        r5 = X.STo.A05(r4, r3, r2);
        r0 = r4.A00 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0598, code lost:
        if (r5 >= r0) goto L_0x05a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x059a, code lost:
        X.STo.A05(r4, r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x05a1, code lost:
        throw X.Pxh.A0c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x05a2, code lost:
        if (r5 != r0) goto L_0x0774;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x05a4, code lost:
        r0 = X.C11162SCw.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x05a8, code lost:
        if (r7 != 0) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x05aa, code lost:
        X.STo.A05(r4, r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x05b1, code lost:
        throw X.Pxh.A0c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008a, code lost:
        r16 = r13 + 2;
        r22 = (long) (r11[r16] & 1048575);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x05b4, code lost:
        if (r6 != 50) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x05b7, code lost:
        if (r7 != 2) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x05b9, code lost:
        r14.getObject(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x05c0, code lost:
        throw X.Pxh.A0c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x05c6, code lost:
        if (r7 != 3) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x05c8, code lost:
        r6 = A02(r20, r13, r8);
        r5 = X.STo.A01(r4, A01(r13), r6, r3, r2, r33, (r17 & -8) | 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x05e5, code lost:
        if (r7 != 0) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0092, code lost:
        switch(r27) {
            case 51: goto L_0x06dc;
            case 52: goto L_0x06ca;
            case 53: goto L_0x06bd;
            case 54: goto L_0x06bd;
            case 55: goto L_0x06b0;
            case 56: goto L_0x06a2;
            case 57: goto L_0x0694;
            case 58: goto L_0x0681;
            case 59: goto L_0x0658;
            case 60: goto L_0x062b;
            case 61: goto L_0x061d;
            case 62: goto L_0x06b0;
            case 63: goto L_0x060c;
            case 64: goto L_0x0694;
            case 65: goto L_0x06a2;
            case 66: goto L_0x05f9;
            case 67: goto L_0x05e5;
            case 68: goto L_0x05c4;
            default: goto L_0x0095;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x05e7, code lost:
        r5 = X.STo.A06(r4, r3, r2);
        r10 = r4.A01;
        r6 = java.lang.Long.valueOf((r10 >>> 1) ^ (-(1 & r10)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x05f9, code lost:
        if (r7 != 0) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x05fb, code lost:
        r5 = X.STo.A05(r4, r3, r2);
        r7 = r4.A00;
        r6 = java.lang.Integer.valueOf((r7 >>> 1) ^ (-(r7 & 1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x060c, code lost:
        if (r7 != 0) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x060e, code lost:
        r5 = X.STo.A05(r4, r3, r2);
        r6 = java.lang.Integer.valueOf(r4.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0618, code lost:
        r14.putObject(r8, r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x061e, code lost:
        if (r7 != 2) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0620, code lost:
        r5 = X.STo.A04(r4, r3, r2);
        r6 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0626, code lost:
        r14.putObject(r8, r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0095, code lost:
        r5 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x062c, code lost:
        if (r7 != 2) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x062e, code lost:
        r6 = A02(r20, r13, r8);
        r5 = X.STo.A00(r4, A01(r13), r6, r3, r2, r33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0646, code lost:
        r14.putObject(r8, (long) (r11[r29] & 1048575), r6);
        X.SUX.A07(r8, (long) (r11[r16] & 1048575), r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0659, code lost:
        if (r7 != 2) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x065b, code lost:
        r5 = X.STo.A05(r4, r3, r2);
        r11 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0661, code lost:
        if (r11 != 0) goto L_0x0668;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0663, code lost:
        r14.putObject(r8, r0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0668, code lost:
        r7 = r5 + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0096, code lost:
        if (r5 != r2) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x066c, code lost:
        if ((r28 & 536870912) == 0) goto L_0x0676;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0674, code lost:
        if (X.C9991Rkl.A00.A00(r3, r5, r7) == false) goto L_0x077f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0676, code lost:
        r14.putObject(r8, r0, X.Pxe.A11(X.C10132Rn9.A03, r3, r5, r11));
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0681, code lost:
        if (r7 != 0) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0683, code lost:
        r5 = X.STo.A06(r4, r3, r2);
        r6 = java.lang.Boolean.valueOf(X.AnonymousClass7TF.A1P((r4.A01 > 0 ? 1 : (r4.A01 == 0 ? 0 : -1))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0695, code lost:
        if (r7 != 5) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0697, code lost:
        r5 = r2 + 4;
        r6 = java.lang.Integer.valueOf(X.STo.A08(r3, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0098, code lost:
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x06a3, code lost:
        if (r7 != 1) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x06a5, code lost:
        r5 = r2 + 8;
        r6 = java.lang.Long.valueOf(X.Pxk.A07(r3, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x06b0, code lost:
        if (r7 != 0) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x06b2, code lost:
        r5 = X.STo.A05(r4, r3, r2);
        r6 = java.lang.Integer.valueOf(r4.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x06bd, code lost:
        if (r7 != 0) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x06bf, code lost:
        r5 = X.STo.A06(r4, r3, r2);
        r6 = java.lang.Long.valueOf(r4.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x06cb, code lost:
        if (r7 != 5) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x06cd, code lost:
        r5 = r2 + 4;
        r6 = java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(X.STo.A08(r3, r2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x06dd, code lost:
        if (r7 != 1) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x06df, code lost:
        r5 = r2 + 8;
        r6 = java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(X.Pxk.A07(r3, r2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x06ed, code lost:
        r14.putObject(r8, r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x06f0, code lost:
        r14.putInt(r8, r22, r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x071e, code lost:
        r0 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0720, code lost:
        if (r40 != 0) goto L_0x0725;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0722, code lost:
        if (r5 != r0) goto L_0x072e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0724, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0725, code lost:
        if (r5 > r0) goto L_0x072e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x072b, code lost:
        if (r17 != r21) goto L_0x072e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x072d, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0734, code lost:
        throw X.RCZ.A00("Failed to parse the message.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x073b, code lost:
        throw X.RCZ.A00("Protocol message had invalid UTF-8.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0742, code lost:
        throw X.RCZ.A00("Protocol message had invalid UTF-8.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0749, code lost:
        throw X.RCZ.A00("Protocol message had invalid UTF-8.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0754, code lost:
        throw X.Pxf.A0V("buffer length=%d, index=%d, size=%d", X.Pxh.A1a(r10, r5, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x075f, code lost:
        throw X.RCZ.A00(X.C273654mx.A00(13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0769, code lost:
        throw X.RCZ.A00(X.C273654mx.A00(6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0773, code lost:
        throw X.RCZ.A00(X.C273654mx.A00(6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x077e, code lost:
        throw X.RCZ.A00(X.C273654mx.A00(13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        r0 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a7, code lost:
        if (r0 == 1048575) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a9, code lost:
        r14.putInt(r8, (long) r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ad, code lost:
        r3 = r12.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b1, code lost:
        if (r3 >= r12.A04) goto L_0x071e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b3, code lost:
        X.SUX.A02(r8, (long) (r12.A00[r12.A0B[r3] + 1] & 1048575));
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c5, code lost:
        r19 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c8, code lost:
        if (r13 == -1) goto L_0x05c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ca, code lost:
        r7 = r17 & 7;
        r29 = r13 + 1;
        r28 = r11[r29];
        r27 = (r28 >>> 20) & 255;
        r0 = (long) (r28 & 1048575);
        r10 = "";
        r6 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e6, code lost:
        if (r6 > 17) goto L_0x0330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e8, code lost:
        r23 = r11[r13 + 2];
        r16 = 1 << (r23 >>> 20);
        r23 = r23 & 1048575;
        r5 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f8, code lost:
        if (r23 == r5) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fa, code lost:
        if (r5 == 1048575) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fc, code lost:
        r14.putInt(r8, (long) r5, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0100, code lost:
        r5 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0102, code lost:
        if (r5 != 1048575) goto L_0x0329;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0104, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0105, code lost:
        r18 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0107, code lost:
        switch(r27) {
            case 0: goto L_0x030e;
            case 1: goto L_0x02f8;
            case 2: goto L_0x02e4;
            case 3: goto L_0x02e4;
            case 4: goto L_0x0167;
            case 5: goto L_0x02d7;
            case 6: goto L_0x02c7;
            case 7: goto L_0x02a9;
            case 8: goto L_0x01a7;
            case 9: goto L_0x0180;
            case 10: goto L_0x0173;
            case 11: goto L_0x0167;
            case com.instagram.react.modules.base.IgReactQEModule.CONFIG_KEY_OFFSET :int: goto L_0x0167;
            case 13: goto L_0x02c7;
            case 14: goto L_0x02d7;
            case 15: goto L_0x0155;
            case 16: goto L_0x0138;
            default: goto L_0x010a;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x010c, code lost:
        if (r7 != 3) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x010e, code lost:
        r9 = r9 | r16;
        r6 = A03(r8, r13);
        r5 = X.STo.A01(r4, A01(r13), r6, r3, r2, r33, (r20 << 3) | 4);
        r14.putObject(r8, (long) (r11[r29] & 1048575), r6);
        A05(r8, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0134, code lost:
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0138, code lost:
        if (r7 != 0) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x013a, code lost:
        r9 = r9 | r16;
        r5 = X.STo.A06(r4, r3, r2);
        r6 = r4.A01;
        r14.putLong(r8, r0, (r6 >>> 1) ^ (-(1 & r6)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0155, code lost:
        if (r7 != 0) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0157, code lost:
        r9 = r9 | r16;
        r5 = X.STo.A05(r4, r3, r2);
        r3 = r4.A00;
        r3 = (r3 >>> 1) ^ (-(r3 & 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0167, code lost:
        if (r7 != 0) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0169, code lost:
        r9 = r9 | r16;
        r5 = X.STo.A05(r4, r3, r2);
        r3 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0174, code lost:
        if (r7 != 2) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0176, code lost:
        r9 = r9 | r16;
        r5 = X.STo.A04(r4, r3, r2);
        r10 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0181, code lost:
        if (r7 != 2) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0183, code lost:
        r16 = r16 | r9;
        r6 = A03(r8, r13);
        r5 = X.STo.A00(r4, A01(r13), r6, r3, r2, r33);
        r14.putObject(r8, (long) (r11[r29] & 1048575), r6);
        A05(r8, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a8, code lost:
        if (r7 != 2) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01aa, code lost:
        r28 = r28 & 536870912;
        r5 = X.STo.A05(r4, r3, r2);
        r6 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01b2, code lost:
        if (r28 == 0) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b4, code lost:
        if (r6 < 0) goto L_0x076a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b6, code lost:
        r9 = r9 | r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b8, code lost:
        if (r6 == 0) goto L_0x0298;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ba, code lost:
        r2 = X.C9991Rkl.A00;
        r10 = r3.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01c3, code lost:
        if ((((r10 - r5) - r6) | (r5 | r6)) < 0) goto L_0x074a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c5, code lost:
        r12 = r5 + r6;
        r11 = new char[r6];
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ca, code lost:
        if (r5 >= r12) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01cc, code lost:
        r2 = r37[r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01ce, code lost:
        if (r2 < 0) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d0, code lost:
        r5 = r5 + 1;
        r11[r7] = (char) r2;
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d9, code lost:
        if (r5 >= r12) goto L_0x029b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01db, code lost:
        r6 = r5 + 1;
        r10 = r37[r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01df, code lost:
        if (r10 < 0) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e1, code lost:
        r13 = r7 + 1;
        r11[r7] = (char) r10;
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01e7, code lost:
        r7 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e8, code lost:
        if (r5 >= r12) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ea, code lost:
        r2 = r37[r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01ec, code lost:
        if (r2 < 0) goto L_0x01d9;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r10v13, types: [int, byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r17v3, types: [byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A09(X.SFD r35, java.lang.Object r36, byte[] r37, int r38, int r39, int r40) {
        /*
            r34 = this;
            r8 = r36
            r5 = r38
            boolean r0 = A07(r8)
            if (r0 == 0) goto L_0x0786
            sun.misc.Unsafe r14 = A0D
            r1 = -1
            r19 = 0
            r17 = 0
            r9 = 0
            r18 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0015:
            r12 = r34
            r33 = r39
            r21 = r40
            r0 = r33
            if (r5 >= r0) goto L_0x00a2
            int r2 = r5 + 1
            r3 = r37
            byte r17 = r37[r5]
            r4 = r35
            if (r17 >= 0) goto L_0x0033
            r0 = r17
            int r2 = X.STo.A07(r4, r3, r0, r2)
            int r0 = r4.A00
            r17 = r0
        L_0x0033:
            int r20 = r17 >>> 3
            r30 = 3
            r0 = r20
            if (r0 <= r1) goto L_0x0064
            int r19 = r19 / r30
            int r1 = r12.A01
            if (r0 < r1) goto L_0x05c1
            int r1 = r12.A02
            if (r0 > r1) goto L_0x05c1
            int[] r11 = r12.A00
            int r0 = r11.length
            int r0 = r0 / 3
            int r1 = r0 + -1
        L_0x004c:
            r0 = r19
            if (r0 > r1) goto L_0x05c1
            int r0 = r1 + r19
            int r6 = r0 >>> 1
            int r13 = r6 * 3
            r5 = r11[r13]
            r0 = r20
            if (r0 == r5) goto L_0x00c5
            if (r0 >= r5) goto L_0x0061
            int r1 = r6 + -1
            goto L_0x004c
        L_0x0061:
            int r19 = r6 + 1
            goto L_0x004c
        L_0x0064:
            int r1 = r12.A01
            if (r0 < r1) goto L_0x05c1
            int r1 = r12.A02
            if (r0 > r1) goto L_0x05c1
            r7 = 0
            int[] r11 = r12.A00
            int r0 = r11.length
            int r0 = r0 / 3
            int r6 = r0 + -1
        L_0x0074:
            if (r7 > r6) goto L_0x05c1
            int r0 = r6 + r7
            int r5 = r0 >>> 1
            int r13 = r5 * 3
            r1 = r11[r13]
            r0 = r20
            if (r0 == r1) goto L_0x00c5
            if (r0 >= r1) goto L_0x0087
            int r6 = r5 + -1
            goto L_0x0074
        L_0x0087:
            int r7 = r5 + 1
            goto L_0x0074
        L_0x008a:
            int r16 = r13 + 2
            r5 = r11[r16]
            r5 = r5 & r15
            long r5 = (long) r5
            r22 = r5
            switch(r27) {
                case 51: goto L_0x06dc;
                case 52: goto L_0x06ca;
                case 53: goto L_0x06bd;
                case 54: goto L_0x06bd;
                case 55: goto L_0x06b0;
                case 56: goto L_0x06a2;
                case 57: goto L_0x0694;
                case 58: goto L_0x0681;
                case 59: goto L_0x0658;
                case 60: goto L_0x062b;
                case 61: goto L_0x061d;
                case 62: goto L_0x06b0;
                case 63: goto L_0x060c;
                case 64: goto L_0x0694;
                case 65: goto L_0x06a2;
                case 66: goto L_0x05f9;
                case 67: goto L_0x05e5;
                case 68: goto L_0x05c4;
                default: goto L_0x0095;
            }
        L_0x0095:
            r5 = r2
        L_0x0096:
            if (r5 != r2) goto L_0x0134
            r2 = r5
        L_0x0099:
            r1 = r17
            r0 = r21
            if (r1 != r0) goto L_0x06f9
            if (r40 == 0) goto L_0x06f9
            r5 = r2
        L_0x00a2:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r18
            if (r0 == r2) goto L_0x00ad
            long r0 = (long) r0
            r14.putInt(r8, r0, r9)
        L_0x00ad:
            int r3 = r12.A03
        L_0x00af:
            int r0 = r12.A04
            if (r3 >= r0) goto L_0x071e
            int[] r0 = r12.A0B
            r0 = r0[r3]
            int[] r1 = r12.A00
            int r0 = r0 + 1
            r0 = r1[r0]
            r0 = r0 & r2
            long r0 = (long) r0
            X.SUX.A02(r8, r0)
            int r3 = r3 + 1
            goto L_0x00af
        L_0x00c5:
            r19 = r13
            r0 = -1
            if (r13 == r0) goto L_0x05c1
            r7 = r17 & 7
            int r29 = r13 + 1
            r28 = r11[r29]
            int r0 = r28 >>> 20
            r0 = r0 & 255(0xff, float:3.57E-43)
            r27 = r0
            r15 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r28 & r15
            long r0 = (long) r0
            r26 = 536870912(0x20000000, float:1.0842022E-19)
            r24 = 0
            java.lang.String r10 = ""
            r5 = 17
            r6 = r27
            if (r6 > r5) goto L_0x0330
            int r5 = r13 + 2
            r23 = r11[r5]
            int r5 = r23 >>> 20
            r22 = 1
            int r16 = r22 << r5
            r23 = r23 & r15
            r6 = r23
            r5 = r18
            if (r6 == r5) goto L_0x0107
            if (r5 == r15) goto L_0x0100
            long r5 = (long) r5
            r14.putInt(r8, r5, r9)
        L_0x0100:
            r5 = r23
            if (r5 != r15) goto L_0x0329
            r9 = 0
        L_0x0105:
            r18 = r23
        L_0x0107:
            switch(r27) {
                case 0: goto L_0x030e;
                case 1: goto L_0x02f8;
                case 2: goto L_0x02e4;
                case 3: goto L_0x02e4;
                case 4: goto L_0x0167;
                case 5: goto L_0x02d7;
                case 6: goto L_0x02c7;
                case 7: goto L_0x02a9;
                case 8: goto L_0x01a7;
                case 9: goto L_0x0180;
                case 10: goto L_0x0173;
                case 11: goto L_0x0167;
                case 12: goto L_0x0167;
                case 13: goto L_0x02c7;
                case 14: goto L_0x02d7;
                case 15: goto L_0x0155;
                case 16: goto L_0x0138;
                default: goto L_0x010a;
            }
        L_0x010a:
            r0 = r30
            if (r7 != r0) goto L_0x0099
            r9 = r9 | r16
            java.lang.Object r6 = r12.A03(r8, r13)
            int r0 = r20 << 3
            r27 = r0 | 4
            X.Ti0 r22 = r12.A01(r13)
            r21 = r4
            r23 = r6
            r24 = r3
            r25 = r2
            r26 = r33
            int r5 = X.STo.A01(r21, r22, r23, r24, r25, r26, r27)
            r0 = r11[r29]
            r0 = r0 & r15
            long r0 = (long) r0
            r14.putObject(r8, r0, r6)
            r12.A05(r8, r13)
        L_0x0134:
            r1 = r20
            goto L_0x0015
        L_0x0138:
            if (r7 != 0) goto L_0x0099
            r9 = r9 | r16
            int r5 = X.STo.A06(r4, r3, r2)
            long r6 = r4.A01
            r2 = 1
            long r2 = r2 & r6
            long r6 = r6 >>> r22
            long r10 = -r2
            long r6 = r6 ^ r10
            r21 = r14
            r22 = r8
            r23 = r0
            r25 = r6
            r21.putLong(r22, r23, r25)
            goto L_0x0134
        L_0x0155:
            if (r7 != 0) goto L_0x0099
            r9 = r9 | r16
            int r5 = X.STo.A05(r4, r3, r2)
            int r3 = r4.A00
            r2 = r3 & 1
            int r3 = r3 >>> 1
            int r2 = -r2
            r3 = r3 ^ r2
            goto L_0x02d2
        L_0x0167:
            if (r7 != 0) goto L_0x0099
            r9 = r9 | r16
            int r5 = X.STo.A05(r4, r3, r2)
            int r3 = r4.A00
            goto L_0x02d2
        L_0x0173:
            r5 = 2
            if (r7 != r5) goto L_0x0099
            r9 = r9 | r16
            int r5 = X.STo.A04(r4, r3, r2)
            java.lang.Object r10 = r4.A02
            goto L_0x02a4
        L_0x0180:
            r0 = 2
            if (r7 != r0) goto L_0x0099
            r16 = r16 | r9
            java.lang.Object r6 = r12.A03(r8, r13)
            X.Ti0 r22 = r12.A01(r13)
            r21 = r4
            r23 = r6
            r24 = r3
            r25 = r2
            r26 = r33
            int r5 = X.STo.A00(r21, r22, r23, r24, r25, r26)
            r0 = r11[r29]
            r0 = r0 & r15
            long r0 = (long) r0
            r14.putObject(r8, r0, r6)
            r12.A05(r8, r13)
            goto L_0x02f4
        L_0x01a7:
            r5 = 2
            if (r7 != r5) goto L_0x0099
            r28 = r28 & r26
            int r5 = X.STo.A05(r4, r3, r2)
            int r6 = r4.A00
            if (r28 == 0) goto L_0x0288
            if (r6 < 0) goto L_0x076a
            r9 = r9 | r16
            if (r6 == 0) goto L_0x0298
            X.Rzr r2 = X.C9991Rkl.A00
            int r10 = r3.length
            int r7 = r10 - r5
            r2 = r5 | r6
            int r7 = r7 - r6
            r7 = r7 | r2
            if (r7 < 0) goto L_0x074a
            int r12 = r5 + r6
            char[] r11 = new char[r6]
            r7 = 0
        L_0x01ca:
            if (r5 >= r12) goto L_0x01d9
            byte r2 = r37[r5]
            if (r2 < 0) goto L_0x01d9
            int r5 = r5 + 1
            int r6 = r7 + 1
            char r2 = (char) r2
            r11[r7] = r2
            r7 = r6
            goto L_0x01ca
        L_0x01d9:
            if (r5 >= r12) goto L_0x029b
            int r6 = r5 + 1
            byte r10 = r37[r5]
            if (r10 < 0) goto L_0x01f6
            int r13 = r7 + 1
            char r2 = (char) r10
            r11[r7] = r2
            r5 = r6
        L_0x01e7:
            r7 = r13
            if (r5 >= r12) goto L_0x01d9
            byte r2 = r37[r5]
            if (r2 < 0) goto L_0x01d9
            int r5 = r5 + 1
            int r13 = r13 + 1
            char r2 = (char) r2
            r11[r7] = r2
            goto L_0x01e7
        L_0x01f6:
            r2 = -32
            if (r10 >= r2) goto L_0x0217
            if (r6 >= r12) goto L_0x077f
            int r21 = r7 + 1
            int r5 = r6 + 1
            byte r6 = r37[r6]
            r2 = -62
            if (r10 < r2) goto L_0x0735
            r2 = -65
            if (r6 > r2) goto L_0x0735
            r2 = r10 & 31
            int r2 = r2 << 6
            r6 = r6 & 63
            r2 = r2 | r6
        L_0x0211:
            char r2 = (char) r2
            r11[r7] = r2
            r7 = r21
            goto L_0x01d9
        L_0x0217:
            r2 = -16
            if (r10 >= r2) goto L_0x0251
            int r2 = r12 + -1
            if (r6 >= r2) goto L_0x077f
            int r21 = r7 + 1
            int r2 = r6 + 1
            byte r13 = r37[r6]
            int r5 = r2 + 1
            byte r16 = r37[r2]
            r6 = -65
            if (r13 > r6) goto L_0x073c
            r15 = -96
            r2 = -32
            if (r10 != r2) goto L_0x0248
            if (r13 < r15) goto L_0x073c
            r10 = -32
        L_0x0237:
            r2 = r16
            if (r2 > r6) goto L_0x073c
            r2 = r10 & 15
            r6 = r13 & 63
            r10 = r16 & 63
            int r2 = r2 << 12
            int r6 = r6 << 6
            r2 = r2 | r6
            r2 = r2 | r10
            goto L_0x0211
        L_0x0248:
            r2 = -19
            if (r10 != r2) goto L_0x0237
            if (r13 >= r15) goto L_0x073c
            r10 = -19
            goto L_0x0237
        L_0x0251:
            int r2 = r12 + -2
            if (r6 >= r2) goto L_0x077f
            int r5 = r6 + 1
            byte r15 = r37[r6]
            int r2 = r5 + 1
            byte r16 = r37[r5]
            int r5 = r2 + 1
            byte r13 = r37[r2]
            r6 = -65
            if (r15 > r6) goto L_0x0743
            int r2 = X.Pxi.A04(r10, r15)
            if (r2 != 0) goto L_0x0743
            r2 = r16
            if (r2 > r6) goto L_0x0743
            if (r13 > r6) goto L_0x0743
            r2 = r10 & 7
            r10 = r15 & 63
            r15 = r16 & 63
            r6 = r13 & 63
            int r2 = r2 << 18
            int r10 = r10 << 12
            r2 = r2 | r10
            int r10 = r15 << 6
            r2 = r2 | r10
            X.Pxk.A0M(r2, r6, r11, r7)
            int r7 = r7 + 2
            goto L_0x01d9
        L_0x0288:
            if (r6 < 0) goto L_0x076a
            r9 = r9 | r16
            if (r6 == 0) goto L_0x0298
            java.nio.charset.Charset r2 = X.C10132Rn9.A03
            java.lang.String r10 = X.Pxe.A11(r2, r3, r5, r6)
            r4.A02 = r10
            int r5 = r5 + r6
            goto L_0x02a4
        L_0x0298:
            r4.A02 = r10
            goto L_0x02a4
        L_0x029b:
            r2 = 0
            java.lang.String r10 = new java.lang.String
            r10.<init>(r11, r2, r7)
            r4.A02 = r10
            r5 = r12
        L_0x02a4:
            r14.putObject(r8, r0, r10)
            goto L_0x0134
        L_0x02a9:
            if (r7 != 0) goto L_0x0099
            r9 = r9 | r16
            int r5 = X.STo.A06(r4, r3, r2)
            long r2 = r4.A01
            int r4 = (r2 > r24 ? 1 : (r2 == r24 ? 0 : -1))
            boolean r3 = X.AnonymousClass7TF.A1P(r4)
            boolean r2 = X.SUX.A01
            if (r2 == 0) goto L_0x02c2
            X.SUX.A0A(r8, r0, r3)
            goto L_0x0134
        L_0x02c2:
            X.SUX.A0B(r8, r0, r3)
            goto L_0x0134
        L_0x02c7:
            r5 = 5
            if (r7 != r5) goto L_0x0099
            int r5 = r2 + 4
            r9 = r9 | r16
            int r3 = X.STo.A08(r3, r2)
        L_0x02d2:
            r14.putInt(r8, r0, r3)
            goto L_0x0134
        L_0x02d7:
            r5 = r22
            if (r7 != r5) goto L_0x0099
            int r5 = r2 + 8
            r16 = r16 | r9
            long r2 = X.Pxk.A07(r3, r2)
            goto L_0x02ee
        L_0x02e4:
            if (r7 != 0) goto L_0x0099
            r16 = r16 | r9
            int r5 = X.STo.A06(r4, r3, r2)
            long r2 = r4.A01
        L_0x02ee:
            r7 = r14
            r9 = r0
            r11 = r2
            r7.putLong(r8, r9, r11)
        L_0x02f4:
            r9 = r16
            goto L_0x0134
        L_0x02f8:
            r5 = 5
            if (r7 != r5) goto L_0x0099
            int r5 = r2 + 4
            r9 = r9 | r16
            int r2 = X.STo.A08(r3, r2)
            float r3 = java.lang.Float.intBitsToFloat(r2)
            X.S6m r2 = X.SUX.A00
            r2.A03(r8, r0, r3)
            goto L_0x0134
        L_0x030e:
            r5 = r22
            if (r7 != r5) goto L_0x0099
            int r5 = r2 + 8
            r9 = r9 | r16
            long r2 = X.Pxk.A07(r3, r2)
            double r25 = java.lang.Double.longBitsToDouble(r2)
            X.S6m r21 = X.SUX.A00
            r22 = r8
            r23 = r0
            r21.A02(r22, r23, r25)
            goto L_0x0134
        L_0x0329:
            long r5 = (long) r5
            int r9 = r14.getInt(r8, r5)
            goto L_0x0105
        L_0x0330:
            r5 = 27
            if (r6 != r5) goto L_0x0385
            r5 = 2
            if (r7 != r5) goto L_0x0099
            java.lang.Object r6 = r14.getObject(r8, r0)
            X.TnX r6 = (X.C13981TnX) r6
            r5 = r6
            X.TRq r5 = (X.C13250TRq) r5
            boolean r5 = r5.A00
            if (r5 != 0) goto L_0x0355
            int r7 = r6.size()
            r5 = 10
            if (r7 == 0) goto L_0x034e
            int r7 = r7 + r7
            r5 = r7
        L_0x034e:
            X.TnX r6 = r6.FPV(r5)
            r14.putObject(r8, r0, r6)
        L_0x0355:
            X.Ti0 r7 = r12.A01(r13)
        L_0x0359:
            X.QuF r0 = r7.FPU()
            r21 = r4
            r22 = r7
            r23 = r0
            r24 = r3
            r25 = r2
            r26 = r33
            int r5 = X.STo.A00(r21, r22, r23, r24, r25, r26)
            r7.FPf(r0)
            r4.A02 = r0
            r6.add(r0)
            r0 = r33
            if (r5 >= r0) goto L_0x0134
            int r2 = X.STo.A05(r4, r3, r5)
            int r1 = r4.A00
            r0 = r17
            if (r0 == r1) goto L_0x0359
            goto L_0x0134
        L_0x0385:
            r5 = 49
            if (r6 > r5) goto L_0x05b2
            r5 = r28
            long r5 = (long) r5
            r15 = r5
            java.lang.Object r6 = r14.getObject(r8, r0)
            X.TnX r6 = (X.C13981TnX) r6
            r5 = r6
            X.TRq r5 = (X.C13250TRq) r5
            boolean r5 = r5.A00
            if (r5 != 0) goto L_0x03ab
            int r11 = r6.size()
            r5 = 10
            if (r11 == 0) goto L_0x03a4
            int r11 = r11 + r11
            r5 = r11
        L_0x03a4:
            X.TnX r6 = r6.FPV(r5)
            r14.putObject(r8, r0, r6)
        L_0x03ab:
            switch(r27) {
                case 18: goto L_0x0547;
                case 19: goto L_0x052e;
                case 20: goto L_0x0510;
                case 21: goto L_0x0510;
                case 22: goto L_0x056d;
                case 23: goto L_0x04f7;
                case 24: goto L_0x04de;
                case 25: goto L_0x04c0;
                case 26: goto L_0x0459;
                case 27: goto L_0x03ae;
                case 28: goto L_0x0416;
                case 29: goto L_0x056d;
                case 30: goto L_0x058e;
                case 31: goto L_0x04de;
                case 32: goto L_0x04f7;
                case 33: goto L_0x03f8;
                case 34: goto L_0x03da;
                case 35: goto L_0x0547;
                case 36: goto L_0x052e;
                case 37: goto L_0x0510;
                case 38: goto L_0x0510;
                case 39: goto L_0x056d;
                case 40: goto L_0x04f7;
                case 41: goto L_0x04de;
                case 42: goto L_0x04c0;
                case 43: goto L_0x056d;
                case 44: goto L_0x058e;
                case 45: goto L_0x04de;
                case 46: goto L_0x04f7;
                case 47: goto L_0x03f8;
                case 48: goto L_0x03da;
                default: goto L_0x03ae;
            }
        L_0x03ae:
            r0 = r30
            if (r7 != r0) goto L_0x0095
            r0 = r17 & -8
            r27 = r0 | 4
            X.Ti0 r23 = r12.A01(r13)
            r22 = r4
            r24 = r3
            r25 = r2
            r26 = r33
        L_0x03c2:
            int r5 = X.STo.A02(r22, r23, r24, r25, r26, r27)
            java.lang.Object r0 = r4.A02
            r6.add(r0)
            r0 = r33
            if (r5 >= r0) goto L_0x0096
            int r25 = X.STo.A05(r4, r3, r5)
            int r1 = r4.A00
            r0 = r17
            if (r0 != r1) goto L_0x0096
            goto L_0x03c2
        L_0x03da:
            r0 = 2
            if (r7 != r0) goto L_0x03ee
            int r5 = X.STo.A05(r4, r3, r2)
            int r0 = r4.A00
            int r0 = r0 + r5
            if (r5 >= r0) goto L_0x0558
            X.STo.A06(r4, r3, r5)
            java.lang.NullPointerException r0 = X.Pxh.A0c()
            throw r0
        L_0x03ee:
            if (r7 != 0) goto L_0x0095
            X.STo.A06(r4, r3, r2)
            java.lang.NullPointerException r0 = X.Pxh.A0c()
            throw r0
        L_0x03f8:
            r0 = 2
            if (r7 != r0) goto L_0x040c
            int r5 = X.STo.A05(r4, r3, r2)
            int r0 = r4.A00
            int r0 = r0 + r5
            if (r5 >= r0) goto L_0x0558
            X.STo.A05(r4, r3, r5)
            java.lang.NullPointerException r0 = X.Pxh.A0c()
            throw r0
        L_0x040c:
            if (r7 != 0) goto L_0x0095
            X.STo.A05(r4, r3, r2)
            java.lang.NullPointerException r0 = X.Pxh.A0c()
            throw r0
        L_0x0416:
            r0 = 2
            if (r7 != r0) goto L_0x0095
            int r5 = X.STo.A05(r4, r3, r2)
            int r10 = r4.A00
            if (r10 < 0) goto L_0x0760
            int r7 = r3.length
        L_0x0422:
            int r0 = r7 - r5
            if (r10 > r0) goto L_0x0755
            if (r10 != 0) goto L_0x0444
            X.TAN r0 = X.TAN.A01
            r6.add(r0)
        L_0x042d:
            r0 = r33
            if (r5 >= r0) goto L_0x0096
            int r10 = X.STo.A05(r4, r3, r5)
            int r1 = r4.A00
            r0 = r17
            if (r0 != r1) goto L_0x0096
            int r5 = X.STo.A05(r4, r3, r10)
            int r10 = r4.A00
            if (r10 < 0) goto L_0x0760
            goto L_0x0422
        L_0x0444:
            int r0 = r5 + r10
            X.TAN.A00(r5, r0, r7)
            byte[] r1 = new byte[r10]
            r0 = 0
            java.lang.System.arraycopy(r3, r5, r1, r0, r10)
            X.QuH r0 = new X.QuH
            r0.<init>(r1)
            r6.add(r0)
            int r5 = r5 + r10
            goto L_0x042d
        L_0x0459:
            r0 = 2
            if (r7 != r0) goto L_0x0095
            r0 = 536870912(0x20000000, double:2.652494739E-315)
            long r15 = r15 & r0
            int r0 = (r15 > r24 ? 1 : (r15 == r24 ? 0 : -1))
            int r5 = X.STo.A05(r4, r3, r2)
            if (r0 != 0) goto L_0x048f
        L_0x0468:
            int r1 = r4.A00
            if (r1 < 0) goto L_0x076a
            if (r1 != 0) goto L_0x0484
            r6.add(r10)
        L_0x0471:
            r0 = r33
            if (r5 >= r0) goto L_0x0096
            int r7 = X.STo.A05(r4, r3, r5)
            int r1 = r4.A00
            r0 = r17
            if (r0 != r1) goto L_0x0096
            int r5 = X.STo.A05(r4, r3, r7)
            goto L_0x0468
        L_0x0484:
            java.nio.charset.Charset r0 = X.C10132Rn9.A03
            java.lang.String r0 = X.Pxe.A11(r0, r3, r5, r1)
            r6.add(r0)
            int r5 = r5 + r1
            goto L_0x0471
        L_0x048f:
            int r7 = r4.A00
            if (r7 < 0) goto L_0x076a
            if (r7 != 0) goto L_0x04ab
            r6.add(r10)
        L_0x0498:
            r0 = r33
            if (r5 >= r0) goto L_0x0096
            int r7 = X.STo.A05(r4, r3, r5)
            int r1 = r4.A00
            r0 = r17
            if (r0 != r1) goto L_0x0096
            int r5 = X.STo.A05(r4, r3, r7)
            goto L_0x048f
        L_0x04ab:
            int r1 = r5 + r7
            X.Rzr r0 = X.C9991Rkl.A00
            boolean r0 = r0.A00(r3, r5, r1)
            if (r0 == 0) goto L_0x077f
            java.nio.charset.Charset r0 = X.C10132Rn9.A03
            java.lang.String r0 = X.Pxe.A11(r0, r3, r5, r7)
            r6.add(r0)
            r5 = r1
            goto L_0x0498
        L_0x04c0:
            r0 = 2
            if (r7 != r0) goto L_0x04d4
            int r5 = X.STo.A05(r4, r3, r2)
            int r0 = r4.A00
            int r0 = r0 + r5
            if (r5 >= r0) goto L_0x0558
            X.STo.A06(r4, r3, r5)
            java.lang.NullPointerException r0 = X.Pxh.A0c()
            throw r0
        L_0x04d4:
            if (r7 != 0) goto L_0x0095
            X.STo.A06(r4, r3, r2)
            java.lang.NullPointerException r0 = X.Pxh.A0c()
            throw r0
        L_0x04de:
            r0 = 2
            if (r7 != r0) goto L_0x04ef
            int r5 = X.STo.A05(r4, r3, r2)
            int r0 = r4.A00
            int r0 = r0 + r5
            if (r5 >= r0) goto L_0x0558
            java.lang.NullPointerException r0 = X.Pxh.A0c()
            throw r0
        L_0x04ef:
            r0 = 5
            if (r7 != r0) goto L_0x0095
            java.lang.NullPointerException r0 = X.Pxh.A0c()
            throw r0
        L_0x04f7:
            r0 = 2
            if (r7 != r0) goto L_0x0508
            int r5 = X.STo.A05(r4, r3, r2)
            int r0 = r4.A00
            int r0 = r0 + r5
            if (r5 >= r0) goto L_0x0558
            java.lang.NullPointerException r0 = X.Pxh.A0c()
            throw r0
        L_0x0508:
            r0 = 1
            if (r7 != r0) goto L_0x0095
            java.lang.NullPointerException r0 = X.Pxh.A0c()
            throw r0
        L_0x0510:
            r0 = 2
            if (r7 != r0) goto L_0x0524
            int r5 = X.STo.A05(r4, r3, r2)
            int r0 = r4.A00
            int r0 = r0 + r5
            if (r5 >= r0) goto L_0x0558
            X.STo.A06(r4, r3, r5)
            java.lang.NullPointerException r0 = X.Pxh.A0c()
            throw r0
        L_0x0524:
            if (r7 != 0) goto L_0x0095
            X.STo.A06(r4, r3, r2)
            java.lang.NullPointerException r0 = X.Pxh.A0c()
            throw r0
        L_0x052e:
            r0 = 2
            if (r7 != r0) goto L_0x053f
            int r5 = X.STo.A05(r4, r3, r2)
            int r0 = r4.A00
            int r0 = r0 + r5
            if (r5 >= r0) goto L_0x0558
            java.lang.NullPointerException r0 = X.Pxh.A0c()
            throw r0
        L_0x053f:
            r0 = 5
            if (r7 != r0) goto L_0x0095
            java.lang.NullPointerException r0 = X.Pxh.A0c()
            throw r0
        L_0x0547:
            r0 = 2
            if (r7 != r0) goto L_0x0565
            int r5 = X.STo.A05(r4, r3, r2)
            int r0 = r4.A00
            int r0 = r0 + r5
            if (r5 >= r0) goto L_0x0558
            java.lang.NullPointerException r0 = X.Pxh.A0c()
            throw r0
        L_0x0558:
            if (r5 == r0) goto L_0x0096
            r0 = 13
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.RCZ r0 = X.RCZ.A00(r0)
            throw r0
        L_0x0565:
            r0 = 1
            if (r7 != r0) goto L_0x0095
            java.lang.NullPointerException r0 = X.Pxh.A0c()
            throw r0
        L_0x056d:
            r0 = 2
            if (r7 != r0) goto L_0x05a8
            int r5 = X.STo.A05(r4, r3, r2)
            int r0 = r4.A00
            int r0 = r0 + r5
            if (r5 >= r0) goto L_0x0581
            X.STo.A05(r4, r3, r5)
            java.lang.NullPointerException r0 = X.Pxh.A0c()
            throw r0
        L_0x0581:
            if (r5 == r0) goto L_0x0096
            r0 = 13
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.RCZ r0 = X.RCZ.A00(r0)
            throw r0
        L_0x058e:
            r0 = 2
            if (r7 != r0) goto L_0x05a8
            int r5 = X.STo.A05(r4, r3, r2)
            int r0 = r4.A00
            int r0 = r0 + r5
            if (r5 >= r0) goto L_0x05a2
            X.STo.A05(r4, r3, r5)
            java.lang.NullPointerException r0 = X.Pxh.A0c()
            throw r0
        L_0x05a2:
            if (r5 != r0) goto L_0x0774
            X.RfN r0 = X.C11162SCw.A01
            goto L_0x0096
        L_0x05a8:
            if (r7 != 0) goto L_0x0095
            X.STo.A05(r4, r3, r2)
            java.lang.NullPointerException r0 = X.Pxh.A0c()
            throw r0
        L_0x05b2:
            r5 = 50
            if (r6 != r5) goto L_0x008a
            r5 = 2
            if (r7 != r5) goto L_0x0099
            r14.getObject(r8, r0)
            java.lang.NullPointerException r0 = X.Pxh.A0c()
            throw r0
        L_0x05c1:
            r13 = 0
            goto L_0x0099
        L_0x05c4:
            r0 = r30
            if (r7 != r0) goto L_0x0095
            r0 = r17 & -8
            r28 = r0 | 4
            r0 = r20
            java.lang.Object r6 = r12.A02(r0, r13, r8)
            X.Ti0 r23 = r12.A01(r13)
            r22 = r4
            r24 = r6
            r25 = r3
            r26 = r2
            r27 = r33
            int r5 = X.STo.A01(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0646
        L_0x05e5:
            if (r7 != 0) goto L_0x0095
            int r5 = X.STo.A06(r4, r3, r2)
            long r10 = r4.A01
            r15 = 1
            long r15 = r15 & r10
            r6 = 1
            long r10 = r10 >>> r6
            long r6 = -r15
            long r10 = r10 ^ r6
            java.lang.Long r6 = java.lang.Long.valueOf(r10)
            goto L_0x0618
        L_0x05f9:
            if (r7 != 0) goto L_0x0095
            int r5 = X.STo.A05(r4, r3, r2)
            int r7 = r4.A00
            r6 = r7 & 1
            int r7 = r7 >>> 1
            int r6 = -r6
            r7 = r7 ^ r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            goto L_0x0626
        L_0x060c:
            if (r7 != 0) goto L_0x0095
            int r5 = X.STo.A05(r4, r3, r2)
            int r6 = r4.A00
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
        L_0x0618:
            r14.putObject(r8, r0, r6)
            goto L_0x06f0
        L_0x061d:
            r5 = 2
            if (r7 != r5) goto L_0x0095
            int r5 = X.STo.A04(r4, r3, r2)
            java.lang.Object r6 = r4.A02
        L_0x0626:
            r14.putObject(r8, r0, r6)
            goto L_0x06f0
        L_0x062b:
            r0 = 2
            if (r7 != r0) goto L_0x0095
            r0 = r20
            java.lang.Object r6 = r12.A02(r0, r13, r8)
            X.Ti0 r23 = r12.A01(r13)
            r22 = r4
            r24 = r6
            r25 = r3
            r26 = r2
            r27 = r33
            int r5 = X.STo.A00(r22, r23, r24, r25, r26, r27)
        L_0x0646:
            r0 = r11[r29]
            r0 = r0 & r15
            long r0 = (long) r0
            r14.putObject(r8, r0, r6)
            r0 = r11[r16]
            r0 = r0 & r15
            long r0 = (long) r0
            r6 = r20
            X.SUX.A07(r8, r0, r6)
            goto L_0x0096
        L_0x0658:
            r5 = 2
            if (r7 != r5) goto L_0x0095
            int r5 = X.STo.A05(r4, r3, r2)
            int r11 = r4.A00
            if (r11 != 0) goto L_0x0668
            r14.putObject(r8, r0, r10)
            goto L_0x06f0
        L_0x0668:
            r28 = r28 & r26
            int r7 = r5 + r11
            if (r28 == 0) goto L_0x0676
            X.Rzr r6 = X.C9991Rkl.A00
            boolean r6 = r6.A00(r3, r5, r7)
            if (r6 == 0) goto L_0x077f
        L_0x0676:
            java.nio.charset.Charset r6 = X.C10132Rn9.A03
            java.lang.String r5 = X.Pxe.A11(r6, r3, r5, r11)
            r14.putObject(r8, r0, r5)
            r5 = r7
            goto L_0x06f0
        L_0x0681:
            if (r7 != 0) goto L_0x0095
            int r5 = X.STo.A06(r4, r3, r2)
            long r6 = r4.A01
            int r10 = (r6 > r24 ? 1 : (r6 == r24 ? 0 : -1))
            boolean r6 = X.AnonymousClass7TF.A1P(r10)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto L_0x06ed
        L_0x0694:
            r5 = 5
            if (r7 != r5) goto L_0x0095
            int r5 = r2 + 4
            int r6 = X.STo.A08(r3, r2)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x06ed
        L_0x06a2:
            r5 = 1
            if (r7 != r5) goto L_0x0095
            int r5 = r2 + 8
            long r6 = X.Pxk.A07(r3, r2)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            goto L_0x06ed
        L_0x06b0:
            if (r7 != 0) goto L_0x0095
            int r5 = X.STo.A05(r4, r3, r2)
            int r6 = r4.A00
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x06ed
        L_0x06bd:
            if (r7 != 0) goto L_0x0095
            int r5 = X.STo.A06(r4, r3, r2)
            long r6 = r4.A01
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            goto L_0x06ed
        L_0x06ca:
            r5 = 5
            if (r7 != r5) goto L_0x0095
            int r5 = r2 + 4
            int r6 = X.STo.A08(r3, r2)
            float r6 = java.lang.Float.intBitsToFloat(r6)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            goto L_0x06ed
        L_0x06dc:
            r5 = 1
            if (r7 != r5) goto L_0x0095
            int r5 = r2 + 8
            long r6 = X.Pxk.A07(r3, r2)
            double r6 = java.lang.Double.longBitsToDouble(r6)
            java.lang.Double r6 = java.lang.Double.valueOf(r6)
        L_0x06ed:
            r14.putObject(r8, r0, r6)
        L_0x06f0:
            r0 = r22
            r6 = r20
            r14.putInt(r8, r0, r6)
            goto L_0x0096
        L_0x06f9:
            r5 = r8
            X.QuF r5 = (X.C8424QuF) r5
            X.SRM r1 = r5.zzc
            X.SRM r0 = X.SRM.A04
            if (r1 != r0) goto L_0x0708
            X.SRM r1 = X.SRM.A00()
            r5.zzc = r1
        L_0x0708:
            r21 = r4
            r22 = r1
            r23 = r3
            r24 = r17
            r25 = r2
            r26 = r33
            int r5 = X.STo.A03(r21, r22, r23, r24, r25, r26)
            r1 = r20
            r19 = r13
            goto L_0x0015
        L_0x071e:
            r0 = r33
            if (r40 != 0) goto L_0x0725
            if (r5 != r0) goto L_0x072e
            return r5
        L_0x0725:
            if (r5 > r0) goto L_0x072e
            r1 = r17
            r0 = r21
            if (r1 != r0) goto L_0x072e
            return r5
        L_0x072e:
            java.lang.String r0 = "Failed to parse the message."
            X.RCZ r0 = X.RCZ.A00(r0)
            throw r0
        L_0x0735:
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            X.RCZ r0 = X.RCZ.A00(r0)
            throw r0
        L_0x073c:
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            X.RCZ r0 = X.RCZ.A00(r0)
            throw r0
        L_0x0743:
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            X.RCZ r0 = X.RCZ.A00(r0)
            throw r0
        L_0x074a:
            java.lang.Object[] r1 = X.Pxh.A1a(r10, r5, r6)
            java.lang.String r0 = "buffer length=%d, index=%d, size=%d"
            java.lang.ArrayIndexOutOfBoundsException r0 = X.Pxf.A0V(r0, r1)
            throw r0
        L_0x0755:
            r0 = 13
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.RCZ r0 = X.RCZ.A00(r0)
            throw r0
        L_0x0760:
            r0 = 6
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.RCZ r0 = X.RCZ.A00(r0)
            throw r0
        L_0x076a:
            r0 = 6
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.RCZ r0 = X.RCZ.A00(r0)
            throw r0
        L_0x0774:
            r0 = 13
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.RCZ r0 = X.RCZ.A00(r0)
            throw r0
        L_0x077f:
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            X.RCZ r0 = X.RCZ.A00(r0)
            throw r0
        L_0x0786:
            java.lang.String r0 = java.lang.String.valueOf(r8)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "Mutating immutable message: "
            java.lang.String r0 = r0.concat(r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Sy4.A09(X.SFD, java.lang.Object, byte[], int, int, int):int");
    }
}

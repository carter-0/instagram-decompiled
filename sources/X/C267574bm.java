package X;

import com.instagram.react.modules.base.IgReactQEModule;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: X.4bm  reason: invalid class name and case insensitive filesystem */
public final class C267574bm extends 17Z {
    public static final int A0E;
    public int A00;
    public C249933kc A01;
    public 17b A02;
    public SPE A03;
    public SPE A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public int A08;
    public 16K A09;
    public Object A0A;
    public Object A0B;
    public boolean A0C;
    public boolean A0D = false;

    public final boolean A0T() {
        return true;
    }

    public final void flush() {
    }

    private void A01(16F r4, 16L r5) {
        16L r0;
        if (this.A07) {
            A00(r4);
        }
        switch (r5.ordinal()) {
            case 6:
                A0J(r4.A0V());
                return;
            case 7:
                if (r4.A0u()) {
                    A0z(r4.A1T(), r4.A1C(), r4.A1B());
                    return;
                } else {
                    A0t(r4.A1P());
                    return;
                }
            case 8:
                int intValue = r4.A0n().intValue();
                if (intValue == 0) {
                    A0g(r4.A0i());
                    return;
                } else if (intValue != 2) {
                    A0h(r4.A0j());
                    return;
                } else {
                    A0v(r4.A0s());
                    return;
                }
            case 9:
                if (this.A0C) {
                    A0u(r4.A0r());
                    return;
                }
                A16(16L.A0H, r4.A0o());
                return;
            case 10:
                r0 = 16L.A0K;
                break;
            case 11:
                r0 = 16L.A0F;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                A0a();
                return;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Internal error: unexpected token: ");
                sb.append(r5);
                throw new RuntimeException(sb.toString());
        }
        A15(r0);
    }

    public final C249933kc A0D() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ 17b A0E() {
        return this.A02;
    }

    public final void A0G(Object obj) {
        A16(16L.A0E, obj);
    }

    public final void A0H(Object obj) {
        this.A0A = obj;
        this.A0D = true;
    }

    public final void A0I(Object obj) {
        this.A0B = obj;
        this.A0D = true;
    }

    public final void A0J(Object obj) {
        C249933kc r0;
        if (obj == null) {
            A0a();
        } else if (obj.getClass() == byte[].class || (obj instanceof C12438SuU) || (r0 = this.A01) == null) {
            A16(16L.A0E, obj);
        } else {
            r0.A06(this, obj);
        }
    }

    public final void A0K(Object obj, int i) {
        this.A02.A05();
        A14(16L.A0D);
        this.A02 = this.A02.A0A(obj);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.SuU, java.lang.Object] */
    public final void A0M(String str) {
        16L r1 = 16L.A0E;
        ? obj = new Object();
        obj.A00 = str;
        A16(r1, obj);
    }

    public final boolean A0U() {
        return this.A05;
    }

    public final boolean A0V() {
        return this.A06;
    }

    public final boolean A0W(15u r3) {
        if ((r3.A00 & this.A08) != 0) {
            return true;
        }
        return false;
    }

    public final int A0X(C268974eN r2, InputStream inputStream, int i) {
        throw new UnsupportedOperationException();
    }

    public final void A0Y() {
        16L r1 = 16L.A08;
        SPE spe = this.A04;
        int i = this.A00;
        SPE A012 = spe.A01(r1, i);
        int i2 = 1;
        if (A012 == null) {
            i2 = i + 1;
        } else {
            this.A04 = A012;
        }
        this.A00 = i2;
        17b r0 = this.A02.A05;
        if (r0 != null) {
            this.A02 = r0;
        }
    }

    public final void A0Z() {
        16L r1 = 16L.A09;
        SPE spe = this.A04;
        int i = this.A00;
        SPE A012 = spe.A01(r1, i);
        int i2 = 1;
        if (A012 == null) {
            i2 = i + 1;
        } else {
            this.A04 = A012;
        }
        this.A00 = i2;
        17b r0 = this.A02.A05;
        if (r0 != null) {
            this.A02 = r0;
        }
    }

    public final void A0a() {
        A15(16L.A0G);
    }

    public final void A0b() {
        this.A02.A05();
        A14(16L.A0C);
        this.A02 = this.A02.A07();
    }

    public final void A0c() {
        this.A02.A05();
        A14(16L.A0D);
        this.A02 = this.A02.A08();
    }

    public final void A0d(char c) {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    public final void A0e(double d) {
        A16(16L.A0H, Double.valueOf(d));
    }

    public final void A0f(float f) {
        A16(16L.A0H, Float.valueOf(f));
    }

    public final void A0g(int i) {
        A16(16L.A0I, Integer.valueOf(i));
    }

    public final void A0h(long j) {
        A16(16L.A0I, Long.valueOf(j));
    }

    public final void A0i(C268974eN r3, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        A0J(bArr2);
    }

    public final void A0k(15z r3) {
        this.A02.A06(((15y) r3).A03);
        A18(r3);
    }

    public final void A0l(15z r3) {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    public final void A0m(15z r2) {
        if (r2 == null) {
            A0a();
        } else {
            A16(16L.A0J, r2);
        }
    }

    public final void A0n(Object obj) {
        this.A02.A05();
        A14(16L.A0C);
        this.A02 = this.A02.A09(obj);
    }

    public final void A0o(Object obj) {
        this.A02.A05();
        A14(16L.A0D);
        this.A02 = this.A02.A0A(obj);
    }

    public final void A0p(Object obj, int i) {
        this.A02.A05();
        A14(16L.A0C);
        this.A02 = this.A02.A09(obj);
    }

    public final void A0q(String str) {
        this.A02.A06(str);
        A18(str);
    }

    public final void A0r(String str) {
        A16(16L.A0H, str);
    }

    public final void A0s(String str) {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    public final void A0t(String str) {
        if (str == null) {
            A0a();
        } else {
            A16(16L.A0J, str);
        }
    }

    public final void A0u(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            A0a();
        } else {
            A16(16L.A0H, bigDecimal);
        }
    }

    public final void A0v(BigInteger bigInteger) {
        if (bigInteger == null) {
            A0a();
        } else {
            A16(16L.A0I, bigInteger);
        }
    }

    public final void A0w(short s) {
        A16(16L.A0I, Short.valueOf(s));
    }

    public final void A0x(boolean z) {
        16L r0;
        if (z) {
            r0 = 16L.A0K;
        } else {
            r0 = 16L.A0F;
        }
        A15(r0);
    }

    public final void A0y(char[] cArr, int i, int i2) {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    public final void A0z(char[] cArr, int i, int i2) {
        A0t(new String(cArr, i, i2));
    }

    public final C8146Qhf A10(16F r8) {
        BigDecimal bigDecimal = 16E.A01;
        SPE spe = this.A03;
        C8146Qhf qhf = new C8146Qhf(this.A09, r8.A1K(), spe, this.A06, this.A05);
        qhf.A01 = r8.A1I();
        return qhf;
    }

    public final C8146Qhf A11(C249933kc r7) {
        return new C8146Qhf(this.A09, r7, this.A03, this.A06, this.A05);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r2.A02 == null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r2.A02 == null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A12(X.17Z r10) {
        /*
            r9 = this;
            X.SPE r2 = r9.A03
            boolean r6 = r9.A07
            r5 = 1
            r4 = 0
            if (r6 == 0) goto L_0x000d
            java.util.TreeMap r0 = r2.A02
            r8 = 1
            if (r0 != 0) goto L_0x000e
        L_0x000d:
            r8 = 0
        L_0x000e:
            r3 = -1
        L_0x000f:
            int r3 = r3 + 1
            r0 = 16
            if (r3 < r0) goto L_0x0022
            X.SPE r2 = r2.A01
            if (r2 == 0) goto L_0x017a
            if (r6 == 0) goto L_0x0020
            java.util.TreeMap r0 = r2.A02
            r8 = 1
            if (r0 != 0) goto L_0x0021
        L_0x0020:
            r8 = 0
        L_0x0021:
            r3 = 0
        L_0x0022:
            long r0 = r2.A00
            if (r3 <= 0) goto L_0x0029
            int r7 = r3 << 2
            long r0 = r0 >> r7
        L_0x0029:
            int r7 = (int) r0
            r1 = r7 & 15
            X.16L[] r0 = X.SPE.A04
            r7 = r0[r1]
            if (r7 == 0) goto L_0x017a
            if (r8 == 0) goto L_0x005c
            java.util.TreeMap r1 = r2.A02
            if (r1 == 0) goto L_0x0049
            int r0 = r3 + r3
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x0049
            r10.A0H(r0)
        L_0x0049:
            java.util.TreeMap r1 = r2.A02
            if (r1 == 0) goto L_0x005c
            int r0 = r3 + r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x005c
            r10.A0I(r0)
        L_0x005c:
            int r0 = r7.ordinal()
            switch(r0) {
                case 1: goto L_0x00c1;
                case 2: goto L_0x00bc;
                case 3: goto L_0x00b7;
                case 4: goto L_0x00b2;
                case 5: goto L_0x014a;
                case 6: goto L_0x00c6;
                case 7: goto L_0x0134;
                case 8: goto L_0x00f8;
                case 9: goto L_0x006b;
                case 10: goto L_0x00ad;
                case 11: goto L_0x00a8;
                case 12: goto L_0x00a3;
                default: goto L_0x0063;
            }
        L_0x0063:
            java.lang.String r1 = "Internal error: should never end up through this code path"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x006b:
            java.lang.Object[] r0 = r2.A03
            r1 = r0[r3]
            boolean r0 = r1 instanceof java.lang.Double
            if (r0 == 0) goto L_0x007d
            java.lang.Number r1 = (java.lang.Number) r1
            double r0 = r1.doubleValue()
            r10.A0e(r0)
            goto L_0x000f
        L_0x007d:
            boolean r0 = r1 instanceof java.math.BigDecimal
            if (r0 == 0) goto L_0x0087
            java.math.BigDecimal r1 = (java.math.BigDecimal) r1
            r10.A0u(r1)
            goto L_0x000f
        L_0x0087:
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 == 0) goto L_0x0096
            java.lang.Number r1 = (java.lang.Number) r1
            float r0 = r1.floatValue()
            r10.A0f(r0)
            goto L_0x000f
        L_0x0096:
            if (r1 == 0) goto L_0x00a3
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0160
            java.lang.String r1 = (java.lang.String) r1
            r10.A0r(r1)
            goto L_0x000f
        L_0x00a3:
            r10.A0a()
            goto L_0x000f
        L_0x00a8:
            r10.A0x(r4)
            goto L_0x000f
        L_0x00ad:
            r10.A0x(r5)
            goto L_0x000f
        L_0x00b2:
            r10.A0Y()
            goto L_0x000f
        L_0x00b7:
            r10.A0b()
            goto L_0x000f
        L_0x00bc:
            r10.A0Z()
            goto L_0x000f
        L_0x00c1:
            r10.A0c()
            goto L_0x000f
        L_0x00c6:
            java.lang.Object[] r0 = r2.A03
            r1 = r0[r3]
            boolean r0 = r1 instanceof X.C12438SuU
            if (r0 == 0) goto L_0x00ea
            X.SuU r1 = (X.C12438SuU) r1
            java.lang.Object r1 = r1.A00
            boolean r0 = r1 instanceof X.C252523pF
            if (r0 != 0) goto L_0x00f3
            boolean r0 = r1 instanceof X.15z
            if (r0 == 0) goto L_0x00e1
            X.15z r1 = (X.15z) r1
            r10.A0j(r1)
            goto L_0x000f
        L_0x00e1:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            r10.A0M(r0)
            goto L_0x000f
        L_0x00ea:
            boolean r0 = r1 instanceof X.C252523pF
            if (r0 != 0) goto L_0x00f3
            r10.A0G(r1)
            goto L_0x000f
        L_0x00f3:
            r10.A0J(r1)
            goto L_0x000f
        L_0x00f8:
            java.lang.Object[] r0 = r2.A03
            r1 = r0[r3]
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0129
            boolean r0 = r1 instanceof java.math.BigInteger
            if (r0 == 0) goto L_0x010b
            java.math.BigInteger r1 = (java.math.BigInteger) r1
            r10.A0v(r1)
            goto L_0x000f
        L_0x010b:
            boolean r0 = r1 instanceof java.lang.Long
            if (r0 == 0) goto L_0x011a
            java.lang.Number r1 = (java.lang.Number) r1
            long r0 = r1.longValue()
            r10.A0h(r0)
            goto L_0x000f
        L_0x011a:
            boolean r0 = r1 instanceof java.lang.Short
            if (r0 == 0) goto L_0x0129
            java.lang.Number r1 = (java.lang.Number) r1
            short r0 = r1.shortValue()
            r10.A0w(r0)
            goto L_0x000f
        L_0x0129:
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r1.intValue()
            r10.A0g(r0)
            goto L_0x000f
        L_0x0134:
            java.lang.Object[] r0 = r2.A03
            r1 = r0[r3]
            boolean r0 = r1 instanceof X.15z
            if (r0 == 0) goto L_0x0143
            X.15z r1 = (X.15z) r1
            r10.A0m(r1)
            goto L_0x000f
        L_0x0143:
            java.lang.String r1 = (java.lang.String) r1
            r10.A0t(r1)
            goto L_0x000f
        L_0x014a:
            java.lang.Object[] r0 = r2.A03
            r1 = r0[r3]
            boolean r0 = r1 instanceof X.15z
            if (r0 == 0) goto L_0x0159
            X.15z r1 = (X.15z) r1
            r10.A0k(r1)
            goto L_0x000f
        L_0x0159:
            java.lang.String r1 = (java.lang.String) r1
            r10.A0q(r1)
            goto L_0x000f
        L_0x0160:
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Unrecognized value type for VALUE_NUMBER_FLOAT: %s, cannot serialize"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r9.A0L(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C267574bm.A12(X.17Z):void");
    }

    public final void A14(16L r5) {
        SPE A012;
        boolean z = this.A0D;
        SPE spe = this.A04;
        int i = this.A00;
        if (z) {
            A012 = spe.A03(r5, this.A0A, this.A0B, i);
        } else {
            A012 = spe.A01(r5, i);
        }
        int i2 = 1;
        if (A012 == null) {
            i2 = this.A00 + 1;
        } else {
            this.A04 = A012;
        }
        this.A00 = i2;
    }

    public final void A15(16L r5) {
        SPE A012;
        this.A02.A05();
        boolean z = this.A0D;
        SPE spe = this.A04;
        int i = this.A00;
        if (z) {
            A012 = spe.A03(r5, this.A0A, this.A0B, i);
        } else {
            A012 = spe.A01(r5, i);
        }
        int i2 = 1;
        if (A012 == null) {
            i2 = this.A00 + 1;
        } else {
            this.A04 = A012;
        }
        this.A00 = i2;
    }

    public final void A16(16L r8, Object obj) {
        SPE A022;
        this.A02.A05();
        boolean z = this.A0D;
        16L r2 = r8;
        Object obj2 = obj;
        SPE spe = this.A04;
        if (z) {
            A022 = spe.A04(r2, obj2, this.A0A, this.A0B, this.A00);
        } else {
            A022 = spe.A02(r8, obj, this.A00);
        }
        int i = 1;
        if (A022 == null) {
            i = this.A00 + 1;
        } else {
            this.A04 = A022;
        }
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r1 != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A17(X.C267574bm r3) {
        /*
            r2 = this;
            boolean r0 = r2.A06
            if (r0 != 0) goto L_0x0008
            boolean r0 = r3.A06
            r2.A06 = r0
        L_0x0008:
            boolean r1 = r2.A05
            if (r1 != 0) goto L_0x0010
            boolean r1 = r3.A05
            r2.A05 = r1
        L_0x0010:
            if (r0 != 0) goto L_0x0015
            r0 = 0
            if (r1 == 0) goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            r2.A07 = r0
            X.3kc r0 = r3.A01
            X.Qhf r1 = r3.A11(r0)
        L_0x001e:
            X.16L r0 = r1.A1J()
            if (r0 == 0) goto L_0x0028
            r2.A13(r1)
            goto L_0x001e
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C267574bm.A17(X.4bm):void");
    }

    public final void A18(Object obj) {
        SPE A022;
        Object obj2 = obj;
        if (this.A0D) {
            A022 = this.A04.A04(16L.A0A, obj2, this.A0A, this.A0B, this.A00);
        } else {
            A022 = this.A04.A02(16L.A0A, obj, this.A00);
        }
        int i = 1;
        if (A022 == null) {
            i = this.A00 + 1;
        } else {
            this.A04 = A022;
        }
        this.A00 = i;
    }

    public final void close() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r9.A05 != false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r9 = this;
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "[TokenBuffer: "
            r2.append(r0)
            X.3kc r0 = r9.A01
            X.Qhf r8 = r9.A11(r0)
            boolean r0 = r9.A06
            r3 = 0
            if (r0 != 0) goto L_0x001a
            boolean r0 = r9.A05
            r7 = 0
            if (r0 == 0) goto L_0x001b
        L_0x001a:
            r7 = 1
        L_0x001b:
            X.16L r4 = r8.A1J()     // Catch:{ IOException -> 0x00b8 }
            r5 = 100
            if (r4 != 0) goto L_0x0024
            goto L_0x009e
        L_0x0024:
            if (r7 == 0) goto L_0x0075
            X.SPE r1 = r9.A04     // Catch:{ IOException -> 0x00b8 }
            int r0 = r9.A00     // Catch:{ IOException -> 0x00b8 }
            int r0 = r0 + -1
            java.util.TreeMap r1 = r1.A02     // Catch:{ IOException -> 0x00b8 }
            if (r1 != 0) goto L_0x0031
            goto L_0x003d
        L_0x0031:
            int r0 = r0 + r0
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x00b8 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ IOException -> 0x00b8 }
            goto L_0x003e
        L_0x003d:
            r1 = 0
        L_0x003e:
            r6 = 93
            if (r1 == 0) goto L_0x0051
            java.lang.String r0 = "[objectId="
            r2.append(r0)     // Catch:{ IOException -> 0x00b8 }
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x00b8 }
            r2.append(r0)     // Catch:{ IOException -> 0x00b8 }
            r2.append(r6)     // Catch:{ IOException -> 0x00b8 }
        L_0x0051:
            X.SPE r1 = r9.A04     // Catch:{ IOException -> 0x00b8 }
            int r0 = r9.A00     // Catch:{ IOException -> 0x00b8 }
            int r0 = r0 + -1
            java.util.TreeMap r1 = r1.A02     // Catch:{ IOException -> 0x00b8 }
            if (r1 == 0) goto L_0x0075
            int r0 = r0 + r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x00b8 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ IOException -> 0x00b8 }
            if (r1 == 0) goto L_0x0075
            java.lang.String r0 = "[typeId="
            r2.append(r0)     // Catch:{ IOException -> 0x00b8 }
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x00b8 }
            r2.append(r0)     // Catch:{ IOException -> 0x00b8 }
            r2.append(r6)     // Catch:{ IOException -> 0x00b8 }
        L_0x0075:
            if (r3 >= r5) goto L_0x009a
            if (r3 <= 0) goto L_0x007e
            java.lang.String r0 = ", "
            r2.append(r0)     // Catch:{ IOException -> 0x00b8 }
        L_0x007e:
            java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x00b8 }
            r2.append(r0)     // Catch:{ IOException -> 0x00b8 }
            X.16L r0 = X.16L.A0A     // Catch:{ IOException -> 0x00b8 }
            if (r4 != r0) goto L_0x009a
            r0 = 40
            r2.append(r0)     // Catch:{ IOException -> 0x00b8 }
            java.lang.String r0 = r8.A0Y()     // Catch:{ IOException -> 0x00b8 }
            r2.append(r0)     // Catch:{ IOException -> 0x00b8 }
            r0 = 41
            r2.append(r0)     // Catch:{ IOException -> 0x00b8 }
        L_0x009a:
            int r3 = r3 + 1
            goto L_0x001b
        L_0x009e:
            if (r3 < r5) goto L_0x00ae
            java.lang.String r0 = " ... (truncated "
            r2.append(r0)
            int r3 = r3 - r5
            r2.append(r3)
            java.lang.String r0 = " entries)"
            r2.append(r0)
        L_0x00ae:
            r0 = 93
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        L_0x00b8:
            r1 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C267574bm.toString():java.lang.String");
    }

    static {
        int i = 0;
        for (15u r1 : 15u.values()) {
            if (r1.A01) {
                i |= r1.A00;
            }
        }
        A0E = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0038, code lost:
        if (r1 != false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C267574bm(X.16F r4, X.C269674fV r5) {
        /*
            r3 = this;
            r3.<init>()
            r2 = 0
            r3.A0D = r2
            X.3kc r0 = r4.A1K()
            r3.A01 = r0
            X.16K r0 = r4.A0m()
            r3.A09 = r0
            int r0 = A0E
            r3.A08 = r0
            r1 = 0
            X.17b r0 = new X.17b
            r0.<init>(r1, r1, r2)
            r3.A02 = r0
            X.SPE r0 = new X.SPE
            r0.<init>()
            r3.A04 = r0
            r3.A03 = r0
            r3.A00 = r2
            boolean r0 = r4.A0b()
            r3.A06 = r0
            boolean r1 = r4.A0a()
            r3.A05 = r1
            if (r0 != 0) goto L_0x003a
            r0 = 0
            if (r1 == 0) goto L_0x003b
        L_0x003a:
            r0 = 1
        L_0x003b:
            r3.A07 = r0
            if (r5 == 0) goto L_0x0045
            X.4fA r0 = X.C269464fA.USE_BIG_DECIMAL_FOR_FLOATS
            boolean r2 = r5.A0j(r0)
        L_0x0045:
            r3.A0C = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C267574bm.<init>(X.16F, X.4fV):void");
    }

    private final void A00(16F r3) {
        Object A0X = r3.A0X();
        this.A0B = A0X;
        if (A0X != null) {
            this.A0D = true;
        }
        Object A0W = r3.A0W();
        this.A0A = A0W;
        if (A0W != null) {
            this.A0D = true;
        }
    }

    public final 17Z A0C(15u r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A13(16F r6) {
        16L A10 = r6.A10();
        if (A10 == 16L.A0A) {
            if (this.A07) {
                A00(r6);
            }
            A0q(r6.A0Y());
            A10 = r6.A1J();
        } else if (A10 == null) {
            throw new IllegalStateException("No token available from argument `JsonParser`");
        }
        int ordinal = A10.ordinal();
        if (ordinal == 1) {
            if (this.A07) {
                A00(r6);
            }
            A0c();
        } else if (ordinal == 2) {
            A0Z();
            return;
        } else if (ordinal == 3) {
            if (this.A07) {
                A00(r6);
            }
            A0b();
        } else if (ordinal != 4) {
            A01(r6, A10);
            return;
        } else {
            A0Y();
            return;
        }
        int i = 1;
        while (true) {
            16L A1J = r6.A1J();
            if (A1J != null) {
                int ordinal2 = A1J.ordinal();
                if (ordinal2 != 1) {
                    if (ordinal2 == 2) {
                        A0Z();
                    } else if (ordinal2 == 3) {
                        if (this.A07) {
                            A00(r6);
                        }
                        A0b();
                    } else if (ordinal2 == 4) {
                        A0Y();
                    } else if (ordinal2 != 5) {
                        A01(r6, A1J);
                    } else {
                        if (this.A07) {
                            A00(r6);
                        }
                        A0q(r6.A0Y());
                    }
                    i--;
                    if (i == 0) {
                        return;
                    }
                } else {
                    if (this.A07) {
                        A00(r6);
                    }
                    A0c();
                }
                i++;
            } else {
                return;
            }
        }
    }
}

package X;

import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: X.Qhf  reason: case insensitive filesystem */
public final class C8146Qhf extends 16E {
    public int A00;
    public C12837T9j A01 = null;
    public SPE A02;
    public C249933kc A03;
    public C8142Qhb A04;
    public boolean A05;
    public final boolean A06;
    public final boolean A07;
    public transient RD3 A08;

    public C8146Qhf(16K r3, C249933kc r4, SPE spe, boolean z, boolean z2) {
        C8142Qhb qhb;
        this.A00 = 0;
        this.A02 = spe;
        this.A00 = -1;
        this.A03 = r4;
        if (r3 == null) {
            qhb = new C8142Qhb();
        } else {
            qhb = new C8142Qhb(r3, 167.A02);
        }
        this.A04 = qhb;
        this.A07 = z;
        this.A06 = z2;
    }

    public final boolean A0u() {
        return false;
    }

    public final int A1C() {
        return 0;
    }

    public final Object A0V() {
        if (this.A00 != 16L.A0E) {
            return null;
        }
        SPE spe = this.A02;
        return spe.A03[this.A00];
    }

    public final Object A0W() {
        SPE spe = this.A02;
        int i = this.A00;
        TreeMap treeMap = spe.A02;
        if (treeMap == null) {
            return null;
        }
        return C51968G9o.A0z(treeMap, i + i + 1);
    }

    public final Object A0X() {
        SPE spe = this.A02;
        int i = this.A00;
        TreeMap treeMap = spe.A02;
        if (treeMap == null) {
            return null;
        }
        return C51968G9o.A0z(treeMap, i + i);
    }

    public final String A0Y() {
        16L r1 = this.A00;
        if (r1 == 16L.A0D || r1 == 16L.A0C) {
            return this.A04.A03.A03();
        }
        return this.A04.A00;
    }

    public final boolean A0a() {
        return this.A06;
    }

    public final boolean A0b() {
        return this.A07;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r0 < 0) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0i() {
        /*
            r6 = this;
            X.16L r1 = r6.A00
            X.16L r0 = X.16L.A0I
            if (r1 != r0) goto L_0x0085
            X.SPE r0 = r6.A02
            int r1 = r6.A00
            java.lang.Object[] r0 = r0.A03
            r2 = r0[r1]
            java.lang.Number r2 = (java.lang.Number) r2
        L_0x0010:
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x008a
            boolean r0 = r2 instanceof java.lang.Short
            if (r0 != 0) goto L_0x008a
            boolean r0 = r2 instanceof java.lang.Byte
            if (r0 != 0) goto L_0x008a
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 == 0) goto L_0x0036
            long r3 = r2.longValue()
            int r5 = (int) r3
            long r1 = (long) r5
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x008e
        L_0x002a:
            java.lang.String r0 = r6.A1P()
            r6.A1e(r0)
        L_0x0031:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0036:
            boolean r0 = r2 instanceof java.math.BigInteger
            if (r0 == 0) goto L_0x004e
            r1 = r2
            java.math.BigInteger r1 = (java.math.BigInteger) r1
            java.math.BigInteger r0 = X.16E.A07
            int r0 = r0.compareTo(r1)
            if (r0 > 0) goto L_0x002a
            java.math.BigInteger r0 = X.16E.A05
            int r0 = r0.compareTo(r1)
        L_0x004b:
            if (r0 >= 0) goto L_0x008a
            goto L_0x002a
        L_0x004e:
            boolean r0 = r2 instanceof java.lang.Double
            if (r0 != 0) goto L_0x0070
            boolean r0 = r2 instanceof java.lang.Float
            if (r0 != 0) goto L_0x0070
            boolean r0 = r2 instanceof java.math.BigDecimal
            if (r0 == 0) goto L_0x006c
            r1 = r2
            java.math.BigDecimal r1 = (java.math.BigDecimal) r1
            java.math.BigDecimal r0 = X.16E.A03
            int r0 = r0.compareTo(r1)
            if (r0 > 0) goto L_0x002a
            java.math.BigDecimal r0 = X.16E.A01
            int r0 = r0.compareTo(r1)
            goto L_0x004b
        L_0x006c:
            X.16E.A0I()
            goto L_0x0031
        L_0x0070:
            double r3 = r2.doubleValue()
            r1 = -4476578029606273024(0xc1e0000000000000, double:-2.147483648E9)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x002a
            r1 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x002a
            int r5 = (int) r3
            return r5
        L_0x0085:
            java.lang.Number r2 = r6.A0p()
            goto L_0x0010
        L_0x008a:
            int r5 = r2.intValue()
        L_0x008e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8146Qhf.A0i():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r0 < 0) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A0j() {
        /*
            r5 = this;
            X.16L r1 = r5.A00
            X.16L r0 = X.16L.A0I
            if (r1 != r0) goto L_0x0077
            X.SPE r0 = r5.A02
            int r1 = r5.A00
            java.lang.Object[] r0 = r0.A03
            r2 = r0[r1]
            java.lang.Number r2 = (java.lang.Number) r2
        L_0x0010:
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 != 0) goto L_0x007c
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x007c
            boolean r0 = r2 instanceof java.lang.Short
            if (r0 != 0) goto L_0x007c
            boolean r0 = r2 instanceof java.lang.Byte
            if (r0 != 0) goto L_0x007c
            boolean r0 = r2 instanceof java.math.BigInteger
            if (r0 == 0) goto L_0x0043
            r1 = r2
            java.math.BigInteger r1 = (java.math.BigInteger) r1
            java.math.BigInteger r0 = X.16E.A08
            int r0 = r0.compareTo(r1)
            if (r0 > 0) goto L_0x0037
            java.math.BigInteger r0 = X.16E.A06
            int r0 = r0.compareTo(r1)
        L_0x0035:
            if (r0 >= 0) goto L_0x007c
        L_0x0037:
            java.lang.String r0 = r5.A1P()
            r5.A1f(r0)
        L_0x003e:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0043:
            boolean r0 = r2 instanceof java.lang.Double
            if (r0 != 0) goto L_0x0065
            boolean r0 = r2 instanceof java.lang.Float
            if (r0 != 0) goto L_0x0065
            boolean r0 = r2 instanceof java.math.BigDecimal
            if (r0 == 0) goto L_0x0061
            r1 = r2
            java.math.BigDecimal r1 = (java.math.BigDecimal) r1
            java.math.BigDecimal r0 = X.16E.A04
            int r0 = r0.compareTo(r1)
            if (r0 > 0) goto L_0x0037
            java.math.BigDecimal r0 = X.16E.A02
            int r0 = r0.compareTo(r1)
            goto L_0x0035
        L_0x0061:
            X.16E.A0I()
            goto L_0x003e
        L_0x0065:
            double r3 = r2.doubleValue()
            r1 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0037
            r1 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0037
            long r0 = (long) r3
            return r0
        L_0x0077:
            java.lang.Number r2 = r5.A0p()
            goto L_0x0010
        L_0x007c:
            long r0 = r2.longValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8146Qhf.A0j():long");
    }

    public final 16K A0m() {
        return this.A04;
    }

    public final Number A0p() {
        16L r2 = this.A00;
        if (r2 == null || !r2.A02) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Current token (");
            A1A.append(r2);
            throw new 1bD(this, AnonymousClass7TF.A0l(") not numeric, cannot use numeric value accessors", A1A));
        }
        SPE spe = this.A02;
        Object obj = spe.A03[this.A00];
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.indexOf(46) >= 0) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return DbV.A0q(str);
        } else if (obj == null) {
            return null;
        } else {
            throw DbW.A0c("Internal error: entry should be a Number, but is of type ", C66581MXm.A0y(obj));
        }
    }

    public final boolean A0v() {
        boolean isInfinite;
        if (this.A00 != 16L.A0H) {
            return false;
        }
        SPE spe = this.A02;
        Object obj = spe.A03[this.A00];
        if (obj instanceof Double) {
            Double d = (Double) obj;
            if (!d.isNaN()) {
                isInfinite = d.isInfinite();
            }
            return true;
        } else if (!(obj instanceof Float)) {
            return false;
        } else {
            Float f = (Float) obj;
            if (!f.isNaN()) {
                isInfinite = f.isInfinite();
            }
            return true;
        }
        if (isInfinite) {
            return true;
        }
        return false;
    }

    public final C12837T9j A1H() {
        C12837T9j t9j = this.A01;
        if (t9j == null) {
            return C12837T9j.A06;
        }
        return t9j;
    }

    public final C12837T9j A1I() {
        C12837T9j t9j = this.A01;
        if (t9j == null) {
            return C12837T9j.A06;
        }
        return t9j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r3 == null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.16L A1J() {
        /*
            r5 = this;
            boolean r0 = r5.A05
            r1 = 0
            if (r0 != 0) goto L_0x001c
            X.SPE r3 = r5.A02
            if (r3 == 0) goto L_0x001c
            int r0 = r5.A00
            int r4 = r0 + 1
            r5.A00 = r4
            r0 = 16
            if (r4 < r0) goto L_0x001d
            r4 = 0
            r5.A00 = r4
            X.SPE r3 = r3.A01
            r5.A02 = r3
            if (r3 != 0) goto L_0x001d
        L_0x001c:
            return r1
        L_0x001d:
            long r1 = r3.A00
            if (r4 <= 0) goto L_0x0024
            int r0 = r4 << 2
            long r1 = r1 >> r0
        L_0x0024:
            int r0 = (int) r1
            r1 = r0 & 15
            X.16L[] r0 = X.SPE.A04
            r1 = r0[r1]
            r5.A00 = r1
            X.16L r0 = X.16L.A0A
            if (r1 != r0) goto L_0x0047
            java.lang.Object[] r0 = r3.A03
            r1 = r0[r4]
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0042
            java.lang.String r1 = (java.lang.String) r1
        L_0x003b:
            X.Qhb r0 = r5.A04
            r0.A00 = r1
        L_0x003f:
            X.16L r1 = r5.A00
            return r1
        L_0x0042:
            java.lang.String r1 = r1.toString()
            goto L_0x003b
        L_0x0047:
            X.16L r0 = X.16L.A0D
            if (r1 != r0) goto L_0x005c
            X.Qhb r3 = r5.A04
            int r0 = r3.A00
            int r0 = r0 + 1
            r3.A00 = r0
            r1 = 2
        L_0x0054:
            X.Qhb r2 = new X.Qhb
            r2.<init>((X.C8142Qhb) r3, (int) r1)
        L_0x0059:
            r5.A04 = r2
            goto L_0x003f
        L_0x005c:
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x006a
            X.Qhb r3 = r5.A04
            int r0 = r3.A00
            r1 = 1
            int r0 = r0 + 1
            r3.A00 = r0
            goto L_0x0054
        L_0x006a:
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x007b
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x007b
            X.Qhb r1 = r5.A04
            int r0 = r1.A00
            int r0 = r0 + 1
            r1.A00 = r0
            goto L_0x003f
        L_0x007b:
            X.Qhb r2 = r5.A04
            X.16K r1 = r2.A03
            boolean r0 = r1 instanceof X.C8142Qhb
            if (r0 == 0) goto L_0x0087
            r2 = r1
            X.Qhb r2 = (X.C8142Qhb) r2
            goto L_0x0059
        L_0x0087:
            if (r1 != 0) goto L_0x008f
            X.Qhb r2 = new X.Qhb
            r2.<init>()
            goto L_0x0059
        L_0x008f:
            X.T9j r0 = r2.A02
            X.Qhb r2 = new X.Qhb
            r2.<init>((X.C12837T9j) r0, (X.16K) r1)
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8146Qhf.A1J():X.16L");
    }

    public final C249933kc A1K() {
        return this.A03;
    }

    public final 16H A1L() {
        return 16F.A01;
    }

    public final String A1N() {
        SPE spe;
        String str = null;
        if (!this.A05 && (spe = this.A02) != null) {
            int i = this.A00 + 1;
            if (i < 16) {
                long j = spe.A00;
                if (i > 0) {
                    j >>= i << 2;
                }
                16L r1 = SPE.A04[((int) j) & 15];
                16L r0 = 16L.A0A;
                if (r1 == r0) {
                    this.A00 = i;
                    this.A00 = r0;
                    Object obj = spe.A03[i];
                    if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        str = obj.toString();
                    }
                    this.A04.A00 = str;
                }
            }
            if (A1J() == 16L.A0A) {
                return A0Y();
            }
        }
        return str;
    }

    public final String A1P() {
        Object obj;
        16L r2 = this.A00;
        if (r2 == 16L.A0J || r2 == 16L.A0A) {
            SPE spe = this.A02;
            obj = spe.A03[this.A00];
            if (obj instanceof String) {
                return (String) obj;
            }
        } else if (r2 == null) {
            return null;
        } else {
            int ordinal = r2.ordinal();
            if (ordinal != 8 && ordinal != 9) {
                return r2.A01;
            }
            SPE spe2 = this.A02;
            obj = spe2.A03[this.A00];
        }
        Iterator it = C269574fL.A00;
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public final void A1R(C249933kc r1) {
        this.A03 = r1;
    }

    public final byte[] A1S(C268974eN r4) {
        16L r2 = this.A00;
        if (r2 == 16L.A0E) {
            SPE spe = this.A02;
            Object obj = spe.A03[this.A00];
            if (obj instanceof byte[]) {
                return (byte[]) obj;
            }
        }
        if (r2 == 16L.A0J) {
            String A1P = A1P();
            if (A1P == null) {
                return null;
            }
            RD3 rd3 = this.A08;
            if (rd3 == null) {
                rd3 = new RD3(100);
                this.A08 = rd3;
            } else {
                rd3.A01();
            }
            A1b(r4, rd3, A1P);
            return rd3.A05();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Current token (");
        A1A.append(r2);
        throw new 1bD(this, AnonymousClass7TF.A0l(") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), cannot access as binary", A1A));
    }

    public final void close() {
        if (!this.A05) {
            this.A05 = true;
        }
    }

    public final double A0g() {
        return A0p().doubleValue();
    }

    public final float A0h() {
        return A0p().floatValue();
    }

    public final Integer A0n() {
        Number A0p = A0p();
        if (!(A0p instanceof Integer)) {
            if (A0p instanceof Long) {
                return AnonymousClass05K.A01;
            }
            if (A0p instanceof Double) {
                return AnonymousClass05K.A0Y;
            }
            if (A0p instanceof BigDecimal) {
                return AnonymousClass05K.A0j;
            }
            if (A0p instanceof BigInteger) {
                return AnonymousClass05K.A0C;
            }
            if (A0p instanceof Float) {
                return AnonymousClass05K.A0N;
            }
            if (!(A0p instanceof Short)) {
                return null;
            }
        }
        return AnonymousClass05K.A00;
    }

    public final String A0q() {
        return A0Y();
    }

    public final BigDecimal A0r() {
        Number A0p = A0p();
        if (A0p instanceof BigDecimal) {
            return (BigDecimal) A0p;
        }
        int intValue = A0n().intValue();
        if (intValue != 0) {
            if (intValue == 2) {
                return new BigDecimal((BigInteger) A0p);
            }
            if (intValue != 1) {
                return BigDecimal.valueOf(A0p.doubleValue());
            }
        }
        return BigDecimal.valueOf(A0p.longValue());
    }

    public final BigInteger A0s() {
        Number A0p = A0p();
        if (A0p instanceof BigInteger) {
            return (BigInteger) A0p;
        }
        if (A0n() == AnonymousClass05K.A0j) {
            return ((BigDecimal) A0p).toBigInteger();
        }
        return BigInteger.valueOf(A0p.longValue());
    }

    public final int A1B() {
        String A1P = A1P();
        if (A1P == null) {
            return 0;
        }
        return A1P.length();
    }

    public final int A1F(C268974eN r4, OutputStream outputStream) {
        byte[] A1S = A1S(r4);
        if (A1S == null) {
            return 0;
        }
        int length = A1S.length;
        outputStream.write(A1S, 0, length);
        return length;
    }

    public final char[] A1T() {
        String A1P = A1P();
        if (A1P == null) {
            return null;
        }
        return A1P.toCharArray();
    }

    public final void A1X() {
        16E.A0I();
        throw AnonymousClass00P.createAndThrow();
    }
}

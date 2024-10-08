package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.16L;
import X.2Ob;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass4iD;
import X.AnonymousClass4iJ;
import X.AnonymousClass7TF;
import X.C11287SJg;
import X.C12440SuW;
import X.C12441SuX;
import X.C13901TjO;
import X.C268894eF;
import X.C268964eM;
import X.C269224em;
import X.C269434f7;
import X.C269454f9;
import X.C269464fA;
import X.C269674fV;
import X.C269764fe;
import X.C269784fg;
import X.C65161bE;
import X.C8255Qm9;
import X.C8256QmA;
import X.Pxe;
import X.Qm4;
import X.Qm5;
import X.Qm6;
import X.Qm7;
import X.Qm8;
import X.RDC;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.lang.reflect.Array;
import java.util.Arrays;

public abstract class PrimitiveArrayDeserializers extends StdDeserializer implements C269784fg {
    public final C269764fe A00;
    public final Boolean A01;
    public transient Object A02;

    @JacksonStdImpl
    public final class BooleanDeser extends PrimitiveArrayDeserializers {
        public BooleanDeser() {
            super(boolean[].class);
        }

        /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, X.Qm4] */
        public final /* bridge */ /* synthetic */ Object A0D(16F r6, C269674fV r7) {
            boolean z;
            if (!r6.A16()) {
                return A0y(r6, r7);
            }
            AnonymousClass4iJ A0L = r7.A0L();
            Qm4 qm4 = A0L.A00;
            Qm4 qm42 = qm4;
            if (qm4 == null) {
                ? obj = new Object();
                A0L.A00 = obj;
                qm42 = obj;
            }
            boolean[] zArr = (boolean[]) qm42.A00();
            int i = 0;
            while (true) {
                try {
                    16L A1J = r6.A1J();
                    if (A1J == 16L.A08) {
                        return qm42.A03(zArr, i);
                    }
                    if (A1J == 16L.A0K) {
                        z = true;
                    } else {
                        if (A1J != 16L.A0F) {
                            if (A1J == 16L.A0G) {
                                C269764fe r0 = this.A00;
                                if (r0 != null) {
                                    r0.BWm(r7);
                                } else {
                                    A0s(r7);
                                }
                            } else {
                                z = A0w(r6, r7);
                            }
                        }
                        z = false;
                    }
                    if (i >= zArr.length) {
                        zArr = (boolean[]) qm42.A02(zArr, i);
                        i = 0;
                    }
                    int i2 = i + 1;
                    try {
                        zArr[i] = z;
                        i = i2;
                    } catch (Exception e) {
                        e = e;
                        i = i2;
                    }
                } catch (Exception e2) {
                    e = e2;
                    throw AnonymousClass4iD.A03(zArr, e, qm42.A00 + i);
                }
            }
        }
    }

    @JacksonStdImpl
    public final class ByteDeser extends PrimitiveArrayDeserializers {
        public ByteDeser() {
            super(byte[].class);
        }

        /* JADX WARNING: type inference failed for: r4v3, types: [java.lang.Object, X.Qm5] */
        public final /* bridge */ /* synthetic */ Object A0D(16F r6, C269674fV r7) {
            byte A0N;
            16L A10 = r6.A10();
            if (A10 == 16L.A0J) {
                try {
                    return r6.A1S(r7.A02.A01.A00);
                } catch (C65161bE e) {
                    String A05 = e.A05();
                    if (A05.contains("base64")) {
                        r7.A0e(byte[].class, r6.A1P(), A05, new Object[0]);
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            }
            if (A10 == 16L.A0E) {
                Object A0V = r6.A0V();
                if (A0V == null) {
                    return null;
                }
                if (A0V instanceof byte[]) {
                    return A0V;
                }
            }
            if (!r6.A16()) {
                return A0y(r6, r7);
            }
            AnonymousClass4iJ A0L = r7.A0L();
            Qm5 qm5 = A0L.A01;
            Qm5 qm52 = qm5;
            if (qm5 == null) {
                ? obj = new Object();
                A0L.A01 = obj;
                qm52 = obj;
            }
            byte[] bArr = (byte[]) qm52.A00();
            int i = 0;
            while (true) {
                try {
                    16L A1J = r6.A1J();
                    if (A1J == 16L.A08) {
                        return qm52.A03(bArr, i);
                    }
                    if (A1J == 16L.A0I) {
                        A0N = r6.A0T();
                    } else if (A1J == 16L.A0G) {
                        C269764fe r0 = this.A00;
                        if (r0 != null) {
                            r0.BWm(r7);
                        } else {
                            A0s(r7);
                            A0N = 0;
                        }
                    } else {
                        A0N = A0N(r6, r7);
                    }
                    if (i >= bArr.length) {
                        bArr = (byte[]) qm52.A02(bArr, i);
                        i = 0;
                    }
                    int i2 = i + 1;
                    try {
                        bArr[i] = A0N;
                        i = i2;
                    } catch (Exception e2) {
                        e = e2;
                        i = i2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    throw AnonymousClass4iD.A03(bArr, e, qm52.A00 + i);
                }
            }
        }
    }

    @JacksonStdImpl
    public final class CharDeser extends PrimitiveArrayDeserializers {
        public CharDeser() {
            super(char[].class);
        }

        public final /* bridge */ /* synthetic */ Object A0D(16F r7, C269674fV r8) {
            String str;
            Class cls;
            String str2;
            16L r5 = 16L.A0J;
            if (r7.A19(r5)) {
                char[] A1T = r7.A1T();
                int A1C = r7.A1C();
                int A1B = r7.A1B();
                char[] cArr = new char[A1B];
                System.arraycopy(A1T, A1C, cArr, 0, A1B);
                return cArr;
            }
            if (r7.A16()) {
                StringBuilder A14 = Pxe.A14(64);
                while (true) {
                    16L A1J = r7.A1J();
                    if (A1J == 16L.A08) {
                        str = A14.toString();
                        break;
                    }
                    if (A1J != r5) {
                        if (A1J != 16L.A0G) {
                            cls = Character.TYPE;
                            break;
                        }
                        C269764fe r0 = this.A00;
                        if (r0 != null) {
                            r0.BWm(r8);
                        } else {
                            A0s(r8);
                            str2 = "\u0000";
                        }
                    } else {
                        str2 = r7.A1P();
                    }
                    int length = str2.length();
                    if (length != 1) {
                        r8.A0h("Cannot convert a JSON String of length %d into a char element of char array", AnonymousClass7TF.A1b(length));
                        break;
                    }
                    A14.append(str2.charAt(0));
                }
            } else {
                if (r7.A19(16L.A0E)) {
                    Object A0V = r7.A0V();
                    if (A0V == null) {
                        return null;
                    }
                    if (A0V instanceof char[]) {
                        return A0V;
                    }
                    if (A0V instanceof String) {
                        str = (String) A0V;
                    } else if (A0V instanceof byte[]) {
                        str = C268964eM.A01.A05((byte[]) A0V);
                    }
                    return str.toCharArray();
                }
                cls = this.A00;
                r8.A0T(r7, cls);
            }
            throw AnonymousClass00P.createAndThrow();
        }
    }

    @JacksonStdImpl
    public final class DoubleDeser extends PrimitiveArrayDeserializers {
        public DoubleDeser() {
            super(double[].class);
        }

        /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object, X.Qm6] */
        public final /* bridge */ /* synthetic */ Object A0D(16F r7, C269674fV r8) {
            C269764fe r0;
            if (!r7.A16()) {
                return A0y(r7, r8);
            }
            AnonymousClass4iJ A0L = r8.A0L();
            Qm6 qm6 = A0L.A02;
            Qm6 qm62 = qm6;
            if (qm6 == null) {
                ? obj = new Object();
                A0L.A02 = obj;
                qm62 = obj;
            }
            double[] dArr = (double[]) qm62.A00();
            int i = 0;
            while (true) {
                try {
                    16L A1J = r7.A1J();
                    if (A1J == 16L.A08) {
                        return qm62.A03(dArr, i);
                    }
                    if (A1J != 16L.A0G || (r0 = this.A00) == null) {
                        double A0O = A0O(r7, r8);
                        if (i >= dArr.length) {
                            dArr = (double[]) qm62.A02(dArr, i);
                            i = 0;
                        }
                        int i2 = i + 1;
                        try {
                            dArr[i] = A0O;
                            i = i2;
                        } catch (Exception e) {
                            e = e;
                            i = i2;
                        }
                    } else {
                        r0.BWm(r8);
                    }
                } catch (Exception e2) {
                    e = e2;
                    throw AnonymousClass4iD.A03(dArr, e, qm62.A00 + i);
                }
            }
        }
    }

    @JacksonStdImpl
    public final class FloatDeser extends PrimitiveArrayDeserializers {
        public FloatDeser() {
            super(float[].class);
        }

        /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, X.Qm7] */
        public final /* bridge */ /* synthetic */ Object A0D(16F r6, C269674fV r7) {
            C269764fe r0;
            if (!r6.A16()) {
                return A0y(r6, r7);
            }
            AnonymousClass4iJ A0L = r7.A0L();
            Qm7 qm7 = A0L.A03;
            Qm7 qm72 = qm7;
            if (qm7 == null) {
                ? obj = new Object();
                A0L.A03 = obj;
                qm72 = obj;
            }
            float[] fArr = (float[]) qm72.A00();
            int i = 0;
            while (true) {
                try {
                    16L A1J = r6.A1J();
                    if (A1J == 16L.A08) {
                        return qm72.A03(fArr, i);
                    }
                    if (A1J != 16L.A0G || (r0 = this.A00) == null) {
                        float A0P = A0P(r6, r7);
                        if (i >= fArr.length) {
                            fArr = (float[]) qm72.A02(fArr, i);
                            i = 0;
                        }
                        int i2 = i + 1;
                        try {
                            fArr[i] = A0P;
                            i = i2;
                        } catch (Exception e) {
                            e = e;
                            i = i2;
                        }
                    } else {
                        r0.BWm(r7);
                    }
                } catch (Exception e2) {
                    e = e2;
                    throw AnonymousClass4iD.A03(fArr, e, qm72.A00 + i);
                }
            }
        }
    }

    @JacksonStdImpl
    public final class IntDeser extends PrimitiveArrayDeserializers {
        public static final IntDeser A00 = new IntDeser();

        public IntDeser() {
            super(int[].class);
        }

        /* JADX WARNING: type inference failed for: r4v2, types: [X.Qm8, java.lang.Object] */
        public final /* bridge */ /* synthetic */ Object A0D(16F r6, C269674fV r7) {
            int A0Q;
            if (!r6.A16()) {
                return A0y(r6, r7);
            }
            AnonymousClass4iJ A0L = r7.A0L();
            Qm8 qm8 = A0L.A04;
            Qm8 qm82 = qm8;
            if (qm8 == null) {
                ? obj = new Object();
                A0L.A04 = obj;
                qm82 = obj;
            }
            int[] iArr = (int[]) qm82.A00();
            int i = 0;
            while (true) {
                try {
                    16L A1J = r6.A1J();
                    if (A1J == 16L.A08) {
                        return qm82.A03(iArr, i);
                    }
                    if (A1J == 16L.A0I) {
                        A0Q = r6.A0i();
                    } else if (A1J == 16L.A0G) {
                        C269764fe r0 = this.A00;
                        if (r0 != null) {
                            r0.BWm(r7);
                        } else {
                            A0s(r7);
                            A0Q = 0;
                        }
                    } else {
                        A0Q = A0Q(r6, r7);
                    }
                    if (i >= iArr.length) {
                        iArr = (int[]) qm82.A02(iArr, i);
                        i = 0;
                    }
                    int i2 = i + 1;
                    try {
                        iArr[i] = A0Q;
                        i = i2;
                    } catch (Exception e) {
                        e = e;
                        i = i2;
                    }
                } catch (Exception e2) {
                    e = e2;
                    throw AnonymousClass4iD.A03(iArr, e, qm82.A00 + i);
                }
            }
        }
    }

    @JacksonStdImpl
    public final class LongDeser extends PrimitiveArrayDeserializers {
        public static final LongDeser A00 = new LongDeser();

        public LongDeser() {
            super(long[].class);
        }

        /* JADX WARNING: type inference failed for: r5v2, types: [X.Qm9, java.lang.Object] */
        public final /* bridge */ /* synthetic */ Object A0D(16F r7, C269674fV r8) {
            long A0S;
            if (!r7.A16()) {
                return A0y(r7, r8);
            }
            AnonymousClass4iJ A0L = r8.A0L();
            C8255Qm9 qm9 = A0L.A05;
            C8255Qm9 qm92 = qm9;
            if (qm9 == null) {
                ? obj = new Object();
                A0L.A05 = obj;
                qm92 = obj;
            }
            long[] jArr = (long[]) qm92.A00();
            int i = 0;
            while (true) {
                try {
                    16L A1J = r7.A1J();
                    if (A1J == 16L.A08) {
                        return qm92.A03(jArr, i);
                    }
                    if (A1J == 16L.A0I) {
                        A0S = r7.A0j();
                    } else if (A1J == 16L.A0G) {
                        C269764fe r0 = this.A00;
                        if (r0 != null) {
                            r0.BWm(r8);
                        } else {
                            A0s(r8);
                            A0S = 0;
                        }
                    } else {
                        A0S = A0S(r7, r8);
                    }
                    if (i >= jArr.length) {
                        jArr = (long[]) qm92.A02(jArr, i);
                        i = 0;
                    }
                    int i2 = i + 1;
                    try {
                        jArr[i] = A0S;
                        i = i2;
                    } catch (Exception e) {
                        e = e;
                        i = i2;
                    }
                } catch (Exception e2) {
                    e = e2;
                    throw AnonymousClass4iD.A03(jArr, e, qm92.A00 + i);
                }
            }
        }
    }

    @JacksonStdImpl
    public final class ShortDeser extends PrimitiveArrayDeserializers {
        public ShortDeser() {
            super(short[].class);
        }

        /* JADX WARNING: type inference failed for: r4v2, types: [X.QmA, java.lang.Object] */
        public final /* bridge */ /* synthetic */ Object A0D(16F r6, C269674fV r7) {
            short s;
            if (!r6.A16()) {
                return A0y(r6, r7);
            }
            AnonymousClass4iJ A0L = r7.A0L();
            C8256QmA qmA = A0L.A06;
            C8256QmA qmA2 = qmA;
            if (qmA == null) {
                ? obj = new Object();
                A0L.A06 = obj;
                qmA2 = obj;
            }
            short[] sArr = (short[]) qmA2.A00();
            int i = 0;
            while (true) {
                try {
                    16L A1J = r6.A1J();
                    if (A1J == 16L.A08) {
                        return qmA2.A03(sArr, i);
                    }
                    if (A1J == 16L.A0G) {
                        C269764fe r0 = this.A00;
                        if (r0 != null) {
                            r0.BWm(r7);
                        } else {
                            A0s(r7);
                            s = 0;
                        }
                    } else {
                        s = A0o(r6, r7);
                    }
                    if (i >= sArr.length) {
                        sArr = (short[]) qmA2.A02(sArr, i);
                        i = 0;
                    }
                    int i2 = i + 1;
                    try {
                        sArr[i] = s;
                        i = i2;
                    } catch (Exception e) {
                        e = e;
                        i = i2;
                    }
                } catch (Exception e2) {
                    e = e2;
                    throw AnonymousClass4iD.A03(sArr, e, qmA2.A00 + i);
                }
            }
        }
    }

    public PrimitiveArrayDeserializers(C269764fe r2, PrimitiveArrayDeserializers primitiveArrayDeserializers, Boolean bool) {
        super(primitiveArrayDeserializers.A00);
        this.A01 = bool;
        this.A00 = r2;
    }

    public final Integer A0B() {
        return AnonymousClass05K.A01;
    }

    public final Boolean A0G(C269454f9 r2) {
        return Boolean.TRUE;
    }

    public final Integer A0I() {
        if (this instanceof ByteDeser) {
            return AnonymousClass05K.A02;
        }
        return AnonymousClass05K.A00;
    }

    public final Object A0K(C269674fV r2) {
        Object obj = this.A02;
        if (obj == null) {
            if (this instanceof ShortDeser) {
                obj = new short[0];
            } else if (this instanceof LongDeser) {
                obj = new long[0];
            } else if (this instanceof IntDeser) {
                obj = new int[0];
            } else if (this instanceof FloatDeser) {
                obj = new float[0];
            } else if (this instanceof DoubleDeser) {
                obj = new double[0];
            } else if (this instanceof CharDeser) {
                obj = new char[0];
            } else if (this instanceof ByteDeser) {
                obj = new byte[0];
            } else {
                obj = new boolean[0];
            }
            this.A02 = obj;
        }
        return obj;
    }

    public final Object A0y(16F r6, C269674fV r7) {
        Class<?> cls;
        if (r6.A19(16L.A0J)) {
            return A0i(r6, r7);
        }
        Boolean bool = this.A01;
        if (bool == Boolean.TRUE || (bool == null && r7.A0j(C269464fA.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            if (this instanceof ShortDeser) {
                return new short[]{A0o(r6, r7)};
            } else if (this instanceof LongDeser) {
                return new long[]{A0S(r6, r7)};
            } else if (this instanceof IntDeser) {
                return new int[]{A0Q(r6, r7)};
            } else {
                if (this instanceof FloatDeser) {
                    return new float[]{A0P(r6, r7)};
                } else if (this instanceof DoubleDeser) {
                    return new double[]{A0O(r6, r7)};
                } else if (!(this instanceof CharDeser)) {
                    if (this instanceof ByteDeser) {
                        16L A10 = r6.A10();
                        if (A10 == 16L.A0I) {
                            return new byte[]{r6.A0T()};
                        } else if (A10 == 16L.A0G) {
                            C269764fe r0 = this.A00;
                            if (r0 != null) {
                                r0.BWm(r7);
                                return A0K(r7);
                            }
                            A0s(r7);
                            return null;
                        } else {
                            cls = this.A00.getComponentType();
                            r7.A0T(r6, cls);
                            throw AnonymousClass00P.createAndThrow();
                        }
                    } else {
                        return new boolean[]{A0w(r6, r7)};
                    }
                }
            }
        }
        cls = this.A00;
        r7.A0T(r6, cls);
        throw AnonymousClass00P.createAndThrow();
    }

    public final JsonDeserializer ALh(C13901TjO tjO, C269674fV r6) {
        C269224em r2;
        C269764fe r3;
        C268894eF A03;
        C269434f7 B8O;
        Class cls = this.A00;
        Boolean A0X = A0X(RDC.ACCEPT_SINGLE_VALUE_AS_ARRAY, tjO, r6, cls);
        if (tjO != null) {
            r2 = tjO.BSh().A00;
        } else {
            r2 = r6.A02.A01.A01.A00;
        }
        if (r2 == C269224em.SKIP) {
            r3 = C12441SuX.A02;
        } else if (r2 == C269224em.FAIL) {
            if (tjO == null) {
                A03 = r6.A0A(cls.getComponentType());
                B8O = null;
            } else {
                A03 = tjO.CAJ().A03();
                B8O = tjO.B8O();
            }
            r3 = new C12440SuW(A03, B8O);
        } else {
            r3 = null;
        }
        if (2Ob.A00(A0X, this.A01) && r3 == this.A00) {
            return this;
        }
        if (this instanceof ShortDeser) {
            return new PrimitiveArrayDeserializers(r3, this, A0X);
        }
        if (this instanceof LongDeser) {
            return new PrimitiveArrayDeserializers(r3, this, A0X);
        }
        if (this instanceof IntDeser) {
            return new PrimitiveArrayDeserializers(r3, this, A0X);
        }
        if (this instanceof FloatDeser) {
            return new PrimitiveArrayDeserializers(r3, this, A0X);
        }
        if (this instanceof DoubleDeser) {
            return new PrimitiveArrayDeserializers(r3, this, A0X);
        }
        if (this instanceof CharDeser) {
            return this;
        }
        if (this instanceof ByteDeser) {
            return new PrimitiveArrayDeserializers(r3, this, A0X);
        }
        return new PrimitiveArrayDeserializers(r3, this, A0X);
    }

    public final Object A0C(16F r6, C269674fV r7, Object obj) {
        Object A0D = A0D(r6, r7);
        if (obj == null || Array.getLength(obj) == 0) {
            return A0D;
        }
        if (this instanceof ShortDeser) {
            short[] sArr = (short[]) obj;
            short[] sArr2 = (short[]) A0D;
            int length = sArr.length;
            int length2 = sArr2.length;
            short[] copyOf = Arrays.copyOf(sArr, length + length2);
            System.arraycopy(sArr2, 0, copyOf, length, length2);
            return copyOf;
        } else if (this instanceof LongDeser) {
            long[] jArr = (long[]) obj;
            long[] jArr2 = (long[]) A0D;
            int length3 = jArr.length;
            int length4 = jArr2.length;
            long[] copyOf2 = Arrays.copyOf(jArr, length3 + length4);
            System.arraycopy(jArr2, 0, copyOf2, length3, length4);
            return copyOf2;
        } else if (this instanceof IntDeser) {
            int[] iArr = (int[]) obj;
            int[] iArr2 = (int[]) A0D;
            int length5 = iArr.length;
            int length6 = iArr2.length;
            int[] copyOf3 = Arrays.copyOf(iArr, length5 + length6);
            System.arraycopy(iArr2, 0, copyOf3, length5, length6);
            return copyOf3;
        } else if (this instanceof FloatDeser) {
            float[] fArr = (float[]) obj;
            float[] fArr2 = (float[]) A0D;
            int length7 = fArr.length;
            int length8 = fArr2.length;
            float[] copyOf4 = Arrays.copyOf(fArr, length7 + length8);
            System.arraycopy(fArr2, 0, copyOf4, length7, length8);
            return copyOf4;
        } else if (this instanceof DoubleDeser) {
            double[] dArr = (double[]) obj;
            double[] dArr2 = (double[]) A0D;
            int length9 = dArr.length;
            int length10 = dArr2.length;
            double[] copyOf5 = Arrays.copyOf(dArr, length9 + length10);
            System.arraycopy(dArr2, 0, copyOf5, length9, length10);
            return copyOf5;
        } else if (this instanceof CharDeser) {
            char[] cArr = (char[]) obj;
            char[] cArr2 = (char[]) A0D;
            int length11 = cArr.length;
            int length12 = cArr2.length;
            char[] copyOf6 = Arrays.copyOf(cArr, length11 + length12);
            System.arraycopy(cArr2, 0, copyOf6, length11, length12);
            return copyOf6;
        } else if (this instanceof ByteDeser) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = (byte[]) A0D;
            int length13 = bArr.length;
            int length14 = bArr2.length;
            byte[] copyOf7 = Arrays.copyOf(bArr, length13 + length14);
            System.arraycopy(bArr2, 0, copyOf7, length13, length14);
            return copyOf7;
        } else {
            boolean[] zArr = (boolean[]) obj;
            boolean[] zArr2 = (boolean[]) A0D;
            int length15 = zArr.length;
            int length16 = zArr2.length;
            boolean[] copyOf8 = Arrays.copyOf(zArr, length15 + length16);
            System.arraycopy(zArr2, 0, copyOf8, length15, length16);
            return copyOf8;
        }
    }

    public final Object A0J(16F r2, C269674fV r3, C11287SJg sJg) {
        return sJg.A04(r2, r3);
    }

    public PrimitiveArrayDeserializers(Class cls) {
        super(cls);
        this.A01 = null;
        this.A00 = null;
    }
}

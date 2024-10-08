package com.fasterxml.jackson.databind.deser.std;

import X.002;
import X.16F;
import X.16G;
import X.16L;
import X.16T;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass972;
import X.C12439SuV;
import X.C12440SuW;
import X.C12441SuX;
import X.C13782Tgx;
import X.C13901TjO;
import X.C268854eA;
import X.C268894eF;
import X.C269224em;
import X.C269314ev;
import X.C269354ez;
import X.C269434f7;
import X.C269454f9;
import X.C269464fA;
import X.C269574fL;
import X.C269674fV;
import X.C269764fe;
import X.C8194Qk1;
import X.C8208QkH;
import X.Pxd;
import X.RDC;
import X.SK6;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

public abstract class StdDeserializer extends JsonDeserializer implements Serializable {
    public static final int A02 = (C269464fA.USE_BIG_INTEGER_FOR_INTS.A00 | C269464fA.USE_LONG_FOR_INTS.A00);
    public final Class A00;
    public final C268894eF A01;

    public static final boolean A08(String str) {
        char charAt = str.charAt(0);
        if (charAt == 'f') {
            return "false".equals(str);
        }
        if (charAt == 'F') {
            return "FALSE".equals(str) || "False".equals(str);
        }
        return false;
    }

    public static final boolean A09(String str) {
        char charAt = str.charAt(0);
        if (charAt == 't') {
            return "true".equals(str);
        }
        if (charAt == 'T') {
            return "TRUE".equals(str) || "True".equals(str);
        }
        return false;
    }

    public final int A0R(C269674fV r8, String str) {
        try {
            if (str.length() <= 9) {
                return 16T.A02(str);
            }
            long A04 = 16T.A04(str);
            if (A04 >= -2147483648L && A04 <= 2147483647L) {
                return (int) A04;
            }
            r8.A0e(Integer.TYPE, str, "Overflow: numeric value (%s) out of range of int (%d -%d)", str, Integer.valueOf(AnonymousClass972.MUTABLE_FLAG_MASK), Integer.MAX_VALUE);
            throw AnonymousClass00P.createAndThrow();
        } catch (IllegalArgumentException unused) {
            r8.A0e(Integer.TYPE, str, "not a valid `int` value", new Object[0]);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public SK6 A0W() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006e, code lost:
        if (r1 != 1) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Date A0m(X.16F r12, X.C269674fV r13) {
        /*
            r11 = this;
            r6 = r12
            int r1 = r12.A0x()
            r0 = 1
            r5 = r13
            if (r1 == r0) goto L_0x0040
            r4 = 3
            if (r1 == r4) goto L_0x0046
            r0 = 11
            if (r1 == r0) goto L_0x008e
            r0 = 6
            if (r1 == r0) goto L_0x0033
            r0 = 7
            if (r1 != r0) goto L_0x0040
            long r1 = r12.A0j()     // Catch:{ 1bE -> 0x0020 }
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            return r0
        L_0x0020:
            java.lang.Class r3 = r11.A00
            java.lang.Number r2 = r12.A0p()
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "not a valid 64-bit `long` for creating `java.util.Date`"
            r13.A0c(r3, r2, r0, r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0033:
            java.lang.String r0 = r12.A1P()
            java.lang.String r0 = r0.trim()
            java.util.Date r0 = r11.A0n(r13, r0)
            return r0
        L_0x0040:
            java.lang.Class r0 = r11.A00
            r13.A0T(r12, r0)
            goto L_0x007f
        L_0x0046:
            java.lang.Integer r1 = r11.A0I()
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            java.lang.Integer r3 = r13.A0N(r1, r0)
            X.4fA r0 = X.C269464fA.UNWRAP_SINGLE_VALUE_ARRAYS
            boolean r2 = r13.A0j(r0)
            if (r2 != 0) goto L_0x005c
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r3 == r0) goto L_0x0070
        L_0x005c:
            X.16L r1 = r12.A1J()
            X.16L r0 = X.16L.A08
            if (r1 != r0) goto L_0x0084
            int r1 = r3.intValue()
            if (r1 == r4) goto L_0x0093
            r0 = 2
            if (r1 == r0) goto L_0x008e
            r0 = 1
            if (r1 == r0) goto L_0x008e
        L_0x0070:
            java.lang.Class r1 = r11.A00
            X.16L r7 = X.16L.A0C
            r9 = 0
            r0 = 0
            java.lang.Object[] r10 = new java.lang.Object[r0]
            X.4eF r8 = r13.A0A(r1)
            r5.A0Q(r6, r7, r8, r9, r10)
        L_0x007f:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0084:
            if (r2 == 0) goto L_0x0070
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x009a
            r11.A0q(r12, r13)
            goto L_0x007f
        L_0x008e:
            java.lang.Object r0 = r11.BWm(r13)
            goto L_0x0097
        L_0x0093:
            java.lang.Object r0 = r11.A0K(r13)
        L_0x0097:
            java.util.Date r0 = (java.util.Date) r0
            return r0
        L_0x009a:
            java.util.Date r0 = r11.A0m(r12, r13)
            r11.A0p(r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.A0m(X.16F, X.4fV):java.util.Date");
    }

    public final Date A0n(C269674fV r4, String str) {
        try {
            if (str.isEmpty()) {
                if (A0f(r4, str).intValue() == 3) {
                    return new Date(0);
                }
                return null;
            } else if (!"null".equals(str)) {
                return r4.A0P(str);
            } else {
                return null;
            }
        } catch (IllegalArgumentException e) {
            r4.A0e(this.A00, str, "not a valid representation (error: %s)", C269574fL.A09(e));
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final JsonDeserializer A05(C13901TjO tjO, C269674fV r4, JsonDeserializer jsonDeserializer) {
        C8208QkH BRS;
        Object A0f;
        C268854eA A012 = r4.A02.A01();
        if (A012 == null || tjO == null || (BRS = tjO.BRS()) == null || (A0f = A012.A0f(BRS)) == null) {
            return jsonDeserializer;
        }
        C13782Tgx A06 = r4.A06(A0f);
        C268894eF BHa = A06.BHa(r4.A05());
        if (jsonDeserializer == null) {
            jsonDeserializer = r4.A0B(tjO, BHa);
        }
        return new StdDelegatingDeserializer(BHa, jsonDeserializer, A06);
    }

    public static final C269764fe A06(C269224em r2, C13901TjO tjO, C269674fV r4, JsonDeserializer jsonDeserializer) {
        C268894eF CAJ;
        C268894eF CAJ2;
        C269434f7 B8O;
        Class<Object> A0H;
        if (r2 == C269224em.FAIL) {
            if (tjO == null) {
                if (jsonDeserializer == null) {
                    A0H = Object.class;
                } else {
                    A0H = jsonDeserializer.A0H();
                }
                CAJ2 = r4.A0A(A0H);
                B8O = null;
            } else {
                CAJ2 = tjO.CAJ();
                B8O = tjO.B8O();
            }
            return new C12440SuW(CAJ2, B8O);
        }
        if (r2 == C269224em.AS_EMPTY) {
            if (jsonDeserializer != null) {
                if (jsonDeserializer instanceof BeanDeserializerBase) {
                    BeanDeserializerBase beanDeserializerBase = (BeanDeserializerBase) jsonDeserializer;
                    if (!beanDeserializerBase.A09.A0L()) {
                        if (tjO == null) {
                            CAJ = beanDeserializerBase.A08;
                        } else {
                            CAJ = tjO.CAJ();
                        }
                        r4.A08(CAJ, String.format("Cannot create empty instance of %s, no default Creator", new Object[]{CAJ}));
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
                if (jsonDeserializer.A0B() != AnonymousClass05K.A01) {
                    return new C12439SuV(jsonDeserializer);
                }
                Object A0K = jsonDeserializer.A0K(r4);
                if (A0K == null) {
                    return C12441SuX.A01;
                }
                return new C12441SuX(A0K);
            }
        } else if (r2 == C269224em.SKIP) {
            return C12441SuX.A02;
        }
        return null;
    }

    public static final Object A07(16F r1, C269674fV r2) {
        if (r2.A0j(C269464fA.USE_BIG_INTEGER_FOR_INTS)) {
            return r1.A0s();
        }
        if (r2.A0j(C269464fA.USE_LONG_FOR_INTS)) {
            return Long.valueOf(r1.A0j());
        }
        return r1.A0p();
    }

    public C268894eF A0T() {
        return this.A01;
    }

    public final C268894eF A0U(C269674fV r2) {
        C268894eF r0 = this.A01;
        if (r0 == null) {
            return r2.A0A(this.A00);
        }
        return r0;
    }

    public final C269764fe A0V(C13901TjO tjO, C269674fV r5, JsonDeserializer jsonDeserializer) {
        C269224em r1;
        C268894eF A03;
        C269434f7 B8O;
        if (tjO != null) {
            r1 = tjO.BSh().A00;
        } else {
            r1 = r5.A02.A01.A01.A00;
        }
        if (r1 == C269224em.SKIP) {
            return C12441SuX.A02;
        }
        if (r1 == C269224em.FAIL) {
            if (tjO == null) {
                A03 = r5.A0A(jsonDeserializer.A0H());
                if (A03.A0N()) {
                    A03 = A03.A03();
                }
                B8O = null;
            } else {
                A03 = tjO.CAJ().A03();
                B8O = tjO.B8O();
            }
            return new C12440SuW(A03, B8O);
        }
        C269764fe A06 = A06(r1, tjO, r5, jsonDeserializer);
        if (A06 == null) {
            return jsonDeserializer;
        }
        return A06;
    }

    public final Boolean A0X(RDC rdc, C13901TjO tjO, C269674fV r4, Class cls) {
        C269314ev A002;
        C269454f9 r0 = r4.A02;
        if (tjO != null) {
            A002 = tjO.AVO(r0, cls);
        } else {
            A002 = r0.A00();
        }
        return A002.A01(rdc);
    }

    public final Boolean A0Y(16F r6, C269674fV r7) {
        Integer A0N = r7.A0N(AnonymousClass05K.A15, AnonymousClass05K.A0C);
        int intValue = A0N.intValue();
        boolean z = true;
        if (intValue != 3) {
            if (intValue == 2) {
                return null;
            }
            if (intValue != 0) {
                if (r6.A0n() != AnonymousClass05K.A00) {
                    z = !"0".equals(r6.A1P());
                } else if (r6.A0i() == 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            A0u(r7, A0N, r6.A0p(), 002.A0g(Pxd.A00(513), r6.A1P(), ")"));
        }
        return Boolean.FALSE;
    }

    public final Integer A0c(16F r6, C269674fV r7) {
        Integer A0N = r7.A0N(AnonymousClass05K.A0j, AnonymousClass05K.A0N);
        if (A0N != AnonymousClass05K.A00) {
            return A0N;
        }
        A0u(r7, A0N, r6.A0p(), 002.A0g("Floating-point value (", r6.A1P(), ")"));
        throw AnonymousClass00P.createAndThrow();
    }

    public final String A0l(16F r3, C269674fV r4) {
        Class<String> cls;
        if (r3.A19(16L.A0J)) {
            return r3.A1P();
        }
        if (r3.A19(16L.A0E)) {
            Object A0V = r3.A0V();
            if (A0V instanceof byte[]) {
                return r4.A02.A01.A00.A05((byte[]) A0V);
            }
            if (A0V == null) {
                return null;
            }
            return A0V.toString();
        }
        if (r3.A19(16L.A0D)) {
            cls = this.A00;
        } else {
            String A1Q = r3.A1Q();
            if (A1Q != null) {
                return A1Q;
            }
            cls = String.class;
        }
        r4.A0T(r3, cls);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0q(16F r10, C269674fV r11) {
        String format = String.format("Cannot deserialize instance of %s out of %s token: nested Arrays not allowed with %s", new Object[]{C269574fL.A06(this.A00), 16L.A0C, "DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS"});
        r11.A0Q(r10, r10.A10(), A0U(r11), format, new Object[0]);
        throw AnonymousClass00P.createAndThrow();
    }

    public void A0r(16F r1, C269674fV r2, Object obj, String str) {
        if (obj == null) {
            obj = A0H();
        }
        r2.A0S(r1, this, obj, str);
    }

    public final void A0s(C269674fV r3) {
        if (r3.A0j(C269464fA.FAIL_ON_NULL_FOR_PRIMITIVES)) {
            r3.A0h("Cannot coerce `null` to %s (disable `DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES` to allow)", A0k());
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void A0t(C269674fV r4) {
        r4.A0V(16L.A08, "Attempted to unwrap '%s' value from an array (with `DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS`) but it contains more than one value", A0H().getName());
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0u(C269674fV r4, Integer num, Object obj, String str) {
        if (num == AnonymousClass05K.A00) {
            throw new C8194Qk1(r4.A07, obj, String.format("Cannot coerce %s to %s (but could if coercion was enabled using `CoercionConfig`)", new Object[]{str, A0k()}));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.4fA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: X.4ez} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: X.4ez} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: X.4ez} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0v(X.C269674fV r7, java.lang.String r8) {
        /*
            r6 = this;
            X.4ez r5 = X.C269354ez.ALLOW_COERCION_OF_SCALARS
            X.4f9 r0 = r7.A02
            boolean r0 = r0.A09(r5)
            if (r0 != 0) goto L_0x0043
            r2 = 1
        L_0x000b:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0038
            java.lang.String r4 = "empty String (\"\")"
        L_0x0013:
            if (r2 == 0) goto L_0x0035
            java.lang.String r3 = "enable"
        L_0x0017:
            java.lang.String r2 = r6.A0k()
            java.lang.Class r0 = r5.getDeclaringClass()
            java.lang.String r1 = r0.getSimpleName()
            java.lang.String r0 = r5.name()
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r2, r3, r1, r0}
            java.lang.String r0 = "Cannot coerce %s to Null value as %s (%s `%s.%s` to allow)"
            r7.A0h(r0, r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0035:
            java.lang.String r3 = "disable"
            goto L_0x0017
        L_0x0038:
            java.lang.Object[] r1 = new java.lang.Object[]{r8}
            java.lang.String r0 = "String \"%s\""
            java.lang.String r4 = java.lang.String.format(r0, r1)
            goto L_0x0013
        L_0x0043:
            X.4fA r5 = X.C269464fA.FAIL_ON_NULL_FOR_PRIMITIVES
            boolean r0 = r7.A0j(r5)
            if (r0 == 0) goto L_0x004d
            r2 = 0
            goto L_0x000b
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.A0v(X.4fV, java.lang.String):void");
    }

    public final boolean A0x(C269674fV r7, String str) {
        if (!"null".equals(str)) {
            return false;
        }
        C269354ez r5 = C269354ez.ALLOW_COERCION_OF_SCALARS;
        if (r7.A02.A09(r5)) {
            return true;
        }
        r7.A0h("Cannot coerce %s to Null value as %s (%s `%s.%s` to allow)", "String \"null\"", A0k(), "enable", r5.getDeclaringClass().getSimpleName(), "ALLOW_COERCION_OF_SCALARS");
        throw AnonymousClass00P.createAndThrow();
    }

    public StdDeserializer(C268894eF r2) {
        Class<Object> cls;
        if (r2 == null) {
            cls = Object.class;
        } else {
            cls = r2.A00;
        }
        this.A00 = cls;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        if (r1 != X.AnonymousClass05K.A0N) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte A0N(X.16F r6, X.C269674fV r7) {
        /*
            r5 = this;
            int r1 = r6.A0x()
            r0 = 1
            r4 = 0
            if (r1 == r0) goto L_0x0093
            r0 = 3
            if (r1 == r0) goto L_0x006d
            r0 = 11
            if (r1 == r0) goto L_0x0069
            r0 = 6
            if (r1 == r0) goto L_0x0026
            r0 = 7
            if (r1 == r0) goto L_0x0048
            r0 = 8
            if (r1 != r0) goto L_0x0089
            java.lang.Integer r1 = r5.A0c(r6, r7)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x0025
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x0048
        L_0x0025:
            return r4
        L_0x0026:
            java.lang.String r2 = r6.A1P()
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            java.lang.Integer r1 = r5.A0e(r7, r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x0069
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x0025
            java.lang.String r3 = r2.trim()
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x004d
            r5.A0v(r7, r3)
            return r4
        L_0x0048:
            byte r4 = r6.A0T()
            return r4
        L_0x004d:
            int r1 = X.16T.A02(r3)     // Catch:{ IllegalArgumentException -> 0x005b }
            r0 = -128(0xffffffffffffff80, float:NaN)
            if (r1 < r0) goto L_0x0099
            r0 = 255(0xff, float:3.57E-43)
            if (r1 > r0) goto L_0x0099
            byte r4 = (byte) r1     // Catch:{ IllegalArgumentException -> 0x005b }
            return r4
        L_0x005b:
            java.lang.Class r2 = r5.A00
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "not a valid `byte` value"
            r7.A0e(r2, r3, r0, r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0069:
            r5.A0s(r7)
            return r4
        L_0x006d:
            X.4fA r0 = X.C269464fA.UNWRAP_SINGLE_VALUE_ARRAYS
            boolean r0 = r7.A0j(r0)
            if (r0 == 0) goto L_0x0089
            X.16L r1 = r6.A1J()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x0081
            r5.A0q(r6, r7)
            goto L_0x00a6
        L_0x0081:
            byte r4 = r5.A0N(r6, r7)
            r5.A0p(r6, r7)
            return r4
        L_0x0089:
            java.lang.Class r0 = java.lang.Byte.TYPE
            X.4eF r0 = r7.A0A(r0)
            r7.A0R(r6, r0)
            goto L_0x00a6
        L_0x0093:
            java.lang.Class r0 = java.lang.Byte.TYPE
            r7.A0T(r6, r0)
            goto L_0x00a6
        L_0x0099:
            java.lang.Class r2 = r5.A00
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 828(0x33c, float:1.16E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            r7.A0e(r2, r3, r0, r1)
        L_0x00a6:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.A0N(X.16F, X.4fV):byte");
    }

    public final double A0O(16F r7, C269674fV r8) {
        int A0x = r7.A0x();
        if (A0x != 1) {
            if (A0x != 3) {
                if (A0x != 11) {
                    if (A0x == 6) {
                        String A1P = r7.A1P();
                        Double A0a = A0a(A1P);
                        if (A0a != null) {
                            return A0a.doubleValue();
                        }
                        Integer num = AnonymousClass05K.A0j;
                        Class cls = Double.TYPE;
                        Integer A0e = A0e(r8, num, A1P);
                        if (A0e != AnonymousClass05K.A0C) {
                            if (A0e == AnonymousClass05K.A0N) {
                                return 0.0d;
                            }
                            String trim = A1P.trim();
                            if ("null".equals(trim)) {
                                A0v(r8, trim);
                                return 0.0d;
                            }
                            try {
                                if ("2.2250738585072012e-308".equals(trim)) {
                                    return Double.MIN_NORMAL;
                                }
                                return Double.parseDouble(trim);
                            } catch (IllegalArgumentException unused) {
                                r8.A0e(cls, trim, "not a valid `double` value (as String to convert)", new Object[0]);
                                throw AnonymousClass00P.createAndThrow();
                            }
                        }
                    } else if (A0x == 7 || A0x == 8) {
                        return r7.A0g();
                    }
                }
                A0s(r8);
                return 0.0d;
            } else if (r8.A0j(C269464fA.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (r7.A1J() == 16L.A0C) {
                    A0q(r7, r8);
                    throw AnonymousClass00P.createAndThrow();
                }
                double A0O = A0O(r7, r8);
                A0p(r7, r8);
                return A0O;
            }
        }
        r8.A0T(r7, Double.TYPE);
        throw AnonymousClass00P.createAndThrow();
    }

    public final float A0P(16F r6, C269674fV r7) {
        int A0x = r6.A0x();
        if (A0x != 1) {
            if (A0x != 3) {
                if (A0x != 11) {
                    if (A0x == 6) {
                        String A1P = r6.A1P();
                        Float A0b = A0b(A1P);
                        if (A0b != null) {
                            return A0b.floatValue();
                        }
                        Integer num = AnonymousClass05K.A0j;
                        Class cls = Float.TYPE;
                        Integer A0e = A0e(r7, num, A1P);
                        if (A0e != AnonymousClass05K.A0C) {
                            if (A0e == AnonymousClass05K.A0N) {
                                return 0.0f;
                            }
                            String trim = A1P.trim();
                            if ("null".equals(trim)) {
                                A0v(r7, trim);
                                return 0.0f;
                            }
                            try {
                                return Float.parseFloat(trim);
                            } catch (IllegalArgumentException unused) {
                                r7.A0e(cls, trim, "not a valid `float` value", new Object[0]);
                                throw AnonymousClass00P.createAndThrow();
                            }
                        }
                    } else if (A0x == 7 || A0x == 8) {
                        return r6.A0h();
                    }
                }
                A0s(r7);
                return 0.0f;
            } else if (r7.A0j(C269464fA.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (r6.A1J() == 16L.A0C) {
                    A0q(r6, r7);
                    throw AnonymousClass00P.createAndThrow();
                }
                float A0P = A0P(r6, r7);
                A0p(r6, r7);
                return A0P;
            }
        }
        r7.A0T(r6, Float.TYPE);
        throw AnonymousClass00P.createAndThrow();
    }

    public final int A0Q(16F r5, C269674fV r6) {
        int A0x = r5.A0x();
        if (A0x != 1) {
            if (A0x != 3) {
                if (A0x != 11) {
                    if (A0x == 6) {
                        String A1P = r5.A1P();
                        Integer A0e = A0e(r6, AnonymousClass05K.A0j, A1P);
                        if (A0e != AnonymousClass05K.A0C) {
                            if (A0e == AnonymousClass05K.A0N) {
                                return 0;
                            }
                            String trim = A1P.trim();
                            if (!"null".equals(trim)) {
                                return A0R(r6, trim);
                            }
                            A0v(r6, trim);
                            return 0;
                        }
                    } else if (A0x == 7) {
                        return r5.A0i();
                    } else {
                        if (A0x == 8) {
                            Integer A0c = A0c(r5, r6);
                            if (A0c == AnonymousClass05K.A0C || A0c == AnonymousClass05K.A0N) {
                                return 0;
                            }
                            return r5.A1D();
                        }
                    }
                }
                A0s(r6);
                return 0;
            } else if (r6.A0j(C269464fA.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (r5.A1J() == 16L.A0C) {
                    A0q(r5, r6);
                    throw AnonymousClass00P.createAndThrow();
                }
                int A0Q = A0Q(r5, r6);
                A0p(r5, r6);
                return A0Q;
            }
        }
        r6.A0T(r5, Integer.TYPE);
        throw AnonymousClass00P.createAndThrow();
    }

    public final long A0S(16F r7, C269674fV r8) {
        int A0x = r7.A0x();
        if (A0x != 1) {
            if (A0x != 3) {
                if (A0x != 11) {
                    if (A0x == 6) {
                        String A1P = r7.A1P();
                        Integer num = AnonymousClass05K.A0j;
                        Class cls = Long.TYPE;
                        Integer A0e = A0e(r8, num, A1P);
                        if (A0e != AnonymousClass05K.A0C) {
                            if (A0e == AnonymousClass05K.A0N) {
                                return 0;
                            }
                            String trim = A1P.trim();
                            if ("null".equals(trim)) {
                                A0v(r8, trim);
                                return 0;
                            }
                            try {
                                return 16T.A04(trim);
                            } catch (IllegalArgumentException unused) {
                                r8.A0e(cls, trim, "not a valid `long` value", new Object[0]);
                                throw AnonymousClass00P.createAndThrow();
                            }
                        }
                    } else if (A0x == 7) {
                        return r7.A0j();
                    } else {
                        if (A0x == 8) {
                            Integer A0c = A0c(r7, r8);
                            if (A0c == AnonymousClass05K.A0C || A0c == AnonymousClass05K.A0N) {
                                return 0;
                            }
                            return r7.A0y();
                        }
                    }
                }
                A0s(r8);
                return 0;
            } else if (r8.A0j(C269464fA.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (r7.A1J() == 16L.A0C) {
                    A0q(r7, r8);
                    throw AnonymousClass00P.createAndThrow();
                }
                long A0S = A0S(r7, r8);
                A0p(r7, r8);
                return A0S;
            }
        }
        r8.A0T(r7, Long.TYPE);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        if (A09(r2) != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
        if (A08(r2) != false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean A0Z(X.16F r7, X.C269674fV r8, java.lang.Class r9) {
        /*
            r6 = this;
            int r1 = r7.A0x()
            r3 = 0
            r5 = 1
            r4 = 0
            if (r1 == r5) goto L_0x0015
            r0 = 3
            if (r1 == r0) goto L_0x0066
            r0 = 6
            if (r1 == r0) goto L_0x001d
            r0 = 7
            if (r1 == r0) goto L_0x0061
            switch(r1) {
                case 9: goto L_0x0040;
                case 10: goto L_0x004e;
                case 11: goto L_0x0065;
                default: goto L_0x0015;
            }
        L_0x0015:
            r8.A0T(r7, r9)
        L_0x0018:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001d:
            java.lang.String r2 = r7.A1P()
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            java.lang.Integer r1 = r6.A0e(r8, r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x0065
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x004e
            java.lang.String r2 = r2.trim()
            int r1 = r2.length()
            r0 = 4
            if (r1 != r0) goto L_0x0045
            boolean r0 = A09(r2)
            if (r0 == 0) goto L_0x0053
        L_0x0040:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            return r3
        L_0x0045:
            r0 = 5
            if (r1 != r0) goto L_0x0053
            boolean r0 = A08(r2)
            if (r0 == 0) goto L_0x0053
        L_0x004e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            return r3
        L_0x0053:
            boolean r0 = r6.A0x(r8, r2)
            if (r0 != 0) goto L_0x0065
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "only \"true\" or \"false\" recognized"
            r8.A0e(r9, r2, r0, r1)
            goto L_0x0018
        L_0x0061:
            java.lang.Boolean r3 = r6.A0Y(r7, r8)
        L_0x0065:
            return r3
        L_0x0066:
            java.lang.Object r3 = r6.A0h(r7, r8)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.A0Z(X.16F, X.4fV, java.lang.Class):java.lang.Boolean");
    }

    public final Double A0a(String str) {
        double d;
        if (str.isEmpty()) {
            return null;
        }
        char charAt = str.charAt(0);
        if (charAt != '-') {
            if (charAt != 'I') {
                if (charAt != 'N' || !"NaN".equals(str)) {
                    return null;
                }
                d = Double.NaN;
            } else if (!"Infinity".equals(str) && !"INF".equals(str)) {
                return null;
            } else {
                d = Double.POSITIVE_INFINITY;
            }
        } else if (!"-Infinity".equals(str) && !"-INF".equals(str)) {
            return null;
        } else {
            d = Double.NEGATIVE_INFINITY;
        }
        return Double.valueOf(d);
    }

    public final Float A0b(String str) {
        float f;
        if (str.isEmpty()) {
            return null;
        }
        char charAt = str.charAt(0);
        if (charAt != '-') {
            if (charAt != 'I') {
                if (charAt != 'N' || !"NaN".equals(str)) {
                    return null;
                }
                f = Float.NaN;
            } else if (!"Infinity".equals(str) && !"INF".equals(str)) {
                return null;
            } else {
                f = Float.POSITIVE_INFINITY;
            }
        } else if (!"-Infinity".equals(str) && !"-INF".equals(str)) {
            return null;
        } else {
            f = Float.NEGATIVE_INFINITY;
        }
        return Float.valueOf(f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0076, code lost:
        if (r1 > 2147483647L) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer A0d(X.16F r9, X.C269674fV r10, java.lang.Class r11) {
        /*
            r8 = this;
            int r1 = r9.A0x()
            r0 = 1
            if (r1 == r0) goto L_0x0024
            r0 = 3
            if (r1 == r0) goto L_0x00ba
            r0 = 11
            if (r1 == r0) goto L_0x00b5
            r0 = 6
            if (r1 == r0) goto L_0x0042
            r0 = 7
            if (r1 == r0) goto L_0x0028
            r0 = 8
            if (r1 == r0) goto L_0x002d
            X.4eF r0 = r8.A0U(r10)
            r10.A0R(r9, r0)
        L_0x001f:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0024:
            r10.A0T(r9, r11)
            goto L_0x001f
        L_0x0028:
            int r0 = r9.A0i()
            goto L_0x003d
        L_0x002d:
            java.lang.Integer r1 = r8.A0c(r9, r10)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x00b5
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x00bf
            int r0 = r9.A1D()
        L_0x003d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x0042:
            java.lang.String r2 = r9.A1P()
            java.lang.Integer r1 = r8.A0f(r10, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x00b5
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x00bf
            java.lang.String r4 = r2.trim()
            boolean r0 = r8.A0x(r10, r4)
            if (r0 != 0) goto L_0x00b5
            r5 = 0
            int r1 = r4.length()     // Catch:{ IllegalArgumentException -> 0x00a7 }
            r0 = 9
            if (r1 <= r0) goto L_0x009e
            long r1 = X.16T.A04(r4)     // Catch:{ IllegalArgumentException -> 0x00a7 }
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0078
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            r0 = 0
            if (r3 <= 0) goto L_0x0079
        L_0x0078:
            r0 = 1
        L_0x0079:
            if (r0 == 0) goto L_0x0098
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            java.lang.String r2 = "Overflow: numeric value (%s) out of range of `java.lang.Integer` (%d -%d)"
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x00a7 }
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x00a7 }
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r1, r0}     // Catch:{ IllegalArgumentException -> 0x00a7 }
            r10.A0e(r3, r4, r2, r0)     // Catch:{ IllegalArgumentException -> 0x00a7 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ IllegalArgumentException -> 0x00a7 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00a7 }
        L_0x0098:
            int r0 = (int) r1     // Catch:{ IllegalArgumentException -> 0x00a7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x00a7 }
            return r0
        L_0x009e:
            int r0 = X.16T.A02(r4)     // Catch:{ IllegalArgumentException -> 0x00a7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x00a7 }
            return r0
        L_0x00a7:
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "not a valid `java.lang.Integer` value"
            r10.A0e(r2, r4, r0, r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00b5:
            java.lang.Object r0 = r8.BWm(r10)
            goto L_0x00c3
        L_0x00ba:
            java.lang.Object r0 = r8.A0h(r9, r10)
            goto L_0x00c3
        L_0x00bf:
            java.lang.Object r0 = r8.A0K(r10)
        L_0x00c3:
            java.lang.Integer r0 = (java.lang.Integer) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.A0d(X.16F, X.4fV, java.lang.Class):java.lang.Integer");
    }

    public final Integer A0e(C269674fV r5, Integer num, String str) {
        Integer A0O;
        String str2;
        if (str.isEmpty()) {
            A0O = r5.A0N(num, AnonymousClass05K.A1I);
            str2 = "empty String (\"\")";
        } else {
            int length = str.length();
            int i = 0;
            while (i < length) {
                if (str.charAt(i) <= ' ') {
                    i++;
                } else if (r5.A0i(16G.A03)) {
                    return AnonymousClass05K.A01;
                } else {
                    A0O = r5.A0N(num, AnonymousClass05K.A0j);
                    if (A0O == AnonymousClass05K.A00) {
                        r5.A0h("Cannot coerce String value (\"%s\") to %s (but might if coercion using `CoercionConfig` was enabled)", str, A0k());
                        throw AnonymousClass00P.createAndThrow();
                    }
                    return A0O;
                }
            }
            A0O = r5.A0O(num, AnonymousClass05K.A00);
            str2 = "blank String (all whitespace)";
        }
        A0u(r5, A0O, str, str2);
        return A0O;
    }

    public final Integer A0f(C269674fV r2, String str) {
        return A0e(r2, A0I(), str);
    }

    public final Long A0g(16F r5, C269674fV r6, Class cls) {
        Object obj;
        long j;
        int A0x = r5.A0x();
        if (A0x != 1) {
            if (A0x != 3) {
                if (A0x != 11) {
                    if (A0x != 6) {
                        if (A0x == 7) {
                            j = r5.A0j();
                        } else if (A0x != 8) {
                            r6.A0R(r5, A0U(r6));
                        } else {
                            Integer A0c = A0c(r5, r6);
                            if (A0c != AnonymousClass05K.A0C) {
                                if (A0c != AnonymousClass05K.A0N) {
                                    j = r5.A0y();
                                }
                            }
                        }
                        return Long.valueOf(j);
                    }
                    String A1P = r5.A1P();
                    Integer A0f = A0f(r6, A1P);
                    if (A0f != AnonymousClass05K.A0C) {
                        if (A0f != AnonymousClass05K.A0N) {
                            String trim = A1P.trim();
                            if (!A0x(r6, trim)) {
                                try {
                                    return Long.valueOf(16T.A04(trim));
                                } catch (IllegalArgumentException unused) {
                                    r6.A0e(Long.class, trim, "not a valid `java.lang.Long` value", new Object[0]);
                                    throw AnonymousClass00P.createAndThrow();
                                }
                            }
                        }
                    }
                    obj = A0K(r6);
                }
                obj = BWm(r6);
            } else {
                obj = A0h(r5, r6);
            }
            return (Long) obj;
        }
        r6.A0T(r5, cls);
        throw AnonymousClass00P.createAndThrow();
    }

    public Object A0h(16F r11, C269674fV r12) {
        C269674fV r4 = r12;
        Integer A0N = r12.A0N(A0I(), AnonymousClass05K.A15);
        boolean A0j = r12.A0j(C269464fA.UNWRAP_SINGLE_VALUE_ARRAYS);
        16F r5 = r11;
        if (A0j || A0N != AnonymousClass05K.A00) {
            16L A1J = r11.A1J();
            16L r2 = 16L.A08;
            if (A1J == r2) {
                int intValue = A0N.intValue();
                if (intValue == 3) {
                    return A0K(r12);
                }
                if (intValue == 2 || intValue == 1) {
                    return BWm(r12);
                }
            } else if (A0j) {
                if (r11.A19(16L.A0C)) {
                    A0q(r11, r12);
                } else {
                    Object A0D = A0D(r11, r12);
                    if (r11.A1J() == r2) {
                        return A0D;
                    }
                    A0t(r12);
                }
                throw AnonymousClass00P.createAndThrow();
            }
        }
        r4.A0Q(r5, 16L.A0C, A0U(r12), (String) null, new Object[0]);
        throw AnonymousClass00P.createAndThrow();
    }

    public final Object A0i(16F r9, C269674fV r10) {
        SK6 A0W = A0W();
        Class A0H = A0H();
        String A1Q = r9.A1Q();
        if (A0W != null && A0W.A0J()) {
            return A0W.A0A(r10, A1Q);
        }
        if (A1Q.isEmpty()) {
            return A0j(r10, r10.A0N(A0I(), AnonymousClass05K.A1I));
        }
        int length = A1Q.length();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < length) {
                if (A1Q.charAt(i) > ' ') {
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            return A0j(r10, r10.A0O(A0I(), AnonymousClass05K.A00));
        }
        if (A0W != null) {
            A1Q = A1Q.trim();
            if (A0W.A0G()) {
                Integer num = AnonymousClass05K.A0j;
                if (r10.A0N(num, num) == AnonymousClass05K.A01) {
                    return A0W.A06(r10, A0R(r10, A1Q));
                }
            }
            if (A0W.A0H()) {
                Integer num2 = AnonymousClass05K.A0j;
                if (r10.A0N(num2, num2) == AnonymousClass05K.A01) {
                    try {
                        return A0W.A07(r10, 16T.A04(A1Q));
                    } catch (IllegalArgumentException unused) {
                        r10.A0e(Long.TYPE, A1Q, "not a valid `long` value", new Object[0]);
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            }
            if (A0W.A0F() && r10.A0N(AnonymousClass05K.A15, AnonymousClass05K.A0j) == AnonymousClass05K.A01) {
                String trim = A1Q.trim();
                if ("true".equals(trim)) {
                    return A0W.A0D(r10, true);
                }
                if ("false".equals(trim)) {
                    return A0W.A0D(r10, false);
                }
            }
        }
        r10.A0Y(A0W, A0H, "no String-argument constructor/factory method to deserialize from String value ('%s')", A1Q);
        throw AnonymousClass00P.createAndThrow();
    }

    public final Object A0j(C269674fV r3, Integer num) {
        int intValue = num.intValue();
        if (intValue == 3) {
            return A0K(r3);
        }
        if (intValue != 0) {
            return null;
        }
        A0u(r3, num, "", "empty String (\"\")");
        return null;
    }

    public final String A0k() {
        String A06;
        StringBuilder sb;
        C268894eF A0T = A0T();
        boolean z = false;
        if (A0T == null || A0T.A00.isPrimitive()) {
            Class A0H = A0H();
            if (A0H.isArray() || Collection.class.isAssignableFrom(A0H) || Map.class.isAssignableFrom(A0H)) {
                z = true;
            }
            A06 = C269574fL.A06(A0H);
        } else {
            if (A0T.A0N() || A0T.A02()) {
                z = true;
            }
            A06 = C269574fL.A04(A0T);
        }
        if (z) {
            sb.append("element of ");
        } else {
            sb = new StringBuilder();
            sb.append(A06);
            A06 = " value";
        }
        sb.append(A06);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        if (r1 != X.AnonymousClass05K.A0N) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final short A0o(X.16F r6, X.C269674fV r7) {
        /*
            r5 = this;
            int r1 = r6.A0x()
            r0 = 1
            r4 = 0
            if (r1 == r0) goto L_0x0093
            r0 = 3
            if (r1 == r0) goto L_0x006d
            r0 = 11
            if (r1 == r0) goto L_0x0069
            r0 = 6
            if (r1 == r0) goto L_0x0026
            r0 = 7
            if (r1 == r0) goto L_0x004a
            r0 = 8
            if (r1 != r0) goto L_0x0089
            java.lang.Integer r1 = r5.A0c(r6, r7)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x0025
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x004a
        L_0x0025:
            return r4
        L_0x0026:
            java.lang.String r2 = r6.A1P()
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            java.lang.Class r3 = java.lang.Short.TYPE
            java.lang.Integer r1 = r5.A0e(r7, r0, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x0069
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x0025
            java.lang.String r2 = r2.trim()
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x004f
            r5.A0v(r7, r2)
            return r4
        L_0x004a:
            short r4 = r6.A0Z()
            return r4
        L_0x004f:
            int r1 = X.16T.A02(r2)     // Catch:{ IllegalArgumentException -> 0x005d }
            r0 = -32768(0xffffffffffff8000, float:NaN)
            if (r1 < r0) goto L_0x0099
            r0 = 32767(0x7fff, float:4.5916E-41)
            if (r1 > r0) goto L_0x0099
            short r4 = (short) r1     // Catch:{ IllegalArgumentException -> 0x005d }
            return r4
        L_0x005d:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "not a valid `short` value"
            r7.A0e(r3, r2, r0, r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0069:
            r5.A0s(r7)
            return r4
        L_0x006d:
            X.4fA r0 = X.C269464fA.UNWRAP_SINGLE_VALUE_ARRAYS
            boolean r0 = r7.A0j(r0)
            if (r0 == 0) goto L_0x0089
            X.16L r1 = r6.A1J()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x0081
            r5.A0q(r6, r7)
            goto L_0x00a4
        L_0x0081:
            short r4 = r5.A0o(r6, r7)
            r5.A0p(r6, r7)
            return r4
        L_0x0089:
            java.lang.Class r0 = java.lang.Short.TYPE
            X.4eF r0 = r7.A0A(r0)
            r7.A0R(r6, r0)
            goto L_0x00a4
        L_0x0093:
            java.lang.Class r0 = java.lang.Short.TYPE
            r7.A0T(r6, r0)
            goto L_0x00a4
        L_0x0099:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0 = 827(0x33b, float:1.159E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            r7.A0e(r3, r2, r0, r1)
        L_0x00a4:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.A0o(X.16F, X.4fV):short");
    }

    public final void A0p(16F r3, C269674fV r4) {
        if (r3.A1J() != 16L.A08) {
            A0t(r4);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        if (A08(r3) != false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0w(X.16F r7, X.C269674fV r8) {
        /*
            r6 = this;
            int r1 = r7.A0x()
            r5 = 1
            r4 = 0
            if (r1 == r5) goto L_0x0014
            r0 = 3
            if (r1 == r0) goto L_0x0062
            r0 = 6
            if (r1 == r0) goto L_0x001e
            r0 = 7
            if (r1 == r0) goto L_0x0076
            switch(r1) {
                case 9: goto L_0x008c;
                case 10: goto L_0x004d;
                case 11: goto L_0x0081;
                default: goto L_0x0014;
            }
        L_0x0014:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r8.A0T(r7, r0)
        L_0x0019:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001e:
            java.lang.String r3 = r7.A1P()
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            java.lang.Class r2 = java.lang.Boolean.TYPE
            java.lang.Integer r1 = r6.A0e(r8, r0, r3)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x0081
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x004d
            java.lang.String r3 = r3.trim()
            int r1 = r3.length()
            r0 = 4
            if (r1 != r0) goto L_0x0044
            boolean r0 = A09(r3)
            if (r0 == 0) goto L_0x004e
            return r5
        L_0x0044:
            r0 = 5
            if (r1 != r0) goto L_0x004e
            boolean r0 = A08(r3)
            if (r0 == 0) goto L_0x004e
        L_0x004d:
            return r4
        L_0x004e:
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x005a
            r6.A0v(r8, r3)
            return r4
        L_0x005a:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "only \"true\"/\"True\"/\"TRUE\" or \"false\"/\"False\"/\"FALSE\" recognized"
            r8.A0e(r2, r3, r0, r1)
            goto L_0x0019
        L_0x0062:
            X.4fA r0 = X.C269464fA.UNWRAP_SINGLE_VALUE_ARRAYS
            boolean r0 = r8.A0j(r0)
            if (r0 == 0) goto L_0x0014
            X.16L r1 = r7.A1J()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x0085
            r6.A0q(r7, r8)
            goto L_0x0019
        L_0x0076:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r6.A0Y(r7, r8)
            boolean r0 = r1.equals(r0)
            return r0
        L_0x0081:
            r6.A0s(r8)
            return r4
        L_0x0085:
            boolean r5 = r6.A0w(r7, r8)
            r6.A0p(r7, r8)
        L_0x008c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.A0w(X.16F, X.4fV):boolean");
    }

    public StdDeserializer(StdDeserializer stdDeserializer) {
        this.A00 = stdDeserializer.A00;
        this.A01 = stdDeserializer.A01;
    }

    public StdDeserializer(Class cls) {
        this.A00 = cls;
        this.A01 = null;
    }
}

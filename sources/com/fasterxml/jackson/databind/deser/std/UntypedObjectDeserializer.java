package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.16G;
import X.16L;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass4eE;
import X.C13901TjO;
import X.C268894eF;
import X.C268934eJ;
import X.C269454f9;
import X.C269464fA;
import X.C269564fK;
import X.C269574fL;
import X.C269674fV;
import X.C269684fW;
import X.C269774ff;
import X.C269784fg;
import X.DbV;
import X.Qlt;
import X.S7X;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@JacksonStdImpl
public class UntypedObjectDeserializer extends StdDeserializer implements C269774ff, C269784fg {
    public static final Object[] A07 = new Object[0];
    public JsonDeserializer A00;
    public JsonDeserializer A01;
    public JsonDeserializer A02;
    public JsonDeserializer A03;
    public C268894eF A04;
    public C268894eF A05;
    public final boolean A06;

    @JacksonStdImpl
    public class Vanilla extends StdDeserializer {
        public static final Vanilla A01 = new Vanilla(false);
        public final boolean A00;

        public final Object A0D(16F r2, C269674fV r3) {
            return A00(r2, r3, 0);
        }

        public Vanilla(boolean z) {
            super(Object.class);
            this.A00 = z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
            if (r2 != null) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
            r1 = X.DbS.A0x(2);
            r1.put(r14, r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
            return r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
            r10.A1J();
            r13 = A00(r10, r11, r3);
            r15 = r10.A1N();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
            if (r15 != null) goto L_0x0069;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
            r1 = X.DbS.A0x(4);
            r1.put(r14, r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
            if (r1.put(r2, r13) == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
            A0y(r10, r11, r12, r13, r14, r15, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
            return r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0069, code lost:
            r1 = X.AnonymousClass7TE.A1H();
            r1.put(r14, r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
            if (r1.put(r2, r13) != null) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
            r14 = r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
            r10.A1J();
            r13 = A00(r10, r11, r3);
            r12 = r1.put(r14, r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
            if (r12 == null) goto L_0x0089;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0084, code lost:
            r15 = r10.A1N();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0089, code lost:
            r14 = r10.A1N();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x008d, code lost:
            if (r14 != null) goto L_0x0077;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x008f, code lost:
            return r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x009a, code lost:
            throw new X.1bD(r10, "JSON is too deeply nested.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
            if (r10.A1J() == X.16L.A09) goto L_0x0026;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
            return X.DbS.A0x(2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x016f, code lost:
            return r10.A0p();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
            if (r4 > 1000) goto L_0x0095;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
            return r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
            r3 = r20 + 1;
            r14 = r10.A0Y();
            r10.A1J();
            r12 = A00(r10, r11, r3);
            r2 = r10.A1N();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.Object A00(X.16F r18, X.C269674fV r19, int r20) {
            /*
                r17 = this;
                r10 = r18
                int r0 = r10.A0x()
                java.lang.String r3 = "JSON is too deeply nested."
                r2 = 1000(0x3e8, float:1.401E-42)
                r5 = 2
                r9 = r17
                r11 = r19
                r4 = r20
                switch(r0) {
                    case 1: goto L_0x001e;
                    case 2: goto L_0x0026;
                    case 3: goto L_0x009b;
                    case 4: goto L_0x0014;
                    case 5: goto L_0x002b;
                    case 6: goto L_0x014d;
                    case 7: goto L_0x0152;
                    case 8: goto L_0x015e;
                    case 9: goto L_0x0170;
                    case 10: goto L_0x0173;
                    case 11: goto L_0x0176;
                    case 12: goto L_0x0090;
                    default: goto L_0x0014;
                }
            L_0x0014:
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                r11.A0T(r10, r0)
                X.00P r0 = X.AnonymousClass00P.createAndThrow()
                throw r0
            L_0x001e:
                X.16L r1 = r10.A1J()
                X.16L r0 = X.16L.A09
                if (r1 != r0) goto L_0x002b
            L_0x0026:
                java.util.LinkedHashMap r1 = X.DbS.A0x(r5)
                return r1
            L_0x002b:
                if (r4 > r2) goto L_0x0095
                int r3 = r20 + 1
                java.lang.String r14 = r10.A0Y()
                r10.A1J()
                java.lang.Object r12 = r9.A00(r10, r11, r3)
                java.lang.String r2 = r10.A1N()
                if (r2 != 0) goto L_0x0048
                java.util.LinkedHashMap r1 = X.DbS.A0x(r5)
                r1.put(r14, r12)
                return r1
            L_0x0048:
                r10.A1J()
                java.lang.Object r13 = r9.A00(r10, r11, r3)
                java.lang.String r15 = r10.A1N()
                if (r15 != 0) goto L_0x0069
                r0 = 4
                java.util.LinkedHashMap r1 = X.DbS.A0x(r0)
                r1.put(r14, r12)
                java.lang.Object r0 = r1.put(r2, r13)
                if (r0 == 0) goto L_0x0094
            L_0x0063:
                r16 = r1
                r9.A0y(r10, r11, r12, r13, r14, r15, r16)
                return r1
            L_0x0069:
                java.util.LinkedHashMap r1 = X.AnonymousClass7TE.A1H()
                r1.put(r14, r12)
                java.lang.Object r0 = r1.put(r2, r13)
                if (r0 != 0) goto L_0x0063
                r14 = r15
            L_0x0077:
                r10.A1J()
                java.lang.Object r13 = r9.A00(r10, r11, r3)
                java.lang.Object r12 = r1.put(r14, r13)
                if (r12 == 0) goto L_0x0089
                java.lang.String r15 = r10.A1N()
                goto L_0x0063
            L_0x0089:
                java.lang.String r14 = r10.A1N()
                if (r14 != 0) goto L_0x0077
                return r1
            L_0x0090:
                java.lang.Object r1 = r10.A0V()
            L_0x0094:
                return r1
            L_0x0095:
                X.1bD r0 = new X.1bD
                r0.<init>(r10, r3)
                throw r0
            L_0x009b:
                X.16L r0 = r10.A1J()
                X.16L r8 = X.16L.A08
                if (r0 != r8) goto L_0x00b3
                X.4fA r0 = X.C269464fA.USE_JAVA_ARRAY_FOR_JSON_ARRAY
                boolean r0 = r11.A0j(r0)
                if (r0 == 0) goto L_0x00ae
                java.lang.Object[] r0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.A07
                return r0
            L_0x00ae:
                java.util.ArrayList r1 = X.DbS.A0v(r5)
                return r1
            L_0x00b3:
                if (r4 > r2) goto L_0x0147
                X.4fA r0 = X.C269464fA.USE_JAVA_ARRAY_FOR_JSON_ARRAY
                boolean r0 = r11.A0j(r0)
                if (r0 == 0) goto L_0x00ec
                int r6 = r20 + 1
                X.S7X r5 = r11.A0M()
                java.lang.Object[] r4 = r5.A03()
                r3 = 0
            L_0x00c8:
                java.lang.Object r1 = r9.A00(r10, r11, r6)
                int r0 = r4.length
                if (r3 < r0) goto L_0x00d4
                java.lang.Object[] r4 = r5.A04(r4)
                r3 = 0
            L_0x00d4:
                int r2 = r3 + 1
                r4[r3] = r1
                X.16L r0 = r10.A1J()
                if (r0 != r8) goto L_0x00ea
                int r1 = r5.A00
                int r1 = r1 + r2
                java.lang.Object[] r0 = new java.lang.Object[r1]
                r5.A02(r4, r1, r2, r0)
                r5.A00()
                return r0
            L_0x00ea:
                r3 = r2
                goto L_0x00c8
            L_0x00ec:
                r1 = 1
                int r7 = r20 + 1
                java.lang.Object r4 = r9.A00(r10, r11, r7)
                X.16L r0 = r10.A1J()
                r6 = 2
                if (r0 != r8) goto L_0x0102
                java.util.ArrayList r1 = X.DbS.A0v(r5)
                r1.add(r4)
                return r1
            L_0x0102:
                java.lang.Object r2 = r9.A00(r10, r11, r7)
                X.16L r0 = r10.A1J()
                if (r0 != r8) goto L_0x0117
                java.util.ArrayList r1 = X.DbS.A0v(r5)
                r1.add(r4)
                r1.add(r2)
                return r1
            L_0x0117:
                X.S7X r5 = r11.A0M()
                java.lang.Object[] r3 = r5.A03()
                r0 = 0
                r3[r0] = r4
                r3[r1] = r2
                r4 = 2
            L_0x0125:
                java.lang.Object r1 = r9.A00(r10, r11, r7)
                int r6 = r6 + 1
                int r0 = r3.length
                if (r4 < r0) goto L_0x0133
                java.lang.Object[] r3 = r5.A04(r3)
                r4 = 0
            L_0x0133:
                int r2 = r4 + 1
                r3[r4] = r1
                X.16L r0 = r10.A1J()
                if (r0 != r8) goto L_0x0145
                java.util.ArrayList r1 = X.DbS.A0v(r6)
                r5.A01(r1, r3, r2)
                return r1
            L_0x0145:
                r4 = r2
                goto L_0x0125
            L_0x0147:
                X.1bD r0 = new X.1bD
                r0.<init>(r10, r3)
                throw r0
            L_0x014d:
                java.lang.String r1 = r10.A1P()
                return r1
            L_0x0152:
                int r1 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.A02
                int r0 = r11.A01
                r1 = r1 & r0
                if (r1 == 0) goto L_0x016b
                java.lang.Object r1 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.A07(r10, r11)
                return r1
            L_0x015e:
                X.4fA r0 = X.C269464fA.USE_BIG_DECIMAL_FOR_FLOATS
                boolean r0 = r11.A0j(r0)
                if (r0 == 0) goto L_0x016b
                java.math.BigDecimal r1 = r10.A0r()
                return r1
            L_0x016b:
                java.lang.Number r1 = r10.A0p()
                return r1
            L_0x0170:
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                return r0
            L_0x0173:
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                return r0
            L_0x0176:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.A00(X.16F, X.4fV, int):java.lang.Object");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
            if (r1 != 5) goto L_0x0017;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object A0C(X.16F r5, X.C269674fV r6, java.lang.Object r7) {
            /*
                r4 = this;
                boolean r0 = r4.A00
                if (r0 != 0) goto L_0x0017
                int r1 = r5.A0x()
                r0 = 1
                if (r1 == r0) goto L_0x003b
                r0 = 2
                if (r1 == r0) goto L_0x003a
                r0 = 3
                if (r1 == r0) goto L_0x001d
                r0 = 4
                if (r1 == r0) goto L_0x003a
                r0 = 5
                if (r1 == r0) goto L_0x0044
            L_0x0017:
                r0 = 0
                java.lang.Object r0 = r4.A00(r5, r6, r0)
                return r0
            L_0x001d:
                X.16L r0 = r5.A1J()
                X.16L r2 = X.16L.A08
                if (r0 == r2) goto L_0x003a
                boolean r0 = r7 instanceof java.util.Collection
                if (r0 == 0) goto L_0x0017
                r1 = r7
                java.util.Collection r1 = (java.util.Collection) r1
            L_0x002c:
                r0 = 0
                java.lang.Object r0 = r4.A00(r5, r6, r0)
                r1.add(r0)
                X.16L r0 = r5.A1J()
                if (r0 != r2) goto L_0x002c
            L_0x003a:
                return r7
            L_0x003b:
                X.16L r1 = r5.A1J()
                X.16L r0 = X.16L.A09
                if (r1 != r0) goto L_0x0044
                return r7
            L_0x0044:
                boolean r0 = r7 instanceof java.util.Map
                if (r0 == 0) goto L_0x0017
                r3 = r7
                java.util.Map r3 = (java.util.Map) r3
                java.lang.String r2 = r5.A0Y()
            L_0x004f:
                r5.A1J()
                java.lang.Object r1 = r3.get(r2)
                if (r1 == 0) goto L_0x0068
                java.lang.Object r0 = r4.A0C(r5, r6, r1)
            L_0x005c:
                if (r0 == r1) goto L_0x0061
                r3.put(r2, r0)
            L_0x0061:
                java.lang.String r2 = r5.A1N()
                if (r2 != 0) goto L_0x004f
                return r7
            L_0x0068:
                r0 = 0
                java.lang.Object r0 = r4.A00(r5, r6, r0)
                goto L_0x005c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.A0C(X.16F, X.4fV, java.lang.Object):java.lang.Object");
        }

        public final Boolean A0G(C269454f9 r2) {
            if (this.A00) {
                return Boolean.FALSE;
            }
            return null;
        }

        public final Integer A0I() {
            return AnonymousClass05K.A0Y;
        }

        public final void A0y(16F r5, C269674fV r6, Object obj, Object obj2, String str, String str2, Map map) {
            boolean A0i = r6.A0i(16G.A02);
            if (A0i) {
                if (obj instanceof List) {
                    ((List) obj).add(obj2);
                    map.put(str, obj);
                } else {
                    ArrayList A14 = DbV.A14(obj);
                    A14.add(obj2);
                    map.put(str, A14);
                }
            }
            while (str2 != null) {
                r5.A1J();
                Object A002 = A00(r5, r6, 0);
                Object put = map.put(str2, A002);
                if (put != null && A0i) {
                    if (put instanceof List) {
                        ((List) put).add(A002);
                        map.put(str2, put);
                    } else {
                        ArrayList A142 = DbV.A14(put);
                        A142.add(A002);
                        map.put(str2, A142);
                    }
                }
                str2 = r5.A1N();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
            return r3.A0p();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object A0J(X.16F r3, X.C269674fV r4, X.C11287SJg r5) {
            /*
                r2 = this;
                int r1 = r3.A0x()
                r0 = 1
                if (r1 == r0) goto L_0x0048
                r0 = 3
                if (r1 == r0) goto L_0x0048
                switch(r1) {
                    case 5: goto L_0x0048;
                    case 6: goto L_0x0043;
                    case 7: goto L_0x0031;
                    case 8: goto L_0x0024;
                    case 9: goto L_0x0021;
                    case 10: goto L_0x001e;
                    case 11: goto L_0x001c;
                    case 12: goto L_0x0017;
                    default: goto L_0x000d;
                }
            L_0x000d:
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                r4.A0T(r3, r0)
                X.00P r0 = X.AnonymousClass00P.createAndThrow()
                throw r0
            L_0x0017:
                java.lang.Object r0 = r3.A0V()
                return r0
            L_0x001c:
                r0 = 0
                return r0
            L_0x001e:
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                return r0
            L_0x0021:
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                return r0
            L_0x0024:
                X.4fA r0 = X.C269464fA.USE_BIG_DECIMAL_FOR_FLOATS
                boolean r0 = r4.A0j(r0)
                if (r0 == 0) goto L_0x003e
                java.math.BigDecimal r0 = r3.A0r()
                return r0
            L_0x0031:
                X.4fA r0 = X.C269464fA.USE_BIG_INTEGER_FOR_INTS
                boolean r0 = r4.A0j(r0)
                if (r0 == 0) goto L_0x003e
                java.math.BigInteger r0 = r3.A0s()
                return r0
            L_0x003e:
                java.lang.Number r0 = r3.A0p()
                return r0
            L_0x0043:
                java.lang.String r0 = r3.A1P()
                return r0
            L_0x0048:
                java.lang.Object r0 = r5.A03(r3, r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.A0J(X.16F, X.4fV, X.SJg):java.lang.Object");
        }

        public Vanilla() {
            this(false);
        }
    }

    public UntypedObjectDeserializer(UntypedObjectDeserializer untypedObjectDeserializer, boolean z) {
        super(Object.class);
        this.A01 = untypedObjectDeserializer.A01;
        this.A00 = untypedObjectDeserializer.A00;
        this.A03 = untypedObjectDeserializer.A03;
        this.A02 = untypedObjectDeserializer.A02;
        this.A04 = untypedObjectDeserializer.A04;
        this.A05 = untypedObjectDeserializer.A05;
        this.A06 = z;
    }

    public final LinkedHashMap A0z(16F r19, C269674fV r20) {
        String str;
        LinkedHashMap linkedHashMap;
        16F r3 = r19;
        16L A10 = r3.A10();
        C269674fV r4 = r20;
        if (A10 == 16L.A0D) {
            str = r3.A1N();
        } else if (A10 == 16L.A0A) {
            str = r3.A0Y();
        } else if (A10 != 16L.A09) {
            r4.A0T(r3, A0H());
            throw AnonymousClass00P.createAndThrow();
        } else {
            str = null;
        }
        if (str == null) {
            return new LinkedHashMap(2);
        }
        r3.A1J();
        Object A0D = A0D(r3, r4);
        String A1N = r3.A1N();
        if (A1N == null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(2);
            linkedHashMap2.put(str, A0D);
            return linkedHashMap2;
        }
        r3.A1J();
        Object A0D2 = A0D(r3, r4);
        String A1N2 = r3.A1N();
        if (A1N2 == null) {
            linkedHashMap = new LinkedHashMap(4);
            linkedHashMap.put(str, A0D);
            if (linkedHashMap.put(A1N, A0D2) == null) {
                return linkedHashMap;
            }
        } else {
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(str, A0D);
            if (linkedHashMap.put(A1N, A0D2) == null) {
                do {
                    r3.A1J();
                    Object A0D3 = A0D(r3, r4);
                    Object put = linkedHashMap.put(A1N2, A0D3);
                    if (put != null) {
                        A10(r3, r4, put, A0D3, A1N2, r3.A1N(), linkedHashMap);
                        return linkedHashMap;
                    }
                    A1N2 = r3.A1N();
                } while (A1N2 != null);
                return linkedHashMap;
            }
        }
        A10(r3, r4, A0D, A0D2, str, A1N2, linkedHashMap);
        return linkedHashMap;
    }

    public final void A10(16F r5, C269674fV r6, Object obj, Object obj2, String str, String str2, Map map) {
        boolean A0i = r6.A0i(16G.A02);
        if (A0i) {
            if (obj instanceof List) {
                ((List) obj).add(obj2);
                map.put(str, obj);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(obj);
                arrayList.add(obj2);
                map.put(str, arrayList);
            }
        }
        while (str2 != null) {
            r5.A1J();
            Object A0D = A0D(r5, r6);
            Object put = map.put(str2, A0D);
            if (put != null && A0i) {
                if (put instanceof List) {
                    ((List) put).add(A0D);
                    map.put(str, put);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(put);
                    arrayList2.add(A0D);
                    map.put(str, arrayList2);
                }
            }
            str2 = r5.A1N();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        if (java.lang.Boolean.FALSE.equals((java.lang.Object) null) == false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.JsonDeserializer ALh(X.C13901TjO r4, X.C269674fV r5) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x000c
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0 = 0
            boolean r0 = r1.equals(r0)
            r2 = 1
            if (r0 != 0) goto L_0x000d
        L_0x000c:
            r2 = 0
        L_0x000d:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r3.A03
            if (r0 != 0) goto L_0x0031
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r3.A02
            if (r0 != 0) goto L_0x0031
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r3.A01
            if (r0 != 0) goto L_0x0031
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r3.A00
            if (r0 != 0) goto L_0x0031
            java.lang.Class r1 = r3.getClass()
            java.lang.Class<com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer> r0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.class
            if (r1 != r0) goto L_0x0031
            if (r2 == 0) goto L_0x002e
            r1 = 1
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla r0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla
            r0.<init>(r1)
            return r0
        L_0x002e:
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla r0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.A01
            return r0
        L_0x0031:
            boolean r0 = r3.A06
            if (r2 == r0) goto L_0x003b
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer r0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer
            r0.<init>((com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer) r3, (boolean) r2)
            return r0
        L_0x003b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.ALh(X.TjO, X.4fV):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    public final void EIS(C269674fV r8) {
        C269684fW r3;
        C269564fK r2;
        JsonDeserializer A012;
        JsonDeserializer A013;
        C268894eF A0A = r8.A0A(Object.class);
        C268894eF A0A2 = r8.A0A(String.class);
        AnonymousClass4eE A052 = r8.A05();
        C268894eF r0 = this.A04;
        if (r0 == null) {
            Qlt A0A3 = A052.A0A(A0A, List.class);
            r3 = r8.A03;
            r2 = r8.A04;
            A012 = r3.A01(r8, A0A3, r2);
            if (C269574fL.A0K(A012)) {
                A012 = null;
            }
        } else {
            r3 = r8.A03;
            r2 = r8.A04;
            A012 = r3.A01(r8, r0, r2);
        }
        this.A00 = A012;
        C268894eF r02 = this.A05;
        if (r02 == null) {
            A013 = r3.A01(r8, A052.A0B(A0A2, A0A, Map.class), r2);
            if (C269574fL.A0K(A013)) {
                A013 = null;
            }
        } else {
            A013 = r3.A01(r8, r02, r2);
        }
        this.A01 = A013;
        JsonDeserializer A014 = r3.A01(r8, A0A2, r2);
        if (C269574fL.A0K(A014)) {
            A014 = null;
        }
        this.A03 = A014;
        JsonDeserializer A015 = r3.A01(r8, A052.A09(Number.class), r2);
        if (C269574fL.A0K(A015)) {
            A015 = null;
        }
        this.A02 = A015;
        C268934eJ r22 = AnonymousClass4eE.A07;
        this.A01 = r8.A0D((C13901TjO) null, r22, this.A01);
        this.A00 = r8.A0D((C13901TjO) null, r22, this.A00);
        this.A03 = r8.A0D((C13901TjO) null, r22, this.A03);
        this.A02 = r8.A0D((C13901TjO) null, r22, this.A02);
    }

    public final Object A0D(16F r3, C269674fV r4) {
        switch (r3.A0x()) {
            case 1:
            case 2:
            case 5:
                JsonDeserializer jsonDeserializer = this.A01;
                if (jsonDeserializer != null) {
                    return jsonDeserializer.A0D(r3, r4);
                }
                return A0z(r3, r4);
            case 3:
                if (r4.A0j(C269464fA.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                    return A11(r3, r4);
                }
                JsonDeserializer jsonDeserializer2 = this.A00;
                if (jsonDeserializer2 != null) {
                    return jsonDeserializer2.A0D(r3, r4);
                }
                return A0y(r3, r4);
            case 6:
                JsonDeserializer jsonDeserializer3 = this.A03;
                if (jsonDeserializer3 != null) {
                    return jsonDeserializer3.A0D(r3, r4);
                }
                return r3.A1P();
            case 7:
                JsonDeserializer jsonDeserializer4 = this.A02;
                if (jsonDeserializer4 != null) {
                    return jsonDeserializer4.A0D(r3, r4);
                }
                if ((StdDeserializer.A02 & r4.A01) != 0) {
                    return StdDeserializer.A07(r3, r4);
                }
                return r3.A0p();
            case 8:
                JsonDeserializer jsonDeserializer5 = this.A02;
                if (jsonDeserializer5 != null) {
                    return jsonDeserializer5.A0D(r3, r4);
                }
                if (r4.A0j(C269464fA.USE_BIG_DECIMAL_FOR_FLOATS)) {
                    return r3.A0r();
                }
                return r3.A0p();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return r3.A0V();
            default:
                r4.A0T(r3, Object.class);
                throw AnonymousClass00P.createAndThrow();
        }
    }

    public final ArrayList A0y(16F r9, C269674fV r10) {
        16L A1J = r9.A1J();
        16L r7 = 16L.A08;
        int i = 2;
        if (A1J == r7) {
            return new ArrayList(2);
        }
        Object A0D = A0D(r9, r10);
        if (r9.A1J() == r7) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(A0D);
            return arrayList;
        }
        Object A0D2 = A0D(r9, r10);
        if (r9.A1J() == r7) {
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(A0D);
            arrayList2.add(A0D2);
            return arrayList2;
        }
        S7X A0M = r10.A0M();
        Object[] A032 = A0M.A03();
        A032[0] = A0D;
        A032[1] = A0D2;
        int i2 = 2;
        while (true) {
            Object A0D3 = A0D(r9, r10);
            i++;
            if (i2 >= A032.length) {
                A032 = A0M.A04(A032);
                i2 = 0;
            }
            int i3 = i2 + 1;
            A032[i2] = A0D3;
            if (r9.A1J() == r7) {
                ArrayList arrayList3 = new ArrayList(i);
                A0M.A01(arrayList3, A032, i3);
                return arrayList3;
            }
            i2 = i3;
        }
    }

    public final Object[] A11(16F r8, C269674fV r9) {
        16L A1J = r8.A1J();
        16L r6 = 16L.A08;
        if (A1J == r6) {
            return A07;
        }
        S7X A0M = r9.A0M();
        Object[] A032 = A0M.A03();
        int i = 0;
        while (true) {
            Object A0D = A0D(r8, r9);
            if (i >= A032.length) {
                A032 = A0M.A04(A032);
                i = 0;
            }
            int i2 = i + 1;
            A032[i] = A0D;
            if (r8.A1J() == r6) {
                int i3 = A0M.A00 + i2;
                Object[] objArr = new Object[i3];
                A0M.A02(A032, i3, i2, objArr);
                A0M.A00();
                return objArr;
            }
            i = i2;
        }
    }

    public UntypedObjectDeserializer(C268894eF r2, C268894eF r3) {
        super(Object.class);
        this.A04 = r2;
        this.A05 = r3;
        this.A06 = false;
    }

    @Deprecated
    public UntypedObjectDeserializer() {
        this((C268894eF) null, (C268894eF) null);
    }
}

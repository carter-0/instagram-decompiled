package com.fasterxml.jackson.databind.ser.std;

import X.16L;
import X.17Z;
import X.AnonymousClass00P;
import X.AnonymousClass4eE;
import X.AnonymousClass4iE;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C10798RyK;
import X.C13901TjO;
import X.C268894eF;
import X.C269204ek;
import X.C269504fE;
import X.C269574fL;
import X.C269714fZ;
import X.C8245Qkz;
import X.SIF;
import X.SPK;
import X.SQ7;
import X.T9R;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@JacksonStdImpl
public class MapSerializer extends ContainerSerializer implements C269714fZ {
    public static final Object A0F = C269204ek.NON_EMPTY;
    public static final C268894eF A0G = AnonymousClass4eE.A07;
    public JsonSerializer A00;
    public JsonSerializer A01;
    public SIF A02;
    public final C13901TjO A03;
    public final C268894eF A04;
    public final SPK A05;
    public final T9R A06;
    public final Object A07;
    public final Object A08;
    public final boolean A09;
    public final boolean A0A;
    public final C268894eF A0B;
    public final Set A0C;
    public final Set A0D;
    public final boolean A0E;

    public MapSerializer(MapSerializer mapSerializer, Object obj, boolean z) {
        super(Map.class, false);
        this.A0C = mapSerializer.A0C;
        this.A0D = mapSerializer.A0D;
        this.A0B = mapSerializer.A0B;
        this.A04 = mapSerializer.A04;
        this.A0E = mapSerializer.A0E;
        this.A05 = mapSerializer.A05;
        this.A00 = mapSerializer.A00;
        this.A01 = mapSerializer.A01;
        this.A02 = C8245Qkz.A00;
        this.A03 = mapSerializer.A03;
        this.A07 = obj;
        this.A09 = z;
        this.A08 = mapSerializer.A08;
        this.A0A = mapSerializer.A0A;
        this.A06 = mapSerializer.A06;
    }

    public static MapSerializer A04(C268894eF r10, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, SPK spk, Object obj, Set set, Set set2, boolean z) {
        C268894eF A042;
        C268894eF A032;
        if (r10 == null) {
            A042 = A0G;
            A032 = A042;
        } else {
            A042 = r10.A04();
            if (r10.A00 == Properties.class) {
                A032 = AnonymousClass4eE.A07;
            } else {
                A032 = r10.A03();
            }
        }
        boolean z2 = false;
        if (z) {
            z2 = true;
            if (A032.A00 == Object.class) {
                z2 = false;
            }
        } else if (A032 != null && Modifier.isFinal(A032.A00.getModifiers())) {
            z2 = true;
        }
        MapSerializer mapSerializer = new MapSerializer(A042, A032, jsonSerializer, jsonSerializer2, spk, set, set2, z2);
        if (obj == null || mapSerializer.A07 == obj) {
            return mapSerializer;
        }
        C269574fL.A0E(MapSerializer.class, mapSerializer, "withFilterId");
        return new MapSerializer(mapSerializer, obj, mapSerializer.A09);
    }

    public final /* bridge */ /* synthetic */ void A09(17Z r2, C269504fE r3, SPK spk, Object obj) {
        Map map = (Map) obj;
        r2.A0F(map);
        C10798RyK A002 = SPK.A00(r2, 16L.A0D, spk, map);
        A0F(r2, r3, map);
        spk.A04(r2, A002);
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r1, C269504fE r2, Object obj) {
        Map map = (Map) obj;
        r1.A0o(map);
        A0F(r1, r2, map);
        r1.A0Z();
    }

    public final /* bridge */ /* synthetic */ boolean A0B(C269504fE r6, Object obj) {
        boolean equals;
        Map map = (Map) obj;
        if (map.isEmpty()) {
            return true;
        }
        Object obj2 = this.A08;
        if (obj2 == null && !this.A0A) {
            return false;
        }
        JsonSerializer jsonSerializer = this.A01;
        boolean A1W = AnonymousClass7TF.A1W(A0F, obj2);
        Iterator A0v = AnonymousClass7TF.A0v(map);
        if (jsonSerializer != null) {
            while (A0v.hasNext()) {
                Object next = A0v.next();
                if (next != null) {
                    if (A1W) {
                        equals = jsonSerializer.A0B(r6, next);
                    } else if (obj2 == null) {
                        return false;
                    } else {
                        equals = obj2.equals(map);
                    }
                    if (!equals) {
                        return false;
                    }
                } else if (!this.A0A) {
                    return false;
                }
            }
            return true;
        }
        while (A0v.hasNext()) {
            Object next2 = A0v.next();
            if (next2 != null) {
                try {
                    JsonSerializer A032 = A03(r6, next2);
                    if (A1W) {
                        if (!A032.A0B(r6, next2)) {
                            return false;
                        }
                    } else if (obj2 == null || !obj2.equals(map)) {
                        return false;
                    }
                } catch (AnonymousClass4iE unused) {
                    return false;
                }
            } else if (!this.A0A) {
                return false;
            }
        }
        return true;
    }

    public final void A0E(17Z r8, C269504fE r9, Object obj, Map map) {
        JsonSerializer jsonSerializer;
        JsonSerializer jsonSerializer2;
        boolean equals;
        boolean A1W = AnonymousClass7TF.A1W(A0F, obj);
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            Object key = A1J.getKey();
            if (key == null) {
                jsonSerializer = r9.A00;
            } else {
                T9R t9r = this.A06;
                if (t9r == null || !t9r.A00(key)) {
                    jsonSerializer = this.A00;
                }
            }
            Object value = A1J.getValue();
            if (value != null) {
                jsonSerializer2 = this.A01;
                if (jsonSerializer2 == null) {
                    jsonSerializer2 = A03(r9, value);
                }
                if (A1W) {
                    equals = jsonSerializer2.A0B(r9, value);
                } else if (obj != null) {
                    equals = obj.equals(value);
                }
                if (equals) {
                }
            } else if (!this.A0A) {
                jsonSerializer2 = r9.A01;
            }
            jsonSerializer.A0A(r8, r9, key);
            try {
                jsonSerializer2.A09(r8, r9, this.A05, value);
            } catch (Exception e) {
                StdSerializer.A01(r9, map, String.valueOf(key), e);
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008f, code lost:
        if (r0 != null) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0129, code lost:
        if (r6 != 1) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0147, code lost:
        if (r15.A04.A02() != false) goto L_0x0149;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d A[PHI: r4 
      PHI: (r4v4 com.fasterxml.jackson.databind.JsonSerializer) = (r4v3 com.fasterxml.jackson.databind.JsonSerializer), (r4v9 com.fasterxml.jackson.databind.JsonSerializer) binds: [B:12:0x002a, B:14:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0154  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.JsonSerializer ALi(X.C13901TjO r19, X.C269504fE r20) {
        /*
            r18 = this;
            r5 = r20
            X.4et r8 = r5.A05
            X.4eA r10 = r8.A01()
            r3 = 0
            r15 = r18
            r12 = r19
            if (r19 != 0) goto L_0x0072
            r9 = r3
        L_0x0010:
            r6 = 0
            r4 = r3
        L_0x0012:
            com.fasterxml.jackson.databind.JsonSerializer r0 = r15.A01
        L_0x0014:
            com.fasterxml.jackson.databind.JsonSerializer r14 = r15.A0C(r12, r0, r5)
            if (r14 != 0) goto L_0x002a
            boolean r0 = r15.A0E
            if (r0 == 0) goto L_0x002a
            X.4eF r2 = r15.A04
            java.lang.Class r1 = r2.A00
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r1 == r0) goto L_0x002a
            com.fasterxml.jackson.databind.JsonSerializer r14 = r5.A0B(r12, r2)
        L_0x002a:
            if (r4 != 0) goto L_0x006d
            com.fasterxml.jackson.databind.JsonSerializer r4 = r15.A00
            if (r4 != 0) goto L_0x006d
            X.4eF r0 = r15.A0B
            com.fasterxml.jackson.databind.JsonSerializer r13 = r5.A0C(r12, r0)
        L_0x0036:
            java.util.Set r1 = r15.A0C
            java.util.Set r0 = r15.A0D
            r4 = 0
            if (r6 == 0) goto L_0x00c0
            X.T9o r6 = r10.A05(r9)
            boolean r2 = r6.A01
            if (r2 == 0) goto L_0x006a
            java.util.Set r6 = java.util.Collections.emptySet()
        L_0x0049:
            if (r6 == 0) goto L_0x0094
            boolean r2 = r6.isEmpty()
            if (r2 != 0) goto L_0x0094
            if (r1 != 0) goto L_0x0065
            java.util.HashSet r1 = X.AnonymousClass7TE.A1F()
        L_0x0057:
            java.util.Iterator r6 = r6.iterator()
        L_0x005b:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0094
            X.JTT.A1U(r1, r6)
            goto L_0x005b
        L_0x0065:
            java.util.HashSet r1 = X.C66580MXl.A12(r1)
            goto L_0x0057
        L_0x006a:
            java.util.Set r6 = r6.A00
            goto L_0x0049
        L_0x006d:
            com.fasterxml.jackson.databind.JsonSerializer r13 = r5.A0F(r12, r4)
            goto L_0x0036
        L_0x0072:
            X.QkH r9 = r12.BRS()
            if (r9 == 0) goto L_0x0010
            if (r10 == 0) goto L_0x0010
            r6 = 1
            java.lang.Object r0 = r10.A0c(r9)
            if (r0 == 0) goto L_0x0092
            com.fasterxml.jackson.databind.JsonSerializer r4 = r5.A0M(r9, r0)
        L_0x0085:
            java.lang.Object r0 = r10.A0X(r9)
            if (r0 == 0) goto L_0x0012
            com.fasterxml.jackson.databind.JsonSerializer r0 = r5.A0M(r9, r0)
            if (r0 != 0) goto L_0x0014
            goto L_0x0012
        L_0x0092:
            r4 = r3
            goto L_0x0085
        L_0x0094:
            X.T9f r2 = r10.A07(r9)
            java.util.Set r2 = r2.A00
            if (r2 == 0) goto L_0x00b5
            if (r0 != 0) goto L_0x00b0
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
        L_0x00a2:
            java.util.Iterator r6 = r2.iterator()
        L_0x00a6:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x00b5
            X.JTT.A1U(r0, r6)
            goto L_0x00a6
        L_0x00b0:
            java.util.HashSet r0 = X.C66580MXl.A12(r0)
            goto L_0x00a2
        L_0x00b5:
            java.lang.Boolean r6 = r10.A0N(r9)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r6 = r2.equals(r6)
            goto L_0x00c1
        L_0x00c0:
            r6 = 0
        L_0x00c1:
            java.lang.Class<java.util.Map> r7 = java.util.Map.class
            X.4ev r11 = com.fasterxml.jackson.databind.ser.std.StdSerializer.A00(r12, r5, r7)
            if (r11 == 0) goto L_0x00d5
            X.RDC r2 = X.RDC.WRITE_SORTED_MAP_ENTRIES
            java.lang.Boolean r2 = r11.A01(r2)
            if (r2 == 0) goto L_0x00d5
            boolean r6 = r2.booleanValue()
        L_0x00d5:
            java.lang.String r11 = "withResolved"
            java.lang.Class<com.fasterxml.jackson.databind.ser.std.MapSerializer> r2 = com.fasterxml.jackson.databind.ser.std.MapSerializer.class
            X.C269574fL.A0E(r2, r15, r11)
            com.fasterxml.jackson.databind.ser.std.MapSerializer r11 = new com.fasterxml.jackson.databind.ser.std.MapSerializer
            r17 = r0
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17)
            boolean r0 = r11.A09
            if (r6 == r0) goto L_0x00f2
            java.lang.Object r1 = r15.A07
            com.fasterxml.jackson.databind.ser.std.MapSerializer r0 = new com.fasterxml.jackson.databind.ser.std.MapSerializer
            r0.<init>(r11, r1, r6)
            r11 = r0
        L_0x00f2:
            if (r9 == 0) goto L_0x010c
            java.lang.Object r6 = r10.A0a(r9)
            if (r6 == 0) goto L_0x010c
            java.lang.Object r0 = r11.A07
            if (r0 == r6) goto L_0x010c
            java.lang.String r0 = "withFilterId"
            X.C269574fL.A0E(r2, r11, r0)
            boolean r1 = r11.A09
            com.fasterxml.jackson.databind.ser.std.MapSerializer r0 = new com.fasterxml.jackson.databind.ser.std.MapSerializer
            r0.<init>(r11, r6, r1)
            r11 = r0
        L_0x010c:
            if (r19 == 0) goto L_0x0154
            X.4ej r0 = r12.AVP(r8, r7)
        L_0x0112:
            X.4ek r6 = r0.A00
            X.4ek r1 = X.C269204ek.USE_DEFAULTS
            if (r6 == r1) goto L_0x0133
            int r6 = r6.ordinal()
            r1 = 4
            if (r6 == r1) goto L_0x014c
            r1 = 2
            if (r6 == r1) goto L_0x0141
            r1 = 3
            if (r6 == r1) goto L_0x0149
            r1 = 5
            if (r6 == r1) goto L_0x0134
            r0 = 1
            if (r6 == r0) goto L_0x0152
        L_0x012b:
            java.lang.Object r0 = r11.A08
            if (r3 != r0) goto L_0x0159
            boolean r0 = r11.A0A
            if (r4 != r0) goto L_0x0159
        L_0x0133:
            return r11
        L_0x0134:
            java.lang.Class r0 = r0.A02
            java.lang.Object r3 = r5.A0R(r0)
            if (r3 == 0) goto L_0x0152
            boolean r4 = r5.A0V(r3)
            goto L_0x012b
        L_0x0141:
            X.4eF r0 = r15.A04
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0152
        L_0x0149:
            java.lang.Object r3 = A0F
            goto L_0x0152
        L_0x014c:
            X.4eF r0 = r15.A04
            java.lang.Object r3 = X.SQ6.A00(r0)
        L_0x0152:
            r4 = 1
            goto L_0x012b
        L_0x0154:
            X.4ei r0 = r8.A01
            X.4ej r0 = r0.A00
            goto L_0x0112
        L_0x0159:
            java.lang.String r0 = "withContentInclusion"
            X.C269574fL.A0E(r2, r11, r0)
            X.SPK r1 = r11.A05
            com.fasterxml.jackson.databind.ser.std.MapSerializer r0 = new com.fasterxml.jackson.databind.ser.std.MapSerializer
            r0.<init>(r1, r11, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.ALi(X.TjO, X.4fE):com.fasterxml.jackson.databind.JsonSerializer");
    }

    private final JsonSerializer A03(C269504fE r5, Object obj) {
        SIF A012;
        Class<?> cls = obj.getClass();
        SIF sif = this.A02;
        JsonSerializer A002 = sif.A00(cls);
        if (A002 == null) {
            C268894eF r1 = this.A04;
            if (r1.A0J()) {
                C268894eF A0A2 = r5.A0A(r1, cls);
                A002 = r5.A0B(this.A03, A0A2);
                A012 = sif.A01(A002, A0A2.A00);
            } else {
                A002 = r5.A0G(this.A03, cls);
                A012 = sif.A01(A002, cls);
            }
            if (sif != A012) {
                this.A02 = A012;
            }
        }
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r10.A05.A0D(X.C269424f6.ORDER_MAP_ENTRIES_BY_KEYS) != false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(X.17Z r9, X.C269504fE r10, java.util.Map r11) {
        /*
            r8 = this;
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x018d
            boolean r0 = r8.A09
            if (r0 != 0) goto L_0x0014
            X.4f6 r1 = X.C269424f6.ORDER_MAP_ENTRIES_BY_KEYS
            X.4et r0 = r10.A05
            boolean r0 = r0.A0D(r1)
            if (r0 == 0) goto L_0x0078
        L_0x0014:
            boolean r0 = r11 instanceof java.util.SortedMap
            if (r0 != 0) goto L_0x0078
            boolean r0 = r11 instanceof java.util.HashMap
            if (r0 == 0) goto L_0x0072
            r6 = 0
            boolean r0 = r11.containsKey(r6)
            if (r0 == 0) goto L_0x0072
            java.util.TreeMap r5 = new java.util.TreeMap
            r5.<init>()
            java.util.Iterator r7 = X.AnonymousClass7TF.A0u(r11)
        L_0x002c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0077
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r7)
            java.lang.Object r0 = r1.getKey()
            java.lang.Object r4 = r1.getValue()
            if (r0 != 0) goto L_0x006e
            com.fasterxml.jackson.databind.JsonSerializer r3 = r10.A00
            if (r4 != 0) goto L_0x004b
            boolean r0 = r8.A0A
            if (r0 != 0) goto L_0x002c
            com.fasterxml.jackson.databind.JsonSerializer r2 = r10.A01
            goto L_0x0067
        L_0x004b:
            com.fasterxml.jackson.databind.JsonSerializer r2 = r8.A01
            if (r2 != 0) goto L_0x0053
            com.fasterxml.jackson.databind.JsonSerializer r2 = r8.A03(r10, r4)
        L_0x0053:
            java.lang.Object r1 = r8.A08
            java.lang.Object r0 = A0F
            if (r1 != r0) goto L_0x0060
            boolean r0 = r2.A0B(r10, r4)
        L_0x005d:
            if (r0 == 0) goto L_0x0067
            goto L_0x002c
        L_0x0060:
            if (r1 == 0) goto L_0x0067
            boolean r0 = r1.equals(r4)
            goto L_0x005d
        L_0x0067:
            r3.A0A(r9, r10, r6)     // Catch:{ Exception -> 0x017f }
            r2.A0A(r9, r10, r4)     // Catch:{ Exception -> 0x017f }
            goto L_0x002c
        L_0x006e:
            r5.put(r0, r4)
            goto L_0x002c
        L_0x0072:
            java.util.TreeMap r5 = new java.util.TreeMap
            r5.<init>(r11)
        L_0x0077:
            r11 = r5
        L_0x0078:
            java.lang.Object r0 = r8.A07
            if (r0 == 0) goto L_0x0081
            r8.A0D(r10, r0)
            goto L_0x0185
        L_0x0081:
            java.lang.Object r5 = r8.A08
            if (r5 != 0) goto L_0x011c
            boolean r0 = r8.A0A
            if (r0 != 0) goto L_0x011c
            com.fasterxml.jackson.databind.JsonSerializer r6 = r8.A01
            if (r6 == 0) goto L_0x00ce
            com.fasterxml.jackson.databind.JsonSerializer r5 = r8.A00
            X.SPK r4 = r8.A05
            java.util.Iterator r3 = X.AnonymousClass7TF.A0u(r11)
        L_0x0095:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x018d
            java.util.Map$Entry r2 = X.AnonymousClass7TE.A1J(r3)
            java.lang.Object r7 = r2.getKey()
            X.T9R r0 = r8.A06
            if (r0 == 0) goto L_0x00ae
            boolean r0 = r0.A00(r7)
            if (r0 == 0) goto L_0x00ae
            goto L_0x0095
        L_0x00ae:
            if (r7 != 0) goto L_0x00c0
            com.fasterxml.jackson.databind.JsonSerializer r1 = r10.A00
            r0 = 0
            r1.A0A(r9, r10, r0)
        L_0x00b6:
            java.lang.Object r0 = r2.getValue()
            if (r0 != 0) goto L_0x00c4
            r10.A0T(r9)
            goto L_0x0095
        L_0x00c0:
            r5.A0A(r9, r10, r7)
            goto L_0x00b6
        L_0x00c4:
            if (r4 != 0) goto L_0x00ca
            r6.A0A(r9, r10, r0)     // Catch:{ Exception -> 0x0176 }
            goto L_0x0095
        L_0x00ca:
            r6.A09(r9, r10, r4, r0)     // Catch:{ Exception -> 0x0176 }
            goto L_0x0095
        L_0x00ce:
            X.SPK r0 = r8.A05
            r5 = 0
            if (r0 != 0) goto L_0x018a
            com.fasterxml.jackson.databind.JsonSerializer r4 = r8.A00
            java.util.Iterator r3 = X.AnonymousClass7TF.A0u(r11)     // Catch:{ Exception -> 0x0110 }
            r2 = r5
        L_0x00da:
            boolean r0 = r3.hasNext()     // Catch:{ Exception -> 0x0112 }
            if (r0 == 0) goto L_0x018d
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r3)     // Catch:{ Exception -> 0x0112 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ Exception -> 0x0112 }
            java.lang.Object r2 = r0.getKey()     // Catch:{ Exception -> 0x0112 }
            if (r2 != 0) goto L_0x00f4
            com.fasterxml.jackson.databind.JsonSerializer r0 = r10.A00     // Catch:{ Exception -> 0x0112 }
            r0.A0A(r9, r10, r5)     // Catch:{ Exception -> 0x0112 }
            goto L_0x0102
        L_0x00f4:
            X.T9R r0 = r8.A06     // Catch:{ Exception -> 0x0112 }
            if (r0 == 0) goto L_0x00ff
            boolean r0 = r0.A00(r2)     // Catch:{ Exception -> 0x0112 }
            if (r0 == 0) goto L_0x00ff
            goto L_0x00da
        L_0x00ff:
            r4.A0A(r9, r10, r2)     // Catch:{ Exception -> 0x0112 }
        L_0x0102:
            if (r1 != 0) goto L_0x0108
            r10.A0T(r9)     // Catch:{ Exception -> 0x0112 }
            goto L_0x00da
        L_0x0108:
            com.fasterxml.jackson.databind.JsonSerializer r0 = r8.A03(r10, r1)     // Catch:{ Exception -> 0x0112 }
            r0.A0A(r9, r10, r1)     // Catch:{ Exception -> 0x0112 }
            goto L_0x00da
        L_0x0110:
            r1 = move-exception
            goto L_0x0114
        L_0x0112:
            r1 = move-exception
            r5 = r2
        L_0x0114:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            com.fasterxml.jackson.databind.ser.std.StdSerializer.A01(r10, r11, r0, r1)
            goto L_0x0185
        L_0x011c:
            X.SPK r0 = r8.A05
            if (r0 != 0) goto L_0x018a
            java.lang.Object r0 = A0F
            boolean r6 = X.AnonymousClass7TF.A1W(r0, r5)
            java.util.Iterator r4 = X.AnonymousClass7TF.A0u(r11)
        L_0x012a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x018d
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r4)
            java.lang.Object r7 = r1.getKey()
            if (r7 != 0) goto L_0x0168
            com.fasterxml.jackson.databind.JsonSerializer r3 = r10.A00
        L_0x013c:
            java.lang.Object r2 = r1.getValue()
            if (r2 != 0) goto L_0x0149
            boolean r0 = r8.A0A
            if (r0 != 0) goto L_0x012a
            com.fasterxml.jackson.databind.JsonSerializer r1 = r10.A01
            goto L_0x0161
        L_0x0149:
            com.fasterxml.jackson.databind.JsonSerializer r1 = r8.A01
            if (r1 != 0) goto L_0x0151
            com.fasterxml.jackson.databind.JsonSerializer r1 = r8.A03(r10, r2)
        L_0x0151:
            if (r6 == 0) goto L_0x015a
            boolean r0 = r1.A0B(r10, r2)
        L_0x0157:
            if (r0 == 0) goto L_0x0161
            goto L_0x012a
        L_0x015a:
            if (r5 == 0) goto L_0x0161
            boolean r0 = r5.equals(r2)
            goto L_0x0157
        L_0x0161:
            r3.A0A(r9, r10, r7)     // Catch:{ Exception -> 0x0176 }
            r1.A0A(r9, r10, r2)     // Catch:{ Exception -> 0x0176 }
            goto L_0x012a
        L_0x0168:
            X.T9R r0 = r8.A06
            if (r0 == 0) goto L_0x0173
            boolean r0 = r0.A00(r7)
            if (r0 == 0) goto L_0x0173
            goto L_0x012a
        L_0x0173:
            com.fasterxml.jackson.databind.JsonSerializer r3 = r8.A00
            goto L_0x013c
        L_0x0176:
            r1 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r7)
            com.fasterxml.jackson.databind.ser.std.StdSerializer.A01(r10, r11, r0, r1)
            goto L_0x0185
        L_0x017f:
            r1 = move-exception
            java.lang.String r0 = ""
            com.fasterxml.jackson.databind.ser.std.StdSerializer.A01(r10, r4, r0, r1)
        L_0x0185:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x018a:
            r8.A0E(r9, r10, r5, r11)
        L_0x018d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.A0F(X.17Z, X.4fE, java.util.Map):void");
    }

    public MapSerializer(SPK spk, MapSerializer mapSerializer, Object obj, boolean z) {
        super(Map.class, false);
        this.A0C = mapSerializer.A0C;
        this.A0D = mapSerializer.A0D;
        this.A0B = mapSerializer.A0B;
        this.A04 = mapSerializer.A04;
        this.A0E = mapSerializer.A0E;
        this.A05 = spk;
        this.A00 = mapSerializer.A00;
        this.A01 = mapSerializer.A01;
        this.A02 = mapSerializer.A02;
        this.A03 = mapSerializer.A03;
        this.A07 = mapSerializer.A07;
        this.A09 = mapSerializer.A09;
        this.A08 = obj;
        this.A0A = z;
        this.A06 = mapSerializer.A06;
    }

    public MapSerializer(C268894eF r4, C268894eF r5, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, SPK spk, Set set, Set set2, boolean z) {
        super(Map.class, false);
        set = (set == null || set.isEmpty()) ? null : set;
        this.A0C = set;
        this.A0D = set2;
        this.A0B = r4;
        this.A04 = r5;
        this.A0E = z;
        this.A05 = spk;
        this.A00 = jsonSerializer;
        this.A01 = jsonSerializer2;
        this.A02 = C8245Qkz.A00;
        this.A03 = null;
        this.A07 = null;
        this.A09 = false;
        this.A08 = null;
        this.A0A = false;
        this.A06 = SQ7.A00(set, set2);
    }

    public MapSerializer(C13901TjO tjO, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, MapSerializer mapSerializer, Set set, Set set2) {
        super(Map.class, false);
        set = (set == null || set.isEmpty()) ? null : set;
        this.A0C = set;
        this.A0D = set2;
        this.A0B = mapSerializer.A0B;
        this.A04 = mapSerializer.A04;
        this.A0E = mapSerializer.A0E;
        this.A05 = mapSerializer.A05;
        this.A00 = jsonSerializer;
        this.A01 = jsonSerializer2;
        this.A02 = C8245Qkz.A00;
        this.A03 = tjO;
        this.A07 = mapSerializer.A07;
        this.A09 = mapSerializer.A09;
        this.A08 = mapSerializer.A08;
        this.A0A = mapSerializer.A0A;
        this.A06 = SQ7.A00(set, set2);
    }
}

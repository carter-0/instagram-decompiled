package com.fasterxml.jackson.databind.deser.std;

import X.2Ob;
import X.AnonymousClass05K;
import X.C12832T9e;
import X.C13901TjO;
import X.C269674fV;
import X.C269784fg;
import X.RDC;
import X.T9m;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public class EnumDeserializer extends StdScalarDeserializer implements C269784fg {
    public C12832T9e A00;
    public Object[] A01;
    public final C12832T9e A02;
    public final Boolean A03;
    public final Enum A04;
    public final boolean A05;

    public final boolean A0M() {
        return true;
    }

    public EnumDeserializer(T9m t9m, Boolean bool) {
        super(t9m.A00);
        this.A02 = t9m.A02();
        this.A01 = t9m.A05;
        this.A04 = t9m.A01;
        this.A03 = bool;
        this.A05 = t9m.A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0155, code lost:
        if (r2 != null) goto L_0x0157;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0D(X.16F r8, X.C269674fV r9) {
        /*
            r7 = this;
            X.16L r0 = X.16L.A0J
            boolean r0 = r8.A19(r0)
            if (r0 != 0) goto L_0x00ae
            X.16L r0 = X.16L.A0I
            boolean r0 = r8.A19(r0)
            if (r0 == 0) goto L_0x0090
            boolean r0 = r7.A05
            if (r0 != 0) goto L_0x00ae
            int r3 = r8.A0i()
            java.lang.Integer r1 = X.AnonymousClass05K.A1F
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            java.lang.Integer r4 = r9.A0N(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1 = 0
            if (r4 != r0) goto L_0x0052
            X.4fA r0 = X.C269464fA.FAIL_ON_NUMBERS_FOR_ENUMS
            boolean r0 = r9.A0j(r0)
            if (r0 == 0) goto L_0x0042
            java.lang.Class r4 = r7.A0H()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "not allowed to deserialize Enum value out of number: disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow"
        L_0x003a:
            r9.A0c(r4, r3, r0, r1)
        L_0x003d:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0042:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.String r1 = "Integer value ("
            java.lang.String r0 = ")"
            java.lang.String r0 = X.002.A0c(r1, r0, r3)
            r7.A0u(r9, r4, r2, r0)
            goto L_0x003d
        L_0x0052:
            int r1 = r4.intValue()
            r5 = 0
            r2 = 1
            r0 = 2
            if (r1 == r0) goto L_0x01dc
            r0 = 3
            if (r1 == r0) goto L_0x01d9
            if (r3 < 0) goto L_0x0068
            java.lang.Object[] r1 = r7.A01
            int r0 = r1.length
            if (r3 >= r0) goto L_0x0068
            r4 = r1[r3]
            return r4
        L_0x0068:
            java.lang.Enum r4 = r7.A04
            if (r4 == 0) goto L_0x0075
            X.4fA r0 = X.C269464fA.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE
            boolean r0 = r9.A0j(r0)
            if (r0 == 0) goto L_0x0075
            return r4
        L_0x0075:
            X.4fA r0 = X.C269464fA.READ_UNKNOWN_ENUM_VALUES_AS_NULL
            boolean r0 = r9.A0j(r0)
            if (r0 != 0) goto L_0x01dc
            java.lang.Class r4 = r7.A0H()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r0 = r7.A01
            int r0 = r0.length
            int r0 = r0 - r2
            java.lang.Object[] r1 = X.AnonymousClass7TF.A1b(r0)
            java.lang.String r0 = "index value outside legal index range [0..%s]"
            goto L_0x003a
        L_0x0090:
            boolean r0 = r8.A17()
            if (r0 == 0) goto L_0x009c
            java.lang.Class r0 = r7.A00
        L_0x0098:
            r9.A0T(r8, r0)
            goto L_0x003d
        L_0x009c:
            X.16L r0 = X.16L.A0C
            boolean r0 = r8.A19(r0)
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r4 = r7.A0h(r8, r9)
            return r4
        L_0x00a9:
            java.lang.Class r0 = r7.A0H()
            goto L_0x0098
        L_0x00ae:
            java.lang.String r6 = r8.A1P()
            X.4fA r0 = X.C269464fA.READ_ENUMS_USING_TO_STRING
            boolean r0 = r9.A0j(r0)
            if (r0 == 0) goto L_0x00d0
            r2 = r7
            X.T9e r3 = r7.A00
            if (r3 != 0) goto L_0x00d5
            monitor-enter(r2)
            X.4f9 r1 = r9.A02     // Catch:{ all -> 0x01dd }
            java.lang.Class r0 = r7.A0H()     // Catch:{ all -> 0x01dd }
            X.T9m r0 = X.T9m.A00(r1, r0)     // Catch:{ all -> 0x01dd }
            X.T9e r3 = r0.A02()     // Catch:{ all -> 0x01dd }
            monitor-exit(r2)     // Catch:{ all -> 0x01dd }
            goto L_0x00d3
        L_0x00d0:
            X.T9e r3 = r7.A02
            goto L_0x00d5
        L_0x00d3:
            r7.A00 = r3
        L_0x00d5:
            java.lang.Object r4 = r3.A00(r6)
            if (r4 != 0) goto L_0x01e0
            java.lang.String r5 = r6.trim()
            if (r5 == r6) goto L_0x00e7
            java.lang.Object r4 = r3.A00(r5)
            if (r4 != 0) goto L_0x01e0
        L_0x00e7:
            java.lang.String r6 = r5.trim()
            boolean r0 = r6.isEmpty()
            r4 = 0
            if (r0 == 0) goto L_0x0134
            java.lang.Enum r2 = r7.A04
            if (r2 == 0) goto L_0x00ff
            X.4fA r0 = X.C269464fA.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE
            boolean r0 = r9.A0j(r0)
            if (r0 == 0) goto L_0x00ff
            return r2
        L_0x00ff:
            X.4fA r0 = X.C269464fA.READ_UNKNOWN_ENUM_VALUES_AS_NULL
            boolean r0 = r9.A0j(r0)
            if (r0 != 0) goto L_0x01e0
            boolean r0 = r5.isEmpty()
            java.lang.Integer r1 = r7.A0I()
            if (r0 == 0) goto L_0x0127
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            java.lang.Integer r1 = r9.A0N(r1, r0)
            java.lang.String r0 = "empty String (\"\")"
        L_0x0119:
            r7.A0u(r9, r1, r5, r0)
            int r1 = r1.intValue()
            r0 = 3
            if (r1 == r0) goto L_0x0157
            r0 = 1
            if (r1 == r0) goto L_0x0157
            return r4
        L_0x0127:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            java.lang.Integer r1 = r9.A0O(r1, r0)
            r0 = 2096(0x830, float:2.937E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x0119
        L_0x0134:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r7.A03
            boolean r0 = r1.equals(r0)
            r5 = 0
            if (r0 == 0) goto L_0x015d
            java.lang.Object[] r5 = r3.A02
            int r2 = r5.length
            r1 = 0
        L_0x0143:
            if (r1 >= r2) goto L_0x015b
            r0 = r5[r1]
            if (r0 == 0) goto L_0x0158
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x0158
            int r0 = r1 + 1
            r2 = r5[r0]
        L_0x0155:
            if (r2 == 0) goto L_0x019e
        L_0x0157:
            return r2
        L_0x0158:
            int r1 = r1 + 2
            goto L_0x0143
        L_0x015b:
            r2 = 0
            goto L_0x0155
        L_0x015d:
            X.4fA r0 = X.C269464fA.FAIL_ON_NUMBERS_FOR_ENUMS
            boolean r0 = r9.A0j(r0)
            if (r0 != 0) goto L_0x019e
            boolean r0 = r7.A05
            if (r0 != 0) goto L_0x019e
            char r1 = r6.charAt(r5)
            r0 = 48
            if (r1 < r0) goto L_0x019e
            r0 = 57
            if (r1 > r0) goto L_0x019e
            int r2 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x019e }
            X.4ez r1 = X.C269354ez.ALLOW_COERCION_OF_SCALARS     // Catch:{ NumberFormatException -> 0x019e }
            X.4f9 r0 = r9.A02     // Catch:{ NumberFormatException -> 0x019e }
            boolean r0 = r0.A09(r1)     // Catch:{ NumberFormatException -> 0x019e }
            if (r0 != 0) goto L_0x0194
            java.lang.Class r2 = r7.A0H()     // Catch:{ NumberFormatException -> 0x019e }
            java.lang.String r1 = "value looks like quoted Enum index, but `MapperFeature.ALLOW_COERCION_OF_SCALARS` prevents use"
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ NumberFormatException -> 0x019e }
            r9.A0e(r2, r6, r1, r0)     // Catch:{ NumberFormatException -> 0x019e }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ NumberFormatException -> 0x019e }
            throw r0     // Catch:{ NumberFormatException -> 0x019e }
        L_0x0194:
            if (r2 < 0) goto L_0x019e
            java.lang.Object[] r1 = r7.A01     // Catch:{ NumberFormatException -> 0x019e }
            int r0 = r1.length     // Catch:{ NumberFormatException -> 0x019e }
            if (r2 >= r0) goto L_0x019e
            r2 = r1[r2]     // Catch:{ NumberFormatException -> 0x019e }
            return r2
        L_0x019e:
            java.lang.Enum r1 = r7.A04
            if (r1 == 0) goto L_0x01ab
            X.4fA r0 = X.C269464fA.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE
            boolean r0 = r9.A0j(r0)
            if (r0 == 0) goto L_0x01ab
            return r1
        L_0x01ab:
            X.4fA r0 = X.C269464fA.READ_UNKNOWN_ENUM_VALUES_AS_NULL
            boolean r0 = r9.A0j(r0)
            if (r0 != 0) goto L_0x01e0
            java.lang.Class r5 = r7.A0H()
            java.lang.Object[] r4 = r3.A02
            int r3 = r4.length
            int r0 = r3 >> 2
            java.util.ArrayList r2 = X.DbS.A0v(r0)
            r1 = 0
        L_0x01c1:
            if (r1 >= r3) goto L_0x01cd
            r0 = r4[r1]
            if (r0 == 0) goto L_0x01ca
            r2.add(r0)
        L_0x01ca:
            int r1 = r1 + 2
            goto L_0x01c1
        L_0x01cd:
            java.lang.Object[] r1 = new java.lang.Object[]{r2}
            java.lang.String r0 = "not one of the values accepted for Enum class: %s"
            r9.A0e(r5, r6, r0, r1)
            goto L_0x003d
        L_0x01d9:
            java.lang.Enum r4 = r7.A04
            return r4
        L_0x01dc:
            return r5
        L_0x01dd:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01dd }
            throw r0
        L_0x01e0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.EnumDeserializer.A0D(X.16F, X.4fV):java.lang.Object");
    }

    public final Integer A0I() {
        return AnonymousClass05K.A1F;
    }

    public final Object A0K(C269674fV r2) {
        return this.A04;
    }

    public final JsonDeserializer ALh(C13901TjO tjO, C269674fV r4) {
        Boolean A0X = A0X(RDC.ACCEPT_CASE_INSENSITIVE_PROPERTIES, tjO, r4, A0H());
        if (A0X == null) {
            A0X = this.A03;
        }
        if (2Ob.A00(this.A03, A0X)) {
            return this;
        }
        return new EnumDeserializer(this, A0X);
    }

    public EnumDeserializer(EnumDeserializer enumDeserializer, Boolean bool) {
        super((StdDeserializer) enumDeserializer);
        this.A02 = enumDeserializer.A02;
        this.A01 = enumDeserializer.A01;
        this.A04 = enumDeserializer.A04;
        this.A03 = bool;
        this.A05 = enumDeserializer.A05;
    }
}

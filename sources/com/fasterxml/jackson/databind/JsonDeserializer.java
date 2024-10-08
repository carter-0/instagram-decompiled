package com.fasterxml.jackson.databind;

import X.002;
import X.16F;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.C269454f9;
import X.C269464fA;
import X.C269574fL;
import X.C269674fV;
import X.C269764fe;
import X.C383839gL;
import X.C8218QkR;
import X.SGT;
import X.T9I;
import com.facebook.common.json.FbJsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import java.util.Collection;

public abstract class JsonDeserializer implements C269764fe {
    public JsonDeserializer A0A(SGT sgt) {
        return this;
    }

    public abstract Object A0D(16F r1, C269674fV r2);

    public T9I A0F() {
        return null;
    }

    public Collection A0L() {
        return null;
    }

    public abstract class None extends JsonDeserializer {
        public None() {
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public Integer A0B() {
        if (this instanceof StdScalarDeserializer) {
            return AnonymousClass05K.A01;
        }
        return AnonymousClass05K.A0C;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009b, code lost:
        return r5.A0p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c4, code lost:
        return r0.A0C(r5, r6, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0C(X.16F r5, X.C269674fV r6, java.lang.Object r7) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer
            if (r0 == 0) goto L_0x00c5
            r3 = r4
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer r3 = (com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer) r3
            boolean r0 = r3.A06
            if (r0 != 0) goto L_0x0012
            int r0 = r5.A0x()
            switch(r0) {
                case 1: goto L_0x0017;
                case 2: goto L_0x0017;
                case 3: goto L_0x0053;
                case 4: goto L_0x0012;
                case 5: goto L_0x0017;
                case 6: goto L_0x006d;
                case 7: goto L_0x0076;
                case 8: goto L_0x0086;
                case 9: goto L_0x009c;
                case 10: goto L_0x009f;
                case 11: goto L_0x00a2;
                case 12: goto L_0x00a4;
                default: goto L_0x0012;
            }
        L_0x0012:
            java.lang.Object r7 = r3.A0D(r5, r6)
        L_0x0016:
            return r7
        L_0x0017:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r3.A01
            if (r0 != 0) goto L_0x00c0
            boolean r0 = r7 instanceof java.util.Map
            if (r0 == 0) goto L_0x00a9
            java.util.Map r7 = (java.util.Map) r7
            X.16L r1 = r5.A10()
            X.16L r0 = X.16L.A0D
            if (r1 != r0) goto L_0x002d
            X.16L r1 = r5.A1J()
        L_0x002d:
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x0016
            java.lang.String r2 = r5.A0Y()
        L_0x0035:
            r5.A1J()
            java.lang.Object r1 = r7.get(r2)
            if (r1 == 0) goto L_0x004e
            java.lang.Object r0 = r3.A0C(r5, r6, r1)
        L_0x0042:
            if (r0 == r1) goto L_0x0047
            r7.put(r2, r0)
        L_0x0047:
            java.lang.String r2 = r5.A1N()
            if (r2 != 0) goto L_0x0035
            return r7
        L_0x004e:
            java.lang.Object r0 = r3.A0D(r5, r6)
            goto L_0x0042
        L_0x0053:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r3.A00
            if (r0 != 0) goto L_0x00c0
            boolean r0 = r7 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00ae
            java.util.Collection r7 = (java.util.Collection) r7
        L_0x005d:
            X.16L r1 = r5.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x0016
            java.lang.Object r0 = r3.A0D(r5, r6)
            r7.add(r0)
            goto L_0x005d
        L_0x006d:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r3.A03
            if (r0 != 0) goto L_0x00c0
            java.lang.String r7 = r5.A1P()
            return r7
        L_0x0076:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r3.A02
            if (r0 != 0) goto L_0x00c0
            int r1 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.A02
            int r0 = r6.A01
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0097
            java.lang.Object r7 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.A07(r5, r6)
            return r7
        L_0x0086:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r3.A02
            if (r0 != 0) goto L_0x00c0
            X.4fA r0 = X.C269464fA.USE_BIG_DECIMAL_FOR_FLOATS
            boolean r0 = r6.A0j(r0)
            if (r0 == 0) goto L_0x0097
            java.math.BigDecimal r7 = r5.A0r()
            return r7
        L_0x0097:
            java.lang.Number r7 = r5.A0p()
            return r7
        L_0x009c:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L_0x009f:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L_0x00a2:
            r7 = 0
            return r7
        L_0x00a4:
            java.lang.Object r7 = r5.A0V()
            return r7
        L_0x00a9:
            java.util.LinkedHashMap r7 = r3.A0z(r5, r6)
            return r7
        L_0x00ae:
            X.4fA r0 = X.C269464fA.USE_JAVA_ARRAY_FOR_JSON_ARRAY
            boolean r0 = r6.A0j(r0)
            if (r0 == 0) goto L_0x00bb
            java.lang.Object[] r7 = r3.A11(r5, r6)
            return r7
        L_0x00bb:
            java.util.ArrayList r7 = r3.A0y(r5, r6)
            return r7
        L_0x00c0:
            java.lang.Object r7 = r0.A0C(r5, r6, r7)
            return r7
        L_0x00c5:
            r6.A0X(r4)
            java.lang.Object r0 = r4.A0D(r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.JsonDeserializer.A0C(X.16F, X.4fV, java.lang.Object):java.lang.Object");
    }

    public C8218QkR A0E(String str) {
        throw new IllegalArgumentException(002.A11("Cannot handle managed/back reference '", str, "': type: value deserializer of type ", getClass().getName(), " does not support them"));
    }

    public Boolean A0G(C269454f9 r2) {
        if (this instanceof StdScalarDeserializer) {
            return Boolean.FALSE;
        }
        if (this instanceof BaseNodeDeserializer) {
            return ((BaseNodeDeserializer) this).A00;
        }
        return null;
    }

    public Class A0H() {
        if (this instanceof StdDeserializer) {
            return ((StdDeserializer) this).A00;
        }
        return null;
    }

    public Integer A0I() {
        if (!(this instanceof UntypedObjectDeserializer) && !(this instanceof BaseNodeDeserializer)) {
            if (!(this instanceof StdScalarDeserializer)) {
                return null;
            }
            StdScalarDeserializer stdScalarDeserializer = (StdScalarDeserializer) this;
            if (!(stdScalarDeserializer instanceof TokenBufferDeserializer)) {
                if (stdScalarDeserializer instanceof StringDeserializer) {
                    return AnonymousClass05K.A1I;
                }
                if (stdScalarDeserializer instanceof NumberDeserializers$PrimitiveOrWrapperDeserializer) {
                    return ((NumberDeserializers$PrimitiveOrWrapperDeserializer) stdScalarDeserializer).A00;
                }
                return AnonymousClass05K.A04;
            }
        }
        return AnonymousClass05K.A0Y;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0050, code lost:
        return r4.A0p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005e, code lost:
        return r0.A0D(r4, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0J(X.16F r4, X.C269674fV r5, X.C11287SJg r6) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer
            if (r0 == 0) goto L_0x0064
            r2 = r3
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer r2 = (com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer) r2
            int r1 = r4.A0x()
            r0 = 1
            if (r1 == r0) goto L_0x005f
            r0 = 3
            if (r1 == r0) goto L_0x005f
            switch(r1) {
                case 5: goto L_0x005f;
                case 6: goto L_0x0051;
                case 7: goto L_0x003c;
                case 8: goto L_0x002b;
                case 9: goto L_0x0028;
                case 10: goto L_0x0025;
                case 11: goto L_0x0023;
                case 12: goto L_0x001e;
                default: goto L_0x0014;
            }
        L_0x0014:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r5.A0T(r4, r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001e:
            java.lang.Object r0 = r4.A0V()
            return r0
        L_0x0023:
            r0 = 0
            return r0
        L_0x0025:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x0028:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x002b:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r2.A02
            if (r0 != 0) goto L_0x005a
            X.4fA r0 = X.C269464fA.USE_BIG_DECIMAL_FOR_FLOATS
            boolean r0 = r5.A0j(r0)
            if (r0 == 0) goto L_0x004c
            java.math.BigDecimal r0 = r4.A0r()
            return r0
        L_0x003c:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r2.A02
            if (r0 != 0) goto L_0x005a
            int r1 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.A02
            int r0 = r5.A01
            r1 = r1 & r0
            if (r1 == 0) goto L_0x004c
            java.lang.Object r0 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.A07(r4, r5)
            return r0
        L_0x004c:
            java.lang.Number r0 = r4.A0p()
            return r0
        L_0x0051:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r2.A03
            if (r0 != 0) goto L_0x005a
            java.lang.String r0 = r4.A1P()
            return r0
        L_0x005a:
            java.lang.Object r0 = r0.A0D(r4, r5)
            return r0
        L_0x005f:
            java.lang.Object r0 = r6.A03(r4, r5)
            return r0
        L_0x0064:
            boolean r0 = r3 instanceof com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer
            if (r0 == 0) goto L_0x00f1
            r2 = r3
            com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer r2 = (com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer) r2
            boolean r0 = r2 instanceof com.fasterxml.jackson.databind.deser.std.StringDeserializer
            if (r0 == 0) goto L_0x0076
            com.fasterxml.jackson.databind.deser.std.StringDeserializer r2 = (com.fasterxml.jackson.databind.deser.std.StringDeserializer) r2
            java.lang.String r0 = r2.A0D(r4, r5)
            return r0
        L_0x0076:
            boolean r0 = r2 instanceof com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer
            if (r0 == 0) goto L_0x009b
            com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer r2 = (com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer) r2
            boolean r0 = r4.A15()
            if (r0 == 0) goto L_0x008b
            int r0 = r4.A0i()
        L_0x0086:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x008b:
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x0094
            int r0 = r2.A0Q(r4, r5)
            goto L_0x0086
        L_0x0094:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            java.lang.Integer r0 = r2.A0d(r4, r5, r0)
            return r0
        L_0x009b:
            boolean r0 = r2 instanceof com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer
            if (r0 == 0) goto L_0x00c0
            com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer r2 = (com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer) r2
            X.16L r0 = X.16L.A0H
            boolean r0 = r4.A19(r0)
            if (r0 == 0) goto L_0x00b2
            double r0 = r4.A0g()
        L_0x00ad:
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        L_0x00b2:
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x00bb
            double r0 = r2.A0O(r4, r5)
            goto L_0x00ad
        L_0x00bb:
            java.lang.Double r0 = r2.A0y(r4, r5)
            return r0
        L_0x00c0:
            boolean r0 = r2 instanceof com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer
            if (r0 == 0) goto L_0x00ec
            com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer r2 = (com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer) r2
            X.16L r1 = r4.A10()
            X.16L r0 = X.16L.A0K
            if (r1 != r0) goto L_0x00d1
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x00d1:
            X.16L r0 = X.16L.A0F
            if (r1 != r0) goto L_0x00d8
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x00d8:
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x00e5
            boolean r0 = r2.A0w(r4, r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x00e5:
            java.lang.Class r0 = r2.A00
            java.lang.Boolean r0 = r2.A0Z(r4, r5, r0)
            return r0
        L_0x00ec:
            java.lang.Object r0 = r6.A06(r4, r5)
            return r0
        L_0x00f1:
            java.lang.Object r0 = r6.A03(r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.JsonDeserializer.A0J(X.16F, X.4fV, X.SJg):java.lang.Object");
    }

    public Object A0K(C269674fV r2) {
        if (this instanceof StringDeserializer) {
            return "";
        }
        if (this instanceof NumberDeserializers$PrimitiveOrWrapperDeserializer) {
            return ((NumberDeserializers$PrimitiveOrWrapperDeserializer) this).A01;
        }
        return BWm(r2);
    }

    public boolean A0M() {
        if ((this instanceof BaseNodeDeserializer) || (this instanceof NumberDeserializers$IntegerDeserializer) || (this instanceof StringDeserializer) || (this instanceof UntypedObjectDeserializer) || (this instanceof NumberDeserializers$LongDeserializer) || (this instanceof FbJsonDeserializer)) {
            return true;
        }
        return false;
    }

    public Object AXg(C269674fV r2) {
        if (this instanceof JsonNodeDeserializer) {
            return null;
        }
        return BWm(r2);
    }

    public Object BWm(C269674fV r3) {
        if (this instanceof NumberDeserializers$PrimitiveOrWrapperDeserializer) {
            NumberDeserializers$PrimitiveOrWrapperDeserializer numberDeserializers$PrimitiveOrWrapperDeserializer = (NumberDeserializers$PrimitiveOrWrapperDeserializer) this;
            if (!numberDeserializers$PrimitiveOrWrapperDeserializer.A03 || !r3.A0j(C269464fA.FAIL_ON_NULL_FOR_PRIMITIVES)) {
                return numberDeserializers$PrimitiveOrWrapperDeserializer.A02;
            }
            r3.A0h("Cannot map `null` into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)", C269574fL.A07(numberDeserializers$PrimitiveOrWrapperDeserializer.A0H()));
            throw AnonymousClass00P.createAndThrow();
        } else if (this instanceof JsonNodeDeserializer) {
            return C383839gL.A00;
        } else {
            return null;
        }
    }
}

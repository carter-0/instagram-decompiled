package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.16L;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.C269674fV;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public class NumberDeserializers$DoubleDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$DoubleDeserializer A00;
    public static final NumberDeserializers$DoubleDeserializer A01;

    /* JADX WARNING: type inference failed for: r0v1, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer] */
    /* JADX WARNING: type inference failed for: r0v2, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer] */
    static {
        Class cls = Double.TYPE;
        Double valueOf = Double.valueOf(0.0d);
        Integer num = AnonymousClass05K.A0u;
        A00 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(cls, num, valueOf, valueOf);
        A01 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(Double.class, num, (Object) null, valueOf);
    }

    public final /* bridge */ /* synthetic */ Object A0D(16F r3, C269674fV r4) {
        double A0O;
        if (r3.A19(16L.A0H)) {
            A0O = r3.A0g();
        } else if (!this.A03) {
            return A0y(r3, r4);
        } else {
            A0O = A0O(r3, r4);
        }
        return Double.valueOf(A0O);
    }

    public final Double A0y(16F r5, C269674fV r6) {
        Object obj;
        double d;
        int A0x = r5.A0x();
        if (A0x != 1) {
            if (A0x != 3) {
                if (A0x != 11) {
                    if (A0x == 6) {
                        String A1P = r5.A1P();
                        Double A0a = A0a(A1P);
                        if (A0a != null) {
                            return A0a;
                        }
                        Integer A0f = A0f(r6, A1P);
                        if (A0f != AnonymousClass05K.A0C) {
                            if (A0f == AnonymousClass05K.A0N) {
                                obj = this.A01;
                            } else {
                                String trim = A1P.trim();
                                if (!A0x(r6, trim)) {
                                    try {
                                        if ("2.2250738585072012e-308".equals(trim)) {
                                            d = Double.MIN_NORMAL;
                                        } else {
                                            d = Double.parseDouble(trim);
                                        }
                                        return Double.valueOf(d);
                                    } catch (IllegalArgumentException unused) {
                                        r6.A0e(this.A00, trim, "not a valid `Double` value", new Object[0]);
                                        throw AnonymousClass00P.createAndThrow();
                                    }
                                }
                            }
                        }
                    } else if (A0x == 7 || A0x == 8) {
                        return Double.valueOf(r5.A0g());
                    } else {
                        r6.A0R(r5, A0U(r6));
                    }
                }
                obj = BWm(r6);
            } else {
                obj = A0h(r5, r6);
            }
            return (Double) obj;
        }
        r6.A0T(r5, this.A00);
        throw AnonymousClass00P.createAndThrow();
    }
}

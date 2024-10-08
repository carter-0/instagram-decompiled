package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.16L;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.C269674fV;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public class NumberDeserializers$FloatDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$FloatDeserializer A00;
    public static final NumberDeserializers$FloatDeserializer A01;

    /* JADX WARNING: type inference failed for: r0v1, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer] */
    /* JADX WARNING: type inference failed for: r0v2, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer] */
    static {
        Class cls = Float.TYPE;
        Float valueOf = Float.valueOf(0.0f);
        Integer num = AnonymousClass05K.A0u;
        A00 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(cls, num, valueOf, valueOf);
        A01 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(Float.class, num, (Object) null, valueOf);
    }

    public final /* bridge */ /* synthetic */ Object A0D(16F r5, C269674fV r6) {
        float A0P;
        if (r5.A19(16L.A0H)) {
            A0P = r5.A0h();
        } else if (this.A03) {
            A0P = A0P(r5, r6);
        } else {
            int A0x = r5.A0x();
            if (A0x == 1) {
                r6.A0T(r5, this.A00);
            } else if (A0x == 3) {
                return A0h(r5, r6);
            } else {
                if (A0x != 11) {
                    if (A0x == 6) {
                        String A1P = r5.A1P();
                        Float A0b = A0b(A1P);
                        if (A0b != null) {
                            return A0b;
                        }
                        Integer A0f = A0f(r6, A1P);
                        if (A0f != AnonymousClass05K.A0C) {
                            if (A0f == AnonymousClass05K.A0N) {
                                return this.A01;
                            }
                            String trim = A1P.trim();
                            if (!A0x(r6, trim)) {
                                try {
                                    return Float.valueOf(Float.parseFloat(trim));
                                } catch (IllegalArgumentException unused) {
                                    r6.A0e(this.A00, trim, "not a valid `Float` value", new Object[0]);
                                    throw AnonymousClass00P.createAndThrow();
                                }
                            }
                        }
                    } else if (A0x == 7 || A0x == 8) {
                        return Float.valueOf(r5.A0h());
                    } else {
                        r6.A0R(r5, A0U(r6));
                    }
                }
                return BWm(r6);
            }
            throw AnonymousClass00P.createAndThrow();
        }
        return Float.valueOf(A0P);
    }
}

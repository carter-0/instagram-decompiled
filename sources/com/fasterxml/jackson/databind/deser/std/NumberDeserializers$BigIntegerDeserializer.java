package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.C269674fV;
import X.Pxe;
import X.Pxf;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.math.BigInteger;

@JacksonStdImpl
public class NumberDeserializers$BigIntegerDeserializer extends StdScalarDeserializer {
    public static final NumberDeserializers$BigIntegerDeserializer A00 = new NumberDeserializers$BigIntegerDeserializer();

    public NumberDeserializers$BigIntegerDeserializer() {
        super(BigInteger.class);
    }

    public final Integer A0I() {
        return AnonymousClass05K.A0j;
    }

    public final Object A0K(C269674fV r2) {
        return BigInteger.ZERO;
    }

    public final /* bridge */ /* synthetic */ Object A0D(16F r5, C269674fV r6) {
        if (r5.A15()) {
            return r5.A0s();
        }
        int A0x = r5.A0x();
        if (A0x == 1) {
            r6.A0T(r5, this.A00);
        } else if (A0x == 3) {
            return A0h(r5, r6);
        } else {
            if (A0x == 6) {
                String A1P = r5.A1P();
                Integer A0f = A0f(r6, A1P);
                if (A0f != AnonymousClass05K.A0C) {
                    if (A0f != AnonymousClass05K.A0N) {
                        String trim = A1P.trim();
                        if (!"null".equals(trim)) {
                            try {
                                return new BigInteger(trim);
                            } catch (IllegalArgumentException unused) {
                                r6.A0e(this.A00, trim, "not a valid representation", Pxe.A1b());
                                throw AnonymousClass00P.createAndThrow();
                            }
                        }
                    }
                }
                return BWm(r6);
            } else if (A0x != 8) {
                Pxf.A1G(r5, r6, this);
            } else {
                Integer A0c = A0c(r5, r6);
                if (A0c != AnonymousClass05K.A0C) {
                    if (A0c != AnonymousClass05K.A0N) {
                        return r5.A0r().toBigInteger();
                    }
                }
                return BWm(r6);
            }
            return BigInteger.ZERO;
        }
        throw AnonymousClass00P.createAndThrow();
    }
}

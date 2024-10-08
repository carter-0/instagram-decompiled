package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.16L;
import X.AnonymousClass00P;
import X.C269674fV;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public class StringDeserializer extends StdScalarDeserializer {
    public static final StringDeserializer A00 = new StringDeserializer();

    public StringDeserializer() {
        super(String.class);
    }

    /* renamed from: A0y */
    public final String A0D(16F r3, C269674fV r4) {
        String A1Q;
        if (r3.A19(16L.A0J)) {
            return r3.A1P();
        }
        16L A10 = r3.A10();
        if (A10 == 16L.A0C) {
            return (String) A0h(r3, r4);
        }
        if (A10 == 16L.A0E) {
            Object A0V = r3.A0V();
            if (A0V == null) {
                return null;
            }
            if (A0V instanceof byte[]) {
                return r4.A02.A01.A00.A05((byte[]) A0V);
            }
            return A0V.toString();
        } else if (A10 != 16L.A0D && A10.A03 && (A1Q = r3.A1Q()) != null) {
            return A1Q;
        } else {
            r4.A0T(r3, this.A00);
            throw AnonymousClass00P.createAndThrow();
        }
    }
}

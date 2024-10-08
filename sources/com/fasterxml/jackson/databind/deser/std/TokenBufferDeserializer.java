package com.fasterxml.jackson.databind.deser.std;

import X.002;
import X.16F;
import X.16L;
import X.AnonymousClass4iD;
import X.C267574bm;
import X.C269674fV;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public class TokenBufferDeserializer extends StdScalarDeserializer {
    public TokenBufferDeserializer() {
        super(C267574bm.class);
    }

    public final /* bridge */ /* synthetic */ Object A0D(16F r6, C269674fV r7) {
        16L A1J;
        C267574bm r3 = new C267574bm(r6, r7);
        16L r1 = 16L.A0A;
        if (!r6.A19(r1)) {
            r3.A13(r6);
            return r3;
        }
        r3.A0c();
        do {
            r3.A13(r6);
            A1J = r6.A1J();
        } while (A1J == r1);
        16L r4 = 16L.A09;
        if (A1J != r4) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got ");
            sb.append(A1J);
            String obj = sb.toString();
            16F r2 = r7.A07;
            String format = String.format("Unexpected token (%s), expected %s", new Object[]{r2.A10(), r4});
            if (obj != null) {
                format = 002.A0g(format, ": ", obj);
            }
            throw new AnonymousClass4iD(r2, format);
        }
        r3.A0Z();
        return r3;
    }
}

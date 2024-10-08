package com.fasterxml.jackson.databind.deser.impl;

import X.16F;
import X.16L;
import X.AnonymousClass00P;
import X.C268894eF;
import X.C269674fV;
import X.Pxh;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class UnsupportedTypeDeserializer extends StdDeserializer {
    public final C268894eF A00;
    public final String A01;

    public UnsupportedTypeDeserializer(C268894eF r1, String str) {
        super(r1);
        this.A00 = r1;
        this.A01 = str;
    }

    public final Object A0D(16F r3, C269674fV r4) {
        Object A0V;
        if (r3.A10() == 16L.A0E && ((A0V = r3.A0V()) == null || Pxh.A1W(this.A00.A00, A0V))) {
            return A0V;
        }
        r4.A08(this.A00, this.A01);
        throw AnonymousClass00P.createAndThrow();
    }
}

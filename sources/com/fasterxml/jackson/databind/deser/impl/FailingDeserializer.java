package com.fasterxml.jackson.databind.deser.impl;

import X.16F;
import X.AnonymousClass00P;
import X.C269674fV;
import X.Pxe;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class FailingDeserializer extends StdDeserializer {
    public final String A00 = "No _valueDeserializer assigned";

    public FailingDeserializer() {
        super(Object.class);
    }

    public final Object A0D(16F r3, C269674fV r4) {
        r4.A0h(this.A00, Pxe.A1b());
        throw AnonymousClass00P.createAndThrow();
    }
}

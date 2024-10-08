package com.fasterxml.jackson.databind.ser.impl;

import X.17Z;
import X.AnonymousClass00P;
import X.C269424f6;
import X.C269504fE;
import X.SPK;
import com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer;

public class UnknownSerializer extends ToEmptyObjectSerializer {
    public UnknownSerializer() {
        super(Object.class, false);
    }

    public final void A09(17Z r4, C269504fE r5, SPK spk, Object obj) {
        if (r5.A05.A0D(C269424f6.FAIL_ON_EMPTY_BEANS)) {
            r5.A09(String.format("No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)", new Object[]{obj.getClass().getName()}), this.A00);
            throw AnonymousClass00P.createAndThrow();
        }
        super.A09(r4, r5, spk, obj);
    }
}

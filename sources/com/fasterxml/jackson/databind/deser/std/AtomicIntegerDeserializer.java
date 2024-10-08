package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.AnonymousClass05K;
import X.C269674fV;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDeserializer extends StdScalarDeserializer {
    public AtomicIntegerDeserializer() {
        super(AtomicInteger.class);
    }

    public final Integer A0I() {
        return AnonymousClass05K.A0j;
    }

    public final Object A0K(C269674fV r2) {
        return new AtomicInteger();
    }

    public final /* bridge */ /* synthetic */ Object A0D(16F r3, C269674fV r4) {
        int intValue;
        if (r3.A15()) {
            intValue = r3.A0i();
        } else {
            Integer A0d = A0d(r3, r4, AtomicInteger.class);
            if (A0d == null) {
                return null;
            }
            intValue = A0d.intValue();
        }
        return new AtomicInteger(intValue);
    }
}

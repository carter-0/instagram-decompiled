package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.AnonymousClass05K;
import X.C269674fV;
import X.Pxe;
import java.util.concurrent.atomic.AtomicLong;

public class AtomicLongDeserializer extends StdScalarDeserializer {
    public AtomicLongDeserializer() {
        super(AtomicLong.class);
    }

    public final Integer A0I() {
        return AnonymousClass05K.A0j;
    }

    public final Object A0K(C269674fV r2) {
        return new AtomicLong();
    }

    public final /* bridge */ /* synthetic */ Object A0D(16F r3, C269674fV r4) {
        if (r3.A15()) {
            return Pxe.A1D(r3.A0j());
        }
        Long A0g = A0g(r3, r4, AtomicLong.class);
        if (A0g == null) {
            return null;
        }
        return Pxe.A1D((long) A0g.intValue());
    }
}

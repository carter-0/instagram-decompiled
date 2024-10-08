package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.16L;
import X.AnonymousClass05K;
import X.C269674fV;
import X.JTQ;
import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBooleanDeserializer extends StdScalarDeserializer {
    public AtomicBooleanDeserializer() {
        super(AtomicBoolean.class);
    }

    public final Integer A0I() {
        return AnonymousClass05K.A15;
    }

    public final /* bridge */ /* synthetic */ Object A0D(16F r3, C269674fV r4) {
        boolean booleanValue;
        16L A10 = r3.A10();
        if (A10 == 16L.A0K) {
            booleanValue = true;
        } else if (A10 == 16L.A0F) {
            booleanValue = false;
        } else {
            Boolean A0Z = A0Z(r3, r4, AtomicBoolean.class);
            if (A0Z == null) {
                return null;
            }
            booleanValue = A0Z.booleanValue();
        }
        return new AtomicBoolean(booleanValue);
    }

    public final Object A0K(C269674fV r2) {
        return JTQ.A0k();
    }
}

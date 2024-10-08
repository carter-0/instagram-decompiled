package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.16L;
import X.C11287SJg;
import X.C269454f9;
import X.C269674fV;

public class NullifyingDeserializer extends StdDeserializer {
    public static final NullifyingDeserializer A00 = new NullifyingDeserializer();

    public NullifyingDeserializer() {
        super(Object.class);
    }

    public final Object A0D(16F r3, C269674fV r4) {
        if (!r3.A19(16L.A0A)) {
            r3.A0z();
            return null;
        }
        while (true) {
            16L A1J = r3.A1J();
            if (A1J == null || A1J == 16L.A09) {
                return null;
            }
            r3.A0z();
        }
    }

    public final Boolean A0G(C269454f9 r2) {
        return Boolean.FALSE;
    }

    public final Object A0J(16F r3, C269674fV r4, C11287SJg sJg) {
        int A0x = r3.A0x();
        if (A0x == 1 || A0x == 3 || A0x == 5) {
            return sJg.A03(r3, r4);
        }
        return null;
    }
}

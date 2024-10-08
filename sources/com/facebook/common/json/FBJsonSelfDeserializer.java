package com.facebook.common.json;

import X.16F;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.C269674fV;
import X.S8P;
import X.SS5;

public class FBJsonSelfDeserializer extends FbJsonDeserializer {
    public final Object A0D(16F r3, C269674fV r4) {
        try {
            A0O();
            throw AnonymousClass7TE.A11("deserialize");
        } catch (Exception e) {
            SS5.A03(e);
            S8P.A00(r3, this.A00, e);
            throw AnonymousClass00P.createAndThrow();
        }
    }
}

package com.fasterxml.jackson.databind.ser.impl;

import X.17Z;
import X.C13901TjO;
import X.C269504fE;
import X.C269714fZ;
import X.SPK;
import com.fasterxml.jackson.databind.JsonSerializer;

public final class TypeWrappedSerializer extends JsonSerializer implements C269714fZ {
    public final JsonSerializer A00;
    public final SPK A01;

    public final Class A05() {
        return Object.class;
    }

    public final void A09(17Z r2, C269504fE r3, SPK spk, Object obj) {
        this.A00.A09(r2, r3, spk, obj);
    }

    public final void A0A(17Z r3, C269504fE r4, Object obj) {
        this.A00.A09(r3, r4, this.A01, obj);
    }

    public final JsonSerializer ALi(C13901TjO tjO, C269504fE r5) {
        JsonSerializer jsonSerializer = this.A00;
        JsonSerializer jsonSerializer2 = jsonSerializer;
        if (jsonSerializer instanceof C269714fZ) {
            jsonSerializer = r5.A0F(tjO, jsonSerializer);
        }
        if (jsonSerializer == jsonSerializer2) {
            return this;
        }
        return new TypeWrappedSerializer(jsonSerializer, this.A01);
    }

    public TypeWrappedSerializer(JsonSerializer jsonSerializer, SPK spk) {
        this.A01 = spk;
        this.A00 = jsonSerializer;
    }
}

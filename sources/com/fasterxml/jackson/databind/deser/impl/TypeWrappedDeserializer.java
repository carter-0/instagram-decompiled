package com.fasterxml.jackson.databind.deser.impl;

import X.16F;
import X.AnonymousClass7TE;
import X.C11287SJg;
import X.C269454f9;
import X.C269674fV;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;
import java.util.Collection;

public final class TypeWrappedDeserializer extends JsonDeserializer implements Serializable {
    public final JsonDeserializer A00;
    public final C11287SJg A01;

    public final Object A0C(16F r2, C269674fV r3, Object obj) {
        return this.A00.A0C(r2, r3, obj);
    }

    public final Object A0D(16F r3, C269674fV r4) {
        return this.A00.A0J(r3, r4, this.A01);
    }

    public final Boolean A0G(C269454f9 r2) {
        return this.A00.A0G(r2);
    }

    public final Class A0H() {
        return this.A00.A0H();
    }

    public final Integer A0I() {
        return this.A00.A0I();
    }

    public final Object A0J(16F r2, C269674fV r3, C11287SJg sJg) {
        throw AnonymousClass7TE.A0z("Type-wrapped deserializer's deserializeWithType should never get called");
    }

    public final Object A0K(C269674fV r2) {
        return this.A00.A0K(r2);
    }

    public final Collection A0L() {
        return this.A00.A0L();
    }

    public final Object BWm(C269674fV r2) {
        return this.A00.BWm(r2);
    }

    public TypeWrappedDeserializer(JsonDeserializer jsonDeserializer, C11287SJg sJg) {
        this.A01 = sJg;
        this.A00 = jsonDeserializer;
    }
}

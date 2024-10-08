package com.fasterxml.jackson.databind.deser.impl;

import X.16F;
import X.C269674fV;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class ErrorThrowingDeserializer extends JsonDeserializer {
    public final Error A00;

    public ErrorThrowingDeserializer(NoClassDefFoundError noClassDefFoundError) {
        this.A00 = noClassDefFoundError;
    }

    public final Object A0D(16F r2, C269674fV r3) {
        throw this.A00;
    }
}

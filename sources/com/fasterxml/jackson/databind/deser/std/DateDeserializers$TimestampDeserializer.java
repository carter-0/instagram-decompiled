package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.C269674fV;
import java.sql.Timestamp;
import java.util.Date;

public class DateDeserializers$TimestampDeserializer extends DateDeserializers$DateBasedDeserializer {
    public DateDeserializers$TimestampDeserializer() {
        super(Timestamp.class);
    }

    public final Object A0K(C269674fV r4) {
        return new Timestamp(0);
    }

    public final /* bridge */ /* synthetic */ Object A0D(16F r4, C269674fV r5) {
        Date A0m = A0m(r4, r5);
        if (A0m == null) {
            return null;
        }
        return new Timestamp(A0m.getTime());
    }
}

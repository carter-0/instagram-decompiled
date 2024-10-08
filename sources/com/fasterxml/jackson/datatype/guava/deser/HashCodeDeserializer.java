package com.fasterxml.jackson.datatype.guava.deser;

import X.2RT;
import X.C269674fV;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import java.util.Locale;

public class HashCodeDeserializer extends FromStringDeserializer {
    public static final HashCodeDeserializer A00 = new HashCodeDeserializer();

    public HashCodeDeserializer() {
        super(2RT.class);
    }

    public final /* bridge */ /* synthetic */ Object A10(C269674fV r2, String str) {
        return 2RT.A01(str.toLowerCase(Locale.ENGLISH));
    }
}

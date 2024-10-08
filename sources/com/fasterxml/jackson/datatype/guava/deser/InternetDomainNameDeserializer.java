package com.fasterxml.jackson.datatype.guava.deser;

import X.C11359SOv;
import X.C12614Szy;
import X.C269674fV;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;

public class InternetDomainNameDeserializer extends FromStringDeserializer {
    public static final InternetDomainNameDeserializer A00 = new InternetDomainNameDeserializer();

    public InternetDomainNameDeserializer() {
        super(C11359SOv.class);
    }

    public final /* bridge */ /* synthetic */ Object A10(C269674fV r2, String str) {
        C12614Szy szy = C11359SOv.A02;
        str.getClass();
        return new C11359SOv(str);
    }
}

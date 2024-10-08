package com.fasterxml.jackson.databind.ser.impl;

import X.17Z;
import X.AnonymousClass00P;
import X.C268894eF;
import X.C269504fE;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class UnsupportedTypeSerializer extends StdSerializer {
    public final C268894eF A00;
    public final String A01;

    public UnsupportedTypeSerializer(C268894eF r2, String str) {
        super(Object.class);
        this.A00 = r2;
        this.A01 = str;
    }

    public final void A0A(17Z r3, C269504fE r4, Object obj) {
        r4.A08(this.A00, this.A01);
        throw AnonymousClass00P.createAndThrow();
    }
}

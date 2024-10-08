package com.fasterxml.jackson.databind.ser;

import X.17Z;
import X.AnonymousClass00P;
import X.C269504fE;
import X.Pxf;
import X.SGT;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;

public class BeanSerializer extends BeanSerializerBase {
    public final JsonSerializer A07(SGT sgt) {
        return new UnwrappingBeanSerializer((BeanSerializerBase) this, sgt);
    }

    public final void A0A(17Z r2, C269504fE r3, Object obj) {
        if (this.A01 != null) {
            r2.A0F(obj);
            A0I(r2, r3, obj, true);
            return;
        }
        r2.A0o(obj);
        Object obj2 = this.A02;
        if (obj2 != null) {
            A0D(r3, obj2);
            throw AnonymousClass00P.createAndThrow();
        }
        A0H(r2, r3, obj);
        r2.A0Z();
    }

    public final String toString() {
        return Pxf.A0e(this.A00, "BeanSerializer for ");
    }
}

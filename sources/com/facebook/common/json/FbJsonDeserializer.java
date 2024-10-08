package com.facebook.common.json;

import X.002;
import X.16F;
import X.16L;
import X.AnonymousClass00P;
import X.C269674fV;
import X.RV1;
import X.S8P;
import X.SS5;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.lang.reflect.Constructor;

public class FbJsonDeserializer extends JsonDeserializer {
    public Class A00;

    public FbJsonField A0N(String str) {
        return null;
    }

    public final Object A0O() {
        try {
            Constructor declaredConstructor = this.A00.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new Object[0]);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(002.A0R(this.A00.getName(), " missing default constructor"), e);
        }
    }

    public Object A0D(16F r4, C269674fV r5) {
        try {
            Object A0O = A0O();
            while (RV1.A00(r4) != 16L.A09) {
                if (r4.A11() == 16L.A0A) {
                    String A0q = r4.A0q();
                    r4.A1J();
                    FbJsonField A0N = A0N(A0q);
                    if (A0N != null) {
                        A0N.deserialize(A0O, r4, r5);
                    } else {
                        r4.A0z();
                    }
                }
            }
            return A0O;
        } catch (Exception e) {
            SS5.A03(e);
            S8P.A00(r4, this.A00, e);
            throw AnonymousClass00P.createAndThrow();
        }
    }
}

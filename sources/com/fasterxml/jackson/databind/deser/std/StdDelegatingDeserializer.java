package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.AnonymousClass7TE;
import X.C11287SJg;
import X.C13782Tgx;
import X.C13901TjO;
import X.C268894eF;
import X.C269454f9;
import X.C269574fL;
import X.C269674fV;
import X.C269774ff;
import X.C269784fg;
import X.Pxf;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class StdDelegatingDeserializer extends StdDeserializer implements C269774ff, C269784fg {
    public final C268894eF A00;
    public final C13782Tgx A01;
    public final JsonDeserializer A02;

    public final Object A0C(16F r4, C269674fV r5, Object obj) {
        C268894eF r2 = this.A00;
        Class cls = r2.A00;
        Class<?> cls2 = obj.getClass();
        if (cls.isAssignableFrom(cls2)) {
            return this.A02.A0C(r4, r5, obj);
        }
        throw AnonymousClass7TE.A1B(String.format(Pxf.A0e(cls2, "Cannot update object of type %s (using deserializer for type %s)"), new Object[]{r2}));
    }

    public final Object A0D(16F r3, C269674fV r4) {
        Object A0D = this.A02.A0D(r3, r4);
        if (A0D == null) {
            return null;
        }
        return this.A01.AJt(A0D);
    }

    public final Boolean A0G(C269454f9 r2) {
        return this.A02.A0G(r2);
    }

    public final Class A0H() {
        return this.A02.A0H();
    }

    public final Integer A0I() {
        return this.A02.A0I();
    }

    public final Object A0J(16F r3, C269674fV r4, C11287SJg sJg) {
        Object A0D = this.A02.A0D(r3, r4);
        if (A0D == null) {
            return null;
        }
        return this.A01.AJt(A0D);
    }

    public final JsonDeserializer ALh(C13901TjO tjO, C269674fV r7) {
        JsonDeserializer jsonDeserializer = this.A02;
        if (jsonDeserializer != null) {
            C268894eF r4 = this.A00;
            JsonDeserializer A0D = r7.A0D(tjO, r4, jsonDeserializer);
            if (A0D == jsonDeserializer) {
                return this;
            }
            C13782Tgx tgx = this.A01;
            C269574fL.A0E(StdDelegatingDeserializer.class, this, "withDelegate");
            return new StdDelegatingDeserializer(r4, A0D, tgx);
        }
        C13782Tgx tgx2 = this.A01;
        C268894eF BHa = tgx2.BHa(r7.A05());
        JsonDeserializer A0B = r7.A0B(tjO, BHa);
        C269574fL.A0E(StdDelegatingDeserializer.class, this, "withDelegate");
        return new StdDelegatingDeserializer(BHa, A0B, tgx2);
    }

    public final void EIS(C269674fV r3) {
        JsonDeserializer jsonDeserializer = this.A02;
        if (jsonDeserializer != null && (jsonDeserializer instanceof C269774ff)) {
            ((C269774ff) jsonDeserializer).EIS(r3);
        }
    }

    public StdDelegatingDeserializer(C268894eF r1, JsonDeserializer jsonDeserializer, C13782Tgx tgx) {
        super(r1);
        this.A01 = tgx;
        this.A00 = r1;
        this.A02 = jsonDeserializer;
    }

    public StdDelegatingDeserializer(C13782Tgx tgx) {
        super(Object.class);
        this.A01 = tgx;
        this.A00 = null;
        this.A02 = null;
    }
}

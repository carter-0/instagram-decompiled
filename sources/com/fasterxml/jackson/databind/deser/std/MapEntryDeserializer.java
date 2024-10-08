package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.16L;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C10889Rzp;
import X.C11287SJg;
import X.C13901TjO;
import X.C268894eF;
import X.C268944eK;
import X.C269674fV;
import X.C269764fe;
import X.C269784fg;
import X.C51973G9u;
import X.Pxf;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.util.AbstractMap;
import java.util.Map;

@JacksonStdImpl
public class MapEntryDeserializer extends ContainerDeserializerBase implements C269784fg {
    public final JsonDeserializer A00;
    public final C10889Rzp A01;
    public final C11287SJg A02;

    public MapEntryDeserializer(C268894eF r3, JsonDeserializer jsonDeserializer, C10889Rzp rzp, C11287SJg sJg) {
        super(r3, (C269764fe) null, (Boolean) null);
        if (((C268944eK) r3).A01.A01.length == 2) {
            this.A01 = rzp;
            this.A00 = jsonDeserializer;
            this.A02 = sJg;
            return;
        }
        throw C51973G9u.A0g(r3, "Missing generic type information for ", AnonymousClass7TE.A1A());
    }

    public final /* bridge */ /* synthetic */ Object A0C(16F r2, C269674fV r3, Object obj) {
        throw AnonymousClass7TE.A0z("Cannot update Map.Entry values");
    }

    public final Integer A0I() {
        return AnonymousClass05K.A0C;
    }

    public final JsonDeserializer ALh(C13901TjO tjO, C269674fV r8) {
        JsonDeserializer A0D;
        C10889Rzp rzp = this.A01;
        C10889Rzp rzp2 = rzp;
        if (rzp == null) {
            rzp = r8.A0G(this.A00.A07(0));
        }
        JsonDeserializer jsonDeserializer = this.A00;
        JsonDeserializer A05 = StdDeserializer.A05(tjO, r8, jsonDeserializer);
        C268894eF A07 = this.A00.A07(1);
        if (A05 == null) {
            A0D = r8.A0B(tjO, A07);
        } else {
            A0D = r8.A0D(tjO, A07, A05);
        }
        C11287SJg sJg = this.A02;
        C11287SJg sJg2 = sJg;
        if (sJg != null) {
            sJg = sJg.A02(tjO);
        }
        if (rzp2 == rzp && jsonDeserializer == A0D && sJg2 == sJg) {
            return this;
        }
        return new MapEntryDeserializer(A0D, rzp, this, sJg);
    }

    public final /* bridge */ /* synthetic */ Object A0D(16F r9, C269674fV r10) {
        Object obj;
        String A0m;
        Object[] objArr;
        16L A10 = r9.A10();
        if (A10 == 16L.A0D) {
            A10 = r9.A1J();
        } else if (!(A10 == 16L.A0A || A10 == 16L.A09)) {
            if (A10 == 16L.A0C) {
                return A0h(r9, r10);
            }
            Pxf.A1G(r9, r10, this);
            throw AnonymousClass00P.createAndThrow();
        }
        16L r7 = 16L.A0A;
        if (A10 == r7) {
            C10889Rzp rzp = this.A01;
            JsonDeserializer jsonDeserializer = this.A00;
            C11287SJg sJg = this.A02;
            String A0Y = r9.A0Y();
            Object A002 = rzp.A00(r10, A0Y);
            try {
                if (r9.A1J() == 16L.A0G) {
                    obj = jsonDeserializer.BWm(r10);
                } else if (sJg == null) {
                    obj = jsonDeserializer.A0D(r9, r10);
                } else {
                    obj = jsonDeserializer.A0J(r9, r10, sJg);
                }
                16L A1J = r9.A1J();
                if (A1J == 16L.A09) {
                    return new AbstractMap.SimpleEntry(A002, obj);
                }
                if (A1J == r7) {
                    objArr = new Object[]{r9.A0Y()};
                    A0m = "Problem binding JSON into Map.Entry: more than one entry in JSON (second field: '%s')";
                } else {
                    A0m = AnonymousClass7TG.A0m(A1J, "Problem binding JSON into Map.Entry: unexpected content after JSON Object entry: ", AnonymousClass7TE.A1A());
                    objArr = new Object[0];
                }
            } catch (Exception e) {
                ContainerDeserializerBase.A01(r10, Map.Entry.class, A0Y, e);
                throw AnonymousClass00P.createAndThrow();
            }
        } else if (A10 == 16L.A09) {
            objArr = new Object[0];
            A0m = "Cannot deserialize a Map.Entry out of empty JSON Object";
        } else {
            r10.A0T(r9, A0H());
            throw AnonymousClass00P.createAndThrow();
        }
        r10.A0h(A0m, objArr);
        throw AnonymousClass00P.createAndThrow();
    }

    public final Object A0J(16F r2, C269674fV r3, C11287SJg sJg) {
        return sJg.A05(r2, r3);
    }

    public MapEntryDeserializer(JsonDeserializer jsonDeserializer, C10889Rzp rzp, MapEntryDeserializer mapEntryDeserializer, C11287SJg sJg) {
        super(mapEntryDeserializer.A01, (ContainerDeserializerBase) mapEntryDeserializer, mapEntryDeserializer.A02);
        this.A01 = rzp;
        this.A00 = jsonDeserializer;
        this.A02 = sJg;
    }
}

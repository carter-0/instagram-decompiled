package com.fasterxml.jackson.datatype.guava.deser;

import X.16F;
import X.16L;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.C10889Rzp;
import X.C11287SJg;
import X.C13901TjO;
import X.C268894eF;
import X.C269674fV;
import X.C269764fe;
import X.C269784fg;
import X.Pxe;
import X.Pxf;
import X.Pxh;
import X.R0I;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.NaturalOrdering;

public abstract class GuavaMapDeserializer extends ContainerDeserializerBase implements C269784fg {
    public JsonDeserializer A00;
    public C10889Rzp A01;
    public final C11287SJg A02;

    public GuavaMapDeserializer(C268894eF r2, JsonDeserializer jsonDeserializer, C10889Rzp rzp, C269764fe r5, C11287SJg sJg) {
        super(r2, r5, (Boolean) null);
        this.A01 = rzp;
        this.A00 = jsonDeserializer;
        this.A02 = sJg;
    }

    public final Integer A0I() {
        return AnonymousClass05K.A0C;
    }

    public final JsonDeserializer ALh(C13901TjO tjO, C269674fV r11) {
        C10889Rzp rzp = this.A01;
        C10889Rzp rzp2 = rzp;
        JsonDeserializer jsonDeserializer = this.A00;
        C11287SJg sJg = this.A02;
        C11287SJg sJg2 = sJg;
        if (rzp == null) {
            rzp = r11.A0G(this.A00.A04());
        }
        C268894eF r4 = this.A00;
        JsonDeserializer A0W = Pxh.A0W(tjO, r11, r4, jsonDeserializer);
        if (sJg != null) {
            sJg = sJg.A02(tjO);
        }
        C269764fe A0V = A0V(tjO, r11, A0W);
        if (rzp2 == rzp && jsonDeserializer == A0W && sJg2 == sJg && this.A01 == A0V) {
            return this;
        }
        if (this instanceof ImmutableSortedMapDeserializer) {
            return new GuavaMapDeserializer(r4, A0W, rzp, A0V, sJg);
        }
        if (this instanceof ImmutableMapDeserializer) {
            return new GuavaMapDeserializer(r4, A0W, rzp, A0V, sJg);
        }
        return new GuavaMapDeserializer(r4, A0W, rzp, A0V, sJg);
    }

    public final Object A0D(16F r10, C269674fV r11) {
        R0I r0i;
        Object A0J;
        Object A0q;
        16L A11 = r10.A11();
        if (A11 == 16L.A0D) {
            A11 = r10.A1J();
        }
        16L r7 = 16L.A0A;
        if (A11 == r7 || A11 == 16L.A09) {
            GuavaImmutableMapDeserializer guavaImmutableMapDeserializer = (GuavaImmutableMapDeserializer) this;
            C10889Rzp rzp = guavaImmutableMapDeserializer.A01;
            JsonDeserializer jsonDeserializer = guavaImmutableMapDeserializer.A00;
            C11287SJg sJg = guavaImmutableMapDeserializer.A02;
            if (guavaImmutableMapDeserializer instanceof ImmutableSortedMapDeserializer) {
                ImmutableSortedMap immutableSortedMap = ImmutableSortedMap.A03;
                r0i = new R0I(NaturalOrdering.A00);
            } else if (guavaImmutableMapDeserializer instanceof ImmutableMapDeserializer) {
                r0i = Pxf.A0Q();
            } else {
                r0i = new ImmutableMap.Builder(4);
            }
            while (r10.A11() == r7) {
                String A0q2 = r10.A0q();
                Object obj = A0q2;
                if (rzp != null) {
                    obj = rzp.A00(r11, A0q2);
                }
                if (r10.A1J() != 16L.A0G) {
                    if (sJg == null) {
                        A0J = jsonDeserializer.A0D(r10, r11);
                    } else {
                        A0J = jsonDeserializer.A0J(r10, r11, sJg);
                    }
                    r0i.put(obj, A0J);
                } else if (!guavaImmutableMapDeserializer.A03 && (A0q = Pxe.A0q(r11, guavaImmutableMapDeserializer)) != null) {
                    r0i.put(obj, A0q);
                }
                r10.A1J();
            }
            return r0i.build();
        }
        r11.A0T(r10, this.A00.A00);
        throw AnonymousClass00P.createAndThrow();
    }

    public final Object A0J(16F r2, C269674fV r3, C11287SJg sJg) {
        return sJg.A05(r2, r3);
    }
}

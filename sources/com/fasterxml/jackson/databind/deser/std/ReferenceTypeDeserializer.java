package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.16L;
import X.AnonymousClass4iM;
import X.C11287SJg;
import X.C13901TjO;
import X.C257443xP;
import X.C268894eF;
import X.C269454f9;
import X.C269674fV;
import X.C269784fg;
import X.SK6;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.GuavaOptionalDeserializer;
import java.util.concurrent.atomic.AtomicReference;

public abstract class ReferenceTypeDeserializer extends StdDeserializer implements C269784fg {
    public final C268894eF A00;
    public final JsonDeserializer A01;
    public final SK6 A02;
    public final C11287SJg A03;

    public final Object A0C(16F r4, C269674fV r5, Object obj) {
        Object obj2;
        Object obj3;
        JsonDeserializer jsonDeserializer = this.A01;
        if (jsonDeserializer.A0G(r5.A02).equals(Boolean.FALSE) || this.A03 != null) {
            C11287SJg sJg = this.A03;
            if (sJg == null) {
                obj2 = jsonDeserializer.A0D(r4, r5);
            } else {
                obj2 = jsonDeserializer.A0J(r4, r5, sJg);
            }
        } else {
            boolean z = this instanceof GuavaOptionalDeserializer;
            if (z) {
                obj3 = ((C257443xP) obj).A03();
            } else {
                obj3 = ((AtomicReference) obj).get();
            }
            if (obj3 == null) {
                Object A0D = jsonDeserializer.A0D(r4, r5);
                if (z) {
                    return C257443xP.A00(A0D);
                }
                return new AtomicReference(A0D);
            }
            obj2 = jsonDeserializer.A0C(r4, r5, obj3);
        }
        if (this instanceof GuavaOptionalDeserializer) {
            return C257443xP.A00(obj2);
        }
        AtomicReference atomicReference = (AtomicReference) obj;
        atomicReference.set(obj2);
        return atomicReference;
    }

    public final Object A0D(16F r3, C269674fV r4) {
        Object A0J;
        SK6 sk6 = this.A02;
        if (sk6 != null) {
            return A0C(r3, r4, sk6.A04(r4));
        }
        C11287SJg sJg = this.A03;
        JsonDeserializer jsonDeserializer = this.A01;
        if (sJg == null) {
            A0J = jsonDeserializer.A0D(r3, r4);
        } else {
            A0J = jsonDeserializer.A0J(r3, r4, sJg);
        }
        if (this instanceof GuavaOptionalDeserializer) {
            return C257443xP.A00(A0J);
        }
        return new AtomicReference(A0J);
    }

    public final Boolean A0G(C269454f9 r2) {
        if (this instanceof AtomicReferenceDeserializer) {
            return Boolean.TRUE;
        }
        JsonDeserializer jsonDeserializer = this.A01;
        if (jsonDeserializer == null) {
            return null;
        }
        return jsonDeserializer.A0G(r2);
    }

    public final Integer A0I() {
        JsonDeserializer jsonDeserializer = this.A01;
        if (jsonDeserializer != null) {
            return jsonDeserializer.A0I();
        }
        return null;
    }

    public final Object A0J(16F r3, C269674fV r4, C11287SJg sJg) {
        if (r3.A19(16L.A0G)) {
            return BWm(r4);
        }
        C11287SJg sJg2 = this.A03;
        if (sJg2 == null) {
            return A0D(r3, r4);
        }
        Object A032 = sJg2.A03(r3, r4);
        if (this instanceof GuavaOptionalDeserializer) {
            return C257443xP.A00(A032);
        }
        return new AtomicReference(A032);
    }

    public final C268894eF A0T() {
        return this.A00;
    }

    public final SK6 A0W() {
        return this.A02;
    }

    public final JsonDeserializer ALh(C13901TjO tjO, C269674fV r7) {
        C268894eF r0;
        JsonDeserializer A0D;
        C268894eF r02;
        JsonDeserializer jsonDeserializer = this.A01;
        C268894eF r4 = this.A00;
        boolean z = r4 instanceof AnonymousClass4iM;
        if (jsonDeserializer == null) {
            if (z) {
                r02 = ((AnonymousClass4iM) r4).A01;
            } else {
                r02 = null;
            }
            A0D = r7.A0B(tjO, r02);
        } else {
            if (z) {
                r0 = ((AnonymousClass4iM) r4).A01;
            } else {
                r0 = null;
            }
            A0D = r7.A0D(tjO, r0, jsonDeserializer);
        }
        C11287SJg sJg = this.A03;
        C11287SJg sJg2 = sJg;
        if (sJg != null) {
            sJg = sJg.A02(tjO);
        }
        if (A0D == jsonDeserializer && sJg == sJg2) {
            return this;
        }
        boolean z2 = this instanceof GuavaOptionalDeserializer;
        SK6 sk6 = this.A02;
        if (z2) {
            return new ReferenceTypeDeserializer(r4, A0D, sk6, sJg);
        }
        return new ReferenceTypeDeserializer(r4, A0D, sk6, sJg);
    }

    public ReferenceTypeDeserializer(C268894eF r1, JsonDeserializer jsonDeserializer, SK6 sk6, C11287SJg sJg) {
        super(r1);
        this.A02 = sk6;
        this.A00 = r1;
        this.A01 = jsonDeserializer;
        this.A03 = sJg;
    }
}

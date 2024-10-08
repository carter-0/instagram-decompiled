package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.5E7  reason: invalid class name */
public final class AnonymousClass5E7 extends C249933kc implements Serializable {
    public final C269454f9 A00;
    public final C268894eF A01;
    public final C269664fU A02;
    public final Object A03;
    public final ConcurrentHashMap A04;
    public final AnonymousClass5I3 A05;
    public final 15p A06;
    public final JsonDeserializer A07;
    public transient C268894eF A08;

    public AnonymousClass5E7(C269454f9 r3, C268894eF r4, C268544da r5) {
        this.A00 = r3;
        this.A02 = r5.A02;
        this.A04 = r5.A0B;
        this.A06 = r5.A09;
        this.A01 = r4;
        this.A03 = null;
        this.A07 = A08(r4);
        this.A05 = null;
    }

    public final Object A05(16F r8, TA4 ta4) {
        AnonymousClass5E7 r1;
        C269454f9 r2 = this.A00;
        C268894eF A09 = r2.A01.A07.A09(ta4.A00);
        if (A09 == null || !A09.equals(this.A01)) {
            r1 = new AnonymousClass5E7(r2, A09, A08(A09), this, this.A03);
        } else {
            r1 = this;
        }
        return r1.A09(r8, r1.A03);
    }

    public final 15p A03() {
        return this.A06;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.4fU, X.4fV, X.4fF] */
    public final C252503pD A04(16F r8) {
        C252503pD r5;
        Object obj = this.A03;
        if (obj != null) {
            return (C252503pD) A09(r8, obj);
        }
        C269454f9 r6 = this.A00;
        int i = r6.A04;
        if (i != 0) {
            r8.A0l(r6.A03, i);
        }
        16L A10 = r8.A10();
        if (A10 == null && (A10 = r8.A1J()) == null) {
            return null;
        }
        ? r4 = new C269674fV(r8, r6, this.A02);
        if (A10 == 16L.A0G) {
            r5 = C383839gL.A00;
        } else {
            C268894eF r3 = this.A08;
            if (r3 == null) {
                r3 = r6.A01.A07.A09(C252503pD.class);
                this.A08 = r3;
            }
            C268894eF r2 = r3;
            if (r3 == null) {
                r2 = r6.A01.A07.A09(C252503pD.class);
                this.A08 = r2;
            }
            ConcurrentHashMap concurrentHashMap = this.A04;
            JsonDeserializer jsonDeserializer = (JsonDeserializer) concurrentHashMap.get(r2);
            if (jsonDeserializer == null) {
                jsonDeserializer = r4.A0E(r2);
                if (jsonDeserializer == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Cannot find a deserializer for type ");
                    sb.append(r2);
                    r4.A08(r2, sb.toString());
                    throw AnonymousClass00P.createAndThrow();
                }
                concurrentHashMap.put(r2, jsonDeserializer);
            }
            r5 = (C252503pD) r4.A0k(r8, r3, jsonDeserializer, (Object) null);
        }
        r8.A13();
        if (!r6.A0D(C269464fA.FAIL_ON_TRAILING_TOKENS)) {
            return r5;
        }
        C268894eF r0 = this.A08;
        if (r0 == null) {
            r0 = r6.A01.A07.A09(C252503pD.class);
            this.A08 = r0;
        }
        A0A(r8, r0);
        return r5;
    }

    public final void A06(17Z r3, Object obj) {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }

    public final JsonDeserializer A07(C269674fV r4) {
        String obj;
        JsonDeserializer jsonDeserializer = this.A07;
        if (jsonDeserializer == null) {
            C268894eF r2 = this.A01;
            if (r2 == null) {
                r2 = null;
                obj = "No value type configured for ObjectReader";
            } else {
                ConcurrentHashMap concurrentHashMap = this.A04;
                jsonDeserializer = (JsonDeserializer) concurrentHashMap.get(r2);
                if (jsonDeserializer == null) {
                    jsonDeserializer = r4.A0E(r2);
                    if (jsonDeserializer == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Cannot find a deserializer for type ");
                        sb.append(r2);
                        obj = sb.toString();
                    } else {
                        concurrentHashMap.put(r2, jsonDeserializer);
                    }
                }
            }
            r4.A08(r2, obj);
            throw AnonymousClass00P.createAndThrow();
        }
        return jsonDeserializer;
    }

    public final JsonDeserializer A08(C268894eF r6) {
        if (r6 == null) {
            return null;
        }
        C269454f9 r4 = this.A00;
        if (!r4.A0D(C269464fA.EAGER_DESERIALIZER_FETCH)) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.A04;
        JsonDeserializer jsonDeserializer = (JsonDeserializer) concurrentHashMap.get(r6);
        if (jsonDeserializer == null) {
            try {
                jsonDeserializer = new C269674fV(r4, (C269674fV) this.A02).A0E(r6);
                if (jsonDeserializer != null) {
                    concurrentHashMap.put(r6, jsonDeserializer);
                }
            } catch (C65181bG unused) {
            }
        }
        return jsonDeserializer;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.4fU, X.4fV] */
    public final Object A09(16F r6, Object obj) {
        C269664fU r0 = this.A02;
        C269454f9 r4 = this.A00;
        ? r3 = new C269674fV(r6, r4, r0);
        int i = r4.A04;
        if (i != 0) {
            r6.A0l(r4.A03, i);
        }
        16L A10 = r6.A10();
        if (A10 == null && (A10 = r6.A1J()) == null) {
            throw C8159Qi2.A04(r3.A07);
        }
        if (A10 == 16L.A0G) {
            if (obj == null) {
                obj = A07(r3).BWm(r3);
            }
        } else if (!(A10 == 16L.A08 || A10 == 16L.A09)) {
            obj = r3.A0k(r6, this.A01, A07(r3), this.A03);
        }
        r6.A13();
        if (r4.A0D(C269464fA.FAIL_ON_TRAILING_TOKENS)) {
            A0A(r6, this.A01);
        }
        return obj;
    }

    public final void A0A(16F r4, C268894eF r5) {
        Class<?> cls;
        Object obj;
        16L A1J = r4.A1J();
        if (A1J != null) {
            C269584fM[] r0 = C269574fL.A01;
            if (r5 == null) {
                cls = null;
            } else {
                cls = r5.A00;
            }
            if (cls == null && (obj = this.A03) != null) {
                cls = obj.getClass();
            }
            throw new AnonymousClass4iD(r4, String.format("Trailing token (of type %s) found after value (bound as %s): not allowed as per `DeserializationFeature.FAIL_ON_TRAILING_TOKENS`", new Object[]{A1J, C269574fL.A06(cls)}));
        }
    }

    public AnonymousClass5E7(C269454f9 r2, C268894eF r3, JsonDeserializer jsonDeserializer, AnonymousClass5E7 r5, Object obj) {
        this.A00 = r2;
        this.A02 = r5.A02;
        this.A04 = r5.A04;
        this.A06 = r5.A06;
        this.A01 = r3;
        this.A07 = jsonDeserializer;
        this.A03 = obj;
        this.A05 = r5.A05;
    }
}

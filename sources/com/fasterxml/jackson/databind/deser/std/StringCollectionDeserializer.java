package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.16L;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass4iD;
import X.C11287SJg;
import X.C268894eF;
import X.C269464fA;
import X.C269674fV;
import X.C269764fe;
import X.C269784fg;
import X.Pxe;
import X.SK6;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.util.Collection;

@JacksonStdImpl
public final class StringCollectionDeserializer extends ContainerDeserializerBase implements C269784fg {
    public final JsonDeserializer A00;
    public final JsonDeserializer A01;
    public final SK6 A02;

    public final /* bridge */ /* synthetic */ Object A0D(16F r3, C269674fV r4) {
        JsonDeserializer jsonDeserializer = this.A00;
        if (jsonDeserializer != null) {
            return this.A02.A09(r4, jsonDeserializer.A0D(r3, r4));
        }
        return A0C(r3, r4, (Collection) this.A02.A04(r4));
    }

    public final Integer A0I() {
        return AnonymousClass05K.A01;
    }

    public final boolean A0M() {
        if (this.A01 == null && this.A00 == null) {
            return true;
        }
        return false;
    }

    public final SK6 A0W() {
        return this.A02;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.JsonDeserializer ALh(X.C13901TjO r11, X.C269674fV r12) {
        /*
            r10 = this;
            X.SK6 r8 = r10.A02
            r6 = 0
            if (r8 == 0) goto L_0x0061
            boolean r2 = r8 instanceof X.C8181Qim
            if (r2 == 0) goto L_0x0055
            r1 = r8
            X.Qim r1 = (X.C8181Qim) r1
            X.QkG r0 = r1.A02
            if (r0 == 0) goto L_0x0055
            X.4eF r0 = r1.A00
        L_0x0012:
            com.fasterxml.jackson.databind.JsonDeserializer r5 = r12.A0B(r11, r0)
        L_0x0016:
            com.fasterxml.jackson.databind.JsonDeserializer r2 = r10.A01
            X.4eF r4 = r10.A00
            X.4eF r0 = r4.A03()
            if (r2 != 0) goto L_0x0050
            com.fasterxml.jackson.databind.JsonDeserializer r3 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.A05(r11, r12, r2)
            if (r3 != 0) goto L_0x002a
            com.fasterxml.jackson.databind.JsonDeserializer r3 = r12.A0B(r11, r0)
        L_0x002a:
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            X.RDC r0 = X.RDC.ACCEPT_SINGLE_VALUE_AS_ARRAY
            java.lang.Boolean r9 = r10.A0X(r0, r11, r12, r1)
            X.4fe r7 = r10.A0V(r11, r12, r3)
            boolean r0 = X.C269574fL.A0K(r3)
            if (r0 != 0) goto L_0x003d
            r6 = r3
        L_0x003d:
            java.lang.Boolean r0 = r10.A02
            boolean r0 = X.2Ob.A00(r0, r9)
            if (r0 == 0) goto L_0x0063
            X.4fe r0 = r10.A01
            if (r0 != r7) goto L_0x0063
            if (r2 != r6) goto L_0x0063
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r10.A00
            if (r0 != r5) goto L_0x0063
            return r10
        L_0x0050:
            com.fasterxml.jackson.databind.JsonDeserializer r3 = r12.A0D(r11, r0, r2)
            goto L_0x002a
        L_0x0055:
            if (r2 == 0) goto L_0x0061
            r1 = r8
            X.Qim r1 = (X.C8181Qim) r1
            X.QkG r0 = r1.A04
            if (r0 == 0) goto L_0x0061
            X.4eF r0 = r1.A01
            goto L_0x0012
        L_0x0061:
            r5 = r6
            goto L_0x0016
        L_0x0063:
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer r3 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.ALh(X.TjO, X.4fV):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    public StringCollectionDeserializer(C268894eF r1, JsonDeserializer jsonDeserializer, JsonDeserializer jsonDeserializer2, C269764fe r4, SK6 sk6, Boolean bool) {
        super(r1, r4, bool);
        this.A01 = jsonDeserializer2;
        this.A02 = sk6;
        this.A00 = jsonDeserializer;
    }

    public final Object A0J(16F r2, C269674fV r3, C11287SJg sJg) {
        return sJg.A04(r2, r3);
    }

    /* renamed from: A0y */
    public final Collection A0C(16F r4, C269674fV r5, Collection collection) {
        String str;
        boolean z;
        Object obj;
        if (!r4.A16()) {
            Boolean bool = this.A02;
            if (bool == Boolean.TRUE || (bool == null && r5.A0j(C269464fA.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                JsonDeserializer jsonDeserializer = this.A01;
                if (r4.A10() == 16L.A0G) {
                    if (this.A03) {
                        return collection;
                    }
                    obj = Pxe.A0q(r5, this);
                } else if (jsonDeserializer == null) {
                    try {
                        obj = A0l(r4, r5);
                    } catch (Exception e) {
                        throw AnonymousClass4iD.A03(collection, e, collection.size());
                    }
                } else {
                    obj = (String) jsonDeserializer.A0D(r4, r5);
                }
                collection.add(obj);
                return collection;
            } else if (r4.A19(16L.A0J)) {
                return (Collection) A0i(r4, r5);
            } else {
                r5.A0R(r4, this.A00);
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            JsonDeserializer jsonDeserializer2 = this.A01;
            if (jsonDeserializer2 != null) {
                while (true) {
                    if (r4.A1O() == null) {
                        16L A10 = r4.A10();
                        if (A10 == 16L.A08) {
                            return collection;
                        }
                        if (A10 != 16L.A0G) {
                            str = (String) jsonDeserializer2.A0D(r4, r5);
                        } else if (!this.A03) {
                            str = (String) Pxe.A0q(r5, this);
                        }
                    } else {
                        str = (String) jsonDeserializer2.A0D(r4, r5);
                    }
                    collection.add(str);
                }
            } else {
                while (true) {
                    String A1O = r4.A1O();
                    if (A1O == null) {
                        16L A102 = r4.A10();
                        if (A102 == 16L.A08) {
                            return collection;
                        }
                        if (A102 != 16L.A0G) {
                            A1O = A0l(r4, r5);
                        } else if (!this.A03) {
                            A1O = (String) Pxe.A0q(r5, this);
                        }
                    }
                    collection.add(A1O);
                }
            }
        }
    }
}

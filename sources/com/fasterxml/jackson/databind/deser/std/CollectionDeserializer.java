package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.16L;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass4iD;
import X.C10582Ruc;
import X.C11287SJg;
import X.C268894eF;
import X.C269464fA;
import X.C269574fL;
import X.C269674fV;
import X.C269764fe;
import X.C269784fg;
import X.C66582MXn;
import X.C8158Qi1;
import X.C8186Qir;
import X.Pxe;
import X.SK6;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.util.Collection;
import java.util.List;

@JacksonStdImpl
public class CollectionDeserializer extends ContainerDeserializerBase implements C269784fg {
    public final JsonDeserializer A00;
    public final JsonDeserializer A01;
    public final SK6 A02;
    public final C11287SJg A03;

    public final /* bridge */ /* synthetic */ Object A0C(16F r2, C269674fV r3, Object obj) {
        Collection collection = (Collection) obj;
        if (r2.A16()) {
            return A0y(r2, r3, collection);
        }
        A0z(r2, r3, collection);
        return collection;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        if (r1 != null) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object A0D(X.16F r6, X.C269674fV r7) {
        /*
            r5 = this;
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r5.A00
            if (r0 == 0) goto L_0x000f
            X.SK6 r1 = r5.A02
            java.lang.Object r0 = r0.A0D(r6, r7)
            java.lang.Object r0 = r1.A09(r7, r0)
            return r0
        L_0x000f:
            boolean r0 = r6.A16()
            if (r0 == 0) goto L_0x0028
            boolean r0 = r5 instanceof com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer
            if (r0 == 0) goto L_0x001f
            r0 = 0
        L_0x001a:
            java.util.Collection r0 = r5.A0y(r6, r7, r0)
            return r0
        L_0x001f:
            X.SK6 r0 = r5.A02
            java.lang.Object r0 = r0.A04(r7)
            java.util.Collection r0 = (java.util.Collection) r0
            goto L_0x001a
        L_0x0028:
            X.16L r0 = X.16L.A0J
            boolean r0 = r6.A19(r0)
            if (r0 == 0) goto L_0x0069
            java.lang.String r4 = r6.A1P()
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x004e
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            java.lang.Integer r1 = r7.A0N(r1, r0)
            java.lang.String r0 = "empty String (\"\")"
            r5.A0u(r7, r1, r4, r0)
            if (r1 == 0) goto L_0x0069
        L_0x0049:
            java.lang.Object r0 = r5.A0j(r7, r1)
            return r0
        L_0x004e:
            int r3 = r4.length()
            r2 = 0
        L_0x0053:
            if (r2 >= r3) goto L_0x0060
            char r1 = r4.charAt(r2)
            r0 = 32
            if (r1 > r0) goto L_0x0069
            int r2 = r2 + 1
            goto L_0x0053
        L_0x0060:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            java.lang.Integer r1 = r7.A0O(r1, r0)
            goto L_0x0049
        L_0x0069:
            boolean r0 = r5 instanceof com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer
            if (r0 == 0) goto L_0x0072
            r0 = 0
        L_0x006e:
            r5.A0z(r6, r7, r0)
            return r0
        L_0x0072:
            X.SK6 r0 = r5.A02
            java.lang.Object r0 = r0.A04(r7)
            java.util.Collection r0 = (java.util.Collection) r0
            goto L_0x006e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.A0D(X.16F, X.4fV):java.lang.Object");
    }

    public final Integer A0I() {
        return AnonymousClass05K.A01;
    }

    public final boolean A0M() {
        if (this.A01 == null && this.A03 == null && this.A00 == null) {
            return true;
        }
        return false;
    }

    public final SK6 A0W() {
        return this.A02;
    }

    public final void A0z(16F r4, C269674fV r5, Collection collection) {
        Object obj;
        Boolean bool = this.A02;
        if (bool == Boolean.TRUE || (bool == null && r5.A0j(C269464fA.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            JsonDeserializer jsonDeserializer = this.A01;
            C11287SJg sJg = this.A03;
            try {
                if (r4.A19(16L.A0G)) {
                    if (!this.A03) {
                        obj = Pxe.A0q(r5, this);
                    } else {
                        return;
                    }
                } else if (sJg == null) {
                    obj = jsonDeserializer.A0D(r4, r5);
                } else {
                    obj = jsonDeserializer.A0J(r4, r5, sJg);
                }
                collection.add(obj);
            } catch (Exception e) {
                if (!r5.A0j(C269464fA.WRAP_EXCEPTIONS)) {
                    C269574fL.A0F(e);
                }
                throw AnonymousClass4iD.A03(Object.class, e, collection.size());
            }
        } else {
            r5.A0R(r4, this.A00);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ com.fasterxml.jackson.databind.JsonDeserializer ALh(X.C13901TjO r11, X.C269674fV r12) {
        /*
            r10 = this;
            X.SK6 r7 = r10.A02
            if (r7 == 0) goto L_0x004c
            boolean r0 = r7.A0M()
            if (r0 == 0) goto L_0x0029
            boolean r0 = r7 instanceof X.C8181Qim
            if (r0 == 0) goto L_0x0015
            r0 = r7
            X.Qim r0 = (X.C8181Qim) r0
            X.4eF r0 = r0.A01
            if (r0 != 0) goto L_0x0047
        L_0x0015:
            X.4eF r2 = r10.A00
            java.lang.String r0 = X.C66581MXm.A0y(r7)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r0}
            java.lang.String r0 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'"
        L_0x0021:
            X.Pxf.A1H(r12, r2, r0, r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0029:
            boolean r0 = r7.A0K()
            if (r0 == 0) goto L_0x004c
            boolean r0 = r7 instanceof X.C8181Qim
            if (r0 == 0) goto L_0x003a
            r0 = r7
            X.Qim r0 = (X.C8181Qim) r0
            X.4eF r0 = r0.A00
            if (r0 != 0) goto L_0x0047
        L_0x003a:
            X.4eF r2 = r10.A00
            java.lang.String r0 = X.C66581MXm.A0y(r7)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r0}
            java.lang.String r0 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'"
            goto L_0x0021
        L_0x0047:
            com.fasterxml.jackson.databind.JsonDeserializer r5 = r12.A0B(r11, r0)
            goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            X.RDC r0 = X.RDC.ACCEPT_SINGLE_VALUE_AS_ARRAY
            java.lang.Boolean r9 = r10.A0X(r0, r11, r12, r1)
            com.fasterxml.jackson.databind.JsonDeserializer r2 = r10.A01
            com.fasterxml.jackson.databind.JsonDeserializer r0 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.A05(r11, r12, r2)
            X.4eF r3 = r10.A00
            com.fasterxml.jackson.databind.JsonDeserializer r4 = X.Pxh.A0W(r11, r12, r3, r0)
            X.SJg r8 = r10.A03
            r1 = r8
            if (r8 == 0) goto L_0x006a
            X.SJg r8 = r8.A02(r11)
        L_0x006a:
            X.4fe r6 = r10.A0V(r11, r12, r4)
            java.lang.Boolean r0 = r10.A02
            boolean r0 = X.2Ob.A00(r9, r0)
            if (r0 == 0) goto L_0x0083
            X.4fe r0 = r10.A01
            if (r6 != r0) goto L_0x0083
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r10.A00
            if (r5 != r0) goto L_0x0083
            if (r4 != r2) goto L_0x0083
            if (r8 != r1) goto L_0x0083
            return r10
        L_0x0083:
            boolean r0 = r10 instanceof com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer
            if (r0 == 0) goto L_0x008d
            com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer r2 = new com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        L_0x008d:
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer r2 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.ALh(X.TjO, X.4fV):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    public CollectionDeserializer(C268894eF r1, JsonDeserializer jsonDeserializer, JsonDeserializer jsonDeserializer2, C269764fe r4, SK6 sk6, C11287SJg sJg, Boolean bool) {
        super(r1, r4, bool);
        this.A01 = jsonDeserializer;
        this.A03 = sJg;
        this.A02 = sk6;
        this.A00 = jsonDeserializer2;
    }

    public final Object A0J(16F r2, C269674fV r3, C11287SJg sJg) {
        return sJg.A04(r2, r3);
    }

    public Collection A0y(16F r7, C269674fV r8, Collection collection) {
        Object A0J;
        Object A0J2;
        r7.A0t(collection);
        JsonDeserializer jsonDeserializer = this.A01;
        if (jsonDeserializer.A0F() != null) {
            if (r7.A16()) {
                r7.A0t(collection);
                C11287SJg sJg = this.A03;
                C10582Ruc ruc = new C10582Ruc(this.A00.A03().A00, collection);
                while (true) {
                    16L A1J = r7.A1J();
                    if (A1J == 16L.A08) {
                        break;
                    }
                    try {
                        if (A1J == 16L.A0G) {
                            if (!this.A03) {
                                A0J2 = Pxe.A0q(r8, this);
                            }
                        } else if (sJg == null) {
                            A0J2 = jsonDeserializer.A0D(r7, r8);
                        } else {
                            A0J2 = jsonDeserializer.A0J(r7, r8, sJg);
                        }
                        List list = ruc.A00;
                        if (list.isEmpty()) {
                            ruc.A02.add(A0J2);
                        } else {
                            ((C8186Qir) C66582MXn.A0r(list)).A01.add(A0J2);
                        }
                    } catch (C8158Qi1 e) {
                        C8186Qir qir = new C8186Qir(e, ruc, ruc.A01);
                        ruc.A00.add(qir);
                        e.A00.A00(qir);
                    }
                }
            } else {
                A0z(r7, r8, collection);
            }
        } else {
            C11287SJg sJg2 = this.A03;
            while (true) {
                16L A1J2 = r7.A1J();
                if (A1J2 == 16L.A08) {
                    break;
                }
                try {
                    if (A1J2 == 16L.A0G) {
                        if (!this.A03) {
                            A0J = Pxe.A0q(r8, this);
                        }
                    } else if (sJg2 == null) {
                        A0J = jsonDeserializer.A0D(r7, r8);
                    } else {
                        A0J = jsonDeserializer.A0J(r7, r8, sJg2);
                    }
                    collection.add(A0J);
                } catch (Exception e2) {
                    if (r8 != null && !r8.A0j(C269464fA.WRAP_EXCEPTIONS)) {
                        C269574fL.A0F(e2);
                    }
                    throw AnonymousClass4iD.A03(collection, e2, collection.size());
                }
            }
        }
        return collection;
    }
}

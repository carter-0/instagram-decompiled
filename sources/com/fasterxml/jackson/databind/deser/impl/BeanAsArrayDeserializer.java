package com.fasterxml.jackson.databind.deser.impl;

import X.16F;
import X.16L;
import X.AnonymousClass00P;
import X.AnonymousClass7TF;
import X.C269464fA;
import X.C269574fL;
import X.C269674fV;
import X.C8218QkR;
import X.Pxi;
import X.SGT;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;

public class BeanAsArrayDeserializer extends BeanDeserializerBase {
    public final BeanDeserializerBase A00;
    public final C8218QkR[] A01;

    public final void A1G(16F r9, C269674fV r10) {
        r10.A0Q(r9, r9.A10(), A0U(r10), "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", C269574fL.A04(this.A08), r9.A10());
        throw AnonymousClass00P.createAndThrow();
    }

    public BeanAsArrayDeserializer(BeanDeserializerBase beanDeserializerBase, C8218QkR[] qkRArr) {
        super(beanDeserializerBase, beanDeserializerBase.A0E);
        this.A00 = beanDeserializerBase;
        this.A01 = qkRArr;
    }

    public final JsonDeserializer A0A(SGT sgt) {
        return this.A00.A0A(sgt);
    }

    public final Object A0C(16F r6, C269674fV r7, Object obj) {
        r6.A0t(obj);
        if (!r6.A16()) {
            A1G(r6, r7);
        } else {
            Pxi.A1E(r7, this);
            C8218QkR[] qkRArr = this.A01;
            int length = qkRArr.length;
            int i = 0;
            while (true) {
                16L A1J = r6.A1J();
                16L r2 = 16L.A08;
                if (A1J == r2) {
                    return obj;
                }
                if (i != length) {
                    C8218QkR qkR = qkRArr[i];
                    if (qkR != null) {
                        try {
                            qkR.A0K(obj, r6, r7);
                        } catch (Exception e) {
                            A1E(r7, obj, qkR.A06.A02, e);
                            throw AnonymousClass00P.createAndThrow();
                        }
                    } else {
                        r6.A0z();
                    }
                    i++;
                } else if (this.A0E || !r7.A0j(C269464fA.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    do {
                        r6.A0z();
                    } while (r6.A1J() != r2);
                    return obj;
                } else {
                    r7.A0V(r2, "Unexpected JSON values; expected at most %d properties (in JSON Array)", AnonymousClass7TF.A1b(length));
                }
            }
        }
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        if (r7.A0E == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0079, code lost:
        if (r9.A0j(X.C269464fA.FAIL_ON_UNKNOWN_PROPERTIES) != false) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0D(X.16F r8, X.C269674fV r9) {
        /*
            r7 = this;
            boolean r0 = r8.A16()
            if (r0 != 0) goto L_0x000e
            r7.A1G(r8, r9)
        L_0x0009:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000e:
            boolean r0 = r7.A07
            if (r0 != 0) goto L_0x0058
            boolean r0 = r7.A06
            if (r0 == 0) goto L_0x001b
            java.lang.Object r4 = r7.A17(r8, r9)
        L_0x001a:
            return r4
        L_0x001b:
            X.SK6 r0 = r7.A09
            java.lang.Object r4 = r0.A04(r9)
            r8.A0t(r4)
            X.Pxi.A1E(r9, r7)
            boolean r0 = r7.A0F
            if (r0 == 0) goto L_0x0056
            java.lang.Class r6 = r9.A05
        L_0x002d:
            X.QkR[] r2 = r7.A01
            int r5 = r2.length
            r1 = 0
        L_0x0031:
            X.16L r0 = r8.A1J()
            X.16L r3 = X.16L.A08
            if (r0 == r3) goto L_0x001a
            if (r1 != r5) goto L_0x0040
            boolean r0 = r7.A0E
            if (r0 != 0) goto L_0x0093
            goto L_0x007b
        L_0x0040:
            r3 = r2[r1]
            int r1 = r1 + 1
            if (r3 == 0) goto L_0x0052
            if (r6 == 0) goto L_0x004e
            boolean r0 = r3.A0R(r6)
            if (r0 == 0) goto L_0x0052
        L_0x004e:
            r3.A0K(r4, r8, r9)     // Catch:{ Exception -> 0x009d }
            goto L_0x0031
        L_0x0052:
            r8.A0z()
            goto L_0x0031
        L_0x0056:
            r6 = 0
            goto L_0x002d
        L_0x0058:
            X.SK6 r0 = r7.A09
            java.lang.Object r4 = r0.A04(r9)
            r8.A0t(r4)
            X.QkR[] r2 = r7.A01
            int r5 = r2.length
            r1 = 0
        L_0x0065:
            X.16L r0 = r8.A1J()
            X.16L r3 = X.16L.A08
            if (r0 == r3) goto L_0x001a
            if (r1 != r5) goto L_0x0085
            boolean r0 = r7.A0E
            if (r0 != 0) goto L_0x0093
            X.4fA r0 = X.C269464fA.FAIL_ON_UNKNOWN_PROPERTIES
            boolean r0 = r9.A0j(r0)
            if (r0 == 0) goto L_0x0093
        L_0x007b:
            java.lang.Object[] r1 = X.AnonymousClass7TF.A1b(r5)
            java.lang.String r0 = "Unexpected JSON values; expected at most %d properties (in JSON Array)"
            r9.A0V(r3, r0, r1)
            goto L_0x0009
        L_0x0085:
            r3 = r2[r1]
            if (r3 == 0) goto L_0x008d
            r3.A0K(r4, r8, r9)     // Catch:{ Exception -> 0x009d }
            goto L_0x0090
        L_0x008d:
            r8.A0z()
        L_0x0090:
            int r1 = r1 + 1
            goto L_0x0065
        L_0x0093:
            r8.A0z()
            X.16L r0 = r8.A1J()
            if (r0 != r3) goto L_0x0093
            return r4
        L_0x009d:
            r1 = move-exception
            X.4f7 r0 = r3.A06
            java.lang.String r0 = r0.A02
            r7.A1E(r9, r4, r0, r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer.A0D(X.16F, X.4fV):java.lang.Object");
    }
}

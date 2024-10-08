package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.C10889Rzp;
import X.C11287SJg;
import X.C13901TjO;
import X.C268894eF;
import X.C269354ez;
import X.C269454f9;
import X.C269574fL;
import X.C269674fV;
import X.C269764fe;
import X.C269774ff;
import X.C269784fg;
import X.C66581MXm;
import X.C8181Qim;
import X.Pxe;
import X.Pxf;
import X.Pxh;
import X.SK6;
import X.SOB;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.util.EnumMap;

public class EnumMapDeserializer extends ContainerDeserializerBase implements C269774ff, C269784fg {
    public JsonDeserializer A00;
    public JsonDeserializer A01;
    public C10889Rzp A02;
    public SOB A03;
    public final SK6 A04;
    public final C11287SJg A05;
    public final Class A06;

    public final JsonDeserializer ALh(C13901TjO tjO, C269674fV r11) {
        C10889Rzp rzp = this.A02;
        C10889Rzp rzp2 = rzp;
        if (rzp == null) {
            rzp = r11.A0G(this.A00.A04());
        }
        JsonDeserializer jsonDeserializer = this.A01;
        JsonDeserializer A0W = Pxh.A0W(tjO, r11, this.A00, jsonDeserializer);
        C11287SJg sJg = this.A05;
        C11287SJg sJg2 = sJg;
        if (sJg != null) {
            sJg = sJg.A02(tjO);
        }
        C269764fe A0V = A0V(tjO, r11, A0W);
        if (rzp == rzp2 && A0V == this.A01 && A0W == jsonDeserializer && sJg == sJg2) {
            return this;
        }
        return new EnumMapDeserializer(A0W, rzp, A0V, this, sJg);
    }

    public EnumMapDeserializer(JsonDeserializer jsonDeserializer, C10889Rzp rzp, C269764fe r4, EnumMapDeserializer enumMapDeserializer, C11287SJg sJg) {
        super(r4, (ContainerDeserializerBase) enumMapDeserializer, enumMapDeserializer.A02);
        this.A06 = enumMapDeserializer.A06;
        this.A02 = rzp;
        this.A01 = jsonDeserializer;
        this.A05 = sJg;
        this.A04 = enumMapDeserializer.A04;
        this.A00 = enumMapDeserializer.A00;
        this.A03 = enumMapDeserializer.A03;
    }

    public final /* bridge */ /* synthetic */ Object A0C(16F r1, C269674fV r2, Object obj) {
        EnumMap enumMap = (EnumMap) obj;
        A0z(r1, r2, enumMap);
        return enumMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0098 A[SYNTHETIC, Splitter:B:35:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object A0D(X.16F r8, X.C269674fV r9) {
        /*
            r7 = this;
            X.SOB r4 = r7.A03
            if (r4 == 0) goto L_0x00ac
            r2 = 0
            int r0 = r4.A00
            X.S7L r3 = new X.S7L
            r3.<init>(r8, r9, r2, r0)
            boolean r0 = r8.A17()
            if (r0 != 0) goto L_0x0089
            X.16L r0 = X.16L.A0A
            boolean r0 = r8.A19(r0)
            if (r0 == 0) goto L_0x001e
            java.lang.String r2 = r8.A0Y()
        L_0x001e:
            if (r2 == 0) goto L_0x0098
            X.16L r6 = r8.A1J()
            X.QkR r1 = X.SOB.A00(r4, r2)
            if (r1 == 0) goto L_0x0038
            java.lang.Object r0 = r1.A0C(r8, r9)
            boolean r0 = r3.A03(r1, r0)
            if (r0 == 0) goto L_0x0089
            r8.A1J()
            goto L_0x008e
        L_0x0038:
            X.Rzp r0 = r7.A02
            java.lang.Object r5 = r0.A00(r9, r2)
            if (r5 != 0) goto L_0x005b
            X.4fA r0 = X.C269464fA.READ_UNKNOWN_ENUM_VALUES_AS_NULL
            boolean r0 = r9.A0j(r0)
            if (r0 != 0) goto L_0x0083
            java.lang.Class r3 = r7.A06
            X.4eF r0 = r7.A00
            X.4eF r0 = r0.A04()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "value not one of declared Enum instance names for %s"
            r9.A0e(r3, r2, r0, r1)
            goto L_0x00d1
        L_0x005b:
            X.16L r0 = X.16L.A0G     // Catch:{ Exception -> 0x009f }
            if (r6 != r0) goto L_0x0068
            boolean r0 = r7.A03     // Catch:{ Exception -> 0x009f }
            if (r0 != 0) goto L_0x0089
            java.lang.Object r2 = X.Pxe.A0q(r9, r7)     // Catch:{ Exception -> 0x009f }
            goto L_0x0079
        L_0x0068:
            X.SJg r1 = r7.A05     // Catch:{ Exception -> 0x009f }
            if (r1 != 0) goto L_0x0073
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r7.A01     // Catch:{ Exception -> 0x009f }
            java.lang.Object r2 = r0.A0D(r8, r9)     // Catch:{ Exception -> 0x009f }
            goto L_0x0079
        L_0x0073:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r7.A01     // Catch:{ Exception -> 0x009f }
            java.lang.Object r2 = r0.A0J(r8, r9, r1)     // Catch:{ Exception -> 0x009f }
        L_0x0079:
            X.RsD r1 = r3.A02
            X.Qin r0 = new X.Qin
            r0.<init>(r1, r2, r5)
            r3.A02 = r0
            goto L_0x0089
        L_0x0083:
            r8.A1J()
            r8.A0z()
        L_0x0089:
            java.lang.String r2 = r8.A1N()
            goto L_0x001e
        L_0x008e:
            java.lang.Object r0 = r4.A02(r9, r3)     // Catch:{ Exception -> 0x009f }
            java.util.EnumMap r0 = (java.util.EnumMap) r0     // Catch:{ Exception -> 0x009f }
            r7.A0z(r8, r9, r0)
            return r0
        L_0x0098:
            java.lang.Object r0 = r4.A02(r9, r3)     // Catch:{ Exception -> 0x009f }
            java.util.EnumMap r0 = (java.util.EnumMap) r0     // Catch:{ Exception -> 0x009f }
            return r0
        L_0x009f:
            r1 = move-exception
            X.4eF r0 = r7.A00
            java.lang.Class r0 = r0.A00
            com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase.A01(r9, r0, r2, r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00ac:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r7.A00
            if (r0 == 0) goto L_0x00bb
            X.SK6 r1 = r7.A04
            java.lang.Object r0 = r0.A0D(r8, r9)
            java.lang.Object r0 = r1.A09(r9, r0)
            return r0
        L_0x00bb:
            int r1 = r8.A0x()
            r0 = 1
            if (r1 == r0) goto L_0x00e0
            r0 = 2
            if (r1 == r0) goto L_0x00e0
            r0 = 3
            if (r1 == r0) goto L_0x00db
            r0 = 5
            if (r1 == r0) goto L_0x00e0
            r0 = 6
            if (r1 == r0) goto L_0x00d6
            X.Pxf.A1G(r8, r9, r7)
        L_0x00d1:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00d6:
            java.lang.Object r0 = r7.A0i(r8, r9)
            return r0
        L_0x00db:
            java.lang.Object r0 = r7.A0h(r8, r9)
            return r0
        L_0x00e0:
            java.util.EnumMap r0 = r7.A0y(r9)
            r7.A0z(r8, r9, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer.A0D(X.16F, X.4fV):java.lang.Object");
    }

    public final Integer A0I() {
        return AnonymousClass05K.A0C;
    }

    public final boolean A0M() {
        if (this.A01 == null && this.A02 == null && this.A05 == null) {
            return true;
        }
        return false;
    }

    public final SK6 A0W() {
        return this.A04;
    }

    public final EnumMap A0y(C269674fV r5) {
        SK6 sk6 = this.A04;
        if (sk6 == null) {
            return new EnumMap(this.A06);
        }
        try {
            if (sk6.A0L()) {
                return (EnumMap) sk6.A04(r5);
            }
            r5.A0Y(sk6, A0H(), "no default constructor found", Pxe.A1b());
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            C269574fL.A0D(r5, e);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void EIS(C269674fV r5) {
        C268894eF r0;
        C268894eF r2;
        Object[] objArr;
        String str;
        SK6 sk6 = this.A04;
        if (sk6 != null) {
            if (sk6.A0M()) {
                if (!(sk6 instanceof C8181Qim) || (r0 = ((C8181Qim) sk6).A01) == null) {
                    r2 = this.A00;
                    objArr = new Object[]{r2, C66581MXm.A0y(sk6)};
                    str = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'";
                }
                this.A00 = r5.A0B((C13901TjO) null, r0);
                return;
            } else if (sk6.A0K()) {
                if (!(sk6 instanceof C8181Qim) || (r0 = ((C8181Qim) sk6).A00) == null) {
                    r2 = this.A00;
                    objArr = new Object[]{r2, C66581MXm.A0y(sk6)};
                    str = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
                }
                this.A00 = r5.A0B((C13901TjO) null, r0);
                return;
            } else if (sk6.A0I()) {
                C269454f9 r22 = r5.A02;
                this.A03 = SOB.A01(r5, sk6, sk6.A0O(r22), r22.A09(C269354ez.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
                return;
            } else {
                return;
            }
            Pxf.A1H(r5, r2, str, objArr);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final Object A0J(16F r2, C269674fV r3, C11287SJg sJg) {
        return sJg.A05(r2, r3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0z(X.16F r7, X.C269674fV r8, java.util.EnumMap r9) {
        /*
            r6 = this;
            r7.A0t(r9)
            com.fasterxml.jackson.databind.JsonDeserializer r5 = r6.A01
            X.SJg r4 = r6.A05
            boolean r0 = r7.A17()
            r3 = 0
            if (r0 != 0) goto L_0x0025
            X.16L r1 = r7.A10()
            X.16L r2 = X.16L.A0A
            if (r1 == r2) goto L_0x002a
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x0082
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r8.A0V(r2, r1, r0)
        L_0x0020:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0025:
            java.lang.String r3 = r7.A1N()
            goto L_0x002e
        L_0x002a:
            java.lang.String r3 = r7.A0Y()
        L_0x002e:
            if (r3 == 0) goto L_0x0082
            X.Rzp r0 = r6.A02
            java.lang.Object r2 = r0.A00(r8, r3)
            java.lang.Enum r2 = (java.lang.Enum) r2
            X.16L r1 = r7.A1J()
            if (r2 != 0) goto L_0x005d
            X.4fA r0 = X.C269464fA.READ_UNKNOWN_ENUM_VALUES_AS_NULL
            boolean r0 = r8.A0j(r0)
            if (r0 != 0) goto L_0x0059
            java.lang.Class r2 = r6.A06
            X.4eF r0 = r6.A00
            X.4eF r0 = r0.A04()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "value not one of declared Enum instance names for %s"
            r8.A0e(r2, r3, r0, r1)
            goto L_0x0020
        L_0x0059:
            r7.A0z()
            goto L_0x0025
        L_0x005d:
            X.16L r0 = X.16L.A0G     // Catch:{ Exception -> 0x0079 }
            if (r1 != r0) goto L_0x006a
            boolean r0 = r6.A03     // Catch:{ Exception -> 0x0079 }
            if (r0 != 0) goto L_0x0025
            java.lang.Object r0 = X.Pxe.A0q(r8, r6)     // Catch:{ Exception -> 0x0079 }
            goto L_0x0075
        L_0x006a:
            if (r4 != 0) goto L_0x0071
            java.lang.Object r0 = r5.A0D(r7, r8)     // Catch:{ Exception -> 0x0079 }
            goto L_0x0075
        L_0x0071:
            java.lang.Object r0 = r5.A0J(r7, r8, r4)     // Catch:{ Exception -> 0x0079 }
        L_0x0075:
            r9.put(r2, r0)
            goto L_0x0025
        L_0x0079:
            r0 = move-exception
            com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase.A01(r8, r9, r3, r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer.A0z(X.16F, X.4fV, java.util.EnumMap):void");
    }

    public EnumMapDeserializer(C268894eF r3, JsonDeserializer jsonDeserializer, SK6 sk6, C11287SJg sJg) {
        super(r3, (C269764fe) null, (Boolean) null);
        this.A06 = r3.A04().A00;
        this.A02 = null;
        this.A01 = jsonDeserializer;
        this.A05 = sJg;
        this.A04 = sk6;
    }
}

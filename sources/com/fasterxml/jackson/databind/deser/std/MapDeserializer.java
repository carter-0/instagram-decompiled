package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C10583Rud;
import X.C10889Rzp;
import X.C11287SJg;
import X.C13901TjO;
import X.C268854eA;
import X.C268894eF;
import X.C269674fV;
import X.C269764fe;
import X.C269774ff;
import X.C269784fg;
import X.C8158Qi1;
import X.C8189Qiu;
import X.Pxe;
import X.Pxh;
import X.SK6;
import X.SOB;
import X.SQ7;
import X.T9R;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.util.HashSet;
import java.util.Set;

@JacksonStdImpl
public class MapDeserializer extends ContainerDeserializerBase implements C269774ff, C269784fg {
    public JsonDeserializer A00;
    public SOB A01;
    public T9R A02;
    public Set A03;
    public Set A04;
    public boolean A05;
    public final JsonDeserializer A06;
    public final C10889Rzp A07;
    public final SK6 A08;
    public final C11287SJg A09;
    public final boolean A0A;

    public MapDeserializer(C268894eF r3, JsonDeserializer jsonDeserializer, C10889Rzp rzp, SK6 sk6, C11287SJg sJg) {
        super(r3, (C269764fe) null, (Boolean) null);
        this.A07 = rzp;
        this.A06 = jsonDeserializer;
        this.A09 = sJg;
        this.A08 = sk6;
        this.A0A = sk6.A0L();
        this.A00 = null;
        this.A01 = null;
        this.A05 = A0z(r3, rzp);
        this.A02 = null;
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0z(X.C268894eF r4, X.C10889Rzp r5) {
        /*
            r3 = this;
            r2 = 1
            if (r5 == 0) goto L_0x0019
            X.4eF r0 = r4.A04()
            if (r0 == 0) goto L_0x0019
            java.lang.Class r1 = r0.A00
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r1 == r0) goto L_0x0013
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r1 != r0) goto L_0x001a
        L_0x0013:
            boolean r0 = X.C269574fL.A0K(r5)
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            return r2
        L_0x001a:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.MapDeserializer.A0z(X.4eF, X.Rzp):boolean");
    }

    private void A00(C269674fV r3, C8158Qi1 qi1, C10583Rud rud, Object obj) {
        if (rud == null) {
            r3.A0h(AnonymousClass7TG.A0m(qi1, "Unresolved forward reference but no identity info: ", AnonymousClass7TE.A1A()), Pxe.A1b());
            throw AnonymousClass00P.createAndThrow();
        }
        C8189Qiu qiu = new C8189Qiu(qi1, rud, rud.A02, obj);
        rud.A00.add(qiu);
        qi1.A00.A00(qiu);
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object A0C(X.16F r8, X.C269674fV r9, java.lang.Object r10) {
        /*
            r7 = this;
            java.util.Map r10 = (java.util.Map) r10
            r8.A0t(r10)
            X.16L r1 = r8.A10()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x001d
            X.16L r0 = X.16L.A0A
            if (r1 == r0) goto L_0x001d
            X.4eF r0 = r7.A00
            java.lang.Class r0 = r0.A00
            r9.A0T(r8, r0)
        L_0x0018:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001d:
            boolean r0 = r7.A05
            if (r0 == 0) goto L_0x0082
            com.fasterxml.jackson.databind.JsonDeserializer r4 = r7.A06
            X.SJg r3 = r7.A09
            boolean r0 = r8.A17()
            if (r0 != 0) goto L_0x004a
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x00fc
            X.16L r2 = X.16L.A0A
            if (r1 != r2) goto L_0x00e9
            java.lang.String r2 = r8.A0Y()
        L_0x0037:
            if (r2 == 0) goto L_0x00fc
            X.16L r1 = r8.A1J()
            X.T9R r0 = r7.A02
            if (r0 == 0) goto L_0x004f
            boolean r0 = r0.A00(r2)
            if (r0 == 0) goto L_0x004f
            r8.A0z()
        L_0x004a:
            java.lang.String r2 = r8.A1N()
            goto L_0x0037
        L_0x004f:
            X.16L r0 = X.16L.A0G     // Catch:{ Exception -> 0x00f3 }
            if (r1 != r0) goto L_0x005f
            boolean r0 = r7.A03     // Catch:{ Exception -> 0x00f3 }
            if (r0 != 0) goto L_0x004a
            java.lang.Object r0 = X.Pxe.A0q(r9, r7)     // Catch:{ Exception -> 0x00f3 }
        L_0x005b:
            r10.put(r2, r0)     // Catch:{ Exception -> 0x00f3 }
            goto L_0x004a
        L_0x005f:
            java.lang.Object r1 = r10.get(r2)     // Catch:{ Exception -> 0x00f3 }
            if (r1 == 0) goto L_0x0074
            if (r3 != 0) goto L_0x006c
            java.lang.Object r0 = r4.A0C(r8, r9, r1)     // Catch:{ Exception -> 0x00f3 }
            goto L_0x007f
        L_0x006c:
            r9.A0X(r4)     // Catch:{ Exception -> 0x00f3 }
            java.lang.Object r0 = r4.A0J(r8, r9, r3)     // Catch:{ Exception -> 0x00f3 }
            goto L_0x007f
        L_0x0074:
            if (r3 != 0) goto L_0x007b
            java.lang.Object r0 = r4.A0D(r8, r9)     // Catch:{ Exception -> 0x00f3 }
            goto L_0x007f
        L_0x007b:
            java.lang.Object r0 = r4.A0J(r8, r9, r3)     // Catch:{ Exception -> 0x00f3 }
        L_0x007f:
            if (r0 == r1) goto L_0x004a
            goto L_0x005b
        L_0x0082:
            X.Rzp r5 = r7.A07
            com.fasterxml.jackson.databind.JsonDeserializer r4 = r7.A06
            X.SJg r3 = r7.A09
            boolean r0 = r8.A17()
            if (r0 != 0) goto L_0x00b1
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x00fc
            X.16L r2 = X.16L.A0A
            if (r1 != r2) goto L_0x00e9
            java.lang.String r2 = r8.A0Y()
        L_0x009a:
            if (r2 == 0) goto L_0x00fc
            java.lang.Object r6 = r5.A00(r9, r2)
            X.16L r1 = r8.A1J()
            X.T9R r0 = r7.A02
            if (r0 == 0) goto L_0x00b6
            boolean r0 = r0.A00(r2)
            if (r0 == 0) goto L_0x00b6
            r8.A0z()
        L_0x00b1:
            java.lang.String r2 = r8.A1N()
            goto L_0x009a
        L_0x00b6:
            X.16L r0 = X.16L.A0G     // Catch:{ Exception -> 0x00f3 }
            if (r1 != r0) goto L_0x00c6
            boolean r0 = r7.A03     // Catch:{ Exception -> 0x00f3 }
            if (r0 != 0) goto L_0x00b1
            java.lang.Object r0 = X.Pxe.A0q(r9, r7)     // Catch:{ Exception -> 0x00f3 }
        L_0x00c2:
            r10.put(r6, r0)     // Catch:{ Exception -> 0x00f3 }
            goto L_0x00b1
        L_0x00c6:
            java.lang.Object r1 = r10.get(r6)     // Catch:{ Exception -> 0x00f3 }
            if (r1 == 0) goto L_0x00db
            if (r3 != 0) goto L_0x00d3
            java.lang.Object r0 = r4.A0C(r8, r9, r1)     // Catch:{ Exception -> 0x00f3 }
            goto L_0x00e6
        L_0x00d3:
            r9.A0X(r4)     // Catch:{ Exception -> 0x00f3 }
            java.lang.Object r0 = r4.A0J(r8, r9, r3)     // Catch:{ Exception -> 0x00f3 }
            goto L_0x00e6
        L_0x00db:
            if (r3 != 0) goto L_0x00e2
            java.lang.Object r0 = r4.A0D(r8, r9)     // Catch:{ Exception -> 0x00f3 }
            goto L_0x00e6
        L_0x00e2:
            java.lang.Object r0 = r4.A0J(r8, r9, r3)     // Catch:{ Exception -> 0x00f3 }
        L_0x00e6:
            if (r0 == r1) goto L_0x00b1
            goto L_0x00c2
        L_0x00e9:
            r1 = 0
            java.lang.Object[] r0 = X.Pxe.A1b()
            r9.A0V(r2, r1, r0)
            goto L_0x0018
        L_0x00f3:
            r0 = move-exception
            com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase.A01(r9, r10, r2, r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00fc:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.MapDeserializer.A0C(X.16F, X.4fV, java.lang.Object):java.lang.Object");
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object A0D(X.16F r11, X.C269674fV r12) {
        /*
            r10 = this;
            X.SOB r7 = r10.A01
            if (r7 == 0) goto L_0x008e
            r2 = 0
            int r0 = r7.A00
            X.S7L r6 = new X.S7L
            r6.<init>(r11, r12, r2, r0)
            com.fasterxml.jackson.databind.JsonDeserializer r5 = r10.A06
            X.SJg r4 = r10.A09
            boolean r0 = r11.A17()
            if (r0 != 0) goto L_0x0035
            X.16L r0 = X.16L.A0A
            boolean r0 = r11.A19(r0)
            if (r0 == 0) goto L_0x0022
            java.lang.String r2 = r11.A0Y()
        L_0x0022:
            if (r2 == 0) goto L_0x007e
            X.16L r8 = r11.A1J()
            X.T9R r0 = r10.A02
            if (r0 == 0) goto L_0x003a
            boolean r0 = r0.A00(r2)
            if (r0 == 0) goto L_0x003a
            r11.A0z()
        L_0x0035:
            java.lang.String r2 = r11.A1N()
            goto L_0x0022
        L_0x003a:
            X.QkR r1 = X.SOB.A00(r7, r2)
            if (r1 == 0) goto L_0x004e
            java.lang.Object r0 = r1.A0C(r11, r12)
            boolean r0 = r6.A03(r1, r0)
            if (r0 == 0) goto L_0x0035
            r11.A1J()
            goto L_0x0076
        L_0x004e:
            X.Rzp r0 = r10.A07
            java.lang.Object r3 = r0.A00(r12, r2)
            X.16L r0 = X.16L.A0G     // Catch:{ Exception -> 0x0085 }
            if (r8 != r0) goto L_0x0061
            boolean r0 = r10.A03     // Catch:{ Exception -> 0x0085 }
            if (r0 != 0) goto L_0x0035
            java.lang.Object r2 = X.Pxe.A0q(r12, r10)     // Catch:{ Exception -> 0x0085 }
            goto L_0x006c
        L_0x0061:
            if (r4 != 0) goto L_0x0068
            java.lang.Object r2 = r5.A0D(r11, r12)     // Catch:{ Exception -> 0x0085 }
            goto L_0x006c
        L_0x0068:
            java.lang.Object r2 = r5.A0J(r11, r12, r4)     // Catch:{ Exception -> 0x0085 }
        L_0x006c:
            X.RsD r1 = r6.A02
            X.Qin r0 = new X.Qin
            r0.<init>(r1, r2, r3)
            r6.A02 = r0
            goto L_0x0035
        L_0x0076:
            java.lang.Object r5 = r7.A02(r12, r6)     // Catch:{ Exception -> 0x0085 }
            java.util.Map r5 = (java.util.Map) r5     // Catch:{ Exception -> 0x0085 }
            goto L_0x0176
        L_0x007e:
            java.lang.Object r5 = r7.A02(r12, r6)     // Catch:{ Exception -> 0x0085 }
            java.util.Map r5 = (java.util.Map) r5     // Catch:{ Exception -> 0x0085 }
            return r5
        L_0x0085:
            r1 = move-exception
            X.4eF r0 = r10.A00
            java.lang.Class r0 = r0.A00
            com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase.A01(r12, r0, r2, r1)
            goto L_0x00b1
        L_0x008e:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r10.A00
            if (r0 == 0) goto L_0x009d
            X.SK6 r1 = r10.A08
            java.lang.Object r0 = r0.A0D(r11, r12)
            java.lang.Object r5 = r1.A09(r12, r0)
        L_0x009c:
            return r5
        L_0x009d:
            boolean r0 = r10.A0A
            if (r0 != 0) goto L_0x00b6
            X.4eF r0 = r10.A00
            java.lang.Class r3 = r0.A00
            X.SK6 r2 = r10.A08
            java.lang.Object[] r1 = X.Pxe.A1b()
            java.lang.String r0 = "no default constructor found"
            r12.A0Y(r2, r3, r0, r1)
        L_0x00b1:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00b6:
            int r1 = r11.A0x()
            r0 = 1
            if (r1 == r0) goto L_0x00cd
            r0 = 2
            if (r1 == r0) goto L_0x00cd
            r0 = 3
            if (r1 == r0) goto L_0x0171
            r0 = 5
            if (r1 == r0) goto L_0x00cd
            r0 = 6
            if (r1 == r0) goto L_0x016c
            X.Pxf.A1G(r11, r12, r10)
            goto L_0x00b1
        L_0x00cd:
            X.SK6 r0 = r10.A08
            java.lang.Object r5 = r0.A04(r12)
            java.util.Map r5 = (java.util.Map) r5
            boolean r0 = r10.A05
            if (r0 == 0) goto L_0x0176
            com.fasterxml.jackson.databind.JsonDeserializer r6 = r10.A06
            X.SJg r4 = r10.A09
            X.T9I r0 = r6.A0F()
            r8 = 0
            boolean r9 = X.AnonymousClass7TF.A1V(r0)
            r7 = 0
            if (r9 == 0) goto L_0x010e
            X.4eF r0 = r10.A00
            X.4eF r0 = r0.A03()
            java.lang.Class r0 = r0.A00
            X.Rud r3 = new X.Rud
            r3.<init>(r0, r5)
        L_0x00f6:
            boolean r0 = r11.A17()
            if (r0 != 0) goto L_0x0127
            X.16L r2 = r11.A10()
            X.16L r0 = X.16L.A09
            if (r2 == r0) goto L_0x009c
            X.16L r1 = X.16L.A0A
            if (r2 == r1) goto L_0x0110
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r12.A0V(r1, r7, r0)
            goto L_0x00b1
        L_0x010e:
            r3 = r7
            goto L_0x00f6
        L_0x0110:
            java.lang.String r7 = r11.A0Y()
        L_0x0114:
            if (r7 == 0) goto L_0x009c
            X.16L r1 = r11.A1J()
            X.T9R r0 = r10.A02
            if (r0 == 0) goto L_0x012c
            boolean r0 = r0.A00(r7)
            if (r0 == 0) goto L_0x012c
            r11.A0z()
        L_0x0127:
            java.lang.String r7 = r11.A1N()
            goto L_0x0114
        L_0x012c:
            X.16L r0 = X.16L.A0G     // Catch:{ Qi1 -> 0x0161, Exception -> 0x0166 }
            if (r1 != r0) goto L_0x0139
            boolean r0 = r10.A03     // Catch:{ Qi1 -> 0x0161, Exception -> 0x0166 }
            if (r0 != 0) goto L_0x0127
            java.lang.Object r2 = X.Pxe.A0q(r12, r10)     // Catch:{ Qi1 -> 0x0161, Exception -> 0x0166 }
            goto L_0x0144
        L_0x0139:
            if (r4 != 0) goto L_0x0140
            java.lang.Object r2 = r6.A0D(r11, r12)     // Catch:{ Qi1 -> 0x0161, Exception -> 0x0166 }
            goto L_0x0144
        L_0x0140:
            java.lang.Object r2 = r6.A0J(r11, r12, r4)     // Catch:{ Qi1 -> 0x0161, Exception -> 0x0166 }
        L_0x0144:
            if (r9 == 0) goto L_0x015d
            java.util.List r1 = r3.A00     // Catch:{ Qi1 -> 0x0161, Exception -> 0x0166 }
            boolean r0 = r1.isEmpty()     // Catch:{ Qi1 -> 0x0161, Exception -> 0x0166 }
            if (r0 == 0) goto L_0x0154
            java.util.Map r0 = r3.A01     // Catch:{ Qi1 -> 0x0161, Exception -> 0x0166 }
        L_0x0150:
            r0.put(r7, r2)     // Catch:{ Qi1 -> 0x0161, Exception -> 0x0166 }
            goto L_0x0127
        L_0x0154:
            java.lang.Object r0 = X.C66582MXn.A0r(r1)     // Catch:{ Qi1 -> 0x0161, Exception -> 0x0166 }
            X.Qiu r0 = (X.C8189Qiu) r0     // Catch:{ Qi1 -> 0x0161, Exception -> 0x0166 }
            java.util.Map r0 = r0.A02     // Catch:{ Qi1 -> 0x0161, Exception -> 0x0166 }
            goto L_0x0150
        L_0x015d:
            r5.put(r7, r2)     // Catch:{ Qi1 -> 0x0161, Exception -> 0x0166 }
            goto L_0x0127
        L_0x0161:
            r0 = move-exception
            r10.A00(r12, r0, r3, r7)
            goto L_0x0127
        L_0x0166:
            r0 = move-exception
            com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase.A01(r12, r5, r7, r0)
            goto L_0x00b1
        L_0x016c:
            java.lang.Object r5 = r10.A0i(r11, r12)
            return r5
        L_0x0171:
            java.lang.Object r5 = r10.A0h(r11, r12)
            return r5
        L_0x0176:
            r10.A0y(r11, r12, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.MapDeserializer.A0D(X.16F, X.4fV):java.lang.Object");
    }

    public final Integer A0I() {
        return AnonymousClass05K.A0C;
    }

    public final boolean A0M() {
        if (this.A06 == null && this.A07 == null && this.A09 == null && this.A03 == null && this.A04 == null) {
            return true;
        }
        return false;
    }

    public final SK6 A0W() {
        return this.A08;
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0y(X.16F r11, X.C269674fV r12, java.util.Map r13) {
        /*
            r10 = this;
            X.Rzp r6 = r10.A07
            com.fasterxml.jackson.databind.JsonDeserializer r5 = r10.A06
            X.SJg r4 = r10.A09
            X.T9I r0 = r5.A0F()
            r8 = 0
            boolean r9 = X.AnonymousClass7TF.A1V(r0)
            r7 = 0
            if (r9 == 0) goto L_0x003b
            X.4eF r0 = r10.A00
            X.4eF r0 = r0.A03()
            java.lang.Class r0 = r0.A00
            X.Rud r3 = new X.Rud
            r3.<init>(r0, r13)
        L_0x001f:
            boolean r0 = r11.A17()
            if (r0 != 0) goto L_0x0058
            X.16L r2 = r11.A10()
            X.16L r1 = X.16L.A0A
            if (r2 == r1) goto L_0x003d
            X.16L r0 = X.16L.A09
            if (r2 == r0) goto L_0x00a0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r12.A0V(r1, r7, r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003b:
            r3 = r7
            goto L_0x001f
        L_0x003d:
            java.lang.String r8 = r11.A0Y()
        L_0x0041:
            if (r8 == 0) goto L_0x00a0
            java.lang.Object r7 = r6.A00(r12, r8)
            X.16L r1 = r11.A1J()
            X.T9R r0 = r10.A02
            if (r0 == 0) goto L_0x005d
            boolean r0 = r0.A00(r8)
            if (r0 == 0) goto L_0x005d
            r11.A0z()
        L_0x0058:
            java.lang.String r8 = r11.A1N()
            goto L_0x0041
        L_0x005d:
            X.16L r0 = X.16L.A0G     // Catch:{ Qi1 -> 0x0092, Exception -> 0x0097 }
            if (r1 != r0) goto L_0x006a
            boolean r0 = r10.A03     // Catch:{ Qi1 -> 0x0092, Exception -> 0x0097 }
            if (r0 != 0) goto L_0x0058
            java.lang.Object r2 = X.Pxe.A0q(r12, r10)     // Catch:{ Qi1 -> 0x0092, Exception -> 0x0097 }
            goto L_0x0075
        L_0x006a:
            if (r4 != 0) goto L_0x0071
            java.lang.Object r2 = r5.A0D(r11, r12)     // Catch:{ Qi1 -> 0x0092, Exception -> 0x0097 }
            goto L_0x0075
        L_0x0071:
            java.lang.Object r2 = r5.A0J(r11, r12, r4)     // Catch:{ Qi1 -> 0x0092, Exception -> 0x0097 }
        L_0x0075:
            if (r9 == 0) goto L_0x008e
            java.util.List r1 = r3.A00     // Catch:{ Qi1 -> 0x0092, Exception -> 0x0097 }
            boolean r0 = r1.isEmpty()     // Catch:{ Qi1 -> 0x0092, Exception -> 0x0097 }
            if (r0 == 0) goto L_0x0085
            java.util.Map r0 = r3.A01     // Catch:{ Qi1 -> 0x0092, Exception -> 0x0097 }
        L_0x0081:
            r0.put(r7, r2)     // Catch:{ Qi1 -> 0x0092, Exception -> 0x0097 }
            goto L_0x0058
        L_0x0085:
            java.lang.Object r0 = X.C66582MXn.A0r(r1)     // Catch:{ Qi1 -> 0x0092, Exception -> 0x0097 }
            X.Qiu r0 = (X.C8189Qiu) r0     // Catch:{ Qi1 -> 0x0092, Exception -> 0x0097 }
            java.util.Map r0 = r0.A02     // Catch:{ Qi1 -> 0x0092, Exception -> 0x0097 }
            goto L_0x0081
        L_0x008e:
            r13.put(r7, r2)     // Catch:{ Qi1 -> 0x0092, Exception -> 0x0097 }
            goto L_0x0058
        L_0x0092:
            r0 = move-exception
            r10.A00(r12, r0, r3, r7)
            goto L_0x0058
        L_0x0097:
            r0 = move-exception
            com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase.A01(r12, r13, r8, r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.MapDeserializer.A0y(X.16F, X.4fV, java.util.Map):void");
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:579)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:485)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        */
    public final com.fasterxml.jackson.databind.JsonDeserializer ALh(X.C13901TjO r18, X.C269674fV r19) {
        /*
            r17 = this;
            r13 = r17
            X.Rzp r11 = r13.A07
            r7 = r11
            r8 = r19
            if (r11 != 0) goto L_0x0013
            X.4eF r0 = r13.A00
            X.4eF r0 = r0.A04()
            X.Rzp r11 = r8.A0G(r0)
        L_0x0013:
            com.fasterxml.jackson.databind.JsonDeserializer r1 = r13.A06
            r6 = r1
            r9 = r18
            if (r18 == 0) goto L_0x001e
            com.fasterxml.jackson.databind.JsonDeserializer r1 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.A05(r9, r8, r1)
        L_0x001e:
            X.4eF r0 = r13.A00
            com.fasterxml.jackson.databind.JsonDeserializer r10 = X.Pxh.A0W(r9, r8, r0, r1)
            X.SJg r14 = r13.A09
            r5 = r14
            if (r14 == 0) goto L_0x002d
            X.SJg r14 = r14.A02(r9)
        L_0x002d:
            java.util.Set r15 = r13.A03
            java.util.Set r4 = r13.A04
            X.4f9 r0 = r8.A02
            X.4eA r3 = r0.A01()
            if (r3 == 0) goto L_0x009a
            if (r18 == 0) goto L_0x009a
            X.QkH r2 = r9.BRS()
            if (r2 == 0) goto L_0x009a
            X.T9o r1 = r3.A05(r2)
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x006c
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x004d:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x006f
            if (r15 != 0) goto L_0x0067
            java.util.HashSet r15 = X.AnonymousClass7TE.A1F()
        L_0x0059:
            java.util.Iterator r1 = r1.iterator()
        L_0x005d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006f
            X.JTT.A1U(r15, r1)
            goto L_0x005d
        L_0x0067:
            java.util.HashSet r15 = X.C66580MXl.A12(r15)
            goto L_0x0059
        L_0x006c:
            java.util.Set r1 = r1.A00
            goto L_0x004d
        L_0x006f:
            X.T9f r0 = r3.A07(r2)
            java.util.Set r0 = r0.A00
            if (r0 == 0) goto L_0x009a
            java.util.HashSet r3 = X.AnonymousClass7TE.A1F()
            if (r4 != 0) goto L_0x0082
            java.util.HashSet r3 = X.C66580MXl.A12(r0)
            goto L_0x009b
        L_0x0082:
            java.util.Iterator r2 = r0.iterator()
        L_0x0086:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x009b
            java.lang.Object r1 = r2.next()
            boolean r0 = r4.contains(r1)
            if (r0 == 0) goto L_0x0086
            r3.add(r1)
            goto L_0x0086
        L_0x009a:
            r3 = r4
        L_0x009b:
            X.4fe r12 = r13.A0V(r9, r8, r10)
            if (r7 != r11) goto L_0x00b2
            if (r6 != r10) goto L_0x00b2
            if (r5 != r14) goto L_0x00b2
            X.4fe r0 = r13.A01
            if (r0 != r12) goto L_0x00b2
            java.util.Set r0 = r13.A03
            if (r0 != r15) goto L_0x00b2
            java.util.Set r0 = r13.A04
            if (r0 != r3) goto L_0x00b2
            return r13
        L_0x00b2:
            com.fasterxml.jackson.databind.deser.std.MapDeserializer r9 = new com.fasterxml.jackson.databind.deser.std.MapDeserializer
            r16 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.MapDeserializer.ALh(X.TjO, X.4fV):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EIS(X.C269674fV r5) {
        /*
            r4 = this;
            X.SK6 r3 = r4.A08
            boolean r0 = r3.A0M()
            r1 = 0
            if (r0 == 0) goto L_0x0028
            boolean r0 = r3 instanceof X.C8181Qim
            if (r0 == 0) goto L_0x0014
            r0 = r3
            X.Qim r0 = (X.C8181Qim) r0
            X.4eF r0 = r0.A01
            if (r0 != 0) goto L_0x0046
        L_0x0014:
            X.4eF r2 = r4.A00
            java.lang.String r0 = X.C66581MXm.A0y(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r0}
            java.lang.String r0 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'"
        L_0x0020:
            X.Pxf.A1H(r5, r2, r0, r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0028:
            boolean r0 = r3.A0K()
            if (r0 == 0) goto L_0x004c
            boolean r0 = r3 instanceof X.C8181Qim
            if (r0 == 0) goto L_0x0039
            r0 = r3
            X.Qim r0 = (X.C8181Qim) r0
            X.4eF r0 = r0.A00
            if (r0 != 0) goto L_0x0046
        L_0x0039:
            X.4eF r2 = r4.A00
            java.lang.String r0 = X.C66581MXm.A0y(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r0}
            java.lang.String r0 = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'"
            goto L_0x0020
        L_0x0046:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r5.A0B(r1, r0)
            r4.A00 = r0
        L_0x004c:
            boolean r0 = r3.A0I()
            if (r0 == 0) goto L_0x0064
            X.4f9 r2 = r5.A02
            X.QkR[] r1 = r3.A0O(r2)
            X.4ez r0 = X.C269354ez.ACCEPT_CASE_INSENSITIVE_PROPERTIES
            boolean r0 = r2.A09(r0)
            X.SOB r0 = X.SOB.A01(r5, r3, r1, r0)
            r4.A01 = r0
        L_0x0064:
            X.4eF r1 = r4.A00
            X.Rzp r0 = r4.A07
            boolean r0 = r4.A0z(r1, r0)
            r4.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.MapDeserializer.EIS(X.4fV):void");
    }

    public final Object A0J(16F r2, C269674fV r3, C11287SJg sJg) {
        return sJg.A05(r2, r3);
    }

    public MapDeserializer(JsonDeserializer jsonDeserializer, C10889Rzp rzp, C269764fe r4, MapDeserializer mapDeserializer, C11287SJg sJg, Set set, Set set2) {
        super(r4, (ContainerDeserializerBase) mapDeserializer, mapDeserializer.A02);
        this.A07 = rzp;
        this.A06 = jsonDeserializer;
        this.A09 = sJg;
        this.A08 = mapDeserializer.A08;
        this.A01 = mapDeserializer.A01;
        this.A00 = mapDeserializer.A00;
        this.A0A = mapDeserializer.A0A;
        this.A03 = set;
        this.A04 = set2;
        this.A02 = SQ7.A00(set, set2);
        this.A05 = A0z(this.A00, rzp);
    }
}

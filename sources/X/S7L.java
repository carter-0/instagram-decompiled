package X;

import java.util.BitSet;

public final class S7L {
    public int A00;
    public int A01;
    public C10436RsD A02;
    public Object A03;
    public final 16F A04;
    public final C269674fV A05;
    public final T9I A06;
    public final BitSet A07;
    public final Object[] A08;

    public final void A01(C12829T9a t9a, Object obj, String str) {
        this.A02 = new C8184Qip(t9a, this.A02, obj, str);
    }

    public final void A02(C8218QkR qkR, Object obj) {
        this.A02 = new C8183Qio(qkR, this.A02, obj);
    }

    public final boolean A04(String str) {
        T9I t9i = this.A06;
        if (t9i == null || !str.equals(t9i.A04.A02)) {
            return false;
        }
        this.A03 = t9i.A03.A0D(this.A04, this.A05);
        return true;
    }

    public S7L(16F r2, C269674fV r3, T9I t9i, int i) {
        BitSet bitSet;
        this.A04 = r2;
        this.A05 = r3;
        this.A00 = i;
        this.A06 = t9i;
        this.A08 = new Object[i];
        if (i < 32) {
            bitSet = null;
        } else {
            bitSet = new BitSet();
        }
        this.A07 = bitSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r1 == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C8218QkR r4) {
        /*
            r3 = this;
            java.lang.Object r1 = r4.A0B()
            if (r1 == 0) goto L_0x0010
            X.4fV r0 = r3.A05
            r0.A0g(r1)
        L_0x000b:
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
        L_0x000f:
            throw r2
        L_0x0010:
            X.T9n r0 = r4.A00
            java.lang.Boolean r0 = r0.A02
            if (r0 == 0) goto L_0x001d
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            X.4fV r2 = r3.A05
            if (r0 == 0) goto L_0x0034
            X.4f7 r0 = r4.A06
            java.lang.String r1 = r0.A02
            int r0 = r4.A02()
            java.lang.Object[] r1 = X.C51968G9o.A1Z(r1, r0)
            java.lang.String r0 = "Missing required creator property '%s' (index %d)"
        L_0x0030:
            r2.A0W(r4, r0, r1)
            goto L_0x000b
        L_0x0034:
            X.4fA r0 = X.C269464fA.FAIL_ON_MISSING_CREATOR_PROPERTIES
            boolean r0 = r2.A0j(r0)
            if (r0 == 0) goto L_0x004b
            X.4f7 r0 = r4.A06
            java.lang.String r1 = r0.A02
            int r0 = r4.A02()
            java.lang.Object[] r1 = X.C51968G9o.A1Z(r1, r0)
            java.lang.String r0 = "Missing creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES` enabled"
            goto L_0x0030
        L_0x004b:
            X.4fe r0 = r4.A07     // Catch:{ 4iE -> 0x005c }
            java.lang.Object r0 = r0.AXg(r2)     // Catch:{ 4iE -> 0x005c }
            if (r0 != 0) goto L_0x006f
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r4.A03()     // Catch:{ 4iE -> 0x005c }
            java.lang.Object r0 = r0.AXg(r2)     // Catch:{ 4iE -> 0x005c }
            return r0
        L_0x005c:
            r2 = move-exception
            X.QkH r0 = r4.BRS()
            if (r0 == 0) goto L_0x000f
            java.lang.Class r1 = r0.A09()
            X.4f7 r0 = r4.A06
            java.lang.String r0 = r0.A02
            r2.A08(r1, r0)
            throw r2
        L_0x006f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S7L.A00(X.QkR):java.lang.Object");
    }

    public final boolean A03(C8218QkR qkR, Object obj) {
        int A022 = qkR.A02();
        this.A08[A022] = obj;
        BitSet bitSet = this.A07;
        if (bitSet == null) {
            int i = this.A01;
            int i2 = (1 << A022) | i;
            if (i == i2) {
                return false;
            }
            this.A01 = i2;
            int i3 = this.A00 - 1;
            this.A00 = i3;
            if (i3 > 0) {
                return false;
            }
            if (this.A06 == null || this.A03 != null) {
                return true;
            }
            return false;
        } else if (bitSet.get(A022)) {
            return false;
        } else {
            bitSet.set(A022);
            this.A00--;
            return false;
        }
    }
}

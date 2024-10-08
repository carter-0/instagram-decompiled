package X;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4cw  reason: invalid class name and case insensitive filesystem */
public final class C268194cw extends C268204cx implements Serializable {
    public final Map A00 = new LinkedHashMap();

    @Deprecated
    public final void A0B(C252503pD r2, String str) {
        if (r2 == null) {
            r2 = C383839gL.A00;
        }
        this.A00.put(str, r2);
    }

    public final void A0D(String str, long j) {
        this.A00.put(str, new C282605Dx(j));
    }

    public final void A0E(String str, String str2) {
        Object A002;
        if (str2 == null) {
            A002 = C383839gL.A00;
        } else {
            A002 = C282585Dv.A00(str2);
        }
        this.A00.put(str, A002);
    }

    public final void A0F(String str, boolean z) {
        C361498gK r1;
        if (z) {
            r1 = C361498gK.A02;
        } else {
            r1 = C361498gK.A01;
        }
        this.A00.put(str, r1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        if (r8.A05.A0D(X.C269424f6.A0H) != false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ENF(X.17Z r7, X.C269504fE r8, X.SPK r9) {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x000d
            X.4f6 r1 = X.C269424f6.WRITE_EMPTY_JSON_ARRAYS
            X.4et r0 = r8.A05
            boolean r0 = r0.A0D(r1)
            r5 = 1
            if (r0 == 0) goto L_0x000e
        L_0x000d:
            r5 = 0
        L_0x000e:
            X.16L r0 = X.16L.A0D
            X.RyK r0 = r9.A05(r0, r6)
            X.RyK r4 = r9.A03(r7, r0)
            java.util.Map r0 = r6.A00
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x0022:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0050
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r1 = r2.getValue()
            X.4cy r1 = (X.C268214cy) r1
            if (r5 == 0) goto L_0x0043
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L_0x0043
            boolean r0 = r1.A01(r8)
            if (r0 == 0) goto L_0x0043
            goto L_0x0022
        L_0x0043:
            java.lang.Object r0 = r2.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r7.A0q(r0)
            r1.EN9(r7, r8)
            goto L_0x0022
        L_0x0050:
            r9.A04(r7, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C268194cw.ENF(X.17Z, X.4fE, X.SPK):void");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C268194cw)) {
            return false;
        }
        return this.A00.equals(((C268194cw) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C268194cw(C269474fB r2) {
        super(r2);
    }

    public final void A0C(String str, int i) {
        this.A00.put(str, AnonymousClass5E0.A00(i));
    }
}

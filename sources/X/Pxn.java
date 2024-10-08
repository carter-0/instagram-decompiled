package X;

import java.util.HashMap;

public final class Pxn extends Pxo {
    public final HashMap A00 = AnonymousClass7TE.A1E();

    public final Pxv A04(Object obj) {
        return (Pxv) this.A00.get(obj);
    }

    public final Pxv A08(Object obj) {
        HashMap hashMap = this.A00;
        if (hashMap.containsKey(obj)) {
            return ((Pxv) hashMap.get(obj)).A01;
        }
        return null;
    }

    public final boolean A09(Object obj) {
        return this.A00.containsKey(obj);
    }

    public final Object A06(Object obj) {
        Object A06 = super.A06(obj);
        this.A00.remove(obj);
        return A06;
    }

    public final Object A07(Object obj, Object obj2) {
        Pxv A04 = A04(obj);
        if (A04 != null) {
            return A04.A03;
        }
        HashMap hashMap = this.A00;
        Pxv pxv = new Pxv(obj, obj2);
        this.A00++;
        Pxv pxv2 = this.A01;
        if (pxv2 == null) {
            this.A02 = pxv;
        } else {
            pxv2.A00 = pxv;
            pxv.A01 = pxv2;
        }
        this.A01 = pxv;
        hashMap.put(obj, pxv);
        return null;
    }
}

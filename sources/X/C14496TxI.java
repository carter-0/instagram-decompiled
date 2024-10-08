package X;

/* renamed from: X.TxI  reason: case insensitive filesystem */
public final class C14496TxI implements C20964X6r {
    public final int A00;
    public final Object A01;

    public C14496TxI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final String E4z() {
        if (this.A00 != 0) {
            return ((C15286UZq) this.A01).A07().A04();
        }
        C14138TqY tqY = (C14138TqY) this.A01;
        C14200Trf trf = tqY.A07;
        if (trf != null) {
            return trf.A02(tqY.A01);
        }
        0qQ.A0F("dataSource");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String E50(C15050ULg uLg) {
        if (this.A00 != 0) {
            return E4z();
        }
        C14200Trf trf = ((C14138TqY) this.A01).A07;
        if (trf != null) {
            return trf.A02(uLg);
        }
        0qQ.A0F("dataSource");
        throw AnonymousClass00P.createAndThrow();
    }
}

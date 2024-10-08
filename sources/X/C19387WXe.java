package X;

/* renamed from: X.WXe  reason: case insensitive filesystem */
public final class C19387WXe implements C51930G7y {
    public final /* synthetic */ C15381Ube A00;

    public C19387WXe(C15381Ube ube) {
        this.A00 = ube;
    }

    public final C16672Uz8 Auk() {
        HAI hai = this.A00.A08;
        if (hai == null) {
            0qQ.A0F("dataSource");
            throw AnonymousClass00P.createAndThrow();
        }
        C16672Uz8 uz8 = hai.A00;
        0qQ.A07(uz8);
        return uz8;
    }

    public final int Aul() {
        HAI hai = this.A00.A08;
        if (hai == null) {
            0qQ.A0F("dataSource");
            throw AnonymousClass00P.createAndThrow();
        }
        return hai.A01.A00(hai.A00);
    }

    public final int B6M() {
        C14074TpO tpO = this.A00.A07;
        if (tpO == null) {
            C13988Tno.A0n();
            throw AnonymousClass00P.createAndThrow();
        }
        C238133Ar r0 = tpO.A06;
        if (r0 != null) {
            return r0.B6L();
        }
        return -1;
    }

    public final int BLS() {
        C14074TpO tpO = this.A00.A07;
        if (tpO == null) {
            C13988Tno.A0n();
            throw AnonymousClass00P.createAndThrow();
        }
        C238133Ar r0 = tpO.A06;
        if (r0 != null) {
            return r0.BLQ();
        }
        return -1;
    }
}

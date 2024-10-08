package X;

/* renamed from: X.Spy  reason: case insensitive filesystem */
public final class C12244Spy implements C13575Td0 {
    public final int A00;
    public final Object A01;

    public C12244Spy(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        if (this.A00 != 0) {
            return Boolean.valueOf(((C10970S3c) this.A01).A0J.A00());
        }
        return ((C12139Snk) this.A01).A04.getRequestRoutingRegion();
    }
}

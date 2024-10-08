package X;

/* renamed from: X.LtR  reason: case insensitive filesystem */
public final class C65443LtR implements JOP {
    public final 1Xj A00;
    public final String A01;

    public final String getId() {
        return this.A01;
    }

    public C65443LtR(1Xj r2) {
        this.A00 = r2;
        String id = r2.getId();
        if (id != null) {
            this.A01 = id;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}

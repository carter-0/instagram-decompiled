package X;

/* renamed from: X.4Ap  reason: invalid class name and case insensitive filesystem */
public final class C261704Ap extends 1Vg {
    public final /* synthetic */ AnonymousClass402 A00;

    public final String createQuery() {
        return "\n        UPDATE examples\n        SET label = ?,\n        label_timestamp = ?\n        WHERE context != ?\n        AND label = -1\n        ";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C261704Ap(C251983oI r1, AnonymousClass402 r2) {
        super(r1);
        this.A00 = r2;
    }
}

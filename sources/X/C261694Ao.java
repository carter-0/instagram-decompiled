package X;

/* renamed from: X.4Ao  reason: invalid class name and case insensitive filesystem */
public final class C261694Ao extends 1Vg {
    public final /* synthetic */ AnonymousClass402 A00;

    public final String createQuery() {
        return "\n        UPDATE examples\n        SET label = ?,\n        label_timestamp = ?\n        WHERE context= ?\n        ";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C261694Ao(C251983oI r1, AnonymousClass402 r2) {
        super(r1);
        this.A00 = r2;
    }
}

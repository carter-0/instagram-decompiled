package X;

/* renamed from: X.4At  reason: invalid class name and case insensitive filesystem */
public final class C261744At extends 1Vg {
    public final /* synthetic */ AnonymousClass40L A00;

    public final String createQuery() {
        return "\n        DELETE FROM signals\n        WHERE expiration_timestamp < ?\n      ";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C261744At(C251983oI r1, AnonymousClass40L r2) {
        super(r1);
        this.A00 = r2;
    }
}

package X;

/* renamed from: X.9Z6  reason: invalid class name */
public final class AnonymousClass9Z6 extends 1Vg {
    public final /* synthetic */ AnonymousClass93J A00;

    public final String createQuery() {
        return "\n    DELETE FROM medias\n    WHERE stored_time <= ? \n      AND type = ?";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9Z6(C251983oI r1, AnonymousClass93J r2) {
        super(r1);
        this.A00 = r2;
    }
}

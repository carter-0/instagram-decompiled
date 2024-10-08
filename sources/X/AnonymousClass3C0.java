package X;

/* renamed from: X.3C0  reason: invalid class name */
public final class AnonymousClass3C0 extends 1Vg {
    public final /* synthetic */ C238313Bj A00;

    public final String createQuery() {
        return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3C0(C251983oI r1, C238313Bj r2) {
        super(r1);
        this.A00 = r2;
    }
}

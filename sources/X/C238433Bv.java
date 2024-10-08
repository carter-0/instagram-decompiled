package X;

/* renamed from: X.3Bv  reason: invalid class name and case insensitive filesystem */
public final class C238433Bv extends 1Vg {
    public final /* synthetic */ C238313Bj A00;

    public final String createQuery() {
        return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C238433Bv(C251983oI r1, C238313Bj r2) {
        super(r1);
        this.A00 = r2;
    }
}

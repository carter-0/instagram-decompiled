package X;

/* renamed from: X.3Br  reason: invalid class name and case insensitive filesystem */
public final class C238393Br extends 1Vg {
    public final /* synthetic */ C238313Bj A00;

    public final String createQuery() {
        return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C238393Br(C251983oI r1, C238313Bj r2) {
        super(r1);
        this.A00 = r2;
    }
}

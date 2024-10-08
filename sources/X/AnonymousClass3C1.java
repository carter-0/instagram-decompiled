package X;

/* renamed from: X.3C1  reason: invalid class name */
public final class AnonymousClass3C1 extends 1Vg {
    public final /* synthetic */ C238313Bj A00;

    public final String createQuery() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3C1(C251983oI r1, C238313Bj r2) {
        super(r1);
        this.A00 = r2;
    }
}

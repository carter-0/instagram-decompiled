package X;

/* renamed from: X.5Fk  reason: invalid class name and case insensitive filesystem */
public final class C282955Fk extends 1Vf {
    public final /* synthetic */ C282945Fj A00;

    public final String createQuery() {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C282955Fk(C251983oI r1, C282945Fj r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void bind(AnonymousClass1WV r3, Object obj) {
        C10350Rqn rqn = (C10350Rqn) obj;
        r3.ADh(1, rqn.A01);
        r3.ADh(2, rqn.A00);
    }
}

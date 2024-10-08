package X;

/* renamed from: X.5Fd  reason: invalid class name and case insensitive filesystem */
public final class C282885Fd extends 1Vf {
    public final /* synthetic */ C282875Fc A00;

    public final String createQuery() {
        return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C282885Fd(C251983oI r1, C282875Fc r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void bind(AnonymousClass1WV r3, Object obj) {
        AnonymousClass9Fh r4 = (AnonymousClass9Fh) obj;
        r3.ADh(1, r4.A00);
        r3.ADh(2, r4.A01);
    }
}

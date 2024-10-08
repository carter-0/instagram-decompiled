package X;

/* renamed from: X.9Z0  reason: invalid class name */
public final class AnonymousClass9Z0 extends 1Vf {
    public final /* synthetic */ C332417Uy A00;

    public final String createQuery() {
        return "INSERT OR REPLACE INTO `global_impression_tracker` (`intervention_type`,`total_impressions`,`last_impression_timestamp`) VALUES (?,?,?)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9Z0(C251983oI r1, C332417Uy r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void bind(AnonymousClass1WV r4, Object obj) {
        C381649c6 r5 = (C381649c6) obj;
        r4.ADh(1, r5.A02);
        r4.ADa(2, r5.A01);
        r4.ADa(3, r5.A00);
    }
}

package X;

/* renamed from: X.3By  reason: invalid class name and case insensitive filesystem */
public final class C238463By extends 1Vg {
    public final /* synthetic */ C238313Bj A00;

    public final String createQuery() {
        return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C238463By(C251983oI r1, C238313Bj r2) {
        super(r1);
        this.A00 = r2;
    }
}

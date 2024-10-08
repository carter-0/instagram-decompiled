package X;

/* renamed from: X.3A7  reason: invalid class name */
public final class AnonymousClass3A7 extends 1Vf {
    public final /* synthetic */ AnonymousClass3A6 A00;

    public final String createQuery() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3A7(C251983oI r1, AnonymousClass3A6 r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void bind(AnonymousClass1WV r4, Object obj) {
        C255383u2 r5 = (C255383u2) obj;
        r4.ADh(1, r5.A02);
        r4.ADa(2, (long) r5.A00);
        r4.ADa(3, (long) r5.A01);
    }
}

package X;

/* renamed from: X.4zj  reason: invalid class name and case insensitive filesystem */
public final class C279944zj extends 1Vf {
    public final /* synthetic */ C279934zi A00;

    public final String createQuery() {
        return "INSERT OR REPLACE INTO `note_entities_data` (`entity_id`,`data`,`entity_index`,`entity_type`,`stored_time`) VALUES (?,?,?,?,?)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C279944zj(C251983oI r1, C279934zi r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void bind(AnonymousClass1WV r4, Object obj) {
        C381509bs r5 = (C381509bs) obj;
        r4.ADh(1, r5.A03);
        r4.ADU(2, r5.A04);
        r4.ADa(3, (long) r5.A00);
        r4.ADa(4, (long) r5.A01);
        r4.ADa(5, r5.A02);
    }
}

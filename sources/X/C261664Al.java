package X;

/* renamed from: X.4Al  reason: invalid class name and case insensitive filesystem */
public final class C261664Al extends 1Vf {
    public final /* synthetic */ AnonymousClass402 A00;

    public final String createQuery() {
        return "INSERT OR REPLACE INTO `examples` (`id`,`example_id`,`use_case`,`use_case_version`,`model_version`,`label`,`features`,`timestamp`,`label_timestamp`,`context`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C261664Al(C251983oI r1, AnonymousClass402 r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void bind(AnonymousClass1WV r4, Object obj) {
        AnonymousClass48E r5 = (AnonymousClass48E) obj;
        r4.ADa(1, (long) r5.A02);
        r4.ADh(2, r5.A06);
        r4.ADh(3, r5.A08);
        r4.ADh(4, r5.A09);
        r4.ADa(5, r5.A03);
        r4.ADa(6, r5.A00);
        r4.ADh(7, r5.A07);
        r4.ADa(8, r5.A04);
        r4.ADa(9, r5.A01);
        r4.ADh(10, r5.A05);
    }
}

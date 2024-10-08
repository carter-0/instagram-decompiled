package X;

/* renamed from: X.5wQ  reason: invalid class name and case insensitive filesystem */
public final class C300035wQ extends 1Vf {
    public final /* synthetic */ AnonymousClass92U A00;

    public final String createQuery() {
        return "INSERT OR IGNORE INTO `content_filter_dictionary_metadata` (`id`,`dictionary_key`,`name`,`language`,`editable`,`type`,`strategy_id`,`loadedVersion`,`latestVersion`,`supportsVersioning`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C300035wQ(C251983oI r1, AnonymousClass92U r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void bind(AnonymousClass1WV r4, Object obj) {
        C297125rE r5 = (C297125rE) obj;
        r4.ADa(1, r5.A02);
        r4.ADh(2, r5.A03);
        r4.ADh(3, r5.A07);
        r4.ADh(4, r5.A04);
        r4.ADa(5, r5.A08 ? 1 : 0);
        r4.ADa(6, (long) r5.A01);
        r4.ADa(7, (long) r5.A00);
        r4.ADh(8, r5.A06);
        r4.ADh(9, r5.A05);
        r4.ADa(10, r5.A09 ? 1 : 0);
    }
}

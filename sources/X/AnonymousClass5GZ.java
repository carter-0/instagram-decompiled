package X;

/* renamed from: X.5GZ  reason: invalid class name */
public final class AnonymousClass5GZ extends 1Vf {
    public final /* synthetic */ AnonymousClass5GY A00;

    public final String createQuery() {
        return "INSERT OR IGNORE INTO `newfeedstory` (`id`,`user_id`,`notification_type`,`timestamp`,`first_impression_timestamp`,`impression_count`,`priority_section_eligibility`,`major_app_version`,`data`) VALUES (?,?,?,?,?,?,?,?,?)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5GZ(C251983oI r1, AnonymousClass5GY r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void bind(AnonymousClass1WV r4, Object obj) {
        C283135Gg r5 = (C283135Gg) obj;
        r4.ADh(1, r5.A05);
        r4.ADh(2, r5.A06);
        r4.ADa(3, (long) r5.A02);
        r4.ADa(4, r5.A03);
        Long l = r5.A04;
        if (l == null) {
            r4.ADb(5);
        } else {
            r4.ADa(5, l.longValue());
        }
        r4.ADa(6, (long) r5.A00);
        r4.ADa(7, r5.A07 ? 1 : 0);
        r4.ADa(8, (long) r5.A01);
        r4.ADU(9, r5.A08);
    }
}

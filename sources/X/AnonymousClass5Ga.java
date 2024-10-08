package X;

/* renamed from: X.5Ga  reason: invalid class name */
public final class AnonymousClass5Ga extends 2NZ {
    public final /* synthetic */ AnonymousClass5GY A00;

    public final String createQuery() {
        return "UPDATE OR ABORT `newfeedstory` SET `id` = ?,`user_id` = ?,`notification_type` = ?,`timestamp` = ?,`first_impression_timestamp` = ?,`impression_count` = ?,`priority_section_eligibility` = ?,`major_app_version` = ?,`data` = ? WHERE `id` = ?";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5Ga(C251983oI r1, AnonymousClass5GY r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void A01(AnonymousClass1WV r5, Object obj) {
        C283135Gg r6 = (C283135Gg) obj;
        String str = r6.A05;
        r5.ADh(1, str);
        r5.ADh(2, r6.A06);
        r5.ADa(3, (long) r6.A02);
        r5.ADa(4, r6.A03);
        Long l = r6.A04;
        if (l == null) {
            r5.ADb(5);
        } else {
            r5.ADa(5, l.longValue());
        }
        r5.ADa(6, (long) r6.A00);
        r5.ADa(7, r6.A07 ? 1 : 0);
        r5.ADa(8, (long) r6.A01);
        r5.ADU(9, r6.A08);
        r5.ADh(10, str);
    }
}

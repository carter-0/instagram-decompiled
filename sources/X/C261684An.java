package X;

/* renamed from: X.4An  reason: invalid class name and case insensitive filesystem */
public final class C261684An extends 2NZ {
    public final /* synthetic */ AnonymousClass402 A00;

    public final String createQuery() {
        return "UPDATE OR REPLACE `examples` SET `id` = ?,`example_id` = ?,`use_case` = ?,`use_case_version` = ?,`model_version` = ?,`label` = ?,`features` = ?,`timestamp` = ?,`label_timestamp` = ?,`context` = ? WHERE `id` = ?";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C261684An(C251983oI r1, AnonymousClass402 r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void A01(AnonymousClass1WV r6, Object obj) {
        AnonymousClass48E r7 = (AnonymousClass48E) obj;
        long j = (long) r7.A02;
        r6.ADa(1, j);
        r6.ADh(2, r7.A06);
        r6.ADh(3, r7.A08);
        r6.ADh(4, r7.A09);
        r6.ADa(5, r7.A03);
        r6.ADa(6, r7.A00);
        r6.ADh(7, r7.A07);
        r6.ADa(8, r7.A04);
        r6.ADa(9, r7.A01);
        r6.ADh(10, r7.A05);
        r6.ADa(11, j);
    }
}

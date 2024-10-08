package X;

/* renamed from: X.5wU  reason: invalid class name and case insensitive filesystem */
public final class C300075wU extends 2NZ {
    public final /* synthetic */ AnonymousClass92U A00;

    public final String createQuery() {
        return "UPDATE OR IGNORE `content_filter_dictionary_metadata` SET `id` = ?,`dictionary_key` = ?,`name` = ?,`language` = ?,`editable` = ?,`type` = ?,`strategy_id` = ?,`loadedVersion` = ?,`latestVersion` = ?,`supportsVersioning` = ? WHERE `id` = ?";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C300075wU(C251983oI r1, AnonymousClass92U r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void A01(AnonymousClass1WV r6, Object obj) {
        C297125rE r7 = (C297125rE) obj;
        long j = r7.A02;
        r6.ADa(1, j);
        r6.ADh(2, r7.A03);
        r6.ADh(3, r7.A07);
        r6.ADh(4, r7.A04);
        r6.ADa(5, r7.A08 ? 1 : 0);
        r6.ADa(6, (long) r7.A01);
        r6.ADa(7, (long) r7.A00);
        r6.ADh(8, r7.A06);
        r6.ADh(9, r7.A05);
        r6.ADa(10, r7.A09 ? 1 : 0);
        r6.ADa(11, j);
    }
}

package X;

/* renamed from: X.3oe  reason: invalid class name and case insensitive filesystem */
public final class C252153oe extends 1Vf {
    public final /* synthetic */ C252143od A00;

    public final String createQuery() {
        return "INSERT OR REPLACE INTO `user_reel_medias` (`id`,`media_ids`,`data`,`stored_time`) VALUES (?,?,?,?)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C252153oe(C251983oI r1, C252143od r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void bind(AnonymousClass1WV r4, Object obj) {
        AnonymousClass46V r5 = (AnonymousClass46V) obj;
        r4.ADh(1, r5.A01);
        r4.ADh(2, r5.A02);
        r4.ADU(3, r5.A03);
        r4.ADa(4, r5.A00);
    }
}

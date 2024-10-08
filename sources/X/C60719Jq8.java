package X;

/* renamed from: X.Jq8  reason: case insensitive filesystem */
public final class C60719Jq8 extends 1Vf {
    public final /* synthetic */ AnonymousClass93J A00;

    public final String createQuery() {
        return "INSERT OR REPLACE INTO `medias` (`id`,`type`,`data`,`stored_time`,`ranking_score`) VALUES (?,?,?,?,?)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60719Jq8(C251983oI r1, AnonymousClass93J r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void bind(AnonymousClass1WV r4, Object obj) {
        C300575xR r5 = (C300575xR) obj;
        r4.ADh(1, r5.A02);
        r4.ADh(2, r5.A03);
        r4.ADU(3, r5.A04);
        r4.ADa(4, r5.A01);
        r4.ADY(5, (double) r5.A00);
    }
}

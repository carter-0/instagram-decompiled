package X;

/* renamed from: X.3of  reason: invalid class name and case insensitive filesystem */
public final class C252163of extends 1Vg {
    public final /* synthetic */ C252143od A00;

    public final String createQuery() {
        return "\n    DELETE FROM user_reel_medias\n    WHERE id NOT IN (\n      SELECT id\n      FROM user_reel_medias\n      WHERE stored_time > ?\n      ORDER BY stored_time DESC\n      LIMIT ?\n    )\n  ";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C252163of(C251983oI r1, C252143od r2) {
        super(r1);
        this.A00 = r2;
    }
}

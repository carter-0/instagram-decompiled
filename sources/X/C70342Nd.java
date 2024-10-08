package X;

/* renamed from: X.2Nd  reason: invalid class name and case insensitive filesystem */
public final class C70342Nd extends 1Vg {
    public final /* synthetic */ 2NU A00;

    public final String createQuery() {
        return "DELETE FROM drafts  WHERE has_published_clip = 1 AND last_save_time < ?";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70342Nd(C251983oI r1, 2NU r2) {
        super(r1);
        this.A00 = r2;
    }
}

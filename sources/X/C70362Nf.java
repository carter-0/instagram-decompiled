package X;

/* renamed from: X.2Nf  reason: invalid class name and case insensitive filesystem */
public final class C70362Nf extends 1Vg {
    public final /* synthetic */ 2NU A00;

    public final String createQuery() {
        return "UPDATE drafts SET has_published_clip = ? , was_last_save_user_initiated = 1 WHERE media_id = ?";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70362Nf(C251983oI r1, 2NU r2) {
        super(r1);
        this.A00 = r2;
    }
}

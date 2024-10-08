package X;

/* renamed from: X.JqC  reason: case insensitive filesystem */
public final class C60723JqC extends 1Vg {
    public final /* synthetic */ AnonymousClass2NS A00;

    public final String createQuery() {
        return "DELETE FROM clips_remix_original_media WHERE media_id IN (SELECT media_id FROM (SELECT media_id, last_used_time_ms FROM clips_remix_original_media ORDER BY last_used_time_ms) LIMIT MAX(((SELECT COUNT(*) FROM clips_remix_original_media) - ?), 0))";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60723JqC(C251983oI r1, AnonymousClass2NS r2) {
        super(r1);
        this.A00 = r2;
    }
}

package X;

/* renamed from: X.JqB  reason: case insensitive filesystem */
public final class C60722JqB extends 1Vg {
    public final /* synthetic */ AnonymousClass2NS A00;

    public final String createQuery() {
        return "UPDATE clips_remix_original_media SET last_used_time_ms = ? WHERE media_id = ?";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60722JqB(C251983oI r1, AnonymousClass2NS r2) {
        super(r1);
        this.A00 = r2;
    }
}

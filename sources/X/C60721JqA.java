package X;

/* renamed from: X.JqA  reason: case insensitive filesystem */
public final class C60721JqA extends 1Vg {
    public final /* synthetic */ AnonymousClass2NQ A00;

    public final String createQuery() {
        return "DELETE FROM audio_amplitudes WHERE audio_asset_id IN (SELECT audio_asset_id FROM (SELECT audio_asset_id, MAX(last_used_time_ms) AS last_used_time_ms FROM audio_amplitudes GROUP BY audio_asset_id ORDER BY last_used_time_ms) LIMIT (MAX(((SELECT COUNT(DISTINCT audio_asset_id) FROM audio_amplitudes) - ?), 0)))";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60721JqA(C251983oI r1, AnonymousClass2NQ r2) {
        super(r1);
        this.A00 = r2;
    }
}

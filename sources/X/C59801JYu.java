package X;

/* renamed from: X.JYu  reason: case insensitive filesystem */
public final class C59801JYu extends 1Vg {
    public final /* synthetic */ AnonymousClass2NR A00;

    public final String createQuery() {
        return "DELETE FROM audio_tracks WHERE audio_track_id IN (SELECT audio_track_id FROM (SELECT audio_track_id, MAX(last_used_time_ms) AS last_used_time_ms FROM audio_tracks GROUP BY audio_track_id ORDER BY last_used_time_ms) LIMIT (MAX(((SELECT COUNT(DISTINCT audio_track_id) FROM audio_tracks) - ?), 0)))";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59801JYu(C251983oI r1, AnonymousClass2NR r2) {
        super(r1);
        this.A00 = r2;
    }
}

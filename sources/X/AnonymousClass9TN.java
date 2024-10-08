package X;

/* renamed from: X.9TN  reason: invalid class name */
public final class AnonymousClass9TN extends 1Vf {
    public final /* synthetic */ AnonymousClass2NR A00;

    public final String createQuery() {
        return "INSERT OR REPLACE INTO `audio_tracks` (`audio_track_id`,`start_time_ms`,`duration_ms`,`file_path`,`last_used_time_ms`) VALUES (?,?,?,?,?)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9TN(C251983oI r1, AnonymousClass2NR r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void bind(AnonymousClass1WV r4, Object obj) {
        A79 a79 = (A79) obj;
        r4.ADh(1, a79.A03);
        r4.ADa(2, (long) a79.A01);
        r4.ADa(3, (long) a79.A00);
        r4.ADh(4, a79.A04);
        r4.ADa(5, a79.A02);
    }
}

package X;

/* renamed from: X.Jq6  reason: case insensitive filesystem */
public final class C60717Jq6 extends 1Vf {
    public final /* synthetic */ AnonymousClass2NQ A00;

    public final String createQuery() {
        return "INSERT OR REPLACE INTO `audio_amplitudes` (`audio_asset_id`,`audio_amplitudes_list`,`last_used_time_ms`) VALUES (?,?,?)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60717Jq6(C251983oI r1, AnonymousClass2NQ r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void bind(AnonymousClass1WV r4, Object obj) {
        L6P l6p = (L6P) obj;
        r4.ADh(1, l6p.A01);
        r4.ADh(2, DbT.A0z("␞", l6p.A02, (0sP) null));
        r4.ADa(3, l6p.A00);
    }
}

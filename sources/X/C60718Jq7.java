package X;

/* renamed from: X.Jq7  reason: case insensitive filesystem */
public final class C60718Jq7 extends 1Vf {
    public final /* synthetic */ AnonymousClass2NS A00;

    public final String createQuery() {
        return "INSERT OR REPLACE INTO `clips_remix_original_media` (`media_id`,`file_path`,`file_size`,`last_used_time_ms`) VALUES (?,?,?,?)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60718Jq7(C251983oI r1, AnonymousClass2NS r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void bind(AnonymousClass1WV r4, Object obj) {
        C60928Jtm jtm = (C60928Jtm) obj;
        r4.ADh(1, jtm.A03);
        r4.ADh(2, jtm.A02);
        r4.ADa(3, jtm.A00);
        r4.ADa(4, jtm.A01);
    }
}

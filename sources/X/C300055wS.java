package X;

/* renamed from: X.5wS  reason: invalid class name and case insensitive filesystem */
public final class C300055wS extends 1Vf {
    public final /* synthetic */ AnonymousClass92U A00;

    public final String createQuery() {
        return "INSERT OR IGNORE INTO `content_filter_dictionary_entries` (`dictionary_id`,`pattern`) VALUES (?,?)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C300055wS(C251983oI r1, AnonymousClass92U r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void bind(AnonymousClass1WV r4, Object obj) {
        C381619c3 r5 = (C381619c3) obj;
        r4.ADa(1, r5.A00);
        r4.ADh(2, r5.A01);
    }
}

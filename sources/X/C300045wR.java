package X;

/* renamed from: X.5wR  reason: invalid class name and case insensitive filesystem */
public final class C300045wR extends 1Vf {
    public final /* synthetic */ AnonymousClass92U A00;

    public final String createQuery() {
        return "INSERT OR IGNORE INTO `content_filter_dictionary_client_availability` (`dictionary_id`,`client_id`) VALUES (?,?)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C300045wR(C251983oI r1, AnonymousClass92U r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void bind(AnonymousClass1WV r4, Object obj) {
        C295555oT r5 = (C295555oT) obj;
        r4.ADa(1, r5.A01);
        r4.ADa(2, (long) r5.A00);
    }
}

package X;

/* renamed from: X.5wW  reason: invalid class name and case insensitive filesystem */
public final class C300095wW extends 1Vg {
    public final /* synthetic */ AnonymousClass92U A00;

    public final String createQuery() {
        return "\n        UPDATE content_filter_dictionary_metadata SET\n            loadedVersion = ?\n        WHERE dictionary_key = ?\n      ";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C300095wW(C251983oI r1, AnonymousClass92U r2) {
        super(r1);
        this.A00 = r2;
    }
}

package X;

/* renamed from: X.Twj  reason: case insensitive filesystem */
public final class C14461Twj implements X4Y {
    public final /* synthetic */ C14138TqY A00;

    public final Boolean CXV(String str) {
        0qQ.A0B(str, 0);
        C14200Trf trf = this.A00.A07;
        if (trf == null) {
            0qQ.A0F("dataSource");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass9P5 BiW = trf.A05.BiW(new C15050ULg(str, "fbsearch/keyword_typeahead/", 8));
        if (BiW.A06 != null) {
            return Boolean.valueOf(BiW.A0A);
        }
        return null;
    }

    public C14461Twj(C14138TqY tqY) {
        this.A00 = tqY;
    }
}

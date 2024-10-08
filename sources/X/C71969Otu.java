package X;

/* renamed from: X.Otu  reason: case insensitive filesystem */
public final class C71969Otu implements C232262tL {
    public final C66967Mg0 A00;
    public final String A01;

    public C71969Otu(C66967Mg0 mg0, String str) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = mg0;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C71969Otu otu = (C71969Otu) obj;
        0qQ.A0B(otu, 0);
        return 0qQ.A0K(this.A01, otu.A01);
    }
}

package X;

/* renamed from: X.Ou2  reason: case insensitive filesystem */
public final class C71977Ou2 implements C232262tL {
    public final C53380GnA A00;
    public final OAK A01;
    public final String A02;

    public C71977Ou2(C53380GnA gnA, OAK oak, String str) {
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A00 = gnA;
        this.A01 = oak;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C53380GnA gnA;
        C71977Ou2 ou2 = (C71977Ou2) obj;
        C53380GnA gnA2 = this.A00;
        if (ou2 != null) {
            gnA = ou2.A00;
        } else {
            gnA = null;
        }
        return 0qQ.A0K(gnA2, gnA);
    }
}

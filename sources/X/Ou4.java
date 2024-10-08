package X;

public final class Ou4 implements C232262tL {
    public final N3O A00;
    public final OGT A01;
    public final String A02;
    public final String A03;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        N3O n3o;
        Ou4 ou4 = (Ou4) obj;
        N3O n3o2 = this.A00;
        if (ou4 != null) {
            n3o = ou4.A00;
        } else {
            n3o = null;
        }
        return 0qQ.A0K(n3o2, n3o);
    }

    public Ou4(N3O n3o, OGT ogt, String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
        this.A00 = n3o;
        this.A01 = ogt;
    }
}

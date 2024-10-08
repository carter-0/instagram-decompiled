package X;

/* renamed from: X.L6l  reason: case insensitive filesystem */
public final class C63779L6l {
    public final C331157Pu A00;
    public final C63861L9q A01;
    public final K4V A02;

    public C63779L6l(C63861L9q l9q, K4V k4v) {
        C331127Pr A0W = DbS.A0W(l9q.A03);
        A0W.A0T = l9q.A01;
        int i = l9q.A00;
        if (i != 0) {
            DbS.A1S(A0W, true);
            A0W.A08 = i;
        }
        this.A00 = A0W.A00();
        this.A02 = k4v;
        k4v.A07.A00 = new C65409Lsp(l9q, this);
        k4v.A02 = new C65410Lsq(l9q);
        this.A01 = l9q;
    }
}

package X;

/* renamed from: X.IgA  reason: case insensitive filesystem */
public final class C57769IgA implements Runnable {
    public final /* synthetic */ H1B A00;

    public C57769IgA(H1B h1b) {
        this.A00 = h1b;
    }

    public final void run() {
        H1B h1b = this.A00;
        H17 h17 = h1b.A03;
        String str = "headerFragment";
        if (h17 != null) {
            AnonymousClass0eM r2 = h1b.A07;
            h17.A00(((C52999Ggq) r2.getValue()).A04);
            H17 h172 = h1b.A03;
            if (h172 != null) {
                h172.A00 = h1b;
                H1K h1k = h1b.A02;
                str = "gridFragment";
                if (h1k != null) {
                    h1k.A00(((C52999Ggq) r2.getValue()).A03);
                    H1K h1k2 = h1b.A02;
                    if (h1k2 != null) {
                        ((C52991Ggi) h1k2.A0D.getValue()).A00 = new C57038IMe(h1b);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}

package X;

/* renamed from: X.Oto  reason: case insensitive filesystem */
public final class C71963Oto implements C232262tL {
    public final N3G A00;

    public C71963Oto(N3G n3g) {
        0qQ.A0B(n3g, 1);
        this.A00 = n3g;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A03;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        N3G n3g;
        C71963Oto oto = (C71963Oto) obj;
        N3G n3g2 = this.A00;
        if (oto != null) {
            n3g = oto.A00;
        } else {
            n3g = null;
        }
        return 0qQ.A0K(n3g2, n3g);
    }
}

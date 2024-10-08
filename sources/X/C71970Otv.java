package X;

/* renamed from: X.Otv  reason: case insensitive filesystem */
public final class C71970Otv implements C232262tL {
    public final C53380GnA A00;
    public final String A01;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C53380GnA gnA;
        C71970Otv otv = (C71970Otv) obj;
        C53380GnA gnA2 = this.A00;
        if (otv != null) {
            gnA = otv.A00;
        } else {
            gnA = null;
        }
        return 0qQ.A0K(gnA2, gnA);
    }

    public C71970Otv(C53380GnA gnA, String str) {
        this.A01 = str;
        this.A00 = gnA;
    }
}

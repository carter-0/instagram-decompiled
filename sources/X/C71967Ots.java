package X;

/* renamed from: X.Ots  reason: case insensitive filesystem */
public final class C71967Ots implements C232262tL {
    public final C68151N2r A00;
    public final N4t A01;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01.A0B;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C71967Ots ots = (C71967Ots) obj;
        String str2 = this.A01.A0B;
        if (ots != null) {
            str = ots.A01.A0B;
        } else {
            str = null;
        }
        return 0qQ.A0K(str2, str);
    }

    public C71967Ots(C68151N2r n2r, N4t n4t) {
        this.A01 = n4t;
        this.A00 = n2r;
    }
}

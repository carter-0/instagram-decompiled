package X;

/* renamed from: X.Lhi  reason: case insensitive filesystem */
public final class C64766Lhi implements C232262tL {
    public final C61292K1d A00;

    public C64766Lhi(C61292K1d k1d) {
        0qQ.A0B(k1d, 1);
        this.A00 = k1d;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        String str = this.A00.A03;
        0qQ.A07(str);
        return str;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C64766Lhi lhi = (C64766Lhi) obj;
        0qQ.A0B(lhi, 0);
        String str = this.A00.A03;
        0qQ.A07(str);
        String str2 = lhi.A00.A03;
        0qQ.A07(str2);
        return str.equals(str2);
    }
}

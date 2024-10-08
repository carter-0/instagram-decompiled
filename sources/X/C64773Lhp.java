package X;

/* renamed from: X.Lhp  reason: case insensitive filesystem */
public final class C64773Lhp implements C232262tL {
    public final int A00;
    public final MSP A01;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A00);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C64773Lhp lhp = (C64773Lhp) obj;
        0qQ.A0B(lhp, 0);
        return AnonymousClass7TF.A1S(this.A00, lhp.A00);
    }

    public C64773Lhp(MSP msp, int i) {
        this.A00 = i;
        this.A01 = msp;
    }
}

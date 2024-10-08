package X;

/* renamed from: X.Qpn  reason: case insensitive filesystem */
public final class C8382Qpn extends C8384Qpp {
    public final SFC A00;
    public final C365498nD A01;
    public final AnonymousClass63P A02;

    public C8382Qpn(AnonymousClass63P r2, SFC sfc, C365498nD r4, int i) {
        super(i);
        this.A01 = r4;
        this.A00 = sfc;
        this.A02 = r2;
        if (i == 2 && sfc.A01) {
            throw AnonymousClass7TE.A0w("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }
}

package X;

/* renamed from: X.8Fw  reason: invalid class name and case insensitive filesystem */
public final class C352998Fw implements C353008Fx {
    public boolean A00 = false;
    public final /* synthetic */ C352888Fl A01;

    public C352998Fw(C352888Fl r2) {
        this.A01 = r2;
    }

    public final void Dpo() {
        C352888Fl r4 = this.A01;
        AnonymousClass80U r1 = r4.A1C;
        if (r1.CQ0(AnonymousClass80V.LAYOUT_CAPTURE) || r1.CQ0(AnonymousClass80V.LAYOUT_COMPLETE)) {
            r1.E3H(new Object());
        } else if (!this.A00 && r4.A0g.A0V(C358088aL.A0T, C358088aL.A0z)) {
            JYD A002 = C352888Fl.A00(r4);
            if (A002 != null) {
                A002.A0K(true);
            }
            this.A00 = true;
        }
    }
}

package X;

/* renamed from: X.9Sq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C379139Sq {
    public final /* synthetic */ AnonymousClass8LU A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ C379139Sq(AnonymousClass8LU r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void A00() {
        AnonymousClass8LU r2 = this.A00;
        boolean z = this.A01;
        if (r2.A0I && !r2.A0J) {
            r2.A0I = false;
            AnonymousClass8LU.A07(r2);
        } else if (z && r2.A0s.Atr() == AnonymousClass80V.MUSIC_OVERLAY_IN_STACKED_TIMELINE) {
            for (C3506985v r0 : r2.A11) {
                r0.Dxa();
                r0.DyQ();
            }
        }
    }
}

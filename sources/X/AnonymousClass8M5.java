package X;

/* renamed from: X.8M5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8M5 implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass8LU A00;

    public /* synthetic */ AnonymousClass8M5(AnonymousClass8LU r1) {
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        C378369Pn r0;
        AnonymousClass8LU r2 = this.A00;
        if (obj != C351968Bd.FIT && obj != C351968Bd.FILL) {
            r2.A0o.A06 = r2.A0r;
        } else if (r2.A06 != null) {
            r2.A0o.A0B(r2.A0r);
            if (r2.A09 == AnonymousClass8YU.PAUSED && (r0 = r2.A0B) != null) {
                r0.A02();
            }
        }
    }
}

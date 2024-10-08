package X;

/* renamed from: X.7ib  reason: invalid class name and case insensitive filesystem */
public final class C338827ib implements C342827pE {
    public final C2366634p A00;

    public final void D09() {
        this.A00.A01();
    }

    public final void onFirstFrameRendered() {
        this.A00.A05();
    }

    public final void onStart() {
        this.A00.A08((String) null);
    }

    public C338827ib(AnonymousClass9PE r2) {
        AnonymousClass9PL r0 = r2.A04;
        if (r0 == null) {
            0qQ.A0F("navigationPerfLogger");
            throw AnonymousClass00P.createAndThrow();
        } else {
            this.A00 = r0.A00;
        }
    }
}

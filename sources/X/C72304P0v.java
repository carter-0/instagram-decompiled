package X;

/* renamed from: X.P0v  reason: case insensitive filesystem */
public final class C72304P0v implements C74445Pv0 {
    public final /* synthetic */ C70967OTo A00;

    public C72304P0v(C70967OTo oTo) {
        this.A00 = oTo;
    }

    public final void DUT() {
        C70967OTo oTo = this.A00;
        PU8.A00(oTo.A00, (1a8) AnonymousClass7TE.A14(oTo.A07), oTo, 5);
    }

    public final void onFailure() {
        C70967OTo oTo = this.A00;
        PU8.A00(oTo.A00, (1a8) AnonymousClass7TE.A14(oTo.A07), oTo, 5);
    }

    public final void onSuccess() {
        C70967OTo oTo = this.A00;
        ((C72203OyT) oTo.A05.getValue()).A05(AnonymousClass05K.A00);
        C71099OcZ.A02(oTo.A01, AnonymousClass05K.A0C, false);
        DbW.A1L(oTo.A04.A00.AR4(), "EB_BLOCK_RELEASE_IMPRESSION");
    }
}

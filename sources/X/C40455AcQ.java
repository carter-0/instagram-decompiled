package X;

/* renamed from: X.AcQ  reason: case insensitive filesystem */
public final class C40455AcQ implements C74401PuH {
    public final /* synthetic */ C388809oQ A00;

    public C40455AcQ(C388809oQ r1) {
        this.A00 = r1;
    }

    public final void DoM(C392289uY r6) {
        C388809oQ r4 = this.A00;
        AnonymousClass7TE.A1Z(new MGY(r4, r6, (AnonymousClass4D7) null, 28), r4.A09);
        r6.A04(true);
        r6.A00 = new C40456AcR(r4);
    }

    public final void onFailure() {
        C388809oQ r3 = this.A00;
        r3.A01().setVisibility(8);
        r3.A03().setVisibility(0);
        r3.A02().setVisibility(8);
    }
}

package X;

public final class NMK extends EDI {
    public final /* synthetic */ 1P0 A00;
    public final /* synthetic */ C239123Fb A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NMK(1P0 r1, C239123Fb r2) {
        super(r1);
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onFailInBackground(C268654dm r7) {
        int A03 = AnonymousClass0fD.A03(-1845422639);
        C239123Fb r1 = this.A01;
        r1.A03 = AnonymousClass05K.A01;
        1OC A06 = r1.A06();
        A06.A00 = this.A00;
        1ES.A05(A06, 260155899, 4, true, false);
        AnonymousClass0fD.A0A(1194353474, A03);
    }
}

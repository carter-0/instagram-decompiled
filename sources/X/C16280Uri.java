package X;

/* renamed from: X.Uri  reason: case insensitive filesystem */
public final class C16280Uri extends C16700V2d implements C20885X2p {
    public final C18760Vzv A00;

    public final void onPaused() {
        C363058j1.A02.A01("IGPauseHandler", "onUserEvent SGMediaStreamPaused");
        C18760Vzv vzv = this.A00;
        vzv.A0B.A01.DUF(C15193UUw.A00);
        C18078Vl7 vl7 = vzv.A01;
        if (vl7 != null) {
            vl7.A0B.EkZ(true);
        }
    }

    public C16280Uri(C18760Vzv vzv) {
        this.A00 = vzv;
    }
}

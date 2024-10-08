package X;

/* renamed from: X.AXv  reason: case insensitive filesystem */
public final class C40256AXv implements C13753TgP {
    public final /* synthetic */ C41820B2a A00;

    public final void DXb(long j) {
    }

    public final void DXi(C390949s6 r2, C390949s6 r3) {
        0qQ.A0B(r3, 1);
        if (r3 == C390949s6.PLAYBACK_COMPLETE) {
            this.A00.onCompletion();
        }
        if (r3 == C390949s6.READY) {
            this.A00.DYy();
        }
        if (r3 == C390949s6.ERROR) {
            this.A00.DCZ();
        }
    }

    public C40256AXv(C41820B2a b2a) {
        this.A00 = b2a;
    }
}

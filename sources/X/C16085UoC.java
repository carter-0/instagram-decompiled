package X;

/* renamed from: X.UoC  reason: case insensitive filesystem */
public final class C16085UoC extends C65502LuQ {
    public final /* synthetic */ C234502xy A00;
    public final /* synthetic */ UER A01;
    public final /* synthetic */ U94 A02;
    public final /* synthetic */ C16181Uq6 A03;

    public C16085UoC(C234502xy r1, UER uer, U94 u94, C16181Uq6 uq6) {
        this.A00 = r1;
        this.A02 = u94;
        this.A01 = uer;
        this.A03 = uq6;
    }

    public final void onCurrentTrackPlayTimeUpdated(int i) {
        C234502xy r3 = this.A00;
        int A002 = C63348KvV.A00(r3.AzN(), 30000, this.A03.A0C);
        float min = ((float) (i - A002)) / ((float) Math.min(30000, r3.AzN() - A002));
        if (min >= 1.0f) {
            r3.EHu(false);
        } else {
            this.A01.A0C.setProgress(min);
        }
    }

    public final void onCurrentTrackPrepared(int i) {
        C16181Uq6 uq6 = this.A03;
        int A002 = C63348KvV.A00(i, 30000, uq6.A0C);
        C234502xy r0 = this.A00;
        r0.seekTo(A002);
        r0.E2p();
        U94 u94 = this.A02;
        U94.A00(uq6.A02, this.A01, u94);
    }

    public final void onCurrentTrackStopped() {
        this.A00.AHY();
        U94 u94 = this.A02;
        U94.A00(this.A03.A02, this.A01, u94);
    }
}

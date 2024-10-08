package X;

public final class IW8 implements C315536k3 {
    public final int A00;
    public final Object A01;

    public final void onCurrentTrackPrepared(int i) {
    }

    public IW8(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onCurrentTrackCompleted() {
        C313306gE r0;
        if (this.A00 != 0) {
            GI2 gi2 = (GI2) this.A01;
            C313306gE r02 = gi2.A03;
            if (r02 != null && r02.A08() && (r0 = gi2.A03) != null) {
                r0.A06(0);
                return;
            }
            return;
        }
        C52593GYs.A00((C52593GYs) this.A01);
    }

    public final void onCurrentTrackPlayTimeUpdated(int i) {
        C313306gE r0;
        C313306gE r02;
        if (this.A00 != 0) {
            GI2 gi2 = (GI2) this.A01;
            long j = gi2.A00;
            if (j != -1 && ((long) i) >= j && (r0 = gi2.A03) != null && r0.A08() && (r02 = gi2.A03) != null) {
                r02.A06(0);
                return;
            }
            return;
        }
        C52593GYs gYs = (C52593GYs) this.A01;
        int i2 = C52593GYs.A0A;
        int i3 = gYs.A01;
        if (i3 != -1 && i >= i3) {
            C52593GYs.A00(gYs);
        }
    }

    public final void onCurrentTrackPlaybackStarted() {
    }

    public final void onCurrentTrackSeekComplete() {
    }

    public final void onCurrentTrackStartedPlaying() {
    }

    public final void onCurrentTrackStopped() {
    }
}

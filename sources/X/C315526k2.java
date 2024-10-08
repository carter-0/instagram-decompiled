package X;

/* renamed from: X.6k2  reason: invalid class name and case insensitive filesystem */
public final class C315526k2 implements C315536k3 {
    public final /* synthetic */ C315506k0 A00;

    public final void onCurrentTrackPlayTimeUpdated(int i) {
    }

    public final void onCurrentTrackPlaybackStarted() {
    }

    public final void onCurrentTrackPrepared(int i) {
    }

    public final void onCurrentTrackSeekComplete() {
    }

    public final void onCurrentTrackStartedPlaying() {
    }

    public final void onCurrentTrackStopped() {
    }

    public C315526k2(C315506k0 r1) {
        this.A00 = r1;
    }

    public final void onCurrentTrackCompleted() {
        C234502xy r1 = this.A00.A08;
        r1.seekTo(0);
        r1.E2p();
    }
}

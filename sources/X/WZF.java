package X;

public final class WZF implements C315536k3 {
    public final C315536k3 A00;
    public final C17509VYn A01;
    public final C21044XAx A02;
    public final GVI A03;

    public final void onCurrentTrackCompleted() {
        C315536k3 r0 = this.A00;
        if (r0 != null) {
            r0.onCurrentTrackCompleted();
        }
        C234502xy r1 = this.A01.A01;
        r1.seekTo(0);
        r1.E2p();
    }

    public final void onCurrentTrackPlayTimeUpdated(int i) {
        C315536k3 r0 = this.A00;
        if (r0 != null) {
            r0.onCurrentTrackPlayTimeUpdated(i);
        }
    }

    public final void onCurrentTrackPlaybackStarted() {
        C315536k3 r0 = this.A00;
        if (r0 != null) {
            r0.onCurrentTrackPlaybackStarted();
        }
        this.A02.CiO();
        this.A01.A00 = AnonymousClass05K.A0Y;
        GVI gvi = this.A03;
        if (gvi != null) {
            gvi.A01();
        }
    }

    public final void onCurrentTrackPrepared(int i) {
        C315536k3 r0 = this.A00;
        if (r0 != null) {
            r0.onCurrentTrackPrepared(i);
        }
    }

    public final void onCurrentTrackSeekComplete() {
        C315536k3 r0 = this.A00;
        if (r0 != null) {
            r0.onCurrentTrackSeekComplete();
        }
    }

    public final void onCurrentTrackStartedPlaying() {
        C315536k3 r0 = this.A00;
        if (r0 != null) {
            r0.onCurrentTrackStartedPlaying();
        }
    }

    public final void onCurrentTrackStopped() {
        C315536k3 r0 = this.A00;
        if (r0 != null) {
            r0.onCurrentTrackStopped();
        }
        C17509VYn vYn = this.A01;
        Integer num = vYn.A00;
        Integer num2 = AnonymousClass05K.A0N;
        if (num != num2 && num != AnonymousClass05K.A00) {
            this.A02.CiH();
            vYn.A00 = num2;
            GVI gvi = this.A03;
            if (gvi != null) {
                gvi.A00();
            }
        }
    }

    public WZF(C315536k3 r2, C17509VYn vYn) {
        this.A01 = vYn;
        this.A00 = r2;
        this.A02 = vYn.A03;
        this.A03 = vYn.A02.A01;
    }
}

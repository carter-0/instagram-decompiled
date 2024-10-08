package X;

import java.util.List;

/* renamed from: X.M0r  reason: case insensitive filesystem */
public final class C65825M0r implements C232732uM {
    public final /* synthetic */ K6e A00;

    public final void onCompletion() {
    }

    public final void onCues(List list) {
    }

    public final void onDrawnToSurface() {
    }

    public final void onPrepare(C263754Nf r1) {
    }

    public final void onProgressStateChanged(boolean z) {
    }

    public final void onProgressUpdate(int i, int i2, boolean z) {
    }

    public final void onSurfaceTextureDestroyed() {
    }

    public final void onSurfaceTextureUpdated(C263754Nf r1) {
    }

    public final void onVideoDownloading(C263754Nf r1) {
    }

    public final void onVideoPlayerError(C263754Nf r1, String str) {
    }

    public final void onVideoPrepared(C263754Nf r1, boolean z) {
    }

    public final void onVideoSwitchToWarmupPlayer(C263754Nf r1) {
    }

    public final void onVideoViewPrepared(C263754Nf r1) {
    }

    public C65825M0r(K6e k6e) {
        this.A00 = k6e;
    }

    public final void onLoop(int i) {
        K6e k6e = this.A00;
        k6e.A00().Dxa();
        k6e.Exk();
    }

    public final void onSeeking(long j) {
        this.A00.A00().DyD((int) j);
    }

    public final void onStopVideo(String str, boolean z) {
        this.A00.A00().DnX();
    }

    public final void onStopped(C263754Nf r2, int i) {
        this.A00.A00().DyY();
    }

    public final void onVideoStartedPlaying(C263754Nf r2) {
        this.A00.A00().DyQ();
    }
}

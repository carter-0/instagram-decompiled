package X;

import java.util.List;

/* renamed from: X.2uM  reason: invalid class name and case insensitive filesystem */
public interface C232732uM {
    void onCompletion();

    void onCues(List list);

    void onDrawnToSurface();

    void onLoop(int i);

    void onPrepare(C263754Nf r1);

    void onProgressStateChanged(boolean z);

    void onProgressUpdate(int i, int i2, boolean z);

    void onSeeking(long j);

    void onStopVideo(String str, boolean z);

    void onStopped(C263754Nf r1, int i);

    void onSurfaceTextureDestroyed();

    void onSurfaceTextureUpdated(C263754Nf r1);

    void onVideoDownloading(C263754Nf r1);

    void onVideoPlayerError(C263754Nf r1, String str);

    void onVideoPrepared(C263754Nf r1, boolean z);

    void onVideoStartedPlaying(C263754Nf r1);

    void onVideoSwitchToWarmupPlayer(C263754Nf r1);

    void onVideoViewPrepared(C263754Nf r1);
}

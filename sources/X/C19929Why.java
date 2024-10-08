package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.facebook.cameracore.mediapipeline.services.video.implementation.VideoPlaybackItem;

/* renamed from: X.Why  reason: case insensitive filesystem */
public final class C19929Why implements Runnable {
    public final /* synthetic */ VideoPlaybackItem A00;

    public C19929Why(VideoPlaybackItem videoPlaybackItem) {
        this.A00 = videoPlaybackItem;
    }

    public final void run() {
        VideoPlaybackItem videoPlaybackItem = this.A00;
        if (videoPlaybackItem.mIsPrepared) {
            videoPlaybackItem.mIsPrepared = false;
            try {
                videoPlaybackItem.mMediaPlayer.stop();
            } catch (IllegalStateException unused) {
            }
        }
        videoPlaybackItem.mMediaPlayer.release();
        videoPlaybackItem.mAvailableFrames.set(0);
        Surface surface = videoPlaybackItem.mSurface;
        if (surface != null) {
            surface.release();
            videoPlaybackItem.mSurface = null;
        }
        SurfaceTexture surfaceTexture = videoPlaybackItem.mSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            videoPlaybackItem.mSurfaceTexture = null;
        }
        C346337v0 r0 = videoPlaybackItem.mTexture;
        if (r0 != null) {
            r0.A01();
            videoPlaybackItem.mTexture = null;
        }
    }
}

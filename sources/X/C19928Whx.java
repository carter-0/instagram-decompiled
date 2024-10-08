package X;

import com.facebook.cameracore.mediapipeline.services.video.implementation.VideoPlaybackItem;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.Whx  reason: case insensitive filesystem */
public final class C19928Whx implements Runnable {
    public final /* synthetic */ VideoPlaybackItem A00;

    public C19928Whx(VideoPlaybackItem videoPlaybackItem) {
        this.A00 = videoPlaybackItem;
    }

    public final void run() {
        try {
            VideoPlaybackItem videoPlaybackItem = this.A00;
            String str = videoPlaybackItem.mVideoUri;
            if (str.startsWith("/")) {
                videoPlaybackItem.mMediaPlayer.setDataSource(str);
            } else {
                HashMap hashMap = new HashMap();
                if (!videoPlaybackItem.mRedirectAllowed) {
                    hashMap.put("android-allow-cross-domain-redirect", "0");
                }
                videoPlaybackItem.mMediaPlayer.setDataSource(videoPlaybackItem.mContext, 0cp.A03(videoPlaybackItem.mVideoUri), hashMap);
            }
            videoPlaybackItem.mMediaPlayer.setOnPreparedListener(videoPlaybackItem);
            videoPlaybackItem.mMediaPlayer.setOnCompletionListener(videoPlaybackItem);
            videoPlaybackItem.mMediaPlayer.setVolume(0.0f, 0.0f);
            videoPlaybackItem.mMediaPlayer.prepareAsync();
        } catch (IOException | IllegalArgumentException | IllegalStateException | SecurityException unused) {
            this.A00.mHasError.set(true);
        }
    }
}

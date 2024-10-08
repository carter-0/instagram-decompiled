package com.facebook.cameracore.mediapipeline.services.video.implementation;

import X.C19928Whx;
import X.C19929Why;
import X.C346327uz;
import X.C346337v0;
import X.C346367v3;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.opengl.Matrix;
import android.view.Surface;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class VideoPlaybackItem implements SurfaceTexture.OnFrameAvailableListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {
    public final AtomicInteger mAvailableFrames;
    public final ExecutorService mBackgroundThread;
    public int mCompletedCount;
    public final Context mContext;
    public final AtomicBoolean mHasError;
    public boolean mIsLooping;
    public volatile boolean mIsPrepared;
    public int mLoopedCount;
    public final MediaPlayer mMediaPlayer;
    public final boolean mRedirectAllowed;
    public final float[] mSMatrix;
    public volatile boolean mStartRequested;
    public Surface mSurface;
    public SurfaceTexture mSurfaceTexture;
    public C346337v0 mTexture;
    public final VideoFrame mVideoFrame = new Object();
    public final String mVideoUri;

    public void pause() {
        this.mStartRequested = false;
        try {
            this.mMediaPlayer.pause();
        } catch (IllegalStateException unused) {
            this.mHasError.set(true);
        }
    }

    public void resume() {
        this.mStartRequested = true;
        if (this.mIsPrepared) {
            try {
                this.mMediaPlayer.start();
            } catch (IllegalStateException unused) {
                this.mHasError.set(true);
            }
        }
    }

    public int getCompletedCount() {
        return this.mCompletedCount;
    }

    public int getDuration() {
        return this.mMediaPlayer.getDuration();
    }

    public boolean getHasError() {
        return this.mHasError.getAndSet(false);
    }

    public boolean getIsPlaying() {
        return this.mMediaPlayer.isPlaying();
    }

    public int getLoopedCount() {
        return this.mLoopedCount;
    }

    public boolean getLooping() {
        return this.mIsLooping;
    }

    public int getPosition() {
        return this.mMediaPlayer.getCurrentPosition();
    }

    public VideoFrame getVideoFrameIfAvailable() {
        int i = 0;
        int andSet = this.mAvailableFrames.getAndSet(0);
        if (andSet <= 0 || this.mSurface == null || this.mTexture == null || this.mSurfaceTexture == null) {
            return null;
        }
        do {
            this.mSurfaceTexture.updateTexImage();
            i++;
        } while (i < andSet);
        this.mSurfaceTexture.getTransformMatrix(this.mSMatrix);
        VideoFrame videoFrame = this.mVideoFrame;
        C346337v0 r0 = this.mTexture;
        int i2 = r0.A00;
        int i3 = r0.A01;
        float[] fArr = this.mSMatrix;
        C346367v3 r02 = r0.A02;
        int i4 = r02.A01;
        int i5 = r02.A00;
        videoFrame.textureHandler = i2;
        videoFrame.textureTarget = i3;
        videoFrame.transformationMatrix = fArr;
        videoFrame.width = i4;
        videoFrame.height = i5;
        videoFrame.presentationTimestamp = (long) this.mMediaPlayer.getCurrentPosition();
        return this.mVideoFrame;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        if (this.mIsLooping) {
            this.mLoopedCount++;
            try {
                mediaPlayer.start();
            } catch (IllegalStateException unused) {
                this.mHasError.set(true);
            }
        } else {
            this.mCompletedCount++;
        }
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.mHasError.set(true);
        return false;
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.mAvailableFrames.incrementAndGet();
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        this.mMediaPlayer.setLooping(false);
        C346327uz r1 = new C346327uz("VideoPlaybackItem");
        r1.A03 = 36197;
        r1.A04 = this.mMediaPlayer.getVideoWidth();
        r1.A02 = this.mMediaPlayer.getVideoHeight();
        C346337v0 r0 = new C346337v0(r1);
        this.mTexture = r0;
        SurfaceTexture surfaceTexture = new SurfaceTexture(r0.A00);
        this.mSurfaceTexture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        Surface surface = new Surface(this.mSurfaceTexture);
        this.mSurface = surface;
        this.mMediaPlayer.setSurface(surface);
        this.mIsPrepared = true;
        if (this.mStartRequested) {
            try {
                this.mMediaPlayer.start();
            } catch (IllegalStateException unused) {
                this.mHasError.set(true);
            }
        }
    }

    public void prepare() {
        this.mBackgroundThread.execute(new C19928Whx(this));
    }

    public void seek(int i) {
        this.mMediaPlayer.seekTo((long) i, 3);
    }

    public void setLooping(boolean z) {
        this.mIsLooping = z;
    }

    public void setVolume(float f, float f2) {
        this.mMediaPlayer.setVolume(f, f2);
    }

    public void teardown() {
        if (!this.mBackgroundThread.isShutdown()) {
            this.mBackgroundThread.execute(new C19929Why(this));
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.cameracore.mediapipeline.services.video.implementation.VideoFrame, java.lang.Object] */
    public VideoPlaybackItem(Context context, String str, boolean z, ExecutorService executorService) {
        float[] fArr = new float[16];
        this.mSMatrix = fArr;
        this.mIsPrepared = false;
        this.mStartRequested = false;
        this.mLoopedCount = 0;
        this.mCompletedCount = 0;
        this.mContext = context;
        this.mVideoUri = str;
        this.mRedirectAllowed = z;
        this.mAvailableFrames = new AtomicInteger(0);
        this.mHasError = new AtomicBoolean(false);
        this.mBackgroundThread = executorService;
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.mMediaPlayer = mediaPlayer;
        mediaPlayer.setOnErrorListener(this);
        Matrix.setIdentityM(fArr, 0);
    }
}

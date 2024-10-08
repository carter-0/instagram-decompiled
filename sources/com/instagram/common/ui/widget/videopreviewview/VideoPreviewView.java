package com.instagram.common.ui.widget.videopreviewview;

import X.0KC;
import X.0wb;
import X.AnonymousClass0fD;
import X.AnonymousClass4M7;
import X.AnonymousClass4XA;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C59746JWh;
import X.C59916Jbf;
import X.C59919Jbi;
import X.C66529MVh;
import X.JXT;
import X.MQ2;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import com.instagram.common.gallery.Medium;
import java.io.IOException;

public class VideoPreviewView extends TextureView implements TextureView.SurfaceTextureListener, MediaPlayer.OnPreparedListener, MQ2 {
    public MediaPlayer A00;
    public Surface A01;
    public AnonymousClass4M7 A02;
    public C66529MVh A03;
    public JXT A04;
    public Runnable A05;
    public final Runnable A06;

    public VideoPreviewView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void A01() {
        int i;
        int i2;
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer == null || !A09()) {
            i = 0;
        } else {
            i = mediaPlayer.getVideoWidth();
        }
        MediaPlayer mediaPlayer2 = this.A00;
        if (mediaPlayer2 == null || !A09()) {
            i2 = 0;
        } else {
            i2 = mediaPlayer2.getVideoHeight();
        }
        AnonymousClass4XA.A01(this, getScaleType(), this, getMinFitAspectRatio(), getMaxFitAspectRatio(), 0.0f, i, i2);
    }

    public float getMaxFitAspectRatio() {
        return 1.0f;
    }

    public float getMinFitAspectRatio() {
        return 1.0f;
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    private void A00() {
        if (this.A00 != null) {
            A05();
        }
        this.A00 = new MediaPlayer();
        setMediaPlayerState(JXT.IDLE);
        this.A05 = new C59916Jbf(this);
        Surface surface = this.A01;
        if (surface != null) {
            this.A00.setSurface(surface);
        }
    }

    private void A02() {
        Runnable runnable = this.A05;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        if (this.A04 == JXT.STARTED || A08()) {
            try {
                this.A00.stop();
                setMediaPlayerState(JXT.STOPPED);
            } catch (IllegalStateException e) {
                A03(e);
            }
        }
    }

    private void setMediaPlayerState(JXT jxt) {
        this.A04 = jxt;
        C66529MVh mVh = this.A03;
        if (mVh != null) {
            mVh.Dmo(jxt);
        }
    }

    public final void A04() {
        Runnable runnable = this.A05;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        if (this.A04 == JXT.STARTED) {
            try {
                this.A00.pause();
                setMediaPlayerState(JXT.PAUSED);
            } catch (IllegalStateException e) {
                A03(e);
            }
        }
    }

    public final void A05() {
        if (this.A00 != null) {
            removeCallbacks(this.A05);
            this.A03 = null;
            this.A01 = null;
            this.A00.setOnPreparedListener((MediaPlayer.OnPreparedListener) null);
            A02();
            try {
                this.A00.release();
                setMediaPlayerState(JXT.RELEASED);
                this.A00 = null;
                setMediaPlayerState((JXT) null);
            } catch (IllegalStateException e) {
                A03(e);
            }
        }
    }

    public final void A07(int i) {
        if (this.A04 == JXT.STARTED || A08()) {
            this.A00.seekTo(i);
        }
    }

    public final boolean A08() {
        return AnonymousClass7TF.A1W(this.A04, JXT.PAUSED);
    }

    public final boolean A09() {
        JXT jxt = this.A04;
        if (jxt == JXT.PREPARED || jxt == JXT.STARTED || jxt == JXT.PAUSED || jxt == JXT.STOPPED) {
            return true;
        }
        return false;
    }

    public AnonymousClass4M7 getScaleType() {
        return this.A02;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        setMediaPlayerState(JXT.PREPARED);
        A01();
        if (this.A03 != null) {
            this.A03.DO5(this, this.A00.getVideoWidth(), this.A00.getVideoHeight());
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        this.A01 = surface;
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(surface);
        }
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        this.A01 = surface;
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(surface);
        }
    }

    public void setVideoAssetFileDescriptor(AssetFileDescriptor assetFileDescriptor, C66529MVh mVh) {
        String str;
        if (this.A00 == null) {
            A00();
        }
        JXT jxt = this.A04;
        JXT jxt2 = JXT.PREPARING;
        if (jxt != jxt2) {
            try {
                this.A03 = mVh;
                A02();
                this.A00.reset();
                if (getSurfaceTexture() != null) {
                    Surface surface = new Surface(getSurfaceTexture());
                    this.A01 = surface;
                    this.A00.setSurface(surface);
                }
                this.A00.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                setMediaPlayerState(JXT.INITIALIZED);
                this.A00.setLooping(true);
                this.A00.prepareAsync();
                setMediaPlayerState(jxt2);
                this.A00.setOnPreparedListener(this);
            } catch (IOException e) {
                0KC.A05(VideoPreviewView.class, "failed to load video", e);
                str = e.getMessage();
                mVh.DES(str);
            } catch (IllegalStateException e2) {
                A03(e2);
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("Illegal state: ");
                str = AnonymousClass7TF.A0i(this.A04, A1A);
                mVh.DES(str);
            }
        }
    }

    public void setVideoMedium(Medium medium, C66529MVh mVh) {
        setVideoPath(medium.A0X, mVh);
    }

    public void setVideoPath(String str, C66529MVh mVh) {
        String str2;
        if (this.A00 == null) {
            A00();
        }
        JXT jxt = this.A04;
        JXT jxt2 = JXT.PREPARING;
        if (jxt != jxt2) {
            try {
                this.A03 = mVh;
                A02();
                this.A00.reset();
                if (getSurfaceTexture() != null) {
                    Surface surface = new Surface(getSurfaceTexture());
                    this.A01 = surface;
                    this.A00.setSurface(surface);
                }
                this.A00.setDataSource(str);
                setMediaPlayerState(JXT.INITIALIZED);
                this.A00.setLooping(true);
                this.A00.prepareAsync();
                setMediaPlayerState(jxt2);
                this.A00.setOnPreparedListener(this);
            } catch (IOException e) {
                0KC.A05(VideoPreviewView.class, "failed to load video", e);
                str2 = e.getMessage();
                mVh.DES(str2);
            } catch (IllegalStateException e2) {
                A03(e2);
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("Illegal state: ");
                str2 = AnonymousClass7TF.A0i(this.A04, A1A);
                mVh.DES(str2);
            }
        }
    }

    public void setVolume(float f) {
        MediaPlayer mediaPlayer = this.A00;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f, f);
        }
    }

    private void A03(IllegalStateException illegalStateException) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("current state: ");
        String A0i = AnonymousClass7TF.A0i(this.A04, A1A);
        0KC.A05(VideoPreviewView.class, "VideoPreviewView_IllegalStateException", illegalStateException);
        0wb.A06("VideoPreviewView_IllegalStateException", A0i, illegalStateException);
    }

    public final void A06() {
        JXT jxt;
        if (A09() && this.A04 != (jxt = JXT.STARTED) && this.A03 != null) {
            this.A00.setOnInfoListener(new C59919Jbi(this));
            postDelayed(this.A05, 500);
            A01();
            try {
                this.A00.start();
                setMediaPlayerState(jxt);
            } catch (IllegalStateException e) {
                A03(e);
            }
        }
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(-1413965078);
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
        AnonymousClass0fD.A0D(583309646, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(749203486);
        super.onDetachedFromWindow();
        A05();
        AnonymousClass0fD.A0D(1492552835, A062);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A01();
    }

    public void setScaleType(AnonymousClass4M7 r1) {
        this.A02 = r1;
    }

    public VideoPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A06 = new C59746JWh(this);
        this.A02 = AnonymousClass4M7.FILL;
    }

    public VideoPreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}

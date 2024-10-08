package X;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLUtils;
import android.os.HandlerThread;
import android.view.Surface;
import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public final class SON {
    public int A00 = 1280;
    public int A01;
    public int A02 = 720;
    public MediaCodec.BufferInfo A03;
    public MediaCodec A04;
    public MediaMuxer A05;
    public QLz A06;
    public S52 A07;
    public boolean A08;
    public final HandlerThread A09 = Pxf.A0I("photo_video_transcode");

    public static final void A01(SON son, String str, int i, int i2) {
        Surface surface;
        int A052 = AnonymousClass7TE.A05((float) (i * i2 * 30 * 2), 0.07f);
        son.A03 = new MediaCodec.BufferInfo();
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", son.A02, son.A00);
        0qQ.A07(createVideoFormat);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger(TraceFieldType.Bitrate, A052);
        createVideoFormat.setInteger("frame-rate", 30);
        createVideoFormat.setInteger("i-frame-interval", 10);
        Class<SON> cls = SON.class;
        createVideoFormat.toString();
        try {
            son.A04 = 0fX.A02("video/avc", 1747943343);
        } catch (IOException e) {
            0KC.A05(cls, "createEncoderByType", e);
        }
        MediaCodec mediaCodec = son.A04;
        if (mediaCodec != null) {
            0fX.A07(mediaCodec, (MediaCrypto) null, createVideoFormat, (Surface) null, 1, 298673247);
        }
        MediaCodec mediaCodec2 = son.A04;
        if (mediaCodec2 != null) {
            surface = mediaCodec2.createInputSurface();
        } else {
            surface = null;
        }
        son.A06 = new QLz(surface);
        try {
            MediaMuxer mediaMuxer = new MediaMuxer(str, 0);
            son.A05 = mediaMuxer;
            mediaMuxer.setOrientationHint(0);
            son.A01 = -1;
            son.A08 = false;
        } catch (IOException e2) {
            throw Pxe.A0u("MediaMuxer creation failed", e2);
        }
    }

    public static final void A00(SON son) {
        Class<SON> cls = SON.class;
        MediaCodec mediaCodec = son.A04;
        if (mediaCodec != null) {
            try {
                0fX.A06(mediaCodec, -620962105);
                MediaCodec mediaCodec2 = son.A04;
                if (mediaCodec2 != null) {
                    0fX.A03(mediaCodec2, -11211751);
                }
            } catch (IllegalStateException e) {
                0KC.A05(cls, "encoder was not in the correct state", e);
            }
            son.A04 = null;
        }
        S52 s52 = son.A07;
        if (s52 != null) {
            s52.A00();
            son.A07 = null;
        }
        QLz qLz = son.A06;
        if (qLz != null) {
            qLz.release();
            son.A06 = null;
        }
        MediaMuxer mediaMuxer = son.A05;
        if (mediaMuxer != null) {
            mediaMuxer.stop();
            MediaMuxer mediaMuxer2 = son.A05;
            if (mediaMuxer2 != null) {
                mediaMuxer2.release();
            }
            son.A05 = null;
        }
    }

    public final void A02(Bitmap bitmap, String str, float f, int i, int i2) {
        AtomicReference atomicReference;
        HandlerThread handlerThread;
        ArrayList A14 = DbV.A14(bitmap);
        int i3 = i;
        this.A02 = i3;
        int i4 = i2;
        this.A00 = i4;
        try {
            A01(this, str, i3, i4);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            atomicReference = new AtomicReference();
            handlerThread = this.A09;
            handlerThread.start();
            Q6d q6d = new Q6d(this, countDownLatch, atomicReference);
            MediaCodec mediaCodec = this.A04;
            if (mediaCodec != null) {
                mediaCodec.setCallback(q6d, Pxf.A0H(handlerThread));
            }
            MediaCodec mediaCodec2 = this.A04;
            if (mediaCodec2 != null) {
                0fX.A05(mediaCodec2, -725204566);
            }
            QLz qLz = this.A06;
            if (qLz != null) {
                qLz.A00();
            }
            this.A07 = new S52(this.A02, this.A00);
            int size = A14.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                Bitmap bitmap2 = (Bitmap) A14.get(i6);
                if (!(bitmap2 == null || this.A07 == null)) {
                    GLUtils.texImage2D(3553, 0, bitmap2, 0);
                }
                int i7 = (int) (30.0f * f);
                for (int i8 = 0; i8 < i7; i8++) {
                    S52 s52 = this.A07;
                    if (s52 != null) {
                        s52.A01();
                    }
                    QLz qLz2 = this.A06;
                    if (qLz2 != null) {
                        EGLExt.eglPresentationTimeANDROID(qLz2.A01, qLz2.A02, (((long) (i5 + i8)) * 1000000000) / 30);
                    }
                    QLz qLz3 = this.A06;
                    if (qLz3 != null) {
                        EGL14.eglSwapBuffers(qLz3.A01, qLz3.A02);
                    }
                }
                i5 += i7;
            }
            MediaCodec mediaCodec3 = this.A04;
            if (mediaCodec3 != null) {
                mediaCodec3.signalEndOfInputStream();
            }
            countDownLatch.await();
        } catch (InterruptedException e) {
            atomicReference.set(e);
        } catch (Throwable th) {
            this.A09.quitSafely();
            A00(this);
            throw th;
        }
        if (atomicReference.get() == null) {
            handlerThread.quitSafely();
            A00(this);
            return;
        }
        throw C41845B3m.A0j((Throwable) atomicReference.get());
    }
}

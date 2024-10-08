package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public final class Q6d extends MediaCodec.Callback {
    public final /* synthetic */ SON A00;
    public final /* synthetic */ CountDownLatch A01;
    public final /* synthetic */ AtomicReference A02;

    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        0qQ.A0B(codecException, 1);
        this.A02.set(codecException);
        this.A01.countDown();
    }

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
    }

    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        RuntimeException runtimeException;
        0qQ.A0B(mediaFormat, 1);
        SON son = this.A00;
        AtomicReference atomicReference = this.A02;
        CountDownLatch countDownLatch = this.A01;
        if (atomicReference.get() == null) {
            try {
                if (!son.A08) {
                    mediaFormat.toString();
                    MediaMuxer mediaMuxer = son.A05;
                    if (mediaMuxer != null) {
                        son.A01 = mediaMuxer.addTrack(mediaFormat);
                        MediaMuxer mediaMuxer2 = son.A05;
                        if (mediaMuxer2 != null) {
                            mediaMuxer2.start();
                        }
                        son.A08 = true;
                        return;
                    }
                    runtimeException = AnonymousClass7TE.A15("StaticImageVideoHelper::startMuxer::trackIndex is null");
                } else {
                    runtimeException = AnonymousClass7TE.A15("format changed twice");
                }
                throw runtimeException;
            } catch (Exception e) {
                atomicReference.set(e);
                countDownLatch.countDown();
            }
        }
    }

    public Q6d(SON son, CountDownLatch countDownLatch, AtomicReference atomicReference) {
        this.A02 = atomicReference;
        this.A01 = countDownLatch;
        this.A00 = son;
    }

    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        RuntimeException runtimeException;
        DbY.A1S(mediaCodec, bufferInfo);
        CountDownLatch countDownLatch = this.A01;
        SON son = this.A00;
        AtomicReference atomicReference = this.A02;
        if (atomicReference.get() == null) {
            try {
                if ((bufferInfo.flags & 4) != 0) {
                    countDownLatch.countDown();
                    return;
                }
                ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i);
                if (outputBuffer != null) {
                    if ((bufferInfo.flags & 2) != 0) {
                        bufferInfo.size = 0;
                    }
                    if (bufferInfo.size != 0) {
                        if (son.A08) {
                            Pxg.A1D(bufferInfo, outputBuffer);
                            MediaMuxer mediaMuxer = son.A05;
                            if (mediaMuxer != null) {
                                mediaMuxer.writeSampleData(son.A01, outputBuffer, bufferInfo);
                            }
                        } else {
                            runtimeException = AnonymousClass7TE.A15("muxer hasn't started");
                        }
                    }
                    MediaCodec mediaCodec2 = son.A04;
                    if (mediaCodec2 != null) {
                        mediaCodec2.releaseOutputBuffer(i, false);
                        return;
                    }
                    return;
                }
                runtimeException = AnonymousClass7TE.A15(002.A0c("encoderOutputBuffer ", " was null", i));
                throw runtimeException;
            } catch (Exception e) {
                atomicReference.set(e);
                countDownLatch.countDown();
            }
        }
    }
}

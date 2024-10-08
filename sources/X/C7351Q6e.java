package X;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.concurrent.Semaphore;

/* renamed from: X.Q6e  reason: case insensitive filesystem */
public final class C7351Q6e extends MediaCodec.Callback {
    public final /* synthetic */ MediaExtractor A00;
    public final /* synthetic */ Handler A01;
    public final /* synthetic */ S3Z A02;
    public final /* synthetic */ C10821Ryh A03;
    public final /* synthetic */ Semaphore A04;

    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
    }

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        MediaCodec mediaCodec2 = mediaCodec;
        0qQ.A0B(mediaCodec, 0);
        int i2 = i;
        ByteBuffer inputBuffer = mediaCodec.getInputBuffer(i2);
        MediaExtractor mediaExtractor = this.A00;
        long sampleTime = mediaExtractor.getSampleTime();
        0qQ.A0A(inputBuffer);
        int readSampleData = mediaExtractor.readSampleData(inputBuffer, 0);
        boolean z = !mediaExtractor.advance();
        int i3 = 0;
        if (z) {
            i3 = 4;
        }
        if ((sampleTime >= 0 && readSampleData >= 0) || z) {
            mediaCodec2.queueInputBuffer(i2, 0, Math.max(0, readSampleData), Math.max(0, sampleTime), i3);
        }
    }

    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        DbY.A1S(mediaCodec, bufferInfo);
        Handler handler = this.A01;
        Semaphore semaphore = this.A04;
        handler.post(new C13072TKc(bufferInfo, mediaCodec, this.A02, this.A03, semaphore, i));
    }

    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
    }

    public C7351Q6e(MediaExtractor mediaExtractor, Handler handler, S3Z s3z, C10821Ryh ryh, Semaphore semaphore) {
        this.A00 = mediaExtractor;
        this.A01 = handler;
        this.A04 = semaphore;
        this.A03 = ryh;
        this.A02 = s3z;
    }
}

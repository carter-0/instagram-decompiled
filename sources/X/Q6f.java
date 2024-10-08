package X;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public final class Q6f extends MediaCodec.Callback {
    public boolean A00;
    public boolean A01;
    public final List A02 = AnonymousClass7TE.A1C();
    public final CompletableFuture A03 = new CompletableFuture();
    public final /* synthetic */ int A04;
    public final /* synthetic */ MediaExtractor A05;
    public final /* synthetic */ AnonymousClass930 A06;
    public final /* synthetic */ 0sP A07;
    public final /* synthetic */ 0sK A08;

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        0qQ.A0B(cryptoException, 1);
        this.A07.invoke(cryptoException);
    }

    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        0qQ.A0B(codecException, 1);
        this.A07.invoke(codecException);
    }

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        MediaCodec mediaCodec2 = mediaCodec;
        0qQ.A0B(mediaCodec, 0);
        if (this.A00 || this.A01) {
            0KC.A0D("DecoderUtil", "onInputBufferAvailable called after end of stream");
            return;
        }
        int i2 = i;
        ByteBuffer inputBuffer = mediaCodec.getInputBuffer(i);
        if (inputBuffer == null) {
            this.A07.invoke(AnonymousClass7TE.A0z("onInputBufferAvailable but input buffer is null"));
            return;
        }
        MediaExtractor mediaExtractor = this.A05;
        int readSampleData = mediaExtractor.readSampleData(inputBuffer, 0);
        mediaExtractor.advance();
        if (readSampleData < 0) {
            0sP r1 = this.A07;
            try {
                mediaCodec2.queueInputBuffer(i2, 0, 0, -1, 4);
            } catch (MediaCodec.CryptoException e) {
                r1.invoke(e);
            }
            this.A00 = true;
            return;
        }
        long sampleTime = mediaExtractor.getSampleTime();
        boolean A1S = AnonymousClass7TF.A1S(mediaExtractor.getSampleFlags() & 1, 1);
        0sP r12 = this.A07;
        try {
            mediaCodec2.queueInputBuffer(i2, 0, readSampleData, sampleTime, A1S ? 1 : 0);
        } catch (MediaCodec.CryptoException e2) {
            r12.invoke(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0034, code lost:
        if ((r10.flags & 4) == 4) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onOutputBufferAvailable(android.media.MediaCodec r8, int r9, android.media.MediaCodec.BufferInfo r10) {
        /*
            r7 = this;
            r4 = 0
            X.AnonymousClass7TF.A1B(r8, r4, r10)
            java.nio.ByteBuffer r2 = r8.getOutputBuffer(r9)
            if (r2 != 0) goto L_0x0017
            X.0sP r1 = r7.A07
            java.lang.String r0 = "onOutputBufferAvailable called but output buffer is null"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            r1.invoke(r0)
        L_0x0016:
            return
        L_0x0017:
            int r1 = r2.remaining()
            byte[] r0 = new byte[r1]
            r2.get(r0, r4, r1)
            java.util.List r5 = r7.A02
            java.util.List r0 = X.03t.A0E(r0)
            r5.addAll(r0)
            boolean r0 = r7.A01
            r3 = 1
            if (r0 != 0) goto L_0x0036
            int r0 = r10.flags
            r2 = 4
            r1 = r0 & 4
            r0 = 0
            if (r1 != r2) goto L_0x0037
        L_0x0036:
            r0 = 1
        L_0x0037:
            r7.A01 = r0
            r8.releaseOutputBuffer(r9, r4)
            boolean r0 = r7.A01
            if (r0 == 0) goto L_0x0016
            android.media.MediaFormat r1 = r8.getOutputFormat()
            X.0qQ.A07(r1)
            java.lang.String r0 = "channel-count"
            int r0 = r1.getInteger(r0)
            byte r4 = (byte) r0
            java.lang.String r0 = "sample-rate"
            int r6 = r1.getInteger(r0)
            r0 = -2142492646(0xffffffff804c281a, float:-6.993883E-39)
            X.0fX.A06(r8, r0)
            r0 = 1472386786(0x57c2d6e2, float:4.28456341E14)
            X.0fX.A03(r8, r0)
            android.media.MediaExtractor r0 = r7.A05
            r0.release()
            java.util.concurrent.CompletableFuture r1 = r7.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.complete(r0)
            X.930 r0 = r7.A06
            if (r0 == 0) goto L_0x007f
            int r3 = r7.A04
            X.02m r2 = r0.A00
            java.lang.String r1 = "AUDIO_DECODE_END"
            r0 = 331815788(0x13c71b6c, float:5.0261703E-27)
            r2.markerPoint(r0, r3, r1)
        L_0x007f:
            X.0sK r3 = r7.A08
            byte[] r2 = X.00k.A0v(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.Byte r0 = java.lang.Byte.valueOf(r4)
            r3.invoke(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q6f.onOutputBufferAvailable(android.media.MediaCodec, int, android.media.MediaCodec$BufferInfo):void");
    }

    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        0qQ.A0B(mediaFormat, 1);
    }

    public Q6f(MediaExtractor mediaExtractor, AnonymousClass930 r3, 0sP r4, 0sK r5, int i) {
        this.A07 = r4;
        this.A05 = mediaExtractor;
        this.A06 = r3;
        this.A04 = i;
        this.A08 = r5;
    }
}

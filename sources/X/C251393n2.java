package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: X.3n2  reason: invalid class name and case insensitive filesystem */
public final class C251393n2 implements C251403n3 {
    public final MediaCodec A00;

    public final void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i, Object obj) {
        0fX.A07(this.A00, mediaCrypto, mediaFormat, surface, 0, 1269523713);
    }

    public final /* synthetic */ void enableSR(boolean z) {
    }

    public final int getTotalSampleCount() {
        return 0;
    }

    public final boolean needsReconfiguration() {
        return false;
    }

    public final void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.A00.queueInputBuffer(i, 0, i3, j, i4);
    }

    public final void queueSecureInputBuffer(int i, int i2, AnonymousClass4PT r10, long j, int i3) {
        this.A00.queueSecureInputBuffer(i, 0, r10.A04, j, 0);
    }

    public final void releaseOutputBuffer(int i, boolean z) {
        this.A00.releaseOutputBuffer(i, false);
    }

    public final int dequeueInputBufferIndex() {
        return this.A00.dequeueInputBuffer(0);
    }

    public final int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.A00.dequeueOutputBuffer(bufferInfo, 0);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    public final void flush() {
        this.A00.flush();
    }

    public final ByteBuffer getInputBuffer(int i) {
        return this.A00.getInputBuffer(i);
    }

    public final ByteBuffer getOutputBuffer(int i) {
        return this.A00.getOutputBuffer(i);
    }

    public final MediaFormat getOutputFormat() {
        return this.A00.getOutputFormat();
    }

    public final Pair getPerFrameTotalDecodeTimeAndCount() {
        return new Pair(0L, 0);
    }

    public final void release() {
        0fX.A03(this.A00, 595096936);
    }

    public final void reset() {
        0fX.A04(this.A00, 323169602);
    }

    public final void setOnFrameRenderedListener(C296395pz r3, Handler handler) {
        this.A00.setOnFrameRenderedListener(new C18852W5z(r3, this), handler);
    }

    public final void setOutputSurface(Surface surface) {
        this.A00.setOutputSurface(surface);
    }

    public final void setParameters(Bundle bundle) {
        this.A00.setParameters(bundle);
    }

    public final void setVideoScalingMode(int i) {
        this.A00.setVideoScalingMode(i);
    }

    public final void start() {
        0fX.A05(this.A00, -2037038968);
    }

    public final void stop() {
        0fX.A06(this.A00, 198638055);
    }

    public C251393n2(MediaCodec mediaCodec) {
        this.A00 = mediaCodec;
    }

    public final /* synthetic */ boolean isSREnabled(int i) {
        return false;
    }

    public final void releaseOutputBuffer(int i, long j) {
        this.A00.releaseOutputBuffer(i, j);
    }
}

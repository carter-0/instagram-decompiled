package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: X.5fF  reason: invalid class name and case insensitive filesystem */
public final class C290395fF implements C251403n3 {
    public C251403n3 A00;
    public C284775Nw A01;
    public String A02;

    public final void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i, Object obj) {
        this.A00.configure(mediaFormat, surface, mediaCrypto, 0, obj);
    }

    public final void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.A00.queueInputBuffer(i, 0, i3, j, i4);
    }

    public final void queueSecureInputBuffer(int i, int i2, AnonymousClass4PT r10, long j, int i3) {
        this.A00.queueSecureInputBuffer(i, 0, r10, j, 0);
    }

    public final void releaseOutputBuffer(int i, boolean z) {
        this.A00.releaseOutputBuffer(i, false);
    }

    public final int dequeueInputBufferIndex() {
        return this.A00.dequeueInputBufferIndex();
    }

    public final int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        return this.A00.dequeueOutputBufferIndex(bufferInfo);
    }

    public final void enableSR(boolean z) {
        this.A00.enableSR(z);
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
        return this.A00.getPerFrameTotalDecodeTimeAndCount();
    }

    public final int getTotalSampleCount() {
        return this.A00.getTotalSampleCount();
    }

    public final boolean isSREnabled(int i) {
        return this.A00.isSREnabled(i);
    }

    public final boolean needsReconfiguration() {
        return this.A00.needsReconfiguration();
    }

    public final void release() {
        C284775Nw r0 = this.A01;
        C251403n3 r4 = this.A00;
        String str = this.A02;
        2SC r1 = 2SC.A05;
        boolean z = r0.A03;
        r1.A02(r0.A00.A00, r0.A01, r4, AnonymousClass05K.A01, str, z);
    }

    public final void reset() {
        this.A00.reset();
    }

    public final void setOnFrameRenderedListener(C296395pz r2, Handler handler) {
        this.A00.setOnFrameRenderedListener(r2, handler);
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
        this.A00.start();
    }

    public final void stop() {
        this.A00.stop();
    }

    public final void releaseOutputBuffer(int i, long j) {
        this.A00.releaseOutputBuffer(i, j);
    }
}

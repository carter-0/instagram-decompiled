package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: X.3n3  reason: invalid class name and case insensitive filesystem */
public interface C251403n3 {
    void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i, Object obj);

    int dequeueInputBufferIndex();

    int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo);

    void enableSR(boolean z);

    void flush();

    ByteBuffer getInputBuffer(int i);

    ByteBuffer getOutputBuffer(int i);

    MediaFormat getOutputFormat();

    Pair getPerFrameTotalDecodeTimeAndCount();

    int getTotalSampleCount();

    boolean isSREnabled(int i);

    boolean needsReconfiguration();

    void queueInputBuffer(int i, int i2, int i3, long j, int i4);

    void queueSecureInputBuffer(int i, int i2, AnonymousClass4PT r3, long j, int i3);

    void release();

    void releaseOutputBuffer(int i, long j);

    void releaseOutputBuffer(int i, boolean z);

    @Deprecated
    void reset();

    void setOnFrameRenderedListener(C296395pz r1, Handler handler);

    void setOutputSurface(Surface surface);

    void setParameters(Bundle bundle);

    void setVideoScalingMode(int i);

    void start();

    @Deprecated
    void stop();
}

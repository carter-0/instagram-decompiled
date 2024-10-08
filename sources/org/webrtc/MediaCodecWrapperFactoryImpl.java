package org.webrtc;

import X.0fX;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

public class MediaCodecWrapperFactoryImpl implements MediaCodecWrapperFactory {

    public class MediaCodecWrapperImpl implements MediaCodecWrapper {
        public final MediaCodec mediaCodec;

        public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
            0fX.A07(this.mediaCodec, mediaCrypto, mediaFormat, surface, i, 31953614);
        }

        public Surface createInputSurface() {
            return this.mediaCodec.createInputSurface();
        }

        public int dequeueInputBuffer(long j) {
            return this.mediaCodec.dequeueInputBuffer(j);
        }

        public int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j) {
            return this.mediaCodec.dequeueOutputBuffer(bufferInfo, j);
        }

        public void flush() {
            this.mediaCodec.flush();
        }

        public ByteBuffer[] getInputBuffers() {
            return this.mediaCodec.getInputBuffers();
        }

        public ByteBuffer getOutputBuffer(int i) {
            return this.mediaCodec.getOutputBuffer(i);
        }

        public ByteBuffer[] getOutputBuffers() {
            return this.mediaCodec.getOutputBuffers();
        }

        public MediaFormat getOutputFormat() {
            return this.mediaCodec.getOutputFormat();
        }

        public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
            this.mediaCodec.queueInputBuffer(i, i2, i3, j, i4);
        }

        public void release() {
            0fX.A03(this.mediaCodec, 1436123095);
        }

        public void releaseOutputBuffer(int i, boolean z) {
            this.mediaCodec.releaseOutputBuffer(i, z);
        }

        public void setCallback(MediaCodec.Callback callback) {
            this.mediaCodec.setCallback(callback);
        }

        public void setParameters(Bundle bundle) {
            this.mediaCodec.setParameters(bundle);
        }

        public void start() {
            0fX.A05(this.mediaCodec, 726400945);
        }

        public void stop() {
            0fX.A06(this.mediaCodec, 1162563311);
        }

        public MediaCodecWrapperImpl(MediaCodec mediaCodec2) {
            this.mediaCodec = mediaCodec2;
        }
    }

    public MediaCodecWrapper createByCodecName(String str) {
        return new MediaCodecWrapperImpl(0fX.A00(str, -1476007402));
    }
}

package org.webrtc;

import android.graphics.Matrix;
import java.nio.ByteBuffer;

public class VideoFrame implements RefCounted {
    public final Buffer buffer;
    public final int rotation;
    public final long timestampNs;

    public interface Buffer extends RefCounted {

        /* renamed from: org.webrtc.VideoFrame$Buffer$-CC  reason: invalid class name */
        public abstract /* synthetic */ class CC {
            public static int $default$getBufferType(Buffer buffer) {
                return 0;
            }
        }

        Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6);

        int getBufferType();

        int getHeight();

        int getWidth();

        void release();

        void retain();

        I420Buffer toI420();
    }

    public interface I420Buffer extends Buffer {

        /* renamed from: org.webrtc.VideoFrame$I420Buffer$-CC  reason: invalid class name */
        public abstract /* synthetic */ class CC {
            public static int $default$getBufferType(I420Buffer i420Buffer) {
                return 1;
            }
        }

        int getBufferType();

        ByteBuffer getDataU();

        ByteBuffer getDataV();

        ByteBuffer getDataY();

        int getStrideU();

        int getStrideV();

        int getStrideY();
    }

    public interface TextureBuffer extends Buffer {

        public enum Type {
            OES(36197),
            RGB(3553);
            
            public final int glTarget;

            public int getGlTarget() {
                return this.glTarget;
            }

            /* access modifiers changed from: public */
            Type(int i) {
                this.glTarget = i;
            }
        }

        int getTextureId();

        Matrix getTransformMatrix();

        Type getType();
    }

    public Buffer getBuffer() {
        return this.buffer;
    }

    public int getRotatedHeight() {
        int i = this.rotation % 180;
        Buffer buffer2 = this.buffer;
        if (i == 0) {
            return buffer2.getHeight();
        }
        return buffer2.getWidth();
    }

    public int getRotatedWidth() {
        int i = this.rotation % 180;
        Buffer buffer2 = this.buffer;
        if (i == 0) {
            return buffer2.getWidth();
        }
        return buffer2.getHeight();
    }

    public int getRotation() {
        return this.rotation;
    }

    public long getTimestampNs() {
        return this.timestampNs;
    }

    public void release() {
        this.buffer.release();
    }

    public void retain() {
        this.buffer.retain();
    }

    public VideoFrame(Buffer buffer2, int i, long j) {
        if (buffer2 == null) {
            throw new IllegalArgumentException("buffer not allowed to be null");
        } else if (i % 90 == 0) {
            this.buffer = buffer2;
            this.rotation = i;
            this.timestampNs = j;
        } else {
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
    }
}

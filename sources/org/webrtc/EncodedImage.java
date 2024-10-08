package org.webrtc;

import X.DbW;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

public class EncodedImage implements RefCounted {
    public final ByteBuffer buffer;
    public final long captureTimeMs;
    public final long captureTimeNs;
    public final boolean completeFrame;
    public final int encodedHeight;
    public final int encodedWidth;
    public final FrameType frameType;
    public final Integer qp;
    public final RefCountDelegate refCountDelegate;
    public final int rotation;

    public class Builder {
        public ByteBuffer buffer;
        public long captureTimeNs;
        public int encodedHeight;
        public int encodedWidth;
        public FrameType frameType;
        public Integer qp;
        public Runnable releaseCallback;
        public int rotation;

        public Builder setCompleteFrame(boolean z) {
            return this;
        }

        public EncodedImage createEncodedImage() {
            return new EncodedImage(this.buffer, this.releaseCallback, this.encodedWidth, this.encodedHeight, this.captureTimeNs, this.frameType, this.rotation, this.qp);
        }

        @Deprecated
        public Builder setBuffer(ByteBuffer byteBuffer) {
            this.buffer = byteBuffer;
            this.releaseCallback = null;
            return this;
        }

        @Deprecated
        public Builder setCaptureTimeMs(long j) {
            this.captureTimeNs = TimeUnit.MILLISECONDS.toNanos(j);
            return this;
        }

        public Builder setCaptureTimeNs(long j) {
            this.captureTimeNs = j;
            return this;
        }

        public Builder setEncodedHeight(int i) {
            this.encodedHeight = i;
            return this;
        }

        public Builder setEncodedWidth(int i) {
            this.encodedWidth = i;
            return this;
        }

        public Builder setFrameType(FrameType frameType2) {
            this.frameType = frameType2;
            return this;
        }

        public Builder setQp(Integer num) {
            this.qp = num;
            return this;
        }

        public Builder setRotation(int i) {
            this.rotation = i;
            return this;
        }

        public /* synthetic */ Builder(AnonymousClass1 r1) {
        }

        public Builder() {
        }

        public Builder setBuffer(ByteBuffer byteBuffer, Runnable runnable) {
            this.buffer = byteBuffer;
            this.releaseCallback = runnable;
            return this;
        }
    }

    public enum FrameType {
        EmptyFrame(0),
        VideoFrameKey(3),
        VideoFrameDelta(4);
        
        public final int nativeIndex;

        public int getNative() {
            return this.nativeIndex;
        }

        /* access modifiers changed from: public */
        FrameType(int i) {
            this.nativeIndex = i;
        }

        public static FrameType fromNativeIndex(int i) {
            for (FrameType frameType : values()) {
                if (frameType.getNative() == i) {
                    return frameType;
                }
            }
            throw DbW.A0a("Unknown native frame type: ", i);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [org.webrtc.EncodedImage$Builder, java.lang.Object] */
    public static Builder builder() {
        return new Object();
    }

    private ByteBuffer getBuffer() {
        return this.buffer;
    }

    private long getCaptureTimeNs() {
        return this.captureTimeNs;
    }

    private int getEncodedHeight() {
        return this.encodedHeight;
    }

    private int getEncodedWidth() {
        return this.encodedWidth;
    }

    private int getFrameType() {
        return this.frameType.getNative();
    }

    private Integer getQp() {
        return this.qp;
    }

    private int getRotation() {
        return this.rotation;
    }

    public void release() {
        this.refCountDelegate.release();
    }

    public void retain() {
        this.refCountDelegate.retain();
    }

    public EncodedImage(ByteBuffer byteBuffer, Runnable runnable, int i, int i2, long j, FrameType frameType2, int i3, Integer num) {
        this.buffer = byteBuffer;
        this.encodedWidth = i;
        this.encodedHeight = i2;
        this.captureTimeMs = TimeUnit.NANOSECONDS.toMillis(j);
        this.captureTimeNs = j;
        this.frameType = frameType2;
        this.rotation = i3;
        this.completeFrame = true;
        this.qp = num;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }
}

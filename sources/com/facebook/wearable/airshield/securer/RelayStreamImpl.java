package com.facebook.wearable.airshield.securer;

import X.0dV;
import X.0qQ;
import X.0sL;
import X.AnonymousClass7TG;
import X.C69330NjV;
import X.C69742NrR;
import X.C74229PrI;
import X.W0C;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

public final class RelayStreamImpl implements C74229PrI {
    public static final C69742NrR Companion = new Object();
    public final HybridData mHybridData;

    /* renamed from: native  reason: not valid java name */
    public final long f5native;
    public 0sL onReceived;

    private final native boolean flushWithErrorNative(int i);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(RelayStreamImpl relayStreamImpl, long j);

    private final native int sendCommandNative(int i);

    private final native int sendSpanNative(ByteBuffer byteBuffer, int i, int i2);

    private final native int streamIdNative();

    public boolean flush(W0C w0c) {
        0qQ.A0B(w0c, 0);
        return flushWithErrorNative(w0c.A00);
    }

    public int send(ByteBuffer byteBuffer) {
        0qQ.A0B(byteBuffer, 0);
        byteBuffer.put(0, streamHeader(byteBuffer.get(0)));
        return sendSpanNative(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    public int sendCommand(C69330NjV njV) {
        0qQ.A0B(njV, 0);
        return sendCommandNative(njV.A00);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.NrR, java.lang.Object] */
    static {
        0dV.A0C("airshield_light_mbed_jni");
    }

    private final void handleReceived(boolean z, ByteBuffer byteBuffer) {
        0sL r1 = this.onReceived;
        if (r1 != null) {
            r1.invoke(Boolean.valueOf(z), byteBuffer);
        }
    }

    private final byte streamHeader(byte b) {
        return (byte) (((byte) (b & -64)) | ((byte) streamIdNative()));
    }

    public 0sL getOnReceived() {
        return this.onReceived;
    }

    public RelayStreamImpl(long j) {
        this.f5native = j;
        this.mHybridData = initHybrid(this, j);
    }

    public int getStreamId() {
        return streamIdNative();
    }

    public void sendFromPeer(C74229PrI prI, ByteBuffer byteBuffer) {
        AnonymousClass7TG.A1N(prI, byteBuffer);
        if (!prI.equals(this)) {
            send(byteBuffer);
        }
    }

    public void setOnReceived(0sL r1) {
        this.onReceived = r1;
    }
}

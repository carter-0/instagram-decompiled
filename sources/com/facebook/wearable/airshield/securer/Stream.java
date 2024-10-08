package com.facebook.wearable.airshield.securer;

import X.0dV;
import X.0qQ;
import X.0sP;
import X.C69346Njl;
import X.C69743NrS;
import X.C69744NrT;
import X.W0C;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.util.UUID;

public final class Stream {
    public static final C69743NrS Companion = new Object();
    public final HybridData mHybridData;

    /* renamed from: native  reason: not valid java name */
    public final long f6native;
    public 0sP onReceived;

    private final native boolean flushWithErrorNative(int i);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(Stream stream, long j);

    private final native byte[] rxUUIDNative();

    private final native int sendNative(ByteBuffer byteBuffer, int i, int i2);

    private final native int streamIdNative();

    private final native byte[] txUUIDNative();

    public final boolean flush(W0C w0c) {
        0qQ.A0B(w0c, 0);
        return flushWithErrorNative(w0c.A00);
    }

    public final C69346Njl send(ByteBuffer byteBuffer) {
        0qQ.A0B(byteBuffer, 0);
        return C69744NrT.A00(sendNative(byteBuffer, byteBuffer.position(), byteBuffer.remaining()));
    }

    public final UUID toUUID(byte[] bArr) {
        0qQ.A0B(bArr, 0);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        return new UUID(wrap.getLong(), wrap.getLong());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.NrS, java.lang.Object] */
    static {
        0dV.A0C("airshield_light_mbed_jni");
    }

    private final void handleReceived(ByteBuffer byteBuffer) {
        0sP r0 = this.onReceived;
        if (r0 != null) {
            r0.invoke(byteBuffer);
        }
    }

    public final 0sP getOnReceived() {
        return this.onReceived;
    }

    public Stream(long j) {
        this.f6native = j;
        this.mHybridData = initHybrid(this, j);
    }

    public final UUID getRxUUID() {
        return toUUID(rxUUIDNative());
    }

    public final int getStreamId() {
        return streamIdNative();
    }

    public final UUID getTxUUID() {
        return toUUID(txUUIDNative());
    }

    public final void setOnReceived(0sP r1) {
        this.onReceived = r1;
    }
}

package com.facebook.wearable.airshield.securer;

import X.0dV;
import X.0qQ;
import X.0sL;
import X.0sP;
import X.AnonymousClass7TE;
import X.C69346Njl;
import X.C69742NrR;
import X.C69744NrT;
import X.C69745NrU;
import X.C74229PrI;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

public final class StreamSecurerImpl {
    public static final C69745NrU Companion = new Object();
    public final HybridData mHybridData = initHybrid(this);
    public 0sP onPreambleReady;
    public 0sP onSend;
    public 0sL onStreamReady;

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(StreamSecurerImpl streamSecurerImpl);

    private final native long openRelayedStreamNative();

    private final native int receiveDataNative(ByteBuffer byteBuffer, int i, int i2);

    private final native boolean relayEnabledNative();

    private final native void startNative();

    private final native void stopNative();

    public C69346Njl receiveData(ByteBuffer byteBuffer) {
        0qQ.A0B(byteBuffer, 0);
        int position = byteBuffer.position();
        int remaining = byteBuffer.remaining();
        byteBuffer.position(byteBuffer.limit());
        return C69744NrT.A00(receiveDataNative(byteBuffer, position, remaining));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.NrU, java.lang.Object] */
    static {
        0dV.A0C("airshield_light_mbed_jni");
    }

    private final void handlePreambleReady(Preamble preamble) {
        0sP r0 = this.onPreambleReady;
        if (r0 != null) {
            r0.invoke(preamble);
            return;
        }
        throw AnonymousClass7TE.A0z("onPreambleReady callback is not set");
    }

    private final int handleSend(ByteBuffer byteBuffer) {
        0sP r0 = this.onSend;
        if (r0 != null) {
            return AnonymousClass7TE.A0M(r0.invoke(byteBuffer));
        }
        throw AnonymousClass7TE.A0z("onSend callback is not set");
    }

    private final void handleStreamReady(long j, byte[] bArr) {
        Stream stream = new Stream(j);
        0sL r0 = this.onStreamReady;
        if (r0 != null) {
            r0.invoke(stream, bArr);
            return;
        }
        throw AnonymousClass7TE.A0z("onStreamReady callback is not set");
    }

    public 0sP getOnPreambleReady() {
        return this.onPreambleReady;
    }

    public 0sP getOnSend() {
        return this.onSend;
    }

    public 0sL getOnStreamReady() {
        return this.onStreamReady;
    }

    public boolean isRelayEnabled() {
        return relayEnabledNative();
    }

    public C74229PrI openRelayStream() {
        if (!relayEnabledNative()) {
            return null;
        }
        C69742NrR nrR = RelayStreamImpl.Companion;
        return new RelayStreamImpl(openRelayedStreamNative());
    }

    public void start() {
        startNative();
    }

    public void stop() {
        stopNative();
    }

    public void setOnPreambleReady(0sP r1) {
        this.onPreambleReady = r1;
    }

    public void setOnSend(0sP r1) {
        this.onSend = r1;
    }

    public void setOnStreamReady(0sL r1) {
        this.onStreamReady = r1;
    }
}

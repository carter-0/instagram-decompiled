package com.facebook.wearable.airshield.stream;

import X.0dV;
import X.AnonymousClass7TG;
import X.C13988Tno;
import X.C16565UxI;
import X.C16797V6e;
import X.C273654mx;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Framing {
    public static final C16797V6e Companion = new Object();
    public final HybridData mHybridData;

    private final native int cipherPayloadSizeNative(ByteBuffer byteBuffer, int i, int i2);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    private final native int lastErrorNative();

    /* access modifiers changed from: private */
    public final native int outerFrameSizeNative(int i);

    private final native int packNative(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4);

    private final native int unpackNative(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4);

    public final C16565UxI pack(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ByteBuffer byteBuffer3 = byteBuffer;
        ByteBuffer byteBuffer4 = byteBuffer2;
        AnonymousClass7TG.A1N(byteBuffer, byteBuffer2);
        int outerFrameSizeNative = outerFrameSizeNative(byteBuffer.remaining());
        if (byteBuffer2.remaining() < outerFrameSizeNative) {
            return C16565UxI.BUFFER_TOO_SMALL;
        }
        int packNative = packNative(byteBuffer3, byteBuffer.position(), byteBuffer.remaining(), byteBuffer4, byteBuffer2.position(), byteBuffer2.remaining());
        if (packNative == -1) {
            int lastErrorNative = lastErrorNative();
            for (C16565UxI uxI : C16565UxI.values()) {
                if (uxI.A00 == lastErrorNative) {
                    return uxI;
                }
            }
            throw new NoSuchElementException(C273654mx.A00(5));
        }
        C13988Tno.A1S(byteBuffer, packNative);
        C13988Tno.A1S(byteBuffer2, outerFrameSizeNative);
        return C16565UxI.SUCCESS;
    }

    public final C16565UxI unpack(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ByteBuffer byteBuffer3 = byteBuffer;
        ByteBuffer byteBuffer4 = byteBuffer2;
        AnonymousClass7TG.A1N(byteBuffer, byteBuffer2);
        if (byteBuffer2.remaining() < cipherPayloadSizeNative(byteBuffer, byteBuffer.position(), byteBuffer.remaining())) {
            return C16565UxI.BUFFER_TOO_SMALL;
        }
        int unpackNative = unpackNative(byteBuffer3, byteBuffer.position(), byteBuffer.remaining(), byteBuffer4, byteBuffer2.position(), byteBuffer2.remaining());
        if (unpackNative == -1) {
            int lastErrorNative = lastErrorNative();
            for (C16565UxI uxI : C16565UxI.values()) {
                if (uxI.A00 == lastErrorNative) {
                    return uxI;
                }
            }
            throw new NoSuchElementException(C273654mx.A00(5));
        }
        byteBuffer.position(byteBuffer.position() + outerFrameSizeNative(unpackNative));
        C13988Tno.A1S(byteBuffer2, unpackNative);
        return C16565UxI.SUCCESS;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.V6e, java.lang.Object] */
    static {
        0dV.A0C("airshield_light_mbed_jni");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Framing(HybridData hybridData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : hybridData);
    }

    public Framing(HybridData hybridData) {
        this.mHybridData = hybridData == null ? initHybrid() : hybridData;
    }
}

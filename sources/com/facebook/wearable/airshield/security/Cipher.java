package com.facebook.wearable.airshield.security;

import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C8868RDk;
import X.C9614Rds;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Cipher {
    public static final C9614Rds Companion = new Object();
    public final HybridData mHybridData;
    public final C8868RDk operation;

    public /* synthetic */ Cipher(C8868RDk rDk, DefaultConstructorMarker defaultConstructorMarker) {
        this(rDk);
    }

    private final native long getHandleNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    /* access modifiers changed from: private */
    public final native void setup(long j, boolean z, long j2);

    private final native int size();

    private final native boolean update(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3);

    public final boolean update(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ByteBuffer byteBuffer3 = byteBuffer;
        ByteBuffer byteBuffer4 = byteBuffer2;
        AnonymousClass7TG.A1N(byteBuffer, byteBuffer2);
        if (!byteBuffer.isDirect() || !byteBuffer2.isDirect()) {
            throw AnonymousClass7TE.A0w("Byte buffer must be direct!");
        }
        return update(byteBuffer3, byteBuffer.position(), byteBuffer.remaining(), byteBuffer4, byteBuffer2.position());
    }

    public final C8868RDk getOperation() {
        return this.operation;
    }

    public Cipher(C8868RDk rDk) {
        this.operation = rDk;
        this.mHybridData = initHybrid();
    }

    public final long getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed() {
        return getHandleNative();
    }

    public final int getSize() {
        return size();
    }
}

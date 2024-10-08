package com.facebook.cameracore.mediapipeline.services.messagechannel.implementation;

import X.0qQ;
import X.A8o;
import X.C41793B0y;
import X.C41811B1q;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

public final class ServiceMessageDataSourceHybrid implements C41811B1q {
    public final A8o dataSource;
    public final HybridData mHybridData = initHybrid();

    public ServiceMessageDataSourceHybrid(A8o a8o) {
        0qQ.A0B(a8o, 1);
        this.dataSource = a8o;
    }

    private final native HybridData initHybrid();

    public native void didReceiveMessageFromPlatform(int i, ByteBuffer byteBuffer, int i2);

    public native void setConfiguration(int i, ByteBuffer byteBuffer, int i2);

    /* JADX WARNING: type inference failed for: r1v0, types: [X.ACv, java.lang.Object] */
    public final void didReceiveFromXplat(int i, byte[] bArr) {
        A8o a8o = this.dataSource;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        ? obj = new Object();
        obj.A00 = i;
        obj.A01 = wrap;
        C41793B0y b0y = a8o.A02;
        if (b0y != null) {
            b0y.AP7(obj);
        }
    }
}

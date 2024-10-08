package com.facebook.wamsys.wcp;

import X.0dV;
import com.facebook.simplejni.NativeHolder;
import com.facebook.wamsys.wcc.TransferStats;

public class MultiwayNotificationResult {
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(String str, long j, String str2, long j2, TransferStats transferStats, byte[] bArr);

    private native boolean nativeEquals(Object obj);

    public native byte[] getData();

    public native TransferStats getIncomingStats();

    public native long getMultiwayNotificationBinaryVersion();

    public native String getMultiwayNotificationTransactionId();

    public native String getServerNotificationId();

    public native long getServerNotificationTimestamp();

    public native int hashCode();

    public native String toString();

    static {
        0dV.A0C("wamsysjni");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MultiwayNotificationResult)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public MultiwayNotificationResult(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}

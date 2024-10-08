package com.mcrypto;

import X.0dV;
import com.facebook.simplejni.NativeHolder;

public class MessengerEncryptedMessagingMCFBridgejniDispatcher {
    public static native String MEMDecryptedPayloadContextGetMessageIdNative(NativeHolder nativeHolder);

    public static native String MEMDecryptedPayloadContextGetMessageTraceIdNative(NativeHolder nativeHolder);

    public static native long MEMDecryptedPayloadContextGetOfflineQueueMessageIndexNative(NativeHolder nativeHolder);

    public static native Number MEMDecryptedPayloadContextGetPayloadVersionNative(NativeHolder nativeHolder);

    public static native NativeHolder MEMDecryptedPayloadContextGetSenderJIDNative(NativeHolder nativeHolder);

    public static native NativeHolder MEMDecryptedPayloadContextGetThreadIDNative(NativeHolder nativeHolder);

    public static native int MEMDecryptedPayloadContextGetThreadModeNative(NativeHolder nativeHolder);

    public static native int MEMDecryptedPayloadContextGetThreadTypeNative(NativeHolder nativeHolder);

    public static native int MEMDecryptedPayloadContextGetThreadTypeTagNative(NativeHolder nativeHolder);

    public static native long MEMDecryptedPayloadContextGetTimestampInSecNative(NativeHolder nativeHolder);

    static {
        0dV.A0C("MessengerEncryptedMessagingMCFBridgejni");
    }
}

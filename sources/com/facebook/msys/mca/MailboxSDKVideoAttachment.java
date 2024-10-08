package com.facebook.msys.mca;

import X.C66595MYh;
import com.facebook.simplejni.NativeHolder;

public class MailboxSDKVideoAttachment {
    public final NativeHolder mNativeHolder;

    private native boolean equalsNative(long j, Object obj, long j2);

    private native Number getDurationMsNative(long j);

    private native Number getHeightNative(long j);

    private native String getPlayableUrlNative(long j);

    private native MailboxSDKAttachmentPreview getPreviewNative(long j);

    private native String getVideoMimeTypeNative(long j);

    private native MailboxSDKVideoSource getVideoSourceNative(long j);

    private native Number getWidthNative(long j);

    private native int hashCodeNative(long j);

    public static native NativeHolder initNativeHolder(String str, Number number, Number number2, Number number3, String str2, MailboxSDKVideoSource mailboxSDKVideoSource, MailboxSDKAttachmentPreview mailboxSDKAttachmentPreview);

    private native String toStringNative(long j);

    public boolean equals(Object obj) {
        Object obj2 = obj;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MailboxSDKVideoAttachment)) {
            return false;
        }
        return equalsNative(this.mNativeHolder.mNativePointer, obj2, ((MailboxSDKVideoAttachment) obj2).mNativeHolder.mNativePointer);
    }

    public int hashCode() {
        return hashCodeNative(this.mNativeHolder.mNativePointer);
    }

    public String toString() {
        return toStringNative(this.mNativeHolder.mNativePointer);
    }

    static {
        C66595MYh.A00();
    }

    public MailboxSDKVideoAttachment(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}

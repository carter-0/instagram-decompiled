package com.facebook.msys.mca;

import X.C66595MYh;
import com.facebook.simplejni.NativeHolder;

public class MailboxSDKAttachmentPreview {
    public final NativeHolder mNativeHolder;

    private native boolean equalsNative(long j, Object obj, long j2);

    private native Number getPreviewHeightNative(long j);

    private native String getPreviewImagePathNative(long j);

    private native String getPreviewMimeTypeNative(long j);

    private native Number getPreviewWidthNative(long j);

    private native int hashCodeNative(long j);

    public static native NativeHolder initNativeHolder(String str, String str2, Number number, Number number2);

    private native String toStringNative(long j);

    public boolean equals(Object obj) {
        Object obj2 = obj;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MailboxSDKAttachmentPreview)) {
            return false;
        }
        return equalsNative(this.mNativeHolder.mNativePointer, obj2, ((MailboxSDKAttachmentPreview) obj2).mNativeHolder.mNativePointer);
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

    public MailboxSDKAttachmentPreview(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}

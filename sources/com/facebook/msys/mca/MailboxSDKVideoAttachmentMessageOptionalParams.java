package com.facebook.msys.mca;

import X.C66595MYh;
import com.facebook.msys.mci.VideoEdits;
import com.facebook.simplejni.NativeHolder;

public class MailboxSDKVideoAttachmentMessageOptionalParams {
    public final NativeHolder mNativeHolder;

    private native boolean equalsNative(long j, Object obj, long j2);

    private native Number getSenderFbIdNative(long j);

    private native String getTextNative(long j);

    private native VideoEdits getVideoEditsNative(long j);

    private native int hashCodeNative(long j);

    public static native NativeHolder initNativeHolder(String str, VideoEdits videoEdits, Number number);

    private native String toStringNative(long j);

    public boolean equals(Object obj) {
        Object obj2 = obj;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MailboxSDKVideoAttachmentMessageOptionalParams)) {
            return false;
        }
        return equalsNative(this.mNativeHolder.mNativePointer, obj2, ((MailboxSDKVideoAttachmentMessageOptionalParams) obj2).mNativeHolder.mNativePointer);
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

    public MailboxSDKVideoAttachmentMessageOptionalParams(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}

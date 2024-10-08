package com.instagram.direct.msys.reverb;

import X.OSF;
import com.facebook.simplejni.NativeHolder;

public class ReverbMessage {
    public NativeHolder mNativeHolder;

    private native boolean nativeEquals(Object obj);

    public native byte[] getFrankingTagForSupplementalKey(String str);

    public native String getMessageId();

    public native String getMessageIdForSupplementalKey(String str);

    public native byte[] getPayloadForSupplementalKey(String str);

    public native byte[] getReportingTagForSupplementalKey(String str);

    public native String getSenderId();

    public native String getSenderIdForSupplementalKey(String str);

    public native Object getSupplementalKeys();

    public native int getThreadTypeTag();

    public native long getTimestampInMs();

    public native long getTimestampInMsForSupplementalKey(String str);

    public native byte[] getToplevelEvent();

    public native byte[] getToplevelPayload();

    public native long getToplevelPayloadVersion();

    public native int hashCode();

    public native boolean isFromEBServer();

    public native String toString();

    public native boolean wasDeleted();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ReverbMessage)) {
            return false;
        }
        return nativeEquals(obj);
    }

    static {
        OSF.A00();
    }

    public ReverbMessage(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}

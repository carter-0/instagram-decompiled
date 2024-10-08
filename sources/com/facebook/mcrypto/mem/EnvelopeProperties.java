package com.facebook.mcrypto.mem;

import X.0dV;
import com.facebook.simplejni.NativeHolder;

public class EnvelopeProperties {
    public static final EnvelopeProperties $redex_init_class = null;
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(Boolean bool, Boolean bool2, Number number, Number number2, Number number3, Number number4, Number number5);

    private native boolean nativeEquals(Object obj);

    public native Number getContentType();

    public native Number getEnvelopeType();

    public native Number getMessageTestConfigType();

    public native Boolean getShouldHideDecryptionErrorPlaceholder();

    public native Boolean getShouldSkipExtraFanout();

    public native Number getThreadMode();

    public native Number getThreadTypeTag();

    public native int hashCode();

    public native String toString();

    static {
        0dV.A0C("mcryptojni");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof EnvelopeProperties)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public EnvelopeProperties(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public EnvelopeProperties(Boolean bool, Boolean bool2, Number number, Number number2, Number number3, Number number4, Number number5) {
        this.mNativeHolder = initNativeHolder(bool, bool2, number, number2, number3, number4, number5);
    }
}

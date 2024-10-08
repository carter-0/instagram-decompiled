package com.facebook.mcrypto.mem;

import X.0dV;
import com.facebook.simplejni.NativeHolder;

public class OutgoingMessage {
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(PlaintextApplicationPayload plaintextApplicationPayload, EnvelopeProperties envelopeProperties);

    private native boolean nativeEquals(Object obj);

    public native EnvelopeProperties getEnvelopeProperties();

    public native PlaintextApplicationPayload getPlaintextApplicationPayload();

    public native int hashCode();

    public native String toString();

    static {
        0dV.A0C("mcryptojni");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof OutgoingMessage)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public OutgoingMessage(PlaintextApplicationPayload plaintextApplicationPayload, EnvelopeProperties envelopeProperties) {
        plaintextApplicationPayload.getClass();
        this.mNativeHolder = initNativeHolder(plaintextApplicationPayload, envelopeProperties);
    }

    public OutgoingMessage(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}

package com.facebook.rsys.ended.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C22180Xwq;
import X.C66582MXn;
import com.facebook.djinni.msys.infra.McfReference;

public class UnsupportedCapabilityFallbacks {
    public static 2LV CONVERTER = C22180Xwq.A00(44);
    public static long sMcfTypeId;
    public final ErrorMessageFallback errorMessage;

    public static native UnsupportedCapabilityFallbacks createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnsupportedCapabilityFallbacks)) {
            return false;
        }
        return this.errorMessage.equals(((UnsupportedCapabilityFallbacks) obj).errorMessage);
    }

    public int hashCode() {
        return 527 + this.errorMessage.hashCode();
    }

    public UnsupportedCapabilityFallbacks(ErrorMessageFallback errorMessageFallback) {
        errorMessageFallback.getClass();
        this.errorMessage = errorMessageFallback;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("UnsupportedCapabilityFallbacks{errorMessage=");
        return C66582MXn.A0v(this.errorMessage, A1A);
    }
}

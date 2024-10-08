package com.facebook.rsys.callmanager.gen;

import X.002;
import X.2LV;
import X.C22180Xwq;
import com.facebook.djinni.msys.infra.McfReference;

public class CallManagerConfig {
    public static 2LV CONVERTER = C22180Xwq.A00(24);
    public static long sMcfTypeId;
    public final boolean allowMultipleActiveCalls;

    public class Builder {
        public boolean allowMultipleActiveCalls;

        public CallManagerConfig build() {
            return new CallManagerConfig(this);
        }
    }

    public CallManagerConfig() {
        this.allowMultipleActiveCalls = false;
    }

    public static native CallManagerConfig createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CallManagerConfig) && this.allowMultipleActiveCalls == ((CallManagerConfig) obj).allowMultipleActiveCalls;
        }
        return true;
    }

    public int hashCode() {
        return true + (this.allowMultipleActiveCalls ? 1 : 0);
    }

    public String toString() {
        return 002.A1B("CallManagerConfig{allowMultipleActiveCalls=", "}", this.allowMultipleActiveCalls);
    }

    public CallManagerConfig(Builder builder) {
        this.allowMultipleActiveCalls = builder.allowMultipleActiveCalls;
    }
}

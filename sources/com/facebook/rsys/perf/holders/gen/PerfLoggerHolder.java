package com.facebook.rsys.perf.holders.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C22181Xwr;
import X.C66582MXn;
import com.facebook.djinni.msys.infra.McfReference;

public class PerfLoggerHolder {
    public static 2LV CONVERTER = C22181Xwr.A00(27);
    public static long sMcfTypeId;
    public final McfReference perfLogger;

    public static native PerfLoggerHolder createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PerfLoggerHolder)) {
            return false;
        }
        return this.perfLogger.equals(((PerfLoggerHolder) obj).perfLogger);
    }

    public int hashCode() {
        return 527 + this.perfLogger.hashCode();
    }

    public PerfLoggerHolder(McfReference mcfReference) {
        mcfReference.getClass();
        this.perfLogger = mcfReference;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PerfLoggerHolder{perfLogger=");
        return C66582MXn.A0v(this.perfLogger, A1A);
    }
}

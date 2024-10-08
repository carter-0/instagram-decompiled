package com.facebook.rsys.call.gen;

import X.AnonymousClass7TE;
import X.C66582MXn;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

public class CallStartContext {
    public final Map contexts;

    public static native CallStartContext createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallStartContext)) {
            return false;
        }
        return this.contexts.equals(((CallStartContext) obj).contexts);
    }

    public final int hashCode() {
        return 527 + this.contexts.hashCode();
    }

    public CallStartContext(Map map) {
        map.getClass();
        this.contexts = map;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CallStartContext{contexts=");
        return C66582MXn.A0v(this.contexts, A1A);
    }
}

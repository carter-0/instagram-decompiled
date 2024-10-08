package com.facebook.neko.directinstall.digitalturbine;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C16705V2i;
import X.C20494Wsa;
import X.C255463uA;
import X.VJ6;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class DTGenericErrorResponse extends AnonymousClass0T0 {
    public static final Companion Companion = new Object();
    public final DTGenericError A00;

    public final class Companion {
        public final C255463uA serializer() {
            return C20494Wsa.A00;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof DTGenericErrorResponse) && 0qQ.A0K(this.A00, ((DTGenericErrorResponse) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ DTGenericErrorResponse(DTGenericError dTGenericError, int i) {
        if (1 != (i & 1)) {
            VJ6.A00(C20494Wsa.A01, i, 1);
            throw AnonymousClass00P.createAndThrow();
        } else {
            this.A00 = dTGenericError;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DTGenericErrorResponse(data=");
        return AnonymousClass7TG.A0n(this.A00, sb);
    }
}

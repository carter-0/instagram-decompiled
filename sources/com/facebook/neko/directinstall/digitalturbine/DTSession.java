package com.facebook.neko.directinstall.digitalturbine;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0T0;
import X.C16705V2i;
import X.C20498Wse;
import X.C255463uA;
import X.G9w;
import X.VJ6;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class DTSession extends AnonymousClass0T0 {
    public static final Companion Companion = new Object();
    public final String A00;

    public final class Companion {
        public final C255463uA serializer() {
            return C20498Wse.A00;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof DTSession) && 0qQ.A0K(this.A00, ((DTSession) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ DTSession(String str, int i) {
        if (1 != (i & 1)) {
            VJ6.A00(C20498Wse.A01, i, 1);
            throw AnonymousClass00P.createAndThrow();
        } else {
            this.A00 = str;
        }
    }

    public final String toString() {
        return G9w.A0k("DTSession(token=", this.A00);
    }
}

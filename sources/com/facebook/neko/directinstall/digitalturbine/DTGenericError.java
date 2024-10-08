package com.facebook.neko.directinstall.digitalturbine;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0T0;
import X.C16705V2i;
import X.C20493WsZ;
import X.C255463uA;
import X.C41845B3m;
import X.C51975G9x;
import X.VJ6;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class DTGenericError extends AnonymousClass0T0 {
    public static final Companion Companion = new Object();
    public final int A00;
    public final String A01;

    public final class Companion {
        public final C255463uA serializer() {
            return C20493WsZ.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DTGenericError) {
                DTGenericError dTGenericError = (DTGenericError) obj;
                if (this.A00 != dTGenericError.A00 || !0qQ.A0K(this.A01, dTGenericError.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ DTGenericError(String str, int i, int i2) {
        if (3 != (i & 3)) {
            VJ6.A00(C20493WsZ.A01, i, 3);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A00 = i2;
        this.A01 = str;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, this.A00 * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DTGenericError(code=");
        sb.append(this.A00);
        sb.append(", message=");
        return C51975G9x.A0i(this.A01, sb);
    }
}

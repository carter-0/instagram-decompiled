package com.facebook.neko.directinstall.digitalturbine;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C16705V2i;
import X.C20491WsX;
import X.C255463uA;
import X.C51975G9x;
import X.VJ6;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class DTApplicationRequest extends AnonymousClass0T0 {
    public static final Companion Companion = new Object();
    public final DTApplication A00;
    public final String A01;

    public final class Companion {
        public final C255463uA serializer() {
            return C20491WsX.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DTApplicationRequest) {
                DTApplicationRequest dTApplicationRequest = (DTApplicationRequest) obj;
                if (!0qQ.A0K(this.A00, dTApplicationRequest.A00) || !0qQ.A0K(this.A01, dTApplicationRequest.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ DTApplicationRequest(DTApplication dTApplication, String str, int i) {
        if (1 != (i & 1)) {
            VJ6.A00(C20491WsX.A01, i, 1);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A00 = dTApplication;
        if ((i & 2) != 0) {
            this.A01 = str;
        }
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0E(this.A01);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DTApplicationRequest(data=");
        sb.append(this.A00);
        sb.append(", taskId=");
        return C51975G9x.A0i(this.A01, sb);
    }
}

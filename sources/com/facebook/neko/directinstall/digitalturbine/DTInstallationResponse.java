package com.facebook.neko.directinstall.digitalturbine;

import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C16705V2i;
import X.C20497Wsd;
import X.C255463uA;
import X.VJ6;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class DTInstallationResponse extends AnonymousClass0T0 {
    public static final Companion Companion = new Object();
    public final DTApplication A00;
    public final String A01;

    public final class Companion {
        public final C255463uA serializer() {
            return C20497Wsd.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DTInstallationResponse) {
                DTInstallationResponse dTInstallationResponse = (DTInstallationResponse) obj;
                if (!0qQ.A0K(this.A01, dTInstallationResponse.A01) || !0qQ.A0K(this.A00, dTInstallationResponse.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ DTInstallationResponse(DTApplication dTApplication, String str, int i) {
        if (3 != (i & 3)) {
            VJ6.A00(C20497Wsd.A01, i, 3);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = str;
        this.A00 = dTApplication;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DTInstallationResponse(taskId=");
        sb.append(this.A01);
        sb.append(AnonymousClass000.A00(399));
        return AnonymousClass7TG.A0n(this.A00, sb);
    }
}

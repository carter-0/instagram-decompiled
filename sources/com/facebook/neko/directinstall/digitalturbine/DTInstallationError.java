package com.facebook.neko.directinstall.digitalturbine;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C16705V2i;
import X.C20495Wsb;
import X.C255463uA;
import X.VJ6;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class DTInstallationError extends AnonymousClass0T0 {
    public static final Companion Companion = new Object();
    public final int A00;
    public final DTApplication A01;
    public final String A02;

    public final class Companion {
        public final C255463uA serializer() {
            return C20495Wsb.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DTInstallationError) {
                DTInstallationError dTInstallationError = (DTInstallationError) obj;
                if (this.A00 != dTInstallationError.A00 || !0qQ.A0K(this.A02, dTInstallationError.A02) || !0qQ.A0K(this.A01, dTInstallationError.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ DTInstallationError(DTApplication dTApplication, String str, int i, int i2) {
        if (3 != (i & 3)) {
            VJ6.A00(C20495Wsb.A01, i, 3);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A00 = i2;
        this.A02 = str;
        if ((i & 4) != 0) {
            this.A01 = dTApplication;
        }
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A02, this.A00 * 31) + AnonymousClass7TG.A0C(this.A01);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DTInstallationError(code=");
        sb.append(this.A00);
        sb.append(", message=");
        sb.append(this.A02);
        sb.append(", application=");
        return AnonymousClass7TG.A0n(this.A01, sb);
    }
}

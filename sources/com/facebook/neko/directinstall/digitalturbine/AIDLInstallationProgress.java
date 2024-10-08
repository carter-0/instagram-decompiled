package com.facebook.neko.directinstall.digitalturbine;

import X.AnonymousClass00P;
import X.AnonymousClass0T0;
import X.C16705V2i;
import X.C20489WsV;
import X.C255463uA;
import X.C51968G9o;
import X.C51975G9x;
import X.VJ6;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class AIDLInstallationProgress extends AnonymousClass0T0 {
    public static final Companion Companion = new Object();
    public final double A00;
    public final int A01;
    public final int A02;

    public final class Companion {
        public final C255463uA serializer() {
            return C20489WsV.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AIDLInstallationProgress) {
                AIDLInstallationProgress aIDLInstallationProgress = (AIDLInstallationProgress) obj;
                if (!(Double.compare(this.A00, aIDLInstallationProgress.A00) == 0 && this.A01 == aIDLInstallationProgress.A01 && this.A02 == aIDLInstallationProgress.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ AIDLInstallationProgress(double d, int i, int i2, int i3) {
        if (3 != (i & 3)) {
            VJ6.A00(C20489WsV.A01, i, 3);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A00 = d;
        this.A01 = i2;
        if ((i & 4) != 0) {
            this.A02 = i3;
        }
    }

    public final int hashCode() {
        return (((C51968G9o.A03(Double.doubleToLongBits(this.A00)) * 31) + this.A01) * 31) + this.A02;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AIDLInstallationProgress(value=");
        sb.append(this.A00);
        sb.append(", action=");
        sb.append(this.A01);
        sb.append(", status=");
        return C51975G9x.A0j(sb, this.A02);
    }
}

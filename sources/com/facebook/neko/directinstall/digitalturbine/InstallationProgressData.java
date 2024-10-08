package com.facebook.neko.directinstall.digitalturbine;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.C16705V2i;
import X.C20501Wsh;
import X.C255463uA;
import X.C41845B3m;
import X.C51975G9x;
import X.VJ6;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class InstallationProgressData extends AnonymousClass0T0 {
    public static final Companion Companion = new Object();
    public final double A00;
    public final int A01;
    public final InstallationProgress A02;
    public final String A03;

    public final class Companion {
        public final C255463uA serializer() {
            return C20501Wsh.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InstallationProgressData) {
                InstallationProgressData installationProgressData = (InstallationProgressData) obj;
                if (!0qQ.A0K(this.A02, installationProgressData.A02) || !0qQ.A0K(this.A03, installationProgressData.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ InstallationProgressData(InstallationProgress installationProgress, String str, double d, int i, int i2) {
        if (3 != (i & 3)) {
            VJ6.A00(C20501Wsh.A01, i, 3);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A02 = installationProgress;
        this.A03 = str;
        if ((i & 4) == 0) {
            this.A00 = installationProgress.A00.A00;
        } else {
            this.A00 = d;
        }
        if ((i & 8) == 0) {
            this.A01 = installationProgress.A00.A01;
        } else {
            this.A01 = i2;
        }
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A03, AnonymousClass7TE.A0K(this.A02));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InstallationProgressData(data=");
        sb.append(this.A02);
        sb.append(", taskId=");
        return C51975G9x.A0i(this.A03, sb);
    }
}

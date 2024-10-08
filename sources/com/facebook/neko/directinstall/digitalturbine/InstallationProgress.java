package com.facebook.neko.directinstall.digitalturbine;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C16705V2i;
import X.C20500Wsg;
import X.C255463uA;
import X.VJ6;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class InstallationProgress extends AnonymousClass0T0 {
    public static final Companion Companion = new Object();
    public final AIDLInstallationProgress A00;
    public final DTApplication A01;

    public final class Companion {
        public final C255463uA serializer() {
            return C20500Wsg.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InstallationProgress) {
                InstallationProgress installationProgress = (InstallationProgress) obj;
                if (!0qQ.A0K(this.A00, installationProgress.A00) || !0qQ.A0K(this.A01, installationProgress.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ InstallationProgress(AIDLInstallationProgress aIDLInstallationProgress, DTApplication dTApplication, int i) {
        if (3 != (i & 3)) {
            VJ6.A00(C20500Wsg.A01, i, 3);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A00 = aIDLInstallationProgress;
        this.A01 = dTApplication;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InstallationProgress(progress=");
        sb.append(this.A00);
        sb.append(", application=");
        return AnonymousClass7TG.A0n(this.A01, sb);
    }
}

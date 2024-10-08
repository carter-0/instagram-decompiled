package com.instagram.debug.devoptions.sandboxselector;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.DbS;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Sandbox extends AnonymousClass0T0 {
    public final String description;
    public final boolean supportsVpnless;
    public final SandboxType type;
    public final String url;

    public final String component1() {
        return this.url;
    }

    public final SandboxType component2() {
        return this.type;
    }

    public final String component3() {
        return this.description;
    }

    public final boolean component4() {
        return this.supportsVpnless;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Sandbox) {
                Sandbox sandbox = (Sandbox) obj;
                if (!0qQ.A0K(this.url, sandbox.url) || this.type != sandbox.type || !0qQ.A0K(this.description, sandbox.description) || this.supportsVpnless != sandbox.supportsVpnless) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        return super.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Sandbox(String str, SandboxType sandboxType, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, sandboxType, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? false : z);
    }

    public static /* synthetic */ Sandbox copy$default(Sandbox sandbox, String str, SandboxType sandboxType, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sandbox.url;
        }
        if ((i & 2) != 0) {
            sandboxType = sandbox.type;
        }
        if ((i & 4) != 0) {
            str2 = sandbox.description;
        }
        if ((i & 8) != 0) {
            z = sandbox.supportsVpnless;
        }
        AnonymousClass7TG.A1T(str, sandboxType, str2);
        return new Sandbox(str, sandboxType, str2, z);
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getSupportsVpnless() {
        return this.supportsVpnless;
    }

    public final SandboxType getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return DbS.A06(this.supportsVpnless, AnonymousClass7TF.A08(this.description, AnonymousClass7TF.A07(this.type, AnonymousClass7TE.A0O(this.url))));
    }

    public final Sandbox copy(String str, SandboxType sandboxType, String str2, boolean z) {
        AnonymousClass7TG.A1T(str, sandboxType, str2);
        return new Sandbox(str, sandboxType, str2, z);
    }

    public Sandbox(String str, SandboxType sandboxType, String str2, boolean z) {
        AnonymousClass7TG.A1U(str, sandboxType, str2);
        this.url = str;
        this.type = sandboxType;
        this.description = str2;
        this.supportsVpnless = z;
    }
}

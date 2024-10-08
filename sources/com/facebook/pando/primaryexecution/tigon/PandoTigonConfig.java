package com.facebook.pando.primaryexecution.tigon;

import X.0qQ;
import X.0sP;
import X.C41691Ayi;
import X.C62320sa;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PandoTigonConfig {
    public final boolean enableUnsetFieldRemoval;
    public final boolean failNetworkOnZeroTimeout;
    public final 0sP headers;
    public final C62320sa requestUrl;
    public final boolean shouldGzipCompressBody;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PandoTigonConfig(0sP r7, C62320sa r8, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C41691Ayi.A00 : r7, (i & 2) != 0 ? null : r8, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) == 0 ? z3 : false);
    }

    public final Map getHeaders(String str) {
        0qQ.A0B(str, 0);
        return (Map) this.headers.invoke(str);
    }

    public final boolean getEnableUnsetFieldRemoval() {
        return this.enableUnsetFieldRemoval;
    }

    public final boolean getFailNetworkOnZeroTimeout() {
        return this.failNetworkOnZeroTimeout;
    }

    public final String getRequestUrl() {
        C62320sa r0 = this.requestUrl;
        if (r0 != null) {
            return (String) r0.invoke();
        }
        return null;
    }

    public final boolean getShouldGzipCompressBody() {
        return this.shouldGzipCompressBody;
    }

    public PandoTigonConfig(0sP r2, C62320sa r3, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(r2, 1);
        this.headers = r2;
        this.requestUrl = r3;
        this.failNetworkOnZeroTimeout = z;
        this.enableUnsetFieldRemoval = z2;
        this.shouldGzipCompressBody = z3;
    }

    public PandoTigonConfig() {
        this(C41691Ayi.A00, (C62320sa) null, false, false, false);
    }
}

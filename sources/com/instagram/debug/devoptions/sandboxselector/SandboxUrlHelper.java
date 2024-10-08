package com.instagram.debug.devoptions.sandboxselector;

import X.0qQ;
import X.1Ma;

public final class SandboxUrlHelper {
    public final String getParsedHostLoggingServerUrl(String str) {
        0qQ.A0B(str, 0);
        String A04 = 1Ma.A04(str);
        0qQ.A07(A04);
        return A04;
    }

    public final String getParsedHostServerUrl(String str) {
        0qQ.A0B(str, 0);
        String A05 = 1Ma.A05(str);
        0qQ.A07(A05);
        return A05;
    }

    public final String getDefaultInstagramHost() {
        return "i.instagram.com";
    }

    public final void clearCachedDevServerSetting() {
        1Ma.A07();
    }
}

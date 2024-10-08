package X;

import com.facebook.messenger.mcp.integration.MCPPluginsRegistryIntegration;

/* renamed from: X.5ws  reason: invalid class name and case insensitive filesystem */
public final class C300295ws implements Runnable {
    public static final C300295ws A00 = new C300295ws();

    public final void run() {
        MCPPluginsRegistryIntegration.nativePreregisterMCPPluginsRegistry();
    }
}

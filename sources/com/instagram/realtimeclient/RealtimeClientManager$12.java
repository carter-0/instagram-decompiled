package com.instagram.realtimeclient;

import com.facebook.messenger.mcp.integration.MCPPluginsRegistryIntegration;

public class RealtimeClientManager$12 implements Runnable {
    public final /* synthetic */ RealtimeClientManager this$0;

    public RealtimeClientManager$12(RealtimeClientManager realtimeClientManager) {
        this.this$0 = realtimeClientManager;
    }

    public void run() {
        MCPPluginsRegistryIntegration.nativePreregisterMCPPluginsRegistry();
    }
}

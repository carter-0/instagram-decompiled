package com.android.webview.chromium.membrane;

public interface AppHostedWebViewFactoryProvider {
    boolean hasActiveChildConnections();

    boolean hasSpareChildConnection(boolean z);

    boolean hasStarted();

    void initChildProcessRequirements(Runnable runnable);
}

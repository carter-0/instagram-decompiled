package com.android.webview.chromium.membrane;

public interface WebViewProviderInitListener {
    void onProfileClobbered();

    void onProfileMerged();

    void onProfileMigrated();
}

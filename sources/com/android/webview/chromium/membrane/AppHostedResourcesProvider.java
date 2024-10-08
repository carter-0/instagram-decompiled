package com.android.webview.chromium.membrane;

import android.content.res.Resources;

public interface AppHostedResourcesProvider {
    String getPathToAssetZip();

    Resources getResourcesOverride();
}

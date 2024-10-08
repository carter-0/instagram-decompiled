package com.android.webview.chromium.membrane;

import android.net.Uri;

public interface AppHostedShareDelegate {

    public interface ShareResultCallback {
        void onResult(ShareResult shareResult);
    }

    void onShare(String str, String str2, Uri uri, ShareResultCallback shareResultCallback);

    public enum ShareResult {
        OK(0),
        INTERNAL_ERROR(1),
        PERMISSION_DENIED(2),
        CANCELLED(3);
        
        public final int value;

        /* access modifiers changed from: public */
        ShareResult(int i) {
            this.value = i;
        }
    }
}

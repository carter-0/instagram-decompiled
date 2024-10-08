package com.instagram.direct.msys.plugins.mcidberrorhandlerplugin;

import X.0qQ;
import com.facebook.msys.mcf.MsysError;
import com.instagram.direct.msys.plugins.mcidberrorhandlerplugin.IGDirectAndroidMCIDBErrorPluginCallbacks;

public final class IGDirectAndroidMCIDBErrorPluginSessionless extends Sessionless {
    public void IGDirectAndroidMCIDBErrorSessionlessImpl_MCIDBErrorHandlerHandleDBOpenFailure(int i, MsysError msysError, IGDirectAndroidMCIDBErrorPluginCallbacks.MCIDBErrorHandlerCompletionCallback mCIDBErrorHandlerCompletionCallback) {
        0qQ.A0B(mCIDBErrorHandlerCompletionCallback, 2);
        mCIDBErrorHandlerCompletionCallback.run(true);
    }
}
